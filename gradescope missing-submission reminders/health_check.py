#!/usr/bin/env python3
"""Send a daily health report for the Gradescope reminder service."""

from __future__ import annotations

import re
from datetime import datetime
from zoneinfo import ZoneInfo

from gradescopeapi.classes.connection import GSConnection

from auth_check import create_account, secure_token_cache
from reminder import load_config, localize, read_gradescope_password, send_message


def main() -> int:
    config = load_config()
    timezone = ZoneInfo(config["schedule"]["timezone"])
    now = datetime.now(timezone)
    account, _ = create_account()
    if not account.is_authenticated:
        raise RuntimeError("Microsoft authentication is unavailable; run auth_check.py")

    connection = GSConnection()
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
        settings = config["gradescope"]
        connection.login(settings["email"], read_gradescope_password(settings))
        for course in config["courses"]:
            pattern = re.compile(course["assignment_pattern"])
            assignments = connection.account.get_assignments(str(course["id"]))
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
        if connection.logged_in:
            try:
                connection.logout()
            except Exception:
                pass

    subject = lines[0]
    send_message(account, config["delivery"]["summary_email"], subject, "\n".join(lines) + "\n")
    secure_token_cache()
    print(subject)
    return 0 if subject.endswith("OK") else 1


if __name__ == "__main__":
    raise SystemExit(main())
