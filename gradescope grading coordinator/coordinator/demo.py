from __future__ import annotations

from datetime import datetime, timedelta, timezone

from .database import connect


def seed_demo() -> None:
    """Create a realistic but entirely fictional assignment for local evaluation."""
    with connect() as database:
        existing = database.execute("SELECT id FROM courses WHERE gradescope_id='demo-course'").fetchone()
        if existing:
            return
        course_id = database.execute(
            "INSERT INTO courses (gradescope_id, code, name, term) VALUES (?, ?, ?, ?)",
            ("demo-course", "CS 2050", "Intro to Discrete Mathematics", "Demo Term"),
        ).lastrowid
        assignment_id = database.execute(
            """INSERT INTO assignments
            (course_id, gradescope_id, title, regular_deadline, late_deadline)
            VALUES (?, ?, ?, ?, ?)""",
            (
                course_id, "demo-assignment", "Homework 4",
                datetime.now(timezone.utc).isoformat(),
                (datetime.now(timezone.utc) + timedelta(days=2)).isoformat(),
            ),
        ).lastrowid
        graders = [
            ("Alex Morgan", "alex@example.edu"),
            ("Jordan Lee", "jordan@example.edu"),
            ("Sam Rivera", "sam@example.edu"),
        ]
        grader_ids = []
        for name, email in graders:
            grader_id = database.execute(
                "INSERT INTO graders (name, email) VALUES (?, ?)", (name, email)
            ).lastrowid
            grader_ids.append(grader_id)
            database.execute(
                "INSERT INTO assignment_graders (assignment_id, grader_id) VALUES (?, ?)",
                (assignment_id, grader_id),
            )
        for position in range(1, 6):
            database.execute(
                "INSERT INTO questions (assignment_id, gradescope_id, position, label, title) VALUES (?, ?, ?, ?, ?)",
                (assignment_id, f"demo-q{position}", position, f"Question {position}", f"Problem {position}"),
            )
        now = datetime.now(timezone.utc)
        for index in range(1, 45):
            database.execute(
                """INSERT INTO submissions
                (assignment_id, gradescope_id, student_key, student_name, display_index, submitted_at, is_late)
                VALUES (?, ?, ?, ?, ?, ?, 0)""",
                (assignment_id, f"demo-sub-{index}", f"demo-student-{index}", f"Student {index:02}", index, now.isoformat()),
            )
        for index in range(45, 49):
            database.execute(
                """INSERT INTO submissions
                (assignment_id, gradescope_id, student_key, student_name, display_index, submitted_at, is_late)
                VALUES (?, ?, ?, ?, ?, ?, 1)""",
                (
                    assignment_id, f"demo-sub-{index}", f"demo-student-{index}", f"Late Student {index:02}",
                    index, (now + timedelta(hours=index - 44)).isoformat(),
                ),
            )
