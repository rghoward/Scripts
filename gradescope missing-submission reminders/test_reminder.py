from datetime import datetime
from types import SimpleNamespace
import unittest
from zoneinfo import ZoneInfo

import sqlite3

from reminder import (
    Student,
    effective_late_deadline,
    student_message,
    summary_message,
    sync_assignment_schedule,
)


class ReminderTests(unittest.TestCase):
    def setUp(self):
        self.zone = ZoneInfo("America/New_York")

    def test_policy_deadline_wins_when_gradescope_is_later(self):
        assignment = SimpleNamespace(
            due_date=datetime(2026, 7, 24, 23, 59),
            late_due_date=datetime(2026, 7, 28, 23, 59),
        )
        actual = effective_late_deadline(assignment, self.zone, 48)
        self.assertEqual(actual, datetime(2026, 7, 26, 23, 59, tzinfo=self.zone))

    def test_gradescope_deadline_wins_when_earlier(self):
        assignment = SimpleNamespace(
            due_date=datetime(2026, 7, 22, 23, 59),
            late_due_date=datetime(2026, 7, 23, 12, 0),
        )
        actual = effective_late_deadline(assignment, self.zone, 24)
        self.assertEqual(actual, datetime(2026, 7, 23, 12, 0, tzinfo=self.zone))

    def test_message_contains_student_assignment_and_deadlines(self):
        assignment = SimpleNamespace(name="HW07")
        course = {"code": "CS 1301", "policy": "The lowest homework grade is dropped."}
        due = datetime(2026, 7, 22, 23, 59, tzinfo=self.zone)
        late = datetime(2026, 7, 23, 23, 59, tzinfo=self.zone)
        subject, body, html_body = student_message(
            Student("Taylor", "Example", "student@example.edu"),
            course, assignment, due, late,
        )
        self.assertIn("HW07", subject)
        self.assertIn("Hello Taylor", body)
        self.assertIn("Thursday, July 23 at 11:59 PM EDT", body)
        self.assertIn("lowest homework grade", body)
        self.assertIn("already contacted me", body)
        self.assertIn("Course policy", html_body)
        self.assertIn("background:#003057", html_body)

    def test_summary_html_contains_counts_and_exclusions(self):
        assignment = SimpleNamespace(name="HW07")
        course = {"code": "CS 1301", "name": "Intro to Computing", "term": "Summer 2026"}
        due = datetime(2026, 7, 22, 23, 59, tzinfo=self.zone)
        late = datetime(2026, 7, 23, 23, 59, tzinfo=self.zone)
        student = Student("Taylor", "Example", "student@example.edu")
        subject, text_body, html_body = summary_message(
            course, assignment, due, late,
            [student], [], [], [(student, "Approved exception")], [], True,
        )
        self.assertIn("CS 1301", subject)
        self.assertIn("Instructor exclusions: 1", text_body)
        self.assertIn("Instructor exclusions", html_body)
        self.assertIn("Approved exception", html_body)
        self.assertIn("background:#003057", html_body)

    def test_deadline_change_reopens_completed_assignment(self):
        database = sqlite3.connect(":memory:")
        database.execute(
            "CREATE TABLE completed_runs (course_id TEXT, assignment_id TEXT, completed_at TEXT, PRIMARY KEY (course_id, assignment_id))"
        )
        database.execute(
            "CREATE TABLE assignment_schedules (course_id TEXT, assignment_id TEXT, due_at TEXT, late_at TEXT, observed_at TEXT, PRIMARY KEY (course_id, assignment_id))"
        )
        due = datetime(2026, 7, 22, 23, 59, tzinfo=self.zone)
        late = datetime(2026, 7, 23, 23, 59, tzinfo=self.zone)
        self.assertFalse(sync_assignment_schedule(database, "1", "2", due, late, due))
        database.execute("INSERT INTO completed_runs VALUES ('1', '2', 'now')")
        database.commit()
        new_due = datetime(2026, 7, 23, 23, 59, tzinfo=self.zone)
        new_late = datetime(2026, 7, 24, 23, 59, tzinfo=self.zone)
        self.assertTrue(sync_assignment_schedule(database, "1", "2", new_due, new_late, due))
        self.assertIsNone(
            database.execute(
                "SELECT 1 FROM completed_runs WHERE course_id='1' AND assignment_id='2'"
            ).fetchone()
        )


if __name__ == "__main__":
    unittest.main()
