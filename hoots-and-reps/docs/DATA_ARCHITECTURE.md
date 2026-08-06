# Data Architecture

Decision: Hoots & Reps will use a local-first architecture with SQLite on the
device and Supabase/PostgreSQL as the eventual authenticated cloud source of
truth.

## Boundaries

- SQLite owns immediate offline reads and writes.
- SharedPreferences is limited to lightweight display preferences and temporary
  migration compatibility.
- PostgreSQL owns cross-device history, account data, subscription entitlement,
  protected result submission, guilds, and leaderboards.
- The deterministic programming engine remains separate from persistence.
- Workout prescriptions and completed sessions are immutable historical facts.
- Schedule assignments can change, but every change is represented by an
  append-only schedule event that supports audit and undo.
- Client-generated stable text IDs will map to PostgreSQL UUIDs without changing
  identity during synchronization.

## Delivery sequence

1. Create and test the versioned SQLite schema.
2. Migrate existing SharedPreferences profile, completion, schedule-start, and
   served-signature data idempotently.
3. Implement flexible scheduling against repositories rather than UI state.
4. Add a durable synchronization outbox and deterministic conflict handling.
5. Create the Supabase project, PostgreSQL migrations, authentication, and Row
   Level Security policies.
6. Add protected server-side result submission and leaderboard projections.
7. Add purchase-provider verification and store entitlement state in the cloud.

## Leaderboard trust boundary

The app may create a pending result submission, but it must not directly write
an authoritative ranked entry. A protected server function validates athlete,
ruleset, workout version, exact prescription signature, division, score schema,
plausibility, visibility, and verification status before publishing the result.
