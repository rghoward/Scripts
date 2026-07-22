#!/usr/bin/env python3
"""Check configured Gradescope homework and send policy-aware reminders."""

from __future__ import annotations

import argparse
import csv
import html
import io
import os
import re
import sqlite3
import subprocess
import sys
import tomllib
from dataclasses import dataclass
from datetime import datetime, timedelta
from pathlib import Path
from zoneinfo import ZoneInfo

from gradescopeapi.classes.connection import GSConnection

from auth_check import create_account, secure_token_cache


PROJECT_DIR = Path(__file__).resolve().parent
CONFIG_PATH = PROJECT_DIR / "config.local.toml"


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
    database.commit()
    path.chmod(0o600)
    return database


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


def missing_students(connection: GSConnection, course_id: str, assignment_id: str) -> list[Student]:
    url = f"{connection.gradescope_base_url}/courses/{course_id}/assignments/{assignment_id}/scores.csv"
    response = connection.session.get(url, timeout=30)
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


def send_failure_summary(config: dict, error: Exception) -> None:
    """Best-effort notification for an automatic run that failed before its normal report."""
    try:
        account, _ = create_account()
        if not account.is_authenticated:
            return
        send_message(
            account,
            config["delivery"]["summary_email"],
            "Gradescope reminder run FAILED",
            "The automated Gradescope reminder check did not complete.\n\n"
            f"Error: {error}\n\nNo further messages were attempted after this error.\n",
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
    gs = GSConnection()
    mail_account = None
    eligible_count = 0
    try:
        gs_settings = config["gradescope"]
        gs.login(gs_settings["email"], read_gradescope_password(gs_settings))
        for course in config["courses"]:
            assignments = gs.account.get_assignments(str(course["id"]))
            pattern = re.compile(course["assignment_pattern"])
            for assignment in assignments:
                if not pattern.search(assignment.name) or assignment.due_date is None:
                    continue
                due = localize(assignment.due_date, timezone)
                late = effective_late_deadline(assignment, timezone, int(course["late_hours"]))
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
        if gs.logged_in:
            try:
                gs.logout()
            except Exception:
                pass
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
        raise SystemExit(run(dry_run=not args.send))
    except Exception as exc:
        print(f"ERROR: {exc}", file=sys.stderr)
        if args.send:
            send_failure_summary(config, exc)
        raise SystemExit(1)


if __name__ == "__main__":
    main()
