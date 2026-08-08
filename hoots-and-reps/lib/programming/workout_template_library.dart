/// Independently authored workout content approved for deterministic expansion.
class WorkoutContentTemplate {
  const WorkoutContentTemplate({
    required this.warmupTemplateId,
    required this.accessoryTemplateId,
    required this.conditioningTemplateId,
    required this.warmupMinutes,
    required this.warmup,
    required this.accessories,
    required this.conditioningPrescription,
    this.conditioningRxStandards = const [],
    this.conditioningTargetMinutes,
    this.conditioningStationTargetSeconds = const [],
    required this.conditioningPatterns,
    required this.equipment,
  });

  final String warmupTemplateId;
  final String accessoryTemplateId;
  final String conditioningTemplateId;
  final int warmupMinutes;
  final List<String> warmup;
  final List<String> accessories;
  final List<String> conditioningPrescription;
  final List<String> conditioningRxStandards;
  final (int, int)? conditioningTargetMinutes;

  /// Per-station work windows for EMOMs, in the same order as the movement
  /// lines. These are part of the authored dose, not a generic clock default.
  final List<(int, int)> conditioningStationTargetSeconds;
  final Set<String> conditioningPatterns;
  final Set<String> equipment;
}

class _ConditioningRecipe {
  const _ConditioningRecipe({
    required this.id,
    required this.prescription,
    required this.patterns,
    required this.equipment,
    this.targetCompletionMinutes,
    this.stationTargetSeconds = const [],
  });

  final String id;
  final List<String> prescription;
  final Set<String> patterns;
  final Set<String> equipment;
  final (int, int)? targetCompletionMinutes;
  final List<(int, int)> stationTargetSeconds;
}

class WorkoutTemplateLibrary {
  const WorkoutTemplateLibrary();

  WorkoutContentTemplate forRole(
    String role, {
    required int phaseWeek,
    required int conditioningMinutes,
    required bool deload,
  }) {
    final variant = (phaseWeek - 1) % 12;
    final base = switch (role) {
      'lower_strength' => _lower(variant, conditioningMinutes, deload),
      'upper_skill' => _upper(variant, conditioningMinutes, deload),
      'power' => _power(variant, conditioningMinutes, deload),
      'full_body' => _fullBody(variant, conditioningMinutes, deload),
      _ => throw ArgumentError.value(role, 'role', 'unknown workout role'),
    };
    return _withConditioningRotation(
      base,
      role,
      phaseWeek,
      conditioningMinutes,
    );
  }

  static WorkoutContentTemplate _withConditioningRotation(
    WorkoutContentTemplate base,
    String role,
    int phaseWeek,
    int minutes,
  ) {
    final roleIndex = switch (role) {
      'lower_strength' => 0,
      'upper_skill' => 1,
      'power' => 2,
      'full_body' => 3,
      _ => throw ArgumentError.value(role, 'role', 'unknown workout role'),
    };
    final slot = (phaseWeek - 1) * 4 + roleIndex;
    final family = slot % 24;
    final progressed = slot >= 24;
    final add = progressed ? 2 : 0;
    final suffix = '${role}_w$phaseWeek';
    final recipe = switch (family) {
      0 => _ConditioningRecipe(
        id: 'conditioning_intervals_180_60_row_threshold_$suffix',
        prescription: [
          '$minutes-minute row interval session:',
          'Row 3:00 at a moderate-hard but repeatable pace',
          'Row 1:00 very easily',
          'Repeat that 4-minute pattern until the $minutes:00 clock expires',
          'If time expires during an interval, stop immediately',
          'Your final hard interval should stay close to your first',
        ],
        patterns: const {'cyclical', 'horizontal_pull'},
        equipment: const {'rower'},
      ),
      1 => _ConditioningRecipe(
        id: 'conditioning_emom_bike_db_clean_jerk_$suffix',
        prescription: [
          '$minutes-minute alternating EMOM:',
          'Odd: ${15 + add}/${12 + add}-calorie fan bike',
          'Even: ${10 + add} alternating dumbbell clean and jerks',
          'Use one dumbbell and alternate arms after each repetition',
          'Pacing target: finish the bike in 40–45 seconds; keep the dumbbell work unbroken and under 30 seconds',
        ],
        patterns: const {'cyclical', 'hinge', 'vertical_push'},
        equipment: const {'fan_bike', 'dumbbells'},
        stationTargetSeconds: const [(40, 45), (20, 30)],
      ),
      2 => _ConditioningRecipe(
        id: 'conditioning_for_time_ski_clean_pull_$suffix',
        prescription: [
          'For time — 5 rounds, $minutes:00 hard cap:',
          '${12 + add}/${10 + add}-calorie SkiErg',
          '${8 + add} power cleans',
          '${10 + add} chest-to-bar pull-ups',
          'Stop at the cap and record completed rounds plus repetitions',
        ],
        patterns: const {'cyclical', 'hinge', 'vertical_pull'},
        equipment: const {'ski_erg', 'barbell', 'pull_up_rig'},
        targetCompletionMinutes: (11, 15),
      ),
      3 => _ConditioningRecipe(
        id: 'conditioning_steady_run_core_aerobic_$suffix',
        prescription: [
          '$minutes-minute sustainable AMRAP:',
          '${200 + add * 25}-meter run',
          '${8 + add} toes-to-bar',
          'Walk briefly if needed to keep every run repeatable',
        ],
        patterns: const {'cyclical', 'impact', 'hanging_core'},
        equipment: const {'running_space', 'pull_up_rig'},
      ),
      4 => _ConditioningRecipe(
        id: 'conditioning_amrap_row_box_jump_core_$suffix',
        prescription: [
          '$minutes-minute controlled AMRAP:',
          '${12 + add}/${9 + add}-calorie row',
          '${8 + add} box jumps — jump up, stand tall, and step down',
          '${24 + add * 4} double-unders',
          'Keep every landing quiet and repeatable; do not rebound',
        ],
        patterns: const {'cyclical', 'impact', 'coordination'},
        equipment: const {'rower', 'box', 'jump_rope'},
      ),
      5 => _ConditioningRecipe(
        id: 'conditioning_intervals_120_120_fan_bike_vo2_$suffix',
        prescription: [
          '$minutes:00 fan-bike VO2-oriented intervals:',
          '2:00 hard but repeatable fan bike',
          '2:00 very easy fan bike',
          'Repeat until the clock expires; the final hard interval must match the first',
        ],
        patterns: const {'cyclical'},
        equipment: const {'fan_bike'},
      ),
      6 => _ConditioningRecipe(
        id: 'conditioning_for_time_db_snatch_burpee_$suffix',
        prescription: [
          'For time — 6 rounds, $minutes:00 hard cap:',
          '${12 + add} alternating dumbbell snatches',
          '${10 + add} lateral burpees over the dumbbell',
          'Stop at the cap and record completed rounds plus repetitions',
        ],
        patterns: const {'hinge', 'unilateral', 'mixed_bodyweight'},
        equipment: const {'dumbbells'},
        targetCompletionMinutes: (10, 14),
      ),
      7 => _ConditioningRecipe(
        id: 'conditioning_emom_row_toes_to_bar_$suffix',
        prescription: [
          '$minutes-minute alternating EMOM:',
          'Odd: ${15 + add}/${12 + add}-calorie row',
          'Even: ${12 + add} toes-to-bar',
          'Pacing target: finish the row in 40–45 seconds; keep toes-to-bar unbroken or in two quick sets under 30 seconds',
        ],
        patterns: const {'cyclical', 'hanging_core'},
        equipment: const {'rower', 'pull_up_rig'},
        stationTargetSeconds: const [(40, 45), (20, 30)],
      ),
      8 => _ConditioningRecipe(
        id: 'conditioning_amrap_ski_hspu_db_press_$suffix',
        prescription: [
          '$minutes-minute quality AMRAP:',
          '${10 + add}/${8 + add}-calorie SkiErg',
          '${6 + add} strict handstand push-ups',
          '${8 + add} alternating dumbbell push presses',
          'Stop each handstand set before technique changes',
        ],
        patterns: const {'cyclical', 'inversion', 'vertical_push'},
        equipment: const {'ski_erg', 'wall_space', 'dumbbells'},
      ),
      9 => _ConditioningRecipe(
        id: 'conditioning_for_time_bike_step_ttb_$suffix',
        prescription: [
          'For time — 4 rounds, $minutes:00 hard cap:',
          '${14 + add}/${11 + add}-calorie fan bike',
          '${12 + add} alternating box step-overs',
          '${10 + add} toes-to-bar',
          'Stop at the cap and record completed rounds plus repetitions',
        ],
        patterns: const {'cyclical', 'unilateral', 'hanging_core'},
        equipment: const {'fan_bike', 'box', 'pull_up_rig'},
        targetCompletionMinutes: (11, 15),
      ),
      10 => _ConditioningRecipe(
        id: 'conditioning_intervals_120_60_row_swing_$suffix',
        prescription: [
          '$minutes-minute interval session on a repeating 3:00 clock:',
          '2:00 to complete ${10 + add}/${8 + add} calories row + ${10 + add} Russian kettlebell swings',
          '1:00 easy walk and breathing reset',
          'Use a swing load that preserves a crisp hinge',
        ],
        patterns: const {'cyclical', 'hinge'},
        equipment: const {'rower', 'kettlebell'},
      ),
      11 => _ConditioningRecipe(
        id: 'conditioning_emom_bike_sandbag_rope_$suffix',
        prescription: [
          '$minutes-minute rotation at sustainable effort:',
          'Minute 1: ${15 + add}/${12 + add}-calorie fan bike',
          'Minute 2: ${6 + add} sandbag-to-shoulder repetitions, alternating sides',
          'Minute 3: 1 rope climb',
          'Continue until the clock expires; never chase failed repetitions',
          'Pacing target: bike in 40–45 seconds; sandbag and rope-climb minutes in 20–30 seconds',
        ],
        patterns: const {'cyclical', 'odd_object', 'vertical_pull'},
        equipment: const {'fan_bike', 'sandbag', 'rope'},
        stationTargetSeconds: const [(40, 45), (20, 30), (20, 30)],
      ),
      12 => _ConditioningRecipe(
        id: 'conditioning_for_time_wall_ball_row_$suffix',
        prescription: [
          'For time — descending chipper, $minutes:00 hard cap:',
          '${42 + add * 2} wall-ball shots',
          '${32 + add * 2}/${25 + add * 2}-calorie row',
          '${24 + add} wall-ball shots',
          '${16 + add}/${12 + add}-calorie row',
          'Stop at the cap and record the last completed checkpoint',
        ],
        patterns: const {'squat', 'vertical_push', 'cyclical'},
        equipment: const {'wall_ball', 'rower'},
        targetCompletionMinutes: (10, 14),
      ),
      13 => _ConditioningRecipe(
        id: 'conditioning_amrap_ski_db_snatch_step_$suffix',
        prescription: [
          '$minutes-minute controlled AMRAP:',
          '${10 + add}/${8 + add}-calorie SkiErg',
          '${10 + add} alternating dumbbell snatches from the hang',
          '${10 + add} low-box step-overs',
          'Use a load that stays technically identical from first round to last',
        ],
        patterns: const {'cyclical', 'hinge', 'unilateral'},
        equipment: const {'ski_erg', 'dumbbells', 'box'},
      ),
      14 => _ConditioningRecipe(
        id: 'conditioning_intervals_60_60_shuttle_threshold_$suffix',
        prescription: [
          '$minutes-minute shuttle-run interval session:',
          '1:00 strong, controlled 25-foot shuttle runs',
          '1:00 easy walking',
          'Repeat until the clock expires without sprinting the first interval',
        ],
        patterns: const {'cyclical', 'impact'},
        equipment: const {'running_space'},
      ),
      15 => _ConditioningRecipe(
        id: 'conditioning_steady_row_aerobic_$suffix',
        prescription: [
          '$minutes:00 continuous row',
          'Keep a conversational pace throughout',
          'Stroke rate: ${20 + add}–${24 + add} per minute with consistent splits',
        ],
        patterns: const {'cyclical', 'horizontal_pull'},
        equipment: const {'rower'},
      ),
      16 => _ConditioningRecipe(
        id: 'conditioning_for_time_thruster_pull_$suffix',
        prescription: [
          'For time — 5 rounds, $minutes:00 hard cap:',
          '${7 + add} barbell thrusters',
          '${9 + add} chest-to-bar pull-ups',
          '${11 + add}/${9 + add}-calorie fan bike',
          'Stop at the cap and record completed rounds plus repetitions',
        ],
        patterns: const {
          'squat',
          'vertical_push',
          'horizontal_pull',
          'cyclical',
        },
        equipment: const {'barbell', 'pull_up_rig', 'fan_bike'},
        targetCompletionMinutes: (12, 16),
      ),
      17 => _ConditioningRecipe(
        id: 'conditioning_amrap_ski_muscle_up_carry_$suffix',
        prescription: [
          '$minutes-minute quality AMRAP:',
          '${9 + add}/${7 + add}-calorie SkiErg',
          '${3 + add} bar muscle-ups',
          '${40 + add * 5}-meter farmer carry',
          'Keep every muscle-up technically consistent',
        ],
        patterns: const {'cyclical', 'vertical_pull', 'carry'},
        equipment: const {'ski_erg', 'pull_up_rig', 'dumbbells'},
      ),
      18 => _ConditioningRecipe(
        id: 'conditioning_intervals_90_30_ski_threshold_$suffix',
        prescription: [
          '$minutes-minute SkiErg interval session:',
          '1:30 at a strong repeatable pace',
          '0:30 very easy',
          'Repeat until the clock expires; keep power loss under 10%',
        ],
        patterns: const {'cyclical'},
        equipment: const {'ski_erg'},
      ),
      19 => _ConditioningRecipe(
        id: 'conditioning_emom_row_reverse_lunge_$suffix',
        prescription: [
          '$minutes-minute alternating EMOM:',
          'Odd: ${15 + add}/${12 + add}-calorie row',
          'Even: ${16 + add} alternating front-rack dumbbell reverse lunges',
          'Pacing target: row in 40–45 seconds; lunges in 30–40 seconds with at least 15 seconds to transition',
        ],
        patterns: const {'cyclical', 'unilateral'},
        equipment: const {'rower', 'dumbbells'},
        stationTargetSeconds: const [(40, 45), (30, 40)],
      ),
      20 => _ConditioningRecipe(
        id: 'conditioning_for_time_bike_swing_step_$suffix',
        prescription: [
          'For time — chipper, $minutes:00 hard cap:',
          '${35 + add * 2}/${28 + add * 2}-calorie fan bike',
          '${30 + add * 2} Russian kettlebell swings',
          '${24 + add * 2} alternating box step-overs',
          '${12 + add} step-back burpees',
          'Stop at the cap and record the last completed checkpoint',
        ],
        patterns: const {'cyclical', 'hinge', 'unilateral', 'mixed_bodyweight'},
        equipment: const {'fan_bike', 'kettlebell', 'box'},
        targetCompletionMinutes: (10, 14),
      ),
      21 => _ConditioningRecipe(
        id: 'conditioning_amrap_sled_push_pull_$suffix',
        prescription: [
          '$minutes-minute quality AMRAP:',
          '20-meter sled push',
          '20-meter backward sled drag',
          'Rest as needed to keep each trip between 30 and 40 seconds',
        ],
        patterns: const {'locomotion', 'knee', 'posterior_chain'},
        equipment: const {'sled'},
      ),
      22 => _ConditioningRecipe(
        id: 'conditioning_amrap_row_wall_ball_chest_to_bar_$suffix',
        prescription: [
          '$minutes-minute controlled AMRAP:',
          '${10 + add}/${8 + add}-calorie row',
          '${12 + add} wall-ball shots',
          '${6 + add} chest-to-bar pull-ups',
          'Choose a wall-ball load that keeps every set unbroken and smooth',
        ],
        patterns: const {'cyclical', 'squat', 'vertical_push', 'vertical_pull'},
        equipment: const {'rower', 'wall_ball', 'pull_up_rig'},
      ),
      23 => _ConditioningRecipe(
        id: 'conditioning_intervals_30_30_row_power_$suffix',
        prescription: [
          '$minutes-minute row interval session:',
          '0:30 powerful but technically smooth rowing',
          '0:30 very easy rowing',
          'Repeat until the clock expires; no interval may drop more than 10%',
        ],
        patterns: const {'cyclical', 'horizontal_pull'},
        equipment: const {'rower'},
      ),
      _ => throw StateError('Conditioning family $family is invalid.'),
    };
    return WorkoutContentTemplate(
      warmupTemplateId: base.warmupTemplateId,
      accessoryTemplateId: base.accessoryTemplateId,
      conditioningTemplateId: recipe.id,
      warmupMinutes: base.warmupMinutes,
      warmup: base.warmup,
      accessories: base.accessories,
      conditioningPrescription: [
        ...recipe.prescription,
        if (progressed)
          'Progression target: improve total work or average pace by 2–3% without changing the prescribed effort.',
      ],
      conditioningRxStandards: _rxStandards(recipe.id),
      conditioningTargetMinutes: recipe.targetCompletionMinutes,
      conditioningStationTargetSeconds: recipe.stationTargetSeconds,
      conditioningPatterns: recipe.patterns,
      equipment: {...base.equipment, ...recipe.equipment},
    );
  }

  /// Authored baseline standards for the current single RX layer. These are
  /// explicit data, not percentages inferred from an athlete's strength max.
  /// They follow recurring conventions in official CrossFit workouts while
  /// preserving the intended cycleability of each independently authored
  /// conditioning template.
  static List<String> _rxStandards(String templateId) {
    final standards = <String>[];
    if (templateId.contains('box_jump')) {
      standards.add('RX • Box: ♀ 20 in / ♂ 24 in');
    }
    if (templateId.contains('bike_step_core') ||
        templateId.contains('bike_step_ttb') ||
        templateId.contains('bike_box_jump')) {
      standards.add('RX • Box step-over: ♀ 20 in / ♂ 24 in');
    }
    if (templateId.contains('wall_ball')) {
      standards.add('RX • Wall ball: ♀ 14 lb to 9 ft / ♂ 20 lb to 10 ft');
    }
    if (templateId.contains('db_snatch')) {
      standards.add('RX • One dumbbell: ♀ 35 lb / ♂ 50 lb');
      if (templateId.contains('step')) {
        standards.add('RX • Box: ♀ 20 in / ♂ 24 in');
      }
    }
    if (templateId.contains('ski_press_suitcase')) {
      standards.add('RX • One dumbbell: ♀ 25 lb / ♂ 35 lb');
    }
    if (templateId.contains('hspu_db_press')) {
      standards.add('RX • One dumbbell: ♀ 35 lb / ♂ 50 lb');
    }
    if (templateId.contains('thruster_pull')) {
      standards.add('RX • Barbell: ♀ 65 lb / ♂ 95 lb');
    }
    if (templateId.contains('row_reverse_lunge')) {
      standards.add('RX • Two dumbbells: ♀ 25 lb each / ♂ 35 lb each');
    }
    if (templateId.contains('ski_push_carry') ||
        templateId.contains('ski_muscle_up_carry')) {
      standards.add('RX • Farmer carry: ♀ 35 lb each / ♂ 50 lb each');
    }
    if (templateId.contains('row_swing') ||
        templateId.contains('bike_swing_step')) {
      standards.add('RX • Kettlebell: ♀ 35 lb / ♂ 53 lb');
    }
    if (templateId.contains('bike_swing_step')) {
      standards.add('RX • Box step-over: ♀ 20 in / ♂ 24 in');
    }
    if (templateId.contains('bike_carry')) {
      standards.add('RX • Sandbag: ♀ 70 lb / ♂ 100 lb');
    }
    if (templateId.contains('bike_sandbag')) {
      standards.add('RX • Sandbag: ♀ 70 lb / ♂ 100 lb');
    }
    if (templateId.contains('bike_db_clean_jerk')) {
      standards.add('RX • One dumbbell: ♀ 35 lb / ♂ 50 lb');
    }
    if (templateId.contains('sled_push_pull')) {
      standards.add(
        'RX • Sled: ♀ 135 lb / ♂ 180 lb total; use a load that keeps 20 m trips repeatable in 30–40 seconds',
      );
    }
    if (templateId.contains('ski_clean_pull')) {
      standards.add('RX • Power clean: ♀ 65 lb / ♂ 95 lb');
    }
    return standards;
  }

  static WorkoutContentTemplate _lower(int variant, int minutes, bool deload) {
    if (variant == 0) {
      return WorkoutContentTemplate(
        warmupTemplateId: 'lower_warmup_row_1',
        accessoryTemplateId: 'squat_accessory_unilateral_1',
        conditioningTemplateId: 'lower_row_emom_1',
        warmupMinutes: 10,
        warmup: const [
          '2 rounds at an unhurried pace:',
          '2:00 easy row',
          '8 squat-to-stands',
          '10 glute bridges with a 2-second squeeze',
          '8 empty-bar back squats',
          'Then complete 3 gradual squat warmup sets',
        ],
        accessories: deload
            ? const ['2 sets: 8 supported split squats per side']
            : const ['3 sets: 8 supported split squats per side'],
        conditioningPrescription: [
          '$minutes-minute alternating EMOM:',
          'Odd minutes: 10/8-calorie row',
          'Even minutes: 8 dumbbell bench presses + 10 ring rows',
          'Choose loads that leave at least 15 seconds to transition',
        ],
        conditioningPatterns: const {
          'cyclical',
          'horizontal_push',
          'horizontal_pull',
        },
        equipment: const {'rower', 'dumbbells', 'rings'},
      );
    }
    return WorkoutContentTemplate(
      warmupTemplateId: 'lower_warmup_ski_2',
      accessoryTemplateId: 'squat_accessory_posterior_2',
      conditioningTemplateId: 'lower_ski_amrap_2',
      warmupMinutes: 10,
      warmup: const [
        '2 rounds at an unhurried pace:',
        '90 seconds easy SkiErg',
        '8 lateral lunges per side',
        '10 mini-band lateral steps per side',
        '8 empty-bar tempo squats',
        'Then complete 3 gradual squat warmup sets',
      ],
      accessories: deload
          ? const ['2 sets: 10 light Romanian deadlifts']
          : const ['3 sets: 10 light Romanian deadlifts'],
      conditioningPrescription: [
        '$minutes-minute AMRAP at controlled-hard effort:',
        '10/8-calorie SkiErg',
        '8 alternating dumbbell floor presses',
        '10 strict ring rows',
        'Leave 1–2 repetitions in reserve on every upper-body set',
      ],
      conditioningPatterns: const {
        'cyclical',
        'horizontal_push',
        'horizontal_pull',
      },
      equipment: const {'ski_erg', 'dumbbells', 'rings'},
    );
  }

  static WorkoutContentTemplate _upper(int variant, int minutes, bool deload) {
    if (variant == 0) {
      return WorkoutContentTemplate(
        warmupTemplateId: 'upper_warmup_bike_1',
        accessoryTemplateId: 'press_accessory_row_1',
        conditioningTemplateId: 'upper_row_aerobic_1',
        warmupMinutes: 10,
        warmup: const [
          '2 rounds at an unhurried pace:',
          '2:00 easy bike',
          '10 band pull-aparts',
          '8 half-kneeling single-arm presses per side',
          '10 scapular pull-ups or pulldowns',
          'Then complete 3 gradual press warmup sets',
        ],
        accessories: deload
            ? const ['2 sets: 10 one-arm dumbbell rows per side']
            : const ['3 sets: 10 one-arm dumbbell rows per side'],
        conditioningPrescription: [
          '$minutes:00 continuous row',
          'Keep a conversational pace throughout',
          'Stroke rate: 20–24 per minute with consistent splits',
        ],
        conditioningPatterns: const {'cyclical'},
        equipment: const {'bike', 'rower', 'bands', 'dumbbells'},
      );
    }
    final workRounds = minutes ~/ 4;
    return WorkoutContentTemplate(
      warmupTemplateId: 'upper_warmup_row_2',
      accessoryTemplateId: 'press_accessory_pull_2',
      conditioningTemplateId: 'upper_row_intervals_2',
      warmupMinutes: 10,
      warmup: const [
        '2 rounds at an unhurried pace:',
        '90 seconds easy row',
        '8 prone Y-raises',
        '10 banded face pulls',
        '8 empty-bar strict presses',
        'Then complete 3 gradual press warmup sets',
      ],
      accessories: deload
          ? const ['2 sets: 8 controlled chin-ups or pulldowns']
          : const ['3 sets: 8 controlled chin-ups or pulldowns'],
      conditioningPrescription: [
        '$workRounds rounds on a 4:00 clock:',
        '3:00 easy-moderate row at a repeatable split',
        '1:00 very easy row',
        'The final work interval should match the first, not beat it',
      ],
      conditioningPatterns: const {'cyclical'},
      equipment: const {'rower', 'bands', 'pull_up_rig'},
    );
  }

  static WorkoutContentTemplate _power(int variant, int minutes, bool deload) {
    if (variant == 0) {
      final rounds = minutes ~/ 4;
      return WorkoutContentTemplate(
        warmupTemplateId: 'snatch_warmup_bike_1',
        accessoryTemplateId: 'snatch_accessory_trunk_1',
        conditioningTemplateId: 'power_bike_intervals_1',
        warmupMinutes: 12,
        warmup: const [
          '3 rounds, building speed slightly each round:',
          '1:00 easy bike',
          '6 muscle snatches with an empty bar',
          '6 overhead reverse lunges with an empty bar',
          '5 snatch pulls with a 1-second pause at the knee',
          'Then complete 4 gradual snatch warmup sets',
        ],
        accessories: deload
            ? const ['2 sets: 8 controlled back extensions']
            : const ['3 sets: 8 controlled back extensions'],
        conditioningPrescription: [
          '$rounds rounds, each on a 4:00 clock:',
          '10/8-calorie bike',
          '8 hand-release push-ups',
          '40-meter farmer carry',
          'Rest for the remainder of the interval',
        ],
        conditioningPatterns: const {'cyclical', 'horizontal_push', 'carry'},
        equipment: const {'bike', 'dumbbells'},
      );
    }
    final rounds = minutes ~/ 4;
    return WorkoutContentTemplate(
      warmupTemplateId: 'clean_warmup_ski_2',
      accessoryTemplateId: 'clean_accessory_unilateral_2',
      conditioningTemplateId: 'power_ski_intervals_2',
      warmupMinutes: 12,
      warmup: const [
        '3 rounds, building speed slightly each round:',
        '1:00 easy SkiErg',
        '6 clean-grip high pulls with an empty bar',
        '6 tall cleans with an empty bar',
        '6 front-rack step-ups per side',
        'Then complete 4 gradual clean warmup sets',
      ],
      accessories: deload
          ? const ['2 sets: 8 single-leg hip bridges per side']
          : const ['3 sets: 8 single-leg hip bridges per side'],
      conditioningPrescription: [
        '$rounds rounds, each on a 4:00 clock:',
        '10/8-calorie SkiErg',
        '8 box step-overs without added load',
        '6 strict hand-release push-ups',
        'Rest for the remainder of the interval',
      ],
      conditioningPatterns: const {'cyclical', 'locomotion', 'horizontal_push'},
      equipment: const {'ski_erg', 'box'},
    );
  }

  static WorkoutContentTemplate _fullBody(
    int variant,
    int minutes,
    bool deload,
  ) {
    if (variant == 0) {
      final rounds = minutes ~/ 3;
      return WorkoutContentTemplate(
        warmupTemplateId: 'deadlift_warmup_bike_1',
        accessoryTemplateId: 'deadlift_accessory_press_1',
        conditioningTemplateId: 'full_body_bike_emom_1',
        warmupMinutes: 10,
        warmup: const [
          '2 rounds at an unhurried pace:',
          '2:00 easy bike',
          '8 bodyweight good mornings',
          '8 dead bugs per side',
          '8 kettlebell deadlifts with a 2-second lowering phase',
          'Then complete 3 gradual deadlift warmup sets',
        ],
        accessories: deload
            ? const ['2 sets: 10 half-kneeling cable presses per side']
            : const ['3 sets: 10 half-kneeling cable presses per side'],
        conditioningPrescription: [
          '$minutes-minute rotation at sustainable effort:',
          'Minute 1: 10/8-calorie bike',
          'Minute 2: 8 alternating dumbbell strict presses',
          'Minute 3: 30-meter suitcase carry, switching hands halfway',
          'Repeat for $rounds rounds without racing the early rounds',
        ],
        conditioningPatterns: const {'cyclical', 'vertical_push', 'carry'},
        equipment: const {'bike', 'dumbbells', 'kettlebell', 'cable_machine'},
      );
    }
    return WorkoutContentTemplate(
      warmupTemplateId: 'deadlift_warmup_row_2',
      accessoryTemplateId: 'deadlift_accessory_single_leg_2',
      conditioningTemplateId: 'full_body_row_amrap_2',
      warmupMinutes: 10,
      warmup: const [
        '2 rounds at an unhurried pace:',
        '90 seconds easy row',
        '8 quadruped hip extensions per side',
        '8 bird dogs per side',
        '8 empty-bar Romanian deadlifts',
        'Then complete 3 gradual deadlift warmup sets',
      ],
      accessories: deload
          ? const ['2 sets: 8 low box step-ups per side']
          : const ['3 sets: 8 low box step-ups per side'],
      conditioningPrescription: [
        '$minutes-minute AMRAP at sustainable effort:',
        '12/9-calorie row',
        '8 alternating dumbbell push presses',
        '40-meter front-rack kettlebell carry, switching at 20 meters',
        'Keep every round within 10% of the first round pace',
      ],
      conditioningPatterns: const {'cyclical', 'vertical_push', 'carry'},
      equipment: const {'rower', 'dumbbells', 'kettlebell', 'landmine', 'box'},
    );
  }
}
