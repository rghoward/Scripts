#!/usr/bin/env python3
"""Build canonical, deduplicated FLAGSHIP 1.0 and 60 1.0 exports."""

from __future__ import annotations

import json
from datetime import datetime, timezone
from pathlib import Path
from typing import Iterator


ROOT = Path(__file__).resolve().parent
OUTPUT_DIR = ROOT / "clean-data"
PLAN_TITLES = {73: "FLAGSHIP 1.0", 77: "60 1.0"}
GENERATED_NAMES = {
    "hwpo-flagship-1.0.json",
    "hwpo-60-1.0.json",
    "hwpo-workouts-complete.json",
    "manifest.json",
}


def atomic_write(path: Path, value: object) -> None:
    temporary = path.with_suffix(path.suffix + ".tmp")
    temporary.write_text(json.dumps(value, indent=2, ensure_ascii=False) + "\n")
    temporary.replace(path)


def candidate_entries(document: object) -> Iterator[dict[str, object]]:
    if not isinstance(document, dict):
        return

    records = document.get("records")
    if isinstance(records, list):
        yield from (record for record in records if isinstance(record, dict))
    elif isinstance(records, dict):
        yield from (record for record in records.values() if isinstance(record, dict))

    details = document.get("schedule_details")
    if isinstance(details, list):
        yield from (detail for detail in details if isinstance(detail, dict))

    # The original checkpoint format is a dictionary keyed by "plan_id:day".
    for key, value in document.items():
        if isinstance(key, str) and ":" in key and isinstance(value, dict):
            yield value


def normalize(entry: dict[str, object]) -> dict[str, object] | None:
    response = entry.get("response")
    if not isinstance(response, dict):
        response = entry if isinstance(entry.get("schedule"), dict) else None
    if response is None:
        return None

    schedule = response.get("schedule", response)
    if not isinstance(schedule, dict):
        return None
    plan = schedule.get("plan")
    if not isinstance(plan, dict):
        return None

    plan_id = entry.get("plan_id", plan.get("id"))
    day_number = entry.get("requested_day_number", schedule.get("day_number"))
    if plan_id not in PLAN_TITLES or not isinstance(day_number, int):
        return None
    if plan.get("id") != plan_id or schedule.get("day_number") != day_number:
        return None

    requested_date = entry.get("requested_date")
    if not isinstance(requested_date, str):
        timestamp = schedule.get("date")
        if not isinstance(timestamp, (int, float)):
            return None
        requested_date = datetime.fromtimestamp(timestamp, timezone.utc).date().isoformat()

    return {
        "plan_id": plan_id,
        "plan_title": PLAN_TITLES[plan_id],
        "requested_day_number": day_number,
        "requested_date": requested_date,
        "response": response,
    }


def record_score(record: dict[str, object]) -> int:
    response = record["response"]
    schedule = response.get("schedule", response)
    sections = schedule.get("sections", [])
    return len(json.dumps(response, ensure_ascii=False)) + 1000 * len(sections)


def main() -> int:
    records: dict[tuple[int, int], dict[str, object]] = {}
    duplicate_count = 0
    source_files: list[str] = []

    for path in sorted(ROOT.glob("hwpo*.json")):
        if path.name in GENERATED_NAMES or path.parent == OUTPUT_DIR:
            continue
        try:
            document = json.loads(path.read_text())
        except (OSError, ValueError):
            continue

        used = False
        for entry in candidate_entries(document):
            record = normalize(entry)
            if record is None:
                continue
            used = True
            key = (int(record["plan_id"]), int(record["requested_day_number"]))
            existing = records.get(key)
            if existing is not None:
                duplicate_count += 1
            if existing is None or record_score(record) > record_score(existing):
                records[key] = record
        if used:
            source_files.append(path.name)

    OUTPUT_DIR.mkdir(exist_ok=True)
    manifests: list[dict[str, object]] = []
    combined: list[dict[str, object]] = []
    output_names = {73: "hwpo-flagship-1.0.json", 77: "hwpo-60-1.0.json"}

    for plan_id, plan_title in PLAN_TITLES.items():
        plan_records = sorted(
            (record for (saved_plan_id, _), record in records.items() if saved_plan_id == plan_id),
            key=lambda record: int(record["requested_day_number"]),
        )
        days = [int(record["requested_day_number"]) for record in plan_records]
        missing = sorted(set(range(min(days), max(days) + 1)) - set(days)) if days else []
        dates = [str(record["requested_date"]) for record in plan_records]
        manifest = {
            "plan_id": plan_id,
            "plan_title": plan_title,
            "workout_count": len(plan_records),
            "first_day": min(days) if days else None,
            "last_day": max(days) if days else None,
            "first_date": min(dates) if dates else None,
            "last_date": max(dates) if dates else None,
            "missing_days": missing,
            "continuous": not missing,
            "output_file": output_names[plan_id],
        }
        manifests.append(manifest)
        atomic_write(
            OUTPUT_DIR / output_names[plan_id],
            {**manifest, "records": plan_records},
        )
        combined.extend(plan_records)

    combined.sort(key=lambda record: (int(record["plan_id"]), int(record["requested_day_number"])))
    atomic_write(
        OUTPUT_DIR / "hwpo-workouts-complete.json",
        {"workout_count": len(combined), "plans": manifests, "records": combined},
    )
    atomic_write(
        OUTPUT_DIR / "manifest.json",
        {
            "workout_count": len(combined),
            "duplicate_records_removed": duplicate_count,
            "source_files": source_files,
            "plans": manifests,
        },
    )

    for manifest in manifests:
        print(
            f"{manifest['plan_title']}: {manifest['workout_count']} workouts, "
            f"Days {manifest['first_day']}-{manifest['last_day']}, "
            f"continuous={manifest['continuous']}"
        )
    print(f"Combined: {len(combined)} workouts in {OUTPUT_DIR}")
    return 0 if all(manifest["continuous"] for manifest in manifests) else 1


if __name__ == "__main__":
    raise SystemExit(main())
