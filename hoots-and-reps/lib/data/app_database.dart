import 'package:path/path.dart' as path;
import 'package:shared_preferences/shared_preferences.dart';
import 'package:sqflite/sqflite.dart';

/// Local source of truth for durable athlete, programming, and schedule data.
///
/// SharedPreferences remains suitable for display preferences, but durable
/// history belongs here. Every cloud-synchronized row uses a client-generated
/// text ID so it can later map directly to a PostgreSQL UUID without changing
/// its identity.
class AppDatabase {
  AppDatabase._();

  static const databaseName = 'hoots_and_reps.db';
  static const schemaVersion = 3;
  static Database? _instance;

  static Future<Database> open() async {
    if (_instance case final database?) return database;
    final root = await getDatabasesPath();
    return _instance = await openDatabase(
      path.join(root, databaseName),
      version: schemaVersion,
      onConfigure: (database) async {
        await database.execute('PRAGMA foreign_keys = ON');
      },
      onCreate: (database, version) async {
        await database.transaction((transaction) async {
          for (final statement in [...schemaV1, ...schemaV2, ...schemaV3]) {
            await transaction.execute(statement);
          }
        });
      },
      onUpgrade: (database, oldVersion, newVersion) async {
        if (oldVersion < 2) {
          for (final statement in schemaV2) {
            await database.execute(statement);
          }
        }
        if (oldVersion < 3) {
          for (final statement in schemaV3) {
            await database.execute(statement);
          }
        }
      },
    );
  }

  static Future<Database> openForTesting(
    DatabaseFactory factory, {
    String? databasePath,
  }) async {
    await close();
    return _instance = await factory.openDatabase(
      databasePath ?? inMemoryDatabasePath,
      options: OpenDatabaseOptions(
        version: schemaVersion,
        onConfigure: (database) async {
          await database.execute('PRAGMA foreign_keys = ON');
        },
        onCreate: (database, version) async {
          for (final statement in [...schemaV1, ...schemaV2, ...schemaV3]) {
            await database.execute(statement);
          }
        },
        onUpgrade: (database, oldVersion, newVersion) async {
          if (oldVersion < 2) {
            for (final statement in schemaV2) {
              await database.execute(statement);
            }
          }
        },
      ),
    );
  }

  static Future<void> close() async {
    await _instance?.close();
    _instance = null;
  }
}

/// Typed compatibility store backed by SQLite.
///
/// This lets the current UI move off SharedPreferences without coupling it to
/// the normalized scheduling repositories that will replace these keys as the
/// flexible scheduler is implemented.
class LocalStateStore {
  LocalStateStore(this.database);

  static const _migrationMarker = 'sqlite_state_migration_v1';
  final Database database;

  static Future<LocalStateStore> openAndMigrate(
    SharedPreferences preferences,
  ) async {
    final store = LocalStateStore(await AppDatabase.open());
    await store._migratePreferences(preferences);
    return store;
  }

  Future<void> _migratePreferences(SharedPreferences preferences) async {
    if (await getBool(_migrationMarker) == true) return;
    await database.transaction((transaction) async {
      for (final key in preferences.getKeys()) {
        final value = preferences.get(key);
        final encoded = switch (value) {
          String value => ('string', value),
          bool value => ('bool', value ? '1' : '0'),
          int value => ('int', '$value'),
          double value => ('double', '$value'),
          List<String> value => ('string_list', _encodeList(value)),
          _ => null,
        };
        if (encoded == null) continue;
        await transaction.insert('app_state', {
          'key': key,
          'value_type': encoded.$1,
          'value': encoded.$2,
          'updated_at': DateTime.now().toUtc().toIso8601String(),
        }, conflictAlgorithm: ConflictAlgorithm.ignore);
      }
      await transaction.insert('app_state', {
        'key': _migrationMarker,
        'value_type': 'bool',
        'value': '1',
        'updated_at': DateTime.now().toUtc().toIso8601String(),
      });
    });
  }

  static String _encodeList(List<String> value) => value.join('\u001f');
  static List<String> _decodeList(String value) =>
      value.isEmpty ? <String>[] : value.split('\u001f');

  Future<Map<String, Object?>?> _row(String key) => database
      .query(
        'app_state',
        columns: ['value_type', 'value'],
        where: 'key = ?',
        whereArgs: [key],
        limit: 1,
      )
      .then((rows) => rows.isEmpty ? null : rows.first);

  Future<String?> getString(String key) async {
    final row = await _row(key);
    return row?['value_type'] == 'string' ? row!['value'] as String : null;
  }

  Future<bool?> getBool(String key) async {
    final row = await _row(key);
    return row?['value_type'] == 'bool' ? row!['value'] == '1' : null;
  }

  Future<List<String>?> getStringList(String key) async {
    final row = await _row(key);
    return row?['value_type'] == 'string_list'
        ? _decodeList(row!['value'] as String)
        : null;
  }

  Future<bool> containsKey(String key) async => await _row(key) != null;

  Future<Set<String>> getKeys() async => {
    for (final row in await database.query('app_state', columns: ['key']))
      row['key']! as String,
  };

  Future<void> setString(String key, String value) =>
      _write(key, 'string', value);

  Future<void> setBool(String key, bool value) =>
      _write(key, 'bool', value ? '1' : '0');

  Future<void> setStringList(String key, List<String> value) =>
      _write(key, 'string_list', _encodeList(value));

  Future<void> _write(String key, String type, String value) =>
      database.insert('app_state', {
        'key': key,
        'value_type': type,
        'value': value,
        'updated_at': DateTime.now().toUtc().toIso8601String(),
      }, conflictAlgorithm: ConflictAlgorithm.replace);

  Future<void> remove(String key) async {
    await database.delete('app_state', where: 'key = ?', whereArgs: [key]);
  }
}

/// Version-one schema. Prescriptions and completed sessions are immutable;
/// schedule changes are append-only events that rebuild future assignments.
const schemaV1 = <String>[
  '''
  CREATE TABLE app_state (
    key TEXT PRIMARY KEY,
    value_type TEXT NOT NULL CHECK (value_type IN ('string', 'bool', 'int', 'double', 'string_list')),
    value TEXT NOT NULL,
    updated_at TEXT NOT NULL
  )
  ''',
  '''
  CREATE TABLE athlete_profiles (
    id TEXT PRIMARY KEY,
    display_name TEXT,
    weight_unit TEXT NOT NULL CHECK (weight_unit IN ('pounds', 'kilograms')),
    created_at TEXT NOT NULL,
    updated_at TEXT NOT NULL,
    cloud_updated_at TEXT,
    deleted_at TEXT
  )
  ''',
  '''
  CREATE TABLE programs (
    id TEXT PRIMARY KEY,
    athlete_id TEXT NOT NULL REFERENCES athlete_profiles(id),
    ruleset_version TEXT NOT NULL,
    title TEXT NOT NULL,
    starts_on TEXT NOT NULL,
    status TEXT NOT NULL CHECK (status IN ('draft', 'active', 'paused', 'complete', 'archived')),
    created_at TEXT NOT NULL,
    updated_at TEXT NOT NULL
  )
  ''',
  '''
  CREATE TABLE workout_prescriptions (
    id TEXT PRIMARY KEY,
    program_id TEXT NOT NULL REFERENCES programs(id),
    sequence_number INTEGER NOT NULL,
    prescription_signature TEXT NOT NULL,
    ruleset_version TEXT NOT NULL,
    prescription_json TEXT NOT NULL,
    created_at TEXT NOT NULL,
    UNIQUE(program_id, sequence_number),
    UNIQUE(program_id, prescription_signature)
  )
  ''',
  '''
  CREATE TABLE schedule_assignments (
    id TEXT PRIMARY KEY,
    program_id TEXT NOT NULL REFERENCES programs(id),
    workout_id TEXT REFERENCES workout_prescriptions(id),
    assigned_date TEXT NOT NULL,
    assignment_type TEXT NOT NULL CHECK (assignment_type IN ('workout', 'rest', 'recovery', 'away')),
    status TEXT NOT NULL CHECK (status IN ('planned', 'in_progress', 'unconfirmed', 'provisional', 'completed', 'skipped', 'cancelled')),
    provisional_from_assignment_id TEXT REFERENCES schedule_assignments(id),
    revision INTEGER NOT NULL DEFAULT 1,
    created_at TEXT NOT NULL,
    updated_at TEXT NOT NULL
  )
  ''',
  '''
  CREATE UNIQUE INDEX one_live_workout_assignment
  ON schedule_assignments(workout_id)
  WHERE workout_id IS NOT NULL AND status NOT IN ('cancelled', 'completed', 'skipped')
  ''',
  '''
  CREATE INDEX schedule_by_program_date
  ON schedule_assignments(program_id, assigned_date)
  ''',
  '''
  CREATE TABLE schedule_events (
    id TEXT PRIMARY KEY,
    program_id TEXT NOT NULL REFERENCES programs(id),
    assignment_id TEXT REFERENCES schedule_assignments(id),
    event_type TEXT NOT NULL CHECK (event_type IN ('assign', 'start', 'complete', 'partial', 'rollover', 'confirm_defer', 'pause', 'resume', 'skip', 'undo')),
    effective_date TEXT NOT NULL,
    prior_state_json TEXT,
    resulting_state_json TEXT NOT NULL,
    reverses_event_id TEXT REFERENCES schedule_events(id),
    created_at TEXT NOT NULL,
    sync_status TEXT NOT NULL DEFAULT 'pending' CHECK (sync_status IN ('pending', 'synced', 'conflict'))
  )
  ''',
  '''
  CREATE INDEX schedule_events_by_program_time
  ON schedule_events(program_id, created_at)
  ''',
  '''
  CREATE TABLE workout_sessions (
    id TEXT PRIMARY KEY,
    athlete_id TEXT NOT NULL REFERENCES athlete_profiles(id),
    workout_id TEXT NOT NULL REFERENCES workout_prescriptions(id),
    assignment_id TEXT REFERENCES schedule_assignments(id),
    performed_at TEXT NOT NULL,
    variant TEXT NOT NULL,
    completion_status TEXT NOT NULL CHECK (completion_status IN ('partial', 'complete')),
    actual_duration_minutes INTEGER,
    session_rpe REAL,
    result_json TEXT,
    feedback_json TEXT,
    created_at TEXT NOT NULL,
    updated_at TEXT NOT NULL
  )
  ''',
  '''
  CREATE TABLE section_results (
    id TEXT PRIMARY KEY,
    session_id TEXT NOT NULL REFERENCES workout_sessions(id) ON DELETE CASCADE,
    section_id TEXT NOT NULL,
    completed INTEGER NOT NULL CHECK (completed IN (0, 1)),
    performed_prescription_json TEXT,
    result_json TEXT,
    updated_at TEXT NOT NULL,
    UNIQUE(session_id, section_id)
  )
  ''',
  '''
  CREATE TABLE personal_record_history (
    id TEXT PRIMARY KEY,
    athlete_id TEXT NOT NULL REFERENCES athlete_profiles(id),
    movement_id TEXT NOT NULL,
    canonical_value_lb REAL NOT NULL CHECK (canonical_value_lb > 0),
    achieved_on TEXT NOT NULL,
    source TEXT NOT NULL CHECK (source IN ('tested', 'competition', 'estimated', 'imported')),
    note TEXT,
    created_at TEXT NOT NULL
  )
  ''',
  '''
  CREATE TABLE training_max_history (
    id TEXT PRIMARY KEY,
    athlete_id TEXT NOT NULL REFERENCES athlete_profiles(id),
    movement_id TEXT NOT NULL,
    canonical_value_lb REAL NOT NULL CHECK (canonical_value_lb > 0),
    effective_from TEXT NOT NULL,
    reason TEXT,
    created_at TEXT NOT NULL
  )
  ''',
  '''
  CREATE TABLE served_signatures (
    athlete_id TEXT NOT NULL REFERENCES athlete_profiles(id),
    prescription_signature TEXT NOT NULL,
    workout_id TEXT NOT NULL REFERENCES workout_prescriptions(id),
    served_at TEXT NOT NULL,
    PRIMARY KEY (athlete_id, prescription_signature)
  )
  ''',
  '''
  CREATE TABLE result_submissions (
    id TEXT PRIMARY KEY,
    session_id TEXT NOT NULL REFERENCES workout_sessions(id),
    workout_id TEXT NOT NULL REFERENCES workout_prescriptions(id),
    ruleset_version TEXT NOT NULL,
    prescription_signature TEXT NOT NULL,
    level_id TEXT NOT NULL CHECK (level_id IN ('level_1', 'level_2', 'level_3', 'custom')),
    category_id TEXT,
    score_schema TEXT NOT NULL,
    score_json TEXT NOT NULL,
    visibility TEXT NOT NULL CHECK (visibility IN ('private', 'friends', 'guild', 'public')),
    verification_status TEXT NOT NULL DEFAULT 'self_reported',
    submitted_at TEXT NOT NULL,
    sync_status TEXT NOT NULL DEFAULT 'pending' CHECK (sync_status IN ('pending', 'synced', 'rejected', 'conflict'))
  )
  ''',
  '''
  CREATE TABLE sync_outbox (
    id TEXT PRIMARY KEY,
    entity_type TEXT NOT NULL,
    entity_id TEXT NOT NULL,
    operation TEXT NOT NULL CHECK (operation IN ('insert', 'update', 'delete')),
    payload_json TEXT NOT NULL,
    created_at TEXT NOT NULL,
    attempt_count INTEGER NOT NULL DEFAULT 0,
    last_error TEXT
  )
  ''',
  '''
  CREATE INDEX pending_sync_operations
  ON sync_outbox(created_at, attempt_count)
  ''',
];

/// Version-two schema: benchmark results are immutable test events rather
/// than a single overwriteable snapshot.
const schemaV2 = <String>[
  '''
  CREATE TABLE benchmark_result_events (
    id TEXT PRIMARY KEY,
    benchmark_id TEXT NOT NULL,
    recorded_at TEXT NOT NULL,
    created_at TEXT NOT NULL,
    updated_at TEXT NOT NULL
  )
  ''',
  '''
  CREATE TABLE benchmark_result_values (
    event_id TEXT NOT NULL REFERENCES benchmark_result_events(id) ON DELETE CASCADE,
    metric_key TEXT NOT NULL,
    canonical_value REAL NOT NULL CHECK (canonical_value >= 0),
    PRIMARY KEY (event_id, metric_key)
  )
  ''',
  '''
  CREATE INDEX benchmark_values_by_metric
  ON benchmark_result_values(metric_key)
  ''',
  '''
  CREATE INDEX benchmark_events_by_time
  ON benchmark_result_events(recorded_at DESC, created_at DESC)
  ''',
];

/// Version-three schema: published prescriptions and any athlete-local
/// resolution are separate. The signed/reviewed snapshot is immutable; local
/// transformations are append-only and never rewrite completed work.
const schemaV3 = <String>[
  '''
  CREATE TABLE published_program_snapshots (
    id TEXT PRIMARY KEY,
    version INTEGER NOT NULL,
    published_at TEXT NOT NULL,
    source TEXT NOT NULL CHECK (source IN ('bundled', 'downloaded')),
    snapshot_json TEXT NOT NULL,
    activated_at TEXT NOT NULL,
    superseded_at TEXT,
    rationale TEXT NOT NULL
  )
  ''',
  '''
  CREATE UNIQUE INDEX one_active_published_snapshot
  ON published_program_snapshots((1))
  WHERE superseded_at IS NULL
  ''',
  '''
  CREATE TABLE published_snapshot_transformations (
    id TEXT PRIMARY KEY,
    snapshot_id TEXT NOT NULL REFERENCES published_program_snapshots(id),
    workout_sequence INTEGER,
    transformation_type TEXT NOT NULL CHECK (transformation_type IN ('benchmark_reference', 'movement_swap', 'profile_setting', 'load_rounding', 'equipment_regression', 'restriction_regression')),
    reason TEXT NOT NULL,
    payload_json TEXT NOT NULL,
    created_at TEXT NOT NULL
  )
  ''',
  '''
  CREATE INDEX snapshot_transformations_by_workout
  ON published_snapshot_transformations(snapshot_id, workout_sequence, created_at)
  ''',
];
