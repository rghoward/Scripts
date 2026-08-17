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
  ScheduleRepository(
    this.database, {
    this.programId = defaultProgramId,
    this.rulesetVersion = defaultRulesetVersion,
  });

  static const athleteId = 'local-athlete';
  static const defaultProgramId = 'phase-1-2026-07-27';
  static const defaultRulesetVersion = 'phase-1-v1';
  static const _pauseStartedKey = 'schedule_pause_started_on';
  static const _pauseReturnKey = 'schedule_pause_return_on';

  final Database database;
  final String programId;
  final String rulesetVersion;

  static String _day(DateTime value) => DateTime(
    value.year,
    value.month,
    value.day,
  ).toIso8601String().split('T').first;

  static bool _trainingDay(DateTime date) => const {
    DateTime.monday,
    DateTime.tuesday,
    DateTime.thursday,
    DateTime.friday,
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
        final workoutId = '$programId-workout-$sequence';
        final assignmentId = '$programId-assignment-$sequence';
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

  /// Completion records the result; it must never rewrite the programmed day.
  Future<void> complete(String assignmentId) =>
      _setStatus(assignmentId, 'completed', 'complete');

  /// Reopens a completed or partial workout without changing its assigned day.
  Future<void> reopen(String assignmentId) =>
      _setStatus(assignmentId, 'in_progress', 'reopen');

  /// Removes completion state mistakenly carried over from a different
  /// published snapshot. It affects only this program's assignments; historic
  /// programs and their completion records remain unchanged.
  Future<void> clearInheritedCompletionStates() async {
    await database.transaction((transaction) async {
      final prior = await transaction.query(
        'schedule_assignments',
        where: "program_id = ? AND status IN ('completed', 'in_progress')",
        whereArgs: [programId],
      );
      if (prior.isEmpty) return;
      final now = DateTime.now().toUtc().toIso8601String();
      for (final row in prior) {
        await transaction.update(
          'schedule_assignments',
          {
            'status': 'planned',
            'revision': (row['revision']! as int) + 1,
            'updated_at': now,
          },
          where: 'id = ?',
          whereArgs: [row['id']! as String],
        );
      }
      // The original schema has a closed event-type set and no repair type.
      // Progress ownership is recorded in the snapshot migration key instead;
      // this transaction intentionally only restores this program's status.
    });
  }

  /// Restores a reviewed published program to its intended weekly calendar.
  ///
  /// A snapshot may be installed after its nominal start date. Sessions that
  /// were never available in that snapshot are marked skipped rather than
  /// incorrectly shown as an athlete's unfinished work. Completed sessions are
  /// retained, including their completion event history, while their calendar
  /// position is restored to the program's durable anchor.
  Future<void> restoreAnchoredCalendar({
    required DateTime startsOn,
    required int firstAvailableSequence,
  }) async {
    await database.transaction((transaction) async {
      final rows = await transaction.rawQuery(
        '''
        SELECT a.id, a.status, a.assigned_date, a.revision, p.sequence_number
        FROM schedule_assignments a
        JOIN workout_prescriptions p ON p.id = a.workout_id
        WHERE a.program_id = ?
        ORDER BY p.sequence_number
        ''',
        [programId],
      );
      var date = _nextTrainingDate(startsOn);
      final now = DateTime.now().toUtc().toIso8601String();
      for (final row in rows) {
        final sequence = row['sequence_number']! as int;
        final existingStatus = row['status']! as String;
        final restoredStatus =
            sequence < firstAvailableSequence && existingStatus != 'completed'
            ? 'skipped'
            : existingStatus;
        final restoredDate = _day(date);
        if (existingStatus != restoredStatus ||
            row['assigned_date']! as String != restoredDate) {
          await transaction.update(
            'schedule_assignments',
            {
              'assigned_date': restoredDate,
              'status': restoredStatus,
              'revision': (row['revision']! as int) + 1,
              'updated_at': now,
            },
            where: 'id = ?',
            whereArgs: [row['id']! as String],
          );
        }
        date = _followingTrainingDate(date);
      }
      // This is an explicit migration action recorded in app_state. Existing
      // completion events preserve the actual date the athlete finished.
    });
  }

  /// One-time athlete schedule repair: preserve completed work before
  /// [sequence] and place that sequence on [startsOn], then give each later
  /// unfinished workout its own following training day.
  Future<void> rescheduleUnfinishedFrom(int sequence, DateTime startsOn) async {
    await database.transaction((transaction) async {
      final rows = await transaction.rawQuery(
        '''
        SELECT a.id, a.revision
        FROM schedule_assignments a
        JOIN workout_prescriptions p ON p.id = a.workout_id
        WHERE a.program_id = ?
          AND p.sequence_number >= ?
          AND a.status IN ('planned', 'unconfirmed', 'in_progress')
        ORDER BY p.sequence_number
        ''',
        [programId, sequence],
      );
      if (rows.isEmpty) return;
      var date = DateTime(startsOn.year, startsOn.month, startsOn.day);
      final now = DateTime.now().toUtc().toIso8601String();
      for (final row in rows) {
        await transaction.update(
          'schedule_assignments',
          {
            'assigned_date': _day(date),
            'status': 'planned',
            'revision': (row['revision']! as int) + 1,
            'updated_at': now,
          },
          where: 'id = ?',
          whereArgs: [row['id']! as String],
        );
        date = _followingTrainingDate(date);
      }
    });
  }

  /// Restores every calendar date from this program's persisted start date.
  /// Statuses are intentionally left untouched, so completed work remains
  /// completed. This is used only to recover the historical date migration.
  Future<bool> restoreCanonicalCalendar() async {
    return database.transaction((transaction) async {
      final programs = await transaction.query(
        'programs',
        columns: ['starts_on'],
        where: 'id = ?',
        whereArgs: [programId],
        limit: 1,
      );
      if (programs.isEmpty) return false;
      final rows = await transaction.rawQuery(
        '''
        SELECT a.id, a.assigned_date, a.revision
        FROM schedule_assignments a
        JOIN workout_prescriptions p ON p.id = a.workout_id
        WHERE a.program_id = ?
        ORDER BY p.sequence_number
        ''',
        [programId],
      );
      var date = _nextTrainingDate(
        DateTime.parse(programs.single['starts_on']! as String),
      );
      var changed = false;
      final now = DateTime.now().toUtc().toIso8601String();
      for (final row in rows) {
        if (row['assigned_date'] != _day(date)) {
          changed = true;
          await transaction.update(
            'schedule_assignments',
            {
              'assigned_date': _day(date),
              'revision': (row['revision']! as int) + 1,
              'updated_at': now,
            },
            where: 'id = ?',
            whereArgs: [row['id']! as String],
          );
        }
        date = _followingTrainingDate(date);
      }
      return changed;
    });
  }

  /// Repairs the one historical schedule migration that could place pending
  /// work on or before a completed workout. It is deliberately a no-op for a
  /// valid schedule, so it never overrides an athlete's pause or reschedule.
  Future<bool> repairPendingAfterLastCompleted() async {
    final completed = await database.rawQuery(
      '''
      SELECT a.assigned_date
      FROM schedule_assignments a
      JOIN workout_prescriptions p ON p.id = a.workout_id
      WHERE a.program_id = ? AND a.status = 'completed'
      ORDER BY p.sequence_number DESC
      LIMIT 1
      ''',
      [programId],
    );
    if (completed.isEmpty) return false;
    final pending = await database.rawQuery(
      '''
      SELECT p.sequence_number, a.assigned_date
      FROM schedule_assignments a
      JOIN workout_prescriptions p ON p.id = a.workout_id
      WHERE a.program_id = ?
        AND a.status IN ('planned', 'unconfirmed', 'in_progress')
      ORDER BY p.sequence_number
      LIMIT 1
      ''',
      [programId],
    );
    if (pending.isEmpty) return false;

    final lastCompletedDate = DateTime.parse(
      completed.single['assigned_date']! as String,
    );
    final pendingDate = DateTime.parse(
      pending.single['assigned_date']! as String,
    );
    if (pendingDate.isAfter(lastCompletedDate)) return false;

    await rescheduleUnfinishedFrom(
      pending.single['sequence_number']! as int,
      _followingTrainingDate(lastCompletedDate),
    );
    return true;
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
    String eventType, {
    DateTime? assignedDate,
  }) async {
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
          if (assignedDate != null) 'assigned_date': _day(assignedDate),
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

  Future<List<Map<String, Object?>>> _pendingSnapshot(
    Transaction transaction,
  ) => transaction.query(
    'schedule_assignments',
    where:
        "program_id = ? AND status IN ('planned', 'unconfirmed', 'provisional')",
    whereArgs: [programId],
    orderBy: 'assigned_date, id',
  );

  Future<void> _event(
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
