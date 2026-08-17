import 'package:flutter_test/flutter_test.dart';
import 'package:hoots_and_reps/programming/movement_substitutions.dart';

void main() {
  const registry = MovementSubstitutionRegistry();

  test('detects only reviewed movements in a prescription', () {
    final detected = registry.detectedMovements(
      '12-calorie row, 8 pull-ups, and 10 wall-ball shots',
    );

    expect(detected, containsAll(['row', 'pull_up', 'wall_ball']));
  });

  test('applies a reviewed replacement and preserves disclosure metadata', () {
    final swap = registry.candidates('row').first;
    final changed = registry.apply('12-calorie row', swap);

    expect(changed, '12-calorie SkiErg');
    expect(swap.stimulus, isNotEmpty);
    expect(swap.disclosure, isNotEmpty);
  });

  test('row detection ignores unrelated strength rows and remainder text', () {
    expect(
      registry.detectedMovements('4 sets of barbell rows'),
      isNot(contains('row')),
    );
    expect(
      registry.detectedMovements('Work for the remainder'),
      isNot(contains('row')),
    );
  });

  test('every catalog movement has multiple deterministic alternatives', () {
    for (final movement in registry.movementIds) {
      expect(
        registry.candidates(movement).length,
        greaterThanOrEqualTo(2),
        reason: '$movement needs real alternatives',
      );
    }
  });

  test('detects and replaces back squat without changing the rest', () {
    final replacement = registry.candidates('back_squat').first;
    expect(
      registry.apply('Back Squat 5 x 5 @ 70%', replacement),
      'Front Squat 5 x 5 @ 70%',
    );
  });

  test('day-one accessory movements are independently swappable', () {
    final detected = registry.detectedMovements(
      '3 sets: 8 supported split squats per side\n'
      '3 sets: 10 chest-supported rows',
    );

    expect(detected, containsAll(['split_squat', 'chest_supported_row']));
    expect(registry.candidates('chest_supported_row'), hasLength(3));
  });

  test('day-one warmup keeps exact movement names and prescription order', () {
    const warmup =
        '2:00 easy row\n'
        '8 squat-to-stands\n'
        '10 glute bridges\n'
        '8 empty-bar back squats';

    final detected = registry.detectedMovements(warmup);
    expect(detected, ['row', 'squat_to_stand', 'glute_bridge', 'back_squat']);
    expect(registry.label('glute_bridge'), 'Glute Bridge');
    expect(registry.label('squat_to_stand'), 'Squat-to-Stand');
  });

  test('recognizes the hyphenated hanging knee-raise prescription', () {
    expect(
      registry.detectedMovements('Hanging Knee-Raise Progression'),
      contains('hanging_knee_raise'),
    );
    expect(registry.candidates('hanging_knee_raise'), isNotEmpty);
  });

  test('recognizes displayed Forge and Ember movement regressions', () {
    expect(
      registry.detectedMovements(
        '8 pike push-ups\n10 knees-to-elbows\n12 band-assisted pull-ups',
      ),
      containsAll(['pike_push_up', 'hanging_knee_raise', 'pull_up']),
    );
  });
}
