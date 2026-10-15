import 'package:flutter_test/flutter_test.dart';
import 'package:honeycomb_family_native/main.dart';

void main() {
  group('Honeycomb report classification', () {
    test('uses Honeycomb numeric report types for user-facing titles', () {
      expect(title({'DailyReportTypeID': 1}), 'Bottle');
      expect(title({'DailyReportTypeID': '3'}), 'Nap');
      expect(title({'DailyReportTypeID': 4}), 'Diaper');
      expect(title({'DailyReportTypeID': 5}), 'Potty');
      expect(title({'DailyReportTypeID': 6}), 'Needs supplies');
      expect(title({'DailyReportTypeID': 7}), 'Message');
    });

    test('preserves useful report summaries and normalizes nap reports', () {
      expect(title({'GenericReportInfo': 'Ate All'}), 'Ate All');
      expect(title({'GenericReportInfo': 'Nap report'}), 'Nap');
      expect(title({'TimeEnd': '2:30 PM'}), 'Nap');
      expect(title({'ChildCondition': 'Restocked cubby'}), 'Restocked cubby');
    });

    test('classifies all report families from API values', () {
      final cases = <Map<String, dynamic>, String>{
        {'DailyReportTypeID': 1, 'GenericReportInfo': '4oz'}: 'bottle',
        {'GenericReportInfo': 'Breakfast', 'ChildCondition': 'Ate All'}: 'meal',
        {'DailyReportTypeID': 3, 'TimeEnd': '2:30 PM'}: 'nap',
        {'DailyReportTypeID': 4, 'ChildCondition': 'Dry'}: 'diaper',
        {'DailyReportTypeID': 5, 'ChildCondition': 'Pee & BM'}: 'potty',
        {'DailyReportTypeID': 6, 'ChildCondition': 'Need wipes'}: 'supplies',
        {'GenericReportInfo': 'Message'}: 'general',
      };
      for (final entry in cases.entries) {
        expect(type(entry.key), entry.value, reason: '${entry.key}');
      }
    });

    test('keeps bottle amounts and nap ranges visible', () {
      expect(
        reportOutcome({
          'GenericReportInfo': '4oz',
          'ChildCondition': 'Finished',
        }, 'bottle'),
        '4oz',
      );
      expect(
        reportOutcome({'TimeStart': '12:00 PM', 'TimeEnd': '2:30 PM'}, 'nap'),
        '12:00 PM - 2:30 PM',
      );
      expect(reportOutcome({'ChildCondition': 'Pee'}, 'potty'), 'Pee');
    });
  });

  group('Honeycomb dates and times', () {
    test('normalizes a calendar week to Sunday', () {
      expect(weekStart(DateTime(2026, 9, 27)), DateTime(2026, 9, 27));
      expect(weekStart(DateTime(2026, 9, 30)), DateTime(2026, 9, 27));
    });

    test('reads the API date fields in priority order', () {
      expect(
        date({'StartDate': '2026-09-28T08:30:00', 'Date': '2020-01-01'}),
        '2026-09-28',
      );
      expect(date({'GroupDate': '2026-09-27'}), '2026-09-27');
      expect(date({}), isEmpty);
      expect(dayKey(DateTime(2026, 2, 3)), '2026-02-03');
    });

    test('formats explicit and ISO timestamps for parents', () {
      expect(eventTime({'TimeStart': '8:05 am'}), '8:05 AM');
      expect(eventTime({'DateTime': '2026-09-28T13:05:00'}), '1:05 PM');
      expect(eventTime({'DateTime': 'September 28, 2026 7:30 pm'}), '7:30 PM');
      expect(eventTime({}), isEmpty);
    });

    test('formats compact labels consistently', () {
      expect(
        range(DateTime(2026, 9, 28), DateTime(2026, 10, 2)),
        '9/28 – 10/2',
      );
      expect(dayName(DateTime(2026, 9, 28)), 'Mon 9/28');
      expect(monthName(DateTime(2026, 9, 1)), 'September');
      expect(cap('nico'), 'Nico');
      expect(cap(''), 'Other');
    });
  });
}
