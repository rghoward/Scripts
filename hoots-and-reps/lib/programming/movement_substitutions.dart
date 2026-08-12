class MovementSubstitution {
  const MovementSubstitution({
    required this.movementId,
    required this.original,
    required this.replacement,
    required this.stimulus,
    required this.disclosure,
  });

  final String movementId;
  final String original;
  final String replacement;
  final String stimulus;
  final String disclosure;
}

class _MovementDefinition {
  const _MovementDefinition(
    this.id,
    this.label,
    this.aliases,
    this.alternatives,
    this.stimulus,
  );

  final String id;
  final String label;
  final List<String> aliases;
  final List<String> alternatives;
  final String stimulus;
}

/// A deterministic movement catalog. It offers user-directed alternatives;
/// it does not infer injuries or claim that a choice is medically suitable.
class MovementSubstitutionRegistry {
  const MovementSubstitutionRegistry();

  static const _definitions = <_MovementDefinition>[
    _MovementDefinition(
      'back_squat',
      'Back Squat',
      ['back squats', 'back squat'],
      ['Front Squat', 'Goblet Squat', 'Leg Press'],
      'Loaded squat strength',
    ),
    _MovementDefinition(
      'front_squat',
      'Front Squat',
      ['front squats', 'front squat'],
      ['Back Squat', 'Goblet Squat', 'Double-Dumbbell Front Squat'],
      'Loaded squat strength',
    ),
    _MovementDefinition(
      'overhead_squat',
      'Overhead Squat',
      ['overhead squats', 'overhead squat'],
      ['Front Squat', 'Goblet Squat', 'Overhead Plate Squat'],
      'Squatting with overhead stability',
    ),
    _MovementDefinition(
      'deadlift',
      'Deadlift',
      ['deadlifts', 'deadlift'],
      ['Romanian Deadlift', 'Trap-Bar Deadlift', 'Kettlebell Deadlift'],
      'Loaded hip-hinge strength',
    ),
    _MovementDefinition(
      'romanian_deadlift',
      'Romanian Deadlift',
      ['romanian deadlifts', 'romanian deadlift', 'rdls', 'rdl'],
      ['Deadlift', 'Good Morning', 'Single-Leg Romanian Deadlift'],
      'Posterior-chain hinge strength',
    ),
    _MovementDefinition(
      'bench_press',
      'Bench Press',
      ['bench presses', 'bench press'],
      ['Dumbbell Bench Press', 'Floor Press', 'Push-Up'],
      'Horizontal pressing strength',
    ),
    _MovementDefinition(
      'strict_press',
      'Strict Press',
      ['strict presses', 'strict press'],
      ['Dumbbell Strict Press', 'Landmine Press', 'Pike Push-Up'],
      'Strict overhead pressing',
    ),
    _MovementDefinition(
      'push_press',
      'Push Press',
      ['push presses', 'push press'],
      ['Dumbbell Push Press', 'Landmine Push Press', 'Strict Press'],
      'Leg-assisted overhead pressing',
    ),
    _MovementDefinition(
      'thruster',
      'Thruster',
      ['thrusters', 'thruster'],
      ['Dumbbell Thruster', 'Wall Ball', 'Goblet Squat to Press'],
      'Squat-to-overhead cycling',
    ),
    _MovementDefinition(
      'barbell_row',
      'Barbell Row',
      ['barbell rows', 'barbell row', 'bent-over rows', 'bent-over row'],
      ['Dumbbell Row', 'Ring Row', 'Chest-Supported Row'],
      'Horizontal pulling strength',
    ),
    _MovementDefinition(
      'pull_up',
      'Pull-Up',
      ['chest-to-bar pull-ups', 'chest to bar pull-ups', 'pull-ups', 'pull-up'],
      ['Band-Assisted Pull-Up', 'Neutral-Grip Pulldown', 'Ring Row'],
      'Vertical pulling',
    ),
    _MovementDefinition(
      'ring_row',
      'Ring Row',
      ['ring rows', 'ring row'],
      ['Dumbbell Row', 'Seated Cable Row', 'Barbell Row'],
      'Horizontal pulling',
    ),
    _MovementDefinition(
      'ring_dip',
      'Ring Dip',
      ['ring dips', 'ring dip'],
      ['Box Dip', 'Bench Dip', 'Close-Grip Push-Up'],
      'Bodyweight pressing',
    ),
    _MovementDefinition(
      'push_up',
      'Push-Up',
      ['hand-release push-ups', 'push-ups', 'push-up'],
      ['Incline Push-Up', 'Dumbbell Floor Press', 'Ring Push-Up'],
      'Horizontal bodyweight pressing',
    ),
    _MovementDefinition(
      'power_clean',
      'Power Clean',
      ['power cleans', 'power clean'],
      ['Hang Power Clean', 'Dumbbell Power Clean', 'Clean Pull'],
      'Explosive pull and catch',
    ),
    _MovementDefinition(
      'squat_clean',
      'Squat Clean',
      ['squat cleans', 'squat clean'],
      [
        'Power Clean + Front Squat',
        'Dumbbell Squat Clean',
        'Clean Pull + Front Squat',
      ],
      'Explosive pull into a squat',
    ),
    _MovementDefinition(
      'clean_and_jerk',
      'Clean & Jerk',
      ['clean and jerks', 'clean & jerks', 'clean and jerk', 'clean & jerk'],
      [
        'Dumbbell Clean & Jerk',
        'Power Clean + Push Press',
        'Clean Pull + Push Press',
      ],
      'Ground-to-overhead power',
    ),
    _MovementDefinition(
      'power_snatch',
      'Power Snatch',
      ['power snatches', 'power snatch'],
      ['Hang Power Snatch', 'Dumbbell Power Snatch', 'Snatch High Pull'],
      'Explosive wide-grip pull and catch',
    ),
    _MovementDefinition(
      'squat_snatch',
      'Squat Snatch',
      ['squat snatches', 'squat snatch'],
      [
        'Power Snatch + Overhead Squat',
        'Dumbbell Squat Snatch',
        'Snatch Pull + Overhead Squat',
      ],
      'Explosive pull into an overhead squat',
    ),
    _MovementDefinition(
      'split_jerk',
      'Split Jerk',
      ['split jerks', 'split jerk'],
      ['Push Jerk', 'Power Jerk', 'Dumbbell Split Jerk'],
      'Explosive overhead drive',
    ),
    _MovementDefinition(
      'walking_lunge',
      'Walking Lunge',
      ['walking lunges', 'walking lunge'],
      ['Reverse Lunge', 'Step-Up', 'Split Squat'],
      'Unilateral leg endurance',
    ),
    _MovementDefinition(
      'reverse_lunge',
      'Reverse Lunge',
      ['reverse lunges', 'reverse lunge'],
      ['Walking Lunge', 'Step-Up', 'Split Squat'],
      'Unilateral leg strength',
    ),
    _MovementDefinition(
      'split_squat',
      'Split Squat',
      ['bulgarian split squats', 'split squats', 'split squat'],
      ['Reverse Lunge', 'Step-Up', 'Walking Lunge'],
      'Unilateral leg strength',
    ),
    _MovementDefinition(
      'step_up',
      'Step-Up',
      ['box step-ups', 'box step-up', 'step-ups', 'step-up'],
      ['Reverse Lunge', 'Walking Lunge', 'Split Squat'],
      'Unilateral leg drive',
    ),
    _MovementDefinition(
      'box_jump',
      'Box Jump',
      ['box jump-overs', 'box jump-over', 'box jumps', 'box jump'],
      ['Box Step-Up', 'Broad Jump', 'Low Box Jump'],
      'Explosive leg drive',
    ),
    _MovementDefinition(
      'box_step_over',
      'Box Step-Over',
      ['box step-overs', 'box step-over'],
      ['Box Step-Up', 'Walking Lunge', 'Low Box Step-Over'],
      'Loaded or unloaded locomotion',
    ),
    _MovementDefinition(
      'running',
      'Running',
      ['walking or jogging', 'easy walking', 'running', 'run'],
      ['Row', 'SkiErg', 'Fan Bike'],
      'Cyclical aerobic output',
    ),
    _MovementDefinition(
      'row',
      'Rowing',
      [
        'row 1:00',
        'bike or row',
        'calorie row',
        'easy row',
        'continuous row',
        'row intervals',
        'row interval',
        'rowing',
        'rower',
      ],
      ['SkiErg', 'Fan Bike', 'Run'],
      'Cyclical pulling and aerobic output',
    ),
    _MovementDefinition(
      'ski_erg',
      'SkiErg',
      ['ski erg', 'ski-erg', 'skierg', 'ski'],
      ['Row', 'Fan Bike', 'Run'],
      'Cyclical upper-body aerobic output',
    ),
    _MovementDefinition(
      'fan_bike',
      'Fan Bike',
      [
        'easy bike',
        'bike or row',
        'assault bike',
        'echo bike',
        'fan bike',
        'bike calories',
      ],
      ['Row', 'SkiErg', 'Run'],
      'Low-impact cyclical output',
    ),
    _MovementDefinition(
      'burpee',
      'Burpee',
      ['burpee box jump-overs', 'burpee box jump-over', 'burpees', 'burpee'],
      ['Elevated Step-Back Burpee', 'Up-Down', 'No-Push-Up Burpee'],
      'Mixed-bodyweight conditioning',
    ),
    _MovementDefinition(
      'wall_ball',
      'Wall Ball',
      [
        'wall-ball shots',
        'wall ball shots',
        'wall-balls',
        'wall balls',
        'wall-ball',
        'wall ball',
      ],
      [
        'Light Dumbbell Thruster',
        'Medicine-Ball Squat',
        'Goblet Squat to Press',
      ],
      'Squat-to-overhead cycling',
    ),
    _MovementDefinition(
      'dumbbell_snatch',
      'Dumbbell Snatch',
      ['dumbbell snatches', 'db snatches', 'dumbbell snatch', 'db snatch'],
      ['Kettlebell Snatch', 'Dumbbell Clean', 'Single-Arm Dumbbell Swing'],
      'Single-arm ground-to-overhead power',
    ),
    _MovementDefinition(
      'kettlebell_swing',
      'Kettlebell Swing',
      ['kettlebell swings', 'kb swings', 'kettlebell swing', 'kb swing'],
      ['Dumbbell Swing', 'Russian Kettlebell Swing', 'Light Romanian Deadlift'],
      'Ballistic hip extension',
    ),
    _MovementDefinition(
      'farmer_carry',
      'Farmer Carry',
      ['farmer carries', 'farmer carry'],
      ['Suitcase Carry', 'Front-Rack Carry', 'Sandbag Bear-Hug Carry'],
      'Loaded bilateral carrying',
    ),
    _MovementDefinition(
      'suitcase_carry',
      'Suitcase Carry',
      ['suitcase carries', 'suitcase carry'],
      ['Farmer Carry', 'Front-Rack Carry', 'Sandbag Bear-Hug Carry'],
      'Unilateral loaded carrying',
    ),
    _MovementDefinition(
      'front_rack_carry',
      'Front-Rack Carry',
      [
        'front-rack carries',
        'front rack carries',
        'front-rack carry',
        'front rack carry',
      ],
      ['Farmer Carry', 'Suitcase Carry', 'Sandbag Bear-Hug Carry'],
      'Front-loaded carrying and trunk bracing',
    ),
    _MovementDefinition(
      'sandbag_carry',
      'Sandbag Carry',
      ['sandbag carries', 'sandbag carry'],
      ['Farmer Carry', 'Front-Rack Carry', 'Plate Bear-Hug Carry'],
      'Odd-object loaded carrying',
    ),
    _MovementDefinition(
      'double_under',
      'Double-Under',
      ['double-unders', 'double unders', 'double-under', 'double under'],
      ['Single-Under', 'Plate Hop', 'Line Hop'],
      'Fast elastic conditioning',
    ),
    _MovementDefinition(
      'rope_climb',
      'Rope Climb',
      [
        'rope-climb foot-lock practice',
        'rope climb foot-lock practice',
        'rope-climb skill practice',
        'rope climb skill practice',
        'legless rope climbs',
        'rope climbs',
        'rope climb',
      ],
      ['Rope Pull from Floor', 'Towel Pull-Up', 'Ring Row'],
      'Vertical pulling and grip',
    ),
    _MovementDefinition(
      'toes_to_bar',
      'Toes-to-Bar',
      ['toes-to-bars', 'toes to bars', 'toes-to-bar', 'toes to bar', 't2b'],
      ['Hanging Knee Raise', 'V-Up', 'Weighted Sit-Up'],
      'Hanging trunk flexion',
    ),
    _MovementDefinition(
      'hanging_knee_raise',
      'Hanging Knee Raise',
      [
        'hanging knee-raise progression',
        'hanging knee raise progression',
        'hanging knee-raise practice',
        'hanging knee raise practice',
        'hanging knee-raises',
        'hanging knee raises',
        'hanging knee-raise',
        'hanging knee raise',
      ],
      ['Toes-to-Bar', 'V-Up', 'Reverse Crunch'],
      'Hanging trunk flexion',
    ),
    _MovementDefinition(
      'handstand_hold',
      'Handstand Hold',
      [
        'wall-facing handstand deload hold',
        'wall-facing handstand hold',
        'handstand deload hold',
        'handstand holds',
        'handstand hold',
      ],
      ['Pike Hold', 'Dumbbell Overhead Hold', 'Plank'],
      'Inverted overhead stability',
    ),
    _MovementDefinition(
      'handstand_push_up',
      'Handstand Push-Up',
      [
        'strict handstand push-ups',
        'kipping handstand push-ups',
        'handstand push-ups',
        'handstand push-up',
      ],
      ['Pike Push-Up', 'Dumbbell Strict Press', 'Box Pike Push-Up'],
      'Inverted pressing strength and stamina',
    ),
    _MovementDefinition(
      'handstand_walk',
      'Handstand Walk',
      ['handstand walks', 'handstand walk'],
      ['Wall Walk', 'Bear Crawl', 'Dumbbell Overhead Carry'],
      'Inverted locomotion and stability',
    ),
    _MovementDefinition(
      'wall_walk',
      'Wall Walk',
      [
        'wall-walk position practice',
        'wall walk position practice',
        'wall walks',
        'wall walk',
      ],
      ['Inchworm', 'Bear Crawl', 'Pike Walk-In'],
      'Overhead pressing and trunk control',
    ),
    _MovementDefinition(
      'muscle_up',
      'Muscle-Up',
      ['ring muscle-ups', 'bar muscle-ups', 'muscle-ups', 'muscle-up'],
      ['Pull-Up + Ring Dip', 'Jumping Muscle-Up', 'Chest-to-Bar Pull-Up'],
      'Advanced pull-to-press gymnastics',
    ),
    _MovementDefinition(
      'sit_up',
      'Sit-Up',
      ['abmat sit-ups', 'sit-ups', 'sit-up'],
      ['V-Up', 'Dead Bug', 'Reverse Crunch'],
      'Trunk flexion endurance',
    ),
    _MovementDefinition(
      'v_up',
      'V-Up',
      ['v-ups', 'v-up'],
      ['Sit-Up', 'Tuck-Up', 'Dead Bug'],
      'Trunk flexion and compression',
    ),
    _MovementDefinition(
      'plank',
      'Plank',
      ['plank holds', 'plank hold', 'planks', 'plank'],
      ['Dead Bug', 'Hollow Hold', 'Bear Plank'],
      'Trunk bracing endurance',
    ),
    _MovementDefinition(
      'dead_bug',
      'Dead Bug',
      [
        'dead-bug deload circuit',
        'dead bug deload circuit',
        'dead bugs',
        'dead bug',
      ],
      ['Bird Dog', 'Plank', 'Hollow Hold'],
      'Controlled trunk stability',
    ),
    _MovementDefinition(
      'chest_supported_row',
      'Chest-Supported Row',
      [
        'chest-supported rows',
        'chest supported rows',
        'chest-supported row',
        'chest supported row',
      ],
      ['One-Arm Dumbbell Row', 'Seated Cable Row', 'Ring Row'],
      'Supported horizontal pulling',
    ),
    _MovementDefinition(
      'dumbbell_row',
      'Dumbbell Row',
      [
        'one-arm dumbbell rows',
        'single-arm dumbbell rows',
        'dumbbell rows',
        'dumbbell row',
      ],
      ['Chest-Supported Row', 'Ring Row', 'Seated Cable Row'],
      'Unilateral horizontal pulling',
    ),
    _MovementDefinition(
      'pulldown',
      'Pulldown',
      ['neutral-grip pulldowns', 'pulldowns', 'pulldown'],
      ['Band-Assisted Pull-Up', 'Ring Row', 'Single-Arm Cable Pulldown'],
      'Vertical pulling',
    ),
    _MovementDefinition(
      'chin_up',
      'Chin-Up',
      ['chin-ups', 'chin-up'],
      ['Neutral-Grip Pulldown', 'Band-Assisted Chin-Up', 'Ring Row'],
      'Vertical pulling',
    ),
    _MovementDefinition(
      'floor_press',
      'Floor Press',
      ['dumbbell floor presses', 'floor presses', 'floor press'],
      ['Dumbbell Bench Press', 'Push-Up', 'Landmine Press'],
      'Horizontal pressing',
    ),
    _MovementDefinition(
      'triceps_pressdown',
      'Triceps Pressdown',
      ['banded triceps pressdowns', 'triceps pressdowns', 'triceps pressdown'],
      ['Close-Grip Push-Up', 'Dumbbell Skull Crusher', 'Bench Dip'],
      'Elbow-extension strength',
    ),
    _MovementDefinition(
      'overhead_triceps_extension',
      'Overhead Triceps Extension',
      [
        'overhead triceps extensions',
        'overhead triceps extension',
        'triceps extensions',
        'triceps extension',
      ],
      ['Triceps Pressdown', 'Dumbbell Skull Crusher', 'Bench Dip'],
      'Long-head elbow-extension strength',
    ),
    _MovementDefinition(
      'biceps_curl',
      'Biceps Curl',
      [
        'hammer curls',
        'hammer curl',
        'supinated curls',
        'supinated curl',
        'curls',
        'curl',
      ],
      ['Incline Dumbbell Curl', 'Band Curl', 'Neutral-Grip Chin-Up'],
      'Direct elbow-flexion strength',
    ),
    _MovementDefinition(
      'face_pull',
      'Face Pull',
      ['banded face pulls', 'face pulls', 'face pull'],
      ['Band Pull-Apart', 'Rear-Delt Fly', 'Cable External Rotation'],
      'Upper-back and shoulder pulling',
    ),
    _MovementDefinition(
      'external_rotation',
      'Cable External Rotation',
      ['cable external rotations', 'external rotations', 'external rotation'],
      ['Banded External Rotation', 'Face Pull', 'Side-Lying External Rotation'],
      'Rotator-cuff accessory work',
    ),
    _MovementDefinition(
      'back_extension',
      'Back Extension',
      ['back extensions', 'back extension'],
      ['Hip Extension', 'Light Good Morning', 'Bird Dog'],
      'Posterior-chain trunk extension',
    ),
    _MovementDefinition(
      'side_plank',
      'Side Plank',
      ['side planks', 'side plank'],
      ['Suitcase Hold', 'Dead Bug', 'Pallof Press'],
      'Lateral trunk stability',
    ),
    _MovementDefinition(
      'hip_bridge',
      'Hip Bridge',
      ['single-leg hip bridges', 'hip bridges', 'hip bridge'],
      ['Hip Thrust', 'Frog Pump', 'Light Romanian Deadlift'],
      'Hip-extension strength',
    ),
    _MovementDefinition(
      'glute_bridge',
      'Glute Bridge',
      ['glute bridges', 'glute bridge'],
      ['Hip Thrust', 'Frog Pump', 'Banded Glute Bridge'],
      'Hip-extension warmup and strength',
    ),
    _MovementDefinition(
      'squat_to_stand',
      'Squat-to-Stand',
      [
        'squat-to-stands',
        'squat to stands',
        'squat-to-stand',
        'squat to stand',
      ],
      [
        'Bodyweight Tempo Squat',
        'Goblet Squat Pry',
        'Alternating Lateral Lunge',
      ],
      'Squat mobility and patterning',
    ),
    _MovementDefinition(
      'pallof_press',
      'Pallof Press',
      ['pallof presses', 'pallof press'],
      ['Suitcase Hold', 'Dead Bug', 'Side Plank'],
      'Anti-rotation trunk stability',
    ),
    _MovementDefinition(
      'cable_press',
      'Half-Kneeling Cable Press',
      ['half-kneeling cable presses', 'cable presses', 'cable press'],
      ['Half-Kneeling Dumbbell Press', 'Landmine Press', 'Incline Push-Up'],
      'Unilateral pressing',
    ),
    _MovementDefinition(
      'hamstring_curl',
      'Hamstring Curl',
      ['hamstring curls', 'hamstring curl'],
      ['Slider Leg Curl', 'Stability-Ball Leg Curl', 'Light Romanian Deadlift'],
      'Knee-flexion hamstring strength',
    ),
    _MovementDefinition(
      'landmine_press',
      'Landmine Press',
      ['landmine presses', 'landmine press'],
      ['Half-Kneeling Dumbbell Press', 'Incline Dumbbell Press', 'Push-Up'],
      'Angled pressing strength',
    ),
    _MovementDefinition(
      'lateral_lunge',
      'Lateral Lunge',
      ['lateral lunges', 'lateral lunge'],
      ['Reverse Lunge', 'Cossack Squat', 'Lateral Step-Up'],
      'Frontal-plane leg strength',
    ),
    _MovementDefinition(
      'band_pull_apart',
      'Band Pull-Apart',
      ['band pull-aparts', 'band pull-apart'],
      ['Face Pull', 'Rear-Delt Fly', 'Cable Row'],
      'Upper-back accessory pulling',
    ),
    _MovementDefinition(
      'y_raise',
      'Prone Y-Raise',
      ['prone y-raises', 'y-raises', 'y-raise'],
      ['Incline Y-Raise', 'Band Pull-Apart', 'Face Pull'],
      'Scapular control',
    ),
    _MovementDefinition(
      'scapular_pull_up',
      'Scapular Pull-Up',
      ['scapular pull-ups', 'scapular pull-up'],
      ['Straight-Arm Pulldown', 'Scapular Ring Row', 'Band Pulldown'],
      'Scapular pulling control',
    ),
    _MovementDefinition(
      'muscle_snatch',
      'Muscle Snatch',
      ['muscle snatches', 'muscle snatch'],
      ['Tall Snatch', 'Dumbbell Muscle Snatch', 'Snatch High Pull'],
      'Wide-grip turnover practice',
    ),
    _MovementDefinition(
      'snatch_pull',
      'Snatch Pull',
      ['snatch pulls', 'snatch pull'],
      ['Snatch High Pull', 'Clean Pull', 'Wide-Grip Romanian Deadlift'],
      'Explosive wide-grip pulling',
    ),
    _MovementDefinition(
      'clean_high_pull',
      'Clean High Pull',
      ['clean-grip high pulls', 'clean high pulls', 'clean high pull'],
      ['Clean Pull', 'Dumbbell High Pull', 'Jump Shrug'],
      'Explosive clean-grip pulling',
    ),
    _MovementDefinition(
      'tall_clean',
      'Tall Clean',
      ['tall cleans', 'tall clean'],
      ['Hang Power Clean', 'Muscle Clean', 'Dumbbell Clean'],
      'Clean turnover practice',
    ),
    _MovementDefinition(
      'good_morning',
      'Good Morning',
      ['bodyweight good mornings', 'good mornings', 'good morning'],
      ['Light Romanian Deadlift', 'Hip Hinge Drill', 'Back Extension'],
      'Hip-hinge patterning',
    ),
    _MovementDefinition(
      'bird_dog',
      'Bird Dog',
      ['bird dogs', 'bird dog'],
      ['Dead Bug', 'Quadruped Hip Extension', 'Bear Plank'],
      'Contralateral trunk stability',
    ),
    _MovementDefinition(
      'hip_extension',
      'Quadruped Hip Extension',
      ['quadruped hip extensions', 'hip extensions', 'hip extension'],
      ['Bird Dog', 'Hip Bridge', 'Frog Pump'],
      'Hip-extension accessory work',
    ),
    _MovementDefinition(
      'mini_band_step',
      'Mini-Band Lateral Step',
      ['mini-band lateral steps', 'banded lateral steps', 'lateral steps'],
      ['Banded Clamshell', 'Lateral Step-Up', 'Bodyweight Lateral Lunge'],
      'Lateral hip endurance',
    ),
    _MovementDefinition(
      'clean_pull',
      'Clean Pull',
      ['clean pulls', 'clean pull'],
      ['Clean High Pull', 'Snatch Pull', 'Clean Deadlift'],
      'Explosive clean-grip pulling',
    ),
    _MovementDefinition(
      'bear_hug_carry',
      'Sandbag Bear-Hug Carry',
      [
        'sandbag bear-hug carries',
        'sandbag bear hug carries',
        'sandbag bear-hug carry',
        'sandbag bear hug carry',
        'bear-hug carry',
        'bear hug carry',
      ],
      ['Farmer Carry', 'Front-Rack Carry', 'Plate Bear-Hug Carry'],
      'Anterior odd-object carrying',
    ),
    _MovementDefinition(
      'l_sit',
      'L-Sit Compression',
      ['l-sit compression practice', 'l-sit compression', 'l-sit'],
      ['Tuck Sit Hold', 'Seated Leg Lift', 'Hollow Hold'],
      'Trunk compression strength',
    ),
    _MovementDefinition(
      'handstand_weight_shift',
      'Handstand Weight Shift',
      [
        'handstand weight-shift practice',
        'handstand weight shift practice',
        'handstand weight-shifts',
        'handstand weight shifts',
      ],
      [
        'Pike Weight Shift',
        'Bear-Plank Shoulder Tap',
        'Dumbbell Overhead Carry',
      ],
      'Inverted balance and weight transfer',
    ),
    _MovementDefinition(
      'half_kneeling_dumbbell_press',
      'Half-Kneeling Dumbbell Press',
      [
        'half-kneeling dumbbell presses',
        'half kneeling dumbbell presses',
        'half-kneeling dumbbell press',
        'half kneeling dumbbell press',
      ],
      ['Landmine Press', 'Single-Arm Dumbbell Press', 'Incline Dumbbell Press'],
      'Unilateral pressing strength',
    ),
    _MovementDefinition(
      'cossack_squat',
      'Cossack Squat',
      ['cossack squats', 'cossack squat'],
      ['Lateral Lunge', 'Squat-to-Stand', 'Adductor Rock-Back'],
      'Lateral squat mobility and strength',
    ),
    _MovementDefinition(
      'snatch_grip_press_behind_neck',
      'Snatch-Grip Press Behind Neck',
      ['snatch-grip press-behind-neck', 'snatch grip press behind neck'],
      ['Snatch-Grip Push Press', 'Overhead PVC Press', 'Dumbbell Y-Press'],
      'Overhead snatch-position preparation',
    ),
    _MovementDefinition(
      'jerk_footwork',
      'Jerk Footwork',
      ['jerk footwork repetitions', 'jerk footwork'],
      ['Tall Split-Jerk Step', 'Push-Jerk Footwork', 'Split-Stance Press'],
      'Jerk stance and footwork practice',
    ),
    _MovementDefinition(
      'sandbag_to_shoulder',
      'Sandbag-to-Shoulder',
      [
        'sandbag-to-shoulder repetitions',
        'sandbag to shoulder repetitions',
        'sandbag-to-shoulder',
        'sandbag to shoulder',
      ],
      [
        'Sandbag Clean to Bear Hug',
        'Dumbbell Clean',
        'Ground-to-Shoulder Plate',
      ],
      'Odd-object ground-to-shoulder power',
    ),
    _MovementDefinition(
      'sled_push',
      'Sled Push',
      ['sled pushes', 'sled push'],
      ['Backward Sled Drag', 'Heavy Farmer Carry', 'Sandbag Bear-Hug Carry'],
      'Loaded forward locomotion',
    ),
    _MovementDefinition(
      'backward_sled_drag',
      'Backward Sled Drag',
      ['backward sled drags', 'backward sled drag'],
      ['Sled Push', 'Backward Walking Drag', 'Heavy Step-Up'],
      'Loaded backward locomotion and knee extension',
    ),
    _MovementDefinition(
      'couch_stretch',
      'Couch Stretch',
      [
        'couch stretch',
        'half-kneeling hip-flexor stretch',
        'half kneeling hip-flexor stretch',
      ],
      [
        'Half-Kneeling Quad Stretch',
        'Standing Quad Stretch',
        'Prone Quad Stretch',
      ],
      'Quadriceps and hip-flexor mobility',
    ),
    _MovementDefinition(
      'figure_four_stretch',
      'Figure-Four Stretch',
      ['figure-four stretch', 'figure four stretch'],
      ['Seated Figure-Four Stretch', 'Pigeon Stretch', 'Supine Glute Stretch'],
      'Hip and glute mobility',
    ),
    _MovementDefinition(
      'adductor_rock_back',
      'Adductor Rock-Back',
      ['adductor rock-backs', 'adductor rock-back'],
      ['Frog Rock-Back', 'Wide-Stance Shift', 'Supported Cossack Hold'],
      'Adductor mobility',
    ),
    _MovementDefinition(
      'breathing_reset',
      'Breathing Reset',
      ['crocodile breathing', 'supine breathing', 'breathing reset'],
      ['Box Breathing', 'Supine 60/60 Breathing', 'Child’s-Pose Breathing'],
      'Down-regulation and breathing control',
    ),
    _MovementDefinition(
      'open_book_rotation',
      'Open-Book Rotation',
      [
        'open-book rotations',
        'open-book rotation',
        'open book rotations',
        'open book rotation',
      ],
      [
        'Thread-the-Needle Stretch',
        'Quadruped Thoracic Rotation',
        'Wall Thoracic Rotation',
      ],
      'Thoracic rotation mobility',
    ),
    _MovementDefinition(
      'neck_release',
      'Upper-Trap and Neck Release',
      ['upper-trap and neck release', 'upper trap and neck release'],
      [
        'Levator Scapulae Stretch',
        'Gentle Neck Rotation',
        'Upper-Trap Stretch',
      ],
      'Neck and upper-trapezius mobility',
    ),
    _MovementDefinition(
      'posterior_shoulder_stretch',
      'Posterior-Shoulder Stretch',
      ['posterior-shoulder stretch', 'posterior shoulder stretch'],
      [
        'Sleeper Stretch',
        'Thread-the-Needle Stretch',
        'Cross-Body Shoulder Stretch',
      ],
      'Posterior shoulder mobility',
    ),
    _MovementDefinition(
      'doorway_chest_stretch',
      'Doorway Chest Stretch',
      ['doorway chest stretch'],
      ['Corner Chest Stretch', 'Bench Pec Stretch', 'Floor Pec Stretch'],
      'Chest and anterior-shoulder mobility',
    ),
    _MovementDefinition(
      'triceps_stretch',
      'Overhead Triceps Stretch',
      ['overhead triceps stretch', 'triceps stretch'],
      [
        'Bench Triceps Stretch',
        'Cross-Body Triceps Stretch',
        'Lat-and-Triceps Stretch',
      ],
      'Triceps and overhead mobility',
    ),
    _MovementDefinition(
      'forearm_stretch',
      'Forearm and Biceps Stretch',
      ['forearm flexor and biceps stretch', 'forearm stretch'],
      ['Wall Biceps Stretch', 'Wrist-Flexor Stretch', 'Prayer Stretch'],
      'Forearm and elbow mobility',
    ),
    _MovementDefinition(
      'childs_pose',
      'Child’s Pose',
      ['child’s pose', "child's pose", 'childs pose'],
      ['Prayer Stretch on Bench', 'Quadruped Lat Stretch', 'Puppy Pose'],
      'Lat and trunk mobility',
    ),
    _MovementDefinition(
      'hamstring_stretch',
      'Hamstring Stretch',
      ['supported hamstring stretch', 'hamstring stretch'],
      [
        'Supine Strap Hamstring Stretch',
        'Standing Supported Hamstring Stretch',
        'Half-Split Stretch',
      ],
      'Hamstring mobility',
    ),
    _MovementDefinition(
      'lat_stretch',
      'Bench-Supported Lat Stretch',
      ['bench-supported lat stretch', 'lat stretch'],
      ['Prayer Stretch', 'Hanging Lat Stretch', 'Wall Lat Stretch'],
      'Lat and overhead mobility',
    ),
  ];

  List<String> detectedMovements(String prescription) {
    final matches = <(_MovementDefinition, int)>[
      for (final definition in _definitions)
        if (_firstOccurrence(prescription, definition) case final index?)
          (definition, index),
    ]..sort((a, b) => a.$2.compareTo(b.$2));
    return [for (final match in matches) match.$1.id];
  }

  String label(String movementId) =>
      _definition(movementId)?.label ?? movementId.replaceAll('_', ' ');

  List<String> get movementIds => [
    for (final definition in _definitions) definition.id,
  ];

  bool containsMovement(String prescription, String movementId) {
    final definition = _definition(_normalizeId(movementId));
    return definition != null && _containsDefinition(prescription, definition);
  }

  List<MovementSubstitution> candidates(String movementId) {
    final definition = _definition(_normalizeId(movementId));
    if (definition == null) return const [];
    return [
      for (final replacement in definition.alternatives)
        MovementSubstitution(
          movementId: definition.id,
          original: definition.label,
          replacement: replacement,
          stimulus: definition.stimulus,
          disclosure:
              'This changes some movement details. Choose the option that fits your preference and setup.',
        ),
    ];
  }

  String apply(String prescription, MovementSubstitution substitution) {
    final definition = _definition(_normalizeId(substitution.movementId));
    if (definition == null) return prescription;
    if (definition.id == 'row') {
      return prescription.replaceAll(
        RegExp(r'\brow(?:er|ing)?\b', caseSensitive: false),
        substitution.replacement,
      );
    }
    var result = prescription;
    for (final alias in [
      ...definition.aliases,
    ]..sort((a, b) => b.length.compareTo(a.length))) {
      result = result.replaceAll(
        RegExp(RegExp.escape(alias), caseSensitive: false),
        substitution.replacement,
      );
    }
    return result;
  }

  static String _normalizeId(String value) => switch (value) {
    'rowing' => 'row',
    'pull-up' => 'pull_up',
    'wall-ball' => 'wall_ball',
    _ => value,
  };

  static _MovementDefinition? _definition(String id) {
    for (final definition in _definitions) {
      if (definition.id == id) return definition;
    }
    return null;
  }

  static bool _containsDefinition(String text, _MovementDefinition definition) {
    return _firstOccurrence(text, definition) != null;
  }

  static int? _firstOccurrence(String text, _MovementDefinition definition) {
    final lower = text.toLowerCase();
    if (definition.id == 'push_up' &&
        (lower.contains('handstand push-up') ||
            lower.contains('pike push-up'))) {
      return null;
    }
    var searchable = lower;
    if (definition.id == 'row' &&
        (lower.contains('barbell row') ||
            lower.contains('dumbbell row') ||
            lower.contains('ring row'))) {
      searchable = lower
          .replaceAll('barbell row', '')
          .replaceAll('dumbbell row', '')
          .replaceAll('ring row', '');
    }
    int? first;
    for (final alias in definition.aliases) {
      final index = searchable.indexOf(alias);
      if (index >= 0 && (first == null || index < first)) first = index;
    }
    return first;
  }
}
