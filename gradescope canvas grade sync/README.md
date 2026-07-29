# Gradescope + Canvas Grade Sync Inspector

Version 1.1 reorganizes the tool around the grading workflow: the connected course collapses into a compact summary, selection reveals a sticky batch-action bar, common filters are one-click chips, row-level secondary actions live under **More**, and history opens as a drawer. The underlying publish, post, regrade, roster-sync, and verification behavior is unchanged.

Version 1.2 adds persistent Canvas-check history, workflow states, remembered session filters and selections, Select shown, verified status refresh, Canvas-post previews, last-post tracking with changed-after-post warnings, and retry controls for failed publish/post actions.

This Tampermonkey userscript adds a **Canvas grade sync** launcher to the top navigation of both Gradescope course assignment dashboards and individual assignment pages. The launcher opens the reconciliation tool in a modal window. It extends the page; it does not replace or hide Gradescope.

The modal header identifies the active Gradescope course by code, name, and semester so the course context remains visible while the underlying page is covered.

## Install

1. Create a new Tampermonkey script.
2. Replace the sample with `gradescope-canvas-grade-sync.user.js` and save.
3. Open a Gradescope course. The semester selector defaults to the semester detected in Gradescope, and the course selector shows only Canvas courses from that semester. Choose an older semester when needed; the final course pairing is remembered.
4. Sign into Georgia Tech Canvas in another tab when prompted and approve the `gatech.instructure.com` connection.

## Behavior

- Discovers Gradescope assignments from the site’s rendered links and embedded React data.
- Loads your Canvas teaching courses using the current Canvas browser session, organizes them by semester, defaults to the Gradescope semester, and shows only that semester's courses. Older semesters remain available. No token or password is stored.
- Auto-matches only a unique normalized exact title. Manual mappings are remembered per Gradescope course.
- Downloads each mapped Gradescope score CSV and compares numeric scores student-by-student with Canvas, keyed by email/login ID.
- Checked Grade Agreement results are clickable. The detail panel identifies score differences, blank/nonnumeric values, missing identities, and ambiguous student matches with both system values.
- `Test Student` is always excluded from both systems and never affects agreement counts or posting.
- **Sync Gradescope roster** opens the Gradescope roster page, scrolls to the native sync control, and highlights it for the final click. Gradescope-only students are identified in agreement details with a roster-sync suggestion.
- Treats checking as read-only. It never publishes or posts merely because the panel loaded.
- On an individual assignment page, mirrors discoverable native **Publish Grades** and **Post Grades to Canvas** controls into the panel. Clicking one activates Gradescope’s original control/modal rather than constructing an undocumented write request.
- From the course dashboard, each assignment has in-modal **Publish** and **Post** controls plus a selection checkbox. **Publish selected** and **Post selected to Canvas** run confirmed batches sequentially and report each assignment independently without navigating away.
- Canvas posting uses the same asynchronous workflow as Gradescope's React control: start the embedded `postGradesPath` job and poll its `jobStatusPath` until Gradescope reports completion or failure.
- Canvas assignments using a manual grade-posting policy are labeled **Posting: Manual**. Checked rows distinguish grades that are still hidden from grades visible to students, and **Hidden in Canvas** filters those assignments. Posting grades does not release hidden grades.
- Assignment checks also inspect Gradescope's current publication control. Published rows say **Published** and offer a confirmed **Unpublish** action; bulk Publish skips assignments already published.
- **Push timing** uses the Gradescope late deadline when present and the regular deadline otherwise. Rows show **Before deadline**, **Late window open**, **Ready to push**, or **No deadline**; **Select ready** selects mapped assignments whose effective cutoff has passed.
- Gradescope versioned assignments are represented by one assignment-container row. Child versions are hidden from Canvas mapping, while checking, publication, and posting use the parent container's combined score and native action routes. The row identifies how many versions it contains.
- **Publish/post history** retains the 100 most recent per-assignment outcomes for the Gradescope course, including timestamp, action, and error/success message, so batch progress is not lost when the next assignment begins.
- The assignment toolbar supports name search and filters for agreement, attention needed, unchecked, ready/before-cutoff, mapped/unmapped, published/unpublished, and selected assignments. Filtering changes only visible rows; it does not clear selections or limit **Check all mapped grades**.
- Publishing opens one in-modal preflight for all selected unpublished assignments. Each row can independently enable regrade requests and edit its deadline; **Regrades for all** and **Clear regrades** provide bulk setup. Untouched defaults are recalculated to exactly seven days after each assignment's actual successful publication time. The reviewed plan runs without per-assignment prompts, and publication/regrade outcomes are recorded separately in history.

## Safety and limitations

Gradescope changes its page components periodically. The script intentionally refuses to manufacture publish/post requests when it cannot find Gradescope’s own native control. In that case, use the native control on the assignment page. Score comparison requires Gradescope’s instructor CSV export and a Canvas session with permission to read submissions.

Excused, blank, and nonnumeric grades are reported separately rather than guessed. A green agreement result means all numeric scores that could be matched by email agree exactly; it does not alter Canvas posting policy or Gradescope visibility.

The remembered **Treat Gradescope blank as Canvas 0** option makes blank/zero pairs equivalent during comparison. Before opening Gradescope's native **Post Grades to Canvas** action, the script confirms and writes zero to matched Canvas students whose Gradescope grades are blank. It does not affect **Publish Grades**.

Blank-to-zero writes use a short-lived background Canvas helper tab. The same userscript runs inside the selected Canvas course, performs the authorized writes with Canvas's normal same-origin session, returns only success/failure through Tampermonkey storage, and closes the helper tab. No Canvas password or security token crosses into Gradescope or is persisted.
