#!/usr/bin/env python3
"""Read-only Gradescope connection and course/assignment discovery check."""

from __future__ import annotations

import sys
import tomllib
from datetime import datetime
from pathlib import Path

from reminder import PersistentGradescopeConnection, open_database, run_lock


PROJECT_DIR = Path(__file__).resolve().parent
CONFIG_PATH = PROJECT_DIR / "config.local.toml"


def load_settings() -> dict:
    if not CONFIG_PATH.exists():
        raise RuntimeError(
            "config.local.toml is missing; copy config.example.toml and configure it first."
        )

    with CONFIG_PATH.open("rb") as config_file:
        config = tomllib.load(config_file)

    gradescope = config.get("gradescope", {})
    email = str(gradescope.get("email", "")).strip()
    service = str(gradescope.get("keychain_service", "")).strip()
    password_env = str(
        gradescope.get("password_env", "GRADESCOPE_REMINDER_PASSWORD")
    ).strip()
    if not email:
        raise RuntimeError("The [gradescope] email setting is required.")
    if sys.platform == "darwin" and not service:
        raise RuntimeError("The [gradescope] keychain_service setting is required on macOS.")
    return {
        "email": email,
        "keychain_service": service,
        "password_env": password_env,
    }


def format_date(value: object) -> str:
    return value.strftime("%Y-%m-%d %H:%M") if value else "not set"


def main() -> int:
    database = open_database()
    connection = None
    try:
        settings = load_settings()
        print("Connecting to Gradescope in read-only discovery mode…")
        connection = PersistentGradescopeConnection(settings, database, datetime.now().astimezone())

        courses = connection.call(
            lambda current: current.account.get_courses()
        ).get("instructor", {})
        if not courses:
            print("Connection succeeded, but no instructor courses were found.")
            return 0

        print(f"Connection succeeded. Found {len(courses)} instructor course(s).")
        for course_id, course in courses.items():
            title = course.full_name or course.name
            term = " ".join(part for part in (course.semester, course.year) if part)
            suffix = f" — {term}" if term else ""
            print(f"\n{title}{suffix} [course {course_id}]")
            assignments = connection.get_assignments(course_id)
            if not assignments:
                print("  No assignments found.")
                continue
            for assignment in assignments:
                print(
                    f"  - {assignment.name} [assignment {assignment.assignment_id}] "
                    f"due {format_date(assignment.due_date)}; "
                    f"late due {format_date(assignment.late_due_date)}"
                )
        return 0
    except Exception as exc:
        print(f"ERROR: Gradescope discovery failed: {exc}", file=sys.stderr)
        return 1
    finally:
        if connection is not None:
            connection.save()
        database.close()


if __name__ == "__main__":
    with run_lock() as acquired:
        if not acquired:
            raise SystemExit("Another Gradescope process is already running.")
        raise SystemExit(main())
