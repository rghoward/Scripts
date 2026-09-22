import 'dart:async';
import 'dart:convert';
import 'dart:io';
import 'dart:typed_data';
import 'dart:ui' as ui;
import 'package:app_links/app_links.dart';
import 'package:cached_network_image/cached_network_image.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:flutter_secure_storage/flutter_secure_storage.dart';
import 'package:flutter/services.dart';
import 'package:image_gallery_saver_plus/image_gallery_saver_plus.dart';
import 'package:image_picker/image_picker.dart';
import 'package:path_provider/path_provider.dart';
import 'core/honeycomb_api.dart';

const secure = FlutterSecureStorage();
const notificationSession = MethodChannel('honeycomb/notification-session');
const gold = Color(0xffffb743);
final appThemeMode = ValueNotifier(ThemeMode.dark);
void main() => runApp(const HoneycombApp());

Future<void> syncNotificationSession(String cookies) async {
  if (!Platform.isAndroid) return;
  try {
    await notificationSession.invokeMethod<void>('setCookies', {
      'cookies': cookies,
    });
  } catch (_) {
    // Notifications remain usable without rich photo previews.
  }
}

Future<void> clearNotificationSession() async {
  if (!Platform.isAndroid) return;
  try {
    await notificationSession.invokeMethod<void>('clearCookies');
  } catch (_) {}
}

class HoneycombApp extends StatefulWidget {
  const HoneycombApp({super.key});
  @override
  State<HoneycombApp> createState() => _HoneycombAppState();
}

class _HoneycombAppState extends State<HoneycombApp> {
  @override
  void initState() {
    super.initState();
    secure.read(key: 'honeycomb_theme').then((saved) {
      appThemeMode.value = ThemeMode.values.firstWhere(
        (mode) => mode.name == saved,
        orElse: () => ThemeMode.dark,
      );
    });
  }

  @override
  Widget build(BuildContext c) => ValueListenableBuilder<ThemeMode>(
    valueListenable: appThemeMode,
    builder: (_, mode, __) => MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Honeycomb Family',
      themeMode: mode,
      theme: ThemeData(
        useMaterial3: true,
        brightness: Brightness.light,
        scaffoldBackgroundColor: const Color(0xfff8f6f1),
        colorScheme: ColorScheme.fromSeed(
          seedColor: const Color(0xffb56c00),
          brightness: Brightness.light,
        ),
        cardTheme: const CardThemeData(color: Colors.white, elevation: 1),
      ),
      darkTheme: ThemeData(
        useMaterial3: true,
        brightness: Brightness.dark,
        scaffoldBackgroundColor: const Color(0xff20262e),
        colorScheme: ColorScheme.fromSeed(
          seedColor: gold,
          brightness: Brightness.dark,
        ),
        cardTheme: const CardThemeData(color: Color(0xff29313a), elevation: 1),
      ),
      home: const Login(),
    ),
  );
}

class Login extends StatefulWidget {
  const Login({super.key});
  @override
  State<Login> createState() => _LoginState();
}

class _LoginState extends State<Login> {
  final api = HoneycombApi(),
      email = TextEditingController(),
      password = TextEditingController();
  bool busy = true;
  String? error;
  @override
  void initState() {
    super.initState();
    restore();
  }

  @override
  void dispose() {
    email.dispose();
    password.dispose();
    super.dispose();
  }

  Future<void> restore() async {
    try {
      email.text = await secure.read(key: 'honeycomb_email') ?? '';
      password.text = await secure.read(key: 'honeycomb_password') ?? '';
      final session = await secure.read(key: 'honeycomb_session') ?? '';
      if (session.isNotEmpty) {
        api.restoreSessionCookies(session);
        await syncNotificationSession(session);
        try {
          // Validate the saved session with a lightweight authenticated request.
          await api.children();
          if (mounted) {
            Navigator.pushReplacement(
              context,
              MaterialPageRoute(builder: (_) => Dashboard(api: api)),
            );
          }
          return;
        } catch (_) {
          // Honeycomb sessions eventually expire; the saved password below is a
          // seamless fallback rather than making the parent type it again.
          api.restoreSessionCookies('');
          await secure.delete(key: 'honeycomb_session');
          await clearNotificationSession();
        }
      }
      if (email.text.isNotEmpty && password.text.isNotEmpty) {
        await signin(true);
      } else if (mounted) {
        setState(() => busy = false);
      }
    } catch (_) {
      if (mounted) setState(() => busy = false);
    }
  }

  Future<void> signin([bool saved = false]) async {
    if (email.text.trim().isEmpty || password.text.isEmpty) {
      setState(() => error = 'Enter your email and password.');
      return;
    }
    setState(() {
      busy = true;
      error = null;
    });
    try {
      await api.signIn(email.text.trim(), password.text);
      await secure.write(key: 'honeycomb_email', value: email.text.trim());
      await secure.write(key: 'honeycomb_password', value: password.text);
      await secure.write(key: 'honeycomb_session', value: api.sessionCookies);
      await syncNotificationSession(api.sessionCookies);
      if (mounted)
        Navigator.pushReplacement(
          context,
          MaterialPageRoute(builder: (_) => Dashboard(api: api)),
        );
    } catch (_) {
      if (mounted)
        setState(
          () => error = saved
              ? 'Saved sign-in no longer works.'
              : 'Could not sign in. Check your details.',
        );
    } finally {
      if (mounted) setState(() => busy = false);
    }
  }

  @override
  Widget build(BuildContext c) => Scaffold(
    body: SafeArea(
      child: Center(
        child: SingleChildScrollView(
          padding: const EdgeInsets.all(24),
          child: Card(
            child: Padding(
              padding: const EdgeInsets.all(24),
              child: Column(
                mainAxisSize: MainAxisSize.min,
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  const CircleAvatar(
                    radius: 28,
                    backgroundColor: gold,
                    child: Text(
                      'H',
                      style: TextStyle(
                        color: Colors.black,
                        fontSize: 24,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                  ),
                  const SizedBox(height: 22),
                  const Text(
                    'HONEYCOMB FAMILY',
                    style: TextStyle(
                      color: gold,
                      letterSpacing: 1.5,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                  const Text(
                    'Welcome back',
                    style: TextStyle(fontSize: 30, fontWeight: FontWeight.bold),
                  ),
                  const SizedBox(height: 20),
                  TextField(
                    controller: email,
                    keyboardType: TextInputType.emailAddress,
                    decoration: const InputDecoration(
                      labelText: 'Email address',
                    ),
                  ),
                  TextField(
                    controller: password,
                    obscureText: true,
                    onSubmitted: (_) {
                      if (!busy) signin();
                    },
                    decoration: const InputDecoration(labelText: 'Password'),
                  ),
                  const SizedBox(height: 20),
                  SizedBox(
                    width: double.infinity,
                    child: FilledButton(
                      onPressed: busy ? null : signin,
                      child: Text(busy ? 'Signing in…' : 'Sign in'),
                    ),
                  ),
                  if (error != null)
                    Padding(
                      padding: const EdgeInsets.only(top: 12),
                      child: Text(
                        error!,
                        style: const TextStyle(color: Colors.redAccent),
                      ),
                    ),
                ],
              ),
            ),
          ),
        ),
      ),
    ),
  );
}

enum Tab { today, activity, photos, insights, more }

enum Activity { agenda, calendar }

enum PhotoRange { all, today, week }

enum InsightRange { loaded, today, week }

class Dashboard extends StatefulWidget {
  const Dashboard({super.key, required this.api});
  final HoneycombApi api;
  @override
  State<Dashboard> createState() => _DashboardState();
}

class _DashboardState extends State<Dashboard>
    with WidgetsBindingObserver, SingleTickerProviderStateMixin {
  List<FamilyChild> children = [];
  Map<String, ChildSnapshot> data = {};
  final Map<String, Map<String, dynamic>> reportDetailCache = {};
  Map<String, String> childPhotoPaths = {};
  Map<String, Map<String, String>> lastSeen = {};
  String savedEmail = '';
  String? connectionNotice;
  DateTime? lastUpdated;
  Set<String> favorites = {}, hidden = {}, ack = {};
  int selected = 0;
  Tab tab = Tab.today;
  Activity activity = Activity.agenda;
  String activityTypeFilter = 'all';
  bool photoSelectionMode = false;
  Set<String> selectedPhotos = {};
  int batchDownloadProgress = 0;
  bool batchDownloading = false;
  bool everyone = false,
      week = false,
      autoRefresh = true,
      mondayWeek = false,
      favoriteFilter = false,
      loading = true,
      refreshing = false,
      loadingMore = false,
      loadingHistory = false;
  PhotoRange photoRange = PhotoRange.all;
  InsightRange insightRange = InsightRange.loaded;
  int calendarTransitionDirection = 1;
  double calendarDrag = 0;
  final search = TextEditingController();
  Timer? timer;
  StreamSubscription<Uri>? linkSubscription;
  Uri? pendingLink;
  DateTime selectedWeek = weekStart(DateTime.now()),
      month = DateTime(DateTime.now().year, DateTime.now().month);
  DateTime? selectedDay;
  double drag = 0;
  final childOffset = ValueNotifier<double>(0);
  late final AnimationController childMotion;
  double _motionStart = 0, _motionEnd = 0;
  VoidCallback? _afterChildMotion;
  bool childAnimating = false;
  // 1 means moving to the next child (current exits left, new enters right).
  int childSwipeDirection = 1;
  @override
  void initState() {
    super.initState();
    final appLinks = AppLinks();
    linkSubscription = appLinks.uriLinkStream.listen(routeDeepLink);
    appLinks.getInitialLink().then((link) {
      if (link != null) routeDeepLink(link);
    });
    childMotion = AnimationController(vsync: this)
      ..addListener(() {
        drag =
            _motionStart +
            (_motionEnd - _motionStart) *
                Curves.easeOutCubic.transform(childMotion.value);
        childOffset.value = drag;
      })
      ..addStatusListener((status) {
        if (status != AnimationStatus.completed) return;
        final callback = _afterChildMotion;
        _afterChildMotion = null;
        callback?.call();
      });
    WidgetsBinding.instance.addObserver(this);
    load();
    configureAutoRefresh();
  }

  @override
  void dispose() {
    linkSubscription?.cancel();
    WidgetsBinding.instance.removeObserver(this);
    timer?.cancel();
    childMotion.dispose();
    childOffset.dispose();
    search.dispose();
    super.dispose();
  }

  @override
  void didChangeAppLifecycleState(AppLifecycleState s) {
    if (s == AppLifecycleState.resumed) refresh();
  }

  Future<void> restore() async {
    try {
      savedEmail = await secure.read(key: 'honeycomb_email') ?? '';
      Set<String> read(String x) =>
          (jsonDecode(x) as List).map((v) => v.toString()).toSet();
      favorites = read(await secure.read(key: 'honeycomb_favorites') ?? '[]');
      hidden = read(await secure.read(key: 'honeycomb_hidden') ?? '[]');
      ack = read(await secure.read(key: 'honeycomb_ack') ?? '[]');
      final seen = jsonDecode(
        await secure.read(key: 'honeycomb_last_seen') ?? '{}',
      );
      if (seen is Map) {
        lastSeen = {
          for (final entry in seen.entries)
            entry.key.toString(): {
              if (entry.value is Map)
                'moments': (entry.value['moments'] ?? '').toString(),
              if (entry.value is Map)
                'reports': (entry.value['reports'] ?? '').toString(),
            },
        };
      }
      final photos = jsonDecode(
        await secure.read(key: 'honeycomb_child_photos') ?? '{}',
      );
      if (photos is Map) {
        childPhotoPaths = {
          for (final entry in photos.entries)
            if (entry.value is String && File(entry.value).existsSync())
              entry.key.toString(): entry.value as String,
        };
      }
      final s = jsonDecode(await secure.read(key: 'honeycomb_state') ?? '{}');
      selected = (s['selected'] as int?) ?? 0;
      tab = Tab.values.byName((s['tab'] as String?) ?? 'today');
      autoRefresh = s['autoRefresh'] as bool? ?? true;
      mondayWeek = s['mondayWeek'] as bool? ?? false;
      selectedWeek = weekStartFor(selectedWeek);
      configureAutoRefresh();
    } catch (_) {}
  }

  Future<void> save() => Future.wait([
    secure.write(
      key: 'honeycomb_favorites',
      value: jsonEncode(favorites.toList()),
    ),
    secure.write(key: 'honeycomb_hidden', value: jsonEncode(hidden.toList())),
    secure.write(key: 'honeycomb_ack', value: jsonEncode(ack.toList())),
    secure.write(key: 'honeycomb_last_seen', value: jsonEncode(lastSeen)),
    secure.write(
      key: 'honeycomb_child_photos',
      value: jsonEncode(childPhotoPaths),
    ),
    secure.write(
      key: 'honeycomb_state',
      value: jsonEncode({
        'selected': selected,
        'tab': tab.name,
        'autoRefresh': autoRefresh,
        'mondayWeek': mondayWeek,
      }),
    ),
  ]);

  Future<bool> restoreSnapshotCache() async {
    try {
      final raw = await secure.read(key: 'honeycomb_snapshot_cache');
      if (raw == null) return false;
      final cache = jsonDecode(raw) as Map<String, dynamic>;
      if (cache['version'] != 1) return false;
      final cachedChildren = (cache['children'] as List)
          .map(
            (value) => FamilyChild.fromJson(Map<String, dynamic>.from(value)),
          )
          .toList();
      final snapshots = <String, ChildSnapshot>{};
      for (final value in cache['snapshots'] as List) {
        final map = Map<String, dynamic>.from(value);
        Map<String, dynamic> listItem(dynamic item) =>
            Map<String, dynamic>.from(item as Map);
        final snapshot = ChildSnapshot(
          childId: map['childId'].toString(),
          reports: (map['reports'] as List).map(listItem).toList(),
          moments: (map['moments'] as List)
              // Retain the owner-safety rule even for an old cache.
              .map(listItem)
              .where(
                (item) =>
                    item['ChildID'].toString() == map['childId'].toString(),
              )
              .toList(),
          badges: (map['badges'] as List).map(listItem).toList(),
          reportCount: map['reportCount'] as int? ?? 0,
          momentCount: map['momentCount'] as int? ?? 0,
          reportPage: map['reportPage'] as int? ?? 2,
          momentPage: map['momentPage'] as int? ?? 2,
        );
        snapshots[snapshot.childId] = snapshot;
      }
      if (cachedChildren.isEmpty || snapshots.isEmpty) return false;
      if (!mounted) return false;
      setState(() {
        children = cachedChildren;
        data = snapshots;
        selected = selected.clamp(0, cachedChildren.length - 1);
        loading = false;
        connectionNotice = null;
        lastUpdated = DateTime.now();
      });
      return true;
    } catch (_) {
      await secure.delete(key: 'honeycomb_snapshot_cache');
      return false;
    }
  }

  Future<void> saveSnapshotCache() async {
    if (children.isEmpty || data.isEmpty) return;
    final encoded = {
      'version': 1,
      'savedAt': DateTime.now().toIso8601String(),
      'children': children
          .map(
            (child) => {
              'ChildID': child.id,
              'FirstName': child.firstName,
              'LastName': child.lastName,
              'PhotoUrl': child.photoUrl,
              'LearningDaysCount': child.learningDaysCount,
            },
          )
          .toList(),
      'snapshots': data.values
          .map(
            (snapshot) => {
              'childId': snapshot.childId,
              'reports': snapshot.reports,
              'moments': snapshot.moments,
              'badges': snapshot.badges,
              'reportCount': snapshot.reportCount,
              'momentCount': snapshot.momentCount,
              'reportPage': snapshot.reportPage,
              'momentPage': snapshot.momentPage,
            },
          )
          .toList(),
    };
    try {
      await secure.write(
        key: 'honeycomb_snapshot_cache',
        value: jsonEncode(encoded),
      );
    } catch (_) {
      // Cache failures never prevent fresh authenticated data from rendering.
    }
  }

  Future<void> load() async {
    await restore();
    final restored = await restoreSnapshotCache();
    try {
      final cs = await widget.api.children();
      final ss = await Future.wait(cs.map((c) => widget.api.loadChild(c.id)));
      if (!mounted) return;
      setState(() {
        children = cs;
        data = {for (final x in ss) x.childId: x};
        selected = selected.clamp(0, cs.isEmpty ? 0 : cs.length - 1);
        loading = false;
      });
      final link = pendingLink;
      pendingLink = null;
      if (link != null) routeDeepLink(link);
      markAllSeenSoon();
      saveSnapshotCache();
      unawaited(cacheRecentHistory());
    } catch (_) {
      if (!mounted) return;
      setState(() {
        loading = false;
        connectionNotice = restored
            ? 'Offline — showing your last saved updates.'
            : 'Honeycomb could not be reached. Pull down to try again.';
      });
    }
  }

  Future<void> refresh() async {
    if (refreshing || children.isEmpty) return;
    setState(() => refreshing = true);
    try {
      final ss = await Future.wait(
        children.map((c) => widget.api.loadChild(c.id)),
      );
      if (mounted) {
        setState(() {
          data = {for (final x in ss) x.childId: x};
          connectionNotice = null;
          lastUpdated = DateTime.now();
        });
        markAllSeenSoon();
        saveSnapshotCache();
        unawaited(cacheRecentHistory());
      }
    } catch (_) {
      if (mounted) {
        setState(() {
          connectionNotice = 'Couldn\'t refresh — showing saved updates.';
        });
      }
    } finally {
      if (mounted) setState(() => refreshing = false);
    }
  }

  void configureAutoRefresh() {
    timer?.cancel();
    if (autoRefresh) {
      timer = Timer.periodic(const Duration(minutes: 5), (_) => refresh());
    }
  }

  DateTime weekStartFor(DateTime day) => mondayWeek
      ? DateTime(
          day.year,
          day.month,
          day.day,
        ).subtract(Duration(days: day.weekday - 1))
      : weekStart(day);

  void routeDeepLink(Uri link) {
    if (children.isEmpty) {
      pendingLink = link;
      return;
    }
    // Public notification payloads use a simple URL instead of exposing any
    // authenticated API token: honeycombfamily://open?childId=42&tab=photos
    // &momentId=100.  Unknown fields are safely ignored.
    final childId =
        link.queryParameters['childId'] ?? link.queryParameters['child'];
    final childIndex = children.indexWhere((owner) => owner.id == childId);
    final requestedTab = (link.queryParameters['tab'] ?? '').toLowerCase();
    final nextTab = switch (requestedTab) {
      'activity' => Tab.activity,
      'photos' || 'photo' => Tab.photos,
      'insights' || 'stats' => Tab.insights,
      _ => Tab.today,
    };
    setState(() {
      if (childIndex >= 0) selected = childIndex;
      tab = nextTab;
      everyone = false;
    });
    save();
    final momentId =
        link.queryParameters['momentId'] ?? link.queryParameters['moment'];
    final latest = link.queryParameters['latestPhoto'] == 'true';
    if (nextTab == Tab.photos && (momentId?.isNotEmpty == true || latest)) {
      final owner = child;
      WidgetsBinding.instance.addPostFrameCallback(
        (_) => openLinkedPhoto(owner, momentId, latest),
      );
    }
  }

  Future<void> openLinkedPhoto(
    FamilyChild owner,
    String? momentId,
    bool latest,
  ) async {
    var photos = moments(owner);
    var match = momentId == null
        ? (photos.isEmpty ? -1 : 0)
        : photos.indexWhere((item) => id(item) == momentId);
    while (match < 0 &&
        (data[owner.id]?.moments.length ?? 0) <
            (data[owner.id]?.momentCount ?? 0)) {
      await loadMorePhotos(owner);
      if (!mounted) return;
      photos = moments(owner);
      match = momentId == null
          ? (photos.isEmpty ? -1 : 0)
          : photos.indexWhere((item) => id(item) == momentId);
    }
    if (!mounted || match < 0) return;
    viewer(photos[match], owner);
  }

  FamilyChild get child => children[selected];
  List<FamilyChild> get scope =>
      everyone && tab == Tab.activity ? children : [child];
  String id(Map<String, dynamic> x) =>
      (x['DailyMomentId'] ?? x['DailyReportId'] ?? x).toString();
  String hiddenKey(FamilyChild owner, Map<String, dynamic> moment) =>
      '${owner.id}:${id(moment)}';
  bool isHidden(FamilyChild owner, Map<String, dynamic> moment) =>
      hidden.contains(hiddenKey(owner, moment)) || hidden.contains(id(moment));
  List<Map<String, dynamic>> moments(FamilyChild c) =>
      (data[c.id]?.moments ?? [])
          .where((x) => x['ChildID'].toString() == c.id && !isHidden(c, x))
          .toList();
  List<Map<String, dynamic>> reports(FamilyChild c) =>
      data[c.id]?.reports ?? [];

  String _newestTimestamp(Iterable<Map<String, dynamic>> items) {
    final timestamps =
        items.map(stamp).where((value) => value.isNotEmpty).toList()..sort();
    return timestamps.isEmpty ? '' : timestamps.last;
  }

  int unseenCount(FamilyChild owner) {
    final seen = lastSeen[owner.id];
    if (seen == null) return 0;
    final newerMoments = (data[owner.id]?.moments ?? const [])
        .where((item) => item['ChildID'].toString() == owner.id)
        .where((item) => stamp(item).compareTo(seen['moments'] ?? '') > 0)
        .length;
    final newerReports = reports(
      owner,
    ).where((item) => stamp(item).compareTo(seen['reports'] ?? '') > 0).length;
    return newerMoments + newerReports;
  }

  void markAllSeenSoon() {
    // Let the current frame expose updates since the prior refresh, matching
    // the original dashboard, then persist this snapshot as the new baseline.
    Future<void>.delayed(Duration.zero, () {
      if (children.isEmpty) return;
      for (final owner in children) {
        lastSeen[owner.id] = {
          'moments': _newestTimestamp(data[owner.id]?.moments ?? const []),
          'reports': _newestTimestamp(reports(owner)),
        };
      }
      save();
    });
  }

  bool photoInRange(Map<String, dynamic> item) {
    final key = date(item);
    if (photoRange == PhotoRange.all) return true;
    if (photoRange == PhotoRange.today) return key == dayKey(DateTime.now());
    return key.compareTo(dayKey(weekStartFor(DateTime.now()))) >= 0;
  }

  Future<void> loadMorePhotos([FamilyChild? owner]) async {
    final target = owner ?? child;
    final snapshot = data[target.id];
    if (loadingMore ||
        snapshot == null ||
        snapshot.moments.length >= snapshot.momentCount) {
      return;
    }
    setState(() => loadingMore = true);
    try {
      final next = await widget.api.loadMore(snapshot, moments: true);
      if (mounted) {
        setState(() => data = {...data, target.id: next});
        saveSnapshotCache();
      }
    } finally {
      if (mounted) setState(() => loadingMore = false);
    }
  }

  Future<void> loadMoreActivity() async {
    if (loadingHistory) return;
    setState(() => loadingHistory = true);
    try {
      final updated = Map<String, ChildSnapshot>.from(data);
      for (final owner in scope) {
        final existing = updated[owner.id];
        if (existing == null) continue;
        ChildSnapshot snapshot = existing;
        // Advance photos, then pull enough report pages to cover that same
        // point in time. Honeycomb has far more reports than photos; advancing
        // each endpoint by one fixed page left older activity looking like a
        // photo-only feed.
        if (snapshot.moments.length < snapshot.momentCount) {
          snapshot = await widget.api.loadMore(snapshot, moments: true);
        }
        String oldest(Iterable<Map<String, dynamic>> items) {
          final dates = items.map(stamp).where((value) => value.isNotEmpty);
          return dates.fold<String>('', (result, value) {
            return result.isEmpty || value.compareTo(result) < 0
                ? value
                : result;
          });
        }

        final targetDate = oldest(snapshot.moments);
        var pagesLoaded = 0;
        while (snapshot.reports.length < snapshot.reportCount &&
            pagesLoaded < 8 &&
            (targetDate.isEmpty ||
                oldest(snapshot.reports).isEmpty ||
                oldest(snapshot.reports).compareTo(targetDate) > 0)) {
          final before = snapshot.reports.length;
          snapshot = await widget.api.loadMore(snapshot, moments: false);
          pagesLoaded++;
          if (snapshot.reports.length == before) break;
        }
        updated[owner.id] = snapshot;
      }
      if (mounted) {
        setState(() => data = updated);
        saveSnapshotCache();
      }
    } finally {
      if (mounted) setState(() => loadingHistory = false);
    }
  }

  void restoreHiddenPhotos() {
    final current = data[child.id]?.moments ?? const <Map<String, dynamic>>[];
    final legacyIds = current.map(id).toSet();
    final keys = current.map((moment) => hiddenKey(child, moment)).toSet();
    if (!hidden.any(
      (value) => keys.contains(value) || legacyIds.contains(value),
    ))
      return;
    setState(
      () => hidden.removeWhere(
        (value) => keys.contains(value) || legacyIds.contains(value),
      ),
    );
    save();
  }

  int hiddenPhotoCount(FamilyChild owner) {
    return (data[owner.id]?.moments ?? const [])
        .where((moment) => isHidden(owner, moment))
        .length;
  }

  String oldestDay(List<Map<String, dynamic>> items) {
    final keys = items.map(date).where((key) => key.isNotEmpty).toList()
      ..sort();
    return keys.isEmpty ? '' : keys.first;
  }

  Future<ChildSnapshot> loadChildHistoryThrough(
    ChildSnapshot snapshot,
    String targetDay,
  ) async {
    var current = snapshot;
    while (current.moments.length < current.momentCount) {
      final oldest = oldestDay(current.moments);
      if (oldest.isNotEmpty && oldest.compareTo(targetDay) < 0) break;
      final next = await widget.api.loadMore(current, moments: true);
      if (next.moments.length == current.moments.length) break;
      current = next;
    }
    while (current.reports.length < current.reportCount) {
      final oldest = oldestDay(current.reports);
      if (oldest.isNotEmpty && oldest.compareTo(targetDay) < 0) break;
      final next = await widget.api.loadMore(current, moments: false);
      if (next.reports.length == current.reports.length) break;
      current = next;
    }
    return current;
  }

  Future<void> ensureHistoryThrough(
    Iterable<FamilyChild> targets,
    DateTime day,
  ) async {
    if (loadingHistory) return;
    setState(() => loadingHistory = true);
    try {
      final target = dayKey(day);
      final values = await Future.wait(
        targets.map((c) => loadChildHistoryThrough(data[c.id]!, target)),
      );
      if (mounted) {
        setState(() {
          data = {...data, for (final value in values) value.childId: value};
        });
        saveSnapshotCache();
      }
    } finally {
      if (mounted) setState(() => loadingHistory = false);
    }
  }

  Future<void> cacheRecentHistory() async {
    if (children.isEmpty) return;
    // Keep two weeks of reports and photos available after refresh/relaunch.
    await ensureHistoryThrough(
      children,
      DateTime.now().subtract(const Duration(days: 13)),
    );
  }

  Future<void> changeWeek(DateTime next) async {
    final normalized = weekStartFor(next);
    setState(() => selectedWeek = normalized);
    // Weekly comparisons need the prior week as well as the displayed week.
    await ensureHistoryThrough(
      children,
      normalized.subtract(const Duration(days: 7)),
    );
  }

  Future<void> changeCalendarMonth(int delta) async {
    final next = DateTime(month.year, month.month + delta);
    if (next.isAfter(DateTime(DateTime.now().year, DateTime.now().month))) {
      return;
    }
    setState(() {
      month = next;
      selectedDay = null;
    });
    await ensureHistoryThrough(scope, next);
  }

  Future<void> stepCalendarDay(int direction) async {
    final current = selectedDay;
    if (current == null || loadingHistory) return;
    final next = current.add(Duration(days: direction));
    final today = DateTime.now();
    if (next.isAfter(DateTime(today.year, today.month, today.day))) return;
    setState(() {
      calendarTransitionDirection = direction;
      selectedDay = next;
      month = DateTime(next.year, next.month);
    });
    await ensureHistoryThrough(scope, next);
  }

  @override
  Widget build(BuildContext c) {
    if (loading)
      return const Scaffold(body: Center(child: CircularProgressIndicator()));
    if (children.isEmpty)
      return Scaffold(
        body: Center(
          child: FilledButton(
            onPressed: load,
            child: const Text('Could not load family. Try again'),
          ),
        ),
      );
    return PopScope(
      canPop: false,
      onPopInvokedWithResult: (didPop, _) {
        if (!didPop) _handleDashboardBack();
      },
      child: Scaffold(
        appBar: AppBar(
          title: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              const Text(
                'HONEYCOMB FAMILY',
                style: TextStyle(fontSize: 10, color: gold, letterSpacing: 1.4),
              ),
              Text(
                familyName(),
                style: const TextStyle(
                  fontWeight: FontWeight.bold,
                  fontSize: 20,
                ),
              ),
            ],
          ),
          actions: [
            refreshing
                ? const Padding(
                    padding: EdgeInsets.all(14),
                    child: SizedBox(
                      width: 20,
                      height: 20,
                      child: CircularProgressIndicator(strokeWidth: 2),
                    ),
                  )
                : IconButton(
                    onPressed: refresh,
                    icon: const Icon(Icons.refresh),
                  ),
          ],
        ),
        body: Column(
          children: [
            picker(),
            if (connectionNotice != null)
              MaterialBanner(
                backgroundColor: const Color(0xff4b3b25),
                content: Text(connectionNotice!),
                leading: const Icon(Icons.cloud_off_outlined, color: gold),
                actions: [
                  TextButton(onPressed: refresh, child: const Text('Retry')),
                  TextButton(
                    onPressed: () => setState(() => connectionNotice = null),
                    child: const Text('Dismiss'),
                  ),
                ],
              )
            else if (lastUpdated != null)
              Padding(
                padding: const EdgeInsets.only(top: 5),
                child: Text(
                  'Updated ${eventTime({'Date': lastUpdated!.toIso8601String()})}',
                  style: const TextStyle(fontSize: 10, color: Colors.white38),
                ),
              ),
            Expanded(
              child: GestureDetector(
                onHorizontalDragUpdate: childAnimating
                    ? null
                    : (d) {
                        drag += d.delta.dx;
                        childOffset.value = drag;
                      },
                onHorizontalDragEnd: childAnimating
                    ? null
                    : (d) => finishDrag(d, MediaQuery.sizeOf(c).width),
                child: ValueListenableBuilder<double>(
                  valueListenable: childOffset,
                  child: KeyedSubtree(
                    key: ValueKey(
                      tab.name + '-' + child.id + '-' + activity.name,
                    ),
                    child: body(),
                  ),
                  builder: (context, offset, page) => Transform.translate(
                    offset: Offset(offset, 0),
                    child: page,
                  ),
                ),
              ),
            ),
          ],
        ),
        bottomNavigationBar: NavigationBar(
          selectedIndex: tab.index,
          onDestinationSelected: selectTab,
          destinations: const [
            NavigationDestination(
              icon: Icon(Icons.home_outlined),
              selectedIcon: Icon(Icons.home),
              label: 'Today',
            ),
            NavigationDestination(
              icon: Icon(Icons.view_agenda_outlined),
              selectedIcon: Icon(Icons.view_agenda),
              label: 'Activity',
            ),
            NavigationDestination(
              icon: Icon(Icons.photo_outlined),
              selectedIcon: Icon(Icons.photo),
              label: 'Photos',
            ),
            NavigationDestination(
              icon: Icon(Icons.insights_outlined),
              selectedIcon: Icon(Icons.insights),
              label: 'Insights',
            ),
            NavigationDestination(icon: Icon(Icons.more_horiz), label: 'More'),
          ],
        ),
      ),
    );
  }

  Future<void> _handleDashboardBack() async {
    final shouldConfirmExit = tab == Tab.today && !week && !photoSelectionMode;
    if (shouldConfirmExit) {
      final exit = await showDialog<bool>(
        context: context,
        builder: (c) => AlertDialog(
          title: const Text('Exit Honeycomb Family?'),
          content: const Text('Do you want to close the app?'),
          actions: [
            TextButton(
              onPressed: () => Navigator.pop(c, false),
              child: const Text('Stay'),
            ),
            FilledButton(
              onPressed: () => Navigator.pop(c, true),
              child: const Text('Exit'),
            ),
          ],
        ),
      );
      if (exit == true) await SystemNavigator.pop();
      return;
    }
    setState(() {
      if (photoSelectionMode) {
        photoSelectionMode = false;
        selectedPhotos = {};
      } else if (tab == Tab.activity && search.text.isNotEmpty) {
        search.clear();
      } else if (tab == Tab.activity && activityTypeFilter != 'all') {
        activityTypeFilter = 'all';
      } else if (tab == Tab.activity && selectedDay != null) {
        selectedDay = null;
      } else if (tab == Tab.activity && activity == Activity.calendar) {
        activity = Activity.agenda;
      } else if (tab != Tab.today) {
        tab = Tab.today;
        everyone = false;
      } else if (week) {
        week = false;
      }
    });
    save();
  }

  String familyName() {
    final n = children
        .map((x) => x.lastName)
        .where((x) => x.isNotEmpty)
        .toSet();
    return n.length == 1 ? 'The ' + n.first + ' Family' : 'Your Family';
  }

  void selectTab(int i) {
    if (i == 4) {
      more();
      return;
    }
    setState(() {
      tab = Tab.values[i];
      everyone = false;
    });
    save();
  }

  Widget picker() => Material(
    color: const Color(0xff29313a),
    child: InkWell(
      onTap: chooseChild,
      child: Padding(
        padding: const EdgeInsets.symmetric(horizontal: 18, vertical: 9),
        child: Row(
          children: [
            GestureDetector(
              onTap: chooseChildPhoto,
              child: Stack(
                clipBehavior: Clip.none,
                children: [
                  avatar(child),
                  const Positioned(
                    right: -4,
                    bottom: -4,
                    child: CircleAvatar(
                      radius: 9,
                      backgroundColor: gold,
                      child: Icon(Icons.edit, size: 12, color: Colors.black),
                    ),
                  ),
                ],
              ),
            ),
            const SizedBox(width: 10),
            Expanded(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    everyone ? 'Everyone' : child.name,
                    style: const TextStyle(fontWeight: FontWeight.bold),
                  ),
                  Text(
                    everyone
                        ? 'Combined family activity'
                        : child.learningDaysCount.toString() +
                              ' learning days' +
                              (unseenCount(child) > 0
                                  ? ' · ${unseenCount(child)} new'
                                  : ''),
                    style: const TextStyle(fontSize: 12, color: Colors.white60),
                  ),
                ],
              ),
            ),
            const Icon(Icons.keyboard_arrow_down),
          ],
        ),
      ),
    ),
  );
  Future<void> chooseChild() async {
    final x = await showModalBottomSheet<int>(
      context: context,
      showDragHandle: true,
      builder: (c) => SafeArea(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            const ListTile(
              title: Text(
                'Choose a child',
                style: TextStyle(fontWeight: FontWeight.bold),
              ),
            ),
            ...List.generate(
              children.length,
              (i) => ListTile(
                leading: avatar(children[i]),
                title: Text(children[i].name),
                trailing: i == selected && !everyone
                    ? const Icon(Icons.check, color: gold)
                    : null,
                onTap: () => Navigator.pop(c, i),
              ),
            ),
            if (tab == Tab.activity)
              ListTile(
                leading: const CircleAvatar(child: Icon(Icons.family_restroom)),
                title: const Text('Everyone'),
                subtitle: const Text('Combined family activity'),
                onTap: () => Navigator.pop(c, -1),
              ),
          ],
        ),
      ),
    );
    if (x == -1)
      setState(() => everyone = true);
    else if (x != null) {
      startChildTransition(
        x,
        x > selected ? 1 : -1,
        MediaQuery.sizeOf(context).width,
      );
    }
  }

  void runChildMotion(
    double from,
    double to, {
    required int milliseconds,
    VoidCallback? after,
  }) {
    _motionStart = from;
    _motionEnd = to;
    _afterChildMotion = after;
    childMotion
      ..duration = Duration(milliseconds: milliseconds)
      ..reset()
      ..forward();
  }

  void startChildTransition(int next, int direction, double width) {
    if (childAnimating || children.length < 2) return;
    final wrappedNext =
        (next % children.length + children.length) % children.length;
    setState(() => childAnimating = true);
    childSwipeDirection = direction;
    // Finish the exact drag the parent performed; no jump back to center.
    runChildMotion(
      drag,
      -direction * width,
      milliseconds: 220,
      after: () {
        setState(() {
          selected = wrappedNext;
          everyone = false;
          // The next child begins just beyond the opposite screen edge.
          drag = direction * width;
          childOffset.value = drag;
        });
        runChildMotion(
          direction * width,
          0,
          milliseconds: 300,
          after: () {
            setState(() => childAnimating = false);
            save();
          },
        );
      },
    );
  }

  void finishDrag(DragEndDetails d, double w) {
    final v = d.primaryVelocity ?? 0;
    if (drag.abs() < w * .22 && v.abs() < 650) {
      setState(() => childAnimating = true);
      runChildMotion(
        drag,
        0,
        milliseconds: 220,
        after: () => setState(() => childAnimating = false),
      );
      return;
    }
    final direction = drag < 0 || v < 0 ? 1 : -1;
    if (children.length < 2) {
      setState(() => childAnimating = true);
      runChildMotion(
        drag,
        0,
        milliseconds: 220,
        after: () => setState(() => childAnimating = false),
      );
      return;
    }
    startChildTransition(selected + direction, direction, w);
  }

  Widget body() => switch (tab) {
    Tab.today => today(),
    Tab.activity => activityPage(),
    Tab.photos => photos(),
    Tab.insights => insights(),
    Tab.more => const SizedBox(),
  };
  Widget today() {
    final cutoff = supplyAlertCutoff();
    final alerts =
        scope
            .expand(
              (c) => reports(c)
                  .where(
                    (x) =>
                        type(x) == 'supplies' &&
                        date(x).compareTo(dayKey(cutoff)) >= 0 &&
                        !ack.contains(id(x)),
                  )
                  .map((x) => (c, x)),
            )
            .toList()
          ..sort((a, b) => stamp(b.$2).compareTo(stamp(a.$2)));
    return RefreshIndicator(
      onRefresh: refresh,
      child: ListView(
        padding: const EdgeInsets.all(16),
        children: [
          if (alerts.isNotEmpty)
            Card(
              color: const Color(0xff4b3b25),
              child: ListTile(
                leading: const Icon(Icons.inventory_2_outlined, color: gold),
                title: const Text('Supplies needed'),
                subtitle: Text(
                  '${alerts.length} unacknowledged alert${alerts.length == 1 ? '' : 's'} · Past 5 business days',
                ),
                onTap: () => supplies(alerts),
              ),
            ),
          SegmentedButton<bool>(
            segments: const [
              ButtonSegment(value: false, label: Text('Today')),
              ButtonSegment(value: true, label: Text('Week')),
            ],
            selected: {week},
            onSelectionChanged: (x) => setState(() => week = x.first),
          ),
          if (week) weekBar(),
          if (week) weekly(),
          homeCard(child),
        ],
      ),
    );
  }

  DateTime supplyAlertCutoff() {
    var day = DateTime(
      DateTime.now().year,
      DateTime.now().month,
      DateTime.now().day,
    );
    var businessDaysBack = 4;
    while (businessDaysBack > 0) {
      day = day.subtract(const Duration(days: 1));
      if (day.weekday <= DateTime.friday) businessDaysBack--;
    }
    return day;
  }

  Widget weekBar() => Row(
    mainAxisAlignment: MainAxisAlignment.spaceBetween,
    children: [
      IconButton(
        onPressed: loadingHistory
            ? null
            : () => changeWeek(selectedWeek.subtract(const Duration(days: 7))),
        icon: const Icon(Icons.chevron_left),
      ),
      Text(
        sameDay(selectedWeek, weekStartFor(DateTime.now()))
            ? 'This week'
            : range(selectedWeek, selectedWeek.add(const Duration(days: 6))),
        style: const TextStyle(fontWeight: FontWeight.bold),
      ),
      IconButton(
        onPressed:
            selectedWeek.isBefore(weekStartFor(DateTime.now())) &&
                !loadingHistory
            ? () => changeWeek(selectedWeek.add(const Duration(days: 7)))
            : null,
        icon: const Icon(Icons.chevron_right),
      ),
    ],
  );
  Widget weekly() {
    final rs = reports(child).where(inWeek).toList();
    return Card(
      child: Padding(
        padding: const EdgeInsets.all(14),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(
              'Weekly recap · ' + child.firstName,
              style: const TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 12),
            Row(
              children: [
                metric(
                  moments(child).where(inWeek).length.toString(),
                  'Photos',
                ),
                metric(rs.length.toString(), 'Reports'),
                metric(
                  rs.where((x) => type(x) == 'meal').length.toString(),
                  'Meals',
                ),
                metric(
                  rs.where((x) => type(x) == 'nap').length.toString(),
                  'Naps',
                ),
              ],
            ),
            const Divider(height: 26),
            ...List.generate(7, (i) {
              final d = selectedWeek.add(Duration(days: i));
              return ListTile(
                dense: true,
                title: Text(dayName(d)),
                trailing: Text(
                  '📷 ' +
                      moments(
                        child,
                      ).where((x) => date(x) == dayKey(d)).length.toString() +
                      '  📋 ' +
                      rs.where((x) => date(x) == dayKey(d)).length.toString(),
                ),
              );
            }),
          ],
        ),
      ),
    );
  }

  Widget homeCard(FamilyChild c) {
    final newItems = unseenCount(c);
    final ps = moments(c)
        .where((x) => week ? inWeek(x) : date(x) == dayKey(DateTime.now()))
        .toList();
    final rs = reports(c)
        .where((x) => week ? inWeek(x) : date(x) == dayKey(DateTime.now()))
        .toList();
    final es = [...rs.map((x) => Entry(x, false, c))]
      ..sort((a, b) => stamp(b.item).compareTo(stamp(a.item)));
    return Card(
      child: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Row(
              children: [
                avatar(c, 28),
                const SizedBox(width: 10),
                Expanded(
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text(
                        c.name,
                        style: const TextStyle(
                          fontWeight: FontWeight.bold,
                          fontSize: 19,
                        ),
                      ),
                      if (newItems > 0)
                        Text(
                          '$newItems new update${newItems == 1 ? '' : 's'}',
                          style: const TextStyle(color: gold, fontSize: 12),
                        ),
                    ],
                  ),
                ),
                TextButton(
                  onPressed: () => setState(() => tab = Tab.activity),
                  child: const Text('Open'),
                ),
              ],
            ),
            const SizedBox(height: 12),
            Row(
              children: [
                metric(
                  ps.length.toString(),
                  'photos',
                  onTap: () => setState(() {
                    tab = Tab.photos;
                    favoriteFilter = false;
                  }),
                ),
                metric(
                  rs.length.toString(),
                  'reports',
                  onTap: () => setState(() {
                    tab = Tab.activity;
                    activity = Activity.agenda;
                    activityTypeFilter = 'report';
                  }),
                ),
                metric(
                  moments(
                    c,
                  ).where((x) => favorites.contains(id(x))).length.toString(),
                  'favorites',
                  onTap: () => setState(() {
                    tab = Tab.photos;
                    favoriteFilter = true;
                  }),
                ),
                metric(
                  (data[c.id]?.badges.length ?? 0).toString(),
                  'badges',
                  onTap: badges,
                ),
              ],
            ),
            const Divider(height: 30),
            heading('Latest photos', () => setState(() => tab = Tab.photos)),
            if (ps.isEmpty)
              const Text('No photos for this period.')
            else
              SizedBox(
                height: 110,
                child: ListView.separated(
                  scrollDirection: Axis.horizontal,
                  itemCount: ps.length.clamp(0, 6),
                  separatorBuilder: (_, __) => const SizedBox(width: 8),
                  itemBuilder: (_, i) =>
                      SizedBox(width: 110, child: photo(ps[i], c)),
                ),
              ),
            const SizedBox(height: 12),
            heading(
              'Recent activity',
              () => setState(() => tab = Tab.activity),
            ),
            ...es.take(5).map(entry),
          ],
        ),
      ),
    );
  }

  Widget activityPage() => RefreshIndicator(
    onRefresh: refresh,
    child: ListView(
      padding: const EdgeInsets.all(16),
      children: [
        SegmentedButton<Activity>(
          segments: const [
            ButtonSegment(
              value: Activity.agenda,
              icon: Icon(Icons.view_agenda_outlined),
              label: Text('Agenda'),
            ),
            ButtonSegment(
              value: Activity.calendar,
              icon: Icon(Icons.calendar_month_outlined),
              label: Text('Calendar'),
            ),
          ],
          selected: {activity},
          onSelectionChanged: (x) => setState(() => activity = x.first),
        ),
        const SizedBox(height: 12),
        activity == Activity.agenda ? agenda() : calendar(),
      ],
    ),
  );
  Widget agenda() {
    final es =
        scope
            .expand(
              (c) => [
                ...moments(c).map((x) => Entry(x, true, c)),
                ...reports(c).map((x) => Entry(x, false, c)),
              ],
            )
            .where((x) => matches(x.item))
            .where(
              (entry) =>
                  activityTypeFilter == 'all' ||
                  (activityTypeFilter == 'photo'
                      ? entry.photo
                      : activityTypeFilter == 'report'
                      ? !entry.photo
                      : !entry.photo && type(entry.item) == activityTypeFilter),
            )
            .toList()
          ..sort((a, b) => stamp(b.item).compareTo(stamp(a.item)));
    return Column(
      children: [
        TextField(
          controller: search,
          onChanged: (_) => setState(() {}),
          decoration: InputDecoration(
            prefixIcon: const Icon(Icons.search),
            hintText: 'Search activity',
            suffixIcon: search.text.isEmpty
                ? null
                : IconButton(
                    onPressed: () {
                      search.clear();
                      setState(() {});
                    },
                    icon: const Icon(Icons.clear),
                  ),
          ),
        ),
        const SizedBox(height: 10),
        SingleChildScrollView(
          scrollDirection: Axis.horizontal,
          child: Row(
            children:
                [
                      ('all', 'All'),
                      ('photo', 'Photos'),
                      ('report', 'Reports'),
                      ('meal', 'Meals'),
                      ('potty', 'Potty'),
                      ('nap', 'Naps'),
                      ('bottle', 'Bottles'),
                      ('supplies', 'Supplies'),
                      ('general', 'Other'),
                    ]
                    .map(
                      (filter) => Padding(
                        padding: const EdgeInsets.only(right: 7),
                        child: ChoiceChip(
                          label: Text(filter.$2),
                          selected: activityTypeFilter == filter.$1,
                          onSelected: (_) =>
                              setState(() => activityTypeFilter = filter.$1),
                        ),
                      ),
                    )
                    .toList(),
          ),
        ),
        const SizedBox(height: 8),
        if (es.isEmpty)
          const Padding(
            padding: EdgeInsets.all(24),
            child: Text('No matching activity.'),
          )
        else ...[
          ...es.map(entry),
          if (scope.any((owner) {
            final snapshot = data[owner.id];
            return snapshot != null &&
                (snapshot.reports.length < snapshot.reportCount ||
                    snapshot.moments.length < snapshot.momentCount);
          }))
            Padding(
              padding: const EdgeInsets.symmetric(vertical: 18),
              child: OutlinedButton.icon(
                onPressed: loadingHistory ? null : loadMoreActivity,
                icon: loadingHistory
                    ? const SizedBox(
                        width: 18,
                        height: 18,
                        child: CircularProgressIndicator(strokeWidth: 2),
                      )
                    : const Icon(Icons.expand_more),
                label: Text(
                  loadingHistory
                      ? 'Loading older activity…'
                      : 'Load older activity',
                ),
              ),
            ),
        ],
      ],
    );
  }

  Widget calendar() {
    final first = DateTime(month.year, month.month),
        off =
            (first.weekday -
                (mondayWeek ? DateTime.monday : DateTime.sunday) +
                7) %
            7,
        total = DateTime(month.year, month.month + 1, 0).day;
    final calendarPhotos = scope.fold(
      0,
      (count, owner) =>
          count +
          moments(owner)
              .where(
                (item) => date(item).startsWith(
                  '${month.year}-${month.month.toString().padLeft(2, '0')}',
                ),
              )
              .length,
    );
    final calendarReports = scope.fold(
      0,
      (count, owner) =>
          count +
          reports(owner)
              .where(
                (item) => date(item).startsWith(
                  '${month.year}-${month.month.toString().padLeft(2, '0')}',
                ),
              )
              .length,
    );
    final weekdays = mondayWeek
        ? const ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
        : const ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];
    final es = selectedDay == null
        ? <Entry>[]
        : scope
              .expand(
                (c) => [
                  ...moments(c).map((x) => Entry(x, true, c)),
                  ...reports(c).map((x) => Entry(x, false, c)),
                ],
              )
              .where((x) => date(x.item) == dayKey(selectedDay!))
              .toList();
    return Column(
      children: [
        Card(
          child: Padding(
            padding: const EdgeInsets.fromLTRB(12, 10, 8, 10),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Row(
                  children: [
                    const Icon(Icons.calendar_month_outlined, color: gold),
                    const SizedBox(width: 8),
                    Expanded(
                      child: Text(
                        '${monthName(month)} ${month.year}',
                        style: const TextStyle(
                          fontWeight: FontWeight.bold,
                          fontSize: 18,
                        ),
                      ),
                    ),
                    IconButton(
                      tooltip: 'Choose date',
                      onPressed: pickCalendarDate,
                      icon: const Icon(Icons.edit_calendar_outlined),
                    ),
                  ],
                ),
                Text(
                  '${everyone ? 'Everyone' : child.name} · 📷 $calendarPhotos photos · 📋 $calendarReports reports',
                  style: const TextStyle(color: Colors.white70, fontSize: 12),
                ),
                const SizedBox(height: 4),
                Row(
                  children: [
                    IconButton(
                      onPressed: loadingHistory
                          ? null
                          : () => changeCalendarMonth(-1),
                      icon: const Icon(Icons.chevron_left),
                    ),
                    Expanded(
                      child: TextButton(
                        onPressed: () => setState(() {
                          month = DateTime(
                            DateTime.now().year,
                            DateTime.now().month,
                          );
                          selectedDay = DateTime.now();
                        }),
                        child: const Text('Today'),
                      ),
                    ),
                    IconButton(
                      onPressed:
                          month.isBefore(
                            DateTime(DateTime.now().year, DateTime.now().month),
                          )
                          ? (loadingHistory
                                ? null
                                : () => changeCalendarMonth(1))
                          : null,
                      icon: const Icon(Icons.chevron_right),
                    ),
                  ],
                ),
              ],
            ),
          ),
        ),
        const SizedBox(height: 8),
        Row(
          children: weekdays
              .map(
                (label) => Expanded(
                  child: Center(
                    child: Text(
                      label,
                      style: const TextStyle(
                        fontSize: 11,
                        color: Colors.white60,
                      ),
                    ),
                  ),
                ),
              )
              .toList(),
        ),
        const SizedBox(height: 4),
        GridView.builder(
          shrinkWrap: true,
          physics: const NeverScrollableScrollPhysics(),
          itemCount: off + total,
          gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
            crossAxisCount: 7,
          ),
          itemBuilder: (_, i) {
            if (i < off) return const SizedBox();
            final d = DateTime(month.year, month.month, i - off + 1);
            final n = scope.fold(
              0,
              (n, c) =>
                  n +
                  moments(c).where((x) => date(x) == dayKey(d)).length +
                  reports(c).where((x) => date(x) == dayKey(d)).length,
            );
            return InkWell(
              onTap: () => setState(() => selectedDay = d),
              child: Container(
                margin: const EdgeInsets.all(2),
                decoration: BoxDecoration(
                  color: sameDay(d, selectedDay)
                      ? gold
                      : n > 0
                      ? const Color(0xff3c4854)
                      : null,
                  borderRadius: BorderRadius.circular(7),
                ),
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Text(
                      d.day.toString(),
                      style: TextStyle(
                        color: sameDay(d, selectedDay) ? Colors.black : null,
                      ),
                    ),
                    if (n > 0)
                      Text(
                        n.toString(),
                        style: TextStyle(
                          fontSize: 10,
                          color: sameDay(d, selectedDay) ? Colors.black : gold,
                        ),
                      ),
                  ],
                ),
              ),
            );
          },
        ),
        if (selectedDay != null) ...[
          const Divider(height: 30),
          Row(
            children: [
              IconButton(
                onPressed: loadingHistory ? null : () => stepCalendarDay(-1),
                icon: const Icon(Icons.chevron_left),
                tooltip: 'Previous day',
              ),
              Expanded(
                child: Text(
                  dayName(selectedDay!),
                  textAlign: TextAlign.center,
                  style: const TextStyle(fontWeight: FontWeight.bold),
                ),
              ),
              IconButton(
                onPressed: loadingHistory ? null : () => stepCalendarDay(1),
                icon: const Icon(Icons.chevron_right),
                tooltip: 'Next day',
              ),
            ],
          ),
          GestureDetector(
            // This recognizer wins over the outer child switch only for the
            // calendar detail, preserving the original calendar day gesture.
            onHorizontalDragEnd: (details) {
              final velocity = details.primaryVelocity ?? 0;
              final width = MediaQuery.sizeOf(context).width;
              final commit =
                  calendarDrag.abs() > width * .24 || velocity.abs() > 650;
              final direction = calendarDrag < 0 || velocity < 0 ? 1 : -1;
              setState(() => calendarDrag = 0);
              if (commit) stepCalendarDay(direction);
            },
            onHorizontalDragUpdate: (details) =>
                setState(() => calendarDrag += details.delta.dx),
            child: Transform.translate(
              offset: Offset(calendarDrag, 0),
              child: AnimatedSwitcher(
                duration: const Duration(milliseconds: 280),
                switchInCurve: Curves.easeOutCubic,
                switchOutCurve: Curves.easeInCubic,
                transitionBuilder: (view, animation) => SlideTransition(
                  position: Tween<Offset>(
                    begin: Offset(calendarTransitionDirection * .10, 0),
                    end: Offset.zero,
                  ).animate(animation),
                  child: FadeTransition(opacity: animation, child: view),
                ),
                child: KeyedSubtree(
                  key: ValueKey(dayKey(selectedDay!)),
                  child: Column(children: es.map(entry).toList()),
                ),
              ),
            ),
          ),
        ],
      ],
    );
  }

  Future<void> pickCalendarDate() async {
    final picked = await showDatePicker(
      context: context,
      initialDate: selectedDay ?? month,
      firstDate: DateTime(2015),
      lastDate: DateTime.now(),
      helpText: 'Choose a day',
    );
    if (picked == null || !mounted) return;
    setState(() {
      month = DateTime(picked.year, picked.month);
      selectedDay = picked;
    });
    await changeCalendarMonth(0);
  }

  Widget photos() {
    final ps = moments(child)
        .where(
          (x) =>
              (!favoriteFilter || favorites.contains(id(x))) &&
              photoInRange(x) &&
              matches(x),
        )
        .toList();
    final groups = <String, List<Map<String, dynamic>>>{};
    for (final x in ps) (groups[date(x)] ??= []).add(x);
    return RefreshIndicator(
      onRefresh: refresh,
      child: ListView(
        padding: const EdgeInsets.all(16),
        children: [
          Row(
            children: [
              Expanded(
                child: TextField(
                  controller: search,
                  onChanged: (_) => setState(() {}),
                  decoration: const InputDecoration(
                    prefixIcon: Icon(Icons.search),
                    hintText: 'Search photos',
                  ),
                ),
              ),
              IconButton(
                onPressed: () =>
                    setState(() => favoriteFilter = !favoriteFilter),
                icon: Icon(
                  favoriteFilter ? Icons.star : Icons.star_border,
                  color: favoriteFilter ? gold : null,
                ),
              ),
              IconButton(
                tooltip: 'Select photos',
                onPressed: () => setState(() {
                  photoSelectionMode = !photoSelectionMode;
                  if (!photoSelectionMode) selectedPhotos = {};
                }),
                icon: Icon(
                  photoSelectionMode
                      ? Icons.close
                      : Icons.check_box_outline_blank,
                ),
              ),
            ],
          ),
          const SizedBox(height: 8),
          Wrap(
            spacing: 8,
            runSpacing: 6,
            children: [
              ChoiceChip(
                label: const Text('All loaded'),
                selected: photoRange == PhotoRange.all,
                onSelected: (_) => setState(() => photoRange = PhotoRange.all),
              ),
              ChoiceChip(
                label: const Text('Today'),
                selected: photoRange == PhotoRange.today,
                onSelected: (_) =>
                    setState(() => photoRange = PhotoRange.today),
              ),
              ChoiceChip(
                label: const Text('This week'),
                selected: photoRange == PhotoRange.week,
                onSelected: (_) => setState(() => photoRange = PhotoRange.week),
              ),
              if (hiddenPhotoCount(child) > 0)
                ActionChip(
                  avatar: const Icon(Icons.restore, size: 18),
                  label: Text(
                    'Restore hidden (' +
                        hiddenPhotoCount(child).toString() +
                        ')',
                  ),
                  onPressed: restoreHiddenPhotos,
                ),
            ],
          ),
          if (photoSelectionMode)
            Card(
              color: const Color(0xff3c4854),
              child: ListTile(
                leading: const Icon(
                  Icons.download_for_offline_outlined,
                  color: gold,
                ),
                title: Text(
                  batchDownloading
                      ? 'Downloading $batchDownloadProgress of ${selectedPhotos.length}'
                      : selectedPhotos.isEmpty
                      ? 'Select photos to download'
                      : '${selectedPhotos.length} selected',
                ),
                trailing: FilledButton(
                  onPressed: selectedPhotos.isEmpty || batchDownloading
                      ? null
                      : saveSelectedPhotos,
                  child: Text(batchDownloading ? 'Working…' : 'Download'),
                ),
              ),
            ),
          if (groups.isEmpty)
            const Padding(
              padding: EdgeInsets.all(30),
              child: Text('No photos found.'),
            ),
          ...groups.entries.map(
            (g) => Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Padding(
                  padding: const EdgeInsets.only(top: 14, bottom: 7),
                  child: Text(
                    readDate(g.key),
                    style: const TextStyle(fontWeight: FontWeight.bold),
                  ),
                ),
                GridView.builder(
                  shrinkWrap: true,
                  physics: const NeverScrollableScrollPhysics(),
                  itemCount: g.value.length,
                  gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
                    crossAxisCount: 3,
                    crossAxisSpacing: 6,
                    mainAxisSpacing: 6,
                  ),
                  itemBuilder: (_, i) => photo(
                    g.value[i],
                    child,
                    selecting: photoSelectionMode,
                    selected: selectedPhotos.contains(id(g.value[i])),
                  ),
                ),
              ],
            ),
          ),
          if ((data[child.id]?.moments.length ?? 0) <
              (data[child.id]?.momentCount ?? 0))
            Padding(
              padding: const EdgeInsets.only(top: 18, bottom: 30),
              child: OutlinedButton.icon(
                onPressed: loadingMore ? null : loadMorePhotos,
                icon: loadingMore
                    ? const SizedBox(
                        width: 18,
                        height: 18,
                        child: CircularProgressIndicator(strokeWidth: 2),
                      )
                    : const Icon(Icons.expand_more),
                label: Text(
                  loadingMore ? 'Loading older photos…' : 'Load older photos',
                ),
              ),
            ),
        ],
      ),
    );
  }

  Widget insights() {
    final allPhotos = moments(child);
    final allReports = reports(child);
    bool withinRange(Map<String, dynamic> item) {
      final key = date(item);
      if (insightRange == InsightRange.loaded) return true;
      if (insightRange == InsightRange.today)
        return key == dayKey(DateTime.now());
      return key.compareTo(dayKey(weekStartFor(DateTime.now()))) >= 0;
    }

    final ps = allPhotos.where(withinRange).toList();
    final rs = allReports.where(withinRange).toList();
    final activities = _countTop(
      ps.map(
        (x) => (x['Lesson'] ?? x['Subject'] ?? 'Classroom photo').toString(),
      ),
    );
    final types = _countTop(rs.map(title));
    final activeDays = ps.map(date).where((x) => x.isNotEmpty).toSet().length;
    final average = activeDays == 0
        ? '0'
        : (ps.length / activeDays).toStringAsFixed(1);
    final heatCounts = <String, int>{};
    for (final item in [...allPhotos, ...allReports]) {
      final key = date(item);
      if (key.isNotEmpty) heatCounts[key] = (heatCounts[key] ?? 0) + 1;
    }
    final heatMax = heatCounts.values.fold<int>(1, (a, b) => a > b ? a : b);
    return ListView(
      padding: const EdgeInsets.all(16),
      children: [
        const Text(
          'Insights',
          style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
        ),
        const Text(
          'Based on loaded Honeycomb history',
          style: TextStyle(color: Colors.white60),
        ),
        const SizedBox(height: 12),
        Wrap(
          spacing: 8,
          children: [
            ChoiceChip(
              label: const Text('Loaded history'),
              selected: insightRange == InsightRange.loaded,
              onSelected: (_) =>
                  setState(() => insightRange = InsightRange.loaded),
            ),
            ChoiceChip(
              label: const Text('Today'),
              selected: insightRange == InsightRange.today,
              onSelected: (_) =>
                  setState(() => insightRange = InsightRange.today),
            ),
            ChoiceChip(
              label: const Text('This week'),
              selected: insightRange == InsightRange.week,
              onSelected: (_) =>
                  setState(() => insightRange = InsightRange.week),
            ),
          ],
        ),
        const SizedBox(height: 12),
        Card(
          child: Padding(
            padding: const EdgeInsets.all(16),
            child: Column(
              children: [
                Row(
                  children: [
                    metric(ps.length.toString(), 'Photos'),
                    metric(rs.length.toString(), 'Reports'),
                    metric(average, 'Photos / active day'),
                  ],
                ),
              ],
            ),
          ),
        ),
        const SizedBox(height: 14),
        _insightBars('Top activities', activities),
        const SizedBox(height: 12),
        _insightBars('Report types', types),
        const SizedBox(height: 18),
        const Text(
          'Activity heatmap · last 12 weeks',
          style: TextStyle(fontWeight: FontWeight.bold),
        ),
        const SizedBox(height: 8),
        Wrap(
          spacing: 4,
          runSpacing: 4,
          children: List.generate(84, (i) {
            final d = DateTime.now().subtract(Duration(days: 83 - i));
            final n = heatCounts[dayKey(d)] ?? 0;
            return Container(
              width: 19,
              height: 19,
              decoration: BoxDecoration(
                color: n == 0
                    ? const Color(0xff36404b)
                    : Color.lerp(
                        const Color(0xff71602d),
                        gold,
                        (n / heatMax).clamp(0, 1),
                      ),
                borderRadius: BorderRadius.circular(5),
              ),
              child: Tooltip(
                message: '${readDate(dayKey(d))}: $n items',
                child: const SizedBox.expand(),
              ),
            );
          }),
        ),
        const SizedBox(height: 14),
        const Text(
          'Statistics use the history currently loaded on this device.',
          style: TextStyle(color: Colors.white60),
        ),
      ],
    );
  }

  List<MapEntry<String, int>> _countTop(Iterable<String> labels) {
    final counts = <String, int>{};
    for (final label in labels) {
      final value = label.trim();
      if (value.isNotEmpty) counts[value] = (counts[value] ?? 0) + 1;
    }
    final values = counts.entries.toList()
      ..sort((a, b) => b.value.compareTo(a.value));
    return values;
  }

  Widget _insightBars(String heading, List<MapEntry<String, int>> entries) {
    final max = entries.isEmpty ? 1 : entries.first.value;
    return Card(
      child: Padding(
        padding: const EdgeInsets.all(14),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(
              heading,
              style: const TextStyle(fontSize: 17, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 8),
            if (entries.isEmpty)
              const Text(
                'Not enough data yet.',
                style: TextStyle(color: Colors.white60),
              )
            else
              ...entries
                  .take(8)
                  .map(
                    (entry) => Padding(
                      padding: const EdgeInsets.symmetric(vertical: 5),
                      child: Row(
                        children: [
                          SizedBox(
                            width: 112,
                            child: Text(
                              entry.key,
                              maxLines: 1,
                              overflow: TextOverflow.ellipsis,
                            ),
                          ),
                          Expanded(
                            child: ClipRRect(
                              borderRadius: BorderRadius.circular(4),
                              child: LinearProgressIndicator(
                                value: entry.value / max,
                                minHeight: 8,
                                color: gold,
                                backgroundColor: const Color(0xff3a4650),
                              ),
                            ),
                          ),
                          const SizedBox(width: 9),
                          Text('${entry.value}'),
                        ],
                      ),
                    ),
                  ),
          ],
        ),
      ),
    );
  }

  Future<void> more() async {
    await showModalBottomSheet(
      context: context,
      showDragHandle: true,
      builder: (c) => SafeArea(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            const ListTile(
              title: Text(
                'More',
                style: TextStyle(fontWeight: FontWeight.bold),
              ),
            ),
            ListTile(
              leading: const Icon(Icons.star_outline),
              title: const Text('Favorites'),
              subtitle: const Text('Saved photos'),
              onTap: () {
                Navigator.pop(c);
                setState(() {
                  tab = Tab.photos;
                  favoriteFilter = true;
                });
              },
            ),
            ListTile(
              leading: const Icon(Icons.workspace_premium_outlined),
              title: const Text('Badges'),
              subtitle: const Text('Achievements'),
              onTap: () {
                Navigator.pop(c);
                badges();
              },
            ),
            ListTile(
              leading: const Icon(Icons.account_circle_outlined),
              title: Text('${child.firstName}\'s profile photo'),
              subtitle: const Text('Choose and crop a circular photo'),
              onTap: () {
                Navigator.pop(c);
                chooseChildPhoto();
              },
            ),
            ListTile(
              leading: const Icon(Icons.settings_outlined),
              title: const Text('Settings'),
              subtitle: Text(
                autoRefresh
                    ? 'Auto-refresh on · every 5 minutes'
                    : 'Auto-refresh off',
              ),
              onTap: () {
                Navigator.pop(c);
                settings();
              },
            ),
          ],
        ),
      ),
    );
  }

  Future<void> settings() async {
    await showModalBottomSheet(
      context: context,
      showDragHandle: true,
      builder: (c) => StatefulBuilder(
        builder: (c, localSetState) => SafeArea(
          child: SingleChildScrollView(
            child: Column(
              mainAxisSize: MainAxisSize.min,
              children: [
                const ListTile(
                  title: Text(
                    'Settings',
                    style: TextStyle(fontWeight: FontWeight.bold),
                  ),
                ),
                SwitchListTile(
                  secondary: const Icon(Icons.refresh),
                  title: const Text('Auto-refresh'),
                  subtitle: const Text('Check Honeycomb every 5 minutes'),
                  value: autoRefresh,
                  onChanged: (value) {
                    setState(() => autoRefresh = value);
                    localSetState(() {});
                    configureAutoRefresh();
                    save();
                  },
                ),
                SwitchListTile(
                  secondary: const Icon(Icons.calendar_today_outlined),
                  title: const Text('Week starts on Monday'),
                  subtitle: Text(
                    mondayWeek
                        ? 'Monday through Sunday'
                        : 'Sunday through Saturday',
                  ),
                  value: mondayWeek,
                  onChanged: (value) {
                    setState(() {
                      mondayWeek = value;
                      selectedWeek = weekStartFor(selectedWeek);
                    });
                    localSetState(() {});
                    save();
                  },
                ),
                ValueListenableBuilder<ThemeMode>(
                  valueListenable: appThemeMode,
                  builder: (_, mode, __) => ListTile(
                    leading: Icon(
                      mode == ThemeMode.light
                          ? Icons.light_mode_outlined
                          : Icons.dark_mode_outlined,
                    ),
                    title: const Text('Appearance'),
                    subtitle: const Text('Choose how Honeycomb Family looks'),
                    trailing: DropdownButton<ThemeMode>(
                      value: mode,
                      underline: const SizedBox(),
                      items: const [
                        DropdownMenuItem(
                          value: ThemeMode.light,
                          child: Text('Light'),
                        ),
                        DropdownMenuItem(
                          value: ThemeMode.dark,
                          child: Text('Dark'),
                        ),
                        DropdownMenuItem(
                          value: ThemeMode.system,
                          child: Text('System'),
                        ),
                      ],
                      onChanged: (next) async {
                        if (next == null) return;
                        appThemeMode.value = next;
                        await secure.write(
                          key: 'honeycomb_theme',
                          value: next.name,
                        );
                      },
                    ),
                  ),
                ),
                const Divider(),
                ListTile(
                  leading: const Icon(Icons.account_circle_outlined),
                  title: const Text('Signed in account'),
                  subtitle: Text(
                    savedEmail.isEmpty ? 'Honeycomb Family' : savedEmail,
                  ),
                ),
                ListTile(
                  leading: const Icon(Icons.switch_account_outlined),
                  title: const Text('Switch account'),
                  subtitle: const Text('Sign out on this device'),
                  onTap: () async {
                    Navigator.pop(c);
                    await signOut();
                  },
                ),
                const SizedBox(height: 12),
              ],
            ),
          ),
        ),
      ),
    );
  }

  Future<void> signOut() async {
    final approved = await showDialog<bool>(
      context: context,
      builder: (c) => AlertDialog(
        title: const Text('Switch Honeycomb account?'),
        content: const Text(
          'This only removes the saved sign-in from this device.',
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(c, false),
            child: const Text('Cancel'),
          ),
          FilledButton(
            onPressed: () => Navigator.pop(c, true),
            child: const Text('Sign out'),
          ),
        ],
      ),
    );
    if (approved != true || !mounted) return;
    await secure.delete(key: 'honeycomb_email');
    await secure.delete(key: 'honeycomb_password');
    await secure.delete(key: 'honeycomb_session');
    await clearNotificationSession();
    if (!mounted) return;
    Navigator.of(context).pushAndRemoveUntil(
      MaterialPageRoute(builder: (_) => const Login()),
      (route) => false,
    );
  }

  Future<void> badges() async {
    // The child snapshot already contains earned badges.  Show that useful
    // portion immediately, then merge it into Honeycomb's paged catalog once
    // the catalog request completes.
    final earnedNow = List<Map<String, dynamic>>.from(
      data[child.id]?.badges ?? const [],
    );
    final f = Future.wait<List<Map<String, dynamic>>>([
      widget.api.badgeCatalog(child.id),
      widget.api.badgeCategories(),
    ]).then((values) => _mergeBadges(earnedNow, values[0], values[1]));
    await showModalBottomSheet(
      context: context,
      isScrollControlled: true,
      builder: (c) => DraggableScrollableSheet(
        expand: false,
        builder: (_, scroll) => FutureBuilder<List<Map<String, dynamic>>>(
          future: f,
          builder: (_, s) {
            final collection =
                s.data ?? _mergeBadges(earnedNow, const [], const []);
            final earned = collection.where(_badgeEarned).toList();
            final unearned = collection
                .where((badge) => !_badgeEarned(badge))
                .toList();
            final groupedEarned = _badgeGroups(earned);
            final groupedUnearned = _badgeGroups(unearned);
            return ListView(
              controller: scroll,
              padding: const EdgeInsets.fromLTRB(20, 12, 20, 36),
              children: [
                Row(
                  children: [
                    CircleAvatar(
                      radius: 25,
                      backgroundColor: gold,
                      child: const Icon(
                        Icons.workspace_premium,
                        color: Colors.black,
                      ),
                    ),
                    const SizedBox(width: 12),
                    Expanded(
                      child: Column(
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: [
                          const Text(
                            'Achievements',
                            style: TextStyle(color: gold),
                          ),
                          Text(
                            child.firstName,
                            style: const TextStyle(
                              fontSize: 24,
                              fontWeight: FontWeight.bold,
                            ),
                          ),
                          Text(
                            s.hasData
                                ? '${earned.length} earned badges · ${unearned.length} still to earn'
                                : '${earned.length} earned badges',
                          ),
                        ],
                      ),
                    ),
                  ],
                ),
                const SizedBox(height: 22),
                const Text(
                  'Earned badges',
                  style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
                ),
                const SizedBox(height: 8),
                if (earned.isEmpty)
                  const Padding(
                    padding: EdgeInsets.symmetric(vertical: 16),
                    child: Text('No earned badges yet.'),
                  )
                else
                  ...groupedEarned.entries.map(
                    (entry) => _badgeGroup(entry, true),
                  ),
                if (!s.hasData) ...[
                  const Padding(
                    padding: EdgeInsets.only(top: 22),
                    child: Center(child: CircularProgressIndicator()),
                  ),
                  const Padding(
                    padding: EdgeInsets.only(top: 10),
                    child: Center(child: Text('Loading the badge collection…')),
                  ),
                ] else ...[
                  const SizedBox(height: 24),
                  Row(
                    children: [
                      const Expanded(
                        child: Text(
                          'Still to earn',
                          style: TextStyle(
                            fontSize: 18,
                            fontWeight: FontWeight.bold,
                          ),
                        ),
                      ),
                      Text(
                        '${unearned.length}',
                        style: const TextStyle(
                          color: gold,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                    ],
                  ),
                  const SizedBox(height: 8),
                  if (unearned.isEmpty)
                    const Padding(
                      padding: EdgeInsets.symmetric(vertical: 16),
                      child: Text('Every available badge has been earned!'),
                    )
                  else
                    ...groupedUnearned.entries.map(
                      (entry) => _badgeGroup(entry, false),
                    ),
                ],
              ],
            );
          },
        ),
      ),
    );
  }

  String _badgeId(Map<String, dynamic> badge) =>
      '${badge['BadgeID'] ?? badge['BadgeId'] ?? badge['ID'] ?? badge['Id'] ?? badge}';

  bool _badgeEarned(Map<String, dynamic> badge) =>
      badge['__hcfdEarned'] == true ||
      badge['IsEarned'] == true ||
      (badge['EarnedDate'] ?? '').toString().isNotEmpty;

  List<Map<String, dynamic>> _mergeBadges(
    List<Map<String, dynamic>> earned,
    List<Map<String, dynamic>> catalog,
    List<Map<String, dynamic>> categories,
  ) {
    final categoryNames = <String, String>{
      for (final category in categories)
        '${category['BadgeCategoryID'] ?? category['CategoryID'] ?? category['ID'] ?? category['Id']}':
            (category['Name'] ?? category['CategoryName'] ?? '').toString(),
    };
    final earnedIds = earned.map(_badgeId).toSet();
    final merged = <String, Map<String, dynamic>>{};
    for (final badge in catalog) {
      final key = _badgeId(badge);
      merged[key] = {
        ...badge,
        '__hcfdEarned': earnedIds.contains(key) || _badgeEarned(badge),
      };
    }
    for (final badge in earned) {
      final key = _badgeId(badge);
      merged[key] = {
        ...(merged[key] ?? const {}),
        ...badge,
        '__hcfdEarned': true,
      };
    }
    final values = merged.values.map((badge) {
      final categoryId =
          '${badge['BadgeCategoryID'] ?? badge['CategoryID'] ?? ''}';
      final name = (badge['Category'] ?? badge['CategoryName'] ?? '')
          .toString();
      return {
        ...badge,
        if (name.isEmpty && (categoryNames[categoryId] ?? '').isNotEmpty)
          'CategoryName': categoryNames[categoryId],
      };
    }).toList();
    values.sort((a, b) {
      final earnedOrder = (_badgeEarned(b) ? 1 : 0) - (_badgeEarned(a) ? 1 : 0);
      if (earnedOrder != 0) return earnedOrder;
      return _badgeName(a).compareTo(_badgeName(b));
    });
    return values;
  }

  String _badgeName(Map<String, dynamic> badge) =>
      (badge['Value'] ??
              badge['BadgeName'] ??
              badge['Name'] ??
              badge['Title'] ??
              'Badge')
          .toString();

  Map<String, List<Map<String, dynamic>>> _badgeGroups(
    List<Map<String, dynamic>> badges,
  ) {
    final groups = <String, List<Map<String, dynamic>>>{};
    for (final badge in badges) {
      final category =
          (badge['Category'] ?? badge['CategoryName'] ?? 'Other achievements')
              .toString();
      groups
          .putIfAbsent(
            category.isEmpty ? 'Other achievements' : category,
            () => [],
          )
          .add(badge);
    }
    return groups;
  }

  Widget _badgeGroup(
    MapEntry<String, List<Map<String, dynamic>>> group,
    bool earned,
  ) => ExpansionTile(
    initiallyExpanded: earned,
    tilePadding: EdgeInsets.zero,
    title: Text(group.key, style: const TextStyle(fontWeight: FontWeight.w600)),
    trailing: Text(
      '${group.value.length}',
      style: const TextStyle(color: gold),
    ),
    children: group.value.map((badge) => _badgeTile(badge, earned)).toList(),
  );

  Widget _badgeTile(Map<String, dynamic> badge, bool earned) {
    final filename = (badge['Filename'] ?? '').toString();
    return ListTile(
      contentPadding: const EdgeInsets.symmetric(horizontal: 4),
      leading: CircleAvatar(
        backgroundColor: earned ? gold : const Color(0xff4d5660),
        child: filename.isEmpty
            ? Icon(
                Icons.workspace_premium,
                color: earned ? Colors.black : Colors.white70,
              )
            : ClipOval(
                child: CachedNetworkImage(
                  imageUrl: widget.api.imageUrl(filename),
                  httpHeaders: widget.api.imageHeaders,
                  fit: BoxFit.cover,
                  width: 40,
                  height: 40,
                  errorWidget: (_, __, ___) => Icon(
                    Icons.workspace_premium,
                    color: earned ? Colors.black : Colors.white70,
                  ),
                ),
              ),
      ),
      title: Text(_badgeName(badge)),
      subtitle: (badge['Description'] ?? '').toString().trim().isEmpty
          ? null
          : Text(
              (badge['Description']).toString(),
              maxLines: 2,
              overflow: TextOverflow.ellipsis,
            ),
      trailing: earned
          ? const Icon(Icons.check_circle, color: gold)
          : const Text('Not earned', style: TextStyle(fontSize: 12)),
    );
  }

  void supplies(List<(FamilyChild, Map<String, dynamic>)> rows) =>
      showModalBottomSheet(
        context: context,
        showDragHandle: true,
        builder: (c) => ListView(
          shrinkWrap: true,
          children: [
            const ListTile(
              leading: Icon(Icons.inventory_2_outlined, color: gold),
              title: Text(
                'Supplies needed',
                style: TextStyle(fontWeight: FontWeight.bold),
              ),
              subtitle: Text('Requests from the past 5 business days'),
            ),
            ...rows.map(
              (e) => Card(
                margin: const EdgeInsets.symmetric(horizontal: 12, vertical: 4),
                child: ListTile(
                  leading: const Text('🧺', style: TextStyle(fontSize: 23)),
                  title: Text('${e.$1.firstName}: ${title(e.$2)}'),
                  subtitle: Text(
                    [
                      if ((e.$2['ChildCondition'] ?? '')
                          .toString()
                          .trim()
                          .isNotEmpty)
                        (e.$2['ChildCondition']).toString().trim(),
                      '${supplyAlertAge(e.$2)} · ${eventTime(e.$2)}',
                      if (reportHasNote(e.$2)) '📝 Note available',
                    ].join('\n'),
                  ),
                  isThreeLine:
                      reportHasNote(e.$2) ||
                      (e.$2['ChildCondition'] ?? '')
                          .toString()
                          .trim()
                          .isNotEmpty,
                  onTap: reportHasNote(e.$2) ? () => report(e.$2, e.$1) : null,
                  trailing: TextButton(
                    onPressed: () {
                      setState(() => ack.add(id(e.$2)));
                      save();
                      Navigator.pop(c);
                    },
                    child: const Text('Mark seen'),
                  ),
                ),
              ),
            ),
          ],
        ),
      );

  String supplyAlertAge(Map<String, dynamic> report) {
    final value = stamp(report);
    final when = DateTime.tryParse(value);
    if (when == null) return 'Recently';
    final elapsed = DateTime.now().difference(when);
    if (elapsed.inMinutes < 2) return 'Just now';
    if (elapsed.inHours < 1) return '${elapsed.inMinutes} minutes ago';
    if (elapsed.inDays == 0)
      return '${elapsed.inHours} hour${elapsed.inHours == 1 ? '' : 's'} ago';
    if (elapsed.inDays == 1) return 'Yesterday';
    return '${elapsed.inDays} days ago';
  }

  Future<void> saveSelectedPhotos() async {
    final items = moments(
      child,
    ).where((item) => selectedPhotos.contains(id(item))).toList();
    setState(() {
      batchDownloading = true;
      batchDownloadProgress = 0;
    });
    var saved = 0;
    for (final item in items) {
      try {
        final bytes = await widget.api.originalPhotoBytes(
          (item['Filename'] ?? item['ImageUrl'] ?? '').toString(),
        );
        final result = await ImageGallerySaverPlus.saveImage(
          bytes,
          quality: 100,
          name: 'Honeycomb_${id(item)}',
        );
        if (result is Map && result['isSuccess'] == true) saved++;
      } catch (_) {}
      if (mounted) setState(() => batchDownloadProgress++);
    }
    if (!mounted) return;
    setState(() {
      photoSelectionMode = false;
      selectedPhotos = {};
      batchDownloading = false;
      batchDownloadProgress = 0;
    });
    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(
        content: Text('$saved of ${items.length} photos saved to Photos.'),
      ),
    );
  }

  Widget photo(
    Map<String, dynamic> x,
    FamilyChild owner, {
    bool selecting = false,
    bool selected = false,
  }) => InkWell(
    onTap: () => selecting
        ? setState(
            () => selectedPhotos.contains(id(x))
                ? selectedPhotos.remove(id(x))
                : selectedPhotos.add(id(x)),
          )
        : viewer(x, owner),
    child: ClipRRect(
      borderRadius: BorderRadius.circular(9),
      child: Stack(
        fit: StackFit.expand,
        children: [
          CachedNetworkImage(
            imageUrl: widget.api.imageUrl(
              (x['Filename'] ?? x['ImageUrl'] ?? '').toString(),
              thumbnail: true,
            ),
            // v2 discards entries written before authenticated image headers
            // were supplied (some devices cached Honeycomb's HTML login page).
            cacheKey:
                'hc-thumb-v2-' +
                (x['Filename'] ?? x['ImageUrl'] ?? '').toString(),
            httpHeaders: widget.api.imageHeaders,
            fit: BoxFit.cover,
            placeholder: (_, __) => const ColoredBox(color: Color(0xff3a4650)),
            errorWidget: (_, __, ___) => const ColoredBox(
              color: Color(0xff3a4650),
              child: Icon(Icons.photo),
            ),
          ),
          Positioned(
            top: 2,
            right: 2,
            child: Icon(
              favorites.contains(id(x)) ? Icons.star : Icons.star_border,
              color: gold,
              size: 20,
            ),
          ),
          if (selecting)
            Positioned(
              left: 4,
              bottom: 4,
              child: Icon(
                selected ? Icons.check_circle : Icons.radio_button_unchecked,
                color: selected ? gold : Colors.white,
              ),
            ),
        ],
      ),
    ),
  );
  void viewer(Map<String, dynamic> x, FamilyChild owner) {
    final safe = moments(owner);
    var index = safe.indexWhere((v) => id(v) == id(x));
    showDialog(
      context: context,
      builder: (_) => Viewer(
        api: widget.api,
        items: safe,
        start: index < 0 ? 0 : index,
        favorites: favorites,
        onFavorite: (v) {
          setState(() {
            favorites.contains(v) ? favorites.remove(v) : favorites.add(v);
          });
          save();
        },
        onHide: (v) {
          setState(() => hidden.add('${owner.id}:$v'));
          save();
        },
        onLoadMore: () async {
          await loadMorePhotos(owner);
          return moments(owner);
        },
      ),
    );
  }

  Widget entry(Entry e) {
    final reportKind = type(e.item);
    final hasNote = !e.photo && reportHasNote(e.item);
    final rawCaption = e.photo ? photoTitle(e.item) : title(e.item);
    // Honeycomb labels otherwise-unnamed note reports as “Message”.
    final caption = hasNote && rawCaption == 'Daily report'
        ? 'Message'
        : rawCaption;
    final canOpen = e.photo || hasNote;
    final detail = e.photo
        ? (e.item['Lesson'] ?? e.item['Subject'] ?? '').toString().trim()
        : reportOutcome(e.item, reportKind);
    final reportColor = reportAccent(reportKind);
    return Card(
      margin: const EdgeInsets.only(bottom: 7),
      color: e.photo ? null : reportColor.withValues(alpha: .26),
      shape: RoundedRectangleBorder(
        borderRadius: BorderRadius.circular(13),
        side: BorderSide(
          color: e.photo ? Colors.transparent : reportColor,
          width: 1.5,
        ),
      ),
      child: ListTile(
        leading: CircleAvatar(
          backgroundColor: e.photo
              ? const Color(0xff41515e)
              : reportColor.withValues(alpha: .34),
          child: e.photo
              ? const Text('📷', style: TextStyle(fontSize: 22))
              : reportIcon(reportKind, e.item),
        ),
        title: Row(
          children: [
            Expanded(child: Text(caption)),
            if (hasNote)
              const Text(
                '📝 Note',
                style: TextStyle(fontSize: 11, color: gold),
              ),
          ],
        ),
        subtitle: Text(
          [
            e.child.firstName,
            if (detail.isNotEmpty && detail != caption) detail,
            readDate(date(e.item)),
            if (eventTime(e.item).isNotEmpty) eventTime(e.item),
          ].join(' · '),
          maxLines: 2,
          overflow: TextOverflow.ellipsis,
        ),
        trailing: e.photo
            ? const Icon(Icons.open_in_full)
            : (canOpen ? const Icon(Icons.chevron_right) : null),
        onTap: canOpen
            ? () => e.photo ? viewer(e.item, e.child) : report(e.item, e.child)
            : null,
      ),
    );
  }

  Widget reportIcon(String kind, [Map<String, dynamic>? report]) =>
      Text(reportEmoji(kind, report), style: const TextStyle(fontSize: 22));

  String reportEmoji(String kind, [Map<String, dynamic>? report]) {
    final mealLabel = (report?['GenericReportInfo'] ?? '')
        .toString()
        .toLowerCase();
    if (kind == 'meal') {
      if (mealLabel.contains('breakfast')) return '🥞';
      if (mealLabel.contains('lunch')) return '🥪';
      if (mealLabel.contains('snack')) return '🍎';
      return '🍴';
    }
    return switch (kind) {
      'potty' => '🚽',
      'diaper' => '🩲',
      'supplies' => '🧺',
      'nap' => '😴',
      'bottle' => '🍼',
      _ => '📋',
    };
  }

  Color reportAccent(String kind) => switch (kind) {
    'meal' => const Color(0xff2e9e66),
    'potty' => const Color(0xff238bd0),
    'diaper' => const Color(0xffd4982b),
    'supplies' => const Color(0xffd4982b),
    'nap' => const Color(0xff7564be),
    'bottle' => const Color(0xffcf4d86),
    _ => const Color(0xff66768a),
  };

  String photoTitle(Map<String, dynamic> moment) {
    final subject = (moment['Subject'] ?? '').toString().trim();
    final lesson = (moment['Lesson'] ?? '').toString().trim();
    final internal =
        subject.isEmpty ||
        RegExp(
          r'^(memo|classroom moment|photo|picture)$',
          caseSensitive: false,
        ).hasMatch(subject);
    return internal ? (lesson.isEmpty ? 'Classroom photo' : lesson) : subject;
  }

  Future<Map<String, dynamic>> _reportDetail(
    Map<String, dynamic> report,
    FamilyChild owner,
  ) async {
    final reportId = (report['DailyReportId'] ?? report['DailyReportID'] ?? '')
        .toString();
    final key = '${owner.id}:$reportId';
    final cached = reportDetailCache[key];
    // Match the live API response shape. Returning the raw cached map made a
    // note disappear whenever the report was opened a second time.
    if (cached != null) return {'Data': cached};
    final loaded = await widget.api.reportDetail(reportId, owner.id);
    final detail = loaded['Data'];
    if (detail is Map<String, dynamic>) reportDetailCache[key] = detail;
    return loaded;
  }

  String reportNote(Map<String, dynamic> report) {
    final notes = <String>{};
    void collect(
      dynamic value, [
      String key = '',
      int depth = 0,
      bool inNote = false,
    ]) {
      if (value == null || depth > 3) return;
      final metadata = RegExp(
        r'hasnote|noteexists|(^id$|id$|created|updated)',
        caseSensitive: false,
      ).hasMatch(key);
      final noteKey =
          inNote ||
          RegExp(
            r'comment|note|remark|message|description',
            caseSensitive: false,
          ).hasMatch(key);
      if (value is String || value is num) {
        final text = value.toString().trim();
        if (noteKey && !metadata && text.isNotEmpty) notes.add(text);
      } else if (value is Map) {
        value.forEach((k, v) => collect(v, '$k', depth + 1, noteKey));
      } else if (value is List) {
        for (final item in value) collect(item, key, depth + 1, noteKey);
      }
    }

    collect(report);
    return notes.join('\n');
  }

  bool reportHasNote(Map<String, dynamic> report) =>
      reportNote(report).isNotEmpty ||
      report.entries.any(
        (entry) =>
            RegExp(
              r'hasnote|noteexists',
              caseSensitive: false,
            ).hasMatch(entry.key) &&
            (entry.value == true ||
                entry.value == 1 ||
                '${entry.value}'.toLowerCase() == 'true'),
      );

  List<(String, String)> reportFields(Map<String, dynamic> report) {
    const hidden = {
      'dailyreportid',
      'dailyreporttypeid',
      'childid',
      'created',
      'date',
      'groupdate',
      'startdate',
      'genericreportinfo',
      'childcondition',
      'comment',
      'comments',
      'notes',
      'note',
      'remarks',
      'remark',
      'message',
      'description',
    };
    String label(String key) => key.replaceAllMapped(
      RegExp(r'([a-z])([A-Z])'),
      (match) => '${match[1]} ${match[2]}',
    );
    String value(dynamic input) => input?.toString().trim() ?? '';

    return report.entries
        .where(
          (entry) =>
              !hidden.contains(entry.key.toLowerCase()) &&
              entry.value is! Map &&
              entry.value is! List &&
              !RegExp(
                r'(^id$|id$|^day$|dayasnumber|hasnote|created|updated|timestamp|^timestart$|^timeend$)',
                caseSensitive: false,
              ).hasMatch(entry.key),
        )
        .map((entry) => (label(entry.key), value(entry.value)))
        .where((entry) => entry.$2.isNotEmpty)
        .take(12)
        .toList();
  }

  void report(Map<String, dynamic> r, FamilyChild c) => showDialog(
    context: context,
    builder: (dialogContext) => Dialog(
      insetPadding: const EdgeInsets.all(20),
      child: ConstrainedBox(
        constraints: BoxConstraints(
          maxWidth: 540,
          maxHeight: MediaQuery.sizeOf(dialogContext).height * .82,
        ),
        child: FutureBuilder<Map<String, dynamic>>(
          future: _reportDetail(r, c),
          builder: (_, s) {
            final detail = s.data?['Data'];
            final detailMap = detail is Map
                ? Map<String, dynamic>.from(detail)
                : <String, dynamic>{};
            // Detail payloads are often sparse. Keep the summary fields as a
            // fallback rather than making a visible note disappear on load.
            final x = {...r, ...detailMap};
            final fields = reportFields(x);
            final detailedNote = reportNote(detailMap);
            final note = detailedNote.isEmpty ? reportNote(r) : detailedNote;
            final reportTitle = title(x);
            final dialogTitle =
                reportHasNote(r) && reportTitle == 'Daily report'
                ? 'Message'
                : reportTitle;
            return Padding(
              padding: const EdgeInsets.all(24),
              child: SingleChildScrollView(
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Text(
                      dialogTitle,
                      style: const TextStyle(
                        fontSize: 24,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                    Align(
                      alignment: Alignment.centerRight,
                      child: IconButton(
                        tooltip: 'Close',
                        onPressed: () => Navigator.pop(dialogContext),
                        icon: const Icon(Icons.close),
                      ),
                    ),
                    Text(
                      [
                        readDate(date(x)),
                        if (eventTime(x).isNotEmpty) eventTime(x),
                      ].join(' · '),
                    ),
                    const Divider(height: 28),
                    if (!s.hasData && !s.hasError)
                      const LinearProgressIndicator(),
                    if ((x['ChildCondition'] ?? '')
                        .toString()
                        .trim()
                        .isNotEmpty)
                      Padding(
                        padding: const EdgeInsets.only(bottom: 12),
                        child: Text(
                          x['ChildCondition'].toString(),
                          style: const TextStyle(
                            color: gold,
                            fontWeight: FontWeight.w600,
                          ),
                        ),
                      ),
                    const Text(
                      'Notes',
                      style: TextStyle(fontWeight: FontWeight.bold),
                    ),
                    const SizedBox(height: 5),
                    Text(
                      s.hasError
                          ? 'The note could not be loaded. Close this report and tap it again to retry.'
                          : (!s.hasData && note.isEmpty
                                ? 'Loading message…'
                                : (note.isEmpty
                                      ? 'No message text was returned.'
                                      : note)),
                    ),
                    if (fields.isNotEmpty) ...[
                      const SizedBox(height: 20),
                      const Text(
                        'Report details',
                        style: TextStyle(fontWeight: FontWeight.bold),
                      ),
                      const SizedBox(height: 8),
                      ...fields.map(
                        (field) => Padding(
                          padding: const EdgeInsets.symmetric(vertical: 5),
                          child: Row(
                            crossAxisAlignment: CrossAxisAlignment.start,
                            children: [
                              SizedBox(
                                width: 130,
                                child: Text(
                                  field.$1,
                                  style: const TextStyle(color: Colors.white60),
                                ),
                              ),
                              Expanded(child: Text(field.$2)),
                            ],
                          ),
                        ),
                      ),
                    ],
                  ],
                ),
              ),
            );
          },
        ),
      ),
    ),
  );
  Widget avatar(FamilyChild c, [double r = 20]) => CircleAvatar(
    radius: r,
    foregroundImage: childImage(c),
    child: Text(c.firstName.isEmpty ? '?' : c.firstName[0]),
  );

  ImageProvider? childImage(FamilyChild owner) {
    final local = childPhotoPaths[owner.id];
    if (local != null && File(local).existsSync())
      return FileImage(File(local));
    if (owner.photoUrl == null) return null;
    return CachedNetworkImageProvider(
      widget.api.imageUrl(owner.photoUrl),
      headers: widget.api.imageHeaders,
    );
  }

  Future<void> chooseChildPhoto() async {
    final source = await ImagePicker().pickImage(
      source: ImageSource.gallery,
      imageQuality: 95,
    );
    if (source == null) return;
    final cropped = await cropAvatarPhoto(source);
    if (cropped == null) return;
    final directory = await getApplicationDocumentsDirectory();
    final destination = '${directory.path}/honeycomb-child-${child.id}.png';
    await File(destination).writeAsBytes(cropped, flush: true);
    if (!mounted) return;
    setState(
      () => childPhotoPaths = {...childPhotoPaths, child.id: destination},
    );
    save();
  }

  Future<Uint8List?> cropAvatarPhoto(XFile source) async {
    final cropKey = GlobalKey();
    return showDialog<Uint8List>(
      context: context,
      barrierDismissible: false,
      builder: (dialogContext) => Dialog(
        backgroundColor: const Color(0xff20262e),
        insetPadding: const EdgeInsets.all(24),
        child: Padding(
          padding: const EdgeInsets.fromLTRB(20, 20, 20, 12),
          child: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              Text(
                'Position ${child.firstName}\'s photo',
                style: const TextStyle(
                  fontWeight: FontWeight.w700,
                  fontSize: 18,
                ),
              ),
              const SizedBox(height: 6),
              const Text(
                'Pinch to zoom and drag to move it inside the circle.',
                textAlign: TextAlign.center,
                style: TextStyle(color: Colors.white70),
              ),
              const SizedBox(height: 20),
              SizedBox(
                width: 280,
                height: 280,
                child: RepaintBoundary(
                  key: cropKey,
                  child: ClipOval(
                    child: ColoredBox(
                      color: const Color(0xff11161c),
                      child: InteractiveViewer(
                        minScale: 1,
                        maxScale: 5,
                        child: SizedBox.expand(
                          child: Image.file(
                            File(source.path),
                            fit: BoxFit.cover,
                          ),
                        ),
                      ),
                    ),
                  ),
                ),
              ),
              const SizedBox(height: 12),
              Row(
                mainAxisAlignment: MainAxisAlignment.end,
                children: [
                  TextButton(
                    onPressed: () => Navigator.pop(dialogContext),
                    child: const Text('Cancel'),
                  ),
                  FilledButton(
                    onPressed: () async {
                      final boundary =
                          cropKey.currentContext?.findRenderObject()
                              as RenderRepaintBoundary?;
                      if (boundary == null) return;
                      final image = await boundary.toImage(pixelRatio: 2);
                      final bytes = await image.toByteData(
                        format: ui.ImageByteFormat.png,
                      );
                      if (dialogContext.mounted && bytes != null) {
                        Navigator.pop(
                          dialogContext,
                          bytes.buffer.asUint8List(),
                        );
                      }
                    },
                    child: const Text('Use photo'),
                  ),
                ],
              ),
            ],
          ),
        ),
      ),
    );
  }

  Widget metric(String x, String l, {VoidCallback? onTap}) => Expanded(
    child: Semantics(
      button: onTap != null,
      label: onTap == null ? null : 'Open $l',
      child: InkWell(
        borderRadius: BorderRadius.circular(10),
        onTap: onTap,
        child: Padding(
          padding: const EdgeInsets.symmetric(vertical: 5),
          child: Column(
            children: [
              Text(
                x,
                style: const TextStyle(
                  fontWeight: FontWeight.bold,
                  fontSize: 20,
                ),
              ),
              Text(
                l,
                style: TextStyle(
                  fontSize: 11,
                  color: Theme.of(context).colorScheme.onSurfaceVariant,
                ),
              ),
            ],
          ),
        ),
      ),
    ),
  );
  Widget heading(String x, VoidCallback f) => Row(
    children: [
      Text(
        x,
        style: const TextStyle(fontSize: 17, fontWeight: FontWeight.bold),
      ),
      const Spacer(),
      TextButton(onPressed: f, child: const Text('View all')),
    ],
  );
  bool matches(Map<String, dynamic> x) {
    final q = search.text.trim().toLowerCase();
    return q.isEmpty || x.values.join(' ').toLowerCase().contains(q);
  }

  bool inWeek(Map<String, dynamic> x) {
    final d = date(x);
    return d.compareTo(dayKey(selectedWeek)) >= 0 &&
        d.compareTo(dayKey(selectedWeek.add(const Duration(days: 6)))) <= 0;
  }
}

class Entry {
  const Entry(this.item, this.photo, this.child);
  final Map<String, dynamic> item;
  final bool photo;
  final FamilyChild child;
}

class Viewer extends StatefulWidget {
  const Viewer({
    super.key,
    required this.api,
    required this.items,
    required this.start,
    required this.favorites,
    required this.onFavorite,
    required this.onHide,
    required this.onLoadMore,
  });
  final HoneycombApi api;
  final List<Map<String, dynamic>> items;
  final int start;
  final Set<String> favorites;
  final ValueChanged<String> onFavorite, onHide;
  final Future<List<Map<String, dynamic>>> Function() onLoadMore;
  @override
  State<Viewer> createState() => _ViewerState();
}

class _ViewerState extends State<Viewer> with SingleTickerProviderStateMixin {
  late int index = widget.start;
  late List<Map<String, dynamic>> items;
  final zoom = TransformationController();
  late final AnimationController motion = AnimationController(
    vsync: this,
    // Match the wrapper's deliberate 340ms exit/entry choreography.
    duration: const Duration(milliseconds: 340),
  );
  double drag = 0;
  double _start = 0;
  double _end = 0;
  bool _committing = false;
  bool _loadingHistory = false;
  bool _saving = false;

  @override
  void initState() {
    super.initState();
    items = List.of(widget.items);
    motion.addListener(() {
      setState(() {
        drag =
            _start +
            (_end - _start) * Curves.easeOutCubic.transform(motion.value);
      });
    });
    motion.addStatusListener((status) {
      if (status != AnimationStatus.completed) return;
      setState(() {
        if (_committing) index += _end < 0 ? 1 : -1;
        drag = 0;
        _committing = false;
      });
      zoom.value = Matrix4.identity();
      if (_committing == false && index >= items.length - 3) {
        _extendHistory();
      }
    });
  }

  Future<void> _extendHistory() async {
    if (_loadingHistory) return;
    _loadingHistory = true;
    try {
      final loaded = await widget.onLoadMore();
      if (!mounted || loaded.length <= items.length) return;
      setState(() => items = List.of(loaded));
    } finally {
      _loadingHistory = false;
    }
  }

  Future<void> _saveOriginal(Map<String, dynamic> item) async {
    if (_saving) return;
    setState(() => _saving = true);
    try {
      final filename = (item['Filename'] ?? item['ImageUrl'] ?? '').toString();
      final bytes = await widget.api.originalPhotoBytes(filename);
      final normalizedName = ('Honeycomb_' + title(item)).replaceAll(
        RegExp(r'[^A-Za-z0-9._-]+'),
        '_',
      );
      final safeName = normalizedName.length > 72
          ? normalizedName.substring(0, 72)
          : normalizedName;
      final result = await ImageGallerySaverPlus.saveImage(
        bytes,
        quality: 100,
        name: safeName,
        isReturnImagePathOfIOS: true,
      );
      if (!mounted) return;
      final success = result is Map && result['isSuccess'] == true;
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(
          content: Text(
            success
                ? 'Original saved to Photos.'
                : 'Could not save this photo.',
          ),
        ),
      );
    } catch (_) {
      if (mounted) {
        ScaffoldMessenger.of(context).showSnackBar(
          const SnackBar(
            content: Text('Could not download the original photo.'),
          ),
        );
      }
    } finally {
      if (mounted) setState(() => _saving = false);
    }
  }

  @override
  void dispose() {
    motion.dispose();
    zoom.dispose();
    super.dispose();
  }

  void _settle(double target, bool commit) {
    _start = drag;
    _end = target;
    _committing = commit;
    motion
      ..reset()
      ..forward();
  }

  void _endDrag(DragEndDetails details, double width) {
    final velocity = details.primaryVelocity ?? 0;
    final direction = drag == 0 ? (velocity < 0 ? 1 : -1) : (drag < 0 ? 1 : -1);
    final next = index + direction;
    final commit =
        next >= 0 &&
        next < items.length &&
        (drag.abs() > width * .24 || velocity.abs() > 650);
    _settle(commit ? (direction > 0 ? -width : width) : 0, commit);
  }

  Widget _photo(Map<String, dynamic> item, {required bool full}) {
    final url = (item['Filename'] ?? item['ImageUrl'] ?? '').toString();
    return CachedNetworkImage(
      imageUrl: widget.api.imageUrl(url, full: full, thumbnail: !full),
      cacheKey: (full ? 'hc-original-v2-' : 'hc-thumb-v2-') + url,
      httpHeaders: widget.api.imageHeaders,
      fit: BoxFit.contain,
      placeholder: (_, __) => const Center(
        child: SizedBox(
          width: 28,
          height: 28,
          child: CircularProgressIndicator(strokeWidth: 2),
        ),
      ),
      errorWidget: (_, __, ___) => const Center(
        child: Icon(
          Icons.broken_image_outlined,
          color: Colors.white54,
          size: 42,
        ),
      ),
    );
  }

  String _photoCaption(Map<String, dynamic> moment) {
    final subject = (moment['Subject'] ?? '').toString().trim();
    final lesson = (moment['Lesson'] ?? '').toString().trim();
    final internal =
        subject.isEmpty ||
        RegExp(
          r'^(memo|classroom moment|photo|picture)$',
          caseSensitive: false,
        ).hasMatch(subject);
    return internal ? (lesson.isEmpty ? 'Classroom photo' : lesson) : subject;
  }

  @override
  Widget build(BuildContext c) {
    if (items.isEmpty) return const SizedBox();
    final active = items[index];
    final key = (active['DailyMomentId'] ?? '').toString();
    return Dialog(
      insetPadding: EdgeInsets.zero,
      backgroundColor: Colors.black,
      child: LayoutBuilder(
        builder: (context, constraints) {
          final width = constraints.maxWidth;
          final direction = drag < 0 ? 1 : -1;
          final next = index + direction;
          final progress = (drag.abs() / width).clamp(0.0, 1.0);
          return Stack(
            children: [
              if (next >= 0 && next < items.length)
                Transform.translate(
                  offset: Offset(drag + direction * width, 0),
                  child: Transform.rotate(
                    angle: direction * (1 - progress) * .08,
                    child: Opacity(
                      opacity: .45 + progress * .55,
                      // Deliberately thumbnail-only: the full original is loaded
                      // only when this image becomes active after the transition.
                      child: Center(child: _photo(items[next], full: false)),
                    ),
                  ),
                ),
              GestureDetector(
                onHorizontalDragUpdate: zoom.value.getMaxScaleOnAxis() > 1.01
                    ? null
                    : (d) => setState(() => drag += d.delta.dx),
                onHorizontalDragEnd: zoom.value.getMaxScaleOnAxis() > 1.01
                    ? null
                    : (d) => _endDrag(d, width),
                child: Transform.translate(
                  offset: Offset(drag, 0),
                  child: Transform.rotate(
                    angle: drag / width * .12,
                    child: Transform.scale(
                      scale: 1 - progress * .22,
                      child: Opacity(
                        opacity: 1 - progress * .35,
                        child: InteractiveViewer(
                          transformationController: zoom,
                          maxScale: 4,
                          child: Center(child: _photo(active, full: true)),
                        ),
                      ),
                    ),
                  ),
                ),
              ),
              Positioned(
                top: 24,
                left: 10,
                child: IconButton(
                  onPressed: () => Navigator.pop(c),
                  icon: const Icon(Icons.close, color: Colors.white),
                ),
              ),
              Positioned(
                top: 24,
                right: 10,
                child: Row(
                  children: [
                    IconButton(
                      onPressed: _saving ? null : () => _saveOriginal(active),
                      icon: Icon(
                        _saving
                            ? Icons.downloading_outlined
                            : Icons.download_outlined,
                        color: Colors.white,
                      ),
                      tooltip: 'Save original',
                    ),
                    IconButton(
                      onPressed: () => widget.onFavorite(key),
                      icon: Icon(
                        widget.favorites.contains(key)
                            ? Icons.star
                            : Icons.star_border,
                        color: gold,
                      ),
                    ),
                    IconButton(
                      onPressed: () {
                        widget.onHide(key);
                        Navigator.pop(c);
                      },
                      icon: const Icon(
                        Icons.visibility_off_outlined,
                        color: Colors.white,
                      ),
                    ),
                  ],
                ),
              ),
              Positioned(
                bottom: 20,
                left: 20,
                right: 20,
                child: Column(
                  children: [
                    Text(
                      _photoCaption(active),
                      textAlign: TextAlign.center,
                      style: const TextStyle(
                        color: Colors.white,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                    if ((active['Lesson'] ?? '').toString().trim().isNotEmpty &&
                        active['Lesson'].toString() != _photoCaption(active))
                      Text(
                        active['Lesson'].toString(),
                        textAlign: TextAlign.center,
                        style: const TextStyle(color: Colors.white70),
                      ),
                    Text(
                      '${readDate(date(active))}${eventTime(active).isEmpty ? '' : ' · ${eventTime(active)}'} · ${index + 1}/${items.length}',
                      textAlign: TextAlign.center,
                      style: const TextStyle(
                        color: Colors.white70,
                        fontSize: 12,
                      ),
                    ),
                  ],
                ),
              ),
            ],
          );
        },
      ),
    );
  }
}

DateTime weekStart(DateTime d) {
  final x = DateTime(d.year, d.month, d.day);
  return x.subtract(Duration(days: x.weekday % 7));
}

bool sameDay(DateTime? a, DateTime? b) =>
    a != null &&
    b != null &&
    a.year == b.year &&
    a.month == b.month &&
    a.day == b.day;
String dayKey(DateTime d) =>
    d.year.toString().padLeft(4, '0') +
    '-' +
    d.month.toString().padLeft(2, '0') +
    '-' +
    d.day.toString().padLeft(2, '0');
String date(Map<String, dynamic> x) =>
    RegExp(r'\d{4}-\d\d-\d\d')
        .firstMatch(
          (x['StartDate'] ??
                  x['GroupDate'] ??
                  x['DateTime'] ??
                  x['CreatedDate'] ??
                  x['Date'] ??
                  '')
              .toString(),
        )
        ?.group(0) ??
    '';
String stamp(Map<String, dynamic> x) =>
    (x['StartDate'] ??
            x['DateTime'] ??
            x['CreatedDate'] ??
            x['GroupDate'] ??
            '')
        .toString();

String eventTime(Map<String, dynamic> item) {
  final explicit = (item['TimeStart'] ?? '').toString().trim();
  if (RegExp(
    r'^\d{1,2}:\d{2}\s*(AM|PM)$',
    caseSensitive: false,
  ).hasMatch(explicit)) {
    return explicit.toUpperCase();
  }
  final raw = stamp(item);
  final parsed = DateTime.tryParse(raw);
  if (parsed != null) {
    final hour = parsed.hour % 12 == 0 ? 12 : parsed.hour % 12;
    return '$hour:${parsed.minute.toString().padLeft(2, '0')} ${parsed.hour >= 12 ? 'PM' : 'AM'}';
  }
  final match = RegExp(
    r'(\d{1,2}):(\d{2})\s*(AM|PM)',
    caseSensitive: false,
  ).firstMatch(raw);
  return match == null
      ? ''
      : '${match[1]}:${match[2]} ${match[3]!.toUpperCase()}';
}

String title(Map<String, dynamic> x) {
  // Honeycomb's report summary is GenericReportInfo; Subject/Title are
  // usually absent on report rows. Reading only those fields collapsed a
  // whole day of distinct reports into “Classroom update”.
  final summary =
      x['GenericReportInfo'] ??
      x['Subject'] ??
      x['Title'] ??
      x['ReportTypeName'] ??
      x['DailyReportType'] ??
      x['Lesson'];
  final typeId = x['DailyReportTypeID'];
  final numericType = typeId is num ? typeId.toInt() : int.tryParse('$typeId');
  switch (numericType) {
    case 1:
      return 'Bottle';
    case 3:
      return 'Nap';
    case 4:
      return 'Diaper';
    case 5:
      return 'Potty';
    case 6:
      return 'Needs supplies';
    case 7:
      return 'Message';
  }
  if (summary != null && summary.toString().trim().isNotEmpty) {
    final supplied = summary.toString().trim();
    // Keep the child-care category concise, as Honeycomb does in its feed.
    if (RegExp(r'^nap( report)?$', caseSensitive: false).hasMatch(supplied)) {
      return 'Nap';
    }
    return supplied;
  }
  // A start/end range is Honeycomb's nap report shape even if an account does
  // not include the numeric report type in its summary response.
  if ((x['TimeEnd'] ?? '').toString().trim().isNotEmpty) return 'Nap';
  final condition = (x['ChildCondition'] ?? '').toString().trim();
  return condition.isEmpty ? 'Daily report' : condition;
}

String reportClock(dynamic value) {
  final raw = value?.toString().trim() ?? '';
  final match = RegExp(
    r'(\d{1,2}):(\d{2})\s*(AM|PM)',
    caseSensitive: false,
  ).firstMatch(raw);
  return match == null
      ? ''
      : '${match[1]}:${match[2]} ${match[3]!.toUpperCase()}';
}

String reportOutcome(Map<String, dynamic> report, String kind) {
  final condition = (report['ChildCondition'] ?? '').toString().trim();
  final generic = (report['GenericReportInfo'] ?? '').toString().trim();
  if (kind == 'bottle' && generic.isNotEmpty) return generic;
  if (kind == 'nap') {
    final start = reportClock(report['TimeStart']).isNotEmpty
        ? reportClock(report['TimeStart'])
        : eventTime(report);
    final end = reportClock(report['TimeEnd']);
    if (start.isNotEmpty && end.isNotEmpty) return '$start - $end';
    if (start.isNotEmpty) return start;
  }
  return condition;
}

String type(Map<String, dynamic> x) {
  final s = (title(x) + ' ' + (x['ChildCondition'] ?? '').toString())
      .toLowerCase();
  final typeId = x['DailyReportTypeID'] is num
      ? (x['DailyReportTypeID'] as num).toInt()
      : int.tryParse('${x['DailyReportTypeID']}');
  if (s.contains('suppl')) return 'supplies';
  if (s.contains('bottle') ||
      s.contains('milk') ||
      RegExp(r'\d\s*oz').hasMatch(s)) {
    return 'bottle';
  }
  if (typeId == 2 || RegExp(r'lunch|snack|breakfast|meal|ate').hasMatch(s)) {
    return 'meal';
  }
  if (typeId == 3 ||
      s.contains('nap') ||
      (x['TimeEnd'] ?? '').toString().trim().isNotEmpty) {
    return 'nap';
  }
  if (s.contains('diaper') || s.contains(' dry')) return 'diaper';
  if (typeId == 4) return 'diaper';
  if (typeId == 1) return 'bottle';
  if (typeId == 5 ||
      s.contains('potty') ||
      s.contains('pee') ||
      s.contains('poop') ||
      s.contains('bowel') ||
      s.contains('stool') ||
      RegExp(r'\bbm\b').hasMatch(s)) {
    return 'potty';
  }
  if (typeId == 6 || RegExp(r'wipes|clothes|diaper').hasMatch(s)) {
    return 'supplies';
  }
  return 'general';
}

String readDate(String s) {
  final d = DateTime.tryParse(s);
  if (d == null) return s.isEmpty ? 'Recent' : s;
  return sameDay(d, DateTime.now())
      ? 'Today'
      : d.month.toString() + '/' + d.day.toString() + '/' + d.year.toString();
}

String range(DateTime a, DateTime b) =>
    a.month.toString() +
    '/' +
    a.day.toString() +
    ' – ' +
    b.month.toString() +
    '/' +
    b.day.toString();
String dayName(DateTime d) =>
    const ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'][d.weekday % 7] +
    ' ' +
    d.month.toString() +
    '/' +
    d.day.toString();
String monthName(DateTime d) => const [
  'January',
  'February',
  'March',
  'April',
  'May',
  'June',
  'July',
  'August',
  'September',
  'October',
  'November',
  'December',
][d.month - 1];
String cap(String s) =>
    s.isEmpty ? 'Other' : s[0].toUpperCase() + s.substring(1);
