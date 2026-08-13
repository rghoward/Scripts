import 'dart:convert';

import 'package:supabase_flutter/supabase_flutter.dart';

import 'local_history_export.dart';

/// Opt-in, retry-safe first import for one authenticated athlete.
///
/// This intentionally does not start background sync. Each cloud row is
/// addressed by the signed-in user plus a deterministic local import key, so a
/// retry after an interrupted connection resumes rather than duplicates data.
class SupabaseHistoryImportRepository {
  SupabaseHistoryImportRepository(this._client, this._exporter);

  final SupabaseClient _client;
  final LocalHistoryExporter _exporter;

  Future<CloudHistoryImportResult> importCurrentAthlete() async {
    final user = _client.auth.currentUser;
    if (user == null) throw StateError('Sign in before importing history.');
    final local = await _exporter.read();
    final marker = 'sqlite-history-v1-${local.deviceImportKey}';
    final existingMarker = await _client
        .from('client_mutations')
        .select('id')
        .eq('client_mutation_id', marker)
        .maybeSingle();
    if (existingMarker != null) {
      return CloudHistoryImportResult.alreadyImported(local);
    }

    await _upsertProfile(user.id, local.profile);
    final remoteProgramIds = <String, String>{};
    var importedAssignments = 0;
    var importedCompletions = 0;
    for (final program in local.programs) {
      final programId = await _programIdFor(user.id, program);
      remoteProgramIds[program.localId] = programId;
      final prescriptions = await _prescriptionsFor(programId, program);
      final counts = await _assignmentsFor(
        user.id,
        marker,
        programId,
        program,
        prescriptions,
      );
      importedAssignments += counts.assignments;
      importedCompletions += counts.completions;
      await _setProgramStatus(programId, program);
    }
    final benchmarks = await _benchmarksFor(user.id, marker, local.benchmarks);
    final records = await _valueHistoryFor(
      user.id,
      marker,
      'personal_record_history',
      local.personalRecords,
      isPersonalRecord: true,
    );
    final trainingMaxes = await _valueHistoryFor(
      user.id,
      marker,
      'training_max_history',
      local.trainingMaxes,
      isPersonalRecord: false,
    );

    await _verify(remoteProgramIds.values, local.assignmentCount);
    await _client.from('client_mutations').insert({
      'user_id': user.id,
      'client_mutation_id': marker,
      'entity_type': 'local_history_import',
      'payload_json': {
        'program_count': local.programs.length,
        'assignment_count': local.assignmentCount,
        'completion_count': local.completionCount,
        'benchmark_count': local.benchmarks.length,
        'conditioning_results_left_local': true,
      },
    });
    return CloudHistoryImportResult(
      local: local,
      wasAlreadyImported: false,
      importedPrograms: remoteProgramIds.length,
      importedAssignments: importedAssignments,
      importedCompletions: importedCompletions,
      importedBenchmarks: benchmarks,
      importedPersonalRecords: records,
      importedTrainingMaxes: trainingMaxes,
    );
  }

  Future<void> _upsertProfile(String userId, LocalProfileExport? profile) =>
      _client.from('profiles').upsert({
        'id': userId,
        if (profile?.displayName?.trim().isNotEmpty ?? false)
          'display_name': profile!.displayName!.trim(),
        if (profile != null) 'weight_unit': profile.weightUnit,
      });

  Future<String> _programIdFor(
    String userId,
    LocalProgramExport program,
  ) async {
    final existing = await _client
        .from('program_versions')
        .select('id')
        .eq('snapshot_id', program.snapshotId)
        .maybeSingle();
    if (existing != null) return existing['id']! as String;
    // Prescriptions are allowed only while the version is draft. The immutable
    // target status is applied once its complete content has been inserted.
    final inserted = await _client
        .from('program_versions')
        .insert({
          'owner_user_id': userId,
          'snapshot_id': program.snapshotId,
          'version': program.version,
          'title': program.title,
          'source': program.source,
          'status': 'draft',
          'starts_on': program.startsOn,
          if (program.publishedAt != null) 'published_at': program.publishedAt,
          'snapshot_json': _json(program.snapshotJson),
          'checksum': program.checksum,
          'imported_from_device_id': 'local-${program.localId}',
        })
        .select('id')
        .single();
    return inserted['id']! as String;
  }

  Future<Map<String, String>> _prescriptionsFor(
    String programId,
    LocalProgramExport program,
  ) async {
    final existing = await _client
        .from('workout_prescriptions')
        .select('id, sequence_number')
        .eq('program_version_id', programId);
    final ids = <int, String>{
      for (final row in existing as List)
        row['sequence_number'] as int: row['id'] as String,
    };
    final missing = program.prescriptions
        .where((item) => !ids.containsKey(item.sequence))
        .toList();
    if (missing.isNotEmpty) {
      final inserted = await _client
          .from('workout_prescriptions')
          .insert([
            for (final item in missing)
              {
                'program_version_id': programId,
                'sequence_number': item.sequence,
                'title': 'Day ${item.sequence}',
                'role': item.rulesetVersion,
                'prescription_json': _json(item.prescriptionJson),
                'prescription_signature': item.signature,
              },
          ])
          .select('id, sequence_number');
      for (final row in inserted as List) {
        ids[row['sequence_number'] as int] = row['id'] as String;
      }
    }
    return {
      for (final item in program.prescriptions)
        item.localId: ids[item.sequence]!,
    };
  }

  Future<_AssignmentCounts> _assignmentsFor(
    String userId,
    String marker,
    String programId,
    LocalProgramExport program,
    Map<String, String> prescriptionIds,
  ) async {
    var assignments = 0;
    var completions = 0;
    for (final assignment in program.assignments) {
      final clientId = '$marker:assignment:${assignment.localId}';
      var remote = await _client
          .from('workout_assignments')
          .select('id')
          .eq('client_created_id', clientId)
          .maybeSingle();
      if (remote == null) {
        remote = await _client
            .from('workout_assignments')
            .insert({
              'user_id': userId,
              'program_version_id': programId,
              'workout_prescription_id':
                  prescriptionIds[assignment.localWorkoutId],
              'assigned_date': assignment.assignedDate,
              'status': _cloudAssignmentStatus(assignment.status),
              if (assignment.isCompleted)
                'completed_at': _completionTimestamp(assignment),
              'client_created_id': clientId,
            })
            .select('id')
            .single();
        assignments++;
      }
      if (!assignment.isCompleted) continue;
      final completionId = '$marker:completion:${assignment.localId}';
      final exists = await _client
          .from('workout_completions')
          .select('id')
          .eq('client_created_id', completionId)
          .maybeSingle();
      if (exists == null) {
        await _client.from('workout_completions').insert({
          'assignment_id': remote['id'],
          'user_id': userId,
          'completion_status': 'complete',
          'completed_at': _completionTimestamp(assignment),
          'section_state_json': const <String, Object?>{},
          'feedback_json': const <String, Object?>{},
          'client_created_id': completionId,
        });
        completions++;
      }
    }
    return _AssignmentCounts(assignments, completions);
  }

  Future<void> _setProgramStatus(
    String programId,
    LocalProgramExport program,
  ) async {
    final remote = await _client
        .from('program_versions')
        .select('status')
        .eq('id', programId)
        .single();
    if (remote['status'] == program.status) return;
    await _client
        .from('program_versions')
        .update({
          'status': program.status,
          if (program.status == 'archived')
            'archived_at': DateTime.now().toUtc().toIso8601String(),
        })
        .eq('id', programId);
  }

  Future<int> _benchmarksFor(
    String userId,
    String marker,
    List<LocalBenchmarkExport> benchmarks,
  ) async {
    var imported = 0;
    for (final benchmark in benchmarks) {
      final clientId = '$marker:benchmark:${benchmark.localId}';
      final existing = await _client
          .from('benchmark_result_events')
          .select('id')
          .eq('client_created_id', clientId)
          .maybeSingle();
      if (existing != null) continue;
      final event = await _client
          .from('benchmark_result_events')
          .insert({
            'user_id': userId,
            'benchmark_id': benchmark.benchmarkId,
            'recorded_at': benchmark.recordedAt,
            'client_created_id': clientId,
          })
          .select('id')
          .single();
      if (benchmark.values.isNotEmpty) {
        await _client.from('benchmark_result_values').insert([
          for (final value in benchmark.values.entries)
            {
              'event_id': event['id'],
              'metric_key': value.key,
              'canonical_value': value.value,
            },
        ]);
      }
      imported++;
    }
    return imported;
  }

  Future<int> _valueHistoryFor(
    String userId,
    String marker,
    String table,
    List<LocalValueHistoryExport> values, {
    required bool isPersonalRecord,
  }) async {
    var imported = 0;
    for (final value in values) {
      final clientId = '$marker:$table:${value.localId}';
      final existing = await _client
          .from(table)
          .select('id')
          .eq('client_created_id', clientId)
          .maybeSingle();
      if (existing != null) continue;
      await _client.from(table).insert({
        'user_id': userId,
        'movement_id': value.movementId,
        'canonical_value_lb': value.canonicalValueLb,
        if (isPersonalRecord) 'achieved_on': value.date,
        if (!isPersonalRecord) 'effective_from': value.date,
        if (isPersonalRecord) 'source': value.source ?? 'imported',
        if (isPersonalRecord) 'note': value.note,
        if (!isPersonalRecord) 'reason': value.note,
        'client_created_id': clientId,
      });
      imported++;
    }
    return imported;
  }

  Future<void> _verify(Iterable<String> remoteProgramIds, int expected) async {
    var actual = 0;
    for (final id in remoteProgramIds) {
      final rows = await _client
          .from('workout_assignments')
          .select('id')
          .eq('program_version_id', id);
      actual += (rows as List).length;
    }
    if (actual != expected) {
      throw StateError(
        'Cloud verification expected $expected assignments but found $actual. '
        'The import marker was not written; retrying is safe.',
      );
    }
  }

  static Object _json(String raw) {
    try {
      return jsonDecode(raw);
    } on FormatException {
      return {'raw_prescription': raw};
    }
  }

  static String _cloudAssignmentStatus(String status) => switch (status) {
    'completed' => 'completed',
    'skipped' => 'skipped',
    'in_progress' => 'in_progress',
    _ => 'planned',
  };

  static String _completionTimestamp(LocalAssignmentExport assignment) {
    final day = assignment.completedOn ?? assignment.assignedDate;
    return day.contains('T') ? day : '${day}T12:00:00.000Z';
  }
}

class CloudHistoryImportResult {
  const CloudHistoryImportResult({
    required this.local,
    required this.wasAlreadyImported,
    required this.importedPrograms,
    required this.importedAssignments,
    required this.importedCompletions,
    required this.importedBenchmarks,
    required this.importedPersonalRecords,
    required this.importedTrainingMaxes,
  });

  factory CloudHistoryImportResult.alreadyImported(LocalHistoryExport local) =>
      CloudHistoryImportResult(
        local: local,
        wasAlreadyImported: true,
        importedPrograms: 0,
        importedAssignments: 0,
        importedCompletions: 0,
        importedBenchmarks: 0,
        importedPersonalRecords: 0,
        importedTrainingMaxes: 0,
      );

  final LocalHistoryExport local;
  final bool wasAlreadyImported;
  final int importedPrograms;
  final int importedAssignments;
  final int importedCompletions;
  final int importedBenchmarks;
  final int importedPersonalRecords;
  final int importedTrainingMaxes;
}

class _AssignmentCounts {
  const _AssignmentCounts(this.assignments, this.completions);
  final int assignments;
  final int completions;
}
