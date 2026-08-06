// ==UserScript==
// @name         GT TA Hiring - Manager Semesters
// @namespace    https://gatech.edu/
// @version      1.0.0
// @description  Turns the raw semester list into a clear chronological manager dashboard.
// @match        https://ta-app.cc.gatech.edu/admin/semester/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

(function () {
    'use strict';

    if (location.pathname.replace(/\/+$/, '') !== '/admin/semester') return;

    const { clean, escapeAttribute } = toolkit.utils;
    const main = document.querySelector('main.container');
    const heading = main?.querySelector(':scope > h1');
    const table = main?.querySelector(':scope > table.table');
    const tbody = table?.querySelector('tbody');
    const createLink = [...(main?.querySelectorAll(':scope > a') || [])]
        .find(link => /create new semester/i.test(link.textContent));
    if (!main || !heading || !table || !tbody || document.getElementById('tm-semester-dashboard')) return;

    const today = startOfDay(new Date());
    const semesters = [...tbody.querySelectorAll(':scope > tr')].map(row => {
        const cells = [...row.querySelectorAll(':scope > td')];
        const name = clean(cells[0]?.textContent);
        const begins = parseDate(cells[1]?.textContent);
        const ends = parseDate(cells[2]?.textContent);
        const applicationOpens = parseDate(cells[3]?.textContent);
        const applicationCloses = parseDate(cells[4]?.textContent);
        const termStatus = today < begins ? 'Upcoming' : today > ends ? 'Past' : 'Current';
        const applicationStatus = today < applicationOpens
            ? 'Not open yet'
            : today > applicationCloses ? 'Closed' : 'Applications open';
        row.dataset.termStatus = termStatus.toLowerCase();
        row.classList.add('tm-semester-row', `tm-semester-${termStatus.toLowerCase()}`);
        const firstCell = cells[0];
        const link = firstCell?.querySelector('a');
        if (link) {
            link.title = `Edit ${name} dates and courses`;
            link.insertAdjacentHTML('afterend', `
                <span class="tm-term-badge tm-term-${termStatus.toLowerCase()}">${termStatus}</span>
                <span class="tm-application-badge tm-application-${applicationStatus.toLowerCase().replaceAll(' ', '-')}">${applicationStatus}</span>
            `);
        }
        return { row, name, begins, ends, applicationOpens, applicationCloses, termStatus, applicationStatus };
    }).sort((a, b) => b.begins - a.begins);

    document.body.classList.add('gt-ta-toolkit-page');
    addStyles();
    buildDashboard();
    renderSemesters('all');

    function parseDate(value) {
        const date = new Date(clean(value));
        return Number.isNaN(date.getTime()) ? new Date(0) : startOfDay(date);
    }

    function startOfDay(date) {
        return new Date(date.getFullYear(), date.getMonth(), date.getDate());
    }

    function buildDashboard() {
        const current = semesters.filter(semester => semester.termStatus === 'Current').length;
        const upcoming = semesters.filter(semester => semester.termStatus === 'Upcoming').length;
        const open = semesters.filter(semester => semester.applicationStatus === 'Applications open').length;
        const dashboard = document.createElement('section');
        dashboard.id = 'tm-semester-dashboard';
        dashboard.innerHTML = `
            <header class="tm-semester-hero">
                <div>
                    <span>Manager tools · Academic setup</span>
                    <h1>Semesters</h1>
                    <p>Manage academic dates, application windows, and semester courses.</p>
                </div>
                <div class="tm-semester-actions">
                    <a class="tm-semester-back" href="/admin/manager/"><span aria-hidden="true">←</span> Manager dashboard</a>
                    <a class="tm-semester-create" href="${escapeAttribute(createLink?.href || '/admin/semester/new')}">Add semester</a>
                </div>
            </header>

            <div class="tm-semester-stats">
                <div><strong>${semesters.length}</strong><span>Total semesters</span></div>
                <div><strong>${current}</strong><span>Current</span></div>
                <div><strong>${upcoming}</strong><span>Upcoming</span></div>
                <div><strong>${open}</strong><span>Application windows open</span></div>
            </div>

            <div class="tm-semester-filter" role="group" aria-label="Filter semesters">
                <button class="tm-active" type="button" data-filter="all">All semesters</button>
                <button type="button" data-filter="active">Current &amp; upcoming</button>
                <button type="button" data-filter="past">Past</button>
                <span id="tm-semester-count"></span>
            </div>
        `;
        heading.replaceWith(dashboard);
        createLink?.remove();
        const wrapper = document.createElement('div');
        wrapper.className = 'tm-semester-table-wrapper';
        table.before(wrapper);
        wrapper.appendChild(table);
        table.classList.add('tm-semester-table');
        dashboard.querySelectorAll('[data-filter]').forEach(button => {
            button.addEventListener('click', () => {
                dashboard.querySelectorAll('[data-filter]').forEach(item =>
                    item.classList.toggle('tm-active', item === button)
                );
                renderSemesters(button.dataset.filter);
            });
        });
    }

    function renderSemesters(filter) {
        const visible = semesters.filter(semester =>
            filter === 'all' ||
            (filter === 'active' && semester.termStatus !== 'Past') ||
            (filter === 'past' && semester.termStatus === 'Past')
        );
        const fragment = document.createDocumentFragment();
        visible.forEach(semester => fragment.appendChild(semester.row));
        tbody.replaceChildren(fragment);
        document.getElementById('tm-semester-count').textContent =
            `${visible.length} semester${visible.length === 1 ? '' : 's'} shown`;
    }

    function addStyles() {
        const style = document.createElement('style');
        style.textContent = `
            #tm-semester-dashboard { margin: 24px 0 15px; }
            .tm-semester-hero { display: flex; align-items: center; justify-content: space-between; gap: 22px; padding: 26px 28px; border-radius: 14px 14px 0 0; background: linear-gradient(125deg,#003057,#074d78); color: white; }
            .tm-semester-hero > div:first-child > span { color: #d6c57f; font-size: .72rem; font-weight: 800; letter-spacing: .08em; text-transform: uppercase; }
            .tm-semester-hero h1 { margin: 3px 0 5px; color: white; font-size: 2rem; }
            .tm-semester-hero p { margin: 0; color: #dce8f1; }
            .tm-semester-actions { display: flex; gap: 8px; }
            .tm-semester-actions a { display: inline-flex; align-items: center; gap: 7px; min-height: 43px; box-sizing: border-box; padding: 9px 14px; border-radius: 7px; font-size: .87rem; font-weight: 800; text-decoration: none !important; }
            .tm-semester-actions .tm-semester-back, .tm-semester-actions .tm-semester-back:is(:link,:visited,:hover,:active) { border: 1px solid #b9cad7; background: rgba(255,255,255,.1); color: white !important; }
            .tm-semester-actions .tm-semester-back span { color: #d6c57f; }
            .tm-semester-actions .tm-semester-create, .tm-semester-actions .tm-semester-create:is(:link,:visited,:hover,:active) { border: 1px solid #d6c57f; background: #b3a369; color: #20262a !important; }
            .tm-semester-stats { display: grid; grid-template-columns: repeat(4,minmax(0,1fr)); gap: 11px; margin-top: 14px; }
            .tm-semester-stats > div { display: flex; flex-direction: column; padding: 14px 15px; border: 1px solid var(--tm-border); border-radius: 8px; background: var(--tm-surface); }
            .tm-semester-stats strong { font-size: 1.45rem; }
            .tm-semester-stats span { color: var(--tm-muted); font-size: .8rem; }
            .tm-semester-filter { display: flex; align-items: center; gap: 0; margin-top: 14px; }
            .tm-semester-filter button { padding: 9px 14px; border: 1px solid #a9adb2; background: white; cursor: pointer; font-weight: 700; }
            .tm-semester-filter button + button { margin-left: -1px; }
            .tm-semester-filter button:first-child { border-radius: 7px 0 0 7px; }
            .tm-semester-filter button:last-of-type { border-radius: 0 7px 7px 0; }
            .tm-semester-filter button.tm-active { position: relative; background: #343434; color: white; }
            #tm-semester-count { margin-left: auto; color: var(--tm-muted); font-size: .82rem; font-weight: 700; }
            .tm-semester-table-wrapper { overflow-x: auto; margin: 11px 0 55px; border: 1px solid var(--tm-border); border-radius: 9px; background: white; }
            .tm-semester-table { width: 100%; margin: 0 !important; border-collapse: separate; border-spacing: 0; }
            .tm-semester-table th { padding: 11px 13px !important; background: #31363b !important; color: white; white-space: nowrap; }
            .tm-semester-table td { padding: 12px 13px !important; border-bottom: 1px solid #e5e7eb; vertical-align: middle; }
            .tm-semester-table tbody tr:last-child td { border-bottom: 0; }
            .tm-semester-table tbody tr:hover { background: #fff9df; }
            .tm-semester-table td:first-child a { display: block; color: #003057; font-weight: 900; }
            .tm-term-badge, .tm-application-badge { display: inline-block; margin: 5px 5px 0 0; padding: 2px 6px; border-radius: 999px; font-size: .67rem; font-weight: 800; }
            .tm-term-current, .tm-application-applications-open { background: #dff4e7; color: #17653f; }
            .tm-term-upcoming, .tm-application-not-open-yet { background: #e8f1f7; color: #003057; }
            .tm-term-past, .tm-application-closed { background: #ececec; color: #666; }
            .tm-semester-past { color: #667085; }
            @media (max-width: 760px) { .tm-semester-hero { align-items: flex-start; flex-direction: column; } .tm-semester-actions { flex-wrap: wrap; } .tm-semester-stats { grid-template-columns: repeat(2,minmax(0,1fr)); } .tm-semester-filter { align-items: stretch; flex-direction: column; gap: 6px; } .tm-semester-filter button { width: 100%; margin: 0 !important; border-radius: 6px !important; } #tm-semester-count { margin-left: 0; } }
        `;
        document.head.appendChild(style);
    }
})();
