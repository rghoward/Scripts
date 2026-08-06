import 'package:flutter_test/flutter_test.dart';
import 'package:hoots_and_reps/programming/programming_engine.dart';
import 'package:hoots_and_reps/programming/movement_substitutions.dart';

void main() {
  const engine = DeterministicProgrammingEngine();
  const athlete = AthleteProfile(
    id: 'test-athlete',
    trainingMaxes: {
      'back_squat': 275,
      'strict_press': 135,
      'clean': 205,
      'deadlift': 335,
    },
    qualifications: AthleteProfile.allQualifications,
  );

  test('generates a safe deterministic default week', () {
    final first = engine.generateWeek(
      athlete: athlete,
      weekOf: DateTime(2026, 7, 29),
      phaseWeek: 1,
    );
    final second = engine.generateWeek(
      athlete: athlete,
      weekOf: DateTime(2026, 7, 27),
      phaseWeek: 1,
    );

    expect(first.days.length, 7);
    expect(first.restDayCount, greaterThanOrEqualTo(2));
    expect(first.hardMetconCount, lessThanOrEqualTo(2));
    expect(
      first.days.map((day) => day.title),
      second.days.map((day) => day.title),
    );
    expect(
      first.days
          .where((day) => !day.isRest)
          .every((day) => day.warmupMinutes >= 8),
      isTrue,
    );
    expect(
      first.days
          .where((day) => day.conditioning != null)
          .every(
            (day) =>
                day.conditioning!.durationMinutes >= 12 &&
                day.conditioning!.durationMinutes <= 20,
          ),
      isTrue,
    );
  });

  test('calculates every step from a training max', () {
    final week = engine.generateWeek(
      athlete: athlete,
      weekOf: DateTime(2026, 7, 27),
      phaseWeek: 1,
    );
    final squat = week.days.first.strength!;

    expect(squat.loadingPattern, LoadingPattern.ascending);
    expect(squat.steps.map((step) => step.percent), [.60, .67, .73, .78]);
    expect(squat.suggestedLoad, 215);
  });

  test('every fourth week reduces training stress', () {
    final normal = engine.generateWeek(
      athlete: athlete,
      weekOf: DateTime(2026, 7, 27),
      phaseWeek: 3,
    );
    final deload = engine.generateWeek(
      athlete: athlete,
      weekOf: DateTime(2026, 8, 3),
      phaseWeek: 4,
    );

    expect(deload.hardMetconCount, 0);
    expect(
      deload.days.first.strength!.sets,
      lessThan(normal.days.first.strength!.sets),
    );
    expect(
      deload.days.first.strength!.percent,
      lessThan(normal.days.first.strength!.percent),
    );
  });

  test('readiness changes are explicit and deterministic', () {
    final planned = engine
        .generateWeek(
          athlete: athlete,
          weekOf: DateTime(2026, 7, 27),
          phaseWeek: 1,
        )
        .days
        .first;
    final yellow = engine.applyReadiness(planned, Readiness.yellow);
    final red = engine.applyReadiness(planned, Readiness.red);

    expect(yellow.strength!.sets, lessThan(planned.strength!.sets));
    expect(yellow.secondaryStrength, isEmpty);
    expect(yellow.conditioning!.effort, Effort.easy);
    expect(red.isRest, isTrue);
    expect(red.strength, isNull);
    expect(red.accessories, isEmpty);
  });

  test('training days contain exact authored workout content', () {
    final week = engine.generateWeek(
      athlete: athlete,
      weekOf: DateTime(2026, 7, 27),
      phaseWeek: 1,
    );
    final trainingDays = week.days.where((day) => !day.isRest);

    expect(trainingDays.every((day) => day.warmup.isNotEmpty), isTrue);
    expect(trainingDays.every((day) => day.accessories.isNotEmpty), isTrue);
    expect(
      trainingDays.every((day) => day.conditioning!.prescription.isNotEmpty),
      isTrue,
    );
    expect(
      week.days.first.conditioning!.prescription,
      contains('Row 3:00 at a moderate-hard but repeatable pace'),
    );
    expect(week.days.first.conditioning!.format, 'Intervals');
  });

  test('reviewed supplemental work is preserved as distinct movements', () {
    final week = engine.generateWeek(
      athlete: athlete,
      weekOf: DateTime(2026, 7, 27),
      phaseWeek: 1,
    );

    for (final day in week.days.where((day) => !day.isRest)) {
      final movementNames = [
        day.strength!.movement,
        ...day.secondaryStrength.map((work) => work.movement),
      ];
      expect(movementNames.toSet(), hasLength(movementNames.length));
    }
  });

  test('hard conditioning does not duplicate its primary movement pattern', () {
    final week = engine.generateWeek(
      athlete: athlete,
      weekOf: DateTime(2026, 7, 27),
      phaseWeek: 1,
    );

    for (final day in week.days.where(
      (day) => day.conditioning?.effort == Effort.hard,
    )) {
      expect(
        day.conditioning!.movementPatterns,
        isNot(contains(day.strength!.primaryPattern)),
      );
    }
  });

  test('deload uses reduced accessory templates for every training role', () {
    final deload = engine.generateWeek(
      athlete: athlete,
      weekOf: DateTime(2026, 8, 17),
      phaseWeek: 4,
    );

    expect(
      deload.days
          .where((day) => !day.isRest)
          .every((day) => day.accessories.length == 1),
      isTrue,
    );
  });

  test('two-week rotation does not repeat exact authored templates', () {
    final weekOne = engine.generateWeek(
      athlete: athlete,
      weekOf: DateTime(2026, 7, 27),
      phaseWeek: 1,
    );
    final weekTwo = engine.generateWeek(
      athlete: athlete,
      weekOf: DateTime(2026, 8, 3),
      phaseWeek: 2,
    );
    final trainingDays = [
      ...weekOne.days,
      ...weekTwo.days,
    ].where((day) => !day.isRest);

    expect(trainingDays.map((day) => day.warmupTemplateId).toSet().length, 8);
    expect(
      trainingDays.map((day) => day.accessoryTemplateId).toSet().length,
      8,
    );
    expect(
      trainingDays.map((day) => day.conditioning!.templateId).toSet().length,
      greaterThanOrEqualTo(5),
    );
    final one = weekOne.days.where((day) => !day.isRest).toList();
    final two = weekTwo.days.where((day) => !day.isRest).toList();
    for (var index = 0; index < one.length; index++) {
      expect(
        one[index].conditioning!.templateId,
        isNot(two[index].conditioning!.templateId),
      );
    }
  });

  test('each initial week has two intentional rowing exposures', () {
    for (var phaseWeek = 1; phaseWeek <= 2; phaseWeek++) {
      final week = engine.generateWeek(
        athlete: athlete,
        weekOf: DateTime(2026, 7, 27).add(Duration(days: 7 * (phaseWeek - 1))),
        phaseWeek: phaseWeek,
      );
      final rowingDays = week.days.where(
        (day) => !day.isRest && day.equipment.contains('rower'),
      );

      expect(rowingDays.length, inInclusiveRange(2, 3));
    }
  });

  test('generated workout exposes structured equipment requirements', () {
    final day = engine
        .generateWeek(
          athlete: athlete,
          weekOf: DateTime(2026, 7, 27),
          phaseWeek: 1,
        )
        .days
        .first;

    expect(day.equipment, containsAll({'rower', 'dumbbells', 'rings'}));
  });

  test('twelve-week phase uses every approved loading family', () {
    final patterns = <LoadingPattern>{};
    for (var phaseWeek = 1; phaseWeek <= 12; phaseWeek++) {
      final week = engine.generateWeek(
        athlete: athlete,
        weekOf: DateTime(2026, 7, 27).add(Duration(days: 7 * (phaseWeek - 1))),
        phaseWeek: phaseWeek,
      );
      for (final day in week.days.where((day) => !day.isRest)) {
        patterns.add(day.strength!.loadingPattern);
        patterns.addAll(
          day.secondaryStrength.map((work) => work.loadingPattern),
        );
      }
    }
    expect(patterns, containsAll(LoadingPattern.values));
  });

  test('phase restores analyzed movement breadth', () {
    final movements = <String>{};
    final patterns = <String>{};
    for (var phaseWeek = 1; phaseWeek <= 12; phaseWeek++) {
      final week = engine.generateWeek(
        athlete: athlete,
        weekOf: DateTime(2026, 7, 27).add(Duration(days: 7 * (phaseWeek - 1))),
        phaseWeek: phaseWeek,
      );
      for (final day in week.days.where((day) => !day.isRest)) {
        final work = [day.strength!, ...day.secondaryStrength];
        movements.addAll(work.map((item) => item.movement));
        patterns.addAll(work.map((item) => item.primaryPattern));
      }
    }
    expect(movements.any((name) => name.contains('Snatch')), isTrue);
    expect(movements.any((name) => name.contains('Jerk')), isTrue);
    expect(
      movements,
      containsAll({'Bench Press', 'Overhead Squat', 'Strict Pull-Up'}),
    );
    expect(
      patterns,
      containsAll({
        'squat',
        'hinge',
        'horizontal_push',
        'vertical_push',
        'vertical_pull',
      }),
    );
  });

  test(
    'advanced gymnastics is isolated as practice rather than metcon work',
    () {
      for (var phaseWeek = 1; phaseWeek <= 12; phaseWeek++) {
        final week = engine.generateWeek(
          athlete: athlete,
          weekOf: DateTime(2026, 7, 27),
          phaseWeek: phaseWeek,
        );
        for (final day in week.days.where((day) => !day.isRest)) {
          final advanced = day.secondaryStrength.where(
            (work) => work.skill == 'advanced',
          );
          for (final work in advanced) {
            expect(
              day.conditioning!.prescription.join(' ').toLowerCase(),
              isNot(contains(work.movement.toLowerCase())),
            );
          }
        }
      }
    },
  );

  test(
    'conditioning prescriptions account for the complete displayed clock',
    () {
      for (var phaseWeek = 1; phaseWeek <= 6; phaseWeek++) {
        final week = engine.generateWeek(
          athlete: athlete,
          weekOf: DateTime(2026, 7, 27),
          phaseWeek: phaseWeek,
        );
        for (final day in week.days.where((day) => !day.isRest)) {
          final conditioning = day.conditioning!;
          expect(
            conditioning.prescription.first,
            contains('${conditioning.durationMinutes}'),
          );
        }
      }
    },
  );

  test('opening two weeks include measured rope jump and inversion work', () {
    final movements = <String>{};
    for (var phaseWeek = 1; phaseWeek <= 2; phaseWeek++) {
      final week = engine.generateWeek(
        athlete: athlete,
        weekOf: DateTime(2026, 7, 27),
        phaseWeek: phaseWeek,
      );
      for (final day in week.days.where((day) => !day.isRest)) {
        movements.addAll(
          [
            day.strength!,
            ...day.secondaryStrength,
          ].map((work) => work.movement),
        );
      }
    }
    expect(movements, contains('Box Jump Power Practice'));
    expect(movements, contains('Double-Under Skill Practice'));
    expect(movements, contains('Wall-Facing Handstand Hold'));
  });

  test('week two inversion practice does not overlap SkiErg conditioning', () {
    final week = engine.generateWeek(
      athlete: athlete,
      weekOf: DateTime(2026, 8, 3),
      phaseWeek: 2,
    );
    final handstandDay = week.days.firstWhere(
      (day) => day.secondaryStrength.any(
        (work) => work.movement == 'Wall-Facing Handstand Hold',
      ),
    );
    expect(handstandDay.equipment, isNot(contains('ski_erg')));
  });

  test('warmups are derived from the actual primary movement family', () {
    final week = engine.generateWeek(
      athlete: athlete,
      weekOf: DateTime(2026, 7, 27),
      phaseWeek: 1,
    );
    final squat = week.days.first;
    final snatch = week.days.firstWhere((day) => day.role == DayRole.power);
    expect(squat.warmup.join(' ').toLowerCase(), contains('back squat'));
    expect(snatch.warmup.join(' ').toLowerCase(), contains('snatch'));
  });

  test(
    'phase meets revised technical press trunk and elastic exposure floors',
    () {
      var olympicDays = 0;
      var verticalPressDays = 0;
      var hangingCoreDays = 0;
      var jumpDays = 0;
      var jumpRopeDays = 0;
      var inversionDays = 0;
      var climbDays = 0;
      final conditioningTemplates = <String>{};
      for (var phaseWeek = 1; phaseWeek <= 12; phaseWeek++) {
        final week = engine.generateWeek(
          athlete: athlete,
          weekOf: DateTime(2026, 7, 27),
          phaseWeek: phaseWeek,
        );
        for (final day in week.days.where((day) => !day.isRest)) {
          final work = [day.strength!, ...day.secondaryStrength];
          olympicDays +=
              work.any((item) => item.primaryPattern == 'olympic_lift') ? 1 : 0;
          verticalPressDays +=
              work.any((item) => item.primaryPattern == 'vertical_push')
              ? 1
              : 0;
          hangingCoreDays +=
              work.any((item) => item.primaryPattern == 'hanging_core') ? 1 : 0;
          jumpDays += work.any((item) => item.movement.contains('Box Jump'))
              ? 1
              : 0;
          jumpRopeDays +=
              work.any((item) => item.movement.contains('Double-Under'))
              ? 1
              : 0;
          inversionDays +=
              work.any((item) => item.primaryPattern == 'inversion') ? 1 : 0;
          climbDays += work.any((item) => item.movement.contains('Rope-Climb'))
              ? 1
              : 0;
          conditioningTemplates.add(day.conditioning!.templateId!);
        }
      }
      expect(olympicDays, greaterThanOrEqualTo(20));
      // One required follow-on block now rotates technical and support work
      // instead of accumulating multiple blocks on the same day.
      expect(verticalPressDays, greaterThanOrEqualTo(7));
      expect(hangingCoreDays, greaterThanOrEqualTo(2));
      expect(jumpDays, greaterThanOrEqualTo(2));
      expect(jumpRopeDays, greaterThanOrEqualTo(1));
      expect(inversionDays, greaterThanOrEqualTo(4));
      expect(climbDays, greaterThanOrEqualTo(3));
      expect(conditioningTemplates.length, 48);
    },
  );

  test('complete phase contains no repeated workout prescription', () {
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );
    final training = phase.days.where((day) => !day.isRest).toList();
    expect(training, hasLength(48));
    expect(
      training.map((day) => day.prescriptionSignature).toSet(),
      hasLength(training.length),
    );
  });

  test('all 48 generated workouts have unique workout-derived titles', () {
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );
    final titles = phase.days
        .where((day) => !day.isRest)
        .map((day) => day.title)
        .toList();
    expect(titles, hasLength(48));
    expect(titles.toSet(), hasLength(48));
    expect(titles.first, 'The Iron Throne: Oars Against the Rising Tide');
    expect(
      titles.where((title) => title.contains('Unbroken Shield')),
      isNotEmpty,
    );
    expect(
      titles
          .where((title) => title.contains('Unbroken Shield'))
          .every((title) => !title.toLowerCase().contains('frostfire')),
      isTrue,
    );
    expect(titles.where((title) => title.contains('Reforged')), hasLength(24));
  });

  test(
    'missing row benchmarks create two non-duplicative calibration days',
    () {
      final sessions = engine.calibrationSessions(athlete);
      expect(sessions, hasLength(2));
      expect(sessions.first.tests.map((test) => test.distanceMeters), [
        200,
        500,
      ]);
      expect(sessions.first.recoveryMinutesBetweenTests, 15);
      expect(sessions.last.tests.single.distanceMeters, 2000);
      expect(sessions.every((session) => session.replacesConditioning), isTrue);
    },
  );

  test('stored 2K split creates personalized row targets', () {
    const calibrated = AthleteProfile(
      id: 'calibrated',
      trainingMaxes: {
        'back_squat': 275,
        'strict_press': 135,
        'clean': 205,
        'deadlift': 335,
      },
      qualifications: AthleteProfile.allQualifications,
      benchmarkValues: {
        'row_200_split_seconds': 85,
        'row_500_split_seconds': 100,
        'row_2000_split_seconds': 110,
      },
    );
    expect(engine.calibrationSessions(calibrated), isEmpty);
    final phase = engine.generatePhase(
      athlete: calibrated,
      startsOn: DateTime(2026, 7, 27),
    );
    final targeted = phase.days.where(
      (day) =>
          day.conditioning?.prescription.any(
            (line) => line.startsWith('PERSONAL TARGET'),
          ) ??
          false,
    );
    expect(targeted, isNotEmpty);
  });

  test('stored modality tests create later pace and output references', () {
    const calibrated = AthleteProfile(
      id: 'multi-calibrated',
      trainingMaxes: {
        'back_squat': 275,
        'strict_press': 135,
        'clean': 205,
        'deadlift': 335,
      },
      qualifications: AthleteProfile.allQualifications,
      benchmarkValues: {
        'row_2000_split_seconds': 110,
        'ski_750_split_seconds': 115,
        'run_400_seconds': 90,
        'run_mile_seconds': 420,
        'bike_10min_calories': 140,
      },
    );
    final phase = engine.generatePhase(
      athlete: calibrated,
      startsOn: DateTime(2026, 7, 27),
    );
    final prescriptions = phase.days
        .where((day) => day.conditioning != null)
        .map((day) => day.conditioning!.prescription.join(' '))
        .join('\n');
    expect(prescriptions, contains('PERSONAL TARGET'));
    expect(prescriptions, contains('adjust for terrain and turns'));
    expect(prescriptions, contains('cal/min on the tested bike'));
  });

  test('missing tests use RPE targets without invented personal numbers', () {
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );
    final prescriptions = phase.days
        .where((day) => day.conditioning != null)
        .map((day) => day.conditioning!.prescription.join(' '))
        .join('\n');

    expect(prescriptions, contains('EFFORT TARGET • RPE'));
    expect(prescriptions, isNot(contains('PERSONAL TARGET')));
    expect(prescriptions, isNot(contains('PERSONAL REFERENCE')));
  });

  test(
    'a mile result personalizes running when the 400 m test was skipped',
    () {
      const mileOnly = AthleteProfile(
        id: 'mile-only',
        trainingMaxes: {
          'back_squat': 275,
          'strict_press': 135,
          'clean': 205,
          'deadlift': 335,
        },
        qualifications: AthleteProfile.allQualifications,
        benchmarkValues: {'run_mile_seconds': 420},
      );
      final phase = engine.generatePhase(
        athlete: mileOnly,
        startsOn: DateTime(2026, 7, 27),
      );
      final runPrescriptions = phase.days
          .where(
            (day) => day.conditioning?.templateId?.contains('run') ?? false,
          )
          .expand((day) => day.conditioning!.prescription);

      expect(
        runPrescriptions,
        contains(
          predicate<String>((line) => line.startsWith('PERSONAL REFERENCE')),
        ),
      );
    },
  );

  test('RX-first conditioning exposes reviewed qualification levels', () {
    final rxWeek = engine.generateWeek(
      athlete: athlete,
      weekOf: DateTime(2026, 8, 3),
      phaseWeek: 2,
    );
    const unqualified = AthleteProfile(
      id: 'new-athlete',
      trainingMaxes: {
        'back_squat': 275,
        'strict_press': 135,
        'clean': 205,
        'deadlift': 335,
      },
    );
    final forgeWeek = engine.generateWeek(
      athlete: unqualified,
      weekOf: DateTime(2026, 8, 3),
      phaseWeek: 2,
    );
    final rx = rxWeek.days.firstWhere((day) => !day.isRest).conditioning!;
    final forge = forgeWeek.days.firstWhere((day) => !day.isRest).conditioning!;
    expect(rx.level, WorkoutLevel.ascendant);
    expect(rx.levelOptions.map((option) => option.level).toSet(), {
      WorkoutLevel.ember,
      WorkoutLevel.forge,
      WorkoutLevel.ascendant,
    });
    expect(forge.level, WorkoutLevel.forge);
    expect(rx.prescription, isNot(forge.prescription));
  });

  test('dumbbell snatches recur across distinct conditioning formats', () {
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );
    final snatchWork = phase.days.where(
      (day) =>
          day.conditioning?.prescription
              .join(' ')
              .toLowerCase()
              .contains('dumbbell snatch') ??
          false,
    );
    expect(snatchWork.length, greaterThanOrEqualTo(4));
    expect(
      snatchWork.map((day) => day.conditioning!.format).toSet().length,
      greaterThanOrEqualTo(2),
    );
  });

  test('every programmed strength and skill movement is swappable', () {
    const substitutions = MovementSubstitutionRegistry();
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );
    final missing = <String>{};
    for (final day in phase.days.where((day) => !day.isRest)) {
      for (final work in [day.strength, ...day.secondaryStrength]) {
        if (work != null &&
            substitutions.detectedMovements(work.movement).isEmpty) {
          missing.add(work.movement);
        }
      }
    }
    expect(missing, isEmpty);
  });

  test('every displayed movement-bearing phase line is swappable', () {
    const substitutions = MovementSubstitutionRegistry();
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );
    final missing = <String>{};
    bool isInstruction(String line) {
      final lower = line.toLowerCase();
      return lower.contains('rounds at an unhurried') ||
          lower.contains('gradual sets') ||
          lower.contains('clock') ||
          lower.contains('alternating emom') ||
          lower.contains('rotation at sustainable') ||
          lower.contains('interval') ||
          lower.contains('repeat') ||
          lower.contains('stop at') ||
          lower.contains('record ') ||
          lower.contains('keep ') ||
          lower.contains('choose ') ||
          lower.contains('use a ') ||
          lower.contains('leave ') ||
          lower.contains('rest ') ||
          lower.contains('effort target') ||
          lower.contains('progression target') ||
          lower.contains('work or average pace') ||
          lower.contains('expires') ||
          lower.contains('final hard') ||
          lower.contains('without sprinting') ||
          lower.contains('per minute with consistent') ||
          lower.contains('quality amrap') ||
          lower.contains('controlled amrap') ||
          lower.contains('sustainable amrap') ||
          lower.contains('for time') ||
          lower.contains('continuous') ||
          lower.contains('ride at') ||
          lower.contains('conversational pace') ||
          lower.contains('cadence surge') ||
          lower.contains('power loss') ||
          lower.contains('no interval') ||
          lower.contains('transition') ||
          lower.contains('set of today') ||
          lower.contains('after technique') ||
          lower == '0:30 very easy';
    }

    for (final day in phase.days.where((day) => !day.isRest)) {
      final lines = <String>[
        ...day.warmup,
        ...day.accessories,
        ...day.conditioning!.prescription,
        ...day.cooldown,
      ];
      for (final line in lines) {
        if (!RegExp(r'\d').hasMatch(line) || isInstruction(line)) continue;
        if (substitutions.detectedMovements(line).isEmpty) missing.add(line);
      }
    }
    expect(missing, isEmpty);
  });

  test(
    'phase includes genuine prescribed box jumps and explicit RX heights',
    () {
      final phase = engine.generatePhase(
        athlete: athlete,
        startsOn: DateTime(2026, 7, 27),
      );
      final conditioning = phase.days
          .where((day) => day.conditioning != null)
          .map((day) => day.conditioning!)
          .toList();
      final jumpDays = conditioning.where(
        (work) => work.prescription.any(
          (line) => line.contains('box jumps — jump up'),
        ),
      );
      expect(jumpDays.length, greaterThanOrEqualTo(2));
      expect(
        jumpDays.every(
          (work) => work.rxStandards.contains('RX • Box: ♀ 20 in / ♂ 24 in'),
        ),
        isTrue,
      );
    },
  );

  test('loaded conditioning templates publish explicit RX standards', () {
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );
    const requiresStandard = {
      'dumbbell': 'dumbbell',
      'kettlebell': 'kettlebell',
      'sandbag': 'sandbag',
      'wall-ball': 'wall ball',
      'box jump': 'box',
      'box step-over': 'box',
    };
    final missing = <String>[];
    for (final day in phase.days.where((day) => !day.isRest)) {
      final prescription = day.conditioning!.prescription
          .join(' ')
          .toLowerCase();
      final standards = day.conditioning!.rxStandards.join(' ').toLowerCase();
      for (final requirement in requiresStandard.entries) {
        if (prescription.contains(requirement.key) &&
            !standards.contains(requirement.value)) {
          missing.add('${day.conditioning!.templateId}:${requirement.key}');
        }
      }
    }
    expect(missing, isEmpty);
  });

  test(
    'published conditioning levels have stable IDs separate from labels',
    () {
      final phase = engine.generatePhase(
        athlete: athlete,
        startsOn: DateTime(2026, 7, 27),
      );
      for (final work
          in phase.days
              .where((day) => !day.isRest)
              .map((day) => day.conditioning!)) {
        expect(
          work.levelOptions.map((option) => option.id),
          containsAll({'level_1', 'level_2', 'level_3'}),
        );
      }
      expect(workoutLevelId(WorkoutLevel.freeblade), 'custom');
    },
  );

  test('phase generation rejects any workout seen in lifetime history', () {
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );
    final seen = phase.days
        .firstWhere((day) => !day.isRest)
        .prescriptionSignature;
    expect(
      () => engine.generatePhase(
        athlete: athlete,
        startsOn: DateTime(2026, 10, 19),
        priorWorkoutSignatures: {seen},
      ),
      throwsStateError,
    );
  });

  test('conditioning exposes typed time and energy-system intent', () {
    final day = engine
        .generateWeek(
          athlete: athlete,
          weekOf: DateTime(2026, 7, 27),
          phaseWeek: 1,
        )
        .days
        .first;

    expect(day.conditioning!.duration.unit, PrescriptionUnit.seconds);
    expect(day.conditioning!.duration.value, 16 * 60);
    expect(day.conditioning!.energySystem, EnergySystem.threshold);
    expect(day.conditioning!.workSeconds, 180);
    expect(day.conditioning!.restSeconds, 60);
  });

  test('conditioning tasks use explicit units and interval clocks', () {
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );
    final tasks = phase.days
        .where((day) => !day.isRest)
        .expand((day) => day.conditioning!.tasks)
        .toList();
    final units = tasks
        .expand((task) => task.quantities)
        .map((item) => item.unit)
        .toSet();

    expect(
      units,
      containsAll({
        PrescriptionUnit.reps,
        PrescriptionUnit.meters,
        PrescriptionUnit.calories,
        PrescriptionUnit.contacts,
        PrescriptionUnit.rounds,
      }),
    );
    expect(
      tasks.where((task) => task.workSeconds != null),
      everyElement(predicate<WorkoutTask>((task) => task.restSeconds != null)),
    );
    expect(
      phase.days.first.strength!.suggestedLoadQuantity!.unit,
      PrescriptionUnit.load,
    );
  });

  test(
    'for-time workouts have a realistic target window separate from the cap',
    () {
      final phase = engine.generatePhase(
        athlete: athlete,
        startsOn: DateTime(2026, 7, 27),
      );
      final forTime = phase.days
          .where((day) => day.conditioning?.format == 'For time')
          .map((day) => day.conditioning!)
          .toList();

      expect(forTime, hasLength(12));
      for (final workout in forTime) {
        final target = workout.targetCompletionMinutes!;
        expect(
          workout.estimatedCompletionMinutes,
          greaterThanOrEqualTo(target.$1 * .8),
        );
        expect(
          workout.estimatedCompletionMinutes,
          lessThanOrEqualTo(target.$2 * 1.3),
        );
        expect(workout.durationMinutes, greaterThanOrEqualTo(target.$2));
      }
    },
  );

  test('phase balances explicitly programmed energy systems', () {
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );
    final systems = phase.days
        .where((day) => !day.isRest)
        .map((day) => day.conditioning!.energySystem)
        .toSet();

    expect(
      systems,
      containsAll({
        EnergySystem.aerobicBase,
        EnergySystem.threshold,
        EnergySystem.vo2,
        EnergySystem.anaerobic,
        EnergySystem.mixedModal,
      }),
    );
    expect(phase.dose['energy_alactic'], greaterThan(0));
  });

  test('generated days expose source-qualified tissue doses', () {
    final day = engine
        .generateWeek(
          athlete: athlete,
          weekOf: DateTime(2026, 7, 27),
          phaseWeek: 1,
        )
        .days
        .first;

    expect(day.dose['systemic'], greaterThan(0));
    expect(day.dose['conditioning'], greaterThan(0));
    expect(day.dose['energy_threshold'], greaterThan(0));
    expect(day.dose['tissue_quads'], greaterThan(0));
    expect(day.dose['tissue_trunk_bracing'], greaterThan(0));
    expect(day.dose['tissue_direct_quads'], greaterThan(0));
    expect(day.dose['tissue_isometric_trunk_bracing'], greaterThan(0));
    expect(day.dose['tissue_warmup_quads'], greaterThan(0));
    expect(day.dose['tissue_conditioning_upper_back'], greaterThan(0));
    expect(day.dose['nonexistent'], 0);
  });

  test(
    'phase audit retains preparation, support, and conditioning sources',
    () {
      final phase = engine.generatePhase(
        athlete: athlete,
        startsOn: DateTime(2026, 7, 27),
      );

      expect(phase.dose['tissue_direct_quads'], greaterThan(0));
      expect(phase.dose['tissue_secondary_upper_back'], greaterThan(0));
      expect(phase.dose['tissue_warmup_shoulders'], greaterThan(0));
      expect(phase.dose['tissue_accessory_trunk_bracing'], greaterThan(0));
      expect(phase.dose['tissue_conditioning_grip'], greaterThan(0));
    },
  );

  test(
    'phase exposes weighted fatigue across all planned stress categories',
    () {
      final phase = engine.generatePhase(
        athlete: athlete,
        startsOn: DateTime(2026, 7, 27),
      );

      expect(
        phase.fatigue.values.keys,
        containsAll({
          'primary_work',
          'secondary_work',
          'technique',
          'accessories',
          'conditioning',
          'impact',
          'grip',
          'overhead',
          'hinge',
          'squat',
          'knee',
          'shoulder',
          'elbow',
          'trunk',
          'systemic',
        }),
      );
      expect(phase.fatigue['conditioning'], greaterThan(0));
      expect(phase.fatigue['systemic'], greaterThan(0));
    },
  );

  test('60-minute variant is rejected or compressed before display', () {
    const compressedAthlete = AthleteProfile(
      id: 'compressed-athlete',
      trainingMaxes: {},
      sessionMinutes: 60,
    );
    final phase = engine.generatePhase(
      athlete: compressedAthlete,
      startsOn: DateTime(2026, 7, 27),
    );
    final training = phase.days.where((day) => !day.isRest);

    expect(training.every((day) => day.estimatedSessionMinutes <= 60), isTrue);
    expect(
      training.any(
        (day) => day.explanation.any((line) => line.contains('removed')),
      ),
      isTrue,
    );
  });

  test('unqualified athletes receive deterministic skill regressions', () {
    const unqualified = AthleteProfile(id: 'new-athlete', trainingMaxes: {});
    final phase = engine.generatePhase(
      athlete: unqualified,
      startsOn: DateTime(2026, 7, 27),
    );
    final work = phase.days
        .where((day) => !day.isRest)
        .expand((day) => [day.strength!, ...day.secondaryStrength]);

    expect(work.every((item) => item.skill != 'advanced'), isTrue);
    expect(
      work.any((item) => item.movement == 'Dumbbell Jump-Shrug Technique'),
      isTrue,
    );
    expect(
      work.any(
        (item) => item.movement == 'Elevated Plank Shoulder-Shift Practice',
      ),
      isTrue,
    );
  });

  test('a beginner phase contains no unqualified conditioning movements', () {
    const beginner = AthleteProfile(id: 'beginner', trainingMaxes: {});
    final phase = engine.generatePhase(
      athlete: beginner,
      startsOn: DateTime(2026, 7, 27),
    );
    const unavailable = [
      'toes-to-bar',
      'handstand push-up',
      'muscle-up',
      'rope climb',
      'double-under',
      'box jumps',
    ];

    for (final day in phase.days.where((day) => !day.isRest)) {
      final text = day.conditioning!.prescription.join(' ').toLowerCase();
      expect(unavailable.where(text.contains), isEmpty);
      expect(day.conditioning!.level, isNot(WorkoutLevel.ascendant));
    }
  });

  test('missing equipment uses a reviewed deterministic substitution', () {
    final withoutRower = AthleteProfile(
      id: 'no-rower',
      trainingMaxes: const {},
      qualifications: AthleteProfile.allQualifications,
      availableEquipment: AthleteProfile.commonFunctionalFitnessEquipment
          .where((item) => item != 'rower')
          .toSet(),
    );
    final day = engine
        .generateWeek(
          athlete: withoutRower,
          weekOf: DateTime(2026, 7, 27),
          phaseWeek: 1,
        )
        .days
        .first;

    expect(day.equipment, isNot(contains('rower')));
    expect(day.equipment, contains('ski_erg'));
    expect(day.conditioning!.templateId, contains('_sub_rower_to_ski_erg'));
  });

  test(
    'restricted patterns stop generation instead of guessing around pain',
    () {
      const restricted = AthleteProfile(
        id: 'restricted',
        trainingMaxes: {},
        restrictedPatterns: {'squat'},
      );

      expect(
        () => engine.generateWeek(
          athlete: restricted,
          weekOf: DateTime(2026, 7, 27),
          phaseWeek: 1,
        ),
        throwsStateError,
      );
    },
  );

  test('feedback conservatively controls the next session', () {
    final day = engine
        .generateWeek(
          athlete: athlete,
          weekOf: DateTime(2026, 7, 27),
          phaseWeek: 1,
        )
        .days
        .first;
    final highRpe = engine.adaptFromFeedback(
      day,
      const SessionFeedback(
        completed: true,
        actualMinutes: 80,
        rpe: 9.5,
        soreness: 7,
      ),
    );
    final pain = engine.adaptFromFeedback(
      day,
      const SessionFeedback(
        completed: false,
        actualMinutes: 20,
        rpe: 7,
        pain: true,
      ),
    );

    expect(highRpe.conditioning!.effort, Effort.easy);
    expect(highRpe.secondaryStrength, isEmpty);
    expect(pain.isRest, isTrue);
    expect(pain.explanation.join(' '), contains('professional assessment'));
  });

  test('phase deliberately includes VO2-oriented conditioning', () {
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );
    final vo2 = phase.days.where(
      (day) => day.conditioning?.energySystem == EnergySystem.vo2,
    );

    expect(vo2, isNotEmpty);
    expect(
      vo2.every(
        (day) =>
            day.conditioning!.workSeconds == 120 &&
            day.conditioning!.restSeconds == 120,
      ),
      isTrue,
    );
  });

  test('conditioning format balance is explicit across the phase', () {
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );
    final conditioning = phase.days
        .where((day) => !day.isRest)
        .map((day) => day.conditioning!)
        .toList();

    expect(
      conditioning.where((work) => work.format == 'For time'),
      hasLength(12),
    );
    expect(
      conditioning.where((work) => work.format == 'Intervals'),
      hasLength(12),
    );
    expect(conditioning.where((work) => work.format == 'EMOM'), hasLength(8));
    expect(conditioning.where((work) => work.format == 'AMRAP'), hasLength(12));
    expect(
      conditioning.where((work) => work.format == 'Steady aerobic'),
      hasLength(4),
    );
    expect(conditioning.map((work) => work.templateId).toSet(), hasLength(48));
    expect(
      conditioning
          .where((work) => work.format == 'For time')
          .every((work) => work.prescription.first.contains('hard cap')),
      isTrue,
    );
  });

  test('every EMOM has explicit, recoverable station work windows', () {
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );
    for (final work
        in phase.days
            .where((day) => !day.isRest)
            .map((day) => day.conditioning!)
            .where((work) => work.format == 'EMOM')) {
      final movements = work.tasks
          .where((task) => task.movement != 'interval clock')
          .length;
      expect(work.stationTargetSeconds, hasLength(movements));
      expect(
        work.stationTargetSeconds.every(
          (target) =>
              target.$1 >= 15 && target.$1 <= target.$2 && target.$2 <= 50,
        ),
        isTrue,
      );
    }
  });

  test('phase includes loaded unilateral and shoulder-support floors', () {
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );
    final training = phase.days.where((day) => !day.isRest);
    final unilateralSets = training
        .expand((day) => [day.strength!, ...day.secondaryStrength])
        .where((work) => work.primaryPattern == 'unilateral')
        .expand((work) => work.steps)
        .fold<int>(0, (total, step) => total + step.sets);
    final shoulderSupportDays = training.where(
      (day) => day.accessories.any(
        (item) => item.toLowerCase().contains('face pull'),
      ),
    );

    expect(unilateralSets, greaterThanOrEqualTo(27));
    expect(shoulderSupportDays.length, greaterThanOrEqualTo(9));
  });

  test('accessories do not duplicate prescribed movements', () {
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );
    for (final day in phase.days.where((day) => !day.isRest)) {
      final movements = [
        day.strength!,
        ...day.secondaryStrength,
      ].map((work) => work.movement.toLowerCase());
      for (final accessory in day.accessories) {
        expect(
          movements.any(
            (movement) => accessory.toLowerCase().contains(movement),
          ),
          isFalse,
        );
      }
    }
  });

  test('training days end with an eight-minute tissue-driven stretch', () {
    final phase = engine.generatePhase(
      athlete: athlete,
      startsOn: DateTime(2026, 7, 27),
    );
    final training = phase.days.where((day) => !day.isRest);

    expect(training.every((day) => day.cooldownMinutes == 8), isTrue);
    expect(training.every((day) => day.cooldown.length == 4), isTrue);
    expect(
      phase.days
          .where((day) => day.isRest)
          .every((day) => day.cooldown.isEmpty),
      isTrue,
    );
    final squatDay = training.first;
    expect(
      squatDay.cooldown.join(' ').toLowerCase(),
      anyOf(contains('quadriceps'), contains('figure-four')),
    );
  });
}
