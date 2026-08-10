# Hoots & Reps — Project State

Last updated: August 9, 2026

## Purpose

Hoots & Reps is a local-first Flutter workout application with an original
space-fantasy/power-metal identity. Its public direction is an independently
authored subscription product driven by a deterministic, evidence-informed
programming engine—not an LLM workout generator and not a redistribution of
private third-party programming.

This file is the compact starting point for a new Codex task. Read it first,
then open only the detailed document needed for the requested feature.

## Current delivery snapshot — August 9, 2026

The current Android build is `1.0.25 (6033)`. Recent daily-loop work is
complete: Guided Workout, structured conditioning scores, direct percentage-lift
PR editing, card route navigation/resume/focus, compact card summaries, and the
workout-completion recap. Chromecast parity is implemented and its deployed
receiver matches the checked-in source. HDMI still needs physical field testing.

The pre-card-navigation restore point is the pushed Git tag
`hoots-reps-before-card-navigation-1.0.24`.

The owner-confirmed next initiatives are cloud data/device switching plus
manual workout editing, a watch companion, iOS feature parity, and a rigorous
workout-engine audit. See [`docs/PRODUCT_ROADMAP.md`](docs/PRODUCT_ROADMAP.md)
for scope and recommended order.

## Canonical documents

- Programming roadmap and release gates:
  [`docs/FEATURE_PROGRAMMING_ENGINE.md`](docs/FEATURE_PROGRAMMING_ENGINE.md)
  (including the current shipped/partial/planned roadmap tracker)
- Product priorities and current-delivery record:
  [`docs/PRODUCT_ROADMAP.md`](docs/PRODUCT_ROADMAP.md)
- Local/hosted data plan:
  [`docs/DATA_ARCHITECTURE.md`](docs/DATA_ARCHITECTURE.md)
- Current generated 12-week phase:
  [`docs/PHASE_1_FULL_PROGRAM.md`](docs/PHASE_1_FULL_PROGRAM.md)
- Methodology analysis:
  [`docs/HWPO_METHODOLOGY_ANALYSIS.md`](docs/HWPO_METHODOLOGY_ANALYSIS.md)
- Movement-ecosystem analysis:
  [`docs/HWPO_MOVEMENT_ECOSYSTEM_ANALYSIS.md`](docs/HWPO_MOVEMENT_ECOSYSTEM_ANALYSIS.md)
- Private-corpus comparison:
  [`docs/GENERATED_VS_FLAGSHIP_12_WEEK_COMPARISON.md`](docs/GENERATED_VS_FLAGSHIP_12_WEEK_COMPARISON.md)
- Dose audit:
  [`docs/GENERATED_VS_FLAGSHIP_12_WEEK_DOSE_AUDIT.md`](docs/GENERATED_VS_FLAGSHIP_12_WEEK_DOSE_AUDIT.md)

If this summary conflicts with the canonical roadmap, update this file and the
roadmap together as part of the feature being changed.

## Current product state

### Current work order

The core daily loop is now shipped. The current owner-confirmed order is in
[`docs/PRODUCT_ROADMAP.md`](docs/PRODUCT_ROADMAP.md): cloud data/device
switching plus manual workout editing first, with a workout-engine audit early
in that planning; then iOS parity and a watch companion.

The programming-specific open work remains item 14 onboarding, independently
reviewed per-level conditioning prescriptions (items 39–40), original
identity/public-reference polish (item 18), and the human-review/field-test
gates (items 19 and 32). Item 17 remains on hold. Inertius remains hidden
pending a separate product decision.

- Flutter app targeting Android now, with future iOS portability retained.
- Bottom navigation for training, chronicle, and athlete/profile areas.
- Weekly calendar, day swiping, flexible scheduling, deferral, intentional
  skipping, travel pause, early return, and schedule undo.
- Local SQLite scheduling is the source of truth. Supabase/PostgreSQL remains
  the planned production backend for accounts, subscriptions, synchronization,
  protected workout delivery, and leaderboards.
- **Highest-priority architecture work:** stop generating complete 12-week
  phases in the athlete app at launch or benchmark save. The deterministic
  engine must instead build and validate immutable, versioned workout
  snapshots offline/server-side; the app receives and caches a published
  snapshot, then applies only reviewed local transformations for benchmarks,
  loads, skills, equipment, restrictions, and user-approved swaps. Material
  future-program changes require a newly validated snapshot for unfinished work
  with an athlete-visible reason. This follows an emulator failure where full
  on-device regeneration made result entry appear frozen.
- **Snapshot serving progress (August 4, 2026):** the app now ships with a
  reviewed `forged_phase_2026_07_27_v4` JSON snapshot and loads its 90- and
  60-minute prescriptions at startup rather than invoking the programming
  engine. The deterministic engine is used by the offline snapshot-export
  tool. Existing schedule, completion, result, and benchmark state remains
  local. The published snapshot is now stored in a normalized SQLite snapshot
  repository with a separate append-only local-transformation ledger. Benchmark
  results, profile changes, and approved movement swaps create audit entries;
  profile changes and benchmark saves no longer regenerate the phase. A fresh
  launch renders from the bundled snapshot first, then imports it to SQLite
  after the workout shell is ready so the cache write cannot block first use.
  The next slice is to make each recorded transformation resolve into the
  displayed future-workout view with its athlete-visible reason. Benchmark
  pace/output references and training-max load references now resolve only in
  unfinished displayed workout sections; completed workouts retain their
  original snapshot text. Existing reviewed movement swaps retain their local
  disclosure. Skill/equipment regression selection remains the next resolver
  extension.
- **Published future-workout shell (August 4, 2026):** the snapshot publisher
  renders each reviewed workout as `Warm-up → grouped training work →
  Conditioning/Benchmark → Cooldown`. Within grouped training work, Strength,
  Skill Practice, and Support Work are separate categories and retain every
  reviewed movement; a category may contain multiple independently completable
  movements. Accessory remains separate, optional, and capped at one movement.
  Double-under/gymnastics/Olympic technique work is labeled `Skill Practice`,
  while required step-ups/lunges are `Support Work`. Benchmarks follow the
  training work rather than displacing it. The exporter validates category
  order and the one-accessory cap for both session variants, and the shipped
  `assets/data/published_program_snapshot_v1.json` is regenerated from this
  grouped published surface.
- **Local substitution safety (August 4, 2026):** reviewed manual alternatives
  are screened against Equipment Access and explicit temporary/cannot-perform
  movement boundaries. The same hard boundaries resolve only unfinished
  workout text and record an athlete-visible reason; completed prescriptions
  remain immutable. Cardio-equipment fallbacks choose one available machine or
  running rather than cycling through unavailable machines. The offline
  publisher now clones every direct reviewed strength/skill substitution edge
  into the full phase and reruns structural, duration, dose, fatigue,
  energy-system, and uniqueness validation before publishing; runtime remains
  responsible only for athlete-specific equipment and boundary screening.
- **Published-surface and standards audits (August 4, 2026):** the publisher
  checks every displayed catalog edge for deterministic wording and quantity
  preservation, while typed strength/skill substitutions receive full-phase
  validation. Conditioning now displays authored RX standards for loaded and
  height-dependent work, includes stable level IDs (`level_1` through
  `level_3`) in the snapshot metadata, and states a distinct custom-recording
  path rather than comparing unlike prescriptions.
- **Visible RX reference (August 5, 2026):** a legacy bundled snapshot had the
  authored RX standard only in its signature, not in the conditioning card.
  The app now resolves the published template ID to the same explicit RX
  reference at display time, so Day 2 specifies one dumbbell at ♀ 35 lb / ♂
  50 lb and every other loaded/height-dependent conditioning movement exposes
  its authored standard. The workout card now supports Ember, Forge,
  Ascendant/RX, and editable Freeblade selections; recorded results preserve
  the selected label and actual prescription. The displayed duration uses the
  workout's explicit conditioning clock rather than a generic range.
- Personal-record and training-max profile exists.
- Athlete Profile also persists self-selected skills and experience (Olympic
  lifting, gymnastics, rope, jump-rope, box-jump, and ring-dip skills). New
  profiles retain the prior fully-qualified defaults; turning a skill off is
  manually editable at any time and passes that selection into phase
  generation, which uses the existing reviewed progression instead. The same
  settings model is ready to be reused by a future account-setup flow.
  Profile home exposes a dedicated Skills & Experience entry that opens those
  toggles directly, distinct from the separate Movement Boundaries editor.
- Conditioning sections now offer local, editable structured result capture.
  For-time sessions record either a real finish time or capped completed work;
  AMRAPs record rounds and reps; interval sessions retain each interval's
  calories, meters, contacts, or repetitions; EMOM and steady work record a
  total. Each result keeps its score schema, template, selected workout
  variant, timestamp, and optional athlete note. This is private local history,
  not a leaderboard submission.
- The Battle Chronicle now surfaces that private result history newest-first,
  with score-type filters, score details, interval splits, athlete notes, and
  an open-workout path back to the source prescription. A personal-best marker
  appears only when there are at least two results with the same template,
  variant, score schema, and unit; it never compares materially different work.
- Persistent movement preferences and reviewed per-workout substitutions exist.
- Section completion, randomized shattered-card treatment, and themed UI exist.
- Direct references to third-party brands or characters must not ship publicly.

## Programming engine state

Primary implementation:

- `lib/programming/programming_engine.dart`
- `lib/programming/workout_template_library.dart`
- `lib/programming/movement_substitutions.dart`

Current deterministic phase:

- 12 weeks
- 4 training days per week
- 48 unique training prescriptions
- 12 for-time sessions
- 12 interval sessions
- 12 AMRAP sessions
- 8 EMOM sessions
- 4 steady-aerobic sessions
- Conditioning is normally 12–20 minutes.
- For-time workouts carry a separate, validated expected finish window (usually
  10–14 minutes) as well as a hard safety cap; caps are not treated as the
  intended dose. The initial short round-based for-time templates were
  recalibrated upward accordingly.
- Phase generation requires balanced aerobic-base, threshold, VO2, anaerobic,
  mixed-modal, and strength-derived alactic-power exposure rather than relying
  on format variety alone.
- Athlete skill qualifications are enforced across strength and conditioning.
  Missing Olympic-lifting, overhead-squat, hanging-core, inversion, rope-climb,
  muscle-up, double-under, box-jump, or ring-dip qualifications route to a
  reviewed progression. Full beginner-phase tests ensure unqualified
  conditioning movements are not served; this is a conservative programming
  gate, not an assessment of medical fitness or movement clearance.
- Training days end with an approximately eight-minute muscle-driven stretch.
- The tissue-dose ledger now records conservative, non-medical programming
  exposure by source: direct strength work, secondary strength work,
  isometric stabilization, warmup preparation, accessories, and conditioning.
  It preserves aggregate tissue totals for safety validation and exposes the
  source-qualified audit in the generated phase artifact. Rolling 7/14/28-day
  caps now cover selected direct, secondary, stabilization, grip, and
  feet/ankle exposure sources. This is a programming guardrail, not an injury
  diagnosis or individualized medical load model.
- Structured prescriptions now sit behind the athlete-facing workout text.
  Conditioning tasks carry explicit reps, meters, calories, contacts, rounds,
  and work/rest clocks where authored; strength exposes typed suggested loads.
  The generator rejects a displayed conditioning prescription that has no
  typed task data, and the generated 12-week audit exports those task records.
- Weighted rolling-fatigue validation now aggregates primary and secondary work,
  technique, accessories, conditioning, impact, grip, overhead, hinge, squat,
  knee, shoulder, elbow, trunk, and systemic stress over 7-, 14-, and 28-day
  windows. The phase export includes each day's weighted-fatigue audit.
- Exact complete workout prescriptions may never repeat for an athlete.

Conditioning is RX-first and exposes these levels:

- Ember
- Forge
- Ascendant / RX
- Freeblade / custom

The movement library includes common CrossFit equipment and movement families,
including rower, SkiErg, fan bike, running, sleds, barbells, dumbbells,
kettlebells, boxes, jump ropes, wall balls, sandbags, rope climbs, gymnastics,
strength lifts, and Olympic lifts.

## Calibration and benchmark schedule

The app currently places these tests strategically:

- Week 1 Day 1: 200 m and 500 m row tests with 10 minutes recovery, then a
  six-minute easy-row downshift
- Week 1 Day 4: 2,000 m row test
- Week 2 Day 1: gymnastics capacity screen
- Week 2 Day 2: 400 m run
- Week 3 Day 2: 750 m SkiErg
- Week 4 Day 1: one-mile run
- Week 5 Day 2: ten-minute fan-bike calories

Long tests replace conditioning. Short standalone tests retain useful training
volume after the result is secured: the 400 m run is followed by 8 minutes of
recovery and an easy 2,000 m run, while the 750 m SkiErg is followed by 6
minutes of recovery and an easy 1,500 m SkiErg. The paired short-row session
uses 10 minutes between tests, then a six-minute easy row to downshift after
the second effort rather than adding another hard conditioning piece. The
gymnastics screen retains the normal conditioning. Results persist
locally and later row, SkiErg, running, and bike prescriptions can display
personalized pace/output references.

Benchmark integration quality items 1–4 are complete:

- every time/count entry type has a centralized, tested normalization rule;
- SQLite-backed results survive app process restart and reload before phase
  generation;
- personalized numbers appear only after the relevant modality result exists;
  and
- skipped, dismissed, or incomplete tests leave later work on an explicit
  authored RPE target instead of inventing pace or output.

Benchmark history and profile editing are complete:

- schema version 2 stores each benchmark attempt as an immutable event with
  separately keyed canonical result values;
- the prior single-value `benchmark_results_v1` snapshot migrates once into a
  legacy history event without losing its calibration values;
- the athlete profile's Benchmark Chronicle shows every calibration/retest and
  permits correction of an individual event; and
- the latest recorded value for each metric remains the sole value used to
  personalize future pace and output references.

Intentional late-phase retests are scheduled after the accumulation block:

- Week 10: paired 200 m/500 m row and 2,000 m row;
- Week 11: gymnastics screen, 400 m run, and 750 m SkiErg; and
- Week 12: mile run and ten-minute fan-bike calories.

These reassessments create new history events rather than overwriting their
cycle-entry calibration records.

## Workout naming

Names are deterministic and derived from:

1. the primary strength movement;
2. the conditioning modality and distinctive movements;
3. the conditioning structure; and
4. whether the progression is returning in the second half of the phase.

Arbitrary fantasy-word combinations are prohibited. The name must still make
- `The Unbroken Shield: The Clockwork Clean-and-Jerk`
- `The Iron Throne: Oars Against the Rising Tide`
- `The Chains of the Deep: The Long Oar`
- `The Lightning Snatch: The Oar and Iron Pendulum`

Named benchmark days may override the ordinary generated title, such as
`The Twin Trials of Velocity` for the paired rowing tests.

## Persistence and architecture

- Current local store: SQLite plus limited legacy/shared preference migration.
- Program position is separate from calendar date.
- Existing local progress and schedule history should be preserved during
  migrations.
- Production direction: Supabase/PostgreSQL, server-authoritative published
  ruleset versions, immutable prescription snapshots, and per-athlete served
  signature history.
- The deterministic generator must not silently mutate already-served workouts.

## Safety, legal, and product boundaries

- The app must not diagnose injuries or prescribe medical treatment.
- Movement exclusions and substitutions are athlete choices, not medical advice.
- Public workout text, names, mythology, music, art, and mascot assets must be
  independently authored.
- Private reference workouts may remain in the local research corpus but must
  not be bundled into or served by a public product.
- Before sale: professional programming review, conservative field testing,
  privacy/accessibility review, trademark/copyright review, consumer-protection
  review, and production security work remain mandatory.

## Verification commands

Run focused tests while developing. Run the complete checks once at the end of
a coherent feature batch:

```sh
flutter analyze
flutter test
flutter build apk --debug
```

Latest publishing-layer verification (August 4, 2026): the deterministic
generator preserves the reviewed movement plan; the exporter and shipped
snapshot group it into Strength, Skill Practice, Support Work, and optional
Accessory. `flutter analyze` was clean; the focused programming-engine and
published-snapshot tests passed after exporting the 48-workout snapshot. A
complete `flutter test` run was also attempted: its remaining widget-test
failures are the known bundle-fixture issue for the `rootBundle` snapshot path,
not programming assertions.

Latest completion and regression verification (August 4, 2026): “Mark Entire
Quest Complete” now completes every visible section—including optional
Accessory—and each independently completable movement within grouped training
sections. The snapshot export, `flutter analyze`, and focused programming,
snapshot, and SQLite persistence tests passed; the debug APK was rebuilt and
installed successfully on `emulator-5554` with 703,588 KB free in `/data/user/0`.
The complete widget-test harness remains a separate test-infrastructure task:
its repeated app boots race the in-memory SQLite lifecycle after the first
widget case, while the focused non-widget suite and manual emulator validation
are clean.

Generated-program artifacts are refreshed with:

```sh
dart run tool/export_12_week_program.dart
python3 tool/build_phase_1_program.py
python3 tool/build_12_week_comparison.py
python3 tool/build_12_week_dose_audit.py
```

Latest verified state before this document:

- Focused athlete-profile persistence and skill-to-generator wiring tests after
  editable skills work: passed; Flutter analysis: clean.
- Focused conditioning-result repository tests after structured score capture:
  passed; Flutter analysis: clean.
- Focused Battle Chronicle widget check after result-history presentation:
  passed; Flutter analysis: clean.
- Emulator validation after result-history work: the debug APK was installed
  fresh on `emulator-5554` and reached the Quest screen. This exposed a
  production-default-profile rolling-fatigue threshold mismatch; the systemic
  seven-day cap was recalibrated from 38 to 39 and a regression test now
  generates the seeded production profile. Initial debug startup still spends
  several minutes computing the complete deterministic phase on this emulator;
  reducing that first-launch cost is a follow-up performance task.
- Focused programming-engine and widget tests after tissue-dose ledger work:
  passed
- Flutter analysis after tissue-dose ledger work: clean
- Android debug build after benchmark history work: successful. A subsequent
  tissue-ledger rebuild initially hit a local Gradle/FSEvents cache-access
  issue; the build now succeeds using an isolated temporary Flutter dependency
  cache.
- Emulator validation: installed the debug APK on `emulator-5554`, force-stopped
  and relaunched it, then opened the athlete profile; the migrated legacy
  benchmark record appeared in Benchmark Chronicle with formatted values and
  opened its correction sheet successfully
- Latest debug APK:
  `build/app/outputs/flutter-apk/app-debug.apk`
- Emulator is running as `emulator-5554`.
- Snapshot verification: the debug APK was installed on `emulator-5554` and
  opened directly to Week 1 Day 1, `The Twin Trials of Velocity`, after the
  published snapshot migration. Flutter analysis was clean. Existing widget
  tests need a test asset-bundle fixture before they can exercise this
  `rootBundle` loading path; the real Android launch was used for this check.
- Snapshot repository follow-up: `flutter analyze` was clean and focused
  SQLite schema/repository tests passed. A fresh emulator install with cleared
  app data opened Week 1 Day 1 after the bundle-first load and background
  SQLite import.

## Efficient Codex workflow

To conserve workspace usage:

1. Start a fresh Codex task for each coherent feature or bug group.
2. Ask the task to read `PROJECT_STATE.md` first.
3. Name the relevant roadmap item or desired outcome.
4. Batch related changes into one request.
5. Use focused tests during iteration and one full analyze/test/build cycle at
   the end.
6. Prefer the lower-cost suitable model for routine implementation; reserve the
   strongest model for architecture, safety audits, or difficult failures.
7. Update this file when architecture, shipped behavior, current verification,
   or the next priority materially changes.

## Suggested next feature task

Return to the highest-priority unfinished item in the canonical roadmap.
