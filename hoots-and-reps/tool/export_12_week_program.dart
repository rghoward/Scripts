import 'dart:convert';
import 'dart:io';

import 'package:hoots_and_reps/programming/programming_engine.dart';

void main() {
  const engine = DeterministicProgrammingEngine();
  const athlete = AthleteProfile(
    id: 'comparison-athlete',
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
  );
  final anchor = DateTime(2026, 7, 27);
  final days = <Map<String, Object?>>[];
  final phase = engine.generatePhase(athlete: athlete, startsOn: anchor);
  for (var weekNumber = 1; weekNumber <= 12; weekNumber++) {
    final week = phase.weeks[weekNumber - 1];
    for (var index = 0; index < week.days.length; index++) {
      final day = week.days[index];
      days.add({
        'phase_week': weekNumber,
        'phase_day': index + 1,
        'overall_day': (weekNumber - 1) * 7 + index + 1,
        'date': day.date.toIso8601String().split('T').first,
        'title': day.title,
        'role': day.role.name,
        'is_rest': day.isRest,
        'estimated_session_minutes': day.estimatedSessionMinutes,
        'cooldown_minutes': day.cooldownMinutes,
        'cooldown': day.cooldown,
        'dose': day.dose.values,
        'fatigue': day.fatigue.values,
        'warmup_minutes': day.warmupMinutes,
        'warmup': day.warmup,
        'strength': day.strength == null ? null : _strength(day.strength!),
        'secondary_strength': day.secondaryStrength.map(_strength).toList(),
        'accessories': day.accessories,
        'conditioning': day.conditioning == null
            ? null
            : {
                'minutes': day.conditioning!.durationMinutes,
                'target_completion_minutes':
                    day.conditioning!.targetCompletionMinutes == null
                    ? null
                    : {
                        'min': day.conditioning!.targetCompletionMinutes!.$1,
                        'max': day.conditioning!.targetCompletionMinutes!.$2,
                      },
                'estimated_completion_minutes':
                    day.conditioning!.estimatedCompletionMinutes,
                'effort': day.conditioning!.effort.name,
                'energy_system': day.conditioning!.energySystem.name,
                'work_seconds': day.conditioning!.workSeconds,
                'rest_seconds': day.conditioning!.restSeconds,
                'format': day.conditioning!.format,
                'prescription': day.conditioning!.prescription,
                'patterns': day.conditioning!.movementPatterns.toList()..sort(),
                'template_id': day.conditioning!.templateId,
                'tasks': day.conditioning!.tasks
                    .map(
                      (task) => {
                        'movement': task.movement,
                        'quantities': task.quantities
                            .map(
                              (quantity) => {
                                'value': quantity.value,
                                'unit': quantity.unit.name,
                              },
                            )
                            .toList(),
                        'work_seconds': task.workSeconds,
                        'rest_seconds': task.restSeconds,
                      },
                    )
                    .toList(),
              },
        'equipment': day.equipment.toList()..sort(),
        'prescription_signature': day.prescriptionSignature,
      });
    }
  }
  final output = File('build/analysis/generated-12-week-program.json');
  output.parent.createSync(recursive: true);
  final encoded = const JsonEncoder.withIndent('  ').convert({
    'engine': 'deterministic_programming_engine',
    'phase_weeks': 12,
    'days': days,
  });
  output.writeAsStringSync('$encoded\n');
  stdout.writeln(output.path);
}

Map<String, Object?> _strength(StrengthWork work) => {
  'movement': work.movement,
  'loading_pattern': work.loadingPattern.name,
  'primary_pattern': work.primaryPattern,
  'stress': work.stress.toList()..sort(),
  'skill': work.skill,
  'prescription_unit': work.prescriptionUnit.name,
  'training_max_key': work.trainingMaxKey,
  'suggested_load': work.suggestedLoadQuantity == null
      ? null
      : {
          'value': work.suggestedLoadQuantity!.value,
          'unit': work.suggestedLoadQuantity!.unit.name,
        },
  'steps': work.steps
      .map(
        (step) => {
          'sets': step.sets,
          'reps': step.reps,
          'percent': step.percent,
          'suggested_load': work.trainingMax == null || step.percent == 0
              ? null
              : (work.trainingMax! * step.percent / 5).round() * 5,
        },
      )
      .toList(),
};
