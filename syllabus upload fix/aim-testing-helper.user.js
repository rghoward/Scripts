// ==UserScript==
// @name         GT ODS Testing Dashboard
// @namespace    https://github.com/local/gt-ods-testing-dashboard
// @version      2.0.0
// @description  A simpler, modern instructor dashboard for AIM Alternative Testing.
// @match        https://bear.accessiblelearning.com/GATech/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

(() => {
  'use strict';

  const page = location.pathname.split('/').pop().toLowerCase();
  if (!['testing.aspx', 'instructionadd.aspx', 'overview.aspx'].includes(page)) return;

  const $ = (selector, root = document) => root.querySelector(selector);
  const $$ = (selector, root = document) => [...root.querySelectorAll(selector)];
  const clean = value => (value || '').replace(/\s+/g, ' ').trim();
  const main = $('main') || $('#content') || document.body;
  const title = clean($('h1')?.textContent || document.title);
  const qs = new URLSearchParams(location.search);
  const step = qs.get('Step') || '';
  const originalKey = 'gt-ods-show-original';

  document.documentElement.classList.add('odsx');
  document.body.classList.add('odsx-enhanced');

  const css = document.createElement('style');
  css.textContent = `
    :root{--ox-bg:#f5f7fb;--ox-card:#fff;--ox-text:#172033;--ox-muted:#647087;--ox-line:#dce2ec;--ox-blue:#3157d5;--ox-blue2:#2445b7;--ox-red:#b42318;--ox-amber:#b54708;--ox-green:#067647;--ox-shadow:0 10px 30px rgba(25,38,70,.08);color-scheme:light dark}
    @media(prefers-color-scheme:dark){:root{--ox-bg:#101521;--ox-card:#1a2130;--ox-text:#eef2fa;--ox-muted:#a9b4c8;--ox-line:#354055;--ox-blue:#91a7ff;--ox-blue2:#b4c2ff;--ox-red:#ff9b91;--ox-amber:#fdbb74;--ox-green:#75d6aa;--ox-shadow:0 12px 35px rgba(0,0,0,.28)}}
    .odsx body{background:var(--ox-bg)!important;color:var(--ox-text)!important;font:15px/1.5 -apple-system,BlinkMacSystemFont,"Segoe UI",sans-serif!important;margin:0!important}
    .odsx *{box-sizing:border-box}.odsx a{color:var(--ox-blue)}
    #odsx-top{position:sticky;top:0;z-index:10000;background:color-mix(in srgb,var(--ox-card) 94%,transparent);border-bottom:1px solid var(--ox-line);backdrop-filter:blur(15px);box-shadow:0 3px 16px rgba(20,30,55,.06)}
    .odsx-top-inner{max-width:1280px;margin:auto;padding:12px 22px 0;display:flex;align-items:center;gap:24px;flex-wrap:wrap}.odsx-brand{font-size:17px;font-weight:750;white-space:nowrap}.odsx-brand small{display:block;color:var(--ox-muted);font-size:11px;font-weight:600;letter-spacing:.04em;text-transform:uppercase}
    .odsx-nav{display:flex;gap:5px;align-self:flex-end;overflow:auto}.odsx-nav a{padding:11px 13px;text-decoration:none;color:var(--ox-muted);font-weight:650;border-bottom:3px solid transparent;white-space:nowrap}.odsx-nav a:hover,.odsx-nav a.active{color:var(--ox-blue);border-color:var(--ox-blue)}
    .odsx-tools{margin-left:auto;display:flex;gap:8px;padding-bottom:10px}.odsx-btn,.odsx button:not(.instruction){appearance:none;border:1px solid var(--ox-line)!important;border-radius:9px!important;background:var(--ox-card)!important;color:var(--ox-text)!important;padding:9px 13px!important;font:650 14px/1.2 inherit!important;cursor:pointer!important;min-height:38px}.odsx-btn:hover,.odsx button:not(.instruction):hover{border-color:var(--ox-blue)!important}.odsx .odsx-primary,.odsx button.submit{background:var(--ox-blue)!important;border-color:var(--ox-blue)!important;color:#fff!important}.odsx button.submit:hover{background:var(--ox-blue2)!important}
    .odsx #main{display:block!important;width:100%!important;max-width:none!important;margin:0!important;padding:0!important}.odsx main,.odsx #content{display:block!important;max-width:1180px!important;width:calc(100% - 44px)!important;margin:0 auto!important;padding:28px 0 120px!important;float:none!important;position:static!important}.odsx #content_main{width:100%!important;max-width:none!important;margin:0!important;float:none!important}.odsx main>h1{font-size:30px!important;margin:0 0 8px!important}.odsx-subtitle{color:var(--ox-muted);margin:0 0 24px}
    .odsx .container>header,.odsx #wrapper>header,.odsx #nav_submenu,.odsx #menu,.odsx .menu,.odsx #breadcrumbs,.odsx .breadcrumb,.odsx footer,.odsx #contact_info,.odsx .skip_links{display:none!important}
    .odsx .panel,.odsx .standard,.odsx fieldset,.odsx .item-inner{background:var(--ox-card)!important;color:var(--ox-text)!important;border:1px solid var(--ox-line)!important;border-radius:12px!important;box-shadow:none!important}.odsx .panel{margin:16px 0!important;padding:18px!important}.odsx .panel .header{background:none!important;padding:0!important}.odsx .panel .body{padding:10px 0 0!important}.odsx h2,.odsx h3,.odsx legend{color:var(--ox-text)!important}.odsx h3.highlighted{background:none!important;border:0!important;padding:20px 0 4px!important;font-size:18px!important}
    .odsx input[type=text],.odsx input[type=email],.odsx input[type=number],.odsx input[type=time],.odsx textarea,.odsx select{width:100%!important;max-width:720px!important;background:var(--ox-card)!important;color:var(--ox-text)!important;border:1px solid var(--ox-line)!important;border-radius:8px!important;padding:10px 11px!important;min-height:42px!important;font:inherit!important}.odsx textarea{min-height:90px!important}.odsx input:focus,.odsx select:focus,.odsx textarea:focus{outline:3px solid color-mix(in srgb,var(--ox-blue) 22%,transparent)!important;border-color:var(--ox-blue)!important}
    .odsx .form,.odsx .form.oneline{height:auto!important;position:static!important;background:none!important;border:0!important}.odsx .form fieldset{position:static!important;width:auto!important;height:auto!important;margin:14px 0!important;padding:18px!important}.odsx .form .tl{margin:14px 0!important;width:auto!important;position:static!important}.odsx legend{font-weight:750!important;padding:0 7px!important}.odsx label{color:var(--ox-text)!important;font-weight:650!important}.odsx .instruction_content,.odsx .description{color:var(--ox-muted)!important}
    .odsx table.gv{width:100%!important;min-width:0!important;border:0!important;border-collapse:separate!important;border-spacing:0 7px!important;table-layout:auto!important}.odsx table.gv thead th{background:none!important;color:var(--ox-muted)!important;border:0!important;padding:7px!important;font-size:12px!important;text-transform:uppercase!important;letter-spacing:.04em!important}.odsx table.gv tbody tr{background:var(--ox-card)!important;box-shadow:0 0 0 1px var(--ox-line);border-radius:9px}.odsx table.gv td{border:0!important;padding:11px 7px!important;color:var(--ox-text)!important}.odsx table.gv tbody tr:has(input[type=checkbox]:checked){box-shadow:0 0 0 2px var(--ox-blue);background:color-mix(in srgb,var(--ox-blue) 7%,var(--ox-card))!important}.odsx .floatThead-container{display:none!important}.odsx .doubleScroll-scroll-wrapper{display:none!important}
    .odsx-dashboard{display:grid;grid-template-columns:repeat(4,minmax(150px,1fr));gap:12px;margin:22px 0}.odsx-stat{display:block;text-decoration:none;background:var(--ox-card);border:1px solid var(--ox-line);border-radius:12px;padding:17px;color:var(--ox-text)!important}.odsx-stat strong{display:block;font-size:24px}.odsx-stat span{color:var(--ox-muted)}
    .odsx-dashboard-mode #content{display:none!important}.odsx-dashboard-mode #odsx-app{display:block}.odsx-app{max-width:1180px;margin:0 auto;padding:34px 22px 130px}.odsx-app-head{display:flex;justify-content:space-between;align-items:end;gap:20px;margin-bottom:25px}.odsx-app-head h1{font-size:32px;margin:0 0 4px}.odsx-app-head p{margin:0;color:var(--ox-muted)}.odsx-term{background:var(--ox-card);border:1px solid var(--ox-line);border-radius:999px;padding:8px 13px;font-weight:700;white-space:nowrap}.odsx-section{margin:30px 0}.odsx-section-head{display:flex;align-items:center;justify-content:space-between;gap:16px;margin-bottom:12px}.odsx-section-head h2{font-size:20px;margin:0}.odsx-grid{display:grid;grid-template-columns:repeat(2,minmax(0,1fr));gap:13px}.odsx-card{background:var(--ox-card);border:1px solid var(--ox-line);border-radius:13px;padding:17px;box-shadow:var(--ox-shadow)}.odsx-card-top{display:flex;align-items:start;justify-content:space-between;gap:12px}.odsx-card h3{margin:0;font-size:18px}.odsx-card p{color:var(--ox-muted);margin:5px 0}.odsx-meta{display:flex;gap:8px;flex-wrap:wrap;margin:12px 0}.odsx-pill{background:var(--ox-bg);border:1px solid var(--ox-line);border-radius:999px;padding:4px 9px;font-size:12px;color:var(--ox-muted)}.odsx-pill.bad{background:color-mix(in srgb,var(--ox-red) 10%,var(--ox-card));border-color:color-mix(in srgb,var(--ox-red) 35%,var(--ox-line));color:var(--ox-red);font-weight:700}.odsx-pill.good{color:var(--ox-green)}.odsx-actions{display:flex;gap:8px;align-items:center;flex-wrap:wrap;margin-top:14px}.odsx-actions a{display:inline-flex}.odsx-native-check{width:22px;height:22px;accent-color:var(--ox-blue)}.odsx-empty{padding:30px;text-align:center;background:var(--ox-card);border:1px dashed var(--ox-line);border-radius:12px;color:var(--ox-muted)}.odsx-services{display:flex;gap:8px;flex-wrap:wrap;margin:0 0 25px}.odsx-services a{text-decoration:none}.odsx-card details{margin-top:12px}.odsx-card summary{cursor:pointer;font-weight:650}.odsx-card ul{padding-left:20px}.odsx-inline-upload{position:sticky;bottom:15px;z-index:8000;margin-top:22px;background:var(--ox-card);border:1px solid var(--ox-line);border-radius:14px;box-shadow:var(--ox-shadow);padding:14px;display:grid;grid-template-columns:minmax(150px,1fr) minmax(260px,2fr) auto;gap:12px;align-items:center}.odsx-inline-upload .odsx-drop{min-height:54px}.odsx-inline-upload input[type=text]{max-width:none!important}
    .odsx-show-original .odsx-dashboard-mode #content{display:revert!important}.odsx-show-original .odsx-dashboard-mode #odsx-app{display:none!important}
    .odsx-upload-dock{position:fixed;z-index:9999;left:50%;bottom:18px;transform:translateX(-50%);width:min(930px,calc(100% - 30px));background:var(--ox-card);border:1px solid var(--ox-line);border-radius:14px;box-shadow:var(--ox-shadow);padding:13px;display:flex;align-items:center;gap:12px}.odsx-upload-dock[hidden]{display:none}.odsx-upload-info{min-width:170px}.odsx-upload-info strong{display:block}.odsx-upload-info span{color:var(--ox-muted);font-size:13px}.odsx-drop{flex:1;border:2px dashed var(--ox-line);border-radius:10px;padding:11px 15px;text-align:center;cursor:pointer;color:var(--ox-muted);min-height:48px}.odsx-drop.drag{border-color:var(--ox-blue);background:color-mix(in srgb,var(--ox-blue) 8%,var(--ox-card));color:var(--ox-blue)}.odsx-drop.has-file{border-style:solid;border-color:var(--ox-green);color:var(--ox-green)}
    .odsx-status{position:fixed;z-index:20000;inset:0;background:rgba(10,15,25,.45);display:grid;place-items:center}.odsx-status[hidden]{display:none}.odsx-status-card{background:var(--ox-card);border-radius:14px;padding:24px;box-shadow:var(--ox-shadow);width:min(420px,calc(100% - 30px));text-align:center}.odsx-status-card button{margin-top:8px}.odsx-spinner{width:30px;height:30px;border:3px solid var(--ox-line);border-top-color:var(--ox-blue);border-radius:50%;animation:odsx-spin .8s linear infinite;margin:0 auto 12px}@keyframes odsx-spin{to{transform:rotate(360deg)}}
    .odsx-toast{position:fixed;top:80px;right:20px;z-index:30000;background:var(--ox-card);border:1px solid var(--ox-line);border-left:4px solid var(--ox-blue);border-radius:9px;padding:12px 15px;box-shadow:var(--ox-shadow);max-width:360px}.odsx-toast.error{border-left-color:var(--ox-red)}
    .odsx-choice-grid{display:grid;grid-template-columns:repeat(2,minmax(190px,1fr));gap:10px;margin:12px 0}.odsx-choice{border:1px solid var(--ox-line);border-radius:10px;padding:15px;cursor:pointer;background:var(--ox-card)}.odsx-choice:hover,.odsx-choice.selected{border-color:var(--ox-blue);box-shadow:inset 0 0 0 1px var(--ox-blue)}.odsx-choice strong{display:block}.odsx-choice small{color:var(--ox-muted)}
    .odsx-agreement-progress{display:flex;gap:6px;margin:15px 0 24px}.odsx-agreement-progress span{flex:1;background:var(--ox-line);height:6px;border-radius:5px}.odsx-agreement-progress span.done{background:var(--ox-blue)}
    .odsx-original-note{background:#fff4e5;color:#7a2e0e;border:1px solid #f5c77e;border-radius:9px;padding:10px 14px;margin:10px auto;max-width:1180px}.odsx-show-original #main,.odsx-show-original main,.odsx-show-original #content,.odsx-show-original #content_main{all:revert!important}.odsx-show-original .container>header,.odsx-show-original #wrapper>header,.odsx-show-original #nav_submenu,.odsx-show-original #menu,.odsx-show-original .menu,.odsx-show-original #breadcrumbs,.odsx-show-original .breadcrumb,.odsx-show-original footer{display:revert!important}.odsx-show-original #odsx-top{position:relative}
    @media(max-width:800px){.odsx-dashboard{grid-template-columns:repeat(2,1fr)}.odsx-grid{grid-template-columns:1fr}.odsx-inline-upload{grid-template-columns:1fr}.odsx-app-head{align-items:start;flex-direction:column}.odsx-top-inner{gap:8px}.odsx-tools{margin-left:0}.odsx-upload-dock{align-items:stretch;flex-direction:column}.odsx-choice-grid{grid-template-columns:1fr}.odsx table.gv{display:block;overflow:auto}.odsx-nav a{padding:9px}}
  `;
  document.head.append(css);

  function toast(message, error = false) {
    $('.odsx-toast')?.remove();
    const el = document.createElement('div');
    el.className = `odsx-toast${error ? ' error' : ''}`;
    el.textContent = message;
    document.body.append(el);
    setTimeout(() => el.remove(), 4200);
  }

  function nav() {
    const active = step.toLowerCase() || (page === 'testing.aspx' ? 'exams' : '');
    const bar = document.createElement('header');
    bar.id = 'odsx-top';
    bar.innerHTML = `<div class="odsx-top-inner">
      <div class="odsx-brand">Alternative Testing<small>Instructor dashboard</small></div>
      <nav class="odsx-nav" aria-label="Testing dashboard">
        <a href="Testing.aspx?Step=Exams" data-key="exams">Upcoming & Upload</a>
        <a href="Testing.aspx?Step=Instruction" data-key="instruction">Agreements</a>
        <a href="Testing.aspx?Step=Dates" data-key="dates">Exam Dates</a>
        <a href="Testing.aspx?Step=Completed" data-key="completed">Completed Files</a>
      </nav>
      <div class="odsx-tools"><a class="odsx-btn" href="Overview.aspx">Instructor home</a><button type="button" id="odsx-original">View original</button></div>
    </div>`;
    document.body.prepend(bar);
    $(`.odsx-nav [data-key="${active}"]`)?.classList.add('active');
    $('#odsx-original').addEventListener('click', () => {
      const on = !document.documentElement.classList.contains('odsx-show-original');
      document.documentElement.classList.toggle('odsx-show-original', on);
      localStorage.setItem(originalKey, on ? '1' : '0');
      $('#odsx-original').textContent = on ? 'Back to dashboard' : 'View original';
      toast(on ? 'Original AIM layout shown.' : 'Dashboard restored.');
    });
    if (localStorage.getItem(originalKey) === '1') $('#odsx-original').click();
  }

  function subtitle() {
    const descriptions = {
      'Upcoming Exams': 'Select an upcoming exam, attach its file, and see exactly who will receive it.',
      'Alternative Testing Agreement': 'Set up how ODS should administer exams for each course.',
      'Exam Dates': 'Manage scheduled assessments and upload one file to an entire exam date.',
      'Completed Files': 'Review completed exam files and prior activity.',
      'Alternative Testing Agreement - Details': 'Complete the course rules once, review them, then add all exam dates.'
    };
    const h1 = $('main h1, #content h1');
    if (h1 && descriptions[title]) h1.insertAdjacentHTML('afterend', `<p class="odsx-subtitle">${descriptions[title]}</p>`);
  }

  function dashboard() {
    if (page !== 'testing.aspx') return;
    const numbers = $$('.display.number .value').map(x => clean(x.textContent));
    const missingAgreements = $$('a[href*="Plan=NotSpecified"]').length ? clean($('a[href*="Plan=NotSpecified"]')?.closest('.item')?.querySelector('.value')?.textContent) : '—';
    const upcomingRows = $$('#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_GV tbody tr').length;
    const datesRows = $$('#ctl00_ctl00_ctl00_MainContent_MainContent_MainContent_GVED tbody tr').length;
    const box = document.createElement('section');
    box.className = 'odsx-dashboard';
    box.innerHTML = `
      <a class="odsx-stat" href="Testing.aspx?Step=Exams#Upcoming"><strong>${upcomingRows || numbers[0] || '0'}</strong><span>Upcoming exams</span></a>
      <a class="odsx-stat" href="Testing.aspx?Step=Exams#Upcoming"><strong>${numbers.find((_,i)=>i===2) || '—'}</strong><span>Files needed</span></a>
      <a class="odsx-stat" href="Testing.aspx?Step=Instruction"><strong>${missingAgreements}</strong><span>Agreements needed</span></a>
      <a class="odsx-stat" href="Testing.aspx?Step=Dates#List"><strong>${datesRows || '—'}</strong><span>Scheduled exam dates</span></a>`;
    const anchor = $('main h1, #content h1');
    anchor?.parentNode.insertBefore(box, anchor.nextElementSibling?.nextSibling || anchor.nextSibling);
  }

  function simplifySearch() {
    $$('.refine').forEach(block => {
      if (block.closest('details')) return;
      const details = document.createElement('details');
      const summary = document.createElement('summary');
      summary.textContent = 'Search and filters';
      summary.className = 'odsx-btn';
      block.parentNode.insertBefore(details, block);
      details.append(summary, block);
    });
  }

  function rowDescription(row) {
    const cells = $$('td', row).map(td => clean(td.textContent));
    if (row.closest('table')?.id?.includes('GVED')) return `${cells[5] || ''} ${cells[6] || ''}.${cells[7] || ''} · ${cells[8] || 'Exam'} · ${cells[9] || ''}`;
    return clean($('td.chkbox label', row)?.textContent) || cells.filter(Boolean).slice(1, 7).join(' · ');
  }

  function uploadDock() {
    const file = $('input[type=file]');
    const directButton = $('[id$="GFormUpload_BtnUpload"]');
    const dateButton = $('[id$="BtnUploadED"]');
    const table = directButton ? $('table[id$="_GV"]') : dateButton ? $('table[id$="_GVED"]') : null;
    if (!table || (!directButton && !dateButton)) return;

    const checks = $$('tbody input[type=checkbox]', table);
    const dock = document.createElement('section');
    dock.className = 'odsx-upload-dock';
    dock.innerHTML = `<div class="odsx-upload-info"><strong>Upload exam</strong><span id="odsx-selection">Select an exam above</span></div>
      ${directButton ? '<div class="odsx-drop" tabindex="0" role="button">Drop a file here or click to browse</div>' : '<div class="odsx-drop">Select dates, then continue to attach the file</div>'}
      <button type="button" class="odsx-primary" id="odsx-upload" disabled>${directButton ? 'Review upload' : 'Continue'}</button>`;
    document.body.append(dock);
    const selection = $('#odsx-selection');
    const action = $('#odsx-upload');
    const drop = $('.odsx-drop', dock);

    function update() {
      const chosen = checks.filter(c => c.checked);
      selection.textContent = chosen.length ? `${chosen.length} selected: ${chosen.slice(0,2).map(c => rowDescription(c.closest('tr'))).join('; ')}${chosen.length > 2 ? ` +${chosen.length - 2} more` : ''}` : 'Select an exam above';
      action.disabled = !chosen.length || (directButton && !file?.files?.length);
    }
    checks.forEach(c => c.addEventListener('change', update));
    $$('thead input[type=checkbox]', table).forEach(c => c.addEventListener('change', () => setTimeout(update)));

    if (directButton && file) {
      file.closest('.tl')?.classList.add('odsx-native-file');
      const useFiles = files => {
        const picked = files?.[0];
        if (!picked) return;
        if (picked.size > 30000000) return toast('That file is larger than the site’s 30 MB limit.', true);
        try {
          const transfer = new DataTransfer(); transfer.items.add(picked); file.files = transfer.files;
        } catch { return toast('Please use the file picker for this browser.', true); }
        file.dispatchEvent(new Event('change', {bubbles:true}));
        drop.classList.add('has-file');
        drop.textContent = `${picked.name} · ${(picked.size / 1048576).toFixed(1)} MB`;
        update();
      };
      drop.addEventListener('click', () => file.click());
      drop.addEventListener('keydown', e => { if (e.key === 'Enter' || e.key === ' ') file.click(); });
      file.addEventListener('change', () => {
        const picked = file.files[0];
        if (picked) { drop.classList.add('has-file'); drop.textContent = `${picked.name} · ${(picked.size / 1048576).toFixed(1)} MB`; }
        update();
      });
      ['dragenter','dragover'].forEach(name => drop.addEventListener(name, e => {e.preventDefault();drop.classList.add('drag');}));
      ['dragleave','drop'].forEach(name => drop.addEventListener(name, e => {e.preventDefault();drop.classList.remove('drag');}));
      drop.addEventListener('drop', e => useFiles(e.dataTransfer.files));
    }

    action.addEventListener('click', () => {
      const chosen = checks.filter(c => c.checked);
      const names = chosen.map(c => rowDescription(c.closest('tr')));
      const fileName = file?.files?.[0]?.name;
      const prompt = directButton
        ? `Upload “${fileName}” to ${chosen.length} selected exam${chosen.length === 1 ? '' : 's'}?\n\n${names.slice(0,6).join('\n')}${names.length > 6 ? `\n…and ${names.length - 6} more` : ''}`
        : `Continue with ${chosen.length} exam date${chosen.length === 1 ? '' : 's'} to attach a file?\n\n${names.slice(0,6).join('\n')}`;
      if (!confirm(prompt)) return;
      showWorking(directButton ? `Uploading ${fileName} to ${chosen.length} exam${chosen.length === 1 ? '' : 's'}…` : 'Opening the upload form for the selected exam dates…');
      (directButton || dateButton).click();
    });
    update();
  }

  function genericFileDrop() {
    if ($('.odsx-upload-dock')) return;
    const file = $('input[type=file]');
    const submit = $$('button.submit').find(b => /upload/i.test(clean(b.textContent)));
    if (!file || !submit) return;
    const dock = document.createElement('section');
    dock.className = 'odsx-upload-dock';
    dock.innerHTML = `<div class="odsx-upload-info"><strong>Attach exam file</strong><span>Maximum 30 MB</span></div><div class="odsx-drop" tabindex="0">Drop a file here or click to browse</div><button type="button" class="odsx-primary" disabled>Upload file</button>`;
    document.body.append(dock);
    const drop = $('.odsx-drop', dock), action = $('button', dock);
    const update = () => { const f=file.files[0]; action.disabled=!f; if(f){drop.classList.add('has-file');drop.textContent=`${f.name} · ${(f.size/1048576).toFixed(1)} MB`;} };
    drop.onclick=()=>file.click(); file.addEventListener('change',update);
    drop.ondragover=e=>{e.preventDefault();drop.classList.add('drag')};
    drop.ondragleave=()=>drop.classList.remove('drag');
    drop.ondrop=e=>{e.preventDefault();drop.classList.remove('drag');const f=e.dataTransfer.files[0];if(!f)return;if(f.size>30000000)return toast('That file is larger than 30 MB.',true);const d=new DataTransfer();d.items.add(f);file.files=d.files;file.dispatchEvent(new Event('change',{bubbles:true}));};
    action.onclick=()=>{const f=file.files[0];if(confirm(`Upload “${f.name}”?`)){showWorking(`Uploading ${f.name}…`);submit.click();}};
  }

  function showWorking(message) {
    let overlay = $('.odsx-status');
    if (!overlay) {
      overlay = document.createElement('div'); overlay.className = 'odsx-status';
      overlay.innerHTML = '<div class="odsx-status-card"><div class="odsx-spinner"></div><strong></strong><p>Please keep this page open.</p><button type="button">Hide status</button></div>';
      document.body.append(overlay);
      $('button', overlay).addEventListener('click', () => { overlay.hidden = true; });
    }
    $('strong', overlay).textContent = message; overlay.hidden = false;
  }

  function agreementChoice() {
    const select = $('[id$="DDLOption_DDLInput"]');
    const confirmSelect = $$('select').find(s => clean(s.closest('.tl')?.textContent).startsWith('Confirm Task'));
    const submit = $('[id$="BtnStep1"]');
    if (!select || !submit) return;
    const grid = document.createElement('div'); grid.className = 'odsx-choice-grid';
    const help = {
      '0':'ODS administers accommodated exams using the agreement you provide.',
      '1':'Students cannot schedule these exams through ODS.',
      '2':'No exam scheduling or files are needed.',
      '3':'Students complete exams outside an ODS testing room.'
    };
    [...select.options].filter(o => o.value !== '').forEach(option => {
      const card = document.createElement('button'); card.type='button'; card.className='odsx-choice';
      card.innerHTML=`<strong>${option.textContent}</strong><small>${help[option.value] || ''}</small>`;
      card.onclick=()=>{select.value=option.value;select.dispatchEvent(new Event('change',{bubbles:true}));$$('.odsx-choice',grid).forEach(x=>x.classList.remove('selected'));card.classList.add('selected');if(confirmSelect){confirmSelect.value='1';confirmSelect.dispatchEvent(new Event('change',{bubbles:true}));}};
      grid.append(card);
    });
    select.closest('.tl').insertAdjacentElement('afterend',grid);
    select.closest('.tl').hidden=true; if(confirmSelect) confirmSelect.closest('.tl').hidden=true;
    $('span',submit).textContent='Continue to agreement';
    submit.addEventListener('click',()=>showWorking('Saving your selection and opening the agreement…'));
  }

  function agreementDetails() {
    if (!/details/i.test(title)) return;
    const form = $('[id*="PnlInstruction_GForm"]'); if (!form) return;
    const progress = document.createElement('div'); progress.className='odsx-agreement-progress'; progress.setAttribute('aria-label','Agreement progress'); progress.innerHTML='<span class="done"></span><span class="done"></span><span></span><span></span>';
    form.parentNode.insertBefore(progress,form);
    $$('.qa',form).forEach((qa,i)=>{const fieldset=qa.closest('fieldset')||qa.parentElement;fieldset?.setAttribute('data-question',String(i+1));});
    $$('button.submit',form).forEach(button=>button.addEventListener('click',()=>showWorking('Saving the agreement and continuing to exam dates…')));
  }

  function cellMap(table, row) {
    const heads = $$('thead th', table).map(th => clean(th.textContent));
    const cells = $$(':scope > td', row);
    return Object.fromEntries(heads.map((head, i) => [head, {text: clean(cells[i]?.textContent), node: cells[i]}]));
  }

  function appShell(heading, description) {
    document.body.classList.add('odsx-dashboard-mode');
    const app = document.createElement('main');
    app.id = 'odsx-app'; app.className = 'odsx-app';
    const term = clean($('[id$="TermNav"] strong')?.textContent).replace(/^Term:\s*/i, '') || 'Current term';
    app.innerHTML = `<header class="odsx-app-head"><div><h1>${heading}</h1><p>${description}</p></div><div class="odsx-term">${term}</div></header>`;
    $('#odsx-top').after(app);
    return app;
  }

  function section(app, heading, action = '') {
    const el = document.createElement('section'); el.className = 'odsx-section';
    el.innerHTML = `<div class="odsx-section-head"><h2>${heading}</h2>${action}</div><div class="odsx-grid"></div>`;
    app.append(el); return $('.odsx-grid', el);
  }

  function buttonLink(link, label, primary = false) {
    if (!link) return '';
    return `<a class="odsx-btn${primary ? ' odsx-primary' : ''}" href="${link.getAttribute('href')}">${label}</a>`;
  }

  function buildOverviewDashboard() {
    const app = appShell('Instructor dashboard', 'Your current accommodation requests and teaching tools in one place.');
    const services = document.createElement('nav'); services.className = 'odsx-services'; services.setAttribute('aria-label','Instructor services');
    const wanted = ['Upload Syllabus','Alternative Formats','Alternative Testing','Communication Access','Notetaking Services'];
    $$('a', $('#nav_submenu')).filter(a => wanted.includes(clean(a.textContent))).forEach(a => {
      const copy = a.cloneNode(true); copy.className='odsx-btn'; services.append(copy);
    });
    app.append(services);

    const table = $('table.gv');
    const rows = table ? $$('tbody > tr', table) : [];
    const stats = document.createElement('div'); stats.className='odsx-dashboard';
    stats.innerHTML=`<a class="odsx-stat" href="Testing.aspx?Step=Exams"><strong>Upload</strong><span>Exam files</span></a><a class="odsx-stat" href="Testing.aspx?Step=Instruction"><strong>Set up</strong><span>Testing agreements</span></a><div class="odsx-stat"><strong>${rows.length}</strong><span>Accommodation request${rows.length===1?'':'s'}</span></div><a class="odsx-stat" href="Testing.aspx?Step=Dates"><strong>Manage</strong><span>Exam dates</span></a>`;
    app.append(stats);
    const grid = section(app, 'Students requesting accommodations');
    if (!rows.length) grid.outerHTML='<div class="odsx-empty">No accommodation requests are shown for this term.</div>';
    rows.forEach(row => {
      const data=cellMap(table,row), vals=Object.values(data).map(v=>v.text);
      const name=data['Full Name']?.text || data['Student']?.text || vals.find(v=>/\s/.test(v)&&!/^\d/.test(v)) || 'Student request';
      const course=[data.Subject?.text,data.Course?.text,data.Section?.text].filter(Boolean).join(' ') || vals.slice(0,3).join(' ');
      const action=$$('a',row).find(a=>!/mailto:/i.test(a.href));
      const card=document.createElement('article');card.className='odsx-card';
      card.innerHTML=`<div class="odsx-card-top"><div><h3>${name}</h3><p>${course}</p></div><span class="odsx-pill">Request</span></div><div class="odsx-meta">${vals.filter(Boolean).slice(0,6).map(v=>`<span class="odsx-pill">${v}</span>`).join('')}</div><div class="odsx-actions">${buttonLink(action,'View request',true)}</div>`;
      grid.append(card);
    });
    return true;
  }

  function uploadPanel(app, table, rows, nativeButton) {
    const file=$('input[type=file]'); if(!file || !nativeButton) return;
    const note=$('[id$="TxtBoxUploadTitle_TxtBoxInput"]');
    const panel=document.createElement('section');panel.className='odsx-inline-upload';
    panel.innerHTML=`<div><strong id="odsx-count">Select exams above</strong><div class="odsx-subtitle">One file, exactly where you choose</div></div><div class="odsx-drop" tabindex="0" role="button">Drop exam file here or click to browse</div><button class="odsx-primary" type="button" disabled>Review upload</button>`;
    app.append(panel); const drop=$('.odsx-drop',panel), action=$('button',panel), count=$('#odsx-count',panel);
    if(note){note.placeholder='Optional file note';panel.insertBefore(note,drop);}
    const checks=rows.map(r=>$('input[type=checkbox]',r)).filter(Boolean);
    const update=()=>{const selected=checks.filter(c=>c.checked);count.textContent=selected.length?`${selected.length} exam${selected.length===1?'':'s'} selected`:'Select exams above';action.disabled=!selected.length||!file.files.length;};
    checks.forEach(c=>c.addEventListener('change',update));
    const renderFile=f=>{if(!f)return;drop.classList.add('has-file');drop.textContent=`${f.name} · ${(f.size/1048576).toFixed(1)} MB`;update();};
    const setFile=f=>{if(!f)return;if(f.size>30000000)return toast('That file exceeds AIM’s 30 MB limit.',true);const d=new DataTransfer();d.items.add(f);file.files=d.files;file.dispatchEvent(new Event('change',{bubbles:true}));};
    drop.onclick=()=>file.click();drop.onkeydown=e=>{if(e.key==='Enter'||e.key===' ')file.click()};drop.ondragover=e=>{e.preventDefault();drop.classList.add('drag')};drop.ondragleave=()=>drop.classList.remove('drag');drop.ondrop=e=>{e.preventDefault();drop.classList.remove('drag');setFile(e.dataTransfer.files[0])};file.addEventListener('change',()=>renderFile(file.files[0]));
    action.onclick=()=>{const chosen=checks.filter(c=>c.checked),f=file.files[0];const labels=chosen.map(c=>clean(c.closest('tr').querySelector('label')?.textContent)).join('\n');if(confirm(`Upload “${f.name}” to ${chosen.length} exam${chosen.length===1?'':'s'}?\n\n${labels}`)){showWorking(`Uploading ${f.name}…`);nativeButton.click();}};
  }

  function buildUpcomingDashboard() {
    const app=appShell('Upcoming exams','Upload exam files and review scheduled student appointments.');
    const agreements=clean($$('.display.number .value')[0]?.textContent)||'—';
    const missing=clean($$('.display.number .value')[1]?.textContent)||'—';
    const table=$('table[id$="_GV"]'),rows=table?$$('tbody > tr',table):[];
    const stats=document.createElement('div');stats.className='odsx-dashboard';stats.innerHTML=`<a class="odsx-stat" href="Testing.aspx?Step=Instruction&Plan=NotSpecified"><strong>${agreements}</strong><span>Agreements needed</span></a><div class="odsx-stat"><strong>${missing}</strong><span>Files needed</span></div><div class="odsx-stat"><strong>${rows.length}</strong><span>Upcoming appointments</span></div><a class="odsx-stat" href="Testing.aspx?Step=Dates"><strong>By date</strong><span>Upload once for a course exam</span></a>`;app.append(stats);
    const auth=$('[id*="SharedAuth"]');if(auth){const alert=document.createElement('section');alert.className='odsx-card';alert.innerHTML='<h3>Secure exam access</h3><p>AIM requires an emailed code before completed exams can be downloaded.</p>';const b=$('button',auth);if(b)alert.append(b);app.append(alert);}
    const grid=section(app,'Scheduled students');
    if(!rows.length)grid.outerHTML='<div class="odsx-empty">No upcoming exams are shown.</div>';
    rows.forEach(row=>{const d=cellMap(table,row),check=$('input[type=checkbox]',row),detail=$$('a',row).find(a=>/detail/i.test(clean(a.textContent)));if(check)check.className='odsx-native-check';const card=document.createElement('article');card.className='odsx-card';card.innerHTML=`<div class="odsx-card-top"><div><h3>${d.Subject?.text||''} ${d.Course?.text||''}.${d.Section?.text||''} · ${d.Type?.text||'Exam'}</h3><p>${d['Full Name']?.text||'Student'} · ${d['Exam Date']?.text||''} ${d['Time Range']?.text||''}</p></div></div><div class="odsx-meta"><span class="odsx-pill good">${d.Status?.text||'Scheduled'}</span>${d.Location?.text?`<span class="odsx-pill">${d.Location.text}</span>`:''}${d.Late?.text?`<span class="odsx-pill bad">Late request</span>`:''}</div><div class="odsx-actions"></div>`;const top=$('.odsx-card-top',card);if(check)top.append(check);const actions=$('.odsx-actions',card);if(detail){detail.className='odsx-btn';detail.textContent='View details';actions.append(detail);}grid.append(card);});
    uploadPanel(app,table,rows,$('[id$="GFormUpload_BtnUpload"]'));
    return true;
  }

  function buildCourseCards(app, table, kind) {
    const rows=table?$$('tbody > tr',table):[],grid=section(app,kind==='dates'?'Course exam dates':'Courses');
    if(!rows.length){grid.outerHTML='<div class="odsx-empty">No records are shown for this view.</div>';return rows;}
    rows.forEach(row=>{const d=cellMap(table,row),course=`${d.Subject?.text||''} ${d.Course?.text||''}.${d.Section?.text||''}`,card=document.createElement('article');card.className='odsx-card';
      if(kind==='agreements'){const view=$$('a',row).find(a=>/view|specify/i.test(clean(a.textContent))),copy=$$('a',row).find(a=>/copy/i.test(clean(a.textContent))),ready=/view/i.test(clean(view?.textContent));card.innerHTML=`<div class="odsx-card-top"><div><h3>${course}</h3><p>${d['Course Title']?.text||''}</p></div><span class="odsx-pill ${ready?'good':'bad'}">${ready?'Agreement ready':'Agreement needed'}</span></div><div class="odsx-meta"><span class="odsx-pill">${d.Students?.text||'0'} students</span><span class="odsx-pill">${d['Exam Dates']?.text||'0'} exam dates</span><span class="odsx-pill">CRN ${d.CRN?.text||''}</span></div><div class="odsx-actions">${buttonLink(view,ready?'Review agreement':'Set up agreement',true)}${buttonLink(copy,'Copy to sections')}</div>`;const notes=d.Notes?.node;if(notes&&clean(notes.textContent)){const details=document.createElement('details');details.innerHTML=`<summary>Exam dates</summary>${notes.innerHTML}`;card.append(details);}}
      else{const check=$('input[type=checkbox]',row);if(check)check.className='odsx-native-check';card.innerHTML=`<div class="odsx-card-top"><div><h3>${course} · ${d.Type?.text||'Exam'}</h3><p>${d['Exam Date']?.text||''}</p></div></div><div class="odsx-meta"><span class="odsx-pill">${d.Length?.text||'—'} minutes</span><span class="odsx-pill ${/none|0|^$/i.test(d.Files?.text||'')?'bad':'good'}">${d.Files?.text||'No file'}</span><span class="odsx-pill">${d.Scheduled?.text||'0'} scheduled</span></div><div class="odsx-actions"></div>`;if(check)$('.odsx-card-top',card).append(check);['Modify','Duplicate','Delete'].forEach(label=>{const a=$$('a',row).find(x=>clean(x.textContent)===label);if(a){a.className='odsx-btn';$('.odsx-actions',card).append(a);}});}
      grid.append(card);
    });return rows;
  }

  function buildTestingDashboard() {
    if (step.toLowerCase()==='exams'||!step) return buildUpcomingDashboard();
    if (step.toLowerCase()==='instruction') {const app=appShell('Testing agreements','Set up each course once, then reuse or review its exam rules.');buildCourseCards(app,$('table[id$="_GVINS"]'),'agreements');return true;}
    if (step.toLowerCase()==='dates') {const app=appShell('Exam dates','Select course exams to upload a shared file or modify their schedule.');const table=$('table[id$="_GVED"]'),rows=buildCourseCards(app,table,'dates');const button=$('[id$="BtnUploadED"]');if(button){const bar=document.createElement('div');bar.className='odsx-inline-upload';bar.innerHTML='<div><strong>Select exam dates</strong><div class="odsx-subtitle">Upload one file to every student scheduled for those dates.</div></div><div></div><button class="odsx-primary" type="button">Continue to upload</button>';app.append(bar);$('button',bar).onclick=()=>{const n=rows.filter(r=>$('input[type=checkbox]',r)?.checked).length;if(!n)return toast('Select at least one exam date first.',true);if(confirm(`Continue to upload a file for ${n} exam date${n===1?'':'s'}?`)){showWorking('Opening the upload step…');button.click();}};}return true;}
    if (step.toLowerCase()==='completed') {const app=appShell('Completed files','Find and download completed exams after AIM authentication.');const native=$('#content_main');if(native){const holder=document.createElement('section');holder.className='odsx-card';holder.innerHTML='<h2>Completed exam files</h2>';holder.append(...$$('table,.panel',native));app.append(holder);}return true;}
    return false;
  }

  function buildRealDashboard() {
    if(page==='overview.aspx')return buildOverviewDashboard();
    if(page==='testing.aspx')return buildTestingDashboard();
    return false;
  }

  function watchNativeSubmits() {
    $$('button.submit').forEach(button => {
      if (button.dataset.odsxWatch) return; button.dataset.odsxWatch='1';
      button.addEventListener('click', () => {
        if (!button.closest('.odsx-upload-dock') && /submit|save|continue|upload/i.test(clean(button.textContent))) setTimeout(()=>showWorking(`${clean(button.textContent)}…`),0);
      });
    });
  }

  nav();
  if (buildRealDashboard()) { watchNativeSubmits(); return; }
  subtitle();
  simplifySearch();
  agreementChoice();
  agreementDetails();
  uploadDock();
  genericFileDrop();
  watchNativeSubmits();
})();
