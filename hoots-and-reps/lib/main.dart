import 'dart:async';
import 'dart:convert';
import 'dart:math' as math;

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:intl/intl.dart';
import 'package:shared_preferences/shared_preferences.dart';

import 'data/app_database.dart';
import 'data/benchmark_results_repository.dart';
import 'data/conditioning_results_repository.dart';
import 'data/published_program_repository.dart';
import 'data/schedule_repository.dart';
import 'programming/programming_engine.dart';
import 'programming/movement_substitutions.dart';
import 'programming/published_workout_resolver.dart';
import 'profile/athlete_profile_page.dart';
import 'profile/first_run_setup_page.dart';

const ink = Color(0xfff7f5ef);
const muted = Color(0xffada6c1);
const paper = Color(0xff070615);
const card = Color(0xff151127);
const graphite = Color(0xff21183a);
const border = Color(0xff4b3a78);
const fire = Color(0xffa855f7);
const ember = Color(0xffffc44e);
const cyan = Color(0xff56d7ff);
const projectedBorder = Color(0xff2a6f9b);
const success = Color(0xff54ffae);
const generatedPhaseWeeks = 12;

/// Adds the athlete-specific, rounded barbell load to percentage prescriptions
/// in published workout text. Published snapshots use the typographic
/// multiplication sign (`×`), while older generated text may use `x`, so both
/// forms deliberately remain supported here.
String resolvePercentageLoads(
  String body,
  Map<String, double> trainingMaxesLb,
) {
  const liftKeys = <(String, String)>[
    ('Clean + Split Jerk', 'clean_and_jerk'),
    ('Clean + Push Jerk', 'clean_and_jerk'),
    ('Clean and Jerk', 'clean_and_jerk'),
    ('Power Clean + Jerk', 'clean'),
    ('Power Clean + Split Jerk', 'clean'),
    ('Power Clean', 'clean'),
    ('Hang Clean', 'clean'),
    ('Squat Clean', 'clean'),
    ('Clean Pull', 'clean'),
    ('Clean', 'clean'),
    ('Power Snatch', 'snatch'),
    ('Hang Power Snatch', 'snatch'),
    ('Muscle Snatch', 'snatch'),
    ('Squat Snatch', 'snatch'),
    ('Snatch Pull', 'snatch'),
    ('Snatch', 'snatch'),
    ('Back Squat', 'back_squat'),
    ('Front Squat', 'front_squat'),
    ('Overhead Squat', 'overhead_squat'),
    ('Dumbbell Bench Press', 'bench_press'),
    ('Bench Press', 'bench_press'),
    ('Strict Press', 'strict_press'),
    ('Push Press', 'strict_press'),
    ('Romanian Deadlift', 'deadlift'),
    ('Deadlift', 'deadlift'),
    ('Barbell Row', 'barbell_row'),
    ('Split Squat', 'split_squat'),
  ];
  final lines = <String>[];
  String? liftKey;
  final expression = RegExp(
    r'^(\d+)\s*[×x]\s*(\d+)\s+at\s+(\d+(?:\.\d+)?)%$',
    caseSensitive: false,
  );
  for (final rawLine in body.split('\n')) {
    final line = rawLine.trim();
    final matchingLift = liftKeys
        .where((entry) => line.toLowerCase().contains(entry.$1.toLowerCase()))
        .map((entry) => entry.$2)
        .firstOrNull;
    if (matchingLift != null) liftKey = matchingLift;

    final match = expression.firstMatch(line);
    final max = liftKey == null ? null : trainingMaxesLb[liftKey];
    if (match == null || max == null) {
      lines.add(rawLine);
      continue;
    }
    final percent = double.parse(match.group(3)!) / 100;
    final load = (max * percent / 5).round() * 5;
    lines.add('$rawLine — $load lb');
  }
  return lines.join('\n');
}

/// Android HDMI/secondary-display bridge. On platforms without a presentation
/// display, calls simply report unavailable and leave the handheld UI alone.
class ExternalWorkoutDisplay {
  static const _channel = MethodChannel(
    'com.rhoward.hoots_and_reps/external_display',
  );

  static Future<bool> isAvailable() async {
    try {
      return await _channel.invokeMethod<bool>('isAvailable') ?? false;
    } on MissingPluginException {
      return false;
    }
  }

  static Future<bool> show({
    required String workoutTitle,
    required String sectionTitle,
    required String body,
    required int sectionNumber,
    required int sectionCount,
    Map<String, dynamic>? timer,
  }) async {
    try {
      return await _channel.invokeMethod<bool>('show', {
            'workoutTitle': workoutTitle,
            'sectionTitle': sectionTitle,
            'body': body,
            'sectionNumber': sectionNumber,
            'sectionCount': sectionCount,
            'timer': ?timer,
          }) ??
          false;
    } on MissingPluginException {
      return false;
    }
  }

  static Future<void> hide() async {
    try {
      await _channel.invokeMethod<void>('hide');
    } on MissingPluginException {
      // Secondary display mode is Android-only for this first release.
    }
  }

  /// Opens Android's standard Cast device chooser. The selected workout card
  /// is held by the native bridge and sent when the Cast session connects.
  static Future<bool> cast({
    required String workoutTitle,
    required String sectionTitle,
    required String body,
    required int sectionNumber,
    required int sectionCount,
    Map<String, dynamic>? timer,
  }) async {
    try {
      final arguments = <String, dynamic>{
        'workoutTitle': workoutTitle,
        'sectionTitle': sectionTitle,
        'body': body,
        'sectionNumber': sectionNumber,
        'sectionCount': sectionCount,
      };
      if (timer != null) arguments['timer'] = timer;
      return await _channel.invokeMethod<bool>('cast', arguments) ?? false;
    } on MissingPluginException {
      return false;
    }
  }

  static Future<void> updateCastTimer(Map<String, dynamic>? timer) async {
    try {
      await _channel.invokeMethod<void>('updateCastTimer', {'timer': timer});
    } on MissingPluginException {
      // Timers still work locally when Cast is unavailable.
    }
  }

  /// Updates the native HDMI presentation without rebuilding its workout card.
  /// The presentation owns the running clock after receiving this shared plan.
  static Future<void> updateExternalTimer(Map<String, dynamic>? timer) async {
    try {
      await _channel.invokeMethod<void>('updateTimer', {'timer': timer});
    } on MissingPluginException {
      // HDMI presentation is Android-only.
    }
  }

  static Future<bool> isCastConnected() async {
    try {
      return await _channel.invokeMethod<bool>('isCastConnected') ?? false;
    } on MissingPluginException {
      return false;
    }
  }

  static Future<void> stopCasting() async {
    try {
      await _channel.invokeMethod<void>('stopCasting');
    } on MissingPluginException {
      // Cast is currently Android-only, like the HDMI display bridge.
    }
  }

  static void listen(Future<void> Function(MethodCall call) handler) {
    _channel.setMethodCallHandler(handler);
  }
}

Set<SkillQualification> selectedSkillQualifications(AthleteSettings settings) =>
    {
      for (final qualification in SkillQualification.values)
        if (settings.skillQualifications.contains(qualification.name))
          qualification,
    };

Future<void> main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await SystemChrome.setPreferredOrientations([DeviceOrientation.portraitUp]);
  SystemChrome.setSystemUIOverlayStyle(
    const SystemUiOverlayStyle(
      statusBarColor: paper,
      systemNavigationBarColor: paper,
      statusBarIconBrightness: Brightness.light,
    ),
  );
  runApp(const HootsApp());
}

class HootsApp extends StatelessWidget {
  const HootsApp({super.key});

  @override
  Widget build(BuildContext context) => MaterialApp(
    debugShowCheckedModeBanner: false,
    title: 'Hoots & Reps',
    theme: ThemeData(
      brightness: Brightness.dark,
      scaffoldBackgroundColor: paper,
      fontFamily: '.SF Pro Display',
      colorScheme: const ColorScheme.dark(primary: fire, secondary: ember),
      useMaterial3: true,
    ),
    home: const WorkoutHome(),
  );
}

class WorkoutDay {
  WorkoutDay({
    required this.sequence,
    required this.phase,
    required this.title,
    required this.full,
    required this.sixty,
    required this.recovery,
    required this.fullMinutes,
    required this.sixtyMinutes,
    required this.prescriptionSignature,
    this.fullConditioning,
    this.sixtyConditioning,
    this.benchmark,
  });
  final int sequence;
  final String phase;
  final String title;
  final List<WorkoutSection> full;
  final List<WorkoutSection> sixty;
  final List<WorkoutSection> recovery;
  final int fullMinutes;
  final int sixtyMinutes;
  final String prescriptionSignature;
  final ConditioningWork? fullConditioning;
  final ConditioningWork? sixtyConditioning;
  final WorkoutBenchmark? benchmark;
}

class _ConditioningSelection {
  const _ConditioningSelection({
    this.levelId = 'level_3',
    this.customPrescription,
  });

  final String levelId;
  final String? customPrescription;

  Map<String, Object?> encode() => {
    'level_id': levelId,
    if (customPrescription?.trim().isNotEmpty ?? false)
      'custom_prescription': customPrescription!.trim(),
  };

  static _ConditioningSelection decode(Object? value) {
    if (value is! Map) return const _ConditioningSelection();
    final level = value['level_id'];
    return _ConditioningSelection(
      levelId: level is String ? level : 'level_3',
      customPrescription: value['custom_prescription'] as String?,
    );
  }
}

class _ConditioningTargetEdit {
  _ConditioningTargetEdit({
    required this.line,
    required this.value,
    required this.label,
  }) : controller = TextEditingController(text: value);

  final String line;
  final String value;
  final String label;
  final TextEditingController controller;
}

class _ConditioningLoadEdit {
  _ConditioningLoadEdit({required this.value, required this.label})
    : controller = TextEditingController(text: value);

  final String value;
  final String label;
  final TextEditingController controller;
}

enum WorkoutBenchmarkKind {
  rowShortPower,
  rowTwoThousand,
  gymnasticsScreen,
  runFourHundred,
  skiSevenFifty,
  runMile,
  bikeTenMinute,
}

class WorkoutBenchmark {
  const WorkoutBenchmark({
    required this.kind,
    required this.id,
    this.isRetest = false,
  });

  final WorkoutBenchmarkKind kind;
  final String id;
  final bool isRetest;

  bool get replacesConditioning =>
      kind != WorkoutBenchmarkKind.gymnasticsScreen;

  List<String> get resultKeys => switch (kind) {
    WorkoutBenchmarkKind.rowShortPower => const [
      'row_200_split_seconds',
      'row_500_split_seconds',
    ],
    WorkoutBenchmarkKind.rowTwoThousand => const ['row_2000_split_seconds'],
    WorkoutBenchmarkKind.gymnasticsScreen => const [
      'strict_pullups_reps',
      'pushups_reps',
      'toes_to_bar_reps',
      'double_unders_reps',
    ],
    WorkoutBenchmarkKind.runFourHundred => const ['run_400_seconds'],
    WorkoutBenchmarkKind.skiSevenFifty => const ['ski_750_split_seconds'],
    WorkoutBenchmarkKind.runMile => const ['run_mile_seconds'],
    WorkoutBenchmarkKind.bikeTenMinute => const ['bike_10min_calories'],
  };

  bool hasCompleteResult(Map<String, double> values) =>
      resultKeys.every(values.containsKey);

  Map<String, double> normalizeResults(List<num> enteredValues) {
    final requiredCount = switch (kind) {
      WorkoutBenchmarkKind.rowShortPower => 2,
      WorkoutBenchmarkKind.gymnasticsScreen => 4,
      _ => 1,
    };
    if (enteredValues.length != requiredCount) {
      throw ArgumentError.value(
        enteredValues,
        'enteredValues',
        '$kind requires $requiredCount result value(s)',
      );
    }
    final values = enteredValues.map((value) => value.toDouble()).toList();
    return switch (kind) {
      WorkoutBenchmarkKind.rowShortPower => {
        resultKeys[0]: values[0] * 2.5,
        resultKeys[1]: values[1],
      },
      WorkoutBenchmarkKind.rowTwoThousand => {resultKeys[0]: values[0] / 4},
      WorkoutBenchmarkKind.skiSevenFifty => {resultKeys[0]: values[0] / 1.5},
      _ => {
        for (var index = 0; index < resultKeys.length; index++)
          resultKeys[index]: values[index],
      },
    };
  }

  PostTestAerobic? get postTestAerobic => switch (kind) {
    WorkoutBenchmarkKind.rowShortPower => const PostTestAerobic(
      recoveryMinutes: 0,
      prescription:
          'Row 6:00 very easily after recording the 500-meter result. Keep the stroke relaxed; this is a downshift, not additional conditioning.',
    ),
    WorkoutBenchmarkKind.runFourHundred => const PostTestAerobic(
      recoveryMinutes: 8,
      prescription:
          'Run 2,000 meters at an easy, conversational pace. This is recovery volume, not a second test.',
    ),
    WorkoutBenchmarkKind.skiSevenFifty => const PostTestAerobic(
      recoveryMinutes: 6,
      prescription:
          'SkiErg 1,500 meters easy. Keep the stroke relaxed and your breathing conversational.',
    ),
    _ => null,
  };
}

class PostTestAerobic {
  const PostTestAerobic({
    required this.recoveryMinutes,
    required this.prescription,
  });

  final int recoveryMinutes;
  final String prescription;
}

class WorkoutSection {
  const WorkoutSection(this.title, this.body);
  final String title;
  final String body;
  bool get optional {
    final value = title.toLowerCase();
    return value.contains('accessory') || value.contains('bonus');
  }
}

enum _CardTimerStage { ready, running, paused, transition, finished }

class _CardTimer {
  _CardTimer({
    required this.sectionKey,
    required this.label,
    required this.targetSeconds,
    required this.stage,
    required this.remainingSeconds,
    required this.cooldownSteps,
    required this.cooldownStepIndex,
    required this.mode,
    required this.roundCount,
  });

  final String sectionKey;
  final String label;
  int targetSeconds;
  _CardTimerStage stage;
  int remainingSeconds;
  final List<String> cooldownSteps;
  int cooldownStepIndex;
  bool sideChangeRequired = false;
  bool sideChanged = false;
  bool transitionIsSideChange = false;
  final String mode;
  final int roundCount;
  Map<String, dynamic>? castPlan;
  DateTime? lastTickAt;
  int elapsedPlanSeconds = 0;

  bool get isCooldown => cooldownSteps.isNotEmpty;
  bool get isActive => stage != _CardTimerStage.finished;
}

class _TrainingSubsection {
  const _TrainingSubsection({required this.title, required this.body});

  final String title;
  final String body;
}

enum WorkoutVariant { full, sixty, recovery }

enum ChronicleFilter { all, forTime, amrap, intervals, totalWork }

enum MovementSwapScope { today, always }

class WorkoutHome extends StatefulWidget {
  const WorkoutHome({super.key});
  @override
  State<WorkoutHome> createState() => _WorkoutHomeState();
}

class _WorkoutHomeState extends State<WorkoutHome>
    with TickerProviderStateMixin {
  // Retained for a future product decision; no Inertius UI is currently shown.
  static const bool _showInertiusUi = false;
  // Retained for a future product decision; the full Hoots strike animation
  // remains implemented but is intentionally disabled in the workout flow.
  static const bool _showCompletionStrikeAnimation = false;
  static const _customMovementReplacementMarker = '__athlete_custom__';
  final Map<String, bool> _sectionState = {};
  final Map<String, int> _fractureSeeds = {};
  final Map<String, MovementSubstitution> _movementSwaps = {};
  final Map<String, MovementSubstitution> _persistentMovementSwaps = {};
  static const _substitutions = MovementSubstitutionRegistry();
  static const _substitutionSafety = ReviewedSubstitutionSafety();
  static final _publishedResolver = PublishedWorkoutResolver();
  final Set<int> _completedWorkouts = {};
  final Set<int> _partialWorkouts = {};
  final Map<String, double> _benchmarkValues = {};
  Map<int, ConditioningResult> _conditioningResults = {};
  final Map<String, _ConditioningSelection> _conditioningSelections = {};
  List<BenchmarkResultEvent> _benchmarkHistory = [];
  late final AnimationController _strike;
  late final AnimationController _workoutSwipe;
  LocalStateStore? _store;
  PublishedProgramRepository? _publishedProgramRepository;
  String? _bundledSnapshotPendingCache;
  ScheduleRepository? _scheduleRepository;
  List<ScheduledWorkout> _schedule = [];
  ProgramPause? _programPause;
  List<WorkoutDay> _workouts = [];
  AthleteSettings _athleteSettings = AthleteSettings.defaults;
  DateTime _selected = DateUtils.dateOnly(DateTime.now());
  late DateTime _scheduleStart;
  WorkoutVariant _variant = WorkoutVariant.full;
  WorkoutVariant _preferredWorkoutVariant = WorkoutVariant.full;
  ChronicleFilter _chronicleFilter = ChronicleFilter.all;
  bool _ready = false;
  bool _externalDisplayAvailable = false;
  bool _castConnected = false;
  String? _projectedSectionKey;
  String? _pendingCastSectionKey;
  _CardTimer? _cardTimer;
  Timer? _cardTimerTicker;
  WorkoutDay? _activeTimerWorkout;
  int? _activeTimerSectionIndex;
  final Map<String, bool> _sectionExpanded = {};
  final Map<String, GlobalKey> _sectionCardKeys = {};
  int _pageIndex = 0;
  int _workoutTransitionDirection = 1;
  double _workoutDragDistance = 0;
  int? _strikingSection;
  int _activeFractureSeed = 1;

  @override
  void initState() {
    super.initState();
    _scheduleStart = DateUtils.dateOnly(DateTime.now());
    _strike = AnimationController(
      vsync: this,
      duration: const Duration(milliseconds: 1950),
    );
    _workoutSwipe = AnimationController(vsync: this);
    ExternalWorkoutDisplay.listen((call) async {
      if (!mounted) return;
      final values = call.arguments as Map?;
      if (call.method == 'displayChanged') {
        setState(
          () => _externalDisplayAvailable = values?['available'] == true,
        );
      } else if (call.method == 'castConnectionChanged') {
        final connected = values?['connected'] == true;
        setState(() {
          _castConnected = connected;
          if (connected && _pendingCastSectionKey != null) {
            _projectedSectionKey = _pendingCastSectionKey;
          }
          if (!connected) _pendingCastSectionKey = null;
        });
      }
    });
    _load();
  }

  Future<void> _load() async {
    final prefs = await SharedPreferences.getInstance();
    final store = await LocalStateStore.openAndMigrate(prefs);
    final athleteSettings = AthleteSettings.decode(
      await store.getString(AthleteSettings.storageKey),
    );
    final setupComplete = await store.getBool('athlete_setup_v1') ?? false;
    final externalDisplayAvailable = await ExternalWorkoutDisplay.isAvailable();
    final castConnected = await ExternalWorkoutDisplay.isCastConnected();
    final preferredVariant = switch (await store.getString(
      'preferred_workout_variant',
    )) {
      'sixty' => WorkoutVariant.sixty,
      _ => WorkoutVariant.full,
    };
    final benchmarkRepository = BenchmarkResultsRepository(store);
    _benchmarkValues.addAll(await benchmarkRepository.load());
    _benchmarkHistory = await benchmarkRepository.history();
    _conditioningResults = await ConditioningResultsRepository(store).load();
    final savedSelections = await store.getString('conditioning_levels_v1');
    if (savedSelections != null) {
      final decoded = jsonDecode(savedSelections);
      if (decoded is Map) {
        for (final entry in decoded.entries) {
          _conditioningSelections[entry.key.toString()] =
              _ConditioningSelection.decode(entry.value);
        }
      }
    }
    final publishedProgramRepository = PublishedProgramRepository(
      store.database,
    );
    final workouts = await _loadPublishedWorkouts(publishedProgramRepository);
    if (!(await store.getBool('generated_program_v3') ?? false)) {
      await store.remove('completed_sections');
      await store.remove('completed_workouts');
      await store.remove('fracture_seeds');
      await store.remove('schedule_start');
      await store.setBool('generated_program_v3', true);
    }
    final start = await store.getString('schedule_start');
    if (!(await store.getBool('ramp_removed_v1') ?? false)) {
      await store.remove('completed_sections');
      await store.remove('completed_workouts');
      await store.remove('fracture_seeds');
      await store.setBool('ramp_removed_v1', true);
    }
    final completedSections =
        await store.getStringList('completed_sections') ?? const [];
    final fractureSeeds =
        await store.getStringList('fracture_seeds') ?? const [];
    final completedWorkouts =
        await store.getStringList('completed_workouts') ?? const [];
    final partialWorkouts =
        await store.getStringList('partial_workouts') ?? const [];
    final savedMovementSwaps =
        await store.getString('movement_swaps_v2') ??
        await store.getString('movement_swaps_v1');
    final movementSwaps = <String, MovementSubstitution>{};
    final persistentMovementSwaps = <String, MovementSubstitution>{};
    if (savedMovementSwaps != null) {
      final decoded = jsonDecode(savedMovementSwaps) as Map<String, dynamic>;
      final today = decoded['today'] is Map
          ? decoded['today'] as Map<String, dynamic>
          : decoded;
      final persistent = decoded['persistent'] is Map
          ? decoded['persistent'] as Map<String, dynamic>
          : <String, dynamic>{};
      MovementSubstitution decodeSwap(Map<String, dynamic> value) {
        final original = value['original']! as String;
        return MovementSubstitution(
          movementId:
              value['movement_id'] as String? ??
              original.toLowerCase().replaceAll(' ', '_'),
          original: original,
          replacement: value['replacement']! as String,
          stimulus: value['stimulus']! as String,
          disclosure: value['disclosure']! as String,
        );
      }

      for (final entry in today.entries) {
        final value = entry.value as Map<String, dynamic>;
        movementSwaps[entry.key] = decodeSwap(value);
      }
      for (final entry in persistent.entries) {
        final value = entry.value as Map<String, dynamic>;
        persistentMovementSwaps[entry.key] = decodeSwap(value);
      }
    }
    final scheduleStart = start == null
        ? _scheduleStart
        : DateUtils.dateOnly(DateTime.parse(start));
    final scheduleRepository = ScheduleRepository(store.database);
    await scheduleRepository.initialize(
      startsOn: scheduleStart,
      prescriptionSignatures: workouts
          .map((workout) => workout.prescriptionSignature)
          .toList(growable: false),
    );
    var schedule = await scheduleRepository.assignments();
    final completedSequences = completedWorkouts.map(int.parse).toSet();
    for (final assignment in schedule.where(
      (item) =>
          completedSequences.contains(item.sequence) &&
          item.status != ScheduleStatus.completed,
    )) {
      await scheduleRepository.complete(assignment.assignmentId);
    }
    await scheduleRepository.markPastUnresolved(
      DateUtils.dateOnly(DateTime.now()),
    );
    schedule = await scheduleRepository.assignments();
    final programPause = await scheduleRepository.pauseState();
    setState(() {
      _store = store;
      _publishedProgramRepository = publishedProgramRepository;
      _scheduleRepository = scheduleRepository;
      _schedule = schedule;
      _programPause = programPause;
      _movementSwaps.addAll(movementSwaps);
      _persistentMovementSwaps.addAll(persistentMovementSwaps);
      _athleteSettings = athleteSettings;
      _externalDisplayAvailable = externalDisplayAvailable;
      _castConnected = castConnected;
      _preferredWorkoutVariant = preferredVariant;
      _variant = preferredVariant;
      _workouts = workouts;
      _scheduleStart = scheduleStart;
      for (final key in completedSections) {
        _sectionState[key] = true;
      }
      for (final entry in fractureSeeds) {
        final split = entry.lastIndexOf('|');
        if (split > 0) {
          _fractureSeeds[entry.substring(0, split)] = int.parse(
            entry.substring(split + 1),
          );
        }
      }
      _completedWorkouts.addAll(completedWorkouts.map(int.parse));
      _partialWorkouts.addAll(partialWorkouts.map(int.parse));
      _ready = true;
    });
    if (!setupComplete) {
      WidgetsBinding.instance.addPostFrameCallback((_) => _openFirstRunSetup());
    }
    final pendingSnapshot = _bundledSnapshotPendingCache;
    if (pendingSnapshot != null) {
      // Importing the large immutable JSON into SQLite must never delay the
      // athlete's first workout. Once the shell is ready, cache it for later
      // offline launches and for the append-only transformation ledger.
      unawaited(publishedProgramRepository.publishBundled(pendingSnapshot));
      _bundledSnapshotPendingCache = null;
    }
    if (start == null) {
      await store.setString('schedule_start', _scheduleStart.toIso8601String());
    }
  }

  // Retained temporarily as a migration reference while offline tooling owns
  // snapshot publication; no athlete-facing path invokes this method.
  // ignore: unused_element
  Future<List<WorkoutDay>> _buildGeneratedWorkouts(
    LocalStateStore store,
    AthleteSettings athleteSettings,
  ) async {
    const engine = DeterministicProgrammingEngine();
    final qualifications = selectedSkillQualifications(athleteSettings);
    final fullAthlete = AthleteProfile(
      id: 'local-athlete',
      trainingMaxes: athleteSettings.effectiveTrainingMaxesLb,
      qualifications: qualifications,
      benchmarkValues: _benchmarkValues,
      sessionMinutes: 90,
    );
    final sixtyAthlete = AthleteProfile(
      id: 'local-athlete',
      trainingMaxes: athleteSettings.effectiveTrainingMaxesLb,
      qualifications: qualifications,
      benchmarkValues: _benchmarkValues,
      sessionMinutes: 60,
    );
    final anchor = DateTime(2026, 7, 27);
    const phaseHistoryKey = 'served_signatures_2026_07_27';
    final priorSignatures = <String>{};
    for (final key in await store.getKeys()) {
      if (key.startsWith('served_signatures_') && key != phaseHistoryKey) {
        priorSignatures.addAll(await store.getStringList(key) ?? const []);
      }
    }
    final workouts = <WorkoutDay>[];
    var sequence = 1;
    final fullPhase = engine.generatePhase(
      athlete: fullAthlete,
      startsOn: anchor,
      priorWorkoutSignatures: priorSignatures,
    );
    final sixtyPhase = engine.generatePhase(
      athlete: sixtyAthlete,
      startsOn: anchor,
      priorWorkoutSignatures: priorSignatures,
    );
    final served = <String>{};
    if (fullPhase.weeks.length != generatedPhaseWeeks ||
        sixtyPhase.weeks.length != generatedPhaseWeeks) {
      throw StateError(
        'The generated app phase must contain exactly $generatedPhaseWeeks weeks.',
      );
    }
    for (var phaseWeek = 1; phaseWeek <= generatedPhaseWeeks; phaseWeek++) {
      final fullDays = fullPhase.weeks[phaseWeek - 1].days
          .where((day) => !day.isRest)
          .toList();
      final sixtyDays = sixtyPhase.weeks[phaseWeek - 1].days
          .where((day) => !day.isRest)
          .toList();
      for (var index = 0; index < fullDays.length; index++) {
        final day = fullDays[index];
        final compressed = sixtyDays[index];
        final benchmark = switch ((phaseWeek, index)) {
          (1, 0) => const WorkoutBenchmark(
            kind: WorkoutBenchmarkKind.rowShortPower,
            id: 'row_short_power_v1',
          ),
          (1, 3) => const WorkoutBenchmark(
            kind: WorkoutBenchmarkKind.rowTwoThousand,
            id: 'row_2000_capacity_v1',
          ),
          (2, 0) => const WorkoutBenchmark(
            kind: WorkoutBenchmarkKind.gymnasticsScreen,
            id: 'gymnastics_capacity_v1',
          ),
          (2, 1) => const WorkoutBenchmark(
            kind: WorkoutBenchmarkKind.runFourHundred,
            id: 'run_400_speed_v1',
          ),
          (3, 1) => const WorkoutBenchmark(
            kind: WorkoutBenchmarkKind.skiSevenFifty,
            id: 'ski_750_capacity_v1',
          ),
          (4, 0) => const WorkoutBenchmark(
            kind: WorkoutBenchmarkKind.runMile,
            id: 'run_mile_capacity_v1',
          ),
          (5, 1) => const WorkoutBenchmark(
            kind: WorkoutBenchmarkKind.bikeTenMinute,
            id: 'bike_10_minute_capacity_v1',
          ),
          // Reassessments land after a substantial accumulation block, with
          // the longer aerobic tests kept on their own conditioning days.
          (10, 0) => const WorkoutBenchmark(
            kind: WorkoutBenchmarkKind.rowShortPower,
            id: 'row_short_power_v1',
            isRetest: true,
          ),
          (10, 3) => const WorkoutBenchmark(
            kind: WorkoutBenchmarkKind.rowTwoThousand,
            id: 'row_2000_capacity_v1',
            isRetest: true,
          ),
          (11, 0) => const WorkoutBenchmark(
            kind: WorkoutBenchmarkKind.gymnasticsScreen,
            id: 'gymnastics_capacity_v1',
            isRetest: true,
          ),
          (11, 1) => const WorkoutBenchmark(
            kind: WorkoutBenchmarkKind.runFourHundred,
            id: 'run_400_speed_v1',
            isRetest: true,
          ),
          (11, 3) => const WorkoutBenchmark(
            kind: WorkoutBenchmarkKind.skiSevenFifty,
            id: 'ski_750_capacity_v1',
            isRetest: true,
          ),
          (12, 0) => const WorkoutBenchmark(
            kind: WorkoutBenchmarkKind.runMile,
            id: 'run_mile_capacity_v1',
            isRetest: true,
          ),
          (12, 2) => const WorkoutBenchmark(
            kind: WorkoutBenchmarkKind.bikeTenMinute,
            id: 'bike_10_minute_capacity_v1',
            isRetest: true,
          ),
          _ => null,
        };
        final title = switch (benchmark?.kind) {
          WorkoutBenchmarkKind.rowShortPower => 'The Twin Trials of Velocity',
          WorkoutBenchmarkKind.rowTwoThousand => 'The Voidward Vigil',
          WorkoutBenchmarkKind.gymnasticsScreen => 'The Four Astral Seals',
          WorkoutBenchmarkKind.runFourHundred => 'The Comet Circuit',
          WorkoutBenchmarkKind.skiSevenFifty => 'The Frozen Star Trial',
          WorkoutBenchmarkKind.runMile => 'The Moonward Trial',
          WorkoutBenchmarkKind.bikeTenMinute => 'The Tenfold Tempest',
          null => day.title,
        };
        final signature = benchmark == null
            ? day.prescriptionSignature
            : '${day.prescriptionSignature}|benchmark:${benchmark.id}';
        served
          ..add(signature)
          ..add(compressed.prescriptionSignature);
        workouts.add(
          WorkoutDay(
            sequence: sequence++,
            phase: 'FORGED PHASE • WEEK $phaseWeek',
            title: title,
            full: _generatedSections(
              day,
              includeAccessories: true,
              benchmark: benchmark,
            ),
            sixty: _generatedSections(
              compressed,
              includeAccessories: true,
              benchmark: benchmark,
            ),
            recovery: _recoverySections(day),
            fullMinutes: day.estimatedSessionMinutes,
            sixtyMinutes: compressed.estimatedSessionMinutes,
            prescriptionSignature: signature,
            fullConditioning: day.conditioning,
            sixtyConditioning: compressed.conditioning,
            benchmark: benchmark,
          ),
        );
      }
    }
    await store.setStringList(phaseHistoryKey, served.toList()..sort());
    return workouts;
  }

  Future<void> _openAthleteProfile({
    bool movementOnly = false,
    bool strengthOnly = false,
    bool skillsOnly = false,
    bool benchmarksOnly = false,
  }) async {
    final store = _store;
    if (store == null) return;
    final repository = BenchmarkResultsRepository(store);
    final updated = await Navigator.of(context).push<AthleteSettings>(
      MaterialPageRoute(
        builder: (_) => AthleteProfilePage(
          initial: _athleteSettings,
          movementOnly: movementOnly,
          strengthOnly: strengthOnly,
          skillsOnly: skillsOnly,
          benchmarksOnly: benchmarksOnly,
          benchmarkHistory: movementOnly ? const [] : _benchmarkHistory,
          onBenchmarkEdited: movementOnly
              ? null
              : (event) async {
                  await repository.update(event);
                  final history = await repository.history();
                  final values = await repository.load();
                  if (!mounted) return;
                  setState(() {
                    _benchmarkHistory = history;
                    _benchmarkValues
                      ..clear()
                      ..addAll(values);
                  });
                },
        ),
      ),
    );
    if (updated == null || _store == null) return;
    await _store!.setString(AthleteSettings.storageKey, updated.encode());
    await _recordSnapshotTransformation(
      type: 'profile_setting',
      reason: 'Athlete updated profile, skill, or movement settings.',
      payload: {'settings': jsonDecode(updated.encode())},
    );
    _benchmarkValues
      ..clear()
      ..addAll(await repository.load());
    _benchmarkHistory = await repository.history();
    if (!mounted) return;
    setState(() {
      _athleteSettings = updated;
    });
  }

  Future<void> _openFirstRunSetup() async {
    final store = _store;
    if (store == null || !mounted) return;
    final updated = await Navigator.of(context).push<AthleteSettings>(
      MaterialPageRoute(
        builder: (_) => FirstRunSetupPage(initial: _athleteSettings),
      ),
    );
    if (updated == null) return;
    await store.setString(AthleteSettings.storageKey, updated.encode());
    await store.setBool('athlete_setup_v1', true);
    if (!mounted) return;
    setState(() {
      _athleteSettings = updated;
      _preferredWorkoutVariant = updated.preferredSessionMinutes == 60
          ? WorkoutVariant.sixty
          : WorkoutVariant.full;
      _variant = _preferredWorkoutVariant;
    });
    await _saveProgress();
    await _recordSnapshotTransformation(
      type: 'profile_setting',
      reason: 'Athlete completed first-run setup.',
      payload: {'settings': jsonDecode(updated.encode())},
    );
  }

  Future<void> _recordSnapshotTransformation({
    required String type,
    required String reason,
    required Map<String, Object?> payload,
    int? workoutSequence,
  }) async {
    final repository = _publishedProgramRepository;
    if (repository == null) return;
    await repository.record(
      SnapshotTransformation(
        type: type,
        reason: reason,
        payload: payload,
        workoutSequence: workoutSequence,
      ),
    );
  }

  /// Loads the reviewed, immutable published phase. The programming engine is
  /// an offline publishing tool and must not run during athlete app startup.
  Future<List<WorkoutDay>> _loadPublishedWorkouts(
    PublishedProgramRepository repository,
  ) async {
    final bundled = await rootBundle.loadString(
      'assets/data/published_program_snapshot_v1.json',
    );
    final bundledId =
        (jsonDecode(bundled) as Map<String, dynamic>)['snapshot_id']! as String;
    final cached = await repository.active();
    if (cached?.id == bundledId) {
      return _decodePublishedSnapshot(cached!.snapshotJson);
    }
    // A newer reviewed bundle must replace the cached published surface while
    // preserving local completion and schedule state by sequence.
    _bundledSnapshotPendingCache = bundled;
    return _decodePublishedSnapshot(bundled);
  }

  List<WorkoutDay> _decodePublishedSnapshot(String encoded) {
    final snapshot = jsonDecode(encoded) as Map<String, dynamic>;
    return (snapshot['workouts'] as List<dynamic>)
        .map((value) => _workoutFromSnapshot(value as Map<String, dynamic>))
        .toList(growable: false);
  }

  WorkoutDay _workoutFromSnapshot(Map<String, dynamic> value) {
    List<WorkoutSection> sections(String key) => (value[key] as List<dynamic>)
        .map((entry) {
          final section = entry as Map<String, dynamic>;
          return WorkoutSection(
            section['title']! as String,
            section['body']! as String,
          );
        })
        .toList(growable: false);
    WorkoutBenchmark? benchmark;
    if (value['benchmark'] case final Map<String, dynamic> raw) {
      benchmark = WorkoutBenchmark(
        kind: WorkoutBenchmarkKind.values.byName(raw['kind']! as String),
        id: raw['id']! as String,
        isRetest: raw['is_retest']! as bool,
      );
    }
    return WorkoutDay(
      sequence: value['sequence']! as int,
      phase: value['phase']! as String,
      title: value['title']! as String,
      full: sections('full'),
      sixty: sections('sixty'),
      recovery: sections('recovery'),
      fullMinutes: value['full_minutes']! as int,
      sixtyMinutes: value['sixty_minutes']! as int,
      prescriptionSignature: value['signature']! as String,
      fullConditioning: _conditioningFromSnapshot(value['full_conditioning']),
      sixtyConditioning: _conditioningFromSnapshot(value['sixty_conditioning']),
      benchmark: benchmark,
    );
  }

  ConditioningWork? _conditioningFromSnapshot(Object? source) {
    if (source is! Map<String, dynamic>) return null;
    final levelOptions = (source['level_options'] as List<dynamic>? ?? const [])
        .whereType<Map<String, dynamic>>()
        .map((raw) {
          final levelName = raw['label'];
          final level = levelName is String
              ? WorkoutLevel.values
                    .where((value) => value.name == levelName)
                    .firstOrNull
              : null;
          return level == null
              ? null
              : ConditioningLevelOption(
                  level: level,
                  prescription:
                      (raw['prescription'] as List<dynamic>? ?? const [])
                          .whereType<String>()
                          .toList(growable: false),
                  standards: (raw['standards'] as List<dynamic>? ?? const [])
                      .whereType<String>()
                      .toList(growable: false),
                );
        })
        .whereType<ConditioningLevelOption>()
        .toList(growable: false);
    final tasks = (source['tasks'] as List<dynamic>)
        .map((raw) {
          final task = raw as Map<String, dynamic>;
          return WorkoutTask(
            movement: task['movement']! as String,
            workSeconds: task['work_seconds'] as int?,
            restSeconds: task['rest_seconds'] as int?,
            quantities: (task['quantities'] as List<dynamic>)
                .map((rawQuantity) {
                  final quantity = rawQuantity as Map<String, dynamic>;
                  return PrescriptionQuantity(
                    (quantity['value']! as num).toDouble(),
                    PrescriptionUnit.values.byName(quantity['unit']! as String),
                  );
                })
                .toList(growable: false),
          );
        })
        .toList(growable: false);
    return ConditioningWork(
      durationMinutes: source['duration_minutes']! as int,
      effort: Effort.values.byName(source['effort']! as String),
      format: source['format']! as String,
      levelOptions: levelOptions,
      templateId: source['template_id'] as String?,
      workSeconds: source['work_seconds'] as int?,
      restSeconds: source['rest_seconds'] as int?,
      stationTargetSeconds:
          (source['station_target_seconds'] as List<dynamic>? ?? const [])
              .map((raw) {
                final target = raw as Map<String, dynamic>;
                return (target['min']! as int, target['max']! as int);
              })
              .toList(growable: false),
      tasks: tasks,
    );
  }

  List<WorkoutSection> _generatedSections(
    GeneratedDay day, {
    required bool includeAccessories,
    WorkoutBenchmark? benchmark,
  }) {
    final blocks = _groupedBlocks(day);
    final sections = <WorkoutSection>[
      WorkoutSection(
        'WARMUP • ${day.warmupMinutes} MIN',
        benchmark == null ? day.warmup.join('\n') : _benchmarkWarmup(benchmark),
      ),
      for (final block in blocks)
        WorkoutSection(
          block.$1,
          '${block.$2.map(_strengthPrescription).join('\n\n')}\n\n'
          'Move with consistent technique; no missed repetitions.',
        ),
    ];
    if (includeAccessories && day.accessories.isNotEmpty) {
      sections.add(
        WorkoutSection(
          'ACCESSORY • OPTIONAL',
          day.accessories.take(1).join('\n'),
        ),
      );
    }
    if (benchmark != null) {
      sections.add(_benchmarkSection(benchmark));
    }
    final conditioning = day.conditioning!;
    final levelLabel = switch (conditioning.level) {
      WorkoutLevel.ember => 'EMBER',
      WorkoutLevel.forge => 'FORGE',
      WorkoutLevel.ascendant => 'ASCENDANT • RX',
      WorkoutLevel.freeblade => 'FREEBLADE • CUSTOM',
    };
    if (benchmark == null || !benchmark.replacesConditioning) {
      sections.add(
        WorkoutSection(
          'CONDITIONING • ${conditioning.durationMinutes} MIN • $levelLabel',
          '${conditioning.format}\n\n'
              '${conditioning.prescription.join('\n')}\n\n'
              '${conditioning.rxStandards.isEmpty ? '' : '$levelLabel STANDARD\n${conditioning.rxStandards.join('\n')}\n\n'}'
              'Equipment: ${day.equipment.map(_equipmentName).join(', ')}',
        ),
      );
    }
    if (day.cooldown.isNotEmpty) {
      sections.add(
        WorkoutSection(
          'POST-QUEST STRETCH • ${day.cooldownMinutes} MIN',
          '${day.cooldown.join('\n')}\n\n'
              'This recovery block is intentionally outside the workout time cap.',
        ),
      );
    }
    return sections;
  }

  List<(String, List<StrengthWork>)> _groupedBlocks(GeneratedDay day) {
    final all = [day.strength!, ...day.secondaryStrength];
    final strength = all
        .where(
          (work) =>
              !_isSkillPracticeWork(work) &&
              work.primaryPattern != 'unilateral',
        )
        .toList();
    final skill = all.where(_isSkillPracticeWork).toList();
    final support = all
        .where((work) => work.primaryPattern == 'unilateral')
        .toList();
    return [
      if (strength.isNotEmpty) ('STRENGTH', strength),
      if (skill.isNotEmpty) ('SKILL PRACTICE', skill),
      if (support.isNotEmpty) ('SUPPORT WORK', support),
    ];
  }

  bool _isSkillPracticeWork(StrengthWork work) {
    final lower = work.movement.toLowerCase();
    return lower.contains('double-under') ||
        lower.contains('box jump') ||
        lower.contains('muscle-up') ||
        lower.contains('handstand') ||
        lower.contains('rope-climb') ||
        lower.contains('pull-up') ||
        lower.contains('ring dip') ||
        lower.contains('toes-to-bar') ||
        lower.contains('hanging ') ||
        lower.contains('l-sit') ||
        lower.contains('snatch') ||
        lower.contains('clean') ||
        lower.contains('jerk') ||
        work.loadingPattern == LoadingPattern.complex ||
        work.skill == 'advanced' ||
        work.primaryPattern == 'olympic_lift' ||
        work.primaryPattern == 'hanging_core' ||
        work.primaryPattern == 'inversion';
  }

  String _benchmarkWarmup(
    WorkoutBenchmark benchmark,
  ) => switch (benchmark.kind) {
    WorkoutBenchmarkKind.rowShortPower =>
      '3:00 very easy row\n'
          '3 rounds: 10 hard strokes + 50 seconds easy\n'
          'Rest 3:00, then begin the 200-meter test',
    WorkoutBenchmarkKind.rowTwoThousand =>
      '5:00 easy row\n'
          '3 rounds: 20 strokes at intended 2K rhythm + 60 seconds easy\n'
          'Rest 3:00, then begin the test',
    WorkoutBenchmarkKind.gymnasticsScreen =>
      '2 rounds at an easy pace:\n'
          '8 scapular pull-ups\n8 incline push-ups\n20-second active hang\n'
          '30 easy single-unders\nRest 2:00 before the assessment',
    WorkoutBenchmarkKind.runFourHundred =>
      '6:00 easy jog\n2 rounds: 20-meter skips + 20-meter strides\n'
          '2 × 60-meter progressive accelerations\nRest 3:00 before the test',
    WorkoutBenchmarkKind.skiSevenFifty =>
      '5:00 easy SkiErg\n3 rounds: 10 strong pulls + 50 seconds easy\n'
          'Rest 3:00 before the test',
    WorkoutBenchmarkKind.runMile =>
      '8:00 easy jog\nDynamic calf and hip preparation\n'
          '3 × 20-second strides with 60 seconds easy\nRest 3:00 before the test',
    WorkoutBenchmarkKind.bikeTenMinute =>
      '6:00 easy fan bike\n3 rounds: 15 seconds strong + 45 seconds easy\n'
          'Rest 3:00 before the test',
  };

  WorkoutSection _benchmarkSection(WorkoutBenchmark benchmark) {
    final postTestAerobic = benchmark.postTestAerobic;
    final postTestPrescription = postTestAerobic == null
        ? ''
        : '\n\nPOST-TEST AEROBIC\n'
              '${postTestAerobic.recoveryMinutes == 0 ? 'After the test:' : 'Rest ${postTestAerobic.recoveryMinutes}:00 after the test, then:'}\n'
              '${postTestAerobic.prescription}';
    final result = switch (benchmark.kind) {
      WorkoutBenchmarkKind.rowShortPower =>
        _benchmarkValues.containsKey('row_200_split_seconds') &&
                _benchmarkValues.containsKey('row_500_split_seconds')
            ? '\n\nRECORDED\n200 m: ${_formatTime(_benchmarkValues['row_200_split_seconds']! / 2.5)}\n'
                  '500 m: ${_formatTime(_benchmarkValues['row_500_split_seconds']!)}'
            : '',
      WorkoutBenchmarkKind.rowTwoThousand =>
        _benchmarkValues.containsKey('row_2000_split_seconds')
            ? '\n\nRECORDED\n2,000 m: ${_formatTime(_benchmarkValues['row_2000_split_seconds']! * 4)}\n'
                  'Average split: ${_formatTime(_benchmarkValues['row_2000_split_seconds']!)} / 500 m'
            : '',
      WorkoutBenchmarkKind.gymnasticsScreen =>
        _benchmarkValues.containsKey('strict_pullups_reps')
            ? '\n\nRECORDED\nStrict pull-ups: ${_benchmarkValues['strict_pullups_reps']!.round()}\n'
                  'Push-ups: ${_benchmarkValues['pushups_reps']!.round()}\n'
                  'Toes-to-bar: ${_benchmarkValues['toes_to_bar_reps']!.round()}\n'
                  'Double-unders: ${_benchmarkValues['double_unders_reps']!.round()}'
            : '',
      WorkoutBenchmarkKind.runFourHundred =>
        _benchmarkValues.containsKey('run_400_seconds')
            ? '\n\nRECORDED\n400 m: ${_formatTime(_benchmarkValues['run_400_seconds']!)}'
            : '',
      WorkoutBenchmarkKind.skiSevenFifty =>
        _benchmarkValues.containsKey('ski_750_split_seconds')
            ? '\n\nRECORDED\n750 m: ${_formatTime(_benchmarkValues['ski_750_split_seconds']! * 1.5)}\n'
                  'Average split: ${_formatTime(_benchmarkValues['ski_750_split_seconds']!)} / 500 m'
            : '',
      WorkoutBenchmarkKind.runMile =>
        _benchmarkValues.containsKey('run_mile_seconds')
            ? '\n\nRECORDED\n1 mile: ${_formatTime(_benchmarkValues['run_mile_seconds']!)}'
            : '',
      WorkoutBenchmarkKind.bikeTenMinute =>
        _benchmarkValues.containsKey('bike_10min_calories')
            ? '\n\nRECORDED\n10-minute calories: ${_benchmarkValues['bike_10min_calories']!.round()}\n'
                  'Average: ${(_benchmarkValues['bike_10min_calories']! / 10).toStringAsFixed(1)} cal/min'
            : '',
    };
    return WorkoutSection(
      'BENCHMARK • RECORD RESULT',
      switch (benchmark.kind) {
            WorkoutBenchmarkKind.rowShortPower =>
              'TEST 1\nRow 200 meters for time\n\n'
                  'REST 10:00 — remain moving gently and fully recover\n\n'
                  'TEST 2\nRow 500 meters for time\n\n'
                  'Record both results, then complete the easy downshift below.'
                  '$postTestPrescription',
            WorkoutBenchmarkKind.rowTwoThousand =>
              'Row 2,000 meters for time\n\n'
                  'Start near a pace you can sustain. Aim to keep the middle controlled and finish faster.\n\n'
                  'This is the entire conditioning prescription for today.',
            WorkoutBenchmarkKind.gymnasticsScreen =>
              'Complete each test fresh with 3:00 rest between efforts:\n\n'
                  'Maximum unbroken strict pull-ups\n'
                  'Maximum unbroken technically sound push-ups\n'
                  'Maximum unbroken toes-to-bar — enter 0 if not yet available\n'
                  'Maximum unbroken double-unders — enter 0 if not yet available\n\n'
                  'Stop a set when range of motion or control changes. The normal conditioning remains today.',
            WorkoutBenchmarkKind.runFourHundred =>
              'Run 400 meters for time\n\nUse the same measured route or track for future retests.\n\n'
                  'Record the test result before continuing.'
                  '$postTestPrescription',
            WorkoutBenchmarkKind.skiSevenFifty =>
              'SkiErg 750 meters for time\n\nRecord total time and average /500-meter split.\n\n'
                  'Record the test result before continuing.'
                  '$postTestPrescription',
            WorkoutBenchmarkKind.runMile =>
              'Run 1 mile for time\n\nUse an accurately measured, repeatable route. Start controlled and finish faster if able.\n\n'
                  'This replaces conditioning today.',
            WorkoutBenchmarkKind.bikeTenMinute =>
              'Fan bike for 10:00\n\nRecord total calories. Use the same bike model and settings for future comparisons.\n\n'
                  'This replaces conditioning today.',
          } +
          result,
    );
  }

  String _formatTime(double totalSeconds) {
    final tenths = (totalSeconds * 10).round();
    final minutes = tenths ~/ 600;
    final seconds = (tenths % 600) / 10;
    return '$minutes:${seconds.toStringAsFixed(1).padLeft(4, '0')}';
  }

  String _strengthPrescription(StrengthWork work) {
    final pattern = switch (work.loadingPattern) {
      LoadingPattern.ascending => 'Ascending sets',
      LoadingPattern.straight => 'Straight sets',
      LoadingPattern.topSetBackoff => 'Top set + backoff sets',
      LoadingPattern.wave => 'Loading wave',
      LoadingPattern.complex => 'Technical complex',
      LoadingPattern.deload => 'Deload',
    };
    final lines = work.steps
        .map((step) {
          if (step.percent == 0) {
            final unit = switch (work.prescriptionUnit) {
              PrescriptionUnit.reps => 'quality reps',
              PrescriptionUnit.seconds => 'seconds',
              PrescriptionUnit.meters => 'meters',
              PrescriptionUnit.contacts => 'contacts',
              _ => work.prescriptionUnit.name,
            };
            return '${step.sets} × ${step.reps} $unit';
          }
          final percent = _displayNumber(step.percent * 100);
          final max = work.trainingMax;
          final load = max == null
              ? 'set from current training max'
              : '${_displayNumber((max * step.percent / 5).round() * 5)} lb';
          return '${step.sets} × ${step.reps} at $percent% — $load';
        })
        .join('\n');
    return '${work.movement}\n$pattern\n$lines';
  }

  List<WorkoutSection> _recoverySections(GeneratedDay _) => const [
    WorkoutSection(
      'RECOVERY • 20 MIN',
      'Choose an easy row, bike, SkiErg, walk, or swim.\n'
          'Maintain a conversational pace throughout.',
    ),
    WorkoutSection(
      'MOBILITY • 8 MIN',
      'Move gently through the positions used in today’s planned session.\n'
          'Nothing should feel sharp, forced, or progressively worse.',
    ),
  ];

  String _displayNumber(double value) => value == value.roundToDouble()
      ? value.toInt().toString()
      : value.toStringAsFixed(1);

  String _equipmentName(String value) => value
      .split('_')
      .map((word) => '${word[0].toUpperCase()}${word.substring(1)}')
      .join(' ');

  @override
  void dispose() {
    _cardTimerTicker?.cancel();
    _strike.dispose();
    _workoutSwipe.dispose();
    super.dispose();
  }

  ScheduledWorkout? _assignmentFor(DateTime date) {
    for (final assignment in _schedule) {
      if (DateUtils.isSameDay(assignment.date, date)) return assignment;
    }
    return null;
  }

  WorkoutDay? _workoutFor(DateTime date) {
    final assignment = _assignmentFor(date);
    if (assignment == null ||
        assignment.status == ScheduleStatus.skipped ||
        assignment.sequence > _workouts.length) {
      return null;
    }
    return _workouts[assignment.sequence - 1];
  }

  Future<void> _reloadSchedule() async {
    final repository = _scheduleRepository;
    if (repository == null) return;
    final schedule = await repository.assignments();
    final pause = await repository.pauseState();
    if (mounted) {
      setState(() {
        _schedule = schedule;
        _programPause = pause;
      });
    }
  }

  Future<void> _deferSelectedWorkout() async {
    final assignment = _assignmentFor(_selected);
    if (assignment == null) return;
    final confirmed = await showDialog<bool>(
      context: context,
      builder: (context) => AlertDialog(
        title: const Text('Move workout forward?'),
        content: const Text(
          'This moves this workout and the remaining schedule to the next safe training days.',
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context, false),
            child: const Text('CANCEL'),
          ),
          FilledButton(
            onPressed: () => Navigator.pop(context, true),
            child: const Text('MOVE FORWARD'),
          ),
        ],
      ),
    );
    if (confirmed != true) return;
    await _scheduleRepository?.defer(assignment.assignmentId);
    await _reloadSchedule();
    if (!mounted) return;
    final moved = _schedule
        .where((item) => item.assignmentId == assignment.assignmentId)
        .firstOrNull;
    if (moved != null) setState(() => _selected = moved.date);
    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(
        content: Text(
          moved == null
              ? 'Quest moved to the next safe training day.'
              : 'Quest moved to ${DateFormat('EEE, MMM d').format(moved.date)}.',
        ),
      ),
    );
  }

  Future<void> _moveSelectedWorkoutEarlier() async {
    final assignment = _assignmentFor(_selected);
    if (assignment?.status != ScheduleStatus.completed) return;
    final assignmentId = assignment!.assignmentId;
    await _scheduleRepository?.moveNextPendingEarlier(assignmentId);
    await _reloadSchedule();
    if (!mounted) return;
    final moved = _schedule
        .where(
          (item) =>
              item.sequence > assignment.sequence &&
              (item.status == ScheduleStatus.planned ||
                  item.status == ScheduleStatus.unconfirmed),
        )
        .firstOrNull;
    if (moved != null) setState(() => _selected = moved.date);
    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(
        content: Text(
          moved == null
              ? 'No upcoming workout is available to move earlier.'
              : 'Next workout moved to ${DateFormat('EEE, MMM d').format(moved.date)}.',
        ),
      ),
    );
  }

  Future<void> _skipSelectedWorkout() async {
    final assignment = _assignmentFor(_selected);
    if (assignment == null) return;
    final confirmed = await showDialog<bool>(
      context: context,
      builder: (context) => AlertDialog(
        title: const Text('Skip this quest?'),
        content: const Text(
          'This records an intentional skip. It will not count as a completed workout.',
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context, false),
            child: const Text('CANCEL'),
          ),
          FilledButton(
            onPressed: () => Navigator.pop(context, true),
            child: const Text('SKIP QUEST'),
          ),
        ],
      ),
    );
    if (confirmed != true) return;
    await _scheduleRepository?.skip(assignment.assignmentId);
    await _reloadSchedule();
  }

  Future<void> _pauseProgram() async {
    final returnDate = await showDatePicker(
      context: context,
      initialDate: DateTime.now().add(const Duration(days: 7)),
      firstDate: DateUtils.dateOnly(DateTime.now()),
      lastDate: DateTime.now().add(const Duration(days: 365)),
      helpText: 'CHOOSE YOUR RETURN DATE',
    );
    if (returnDate == null) return;
    await _scheduleRepository?.pauseUntil(returnDate);
    await _reloadSchedule();
    if (mounted) setState(() => _selected = returnDate);
  }

  Future<void> _resumeEarly() async {
    final pause = _programPause;
    if (pause == null) return;
    final today = DateUtils.dateOnly(DateTime.now());
    final resumeDate = await showDatePicker(
      context: context,
      initialDate: today.isBefore(pause.returnOn) ? today : pause.returnOn,
      firstDate: pause.startedOn,
      lastDate: pause.returnOn,
      helpText: 'WHEN ARE YOU READY TO RETURN?',
    );
    if (resumeDate == null) return;
    await _scheduleRepository?.resumeEarly(resumeDate);
    await _reloadSchedule();
    if (mounted) setState(() => _selected = resumeDate);
  }

  Future<void> _undoScheduleChange() async {
    final changed =
        await _scheduleRepository?.undoLastScheduleChange() ?? false;
    await _reloadSchedule();
    if (!mounted) return;
    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(
        content: Text(
          changed ? 'Last schedule change undone.' : 'Nothing to undo.',
        ),
      ),
    );
  }

  List<WorkoutSection> _visibleSections(WorkoutDay workout) {
    final sections = switch (_variant) {
      WorkoutVariant.full => workout.full,
      WorkoutVariant.sixty => workout.sixty,
      WorkoutVariant.recovery => workout.recovery,
    };
    final benchmark = workout.benchmark;
    return [
      for (final section in sections)
        if (benchmark != null &&
            _variant != WorkoutVariant.recovery &&
            section.title.startsWith('BENCHMARK'))
          _benchmarkSection(benchmark)
        else
          section,
    ];
  }

  String _key(WorkoutDay workout, int index) =>
      'generated:${workout.sequence}:${_variant.name}:$index';

  List<_TrainingSubsection> _trainingSubsections(WorkoutSection section) {
    if (!const {
      'STRENGTH',
      'SKILL PRACTICE',
      'SUPPORT WORK',
    }.contains(section.title)) {
      return const [];
    }
    return section.body
        .split('\n\n')
        .where((block) => !block.startsWith('Move with consistent technique'))
        .map((block) {
          // Resolve while the movement heading is still present. Once a block
          // becomes an individual card, its title and prescription are stored
          // separately; resolving only the latter loses the lift needed to
          // select the athlete's PR/training max.
          final resolvedLines = resolvePercentageLoads(
            block,
            _athleteSettings.effectiveTrainingMaxesLb,
          ).split('\n');
          return _TrainingSubsection(
            title: resolvedLines.first,
            body: resolvedLines.skip(1).join('\n'),
          );
        })
        .toList(growable: false);
  }

  String _trainingSubsectionKey(
    WorkoutDay workout,
    int sectionIndex,
    int subsectionIndex,
  ) => '${_key(workout, sectionIndex)}:work:$subsectionIndex';

  Future<void> _completeTrainingSubsection(
    WorkoutDay workout,
    int sectionIndex,
    WorkoutSection section,
    int subsectionIndex,
  ) async {
    final key = _trainingSubsectionKey(workout, sectionIndex, subsectionIndex);
    final subsections = _trainingSubsections(section);
    final parentKey = _key(workout, sectionIndex);
    var parentCompleted = false;
    setState(() {
      if (_sectionState[key] == true) {
        _sectionState.remove(key);
        _fractureSeeds.remove(key);
      } else {
        _sectionState[key] = true;
        _fractureSeeds[key] = math.Random().nextInt(1 << 31);
      }
      final allDone = List.generate(
        subsections.length,
        (index) =>
            _sectionState[_trainingSubsectionKey(
              workout,
              sectionIndex,
              index,
            )] ==
            true,
      ).every((done) => done);
      if (allDone) {
        _sectionState[parentKey] = true;
        parentCompleted = true;
      } else {
        _sectionState.remove(parentKey);
      }
    });
    await _saveProgress();
    if (!parentCompleted) return;
    final sections = _visibleSections(workout);
    final finished = List.generate(
      sections.length,
      (index) =>
          sections[index].optional ||
          _sectionState[_key(workout, index)] == true,
    ).every((done) => done);
    if (finished) await _markWorkoutComplete(workout);
  }

  Future<void> _completeSection(WorkoutDay workout, int index) async {
    final key = _key(workout, index);
    if (_sectionState[key] == true) {
      setState(() {
        _sectionState.remove(key);
        _fractureSeeds.remove(key);
      });
      await _saveProgress();
      return;
    }
    final assignment = _assignmentFor(_selected);
    if (assignment != null &&
        (assignment.status == ScheduleStatus.planned ||
            assignment.status == ScheduleStatus.unconfirmed)) {
      await _scheduleRepository?.markInProgress(assignment.assignmentId);
    }
    setState(() {
      _sectionState[key] = true;
      _activeFractureSeed = math.Random().nextInt(1 << 31);
      _fractureSeeds[key] = _activeFractureSeed;
      if (_showCompletionStrikeAnimation) _strikingSection = index;
    });
    final sections = _visibleSections(workout);
    final required = [
      for (var i = 0; i < sections.length; i++)
        if (!sections[i].optional) i,
    ];
    final finished = required.every(
      (i) => _sectionState[_key(workout, i)] == true,
    );
    if (finished) {
      _completedWorkouts.add(workout.sequence);
      _partialWorkouts.remove(workout.sequence);
      if (assignment != null) {
        await _scheduleRepository?.complete(assignment.assignmentId);
      }
    }
    await _saveProgress();
    await _reloadSchedule();
    if (_showCompletionStrikeAnimation) {
      await _strike.forward(from: 0);
      if (mounted) setState(() => _strikingSection = null);
    }
    if (finished &&
        workout.benchmark != null &&
        (workout.benchmark!.isRetest ||
            !_hasBenchmarkResult(workout.benchmark!))) {
      await _recordBenchmark(workout);
    }
    if (finished &&
        mounted &&
        !(await _store?.containsKey('session_feedback_${workout.sequence}') ??
            false)) {
      await _collectFeedback(workout);
    }
  }

  Future<({bool proceeded, int? nextIndex})> _guidedCompleteSection(
    WorkoutDay workout,
    int index, {
    bool openNext = true,
  }) async {
    final sections = _visibleSections(workout);
    final section = sections[index];
    final nextIndex = _nextRequiredIncompleteIndex(
      workout,
      afterIndex: index,
      treatingIndexAsComplete: index,
    );
    final note = TextEditingController();
    final proceed = await showModalBottomSheet<bool>(
      context: context,
      isScrollControlled: true,
      backgroundColor: card,
      builder: (context) => Padding(
        padding: EdgeInsets.fromLTRB(
          24,
          22,
          24,
          MediaQuery.viewInsetsOf(context).bottom + 28,
        ),
        child: Column(
          mainAxisSize: MainAxisSize.min,
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(
              'COMPLETE • ${_sectionHeading(section.title)}',
              style: const TextStyle(
                color: ember,
                fontWeight: FontWeight.w900,
                fontSize: 18,
              ),
            ),
            const SizedBox(height: 8),
            const Text(
              'Add anything worth keeping, then continue when you are ready.',
              style: TextStyle(color: muted),
            ),
            const SizedBox(height: 14),
            TextField(
              controller: note,
              maxLines: 3,
              decoration: const InputDecoration(
                labelText: 'Optional note',
                border: OutlineInputBorder(),
              ),
            ),
            const SizedBox(height: 14),
            FilledButton(
              onPressed: () => Navigator.pop(context, true),
              child: Text(
                nextIndex == null ? 'FINISH WORKOUT' : 'SAVE & SHOW NEXT',
              ),
            ),
            TextButton(
              onPressed: () => Navigator.pop(context, false),
              child: const Text('SAVE & STAY HERE'),
            ),
          ],
        ),
      ),
    );
    if (!mounted) return (proceeded: false, nextIndex: null);
    if (section.title.startsWith('CONDITIONING')) {
      await _recordConditioningResult(workout);
    }
    if (note.text.trim().isNotEmpty) {
      await _store?.setString(
        'section_note_${_key(workout, index)}',
        note.text.trim(),
      );
    }
    await _completeSection(workout, index);
    if (proceed == true && nextIndex != null && mounted && openNext) {
      await _openGuidedSection(workout, nextIndex);
    }
    return (proceeded: proceed == true, nextIndex: nextIndex);
  }

  int? _nextRequiredIncompleteIndex(
    WorkoutDay workout, {
    int afterIndex = -1,
    int? treatingIndexAsComplete,
  }) {
    final sections = _visibleSections(workout);
    for (var index = afterIndex + 1; index < sections.length; index++) {
      if (!sections[index].optional &&
          index != treatingIndexAsComplete &&
          _sectionState[_key(workout, index)] != true) {
        return index;
      }
    }
    return null;
  }

  Future<void> _openGuidedSection(
    WorkoutDay workout,
    int index, {
    bool scrollIntoView = true,
  }) async {
    final sections = _visibleSections(workout);
    if (index < 0 || index >= sections.length) return;
    final assignment = _assignmentFor(_selected);
    if (assignment != null &&
        (assignment.status == ScheduleStatus.planned ||
            assignment.status == ScheduleStatus.unconfirmed)) {
      await _scheduleRepository?.markInProgress(assignment.assignmentId);
      await _reloadSchedule();
    }
    if (!mounted) return;
    final sectionKey = _key(workout, index);
    setState(() {
      _sectionExpanded[sectionKey] = true;
    });
    if (scrollIntoView) {
      await Future<void>.delayed(const Duration(milliseconds: 80));
      if (!mounted) return;
      final target = _sectionCardKeys[sectionKey]?.currentContext;
      if (target != null && target.mounted) {
        await Scrollable.ensureVisible(
          target,
          alignment: .08,
          duration: const Duration(milliseconds: 280),
          curve: Curves.easeOutCubic,
        );
      }
    }
    if (!mounted) return;
    if (_castConnected) {
      await _showOnChromecast(workout, sections[index], index);
    } else if (_externalDisplayAvailable) {
      await _showOnExternalDisplay(workout, sections[index], index);
    }
  }

  Future<void> _startGuidedWorkout(WorkoutDay workout) async {
    final initialIndex = _nextRequiredIncompleteIndex(workout);
    if (initialIndex == null) return;
    await _openGuidedSection(workout, initialIndex, scrollIntoView: false);
    if (!mounted) return;
    final sections = _visibleSections(workout);
    await Navigator.of(context).push<void>(
      MaterialPageRoute(
        fullscreenDialog: true,
        builder: (_) => GuidedWorkoutPage(
          workout: workout,
          sections: sections,
          initialIndex: initialIndex,
          headingFor: _sectionHeading,
          bodyFor: (index) => _sectionBody(workout, sections[index], index),
          isComplete: (index) => _sectionState[_key(workout, index)] == true,
          canSwap: (index) =>
              _substitutions.detectedMovements(sections[index].body).isNotEmpty,
          externalDisplayAvailable: _externalDisplayAvailable,
          castConnected: _castConnected,
          onShowExternal: (index) =>
              _showOnExternalDisplay(workout, sections[index], index),
          onShowCast: (index) =>
              _showOnChromecast(workout, sections[index], index),
          onSwap: (index) =>
              _chooseMovementSwap(workout, sections[index], index),
          onSelect: (index) =>
              _openGuidedSection(workout, index, scrollIntoView: false),
          onComplete: (index) =>
              _guidedCompleteSection(workout, index, openNext: false),
        ),
      ),
    );
  }

  Future<void> _markWorkoutComplete(WorkoutDay workout) async {
    final sections = _visibleSections(workout);
    setState(() {
      for (var index = 0; index < sections.length; index++) {
        final section = sections[index];
        final parentKey = _key(workout, index);
        _sectionState[parentKey] = true;
        _fractureSeeds[parentKey] = math.Random().nextInt(1 << 31);
        final subsections = _trainingSubsections(section);
        for (
          var subsectionIndex = 0;
          subsectionIndex < subsections.length;
          subsectionIndex++
        ) {
          final subsectionKey = _trainingSubsectionKey(
            workout,
            index,
            subsectionIndex,
          );
          _sectionState[subsectionKey] = true;
          _fractureSeeds[subsectionKey] = math.Random().nextInt(1 << 31);
        }
      }
      _completedWorkouts.add(workout.sequence);
      _partialWorkouts.remove(workout.sequence);
    });
    final assignment = _assignmentFor(_selected);
    if (assignment != null) {
      await _scheduleRepository?.complete(assignment.assignmentId);
    }
    await _saveProgress();
    await _reloadSchedule();
    if (workout.benchmark != null &&
        (workout.benchmark!.isRetest ||
            !_hasBenchmarkResult(workout.benchmark!))) {
      await _recordBenchmark(workout);
    }
    if (mounted &&
        !(await _store?.containsKey('session_feedback_${workout.sequence}') ??
            false)) {
      await _collectFeedback(workout);
    }
  }

  Future<void> _markWorkoutPartial(WorkoutDay workout) async {
    final sections = _visibleSections(workout);
    final completedCount = [
      for (var index = 0; index < sections.length; index++)
        if (_sectionState[_key(workout, index)] == true) index,
    ].length;
    if (completedCount == 0) {
      ScaffoldMessenger.of(context).showSnackBar(
        const SnackBar(
          content: Text(
            'Complete at least one section before logging a partial quest.',
          ),
        ),
      );
      return;
    }
    setState(() {
      _completedWorkouts.add(workout.sequence);
      _partialWorkouts.add(workout.sequence);
    });
    final assignment = _assignmentFor(_selected);
    if (assignment != null) {
      await _scheduleRepository?.complete(assignment.assignmentId);
    }
    await _saveProgress();
    await _reloadSchedule();
    if (mounted &&
        !(await _store?.containsKey('session_feedback_${workout.sequence}') ??
            false)) {
      await _collectFeedback(workout, partial: true);
    }
  }

  Future<void> _undoWorkoutCompletion(WorkoutDay workout) async {
    final partial = _partialWorkouts.contains(workout.sequence);
    final undo = await showDialog<bool>(
      context: context,
      builder: (context) => AlertDialog(
        title: Text(partial ? 'Undo partial quest?' : 'Undo victory claim?'),
        content: const Text(
          'This reopens the workout and clears its section checkmarks. Any benchmark or conditioning results you recorded will remain saved.',
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(context, false),
            child: const Text('CANCEL'),
          ),
          FilledButton(
            onPressed: () => Navigator.pop(context, true),
            child: const Text('UNDO'),
          ),
        ],
      ),
    );
    if (undo != true) return;

    final sections = _visibleSections(workout);
    setState(() {
      _completedWorkouts.remove(workout.sequence);
      _partialWorkouts.remove(workout.sequence);
      for (var index = 0; index < sections.length; index++) {
        final sectionKey = _key(workout, index);
        _sectionState.remove(sectionKey);
        _fractureSeeds.remove(sectionKey);
        final subsections = _trainingSubsections(sections[index]);
        for (
          var subsectionIndex = 0;
          subsectionIndex < subsections.length;
          subsectionIndex++
        ) {
          final subsectionKey = _trainingSubsectionKey(
            workout,
            index,
            subsectionIndex,
          );
          _sectionState.remove(subsectionKey);
          _fractureSeeds.remove(subsectionKey);
        }
      }
    });
    final assignment = _assignmentFor(_selected);
    if (assignment != null) {
      await _scheduleRepository?.reopen(assignment.assignmentId);
    }
    await _saveProgress();
    await _reloadSchedule();
  }

  bool _hasBenchmarkResult(WorkoutBenchmark benchmark) =>
      benchmark.hasCompleteResult(_benchmarkValues);

  ConditioningWork? _conditioningFor(WorkoutDay workout) => switch (_variant) {
    WorkoutVariant.full => workout.fullConditioning,
    WorkoutVariant.sixty => workout.sixtyConditioning,
    WorkoutVariant.recovery => null,
  };

  String _conditioningSelectionKey(WorkoutDay workout) =>
      '${workout.sequence}:${_variant.name}';

  _ConditioningSelection _conditioningSelection(WorkoutDay workout) =>
      _conditioningSelections[_conditioningSelectionKey(workout)] ??
      const _ConditioningSelection();

  Future<void> _saveConditioningSelection(
    WorkoutDay workout,
    _ConditioningSelection selection,
  ) async {
    final store = _store;
    if (store == null) return;
    final key = _conditioningSelectionKey(workout);
    setState(() => _conditioningSelections[key] = selection);
    await store.setString(
      'conditioning_levels_v1',
      jsonEncode({
        for (final entry in _conditioningSelections.entries)
          entry.key: entry.value.encode(),
      }),
    );
  }

  Future<void> _editCustomConditioningPrescription(
    WorkoutDay workout,
    ConditioningWork conditioning,
  ) async {
    final existing = _conditioningSelection(workout);
    var body =
        existing.customPrescription ??
        _conditioningBodyForLevel(
          workout,
          conditioning,
          existing.levelId == 'custom' ? 'level_2' : existing.levelId,
        );
    if (existing.customPrescription == null) {
      body = _inlineConditioningPrescription(
        body,
        conditioning.templateId,
        _conditioningStandards(workout, conditioning),
      );
    }
    final targets = <_ConditioningTargetEdit>[];
    final targetExpression = RegExp(
      r'^(?:(?:Odd|Even|Minute \d+):\s*)?(\d+(?:/\d+)?)(?=-calorie|\s+[A-Za-z])',
      caseSensitive: false,
    );
    for (final line in body.split('\n')) {
      final match = targetExpression.firstMatch(line);
      if (match == null) continue;
      final value = match.group(1)!;
      targets.add(
        _ConditioningTargetEdit(
          line: line,
          value: value,
          label: line.replaceFirst(value, '___'),
        ),
      );
    }
    final loads = <_ConditioningLoadEdit>[];
    final loadExpression = RegExp(
      r'(?:♀\s*)?\d+\s*(?:lb|in|ft)(?:\s*(?:/|to)\s*(?:♂\s*)?\d+\s*(?:lb|in|ft))?',
      caseSensitive: false,
    );
    for (final match in loadExpression.allMatches(body)) {
      final value = match.group(0)!;
      final lineStart = body.lastIndexOf('\n', match.start) + 1;
      final lineEnd = body.indexOf('\n', match.end);
      final line = body.substring(
        lineStart,
        lineEnd < 0 ? body.length : lineEnd,
      );
      loads.add(
        _ConditioningLoadEdit(
          value: value,
          label: line.replaceFirst(value, '___'),
        ),
      );
    }
    String? error;
    final custom = await showModalBottomSheet<String>(
      context: context,
      isScrollControlled: true,
      backgroundColor: card,
      builder: (context) => StatefulBuilder(
        builder: (context, setModalState) => SafeArea(
          child: SingleChildScrollView(
            padding: EdgeInsets.fromLTRB(
              24,
              22,
              24,
              MediaQuery.viewInsetsOf(context).bottom + 28,
            ),
            child: Column(
              mainAxisSize: MainAxisSize.min,
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text(
                  'EDIT WORKOUT TARGETS',
                  style: TextStyle(
                    color: ember,
                    fontSize: 18,
                    fontWeight: FontWeight.w900,
                  ),
                ),
                const SizedBox(height: 8),
                const Text(
                  'Adjust quantities and loading only. The workout movements, format, and coaching cues stay intact.',
                  style: TextStyle(color: muted, height: 1.35),
                ),
                for (final target in targets) ...[
                  const SizedBox(height: 14),
                  Text(target.label, style: const TextStyle(color: cyan)),
                  const SizedBox(height: 6),
                  TextField(
                    controller: target.controller,
                    keyboardType: TextInputType.number,
                    decoration: const InputDecoration(
                      border: OutlineInputBorder(),
                      labelText: 'TARGET',
                    ),
                  ),
                ],
                for (final load in loads) ...[
                  const SizedBox(height: 14),
                  Text(load.label, style: const TextStyle(color: cyan)),
                  const SizedBox(height: 6),
                  TextField(
                    controller: load.controller,
                    decoration: const InputDecoration(
                      border: OutlineInputBorder(),
                      labelText: 'LOAD / HEIGHT',
                    ),
                  ),
                ],
                if (error != null) ...[
                  const SizedBox(height: 12),
                  Text(error!, style: const TextStyle(color: Colors.redAccent)),
                ],
                const SizedBox(height: 16),
                Row(
                  children: [
                    Expanded(
                      child: TextButton(
                        onPressed: () => Navigator.pop(context),
                        child: const Text('CANCEL'),
                      ),
                    ),
                    const SizedBox(width: 10),
                    Expanded(
                      flex: 2,
                      child: FilledButton(
                        onPressed: () {
                          if (targets.any(
                            (target) => !RegExp(
                              r'^\d+(?:/\d+)?$',
                            ).hasMatch(target.controller.text.trim()),
                          )) {
                            setModalState(
                              () => error =
                                  'Use a whole number or a pair such as 10/8.',
                            );
                            return;
                          }
                          var edited = body;
                          for (final target in targets) {
                            edited = edited.replaceFirst(
                              target.line,
                              target.line.replaceFirst(
                                target.value,
                                target.controller.text.trim(),
                              ),
                            );
                          }
                          for (final load in loads) {
                            final value = load.controller.text.trim();
                            if (value.isEmpty) {
                              setModalState(
                                () => error = 'Enter every load or height.',
                              );
                              return;
                            }
                            edited = edited.replaceFirst(load.value, value);
                          }
                          Navigator.pop(context, edited);
                        },
                        child: const Text('SAVE TARGETS'),
                      ),
                    ),
                  ],
                ),
              ],
            ),
          ),
        ),
      ),
    );
    _releaseSheetTextControllers([
      for (final target in targets) target.controller,
      for (final load in loads) load.controller,
    ]);
    if (custom == null || custom.isEmpty) return;
    await _saveConditioningSelection(
      workout,
      _ConditioningSelection(levelId: 'custom', customPrescription: custom),
    );
  }

  String _conditioningLevelLabel(String levelId) => switch (levelId) {
    'level_1' => 'EMBER',
    'level_2' => 'FORGE',
    'level_3' => 'ASCENDANT • RX',
    _ => 'FREEBLADE • CUSTOM',
  };

  List<String> _conditioningPrescription(
    WorkoutDay workout,
    ConditioningWork conditioning,
  ) {
    final selection = _conditioningSelection(workout);
    if (selection.levelId == 'custom' &&
        selection.customPrescription?.trim().isNotEmpty == true) {
      return selection.customPrescription!
          .split('\n')
          .where((line) => line.trim().isNotEmpty)
          .toList(growable: false);
    }
    final selected = _conditioningLevelOption(conditioning, selection.levelId);
    if (selected?.prescription.isNotEmpty ?? false) {
      return selected!.prescription;
    }
    return _publishedStandardsForLevel(
      conditioning.templateId,
      selection.levelId,
    );
  }

  ConditioningLevelOption? _conditioningLevelOption(
    ConditioningWork conditioning,
    String levelId,
  ) {
    for (final option in conditioning.levelOptions) {
      if (option.id == levelId) return option;
    }
    return null;
  }

  List<String> _conditioningStandards(
    WorkoutDay workout,
    ConditioningWork conditioning,
  ) {
    final selection = _conditioningSelection(workout);
    final selected = _conditioningLevelOption(conditioning, selection.levelId);
    return selected?.standards ??
        _publishedStandardsForLevel(conditioning.templateId, selection.levelId);
  }

  String _applyConditioningLevel(
    String body,
    WorkoutDay workout,
    ConditioningWork conditioning,
  ) {
    final selection = _conditioningSelection(workout);
    if (selection.levelId == 'custom' &&
        selection.customPrescription?.trim().isNotEmpty == true) {
      return 'EDITED PRESCRIPTION\n\n${selection.customPrescription!.trim()}';
    }
    return _applyConditioningLevelForId(body, conditioning, selection.levelId);
  }

  String _applyConditioningLevelForId(
    String body,
    ConditioningWork conditioning,
    String levelId,
  ) {
    if (levelId == 'custom') return body;
    final selected = _conditioningLevelOption(conditioning, levelId);
    final rx = _conditioningLevelOption(conditioning, 'level_3');
    if (selected?.prescription.isNotEmpty == true &&
        rx?.prescription.isNotEmpty == true) {
      for (
        var index = 0;
        index < rx!.prescription.length &&
            index < selected!.prescription.length;
        index++
      ) {
        body = body.replaceAll(
          rx.prescription[index],
          selected.prescription[index],
        );
      }
      return body;
    }
    return _scaleLegacyMachineCalories(body, levelId);
  }

  String _conditioningBodyForLevel(
    WorkoutDay workout,
    ConditioningWork conditioning,
    String levelId,
  ) {
    final sections = switch (_variant) {
      WorkoutVariant.full => workout.full,
      WorkoutVariant.sixty => workout.sixty,
      WorkoutVariant.recovery => workout.recovery,
    };
    for (final section in sections) {
      if (section.title.startsWith('CONDITIONING')) {
        return _applyConditioningLevelForId(
          section.body,
          conditioning,
          levelId,
        );
      }
    }
    return '';
  }

  /// Keeps cached snapshots published before level prescriptions were embedded
  /// in sync with the engine. RX is authored for a 40–45 second work window;
  /// Forge uses a 30-second output budget (2/3), Ember 20–25 seconds (1/2).
  String _scaleLegacyMachineCalories(String body, String levelId) {
    // Snapshots published before the RX pull-up standard was elevated retain
    // the older plain-pull-up wording. Normalize that wording before applying
    // the same progression used by the current engine.
    const chestToBarMarker = '__chest_to_bar_pull_ups__';
    body = body
        .replaceAll('chest-to-bar pull-ups', chestToBarMarker)
        .replaceAll('pull-ups', 'chest-to-bar pull-ups')
        .replaceAll(chestToBarMarker, 'chest-to-bar pull-ups');
    final multiplier = switch (levelId) {
      'level_2' => 2 / 3,
      'level_1' => 1 / 2,
      _ => null,
    };
    if (multiplier == null) return body;
    final forge = <String, String>{
      'strict handstand push-ups': 'pike push-ups',
      'chest-to-bar pull-ups': '__pull_ups__',
      'bar muscle-ups': '__pull_ups__',
      'pull-ups': 'band-assisted pull-ups',
      '__pull_ups__': 'pull-ups',
      'rope climb': 'rope pulls from the floor',
      'toes-to-bar': 'knees-to-elbows',
      'double-unders': 'high-jumping single-unders',
      'box jumps': 'low-box step-ups',
    };
    final ember = <String, String>{
      'pike push-ups': 'incline push-ups',
      'pull-ups': 'band-assisted pull-ups',
      'knees-to-elbows': 'hanging knee raises',
      'box jumps': 'box step-ups',
      'high-jumping single-unders': 'line hops',
    };
    for (final entry in forge.entries) {
      body = body.replaceAll(entry.key, entry.value);
    }
    if (levelId == 'level_1') {
      for (final entry in ember.entries) {
        body = body.replaceAll(entry.key, entry.value);
      }
    }
    body = body.replaceAllMapped(RegExp(r'(\d+)(?:/(\d+))?-calorie\b'), (
      match,
    ) {
      String scale(String value) =>
          math.max(1, (int.parse(value) * multiplier).round()).toString();
      final first = scale(match.group(1)!);
      final second = match.group(2);
      return second == null
          ? '$first-calorie'
          : '$first/${scale(second)}-calorie';
    });
    return body;
  }

  String _workUnitFor(ConditioningWork conditioning) {
    final units = conditioning.tasks
        .expand((task) => task.quantities)
        .map((quantity) => quantity.unit)
        .toSet();
    if (units.contains(PrescriptionUnit.calories)) return 'calories';
    if (units.contains(PrescriptionUnit.meters)) return 'meters';
    if (units.contains(PrescriptionUnit.contacts)) return 'contacts';
    return 'repetitions';
  }

  Future<void> _recordConditioningResult(WorkoutDay workout) async {
    final conditioning = _conditioningFor(workout);
    final store = _store;
    if (conditioning == null || store == null) return;
    final existing = _conditioningResults[workout.sequence];
    final selection = _conditioningSelection(workout);
    final performedPrescription = _conditioningPrescription(
      workout,
      conditioning,
    );
    final minutes = TextEditingController();
    final seconds = TextEditingController();
    final rounds = TextEditingController();
    final reps = TextEditingController();
    final work = TextEditingController();
    final note = TextEditingController(text: existing?.note ?? '');
    final format = conditioning.format;
    final intervalCount =
        conditioning.workSeconds != null && conditioning.restSeconds != null
        ? conditioning.durationMinutes *
              60 ~/
              (conditioning.workSeconds! + conditioning.restSeconds!)
        : 0;
    final splitControllers = [
      for (var index = 0; index < intervalCount; index++)
        TextEditingController(
          text: existing != null && existing.intervalSplits.length > index
              ? existing.intervalSplits[index].toString()
              : '',
        ),
    ];
    var capped = existing?.schema == ConditioningScoreSchema.cappedForTime;
    if (existing?.schema == ConditioningScoreSchema.forTime) {
      final finish = existing!.values['finish_seconds']!;
      minutes.text = (finish ~/ 60).toString();
      seconds.text = (finish % 60).toStringAsFixed(1);
    } else if (existing?.schema == ConditioningScoreSchema.cappedForTime ||
        existing?.schema == ConditioningScoreSchema.amrap) {
      rounds.text =
          (existing!.values['completed_rounds'] ??
                  existing.values['rounds'] ??
                  0)
              .toString();
      reps.text =
          (existing.values['completed_reps'] ?? existing.values['reps'] ?? 0)
              .toString();
    } else if (existing?.schema == ConditioningScoreSchema.totalWork) {
      work.text = existing!.values['work_completed'].toString();
    }
    String? error;
    final saved = await showModalBottomSheet<ConditioningResult>(
      context: context,
      isScrollControlled: true,
      backgroundColor: card,
      builder: (context) => StatefulBuilder(
        builder: (context, setModalState) {
          final isForTime = format == 'For time';
          final isAmrap = format == 'AMRAP';
          final isIntervals =
              format == 'Intervals' && splitControllers.isNotEmpty;
          final unit = _workUnitFor(conditioning);
          final title = switch (format) {
            'For time' => capped ? 'CAPPED FOR-TIME RESULT' : 'FOR-TIME RESULT',
            'AMRAP' => 'AMRAP RESULT',
            'Intervals' => 'INTERVAL SPLITS',
            _ => 'CONDITIONING RESULT',
          };
          void save() {
            double? number(TextEditingController controller) =>
                double.tryParse(controller.text.trim());
            final values = <String, double>{};
            final schema = isForTime
                ? capped
                      ? ConditioningScoreSchema.cappedForTime
                      : ConditioningScoreSchema.forTime
                : isAmrap
                ? ConditioningScoreSchema.amrap
                : isIntervals
                ? ConditioningScoreSchema.intervals
                : ConditioningScoreSchema.totalWork;
            if (schema == ConditioningScoreSchema.forTime) {
              final minuteValue = number(minutes);
              final secondValue = number(seconds);
              if (minuteValue == null ||
                  secondValue == null ||
                  secondValue < 0) {
                setModalState(() => error = 'Enter a valid finish time.');
                return;
              }
              values['finish_seconds'] = minuteValue * 60 + secondValue;
            } else if (schema == ConditioningScoreSchema.cappedForTime) {
              values['completed_rounds'] = number(rounds) ?? -1;
              values['completed_reps'] = number(reps) ?? -1;
            } else if (schema == ConditioningScoreSchema.amrap) {
              values['rounds'] = number(rounds) ?? -1;
              values['reps'] = number(reps) ?? -1;
            } else if (schema == ConditioningScoreSchema.intervals) {
              final splits = splitControllers
                  .map((controller) => number(controller))
                  .toList();
              if (splits.any((value) => value == null || value < 0)) {
                setModalState(() => error = 'Enter every interval result.');
                return;
              }
              values['total_work'] = splits.fold<double>(
                0,
                (sum, value) => sum + value!,
              );
            } else {
              values['work_completed'] = number(work) ?? -1;
            }
            final intervalSplits = schema == ConditioningScoreSchema.intervals
                ? splitControllers
                      .map((controller) => number(controller)!)
                      .toList(growable: false)
                : const <double>[];
            if (!ConditioningResult.isValid(
              schema,
              values,
              intervalSplits: intervalSplits,
            )) {
              setModalState(() => error = 'Enter a valid completed result.');
              return;
            }
            Navigator.pop(
              context,
              ConditioningResult(
                workoutSequence: workout.sequence,
                templateId:
                    conditioning.templateId ?? workout.prescriptionSignature,
                variant: _variant.name,
                schema: schema,
                values: values,
                intervalSplits: intervalSplits,
                workUnit: schema == ConditioningScoreSchema.totalWork
                    ? unit
                    : null,
                prescriptionLabel: _conditioningLevelLabel(selection.levelId),
                prescription: performedPrescription.join('\n'),
                note: note.text,
                recordedAt: DateTime.now(),
              ),
            );
          }

          return Padding(
            padding: EdgeInsets.fromLTRB(
              24,
              22,
              24,
              MediaQuery.viewInsetsOf(context).bottom + 30,
            ),
            child: SingleChildScrollView(
              child: Column(
                mainAxisSize: MainAxisSize.min,
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    title,
                    style: const TextStyle(
                      color: ember,
                      fontSize: 18,
                      fontWeight: FontWeight.w900,
                    ),
                  ),
                  const SizedBox(height: 6),
                  Text(
                    '$format • ${conditioning.durationMinutes}-minute prescription',
                    style: const TextStyle(color: muted),
                  ),
                  if (isForTime)
                    SwitchListTile.adaptive(
                      contentPadding: EdgeInsets.zero,
                      value: capped,
                      onChanged: (value) => setModalState(() => capped = value),
                      title: const Text('Time cap reached?'),
                      subtitle: const Text(
                        'Record completed work instead of inventing a finish time.',
                      ),
                    ),
                  if (isForTime && !capped)
                    Row(
                      children: [
                        Expanded(child: _resultField(minutes, 'MINUTES')),
                        const SizedBox(width: 10),
                        Expanded(child: _resultField(seconds, 'SECONDS')),
                      ],
                    )
                  else if (isForTime || isAmrap)
                    Row(
                      children: [
                        Expanded(child: _resultField(rounds, 'ROUNDS')),
                        const SizedBox(width: 10),
                        Expanded(child: _resultField(reps, 'REPS')),
                      ],
                    )
                  else if (isIntervals)
                    Column(
                      children: [
                        for (
                          var index = 0;
                          index < splitControllers.length;
                          index++
                        ) ...[
                          _resultField(
                            splitControllers[index],
                            'INTERVAL ${index + 1} • ${unit.toUpperCase()}',
                          ),
                          if (index + 1 < splitControllers.length)
                            const SizedBox(height: 10),
                        ],
                      ],
                    )
                  else
                    _resultField(work, 'TOTAL ${unit.toUpperCase()}'),
                  const SizedBox(height: 12),
                  TextField(
                    controller: note,
                    maxLines: 2,
                    decoration: const InputDecoration(
                      labelText: 'OPTIONAL NOTE',
                      border: OutlineInputBorder(),
                    ),
                  ),
                  if (error != null) ...[
                    const SizedBox(height: 10),
                    Text(
                      error!,
                      style: const TextStyle(color: Colors.redAccent),
                    ),
                  ],
                  const SizedBox(height: 18),
                  SizedBox(
                    width: double.infinity,
                    child: FilledButton(
                      onPressed: save,
                      child: const Text('SAVE CONDITIONING RESULT'),
                    ),
                  ),
                ],
              ),
            ),
          );
        },
      ),
    );
    _releaseSheetTextControllers([
      minutes,
      seconds,
      rounds,
      reps,
      work,
      note,
      ...splitControllers,
    ]);
    if (saved == null) return;
    await ConditioningResultsRepository(store).save(saved);
    if (!mounted) return;
    setState(
      () => _conditioningResults = {
        ..._conditioningResults,
        workout.sequence: saved,
      },
    );
  }

  Widget _resultField(TextEditingController controller, String label) =>
      TextField(
        controller: controller,
        keyboardType: const TextInputType.numberWithOptions(decimal: true),
        decoration: InputDecoration(
          labelText: label,
          border: const OutlineInputBorder(),
        ),
      );

  Future<void> _recordBenchmark(WorkoutDay workout) async {
    final benchmark = workout.benchmark;
    final store = _store;
    if (benchmark == null || store == null) return;
    if (benchmark.kind == WorkoutBenchmarkKind.gymnasticsScreen ||
        benchmark.kind == WorkoutBenchmarkKind.bikeTenMinute) {
      await _recordCountBenchmark(workout);
      return;
    }
    final firstMinutes = TextEditingController();
    final firstSeconds = TextEditingController();
    final secondMinutes = TextEditingController();
    final secondSeconds = TextEditingController();
    String? error;
    final saved = await showModalBottomSheet<bool>(
      context: context,
      isScrollControlled: true,
      useSafeArea: true,
      isDismissible: false,
      enableDrag: false,
      backgroundColor: card,
      builder: (context) => StatefulBuilder(
        builder: (context, setModalState) {
          double? readTime(
            TextEditingController minutes,
            TextEditingController seconds,
          ) {
            final m = int.tryParse(minutes.text.trim());
            final s = double.tryParse(seconds.text.trim());
            if (m == null || s == null || m < 0 || s < 0 || s >= 60) {
              return null;
            }
            final total = m * 60 + s;
            return total > 0 ? total : null;
          }

          void save() {
            final first = readTime(firstMinutes, firstSeconds);
            final second = benchmark.kind == WorkoutBenchmarkKind.rowShortPower
                ? readTime(secondMinutes, secondSeconds)
                : 1.0;
            if (first == null || second == null) {
              setModalState(
                () => error = 'Enter minutes and seconds between 0 and 59.9.',
              );
              return;
            }
            Navigator.pop(context, true);
          }

          return Padding(
            padding: EdgeInsets.fromLTRB(
              24,
              22,
              24,
              MediaQuery.viewInsetsOf(context).bottom + 30,
            ),
            child: Column(
              mainAxisSize: MainAxisSize.min,
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text(
                  'RECORD BENCHMARK',
                  style: TextStyle(
                    color: ember,
                    fontSize: 18,
                    fontWeight: FontWeight.w900,
                  ),
                ),
                const SizedBox(height: 8),
                Text(
                  benchmark.kind == WorkoutBenchmarkKind.rowShortPower
                      ? 'Enter both rowing test times.'
                      : 'Enter the total test time.',
                  style: const TextStyle(color: muted),
                ),
                const SizedBox(height: 18),
                _benchmarkTimeFields(
                  switch (benchmark.kind) {
                    WorkoutBenchmarkKind.rowShortPower => '200 METER ROW',
                    WorkoutBenchmarkKind.rowTwoThousand => '2,000 METER ROW',
                    WorkoutBenchmarkKind.runFourHundred => '400 METER RUN',
                    WorkoutBenchmarkKind.skiSevenFifty => '750 METER SKIERG',
                    WorkoutBenchmarkKind.runMile => '1 MILE RUN',
                    _ => 'TEST TIME',
                  },
                  firstMinutes,
                  firstSeconds,
                ),
                if (benchmark.kind == WorkoutBenchmarkKind.rowShortPower) ...[
                  const SizedBox(height: 16),
                  _benchmarkTimeFields(
                    '500 METER TIME',
                    secondMinutes,
                    secondSeconds,
                  ),
                ],
                if (error != null) ...[
                  const SizedBox(height: 12),
                  Text(error!, style: const TextStyle(color: Colors.redAccent)),
                ],
                const SizedBox(height: 20),
                Row(
                  children: [
                    Expanded(
                      child: OutlinedButton(
                        onPressed: () => Navigator.pop(context),
                        child: const Text('CANCEL'),
                      ),
                    ),
                    const SizedBox(width: 12),
                    Expanded(
                      child: FilledButton(
                        onPressed: save,
                        child: const Text('SAVE RESULT'),
                      ),
                    ),
                  ],
                ),
              ],
            ),
          );
        },
      ),
    );
    if (saved == true) {
      double total(
        TextEditingController minutes,
        TextEditingController seconds,
      ) =>
          int.parse(minutes.text.trim()) * 60 +
          double.parse(seconds.text.trim());
      final first = total(firstMinutes, firstSeconds);
      final results = benchmark.normalizeResults([
        first,
        if (benchmark.kind == WorkoutBenchmarkKind.rowShortPower)
          total(secondMinutes, secondSeconds),
      ]);
      final benchmarkRepository = BenchmarkResultsRepository(store);
      if (benchmark.isRetest) {
        await benchmarkRepository.record(benchmark.id, results);
      } else {
        await benchmarkRepository.recordOrUpdateCurrent(benchmark.id, results);
      }
      _benchmarkValues
        ..clear()
        ..addAll(await benchmarkRepository.load());
      _benchmarkHistory = await benchmarkRepository.history();
      await _recordSnapshotTransformation(
        type: 'benchmark_reference',
        reason:
            'Benchmark result recorded; future pace or output references may update.',
        workoutSequence: workout.sequence,
        payload: {'benchmark_id': benchmark.id, 'values': results},
      );
      if (mounted) {
        setState(() {});
        ScaffoldMessenger.of(context).showSnackBar(
          const SnackBar(
            content: Text('Benchmark saved. Future pace targets updated.'),
          ),
        );
      }
    }
    _releaseSheetTextControllers([
      firstMinutes,
      firstSeconds,
      secondMinutes,
      secondSeconds,
    ]);
  }

  Future<void> _recordCountBenchmark(WorkoutDay workout) async {
    final benchmark = workout.benchmark!;
    final store = _store!;
    final isBike = benchmark.kind == WorkoutBenchmarkKind.bikeTenMinute;
    final labels = isBike
        ? const ['TOTAL CALORIES']
        : const ['STRICT PULL-UPS', 'PUSH-UPS', 'TOES-TO-BAR', 'DOUBLE-UNDERS'];
    final controllers = [for (final _ in labels) TextEditingController()];
    String? error;
    final saved = await showModalBottomSheet<bool>(
      context: context,
      isScrollControlled: true,
      useSafeArea: true,
      isDismissible: false,
      enableDrag: false,
      backgroundColor: card,
      builder: (context) => StatefulBuilder(
        builder: (context, setModalState) => Padding(
          padding: EdgeInsets.fromLTRB(
            24,
            22,
            24,
            MediaQuery.viewInsetsOf(context).bottom + 30,
          ),
          child: SingleChildScrollView(
            child: Column(
              mainAxisSize: MainAxisSize.min,
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text(
                  'RECORD BENCHMARK',
                  style: TextStyle(
                    color: ember,
                    fontSize: 18,
                    fontWeight: FontWeight.w900,
                  ),
                ),
                const SizedBox(height: 16),
                for (var index = 0; index < labels.length; index++) ...[
                  TextField(
                    controller: controllers[index],
                    keyboardType: TextInputType.number,
                    decoration: InputDecoration(
                      labelText: labels[index],
                      helperText: !isBike && index >= 2
                          ? 'Enter 0 if not yet available'
                          : null,
                      border: const OutlineInputBorder(),
                    ),
                  ),
                  const SizedBox(height: 12),
                ],
                if (error != null)
                  Text(error!, style: const TextStyle(color: Colors.redAccent)),
                const SizedBox(height: 12),
                Row(
                  children: [
                    Expanded(
                      child: OutlinedButton(
                        onPressed: () => Navigator.pop(context),
                        child: const Text('CANCEL'),
                      ),
                    ),
                    const SizedBox(width: 12),
                    Expanded(
                      child: FilledButton(
                        onPressed: () {
                          final values = controllers
                              .map(
                                (controller) =>
                                    int.tryParse(controller.text.trim()),
                              )
                              .toList();
                          if (values.any(
                                (value) => value == null || value < 0,
                              ) ||
                              (isBike && values.first == 0)) {
                            setModalState(
                              () =>
                                  error = 'Enter a valid whole-number result.',
                            );
                            return;
                          }
                          Navigator.pop(context, true);
                        },
                        child: const Text('SAVE RESULT'),
                      ),
                    ),
                  ],
                ),
              ],
            ),
          ),
        ),
      ),
    );
    if (saved == true) {
      final results = benchmark.normalizeResults(
        controllers
            .map((controller) => int.parse(controller.text.trim()))
            .toList(),
      );
      final benchmarkRepository = BenchmarkResultsRepository(store);
      if (benchmark.isRetest) {
        await benchmarkRepository.record(benchmark.id, results);
      } else {
        await benchmarkRepository.recordOrUpdateCurrent(benchmark.id, results);
      }
      _benchmarkValues
        ..clear()
        ..addAll(await benchmarkRepository.load());
      _benchmarkHistory = await benchmarkRepository.history();
      await _recordSnapshotTransformation(
        type: 'benchmark_reference',
        reason:
            'Benchmark result recorded; future pace or output references may update.',
        workoutSequence: workout.sequence,
        payload: {'benchmark_id': benchmark.id, 'values': results},
      );
      if (mounted) {
        setState(() {});
        ScaffoldMessenger.of(context).showSnackBar(
          const SnackBar(
            content: Text('Benchmark saved. Future targets updated.'),
          ),
        );
      }
    }
    _releaseSheetTextControllers(controllers);
  }

  void _releaseSheetTextControllers(Iterable<TextEditingController> _) {
    // Do not dispose here. A bottom sheet can remain in the Navigator/IME exit
    // transition after its Future completes. Disposing a focused controller in
    // that window triggers Flutter's `_dependents.isEmpty` assertion on Android.
    // These one-shot controllers become unreachable after dismissal and are
    // safely reclaimed after the framework has released their EditableText.
    // New input sheets must call this helper rather than disposing controllers
    // immediately after `showModalBottomSheet` or `showDialog` completes.
  }

  Widget _benchmarkTimeFields(
    String label,
    TextEditingController minutes,
    TextEditingController seconds,
  ) => Column(
    crossAxisAlignment: CrossAxisAlignment.start,
    children: [
      Text(
        label,
        style: const TextStyle(color: cyan, fontWeight: FontWeight.w900),
      ),
      const SizedBox(height: 8),
      Row(
        children: [
          Expanded(
            child: TextField(
              controller: minutes,
              keyboardType: TextInputType.number,
              decoration: const InputDecoration(
                labelText: 'Minutes',
                border: OutlineInputBorder(),
              ),
            ),
          ),
          const Padding(
            padding: EdgeInsets.symmetric(horizontal: 10),
            child: Text(
              ':',
              style: TextStyle(fontSize: 24, fontWeight: FontWeight.w900),
            ),
          ),
          Expanded(
            child: TextField(
              controller: seconds,
              keyboardType: const TextInputType.numberWithOptions(
                decimal: true,
              ),
              decoration: const InputDecoration(
                labelText: 'Seconds',
                border: OutlineInputBorder(),
              ),
            ),
          ),
        ],
      ),
    ],
  );

  Future<void> _collectFeedback(
    WorkoutDay workout, {
    bool partial = false,
  }) async {
    var minutes = switch (_variant) {
      WorkoutVariant.full => workout.fullMinutes.toDouble(),
      WorkoutVariant.sixty => workout.sixtyMinutes.toDouble(),
      WorkoutVariant.recovery => 28.0,
    };
    var rpe = 7.0;
    var soreness = 3.0;
    var pain = false;
    final saved = await showModalBottomSheet<bool>(
      context: context,
      isScrollControlled: true,
      backgroundColor: card,
      builder: (context) => StatefulBuilder(
        builder: (context, setModalState) => SafeArea(
          child: Padding(
            padding: const EdgeInsets.fromLTRB(24, 22, 24, 30),
            child: Column(
              mainAxisSize: MainAxisSize.min,
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text(
                  'AFTER-ACTION REPORT',
                  style: TextStyle(
                    color: ember,
                    fontWeight: FontWeight.w900,
                    fontSize: 18,
                  ),
                ),
                const SizedBox(height: 16),
                const Text(
                  'Private training note. Saving this records your session locally; it does not diagnose injury or automatically alter future workouts.',
                  style: TextStyle(color: muted, height: 1.35),
                ),
                const SizedBox(height: 16),
                Text('Actual time: ${minutes.round()} min'),
                const Text(
                  'Total elapsed time for the work you actually did, including normal rest and setup. Adjust the estimate if needed.',
                  style: TextStyle(color: muted, fontSize: 12),
                ),
                Slider(
                  value: minutes.clamp(15, 120),
                  min: 15,
                  max: 120,
                  divisions: 105,
                  onChanged: (value) => setModalState(() => minutes = value),
                ),
                Text('Session RPE: ${rpe.toStringAsFixed(1)} / 10'),
                const Text(
                  'Your overall effort: 1–3 easy, 4–6 moderate, 7–8 hard, 9–10 near-maximal.',
                  style: TextStyle(color: muted, fontSize: 12),
                ),
                Slider(
                  value: rpe,
                  min: 1,
                  max: 10,
                  divisions: 18,
                  onChanged: (value) => setModalState(() => rpe = value),
                ),
                Text('Soreness: ${soreness.round()} / 10'),
                const Text(
                  'How sore or unusually fatigued you feel after the session: 0 none, 10 severe. This is a personal note, not medical advice.',
                  style: TextStyle(color: muted, fontSize: 12),
                ),
                Slider(
                  value: soreness,
                  min: 0,
                  max: 10,
                  divisions: 10,
                  onChanged: (value) => setModalState(() => soreness = value),
                ),
                SwitchListTile(
                  contentPadding: EdgeInsets.zero,
                  title: const Text('Pain or technique breakdown?'),
                  subtitle: const Text(
                    'Use this if pain, loss of control, or technique failure made you stop. It is recorded privately and does not diagnose an injury.',
                  ),
                  value: pain,
                  onChanged: (value) => setModalState(() => pain = value),
                ),
                const SizedBox(height: 12),
                SizedBox(
                  width: double.infinity,
                  child: FilledButton(
                    onPressed: () => Navigator.pop(context, true),
                    child: const Text('SAVE PRIVATE REPORT'),
                  ),
                ),
              ],
            ),
          ),
        ),
      ),
    );
    if (saved != true) return;
    await _store?.setString(
      'session_feedback_${workout.sequence}',
      jsonEncode({
        'variant': _variant.name,
        'actual_minutes': minutes.round(),
        'rpe': rpe,
        'soreness': soreness.round(),
        'pain_or_technique_breakdown': pain,
        'completion_status': partial ? 'partial' : 'complete',
        'recorded_at': DateTime.now().toIso8601String(),
      }),
    );
  }

  Future<void> _saveProgress() async {
    await _store?.setStringList(
      'completed_sections',
      _sectionState.keys.toList(),
    );
    await _store?.setStringList(
      'completed_workouts',
      _completedWorkouts.map((e) => '$e').toList(),
    );
    await _store?.setStringList(
      'partial_workouts',
      _partialWorkouts.map((e) => '$e').toList(),
    );
    await _store?.setStringList(
      'fracture_seeds',
      _fractureSeeds.entries.map((e) => '${e.key}|${e.value}').toList(),
    );
    Map<String, Object> encodeSwap(MovementSubstitution value) => {
      'movement_id': value.movementId,
      'original': value.original,
      'replacement': value.replacement,
      'stimulus': value.stimulus,
      'disclosure': value.disclosure,
    };
    await _store?.setString(
      'movement_swaps_v2',
      jsonEncode({
        'today': {
          for (final entry in _movementSwaps.entries)
            entry.key: encodeSwap(entry.value),
        },
        'persistent': {
          for (final entry in _persistentMovementSwaps.entries)
            entry.key: encodeSwap(entry.value),
        },
      }),
    );
  }

  void _moveDate(int days) => setState(() {
    _workoutTransitionDirection = days.isNegative ? -1 : 1;
    _selected = _selected.add(Duration(days: days));
    _variant = _preferredWorkoutVariant;
  });

  void _startWorkoutSwipe() {
    _workoutDragDistance = 0;
    _workoutSwipe.value = 0;
  }

  void _updateWorkoutSwipe(DragUpdateDetails details, double width) {
    _workoutDragDistance += details.primaryDelta ?? 0;
    if (_workoutDragDistance == 0) return;
    // A leftward drag advances through the quest; a rightward drag returns.
    _workoutTransitionDirection = _workoutDragDistance.isNegative ? 1 : -1;
    _workoutSwipe.value = (_workoutDragDistance.abs() / width).clamp(0.0, 1.0);
  }

  Future<void> _endWorkoutSwipe(DragEndDetails details) async {
    final velocity = details.primaryVelocity ?? 0;
    final direction = _workoutDragDistance == 0
        ? (velocity.isNegative ? 1 : -1)
        : _workoutTransitionDirection;
    final completesTurn = _workoutSwipe.value > .22 || velocity.abs() > 450;
    if (!completesTurn) {
      await _workoutSwipe.animateBack(
        0,
        duration: const Duration(milliseconds: 180),
        curve: Curves.easeOutCubic,
      );
      return;
    }
    await _workoutSwipe.animateTo(
      1,
      duration: const Duration(milliseconds: 180),
      curve: Curves.easeOutCubic,
    );
    if (!mounted) return;
    _moveDate(direction);
    _workoutDragDistance = 0;
    _workoutSwipe.value = 0;
  }

  Future<void> _setPreferredWorkoutVariant(WorkoutVariant value) async {
    if (value == WorkoutVariant.recovery) return;
    setState(() {
      _preferredWorkoutVariant = value;
      _variant = value;
    });
    await _store?.setString('preferred_workout_variant', value.name);
  }

  @override
  Widget build(BuildContext context) {
    if (!_ready) {
      return const Scaffold(
        body: Center(child: CircularProgressIndicator(color: ember)),
      );
    }
    return PopScope(
      canPop: false,
      onPopInvokedWithResult: (didPop, _) async {
        if (didPop) return;
        if (_pageIndex != 0) {
          setState(() => _pageIndex = 0);
          return;
        }
        final exit = await showDialog<bool>(
          context: context,
          builder: (dialogContext) => AlertDialog(
            backgroundColor: card,
            title: const Text('EXIT HOOTS & REPS?'),
            content: const Text(
              'Your locally saved progress will remain available.',
            ),
            actions: [
              TextButton(
                onPressed: () => Navigator.pop(dialogContext, false),
                child: const Text('STAY'),
              ),
              FilledButton(
                onPressed: () => Navigator.pop(dialogContext, true),
                child: const Text('EXIT'),
              ),
            ],
          ),
        );
        if (exit == true) await SystemNavigator.pop();
      },
      child: Scaffold(
        body: switch (_pageIndex) {
          0 => _questPage(),
          1 => _chroniclePage(),
          _ => _profileHome(),
        },
        bottomNavigationBar: NavigationBar(
          backgroundColor: const Color(0xff100b20),
          indicatorColor: const Color(0xff3b2260),
          selectedIndex: _pageIndex,
          onDestinationSelected: (value) => setState(() => _pageIndex = value),
          destinations: const [
            NavigationDestination(
              icon: Icon(Icons.auto_awesome_outlined),
              selectedIcon: Icon(Icons.auto_awesome),
              label: 'Quest',
            ),
            NavigationDestination(
              icon: Icon(Icons.menu_book_outlined),
              selectedIcon: Icon(Icons.menu_book),
              label: 'Chronicle',
            ),
            NavigationDestination(
              icon: Icon(Icons.person_outline),
              selectedIcon: Icon(Icons.person),
              label: 'Profile',
            ),
          ],
        ),
      ),
    );
  }

  Widget _questPage() => Container(
    decoration: const BoxDecoration(
      gradient: LinearGradient(
        begin: Alignment.topCenter,
        end: Alignment.bottomCenter,
        colors: [paper, Color(0xff0f0924), paper],
      ),
    ),
    child: SafeArea(
      child: Stack(
        children: [
          Column(
            children: [
              _header(),
              _calendar(),
              if (_programPause != null) _pauseBanner(),
              Expanded(
                child: LayoutBuilder(
                  builder: (context, constraints) => GestureDetector(
                    behavior: HitTestBehavior.translucent,
                    onHorizontalDragStart: (_) => _startWorkoutSwipe(),
                    onHorizontalDragUpdate: (details) =>
                        _updateWorkoutSwipe(details, constraints.maxWidth),
                    onHorizontalDragEnd: _endWorkoutSwipe,
                    onHorizontalDragCancel: () => _workoutSwipe.animateBack(
                      0,
                      duration: const Duration(milliseconds: 180),
                      curve: Curves.easeOutCubic,
                    ),
                    child: AnimatedBuilder(
                      animation: _workoutSwipe,
                      child: _dayContent(key: ValueKey(_selected)),
                      builder: (context, child) {
                        final progress = _workoutSwipe.value;
                        final direction = _workoutTransitionDirection
                            .toDouble();
                        final transform = Matrix4.identity()
                          ..setEntry(3, 2, .0012)
                          ..translateByDouble(
                            -direction * constraints.maxWidth * progress,
                            0,
                            0,
                            1,
                          )
                          ..rotateY(direction * .16 * progress);
                        return Transform(
                          alignment: direction > 0
                              ? Alignment.centerLeft
                              : Alignment.centerRight,
                          transform: transform,
                          child: Opacity(
                            opacity: 1 - (.18 * progress),
                            child: child,
                          ),
                        );
                      },
                    ),
                  ),
                ),
              ),
            ],
          ),
          if (_showCompletionStrikeAnimation && _strikingSection != null)
            _strikeOverlay(),
        ],
      ),
    ),
  );

  Widget _pauseBanner() {
    final pause = _programPause!;
    return Container(
      margin: const EdgeInsets.fromLTRB(20, 0, 20, 6),
      padding: const EdgeInsets.fromLTRB(14, 10, 8, 10),
      decoration: BoxDecoration(
        color: const Color(0xff171d3f),
        borderRadius: BorderRadius.circular(15),
        border: Border.all(color: cyan),
      ),
      child: Row(
        children: [
          const Icon(Icons.flight, color: cyan, size: 20),
          const SizedBox(width: 10),
          Expanded(
            child: Text(
              'REALM PAUSED UNTIL ${DateFormat('MMM d').format(pause.returnOn).toUpperCase()}',
              style: const TextStyle(
                color: ink,
                fontSize: 11,
                fontWeight: FontWeight.w900,
              ),
            ),
          ),
          TextButton(
            onPressed: _resumeEarly,
            child: const Text('RESUME EARLY'),
          ),
        ],
      ),
    );
  }

  Widget _chroniclePage() => Container(
    decoration: const BoxDecoration(
      gradient: LinearGradient(
        begin: Alignment.topCenter,
        end: Alignment.bottomCenter,
        colors: [paper, Color(0xff0f0924), paper],
      ),
    ),
    child: SafeArea(
      child: ListView(
        padding: const EdgeInsets.fromLTRB(20, 22, 20, 32),
        children: [
          const Text(
            'BATTLE CHRONICLE',
            style: TextStyle(
              color: ink,
              fontSize: 28,
              fontWeight: FontWeight.w900,
            ),
          ),
          const SizedBox(height: 8),
          Text(
            '${_completedWorkouts.length} quests logged • ${_partialWorkouts.length} partial • ${_conditioningResults.length} conditioning results',
            style: const TextStyle(color: muted, fontSize: 16),
          ),
          const SizedBox(height: 20),
          if (_conditioningResults.isNotEmpty) ...[
            const Text(
              'RESULTS CHRONICLE',
              style: TextStyle(color: ember, fontWeight: FontWeight.w900),
            ),
            const SizedBox(height: 10),
            Wrap(
              spacing: 8,
              runSpacing: 8,
              children: [
                for (final filter in ChronicleFilter.values)
                  ChoiceChip(
                    label: Text(_chronicleFilterLabel(filter)),
                    selected: _chronicleFilter == filter,
                    onSelected: (_) =>
                        setState(() => _chronicleFilter = filter),
                  ),
              ],
            ),
            const SizedBox(height: 12),
            for (final result in _chronicleResults())
              _conditioningResultCard(result),
            if (_chronicleResults().isEmpty)
              _card(
                child: const Text(
                  'No results match this score type yet.',
                  style: TextStyle(color: muted),
                ),
              ),
            const SizedBox(height: 18),
          ],
          if (_completedWorkouts.isEmpty && _conditioningResults.isEmpty)
            _card(
              child: const Text(
                'Complete a quest and record its conditioning result to begin your private battle history.',
                style: TextStyle(color: muted, fontSize: 17, height: 1.4),
              ),
            )
          else
            for (final workout in _workouts.where(
              (item) => _completedWorkouts.contains(item.sequence),
            ))
              Padding(
                padding: const EdgeInsets.only(bottom: 10),
                child: _card(
                  child: Text(
                    'DAY ${workout.sequence}  •  ${_partialWorkouts.contains(workout.sequence) ? 'PARTIAL • ' : ''}${workout.title}',
                    style: TextStyle(
                      color: _partialWorkouts.contains(workout.sequence)
                          ? cyan
                          : success,
                      fontWeight: FontWeight.w900,
                    ),
                  ),
                ),
              ),
        ],
      ),
    ),
  );

  String _chronicleFilterLabel(ChronicleFilter filter) => switch (filter) {
    ChronicleFilter.all => 'All',
    ChronicleFilter.forTime => 'For time',
    ChronicleFilter.amrap => 'AMRAP',
    ChronicleFilter.intervals => 'Intervals',
    ChronicleFilter.totalWork => 'Total work',
  };

  bool _matchesChronicleFilter(ConditioningResult result) =>
      _chronicleFilter == ChronicleFilter.all ||
      switch (_chronicleFilter) {
        ChronicleFilter.forTime =>
          result.schema == ConditioningScoreSchema.forTime ||
              result.schema == ConditioningScoreSchema.cappedForTime,
        ChronicleFilter.amrap => result.schema == ConditioningScoreSchema.amrap,
        ChronicleFilter.intervals =>
          result.schema == ConditioningScoreSchema.intervals,
        ChronicleFilter.totalWork =>
          result.schema == ConditioningScoreSchema.totalWork,
        ChronicleFilter.all => true,
      };

  List<ConditioningResult> _chronicleResults() =>
      _conditioningResults.values.where(_matchesChronicleFilter).toList()
        ..sort((a, b) => b.recordedAt.compareTo(a.recordedAt));

  WorkoutDay? _workoutForResult(ConditioningResult result) {
    for (final workout in _workouts) {
      if (workout.sequence == result.workoutSequence) return workout;
    }
    return null;
  }

  bool _isComparablePersonalBest(ConditioningResult result) {
    if (result.schema == ConditioningScoreSchema.cappedForTime) return false;
    final comparable = _conditioningResults.values
        .where(
          (candidate) =>
              candidate.templateId == result.templateId &&
              candidate.variant == result.variant &&
              candidate.schema == result.schema &&
              candidate.workUnit == result.workUnit &&
              candidate.prescriptionLabel == result.prescriptionLabel &&
              candidate.prescription == result.prescription,
        )
        .toList();
    if (comparable.length < 2) return false;
    double score(ConditioningResult value) => switch (value.schema) {
      ConditioningScoreSchema.forTime =>
        -(value.values['finish_seconds'] ?? double.infinity),
      ConditioningScoreSchema.amrap =>
        (value.values['rounds'] ?? 0) * 10000 + (value.values['reps'] ?? 0),
      ConditioningScoreSchema.intervals => value.intervalSplits.fold(
        0,
        (sum, split) => sum + split,
      ),
      ConditioningScoreSchema.totalWork => value.values['work_completed'] ?? 0,
      ConditioningScoreSchema.cappedForTime => double.negativeInfinity,
    };
    final current = score(result);
    return comparable.every((candidate) => score(candidate) <= current);
  }

  Widget _conditioningResultCard(ConditioningResult result) {
    final workout = _workoutForResult(result);
    final isPersonalBest = _isComparablePersonalBest(result);
    return Padding(
      padding: const EdgeInsets.only(bottom: 10),
      child: InkWell(
        onTap: () => _showConditioningResultDetail(result),
        borderRadius: BorderRadius.circular(24),
        child: _card(
          child: Row(
            children: [
              Icon(Icons.timer_outlined, color: isPersonalBest ? ember : cyan),
              const SizedBox(width: 12),
              Expanded(
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Text(
                      workout?.title ?? 'WORKOUT ${result.workoutSequence}',
                      style: const TextStyle(
                        color: ink,
                        fontWeight: FontWeight.w900,
                      ),
                    ),
                    const SizedBox(height: 4),
                    Text(
                      '${DateFormat('MMM d, y').format(result.recordedAt)} • ${result.variant.toUpperCase()}',
                      style: const TextStyle(color: muted, fontSize: 12),
                    ),
                    const SizedBox(height: 6),
                    Text(
                      result.summary,
                      style: const TextStyle(
                        color: success,
                        fontWeight: FontWeight.w900,
                      ),
                    ),
                    if (isPersonalBest) ...[
                      const SizedBox(height: 5),
                      const Text(
                        'COMPARABLE PERSONAL BEST',
                        style: TextStyle(
                          color: ember,
                          fontSize: 10,
                          fontWeight: FontWeight.w900,
                        ),
                      ),
                    ],
                  ],
                ),
              ),
              const Icon(Icons.chevron_right, color: muted),
            ],
          ),
        ),
      ),
    );
  }

  Future<void> _showConditioningResultDetail(ConditioningResult result) async {
    final workout = _workoutForResult(result);
    await showModalBottomSheet<void>(
      context: context,
      isScrollControlled: true,
      backgroundColor: card,
      builder: (context) => SafeArea(
        child: Padding(
          padding: const EdgeInsets.fromLTRB(24, 22, 24, 30),
          child: SingleChildScrollView(
            child: Column(
              mainAxisSize: MainAxisSize.min,
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text(
                  workout?.title ?? 'CONDITIONING RESULT',
                  style: const TextStyle(
                    color: ember,
                    fontSize: 20,
                    fontWeight: FontWeight.w900,
                  ),
                ),
                const SizedBox(height: 6),
                Text(
                  '${_chronicleSchemaLabel(result.schema)} • ${result.variant.toUpperCase()} • ${DateFormat('MMM d, y • h:mm a').format(result.recordedAt)}',
                  style: const TextStyle(color: muted),
                ),
                const SizedBox(height: 18),
                Text(
                  result.summary,
                  style: const TextStyle(
                    color: success,
                    fontSize: 22,
                    fontWeight: FontWeight.w900,
                  ),
                ),
                if (result.prescriptionLabel != null) ...[
                  const SizedBox(height: 10),
                  Text(
                    result.prescriptionLabel!,
                    style: const TextStyle(
                      color: cyan,
                      fontWeight: FontWeight.w900,
                    ),
                  ),
                  if (result.prescription?.isNotEmpty ?? false) ...[
                    const SizedBox(height: 4),
                    Text(
                      result.prescription!,
                      style: const TextStyle(color: ink, height: 1.35),
                    ),
                  ],
                ],
                if (result.intervalSplits.isNotEmpty) ...[
                  const SizedBox(height: 18),
                  const Text(
                    'INTERVAL SPLITS',
                    style: TextStyle(color: cyan, fontWeight: FontWeight.w900),
                  ),
                  const SizedBox(height: 8),
                  for (
                    var index = 0;
                    index < result.intervalSplits.length;
                    index++
                  )
                    Padding(
                      padding: const EdgeInsets.only(bottom: 5),
                      child: Text(
                        'Interval ${index + 1}: ${result.intervalSplits[index].toStringAsFixed(1)} ${result.workUnit ?? 'work'}',
                        style: const TextStyle(color: ink),
                      ),
                    ),
                ],
                if (result.note?.trim().isNotEmpty ?? false) ...[
                  const SizedBox(height: 18),
                  const Text(
                    'ATHLETE NOTE',
                    style: TextStyle(color: cyan, fontWeight: FontWeight.w900),
                  ),
                  const SizedBox(height: 6),
                  Text(
                    result.note!,
                    style: const TextStyle(color: ink, height: 1.35),
                  ),
                ],
                const SizedBox(height: 20),
                SizedBox(
                  width: double.infinity,
                  child: OutlinedButton.icon(
                    onPressed: _schedule.isEmpty
                        ? null
                        : () {
                            Navigator.pop(context);
                            setState(() {
                              _pageIndex = 0;
                              _selected = _schedule
                                  .firstWhere(
                                    (item) =>
                                        item.sequence == result.workoutSequence,
                                    orElse: () => _schedule.first,
                                  )
                                  .date;
                            });
                          },
                    icon: const Icon(Icons.open_in_new),
                    label: const Text('OPEN WORKOUT'),
                  ),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }

  String _chronicleSchemaLabel(ConditioningScoreSchema schema) =>
      switch (schema) {
        ConditioningScoreSchema.forTime => 'FOR TIME',
        ConditioningScoreSchema.cappedForTime => 'CAPPED FOR TIME',
        ConditioningScoreSchema.amrap => 'AMRAP',
        ConditioningScoreSchema.intervals => 'INTERVALS',
        ConditioningScoreSchema.totalWork => 'TOTAL WORK',
      };

  Widget _profileHome() => Container(
    decoration: const BoxDecoration(
      gradient: LinearGradient(
        begin: Alignment.topCenter,
        end: Alignment.bottomCenter,
        colors: [paper, Color(0xff0f0924), paper],
      ),
    ),
    child: SafeArea(
      child: ListView(
        padding: const EdgeInsets.fromLTRB(20, 22, 20, 32),
        children: [
          const Text(
            'ATHLETE PROFILE',
            style: TextStyle(
              color: ink,
              fontSize: 28,
              fontWeight: FontWeight.w900,
            ),
          ),
          const SizedBox(height: 18),
          _card(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text(
                  'STRENGTH RECORDS',
                  style: TextStyle(color: ember, fontWeight: FontWeight.w900),
                ),
                const SizedBox(height: 10),
                Text(
                  '${_athleteSettings.personalRecordsLb.length} PRs recorded  •  '
                  '${_athleteSettings.unit == WeightUnit.pounds ? 'Pounds' : 'Kilograms'}',
                  style: const TextStyle(color: muted, fontSize: 16),
                ),
                const SizedBox(height: 18),
                SizedBox(
                  width: double.infinity,
                  child: FilledButton.icon(
                    onPressed: () => _openAthleteProfile(strengthOnly: true),
                    icon: const Icon(Icons.fitness_center),
                    label: const Text('EDIT PRs & TRAINING MAXES'),
                  ),
                ),
              ],
            ),
          ),
          const SizedBox(height: 12),
          _card(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text(
                  'EQUIPMENT ACCESS',
                  style: TextStyle(color: ember, fontWeight: FontWeight.w900),
                ),
                const SizedBox(height: 10),
                Builder(
                  builder: (context) {
                    final available =
                        _athleteSettings.availableEquipment.isEmpty
                        ? equipmentLabels.keys.toSet()
                        : _athleteSettings.availableEquipment;
                    final missing = equipmentLabels.entries
                        .where((entry) => !available.contains(entry.key))
                        .map((entry) => entry.value)
                        .toList();
                    return Text(
                      missing.isEmpty
                          ? 'All ${equipmentLabels.length} equipment options are available.'
                          : '${available.length} of ${equipmentLabels.length} available • Missing: ${missing.join(', ')}',
                      style: const TextStyle(
                        color: muted,
                        fontSize: 16,
                        height: 1.4,
                      ),
                    );
                  },
                ),
                const SizedBox(height: 14),
                SizedBox(
                  width: double.infinity,
                  child: OutlinedButton.icon(
                    onPressed: () => _openAthleteProfile(movementOnly: true),
                    icon: const Icon(Icons.inventory_2_outlined),
                    label: const Text('EDIT EQUIPMENT ACCESS'),
                  ),
                ),
              ],
            ),
          ),
          const SizedBox(height: 12),
          _card(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text(
                  'BENCHMARK CHRONICLE',
                  style: TextStyle(color: cyan, fontWeight: FontWeight.w900),
                ),
                const SizedBox(height: 10),
                Text(
                  _benchmarkHistory.isEmpty
                      ? 'No tests recorded yet. Your saved calibrations will appear here.'
                      : '${_benchmarkHistory.length} calibration or retest ${_benchmarkHistory.length == 1 ? 'entry' : 'entries'} recorded.',
                  style: const TextStyle(color: muted, fontSize: 16),
                ),
                const SizedBox(height: 16),
                SizedBox(
                  width: double.infinity,
                  child: FilledButton.icon(
                    onPressed: () => _openAthleteProfile(benchmarksOnly: true),
                    icon: const Icon(Icons.timeline_outlined),
                    label: const Text('OPEN BENCHMARK CHRONICLE'),
                  ),
                ),
              ],
            ),
          ),
          const SizedBox(height: 12),
          _card(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text(
                  'MOVEMENT SETTINGS',
                  style: TextStyle(color: cyan, fontWeight: FontWeight.w900),
                ),
                const SizedBox(height: 10),
                Text(
                  '${_athleteSettings.movementPreferences.length} movement settings saved',
                  style: const TextStyle(color: muted, fontSize: 16),
                ),
                const SizedBox(height: 8),
                const Text(
                  'Search movements and mark what you prefer, avoid, cannot do, or cannot do temporarily. Use Swap Movement inside a workout for today-only changes.',
                  style: TextStyle(color: muted, height: 1.4),
                ),
                const SizedBox(height: 16),
                SizedBox(
                  width: double.infinity,
                  child: FilledButton.icon(
                    onPressed: () => _openAthleteProfile(movementOnly: true),
                    icon: const Icon(Icons.health_and_safety_outlined),
                    label: const Text('OPEN MOVEMENT LIBRARY'),
                  ),
                ),
              ],
            ),
          ),
          const SizedBox(height: 12),
          _card(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text(
                  'SKILLS & EXPERIENCE',
                  style: TextStyle(color: ember, fontWeight: FontWeight.w900),
                ),
                const SizedBox(height: 10),
                Text(
                  '${_athleteSettings.skillQualifications.length} skills selected for programming',
                  style: const TextStyle(color: muted, fontSize: 16),
                ),
                const SizedBox(height: 8),
                const Text(
                  'Turn a skill off to receive its reviewed progression instead of the full movement.',
                  style: TextStyle(color: muted, height: 1.4),
                ),
                const SizedBox(height: 16),
                SizedBox(
                  width: double.infinity,
                  child: FilledButton.icon(
                    onPressed: () => _openAthleteProfile(skillsOnly: true),
                    icon: const Icon(Icons.workspace_premium_outlined),
                    label: const Text('EDIT SKILLS & EXPERIENCE'),
                  ),
                ),
              ],
            ),
          ),
          const SizedBox(height: 12),
          _card(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text(
                  'PROGRAM SCHEDULE',
                  style: TextStyle(color: ember, fontWeight: FontWeight.w900),
                ),
                const SizedBox(height: 10),
                Text(
                  _programPause == null
                      ? 'Pause for travel or disruption without losing your place. Schedule changes can be undone.'
                      : 'Paused until ${DateFormat('MMMM d, y').format(_programPause!.returnOn)}. Resume early or choose a different return date.',
                  style: const TextStyle(
                    color: muted,
                    fontSize: 16,
                    height: 1.4,
                  ),
                ),
                const SizedBox(height: 16),
                Row(
                  children: [
                    Expanded(
                      child: FilledButton.icon(
                        onPressed: _pauseProgram,
                        icon: Icon(
                          _programPause == null
                              ? Icons.flight_takeoff
                              : Icons.edit_calendar,
                        ),
                        label: Text(
                          _programPause == null
                              ? 'PAUSE / TRAVEL'
                              : 'CHANGE RETURN',
                        ),
                      ),
                    ),
                    if (_programPause != null) ...[
                      const SizedBox(width: 8),
                      IconButton.outlined(
                        tooltip: 'Resume early',
                        onPressed: _resumeEarly,
                        icon: const Icon(Icons.play_arrow),
                      ),
                    ],
                    const SizedBox(width: 8),
                    IconButton.outlined(
                      tooltip: 'Undo last schedule change',
                      onPressed: _undoScheduleChange,
                      icon: const Icon(Icons.undo),
                    ),
                  ],
                ),
              ],
            ),
          ),
          const SizedBox(height: 12),
          _card(
            child: const Text(
              'Equipment, skills, movement preferences, competition level, and avatar customization are coming next.',
              style: TextStyle(color: muted, fontSize: 16, height: 1.4),
            ),
          ),
        ],
      ),
    ),
  );

  Widget _header() => Padding(
    padding: const EdgeInsets.fromLTRB(20, 10, 20, 12),
    child: Row(
      children: [
        const Expanded(
          child: FittedBox(
            fit: BoxFit.scaleDown,
            alignment: Alignment.centerLeft,
            child: Text(
              '✦  HOOTS & REPS',
              style: TextStyle(
                color: ink,
                fontSize: 19,
                fontWeight: FontWeight.w900,
                letterSpacing: 1.3,
              ),
            ),
          ),
        ),
        const SizedBox(width: 8),
        _pill(
          "TODAY'S QUEST",
          ember,
          () => setState(() => _selected = DateUtils.dateOnly(DateTime.now())),
        ),
      ],
    ),
  );

  Widget _pill(String text, Color color, VoidCallback action) => InkWell(
    borderRadius: BorderRadius.circular(18),
    onTap: action,
    child: Container(
      padding: const EdgeInsets.symmetric(horizontal: 11, vertical: 8),
      decoration: BoxDecoration(
        borderRadius: BorderRadius.circular(18),
        border: Border.all(color: color),
      ),
      child: Text(
        text,
        style: TextStyle(
          color: color,
          fontSize: 10,
          fontWeight: FontWeight.w900,
        ),
      ),
    ),
  );

  Widget _calendar() {
    final weekStart = _selected.subtract(Duration(days: _selected.weekday - 1));
    final weekEnd = weekStart.add(const Duration(days: 6));
    var victories = 0;
    for (var i = 0; i < 7; i++) {
      final workout = _workoutFor(weekStart.add(Duration(days: i)));
      if (workout != null && _completedWorkouts.contains(workout.sequence)) {
        victories++;
      }
    }
    return Padding(
      padding: const EdgeInsets.symmetric(horizontal: 20),
      child: Column(
        children: [
          Row(
            children: [
              _roundArrow(Icons.chevron_left, () => _moveDate(-7)),
              Expanded(
                child: Text(
                  '${DateFormat('MMM d').format(weekStart)} – ${DateFormat('MMM d').format(weekEnd)}'
                      .toUpperCase(),
                  textAlign: TextAlign.center,
                  style: const TextStyle(
                    color: ink,
                    fontWeight: FontWeight.w900,
                    fontSize: 14,
                  ),
                ),
              ),
              _roundArrow(Icons.chevron_right, () => _moveDate(7)),
            ],
          ),
          const SizedBox(height: 5),
          Row(
            children: List.generate(
              7,
              (i) =>
                  Expanded(child: _dayCell(weekStart.add(Duration(days: i)))),
            ),
          ),
          if (_showInertiusUi) ...[
            const SizedBox(height: 6),
            Container(
              height: 49,
              padding: const EdgeInsets.symmetric(horizontal: 14),
              decoration: BoxDecoration(
                borderRadius: BorderRadius.circular(17),
                border: Border.all(color: fire),
                gradient: const LinearGradient(
                  colors: [Color(0xff311953), Color(0xff141634)],
                ),
              ),
              child: Row(
                children: [
                  Expanded(
                    child: Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        const Text(
                          '⚔  DREADLORD INERTIUS',
                          style: TextStyle(
                            color: ember,
                            fontWeight: FontWeight.w900,
                            fontSize: 11,
                          ),
                        ),
                        Text(
                          victories >= 4
                              ? 'THE REALM IS DEFENDED'
                              : victories == 3
                              ? 'ONE QUEST REMAINS'
                              : 'INERTIUS APPROACHES…',
                          style: TextStyle(
                            color: victories >= 4 ? success : muted,
                            fontWeight: FontWeight.w800,
                            fontSize: 9,
                          ),
                        ),
                      ],
                    ),
                  ),
                  Text(
                    '${math.min(victories, 4)}/4',
                    style: TextStyle(
                      color: victories >= 4 ? success : cyan,
                      fontSize: 21,
                      fontWeight: FontWeight.w900,
                    ),
                  ),
                ],
              ),
            ),
          ],
          const SizedBox(height: 8),
        ],
      ),
    );
  }

  Widget _roundArrow(IconData icon, VoidCallback tap) => InkWell(
    onTap: tap,
    borderRadius: BorderRadius.circular(20),
    child: Container(
      width: 38,
      height: 38,
      decoration: BoxDecoration(
        color: card,
        shape: BoxShape.circle,
        border: Border.all(color: border),
      ),
      child: Icon(icon, color: ink),
    ),
  );

  Widget _dayCell(DateTime date) {
    final selected = DateUtils.isSameDay(date, _selected);
    final away = _programPause?.contains(date) ?? false;
    final assignment = _assignmentFor(date);
    final workout = _workoutFor(date);
    final complete =
        workout != null && _completedWorkouts.contains(workout.sequence);
    return InkWell(
      onTap: () => setState(() => _selected = date),
      child: Column(
        children: [
          Text(
            DateFormat('EEEEE').format(date),
            style: TextStyle(
              color: selected ? ember : muted,
              fontSize: 10,
              fontWeight: FontWeight.w800,
            ),
          ),
          const SizedBox(height: 2),
          Container(
            width: 38,
            height: 38,
            alignment: Alignment.center,
            decoration: BoxDecoration(
              shape: BoxShape.circle,
              gradient: selected
                  ? const LinearGradient(colors: [fire, Color(0xff2d7eff)])
                  : null,
              color: !selected && away ? const Color(0xff19284a) : null,
              border: !selected && DateUtils.isSameDay(date, DateTime.now())
                  ? Border.all(color: fire)
                  : null,
            ),
            child: Text(
              '${date.day}',
              style: const TextStyle(
                color: ink,
                fontSize: 16,
                fontWeight: FontWeight.w900,
              ),
            ),
          ),
          SizedBox(
            height: 9,
            child: Text(
              complete
                  ? '✓'
                  : away
                  ? '✈'
                  : assignment?.status == ScheduleStatus.skipped
                  ? '–'
                  : assignment?.status == ScheduleStatus.unconfirmed
                  ? '!'
                  : workout != null
                  ? '•'
                  : '',
              style: TextStyle(
                color: complete
                    ? success
                    : away
                    ? cyan
                    : assignment?.status == ScheduleStatus.unconfirmed
                    ? ember
                    : cyan,
                fontSize: 10,
                fontWeight: FontWeight.w900,
              ),
            ),
          ),
        ],
      ),
    );
  }

  Widget _dayContent({required Key key}) {
    final assignment = _assignmentFor(_selected);
    final workout = _workoutFor(_selected);
    final away = _programPause?.contains(_selected) ?? false;
    return SingleChildScrollView(
      key: key,
      padding: const EdgeInsets.fromLTRB(20, 12, 20, 34),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Text(
            DateFormat('EEEE').format(_selected),
            style: const TextStyle(
              color: ink,
              fontSize: 35,
              fontWeight: FontWeight.w900,
            ),
          ),
          Text(
            DateFormat('MMMM d').format(_selected),
            style: const TextStyle(color: muted, fontSize: 16),
          ),
          const SizedBox(height: 22),
          away
              ? _awayCard()
              : assignment?.status == ScheduleStatus.skipped
              ? _skippedCard()
              : workout == null
              ? _restCard()
              : _workoutCard(workout),
          const Padding(
            padding: EdgeInsets.only(top: 22),
            child: Center(
              child: Text(
                'SWIPE TO TRAVERSE THE REALM',
                style: TextStyle(
                  color: muted,
                  fontSize: 11,
                  fontWeight: FontWeight.w900,
                ),
              ),
            ),
          ),
        ],
      ),
    );
  }

  Widget _restCard() => _card(
    child: Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        const Text(
          'RESTORATION QUEST',
          style: TextStyle(
            color: ember,
            fontWeight: FontWeight.w900,
            fontSize: 12,
          ),
        ),
        const SizedBox(height: 12),
        const Text(
          'Rest at the enchanted tavern.',
          style: TextStyle(
            color: ink,
            fontWeight: FontWeight.w900,
            fontSize: 28,
          ),
        ),
        const SizedBox(height: 12),
        const Text(
          '✦  THIS TERRITORY IS PROTECTED',
          style: TextStyle(
            color: success,
            fontWeight: FontWeight.w900,
            fontSize: 11,
          ),
        ),
        const SizedBox(height: 10),
        const Text(
          'Light mobility, a heroic meal, and deep slumber shall restore your might.',
          style: TextStyle(color: muted, fontSize: 17, height: 1.4),
        ),
      ],
    ),
  );

  Widget _skippedCard() => _card(
    child: const Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Text(
          'QUEST INTENTIONALLY SKIPPED',
          style: TextStyle(color: ember, fontWeight: FontWeight.w900),
        ),
        SizedBox(height: 12),
        Text(
          'This choice is recorded in your schedule history and does not count as a victory.',
          style: TextStyle(color: muted, fontSize: 17, height: 1.4),
        ),
      ],
    ),
  );

  Widget _awayCard() => _card(
    child: Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        const Text(
          'BEYOND THE REALM',
          style: TextStyle(color: cyan, fontWeight: FontWeight.w900),
        ),
        const SizedBox(height: 12),
        const Text(
          'No quest is assigned while your program is paused.',
          style: TextStyle(
            color: ink,
            fontSize: 24,
            fontWeight: FontWeight.w900,
          ),
        ),
        const SizedBox(height: 10),
        Text(
          'Your next unfinished workout is preserved for ${DateFormat('MMMM d').format(_programPause!.returnOn)}.',
          style: const TextStyle(color: muted, fontSize: 17, height: 1.4),
        ),
        const SizedBox(height: 16),
        OutlinedButton.icon(
          onPressed: _resumeEarly,
          icon: const Icon(Icons.keyboard_return),
          label: const Text('RESUME EARLY'),
        ),
      ],
    ),
  );

  Widget _workoutCard(WorkoutDay workout) {
    final assignment = _assignmentFor(_selected);
    final sections = _visibleSections(workout);
    final done = [
      for (var i = 0; i < sections.length; i++)
        if (!sections[i].optional && _sectionState[_key(workout, i)] == true) i,
    ].length;
    final required = sections.where((s) => !s.optional).length;
    final completed = _completedWorkouts.contains(workout.sequence);
    final partial = _partialWorkouts.contains(workout.sequence);
    final anySectionDone = sections.asMap().keys.any(
      (index) => _sectionState[_key(workout, index)] == true,
    );
    return _card(
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Text(
            '${workout.phase}  •  DAY ${workout.sequence}',
            style: const TextStyle(
              color: ember,
              fontWeight: FontWeight.w900,
              fontSize: 12,
            ),
          ),
          const SizedBox(height: 12),
          if (_showInertiusUi) ...[
            Container(
              width: double.infinity,
              padding: const EdgeInsets.symmetric(horizontal: 11, vertical: 8),
              decoration: BoxDecoration(
                color: const Color(0xff251443),
                borderRadius: BorderRadius.circular(14),
                border: Border.all(color: completed ? success : ember),
              ),
              child: Text(
                completed
                    ? partial
                          ? '◐  PARTIAL QUEST LOGGED'
                          : '⚔  INERTIUS VANQUISHED'
                    : '☄  INERTIUS APPROACHES…',
                style: TextStyle(
                  color: completed ? (partial ? cyan : success) : ember,
                  fontSize: 11,
                  fontWeight: FontWeight.w900,
                ),
              ),
            ),
            const SizedBox(height: 14),
          ],
          if (assignment?.status == ScheduleStatus.unconfirmed) ...[
            Container(
              width: double.infinity,
              padding: const EdgeInsets.all(12),
              decoration: BoxDecoration(
                color: const Color(0xffffc44e).withValues(alpha: .10),
                borderRadius: BorderRadius.circular(14),
                border: Border.all(color: ember),
              ),
              child: const Text(
                'DID THIS QUEST HAPPEN? Complete it, move it forward, or intentionally skip it.',
                style: TextStyle(
                  color: ember,
                  fontSize: 12,
                  fontWeight: FontWeight.w900,
                ),
              ),
            ),
            const SizedBox(height: 14),
          ],
          Text(
            workout.title,
            style: const TextStyle(
              color: ink,
              fontSize: 30,
              fontWeight: FontWeight.w900,
            ),
          ),
          const SizedBox(height: 8),
          Text(
            switch (_variant) {
              WorkoutVariant.full =>
                'ABOUT ${workout.fullMinutes} MIN   •   FULL QUEST',
              WorkoutVariant.sixty =>
                'ABOUT ${workout.sixtyMinutes} MIN   •   60-MIN CUT',
              WorkoutVariant.recovery => 'ABOUT 28 MIN   •   RECOVERY',
            },
            style: const TextStyle(
              color: muted,
              fontSize: 12,
              fontWeight: FontWeight.w800,
            ),
          ),
          const SizedBox(height: 20),
          _variantTabs(workout),
          if (!completed) ...[
            const SizedBox(height: 14),
            Container(
              padding: const EdgeInsets.symmetric(horizontal: 10, vertical: 5),
              decoration: BoxDecoration(
                color: const Color(0xff122b43),
                borderRadius: BorderRadius.circular(14),
                border: Border.all(color: border),
              ),
              child: Row(
                children: [
                  Expanded(
                    child: Text(
                      'GUIDED • $done / $required',
                      style: const TextStyle(
                        color: cyan,
                        fontSize: 12,
                        fontWeight: FontWeight.w900,
                      ),
                    ),
                  ),
                  IconButton(
                    tooltip: anySectionDone
                        ? 'Resume guided workout'
                        : 'Start guided workout',
                    onPressed: () => _startGuidedWorkout(workout),
                    icon: Icon(
                      anySectionDone
                          ? Icons.play_arrow_rounded
                          : Icons.bolt_rounded,
                    ),
                    color: ember,
                  ),
                ],
              ),
            ),
          ],
          if (assignment != null) ...[
            const SizedBox(height: 8),
            Row(
              children: [
                const Text(
                  'SCHEDULE',
                  style: TextStyle(
                    color: muted,
                    fontSize: 11,
                    fontWeight: FontWeight.w900,
                    letterSpacing: .8,
                  ),
                ),
                const Spacer(),
                if (!completed) ...[
                  IconButton(
                    tooltip: 'Move workout forward',
                    onPressed: _deferSelectedWorkout,
                    icon: const Icon(Icons.redo),
                    color: cyan,
                  ),
                  IconButton(
                    tooltip: 'Skip workout',
                    onPressed: _skipSelectedWorkout,
                    icon: const Icon(Icons.skip_next_rounded),
                    color: muted,
                  ),
                ] else
                  IconButton(
                    tooltip: 'Move next workout earlier',
                    onPressed: _moveSelectedWorkoutEarlier,
                    icon: const Icon(Icons.undo_rounded),
                    color: cyan,
                  ),
              ],
            ),
          ],
          if (!completed && _workoutChanges(workout, sections).isNotEmpty) ...[
            const SizedBox(height: 16),
            _workoutChangesCard(workout, sections),
          ],
          const SizedBox(height: 24),
          const Divider(color: border),
          const SizedBox(height: 18),
          Text(
            '$done OF $required TRIALS VANQUISHED',
            style: TextStyle(
              color: done == required ? success : cyan,
              fontWeight: FontWeight.w900,
              fontSize: 11,
            ),
          ),
          const SizedBox(height: 12),
          ...List.generate(
            sections.length,
            (i) => _sectionCard(workout, sections[i], i),
          ),
          const SizedBox(height: 18),
          if (!completed && anySectionDone && done < required) ...[
            OutlinedButton.icon(
              onPressed: () => _markWorkoutPartial(workout),
              icon: const Icon(Icons.timelapse_outlined),
              label: const Text('LOG PARTIAL QUEST & MOVE ON'),
            ),
            const SizedBox(height: 10),
          ],
          InkWell(
            onTap: completed
                ? () => _undoWorkoutCompletion(workout)
                : () => _markWorkoutComplete(workout),
            borderRadius: BorderRadius.circular(18),
            child: Container(
              width: double.infinity,
              height: 58,
              alignment: Alignment.center,
              decoration: BoxDecoration(
                borderRadius: BorderRadius.circular(18),
                gradient: completed
                    ? null
                    : const LinearGradient(colors: [fire, Color(0xff2d7eff)]),
                color: completed ? const Color(0xff1e3a35) : null,
              ),
              child: Text(
                completed
                    ? partial
                          ? '◐  PARTIAL QUEST LOGGED • UNDO'
                          : '✓  VICTORY CLAIMED • UNDO'
                    : 'MARK ENTIRE QUEST COMPLETE',
                style: const TextStyle(
                  color: Colors.white,
                  fontSize: 17,
                  fontWeight: FontWeight.w700,
                ),
              ),
            ),
          ),
        ],
      ),
    );
  }

  List<(String, String)> _workoutChanges(
    WorkoutDay workout,
    List<WorkoutSection> sections,
  ) {
    if (_completedWorkouts.contains(workout.sequence)) return const [];
    final changes = <(String, String)>[];
    for (var index = 0; index < sections.length; index++) {
      final section = sections[index];
      final automatic = _publishedResolver.resolve(
        body: section.body,
        athlete: _athleteSettings,
        completed: false,
      );
      for (final reason in automatic.reasons.toSet()) {
        changes.add((section.title, reason));
      }
      for (final substitution in _sectionSwaps(workout, section, index)) {
        final scope =
            _persistentMovementSwaps[substitution.movementId] == substitution
            ? 'Always swap'
            : 'This workout';
        changes.add((
          section.title,
          '$scope: ${substitution.original} → ${substitution.replacement}',
        ));
      }
      if (section.title.startsWith('CONDITIONING') &&
          _conditioningReference(_conditioningFor(workout)) != null) {
        changes.add((
          section.title,
          'Pacing reference uses your latest benchmark result.',
        ));
      }
    }
    return changes;
  }

  Widget _workoutChangesCard(
    WorkoutDay workout,
    List<WorkoutSection> sections,
  ) {
    final changes = _workoutChanges(workout, sections);
    return Container(
      width: double.infinity,
      padding: const EdgeInsets.all(14),
      decoration: BoxDecoration(
        color: const Color(0xff102a38),
        borderRadius: BorderRadius.circular(16),
        border: Border.all(color: cyan),
      ),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          const Text(
            'WHAT CHANGED?',
            style: TextStyle(
              color: cyan,
              fontWeight: FontWeight.w900,
              fontSize: 12,
            ),
          ),
          const SizedBox(height: 6),
          const Text(
            'Your original published quest is preserved. These are reviewed local adjustments for unfinished work.',
            style: TextStyle(color: muted, height: 1.35, fontSize: 12),
          ),
          const SizedBox(height: 10),
          for (final change in changes)
            Padding(
              padding: const EdgeInsets.only(bottom: 6),
              child: Text(
                '• ${change.$1}: ${change.$2}',
                style: const TextStyle(color: ink, height: 1.35),
              ),
            ),
        ],
      ),
    );
  }

  Widget _variantTabs(WorkoutDay workout) => Column(
    children: [
      Row(
        children: [
          _tab('Full quest', WorkoutVariant.full),
          const SizedBox(width: 6),
          _tab('60-min cut', WorkoutVariant.sixty),
          const SizedBox(width: 6),
          _tab('Recovery', WorkoutVariant.recovery),
        ],
      ),
      if (_variant != WorkoutVariant.recovery)
        Align(
          alignment: Alignment.centerRight,
          child: TextButton.icon(
            onPressed: _variant == _preferredWorkoutVariant
                ? null
                : () => _setPreferredWorkoutVariant(_variant),
            icon: const Icon(Icons.bookmark_add_outlined, size: 16),
            label: Text(
              _variant == _preferredWorkoutVariant
                  ? 'YOUR DEFAULT FORMAT'
                  : 'SET AS DEFAULT',
            ),
          ),
        ),
    ],
  );

  Widget _tab(String label, WorkoutVariant value) => Expanded(
    child: InkWell(
      onTap: () => setState(() => _variant = value),
      child: Container(
        height: 44,
        alignment: Alignment.center,
        decoration: BoxDecoration(
          borderRadius: BorderRadius.circular(14),
          gradient: _variant == value
              ? const LinearGradient(colors: [fire, Color(0xff2d7eff)])
              : null,
          color: _variant == value ? null : graphite,
          border: Border.all(color: border),
        ),
        child: Text(
          label,
          style: const TextStyle(
            color: ink,
            fontSize: 12,
            fontWeight: FontWeight.w800,
          ),
        ),
      ),
    ),
  );

  Future<void> _chooseMovementSwap(
    WorkoutDay workout,
    WorkoutSection section,
    int index,
  ) async {
    final movements = _substitutions.detectedMovements(section.body);
    if (movements.isEmpty) {
      ScaffoldMessenger.of(context).showSnackBar(
        const SnackBar(
          content: Text('No reviewed swap is available for this section yet.'),
        ),
      );
      return;
    }
    final movement = await showModalBottomSheet<String>(
      context: context,
      backgroundColor: card,
      isScrollControlled: true,
      builder: (context) => SafeArea(
        child: Padding(
          padding: const EdgeInsets.fromLTRB(20, 20, 20, 30),
          child: Column(
            mainAxisSize: MainAxisSize.min,
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              const Text(
                'CHOOSE A MOVEMENT',
                style: TextStyle(
                  color: ember,
                  fontSize: 18,
                  fontWeight: FontWeight.w900,
                ),
              ),
              const SizedBox(height: 6),
              const Text(
                'Every movement found in this section can be changed independently.',
                style: TextStyle(color: muted, height: 1.35),
              ),
              const SizedBox(height: 12),
              for (final movement in movements)
                ListTile(
                  contentPadding: EdgeInsets.zero,
                  title: Text(
                    _substitutions.label(movement),
                    style: const TextStyle(
                      color: ink,
                      fontWeight: FontWeight.w900,
                    ),
                  ),
                  subtitle: Text(
                    _activeSwap(workout, index, movement) == null
                        ? 'Use as prescribed'
                        : 'Currently: ${_activeSwap(workout, index, movement)!.replacement}',
                    style: TextStyle(
                      color: _activeSwap(workout, index, movement) == null
                          ? muted
                          : cyan,
                    ),
                  ),
                  trailing: const Icon(Icons.chevron_right, color: cyan),
                  onTap: () => Navigator.pop(context, movement),
                ),
            ],
          ),
        ),
      ),
    );
    if (movement == null || !mounted) return;
    final selected =
        await showModalBottomSheet<(MovementSubstitution?, MovementSwapScope?)>(
          context: context,
          backgroundColor: card,
          isScrollControlled: true,
          builder: (context) => SafeArea(
            child: SingleChildScrollView(
              padding: const EdgeInsets.fromLTRB(20, 20, 20, 30),
              child: Column(
                mainAxisSize: MainAxisSize.min,
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    'REPLACE ${_substitutions.label(movement).toUpperCase()}',
                    style: const TextStyle(
                      color: ember,
                      fontSize: 18,
                      fontWeight: FontWeight.w900,
                    ),
                  ),
                  const SizedBox(height: 6),
                  const Text(
                    'These are training alternatives, not medical recommendations. You choose what fits.',
                    style: TextStyle(color: muted, height: 1.35),
                  ),
                  const SizedBox(height: 14),
                  if (_activeSwap(workout, index, movement) != null)
                    ListTile(
                      contentPadding: EdgeInsets.zero,
                      leading: const Icon(Icons.undo, color: ember),
                      title: const Text(
                        'USE AS PRESCRIBED',
                        style: TextStyle(
                          color: ink,
                          fontWeight: FontWeight.w900,
                        ),
                      ),
                      onTap: () => Navigator.pop(context, (null, null)),
                    ),
                  if (_safeCandidates(movement).isEmpty)
                    const Padding(
                      padding: EdgeInsets.only(top: 8),
                      child: Text(
                        'No reviewed alternative fits your current equipment and hard movement boundaries. Keep this section unresolved or update those settings.',
                        style: TextStyle(color: ember, height: 1.35),
                      ),
                    ),
                  OutlinedButton.icon(
                    onPressed: () => Navigator.pop(context, (
                      MovementSubstitution(
                        movementId: movement,
                        original: _substitutions.label(movement),
                        replacement: _customMovementReplacementMarker,
                        stimulus: 'Athlete-selected custom replacement',
                        disclosure: 'Custom movement for this workout only.',
                      ),
                      MovementSwapScope.today,
                    )),
                    icon: const Icon(Icons.edit_outlined),
                    label: const Text('CHOOSE MY OWN MOVEMENT'),
                  ),
                  const SizedBox(height: 14),
                  for (final candidate in _safeCandidates(movement))
                    Container(
                      margin: const EdgeInsets.only(bottom: 10),
                      padding: const EdgeInsets.all(14),
                      decoration: BoxDecoration(
                        color: paper,
                        borderRadius: BorderRadius.circular(14),
                        border: Border.all(color: border),
                      ),
                      child: Column(
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: [
                          Text(
                            candidate.replacement,
                            style: const TextStyle(
                              color: ink,
                              fontWeight: FontWeight.w900,
                            ),
                          ),
                          const SizedBox(height: 4),
                          Text(
                            candidate.stimulus,
                            style: const TextStyle(color: muted),
                          ),
                          const SizedBox(height: 10),
                          Row(
                            children: [
                              Expanded(
                                child: OutlinedButton(
                                  onPressed: () => Navigator.pop(context, (
                                    candidate,
                                    MovementSwapScope.today,
                                  )),
                                  child: const Text('THIS WORKOUT'),
                                ),
                              ),
                              const SizedBox(width: 8),
                              Expanded(
                                child: FilledButton(
                                  onPressed: () => Navigator.pop(context, (
                                    candidate,
                                    MovementSwapScope.always,
                                  )),
                                  child: const Text('ALWAYS'),
                                ),
                              ),
                            ],
                          ),
                        ],
                      ),
                    ),
                ],
              ),
            ),
          ),
        );
    if (selected == null) return;
    var substitution = selected.$1;
    if (substitution?.replacement == _customMovementReplacementMarker) {
      final replacement = await _enterCustomMovementReplacement(movement);
      if (replacement == null) return;
      substitution = MovementSubstitution(
        movementId: movement,
        original: _substitutions.label(movement),
        replacement: replacement,
        stimulus: 'Athlete-selected custom replacement',
        disclosure: 'Custom movement for this workout only.',
      );
    }
    final scope = selected.$2!;
    final todayKey = _movementSwapKey(workout, index, movement);
    setState(() {
      if (substitution == null) {
        _movementSwaps.remove(todayKey);
        _persistentMovementSwaps.remove(movement);
      } else if (scope == MovementSwapScope.always) {
        _persistentMovementSwaps[movement] = substitution;
        _movementSwaps.remove(todayKey);
      } else {
        _movementSwaps[todayKey] = substitution;
      }
    });
    await _saveProgress();
    await _recordSnapshotTransformation(
      type: 'movement_swap',
      reason: scope == MovementSwapScope.always
          ? 'Athlete approved a persistent movement substitution.'
          : 'Athlete approved a workout-specific movement substitution.',
      workoutSequence: scope == MovementSwapScope.today
          ? workout.sequence
          : null,
      payload: {
        'scope': scope.name,
        'movement_id': movement,
        'replacement': substitution?.replacement,
      },
    );
  }

  Future<String?> _enterCustomMovementReplacement(String movement) async {
    final controller = TextEditingController();
    final replacement = await showModalBottomSheet<String>(
      context: context,
      isScrollControlled: true,
      backgroundColor: card,
      builder: (context) => SafeArea(
        child: Padding(
          padding: EdgeInsets.fromLTRB(
            24,
            22,
            24,
            MediaQuery.viewInsetsOf(context).bottom + 28,
          ),
          child: Column(
            mainAxisSize: MainAxisSize.min,
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Text(
                'CUSTOM REPLACEMENT FOR ${_substitutions.label(movement).toUpperCase()}',
                style: const TextStyle(
                  color: ember,
                  fontSize: 18,
                  fontWeight: FontWeight.w900,
                ),
              ),
              const SizedBox(height: 8),
              const Text(
                'Choose any movement you will actually perform. It applies to this workout only and is labeled custom.',
                style: TextStyle(color: muted, height: 1.35),
              ),
              const SizedBox(height: 14),
              TextField(
                controller: controller,
                autofocus: true,
                decoration: const InputDecoration(
                  border: OutlineInputBorder(),
                  labelText: 'MOVEMENT',
                ),
              ),
              const SizedBox(height: 16),
              SizedBox(
                width: double.infinity,
                child: FilledButton(
                  onPressed: () =>
                      Navigator.pop(context, controller.text.trim()),
                  child: const Text('USE CUSTOM MOVEMENT'),
                ),
              ),
            ],
          ),
        ),
      ),
    );
    _releaseSheetTextControllers([controller]);
    return replacement?.isEmpty ?? true ? null : replacement;
  }

  String _movementSwapKey(WorkoutDay workout, int index, String movement) =>
      '${_key(workout, index)}|$movement';

  List<MovementSubstitution> _safeCandidates(String movement) =>
      _substitutionSafety.safeCandidates(
        movement: movement,
        athlete: _athleteSettings,
        registry: _substitutions,
      );

  MovementSubstitution? _activeSwap(
    WorkoutDay workout,
    int index,
    String movement,
  ) =>
      _movementSwaps[_movementSwapKey(workout, index, movement)] ??
      _persistentMovementSwaps[movement];

  List<MovementSubstitution> _sectionSwaps(
    WorkoutDay workout,
    WorkoutSection section,
    int index,
  ) {
    return [
      for (final movement in _substitutions.detectedMovements(section.body))
        ?_activeSwap(workout, index, movement),
    ];
  }

  String _sectionBody(WorkoutDay workout, WorkoutSection section, int index) {
    final substitutions = _sectionSwaps(workout, section, index);
    var body = section.body;
    // Snapshots published before the standards block reached the visible
    // section surface still carry a stable conditioning template ID. Resolve
    // its authored RX reference here so an athlete is never asked to guess a
    // load or height while using an older cached/bundled snapshot.
    if (section.title.startsWith('CONDITIONING')) {
      final conditioning = _conditioningFor(workout);
      if (conditioning != null) {
        body = _applyConditioningLevel(body, workout, conditioning);
        if (_conditioningSelection(workout).levelId != 'custom') {
          final prescription = _conditioningStandards(workout, conditioning);
          body = _inlineConditioningPrescription(
            body,
            conditioning.templateId,
            prescription,
          );
        }
        body = _markConditioningMovements(body, conditioning);
      }
    }
    for (final substitution in substitutions) {
      body = _substitutions.apply(body, substitution);
    }
    final automatic = _publishedResolver.resolve(
      body: body,
      athlete: _athleteSettings,
      completed: _completedWorkouts.contains(workout.sequence),
    );
    body = automatic.body;
    final caution = _profileCaution(body);
    if (substitutions.isEmpty) {
      final resolved = [
        ?automatic.changed
            ? '↳ REVIEWED PROGRESSION\n${automatic.reasons.join('\n')}'
            : null,
        ?caution,
        body,
      ].join('\n\n');
      return _resolvedFutureSectionBody(workout, section, resolved);
    }
    final details = substitutions
        .map((substitution) {
          final persistent =
              _persistentMovementSwaps[substitution.movementId] == substitution;
          return '${substitution.original} → ${substitution.replacement}'
              '  •  ${persistent ? 'ALWAYS' : 'THIS WORKOUT'}';
        })
        .join('\n');
    return _resolvedFutureSectionBody(
      workout,
      section,
      '${automatic.changed ? '↳ REVIEWED PROGRESSION\n${automatic.reasons.join('\n')}\n\n' : ''}'
      '${caution == null ? '' : '$caution\n\n'}$body\n\n'
      '↔ SUBSTITUTED • CUSTOM\n$details',
    );
  }

  /// Authored reference standards for the legacy published snapshot. These
  /// values match the canonical offline publisher and use the established
  /// CrossFit/HWPO convention (female value first) rather than deriving a
  /// load from an athlete's sex or strength max.
  List<String> _publishedRxStandards(String? templateId) {
    if (templateId == null) return const [];
    final standards = <String>[];
    if (templateId.contains('box_jump')) {
      standards.add('Box: ♀ 20 in / ♂ 24 in');
    }
    if (templateId.contains('bike_step_ttb') ||
        templateId.contains('bike_swing_step')) {
      standards.add('Box step-over: ♀ 20 in / ♂ 24 in');
    }
    if (templateId.contains('wall_ball')) {
      standards.add('Wall ball: ♀ 14 lb to 9 ft / ♂ 20 lb to 10 ft');
    }
    if (templateId.contains('db_snatch')) {
      standards.add('One dumbbell: ♀ 35 lb / ♂ 50 lb');
      if (templateId.contains('step')) {
        standards.add('Box step-over: ♀ 20 in / ♂ 24 in');
      }
    }
    if (templateId.contains('hspu_db_press')) {
      standards.add('One dumbbell: ♀ 35 lb / ♂ 50 lb');
    }
    if (templateId.contains('thruster_pull')) {
      standards.add('Barbell: ♀ 65 lb / ♂ 95 lb');
    }
    if (templateId.contains('row_reverse_lunge')) {
      standards.add('Two dumbbells: ♀ 25 lb each / ♂ 35 lb each');
    }
    if (templateId.contains('ski_muscle_up_carry')) {
      standards.add('Farmer carry: ♀ 35 lb each / ♂ 50 lb each');
    }
    if (templateId.contains('row_swing') ||
        templateId.contains('bike_swing_step')) {
      standards.add('Kettlebell: ♀ 35 lb / ♂ 53 lb');
    }
    if (templateId.contains('bike_sandbag')) {
      standards.add('Sandbag: ♀ 70 lb / ♂ 100 lb');
    }
    if (templateId.contains('bike_db_clean_jerk')) {
      standards.add('One dumbbell: ♀ 35 lb / ♂ 50 lb');
    }
    if (templateId.contains('sled_push_pull')) {
      standards.add(
        'Sled: ♀ 135 lb / ♂ 180 lb total; keep each 20 m trip repeatable in 30–40 seconds',
      );
    }
    if (templateId.contains('ski_clean_pull')) {
      standards.add('Power clean: ♀ 65 lb / ♂ 95 lb');
    }
    return standards;
  }

  List<String> _publishedStandardsForLevel(String? templateId, String levelId) {
    final rx = _publishedRxStandards(templateId);
    if (levelId == 'level_3' || rx.isEmpty) return rx;
    if (levelId == 'custom') {
      return const ['Enter the actual implement, load, height, and variation.'];
    }
    final emberLevel = levelId == 'level_1';
    return [
      for (var standard in rx)
        standard
            .replaceAll(
              '♀ 35 lb / ♂ 50 lb',
              emberLevel ? '♀ 15 lb / ♂ 20 lb' : '♀ 25 lb / ♂ 35 lb',
            )
            .replaceAll(
              '♀ 65 lb / ♂ 95 lb',
              emberLevel ? '♀ 35 lb / ♂ 45 lb' : '♀ 45 lb / ♂ 65 lb',
            )
            .replaceAll(
              '♀ 70 lb / ♂ 100 lb',
              emberLevel ? '♀ 30 lb / ♂ 50 lb' : '♀ 50 lb / ♂ 70 lb',
            )
            .replaceAll(
              '♀ 35 lb / ♂ 53 lb',
              emberLevel ? '♀ 18 lb / ♂ 26 lb' : '♀ 26 lb / ♂ 35 lb',
            )
            .replaceAll(
              '♀ 25 lb each / ♂ 35 lb each',
              emberLevel
                  ? '♀ 15 lb each / ♂ 20 lb each'
                  : '♀ 20 lb each / ♂ 25 lb each',
            )
            .replaceAll(
              '♀ 35 lb each / ♂ 50 lb each',
              emberLevel
                  ? '♀ 15 lb each / ♂ 20 lb each'
                  : '♀ 25 lb each / ♂ 35 lb each',
            )
            .replaceAll(
              '♀ 14 lb to 9 ft / ♂ 20 lb to 10 ft',
              emberLevel
                  ? '♀ 8 lb to 8 ft / ♂ 10 lb to 9 ft'
                  : '♀ 10 lb to 9 ft / ♂ 14 lb to 10 ft',
            )
            .replaceAll(
              '♀ 20 in / ♂ 24 in',
              emberLevel ? '♀ 12 in / ♂ 16 in' : '♀ 16 in / ♂ 20 in',
            )
            .replaceAll(
              '♀ 135 lb / ♂ 180 lb',
              emberLevel ? '♀ 45 lb / ♂ 90 lb' : '♀ 90 lb / ♂ 135 lb',
            ),
    ];
  }

  String _inlineConditioningPrescription(
    String body,
    String? templateId,
    List<String> prescription,
  ) {
    if (templateId == null || prescription.isEmpty) return body;
    String add(String text, String movement, String standard) =>
        text.replaceFirst(movement, '$movement — $standard');
    final primary = prescription.first;
    if (templateId.contains('db_clean_jerk')) {
      return add(body, 'alternating dumbbell clean and jerks', primary);
    }
    if (templateId.contains('db_snatch')) {
      var updated = add(body, 'dumbbell snatches', primary);
      if (templateId.contains('step') && prescription.length > 1) {
        updated = add(updated, 'low-box step-overs', prescription[1]);
      }
      return updated;
    }
    if (templateId.contains('hspu_db_press')) {
      return add(body, 'alternating dumbbell push presses', primary);
    }
    if (templateId.contains('ski_clean_pull')) {
      return add(body, 'power cleans', primary);
    }
    if (templateId.contains('thruster_pull')) {
      return add(body, 'barbell thrusters', primary);
    }
    if (templateId.contains('row_reverse_lunge')) {
      return add(body, 'front-rack dumbbell reverse lunges', primary);
    }
    if (templateId.contains('row_swing') ||
        templateId.contains('bike_swing_step')) {
      return add(body, 'Russian kettlebell swings', primary);
    }
    if (templateId.contains('bike_sandbag')) {
      return add(body, 'sandbag-to-shoulder repetitions', primary);
    }
    if (templateId.contains('sled_push_pull')) {
      return add(body, 'sled push', primary);
    }
    if (templateId.contains('wall_ball')) {
      return add(body, 'wall-ball shots', primary);
    }
    if (templateId.contains('box_jump')) {
      return add(body, 'box jumps', primary);
    }
    if (templateId.contains('bike_step_ttb')) {
      return add(body, 'alternating box step-overs', primary);
    }
    if (templateId.contains('ski_muscle_up_carry')) {
      return add(body, 'farmer carry', primary);
    }
    return body;
  }

  /// Keeps the conditioning card scannable: only actual work elements receive
  /// the quest marker, while explanation, pacing, and safety cues remain plain
  /// supporting text beneath them.
  String _markConditioningMovements(
    String body,
    ConditioningWork conditioning,
  ) {
    final movements = conditioning.tasks
        .map((task) => task.movement.toLowerCase())
        .where((movement) => movement != 'interval clock')
        .toList(growable: false);
    return body
        .split('\n')
        .map((line) {
          final lower = line.toLowerCase();
          final matches = movements.where(lower.contains).length;
          if (matches == 0 || line.trimLeft().startsWith('⚔')) return line;
          final separated = matches > 1 ? line.replaceAll(' + ', '\n⚔ ') : line;
          return '⚔ $separated';
        })
        .join('\n');
  }

  /// Resolves snapshot work into the athlete-facing local view. Completion
  /// status never changes the athlete's current PR/training-max reference.
  String _resolvedFutureSectionBody(
    WorkoutDay workout,
    WorkoutSection section,
    String body,
  ) {
    if (section.title.startsWith('STRENGTH') ||
        section.title.startsWith('SKILL PRACTICE') ||
        section.title.startsWith('SUPPORT WORK')) {
      return resolvePercentageLoads(
        body,
        _athleteSettings.effectiveTrainingMaxesLb,
      );
    }
    if (section.title.startsWith('CONDITIONING')) {
      final reference = _conditioningReference(_conditioningFor(workout));
      if (reference != null) {
        return '$body\n\n$reference\n'
            'Based on your latest recorded benchmark; adjust for terrain, machine variation, and form.';
      }
    }
    return body;
  }

  String? _conditioningReference(ConditioningWork? conditioning) {
    final id = conditioning?.templateId;
    if (id == null) return null;
    String split(double seconds) {
      return _formatTime(seconds);
    }

    final row = _benchmarkValues['row_2000_split_seconds'];
    if (row != null && id.contains('row')) {
      final range = id.contains('intervals_180_60_row')
          ? (row + 2, row + 4)
          : id.contains('steady_row')
          ? (row + 12, row + 18)
          : id.contains('intervals_30_30_row')
          ? (row - 10, row - 7)
          : null;
      if (range != null) {
        return 'PERSONAL TARGET • ${split(range.$1)}–${split(range.$2)} /500 m';
      }
    }
    final ski = _benchmarkValues['ski_750_split_seconds'];
    if (ski != null && id.contains('ski')) {
      final fast = id.contains('intervals_90_30');
      return 'PERSONAL TARGET • ${split(ski + (fast ? 3 : 8))}–${split(ski + (fast ? 7 : 15))} /500 m';
    }
    final run400 = _benchmarkValues['run_400_seconds'];
    final mile = _benchmarkValues['run_mile_seconds'];
    if (id.contains('run') && (run400 != null || mile != null)) {
      final reference = switch ((run400, mile)) {
        (final value?, final longer?) => math.max(
          value * 1.12,
          longer / 4 * .92,
        ),
        (final value?, null) => value * 1.12,
        (null, final longer?) => longer / 4 * .92,
        _ => 0.0,
      };
      return 'PERSONAL REFERENCE • Repeatable 400 m near ${split(reference)}';
    }
    final bike = _benchmarkValues['bike_10min_calories'];
    if (bike != null && id.contains('bike')) {
      return 'PERSONAL REFERENCE • ${(bike / 10 * .75).toStringAsFixed(1)}–${(bike / 10 * .85).toStringAsFixed(1)} cal/min';
    }
    return null;
  }

  String? _profileCaution(String prescription) {
    final lower = prescription.toLowerCase();
    final matched = <String>[];
    for (final entry in _athleteSettings.movementPreferences.entries) {
      if (entry.value != MovementPreference.cannotPerform &&
          entry.value != MovementPreference.temporarilyUnavailable) {
        continue;
      }
      final label = preferenceMovementLabels[entry.key] ?? entry.key;
      if (_substitutions.containsMovement(prescription, entry.key) ||
          lower.contains(label.toLowerCase())) {
        matched.add(label);
      }
    }
    if (matched.isEmpty) return null;
    return '⚠ YOUR MOVEMENT SETTING: ${matched.toSet().join(', ')}\n'
        'You marked this movement as unavailable. Choose a swap for today or update your Movement Library.';
  }

  String _externalSectionBody(
    WorkoutDay workout,
    WorkoutSection section,
    int index,
  ) {
    final subsections = _trainingSubsections(section);
    if (subsections.isEmpty) return _sectionBody(workout, section, index);
    return subsections
        .map((item) => '${item.title}\n${item.body}'.trim())
        .join('\n\n');
  }

  int _sectionTimerTargetSeconds(WorkoutDay workout, WorkoutSection section) {
    final title = section.title.toLowerCase();
    if (title.contains('conditioning')) {
      return (_conditioningFor(workout)?.durationMinutes ?? 15) * 60;
    }
    if (title.contains('warm')) return 10 * 60;
    if (title.contains('strength')) return 25 * 60;
    if (title.contains('skill')) return 15 * 60;
    if (title.contains('accessory')) return 10 * 60;
    return 15 * 60;
  }

  List<String> _cooldownSteps(WorkoutSection section) => section.body
      .split('\n')
      .map((line) => line.trim())
      .where(
        (line) =>
            line.isNotEmpty &&
            !line.toLowerCase().startsWith('this recovery block'),
      )
      .toList(growable: false);

  List<String> _emomMovements(String body) {
    final movements = <String>[];
    final pattern = RegExp(
      r'^(?:odd|even|minute\s*\d+)\s*[:\-–—•]\s*(.+)$',
      caseSensitive: false,
    );
    for (final line in body.split('\n')) {
      // Conditioning work lines receive a quest marker in the athlete-facing
      // card. Remove that presentation marker before recognizing Odd/Even or
      // Minute N, otherwise every EMOM minute falls back to “Round N”.
      final visibleLine = line.replaceFirst(RegExp(r'^\s*⚔\s*'), '').trim();
      final match = pattern.firstMatch(visibleLine);
      final movement = match?.group(1)?.trim();
      if (movement != null && movement.isNotEmpty) movements.add(movement);
    }
    return movements;
  }

  ({String label, String cue}) _completionCueFor(WorkoutSection section) {
    final title = section.title.toLowerCase();
    if (title.contains('conditioning')) {
      return (label: 'CONDITIONING COMPLETE', cue: 'conditioning-complete');
    }
    if (title.contains('strength')) {
      return (label: 'STRENGTH COMPLETE', cue: 'strength-complete');
    }
    if (title.contains('skill')) {
      return (label: 'SKILL TRAINING COMPLETE', cue: 'skills-complete');
    }
    if (title.contains('accessory')) {
      return (label: 'ACCESSORY COMPLETE', cue: 'accessory-complete');
    }
    if (title.contains('warm')) {
      return (label: 'WARM-UP COMPLETE', cue: 'warmup-complete');
    }
    if (title.contains('stretch') || title.contains('cooldown')) {
      return (label: 'STRETCHING COMPLETE', cue: 'stretches-complete');
    }
    return (label: 'TIMER COMPLETE', cue: 'complete');
  }

  int _cooldownStretchSeconds() => 2 * 60;

  bool _requiresMidpointSideChange(String instruction) => RegExp(
    r'\b(?:switching\s+(?:sides\s+)?at\s+1:00|switch\s+halfway)\b',
    caseSensitive: false,
  ).hasMatch(instruction);

  void _configureCooldownStep(_CardTimer timer) {
    final step = timer.cooldownSteps[timer.cooldownStepIndex];
    timer.sideChangeRequired = _requiresMidpointSideChange(step);
    timer.sideChanged = false;
    timer.transitionIsSideChange = false;
    timer.targetSeconds = timer.sideChangeRequired
        ? 60
        : _cooldownStretchSeconds();
  }

  String _formatTimer(int seconds) {
    final minutes = seconds ~/ 60;
    final remainder = seconds % 60;
    return '$minutes:${remainder.toString().padLeft(2, '0')}';
  }

  Map<String, dynamic>? _timerPayloadForSection(String sectionKey) {
    final timer = _cardTimer;
    if (timer == null || timer.sectionKey != sectionKey || !timer.isActive) {
      return null;
    }
    _advanceCardTimerToNow(timer);
    return {
      'plan': {
        ...?timer.castPlan,
        'startOffsetSeconds': timer.elapsedPlanSeconds,
      },
      // This is sent only when a user acts. The receiver's own clock renders
      // every second, so Android/Dart suspension cannot freeze the TV.
      'command': timer.stage == _CardTimerStage.paused ? 'pause' : 'start',
    };
  }

  Map<String, dynamic> _timerPlanForSection(
    WorkoutDay workout,
    WorkoutSection section,
    int index,
    _CardTimer timer,
  ) {
    final phases = <Map<String, dynamic>>[
      {
        'id': 'ready',
        'kind': 'ready',
        'durationSeconds': 10,
        'label': 'GET READY',
      },
    ];
    final conditioning = _conditioningFor(workout);
    final isConditioning = section.title.toLowerCase().contains('conditioning');
    if (timer.isCooldown) {
      for (
        var stepIndex = 0;
        stepIndex < timer.cooldownSteps.length;
        stepIndex++
      ) {
        final step = timer.cooldownSteps[stepIndex];
        final sideChange = _requiresMidpointSideChange(step);
        phases.add({
          'id': 'stretch-${stepIndex + 1}-a',
          'kind': 'active',
          'durationSeconds': sideChange ? 60 : 120,
          'label': sideChange ? '$step — SIDE 1' : step,
        });
        if (sideChange) {
          phases.add({
            'id': 'side-change-${stepIndex + 1}',
            'kind': 'sideChange',
            'durationSeconds': 10,
            'label': 'SWITCH SIDES • $step',
          });
          phases.add({
            'id': 'stretch-${stepIndex + 1}-b',
            'kind': 'active',
            'durationSeconds': 60,
            'label': '$step — SIDE 2',
          });
        }
        if (stepIndex + 1 < timer.cooldownSteps.length) {
          phases.add({
            'id': 'transition-${stepIndex + 1}',
            'kind': 'transition',
            'durationSeconds': 15,
            'label': 'TRANSITION',
          });
        }
      }
    } else if (isConditioning && conditioning != null && timer.mode == 'emom') {
      final movements = _emomMovements(
        _externalSectionBody(workout, section, index),
      );
      for (var round = 1; round <= timer.roundCount; round++) {
        final movement = movements.isEmpty
            ? 'ROUND $round'
            : movements[(round - 1) % movements.length];
        phases.add({
          'id': 'round-$round',
          'kind': 'emom',
          'durationSeconds': 60,
          'label': movement,
          'round': round,
          'roundCount': timer.roundCount,
        });
      }
    } else if (isConditioning &&
        conditioning?.workSeconds != null &&
        conditioning?.restSeconds != null) {
      final work = conditioning!.workSeconds!;
      final rest = conditioning.restSeconds!;
      var remaining = conditioning.durationMinutes * 60;
      var interval = 1;
      while (remaining > 0) {
        final workDuration = math.min(work, remaining);
        phases.add({
          'id': 'work-$interval',
          'kind': 'work',
          'durationSeconds': workDuration,
          'label': 'WORK • INTERVAL $interval',
        });
        remaining -= workDuration;
        if (remaining <= 0) break;
        final restDuration = math.min(rest, remaining);
        phases.add({
          'id': 'rest-$interval',
          'kind': 'rest',
          'durationSeconds': restDuration,
          'label': 'REST • INTERVAL $interval',
        });
        remaining -= restDuration;
        interval++;
      }
    } else {
      final format = conditioning?.format.toLowerCase() ?? '';
      final kind = format.contains('amrap')
          ? 'amrap'
          : (format.contains('for time') || format.contains('for-time'))
          ? 'forTime'
          : 'active';
      phases.add({
        'id': kind,
        'kind': kind,
        'durationSeconds': timer.targetSeconds,
        'label': timer.label,
      });
    }
    final completion = _completionCueFor(section);
    return {
      'id': '${timer.sectionKey}-${DateTime.now().microsecondsSinceEpoch}',
      'mode': timer.mode,
      'completionLabel': completion.label,
      'completionCue': completion.cue,
      'phases': phases,
    };
  }

  void _startSectionTimer(
    WorkoutDay workout,
    WorkoutSection section,
    int index,
  ) {
    final sectionKey = _key(workout, index);
    final steps = section.title.toLowerCase().contains('stretch')
        ? _cooldownSteps(section)
        : const <String>[];
    var targetSeconds = steps.isEmpty
        ? _sectionTimerTargetSeconds(workout, section)
        : _cooldownStretchSeconds();
    if (steps.isNotEmpty && _requiresMidpointSideChange(steps.first)) {
      targetSeconds = 60;
    }
    final conditioning = _conditioningFor(workout);
    final isEmom =
        conditioning != null &&
        section.title.toLowerCase().contains('conditioning') &&
        conditioning.format.toLowerCase().contains('emom');
    _cardTimerTicker?.cancel();
    setState(() {
      _activeTimerWorkout = workout;
      _activeTimerSectionIndex = index;
      _cardTimer = _CardTimer(
        sectionKey: sectionKey,
        label: _sectionHeading(section.title),
        targetSeconds: targetSeconds,
        stage: _CardTimerStage.ready,
        remainingSeconds: 10,
        cooldownSteps: steps,
        cooldownStepIndex: 0,
        mode: isEmom ? 'emom' : 'countdown',
        roundCount: isEmom ? conditioning.durationMinutes : 0,
      );
      if (steps.isNotEmpty) _configureCooldownStep(_cardTimer!);
      _cardTimer!.castPlan = _timerPlanForSection(
        workout,
        section,
        index,
        _cardTimer!,
      );
      _cardTimer!.lastTickAt = DateTime.now();
    });
    _cardTimerTicker = Timer.periodic(
      const Duration(seconds: 1),
      (_) => _tickCardTimer(),
    );
    _sendTimerToCast(command: 'start', includePlan: true);
  }

  void _toggleCardTimer() {
    final timer = _cardTimer;
    if (timer == null) return;
    if (timer.stage == _CardTimerStage.paused) {
      setState(() {
        timer.stage = _CardTimerStage.running;
        timer.lastTickAt = DateTime.now();
      });
      _cardTimerTicker ??= Timer.periodic(
        const Duration(seconds: 1),
        (_) => _tickCardTimer(),
      );
    } else {
      _advanceCardTimerToNow(timer);
      _cardTimerTicker?.cancel();
      _cardTimerTicker = null;
      setState(() {
        timer.stage = _CardTimerStage.paused;
        timer.lastTickAt = null;
      });
    }
    _sendTimerToCast(
      command: timer.stage == _CardTimerStage.paused ? 'pause' : 'resume',
    );
  }

  void _resetCardTimer() {
    _cardTimerTicker?.cancel();
    final timer = _cardTimer;
    if (timer == null) return;
    setState(() {
      timer.stage = _CardTimerStage.ready;
      timer.remainingSeconds = 10;
      timer.cooldownStepIndex = 0;
      timer.elapsedPlanSeconds = 0;
      timer.lastTickAt = DateTime.now();
      if (timer.isCooldown) _configureCooldownStep(timer);
    });
    _cardTimerTicker = Timer.periodic(
      const Duration(seconds: 1),
      (_) => _tickCardTimer(),
    );
    _sendTimerToCast(command: 'reset', includePlan: true);
  }

  void _advanceCardTimerPhase(_CardTimer timer) {
    if (timer.stage == _CardTimerStage.ready) {
      timer.stage = _CardTimerStage.running;
      timer.remainingSeconds = timer.targetSeconds;
    } else if (timer.stage == _CardTimerStage.running &&
        timer.isCooldown &&
        timer.sideChangeRequired &&
        !timer.sideChanged) {
      timer.sideChanged = true;
      timer.transitionIsSideChange = true;
      timer.stage = _CardTimerStage.transition;
      timer.remainingSeconds = 10;
    } else if (timer.stage == _CardTimerStage.running &&
        timer.isCooldown &&
        timer.cooldownStepIndex + 1 < timer.cooldownSteps.length) {
      timer.cooldownStepIndex++;
      timer.transitionIsSideChange = false;
      timer.stage = _CardTimerStage.transition;
      timer.remainingSeconds = 15;
    } else if (timer.stage == _CardTimerStage.transition) {
      timer.stage = _CardTimerStage.running;
      if (!timer.transitionIsSideChange) _configureCooldownStep(timer);
      timer.remainingSeconds = timer.targetSeconds;
    } else {
      timer.stage = _CardTimerStage.finished;
      _cardTimerTicker?.cancel();
      _cardTimerTicker = null;
    }
  }

  void _advanceCardTimerToNow(_CardTimer timer) {
    if (timer.stage == _CardTimerStage.paused ||
        timer.stage == _CardTimerStage.finished) {
      return;
    }
    final now = DateTime.now();
    final previousTick = timer.lastTickAt ?? now;
    var elapsed = now.difference(previousTick).inSeconds;
    if (elapsed <= 0) return;
    timer.lastTickAt = previousTick.add(Duration(seconds: elapsed));
    while (elapsed > 0 && timer.isActive) {
      if (elapsed < timer.remainingSeconds) {
        timer.remainingSeconds -= elapsed;
        timer.elapsedPlanSeconds += elapsed;
        return;
      }
      timer.elapsedPlanSeconds += timer.remainingSeconds;
      elapsed -= timer.remainingSeconds;
      _advanceCardTimerPhase(timer);
    }
  }

  void _tickCardTimer() {
    final timer = _cardTimer;
    if (!mounted || timer == null) return;
    var justFinished = false;
    setState(() {
      final wasActive = timer.isActive;
      _advanceCardTimerToNow(timer);
      justFinished = wasActive && !timer.isActive;
    });
    final workout = _activeTimerWorkout;
    final index = _activeTimerSectionIndex;
    if (justFinished && workout != null && index != null) {
      unawaited(_guidedCompleteSection(workout, index));
    }
  }

  void _sendTimerToCast({String command = 'start', bool includePlan = false}) {
    final timer = _cardTimer;
    if (timer == null || _projectedSectionKey != timer.sectionKey) {
      return;
    }
    final payload = <String, dynamic>{
      'command': command,
      if (includePlan) 'plan': timer.castPlan,
    };
    // An HDMI display receives precisely the same plan and controls as Cast.
    unawaited(ExternalWorkoutDisplay.updateExternalTimer(payload));
    if (!_castConnected) return;
    unawaited(ExternalWorkoutDisplay.updateCastTimer(payload));
  }

  Future<void> _showOnExternalDisplay(
    WorkoutDay workout,
    WorkoutSection section,
    int index,
  ) async {
    if (!_externalDisplayAvailable) return;
    final shown = await ExternalWorkoutDisplay.show(
      workoutTitle: workout.title,
      sectionTitle: _sectionHeading(section.title),
      body: _externalSectionBody(workout, section, index),
      sectionNumber: index + 1,
      sectionCount: _visibleSections(workout).length,
      timer: _timerPayloadForSection(_key(workout, index)),
    );
    if (!mounted) return;
    setState(() {
      _externalDisplayAvailable = shown;
      _projectedSectionKey = shown ? _key(workout, index) : null;
    });
  }

  Future<void> _hideExternalDisplay() async {
    await ExternalWorkoutDisplay.hide();
    if (!mounted) return;
    setState(() => _projectedSectionKey = null);
  }

  Future<void> _showOnChromecast(
    WorkoutDay workout,
    WorkoutSection section,
    int index,
  ) async {
    final sectionKey = _key(workout, index);
    setState(() => _pendingCastSectionKey = sectionKey);
    final showing = await ExternalWorkoutDisplay.cast(
      workoutTitle: workout.title,
      sectionTitle: _sectionHeading(section.title),
      body: _externalSectionBody(workout, section, index),
      sectionNumber: index + 1,
      sectionCount: _visibleSections(workout).length,
      timer: _timerPayloadForSection(sectionKey),
    );
    if (!mounted || !showing) return;
    setState(() {
      _castConnected = true;
      _projectedSectionKey = sectionKey;
    });
  }

  Future<void> _stopCasting() async {
    await ExternalWorkoutDisplay.stopCasting();
    if (!mounted) return;
    setState(() {
      _castConnected = false;
      _pendingCastSectionKey = null;
      _projectedSectionKey = null;
    });
  }

  Widget _sectionTimerControls(
    WorkoutDay workout,
    WorkoutSection section,
    int index,
  ) {
    final sectionKey = _key(workout, index);
    final active = _cardTimer?.sectionKey == sectionKey ? _cardTimer : null;
    if (active == null || active.stage == _CardTimerStage.finished) {
      final target = _sectionTimerTargetSeconds(workout, section);
      final isCooldown = section.title.toLowerCase().contains('stretch');
      return FilledButton.icon(
        onPressed: () => _startSectionTimer(workout, section, index),
        icon: const Icon(Icons.play_arrow_rounded),
        label: Text(
          isCooldown
              ? 'START GUIDED COOLDOWN • 10-SECOND COUNTDOWN'
              : 'START ${_formatTimer(target)} TIMER • 10-SECOND COUNTDOWN',
        ),
      );
    }
    final step =
        active.isCooldown &&
            active.cooldownStepIndex < active.cooldownSteps.length
        ? active.cooldownSteps[active.cooldownStepIndex]
        : active.label;
    final heading = switch (active.stage) {
      _CardTimerStage.ready => 'GET READY',
      _CardTimerStage.running => active.isCooldown ? 'STRETCH' : 'ACTIVE TIMER',
      _CardTimerStage.paused => 'PAUSED',
      _CardTimerStage.transition =>
        active.transitionIsSideChange
            ? '10-SECOND SIDE CHANGE'
            : '30-SECOND TRANSITION',
      _CardTimerStage.finished => 'COMPLETE',
    };
    final transitionCountdown =
        active.stage == _CardTimerStage.transition &&
        active.remainingSeconds <= 10;
    return Container(
      width: double.infinity,
      padding: const EdgeInsets.all(12),
      decoration: BoxDecoration(
        color: const Color(0xff122b43),
        borderRadius: BorderRadius.circular(14),
        border: Border.all(color: cyan),
      ),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Text(
            '$heading • ${_formatTimer(active.remainingSeconds)}',
            style: const TextStyle(color: cyan, fontWeight: FontWeight.w900),
          ),
          const SizedBox(height: 4),
          Text(step, style: const TextStyle(color: ink, height: 1.25)),
          if (transitionCountdown) ...[
            const SizedBox(height: 6),
            Text(
              active.transitionIsSideChange
                  ? 'NEXT SIDE STARTS IN ${active.remainingSeconds}'
                  : 'NEXT STRETCH STARTS IN ${active.remainingSeconds}',
              style: const TextStyle(color: ember, fontWeight: FontWeight.w900),
            ),
          ],
          const SizedBox(height: 8),
          Row(
            children: [
              OutlinedButton.icon(
                onPressed: _toggleCardTimer,
                icon: Icon(
                  active.stage == _CardTimerStage.paused
                      ? Icons.play_arrow_rounded
                      : Icons.pause_rounded,
                ),
                label: Text(
                  active.stage == _CardTimerStage.paused ? 'RESUME' : 'PAUSE',
                ),
              ),
              const SizedBox(width: 8),
              OutlinedButton.icon(
                onPressed: _resetCardTimer,
                icon: const Icon(Icons.restart_alt_rounded),
                label: const Text('RESET'),
              ),
            ],
          ),
        ],
      ),
    );
  }

  Widget _sectionCard(WorkoutDay workout, WorkoutSection section, int index) {
    final sectionKey = _key(workout, index);
    final completed = _sectionState[sectionKey] == true;
    final projected = _projectedSectionKey == sectionKey;
    final expanded = _sectionExpanded[sectionKey] ?? (index == 0 && !completed);
    final trainingSubsections = _trainingSubsections(section);
    final completedTrainingSubsections = List.generate(
      trainingSubsections.length,
      (subsectionIndex) =>
          _sectionState[_trainingSubsectionKey(
            workout,
            index,
            subsectionIndex,
          )] ==
          true,
    ).where((done) => done).length;
    final substitutions = _sectionSwaps(workout, section, index);
    final conditioning = _conditioningFor(workout);
    final isConditioning =
        conditioning != null && section.title.startsWith('CONDITIONING');
    final result = _conditioningResults[workout.sequence];
    return Padding(
      padding: const EdgeInsets.only(bottom: 10),
      key: _sectionCardKeys.putIfAbsent(sectionKey, GlobalKey.new),
      child: Stack(
        children: [
          ExpansionTile(
            key: ValueKey('$sectionKey:${expanded ? 'open' : 'closed'}'),
            initiallyExpanded: expanded,
            onExpansionChanged: (isExpanded) =>
                setState(() => _sectionExpanded[sectionKey] = isExpanded),
            showTrailingIcon: false,
            collapsedBackgroundColor: graphite,
            backgroundColor: graphite,
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(18),
              side: BorderSide(
                color: completed
                    ? ember
                    : projected
                    ? projectedBorder
                    : border,
              ),
            ),
            collapsedShape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(18),
              side: BorderSide(
                color: completed
                    ? ember
                    : projected
                    ? projectedBorder
                    : border,
              ),
            ),
            title: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Row(
                  children: [
                    Expanded(
                      child: Row(
                        children: [
                          Flexible(
                            fit: FlexFit.loose,
                            child: Text(
                              _sectionHeading(section.title),
                              style: const TextStyle(
                                color: ink,
                                fontSize: 15,
                                fontWeight: FontWeight.w900,
                              ),
                              maxLines: 1,
                              softWrap: false,
                              overflow: TextOverflow.ellipsis,
                            ),
                          ),
                          if (trainingSubsections.isNotEmpty)
                            Container(
                              margin: const EdgeInsets.only(left: 7),
                              padding: const EdgeInsets.symmetric(
                                horizontal: 6,
                                vertical: 3,
                              ),
                              decoration: BoxDecoration(
                                borderRadius: BorderRadius.circular(9),
                                border: Border.all(
                                  color: const Color(0xff2a6f9b),
                                ),
                              ),
                              child: Text(
                                '$completedTrainingSubsections/${trainingSubsections.length}',
                                style: const TextStyle(
                                  color: cyan,
                                  fontSize: 10,
                                  fontWeight: FontWeight.w900,
                                ),
                              ),
                            ),
                        ],
                      ),
                    ),
                    const SizedBox(width: 8),
                    Container(
                      padding: const EdgeInsets.symmetric(
                        horizontal: 10,
                        vertical: 6,
                      ),
                      decoration: BoxDecoration(
                        color: const Color(0xff122b43),
                        borderRadius: BorderRadius.circular(12),
                        border: Border.all(color: const Color(0xff2a6f9b)),
                      ),
                      child: Text(
                        _duration(workout, section),
                        maxLines: 1,
                        softWrap: false,
                        style: const TextStyle(
                          color: cyan,
                          fontSize: 10,
                          fontWeight: FontWeight.w900,
                        ),
                      ),
                    ),
                    const SizedBox(width: 2),
                    Icon(
                      expanded
                          ? Icons.keyboard_arrow_up_rounded
                          : Icons.keyboard_arrow_down_rounded,
                      color: cyan,
                      size: 24,
                    ),
                  ],
                ),
                const SizedBox(height: 6),
                Row(
                  children: [
                    IconButton(
                      tooltip: 'Swap a movement',
                      onPressed: completed
                          ? null
                          : () => _chooseMovementSwap(workout, section, index),
                      icon: Icon(
                        Icons.swap_horiz,
                        color: substitutions.isEmpty ? muted : cyan,
                        size: 20,
                      ),
                    ),
                    IconButton(
                      tooltip: projected
                          ? 'Stop showing on the external display'
                          : 'Show this card on the external display',
                      onPressed: !_externalDisplayAvailable
                          ? null
                          : projected
                          ? _hideExternalDisplay
                          : () =>
                                _showOnExternalDisplay(workout, section, index),
                      icon: Icon(
                        projected ? Icons.tv_rounded : Icons.tv_outlined,
                        color: projected ? cyan : muted,
                        size: 21,
                      ),
                    ),
                    IconButton(
                      tooltip: _castConnected && projected
                          ? 'Stop casting this workout card'
                          : 'Cast this card to a Chromecast',
                      onPressed: _castConnected && projected
                          ? _stopCasting
                          : () => _showOnChromecast(workout, section, index),
                      icon: Icon(
                        _castConnected && projected
                            ? Icons.cast_connected_rounded
                            : Icons.cast_rounded,
                        color: _castConnected && projected ? cyan : muted,
                        size: 21,
                      ),
                    ),
                    InkWell(
                      onTap: trainingSubsections.isEmpty
                          ? () => _guidedCompleteSection(workout, index)
                          : null,
                      borderRadius: BorderRadius.circular(20),
                      child: Container(
                        width: 38,
                        height: 38,
                        alignment: Alignment.center,
                        decoration: BoxDecoration(
                          shape: BoxShape.circle,
                          border: Border.all(color: completed ? ember : border),
                        ),
                        child: Text(
                          completed ? '╱╱╱' : '○',
                          style: TextStyle(
                            color: completed ? ember : muted,
                            fontWeight: FontWeight.w900,
                          ),
                        ),
                      ),
                    ),
                  ],
                ),
              ],
            ),
            children: [
              Padding(
                padding: const EdgeInsets.fromLTRB(18, 6, 18, 18),
                child: Align(
                  alignment: Alignment.centerLeft,
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      if (isConditioning) ...[
                        _conditioningLevelPicker(
                          workout,
                          conditioning,
                          completed,
                        ),
                        const SizedBox(height: 14),
                      ],
                      _sectionTimerControls(workout, section, index),
                      const SizedBox(height: 14),
                      if (trainingSubsections.isEmpty)
                        Text(
                          _sectionBody(workout, section, index),
                          style: const TextStyle(
                            color: ink,
                            height: 1.45,
                            fontSize: 16,
                          ),
                        )
                      else
                        ...List.generate(
                          trainingSubsections.length,
                          (subsectionIndex) => _trainingSubsectionRow(
                            workout,
                            index,
                            section,
                            subsectionIndex,
                            trainingSubsections[subsectionIndex],
                          ),
                        ),
                      if (isConditioning) ...[
                        const SizedBox(height: 14),
                        if (result != null)
                          Text(
                            'RECORDED • ${result.summary}',
                            style: const TextStyle(
                              color: success,
                              fontWeight: FontWeight.w900,
                              fontSize: 12,
                            ),
                          ),
                        const SizedBox(height: 8),
                        OutlinedButton.icon(
                          onPressed: () => _recordConditioningResult(workout),
                          icon: Icon(
                            result == null
                                ? Icons.timer_outlined
                                : Icons.edit_outlined,
                          ),
                          label: Text(
                            result == null
                                ? 'ENTER CONDITIONING RESULT'
                                : 'EDIT CONDITIONING RESULT',
                          ),
                        ),
                      ],
                      if (workout.benchmark != null &&
                          section.title.startsWith('BENCHMARK')) ...[
                        const SizedBox(height: 14),
                        FilledButton.icon(
                          onPressed: () => _recordBenchmark(workout),
                          icon: Icon(
                            workout.benchmark!.isRetest
                                ? Icons.restart_alt
                                : _hasBenchmarkResult(workout.benchmark!)
                                ? Icons.edit
                                : Icons.timer_outlined,
                          ),
                          label: Text(
                            workout.benchmark!.isRetest
                                ? 'RECORD RETEST'
                                : _hasBenchmarkResult(workout.benchmark!)
                                ? 'EDIT RESULT'
                                : 'ENTER TEST RESULTS',
                          ),
                        ),
                      ],
                    ],
                  ),
                ),
              ),
            ],
          ),
        ],
      ),
    );
  }

  String _sectionHeading(String title) => title.split(' • ').first;

  Widget _conditioningLevelPicker(
    WorkoutDay workout,
    ConditioningWork conditioning,
    bool completed,
  ) {
    final selection = _conditioningSelection(workout);
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        const Text(
          'PRESCRIPTION LEVEL',
          style: TextStyle(
            color: cyan,
            fontSize: 11,
            fontWeight: FontWeight.w900,
          ),
        ),
        const SizedBox(height: 8),
        Wrap(
          spacing: 6,
          runSpacing: 6,
          children: [
            for (final option in const [
              ('level_1', 'EMBER'),
              ('level_2', 'FORGE'),
              ('level_3', 'RX'),
              ('custom', 'EDIT'),
            ])
              ChoiceChip(
                label: Text(option.$2),
                selected: selection.levelId == option.$1,
                onSelected: completed
                    ? null
                    : (_) async {
                        if (option.$1 == 'custom') {
                          await _editCustomConditioningPrescription(
                            workout,
                            conditioning,
                          );
                        } else {
                          await _saveConditioningSelection(
                            workout,
                            _ConditioningSelection(levelId: option.$1),
                          );
                        }
                      },
              ),
          ],
        ),
        if (selection.levelId == 'custom' && !completed)
          TextButton.icon(
            onPressed: () =>
                _editCustomConditioningPrescription(workout, conditioning),
            icon: const Icon(Icons.edit_outlined, size: 16),
            label: const Text('EDIT THIS WORKOUT'),
          ),
      ],
    );
  }

  Widget _trainingSubsectionRow(
    WorkoutDay workout,
    int sectionIndex,
    WorkoutSection section,
    int subsectionIndex,
    _TrainingSubsection subsection,
  ) {
    final key = _trainingSubsectionKey(workout, sectionIndex, subsectionIndex);
    final completed = _sectionState[key] == true;
    return Container(
      margin: const EdgeInsets.only(bottom: 10),
      padding: const EdgeInsets.all(12),
      decoration: BoxDecoration(
        color: completed ? const Color(0xff1e3a35) : const Color(0xff19142e),
        borderRadius: BorderRadius.circular(14),
        border: Border.all(color: completed ? success : border),
      ),
      child: Row(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Expanded(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text(
                  subsection.title,
                  style: const TextStyle(
                    color: ink,
                    fontWeight: FontWeight.w900,
                    fontSize: 15,
                  ),
                ),
                if (subsection.body.isNotEmpty) ...[
                  const SizedBox(height: 6),
                  Text(
                    subsection.body,
                    style: const TextStyle(color: ink, height: 1.4),
                  ),
                ],
              ],
            ),
          ),
          const SizedBox(width: 10),
          InkWell(
            onTap: () => _completeTrainingSubsection(
              workout,
              sectionIndex,
              section,
              subsectionIndex,
            ),
            borderRadius: BorderRadius.circular(20),
            child: Container(
              width: 36,
              height: 36,
              alignment: Alignment.center,
              decoration: BoxDecoration(
                shape: BoxShape.circle,
                border: Border.all(color: completed ? success : border),
              ),
              child: Text(
                completed ? '✓' : '○',
                style: TextStyle(
                  color: completed ? success : muted,
                  fontSize: 18,
                  fontWeight: FontWeight.w900,
                ),
              ),
            ),
          ),
        ],
      ),
    );
  }

  String _duration(WorkoutDay workout, WorkoutSection section) {
    final title = section.title.toLowerCase();
    if (section.optional) return 'OPTIONAL';
    if (title.contains('conditioning')) {
      final minutes = _conditioningFor(workout)?.durationMinutes;
      return minutes == null ? 'CONDITIONING' : '$minutes MIN';
    }
    if (title.contains('warm')) return '8–10 MIN';
    if (title.contains('strength')) return '20–25 MIN';
    if (title.contains('metcon') || title.contains('cardio')) {
      return '12–20 MIN';
    }
    return '8–15 MIN';
  }

  Widget _card({required Widget child}) => Container(
    width: double.infinity,
    padding: const EdgeInsets.all(24),
    decoration: BoxDecoration(
      color: card,
      borderRadius: BorderRadius.circular(24),
      border: Border.all(color: border),
      boxShadow: const [
        BoxShadow(color: Colors.black45, blurRadius: 16, offset: Offset(0, 8)),
      ],
    ),
    child: child,
  );

  Widget _strikeOverlay() => AnimatedBuilder(
    animation: _strike,
    builder: (context, _) {
      final t = _strike.value;
      final approach = Curves.easeInCubic.transform(math.min(1, t / .43));
      final impact = ((t - .43) / .57).clamp(0.0, 1.0);
      return IgnorePointer(
        child: Container(
          color: Colors.black.withValues(
            alpha: .72 * (1 - math.max(0, (t - .78) / .22)),
          ),
          child: Stack(
            children: [
              _animatedHoots(t, approach, impact),
              if (impact > 0)
                Center(
                  child: Opacity(
                    opacity: 1 - impact,
                    child: Transform.scale(
                      scale: .5 + impact * 1.4,
                      child: CustomPaint(
                        size: const Size(330, 190),
                        painter: ShatterPainter(
                          progress: impact,
                          seed: _activeFractureSeed,
                        ),
                      ),
                    ),
                  ),
                ),
              if (t > .67)
                Align(
                  alignment: const Alignment(0, .48),
                  child: Opacity(
                    opacity: ((t - .67) / .2).clamp(0, 1),
                    child: const Text(
                      'HOOTS DELIVERS\nTHE FINAL VERDICT',
                      textAlign: TextAlign.center,
                      style: TextStyle(
                        color: success,
                        fontSize: 25,
                        fontWeight: FontWeight.w900,
                        letterSpacing: 1.3,
                      ),
                    ),
                  ),
                ),
            ],
          ),
        ),
      );
    },
  );

  Widget _animatedHoots(double t, double approach, double impact) {
    final beat = math.sin(t * math.pi * 15);
    final bank = math.sin(t * math.pi * 5) * .08;
    final visible = math.min(1.0, approach * 2) * (1 - impact);
    return Align(
      alignment: Alignment(bank * 2, -1.5 + 1.6 * approach + beat.abs() * .025),
      child: Opacity(
        opacity: visible,
        child: Stack(
          alignment: Alignment.center,
          children: [
            CustomPaint(
              size: const Size(330, 290),
              painter: HootsTrailPainter(
                progress: approach,
                beat: beat,
                seed: _activeFractureSeed,
              ),
            ),
            Transform.rotate(
              angle: bank,
              child: Transform.scale(
                scaleX: (.45 + approach * .85) * (1 + beat * .055),
                scaleY: (.45 + approach * .85) * (1 - beat * .035),
                child: DecoratedBox(
                  decoration: BoxDecoration(
                    shape: BoxShape.circle,
                    boxShadow: [
                      BoxShadow(
                        color: cyan.withValues(alpha: .25 + approach * .35),
                        blurRadius: 28 + beat.abs() * 18,
                        spreadRadius: 2,
                      ),
                    ],
                  ),
                  child: Image.asset(
                    'assets/images/hoots_battle_owl.png',
                    width: 280,
                  ),
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}

/// Focused, one-card-at-a-time route for the guided workout flow. The normal
/// day view remains available underneath for athletes who prefer manual cards.
class GuidedWorkoutPage extends StatefulWidget {
  const GuidedWorkoutPage({
    super.key,
    required this.workout,
    required this.sections,
    required this.initialIndex,
    required this.headingFor,
    required this.bodyFor,
    required this.isComplete,
    required this.canSwap,
    required this.externalDisplayAvailable,
    required this.castConnected,
    required this.onShowExternal,
    required this.onShowCast,
    required this.onSwap,
    required this.onSelect,
    required this.onComplete,
  });

  final WorkoutDay workout;
  final List<WorkoutSection> sections;
  final int initialIndex;
  final String Function(String title) headingFor;
  final String Function(int index) bodyFor;
  final bool Function(int index) isComplete;
  final bool Function(int index) canSwap;
  final bool externalDisplayAvailable;
  final bool castConnected;
  final Future<void> Function(int index) onShowExternal;
  final Future<void> Function(int index) onShowCast;
  final Future<void> Function(int index) onSwap;
  final Future<void> Function(int index) onSelect;
  final Future<({bool proceeded, int? nextIndex})> Function(int index)
  onComplete;

  @override
  State<GuidedWorkoutPage> createState() => _GuidedWorkoutPageState();
}

class _GuidedWorkoutPageState extends State<GuidedWorkoutPage> {
  late int _index = widget.initialIndex;

  List<int> get _required => [
    for (var index = 0; index < widget.sections.length; index++)
      if (!widget.sections[index].optional) index,
  ];

  int? get _nextIndex {
    for (final index in _required) {
      if (index > _index && !widget.isComplete(index)) return index;
    }
    return null;
  }

  Future<void> _show(int index) async {
    await widget.onSelect(index);
    if (mounted) setState(() => _index = index);
  }

  Future<void> _complete() async {
    final outcome = await widget.onComplete(_index);
    if (!mounted) return;
    if (outcome.proceeded && outcome.nextIndex != null) {
      await _show(outcome.nextIndex!);
    } else {
      setState(() {});
    }
  }

  @override
  Widget build(BuildContext context) {
    final section = widget.sections[_index];
    final completed = widget.isComplete(_index);
    final progress = _required.indexOf(_index) + 1;
    final next = _nextIndex;
    return Scaffold(
      backgroundColor: paper,
      appBar: AppBar(
        backgroundColor: paper,
        foregroundColor: ink,
        elevation: 0,
        title: const Text(
          'GUIDED WORKOUT',
          style: TextStyle(fontWeight: FontWeight.w900, fontSize: 15),
        ),
        actions: [
          TextButton.icon(
            onPressed: () => Navigator.of(context).pop(),
            icon: const Icon(Icons.close, size: 18),
            label: const Text('EXIT'),
          ),
        ],
      ),
      body: SafeArea(
        top: false,
        child: Padding(
          padding: const EdgeInsets.fromLTRB(20, 8, 20, 28),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.stretch,
            children: [
              Text(
                widget.workout.title,
                style: const TextStyle(
                  color: muted,
                  fontWeight: FontWeight.w700,
                ),
              ),
              const SizedBox(height: 8),
              Text(
                '$progress / ${_required.length} REQUIRED SECTIONS',
                style: const TextStyle(
                  color: cyan,
                  fontSize: 12,
                  fontWeight: FontWeight.w900,
                  letterSpacing: .8,
                ),
              ),
              const SizedBox(height: 14),
              Expanded(
                child: Container(
                  padding: const EdgeInsets.all(24),
                  decoration: BoxDecoration(
                    color: graphite,
                    borderRadius: BorderRadius.circular(24),
                    border: Border.all(
                      color: completed ? success : border,
                      width: 1.5,
                    ),
                  ),
                  child: SingleChildScrollView(
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Text(
                          completed ? 'COMPLETE' : 'CURRENT SECTION',
                          style: TextStyle(
                            color: completed ? success : ember,
                            fontSize: 12,
                            fontWeight: FontWeight.w900,
                            letterSpacing: 1,
                          ),
                        ),
                        const SizedBox(height: 12),
                        Text(
                          widget.headingFor(section.title),
                          style: const TextStyle(
                            color: ink,
                            fontSize: 29,
                            fontWeight: FontWeight.w900,
                            height: 1.05,
                          ),
                        ),
                        const Divider(color: border, height: 32),
                        Text(
                          widget.bodyFor(_index),
                          style: const TextStyle(
                            color: ink,
                            fontSize: 18,
                            height: 1.5,
                          ),
                        ),
                      ],
                    ),
                  ),
                ),
              ),
              const SizedBox(height: 16),
              Row(
                mainAxisAlignment: MainAxisAlignment.end,
                children: [
                  if (widget.externalDisplayAvailable)
                    IconButton(
                      tooltip: 'Show this card on the external display',
                      onPressed: () => widget.onShowExternal(_index),
                      icon: const Icon(Icons.tv_outlined),
                      color: cyan,
                    ),
                  IconButton(
                    tooltip: widget.castConnected
                        ? 'Update Chromecast with this card'
                        : 'Cast this card to a Chromecast',
                    onPressed: () => widget.onShowCast(_index),
                    icon: Icon(
                      widget.castConnected
                          ? Icons.cast_connected_rounded
                          : Icons.cast_rounded,
                    ),
                    color: cyan,
                  ),
                  if (!completed && widget.canSwap(_index))
                    IconButton(
                      tooltip: 'Swap a movement',
                      onPressed: () => widget.onSwap(_index),
                      icon: const Icon(Icons.swap_horiz),
                      color: cyan,
                    ),
                ],
              ),
              const SizedBox(height: 10),
              if (!completed)
                FilledButton.icon(
                  onPressed: _complete,
                  icon: const Icon(Icons.check_circle_outline),
                  label: const Text('COMPLETE SECTION'),
                )
              else if (next != null)
                FilledButton.icon(
                  onPressed: () => _show(next),
                  icon: const Icon(Icons.arrow_forward_rounded),
                  label: const Text('SHOW NEXT SECTION'),
                )
              else
                FilledButton.icon(
                  onPressed: () => Navigator.of(context).pop(),
                  icon: const Icon(Icons.celebration_outlined),
                  label: const Text('FINISH WORKOUT'),
                ),
            ],
          ),
        ),
      ),
    );
  }
}

class FracturedCardPainter extends CustomPainter {
  const FracturedCardPainter({required this.seed});
  final int seed;

  @override
  void paint(Canvas canvas, Size size) {
    final random = math.Random(seed);
    final impact = Offset(
      size.width * (.42 + random.nextDouble() * .3),
      size.height * (.25 + random.nextDouble() * .35),
    );
    const count = 13;
    final rim = <Offset>[];
    for (var i = 0; i < count; i++) {
      final angle = i * math.pi * 2 / count + (random.nextDouble() - .5) * .18;
      final dx = math.cos(angle);
      final dy = math.sin(angle);
      final tx = dx > 0 ? (size.width - impact.dx) / dx : -impact.dx / dx;
      final ty = dy > 0 ? (size.height - impact.dy) / dy : -impact.dy / dy;
      final distance = math.min(tx.abs(), ty.abs());
      rim.add(impact + Offset(dx, dy) * distance);
    }
    final fills = [
      const Color(0x182e2350),
      const Color(0x24211739),
      const Color(0x183a2859),
      const Color(0x24201535),
    ];
    for (var i = 0; i < count; i++) {
      final path = Path()
        ..moveTo(impact.dx, impact.dy)
        ..lineTo(rim[i].dx, rim[i].dy)
        ..lineTo(rim[(i + 1) % count].dx, rim[(i + 1) % count].dy)
        ..close();
      canvas.drawPath(path, Paint()..color = fills[i % fills.length]);
      canvas.drawPath(
        path,
        Paint()
          ..color = const Color(0xb8070615)
          ..style = PaintingStyle.stroke
          ..strokeWidth = 4.5,
      );
      canvas.drawPath(
        path,
        Paint()
          ..color = const Color(0x90c5b7ee)
          ..style = PaintingStyle.stroke
          ..strokeWidth = .8,
      );
    }
    final missing = Paint()..color = paper.withValues(alpha: .94);
    for (var i = 0; i < 3; i++) {
      final p = rim[random.nextInt(rim.length)];
      final inward = Offset.lerp(p, impact, .12 + random.nextDouble() * .08)!;
      canvas.drawPath(
        Path()
          ..moveTo(p.dx - 10, p.dy - 8)
          ..lineTo(p.dx + 12, p.dy + 7)
          ..lineTo(inward.dx, inward.dy)
          ..close(),
        missing,
      );
    }
    canvas.drawCircle(impact, 5 + random.nextDouble() * 5, missing);
  }

  @override
  bool shouldRepaint(covariant FracturedCardPainter oldDelegate) =>
      oldDelegate.seed != seed;
}

class ShatterPainter extends CustomPainter {
  const ShatterPainter({required this.progress, required this.seed});
  final double progress;
  final int seed;

  @override
  void paint(Canvas canvas, Size size) {
    final random = math.Random(seed);
    final center = Offset(size.width / 2, size.height / 2);
    for (var i = 0; i < 14; i++) {
      final angle = i * math.pi * 2 / 14 + (random.nextDouble() - .5) * .25;
      final innerRadius = 8.0 + random.nextDouble() * 14;
      final outerRadius = 58.0 + random.nextDouble() * 58;
      final travel = progress * (42 + random.nextDouble() * 72);
      final shift = Offset(math.cos(angle) * travel, math.sin(angle) * travel);
      final a =
          center +
          Offset(
            math.cos(angle - .2) * innerRadius,
            math.sin(angle - .2) * innerRadius,
          ) +
          shift;
      final b =
          center +
          Offset(
            math.cos(angle) * outerRadius,
            math.sin(angle) * outerRadius * .62,
          ) +
          shift;
      final c =
          center +
          Offset(
            math.cos(angle + .22) * (outerRadius * .72),
            math.sin(angle + .22) * outerRadius * .62,
          ) +
          shift;
      final shard = Path()
        ..moveTo(a.dx, a.dy)
        ..lineTo(b.dx, b.dy)
        ..lineTo(c.dx, c.dy)
        ..close();
      canvas.drawShadow(shard, Colors.black, 10, true);
      canvas.drawPath(
        shard,
        Paint()
          ..shader = LinearGradient(
            begin: Alignment.topLeft,
            end: Alignment.bottomRight,
            colors: i.isEven
                ? const [Color(0xff493569), Color(0xff171126)]
                : const [Color(0xff263653), Color(0xff100c20)],
          ).createShader(Rect.fromPoints(a, b)),
      );
      canvas.drawPath(
        shard,
        Paint()
          ..color = i.isEven ? ember : cyan
          ..style = PaintingStyle.stroke
          ..strokeWidth = 1.4,
      );
    }
    canvas.drawCircle(center, 8 + progress * 15, Paint()..color = paper);
  }

  @override
  bool shouldRepaint(covariant ShatterPainter oldDelegate) =>
      oldDelegate.progress != progress || oldDelegate.seed != seed;
}

class HootsTrailPainter extends CustomPainter {
  const HootsTrailPainter({
    required this.progress,
    required this.beat,
    required this.seed,
  });
  final double progress;
  final double beat;
  final int seed;

  @override
  void paint(Canvas canvas, Size size) {
    final random = math.Random(seed);
    for (var i = 0; i < 18; i++) {
      final x = random.nextDouble() * size.width;
      final baseY = size.height * (.5 + random.nextDouble() * .45);
      final drift = (progress * (35 + random.nextDouble() * 75)) % size.height;
      final point = Offset(x, baseY + drift - size.height * .3);
      final radius = 1.5 + random.nextDouble() * 3 + beat.abs();
      final glow = Paint()
        ..color = (i.isEven ? cyan : ember).withValues(
          alpha: .2 + progress * .65,
        );
      canvas.drawCircle(point, radius, glow);
      canvas.drawLine(point, point + Offset(beat * 8, 10 + radius * 2), glow);
    }
  }

  @override
  bool shouldRepaint(covariant HootsTrailPainter oldDelegate) =>
      oldDelegate.progress != progress || oldDelegate.beat != beat;
}
