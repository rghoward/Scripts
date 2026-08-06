// ==UserScript==
// @name         GT TA Hiring - Manager User Directory
// @namespace    https://gatech.edu/
// @version      1.0.0
// @description  Adds fast search, filters, sorting, and a compact directory to the manager user list.
// @match        https://ta-app.cc.gatech.edu/admin/user/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

(function () {
    'use strict';

    if (location.pathname.replace(/\/+$/, '') !== '/admin/user') return;

    const { clean, escapeAttribute, escapeHtml, normalize } = toolkit.utils;
    const main = document.querySelector('main.container');
    const heading = main?.querySelector(':scope > h1');
    const table = main?.querySelector(':scope > table.table');
    const tbody = table?.querySelector('tbody');
    if (!main || !heading || !table || !tbody || document.getElementById('tm-user-directory')) return;

    const createLink = [...main.querySelectorAll(':scope > a')]
        .find(link => /create new user/i.test(link.textContent));
    const nativeNote = [...main.querySelectorAll(':scope > p')]
        .find(paragraph => /not deleted|inactive/i.test(paragraph.textContent));
    const users = [...tbody.querySelectorAll(':scope > tr')].map(row => {
        const cells = [...row.querySelectorAll(':scope > td')];
        const username = clean(cells[2]?.textContent);
        const firstName = clean(cells[3]?.textContent);
        const lastName = clean(cells[4]?.textContent);
        const email = clean(cells[5]?.textContent);
        const role = clean(cells[6]?.textContent) || 'No assigned role';
        const active = /^yes$/i.test(clean(cells[1]?.textContent));
        row.classList.add('tm-directory-row');
        row.classList.toggle('tm-user-inactive-row', !active);
        const editLink = cells[2]?.querySelector('a');
        if (editLink) editLink.title = `Edit ${username}`;
        return {
            row, id: Number.parseInt(clean(cells[0]?.textContent), 10) || 0,
            username, firstName, lastName, email, role, active,
            lastLogin: clean(cells[7]?.textContent), created: clean(cells[9]?.textContent),
            searchable: normalize(`${username} ${firstName} ${lastName} ${email} ${role}`)
        };
    });

    const roles = [...new Set(users.map(user => user.role))].sort((a, b) => a.localeCompare(b));
    let renderTimer;

    document.body.classList.add('gt-ta-toolkit-page');
    addStyles();
    buildDirectory();
    renderUsers();

    function buildDirectory() {
        const directory = document.createElement('section');
        directory.id = 'tm-user-directory';
        directory.innerHTML = `
            <header class="tm-user-directory-hero">
                <div>
                    <span>Manager tools · People</span>
                    <h1>User directory</h1>
                    <p>Search and manage ${users.length.toLocaleString()} TA Hiring accounts.</p>
                </div>
                <div class="tm-user-directory-actions">
                    <a class="tm-back-manager" href="/admin/manager/"><span aria-hidden="true">←</span> Manager dashboard</a>
                    <a class="tm-create-user" href="${escapeAttribute(createLink?.href || '/admin/user/new')}">Add new user</a>
                </div>
            </header>

            <div class="tm-user-directory-note">
                <strong>About inactive users:</strong>
                Accounts are retained for historical records. Making a user inactive prevents access without deleting their history.
            </div>

            <div class="tm-user-directory-toolbar">
                <div class="tm-user-search-control">
                    <label for="tm-directory-search">Search users</label>
                    <input id="tm-directory-search" type="search" placeholder="Name, username, email, or role…" autocomplete="off">
                </div>
                <div>
                    <label for="tm-directory-status">Account status</label>
                    <select id="tm-directory-status">
                        <option value="active">Active users</option>
                        <option value="all">All users</option>
                        <option value="inactive">Inactive users</option>
                    </select>
                </div>
                <div>
                    <label for="tm-directory-role">Role</label>
                    <select id="tm-directory-role">
                        <option value="">All roles</option>
                        ${roles.map(role => `<option value="${escapeAttribute(role)}">${escapeHtml(role)}</option>`).join('')}
                    </select>
                </div>
                <div>
                    <label for="tm-directory-sort">Sort</label>
                    <select id="tm-directory-sort">
                        <option value="recent">Newest accounts</option>
                        <option value="name">Name</option>
                        <option value="username">Username</option>
                        <option value="login">Most recent login</option>
                    </select>
                </div>
                <button id="tm-directory-clear" type="button">Clear</button>
            </div>

            <div class="tm-directory-result-bar">
                <span id="tm-directory-count"></span>
                <span>Showing at most 250 rows. Search to find anyone else instantly.</span>
            </div>
        `;

        heading.replaceWith(directory);
        createLink?.remove();
        nativeNote?.remove();

        const wrapper = document.createElement('div');
        wrapper.className = 'tm-user-table-wrapper';
        table.before(wrapper);
        wrapper.appendChild(table);
        table.classList.add('tm-user-table');

        ['tm-directory-search', 'tm-directory-status', 'tm-directory-role', 'tm-directory-sort']
            .forEach(id => document.getElementById(id).addEventListener('input', scheduleRender));
        document.getElementById('tm-directory-clear').addEventListener('click', () => {
            document.getElementById('tm-directory-search').value = '';
            document.getElementById('tm-directory-status').value = 'active';
            document.getElementById('tm-directory-role').value = '';
            document.getElementById('tm-directory-sort').value = 'recent';
            renderUsers();
            document.getElementById('tm-directory-search').focus();
        });
    }

    function scheduleRender() {
        clearTimeout(renderTimer);
        renderTimer = setTimeout(renderUsers, 90);
    }

    function renderUsers() {
        const query = normalize(document.getElementById('tm-directory-search').value);
        const terms = query.split(/\s+/).filter(Boolean);
        const status = document.getElementById('tm-directory-status').value;
        const role = document.getElementById('tm-directory-role').value;
        const sort = document.getElementById('tm-directory-sort').value;
        const matches = users.filter(user =>
            (!terms.length || terms.every(term => user.searchable.includes(term))) &&
            (status === 'all' || (status === 'active' ? user.active : !user.active)) &&
            (!role || user.role === role)
        ).sort((a, b) => {
            if (sort === 'name') return `${a.lastName} ${a.firstName}`.localeCompare(`${b.lastName} ${b.firstName}`);
            if (sort === 'username') return a.username.localeCompare(b.username);
            if (sort === 'login') return b.lastLogin.localeCompare(a.lastLogin);
            return b.id - a.id;
        });

        const fragment = document.createDocumentFragment();
        matches.slice(0, 250).forEach(user => fragment.appendChild(user.row));
        tbody.replaceChildren(fragment);
        const shown = Math.min(matches.length, 250);
        document.getElementById('tm-directory-count').innerHTML =
            `<strong>${shown.toLocaleString()}</strong> shown · ${matches.length.toLocaleString()} matched · ${users.length.toLocaleString()} total`;
    }

    function addStyles() {
        const style = document.createElement('style');
        style.textContent = `
            #tm-user-directory { margin: 24px 0 15px; }
            .tm-user-directory-hero { display: flex; align-items: center; justify-content: space-between; gap: 22px; padding: 25px 27px; border-radius: 14px 14px 0 0; background: linear-gradient(125deg,#003057,#074d78); color: white; }
            .tm-user-directory-hero span { color: #d6c57f; font-size: .72rem; font-weight: 800; letter-spacing: .08em; text-transform: uppercase; }
            .tm-user-directory-hero h1 { margin: 3px 0 5px; color: white; font-size: 2rem; }
            .tm-user-directory-hero p { margin: 0; color: #dce8f1; }
            .tm-user-directory-actions { display: flex; gap: 8px; }
            .tm-user-directory-actions a { display: inline-flex; align-items: center; justify-content: center; gap: 7px; min-height: 43px; box-sizing: border-box; padding: 9px 14px; border: 1px solid #b9cad7; border-radius: 7px; font-size: .88rem; font-weight: 800; text-decoration: none !important; }
            .tm-user-directory-actions .tm-back-manager,
            .tm-user-directory-actions .tm-back-manager:is(:link,:visited,:hover,:active) { background: rgba(255,255,255,.1); color: #ffffff !important; }
            .tm-user-directory-actions .tm-back-manager:hover { border-color: #ffffff; background: rgba(255,255,255,.18); }
            .tm-user-directory-actions .tm-back-manager span { color: #d6c57f; font-size: 1rem; }
            .tm-user-directory-actions .tm-create-user,
            .tm-user-directory-actions .tm-create-user:is(:link,:visited,:hover,:active) { border-color: #d6c57f; background: #b3a369; color: #20262a !important; }
            .tm-user-directory-actions .tm-create-user:hover { background: #d6c57f; }
            .tm-user-directory-note { padding: 10px 15px; border: 1px solid #d8cfaa; border-top: 0; background: #fffbee; color: #554b25; font-size: .82rem; }
            .tm-user-directory-toolbar { position: sticky; top: 0; z-index: 30; display: grid; grid-template-columns: minmax(280px,2fr) repeat(3,minmax(145px,1fr)) auto; align-items: end; gap: 10px; padding: 14px; border: 1px solid var(--tm-border); background: rgba(255,255,255,.97); box-shadow: 0 5px 14px rgba(0,0,0,.08); }
            .tm-user-directory-toolbar > div { min-width: 0; }
            .tm-user-directory-toolbar label { display: block; margin: 0 0 5px; color: var(--tm-muted); font-size: .76rem; font-weight: 800; }
            .tm-user-directory-toolbar :is(input,select) { box-sizing: border-box; width: 100%; height: 43px; margin: 0; border: 1px solid #aab0b6; border-radius: 6px; background: white; }
            #tm-directory-clear { height: 43px; margin: 0; padding: 0 14px; border: 1px solid #888; border-radius: 6px; background: white; cursor: pointer; font-weight: 700; }
            .tm-directory-result-bar { display: flex; justify-content: space-between; gap: 14px; padding: 9px 13px; border: 1px solid var(--tm-border); border-top: 0; background: #f5f6f7; color: var(--tm-muted); font-size: .78rem; }
            .tm-user-table-wrapper { overflow: auto; max-height: 68vh; margin-bottom: 55px; border: 1px solid var(--tm-border); border-top: 0; background: white; }
            .tm-user-table { width: 100%; margin: 0 !important; border-collapse: separate; border-spacing: 0; font-size: .79rem; }
            .tm-user-table th { position: sticky; top: 0; z-index: 5; padding: 10px 9px !important; background: #31363b !important; color: white; white-space: nowrap; }
            .tm-user-table td { padding: 8px 9px !important; border-bottom: 1px solid #e5e7eb; vertical-align: middle; }
            .tm-user-table tbody tr:nth-child(even) { background: #f8fafb; }
            .tm-user-table tbody tr:hover { background: #fff9df; }
            .tm-user-table td:nth-child(3) a { display: inline-block; padding: 4px 7px; border-radius: 5px; background: #e8f1f7; color: #003057; font-weight: 800; }
            .tm-user-inactive-row { color: #6b7280; background: #f3f3f3 !important; }
            .tm-user-inactive-row td:nth-child(2) { color: #a02b23; font-weight: 800; }
            @media (max-width: 980px) { .tm-user-directory-toolbar { position: static; grid-template-columns: repeat(2,minmax(0,1fr)); } .tm-user-directory-hero { align-items: flex-start; flex-direction: column; } }
            @media (max-width: 600px) { .tm-user-directory-toolbar { grid-template-columns: 1fr; } .tm-directory-result-bar { flex-direction: column; } .tm-user-directory-actions { flex-wrap: wrap; } }
        `;
        document.head.appendChild(style);
    }
})();
