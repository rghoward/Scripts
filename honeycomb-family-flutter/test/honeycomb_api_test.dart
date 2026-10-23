import 'dart:convert';

import 'package:flutter_test/flutter_test.dart';
import 'package:http/http.dart' as http;
import 'package:http/testing.dart';
import 'package:honeycomb_family_native/core/honeycomb_api.dart';

void main() {
  test(
    'sign-in and dashboard requests satisfy the same-origin check',
    () async {
      final paths = <String>[];
      final api = HoneycombApi(
        client: MockClient((request) async {
          paths.add(request.url.path);
          // Mirrors Honeycomb's rejection of authenticated native POSTs without
          // browser origin context, even when the session itself is valid.
          if (request.headers['Origin'] != HoneycombApi.origin ||
              request.headers['Referer'] != '${HoneycombApi.origin}/') {
            return http.Response('"Cross-site request blocked."', 403);
          }
          if (request.url.path == '/api/membership/login') {
            return http.Response(
              '{"Success":true}',
              200,
              headers: {'set-cookie': 'session=test-session; Path=/; HttpOnly'},
            );
          }
          expect(request.headers['Cookie'], 'session=test-session');
          if (request.url.path == '/api/membership/children') {
            return http.Response(
              jsonEncode({
                'Success': true,
                'Data': [
                  {'ChildID': 'child-1'},
                ],
              }),
              200,
            );
          }
          return http.Response('{"Success":true,"Data":[],"Count":0}', 200);
        }),
      );

      await api.signIn('parent@example.com', 'test-password');
      final children = await api.children();
      final snapshot = await api.loadChild(children.single.id);
      expect(snapshot.childId, 'child-1');
      expect(
        paths,
        containsAll([
          '/api/membership/login',
          '/api/membership/children',
          '/api/daily-report',
          '/api/daily-moment',
          '/api/badges-child',
        ]),
      );
      await api.loadMore(snapshot, moments: true);
      await api.reportDetail('report-1', 'child-1');
      await api.badgeCategories();
      await api.badgeCatalog('child-1');
    },
  );

  test(
    'plain-text HTTP rejections preserve the status instead of JSON errors',
    () async {
      final api = HoneycombApi(
        client: MockClient(
          (_) async => http.Response('Cross-site request blocked.', 403),
        ),
      );
      await expectLater(
        api.children(),
        throwsA(
          isA<HoneycombApiException>().having(
            (error) => error.message,
            'message',
            contains('403'),
          ),
        ),
      );
    },
  );

  test('malformed successful responses produce a readable API error', () async {
    final api = HoneycombApi(
      client: MockClient(
        (_) async => http.Response('<html>Unavailable</html>', 200),
      ),
    );
    await expectLater(
      api.children(),
      throwsA(
        isA<HoneycombApiException>().having(
          (error) => error.message,
          'message',
          contains('unexpected response'),
        ),
      ),
    );
  });
}
