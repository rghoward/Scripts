import 'package:flutter_test/flutter_test.dart';
import 'package:hoots_and_reps/main.dart' show selectedSkillQualifications;
import 'package:hoots_and_reps/programming/programming_engine.dart';
import 'package:hoots_and_reps/profile/athlete_profile_page.dart';
import 'package:shared_preferences/shared_preferences.dart';

void main() {
  test(
    'athlete profile persists PRs, training maxes, and unit preference',
    () async {
      SharedPreferences.setMockInitialValues({});
      final prefs = await SharedPreferences.getInstance();
      const settings = AthleteSettings(
        unit: WeightUnit.kilograms,
        personalRecordsLb: {'back_squat': 300},
        trainingMaxesLb: {'back_squat': 270},
        movementPreferences: {
          'running': MovementPreference.temporarilyUnavailable,
          'burpee': MovementPreference.dislike,
        },
        restrictedPatterns: {'impact'},
        reportedInjuries: ['Clinician advised no running this week'],
        skillQualifications: {'olympicLifting', 'doubleUnder'},
      );

      await settings.save(prefs);
      final loaded = AthleteSettings.load(prefs);

      expect(loaded.unit, WeightUnit.kilograms);
      expect(loaded.personalRecordsLb['back_squat'], 300);
      expect(loaded.trainingMaxesLb['back_squat'], 270);
      expect(
        loaded.movementPreferences['running'],
        MovementPreference.temporarilyUnavailable,
      );
      expect(loaded.restrictedPatterns, contains('impact'));
      expect(loaded.reportedInjuries, hasLength(1));
      expect(loaded.skillQualifications, {'olympicLifting', 'doubleUnder'});
    },
  );

  test('default seeded lifts are PRs and training maxes are optional', () {
    expect(AthleteSettings.defaults.personalRecordsLb['back_squat'], 275);
    expect(AthleteSettings.defaults.trainingMaxesLb, isEmpty);
    expect(
      AthleteSettings.defaults.effectiveTrainingMaxesLb['back_squat'],
      275,
    );
  });

  test('legacy max without a PR migrates to PR', () async {
    SharedPreferences.setMockInitialValues({
      AthleteSettings.storageKey:
          '{"unit":"pounds","personal_records_lb":{},"training_maxes_lb":{"back_squat":275}}',
    });
    final prefs = await SharedPreferences.getInstance();

    final loaded = AthleteSettings.load(prefs);

    expect(loaded.personalRecordsLb['back_squat'], 275);
    expect(loaded.trainingMaxesLb['back_squat'], isNull);
  });

  test('training max overrides PR only when explicitly supplied', () {
    const settings = AthleteSettings(
      unit: WeightUnit.pounds,
      personalRecordsLb: {'back_squat': 300, 'deadlift': 400},
      trainingMaxesLb: {'back_squat': 255},
    );

    expect(settings.effectiveTrainingMaxesLb['back_squat'], 255);
    expect(settings.effectiveTrainingMaxesLb['deadlift'], 400);
  });

  test('profiles from before skills selection retain all qualifications', () {
    final settings = AthleteSettings.decode(
      '{"unit":"pounds","personal_records_lb":{},"training_maxes_lb":{}}',
    );

    expect(settings.skillQualifications, allSkillQualificationKeys);
  });

  test('selected profile skills become engine qualifications', () {
    const settings = AthleteSettings(
      unit: WeightUnit.pounds,
      personalRecordsLb: {},
      trainingMaxesLb: {},
      skillQualifications: {'boxJump', 'doubleUnder'},
    );

    expect(selectedSkillQualifications(settings), {
      SkillQualification.boxJump,
      SkillQualification.doubleUnder,
    });
  });

  test('the seeded production profile can generate a complete phase', () {
    final settings = AthleteSettings.defaults;
    final athlete = AthleteProfile(
      id: 'local-athlete',
      trainingMaxes: settings.effectiveTrainingMaxesLb,
      qualifications: selectedSkillQualifications(settings),
      sessionMinutes: 90,
    );

    expect(
      () => const DeterministicProgrammingEngine().generatePhase(
        athlete: athlete,
        startsOn: DateTime(2026, 7, 27),
      ),
      returnsNormally,
    );
  });
}
