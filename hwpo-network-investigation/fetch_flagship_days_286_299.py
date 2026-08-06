#!/usr/bin/env python3
"""Fetch FLAGSHIP 1.0 Days 286-299 using read-only date-and-plan requests."""

from __future__ import annotations

import getpass
import json
import time
import urllib.error
from datetime import date, timedelta
from pathlib import Path

from fetch_one_day import embedded_oauth_fields, request_json


OUTPUT = Path(__file__).resolve().parent / "hwpo-flagship-1.0-days-286-299.json"
PLAN_ID = 73
FIRST_DAY = 286
LAST_DAY = 299
FIRST_DATE = date(2024, 1, 12)


def main() -> int:
    print("Target: FLAGSHIP 1.0 Days 286-299 (January 12-25, 2024)")
    print("Credentials and access tokens are not written to disk.\n")
    email = input("HWPO email: ").strip()
    password = getpass.getpass("HWPO password: ")
    records = []
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

        for day_number in range(FIRST_DAY, LAST_DAY + 1):
            workout_date = FIRST_DATE + timedelta(days=day_number - FIRST_DAY)
            stage = f"Day {day_number} ({workout_date.isoformat()})"
            path = f"athlete/schedules/{workout_date.isoformat()}/plans/{PLAN_ID}"
            for attempt in range(1, 4):
                try:
                    result = request_json(path, token=token)
                    break
                except urllib.error.URLError:
                    if attempt == 3:
                        raise
                    time.sleep(attempt)
            records.append(
                {
                    "requested_day_number": day_number,
                    "requested_date": workout_date.isoformat(),
                    "response": result,
                }
            )
            print(f"Fetched Day {day_number}")

        output = {
            "plan_id": PLAN_ID,
            "plan_title": "FLAGSHIP 1.0",
            "first_day": FIRST_DAY,
            "last_day": LAST_DAY,
            "records": records,
        }
        OUTPUT.write_text(json.dumps(output, indent=2, ensure_ascii=False) + "\n")
    except urllib.error.HTTPError as exc:
        print(f"HWPO returned HTTP {exc.code} during {stage}; nothing was saved.")
        return 1
    except Exception as exc:
        print(f"Request failed during {stage}: {exc}")
        return 1
    finally:
        password = ""

    print(f"\nSaved {len(records)} Flagship records to:\n{OUTPUT}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
