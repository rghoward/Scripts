# Deadline Manager Test Checklist

Use a low-risk test course and verify Canvas and Gradescope independently after every applied change.

## Navigation and drafts

- Open the manager: it starts at the top and all assignment groups are collapsed.
- Change the workflow, assignment filter, and open groups; close and reopen. Those navigation preferences return.
- Enter individual dates, then add an assignment or change a Gradescope mapping. The entered dates remain.
- Close with unconfirmed date edits and reopen. The unconfirmed dates are discarded.
- Click **Start over**. Students, assignments, dates, note, review, and pending plans clear without writing anything.

## Assignment defaults

- Shift one dated assignment with an existing late window; both calculated dates appear inline and save in both systems.
- Shift one dated assignment while selecting **Remove late windows**.
- Set one shared due date with no late window.
- Set one shared due date with a later late-work cutoff.
- Set different dates manually for multiple assignments and verify Preview uses exactly those dates.
- Add a date to an undated assignment with a Gradescope match.
- Add a date to an undated Canvas-only assignment and confirm the warning appears.
- Remove a due date, then undo and confirm the original deadline returns.
- Add a date to an undated assignment, then undo and confirm it returns to no due date.

## Student extensions

- Create an extension for one student with no prior override.
- Update an existing Canvas override and Gradescope extension.
- Apply one plan to multiple students and verify class defaults remain unchanged.
- Edit a manual date before existing student data finishes loading; the manual draft must remain.
- Run Gradescope repair for one student and verify Canvas is not written.

## Warnings and safety

- Select an unpublished assignment and confirm the warning appears in readiness and review.
- Select an undated assignment while using Shift; Review remains disabled with an explanation.
- Enter a late date before the due date; Review remains disabled.
- Select an unmatched assignment; review identifies the Canvas-only action.
- Confirm a shared Canvas override containing multiple students is skipped rather than overwritten.
- Stop a multi-item batch and confirm the current item finishes while remaining items do not start.

## History and verification

- Verify successful writes appear in history with their prior dates.
- Undo a class-default change and a student extension.
- Export history and inspect the resulting CSV.
- Confirm all displayed times use the timezone named beside the time controls, including a date across a daylight-saving transition.
