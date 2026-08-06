import 'dart:convert';

import 'package:sqflite/sqflite.dart';

class PublishedProgramSnapshot {
  const PublishedProgramSnapshot({
    required this.id,
    required this.version,
    required this.publishedAt,
    required this.snapshotJson,
  });

  final String id;
  final int version;
  final DateTime publishedAt;
  final String snapshotJson;
}

class SnapshotTransformation {
  const SnapshotTransformation({
    required this.type,
    required this.reason,
    required this.payload,
    this.workoutSequence,
  });

  final String type;
  final String reason;
  final Map<String, Object?> payload;
  final int? workoutSequence;
}

/// Durable local cache for immutable reviewed prescriptions and the separate,
/// explainable choices made on the athlete's device.
class PublishedProgramRepository {
  PublishedProgramRepository(this.database);

  final Database database;

  Future<PublishedProgramSnapshot?> active() async {
    final rows = await database.query(
      'published_program_snapshots',
      where: 'superseded_at IS NULL',
      orderBy: 'activated_at DESC',
      limit: 1,
    );
    if (rows.isEmpty) return null;
    final row = rows.single;
    return PublishedProgramSnapshot(
      id: row['id']! as String,
      version: row['version']! as int,
      publishedAt: DateTime.parse(row['published_at']! as String),
      snapshotJson: row['snapshot_json']! as String,
    );
  }

  Future<PublishedProgramSnapshot> publishBundled(String snapshotJson) async {
    final raw = jsonDecode(snapshotJson) as Map<String, dynamic>;
    final id = raw['snapshot_id']! as String;
    final version = raw['version']! as int;
    final publishedAt = raw['published_at']! as String;
    final existing = await active();
    if (existing?.id == id) return existing!;
    final now = DateTime.now().toUtc().toIso8601String();
    await database.transaction((transaction) async {
      await transaction.update('published_program_snapshots', {
        'superseded_at': now,
      }, where: 'superseded_at IS NULL');
      await transaction.insert('published_program_snapshots', {
        'id': id,
        'version': version,
        'published_at': publishedAt,
        'source': 'bundled',
        'snapshot_json': snapshotJson,
        'activated_at': now,
        'superseded_at': null,
        'rationale': 'Bundled reviewed phase installed locally.',
      });
    });
    return PublishedProgramSnapshot(
      id: id,
      version: version,
      publishedAt: DateTime.parse(publishedAt),
      snapshotJson: snapshotJson,
    );
  }

  Future<void> record(SnapshotTransformation value) async {
    final snapshot = await active();
    if (snapshot == null) throw StateError('No active published snapshot.');
    final now = DateTime.now().toUtc().toIso8601String();
    await database.insert('published_snapshot_transformations', {
      'id':
          'snapshot-change-${now.replaceAll(RegExp(r'[^0-9]'), '')}-${value.type}',
      'snapshot_id': snapshot.id,
      'workout_sequence': value.workoutSequence,
      'transformation_type': value.type,
      'reason': value.reason,
      'payload_json': jsonEncode(value.payload),
      'created_at': now,
    });
  }

  Future<List<SnapshotTransformation>> transformations() async {
    final snapshot = await active();
    if (snapshot == null) return const [];
    final rows = await database.query(
      'published_snapshot_transformations',
      where: 'snapshot_id = ?',
      whereArgs: [snapshot.id],
      orderBy: 'created_at',
    );
    return rows
        .map(
          (row) => SnapshotTransformation(
            type: row['transformation_type']! as String,
            reason: row['reason']! as String,
            payload: (jsonDecode(row['payload_json']! as String) as Map)
                .cast<String, Object?>(),
            workoutSequence: row['workout_sequence'] as int?,
          ),
        )
        .toList(growable: false);
  }
}
