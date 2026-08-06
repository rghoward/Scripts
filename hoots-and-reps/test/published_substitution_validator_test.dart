import 'package:flutter_test/flutter_test.dart';
import 'package:hoots_and_reps/programming/programming_engine.dart';
import 'package:hoots_and_reps/programming/published_substitution_validator.dart';

void main() {
  const engine = DeterministicProgrammingEngine();
  const athlete = AthleteProfile(
    id: 'publisher-audit',
    trainingMaxes: {
      'back_squat': 275,
      'front_squat': 215,
      'overhead_squat': 160,
      'bench_press': 150,
      'strict_press': 125,
      'clean': 175,
      'clean_and_jerk': 150,
      'snatch': 125,
      'deadlift': 275,
      'barbell_row': 165,
      'split_squat': 120,
    },
    qualifications: AthleteProfile.allQualifications,
    sessionMinutes: 90,
  );

  test('publisher revalidates every reviewed substitution edge in a phase', () {
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );

    final checked = const PublishedSubstitutionValidator().validate(
      phase: phase,
      sessionMinutes: 90,
    );

    expect(checked, greaterThan(100));
  });
}
