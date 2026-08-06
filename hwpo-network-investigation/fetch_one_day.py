#!/usr/bin/env python3
"""Fetch one day of the current user's HWPO schedules without persisting credentials."""

from __future__ import annotations

import getpass
import json
import re
import subprocess
import sys
import urllib.error
import urllib.parse
import urllib.request
from datetime import datetime, timedelta, timezone
from pathlib import Path
from zoneinfo import ZoneInfo


ROOT = Path(__file__).resolve().parent
APK = ROOT / "hwpo-base.apk"
OUTPUT = ROOT / "workouts-2024-01-01.json"
API = "https://app.hwpo-training.com/mobile/api/v4/"
DAY = datetime(2024, 1, 1, tzinfo=ZoneInfo("America/New_York"))


def embedded_oauth_fields() -> tuple[str, str]:
    """Read the mobile client's embedded identifiers from the locally copied APK."""
    dex = subprocess.run(
        ["unzip", "-p", str(APK), "classes.dex"],
        check=True,
        capture_output=True,
    ).stdout
    match = re.search(
        rb"clientSecret=([^,\x00]+), clientId=([^,\x00]+), hwpoSignUpUrl=",
        dex,
    )
    if not match:
        raise RuntimeError("Could not locate the app client configuration in the APK")
    return match.group(2).decode(), match.group(1).decode()


def request_json(
    path: str,
    *,
    method: str = "GET",
    token: str | None = None,
    form: dict[str, str] | None = None,
) -> object:
    headers = {"Accept": "application/json"}
    body = None
    if token:
        headers["Authorization"] = f"Bearer {token}"
    if form is not None:
        body = urllib.parse.urlencode(form).encode()
        headers["Content-Type"] = "application/x-www-form-urlencoded"
    request = urllib.request.Request(API + path, data=body, headers=headers, method=method)
    with urllib.request.urlopen(request, timeout=30) as response:
        return json.load(response)


def main() -> int:
    print("HWPO one-day import: January 1, 2024")
    print("Credentials and access tokens are not written to disk.\n")
    email = input("HWPO email: ").strip()
    password = getpass.getpass("HWPO password: ")
    if not email or not password:
        print("Email and password are required.", file=sys.stderr)
        return 2

    stage = "reading client configuration"
    try:
        client_id, client_secret = embedded_oauth_fields()
        stage = "login"
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
        if not isinstance(auth, dict) or not isinstance(auth.get("access_token"), str):
            raise RuntimeError("Login succeeded but returned no access token")
        token = auth["access_token"]
        start = int(DAY.timestamp())
        # The server accepts midnight boundaries and returns that boundary
        # inclusively. Filter summaries to the requested day client-side.
        end = int((DAY + timedelta(days=1)).timestamp())
        query = urllib.parse.urlencode({"from": start, "to": end})
        stage = "schedule list"
        schedules = request_json(f"schedules?{query}", token=token)
        if not isinstance(schedules, dict) or not isinstance(schedules.get("schedules"), list):
            raise RuntimeError("Schedule list returned an unexpected response")

        requested_summaries = []
        for summary in schedules["schedules"]:
            schedule_date = summary.get("date") if isinstance(summary, dict) else None
            if not isinstance(schedule_date, int):
                continue
            api_day = datetime.fromtimestamp(schedule_date, timezone.utc).date()
            if api_day == DAY.date():
                requested_summaries.append(summary)
        details = []
        for summary in requested_summaries:
            schedule_id = summary.get("id") if isinstance(summary, dict) else None
            if not isinstance(schedule_id, int):
                raise RuntimeError("A schedule record did not contain an integer ID")
            stage = "schedule detail"
            detail = request_json(f"schedules/{schedule_id}/", token=token)
            details.append(detail)

        output = {
            "requested_date": "2024-01-01",
            "range": {"from": start, "to": end},
            "schedule_summaries": requested_summaries,
            "schedule_details": details,
            "launch_dates": schedules.get("launch_dates", []),
        }
        OUTPUT.write_text(json.dumps(output, indent=2, ensure_ascii=False) + "\n")
    except urllib.error.HTTPError as exc:
        print(
            f"HWPO returned HTTP {exc.code} during {stage}. No output file was written.",
            file=sys.stderr,
        )
        return 1
    except (OSError, ValueError, RuntimeError, urllib.error.URLError) as exc:
        print(f"Import failed: {exc}", file=sys.stderr)
        return 1
    finally:
        password = ""

    count = len(output["schedule_details"])
    print(f"\nSaved {count} full schedule record(s) to:\n{OUTPUT}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
