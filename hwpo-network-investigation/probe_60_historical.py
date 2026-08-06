#!/usr/bin/env python3
"""Probe whether pre-286 60 1.0 days are exposed by the date/plan API."""

from __future__ import annotations

import json
import time
from datetime import date, timedelta
from pathlib import Path

from fetch_next_two_weeks import credentials
from fetch_one_day import embedded_oauth_fields, request_json


ROOT = Path(__file__).resolve().parent
OUTPUT = ROOT / "hwpo-60-historical-probe.json"
PLAN_ID = 77
KNOWN_DAY = 286
KNOWN_DATE = date(2024, 10, 5)
PROBE_DAYS = (285, 284, 280, 250, 200, 100, 1)
DELAY_SECONDS = 1.0


def main() -> int:
    email, password = credentials()
    if not email or not password:
        print("Email and password are required.")
        return 2

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

    probes: list[dict[str, object]] = []
    try:
        for index, day_number in enumerate(PROBE_DAYS):
            if index:
                time.sleep(DELAY_SECONDS)
            workout_date = KNOWN_DATE + timedelta(days=day_number - KNOWN_DAY)
            response = request_json(
                f"athlete/schedules/{workout_date.isoformat()}/plans/{PLAN_ID}",
                token=token,
            )
            schedule = response.get("schedule", response)
            actual_day = schedule.get("day_number") if isinstance(schedule, dict) else None
            sections = schedule.get("sections", []) if isinstance(schedule, dict) else []
            record = {
                "requested_day_number": day_number,
                "requested_date": workout_date.isoformat(),
                "actual_day_number": actual_day,
                "schedule_id": schedule.get("id") if isinstance(schedule, dict) else None,
                "section_count": len(sections) if isinstance(sections, list) else 0,
                "real_schedule": actual_day == day_number and bool(sections),
            }
            probes.append(record)
            print(json.dumps(record), flush=True)
    finally:
        password = ""

    OUTPUT.write_text(json.dumps({"probes": probes}, indent=2) + "\n")
    print(f"Saved {OUTPUT}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
