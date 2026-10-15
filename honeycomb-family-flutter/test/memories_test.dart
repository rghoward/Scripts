import 'package:flutter_test/flutter_test.dart';
import 'package:honeycomb_family_native/core/memories.dart';

void main() {
  test('builds a separate adaptive memory for each child', () {
    final today = DateTime(2026, 9, 21);
    final records = [
      for (final child in ['one', 'two']) ...[
        MemoryRecord(
          childId: child,
          momentId: '$child-a',
          filename: '/$child-a.jpg',
          day: DateTime(2026, 6, 22),
          hasPerson: true,
        ),
        MemoryRecord(
          childId: child,
          momentId: '$child-b',
          filename: '/$child-b.jpg',
          day: DateTime(2026, 6, 23),
          hasPerson: true,
        ),
        MemoryRecord(
          childId: child,
          momentId: '$child-c',
          filename: '/$child-c.jpg',
          day: DateTime(2026, 6, 24),
          hasPerson: true,
        ),
      ],
    ];

    final suggestions = buildMemorySuggestions(records, today);

    expect(suggestions, hasLength(2));
    expect(
      suggestions.map((item) => item.childId),
      containsAll(['one', 'two']),
    );
    expect(suggestions.every((item) => item.records.isNotEmpty), isTrue);
  });

  test('derives a gentle theme from local image labels', () {
    expect(
      visualThemeFor(labels: const ['Drawing', 'Child'], text: ''),
      'Creative days',
    );
    expect(visualThemeFor(labels: const ['Plant'], text: ''), 'Outdoor days');
  });

  test('does not reuse excluded photo clusters', () {
    final records = [
      for (var day = 18; day <= 27; day++)
        MemoryRecord(
          childId: 'one',
          momentId: 'm$day',
          filename: '/m$day.jpg',
          day: DateTime(2025, 9, day),
          hasPerson: true,
        ),
    ];
    final first = buildMemorySuggestions(records, DateTime(2026, 9, 24));
    final blocked = first
        .expand((story) => story.records)
        .map((record) => record.key)
        .toSet();
    final second = buildMemorySuggestions(
      records,
      DateTime(2026, 9, 25),
      excluded: blocked,
    );

    final selected = second
        .expand((story) => story.records)
        .map((record) => record.key)
        .toSet();
    expect(selected.intersection(blocked), isEmpty);
  });

  test(
    'then and now pairs a current photo with one at least three months old',
    () {
      final today = DateTime(2026, 9, 24);
      final records = [
        MemoryRecord(
          childId: 'nico',
          momentId: 'then',
          filename: '/then.jpg',
          day: DateTime(2026, 6, 26),
          hasPerson: true,
        ),
        MemoryRecord(
          childId: 'nico',
          momentId: 'now',
          filename: '/now.jpg',
          day: DateTime(2026, 9, 22),
          hasPerson: true,
        ),
      ];

      final suggestion = buildMemorySuggestions(
        records,
        today,
        forceKind: MemoryKind.thenAndNow,
      ).single;

      expect(suggestion.records, hasLength(2));
      expect(
        today.difference(suggestion.records.first.day).inDays,
        greaterThanOrEqualTo(90),
      );
      expect(
        today.difference(suggestion.records.last.day).inDays,
        lessThanOrEqualTo(14),
      );
    },
  );

  test('keeps classroom reminder graphics out of memories', () {
    expect(
      usableMemoryPhoto(
        MemoryRecord(
          childId: 'one',
          momentId: 'reminder',
          filename: '/reminder.jpg',
          day: DateTime(2025, 9, 1),
          caption: 'Reminder: bring wipes',
        ),
      ),
      isFalse,
    );
  });

  test('every memory format works independently for both children', () {
    final today = DateTime(2026, 9, 26);
    final records = <MemoryRecord>[];
    for (final child in ['nico', 'sofia']) {
      MemoryRecord photo(
        String suffix,
        DateTime day, {
        String lesson = '',
        List<String> labels = const ['Drawing'],
      }) => MemoryRecord(
        childId: child,
        momentId: '$child-$suffix',
        filename: '/$child-$suffix.jpg',
        day: day,
        lesson: lesson,
        labels: labels,
        hasPerson: true,
      );

      records.addAll([
        // The original school-week cluster also provides a real historical
        // date match rather than relying on a synthetic fallback.
        photo('first-1', DateTime(2024, 9, 24), lesson: 'Music'),
        photo('first-2', DateTime(2024, 9, 25), lesson: 'Music'),
        photo('first-3', DateTime(2024, 10, 3), lesson: 'Music'),
        // Same season in a subsequent year and a repeated activity/theme.
        photo('season-1', DateTime(2025, 9, 23), lesson: 'Music'),
        photo('season-2', DateTime(2025, 9, 24), lesson: 'Music'),
        // A deliberately starred old photo plus a true current photo.
        photo('favorite', DateTime(2026, 6, 26), lesson: 'Painting'),
        photo('then', DateTime(2026, 6, 27), lesson: 'Painting'),
        photo('now', DateTime(2026, 9, 23), lesson: 'Painting'),
      ]);
    }
    final favorites = {'nico-favorite', 'sofia-favorite'};

    for (final kind in MemoryKind.values) {
      final suggestions = buildMemorySuggestions(
        records,
        today,
        favoriteMomentIds: favorites,
        forceKind: kind,
      );
      expect(
        suggestions.map((suggestion) => suggestion.childId),
        unorderedEquals(['nico', 'sofia']),
        reason: '${memoryKindTitle(kind)} should be available to both kids',
      );
      expect(
        suggestions.every((suggestion) => suggestion.kind == kind),
        isTrue,
      );
      expect(
        suggestions.every((suggestion) => suggestion.records.isNotEmpty),
        isTrue,
      );
    }

    final classroom = buildMemorySuggestions(
      records,
      today,
      forceKind: MemoryKind.classroomChapter,
    );
    expect(
      classroom.every(
        (story) =>
            story.records.map((record) => record.lesson).toSet().length == 1,
      ),
      isTrue,
    );
    expect(
      classroom.every(
        (story) =>
            story.records.map((record) => record.day).toSet().length >= 2,
      ),
      isTrue,
    );

    final seasonal = buildMemorySuggestions(
      records,
      today,
      forceKind: MemoryKind.seasonalReturn,
    );
    expect(
      seasonal.every(
        (story) => story.records.every(
          (record) =>
              record.day.month == today.month && record.day.year < today.year,
        ),
      ),
      isTrue,
    );
  });
}
