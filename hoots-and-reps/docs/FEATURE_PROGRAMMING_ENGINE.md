# Feature: Evidence-Informed Programming Engine

Status: Foundation in development

Persistence decision: use local SQLite as the offline source of truth and
Supabase/PostgreSQL for eventual authenticated sync, subscriptions, social
features, and protected leaderboards. See [`DATA_ARCHITECTURE.md`](DATA_ARCHITECTURE.md).

Corpus-wide methodology analysis is documented in
[`HWPO_METHODOLOGY_ANALYSIS.md`](HWPO_METHODOLOGY_ANALYSIS.md). Its movement
coverage, progression-family, fatigue, and anti-pattern requirements supersede
the four-lift prototype wherever they conflict.

The full non-barbell taxonomy and its deterministic selection rules are in
[`HWPO_MOVEMENT_ECOSYSTEM_ANALYSIS.md`](HWPO_MOVEMENT_ECOSYSTEM_ANALYSIS.md).

The current 84-day generated phase audit against private Flagship Days 1–84 is
in [`GENERATED_VS_FLAGSHIP_12_WEEK_COMPARISON.md`](GENERATED_VS_FLAGSHIP_12_WEEK_COMPARISON.md).
The set/contact/time audit is in
[`GENERATED_VS_FLAGSHIP_12_WEEK_DOSE_AUDIT.md`](GENERATED_VS_FLAGSHIP_12_WEEK_DOSE_AUDIT.md).

## Implementation checkpoint: executable safety layer

The local engine now implements and tests:

- separate validated 90-minute full and 60-minute compressed phases;
- session estimates that include set execution, prescribed rest, setup,
  transitions, accessories, warmup, and conditioning;
- conditioning classification from the actual template, including dedicated
  VO2-oriented work/rest intervals rather than the weekday role;
- deterministic exercise ordering, duplicate movement/accessory rejection,
  typed rep/contact/distance/hold units, and explicit conditioning work/rest;
- weighted muscle/tissue, pattern, energy-system, and systemic dose ledgers;
- rolling 7/14/28-day fatigue caps and whole-system deload checks;
- athlete qualification gates with deterministic regressions for Olympic
  lifting, inversion, hanging core, climbing, jumping, double-unders, dips, and
  overhead squats;
- reviewed equipment substitutions followed by normal duration, fatigue, and
  uniqueness validation; generation stops when no reviewed substitution exists;
- explicit restricted-pattern stopping behavior and feedback-driven green,
  yellow, or red next-session responses; and
- local persistence of served full and compressed workout signatures so future
  phases can reject lifetime duplicates.

Generator rebuild checkpoint (August 2026): the conditioning library is now
RX-first and spans row, SkiErg, bike, running/shuttles, sled work, dumbbell
snatches, Olympic derivatives, thrusters, wall balls, genuine box jumps,
double-unders, rope climbs, hanging gymnastics, handstand push-ups, and muscle
ups. Each conditioning prescription carries authored Ember, Forge, and
Ascendant/RX options; athlete qualifications deterministically select a safe
starting layer while Freeblade remains the explicit custom path. The 48
training days retain unique canonical prescriptions and unique deterministic
quest titles, with an explicit phase balance of 12 for-time, 12 interval, 12
AMRAP, 8 EMOM, and 4 steady-aerobic sessions.

The engine and app now provide named cycle-entry rowing calibrations: a combined
200-meter/500-meter power session with 10 minutes between tests on Week 1 Day 1,
and a separate 2,000-meter capacity session on Week 1 Day 4. They replace those
days' conditioning, appear immediately after benchmark-specific warmups, and
leave the strength work afterward so fatigue cannot contaminate the test.
Results are entered on the benchmark card and persisted locally. Once a
2,000-meter split is stored, applicable later rowing sessions receive
deterministic personal split targets.

The application now stores an after-action report containing actual duration,
session RPE, soreness, pain/technique status, variant, and timestamp. This is
local pilot data; it is not evidence that the ruleset is safe or effective for
the public.

Benchmark entry uses one reviewed normalization rule for every time and count
test. Results persist through the SQLite-backed benchmark repository and reload
before the phase is generated after launch. Personalized row, SkiErg, run, and
bike references appear only when the corresponding benchmark exists. Missing,
dismissed, incomplete, or skipped tests retain an explicit RPE 3–8 effort
target selected from the authored effort level rather than an invented pace or
output. Either the 400-meter or mile result may establish a later running
reference, so skipping the earlier speed test does not discard a valid later
capacity result.

Short standalone conditioning tests do not consume the entire conditioning
slot by themselves. Once the result is secured, the 400-meter run uses 8
minutes of recovery before an easy 2,000-meter run, and the 750-meter SkiErg
uses 6 minutes of recovery before an easy 1,500-meter SkiErg. Longer tests
uses a short six-minute easy row after the second effort to downshift, while
remaining free of another hard conditioning prescription.

### Unfinished external release gates

The following cannot be completed by code generation and remain mandatory:

1. Four to eight weeks of conservative personal field testing with review of
   adherence, actual duration, performance, recovery, and pain signals.
2. Independent review by an appropriately qualified strength-and-conditioning
   professional, followed by revision and re-audit.
3. Original-brand, music, mascot, trademark, copyright, consumer-protection,
   privacy, accessibility, and health-policy review before commercial release.
4. A production backend and authenticated per-athlete history store. Local
   SharedPreferences persistence is suitable for this prototype, not a
   subscription service or multi-device source of truth.

### Non-repetition invariant

An exact complete workout prescription must never be served twice to an
athlete. Repeating a movement, progression family, or benchmark capacity is
allowed and necessary; repeating the same canonical combination of warmup,
strength/skill prescriptions, accessories, conditioning, duration, effort, and
movement patterns is not. Cosmetic titles, dates, or quest prose do not make a
workout unique.

The engine computes a canonical prescription signature, rejects duplicates
inside every phase, and rejects any signature supplied from lifetime workout
history. Before multiple phases are released, the app/backend must persist the
athlete's served-signature ledger and pass it into generation. If the safe
candidate library cannot produce a new valid signature, generation must stop
and require new reviewed content rather than silently repeat a workout.

## Canonical roadmap

This document is the canonical roadmap for the programming feature. Future work
is grouped into these tracks:

### Highest-priority architecture correction: published workout snapshots

The prototype's on-device generation of complete full and compressed 12-week
phases is not an acceptable production serving path. It creates long launch and
refresh work, makes a benchmark save appear to freeze the interface, and would
needlessly repeat expensive validation for every athlete.

Before further feature expansion, move to this serving model:

1. Build, mechanically validate, and professionally review canonical workout
   phases offline or server-side. Publish immutable, versioned prescription
   snapshots rather than a generator that runs during app launch.
2. Deliver one published phase to the app and cache it locally for offline use.
   Opening the app must read its current snapshot, not construct 12-week full
   and compressed programs.
3. Limit local personalization to explicit, reviewed transformations of the
   published snapshot: benchmark pace/output references, percentage/load
   rounding, skill/equipment/restriction regressions, and user-approved swaps.
   These transformations must preserve the snapshot identity, show their
   reason, and never rewrite completed work.
4. When a benchmark, restriction, or repeated feedback warrants a material
   future-program change, have the backend issue a newly validated versioned
   snapshot for unfinished work. The app records the rationale and keeps the
   prior served snapshot auditable.

This replaces any implication that an athlete device should invent a whole
program. The deterministic engine remains essential as the publishing and
validation system; it is not the runtime workout server for every app launch.

## Roadmap tracker — August 2026

Status labels: **Shipped** is in the Android app and covered by the current
validation path; **Partial** has a useful implemented slice but still has an
explicit safety, backend, or product gap; **Planned** has not started; and
**External gate** needs human review or launch work rather than more app code.

| Item | Status | Current position / remaining definition of done |
| --- | --- | --- |
| 1–3 | Shipped | Authored libraries, full prescriptions, and compatibility validation. |
| 4 | Partial | Skill/equipment/movement transforms exist; complete substitution revalidation remains. |
| 5–8 | Shipped | Dose/fatigue budgets, phase validation, load rounding, and readiness paths. |
| 9–10 | Shipped | Flexible schedule plus Full/60/Recovery variants. |
| 11–13 | Partial | Private analysis and public-content separation exist; keep auditing public boundaries. |
| 14 | Partial | Maxes, skills, preferences, and equipment exist; onboarding must collect goals plus an optional self-selected sex category (male, female, or prefer not to answer) and a saved default prescription level (Ember, Forge, Ascendant/RX, or Freeblade), with every choice editable from Profile. |
| 15–16 | Shipped | Calendar, swiping, completion, and shatter treatment. |
| 17 | On hold | Post-workout feedback-driven adaptation, by product decision. |
| 18 | Partial | Original identity is present; final public-reference audit remains. |
| 19 | Partial | Mechanical validation is shipped; human review and field testing remain. |
| 20 | Planned | Subscription/content/delivery production architecture. |
| 21 | External gate | Legal, privacy, accessibility, and consumer-review work. |
| 22–25 | Shipped | Tissue ledger, typed units, rolling fatigue, and energy-system validation. |
| 26–30 | Shipped | Qualification gates, safe order, deloads, duration checks, and signature history. |
| 31 | Shipped | Publisher clones and validates every direct reviewed strength/skill substitution edge against the full phase for structural safety, duration, dose, fatigue, energy-system balance, and uniqueness; runtime still screens athlete-specific equipment/boundaries. |
| 32 | External gate | Human programming review and conservative field validation. |
| 33 | Shipped | PRs, training maxes, benchmark history, editing, and load use. |
| 34 | Shipped | Per-workout/always swaps reject unsafe reviewed choices, retain their explanation, and draw from substitution edges revalidated by the publisher. |
| 35 | Shipped | Preferences, restrictions, skills, and Equipment Access ship; explicit temporary/cannot-perform boundaries resolve only future work and are never offered as manual swaps. |
| 35a | Shipped | Publisher audits every displayed warmup, strength, skill, accessory, conditioning, and cooldown catalog edge for deterministic matching, multiple alternatives, successful wording replacement, and quantity preservation; typed strength/skill edges also receive full-phase safety revalidation. |
| 35b | Shipped | Qualified box-jump exposure, contacts, intent, and regressions validate. |
| 35c | Shipped | Publisher rejects loaded or height-dependent conditioning without explicit authored sex-category load/height/target standards, and exposes those standards in the published workout text. |
| 36–37 | Shipped | Conditioning formats, caps, typed score schemas, capture, and Chronicle. |
| 38 | Planned | Optional competition/leaderboard system. |
| 39–40 | Partial | The engine has stable `level_1`/`level_2`/`level_3` IDs and validates authored standards; the app offers persisted Ember/Forge/Ascendant/Freeblade selection, editable custom prescriptions, and result-level recording. The next gap is publishing complete independently reviewed level prescriptions into the snapshot rather than deriving the non-RX display tables locally. No leaderboard comparison is enabled. |
| 41 | Planned | Optional avatar/cosmetics system. |
| 42 | Shipped | Program position, deferral, pause, retroactive resolution, and scheduling safeguards. |
| 43 | Partial | Offline published snapshots, cache, local transforms, and rationale ship; server-authoritative delivery remains. |

### Deferred product decision — Inertius

The Inertius weekly-progress banner and workout-card encounter language are
currently disabled in the app, with their implementation retained. Before they
return, revisit the feature's purpose, athlete value, success criteria, and
whether it belongs in the daily training flow at all.

**Current engineering order:** local product first: finish item 14 training
days/calendar behavior; make conditioning levels athlete-selectable and persist
the selected prescription/result (items 39–40); then make the item
4/35a/35c/39–40 publisher checks produce the shipped asset. Complete item 18
identity polish and optionally item 41 afterward. Defer items 20/21/38/43
(accounts, delivery, subscriptions, leaderboards, and launch work). Item 17
remains on hold. Items 19 and 32 are human-review and field-test gates, not the
next coding projects.

1. Build the original exercise, warmup, accessory, aerobic, interval, and
   metcon-template libraries.
2. Expand weekly intentions into complete movement-by-movement workouts.
3. Add metcon compatibility rules that prevent duplicated or conflicting
   fatigue after primary strength work.
4. Add equipment-, skill-, impact-, preference-, and limitation-aware
   substitutions.
5. Implement weekly and rolling movement, joint, impact, and systemic fatigue
   budgets.
6. Complete and validate deterministic 12-week phases, including progression,
   deloads, and sparing performance tests.
7. Store prescriptions as percentages of current training maxes with sensible
   load rounding and manual overrides.
8. Connect green, yellow, and red readiness inputs to explainable reductions or
   recovery.
9. Support configurable training days and session movement while preserving
   recovery spacing and never creating workout debt.
10. Produce full, 60-minute, recovery, and rest-and-resume variants that retain
    the day's primary intention.
11. Finish private-corpus phase/theme analysis and align Flagship/60 days as
    versions of the same intention.
12. Implement source-similarity rejection and prevent private workout text,
    personal values, and direct third-party references from shipping.
13. Preserve generated, private Flagship, and private 60 views in the personal
    build without making source workouts part of the public generator.
14. Add generator onboarding for goals, maxes, time, equipment, experience,
    skills, preferences, and limitations. Include an optional self-selected
    sex category (male, female, or prefer not to answer) and a default workout
    prescription level (Ember, Forge, Ascendant/RX, or Freeblade); neither
    choice may be inferred, and both remain editable from Profile.
15. Connect generated phases to the weekly calendar and animated day-swiping
    experience on Android and iOS.
16. Retain section completion, randomized shattering, and completion history;
    continue refining the original mascot and animation timing.
17. Collect difficulty, recovery, pain, load, and score feedback and use only
    repeated signals for conservative, explainable adaptation.
18. Keep the cosmic power-metal visual identity and independently authored
    quest mythology while removing direct references before public release.
19. Test complete phases through mechanical validation, human programming
    review, and conservative personal field testing before release.
20. Design subscription, data, content, and delivery architecture for a growing
    commercial user base without weakening deterministic safety guarantees.
21. Complete intellectual-property, consumer-protection, health-policy,
    privacy, accessibility, and ethical launch reviews before public release.
22. Add a muscle-group and tissue-dose ledger that distinguishes direct loaded
    work, secondary involvement, isometric stabilization, preparatory warmup
    exposure, and conditioning exposure rather than counting all mentions as
    equal training sets.
23. Replace generic repetition fields with typed prescription units for reps,
    seconds, meters, calories, watts, pace, contacts, rounds, load, and work/rest
    duration; carries, holds, machines, and jumps must never share ambiguous
    units.
24. Implement weighted rolling fatigue across primary work, secondary work,
    technique, accessories, conditioning, impact, grip, overhead, hinge, squat,
    knee, shoulder, elbow, trunk, and systemic stress.
25. Program energy systems explicitly across aerobic base, threshold, VO2,
    anaerobic capacity, alactic power, and mixed-modal durability instead of
    assuming format variety creates balanced metabolic adaptation.
26. Require athlete-specific skill, strength, range-of-motion, impact, hanging,
    wrist/front-rack, and inversion prerequisites with deterministic regression
    ladders before advanced movements enter strength work or conditioning.
27. Validate exercise order so speed and advanced skill occur fresh, primary
    strength precedes support work, and fatigue cannot accidentally turn
    technical practice into unsafe conditioning.
28. Make deloads reduce total stress rather than barbell load alone, including
    contacts, hanging/grip, advanced skill, hard conditioning, accessories,
    testing, and estimated session duration.
29. Reject workouts whose estimated setup, transitions, work, and rest exceed
    the selected session duration; never rely on the athlete to discover that a
    supposed 60-minute workout takes 80 minutes.
30. Persist each athlete's canonical served-workout signatures and reject exact
    complete-workout repetition across lifetime history while continuing to
    repeat movements, progression families, and intentional benchmark tests.
31. Add stimulus-preserving substitution graphs for equipment, skill,
    limitation, impact, and preference changes, and re-run every fatigue,
    duration, dose, and uniqueness validator after substitution.
32. Require mechanical phase audit, human programming review, and conservative
    field validation of every ruleset before it can be served publicly.
33. Add a personal records and training-max page where athletes can enter,
    date, edit, and review lift and benchmark PRs while maintaining a distinct
    conservative training max used for percentage prescriptions.
34. Add movement-level swapping inside a prescribed workout. Selecting a
    movement must show a short list of reviewed stimulus-equivalent options,
    explain meaningful changes, and rebuild and revalidate the complete workout
    before the replacement is accepted.
35. Add persistent movement preferences and exclusions with separate meanings
    for prefer, dislike, temporarily unavailable, equipment unavailable, and
    cannot perform. Hard exclusions must never be selected; dislikes are soft
    ranking signals and must not silently erase an essential movement pattern.
35a. Maintain an automated substitution-coverage audit across every displayed
    warmup, strength, skill, accessory, conditioning, and stretch movement in
    each complete phase. The audit must catch spelling variants, ambiguous or
    overlapping matches, candidates that break units or workout wording, and
    substitutions that violate equipment, duration, fatigue, or tissue-dose
    constraints. Human review should be limited to genuinely ambiguous choices
    and field-testing feedback, not basic catalog completeness.
35b. Require recurring genuine box-jump exposure for qualified athletes rather
    than allowing all box work to drift into step-ups and step-overs. Store the
    prescribed box height, distinguish jumps from step-ups, count contacts in
    rolling impact budgets, require controlled landing/step-down intent where
    appropriate, and retain deterministic non-jumping alternatives.
35c. Add an explicit RX prescription to every loaded or height-dependent
    conditioning workout. RX must state implement count, load, box/target
    height, movement variation, and relevant sex-category values instead of
    relying on gym folklore. These authored RX prescriptions form the initial
    standard layer and data model for later Ember, Forge, Ascendant, and
    Freeblade levels; they are not inferred by blindly applying percentages.

Implementation checkpoint: athlete settings persist movement states for prefer,
dislike, temporarily unavailable, and cannot perform without interpreting
private notes or generating medical guidance. Workout sections surface a
non-diagnostic caution when their text matches a selected restriction. The
movement catalog now recognizes warmup, strength, skill, accessory,
conditioning, and cooldown movements across the complete 12-week phase.
Athletes can apply each substitution to one workout or all future occurrences;
the result is stored locally, visibly labeled `SUBSTITUTED • CUSTOM`, and can be
undone. Automated phase tests require every displayed movement-bearing line and
every programmed strength/skill movement to have candidates. Remaining work is
semantic human review plus typed load/unit conversion and complete
post-substitution duration, dose, fatigue, equipment, stretch, and uniqueness
revalidation.
36. Add capped for-time rounds, chippers, ladders, couplets/triplets,
    buy-in/cash-out, and fixed-rest total-work intervals. Every task-priority
    workout must declare an intended finish window and a hard 12–20 minute cap,
    and phase validation must prevent AMRAP or EMOM formats from dominating.
37. Add structured conditioning-result entry for time, capped time plus
    completed work, rounds and repetitions, total repetitions, calories,
    distance, load, watts, pace, interval splits, and quality/skill completion.
    Every template must declare its valid score schema before it can be served.
38. Add an optional themed competition system with workout-specific
    leaderboards, personal records, friend groups, divisions, privacy controls,
    moderation, and transparent tie-breaking. Never compare materially different
    prescriptions as though they were the same performance.
39. Give every loaded conditioning movement an explicit prescription standard:
    unit, implement, loading basis, division values, intended repetition range,
    expected cycleability, target finish window, and reviewed scaling ladder.
    Never display an unqualified instruction such as "dumbbell snatches" while
    leaving the athlete to guess the intended load or stimulus.
40. Publish every scored workout with three reviewed standard levels plus a
    custom prescription path. Maintain stable internal IDs (`level_1`,
    `level_2`, `level_3`, and `custom`) while presenting independently authored
    themed names, and provide separate male and female leaderboard categories
    selected by the athlete rather than inferred by the app.
41. Add an original space-fantasy avatar creator to the athlete profile. Workout
    completion, personal milestones, skill development, consistency, and themed
    seasonal challenges may unlock cosmetic equipment, companions, effects, and
    titles without changing workout difficulty, leaderboard scoring, or access
    to safety features.
42. Separate program position from calendar date and add flexible scheduling.
    Preserve visible rest days, provisionally roll unresolved workouts to the
    next valid training opportunity, support vacation/travel pauses and explicit
    deferral, and allow retroactive completion correction without losing workout
    history or required recovery spacing.
43. **Highest priority:** replace runtime full-phase generation with published,
    immutable, versioned workout snapshots that are built and validated offline
    or server-side, pushed to and cached by the app, then personalized only by
    reviewed local transformations. Material changes to unfinished work require
    a newly validated server-side snapshot and an athlete-visible rationale.

Implementation status: the local-first Phase 1 scheduler is now active in the
app. SQLite owns stable workout sequence, mutable calendar assignments, status,
and append-only schedule events. Athletes can complete an entire workout,
defer it and all later unfinished work to safe training slots, intentionally
skip it, pause until a return date, and undo the most recent defer or pause.
Past untouched assignments become `unconfirmed`; beginning any section changes
them to `in_progress`, preventing the app from mistaking forgotten checkmarks
for a deliberate skip. Completed assignments remain fixed when future dates
are rebuilt. Pauses now retain their start and planned return dates, mark away
days in the calendar, and support changing the return date or resuming early;
either operation reflows only unfinished work. A later refinement may add a visually duplicated provisional
assignment while preserving the original unconfirmed card; the current release
keeps one canonical assignment per workout and requires explicit resolution.

## Required flexible schedule and workout-resolution behavior

The workout sequence and the calendar schedule must be separate concepts. A
calendar date passing must never silently consume a workout. Only a confirmed
completion or an explicit skip advances the athlete beyond that workout.

Rest and recovery days must remain visible in the calendar after schedule
changes. Deferred workouts move to the next valid training opportunity while
the scheduler preserves the phase's intended ordering, minimum recovery
spacing, hard/easy distribution, deload structure, and session-duration rules.
The app must not create workout debt by stacking missed sessions into unsafe
future days.

When a scheduled workout passes with no recorded activity, the app should:

- mark the original assignment `unconfirmed` rather than failed or skipped;
- provisionally place the workout into the next valid training slot;
- ask the athlete whether the workout was completed, partially completed,
  deferred, or intentionally skipped; and
- pause further automatic movement after repeated unresolved assignments rather
  than shifting the entire phase indefinitely.

Checking any workout section changes the assignment to `in_progress` and stops
automatic rollover. The workout view must also offer a single action to mark
the entire workout complete for athletes who do not want to check every
section. Partial completion must preserve which sections and prescriptions were
actually performed.

The athlete must be able to:

- move a workout to the next valid training day;
- pause the program until a selected return date for travel, illness, schedule
  disruption, or personal preference;
- resume with the same pending workout rather than the workout originally
  associated with the return date;
- explicitly skip a workout with confirmation;
- resolve an unconfirmed past workout as completed on its original date; and
- undo a schedule operation before it becomes difficult to reconstruct.

Retroactive completion must remove the provisional duplicate and rebuild only
future assignments. Completed workout records, actual performed loads, scores,
feedback, and timestamps must never be rewritten. Every schedule mutation must
be stored as an auditable event with its prior assignment state so local and
future server implementations can reproduce and reverse the same result.

## Required personal-record and training-max behavior

- Store the athlete's actual PR, date achieved, source (tested, competition, or
  estimated), units, and optional note separately from the training max.
- Never silently treat a new PR as the next workout's training max. Show the
  proposed training max and require an explicit athlete decision or a reviewed
  deterministic rule before changing it.
- Support pounds and kilograms without destructive conversion or repeated
  rounding drift. Store a canonical value and remember the display preference.
- Preserve PR history rather than overwriting the previous value so progress
  and regressions remain auditable.
- Permit manual training-max reductions at any time. Increases require suitable
  performance evidence and must not be forced after a single good workout.
- Recalculate future prescriptions after a training-max change while preserving
  completed workout history and the exact loads actually performed.

## Required movement swap and exclusion behavior

Movement selection in the workout view must offer reviewed candidates based on
the intended stimulus, not merely exercises with similar names. Each candidate
must preserve or explicitly disclose changes to:

- primary movement pattern and target tissues;
- strength, power, skill, or conditioning intent;
- range of motion and unilateral/bilateral demand;
- impact, grip, hanging, inversion, joint, and technical requirements;
- equipment and setup requirements;
- prescription unit, expected duration, and loading method; and
- conditioning energy system and interference with the rest of the session.

The athlete can apply a swap to this occurrence only, prefer it in future, or
mark the original movement unavailable. A persistent exclusion must record a
reason category without requiring medical details. Pain-related exclusions stop
progression for the affected pattern and offer only previously reviewed safe
routes or recovery; the app must not diagnose or invent rehabilitation.

After every swap, the engine must recalculate the warmup, accessories, equipment,
stretch block, estimated duration, muscle/tissue dose, rolling fatigue,
conditioning compatibility, session order, and complete-workout signature. If
no candidate passes, the app must say so and preserve the original/rest option
rather than forcing a poor substitution.

## Required scoring and leaderboard behavior

Every conditioning template must own a typed scoring schema. The workout view
must render only fields valid for that schema and validate impossible values.
Supported initial schemas should include:

- for time, with a separate capped result that stores completed rounds/reps or
  last completed checkpoint rather than pretending the cap was a finish time;
- AMRAP rounds plus repetitions, stored as structured rounds and residual reps;
- total repetitions, calories, meters, or other typed work completed;
- load plus successful repetitions for strength-conditioning events;
- interval splits, total work, average pace/power, and repeatability drop-off;
- completion/quality results for noncompetitive skill practice; and
- optional notes, perceived exertion, actual variation, and verified equipment.

Leaderboard identity must include the ruleset version, workout/benchmark ID,
exact prescription, division, variation, units, and scoring schema. Results may
share a board only when those fields are genuinely comparable. Rx, modified,
age-group, adaptive, equipment-alternative, and other divisions must be clearly
labeled; a scaled result is still a valid achievement and must not be disguised
as an Rx result.

Competition must be optional. Athletes should be able to keep results private,
share with approved friends or a private guild, or enter a broader public board.
Public profiles should use a chosen display name and reveal no health, readiness,
pain, body, location, or private workout-history data by default. Include report,
block, moderation, deletion, and result-correction workflows before public
leaderboards launch.

Initial integrity controls should include plausible-value validation, immutable
original result timestamps, edit history, duplicate detection, explicit self-
reported versus event-verified status, and transparent tie-break rules. Do not
present the board as cheat-proof or require invasive surveillance for ordinary
community competition.

The presentation can use original cosmic power-metal language—for example
private "guilds," workout "battles," seasonal "realms," personal "relics," and
earned titles—but the final vocabulary, artwork, sound, and characters must be
independently authored and cleared for commercial use.

## Required conditioning prescription standards

Every loaded or measurable conditioning element must be fully specified. For
example, a dumbbell-snatch template may define an Rx reference division using
50 lb and 35 lb dumbbells, but those values are competition-division standards,
not claims about what every man, woman, or athlete should lift. The displayed
workout must identify the selected division or individualized prescription and
must always show the unit.

Each movement prescription must declare:

- exact implement and variation, such as one dumbbell alternating from the
  floor, one dumbbell from the hang, or two dumbbells;
- pounds or kilograms and whether the value is absolute, percentage-based,
  bodyweight-relative, RPE-derived, or selected from a tested capacity;
- named reference-division values where the workout uses standardized loads;
- expected unbroken repetitions or maximum set duration when fresh;
- intended cycle speed, technical standard, range of motion, and rep-counting
  rule;
- the workout's target completion window, round time, or work/rest expectation;
- the maximum fatigue or technique threshold that triggers a reduction; and
- reviewed load, range-of-motion, skill, and equipment alternatives that retain
  the intended stimulus.

The engine should select the athlete's actual prescription from demonstrated
capacity and the workout stimulus. A useful deterministic rule may choose a
load that permits the intended opening set with reserved repetitions and stable
technique, then round to available equipment. It must not infer capacity from
sex alone. Reference divisions can retain familiar paired standards for shared
competition, while onboarding and personal training use capacity-based values
and allow the athlete to choose the appropriate leaderboard division.

The workout result must store the load and variation actually performed. A
leaderboard entry is comparable only when the required division standard and
movement standard were met; otherwise it belongs in its accurately labeled
modified division rather than being discarded or misrepresented.

## Required standard levels and themed divisions

Every competitive workout should be authored and validated at four levels:

| Internal ID | Working themed name | Purpose |
| --- | --- | --- |
| `level_1` | Ember | Accessible standard preserving the workout's primary stimulus |
| `level_2` | Forge | Intermediate standard with greater load, skill, or density |
| `level_3` | Ascendant | Highest reviewed standard for qualified athletes |
| `custom` | Freeblade | Athlete-specific substitutions, loads, ranges, or equipment |

The themed names remain working product language until final brand clearance.
Stable internal IDs ensure a later naming change does not corrupt workout or
leaderboard history.

Each of Levels 1–3 must be a complete reviewed prescription, not a percentage
applied blindly to Level 3. A level may adjust load, skill, repetitions, range
of motion, target calories/distance, or time expectation only when the resulting
workout retains the intended training stimulus and passes every normal safety
validator. The interface should recommend a level from demonstrated capacity
but show the exact standards and let the athlete make the final selection.

Competitive boards should initially support athlete-selected male and female
categories for each standard level. The app must not infer category from name,
appearance, or workout loads. Product and legal review must determine final
eligibility language and whether an additional open category is required before
public competition launches. Private guilds may choose non-ranked or mixed/open
views without altering the underlying result record.

The board identity must therefore include:

- workout and benchmark ID plus ruleset version;
- level ID and themed display name at the time of the result;
- athlete-selected leaderboard category;
- scoring schema, units, prescribed movement standards, and tie-break;
- exact load, equipment, and variation actually completed; and
- self-reported or event-verified status.

Custom results are first-class accomplishments but are not automatically
comparable merely because they came from the same original workout. Direct
ranking is allowed only among matching custom-prescription signatures. Other
custom results appear in personal progress, completion, or private-guild views
that do not falsely order unlike work. A custom athlete may later move into a
standard level without losing prior history.

## Required athlete profile and avatar progression

The athlete profile should combine functional programming inputs with an
optional original space-fantasy identity. Functional fields include PR and
training-max history, units, goals, schedule, equipment, qualifications,
movement preferences/exclusions, selected workout level, leaderboard category,
privacy settings, and recent recovery signals. Sensitive fitness data and
public avatar/profile data must remain separate in storage and sharing controls.

The avatar creator should support independently selectable body presentation,
skin tones, facial features, hair, colors, clothing, armor, helmets, capes,
boots, handheld cosmetic props, aura/background effects, companion creatures,
badges, and earned titles. Avatar choices must not determine leaderboard
category, prescribed loads, assumed capacity, or available movements.

Working themed cosmetic families may include star-forged armor, comet trails,
nebula capes, moon-metal boots, celestial familiars, enchanted gym relics, and
realm-specific backgrounds. All final names, art, animation, audio, lore, and
silhouettes must be original and pass brand/IP review.

Unlock rules should reward behaviors the product genuinely supports:

- completing a first workout or first full week;
- accumulating workouts without requiring an unbroken daily streak;
- recording a new PR or completing a benchmark reassessment;
- developing a skill through its qualification ladder;
- completing recovery sessions and respecting red-readiness recommendations;
- finishing a phase, themed challenge, or private-guild event; and
- contributing to personal consistency rather than winning a public board.

Missed days, illness, injury, travel, subscription lapse, or choosing recovery
must never remove earned cosmetics or shame the athlete. Cosmetics cannot alter
programming, confer competitive advantage, hide required safety information, or
be the sole mechanism for encouraging excessive training. If cosmetics are
later sold, earned and purchased provenance must be clear and purchases must
not convert into leaderboard or programming advantages.

Prototype avatar state may remain local, but every cosmetic needs a stable ID,
unlock provenance, acquisition timestamp, and versioned asset reference so it
can migrate safely to authenticated cross-device storage later.

## Required dose and tissue model

Every exercise must declare primary and secondary muscular/tissue demands. The
engine must separately aggregate challenging direct sets, low-load tissue work,
technical sets, isometric work, conditioning exposure, contacts, and warmup
preparation. A movement merely appearing in a warmup must not satisfy a weekly
strength or hypertrophy target.

At minimum, the ledger must represent:

- quadriceps, glutes, hamstrings, adductors, abductors, calves/soleus,
  tibialis/feet, and hip flexors;
- spinal erectors/lower back, anterior trunk, lateral trunk, rotation and
  anti-rotation;
- lats, mid/upper back, traps, rear delts, scapular stabilizers, rotator cuff,
  chest, shoulders, biceps/elbow flexors, triceps and forearms/grip;
- Achilles/plantar, patellar, hamstring, elbow, shoulder, wrist/front-rack and
  hanging/inversion tolerance; and
- bilateral, unilateral, sagittal, frontal, transverse, vertical, horizontal,
  rotational and deceleration/landing demands.

Initial weekly target ranges must be configuration reviewed by a human coach,
not hardcoded as universal science. The validator must distinguish a heavy
deadlift set from a light clean technique set, a chest-supported row from an
unsupported row, and a plank from high-repetition GHD flexion.

## Required progression and benchmark behavior

- Preserve stable primary movements long enough to progress strength and skill;
  uniqueness must never force random exercise replacement.
- Never repeat an identical complete workout prescription. Dates, quest names,
  reordered prose, trivial rep changes, or cosmetic substitutions do not create
  meaningful uniqueness.
- Permit intentional reassessment of a lift, erg test, jump, or skill benchmark
  without repeating the complete surrounding workout.
- Store benchmark identity separately from workout identity so progress remains
  measurable while full workouts remain unique.
- Require minimum exposure, recovery, and technique standards before testing;
  do not schedule tests merely to manufacture novelty.
- If all safe candidates collide with lifetime history, stop generation and
  require new reviewed content rather than weakening constraints or silently
  repeating work.

## Required fatigue and recovery validation

Validation must operate over the current day, week, rolling 7/14/28-day windows,
and the full phase. It must include:

- direct hard sets, technical sets, loaded support, bodyweight/skill support,
  contacts, carry distance, hold duration and conditioning time;
- heavy and moderate hinge dose, direct spinal-erector work, bracing and
  supported versus unsupported pulling;
- horizontal/vertical push and pull, overhead, grip, hanging and inversion;
- running, jumping, jump rope, burpees and other shared impact exposure;
- consecutive stress days, monotony, sudden workload changes and deload response;
- readiness reductions that lower the relevant stress rather than merely
  changing the displayed difficulty label; and
- non-punitive rest/resume behavior with no workout debt.

Pain, failed technique, repeated scaling, lost range of motion, or materially
worse recovery must prevent progression and select a safe regression or rest
path. The engine must not diagnose injury.

## Required session-time model

Estimated duration must include warmup, ramp sets, prescribed work, programmed
rest, reasonable transitions, equipment changes, conditioning, cooldown where
required, and optional work only when it fits the selected view. Full,
60-minute, recovery, and readiness-adjusted variants must each be validated
independently after every substitution.

The 60-minute variant removes optional accessories and secondary technical or
support work first. It must preserve the principal adaptation and bounded
conditioning where safe; deferred phase coverage must be rescheduled rather
than permanently deleting smaller movement families.

## Required energy-system model

Every conditioning prescription must declare its intended energy-system target,
time domain, work/rest structure, effort ceiling, repeatability target, and
movement-interference cost. The phase must deliberately distribute aerobic base,
threshold, VO2-oriented intervals, anaerobic capacity, alactic power, and
mixed-modal durability while respecting strength, skill, impact and recovery
goals.

Machine or format changes alone do not constitute a new stimulus. The engine
must reject conditioning that is cosmetically different but physiologically
duplicative when recent exposure, monotony, or fatigue budgets make it
inappropriate.

## Required athlete qualification and substitution model

Advanced Olympic and gymnastics movements require structured prerequisites.
Qualification inputs must cover experience, demonstrated strict capacity,
technical consistency, range of motion, tolerance under low fatigue, impact
history, equipment, limitations and current readiness. Learning occurs in fresh
practice; conditioning use is a later qualified expression.

Every substitution must preserve the intended pattern, muscle/tissue demand,
skill level, energy-system role, impact class and approximate duration. After a
substitution, the resulting workout is treated as a new candidate and must pass
all dose, fatigue, order, time, equipment, safety and uniqueness checks again.

### AI boundary

GPT or another generative model must not create or control workout programming.
The deterministic engine owns weekly structure, exercise selection, sets, reps,
percentages, progression, conditioning, fatigue limits, recovery, deloads, and
substitutions. The app must be able to generate a complete program locally
without an AI or network connection.

AI may optionally draft low-risk presentation content such as quest names,
coaching-language explanations, and prose based on an already-approved plan. It
cannot modify the prescription. Any future AI-proposed variation must pass the
same deterministic constraint validator and is outside the first release.

## Commercial subscription and scale track

Subscription readiness is an architectural constraint, not a launch-day
addition. The product should preserve a useful free or trial experience and
provide honest recurring value through new validated phases, personalization,
history, cross-device continuity, and ongoing product improvements. Never use
injury anxiety, streak loss, hidden terms, or manipulative countdowns to sell or
retain a subscription.

### Scalable architecture

- Keep generation deterministic and version every ruleset, template, phase,
  athlete input, and generated result so a prescription can be reproduced and
  audited.
- Keep safety validation local and/or available during outages; a billing or
  network failure must never silently alter a workout.
- Separate the engine, authored content, user data, subscription entitlement,
  analytics, and presentation layers.
- Use platform-independent domain models and tests so Android, iOS, and any
  future web/backend implementation produce equivalent results.
- Cache the active phase for offline use and define fair grace-period behavior
  when subscription verification is temporarily unavailable.
- Make server generation idempotent, monitor failures and unsafe-rule
  rejections, and support controlled ruleset rollout and rollback.
- Test concurrent users and storage growth before launch; do not prematurely
  build a complex distributed system while usage remains small.
- Provide account export and deletion, data-retention controls, subscription
  restoration, and cross-device entitlement recovery.

### Subscription requirements

- Use Apple and Google purchase/entitlement systems where required, while
  isolating billing behind one internal entitlement interface.
- Clearly show price, billing period, renewal, trial conversion, included
  features, and cancellation path before purchase.
- Provide an easy in-app route to manage or cancel and honor paid access through
  the applicable entitlement period.
- Handle purchase restoration, grace period, account hold, refunds, upgrades,
  downgrades, regional pricing, taxes, and family/device rules explicitly.
- Never lock safety warnings, rest recommendations, account deletion, data
  export, or cancellation behind a subscription.
- Document what ongoing value justifies renewal and review that value before
  introducing a subscription.

### Copyright, trademark, and content provenance

- The private Flagship/60 archive remains analysis-only and must never ship,
  appear in public product views, seed public text retrieval, or become a paid
  content library.
- Abstract programming ideas and simple exercise routines may receive different
  copyright treatment from their specific written expression, selection,
  arrangement, artwork, video, and branding. Do not assume access to a workout
  grants a right to reuse its wording or presentation.
- Maintain provenance for every public template, coaching cue, quest name,
  illustration, sound, font, and data source. Use original work or documented
  commercial licenses.
- Replace Gloryhammer-specific names, characters, lore, likenesses, music, and
  confusingly similar presentation with an independently developed cosmic
  power-metal identity before commercialization.
- Perform a comprehensive trademark clearance search for the final app,
  company, mascot, and subscription names in relevant countries and product
  classes before investing in launch branding or filing applications.
- Have qualified intellectual-property counsel review the corpus separation,
  name clearance, content licenses, and public build before sale.

### Health, privacy, safety, and ethics

- Market the product as general fitness programming, not diagnosis, treatment,
  injury rehabilitation, or individualized medical care.
- Substantiate performance and health claims; avoid guarantees and misleading
  comparisons. Clearly describe intended users, limitations, risks, and the
  evidence supporting material claims.
- Stop or redirect recommendations for sharp, worsening, or persistent pain and
  advise appropriate professional evaluation without diagnosing the user.
- Complete human programming review and conservative field testing before any
  generated phase becomes a public ruleset.
- Collect only data necessary for product function. Treat readiness, pain,
  workout history, biometrics, and limitation data as sensitive even when HIPAA
  does not apply.
- Encrypt sensitive data, minimize staff access, define breach response, vet
  processors, and never sell health/fitness data or use it for targeted ads.
- Obtain specific permission before HealthKit, Health Connect, sensor, or other
  sensitive-data access; keep the app functional when optional permission is
  declined.
- Publish accurate privacy and retention disclosures, complete required app
  store health/data declarations, and evaluate whether the FTC Health Breach
  Notification Rule or other regional privacy laws apply.
- Design for accessibility, varied bodies and abilities, reasonable equipment
  access, neutral language, and non-punitive rest. Avoid shame, compulsive
  streaks, unsafe competition, and dark patterns.
- Define the intended age range before launch and add the required child-safety,
  consent, and data controls if minors are allowed.

This roadmap is product planning, not a substitute for jurisdiction-specific
legal advice. Platform rules and laws must be rechecked near each release.

Implemented foundation:

- Deterministic seven-day generation for a 12-week phase
- Multi-part strength prescriptions with ascending ramps, straight sets,
  top-set/backoff work, loading waves, Olympic complexes, and deloads
- Six-week planned primary/secondary movement rotation spanning back and front
  squat, bench, strict/push press, snatch, clean and jerk, overhead squat,
  Olympic pulls, unilateral work, horizontal and vertical pulling, carries,
  odd objects, and prerequisite-gated gymnastics practice
- Six-pattern conditioning rotation covering row, SkiErg, fan bike, running,
  mixed cyclical work, trunk work, carries, odd objects, and controlled impact
- Runtime validation for rest-day count, hard-session spacing, metcon/strength
  pattern conflicts, loading bounds, advanced-skill volume, and impact budget
- A 60-minute compression path that retains the primary strength prescription
  and bounded conditioning while removing secondary and optional work first
- Percentage-based suggested loads from current training maxes
- Four-week loading waves with scheduled deloads
- At least three recovery/rest days and no more than two hard metcons weekly
- Eight-minute-minimum warmups and 12–20-minute conditioning boundaries
- Deterministic green, yellow, and red readiness adjustments
- Automated tests for the initial safety constraints
- Independently authored exact warmups, accessories, and conditioning for all
  four default training-day roles
- Movement-pattern validation preventing hard metcons from repeating the
  primary lift's dominant fatigue
- Reduced accessory templates for deload and yellow-readiness sessions
- Deterministic two-week rotation with eight distinct warmup, accessory, and
  conditioning combinations
- Structured equipment requirements on generated workouts
- Two intentional rowing-exposure days in each initial four-session week

## Development checkpoint: first generated workouts

The first generator review used these illustrative training maxes:

- Back squat: 275 lb
- Strict press: 135 lb
- Clean: 205 lb
- Deadlift: 335 lb

The first five generated training sessions were:

| Session | Role | Primary work | Conditioning |
| --- | --- | --- | --- |
| Citadel of Squats | Lower strength | Back Squat 5x4 at 70% (195 lb) | 14-minute hard row/upper-body interval |
| Astral Press Academy | Upper strength | Strict Press 4x6 at 65% (90 lb) | 20-minute easy aerobic work |
| Lightning Forge | Power | Clean 6x2 at 65% (135 lb) | 16-minute hard, low-repetition mixed work |
| The Full-Body Reckoning | Full body | Deadlift 4x6 at 65% (220 lb) | 18-minute moderate circuit |
| Citadel of Squats, Week 2 | Lower strength | Back Squat 5x4 at 72.5% (200 lb) | 14-minute hard row/upper-body interval |

Rest days occur between the second and third sessions, the fourth and fifth
sessions, and after the fifth session according to the weekly calendar.

### Comparison with Flagship Days 1–5

The original Flagship days commonly combine several substantial training
stimuli in one day: multiple primary lifts, additional strength work, a hard or
long conditioning piece, high-volume accessories, and optional bonus work.
Examples in the first five days include back and front squat plus bench and
rowing; push press plus a strict-press max and a hard metcon; and overhead
squat, snatch, pulls, lunges, rowing, accessories, and optional intervals.

The deterministic generator intentionally differs by:

- assigning one principal strength or power stimulus per session;
- placing genuine rest days in the week;
- avoiding consecutive hard metcons;
- removing redundant volume and routine max-effort attempts;
- keeping conditioning within 12–20 minutes; and
- progressing stored percentages instead of hardcoded personal weights.

This comparison confirmed that the current weekly structure fits the product's
sustainable-training goal better than copying Flagship's daily workload.

### Current implementation checkpoint

The engine now expands its four default weekly intentions into exact warmups,
accessories, conditioning movements, repetitions, rounds, and work/rest
instructions using an independently authored template library. Hard metcons are
tagged by movement pattern and rejected when they repeat the primary lift's
dominant fatigue.

The engine now has two approved variants per day role, producing distinct Week
1 and Week 2 warmups, accessories, and conditioning while preserving the
strength progression. The next implementation step is to expand to the full
12-week no-repeat target, add phase-level fatigue budgets, and then implement
equipment, skill, impact, preference, and limitation substitutions.

### Structured-variety requirement

Repetitive boilerplate is a release-blocking failure, but unconstrained novelty
is not the solution. The engine must vary workout expression without randomly
changing the underlying program.

Keep stable long enough to progress and measure:

- primary movement families within a phase;
- sets, reps, intensity, and progression intent;
- weekly day roles and recovery spacing;
- fatigue budgets and hard-session limits; and
- tests and retests selected before the phase begins.

Rotate deterministically within approved compatibility groups:

- warmup movements and sequence while preserving tissue and skill preparation;
- accessory exercises every two to four weeks rather than every session;
- conditioning format, movements, and modality;
- interval length and work/rest presentation;
- lower-impact alternatives and equipment equivalents; and
- quest names and presentation language.

The initial library target is at least:

- 4 warmup templates per day role;
- 4 accessory pairings per primary movement family;
- 8 compatible conditioning templates per day role, spanning EMOM, intervals,
  rounds, AMRAP, and controlled aerobic formats; and
- enough compatibility-filtered combinations that no exact conditioning piece
  repeats inside a 12-week phase unless intentionally scheduled as a retest.

Selection must use stable inputs such as ruleset version, phase identifier,
week, day role, athlete equipment, and limitations. Identical inputs must still
produce identical output. The validator must reject novelty that breaks fatigue,
duration, skill, impact, equipment, or movement-overlap constraints.

Automated phase-level tests must verify:

- no accidental exact metcon repetition within 12 weeks;
- no warmup or accessory template used beyond its configured frequency;
- planned progression remains intact despite content rotation;
- modality and movement exposure remain balanced;
- every selected template is compatible with the primary work; and
- changing a quest name or random seed cannot change the prescription.

### Equipment assumption and future editing

The initial generator assumes access to equipment commonly found in a
well-equipped CrossFit-style gym. This includes barbells, plates, squat racks,
benches, pull-up rigs, rings, ropes, dumbbells, kettlebells, medicine balls,
boxes, sandbags, sleds, bands, rowers, SkiErgs, fan bikes, spin bikes, and common
cable or accessory stations where appropriate.

The first release of the generator does not need to constrain selection from an
onboarding equipment inventory. However, every exercise and generated workout
must expose structured equipment requirements rather than leaving equipment
buried only in display text.

A later workout-editing feature will let the athlete mark one or more items as
unavailable. The deterministic substitution engine must then:

- replace only the affected movement when possible;
- preserve movement pattern, stimulus, skill level, intended duration, and
  fatigue profile;
- recalculate repetitions, distance, calories, or loading when equivalence
  requires it;
- revalidate the entire workout after substitution;
- explain what changed and why;
- allow the athlete to choose among approved alternatives; and
- never use a generative model to invent an unvalidated replacement.

Until that editor exists, generated workouts may assume the full common-gym
equipment set. Equipment-specific edge cases and uncommon specialty implements
should still be avoided unless an approved broadly available alternative is
included.

### Rowing as a core modality

Rowing is a recurring characteristic of the private reference corpus. A simple
text-presence audit finds rowing on approximately 63% of Flagship 1.0 days and
55% of 60 1.0 days. This includes warmups as well as primary conditioning, so it
does not imply that every occurrence was a hard rowing workout.

The original public generator should retain rowing as a core modality without
copying source prescriptions or allowing it to crowd out balanced conditioning:

- default to roughly two rowing exposures in a four-session week, with an
  occasional third exposure when one is only warmup or easy aerobic work;
- vary the role among warmup, intervals, mixed metcon, technique/pacing, and
  Zone 2 rather than repeating calorie-row couplets;
- avoid consecutive high-output rowing sessions and account for hinge, pulling,
  grip, and systemic fatigue;
- rotate SkiErg, bike, running, swimming, and carries through the remaining
  conditioning budget;
- allow planned benchmark/retest rowing pieces, but do not accidentally repeat
  exact workouts; and
- track rowing exposure at the phase level so variety tests evaluate modality
  balance, not just exact-text repetition.

### Strength movement breadth and progression families

The initial four-lift engine is an intentionally small prototype and is not
adequate for release. A corpus audit of 481 Flagship 1.0 days finds bench press
on 75 days, overhead squat on 72, front squat on 124, and strict press on 79.
A conservative annotation audit also detects at least 66 sections with three or
more nondecreasing prescribed percentages. The useful variation in strength
work must not be collapsed into one straight-set formula.

The production strength library must include, at minimum:

- back squat, front squat, and overhead squat;
- deadlift and controlled hinge variations;
- bench press, strict press, push press, and suitable dumbbell variations;
- clean, jerk, snatch, and independently programmed pulls or technique
  variations;
- vertical and horizontal pulling; and
- unilateral lower-body and trunk work as accessories rather than substitutes
  for every missing barbell pattern.

Strength prescriptions must come from approved progression families rather than
using the same sets and reps for every lift:

1. ascending/ramp sets with decreasing repetitions and increasing load;
2. straight working sets for repeatable volume;
3. a controlled top set followed by percentage-based backoff sets;
4. technique-volume ladders for Olympic lifts;
5. submaximal waves when appropriate; and
6. reduced-volume deload versions of every family.

Each progression family must define allowable movements, phase purpose,
intensity range, rep range, rest, weekly progression, deload behavior, and
failure ceiling. The engine selects a family for a multi-week block; it must not
randomly change loading style merely to create novelty.

The default four-day week should support carefully budgeted secondary strength
or skill exposures so important patterns are not omitted. A candidate structure
for validation is:

| Day | Primary | Possible secondary exposure |
| --- | --- | --- |
| Monday | Squat family | Bench or horizontal push |
| Tuesday | Upper press family | Pulling strength or skill |
| Thursday | Clean/snatch family | Overhead squat or Olympic technique |
| Saturday | Hinge/full body | Front squat, bench, or complementary upper work |

Secondary work must use fewer hard sets than the primary work and fit the same
weekly fatigue budget. Bench press and overhead squat should recur deliberately
across a phase, not appear as random one-off novelty. Overhead squat frequency
must also respect mobility, skill, and shoulder readiness.

Phase-level tests must verify movement-pattern coverage, horizontal and vertical
press balance, squat-family exposure, Olympic-lift progression, ascending-load
calculation, deload reduction, and the absence of repeated maximal-effort work.

The expansion layer must:

- generate at least eight minutes of warmup specific to the day's movements;
- keep generated metcons between 12 and 20 minutes;
- avoid duplicating the primary lift's dominant fatigue in the metcon;
- respect equipment, skill, pain, and impact constraints;
- provide full, 60-minute, recovery, and rest variants;
- remain deterministic for identical inputs; and
- use independently authored templates rather than source-workout text.

## Product goal

Create original strength-and-conditioning programs that preserve the enjoyable
mixed-modal workout style while optimizing for sustainable strength and
metabolic improvement.

The engine should pursue the smallest effective training dose that produces
progress. It must treat recovery as part of the program rather than as a missed
workout.

## Reference corpus

The private Flagship 1.0 and 60 1.0 archive is a development reference corpus.
It can help identify abstract programming patterns such as:

- 12- and 16-week phase construction
- weekly training-day roles
- strength and skill progressions
- tests, retests, deloads, and phase transitions
- movement frequency and fatigue distribution
- metcon duration and modality combinations
- transformations from full-volume to 60-minute sessions

The engine must not retrieve, reproduce, or lightly rewrite source workouts.
Source text and personalized weights must not ship with a public product.

Before analysis, aligned Flagship and 60 workouts should be treated as two
versions of the same programming intention rather than independent examples.
Weights should be normalized to percentages, RPE, or relative progression.

## Evidence-informed defaults

### Strength

- Train the major movement patterns approximately twice per week.
- Use multiple working sets, with heavier loads when strength is the goal.
- Put the primary strength movement first while the athlete is fresh.
- Do not require routine training to failure.
- Distribute weekly volume instead of concentrating excessive work in one day.
- Use planned reduced-volume weeks and test performance sparingly.

### Metabolic conditioning

- Keep most metcons within 12–20 minutes.
- Default to no more than two meaningfully hard metcons per week.
- Include easier aerobic work for metabolic development at a lower recovery
  cost.
- Avoid consecutive high-fatigue sessions.
- Rotate row, bike, swim, run, and mixed modalities to manage repetitive stress.
- Program running and jumping deliberately rather than by default.
- Avoid placing hard leg conditioning immediately before another demanding
  lower-body strength day.

### Recovery

- Include at least two genuine rest days in the default week.
- Never automatically create "workout debt" after a skipped or recovery day.
- Offer a lower-fatigue alternative for every scheduled workout.
- Treat a correctly chosen recovery day as successful adherence.
- Use deloads before fatigue becomes an injury signal.

## Default weekly structure

| Day | Primary session | Lower-fatigue alternative |
| --- | --- | --- |
| Monday | Heavy strength + approximately 12-minute metcon | Strength only |
| Tuesday | Upper-body or skill work + easy aerobic work | Zone 2 or mobility |
| Wednesday | Mandatory rest | Walking and gentle mobility |
| Thursday | Olympic lifting or power + 12–18-minute metcon | Technique + moderate cardio |
| Friday | Rest or optional recovery | Bike, row, swim, or mobility |
| Saturday | Full-body strength + 15–20-minute mixed workout | Reduced-volume full body |
| Sunday | Mandatory rest | Easy recreational movement |

The schedule must be configurable. Users should be able to move sessions while
the engine preserves spacing and recovery constraints.

## Daily readiness

Before a workout, optionally collect:

- pain
- sleep quality
- soreness
- general fatigue
- stress
- motivation

Readiness modifies the session through explicit rules:

### Green

Perform the planned session.

### Yellow

Apply one or more predetermined reductions:

- reduce load by approximately 5–10%
- remove approximately 25–40% of working sets
- cap intensity by RPE
- replace the metcon with moderate aerobic work
- select joint-friendly movement substitutions

### Red

Recommend rest, walking, or gentle mobility. Do not move the missed workload
onto the following day.

Sharp, worsening, or persistent pain must stop training recommendations and
prompt appropriate professional evaluation. The app must not diagnose injuries.

## Workout variants

Every generated training day should support:

1. Full quest
2. 60-minute quest
3. Recovery quest
4. Rest and resume

Variants must preserve the day's principal intention. Reducing duration should
normally remove accessory volume or shorten conditioning before compromising
the primary strength stimulus.

## Generation architecture

```text
Athlete profile and goals
        ↓
Phase template (usually 12 or 16 weeks)
        ↓
Weekly movement and fatigue budget
        ↓
Daily training intention
        ↓
Original strength and conditioning templates
        ↓
Full / 60-minute / recovery variants
        ↓
Safety, recovery, and source-similarity validation
        ↓
Original Hoots presentation and quest name
```

The core generator should be deterministic and rule-constrained. Generative AI
may assist with original quest names or coaching-language drafts, but it must
not control safety limits, progression, recovery, or exercise selection without
validation.

## Normalized training-intention model

An analyzed source or generated day should resemble:

```json
{
  "phase_week": 4,
  "day_role": "lower_strength_and_mixed_conditioning",
  "primary_pattern": "squat",
  "strength_intensity": "moderate_heavy",
  "metcon_duration_minutes": 16,
  "modalities": ["row", "gymnastics", "dumbbell"],
  "fatigue": {
    "knee": 3,
    "hinge": 1,
    "shoulder": 2,
    "systemic": 3
  }
}
```

## Required safety and quality constraints

- Weekly and rolling fatigue budgets by joint, movement pattern, and systemic
  demand
- Minimum spacing between similar high-fatigue sessions
- Caps on hard metabolic sessions
- Exercise substitutions based on equipment, skill, impact tolerance, and pain
- Progression ceilings and deload triggers
- Detection of conflicting consecutive sessions
- Source-corpus similarity rejection
- Human review for any published training phase
- Clear distinction between general fitness programming and medical advice

## Implementation milestones

### 1. Corpus normalization

- Parse all private workout sections into structured components.
- Remove HTML, source-specific prose, and personalized values.
- Align duplicate Flagship/60 day intentions.
- Tag movements, muscle groups, modalities, duration, intensity, and fatigue.

### 2. Phase and progression model

- Verify inferred 12- and 16-week boundaries.
- Identify recurring weekly roles and progression families.
- Encode testing, retesting, accumulation, intensification, and deload behavior.

### 3. Original exercise and template library

- Create independently written movement definitions and coaching notes.
- Define strength, skill, aerobic, interval, and metcon templates.
- Add equipment and joint-friendly substitutions.

### 4. Constraint engine

- Implement weekly fatigue budgets and session-spacing rules.
- Implement readiness adjustments and recovery alternatives.
- Add deterministic validation and explain why a session was modified.

### 5. Program generator

- Generate a complete phase from an athlete profile and goals.
- Produce full, 60-minute, recovery, and rest variants.
- Verify progression and fatigue across the entire phase before display.

### 6. App experience

- Add onboarding for goals, schedule, equipment, experience, and limitations.
- Add the readiness check-in.
- Let users move sessions without breaking recovery rules.
- Make rest and recovery visible achievements in the Hoots mythology.

## Initial acceptance criteria

- A user can generate a 12-week strength-and-conditioning phase.
- The default calendar contains four training days and at least two rest days.
- No default week contains more than two hard metcons.
- Every workout has full, 60-minute, recovery, and rest paths.
- Readiness changes are deterministic and explainable.
- Moving a workout triggers schedule revalidation.
- Generated output passes fatigue, spacing, duration, and similarity checks.
- No source workout text or personalized source data appears in generated output.

## Evidence references

- ACSM, *Resistance Training Prescription for Muscle Function, Hypertrophy, and
  Physical Performance in Healthy Adults* (2026):
  <https://acsm.org/resistance-training-guidelines-update-2026/>
- Currier et al., resistance-training prescription network meta-analysis:
  <https://pubmed.ncbi.nlm.nih.gov/37414459/>
- Schumann et al., concurrent aerobic and strength training review:
  <https://pubmed.ncbi.nlm.nih.gov/35476184/>
- U.S. Copyright Office, AI training report:
  <https://www.copyright.gov/ai/Copyright-and-Artificial-Intelligence-Part-3-Generative-AI-Training-Report-Pre-Publication-Version.pdf>
