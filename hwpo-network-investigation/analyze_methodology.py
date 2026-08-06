#!/usr/bin/env python3
"""Analyze abstract HWPO programming patterns without exporting source workouts."""

from __future__ import annotations

import html
import json
import re
from collections import Counter, defaultdict
from itertools import combinations
from pathlib import Path


ROOT = Path(__file__).resolve().parent
SOURCE = ROOT / "normalized-data" / "hwpo-workouts-with-loads.json"
OUTPUT = ROOT / "normalized-data" / "hwpo-methodology-analysis.json"

PLAN_NAMES = {73: "Flagship 1.0", 77: "60 1.0"}

TAGS = {
    "back_squat": r"\bback squat",
    "front_squat": r"\bfront squat",
    "overhead_squat": r"\b(?:overhead squat|ohs)\b",
    "bench_press": r"\b(?:barbell )?bench press",
    "strict_press": r"\bstrict press",
    "push_press": r"\bpush press",
    "deadlift": r"\bdeadlift",
    "clean": r"\bclean(?:s|ing)?\b",
    "power_clean": r"\bpower clean",
    "squat_clean": r"\b(?:squat clean|clean \(full\))",
    "jerk": r"\bjerk(?:s|ing)?\b",
    "split_jerk": r"\bsplit jerk",
    "push_jerk": r"\bpush jerk",
    "snatch": r"\bsnatch(?:es|ing)?\b",
    "power_snatch": r"\bpower snatch",
    "squat_snatch": r"\b(?:squat snatch|snatch \(full\))",
    "clean_pull": r"\bclean pull",
    "snatch_pull": r"\bsnatch pull",
    "barbell_row": r"\b(?:barbell|bent over) row",
    "pull_up": r"\bpull[ -]?up",
    "chest_to_bar": r"\b(?:chest to bar|c2b)",
    "muscle_up": r"\bmuscle[ -]?up",
    "toes_to_bar": r"\b(?:toes to bar|t2b)",
    "handstand_push_up": r"\b(?:handstand push[ -]?up|hspu)",
    "handstand_walk": r"\bhandstand walk",
    "rope_climb": r"\brope climb",
    "burpee": r"\bburpee",
    "box_jump": r"\bbox jump",
    "double_under": r"\b(?:double under|double-under|du\b)",
    "running": r"\b(?:run|running|\d+m run)\b",
    "rowing": r"\b(?:row|rowing|rower)\b",
    "ski_erg": r"\b(?:ski erg|skierg|cal ski|ski calories)\b",
    "fan_bike": r"\b(?:fan bike|assault bike|echo bike)\b",
    "spin_bike": r"\bspin bike",
    "swimming": r"\b(?:swim|swimming)\b",
    "sled": r"\bsled",
    "sandbag": r"\b(?:sandbag|sand bag|dball|d-ball)\b",
    "wall_ball": r"\bwall ball",
    "dumbbell": r"\b(?:dumbbell|db\b)",
    "kettlebell": r"\b(?:kettlebell|kb\b)",
    "carry": r"\b(?:carry|farmers? walk|bear hug)\b",
    "lunge": r"\blunge",
}

STRENGTH_TAGS = {
    "back_squat", "front_squat", "overhead_squat", "bench_press",
    "strict_press", "push_press", "deadlift", "clean", "jerk", "snatch",
    "clean_pull", "snatch_pull", "barbell_row",
}
MODALITY_TAGS = {"rowing", "ski_erg", "fan_bike", "spin_bike", "running", "swimming"}
SKILL_TAGS = {
    "pull_up", "chest_to_bar", "muscle_up", "toes_to_bar",
    "handstand_push_up", "handstand_walk", "rope_climb", "double_under",
}
FORMAT_TAGS = {
    "emom": r"\bemom\b|every minute",
    "amrap": r"\bamrap\b|as many rounds",
    "for_time": r"\bfor time\b",
    "rounds": r"\b\d+ rounds?\b",
    "intervals": r"\binterval|\bon\s*/\s*\d|\bwork\b.*\brest\b",
    "tabata": r"\btabata\b|20 seconds on.*10 seconds off|0:20 on.*0:10 off",
    "zone_2": r"\bzone 2\b",
    "test_or_max": r"\b(?:max|test|benchmark|time trial|rep max|rm\b)",
}


def clean_html(value: object) -> str:
    if not isinstance(value, str):
        return ""
    value = re.sub(r"<style>.*?</style>", " ", value, flags=re.I | re.S)
    value = re.sub(r"<br\s*/?>", "\n", value, flags=re.I)
    value = re.sub(r"<[^>]+>", " ", value)
    return re.sub(r"\s+", " ", html.unescape(value)).strip().lower()


def record_text(record: dict) -> str:
    sections = record.get("response", {}).get("schedule", {}).get("sections", [])
    return " ".join(clean_html(section.get("description")) for section in sections)


def tags_for(text: str) -> set[str]:
    return {name for name, pattern in TAGS.items() if re.search(pattern, text, re.I)}


def meaningful_sections(record: dict) -> list[dict]:
    sections = record.get("response", {}).get("schedule", {}).get("sections", [])
    return [
        section for section in sections
        if clean_html(section.get("description"))
        and "daily video" not in str(section.get("title", "")).lower()
    ]


def is_rest(record: dict, text: str) -> bool:
    titles = " ".join(
        str(section.get("title", ""))
        for section in record.get("response", {}).get("schedule", {}).get("sections", [])
    ).lower()
    return "rest day" in titles or (len(meaningful_sections(record)) == 0 and "rest" in text)


def loading_archetypes(record: dict) -> Counter:
    result = Counter()
    for section in record.get("response", {}).get("schedule", {}).get("sections", []):
        by_code: dict[str, list[float]] = defaultdict(list)
        for item in section.get("load_annotations", []):
            code = item.get("benchmark_code")
            percent = item.get("percent_of_max")
            if code and percent is not None and item.get("rendered_load_lb") is not None:
                by_code[code].append(float(percent))
        for values in by_code.values():
            if len(values) < 2:
                continue
            changes = [b - a for a, b in zip(values, values[1:])]
            unique = len(set(values))
            if unique == 1:
                result["straight"] += 1
            elif all(change >= 0 for change in changes):
                result["ascending"] += 1
            elif all(change <= 0 for change in changes):
                result["descending"] += 1
            elif any(change > 0 for change in changes) and any(change < 0 for change in changes):
                result["wave_or_backoff"] += 1
            else:
                result["other"] += 1
    return result


def summarize_plan(records: list[dict]) -> dict:
    movement_days = Counter()
    modality_days = Counter()
    skill_days = Counter()
    all_tag_days = Counter()
    format_days = Counter()
    pair_days = Counter()
    cycle_positions = defaultdict(Counter)
    section_titles = Counter()
    loading = Counter()
    rest_days = 0
    section_counts = []
    tagged_records = []

    for record in records:
        text = record_text(record)
        tags = tags_for(text)
        rest = is_rest(record, text)
        rest_days += int(rest)
        section_counts.append(len(meaningful_sections(record)))
        day = int(record["requested_day_number"])
        cycle_position = ((day - 1) % 7) + 1
        cycle_positions[cycle_position]["rest" if rest else "training"] += 1
        for tag in tags & STRENGTH_TAGS:
            movement_days[tag] += 1
        all_tag_days.update(tags)
        for name, pattern in FORMAT_TAGS.items():
            if re.search(pattern, text, re.I | re.S):
                format_days[name] += 1
        for tag in tags & MODALITY_TAGS:
            modality_days[tag] += 1
        for tag in tags & SKILL_TAGS:
            skill_days[tag] += 1
        for pair in combinations(sorted(tags & STRENGTH_TAGS), 2):
            pair_days[" + ".join(pair)] += 1
        for section in meaningful_sections(record):
            title = str(section.get("title") or "untitled").strip().lower()
            section_titles[title] += 1
        loading.update(loading_archetypes(record))
        tagged_records.append({"day": day, "tags": sorted(tags), "rest": rest})

    total = len(records)
    training_days = total - rest_days
    return {
        "workout_days": total,
        "training_days": training_days,
        "rest_days": rest_days,
        "rest_day_percent": round(rest_days * 100 / total, 1),
        "average_meaningful_sections": round(sum(section_counts) / total, 2),
        "movement_day_counts": dict(movement_days.most_common()),
        "all_tag_day_counts": dict(all_tag_days.most_common()),
        "movement_training_day_percent": {
            key: round(value * 100 / training_days, 1) for key, value in movement_days.most_common()
        },
        "modality_day_counts": dict(modality_days.most_common()),
        "modality_training_day_percent": {
            key: round(value * 100 / training_days, 1) for key, value in modality_days.most_common()
        },
        "skill_day_counts": dict(skill_days.most_common()),
        "conditioning_format_day_counts": dict(format_days.most_common()),
        "top_strength_cooccurrences": dict(pair_days.most_common(30)),
        "loading_archetypes": dict(loading),
        "cycle_position_counts": {str(key): dict(value) for key, value in sorted(cycle_positions.items())},
        "top_section_titles": dict(section_titles.most_common(25)),
        "tagged_records": tagged_records,
    }


def aligned_comparison(flagship: list[dict], sixty: list[dict]) -> dict:
    f_by_day = {int(record["requested_day_number"]): record for record in flagship}
    s_by_day = {int(record["requested_day_number"]): record for record in sixty}
    aligned_days = sorted(set(f_by_day) & set(s_by_day))
    rows = []
    retained_strength = Counter()
    retained_modality = Counter()
    flagship_strength = Counter()
    flagship_modality = Counter()
    for day in aligned_days:
        f_record, s_record = f_by_day[day], s_by_day[day]
        f_text, s_text = record_text(f_record), record_text(s_record)
        f_tags, s_tags = tags_for(f_text), tags_for(s_text)
        f_sections, s_sections = meaningful_sections(f_record), meaningful_sections(s_record)
        for tag in f_tags & STRENGTH_TAGS:
            flagship_strength[tag] += 1
            retained_strength[tag] += int(tag in s_tags)
        for tag in f_tags & MODALITY_TAGS:
            flagship_modality[tag] += 1
            retained_modality[tag] += int(tag in s_tags)
        rows.append({
            "day": day,
            "flagship_sections": len(f_sections),
            "sixty_sections": len(s_sections),
            "section_ratio": round(len(s_sections) / max(1, len(f_sections)), 3),
            "flagship_text_chars": len(f_text),
            "sixty_text_chars": len(s_text),
            "text_ratio": round(len(s_text) / max(1, len(f_text)), 3),
            "strength_retention": sorted((f_tags & STRENGTH_TAGS) & s_tags),
            "strength_removed": sorted((f_tags & STRENGTH_TAGS) - s_tags),
            "modalities_retained": sorted((f_tags & MODALITY_TAGS) & s_tags),
        })
    return {
        "aligned_days": len(aligned_days),
        "range": [min(aligned_days), max(aligned_days)] if aligned_days else [],
        "average_section_ratio": round(sum(row["section_ratio"] for row in rows) / len(rows), 3),
        "average_text_ratio": round(sum(row["text_ratio"] for row in rows) / len(rows), 3),
        "retained_strength_occurrences": dict(retained_strength.most_common()),
        "flagship_strength_occurrences": dict(flagship_strength.most_common()),
        "strength_retention_percent": {
            tag: round(retained_strength[tag] * 100 / count, 1)
            for tag, count in flagship_strength.most_common()
        },
        "retained_modality_occurrences": dict(retained_modality.most_common()),
        "flagship_modality_occurrences": dict(flagship_modality.most_common()),
        "modality_retention_percent": {
            tag: round(retained_modality[tag] * 100 / count, 1)
            for tag, count in flagship_modality.most_common()
        },
        "days": rows,
    }


def rolling_windows(records: list[dict], size: int = 28, stride: int = 14) -> list[dict]:
    ordered = sorted(records, key=lambda record: int(record["requested_day_number"]))
    windows = []
    for start in range(0, max(0, len(ordered) - size + 1), stride):
        chunk = ordered[start:start + size]
        counts = Counter()
        for record in chunk:
            counts.update(tags_for(record_text(record)) & (STRENGTH_TAGS | MODALITY_TAGS))
        windows.append({
            "start_day": int(chunk[0]["requested_day_number"]),
            "end_day": int(chunk[-1]["requested_day_number"]),
            "counts": dict(counts.most_common()),
        })
    return windows


def main() -> None:
    document = json.loads(SOURCE.read_text())
    by_plan = defaultdict(list)
    for record in document["records"]:
        by_plan[int(record["plan_id"])].append(record)

    output = {
        "method": "abstract tag and normalized-load analysis",
        "source": str(SOURCE.relative_to(ROOT)),
        "source_text_exported": False,
        "plans": {},
    }
    for plan_id, records in sorted(by_plan.items()):
        summary = summarize_plan(records)
        summary["rolling_28_day_windows"] = rolling_windows(records)
        output["plans"][str(plan_id)] = {"name": PLAN_NAMES.get(plan_id, str(plan_id)), **summary}
    output["aligned_flagship_sixty"] = aligned_comparison(by_plan[73], by_plan[77])
    OUTPUT.write_text(json.dumps(output, indent=2) + "\n")
    print(json.dumps({
        "output": str(OUTPUT),
        "plans": {key: value["workout_days"] for key, value in output["plans"].items()},
        "aligned_days": output["aligned_flagship_sixty"]["aligned_days"],
    }, indent=2))


if __name__ == "__main__":
    main()
