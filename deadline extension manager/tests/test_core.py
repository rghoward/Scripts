import unittest
from datetime import datetime, timezone

from deadline_manager.core import Dates, calculate_dates, normalized


class DeadlineCalculationsTest(unittest.TestCase):
    def test_normalized_titles_match_punctuation_and_case(self):
        self.assertEqual(normalized("Homework 01: Graphs!"), "homework 01 graphs")

    def test_shift_moves_due_and_late_together(self):
        start = Dates(datetime(2026, 8, 1, tzinfo=timezone.utc), datetime(2026, 8, 2, tzinfo=timezone.utc))
        result = calculate_dates(start, "shift", days=2.5)
        self.assertEqual(result.due, datetime(2026, 8, 3, 12, tzinfo=timezone.utc))
        self.assertEqual(result.late, datetime(2026, 8, 4, 12, tzinfo=timezone.utc))

    def test_rejects_late_before_due(self):
        due = datetime(2026, 8, 2, tzinfo=timezone.utc)
        late = datetime(2026, 8, 1, tzinfo=timezone.utc)
        with self.assertRaises(ValueError):
            calculate_dates(Dates(due, None), "manual", due=due, late=late)


if __name__ == "__main__":
    unittest.main()
