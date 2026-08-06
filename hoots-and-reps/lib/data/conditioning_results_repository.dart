import 'dart:convert';

import 'app_database.dart';

/// The score structure determines which athlete-entered values are meaningful.
/// It intentionally stays separate from leaderboard comparison rules.
enum ConditioningScoreSchema {
  forTime,
  cappedForTime,
  amrap,
  intervals,
  totalWork,
}

class ConditioningResult {
  const ConditioningResult({
    required this.workoutSequence,
    required this.templateId,
    required this.variant,
    required this.schema,
    required this.values,
    required this.recordedAt,
    this.intervalSplits = const [],
    this.workUnit,
    this.prescriptionLabel,
    this.prescription,
    this.note,
  });

  final int workoutSequence;
  final String templateId;
  final String variant;
  final ConditioningScoreSchema schema;
  final Map<String, double> values;
  final DateTime recordedAt;
  final List<double> intervalSplits;
  final String? workUnit;
  final String? prescriptionLabel;
  final String? prescription;
  final String? note;

  String get summary => switch (schema) {
    ConditioningScoreSchema.forTime =>
      'Time ${_clock(values['finish_seconds'] ?? 0)}',
    ConditioningScoreSchema.cappedForTime =>
      'Capped • ${_whole(values['completed_rounds'] ?? 0)} rds + '
          '${_whole(values['completed_reps'] ?? 0)} reps',
    ConditioningScoreSchema.amrap =>
      '${_whole(values['rounds'] ?? 0)} rds + ${_whole(values['reps'] ?? 0)} reps',
    ConditioningScoreSchema.intervals =>
      '${intervalSplits.length} splits • ${_whole(intervalSplits.fold(0, (sum, value) => sum + value))} ${workUnit ?? 'work'}',
    ConditioningScoreSchema.totalWork =>
      '${_whole(values['work_completed'] ?? 0)} ${workUnit ?? 'work'}',
  };

  static String _whole(double value) => value == value.roundToDouble()
      ? value.round().toString()
      : value.toStringAsFixed(1);

  static String _clock(double seconds) {
    final minutes = seconds ~/ 60;
    final remainder = seconds - minutes * 60;
    return '$minutes:${remainder.toStringAsFixed(1).padLeft(4, '0')}';
  }

  Map<String, Object?> encode() => {
    'workout_sequence': workoutSequence,
    'template_id': templateId,
    'variant': variant,
    'score_schema': schema.name,
    'values': values,
    'recorded_at': recordedAt.toUtc().toIso8601String(),
    'interval_splits': intervalSplits,
    if (workUnit != null) 'work_unit': workUnit,
    if (prescriptionLabel != null) 'prescription_label': prescriptionLabel,
    if (prescription != null) 'prescription': prescription,
    if (note?.trim().isNotEmpty ?? false) 'note': note!.trim(),
  };

  static ConditioningResult? decode(Object? raw) {
    if (raw is! Map) return null;
    final sequence = raw['workout_sequence'];
    final template = raw['template_id'];
    final variant = raw['variant'];
    final schemaName = raw['score_schema'];
    final recordedAt = raw['recorded_at'];
    if (sequence is! num ||
        template is! String ||
        variant is! String ||
        schemaName is! String ||
        recordedAt is! String) {
      return null;
    }
    ConditioningScoreSchema? schema;
    for (final candidate in ConditioningScoreSchema.values) {
      if (candidate.name == schemaName) {
        schema = candidate;
        break;
      }
    }
    final timestamp = DateTime.tryParse(recordedAt);
    if (schema == null || timestamp == null) return null;
    final values = <String, double>{
      for (final entry in (raw['values'] as Map? ?? {}).entries)
        if (entry.value is num)
          entry.key.toString(): (entry.value as num).toDouble(),
    };
    final splits = [
      for (final value in (raw['interval_splits'] as List? ?? const []))
        if (value is num) value.toDouble(),
    ];
    if (!isValid(schema, values, intervalSplits: splits)) return null;
    return ConditioningResult(
      workoutSequence: sequence.toInt(),
      templateId: template,
      variant: variant,
      schema: schema,
      values: values,
      recordedAt: timestamp,
      intervalSplits: splits,
      workUnit: raw['work_unit'] as String?,
      prescriptionLabel: raw['prescription_label'] as String?,
      prescription: raw['prescription'] as String?,
      note: raw['note'] as String?,
    );
  }

  static bool isValid(
    ConditioningScoreSchema schema,
    Map<String, double> values, {
    List<double> intervalSplits = const [],
  }) {
    bool nonNegative(String key) => (values[key] ?? -1) >= 0;
    return switch (schema) {
      ConditioningScoreSchema.forTime => (values['finish_seconds'] ?? 0) > 0,
      ConditioningScoreSchema.cappedForTime =>
        nonNegative('completed_rounds') && nonNegative('completed_reps'),
      ConditioningScoreSchema.amrap =>
        nonNegative('rounds') && nonNegative('reps'),
      ConditioningScoreSchema.intervals =>
        intervalSplits.isNotEmpty &&
            intervalSplits.every((value) => value >= 0),
      ConditioningScoreSchema.totalWork => (values['work_completed'] ?? 0) > 0,
    };
  }
}

/// Local, editable conditioning-result snapshot for each served workout.
/// Remote submissions and leaderboard identity remain future backend work.
class ConditioningResultsRepository {
  ConditioningResultsRepository(this._store);

  static const storageKey = 'conditioning_results_v1';
  final LocalStateStore _store;

  Future<Map<int, ConditioningResult>> load() async {
    final encoded = await _store.getString(storageKey);
    if (encoded == null) return {};
    try {
      final decoded = jsonDecode(encoded);
      if (decoded is! List) return {};
      final results = <int, ConditioningResult>{};
      for (final item in decoded) {
        final result = ConditioningResult.decode(item);
        if (result != null) results[result.workoutSequence] = result;
      }
      return results;
    } on FormatException {
      return {};
    }
  }

  Future<void> save(ConditioningResult result) async {
    if (!ConditioningResult.isValid(
      result.schema,
      result.values,
      intervalSplits: result.intervalSplits,
    )) {
      throw ArgumentError.value(
        result.values,
        'result',
        'Invalid score values',
      );
    }
    final all = await load();
    all[result.workoutSequence] = result;
    final ordered = all.values.toList()
      ..sort((a, b) => a.workoutSequence.compareTo(b.workoutSequence));
    await _store.setString(
      storageKey,
      jsonEncode(ordered.map((item) => item.encode()).toList()),
    );
  }
}
