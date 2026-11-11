(function () {
    'use strict';

    const { clean, normalize } = toolkit.utils;
    const semesterList = '/admin/semester/';
    const bannerBase = 'https://registration.banner.gatech.edu/StudentRegistrationSsb';
    const managerLink = document.querySelector('#page-navigation a[href^="/admin/manager"]');
    const menuItem = managerLink?.closest('li');
    if (!menuItem || document.getElementById('tm-ta-allotment')) return;

    const entry = document.createElement('li');
    entry.className = 'leaf main-menu-link-360';
    const trigger = document.createElement('a');
    trigger.href = '#tm-ta-allotment';
    trigger.textContent = 'TA Allotment';
    trigger.setAttribute('aria-haspopup', 'dialog');
    entry.append(trigger);
    menuItem.after(entry);

    const dialog = document.createElement('dialog');
    dialog.id = 'tm-ta-allotment';
    dialog.setAttribute('aria-labelledby', 'tm-ta-allotment-title');
    dialog.innerHTML = `
        <header>
            <div><h2 id="tm-ta-allotment-title">TA Allotment</h2>
            <p>Saved TA capacity by course · Banner estimates</p></div>
            <button type="button" data-close>Close</button>
        </header>
        <div class="tm-allotment-controls">
            <label>Semester <select disabled></select></label>
            <label>Find a course <input type="search" placeholder="Course code or title" disabled></label>
            <label>Show
                <select data-course-filter disabled>
                    <option value="all">All courses</option>
                    <option value="increase">Needs more TAs</option>
                    <option value="review">Needs review</option>
                </select>
            </label>
            <button type="button" data-refresh>Refresh</button>
            <button type="button" data-move-zero disabled>Move zero-allotment courses</button>
        </div>
        <p role="status" data-category-status hidden></p>
        <div class="tm-allotment-tabs" role="tablist" aria-label="SCI teaching status">
            <button type="button" role="tab" id="tm-allotment-current" aria-selected="true"
                aria-controls="tm-allotment-courses">Currently taught by SCI</button>
            <button type="button" role="tab" id="tm-allotment-inactive" aria-selected="false"
                aria-controls="tm-allotment-courses" tabindex="-1">Not currently taught by SCI</button>
        </div>
        <p role="status" data-enrollment-status hidden></p>
        <div id="tm-allotment-courses" role="tabpanel" aria-labelledby="tm-allotment-current"
            class="tm-allotment-scroll" tabindex="0">
            <p role="status" data-course-status></p>
            <details class="tm-allotment-estimate-note">
                <summary>How enrollment estimates are calculated</summary>
                <p>Estimates use current Banner enrollment from assigned sections marked for allotment and show full staffing.
                Paid slots round up at one per 30 students. For UTA-only staffing, unpaid slots can bring
                the total up to one per 20 students, rounded down. CS 2050 uses the UTA-only scenario.
                Courses without a confirmed staffing model show both scenarios.</p>
            </details>
            <section class="tm-allotment-mapping" aria-label="Banner section mapping" hidden></section>
            <table hidden>
                <thead><tr>
                    <th scope="col">Course</th>
                    <th scope="col">Saved allotment</th>
                    <th scope="col">Estimated allotment</th>
                    <th scope="col">Enrolled by CRN</th>
                    <th scope="col">Instructors</th>
                </tr></thead>
                <tbody></tbody>
            </table>
        </div>
        <template data-allotment-editor>
            <form class="tm-allotment-edit" hidden>
                <label>New allotment <input type="number" name="allotment" min="1" step="1" required></label>
                <div>
                    <button type="submit">Save allotment</button>
                    <button type="button" data-cancel-allotment>Cancel</button>
                </div>
                <p>Setting allotment to zero can delete course data.</p>
            </form>
            <p role="status" data-allotment-status hidden></p>
        </template>
    `;
    document.body.append(dialog);
    addStyles();

    const semesterSelect = dialog.querySelector('select');
    const search = dialog.querySelector('input');
    const courseFilter = dialog.querySelector('[data-course-filter]');
    const refresh = dialog.querySelector('[data-refresh]');
    const moveZero = dialog.querySelector('[data-move-zero]');
    const status = dialog.querySelector('[data-course-status]');
    const categoryStatus = dialog.querySelector('[data-category-status]');
    const enrollmentStatus = dialog.querySelector('[data-enrollment-status]');
    const table = dialog.querySelector('table');
    const tbody = table.querySelector('tbody');
    const coursePanel = dialog.querySelector('[role="tabpanel"]');
    const mappingPanel = dialog.querySelector('.tm-allotment-mapping');
    const editorTemplate = dialog.querySelector('[data-allotment-editor]').content;
    const allotmentEditor = editorTemplate.querySelector('form').cloneNode(true);
    const allotmentStatus = editorTemplate.querySelector('[data-allotment-status]').cloneNode(true);
    const allotmentInput = allotmentEditor.elements.namedItem('allotment');
    const tabs = [...dialog.querySelectorAll('[role="tab"]')];
    const pageTerm = document.querySelector('form[name="semester"] #semester_name')?.value;
    let terms = [];
    let courses = [];
    const bannerSections = new Map();
    const categoryStorageKey = 'gt-ta-toolkit:allotment:not-currently-taught-by-sci';
    const mappingStorageKey = 'gt-ta-toolkit:allotment:section-mappings';
    const excludedSection = '@excluded';
    const unmappedSection = '@unmapped';
    let sectionMappings = loadSectionMappings();
    let inactiveCourseKeys = loadInactiveCourses();
    let enrollmentLoading = false;
    let automaticEnrollmentStarted = false;
    let showInactive = false;
    let allotmentDraft = null;
    let allotmentFeedbackCourse = null;
    let allotmentSaving = false;

    trigger.addEventListener('click', event => {
        event.preventDefault();
        dialog.showModal();
        maybeLoadEnrollment();
    });
    dialog.querySelector('[data-close]').addEventListener('click', () => dialog.close());
    dialog.addEventListener('close', () => trigger.focus());
    semesterSelect.addEventListener('change', loadCourses);
    search.addEventListener('input', renderCourses);
    courseFilter.addEventListener('change', renderCourses);
    refresh.addEventListener('click', () => terms.length ? loadCourses() : loadTerms());
    moveZero.addEventListener('click', markZeroAllotments);
    allotmentEditor.addEventListener('submit', saveAllotment);
    allotmentEditor.querySelector('[data-cancel-allotment]').addEventListener('click', () => {
        closeAllotmentEditor();
        focusAllotmentEditButton();
    });
    tabs.forEach((tab, index) => {
        tab.addEventListener('click', () => selectCategory(index));
        tab.addEventListener('keydown', event => {
            if (!['ArrowLeft', 'ArrowRight', 'Home', 'End'].includes(event.key)) return;
            event.preventDefault();
            const next = { Home: 0, End: tabs.length - 1 }[event.key] ?? (1 - index);
            selectCategory(next);
            tabs[next].focus();
        });
    });
    loadTerms();

    function maybeLoadEnrollment() {
        if (!dialog.open || search.disabled || automaticEnrollmentStarted) return;
        automaticEnrollmentStarted = true;
        loadEnrollment(currentCourseCodes(), { automatic: true });
    }

    function selectCategory(index) {
        showInactive = index === 1;
        tabs.forEach((tab, position) => {
            tab.setAttribute('aria-selected', String(position === index));
            tab.tabIndex = position === index ? 0 : -1;
        });
        coursePanel.setAttribute('aria-labelledby', tabs[index].id);
        if (!search.disabled) renderCourses();
    }

    async function fetchPage(url) {
        const response = await fetch(url, {
            method: 'GET',
            credentials: 'same-origin',
            redirect: 'error',
            cache: 'no-store',
            signal: AbortSignal.timeout(15000)
        });
        if (!response.ok) throw new Error(`Request returned HTTP ${response.status}.`);
        const template = document.createElement('template');
        template.innerHTML = await response.text();
        return template.content;
    }

    async function loadTerms() {
        refresh.disabled = true;
        status.textContent = 'Finding semesters…';
        try {
            const page = await fetchPage(semesterList);
            terms = [...page.querySelectorAll('main table tbody tr > td:first-child a[href]')]
                .map(link => {
                    const name = clean(link.textContent);
                    const term = name.match(/^(Spring|Summer|Fall) (\d{4})$/i);
                    const url = new URL(link.getAttribute('href'), new URL(semesterList, location.origin));
                    if (!term || url.origin !== location.origin || !url.pathname.startsWith(semesterList) ||
                        url.pathname === semesterList) return null;
                    const order = ['spring', 'summer', 'fall'].indexOf(term[1].toLowerCase());
                    return { name, url: url.href, order: Number(term[2]) * 3 + order };
                })
                .filter(Boolean)
                .sort((a, b) => b.order - a.order);

            if (!terms.length) throw new Error('No semester edit links were found.');
            semesterSelect.replaceChildren(...terms.map(term => new Option(term.name, term.url)));
            const matchingTerm = terms.find(term => term.name === pageTerm);
            if (matchingTerm) semesterSelect.value = matchingTerm.url;
            await loadCourses();
        } catch (error) {
            status.textContent = `Could not load semesters. ${error.message}`;
        } finally {
            refresh.disabled = enrollmentLoading || allotmentSaving;
        }
    }

    async function loadCourses() {
        semesterSelect.disabled = true;
        refresh.disabled = true;
        search.disabled = true;
        courseFilter.disabled = true;
        moveZero.disabled = true;
        categoryStatus.hidden = true;
        allotmentStatus.hidden = true;
        allotmentFeedbackCourse = null;
        closeAllotmentEditor();
        enrollmentStatus.hidden = true;
        automaticEnrollmentStarted = false;
        mappingPanel.hidden = true;
        mappingPanel.replaceChildren();
        bannerSections.clear();
        table.hidden = true;
        tbody.replaceChildren();
        courses = [];
        const term = terms.find(item => item.url === semesterSelect.value);
        status.textContent = `Loading saved allotments for ${term.name}…`;
        try {
            const { rows } = await readSemesterAllotments(term);
            courses = rows.map(({ name, capacity }) => ({ name, capacity }));
            search.disabled = false;
            courseFilter.disabled = false;
            renderCourses();
        } catch (error) {
            status.textContent = `Could not load saved allotments for ${term.name}. ${error.message}`;
        } finally {
            semesterSelect.disabled = false;
            refresh.disabled = false;
        }
        maybeLoadEnrollment();
    }

    async function readSemesterAllotments(term, { fresh = false } = {}) {
        const url = new URL(term.url);
        // The TA App can return a just-saved semester form from an intermediary
        // cache for a few seconds. A unique query parameter makes the read used
        // for save verification independent of that cached response.
        if (fresh) url.searchParams.set('_tm_verify', `${Date.now()}-${Math.random().toString(36).slice(2)}`);
        const page = await fetchPage(url.href);
        const form = page.querySelector('main form[name="semester"]');
        if (normalize(form?.querySelector('#semester_name')?.value) !== normalize(term.name)) {
            throw new Error('The returned semester form did not match the selected term.');
        }
        const rows = [...form.querySelectorAll('input[type="number"][name^="semester[sections]"][name$="[hasTaCapacity]"]')]
            .map(input => {
                const courseCell = input.closest('td')?.nextElementSibling;
                const name = clean([...courseCell?.childNodes ?? []]
                    .filter(node => node.nodeType === Node.TEXT_NODE)
                    .map(node => node.textContent)
                    .join(' '));
                const capacity = input.valueAsNumber;
                if (!name || !Number.isSafeInteger(capacity) || capacity < 0) {
                    throw new Error('A course row could not be read.');
                }
                return { name, capacity, input };
            });
        if (!rows.length) throw new Error('No course allotment fields were found.');
        return { form, rows };
    }

    function findAllotmentRow(rows, courseName) {
        const matches = rows.filter(row => row.name === courseName);
        if (matches.length !== 1) throw new Error('The course could not be uniquely identified on the semester form.');
        return matches[0];
    }

    function pause(milliseconds) {
        return new Promise(resolve => setTimeout(resolve, milliseconds));
    }

    async function verifySavedAllotment(term, courseName, expectedCapacity, requestFailure) {
        // A POST may redirect before the semester page reflects its committed
        // value. Retry fresh reads rather than treating the first race as a
        // failed save. The waits total just under eight seconds.
        const waits = [0, 350, 700, 1400, 2400, 3000];
        let lastReadError;
        let lastSaved;
        for (const wait of waits) {
            if (wait) await pause(wait);
            try {
                const { rows } = await readSemesterAllotments(term, { fresh: true });
                const saved = findAllotmentRow(rows, courseName).capacity;
                if (saved === expectedCapacity) return saved;
                lastSaved = saved;
            } catch (error) {
                lastReadError = error;
            }
        }
        if (lastSaved !== undefined) {
            throw new Error(`The TA App still shows ${lastSaved} for this course. ${requestFailure ?? 'The requested value was not saved.'}`);
        }
        throw new Error(`Could not verify the saved value after several fresh reads. ${requestFailure ?? lastReadError?.message ?? 'The semester form was unavailable.'}`);
    }

    async function updateSavedAllotment(term, course, capacity) {
        if (!Number.isSafeInteger(capacity) || capacity < 1) throw new Error('Enter a positive whole number.');
        const { form, rows } = await readSemesterAllotments(term);
        const current = findAllotmentRow(rows, course.name);
        if (current.capacity !== course.capacity) {
            course.capacity = current.capacity;
            throw new Error(`The saved allotment changed to ${current.capacity}. Review it before saving again.`);
        }

        const editUrl = new URL(term.url);
        const action = new URL(form.getAttribute('action') || editUrl.href, editUrl);
        if (form.method !== 'post' || form.enctype !== 'application/x-www-form-urlencoded' ||
            action.origin !== location.origin || action.pathname !== editUrl.pathname) {
            throw new Error('The semester form has an unexpected save destination or format.');
        }
        const data = new FormData(form);
        const field = current.input.name;
        if (!data.get('semester[_token]') || data.getAll(field).length !== 1 ||
            data.get(field) !== current.input.value) {
            throw new Error('The semester form is missing the save token or the course field.');
        }
        data.set(field, String(capacity));

        let requestFailure;
        try {
            const response = await fetch(action.href, {
                method: 'POST', body: new URLSearchParams(data), credentials: 'same-origin',
                redirect: 'manual', signal: AbortSignal.timeout(15000)
            });
            if (!response.ok && response.type !== 'opaqueredirect') {
                requestFailure = `TA App returned HTTP ${response.status}.`;
            }
        } catch {
            requestFailure = 'The save request did not complete normally.';
        }

        const saved = await verifySavedAllotment(term, course.name, capacity, requestFailure);
        course.capacity = saved;
    }

    function closeAllotmentEditor() {
        allotmentDraft = null;
        allotmentEditor.hidden = true;
    }

    function focusAllotmentEditButton() {
        allotmentStatus.parentElement?.querySelector('.tm-allotment-edit-button')?.focus({ preventScroll: true });
    }

    function editAllotment(course, cell, proposedCapacity = course.capacity) {
        const term = terms.find(item => item.url === semesterSelect.value);
        if (allotmentSaving || !term) return;
        allotmentDraft = { course, term };
        allotmentFeedbackCourse = course;
        allotmentStatus.hidden = true;
        allotmentEditor.hidden = false;
        allotmentEditor.setAttribute('aria-label', `Edit allotment for ${course.name}, ${term.name}`);
        allotmentInput.value = String(proposedCapacity);
        cell.append(allotmentEditor, allotmentStatus);
        allotmentInput.focus({ preventScroll: true });
    }

    async function saveAllotment(event) {
        event.preventDefault();
        if (allotmentSaving || !allotmentDraft) return;
        const { course, term } = allotmentDraft;
        const capacity = allotmentInput.valueAsNumber;
        allotmentStatus.hidden = false;
        if (capacity === course.capacity) {
            allotmentStatus.textContent = `Already saved as ${capacity}.`;
            closeAllotmentEditor();
            focusAllotmentEditButton();
            return;
        }
        allotmentSaving = true;
        semesterSelect.disabled = refresh.disabled = true;
        for (const control of allotmentEditor.elements) control.disabled = true;
        allotmentStatus.textContent = 'Saving allotment…';
        renderCourses();
        try {
            await updateSavedAllotment(term, course, capacity);
            allotmentStatus.textContent = `Saved and verified: ${capacity}.`;
            closeAllotmentEditor();
        } catch (error) {
            allotmentStatus.textContent = `Could not confirm save. ${error.message}`;
        } finally {
            allotmentSaving = false;
            semesterSelect.disabled = refresh.disabled = enrollmentLoading;
            for (const control of allotmentEditor.elements) control.disabled = false;
            renderCourses();
            if (allotmentDraft && allotmentEditor.isConnected) allotmentInput.focus({ preventScroll: true });
            else focusAllotmentEditButton();
        }
    }

    async function loadEnrollment(codes, { recheck = false, automatic = false } = {}) {
        const pending = codes.filter(code => recheck || !bannerSections.has(code));
        if (enrollmentLoading || !pending.length) return;
        const term = terms.find(item => item.url === semesterSelect.value);
        enrollmentLoading = true;
        semesterSelect.disabled = refresh.disabled = true;
        renderCourses();
        enrollmentStatus.hidden = false;
        enrollmentStatus.textContent = `Loading Banner enrollment for ${term.name}…`;
        try {
            const bannerTerm = await selectBannerTerm(term.name);
            for (const [index, code] of pending.entries()) {
                const progress = `Checking ${code} (${index + 1} of ${pending.length})`;
                const sections = await getBannerSections(bannerTerm, code, progress);
                bannerSections.set(code, sections);
                renderCourses();
            }
            enrollmentStatus.textContent = `${term.name} · Checked ${pending.length} ${pending.length === 1 ? 'course code' : 'course codes'} in Banner, all campuses. Waitlists excluded.`;
            if (!automatic && mappingPanel.hidden) {
                const review = pending.find(code => {
                    const group = getSectionGroup(code);
                    return group.sections.some(section => !effectiveSectionChoice(group, section));
                });
                if (review) openSectionMapping(review, pending.length === 1);
            }
        } catch (error) {
            enrollmentStatus.textContent = `Banner enrollment unavailable. ${error.message}`;
        } finally {
            enrollmentLoading = false;
            semesterSelect.disabled = refresh.disabled = allotmentSaving;
            renderCourses();
        }
    }

    async function selectBannerTerm(name) {
        const [, season, year] = name.toLowerCase().match(/^(spring|summer|fall) (\d{4})$/);
        const term = year + { spring: '02', summer: '05', fall: '08' }[season];
        // Banner's public search needs a session and term before returning class results.
        await bannerRequest('/', { step: 'Opening Banner' });
        await bannerRequest('/ssb/term/search?mode=search', { form: { term }, step: `Selecting ${name} in Banner` });
        return term;
    }

    async function getBannerSections(term, code, progress) {
        const sections = [];
        for await (const row of getBannerCourseRows(term, code, progress)) {
            const { courseReferenceNumber: crn, enrollment } = row;
            if (!Number.isSafeInteger(enrollment) || enrollment < 0) {
                throw new Error(`Banner returned invalid enrollment for CRN ${crn}.`);
            }
            const faculty = Array.isArray(row.faculty) ? row.faculty : [];
            sections.push({
                crn, enrollment, catalog: clean(row.subjectCourse), code: row.sequenceNumber,
                method: clean(row.instructionalMethodDescription),
                campus: row.campusDescription || 'Campus unspecified',
                instructors: [...new Set(faculty.map(person => clean(person?.displayName)).filter(Boolean))],
                needsReview: row.isSectionLinked === true || Boolean(row.crossList)
            });
        }
        return sections;
    }

    async function* getBannerCourseRows(term, code, progress) {
        const subject = code.slice(0, -4);
        const courseNumber = code.slice(-4);
        let offset = 0;
        let total;
        let searchId = newBannerSearchId();
        let resetSearch = false;
        let usePilotQuery = false;
        const seen = new Set();
        do {
            const query = new URLSearchParams({
                txt_term: term, txt_subject: subject, txt_courseNumber: courseNumber,
                pageOffset: String(offset), pageMaxSize: usePilotQuery ? '500' : '150',
                sortColumn: usePilotQuery ? 'subjectDescription' : 'courseReferenceNumber', sortDirection: 'asc'
            });
            if (!usePilotQuery) {
                query.set('uniqueSessionId', searchId);
                query.set('startDatepicker', '');
                query.set('endDatepicker', '');
            }
            const step = `Loading ${code} sections starting at row ${offset + 1}`;
            enrollmentStatus.textContent = `${progress} · row ${offset + 1}…`;
            const path = `/ssb/searchResults/searchResults?${query}`;
            let body;
            try {
                body = await bannerRequest(path, { step });
            } catch (error) {
                if (error.name !== 'TimeoutError') throw error;
                enrollmentStatus.textContent = `${step} timed out. Retrying once…`;
                body = await bannerRequest(path, { step });
            }
            const result = JSON.parse(body);
            // Banner can reuse a previous search's criteria within the same browser session.
            const otherCourse = Array.isArray(result.data) &&
                result.data.find(row => row.subject !== subject || catalogCode(row.subjectCourse) !== code);
            if (otherCourse && offset === 0 && !resetSearch && !usePilotQuery) {
                await bannerRequest('/ssb/classSearch/resetDataForm', {
                    form: { uniqueSessionId: searchId }, step: `Resetting the Banner search for ${code}`
                });
                resetSearch = true;
                searchId = newBannerSearchId();
                continue;
            }
            if (otherCourse) {
                throw new Error(`Banner returned ${otherCourse.subjectCourse || 'an unknown course'} while searching for ${code}.`);
            }
            // Confirm an empty result using the original targeted lookup without a search ID.
            const empty = result.data === null || (Array.isArray(result.data) && !result.data.length);
            if (offset === 0 && !usePilotQuery && result.success === true && result.totalCount === 0 && empty) {
                enrollmentStatus.textContent = `Double-checking Banner’s empty result for ${code}…`;
                await bannerRequest('/ssb/classSearch/resetDataForm', {
                    form: {}, step: `Clearing the Banner search before rechecking ${code}`
                });
                usePilotQuery = true;
                continue;
            }
            total ??= result.totalCount;
            const rows = result.data === null && result.totalCount === 0 ? [] : result.data;
            if (result.success !== true || !Number.isSafeInteger(total) || total < 0 ||
                result.totalCount !== total || !Array.isArray(rows) ||
                offset + rows.length > total || (!rows.length && offset < total)) {
                throw new Error(`Banner did not return a complete class search for ${code}.`);
            }
            for (const row of rows) {
                const { courseReferenceNumber: crn } = row;
                if (row.term !== term || !/^\d+$/.test(crn) || seen.has(crn)) {
                    throw new Error('Banner returned an invalid or duplicate CRN.');
                }
                seen.add(crn);
                yield row;
            }
            offset += rows.length;
        } while (total === undefined || offset < total);
    }

    function newBannerSearchId() {
        return `${10000 + crypto.getRandomValues(new Uint32Array(1))[0] % 90000}${Date.now()}`;
    }

    function bannerRequest(path, { form, step }) {
        return new Promise((resolve, reject) => {
            GM_xmlhttpRequest({
                method: form ? 'POST' : 'GET',
                url: bannerBase + path,
                headers: form ? { 'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8' } : {},
                data: form ? new URLSearchParams(form).toString() : undefined,
                timeout: 25000,
                onload(response) {
                    if (response.status >= 200 && response.status < 300) resolve(response.responseText);
                    else reject(new Error(`${step} failed (HTTP ${response.status}).`));
                },
                onerror: () => reject(new Error('Check the Banner connection and Tampermonkey permissions.')),
                ontimeout() {
                    const error = new Error(`${step} timed out after 25 seconds.`);
                    error.name = 'TimeoutError';
                    reject(error);
                }
            });
        });
    }

    function catalogCode(name) {
        return clean(name).toUpperCase().match(/^([A-Z]+)\s*(\d{4})/)?.slice(1).join('') ?? '';
    }

    function currentCourseCodes() {
        return [...new Set(courses.filter(course => !isInactiveCourse(course))
            .map(course => catalogCode(course.name)).filter(Boolean))];
    }

    function renderSectionColumn(cell, sections, describe, addControl) {
        if (!sections.length) {
            cell.textContent = '—';
            return;
        }
        const list = document.createElement('ul');
        for (const section of sections) {
            const item = document.createElement('li');
            item.textContent = `${section.crn} · ${describe(section)}`;
            addControl?.(item, section);
            list.append(item);
        }
        cell.append(list);
    }

    function loadInactiveCourses() {
        try {
            const saved = JSON.parse(localStorage.getItem(categoryStorageKey) ?? '[]');
            return new Set(Array.isArray(saved) ? saved.filter(key => typeof key === 'string') : []);
        } catch {
            return new Set();
        }
    }

    function addCourseCategory(cell, course) {
        const key = courseCategoryKey(course);
        cell.textContent = course.name;
        const label = document.createElement('label');
        label.className = 'tm-allotment-category-toggle';
        const checkbox = document.createElement('input');
        checkbox.type = 'checkbox';
        checkbox.checked = inactiveCourseKeys.has(key);
        checkbox.disabled = enrollmentLoading;
        checkbox.setAttribute('aria-label', `${course.name}: Not currently taught by SCI`);
        label.append(checkbox, 'Not currently taught by SCI');
        cell.append(label);
        checkbox.addEventListener('change', () => {
            const next = loadInactiveCourses();
            if (checkbox.checked) next.add(key);
            else next.delete(key);
            if (!saveInactiveCourses(next)) {
                checkbox.checked = inactiveCourseKeys.has(key);
                return;
            }
            renderCourses();
            tabs[showInactive ? 1 : 0].focus();
        });
    }

    function courseCategoryKey(course) {
        return clean(course.name).toLowerCase();
    }

    function isInactiveCourse(course) {
        return inactiveCourseKeys.has(courseCategoryKey(course));
    }

    function saveInactiveCourses(next) {
        try {
            localStorage.setItem(categoryStorageKey, JSON.stringify([...next]));
        } catch {
            categoryStatus.hidden = false;
            categoryStatus.textContent = 'This browser could not save the course category.';
            return false;
        }
        inactiveCourseKeys = next;
        categoryStatus.hidden = true;
        return true;
    }

    function markZeroAllotments() {
        const next = loadInactiveCourses();
        const before = next.size;
        for (const course of courses) {
            if (course.capacity === 0) next.add(courseCategoryKey(course));
        }
        if (!saveInactiveCourses(next)) return;
        renderCourses();
        const moved = next.size - before;
        categoryStatus.textContent = `Moved ${moved} zero-allotment ${moved === 1 ? 'course' : 'courses'} to Not currently taught by SCI.`;
        categoryStatus.hidden = false;
    }

    function loadSectionMappings() {
        try {
            const entries = JSON.parse(localStorage.getItem(mappingStorageKey) ?? '[]');
            return new Map(Array.isArray(entries) ? entries.filter(entry => Array.isArray(entry) &&
                typeof entry[0] === 'string' && typeof entry[1] === 'string') : []);
        } catch {
            return new Map();
        }
    }

    function sectionPattern(section) {
        const sequence = normalize(section.code);
        const campus = normalize(section.campus).replace(/\s*\*+$/, '');
        if (!sequence || !campus || campus === 'campus unspecified') return '';
        return JSON.stringify(['future', normalize(section.catalog).replace(/\s/g, ''), campus, sequence]);
    }

    function getSectionGroup(code) {
        const sections = bannerSections.get(code) ?? [];
        const targets = new Map(courses.filter(course => catalogCode(course.name) === code)
            .map(course => [courseCategoryKey(course), course]));
        const patterns = new Map();
        for (const section of sections) {
            const pattern = sectionPattern(section);
            patterns.set(pattern, (patterns.get(pattern) ?? 0) + 1);
        }
        const semester = semesterSelect.selectedOptions[0]?.textContent;
        return { code, sections, targets, patterns, semester };
    }

    function mappingKeys(group, section) {
        const pattern = sectionPattern(section);
        return {
            term: JSON.stringify(['term', group.semester, group.code, section.crn]),
            future: pattern && group.patterns.get(pattern) === 1 ? pattern : ''
        };
    }

    function allotmentUseKeys(group, section) {
        const keys = mappingKeys(group, section);
        const roster = [...new Set(section.instructors.map(normalize).filter(Boolean))].sort();
        return {
            term: JSON.stringify(['allotment-use', keys.term, roster]),
            future: keys.future && roster.length ? JSON.stringify(['allotment-use', keys.future, roster]) : ''
        };
    }

    function usesSectionForAllotment(group, section) {
        const keys = allotmentUseKeys(group, section);
        return (sectionMappings.get(keys.term) ?? sectionMappings.get(keys.future)) !== 'omit';
    }

    function addAllotmentUseControl(item, group, section) {
        const label = document.createElement('label');
        label.className = 'tm-allotment-category-toggle';
        const checkbox = document.createElement('input');
        checkbox.type = 'checkbox';
        checkbox.checked = usesSectionForAllotment(group, section);
        checkbox.dataset.allotmentCrn = section.crn;
        checkbox.setAttribute('aria-label', `Use CRN ${section.crn} for allotment`);
        const feedback = document.createElement('small');
        feedback.setAttribute('role', 'status');
        feedback.hidden = true;
        label.append(checkbox, 'Use for allotment');
        item.append(label, feedback);
        checkbox.addEventListener('change', () => {
            const next = loadSectionMappings();
            saveSectionSetting(next, allotmentUseKeys(group, section), checkbox.checked ? '' : 'omit');
            try {
                persistSectionSettings(next);
            } catch {
                checkbox.checked = usesSectionForAllotment(group, section);
                feedback.textContent = 'This browser could not save the allotment setting.';
                feedback.hidden = false;
                return;
            }
            renderCourses();
            tbody.querySelector(`[data-allotment-crn="${section.crn}"]`)?.focus({ preventScroll: true });
        });
    }

    function isAtlantaSection(section) {
        return /^(?:georgia tech[- ]+)?atlanta\s*\**$/i.test(clean(section.campus));
    }

    function savedSectionChoice(group, section) {
        const keys = mappingKeys(group, section);
        const choice = sectionMappings.get(keys.term) ?? sectionMappings.get(keys.future);
        return choice === excludedSection || choice === unmappedSection ||
            (isAtlantaSection(section) && group.targets.has(choice)) ? choice : '';
    }

    function automaticSectionChoice(group, section) {
        if (!isAtlantaSection(section)) {
            return normalize(section.campus) === 'campus unspecified' ? '' : excludedSection;
        }
        if (section.needsReview) return '';
        const sequence = clean(section.code).toUpperCase();
        const online = sequence === 'O1' || /\bonline\b/i.test(section.method);
        const targets = [...group.targets].filter(([, course]) => !isInactiveCourse(course));
        const regular = [];
        const onlineTargets = [];
        const namedTargets = [];
        for (const [key, course] of targets) {
            const name = course.name.replace(/\s/g, '').toUpperCase();
            const qualifier = course.name.match(/^([A-Z]+\s*\d{4})\s+-\s+([\p{L}][\p{L}'’ ]*)\s*-/iu);
            if (name.startsWith(`${group.code}ONLINE-`) || name.startsWith(`${group.code}-ONLINE-`)) {
                onlineTargets.push(key);
            } else if (qualifier && catalogCode(qualifier[1]) === group.code) {
                namedTargets.push({ key, surname: normalize(qualifier[2]) });
            } else if (name.startsWith(`${group.code}-`)) {
                regular.push(key);
            }
        }
        if (online) return onlineTargets.length === 1 ? onlineTargets[0] : '';
        const instructorNames = section.instructors.map(name => normalize(name.split(',')[0]));
        const namedMatches = namedTargets.filter(target => instructorNames.includes(target.surname));
        if (namedMatches.length === 1) return namedMatches[0].key;
        if (namedMatches.length > 1 || (namedTargets.length && !instructorNames.length)) return '';
        const hasOtherVariants = targets.length !== regular.length + onlineTargets.length + namedTargets.length;
        if (!hasOtherVariants && regular.length === 1 &&
            (group.targets.size === 1 || /^[A-Z]$/.test(sequence))) return regular[0];
        return '';
    }

    function effectiveSectionChoice(group, section) {
        const saved = savedSectionChoice(group, section);
        return saved === unmappedSection ? '' : saved || automaticSectionChoice(group, section);
    }

    function openSectionMapping(code, focus = true) {
        const group = getSectionGroup(code);
        const header = document.createElement('header');
        const heading = document.createElement('h3');
        heading.textContent = `Review ${code} Banner sections`;
        heading.tabIndex = -1;
        const close = document.createElement('button');
        close.type = 'button';
        close.textContent = 'Close mapping';
        close.addEventListener('click', () => {
            mappingPanel.hidden = true;
            [...tbody.querySelectorAll('[data-map-code]')].find(button => button.dataset.mapCode === code)?.focus();
        });
        header.append(heading, close);
        const note = document.createElement('p');
        note.textContent = 'Automatic matches count immediately. Use the checkbox next to each instructor in the course table to change which mapped sections count toward the estimate.';
        const form = document.createElement('form');
        const resolved = document.createElement('details');
        const resolvedHeading = document.createElement('summary');
        resolvedHeading.textContent = 'Automatic and saved decisions';
        resolved.append(resolvedHeading);
        const fields = group.sections.map(section => {
            const label = document.createElement('label');
            const title = document.createElement('span');
            title.textContent = `CRN ${section.crn} · Section ${section.code || 'unspecified'} · ${section.campus} · ${section.enrollment.toLocaleString()} enrolled · ${section.instructors.join(', ') || 'Staff / unassigned'}${section.needsReview ? ' · Linked or cross-listed' : ''}`;
            const select = document.createElement('select');
            const saved = savedSectionChoice(group, section);
            const automatic = automaticSectionChoice(group, section);
            const automaticLabel = automatic === excludedSection
                ? 'We don’t serve this section'
                : group.targets.get(automatic)?.name ?? 'Needs review';
            const options = [['', `Use automatic rule · ${automaticLabel}`],
                [unmappedSection, 'Leave unmapped'], [excludedSection, 'We don’t serve this section']];
            if (isAtlantaSection(section)) {
                for (const [key, course] of group.targets) {
                    options.push([key, course.name + (isInactiveCourse(course) ? ' (not currently taught)' : '')]);
                }
            }
            select.append(...options.map(([value, text]) => new Option(text, value)));
            select.value = saved;
            label.append(title, select);
            (effectiveSectionChoice(group, section) ? resolved : form).append(label);
            return { section, select, saved };
        });
        if (resolved.children.length > 1) {
            resolved.open = form.children.length === 0;
            form.append(resolved);
        }
        const save = document.createElement('button');
        save.type = 'submit';
        save.textContent = 'Save changes';
        const feedback = document.createElement('p');
        feedback.setAttribute('role', 'status');
        form.append(save, feedback);
        form.addEventListener('submit', event => {
            event.preventDefault();
            const next = loadSectionMappings();
            const changed = fields.filter(field => field.select.value !== field.saved);
            if (!changed.length) {
                feedback.textContent = 'No changes to save.';
                return;
            }
            for (const { section, select } of changed) {
                saveSectionSetting(next, mappingKeys(group, section), select.value);
            }
            try {
                persistSectionSettings(next);
            } catch {
                feedback.textContent = 'This browser could not save the section mappings.';
                return;
            }
            renderCourses();
            openSectionMapping(code);
            mappingPanel.querySelector('[role="status"]').textContent = `Saved ${changed.length} section ${changed.length === 1 ? 'change' : 'changes'}.`;
        });
        mappingPanel.replaceChildren(header, note, form);
        mappingPanel.hidden = false;
        if (focus) heading.focus();
    }

    function saveSectionSetting(settings, keys, value) {
        for (const key of [keys.term, keys.future].filter(Boolean)) {
            if (value) settings.set(key, value);
            else settings.delete(key);
        }
    }

    function persistSectionSettings(settings) {
        localStorage.setItem(mappingStorageKey, JSON.stringify([...settings]));
        sectionMappings = settings;
    }

    function enrollmentAllotment(enrollment, utaOnly) {
        const paid = Math.ceil(enrollment / 30);
        const unpaid = utaOnly ? Math.max(0, Math.floor(enrollment / 20) - paid) : 0;
        return { paid, unpaid, total: paid + unpaid };
    }

    function estimateAllotment(course, sections, unresolved, omittedCount) {
        const enrollment = sections.reduce((sum, section) => sum + section.enrollment, 0);
        const linked = sections.some(section => section.needsReview);
        const reviewReason = unresolved ? 'Review unmapped Banner sections first.'
            : linked ? 'Estimate includes linked or cross-listed sections.' : '';
        if (!sections.length && !omittedCount) return { estimates: [], reviewReason };
        const models = [{ label: 'UTA only', utaOnly: true }];
        if (!/^CS\s*2050\s*-/i.test(course.name)) {
            models.push({ label: 'GTA/UTA', utaOnly: false });
        }
        const estimates = models.map(({ label, utaOnly }) => ({ label, ...enrollmentAllotment(enrollment, utaOnly) }));
        return { estimates, reviewReason };
    }

    function renderAllotmentEstimate(cell, course, { estimates, reviewReason }, useEstimate) {
        if (!estimates.length) {
            renderUseEstimate(cell, course, '', 0, reviewReason || 'Waiting for assigned Banner sections.', useEstimate);
            return;
        }
        for (const { label, paid, unpaid, total } of estimates) {
            const estimate = document.createElement('div');
            const heading = document.createElement('strong');
            heading.textContent = `${label}: ${total}`;
            const savedDifference = course.capacity - total;
            const badge = document.createElement('span');
            badge.className = 'tm-allotment-comparison';
            badge.dataset.comparison = savedDifference === 0 ? 'match' : savedDifference > 0 ? 'above' : 'below';
            badge.textContent = savedDifference === 0
                ? 'Saved matches estimate'
                : `Saved ${Math.abs(savedDifference)} ${badge.dataset.comparison} estimate`;
            estimate.append(heading, ` · ${paid} paid, ${unpaid} unpaid`, badge);
            const blocked = reviewReason || (total === 0 ? 'The editor accepts positive allotments.'
                : savedDifference === 0 ? 'This value is already saved.' : '');
            if (savedDifference <= 0) {
                renderUseEstimate(estimate, course, label, total, blocked, useEstimate);
            } else if (reviewReason) {
                const note = document.createElement('small');
                note.textContent = reviewReason;
                estimate.append(note);
            }
            cell.append(estimate);
        }
    }

    function renderUseEstimate(cell, course, label, total, blocked, useEstimate) {
        const button = document.createElement('button');
        button.type = 'button';
        button.className = 'tm-allotment-use-estimate';
        button.textContent = 'Use estimate';
        button.disabled = Boolean(blocked) || allotmentSaving;
        button.setAttribute('aria-label', `Use ${label ? label + ' ' : ''}estimate for ${course.name}`);
        button.addEventListener('click', () => useEstimate(total));
        cell.append(button);
        if (blocked) {
            const note = document.createElement('small');
            note.textContent = blocked;
            cell.append(note);
        }
    }

    function filteredAllotmentRows(coursesToShow, filter) {
        const groups = new Map();
        const rows = coursesToShow.map(course => {
            const code = catalogCode(course.name);
            if (!groups.has(code)) groups.set(code, getSectionGroup(code));
            const group = groups.get(code);
            const sections = group.sections.filter(section => effectiveSectionChoice(group, section) === courseCategoryKey(course));
            const countedSections = sections.filter(section => usesSectionForAllotment(group, section));
            const omittedCount = sections.length - countedSections.length;
            const unresolved = group.sections.filter(section => !effectiveSectionChoice(group, section)).length;
            const estimate = estimateAllotment(course, countedSections, unresolved, omittedCount);
            const increase = estimate.reviewReason ? 0
                : Math.max(0, ...estimate.estimates.map(scenario => scenario.total - course.capacity));
            return { course, code, group, sections, countedSections, omittedCount, unresolved, estimate, increase };
        });
        if (filter === 'increase') return rows.filter(row => row.increase > 0).sort((a, b) => b.increase - a.increase);
        if (filter === 'review') return rows.filter(row => row.estimate.reviewReason);
        return rows;
    }

    function renderCourses() {
        const keepEditPosition = allotmentEditor.isConnected || allotmentStatus.isConnected;
        const scrollTop = coursePanel.scrollTop;
        const scrollLeft = coursePanel.scrollLeft;
        const focusedControl = allotmentEditor.contains(document.activeElement) ? document.activeElement : null;
        const query = normalize(search.value).replace(/\s/g, '');
        const category = courses.filter(course => isInactiveCourse(course) === showInactive);
        const matching = category.filter(course => normalize(course.name).replace(/\s/g, '').includes(query));
        const rows = filteredAllotmentRows(matching, courseFilter.value);
        tbody.replaceChildren(...rows.map(({ course, code, group, sections, countedSections, omittedCount, unresolved, estimate }) => {
            const row = document.createElement('tr');
            addCourseCategory(row.insertCell(), course);
            const savedCell = row.insertCell();
            const edit = document.createElement('button');
            edit.type = 'button';
            edit.className = 'tm-allotment-edit-button';
            edit.textContent = 'Edit';
            edit.disabled = allotmentSaving;
            edit.setAttribute('aria-label', `Edit saved allotment for ${course.name}`);
            edit.addEventListener('click', () => editAllotment(course, savedCell));
            savedCell.append(String(course.capacity), edit);
            if (allotmentDraft?.course === course) savedCell.append(allotmentEditor);
            if (allotmentFeedbackCourse === course) savedCell.append(allotmentStatus);
            const estimateCell = row.insertCell();
            estimateCell.className = 'tm-allotment-estimate';
            renderAllotmentEstimate(estimateCell, course, estimate, capacity => editAllotment(course, savedCell, capacity));
            const enrollmentCell = row.insertCell();
            renderSectionColumn(enrollmentCell, sections, section =>
                `${section.enrollment.toLocaleString()} enrolled · ${section.catalog} ${section.code || ''} · ${section.campus}${savedSectionChoice(group, section) ? '' : ' · Automatic'}${section.needsReview ? ' · Linked or cross-listed' : ''}${usesSectionForAllotment(group, section) ? '' : ' · Not used for allotment'}`);
            if (!code) {
                enrollmentCell.textContent = 'Course code needs review';
            } else if (group.sections.length) {
                const summary = document.createElement('strong');
                const total = sections.reduce((sum, section) => sum + section.enrollment, 0);
                summary.textContent = sections.length ? `${total.toLocaleString()} enrolled in mapped sections` : 'No sections mapped to this row';
                if (omittedCount) {
                    const counted = countedSections.reduce((sum, section) => sum + section.enrollment, 0);
                    summary.textContent += ` · ${counted.toLocaleString()} used for allotment`;
                }
                if (!sections.length) enrollmentCell.replaceChildren();
                enrollmentCell.prepend(summary);
                const button = document.createElement('button');
                button.type = 'button';
                button.dataset.mapCode = code;
                button.textContent = unresolved ? `Review sections (${unresolved})` : 'Edit section mappings';
                button.addEventListener('click', () => openSectionMapping(code));
                enrollmentCell.append(button);
            } else {
                const checked = bannerSections.has(code);
                const button = document.createElement('button');
                button.type = 'button';
                button.textContent = checked ? 'Check again' : 'Check enrollment';
                button.setAttribute('aria-label', `Check enrollment for ${course.name}`);
                button.disabled = enrollmentLoading;
                button.addEventListener('click', () => loadEnrollment([code], { recheck: checked }));
                enrollmentCell.replaceChildren();
                if (checked) {
                    const message = document.createElement('div');
                    message.textContent = 'Banner returned no sections';
                    enrollmentCell.append(message);
                }
                enrollmentCell.append(button);
            }
            renderSectionColumn(row.insertCell(), sections, section =>
                section.instructors.join(', ') || 'Staff / unassigned',
                (item, section) => addAllotmentUseControl(item, group, section));
            return row;
        }));
        moveZero.disabled = enrollmentLoading || !courses.some(course => course.capacity === 0 && !isInactiveCourse(course));
        table.hidden = rows.length === 0;
        const emptyMessage = {
            increase: 'No courses match the Needs more TAs filter.',
            review: 'No courses match the Needs review filter.',
            all: 'No courses match your search.'
        }[courseFilter.value];
        status.textContent = rows.length ? `${rows.length} of ${category.length} courses shown`
            : category.length ? emptyMessage : 'No courses in this category.';
        if (!allotmentStatus.hidden && !allotmentDraft && !rows.some(row => row.course === allotmentFeedbackCourse)) {
            status.textContent += ` ${allotmentFeedbackCourse.name} · ${allotmentStatus.textContent}`;
        }
        if (focusedControl?.isConnected) focusedControl.focus({ preventScroll: true });
        if (keepEditPosition) {
            coursePanel.scrollTop = scrollTop;
            coursePanel.scrollLeft = scrollLeft;
        }
    }

    function addStyles() {
        const style = document.createElement('style');
        style.textContent = `
            #tm-ta-allotment {
                width: min(72rem, calc(100vw - 2rem)); max-width: none; max-height: 88vh;
                padding: 0; border: 1px solid var(--tm-border); border-radius: 16px;
                background: var(--tm-surface); color: var(--tm-text); box-shadow: var(--tm-shadow);
            }
            #tm-ta-allotment[open] { display: flex; flex-direction: column; }
            #tm-ta-allotment::backdrop { background: rgb(0 25 48 / .58); }
            #tm-ta-allotment > header {
                display: flex; align-items: center; justify-content: space-between; gap: 1rem;
                padding: 1.1rem 1.25rem; background: var(--tm-navy); color: white;
            }
            #tm-ta-allotment h2 { color: inherit; font-size: 1.4rem; margin: 0 0 .25rem; }
            #tm-ta-allotment header p { margin: 0; color: #e2e8f0; }
            #tm-ta-allotment .tm-allotment-controls {
                display: flex; flex-wrap: wrap; align-items: end; gap: .75rem;
                padding: 1rem 1.25rem 0;
            }
            #tm-ta-allotment label { display: grid; gap: .25rem; margin: 0; font-weight: 600; }
            #tm-ta-allotment input, #tm-ta-allotment select, #tm-ta-allotment button {
                padding: .4rem .65rem; border: 1px solid var(--tm-border); border-radius: 6px;
                background: var(--tm-surface); color: var(--tm-text); font: inherit;
            }
            #tm-ta-allotment [role="status"] { margin: .75rem 1.25rem; color: var(--tm-muted); }
            #tm-ta-allotment .tm-allotment-tabs {
                display: flex; flex-wrap: wrap; gap: .5rem; padding: .75rem 1.25rem;
            }
            #tm-ta-allotment [role="tab"][aria-selected="true"] {
                border-color: var(--tm-navy); background: var(--tm-navy); color: white;
            }
            #tm-ta-allotment .tm-allotment-scroll { overflow: auto; }
            #tm-ta-allotment .tm-allotment-estimate-note { margin: 0 1.25rem .75rem; color: var(--tm-muted); }
            #tm-ta-allotment .tm-allotment-estimate-note p { margin: .4rem 0 0; }
            #tm-ta-allotment .tm-allotment-estimate { min-width: 13rem; }
            #tm-ta-allotment .tm-allotment-estimate div + div { margin-top: .35rem; }
            #tm-ta-allotment .tm-allotment-estimate small { display: block; margin-top: .35rem; color: var(--tm-muted); }
            #tm-ta-allotment .tm-allotment-edit:not([hidden]) {
                display: grid; justify-items: start; gap: .4rem;
                min-width: 9rem; margin-top: .4rem; text-align: left;
            }
            #tm-ta-allotment .tm-allotment-edit div { display: flex; flex-wrap: wrap; gap: .3rem; }
            #tm-ta-allotment .tm-allotment-edit p, #tm-ta-allotment [data-allotment-status] {
                margin: .25rem 0 0; font-size: .82rem; text-align: left;
            }
            #tm-ta-allotment .tm-allotment-edit input { width: 6rem; }
            #tm-ta-allotment .tm-allotment-edit-button { display: block; margin: .25rem 0 0 auto; }
            #tm-ta-allotment .tm-allotment-comparison {
                display: block; width: fit-content; margin-top: .25rem; padding: .15rem .45rem;
                border-radius: .3rem; font-size: .8rem; font-weight: 600;
            }
            #tm-ta-allotment .tm-allotment-use-estimate {
                display: block; margin-top: .3rem; font-size: .85rem;
            }
            #tm-ta-allotment .tm-allotment-use-estimate:disabled { opacity: .55; }
            #tm-ta-allotment [data-comparison="above"] { background: #fff0ce; color: #694100; }
            #tm-ta-allotment [data-comparison="below"] { background: #e5efff; color: #153e77; }
            #tm-ta-allotment [data-comparison="match"] { background: #e3f4e8; color: #155431; }
            #tm-ta-allotment .tm-allotment-mapping {
                margin: 0 1.25rem 1rem; padding: 1rem; border: 1px solid var(--tm-border);
                border-radius: 8px; background: var(--tm-surface-alt);
            }
            #tm-ta-allotment .tm-allotment-mapping header {
                display: flex; flex-wrap: wrap; align-items: center; justify-content: space-between; gap: .5rem;
            }
            #tm-ta-allotment .tm-allotment-mapping h3 { margin: 0; font-size: 1.1rem; }
            #tm-ta-allotment .tm-allotment-mapping form { display: grid; gap: .65rem; }
            #tm-ta-allotment .tm-allotment-mapping details > label { margin-top: .65rem; }
            #tm-ta-allotment .tm-allotment-mapping select { min-width: 0; width: 100%; }
            #tm-ta-allotment .tm-allotment-mapping form > button { justify-self: start; }
            #tm-ta-allotment .tm-allotment-mapping form > p { margin: 0; }
            #tm-ta-allotment td [data-map-code] { display: block; margin-top: .45rem; }
            #tm-ta-allotment table { width: 100%; min-width: 42rem; border-collapse: collapse; }
            #tm-ta-allotment th, #tm-ta-allotment td {
                padding: .55rem 1.25rem; border-top: 1px solid var(--tm-border); vertical-align: top;
            }
            #tm-ta-allotment thead th {
                position: sticky; top: 0;
                background: var(--tm-surface-alt); color: var(--tm-text) !important;
            }
            #tm-ta-allotment .tm-allotment-category-toggle {
                display: flex; align-items: center; gap: .4rem; width: fit-content;
                margin-top: .25rem; color: var(--tm-muted); font-size: .83rem; font-weight: 400;
            }
            #tm-ta-allotment :is(th, td):nth-child(2) { text-align: right; font-variant-numeric: tabular-nums; }
            #tm-ta-allotment td ul { margin: 0; padding: 0; list-style: none; }
            #tm-ta-allotment td li + li { margin-top: .35rem; }
        `;
        document.head.append(style);
    }
})();
