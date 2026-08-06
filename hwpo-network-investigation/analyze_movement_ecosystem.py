#!/usr/bin/env python3
"""Analyze the complete movement ecosystem by role, phase, and plan."""

from __future__ import annotations

import json
import re
from collections import Counter, defaultdict
from dataclasses import dataclass
from itertools import combinations
from pathlib import Path

from analyze_methodology import clean_html, meaningful_sections, record_text


ROOT = Path(__file__).resolve().parent
SOURCE = ROOT / "normalized-data" / "hwpo-workouts-with-loads.json"
OUTPUT = ROOT / "normalized-data" / "hwpo-movement-ecosystem-analysis.json"


@dataclass(frozen=True)
class Movement:
    category: str
    pattern: str
    stress: tuple[str, ...]
    skill: str = "basic"
    impact: str = "low"


M = {
    # Squat and knee-dominant strength
    "back_squat": Movement("squat", r"\bback squat", ("knee", "squat", "systemic")),
    "front_squat": Movement("squat", r"\bfront squat", ("knee", "squat", "front_rack", "systemic")),
    "overhead_squat": Movement("squat", r"\b(?:overhead squat|ohs)\b", ("knee", "squat", "overhead", "shoulder"), "advanced"),
    "air_squat": Movement("squat", r"\b(?:air squat|bodyweight squat)", ("knee", "squat")),
    "goblet_squat": Movement("squat", r"\bgoblet squat", ("knee", "squat", "front_rack")),
    "wall_ball": Movement("squat", r"\bwall ball", ("knee", "squat", "shoulder"), impact="moderate"),
    "thruster": Movement("squat", r"\bthruster", ("knee", "squat", "overhead", "shoulder", "systemic")),
    "pistol": Movement("unilateral_leg", r"\b(?:pistol|single[ -]?leg squat)", ("knee", "squat", "balance"), "advanced"),
    "split_squat": Movement("unilateral_leg", r"\b(?:split squat|bulgarian)", ("knee", "squat", "unilateral")),
    "lunge": Movement("unilateral_leg", r"\blunge", ("knee", "squat", "unilateral")),
    "step_up": Movement("unilateral_leg", r"\bstep[ -]?up", ("knee", "squat", "unilateral")),
    "cossack_squat": Movement("mobility_strength", r"\bcossack", ("knee", "adductor", "mobility")),

    # Hinge and posterior chain
    "deadlift": Movement("hinge", r"\bdeadlift", ("hinge", "posterior_chain", "grip", "systemic")),
    "romanian_deadlift": Movement("hinge", r"\b(?:romanian deadlift|rdl)\b", ("hinge", "posterior_chain")),
    "stiff_leg_deadlift": Movement("hinge", r"\bstiff[ -]?leg(?:ged)? deadlift", ("hinge", "posterior_chain")),
    "good_morning": Movement("hinge", r"\bgood morning", ("hinge", "posterior_chain")),
    "kettlebell_swing": Movement("hinge", r"\b(?:kettlebell|kb) swing", ("hinge", "posterior_chain", "grip", "systemic")),
    "hip_bridge_thrust": Movement("hinge", r"\b(?:glute bridge|hip bridge|hip thrust)", ("posterior_chain",)),
    "back_extension": Movement("hinge", r"\b(?:back extension|hip extension)", ("posterior_chain",)),
    "reverse_hyper": Movement("hinge", r"\breverse hyper", ("posterior_chain",)),
    "hamstring_curl": Movement("hinge", r"\bhamstring curl", ("posterior_chain",)),

    # Olympic lifts and derivatives
    "clean": Movement("olympic", r"\bclean(?:s|ing)?\b", ("hinge", "knee", "front_rack", "systemic"), "advanced"),
    "power_clean": Movement("olympic", r"\bpower clean", ("hinge", "knee", "front_rack", "systemic"), "advanced"),
    "squat_clean": Movement("olympic", r"\b(?:squat clean|clean \(full\))", ("hinge", "knee", "squat", "front_rack", "systemic"), "advanced"),
    "hang_clean": Movement("olympic", r"\bhang (?:power |squat )?clean", ("hinge", "knee", "front_rack"), "advanced"),
    "clean_pull": Movement("olympic_derivative", r"\bclean pull", ("hinge", "posterior_chain", "grip", "systemic"), "intermediate"),
    "snatch": Movement("olympic", r"\bsnatch(?:es|ing)?\b", ("hinge", "knee", "overhead", "shoulder", "systemic"), "advanced"),
    "power_snatch": Movement("olympic", r"\bpower snatch", ("hinge", "knee", "overhead", "shoulder"), "advanced"),
    "squat_snatch": Movement("olympic", r"\b(?:squat snatch|snatch \(full\))", ("hinge", "knee", "squat", "overhead", "shoulder", "systemic"), "advanced"),
    "hang_snatch": Movement("olympic", r"\bhang (?:power |squat )?snatch", ("hinge", "knee", "overhead", "shoulder"), "advanced"),
    "muscle_snatch": Movement("olympic_derivative", r"\bmuscle snatch", ("hinge", "overhead", "shoulder"), "intermediate"),
    "snatch_pull": Movement("olympic_derivative", r"\bsnatch pull", ("hinge", "posterior_chain", "grip", "systemic"), "intermediate"),
    "jerk": Movement("olympic", r"\bjerk(?:s|ing)?\b", ("knee", "overhead", "shoulder", "front_rack", "systemic"), "advanced"),
    "split_jerk": Movement("olympic", r"\bsplit jerk", ("knee", "overhead", "shoulder", "front_rack", "unilateral"), "advanced"),
    "push_jerk": Movement("olympic", r"\bpush jerk", ("knee", "overhead", "shoulder", "front_rack"), "advanced"),

    # Upper-body pushing
    "bench_press": Movement("horizontal_push", r"\b(?:barbell )?bench press", ("horizontal_push", "shoulder", "triceps")),
    "dumbbell_bench": Movement("horizontal_push", r"\bdumbbell bench", ("horizontal_push", "shoulder", "triceps")),
    "push_up": Movement("horizontal_push", r"\bpush[ -]?up", ("horizontal_push", "shoulder", "triceps")),
    "dip": Movement("vertical_push", r"\b(?:ring |box |bar )?dip(?:s)?\b", ("vertical_push", "shoulder", "triceps"), "intermediate"),
    "strict_press": Movement("vertical_push", r"\bstrict press", ("vertical_push", "overhead", "shoulder", "triceps")),
    "push_press": Movement("vertical_push", r"\bpush press", ("vertical_push", "overhead", "shoulder", "triceps", "knee"), "intermediate"),
    "dumbbell_press": Movement("vertical_push", r"\b(?:dumbbell|db) (?:strict |shoulder |single[ -]?arm )?press", ("vertical_push", "overhead", "shoulder", "triceps")),
    "handstand_push_up": Movement("inversion", r"\b(?:handstand push[ -]?up|hspu)", ("vertical_push", "overhead", "shoulder", "triceps", "inversion"), "advanced"),
    "wall_walk": Movement("inversion", r"\bwall walk", ("vertical_push", "overhead", "shoulder", "inversion", "core"), "advanced"),
    "handstand_walk": Movement("inversion", r"\bhandstand walk", ("overhead", "shoulder", "inversion", "core"), "advanced"),

    # Pulling and climbing
    "pull_up": Movement("vertical_pull", r"\bpull[ -]?up", ("vertical_pull", "shoulder", "grip"), "intermediate"),
    "chest_to_bar": Movement("vertical_pull", r"\b(?:chest to bar|chest-to-bar|c2b)", ("vertical_pull", "shoulder", "grip"), "advanced"),
    "muscle_up": Movement("gymnastics_transition", r"\bmuscle[ -]?up", ("vertical_pull", "vertical_push", "shoulder", "grip", "core"), "advanced"),
    "rope_climb": Movement("climb", r"\brope climb", ("vertical_pull", "grip", "core"), "advanced"),
    "ring_row": Movement("horizontal_pull", r"\bring row", ("horizontal_pull", "shoulder")),
    "barbell_row": Movement("horizontal_pull", r"\b(?:barbell|bent over) row", ("horizontal_pull", "hinge", "grip")),
    "dumbbell_row": Movement("horizontal_pull", r"\b(?:dumbbell|db) row", ("horizontal_pull", "shoulder", "grip")),
    "pulldown": Movement("vertical_pull", r"\b(?:lat |cable )?pull[ -]?down", ("vertical_pull", "shoulder")),
    "face_pull": Movement("shoulder_accessory", r"\bface pull", ("horizontal_pull", "shoulder")),
    "curl": Movement("arm_accessory", r"\bcurl", ("elbow_flexor",)),
    "triceps_extension": Movement("arm_accessory", r"\b(?:tricep|triceps) extension", ("triceps",)),

    # Trunk and hanging core
    "toes_to_bar": Movement("hanging_core", r"\b(?:toes to bar|toes-to-bar|t2b)", ("core", "grip", "shoulder"), "advanced"),
    "knee_raise_tuck": Movement("hanging_core", r"\b(?:knee raise|knee tuck|knees to elbow)", ("core", "grip"), "intermediate"),
    "sit_up": Movement("core", r"\bsit[ -]?up", ("core",)),
    "ghd_sit_up": Movement("core", r"\bghd sit", ("core", "hip_flexor"), "intermediate"),
    "v_up": Movement("core", r"\bv[ -]?up", ("core",)),
    "plank": Movement("core", r"\b(?:front |side )?plank", ("core",)),
    "hollow": Movement("core", r"\bhollow", ("core",)),
    "l_sit": Movement("core", r"\bl[ -]?sit", ("core", "shoulder"), "advanced"),
    "flutter_kick": Movement("core", r"\bflutter kick", ("core", "hip_flexor")),
    "russian_twist": Movement("core", r"\brussian twist", ("core",)),
    "dead_bug": Movement("core", r"\bdead bug", ("core",)),

    # Locomotion, cyclical, jumping and general mixed work
    "rowing": Movement("cyclical", r"\b(?:row|rowing|rower)\b", ("cyclical", "hinge", "horizontal_pull", "grip")),
    "ski_erg": Movement("cyclical", r"\b(?:ski erg|skierg|cal ski|ski calories)\b", ("cyclical", "vertical_pull", "core")),
    "fan_bike": Movement("cyclical", r"\b(?:fan bike|assault bike|echo bike)\b", ("cyclical", "knee", "systemic")),
    "spin_bike": Movement("cyclical", r"\bspin bike", ("cyclical", "knee")),
    "running": Movement("locomotion", r"\b(?:run|running|\d+m run)\b", ("cyclical", "impact", "knee"), impact="high"),
    "swimming": Movement("cyclical", r"\b(?:swim|swimming)\b", ("cyclical", "shoulder")),
    "double_under": Movement("jump_rope", r"\b(?:double under|double-under|du\b)", ("impact", "calf", "coordination"), "intermediate", "high"),
    "single_under": Movement("jump_rope", r"\b(?:single under|single-under)", ("impact", "calf", "coordination"), impact="moderate"),
    "box_jump": Movement("jump", r"\bbox jump", ("impact", "knee", "power"), "intermediate", "high"),
    "broad_jump": Movement("jump", r"\bbroad jump", ("impact", "knee", "power"), "intermediate", "high"),
    "burpee": Movement("mixed_bodyweight", r"\bburpee", ("horizontal_push", "impact", "systemic"), impact="moderate"),

    # Carries, objects and sleds
    "farmer_carry": Movement("carry", r"\b(?:farmer|farmers|farmer's) (?:carry|walk)", ("carry", "grip", "core")),
    "suitcase_carry": Movement("carry", r"\bsuitcase carry", ("carry", "grip", "core", "unilateral")),
    "front_rack_carry": Movement("carry", r"\bfront rack carry", ("carry", "front_rack", "core")),
    "overhead_carry": Movement("carry", r"\boverhead carry", ("carry", "overhead", "shoulder", "core")),
    "bear_hug_carry": Movement("carry", r"\b(?:bear hug|bear-hug)", ("carry", "core", "grip")),
    "sandbag": Movement("odd_object", r"\b(?:sandbag|sand bag|dball|d-ball)", ("odd_object", "grip", "core", "systemic")),
    "sled_push_pull": Movement("sled", r"\bsled", ("sled", "knee", "systemic")),
    "turkish_get_up": Movement("mixed_strength", r"\bturkish get[ -]?up", ("core", "shoulder", "overhead"), "intermediate"),
    "devils_press": Movement("mixed_strength", r"\bdevil'?s? press", ("hinge", "horizontal_push", "overhead", "systemic"), "intermediate"),
    "med_ball_slam": Movement("mixed_strength", r"\b(?:med(?:icine)? ball|wall ball) slam", ("hinge", "core", "shoulder", "systemic")),
}

# The taxonomy is deliberately hierarchical for prevalence reporting (for
# example, every power clean is also a clean). These parent/child matches must
# not be presented as two independently paired movements in conditioning.
HIERARCHICAL_PAIRS = {
    frozenset((parent, child))
    for parent, children in {
        "clean": ("power_clean", "squat_clean", "hang_clean"),
        "snatch": ("power_snatch", "squat_snatch", "hang_snatch", "muscle_snatch"),
        "jerk": ("split_jerk", "push_jerk"),
        "push_up": ("handstand_push_up",),
        "sit_up": ("ghd_sit_up",),
    }.items()
    for child in children
}

# A generic lift word can occur inside an odd-object prescription (for example,
# a sandbag clean), so these are not reliable evidence of two paired movements.
AMBIGUOUS_IMPLEMENT_PAIRS = {
    frozenset((lift, "sandbag")) for lift in ("clean", "snatch")
}


def role_for(title: object) -> str:
    title = str(title or "").strip().lower()
    if "warm" in title:
        return "warmup"
    if any(word in title for word in ("strength", "bench press")):
        return "strength"
    if any(word in title for word in ("metcon", "cardio", "conditioning", "emom", "spin bike", "fan bike", "swim", "zone 2")):
        return "conditioning"
    if "accessory" in title:
        return "accessory"
    if "bonus" in title:
        return "bonus"
    if any(word in title for word in ("skill", "gymnastics")):
        return "skill"
    if "rest" in title:
        return "rest"
    return "other"


def tags(text: str) -> set[str]:
    return {name for name, movement in M.items() if re.search(movement.pattern, text, re.I)}


def independent_pair(left: str, right: str) -> bool:
    pair = frozenset((left, right))
    return pair not in HIERARCHICAL_PAIRS and pair not in AMBIGUOUS_IMPLEMENT_PAIRS


def plan_summary(records: list[dict]) -> dict:
    movement_days = Counter()
    movement_sections = defaultdict(Counter)
    category_days = Counter()
    stress_days = Counter()
    skill_days = Counter()
    impact_days = Counter()
    metcon_pairs = Counter()
    tagged_sections = 0
    total_sections = 0
    untagged_roles = Counter()
    block_movements = defaultdict(Counter)

    for record in records:
        day = int(record["requested_day_number"])
        day_tags = tags(record_text(record))
        movement_days.update(day_tags)
        category_days.update({M[tag].category for tag in day_tags})
        stress_days.update({stress for tag in day_tags for stress in M[tag].stress})
        skill_days.update({M[tag].skill for tag in day_tags})
        impact_days.update({M[tag].impact for tag in day_tags})
        block = ((day - 1) // 84) + 1
        block_movements[block].update(day_tags)

        for section in meaningful_sections(record):
            total_sections += 1
            role = role_for(section.get("title"))
            section_tags = tags(clean_html(section.get("description")))
            tagged_sections += int(bool(section_tags))
            if not section_tags:
                untagged_roles[role] += 1
            for tag in section_tags:
                movement_sections[tag][role] += 1
            if role == "conditioning":
                for pair in combinations(sorted(section_tags), 2):
                    if independent_pair(*pair):
                        metcon_pairs[" + ".join(pair)] += 1

    return {
        "workout_days": len(records),
        "movement_day_counts": dict(movement_days.most_common()),
        "movement_section_roles": {
            tag: dict(counts.most_common())
            for tag, counts in sorted(movement_sections.items())
        },
        "category_day_counts": dict(category_days.most_common()),
        "stress_day_counts": dict(stress_days.most_common()),
        "skill_level_day_counts": dict(skill_days.most_common()),
        "impact_level_day_counts": dict(impact_days.most_common()),
        "top_conditioning_pairs": dict(metcon_pairs.most_common(50)),
        "tagged_section_percent": round(tagged_sections * 100 / max(1, total_sections), 1),
        "tagged_sections": tagged_sections,
        "total_meaningful_sections": total_sections,
        "untagged_section_roles": dict(untagged_roles.most_common()),
        "blocks": {
            str(block): dict(counts.most_common())
            for block, counts in sorted(block_movements.items())
        },
    }


def aligned_summary(flagship: list[dict], sixty: list[dict]) -> dict:
    f = {int(record["requested_day_number"]): record for record in flagship}
    s = {int(record["requested_day_number"]): record for record in sixty}
    days = sorted(set(f) & set(s))
    source = Counter()
    retained = Counter()
    source_by_category = Counter()
    retained_by_category = Counter()
    for day in days:
        ft, st = tags(record_text(f[day])), tags(record_text(s[day]))
        source.update(ft)
        retained.update(ft & st)
        f_categories = {M[tag].category for tag in ft}
        s_categories = {M[tag].category for tag in st}
        source_by_category.update(f_categories)
        retained_by_category.update(f_categories & s_categories)
    return {
        "aligned_days": len(days),
        "movement_source_counts": dict(source.most_common()),
        "movement_retention_percent": {
            tag: round(retained[tag] * 100 / count, 1)
            for tag, count in source.most_common()
        },
        "category_retention_percent": {
            category: round(retained_by_category[category] * 100 / count, 1)
            for category, count in source_by_category.most_common()
        },
    }


def main() -> None:
    document = json.loads(SOURCE.read_text())
    by_plan = defaultdict(list)
    for record in document["records"]:
        by_plan[int(record["plan_id"])].append(record)
    result = {
        "method": "full movement taxonomy presence and section-role analysis",
        "source": str(SOURCE.relative_to(ROOT)),
        "source_text_exported": False,
        "taxonomy_size": len(M),
        "taxonomy": {
            name: {
                "category": movement.category,
                "stress": list(movement.stress),
                "skill": movement.skill,
                "impact": movement.impact,
            }
            for name, movement in M.items()
        },
        "plans": {str(plan): plan_summary(records) for plan, records in sorted(by_plan.items())},
        "aligned_flagship_sixty": aligned_summary(by_plan[73], by_plan[77]),
    }
    OUTPUT.write_text(json.dumps(result, indent=2) + "\n")
    print(json.dumps({
        "output": str(OUTPUT),
        "taxonomy_size": len(M),
        "tagged_section_percent": {
            plan: summary["tagged_section_percent"]
            for plan, summary in result["plans"].items()
        },
    }, indent=2))


if __name__ == "__main__":
    main()
