# Gradescope Missing-Submission Reminders

This project will identify missing Gradescope submissions and send individual reminders from a Georgia Tech Microsoft 365 mailbox.

Current status: Microsoft authentication and test delivery work. The reminder runner supports read-only previews, course-specific policies, duplicate protection, summary reports, and guarded automatic delivery.

## Safety

- The client secret is read from macOS Keychain.
- OAuth tokens are stored under `~/Library/Application Support/Gradescope Reminder/`.
- The Gradescope session cookie is stored with owner-only permissions and reused across routine checks. A new password login occurs only when no session exists or Gradescope reports that it expired.
- Local configuration, token files, student CSVs, logs, and databases are excluded from Git.
- The initial delivery mode is `dry-run`.
- The effective late deadline is the earlier of the Gradescope late deadline and the course-policy limit.
- A completed assignment is processed once, and each student can receive at most one reminder per assignment.
- Gradescope deadlines are refreshed on every check. If a recorded deadline changes, the completed assignment is reopened under the new schedule without resending to students who were already contacted successfully.
- Per-student, per-assignment exclusions can be placed in the ignored local configuration when you have already made special arrangements.
- A daily health check verifies Microsoft delivery, Gradescope login, live mode, and the next matching homework for each configured course.
- A shared process lock prevents reminder, preview, discovery, and health-check runs from overlapping.
- Failed Gradescope logins use persistent exponential backoff, beginning at five minutes and capped at six hours.

## Authentication check

Use the Homebrew Python 3.12 installation:

```bash
cd "/Users/rhoward46/Desktop/my stuff/gradescope missing-submission reminders"
/opt/homebrew/opt/python@3.12/bin/python3.12 auth_check.py
```

On the first run, the checker opens Microsoft sign-in in the system browser. Complete GT sign-in and MFA. Microsoft then returns to a temporary server on `http://localhost:8765/callback`; the success page can be closed after it appears. No callback URL needs to be copied or pasted. The checker requests only basic identity, offline access, and delegated `Mail.Send`. It never creates or sends a message.

Do not paste OAuth callback URLs, authorization codes, tokens, or client secrets into chat or commit them to Git.

## Gradescope connection check

The Gradescope password is read from macOS Keychain. This command reuses the persisted session when available, lists instructor courses and their assignments, and preserves the session for future runs. It does not retrieve student records or send email:

```bash
.venv/bin/python gradescope_discover.py
```

## Test email

Preview the fixed test message without sending:

```bash
/opt/homebrew/opt/python@3.12/bin/python3.12 send_test_email.py
```

Send that exact message to the configured test address:

```bash
/opt/homebrew/opt/python@3.12/bin/python3.12 send_test_email.py --send
```

## Reminder preview

Run the deadline check without sending or recording reminders:

```bash
.venv/bin/python reminder.py
```

Only homework whose regular deadline passed at least five minutes ago and whose effective late window remains open is eligible. A preview never sends mail and never marks an assignment complete.

Preview the two course-specific student messages and summary reports using the next live homework deadlines:

```bash
.venv/bin/python send_template_previews.py
```

Add `--send` to deliver those samples only to the fixed personal test address. This command never sends to students.

Automatic delivery has two safeguards: `config.local.toml` must set `mode = "automatic"`, and the runner must be invoked with `--send`. Keep the mode at `dry-run` until a live preview has been reviewed.

## Ubuntu deployment

On Ubuntu, clone the project as `~/gradescope-missing-submission-reminders`, create the virtual environment, and install `requirements.txt`. Store these two values in `~/.config/gradescope-reminder/secrets.env`:

```text
GRADESCOPE_REMINDER_CLIENT_SECRET=...
GRADESCOPE_REMINDER_PASSWORD=...
```

Protect that file with `chmod 600`. Copy the files under `systemd/` to `~/.config/systemd/user/`, then run:

```bash
systemctl --user daemon-reload
systemctl --user enable --now gradescope-reminder.timer gradescope-reminder-health.timer
```

The reminder timer checks every five minutes and is persistent across downtime. The health timer sends a report each morning at 8:00 AM Eastern. The application processes each assignment only once unless its Gradescope deadline changes. Authenticate Microsoft once on Ubuntu with `auth_check.py` before enabling automatic delivery.
