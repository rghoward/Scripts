import 'dart:convert';
import 'dart:io';

import 'package:flutter_test/flutter_test.dart';

void main() {
  final snapshot =
      jsonDecode(
            File(
              'assets/data/published_program_snapshot_v1.json',
            ).readAsStringSync(),
          )
          as Map<String, dynamic>;
  final workouts = (snapshot['workouts'] as List<dynamic>)
      .cast<Map<String, dynamic>>();

  test(
    'published snapshot keeps reviewed work grouped in a scannable structure',
    () {
      expect(snapshot['snapshot_id'], 'forged_phase_2026_07_27_v6_zone2');
      expect(snapshot['version'], 6);
      expect(workouts, hasLength(60));
      expect(
        workouts.map((workout) => workout['signature']).toSet(),
        hasLength(60),
      );

      for (final workout in workouts) {
        for (final variant in ['full', 'sixty']) {
          final sections = (workout[variant] as List<dynamic>)
              .cast<Map<String, dynamic>>();
          final titles = sections
              .map((section) => section['title']! as String)
              .toList();
          final primary = titles.indexWhere(
            (title) =>
                title.startsWith('STRENGTH') ||
                title.startsWith('SKILL PRACTICE'),
          );
          final conditioningOrBenchmark = titles.indexWhere(
            (title) =>
                title.startsWith('CONDITIONING') ||
                title.startsWith('BENCHMARK'),
          );
          final cooldown = titles.indexWhere(
            (title) => title.startsWith('POST-QUEST STRETCH'),
          );
          final isZone2Capacity = sections.any(
            (section) =>
                (section['title']! as String).startsWith('CONDITIONING') &&
                (section['body']! as String).startsWith(
                  'Zone 2 aerobic capacity',
                ),
          );
          final trainingTitles = titles
              .where(
                (title) =>
                    title.startsWith('STRENGTH') ||
                    title.startsWith('SKILL PRACTICE') ||
                    title.startsWith('SUPPORT WORK'),
              )
              .toList();

          expect(titles.first, startsWith('WARMUP'));
          if (isZone2Capacity) {
            expect(primary, -1);
            expect(conditioningOrBenchmark, greaterThan(0));
            expect(
              sections
                  .where(
                    (section) =>
                        (section['title']! as String).startsWith('ACCESSORY'),
                  )
                  .single['body'],
              allOf(
                contains(
                  RegExp(
                    r'triceps (pressdowns|extensions)',
                    caseSensitive: false,
                  ),
                ),
                contains(RegExp(r'curls?', caseSensitive: false)),
                contains(
                  RegExp(
                    r'(dead bugs?|side planks?|AbMat sit-ups|hollow hold)',
                    caseSensitive: false,
                  ),
                ),
              ),
            );
          } else {
            expect(primary, greaterThan(0));
            expect(conditioningOrBenchmark, greaterThan(primary));
          }
          expect(cooldown, greaterThan(conditioningOrBenchmark));
          expect(
            trainingTitles,
            orderedEquals(
              [
                'STRENGTH',
                'SKILL PRACTICE',
                'SUPPORT WORK',
              ].where(trainingTitles.contains),
            ),
          );
          expect(
            titles.where((title) => title.startsWith('ACCESSORY')),
            hasLength(lessThanOrEqualTo(1)),
          );
          expect(
            titles.where(
              (title) =>
                  title.startsWith('STRENGTH') &&
                  RegExp(
                    r'(double-under|clean|jerk|snatch|gymnastics)',
                    caseSensitive: false,
                  ).hasMatch(title),
            ),
            isEmpty,
          );
        }
      }
    },
  );
}
