// ==UserScript==
// @name         GT TA Hiring - Manager Home
// @namespace    https://gatech.edu/
// @version      1.0.0
// @description  Replaces the raw manager navigation list with a clear task-based dashboard.
// @match        https://ta-app.cc.gatech.edu/admin/manager/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

(function () {
    'use strict';

    if (location.pathname.replace(/\/+$/, '') !== '/admin/manager') return;

    const main = document.querySelector('main.container');
    const heading = main?.querySelector(':scope > h1');
    const original = main?.querySelector(':scope > .example-wrapper');
    if (!main || !heading || !original || document.getElementById('tm-manager-home')) return;

    const links = new Map(
        [...original.querySelectorAll('a')].map(link => [link.getAttribute('href'), link.href])
    );
    const href = path => links.get(path) || path;

    document.body.classList.add('gt-ta-toolkit-page');
    addStyles();

    const dashboard = document.createElement('section');
    dashboard.id = 'tm-manager-home';
    dashboard.innerHTML = `
        <header class="tm-manager-hero">
            <div>
                <span class="tm-manager-eyebrow">TA Hiring administration</span>
                <h1>Manager dashboard</h1>
                <p>Reports, people, courses, and hiring configuration in one place.</p>
            </div>
            <a class="tm-manager-primary" href="${href('/admin/report/')}">
                Open reports <span aria-hidden="true">→</span>
            </a>
        </header>

        <div class="tm-manager-quick-note">
            <strong>Looking for staffing issues?</strong>
            Open Reports for the highlighted Excel workbook, allocation checks, and assignment exports.
        </div>

        <div class="tm-manager-grid">
            <article class="tm-manager-card tm-manager-card-report">
                <div class="tm-manager-card-mark">R</div>
                <div>
                    <span class="tm-manager-card-label">Staffing</span>
                    <h2>Reports</h2>
                    <p>Download native data or create the highlighted staffing and assignments workbook.</p>
                </div>
                <a href="${href('/admin/report/')}">View reports <span aria-hidden="true">→</span></a>
            </article>

            <article class="tm-manager-card">
                <div class="tm-manager-card-mark">P</div>
                <div>
                    <span class="tm-manager-card-label">Accounts &amp; roles</span>
                    <h2>People</h2>
                    <p>Add users and manage instructor or TA records.</p>
                </div>
                <nav class="tm-manager-links" aria-label="People management">
                    <a href="${href('/admin/user/')}">All users</a>
                    <a href="${href('/admin/user/new')}">Add user</a>
                    <a href="${href('/admin/instructor/')}">Instructors</a>
                    <a href="${href('/admin/candidate/')}">TAs</a>
                </nav>
            </article>

            <article class="tm-manager-card">
                <div class="tm-manager-card-mark">C</div>
                <div>
                    <span class="tm-manager-card-label">Academic setup</span>
                    <h2>Courses &amp; semesters</h2>
                    <p>Maintain hiring terms, courses, and academic programs.</p>
                </div>
                <nav class="tm-manager-links" aria-label="Academic setup">
                    <a href="${href('/admin/semester/')}">Semesters</a>
                    <a href="${href('/admin/course/')}">Courses</a>
                    <a href="${href('/admin/program/')}">Programs</a>
                </nav>
            </article>

            <article class="tm-manager-card">
                <div class="tm-manager-card-mark">Q</div>
                <div>
                    <span class="tm-manager-card-label">Application setup</span>
                    <h2>Global questions</h2>
                    <p>Manage questions shown across TA applications.</p>
                </div>
                <a href="${href('/admin/universal-question/')}">Manage questions <span aria-hidden="true">→</span></a>
            </article>
        </div>
    `;

    heading.remove();
    original.replaceWith(dashboard);
    main.querySelector(':scope > style')?.remove();

    function addStyles() {
        const style = document.createElement('style');
        style.textContent = `
            #tm-manager-home { max-width: 1180px; margin: 26px auto 70px; color: var(--tm-text); }
            .tm-manager-hero { display: flex; align-items: center; justify-content: space-between; gap: 24px; padding: 30px 32px; border-radius: 15px; background: linear-gradient(125deg, #003057 0%, #074d78 100%); color: white; box-shadow: 0 10px 28px rgba(0,48,87,.2); }
            .tm-manager-hero h1 { margin: 3px 0 7px; color: white; font-size: clamp(1.8rem, 4vw, 2.55rem); line-height: 1.05; }
            .tm-manager-hero p { margin: 0; color: #dce8f1; font-size: 1rem; }
            .tm-manager-eyebrow, .tm-manager-card-label { color: #d6c57f; font-size: .72rem; font-weight: 800; letter-spacing: .09em; text-transform: uppercase; }
            .tm-manager-primary { display: inline-flex; align-items: center; gap: 10px; flex: 0 0 auto; padding: 12px 17px; border: 1px solid #d6c57f; border-radius: 8px; background: #b3a369; color: #1f2529 !important; font-weight: 800; text-decoration: none !important; }
            .tm-manager-primary:hover { background: #d6c57f; }
            .tm-manager-quick-note { margin: 15px 0 0; padding: 12px 16px; border: 1px solid #d8cfaa; border-left: 5px solid #b3a369; border-radius: 8px; background: #fffbee; color: #554b25; }
            .tm-manager-grid { display: grid; grid-template-columns: repeat(2, minmax(0, 1fr)); gap: 16px; margin-top: 18px; }
            .tm-manager-card { display: grid; grid-template-columns: auto minmax(0, 1fr); gap: 15px 16px; min-height: 245px; padding: 22px; border: 1px solid var(--tm-border); border-radius: 12px; background: var(--tm-surface); box-shadow: var(--tm-shadow); }
            .tm-manager-card:hover { border-color: #b3a369; transform: translateY(-1px); box-shadow: 0 9px 24px rgba(0,0,0,.11); }
            .tm-manager-card-mark { display: grid; place-items: center; width: 42px; height: 42px; border-radius: 10px; background: #e8f1f7; color: #003057; font-size: 1.05rem; font-weight: 900; }
            .tm-manager-card-report .tm-manager-card-mark { background: #eee7c9; color: #62551f; }
            .tm-manager-card-label { color: #857437; }
            .tm-manager-card h2 { margin: 3px 0 7px; font-size: 1.3rem; }
            .tm-manager-card p { margin: 0; color: var(--tm-muted); line-height: 1.5; }
            .tm-manager-card > a { grid-column: 1 / -1; align-self: end; display: flex; justify-content: space-between; padding-top: 13px; border-top: 1px solid var(--tm-border); font-weight: 800; text-decoration: none; }
            .tm-manager-links { grid-column: 1 / -1; align-self: end; display: grid; grid-template-columns: repeat(2, minmax(0, 1fr)); gap: 7px; }
            .tm-manager-links a { padding: 8px 10px; border: 1px solid #d8dce1; border-radius: 6px; background: var(--tm-surface-alt); color: var(--tm-text); font-size: .84rem; font-weight: 700; text-decoration: none; }
            .tm-manager-links a:hover { border-color: #857437; background: #fffbee; }
            @media (max-width: 760px) { .tm-manager-hero { align-items: flex-start; flex-direction: column; padding: 24px; } .tm-manager-grid { grid-template-columns: 1fr; } .tm-manager-card { min-height: 0; } }
        `;
        document.head.appendChild(style);
    }
})();
