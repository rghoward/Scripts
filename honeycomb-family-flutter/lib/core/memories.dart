/// Lightweight, private metadata used to build Honeycomb Memories.
///
/// No image bytes are copied here: photos remain protected by the existing
/// authenticated Honeycomb image loader and the normal Flutter image cache.
class MemoryRecord {
  const MemoryRecord({
    required this.childId,
    required this.momentId,
    required this.filename,
    required this.day,
    this.lesson = '',
    this.caption = '',
    this.labels = const [],
    this.analyzed = false,
    this.hasPerson = false,
    this.personChecked = false,
    this.personAnalysisVersion = 0,
  });

  final String childId;
  final String momentId;
  final String filename;
  final DateTime day;
  final String lesson;
  final String caption;
  final List<String> labels;
  final bool analyzed;
  final bool hasPerson;
  final bool personChecked;
  final int personAnalysisVersion;

  String get key => '$childId:$momentId';

  Map<String, dynamic> toJson() => {
    'childId': childId,
    'momentId': momentId,
    'filename': filename,
    'day': day.toIso8601String(),
    'lesson': lesson,
    'caption': caption,
    'labels': labels,
    'analyzed': analyzed,
    'hasPerson': hasPerson,
    'personChecked': personChecked,
    'personAnalysisVersion': personAnalysisVersion,
  };

  static MemoryRecord? fromJson(Map<String, dynamic> value) {
    final day = DateTime.tryParse(value['day']?.toString() ?? '');
    final childId = value['childId']?.toString() ?? '';
    final momentId = value['momentId']?.toString() ?? '';
    final filename = value['filename']?.toString() ?? '';
    if (day == null ||
        childId.isEmpty ||
        momentId.isEmpty ||
        filename.isEmpty) {
      return null;
    }
    return MemoryRecord(
      childId: childId,
      momentId: momentId,
      filename: filename,
      day: DateTime(day.year, day.month, day.day),
      lesson: value['lesson']?.toString() ?? '',
      caption: value['caption']?.toString() ?? '',
      labels: (value['labels'] as List? ?? const [])
          .map((label) => label.toString())
          .where((label) => label.isNotEmpty)
          .toList(),
      analyzed: value['analyzed'] == true,
      hasPerson: value['hasPerson'] == true,
      personChecked: value['personChecked'] == true,
      personAnalysisVersion:
          (value['personAnalysisVersion'] as num?)?.toInt() ?? 0,
    );
  }

  MemoryRecord copyWith({
    List<String>? labels,
    bool? analyzed,
    bool? hasPerson,
    bool? personChecked,
    int? personAnalysisVersion,
  }) => MemoryRecord(
    childId: childId,
    momentId: momentId,
    filename: filename,
    day: day,
    lesson: lesson,
    caption: caption,
    labels: labels ?? this.labels,
    analyzed: analyzed ?? this.analyzed,
    hasPerson: hasPerson ?? this.hasPerson,
    personChecked: personChecked ?? this.personChecked,
    personAnalysisVersion: personAnalysisVersion ?? this.personAnalysisVersion,
  );
}

String memoryTheme(MemorySuggestion suggestion) {
  final labels = suggestion.records
      .expand((record) => record.labels)
      .map((label) => label.toLowerCase())
      .toList();
  return visualThemeFor(
    labels: labels,
    text:
        '${suggestion.records.first.lesson} ${suggestion.records.first.caption}',
  );
}

String visualThemeFor({
  required Iterable<String> labels,
  required String text,
}) {
  final normalized = labels.map((label) => label.toLowerCase()).toList();
  final words = text.toLowerCase();
  bool has(Iterable<String> values) => values.any(
    (value) => normalized.contains(value) || words.contains(value),
  );
  if (has(['art', 'drawing', 'paint', 'craft'])) return 'Creative days';
  if (has(['food', 'eating', 'meal', 'fruit', 'vegetable']))
    return 'Little mealtimes';
  if (has(['plant', 'flower', 'grass', 'tree', 'outdoor', 'sky', 'nature']))
    return 'Outdoor days';
  if (has(['smile', 'playing', 'game', 'toy', 'dancing']))
    return 'Happy playtime';
  if (has(['book', 'reading', 'text'])) return 'Story time';
  return '';
}

bool usableMemoryPhoto(MemoryRecord photo) {
  final words = '${photo.lesson} ${photo.caption} ${photo.labels.join(' ')}'
      .toLowerCase();
  // Honeycomb occasionally includes a classroom graphic or reminder in the
  // moment feed. Those are fine in the gallery, but never belong in a child
  // memory—especially a then-and-now pair.
  return photo.hasPerson &&
      ![
        'reminder',
        'document',
        'screenshot',
        'receipt',
        'poster',
        'flyer',
        'paper',
      ].any(words.contains);
}

enum MemoryKind {
  timeCapsule,
  themedChapter,
  firstWeeks,
  thenAndNow,
  classroomChapter,
  familiarFavorite,
  favoriteRediscovery,
  seasonalReturn,
}

String memoryKindTitle(MemoryKind kind) => switch (kind) {
  MemoryKind.timeCapsule => 'A little time capsule',
  MemoryKind.themedChapter => 'A little chapter',
  MemoryKind.firstWeeks => 'First weeks at school',
  MemoryKind.thenAndNow => 'Then & now',
  MemoryKind.classroomChapter => 'A classroom time capsule',
  MemoryKind.familiarFavorite => 'A familiar favorite',
  MemoryKind.favoriteRediscovery => 'A favorite rediscovered',
  MemoryKind.seasonalReturn => 'A seasonal return',
};

class MemorySuggestion {
  const MemorySuggestion({
    required this.childId,
    required this.records,
    required this.referenceDay,
    this.kind = MemoryKind.timeCapsule,
  });

  final String childId;
  final List<MemoryRecord> records;
  final DateTime referenceDay;
  final MemoryKind kind;
}

/// Picks one honest, date-based little story per child.  It favors a matching
/// anniversary, then adapts to shorter daycare histories (six weeks, three
/// months, or six months) instead of waiting a full year.
List<MemorySuggestion> buildMemorySuggestions(
  Iterable<MemoryRecord> records,
  DateTime forDay, {
  Set<String> excluded = const {},
  Set<String> favoriteMomentIds = const {},
  MemoryKind? forceKind,
}) {
  final today = DateTime(forDay.year, forDay.month, forDay.day);
  final byChild = <String, List<MemoryRecord>>{};
  for (final record in records) {
    if (!excluded.contains(record.key)) {
      byChild.putIfAbsent(record.childId, () => []).add(record);
    }
  }
  final suggestions = <MemorySuggestion>[];
  for (final entry in byChild.entries) {
    final allPhotos = entry.value.where(usableMemoryPhoto).toList()
      ..sort((a, b) => a.day.compareTo(b.day));
    // A Then & now story only needs two photos: one genuinely older image and
    // one current image. Other formats need a little more history to form a
    // meaningful cluster.
    if (allPhotos.length < 2) continue;
    final photos = allPhotos
        .where((photo) => today.difference(photo.day).inDays >= 28)
        .toList();
    if (photos.isEmpty) continue;
    if (photos.length < 3 && forceKind != MemoryKind.thenAndNow) continue;
    final first = photos.first.day;
    final age = today.difference(first).inDays;
    final targets = <DateTime>[
      for (var years = 1; years <= 4; years++)
        DateTime(today.year - years, today.month, today.day),
      if (age >= 180) today.subtract(const Duration(days: 180)),
      if (age >= 90) today.subtract(const Duration(days: 90)),
      if (age >= 42) today.subtract(const Duration(days: 42)),
    ].where((target) => !target.isBefore(first)).toList();
    if (targets.isEmpty && forceKind != MemoryKind.thenAndNow) continue;

    MemoryRecord? nearest(Iterable<MemoryRecord> source) {
      for (final target in targets) {
        final nearby = source.where((photo) {
          return photo.day.difference(target).inDays.abs() <= 4;
        }).toList();
        if (nearby.isEmpty) continue;
        nearby.sort((a, b) {
          final distance = a.day
              .difference(target)
              .inDays
              .abs()
              .compareTo(b.day.difference(target).inDays.abs());
          return distance != 0 ? distance : a.momentId.compareTo(b.momentId);
        });
        return nearby.first;
      }
      return null;
    }

    final normal = nearest(photos);
    final early = photos
        .where((photo) => photo.day.difference(first).inDays <= 21)
        .toList();
    final classroomChapters = <String, List<MemoryRecord>>{};
    for (final photo in photos) {
      final lesson = photo.lesson.trim();
      if (lesson.isNotEmpty) {
        classroomChapters
            .putIfAbsent(lesson.toLowerCase(), () => [])
            .add(photo);
      }
    }
    final recurringChapters = classroomChapters.entries
        .where((group) => group.value.length >= 2)
        .toList();
    final themed = <String, List<MemoryRecord>>{};
    for (final photo in photos) {
      final theme = visualThemeFor(
        labels: photo.labels,
        text: '${photo.lesson} ${photo.caption}',
      );
      if (theme.isNotEmpty) themed.putIfAbsent(theme, () => []).add(photo);
    }
    final recurringThemes = themed.entries
        .where((group) => group.value.length >= 2)
        .toList();
    final recent = allPhotos.where((photo) {
      final days = today.difference(photo.day).inDays;
      return days >= 0 && days <= 14;
    }).toList();
    final thenCandidates = photos
        .where((photo) => today.difference(photo.day).inDays >= 90)
        .toList();
    // Prefer an anniversary-like date, but do not reject a legitimate old
    // photo merely because it misses an arbitrary date window. The contrast
    // comes from its age (at least three months), not exact calendar timing.
    final thenPhoto =
        nearest(thenCandidates) ??
        (thenCandidates.isEmpty ? null : thenCandidates.first);
    final favoritePhotos = photos
        .where((photo) => favoriteMomentIds.contains(photo.momentId))
        .toList();
    // A seasonal return is a different day in the same historical month—not
    // the exact-day time capsule under a new name.
    final seasonal = photos.where((photo) {
      return photo.day.year < today.year && photo.day.month == today.month;
    }).toList();
    final choices = <MemoryKind>[
      if (normal != null) MemoryKind.timeCapsule,
      if (recurringThemes.isNotEmpty) MemoryKind.themedChapter,
      if (early.length >= 2) MemoryKind.firstWeeks,
      if (thenPhoto != null && recent.isNotEmpty) MemoryKind.thenAndNow,
      if (recurringChapters.isNotEmpty) MemoryKind.classroomChapter,
      if (recurringThemes.isNotEmpty) MemoryKind.familiarFavorite,
      if (favoritePhotos.isNotEmpty) MemoryKind.favoriteRediscovery,
      if (seasonal.length >= 2) MemoryKind.seasonalReturn,
    ];
    if (choices.isEmpty) continue;
    final rotation =
        today.day +
        entry.key.codeUnits.fold<int>(0, (sum, value) => sum + value);
    if (forceKind != null && !choices.contains(forceKind)) continue;
    final kind = forceKind ?? choices[rotation % choices.length];
    MemoryRecord? chosen = normal;
    List<MemoryRecord>? classroomStory;
    if (kind == MemoryKind.firstWeeks) {
      chosen = early[(rotation ~/ choices.length) % early.length];
    } else if (kind == MemoryKind.classroomChapter) {
      classroomStory =
          recurringChapters[rotation % recurringChapters.length].value;
      chosen =
          classroomStory[(rotation ~/ choices.length) % classroomStory.length];
    } else if (kind == MemoryKind.themedChapter ||
        kind == MemoryKind.familiarFavorite) {
      final group = recurringThemes[rotation % recurringThemes.length].value;
      chosen = group[(rotation ~/ choices.length) % group.length];
    } else if (kind == MemoryKind.favoriteRediscovery) {
      chosen =
          favoritePhotos[(rotation ~/ choices.length) % favoritePhotos.length];
    } else if (kind == MemoryKind.seasonalReturn) {
      chosen = seasonal[(rotation ~/ choices.length) % seasonal.length];
    } else if (kind == MemoryKind.thenAndNow) {
      chosen = thenPhoto;
    }
    if (chosen == null) continue;
    var story = photos
        .where((photo) => photo.day.difference(chosen!.day).inDays.abs() <= 3)
        .take(3)
        .toList();
    if (kind == MemoryKind.themedChapter) {
      final theme = visualThemeFor(
        labels: chosen.labels,
        text: '${chosen.lesson} ${chosen.caption}',
      );
      story = story
          .where(
            (photo) =>
                visualThemeFor(
                  labels: photo.labels,
                  text: '${photo.lesson} ${photo.caption}',
                ) ==
                theme,
          )
          .toList();
    }
    if (kind == MemoryKind.classroomChapter && classroomStory != null) {
      // This is deliberately a story of the same classroom activity across
      // different days, not just another date-based time capsule.
      story = classroomStory.take(3).toList();
    }
    if (kind == MemoryKind.familiarFavorite) {
      final theme = visualThemeFor(
        labels: chosen.labels,
        text: '${chosen.lesson} ${chosen.caption}',
      );
      final themedStory = themed[theme] ?? const <MemoryRecord>[];
      if (themedStory.isNotEmpty) story = themedStory.take(3).toList();
    }
    if (kind == MemoryKind.thenAndNow) {
      story = [chosen, recent.last];
    }
    // Photo grouping and filtering can legitimately leave an empty story as
    // the live feed changes underneath an index pass. The selected photo is
    // still valid, so use it as a one-photo memory rather than dropping the
    // parent's card altogether.
    if (story.isEmpty) story = [chosen];
    suggestions.add(
      MemorySuggestion(
        childId: entry.key,
        records: story,
        referenceDay: chosen.day,
        kind: kind,
      ),
    );
  }
  return suggestions;
}
