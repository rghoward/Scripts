#!/usr/bin/env python3
"""Add non-destructive max/percentage annotations to the private workout corpus."""

from __future__ import annotations

import copy
import html
import json
import re
from bisect import bisect_right
from collections import Counter
from datetime import date
from pathlib import Path


ROOT = Path(__file__).resolve().parent
SOURCE = ROOT / "clean-data" / "hwpo-workouts-complete.json"
BENCHMARKS = ROOT / "hwpo-benchmark-history.json"
OUTPUT_DIR = ROOT / "normalized-data"
OUTPUT = OUTPUT_DIR / "hwpo-workouts-with-loads.json"
REPORT = OUTPUT_DIR / "load-normalization-report.json"

# Order matters: specific complexes and variants must precede generic lifts.
MOVEMENT_BENCHMARKS: tuple[tuple[str, str, str], ...] = (
    (r"power clean\s*(?:\+|&|and)\s*(?:push|power) jerk", "1RM_PCLEAN_PJERK", "power clean and push jerk"),
    (r"(?:squat )?clean\s*(?:\+|&|and)\s*split jerk", "1RM_CLEAN_JERK", "clean and jerk"),
    (r"clean\s*(?:\+|&|and)\s*jerk", "1RM_CLEAN_JERK", "clean and jerk"),
    (r"back squat", "1RM_BACKSQ", "back squat"),
    (r"front squat", "1RM_FRONTSQ", "front squat"),
    (r"bench press", "1RM_BPRESS", "bench press"),
    (r"strict press", "1RM_STPRESS", "strict press"),
    (r"push press", "1RM_PPRESS", "push press"),
    (r"split jerk", "1RM_SPLIT_JERK", "split jerk"),
    (r"push jerk", "1RM_PJERK", "push jerk"),
    (r"overhead squat", "1RM_OHSQ", "overhead squat"),
    (r"power snatch", "1RM_POWER_SNATCH", "power snatch"),
    (r"(?:squat |full )?snatch", "1RM_SNATCH", "snatch"),
    (r"power clean", "1RM_PCLEAN", "power clean"),
    (r"(?:squat |full )?clean", "1RM_CLEAN", "clean"),
    (r"deadlift", "1RM_DEADLIFT", "deadlift"),
)

LOAD_RE = re.compile(r"(?<![\d/])(\d+(?:\.\d+)?)\s*lb\b", re.I)
EXPLICIT_PERCENT_RE = re.compile(r"(\d+(?:\.\d+)?)\s*%\s*(?:of\s*)?(?:your\s*)?(?:1\s*rm|1rm)?", re.I)


def text_from_html(value: object) -> str:
    if not isinstance(value, str):
        return ""
    text = re.sub(r"<style.*?</style>", "", value, flags=re.I | re.S)
    text = re.sub(r"<br\s*/?>|</?(?:p|body|div|li)[^>]*>", "\n", text, flags=re.I)
    text = re.sub(r"<[^>]+>", " ", text)
    text = html.unescape(text)
    text = re.sub(r"[ \t]+", " ", text)
    text = re.sub(r"\n\s*\n+", "\n", text)
    return text.strip()


def benchmark_timeline(document: dict[str, object]) -> tuple[dict[str, list[tuple[date, float]]], dict[str, str]]:
    timelines: dict[str, list[tuple[date, float]]] = {}
    names: dict[str, str] = {}
    for item in document.get("benchmarks", []):
        benchmark = item.get("benchmark", {})
        if benchmark.get("measure") != "weight":
            continue
        code = benchmark.get("code")
        if not isinstance(code, str):
            continue
        names[code] = str(benchmark.get("name") or code).strip()
        entries = []
        for entry in item.get("entries", []):
            try:
                entries.append((date.fromisoformat(entry["date"]), float(entry["value"])))
            except (KeyError, TypeError, ValueError):
                continue
        timelines[code] = sorted(entries)
    return timelines, names


def effective_max(timeline: list[tuple[date, float]], workout_date: date) -> tuple[date, float] | None:
    dates = [entry[0] for entry in timeline]
    index = bisect_right(dates, workout_date) - 1
    return timeline[index] if index >= 0 else None


def blocks(section_text: str) -> list[str]:
    return [part.strip() for part in re.split(r"(?:-{4,}|\n\s*\n)", section_text) if part.strip()]


def movement_basis(block: str) -> tuple[str, str] | None:
    for pattern, code, movement in MOVEMENT_BENCHMARKS:
        if re.search(pattern, block, re.I):
            return code, movement
    return None


def movement_basis_before(block: str, position: int) -> tuple[str, str] | None:
    """Choose the most recent, most-specific movement preceding a prescription."""
    best: tuple[int, int, str, str] | None = None
    prefix = block[:position]
    for priority, (pattern, code, movement) in enumerate(MOVEMENT_BENCHMARKS):
        for match in re.finditer(pattern, prefix, re.I):
            candidate = (match.start(), -priority, code, movement)
            if best is None or candidate[:2] > best[:2]:
                best = candidate
    return (best[2], best[3]) if best is not None else None


def annotate_section(
    section: dict[str, object],
    workout_date: date,
    timelines: dict[str, list[tuple[date, float]]],
    names: dict[str, str],
) -> list[dict[str, object]]:
    section_text = text_from_html(section.get("description"))
    annotations: list[dict[str, object]] = []
    seen: set[tuple[str, float, int]] = set()

    for block_index, block in enumerate(blocks(section_text)):
        basis = movement_basis(block)
        if basis is None:
            continue
        code, movement = basis
        explicit_matches = list(EXPLICIT_PERCENT_RE.finditer(block))
        explicit_percentages = [float(match.group(1)) for match in explicit_matches]
        matched_explicit: set[float] = set()

        for match in LOAD_RE.finditer(block):
            local_basis = movement_basis_before(block, match.start()) or basis
            code, movement = local_basis
            historical = effective_max(timelines.get(code, []), workout_date)
            if historical is None:
                continue
            max_date, max_value = historical
            rendered_token = match.group(1)
            load = float(rendered_token)
            raw_percent = load / max_value * 100
            inferred_percent = round(raw_percent)
            error = abs(raw_percent - inferred_percent)
            explicit = next(
                (value for value in explicit_percentages if abs(load - max_value * value / 100) <= 0.15),
                None,
            )
            if explicit is not None:
                percent = explicit
                confidence = "explicit"
                review_status = "verified"
                review_reason = "Percentage is stated in the source prescription."
                matched_explicit.add(explicit)
            elif 20 <= inferred_percent <= 110 and error <= 0.08:
                percent = float(inferred_percent)
                if "." in rendered_token:
                    confidence = "high"
                    review_status = "verified"
                    review_reason = (
                        "The source renderer emitted a decimal-pound value that resolves "
                        "to an integer percentage of the dated benchmark."
                    )
                else:
                    confidence = "medium"
                    review_status = "needs_manual_review"
                    review_reason = (
                        "The integer load matches a benchmark percentage but could also "
                        "be a literal fixed prescription."
                    )
            else:
                continue

            key = (code, load, int(round(percent * 100)))
            if key in seen:
                continue
            seen.add(key)
            annotations.append(
                {
                    "section_block": block_index,
                    "movement": movement,
                    "basis": "historical_personal_max",
                    "benchmark_code": code,
                    "benchmark_name": names.get(code, code),
                    "historical_max_lb": max_value,
                    "historical_max_date": max_date.isoformat(),
                    "rendered_load_lb": load,
                    "rendered_load_token": rendered_token,
                    "percent_of_max": percent,
                    "confidence": confidence,
                    "review_status": review_status,
                    "review_reason": review_reason,
                    "load_formula": f"{percent:g}% of {code}",
                    "evidence_excerpt": block[max(0, match.start() - 55) : match.end() + 55],
                }
            )

        for percent_match in explicit_matches:
            percent = float(percent_match.group(1))
            if percent in matched_explicit:
                continue
            local_basis = movement_basis_before(block, percent_match.start()) or basis
            code, movement = local_basis
            historical = effective_max(timelines.get(code, []), workout_date)
            prior_result = bool(
                re.search(
                    r"last week(?:'s)?|previous(?:ly)?|last (?:\d+|one|two|three|four|five|six|seven|eight|nine|ten)[ -]?rm",
                    block,
                    re.I,
                )
            )
            if historical is None and not prior_result:
                continue
            max_date, max_value = historical if historical is not None else (None, None)
            annotations.append(
                {
                    "section_block": block_index,
                    "movement": movement,
                    "basis": "prior_result" if prior_result else "historical_personal_max",
                    "benchmark_code": None if prior_result else code,
                    "benchmark_name": None if prior_result else names.get(code, code),
                    "historical_max_lb": None if prior_result else max_value,
                    "historical_max_date": None if prior_result else max_date.isoformat(),
                    "rendered_load_lb": None,
                    "percent_of_max": percent,
                    "confidence": "explicit",
                    "review_status": "verified",
                    "review_reason": "Percentage is stated in the source prescription.",
                    "load_formula": (
                        f"{percent:g}% of prior prescribed result"
                        if prior_result
                        else f"{percent:g}% of {code}"
                    ),
                    "evidence_excerpt": block[:180],
                }
            )
    return annotations


def main() -> int:
    source = json.loads(SOURCE.read_text())
    benchmark_document = json.loads(BENCHMARKS.read_text())
    timelines, names = benchmark_timeline(benchmark_document)
    output = copy.deepcopy(source)

    confidence_counts: Counter[str] = Counter()
    review_status_counts: Counter[str] = Counter()
    records_with_annotations = 0
    sections_with_annotations = 0
    annotation_count = 0

    for record in output.get("records", []):
        workout_date = date.fromisoformat(record["requested_date"])
        schedule = record.get("response", {}).get("schedule", {})
        record_annotations = []
        for section in schedule.get("sections", []):
            annotations = annotate_section(section, workout_date, timelines, names)
            if not annotations:
                continue
            sections_with_annotations += 1
            annotation_count += len(annotations)
            confidence_counts.update(item["confidence"] for item in annotations)
            review_status_counts.update(item["review_status"] for item in annotations)
            section["load_annotations"] = annotations
            record_annotations.extend(annotations)
        if record_annotations:
            records_with_annotations += 1
            record["load_normalization"] = {
                "annotation_count": len(record_annotations),
                "contains_reusable_max_based_loads": True,
            }

    output["load_normalization"] = {
        "version": 1,
        "method": "historical benchmark reconstruction",
        "source_archive_preserved": True,
        "records_with_annotations": records_with_annotations,
        "sections_with_annotations": sections_with_annotations,
        "annotation_count": annotation_count,
        "confidence_counts": dict(confidence_counts),
        "review_status_counts": dict(review_status_counts),
        "warning": "Only structured annotations should be recalculated. Unannotated fixed loads remain literal source prescriptions.",
    }

    OUTPUT_DIR.mkdir(exist_ok=True)
    OUTPUT.write_text(json.dumps(output, indent=2, ensure_ascii=False) + "\n")
    report = {
        **output["load_normalization"],
        "source": str(SOURCE.relative_to(ROOT)),
        "benchmark_source": str(BENCHMARKS.relative_to(ROOT)),
        "output": str(OUTPUT.relative_to(ROOT)),
    }
    REPORT.write_text(json.dumps(report, indent=2) + "\n")
    print(json.dumps(report, indent=2))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
