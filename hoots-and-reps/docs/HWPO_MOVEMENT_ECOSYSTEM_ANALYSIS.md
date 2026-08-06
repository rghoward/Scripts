# Full Movement-Ecosystem Analysis

Status: Corpus-wide first pass complete

## Implementation status

The first executable translation is now present in the deterministic engine:

| Analysis requirement | Engine implementation |
| --- | --- |
| Systematic rather than random variety | Six-week movement and conditioning rotations inside a 12-week phase |
| Multiple loading structures | Ascending, straight, top-set/backoff, wave, complex, and deload prescriptions |
| Strength/Olympic breadth | Squat variants, bench/press, snatch, clean and jerk, OHS, pulls, rows, and unilateral work |
| Gymnastics progressions | Advanced pulling, climbing, and transition work labeled as bounded skill practice |
| Trunk-function variety | Bracing, controlled flexion/compression, and carry-based trunk work rotate across templates |
| Impact management | Running is explicitly tagged and checked against a weekly impact-day ceiling |
| Pull/push balance | Horizontal and vertical push/pull are separate selection and fatigue patterns |
| Carries and odd objects | Farmer, suitcase, and bear-hug work recur at the phase level |
| Rowing identity without exclusivity | Row remains recurrent while bike, SkiErg, running, and mixed work rotate |
| Recovery correction | Four training days and three scheduled rest opportunities per week |
| Metcon interference control | Hard conditioning is rejected when it duplicates a primary or secondary strength pattern |
| Short-session integrity | Secondary strength and optional accessories are removed before the primary lift or conditioning |

This is an engine foundation rather than final human validation. Equipment- and
limitation-specific substitution graphs, athlete skill testing, rolling feedback
adaptation, and source-similarity rejection remain roadmap requirements before
commercial release.

## Purpose

The first methodology report established the source's strength, Olympic-lift,
and conditioning structure. This companion report analyzes the rest of the
movement vocabulary: gymnastics, trunk work, unilateral training, plyometrics,
pulling and pressing, carries, odd objects, and accessories. It translates
descriptive patterns into original rules for our deterministic engine; it does
not reproduce source workout text.

## Method and limits

The reproducible analyzer classifies 88 movements by family, section role,
skill, impact, and fatigue tags. It covers 481 Flagship days and 661 60 days,
including 196 directly aligned days. At least one movement was identified in
93.3% of meaningful Flagship sections and 92.8% of 60 sections.

Counts are days containing a movement, not working-set counts. Warmup mentions
count toward daily presence. Generic lift tags include named and implement
variants; hierarchical matches are excluded from movement-pair results. Some
language remains ambiguous—for example, a generic clean can be a barbell,
dumbbell, or odd-object clean—so the results support programming architecture,
not precise dose reconstruction.

## The complete vocabulary

| Movement family | Flagship days | 60 days | Main role in the source |
| --- | ---: | ---: | --- |
| Core | 249 | 283 | Warmup and accessory, with flexion in conditioning |
| Arm accessory | 183 | 108 | Mostly accessory volume |
| Vertical pull | 143 | 112 | Accessory plus conditioning |
| Horizontal push | 141 | 142 | Strength/accessory plus conditioning |
| Vertical push | 137 | 119 | Strength and mixed conditioning |
| Locomotion/run | 133 | 40 | Conditioning |
| Hanging core | 120 | 99 | Conditioning, accessory, and warmup |
| Unilateral leg | 115 | 110 | Warmup, accessory, and conditioning |
| Mixed bodyweight | 91 | 63 | Conditioning |
| Jump | 85 | 66 | Warmup, conditioning, and power work |
| Jump rope | 81 | 65 | Conditioning |
| Horizontal pull | 72 | 76 | Strength/accessory and cyclical overlap |
| Odd object | 69 | 50 | Conditioning and accessory |
| Inversion | 67 | 54 | Conditioning and bonus work |
| Climb | 53 | 31 | Conditioning and bonus work |
| Gymnastics transition | 49 | 32 | Predominantly conditioning |
| Carry | 37 | 5 | Predominantly accessory |
| Mobility-strength | 34 | 54 | Warmup/accessory |
| Shoulder accessory | 26 | 21 | Predominantly warmup |

These are not filler around the barbell work. They cover different capacities
and loading directions. A generator that merely samples a random bodyweight
movement will still be repetitive and will miss the source's architecture.

## Gymnastics: families, not a grab bag

| Movement | Flagship days | Most common section roles |
| --- | ---: | --- |
| Pull-up | 115 | Accessory 76; conditioning 19; bonus 15 |
| Toes-to-bar | 67 | Conditioning 35; bonus 20; warmup 8 |
| Knee raise/tuck | 65 | Accessory 38; warmup 21 |
| Chest-to-bar | 59 | Conditioning 31; accessory 17 |
| Rope climb | 53 | Conditioning 38; bonus 13 |
| Muscle-up | 49 | Conditioning 38; skill 6 |
| Handstand push-up | 47 | Conditioning 30; bonus 14 |
| Handstand walk | 26 | Conditioning 14; bonus 10 |

The source often places advanced skills inside conditioning, but that should
not be our default progression model. The engine needs separate competency
ladders:

- vertical pull: ring row/strict pull-up, kipping pull-up, chest-to-bar;
- transition: strict transition drills, assisted muscle-up, muscle-up;
- hanging trunk: knee raise, knees-to-elbows, toes-to-bar;
- inversion press: pike press, wall walk, strict/kipping handstand push-up;
- inversion locomotion: weight shifts, shoulder taps, handstand walk; and
- climb: seated pulls, foot-lock practice, partial and full rope climbs.

An advanced movement is eligible in a metcon only after the athlete has shown
the prerequisite capacity outside fatigue. Failed reps, technique decay, pain,
or repeated scaling sends the prescription backward on its own ladder. Skill
practice should occur while fresh; conditioned use is a later expression, not
the method for learning it.

## Trunk training

The corpus uses several genuinely different trunk demands:

- bracing/anti-extension: plank and hollow work;
- hanging compression: knee raises and toes-to-bar;
- flexion: sit-ups, GHD sit-ups, and V-ups;
- supported compression: L-sits; and
- rotation/lateral control: Russian twists and side-plank variants.

Planks appear on 103 Flagship days, hollow work on 77, hanging knee work on 65,
V-ups on 53, sit-ups on 46, L-sits on 38, and GHD sit-ups on 37. This supports
frequent trunk exposure, but not daily high-fatigue flexion. Core-training
meta-analyses find clearer improvements in core endurance and balance than in
sport-specific power or speed. The engine should therefore treat trunk work as
a supporting capacity and rotate functions instead of adding arbitrary ab
volume to every session.

Engine rule: expose two or three trunk functions across a week, normally in
short warmup/accessory doses. Count high-repetition GHD and hanging work against
hip-flexor, grip, shoulder, and trunk fatigue rather than labeling all core work
as recovery-neutral.

## Unilateral work, jumping, and impact

Lunges appear on 72 Flagship days, pistols on 36, split squats on 17, box jumps
on 85, and double-unders on 71. Their roles differ: lunges are most often a
warmup; split squats include real strength work; pistols are mostly conditioning
or bonus; and box jumps span warmup, conditioning, bonus, and power work.

Evidence comparing unilateral and bilateral resistance training favors task
specificity: bilateral work better improves bilateral strength, while unilateral
work better improves unilateral performance. Neither should replace the other.
Plyometric meta-analysis finds small-to-moderate benefits for jump, sprint, and
lower-body strength, but that does not justify unmetered contacts under fatigue.

Engine rules:

- retain bilateral lifts for maximal-force development and program unilateral
  work for single-leg strength, balance, and asymmetry tolerance;
- classify contacts by intensity, not merely by movement name;
- count running, double-unders, box jumps, broad jumps, and burpees in a shared
  rolling impact budget;
- do not place high-impact days back to back by default;
- prefer low-volume, high-quality jumps for power development and reserve dense
  jumping metcons for prepared athletes; and
- substitute step-ups, low-impact cyclical work, or controlled unilateral work
  when impact readiness is limited.

## Pulling, pushing, accessories, and shoulder balance

Pull-ups, rows, pulldowns, curls, face pulls, presses, push-ups, dips, and
inversions create a much broader upper-body system than bench and strict press
alone. Curls appear on 149 Flagship days, planks on 103, push-ups on 86, dips on
41, triceps extensions on 37, and face pulls on 26. Most direct arm work is
accessory volume; it should not compete with primary work for recovery.

The engine should track horizontal pull, vertical pull, horizontal push, and
vertical push separately. Weekly coverage must include pulling in both planes,
but individual sessions should account for the shoulder and grip stress already
created by rowing, SkiErg, Olympic lifting, carries, rope climbs, and gymnastics.
Accessories should correct the phase's exposure gaps, support tissue capacity,
or build a stated goal. They should not be an automatic pile of extra sets.

## Carries, odd objects, and mixed strength

Sandbags appear on 69 Flagship days, bear-hug carries on 20, suitcase carries on
16, devil's press on 11, and Turkish get-ups on 3. Carries are a small but
distinct source feature: they combine gait, trunk stiffness, grip, and implement
control without duplicating a conventional barbell prescription exactly.

The aligned 60 plan retains only 8.3% of Flagship carry-family occurrences and
7.7% of Olympic-derivative occurrences. That is a useful warning: compressing a
day by repeatedly cutting the smallest categories eventually deletes entire
capacities from a phase. Our shorter session can omit a carry today, but the
phase-level coverage ledger must bring it back later.

## Conditioning-pair ecology

After removing parent/child false pairs, the most common Flagship conditioning
pair is fan bike plus rowing (62 sections). Clean plus fan bike (32), clean plus
rowing (30), rowing plus sit-up (23), fan bike plus sandbag (22), GHD sit-up plus
rowing (22), deadlift plus fan bike (18), box jump plus burpee (17), double-under
plus fan bike (17), and rowing plus SkiErg (17) follow.

The pattern is structured variety: a cyclical anchor is frequently paired with
a lift, trunk task, gymnastics skill, jump, or odd object. For our engine, a
pair is legal only if it matches the day's intended time domain and passes
movement-interference, joint-stress, skill-under-fatigue, impact, and equipment
checks. Frequency in the source is evidence of vocabulary, not automatic proof
that a pairing is suitable for every athlete.

## What the 60-minute transformation preserves and removes

Across the 196 aligned days, family retention is highly selective:

| Family | Retained when present in Flagship |
| --- | ---: |
| Cyclical | 98.8% |
| Hinge | 93.5% |
| Core | 87.9% |
| Squat | 80.2% |
| Jump rope | 76.7% |
| Unilateral leg | 75.6% |
| Horizontal pull | 67.7% |
| Horizontal push | 64.6% |
| Inversion | 61.3% |
| Odd object | 60.0% |
| Jump | 55.6% |
| Gymnastics transition | 55.6% |
| Vertical push | 52.5% |
| Vertical pull | 51.9% |
| Hanging core | 50.0% |
| Climb | 47.4% |
| Arm accessory | 32.9% |
| Locomotion/run | 28.6% |
| Carry | 8.3% |
| Olympic derivative | 7.7% |

This is compression by priority, not proportional shortening. We should use the
principle but improve the horizon: preserve the day's primary stimulus, cut
redundant and optional dose first, and enforce rolling phase coverage so carries,
running, derivatives, and technical practice are not permanently sacrificed.

## Deterministic-engine design

Every movement entry needs more than a name. The registry should store:

- movement family and progression ladder;
- primary pattern and secondary fatigue tags;
- skill prerequisite and permitted context (practice, strength, metcon);
- impact class and contact accounting method;
- unilateral/bilateral and loaded/bodyweight status;
- equipment and substitution graph;
- compatible time domains and repetition ceilings;
- joint ranges and contraindication/limitation flags; and
- recent-exposure windows at movement, family, stress, and implement levels.

Selection should happen in this order:

1. choose the phase goal and day's primary adaptation;
2. reserve recovery and hard-session spacing;
3. select a progression-appropriate primary movement;
4. fill missing weekly/phase movement families deliberately;
5. choose conditioning from compatible patterns and time domains;
6. add only accessories that address a defined gap;
7. validate joint, impact, grip, overhead, hinge, squat, and systemic budgets;
8. reject recent repetition at movement, pairing, format, and stimulus levels;
9. generate a shorter variant that preserves intent and updates deferred
   coverage; and
10. record why every movement was selected.

Systematic variation is preferable to random variation: research suggests that
some planned exercise variation can help regional hypertrophy and dynamic
strength, while excessive random variation can compromise gains. Therefore the
engine should maintain stable primary lifts long enough to progress, rotate
secondary families on a schedule, and vary conditioning without turning every
day into novelty.

## Safety boundary

This analysis cannot prove that the source's dose is optimal or safe for a
particular user. CrossFit injury-risk evidence is limited, but novice status and
load/scaling changes warrant closer supervision. The public generator should be
more conservative than the corpus: four default training days, explicit skill
qualification, non-punitive rest, bounded metcons, progressive impact exposure,
and readiness-based reduction. Pain and technique failure are stop/modify
signals, not challenges to overcome.

## Evidence used for this extension

- Kassiano et al. (2022), systematic review of exercise variation and strength/
  hypertrophy: https://pubmed.ncbi.nlm.nih.gov/35438660/
- Liao et al. (2022), unilateral versus bilateral resistance-training
  meta-analysis: https://pubmed.ncbi.nlm.nih.gov/35959319/
- Rodríguez-Perea et al. (2023), core training and performance meta-analysis:
  https://pubmed.ncbi.nlm.nih.gov/37867742/
- Stojanović et al. (2019), plyometric training in healthy adults:
  https://pubmed.ncbi.nlm.nih.gov/31136014/
- Ramirez-Campillo et al. (2023), reactive-strength plyometric meta-analysis:
  https://pubmed.ncbi.nlm.nih.gov/36906633/
- Mehrab et al. (2023), CrossFit injury-risk systematic review:
  https://pubmed.ncbi.nlm.nih.gov/36174660/

This evidence supports broad design principles; it does not establish one exact
weekly prescription for all users. Final rules still require human programming
review and conservative field validation.

## Reproducibility

The private analysis artifacts are:

- `analyze_movement_ecosystem.py`
- `normalized-data/hwpo-movement-ecosystem-analysis.json`
- `test_analyze_movement_ecosystem.py`

The derived JSON contains tags and aggregate counts only. It does not export
source workout descriptions.
