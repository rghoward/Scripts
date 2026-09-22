import 'dart:convert';
import 'dart:typed_data';

import 'package:http/http.dart' as http;

class HoneycombApi {
  HoneycombApi({http.Client? client}) : _client = client ?? http.Client();
  static const origin = 'https://honeycomb.o2bkids.com';
  final http.Client _client;
  String _cookies = '';

  /// The authenticated Honeycomb session is safe to persist in platform secure
  /// storage. Reusing it avoids a password sign-in on every cold app launch.
  String get sessionCookies => _cookies;
  void restoreSessionCookies(String value) => _cookies = value;

  Future<void> signIn(String email, String password) async {
    final response = await _client.post(
      Uri.parse('$origin/api/membership/login'),
      headers: const {
        'Accept': 'application/json',
        'Content-Type': 'application/json',
      },
      body: jsonEncode({'username': email, 'password': password}),
    );
    _saveCookies(response);
    final payload = _decode(response);
    if (payload['Success'] != true)
      throw HoneycombApiException(
        payload['Message']?.toString() ??
            'Honeycomb did not accept that sign-in.',
      );
  }

  Future<List<FamilyChild>> children() async {
    final response = await _client.get(
      Uri.parse('$origin/api/membership/children'),
      headers: _headers,
    );
    final payload = _decode(response);
    if (payload['Success'] != true)
      throw HoneycombApiException(
        payload['Message']?.toString() ?? 'Could not load your family.',
      );
    final data = payload['Data'] as List<dynamic>? ?? const [];
    return data
        .whereType<Map<String, dynamic>>()
        .map(FamilyChild.fromJson)
        .toList();
  }

  /// Matches the established dashboard's initial parallel load.
  Future<ChildSnapshot> loadChild(
    String childId, {
    int page = 1,
    int pageSize = 10,
  }) async {
    final results = await Future.wait([
      _post('/api/daily-report', {
        'ChildID': childId,
        'PageNumber': page,
        'PageSize': pageSize,
      }),
      _post('/api/daily-moment', {
        'ChildID': childId,
        'PageNumber': page,
        'PageSize': pageSize,
      }),
      _post('/api/badges-child', {
        'ChildID': childId,
        'PageNumber': 1,
        'PageSize': 25,
        'ShowUnearned': false,
      }),
    ]);
    final reports = _flatten(results[0]['Data']);
    // Honeycomb can include a sibling's shared moment in this response. Never
    // let it escape into this child's gallery or photo viewer.
    final moments = _flatten(
      results[1]['Data'],
    ).where((moment) => '${moment['ChildID']}' == childId).toList();
    return ChildSnapshot(
      childId: childId,
      reports: reports,
      moments: moments,
      badges: _flatten(results[2]['Data']),
      reportCount: (results[0]['Count'] as num?)?.toInt() ?? 0,
      momentCount: (results[1]['Count'] as num?)?.toInt() ?? 0,
    );
  }

  Future<Map<String, dynamic>> reportDetail(
    String reportId,
    String childId,
  ) => _get(
    '/api/daily-report/${Uri.encodeComponent(reportId)}/${Uri.encodeComponent(childId)}',
  );

  Future<List<Map<String, dynamic>>> badgeCategories() async {
    final payload = await _get('/api/badges/category');
    return _flatten(payload['Data']);
  }

  /// Honeycomb's catalog is explicitly paged at 25.  Requesting a larger page
  /// is known to produce an empty catalog for some accounts.
  Future<List<Map<String, dynamic>>> badgeCatalog(String childId) async {
    final result = <Map<String, dynamic>>[];
    var page = 1;
    int? count;
    do {
      final payload = await _post('/api/badges-child', {
        'ChildID': childId,
        'PageNumber': page++,
        'PageSize': 25,
        'ShowUnearned': true,
      });
      final items = _flatten(payload['Data']);
      result.addAll(items);
      count ??= (payload['Count'] as num?)?.toInt();
      if (items.isEmpty) break;
    } while (count == null || result.length < count);
    final byId = <String, Map<String, dynamic>>{};
    for (final item in result) {
      byId['${item['BadgeID'] ?? item['Id'] ?? item}'] = item;
    }
    return byId.values.toList();
  }

  Future<ChildSnapshot> loadMore(
    ChildSnapshot current, {
    required bool moments,
  }) async {
    final page = moments ? current.momentPage : current.reportPage;
    final payload = await _post(
      moments ? '/api/daily-moment' : '/api/daily-report',
      {'ChildID': current.childId, 'PageNumber': page, 'PageSize': 10},
    );
    final incoming = _flatten(payload['Data']);
    final safeMoments = moments
        ? incoming
              .where((item) => '${item['ChildID']}' == current.childId)
              .toList()
        : current.moments;
    final merge =
        (
          List<Map<String, dynamic>> a,
          List<Map<String, dynamic>> b,
          String id,
        ) {
          final values = <String, Map<String, dynamic>>{};
          for (final item in [...a, ...b]) values['${item[id]}'] = item;
          final output = values.values.toList();
          output.sort((a, b) => _timestamp(b).compareTo(_timestamp(a)));
          return output;
        };
    return current.copyWith(
      reports: moments
          ? current.reports
          : merge(current.reports, incoming, 'DailyReportId'),
      moments: moments
          ? merge(current.moments, safeMoments, 'DailyMomentId')
          : current.moments,
      reportPage: moments ? current.reportPage : page + 1,
      momentPage: moments ? page + 1 : current.momentPage,
      reportCount: moments
          ? current.reportCount
          : (payload['Count'] as num?)?.toInt() ?? current.reportCount,
      momentCount: moments
          ? (payload['Count'] as num?)?.toInt() ?? current.momentCount
          : current.momentCount,
    );
  }

  Future<Map<String, dynamic>?> momentDetail(
    String momentId,
    String childId,
  ) async {
    try {
      final payload = await _get(
        '/api/daily-moment/${Uri.encodeComponent(momentId)}/${Uri.encodeComponent(childId)}',
      );
      final data = payload['Data'];
      if (data is Map<String, dynamic> &&
          '${data['ChildID'] ?? data['Child']?['ChildID']}' == childId)
        return data;
    } catch (_) {
      // A cached thumbnail remains usable if the detail endpoint is unavailable.
    }
    return null;
  }

  Future<Map<String, dynamic>> _get(String path) async {
    final response = await _client.get(
      Uri.parse('$origin$path'),
      headers: _headers,
    );
    final payload = _decode(response);
    if (payload['Success'] != true) {
      throw HoneycombApiException(
        payload['Message']?.toString() ?? 'Honeycomb request failed.',
      );
    }
    return payload;
  }

  String imageUrl(
    String? filename, {
    bool full = false,
    bool thumbnail = false,
  }) {
    if (filename == null || filename.isEmpty) return '';
    final base = filename.startsWith('http') ? filename : '$origin$filename';
    if (full) return '$base?preset=moment-image-full';
    if (thumbnail) return '$base?preset=moment-image-thumb';
    return base;
  }

  /// Images are protected by the same Honeycomb session as the API. Network
  /// image widgets do not share the http client's cookie jar, so the session
  /// has to be supplied explicitly for thumbnails and originals.
  Map<String, String> get imageHeaders => {
    if (_cookies.isNotEmpty) 'Cookie': _cookies,
    'Accept': 'image/avif,image/webp,image/*,*/*;q=0.8',
  };

  /// Honeycomb's source URL without a preset is the downloadable original.
  /// The full viewer preset can still be a server-generated rendition.
  Future<Uint8List> originalPhotoBytes(String filename) async {
    final response = await _client.get(
      Uri.parse(imageUrl(filename)),
      headers: imageHeaders,
    );
    final type = response.headers['content-type'] ?? '';
    if (response.statusCode < 200 ||
        response.statusCode >= 300 ||
        !type.toLowerCase().startsWith('image/')) {
      throw HoneycombApiException(
        'Honeycomb did not return the original photo.',
      );
    }
    return response.bodyBytes;
  }

  Future<Map<String, dynamic>> _post(
    String path,
    Map<String, dynamic> body,
  ) async {
    final response = await _client.post(
      Uri.parse('$origin$path'),
      headers: {..._headers, 'Content-Type': 'application/json'},
      body: jsonEncode(body),
    );
    final payload = _decode(response);
    if (payload['Success'] != true)
      throw HoneycombApiException(
        payload['Message']?.toString() ?? 'Honeycomb request failed.',
      );
    return payload;
  }

  List<Map<String, dynamic>> _flatten(dynamic data) {
    if (data is! List) return const [];
    return data
        .expand((entry) {
          if (entry is! Map<String, dynamic>) return [entry];
          // Honeycomb's dashboard endpoints group records by day in `Data`.
          // Older responses use `Items`; support both exactly as the wrapper.
          final items = entry['Data'] is List
              ? entry['Data'] as List
              : entry['Items'] is List
              ? entry['Items'] as List
              : null;
          if (items == null) return [entry];
          return items.map(
            (item) => item is Map<String, dynamic>
                ? {
                    ...item,
                    if (entry['Date'] != null) 'GroupDate': entry['Date'],
                  }
                : item,
          );
        })
        .whereType<Map<String, dynamic>>()
        .toList();
  }

  static String _timestamp(Map<String, dynamic> item) =>
      '${item['DateTime'] ?? item['CreatedDate'] ?? item['GroupDate'] ?? ''}';

  Map<String, String> get _headers => {
    'Accept': 'application/json',
    if (_cookies.isNotEmpty) 'Cookie': _cookies,
  };
  Map<String, dynamic> _decode(http.Response response) {
    final decoded = jsonDecode(response.body);
    if (response.statusCode < 200 ||
        response.statusCode >= 300 ||
        decoded is! Map<String, dynamic>)
      throw HoneycombApiException(
        'Honeycomb request failed (${response.statusCode}).',
      );
    return decoded;
  }

  void _saveCookies(http.Response response) {
    final raw = response.headers['set-cookie'];
    if (raw == null || raw.isEmpty) return;
    _cookies = raw
        .split(',')
        .map((value) => value.split(';').first.trim())
        .join('; ');
  }
}

class FamilyChild {
  const FamilyChild({
    required this.id,
    required this.firstName,
    required this.lastName,
    this.photoUrl,
    required this.learningDaysCount,
  });
  factory FamilyChild.fromJson(Map<String, dynamic> json) => FamilyChild(
    id: '${json['ChildID']}',
    firstName: '${json['FirstName'] ?? ''}',
    lastName: '${json['LastName'] ?? ''}',
    photoUrl: json['PhotoUrl']?.toString(),
    learningDaysCount: (json['LearningDaysCount'] as num?)?.toInt() ?? 0,
  );
  final String id;
  final String firstName;
  final String lastName;
  final String? photoUrl;
  final int learningDaysCount;
  String get name => '$firstName $lastName'.trim();
}

class HoneycombApiException implements Exception {
  HoneycombApiException(this.message);
  final String message;
  @override
  String toString() => message;
}

class ChildSnapshot {
  const ChildSnapshot({
    required this.childId,
    required this.reports,
    required this.moments,
    required this.badges,
    required this.reportCount,
    required this.momentCount,
    this.reportPage = 2,
    this.momentPage = 2,
  });
  final String childId;
  final List<Map<String, dynamic>> reports;
  final List<Map<String, dynamic>> moments;
  final List<Map<String, dynamic>> badges;
  final int reportCount;
  final int momentCount;
  final int reportPage;
  final int momentPage;

  ChildSnapshot copyWith({
    List<Map<String, dynamic>>? reports,
    List<Map<String, dynamic>>? moments,
    int? reportCount,
    int? momentCount,
    int? reportPage,
    int? momentPage,
  }) => ChildSnapshot(
    childId: childId,
    reports: reports ?? this.reports,
    moments: moments ?? this.moments,
    badges: badges,
    reportCount: reportCount ?? this.reportCount,
    momentCount: momentCount ?? this.momentCount,
    reportPage: reportPage ?? this.reportPage,
    momentPage: momentPage ?? this.momentPage,
  );
}
