#!/usr/bin/env python3
"""Send a daily health report for the Gradescope reminder service."""

from __future__ import annotations

import re
from datetime import datetime
from zoneinfo import ZoneInfo

from auth_check import create_account, secure_token_cache
from reminder import (
    PersistentGradescopeConnection,
    load_config,
    localize,
    open_database,
    run_lock,
    send_message,
)


def main() -> int:
    config = load_config()
    timezone = ZoneInfo(config["schedule"]["timezone"])
    now = datetime.now(timezone)
    account, _ = create_account()
    if not account.is_authenticated:
        raise RuntimeError("Microsoft authentication is unavailable; run auth_check.py")

    database = open_database()
    connection = None
    lines = [
        "Gradescope reminder daily health check: OK",
        "",
        f"Checked: {now.strftime('%A, %B %-d at %-I:%M %p %Z')}",
        "Microsoft Mail.Send: available",
        "Gradescope login: available",
        f"Delivery mode: {config['delivery'].get('mode', 'dry-run')}",
        "",
        "Configured courses and next homework:",
    ]
    try:
        connection = PersistentGradescopeConnection(config["gradescope"], database, now)
        for course in config["courses"]:
            pattern = re.compile(course["assignment_pattern"])
            assignments = connection.get_assignments(str(course["id"]))
            upcoming = [
                item for item in assignments
                if item.due_date is not None
                and pattern.search(item.name)
                and localize(item.due_date, timezone) >= now
            ]
            if upcoming:
                assignment = min(
                    upcoming, key=lambda item: localize(item.due_date, timezone)
                )
                due = localize(assignment.due_date, timezone)
                lines.append(
                    f"- {course['code']}: {assignment.name}, due "
                    f"{due.strftime('%A, %B %-d at %-I:%M %p %Z')}"
                )
            else:
                lines.append(f"- {course['code']}: no upcoming matching homework")
    except Exception as exc:
        lines[0] = "Gradescope reminder daily health check: FAILED"
        lines.append("")
        lines.append(f"Failure: {exc}")
    finally:
        if connection is not None:
            connection.save()
        database.close()

    subject = lines[0]
    send_message(account, config["delivery"]["summary_email"], subject, "\n".join(lines) + "\n")
    secure_token_cache()
    print(subject)
    return 0 if subject.endswith("OK") else 1


if __name__ == "__main__":
    with run_lock() as acquired:
        if not acquired:
            print("Another Gradescope process is already running; skipping health check.")
            raise SystemExit(0)
        raise SystemExit(main())
