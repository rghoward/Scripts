import 'package:flutter_test/flutter_test.dart';
import 'package:hoots_and_reps/main.dart';

void main() {
  const trainingMaxes = <String, double>{
    'back_squat': 275,
    'bench_press': 250,
    'clean': 175,
    'snatch': 125,
  };

  test('adds prescribed loads to published strength percentage lines', () {
    expect(
      resolvePercentageLoads(
        'Back Squat\n1 × 8 at 60%\n1 × 3 at 78%',
        trainingMaxes,
      ),
      'Back Squat\n1 × 8 at 60% — 165 lb\n1 × 3 at 78% — 215 lb',
    );
  });

  test('adds prescribed loads to every set of a Bench Press progression', () {
    expect(
      resolvePercentageLoads(
        'Bench Press\n1 × 8 at 60%\n1 × 6 at 67%\n'
        '1 × 4 at 73%\n1 × 3 at 78%',
        trainingMaxes,
      ),
      'Bench Press\n1 × 8 at 60% — 150 lb\n1 × 6 at 67% — 170 lb\n'
      '1 × 4 at 73% — 185 lb\n1 × 3 at 78% — 195 lb',
    );
  });

  test('adds prescribed loads to Olympic skill-practice percentage lines', () {
    expect(
      resolvePercentageLoads(
        'Hang Clean + Power Clean Technique\n3 × 2 at 50%\n\n'
        'Power Snatch\n5 x 1 at 70%',
        trainingMaxes,
      ),
      'Hang Clean + Power Clean Technique\n3 × 2 at 50% — 90 lb\n\n'
      'Power Snatch\n5 x 1 at 70% — 90 lb',
    );
  });

  test('leaves percentage work without an applicable max unchanged', () {
    expect(
      resolvePercentageLoads('Dumbbell Step-Up\n3 × 8 at 45%', trainingMaxes),
      'Dumbbell Step-Up\n3 × 8 at 45%',
    );
  });
}
