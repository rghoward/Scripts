// ==UserScript==
// @name         Georgia Tech Canvas Grade Change Helper
// @namespace    https://forms.registrar.gatech.edu/
// @version      1.6.1
// @description  Fill the GT grade-change form from Canvas and filter reviewers using the official reviewer table.
// @author       Ronnie Howard
// @match        https://forms.registrar.gatech.edu/secure/gcrf*
// @connect      gatech.instructure.com
// @grant        GM_xmlhttpRequest
// @run-at       document-idle
// ==/UserScript==

(() => {
  'use strict';

  const CANVAS = 'https://gatech.instructure.com';
  const REVIEWER_GUIDE = '/secure/gcrf/table-of-reviewers';
  const form = document.querySelector('form');
  const reviewerSelect = document.querySelector('#reviewers');
  if (!form || !reviewerSelect || document.querySelector('#gch-panel')) return;

  const state = {
    courses: [],
    visibleCourses: [],
    sections: [],
    students: [],
    studentSearchSequence: 0,
    guideRows: [],
    reviewerOptions: [...reviewerSelect.options].map((option) => ({
      option,
      value: option.value.trim().toLowerCase(),
      text: option.textContent.trim(),
    })),
  };

  const css = `
    #gch-panel { margin-bottom: 1rem; border: 2px solid #b3a369; border-radius: .35rem;
      background: #fff; box-shadow: 0 3px 12px rgba(0,0,0,.12); }
    #gch-panel .gch-head { padding: .75rem 1rem; color: #fff; background: #003057;
      font-weight: 700; display: flex; align-items: center; justify-content: space-between; }
    #gch-panel .gch-body { padding: 1rem; }
    #gch-panel .gch-grid { display: grid; grid-template-columns: 1fr 1fr; gap: .8rem; }
    #gch-panel label { display: block; margin: 0 0 .25rem; font-size: .82rem; font-weight: 700; }
    #gch-panel select, #gch-panel input { width: 100%; min-height: 2.25rem; padding: .35rem .5rem;
      border: 1px solid #adb5bd; border-radius: .25rem; background: #fff; }
    #gch-panel button { border: 0; border-radius: .25rem; padding: .45rem .8rem; cursor: pointer;
      color: #fff; background: #b3a369; font-weight: 700; }
    #gch-panel button:disabled { opacity: .55; cursor: wait; }
    #gch-panel .gch-actions { display: flex; flex-wrap: wrap; gap: .5rem; margin-top: .8rem; }
    #gch-status { margin-top: .7rem; padding: .55rem .7rem; border-radius: .25rem;
      background: #f3f4f5; color: #343a40; font-size: .84rem; }
    #gch-status[data-kind="error"] { color: #721c24; background: #f8d7da; }
    #gch-status[data-kind="success"] { color: #155724; background: #d4edda; }
    #gch-reason-choice { margin-bottom: .5rem; }
    #gch-reviewer-compact { margin: .25rem 0 .6rem; padding: .6rem .7rem; border-radius: .3rem; background: #f3f4f5; }
    #gch-reviewer-summary { margin-right: .6rem; font-size: .84rem; }
    #gch-reviewer-toggle { border: 1px solid #6c757d; border-radius: .25rem; padding: .25rem .55rem; background: #fff; cursor: pointer; }
    .gch-wide-form { flex: 0 0 100% !important; max-width: 100% !important; }
    @media (min-width: 1200px) {
      .gch-wide-form form > .card .form-row > .col-xl-6 { flex: 0 0 25%; max-width: 25%; }
    }
    @media (max-width: 700px) { #gch-panel .gch-grid { grid-template-columns: 1fr; } }
  `;
  document.head.append(Object.assign(document.createElement('style'), { textContent: css }));

  const panel = document.createElement('section');
  panel.id = 'gch-panel';
  panel.innerHTML = `
    <div class="gch-head"><span>Fill from Canvas</span><span aria-hidden="true">GT</span></div>
    <div class="gch-body">
      <div class="gch-grid">
        <div><label for="gch-term">Academic term</label><select id="gch-term" disabled><option value="">Loading terms…</option></select></div>
        <div><label for="gch-course">Canvas course</label><select id="gch-course" disabled><option value="">Select a term first</option></select></div>
        <div><label for="gch-student-search">Search student name</label><input id="gch-student-search" type="search" disabled autocomplete="off" placeholder="Select a course first"></div>
        <div><label for="gch-student">Matching student</label><select id="gch-student" disabled><option value="">Type at least 2 characters</option></select></div>
      </div>
      <div class="gch-actions">
        <button type="button" id="gch-roster" disabled>Load full class roster</button>
        <button type="button" id="gch-refresh">Refresh Canvas data</button>
      </div>
      <div id="gch-status" role="status" aria-live="polite">Connecting to Canvas…</div>
    </div>`;
  form.parentElement.insertBefore(panel, form);
  form.closest('.col-lg-6')?.classList.add('gch-wide-form');

  const termSelect = panel.querySelector('#gch-term');
  const courseSelect = panel.querySelector('#gch-course');
  const studentSearch = panel.querySelector('#gch-student-search');
  const studentSelect = panel.querySelector('#gch-student');
  const rosterButton = panel.querySelector('#gch-roster');
  const refreshButton = panel.querySelector('#gch-refresh');
  const status = panel.querySelector('#gch-status');

  const reasonField = document.querySelector('#contentBlob');
  if (reasonField) {
    const reasonChoice = document.createElement('select');
    reasonChoice.id = 'gch-reason-choice';
    reasonChoice.className = 'form-control form-control-sm';
    reasonChoice.setAttribute('aria-label', 'Common grade-change reason');
    reasonChoice.append(
      new Option('Select a common reason', ''),
      new Option('Incomplete work completed by student', 'Student completed the remaining work for an incomplete.'),
      new Option('Instructor submitted an incorrect grade', 'Instructor submitted an incorrect final grade.'),
      new Option('OSI review: Student not responsible', 'OSI review completed: student found not responsible.'),
      new Option('OSI assignment penalty lowered final grade', 'OSI case resolved: assignment penalty lowered the final course grade.'),
      new Option('OSI second/subsequent violation: Course failure', 'OSI case resolved: second or subsequent violation requires failure in the course.'),
      new Option('OSI Faculty Conference Resolution completed', 'OSI Faculty Conference Resolution completed and grade penalty applied.'),
      new Option('OSI appeal completed: Final grade updated', 'OSI appeal completed and final grade updated.'),
      new Option('Other — type a reason', '__other__'),
    );
    reasonField.parentElement.insertBefore(reasonChoice, reasonField);
    reasonChoice.addEventListener('change', () => {
      reasonField.value = reasonChoice.value === '__other__' ? '' : reasonChoice.value;
      reasonField.dispatchEvent(new Event('input', { bubbles: true }));
      if (reasonChoice.value === '__other__') reasonField.focus();
    });
  }

  const originalGradeField = document.querySelector('#newGrade');
  if (originalGradeField && originalGradeField.tagName !== 'SELECT') {
    const gradeSelect = document.createElement('select');
    gradeSelect.id = originalGradeField.id;
    gradeSelect.name = originalGradeField.name;
    gradeSelect.className = originalGradeField.className;
    gradeSelect.required = originalGradeField.required;
    gradeSelect.append(
      new Option('Select a grade', ''),
      ...['A', 'B', 'C', 'D', 'F', 'S', 'U', 'I', 'V', 'W'].map((grade) => new Option(grade, grade)),
    );
    originalGradeField.replaceWith(gradeSelect);
  }

  // Keep the official guidance link, but remove the registrar's long instructions.
  [...form.querySelectorAll('p, label, div.col-12.mb-3')].forEach((element) => {
    const text = element.textContent.replace(/\s+/g, ' ').trim();
    if (text === 'Select Reviewers:' ||
        text.startsWith('The reviewers are selected by the instructor') ||
        text.startsWith('Hold the Ctrl key')) element.hidden = true;
  });

  const reviewerCompact = document.createElement('div');
  reviewerCompact.id = 'gch-reviewer-compact';
  reviewerCompact.innerHTML = `
    <span id="gch-reviewer-summary">Select a course to choose reviewers automatically.</span>
    <button type="button" id="gch-reviewer-toggle">Show full reviewer list</button>`;
  reviewerSelect.parentElement.insertBefore(reviewerCompact, reviewerSelect);
  reviewerSelect.hidden = true;
  const reviewerSummary = reviewerCompact.querySelector('#gch-reviewer-summary');
  const reviewerToggle = reviewerCompact.querySelector('#gch-reviewer-toggle');
  reviewerToggle.addEventListener('click', () => {
    reviewerSelect.hidden = !reviewerSelect.hidden;
    reviewerToggle.textContent = reviewerSelect.hidden ? 'Show full reviewer list' : 'Hide full reviewer list';
  });

  function setStatus(message, kind = '') {
    status.textContent = message;
    status.dataset.kind = kind;
  }

  function canvasRequest(url) {
    return new Promise((resolve, reject) => {
      GM_xmlhttpRequest({
        method: 'GET', url, withCredentials: true,
        headers: { Accept: 'application/json' },
        onload(response) {
          const contentType = response.responseHeaders.match(/content-type:\s*([^\r\n]+)/i)?.[1] || '';
          if (response.status < 200 || response.status >= 300 || !contentType.includes('json')) {
            reject(new Error('Canvas did not return API data. Open Canvas in another tab, sign in, and try Refresh.'));
            return;
          }
          try {
            resolve({ data: JSON.parse(response.responseText), headers: response.responseHeaders });
          } catch {
            reject(new Error('Canvas returned an unreadable response.'));
          }
        },
        onerror: () => reject(new Error('Could not connect to Canvas. Check Tampermonkey site permissions.')),
        ontimeout: () => reject(new Error('Canvas took too long to respond.')),
      });
    });
  }

  function nextLink(headers) {
    const linkHeader = headers.match(/^link:\s*(.+)$/im)?.[1] || '';
    for (const part of linkHeader.split(',')) {
      const match = part.match(/<([^>]+)>;\s*rel="([^"]+)"/);
      if (match?.[2] === 'next') return match[1];
    }
    return '';
  }

  async function canvasPages(path) {
    const records = [];
    let url = path.startsWith('http') ? path : `${CANVAS}${path}`;
    while (url) {
      const response = await canvasRequest(url);
      if (!Array.isArray(response.data)) throw new Error('Canvas returned an unexpected response.');
      records.push(...response.data);
      url = nextLink(response.headers);
    }
    return records;
  }

  function courseLabel(course) {
    return `${course.course_code || course.name} — ${course.name}${course.term?.name ? ` (${course.term.name})` : ''}`;
  }

  function replaceOptions(select, records, label, placeholder) {
    select.replaceChildren(new Option(placeholder, ''));
    records.forEach((record, index) => select.add(new Option(label(record), String(index))));
  }

  function termKey(course) {
    return String(course.term?.id ?? course.term?.name ?? 'other');
  }

  function populateTerms() {
    const terms = new Map();
    state.courses.forEach((course) => {
      const key = termKey(course);
      if (!terms.has(key)) terms.set(key, {
        name: course.term?.name || 'Other courses',
        date: Date.parse(course.term?.start_at || course.start_at || '') || 0,
      });
    });
    const sorted = [...terms].sort((a, b) => b[1].date - a[1].date ||
      b[1].name.localeCompare(a[1].name, undefined, { numeric: true }));
    termSelect.replaceChildren(new Option('Select an academic term', ''));
    sorted.forEach(([key, term]) => termSelect.add(new Option(term.name, key)));
    termSelect.disabled = false;
  }

  function resetStudentSearch(message = 'Type at least 2 characters') {
    state.students = [];
    state.studentSearchSequence += 1;
    studentSearch.value = '';
    studentSelect.replaceChildren(new Option(message, ''));
    studentSelect.disabled = true;
  }

  function showCoursesForTerm(key) {
    state.visibleCourses = state.courses.filter((course) => termKey(course) === key);
    replaceOptions(courseSelect, state.visibleCourses, courseLabel, 'Select a course');
    courseSelect.disabled = !key;
    studentSearch.disabled = true;
    rosterButton.disabled = true;
    studentSearch.placeholder = 'Select a course first';
    resetStudentSearch();
    setStatus(`${state.visibleCourses.length} course${state.visibleCourses.length === 1 ? '' : 's'} available in the selected term.`);
  }

  async function loadCourses() {
    refreshButton.disabled = true;
    termSelect.disabled = true;
    courseSelect.disabled = true;
    setStatus('Loading courses you teach from Canvas…');
    try {
      const query = '/api/v1/courses?enrollment_type=teacher&state[]=available&state[]=completed' +
        '&include[]=term&include[]=sections&include[]=total_students&per_page=100';
      state.courses = (await canvasPages(query))
        .filter((course) => !course.access_restricted_by_date)
        .sort((a, b) => courseLabel(a).localeCompare(courseLabel(b), undefined, { numeric: true }));
      populateTerms();
      courseSelect.replaceChildren(new Option('Select a term first', ''));
      courseSelect.disabled = true;
      studentSearch.disabled = true;
      rosterButton.disabled = true;
      resetStudentSearch();
      setStatus(`Loaded ${state.courses.length} courses across the available terms. Select a term first.`, 'success');
    } catch (error) {
      courseSelect.replaceChildren(new Option('Canvas connection unavailable', ''));
      setStatus(error.message, 'error');
    } finally {
      refreshButton.disabled = false;
    }
  }

  async function prepareCourse(course) {
    studentSelect.disabled = true;
    studentSearch.disabled = true;
    resetStudentSearch('Preparing course…');
    setStatus(`Preparing ${course.course_code || course.name}…`);
    try {
      const base = `/api/v1/courses/${encodeURIComponent(course.id)}`;
      const [sections] = await Promise.all([
        canvasPages(`${base}/sections?include[]=total_students&per_page=100`),
        loadReviewerGuide(),
      ]);
      state.sections = sections;
      studentSearch.disabled = false;
      rosterButton.disabled = false;
      studentSearch.placeholder = 'Type at least 2 characters';
      studentSearch.focus();
      resetStudentSearch();
      filterReviewers(courseSubject(course));
      setStatus('Course ready. Type at least two characters of the student’s first or last name.', 'success');
    } catch (error) {
      studentSearch.disabled = true;
      rosterButton.disabled = true;
      studentSelect.replaceChildren(new Option('Unable to prepare course', ''));
      setStatus(error.message, 'error');
    }
  }

  async function searchStudents() {
    const query = studentSearch.value.trim();
    const course = state.visibleCourses[Number(courseSelect.value)];
    if (!course || query.length < 2) {
      state.students = [];
      studentSelect.replaceChildren(new Option('Type at least 2 characters', ''));
      studentSelect.disabled = true;
      return;
    }

    const sequence = ++state.studentSearchSequence;
    studentSelect.replaceChildren(new Option('Searching Canvas…', ''));
    studentSelect.disabled = true;
    try {
      const base = `/api/v1/courses/${encodeURIComponent(course.id)}`;
      const path = `${base}/users?enrollment_type[]=student&include[]=enrollments&search_term=${encodeURIComponent(query)}&per_page=50`;
      const students = await canvasPages(path);
      if (sequence !== state.studentSearchSequence) return;
      state.students = students.sort((a, b) => (a.sortable_name || a.name).localeCompare(b.sortable_name || b.name));
      replaceOptions(studentSelect, state.students, (student) => student.sortable_name || student.name,
        state.students.length ? 'Select the matching student' : 'No matching students');
      studentSelect.disabled = !state.students.length;
      setStatus(state.students.length
        ? `Found ${state.students.length} matching student${state.students.length === 1 ? '' : 's'}. Select the correct student.`
        : `No students matched “${query}” in this course.`, state.students.length ? 'success' : 'error');
    } catch (error) {
      if (sequence !== state.studentSearchSequence) return;
      studentSelect.replaceChildren(new Option('Student search failed', ''));
      setStatus(error.message, 'error');
    }
  }

  async function loadFullRoster() {
    const course = state.visibleCourses[Number(courseSelect.value)];
    if (!course) return;
    const sequence = ++state.studentSearchSequence;
    rosterButton.disabled = true;
    studentSearch.value = '';
    studentSelect.replaceChildren(new Option('Loading full roster…', ''));
    studentSelect.disabled = true;
    setStatus(`Loading the full roster for ${course.course_code || course.name}…`);
    try {
      const base = `/api/v1/courses/${encodeURIComponent(course.id)}`;
      const students = await canvasPages(`${base}/users?enrollment_type[]=student&include[]=enrollments&per_page=100`);
      if (sequence !== state.studentSearchSequence) return;
      state.students = students.sort((a, b) => (a.sortable_name || a.name).localeCompare(b.sortable_name || b.name));
      replaceOptions(studentSelect, state.students, (student) => student.sortable_name || student.name,
        state.students.length ? 'Select any student from the roster' : 'No students found');
      studentSelect.disabled = !state.students.length;
      setStatus(`Loaded ${state.students.length} student${state.students.length === 1 ? '' : 's'}. Select one from the roster.`, 'success');
    } catch (error) {
      if (sequence !== state.studentSearchSequence) return;
      studentSelect.replaceChildren(new Option('Roster loading failed', ''));
      setStatus(error.message, 'error');
    } finally {
      rosterButton.disabled = false;
    }
  }

  async function loadReviewerGuide() {
    if (state.guideRows.length) return;
    try {
      const response = await fetch(REVIEWER_GUIDE, { credentials: 'include' });
      if (!response.ok) throw new Error();
      const doc = new DOMParser().parseFromString(await response.text(), 'text/html');
      state.guideRows = [...doc.querySelectorAll('tr')].map((row) => ({
        text: row.textContent.replace(/\s+/g, ' ').trim(),
        cells: [...row.querySelectorAll('th,td')].map((cell) => cell.textContent.replace(/\s+/g, ' ').trim()),
      })).filter((row) => row.text);
      if (!state.guideRows.length) throw new Error();
    } catch {
      state.guideRows = [];
    }
  }

  function courseSubject(course) {
    const sources = [course.course_code, course.sis_course_id, course.name].filter(Boolean).join(' ');
    return sources.match(/\b[A-Z]{2,5}(?=\s*[- ]?\d{3,4}\b)/i)?.[0]?.toUpperCase() ||
      sources.match(/\b[A-Z]{2,5}\b/)?.[0]?.toUpperCase() || '';
  }

  function reviewersForSubject(subject) {
    if (!subject) return new Set();
    const subjectPattern = new RegExp(`(^|[^A-Z0-9])${subject.replace(/[.*+?^${}()|[\]\\]/g, '\\$&')}([^A-Z0-9]|$)`, 'i');
    const relevantText = state.guideRows.filter((row) => subjectPattern.test(row.text)).map((row) => row.text.toLowerCase()).join(' ');
    const normalizedRelevant = relevantText.normalize('NFKD').replace(/[\u0300-\u036f]/g, '')
      .replace(/[^a-z0-9@.]+/g, ' ').replace(/\s+/g, ' ').trim();
    const matches = new Set();
    state.reviewerOptions.forEach(({ value, text }) => {
      const email = text.match(/[\w.+-]+@[\w.-]+/i)?.[0]?.toLowerCase();
      const displayName = text.split('(')[0].normalize('NFKD').replace(/[\u0300-\u036f]/g, '')
        .toLowerCase().replace(/[^a-z0-9]+/g, ' ').trim();
      const nameWords = displayName.split(' ').filter((word) => word.length > 1);
      if ((value && relevantText.includes(value)) || (email && relevantText.includes(email)) ||
          (nameWords.length >= 2 && nameWords.every((word) => normalizedRelevant.includes(word)))) matches.add(value);
    });

    // The official table may group these under “College of Computing” rather
    // than repeating every course prefix. Use its departmental addresses as a fallback.
    if (!matches.size && ['CS', 'CX', 'CSE'].includes(subject)) {
      state.reviewerOptions.forEach(({ value, text }) => {
        if (value && /@cc\.gatech\.edu\b/i.test(text)) matches.add(value);
      });
    }
    return matches;
  }

  function selectRecommendedReviewers(matches) {
    const choices = [...matches].slice(0, 4);
    state.reviewerOptions.forEach(({ option, value }) => {
      option.selected = choices.includes(value);
    });
    reviewerSelect.dispatchEvent(new Event('change', { bubbles: true }));
    const selectedNames = state.reviewerOptions
      .filter(({ option }) => option.selected)
      .map(({ text }) => text.split('(')[0].trim());
    reviewerSummary.textContent = selectedNames.length
      ? `Selected reviewer${selectedNames.length === 1 ? '' : 's'}: ${selectedNames.join('; ')}`
      : 'No automatic reviewer match was found. Open the full list or use “Whom shall I select?”';
  }

  function filterReviewers(subject) {
    const matches = reviewersForSubject(subject);
    reviewerSelect.dataset.gchSubject = subject;
    selectRecommendedReviewers(matches);
  }

  function setField(id, value) {
    const input = document.getElementById(id);
    if (!input) return false;
    input.value = value == null ? '' : String(value).trim();
    input.dispatchEvent(new Event('input', { bubbles: true }));
    input.dispatchEvent(new Event('change', { bubbles: true }));
    return true;
  }

  function splitName(student) {
    if (student.sortable_name?.includes(',')) {
      const [last, ...first] = student.sortable_name.split(',');
      return { first: first.join(',').trim().split(/\s+/)[0], last: last.trim() };
    }
    const parts = (student.name || '').trim().split(/\s+/);
    return { first: parts[0] || '', last: parts.at(-1) || '' };
  }

  function selectedSection(student, course) {
    const enrollments = student.enrollments || [];
    const enrollment = enrollments.find((item) => String(item.course_id) === String(course.id)) || enrollments[0];
    return state.sections.find((section) => String(section.id) === String(enrollment?.course_section_id)) ||
      (course.sections || []).find((section) => String(section.id) === String(enrollment?.course_section_id)) ||
      state.sections[0] || course.sections?.[0] || {};
  }

  function extractCrn(course, section) {
    // GT Canvas section labels end in the five-digit CRN. Prefer the visible
    // section name because SIS IDs can contain other unrelated five-digit values.
    const sources = [section.name, section.sis_section_id, course.sis_course_id].filter(Boolean);
    for (const source of sources) {
      const trailing = String(source).trim().match(/(?:^|\D)(\d{5})\s*$/);
      if (trailing) return trailing[1];
    }
    return '';
  }

  function sectionCode(section) {
    const source = section.name || section.sis_section_id || '';
    const withoutCrn = String(source).trim().replace(/(?:\s|[-_])*(?:CRN\s*[:#-]?\s*)?\d{5}\s*$/i, '').trim();
    const labeled = withoutCrn.match(/(?:section|sec)\s*[:#-]?\s*([A-Z0-9-]+)/i)?.[1];
    if (labeled) return labeled;

    // In labels such as “MATH 1554 A 12345”, the final token before the CRN is A.
    const tokens = withoutCrn.split(/[\s_-]+/).filter(Boolean);
    return tokens.at(-1) || withoutCrn;
  }

  function fillForm() {
    const course = state.visibleCourses[Number(courseSelect.value)];
    const student = state.students[Number(studentSelect.value)];
    if (!course || !student) return;
    const section = selectedSection(student, course);
    const name = splitName(student);
    const subject = courseSubject(course);
    const courseNumber = [course.course_code, course.sis_course_id, course.name]
      .filter(Boolean).join(' ').match(new RegExp(`${subject}\\s*[- ]?(\\d{3,4})`, 'i'))?.[1] || '';
    const gtid = /^\d{9}$/.test(String(student.sis_user_id || '').trim()) ? student.sis_user_id : '';

    setField('academicTerm', course.term?.name);
    setField('studentFirstName', name.first);
    setField('studentLastName', name.last);
    setField('gtid', gtid);
    setField('crn', extractCrn(course, section));
    setField('course', subject && courseNumber ? `${subject} ${courseNumber}` : course.course_code);
    setField('section', sectionCode(section));
    setField('courseTitle', course.name);

    const missing = [
      ['GTID', document.querySelector('#gtid')?.value], ['CRN', document.querySelector('#crn')?.value],
      ['section', document.querySelector('#section')?.value],
    ].filter(([, value]) => !value).map(([label]) => label);
    setStatus(`Form filled from Canvas.${missing.length ? ` Canvas did not expose ${missing.join(', ')}; enter ${missing.length === 1 ? 'it' : 'them'} manually.` : ''} New grade was left unchanged.`, 'success');
  }

  termSelect.addEventListener('change', () => showCoursesForTerm(termSelect.value));
  courseSelect.addEventListener('change', () => {
    const course = state.visibleCourses[Number(courseSelect.value)];
    if (courseSelect.value === '' || !course) return;
    prepareCourse(course);
  });
  let studentSearchTimer;
  studentSearch.addEventListener('input', () => {
    clearTimeout(studentSearchTimer);
    studentSearchTimer = setTimeout(searchStudents, 350);
  });
  studentSelect.addEventListener('change', () => {
    if (studentSelect.value !== '') fillForm();
  });
  rosterButton.addEventListener('click', loadFullRoster);
  refreshButton.addEventListener('click', loadCourses);

  loadCourses();
})();
