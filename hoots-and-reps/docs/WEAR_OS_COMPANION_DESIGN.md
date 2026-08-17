# Hoots & Reps Wear OS companion

Status: product and technical design

## Product promise

Hoots & Reps on the watch is the athlete's **live workout control surface**:
the information and actions needed between, during, and immediately after
efforts. The phone remains the place to choose a workout, edit programming,
review history, and make detailed changes. A watch session must remain useful
when the phone is briefly unavailable and reconcile its locally queued actions
when the connection returns.

The first target is Wear OS on Pixel Watch 3 and Pixel Watch 4. Build the
watch as a native Kotlin/Compose Wear OS application rather than attempting to
shrink the phone Flutter interface. The shared boundary is a versioned workout
session payload and append-only action log, which keeps a future watchOS
companion possible.

## Existing Hoots capabilities the companion consumes

The phone already exposes the key primitives needed for a companion:

| Existing surface | Watch use |
| --- | --- |
| Published immutable workout snapshots and local transformation ledger | Display the exact selected variant and its resolved prescription. |
| Guided Workout sections and subsection completion | Show the current section/movement and advance or undo it. |
| Card timer state, transitions, pauses, and resets | Mirror a single authoritative clock and surface interval cues. |
| Typed conditioning tasks and structured score schemas | Know whether a session uses rounds/reps, interval splits, total work, or finish time. |
| Conditioning formats: for-time, AMRAP, intervals, EMOM, steady work | Use a format-specific active screen instead of a generic stopwatch. |
| Strength, Skill Practice, Support Work, and optional Accessory sections | Provide set-level logging and rest without confusing optional work with required work. |
| Cast/secondary-display timer envelope | Reuse the same concept of an active, resumable workout session across screens. |

## Information hierarchy and interaction rules

At any active moment, the watch shows only four things: **what to do now, the
clock, the current progress marker, and heart rate**. It never asks the athlete
to scroll through a full prescription while moving.

- One primary action per screen is large and thumb reachable.
- Crown/rotary input changes a numeric value; it never starts or ends a
  workout by accident.
- Haptics announce transitions and confirmations; sound is optional and never
  required for safe use.
- The display stays glanceable in ambient mode: timer, current phase, and HR
  remain legible; detailed copy may simplify.
- A phone or watch action must produce the same final state. The user should
  not need to decide which device is “in charge.”

## Core screens

### Ready / resume

The default screen shows today's selected workout, the next unfinished
section, and a single `START / RESUME` action. A compact status line says
whether the watch is connected to the phone and whether it has a cached
workout. It does not start heart-rate monitoring until the athlete starts a
workout.

### Live workout header

Every active screen uses a consistent header: section label, elapsed or
remaining clock, and live BPM. Tapping the BPM opens a lightweight zone view:
current BPM, selected zone label, and time in zone for this session. Hoots
should not prescribe medical or recovery guidance; zone targets are optional
athlete settings and the default display is informational.

### AMRAP

Example: `AMRAP 15:00` with `Round 4` and `146 BPM`.

- Remaining time is the dominant visual.
- A large `+ ROUND` button advances the round. A smaller `UNDO` reverses only
  the most recent confirmed action.
- Rotating the crown adjusts the in-progress rep count; tapping `SAVE REPS`
  commits it. The default starts at zero for the next round.
- Finishing early opens a compact confirmation that records rounds and reps
  into the phone's existing AMRAP score schema.

### For time / chipper

Example: `3 / 5 rounds` with an elapsed clock.

- `COMPLETE ROUND` is primary for round-based work.
- A chipper instead shows the current checkpoint and `NEXT MOVEMENT`; the
  athlete can hold the control to mark the whole workout complete.
- At a hard cap, the watch haptics, changes to `CAP REACHED`, and asks for the
  last completed round and reps before saving the existing capped-for-time
  result.

### Intervals

Example: `WORK 1:18`, `Interval 3 of 5`, `Row hard`.

- The phase fills the screen: WORK, REST, READY, or FINISHED.
- The phase transition produces a distinct haptic: three short pulses for
  work, one longer pulse for recovery, and a confirmation pulse at finish.
- The crown selects a completed-work quantity for each interval (calories,
  meters, contacts, or reps); `SAVE SPLIT` commits it. This maps directly to
  the existing interval-splits result model.
- Skipping an interval is explicit and recorded as zero, never silently
  omitted.

### EMOM

Example: `MINUTE 8 / 18`, `12 toes-to-bar`, `0:41 left`.

- The current minute's movement, target, and time remaining are primary.
- The next minute preview stays one line below.
- Minute boundaries always cue with haptics. If the authored template includes
  station target windows, the watch marks `ON PACE` after the target is
  completed and never tries to judge rep quality.
- `DONE` acknowledges a minute's target; it does not automatically assume
  work was completed just because the minute changed.

### Strength, skill, support work, and accessory

Example: `Back squat · SET 2 / 5 · 3 reps @ 245 lb`.

- The watch shows one movement at a time with target sets, reps, and the
  already-resolved suggested load from the phone.
- `LOG SET` confirms target reps at the suggested load. The crown changes
  actual reps or load before confirming; a short review screen prevents an
  accidental large adjustment.
- Logging a set automatically begins the authored/default rest timer. The
  rest screen retains the next-set target, HR, and `START EARLY`.
- Accessory is labeled `OPTIONAL`; completing or skipping it never blocks the
  workout's required completion state.

## Heart rate and Health Services

Starting an active Hoots session starts a watch-owned Health Services exercise
session. Use `ExerciseClient` for the live workout rather than polling a raw
sensor: it provides exercise-appropriate heart-rate updates and lets the app
own a resilient active-exercise lifecycle. First-run permission is requested
in context when the athlete starts, with a clear non-blocking fallback: Hoots
still runs the workout without HR if permission or sensor availability is
absent.

Use current Android health permissions: `READ_HEART_RATE`, and the compatible
legacy sensor permissions on older Wear OS releases. Do not request background
health data for v1. A completed session records only Hoots workout metrics
(average/max HR and time in optional display zones) in its session event; it
does not attempt to mirror or replace Fitbit/Google Health history.

Health Services is the supported Wear OS 3+ fitness layer and supports
exercise-state updates and live metrics. Permission behavior changes on Wear
OS 6/API 36, so the Android module must use version-aware permissions from the
start. See the [Health Services overview](https://developer.android.com/health-and-fitness/health-services)
and [current permission guidance](https://developer.android.com/health-and-fitness/health-services/permissions).

## Phone ↔ watch session contract

The system needs a dedicated `WorkoutSession` separate from the immutable
published prescription and from the final conditioning result.

```text
WorkoutSession (versioned, cached on watch)
  sessionId, workoutSequence, snapshotId, variant, startedAt
  currentSectionId, currentMovementId, state, timerAnchor
  formatPlan (rounds, cap, phases, stations, targets)
  required/optional completion state
  selected conditioning level and resolved display text

WorkoutSessionAction (append-only, idempotent)
  actionId, sessionId, deviceId, occurredAt, sequence
  setStarted | sectionCompleted | sectionUndone | timerChanged
  roundRecorded | repsRecorded | intervalSplitRecorded
  emomMinuteAcknowledged | setLogged | workoutFinished
  heartRateSummaryRecorded
```

The phone creates the session when Guided Workout begins and sends a compact
resolved payload to the watch. The watch caches it before showing `START`.
Both devices persist actions locally. On reconnect, actions merge by
`actionId`; conflicting timer controls resolve by the latest action timestamp,
while completion/score events remain append-only and require a review only if
they describe mutually exclusive final states. The phone derives the existing
section state and final `ConditioningResult` from the merged log.

This avoids trying to synchronize the phone's private widget state or raw
SQLite keys. It also keeps completed workout history immutable.

## Delivery plan

1. **Session foundation:** native Wear OS module, Data Layer transport,
   cached session envelope, watch launch/resume, phone-side session adapter,
   and a watch action log. No HR yet.
2. **Guided control MVP:** current section, timer sync, pause/resume/reset,
   interval haptics, section complete/undo, offline queue and reconciliation.
3. **Format-aware scoring:** AMRAP rounds/reps, for-time rounds/checkpoints,
   interval split entry, and EMOM minute acknowledgment. Verify all output
   against the existing conditioning result schemas.
4. **Lifting loop:** set/reps/load logging, rest timer, support/skill flow,
   and optional accessory handling.
5. **Heart rate:** Health Services exercise lifecycle, live BPM, session HR
   summary, availability/permission states, and physical Pixel Watch testing.
6. **Polish and expansion:** tile/complication for next workout, configurable
   HR zones, richer session recap, and later watchOS assessment.

## Pixel Watch 4 field-test checklist

- Start from phone and watch; verify both show the same current section and
  timer after foreground/background transitions.
- Run one AMRAP, for-time, intervals, EMOM, strength/rest, and optional
  accessory workflow, including undo.
- Deny HR permission, lose the sensor, disable Bluetooth, and reconnect: the
  workout must remain controllable and actions must sync once.
- Test haptic cues under music, ambient mode legibility, sweaty-hand controls,
  crown adjustment, and accidental-tap resistance.
- Compare timer accuracy with the phone after 20+ minutes and at every
  work/rest transition.
- Confirm end-of-workout result mapping, HR summary, and phone recap before
  treating a watch session as complete.

## Explicit non-goals for v1

- Editing workout programming or selecting substitutions on the watch.
- Passive all-day heart-rate collection or medical interpretation.
- Automatic rep detection or movement-quality judgments.
- Publishing competitive scores or changing leaderboard eligibility.
- Replacing Fitbit/Google Health as the user's general health record.
