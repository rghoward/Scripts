from __future__ import annotations

import math
import re
from collections import defaultdict
from statistics import mean, stdev


def logical_question(title: str, position: int) -> str:
    normalized = re.sub(r"\s+", " ", (title or "").strip().casefold())
    return normalized or f"question {position}"


def analyze_consistency(observations: list[dict]) -> dict:
    """Compare human graders after normalizing every score within its logical question."""
    usable = [
        dict(item) for item in observations
        if item.get("score") is not None and (item.get("max_points") or 0) > 0 and item.get("grader_name")
    ]
    by_question = defaultdict(list)
    for item in usable:
        item["logical_question"] = logical_question(item.get("question_title", ""), item.get("position", 0))
        item["deduction_rate"] = (item["max_points"] - item["score"]) / item["max_points"]
        by_question[item["logical_question"]].append(item)

    comparable = {
        key: rows for key, rows in by_question.items()
        if len({row["grader_name"] for row in rows}) >= 2
    }
    grader_deltas = defaultdict(list)
    question_rows = []
    for key, rows in comparable.items():
        baseline = mean(row["deduction_rate"] for row in rows)
        by_grader = defaultdict(list)
        for row in rows:
            delta = row["deduction_rate"] - baseline
            grader_deltas[row["grader_name"]].append(delta)
            by_grader[row["grader_name"]].append(row)
        for grader_name, grader_rows in by_grader.items():
            avg_score = mean(row["score"] for row in grader_rows)
            avg_max = mean(row["max_points"] for row in grader_rows)
            question_rows.append({
                "logical_question": key,
                "display_question": grader_rows[0].get("question_title") or key.title(),
                "grader_name": grader_name,
                "count": len(grader_rows),
                "average_score": avg_score,
                "average_max": avg_max,
                "average_deduction": avg_max - avg_score,
                "harshness_points": mean(row["deduction_rate"] for row in grader_rows) - baseline,
                "course_gs_id": grader_rows[0].get("course_gs_id"),
                "question_gs_id": grader_rows[0].get("question_gs_id"),
                "assignment_title": grader_rows[0].get("assignment_title"),
            })

    graders = []
    for grader_name, deltas in grader_deltas.items():
        tendency = mean(deltas)
        standard_error = stdev(deltas) / math.sqrt(len(deltas)) if len(deltas) > 1 else None
        margin = 1.96 * standard_error if standard_error is not None else None
        significant = len(deltas) >= 10 and margin is not None and abs(tendency) > margin
        graders.append({
            "grader_name": grader_name,
            "count": len(deltas),
            "question_count": len({
                row["logical_question"] for row in usable
                if row["grader_name"] == grader_name and row["logical_question"] in comparable
            }),
            "tendency": tendency,
            "margin": margin,
            "significant": significant,
            "label": "Harsher" if significant and tendency > 0 else "More generous" if significant else "Typical range",
        })
    graders.sort(key=lambda item: item["tendency"], reverse=True)
    question_rows.sort(key=lambda item: (item["logical_question"], -item["harshness_points"]))
    return {
        "graders": graders,
        "questions": question_rows,
        "observation_count": sum(len(rows) for rows in comparable.values()),
        "comparable_question_count": len(comparable),
        "excluded_question_count": len(by_question) - len(comparable),
    }
