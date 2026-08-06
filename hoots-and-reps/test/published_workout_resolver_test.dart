import 'package:flutter_test/flutter_test.dart';
import 'package:hoots_and_reps/profile/athlete_profile_page.dart';
import 'package:hoots_and_reps/programming/movement_substitutions.dart';
import 'package:hoots_and_reps/programming/published_workout_resolver.dart';

void main() {
  const resolver = PublishedWorkoutResolver();

  test('regresses unselected skill work only in unfinished prescriptions', () {
    const athlete = AthleteSettings(
      unit: WeightUnit.pounds,
      personalRecordsLb: {},
      trainingMaxesLb: {},
      skillQualifications: {},
    );
    final future = resolver.resolve(
      body:
          'Hang Clean + Power Clean Technique\n3 × 3\n\nDouble-Under Skill Practice\n3 × 30',
      athlete: athlete,
      completed: false,
    );
    expect(future.body, contains('Dumbbell Jump-Shrug Technique'));
    expect(future.body, contains('Single-Under Rhythm Practice'));
    expect(future.reasons, hasLength(2));

    final completed = resolver.resolve(
      body: 'Double-Under Skill Practice',
      athlete: athlete,
      completed: true,
    );
    expect(completed.body, 'Double-Under Skill Practice');
    expect(completed.reasons, isEmpty);
  });

  test('uses a reviewed equipment alternative only for future work', () {
    const athlete = AthleteSettings(
      unit: WeightUnit.pounds,
      personalRecordsLb: {},
      trainingMaxesLb: {},
      availableEquipment: {'ski_erg'},
    );
    final resolved = resolver.resolve(
      body: 'Row 500 meters at a repeatable pace.',
      athlete: athlete,
      completed: false,
    );
    expect(resolved.body, contains('SkiErg'));
    expect(
      resolved.reasons,
      contains('Rower is unavailable in Equipment Access.'),
    );
  });

  test('converts barbell percentage work for a dumbbell-only setup', () {
    const athlete = AthleteSettings(
      unit: WeightUnit.pounds,
      personalRecordsLb: {},
      trainingMaxesLb: {},
      availableEquipment: {'dumbbells'},
    );
    final resolved = resolver.resolve(
      body: 'Back Squat\n3 × 5 at 70%',
      athlete: athlete,
      completed: false,
    );
    expect(resolved.body, contains('Dumbbell Goblet Squat'));
    expect(resolved.body, contains('at a moderate load'));
    expect(
      resolved.reasons,
      contains('Barbell is unavailable in Equipment Access.'),
    );
  });

  test('converts barbell Olympic practice for a dumbbell-only setup', () {
    const athlete = AthleteSettings(
      unit: WeightUnit.pounds,
      personalRecordsLb: {},
      trainingMaxesLb: {},
      availableEquipment: {'dumbbells'},
    );
    final resolved = resolver.resolve(
      body: 'Power Clean\n3 × 3 at 65%',
      athlete: athlete,
      completed: false,
    );
    expect(resolved.body, contains('Dumbbell Clean Technique'));
    expect(resolved.body, contains('at a moderate load'));
  });

  test('never offers a hard movement boundary as a reviewed substitution', () {
    const registry = MovementSubstitutionRegistry();
    const safety = ReviewedSubstitutionSafety();
    const athlete = AthleteSettings(
      unit: WeightUnit.pounds,
      personalRecordsLb: {},
      trainingMaxesLb: {},
      skillQualifications: {},
      movementPreferences: {'front_squat': MovementPreference.cannotPerform},
    );

    final candidates = safety.safeCandidates(
      movement: 'back_squat',
      athlete: athlete,
      registry: registry,
    );
    expect(
      candidates.map((candidate) => candidate.replacement),
      isNot(contains('Front Squat')),
    );
  });

  test(
    'automatically replaces hard movement boundaries in future work only',
    () {
      const athlete = AthleteSettings(
        unit: WeightUnit.pounds,
        personalRecordsLb: {},
        trainingMaxesLb: {},
        skillQualifications: {},
        movementPreferences: {'back_squat': MovementPreference.cannotPerform},
      );
      final future = resolver.resolve(
        body: 'Back Squat\n3 × 5 at 70%',
        athlete: athlete,
        completed: false,
      );
      expect(future.body, isNot(contains('Back Squat')));
      expect(future.reasons.join(' '), contains('marked unavailable'));

      final completed = resolver.resolve(
        body: 'Back Squat\n3 × 5 at 70%',
        athlete: athlete,
        completed: true,
      );
      expect(completed.body, contains('Back Squat'));
    },
  );

  test(
    'uses a safe cardio fallback rather than cycling unavailable machines',
    () {
      const athlete = AthleteSettings(
        unit: WeightUnit.pounds,
        personalRecordsLb: {},
        trainingMaxesLb: {},
        skillQualifications: {},
        availableEquipment: {'barbell'},
      );
      final resolved = resolver.resolve(
        body: 'Row 500 meters at a repeatable pace.',
        athlete: athlete,
        completed: false,
      );
      expect(resolved.body, contains('Run'));
      expect(resolved.body, isNot(contains('SkiErg')));
      expect(resolved.body, isNot(contains('Fan Bike')));
    },
  );
}
