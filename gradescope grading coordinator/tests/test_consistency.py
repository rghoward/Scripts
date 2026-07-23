from coordinator.consistency import analyze_consistency


def test_consistency_normalizes_across_questions_and_flags_large_difference():
    observations = []
    for question, maximum, a_score, b_score in (("Tracing", 10, 9, 7), ("Coding", 20, 18, 14)):
        for _ in range(12):
            observations.extend([
                {"grader_name": "A", "question_title": question, "position": 1, "score": a_score, "max_points": maximum},
                {"grader_name": "B", "question_title": question, "position": 1, "score": b_score, "max_points": maximum},
            ])
    result = analyze_consistency(observations)
    by_name = {item["grader_name"]: item for item in result["graders"]}
    assert by_name["B"]["tendency"] > 0
    assert by_name["A"]["tendency"] < 0
    assert result["comparable_question_count"] == 2


def test_single_grader_question_is_excluded_from_comparison():
    result = analyze_consistency([
        {"grader_name": "A", "question_title": "Only", "position": 1, "score": 8, "max_points": 10},
    ])
    assert result["observation_count"] == 0
    assert result["excluded_question_count"] == 1
