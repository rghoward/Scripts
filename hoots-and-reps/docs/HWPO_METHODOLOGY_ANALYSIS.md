# HWPO Methodology Analysis for the Deterministic Programming Engine

Status: Corpus-wide first pass complete

The companion [`HWPO_MOVEMENT_ECOSYSTEM_ANALYSIS.md`](HWPO_MOVEMENT_ECOSYSTEM_ANALYSIS.md)
extends this work across gymnastics, trunk training, unilateral work, jumping,
carries, odd objects, accessories, and movement-pair ecology.

## Purpose

This report identifies abstract programming patterns in the private Flagship
1.0 and 60 1.0 archive, reconciles them with current exercise-science evidence,
and translates the useful patterns into original deterministic-generator rules.

It is not an endorsement of HWPO's total workload and is not a source-text
library. No source workout descriptions are reproduced in the derived analysis.

## Data and method

| Input | Coverage |
| --- | ---: |
| Flagship 1.0 | 481 days, Days 1–481 |
| 60 1.0 | 661 days, Days 286–946 |
| Total | 1,142 days |
| Flagship/60 directly aligned days | 196 |
| Verified percentage/load annotations | 3,073 |

The reproducible analysis tags movement presence, conditioning modality,
gymnastics skills, format language, section structure, same-day co-occurrence,
seven-day position, normalized loading sequence, rolling 28-day emphasis, and
aligned Flagship/60 retention. Results are presence counts rather than hard-set
counts unless explicitly stated.

Important limitations:

- A movement mentioned in a warmup counts as present, so presence is not the
  same as a hard training exposure.
- Generic `clean`, `snatch`, and `jerk` tags include their named variations.
- Repeated identical loads are deduplicated in the normalized annotation layer,
  so straight-set loading is undercounted. Ascending and backoff detection is
  more reliable than the apparent absence of straight sets.
- Conditioning intensity and duration are inconsistently encoded. Format counts
  describe the source, not a validated physiological dose.
- The 12-week block boundaries are inferred from week labels, strength-program
  transitions, and testing/reset clusters. They are not official API metadata.

## Executive findings

1. Olympic lifting is central. Snatch appears on 43% of Flagship training days,
   clean on 41%, and jerk on 35%. A generator containing only squat, press,
   clean, and deadlift fundamentally misses the methodology.
2. Strength breadth is wide and recurring. Front squat, back squat, strict
   press, bench press, overhead squat, pulls, and multiple Olympic variations
   recur across blocks rather than appearing as isolated novelty.
3. Ascending loading is the dominant reliably detected loading structure: 372
   Flagship and 208 60 sequences. Backoff/wave and descending structures also
   occur, so one universal straight-set progression is inadequate.
4. The source uses a rigid six-training-days/one-rest-day rhythm. This is a
   descriptive HWPO signature, not a rule to copy. Our recovery objective
   requires four default training days and three rest/recovery opportunities.
5. Rowing is the dominant modality. It appears on 72% of Flagship training days
   and 64% of 60 training days, followed by fan bike, running/spin bike, SkiErg,
   and swimming.
6. Mixed formats are not random: rounds/for-time work, EMOMs, intervals, Zone 2,
   AMRAPs, tests, and Tabata recur in different proportions across phases.
7. HWPO often stacks related strength exposures. Back and front squat coexist on
   68 Flagship days; clean and deadlift on 87; overhead squat and snatch on 66.
   Some pairings express coherent sport practice, but the total daily stacking
   creates recovery costs we should reduce.
8. The 60-minute plan retains the day's intention selectively rather than merely
   shortening every section. Across 196 aligned days it retains about 74% as
   many meaningful sections, with high retention of deadlift and rowing but low
   retention of overhead squat and snatch pulls.
9. The strongest block model is 12 weeks/84 days with shorter internal waves.
   Movement emphasis changes across blocks while a broad vocabulary remains.
10. The correct product strategy is selective inheritance: preserve movement
    breadth, block progression, recurring benchmarks, rowing identity, and
    format variety; reject six consecutive training days, routine maximal work,
    redundant same-pattern volume, and bonus-work inflation.

## Corpus results

### Strength and Olympic-lifting presence

| Movement family | Flagship days | % of Flagship training days | 60 days | % of 60 training days |
| --- | ---: | ---: | ---: | ---: |
| Snatch, any named form | 178 | 43.1% | 115 | 20.3% |
| Clean, any named form | 169 | 40.9% | 150 | 26.5% |
| Jerk, any named form | 143 | 34.6% | 110 | 19.4% |
| Deadlift | 140 | 33.9% | 108 | 19.1% |
| Front squat | 124 | 30.0% | 107 | 18.9% |
| Back squat | 98 | 23.7% | 78 | 13.8% |
| Strict press | 79 | 19.1% | 71 | 12.5% |
| Bench press | 75 | 18.2% | 81 | 14.3% |
| Overhead squat | 73 | 17.7% | 20 | 3.5% |
| Snatch pull | 41 | 9.9% | 12 | 2.1% |
| Push press | 34 | 8.2% | 38 | 6.7% |
| Barbell/bent-over row | 25 | 6.1% | 27 | 4.8% |

Named Flagship variations include power clean on 95 days, power snatch on 82,
split jerk on 69, squat snatch on 60, and squat clean on 59. Those counts prove
that power/full receiving positions and jerk variations must exist in the
movement model even when a particular phase emphasizes only some of them.

### Gymnastics and mixed-modal vocabulary

| Skill | Flagship days | 60 days |
| --- | ---: | ---: |
| Pull-up | 115 | 88 |
| Double-under | 71 | 56 |
| Toes-to-bar | 64 | 48 |
| Chest-to-bar | 56 | 37 |
| Rope climb | 53 | 31 |
| Muscle-up | 49 | 32 |
| Handstand push-up | 47 | 30 |
| Handstand walk | 26 | 15 |

These movements should not all appear every week. They belong in skill families
with prerequisites, progressions, substitutions, and exposure ceilings.

### Conditioning modalities

| Modality | Flagship days | % of training days | 60 days | % of training days |
| --- | ---: | ---: | ---: | ---: |
| Rowing | 298 | 72.2% | 360 | 63.6% |
| Fan bike | 213 | 51.6% | 266 | 47.0% |
| Running | 133 | 32.2% | 40 | 7.1% |
| Spin bike | 122 | 29.5% | 85 | 15.0% |
| SkiErg | 101 | 24.5% | 81 | 14.3% |
| Swimming | 44 | 10.7% | 93 | 16.4% |

The public generator should retain rowing as a recognizable identity while
using bikes, SkiErg, running, swimming, carries, sleds, and mixed modalities to
control repetitive stress and preserve variety.

### Conditioning-format presence

| Format language | Flagship days | 60 days |
| --- | ---: | ---: |
| Rounds | 237 | 121 |
| For time | 226 | 101 |
| EMOM | 184 | 362 |
| Test/max/benchmark language | 141 | 158 |
| Intervals | 101 | 180 |
| Zone 2 | 93 | Not reliably titled/tagged |
| AMRAP | 57 | 100 |
| Tabata | 41 | 14 |

The large 60 EMOM count suggests that predictable time structure is an
important compression tool. The generator can use this insight without copying
any prescription: when time is constrained, reduce optional strength/accessory
volume and use a bounded interval structure that preserves the day's stimulus.

### Same-day strength pairings

| Pairing | Flagship days | Interpretation |
| --- | ---: | --- |
| Clean + jerk | 124 | Coherent competition-lift relationship |
| Clean + deadlift | 87 | Olympic practice plus posterior-chain strength, but costly |
| Deadlift + jerk | 71 | Often part of broader clean-and-jerk/deadlift days |
| Front squat + snatch | 70 | Lower-body strength plus Olympic exposure |
| Back squat + front squat | 68 | Redundant squat stress for our default user |
| Clean + snatch | 68 | Broad Olympic practice; high technical demand |
| Overhead squat + snatch | 66 | Coherent skill relationship when OHS is submaximal |
| Clean + front squat | 65 | Coherent receiving-strength relationship |
| Snatch + snatch pull | 41 | Coherent lift/derivative pairing |
| Back squat + bench press | 36 | Complementary lower/upper pairing |

We should preserve coherent relationships but not HWPO's total dose. For
example, snatch plus light overhead-squat technique can be valid; heavy back
squat plus heavy front squat on the same day should not be the default.

### Loading structures

| Reliably detected normalized sequence | Flagship | 60 |
| --- | ---: | ---: |
| Ascending | 372 | 208 |
| Wave or top-set/backoff | 36 | 32 |
| Descending | 40 | 33 |

Straight repeated sets are undercounted because identical annotations are
deduplicated. Even with that limitation, the result decisively rejects using
one `5x4 at a fixed percentage` model for every strength movement.

### Weekly and phase structure

Both plans show an exact seven-position signature: positions 1–6 are training
and position 7 is rest. Flagship contains 68 complete rest positions; 60
contains 95. There are no default midweek rest days in the source.

The inferred macro-structure is 12 weeks/84 days:

1. squat and press foundation;
2. Olympic lifting and posterior-chain intensification;
3. squat, jerk, and bench emphasis;
4. balanced Olympic technique and pulling;
5. squat/press development with snatch exposure;
6. full Olympic integration;
7. power-clean complexes and total-body strength;
8. snatch and upper-body strength with testing;
9. front squat, strict press, and aerobic benchmarking;
10. squat/press strength and clean-and-jerk testing;
11. Olympic-lifting rebuild; and
12. an incomplete balanced continuation.

These are descriptive labels inferred from rolling movement frequency and
testing transitions, not official HWPO block names.

## What the 60-minute transformation teaches us

Across aligned Days 286–481:

- 60 contains an average of 73.7% as many meaningful sections as Flagship.
- It preserves rowing on 90% and fan bike on 83% of aligned Flagship occurrences.
- It preserves deadlift on 87%, back squat on 76%, clean on 73%, jerk on 67%,
  front squat on 66%, and bench on 65% of aligned occurrences.
- It preserves snatch on 49%, push press on 44%, strict press on 35%, overhead
  squat on 35%, and snatch pull on only 4% of aligned occurrences.

This suggests a compression hierarchy: retain the principal lift and bounded
conditioning; remove bonus/accessory work and some secondary technical volume
first. We should not blindly adopt the observed hierarchy, because repeatedly
dropping overhead squat, pulls, and snatch would erase movement breadth across
our own phase. Our 60-minute variant must preserve those movements on their
designated emphasis weeks and reduce something else.

## Evidence reconciliation

The corpus describes what HWPO did; science and product goals decide what our
engine may do.

The 2026 ACSM position stand synthesizes more than 137 studies and 30,000
participants. Its public guidance recommends training all major muscle groups
at least twice weekly, building gradually, using heavier loads around 80% 1RM
for strength for roughly 2–3 sets per exercise, and treating failure and complex
periodization as optional rather than mandatory. This supports regular primary
and secondary exposures but not HWPO-sized daily stacks.

Resistance-training frequency research indicates that higher frequency often
helps by distributing volume; when volume is equated, frequency itself is less
decisive. Therefore, the generator should distribute a recoverable number of
sets across four days rather than force every movement into one enormous day.

Periodized training tends to outperform nonperiodized training for maximal
strength, while linear and undulating models do not show a universal winner.
That supports stable, testable progression families selected for a block rather
than random day-to-day loading changes.

Concurrent aerobic and strength training is broadly compatible with strength
and hypertrophy. Explosive-strength adaptation may be more sensitive to same-
session interference. This supports keeping conditioning but placing Olympic
power work first, controlling subsequent fatigue, and avoiding a high-fatigue
same-pattern metcon after technical lifting.

Failure training is not consistently superior for strength or hypertrophy.
Primary compound and Olympic prescriptions should normally retain repetitions
in reserve and stop on technical degradation.

Olympic-lifting research supports full lifts and pulling derivatives as tools
for power and skill development, but the required technique and mobility mean
they need prerequisites and quality ceilings. Snatch, clean, and jerk belong in
the engine; they should not be forced on an unprepared user or performed as
high-fatigue timed repetitions by default.

CrossFit/HIFT reviews do not establish that the methodology is uniquely unsafe,
but they repeatedly identify advanced technique under fatigue, high-volume
loads, and insufficient recovery as concerns worth managing. That aligns with
the user's prior experience and justifies conservative default spacing.

## Generator rules derived from both sources

### Preserve

- 12-week phase planning with explicit emphasis blocks and internal waves.
- Broad movement vocabulary across the phase, including snatch and jerk.
- Ascending, straight, top-set/backoff, wave, and Olympic technique ladders.
- Coherent lift relationships such as clean + jerk, snatch + pull, and light OHS
  + snatch.
- Rowing as a core modality, supported by bikes, SkiErg, running, swimming,
  sleds, carries, and gymnastics.
- Recurring benchmarks and retests chosen before the phase begins.
- Full and time-compressed versions that preserve the day's principal intent.

### Modify

- Four default training days rather than six.
- Three rest/recovery opportunities rather than one.
- Usually one primary and at most one secondary strength/skill exposure.
- Two hard metcons weekly; remaining conditioning easy or moderate.
- Most metcons bounded to 12–20 minutes.
- Secondary strength typically 2–3 work sets, below primary volume.
- Olympic work terminated for technical degradation rather than fatigue goals.
- Accessories selected to close movement gaps, not inflate the session.

### Reject as defaults

- Heavy back squat and heavy front squat on the same day.
- Heavy deadlift plus large clean volume plus a hinge-heavy metcon.
- Heavy overhead squat plus high-volume snatch plus overhead metcon fatigue.
- Six consecutive demanding days.
- Routine rep-max or maximal conditioning tests.
- Timed high-repetition Olympic lifts for users without validated skill.
- Bonus work that silently converts a 60-minute plan into a second session.
- Random movement selection to manufacture variety.

## Initial 12-week coverage constraints

These are product hypotheses for validation, not scientific universal laws:

| Family | Initial phase expectation |
| --- | --- |
| Back squat | Primary or secondary exposure in 6–8 weeks |
| Front squat | Primary or secondary exposure in 4–6 weeks |
| Overhead squat | Technique exposure in 3–6 weeks when mobility/skill allow |
| Deadlift/hinge | Primary exposure in 6–8 weeks; derivatives fill other weeks |
| Bench press | Meaningful exposure in 6–8 weeks |
| Strict/push press | Combined meaningful exposure in 6–8 weeks |
| Clean | Technique or strength exposure in 6–9 weeks |
| Jerk | Technique or strength exposure in 4–8 weeks |
| Snatch | Technique or strength exposure in 6–9 weeks |
| Olympic pulls | 3–6 weeks as lower-complexity or strength-power derivatives |
| Horizontal/vertical pull | At least one of each weekly across strength/accessory work |
| Gymnastics skill | One selected skill family per block, prerequisite-gated |
| Rowing | Roughly two exposure days per four-session week |

No single week must contain every movement. Coverage is evaluated across the
phase, and phase emphasis can move these values within validated fatigue limits.

## Required engine architecture changes

1. Replace one `StrengthWork` field with ordered primary, secondary, and skill
   exposures.
2. Add a complete movement registry with patterns, joints, skill prerequisites,
   equipment, loading basis, substitutions, and fatigue costs.
3. Add progression-family objects for ascending, straight, top/backoff, waves,
   and Olympic technique ladders.
4. Generate and validate the entire 12-week movement calendar before expanding
   daily workouts.
5. Track direct and indirect weekly set exposure separately.
6. Track technical Olympic repetitions independently from hard strength sets.
7. Add rolling knee, hinge, shoulder, overhead, pulling, grip, impact, and
   systemic budgets.
8. Add phase-level coverage tests so bench, OHS, snatch, jerk, gymnastics, and
   other valid families cannot disappear accidentally.
9. Add same-day and adjacent-day conflict rules.
10. Add a 60-minute reduction policy that preserves designated technical
    movements rather than always deleting them.

## Validation gates before new workouts replace the prototype

- Every 12-week phase passes movement-coverage constraints.
- No unplanned exact conditioning repetition occurs.
- All progression-family load calculations and deloads are tested.
- No week exceeds two hard metcons.
- No heavy squat-family duplication occurs on one day by default.
- No high-fatigue same-pattern metcon follows a technical Olympic session.
- At least two genuine rest days occur every week; default remains three.
- Skill-gated movements always have approved progressions and substitutions.
- Human review evaluates the complete phase, not attractive isolated days.
- Private source text and personalized source prescriptions never ship.

## Evidence sources

- [ACSM 2026 resistance-training position stand summary](https://acsm.org/science-spotlight-acsm-releases-new-position-stand-on-resistance-training/)
- [ACSM 2026 practical recommendations](https://www.acsm.org/wp-content/uploads/2026/03/Resistance-Training-Position-Stand-infographic.pdf)
- [Weekly resistance-training frequency and strength meta-analysis](https://pmc.ncbi.nlm.nih.gov/articles/PMC6081873/)
- [Weekly set volume and strength meta-analysis](https://pmc.ncbi.nlm.nih.gov/articles/PMC5684266/)
- [Periodized versus nonperiodized strength meta-analysis](https://pubmed.ncbi.nlm.nih.gov/28497285/)
- [Linear versus undulating periodization meta-analysis](https://pubmed.ncbi.nlm.nih.gov/25268290/)
- [Concurrent aerobic and strength training meta-analysis](https://pmc.ncbi.nlm.nih.gov/articles/PMC8891239/)
- [Failure versus non-failure resistance training meta-analysis](https://pmc.ncbi.nlm.nih.gov/articles/PMC9068575/)
- [Olympic weightlifting and performance meta-analysis](https://pmc.ncbi.nlm.nih.gov/articles/PMC11153037/)
- [Weightlifting pulling derivatives review](https://pubmed.ncbi.nlm.nih.gov/25689955/)
- [CrossFit methodology review](https://pmc.ncbi.nlm.nih.gov/articles/PMC5826907/)

This is general programming research, not medical advice. Individual pain,
injury, health conditions, and return-to-training decisions require appropriate
professional evaluation.
