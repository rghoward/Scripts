#!/usr/bin/env python3
"""Compare generated dose with conservative estimates from Flagship Days 1-84."""

from __future__ import annotations

import json
import re
import sys
from collections import Counter
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
INVESTIGATION = ROOT.parent / "hwpo-network-investigation"
sys.path.insert(0, str(INVESTIGATION))

from analyze_methodology import clean_html, is_rest, meaningful_sections, record_text  # noqa: E402
from analyze_movement_ecosystem import role_for, tags  # noqa: E402


GENERATED = ROOT / "build/analysis/generated-12-week-program.json"
SOURCE = INVESTIGATION / "normalized-data/hwpo-workouts-with-loads.json"
OUTPUT = ROOT / "docs/GENERATED_VS_FLAGSHIP_12_WEEK_DOSE_AUDIT.md"


def work_sets(work: dict) -> int:
    return sum(step["sets"] for step in work["steps"])


def work_reps(work: dict) -> int:
    return sum(step["sets"] * step["reps"] for step in work["steps"])


def source_set_lower_bound(text: str) -> int:
    # Counts explicit NxR prescriptions. It intentionally does not infer sets
    # from prose, rounds, ladders, or unspecified build/max work.
    return sum(
        int(match.group(1))
        for match in re.finditer(r"(?<!\d)(\d{1,2})\s*[xX]\s*(?:\d+|\()", text)
    )


def explicit_clock_minutes(text: str) -> int | None:
    values = []
    values.extend(int(value) for value in re.findall(r"\bEMOM\s+(\d{1,2})\b", text, re.I))
    values.extend(
        int(value)
        for value in re.findall(r"\b(\d{1,2})(?::00)?[- ](?:minute|min)\b", text, re.I)
    )
    values.extend(int(value) for value in re.findall(r"\bAMRAP\s+(\d{1,2})\b", text, re.I))
    return max(values) if values else None


def generated_week_dose(days: list[dict]) -> dict:
    result = Counter()
    session_low = []
    session_high = []
    for day in days:
        if day["is_rest"]:
            continue
        works = [day["strength"], *day["secondary_strength"]]
        result["training_days"] += 1
        result["conditioning_minutes"] += day["conditioning"]["minutes"]
        result["primary_sets"] += work_sets(day["strength"])
        strength_low = strength_high = 0.0
        for index, work in enumerate(works):
            sets = work_sets(work)
            reps = work_reps(work)
            stress = set(work["stress"])
            name = work["movement"].lower().replace("-", " ")
            if work["loading_pattern"] == "complex":
                result["technical_sets"] += sets
                strength_low += sets * 1.4
                strength_high += sets * 2.0
            elif index == 0:
                strength_low += sets * 2.0
                strength_high += sets * 3.0
            elif work["steps"][0]["percent"] > 0:
                result["support_loaded_sets"] += sets
                strength_low += sets * 1.3
                strength_high += sets * 2.0
            else:
                result["skill_support_sets"] += sets
                strength_low += sets * .8
                strength_high += sets * 1.4
            if "hinge" in stress or "posterior_chain" in stress:
                result["hinge_sets"] += sets
            if "grip" in stress:
                result["grip_sets"] += sets
            if "overhead" in stress or work["primary_pattern"] == "vertical_push":
                result["overhead_sets"] += sets
            if work["primary_pattern"] == "unilateral":
                result["loaded_unilateral_sets"] += sets
            if work["primary_pattern"] == "hanging_core":
                result["hanging_core_sets"] += sets
                result["hanging_core_reps"] += reps
            if work["primary_pattern"] == "inversion":
                result["inversion_sets"] += sets
            if "box jump" in name:
                result["jump_contacts"] += reps
            if "double under" in name:
                result["jump_rope_contacts"] += reps
            if "carry" in name:
                result["carry_work_sets"] += sets
            if "rope climb" in name:
                result["climb_practice_sets"] += sets
        conditioning = day["conditioning"]
        patterns = set(conditioning["patterns"])
        if "impact" in patterns:
            result["impact_conditioning_minutes"] += conditioning["minutes"]
        if any("run" in line.lower() for line in conditioning["prescription"]):
            result["running_sessions"] += 1
        # Accessories are optional and text-authored. Allow 3-5 minutes per
        # listed item; add five minutes for transitions/setup.
        accessory_low = len(day["accessories"]) * 3
        accessory_high = len(day["accessories"]) * 5
        base = day["warmup_minutes"] + conditioning["minutes"] + 5
        session_low.append(round(base + strength_low + accessory_low))
        session_high.append(round(base + strength_high + accessory_high))
    result["session_low_total"] = sum(session_low)
    result["session_high_total"] = sum(session_high)
    result["session_low_max"] = max(session_low, default=0)
    result["session_high_max"] = max(session_high, default=0)
    return dict(result)


def flagship_week_dose(records: list[dict]) -> dict:
    result = Counter()
    for record in records:
        text = record_text(record)
        if is_rest(record, text):
            continue
        result["training_days"] += 1
        for section in meaningful_sections(record):
            role = role_for(section.get("title"))
            body = clean_html(section.get("description"))
            result[f"{role}_sections"] += 1
            if role == "strength":
                result["explicit_strength_sets_lower_bound"] += source_set_lower_bound(body)
            if role in {"accessory", "bonus", "skill"}:
                result["explicit_support_sets_lower_bound"] += source_set_lower_bound(body)
            if role == "conditioning":
                clock = explicit_clock_minutes(body)
                if clock is None:
                    result["conditioning_sections_unknown_duration"] += 1
                else:
                    result["conditioning_minutes_explicit"] += clock
                    result["conditioning_sections_timed"] += 1
        found = tags(text)
        for tag in found:
            result[f"movement_days:{tag}"] += 1
    return dict(result)


def main() -> None:
    generated = json.loads(GENERATED.read_text())["days"]
    source_document = json.loads(SOURCE.read_text())
    source = {
        int(record["requested_day_number"]): record
        for record in source_document["records"]
        if int(record["plan_id"]) == 73 and 1 <= int(record["requested_day_number"]) <= 84
    }
    generated_weeks = []
    flagship_weeks = []
    for week in range(1, 13):
        generated_weeks.append(
            generated_week_dose([day for day in generated if day["phase_week"] == week])
        )
        start = (week - 1) * 7 + 1
        flagship_weeks.append(flagship_week_dose([source[day] for day in range(start, start + 7)]))

    generated_total = generated_week_dose(generated)
    flagship_total = flagship_week_dose(list(source.values()))
    timed = flagship_total.get("conditioning_sections_timed", 0)
    unknown = flagship_total.get("conditioning_sections_unknown_duration", 0)
    lines = [
        "# Twelve-Week Dose Audit: Generated vs Flagship",
        "",
        "Status: mechanical dose audit; human programming review still required",
        "",
        "## What can and cannot be compared",
        "",
        "Generated prescriptions are structured, so their sets, reps, contacts, and conditioning "
        "minutes are exact. Flagship source prose is less uniform. Its strength/support set figures "
        "below are conservative lower bounds from explicit `NxR` notation. Conditioning minutes "
        f"are known for {timed} sections and unknown for {unknown}; for-time work without a cap is not "
        "assigned an invented duration. Warmup mentions are not treated as hard working sets.",
        "",
        "## Generated phase dose",
        "",
        "| Measure | 12-week total | Per training day |",
        "| --- | ---: | ---: |",
    ]
    metrics = [
        ("Primary strength sets", "primary_sets"),
        ("Technical complex sets", "technical_sets"),
        ("Loaded support sets", "support_loaded_sets"),
        ("Skill/bodyweight support sets", "skill_support_sets"),
        ("Hinge/posterior-chain sets", "hinge_sets"),
        ("Grip-intensive sets", "grip_sets"),
        ("Overhead/vertical-press sets", "overhead_sets"),
        ("Loaded unilateral sets", "loaded_unilateral_sets"),
        ("Hanging-core sets", "hanging_core_sets"),
        ("Hanging-core prescribed reps", "hanging_core_reps"),
        ("Inversion practice sets", "inversion_sets"),
        ("Box-jump contacts", "jump_contacts"),
        ("Double-under contacts", "jump_rope_contacts"),
        ("Carry work sets", "carry_work_sets"),
        ("Climb-practice sets", "climb_practice_sets"),
        ("Conditioning minutes", "conditioning_minutes"),
        ("Impact-conditioning minutes", "impact_conditioning_minutes"),
        ("Running sessions", "running_sessions"),
    ]
    training_days = generated_total["training_days"]
    for label, key in metrics:
        value = generated_total.get(key, 0)
        lines.append(f"| {label} | {value} | {value / training_days:.2f} |")

    lines.extend([
        "",
        "Estimated full-session duration includes the exact warmup and conditioning clocks, "
        "set/rest allowances by work type, five minutes of transition/setup, and 3–5 minutes per "
        "optional accessory item. It is a planning range, not observed completion time.",
        "",
        f'- Mean estimated full session: **{generated_total["session_low_total"] / training_days:.0f}–'
        f'{generated_total["session_high_total"] / training_days:.0f} minutes**',
        f'- Longest estimated full session: **{generated_total["session_low_max"]}–'
        f'{generated_total["session_high_max"]} minutes**',
        "- The 60-minute view removes technical/support blocks and optional accessories first, so its "
        "dose is intentionally lower than this full-session audit.",
        "",
        "## Flagship conservative dose bounds",
        "",
        "| Measure | Days 1–84 | Per training day | Confidence |",
        "| --- | ---: | ---: | --- |",
    ])
    flagship_training = flagship_total["training_days"]
    flagship_metrics = [
        ("Explicit strength sets", "explicit_strength_sets_lower_bound", "Lower bound"),
        ("Explicit accessory/bonus/skill sets", "explicit_support_sets_lower_bound", "Lower bound"),
        ("Meaningful strength sections", "strength_sections", "High"),
        ("Accessory sections", "accessory_sections", "High"),
        ("Bonus sections", "bonus_sections", "High"),
        ("Conditioning sections", "conditioning_sections", "High"),
        ("Explicit conditioning minutes", "conditioning_minutes_explicit", "Lower bound"),
        ("Conditioning sections without known duration", "conditioning_sections_unknown_duration", "High"),
    ]
    for label, key, confidence in flagship_metrics:
        value = flagship_total.get(key, 0)
        lines.append(
            f"| {label} | {value} | {value / flagship_training:.2f} | {confidence} |"
        )

    lines.extend([
        "",
        "## Week-by-week generated dose",
        "",
        "| Week | Primary sets | Technical sets | Loaded support | Skill/support | Hinge sets | Grip sets | Overhead sets | Jump contacts | DU contacts | Conditioning min | Session estimate |",
        "| ---: | ---: | ---: | ---: | ---: | ---: | ---: | ---: | ---: | ---: | ---: | --- |",
    ])
    for week, dose in enumerate(generated_weeks, 1):
        lines.append(
            f'| {week} | {dose.get("primary_sets", 0)} | {dose.get("technical_sets", 0)} | '
            f'{dose.get("support_loaded_sets", 0)} | {dose.get("skill_support_sets", 0)} | '
            f'{dose.get("hinge_sets", 0)} | {dose.get("grip_sets", 0)} | '
            f'{dose.get("overhead_sets", 0)} | {dose.get("jump_contacts", 0)} | '
            f'{dose.get("jump_rope_contacts", 0)} | {dose.get("conditioning_minutes", 0)} | '
            f'{dose.get("session_low_total", 0) // max(1, dose.get("training_days", 1))}–'
            f'{dose.get("session_high_total", 0) // max(1, dose.get("training_days", 1))} min avg |'
        )

    lines.extend([
        "",
        "## Week-by-week Flagship observable dose",
        "",
        "| Week | Explicit strength sets, lower bound | Support sets, lower bound | Strength sections | Conditioning sections | Known conditioning min | Unknown-duration conditioning |",
        "| ---: | ---: | ---: | ---: | ---: | ---: | ---: |",
    ])
    for week, dose in enumerate(flagship_weeks, 1):
        lines.append(
            f'| {week} | {dose.get("explicit_strength_sets_lower_bound", 0)} | '
            f'{dose.get("explicit_support_sets_lower_bound", 0)} | '
            f'{dose.get("strength_sections", 0)} | {dose.get("conditioning_sections", 0)} | '
            f'{dose.get("conditioning_minutes_explicit", 0)} | '
            f'{dose.get("conditioning_sections_unknown_duration", 0)} |'
        )

    lines.extend([
        "",
        "## Mechanical review flags",
        "",
        "- Hinge and grip totals include low-load Olympic technique, carries, and skill work; review "
        "weekly peaks rather than treating every set as equally fatiguing.",
        "- Double-under counts are contacts, not hard strength repetitions. They still contribute to "
        "the impact budget.",
        "- Inversion holds use one quality hold as one prescribed repetition; duration is not yet stored "
        "as a structured field and should be added.",
        "- Carry prescriptions currently store distance in the reps field. The next model revision should "
        "use meters explicitly so tonnage and distance are not conflated.",
        "- The source lower bounds should never be used to claim Flagship did less work than generated. "
        "Unparsed prose, rounds, ladders, and uncapped for-time work bias its estimates downward.",
        "- No exact complete generated workout repeats within the phase. Future phases must compare each "
        "new canonical signature against persisted lifetime workout history before release to the athlete.",
        "",
    ])
    OUTPUT.write_text("\n".join(lines))
    print(json.dumps({
        "output": str(OUTPUT),
        "generated_training_days": training_days,
        "generated_conditioning_minutes": generated_total["conditioning_minutes"],
        "flagship_training_days": flagship_training,
        "flagship_explicit_strength_sets_lower_bound": flagship_total.get(
            "explicit_strength_sets_lower_bound", 0
        ),
    }, indent=2))


if __name__ == "__main__":
    main()
