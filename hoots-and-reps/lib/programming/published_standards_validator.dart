import 'programming_engine.dart';

/// Ensures every scored conditioning prescription exposes authored, usable
/// standards for each published level. This is a publication check, not a
/// leaderboard or a judgement about an athlete's identity.
class PublishedStandardsValidator {
  const PublishedStandardsValidator();

  int validate(GeneratedPhase phase) {
    var checked = 0;
    for (final day in phase.days.where((day) => !day.isRest)) {
      final work = day.conditioning!;
      final levels = work.levelOptions.map((option) => option.level).toSet();
      if (!levels.containsAll({
        WorkoutLevel.ember,
        WorkoutLevel.forge,
        WorkoutLevel.ascendant,
      })) {
        throw StateError('${work.templateId} is missing a published level.');
      }
      final ids = work.levelOptions.map((option) => option.id).toSet();
      if (!ids.containsAll({'level_1', 'level_2', 'level_3'}) ||
          ids.length != work.levelOptions.length) {
        throw StateError('${work.templateId} has unstable level identifiers.');
      }
      final prescription = work.prescription.join(' ').toLowerCase();
      for (final option in work.levelOptions) {
        final standards = option.standards.join(' ').toLowerCase();
        _require(prescription, standards, 'dumbbell', [
          'dumbbell',
          'lb',
          '♀',
          '♂',
        ]);
        _require(prescription, standards, 'barbell', [
          'barbell',
          'lb',
          '♀',
          '♂',
        ]);
        _require(prescription, standards, 'kettlebell', [
          'kettlebell',
          'lb',
          '♀',
          '♂',
        ]);
        _require(prescription, standards, 'sandbag', [
          'sandbag',
          'lb',
          '♀',
          '♂',
        ]);
        _require(prescription, standards, 'sled', ['sled', 'lb', '♀', '♂']);
        _require(prescription, standards, 'box', ['box', 'in', '♀', '♂']);
        _require(prescription, standards, 'wall ball', [
          'wall ball',
          'lb',
          'ft',
          '♀',
          '♂',
        ]);
        checked++;
      }
    }
    return checked;
  }

  void _require(
    String prescription,
    String standards,
    String movement,
    List<String> required,
  ) {
    if (prescription.contains(movement) &&
        !required.every(standards.contains)) {
      throw StateError('Missing explicit $movement standard.');
    }
  }
}
