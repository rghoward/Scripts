// ==UserScript==
// @name         GT TA Hiring Instructor Dashboard
// @namespace    https://gatech.edu/
// @version      2.0.0
// @description  Adds course-grouped and instructor-grouped views to the GT TA Hiring instructor list.
// @match        https://ta-app.cc.gatech.edu/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

(function () {
    'use strict';

    const { clean, escapeAttribute, escapeHtml, normalize } = toolkit.utils;

    const originalTable = document.querySelector('main table.table');
    const heading = document.querySelector('main h1');

    if (
        !originalTable ||
        heading?.textContent.trim().toLowerCase() !== 'instructor list' ||
        document.getElementById('tm-instructor-dashboard')
    ) {
        return;
    }

    document.body.classList.add('gt-ta-toolkit-page');

    const instructors = extractInstructors();
    const courses = buildCourses(instructors);

    let currentView =
        localStorage.getItem('gt-instructor-dashboard-view') || 'course';

    addStyles();
    buildDashboard();
    render();

    function extractInstructors() {
        return Array.from(
            originalTable.querySelectorAll('tbody tr')
        ).map((row, index) => {
            const cells = row.querySelectorAll('td');
            const name = clean(cells[0]?.textContent) || 'Unknown Instructor';

            const assignments = Array.from(
                cells[1]?.querySelectorAll('li') || []
            ).map((item, assignmentIndex) => {
                const link = item.querySelector('a');

                const rawText = Array.from(item.childNodes)
                    .filter(node => node.nodeType === Node.TEXT_NODE)
                    .map(node => node.textContent)
                    .join(' ');

                const cleaned = clean(rawText);
                const termMatch = cleaned.match(/\(([^)]+)\)/);
                const term = termMatch?.[1]?.trim() || '';

                const course = clean(
                    cleaned.replace(/\([^)]+\)/g, '')
                );

                return {
                    id: `${index}-${assignmentIndex}`,
                    course,
                    term,
                    editUrl: link?.href || ''
                };
            }).filter(assignment => assignment.course);

            return {
                id: index,
                name,
                normalizedName: normalize(name),
                assignments
            };
        });
    }

    function buildCourses(instructorList) {
        const courseMap = new Map();

        instructorList.forEach(instructor => {
            instructor.assignments.forEach(assignment => {
                const key = assignment.course;

                if (!courseMap.has(key)) {
                    courseMap.set(key, {
                        name: assignment.course,
                        assignments: []
                    });
                }

                courseMap.get(key).assignments.push({
                    instructorId: instructor.id,
                    instructorName: instructor.name,
                    term: assignment.term,
                    editUrl: assignment.editUrl
                });
            });
        });

        return Array.from(courseMap.values()).sort((a, b) =>
            a.name.localeCompare(b.name, undefined, {
                numeric: true,
                sensitivity: 'base'
            })
        );
    }

    function buildDashboard() {
        const main = document.querySelector('main');

        const addLink = Array.from(main.querySelectorAll('a')).find(link =>
            link.href.includes('/admin/course-instructor/add')
        );

        const terms = Array.from(new Set(
            instructors.flatMap(instructor =>
                instructor.assignments
                    .map(assignment => assignment.term)
                    .filter(Boolean)
            )
        )).sort(sortTerms);

        const dashboard = document.createElement('section');
        dashboard.id = 'tm-instructor-dashboard';

        dashboard.innerHTML = `
            <div class="tm-dashboard-header">
                <div>
                    <h2>Course Instructor Dashboard</h2>
                    <p>View assignments grouped by course or instructor.</p>
                </div>

                ${
                    addLink
                        ? `
                            <a
                                class="tm-primary-button"
                                href="${escapeAttribute(addLink.href)}"
                            >
                                + Add assignment
                            </a>
                        `
                        : ''
                }
            </div>

            <div id="tm-dashboard-stats" class="tm-dashboard-stats"></div>

            <div class="tm-view-tabs">
                <button type="button" data-view="course">
                    By Course
                </button>

                <button type="button" data-view="instructor">
                    By Instructor
                </button>
            </div>

            <div class="tm-toolbar">
                <div class="tm-search-field">
                    <label for="tm-dashboard-search">Search</label>
                    <input
                        id="tm-dashboard-search"
                        type="search"
                        placeholder="Search course, instructor, username, or term..."
                        autocomplete="off"
                    >
                </div>

                <div>
                    <label for="tm-term-filter">Term</label>
                    <select id="tm-term-filter">
                        <option value="">All terms</option>
                        ${terms.map(term => `
                            <option value="${escapeAttribute(term)}">
                                ${escapeHtml(formatTerm(term))}
                            </option>
                        `).join('')}
                    </select>
                </div>

                <div>
                    <label for="tm-sort-order">Sort</label>
                    <select id="tm-sort-order">
                        <option value="alphabetical">Alphabetical</option>
                        <option value="assignments-desc">
                            Most assignments
                        </option>
                        <option value="assignments-asc">
                            Fewest assignments
                        </option>
                    </select>
                </div>

                <button
                    type="button"
                    id="tm-clear-filters"
                    class="tm-secondary-button"
                >
                    Clear
                </button>
            </div>

            <div class="tm-options">
                <label id="tm-empty-instructors-option">
                    <input id="tm-hide-empty" type="checkbox" checked>
                    Hide instructors without assignments
                </label>

                <label>
                    <input id="tm-hide-all" type="checkbox">
                    Hide “ALL” assignments
                </label>

                <span id="tm-result-summary"></span>
            </div>

            <div id="tm-dashboard-results"></div>
        `;

        originalTable.before(dashboard);
        originalTable.style.display = 'none';

        if (addLink) {
            addLink.style.display = 'none';
        }

        Array.from(main.querySelectorAll('p')).forEach(paragraph => {
            if (paragraph.textContent.includes('automatically')) {
                paragraph.style.display = 'none';
            }
        });

        document
            .getElementById('tm-dashboard-search')
            .addEventListener('input', render);

        document
            .getElementById('tm-term-filter')
            .addEventListener('change', render);

        document
            .getElementById('tm-sort-order')
            .addEventListener('change', render);

        document
            .getElementById('tm-hide-empty')
            .addEventListener('change', render);

        document
            .getElementById('tm-hide-all')
            .addEventListener('change', render);

        document
            .getElementById('tm-clear-filters')
            .addEventListener('click', clearFilters);

        document.querySelectorAll('.tm-view-tabs button').forEach(button => {
            button.addEventListener('click', () => {
                currentView = button.dataset.view;

                localStorage.setItem(
                    'gt-instructor-dashboard-view',
                    currentView
                );

                updateViewControls();
                render();
            });
        });

        document.addEventListener('keydown', event => {
            const target = event.target;

            const isTyping =
                target instanceof HTMLInputElement ||
                target instanceof HTMLTextAreaElement ||
                target instanceof HTMLSelectElement ||
                target?.isContentEditable;

            if (event.key === '/' && !isTyping) {
                event.preventDefault();
                document.getElementById('tm-dashboard-search').focus();
            }
        });

        updateViewControls();
    }

    function updateViewControls() {
        document.querySelectorAll('.tm-view-tabs button').forEach(button => {
            button.classList.toggle(
                'tm-active-tab',
                button.dataset.view === currentView
            );
        });

        document.getElementById(
            'tm-empty-instructors-option'
        ).style.display = currentView === 'instructor' ? '' : 'none';
    }

    function clearFilters() {
        document.getElementById('tm-dashboard-search').value = '';
        document.getElementById('tm-term-filter').value = '';
        document.getElementById('tm-sort-order').value = 'alphabetical';
        document.getElementById('tm-hide-empty').checked = true;
        document.getElementById('tm-hide-all').checked = false;

        render();
        document.getElementById('tm-dashboard-search').focus();
    }

    function render() {
        const query = normalize(
            document.getElementById('tm-dashboard-search').value
        );

        const selectedTerm =
            document.getElementById('tm-term-filter').value;

        const sortOrder =
            document.getElementById('tm-sort-order').value;

        const hideEmpty =
            document.getElementById('tm-hide-empty').checked;

        const hideAll =
            document.getElementById('tm-hide-all').checked;

        renderStats(selectedTerm, hideAll);

        if (currentView === 'course') {
            renderCourseView(query, selectedTerm, hideAll, sortOrder);
        } else {
            renderInstructorView(
                query,
                selectedTerm,
                hideAll,
                hideEmpty,
                sortOrder
            );
        }
    }

    function renderStats(selectedTerm, hideAll) {
        const assignments = instructors.flatMap(instructor =>
            instructor.assignments.filter(assignment => {
                if (selectedTerm && assignment.term !== selectedTerm) {
                    return false;
                }

                if (hideAll && assignment.term === 'ALL') {
                    return false;
                }

                return true;
            })
        );

        const activeInstructorIds = new Set();

        instructors.forEach(instructor => {
            if (
                instructor.assignments.some(assignment => {
                    if (selectedTerm && assignment.term !== selectedTerm) {
                        return false;
                    }

                    if (hideAll && assignment.term === 'ALL') {
                        return false;
                    }

                    return true;
                })
            ) {
                activeInstructorIds.add(instructor.id);
            }
        });

        const activeCourses = new Set(
            assignments.map(assignment => assignment.course)
        );

        document.getElementById('tm-dashboard-stats').innerHTML = `
            <div class="tm-stat-card">
                <strong>${activeCourses.size}</strong>
                <span>Courses</span>
            </div>

            <div class="tm-stat-card">
                <strong>${activeInstructorIds.size}</strong>
                <span>Assigned instructors</span>
            </div>

            <div class="tm-stat-card">
                <strong>${assignments.length}</strong>
                <span>Assignments</span>
            </div>

            <div class="tm-stat-card">
                <strong>${instructors.length}</strong>
                <span>Total instructor records</span>
            </div>
        `;
    }

    function renderCourseView(query, selectedTerm, hideAll, sortOrder) {
        let filteredCourses = courses
            .map(course => {
                const assignments = course.assignments.filter(assignment => {
                    if (selectedTerm && assignment.term !== selectedTerm) {
                        return false;
                    }

                    if (hideAll && assignment.term === 'ALL') {
                        return false;
                    }

                    return true;
                });

                return {
                    ...course,
                    assignments
                };
            })
            .filter(course => course.assignments.length > 0)
            .filter(course => {
                if (!query) {
                    return true;
                }

                const searchable = normalize([
                    course.name,
                    ...course.assignments.map(assignment =>
                        `${assignment.instructorName} ${assignment.term}`
                    )
                ].join(' '));

                return searchable.includes(query);
            });

        filteredCourses = sortItems(
            filteredCourses,
            sortOrder,
            item => item.name,
            item => item.assignments.length
        );

        updateSummary(
            `${filteredCourses.length} course${
                filteredCourses.length === 1 ? '' : 's'
            } shown`
        );

        const container =
            document.getElementById('tm-dashboard-results');

        if (!filteredCourses.length) {
            renderEmpty(container);
            return;
        }

        container.innerHTML = `
            <div class="tm-course-grid">
                ${filteredCourses.map(course => `
                    <article class="tm-course-card">
                        <div class="tm-card-header">
                            <h3>${escapeHtml(course.name)}</h3>

                            <span>
                                ${course.assignments.length}
                                instructor${
                                    course.assignments.length === 1 ? '' : 's'
                                }
                            </span>
                        </div>

                        <div class="tm-assignment-list">
                            ${course.assignments
                                .sort((a, b) =>
                                    a.instructorName.localeCompare(
                                        b.instructorName
                                    )
                                )
                                .map(renderInstructorAssignment)
                                .join('')}
                        </div>
                    </article>
                `).join('')}
            </div>
        `;
    }

    function renderInstructorView(
        query,
        selectedTerm,
        hideAll,
        hideEmpty,
        sortOrder
    ) {
        let filteredInstructors = instructors
            .map(instructor => {
                const assignments = instructor.assignments.filter(
                    assignment => {
                        if (
                            selectedTerm &&
                            assignment.term !== selectedTerm
                        ) {
                            return false;
                        }

                        if (hideAll && assignment.term === 'ALL') {
                            return false;
                        }

                        return true;
                    }
                );

                return {
                    ...instructor,
                    filteredAssignments: assignments
                };
            })
            .filter(instructor => {
                if (hideEmpty && !instructor.filteredAssignments.length) {
                    return false;
                }

                if (!query) {
                    return true;
                }

                const searchable = normalize([
                    instructor.name,
                    ...instructor.filteredAssignments.map(assignment =>
                        `${assignment.course} ${assignment.term}`
                    )
                ].join(' '));

                return searchable.includes(query);
            });

        filteredInstructors = sortItems(
            filteredInstructors,
            sortOrder,
            item => item.name,
            item => item.filteredAssignments.length
        );

        updateSummary(
            `${filteredInstructors.length} instructor${
                filteredInstructors.length === 1 ? '' : 's'
            } shown`
        );

        const container =
            document.getElementById('tm-dashboard-results');

        if (!filteredInstructors.length) {
            renderEmpty(container);
            return;
        }

        container.innerHTML = `
            <div class="tm-instructor-grid">
                ${filteredInstructors.map(instructor => `
                    <article class="tm-instructor-card">
                        <div class="tm-card-header">
                            <h3>${escapeHtml(instructor.name)}</h3>

                            <span>
                                ${instructor.filteredAssignments.length}
                                course${
                                    instructor.filteredAssignments.length === 1
                                        ? ''
                                        : 's'
                                }
                            </span>
                        </div>

                        <div class="tm-assignment-list">
                            ${
                                instructor.filteredAssignments.length
                                    ? instructor.filteredAssignments
                                        .sort((a, b) =>
                                            a.course.localeCompare(
                                                b.course,
                                                undefined,
                                                { numeric: true }
                                            )
                                        )
                                        .map(renderCourseAssignment)
                                        .join('')
                                    : `
                                        <div class="tm-no-assignments">
                                            No course assignments
                                        </div>
                                    `
                            }
                        </div>
                    </article>
                `).join('')}
            </div>
        `;
    }

    function renderInstructorAssignment(assignment) {
        return `
            <div class="tm-assignment-row">
                <div>
                    <strong>
                        ${escapeHtml(assignment.instructorName)}
                    </strong>

                    <span class="tm-term-badge">
                        ${escapeHtml(formatTerm(assignment.term))}
                    </span>
                </div>

                ${
                    assignment.editUrl
                        ? `
                            <a
                                href="${escapeAttribute(assignment.editUrl)}"
                                class="tm-edit-link"
                            >
                                Edit
                            </a>
                        `
                        : ''
                }
            </div>
        `;
    }

    function renderCourseAssignment(assignment) {
        return `
            <div class="tm-assignment-row">
                <div>
                    <strong>${escapeHtml(assignment.course)}</strong>

                    <span class="tm-term-badge">
                        ${escapeHtml(formatTerm(assignment.term))}
                    </span>
                </div>

                ${
                    assignment.editUrl
                        ? `
                            <a
                                href="${escapeAttribute(assignment.editUrl)}"
                                class="tm-edit-link"
                            >
                                Edit
                            </a>
                        `
                        : ''
                }
            </div>
        `;
    }

    function renderEmpty(container) {
        container.innerHTML = `
            <div class="tm-empty">
                <strong>No matching results</strong>
                <span>Try clearing a filter or changing your search.</span>
            </div>
        `;
    }

    function updateSummary(text) {
        document.getElementById('tm-result-summary').textContent = text;
    }

    function sortItems(items, sortOrder, nameGetter, countGetter) {
        return [...items].sort((a, b) => {
            if (sortOrder === 'assignments-desc') {
                return (
                    countGetter(b) - countGetter(a) ||
                    nameGetter(a).localeCompare(nameGetter(b))
                );
            }

            if (sortOrder === 'assignments-asc') {
                return (
                    countGetter(a) - countGetter(b) ||
                    nameGetter(a).localeCompare(nameGetter(b))
                );
            }

            return nameGetter(a).localeCompare(
                nameGetter(b),
                undefined,
                {
                    numeric: true,
                    sensitivity: 'base'
                }
            );
        });
    }

    function formatTerm(term) {
        const names = {
            ALL: 'All terms',
            Fa26: 'Fall 2026',
            Su26: 'Summer 2026',
            Sp26: 'Spring 2026',
            Fa25: 'Fall 2025',
            Su25: 'Summer 2025',
            Sp25: 'Spring 2025'
        };

        return names[term] || term || 'Unspecified';
    }

    function sortTerms(a, b) {
        if (a === 'ALL') return 1;
        if (b === 'ALL') return -1;
        return b.localeCompare(a);
    }

    function addStyles() {
        const style = document.createElement('style');

        style.textContent = `
            #tm-instructor-dashboard {
                margin: 18px 0 50px;
                color: #252525;
            }

            .tm-primary-button {
                padding: 10px 16px;
                border-radius: 7px;
                background: #b3a369;
                color: #111 !important;
                font-weight: 700;
                text-decoration: none !important;
                white-space: nowrap;
            }

            .tm-dashboard-stats {
                display: grid;
                grid-template-columns: repeat(4, 1fr);
                gap: 12px;
                margin-bottom: 15px;
            }

            .tm-stat-card {
                display: flex;
                flex-direction: column;
                padding: 15px;
                border: 1px solid #ddd;
                border-radius: 9px;
                background: white;
            }

            .tm-stat-card strong {
                font-size: 1.55rem;
            }

            .tm-stat-card span {
                color: #667085;
                font-size: .86rem;
            }

            .tm-toolbar {
                grid-template-columns:
                    minmax(300px, 2fr)
                    minmax(175px, 1fr)
                    minmax(190px, 1fr)
                    auto;
            }

            #tm-instructor-dashboard .tm-toolbar > div {
                display: flex;
                min-width: 0;
                flex-direction: column;
                gap: 7px;
            }

            #tm-instructor-dashboard .tm-toolbar label {
                position: static !important;
                inset: auto !important;
                display: block !important;
                width: auto !important;
                height: auto !important;
                margin: 0 !important;
                padding: 0 !important;
                transform: none !important;
                line-height: 1.25 !important;
            }

            #tm-instructor-dashboard .tm-toolbar input,
            #tm-instructor-dashboard .tm-toolbar select {
                box-sizing: border-box !important;
                width: 100% !important;
                min-width: 0 !important;
                height: 46px !important;
                margin: 0 !important;
            }

            .tm-options {
                display: flex;
                align-items: center;
                gap: 18px;
                padding: 11px 15px;
                border: 1px solid #ccc;
                border-top: 0;
                background: #f6f6f6;
            }

            .tm-options label {
                display: flex;
                align-items: center;
                gap: 6px;
                margin: 0;
            }

            #tm-result-summary {
                margin-left: auto;
                color: #667085;
                font-weight: 600;
            }

            .tm-course-grid,
            .tm-instructor-grid {
                display: grid;
                grid-template-columns: repeat(
                    auto-fill,
                    minmax(340px, 1fr)
                );
                gap: 14px;
                margin-top: 15px;
            }

            .tm-course-card,
            .tm-instructor-card {
                overflow: hidden;
                border: 1px solid #d8d8d8;
                border-radius: 9px;
                background: white;
                box-shadow: 0 2px 7px rgba(0,0,0,.05);
            }

            .tm-card-header {
                display: flex;
                align-items: center;
                justify-content: space-between;
                gap: 12px;
                padding: 13px 15px;
                border-bottom: 1px solid #ddd;
                background: #f7f5ec;
            }

            .tm-card-header h3 {
                margin: 0;
                font-size: 1.08rem;
            }

            .tm-card-header span {
                color: #667085;
                font-size: .8rem;
                white-space: nowrap;
            }

            .tm-assignment-list {
                padding: 5px 15px;
            }

            .tm-assignment-row {
                display: flex;
                align-items: center;
                justify-content: space-between;
                gap: 12px;
                padding: 10px 0;
                border-bottom: 1px solid #eee;
            }

            .tm-assignment-row:last-child {
                border-bottom: 0;
            }

            .tm-term-badge {
                display: inline-block;
                margin-left: 7px;
                padding: 2px 7px;
                border-radius: 999px;
                background: #eee;
                color: #555;
                font-size: .72rem;
            }

            .tm-edit-link {
                padding: 5px 9px;
                border: 1px solid #c7bb86;
                border-radius: 5px;
                background: #faf7e8;
                color: #554a20 !important;
                font-size: .78rem;
                font-weight: 700;
                text-decoration: none !important;
            }

            .tm-edit-link:hover {
                background: #eee4b5;
            }

            .tm-no-assignments {
                padding: 12px 0;
                color: #888;
                font-style: italic;
            }

            .tm-empty {
                display: flex;
                flex-direction: column;
                align-items: center;
                gap: 5px;
                margin-top: 15px;
                padding: 45px;
                border: 1px dashed #999;
                border-radius: 9px;
                color: #667085;
            }

            @media (max-width: 850px) {
                .tm-dashboard-stats {
                    grid-template-columns: 1fr 1fr;
                }

                .tm-toolbar {
                    position: static;
                    grid-template-columns: 1fr 1fr;
                }
            }

            @media (max-width: 600px) {
                .tm-dashboard-header {
                    align-items: flex-start;
                    flex-direction: column;
                }

                .tm-dashboard-stats,
                .tm-toolbar {
                    grid-template-columns: 1fr;
                }

                .tm-options {
                    align-items: flex-start;
                    flex-direction: column;
                }

                #tm-result-summary {
                    margin-left: 0;
                }

                .tm-course-grid,
                .tm-instructor-grid {
                    grid-template-columns: 1fr;
                }
            }
        `;

        document.head.appendChild(style);
    }
})();
