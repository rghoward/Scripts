import 'dart:convert';

import 'app_database.dart';

/// Immutable, read-only representation of local data eligible for the first
/// cloud import. IDs remain local references here; the importer maps them to
/// per-account cloud UUIDs and never uses a workout sequence as identity.
class LocalHistoryExporter {
  const LocalHistoryExporter(this._store);

  final LocalStateStore _store;

  Future<LocalHistoryExport> read() async {
    final database = _store.database;
    final snapshotRows = await database.query(
      'published_program_snapshots',
      orderBy: 'activated_at',
    );
    final snapshots = {
      for (final row in snapshotRows) row['id']! as String: row,
    };
    final activeSnapshotId = snapshotRows
        .where((row) => row['superseded_at'] == null)
        .map((row) => row['id']! as String)
        .firstOrNull;
    final programs = <LocalProgramExport>[];
    for (final program in await database.query(
      'programs',
      orderBy: 'created_at',
    )) {
      final localProgramId = program['id']! as String;
      final linkedSnapshotId = _snapshotIdForProgram(localProgramId);
      final snapshot = linkedSnapshotId == null
          ? null
          : snapshots[linkedSnapshotId];
      final prescriptions = await database.query(
        'workout_prescriptions',
        where: 'program_id = ?',
        whereArgs: [localProgramId],
        orderBy: 'sequence_number',
      );
      final assignments = await database.rawQuery(
        '''
        SELECT a.id, a.workout_id, a.assigned_date, a.status, a.created_at,
               p.sequence_number,
               (SELECT e.effective_date FROM schedule_events e
                WHERE e.assignment_id = a.id AND e.event_type = 'complete'
                ORDER BY e.created_at DESC LIMIT 1) AS completed_on
        FROM schedule_assignments a
        JOIN workout_prescriptions p ON p.id = a.workout_id
        WHERE a.program_id = ? AND a.assignment_type = 'workout'
        ORDER BY p.sequence_number
        ''',
        [localProgramId],
      );
      final fallbackSnapshot = jsonEncode({
        'local_program_id': localProgramId,
        'ruleset_version': program['ruleset_version'],
        'title': program['title'],
      });
      final snapshotJson =
          snapshot?['snapshot_json'] as String? ?? fallbackSnapshot;
      final remoteSnapshotId = linkedSnapshotId ?? 'legacy-$localProgramId';
      final remoteStatus =
          linkedSnapshotId != null && linkedSnapshotId == activeSnapshotId
          ? 'active'
          : 'archived';
      programs.add(
        LocalProgramExport(
          localId: localProgramId,
          snapshotId: remoteSnapshotId,
          title: program['title']! as String,
          startsOn: program['starts_on']! as String,
          source: linkedSnapshotId == null ? 'legacy_import' : 'bundled',
          status: remoteStatus,
          version: (snapshot?['version'] as int?) ?? 1,
          publishedAt: snapshot?['published_at'] as String?,
          snapshotJson: snapshotJson,
          checksum: _checksum(
            '$remoteSnapshotId|$snapshotJson|${prescriptions.map((row) => row['prescription_signature']).join('|')}',
          ),
          prescriptions: [
            for (final row in prescriptions)
              LocalPrescriptionExport(
                localId: row['id']! as String,
                sequence: row['sequence_number']! as int,
                signature: row['prescription_signature']! as String,
                rulesetVersion: row['ruleset_version']! as String,
                prescriptionJson: row['prescription_json']! as String,
              ),
          ],
          assignments: [
            for (final row in assignments)
              LocalAssignmentExport(
                localId: row['id']! as String,
                localWorkoutId: row['workout_id']! as String,
                sequence: row['sequence_number']! as int,
                assignedDate: row['assigned_date']! as String,
                status: row['status']! as String,
                createdAt: row['created_at']! as String,
                completedOn: row['completed_on'] as String?,
              ),
          ],
        ),
      );
    }

    final athlete = (await database.query(
      'athlete_profiles',
      limit: 1,
    )).firstOrNull;
    final benchmarkEvents = await database.rawQuery('''
      SELECT events.id, events.benchmark_id, events.recorded_at,
             result_values.metric_key, result_values.canonical_value
      FROM benchmark_result_events events
      LEFT JOIN benchmark_result_values result_values
        ON result_values.event_id = events.id
      ORDER BY events.recorded_at, events.id, result_values.metric_key
    ''');
    final benchmarks = <String, _LocalBenchmarkBuilder>{};
    for (final row in benchmarkEvents) {
      final id = row['id']! as String;
      final builder = benchmarks.putIfAbsent(
        id,
        () => _LocalBenchmarkBuilder(
          id: id,
          benchmarkId: row['benchmark_id']! as String,
          recordedAt: row['recorded_at']! as String,
        ),
      );
      final metric = row['metric_key'] as String?;
      final value = row['canonical_value'] as num?;
      if (metric != null && value != null) {
        builder.values[metric] = value.toDouble();
      }
    }
    return LocalHistoryExport(
      deviceImportKey: _checksum(
        'local-history-v1|${programs.map((program) => program.checksum).join('|')}',
      ),
      profile: athlete == null
          ? null
          : LocalProfileExport(
              displayName: athlete['display_name'] as String?,
              weightUnit: athlete['weight_unit']! as String,
            ),
      programs: programs,
      benchmarks: benchmarks.values.map((item) => item.build()).toList(),
      personalRecords: await _readValueHistory('personal_record_history'),
      trainingMaxes: await _readValueHistory('training_max_history'),
    );
  }

  Future<List<LocalValueHistoryExport>> _readValueHistory(String table) async {
    final rows = await _store.database.query(table, orderBy: 'created_at');
    return [
      for (final row in rows)
        LocalValueHistoryExport(
          localId: row['id']! as String,
          movementId: row['movement_id']! as String,
          canonicalValueLb: (row['canonical_value_lb']! as num).toDouble(),
          date: (row['achieved_on'] ?? row['effective_from'])! as String,
          source: row['source'] as String?,
          note: (row['note'] ?? row['reason']) as String?,
        ),
    ];
  }

  static String? _snapshotIdForProgram(String programId) {
    const prefix = 'published-';
    const suffix = '-five-day';
    if (!programId.startsWith(prefix) || !programId.endsWith(suffix)) {
      return null;
    }
    return programId.substring(prefix.length, programId.length - suffix.length);
  }

  /// Stable non-secret checksum used only for retry/idempotency grouping.
  static String _checksum(String value) {
    var hash = 0xcbf29ce484222325;
    for (final unit in utf8.encode(value)) {
      hash ^= unit;
      hash = (hash * 0x100000001b3) & 0xffffffffffffffff;
    }
    return hash.toRadixString(16).padLeft(16, '0');
  }
}

class LocalHistoryExport {
  const LocalHistoryExport({
    required this.deviceImportKey,
    required this.profile,
    required this.programs,
    required this.benchmarks,
    required this.personalRecords,
    required this.trainingMaxes,
  });

  final String deviceImportKey;
  final LocalProfileExport? profile;
  final List<LocalProgramExport> programs;
  final List<LocalBenchmarkExport> benchmarks;
  final List<LocalValueHistoryExport> personalRecords;
  final List<LocalValueHistoryExport> trainingMaxes;

  int get assignmentCount =>
      programs.fold(0, (total, program) => total + program.assignments.length);
  int get completionCount => programs.fold(
    0,
    (total, program) =>
        total + program.assignments.where((item) => item.isCompleted).length,
  );
}

class LocalProfileExport {
  const LocalProfileExport({
    required this.displayName,
    required this.weightUnit,
  });
  final String? displayName;
  final String weightUnit;
}

class LocalProgramExport {
  const LocalProgramExport({
    required this.localId,
    required this.snapshotId,
    required this.title,
    required this.startsOn,
    required this.source,
    required this.status,
    required this.version,
    required this.publishedAt,
    required this.snapshotJson,
    required this.checksum,
    required this.prescriptions,
    required this.assignments,
  });
  final String localId;
  final String snapshotId;
  final String title;
  final String startsOn;
  final String source;
  final String status;
  final int version;
  final String? publishedAt;
  final String snapshotJson;
  final String checksum;
  final List<LocalPrescriptionExport> prescriptions;
  final List<LocalAssignmentExport> assignments;
}

class LocalPrescriptionExport {
  const LocalPrescriptionExport({
    required this.localId,
    required this.sequence,
    required this.signature,
    required this.rulesetVersion,
    required this.prescriptionJson,
  });
  final String localId;
  final int sequence;
  final String signature;
  final String rulesetVersion;
  final String prescriptionJson;
}

class LocalAssignmentExport {
  const LocalAssignmentExport({
    required this.localId,
    required this.localWorkoutId,
    required this.sequence,
    required this.assignedDate,
    required this.status,
    required this.createdAt,
    required this.completedOn,
  });
  final String localId;
  final String localWorkoutId;
  final int sequence;
  final String assignedDate;
  final String status;
  final String createdAt;
  final String? completedOn;
  bool get isCompleted => status == 'completed';
}

class LocalBenchmarkExport {
  const LocalBenchmarkExport({
    required this.localId,
    required this.benchmarkId,
    required this.recordedAt,
    required this.values,
  });
  final String localId;
  final String benchmarkId;
  final String recordedAt;
  final Map<String, double> values;
}

class LocalValueHistoryExport {
  const LocalValueHistoryExport({
    required this.localId,
    required this.movementId,
    required this.canonicalValueLb,
    required this.date,
    required this.source,
    required this.note,
  });
  final String localId;
  final String movementId;
  final double canonicalValueLb;
  final String date;
  final String? source;
  final String? note;
}

class _LocalBenchmarkBuilder {
  _LocalBenchmarkBuilder({
    required this.id,
    required this.benchmarkId,
    required this.recordedAt,
  });
  final String id;
  final String benchmarkId;
  final String recordedAt;
  final values = <String, double>{};
  LocalBenchmarkExport build() => LocalBenchmarkExport(
    localId: id,
    benchmarkId: benchmarkId,
    recordedAt: recordedAt,
    values: values,
  );
}
