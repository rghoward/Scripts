#!/usr/bin/env python3
"""Fetch the next paired block of FLAGSHIP 1.0 and 60 1.0."""

from __future__ import annotations

import getpass
import json
import subprocess
import time
import urllib.error
from datetime import date, timedelta
from pathlib import Path

from fetch_one_day import embedded_oauth_fields, request_json


ROOT = Path(__file__).resolve().parent
REQUEST_DELAY_SECONDS = 0.5
BATCH_DAYS = 140
ALL_OUTPUT = ROOT / "hwpo-all-remaining-days.json"
ALL_CHECKPOINT = ROOT / "hwpo-all-remaining-days-checkpoint.json"
KEYCHAIN_EMAIL_SERVICE = "com.questforge.hwpo.email"
KEYCHAIN_PASSWORD_SERVICE = "com.questforge.hwpo.password"
KEYCHAIN_ACCOUNT = "default"

BASE_TARGETS = (
    {
        "plan_id": 73,
        "plan_title": "FLAGSHIP 1.0",
        "first_day": 15,
        "first_date": date(2023, 4, 16),
    },
    {
        "plan_id": 77,
        "plan_title": "60 1.0",
        "first_day": 300,
        "first_date": date(2024, 10, 19),
    },
)


def save(records: dict[str, object], path: Path) -> None:
    temporary = path.with_suffix(".tmp")
    temporary.write_text(json.dumps(records, indent=2, ensure_ascii=False) + "\n")
    temporary.replace(path)


def export_records(
    records: dict[str, object], path: Path, *, complete: bool
) -> None:
    ordered = sorted(
        records.values(),
        key=lambda item: (item["plan_id"], item["requested_day_number"]),
    )
    save(
        {
            "complete": complete,
            "request_delay_seconds": REQUEST_DELAY_SECONDS,
            "workout_count": len(ordered),
            "records": ordered,
        },
        path,
    )


def keychain_read(service: str) -> str | None:
    result = subprocess.run(
        ["/usr/bin/security", "find-generic-password", "-a", KEYCHAIN_ACCOUNT,
         "-s", service, "-w"],
        capture_output=True,
        text=True,
    )
    return result.stdout.rstrip("\n") if result.returncode == 0 else None


def keychain_write(service: str, secret: str) -> None:
    subprocess.run(
        ["/usr/bin/security", "add-generic-password", "-U", "-a", KEYCHAIN_ACCOUNT,
         "-s", service, "-w", secret],
        check=True,
        stdout=subprocess.DEVNULL,
    )


def credentials() -> tuple[str, str]:
    email = keychain_read(KEYCHAIN_EMAIL_SERVICE)
    password = keychain_read(KEYCHAIN_PASSWORD_SERVICE)
    if email and password:
        print("Using HWPO credentials from macOS Keychain.\n")
        return email, password

    email = input("HWPO email: ").strip()
    password = getpass.getpass("HWPO password: ")
    if email and password:
        answer = input("Save these credentials in macOS Keychain? [Y/n]: ").strip().casefold()
        if answer in ("", "y", "yes"):
            keychain_write(KEYCHAIN_EMAIL_SERVICE, email)
            keychain_write(KEYCHAIN_PASSWORD_SERVICE, password)
            print("Saved securely in macOS Keychain.\n")
    return email, password


def batch_paths(flagship_first_day: int) -> tuple[Path, Path]:
    flagship_last_day = flagship_first_day + BATCH_DAYS - 1
    stem = f"hwpo-flagship-60-days-{flagship_first_day}-{flagship_last_day}"
    return ROOT / f"{stem}.json", ROOT / f"{stem}-checkpoint.json"


def completed_output(path: Path) -> bool:
    if not path.exists():
        return False
    try:
        saved = json.loads(path.read_text())
        return isinstance(saved, dict) and saved.get("workout_count") == BATCH_DAYS * 2
    except (OSError, ValueError):
        return False


def next_batch() -> tuple[tuple[dict[str, object], ...], Path, Path]:
    batch_index = 0
    while True:
        flagship_first_day = BASE_TARGETS[0]["first_day"] + batch_index * BATCH_DAYS
        output, checkpoint = batch_paths(flagship_first_day)
        if not completed_output(output):
            targets = tuple(
                {
                    **target,
                    "first_day": target["first_day"] + batch_index * BATCH_DAYS,
                    "first_date": target["first_date"] + timedelta(days=batch_index * BATCH_DAYS),
                }
                for target in BASE_TARGETS
            )
            return targets, output, checkpoint
        batch_index += 1


def validate_response(response: object, target: dict[str, object], day_number: int) -> None:
    if not isinstance(response, dict):
        raise RuntimeError("Workout response was not an object")
    schedule = response.get("schedule", response)
    if not isinstance(schedule, dict):
        raise RuntimeError("Workout response contained no schedule")
    plan = schedule.get("plan")
    actual_title = plan.get("title") if isinstance(plan, dict) else None
    actual_day = schedule.get("day_number")
    if actual_title != target["plan_title"] or actual_day != day_number:
        raise RuntimeError(
            f"Server returned {actual_title!r} Day {actual_day!r}; "
            f"expected {target['plan_title']} Day {day_number}"
        )


def records_from_file(path: Path) -> list[dict[str, object]]:
    try:
        saved = json.loads(path.read_text())
    except (OSError, ValueError):
        return []
    if isinstance(saved, dict) and isinstance(saved.get("records"), list):
        return [record for record in saved["records"] if isinstance(record, dict)]
    if isinstance(saved, dict):
        return [record for record in saved.values() if isinstance(record, dict)]
    return []


def latest_saved_days() -> dict[int, int]:
    latest = {int(target["plan_id"]): int(target["first_day"]) - 1 for target in BASE_TARGETS}
    paths = set(ROOT.glob("hwpo-flagship-60-days-*.json"))
    paths.update(ROOT.glob("hwpo-flagship-60-days-*-checkpoint.json"))
    for path in paths:
        for record in records_from_file(path):
            plan_id = record.get("plan_id")
            day_number = record.get("requested_day_number")
            if isinstance(plan_id, int) and isinstance(day_number, int) and plan_id in latest:
                latest[plan_id] = max(latest[plan_id], day_number)
    return latest


def save_all_progress(
    records: dict[str, object], next_days: dict[int, int], completed: set[int]
) -> None:
    save(
        {
            "records": records,
            "next_days": {str(key): value for key, value in next_days.items()},
            "completed_plan_ids": sorted(completed),
        },
        ALL_CHECKPOINT,
    )


def main() -> int:
    latest = latest_saved_days()
    next_days = {plan_id: day + 1 for plan_id, day in latest.items()}
    records: dict[str, object] = {}
    completed: set[int] = set()
    if ALL_CHECKPOINT.exists():
        saved = json.loads(ALL_CHECKPOINT.read_text())
        if isinstance(saved, dict):
            saved_records = saved.get("records")
            if isinstance(saved_records, dict):
                records = saved_records
            saved_next = saved.get("next_days")
            if isinstance(saved_next, dict):
                next_days.update({int(key): int(value) for key, value in saved_next.items()})
            saved_completed = saved.get("completed_plan_ids")
            if isinstance(saved_completed, list):
                completed = {int(plan_id) for plan_id in saved_completed}

    print("HWPO all-remaining-days import")
    for target in BASE_TARGETS:
        print(f"{target['plan_title']}: starting at Day {next_days[int(target['plan_id'])]}")
    print(f"One request every {REQUEST_DELAY_SECONDS} seconds; progress is checkpointed.")
    print("Credentials and access tokens are not written to disk.\n")

    email, password = credentials()
    if not email or not password:
        print("Email and password are required.")
        return 2

    if records:
        print(f"Resuming with {len(records)} newly fetched workouts already saved.\n")

    stage = "login"
    try:
        client_id, client_secret = embedded_oauth_fields()
        auth = request_json(
            "users/sign_in",
            method="POST",
            form={
                "client_id": client_id,
                "client_secret": client_secret,
                "email": email,
                "password": password,
            },
        )
        token = auth.get("access_token") if isinstance(auth, dict) else None
        if not isinstance(token, str):
            raise RuntimeError("Login returned no access token")

        while len(completed) < len(BASE_TARGETS):
            for target in BASE_TARGETS:
                plan_id = int(target["plan_id"])
                if plan_id in completed:
                    continue
                day_number = next_days[plan_id]
                workout_date = target["first_date"] + timedelta(
                    days=day_number - int(target["first_day"])
                )
                key = f"{target['plan_id']}:{day_number}"
                if records or day_number > latest[plan_id] + 1:
                    print(f"Waiting {REQUEST_DELAY_SECONDS}s before the next request...", flush=True)
                    time.sleep(REQUEST_DELAY_SECONDS)

                stage = f"{target['plan_title']} Day {day_number}"
                path = (
                    f"athlete/schedules/{workout_date.isoformat()}"
                    f"/plans/{target['plan_id']}"
                )
                response = request_json(path, token=token)
                validate_response(response, target, day_number)
                records[key] = {
                    "plan_id": target["plan_id"],
                    "plan_title": target["plan_title"],
                    "requested_day_number": day_number,
                    "requested_date": workout_date.isoformat(),
                    "response": response,
                }
                next_days[plan_id] = day_number + 1
                schedule = response.get("schedule", response)
                if isinstance(schedule, dict) and schedule.get("can_navigate_forward") is False:
                    completed.add(plan_id)
                    print(f"Reached the final day of {target['plan_title']}.")
                save_all_progress(records, next_days, completed)
                print(f"Saved {stage} ({len(records)} new workouts)", flush=True)

        export_records(records, ALL_OUTPUT, complete=True)
    except urllib.error.HTTPError as exc:
        save_all_progress(records, next_days, completed)
        export_records(records, ALL_OUTPUT, complete=False)
        if exc.code == 429:
            print(f"HWPO rate-limited the importer during {stage}; stopping immediately.")
        else:
            print(f"HWPO returned HTTP {exc.code} during {stage}; stopping.")
        print(f"Saved progress remains in {ALL_CHECKPOINT}.")
        return 1
    except Exception as exc:
        save_all_progress(records, next_days, completed)
        export_records(records, ALL_OUTPUT, complete=False)
        print(f"Import stopped during {stage}: {exc}")
        print(f"Saved progress remains in {ALL_CHECKPOINT}.")
        return 1
    finally:
        password = ""

    print(f"\nSaved all {len(records)} remaining workouts to:\n{ALL_OUTPUT}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
