/// Deterministic, source-independent workout programming primitives.
library;

import 'dart:math' as math;

import 'workout_template_library.dart';

enum Readiness { green, yellow, red }

enum SkillQualification {
  olympicLifting,
  overheadSquat,
  hangingCore,
  inversion,
  ropeClimb,
  muscleUpTransition,
  doubleUnder,
  boxJump,
  ringDip,
}

enum DayRole {
  lowerStrength,
  upperSkill,
  rest,
  power,
  recovery,
  fullBody,
  capacity,
}

enum Effort { easy, moderate, hard }

enum PrescriptionUnit {
  reps,
  seconds,
  meters,
  calories,
  watts,
  pace,
  contacts,
  rounds,
  load,
}

enum EnergySystem {
  aerobicBase,
  threshold,
  vo2,
  anaerobic,
  alactic,
  mixedModal,
}

/// A conservative programming contribution, not a medical tissue-load claim.
/// These labels let phase audits distinguish the principal work from support,
/// stabilization, preparation, and conditioning exposure.
enum TissueDoseSource {
  direct,
  secondary,
  isometric,
  warmup,
  accessory,
  conditioning,
}

enum WorkoutLevel { ember, forge, ascendant, freeblade }

/// Stable data identifiers are intentionally separate from the themed labels.
/// They make a future score or custom prescription unambiguous without
/// inferring a sex category or comparing unlike prescriptions.
String workoutLevelId(WorkoutLevel level) => switch (level) {
  WorkoutLevel.ember => 'level_1',
  WorkoutLevel.forge => 'level_2',
  WorkoutLevel.ascendant => 'level_3',
  WorkoutLevel.freeblade => 'custom',
};

class ConditioningLevelOption {
  const ConditioningLevelOption({
    required this.level,
    required this.prescription,
    this.standards = const [],
    this.requiredQualifications = const {},
  });

  final WorkoutLevel level;
  final List<String> prescription;
  final List<String> standards;
  final Set<SkillQualification> requiredQualifications;

  String get id => workoutLevelId(level);
}

class PrescriptionQuantity {
  const PrescriptionQuantity(this.value, this.unit);

  final double value;
  final PrescriptionUnit unit;
}

/// A machine-readable task behind the athlete-facing prescription text.
/// A task may carry more than one quantity—for example a loaded carry can
/// declare both meters and load, while an interval declares work and rest.
class WorkoutTask {
  const WorkoutTask({
    required this.movement,
    required this.quantities,
    this.workSeconds,
    this.restSeconds,
  });

  final String movement;
  final List<PrescriptionQuantity> quantities;
  final int? workSeconds;
  final int? restSeconds;
}

class DoseLedger {
  const DoseLedger(this.values);

  final Map<String, double> values;

  double operator [](String key) => values[key] ?? 0;

  DoseLedger plus(DoseLedger other) {
    final combined = <String, double>{...values};
    for (final entry in other.values.entries) {
      combined.update(
        entry.key,
        (value) => value + entry.value,
        ifAbsent: () => entry.value,
      );
    }
    return DoseLedger(Map.unmodifiable(combined));
  }
}

/// Weighted programming-fatigue totals. Scores are deterministic planning
/// inputs, not a diagnosis, readiness score, or physiological measurement.
class FatigueLedger {
  const FatigueLedger(this.values);

  final Map<String, double> values;

  double operator [](String key) => values[key] ?? 0;

  FatigueLedger plus(FatigueLedger other) {
    final combined = <String, double>{...values};
    for (final entry in other.values.entries) {
      combined.update(
        entry.key,
        (value) => value + entry.value,
        ifAbsent: () => entry.value,
      );
    }
    return FatigueLedger(Map.unmodifiable(combined));
  }
}

enum LoadingPattern {
  ascending,
  straight,
  topSetBackoff,
  wave,
  complex,
  deload,
}

class StrengthSet {
  const StrengthSet({
    required this.sets,
    required this.reps,
    required this.percent,
  });

  final int sets;
  final int reps;
  final double percent;

  PrescriptionQuantity get quantity =>
      PrescriptionQuantity(reps.toDouble(), PrescriptionUnit.reps);
}

class AthleteProfile {
  const AthleteProfile({
    required this.id,
    required this.trainingMaxes,
    this.sessionMinutes = 90,
    this.trainingDays = const {1, 2, 4, 5, 6},
    this.qualifications = const {},
    this.availableEquipment = commonFunctionalFitnessEquipment,
    this.restrictedPatterns = const {},
    this.benchmarkValues = const {},
  });

  static const commonFunctionalFitnessEquipment = {
    'rower',
    'ski_erg',
    'fan_bike',
    'sandbag',
    'dumbbells',
    'rings',
    'box',
    'running_space',
    'kettlebell',
    'bike',
    'bands',
    'cable_machine',
    'pull_up_rig',
    'landmine',
    'wall_ball',
    'barbell',
    'jump_rope',
    'wall_space',
    'rope',
    'sled',
  };
  static const allQualifications = {
    SkillQualification.olympicLifting,
    SkillQualification.overheadSquat,
    SkillQualification.hangingCore,
    SkillQualification.inversion,
    SkillQualification.ropeClimb,
    SkillQualification.muscleUpTransition,
    SkillQualification.doubleUnder,
    SkillQualification.boxJump,
    SkillQualification.ringDip,
  };

  final String id;
  final Map<String, double> trainingMaxes;
  final int sessionMinutes;
  final Set<int> trainingDays;
  final Set<SkillQualification> qualifications;
  final Set<String> availableEquipment;

  /// Patterns temporarily excluded because of pain, limitation, or an explicit
  /// athlete/clinician instruction. The engine does not diagnose the cause.
  final Set<String> restrictedPatterns;

  /// Canonical benchmark values. Rowing split values are stored as seconds per
  /// 500 meters so display-unit changes never alter the underlying result.
  final Map<String, double> benchmarkValues;
}

class CalibrationTest {
  const CalibrationTest({
    required this.id,
    required this.label,
    required this.distanceMeters,
    required this.resultKey,
  });

  final String id;
  final String label;
  final int distanceMeters;
  final String resultKey;
}

class CalibrationSession {
  const CalibrationSession({
    required this.id,
    required this.title,
    required this.tests,
    required this.recoveryMinutesBetweenTests,
    required this.replacesConditioning,
  });

  final String id;
  final String title;
  final List<CalibrationTest> tests;
  final int recoveryMinutesBetweenTests;
  final bool replacesConditioning;
}

class SessionFeedback {
  const SessionFeedback({
    required this.completed,
    required this.actualMinutes,
    required this.rpe,
    this.pain = false,
    this.techniqueBreakdown = false,
    this.soreness = 0,
  });

  final bool completed;
  final int actualMinutes;
  final double rpe;
  final bool pain;
  final bool techniqueBreakdown;
  final int soreness;

  Readiness get nextReadiness {
    if (pain || techniqueBreakdown) return Readiness.red;
    if (!completed || rpe >= 9 || soreness >= 8) return Readiness.yellow;
    return Readiness.green;
  }
}

class StrengthWork {
  const StrengthWork({
    required this.movement,
    required this.loadingPattern,
    required this.steps,
    required this.trainingMaxKey,
    required this.trainingMax,
    required this.primaryPattern,
    this.stress = const {},
    this.skill = 'basic',
    this.prescriptionUnit = PrescriptionUnit.reps,
  });

  final String movement;
  final LoadingPattern loadingPattern;
  final List<StrengthSet> steps;
  final String trainingMaxKey;
  final double? trainingMax;
  final String primaryPattern;
  final Set<String> stress;
  final String skill;
  final PrescriptionUnit prescriptionUnit;

  int get sets => steps.fold(0, (total, step) => total + step.sets);
  int get reps => steps.last.reps;
  double get percent => steps.last.percent;
  double? get suggestedLoad =>
      trainingMax == null ? null : _roundLoad(trainingMax! * percent);
  PrescriptionQuantity? get suggestedLoadQuantity => suggestedLoad == null
      ? null
      : PrescriptionQuantity(suggestedLoad!, PrescriptionUnit.load);

  /// A programmed strength lift, rather than Olympic receiving or overhead
  /// position practice. Overhead squats and squat variations inside Olympic
  /// complexes intentionally remain eligible alongside one of these lifts.
  bool get isDedicatedBilateralSquatStrength =>
      primaryPattern == 'squat' &&
      (trainingMaxKey == 'back_squat' || trainingMaxKey == 'front_squat');

  int get prescribedRestSeconds {
    if (skill == 'advanced' || loadingPattern == LoadingPattern.complex) {
      return 120;
    }
    if (percent >= .75) return 180;
    if (percent >= .60) return 120;
    return 75;
  }

  static double _roundLoad(double value) => (value / 5).round() * 5.0;
}

class ConditioningWork {
  const ConditioningWork({
    required this.durationMinutes,
    required this.effort,
    required this.format,
    this.prescription = const [],
    this.rxStandards = const [],
    this.level = WorkoutLevel.ascendant,
    this.levelOptions = const [],
    this.movementPatterns = const {},
    this.templateId,
    this.energySystem = EnergySystem.mixedModal,
    this.workSeconds,
    this.restSeconds,
    this.tasks = const [],
    this.targetCompletionMinutes,
    this.stationTargetSeconds = const [],
  });

  final int durationMinutes;
  final Effort effort;
  final String format;
  final List<String> prescription;
  final List<String> rxStandards;
  final WorkoutLevel level;
  final List<ConditioningLevelOption> levelOptions;
  final Set<String> movementPatterns;
  final String? templateId;
  final EnergySystem energySystem;
  final int? workSeconds;
  final int? restSeconds;
  final List<WorkoutTask> tasks;
  final (int, int)? targetCompletionMinutes;

  /// Per-station work windows for an EMOM, in prescription order.
  final List<(int, int)> stationTargetSeconds;

  PrescriptionQuantity get duration =>
      PrescriptionQuantity(durationMinutes * 60.0, PrescriptionUnit.seconds);

  /// Deliberately conservative estimate used only to validate authored
  /// for-time volume against its target window; athletes still stop at the cap.
  double get estimatedCompletionMinutes {
    final rounds = tasks
        .where((task) => task.movement == 'round structure')
        .expand((task) => task.quantities)
        .fold<double>(1, (value, quantity) => quantity.value);
    final work = tasks
        .where((task) => task.movement != 'round structure')
        .expand((task) => task.quantities)
        .fold<double>(0, (total, quantity) {
          final minutes = switch (quantity.unit) {
            PrescriptionUnit.calories => quantity.value * .08,
            PrescriptionUnit.meters => quantity.value * .004,
            PrescriptionUnit.contacts => quantity.value * .05,
            PrescriptionUnit.reps => quantity.value * .085,
            _ => 0.0,
          };
          return total + minutes;
        });
    final movementCount = tasks
        .where((task) => task.movement != 'round structure')
        .length;
    return work * rounds + movementCount * .25 * rounds;
  }
}

class GeneratedDay {
  const GeneratedDay({
    required this.date,
    required this.role,
    required this.title,
    required this.warmupMinutes,
    this.warmup = const [],
    required this.strength,
    this.secondaryStrength = const [],
    this.accessories = const [],
    this.warmupTemplateId,
    this.accessoryTemplateId,
    this.equipment = const {},
    required this.conditioning,
    required this.isRest,
    required this.explanation,
    this.cooldownMinutes = 0,
    this.cooldown = const [],
  });

  final DateTime date;
  final DayRole role;
  final String title;
  final int warmupMinutes;
  final List<String> warmup;
  final StrengthWork? strength;
  final List<StrengthWork> secondaryStrength;
  final List<String> accessories;
  final String? warmupTemplateId;
  final String? accessoryTemplateId;
  final Set<String> equipment;
  final ConditioningWork? conditioning;
  final bool isRest;
  final List<String> explanation;
  final int cooldownMinutes;
  final List<String> cooldown;

  /// Conservative planned duration. Optional accessories are included because
  /// a displayed workout must fit before it is offered to an athlete.
  int get estimatedSessionMinutes {
    if (isRest) return 0;
    final works = [
      strength,
      ...secondaryStrength,
    ].whereType<StrengthWork>().toList();
    final strengthSeconds = works.fold<int>(0, (total, work) {
      final executionSeconds = work.steps.fold<int>(
        0,
        (sum, step) =>
            sum +
            step.sets *
                switch (work.prescriptionUnit) {
                  PrescriptionUnit.seconds => 10 + step.reps,
                  PrescriptionUnit.meters => 15 + step.reps,
                  PrescriptionUnit.contacts => 15 + step.reps * 3,
                  _ => 20 + step.reps * 4,
                },
      );
      final restSeconds =
          (work.sets - 1).clamp(0, 100) * work.prescribedRestSeconds;
      return total + executionSeconds + restSeconds;
    });
    final equipmentTransitions =
        ({
                  for (final work in works) _equipmentFamily(work),
                  if (conditioning != null) 'conditioning',
                }.length -
                1)
            .clamp(0, 10);
    return (warmupMinutes +
            strengthSeconds / 60 +
            accessories.length * 3 +
            (conditioning?.durationMinutes ?? 0) +
            3 +
            equipmentTransitions * 2)
        .ceil();
  }

  static String _equipmentFamily(StrengthWork work) {
    if (work.trainingMaxKey.isNotEmpty) return 'loaded';
    if (work.primaryPattern == 'carry') return 'carry';
    if (work.primaryPattern == 'impact') return 'jump';
    return 'bodyweight';
  }

  DoseLedger get dose {
    var ledger = const DoseLedger({});
    final strengthWorks = [
      strength,
      ...secondaryStrength,
    ].whereType<StrengthWork>().toList(growable: false);
    for (var index = 0; index < strengthWorks.length; index++) {
      final work = strengthWorks[index];
      final meanPercent = work.steps.isEmpty
          ? 0.0
          : work.steps.fold<double>(0, (sum, step) => sum + step.percent) /
                work.steps.length;
      final intensity = meanPercent == 0 ? .55 : .65 + meanPercent * .55;
      final skillFactor = work.skill == 'advanced' ? .70 : 1.0;
      final units = work.sets * intensity * skillFactor;
      ledger = ledger.plus(
        DoseLedger({
          for (final stress in work.stress) stress: units,
          if (work.primaryPattern == 'olympic_lift' ||
              work.stress.contains('power'))
            'energy_${EnergySystem.alactic.name}': units,
        }),
      );
      final source = index == 0
          ? TissueDoseSource.direct
          : TissueDoseSource.secondary;
      ledger = _addTissues(ledger, _tissuesFor(work), units, source);
      ledger = _addTissues(
        ledger,
        _stabilizingTissuesFor(work),
        units * .45,
        TissueDoseSource.isometric,
      );
    }
    ledger = _addTextExposure(
      ledger,
      warmup,
      warmupMinutes * .12,
      TissueDoseSource.warmup,
    );
    ledger = _addTextExposure(
      ledger,
      accessories,
      accessories.length * 1.2,
      TissueDoseSource.accessory,
    );
    final metcon = conditioning;
    if (metcon != null) {
      final effortFactor = switch (metcon.effort) {
        Effort.easy => .30,
        Effort.moderate => .48,
        Effort.hard => .68,
      };
      final units = metcon.durationMinutes * effortFactor;
      ledger = ledger.plus(
        DoseLedger({
          for (final pattern in metcon.movementPatterns) pattern: units,
          'conditioning': units,
          'energy_${metcon.energySystem.name}': units,
        }),
      );
      ledger = _addTissues(
        ledger,
        _tissuesForConditioning(metcon.movementPatterns),
        units,
        TissueDoseSource.conditioning,
      );
    }
    return ledger;
  }

  /// Converts the detailed dose audit into the broader categories used when
  /// deciding whether a future sequence is safe to serve.
  FatigueLedger get fatigue {
    double workUnits(StrengthWork work) {
      final meanPercent =
          work.steps.fold<double>(0, (sum, step) => sum + step.percent) /
          math.max(1, work.steps.length);
      final intensity = meanPercent == 0 ? .55 : .65 + meanPercent * .55;
      return work.sets * intensity * (work.skill == 'advanced' ? .70 : 1.0);
    }

    final primary = strength == null ? 0.0 : workUnits(strength!);
    final secondary = secondaryStrength.fold<double>(
      0,
      (sum, work) => sum + workUnits(work),
    );
    final technique = [strength, ...secondaryStrength]
        .whereType<StrengthWork>()
        .where((work) => work.skill == 'advanced' || work.trainingMax == null)
        .fold<double>(0, (sum, work) => sum + workUnits(work) * .65);
    final conditioning = dose['conditioning'];
    return FatigueLedger(
      Map.unmodifiable({
        'primary_work': primary,
        'secondary_work': secondary,
        'technique': technique,
        'accessories': accessories.length * 1.2,
        'conditioning': conditioning,
        'impact':
            dose['impact'] + dose['tissue_conditioning_feet_ankles'] * .45,
        'grip': dose['grip'] + dose['tissue_conditioning_grip'] * .45,
        'overhead': dose['overhead'] + dose['shoulder'] * .35,
        'hinge': dose['hinge'] + dose['tissue_conditioning_hamstrings'] * .25,
        'squat':
            dose['tissue_direct_quads'] +
            dose['tissue_conditioning_quads'] * .25,
        'knee': dose['knee'] + dose['tissue_direct_quads'] * .35,
        'shoulder': dose['shoulder'] + dose['tissue_direct_shoulders'] * .35,
        'elbow':
            dose['triceps'] * .35 + dose['biceps'] * .35 + dose['grip'] * .2,
        'trunk': dose['core'] + dose['tissue_isometric_trunk_bracing'],
        'systemic': dose['systemic'] + conditioning * .35,
      }),
    );
  }

  static DoseLedger _addTissues(
    DoseLedger ledger,
    Set<String> tissues,
    double units,
    TissueDoseSource source,
  ) => ledger.plus(
    DoseLedger({
      for (final tissue in tissues) ...{
        'tissue_$tissue': units,
        'tissue_${source.name}_$tissue': units,
      },
    }),
  );

  static DoseLedger _addTextExposure(
    DoseLedger ledger,
    List<String> lines,
    double totalUnits,
    TissueDoseSource source,
  ) {
    if (lines.isEmpty || totalUnits == 0) return ledger;
    final matches = <String>{};
    for (final line in lines) {
      final text = line.toLowerCase();
      if (text.contains('squat') ||
          text.contains('lunge') ||
          text.contains('step')) {
        matches.addAll({'quads', 'glutes'});
      }
      if (text.contains('pull') ||
          text.contains('row') ||
          text.contains('rope')) {
        matches.addAll({'upper_back', 'lats', 'grip'});
      }
      if (text.contains('press') ||
          text.contains('push-up') ||
          text.contains('dip')) {
        matches.addAll({'shoulders', 'triceps'});
      }
      if (text.contains('run') ||
          text.contains('jump') ||
          text.contains('double-under')) {
        matches.addAll({'calves_soleus', 'feet_ankles'});
      }
      if (text.contains('plank') ||
          text.contains('sit-up') ||
          text.contains('toes-to-bar')) {
        matches.addAll({'abdominals', 'trunk_bracing'});
      }
    }
    return _addTissues(
      ledger,
      matches,
      totalUnits / math.max(1, matches.length),
      source,
    );
  }

  static Set<String> _stabilizingTissuesFor(StrengthWork work) => {
    'trunk_bracing',
    if (work.primaryPattern == 'squat' ||
        work.primaryPattern == 'hinge' ||
        work.primaryPattern == 'olympic_lift')
      'erectors_lower_back',
    if (work.primaryPattern == 'overhead_squat' ||
        work.primaryPattern == 'vertical_push')
      'shoulders',
  };

  static Set<String> _tissuesForConditioning(Set<String> patterns) => {
    for (final pattern in patterns)
      ...switch (pattern) {
        'cyclical' => {'quads', 'glutes', 'hamstrings'},
        'hinge' => {'hamstrings', 'glutes', 'erectors_lower_back'},
        'squat' => {'quads', 'glutes'},
        'horizontal_pull' || 'vertical_pull' => {'upper_back', 'lats', 'grip'},
        'vertical_push' || 'inversion' => {'shoulders', 'triceps'},
        'hanging_core' => {'abdominals', 'hip_flexors', 'grip'},
        'impact' => {'calves_soleus', 'feet_ankles', 'quads'},
        'unilateral' => {'quads', 'glutes', 'adductors'},
        _ => <String>{},
      },
  };

  static Set<String> _tissuesFor(StrengthWork work) {
    final movement = work.movement.toLowerCase();
    return switch (work.primaryPattern) {
      'squat' || 'overhead_squat' => {
        'quads',
        'glutes',
        'adductors',
        'trunk_bracing',
        if (work.primaryPattern == 'overhead_squat') ...{
          'shoulders',
          'upper_back',
        },
      },
      'hinge' => {
        'hamstrings',
        'glutes',
        'erectors_lower_back',
        'trunk_bracing',
      },
      'olympic_lift' => {
        'quads',
        'glutes',
        'hamstrings',
        'erectors_lower_back',
        'upper_back',
        'traps',
        'shoulders',
        'trunk_bracing',
      },
      'horizontal_push' => {'chest', 'shoulders', 'triceps'},
      'vertical_push' ||
      'inversion' => {'shoulders', 'triceps', 'upper_back', 'trunk_bracing'},
      'horizontal_pull' => {'upper_back', 'lats', 'biceps', 'grip'},
      'vertical_pull' => {'lats', 'upper_back', 'biceps', 'grip'},
      'unilateral' => {'quads', 'glutes', 'adductors', 'abductors'},
      'carry' => {'grip', 'traps', 'trunk_bracing'},
      'hanging_core' => {'abdominals', 'hip_flexors', 'grip', 'shoulders'},
      'core' => {'abdominals', 'trunk_bracing', 'hip_flexors'},
      'impact' => {'calves_soleus', 'feet_ankles', 'quads'},
      _ => {
        if (movement.contains('pull')) 'upper_back',
        if (movement.contains('press')) 'shoulders',
      },
    };
  }

  /// Canonical prescription identity. Dates, titles, and presentation copy are
  /// excluded so cosmetic renaming cannot disguise a repeated workout.
  String get prescriptionSignature {
    if (isRest) return 'rest';
    final strengthParts = [?strength, ...secondaryStrength]
        .map(
          (work) => [
            work.movement,
            work.loadingPattern.name,
            work.prescriptionUnit.name,
            ...work.steps.map(
              (step) =>
                  '${step.sets}x${step.reps}@${step.percent.toStringAsFixed(4)}',
            ),
          ].join('|'),
        )
        .toList();
    final conditioningParts = conditioning == null
        ? const <String>[]
        : [
            '${conditioning!.durationMinutes}',
            conditioning!.effort.name,
            ...conditioning!.prescription,
            ...conditioning!.rxStandards,
            conditioning!.level.name,
            ...(conditioning!.movementPatterns.toList()..sort()),
          ];
    return [
      ...warmup,
      ...strengthParts,
      ...accessories,
      ...conditioningParts,
      ...cooldown,
    ].join('||').toLowerCase().replaceAll(RegExp(r'\s+'), ' ').trim();
  }

  GeneratedDay copyWith({
    int? warmupMinutes,
    List<String>? warmup,
    StrengthWork? strength,
    List<StrengthWork>? secondaryStrength,
    bool removeStrength = false,
    ConditioningWork? conditioning,
    bool removeConditioning = false,
    bool? isRest,
    List<String>? explanation,
    List<String>? accessories,
    String? warmupTemplateId,
    String? accessoryTemplateId,
    Set<String>? equipment,
    int? cooldownMinutes,
    List<String>? cooldown,
  }) => GeneratedDay(
    date: date,
    role: role,
    title: title,
    warmupMinutes: warmupMinutes ?? this.warmupMinutes,
    warmup: warmup ?? this.warmup,
    strength: removeStrength ? null : (strength ?? this.strength),
    secondaryStrength: removeStrength
        ? const []
        : (secondaryStrength ?? this.secondaryStrength),
    accessories: accessories ?? this.accessories,
    warmupTemplateId: warmupTemplateId ?? this.warmupTemplateId,
    accessoryTemplateId: accessoryTemplateId ?? this.accessoryTemplateId,
    equipment: equipment ?? this.equipment,
    conditioning: removeConditioning
        ? null
        : (conditioning ?? this.conditioning),
    isRest: isRest ?? this.isRest,
    explanation: explanation ?? this.explanation,
    cooldownMinutes: cooldownMinutes ?? this.cooldownMinutes,
    cooldown: cooldown ?? this.cooldown,
  );
}

class GeneratedWeek {
  const GeneratedWeek({required this.phaseWeek, required this.days});

  final int phaseWeek;
  final List<GeneratedDay> days;

  int get hardMetconCount =>
      days.where((day) => day.conditioning?.effort == Effort.hard).length;
  int get restDayCount => days.where((day) => day.isRest).length;
  FatigueLedger get fatigue => days.fold(
    const FatigueLedger({}),
    (ledger, day) => ledger.plus(day.fatigue),
  );
}

class GeneratedPhase {
  const GeneratedPhase({required this.weeks});

  final List<GeneratedWeek> weeks;

  List<GeneratedDay> get days => [for (final week in weeks) ...week.days];

  /// Exportable phase audit. Source-qualified keys such as
  /// `tissue_conditioning_grip` explain where an exposure came from, while
  /// `tissue_grip` remains the conservative total used by validators.
  DoseLedger get dose =>
      days.fold(const DoseLedger({}), (ledger, day) => ledger.plus(day.dose));

  FatigueLedger get fatigue => days.fold(
    const FatigueLedger({}),
    (ledger, day) => ledger.plus(day.fatigue),
  );
}

class DeterministicProgrammingEngine {
  const DeterministicProgrammingEngine({
    this.templates = const WorkoutTemplateLibrary(),
  });

  final WorkoutTemplateLibrary templates;

  List<CalibrationSession> calibrationSessions(AthleteProfile athlete) {
    final sessions = <CalibrationSession>[];
    final missingShortRow =
        !athlete.benchmarkValues.containsKey('row_200_split_seconds') ||
        !athlete.benchmarkValues.containsKey('row_500_split_seconds');
    if (missingShortRow) {
      sessions.add(
        const CalibrationSession(
          id: 'row_short_power_v1',
          title: 'An Intergalactic Turkey’s Brief but Heroic Panic',
          tests: [
            CalibrationTest(
              id: 'row_200_v1',
              label: '200 m Row',
              distanceMeters: 200,
              resultKey: 'row_200_split_seconds',
            ),
            CalibrationTest(
              id: 'row_500_v1',
              label: '500 m Row',
              distanceMeters: 500,
              resultKey: 'row_500_split_seconds',
            ),
          ],
          recoveryMinutesBetweenTests: 15,
          replacesConditioning: true,
        ),
      );
    }
    if (!athlete.benchmarkValues.containsKey('row_2000_split_seconds')) {
      sessions.add(
        const CalibrationSession(
          id: 'row_2000_capacity_v1',
          title: 'An Extremely Long Spreadsheet of Cosmic Evil',
          tests: [
            CalibrationTest(
              id: 'row_2000_v1',
              label: '2,000 m Row',
              distanceMeters: 2000,
              resultKey: 'row_2000_split_seconds',
            ),
          ],
          recoveryMinutesBetweenTests: 0,
          replacesConditioning: true,
        ),
      );
    }
    return sessions;
  }

  GeneratedPhase generatePhase({
    required AthleteProfile athlete,
    required DateTime startsOn,
    Set<String> priorWorkoutSignatures = const {},
  }) {
    final weeks = [
      for (var phaseWeek = 1; phaseWeek <= 12; phaseWeek++)
        generateWeek(
          athlete: athlete,
          weekOf: startsOn.add(Duration(days: 7 * (phaseWeek - 1))),
          phaseWeek: phaseWeek,
        ),
    ];
    final signatures = <String, int>{};
    for (final day
        in weeks.expand((week) => week.days).where((day) => !day.isRest)) {
      if (priorWorkoutSignatures.contains(day.prescriptionSignature)) {
        throw StateError(
          'Generated workout repeats a prescription from lifetime history.',
        );
      }
      final priorDay = signatures[day.prescriptionSignature];
      if (priorDay != null) {
        throw StateError(
          'Generated workout repeats phase day $priorDay exactly.',
        );
      }
      final overallDay =
          day.date
              .difference(
                DateTime(
                  startsOn.year,
                  startsOn.month,
                  startsOn.day,
                ).subtract(Duration(days: startsOn.weekday - DateTime.monday)),
              )
              .inDays +
          1;
      signatures[day.prescriptionSignature] = overallDay;
    }
    final phase = GeneratedPhase(weeks: weeks);
    _validateRollingPhase(phase);
    _validateConditioningVariety(phase);
    _validateEnergySystemBalance(phase);
    return phase;
  }

  /// Publisher-only safety gate for a phase after a reviewed transformation.
  /// This intentionally uses the same structural, duration, dose, fatigue,
  /// and uniqueness checks as generation rather than maintaining a weaker
  /// second validator for substitutions.
  static void validatePublishedPhase(
    GeneratedPhase phase, {
    required int sessionMinutes,
    Set<String> priorWorkoutSignatures = const {},
  }) {
    final signatures = <String>{};
    for (final week in phase.weeks) {
      _validateWeek(week);
      for (final day in week.days.where((day) => !day.isRest)) {
        if (day.estimatedSessionMinutes > sessionMinutes) {
          throw StateError(
            '${day.title} estimates ${day.estimatedSessionMinutes} minutes, '
            'exceeding the published $sessionMinutes-minute session limit.',
          );
        }
        final signature = day.prescriptionSignature;
        if (priorWorkoutSignatures.contains(signature)) {
          throw StateError(
            '${day.title} repeats a prescription from lifetime history.',
          );
        }
        if (!signatures.add(signature)) {
          throw StateError('${day.title} duplicates a phase prescription.');
        }
      }
    }
    _validateRollingPhase(phase);
    _validateConditioningVariety(phase);
    _validateEnergySystemBalance(phase);
  }

  /// Fast publication check for a single reviewed substitution. The canonical
  /// unmodified phase has already passed [validatePublishedPhase]; a movement
  /// swap therefore needs to re-check the affected microcycle and session
  /// duration rather than repeating every unrelated 7-, 14-, and 28-day
  /// calculation for each catalog candidate.
  static void validatePublishedWeek(
    GeneratedWeek week, {
    required int sessionMinutes,
  }) {
    _validateWeek(week);
    for (final day in week.days.where((day) => !day.isRest)) {
      if (day.estimatedSessionMinutes > sessionMinutes) {
        throw StateError(
          '${day.title} estimates ${day.estimatedSessionMinutes} minutes, '
          'exceeding the published $sessionMinutes-minute session limit.',
        );
      }
    }
  }

  static void _validateConditioningVariety(GeneratedPhase phase) {
    final conditioning = phase.days
        .where((day) => !day.isRest)
        .map((day) => day.conditioning!)
        .toList(growable: false);
    final ids = conditioning.map((work) => work.templateId).toSet();
    if (ids.length != conditioning.length) {
      throw StateError('A phase may not repeat a conditioning prescription.');
    }
    final formats = conditioning.map((work) => work.format).toList();
    final forTime = formats.where((format) => format == 'For time').length;
    if (forTime < 10) {
      throw StateError('A phase requires at least 10 capped for-time pieces.');
    }
    if (phase.days
        .where((day) => !day.isRest)
        .any(
          (day) =>
              day.role != DayRole.capacity &&
              (day.conditioning!.durationMinutes < 12 ||
                  day.conditioning!.durationMinutes > 20),
        )) {
      throw StateError(
        'Conditioning must remain within the 12–20 minute target.',
      );
    }
  }

  static void _validateEnergySystemBalance(GeneratedPhase phase) {
    final counts = <EnergySystem, int>{
      for (final system in EnergySystem.values) system: 0,
    };
    for (final day in phase.days.where((day) => !day.isRest)) {
      counts.update(day.conditioning!.energySystem, (value) => value + 1);
    }
    const minimums = <EnergySystem, int>{
      EnergySystem.aerobicBase: 4,
      EnergySystem.threshold: 8,
      EnergySystem.vo2: 2,
      EnergySystem.anaerobic: 2,
      EnergySystem.mixedModal: 8,
    };
    for (final minimum in minimums.entries) {
      if (counts[minimum.key]! < minimum.value) {
        throw StateError(
          'Phase requires at least ${minimum.value} ${minimum.key.name} '
          'conditioning exposures; found ${counts[minimum.key]}.',
        );
      }
    }
    if (phase.dose['energy_${EnergySystem.alactic.name}'] <= 0) {
      throw StateError(
        'Phase requires alactic power exposure in strength work.',
      );
    }
  }

  GeneratedWeek generateWeek({
    required AthleteProfile athlete,
    required DateTime weekOf,
    required int phaseWeek,
  }) {
    if (phaseWeek < 1 || phaseWeek > 12) {
      throw ArgumentError.value(phaseWeek, 'phaseWeek', 'must be 1–12');
    }
    final monday = DateTime(
      weekOf.year,
      weekOf.month,
      weekOf.day,
    ).subtract(Duration(days: weekOf.weekday - DateTime.monday));
    final deload = phaseWeek % 4 == 0;
    final plans = _phaseStrengthPlans(athlete, phaseWeek, deload);

    final authoredDays = <GeneratedDay>[
      _trainingDay(
        templates,
        phaseWeek,
        deload,
        monday,
        DayRole.lowerStrength,
        'Citadel of Squats',
        plans[0].first,
        ConditioningWork(
          durationMinutes: deload ? 12 : 16,
          effort: Effort.moderate,
          format: 'Alternating row and upper-body intervals',
        ),
        secondaryStrength: plans[0].skip(1).toList(),
      ),
      _trainingDay(
        templates,
        phaseWeek,
        deload,
        monday.add(const Duration(days: 1)),
        DayRole.upperSkill,
        'Astral Press Academy',
        plans[1].first,
        const ConditioningWork(
          durationMinutes: 20,
          effort: Effort.easy,
          format: 'Conversational-pace cyclical aerobic work',
        ),
        secondaryStrength: plans[1].skip(1).toList(),
      ),
      _restDay(monday.add(const Duration(days: 2)), 'Realm Restoration'),
      _trainingDay(
        templates,
        phaseWeek,
        deload,
        monday.add(const Duration(days: 3)),
        DayRole.power,
        'Lightning Forge',
        plans[2].first,
        ConditioningWork(
          durationMinutes: deload ? 12 : 16,
          effort: deload ? Effort.moderate : Effort.hard,
          format: 'Low-repetition mixed-modal rounds',
        ),
        secondaryStrength: plans[2].skip(1).toList(),
      ),
      _trainingDay(
        templates,
        phaseWeek,
        deload,
        monday.add(const Duration(days: 4)),
        DayRole.fullBody,
        'The Full-Body Reckoning',
        plans[3].first,
        ConditioningWork(
          durationMinutes: deload ? 15 : 18,
          effort: Effort.moderate,
          format: 'Sustainable full-body circuit',
        ),
        secondaryStrength: plans[3].skip(1).toList(),
      ),
      // The fifth weekly training slot is deliberately low-fatigue Zone 2
      // conditioning with direct arm and trunk accessories, never strength.
      _capacityDay(monday.add(const Duration(days: 5)), phaseWeek, deload),
      _restDay(monday.add(const Duration(days: 6)), 'Sabbath of the Owl'),
    ];

    final days = authoredDays
        .map((day) => _personalizeDay(day, athlete))
        .map((day) => _fitSession(day, athlete.sessionMinutes))
        .toList(growable: false);

    final week = GeneratedWeek(phaseWeek: phaseWeek, days: days);
    _validateWeek(week);
    return week;
  }

  static List<List<StrengthWork>> _phaseStrengthPlans(
    AthleteProfile athlete,
    int phaseWeek,
    bool deload,
  ) {
    final rotation = (phaseWeek - 1) % 6;
    final wave = (phaseWeek - 1) % 4;
    final bump = wave * .015;
    final dedicatedSquat = _dedicatedSquatForWeek(phaseWeek);
    if (deload) {
      return [
        [
          _work(
            athlete,
            dedicatedSquat.$1,
            dedicatedSquat.$2,
            'squat',
            LoadingPattern.deload,
            const [StrengthSet(sets: 3, reps: 5, percent: .60)],
            {'knee', 'systemic'},
          ),
        ],
        [
          _work(
            athlete,
            'Bench Press',
            'bench_press',
            'horizontal_push',
            LoadingPattern.deload,
            const [StrengthSet(sets: 3, reps: 6, percent: .55)],
            {'shoulder', 'triceps'},
          ),
          _bodyweight(
            'Hanging Knee-Raise Deload Practice',
            'hanging_core',
            2,
            6,
            {'core', 'grip', 'shoulder'},
            skill: 'intermediate',
          ),
          _bodyweight('Wall-Facing Handstand Deload Hold', 'inversion', 2, 1, {
            'inversion',
            'overhead',
            'shoulder',
            'core',
          }, skill: 'advanced'),
        ],
        [
          _work(
            athlete,
            'Power Clean + Jerk',
            'clean_and_jerk',
            'olympic_lift',
            LoadingPattern.deload,
            const [StrengthSet(sets: 5, reps: 1, percent: .55)],
            {'hinge', 'overhead', 'front_rack'},
            skill: 'advanced',
          ),
        ],
        [
          _work(
            athlete,
            'Deadlift',
            'deadlift',
            'hinge',
            LoadingPattern.deload,
            const [StrengthSet(sets: 3, reps: 5, percent: .55)],
            {'posterior_chain', 'grip', 'systemic'},
          ),
          _bodyweight('Dead-Bug Deload Circuit', 'core', 2, 8, {'core'}),
        ],
      ];
    }
    final lower = switch (rotation) {
      0 => [
        _ascending(
          athlete,
          dedicatedSquat.$1,
          dedicatedSquat.$2,
          'squat',
          bump,
        ),
        _straight(
          athlete,
          'Barbell Row',
          'barbell_row',
          'horizontal_pull',
          4,
          8,
          .60 + bump,
        ),
        _straight(
          athlete,
          'Dumbbell Step-Up',
          'split_squat',
          'unilateral',
          3,
          8,
          .45 + bump,
        ),
      ],
      1 => [
        _topBackoff(
          athlete,
          dedicatedSquat.$1,
          dedicatedSquat.$2,
          'squat',
          .76 + bump,
        ),
        _straight(
          athlete,
          'Barbell Row',
          'barbell_row',
          'horizontal_pull',
          4,
          8,
          .62 + bump,
        ),
        _straight(
          athlete,
          'Front-Rack Reverse Lunge',
          'split_squat',
          'unilateral',
          3,
          8,
          .48 + bump,
        ),
        _bodyweight('Double-Under Skill Practice', 'impact', 5, 20, {
          'impact',
          'calf',
          'coordination',
        }, skill: 'intermediate'),
      ],
      2 => [
        _wave(athlete, dedicatedSquat.$1, dedicatedSquat.$2, 'squat', bump),
        _straight(
          athlete,
          'Bulgarian Split Squat',
          'split_squat',
          'unilateral',
          3,
          8,
          .58 + bump,
        ),
      ],
      3 => [
        _ascending(
          athlete,
          dedicatedSquat.$1,
          dedicatedSquat.$2,
          'squat',
          bump,
        ),
        _straight(
          athlete,
          'Barbell Row',
          'barbell_row',
          'horizontal_pull',
          4,
          8,
          .64 + bump,
        ),
        _straight(
          athlete,
          'Dumbbell Step-Up',
          'split_squat',
          'unilateral',
          3,
          10,
          .46 + bump,
        ),
      ],
      4 => [
        _topBackoff(
          athlete,
          dedicatedSquat.$1,
          dedicatedSquat.$2,
          'squat',
          .79 + bump,
        ),
        _straight(
          athlete,
          'Romanian Deadlift',
          'deadlift',
          'hinge',
          3,
          8,
          .58 + bump,
        ),
        _straight(
          athlete,
          'Rear-Foot-Elevated Split Squat',
          'split_squat',
          'unilateral',
          3,
          8,
          .50 + bump,
        ),
      ],
      _ => [
        _wave(athlete, dedicatedSquat.$1, dedicatedSquat.$2, 'squat', bump),
        _straight(
          athlete,
          'Overhead Squat',
          'overhead_squat',
          'overhead_squat',
          4,
          4,
          .55 + bump,
          skill: 'advanced',
        ),
      ],
    };
    final olympic = switch (rotation) {
      0 => [
        _complex(
          athlete,
          'Hang Power Snatch + Overhead Squat',
          'snatch',
          'olympic_lift',
          .58 + bump,
          5,
          2,
        ),
        _straight(athlete, 'Snatch Pull', 'snatch', 'hinge', 3, 4, .78 + bump),
      ],
      1 => [
        _complex(
          athlete,
          'Power Clean + Split Jerk',
          'clean_and_jerk',
          'olympic_lift',
          .62 + bump,
          6,
          1,
        ),
        _straight(athlete, 'Clean Pull', 'clean', 'hinge', 3, 4, .78 + bump),
      ],
      2 => [
        _ascendingOlympic(athlete, 'Power Snatch', 'snatch', bump),
        _straight(
          athlete,
          'Overhead Squat',
          'overhead_squat',
          'overhead_squat',
          3,
          5,
          .58 + bump,
          skill: 'advanced',
        ),
        _straight(athlete, 'Snatch Pull', 'snatch', 'hinge', 2, 3, .70 + bump),
      ],
      3 => [
        _complex(
          athlete,
          'Squat Clean + Push Jerk',
          'clean_and_jerk',
          'olympic_lift',
          .65 + bump,
          5,
          2,
        ),
        _bodyweight('Front-Rack Carry', 'carry', 4, 30, {
          'front_rack',
          'grip',
          'core',
        }),
      ],
      4 => [
        _waveOlympic(athlete, 'Squat Snatch', 'snatch', bump),
        _straight(athlete, 'Snatch Pull', 'snatch', 'hinge', 3, 3, .85 + bump),
      ],
      _ => [
        _ascendingOlympic(
          athlete,
          'Clean + Split Jerk',
          'clean_and_jerk',
          bump,
        ),
        _bodyweight('Front-Rack Carry', 'carry', 4, 30, {
          'front_rack',
          'grip',
          'core',
        }),
      ],
    };
    final upper = switch (rotation) {
      0 => [
        _ascending(
          athlete,
          'Bench Press',
          'bench_press',
          'horizontal_push',
          bump,
        ),
        _bodyweight('Strict Pull-Up', 'vertical_pull', 4, 6, {
          'grip',
          'shoulder',
        }),
      ],
      1 => [
        _topBackoff(
          athlete,
          'Strict Press',
          'strict_press',
          'vertical_push',
          .72 + bump,
        ),
        _bodyweight('Wall-Facing Handstand Hold', 'inversion', 4, 1, {
          'inversion',
          'overhead',
          'shoulder',
          'core',
        }, skill: 'advanced'),
      ],
      2 => [
        _wave(athlete, 'Push Press', 'strict_press', 'vertical_push', bump),
        _straight(
          athlete,
          'Dumbbell Bench Press',
          'bench_press',
          'horizontal_push',
          3,
          10,
          .50 + bump,
        ),
      ],
      3 => [
        _topBackoff(
          athlete,
          'Bench Press',
          'bench_press',
          'horizontal_push',
          .80 + bump,
        ),
        _bodyweight('Ring Dip', 'vertical_push', 4, 6, {
          'shoulder',
          'triceps',
        }, skill: 'intermediate'),
      ],
      4 => [
        _ascending(
          athlete,
          'Strict Press',
          'strict_press',
          'vertical_push',
          bump,
        ),
        _bodyweight('Strict Pull-Up', 'vertical_pull', 5, 5, {
          'grip',
          'shoulder',
        }),
      ],
      _ => [
        _complex(
          athlete,
          'Push Press + Split Jerk',
          'clean_and_jerk',
          'vertical_push',
          .62 + bump,
          5,
          2,
        ),
        _straight(
          athlete,
          'Barbell Row',
          'barbell_row',
          'horizontal_pull',
          4,
          8,
          .65 + bump,
        ),
      ],
    };
    final hinge = switch (rotation) {
      0 => [
        _ascending(athlete, 'Deadlift', 'deadlift', 'hinge', bump),
        _bodyweight('Suitcase Carry', 'carry', 4, 30, {
          'grip',
          'core',
          'unilateral',
        }),
        _bodyweight('Box Jump Power Practice', 'impact', 5, 3, {
          'impact',
          'knee',
          'power',
        }, skill: 'intermediate'),
      ],
      1 => [
        _straight(
          athlete,
          'Romanian Deadlift',
          'deadlift',
          'hinge',
          4,
          8,
          .62 + bump,
        ),
        _bodyweight('Rope-Climb Skill Practice', 'vertical_pull', 5, 1, {
          'grip',
          'core',
        }, skill: 'advanced'),
      ],
      2 => [
        _topBackoff(athlete, 'Deadlift', 'deadlift', 'hinge', .78 + bump),
        _bodyweight('Sandbag Bear-Hug Carry', 'carry', 5, 40, {
          'grip',
          'core',
          'systemic',
        }),
      ],
      3 => [
        _wave(athlete, 'Clean Pull', 'clean', 'hinge', bump),
        _bodyweight('Farmer Carry', 'carry', 5, 40, {'grip', 'core'}),
      ],
      4 => [
        _wave(athlete, 'Deadlift', 'deadlift', 'hinge', bump),
        _bodyweight('Muscle-Up Transition Practice', 'vertical_pull', 5, 3, {
          'grip',
          'shoulder',
          'core',
        }, skill: 'advanced'),
      ],
      _ => [
        _topBackoff(athlete, 'Snatch Pull', 'snatch', 'hinge', .88 + bump),
        _straight(
          athlete,
          'Walking Lunge',
          'split_squat',
          'unilateral',
          3,
          10,
          .45 + bump,
        ),
      ],
    };

    // A second, deliberately light Olympic exposure improves technical
    // frequency without turning another day into a full Olympic session. It is
    // rendered as a secondary block so the compressed version still preserves
    // the day's principal strength adaptation.
    final technique = rotation.isEven
        ? _complex(
            athlete,
            'Hang Clean + Power Clean Technique',
            'clean_and_jerk',
            'olympic_lift',
            .50 + bump,
            3,
            2,
          )
        : _complex(
            athlete,
            'Muscle Snatch + Power Snatch Technique',
            'snatch',
            'olympic_lift',
            .48 + bump,
            3,
            2,
          );
    lower.add(technique);

    final hangingCore = switch (rotation) {
      0 || 3 => _bodyweight(
        'Hanging Knee-Raise Progression',
        'hanging_core',
        3,
        8,
        {'core', 'grip', 'shoulder'},
        skill: 'intermediate',
      ),
      1 || 4 => _bodyweight(
        'Toes-to-Bar Quality Practice',
        'hanging_core',
        4,
        4,
        {'core', 'grip', 'shoulder'},
        skill: 'advanced',
      ),
      _ => _bodyweight('L-Sit Compression Practice', 'core', 4, 1, {
        'core',
        'shoulder',
      }, skill: 'advanced'),
    };
    upper.add(hangingCore);
    if (rotation == 2) {
      upper.add(
        _bodyweight('Handstand Weight-Shift Practice', 'inversion', 4, 6, {
          'inversion',
          'overhead',
          'shoulder',
          'core',
        }, skill: 'advanced'),
      );
    }
    if (rotation == 4) {
      upper.add(
        _bodyweight('Wall-Walk Position Practice', 'inversion', 4, 2, {
          'inversion',
          'overhead',
          'shoulder',
          'core',
        }, skill: 'advanced'),
      );
    }

    // Vertical pressing appears as support volume on the hinge day, separated
    // from the phase's primary upper-body session.
    hinge.add(
      _straight(
        athlete,
        rotation.isEven ? 'Half-Kneeling Dumbbell Press' : 'Landmine Press',
        'strict_press',
        'vertical_push',
        3,
        8,
        .45 + bump,
      ),
    );

    // Low-dose elastic work recurs often enough to retain skill while the
    // impact-day validator prevents dense or back-to-back exposure.
    if (rotation == 2 || rotation == 4) {
      hinge.add(
        _bodyweight('Box Jump Power Practice', 'impact', 4, 3, {
          'impact',
          'knee',
          'power',
        }, skill: 'intermediate'),
      );
    }
    if (rotation == 0 || rotation == 2 || rotation == 3 || rotation == 5) {
      lower.add(
        _bodyweight('Double-Under Skill Practice', 'impact', 5, 20, {
          'impact',
          'calf',
          'coordination',
        }, skill: 'intermediate'),
      );
    }
    if (rotation == 3 || rotation == 5) {
      hinge.add(
        _bodyweight('Rope-Climb Foot-Lock Practice', 'vertical_pull', 3, 3, {
          'grip',
          'core',
        }, skill: 'advanced'),
      );
    }
    return [lower, upper, olympic, hinge];
  }

  /// The lower-strength rotation intentionally differs from the Olympic
  /// rotation. This keeps one dedicated bilateral squat lift per week while
  /// allowing qualified receiving and overhead-position skill work elsewhere.
  /// Deloads alternate Front/Back/Front; week nine shifts to Front Squat so
  /// the complete 12-week phase remains balanced six-to-six.
  static (String, String) _dedicatedSquatForWeek(int phaseWeek) {
    final front = switch (phaseWeek) {
      4 || 9 || 12 => true,
      8 => false,
      _ => ((phaseWeek - 1) % 6).isOdd,
    };
    return front
        ? ('Front Squat', 'front_squat')
        : ('Back Squat', 'back_squat');
  }

  GeneratedDay applyReadiness(GeneratedDay day, Readiness readiness) {
    if (day.isRest || readiness == Readiness.green) return day;
    if (readiness == Readiness.red) {
      return day.copyWith(
        removeStrength: true,
        warmupMinutes: 0,
        warmup: const [],
        accessories: const [],
        equipment: const {},
        conditioning: const ConditioningWork(
          durationMinutes: 20,
          effort: Effort.easy,
          format: 'Optional walking or gentle mobility',
          templateId: 'readiness_red_recovery',
        ),
        isRest: true,
        explanation: [
          ...day.explanation,
          'Red readiness: recovery replaces training.',
        ],
      );
    }
    final original = day.strength;
    final reduced = original == null
        ? null
        : StrengthWork(
            movement: original.movement,
            loadingPattern: original.loadingPattern,
            steps:
                (original.steps.length > 1
                        ? original.steps.take(original.steps.length - 1)
                        : original.steps)
                    .map(
                      (step) => StrengthSet(
                        sets: step.sets > 1 ? step.sets - 1 : 1,
                        reps: step.reps,
                        percent: step.percent - .075,
                      ),
                    )
                    .toList(),
            trainingMaxKey: original.trainingMaxKey,
            trainingMax: original.trainingMax,
            primaryPattern: original.primaryPattern,
            stress: original.stress,
            skill: original.skill,
            prescriptionUnit: original.prescriptionUnit,
          );
    return day.copyWith(
      strength: reduced,
      secondaryStrength: const [],
      conditioning: const ConditioningWork(
        durationMinutes: 20,
        effort: Effort.easy,
        format: 'Conversational-pace cyclical aerobic work',
        prescription: [
          '20:00 easy bike, row, or walk',
          'Keep a conversational pace throughout',
        ],
        movementPatterns: {'cyclical'},
        templateId: 'readiness_yellow_aerobic',
        tasks: [
          WorkoutTask(
            movement: 'easy cyclical movement',
            quantities: [PrescriptionQuantity(1200, PrescriptionUnit.seconds)],
          ),
        ],
      ),
      accessories: day.accessories.isEmpty ? const [] : [day.accessories.first],
      explanation: [
        ...day.explanation,
        'Yellow readiness: load and volume reduced.',
      ],
    );
  }

  GeneratedDay adaptFromFeedback(
    GeneratedDay nextDay,
    SessionFeedback feedback,
  ) {
    final adapted = applyReadiness(nextDay, feedback.nextReadiness);
    if (feedback.pain || feedback.techniqueBreakdown) {
      return adapted.copyWith(
        explanation: [
          ...adapted.explanation,
          'Pain or technique breakdown was reported. Training is stopped; '
              'seek appropriate professional assessment if symptoms are sharp, '
              'worsening, or persistent.',
        ],
      );
    }
    return adapted;
  }

  static GeneratedDay _trainingDay(
    WorkoutTemplateLibrary library,
    int phaseWeek,
    bool deload,
    DateTime date,
    DayRole role,
    String title,
    StrengthWork strength,
    ConditioningWork conditioning, {
    List<StrengthWork> secondaryStrength = const [],
  }) {
    final content = library.forRole(
      _roleKey(role),
      phaseWeek: phaseWeek,
      conditioningMinutes: conditioning.durationMinutes,
      deload: deload,
    );
    final orderedSecondary = [...secondaryStrength]
      ..sort((a, b) => _executionPriority(a).compareTo(_executionPriority(b)));
    final allMovements = {
      strength.movement.toLowerCase(),
      ...orderedSecondary.map((work) => work.movement.toLowerCase()),
    };
    final nonDuplicativeAccessories = content.accessories
        .where(
          (accessory) => !allMovements.any(
            (movement) => accessory.toLowerCase().contains(movement),
          ),
        )
        .toList(growable: false);
    final conditioningLevels = _conditioningLevelOptions(content);
    final ascendant = conditioningLevels.firstWhere(
      (option) => option.level == WorkoutLevel.ascendant,
    );
    return GeneratedDay(
      date: date,
      role: role,
      title: _questTitle(phaseWeek, content.conditioningTemplateId),
      warmupMinutes: content.warmupMinutes,
      warmup: _specificWarmup(strength),
      strength: strength,
      secondaryStrength: orderedSecondary,
      accessories: nonDuplicativeAccessories,
      warmupTemplateId: content.warmupTemplateId,
      accessoryTemplateId: content.accessoryTemplateId,
      equipment: content.equipment,
      conditioning: ConditioningWork(
        durationMinutes: conditioning.durationMinutes,
        effort: _effortForTemplate(
          content.conditioningTemplateId,
          conditioning.effort,
          deload: deload,
        ),
        format: _formatForTemplate(content.conditioningTemplateId),
        prescription: ascendant.prescription,
        rxStandards: ascendant.standards,
        level: ascendant.level,
        levelOptions: conditioningLevels,
        movementPatterns: content.conditioningPatterns,
        templateId: content.conditioningTemplateId,
        energySystem: _energySystemFor(
          role,
          _effortForTemplate(
            content.conditioningTemplateId,
            conditioning.effort,
            deload: deload,
          ),
          content.conditioningPatterns,
          content.conditioningTemplateId,
        ),
        workSeconds: _workSecondsFor(content.conditioningTemplateId),
        restSeconds: _restSecondsFor(content.conditioningTemplateId),
        targetCompletionMinutes: content.conditioningTargetMinutes,
        stationTargetSeconds: content.conditioningStationTargetSeconds,
        tasks: _tasksFromLines(
          ascendant.prescription,
          durationMinutes: conditioning.durationMinutes,
          workSeconds: _workSecondsFor(content.conditioningTemplateId),
          restSeconds: _restSecondsFor(content.conditioningTemplateId),
        ),
      ),
      isRest: false,
      explanation: const ['Generated from the current phase progression.'],
    );
  }

  static List<String> _specificWarmup(StrengthWork primary) {
    final names = primary.movement.toLowerCase();
    if (names.contains('snatch') || names.contains('overhead squat')) {
      return [
        '2 rounds at an unhurried pace:',
        '90 seconds easy row or SkiErg',
        '8 Cossack squats, alternating sides',
        '6 snatch-grip press-behind-neck with an empty bar',
        '6 overhead squats with a 2-second bottom pause',
        'Then complete: 5 muscle snatches + 5 snatch pulls',
        'Finish with 4 gradual sets of today’s exact lift or complex',
        if (primary.primaryPattern == 'squat')
          'After technique work, complete 3 gradual sets of ${primary.movement}',
      ];
    }
    if (names.contains('clean') || names.contains('jerk')) {
      return [
        '2 rounds at an unhurried pace:',
        '90 seconds easy bike or row',
        '6 front-rack reverse lunges, alternating sides',
        '6 tall cleans with an empty bar',
        '5 clean pulls with a 1-second pause at the knee',
        '6 jerk footwork repetitions without load',
        'Finish with 4 gradual sets of today’s exact lift or complex',
        if (primary.primaryPattern == 'squat')
          'After technique work, complete 3 gradual sets of ${primary.movement}',
      ];
    }
    if (primary.primaryPattern == 'squat') {
      return [
        '2 rounds at an unhurried pace:',
        '90 seconds easy row or bike',
        '8 squat-to-stands',
        '8 reverse lunges, alternating sides',
        '10 glute bridges with a 2-second squeeze',
        if (names.contains('row')) '10 light band or ring rows',
        '8 empty-bar ${primary.movement.toLowerCase()} repetitions',
        'Finish with 3 gradual sets of ${primary.movement}',
      ];
    }
    if (primary.primaryPattern == 'horizontal_push' ||
        primary.primaryPattern == 'vertical_push') {
      return [
        '2 rounds at an unhurried pace:',
        '90 seconds easy bike or row',
        '10 band pull-aparts',
        '8 scapular push-ups',
        '8 light ${primary.movement.toLowerCase()} repetitions',
        if (names.contains('pull-up')) '6 controlled scapular pull-ups',
        if (names.contains('handstand'))
          '20 seconds of elevated plank shoulder shifts',
        'Finish with 3 gradual sets of ${primary.movement}',
      ];
    }
    return [
      '2 rounds at an unhurried pace:',
      '90 seconds easy row or bike',
      '8 glute bridges with a 2-second squeeze',
      '8 dead bugs per side',
      '8 empty-bar Romanian deadlifts',
      if (names.contains('carry')) '20-meter light carry with perfect posture',
      if (names.contains('box jump')) '3 low box jumps with a step-down',
      'Finish with 3 gradual sets of ${primary.movement}',
    ];
  }

  static GeneratedDay _restDay(DateTime date, String title) => GeneratedDay(
    date: date,
    role: DayRole.rest,
    title: title,
    warmupMinutes: 0,
    warmup: const [],
    strength: null,
    accessories: const [],
    conditioning: null,
    isRest: true,
    explanation: const ['Recovery is scheduled, not missed work.'],
  );

  static GeneratedDay _capacityDay(DateTime date, int phaseWeek, bool deload) {
    final armWork = phaseWeek.isOdd
        ? [
            'Week $phaseWeek • ${deload ? 2 : 3} x 12 band or cable triceps pressdowns — controlled lockout',
            'Week $phaseWeek • ${deload ? 2 : 3} x 10 hammer curls — controlled lowering',
            'Week $phaseWeek • 2 rounds: 10 dead bugs per side + 30-second side plank per side',
          ]
        : [
            'Week $phaseWeek • ${deload ? 2 : 3} x 10 overhead triceps extensions — long, controlled stretch',
            'Week $phaseWeek • ${deload ? 2 : 3} x 10 supinated curls — controlled lowering',
            'Week $phaseWeek • 2 rounds: 12 AbMat sit-ups + 20-second hollow hold',
          ];
    return GeneratedDay(
      date: date,
      role: DayRole.capacity,
      title: _capacityTitle(phaseWeek),
      warmupMinutes: 8,
      warmup: const [
        '3:00 easy machine work or walk',
        '8 band pull-aparts',
        '8 scapular push-ups',
        '8 dead bugs per side',
      ],
      strength: null,
      secondaryStrength: const [],
      accessories: [...armWork],
      equipment: const {'rower', 'fan_bike', 'running_space', 'ski_erg'},
      conditioning: ConditioningWork(
        durationMinutes: deload ? 20 : 25,
        effort: Effort.easy,
        format: 'Zone 2 aerobic capacity',
        prescription: [
          '${deload ? 20 : 25}:00 easy row, bike, run, or SkiErg',
          'Stay conversational; nasal breathing should be available most of the time',
          'Rotate the modality weekly and do not turn this into intervals',
          'Week $phaseWeek focus: add only enough distance to keep the effort easy',
        ],
        levelOptions: [
          ConditioningLevelOption(
            level: WorkoutLevel.ember,
            prescription: const [
              'Choose a walk or easy bike at conversational effort.',
            ],
          ),
          ConditioningLevelOption(
            level: WorkoutLevel.forge,
            prescription: const [
              'Choose an easy row, bike, run, or SkiErg at conversational effort.',
            ],
          ),
          ConditioningLevelOption(
            level: WorkoutLevel.ascendant,
            prescription: const [
              'Choose the planned modality and stay conversational throughout.',
            ],
          ),
        ],
        movementPatterns: const {'cyclical'},
        templateId: 'capacity_zone2_w$phaseWeek',
        energySystem: EnergySystem.aerobicBase,
        tasks: [
          WorkoutTask(
            movement: 'easy cyclical movement',
            quantities: [
              PrescriptionQuantity(
                (deload ? 20 : 25) * 60.0,
                PrescriptionUnit.seconds,
              ),
            ],
          ),
        ],
      ),
      isRest: false,
      explanation: const [
        'Low-fatigue aerobic base, direct arms, and trunk capacity.',
      ],
      cooldownMinutes: 8,
      cooldown: const [
        '2:00 easy walk and relaxed breathing',
        '2:00 doorway chest stretch, switching sides at 1:00',
        '2:00 forearm and biceps stretch, switching sides at 1:00',
        '2:00 crocodile breathing with long, relaxed exhales',
      ],
    );
  }

  static String _capacityTitle(int phaseWeek) => const [
    'The Astral Alehouse Affair',
    'The Frozen Star Tea Party',
    'The Unicorn Bureau of Fate',
    'The Celestial Crown’s Coffee Break',
    'The Galactic Goblet Gambit',
    'The Moonlight Munchies March',
    'The Crystal Kingdom Casserole',
    'The Starlight Scone Siege',
    'The Thunderforge Tupperware',
    'The Cosmic Crumpet Crusade',
    'The Nebula Noodle Prophecy',
    'The Eternal Breakfast of Doom',
  ][phaseWeek - 1];
  static StrengthWork _work(
    AthleteProfile athlete,
    String movement,
    String key,
    String primaryPattern,
    LoadingPattern loadingPattern,
    List<StrengthSet> steps,
    Set<String> stress, {
    String skill = 'basic',
  }) => StrengthWork(
    movement: movement,
    loadingPattern: loadingPattern,
    steps: steps,
    trainingMaxKey: key,
    trainingMax: athlete.trainingMaxes[key],
    primaryPattern: primaryPattern,
    stress: stress,
    skill: skill,
  );

  static StrengthWork _straight(
    AthleteProfile a,
    String name,
    String key,
    String pattern,
    int sets,
    int reps,
    double percent, {
    String skill = 'basic',
  }) => _work(
    a,
    name,
    key,
    pattern,
    LoadingPattern.straight,
    [StrengthSet(sets: sets, reps: reps, percent: percent)],
    {
      pattern,
      if (pattern == 'olympic_lift') ...{'hinge', 'overhead', 'systemic'},
    },
    skill: skill,
  );

  static StrengthWork _ascending(
    AthleteProfile a,
    String name,
    String key,
    String pattern,
    double bump,
  ) => _work(
    a,
    name,
    key,
    pattern,
    LoadingPattern.ascending,
    [
      StrengthSet(sets: 1, reps: 8, percent: .60 + bump),
      StrengthSet(sets: 1, reps: 6, percent: .67 + bump),
      StrengthSet(sets: 1, reps: 4, percent: .73 + bump),
      StrengthSet(sets: 1, reps: 3, percent: .78 + bump),
    ],
    {pattern, 'systemic'},
  );

  static StrengthWork _topBackoff(
    AthleteProfile a,
    String name,
    String key,
    String pattern,
    double top,
  ) => _work(
    a,
    name,
    key,
    pattern,
    LoadingPattern.topSetBackoff,
    [
      StrengthSet(sets: 1, reps: 4, percent: top),
      StrengthSet(sets: 3, reps: 5, percent: top - .08),
    ],
    {pattern, 'systemic'},
  );

  static StrengthWork _wave(
    AthleteProfile a,
    String name,
    String key,
    String pattern,
    double bump,
  ) => _work(
    a,
    name,
    key,
    pattern,
    LoadingPattern.wave,
    [
      StrengthSet(sets: 1, reps: 5, percent: .66 + bump),
      StrengthSet(sets: 1, reps: 3, percent: .73 + bump),
      StrengthSet(sets: 1, reps: 2, percent: .78 + bump),
      StrengthSet(sets: 1, reps: 5, percent: .69 + bump),
      StrengthSet(sets: 1, reps: 3, percent: .76 + bump),
      StrengthSet(sets: 1, reps: 2, percent: .81 + bump),
    ],
    {pattern, 'systemic'},
  );

  static StrengthWork _complex(
    AthleteProfile a,
    String name,
    String key,
    String pattern,
    double percent,
    int sets,
    int reps,
  ) {
    final lowerName = name.toLowerCase();
    return _work(
      a,
      name,
      key,
      pattern,
      LoadingPattern.complex,
      [StrengthSet(sets: sets, reps: reps, percent: percent)],
      {
        'hinge',
        'knee',
        'grip',
        'systemic',
        if (lowerName.contains('snatch') ||
            lowerName.contains('jerk') ||
            lowerName.contains('overhead'))
          'overhead',
        if (lowerName.contains('clean')) 'front_rack',
      },
      skill: 'advanced',
    );
  }

  static StrengthWork _ascendingOlympic(
    AthleteProfile a,
    String name,
    String key,
    double bump,
  ) => _work(
    a,
    name,
    key,
    'olympic_lift',
    LoadingPattern.ascending,
    [
      StrengthSet(sets: 2, reps: 3, percent: .58 + bump),
      StrengthSet(sets: 2, reps: 2, percent: .64 + bump),
      StrengthSet(sets: 3, reps: 1, percent: .70 + bump),
    ],
    {'hinge', 'knee', 'overhead', 'systemic'},
    skill: 'advanced',
  );

  static StrengthWork _waveOlympic(
    AthleteProfile a,
    String name,
    String key,
    double bump,
  ) => _work(
    a,
    name,
    key,
    'olympic_lift',
    LoadingPattern.wave,
    [
      StrengthSet(sets: 1, reps: 2, percent: .61 + bump),
      StrengthSet(sets: 1, reps: 1, percent: .68 + bump),
      StrengthSet(sets: 1, reps: 2, percent: .63 + bump),
      StrengthSet(sets: 1, reps: 1, percent: .71 + bump),
      StrengthSet(sets: 2, reps: 1, percent: .74 + bump),
    ],
    {'hinge', 'knee', 'overhead', 'systemic'},
    skill: 'advanced',
  );

  static StrengthWork _bodyweight(
    String name,
    String pattern,
    int sets,
    int reps,
    Set<String> stress, {
    String skill = 'basic',
  }) {
    final lower = name.toLowerCase();
    final unit = pattern == 'carry'
        ? PrescriptionUnit.meters
        : lower.contains('double-under') || lower.contains('box jump')
        ? PrescriptionUnit.contacts
        : pattern == 'inversion' || lower.contains('l-sit')
        ? PrescriptionUnit.seconds
        : PrescriptionUnit.reps;
    final quantity = unit == PrescriptionUnit.seconds && reps == 1 ? 20 : reps;
    return StrengthWork(
      movement: name,
      loadingPattern: LoadingPattern.straight,
      steps: [StrengthSet(sets: sets, reps: quantity, percent: 0)],
      trainingMaxKey: '',
      trainingMax: null,
      primaryPattern: pattern,
      stress: stress,
      skill: skill,
      prescriptionUnit: unit,
    );
  }

  static String _roleKey(DayRole role) => switch (role) {
    DayRole.lowerStrength => 'lower_strength',
    DayRole.upperSkill => 'upper_skill',
    DayRole.power => 'power',
    DayRole.fullBody => 'full_body',
    _ => throw ArgumentError.value(
      role,
      'role',
      'role has no workout template',
    ),
  };

  static EnergySystem _energySystemFor(
    DayRole role,
    Effort effort,
    Set<String> patterns,
    String templateId,
  ) {
    if (templateId.contains('vo2')) return EnergySystem.vo2;
    if (templateId.contains('intervals_')) return EnergySystem.threshold;
    if (templateId.contains('steady_')) return EnergySystem.aerobicBase;
    if (effort == Effort.easy) return EnergySystem.aerobicBase;
    if (templateId.contains('for_time') && role == DayRole.power) {
      return EnergySystem.anaerobic;
    }
    if (effort == Effort.hard && role == DayRole.power) {
      return EnergySystem.anaerobic;
    }
    if (patterns.length > 2) return EnergySystem.mixedModal;
    return EnergySystem.threshold;
  }

  static Effort _effortForTemplate(
    String id,
    Effort fallback, {
    required bool deload,
  }) {
    if (deload) return Effort.moderate;
    if (id.contains('steady_')) return Effort.easy;
    if (id.contains('vo2')) return Effort.hard;
    if (id.contains('for_time_') ||
        id.contains('amrap_') ||
        id.contains('emom_') ||
        id.contains('intervals_')) {
      return Effort.moderate;
    }
    return fallback;
  }

  static String _formatForTemplate(String id) {
    if (id.contains('for_time_')) return 'For time';
    if (id.contains('amrap_')) return 'AMRAP';
    if (id.contains('emom_')) return 'EMOM';
    if (id.contains('intervals_')) return 'Intervals';
    if (id.contains('steady_')) return 'Steady aerobic';
    return 'Structured conditioning';
  }

  /// Converts authored display lines into the typed quantities the engine
  /// validates and audits. Display copy remains deliberately human-readable;
  /// unknown coaching lines are ignored rather than guessed at.
  static List<WorkoutTask> _tasksFromLines(
    List<String> lines, {
    required int durationMinutes,
    int? workSeconds,
    int? restSeconds,
  }) {
    final tasks = <WorkoutTask>[];
    for (final line in lines) {
      final text = line.toLowerCase();
      final calories = RegExp(
        r'(\d+)(?:/\d+)?-calorie\s+([a-z ]+)',
      ).firstMatch(text);
      if (calories != null) {
        tasks.add(
          WorkoutTask(
            movement: calories.group(2)!.trim(),
            quantities: [
              PrescriptionQuantity(
                double.parse(calories.group(1)!),
                PrescriptionUnit.calories,
              ),
            ],
          ),
        );
        continue;
      }
      final meters = RegExp(r'(\d+)-meter\s+([a-z ]+)').firstMatch(text);
      if (meters != null) {
        tasks.add(
          WorkoutTask(
            movement: meters.group(2)!.trim(),
            quantities: [
              PrescriptionQuantity(
                double.parse(meters.group(1)!),
                PrescriptionUnit.meters,
              ),
            ],
          ),
        );
        continue;
      }
      final contacts = RegExp(
        r'(\d+)\s+(box jumps|double-unders|shuttle runs)',
      ).firstMatch(text);
      if (contacts != null) {
        tasks.add(
          WorkoutTask(
            movement: contacts.group(2)!,
            quantities: [
              PrescriptionQuantity(
                double.parse(contacts.group(1)!),
                PrescriptionUnit.contacts,
              ),
            ],
          ),
        );
        continue;
      }
      final reps = RegExp(
        r'(\d+)\s+(chest-to-bar pull-ups|pull-ups|toes-to-bar|wall-ball shots|alternating [a-z -]+|power cleans|russian kettlebell swings|sandbag-to-shoulder repetitions|rope climbs?|strict handstand push-ups|lateral burpees over the dumbbell|step-back burpees)',
      ).firstMatch(text);
      if (reps != null) {
        tasks.add(
          WorkoutTask(
            movement: reps.group(2)!,
            quantities: [
              PrescriptionQuantity(
                double.parse(reps.group(1)!),
                PrescriptionUnit.reps,
              ),
            ],
          ),
        );
      }
    }
    RegExpMatch? rounds;
    for (final line in lines) {
      rounds = RegExp(r'(\d+) rounds').firstMatch(line.toLowerCase());
      if (rounds != null) break;
    }
    if (rounds != null) {
      tasks.add(
        WorkoutTask(
          movement: 'round structure',
          quantities: [
            PrescriptionQuantity(
              double.parse(rounds.group(1)!),
              PrescriptionUnit.rounds,
            ),
          ],
        ),
      );
    }
    if (workSeconds != null || restSeconds != null) {
      tasks.add(
        WorkoutTask(
          movement: 'interval clock',
          quantities: const [],
          workSeconds: workSeconds,
          restSeconds: restSeconds,
        ),
      );
    }
    if (tasks.isEmpty) {
      tasks.add(
        WorkoutTask(
          movement: 'conditioning session',
          quantities: [
            PrescriptionQuantity(
              durationMinutes * 60.0,
              PrescriptionUnit.seconds,
            ),
          ],
        ),
      );
    }
    return tasks;
  }

  static int _executionPriority(StrengthWork work) {
    if (work.loadingPattern == LoadingPattern.complex ||
        work.primaryPattern == 'olympic_lift') {
      return 0;
    }
    if (work.skill == 'advanced') return 1;
    return 2;
  }

  static int? _workSecondsFor(String templateId) {
    if (templateId.contains('intervals_180_60')) return 180;
    if (templateId.contains('intervals_120_120') ||
        templateId.contains('intervals_120_60')) {
      return 120;
    }
    if (templateId.contains('intervals_90_30')) return 90;
    if (templateId.contains('intervals_60_60')) return 60;
    if (templateId.contains('intervals_30_30')) return 30;
    if (templateId.contains('emom')) return 45;
    return null;
  }

  static int? _restSecondsFor(String templateId) {
    if (templateId.contains('intervals_120_120')) return 120;
    if (templateId.contains('intervals_180_60') ||
        templateId.contains('intervals_120_60') ||
        templateId.contains('intervals_60_60')) {
      return 60;
    }
    if (templateId.contains('intervals_90_30') ||
        templateId.contains('intervals_30_30')) {
      return 30;
    }
    if (templateId.contains('emom')) return 15;
    return null;
  }

  static GeneratedDay _fitSession(GeneratedDay day, int limit) {
    if (day.isRest || day.estimatedSessionMinutes <= limit) return day;
    var fitted = day;
    while (fitted.accessories.isNotEmpty &&
        fitted.estimatedSessionMinutes > limit) {
      fitted = fitted.copyWith(
        accessories: fitted.accessories
            .take(fitted.accessories.length - 1)
            .toList(),
        explanation: [
          ...fitted.explanation,
          'Optional accessory removed to fit the $limit-minute session.',
        ],
      );
    }
    while (fitted.secondaryStrength.isNotEmpty &&
        fitted.estimatedSessionMinutes > limit) {
      final removable = fitted.secondaryStrength.lastIndexWhere(
        (work) =>
            !((work.trainingMaxKey == 'clean' ||
                    work.trainingMaxKey == 'snatch') &&
                work.movement.toLowerCase().contains('pull')),
      );
      if (removable == -1 && fitted.warmupMinutes > 6) {
        fitted = fitted.copyWith(
          warmupMinutes: fitted.warmupMinutes - 2,
          explanation: [
            ...fitted.explanation,
            'Warm-up shortened to preserve the required Olympic pull in the '
                '$limit-minute session.',
          ],
        );
        continue;
      }
      if (removable == -1) break;
      fitted = fitted.copyWith(
        secondaryStrength: fitted.secondaryStrength
            .take(removable)
            .followedBy(fitted.secondaryStrength.skip(removable + 1))
            .toList(),
        explanation: [
          ...fitted.explanation,
          'Secondary work deferred to fit the $limit-minute session.',
        ],
      );
    }
    if (fitted.estimatedSessionMinutes > limit) {
      throw StateError(
        '${day.title} cannot fit the athlete session limit of $limit minutes.',
      );
    }
    return fitted;
  }

  static GeneratedDay _personalizeDay(
    GeneratedDay day,
    AthleteProfile athlete,
  ) {
    if (day.isRest) return day;
    final work = [
      if (day.strength != null) day.strength!,
      ...day.secondaryStrength,
    ];
    final restricted = work
        .where(
          (item) => athlete.restrictedPatterns.contains(item.primaryPattern),
        )
        .toList();
    if (restricted.isNotEmpty) {
      throw StateError(
        '${day.title} contains restricted pattern '
        '${restricted.first.primaryPattern}; a reviewed substitution is required.',
      );
    }

    final qualifiedPrimary = day.strength == null
        ? null
        : _qualifiedWork(day.strength!, athlete);
    final qualifiedSecondary = day.secondaryStrength
        .map((item) => _qualifiedWork(item, athlete))
        .toList(growable: false);
    var personalized = day.copyWith(
      strength: qualifiedPrimary,
      secondaryStrength: qualifiedSecondary,
      conditioning: _personalizeConditioningPace(
        _qualifiedConditioning(day.conditioning!, athlete),
        athlete,
      ),
    );
    final missing = personalized.equipment
        .difference(athlete.availableEquipment)
        .toList();
    for (final equipment in missing) {
      personalized = _substituteEquipment(
        personalized,
        equipment,
        athlete.availableEquipment,
      );
    }
    return _withCooldown(personalized);
  }

  static GeneratedDay _withCooldown(GeneratedDay day) {
    if (day.isRest) return day;
    // Cooldown selection remains anchored to the day's loaded work. The wider
    // ledger is for cumulative safety review, not a reason to let a warmup
    // mention displace the primary training tissues from recovery work.
    final selected = <String, double>{};
    for (final entry in day.dose.values.entries) {
      for (final source in [
        TissueDoseSource.direct,
        TissueDoseSource.secondary,
      ]) {
        final prefix = 'tissue_${source.name}_';
        if (entry.key.startsWith(prefix)) {
          final tissue = entry.key.substring(prefix.length);
          selected.update(
            tissue,
            (value) => value + entry.value,
            ifAbsent: () => entry.value,
          );
        }
      }
    }
    final tissues = selected.entries.toList()
      ..sort((a, b) {
        final dose = b.value.compareTo(a.value);
        return dose != 0 ? dose : a.key.compareTo(b.key);
      });
    final stretches = <String>[];
    final used = <String>{};
    for (final tissue in tissues) {
      final stretch = _stretchFor(tissue.key);
      if (stretch != null && used.add(stretch)) stretches.add(stretch);
      if (stretches.length == 4) break;
    }
    const fallback = [
      '2:00 relaxed child’s pose with long exhales',
      '2:00 supine breathing with feet elevated',
      '2:00 gentle half-kneeling hip-flexor stretch, switching at 1:00',
      '2:00 easy open-book rotations, switching at 1:00',
    ];
    for (final stretch in fallback) {
      if (stretches.length == 4) break;
      if (used.add(stretch)) stretches.add(stretch);
    }
    return day.copyWith(cooldownMinutes: 8, cooldown: stretches);
  }

  static String? _stretchFor(String tissue) => switch (tissue) {
    'quads' => '2:00 couch stretch for the quadriceps, switching sides at 1:00',
    'glutes' ||
    'abductors' => '2:00 supine figure-four stretch, switching sides at 1:00',
    'hamstrings' => '2:00 supported hamstring stretch, switching sides at 1:00',
    'adductors' => '2:00 gentle adductor rock-backs, alternating sides',
    'calves_soleus' ||
    'feet_ankles' => '2:00 bent-knee calf stretch, switching sides at 1:00',
    'hip_flexors' =>
      '2:00 half-kneeling hip-flexor stretch, switching sides at 1:00',
    'erectors_lower_back' =>
      '2:00 relaxed child’s pose with slow lateral reaches',
    'trunk_bracing' ||
    'abdominals' => '2:00 crocodile breathing with long, relaxed exhales',
    'lats' ||
    'upper_back' => '2:00 bench-supported lat stretch with slow breathing',
    'traps' => '2:00 gentle upper-trap and neck release, alternating sides',
    'shoulders' =>
      '2:00 cross-body posterior-shoulder stretch, switching at 1:00',
    'chest' => '2:00 doorway chest stretch, switching sides at 1:00',
    'triceps' => '2:00 overhead triceps stretch, switching sides at 1:00',
    'biceps' ||
    'grip' => '2:00 forearm flexor and biceps stretch, switching sides at 1:00',
    _ => null,
  };

  static StrengthWork _qualifiedWork(
    StrengthWork work,
    AthleteProfile athlete,
  ) {
    final requirement = _qualificationFor(work);
    if (requirement == null || athlete.qualifications.contains(requirement)) {
      return work;
    }
    final sets = work.sets.clamp(2, 4);
    return switch (requirement) {
      SkillQualification.olympicLifting => _regression(
        'Dumbbell Jump-Shrug Technique',
        'power',
        sets,
        5,
        {'hinge', 'power', 'core'},
      ),
      SkillQualification.overheadSquat => _regression(
        'Goblet Squat to Box',
        'squat',
        sets,
        6,
        {'knee', 'core'},
      ),
      SkillQualification.hangingCore => _regression(
        'Dead-Bug Quality Practice',
        'core',
        sets,
        6,
        {'core'},
      ),
      SkillQualification.inversion => _regression(
        'Elevated Plank Shoulder-Shift Practice',
        'core',
        sets,
        6,
        {'core', 'shoulder'},
      ),
      SkillQualification.ropeClimb ||
      SkillQualification.muscleUpTransition => _regression(
        'Strict Ring-Row Quality Practice',
        'horizontal_pull',
        sets,
        8,
        {'grip', 'shoulder'},
      ),
      SkillQualification.doubleUnder => _regression(
        'Single-Under Rhythm Practice',
        'impact',
        sets,
        30,
        {'impact', 'calf', 'coordination'},
      ),
      SkillQualification.boxJump => _regression(
        'Low-Box Step-Up Power Practice',
        'unilateral',
        sets,
        5,
        {'knee', 'unilateral'},
      ),
      SkillQualification.ringDip => _regression(
        'Tempo Push-Up Practice',
        'horizontal_push',
        sets,
        6,
        {'shoulder', 'triceps'},
      ),
    };
  }

  static ConditioningWork _qualifiedConditioning(
    ConditioningWork work,
    AthleteProfile athlete,
  ) {
    final ascendant = work.levelOptions.firstWhere(
      (option) => option.level == WorkoutLevel.ascendant,
      orElse: () => ConditioningLevelOption(
        level: WorkoutLevel.ascendant,
        prescription: work.prescription,
        standards: work.rxStandards,
      ),
    );
    final selected =
        athlete.qualifications.containsAll(ascendant.requiredQualifications)
        ? ascendant
        : work.levelOptions.firstWhere(
            (option) => option.level == WorkoutLevel.forge,
          );
    return ConditioningWork(
      durationMinutes: work.durationMinutes,
      effort: work.effort,
      format: work.format,
      prescription: selected.prescription,
      rxStandards: selected.standards,
      level: selected.level,
      levelOptions: work.levelOptions,
      movementPatterns: work.movementPatterns,
      templateId: work.templateId,
      energySystem: work.energySystem,
      workSeconds: work.workSeconds,
      restSeconds: work.restSeconds,
      tasks: work.tasks,
      targetCompletionMinutes: work.targetCompletionMinutes,
      stationTargetSeconds: work.stationTargetSeconds,
    );
  }

  static ConditioningWork _personalizeConditioningPace(
    ConditioningWork work,
    AthleteProfile athlete,
  ) {
    if (work.templateId == null) return work;
    final id = work.templateId!;
    String? target;
    final rowSplit = athlete.benchmarkValues['row_2000_split_seconds'];
    if (rowSplit != null && id.contains('row')) {
      (double, double)? range;
      if (id.contains('intervals_180_60_row')) {
        range = (rowSplit + 2, rowSplit + 4);
      } else if (id.contains('steady_row')) {
        range = (rowSplit + 12, rowSplit + 18);
      } else if (id.contains('intervals_30_30_row')) {
        range = (rowSplit - 10, rowSplit - 7);
      }
      if (range != null) {
        target =
            'PERSONAL TARGET • ${_formatSplit(range.$1)}–${_formatSplit(range.$2)} /500 m';
      }
    }
    final skiSplit = athlete.benchmarkValues['ski_750_split_seconds'];
    if (target == null && skiSplit != null && id.contains('ski')) {
      final fastIntervals = id.contains('intervals_90_30');
      final low = skiSplit + (fastIntervals ? 3 : 8);
      final high = skiSplit + (fastIntervals ? 7 : 15);
      target =
          'PERSONAL TARGET • ${_formatSplit(low)}–${_formatSplit(high)} /500 m';
    }
    final run400 = athlete.benchmarkValues['run_400_seconds'];
    final runMile = athlete.benchmarkValues['run_mile_seconds'];
    if (target == null &&
        id.contains('run') &&
        (run400 != null || runMile != null)) {
      final repeat400 = switch ((run400, runMile)) {
        (final sprint?, final mile?) => math.max(sprint * 1.12, mile / 4 * .92),
        (final sprint?, null) => sprint * 1.12,
        (null, final mile?) => mile / 4 * .92,
        _ => throw StateError('A running benchmark was expected.'),
      };
      target =
          'PERSONAL REFERENCE • Repeatable 400 m near ${_formatSplit(repeat400)}; adjust for terrain and turns';
    }
    final bikeCalories = athlete.benchmarkValues['bike_10min_calories'];
    if (target == null && id.contains('bike') && bikeCalories != null) {
      final perMinute = bikeCalories / 10;
      target =
          'PERSONAL REFERENCE • Sustainable work near ${(perMinute * .75).toStringAsFixed(1)}–${(perMinute * .85).toStringAsFixed(1)} cal/min on the tested bike';
    }
    final hasTestableModality = const [
      'row',
      'ski',
      'run',
      'bike',
    ].any(id.contains);
    if (target == null && hasTestableModality) {
      target = switch (work.effort) {
        Effort.easy => 'EFFORT TARGET • RPE 3–4; conversational throughout',
        Effort.moderate => 'EFFORT TARGET • RPE 5–6; controlled and repeatable',
        Effort.hard =>
          'EFFORT TARGET • RPE 7–8; hard but never an all-out test',
      };
    }
    if (target == null) return work;
    return ConditioningWork(
      durationMinutes: work.durationMinutes,
      effort: work.effort,
      format: work.format,
      prescription: [...work.prescription, target],
      rxStandards: work.rxStandards,
      level: work.level,
      levelOptions: work.levelOptions,
      movementPatterns: work.movementPatterns,
      templateId: work.templateId,
      energySystem: work.energySystem,
      workSeconds: work.workSeconds,
      restSeconds: work.restSeconds,
      tasks: work.tasks,
      targetCompletionMinutes: work.targetCompletionMinutes,
      stationTargetSeconds: work.stationTargetSeconds,
    );
  }

  static String _formatSplit(double seconds) {
    final rounded = seconds.round().clamp(1, 5999);
    final minutes = rounded ~/ 60;
    final remainder = rounded % 60;
    return '$minutes:${remainder.toString().padLeft(2, '0')}';
  }

  static List<ConditioningLevelOption> _conditioningLevelOptions(
    WorkoutContentTemplate content,
  ) {
    const chestToBarMarker = '__chest_to_bar_pull_ups__';
    final rx = content.conditioningPrescription
        .map(
          (line) => line
              .replaceAll('chest-to-bar pull-ups', chestToBarMarker)
              .replaceAll('pull-ups', 'chest-to-bar pull-ups')
              .replaceAll(chestToBarMarker, 'chest-to-bar pull-ups'),
        )
        .toList(growable: false);
    final lower = rx.join(' ').toLowerCase();
    final requirements = <SkillQualification>{
      if (lower.contains('toes-to-bar')) SkillQualification.hangingCore,
      if (lower.contains('handstand push-up')) SkillQualification.inversion,
      if (lower.contains('muscle-up')) SkillQualification.muscleUpTransition,
      if (lower.contains('rope climb')) SkillQualification.ropeClimb,
      if (lower.contains('double-under')) SkillQualification.doubleUnder,
      if (lower.contains('box jump')) SkillQualification.boxJump,
      if (lower.contains('power clean')) SkillQualification.olympicLifting,
    };
    List<String> regress(
      List<String> lines,
      Map<String, String> replacements,
    ) => [
      for (final line in lines)
        replacements.entries.fold(
          line,
          (value, entry) => value.replaceAll(entry.key, entry.value),
        ),
    ];
    final forge = regress(rx, const {
      'strict handstand push-ups': 'pike push-ups',
      'chest-to-bar pull-ups': '__pull_ups__',
      'bar muscle-ups': '__pull_ups__',
      'pull-ups': 'band-assisted pull-ups',
      '__pull_ups__': 'pull-ups',
      'rope climb': 'rope pulls from the floor',
      'toes-to-bar': 'knees-to-elbows',
      'double-unders': 'high-jumping single-unders',
      'box jumps': 'low-box step-ups',
      'power cleans': 'dumbbell power cleans',
    });
    final ember = regress(forge, const {
      'pike push-ups': 'incline push-ups',
      'pull-ups': 'band-assisted pull-ups',
      'knees-to-elbows': 'hanging knee raises',
      'box jumps': 'box step-ups',
      'high-jumping single-unders': 'line hops',
      'barbell thrusters': 'light dumbbell thrusters',
    });
    List<String> scaleMachineCalories(
      List<String> lines,
      double multiplier,
    ) => [
      for (final line in lines)
        line.replaceAllMapped(RegExp(r'(\d+)(?:/(\d+))?-calorie\b'), (match) {
          String scale(String value) =>
              math.max(1, (int.parse(value) * multiplier).round()).toString();
          final first = scale(match.group(1)!);
          final second = match.group(2);
          return second == null
              ? '$first-calorie'
              : '$first/${scale(second)}-calorie';
        }),
    ];
    // RX machine stations are authored for a 40–45 second work window. Forge
    // caps the same output at roughly 30 seconds; Ember at 20–25 seconds.
    // These are time-budgeted output tiers, not per-workout ad hoc edits.
    const forgeMachineCalorieMultiplier = 2 / 3;
    const emberMachineCalorieMultiplier = 1 / 2;
    // The corpus analysis defines the default gymnastics ladders:
    // band-assisted pull-up -> pull-up -> chest-to-bar and hanging knee raise
    // -> knees-to-elbows -> toes-to-bar. Keep authored reps and move down one
    // skill rung; do not apply a generic rep percentage.
    final forgePrescription = scaleMachineCalories(
      forge,
      forgeMachineCalorieMultiplier,
    );
    final emberPrescription = scaleMachineCalories(
      ember,
      emberMachineCalorieMultiplier,
    );
    List<String> scaleStandards(List<String> standards, bool ember) => [
      for (final line in standards)
        line
            .replaceAll('RX •', ember ? 'EMBER •' : 'FORGE •')
            .replaceAll(
              '♀ 35 lb / ♂ 50 lb',
              ember ? '♀ 10 lb / ♂ 15 lb' : '♀ 20 lb / ♂ 35 lb',
            )
            .replaceAll(
              '♀ 65 lb / ♂ 95 lb',
              ember ? '♀ 35 lb / ♂ 45 lb' : '♀ 45 lb / ♂ 65 lb',
            )
            .replaceAll(
              '♀ 70 lb / ♂ 100 lb',
              ember ? '♀ 25 lb / ♂ 40 lb' : '♀ 50 lb / ♂ 70 lb',
            ),
    ];
    return [
      ConditioningLevelOption(
        level: WorkoutLevel.ember,
        prescription: emberPrescription,
        standards: scaleStandards(content.conditioningRxStandards, true),
      ),
      ConditioningLevelOption(
        level: WorkoutLevel.forge,
        prescription: forgePrescription,
        standards: scaleStandards(content.conditioningRxStandards, false),
      ),
      ConditioningLevelOption(
        level: WorkoutLevel.ascendant,
        prescription: rx,
        standards: content.conditioningRxStandards,
        requiredQualifications: requirements,
      ),
    ];
  }

  /// Workout titles are thematic identifiers, never a preview of the work.
  /// The conditioning template supplies deterministic variety while movement
  /// names remain exclusive to the card prescriptions themselves.
  static String _questTitle(int phaseWeek, String conditioningId) =>
      '${_phaseLegend(phaseWeek)}: ${_sessionLegend(conditioningId)}';

  static String _phaseLegend(int week) => const [
    'The Forge Awakens',
    'Beneath the Astral Crown',
    'Across the Frozen Meridian',
    'The Stormwheel Ascendant',
    'The Violet Citadel',
    'The Starfire Passage',
    'The Obsidian Oath',
    'The Celestial Crucible',
    'The Thunderbound March',
    'The Silver Void',
    'The Last Aurora',
    'The Eternal Forge',
  ][week - 1];

  static String _sessionLegend(String id) {
    if (id.contains('row_threshold')) return 'The Trial of Rising Stars';
    if (id.contains('bike_db_clean_jerk')) return 'The Clockwork Gauntlet';
    if (id.contains('ski_clean_pull')) return 'The Frozen Meridian';
    if (id.contains('run_core')) return 'The Comet’s Measure';
    if (id.contains('row_box_jump')) return 'The Vault of Starlight';
    if (id.contains('fan_bike_vo2')) return 'The Tempest Circuit';
    if (id.contains('db_snatch_burpee')) return 'The Falling Star Trial';
    if (id.contains('row_toes_to_bar')) return 'The Astral Gate';
    if (id.contains('ski_pullup_lunge')) return 'The Winter Crown';
    if (id.contains('ski_hspu')) return 'The Winter Crown';
    if (id.contains('bike_step_ttb')) return 'The Stormwheel Passage';
    if (id.contains('row_swing')) return 'The Pendulum of Night';
    if (id.contains('bike_sandbag_rope')) return 'The Siege of Radiant Stone';
    if (id.contains('wall_ball_row')) return 'The Meteor Barrage';
    if (id.contains('ski_db_snatch')) return 'The Frostfire Crucible';
    if (id.contains('shuttle')) return 'The Turning Comet';
    if (id.contains('steady_row')) return 'The Long Vigil';
    if (id.contains('thruster_pull')) return 'The High Dominion';
    if (id.contains('ski_muscle_up')) return 'The Frostbound Ascent';
    if (id.contains('ski_threshold')) return 'The Pulse of the Frozen Star';
    if (id.contains('row_reverse_lunge')) return 'The March of Distant Suns';
    if (id.contains('bike_swing_step')) return 'The Stormwheel Relay';
    if (id.contains('sled_push_pull')) return 'The Endless Citadel';
    if (id.contains('row_wall_ball_chest')) return 'The Starfall Barrage';
    if (id.contains('row_power')) return 'The Twin Trials of Velocity';
    return 'The Ascendant Trial';
  }

  static SkillQualification? _qualificationFor(StrengthWork work) {
    final name = work.movement.toLowerCase();
    if (work.primaryPattern == 'olympic_lift' ||
        name.contains('snatch') ||
        name.contains('clean') ||
        name.contains('jerk')) {
      return SkillQualification.olympicLifting;
    }
    if (work.primaryPattern == 'overhead_squat') {
      return SkillQualification.overheadSquat;
    }
    if (work.primaryPattern == 'hanging_core') {
      return SkillQualification.hangingCore;
    }
    if (work.primaryPattern == 'inversion') return SkillQualification.inversion;
    if (name.contains('rope-climb')) return SkillQualification.ropeClimb;
    if (name.contains('muscle-up')) {
      return SkillQualification.muscleUpTransition;
    }
    if (name.contains('double-under')) return SkillQualification.doubleUnder;
    if (name.contains('box jump')) return SkillQualification.boxJump;
    if (name.contains('ring dip')) return SkillQualification.ringDip;
    if (work.skill == 'advanced') return SkillQualification.hangingCore;
    return null;
  }

  static StrengthWork _regression(
    String movement,
    String pattern,
    int sets,
    int reps,
    Set<String> stress,
  ) => StrengthWork(
    movement: movement,
    loadingPattern: LoadingPattern.straight,
    steps: [StrengthSet(sets: sets, reps: reps, percent: 0)],
    trainingMaxKey: '',
    trainingMax: null,
    primaryPattern: pattern,
    stress: stress,
    skill: 'basic',
  );

  static GeneratedDay _substituteEquipment(
    GeneratedDay day,
    String missing,
    Set<String> available,
  ) {
    final replacement = switch (missing) {
      'rower' when available.contains('ski_erg') => ('ski_erg', 'SkiErg'),
      'rower' when available.contains('fan_bike') => ('fan_bike', 'fan bike'),
      'ski_erg' when available.contains('rower') => ('rower', 'row'),
      'fan_bike' when available.contains('rower') => ('rower', 'row'),
      'sandbag' when available.contains('dumbbells') => (
        'dumbbells',
        'dumbbell',
      ),
      'kettlebell' when available.contains('dumbbells') => (
        'dumbbells',
        'dumbbell',
      ),
      _ => null,
    };
    if (replacement == null) {
      throw StateError(
        '${day.title} requires unavailable $missing and has no reviewed '
        'stimulus-preserving substitution.',
      );
    }
    final conditioning = day.conditioning!;
    final missingLabel = switch (missing) {
      'rower' => 'row',
      'ski_erg' => 'SkiErg',
      'fan_bike' => 'fan bike',
      'sandbag' => 'sandbag',
      'kettlebell' => 'kettlebell',
      _ => missing,
    };
    return day.copyWith(
      equipment: {
        ...day.equipment.where((item) => item != missing),
        replacement.$1,
      },
      conditioning: ConditioningWork(
        durationMinutes: conditioning.durationMinutes,
        effort: conditioning.effort,
        format: conditioning.format,
        prescription: conditioning.prescription
            .map((line) => line.replaceAll(missingLabel, replacement.$2))
            .toList(growable: false),
        rxStandards: conditioning.rxStandards,
        level: conditioning.level,
        levelOptions: conditioning.levelOptions,
        movementPatterns: conditioning.movementPatterns,
        templateId:
            '${conditioning.templateId}_sub_${missing}_to_${replacement.$1}',
        energySystem: conditioning.energySystem,
        workSeconds: conditioning.workSeconds,
        restSeconds: conditioning.restSeconds,
        tasks: conditioning.tasks,
        targetCompletionMinutes: conditioning.targetCompletionMinutes,
        stationTargetSeconds: conditioning.stationTargetSeconds,
      ),
      explanation: [
        ...day.explanation,
        '$missing replaced with ${replacement.$1}; all validators rerun.',
      ],
    );
  }

  static void _validateRollingPhase(GeneratedPhase phase) {
    const caps = <String, Map<int, double>>{
      'systemic': {7: 32, 14: 58, 28: 108},
      'hinge': {7: 34, 14: 62, 28: 116},
      'overhead': {7: 30, 14: 56, 28: 104},
      'grip': {7: 36, 14: 68, 28: 126},
      'impact': {7: 25, 14: 45, 28: 82},
      // The fifth-day capacity session is intentionally easy Zone 2 rather
      // than another hard metcon; its planned aerobic dose is allowed above
      // the former four-day ceiling while all local tissue caps remain intact.
      'conditioning': {7: 48, 14: 88, 28: 168},
      // Source-qualified tissue caps deliberately leave room for the varied
      // phase while preventing one source from silently dominating a window.
      'tissue_direct_quads': {7: 22, 14: 40, 28: 74},
      'tissue_direct_shoulders': {7: 20, 14: 36, 28: 68},
      'tissue_secondary_upper_back': {7: 18, 14: 34, 28: 64},
      'tissue_isometric_trunk_bracing': {7: 24, 14: 44, 28: 82},
      'tissue_conditioning_grip': {7: 28, 14: 52, 28: 98},
      'tissue_conditioning_feet_ankles': {7: 24, 14: 44, 28: 82},
    };
    final days = phase.days;
    for (final cap in caps.entries) {
      for (final window in cap.value.entries) {
        for (var end = window.key; end <= days.length; end++) {
          final total = days
              .sublist(end - window.key, end)
              .fold<double>(0, (sum, day) => sum + day.dose[cap.key]);
          if (total > window.value) {
            throw StateError(
              'Rolling ${window.key}-day ${cap.key} dose '
              '${total.toStringAsFixed(1)} exceeds ${window.value}.',
            );
          }
        }
      }
    }

    const fatigueCaps = <String, Map<int, double>>{
      'primary_work': {7: 24, 14: 44, 28: 82},
      'secondary_work': {7: 30, 14: 56, 28: 104},
      'technique': {7: 30, 14: 56, 28: 104},
      'accessories': {7: 18, 14: 34, 28: 62},
      // Includes the intentionally easy fifth-day Zone 2 capacity session.
      'conditioning': {7: 48, 14: 88, 28: 168},
      'impact': {7: 42, 14: 78, 28: 144},
      'grip': {7: 50, 14: 94, 28: 174},
      'overhead': {7: 44, 14: 82, 28: 152},
      'hinge': {7: 52, 14: 96, 28: 178},
      'squat': {7: 42, 14: 78, 28: 144},
      'knee': {7: 48, 14: 90, 28: 166},
      'shoulder': {7: 48, 14: 90, 28: 166},
      'elbow': {7: 32, 14: 60, 28: 110},
      'trunk': {7: 64, 14: 120, 28: 222},
      // Includes the deliberately easy fifth-day Zone 2 capacity session;
      // local tissue, joint, and high-intensity limits remain unchanged.
      'systemic': {7: 43, 14: 80, 28: 150},
    };
    for (final cap in fatigueCaps.entries) {
      for (final window in cap.value.entries) {
        for (var end = window.key; end <= days.length; end++) {
          final total = days
              .sublist(end - window.key, end)
              .fold<double>(0, (sum, day) => sum + day.fatigue[cap.key]);
          if (total > window.value) {
            throw StateError(
              'Rolling ${window.key}-day weighted ${cap.key} fatigue '
              '${total.toStringAsFixed(1)} exceeds ${window.value}.',
            );
          }
        }
      }
    }

    for (var week = 4; week <= 12; week += 4) {
      final prior = phase.weeks[week - 2].days.fold<double>(
        0,
        (sum, day) => sum + day.dose['systemic'] + day.dose['conditioning'],
      );
      final deload = phase.weeks[week - 1].days.fold<double>(
        0,
        (sum, day) => sum + day.dose['systemic'] + day.dose['conditioning'],
      );
      if (deload >= prior * .85) {
        throw StateError('Week $week does not provide a full-system deload.');
      }
    }
  }

  static void _validateWeek(GeneratedWeek week) {
    final trainingDays = week.days
        .where((day) => !day.isRest)
        .toList(growable: false);
    const expectedTrainingWeekdays = {
      DateTime.monday,
      DateTime.tuesday,
      DateTime.thursday,
      DateTime.friday,
      DateTime.saturday,
    };
    final distinctDates = trainingDays
        .map((day) => DateTime(day.date.year, day.date.month, day.date.day))
        .toSet();
    final actualTrainingWeekdays = trainingDays
        .map((day) => day.date.weekday)
        .toSet();
    if (trainingDays.length != expectedTrainingWeekdays.length ||
        distinctDates.length != trainingDays.length ||
        actualTrainingWeekdays.length != expectedTrainingWeekdays.length ||
        !actualTrainingWeekdays.containsAll(expectedTrainingWeekdays)) {
      throw StateError(
        'Generated week must place exactly one workout on Monday, Tuesday, '
        'Thursday, Friday, and Saturday.',
      );
    }
    if (week.restDayCount < 2) {
      throw StateError('Generated week must contain at least two rest days.');
    }
    if (week.hardMetconCount > 2) {
      throw StateError('Generated week exceeds the hard-metcon limit.');
    }
    final dedicatedBilateralSquats = week.days
        .where((day) => !day.isRest)
        .expand((day) => [day.strength, ...day.secondaryStrength])
        .whereType<StrengthWork>()
        .where((work) => work.isDedicatedBilateralSquatStrength)
        .toList(growable: false);
    if (dedicatedBilateralSquats.length > 1) {
      throw StateError(
        'Generated week includes multiple dedicated bilateral squat-strength '
        'lifts: ${dedicatedBilateralSquats.map((work) => work.movement).join(', ')}.',
      );
    }
    if (week.phaseWeek % 4 != 0) {
      final olympicPulls = week.days
          .where((day) => !day.isRest)
          .expand((day) => [day.strength, ...day.secondaryStrength])
          .whereType<StrengthWork>()
          .where(
            (work) =>
                (work.trainingMaxKey == 'clean' ||
                    work.trainingMaxKey == 'snatch') &&
                work.movement.toLowerCase().contains('pull'),
          )
          .toList(growable: false);
      final hasOlympicPullRegression = week.days
          .where((day) => !day.isRest)
          .expand((day) => [day.strength, ...day.secondaryStrength])
          .whereType<StrengthWork>()
          .any((work) => work.movement.toLowerCase().contains('jump-shrug'));
      final olympicPullCount = olympicPulls.isEmpty && hasOlympicPullRegression
          ? 1
          : olympicPulls.length;
      if (olympicPullCount != 1) {
        throw StateError(
          'Generated non-deload week must include exactly one Olympic pull '
          'derivative; found $olympicPullCount.',
        );
      }
    }
    for (final day in week.days.where((day) => !day.isRest)) {
      if (day.warmupMinutes < 8 || day.warmup.isEmpty) {
        throw StateError('${day.title} does not have a complete warmup.');
      }
      if (day.estimatedSessionMinutes > 180) {
        throw StateError('${day.title} has an invalid session-time estimate.');
      }
      final conditioning = day.conditioning;
      if (conditioning == null ||
          (day.role != DayRole.capacity &&
              (conditioning.durationMinutes < 12 ||
                  conditioning.durationMinutes > 20)) ||
          conditioning.prescription.isEmpty) {
        throw StateError('${day.title} has incomplete conditioning.');
      }
      if (conditioning.tasks.isEmpty) {
        throw StateError('${day.title} has no typed conditioning tasks.');
      }
      if (conditioning.format == 'For time') {
        final target = conditioning.targetCompletionMinutes;
        if (target == null) {
          throw StateError('${day.title} is missing a for-time target window.');
        }
        final estimate = conditioning.estimatedCompletionMinutes;
        if (estimate < target.$1 * .8 || estimate > target.$2 * 1.3) {
          throw StateError(
            '${day.title} estimates ${estimate.toStringAsFixed(1)} minutes, '
            'outside its ${target.$1}–${target.$2}-minute for-time window.',
          );
        }
      }
      if (conditioning.format == 'EMOM') {
        final movementTasks = conditioning.tasks
            .where((task) => task.movement != 'interval clock')
            .toList();
        final targets = conditioning.stationTargetSeconds;
        if (targets.length != movementTasks.length ||
            targets.any(
              (target) =>
                  target.$1 < 15 || target.$1 > target.$2 || target.$2 > 50,
            )) {
          throw StateError(
            '${day.title} has invalid EMOM station work windows '
            '(${movementTasks.length} tasks, ${targets.length} targets).',
          );
        }
      }
      for (final task in conditioning.tasks) {
        if (task.movement.trim().isEmpty ||
            task.quantities.any((quantity) => quantity.value <= 0) ||
            ((task.workSeconds == null) != (task.restSeconds == null))) {
          throw StateError('${day.title} has an ambiguous typed task.');
        }
      }
      if (conditioning.effort == Effort.hard &&
          [
            if (day.strength != null) day.strength!,
            ...day.secondaryStrength,
          ].any(
            (work) =>
                conditioning.movementPatterns.contains(work.primaryPattern),
          )) {
        throw StateError(
          '${day.title} duplicates primary fatigue in a hard metcon.',
        );
      }
      for (final work in [
        if (day.strength != null) day.strength!,
        ...day.secondaryStrength,
      ]) {
        if (work.steps.isEmpty ||
            work.steps.any(
              (step) =>
                  step.sets < 1 ||
                  step.reps < 1 ||
                  step.percent < 0 ||
                  step.percent > 1,
            )) {
          throw StateError(
            '${work.movement} has an invalid loading prescription.',
          );
        }
        if (work.skill == 'advanced' &&
            (work.prescriptionUnit == PrescriptionUnit.reps ||
                work.prescriptionUnit == PrescriptionUnit.contacts) &&
            work.loadingPattern == LoadingPattern.straight &&
            work.sets * work.reps > 30) {
          throw StateError(
            '${work.movement} exceeds the advanced-skill quality cap.',
          );
        }
      }
    }
    final impactDays = week.days.where((day) {
      final conditioningImpact =
          day.conditioning?.movementPatterns.contains('impact') ?? false;
      final strengthImpact =
          day.strength != null &&
          [
            day.strength!,
            ...day.secondaryStrength,
          ].any((work) => work.stress.contains('impact'));
      return conditioningImpact || strengthImpact;
    }).length;
    if (impactDays > 2) {
      throw StateError(
        'Generated week ${week.phaseWeek} exceeds the high-impact budget '
        'with $impactDays impact days.',
      );
    }
    for (var index = 1; index < week.days.length; index++) {
      final previous = week.days[index - 1].conditioning;
      final current = week.days[index].conditioning;
      if (previous?.effort == Effort.hard && current?.effort == Effort.hard) {
        throw StateError('Hard conditioning days may not be consecutive.');
      }
    }
    for (var index = 1; index < week.days.length; index++) {
      final previous = week.days[index - 1];
      final current = week.days[index];
      final previousConditioning = previous.conditioning;
      if (previousConditioning == null || current.isRest) continue;
      final substantialPressingConditioning =
          previousConditioning.durationMinutes >= 12 &&
          (previousConditioning.movementPatterns.contains('vertical_push') ||
              previousConditioning.movementPatterns.contains('inversion'));
      if (substantialPressingConditioning &&
          current.strength?.primaryPattern == 'vertical_push') {
        throw StateError(
          '${current.title} schedules primary vertical pressing immediately '
          'after substantial pressing conditioning.',
        );
      }
    }
  }
}
