// ==UserScript==
// @name         GT TA Hiring - Manager TA Directory
// @namespace    https://gatech.edu/
// @version      1.0.0
// @description  Adds fast search, useful filters, and a compact manager TA directory.
// @match        https://ta-app.cc.gatech.edu/admin/candidate/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

(function () {
    'use strict';

    if (location.pathname.replace(/\/+$/, '') !== '/admin/candidate') return;

    const { clean, escapeAttribute, escapeHtml, normalize } = toolkit.utils;
    const main = document.querySelector('main.container');
    const heading = main?.querySelector(':scope > h1');
    const table = main?.querySelector(':scope > table.table');
    const tbody = table?.querySelector('tbody');
    if (!main || !heading || !table || !tbody || document.getElementById('tm-ta-directory')) return;

    const candidates = [...tbody.querySelectorAll(':scope > tr')].map(row => {
        const cells = [...row.querySelectorAll(':scope > td')];
        const name = clean(cells[0]?.textContent);
        const gtid = clean(cells[1]?.textContent);
        const integrity = clean(cells[2]?.textContent) || 'Not recorded';
        const program = clean(cells[3]?.textContent) || 'Not recorded';
        const level = clean(cells[4]?.textContent) || 'Not recorded';
        const hr = clean(cells[5]?.textContent) || 'No';
        const applications = [...(cells[6]?.querySelectorAll('li') || [])]
            .map(item => clean(item.textContent)).filter(Boolean);
        row.classList.add('tm-ta-directory-row');
        const editLink = cells[0]?.querySelector('a');
        if (editLink) editLink.title = `Edit ${name}`;
        return {
            row, name, gtid, integrity, program, level, hr, applications,
            searchable: normalize(`${name} ${gtid} ${program} ${level} ${applications.join(' ')}`)
        };
    });
    const programs = [...new Set(candidates.map(candidate => candidate.program))]
        .sort((a, b) => a.localeCompare(b));
    const integrityValues = [...new Set(candidates.map(candidate => candidate.integrity))]
        .sort((a, b) => a.localeCompare(b));
    let renderTimer;

    document.body.classList.add('gt-ta-toolkit-page');
    addStyles();
    buildDirectory();
    renderCandidates();

    function buildDirectory() {
        const directory = document.createElement('section');
        directory.id = 'tm-ta-directory';
        directory.innerHTML = `
            <header class="tm-ta-directory-hero">
                <div>
                    <span>Manager tools · People</span>
                    <h1>TA directory</h1>
                    <p>Search and review ${candidates.length.toLocaleString()} TA records.</p>
                </div>
                <div class="tm-ta-directory-actions">
                    <a href="/admin/manager/"><span aria-hidden="true">←</span> Manager dashboard</a>
                    <a href="/admin/user/">User directory</a>
                </div>
            </header>

            <div class="tm-ta-directory-note">
                Use this directory to locate and edit an existing TA record. Application assignments remain listed in the final column.
            </div>

            <div class="tm-ta-directory-toolbar">
                <div class="tm-ta-search-control">
                    <label for="tm-ta-search">Search TAs</label>
                    <input id="tm-ta-search" type="search" placeholder="Name, GTID, program, level, or application…" autocomplete="off">
                </div>
                <div>
                    <label for="tm-ta-program">Program</label>
                    <select id="tm-ta-program">
                        <option value="">All programs</option>
                        ${programs.map(program => `<option value="${escapeAttribute(program)}">${escapeHtml(program)}</option>`).join('')}
                    </select>
                </div>
                <div>
                    <label for="tm-ta-integrity">Integrity check</label>
                    <select id="tm-ta-integrity">
                        <option value="">All results</option>
                        ${integrityValues.map(value => `<option value="${escapeAttribute(value)}">${escapeHtml(value)}</option>`).join('')}
                    </select>
                </div>
                <div>
                    <label for="tm-ta-applications">Applications</label>
                    <select id="tm-ta-applications">
                        <option value="all">With or without</option>
                        <option value="yes">Has applications</option>
                        <option value="no">No applications</option>
                    </select>
                </div>
                <div>
                    <label for="tm-ta-sort">Sort</label>
                    <select id="tm-ta-sort">
                        <option value="name">Name</option>
                        <option value="applications">Most applications</option>
                        <option value="program">Program</option>
                        <option value="gtid">GTID</option>
                    </select>
                </div>
                <button id="tm-ta-clear" type="button">Clear</button>
            </div>

            <div class="tm-ta-result-bar">
                <span id="tm-ta-count"></span>
                <span>Showing at most 250 rows. Search to find any other TA instantly.</span>
            </div>
        `;
        heading.replaceWith(directory);

        const wrapper = document.createElement('div');
        wrapper.className = 'tm-ta-table-wrapper';
        table.before(wrapper);
        wrapper.appendChild(table);
        table.classList.add('tm-ta-table');

        ['tm-ta-search', 'tm-ta-program', 'tm-ta-integrity', 'tm-ta-applications', 'tm-ta-sort']
            .forEach(id => document.getElementById(id).addEventListener('input', scheduleRender));
        document.getElementById('tm-ta-clear').addEventListener('click', () => {
            document.getElementById('tm-ta-search').value = '';
            document.getElementById('tm-ta-program').value = '';
            document.getElementById('tm-ta-integrity').value = '';
            document.getElementById('tm-ta-applications').value = 'all';
            document.getElementById('tm-ta-sort').value = 'name';
            renderCandidates();
            document.getElementById('tm-ta-search').focus();
        });
    }

    function scheduleRender() {
        clearTimeout(renderTimer);
        renderTimer = setTimeout(renderCandidates, 90);
    }

    function renderCandidates() {
        const terms = normalize(document.getElementById('tm-ta-search').value)
            .split(/\s+/).filter(Boolean);
        const program = document.getElementById('tm-ta-program').value;
        const integrity = document.getElementById('tm-ta-integrity').value;
        const applicationFilter = document.getElementById('tm-ta-applications').value;
        const sort = document.getElementById('tm-ta-sort').value;
        const matches = candidates.filter(candidate =>
            (!terms.length || terms.every(term => candidate.searchable.includes(term))) &&
            (!program || candidate.program === program) &&
            (!integrity || candidate.integrity === integrity) &&
            (applicationFilter === 'all' ||
                (applicationFilter === 'yes' ? candidate.applications.length > 0 : candidate.applications.length === 0))
        ).sort((a, b) => {
            if (sort === 'applications') return b.applications.length - a.applications.length || a.name.localeCompare(b.name);
            if (sort === 'program') return a.program.localeCompare(b.program) || a.name.localeCompare(b.name);
            if (sort === 'gtid') return a.gtid.localeCompare(b.gtid, undefined, { numeric: true });
            return a.name.localeCompare(b.name);
        });

        const fragment = document.createDocumentFragment();
        matches.slice(0, 250).forEach(candidate => fragment.appendChild(candidate.row));
        tbody.replaceChildren(fragment);
        const shown = Math.min(matches.length, 250);
        document.getElementById('tm-ta-count').innerHTML =
            `<strong>${shown.toLocaleString()}</strong> shown · ${matches.length.toLocaleString()} matched · ${candidates.length.toLocaleString()} total`;
    }

    function addStyles() {
        const style = document.createElement('style');
        style.textContent = `
            #tm-ta-directory { margin: 24px 0 15px; }
            .tm-ta-directory-hero { display: flex; align-items: center; justify-content: space-between; gap: 22px; padding: 25px 27px; border-radius: 14px 14px 0 0; background: linear-gradient(125deg,#003057,#074d78); color: white; }
            .tm-ta-directory-hero > div:first-child > span { color: #d6c57f; font-size: .72rem; font-weight: 800; letter-spacing: .08em; text-transform: uppercase; }
            .tm-ta-directory-hero h1 { margin: 3px 0 5px; color: white; font-size: 2rem; }
            .tm-ta-directory-hero p { margin: 0; color: #dce8f1; }
            .tm-ta-directory-actions { display: flex; gap: 8px; }
            .tm-ta-directory-actions a, .tm-ta-directory-actions a:is(:link,:visited,:hover,:active) { display: inline-flex; align-items: center; gap: 7px; min-height: 43px; box-sizing: border-box; padding: 9px 14px; border: 1px solid #b9cad7; border-radius: 7px; background: rgba(255,255,255,.1); color: white !important; font-size: .88rem; font-weight: 800; text-decoration: none !important; }
            .tm-ta-directory-actions a:hover { border-color: white; background: rgba(255,255,255,.18); }
            .tm-ta-directory-actions a span { color: #d6c57f; }
            .tm-ta-directory-note { padding: 10px 15px; border: 1px solid #cdd7e1; border-top: 0; background: #f3f7fa; color: #475569; font-size: .82rem; }
            .tm-ta-directory-toolbar { position: sticky; top: 0; z-index: 30; display: grid; grid-template-columns: minmax(290px,2fr) repeat(4,minmax(140px,1fr)) auto; align-items: end; gap: 10px; padding: 14px; border: 1px solid var(--tm-border); background: rgba(255,255,255,.97); box-shadow: 0 5px 14px rgba(0,0,0,.08); }
            .tm-ta-directory-toolbar > div { min-width: 0; }
            .tm-ta-directory-toolbar label { position: static !important; display: block !important; height: auto !important; margin: 0 0 5px !important; padding: 0 !important; transform: none !important; color: var(--tm-muted); font-size: .76rem; font-weight: 800; line-height: 1.25 !important; }
            .tm-ta-directory-toolbar :is(input,select) { box-sizing: border-box !important; width: 100% !important; min-width: 0; height: 43px !important; margin: 0 !important; border: 1px solid #aab0b6; border-radius: 6px; background: white; }
            #tm-ta-clear { height: 43px; margin: 0; padding: 0 14px; border: 1px solid #888; border-radius: 6px; background: white; cursor: pointer; font-weight: 700; }
            .tm-ta-result-bar { display: flex; justify-content: space-between; gap: 14px; padding: 9px 13px; border: 1px solid var(--tm-border); border-top: 0; background: #f5f6f7; color: var(--tm-muted); font-size: .78rem; }
            .tm-ta-table-wrapper { overflow: auto; max-height: 68vh; margin-bottom: 55px; border: 1px solid var(--tm-border); border-top: 0; background: white; }
            .tm-ta-table { width: 100%; margin: 0 !important; border-collapse: separate; border-spacing: 0; font-size: .8rem; }
            .tm-ta-table th { position: sticky; top: 0; z-index: 5; padding: 10px 9px !important; background: #31363b !important; color: white; white-space: nowrap; }
            .tm-ta-table td { padding: 8px 9px !important; border-bottom: 1px solid #e5e7eb; vertical-align: top; }
            .tm-ta-table tbody tr:nth-child(even) { background: #f8fafb; }
            .tm-ta-table tbody tr:hover { background: #fff9df; }
            .tm-ta-table td:first-child a { display: inline-block; padding: 4px 7px; border-radius: 5px; background: #e8f1f7; color: #003057; font-weight: 800; }
            .tm-ta-table td:nth-child(2) { font-family: ui-monospace,SFMono-Regular,Menlo,monospace; white-space: nowrap; }
            .tm-ta-table td:last-child ul { margin: 0; padding-left: 17px; }
            @media (max-width: 1150px) { .tm-ta-directory-toolbar { position: static; grid-template-columns: repeat(3,minmax(0,1fr)); } }
            @media (max-width: 700px) { .tm-ta-directory-toolbar { grid-template-columns: 1fr; } .tm-ta-directory-hero { align-items: flex-start; flex-direction: column; } .tm-ta-result-bar { flex-direction: column; } .tm-ta-directory-actions { flex-wrap: wrap; } }
        `;
        document.head.appendChild(style);
    }
})();
