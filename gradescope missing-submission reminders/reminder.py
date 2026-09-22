#!/usr/bin/env python3
"""Check configured Gradescope homework and send policy-aware reminders."""

from __future__ import annotations

import argparse
import csv
import fcntl
import html
import io
import json
import os
import re
import sqlite3
import subprocess
import sys
import tempfile
import tomllib
from contextlib import contextmanager
from dataclasses import dataclass
from datetime import datetime, timedelta
from pathlib import Path
from types import SimpleNamespace
from urllib.parse import urlparse
from zoneinfo import ZoneInfo

from gradescopeapi.classes.connection import GSConnection
from gradescopeapi.classes.account import Account
from bs4 import BeautifulSoup
from requests.cookies import RequestsCookieJar, create_cookie
from requests import exceptions as requests_exceptions

from auth_check import create_account, secure_token_cache


PROJECT_DIR = Path(__file__).resolve().parent
CONFIG_PATH = PROJECT_DIR / "config.local.toml"
AUTH_BACKOFF_MINUTES = 5
AUTH_BACKOFF_MAX_MINUTES = 360


class GradescopeAuthenticationExpired(RuntimeError):
    """The persisted Gradescope session is no longer authenticated."""


class GradescopeAuthenticationBackoff(RuntimeError):
    """A fresh login is temporarily suppressed after authentication failures."""


def state_dir() -> Path:
    if os.environ.get("GRADESCOPE_REMINDER_STATE_DIR"):
        return Path(os.environ["GRADESCOPE_REMINDER_STATE_DIR"])
    if sys.platform == "darwin":
        return Path.home() / "Library" / "Application Support" / "Gradescope Reminder"
    return Path(os.environ.get("XDG_STATE_HOME", Path.home() / ".local" / "state")) / "gradescope-reminder"


@dataclass(frozen=True)
class Student:
    first_name: str
    last_name: str
    email: str


@dataclass(frozen=True)
class LateSubmission:
    student_key: str
    sid: str
    first_name: str
    last_name: str
    email: str
    submitted_at: str
    lateness_seconds: int


def load_config() -> dict:
    if not CONFIG_PATH.exists():
        raise RuntimeError("config.local.toml is missing")
    with CONFIG_PATH.open("rb") as handle:
        config = tomllib.load(handle)
    if not config.get("courses"):
        raise RuntimeError("No [[courses]] are configured")
    return config


def additional_recipients_active(course: dict, current: datetime | None) -> bool:
    """Return whether temporary course recipients are still active."""
    end_date = course.get("additional_email_end_date")
    return end_date is None or current is None or current.date() <= end_date


def report_recipients(
    config: dict, course: dict, current: datetime | None = None
) -> list[str]:
    """Return unique owner and course-specific report recipients."""
    recipients = [config["delivery"]["summary_email"]]
    if additional_recipients_active(course, current):
        recipients.extend(course.get("additional_report_emails", []))
    unique = []
    seen = set()
    for recipient in recipients:
        address = str(recipient).strip()
        if address and address.casefold() not in seen:
            unique.append(address)
            seen.add(address.casefold())
    return unique


def late_report_recipients(
    config: dict, course: dict, current: datetime | None = None
) -> list[str]:
    """Return report recipients plus recipients limited to late CSV reports."""
    recipients = report_recipients(config, course, current)
    if additional_recipients_active(course, current):
        recipients.extend(course.get("additional_late_report_emails", []))
    unique = []
    seen = set()
    for recipient in recipients:
        address = str(recipient).strip()
        if address and address.casefold() not in seen:
            unique.append(address)
            seen.add(address.casefold())
    return unique


def read_gradescope_password(settings: dict) -> str:
    env_name = str(settings.get("password_env", "")).strip()
    if env_name and os.environ.get(env_name):
        return os.environ[env_name]
    if sys.platform != "darwin":
        raise RuntimeError(f"Set {env_name or 'GRADESCOPE_REMINDER_PASSWORD'} on this system")
    result = subprocess.run(
        [
            "/usr/bin/security", "find-generic-password", "-a", settings["email"],
            "-s", settings["keychain_service"], "-w",
        ],
        check=False, capture_output=True, text=True,
    )
    password = result.stdout.rstrip("\n")
    if result.returncode or not password:
        raise RuntimeError("Gradescope password was not found in macOS Keychain")
    return password


def open_database() -> sqlite3.Connection:
    directory = state_dir()
    directory.mkdir(parents=True, exist_ok=True, mode=0o700)
    path = directory / "reminders.sqlite3"
    database = sqlite3.connect(path)
    database.execute(
        """CREATE TABLE IF NOT EXISTS reminders (
        course_id TEXT NOT NULL, assignment_id TEXT NOT NULL, email TEXT NOT NULL,
        sent_at TEXT NOT NULL, PRIMARY KEY (course_id, assignment_id, email))"""
    )
    database.execute(
        """CREATE TABLE IF NOT EXISTS completed_runs (
        course_id TEXT NOT NULL, assignment_id TEXT NOT NULL, completed_at TEXT NOT NULL,
        PRIMARY KEY (course_id, assignment_id))"""
    )
    database.execute(
        """CREATE TABLE IF NOT EXISTS assignment_schedules (
        course_id TEXT NOT NULL, assignment_id TEXT NOT NULL,
        due_at TEXT NOT NULL, late_at TEXT NOT NULL, observed_at TEXT NOT NULL,
        PRIMARY KEY (course_id, assignment_id))"""
    )
    database.execute(
        """CREATE TABLE IF NOT EXISTS authentication_state (
        provider TEXT PRIMARY KEY, consecutive_failures INTEGER NOT NULL,
        retry_after TEXT NOT NULL, last_error TEXT NOT NULL)"""
    )
    database.execute(
        """CREATE TABLE IF NOT EXISTS late_submissions (
        course_id TEXT NOT NULL, assignment_id TEXT NOT NULL,
        student_key TEXT NOT NULL, sid TEXT NOT NULL,
        first_name TEXT NOT NULL, last_name TEXT NOT NULL, email TEXT NOT NULL,
        submitted_at TEXT NOT NULL, lateness_seconds INTEGER NOT NULL,
        recorded_at TEXT NOT NULL,
        PRIMARY KEY (course_id, assignment_id, student_key))"""
    )
    database.execute(
        """CREATE TABLE IF NOT EXISTS late_reports (
        course_id TEXT NOT NULL, assignment_id TEXT NOT NULL, sent_at TEXT NOT NULL,
        PRIMARY KEY (course_id, assignment_id))"""
    )
    database.execute(
        """CREATE TABLE IF NOT EXISTS configuration_notices (
        notice_key TEXT PRIMARY KEY, sent_at TEXT NOT NULL)"""
    )
    database.execute(
        """CREATE TABLE IF NOT EXISTS weekly_backchecks (
        week_key TEXT PRIMARY KEY, sent_at TEXT NOT NULL,
        assignments_checked INTEGER NOT NULL, additions_found INTEGER NOT NULL)"""
    )
    database.execute(
        """CREATE TABLE IF NOT EXISTS late_allowance_notices (
        course_id TEXT NOT NULL, student_key TEXT NOT NULL,
        email TEXT NOT NULL, first_name TEXT NOT NULL, last_name TEXT NOT NULL,
        assignment_id TEXT NOT NULL, assignment_name TEXT NOT NULL,
        total_lates INTEGER NOT NULL, status TEXT NOT NULL,
        created_at TEXT NOT NULL, sent_at TEXT, last_error TEXT NOT NULL,
        retroactive INTEGER NOT NULL DEFAULT 0,
        PRIMARY KEY (course_id, student_key))"""
    )
    notice_columns = {
        row[1] for row in database.execute("PRAGMA table_info(late_allowance_notices)")
    }
    if "retroactive" not in notice_columns:
        database.execute(
            """ALTER TABLE late_allowance_notices
            ADD COLUMN retroactive INTEGER NOT NULL DEFAULT 0"""
        )
    database.commit()
    path.chmod(0o600)
    return database


@contextmanager
def run_lock():
    """Hold a non-blocking process lock shared by all Gradescope routines."""
    directory = state_dir()
    directory.mkdir(parents=True, exist_ok=True, mode=0o700)
    path = directory / "run.lock"
    with path.open("a+") as handle:
        path.chmod(0o600)
        try:
            fcntl.flock(handle, fcntl.LOCK_EX | fcntl.LOCK_NB)
        except BlockingIOError:
            yield False
            return
        try:
            yield True
        finally:
            fcntl.flock(handle, fcntl.LOCK_UN)


class PersistentGradescopeConnection:
    """Reuse a cookie-backed Gradescope session and reauthenticate on expiry."""

    def __init__(self, settings: dict, database: sqlite3.Connection, now: datetime):
        self.settings = settings
        self.database = database
        self.now = now
        self.cookie_path = state_dir() / "gradescope_cookies.json"
        self.connection = GSConnection()
        self._checking_auth = True
        self._install_cookie_jar()
        self.connection.session.hooks["response"].append(self._detect_expiration)
        if not self.connection.session.cookies:
            self._authenticate()
        else:
            self.connection.logged_in = True
            self.connection.account = Account(
                self.connection.session, self.connection.gradescope_base_url
            )

    def _install_cookie_jar(self) -> None:
        jar = RequestsCookieJar()
        if self.cookie_path.exists():
            try:
                for item in json.loads(self.cookie_path.read_text()):
                    jar.set_cookie(create_cookie(**item))
            except (OSError, TypeError, ValueError, json.JSONDecodeError):
                pass
        self.connection.session.cookies = jar

    def _detect_expiration(self, response, *args, **kwargs):
        if not self._checking_auth:
            return response
        path = urlparse(response.url).path.rstrip("/")
        redirected_to_login = path == "/login" or any(
            urlparse(item.headers.get("Location", "")).path.rstrip("/") == "/login"
            for item in response.history
        )
        if response.status_code == 401 or redirected_to_login:
            raise GradescopeAuthenticationExpired("Gradescope session expired")
        return response

    def _backoff_until(self) -> datetime | None:
        row = self.database.execute(
            "SELECT retry_after FROM authentication_state WHERE provider='gradescope'"
        ).fetchone()
        return datetime.fromisoformat(row[0]) if row else None

    def _record_auth_failure(self, error: Exception) -> None:
        row = self.database.execute(
            "SELECT consecutive_failures FROM authentication_state WHERE provider='gradescope'"
        ).fetchone()
        failures = (int(row[0]) if row else 0) + 1
        minutes = min(
            AUTH_BACKOFF_MINUTES * (2 ** (failures - 1)), AUTH_BACKOFF_MAX_MINUTES
        )
        retry_after = self.now + timedelta(minutes=minutes)
        self.database.execute(
            """INSERT INTO authentication_state VALUES ('gradescope', ?, ?, ?)
            ON CONFLICT(provider) DO UPDATE SET
            consecutive_failures=excluded.consecutive_failures,
            retry_after=excluded.retry_after, last_error=excluded.last_error""",
            (failures, retry_after.isoformat(), str(error)),
        )
        self.database.commit()

    def _authenticate(self) -> None:
        retry_after = self._backoff_until()
        if retry_after and self.now < retry_after:
            raise GradescopeAuthenticationBackoff(
                f"Gradescope login backoff is active until {retry_after.isoformat()}"
            )
        self.connection = GSConnection()
        self._install_cookie_jar()
        self.connection.session.hooks["response"].append(self._detect_expiration)
        self._checking_auth = False
        try:
            self.connection.login(
                self.settings["email"], read_gradescope_password(self.settings)
            )
        except Exception as exc:
            self._record_auth_failure(exc)
            raise RuntimeError(f"Gradescope authentication failed: {exc}") from exc
        finally:
            self._checking_auth = True
        self.database.execute(
            "DELETE FROM authentication_state WHERE provider='gradescope'"
        )
        self.database.commit()
        self.save()

    def _refresh_after_expiration(self) -> None:
        if self.cookie_path.exists():
            self.cookie_path.unlink()
        self._authenticate()

    def call(self, operation, *args, **kwargs):
        try:
            return operation(self.connection, *args, **kwargs)
        except GradescopeAuthenticationExpired:
            self._refresh_after_expiration()
            return operation(self.connection, *args, **kwargs)

    def get_assignments(self, course_id: str):
        return self.call(
            lambda connection: connection.account.get_assignments(course_id)
        )

    def get(self, url: str, **kwargs):
        return self.call(lambda connection: connection.session.get(url, **kwargs))

    def save(self) -> None:
        self.cookie_path.parent.mkdir(parents=True, exist_ok=True, mode=0o700)
        cookies = [
            {
                "name": cookie.name,
                "value": cookie.value,
                "domain": cookie.domain,
                "path": cookie.path,
                "secure": cookie.secure,
                "expires": cookie.expires,
                "rest": cookie._rest,
            }
            for cookie in self.connection.session.cookies
            if cookie.expires is None or cookie.expires > self.now.timestamp()
        ]
        temporary = self.cookie_path.with_suffix(".tmp")
        temporary.write_text(json.dumps(cookies))
        temporary.chmod(0o600)
        temporary.replace(self.cookie_path)
        self.cookie_path.chmod(0o600)


def localize(value: datetime | None, timezone: ZoneInfo) -> datetime | None:
    if value is None:
        return None
    return value.replace(tzinfo=timezone) if value.tzinfo is None else value.astimezone(timezone)


def display_time(value: datetime) -> str:
    return value.strftime("%A, %B %-d at %-I:%M %p %Z")


def effective_late_deadline(assignment, timezone: ZoneInfo, late_hours: int) -> datetime:
    due = localize(assignment.due_date, timezone)
    policy_deadline = due + timedelta(hours=late_hours)
    gradescope_deadline = localize(assignment.late_due_date, timezone)
    return min(policy_deadline, gradescope_deadline) if gradescope_deadline else policy_deadline


def late_report_ready(current: datetime, late_deadline: datetime, schedule: dict) -> bool:
    """Wait briefly after close so Gradescope can finalize badges and exports."""
    delay = timedelta(minutes=int(schedule.get("late_report_delay_minutes", 10)))
    return current >= late_deadline + delay


def sync_assignment_schedule(
    database: sqlite3.Connection,
    course_id: str,
    assignment_id: str,
    due: datetime,
    late: datetime,
    observed_at: datetime,
) -> bool:
    """Record current deadlines and reopen a completed run when they change."""
    previous = database.execute(
        "SELECT due_at, late_at FROM assignment_schedules WHERE course_id=? AND assignment_id=?",
        (course_id, assignment_id),
    ).fetchone()
    current = (due.isoformat(), late.isoformat())
    changed = previous is not None and tuple(previous) != current
    database.execute(
        """INSERT INTO assignment_schedules VALUES (?, ?, ?, ?, ?)
        ON CONFLICT(course_id, assignment_id) DO UPDATE SET
        due_at=excluded.due_at, late_at=excluded.late_at, observed_at=excluded.observed_at""",
        (course_id, assignment_id, current[0], current[1], observed_at.isoformat()),
    )
    if changed:
        database.execute(
            "DELETE FROM completed_runs WHERE course_id=? AND assignment_id=?",
            (course_id, assignment_id),
        )
        database.execute(
            "DELETE FROM late_reports WHERE course_id=? AND assignment_id=?",
            (course_id, assignment_id),
        )
        database.execute(
            "DELETE FROM late_submissions WHERE course_id=? AND assignment_id=?",
            (course_id, assignment_id),
        )
    database.commit()
    return changed


def missing_students(connection: PersistentGradescopeConnection, course_id: str, assignment_id: str) -> list[Student]:
    url = f"{connection.connection.gradescope_base_url}/courses/{course_id}/assignments/{assignment_id}/scores.csv"
    response = connection.get(url, timeout=30)
    response.raise_for_status()
    reader = csv.DictReader(io.StringIO(response.text.lstrip("\ufeff")))
    required = {"First Name", "Last Name", "Email", "Status"}
    if not reader.fieldnames or not required.issubset(reader.fieldnames):
        raise RuntimeError(f"Unexpected Gradescope CSV columns for assignment {assignment_id}")
    missing = []
    for row in reader:
        if row["Status"].strip().casefold() != "missing":
            continue
        email = row["Email"].strip()
        if email:
            missing.append(Student(row["First Name"].strip(), row["Last Name"].strip(), email))
    return missing


def parse_lateness(value: str | None) -> int:
    """Convert Gradescope's H:M:S lateness value to whole seconds."""
    if not value:
        return 0
    parts = value.strip().split(":")
    if len(parts) != 3:
        raise RuntimeError(f"Unexpected Gradescope lateness value: {value!r}")
    try:
        hours, minutes, seconds = (int(part) for part in parts)
    except ValueError as exc:
        raise RuntimeError(f"Unexpected Gradescope lateness value: {value!r}") from exc
    return hours * 3600 + minutes * 60 + seconds


def late_submissions(
    connection: PersistentGradescopeConnection,
    course_id: str,
    assignment_id: str,
    late_hours: int,
) -> list[LateSubmission]:
    """Return submissions that Gradescope itself marks with its Late badge."""
    review_url = (
        f"{connection.connection.gradescope_base_url}/courses/{course_id}/"
        f"assignments/{assignment_id}/review_grades"
    )
    review_response = connection.get(review_url, timeout=30)
    review_response.raise_for_status()
    review_page = BeautifulSoup(review_response.text, "html.parser")
    late_submission_ids = set()
    for badge in review_page.select(".lateSubmissionBadge"):
        row = badge.find_parent("tr")
        if row is None:
            continue
        for link in row.find_all("a", href=True):
            match = re.search(r"/submissions/(\d+)(?:$|[/?#])", link["href"])
            if match:
                late_submission_ids.add(match.group(1))
                break

    url = (
        f"{connection.connection.gradescope_base_url}/courses/{course_id}/"
        f"assignments/{assignment_id}/scores.csv"
    )
    response = connection.get(url, timeout=30)
    response.raise_for_status()
    reader = csv.DictReader(io.StringIO(response.text.lstrip("\ufeff")))
    required = {
        "First Name", "Last Name", "SID", "Email", "Status",
        "Submission ID", "Submission Time", "Lateness (H:M:S)",
    }
    if not reader.fieldnames or not required.issubset(reader.fieldnames):
        raise RuntimeError(f"Unexpected Gradescope CSV columns for assignment {assignment_id}")
    result = []
    for row in reader:
        if row["Status"].strip().casefold() == "missing":
            continue
        submission_id = (row.get("Submission ID") or "").strip()
        if submission_id not in late_submission_ids:
            continue
        seconds = parse_lateness(row.get("Lateness (H:M:S)"))
        if seconds <= 0:
            continue
        sid = (row.get("SID") or "").strip()
        email = (row.get("Email") or "").strip()
        student_key = f"sid:{sid.casefold()}" if sid else f"email:{email.casefold()}"
        if not sid and not email:
            continue
        result.append(
            LateSubmission(
                student_key, sid, row["First Name"].strip(), row["Last Name"].strip(),
                email, (row.get("Submission Time") or "").strip(), seconds,
            )
        )
    return result


def record_late_submissions(
    database: sqlite3.Connection,
    course_id: str,
    assignment_id: str,
    submissions: list[LateSubmission],
    recorded_at: datetime,
    commit: bool = True,
) -> None:
    database.execute(
        "DELETE FROM late_submissions WHERE course_id=? AND assignment_id=?",
        (course_id, assignment_id),
    )
    for item in submissions:
        database.execute(
            """INSERT INTO late_submissions VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
            ON CONFLICT(course_id, assignment_id, student_key) DO UPDATE SET
            sid=excluded.sid, first_name=excluded.first_name,
            last_name=excluded.last_name, email=excluded.email,
            submitted_at=excluded.submitted_at,
            lateness_seconds=excluded.lateness_seconds,
            recorded_at=excluded.recorded_at""",
            (
                course_id, assignment_id, item.student_key, item.sid,
                item.first_name, item.last_name, item.email, item.submitted_at,
                item.lateness_seconds, recorded_at.isoformat(),
            ),
        )
    if commit:
        database.commit()


def queue_late_allowance_notices(
    database: sqlite3.Connection,
    course: dict,
    assignment,
    submissions: list[LateSubmission],
    recorded_at: datetime,
) -> int:
    """Queue a one-time student notice upon reaching the course late limit."""
    allowed = int(course.get("allowed_late_submissions", 2))
    queued = 0
    for item in submissions:
        if not item.email:
            continue
        total = database.execute(
            """SELECT COUNT(*) FROM late_submissions
            WHERE course_id=? AND student_key=?""",
            (str(course["id"]), item.student_key),
        ).fetchone()[0]
        if total != allowed:
            continue
        cursor = database.execute(
            """INSERT OR IGNORE INTO late_allowance_notices (
            course_id, student_key, email, first_name, last_name,
            assignment_id, assignment_name, total_lates, status,
            created_at, sent_at, last_error, retroactive)
            VALUES (?, ?, ?, ?, ?, ?, ?, ?, 'pending', ?, NULL, '', 0)""",
            (
                str(course["id"]), item.student_key, item.email,
                item.first_name, item.last_name, assignment.assignment_id,
                assignment.name, total, recorded_at.isoformat(),
            ),
        )
        queued += cursor.rowcount
    return queued


def late_report_message(
    database: sqlite3.Connection,
    course: dict,
    assignment,
    due: datetime,
    late: datetime,
    current_submissions: list[LateSubmission],
) -> tuple[str, str, str]:
    rows = database.execute(
        """SELECT student_key, MAX(first_name), MAX(last_name), MAX(email), COUNT(*)
        FROM late_submissions WHERE course_id=?
        GROUP BY student_key ORDER BY COUNT(*) DESC, MAX(last_name), MAX(first_name)""",
        (str(course["id"]),),
    ).fetchall()
    totals_by_student = {student_key: count for student_key, *_details, count in rows}
    ordered_current_submissions = sorted(
        current_submissions,
        key=lambda item: (
            -totals_by_student.get(item.student_key, 0),
            item.last_name.casefold(),
            item.first_name.casefold(),
        ),
    )
    subject = f"Late-submission totals: {course['code']} — {assignment.name}"
    lines = [
        "Gradescope late-submission report", "",
        f"Course: {course['name']} ({course['term']})",
        f"Assignment closed: {assignment.name}",
        f"Regular deadline: {display_time(due)}",
        f"Late deadline: {display_time(late)}", "",
        f"Late submissions for this assignment: {len(current_submissions)}",
        f"Students with late submissions this semester: {len(rows)}", "",
        "Late on this assignment:",
    ]
    if current_submissions:
        for item in ordered_current_submissions:
            hours, remainder = divmod(item.lateness_seconds, 3600)
            minutes, seconds = divmod(remainder, 60)
            total = totals_by_student.get(item.student_key, 0)
            flag = " — REVIEW FOR ZERO" if total >= 3 else ""
            lines.append(
                f"- {item.first_name} {item.last_name} <{item.email}> "
                f"({hours:02d}:{minutes:02d}:{seconds:02d} late); "
                f"semester total: {total}{flag}"
            )
    else:
        lines.append("- None")
    lines.extend(["", "Semester running totals:"])
    if rows:
        for _key, first, last, email, count in rows:
            flag = " — ZERO-POLICY THRESHOLD EXCEEDED" if count >= 3 else ""
            lines.append(f"- {first} {last} <{email}>: {count}{flag}")
    else:
        lines.append("- None")
    body = "\n".join(lines) + "\n"
    table_rows = "".join(
        f'<tr><td style="padding:10px 8px;border-bottom:1px solid #e4e8ed;font-size:14px;">{html.escape(first + " " + last)}<br><span style="color:#687687;">{html.escape(email)}</span></td>'
        f'<td align="center" style="padding:10px 8px;border-bottom:1px solid #e4e8ed;font-size:18px;font-weight:750;color:{"#a12622" if count >= 3 else "#243142"};">{count}</td>'
        f'<td style="padding:10px 8px;border-bottom:1px solid #e4e8ed;font-size:12px;font-weight:700;color:#a12622;">{"REVIEW FOR ZERO" if count >= 3 else ""}</td></tr>'
        for _key, first, last, email, count in rows
    ) or '<tr><td colspan="3" style="padding:14px;color:#687687;">No late submissions recorded.</td></tr>'
    current_rows = "".join(
        f'<tr><td style="padding:9px 8px;border-bottom:1px solid #e4e8ed;font-size:14px;">{html.escape(item.first_name + " " + item.last_name)}<br><span style="color:#687687;">{html.escape(item.email)}</span></td>'
        f'<td style="padding:9px 8px;border-bottom:1px solid #e4e8ed;font-size:13px;white-space:nowrap;">{item.lateness_seconds // 3600:02d}:{(item.lateness_seconds % 3600) // 60:02d}:{item.lateness_seconds % 60:02d}</td>'
        f'<td align="center" style="padding:9px 8px;border-bottom:1px solid #e4e8ed;font-size:17px;font-weight:750;color:{"#a12622" if totals_by_student.get(item.student_key, 0) >= 3 else "#243142"};">{totals_by_student.get(item.student_key, 0)}</td>'
        f'<td style="padding:9px 8px;border-bottom:1px solid #e4e8ed;font-size:11px;font-weight:750;color:#a12622;">{"REVIEW FOR ZERO" if totals_by_student.get(item.student_key, 0) >= 3 else ""}</td></tr>'
        for item in ordered_current_submissions
    ) or '<tr><td colspan="4" style="padding:14px;color:#687687;">No late submissions for this assignment.</td></tr>'
    content = f"""
<table role="presentation" width="100%" cellspacing="0" cellpadding="0" style="font-size:14px;line-height:21px;margin-bottom:20px;">
<tr><td style="color:#687687;width:145px;padding:3px 0;">Assignment closed</td><td style="font-weight:650;padding:3px 0;">{html.escape(assignment.name)}</td></tr>
<tr><td style="color:#687687;padding:3px 0;">Regular deadline</td><td style="padding:3px 0;">{html.escape(display_time(due))}</td></tr>
<tr><td style="color:#687687;padding:3px 0;">Late deadline</td><td style="padding:3px 0;">{html.escape(display_time(late))}</td></tr>
</table>
<div style="background:#f7f8fa;border:1px solid #e1e5ea;border-radius:9px;padding:16px 18px;margin-bottom:22px;font-size:15px;line-height:23px;"><strong>{len(current_submissions)}</strong> late submission(s) for this assignment; <strong>{len(rows)}</strong> student(s) with a semester late-submission count.</div>
<div style="font-size:13px;font-weight:700;color:#3d4b5c;margin:0 0 6px;">Late on this assignment</div>
<table role="presentation" width="100%" cellspacing="0" cellpadding="0" style="margin-bottom:24px;"><tr><th align="left" style="padding:8px;color:#52657a;font-size:11px;text-transform:uppercase;letter-spacing:.6px;">Student</th><th align="left" style="padding:8px;color:#52657a;font-size:11px;text-transform:uppercase;letter-spacing:.6px;">Lateness</th><th style="padding:8px;color:#52657a;font-size:11px;text-transform:uppercase;letter-spacing:.6px;">Late total</th><th align="left" style="padding:8px;color:#52657a;font-size:11px;text-transform:uppercase;letter-spacing:.6px;">Policy status</th></tr>{current_rows}</table>
<div style="font-size:13px;font-weight:700;color:#3d4b5c;margin:0 0 6px;">Semester running totals</div>
<table role="presentation" width="100%" cellspacing="0" cellpadding="0"><tr><th align="left" style="padding:8px;color:#52657a;font-size:11px;text-transform:uppercase;letter-spacing:.6px;">Student</th><th style="padding:8px;color:#52657a;font-size:11px;text-transform:uppercase;letter-spacing:.6px;">Late count</th><th align="left" style="padding:8px;color:#52657a;font-size:11px;text-transform:uppercase;letter-spacing:.6px;">Policy status</th></tr>{table_rows}</table>
"""
    return subject, body, email_shell(
        f"{course['code']} — {assignment.name}", "Late-submission totals", content
    )


def late_report_csv(
    database: sqlite3.Connection, course: dict, assignment_id: str
) -> str:
    """Render the cumulative per-student late totals shown in the email."""
    output = io.StringIO()
    writer = csv.writer(output)
    writer.writerow(
        ["First Name", "Last Name", "SID", "Email", "Late on This Assignment",
         "Late Submission Count", "Policy Status"]
    )
    rows = database.execute(
        """SELECT student_key, MAX(first_name), MAX(last_name), MAX(sid),
        MAX(email), MAX(CASE WHEN assignment_id=? THEN 1 ELSE 0 END), COUNT(*)
        FROM late_submissions WHERE course_id=?
        GROUP BY student_key ORDER BY COUNT(*) DESC, MAX(last_name), MAX(first_name)""",
        (assignment_id, str(course["id"])),
    ).fetchall()
    for _key, first, last, sid, email, current, count in rows:
        writer.writerow(
            [first, last, sid, email, "Yes" if current else "No", count,
             "REVIEW FOR ZERO" if count >= 3 else ""]
        )
    return output.getvalue()


def email_shell(title: str, subtitle: str, content: str) -> str:
    return f"""<!doctype html>
<html><body style="margin:0;padding:0;background:#f3f5f7;font-family:-apple-system,BlinkMacSystemFont,'Segoe UI',Arial,sans-serif;color:#243142;">
<table role="presentation" width="100%" cellspacing="0" cellpadding="0" style="background:#f3f5f7;padding:28px 12px;"><tr><td align="center">
<table role="presentation" width="100%" cellspacing="0" cellpadding="0" style="max-width:640px;background:#ffffff;border:1px solid #dfe4ea;border-radius:12px;overflow:hidden;box-shadow:0 3px 14px rgba(0,0,0,.06);">
<tr><td style="background:#003057;border-top:6px solid #b3a369;padding:24px 30px;">
<div style="font-size:12px;line-height:18px;letter-spacing:1.2px;text-transform:uppercase;color:#e7dfc6;font-weight:700;">{html.escape(subtitle)}</div>
<div style="font-size:25px;line-height:32px;color:#ffffff;font-weight:700;margin-top:3px;">{html.escape(title)}</div>
</td></tr>
<tr><td style="padding:30px;">{content}</td></tr>
</table>
</td></tr></table></body></html>"""


def student_message(student: Student, course: dict, assignment, due: datetime, late: datetime) -> tuple[str, str, str]:
    subject = f"Friendly reminder: {assignment.name} can still be submitted"
    greeting = student.first_name or "there"
    body = f"""Hello {greeting},

I hope you’re doing well. I wanted to reach out because Gradescope does not currently show a submission from you for {assignment.name}, which was due on {display_time(due)}.

You can still submit the assignment through Gradescope by {display_time(late)}. {course['policy']}

If you plan to submit, please do so early enough to avoid any last-minute technical difficulties. If you believe you already submitted the assignment, please check Gradescope to confirm that your submission appears correctly.

In the rare case that you received this reminder despite already submitting, please make sure the email address on your Gradescope account matches the one associated with your Canvas account. If you have Gradescope accounts under different email addresses, please merge them so your submission and course enrollment are connected to the same account.

This is an automated reminder based on the current information in Gradescope. If you have already contacted me about your circumstances or made other arrangements with me, there is no need to reply to this message or explain your situation again.

Take care,
Ronnie Howard
"""
    safe_name = html.escape(greeting)
    safe_assignment = html.escape(assignment.name)
    safe_policy = html.escape(course["policy"])
    content = f"""
<p style="font-size:16px;line-height:25px;margin:0 0 18px;">Hello {safe_name},</p>
<p style="font-size:16px;line-height:25px;margin:0 0 22px;">I hope you’re doing well. I wanted to reach out because Gradescope does not currently show a submission from you for <strong>{safe_assignment}</strong>.</p>
<table role="presentation" width="100%" cellspacing="0" cellpadding="0" style="margin:0 0 22px;border-collapse:separate;border-spacing:0;background:#f7f8fa;border:1px solid #dfe4ea;border-radius:9px;overflow:hidden;">
<tr>
<td width="50%" valign="top" style="padding:17px 18px;border-right:1px solid #dfe4ea;"><div style="font-size:11px;letter-spacing:.8px;text-transform:uppercase;color:#5c6978;font-weight:700;margin-bottom:6px;">Original deadline</div><div style="font-size:15px;line-height:22px;font-weight:650;color:#243142;">{html.escape(display_time(due))}</div></td>
<td width="50%" valign="top" style="padding:17px 18px;"><div style="font-size:11px;letter-spacing:.8px;text-transform:uppercase;color:#5c6978;font-weight:700;margin-bottom:6px;">Submit by</div><div style="font-size:15px;line-height:22px;font-weight:700;color:#8a6500;">{html.escape(display_time(late))}</div></td>
</tr></table>
<div style="border-left:4px solid #b3a369;background:#fbfaf5;padding:16px 18px;margin:0 0 22px;border-radius:0 7px 7px 0;"><div style="font-size:12px;letter-spacing:.7px;text-transform:uppercase;color:#6d5b22;font-weight:700;margin-bottom:7px;">Course policy</div><div style="font-size:15px;line-height:23px;color:#394657;">{safe_policy}</div></div>
<p style="font-size:15px;line-height:24px;margin:0 0 18px;">If you plan to submit, please do so early enough to avoid any last-minute technical difficulties. If you believe you already submitted the assignment, please check Gradescope to confirm that your submission appears correctly.</p>
<div style="border:1px solid #d7e0e8;background:#f7fafc;border-radius:7px;padding:14px 16px;margin:0 0 22px;"><div style="font-size:12px;letter-spacing:.6px;text-transform:uppercase;color:#52657a;font-weight:700;margin-bottom:6px;">Already submitted?</div><div style="font-size:14px;line-height:22px;color:#465568;">In the rare case that you received this reminder despite already submitting, please make sure the email address on your Gradescope account matches the one associated with your Canvas account. If you have Gradescope accounts under different email addresses, please merge them so your submission and course enrollment are connected to the same account.</div></div>
<div style="font-size:13px;line-height:20px;color:#627083;background:#f3f5f7;border-radius:7px;padding:13px 15px;margin:22px 0;">This is an automated reminder based on the current information in Gradescope. If you have already contacted me about your circumstances or made other arrangements with me, there is no need to reply or explain your situation again.</div>
<p style="font-size:15px;line-height:23px;margin:0;">Take care,<br><strong>Ronnie Howard</strong></p>
"""
    rendered_html = email_shell(assignment.name, course["code"], content)
    return subject, body, rendered_html


def late_allowance_notice_message(
    student: Student,
    course: dict,
    assignment,
    total_lates: int,
    allowed_lates: int,
    preview: bool = False,
    retroactive: bool = False,
) -> tuple[str, str, str]:
    """Build the one-time notice sent when a student uses the late allowance."""
    prefix = "PREVIEW — " if preview else ""
    subject = (
        f"{prefix}You have used your {allowed_lates} late homework "
        f"submission{'s' if allowed_lates != 1 else ''} — {course['code']}"
    )
    greeting = student.first_name or "there"
    if retroactive:
        opening = (
            "This notice is being sent retroactively because automated late-allowance "
            f"notices were added after the semester began. Our records show that "
            f"{assignment.name} was your {allowed_lates}nd late homework submission. "
            f"Gradescope currently shows {total_lates} late homework submissions for you "
            f"in {course['code']}."
        )
        eligibility = (
            f"{assignment.name}, your second late homework, remained eligible for credit "
            "under the late allowance. Any homework submitted late after that second "
            "submission receives a zero."
        )
    else:
        opening = (
            f"Gradescope now shows {assignment.name} as your {total_lates} late homework "
            f"submission this semester. Under the {course['code']} policy, students may "
            f"submit up to {allowed_lates} homework assignment"
            f"{'s' if allowed_lates != 1 else ''} late."
        )
        eligibility = (
            f"Your submission for {assignment.name} is still within the permitted late "
            "allowance and remains eligible for credit. However, you have now used the "
            "full late-submission allowance. Any additional homework submitted after its "
            "regular deadline will receive a zero."
        )
    body = f"""Hello {greeting},

{opening}

{eligibility}

Course policy: {course['policy']}

No action is required. This is a one-time automated notice and will not be sent again for later assignments. If you believe the late-submission count is incorrect, please review your Gradescope submission history and contact me.

Take care,
Ronnie Howard
"""
    safe_assignment = html.escape(assignment.name)
    safe_course = html.escape(course["code"])
    if retroactive:
        html_opening = (
            "This notice is being sent retroactively because automated late-allowance "
            "notices were added after the semester began. Our records show that "
            f"<strong>{safe_assignment}</strong> was your <strong>second late homework "
            f"submission</strong>. Gradescope currently shows <strong>{total_lates}</strong> "
            f"late homework submissions for you in {safe_course}."
        )
        html_eligibility = (
            f"<strong>{safe_assignment}, your second late homework, remained eligible "
            "for credit.</strong> Any homework submitted late after that second submission "
            "receives a zero."
        )
    else:
        ordinal = "nd" if total_lates == 2 else "th"
        html_opening = (
            f"Gradescope now shows <strong>{safe_assignment}</strong> as your "
            f"<strong>{total_lates}{ordinal} late homework submission</strong> this semester."
        )
        html_eligibility = (
            f"<strong>{safe_assignment} remains eligible for credit.</strong> This notice "
            "concerns future late submissions; it does not assign a zero to the current homework."
        )
    content = f"""
<p style="font-size:16px;line-height:25px;margin:0 0 18px;">Hello {html.escape(greeting)},</p>
<p style="font-size:16px;line-height:25px;margin:0 0 22px;">{html_opening}</p>
<div style="background:#fff8e5;border:1px solid #dfc77a;border-left:5px solid #b3a369;border-radius:8px;padding:17px 19px;margin:0 0 22px;">
<div style="font-size:11px;letter-spacing:.8px;text-transform:uppercase;color:#6d5b22;font-weight:750;margin-bottom:6px;">Late allowance used</div>
<div style="font-size:16px;line-height:24px;color:#493e1c;">You have now used all <strong>{allowed_lates}</strong> permitted late homework submissions. Any additional homework submitted after its regular deadline will receive a zero.</div>
</div>
<div style="background:#edf7f1;border:1px solid #bddbc9;border-radius:8px;padding:15px 17px;margin:0 0 22px;font-size:15px;line-height:23px;color:#24543b;">{html_eligibility}</div>
<div style="border-left:4px solid #b3a369;background:#fbfaf5;padding:16px 18px;margin:0 0 22px;border-radius:0 7px 7px 0;"><div style="font-size:12px;letter-spacing:.7px;text-transform:uppercase;color:#6d5b22;font-weight:700;margin-bottom:7px;">{safe_course} policy</div><div style="font-size:15px;line-height:23px;color:#394657;">{html.escape(course['policy'])}</div></div>
<p style="font-size:15px;line-height:24px;margin:0 0 18px;">No action is required. This is a one-time automated notice and will not be sent again for later assignments. If you believe the count is incorrect, please review your Gradescope submission history and contact me.</p>
<p style="font-size:15px;line-height:23px;margin:0;">Take care,<br><strong>Ronnie Howard</strong></p>
"""
    return subject, body, email_shell(
        f"{course['code']} late-submission allowance",
        "Preview" if preview else "Course policy notice",
        content,
    )


def send_message(
    account,
    recipient: str,
    subject: str,
    body: str,
    html_body: str | None = None,
    attachments: list[Path] | None = None,
) -> None:
    message = account.new_message()
    message.to.add(recipient)
    message.subject = subject
    message.body_type = "HTML"
    message.body = html_body or html.escape(body).replace("\n", "<br>")
    if attachments:
        message.attachments.add(attachments)
    if not message.send():
        raise RuntimeError("Microsoft Graph did not confirm delivery")


def expired_recipient_notice(courses: list[dict]) -> tuple[str, str, str]:
    """Build the one-time owner notice for expired semester recipient lists."""
    labels = ", ".join(course["code"] for course in courses)
    subject = "Action needed: update Gradescope reminder recipients for spring"
    body = (
        "The Fall 2026 head-TA recipient lists have expired.\n\n"
        f"Affected courses: {labels}\n\n"
        "The former head TAs will no longer receive course reports or late-window CSV files. "
        "Please reconfigure the script with the new spring-semester head TAs.\n"
    )
    content = f"""
<div style="background:#fff8e5;border:1px solid #dfc77a;border-left:5px solid #b3a369;border-radius:8px;padding:17px 19px;margin:0 0 24px;">
<div style="font-size:11px;letter-spacing:.8px;text-transform:uppercase;color:#6d5b22;font-weight:750;margin-bottom:6px;">Configuration required</div>
<div style="font-size:18px;line-height:25px;color:#594a1b;font-weight:700;">Add the spring head-TA recipients</div>
</div>
<p style="font-size:15px;line-height:24px;color:#394657;">The Fall 2026 recipient lists for <strong>{html.escape(labels)}</strong> have expired. The former head TAs will no longer receive course reports or late-window CSV files.</p>
<p style="font-size:15px;line-height:24px;color:#394657;">Please reconfigure the Gradescope reminder script with the new spring-semester head TAs.</p>
"""
    return subject, body, email_shell("Update spring recipients", "Gradescope reminder system", content)


def weekly_backcheck_key(current: datetime, schedule: dict) -> str | None:
    """Return this week's key once its configured backcheck time has arrived."""
    weekday_name = str(schedule.get("backcheck_weekday", "Monday")).strip().casefold()
    weekdays = {
        "monday": 0, "tuesday": 1, "wednesday": 2, "thursday": 3,
        "friday": 4, "saturday": 5, "sunday": 6,
    }
    if weekday_name not in weekdays:
        raise RuntimeError(f"Invalid backcheck weekday: {weekday_name!r}")
    hour = int(schedule.get("backcheck_hour", 8))
    if not 0 <= hour <= 23:
        raise RuntimeError("backcheck_hour must be between 0 and 23")
    start = (current - timedelta(days=(current.weekday() - weekdays[weekday_name]) % 7)).replace(
        hour=hour, minute=0, second=0, microsecond=0
    )
    if current < start:
        return None
    iso = start.isocalendar()
    return f"{iso.year}-W{iso.week:02d}"


def weekly_backcheck_message(
    additions: list[tuple[dict, object, LateSubmission, int]],
    assignments_checked: int,
) -> tuple[str, str, str]:
    """Build the owner-only weekly reconciliation result."""
    count = len(additions)
    if count:
        plural = "s" if count != 1 else ""
        policy_reviews = sum(1 for _course, _assignment, _item, total in additions if total >= 3)
        subject = f"Weekly late-submission backcheck: {count} new record{plural} found"
        if policy_reviews:
            subject += f" — {policy_reviews} require{'s' if policy_reviews == 1 else ''} policy review"
        headline = f"{count} new late submission{plural} found"
        status_color = "#8a6500"
        lines = [
            "Weekly Gradescope late-submission backcheck", "",
            f"Assignments checked: {assignments_checked}",
            f"New late submissions found: {count}", "", "New records:",
        ]
        rows = []
        for course, assignment, item, total in additions:
            hours, remainder = divmod(item.lateness_seconds, 3600)
            minutes, seconds = divmod(remainder, 60)
            lateness = f"{hours:02d}:{minutes:02d}:{seconds:02d}"
            policy_status = " — REVIEW FOR ZERO" if total >= 3 else ""
            lines.append(
                f"- {course['code']} — {assignment.name}: {item.first_name} "
                f"{item.last_name} <{item.email}> ({lateness} late); "
                f"semester total: {total}{policy_status}"
            )
            rows.append(
                f'<tr><td style="padding:10px 7px;border-bottom:1px solid #e4e8ed;font-size:13px;">{html.escape(course["code"])}<br><span style="color:#687687;">{html.escape(assignment.name)}</span></td>'
                f'<td style="padding:10px 7px;border-bottom:1px solid #e4e8ed;font-size:13px;">{html.escape(item.first_name + " " + item.last_name)}<br><span style="color:#687687;">{html.escape(item.email)}</span></td>'
                f'<td align="center" style="padding:10px 7px;border-bottom:1px solid #e4e8ed;font-size:16px;font-weight:750;color:{"#a12622" if total >= 3 else "#243142"};">{total}</td>'
                f'<td style="padding:10px 7px;border-bottom:1px solid #e4e8ed;font-size:11px;font-weight:750;color:#a12622;">{"REVIEW FOR ZERO" if total >= 3 else ""}</td></tr>'
            )
        detail = (
            '<table role="presentation" width="100%" cellspacing="0" cellpadding="0">'
            '<tr><th align="left" style="padding:8px 7px;color:#52657a;font-size:11px;text-transform:uppercase;">Course / assignment</th>'
            '<th align="left" style="padding:8px 7px;color:#52657a;font-size:11px;text-transform:uppercase;">Student</th>'
            '<th style="padding:8px 7px;color:#52657a;font-size:11px;text-transform:uppercase;">Late total</th>'
            '<th align="left" style="padding:8px 7px;color:#52657a;font-size:11px;text-transform:uppercase;">Policy status</th></tr>'
            + "".join(rows) + "</table>"
        )
    else:
        subject = "Weekly late-submission backcheck: no new records found"
        headline = "No newly reported late submissions"
        status_color = "#176b45"
        lines = [
            "Weekly Gradescope late-submission backcheck", "",
            f"Assignments checked: {assignments_checked}",
            "New late submissions found: 0", "",
            "No new Late-tagged submissions have appeared since the previous reports.",
        ]
        detail = '<p style="font-size:15px;line-height:24px;color:#394657;margin:0;">No new Gradescope Late-tagged submissions have appeared since the previous assignment reports.</p>'
    body = "\n".join(lines) + "\n"
    assignment_word = "assignment" if assignments_checked == 1 else "assignments"
    content = f"""
<div style="background:#f7f8fa;border:1px solid #dfe4ea;border-left:5px solid {status_color};border-radius:8px;padding:17px 19px;margin:0 0 24px;">
<div style="font-size:11px;letter-spacing:.8px;text-transform:uppercase;color:#5c6978;font-weight:750;margin-bottom:6px;">Weekly reconciliation complete</div>
<div style="font-size:18px;line-height:25px;color:#243142;font-weight:700;">{html.escape(headline)}</div>
</div>
<div style="font-size:14px;line-height:22px;color:#52657a;margin:0 0 20px;">Checked <strong>{assignments_checked}</strong> previously reported {assignment_word} against Gradescope’s current Late badges.</div>
{detail}
"""
    return subject, body, email_shell(
        "Weekly late-submission backcheck", "Gradescope reminder system", content
    )


def failure_summary_message(error: Exception) -> tuple[str, str, str]:
    """Explain an automatic-run failure in actionable, non-technical language."""
    detail = str(error) or type(error).__name__
    lowered = detail.casefold()
    if isinstance(error, requests_exceptions.Timeout) or "timed out" in lowered:
        category = "Gradescope connection timed out"
        explanation = (
            "The laptop reached the network, but Gradescope did not respond before "
            "the request timed out. This is usually temporary."
        )
        retry = "The system will try again during the next five-minute check."
    elif isinstance(error, requests_exceptions.ConnectionError) or any(
        phrase in lowered
        for phrase in ("failed to resolve", "name resolution", "network is unreachable")
    ):
        category = "Network or DNS connection failure"
        explanation = (
            "The laptop could not reach www.gradescope.com. Its internet connection "
            "or DNS lookup was temporarily unavailable; Gradescope did not reject the login."
        )
        retry = "The system will try again during the next five-minute check."
    elif isinstance(error, GradescopeAuthenticationExpired) or any(
        phrase in lowered
        for phrase in ("authentication failed", "invalid credentials", "must be logged in")
    ):
        category = "Gradescope authentication failure"
        explanation = (
            "The saved Gradescope session could not be refreshed with the configured "
            "credentials. No additional login attempts will be made until the active "
            "authentication backoff expires."
        )
        retry = "Check the stored Gradescope password if this message recurs after the backoff."
    elif isinstance(error, requests_exceptions.HTTPError):
        category = "Gradescope web-service error"
        explanation = (
            "Gradescope returned an unsuccessful HTTP response while the assignment "
            "data was being checked."
        )
        retry = "The system will try again during the next five-minute check."
    else:
        category = "Unexpected reminder-system error"
        explanation = (
            "The reminder run stopped because of an error that was not recognized as "
            "a routine network or authentication problem."
        )
        retry = "Review the technical detail below and the system journal before intervening."

    subject = f"Gradescope reminder check failed: {category}"
    body = (
        "The automated Gradescope reminder check did not complete.\n\n"
        f"What happened: {category}\n"
        f"Explanation: {explanation}\n\n"
        "Student-email impact: Processing stopped at the error. Any messages sent "
        "successfully before it occurred remain recorded, and duplicate protection "
        "will prevent them from being sent again.\n\n"
        f"Next step: {retry}\n\n"
        f"Technical detail: {type(error).__name__}: {detail}\n"
    )
    content = f"""
<div style="background:#fff4f2;border:1px solid #e7b8b3;border-left:5px solid #a12622;border-radius:8px;padding:17px 19px;margin:0 0 24px;">
<div style="font-size:11px;letter-spacing:.8px;text-transform:uppercase;color:#8e2521;font-weight:750;margin-bottom:6px;">Check did not complete</div>
<div style="font-size:18px;line-height:25px;color:#75201d;font-weight:700;">{html.escape(category)}</div>
</div>
<div style="font-size:12px;letter-spacing:.7px;text-transform:uppercase;color:#5c6978;font-weight:700;margin:0 0 7px;">What happened</div>
<p style="font-size:15px;line-height:24px;margin:0 0 23px;color:#394657;">{html.escape(explanation)}</p>
<div style="font-size:12px;letter-spacing:.7px;text-transform:uppercase;color:#5c6978;font-weight:700;margin:0 0 7px;">Student-email impact</div>
<p style="font-size:15px;line-height:24px;margin:0 0 23px;color:#394657;">Processing stopped at the error. Any messages sent successfully before it occurred remain recorded, and duplicate protection will prevent them from being sent again.</p>
<div style="background:#fbfaf5;border-left:4px solid #b3a369;border-radius:0 7px 7px 0;padding:15px 17px;margin:0 0 24px;">
<div style="font-size:11px;letter-spacing:.7px;text-transform:uppercase;color:#6d5b22;font-weight:700;margin-bottom:6px;">Next step</div>
<div style="font-size:15px;line-height:23px;color:#394657;">{html.escape(retry)}</div>
</div>
<div style="font-size:11px;letter-spacing:.7px;text-transform:uppercase;color:#687687;font-weight:700;margin:0 0 7px;">Technical detail</div>
<div style="font-family:ui-monospace,SFMono-Regular,Consolas,monospace;font-size:12px;line-height:19px;color:#536171;background:#f3f5f7;border:1px solid #e1e5ea;border-radius:7px;padding:13px 15px;overflow-wrap:anywhere;">{html.escape(type(error).__name__ + ': ' + detail)}</div>
"""
    rendered_html = email_shell(category, "Gradescope reminder check failed", content)
    return subject, body, rendered_html


def send_failure_summary(config: dict, error: Exception) -> None:
    """Best-effort notification for an automatic run that failed before its normal report."""
    try:
        account, _ = create_account()
        if not account.is_authenticated:
            return
        subject, body, html_body = failure_summary_message(error)
        send_message(
            account,
            config["delivery"]["summary_email"],
            subject,
            body,
            html_body,
        )
        secure_token_cache()
    except Exception:
        pass


def summary_message(course: dict, assignment, due: datetime, late: datetime, missing: list[Student], sent: list[Student], skipped: list[Student], excluded: list[tuple[Student, str]], failures: list[tuple[Student, str]], dry_run: bool) -> tuple[str, str, str]:
    label = "PREVIEW" if dry_run else "Report"
    subject = f"Gradescope reminder {label.lower()}: {course['code']} — {assignment.name}"
    lines = [
        f"Gradescope reminder {label}", "",
        f"Course: {course['name']} ({course['term']})",
        f"Assignment: {assignment.name}",
        f"Regular deadline: {display_time(due)}",
        f"Effective late deadline: {display_time(late)}", "",
        f"Missing when checked: {len(missing)}",
        f"Reminders {'that would be sent' if dry_run else 'sent'}: {len(sent)}",
        f"Already sent and skipped: {len(skipped)}",
        f"Instructor exclusions: {len(excluded)}",
        f"Failures: {len(failures)}",
    ]
    if sent:
        lines.extend(["", "Recipients:"] + [f"- {s.first_name} {s.last_name} <{s.email}>" for s in sent])
    if failures:
        lines.extend(["", "Failures:"] + [f"- {s.first_name} {s.last_name} <{s.email}>: {error}" for s, error in failures])
    if excluded:
        lines.extend(["", "Instructor exclusions:"] + [f"- {s.first_name} {s.last_name} <{s.email}>: {reason}" for s, reason in excluded])
    text_body = "\n".join(lines) + "\n"
    metrics = [
        ("Missing", len(missing), "#8a6500"),
        ("Reminders" if not dry_run else "Would send", len(sent), "#176b45"),
        ("Excluded", len(excluded), "#52657a"),
        ("Failures", len(failures), "#a12622"),
    ]
    metric_cells = "".join(
        f'<td width="25%" align="center" style="padding:14px 7px;border-right:1px solid #e1e5ea;"><div style="font-size:24px;font-weight:750;color:{color};">{value}</div><div style="font-size:11px;letter-spacing:.5px;text-transform:uppercase;color:#687687;margin-top:4px;">{html.escape(name)}</div></td>'
        for name, value, color in metrics
    )
    detail_rows = "".join(
        f'<tr><td style="padding:8px 0;border-bottom:1px solid #edf0f3;font-size:14px;line-height:20px;">{html.escape(student.first_name + " " + student.last_name)}<br><span style="color:#687687;">{html.escape(student.email)}</span></td></tr>'
        for student in sent
    ) or '<tr><td style="padding:8px 0;color:#687687;font-size:14px;">None</td></tr>'
    excluded_rows = "".join(
        f'<tr><td style="padding:8px 0;border-bottom:1px solid #edf0f3;font-size:14px;line-height:20px;">{html.escape(student.first_name + " " + student.last_name)} — {html.escape(reason)}</td></tr>'
        for student, reason in excluded
    )
    failure_rows = "".join(
        f'<tr><td style="padding:8px 0;border-bottom:1px solid #edf0f3;font-size:14px;line-height:20px;color:#8e2521;">{html.escape(student.first_name + " " + student.last_name)} — {html.escape(error)}</td></tr>'
        for student, error in failures
    )
    extra_sections = ""
    if excluded_rows:
        extra_sections += f'<div style="font-size:13px;font-weight:700;color:#3d4b5c;margin:22px 0 5px;">Instructor exclusions</div><table role="presentation" width="100%">{excluded_rows}</table>'
    if failure_rows:
        extra_sections += f'<div style="font-size:13px;font-weight:700;color:#8e2521;margin:22px 0 5px;">Failures</div><table role="presentation" width="100%">{failure_rows}</table>'
    content = f"""
<table role="presentation" width="100%" cellspacing="0" cellpadding="0" style="font-size:14px;line-height:21px;margin-bottom:20px;">
<tr><td style="color:#687687;width:145px;padding:3px 0;">Course</td><td style="font-weight:650;padding:3px 0;">{html.escape(course['name'])} ({html.escape(course['term'])})</td></tr>
<tr><td style="color:#687687;padding:3px 0;">Assignment</td><td style="font-weight:650;padding:3px 0;">{html.escape(assignment.name)}</td></tr>
<tr><td style="color:#687687;padding:3px 0;">Regular deadline</td><td style="padding:3px 0;">{html.escape(display_time(due))}</td></tr>
<tr><td style="color:#687687;padding:3px 0;">Effective late deadline</td><td style="padding:3px 0;">{html.escape(display_time(late))}</td></tr>
</table>
<table role="presentation" width="100%" cellspacing="0" cellpadding="0" style="background:#f7f8fa;border:1px solid #e1e5ea;border-radius:9px;overflow:hidden;"><tr>{metric_cells}</tr></table>
<div style="font-size:13px;font-weight:700;color:#3d4b5c;margin:24px 0 5px;">{'Preview recipients' if dry_run else 'Recipients'}</div>
<table role="presentation" width="100%" cellspacing="0" cellpadding="0">{detail_rows}</table>
{extra_sections}
"""
    rendered_html = email_shell(f"{course['code']} — {assignment.name}", f"Gradescope reminder {label}", content)
    return subject, text_body, rendered_html


def run(dry_run: bool, now: datetime | None = None) -> int:
    config = load_config()
    timezone = ZoneInfo(config["schedule"]["timezone"])
    current = now.astimezone(timezone) if now else datetime.now(timezone)
    delay = timedelta(minutes=int(config["schedule"].get("check_delay_minutes", 5)))
    database = open_database()
    gs = None
    mail_account = None
    eligible_count = 0
    try:
        expired_courses = [
            course for course in config["courses"]
            if course.get("additional_email_end_date") is not None
            and current.date() > course["additional_email_end_date"]
            and (
                course.get("additional_report_emails")
                or course.get("additional_late_report_emails")
            )
        ]
        if expired_courses and not dry_run:
            notice_key = "recipient-expiry:" + ",".join(
                f"{course['id']}:{course['additional_email_end_date']}"
                for course in expired_courses
            )
            already_sent = database.execute(
                "SELECT 1 FROM configuration_notices WHERE notice_key=?", (notice_key,)
            ).fetchone()
            if not already_sent:
                mail_account, _ = create_account()
                if not mail_account.is_authenticated:
                    raise RuntimeError(
                        "Microsoft authentication is unavailable; run auth_check.py"
                    )
                subject, body, html_body = expired_recipient_notice(expired_courses)
                send_message(
                    mail_account, config["delivery"]["summary_email"],
                    subject, body, html_body,
                )
                database.execute(
                    "INSERT INTO configuration_notices VALUES (?, ?)",
                    (notice_key, current.isoformat()),
                )
                database.commit()
        gs = PersistentGradescopeConnection(config["gradescope"], database, current)
        week_key = weekly_backcheck_key(current, config["schedule"])
        backcheck_done = week_key and database.execute(
            "SELECT 1 FROM weekly_backchecks WHERE week_key=?", (week_key,)
        ).fetchone()
        if week_key and not backcheck_done and not dry_run:
            checked = 0
            additions = []
            refreshed = []
            for course in config["courses"]:
                pattern = re.compile(course["assignment_pattern"])
                for assignment in gs.get_assignments(str(course["id"])):
                    if not pattern.search(assignment.name) or assignment.due_date is None:
                        continue
                    late = effective_late_deadline(
                        assignment, timezone, int(course["late_hours"])
                    )
                    previously_reported = database.execute(
                        "SELECT 1 FROM late_reports WHERE course_id=? AND assignment_id=?",
                        (str(course["id"]), assignment.assignment_id),
                    ).fetchone()
                    if current <= late or not previously_reported:
                        continue
                    checked += 1
                    known = {
                        row[0] for row in database.execute(
                            """SELECT student_key FROM late_submissions
                            WHERE course_id=? AND assignment_id=?""",
                            (str(course["id"]), assignment.assignment_id),
                        )
                    }
                    current_rows = late_submissions(
                        gs, str(course["id"]), assignment.assignment_id,
                        int(course["late_hours"]),
                    )
                    additions.extend(
                        (course, assignment, item)
                        for item in current_rows if item.student_key not in known
                    )
                    refreshed.append((course, assignment, current_rows))
            for course, assignment, current_rows in refreshed:
                record_late_submissions(
                    database, str(course["id"]), assignment.assignment_id,
                    current_rows, current, commit=False,
                )
            for course, assignment, item in additions:
                queue_late_allowance_notices(
                    database, course, assignment, [item], current
                )
            if mail_account is None:
                mail_account, _ = create_account()
                if not mail_account.is_authenticated:
                    raise RuntimeError(
                        "Microsoft authentication is unavailable; run auth_check.py"
                    )
            enriched_additions = [
                (
                    course, assignment, item,
                    database.execute(
                        """SELECT COUNT(*) FROM late_submissions
                        WHERE course_id=? AND student_key=?""",
                        (str(course["id"]), item.student_key),
                    ).fetchone()[0],
                )
                for course, assignment, item in additions
            ]
            subject, body, html_body = weekly_backcheck_message(
                enriched_additions, checked
            )
            send_message(
                mail_account, config["delivery"]["summary_email"],
                subject, body, html_body,
            )
            database.execute(
                "INSERT INTO weekly_backchecks VALUES (?, ?, ?, ?)",
                (week_key, current.isoformat(), checked, len(additions)),
            )
            database.commit()
            print(
                f"Weekly late backcheck: assignments={checked}, "
                f"new submissions={len(additions)}"
            )
        for course in config["courses"]:
            assignments = gs.get_assignments(str(course["id"]))
            pattern = re.compile(course["assignment_pattern"])
            for assignment in assignments:
                if not pattern.search(assignment.name) or assignment.due_date is None:
                    continue
                due = localize(assignment.due_date, timezone)
                late = effective_late_deadline(assignment, timezone, int(course["late_hours"]))
                if not dry_run and sync_assignment_schedule(
                    database, str(course["id"]), assignment.assignment_id, due, late, current
                ):
                    print(
                        f"{course['code']} {assignment.name}: deadline changed; "
                        "reopened using the current Gradescope schedule"
                    )
                if late_report_ready(current, late, config["schedule"]):
                    report_sent = database.execute(
                        "SELECT 1 FROM late_reports WHERE course_id=? AND assignment_id=?",
                        (str(course["id"]), assignment.assignment_id),
                    ).fetchone()
                    if report_sent and not dry_run:
                        continue
                    submissions = late_submissions(
                        gs, str(course["id"]), assignment.assignment_id,
                        int(course["late_hours"]),
                    )
                    if not dry_run:
                        record_late_submissions(
                            database, str(course["id"]), assignment.assignment_id,
                            submissions, current,
                        )
                        queue_late_allowance_notices(
                            database, course, assignment, submissions, current
                        )
                        database.commit()
                    subject, body, html_body = late_report_message(
                        database, course, assignment, due, late, submissions
                    )
                    if dry_run:
                        print(f"\n{subject}\n{body}")
                    else:
                        if mail_account is None:
                            mail_account, _ = create_account()
                            if not mail_account.is_authenticated:
                                raise RuntimeError(
                                    "Microsoft authentication is unavailable; run auth_check.py"
                                )
                        attachment_path = None
                        try:
                            with tempfile.NamedTemporaryFile(
                                mode="w", encoding="utf-8", newline="", delete=False,
                                dir=state_dir(), prefix="late-submission-totals-",
                                suffix=".csv",
                            ) as attachment:
                                attachment.write(
                                    late_report_csv(
                                        database, course, assignment.assignment_id
                                    )
                                )
                                attachment_path = Path(attachment.name)
                            attachment_path.chmod(0o600)
                            for recipient in late_report_recipients(config, course, current):
                                send_message(
                                    mail_account, recipient, subject, body, html_body,
                                    [attachment_path],
                                )
                        finally:
                            if attachment_path is not None:
                                attachment_path.unlink(missing_ok=True)
                        database.execute(
                            "INSERT INTO late_reports VALUES (?, ?, ?)",
                            (
                                str(course["id"]), assignment.assignment_id,
                                current.isoformat(),
                            ),
                        )
                        database.commit()
                    print(
                        f"{course['code']} {assignment.name}: late-window report; "
                        f"late submissions={len(submissions)}"
                    )
                    continue
                if current < due + delay or current > late:
                    continue
                completed = database.execute(
                    "SELECT 1 FROM completed_runs WHERE course_id=? AND assignment_id=?",
                    (str(course["id"]), assignment.assignment_id),
                ).fetchone()
                if completed and not dry_run:
                    continue
                eligible_count += 1
                missing = missing_students(gs, str(course["id"]), assignment.assignment_id)
                sent, skipped, excluded, failures = [], [], [], []
                exclusions = {
                    item["email"].casefold(): item.get("reason", "Instructor-approved exception")
                    for item in config.get("exclusions", [])
                    if str(item.get("course_id")) == str(course["id"])
                    and str(item.get("assignment_id")) == assignment.assignment_id
                }
                for student in missing:
                    if student.email.casefold() in exclusions:
                        excluded.append((student, exclusions[student.email.casefold()]))
                        continue
                    duplicate = database.execute(
                        "SELECT 1 FROM reminders WHERE course_id=? AND assignment_id=? AND email=?",
                        (str(course["id"]), assignment.assignment_id, student.email.casefold()),
                    ).fetchone()
                    if duplicate:
                        skipped.append(student)
                        continue
                    if dry_run:
                        sent.append(student)
                        continue
                    if mail_account is None:
                        mail_account, _ = create_account()
                        if not mail_account.is_authenticated:
                            raise RuntimeError("Microsoft authentication is unavailable; run auth_check.py")
                    try:
                        subject, body, html_body = student_message(student, course, assignment, due, late)
                        send_message(mail_account, student.email, subject, body, html_body)
                        database.execute(
                            "INSERT INTO reminders VALUES (?, ?, ?, ?)",
                            (str(course["id"]), assignment.assignment_id, student.email.casefold(), current.isoformat()),
                        )
                        database.commit()
                        sent.append(student)
                    except Exception as exc:
                        failures.append((student, str(exc)))

                subject, body, html_body = summary_message(course, assignment, due, late, missing, sent, skipped, excluded, failures, dry_run)
                if dry_run:
                    print(f"\n{subject}\n{body}")
                else:
                    if mail_account is None:
                        mail_account, _ = create_account()
                        if not mail_account.is_authenticated:
                            raise RuntimeError("Microsoft authentication is unavailable; run auth_check.py")
                    for recipient in report_recipients(config, course, current):
                        send_message(mail_account, recipient, subject, body, html_body)
                    if not failures:
                        database.execute(
                            "INSERT OR REPLACE INTO completed_runs VALUES (?, ?, ?)",
                            (str(course["id"]), assignment.assignment_id, current.isoformat()),
                        )
                        database.commit()
                print(f"{course['code']} {assignment.name}: missing={len(missing)}, sent={len(sent)}, skipped={len(skipped)}, excluded={len(excluded)}, failed={len(failures)}")
        if not dry_run:
            pending_notices = database.execute(
                """SELECT course_id, student_key, email, first_name, last_name,
                assignment_name, total_lates, retroactive FROM late_allowance_notices
                WHERE status='pending' ORDER BY created_at, last_name, first_name"""
            ).fetchall()
            if pending_notices and mail_account is None:
                mail_account, _ = create_account()
                if not mail_account.is_authenticated:
                    raise RuntimeError(
                        "Microsoft authentication is unavailable; run auth_check.py"
                    )
            courses_by_id = {str(course["id"]): course for course in config["courses"]}
            for (
                course_id, student_key, email_address, first_name, last_name,
                assignment_name, total_lates, retroactive,
            ) in pending_notices:
                course = courses_by_id.get(course_id)
                if course is None:
                    continue
                try:
                    subject, body, html_body = late_allowance_notice_message(
                        Student(first_name, last_name, email_address),
                        course,
                        SimpleNamespace(name=assignment_name),
                        total_lates,
                        int(course.get("allowed_late_submissions", 2)),
                        retroactive=bool(retroactive),
                    )
                    send_message(
                        mail_account, email_address, subject, body, html_body
                    )
                    database.execute(
                        """UPDATE late_allowance_notices
                        SET status='sent', sent_at=?, last_error=''
                        WHERE course_id=? AND student_key=?""",
                        (current.isoformat(), course_id, student_key),
                    )
                    print(
                        f"{course['code']}: sent late-allowance notice to "
                        f"{first_name} {last_name} <{email_address}>"
                    )
                except Exception as exc:
                    database.execute(
                        """UPDATE late_allowance_notices SET last_error=?
                        WHERE course_id=? AND student_key=?""",
                        (str(exc), course_id, student_key),
                    )
                    print(
                        f"{course['code']}: late-allowance notice failed for "
                        f"{email_address}: {exc}", file=sys.stderr,
                    )
                database.commit()
        if eligible_count == 0:
            print("No configured homework is currently awaiting its first reminder run.")
        return 0
    finally:
        if gs is not None:
            gs.save()
        if mail_account is not None:
            secure_token_cache()
        database.close()


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--send", action="store_true", help="Send reminders and the summary email")
    args = parser.parse_args()
    config = load_config()
    configured_mode = config.get("delivery", {}).get("mode", "dry-run")
    if args.send and configured_mode != "automatic":
        raise SystemExit("Refusing to send: set [delivery] mode = \"automatic\" after approving a preview")
    try:
        with run_lock() as acquired:
            if not acquired:
                print("Another Gradescope reminder process is already running; skipping.")
                raise SystemExit(0)
            raise SystemExit(run(dry_run=not args.send))
    except GradescopeAuthenticationBackoff as exc:
        print(f"AUTH BACKOFF: {exc}", file=sys.stderr)
        raise SystemExit(0)
    except Exception as exc:
        print(f"ERROR: {exc}", file=sys.stderr)
        if args.send:
            send_failure_summary(config, exc)
        raise SystemExit(1)


if __name__ == "__main__":
    main()
