import 'package:flutter_test/flutter_test.dart';
import 'package:hoots_and_reps/data/app_database.dart';
import 'package:hoots_and_reps/data/benchmark_results_repository.dart';
import 'package:hoots_and_reps/data/published_program_repository.dart';
import 'package:shared_preferences/shared_preferences.dart';
import 'package:sqflite_common_ffi/sqflite_ffi.dart';

void main() {
  setUp(() async {
    sqfliteFfiInit();
    await AppDatabase.openForTesting(databaseFactoryFfi);
  });

  tearDown(AppDatabase.close);

  test('creates the complete version-one schema', () async {
    final database = await AppDatabase.open();
    final rows = await database.rawQuery(
      "SELECT name FROM sqlite_master WHERE type = 'table'",
    );
    final tables = rows.map((row) => row['name']).toSet();

    expect(
      tables,
      containsAll({
        'app_state',
        'athlete_profiles',
        'programs',
        'workout_prescriptions',
        'schedule_assignments',
        'schedule_events',
        'workout_sessions',
        'section_results',
        'personal_record_history',
        'training_max_history',
        'served_signatures',
        'result_submissions',
        'sync_outbox',
        'benchmark_result_events',
        'benchmark_result_values',
        'published_program_snapshots',
        'published_snapshot_transformations',
      }),
    );
  });

  test(
    'migrates preferences once without overwriting SQLite changes',
    () async {
      SharedPreferences.setMockInitialValues({
        'schedule_start': '2026-07-27T00:00:00.000',
        'completed_workouts': ['1', '2'],
      });
      final preferences = await SharedPreferences.getInstance();
      final first = await LocalStateStore.openAndMigrate(preferences);

      expect(
        await first.getString('schedule_start'),
        '2026-07-27T00:00:00.000',
      );
      expect(await first.getStringList('completed_workouts'), ['1', '2']);

      await first.setString('schedule_start', '2026-08-10T00:00:00.000');
      await preferences.setString('schedule_start', '2026-09-01T00:00:00.000');
      final second = await LocalStateStore.openAndMigrate(preferences);

      expect(
        await second.getString('schedule_start'),
        '2026-08-10T00:00:00.000',
      );
    },
  );

  test('enforces one live assignment for each workout', () async {
    final database = await AppDatabase.open();
    const now = '2026-07-31T12:00:00.000Z';
    await database.insert('athlete_profiles', {
      'id': 'athlete',
      'weight_unit': 'pounds',
      'created_at': now,
      'updated_at': now,
    });
    await database.insert('programs', {
      'id': 'program',
      'athlete_id': 'athlete',
      'ruleset_version': '1',
      'title': 'Test',
      'starts_on': '2026-07-31',
      'status': 'active',
      'created_at': now,
      'updated_at': now,
    });
    await database.insert('workout_prescriptions', {
      'id': 'workout',
      'program_id': 'program',
      'sequence_number': 1,
      'prescription_signature': 'signature',
      'ruleset_version': '1',
      'prescription_json': '{}',
      'created_at': now,
    });
    Future<void> insertAssignment(String id, String date) =>
        database.insert('schedule_assignments', {
          'id': id,
          'program_id': 'program',
          'workout_id': 'workout',
          'assigned_date': date,
          'assignment_type': 'workout',
          'status': 'planned',
          'created_at': now,
          'updated_at': now,
        });

    await insertAssignment('first', '2026-07-31');
    await expectLater(
      insertAssignment('second', '2026-08-01'),
      throwsA(anything),
    );
  });

  test('benchmark results survive repository recreation', () async {
    final database = await AppDatabase.open();
    final first = BenchmarkResultsRepository(LocalStateStore(database));
    await first.save({'row_2000_split_seconds': 111.5, 'run_400_seconds': 84});

    final restarted = BenchmarkResultsRepository(
      LocalStateStore(await AppDatabase.open()),
    );
    expect(await restarted.load(), {
      'row_2000_split_seconds': 111.5,
      'run_400_seconds': 84,
    });
  });

  test(
    'benchmark history retains retests and editing refreshes active values',
    () async {
      final database = await AppDatabase.open();
      final repository = BenchmarkResultsRepository(LocalStateStore(database));
      await repository.record('run_400_speed_v1', {
        'run_400_seconds': 90,
      }, recordedAt: DateTime.utc(2026, 7, 30));
      await repository.record('run_400_speed_v1', {
        'run_400_seconds': 84,
      }, recordedAt: DateTime.utc(2026, 10, 1));

      final history = await repository.history();
      expect(history, hasLength(2));
      expect((await repository.load())['run_400_seconds'], 84);

      final retest = history.first;
      await repository.update(
        BenchmarkResultEvent(
          id: retest.id,
          benchmarkId: retest.benchmarkId,
          recordedAt: retest.recordedAt,
          values: {'run_400_seconds': 82},
        ),
      );
      expect((await repository.load())['run_400_seconds'], 82);
    },
  );

  test('migrates legacy benchmark snapshot into one history event', () async {
    final database = await AppDatabase.open();
    final store = LocalStateStore(database);
    await store.setString(
      BenchmarkResultsRepository.storageKey,
      '{"row_2000_split_seconds":111.5}',
    );

    final repository = BenchmarkResultsRepository(store);
    expect((await repository.load())['row_2000_split_seconds'], 111.5);
    final history = await repository.history();
    expect(history, hasLength(1));
    expect(history.single.benchmarkId, 'legacy_import');
  });

  test(
    'persists an immutable published snapshot and its local audit trail',
    () async {
      final database = await AppDatabase.open();
      final repository = PublishedProgramRepository(database);
      const snapshot = '''{
      "snapshot_id":"phase-v1",
      "version":1,
      "published_at":"2026-08-04T00:00:00.000Z",
      "workouts":[]
    }''';

      final published = await repository.publishBundled(snapshot);
      expect(published.id, 'phase-v1');
      expect((await repository.active())?.snapshotJson, snapshot);

      await repository.record(
        const SnapshotTransformation(
          type: 'benchmark_reference',
          workoutSequence: 1,
          reason: 'A row result was recorded.',
          payload: {'row_2000_split_seconds': 111.5},
        ),
      );
      final transformations = await repository.transformations();
      expect(transformations, hasLength(1));
      expect(transformations.single.workoutSequence, 1);
      expect(transformations.single.payload['row_2000_split_seconds'], 111.5);
    },
  );
}
