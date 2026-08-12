import 'movement_substitutions.dart';
import 'programming_engine.dart';

/// Verifies every direct reviewed strength/skill substitution against the
/// entire generated phase before snapshot publication. A rejected edge never
/// enters the app's selectable catalog for that published phase.
class PublishedSubstitutionValidator {
  const PublishedSubstitutionValidator({
    this.registry = const MovementSubstitutionRegistry(),
  });

  final MovementSubstitutionRegistry registry;

  int validate({required GeneratedPhase phase, required int sessionMinutes}) {
    var checked = 0;
    for (var weekIndex = 0; weekIndex < phase.weeks.length; weekIndex++) {
      final week = phase.weeks[weekIndex];
      for (var dayIndex = 0; dayIndex < week.days.length; dayIndex++) {
        final day = week.days[dayIndex];
        if (day.isRest) continue;
        final works = [
          day.strength,
          ...day.secondaryStrength,
        ].whereType<StrengthWork>().toList(growable: false);
        for (var workIndex = 0; workIndex < works.length; workIndex++) {
          final work = works[workIndex];
          for (final movement in registry.detectedMovements(work.movement)) {
            for (final replacement in registry.candidates(movement)) {
              final transformed = _replaceWork(
                phase,
                weekIndex,
                dayIndex,
                workIndex,
                _substituteWork(work, replacement),
              );
              try {
                DeterministicProgrammingEngine.validatePublishedWeek(
                  transformed.weeks[weekIndex],
                  sessionMinutes: sessionMinutes,
                );
              } on StateError {
                // A catalog replacement is omitted for this published phase
                // when it would violate a local weekly guardrail (for example
                // creating a second Olympic pull). The base phase remains the
                // source of truth; incompatible optional edges are not a
                // publication failure.
                continue;
              }
              checked++;
            }
          }
        }
      }
    }
    return checked;
  }

  GeneratedPhase _replaceWork(
    GeneratedPhase phase,
    int weekIndex,
    int dayIndex,
    int workIndex,
    StrengthWork replacement,
  ) {
    final weeks = [...phase.weeks];
    final days = [...weeks[weekIndex].days];
    final day = days[dayIndex];
    if (workIndex == 0) {
      days[dayIndex] = day.copyWith(strength: replacement);
    } else {
      final secondary = [...day.secondaryStrength];
      secondary[workIndex - 1] = replacement;
      days[dayIndex] = day.copyWith(secondaryStrength: secondary);
    }
    weeks[weekIndex] = GeneratedWeek(
      phaseWeek: weeks[weekIndex].phaseWeek,
      days: days,
    );
    return GeneratedPhase(weeks: weeks);
  }

  StrengthWork _substituteWork(
    StrengthWork source,
    MovementSubstitution substitution,
  ) {
    final profile = _profileFor(substitution.replacement, source);
    return StrengthWork(
      movement: substitution.replacement,
      loadingPattern: source.loadingPattern,
      steps: source.steps,
      trainingMaxKey: profile.$3 ? source.trainingMaxKey : '',
      trainingMax: profile.$3 ? source.trainingMax : null,
      primaryPattern: profile.$1,
      stress: profile.$2,
      skill: source.skill,
      prescriptionUnit: source.prescriptionUnit,
    );
  }

  (String, Set<String>, bool) _profileFor(
    String movement,
    StrengthWork source,
  ) {
    final value = movement.toLowerCase();
    String pattern = source.primaryPattern;
    if (value.contains('squat')) {
      pattern = value.contains('overhead') ? 'overhead_squat' : 'squat';
    } else if (value.contains('deadlift') ||
        value.contains('hinge') ||
        value.contains('good morning')) {
      pattern = 'hinge';
    } else if (value.contains('clean') ||
        value.contains('snatch') ||
        value.contains('jerk')) {
      pattern = 'olympic_lift';
    } else if (value.contains('row')) {
      pattern = 'horizontal_pull';
    } else if (value.contains('pull-up') || value.contains('pulldown')) {
      pattern = 'vertical_pull';
    } else if (value.contains('lunge') ||
        value.contains('step-up') ||
        value.contains('split squat')) {
      pattern = 'unilateral';
    } else if (value.contains('jump')) {
      pattern = 'impact';
    } else if (value.contains('carry')) {
      pattern = 'carry';
    } else if (value.contains('press') || value.contains('push-up')) {
      pattern = value.contains('bench') || value.contains('push-up')
          ? 'horizontal_push'
          : 'vertical_push';
    }
    final stress = <String>{
      ...source.stress,
      if (pattern == 'squat' || pattern == 'unilateral') 'squat',
      if (pattern == 'hinge') 'hinge',
      if (pattern == 'olympic_lift') ...{'hinge', 'power'},
      if (pattern == 'impact') 'impact',
      if (pattern == 'horizontal_pull' || pattern == 'vertical_pull') 'grip',
      if (pattern == 'vertical_push' || pattern == 'overhead_squat') 'overhead',
    };
    final retainsTrainingMax =
        !(value.contains('dumbbell') ||
            value.contains('kettlebell') ||
            value.contains('bodyweight') ||
            value.contains('push-up') ||
            value.contains('ring ') ||
            value.contains('box '));
    return (pattern, stress, retainsTrainingMax);
  }
}
