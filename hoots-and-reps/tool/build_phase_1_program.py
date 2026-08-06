#!/usr/bin/env python3
"""Render the generated Phase 1 JSON as a human-reviewable Markdown plan."""

from __future__ import annotations

import json
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
SOURCE = ROOT / "build/analysis/generated-12-week-program.json"
OUTPUT = ROOT / "docs/PHASE_1_FULL_PROGRAM.md"


def percent(value: float) -> str:
    return f"{value * 100:g}%"


def strength(work: dict) -> list[str]:
    lines = [f'**{work["movement"]}** — {work["loading_pattern"]}']
    for step in work["steps"]:
        prescription = f'{step["sets"]} × {step["reps"]}'
        if step["percent"]:
            prescription += f' @ {percent(step["percent"])}'
        if step["suggested_load"] is not None:
            prescription += f' — example load {step["suggested_load"]} lb'
        lines.append(f"- {prescription}")
    return lines


def main() -> None:
    document = json.loads(SOURCE.read_text())
    days = document["days"]
    lines = [
        "# Phase 1: Full 12-Week Program",
        "",
        "Status: generated for review; not yet inserted into the application",
        "",
        "This is the deterministic engine's complete 84-day Phase 1. Example loads use the "
        "comparison profile embedded in `tool/export_12_week_program.dart`; production loads "
        "must be recalculated from the athlete's current training max. Rest days are intentional "
        "and remain visible.",
        "",
        "- Training days: 48",
        "- Rest days: 36",
        "- Default training positions: Monday, Tuesday, Thursday, Saturday",
        "- Deload weeks: 4, 8, and 12",
        "- Conditioning target: 12–20 minutes",
        "- Cooldown: approximately 8 minutes matched to the day's primary tissues",
        "",
    ]

    for week in range(1, 13):
        lines.extend([f"## Week {week}", ""])
        for day in [item for item in days if item["phase_week"] == week]:
            number = day["overall_day"]
            lines.extend([f'### Day {number} — {day["title"]}', ""])
            if day["is_rest"]:
                lines.extend(["**REST**", ""])
                continue
            lines.extend([
                f'Estimated session: **{day["estimated_session_minutes"]} minutes**',
                "",
                f'#### Warmup — {day["warmup_minutes"]} minutes',
                "",
            ])
            lines.extend(f"- {item}" for item in day["warmup"])
            lines.extend(["", "#### Strength and skill", ""])
            lines.extend(strength(day["strength"]))
            for work in day["secondary_strength"]:
                lines.extend(["", *strength(work)])
            if day["accessories"]:
                lines.extend(["", "#### Accessories", ""])
                lines.extend(f"- {item}" for item in day["accessories"])
            conditioning = day["conditioning"]
            lines.extend([
                "",
                f'#### Conditioning — {conditioning["minutes"]} minutes',
                "",
                f'Format: **{conditioning["format"]}**  ',
                f'Effort: **{conditioning["effort"]}**  ',
                f'Energy system: **{conditioning["energy_system"]}**',
                "",
            ])
            lines.extend(f"- {item}" for item in conditioning["prescription"])
            lines.extend([
                "",
                f'#### Cooldown — {day["cooldown_minutes"]} minutes',
                "",
            ])
            lines.extend(f"- {item}" for item in day["cooldown"])
            lines.append("")

    OUTPUT.write_text("\n".join(lines))
    print(json.dumps({"output": str(OUTPUT), "days": len(days)}, indent=2))


if __name__ == "__main__":
    main()
