import 'movement_substitutions.dart';
import 'programming_engine.dart';

/// Publication gate for the athlete-visible surface, including prose that is
/// not represented as a typed strength work. It rejects missing, ambiguous,
/// or unit-damaging catalog edges before a snapshot can be written.
class PublishedSurfaceAudit {
  const PublishedSurfaceAudit({
    this.registry = const MovementSubstitutionRegistry(),
  });

  final MovementSubstitutionRegistry registry;

  int validate(GeneratedPhase phase) {
    var checked = 0;
    for (final day in phase.days.where((day) => !day.isRest)) {
      final lines = <String>[
        ...day.warmup,
        ...[
          day.strength,
          ...day.secondaryStrength,
        ].whereType<StrengthWork>().map((work) => work.movement),
        ...day.accessories,
        ...day.conditioning!.prescription,
        ...day.cooldown,
      ];
      for (final line in lines) {
        final matches = registry.detectedMovements(line);
        if (matches.isEmpty) continue;
        if (matches.toSet().length != matches.length) {
          throw StateError('Ambiguous movement match in "$line".');
        }
        for (final movement in matches) {
          final candidates = registry.candidates(movement);
          if (candidates.length < 2) {
            throw StateError(
              '$movement has insufficient reviewed alternatives.',
            );
          }
          for (final candidate in candidates) {
            final changed = registry.apply(line, candidate);
            if (changed == line) {
              throw StateError('$movement does not apply to "$line".');
            }
            if (!_sameQuantities(line, changed)) {
              throw StateError(
                '$movement → ${candidate.replacement} changes quantities in "$line".',
              );
            }
            checked++;
          }
        }
      }
    }
    return checked;
  }

  bool _sameQuantities(String before, String after) {
    final expression = RegExp(r'\d+(?::\d+)?(?:\.\d+)?');
    // "60/60" names a hip position in the reviewed breathing catalog; it is
    // not a duration or repetition prescription.
    final normalizedBefore = before.replaceAll(
      RegExp(r'\b60/60\b'),
      'position',
    );
    final normalizedAfter = after.replaceAll(RegExp(r'\b60/60\b'), 'position');
    return expression
            .allMatches(normalizedBefore)
            .map((match) => match.group(0))
            .toList()
            .join('|') ==
        expression
            .allMatches(normalizedAfter)
            .map((match) => match.group(0))
            .toList()
            .join('|');
  }
}
