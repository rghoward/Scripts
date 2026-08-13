import 'dart:convert';

import 'package:flutter_test/flutter_test.dart';
import 'package:hoots_and_reps/data/app_database.dart';
import 'package:hoots_and_reps/data/local_history_audit.dart';
import 'package:hoots_and_reps/data/local_history_export.dart';
import 'package:hoots_and_reps/data/published_program_repository.dart';
import 'package:hoots_and_reps/data/schedule_repository.dart';
import 'package:shared_preferences/shared_preferences.dart';
import 'package:sqflite_common_ffi/sqflite_ffi.dart';

void main() {
  setUp(() async {
    sqfliteFfiInit();
    await AppDatabase.openForTesting(databaseFactoryFfi);
    SharedPreferences.setMockInitialValues({});
  });

  tearDown(AppDatabase.close);

  test(
    'reports immutable local programs without changing their state',
    () async {
      final preferences = await SharedPreferences.getInstance();
      final store = await LocalStateStore.openAndMigrate(preferences);
      final schedule = ScheduleRepository(store.database, programId: 'v1');
      await schedule.initialize(
        startsOn: DateTime.utc(2026, 8, 3),
        prescriptionSignatures: const ['a', 'b'],
      );
      await schedule.complete(
        (await schedule.assignments()).first.assignmentId,
      );
      await store.setString(
        'archived_program_progress_old',
        jsonEncode({
          'snapshot_id': 'old',
          'completed_workouts': ['1'],
          'partial_workouts': <String>[],
        }),
      );
      await store.setString(
        'conditioning_results_v1',
        '[{"workout_sequence":1}]',
      );

      final audit = await LocalHistoryAuditRepository(store).preview();

      expect(audit.programs, hasLength(1));
      expect(audit.programs.single.prescriptionCount, 2);
      expect(audit.completedWorkoutCount, 1);
      expect(audit.archivedProgress.single.snapshotId, 'old');
      expect(audit.sequenceScopedConditioningResults, 1);
      expect(audit.issues, contains(contains('sequence-only')));
      expect(audit.hasBlockingIssues, isFalse);
      expect(
        (await schedule.assignments()).first.status,
        ScheduleStatus.completed,
      );
    },
  );

  test('blocks import preview for assignments without prescriptions', () async {
    final database = await AppDatabase.open();
    const now = '2026-08-12T00:00:00.000Z';
    await database.insert('athlete_profiles', {
      'id': 'athlete',
      'weight_unit': 'pounds',
      'created_at': now,
      'updated_at': now,
    });
    await database.insert('programs', {
      'id': 'bad-program',
      'athlete_id': 'athlete',
      'ruleset_version': 'v1',
      'title': 'Bad',
      'starts_on': '2026-08-12',
      'status': 'active',
      'created_at': now,
      'updated_at': now,
    });
    await database.insert('schedule_assignments', {
      'id': 'assignment',
      'program_id': 'bad-program',
      'assigned_date': '2026-08-12',
      'assignment_type': 'rest',
      'status': 'planned',
      'created_at': now,
      'updated_at': now,
    });

    final audit = await LocalHistoryAuditRepository(
      LocalStateStore(database),
    ).preview();

    expect(audit.hasBlockingIssues, isTrue);
  });

  test(
    'exports a versioned program with stable local assignment identities',
    () async {
      final database = await AppDatabase.open();
      const snapshot = '''{
      "snapshot_id":"export-test",
      "version":6,
      "published_at":"2026-08-03T00:00:00.000Z",
      "workouts":[]
    }''';
      await PublishedProgramRepository(database).publishBundled(snapshot);
      final schedule = ScheduleRepository(
        database,
        programId: 'published-export-test-five-day',
        rulesetVersion: 'export-test',
      );
      await schedule.initialize(
        startsOn: DateTime.utc(2026, 8, 3),
        prescriptionSignatures: const ['signature-one', 'signature-two'],
      );
      final first = (await schedule.assignments()).first;
      await schedule.complete(first.assignmentId);

      final export = await LocalHistoryExporter(
        LocalStateStore(database),
      ).read();

      expect(export.programs, hasLength(1));
      expect(export.programs.single.snapshotId, 'export-test');
      expect(export.programs.single.status, 'active');
      expect(export.assignmentCount, 2);
      expect(export.completionCount, 1);
      expect(
        export.programs.single.assignments.first.assignedDate,
        '2026-08-03',
      );
      expect(export.programs.single.assignments.first.completedOn, isNotNull);
    },
  );
}
