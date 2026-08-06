import '../profile/athlete_profile_page.dart';
import 'movement_substitutions.dart';

class PublishedWorkoutResolution {
  const PublishedWorkoutResolution(this.body, this.reasons);

  final String body;
  final List<String> reasons;

  bool get changed => reasons.isNotEmpty;
}

/// Applies only reviewed, text-safe progressions to an immutable published
/// prescription. It never changes the snapshot itself or a completed workout.
class PublishedWorkoutResolver {
  const PublishedWorkoutResolver();

  static const _substitutions = MovementSubstitutionRegistry();
  static const _substitutionSafety = ReviewedSubstitutionSafety();

  static final _skillRegressions = <String, _Regression>{
    'olympicLifting': _Regression(
      RegExp(r'[^\n]*\b(clean|snatch|jerk)[^\n]*', caseSensitive: false),
      'Dumbbell Jump-Shrug Technique',
      'Olympic lifting is not selected in Skills & Experience.',
    ),
    'overheadSquat': _Regression(
      RegExp(r'[^\n]*overhead squat[^\n]*', caseSensitive: false),
      'Goblet Squat to Box',
      'Overhead squat is not selected in Skills & Experience.',
    ),
    'hangingCore': _Regression(
      RegExp(r'[^\n]*(toes-to-bar|hanging knee)[^\n]*', caseSensitive: false),
      'Dead-Bug Quality Practice',
      'Hanging core is not selected in Skills & Experience.',
    ),
    'inversion': _Regression(
      RegExp(r'[^\n]*(handstand|wall-walk)[^\n]*', caseSensitive: false),
      'Elevated Plank Shoulder-Shift Practice',
      'Inversions are not selected in Skills & Experience.',
    ),
    'ropeClimb': _Regression(
      RegExp(r'[^\n]*rope-climb[^\n]*', caseSensitive: false),
      'Strict Ring-Row Quality Practice',
      'Rope climb is not selected in Skills & Experience.',
    ),
    'muscleUpTransition': _Regression(
      RegExp(r'[^\n]*muscle-up[^\n]*', caseSensitive: false),
      'Strict Ring-Row Quality Practice',
      'Muscle-up transition is not selected in Skills & Experience.',
    ),
    'doubleUnder': _Regression(
      RegExp(r'[^\n]*double-under[^\n]*', caseSensitive: false),
      'Single-Under Rhythm Practice',
      'Double-under is not selected in Skills & Experience.',
    ),
    'boxJump': _Regression(
      RegExp(r'[^\n]*box jump[^\n]*', caseSensitive: false),
      'Low-Box Step-Up Power Practice',
      'Box jump is not selected in Skills & Experience.',
    ),
    'ringDip': _Regression(
      RegExp(r'[^\n]*ring dip[^\n]*', caseSensitive: false),
      'Tempo Push-Up Practice',
      'Ring dip is not selected in Skills & Experience.',
    ),
  };

  static final _equipmentRegressions = <String, _Regression>{
    'rower': _Regression(
      RegExp(
        r'\b(?:rower|row\s+\d+|\d+-?calorie\s+row|easy\s+row)\b',
        caseSensitive: false,
      ),
      'SkiErg',
      'Rower is unavailable in Equipment Access.',
    ),
    'ski_erg': _Regression(
      RegExp(r'ski-?erg', caseSensitive: false),
      'Fan Bike',
      'SkiErg is unavailable in Equipment Access.',
    ),
    'fan_bike': _Regression(
      RegExp(r'(fan |assault |echo )?bike', caseSensitive: false),
      'Row',
      'Fan bike is unavailable in Equipment Access.',
    ),
    'jump_rope': _Regression(
      RegExp(r'double-under', caseSensitive: false),
      'Single-Under Rhythm Practice',
      'Jump rope is unavailable in Equipment Access.',
    ),
    'box': _Regression(
      RegExp(r'box jump', caseSensitive: false),
      'Reverse Lunge',
      'Box is unavailable in Equipment Access.',
    ),
    'rings': _Regression(
      RegExp(r'ring (row|dip|muscle-up)', caseSensitive: false),
      'Dumbbell Row',
      'Rings are unavailable in Equipment Access.',
    ),
    'pull_up_rig': _Regression(
      RegExp(r'(pull-up|toes-to-bar|hanging knee)', caseSensitive: false),
      'Dead-Bug Quality Practice',
      'Pull-up rig is unavailable in Equipment Access.',
    ),
  };

  PublishedWorkoutResolution resolve({
    required String body,
    required AthleteSettings athlete,
    required bool completed,
  }) {
    if (completed) return PublishedWorkoutResolution(body, const []);
    var resolved = body;
    final reasons = <String>[];
    for (final entry in athlete.movementPreferences.entries) {
      if (entry.value != MovementPreference.cannotPerform &&
          entry.value != MovementPreference.temporarilyUnavailable) {
        continue;
      }
      if (!_substitutions.containsMovement(resolved, entry.key)) continue;
      final candidates = _substitutionSafety.safeCandidates(
        movement: entry.key,
        athlete: athlete,
        registry: _substitutions,
      );
      if (candidates.isEmpty) {
        reasons.add(
          '${_substitutions.label(entry.key)} is marked unavailable; no reviewed alternative fits the current profile.',
        );
        continue;
      }
      final choice = candidates.first;
      resolved = _substitutions.apply(resolved, choice);
      reasons.add(
        '${_substitutions.label(entry.key)} is marked unavailable; replaced with ${choice.replacement}.',
      );
    }
    for (final entry in _skillRegressions.entries) {
      if (athlete.skillQualifications.contains(entry.key)) continue;
      final regression = entry.value;
      if (!regression.pattern.hasMatch(resolved)) continue;
      resolved = resolved.replaceAll(
        regression.pattern,
        regression.replacement,
      );
      reasons.add(regression.reason);
    }
    final available = athlete.availableEquipment.isEmpty
        ? equipmentLabels.keys.toSet()
        : athlete.availableEquipment;
    final freeWeight = _resolveFreeWeightEquipment(resolved, available);
    resolved = freeWeight.$1;
    reasons.addAll(freeWeight.$2);
    final cardio = _resolveCardioEquipment(resolved, available);
    resolved = cardio.$1;
    reasons.addAll(cardio.$2);
    for (final entry in _equipmentRegressions.entries) {
      if (entry.key == 'rower' ||
          entry.key == 'ski_erg' ||
          entry.key == 'fan_bike') {
        continue;
      }
      if (available.contains(entry.key)) continue;
      final regression = entry.value;
      if (!regression.pattern.hasMatch(resolved)) continue;
      resolved = resolved.replaceAll(
        regression.pattern,
        regression.replacement,
      );
      reasons.add(regression.reason);
    }
    return PublishedWorkoutResolution(resolved, reasons);
  }

  (String, List<String>) _resolveCardioEquipment(
    String body,
    Set<String> available,
  ) {
    var resolved = body;
    final reasons = <String>[];
    String fallback(String unavailable) {
      if (unavailable != 'rower' && available.contains('rower')) {
        return 'Row';
      }
      if (unavailable != 'ski_erg' && available.contains('ski_erg')) {
        return 'SkiErg';
      }
      if (unavailable != 'fan_bike' && available.contains('fan_bike')) {
        return 'Fan Bike';
      }
      return 'Run';
    }

    for (final entry in _equipmentRegressions.entries.take(3)) {
      if (available.contains(entry.key) ||
          !entry.value.pattern.hasMatch(resolved)) {
        continue;
      }
      resolved = resolved.replaceAll(entry.value.pattern, fallback(entry.key));
      reasons.add(entry.value.reason);
    }
    return (resolved, reasons);
  }

  (String, List<String>) _resolveFreeWeightEquipment(
    String body,
    Set<String> available,
  ) {
    var resolved = body;
    final reasons = <String>[];
    void replace(Map<String, String> values, String reason) {
      var changed = false;
      for (final entry in values.entries) {
        if (!resolved.contains(entry.key)) continue;
        resolved = resolved.replaceAll(entry.key, entry.value);
        changed = true;
      }
      if (changed) reasons.add(reason);
    }

    if (!available.contains('barbell')) {
      final hasDumbbells = available.contains('dumbbells');
      replace({
        'Back Squat': hasDumbbells
            ? 'Dumbbell Goblet Squat'
            : 'Tempo Bodyweight Squat',
        'Front Squat': hasDumbbells
            ? 'Double-Dumbbell Front Squat'
            : 'Tempo Bodyweight Squat',
        'Deadlift': hasDumbbells
            ? 'Dumbbell Romanian Deadlift'
            : 'Hip Hinge Drill',
        'Barbell Row': hasDumbbells ? 'Dumbbell Row' : 'Prone Floor Row',
        'Strict Press': hasDumbbells ? 'Dumbbell Strict Press' : 'Pike Push-Up',
        'Push Press': hasDumbbells ? 'Dumbbell Push Press' : 'Pike Push-Up',
        'Power Clean': hasDumbbells
            ? 'Dumbbell Clean Technique'
            : 'Jump-Shrug Technique',
        'Clean + Split Jerk': hasDumbbells
            ? 'Dumbbell Clean + Press'
            : 'Jump-Shrug + Pike Push-Up',
        'Power Snatch': hasDumbbells
            ? 'Dumbbell Snatch Technique'
            : 'Jump-Shrug Technique',
        'Squat Snatch': hasDumbbells
            ? 'Dumbbell Snatch Technique'
            : 'Jump-Shrug Technique',
      }, 'Barbell is unavailable in Equipment Access.');
      if (reasons.isNotEmpty) {
        resolved = resolved.replaceAll(
          RegExp(r' at \d+%'),
          ' at a moderate load',
        );
      }
    }
    if (!available.contains('dumbbells')) {
      final hasBarbell = available.contains('barbell');
      replace({
        'Dumbbell Step-Up': 'Bodyweight Step-Up',
        'Half-Kneeling Dumbbell Press': hasBarbell
            ? 'Barbell Strict Press'
            : 'Pike Push-Up',
        'Dumbbell Bench Press': hasBarbell ? 'Barbell Bench Press' : 'Push-Up',
        'Dumbbell Row': hasBarbell ? 'Barbell Row' : 'Prone Floor Row',
        'Dumbbell Jump-Shrug Technique': 'Jump-Shrug Technique',
      }, 'Dumbbells are unavailable in Equipment Access.');
    }
    if (!available.contains('kettlebell')) {
      replace({
        'Kettlebell Swing': available.contains('dumbbells')
            ? 'Dumbbell Swing'
            : 'Hip Hinge Drill',
      }, 'Kettlebell is unavailable in Equipment Access.');
    }
    return (resolved, reasons);
  }
}

/// Screens reviewed substitutions against explicit athlete boundaries and
/// equipment access. It is deliberately conservative: uncertain matches are
/// withheld rather than offered as a selectable option.
class ReviewedSubstitutionSafety {
  const ReviewedSubstitutionSafety();

  List<MovementSubstitution> safeCandidates({
    required String movement,
    required AthleteSettings athlete,
    required MovementSubstitutionRegistry registry,
  }) => registry
      .candidates(movement)
      .where((candidate) => issuesFor(candidate, athlete, registry).isEmpty)
      .toList(growable: false);

  List<String> issuesFor(
    MovementSubstitution candidate,
    AthleteSettings athlete,
    MovementSubstitutionRegistry registry,
  ) {
    final issues = <String>[];
    for (final entry in athlete.movementPreferences.entries) {
      if (entry.value != MovementPreference.cannotPerform &&
          entry.value != MovementPreference.temporarilyUnavailable) {
        continue;
      }
      if (registry.containsMovement(candidate.replacement, entry.key)) {
        issues.add('movement boundary');
      }
    }
    final available = athlete.availableEquipment.isEmpty
        ? equipmentLabels.keys.toSet()
        : athlete.availableEquipment;
    final lower = candidate.replacement.toLowerCase();
    const equipmentWords = <String, List<String>>{
      'rower': ['row', 'rower'],
      'ski_erg': ['ski erg', 'ski-erg', 'skierg'],
      'fan_bike': ['fan bike', 'assault bike', 'echo bike'],
      'barbell': ['barbell'],
      'dumbbells': ['dumbbell'],
      'kettlebell': ['kettlebell'],
      'box': ['box jump', 'box step'],
      'rings': ['ring '],
      'pull_up_rig': ['pull-up', 'toes-to-bar', 'hanging'],
      'jump_rope': ['double-under', 'single-under'],
    };
    for (final entry in equipmentWords.entries) {
      if (!available.contains(entry.key) && entry.value.any(lower.contains)) {
        issues.add('equipment access');
      }
    }
    return issues;
  }
}

class _Regression {
  const _Regression(this.pattern, this.replacement, this.reason);
  final RegExp pattern;
  final String replacement;
  final String reason;
}
