import 'package:flutter_test/flutter_test.dart';
import 'package:hoots_and_reps/data/app_database.dart';
import 'package:hoots_and_reps/data/conditioning_results_repository.dart';
import 'package:sqflite_common_ffi/sqflite_ffi.dart';

void main() {
  setUp(() async {
    sqfliteFfiInit();
    await AppDatabase.openForTesting(databaseFactoryFfi);
  });

  tearDown(AppDatabase.close);

  test('persists and replaces a typed for-time conditioning result', () async {
    final repository = ConditioningResultsRepository(
      LocalStateStore(await AppDatabase.open()),
    );
    await repository.save(
      ConditioningResult(
        workoutSequence: 7,
        templateId: 'for_time_7',
        variant: 'full',
        schema: ConditioningScoreSchema.forTime,
        values: {'finish_seconds': 743.2},
        recordedAt: DateTime.utc(2026, 8, 4),
      ),
    );
    await repository.save(
      ConditioningResult(
        workoutSequence: 7,
        templateId: 'for_time_7',
        variant: 'full',
        schema: ConditioningScoreSchema.cappedForTime,
        values: {'completed_rounds': 4, 'completed_reps': 11},
        recordedAt: DateTime.utc(2026, 8, 5),
      ),
    );

    final loaded = await repository.load();

    expect(loaded, hasLength(1));
    expect(loaded[7]!.schema, ConditioningScoreSchema.cappedForTime);
    expect(loaded[7]!.summary, 'Capped • 4 rds + 11 reps');
  });

  test(
    'rejects invalid schema values and ignores malformed local entries',
    () async {
      expect(
        ConditioningResult.isValid(ConditioningScoreSchema.forTime, const {}),
        isFalse,
      );
      expect(
        ConditioningResult.isValid(ConditioningScoreSchema.amrap, const {
          'rounds': 3,
          'reps': 7,
        }),
        isTrue,
      );

      final store = LocalStateStore(await AppDatabase.open());
      await store.setString(ConditioningResultsRepository.storageKey, '[{}]');

      expect(await ConditioningResultsRepository(store).load(), isEmpty);
    },
  );

  test('keeps each interval split instead of only a rolled-up total', () async {
    const splits = [18.0, 17.0, 16.0, 15.0];
    final result = ConditioningResult(
      workoutSequence: 8,
      templateId: 'interval_8',
      variant: 'full',
      schema: ConditioningScoreSchema.intervals,
      values: {'total_work': 66},
      intervalSplits: splits,
      workUnit: 'calories',
      recordedAt: DateTime.utc(2026, 8, 4),
    );
    final repository = ConditioningResultsRepository(
      LocalStateStore(await AppDatabase.open()),
    );

    await repository.save(result);

    expect((await repository.load())[8]!.intervalSplits, splits);
    expect(result.summary, '4 splits • 66 calories');
  });
}
