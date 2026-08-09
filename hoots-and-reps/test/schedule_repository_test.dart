import 'package:flutter_test/flutter_test.dart';
import 'package:hoots_and_reps/data/app_database.dart';
import 'package:hoots_and_reps/data/schedule_repository.dart';
import 'package:sqflite_common_ffi/sqflite_ffi.dart';

void main() {
  late ScheduleRepository repository;

  setUp(() async {
    sqfliteFfiInit();
    final database = await AppDatabase.openForTesting(databaseFactoryFfi);
    repository = ScheduleRepository(database);
    await repository.initialize(
      startsOn: DateTime(2026, 7, 27),
      prescriptionSignatures: List.generate(48, (index) => 'signature-$index'),
    );
  });

  tearDown(AppDatabase.close);

  test('seeds all workouts independently from calendar dates', () async {
    final assignments = await repository.assignments();
    expect(assignments, hasLength(48));
    expect(assignments.first.sequence, 1);
    expect(assignments.first.date, DateTime(2026, 7, 27));
    expect(assignments[4].date, DateTime(2026, 8, 3));
  });

  test('pause and undo restore pending calendar assignments', () async {
    final before = await repository.assignments();
    await repository.pauseUntil(DateTime(2026, 8, 10));
    expect((await repository.assignments()).first.date, DateTime(2026, 8, 10));
    expect((await repository.pauseState())!.returnOn, DateTime(2026, 8, 10));

    expect(await repository.undoLastScheduleChange(), isTrue);
    expect((await repository.assignments()).first.date, before.first.date);
    expect(await repository.pauseState(), isNull);
  });

  test(
    'early resume reflows unfinished work and clears vacation state',
    () async {
      final before = await repository.assignments();
      await repository.complete(before.first.assignmentId);
      await repository.pauseUntil(DateTime(2026, 8, 17));
      await repository.resumeEarly(DateTime(2026, 8, 6));
      final after = await repository.assignments();

      expect(after.first.status, ScheduleStatus.completed);
      expect(after.first.date, DateTime(2026, 7, 27));
      expect(after[1].date, DateTime(2026, 8, 6));
      expect(await repository.pauseState(), isNull);
    },
  );

  test('changing the return date keeps the original pause start', () async {
    await repository.pauseUntil(DateTime(2026, 8, 17));
    final started = (await repository.pauseState())!.startedOn;
    await repository.pauseUntil(DateTime(2026, 8, 10));
    final changed = await repository.pauseState();

    expect(changed!.startedOn, started);
    expect(changed.returnOn, DateTime(2026, 8, 10));
    expect((await repository.assignments()).first.date, DateTime(2026, 8, 10));
  });

  test(
    'past untouched workouts become unconfirmed rather than skipped',
    () async {
      await repository.markPastUnresolved(DateTime(2026, 7, 29));
      final assignments = await repository.assignments();
      expect(assignments.first.status, ScheduleStatus.unconfirmed);
      expect(assignments[1].status, ScheduleStatus.unconfirmed);
      expect(assignments[2].status, ScheduleStatus.planned);
    },
  );
}
