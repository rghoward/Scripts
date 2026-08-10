# Hoots & Reps — Product Roadmap

Last updated: August 9, 2026

## Current shipped baseline

Android build `1.0.25 (6033)` is the current local release. The pre-card-navigation
restore point is the Git tag `hoots-reps-before-card-navigation-1.0.24`.

The daily workout loop now includes:

- one workout per scheduled day, with no forward/backward/skip controls;
- main-card and full-screen Guided Workout flows;
- compact card actions for movement swaps, display/Cast, timer, and completion;
- structured conditioning score entry and an on-card saved-score summary;
- direct links from percentage-based strength/Olympic movements to their PR
  fields, including dedicated references for every percentage movement in the
  published plan;
- workout completion recap with conditioning score, untouched optional work,
  and the next scheduled workout;
- route-strip navigation, current-section resume, automatic next-card focus,
  and compact completed-card summaries;
- Chromecast receiver parity in code and a verified matching deployed receiver.

## Remaining verification

- Physically test HDMI/secondary-display pause, reset, timer, and completion
  behavior. This is a field-test gate, not known unfinished application work.

## Next major initiatives

### 1. Accounts, cloud data, device switching, and manual workout editing

Adopt Supabase/PostgreSQL as the authenticated cloud source of truth while
retaining a resilient local SQLite cache for offline workouts. Account creation,
sign-in, account recovery, and deletion are part of this first initiative—not a
later add-on. The work should include authentication design, row-level security,
conflict-aware sync, backup/restore, and migration of existing local profile,
schedule, results, benchmarks, swaps, and progress.

Manual workout editing belongs in the same initiative. Edited workouts must be
versioned and visibly labeled so the published immutable prescription, the
athlete's local transformations, and an owner-authored manual edit never become
ambiguous. Edits must not silently rewrite completed workout history.

### 2. Watch companion app

Start with the smallest valuable companion: current section, timer state,
pause/resume/reset, interval cues, and section completion/undo. The phone stays
the primary editor and source of truth. Decide Wear OS first (the current Pixel
ecosystem) versus a shared architecture that can later support watchOS.

### 3. iOS feature parity

Define parity as an acceptance checklist, not merely a successful iOS build.
It includes the daily cards, Guided Workout, results and PR editing, schedule,
local persistence, cloud sync when initiative 1 ships, Cast behavior, and an
iOS-specific alternative or explicit scope decision for Android HDMI secondary
display behavior.

### 4. Workout-engine audit and correction

Treat this as a product-quality investigation before adding more programming
surface. Collect concrete examples of the "dumb stuff" the engine produces,
then trace each example to snapshot authoring, resolver transformations,
percentage/PR mapping, progression rules, fatigue/dose validation, or schedule
interaction. Add a regression test and a reviewed correction for every accepted
finding; do not paper over engine errors in the UI.

### 5. Leaderboards and community competition

Build an optional account-based leaderboard after cloud identity and the
workout-result model are stable. A score is comparable only when it shares the
same published workout/version, exact prescription or clearly labeled division,
score schema, units, and relevant equipment/variation. The feature needs
private-by-default profiles, display names, visibility controls, result-edit
history, reporting/blocking/moderation, and server-side validation before a
score can become authoritative. Modified, custom, and Freeblade results remain
valid personal records but must never be presented as comparable Rx scores.

## Recommended order

1. Accounts, cloud data, and manual editing: protect data and enable device
   switching.
2. Workout-engine audit: run this early within the cloud/editor planning so a
   trustworthy published-workout model is what gets synchronized and edited.
3. iOS feature parity: build against the stabilized data and product model.
4. Watch companion: consume the stable phone/cloud workout state.
5. Leaderboards: launch only once account identity, score comparability, and
   moderation controls are ready.
