from __future__ import annotations

from datetime import datetime, timezone

from .allocation import Allocation, STRATEGIES, equal_submission_bundles, per_question_ranges, weighted_balanced
from .database import connect


def round_assignment_ids(database, round_id: int, fallback_assignment_id: int) -> list[int]:
    ids = [row["assignment_id"] for row in database.execute(
        "SELECT assignment_id FROM round_assignments WHERE round_id=? ORDER BY assignment_id", (round_id,)
    )]
    return ids or [fallback_assignment_id]


def create_round(assignment_id: int, name: str, kind: str, submission_ids: list[int]) -> int:
    if kind not in {"initial", "supplemental"}:
        raise ValueError("Unknown round type")
    if not submission_ids:
        raise ValueError("No submissions are available in the selected pool. Refresh the assignment or choose a different batch type.")
    with connect() as database:
        initial = database.execute(
            "SELECT id FROM rounds WHERE assignment_id=? AND kind='initial' AND status!='closed'", (assignment_id,)
        ).fetchone()
        if kind == "initial" and initial:
            raise ValueError("This assignment already has a grading plan")
        if kind == "supplemental" and not initial:
            raise ValueError("Create the initial grading plan before adding late submissions")
        cursor = database.execute(
            "INSERT INTO rounds (assignment_id, name, kind, snapshot_at) VALUES (?, ?, ?, ?)",
            (assignment_id, name, kind, datetime.now(timezone.utc).isoformat()),
        )
        round_id = cursor.lastrowid
        database.execute(
            "INSERT OR IGNORE INTO round_assignments (round_id, assignment_id) VALUES (?, ?)",
            (round_id, assignment_id),
        )
        database.executemany(
            "INSERT INTO round_submissions (round_id, submission_id, snapshot_index) VALUES (?, ?, ?)",
            [(round_id, submission_id, index + 1) for index, submission_id in enumerate(submission_ids)],
        )
        return round_id


def create_version_round(container_assignment_id: int, name: str) -> int:
    with connect() as database:
        container = database.execute(
            "SELECT * FROM assignments WHERE id=? AND is_container=1", (container_assignment_id,)
        ).fetchone()
        if not container:
            raise ValueError("Version group not found")
        members = database.execute(
            """SELECT * FROM assignments WHERE course_id=? AND version_group=?
            AND imported_at IS NOT NULL ORDER BY COALESCE(version_index, 0), id""",
            (container["course_id"], container["gradescope_id"]),
        ).fetchall()
        if not members:
            raise ValueError("Import at least one sub-version before creating a combined plan")
        existing = database.execute(
            "SELECT id FROM rounds WHERE version_group=? AND status!='closed'", (container["gradescope_id"],)
        ).fetchone()
        if existing:
            raise ValueError("This version group already has an active grading plan")
        submissions = database.execute(
            f"""SELECT s.id FROM submissions s WHERE s.assignment_id IN ({','.join('?' for _ in members)})
            AND s.is_late=0 ORDER BY s.assignment_id, s.display_index""",
            [row["id"] for row in members],
        ).fetchall()
        if not submissions:
            raise ValueError("The imported sub-versions do not contain submissions")
        now = datetime.now(timezone.utc).isoformat()
        cursor = database.execute(
            """INSERT INTO rounds (assignment_id,name,kind,snapshot_at,version_group,scope_title)
            VALUES (?,?,'initial',?,?,?)""",
            (members[0]["id"], name, now, container["gradescope_id"], container["title"]),
        )
        round_id = cursor.lastrowid
        database.executemany(
            "INSERT INTO round_assignments (round_id,assignment_id) VALUES (?,?)",
            [(round_id, row["id"]) for row in members],
        )
        database.executemany(
            "INSERT INTO round_submissions (round_id,submission_id,snapshot_index) VALUES (?,?,?)",
            [(round_id, row["id"], index) for index, row in enumerate(submissions, 1)],
        )
        return round_id


def allocate_question_plan(
    round_id: int,
    question_graders: dict[int, list[int]],
    effort_weights: dict[int, float],
    only_ungraded: bool = False,
) -> int:
    with connect() as database:
        round_row = database.execute("SELECT * FROM rounds WHERE id=?", (round_id,)).fetchone()
        if not round_row:
            raise ValueError("Batch not found")
        if round_row["status"] != "draft":
            raise ValueError("Published or closed batches cannot be reallocated")
        valid_questions = {
            row["id"] for row in database.execute(
                "SELECT id FROM questions WHERE assignment_id=?", (round_row["assignment_id"],)
            )
        }
        if set(question_graders) != valid_questions:
            raise ValueError("Every question must have at least one selected grader")
        submissions = [
            row["submission_id"] for row in database.execute(
                "SELECT submission_id FROM round_submissions WHERE round_id=? ORDER BY snapshot_index", (round_id,)
            )
        ]
        allocations = per_question_ranges(submissions, question_graders)
        if only_ungraded:
            graded = {
                (row["submission_id"], row["question_id"])
                for row in database.execute(
                    "SELECT submission_id, question_id FROM grading_activity WHERE assignment_id=?",
                    (round_row["assignment_id"],),
                )
            }
            allocations = [item for item in allocations if (item.submission_id, item.question_id) not in graded]
        for question_id, weight in effort_weights.items():
            if question_id not in valid_questions or weight <= 0:
                raise ValueError("Effort units must be positive numbers")
            database.execute("UPDATE questions SET effort_weight=? WHERE id=?", (weight, question_id))
        database.execute("DELETE FROM allocations WHERE round_id=?", (round_id,))
        database.executemany(
            "INSERT INTO allocations (round_id, submission_id, question_id, grader_id) VALUES (?, ?, ?, ?)",
            [(round_id, item.submission_id, item.question_id, item.grader_id) for item in allocations],
        )
        if round_row["kind"] == "initial":
            database.execute("DELETE FROM question_plan_graders WHERE assignment_id=?", (round_row["assignment_id"],))
            database.executemany(
                "INSERT INTO question_plan_graders (assignment_id, question_id, grader_id) VALUES (?, ?, ?)",
                [
                    (round_row["assignment_id"], question_id, grader_id)
                    for question_id, grader_ids in question_graders.items()
                    for grader_id in grader_ids
                ],
            )
        return len(allocations)


def allocate_weighted_plan(
    round_id: int,
    grader_ids: list[int],
    effort_weights: dict[int, float],
    question_modes: dict[int, str],
    staff_owners: dict[int, int | None],
    distribution_style: str,
) -> int:
    with connect() as database:
        round_row = database.execute("SELECT * FROM rounds WHERE id=?", (round_id,)).fetchone()
        if not round_row:
            raise ValueError("Batch not found")
        if round_row["status"] != "draft":
            raise ValueError("Published or closed batches cannot be reallocated")
        assignment_ids = round_assignment_ids(database, round_id, round_row["assignment_id"])
        placeholders = ",".join("?" for _ in assignment_ids)
        questions = database.execute(
            f"SELECT id, assignment_id FROM questions WHERE assignment_id IN ({placeholders}) ORDER BY assignment_id, position",
            assignment_ids,
        ).fetchall()
        question_ids = [row["id"] for row in questions]
        question_assignment = {row["id"]: row["assignment_id"] for row in questions}
        if set(effort_weights) != set(question_ids) or set(question_modes) != set(question_ids):
            raise ValueError("Every question requires effort and grading-mode settings")
        if distribution_style not in {"by_question", "whole_submissions"}:
            raise ValueError("Unknown distribution style")
        submissions = [
            row["submission_id"] for row in database.execute(
                "SELECT submission_id FROM round_submissions WHERE round_id=? ORDER BY snapshot_index", (round_id,)
            )
        ]
        submission_assignment = {
            row["id"]: row["assignment_id"] for row in database.execute(
                f"SELECT id, assignment_id FROM submissions WHERE assignment_id IN ({placeholders})", assignment_ids
            )
        }
        graded = {
            (row["submission_id"], row["question_id"])
            for row in database.execute(
                f"SELECT submission_id, question_id FROM grading_activity WHERE assignment_id IN ({placeholders})",
                assignment_ids,
            )
        }
        ungraded_by_question = {
            question_id: [
                submission_id for submission_id in submissions
                if submission_assignment.get(submission_id) == question_assignment[question_id]
                and (submission_id, question_id) not in graded
            ]
            for question_id in question_ids
        }
        for question_id, weight in effort_weights.items():
            if weight <= 0:
                raise ValueError("Effort units must be positive numbers")
            mode = question_modes[question_id]
            if mode not in {"balanced", "staff_managed", "excluded"}:
                raise ValueError("Unknown question grading mode")
            owner = staff_owners.get(question_id)
            if mode == "staff_managed" and not owner:
                raise ValueError("Every instructor/head-TA managed question requires an owner")
            database.execute(
                "UPDATE questions SET effort_weight=?, grading_mode=?, staff_owner_id=? WHERE id=?",
                (weight, mode, owner if mode == "staff_managed" else None, question_id),
            )
        balanced_submissions = {
            question_id: ungraded_by_question[question_id]
            for question_id in question_ids
            if question_modes[question_id] == "balanced" and ungraded_by_question[question_id]
        }
        allocations = []
        if balanced_submissions:
            if distribution_style == "by_question":
                allocations.extend(weighted_balanced(balanced_submissions, effort_weights, grader_ids))
            else:
                submission_questions = {
                    submission_id: [
                        question_id for question_id in question_ids
                        if question_id in balanced_submissions
                        and submission_id in balanced_submissions[question_id]
                    ]
                    for submission_id in submissions
                }
                allocations.extend(equal_submission_bundles(submission_questions, grader_ids))
        for question_id in question_ids:
            if question_modes[question_id] != "staff_managed":
                continue
            allocations.extend(
                Allocation(submission_id, question_id, staff_owners[question_id])
                for submission_id in ungraded_by_question[question_id]
            )
        if not allocations:
            raise ValueError("All selected work is already graded or excluded")
        database.execute("DELETE FROM allocations WHERE round_id=?", (round_id,))
        database.executemany(
            "INSERT INTO allocations (round_id, submission_id, question_id, grader_id) VALUES (?, ?, ?, ?)",
            [(round_id, item.submission_id, item.question_id, item.grader_id) for item in allocations],
        )
        if round_row["kind"] == "initial":
            database.execute(
                "UPDATE assignments SET distribution_style=? WHERE id=?",
                (distribution_style, round_row["assignment_id"]),
            )
            database.execute(
                f"DELETE FROM question_plan_graders WHERE assignment_id IN ({placeholders})", assignment_ids
            )
            database.executemany(
                "INSERT INTO question_plan_graders (assignment_id, question_id, grader_id) VALUES (?, ?, ?)",
                [
                    (database.execute("SELECT assignment_id FROM questions WHERE id=?", (question_id,)).fetchone()[0], question_id, grader_id)
                    for question_id in question_ids for grader_id in grader_ids
                ],
            )
        return len(allocations)


def allocate_round(round_id: int, strategy: str, grader_ids: list[int], only_ungraded: bool = False) -> int:
    if strategy not in STRATEGIES:
        raise ValueError("Unknown allocation strategy")
    with connect() as database:
        round_row = database.execute("SELECT * FROM rounds WHERE id=?", (round_id,)).fetchone()
        if not round_row:
            raise ValueError("Round not found")
        if round_row["status"] != "draft":
            raise ValueError("Published or closed rounds cannot be reallocated")
        submissions = database.execute(
            "SELECT submission_id FROM round_submissions WHERE round_id=? ORDER BY snapshot_index", (round_id,)
        ).fetchall()
        questions = database.execute(
            "SELECT id FROM questions WHERE assignment_id=? ORDER BY position", (round_row["assignment_id"],)
        ).fetchall()
        allocations = STRATEGIES[strategy](
            [row["submission_id"] for row in submissions],
            [row["id"] for row in questions],
            grader_ids,
        )
        if only_ungraded:
            graded = {
                (row["submission_id"], row["question_id"])
                for row in database.execute(
                    "SELECT submission_id, question_id FROM grading_activity WHERE assignment_id=?",
                    (round_row["assignment_id"],),
                )
            }
            allocations = [
                item for item in allocations if (item.submission_id, item.question_id) not in graded
            ]
        database.execute("DELETE FROM allocations WHERE round_id=?", (round_id,))
        database.executemany(
            "INSERT INTO allocations (round_id, submission_id, question_id, grader_id) VALUES (?, ?, ?, ?)",
            [(round_id, item.submission_id, item.question_id, item.grader_id) for item in allocations],
        )
        return len(allocations)


def publish_round(round_id: int) -> None:
    with connect() as database:
        round_row = database.execute("SELECT due_at FROM rounds WHERE id=?", (round_id,)).fetchone()
        if not round_row or not round_row["due_at"]:
            raise ValueError("Set a grading deadline before publishing")
        count = database.execute("SELECT COUNT(*) FROM allocations WHERE round_id=?", (round_id,)).fetchone()[0]
        if count == 0:
            raise ValueError("Allocate the round before publishing it")
        database.execute("UPDATE rounds SET status='published' WHERE id=? AND status='draft'", (round_id,))


def unassigned_late_submissions(assignment_id: int):
    with connect() as database:
        return database.execute(
            """SELECT s.* FROM submissions s
            WHERE s.assignment_id=? AND s.is_late=1
            AND NOT EXISTS (
                SELECT 1 FROM round_submissions rs
                JOIN rounds r ON r.id=rs.round_id
                WHERE rs.submission_id=s.id AND r.assignment_id=s.assignment_id
            ) ORDER BY s.submitted_at, s.student_name""",
            (assignment_id,),
        ).fetchall()
