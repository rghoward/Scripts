# Programming engine audit — 2026-08-13

## Scope

This review covered the offline deterministic generator, the active 60-workout
published snapshot (`forged_phase_2026_07_27_v6_zone2`), and the publication
validators. It is a mechanical engineering audit; it does not substitute for
coaching review or field testing.

## Corrected finding: duplicate generator date

The generator created the `fullBody` and `capacity` sessions with the same
Saturday date. The snapshot exporter preserved both because it serializes
training sessions in list order, which masked the source-calendar defect.

The fixed generator now has the intended five-session rhythm:

| Day | Role |
| --- | --- |
| Monday | Lower strength |
| Tuesday | Upper skill |
| Thursday | Power / skill practice |
| Friday | Full body |
| Saturday | Zone 2 capacity with direct arms and trunk accessories |

The generator's default athlete rhythm now reflects all five days. A new
publication guard rejects a week unless it contains exactly one distinct
training date on each of those weekdays. The regression test checks both the
Friday full-body and Saturday capacity placement.

The active v6 artifact already serializes in this correct order and the device
schedule is assigned independently by the SQLite schedule repository. This is
a future-publication correction; it does not justify replacing the current
program, renumbering workouts, or modifying completed history.

## Verified controls

* The active snapshot has 60 unique workout signatures.
* Each of its 12 capacity sessions is conditioning-only—no `STRENGTH` section
  is emitted—and includes direct triceps, biceps, and trunk work.
* Existing phase validation retains duration, fatigue, deload, substitution,
  conditioning-format, energy-system, typed-task, and duplicate-prescription
  checks.

## Remaining audit item

`AthleteSettings.trainingDays` is legacy persisted profile metadata and is not
used to alter the immutable published five-day schedule. It should either be
implemented as an explicit, validated schedule-preference feature or removed
from the profile model; it must not be presented as controlling the current
published program until it does. This is separate from the fixed duplicate-date
generator bug.

## External gate

Mechanical validation cannot establish individual safety or training efficacy.
The existing requirement for conservative field testing and qualified
strength-and-conditioning review remains in force before broader release.

## Follow-up

Recheck this audit after one to two weeks of real training use, targeting
**2026-08-27**. Review actual session duration, completion rate, RPE/recovery,
pain or technique flags, and any concrete prescriptions that felt mismatched.
Only accepted findings should create a new tested correction.
