# Georgia Tech Syllabus Helper

A personal Tampermonkey userscript for `syllabus.gatech.edu`.

## Install

1. Install the Tampermonkey browser extension.
2. Open Tampermonkey and choose **Create a new script**.
3. Replace the editor contents with [`syllabus-helper.user.js`](./syllabus-helper.user.js).
4. Save the script and reload the Georgia Tech syllabus site.

## What it changes

- Replaces the instructor account page with a focused dashboard.
- Separates course groups by academic term.
- Sorts terms in reverse chronological order, with future terms first and previous terms at the bottom.
- Groups a base course and its `R` recitations together (for example, CS 2050 and CS 2050R).
- Groups VIP course levels together by term and VIP section/team code, even when their course numbers differ.
- Shows every course and recitation section inside its group.
- Allows an incorrectly grouped offering to be reversibly excluded from that batch without deleting it from the school site.
- Calls out partially published groups and names the exact course/recitation sections still needing publication.
- Lets one chosen PDF be uploaded and published across every selected section in a group.
- Confirms once before replacing already-published PDFs in a group.
- Performs uploads and published-PDF replacements in the background without navigating away from the dashboard.
- Dynamically labels each action as upload, replacement, or a mixed batch.
- Shows a spinner, progress bar, current offering, and live upload/replacement stage while a batch is running.
- Saves excluded offerings and manual regrouping choices in the browser across reloads.
- Lets an offering be moved to another course group in the same term or restored to automatic grouping.
- Reviews every batch before execution and warns about replacements or duplicate filenames.
- Times out stalled school-site requests after 60 seconds.
- Reopens each saved syllabus and verifies that a PDF exists and its state is Published.
- Provides direct View links in a completion report and a one-click retry for failures.
- Keeps previous terms collapsed at the bottom while current and future work stays prominent.
- Shows the selected PDF's name and size and offers an in-dashboard preview.
- Supports a semester queue with a different PDF assigned to each course group.
- Detects server-side changes between review and upload to avoid overwriting newer work.
- Backs up each replaced PDF in the current browser session and offers an Undo replacement action.
- Includes a one-click Select drafts only action.
- Can copy the most recent earlier-term PDF into a future course group without a manual download.
- Includes an Original page link for checking Drupal directly, with a fixed Back to syllabus dashboard link on that page.
- Accepts PDFs by drag-and-drop onto a course group.
- Includes live status refresh and a read-only health scan.
- Supports safe cancellation after the currently active upload.
- Sends an optional browser notification when processing finishes.
- Keeps a local activity history and exports it as CSV.
- Exports a token-free diagnostic report for troubleshooting.
- Backs up and restores dashboard grouping/exclusion settings.
- Provides a persistent safe mode that disables all school-site mutations.
- Reconciles verified results into the dashboard and shows when statuses were last checked.
- Offers both per-offering undo and one-click undo for every replaced PDF in a course group.
- Opens existing syllabus PDFs in an in-dashboard viewer; the Drupal record remains available as a secondary link.
- Uses a pinned PDF.js renderer for previews, avoiding browser forced-download settings.
- Adds a persistent Create custom group action at the bottom of every term, with rename, dissolve, and move-offering support.
- Turns “Make individual” offerings into visible standalone cards instead of hiding them, with a return-to-automatic-group action.
- Requires first-time confirmation of every non-empty group and reconfirmation whenever its membership changes.
- Keeps unconfirmed groups collapsed until the user deliberately opens one to review it.
- Simplifies individual edit pages and puts the relevant controls at the top.
- Leaves the original Drupal form fields in the page so the school's validation and authentication continue to apply.

## First-use recommendation

Test with one draft course first. The userscript reports each result independently and logs technical errors in the browser console under `[Syllabus Helper]`.
