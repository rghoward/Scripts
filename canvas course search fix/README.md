# Georgia Tech Canvas Course Organizer

A dependency-free Tampermonkey userscript for `gatech.instructure.com`.

It adds an **All courses** button to the Canvas dashboard. On `/courses`, it replaces the hard-to-scan tables with:

- semesters ordered newest-first;
- responsive course cards containing the original row information;
- token-based and field-specific search across course name, nickname, semester, role, publication state, and enrollment status;
- Current, Past, Future, Teacher, Student, Published, and Favorite filters;
- highlighted search matches and typo suggestions;
- collapsible semesters, with past-only semesters initially collapsed;
- card and compact-list views;
- remembered searches, filters, sorting, view, and collapsed sections;
- bookmarkable and copyable search URLs;
- newest, oldest, and alphabetical ordering;
- working course links and Canvas favorite stars;
- enrollment totals by students, TAs, instructors, and other roles on both dashboard and organizer cards.

## Install

1. Install the Tampermonkey browser extension.
2. Open Tampermonkey's dashboard and choose **Create a new script**.
3. Replace the sample contents with everything in `canvas-course-organizer.user.js`.
4. Save the script, then reload `https://gatech.instructure.com/`.

The script runs only on the Georgia Tech Canvas dashboard and All Courses page. It makes no external requests and stores no course data.

Search words can be in any order and can come from different fields. For example, `summer 2025 discrete math` finds discrete-math courses from Summer 2025. Use quotes for an exact phrase (`"discrete math"`) and a leading minus to exclude a word (`summer 2025 -sandbox`).

Field searches include `course:`, `name:`, `nickname:`, `term:` or `semester:`, `role:`, `published:`, `status:` or `enrollment:`, and `favorite:`. Examples: `term:"Summer 2025" course:"discrete math"` and `role:Teacher -status:past`.

Press `/` outside a form field to focus search. Use the Tampermonkey menu to independently toggle the dashboard shortcut, default past-semester collapsing, result highlighting, state persistence, URL search sharing, and enrollment counts.

Enrollment totals load lazily as cards approach the viewport, use the existing Canvas login, follow API pagination, and deduplicate users enrolled in multiple sections. Current-enrollment counts refresh after 12 hours; all non-current counts are cached persistently without expiration. The Tampermonkey menu includes a manual cache-refresh command for exceptional corrections. A card displays **Enrollment unavailable** when Canvas denies roster access.
