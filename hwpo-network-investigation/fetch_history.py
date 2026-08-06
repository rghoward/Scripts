#!/usr/bin/env python3
"""Fetch full HWPO history for plan titles containing FLAGSHIP or 60."""

from __future__ import annotations

import getpass
import json
import socket
import time
import urllib.error
import urllib.parse
from datetime import date, datetime, timedelta, timezone
from pathlib import Path
from zoneinfo import ZoneInfo

from fetch_one_day import embedded_oauth_fields, request_json


ROOT = Path(__file__).resolve().parent
OUTPUT = ROOT / "hwpo-60-first-two-weeks.json"
INDEX = ROOT / "hwpo-60-first-two-weeks-index.json"
CHECKPOINT = ROOT / "hwpo-60-first-two-weeks-checkpoint.json"
START_DATE = date(2022, 6, 1)
END_DATE = date(2023, 4, 2)
LOCAL_ZONE = ZoneInfo("America/New_York")
CHUNK_DAYS = 31


def local_midnight(day: date) -> datetime:
    return datetime(day.year, day.month, day.day, tzinfo=LOCAL_ZONE)


def plan_title(schedule: dict) -> str:
    plan = schedule.get("plan")
    return str(plan.get("title") or "") if isinstance(plan, dict) else ""


def wanted(schedule: dict) -> bool:
    title = plan_title(schedule).casefold()
    return "60" in title


def api_date(schedule: dict) -> str | None:
    value = schedule.get("date")
    if not isinstance(value, int):
        return None
    return datetime.fromtimestamp(value, timezone.utc).date().isoformat()


def request_with_retry(*args, attempts: int = 4, **kwargs):
    """Retry transient connection failures, but never retry HTTP responses."""
    for attempt in range(1, attempts + 1):
        try:
            return request_json(*args, **kwargs)
        except (TimeoutError, socket.timeout, urllib.error.URLError) as exc:
            if attempt == attempts:
                raise
            delay = attempt * 2
            print(f"Transient connection error; retrying in {delay}s: {exc}", flush=True)
            time.sleep(delay)


def save_checkpoint(details_by_id: dict[int, object]) -> None:
    temporary = CHECKPOINT.with_suffix(".tmp")
    temporary.write_text(
        json.dumps({str(key): value for key, value in details_by_id.items()}, ensure_ascii=False)
        + "\n"
    )
    temporary.replace(CHECKPOINT)


def main() -> int:
    print("HWPO first-two-weeks import")
    print(f"Range: {START_DATE} through {END_DATE}")
    print("Plan filter: titles containing 60 only")
    print("Credentials and access tokens are not written to disk.\n")
    email = input("HWPO email: ").strip()
    password = getpass.getpass("HWPO password: ")
    if not email or not password:
        print("Email and password are required.")
        return 2

    stage = "login"
    try:
        client_id, client_secret = embedded_oauth_fields()
        auth = request_with_retry(
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

        summaries_by_id: dict[int, dict] = {}
        cursor = START_DATE
        chunk_number = 0
        while cursor <= END_DATE:
            chunk_number += 1
            boundary = min(cursor + timedelta(days=CHUNK_DAYS), END_DATE + timedelta(days=1))
            start_epoch = int(local_midnight(cursor).timestamp())
            end_epoch = int(local_midnight(boundary).timestamp())
            query = urllib.parse.urlencode({"from": start_epoch, "to": end_epoch})
            stage = f"calendar chunk beginning {cursor}"
            response = request_with_retry(f"schedules?{query}", token=token)
            records = response.get("schedules", []) if isinstance(response, dict) else []
            for record in records:
                if not isinstance(record, dict) or not wanted(record):
                    continue
                record_day = api_date(record)
                record_id = record.get("id")
                if (
                    isinstance(record_id, int)
                    and record_day is not None
                    and START_DATE.isoformat() <= record_day <= END_DATE.isoformat()
                ):
                    summaries_by_id[record_id] = record
            print(
                f"Calendar {cursor}..{boundary}: "
                f"{len(summaries_by_id)} matching unique schedules",
                flush=True,
            )
            cursor = boundary
            time.sleep(0.15)

        ordered_summaries = sorted(
            summaries_by_id.values(),
            key=lambda item: (api_date(item) or "", plan_title(item), item.get("id", 0)),
        )

        grouped: dict[str, list[dict]] = {}
        for summary in ordered_summaries:
            grouped.setdefault(plan_title(summary), []).append(summary)

        selected_summaries = []
        print("\nFirst-two-weeks selection:", flush=True)
        for title, records in sorted(grouped.items(), key=lambda pair: pair[0].casefold()):
            days_1_to_14 = [
                record
                for record in records
                if isinstance(record.get("day_number"), int)
                and 1 <= record["day_number"] <= 14
            ]
            if days_1_to_14:
                chosen = sorted(
                    days_1_to_14,
                    key=lambda item: (item.get("day_number"), api_date(item) or "", item["id"]),
                )
            else:
                # Some plans do not expose day numbers in the list response.
                chosen = sorted(records, key=lambda item: (api_date(item) or "", item["id"]))[:14]
            selected_summaries.extend(chosen)
            available_days = sorted(
                {record.get("day_number") for record in chosen if isinstance(record.get("day_number"), int)}
            )
            print(
                f"  {title}: {len(chosen)} schedules; selected day numbers={available_days or 'not exposed'}",
                flush=True,
            )

        ordered_summaries = sorted(
            selected_summaries,
            key=lambda item: (plan_title(item).casefold(), item.get("day_number") or 0, api_date(item) or ""),
        )
        details_by_id: dict[int, object] = {}
        if CHECKPOINT.exists():
            saved = json.loads(CHECKPOINT.read_text())
            if isinstance(saved, dict):
                details_by_id = {int(key): value for key, value in saved.items()}
            print(f"Resuming with {len(details_by_id)} checkpointed details.", flush=True)

        index = []
        total = len(ordered_summaries)
        for position, summary in enumerate(ordered_summaries, 1):
            schedule_id = summary["id"]
            stage = f"detail {position}/{total}"
            wrapper = details_by_id.get(schedule_id)
            fetched_now = wrapper is None
            if wrapper is None:
                wrapper = request_with_retry(f"schedules/{schedule_id}/", token=token)
                details_by_id[schedule_id] = wrapper
                save_checkpoint(details_by_id)
            schedule = wrapper.get("schedule", wrapper) if isinstance(wrapper, dict) else {}
            index.append(
                {
                    "schedule_id": schedule_id,
                    "date": api_date(schedule) or api_date(summary),
                    "plan_title": plan_title(schedule) or plan_title(summary),
                    "day_number": schedule.get("day_number") if isinstance(schedule, dict) else None,
                    "section_count": len(schedule.get("sections") or []) if isinstance(schedule, dict) else 0,
                }
            )
            print(
                f"Details {position}/{total}: {index[-1]['date']} "
                f"{index[-1]['plan_title']} day={index[-1]['day_number']}",
                flush=True,
            )
            if fetched_now:
                time.sleep(0.25)

        details = [details_by_id[summary["id"]] for summary in ordered_summaries]

        index.sort(key=lambda item: (item["plan_title"].casefold(), item["date"] or "", item["schedule_id"]))
        output = {
            "requested_range": {"from": START_DATE.isoformat(), "to": END_DATE.isoformat()},
            "plan_filter": "case-insensitive title contains 60",
            "detail_filter": "day_number 1 through 14 per distinct plan title; earliest 14 if day numbers are unavailable",
            "schedule_count": len(details),
            "schedule_summaries": ordered_summaries,
            "schedule_details": details,
        }
        OUTPUT.write_text(json.dumps(output, indent=2, ensure_ascii=False) + "\n")
        INDEX.write_text(json.dumps(index, indent=2, ensure_ascii=False) + "\n")
    except urllib.error.HTTPError as exc:
        print(f"HWPO returned HTTP {exc.code} during {stage}. No new output was saved.")
        return 1
    except (OSError, ValueError, RuntimeError, urllib.error.URLError) as exc:
        print(f"Import failed during {stage}: {exc}")
        return 1
    finally:
        password = ""

    print(f"\nSaved {len(details)} full schedules to:\n{OUTPUT}")
    print(f"Saved searchable index to:\n{INDEX}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
