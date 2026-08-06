#!/usr/bin/env python3

import json
import unittest
from pathlib import Path


ROOT = Path(__file__).resolve().parent
DATA = ROOT / "normalized-data" / "hwpo-workouts-with-loads.json"


class LoadNormalizationTests(unittest.TestCase):
    @classmethod
    def setUpClass(cls) -> None:
        cls.document = json.loads(DATA.read_text())

    def annotations(self, plan_id: int, day: int):
        record = next(
            record
            for record in self.document["records"]
            if record["plan_id"] == plan_id
            and record["requested_day_number"] == day
        )
        return [
            annotation
            for section in record["response"]["schedule"]["sections"]
            for annotation in section.get("load_annotations", [])
        ]

    def test_flagship_day_one_back_squat(self):
        annotations = self.annotations(73, 1)
        values = {
            (item["rendered_load_lb"], item["percent_of_max"])
            for item in annotations
            if item["benchmark_code"] == "1RM_BACKSQ"
        }
        self.assertIn((148.2, 57.0), values)
        self.assertIn((197.6, 76.0), values)

    def test_sixty_day_286_deadlift(self):
        annotations = self.annotations(77, 286)
        values = {
            (item["rendered_load_lb"], item["percent_of_max"])
            for item in annotations
            if item["benchmark_code"] == "1RM_DEADLIFT"
        }
        self.assertEqual(
            values,
            {(206.25, 75.0), (220.0, 80.0), (233.75, 85.0), (178.75, 65.0)},
        )

    def test_source_archive_was_not_rewritten(self):
        source = json.loads(
            (ROOT / "clean-data" / "hwpo-workouts-complete.json").read_text()
        )
        self.assertNotIn("load_normalization", source)

    def test_no_annotations_are_left_unreviewed(self):
        summary = self.document["load_normalization"]
        self.assertEqual(
            summary["review_status_counts"].get("verified"),
            summary["annotation_count"],
        )
        self.assertNotIn("needs_manual_review", summary["review_status_counts"])


if __name__ == "__main__":
    unittest.main()
