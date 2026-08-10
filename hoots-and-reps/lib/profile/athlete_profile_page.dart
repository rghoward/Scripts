import 'dart:convert';

import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:shared_preferences/shared_preferences.dart';

import '../data/benchmark_results_repository.dart';

const _ink = Color(0xfff7f5ef);
const _muted = Color(0xffada6c1);
const _paper = Color(0xff070615);
const _card = Color(0xff151127);
const _border = Color(0xff4b3a78);
const _fire = Color(0xffa855f7);
const _ember = Color(0xffffc44e);
const _cyan = Color(0xff56d7ff);

enum WeightUnit { pounds, kilograms }

enum MovementPreference {
  okay,
  prefer,
  dislike,
  temporarilyUnavailable,
  cannotPerform,
}

const movementPatternLabels = <String, String>{
  'squat': 'Deep knee bend / squat',
  'hinge': 'Loaded hinge',
  'overhead': 'Overhead position',
  'impact': 'Running and jumping',
  'hanging': 'Hanging from a bar',
  'inversion': 'Inverted positions',
  'front_rack': 'Front-rack position',
};

const preferenceMovementLabels = <String, String>{
  'back_squat': 'Back Squat',
  'front_squat': 'Front Squat',
  'overhead_squat': 'Overhead Squat',
  'deadlift': 'Deadlift',
  'romanian_deadlift': 'Romanian Deadlift',
  'bench_press': 'Bench Press',
  'strict_press': 'Strict Press',
  'push_press': 'Push Press',
  'thruster': 'Thruster',
  'barbell_row': 'Barbell Row',
  'pull_up': 'Pull-Up',
  'ring_row': 'Ring Row',
  'ring_dip': 'Ring Dip',
  'push_up': 'Push-Up',
  'power_clean': 'Power Clean',
  'squat_clean': 'Squat Clean',
  'clean_and_jerk': 'Clean & Jerk',
  'power_snatch': 'Power Snatch',
  'squat_snatch': 'Squat Snatch',
  'split_jerk': 'Split Jerk',
  'walking_lunge': 'Walking Lunge',
  'reverse_lunge': 'Reverse Lunge',
  'split_squat': 'Split Squat',
  'step_up': 'Step-Up',
  'box_jump': 'Box Jump',
  'box_step_over': 'Box Step-Over',
  'running': 'Running',
  'rowing': 'Rowing',
  'ski_erg': 'SkiErg',
  'fan_bike': 'Fan bike',
  'burpee': 'Burpees',
  'wall_ball': 'Wall Ball',
  'dumbbell_snatch': 'Dumbbell Snatch',
  'kettlebell_swing': 'Kettlebell Swing',
  'farmer_carry': 'Farmer Carry',
  'suitcase_carry': 'Suitcase Carry',
  'sandbag_carry': 'Sandbag Carry',
  'double_under': 'Double-Under',
  'rope_climb': 'Rope Climb',
  'toes_to_bar': 'Toes-to-Bar',
  'hanging_knee_raise': 'Hanging Knee Raise',
  'handstand_hold': 'Handstand Hold',
  'handstand_walk': 'Handstand Walk',
  'wall_walk': 'Wall Walk',
  'muscle_up': 'Muscle-Up',
  'sit_up': 'Sit-Up',
  'v_up': 'V-Up',
  'plank': 'Plank',
  'dead_bug': 'Dead Bug',
};

const equipmentLabels = <String, String>{
  'rower': 'Rower',
  'ski_erg': 'SkiErg',
  'fan_bike': 'Fan bike',
  'barbell': 'Barbell',
  'dumbbells': 'Dumbbells',
  'kettlebell': 'Kettlebell',
  'box': 'Box',
  'jump_rope': 'Jump rope',
  'rings': 'Rings',
  'pull_up_rig': 'Pull-up rig',
};

class LiftDefinition {
  const LiftDefinition(this.key, this.label);

  final String key;
  final String label;
}

class SkillQualificationDefinition {
  const SkillQualificationDefinition(this.key, this.label, this.description);

  final String key;
  final String label;
  final String description;
}

const skillQualificationDefinitions = [
  SkillQualificationDefinition(
    'olympicLifting',
    'Olympic lifting',
    'Cleans, snatches, and their progressions',
  ),
  SkillQualificationDefinition(
    'overheadSquat',
    'Overhead squat',
    'Comfortable receiving and squatting a load overhead',
  ),
  SkillQualificationDefinition(
    'hangingCore',
    'Hanging core',
    'Hanging knee raises and toes-to-bar progressions',
  ),
  SkillQualificationDefinition(
    'inversion',
    'Inversions',
    'Handstand holds, walks, and push-up progressions',
  ),
  SkillQualificationDefinition(
    'ropeClimb',
    'Rope climb',
    'Rope-climb technique and descent',
  ),
  SkillQualificationDefinition(
    'muscleUpTransition',
    'Muscle-up transition',
    'The pulling and transition skills for muscle-up work',
  ),
  SkillQualificationDefinition(
    'doubleUnder',
    'Double-under',
    'Consistent double-under jumping-rope work',
  ),
  SkillQualificationDefinition(
    'boxJump',
    'Box jump',
    'Comfortable jumping and landing on a box',
  ),
  SkillQualificationDefinition(
    'ringDip',
    'Ring dip',
    'Controlled ring-dip strength and stability',
  ),
];

final allSkillQualificationKeys = {
  for (final definition in skillQualificationDefinitions) definition.key,
};

const liftDefinitions = [
  LiftDefinition('back_squat', 'Back Squat'),
  LiftDefinition('front_squat', 'Front Squat'),
  LiftDefinition('overhead_squat', 'Overhead Squat'),
  LiftDefinition('deadlift', 'Deadlift'),
  LiftDefinition('bench_press', 'Bench Press'),
  LiftDefinition('strict_press', 'Strict Press'),
  LiftDefinition('barbell_row', 'Barbell Row'),
  LiftDefinition('clean', 'Clean'),
  LiftDefinition('clean_and_jerk', 'Clean & Jerk'),
  LiftDefinition('snatch', 'Snatch'),
  LiftDefinition('split_squat', 'Split Squat'),
];

class AthleteSettings {
  const AthleteSettings({
    required this.unit,
    required this.personalRecordsLb,
    required this.trainingMaxesLb,
    this.movementPreferences = const {},
    this.restrictedPatterns = const {},
    this.reportedInjuries = const [],
    this.availableEquipment = const {},
    this.trainingDays = const {1, 2, 3, 4},
    this.preferredSessionMinutes = 90,
    this.skillQualifications = const {
      'olympicLifting',
      'overheadSquat',
      'hangingCore',
      'inversion',
      'ropeClimb',
      'muscleUpTransition',
      'doubleUnder',
      'boxJump',
      'ringDip',
    },
  });

  static const storageKey = 'athlete_profile_v1';

  static const defaults = AthleteSettings(
    unit: WeightUnit.pounds,
    personalRecordsLb: {
      'back_squat': 275,
      'front_squat': 215,
      'overhead_squat': 160,
      'bench_press': 150,
      'strict_press': 125,
      'clean': 175,
      'clean_and_jerk': 150,
      'snatch': 125,
      'deadlift': 275,
      'barbell_row': 165,
      'split_squat': 120,
    },
    trainingMaxesLb: {},
    movementPreferences: {},
    restrictedPatterns: {},
    reportedInjuries: [],
    skillQualifications: {
      'olympicLifting',
      'overheadSquat',
      'hangingCore',
      'inversion',
      'ropeClimb',
      'muscleUpTransition',
      'doubleUnder',
      'boxJump',
      'ringDip',
    },
    trainingDays: {1, 2, 3, 4},
    preferredSessionMinutes: 90,
  );

  final WeightUnit unit;
  final Map<String, double> personalRecordsLb;
  final Map<String, double> trainingMaxesLb;
  final Map<String, MovementPreference> movementPreferences;
  final Set<String> restrictedPatterns;
  final List<String> reportedInjuries;
  final Set<String> availableEquipment;
  final Set<int> trainingDays;
  final int preferredSessionMinutes;
  final Set<String> skillQualifications;

  Map<String, double> get effectiveTrainingMaxesLb => {
    ...personalRecordsLb,
    ...trainingMaxesLb,
  };

  static AthleteSettings load(SharedPreferences prefs) =>
      decode(prefs.getString(storageKey));

  static AthleteSettings decode(String? encoded) {
    if (encoded == null) return defaults;
    try {
      final value = jsonDecode(encoded) as Map<String, dynamic>;
      final records = _numberMap(value['personal_records_lb']);
      final maxes = _numberMap(value['training_maxes_lb']);
      // Older builds seeded these values as training maxes. When no PR was
      // recorded for a lift, preserve the number as its PR and let the new
      // optional training max remain blank.
      for (final entry in maxes.entries.toList()) {
        if (!records.containsKey(entry.key)) {
          records[entry.key] = entry.value;
          maxes.remove(entry.key);
        }
      }
      return AthleteSettings(
        unit: value['unit'] == 'kilograms'
            ? WeightUnit.kilograms
            : WeightUnit.pounds,
        personalRecordsLb: records,
        trainingMaxesLb: maxes,
        movementPreferences: {
          for (final entry
              in (value['movement_preferences'] as Map? ?? {}).entries)
            if (MovementPreference.values.any(
              (item) => item.name == entry.value,
            ))
              entry.key.toString(): MovementPreference.values.firstWhere(
                (item) => item.name == entry.value,
              ),
        },
        restrictedPatterns: {
          for (final item
              in (value['restricted_patterns'] as List? ?? const []))
            item.toString(),
        },
        reportedInjuries: [
          for (final item in (value['reported_injuries'] as List? ?? const []))
            item.toString(),
        ],
        availableEquipment: {
          for (final item
              in (value['available_equipment'] as List? ?? const []))
            if (equipmentLabels.containsKey(item.toString())) item.toString(),
        },
        trainingDays: {
          for (final item
              in (value['training_days'] as List? ?? const [1, 2, 3, 4]))
            if (item is num && item >= 1 && item <= 7) item.toInt(),
        },
        preferredSessionMinutes: value['preferred_session_minutes'] == 60
            ? 60
            : 90,
        skillQualifications: {
          for (final item
              in (value['skill_qualifications'] as List? ??
                  allSkillQualificationKeys))
            if (allSkillQualificationKeys.contains(item.toString()))
              item.toString(),
        },
      );
    } on FormatException {
      return defaults;
    }
  }

  static Map<String, double> _numberMap(Object? raw) {
    if (raw is! Map) return {};
    return {
      for (final entry in raw.entries)
        if (entry.value is num)
          entry.key.toString(): (entry.value as num).toDouble(),
    };
  }

  Future<void> save(SharedPreferences prefs) =>
      prefs.setString(storageKey, encode());

  String encode() => jsonEncode({
    'unit': unit.name,
    'personal_records_lb': personalRecordsLb,
    'training_maxes_lb': trainingMaxesLb,
    'movement_preferences': {
      for (final entry in movementPreferences.entries)
        entry.key: entry.value.name,
    },
    'restricted_patterns': restrictedPatterns.toList()..sort(),
    'reported_injuries': reportedInjuries,
    'available_equipment': availableEquipment.toList()..sort(),
    'training_days': trainingDays.toList()..sort(),
    'preferred_session_minutes': preferredSessionMinutes,
    'skill_qualifications': skillQualifications.toList()..sort(),
  });
}

class AthleteProfilePage extends StatefulWidget {
  const AthleteProfilePage({
    required this.initial,
    this.movementOnly = false,
    this.strengthOnly = false,
    this.focusLiftKey,
    this.skillsOnly = false,
    this.benchmarksOnly = false,
    this.benchmarkHistory = const [],
    this.onBenchmarkEdited,
    super.key,
  });

  final AthleteSettings initial;
  final bool movementOnly;
  final bool strengthOnly;
  final String? focusLiftKey;
  final bool skillsOnly;
  final bool benchmarksOnly;
  final List<BenchmarkResultEvent> benchmarkHistory;
  final Future<void> Function(BenchmarkResultEvent event)? onBenchmarkEdited;

  @override
  State<AthleteProfilePage> createState() => _AthleteProfilePageState();
}

class _AthleteProfilePageState extends State<AthleteProfilePage> {
  final _formKey = GlobalKey<FormState>();
  final _pr = <String, TextEditingController>{};
  final _trainingMax = <String, TextEditingController>{};
  final _prFocus = <String, FocusNode>{};
  final _liftCardKeys = <String, GlobalKey>{};
  late WeightUnit _unit;
  late Map<String, MovementPreference> _movementPreferences;
  late Set<String> _restrictedPatterns;
  late Set<String> _skillQualifications;
  late Set<String> _availableEquipment;
  late TextEditingController _injuryNotes;
  late TextEditingController _movementSearch;
  late List<BenchmarkResultEvent> _benchmarkHistory;
  bool _saving = false;

  @override
  void initState() {
    super.initState();
    _unit = widget.initial.unit;
    _movementPreferences = {...widget.initial.movementPreferences};
    _restrictedPatterns = {...widget.initial.restrictedPatterns};
    _skillQualifications = {...widget.initial.skillQualifications};
    _availableEquipment = widget.initial.availableEquipment.isEmpty
        ? {...equipmentLabels.keys}
        : {...widget.initial.availableEquipment};
    _injuryNotes = TextEditingController(
      text: widget.initial.reportedInjuries.join('\n'),
    );
    _movementSearch = TextEditingController();
    _benchmarkHistory = [...widget.benchmarkHistory];
    _populateControllers();
    WidgetsBinding.instance.addPostFrameCallback((_) {
      final liftKey = widget.focusLiftKey;
      final target = liftKey == null
          ? null
          : _liftCardKeys[liftKey]?.currentContext;
      if (target == null || !mounted) return;
      Scrollable.ensureVisible(
        target,
        duration: const Duration(milliseconds: 260),
        curve: Curves.easeOut,
        alignment: .2,
      );
      _prFocus[liftKey]?.requestFocus();
    });
  }

  void _populateControllers() {
    for (final lift in liftDefinitions) {
      _pr[lift.key] = TextEditingController(
        text: _display(widget.initial.personalRecordsLb[lift.key]),
      );
      _trainingMax[lift.key] = TextEditingController(
        text: _display(widget.initial.trainingMaxesLb[lift.key]),
      );
      _prFocus[lift.key] = FocusNode();
      _liftCardKeys[lift.key] = GlobalKey();
    }
  }

  String _display(double? pounds) {
    if (pounds == null) return '';
    final value = _unit == WeightUnit.pounds ? pounds : pounds / 2.2046226218;
    return value == value.roundToDouble()
        ? value.round().toString()
        : value.toStringAsFixed(1);
  }

  double _toPounds(String value) {
    final parsed = double.parse(value);
    return _unit == WeightUnit.pounds ? parsed : parsed * 2.2046226218;
  }

  void _changeUnit(WeightUnit unit) {
    if (unit == _unit) return;
    final old = _unit;
    for (final lift in liftDefinitions) {
      for (final controller in [_pr[lift.key]!, _trainingMax[lift.key]!]) {
        final value = double.tryParse(controller.text);
        if (value == null) continue;
        final pounds = old == WeightUnit.pounds ? value : value * 2.2046226218;
        final converted = unit == WeightUnit.pounds
            ? pounds
            : pounds / 2.2046226218;
        controller.text = converted == converted.roundToDouble()
            ? converted.round().toString()
            : converted.toStringAsFixed(1);
      }
    }
    setState(() => _unit = unit);
  }

  void _save() {
    if (!(_formKey.currentState?.validate() ?? false)) return;
    final prs = <String, double>{};
    final maxes = <String, double>{};
    for (final lift in liftDefinitions) {
      final prText = _pr[lift.key]!.text.trim();
      final maxText = _trainingMax[lift.key]!.text.trim();
      if (prText.isNotEmpty) prs[lift.key] = _toPounds(prText);
      if (maxText.isNotEmpty) maxes[lift.key] = _toPounds(maxText);
      if (prs[lift.key] != null &&
          maxes[lift.key] != null &&
          maxes[lift.key]! > prs[lift.key]!) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text('${lift.label}: training max cannot exceed PR.'),
          ),
        );
        return;
      }
    }
    _saving = true;
    Navigator.pop(
      context,
      AthleteSettings(
        unit: _unit,
        personalRecordsLb: prs,
        trainingMaxesLb: maxes,
        movementPreferences: _movementPreferences,
        restrictedPatterns: _restrictedPatterns,
        skillQualifications: _skillQualifications,
        availableEquipment: _availableEquipment,
        reportedInjuries: _injuryNotes.text
            .split('\n')
            .map((line) => line.trim())
            .where((line) => line.isNotEmpty)
            .toList(growable: false),
      ),
    );
  }

  bool get _hasUnsavedChanges {
    if (widget.benchmarksOnly) return false;
    if (_unit != widget.initial.unit ||
        !mapEquals(_movementPreferences, widget.initial.movementPreferences) ||
        !setEquals(_restrictedPatterns, widget.initial.restrictedPatterns) ||
        !setEquals(_skillQualifications, widget.initial.skillQualifications) ||
        !setEquals(
          _availableEquipment,
          widget.initial.availableEquipment.isEmpty
              ? equipmentLabels.keys.toSet()
              : widget.initial.availableEquipment,
        ) ||
        _injuryNotes.text.trim() !=
            widget.initial.reportedInjuries.join('\n')) {
      return true;
    }
    for (final lift in liftDefinitions) {
      if (_pr[lift.key]!.text.trim() !=
              _display(widget.initial.personalRecordsLb[lift.key]) ||
          _trainingMax[lift.key]!.text.trim() !=
              _display(widget.initial.trainingMaxesLb[lift.key])) {
        return true;
      }
    }
    return false;
  }

  Future<bool> _confirmDiscard() async {
    if (!_hasUnsavedChanges) return true;
    return await showDialog<bool>(
          context: context,
          builder: (context) => AlertDialog(
            backgroundColor: _card,
            title: const Text('DISCARD UNSAVED CHANGES?'),
            content: const Text(
              'Your edits to profile settings have not been saved.',
              style: TextStyle(color: _muted),
            ),
            actions: [
              TextButton(
                onPressed: () => Navigator.pop(context, false),
                child: const Text('KEEP EDITING'),
              ),
              FilledButton(
                onPressed: () => Navigator.pop(context, true),
                child: const Text('DISCARD'),
              ),
            ],
          ),
        ) ??
        false;
  }

  @override
  void dispose() {
    for (final controller in [..._pr.values, ..._trainingMax.values]) {
      controller.dispose();
    }
    for (final focusNode in _prFocus.values) {
      focusNode.dispose();
    }
    _injuryNotes.dispose();
    _movementSearch.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) => PopScope<Object?>(
    canPop: _saving || !_hasUnsavedChanges,
    onPopInvokedWithResult: (didPop, _) async {
      if (didPop || _saving || !await _confirmDiscard()) return;
      if (!mounted) return;
      Navigator.of(this.context).pop();
    },
    child: Scaffold(
      backgroundColor: _paper,
      appBar: AppBar(
        backgroundColor: Colors.transparent,
        surfaceTintColor: Colors.transparent,
        foregroundColor: _ink,
        title: Text(
          widget.movementOnly
              ? 'MOVEMENT BOUNDARIES'
              : widget.strengthOnly
              ? 'STRENGTH RECORDS'
              : widget.skillsOnly
              ? 'SKILLS & EXPERIENCE'
              : widget.benchmarksOnly
              ? 'BENCHMARK CHRONICLE'
              : 'STRENGTH VAULT',
          style: const TextStyle(
            fontWeight: FontWeight.w900,
            letterSpacing: 1.1,
          ),
        ),
        actions: [
          if (widget.movementOnly || widget.skillsOnly || widget.strengthOnly)
            TextButton(
              onPressed: _save,
              child: const Text(
                'SAVE',
                style: TextStyle(color: _ember, fontWeight: FontWeight.w900),
              ),
            ),
        ],
      ),
      extendBodyBehindAppBar: true,
      body: Container(
        decoration: const BoxDecoration(
          gradient: LinearGradient(
            begin: Alignment.topCenter,
            end: Alignment.bottomCenter,
            colors: [_paper, Color(0xff160b2d), _paper],
          ),
        ),
        child: SafeArea(
          child: Form(
            key: _formKey,
            child: ListView(
              padding: const EdgeInsets.fromLTRB(18, 18, 18, 36),
              children: [
                if (widget.movementOnly) ...[
                  _movementHeader(),
                  const SizedBox(height: 14),
                  _equipmentAccessCard(),
                  const SizedBox(height: 14),
                  _movementBoundariesCard(),
                ] else if (widget.strengthOnly) ...[
                  _vaultHeader(),
                  const SizedBox(height: 16),
                  SegmentedButton<WeightUnit>(
                    segments: const [
                      ButtonSegment(
                        value: WeightUnit.pounds,
                        label: Text('LB'),
                      ),
                      ButtonSegment(
                        value: WeightUnit.kilograms,
                        label: Text('KG'),
                      ),
                    ],
                    selected: {_unit},
                    onSelectionChanged: (value) => _changeUnit(value.first),
                  ),
                  const SizedBox(height: 18),
                  for (final lift in liftDefinitions) _liftCard(lift),
                ] else if (widget.skillsOnly) ...[
                  _skillsHeader(),
                  const SizedBox(height: 14),
                  _skillQualificationsCard(),
                ] else if (widget.benchmarksOnly) ...[
                  const _SectionBanner(
                    icon: Icons.timeline_outlined,
                    title: 'BENCHMARK CHRONICLE',
                    subtitle:
                        'Every calibration and retest. Tap an entry to correct it.',
                  ),
                  const SizedBox(height: 10),
                  _benchmarkHistoryCard(),
                ] else ...[
                  _vaultHeader(),
                  const SizedBox(height: 16),
                  SegmentedButton<WeightUnit>(
                    style: ButtonStyle(
                      foregroundColor: WidgetStateProperty.resolveWith(
                        (states) => states.contains(WidgetState.selected)
                            ? _paper
                            : _ink,
                      ),
                      backgroundColor: WidgetStateProperty.resolveWith(
                        (states) => states.contains(WidgetState.selected)
                            ? _ember
                            : _card,
                      ),
                      side: const WidgetStatePropertyAll(
                        BorderSide(color: _border),
                      ),
                      textStyle: const WidgetStatePropertyAll(
                        TextStyle(
                          fontWeight: FontWeight.w900,
                          letterSpacing: 1.2,
                        ),
                      ),
                    ),
                    segments: const [
                      ButtonSegment(
                        value: WeightUnit.pounds,
                        label: Text('LB'),
                      ),
                      ButtonSegment(
                        value: WeightUnit.kilograms,
                        label: Text('KG'),
                      ),
                    ],
                    selected: {_unit},
                    onSelectionChanged: (value) => _changeUnit(value.first),
                  ),
                  const SizedBox(height: 18),
                  const _SectionBanner(
                    icon: Icons.shield_outlined,
                    title: 'RECORDS OF POWER',
                    subtitle:
                        'Your proven bests and battle-ready training numbers',
                  ),
                  const SizedBox(height: 10),
                  for (final lift in liftDefinitions) _liftCard(lift),
                  if (widget.onBenchmarkEdited != null) ...[
                    const SizedBox(height: 14),
                    const _SectionBanner(
                      icon: Icons.timeline_outlined,
                      title: 'BENCHMARK CHRONICLE',
                      subtitle:
                          'Every calibration and retest. Tap an entry to correct it.',
                    ),
                    const SizedBox(height: 10),
                    _benchmarkHistoryCard(),
                  ],
                  const SizedBox(height: 14),
                  const _SectionBanner(
                    icon: Icons.workspace_premium_outlined,
                    title: 'SKILLS & EXPERIENCE',
                    subtitle:
                        'Choose skills you are ready to have programmed today',
                  ),
                  const SizedBox(height: 10),
                  _skillQualificationsCard(),
                ],
                if (!widget.movementOnly &&
                    !widget.strengthOnly &&
                    !widget.skillsOnly &&
                    !widget.benchmarksOnly) ...[
                  const SizedBox(height: 14),
                  const _SectionBanner(
                    icon: Icons.health_and_safety_outlined,
                    title: 'MOVEMENT BOUNDARIES',
                    subtitle:
                        'Persistent preferences and user-reported limitations',
                  ),
                  const SizedBox(height: 10),
                  _movementBoundariesCard(),
                ],
                if (!widget.benchmarksOnly && !widget.strengthOnly) ...[
                  const SizedBox(height: 14),
                  DecoratedBox(
                    decoration: BoxDecoration(
                      gradient: const LinearGradient(colors: [_fire, _ember]),
                      borderRadius: BorderRadius.circular(18),
                      boxShadow: [
                        BoxShadow(
                          color: _fire.withValues(alpha: .35),
                          blurRadius: 24,
                          spreadRadius: 1,
                        ),
                      ],
                    ),
                    child: FilledButton.icon(
                      onPressed: _save,
                      style: FilledButton.styleFrom(
                        minimumSize: const Size.fromHeight(58),
                        backgroundColor: Colors.transparent,
                        foregroundColor: _paper,
                        shadowColor: Colors.transparent,
                        shape: RoundedRectangleBorder(
                          borderRadius: BorderRadius.circular(18),
                        ),
                      ),
                      icon: const Icon(Icons.auto_awesome),
                      label: Text(
                        widget.movementOnly
                            ? 'SAVE MOVEMENT SETTINGS'
                            : widget.skillsOnly
                            ? 'SAVE SKILL SETTINGS'
                            : 'FORGE NEW TRAINING MAXES',
                        style: const TextStyle(
                          fontWeight: FontWeight.w900,
                          letterSpacing: .7,
                        ),
                      ),
                    ),
                  ),
                ],
              ],
            ),
          ),
        ),
      ),
    ),
  );

  Widget _vaultHeader() => Container(
    padding: const EdgeInsets.all(18),
    decoration: BoxDecoration(
      borderRadius: BorderRadius.circular(22),
      border: Border.all(color: _fire.withValues(alpha: .7)),
      gradient: const LinearGradient(
        begin: Alignment.topLeft,
        end: Alignment.bottomRight,
        colors: [Color(0xff2a1550), _card],
      ),
      boxShadow: [
        BoxShadow(
          color: _fire.withValues(alpha: .22),
          blurRadius: 28,
          spreadRadius: 1,
        ),
      ],
    ),
    child: const Row(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        DecoratedBox(
          decoration: BoxDecoration(
            shape: BoxShape.circle,
            gradient: LinearGradient(colors: [_ember, _fire]),
          ),
          child: Padding(
            padding: EdgeInsets.all(12),
            child: Icon(Icons.fitness_center, color: _paper, size: 26),
          ),
        ),
        SizedBox(width: 14),
        Expanded(
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Text(
                'CALIBRATE YOUR ARSENAL',
                style: TextStyle(
                  color: _ember,
                  fontSize: 18,
                  fontWeight: FontWeight.w900,
                  letterSpacing: .8,
                ),
              ),
              SizedBox(height: 6),
              Text(
                'Record proven lifts, then optionally choose conservative training maxes. A blank training max uses your PR.',
                style: TextStyle(color: _muted, height: 1.4),
              ),
            ],
          ),
        ),
      ],
    ),
  );

  Widget _movementHeader() => Container(
    padding: const EdgeInsets.all(18),
    decoration: BoxDecoration(
      borderRadius: BorderRadius.circular(22),
      border: Border.all(color: _cyan.withValues(alpha: .7)),
      gradient: const LinearGradient(
        begin: Alignment.topLeft,
        end: Alignment.bottomRight,
        colors: [Color(0xff122b43), _card],
      ),
    ),
    child: const Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Text(
          'SET YOUR MOVEMENT BOUNDARIES',
          style: TextStyle(
            color: _cyan,
            fontSize: 18,
            fontWeight: FontWeight.w900,
          ),
        ),
        SizedBox(height: 7),
        Text(
          'Save ongoing restrictions and preferences here. For a one-day change, use Swap Movement inside that workout.',
          style: TextStyle(color: _muted, height: 1.4),
        ),
      ],
    ),
  );

  Widget _skillsHeader() => Container(
    padding: const EdgeInsets.all(18),
    decoration: BoxDecoration(
      borderRadius: BorderRadius.circular(22),
      border: Border.all(color: _fire.withValues(alpha: .7)),
      gradient: const LinearGradient(
        begin: Alignment.topLeft,
        end: Alignment.bottomRight,
        colors: [Color(0xff2a1550), _card],
      ),
    ),
    child: const Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Text(
          'SET YOUR PROGRAMMING SKILLS',
          style: TextStyle(
            color: _ember,
            fontSize: 18,
            fontWeight: FontWeight.w900,
          ),
        ),
        SizedBox(height: 7),
        Text(
          'Select only skills you want in training today. Turn one off to use its reviewed progression instead.',
          style: TextStyle(color: _muted, height: 1.4),
        ),
      ],
    ),
  );
  Widget _liftCard(LiftDefinition lift) => Container(
    key: _liftCardKeys[lift.key],
    margin: const EdgeInsets.only(bottom: 10),
    decoration: BoxDecoration(
      color: _card,
      borderRadius: BorderRadius.circular(17),
      border: Border.all(color: _border.withValues(alpha: .8)),
    ),
    child: Padding(
      padding: const EdgeInsets.all(14),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Text(
            lift.label.toUpperCase(),
            style: const TextStyle(
              color: _ink,
              fontWeight: FontWeight.w900,
              letterSpacing: .55,
            ),
          ),
          const SizedBox(height: 10),
          Row(
            children: [
              Expanded(
                child: _numberField(
                  _pr[lift.key]!,
                  'PR',
                  allowEmpty: true,
                  focusNode: _prFocus[lift.key],
                ),
              ),
              const SizedBox(width: 10),
              Expanded(
                child: _numberField(
                  _trainingMax[lift.key]!,
                  'Training max',
                  allowEmpty: true,
                ),
              ),
            ],
          ),
        ],
      ),
    ),
  );

  Widget _benchmarkHistoryCard() {
    if (_benchmarkHistory.isEmpty) {
      return Container(
        padding: const EdgeInsets.all(16),
        decoration: BoxDecoration(
          color: _card,
          borderRadius: BorderRadius.circular(17),
          border: Border.all(color: _border),
        ),
        child: const Text(
          'No benchmark results yet. Record a test in training and it will appear here.',
          style: TextStyle(color: _muted, height: 1.35),
        ),
      );
    }
    return Column(
      children: [
        for (final event in _benchmarkHistory)
          Card(
            color: _card,
            child: ListTile(
              leading: const Icon(Icons.timer_outlined, color: _cyan),
              title: Text(
                _benchmarkLabel(event),
                style: const TextStyle(
                  color: _ink,
                  fontWeight: FontWeight.w800,
                ),
              ),
              subtitle: Text(
                '${_dateLabel(event.recordedAt)} • ${_resultSummary(event)}',
                style: const TextStyle(color: _muted),
              ),
              trailing: const Icon(Icons.edit_outlined, color: _ember),
              onTap: () => _editBenchmark(event),
            ),
          ),
      ],
    );
  }

  String _benchmarkLabel(BenchmarkResultEvent event) =>
      switch (event.benchmarkId) {
        'row_short_power_v1' => '200 M / 500 M ROW',
        'row_2000_capacity_v1' => '2,000 M ROW',
        'gymnastics_capacity_v1' => 'GYMNASTICS CAPACITY',
        'run_400_speed_v1' => '400 M RUN',
        'ski_750_capacity_v1' => '750 M SKIERG',
        'run_mile_capacity_v1' => '1 MILE RUN',
        'bike_10_minute_capacity_v1' => '10-MINUTE FAN BIKE',
        _ => 'IMPORTED BENCHMARK',
      };

  String _dateLabel(DateTime date) => '${date.month}/${date.day}/${date.year}';

  String _resultSummary(BenchmarkResultEvent event) => event.values.entries
      .map(
        (entry) =>
            '${_metricLabel(entry.key)} ${_metricValue(entry.key, entry.value)}',
      )
      .join(' • ');

  String _metricLabel(String key) => switch (key) {
    'row_200_split_seconds' => '200m',
    'row_500_split_seconds' => '500m',
    'row_2000_split_seconds' => '2K',
    'run_400_seconds' => '400m',
    'ski_750_split_seconds' => '750m',
    'run_mile_seconds' => 'mile',
    'bike_10min_calories' => 'cal',
    'strict_pullups_reps' => 'pull-ups',
    'pushups_reps' => 'push-ups',
    'toes_to_bar_reps' => 'T2B',
    'double_unders_reps' => 'DU',
    _ => key,
  };

  double _displayValue(String key, double value) => switch (key) {
    'row_200_split_seconds' => value / 2.5,
    'row_2000_split_seconds' => value * 4,
    'ski_750_split_seconds' => value * 1.5,
    _ => value,
  };

  double _canonicalValue(String key, double value) => switch (key) {
    'row_200_split_seconds' => value * 2.5,
    'row_2000_split_seconds' => value / 4,
    'ski_750_split_seconds' => value / 1.5,
    _ => value,
  };

  String _metricValue(String key, double value) => key.endsWith('_seconds')
      ? _formatTime(_displayValue(key, value))
      : value == value.roundToDouble()
      ? value.round().toString()
      : value.toStringAsFixed(1);

  String _formatTime(double totalSeconds) {
    final tenths = (totalSeconds * 10).round();
    final minutes = tenths ~/ 600;
    final seconds = (tenths % 600) / 10;
    return '$minutes:${seconds.toStringAsFixed(1).padLeft(4, '0')}';
  }

  Future<void> _editBenchmark(BenchmarkResultEvent event) async {
    final controllers = {
      for (final entry in event.values.entries)
        entry.key: TextEditingController(
          text: _displayValue(entry.key, entry.value).toString(),
        ),
    };
    final updated = await showModalBottomSheet<BenchmarkResultEvent>(
      context: context,
      isScrollControlled: true,
      useSafeArea: true,
      isDismissible: false,
      enableDrag: false,
      backgroundColor: _card,
      builder: (context) => Padding(
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
                'EDIT ${_benchmarkLabel(event)}',
                style: const TextStyle(
                  color: _ember,
                  fontWeight: FontWeight.w900,
                  fontSize: 18,
                ),
              ),
              const SizedBox(height: 6),
              const Text(
                'Times are stored in total seconds; split values are seconds per 500 m.',
                style: TextStyle(color: _muted),
              ),
              const SizedBox(height: 14),
              for (final entry in controllers.entries) ...[
                TextField(
                  controller: entry.value,
                  keyboardType: const TextInputType.numberWithOptions(
                    decimal: true,
                  ),
                  decoration: InputDecoration(
                    labelText: _metricLabel(entry.key).toUpperCase(),
                    border: const OutlineInputBorder(),
                  ),
                ),
                const SizedBox(height: 10),
              ],
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
                        final values = <String, double>{};
                        for (final entry in controllers.entries) {
                          final value = double.tryParse(
                            entry.value.text.trim(),
                          );
                          if (value == null || value < 0) return;
                          values[entry.key] = _canonicalValue(entry.key, value);
                        }
                        Navigator.pop(
                          context,
                          BenchmarkResultEvent(
                            id: event.id,
                            benchmarkId: event.benchmarkId,
                            recordedAt: event.recordedAt,
                            values: values,
                          ),
                        );
                      },
                      child: const Text('SAVE CORRECTION'),
                    ),
                  ),
                ],
              ),
            ],
          ),
        ),
      ),
    );
    Future<void>.delayed(const Duration(milliseconds: 350), () {
      for (final controller in controllers.values) {
        controller.dispose();
      }
    });
    if (updated == null || widget.onBenchmarkEdited == null) return;
    await widget.onBenchmarkEdited!(updated);
    if (!mounted) return;
    setState(() {
      _benchmarkHistory = [
        for (final item in _benchmarkHistory)
          if (item.id == updated.id) updated else item,
      ];
    });
  }

  Widget _skillQualificationsCard() => Container(
    decoration: BoxDecoration(
      color: _card,
      borderRadius: BorderRadius.circular(17),
      border: Border.all(color: _border),
    ),
    child: Column(
      children: [
        const Padding(
          padding: EdgeInsets.fromLTRB(16, 15, 16, 8),
          child: Text(
            'Turn off a skill whenever you do not want it prescribed. The program automatically uses its reviewed progression instead.',
            style: TextStyle(color: _muted, height: 1.35),
          ),
        ),
        for (final skill in skillQualificationDefinitions)
          SwitchListTile.adaptive(
            key: Key('skill-${skill.key}'),
            contentPadding: const EdgeInsets.symmetric(horizontal: 16),
            activeTrackColor: _fire,
            activeThumbColor: _ember,
            title: Text(
              skill.label,
              style: const TextStyle(color: _ink, fontWeight: FontWeight.w800),
            ),
            subtitle: Text(
              skill.description,
              style: const TextStyle(color: _muted, fontSize: 12),
            ),
            value: _skillQualifications.contains(skill.key),
            onChanged: (selected) => setState(() {
              if (selected) {
                _skillQualifications.add(skill.key);
              } else {
                _skillQualifications.remove(skill.key);
              }
            }),
          ),
      ],
    ),
  );

  Widget _movementBoundariesCard() {
    final query = _movementSearch.text.trim().toLowerCase();
    final movements = preferenceMovementLabels.entries
        .where(
          (entry) => query.isEmpty || entry.value.toLowerCase().contains(query),
        )
        .toList(growable: false);
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        TextField(
          controller: _movementSearch,
          onChanged: (_) => setState(() {}),
          decoration: InputDecoration(
            hintText: 'Search movements',
            prefixIcon: const Icon(Icons.search),
            suffixIcon: _movementSearch.text.isEmpty
                ? null
                : IconButton(
                    onPressed: () {
                      _movementSearch.clear();
                      setState(() {});
                    },
                    icon: const Icon(Icons.clear),
                  ),
            filled: true,
            fillColor: _card,
            border: OutlineInputBorder(borderRadius: BorderRadius.circular(16)),
          ),
        ),
        const SizedBox(height: 10),
        Container(
          padding: const EdgeInsets.all(14),
          decoration: BoxDecoration(
            color: _card,
            borderRadius: BorderRadius.circular(16),
            border: Border.all(color: _border),
          ),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              const Text(
                'PRIVATE NOTES • OPTIONAL',
                style: TextStyle(
                  color: _ember,
                  fontSize: 11,
                  fontWeight: FontWeight.w900,
                ),
              ),
              const SizedBox(height: 5),
              const Text(
                'These notes are for you. The app does not interpret them or generate medical guidance.',
                style: TextStyle(color: _muted, fontSize: 12, height: 1.35),
              ),
              const SizedBox(height: 8),
              TextField(
                controller: _injuryNotes,
                minLines: 2,
                maxLines: 3,
                decoration: const InputDecoration(
                  hintText: 'Personal context or instructions to remember',
                  filled: true,
                  fillColor: _paper,
                  border: OutlineInputBorder(),
                ),
              ),
            ],
          ),
        ),
        const SizedBox(height: 12),
        Text(
          '${movements.length} MOVEMENTS',
          style: const TextStyle(
            color: _muted,
            fontSize: 11,
            fontWeight: FontWeight.w900,
          ),
        ),
        const SizedBox(height: 5),
        for (final movement in movements) _movementPreferenceTile(movement),
      ],
    );
  }

  Widget _equipmentAccessCard() => Container(
    padding: const EdgeInsets.all(14),
    decoration: BoxDecoration(
      color: _card,
      borderRadius: BorderRadius.circular(16),
      border: Border.all(color: _border),
    ),
    child: Material(
      color: Colors.transparent,
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          const Text(
            'EQUIPMENT ACCESS',
            style: TextStyle(color: _ember, fontWeight: FontWeight.w900),
          ),
          const SizedBox(height: 6),
          const Text(
            'Turn off equipment you do not have. Future workouts use a reviewed alternative and explain the change.',
            style: TextStyle(color: _muted, height: 1.35),
          ),
          const SizedBox(height: 10),
          for (final equipment in equipmentLabels.entries)
            SwitchListTile.adaptive(
              contentPadding: EdgeInsets.zero,
              title: Text(
                equipment.value,
                style: const TextStyle(
                  color: _ink,
                  fontWeight: FontWeight.w700,
                ),
              ),
              value: _availableEquipment.contains(equipment.key),
              onChanged: (available) => setState(() {
                if (available) {
                  _availableEquipment.add(equipment.key);
                } else {
                  _availableEquipment.remove(equipment.key);
                }
              }),
            ),
        ],
      ),
    ),
  );

  Widget _movementPreferenceTile(MapEntry<String, String> movement) {
    final value = _movementPreferences[movement.key];
    final label = switch (value) {
      MovementPreference.okay => 'OKAY',
      MovementPreference.prefer => 'PREFER',
      MovementPreference.dislike => 'AVOID',
      MovementPreference.temporarilyUnavailable => 'TEMPORARY',
      MovementPreference.cannotPerform => 'CANNOT DO',
      null => 'NOT SET',
    };
    return Card(
      color: _card,
      child: ListTile(
        title: Text(
          movement.value,
          style: const TextStyle(color: _ink, fontWeight: FontWeight.w800),
        ),
        trailing: Container(
          padding: const EdgeInsets.symmetric(horizontal: 9, vertical: 5),
          decoration: BoxDecoration(
            borderRadius: BorderRadius.circular(12),
            border: Border.all(color: value == null ? _border : _cyan),
          ),
          child: Text(
            label,
            style: TextStyle(
              color: value == null ? _muted : _cyan,
              fontSize: 10,
              fontWeight: FontWeight.w900,
            ),
          ),
        ),
        onTap: () => _chooseMovementState(movement),
      ),
    );
  }

  Future<void> _chooseMovementState(MapEntry<String, String> movement) async {
    final selected = await showModalBottomSheet<MovementPreference?>(
      context: context,
      backgroundColor: _card,
      builder: (context) => SafeArea(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            ListTile(
              title: Text(
                movement.value,
                style: const TextStyle(fontWeight: FontWeight.w900),
              ),
              subtitle: const Text('Choose how this movement fits you.'),
            ),
            for (final option in <(MovementPreference, String)>[
              (MovementPreference.okay, 'Okay'),
              (MovementPreference.prefer, 'Prefer'),
              (MovementPreference.dislike, 'Avoid'),
              (
                MovementPreference.temporarilyUnavailable,
                'Temporarily unavailable',
              ),
              (MovementPreference.cannotPerform, 'Cannot do'),
            ])
              ListTile(
                title: Text(option.$2),
                trailing: _movementPreferences[movement.key] == option.$1
                    ? const Icon(Icons.check, color: _cyan)
                    : null,
                onTap: () => Navigator.pop(context, option.$1),
              ),
          ],
        ),
      ),
    );
    if (!mounted) return;
    setState(() {
      if (selected != null) {
        _movementPreferences[movement.key] = selected;
      }
    });
  }

  Widget _numberField(
    TextEditingController controller,
    String label, {
    bool allowEmpty = false,
    FocusNode? focusNode,
  }) => TextFormField(
    controller: controller,
    focusNode: focusNode,
    keyboardType: const TextInputType.numberWithOptions(decimal: true),
    decoration: InputDecoration(
      labelText: '$label (${_unit == WeightUnit.pounds ? 'lb' : 'kg'})',
      labelStyle: const TextStyle(color: _muted),
      filled: true,
      fillColor: _paper.withValues(alpha: .72),
      enabledBorder: OutlineInputBorder(
        borderRadius: BorderRadius.circular(12),
        borderSide: const BorderSide(color: _border),
      ),
      focusedBorder: OutlineInputBorder(
        borderRadius: BorderRadius.circular(12),
        borderSide: const BorderSide(color: _cyan, width: 1.6),
      ),
    ),
    validator: (value) {
      if (allowEmpty && (value == null || value.trim().isEmpty)) return null;
      final number = double.tryParse(value ?? '');
      if (number == null || number <= 0) return 'Enter a positive number';
      return null;
    },
  );
}

class _SectionBanner extends StatelessWidget {
  const _SectionBanner({
    required this.icon,
    required this.title,
    required this.subtitle,
  });

  final IconData icon;
  final String title;
  final String subtitle;

  @override
  Widget build(BuildContext context) => Row(
    children: [
      Icon(icon, color: _cyan),
      const SizedBox(width: 10),
      Expanded(
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(
              title,
              style: const TextStyle(
                color: _ink,
                fontWeight: FontWeight.w900,
                letterSpacing: .8,
              ),
            ),
            Text(subtitle, style: const TextStyle(color: _muted, fontSize: 12)),
          ],
        ),
      ),
    ],
  );
}
