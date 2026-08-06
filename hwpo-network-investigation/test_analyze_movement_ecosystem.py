import json
import unittest

import analyze_movement_ecosystem as ecosystem


class MovementEcosystemAnalysisTests(unittest.TestCase):
    @classmethod
    def setUpClass(cls):
        ecosystem.main()
        cls.result = json.loads(ecosystem.OUTPUT.read_text())

    def test_taxonomy_and_section_coverage_are_broad(self):
        self.assertGreaterEqual(self.result["taxonomy_size"], 80)
        for plan in ("73", "77"):
            self.assertGreater(self.result["plans"][plan]["tagged_section_percent"], 92)

    def test_non_barbell_families_are_detected(self):
        counts = self.result["plans"]["73"]["category_day_counts"]
        for family in ("core", "unilateral_leg", "inversion", "carry", "odd_object"):
            self.assertGreater(counts[family], 0)

    def test_parent_child_matches_are_not_reported_as_pairs(self):
        pairs = self.result["plans"]["73"]["top_conditioning_pairs"]
        self.assertNotIn("handstand_push_up + push_up", pairs)
        self.assertNotIn("clean + power_clean", pairs)
        self.assertNotIn("ghd_sit_up + sit_up", pairs)

    def test_aligned_analysis_captures_selective_compression(self):
        retention = self.result["aligned_flagship_sixty"]["category_retention_percent"]
        self.assertLess(retention["carry"], 10)
        self.assertLess(retention["olympic_derivative"], 10)
        self.assertGreater(retention["core"], 80)

    def test_source_workout_text_is_not_exported(self):
        self.assertFalse(self.result["source_text_exported"])
        self.assertNotIn("records", self.result)


if __name__ == "__main__":
    unittest.main()
