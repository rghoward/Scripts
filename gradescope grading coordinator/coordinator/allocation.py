from __future__ import annotations

from collections import defaultdict
from dataclasses import dataclass
from itertools import cycle


@dataclass(frozen=True)
class Cell:
    submission_id: int
    question_id: int


@dataclass(frozen=True)
class Allocation:
    submission_id: int
    question_id: int
    grader_id: int


def _require_inputs(submission_ids: list[int], question_ids: list[int], grader_ids: list[int]) -> None:
    if not submission_ids:
        raise ValueError("At least one submission is required")
    if not question_ids:
        raise ValueError("At least one question is required")
    if not grader_ids:
        raise ValueError("At least one grader is required")


def whole_questions(submission_ids: list[int], question_ids: list[int], grader_ids: list[int]) -> list[Allocation]:
    """Give every cell for each question to one grader, rotating by question."""
    _require_inputs(submission_ids, question_ids, grader_ids)
    assignments = []
    grader_cycle = cycle(grader_ids)
    for question_id in question_ids:
        grader_id = next(grader_cycle)
        assignments.extend(Allocation(submission_id, question_id, grader_id) for submission_id in submission_ids)
    return assignments


def question_ranges(submission_ids: list[int], question_ids: list[int], grader_ids: list[int]) -> list[Allocation]:
    """Split each question's frozen submission list into contiguous balanced ranges."""
    _require_inputs(submission_ids, question_ids, grader_ids)
    assignments = []
    for question_offset, question_id in enumerate(question_ids):
        rotated = grader_ids[question_offset % len(grader_ids):] + grader_ids[:question_offset % len(grader_ids)]
        for index, submission_id in enumerate(submission_ids):
            grader_index = min(index * len(rotated) // len(submission_ids), len(rotated) - 1)
            assignments.append(Allocation(submission_id, question_id, rotated[grader_index]))
    return assignments


def whole_submissions(submission_ids: list[int], question_ids: list[int], grader_ids: list[int]) -> list[Allocation]:
    """Give every question for each frozen submission to one grader."""
    _require_inputs(submission_ids, question_ids, grader_ids)
    assignments = []
    for index, submission_id in enumerate(submission_ids):
        grader_index = min(index * len(grader_ids) // len(submission_ids), len(grader_ids) - 1)
        grader_id = grader_ids[grader_index]
        assignments.extend(Allocation(submission_id, question_id, grader_id) for question_id in question_ids)
    return assignments


STRATEGIES = {
    "whole_questions": whole_questions,
    "question_ranges": question_ranges,
    "whole_submissions": whole_submissions,
}


def workloads(allocations: list[Allocation]) -> dict[int, int]:
    totals = defaultdict(int)
    for allocation in allocations:
        totals[allocation.grader_id] += 1
    return dict(totals)


def per_question_ranges(
    submission_ids: list[int],
    question_graders: dict[int, list[int]],
) -> list[Allocation]:
    """Split every question across its independently selected graders."""
    if not submission_ids:
        raise ValueError("At least one submission is required")
    if not question_graders:
        raise ValueError("At least one question configuration is required")
    result = []
    for question_id, grader_ids in question_graders.items():
        if not grader_ids:
            raise ValueError(f"Question {question_id} has no graders")
        for index, submission_id in enumerate(submission_ids):
            grader_index = min(index * len(grader_ids) // len(submission_ids), len(grader_ids) - 1)
            result.append(Allocation(submission_id, question_id, grader_ids[grader_index]))
    return result


def weighted_balanced(
    question_submissions: dict[int, list[int]],
    effort_weights: dict[int, float],
    grader_ids: list[int],
) -> list[Allocation]:
    """Balance ordered question cells by effort while preserving contiguous ranges."""
    if not grader_ids:
        raise ValueError("Select at least one grader")
    cells: list[tuple[int, int, float]] = []
    for question_id, submission_ids in question_submissions.items():
        weight = effort_weights.get(question_id, 0)
        if weight <= 0:
            raise ValueError("Effort units must be positive numbers")
        cells.extend((question_id, submission_id, weight) for submission_id in submission_ids)
    if not cells:
        raise ValueError("There is no work to allocate")
    target = sum(weight for _, _, weight in cells) / len(grader_ids)
    cumulative = 0.0
    result = []
    for question_id, submission_id, weight in cells:
        # Assign by the cell's midpoint on the cumulative effort line. This
        # creates balanced contiguous ranges without splitting a submission.
        grader_index = min(int((cumulative + weight / 2) / target), len(grader_ids) - 1)
        result.append(Allocation(submission_id, question_id, grader_ids[grader_index]))
        cumulative += weight
    return result


def weighted_submission_bundles(
    submission_questions: dict[int, list[int]],
    effort_weights: dict[int, float],
    grader_ids: list[int],
) -> list[Allocation]:
    """Balance whole remaining submissions without splitting a student across TAs."""
    if not grader_ids:
        raise ValueError("Select at least one grader")
    bundles = []
    for submission_id, question_ids in submission_questions.items():
        weight = sum(effort_weights[question_id] for question_id in question_ids)
        if question_ids and weight > 0:
            bundles.append((submission_id, question_ids, weight))
    if not bundles:
        raise ValueError("There is no work to allocate")
    target = sum(weight for _, _, weight in bundles) / len(grader_ids)
    cumulative = 0.0
    result = []
    for submission_id, question_ids, weight in bundles:
        grader_index = min(int((cumulative + weight / 2) / target), len(grader_ids) - 1)
        result.extend(Allocation(submission_id, question_id, grader_ids[grader_index]) for question_id in question_ids)
        cumulative += weight
    return result


def equal_submission_bundles(
    submission_questions: dict[int, list[int]],
    grader_ids: list[int],
) -> list[Allocation]:
    """Split students evenly while keeping each student's remaining work together."""
    if not grader_ids:
        raise ValueError("Select at least one grader")
    bundles = [(submission_id, question_ids) for submission_id, question_ids in submission_questions.items() if question_ids]
    if not bundles:
        raise ValueError("There is no work to allocate")
    result = []
    for index, (submission_id, question_ids) in enumerate(bundles):
        grader_index = min(index * len(grader_ids) // len(bundles), len(grader_ids) - 1)
        result.extend(Allocation(submission_id, question_id, grader_ids[grader_index]) for question_id in question_ids)
    return result
