// ==UserScript==
// @name         GT TA Hiring - My Courses Dashboard
// @namespace    https://gatech.edu/
// @version      1.0.0
// @description  Adds My Courses, pinned courses, search, semester grouping, sorting, capacity summaries, and favorites.
// @match        https://ta-app.cc.gatech.edu/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

(function () {
    'use strict';

    const { clean, escapeAttribute, escapeHtml, normalize } = toolkit.utils;

    const heading = document.querySelector('main h1');
    const originalTable = document.querySelector('main table.table');
    const isManager = Boolean(document.querySelector(
        '#page-navigation a[href^="/admin/manager"]'
    ));

    if (
        !heading ||
        !originalTable ||
        heading.textContent.trim().toLowerCase() !== 'my current courses' ||
        document.getElementById('tm-course-dashboard')
    ) {
        return;
    }

    const STORAGE = {
        myCourses: 'gt-ta-my-courses',
        managedCourses: 'gt-ta-managed-courses',
        activeView: 'gt-ta-course-active-view',
        displayMode: 'gt-ta-course-display-mode',
        semester: 'gt-ta-course-semester',
        minimumCapacity: 'gt-ta-course-minimum-capacity',
        maximumCapacity: 'gt-ta-course-maximum-capacity',
        hideOlder: 'gt-ta-course-hide-older',
        collapsedTerms: 'gt-ta-course-collapsed-terms'
    };

    const courses = extractCourses();

    if (!courses.length) {
        return;
    }

    document.body.classList.add('gt-ta-toolkit-page');

    const semesters = getSemesters();
    const newestSemester = semesters[0]?.name || '';

    let activeView = isManager
        ? readString(STORAGE.activeView, 'my')
        : 'my';
    let displayMode = readString(STORAGE.displayMode, 'cards');
    let staffingChecks = new Map();

    addStyles();
    buildDashboard();
    render();
    if (isManager) checkManagerStaffing();

    function extractCourses() {
        return Array.from(
            originalTable.querySelectorAll('tbody tr')
        ).map((row, index) => {
            const cells = row.querySelectorAll('td');
            const link = cells[0]?.querySelector('a');

            if (!link) {
                return null;
            }

            const fullName = clean(link.textContent);
            const capacity = Number.parseInt(
                clean(cells[1]?.textContent),
                10
            ) || 0;

            const parsed = parseCourseName(fullName);

            return {
                id: extractSectionId(link.href) || `course-${index}`,
                url: link.href,
                fullName,
                courseName: parsed.courseName,
                semester: parsed.semester,
                capacity,
                normalized: normalize(
                    `${fullName} ${parsed.courseName} ${parsed.semester}`
                )
            };
        }).filter(Boolean);
    }

    function parseCourseName(fullName) {
        const match = fullName.match(
            /^(.*?)\s+-\s+((?:Spring|Summer|Fall)\s+\d{4})$/i
        );

        if (!match) {
            return {
                courseName: fullName,
                semester: 'Other'
            };
        }

        return {
            courseName: clean(match[1]),
            semester: clean(match[2])
        };
    }

    function extractSectionId(url) {
        const match = String(url).match(/\/section\/(\d+)/);
        return match?.[1] || '';
    }

    function getSemesters() {
        const grouped = new Map();

        courses.forEach(course => {
            if (!grouped.has(course.semester)) {
                grouped.set(course.semester, []);
            }

            grouped.get(course.semester).push(course);
        });

        return Array.from(grouped.entries())
            .map(([name, semesterCourses]) => ({
                name,
                courses: semesterCourses
            }))
            .sort((a, b) => semesterWeight(b.name) - semesterWeight(a.name));
    }

    function buildDashboard() {
        const dashboard = document.createElement('section');
        dashboard.id = 'tm-course-dashboard';

        dashboard.innerHTML = `
            <div class="tm-dashboard-header">
                <div>
                    <h2>Course Dashboard</h2>
                    <p>
                        Find your courses and open applicant rankings quickly.
                    </p>
                </div>

                <div class="tm-header-badges">
                    <span id="tm-visible-badge"></span>
                    <span id="tm-capacity-badge"></span>
                </div>
            </div>

            ${isManager ? `
                <div class="tm-view-tabs" role="tablist">
                    <button type="button" data-view="my">
                        My Courses
                        <span id="tm-my-count"></span>
                    </button>

                    <button type="button" data-view="managed">
                        Pinned Courses
                        <span id="tm-managed-count"></span>
                    </button>

                    <button type="button" data-view="all">
                        All Courses
                        <span>${courses.length}</span>
                    </button>
                </div>
            ` : ''}

            <div class="tm-toolbar">
                <div class="tm-search-field">
                    <label for="tm-course-search">Search</label>
                    <input
                        id="tm-course-search"
                        type="search"
                        placeholder="Search CS 2050, online, Fall 2026..."
                        autocomplete="off"
                        spellcheck="false"
                    >
                </div>

                <div>
                    <label for="tm-semester-filter">Semester</label>
                    <select id="tm-semester-filter">
                        <option value="">All semesters</option>

                        ${semesters.map(semester => `
                            <option value="${escapeAttribute(semester.name)}">
                                ${escapeHtml(semester.name)}
                            </option>
                        `).join('')}
                    </select>
                </div>

                <div>
                    <label for="tm-course-sort">Sort</label>
                    <select id="tm-course-sort">
                        <option value="course">Course number</option>
                        <option value="capacity-desc">Highest capacity</option>
                        <option value="capacity-asc">Lowest capacity</option>
                        <option value="semester">Newest semester</option>
                    </select>
                </div>

                <div>
                    <label for="tm-min-capacity">Minimum capacity</label>
                    <input
                        id="tm-min-capacity"
                        type="number"
                        min="0"
                        step="1"
                        inputmode="numeric"
                        placeholder="Any"
                    >
                </div>

                <div>
                    <label for="tm-max-capacity">Maximum capacity</label>
                    <input
                        id="tm-max-capacity"
                        type="number"
                        min="0"
                        step="1"
                        inputmode="numeric"
                        placeholder="Any"
                    >
                </div>

                <button
                    id="tm-clear-course-filters"
                    class="tm-secondary-button"
                    type="button"
                >
                    Clear
                </button>
            </div>

            <div class="tm-options-row">
                <label>
                    <input id="tm-hide-older" type="checkbox">
                    Show newest semester only
                </label>

                <div class="tm-display-buttons">
                    <button type="button" data-mode="cards">Cards</button>
                    <button type="button" data-mode="table">Table</button>
                </div>
            </div>

            ${isManager ? `
                <div id="tm-staffing-check" class="tm-staffing-check" aria-live="polite">
                    <span class="tm-staffing-spinner" aria-hidden="true"></span>
                    <span>Checking ${escapeHtml(newestSemester)} courses for staffing problems…</span>
                </div>
                <div class="tm-staffing-explainer">
                    <strong>How this check works:</strong>
                    Accepted and Offered TAs count toward staffing. Preferred candidates are not yet counted as staffed.
                    Returning TAs are shown as <strong>paid</strong>; New TAs are shown as <strong>unpaid</strong> for ratio planning.
                    Head TAs count toward the course allotment; Pending candidates are excluded.
                </div>
                <div id="tm-first-run-message" class="tm-first-run-message">
                    <strong>Personalize this dashboard:</strong>
                    open <em>All Courses</em>, then mark courses as
                    <strong>Mine</strong> or <strong>Pin</strong> them for quick access.
                    Your choices will remain saved in this browser.
                </div>
            ` : ''}

            <div id="tm-course-results"></div>
        `;

        originalTable.before(dashboard);
        originalTable.style.display = 'none';

        const managerNotice = Array.from(
            document.querySelectorAll('main p')
        ).find(paragraph =>
            paragraph.textContent.includes('Managers see ALL')
        );

        if (managerNotice) {
            managerNotice.style.display = 'none';
        }

        bindControls();
        restoreControls();
        updateButtons();
    }

    async function checkManagerStaffing() {
        const bar = document.getElementById('tm-staffing-check');
        try {
            const reportPage = await fetch('/admin/report/', { credentials: 'same-origin' });
            if (!reportPage.ok) throw new Error(`report page returned ${reportPage.status}`);
            const reportDocument = new DOMParser().parseFromString(await reportPage.text(), 'text/html');
            const option = [...reportDocument.querySelectorAll('#report_index_semester option')]
                .find(item => clean(item.textContent) === newestSemester);
            if (!option) throw new Error(`no report found for ${newestSemester}`);
            const csvResponse = await fetch(
                `/admin/report/create.csv?semester=${encodeURIComponent(option.value)}`,
                { credentials: 'same-origin' }
            );
            if (!csvResponse.ok) throw new Error(`CSV returned ${csvResponse.status}`);
            staffingChecks = buildStaffingChecks(parseSimpleCsv(await csvResponse.text()));
            const problems = [...staffingChecks.values()].filter(check => check.level === 'problem').length;
            const advisories = [...staffingChecks.values()].filter(check => check.level === 'advisory').length;
            bar.className = `tm-staffing-check ${problems ? 'tm-staffing-has-problems' : 'tm-staffing-clear'}`;
            bar.innerHTML = problems || advisories
                ? `<strong>${problems} problem course${problems === 1 ? '' : 's'}</strong><span>· ${advisories} advisor${advisories === 1 ? 'y' : 'ies'} · ${escapeHtml(newestSemester)}. Marked below.</span>`
                : `<strong>No staffing problems detected</strong><span>· ${escapeHtml(newestSemester)}</span>`;
            render();
        } catch (error) {
            bar.className = 'tm-staffing-check tm-staffing-error';
            bar.textContent = `Staffing check unavailable: ${error.message}`;
        }
    }

    function buildStaffingChecks(rows) {
        const counts = new Map();
        rows.filter(row => clean(row.Semester) === newestSemester).forEach(row => {
            const key = courseKey(row.Course);
            if (!counts.has(key)) counts.set(key, { headTAs: 0, accepted: 0, offered: 0, preferred: 0, returning: 0, newCount: 0 });
            const count = counts.get(key);
            const status = clean(row.Status).toUpperCase();
            if (status === 'HEADTA') count.headTAs += 1;
            if (status === 'ACCEPT') count.accepted += 1;
            if (status === 'OFFER') count.offered += 1;
            if (status === 'PREFER') count.preferred += 1;
            if (['ACCEPT', 'OFFER'].includes(status)) {
                if (clean(row.TABefore).toUpperCase() === 'YES') count.returning += 1;
                else count.newCount += 1;
            }
        });

        const checks = new Map();
        courses.filter(course => course.semester === newestSemester).forEach(course => {
            const count = counts.get(courseKey(course.courseName)) || {
                headTAs: 0, accepted: 0, offered: 0, preferred: 0, returning: 0, newCount: 0
            };
            const committed = count.headTAs + count.accepted + count.offered;
            const remaining = Math.max(0, course.capacity - committed);
            const maximumReturning = Math.ceil(course.capacity * 20 / 30);
            const minimumNew = Math.max(0, course.capacity - maximumReturning);
            const issues = [];
            let level = 'ok';
            if (count.headTAs + count.accepted > course.capacity) {
                issues.push(`Over allocation: ${count.headTAs + count.accepted} Head TAs or accepted TAs are assigned, but the course is allotted ${course.capacity}`);
                level = 'problem';
            } else if (committed > course.capacity) {
                issues.push(`Possible over-hire: ${committed} Head TAs, accepted TAs, or offers are assigned, but only ${course.capacity} can be staffed`);
                level = 'problem';
            }
            if (count.returning > maximumReturning) {
                issues.push(`Paid/returning limit exceeded: ${count.returning} are accepted or offered; no more than ${maximumReturning} may be returning`);
                level = 'problem';
            }
            if (committed >= course.capacity && count.newCount < minimumNew) {
                issues.push(`Not enough unpaid/new TAs: a full staff of ${course.capacity} requires at least ${minimumNew} new TAs, but only ${count.newCount} are accepted or offered`);
                level = 'problem';
            }
            if (count.preferred > remaining) {
                issues.push(`Preferred-list advisory: ${count.preferred} candidates are preferred, but only ${remaining} staffing spot${remaining === 1 ? '' : 's'} remain after Head TAs, accepted TAs, and offers`);
                if (level === 'ok') level = 'advisory';
            }
            checks.set(course.id, { ...count, committed, remaining, maximumReturning, minimumNew, issues, level });
        });
        return checks;
    }

    function courseKey(value) {
        return normalize(value).replace(/[^a-z0-9]/g, '');
    }

    function parseSimpleCsv(text) {
        const rows = [];
        let row = [], field = '', quoted = false;
        for (let index = 0; index < text.length; index += 1) {
            const character = text[index];
            if (quoted) {
                if (character === '"' && text[index + 1] === '"') { field += '"'; index += 1; }
                else if (character === '"') quoted = false;
                else field += character;
            } else if (character === '"') quoted = true;
            else if (character === ',') { row.push(field); field = ''; }
            else if (character === '\n') { row.push(field.replace(/\r$/, '')); rows.push(row); row = []; field = ''; }
            else field += character;
        }
        if (field || row.length) { row.push(field.replace(/\r$/, '')); rows.push(row); }
        const headers = (rows.shift() || []).map((header, index) => index ? header : header.replace(/^\uFEFF/, ''));
        return rows.filter(values => values.some(Boolean)).map(values =>
            Object.fromEntries(headers.map((header, index) => [header, values[index] || '']))
        );
    }

    function bindControls() {
        document.querySelectorAll('.tm-view-tabs button').forEach(button => {
            button.addEventListener('click', () => {
                activeView = button.dataset.view;
                localStorage.setItem(STORAGE.activeView, activeView);
                updateButtons();
                render();
            });
        });

        document.querySelectorAll('.tm-display-buttons button').forEach(button => {
            button.addEventListener('click', () => {
                displayMode = button.dataset.mode;
                localStorage.setItem(STORAGE.displayMode, displayMode);
                updateButtons();
                render();
            });
        });

        document
            .getElementById('tm-course-search')
            .addEventListener('input', render);

        document
            .getElementById('tm-semester-filter')
            .addEventListener('change', event => {
                localStorage.setItem(
                    STORAGE.semester,
                    event.target.value
                );

                render();
            });

        document
            .getElementById('tm-course-sort')
            .addEventListener('change', render);

        ['tm-min-capacity', 'tm-max-capacity'].forEach(id => {
            document.getElementById(id).addEventListener('input', event => {
                const storageKey = id === 'tm-min-capacity'
                    ? STORAGE.minimumCapacity
                    : STORAGE.maximumCapacity;
                localStorage.setItem(storageKey, event.target.value);
                render();
            });
        });

        document
            .getElementById('tm-hide-older')
            .addEventListener('change', event => {
                localStorage.setItem(
                    STORAGE.hideOlder,
                    event.target.checked ? 'true' : 'false'
                );

                render();
            });

        document
            .getElementById('tm-clear-course-filters')
            .addEventListener('click', clearFilters);

        document.addEventListener('keydown', event => {
            const target = event.target;

            const typing =
                target instanceof HTMLInputElement ||
                target instanceof HTMLTextAreaElement ||
                target instanceof HTMLSelectElement ||
                target?.isContentEditable;

            if (event.key === '/' && !typing) {
                event.preventDefault();
                document.getElementById('tm-course-search').focus();
            }

            if (
                event.key === 'Escape' &&
                document.activeElement?.id === 'tm-course-search'
            ) {
                document.getElementById('tm-course-search').value = '';
                render();
            }
        });
    }

    function restoreControls() {
        document.getElementById('tm-semester-filter').value =
            readString(STORAGE.semester, '');

        document.getElementById('tm-hide-older').checked =
            readString(STORAGE.hideOlder, 'false') === 'true';

        document.getElementById('tm-min-capacity').value =
            readString(STORAGE.minimumCapacity, '');
        document.getElementById('tm-max-capacity').value =
            readString(STORAGE.maximumCapacity, '');
    }

    function updateButtons() {
        document.querySelectorAll('.tm-view-tabs button').forEach(button => {
            button.classList.toggle(
                'tm-active',
                button.dataset.view === activeView
            );
        });

        document.querySelectorAll('.tm-display-buttons button').forEach(button => {
            button.classList.toggle(
                'tm-active',
                button.dataset.mode === displayMode
            );
        });
    }

    function render() {
        const myCourseIds = isManager
            ? readIdSet(STORAGE.myCourses)
            : new Set(courses.map(course => course.id));
        const managedCourseIds = isManager
            ? readIdSet(STORAGE.managedCourses)
            : new Set();

        if (isManager) {
            document.getElementById('tm-my-count').textContent =
                myCourseIds.size;

            document.getElementById('tm-managed-count').textContent =
                managedCourseIds.size;

            const firstRun = document.getElementById('tm-first-run-message');

            firstRun.style.display =
                myCourseIds.size === 0 && managedCourseIds.size === 0
                    ? ''
                    : 'none';
        }

        const query = normalize(
            document.getElementById('tm-course-search').value
        );

        const selectedSemester =
            document.getElementById('tm-semester-filter').value;

        const sortOrder =
            document.getElementById('tm-course-sort').value;

        const newestOnly =
            document.getElementById('tm-hide-older').checked;

        const minimumCapacity = readOptionalNumber('tm-min-capacity');
        const maximumCapacity = readOptionalNumber('tm-max-capacity');

        let visible = courses.filter(course => {
            if (
                isManager &&
                activeView === 'my' &&
                !myCourseIds.has(course.id)
            ) {
                return false;
            }

            if (
                activeView === 'managed' &&
                !managedCourseIds.has(course.id)
            ) {
                return false;
            }

            if (query && !course.normalized.includes(query)) {
                return false;
            }

            if (
                selectedSemester &&
                course.semester !== selectedSemester
            ) {
                return false;
            }

            if (
                newestOnly &&
                course.semester !== newestSemester
            ) {
                return false;
            }

            if (
                minimumCapacity !== null &&
                course.capacity < minimumCapacity
            ) {
                return false;
            }

            if (
                maximumCapacity !== null &&
                course.capacity > maximumCapacity
            ) {
                return false;
            }

            return true;
        });

        visible = sortCourses(visible, sortOrder);

        updateSummary(visible);

        const container = document.getElementById('tm-course-results');
        container.replaceChildren();

        if (!visible.length) {
            renderEmptyState(container);
            return;
        }

        if (displayMode === 'table') {
            renderTable(
                container,
                visible,
                myCourseIds,
                managedCourseIds
            );
        } else {
            renderCards(
                container,
                visible,
                myCourseIds,
                managedCourseIds
            );
        }
    }

    function renderCards(
        container,
        visible,
        myCourseIds,
        managedCourseIds
    ) {
        if (isManager && activeView === 'all') {
            renderGroupedCards(
                container,
                visible,
                myCourseIds,
                managedCourseIds
            );

            return;
        }

        const grid = document.createElement('div');
        grid.className = 'tm-course-grid';

        visible.forEach(course => {
            grid.appendChild(
                createCourseCard(
                    course,
                    myCourseIds,
                    managedCourseIds
                )
            );
        });

        container.appendChild(grid);
    }

    function renderGroupedCards(
        container,
        visible,
        myCourseIds,
        managedCourseIds
    ) {
        const grouped = groupBySemester(visible);
        const collapsedTerms = readIdSet(STORAGE.collapsedTerms);

        grouped.forEach(group => {
            const section = document.createElement('section');
            section.className = 'tm-semester-section';

            const totalCapacity = group.courses.reduce(
                (sum, course) => sum + course.capacity,
                0
            );

            const collapsed = collapsedTerms.has(group.name);

            section.innerHTML = `
                <button
                    type="button"
                    class="tm-semester-heading"
                    aria-expanded="${collapsed ? 'false' : 'true'}"
                >
                    <span>
                        <strong>${escapeHtml(group.name)}</strong>
                        <small>
                            ${group.courses.length} courses ·
                            ${totalCapacity} total capacity
                        </small>
                    </span>

                    <span class="tm-collapse-icon">
                        ${collapsed ? '▶' : '▼'}
                    </span>
                </button>
            `;

            const grid = document.createElement('div');
            grid.className = 'tm-course-grid';
            grid.style.display = collapsed ? 'none' : '';

            group.courses.forEach(course => {
                grid.appendChild(
                    createCourseCard(
                        course,
                        myCourseIds,
                        managedCourseIds
                    )
                );
            });

            section
                .querySelector('.tm-semester-heading')
                .addEventListener('click', () => {
                    toggleStoredId(
                        STORAGE.collapsedTerms,
                        group.name
                    );

                    render();
                });

            section.appendChild(grid);
            container.appendChild(section);
        });
    }

    function createCourseCard(
        course,
        myCourseIds,
        managedCourseIds
    ) {
        const card = document.createElement('article');
        card.className = 'tm-course-card';

        const isMine = myCourseIds.has(course.id);
        const isManaged = managedCourseIds.has(course.id);
        const staffing = staffingChecks.get(course.id);

        if (staffing?.level && staffing.level !== 'ok') {
            card.classList.add(`tm-course-${staffing.level}`);
        }

        card.innerHTML = `
            <div class="tm-course-card-header">
                <div>
                    <h3>
                        <a href="${escapeAttribute(course.url)}">
                            ${escapeHtml(course.courseName)}
                        </a>
                    </h3>

                    <span>${escapeHtml(course.semester)}</span>
                </div>

                <div class="tm-capacity">
                    <strong>${course.capacity}</strong>
                    <span>capacity</span>
                </div>
            </div>

            <div class="tm-card-actions">
                ${isManager ? `
                    <button
                        type="button"
                        class="${isMine ? 'tm-selected-action' : ''}"
                        data-action="mine"
                    >
                        ${isMine ? '★ Mine' : '☆ Mine'}
                    </button>

                    <button
                        type="button"
                        class="${isManaged ? 'tm-selected-action' : ''}"
                        data-action="managed"
                    >
                        ${isManaged ? '✓ Pinned' : '+ Pin'}
                    </button>
                ` : ''}

                <a href="${escapeAttribute(course.url)}">
                    Rank TAs →
                </a>
            </div>
            ${staffing?.issues.length ? `
                <div class="tm-course-staffing-warning tm-course-staffing-${staffing.level}">
                    <strong>${staffing.level === 'problem' ? 'Staffing problem' : 'Staffing advisory'}</strong>
                    <span>${escapeHtml(staffing.issues.join(' · '))}</span>
                </div>
            ` : ''}
        `;

        card
            .querySelector('[data-action="mine"]')
            ?.addEventListener('click', () => {
                toggleStoredId(STORAGE.myCourses, course.id);
                render();
            });

        card
            .querySelector('[data-action="managed"]')
            ?.addEventListener('click', () => {
                toggleStoredId(STORAGE.managedCourses, course.id);
                render();
            });

        return card;
    }

    function renderTable(
        container,
        visible,
        myCourseIds,
        managedCourseIds
    ) {
        const wrapper = document.createElement('div');
        wrapper.className = 'tm-table-wrapper';

        const table = document.createElement('table');
        table.className = 'tm-modern-table';

        table.innerHTML = `
            <thead>
                <tr>
                    <th>Course</th>
                    <th>Semester</th>
                    <th>Capacity</th>
                    ${isManager ? '<th>Lists</th>' : ''}
                    <th></th>
                </tr>
            </thead>

            <tbody>
                ${visible.map(course => `
                    <tr data-course-id="${escapeAttribute(course.id)}" class="${
                        staffingChecks.get(course.id)?.level && staffingChecks.get(course.id).level !== 'ok'
                            ? `tm-course-${staffingChecks.get(course.id).level}`
                            : ''
                    }">
                        <td>
                            <a href="${escapeAttribute(course.url)}">
                                ${escapeHtml(course.courseName)}
                            </a>
                            ${staffingChecks.get(course.id)?.issues.length ? `
                                <div class="tm-table-staffing-warning">
                                    <strong>${staffingChecks.get(course.id).level === 'problem' ? 'Problem:' : 'Advisory:'}</strong>
                                    ${escapeHtml(staffingChecks.get(course.id).issues.join(' · '))}
                                </div>
                            ` : ''}
                        </td>

                        <td>${escapeHtml(course.semester)}</td>

                        <td>
                            <span class="tm-capacity-badge">
                                ${course.capacity}
                            </span>
                        </td>

                        ${isManager ? `<td class="tm-table-actions">
                            <button
                                type="button"
                                data-action="mine"
                                class="${
                                    myCourseIds.has(course.id)
                                        ? 'tm-selected-action'
                                        : ''
                                }"
                            >
                                ${
                                    myCourseIds.has(course.id)
                                        ? '★ Mine'
                                        : '☆ Mine'
                                }
                            </button>

                            <button
                                type="button"
                                data-action="managed"
                                class="${
                                    managedCourseIds.has(course.id)
                                        ? 'tm-selected-action'
                                        : ''
                                }"
                            >
                                ${
                                    managedCourseIds.has(course.id)
                                        ? '✓ Pinned'
                                        : '+ Pin'
                                }
                            </button>
                        </td>` : ''}

                        <td>
                            <a href="${escapeAttribute(course.url)}">
                                Rank TAs →
                            </a>
                        </td>
                    </tr>
                `).join('')}
            </tbody>
        `;

        table.querySelectorAll('tbody tr').forEach(row => {
            const courseId = row.dataset.courseId;

            row
                .querySelector('[data-action="mine"]')
                ?.addEventListener('click', () => {
                    toggleStoredId(STORAGE.myCourses, courseId);
                    render();
                });

            row
                .querySelector('[data-action="managed"]')
                ?.addEventListener('click', () => {
                    toggleStoredId(STORAGE.managedCourses, courseId);
                    render();
                });
        });

        wrapper.appendChild(table);
        container.appendChild(wrapper);
    }

    function updateSummary(visible) {
        const totalCapacity = visible.reduce(
            (sum, course) => sum + course.capacity,
            0
        );

        document.getElementById('tm-visible-badge').textContent =
            `Showing ${visible.length} of ${courses.length} courses`;

        document.getElementById('tm-capacity-badge').textContent =
            `${totalCapacity} total capacity`;
    }

    function renderEmptyState(container) {
        const messages = {
            my: {
                title: isManager
                    ? 'No courses in My Courses'
                    : 'No current courses found',
                message: isManager
                    ? 'Open All Courses and click “Mine” on the courses you teach.'
                    : 'If you expected a course here, use the course-access form linked from the instructor guide.'
            },
            managed: {
                title: 'No pinned courses',
                message:
                    'Open All Courses and click “Pin” for quick access here.'
            },
            all: {
                title: 'No matching courses',
                message:
                    'Try clearing the search or semester filter.'
            }
        };

        const content = messages[activeView];

        container.innerHTML = `
            <div class="tm-empty-state">
                <strong>${escapeHtml(content.title)}</strong>
                <span>${escapeHtml(content.message)}</span>

                ${
                    isManager && activeView !== 'all'
                        ? `
                            <button
                                type="button"
                                id="tm-open-all-courses"
                                class="tm-primary-inline"
                            >
                                Open All Courses
                            </button>
                        `
                        : ''
                }
            </div>
        `;

        document
            .getElementById('tm-open-all-courses')
            ?.addEventListener('click', () => {
                activeView = 'all';
                localStorage.setItem(STORAGE.activeView, activeView);
                updateButtons();
                render();
            });
    }

    function sortCourses(courseList, sortOrder) {
        return [...courseList].sort((a, b) => {
            if (sortOrder === 'capacity-desc') {
                return (
                    b.capacity - a.capacity ||
                    compareCourseNames(a, b)
                );
            }

            if (sortOrder === 'capacity-asc') {
                return (
                    a.capacity - b.capacity ||
                    compareCourseNames(a, b)
                );
            }

            if (sortOrder === 'semester') {
                return (
                    semesterWeight(b.semester) -
                        semesterWeight(a.semester) ||
                    compareCourseNames(a, b)
                );
            }

            return compareCourseNames(a, b);
        });
    }

    function compareCourseNames(a, b) {
        return a.courseName.localeCompare(
            b.courseName,
            undefined,
            {
                numeric: true,
                sensitivity: 'base'
            }
        );
    }

    function groupBySemester(courseList) {
        const map = new Map();

        courseList.forEach(course => {
            if (!map.has(course.semester)) {
                map.set(course.semester, []);
            }

            map.get(course.semester).push(course);
        });

        return Array.from(map.entries())
            .map(([name, semesterCourses]) => ({
                name,
                courses: semesterCourses
            }))
            .sort((a, b) =>
                semesterWeight(b.name) - semesterWeight(a.name)
            );
    }

    function clearFilters() {
        document.getElementById('tm-course-search').value = '';
        document.getElementById('tm-semester-filter').value = '';
        document.getElementById('tm-course-sort').value = 'course';
        document.getElementById('tm-hide-older').checked = false;
        document.getElementById('tm-min-capacity').value = '';
        document.getElementById('tm-max-capacity').value = '';

        localStorage.removeItem(STORAGE.semester);
        localStorage.removeItem(STORAGE.minimumCapacity);
        localStorage.removeItem(STORAGE.maximumCapacity);
        localStorage.setItem(STORAGE.hideOlder, 'false');

        render();
        document.getElementById('tm-course-search').focus();
    }

    function readOptionalNumber(elementId) {
        const value = document.getElementById(elementId).value.trim();
        if (value === '') return null;

        const number = Number(value);
        return Number.isFinite(number) ? number : null;
    }

    function toggleStoredId(storageKey, id) {
        const values = readIdSet(storageKey);

        if (values.has(id)) {
            values.delete(id);
        } else {
            values.add(id);
        }

        localStorage.setItem(
            storageKey,
            JSON.stringify(Array.from(values))
        );
    }

    function readIdSet(storageKey) {
        try {
            const parsed = JSON.parse(
                localStorage.getItem(storageKey) || '[]'
            );

            return new Set(
                Array.isArray(parsed)
                    ? parsed.map(String)
                    : []
            );
        } catch {
            return new Set();
        }
    }

    function readString(storageKey, fallback) {
        return localStorage.getItem(storageKey) ?? fallback;
    }

    function semesterWeight(semester) {
        const match = String(semester).match(
            /^(Spring|Summer|Fall)\s+(\d{4})$/i
        );

        if (!match) {
            return 0;
        }

        const termWeights = {
            Spring: 1,
            Summer: 2,
            Fall: 3
        };

        const term =
            match[1].charAt(0).toUpperCase() +
            match[1].slice(1).toLowerCase();

        return (
            Number(match[2]) * 10 +
            (termWeights[term] || 0)
        );
    }

    function addStyles() {
        const style = document.createElement('style');

        style.textContent = `
            #tm-course-dashboard {
                margin: 18px 0 55px;
                color: #252525;
            }

            .tm-header-badges {
                display: flex;
                flex-wrap: wrap;
                justify-content: flex-end;
                gap: 8px;
            }

            .tm-header-badges span {
                padding: 6px 10px;
                border-radius: 999px;
                background: #f1f1f1;
                color: #555;
                font-size: .83rem;
                font-weight: 600;
                white-space: nowrap;
            }

            .tm-view-tabs button span {
                min-width: 24px;
                padding: 2px 6px;
                border-radius: 999px;
                background: rgba(0, 0, 0, .1);
                font-size: .75rem;
            }

            .tm-toolbar {
                grid-template-columns:
                    minmax(280px, 2fr)
                    minmax(160px, 1fr)
                    minmax(170px, 1fr)
                    minmax(125px, .7fr)
                    minmax(125px, .7fr)
                    auto;
                backdrop-filter: blur(8px);
            }

            .tm-toolbar > div {
                display: flex;
                min-width: 0;
                flex-direction: column;
                gap: 7px;
            }

            .tm-toolbar label {
                position: static !important;
                inset: auto !important;
                display: block !important;
                height: auto !important;
                margin: 0 !important;
                padding: 0 !important;
                transform: none !important;
                line-height: 1.25 !important;
            }

            .tm-toolbar input,
            .tm-toolbar select {
                box-sizing: border-box !important;
                height: 46px !important;
                margin: 0 !important;
            }

            .tm-options-row {
                display: flex;
                align-items: center;
                gap: 20px;
                padding: 11px 15px;
                border: 1px solid #cfcfcf;
                border-top: 0;
                background: #f6f6f6;
            }

            .tm-options-row label {
                display: inline-flex;
                align-items: center;
                gap: 6px;
                margin: 0;
                cursor: pointer;
            }

            .tm-display-buttons {
                display: inline-flex;
                overflow: hidden;
                margin-left: auto;
                border: 1px solid #999;
                border-radius: 6px;
            }

            .tm-display-buttons button {
                padding: 7px 13px;
                border: 0;
                border-right: 1px solid #999;
                background: white;
                cursor: pointer;
            }

            .tm-display-buttons button:last-child {
                border-right: 0;
            }

            .tm-display-buttons button.tm-active {
                background: #333;
                color: white;
            }

            .tm-first-run-message {
                margin-top: 14px;
                padding: 13px 15px;
                border-left: 4px solid #b3a369;
                border-radius: 6px;
                background: #fffbee;
            }

            .tm-staffing-check {
                display: flex;
                align-items: center;
                gap: 8px;
                margin-top: 14px;
                padding: 11px 14px;
                border: 1px solid #cdd7e1;
                border-radius: 7px;
                background: #f3f7fa;
                color: #334155;
                font-size: .86rem;
            }

            .tm-staffing-spinner {
                width: 15px;
                height: 15px;
                border: 2px solid #b8c5d1;
                border-top-color: #003057;
                border-radius: 50%;
                animation: tm-staffing-spin .8s linear infinite;
            }

            @keyframes tm-staffing-spin { to { transform: rotate(360deg); } }

            .tm-staffing-has-problems { border-color: #e2a8a3; background: #fff2f1; color: #8a2018; }
            .tm-staffing-clear { border-color: #a9d7bd; background: #effaf3; color: #17653f; }
            .tm-staffing-error { border-color: #e3c77a; background: #fff9e6; color: #735c17; }

            .tm-staffing-explainer {
                margin-top: 7px;
                padding: 9px 13px;
                border-left: 4px solid #7699b5;
                background: #f5f8fb;
                color: #4b5563;
                font-size: .78rem;
                line-height: 1.45;
            }

            .tm-course-card.tm-course-problem,
            .tm-modern-table tr.tm-course-problem { border-color: #c7473b; background: #fff8f7; }
            .tm-course-card.tm-course-advisory,
            .tm-modern-table tr.tm-course-advisory { border-color: #c39425; background: #fffcf2; }

            .tm-course-staffing-warning {
                display: flex;
                flex-direction: column;
                gap: 2px;
                padding: 9px 12px;
                border-top: 1px solid #e2e2e2;
                font-size: .76rem;
            }
            .tm-course-staffing-problem { background: #fff0ef; color: #8a2018; }
            .tm-course-staffing-advisory { background: #fff8df; color: #6d5414; }
            .tm-table-staffing-warning { max-width: 520px; margin-top: 4px; color: #8a2018; font-size: .73rem; line-height: 1.35; }
            .tm-course-advisory .tm-table-staffing-warning { color: #6d5414; }

            .tm-semester-section {
                margin-top: 16px;
            }

            .tm-semester-heading {
                display: flex;
                align-items: center;
                justify-content: space-between;
                width: 100%;
                padding: 12px 15px;
                border: 1px solid #c9c9c9;
                border-radius: 8px;
                background: #343434;
                color: white;
                cursor: pointer;
                text-align: left;
            }

            .tm-semester-heading span:first-child {
                display: flex;
                align-items: baseline;
                gap: 10px;
            }

            .tm-semester-heading small {
                color: #d4d4d4;
            }

            .tm-course-grid {
                display: grid;
                grid-template-columns:
                    repeat(auto-fill, minmax(310px, 1fr));
                gap: 13px;
                margin-top: 13px;
            }

            .tm-course-card {
                overflow: hidden;
                border: 1px solid #d5d5d5;
                border-radius: 9px;
                background: white;
                box-shadow: 0 2px 8px rgba(0, 0, 0, .05);
            }

            .tm-course-card:hover {
                border-color: #b3a369;
                box-shadow: 0 6px 16px rgba(0, 0, 0, .09);
            }

            .tm-course-card-header {
                display: flex;
                align-items: flex-start;
                justify-content: space-between;
                gap: 12px;
                padding: 15px;
                border-bottom: 1px solid #e1e1e1;
                background: #faf9f4;
            }

            .tm-course-card-header h3 {
                margin: 0 0 3px;
                font-size: 1.08rem;
            }

            .tm-course-card-header h3 a {
                color: #242424;
                text-decoration: none;
            }

            .tm-course-card-header h3 a:hover {
                text-decoration: underline;
            }

            .tm-course-card-header > div:first-child > span {
                color: #667085;
                font-size: .82rem;
            }

            .tm-capacity {
                display: flex;
                flex-direction: column;
                align-items: flex-end;
                min-width: 65px;
            }

            .tm-capacity strong {
                font-size: 1.45rem;
                line-height: 1;
            }

            .tm-capacity span {
                margin-top: 3px;
                color: #667085;
                font-size: .7rem;
            }

            .tm-card-actions {
                display: flex;
                align-items: center;
                gap: 7px;
                padding: 10px 12px;
            }

            .tm-card-actions button,
            .tm-table-actions button {
                padding: 5px 8px;
                border: 1px solid #aaa;
                border-radius: 5px;
                background: white;
                cursor: pointer;
                font-size: .78rem;
            }

            .tm-card-actions .tm-selected-action,
            .tm-table-actions .tm-selected-action {
                border-color: #857437;
                background: #f1e7b8;
                color: #3d3514;
                font-weight: 700;
            }

            .tm-card-actions a {
                margin-left: auto;
                font-size: .82rem;
                font-weight: 700;
            }

            .tm-table-wrapper {
                overflow-x: auto;
                margin-top: 15px;
                border: 1px solid #d4d4d4;
                border-radius: 8px;
                background: white;
            }

            .tm-modern-table {
                width: 100%;
                border-collapse: collapse;
            }

            .tm-modern-table th,
            .tm-modern-table td {
                padding: 11px 12px;
                border-bottom: 1px solid #e2e2e2;
                text-align: left;
                vertical-align: middle;
            }

            .tm-modern-table th {
                position: sticky;
                top: 0;
                z-index: 10;
                background: #333;
                color: white;
            }

            .tm-modern-table tbody tr:hover {
                background: #fafafa;
            }

            .tm-table-actions {
                white-space: nowrap;
            }

            .tm-capacity-badge {
                display: inline-block;
                min-width: 36px;
                padding: 4px 8px;
                border-radius: 999px;
                background: #eee;
                text-align: center;
                font-weight: 700;
            }

            .tm-empty-state {
                display: flex;
                flex-direction: column;
                align-items: center;
                gap: 6px;
                margin-top: 15px;
                padding: 45px;
                border: 1px dashed #999;
                border-radius: 9px;
                color: #667085;
                text-align: center;
            }

            .tm-primary-inline {
                margin-top: 10px;
                padding: 8px 14px;
                border: 0;
                border-radius: 6px;
                background: #b3a369;
                color: #111;
                cursor: pointer;
                font-weight: 700;
            }

            @media (max-width: 1150px) {
                .tm-toolbar {
                    position: static;
                    grid-template-columns: repeat(3, 1fr);
                }
            }

            @media (max-width: 650px) {
                .tm-dashboard-header {
                    align-items: flex-start;
                    flex-direction: column;
                }

                .tm-header-badges {
                    justify-content: flex-start;
                }

                .tm-view-tabs {
                    overflow-x: auto;
                }

                .tm-view-tabs button {
                    white-space: nowrap;
                }

                .tm-toolbar {
                    grid-template-columns: 1fr;
                }

                .tm-options-row {
                    align-items: flex-start;
                    flex-direction: column;
                }

                .tm-display-buttons {
                    margin-left: 0;
                }

                .tm-course-grid {
                    grid-template-columns: 1fr;
                }
            }
        `;

        document.head.appendChild(style);
    }
})();
