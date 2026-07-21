// ==UserScript==
// @name         Georgia Tech Syllabus Helper
// @namespace    https://syllabus.gatech.edu/
// @version      4.6.2
// @description  Replace the syllabus site with a course-grouped dashboard and simplify editing.
// @match        https://syllabus.gatech.edu/user/*
// @match        https://syllabus.gatech.edu/node/*/edit*
// @require      https://cdnjs.cloudflare.com/ajax/libs/pdf.js/3.11.174/pdf.min.js
// @grant        none
// @run-at       document-idle
// ==/UserScript==

(() => {
  'use strict';

  const STYLE = `
    :root { --sth-navy:#0c243b; --sth-gold:#b3a369; --sth-pale:#f4f0e4; --sth-line:#d8dde1; --sth-red:#a12b2b; }
    .sth-panel { max-width:1100px; margin:1.5rem auto; padding:1.25rem; border:1px solid var(--sth-line); border-top:5px solid var(--sth-gold); border-radius:4px; background:#fff; box-shadow:0 8px 25px rgba(0,0,0,.08); color:#202a33; }
    .sth-panel * { box-sizing:border-box; }
    .sth-panel h2 { margin:0 0 .35rem; color:var(--sth-navy); font-size:1.5rem; }
    .sth-panel p { margin:.25rem 0 1rem; }
    .sth-controls { display:grid; grid-template-columns:minmax(220px,1fr) auto auto; gap:.75rem; align-items:end; }
    .sth-file-label { display:block; margin:0; font-weight:700; }
    .sth-file-label input { display:block; width:100%; margin-top:.35rem; padding:.55rem; border:1px solid var(--sth-line); border-radius:3px; }
    .sth-button { appearance:none; border:0; border-radius:3px; padding:.75rem 1rem; background:var(--sth-navy); color:#fff !important; font-weight:700; text-decoration:none !important; cursor:pointer; }
    .sth-button:hover { background:#183d5a; }
    .sth-button:disabled { opacity:.48; cursor:not-allowed; }
    .sth-button-secondary { background:#e8ebed; color:var(--sth-navy) !important; }
    .sth-button-danger { background:var(--sth-red); }
    .sth-options { display:flex; gap:1rem; flex-wrap:wrap; margin:1rem 0; padding:.75rem; background:var(--sth-pale); }
    .sth-options label { margin:0; }
    .sth-progress { margin-top:1rem; }
    .sth-progress progress { width:100%; height:13px; accent-color:var(--sth-gold); }
    .sth-results { margin:.65rem 0 0; padding:0; list-style:none; }
    .sth-results li { display:flex; justify-content:space-between; gap:1rem; padding:.45rem .6rem; border-top:1px solid #eceff1; }
    .sth-ok { color:#187044; font-weight:700; }
    .sth-error { color:var(--sth-red); font-weight:700; }
    .sth-row-check { width:1.1rem; height:1.1rem; accent-color:var(--sth-navy); }
    .sth-check-head { width:2.5rem; }
    tr.sth-selected > td { background:#fff9e8 !important; }
    .sth-badge { display:inline-block; padding:.18rem .5rem; border-radius:999px; background:#e7ebee; font-size:.75rem; font-weight:700; }
    .sth-badge-published { color:#17603c; background:#e1f0e8; }
    .sth-sticky { position:sticky; top:.5rem; z-index:20; }
    .sth-edit-grid { display:grid; grid-template-columns:1fr 1fr; gap:1rem; margin-top:1rem; }
    .sth-card { padding:1rem; border:1px solid var(--sth-line); border-radius:4px; background:#fafbfb; }
    .sth-card h3 { margin:0 0 .6rem; font-size:1rem; }
    .sth-card .form-item { margin:0; }
    .sth-card select, .sth-card input[type=text] { width:100%; }
    .sth-original-location { display:none !important; }
    .sth-more { margin-top:1rem; }
    .sth-more summary { cursor:pointer; color:var(--sth-navy); font-weight:700; }
    .sth-warning { padding:.7rem; border-left:4px solid #d29b28; background:#fff4d5; }
    body.sth-dashboard-active { margin:0; background:#f4f6f7; color:#202a33; }
    body.sth-dashboard-active > *:not(#sth-dashboard) { display:none !important; }
    #sth-dashboard { display:block !important; min-height:100vh; font-family:Arial,Helvetica,sans-serif; }
    .sth-appbar { display:flex; align-items:center; gap:2rem; min-height:72px; padding:0 max(24px,calc((100vw - 1180px)/2)); background:var(--sth-navy); color:#fff; border-bottom:4px solid var(--sth-gold); }
    .sth-brand { font-size:1.15rem; font-weight:800; white-space:nowrap; }
    .sth-brand span { display:block; color:#d9c990; font-size:.7rem; letter-spacing:.12em; text-transform:uppercase; }
    .sth-appnav { display:flex; gap:1.25rem; }
    .sth-appnav a { color:#d9e0e5; text-decoration:none; font-size:.88rem; }
    .sth-account-link { margin-left:auto; color:#fff; }
    .sth-dashboard-main { max-width:1180px; margin:auto; padding:2.5rem 24px 5rem; }
    .sth-dashboard-head { display:flex; justify-content:space-between; gap:2rem; align-items:end; margin-bottom:1.5rem; }
    .sth-dashboard-head h1 { margin:0; color:var(--sth-navy); font-size:2.25rem; }
    .sth-dashboard-head p { margin:.35rem 0 0; color:#60707c; }
    .sth-dashboard-search { width:min(360px,100%); padding:.7rem .85rem; border:1px solid #c8d0d5; border-radius:4px; background:#fff; }
    .sth-dashboard-head-actions { display:flex; gap:.65rem; align-items:center; }
    .sth-original-button { display:inline-flex; align-items:center; min-height:42px; padding:.65rem .9rem; border:2px solid var(--sth-gold); border-radius:4px; background:#fff; color:var(--sth-navy) !important; font-size:.82rem; font-weight:800; text-decoration:none !important; white-space:nowrap; }
    .sth-original-button:hover { background:var(--sth-pale); }
    .sth-stats { display:grid; grid-template-columns:repeat(3,1fr); gap:1rem; margin-bottom:1.5rem; }
    .sth-stat { padding:1rem 1.15rem; border:1px solid var(--sth-line); border-radius:4px; background:#fff; }
    .sth-stat strong { display:block; color:var(--sth-navy); font-size:1.5rem; }
    .sth-stat span { color:#60707c; font-size:.8rem; }
    .sth-course-list { display:grid; gap:1rem; }
    .sth-course { overflow:hidden; border:1px solid var(--sth-line); border-radius:5px; background:#fff; box-shadow:0 5px 18px rgba(0,0,0,.05); }
    .sth-course[open] { border-top:4px solid var(--sth-gold); }
    .sth-course-summary { display:grid; grid-template-columns:1fr auto auto; gap:1.5rem; align-items:center; padding:1.2rem 1.35rem; cursor:pointer; list-style:none; }
    .sth-course-summary::-webkit-details-marker { display:none; }
    .sth-course-summary h2 { margin:0; color:var(--sth-navy); font-size:1.15rem; }
    .sth-course-summary p { margin:.2rem 0 0; color:#60707c; font-size:.82rem; }
    .sth-course-summary .sth-chevron { font-size:1.25rem; transition:transform .2s; }
    .sth-course[open] .sth-chevron { transform:rotate(180deg); }
    .sth-course-body { padding:0 1.35rem 1.35rem; border-top:1px solid #e8ebed; }
    .sth-group-upload { display:grid; grid-template-columns:1fr auto; gap:1rem; align-items:end; margin:1rem 0; padding:1rem; background:var(--sth-pale); }
    .sth-drop-hint { display:block; margin:.2rem 0 .45rem; color:#5c6870; font-size:.78rem; font-weight:400; }
    .sth-offerings { width:100%; border-collapse:collapse; }
    .sth-offerings th { color:#667580; font-size:.68rem; letter-spacing:.08em; text-align:left; text-transform:uppercase; }
    .sth-offerings th,.sth-offerings td { padding:.7rem .5rem; border-bottom:1px solid #e7eaec; }
    .sth-offerings td { font-size:.82rem; }
    .sth-offerings a { margin-right:.8rem; color:var(--sth-navy); font-weight:700; }
    .sth-inline-result { position:sticky; top:.5rem; z-index:22; margin:.7rem 0; font-size:.82rem; }
    .sth-dashboard-note { margin:0 0 1.5rem; padding:.85rem 1rem; border-left:5px solid var(--sth-gold); background:var(--sth-pale); color:#514a38; }
    .sth-empty-dashboard { padding:3rem; text-align:center; color:#60707c; background:#fff; }
    .sth-term { margin-top:2rem; }
    .sth-term:first-child { margin-top:0; }
    .sth-term-head { display:flex; align-items:center; gap:.75rem; margin:0 0 .8rem; color:var(--sth-navy); font-size:1.45rem; }
    .sth-term-head:after { content:""; flex:1; border-top:1px solid #cfd6da; }
    .sth-row-remove { border:0; padding:0; background:none; color:#8b3131; font-size:.75rem; text-decoration:underline; cursor:pointer; }
    tr.sth-excluded { opacity:.48; background:#f3f4f5; }
    tr.sth-excluded .sth-offering-check { visibility:hidden; }
    tr.sth-excluded .sth-row-remove { color:var(--sth-navy); }
    .sth-needs-action { display:inline-block; padding:.3rem .6rem; border-radius:3px; background:#ffe2a8; color:#6f4200; font-size:.78rem; font-weight:800; }
    .sth-publish-alert { margin:1rem 0 0; padding:.8rem 1rem; border-left:5px solid #d28b00; background:#fff2d5; color:#593b00; }
    .sth-publish-alert strong,.sth-publish-alert span { display:block; }
    .sth-publish-alert span { margin-top:.2rem; font-size:.82rem; }
    .sth-all-published { color:#17603c; background:#e1f0e8; }
    .sth-course.sth-working { border-color:var(--sth-gold); box-shadow:0 0 0 3px rgba(179,163,105,.22),0 8px 25px rgba(0,0,0,.1); }
    .sth-live-progress { display:grid; grid-template-columns:auto 1fr auto; gap:.65rem; align-items:center; margin-top:1rem; padding:1rem; border:1px solid #d3c48d; border-radius:4px; background:#fff9e7; }
    .sth-spinner { width:22px; height:22px; border:3px solid #d9d0b2; border-top-color:var(--sth-navy); border-radius:50%; animation:sth-spin .8s linear infinite; }
    .sth-live-progress strong,.sth-live-progress span { display:block; }
    .sth-live-progress span { margin-top:.15rem; color:#655c46; font-size:.8rem; }
    .sth-live-progress progress { grid-column:1/-1; width:100%; height:12px; accent-color:var(--sth-gold); }
    @keyframes sth-spin { to { transform:rotate(360deg); } }
    .sth-file-meta { min-height:1.2rem; margin-top:.35rem; color:#5d6870; font-size:.75rem; }
    .sth-file-meta button { border:0; padding:0; background:none; color:var(--sth-navy); font-weight:700; text-decoration:underline; cursor:pointer; }
    .sth-queue { position:sticky; top:.5rem; z-index:30; margin-bottom:1.5rem; padding:1rem; border:1px solid var(--sth-gold); border-radius:4px; background:#fff; box-shadow:0 8px 24px rgba(0,0,0,.12); }
    .sth-queue-head { display:flex; justify-content:space-between; gap:1rem; align-items:center; }
    .sth-queue h2 { margin:0; color:var(--sth-navy); font-size:1.05rem; }
    .sth-queue-items { margin:.65rem 0; padding-left:1.25rem; font-size:.82rem; }
    .sth-queue-actions { display:flex; gap:.6rem; }
    .sth-completion { margin-top:.8rem; padding:.8rem; border:1px solid var(--sth-line); background:#fff; }
    .sth-completion ul { margin:.5rem 0 0; padding:0; list-style:none; }
    .sth-completion li { display:flex; justify-content:space-between; gap:1rem; padding:.35rem 0; border-top:1px solid #edf0f1; }
    .sth-move-select { max-width:145px; margin-top:.35rem; font-size:.72rem; }
    .sth-previous-label { color:#6c7780; font-size:.72rem; font-weight:400; }
    .sth-pdf-dialog { width:min(900px,92vw); height:min(760px,90vh); padding:0; border:0; border-radius:5px; box-shadow:0 20px 60px rgba(0,0,0,.35); }
    .sth-pdf-dialog header { display:flex; justify-content:space-between; align-items:center; padding:.7rem 1rem; background:var(--sth-navy); color:#fff; }
    .sth-pdf-pages { height:calc(100% - 52px); overflow:auto; padding:1rem; background:#4c5155; text-align:center; }
    .sth-pdf-pages canvas { display:block; max-width:100%; height:auto; margin:0 auto 1rem; background:#fff; box-shadow:0 3px 14px rgba(0,0,0,.35); }
    .sth-pdf-loading { padding:2rem; color:#fff; }
    .sth-pdf-dialog button { border:0; background:none; color:#fff; font-size:1.3rem; }
    .sth-original-toggle { position:fixed; right:18px; bottom:18px; z-index:99999; padding:.75rem 1rem; border-radius:4px; background:#0c243b; color:#fff !important; font:bold 13px Arial,sans-serif; text-decoration:none !important; box-shadow:0 5px 18px rgba(0,0,0,.28); }
    .sth-mini-actions { display:flex; gap:.5rem; flex-wrap:wrap; margin-top:.65rem; }
    .sth-ops { display:flex; align-items:center; gap:.5rem; flex-wrap:wrap; margin-bottom:1.5rem; padding:.8rem; border:1px solid var(--sth-line); background:#fff; }
    .sth-ops .sth-button { padding:.55rem .7rem; font-size:.76rem; }
    .sth-last-checked { margin-left:auto; color:#65727b; font-size:.75rem; }
    .sth-drop-active { outline:3px dashed var(--sth-gold); outline-offset:-6px; background:#fff8df !important; }
    .sth-safe-banner { padding:.7rem 1rem; background:#ffe7b5; color:#633f00; font-weight:800; }
    .sth-health { margin-bottom:1rem; padding:1rem; border:1px solid var(--sth-line); background:#fff; }
    .sth-health ul { margin:.5rem 0 0; }
    .sth-undo-groups { display:flex; gap:.5rem; flex-wrap:wrap; margin-top:.8rem; padding-top:.8rem; border-top:1px solid var(--sth-line); }
    .sth-link-button { border:0; margin-right:.8rem; padding:0; background:none; color:var(--sth-navy); font-weight:700; text-decoration:underline; cursor:pointer; }
    .sth-create-group { margin-top:.8rem; padding:1rem; border:2px dashed #bcc5ca; border-radius:4px; text-align:center; background:#fafbfb; }
    .sth-custom-actions { display:flex; gap:.5rem; margin-top:1rem; }
    .sth-group-confirm { margin:1rem 0; padding:1rem; border:2px solid #d28b00; border-radius:4px; background:#fff2d5; color:#593b00; }
    .sth-group-confirm strong,.sth-group-confirm span { display:block; }
    .sth-group-confirm span { margin:.25rem 0 .75rem; font-size:.84rem; }
    @media (max-width:760px) { .sth-controls,.sth-edit-grid { grid-template-columns:1fr; } .sth-dashboard-head { align-items:stretch; flex-direction:column; } .sth-dashboard-head-actions { align-items:stretch; flex-direction:column; } .sth-dashboard-search { width:100%; } .sth-original-button { justify-content:center; } .sth-last-checked { width:100%; margin-left:0; } }
  `;

  addStyle(STYLE);

  const backups = new Map();
  const originalMode = new URLSearchParams(location.search).get('sth_original') === '1';
  if (/^\/node\/\d+\/edit\/?$/.test(location.pathname)) simplifyEditPage();
  else if (document.body.classList.contains('path-user') && originalMode) addDashboardReturn();
  else if (document.body.classList.contains('path-user')) enhanceDashboard();

  function addStyle(css) {
    const style = document.createElement('style');
    style.textContent = css;
    document.head.append(style);
  }

  function addDashboardReturn() {
    const link=document.createElement('a');
    link.className='sth-original-toggle';
    link.href=location.pathname;
    link.textContent='← Back to syllabus dashboard';
    document.body.append(link);
  }

  function enhanceDashboard() {
    const tables = [...document.querySelectorAll('.view-instructor-syllabi table')];
    if (!tables.length || document.querySelector('#sth-dashboard')) return;

    const courses = [];
    const excludedIds = new Set(readStored('sthExcludedOfferings', []));
    const groupOverrides = readStored('sthGroupOverrides', {});
    const customGroups = readStored('sthCustomGroups', {});
    const confirmedGroups = readStored('sthConfirmedGroups', {});
    const queue = new Map();
    const chosenFiles = new Map();
    const activityLog = readStored('sthActivityLog', []);
    const debugLog = [];
    let safeMode = readStored('sthSafeMode', false);
    let cancelRequested = false;
    tables.forEach((table) => {
      const heading = table.closest('.views-element-container')?.querySelector('h2')?.textContent || '';
      const published = /previously published/i.test(heading);
      [...table.tBodies].flatMap((body) => [...body.rows]).forEach((row) => {
        const edit = row.querySelector('a[href*="/node/"][href*="/edit"]');
        if (!edit) return;
        const nodeId = edit.pathname.match(/\/node\/(\d+)\/edit/)?.[1];
        if (!nodeId) return;
        const cells = [...row.cells];
        const title = cells[0]?.textContent.trim() || `Syllabus ${nodeId}`;
        const rawCourse = cells[2]?.textContent.trim() || '';
        const prefix = title.match(/^([A-Z]{2,5})\s+\d/i)?.[1]?.toUpperCase() || 'CS';
        const course = `${prefix} ${rawCourse}`.trim();
        const baseNumber = rawCourse.replace(/R$/i, '');
        const isRecitation = /R$/i.test(rawCourse);
        const isVip = /^VIP\s+Proj(?:ect)?\s+Team/i.test(title);
        const section = cells[3]?.textContent.trim() || '';
        const crn = cells[1]?.textContent.trim() || '';
        const term = `${cells[4]?.textContent.trim() || ''} ${cells[5]?.textContent.trim() || ''}`.trim();
        const view = row.querySelector('a[href*="/syllabi/"]')?.href || '#';
        courses.push({ nodeId, title, course, prefix, rawCourse, baseNumber, isRecitation, isVip, section, crn, term, published, view, edit:edit.href });
      });
    });

    // Migrate the old "excluded" behavior into visible standalone cards.
    courses.forEach(course=>{
      if (!excludedIds.has(course.nodeId)) return;
      const key=`individual|${course.nodeId}`;
      customGroups[key]??={term:course.term,name:`${course.course} ${course.section}`,isIndividual:true};
      groupOverrides[course.nodeId]=key;
      excludedIds.delete(course.nodeId);
    });
    localStorage.setItem('sthExcludedOfferings',JSON.stringify([...excludedIds]));
    localStorage.setItem('sthGroupOverrides',JSON.stringify(groupOverrides));
    localStorage.setItem('sthCustomGroups',JSON.stringify(customGroups));

    const defaultGroups = new Map();
    courses.forEach((course) => {
      // VIP numbers denote a student's level in the same project team. Keep
      // different VIP teams separate by their section/team code.
      const key = course.isVip
        ? `${course.term.toLowerCase()}|vip|${course.section.toLowerCase()}`
        : `${course.term.toLowerCase()}|${course.prefix.toLowerCase()}|${course.baseNumber.toLowerCase()}`;
      course.defaultGroupKey = key;
      const groupCourse = course.isVip ? `VIP · ${course.section}` : `${course.prefix} ${course.baseNumber}`;
      const groupTitle = course.isVip ? 'VIP Project Team' : course.title;
      const signature=course.isVip?`vip|${course.section.toLowerCase()}`:`${course.prefix.toLowerCase()}|${course.baseNumber.toLowerCase()}`;
      if (!defaultGroups.has(key)) defaultGroups.set(key, { key, signature, term:course.term, course:groupCourse, title:groupTitle, isVip:course.isVip, offerings:[] });
    });
    const groups = new Map([...defaultGroups].map(([key,value])=>[key,{...value,offerings:[]}]))
    Object.entries(customGroups).forEach(([key,custom])=>{
      groups.set(key,{key,signature:key,term:custom.term,course:custom.name,title:custom.isIndividual?'Individual course':'Custom syllabus group',isVip:false,isCustom:true,isIndividual:Boolean(custom.isIndividual),offerings:[]});
    });
    courses.forEach((course) => {
      const override = groupOverrides[course.nodeId];
      const targetKey = override && groups.has(override) && groups.get(override).term === course.term ? override : course.defaultGroupKey;
      groups.get(targetKey).offerings.push(course);
      if (!course.isRecitation && !course.isVip && !groups.get(targetKey).isVip && !groups.get(targetKey).isCustom) groups.get(targetKey).title = course.title;
    });

    const dashboard = document.createElement('div');
    dashboard.id = 'sth-dashboard';
    dashboard.innerHTML = `
      <header class="sth-appbar"><div class="sth-brand">Georgia Tech<span>Syllabus workspace</span></div><nav class="sth-appnav"><a href="/user">My courses</a><a href="/search-syllabi">Search syllabi</a><a href="/faq">Help</a><a href="${location.pathname}?sth_original=1">Original page</a></nav><a class="sth-account-link" href="/user">My account</a></header>
      <main class="sth-dashboard-main"><div class="sth-dashboard-head"><div><h1>My courses</h1><p>Upload, publish, and replace syllabus PDFs without leaving this dashboard.</p></div><div class="sth-dashboard-head-actions"><input id="sth-dashboard-search" class="sth-dashboard-search" type="search" placeholder="Search course, name, section, or CRN…" aria-label="Search courses"><a class="sth-original-button" href="${location.pathname}?sth_original=1">↗ Verify on original site</a></div></div>
      <div class="sth-dashboard-note"><strong>Everything happens here.</strong> Choose a PDF inside a course group, select its offerings, and use the action button. Drafts are published and existing PDFs are replaced automatically.</div>
      <div id="sth-safe-banner" class="sth-safe-banner" ${safeMode?'':'hidden'}>Safe mode is on. Upload, replacement, queue, and undo actions are disabled.</div>
      <section class="sth-ops" aria-label="Dashboard tools"><button id="sth-refresh" class="sth-button sth-button-secondary" type="button">Refresh status</button><button id="sth-health" class="sth-button sth-button-secondary" type="button">Run health scan</button><button id="sth-safe" class="sth-button sth-button-secondary" type="button">${safeMode?'Turn off safe mode':'Turn on safe mode'}</button><button id="sth-export" class="sth-button sth-button-secondary" type="button">Export activity</button><button id="sth-debug" class="sth-button sth-button-secondary" type="button">Export debug report</button><button id="sth-settings" class="sth-button sth-button-secondary" type="button">Back up settings</button><label class="sth-button sth-button-secondary">Restore settings<input id="sth-settings-file" type="file" accept="application/json" hidden></label><button id="sth-cancel" class="sth-button sth-button-danger" type="button" hidden>Stop after current upload</button><span id="sth-last-checked" class="sth-last-checked">Last checked: ${escapeHtml(localStorage.getItem('sthLastChecked')||'not yet')}</span></section>
      <section id="sth-health-result" class="sth-health" hidden></section>
      <section class="sth-stats" aria-label="Summary"><div class="sth-stat"><strong>${[...groups.values()].filter(g=>g.offerings.length).length}</strong><span>Course groups</span></div><div class="sth-stat"><strong>${courses.length}</strong><span>Total sections</span></div><div class="sth-stat"><strong>${courses.filter(c=>!c.published&&!excludedIds.has(c.nodeId)).length}</strong><span>Drafts needing attention</span></div></section>
      <section id="sth-queue" class="sth-queue" hidden><div class="sth-queue-head"><h2>Semester queue · <span id="sth-queue-count">0</span> course groups</h2><div class="sth-queue-actions"><button id="sth-clear-queue" class="sth-button sth-button-secondary" type="button">Clear</button><button id="sth-run-queue" class="sth-button" type="button">Review and run all</button></div></div><ul id="sth-queue-items" class="sth-queue-items"></ul><div id="sth-queue-result"></div></section>
      <section id="sth-course-list" class="sth-course-list"></section></main>
      <dialog id="sth-pdf-dialog" class="sth-pdf-dialog"><header><strong>PDF preview</strong><button type="button" aria-label="Close preview">×</button></header><div class="sth-pdf-pages" aria-live="polite"></div></dialog>`;
    document.body.append(dashboard);
    document.body.classList.add('sth-dashboard-active');
    const list = dashboard.querySelector('#sth-course-list');
    const pdfDialog = dashboard.querySelector('#sth-pdf-dialog');
    pdfDialog.querySelector('button').addEventListener('click',()=>{ pdfDialog.close(); pdfDialog.querySelector('.sth-pdf-pages').replaceChildren(); });
    dashboard.querySelector('#sth-clear-queue').addEventListener('click',()=>{ queue.clear(); renderQueue(); });
    dashboard.querySelector('#sth-cancel').addEventListener('click',()=>{
      cancelRequested=true;
      dashboard.querySelector('#sth-cancel').textContent='Stopping after current upload…';
      dashboard.querySelector('#sth-cancel').disabled=true;
    });
    dashboard.querySelector('#sth-safe').addEventListener('click',()=>{
      safeMode=!safeMode; localStorage.setItem('sthSafeMode',JSON.stringify(safeMode)); applySafeMode();
    });
    dashboard.querySelector('#sth-refresh').addEventListener('click',()=>refreshStatuses(false));
    dashboard.querySelector('#sth-health').addEventListener('click',()=>refreshStatuses(true));
    dashboard.querySelector('#sth-export').addEventListener('click',()=>downloadText('syllabus-activity.csv',activityCsv(),'text/csv'));
    dashboard.querySelector('#sth-debug').addEventListener('click',()=>downloadText('syllabus-helper-debug.json',JSON.stringify({version:'4.0.0',generated:new Date().toISOString(),url:location.origin+location.pathname,events:debugLog,activity:activityLog.slice(-50)},null,2),'application/json'));
    dashboard.querySelector('#sth-settings').addEventListener('click',()=>downloadText('syllabus-helper-settings.json',JSON.stringify({excluded:[...excludedIds],groupOverrides,customGroups,confirmedGroups},null,2),'application/json'));
    dashboard.querySelector('#sth-settings-file').addEventListener('change',async(event)=>{
      try {
        const settings=JSON.parse(await event.target.files[0].text());
        if (!Array.isArray(settings.excluded)||typeof settings.groupOverrides!=='object') throw new Error('Invalid settings file');
        localStorage.setItem('sthExcludedOfferings',JSON.stringify(settings.excluded));
        localStorage.setItem('sthGroupOverrides',JSON.stringify(settings.groupOverrides));
        localStorage.setItem('sthCustomGroups',JSON.stringify(settings.customGroups||{}));
        localStorage.setItem('sthConfirmedGroups',JSON.stringify(settings.confirmedGroups||{}));
        location.reload();
      } catch(error) { alert(`Could not restore settings: ${error.message}`); }
    });
    dashboard.querySelector('#sth-run-queue').addEventListener('click',async()=>{
      if (safeMode) return;
      const batches=[...queue.values()];
      if (!batches.length) return;
      const result=dashboard.querySelector('#sth-queue-result');
      await executeBatches(batches,result,dashboard.querySelector('#sth-queue'));
      renderQueue();
    });
    applySafeMode();
    const termOrder = { Spring:1, Summer:2, Fall:3 };
    const terms = [...new Set(courses.map(c=>c.term))].sort((a,b) => {
      const [as,ay]=a.split(' '), [bs,by]=b.split(' ');
      return Number(by)-Number(ay) || (termOrder[bs]||0)-(termOrder[as]||0);
    });
    terms.forEach((term) => {
      const termSection = document.createElement('section');
      termSection.className = 'sth-term';
      termSection.dataset.term = term;
      termSection.innerHTML = `<h2 class="sth-term-head">${escapeHtml(term)}</h2><div class="sth-course-list"></div>`;
      list.append(termSection);
      const termList = termSection.querySelector('.sth-course-list');
      [...groups.values()].filter(g=>g.term===term&&(g.offerings.length||g.isCustom)).sort((a,b) => a.course.localeCompare(b.course, undefined, {numeric:true})).forEach((group, index) => {
      const includedOfferings=group.offerings.filter(o=>!excludedIds.has(o.nodeId));
      group.fingerprint=`${group.term}|${group.key}|${includedOfferings.map(o=>o.nodeId).sort().join(',')}`;
      group.confirmed=group.isIndividual||!includedOfferings.length||confirmedGroups[group.key]===group.fingerprint;
      const published = includedOfferings.filter((o) => o.published).length;
      const drafts = includedOfferings.filter((o) => !o.published);
      const draftNames = drafts.map((o) => `${o.course} ${o.section}`).join(', ');
      const stateSummary = !group.confirmed
        ? '<span class="sth-needs-action">Needs group confirmation</span>'
        : !includedOfferings.length
        ? '<span class="sth-badge">Empty group</span>'
        : drafts.length
        ? `<span class="sth-needs-action">${published ? 'Partially published' : 'Not published'} · ${escapeHtml(draftNames)}</span>`
        : '<span class="sth-needs-action sth-all-published">All offerings published</span>';
      const alert = drafts.length
        ? `<div class="sth-publish-alert"><strong>${published ? 'This course is only partially published.' : 'This course has not been published.'}</strong><span>Still needing publication: ${escapeHtml(draftNames)}</span></div>`
        : '';
      const details = document.createElement('details');
      details.className = 'sth-course';
      details.dataset.search = `${group.course} ${group.title} ${group.offerings.map(o=>`${o.course} ${o.title} ${o.section} ${o.crn}`).join(' ')}`.toLowerCase();
      const customActions=group.isCustom&&!group.isIndividual?'<div class="sth-custom-actions"><button class="sth-button sth-button-secondary sth-rename-group" type="button">Rename group</button><button class="sth-button sth-button-danger sth-dissolve-group" type="button">Dissolve group</button></div>':'';
      const confirmation=!group.confirmed?`<div class="sth-group-confirm"><strong>Confirm this group before publishing</strong><span>Review every course, recitation, section, and CRN below. The selected PDF will be applied to all checked offerings.</span><button class="sth-button sth-confirm-group" type="button">This group is correct</button></div>`:'';
      details.innerHTML = `<summary class="sth-course-summary"><div><h2>${escapeHtml(group.course)} · ${escapeHtml(group.title)}</h2><p><span class="sth-group-count">${includedOfferings.length}</span> offering${includedOfferings.length===1?'':'s'} in ${escapeHtml(term)} ${isPastTerm(term)?'<span class="sth-previous-label">· previous term</span>':''}${group.isVip?' · grouped across VIP course levels':group.offerings.some(o=>o.isRecitation)?' · lecture and recitation':''}</p></div><div>${stateSummary}</div><span class="sth-chevron">⌄</span></summary><div class="sth-course-body">${confirmation}${customActions}${alert}<div class="sth-group-upload"><label class="sth-file-label">New PDF for selected offerings<span class="sth-drop-hint">Choose a PDF below, or drag and drop it anywhere in this upload box.</span><input class="sth-group-file" type="file" accept="application/pdf,.pdf"><span class="sth-file-meta"></span><span class="sth-mini-actions"><button class="sth-button sth-button-secondary sth-missing-only" type="button">Select drafts only</button><button class="sth-button sth-button-secondary sth-copy-forward" type="button">Use previous term’s PDF</button></span></label><div><button class="sth-button sth-group-run" type="button" disabled>Choose a PDF</button> <button class="sth-button sth-button-secondary sth-group-queue" type="button" disabled>Add to semester queue</button></div></div><div class="sth-inline-result" aria-live="polite"></div><table class="sth-offerings"><thead><tr><th><input class="sth-group-all" type="checkbox" checked aria-label="Select all offerings"></th><th>Type</th><th>Section</th><th>CRN</th><th>Status</th><th>Optional links</th></tr></thead><tbody></tbody></table></div>`;
      const tbody = details.querySelector('tbody');
      group.offerings.sort((a,b)=>a.term.localeCompare(b.term)||a.section.localeCompare(b.section)).forEach((offering) => {
        const tr = document.createElement('tr');
        tr.dataset.node = offering.nodeId;
        const automaticOption=groupOverrides[offering.nodeId]?'<option value="__automatic__">Restore automatic grouping</option>':'';
        const moveOptions=automaticOption+[...groups.values()].filter(g=>g.term===term&&g.key!==group.key).map(g=>`<option value="${escapeHtml(g.key)}">Move to ${escapeHtml(g.course)}</option>`).join('');
        tr.innerHTML = `<td><input class="sth-offering-check" type="checkbox" checked data-node="${offering.nodeId}" aria-label="Select ${escapeHtml(offering.section)}"></td><td>${offering.isVip?'VIP course':offering.isRecitation?'Recitation':'Course'} <small>(${escapeHtml(offering.course)})</small></td><td><strong>${escapeHtml(offering.section)}</strong></td><td>${escapeHtml(offering.crn)}</td><td><span class="sth-badge ${offering.published?'sth-badge-published':''}">${offering.published?'Published':'Draft'}</span></td><td><button class="sth-link-button sth-view-pdf" data-node="${offering.nodeId}" type="button">View PDF</button><a href="${offering.view}">Original record</a><a href="${offering.edit}">Advanced</a><button class="sth-row-remove" type="button">${group.isIndividual?'Return to automatic group':'Make individual'}</button><select class="sth-move-select" aria-label="Move ${escapeHtml(offering.course)} ${escapeHtml(offering.section)} to another group"><option value="">Move to another group…</option>${moveOptions}</select></td>`;
        tbody.append(tr);
      });
      termList.append(details);
      group.card=details;
      wireGroup(details, group);
      });
      const creator=document.createElement('div');
      creator.className='sth-create-group';
      creator.innerHTML=`<button class="sth-button sth-button-secondary" type="button">＋ Create custom group for ${escapeHtml(term)}</button>`;
      creator.querySelector('button').addEventListener('click',()=>{
        const name=prompt(`Name the new ${term} syllabus group:`)?.trim();
        if (!name) return;
        const key=`custom|${Date.now()}|${Math.random().toString(36).slice(2,7)}`;
        customGroups[key]={term,name};
        localStorage.setItem('sthCustomGroups',JSON.stringify(customGroups));
        location.reload();
      });
      termSection.append(creator);
    });

    dashboard.querySelector('#sth-dashboard-search').addEventListener('input', (event) => {
      const query = event.target.value.trim().toLowerCase();
      list.querySelectorAll('.sth-course').forEach((card) => card.hidden = !card.dataset.search.includes(query));
      list.querySelectorAll('.sth-term').forEach((term) => term.hidden = ![...term.querySelectorAll('.sth-course')].some(card=>!card.hidden));
    });

    function wireGroup(card, group) {
      const file = card.querySelector('.sth-group-file');
      const run = card.querySelector('.sth-group-run');
      const queueButton = card.querySelector('.sth-group-queue');
      const fileMeta = card.querySelector('.sth-file-meta');
      const all = card.querySelector('.sth-group-all');
      const checks = [...card.querySelectorAll('.sth-offering-check')];
      const result = card.querySelector('.sth-inline-result');
      const getPdf=()=>chosenFiles.get(group.key)||file.files?.[0];
      const uploadZone=card.querySelector('.sth-group-upload');
      const setPdf=(pdf,label='')=>{
        if (!pdf||(!/pdf/i.test(pdf.type)&&!pdf.name.toLowerCase().endsWith('.pdf'))) { result.innerHTML='<strong class="sth-error">Please drop a PDF file.</strong>'; return; }
        result.replaceChildren();
        chosenFiles.set(group.key,pdf);
        fileMeta.innerHTML=`${label}${escapeHtml(pdf.name)} · ${formatBytes(pdf.size)} · <button type="button">Preview</button>`;
        fileMeta.querySelector('button')?.addEventListener('click',()=>previewPdf(pdf));
        update();
      };
      const activeChecks = () => checks.filter(c=>!c.closest('tr').classList.contains('sth-excluded'));
      const update = () => {
        const active=activeChecks();
        const selected=active.filter(c=>c.checked).map(c=>group.offerings.find(o=>o.nodeId===c.dataset.node));
        run.disabled = safeMode || !group.confirmed || !getPdf() || !selected.length;
        queueButton.disabled = run.disabled;
        if (!getPdf()) run.textContent='Choose a PDF';
        else if (selected.every(o=>o.published)) run.textContent=`Replace PDF for ${selected.length} selected`;
        else if (selected.every(o=>!o.published)) run.textContent=`Upload and publish ${selected.length} selected`;
        else run.textContent=`Publish drafts and replace PDFs (${selected.length})`;
        all.checked = active.length>0&&active.every(c=>c.checked);
        all.indeterminate = active.some(c=>c.checked) && !all.checked;
        card.querySelector('.sth-group-count').textContent=active.length;
      };
      card.sthUpdate=update;
      file.addEventListener('change',()=>{
        const pdf=file.files?.[0];
        if (pdf) setPdf(pdf);
        else { chosenFiles.delete(group.key); fileMeta.textContent=''; }
        update();
      });
      ['dragenter','dragover'].forEach(type=>uploadZone.addEventListener(type,event=>{ event.preventDefault(); uploadZone.classList.add('sth-drop-active'); }));
      ['dragleave','drop'].forEach(type=>uploadZone.addEventListener(type,event=>{ event.preventDefault(); uploadZone.classList.remove('sth-drop-active'); }));
      uploadZone.addEventListener('drop',event=>setPdf(event.dataTransfer.files?.[0]));
      checks.forEach(c=>c.addEventListener('change', update));
      card.querySelector('.sth-confirm-group')?.addEventListener('click',()=>{
        group.confirmed=true;
        confirmedGroups[group.key]=group.fingerprint;
        localStorage.setItem('sthConfirmedGroups',JSON.stringify(confirmedGroups));
        card.querySelector('.sth-group-confirm')?.remove();
        refreshGroupStatus(group,card);
        update();
      });
      card.querySelector('.sth-missing-only').addEventListener('click',(event)=>{
        event.preventDefault(); event.stopPropagation();
        activeChecks().forEach(check=>{ const offering=group.offerings.find(o=>o.nodeId===check.dataset.node); check.checked=!offering.published; });
        update();
      });
      card.querySelector('.sth-copy-forward').addEventListener('click',async(event)=>{
        event.preventDefault(); event.stopPropagation();
        const source=[...groups.values()].filter(g=>g.signature===group.signature&&termRank(g.term)<termRank(group.term)&&g.offerings.some(o=>o.published)).sort((a,b)=>termRank(b.term)-termRank(a.term))[0];
        if (!source) { result.innerHTML='<strong class="sth-error">No earlier published syllabus was found for this course.</strong>'; return; }
        const offering=source.offerings.find(o=>o.published);
        result.textContent=`Loading PDF from ${source.term}…`;
        try {
          const doc=await getDocument(`/node/${offering.nodeId}/edit`);
          const link=doc.querySelector('.file--application-pdf a, a[type="application/pdf"]');
          if (!link) throw new Error('Earlier PDF was not found');
          const response=await fetchWithTimeout(new URL(link.getAttribute('href'),location.origin),{credentials:'same-origin'});
          if (!response.ok) throw new Error(`Could not download earlier PDF (${response.status})`);
          const blob=await response.blob();
          const name=link.textContent.trim()||`${group.course.replace(/\s+/g,'_')}_${group.term.replace(/\s+/g,'_')}.pdf`;
          const pdf=new File([blob],name,{type:'application/pdf'});
          setPdf(pdf,`Copied from ${escapeHtml(source.term)} · `);
          result.innerHTML='<strong class="sth-ok">Previous-term PDF ready. Review it, then publish or queue it.</strong>';
          update();
        } catch(error) { result.innerHTML=`<strong class="sth-error">${escapeHtml(error.message)}</strong>`; }
      });
      all.addEventListener('change',()=>{ activeChecks().forEach(c=>c.checked=all.checked); update(); });
      card.querySelectorAll('.sth-row-remove').forEach(button=>button.addEventListener('click',()=>{
        const row=button.closest('tr'), nodeId=row.dataset.node;
        if (group.isIndividual) {
          delete groupOverrides[nodeId];
          delete customGroups[group.key];
        } else {
          const offering=group.offerings.find(item=>item.nodeId===nodeId);
          const key=`individual|${nodeId}`;
          customGroups[key]={term:offering.term,name:`${offering.course} ${offering.section}`,isIndividual:true};
          groupOverrides[nodeId]=key;
        }
        localStorage.setItem('sthCustomGroups',JSON.stringify(customGroups));
        localStorage.setItem('sthGroupOverrides',JSON.stringify(groupOverrides));
        location.reload();
      }));
      card.querySelectorAll('.sth-view-pdf').forEach(button=>button.addEventListener('click',async()=>{
        const offering=group.offerings.find(o=>o.nodeId===button.dataset.node);
        await openOfferingPdf(offering,result,button);
      }));
      card.querySelectorAll('.sth-move-select').forEach(select=>select.addEventListener('change',()=>{
        if (!select.value) return;
        const nodeId=select.closest('tr').dataset.node;
        if (select.value==='__automatic__') delete groupOverrides[nodeId];
        else groupOverrides[nodeId]=select.value;
        if (group.isIndividual) delete customGroups[group.key];
        localStorage.setItem('sthCustomGroups',JSON.stringify(customGroups));
        localStorage.setItem('sthGroupOverrides',JSON.stringify(groupOverrides));
        location.reload();
      }));
      card.querySelector('.sth-rename-group')?.addEventListener('click',()=>{
        const name=prompt('Rename this custom syllabus group:',group.course)?.trim();
        if (!name) return;
        customGroups[group.key].name=name;
        localStorage.setItem('sthCustomGroups',JSON.stringify(customGroups));
        location.reload();
      });
      card.querySelector('.sth-dissolve-group')?.addEventListener('click',()=>{
        if (!confirm(`Dissolve “${group.course}”? Its offerings will return to automatic grouping.`)) return;
        delete customGroups[group.key];
        Object.keys(groupOverrides).forEach(nodeId=>{ if (groupOverrides[nodeId]===group.key) delete groupOverrides[nodeId]; });
        localStorage.setItem('sthCustomGroups',JSON.stringify(customGroups));
        localStorage.setItem('sthGroupOverrides',JSON.stringify(groupOverrides));
        location.reload();
      });
      queueButton.addEventListener('click',()=>{
        if (safeMode) return;
        const selected=activeChecks().filter(c=>c.checked).map(c=>group.offerings.find(o=>o.nodeId===c.dataset.node));
        const pdf=getPdf();
        if (!pdf||!selected.length) return;
        queue.set(group.key,{group,selected,pdf,card}); renderQueue();
        result.innerHTML='<strong class="sth-ok">Added to semester queue.</strong>';
      });
      run.addEventListener('click', async () => {
        if (safeMode) return;
        const selected = activeChecks().filter(c=>c.checked).map(c=>group.offerings.find(o=>o.nodeId===c.dataset.node));
        const pdf = getPdf();
        if (!pdf||!selected.length) return;
        await executeBatches([{group,selected,pdf,card}],result,card);
        update();
      });
    }

    function applySafeMode() {
      dashboard.querySelector('#sth-safe-banner').hidden=!safeMode;
      dashboard.querySelector('#sth-safe').textContent=safeMode?'Turn off safe mode':'Turn on safe mode';
      dashboard.querySelectorAll('.sth-group-run,.sth-group-queue,#sth-run-queue,.sth-undo,.sth-undo-group').forEach(button=>button.disabled=safeMode);
      if (!safeMode) dashboard.querySelectorAll('.sth-course').forEach(card=>card.sthUpdate?.());
    }

    async function refreshStatuses(showHealth) {
      const button=dashboard.querySelector(showHealth?'#sth-health':'#sth-refresh');
      const health=dashboard.querySelector('#sth-health-result');
      button.disabled=true; button.textContent=showHealth?'Scanning…':'Refreshing…';
      const issues=[], filenames=new Map();
      for (let i=0;i<courses.length;i++) {
        const course=courses[i];
        button.textContent=`${showHealth?'Scanning':'Refreshing'} ${i+1} of ${courses.length}…`;
        try {
          const inspection=await inspectOffering(course.nodeId,'');
          course.published=inspection.published;
          const badge=dashboard.querySelector(`tr[data-node="${course.nodeId}"] .sth-badge`);
          if (badge) { badge.textContent=course.published?'Published':'Draft'; badge.classList.toggle('sth-badge-published',course.published); }
          if (!inspection.currentFilename) issues.push(`${course.course} ${course.section}: no PDF`);
          if (!inspection.published) issues.push(`${course.course} ${course.section}: not published`);
          if (inspection.currentFilename) {
            if (!filenames.has(inspection.currentFilename)) filenames.set(inspection.currentFilename,[]);
            filenames.get(inspection.currentFilename).push(course);
          }
        } catch(error) { issues.push(`${course.course} ${course.section}: ${error.message}`); debugLog.push({time:new Date().toISOString(),type:'health',nodeId:course.nodeId,error:error.message}); }
      }
      filenames.forEach((matching,name)=>{
        const signatures=new Set(matching.map(c=>c.isVip?`vip|${c.section}`:`${c.prefix}|${c.baseNumber}`));
        if (signatures.size>1) issues.push(`${name}: used by unrelated course groups`);
      });
      groups.forEach(group=>refreshGroupStatus(group,group.card));
      const draftCount=courses.filter(c=>!c.published&&!excludedIds.has(c.nodeId)).length;
      const stat=dashboard.querySelector('.sth-stats .sth-stat:nth-child(3) strong'); if (stat) stat.textContent=draftCount;
      const checked=new Date().toLocaleString(); localStorage.setItem('sthLastChecked',checked); dashboard.querySelector('#sth-last-checked').textContent=`Last checked: ${checked}`;
      if (showHealth) { health.hidden=false; health.innerHTML=`<strong class="${issues.length?'sth-error':'sth-ok'}">${issues.length?`${issues.length} issue(s) found`:'No issues found'}</strong>${issues.length?`<ul>${issues.map(issue=>`<li>${escapeHtml(issue)}</li>`).join('')}</ul>`:''}`; }
      button.disabled=false; button.textContent=showHealth?'Run health scan':'Refresh status';
    }

    function activityCsv() {
      const quote=value=>`"${String(value??'').replaceAll('"','""')}"`;
      return ['timestamp,result,course,section,term,filename,message',...activityLog.map(row=>[row.timestamp,row.result,row.course,row.section,row.term,row.filename,row.message].map(quote).join(','))].join('\n');
    }

    function renderQueue() {
      const panel=dashboard.querySelector('#sth-queue');
      const batches=[...queue.values()];
      panel.hidden=!batches.length;
      dashboard.querySelector('#sth-queue-count').textContent=batches.length;
      dashboard.querySelector('#sth-queue-items').innerHTML=batches.map(b=>`<li><strong>${escapeHtml(b.group.term)} · ${escapeHtml(b.group.course)}</strong> — ${escapeHtml(b.pdf.name)} (${b.selected.length} offerings)</li>`).join('');
    }

    async function previewPdf(file) {
      if (!file) return;
      try { await renderPdf(file,'Selected PDF preview'); } catch { /* Error is shown in the viewer. */ }
    }

    async function renderPdf(blob, title) {
      const pages=pdfDialog.querySelector('.sth-pdf-pages');
      pages.innerHTML='<div class="sth-pdf-loading">Rendering PDF…</div>';
      pdfDialog.querySelector('header strong').textContent=title;
      if (!pdfDialog.open) pdfDialog.showModal();
      try {
        const pdfjs=globalThis.pdfjsLib || window.pdfjsLib;
        if (!pdfjs) throw new Error('The PDF viewer library did not load');
        pdfjs.GlobalWorkerOptions.workerSrc='https://cdnjs.cloudflare.com/ajax/libs/pdf.js/3.11.174/pdf.worker.min.js';
        const data=new Uint8Array(await blob.arrayBuffer());
        const documentTask=pdfjs.getDocument({data});
        const pdf=await documentTask.promise;
        pages.replaceChildren();
        for (let pageNumber=1;pageNumber<=pdf.numPages;pageNumber++) {
          const page=await pdf.getPage(pageNumber);
          const base=page.getViewport({scale:1});
          const available=Math.min(820,Math.max(320,pages.clientWidth-32));
          const viewport=page.getViewport({scale:Math.min(1.6,available/base.width)});
          const canvas=document.createElement('canvas');
          canvas.width=Math.ceil(viewport.width); canvas.height=Math.ceil(viewport.height);
          canvas.setAttribute('aria-label',`Page ${pageNumber} of ${pdf.numPages}`);
          pages.append(canvas);
          await page.render({canvasContext:canvas.getContext('2d'),viewport}).promise;
        }
      } catch(error) {
        pages.innerHTML=`<div class="sth-pdf-loading">Could not render PDF: ${escapeHtml(error.message)}</div>`;
        throw error;
      }
    }

    async function openOfferingPdf(offering, result, button) {
      const original=button.textContent; button.disabled=true; button.textContent='Loading PDF…';
      try {
        const doc=await getDocument(`/node/${offering.nodeId}/edit`);
        const link=doc.querySelector('.file--application-pdf a, a[type="application/pdf"]');
        if (!link) throw new Error('No PDF is currently uploaded for this offering');
        const response=await fetchWithTimeout(new URL(link.getAttribute('href'),location.origin),{credentials:'same-origin'});
        if (!response.ok) throw new Error(`Could not load PDF (${response.status})`);
        const downloaded=await response.blob();
        const pdfBlob=new Blob([downloaded],{type:'application/pdf'});
        await renderPdf(pdfBlob,`${offering.course} ${offering.section} · ${link.textContent.trim()}`);
      } catch(error) { result.innerHTML=`<strong class="sth-error">${escapeHtml(error.message)}</strong>`; }
      finally { button.disabled=false; button.textContent=original; }
    }

    async function executeBatches(batches, result, container, skipReview=false) {
      if (safeMode) { result.innerHTML='<strong class="sth-error">Safe mode is on.</strong>'; return []; }
      const jobs=batches.flatMap(batch=>batch.selected.map(offering=>({offering,pdf:batch.pdf,group:batch.group})));
      if (!jobs.length) return [];
      cancelRequested=false;
      const cancelButton=dashboard.querySelector('#sth-cancel'); cancelButton.hidden=false; cancelButton.disabled=false; cancelButton.textContent='Stop after current upload';
      if ('Notification' in window && Notification.permission==='default') Notification.requestPermission().catch(()=>{});
      const controls=[...container.querySelectorAll('input,button,select')];
      const priorStates=controls.map(control=>control.disabled);
      controls.forEach(control=>control.disabled=true);
      const unlock=()=>controls.forEach((control,index)=>control.disabled=priorStates[index]);
      container.classList.add('sth-working');
      result.innerHTML='<div class="sth-live-progress"><i class="sth-spinner" aria-hidden="true"></i><div><strong>Reviewing selected offerings…</strong><span>Checking current PDF information</span></div><b>0 / '+jobs.length+'</b><progress value="0" max="'+jobs.length+'"></progress></div>';
      const inspections=[];
      for (let i=0;i<jobs.length;i++) {
        if (cancelRequested) break;
        try { const inspection=await inspectOffering(jobs[i].offering.nodeId,jobs[i].pdf.name); inspections.push(inspection); jobs[i].expectedChanged=inspection.changed; }
        catch(error) { inspections.push({error:error.message}); }
        result.querySelector('b').textContent=`${i+1} / ${jobs.length}`;
      }
      if (cancelRequested) { container.classList.remove('sth-working'); cancelButton.hidden=true; cancelRequested=false; unlock(); result.textContent='Batch cancelled.'; return []; }
      const replacements=jobs.filter(j=>j.offering.published).length;
      const duplicates=inspections.filter(i=>i.sameFilename).length;
      const summary=batches.map(b=>`${b.group.term} · ${b.group.course}: ${b.selected.length} offering(s) ← ${b.pdf.name}`).join('\n');
      if (!skipReview && !confirm(`Review this batch:\n\n${summary}\n\n${jobs.length-replacements} draft(s) will be published.\n${replacements} existing PDF(s) will be replaced.${duplicates?`\n\nWarning: ${duplicates} selected offering(s) already use a file with the same name.`:''}`)) {
        container.classList.remove('sth-working'); cancelButton.hidden=true; cancelRequested=false; unlock(); result.textContent='Batch cancelled.'; return [];
      }

      result.innerHTML = `<div class="sth-live-progress"><i class="sth-spinner" aria-hidden="true"></i><div><strong class="sth-progress-title">Starting…</strong><span class="sth-progress-stage">Preparing the first offering</span></div><b class="sth-progress-count">0 / ${jobs.length}</b><progress value="0" max="${jobs.length}"></progress></div>`;
      const title=result.querySelector('.sth-progress-title'), stage=result.querySelector('.sth-progress-stage'), count=result.querySelector('.sth-progress-count'), bar=result.querySelector('progress');
      const successes=[], failures=[];
      for (let i=0;i<jobs.length;i++) {
        if (cancelRequested) break;
        const job=jobs[i], offering=job.offering;
        title.textContent=`Working on ${offering.course} ${offering.section}`;
        stage.textContent='Loading the syllabus form…'; count.textContent=`${i+1} / ${jobs.length}`;
        await nextPaint();
        try {
          await uploadAndPublish(offering.nodeId,job.pdf,(message)=>stage.textContent=message,job.expectedChanged); successes.push(job);
          activityLog.push({timestamp:new Date().toISOString(),result:'success',course:offering.course,section:offering.section,term:offering.term,filename:job.pdf.name,message:'Verified published'});
        } catch(error) {
          console.error('[Syllabus Helper]',offering,error); failures.push({...job,error});
          activityLog.push({timestamp:new Date().toISOString(),result:'failed',course:offering.course,section:offering.section,term:offering.term,filename:job.pdf.name,message:error.message});
          debugLog.push({time:new Date().toISOString(),type:'upload',nodeId:offering.nodeId,error:error.message});
        }
        bar.value=i+1; await nextPaint();
      }
      localStorage.setItem('sthActivityLog',JSON.stringify(activityLog.slice(-500)));
      successes.forEach(job=>{
        job.offering.published=true;
        const badge=dashboard.querySelector(`tr[data-node="${job.offering.nodeId}"] .sth-badge`);
        if (badge) { badge.textContent='Published'; badge.classList.add('sth-badge-published'); }
      });
      batches.forEach(batch=>refreshGroupStatus(batch.group,batch.card));
      container.classList.remove('sth-working');
      cancelButton.hidden=true; cancelRequested=false;
      unlock();
      const stopped=jobs.length-successes.length-failures.length;
      const undoGroups=[];
      successes.forEach(job=>{
        if (!backups.has(job.offering.nodeId)) return;
        let entry=undoGroups.find(item=>item.group.key===job.group.key);
        if (!entry) { entry={group:job.group,jobs:[]}; undoGroups.push(entry); }
        entry.jobs.push(job);
      });
      result.innerHTML=`<div class="sth-completion"><strong class="${failures.length?'sth-error':'sth-ok'}">${successes.length} of ${jobs.length} verified as published.${stopped?` ${stopped} skipped after cancellation.`:''}</strong><ul>${successes.map(j=>`<li><span>${escapeHtml(j.offering.course)} ${escapeHtml(j.offering.section)}</span><span><button class="sth-link-button sth-view-complete" data-node="${j.offering.nodeId}" type="button">View PDF</button><a href="${j.offering.view}">Original record</a>${backups.has(j.offering.nodeId)?` <button class="sth-row-remove sth-undo" data-node="${j.offering.nodeId}" type="button">Undo replacement</button>`:''}</span></li>`).join('')}${failures.map(j=>`<li><span class="sth-error">${escapeHtml(j.offering.course)} ${escapeHtml(j.offering.section)} — ${escapeHtml(j.error.message)}</span><a href="${j.offering.edit}">Advanced</a></li>`).join('')}</ul>${failures.length?'<button class="sth-button sth-retry" type="button">Retry failed offerings</button>':''}${undoGroups.length?`<div class="sth-undo-groups">${undoGroups.map((entry,index)=>`<button class="sth-button sth-button-secondary sth-undo-group" data-index="${index}" type="button">Undo all ${entry.jobs.length} replacement${entry.jobs.length===1?'':'s'} in ${escapeHtml(entry.group.course)}</button>`).join('')}</div>`:''}</div>`;
      result.querySelectorAll('.sth-view-complete').forEach(button=>button.addEventListener('click',()=>openOfferingPdf(courses.find(o=>o.nodeId===button.dataset.node),result,button)));
      result.querySelector('.sth-retry')?.addEventListener('click',()=>executeBatches(failures.map(j=>({group:j.group,selected:[j.offering],pdf:j.pdf})),result,container,true));
      result.querySelectorAll('.sth-undo').forEach(button=>button.addEventListener('click',async()=>{
        if (safeMode) return;
        const nodeId=button.dataset.node, backup=backups.get(nodeId), offering=courses.find(o=>o.nodeId===nodeId);
        if (!backup||!confirm(`Restore the previous PDF for ${offering.course} ${offering.section}?`)) return;
        button.disabled=true; button.textContent='Restoring…';
        try { await uploadAndPublish(nodeId,backup); button.textContent='Previous PDF restored'; backups.delete(nodeId); }
        catch(error) { button.disabled=false; button.textContent=`Undo failed: ${error.message}`; }
      }));
      result.querySelectorAll('.sth-undo-group').forEach(button=>button.addEventListener('click',async()=>{
        if (safeMode) return;
        const entry=undoGroups[Number(button.dataset.index)];
        const restorable=entry.jobs.filter(job=>backups.has(job.offering.nodeId));
        if (!restorable.length||!confirm(`Restore the previous PDF for all ${restorable.length} replaced offering${restorable.length===1?'':'s'} in ${entry.group.course}?`)) return;
        button.disabled=true;
        let restored=0; const undoFailures=[];
        for (let i=0;i<restorable.length;i++) {
          const job=restorable[i], backup=backups.get(job.offering.nodeId);
          button.textContent=`Restoring ${i+1} of ${restorable.length}…`;
          try {
            await uploadAndPublish(job.offering.nodeId,backup);
            backups.delete(job.offering.nodeId); restored++;
            result.querySelector(`.sth-undo[data-node="${job.offering.nodeId}"]`)?.remove();
            activityLog.push({timestamp:new Date().toISOString(),result:'undo',course:job.offering.course,section:job.offering.section,term:job.offering.term,filename:backup.name,message:'Previous PDF restored'});
          } catch(error) { undoFailures.push(`${job.offering.section}: ${error.message}`); }
        }
        localStorage.setItem('sthActivityLog',JSON.stringify(activityLog.slice(-500)));
        button.textContent=undoFailures.length?`${restored} restored · ${undoFailures.length} failed`:`All ${restored} previous PDFs restored`;
        if (undoFailures.length) { button.disabled=false; button.title=undoFailures.join(' | '); }
      }));
      const checked=new Date().toLocaleString(); localStorage.setItem('sthLastChecked',checked); dashboard.querySelector('#sth-last-checked').textContent=`Last checked: ${checked}`;
      if ('Notification' in window && Notification.permission==='granted') new Notification('Syllabus queue finished',{body:`${successes.length} published, ${failures.length} failed${stopped?`, ${stopped} skipped`:''}.`});
      return failures;
    }

    function refreshGroupStatus(group, card) {
      if (!card) return;
      const included=group.offerings.filter(o=>!excludedIds.has(o.nodeId));
      const drafts=included.filter(o=>!o.published);
      const published=included.length-drafts.length;
      const names=drafts.map(o=>`${o.course} ${o.section}`).join(', ');
      const summary=card.querySelector('.sth-course-summary > div:nth-child(2)');
      if (summary) summary.innerHTML=!group.confirmed
        ? '<span class="sth-needs-action">Needs group confirmation</span>'
        : drafts.length
        ? `<span class="sth-needs-action">${published?'Partially published':'Not published'} · ${escapeHtml(names)}</span>`
        : '<span class="sth-needs-action sth-all-published">All offerings published</span>';
      const existing=card.querySelector('.sth-publish-alert');
      if (!drafts.length) existing?.remove();
      else if (existing) existing.innerHTML=`<strong>${published?'This course is only partially published.':'This course has not been published.'}</strong><span>Still needing publication: ${escapeHtml(names)}</span>`;
    }
  }

  async function uploadAndPublish(nodeId, file, notify = () => {}, expectedChanged = null) {
    const editUrl = `/node/${nodeId}/edit`;
    notify('Loading the syllabus form…');
    let page = await getDocument(editUrl);
    let form = getEditForm(page);
    const actualChanged=form.querySelector('[name="changed"]')?.value || null;
    if (expectedChanged && actualChanged && expectedChanged!==actualChanged) throw new Error('This syllabus changed after the dashboard review; reload before replacing it');
    const existingRemove = form.querySelector('[data-drupal-selector="edit-field-upload-a-pdf-0-remove-button"]');

    if (existingRemove) {
      const oldLink=form.querySelector('.file--application-pdf a, a[type="application/pdf"]');
      if (oldLink && !backups.has(nodeId)) {
        notify('Backing up the currently published PDF…');
        const backupResponse=await fetchWithTimeout(new URL(oldLink.getAttribute('href'),location.origin),{credentials:'same-origin'});
        if (!backupResponse.ok) throw new Error('Could not back up the existing PDF; replacement stopped');
        const backupBlob=await backupResponse.blob();
        backups.set(nodeId,new File([backupBlob],oldLink.textContent.trim()||'previous-syllabus.pdf',{type:'application/pdf'}));
      }
      notify('Removing the currently published PDF…');
      const removalData = formDataFrom(form, existingRemove);
      page = await postForDocument(editUrl, removalData);
      form = getEditForm(page);
      if (!form.querySelector('input[type="file"][name^="files[field_upload_a_pdf"]')) {
        throw new Error('Could not remove existing PDF');
      }
    }

    const fileField = form.querySelector('input[type="file"][name^="files[field_upload_a_pdf"]');
    if (!fileField) throw new Error('PDF field not found');
    notify(`Uploading ${file.name}…`);
    const data = formDataFrom(form);
    data.set(fileField.name, file, file.name);
    const moderation = form.querySelector('[name="moderation_state[0][state]"]');
    if (moderation) data.set(moderation.name, 'published');
    data.set('op', 'Save');

    const response = await fetchWithTimeout(new URL(form.getAttribute('action') || editUrl, location.origin), {
      method: 'POST', body: data, credentials: 'same-origin', redirect: 'follow'
    });
    notify('Verifying the saved publication…');
    if (!response.ok) throw new Error(`Save failed (${response.status})`);
    const html = await response.text();
    const result = parseHtml(html);
    const errors = [...result.querySelectorAll('[role="alert"], .messages--error')]
      .map((node) => node.textContent.trim()).filter(Boolean);
    if (errors.length) throw new Error(errors[0].replace(/\s+/g, ' ').slice(0, 180));
    if (/\/edit\/?$/.test(new URL(response.url).pathname) && result.querySelector('#node-syllabus-edit-form')) {
      throw new Error('Site returned the edit form; check required fields');
    }
    notify('Confirming the PDF and publication status…');
    const verification=await getDocument(editUrl);
    const verificationForm=getEditForm(verification);
    const state=verificationForm.querySelector('#edit-moderation-state-0-current')?.textContent || '';
    const pdf=verificationForm.querySelector('.file--application-pdf a, a[type="application/pdf"]');
    if (!/published/i.test(state) || !pdf) throw new Error('Saved, but publication could not be verified');
  }

  async function inspectOffering(nodeId, selectedFilename) {
    const doc=await getDocument(`/node/${nodeId}/edit`);
    const form=getEditForm(doc);
    const link=form.querySelector('.file--application-pdf a, a[type="application/pdf"]');
    const currentFilename=link?.textContent.trim() || '';
    const changed=form.querySelector('[name="changed"]')?.value || null;
    const state=form.querySelector('#edit-moderation-state-0-current')?.textContent || '';
    return { currentFilename, changed, published:/published/i.test(state), sameFilename:Boolean(selectedFilename)&&currentFilename.toLowerCase()===selectedFilename.toLowerCase() };
  }

  async function getDocument(url) {
    const response = await fetchWithTimeout(url, { credentials: 'same-origin' });
    if (!response.ok) throw new Error(`Could not load edit page (${response.status})`);
    return parseHtml(await response.text());
  }

  async function postForDocument(url, data) {
    const response = await fetchWithTimeout(url, { method:'POST', body:data, credentials:'same-origin', redirect:'follow' });
    if (!response.ok) throw new Error(`Form action failed (${response.status})`);
    return parseHtml(await response.text());
  }

  function parseHtml(html) {
    return new DOMParser().parseFromString(html, 'text/html');
  }

  async function fetchWithTimeout(url, options={}, timeoutMs=60000) {
    const controller=new AbortController();
    const timer=setTimeout(()=>controller.abort(),timeoutMs);
    try { return await fetch(url,{...options,signal:controller.signal}); }
    catch(error) { if (error.name==='AbortError') throw new Error('The school site timed out after 60 seconds'); throw error; }
    finally { clearTimeout(timer); }
  }

  function getEditForm(doc) {
    const form = doc.querySelector('#node-syllabus-edit-form');
    if (!form) throw new Error('Edit form not found; your login may have expired');
    return form;
  }

  function formDataFrom(form, submitter = null) {
    const data = new FormData();
    form.querySelectorAll('input, select, textarea').forEach((control) => {
      if (!control.name || control.disabled || control.type === 'file' || control.type === 'button' || control.type === 'submit') return;
      if ((control.type === 'checkbox' || control.type === 'radio') && !control.checked) return;
      if (control.tagName === 'SELECT' && control.multiple) {
        [...control.selectedOptions].forEach((option) => data.append(control.name, option.value));
      } else data.append(control.name, control.value);
    });
    if (submitter?.name) data.set(submitter.name, submitter.value);
    return data;
  }

  function simplifyEditPage() {
    const form = document.querySelector('#node-syllabus-edit-form');
    const upload = document.querySelector('#edit-group-syllabus-upload');
    const moderation = document.querySelector('#edit-moderation-state-wrapper');
    const save = document.querySelector('#edit-submit');
    if (!form || !upload || !save || document.querySelector('#sth-edit-panel')) return;

    const currentState = document.querySelector('#edit-moderation-state-0-current')?.textContent.replace(/Current state/i, '').trim() || 'Unknown';
    const panel = document.createElement('section');
    panel.id = 'sth-edit-panel';
    panel.className = 'sth-panel sth-sticky';
    panel.innerHTML = `<h2>Update syllabus</h2><p>Current status: <span class="sth-badge ${/published/i.test(currentState) ? 'sth-badge-published' : ''}">${escapeHtml(currentState)}</span></p><div class="sth-edit-grid"><div class="sth-card" id="sth-upload-card"><h3>1. Syllabus PDF</h3></div><div class="sth-card" id="sth-publish-card"><h3>2. Save and publish</h3><p>The course details below remain unchanged.</p></div></div>`;
    // Keep the enhanced controls inside Drupal's original form. Moving them
    // outside it would make the browser omit the PDF and moderation fields.
    form.prepend(panel);
    panel.querySelector('#sth-upload-card').append(upload);
    if (moderation) panel.querySelector('#sth-publish-card').append(moderation);

    const actionButton = document.createElement('button');
    actionButton.type = 'button';
    actionButton.className = 'sth-button';
    actionButton.textContent = /published/i.test(currentState) ? 'Save changes' : 'Save and publish';
    actionButton.addEventListener('click', () => {
      const state = document.querySelector('#edit-moderation-state-0-state');
      if (state && [...state.options].some((o) => o.value === 'published')) state.value = 'published';
      save.click();
    });
    panel.querySelector('#sth-publish-card').append(actionButton);

    const remove = panel.querySelector('[data-drupal-selector="edit-field-upload-a-pdf-0-remove-button"]');
    if (remove) {
      remove.value = 'Remove current PDF';
      remove.classList.add('sth-button-danger');
      const warning = document.createElement('p');
      warning.className = 'sth-warning';
      warning.textContent = 'To replace a published PDF, remove it first. The upload control will then appear.';
      remove.before(warning);
    }

    const details = document.createElement('details');
    details.className = 'sth-more';
    details.innerHTML = '<summary>Show prefilled course details</summary>';
    const groups = [...form.querySelectorAll(':scope > fieldset')].filter((group) => group !== upload);
    groups.forEach((group) => details.append(group));
    const advanced = form.querySelector('#edit-advanced')?.closest('.form-item');
    if (advanced) details.append(advanced);
    panel.after(details);
    document.querySelector('#edit-actions')?.classList.add('sth-original-location');
  }

  function escapeHtml(value) {
    const node = document.createElement('span');
    node.textContent = value;
    return node.innerHTML;
  }

  function readStored(key, fallback) {
    try { return JSON.parse(localStorage.getItem(key)) ?? fallback; }
    catch { return fallback; }
  }

  function formatBytes(bytes) {
    if (bytes < 1024) return `${bytes} B`;
    if (bytes < 1048576) return `${(bytes/1024).toFixed(1)} KB`;
    return `${(bytes/1048576).toFixed(1)} MB`;
  }

  function downloadText(filename, contents, type='text/plain') {
    const url=URL.createObjectURL(new Blob([contents],{type}));
    const link=document.createElement('a');
    link.href=url; link.download=filename; link.click();
    setTimeout(()=>URL.revokeObjectURL(url),1000);
  }

  function isPastTerm(term) {
    const match=term.match(/^(Spring|Summer|Fall)\s+(\d{4})$/i);
    if (!match) return false;
    const endMonth={spring:4,summer:7,fall:11}[match[1].toLowerCase()];
    const end=new Date(Number(match[2]),endMonth+1,0,23,59,59);
    return Date.now()>end.getTime();
  }

  function termRank(term) {
    const match=term.match(/^(Spring|Summer|Fall)\s+(\d{4})$/i);
    if (!match) return 0;
    const season={spring:1,summer:2,fall:3}[match[1].toLowerCase()];
    return Number(match[2])*10+season;
  }

  function nextPaint() {
    return new Promise((resolve) => requestAnimationFrame(() => requestAnimationFrame(resolve)));
  }
})();
