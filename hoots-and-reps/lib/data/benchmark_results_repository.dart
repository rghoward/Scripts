import 'dart:convert';

import 'package:sqflite/sqflite.dart';

import 'app_database.dart';

class BenchmarkResultsRepository {
  const BenchmarkResultsRepository(this.store);

  static const storageKey = 'benchmark_results_v1';

  final LocalStateStore store;

  /// The most recently recorded value for each metric drives prescriptions.
  Future<Map<String, double>> load() async {
    await _migrateLegacySnapshot();
    final rows = await store.database.rawQuery('''
      SELECT result_values.metric_key, result_values.canonical_value
      FROM benchmark_result_values result_values
      INNER JOIN benchmark_result_events events ON events.id = result_values.event_id
      ORDER BY events.recorded_at DESC, events.created_at DESC
    ''');
    final values = <String, double>{};
    for (final row in rows) {
      values.putIfAbsent(
        row['metric_key']! as String,
        () => (row['canonical_value']! as num).toDouble(),
      );
    }
    return values;
  }

  Future<List<BenchmarkResultEvent>> history() async {
    await _migrateLegacySnapshot();
    final rows = await store.database.rawQuery('''
      SELECT events.id, events.benchmark_id, events.recorded_at,
             result_values.metric_key, result_values.canonical_value
      FROM benchmark_result_events events
      INNER JOIN benchmark_result_values result_values ON result_values.event_id = events.id
      ORDER BY events.recorded_at DESC, events.created_at DESC, result_values.metric_key ASC
    ''');
    final events = <String, _EventBuilder>{};
    for (final row in rows) {
      final id = row['id']! as String;
      final event = events.putIfAbsent(
        id,
        () => _EventBuilder(
          id: id,
          benchmarkId: row['benchmark_id']! as String,
          recordedAt: DateTime.parse(row['recorded_at']! as String).toLocal(),
        ),
      );
      event.values[row['metric_key']! as String] =
          (row['canonical_value']! as num).toDouble();
    }
    return events.values.map((event) => event.build()).toList();
  }

  Future<void> record(
    String benchmarkId,
    Map<String, double> values, {
    DateTime? recordedAt,
  }) => _writeEvent(
    BenchmarkResultEvent(
      id: 'benchmark-${DateTime.now().microsecondsSinceEpoch}',
      benchmarkId: benchmarkId,
      recordedAt: recordedAt ?? DateTime.now(),
      values: values,
    ),
  );

  /// A normal cycle-entry test is corrected in place. Deliberate retests use
  /// [record] so the athlete retains a chronological comparison.
  Future<void> recordOrUpdateCurrent(
    String benchmarkId,
    Map<String, double> values,
  ) async {
    final current = (await history())
        .where((event) => event.benchmarkId == benchmarkId)
        .firstOrNull;
    if (current == null) {
      await record(benchmarkId, values);
      return;
    }
    await update(
      BenchmarkResultEvent(
        id: current.id,
        benchmarkId: benchmarkId,
        recordedAt: current.recordedAt,
        values: values,
      ),
    );
  }

  Future<void> update(BenchmarkResultEvent event) async {
    await _migrateLegacySnapshot();
    await store.database.transaction((transaction) async {
      await transaction.update(
        'benchmark_result_events',
        {
          'benchmark_id': event.benchmarkId,
          'recorded_at': event.recordedAt.toUtc().toIso8601String(),
          'updated_at': DateTime.now().toUtc().toIso8601String(),
        },
        where: 'id = ?',
        whereArgs: [event.id],
      );
      await transaction.delete(
        'benchmark_result_values',
        where: 'event_id = ?',
        whereArgs: [event.id],
      );
      for (final value in event.values.entries) {
        await transaction.insert('benchmark_result_values', {
          'event_id': event.id,
          'metric_key': value.key,
          'canonical_value': value.value,
        });
      }
    });
  }

  /// Compatibility entry point for callers written before history existed.
  Future<void> save(Map<String, double> values) =>
      record('legacy_import', values);

  Future<void> _writeEvent(BenchmarkResultEvent event) async {
    await _migrateLegacySnapshot();
    await store.database.transaction((transaction) async {
      final now = DateTime.now().toUtc().toIso8601String();
      await transaction.insert('benchmark_result_events', {
        'id': event.id,
        'benchmark_id': event.benchmarkId,
        'recorded_at': event.recordedAt.toUtc().toIso8601String(),
        'created_at': now,
        'updated_at': now,
      });
      for (final value in event.values.entries) {
        await transaction.insert('benchmark_result_values', {
          'event_id': event.id,
          'metric_key': value.key,
          'canonical_value': value.value,
        });
      }
    });
  }

  Future<void> _migrateLegacySnapshot() async {
    final encoded = await store.getString(storageKey);
    if (encoded == null) return;
    final decoded = jsonDecode(encoded);
    if (decoded is! Map<String, dynamic>) return;
    final values = {
      for (final entry in decoded.entries)
        if (entry.value is num) entry.key: (entry.value as num).toDouble(),
    };
    if (values.isEmpty) return;
    final count = Sqflite.firstIntValue(
      await store.database.rawQuery(
        'SELECT COUNT(*) FROM benchmark_result_events',
      ),
    );
    if (count != 0) return;
    await _writeLegacyEvent(values);
  }

  Future<void> _writeLegacyEvent(Map<String, double> values) async {
    final now = DateTime.now();
    final id = 'legacy-${now.microsecondsSinceEpoch}';
    final timestamp = now.toUtc().toIso8601String();
    await store.database.transaction((transaction) async {
      await transaction.insert('benchmark_result_events', {
        'id': id,
        'benchmark_id': 'legacy_import',
        'recorded_at': timestamp,
        'created_at': timestamp,
        'updated_at': timestamp,
      });
      for (final value in values.entries) {
        await transaction.insert('benchmark_result_values', {
          'event_id': id,
          'metric_key': value.key,
          'canonical_value': value.value,
        });
      }
    });
  }
}

class BenchmarkResultEvent {
  const BenchmarkResultEvent({
    required this.id,
    required this.benchmarkId,
    required this.recordedAt,
    required this.values,
  });

  final String id;
  final String benchmarkId;
  final DateTime recordedAt;
  final Map<String, double> values;
}

class _EventBuilder {
  _EventBuilder({
    required this.id,
    required this.benchmarkId,
    required this.recordedAt,
  });

  final String id;
  final String benchmarkId;
  final DateTime recordedAt;
  final values = <String, double>{};

  BenchmarkResultEvent build() => BenchmarkResultEvent(
    id: id,
    benchmarkId: benchmarkId,
    recordedAt: recordedAt,
    values: Map.unmodifiable(values),
  );
}
