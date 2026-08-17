# Supabase migration and immutable training history plan

## Goal

Move personal workout data from the on-device SQLite store to Supabase without
losing completed work when a new program is activated. A new regimen creates a
new program version; it never overwrites, renumbers, or hides prior training.

## Product rules

1. A completed workout is immutable. Its prescription, completion state,
   results, substitutions, and feedback remain viewable forever.
2. Program versions are immutable after publication. Corrections are recorded
   as append-only transformations, not edits to completed prescriptions.
3. Activating a new program archives the prior version for navigation, but
   never deletes its assignments or completions.
4. Workout sequence numbers are display order only. Cloud identity always uses
   UUIDs and includes the program version.
5. The first five completed sessions in the current local program are imported
   before any new regimen is activated.

## Accounts and authentication

Use Supabase Auth with email/password initially, with Apple and Google sign-in
added only when their native configuration is ready.

* `auth.users` is the source of identity.
* `profiles` contains the user-facing account record: `id`, display name,
  timezone, units, onboarding state, created/updated timestamps.
* Every personal data table has `user_id uuid not null references auth.users`.
* Row-level security requires `auth.uid() = user_id` for read/write access.
* Client apps use the anonymous key only; service-role access is restricted to
  administrative publication and migration tooling.
* Account deletion exports data first, then deletes personal rows and the
  Supabase Auth user according to the final retention policy.

## Proposed cloud schema

### Program content

* `program_versions`
  * `id`, `owner_user_id` (nullable for shared templates), `title`,
    `version_label`, `source`, `status` (`draft`, `active`, `archived`),
    `starts_on`, `published_at`, `archived_at`, `snapshot_json`, `created_at`.
* `workout_prescriptions`
  * `id`, `program_version_id`, `sequence`, `scheduled_offset_days`, `title`,
    `role`, `prescription_json`, `signature`, `created_at`.
  * Unique: `(program_version_id, sequence)` and
    `(program_version_id, signature)`.
* `program_transformations`
  * append-only record of reviewed pre-completion changes to a program
    prescription.

### Personal training history

* `workout_assignments`
  * `id`, `user_id`, `program_version_id`, `workout_prescription_id`,
    `assigned_date`, `status`, `started_at`, `completed_at`, `created_at`.
* `workout_completions`
  * `id`, `assignment_id`, `user_id`, `completion_status`, `completed_at`,
    `section_state_json`, `feedback_json`, `notes`, `created_at`.
  * Append-only; corrections create a new revision with `supersedes_id`.
* `conditioning_results`, `benchmark_results`, `personal_record_history`, and
  `training_max_history`
  * migrated from their existing local equivalents and linked to `user_id`;
    where relevant, link to `assignment_id` and `program_version_id`.

## Row-level security

* Personal tables: select/insert/update only where `user_id = auth.uid()`.
* Program content: a user can read a version only when they own it or possess
  an assignment to it.
* Completed prescriptions and completion events are not mutable by ordinary
  client policies.
* Publication and legacy-import procedures execute server-side and record an
  audit event.

## One-time SQLite import

1. Require sign-in and create the user profile.
2. Read the active local published snapshot and insert it as an archived
   `program_version` named `Legacy program`.
3. Import every displayed legacy workout as an immutable
   `workout_prescription`.
4. Import schedule assignments, completed/partial state, conditioning results,
   benchmarks, feedback, PRs, and training-max history.
5. Reconcile by local snapshot signature plus assignment date; never by
   sequence number alone.
6. Show an import summary and retain the local SQLite database until the user
   confirms cloud history matches.
7. Mark the local import with an idempotency key so a retry cannot duplicate
   history.

## New-regimen activation

1. Upload and validate the new engine-generated snapshot as a new program
   version.
2. Archive the prior version; do not modify its prescriptions or assignments.
3. Create assignments for the new version starting on the selected date.
4. The History screen defaults to current activity but offers program-version
   filters, including `Legacy program`.

## Delivery phases

1. **Complete:** Add Supabase project configuration, email/password Auth,
   automatic profile creation, and row-level security. The existing empty
   Supabase project now contains the initial immutable-history schema.
2. **Complete:** Add program-version and immutable-history SQL migrations,
   optional Flutter bootstrap, account repository, and a Cloud Account screen.
   Builds without configuration stay fully offline.
3. **Complete:** Build a local-only history audit. It inventories programs,
   assignments, completions, archives, benchmarks, PRs, and training maxes
   without writing to Supabase. It explicitly flags sequence-only conditioning
   results for human confirmation.
4. **Implemented; awaiting first signed-in device test:** Build the idempotent
   guided importer. It displays the audit, requires the athlete's explicit
   confirmation, creates deterministic per-account client IDs, writes a
   per-user import marker only after verification, and can safely retry after
   a network interruption. It imports program versions, prescriptions,
   assignments/completions, benchmarks, PRs, training maxes, and basic profile
   data. Sequence-only conditioning scores remain local until their workout
   assignment can be confirmed explicitly.
5. **Next:** Sign in on the Pixel, use the review-and-import control, then
   compare cloud program/assignment counts with the local audit. Do not enable
   background synchronization until that real-device reconciliation passes.
6. **Then:** Add pull/sync with a durable SQLite outbox and account-scoped
   conflict handling. A newly signed-in device must pull only its own immutable
   program versions and history; it must never merge by workout sequence alone.
7. **Then:** Add History UI: current and archived program filters, workout
   detail, import status, and a no-data-loss reconciliation view.
7. Test a full migration using a copy of the current on-device database,
   specifically verifying the first five completed sessions, before enabling
   import for the production Pixel database.
8. **Before inviting additional athletes:** configure custom SMTP, verify the
   sending domain, brand account-confirmation and recovery emails, and test
   delivery. Do not use Supabase's two-emails-per-hour starter mailer for
   production registration.

## Non-goals for the first migration

* Social sharing, coaches, teams, and public workout libraries.
* Cross-device live editing of an in-progress workout.
* Automatic deletion of any historical training data.

## Current pause point — 2026-08-13

* Pixel has Hoots & Reps `1.0.8+6053` installed without clearing app data.
* The build is configured for the Supabase project using build-time settings;
  no URL, key, or service credential is committed to the repository.
* The app can create/sign into athlete accounts and show a read-only local
  history preview. It does **not** upload, download, or synchronize workouts.
* The initial cloud schema and RLS policies are applied. No athlete workout
  data has been inserted into Supabase.
* The guided importer is now implemented in the app but has not yet been run
  against a signed-in athlete account. The current Pixel database has not been
  uploaded. Resume by installing `1.0.8+6053`, signing in, reviewing the
  importer counts, and confirming its one-time import.
* Email confirmation returns directly to the registered native callback
  `com.rhoward.hootsandreps://auth/callback`. It must be allowed in **Supabase
  Dashboard → Authentication → URL Configuration → Additional Redirect URLs**.
  Supabase Flutter exchanges the returned code and the Cloud Account screen
  shows the signed-in state. The readable-page source is ready at
  `supabase/storage/email-confirmed.html`, but it requires an HTML-capable
  host before it can safely replace the direct callback. Supabase Edge
  Functions and Storage-dashboard uploads serve GET HTML as plain text.
* The Supabase starter mailer rate limit was reached during this test. Wait for
  its hourly window before requesting another email; use custom SMTP before
  inviting additional athletes.
