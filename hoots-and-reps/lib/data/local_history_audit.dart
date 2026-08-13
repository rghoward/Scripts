import 'dart:convert';

import 'app_database.dart';

/// Read-only inventory of all history that would be considered by the first
/// cloud import. It intentionally performs no network or database writes.
///
/// This is the guard rail before a real-device migration: each local program
/// has a durable ID, and ambiguous sequence-only records are called out rather
/// than silently attached to a similarly numbered new workout.
class LocalHistoryAuditRepository {
  const LocalHistoryAuditRepository(this._store);

  final LocalStateStore _store;

  Future<LocalHistoryAudit> preview() async {
    final database = _store.database;
    final programs = await database.query('programs', orderBy: 'created_at');
    final programAudits = <LocalProgramAudit>[];
    final issues = <String>[];

    for (final program in programs) {
      final id = program['id']! as String;
      final prescriptionCount = _count(
        await database.rawQuery(
          'SELECT COUNT(*) AS count FROM workout_prescriptions WHERE program_id = ?',
          [id],
        ),
      );
      final assignments = await database.rawQuery(
        '''
        SELECT status, COUNT(*) AS count
        FROM schedule_assignments
        WHERE program_id = ?
        GROUP BY status
        ''',
        [id],
      );
      final sessions = _count(
        await database.rawQuery(
          'SELECT COUNT(*) AS count FROM workout_sessions WHERE assignment_id IN '
          '(SELECT id FROM schedule_assignments WHERE program_id = ?)',
          [id],
        ),
      );
      final statusCounts = <String, int>{
        for (final row in assignments)
          row['status']! as String: (row['count']! as num).toInt(),
      };
      final assignmentCount = statusCounts.values.fold(0, (a, b) => a + b);
      if (prescriptionCount == 0 && assignmentCount > 0) {
        issues.add('Program $id has assignments but no prescriptions.');
      }
      programAudits.add(
        LocalProgramAudit(
          id: id,
          title: program['title']! as String,
          status: program['status']! as String,
          startsOn: program['starts_on']! as String,
          prescriptionCount: prescriptionCount,
          assignmentCounts: statusCounts,
          sessionCount: sessions,
        ),
      );
    }

    final snapshots = await database.query(
      'published_program_snapshots',
      columns: ['id', 'version', 'superseded_at'],
      orderBy: 'activated_at',
    );
    final activeSnapshot = snapshots.where(
      (row) => row['superseded_at'] == null,
    );
    if (activeSnapshot.length > 1) {
      issues.add('More than one published snapshot is marked active locally.');
    }

    final archivedProgress = await _archivedProgressEntries();
    final malformedArchives = archivedProgress.where((entry) => !entry.isValid);
    if (malformedArchives.isNotEmpty) {
      issues.add(
        '${malformedArchives.length} archived progress record(s) cannot be decoded.',
      );
    }

    final conditioningCount = await _sequenceScopedConditioningResultCount();
    final benchmarkEventCount = _count(
      await database.rawQuery(
        'SELECT COUNT(*) AS count FROM benchmark_result_events',
      ),
    );
    final personalRecordCount = _count(
      await database.rawQuery(
        'SELECT COUNT(*) AS count FROM personal_record_history',
      ),
    );
    final trainingMaxCount = _count(
      await database.rawQuery(
        'SELECT COUNT(*) AS count FROM training_max_history',
      ),
    );
    if (conditioningCount > 0) {
      issues.add(
        'Conditioning results use legacy sequence-only keys and need a '
        'snapshot/assignment confirmation during import.',
      );
    }

    return LocalHistoryAudit(
      programs: programAudits,
      snapshotIds: snapshots.map((row) => row['id']! as String).toList(),
      activeSnapshotId: activeSnapshot.isEmpty
          ? null
          : activeSnapshot.single['id']! as String,
      archivedProgress: archivedProgress,
      sequenceScopedConditioningResults: conditioningCount,
      benchmarkEventCount: benchmarkEventCount,
      personalRecordCount: personalRecordCount,
      trainingMaxCount: trainingMaxCount,
      issues: issues,
    );
  }

  Future<List<ArchivedProgressAudit>> _archivedProgressEntries() async {
    final rows = await _store.database.query(
      'app_state',
      columns: ['key', 'value'],
      where: "key LIKE 'archived_program_progress_%' AND value_type = 'string'",
      orderBy: 'key',
    );
    return rows
        .map((row) {
          final key = row['key']! as String;
          try {
            final decoded = jsonDecode(row['value']! as String);
            if (decoded is! Map || decoded['snapshot_id'] is! String) {
              return ArchivedProgressAudit.invalid(key);
            }
            final completed = decoded['completed_workouts'];
            final partial = decoded['partial_workouts'];
            return ArchivedProgressAudit(
              stateKey: key,
              snapshotId: decoded['snapshot_id']! as String,
              completedWorkoutCount: completed is List ? completed.length : 0,
              partialWorkoutCount: partial is List ? partial.length : 0,
              isValid: true,
            );
          } on FormatException {
            return ArchivedProgressAudit.invalid(key);
          }
        })
        .toList(growable: false);
  }

  Future<int> _sequenceScopedConditioningResultCount() async {
    final encoded = await _store.getString('conditioning_results_v1');
    if (encoded == null) return 0;
    try {
      final decoded = jsonDecode(encoded);
      return decoded is List ? decoded.length : 0;
    } on FormatException {
      return 0;
    }
  }

  static int _count(List<Map<String, Object?>> rows) =>
      (rows.single['count']! as num).toInt();
}

class LocalHistoryAudit {
  const LocalHistoryAudit({
    required this.programs,
    required this.snapshotIds,
    required this.activeSnapshotId,
    required this.archivedProgress,
    required this.sequenceScopedConditioningResults,
    required this.benchmarkEventCount,
    required this.personalRecordCount,
    required this.trainingMaxCount,
    required this.issues,
  });

  final List<LocalProgramAudit> programs;
  final List<String> snapshotIds;
  final String? activeSnapshotId;
  final List<ArchivedProgressAudit> archivedProgress;
  final int sequenceScopedConditioningResults;
  final int benchmarkEventCount;
  final int personalRecordCount;
  final int trainingMaxCount;
  final List<String> issues;

  int get completedWorkoutCount => programs.fold(
    0,
    (sum, program) => sum + (program.assignmentCounts['completed'] ?? 0),
  );

  bool get hasBlockingIssues => issues.any(
    (issue) =>
        issue.contains('no prescriptions') ||
        issue.contains('more than one published snapshot') ||
        issue.contains('cannot be decoded'),
  );

  Map<String, Object?> toJson() => {
    'programs': programs.map((program) => program.toJson()).toList(),
    'snapshot_ids': snapshotIds,
    'active_snapshot_id': activeSnapshotId,
    'archived_progress': archivedProgress
        .map((progress) => progress.toJson())
        .toList(),
    'sequence_scoped_conditioning_results': sequenceScopedConditioningResults,
    'benchmark_event_count': benchmarkEventCount,
    'personal_record_count': personalRecordCount,
    'training_max_count': trainingMaxCount,
    'completed_workout_count': completedWorkoutCount,
    'issues': issues,
    'ready_for_guided_import': !hasBlockingIssues,
  };
}

class LocalProgramAudit {
  const LocalProgramAudit({
    required this.id,
    required this.title,
    required this.status,
    required this.startsOn,
    required this.prescriptionCount,
    required this.assignmentCounts,
    required this.sessionCount,
  });

  final String id;
  final String title;
  final String status;
  final String startsOn;
  final int prescriptionCount;
  final Map<String, int> assignmentCounts;
  final int sessionCount;

  Map<String, Object?> toJson() => {
    'local_program_id': id,
    'title': title,
    'status': status,
    'starts_on': startsOn,
    'prescription_count': prescriptionCount,
    'assignment_counts': assignmentCounts,
    'session_count': sessionCount,
  };
}

class ArchivedProgressAudit {
  const ArchivedProgressAudit({
    required this.stateKey,
    required this.snapshotId,
    required this.completedWorkoutCount,
    required this.partialWorkoutCount,
    required this.isValid,
  });

  factory ArchivedProgressAudit.invalid(String stateKey) =>
      ArchivedProgressAudit(
        stateKey: stateKey,
        snapshotId: '',
        completedWorkoutCount: 0,
        partialWorkoutCount: 0,
        isValid: false,
      );

  final String stateKey;
  final String snapshotId;
  final int completedWorkoutCount;
  final int partialWorkoutCount;
  final bool isValid;

  Map<String, Object?> toJson() => {
    'state_key': stateKey,
    'snapshot_id': snapshotId,
    'completed_workout_count': completedWorkoutCount,
    'partial_workout_count': partialWorkoutCount,
    'valid': isValid,
  };
}
