# Gradescope Grading Coordinator

A coordination layer for assigning and tracking Gradescope grading work without restricting what teaching assistants may grade.

## Current MVP

- Frozen submission snapshots prevent late work from shifting existing ranges.
- Each assignment has one grading plan containing an initial batch and appended supplemental/late batches.
- Per-question effort units drive weighted workload totals.
- The instructor sets effort units per question, selects the grading TA pool once, and chooses a distribution style: weighted question ranges or whole student submissions.
- Question-range plans use effort units, preserve contiguous ranges, and split questions only when needed. Whole-submission plans do not use effort units: they divide students evenly and keep every remaining balanced question for a student with one TA.
- Each question is classified as balanced TA grading, instructor/head-TA managed, or excluded. Already graded cells are never reassigned; completed balanced questions can accept future late work, while staff-managed questions remain outside the TA pool permanently.
- Late batches inherit the initial plan's effort values, question modes, staff owners, and distribution style.
- Every plan is represented as question–submission cells, allowing hybrid/manual editing later.
- Draft plans remain private until published.
- Grader workspaces link directly to question-level Gradescope grading pages.
- The instructor dashboard distinguishes assigned work from unassigned late submissions.
- Runtime data stays in an ignored SQLite database.

The app now supports read-only Gradescope importing and progress synchronization. It never changes grades, assignment settings, or staff permissions.

The instructor dashboard can discover current Gradescope courses using metadata only. Opening a course and refreshing its assignment library reads assignment titles and deadlines; rosters, submissions, questions, and grading activity are fetched only when an assignment is explicitly imported for planning.

Gradescope authentication is session-based. The coordinator persists its cookie in the ignored private data directory, locks the session during each read, reauthenticates only after expiration, never calls Gradescope logout during routine work, and pauses authentication for 15 minutes after a failed login. On a shared deployment, set `GRADING_COORDINATOR_GRADESCOPE_SESSION_DIR` to a private directory shared by Gradescope-reading services so they use the same lock and cookie.

## Deadlines and notifications

Every grading batch can have an internally managed deadline, time zone, and instructor note. Publishing requires a deadline. The TA dashboard shows deadlines and overdue state, while the instructor-only statistics page compares first-observed completion with the effective deadline. The persistent notification outbox prepares one assignment notice and one 24-hour reminder per grader, recalculates pending reminders after deadline changes, prevents duplicates, and suppresses reminders when work is already complete.

Versioned Gradescope assignments can be opened as one combined grading family. A combined draft snapshots submissions from every imported sub-version, keeps each physical question tied to submissions from its own version, labels version-specific work in the planner, and automatically groups equivalently titled questions. Instructors can select every equivalent variant at once, then apply shared or exceptional handling rules. The instructor navigation also provides a read-only **View as TA** directory for previewing any grader's published and draft workspace.

Email delivery remains intentionally disabled during local development. Run `.venv/bin/python process_notifications.py` to preview messages that are currently due. A continuous deployment can invoke this command every few minutes before a Microsoft Graph sender is enabled. Set `COORDINATOR_PUBLIC_URL` to the deployed HTTPS address before generating messages for real graders.

## Import a Gradescope assignment

Copy `config.example.toml` to the ignored `config.local.toml`, enter the course and assignment IDs, and store the Gradescope password in macOS Keychain or the configured environment variable. Then run:

```bash
.venv/bin/python import_gradescope.py
```

The importer reads the grading dashboard, submitted-paper export, staff roster, exact grading links, and per-cell grader activity. Re-running it refreshes progress and discovers late submissions without modifying frozen grading rounds.

## Run locally

```bash
cd "/Users/rhoward46/Desktop/my stuff/gradescope grading coordinator"
python3.12 -m venv .venv
.venv/bin/pip install -r requirements.txt
.venv/bin/python run.py
```

Open <http://127.0.0.1:8844> and select **Create demo assignment**.

## Test

```bash
.venv/bin/python -m unittest discover -s tests -v
```

## Safety

The application coordinates responsibilities; it does not change grades or Gradescope permissions. Assignments guide graders without preventing them from helping elsewhere. Real credentials, student data, local configuration, and the SQLite database must never be committed.
