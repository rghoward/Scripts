// ==UserScript==
// @name         Canvas TSV Score Uploader
// @namespace    https://gatech.instructure.com/
// @version      1.9.0
// @description  Safely preview and upload a TSV/CSV score column to one Canvas assignment.
// @match        https://gatech.instructure.com/courses/*
// @match        https://gatech.instructure.com/courses*
// @run-at       document-idle
// @grant        none
// ==/UserScript==

(() => {
  'use strict';

  const courseId = location.pathname.match(/^\/courses\/(\d+)/)?.[1];
  if (!courseId || document.querySelector('#ctsu-launch')) return;

  const escapeHtml = value => String(value ?? '').replace(/[&<>"']/g, char => ({'&':'&amp;','<':'&lt;','>':'&gt;','"':'&quot;',"'":'&#39;'}[char]));
  const normalize = value => String(value ?? '').trim().toLowerCase();
  const message = (text, type = '') => { const box = document.querySelector('#ctsu-message'); box.textContent = text; box.className = type; };
  const state = { assignments: [], users: [], rows: [], preview: [], busy: false };

  const style = document.createElement('style');
  style.textContent = `
    #ctsu-launch{position:relative!important;z-index:1;display:inline-block!important;margin:0 8px 0 0!important;padding:7px 11px;border:1px solid #176b9f;border-radius:6px;background:#fff;color:#125a87;font:600 14px system-ui;cursor:pointer;white-space:nowrap;box-shadow:0 1px 4px rgba(0,0,0,.16)}#ctsu-launch:hover{background:#edf7fc}
    #ctsu-backdrop{position:fixed;inset:0;z-index:2147483646;background:rgba(20,32,43,.48);display:flex;justify-content:center;padding:5vh 18px;overflow:auto}
    #ctsu-panel{width:min(960px,100%);height:max-content;background:#fff;border-radius:10px;box-shadow:0 14px 45px rgba(0,0,0,.35);font:14px/1.4 system-ui,-apple-system,BlinkMacSystemFont,"Segoe UI",sans-serif;color:#253746}
    #ctsu-panel header{display:flex;justify-content:space-between;gap:20px;padding:20px 24px;border-bottom:1px solid #d9e1e6}#ctsu-panel h2{margin:0;font-size:22px}#ctsu-panel header p{margin:4px 0 0;color:#607482}
    #ctsu-panel main{padding:20px 24px 26px}.ctsu-grid{display:grid;grid-template-columns:repeat(3,minmax(0,1fr));gap:14px;margin:14px 0}.ctsu-field{display:grid;gap:5px;font-weight:650}.ctsu-field select,.ctsu-field input,.ctsu-field textarea{box-sizing:border-box;width:100%;padding:8px;border:1px solid #9eafb9;border-radius:5px;background:#fff;font:inherit}.ctsu-field textarea{min-height:150px;resize:vertical;font-family:ui-monospace,SFMono-Regular,Menlo,monospace;font-size:12px}
    .ctsu-actions{display:flex;flex-wrap:wrap;gap:9px;align-items:center;margin-top:14px}.ctsu-btn{padding:8px 12px;border:1px solid #8da0ad;border-radius:6px;background:#fff;color:#263946;font:650 14px system-ui;cursor:pointer}.ctsu-primary{border-color:#176b9f;background:#176b9f;color:#fff}.ctsu-danger{border-color:#a62a23;background:#a62a23;color:#fff}.ctsu-btn:disabled{opacity:.55;cursor:not-allowed}#ctsu-message{min-height:20px;margin:14px 0 0;font-weight:650}#ctsu-message.ok{color:#16743b}#ctsu-message.bad{color:#a62a23}.ctsu-note{color:#607482;font-size:12px}.ctsu-summary{display:flex;gap:18px;flex-wrap:wrap;margin-top:16px;font-weight:650}.ctsu-summary .ok{color:#16743b}.ctsu-summary .bad{color:#a62a23}.ctsu-preview{max-height:300px;overflow:auto;margin-top:14px;border:1px solid #d9e1e6;border-radius:6px}.ctsu-preview table{width:100%;border-collapse:collapse;font-size:12px}.ctsu-preview th,.ctsu-preview td{padding:8px;text-align:left;border-bottom:1px solid #e6ecef}.ctsu-preview th{position:sticky;top:0;background:#f3f7f9}.ctsu-skip{color:#a62a23}.ctsu-ready{color:#16743b}
  `;
  document.head.append(style);

  const launch = document.createElement('button');
  launch.id = 'ctsu-launch'; launch.type = 'button'; launch.textContent = 'Upload scores'; launch.title = 'Upload a TSV/CSV score column to Canvas';
  function mountLaunch() {
    const actions = document.querySelector('.ic-app-nav-toggle-and-crumbs .right-of-crumbs');
    if (actions && launch.parentElement !== actions) actions.prepend(launch);
  }
  mountLaunch();
  new MutationObserver(mountLaunch).observe(document.documentElement, { childList: true, subtree: true });

  function parseDelimited(text) {
    const delimiter = text.includes('\t') ? '\t' : ',';
    const rows = []; let row = [], cell = '', quoted = false;
    for (let index = 0; index < text.length; index++) {
      const char = text[index], next = text[index + 1];
      if (char === '"' && quoted && next === '"') { cell += '"'; index++; }
      else if (char === '"') quoted = !quoted;
      else if (char === delimiter && !quoted) { row.push(cell); cell = ''; }
      else if ((char === '\n' || char === '\r') && !quoted) { if (char === '\r' && next === '\n') index++; row.push(cell); if (row.some(value => value !== '')) rows.push(row); row = []; cell = ''; }
      else cell += char;
    }
    if (cell || row.length) { row.push(cell); rows.push(row); }
    return rows;
  }
  function parseFile() {
    const matrix = parseDelimited(document.querySelector('#ctsu-data').value.trim());
    if (matrix.length < 2) throw new Error('Paste or upload a TSV/CSV file with a header row and at least one student row.');
    const headers = matrix.shift().map(value => value.trim());
    if (!headers.every(Boolean) || new Set(headers.map(normalize)).size !== headers.length) throw new Error('Headers must be non-empty and unique.');
    state.rows = matrix.map((row, index) => Object.fromEntries(headers.map((header, column) => [header, String(row[column] ?? '').trim()])))
      .filter(row => Object.values(row).some(Boolean));
    ['#ctsu-id-column', '#ctsu-score-column'].forEach(selector => {
      const select = document.querySelector(selector), preferred = selector.includes('id') ? 'gtid' : 'extra_credit_percent';
      select.replaceChildren(...headers.map(header => new Option(header, header)));
      if (headers.some(header => normalize(header) === preferred)) select.value = headers.find(header => normalize(header) === preferred);
    });
    message(`Loaded ${state.rows.length} rows. Choose the target assignment and preview the upload.`, 'ok');
  }
  async function request(path) {
    const response = await fetch(path, { credentials: 'same-origin', headers: { Accept: 'application/json' } });
    if (!response.ok) throw new Error(`Canvas request failed (${response.status}).`);
    return { data: await response.json(), headers: response.headers };
  }
  async function pages(path) {
    const values = []; let url = path;
    while (url) {
      const { data, headers } = await request(url);
      if (!Array.isArray(data)) throw new Error('Canvas returned an unexpected roster or assignment response.');
      values.push(...data);
      const link = headers.get('link') || '', next = link.split(',').map(part => part.match(/<([^>]+)>;\s*rel="next"/)).find(Boolean);
      url = next?.[1] || '';
    }
    return values;
  }
  function userKeys(user) {
    const enrollmentKeys = (user.enrollments || []).flatMap(enrollment => [enrollment.sis_user_id, enrollment.integration_id, enrollment.user?.sis_user_id, enrollment.user?.integration_id]);
    return [user.sis_user_id, user.integration_id, user.login_id, user.email, user.id, ...enrollmentKeys].filter(value => value != null && String(value).trim() !== '').map(normalize);
  }
  async function loadCanvasData() {
    message('Loading Canvas assignments and student roster…');
    const [assignments, users] = await Promise.all([
      pages(`/api/v1/courses/${courseId}/assignments?per_page=100`),
      pages(`/api/v1/courses/${courseId}/users?enrollment_type[]=student&include[]=enrollments&per_page=100`)
    ]);
    state.assignments = assignments.filter(assignment => assignment.name);
    state.users = users;
    const select = document.querySelector('#ctsu-assignment');
    select.replaceChildren(new Option('Choose a Canvas assignment…', ''), ...state.assignments.sort((a, b) => a.name.localeCompare(b.name)).map(assignment => new Option(`${assignment.name} (Canvas #${assignment.id})`, assignment.id)));
    message(`Loaded ${state.assignments.length} assignments and ${state.users.length} Canvas students.`, 'ok');
  }
  function preview() {
    if (!state.rows.length) throw new Error('Load the file first.');
    const assignmentId = document.querySelector('#ctsu-assignment').value;
    if (!assignmentId) throw new Error('Choose the Canvas assignment that will receive these scores.');
    const idColumn = document.querySelector('#ctsu-id-column').value, scoreColumn = document.querySelector('#ctsu-score-column').value;
    const index = new Map();
    state.users.forEach(user => new Set(userKeys(user)).forEach(key => { const existing = index.get(key) || []; if (!existing.some(candidate => String(candidate.id) === String(user.id))) existing.push(user); index.set(key, existing); }));
    state.preview = state.rows.map((row, rowIndex) => {
      const sourceId = row[idColumn], scoreText = row[scoreColumn];
      const matches = index.get(normalize(sourceId)) || [], score = Number(scoreText);
      if (!sourceId) return { rowIndex, row, sourceId, scoreText, status: 'Skipped — missing ID' };
      if (!Number.isFinite(score)) return { rowIndex, row, sourceId, scoreText, status: 'Skipped — score is not numeric' };
      if (matches.length !== 1) return { rowIndex, row, sourceId, scoreText, status: matches.length ? 'Skipped — ambiguous Canvas ID' : 'Skipped — no Canvas student match' };
      return { rowIndex, row, sourceId, scoreText, score, user: matches[0], status: 'Ready' };
    });
    renderPreview();
  }
  function renderPreview() {
    const ready = state.preview.filter(item => item.user), skipped = state.preview.filter(item => !item.user);
    const host = document.querySelector('#ctsu-preview');
    host.innerHTML = `<div class="ctsu-summary"><span class="ok">${ready.length} ready to upload</span><span class="bad">${skipped.length} skipped</span><span>${state.preview.length} source rows</span></div><div class="ctsu-preview"><table><thead><tr><th>Source ID</th><th>Canvas student</th><th>Score</th><th>Result</th></tr></thead><tbody>${state.preview.map(item => `<tr><td>${escapeHtml(item.sourceId)}</td><td>${escapeHtml(item.user?.name || '—')}</td><td>${escapeHtml(item.scoreText)}</td><td class="${item.user ? 'ctsu-ready' : 'ctsu-skip'}">${escapeHtml(item.status)}</td></tr>`).join('')}</tbody></table></div>`;
    document.querySelector('#ctsu-upload').disabled = !ready.length;
  }
  function csrf() {
    const page = typeof unsafeWindow === 'undefined' ? window : unsafeWindow;
    return document.querySelector('meta[name="csrf-token" i],meta[name="csrf_token" i],meta[name="csrfToken" i]')?.content || document.querySelector('input[name="authenticity_token"]')?.value || page.ENV?.csrf_token || page.ENV?.csrfToken || page.ENV?.CSRF_TOKEN || page.csrfToken || '';
  }
  async function upload() {
    const ready = state.preview.filter(item => item.user);
    if (!ready.length) return;
    const assignment = state.assignments.find(item => String(item.id) === document.querySelector('#ctsu-assignment').value);
    if (!assignment || !confirm(`Write ${ready.length} score${ready.length === 1 ? '' : 's'} to “${assignment.name}” in Canvas?\n\nSkipped rows will not be changed.`)) return;
    const token = csrf();
    if (!token) throw new Error('Canvas security token was unavailable. Reload this Canvas course and retry.');
    setBusy(true); let complete = 0;
    try {
      for (const item of ready) {
        message(`Uploading ${complete + 1} of ${ready.length}: ${item.user.name}…`);
        const body = new URLSearchParams({ 'submission[posted_grade]': String(item.score) });
        const response = await fetch(`/api/v1/courses/${courseId}/assignments/${assignment.id}/submissions/${item.user.id}`, { method: 'PUT', credentials: 'same-origin', headers: { Accept: 'application/json', 'Content-Type': 'application/x-www-form-urlencoded;charset=UTF-8', 'X-CSRF-Token': token }, body });
        if (!response.ok) throw new Error(`Canvas rejected ${item.user.name}'s score (${response.status}).`);
        complete++;
      }
      message(`Uploaded ${complete} score${complete === 1 ? '' : 's'} to ${assignment.name}. ${state.preview.length - complete} row${state.preview.length - complete === 1 ? '' : 's'} were skipped.`, 'ok');
    } finally { setBusy(false); }
  }
  function setBusy(value) { state.busy = value; document.querySelectorAll('#ctsu-panel button,#ctsu-panel select,#ctsu-panel input').forEach(node => { if (node.id !== 'ctsu-close') node.disabled = value || (node.id === 'ctsu-upload' && !state.preview.some(item => item.user)); }); }
  function open() {
    if (document.querySelector('#ctsu-backdrop')) return;
    const backdrop = document.createElement('div'); backdrop.id = 'ctsu-backdrop';
    backdrop.innerHTML = `<section id="ctsu-panel" role="dialog" aria-modal="true" aria-labelledby="ctsu-title"><header><div><h2 id="ctsu-title">Canvas TSV Score Uploader</h2><p>Preview every match before writing scores. Only rows marked Ready are uploaded.</p></div><button class="ctsu-btn" id="ctsu-close" type="button">Close</button></header><main><label class="ctsu-field">Upload TSV/CSV file <input id="ctsu-file" type="file" accept=".tsv,.csv,text/tab-separated-values,text/csv"></label><label class="ctsu-field" style="margin-top:14px">Or paste TSV/CSV data <textarea id="ctsu-data" placeholder="student_id\textra_credit_percent"></textarea></label><div class="ctsu-actions"><button class="ctsu-btn" id="ctsu-parse" type="button">Load file data</button><span class="ctsu-note">Tabs are detected automatically; commas are also supported.</span></div><div class="ctsu-grid"><label class="ctsu-field">Canvas assignment <select id="ctsu-assignment"><option>Loading assignments…</option></select></label><label class="ctsu-field">Source ID column <select id="ctsu-id-column"></select></label><label class="ctsu-field">Score column <select id="ctsu-score-column"></select></label></div><div class="ctsu-actions"><button class="ctsu-btn" id="ctsu-preview-button" type="button">Preview matches</button><button class="ctsu-btn ctsu-primary" id="ctsu-upload" type="button" disabled>Upload ready scores</button></div><div id="ctsu-preview"></div><div id="ctsu-message" role="status" aria-live="polite"></div></main></section>`;
    document.body.append(backdrop);
    document.querySelector('#ctsu-close').addEventListener('click', () => backdrop.remove());
    document.querySelector('#ctsu-file').addEventListener('change', async event => { const file = event.target.files?.[0]; if (file) document.querySelector('#ctsu-data').value = await file.text(); });
    document.querySelector('#ctsu-parse').addEventListener('click', () => { try { parseFile(); } catch (error) { message(error.message, 'bad'); } });
    document.querySelector('#ctsu-preview-button').addEventListener('click', () => { try { preview(); message('Preview ready. Review the skipped rows before uploading.', 'ok'); } catch (error) { message(error.message, 'bad'); } });
    document.querySelector('#ctsu-upload').addEventListener('click', () => upload().catch(error => message(error.message, 'bad')));
    loadCanvasData().catch(error => message(error.message, 'bad'));
  }
  launch.addEventListener('click', open);
})();
