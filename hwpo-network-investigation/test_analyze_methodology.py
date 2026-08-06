#!/usr/bin/env python3

import json
import unittest
from pathlib import Path


ROOT = Path(__file__).resolve().parent
DATA = ROOT / "normalized-data" / "hwpo-methodology-analysis.json"


class MethodologyAnalysisTests(unittest.TestCase):
    @classmethod
    def setUpClass(cls) -> None:
        cls.analysis = json.loads(DATA.read_text())

    def test_corpus_and_alignment_are_complete(self):
        self.assertEqual(self.analysis["plans"]["73"]["workout_days"], 481)
        self.assertEqual(self.analysis["plans"]["77"]["workout_days"], 661)
        self.assertEqual(self.analysis["aligned_flagship_sixty"]["aligned_days"], 196)

    def test_weekly_rest_signature_is_preserved(self):
        flagship = self.analysis["plans"]["73"]["cycle_position_counts"]
        self.assertEqual(flagship["7"], {"rest": 68})
        for position in map(str, range(1, 7)):
            self.assertNotIn("rest", flagship[position])

    def test_olympic_lifts_are_prominent(self):
        flagship = self.analysis["plans"]["73"]["movement_day_counts"]
        self.assertGreater(flagship["snatch"], flagship["back_squat"])
        self.assertGreater(flagship["clean"], flagship["back_squat"])
        self.assertGreater(flagship["jerk"], flagship["bench_press"])

    def test_source_workout_text_is_not_exported(self):
        self.assertFalse(self.analysis["source_text_exported"])
        serialized = DATA.read_text().lower()
        self.assertNotIn("don't rush your warmup", serialized)


if __name__ == "__main__":
    unittest.main()
