from datetime import datetime
from types import SimpleNamespace
import unittest
from zoneinfo import ZoneInfo

from reminder import Student, effective_late_deadline, student_message


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
        course = {"policy": "The lowest homework grade is dropped."}
        due = datetime(2026, 7, 22, 23, 59, tzinfo=self.zone)
        late = datetime(2026, 7, 23, 23, 59, tzinfo=self.zone)
        subject, body = student_message(
            Student("Taylor", "Example", "student@example.edu"),
            course, assignment, due, late,
        )
        self.assertIn("HW07", subject)
        self.assertIn("Hello Taylor", body)
        self.assertIn("Thursday, July 23 at 11:59 PM EDT", body)
        self.assertIn("lowest homework grade", body)
        self.assertIn("already contacted me", body)


if __name__ == "__main__":
    unittest.main()
