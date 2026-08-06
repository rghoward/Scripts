import 'dart:convert';

import 'package:sqflite/sqflite.dart';

enum ScheduleStatus { planned, inProgress, unconfirmed, completed, skipped }

class ScheduledWorkout {
  const ScheduledWorkout({
    required this.assignmentId,
    required this.workoutId,
    required this.sequence,
    required this.date,
    required this.status,
  });

  final String assignmentId;
  final String workoutId;
  final int sequence;
  final DateTime date;
  final ScheduleStatus status;
}

class ProgramPause {
  const ProgramPause({required this.startedOn, required this.returnOn});

  final DateTime startedOn;
  final DateTime returnOn;

  bool contains(DateTime date) =>
      !date.isBefore(startedOn) && date.isBefore(returnOn);
}

/// SQLite-backed scheduler. Workout order is immutable; calendar assignments
/// are mutable and every mutation is recorded as an append-only event.
class ScheduleRepository {
  ScheduleRepository(this.database);

  static const athleteId = 'local-athlete';
  static const programId = 'phase-1-2026-07-27';
  static const rulesetVersion = 'phase-1-v1';
  static const _pauseStartedKey = 'schedule_pause_started_on';
  static const _pauseReturnKey = 'schedule_pause_return_on';

  final Database database;

  static String _day(DateTime value) => DateTime(
    value.year,
    value.month,
    value.day,
  ).toIso8601String().split('T').first;

  static bool _trainingDay(DateTime date) => const {
    DateTime.monday,
    DateTime.tuesday,
    DateTime.thursday,
    DateTime.saturday,
  }.contains(date.weekday);

  static DateTime _nextTrainingDate(DateTime from) {
    var date = DateTime(from.year, from.month, from.day);
    while (!_trainingDay(date)) {
      date = date.add(const Duration(days: 1));
    }
    return date;
  }

  static DateTime _followingTrainingDate(DateTime from) =>
      _nextTrainingDate(from.add(const Duration(days: 1)));

  Future<void> initialize({
    required DateTime startsOn,
    required List<String> prescriptionSignatures,
  }) async {
    final existing = await database.query(
      'programs',
      columns: ['id'],
      where: 'id = ?',
      whereArgs: [programId],
      limit: 1,
    );
    if (existing.isNotEmpty) return;
    final now = DateTime.now().toUtc().toIso8601String();
    await database.transaction((transaction) async {
      await transaction.insert('athlete_profiles', {
        'id': athleteId,
        'display_name': null,
        'weight_unit': 'pounds',
        'created_at': now,
        'updated_at': now,
      }, conflictAlgorithm: ConflictAlgorithm.ignore);
      await transaction.insert('programs', {
        'id': programId,
        'athlete_id': athleteId,
        'ruleset_version': rulesetVersion,
        'title': 'Forged Phase 1',
        'starts_on': _day(startsOn),
        'status': 'active',
        'created_at': now,
        'updated_at': now,
      });
      var date = _nextTrainingDate(startsOn);
      for (var index = 0; index < prescriptionSignatures.length; index++) {
        final sequence = index + 1;
        final workoutId = 'phase-1-workout-$sequence';
        final assignmentId = 'phase-1-assignment-$sequence';
        await transaction.insert('workout_prescriptions', {
          'id': workoutId,
          'program_id': programId,
          'sequence_number': sequence,
          'prescription_signature': prescriptionSignatures[index],
          'ruleset_version': rulesetVersion,
          'prescription_json': '{}',
          'created_at': now,
        });
        await transaction.insert('schedule_assignments', {
          'id': assignmentId,
          'program_id': programId,
          'workout_id': workoutId,
          'assigned_date': _day(date),
          'assignment_type': 'workout',
          'status': 'planned',
          'revision': 1,
          'created_at': now,
          'updated_at': now,
        });
        date = _followingTrainingDate(date);
      }
      await _event(
        transaction,
        type: 'assign',
        assignmentId: null,
        prior: const [],
        resulting: await _pendingSnapshot(transaction),
      );
    });
  }

  Future<List<ScheduledWorkout>> assignments() async {
    final rows = await database.rawQuery(
      '''
      SELECT a.id, a.workout_id, a.assigned_date, a.status, p.sequence_number
      FROM schedule_assignments a
      JOIN workout_prescriptions p ON p.id = a.workout_id
      WHERE a.program_id = ? AND a.status != 'cancelled'
      ORDER BY p.sequence_number
    ''',
      [programId],
    );
    return rows.map(_assignment).toList(growable: false);
  }

  Future<void> markInProgress(String assignmentId) =>
      _setStatus(assignmentId, 'in_progress', 'start');

  Future<void> complete(String assignmentId) =>
      _setStatus(assignmentId, 'completed', 'complete');

  Future<void> skip(String assignmentId) =>
      _setStatus(assignmentId, 'skipped', 'skip');

  Future<void> defer(String assignmentId) async {
    await database.transaction((transaction) async {
      final before = await _pendingSnapshot(transaction);
      final selected = before.firstWhere(
        (row) => row['id'] == assignmentId,
        orElse: () =>
            throw StateError('Only a pending workout can be deferred.'),
      );
      final selectedIndex = before.indexWhere(
        (row) => row['id'] == selected['id'],
      );
      final affected = before.sublist(selectedIndex);
      final target = _followingTrainingDate(
        DateTime.parse(selected['assigned_date']! as String),
      );
      await _reflow(transaction, affected, target, now: DateTime.now().toUtc());
      await _event(
        transaction,
        type: 'confirm_defer',
        assignmentId: assignmentId,
        prior: affected,
        resulting: await _pendingSnapshot(transaction),
      );
    });
  }

  Future<void> pauseUntil(DateTime returnDate) async {
    await database.transaction((transaction) async {
      final before = await _pendingSnapshot(transaction);
      if (before.isEmpty) return;
      await _reflow(
        transaction,
        before,
        _nextTrainingDate(returnDate),
        now: DateTime.now().toUtc(),
      );
      final now = DateTime.now().toUtc().toIso8601String();
      await transaction.update(
        'programs',
        {'status': 'paused', 'updated_at': now},
        where: 'id = ?',
        whereArgs: [programId],
      );
      final existingStart = await _stateValue(transaction, _pauseStartedKey);
      await _writeState(
        transaction,
        _pauseStartedKey,
        existingStart ?? _day(DateTime.now()),
      );
      await _writeState(transaction, _pauseReturnKey, _day(returnDate));
      await _event(
        transaction,
        type: 'pause',
        assignmentId: null,
        prior: before,
        resulting: await _pendingSnapshot(transaction),
      );
    });
  }

  Future<ProgramPause?> pauseState() async {
    final rows = await database.query(
      'app_state',
      columns: ['key', 'value'],
      where: 'key IN (?, ?)',
      whereArgs: [_pauseStartedKey, _pauseReturnKey],
    );
    final values = {
      for (final row in rows) row['key']! as String: row['value']! as String,
    };
    final started = values[_pauseStartedKey];
    final returning = values[_pauseReturnKey];
    if (started == null || returning == null) return null;
    return ProgramPause(
      startedOn: DateTime.parse(started),
      returnOn: DateTime.parse(returning),
    );
  }

  Future<void> resumeEarly(DateTime resumeDate) async {
    await database.transaction((transaction) async {
      final before = await _pendingSnapshot(transaction);
      if (before.isNotEmpty) {
        await _reflow(
          transaction,
          before,
          _nextTrainingDate(resumeDate),
          now: DateTime.now().toUtc(),
        );
      }
      final now = DateTime.now().toUtc().toIso8601String();
      await transaction.update(
        'programs',
        {'status': 'active', 'updated_at': now},
        where: 'id = ?',
        whereArgs: [programId],
      );
      await transaction.delete(
        'app_state',
        where: 'key IN (?, ?)',
        whereArgs: [_pauseStartedKey, _pauseReturnKey],
      );
      await _event(
        transaction,
        type: 'resume',
        assignmentId: null,
        prior: before,
        resulting: await _pendingSnapshot(transaction),
      );
    });
  }

  Future<bool> undoLastScheduleChange() async {
    return database.transaction((transaction) async {
      final events = await transaction.query(
        'schedule_events',
        where:
            "program_id = ? AND event_type IN ('confirm_defer', 'pause') "
            'AND NOT EXISTS (SELECT 1 FROM schedule_events reversal '
            'WHERE reversal.reverses_event_id = schedule_events.id)',
        whereArgs: [programId],
        orderBy: 'created_at DESC',
        limit: 1,
      );
      if (events.isEmpty) return false;
      final event = events.first;
      final prior = (jsonDecode(event['prior_state_json']! as String) as List)
          .cast<Map<String, dynamic>>();
      final current = await _pendingSnapshot(transaction);
      final now = DateTime.now().toUtc().toIso8601String();
      for (final row in prior) {
        await transaction.update(
          'schedule_assignments',
          {
            'assigned_date': row['assigned_date'],
            'status': row['status'],
            'revision': (row['revision'] as int) + 1,
            'updated_at': now,
          },
          where: 'id = ?',
          whereArgs: [row['id']],
        );
      }
      if (event['event_type'] == 'pause') {
        await transaction.delete(
          'app_state',
          where: 'key IN (?, ?)',
          whereArgs: [_pauseStartedKey, _pauseReturnKey],
        );
        await transaction.update(
          'programs',
          {'status': 'active', 'updated_at': now},
          where: 'id = ?',
          whereArgs: [programId],
        );
      }
      await _event(
        transaction,
        type: 'undo',
        assignmentId: null,
        prior: current,
        resulting: prior,
        reversesEventId: event['id']! as String,
      );
      return true;
    });
  }

  Future<void> markPastUnresolved(DateTime today) async {
    final date = _day(today);
    await database.update(
      'schedule_assignments',
      {
        'status': 'unconfirmed',
        'updated_at': DateTime.now().toUtc().toIso8601String(),
      },
      where: "program_id = ? AND assigned_date < ? AND status = 'planned'",
      whereArgs: [programId, date],
    );
  }

  Future<void> _setStatus(
    String assignmentId,
    String status,
    String eventType,
  ) async {
    await database.transaction((transaction) async {
      final rows = await transaction.query(
        'schedule_assignments',
        where: 'id = ?',
        whereArgs: [assignmentId],
        limit: 1,
      );
      if (rows.isEmpty) throw StateError('Unknown schedule assignment.');
      final prior = rows.first;
      await transaction.update(
        'schedule_assignments',
        {
          'status': status,
          'revision': (prior['revision']! as int) + 1,
          'updated_at': DateTime.now().toUtc().toIso8601String(),
        },
        where: 'id = ?',
        whereArgs: [assignmentId],
      );
      final resulting = (await transaction.query(
        'schedule_assignments',
        where: 'id = ?',
        whereArgs: [assignmentId],
        limit: 1,
      )).first;
      await _event(
        transaction,
        type: eventType,
        assignmentId: assignmentId,
        prior: [prior],
        resulting: [resulting],
      );
    });
  }

  static Future<void> _reflow(
    Transaction transaction,
    List<Map<String, Object?>> rows,
    DateTime startsOn, {
    required DateTime now,
  }) async {
    var date = _nextTrainingDate(startsOn);
    for (final row in rows) {
      await transaction.update(
        'schedule_assignments',
        {
          'assigned_date': _day(date),
          'status': 'planned',
          'revision': (row['revision']! as int) + 1,
          'updated_at': now.toIso8601String(),
        },
        where: 'id = ?',
        whereArgs: [row['id']],
      );
      date = _followingTrainingDate(date);
    }
  }

  static Future<List<Map<String, Object?>>> _pendingSnapshot(
    Transaction transaction,
  ) => transaction.query(
    'schedule_assignments',
    where:
        "program_id = ? AND status IN ('planned', 'unconfirmed', 'provisional')",
    whereArgs: [programId],
    orderBy: 'assigned_date, id',
  );

  static Future<void> _event(
    Transaction transaction, {
    required String type,
    required String? assignmentId,
    required Object prior,
    required Object resulting,
    String? reversesEventId,
  }) async {
    final now = DateTime.now().toUtc();
    final id = 'schedule-event-${now.microsecondsSinceEpoch}-$type';
    await transaction.insert('schedule_events', {
      'id': id,
      'program_id': programId,
      'assignment_id': assignmentId,
      'event_type': type,
      'effective_date': _day(now),
      'prior_state_json': jsonEncode(prior),
      'resulting_state_json': jsonEncode(resulting),
      'reverses_event_id': reversesEventId,
      'created_at': now.toIso8601String(),
      'sync_status': 'pending',
    });
  }

  static Future<String?> _stateValue(
    Transaction transaction,
    String key,
  ) async {
    final rows = await transaction.query(
      'app_state',
      columns: ['value'],
      where: 'key = ?',
      whereArgs: [key],
      limit: 1,
    );
    return rows.isEmpty ? null : rows.first['value']! as String;
  }

  static Future<void> _writeState(
    Transaction transaction,
    String key,
    String value,
  ) => transaction.insert('app_state', {
    'key': key,
    'value_type': 'string',
    'value': value,
    'updated_at': DateTime.now().toUtc().toIso8601String(),
  }, conflictAlgorithm: ConflictAlgorithm.replace);

  static ScheduledWorkout _assignment(Map<String, Object?> row) =>
      ScheduledWorkout(
        assignmentId: row['id']! as String,
        workoutId: row['workout_id']! as String,
        sequence: row['sequence_number']! as int,
        date: DateTime.parse(row['assigned_date']! as String),
        status: switch (row['status']! as String) {
          'planned' => ScheduleStatus.planned,
          'in_progress' => ScheduleStatus.inProgress,
          'unconfirmed' => ScheduleStatus.unconfirmed,
          'completed' => ScheduleStatus.completed,
          'skipped' => ScheduleStatus.skipped,
          _ => ScheduleStatus.planned,
        },
      );
}
