import 'dart:convert';
import 'dart:io';

import 'package:hoots_and_reps/programming/programming_engine.dart';
import 'package:hoots_and_reps/programming/published_substitution_validator.dart';
import 'package:hoots_and_reps/programming/published_surface_audit.dart';
import 'package:hoots_and_reps/programming/published_standards_validator.dart';

/// Offline publishing step. This is deliberately a CLI-only use of the
/// programming engine; athlete devices load the resulting immutable snapshot.
void main() {
  const engine = DeterministicProgrammingEngine();
  final anchor = DateTime(2026, 7, 27);
  final full = engine.generatePhase(
    athlete: const AthleteProfile(
      id: 'published-v1',
      trainingMaxes: _trainingMaxes,
      qualifications: AthleteProfile.allQualifications,
      sessionMinutes: 90,
    ),
    startsOn: anchor,
  );
  final sixty = engine.generatePhase(
    athlete: const AthleteProfile(
      id: 'published-v1',
      trainingMaxes: _trainingMaxes,
      qualifications: AthleteProfile.allQualifications,
      sessionMinutes: 60,
    ),
    startsOn: anchor,
  );
  const substitutionValidator = PublishedSubstitutionValidator();
  const surfaceAudit = PublishedSurfaceAudit();
  const standardsValidator = PublishedStandardsValidator();
  final fullSubstitutionEdges = substitutionValidator.validate(
    phase: full,
    sessionMinutes: 90,
  );
  final sixtySubstitutionEdges = substitutionValidator.validate(
    phase: sixty,
    sessionMinutes: 60,
  );
  final fullSurfaceEdges = surfaceAudit.validate(full);
  final sixtySurfaceEdges = surfaceAudit.validate(sixty);
  final fullStandards = standardsValidator.validate(full);
  final sixtyStandards = standardsValidator.validate(sixty);
  final workouts = <Map<String, Object?>>[];
  var sequence = 1;
  for (var week = 0; week < 12; week++) {
    final fullDays = full.weeks[week].days.where((day) => !day.isRest).toList();
    final sixtyDays = sixty.weeks[week].days
        .where((day) => !day.isRest)
        .toList();
    for (var index = 0; index < fullDays.length; index++) {
      final benchmark = _benchmark(week + 1, index);
      final day = fullDays[index];
      workouts.add({
        'sequence': sequence++,
        'phase': 'FORGED PHASE • WEEK ${week + 1}',
        'title': benchmark?['title'] ?? day.title,
        'full_minutes': day.estimatedSessionMinutes,
        'sixty_minutes': sixtyDays[index].estimatedSessionMinutes,
        'signature': benchmark == null
            ? day.prescriptionSignature
            : '${day.prescriptionSignature}|benchmark:${benchmark['id']}',
        'benchmark': benchmark,
        'full': _sections(day, benchmark),
        'sixty': _sections(sixtyDays[index], benchmark),
        'recovery': const [
          {
            'title': 'RECOVERY • 20 MIN',
            'body':
                'Choose an easy row, bike, SkiErg, walk, or swim.\nMaintain a conversational pace throughout.',
          },
          {
            'title': 'MOBILITY • 8 MIN',
            'body':
                'Move gently through the positions used in today’s planned session.\nNothing should feel sharp, forced, or progressively worse.',
          },
        ],
        'full_conditioning': _conditioning(day.conditioning),
        'sixty_conditioning': _conditioning(sixtyDays[index].conditioning),
      });
    }
  }
  const encoder = JsonEncoder.withIndent('  ');
  final output = File('assets/data/published_program_snapshot_v1.json');
  final snapshot = {
    'snapshot_id': 'forged_phase_2026_07_27_v8_conditioning_surface',
    'version': 8,
    'published_at': '2026-08-16T00:00:00.000Z',
    'workouts': workouts,
  };
  _validatePublishedWorkouts(workouts);
  // Do not mutate the served artifact until both the canonical program and
  // every reviewed substitution edge have cleared the publishing gate.
  output.writeAsStringSync('${encoder.convert(snapshot)}\n');
  stdout.writeln(
    'Validated $fullSubstitutionEdges full and $sixtySubstitutionEdges '
    '60-minute reviewed substitution edges; $fullSurfaceEdges full and '
    '$sixtySurfaceEdges 60-minute visible-surface edges; $fullStandards full '
    'and $sixtyStandards 60-minute level standards.',
  );
  stdout.writeln(output.path);
}

const _trainingMaxes = <String, double>{
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
};

Map<String, Object?>? _benchmark(int week, int index) {
  final value = switch ((week, index)) {
    (1, 0) || (10, 0) => (
      'rowShortPower',
      'row_short_power_v1',
      week == 10,
      'The Twin Trials of Velocity${week == 10 ? ' Reforged' : ''}',
    ),
    (1, 3) || (10, 3) => (
      'rowTwoThousand',
      'row_2000_capacity_v1',
      week == 10,
      'The Voidward Vigil${week == 10 ? ' Reforged' : ''}',
    ),
    (2, 0) || (11, 0) => (
      'gymnasticsScreen',
      'gymnastics_capacity_v1',
      week == 11,
      'The Four Astral Seals${week == 11 ? ' Reforged' : ''}',
    ),
    (2, 1) || (11, 1) => (
      'runFourHundred',
      'run_400_speed_v1',
      week == 11,
      'The Comet Circuit${week == 11 ? ' Reforged' : ''}',
    ),
    (3, 1) || (11, 3) => (
      'skiSevenFifty',
      'ski_750_capacity_v1',
      week == 11,
      'The Frozen Star Trial${week == 11 ? ' Reforged' : ''}',
    ),
    (4, 0) || (12, 0) => (
      'runMile',
      'run_mile_capacity_v1',
      week == 12,
      'The Moonward Trial${week == 12 ? ' Reforged' : ''}',
    ),
    (5, 1) || (12, 2) => (
      'bikeTenMinute',
      'bike_10_minute_capacity_v1',
      week == 12,
      'The Tenfold Tempest${week == 12 ? ' Reforged' : ''}',
    ),
    _ => null,
  };
  return value == null
      ? null
      : {
          'kind': value.$1,
          'id': value.$2,
          'is_retest': value.$3,
          'title': value.$4,
        };
}

List<Map<String, String>> _sections(
  GeneratedDay day,
  Map<String, Object?>? benchmark,
) {
  final blocks = _groupedBlocks(day);
  final sections = <Map<String, String>>[
    {
      'title': 'WARMUP • ${day.warmupMinutes} MIN',
      'body': day.warmup.join('\n'),
    },
    for (final block in blocks)
      {
        'title': block.$1,
        'body':
            '${block.$2.map(_strength).join('\n\n')}\n\nMove with consistent technique; no missed repetitions.',
      },
    if (day.accessories.isNotEmpty)
      {'title': 'ACCESSORY • OPTIONAL', 'body': day.accessories.join('\n')},
  ];
  final conditioning = day.conditioning!;
  if (benchmark != null) {
    sections.add({
      'title': 'BENCHMARK • RECORD RESULT',
      'body': _benchmarkBody(benchmark['kind']! as String),
    });
  }
  if (benchmark == null || benchmark['kind'] == 'gymnasticsScreen') {
    // Standards are injected next to their relevant movement at render time.
    // Repeating them here creates duplicate load text on both phone and Cast.
    sections.add({
      'title': 'CONDITIONING • ${conditioning.durationMinutes} MIN',
      'body':
          '${conditioning.format}\n\n${conditioning.prescription.join('\n')}',
    });
  }
  if (day.cooldown.isNotEmpty) {
    sections.add({
      'title': 'POST-QUEST STRETCH • ${day.cooldownMinutes} MIN',
      'body': day.cooldown.join('\n'),
    });
  }
  return sections;
}

List<(String, List<StrengthWork>)> _groupedBlocks(GeneratedDay day) {
  final all = [
    if (day.strength != null) day.strength!,
    ...day.secondaryStrength,
  ];
  final strength = all
      .where(
        (work) =>
            !_isSkillPracticeWork(work) && work.primaryPattern != 'unilateral',
      )
      .toList();
  final skill = all.where(_isSkillPracticeWork).toList();
  final support = all
      .where((work) => work.primaryPattern == 'unilateral')
      .toList();
  return [
    if (strength.isNotEmpty) ('STRENGTH', strength),
    if (skill.isNotEmpty) ('SKILL PRACTICE', skill),
    if (support.isNotEmpty) ('SUPPORT WORK', support),
  ];
}

bool _isSkillPracticeWork(StrengthWork work) {
  final lower = work.movement.toLowerCase();
  return lower.contains('double-under') ||
      lower.contains('box jump') ||
      lower.contains('muscle-up') ||
      lower.contains('handstand') ||
      lower.contains('rope-climb') ||
      lower.contains('pull-up') ||
      lower.contains('ring dip') ||
      lower.contains('toes-to-bar') ||
      lower.contains('hanging ') ||
      lower.contains('l-sit') ||
      lower.contains('snatch') ||
      lower.contains('clean') ||
      lower.contains('jerk') ||
      work.loadingPattern == LoadingPattern.complex ||
      work.skill == 'advanced' ||
      work.primaryPattern == 'olympic_lift' ||
      work.primaryPattern == 'hanging_core' ||
      work.primaryPattern == 'inversion';
}

void _validatePublishedWorkouts(List<Map<String, Object?>> workouts) {
  if (workouts.length != 60) {
    throw StateError(
      'A published five-day phase must contain exactly 60 workouts.',
    );
  }
  for (final workout in workouts) {
    for (final variant in ['full', 'sixty']) {
      final sections = workout[variant]! as List<Map<String, String>>;
      final titles = sections.map((section) => section['title']!).toList();
      final warmup = titles.indexWhere((title) => title.startsWith('WARMUP'));
      final primary = titles.indexWhere(
        (title) =>
            title.startsWith('STRENGTH') || title.startsWith('SKILL PRACTICE'),
      );
      final conditioningOrBenchmark = titles.indexWhere(
        (title) =>
            title.startsWith('CONDITIONING') || title.startsWith('BENCHMARK'),
      );
      final cooldown = titles.indexWhere(
        (title) => title.startsWith('POST-QUEST STRETCH'),
      );
      final isZone2Capacity = sections.any(
        (section) =>
            section['title']!.startsWith('CONDITIONING') &&
            section['body']!.startsWith('Zone 2 aerobic capacity'),
      );
      final invalidOrder = isZone2Capacity
          ? primary != -1 ||
                conditioningOrBenchmark <= warmup ||
                cooldown <= conditioningOrBenchmark
          : primary <= warmup ||
                conditioningOrBenchmark <= primary ||
                cooldown <= conditioningOrBenchmark;
      if (warmup != 0 || invalidOrder) {
        throw StateError(
          'Published workout ${workout['sequence']} does not follow the '
          'reviewed session structure.',
        );
      }
      final trainingSections = titles
          .where(
            (title) =>
                title.startsWith('STRENGTH') ||
                title.startsWith('SKILL PRACTICE') ||
                title.startsWith('SUPPORT WORK'),
          )
          .toList();
      final expectedTrainingOrder = <String>[
        'STRENGTH',
        'SKILL PRACTICE',
        'SUPPORT WORK',
      ].where(trainingSections.contains).toList();
      if (trainingSections.length != expectedTrainingOrder.length ||
          trainingSections.join('|') != expectedTrainingOrder.join('|')) {
        throw StateError(
          'Published workout ${workout['sequence']} does not keep its '
          'reviewed work grouped as Strength, Skill Practice, and Support Work.',
        );
      }
      if (titles.where((title) => title.startsWith('ACCESSORY')).length > 1) {
        throw StateError(
          'Published workout ${workout['sequence']} has multiple accessory blocks.',
        );
      }
      if (isZone2Capacity) {
        final accessories = sections
            .where((section) => section['title']!.startsWith('ACCESSORY'))
            .map((section) => section['body']!)
            .join(' ')
            .toLowerCase();
        if (!accessories.contains('triceps') ||
            !accessories.contains('curl') ||
            !(accessories.contains('dead bug') ||
                accessories.contains('side plank') ||
                accessories.contains('abmat') ||
                accessories.contains('hollow'))) {
          throw StateError(
            'Published capacity workout ${workout['sequence']} is missing '
            'the direct arms and trunk accessory prescription.',
          );
        }
      }
    }
  }
}

String _benchmarkBody(String kind) => switch (kind) {
  'rowShortPower' =>
    'TEST 1\nRow 200 meters for time\n\nREST 10:00 — remain moving gently and fully recover\n\nTEST 2\nRow 500 meters for time\n\nRecord both results, then row 6:00 very easily to downshift.',
  'rowTwoThousand' =>
    'Row 2,000 meters for time\n\nStart near a pace you can sustain. Aim to keep the middle controlled and finish faster.\n\nThis is the entire conditioning prescription for today.',
  'gymnasticsScreen' =>
    'Complete each test fresh with 3:00 rest between efforts:\n\nMaximum unbroken strict pull-ups\nMaximum unbroken technically sound push-ups\nMaximum unbroken toes-to-bar — enter 0 if not yet available\nMaximum unbroken double-unders — enter 0 if not yet available',
  'runFourHundred' =>
    'Run 400 meters for time\n\nRest 8:00, then run 2,000 meters at an easy conversational pace.',
  'skiSevenFifty' =>
    'SkiErg 750 meters for time\n\nRest 6:00, then SkiErg 1,500 meters easy.',
  'runMile' =>
    'Run 1 mile for time\n\nUse an accurately measured, repeatable route. This replaces conditioning today.',
  'bikeTenMinute' =>
    'Fan bike for 10:00\n\nRecord total calories. Use the same bike model and settings for future comparisons.',
  _ => throw ArgumentError.value(kind, 'kind'),
};

String _strength(StrengthWork work) =>
    '${work.movement}\n${work.steps.map((step) => '${step.sets} × ${step.reps}${step.percent == 0 ? '' : ' at ${(step.percent * 100).round()}%'}').join('\n')}';

Map<String, Object?>? _conditioning(ConditioningWork? value) => value == null
    ? null
    : {
        'duration_minutes': value.durationMinutes,
        'effort': value.effort.name,
        'format': value.format,
        'template_id': value.templateId,
        'level_id': workoutLevelId(value.level),
        'level_options': value.levelOptions
            .map(
              (option) => {
                'id': option.id,
                'label': option.level.name,
                'prescription': option.prescription,
                'standards': option.standards,
              },
            )
            .toList(),
        'work_seconds': value.workSeconds,
        'rest_seconds': value.restSeconds,
        'station_target_seconds': value.stationTargetSeconds
            .map((target) => {'min': target.$1, 'max': target.$2})
            .toList(),
        'tasks': value.tasks
            .map(
              (task) => {
                'movement': task.movement,
                'work_seconds': task.workSeconds,
                'rest_seconds': task.restSeconds,
                'quantities': task.quantities
                    .map((q) => {'value': q.value, 'unit': q.unit.name})
                    .toList(),
              },
            )
            .toList(),
      };
