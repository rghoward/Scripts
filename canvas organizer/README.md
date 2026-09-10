# Georgia Tech Canvas Course Organizer

A Tampermonkey userscript for `gatech.instructure.com`.

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
- a dashboard **Student lookup** that searches the selected current Instructor/TA term, showing the student's course, section, enrollment status, and Canvas-marked missing work;
- a dashboard **Repeat enrollments** report that identifies current students who previously repeated the same course, flags prior low scores and withdrawals, and exports a filtered multi-sheet Excel workbook.

## Install

1. Install the Tampermonkey browser extension.
2. Open Tampermonkey's dashboard and choose **Create a new script**.
3. Replace the sample contents with everything in `canvas-course-organizer.user.js`.
4. Save the script, then reload `https://gatech.instructure.com/`.

The script runs on the Georgia Tech Canvas dashboard, All Courses page, and the external Combine Courses tool it launches. It reads data through the signed-in Canvas session and stores no course data. Its Excel export loads the SheetJS workbook library from jsDelivr; student data is not sent to that library host.

## People roster

On a course's **People** page, the script adds a modern roster workspace above Canvas's existing table. Search across the displayed roster, filter by one or more roles, and click a column heading to sort. **Export visible people to CSV** downloads the currently filtered rows with Name, Login ID, SIS ID, Section, Role, Last Activity, and Total Activity; profile and management columns are intentionally excluded.

Search words can be in any order and can come from different fields. For example, `summer 2025 discrete math` finds discrete-math courses from Summer 2025. Use quotes for an exact phrase (`"discrete math"`) and a leading minus to exclude a word (`summer 2025 -sandbox`).

Field searches include `course:`, `name:`, `nickname:`, `term:` or `semester:`, `role:`, `published:`, `status:` or `enrollment:`, and `favorite:`. Examples: `term:"Summer 2025" course:"discrete math"` and `role:Teacher -status:past`.

Press `/` outside a form field to focus search. Use the Tampermonkey menu to independently toggle the dashboard shortcut, default past-semester collapsing, result highlighting, state persistence, URL search sharing, and enrollment counts.

Enrollment totals load lazily as cards approach the viewport and use the existing Canvas login. Student totals use Canvas's course-wide `total_students` value (so students in multiple or cross-listed sections are not missed or double-counted); TA and instructor rosters are paginated and deduplicated by user. Current-enrollment counts refresh after 12 hours; all non-current counts are cached persistently without expiration. The Tampermonkey menu includes a manual cache-refresh command for exceptional corrections. A card displays **Enrollment unavailable** when Canvas denies roster access.

## Combine Courses

When opened in its new browser window, the Georgia Tech **Combine Courses** tool is organized by detected semester: newest first, with prior terms collapsed by default. It includes semester/course search, **Expand all**, **Collapse older semesters**, remembered expansion choices, and `/` to focus search. The feature acts only when it can identify at least two semester headings, and it never changes course or cross-listing data.
