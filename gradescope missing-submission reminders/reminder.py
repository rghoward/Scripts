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
import tomllib
from contextlib import contextmanager
from dataclasses import dataclass
from datetime import datetime, timedelta
from pathlib import Path
from urllib.parse import urlparse
from zoneinfo import ZoneInfo

from gradescopeapi.classes.connection import GSConnection
from gradescopeapi.classes.account import Account
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
    """Return submissions made late but within the configured course-policy window."""
    url = (
        f"{connection.connection.gradescope_base_url}/courses/{course_id}/"
        f"assignments/{assignment_id}/scores.csv"
    )
    response = connection.get(url, timeout=30)
    response.raise_for_status()
    reader = csv.DictReader(io.StringIO(response.text.lstrip("\ufeff")))
    required = {
        "First Name", "Last Name", "SID", "Email", "Status",
        "Submission Time", "Lateness (H:M:S)",
    }
    if not reader.fieldnames or not required.issubset(reader.fieldnames):
        raise RuntimeError(f"Unexpected Gradescope CSV columns for assignment {assignment_id}")
    maximum = late_hours * 3600
    result = []
    for row in reader:
        if row["Status"].strip().casefold() == "missing":
            continue
        seconds = parse_lateness(row.get("Lateness (H:M:S)"))
        if seconds <= 0 or seconds > maximum:
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
) -> None:
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
    database.commit()


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
    subject = f"Late-submission totals: {course['code']} — {assignment.name}"
    lines = [
        "Gradescope late-submission report", "",
        f"Course: {course['name']} ({course['term']})",
        f"Assignment closed: {assignment.name}",
        f"Regular deadline: {display_time(due)}",
        f"Late deadline: {display_time(late)}", "",
        f"Late submissions for this assignment: {len(current_submissions)}",
        f"Students with late submissions this semester: {len(rows)}", "",
        "Running totals:",
    ]
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
    content = f"""
<table role="presentation" width="100%" cellspacing="0" cellpadding="0" style="font-size:14px;line-height:21px;margin-bottom:20px;">
<tr><td style="color:#687687;width:145px;padding:3px 0;">Assignment closed</td><td style="font-weight:650;padding:3px 0;">{html.escape(assignment.name)}</td></tr>
<tr><td style="color:#687687;padding:3px 0;">Regular deadline</td><td style="padding:3px 0;">{html.escape(display_time(due))}</td></tr>
<tr><td style="color:#687687;padding:3px 0;">Late deadline</td><td style="padding:3px 0;">{html.escape(display_time(late))}</td></tr>
</table>
<div style="background:#f7f8fa;border:1px solid #e1e5ea;border-radius:9px;padding:16px 18px;margin-bottom:22px;font-size:15px;line-height:23px;"><strong>{len(current_submissions)}</strong> late submission(s) for this assignment; <strong>{len(rows)}</strong> student(s) with a semester late-submission count.</div>
<table role="presentation" width="100%" cellspacing="0" cellpadding="0"><tr><th align="left" style="padding:8px;color:#52657a;font-size:11px;text-transform:uppercase;letter-spacing:.6px;">Student</th><th style="padding:8px;color:#52657a;font-size:11px;text-transform:uppercase;letter-spacing:.6px;">Late count</th><th align="left" style="padding:8px;color:#52657a;font-size:11px;text-transform:uppercase;letter-spacing:.6px;">Policy status</th></tr>{table_rows}</table>
"""
    return subject, body, email_shell(
        f"{course['code']} — {assignment.name}", "Late-submission totals", content
    )


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


def send_message(account, recipient: str, subject: str, body: str, html_body: str | None = None) -> None:
    message = account.new_message()
    message.to.add(recipient)
    message.subject = subject
    message.body_type = "HTML"
    message.body = html_body or html.escape(body).replace("\n", "<br>")
    if not message.send():
        raise RuntimeError("Microsoft Graph did not confirm delivery")


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
        gs = PersistentGradescopeConnection(config["gradescope"], database, current)
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
                if current > late:
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
                        send_message(
                            mail_account, config["delivery"]["summary_email"],
                            subject, body, html_body,
                        )
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
                    send_message(mail_account, config["delivery"]["summary_email"], subject, body, html_body)
                    if not failures:
                        database.execute(
                            "INSERT OR REPLACE INTO completed_runs VALUES (?, ?, ?)",
                            (str(course["id"]), assignment.assignment_id, current.isoformat()),
                        )
                        database.commit()
                print(f"{course['code']} {assignment.name}: missing={len(missing)}, sent={len(sent)}, skipped={len(skipped)}, excluded={len(excluded)}, failed={len(failures)}")
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
