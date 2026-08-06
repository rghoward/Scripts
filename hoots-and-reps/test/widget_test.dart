import 'dart:convert';
import 'dart:io';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:hoots_and_reps/data/app_database.dart';
import 'package:hoots_and_reps/data/published_program_repository.dart';
import 'package:hoots_and_reps/main.dart';
import 'package:shared_preferences/shared_preferences.dart';
import 'package:sqflite_common_ffi/sqflite_ffi.dart';

void main() {
  const snapshotPath = 'assets/data/published_program_snapshot_v1.json';
  final snapshotBytes = Uint8List.fromList(
    File(snapshotPath).readAsBytesSync(),
  );
  var databaseNumber = 0;
  late String databasePath;
  test('app is configured to publish the complete twelve-week phase', () {
    expect(generatedPhaseWeeks, 12);
  });

  test('short standalone benchmarks include easy post-test volume', () {
    const run = WorkoutBenchmark(
      kind: WorkoutBenchmarkKind.runFourHundred,
      id: 'run',
    );
    const ski = WorkoutBenchmark(
      kind: WorkoutBenchmarkKind.skiSevenFifty,
      id: 'ski',
    );
    const longRow = WorkoutBenchmark(
      kind: WorkoutBenchmarkKind.rowTwoThousand,
      id: 'row',
    );
    const pairedRow = WorkoutBenchmark(
      kind: WorkoutBenchmarkKind.rowShortPower,
      id: 'paired-row',
    );

    expect(run.postTestAerobic?.recoveryMinutes, 8);
    expect(run.postTestAerobic?.prescription, contains('2,000 meters'));
    expect(ski.postTestAerobic?.recoveryMinutes, 6);
    expect(ski.postTestAerobic?.prescription, contains('1,500 meters'));
    expect(pairedRow.postTestAerobic?.recoveryMinutes, 0);
    expect(pairedRow.postTestAerobic?.prescription, contains('Row 6:00'));
    expect(longRow.postTestAerobic, isNull);
  });

  test('every benchmark entry flow normalizes its saved result', () {
    Map<String, double> normalize(
      WorkoutBenchmarkKind kind,
      List<num> values,
    ) => WorkoutBenchmark(kind: kind, id: kind.name).normalizeResults(values);

    expect(normalize(WorkoutBenchmarkKind.rowShortPower, [40, 105]), {
      'row_200_split_seconds': 100,
      'row_500_split_seconds': 105,
    });
    expect(normalize(WorkoutBenchmarkKind.rowTwoThousand, [440]), {
      'row_2000_split_seconds': 110,
    });
    expect(normalize(WorkoutBenchmarkKind.gymnasticsScreen, [8, 30, 0, 12]), {
      'strict_pullups_reps': 8,
      'pushups_reps': 30,
      'toes_to_bar_reps': 0,
      'double_unders_reps': 12,
    });
    expect(normalize(WorkoutBenchmarkKind.runFourHundred, [82]), {
      'run_400_seconds': 82,
    });
    expect(normalize(WorkoutBenchmarkKind.skiSevenFifty, [180]), {
      'ski_750_split_seconds': 120,
    });
    expect(normalize(WorkoutBenchmarkKind.runMile, [430]), {
      'run_mile_seconds': 430,
    });
    expect(normalize(WorkoutBenchmarkKind.bikeTenMinute, [137]), {
      'bike_10min_calories': 137,
    });
  });

  test('partial benchmark values are not treated as completed', () {
    const pairedRow = WorkoutBenchmark(
      kind: WorkoutBenchmarkKind.rowShortPower,
      id: 'row',
    );
    expect(
      pairedRow.hasCompleteResult({'row_200_split_seconds': 100}),
      isFalse,
    );
    expect(
      pairedRow.hasCompleteResult({
        'row_200_split_seconds': 100,
        'row_500_split_seconds': 105,
      }),
      isTrue,
    );
  });

  setUp(() async {
    sqfliteFfiInit();
    databasePath =
        '${Directory.systemTemp.path}/hoots_widget_${databaseNumber++}.db';
    await AppDatabase.openForTesting(
      databaseFactoryFfi,
      databasePath: databasePath,
    );
    await PublishedProgramRepository(
      await AppDatabase.open(),
    ).publishBundled(utf8.decode(snapshotBytes));
    TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
        .setMockMessageHandler('flutter/assets', (message) async {
          final path = utf8.decode(
            message!.buffer.asUint8List(
              message.offsetInBytes,
              message.lengthInBytes,
            ),
          );
          return path == snapshotPath
              ? ByteData.sublistView(snapshotBytes)
              : null;
        });
  });

  tearDown(() async {
    TestDefaultBinaryMessengerBinding.instance.defaultBinaryMessenger
        .setMockMessageHandler('flutter/assets', null);
    await AppDatabase.close();
    await databaseFactoryFfi.deleteDatabase(databasePath);
  });

  Future<void> settleDatabaseStartup(WidgetTester tester) async {
    for (var attempt = 0; attempt < 20; attempt++) {
      await tester.runAsync(
        () => Future<void>.delayed(const Duration(milliseconds: 100)),
      );
      await tester.pump();
      if (find.byType(CircularProgressIndicator).evaluate().isEmpty) return;
    }
    fail('App startup did not settle.');
  }

  testWidgets('loads core training, profile, and Chronicle flows', (
    tester,
  ) async {
    SharedPreferences.setMockInitialValues({
      'music_enabled': false,
      'conditioning_results_v1':
          '[{"workout_sequence":2,"template_id":"amrap_2","variant":"full","score_schema":"amrap","values":{"rounds":3,"reps":11},"recorded_at":"2026-08-04T12:00:00.000Z","interval_splits":[]}]',
    });
    await tester.pumpWidget(const HootsApp());
    await settleDatabaseStartup(tester);
    await tester.pumpAndSettle();

    if (find.text('SET UP YOUR QUEST').evaluate().isNotEmpty) {
      await tester.tap(find.text('CONTINUE'));
      await tester.pumpAndSettle();
      await tester.tap(find.text('CONTINUE'));
      await tester.pumpAndSettle();
      await tester.tap(find.text('FINISH SETUP'));
      await tester.pumpAndSettle();
      await tester.runAsync(
        () => Future<void>.delayed(const Duration(milliseconds: 100)),
      );
      await tester.pump();
    }

    expect(find.text('✦  HOOTS & REPS'), findsOneWidget);
    expect(find.text("TODAY'S QUEST"), findsOneWidget);

    await tester.tap(find.text('Profile'));
    await tester.pumpAndSettle();
    expect(find.text('ATHLETE PROFILE'), findsOneWidget);
    await tester.tap(find.text('EDIT PRs & TRAINING MAXES'));
    await tester.pumpAndSettle();
    expect(find.text('STRENGTH RECORDS'), findsOneWidget);
    expect(find.text('BACK SQUAT'), findsOneWidget);
    await tester.pageBack();
    await tester.pumpAndSettle();

    await tester.tap(find.text('Chronicle'));
    await tester.pumpAndSettle();

    expect(find.text('RESULTS CHRONICLE'), findsOneWidget);
    expect(find.text('3 rds + 11 reps'), findsOneWidget);
    await tester.tap(find.text('3 rds + 11 reps'));
    await tester.pumpAndSettle();
    expect(find.textContaining('AMRAP • FULL'), findsOneWidget);
    expect(find.text('OPEN WORKOUT'), findsOneWidget);
  });
}
