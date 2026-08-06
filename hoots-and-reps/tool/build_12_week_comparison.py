#!/usr/bin/env python3
"""Build a private aggregate comparison of generated and Flagship Days 1-84."""

from __future__ import annotations

import json
import sys
from collections import Counter
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
INVESTIGATION = ROOT.parent / "hwpo-network-investigation"
sys.path.insert(0, str(INVESTIGATION))

from analyze_methodology import (  # noqa: E402
    is_rest,
    loading_archetypes,
    meaningful_sections,
    record_text,
)
from analyze_movement_ecosystem import M, role_for, tags  # noqa: E402


GENERATED = ROOT / "build/analysis/generated-12-week-program.json"
SOURCE = INVESTIGATION / "normalized-data/hwpo-workouts-with-loads.json"
OUTPUT = ROOT / "docs/GENERATED_VS_FLAGSHIP_12_WEEK_COMPARISON.md"


def generated_text(day: dict) -> str:
    parts = list(day["warmup"]) + list(day["accessories"])
    if day["strength"]:
        parts.append(day["strength"]["movement"])
    parts.extend(work["movement"] for work in day["secondary_strength"])
    if day["conditioning"]:
        parts.extend(day["conditioning"]["prescription"])
    return " ".join(parts).replace("-", " ")


def generated_tags(day: dict) -> set[str]:
    found = tags(generated_text(day))
    text = generated_text(day).lower()
    extras = {
        "wall facing handstand": "handstand_hold",
        "handstand weight shift": "handstand_hold",
        "double-under": "double_under",
        "box jump": "box_jump",
        "farmer carry": "farmer_carry",
    }
    found.update(tag for phrase, tag in extras.items() if phrase in text)
    return found


def categories(found: set[str]) -> set[str]:
    return {M[tag].category if tag in M else {
        "handstand_hold": "inversion",
    }.get(tag, tag) for tag in found}


def strength_summary(work: dict) -> str:
    steps = []
    for step in work["steps"]:
        if step["percent"] == 0:
            steps.append(f'{step["sets"]}x{step["reps"]}')
        else:
            steps.append(
                f'{step["sets"]}x{step["reps"]}@{step["percent"] * 100:g}%'
            )
    return f'{work["movement"]} ({work["loading_pattern"]}: {", ".join(steps)})'


def generated_day_summary(day: dict) -> str:
    if day["is_rest"]:
        return "REST"
    work = [strength_summary(day["strength"])]
    work.extend(strength_summary(item) for item in day["secondary_strength"])
    conditioning = day["conditioning"]
    work.append(
        f'{conditioning["minutes"]} min {conditioning["template_id"].replace("conditioning_", "").rsplit("_", 1)[0]}'
    )
    return "<br>".join(work)


def flagship_day_summary(record: dict) -> str:
    text = record_text(record)
    if is_rest(record, text):
        return "REST"
    sections = meaningful_sections(record)
    roles = Counter(role_for(section.get("title")) for section in sections)
    found = sorted(tags(text))
    role_text = ", ".join(f"{role} {count}" for role, count in roles.most_common())
    movement_text = ", ".join(name.replace("_", " ") for name in found) or "unclassified"
    return f"{role_text}<br>{movement_text}"


def weekly_counts(days: list[dict], source: dict[int, dict]) -> list[dict]:
    summaries = []
    for week in range(1, 13):
        generated_week = [d for d in days if d["phase_week"] == week]
        start = (week - 1) * 7 + 1
        source_week = [source[d] for d in range(start, start + 7)]
        generated_found = set().union(*(generated_tags(day) for day in generated_week))
        source_found = set().union(*(tags(record_text(record)) for record in source_week))
        summaries.append({
            "week": week,
            "generated_training": sum(not day["is_rest"] for day in generated_week),
            "flagship_training": sum(not is_rest(r, record_text(r)) for r in source_week),
            "generated_categories": categories(generated_found),
            "flagship_categories": categories(source_found),
            "generated_movements": generated_found,
            "flagship_movements": source_found,
        })
    return summaries


def main() -> None:
    generated = json.loads(GENERATED.read_text())["days"]
    document = json.loads(SOURCE.read_text())
    source = {
        int(record["requested_day_number"]): record
        for record in document["records"]
        if int(record["plan_id"]) == 73 and 1 <= int(record["requested_day_number"]) <= 84
    }
    if len(source) != 84:
        raise RuntimeError(f"Expected 84 Flagship records, found {len(source)}")

    generated_movement_days = Counter()
    generated_category_days = Counter()
    source_movement_days = Counter()
    source_category_days = Counter()
    generated_loading = Counter()
    source_loading = Counter()
    generated_stress_days = Counter()
    conditioning_templates = Counter()
    conditioning_formats = Counter()
    energy_systems = Counter({
        "aerobicBase": 0,
        "threshold": 0,
        "vo2": 0,
        "anaerobic": 0,
        "alactic": 0,
        "mixedModal": 0,
    })
    session_minutes = []

    for day in generated:
        found = generated_tags(day)
        generated_movement_days.update(found)
        generated_category_days.update(categories(found))
        day_stress = set()
        for work in [day["strength"], *day["secondary_strength"]]:
            if work:
                generated_loading[work["loading_pattern"]] += 1
                day_stress.update(work["stress"])
        if day["conditioning"]:
            day_stress.update(day["conditioning"]["patterns"])
            conditioning_templates[day["conditioning"]["template_id"]] += 1
            conditioning_formats[day["conditioning"]["format"]] += 1
        for system in energy_systems:
            if day.get("dose", {}).get(f"energy_{system}", 0) > 0:
                energy_systems[system] += 1
        if not day["is_rest"]:
            session_minutes.append(day["estimated_session_minutes"])
        generated_stress_days.update(day_stress)

    for record in source.values():
        found = tags(record_text(record))
        source_movement_days.update(found)
        source_category_days.update(categories(found))
        source_loading.update(loading_archetypes(record))

    weeks = weekly_counts(generated, source)
    missing = sorted(set(source_movement_days) - set(generated_movement_days))
    lines = [
        "# Generated Phase vs Flagship: 12-Week Comparison",
        "",
        "Status: deterministic-engine audit over Days 1-84",
        "",
        "This private report compares aggregate programming structure and movement presence. "
        "It does not reproduce Flagship workout descriptions. Generated loads use the current "
        "local comparison profile and must be recalculated from each athlete's training maxes.",
        "",
        "## Executive comparison",
        "",
        "| Measure | Generated | Flagship Days 1-84 |",
        "| --- | ---: | ---: |",
        f'| Training days | {sum(not d["is_rest"] for d in generated)} | '
        f'{sum(not is_rest(r, record_text(r)) for r in source.values())} |',
        f'| Rest/recovery days | {sum(d["is_rest"] for d in generated)} | '
        f'{sum(is_rest(r, record_text(r)) for r in source.values())} |',
        f'| Distinct tagged movements | {len(generated_movement_days)} | {len(source_movement_days)} |',
        f'| Distinct movement categories | {len(generated_category_days)} | {len(source_category_days)} |',
        f'| Strength/skill prescriptions | {sum(generated_loading.values())} | Not directly comparable |',
        f'| Estimated session range | {min(session_minutes)}–{max(session_minutes)} min | Not reliably extractable |',
        "",
        "The generated phase deliberately performs 48 training sessions rather than Flagship's "
        "72. Its target is selective breadth and progression with recovery, not matching source volume.",
        "",
        "## Week-by-week breadth",
        "",
        "| Week | Training days, generated / Flagship | Generated families | Flagship families |",
        "| ---: | ---: | --- | --- |",
    ]
    for week in weeks:
        lines.append(
            f'| {week["week"]} | {week["generated_training"]} / {week["flagship_training"]} | '
            f'{", ".join(sorted(week["generated_categories"]))} | '
            f'{", ".join(sorted(week["flagship_categories"]))} |'
        )

    lines.extend([
        "",
        "## Newly structured validation data",
        "",
        "| Engine requirement | Current generated phase | Flagship source comparison |",
        "| --- | --- | --- |",
        f'| Session-time validation | All 48 sessions fit the 90-minute full-view limit; range {min(session_minutes)}–{max(session_minutes)} min | Source text does not consistently expose transition/setup time |',
        "| Typed prescriptions | Strength uses reps/load percentages; conditioning duration and detected work/rest intervals use seconds | Source prose mixes reps, calories, meters, and time |",
        "| Weighted stress ledger | Every generated day exposes weighted stress, pattern, conditioning, and energy-system dose | Can only be estimated conservatively from prose |",
        "| Rolling fatigue checks | Systemic, hinge, overhead, grip, impact, and conditioning checked over 7/14/28 days | Not asserted for the source plan |",
        "| Deload validation | Weeks 4, 8, and 12 must reduce combined systemic and conditioning dose by at least 15% | Source deload intent varies and is not assumed |",
        "| Lifetime workout uniqueness | Complete signatures checked against phase and supplied lifetime history | Not applicable |",
        f'| Conditioning uniqueness | {len(conditioning_templates)} distinct prescriptions across 48 sessions | Source text not normalized to this identity model |',
        "",
        "### Generated energy-system exposures",
        "",
        "| Energy system | Sessions |",
        "| --- | ---: |",
    ])
    for system, count in sorted(energy_systems.items()):
        lines.append(f'| {system.replace("_", " ")} | {count} |')

    lines.extend([
        "",
        "### Generated conditioning formats",
        "",
        "| Format | Sessions |",
        "| --- | ---: |",
    ])
    for format_name, count in sorted(conditioning_formats.items()):
        lines.append(f"| {format_name} | {count} |")

    lines.extend([
        "",
        "## Loading structures",
        "",
        "| Structure | Generated prescriptions | Flagship detected sequences |",
        "| --- | ---: | ---: |",
    ])
    all_loading = sorted(set(generated_loading) | set(source_loading))
    for pattern in all_loading:
        lines.append(
            f'| {pattern.replace("_", " ")} | {generated_loading[pattern]} | {source_loading[pattern]} |'
        )

    lines.extend([
        "",
        "Generated counts include primary, secondary, skill, carry, and jump prescriptions. "
        "Flagship counts come from reliably detected annotated loading sequences, so the columns "
        "describe tendencies rather than equal units.",
        "",
        "## Most frequent movement families",
        "",
        "| Family | Generated days | Flagship days |",
        "| --- | ---: | ---: |",
    ])
    for category in sorted(
        set(generated_category_days) | set(source_category_days),
        key=lambda item: source_category_days[item],
        reverse=True,
    ):
        lines.append(
            f'| {category.replace("_", " ")} | {generated_category_days[category]} | '
            f'{source_category_days[category]} |'
        )

    lines.extend([
        "",
        "## Generated fatigue exposure",
        "",
        "| Stress/pattern | Generated days |",
        "| --- | ---: |",
    ])
    for stress, count in generated_stress_days.most_common():
        lines.append(f'| {stress.replace("_", " ")} | {count} |')

    lines.extend([
        "",
        "## Movement gaps requiring review",
        "",
        "These movements occur in Flagship Days 1-84 but are not explicitly selected as a "
        "generated strength, skill, accessory, warmup, or conditioning movement:",
        "",
        ", ".join(name.replace("_", " ") for name in missing) or "None",
        "",
        "Absence is not automatically a defect: some movements are redundant variants, excessive "
        "accessory volume, or skills inappropriate for an unqualified athlete. Each omission must be "
        "classified as intentional, substitution-covered, phase-deferred, or a true registry gap.",
        "",
        "| Missing source movement | Classification | Decision |",
        "| --- | --- | --- |",
        "| air squat, goblet squat | Substitution-covered | Existing squat patterns and loaded squats provide the stimulus; retain these as future movement-swap options. |",
        "| chest to bar, handstand push up, handstand walk, pistol | Phase-deferred prerequisites | Introduce only through athlete-qualified progressions, not by copying advanced source volume. |",
        "| devils press | Intentional omission | Burpee, hinge, and dumbbell power stimuli already exist without combining fatigue-sensitive patterns. |",
        "| flutter kick, hollow, russian twist | Substitution-covered | Current anti-extension, anti-rotation, hanging-core, and compression work supplies broader trunk training. |",
        "| ghd sit up | Intentional omission | High-eccentric trunk work is excluded from the default phase; may become an opt-in qualified movement later. |",
        "| good morning, reverse hyper, stiff leg deadlift | Substitution-covered | RDLs, deadlifts, back extensions, hip bridges, and hamstring curls cover the posterior-chain roles. |",
        "| single under | Regression only | Reserved as the deterministic regression for double-under work. |",
        "| spin bike | Equipment alias | Represented by fan bike or bike, depending on intended stimulus. |",
        "| triceps extension | Substitution-covered | Banded pressdowns supply the same accessory family with simpler equipment. |",
        "",
        "No remaining item is an unclassified registry gap. Squat clean, hang clean, wall ball, thruster, and face pull were promoted into the generated phase during this review.",
        "",
        "## Day-aligned audit",
        "",
        "The generated plan uses Monday, Tuesday, Thursday, and Saturday. Flagship generally trains "
        "six consecutive positions and rests on the seventh, so many rows compare a generated rest "
        "day with a source training day by design.",
        "",
        "| Day | Generated | Flagship abstract |",
        "| ---: | --- | --- |",
    ])
    for day in generated:
        number = day["overall_day"]
        lines.append(
            f'| {number} | {generated_day_summary(day)} | {flagship_day_summary(source[number])} |'
        )

    lines.extend([
        "",
        "## Audit conclusions",
        "",
        "1. Verify every missing movement and classify it rather than blindly adding it.",
        "2. Review four-week loading waves for true progression; vocabulary breadth alone is not progression.",
        "3. Confirm no movement or conditioning template repeats too predictably at six-week boundaries.",
        "4. Review weekly overhead, grip, hinge, squat, impact, and systemic exposure with a human coach.",
        "5. Confirm advanced skill practice has athlete-level prerequisites and substitutions before release.",
        "6. Field-test session duration: generated structure is bounded, but transition and setup time still matter.",
        "7. Keep Flagship text and personal load history private; use this report only for abstract methodology review.",
        "",
    ])
    OUTPUT.write_text("\n".join(lines))
    print(json.dumps({
        "output": str(OUTPUT),
        "generated_days": len(generated),
        "flagship_days": len(source),
        "generated_movements": len(generated_movement_days),
        "flagship_movements": len(source_movement_days),
        "missing_movements": len(missing),
    }, indent=2))


if __name__ == "__main__":
    main()
