#!/usr/bin/env python3
"""Preview or email rendered course templates using current Gradescope assignments."""

from __future__ import annotations

import argparse
import re
from datetime import datetime
from zoneinfo import ZoneInfo

from auth_check import create_account, fail, secure_token_cache
from reminder import (
    PersistentGradescopeConnection,
    Student,
    effective_late_deadline,
    load_config,
    localize,
    open_database,
    run_lock,
    send_message,
    student_message,
    summary_message,
)


TEST_RECIPIENT = "rghoward1988@gmail.com"


def next_homework(assignments, course: dict, timezone: ZoneInfo):
    pattern = re.compile(course["assignment_pattern"])
    now = datetime.now(timezone)
    matches = [
        assignment for assignment in assignments
        if assignment.due_date is not None
        and pattern.search(assignment.name)
        and localize(assignment.due_date, timezone) >= now
    ]
    if not matches:
        raise RuntimeError(f"No upcoming homework found for {course['code']}")
    return min(matches, key=lambda assignment: localize(assignment.due_date, timezone))


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--send", action="store_true", help="Send all samples to the fixed test address")
    args = parser.parse_args()
    config = load_config()
    timezone = ZoneInfo(config["schedule"]["timezone"])
    database = open_database()
    gs = None
    rendered = []
    try:
        gs = PersistentGradescopeConnection(config["gradescope"], database, datetime.now(timezone))
        for course in config["courses"]:
            assignment = next_homework(gs.get_assignments(str(course["id"])), course, timezone)
            due = localize(assignment.due_date, timezone)
            late = effective_late_deadline(assignment, timezone, int(course["late_hours"]))
            sample_student = Student("Taylor", "Student", TEST_RECIPIENT)
            subject, body, html_body = student_message(sample_student, course, assignment, due, late)
            subject = f"[SAMPLE — {course['code']}] {subject}"
            rendered.append((subject, body, html_body))
            summary_subject, summary_body, summary_html = summary_message(
                course, assignment, due, late, [sample_student], [sample_student], [], [], [], True
            )
            rendered.append((f"[SAMPLE — {course['code']}] {summary_subject}", summary_body, summary_html))
    finally:
        if gs is not None:
            gs.save()
        database.close()

    for subject, body, _html_body in rendered:
        print(f"\nTo: {TEST_RECIPIENT}\nSubject: {subject}\n\n{body}")
    if not args.send:
        print("DRY RUN: no samples sent. Add --send to deliver these messages.")
        return

    account, _ = create_account()
    if not account.is_authenticated:
        fail("Microsoft authentication is unavailable. Run auth_check.py first.")
    for subject, body, html_body in rendered:
        send_message(account, TEST_RECIPIENT, subject, body, html_body)
    secure_token_cache()
    print(f"Sent {len(rendered)} sample messages to {TEST_RECIPIENT}.")


if __name__ == "__main__":
    with run_lock() as acquired:
        if not acquired:
            raise SystemExit("Another Gradescope process is already running.")
        main()
