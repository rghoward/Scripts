# Canvas + Gradescope Deadline Extension Manager

A small local Python/Tkinter GUI for giving one student deadline extensions across Canvas and linked Gradescope assignments.

## What it does

- Select term → Canvas course → enrolled student.
- Select one or many dated assignments.
- Shift each assignment's normal and late deadline by a number of days.
- Give every selected assignment the same deadlines.
- Set dates manually for individual assignments.
- Create or update a Canvas student assignment override.
- Auto-match a Gradescope course, assignment, and student, then create/update the student's Gradescope extension.
- Preview every destination and date before enabling the Apply button.
- Report Canvas and Gradescope success separately so a partial update is visible.

Canvas's **available until** date is treated as its late deadline. Gradescope's **late due date** is treated as the equivalent value.
When the new late deadline is blank, Canvas's available-until value is cleared and Gradescope's late deadline is set equal to its normal deadline, giving the student no late window in either system.

## First-time setup

Requires Python 3.11 or newer. Tkinter is included with the standard python.org macOS installer.

```bash
cd "/Users/rhoward46/Desktop/my stuff/deadline extension manager"
python3 -m venv .venv
.venv/bin/pip install -r requirements.txt
cp config.example.toml config.local.toml
```

Edit `config.local.toml`, then store the credentials in macOS Keychain:

```bash
security add-generic-password -U -a canvas -s canvas-deadline-manager-token -w 'YOUR_CANVAS_ACCESS_TOKEN'
security add-generic-password -U -a 'YOUR_GRADESCOPE_EMAIL' -s gradescope-reminder-gradescope-password -w 'YOUR_GRADESCOPE_PASSWORD'
```

If the Canvas token is not already in Keychain, the app opens [Georgia Tech Canvas settings](https://gatech.instructure.com/profile/settings), prompts for the generated token, and saves it in Keychain. A **Get Canvas token…** button keeps that page available from the main window. In Canvas, create the token under **Approved Integrations → New Access Token**. The Terminal command above is therefore optional for Canvas.

The example reuses the Gradescope Keychain service used by the reminder app. Change the service name if desired. Credentials can instead be supplied through the environment variables named in the config.

If the Gradescope email is left as a placeholder, the app automatically reuses the configured `[gradescope]` settings from the existing missing-submission reminder or grading-coordinator app. Passwords still remain in Keychain or the configured environment variable.

## Run

```bash
cd "/Users/rhoward46/Desktop/my stuff/deadline extension manager"
.venv/bin/python app.py
```

## Matching rules

Gradescope synchronization is conservative:

1. A course is auto-matched only when its Canvas name/code identifies one unique Gradescope instructor course.
2. An assignment is auto-matched only on one unique normalized title.
3. A student is matched only by one unique email address.

If names are ambiguous, add explicit IDs to `gradescope_course_map` or `gradescope_assignment_map` in `config.local.toml`; examples are included in the sample config. An unmatched item remains Canvas-only and is labeled that way in the preview.

## Safety notes

- Only assignments selected in the table are changed.
- The app changes per-student overrides/extensions, never the class-wide assignment dates.
- Applying to two independent systems cannot be transactional. If Canvas succeeds and Gradescope fails (or vice versa), the result dialog identifies the mismatch so it can be retried or corrected.
- `config.local.toml` should remain private because it may contain course mappings, though passwords and tokens are deliberately kept out of it.

## Test

```bash
.venv/bin/python -m unittest discover -s tests -v
```
