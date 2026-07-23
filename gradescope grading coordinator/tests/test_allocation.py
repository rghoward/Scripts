import unittest
import os
import tempfile

from coordinator.allocation import equal_submission_bundles, per_question_ranges, question_ranges, weighted_balanced, weighted_submission_bundles, whole_questions, whole_submissions, workloads
from coordinator.database import connect, initialize
from coordinator.repository import allocate_round, allocate_weighted_plan, create_round


class AllocationTests(unittest.TestCase):
    def test_whole_questions_keeps_each_question_with_one_grader(self):
        allocations = whole_questions([1, 2, 3], [10, 11], [100, 101])
        self.assertEqual({a.grader_id for a in allocations if a.question_id == 10}, {100})
        self.assertEqual({a.grader_id for a in allocations if a.question_id == 11}, {101})

    def test_question_ranges_are_contiguous_and_balanced(self):
        allocations = question_ranges(list(range(1, 45)), [10], [100, 101])
        first = [a.submission_id for a in allocations if a.grader_id == 100]
        second = [a.submission_id for a in allocations if a.grader_id == 101]
        self.assertEqual(first, list(range(1, 23)))
        self.assertEqual(second, list(range(23, 45)))

    def test_whole_submissions_keeps_all_questions_together(self):
        allocations = whole_submissions([1, 2, 3, 4], [10, 11, 12], [100, 101])
        for submission_id in [1, 2, 3, 4]:
            self.assertEqual(len({a.grader_id for a in allocations if a.submission_id == submission_id}), 1)
        self.assertEqual(workloads(allocations), {100: 6, 101: 6})

    def test_each_question_can_use_a_different_grader_group(self):
        allocations = per_question_ranges(
            list(range(1, 37)),
            {10: [100], 11: [101, 102, 103]},
        )
        self.assertEqual({item.grader_id for item in allocations if item.question_id == 10}, {100})
        q2 = [item for item in allocations if item.question_id == 11]
        self.assertEqual([item.submission_id for item in q2 if item.grader_id == 101], list(range(1, 13)))
        self.assertEqual([item.submission_id for item in q2 if item.grader_id == 102], list(range(13, 25)))
        self.assertEqual([item.submission_id for item in q2 if item.grader_id == 103], list(range(25, 37)))

    def test_effort_balancing_naturally_splits_harder_question(self):
        allocations = weighted_balanced(
            {10: list(range(1, 37)), 11: list(range(1, 37))},
            {10: 1, 11: 3},
            [100, 101, 102, 103],
        )
        self.assertEqual({item.grader_id for item in allocations if item.question_id == 10}, {100})
        q2 = [item for item in allocations if item.question_id == 11]
        self.assertEqual([item.submission_id for item in q2 if item.grader_id == 101], list(range(1, 13)))
        self.assertEqual([item.submission_id for item in q2 if item.grader_id == 102], list(range(13, 25)))
        self.assertEqual([item.submission_id for item in q2 if item.grader_id == 103], list(range(25, 37)))

    def test_weighted_whole_submissions_never_split_a_student(self):
        allocations = weighted_submission_bundles(
            {submission: [10, 11, 12] for submission in range(1, 13)},
            {10: 1, 11: 2, 12: 4},
            [100, 101, 102],
        )
        for submission in range(1, 13):
            self.assertEqual(
                len({item.grader_id for item in allocations if item.submission_id == submission}),
                1,
            )

    def test_equal_submission_bundles_ignore_question_effort(self):
        allocations = equal_submission_bundles(
            {1: [10], 2: [10, 11, 12], 3: [10], 4: [10, 11, 12]},
            [100, 101],
        )
        self.assertEqual({item.grader_id for item in allocations if item.submission_id in {1, 2}}, {100})
        self.assertEqual({item.grader_id for item in allocations if item.submission_id in {3, 4}}, {101})

    def test_round_can_allocate_only_ungraded_cells(self):
        with tempfile.TemporaryDirectory() as directory:
            previous = os.environ.get("GRADING_COORDINATOR_DATA_DIR")
            os.environ["GRADING_COORDINATOR_DATA_DIR"] = directory
            try:
                initialize()
                with connect() as database:
                    course = database.execute(
                        "INSERT INTO courses (gradescope_id, code, name, term) VALUES ('c','CS','Course','Term')"
                    ).lastrowid
                    assignment = database.execute(
                        "INSERT INTO assignments (course_id, gradescope_id, title) VALUES (?, 'a', 'Exam')", (course,)
                    ).lastrowid
                    grader = database.execute("INSERT INTO graders (name, email) VALUES ('TA','ta@example.edu')").lastrowid
                    head = database.execute("INSERT INTO graders (name, email) VALUES ('Head TA','head@example.edu')").lastrowid
                    questions = [database.execute(
                        "INSERT INTO questions (assignment_id, gradescope_id, position, label) VALUES (?, ?, ?, ?)",
                        (assignment, f"q{i}", i, f"Q{i}"),
                    ).lastrowid for i in (1, 2)]
                    submissions = [database.execute(
                        "INSERT INTO submissions (assignment_id, gradescope_id, student_key, student_name, display_index) VALUES (?, ?, ?, ?, ?)",
                        (assignment, f"s{i}", f"student{i}", f"Student {i}", i),
                    ).lastrowid for i in (1, 2)]
                    database.execute(
                        "INSERT INTO grading_activity (assignment_id, submission_id, question_id) VALUES (?, ?, ?)",
                        (assignment, submissions[0], questions[0]),
                    )
                round_id = create_round(assignment, "Remaining", "initial", submissions)
                count = allocate_round(round_id, "whole_questions", [grader], only_ungraded=True)
                self.assertEqual(count, 3)
                weighted_count = allocate_weighted_plan(
                    round_id,
                    [grader],
                    {questions[0]: 1, questions[1]: 2},
                    {questions[0]: "staff_managed", questions[1]: "balanced"},
                    {questions[0]: head, questions[1]: None},
                    "by_question",
                )
                self.assertEqual(weighted_count, 3)
                with connect() as database:
                    q1_graders = {
                        row["grader_id"] for row in database.execute(
                            "SELECT grader_id FROM allocations WHERE round_id=? AND question_id=?",
                            (round_id, questions[0]),
                        )
                    }
                self.assertEqual(q1_graders, {head})
                with self.assertRaisesRegex(ValueError, "already has a grading plan"):
                    create_round(assignment, "Another initial", "initial", submissions)
            finally:
                if previous is None:
                    os.environ.pop("GRADING_COORDINATOR_DATA_DIR", None)
                else:
                    os.environ["GRADING_COORDINATOR_DATA_DIR"] = previous

    def test_combined_version_round_never_crosses_assignment_boundaries(self):
        with tempfile.TemporaryDirectory() as directory:
            previous = os.environ.get("GRADING_COORDINATOR_DATA_DIR")
            os.environ["GRADING_COORDINATOR_DATA_DIR"] = directory
            try:
                initialize()
                with connect() as database:
                    course = database.execute("INSERT INTO courses (gradescope_id,code,name,term) VALUES ('c','CS','Course','Term')").lastrowid
                    assignments = [database.execute("INSERT INTO assignments (course_id,gradescope_id,title) VALUES (?,?,?)", (course,f'a{i}',f'Version {i}')).lastrowid for i in (1,2)]
                    grader = database.execute("INSERT INTO graders (name,email) VALUES ('TA','ta@example.edu')").lastrowid
                    questions=[]; submissions=[]
                    for assignment in assignments:
                        questions.append(database.execute("INSERT INTO questions (assignment_id,gradescope_id,position,label) VALUES (?,'q',1,'Q1')", (assignment,)).lastrowid)
                        submissions.append(database.execute("INSERT INTO submissions (assignment_id,gradescope_id,student_key,student_name,display_index) VALUES (?,'s',?,'',1)", (assignment,f's{assignment}')).lastrowid)
                        database.execute("INSERT INTO assignment_graders (assignment_id,grader_id) VALUES (?,?)", (assignment,grader))
                    round_id=database.execute("INSERT INTO rounds (assignment_id,name,kind,snapshot_at,version_group) VALUES (?,'Combined','initial','now','group')", (assignments[0],)).lastrowid
                    database.executemany("INSERT INTO round_assignments (round_id,assignment_id) VALUES (?,?)", [(round_id,a) for a in assignments])
                    database.executemany("INSERT INTO round_submissions (round_id,submission_id,snapshot_index) VALUES (?,?,?)", [(round_id,s,i) for i,s in enumerate(submissions,1)])
                count=allocate_weighted_plan(round_id,[grader],{q:1 for q in questions},{q:'balanced' for q in questions},{q:None for q in questions},'by_question')
                with connect() as database:
                    pairs={(row['submission_id'],row['question_id']) for row in database.execute("SELECT submission_id,question_id FROM allocations WHERE round_id=?",(round_id,))}
                assert count == 2
                assert pairs == set(zip(submissions,questions))
            finally:
                if previous is None:
                    os.environ.pop("GRADING_COORDINATOR_DATA_DIR", None)
                else:
                    os.environ["GRADING_COORDINATOR_DATA_DIR"] = previous


if __name__ == "__main__":
    unittest.main()
