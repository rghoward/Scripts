#!/usr/bin/env python3
"""Read-only Gradescope connection and course/assignment discovery check."""

from __future__ import annotations

import os
import subprocess
import sys
import tomllib
from pathlib import Path

from gradescopeapi.classes.connection import GSConnection


PROJECT_DIR = Path(__file__).resolve().parent
CONFIG_PATH = PROJECT_DIR / "config.local.toml"


def load_settings() -> tuple[str, str, str]:
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
    return email, service, password_env


def read_password(email: str, service: str, password_env: str) -> str:
    if password_env and os.environ.get(password_env):
        return os.environ[password_env]
    if sys.platform != "darwin":
        raise RuntimeError(
            f"Set {password_env or 'GRADESCOPE_REMINDER_PASSWORD'} on this system."
        )
    result = subprocess.run(
        ["/usr/bin/security", "find-generic-password", "-a", email, "-s", service, "-w"],
        check=False,
        capture_output=True,
        text=True,
    )
    password = result.stdout.rstrip("\n")
    if result.returncode != 0 or not password:
        raise RuntimeError(
            f"No Gradescope password was found in Keychain for account {email!r} "
            f"and service {service!r}."
        )
    return password


def format_date(value: object) -> str:
    return value.strftime("%Y-%m-%d %H:%M") if value else "not set"


def main() -> int:
    connection = GSConnection()
    logged_in = False
    try:
        email, service, password_env = load_settings()
        password = read_password(email, service, password_env)
        print("Connecting to Gradescope in read-only discovery mode…")
        connection.login(email, password)
        logged_in = True

        courses = connection.account.get_courses().get("instructor", {})
        if not courses:
            print("Connection succeeded, but no instructor courses were found.")
            return 0

        print(f"Connection succeeded. Found {len(courses)} instructor course(s).")
        for course_id, course in courses.items():
            title = course.full_name or course.name
            term = " ".join(part for part in (course.semester, course.year) if part)
            suffix = f" — {term}" if term else ""
            print(f"\n{title}{suffix} [course {course_id}]")
            assignments = connection.account.get_assignments(course_id)
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
        if logged_in:
            try:
                connection.logout()
            except Exception:
                pass


if __name__ == "__main__":
    raise SystemExit(main())
