# Canvas + Gradescope Deadline Manager (Tampermonkey)

This dependency-free userscript adds a floating **Deadline manager** button to Georgia Tech Canvas course pages. The separate Python app remains unchanged.

## Install

1. Open the Tampermonkey dashboard.
2. Choose **Create a new script**.
3. Replace the sample with all of `canvas-gradescope-deadline-extensions.user.js`.
4. Save and reload a Georgia Tech Canvas course page.
5. Approve the script's `gradescope.com` connection when Tampermonkey asks.

## Use

1. Open a Canvas course as an instructor.
2. Click **Deadline manager** in the lower-right corner.
3. Choose the **Assignment dates** tab to update class defaults or **Student extensions** to create student-specific exceptions.
4. Choose students when creating extensions, then browse assignments in their Canvas assignment groups. Search across groups, filter by upcoming/past/undated/unmatched/selected, and select individual assignments or an entire group.
5. Choose one clearly separated method: shift existing dates, use one shared date, or set dates individually in the selected-assignment table. Explicitly choose whether late windows shift, are removed, or end on a particular date.
6. Use the live readiness summary to resolve missing information, open the in-app review, and apply the verified changes.

Only the controls for the active date method are shown. Editing a **New due** or **New until** value in the table automatically activates **Set dates individually**, so Preview always uses the dates currently visible in the table rather than recalculating them with a previously selected shift.

Calculated shift and shared dates appear in the selected-assignment table immediately. Individually entered dates are held in an in-memory draft so assignment selection, mapping changes, and late-arriving student data do not erase them. The active workflow, assignment filter, and opened assignment groups are remembered between openings; unconfirmed date values and notes are deliberately discarded when the manager closes. **Start over** clears the entire working draft without writing either system.

The interface follows the same order as the task: affected students (when applicable), assignments, date behavior, review, and apply. The review appears inside the manager and lists requested dates and Canvas/Gradescope actions; no native browser confirmation is used for ordinary updates. Undo operations retain a separate confirmation because they reverse previously completed writes.

Assignments without an existing due date are included and labeled **No due date**. Use **No due date** in the assignment filter to find them quickly. A shared date or individually entered date can create the missing deadline. Undated assignments cannot use **Shift existing dates**, because there is no starting date; the readiness summary explains this and directs the user to an appropriate method. Undo can restore the prior undated state.

In the Assignment dates workflow, **Remove due dates** deliberately clears both class due and late dates. It is not offered for student extensions. Unpublished assignments and newly dated Canvas assignments without a Gradescope match are called out in both the readiness summary and final review. The time controls state the browser timezone used to interpret entered dates. Whole-day shifts preserve the local wall-clock time across daylight-saving transitions.

See `TESTING.md` for the live Canvas/Gradescope regression checklist.

Preflight reports the exact Canvas and Gradescope write counts, already-correct destinations, roster/mapping issues, and safety skips before Apply is enabled. During a batch, progress shows the current item and **Stop after current item** safely prevents remaining work from starting.

Shared and manually entered dates use configurable **default due time** and **default late time** values in the browser's local timezone. Both initially use 11:59 PM, and your choices are remembered in Tampermonkey storage. Shift-by-days preserves the assignment's existing time. Existing Canvas overrides and Gradescope extensions can be overwritten; the preview identifies create versus overwrite actions.

The two tabs are intentionally separate workflows. **Assignment dates** updates the actual assignment defaults once in Canvas and once in Gradescope; it does not create an override or extension for every student. Existing student exceptions remain in place and continue to supersede the class default. **Student extensions** changes only the selected students' exceptions and never changes assignment defaults. Switching tabs clears unconfirmed plans and student selection while preserving the selected assignments. History and undo cover both workflows. Exact current-deadline columns are shown with one selected student; with multiple selected students the table switches to a clear multi-student summary because their existing overrides may differ. Automatic Gradescope repair remains single-student and appears only in the student-extension workflow.

The script uses the current Canvas browser session; it needs no Canvas access token. It creates or updates only per-student assignment overrides. Canvas **available until** is treated as the late deadline.

## Gradescope

The script attempts to use the Gradescope session in the same browser. Sign into [Gradescope](https://www.gradescope.com/) separately, then click **Retry Gradescope** if necessary.

Matching is deliberately conservative:

- The Canvas course name/code must identify one Gradescope instructor course.
- Assignment titles must match uniquely after punctuation and capitalization normalization.
- Students must match uniquely by email.

When automatic course matching is ambiguous, choose the correct Gradescope course from the modal. That Canvas-to-Gradescope course mapping is remembered for future visits.

Each queued assignment also has a Gradescope mapping selector. Use it when titles differ; the explicit assignment mapping is remembered for that Canvas course and can be returned to automatic title matching later.

Unmatched assignments remain Canvas-only and are labeled `—` under Gradescope. Every preview says whether an assignment targets Canvas alone or both systems. The final result reports each system separately because cross-system updates cannot be transactional.

The result summary groups work into **updated in both systems**, **Canvas updated with no unique Gradescope match**, and **needs attention**. Gradescope error pages are reduced to a short actionable message rather than displaying raw HTML.

If Canvas succeeded but Gradescope failed, enable **Gradescope-only repair** before previewing again. It reads the student's existing Canvas override and copies those exact dates to Gradescope without changing Canvas a second time.
Assignments without a unique Gradescope match, or without an existing Canvas student override to copy, are labeled and skipped; they do not stop the rest of the repair batch.

After selecting a student, **Find & prepare Gradescope repairs** scans every uniquely matched assignment. It queues only assignments where a Canvas student override exists and the Gradescope student extension is missing or has different normal/late dates. Repair mode is enabled automatically and shown in a clear banner; there is no separate checkbox to coordinate. Checks run in small batches, and nothing is written until the resulting queue is previewed and confirmed.

Gradescope success is verified, not inferred: after writing, the script reloads the assignment's **Extensions** page and confirms that the selected student's extension exists with the requested normal and late deadlines.

## Current deadlines and history

After selecting a student and adding assignments, the queue shows that student's current Canvas override and current Gradescope extension separately. When no student-specific date exists, the class default is labeled as such.

Every apply attempt is retained in Tampermonkey's local storage on that browser, up to the 100 most recent runs. Open **Update history** to review requested dates and per-system outcomes. A run containing failed matched Gradescope updates offers **Restore Gradescope failures**, which selects the student and assignments and enables safe Gradescope-only repair.

New history entries retain prior deadlines and offer **Undo successful changes**. Undo restores overwritten dates and removes student-specific overrides/extensions created by the original run. Older entries created before prior-state snapshots were introduced remain viewable but are not undoable. History can be exported as a course-scoped CSV.

An optional general note can be attached to a run. Do not enter diagnoses or other medical details. Quick presets cover +2, +3, and +7 day shifts, a shared date without a late window, and a shared date with a 24-hour late window. Already-correct destinations are detected and skipped without a write.

Canvas overrides shared by multiple students are never overwritten by a regular update; the affected item is clearly skipped to protect the other students.

## Security

- No Canvas token or password is stored.
- No Gradescope password is stored.
- Canvas requests stay on `gatech.instructure.com`.
- Tampermonkey's privileged request API is used only for `gradescope.com`.
- Persistent local values include course/assignment mappings and the last 100 history runs (student identity, deadlines, optional note, and outcomes). They remain in Tampermonkey storage unless you export the CSV.
