# GT ODS Testing Dashboard

This Tampermonkey userscript modernizes the instructor-facing AIM Alternative Testing workflow without replacing AIM's native ASP.NET submissions.

## Install

1. Install Tampermonkey in the browser used for AIM.
2. Create a new userscript.
3. Replace its contents with `aim-testing-helper.user.js` and save.
4. Open the AIM instructor portal and select **Alternative Testing**.

## Included in v2.0

- A replacement dashboard that hides AIM's legacy page by default
- Home cards for instructor services and accommodation requests
- Course cards for agreements and exam dates
- Student appointment cards for upcoming exams
- Persistent navigation for Upcoming Exams, Agreements, Exam Dates, and Completed Files
- At-a-glance workload cards
- Simplified agreement/proctoring choices
- Modernized long-form agreement layout
- Collapsed search/filter controls
- Clear selected-exam highlighting
- Unified, sticky upload workspace
- Drag-and-drop exam files with the site's 30 MB validation
- Recipient/date preview and confirmation before upload
- Persistent progress overlay during ASP.NET postbacks
- One-click access to the original AIM layout
- System light/dark theme support

## Safety

The script runs only on the GT AIM domain. It does not send data to third parties, load external libraries, store student information, or invent its own upload requests. Native AIM controls remain responsible for validation and submission.

The course-date upload path has an additional native AIM page after selecting dates. The script automatically enhances that page whenever it contains AIM's file input and upload control.
