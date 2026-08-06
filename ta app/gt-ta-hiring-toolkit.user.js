// ==UserScript==
// @name         GT TA Hiring Toolkit
// @namespace    https://gatech.edu/
// @version      2.10.0
// @description  Unified dashboards, search, ranking tools, student details, and styling for the GT TA Hiring application.
// @match        https://ta-app.cc.gatech.edu/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

(function installToolkitRuntime(global) {
    'use strict';

    if (global.GTTAHiringToolkit) return;

    const features = [];
    let started = false;

    const utils = Object.freeze({
        clean(value) {
            return String(value || '').replace(/\s+/g, ' ').trim();
        },
        normalize(value) {
            return utils.clean(value)
                .toLowerCase()
                .normalize('NFD')
                .replace(/[\u0300-\u036f]/g, '');
        },
        escapeHtml(value) {
            return String(value ?? '').replace(/[&<>"']/g, character => ({
                '&': '&amp;',
                '<': '&lt;',
                '>': '&gt;',
                '"': '&quot;',
                "'": '&#39;'
            })[character]);
        },
        escapeAttribute(value) {
            return utils.escapeHtml(value);
        }
    });

    global.GTTAHiringToolkit = Object.freeze({
        register(feature) {
            if (started) {
                throw new Error(`Cannot register feature after startup: ${feature?.id}`);
            }
            if (!feature?.id || typeof feature.init !== 'function') {
                throw new TypeError('A toolkit feature requires an id and init function.');
            }
            if (features.some(candidate => candidate.id === feature.id)) {
                throw new Error(`Duplicate toolkit feature id: ${feature.id}`);
            }
            features.push(Object.freeze({ ...feature }));
        },

        start() {
            if (started) return;
            started = true;

            features.forEach(feature => {
                try {
                    feature.init();
                } catch (error) {
                    console.error(`[GT TA Toolkit] ${feature.name || feature.id} failed`, error);
                }
            });
        },

        getFeatures() {
            return features.map(({ id, name }) => ({ id, name }));
        },

        utils
    });
})(window);

(function registerToolkitFeatures(toolkit) {
    'use strict';

    toolkit.register({
        id: 'shared-theme',
        name: 'Shared Theme',
        init() {
            if (document.getElementById('gt-ta-toolkit-theme')) return;

            const style = document.createElement('style');
            style.id = 'gt-ta-toolkit-theme';
            style.textContent = `
:root { --tm-bg: #f6f8fb; --tm-surface: #ffffff; --tm-surface-alt: #f5f6f7; --tm-text: #222222; --tm-muted: #667085; --tm-border: #d0d5dd; --tm-accent: #b3a369; --tm-accent-dark: #857437; --tm-navy: #003057; --tm-focus: #1769aa; --tm-danger: #b42318; --tm-success: #18794e; --tm-radius: 12px; --tm-shadow: 0 5px 18px rgba(0, 0, 0, .08); } body.tm-dark { --tm-bg: #171717; --tm-surface: #232323; --tm-surface-alt: #303030; --tm-text: #f5f5f5; --tm-muted: #b9b9b9; --tm-border: #555555; --tm-accent: #d6c57f; --tm-accent-dark: #f0df9b; --tm-focus: #80bfff; --tm-shadow: 0 8px 24px rgba(0, 0, 0, .4); } body.gt-ta-toolkit-page { min-height: 100vh; margin: 0; background: var(--tm-bg); color: var(--tm-text); font-family: Inter, -apple-system, BlinkMacSystemFont, "Segoe UI", sans-serif; } body.gt-ta-toolkit-page > .container, body.gt-ta-toolkit-page main.container { width: min(1460px, calc(100% - 40px)); margin-inline: auto; } body.gt-ta-toolkit-page main { padding-bottom: 60px; } @media (max-width: 760px) { body.gt-ta-toolkit-page > .container, body.gt-ta-toolkit-page main.container { width: min(100% - 24px, 1460px); } } #tm-user-search, #tm-course-dashboard, #tm-instructor-dashboard, #taPowerToolsPanel { color: var(--tm-text); } .tm-dashboard-header, .tm-panel, #taPowerToolsPanel { border-color: var(--tm-border) !important; border-radius: var(--tm-radius) !important; background: var(--tm-surface) !important; box-shadow: var(--tm-shadow) !important; } .tm-dashboard-header { display: flex; align-items: center; justify-content: space-between; gap: 18px; margin-bottom: 15px; padding: 20px; } .tm-dashboard-header h2 { margin: 0 0 5px; } .tm-dashboard-header p { margin: 0; color: var(--tm-muted); } .tm-view-tabs { display: flex; gap: 0; } .tm-view-tabs button { display: inline-flex; align-items: center; gap: 7px; padding: 11px 18px; border: 1px solid #aaa; background: #f2f2f2; cursor: pointer; font-weight: 700; } .tm-view-tabs button + button { margin-left: -1px; } .tm-view-tabs button:first-child { border-radius: 8px 0 0; } .tm-view-tabs button:last-child { border-radius: 0 8px 0 0; } .tm-view-tabs :is(.tm-active, .tm-active-tab) { background: #333; color: white; } .tm-toolbar { position: sticky; top: 0; z-index: 100; display: grid; align-items: end; gap: 12px; padding: 15px; border: 1px solid var(--tm-border); background: color-mix(in srgb, var(--tm-surface) 97%, transparent); box-shadow: 0 4px 13px rgba(0, 0, 0, .08); } .tm-toolbar label { display: block; margin-bottom: 5px; color: var(--tm-muted); font-size: .82rem; font-weight: 700; } .tm-toolbar :is(input, select) { width: 100%; min-height: 43px; padding: 8px 10px; border: 1px solid #aaa; border-radius: 6px; background: var(--tm-surface); color: var(--tm-text); } .tm-secondary-button { min-height: 43px; padding: 8px 15px; border: 1px solid #888; border-radius: 6px; background: var(--tm-surface); color: var(--tm-text); cursor: pointer; } .tm-primary-button, .tm-save-button { border-color: var(--tm-accent-dark) !important; background: var(--tm-accent) !important; } :is(#tm-user-search, #tm-course-dashboard, #tm-instructor-dashboard, #taPowerToolsPanel) :is(button, input, select, textarea):focus-visible { outline: 3px solid color-mix(in srgb, var(--tm-focus) 28%, transparent) !important; outline-offset: 1px; }
`;
            document.head.appendChild(style);
        }
    });

// ---- feature: landing-page ----
    toolkit.register({
        id: 'landing-page',
        name: 'Landing Page',
        init() {
        (function () {
            'use strict';

            const main = document.querySelector('main.container');
            const applyLink = main?.querySelector('a[href="/apply"]');
            const loginLink = document.querySelector('#page-navigation a[href="/login"]');

            if (!main || !applyLink || !loginLink || document.getElementById('tm-landing-card')) {
                return;
            }

            const originalButton = applyLink.closest('button');
            const version = main.querySelector('small')?.textContent.trim() || '';
            const card = document.createElement('section');
            card.id = 'tm-landing-card';
            card.setAttribute('aria-labelledby', 'tm-landing-title');
            card.innerHTML = `
                <div class="tm-landing-mark" aria-hidden="true">TA</div>
                <p class="tm-landing-eyebrow">Georgia Tech College of Computing</p>
                <h1 id="tm-landing-title">TA Hiring Workspace</h1>
                <p class="tm-landing-copy">
                    Sign in to manage courses, review applicants, and build your
                    teaching assistant team.
                </p>
                <a class="tm-landing-action" href="${loginLink.href}">
                    Instructor login
                    <span aria-hidden="true">→</span>
                </a>
                <a class="tm-landing-secondary" href="${applyLink.href}">
                    Looking for the student application?
                </a>
                ${version ? `<small class="tm-landing-version">${toolkit.utils.escapeHtml(version)}</small>` : ''}
            `;

            originalButton?.remove();
            main.querySelector('small')?.remove();
            main.appendChild(card);
            document.body.classList.add('gt-ta-landing-page');

            const style = document.createElement('style');
            style.textContent = `
        body.gt-ta-landing-page main.container { display: grid; place-items: center; min-height: clamp(430px, 58vh, 680px); padding-block: 52px; } #tm-landing-card { width: min(100%, 620px); box-sizing: border-box; padding: clamp(30px, 5vw, 52px); border: 1px solid #d7d0b8; border-top: 5px solid #b3a369; border-radius: 14px; background: #fff; color: #262626; box-shadow: 0 18px 50px rgba(0, 48, 87, .12); text-align: center; } .tm-landing-mark { display: grid; place-items: center; width: 58px; height: 58px; margin: 0 auto 20px; border-radius: 14px; background: #003057; color: #fff; font: 700 20px/1 Roboto, sans-serif; letter-spacing: .04em; box-shadow: inset 0 -4px 0 #b3a369; } .tm-landing-eyebrow { margin: 0 0 8px; color: #6f622b; font-size: 12px; font-weight: 700; letter-spacing: .1em; text-transform: uppercase; } #tm-landing-title { margin: 0; color: #003057; font-family: "Roboto Slab", Georgia, serif; font-size: clamp(28px, 5vw, 42px); line-height: 1.15; } .tm-landing-copy { max-width: 450px; margin: 16px auto 26px; color: #56616a; font-size: 17px; line-height: 1.6; } .tm-landing-action { display: inline-flex; align-items: center; justify-content: center; gap: 12px; min-height: 48px; padding: 0 22px; border: 2px solid #003057; border-radius: 8px; background: #003057; color: #fff !important; font-size: 16px; font-weight: 700; text-decoration: none !important; transition: background .15s, box-shadow .15s, transform .15s; } .tm-landing-action:hover, .tm-landing-action:focus-visible { background: #004f87; box-shadow: 0 7px 18px rgba(0, 48, 87, .22); transform: translateY(-1px); } .tm-landing-action:focus-visible { outline: 3px solid rgba(179, 163, 105, .55); outline-offset: 3px; } .tm-landing-version { display: block; margin-top: 18px; color: #7a838a; font-size: 11px; } .tm-landing-secondary { display: block; width: fit-content; margin: 16px auto 0; color: #56616a !important; font-size: 13px; text-underline-offset: 3px; } @media (max-width: 600px) { body.gt-ta-landing-page main.container { min-height: 0; padding-block: 28px; } #tm-landing-card { padding: 30px 22px; border-radius: 10px; } }
        `;
            document.head.appendChild(style);
        })();
        }
    });

// ---- feature: instructor-home ----
    toolkit.register({
        id: 'instructor-home',
        name: 'Instructor Home',
        init() {
        (function () {
            'use strict';

            const main = document.querySelector('main.container');
            const guideHeading = Array.from(main?.querySelectorAll(':scope > h2') || [])
                .find(heading => heading.textContent.trim() === 'Instructions for Use');
            const coursesLink = document.querySelector(
                '#page-navigation a[href^="/instructor-admin"]'
            );
            const logoutLink = document.querySelector('#page-navigation a[href="/logout"]');

            if (
                !main ||
                !guideHeading ||
                !coursesLink ||
                !logoutLink ||
                document.getElementById('tm-instructor-home')
            ) {
                return;
            }

            const managerLink = document.querySelector(
                '#page-navigation a[href^="/admin/manager"]'
            );
            const username = logoutLink.textContent.replace(/^\s*Logout\s*/i, '').trim();
            const originalApplyButton = main.querySelector(':scope > button');
            const version = main.querySelector(':scope > small, :scope > p > small');
            const versionContainer = version?.parentElement;

            originalApplyButton?.remove();
            version?.remove();
            if (
                versionContainer?.matches('p') &&
                !versionContainer.textContent.trim() &&
                !versionContainer.children.length
            ) {
                versionContainer.remove();
            }

            const shell = document.createElement('div');
            shell.id = 'tm-instructor-home';
            shell.innerHTML = `
                <section class="tm-home-hero">
                    <div>
                        <p class="tm-home-eyebrow">Instructor workspace</p>
                        <h1>Welcome${username ? `, ${toolkit.utils.escapeHtml(username)}` : ''}</h1>
                        <p class="tm-home-intro">
                            Review applicants, rank candidates, and track hiring for
                            your upcoming courses.
                        </p>
                    </div>
                    <div class="tm-home-actions">
                        <a class="tm-home-primary" href="${coursesLink.href}">
                            View my courses <span aria-hidden="true">→</span>
                        </a>
                        ${managerLink ? `
                            <a class="tm-home-secondary" href="${managerLink.href}">
                                Manager tools
                            </a>
                        ` : ''}
                    </div>
                </section>

                <section class="tm-home-overview" aria-label="Hiring workflow">
                    <article><span>1</span><strong>Choose a course</strong><small>Open an upcoming course from your dashboard.</small></article>
                    <article><span>2</span><strong>Review applicants</strong><small>Check experience, interest, conflicts, and details.</small></article>
                    <article><span>3</span><strong>Rank and save</strong><small>Place candidates carefully, then save your rankings.</small></article>
                </section>
            `;

            const guide = document.createElement('details');
            guide.className = 'tm-home-guide';
            guide.open = true;
            guide.innerHTML = `
                <summary>
                    <span>
                        <strong>Instructor ranking guide</strong>
                        <small>Detailed instructions and examples</small>
                    </span>
                    <span class="tm-guide-toggle" aria-hidden="true"></span>
                </summary>
                <div class="tm-guide-content"></div>
            `;

            const guideContent = guide.querySelector('.tm-guide-content');
            guideHeading.remove();

            Array.from(main.children).forEach(child => {
                if (child === shell || child === version) return;
                if (child.matches('p')) child.classList.add('tm-guide-step');
                guideContent.appendChild(child);
            });

            main.prepend(shell);
            shell.appendChild(guide);

            if (version) {
                version.classList.add('tm-home-version');
                shell.appendChild(version);
            }

            document.body.classList.add('gt-ta-instructor-home');

            const style = document.createElement('style');
            style.textContent = `
        body.gt-ta-instructor-home { background: #f5f7f9; color: #26313a; } body.gt-ta-instructor-home main.container { width: min(1180px, calc(100% - 32px)); max-width: none; padding-block: 34px 60px; } #tm-instructor-home { display: grid; gap: 20px; } .tm-home-hero { display: flex; align-items: center; justify-content: space-between; gap: 30px; padding: clamp(26px, 4vw, 42px); border-top: 5px solid #b3a369; border-radius: 14px; background: linear-gradient(135deg, #003057, #074a75); color: #fff; box-shadow: 0 16px 38px rgba(0, 48, 87, .18); } .tm-home-eyebrow { margin: 0 0 7px; color: #e4d58e; font-size: 12px; font-weight: 800; letter-spacing: .12em; text-transform: uppercase; } .tm-home-hero h1 { margin: 0; color: #fff; font-family: "Roboto Slab", Georgia, serif; font-size: clamp(30px, 4vw, 44px); line-height: 1.15; } .tm-home-intro { max-width: 590px; margin: 12px 0 0; color: #e8eef2; font-size: 17px; line-height: 1.55; } .tm-home-actions { display: flex; flex: 0 0 auto; flex-direction: column; gap: 9px; min-width: 205px; } .tm-home-actions a { display: inline-flex; align-items: center; justify-content: center; gap: 10px; min-height: 46px; padding: 0 18px; border-radius: 7px; font-weight: 700; text-decoration: none !important; } .tm-home-primary { border: 2px solid #d6c57f; background: #d6c57f; color: #17242d !important; } .tm-home-secondary { border: 1px solid rgba(255, 255, 255, .55); color: #fff !important; } .tm-home-actions a:hover { filter: brightness(1.06); } .tm-home-actions a:focus-visible { outline: 3px solid #fff; outline-offset: 3px; } .tm-home-overview { display: grid; grid-template-columns: repeat(3, 1fr); gap: 14px; } .tm-home-overview article { display: grid; grid-template-columns: 38px 1fr; column-gap: 12px; padding: 18px; border: 1px solid #d9dfe4; border-radius: 10px; background: #fff; box-shadow: 0 3px 10px rgba(20, 35, 45, .05); } .tm-home-overview article > span { display: grid; grid-row: span 2; place-items: center; width: 36px; height: 36px; border-radius: 50%; background: #e8eef3; color: #003057; font-weight: 800; } .tm-home-overview strong { color: #26313a; font-size: 15px; } .tm-home-overview small { margin-top: 3px; color: #68757f; line-height: 1.4; } .tm-home-guide { overflow: hidden; border: 1px solid #d4dbe0; border-radius: 12px; background: #fff; box-shadow: 0 5px 16px rgba(20, 35, 45, .06); } .tm-home-guide > summary { display: flex; align-items: center; justify-content: space-between; padding: 20px 24px; cursor: pointer; list-style: none; } .tm-home-guide > summary::-webkit-details-marker { display: none; } .tm-home-guide > summary strong { display: block; color: #003057; font-size: 19px; } .tm-home-guide > summary small { display: block; margin-top: 3px; color: #6b7780; } .tm-guide-toggle::before { content: 'Show'; color: #52616b; font-weight: 700; } .tm-home-guide[open] .tm-guide-toggle::before { content: 'Hide'; } .tm-guide-content { padding: 4px 24px 28px; counter-reset: guide-step; } .tm-guide-step { position: relative; margin: 0; padding: 20px 20px 20px 64px; border-top: 1px solid #e3e7ea; color: #38454e; font-size: 15px; line-height: 1.65; counter-increment: guide-step; } .tm-guide-step::before { content: counter(guide-step); position: absolute; top: 18px; left: 12px; display: grid; place-items: center; width: 32px; height: 32px; border-radius: 50%; background: #003057; color: #fff; font-weight: 800; } .tm-guide-step img { display: block; width: auto; max-width: min(100%, 900px); max-height: 520px; margin: 16px auto 2px; border: 1px solid #d5dce1; border-radius: 8px; box-shadow: 0 5px 16px rgba(20, 35, 45, .09); } .tm-guide-step strong[style*="red"] { display: inline-block; margin-block: 7px; padding: 5px 8px; border-left: 4px solid #b42318; background: #fff1f0; color: #8e1b13 !important; } .tm-home-version { justify-self: end; color: #7b858c; font-size: 11px; } @media (max-width: 760px) { .tm-home-hero { align-items: stretch; flex-direction: column; } .tm-home-actions { min-width: 0; } .tm-home-overview { grid-template-columns: 1fr; } .tm-guide-content { padding-inline: 14px; } .tm-guide-step { padding-left: 52px; } .tm-guide-step::before { left: 6px; } }
        `;
            document.head.appendChild(style);
        })();
        }
    });

// ---- feature: page-enhancer ----
    toolkit.register({
        id: 'page-enhancer',
        name: 'Page Enhancer',
        init() {
        (function () {
            'use strict';

            const { escapeHtml, normalize } = toolkit.utils;

            const USER_SELECT_ID = 'course_user_instructor_user';
            const RECENTS_KEY = 'gt-ta-hiring-recent-users';
            const FAVORITES_KEY = 'gt-ta-hiring-favorite-users';
            const MAX_RECENTS = 8;

            const userSelect = document.getElementById(USER_SELECT_ID);
            const form = userSelect?.closest('form');

            // Only activate on the appropriate page.
            if (!userSelect || !form || form.name !== 'course_user_instructor') {
                return;
            }

            if (document.getElementById('tm-user-search')) {
                return;
            }

            document.body.classList.add('gt-ta-toolkit-page');

            const users = Array.from(userSelect.options)
                .filter(option => option.value)
                .map(option => ({
                    value: option.value,
                    text: option.textContent.trim(),
                    normalized: normalize(option.textContent)
                }));

            let visibleUsers = [];
            let activeIndex = -1;

            addStyles();
            buildInterface();
            improveExistingForm();

            function buildInterface() {
                const panel = document.createElement('section');
                panel.className = 'tm-panel';

                panel.innerHTML = `
                    <div class="tm-panel-header">
                        <div>
                            <h2>Select a user</h2>
                            <div class="tm-subtitle">
                                Search ${users.length.toLocaleString()} users by name or username
                            </div>
                        </div>

                        <button type="button" id="tm-dark-mode" class="tm-icon-button"
                                title="Toggle dark mode">
                            ◐
                        </button>
                    </div>

                    <div class="tm-search-row">
                        <input
                            id="tm-user-search"
                            type="search"
                            placeholder="Start typing a name or username..."
                            autocomplete="off"
                            spellcheck="false"
                        >

                        <button type="button" id="tm-clear-search" class="tm-secondary-button">
                            Clear
                        </button>
                    </div>

                    <div class="tm-shortcuts">
                        <span><kbd>↑</kbd><kbd>↓</kbd> navigate</span>
                        <span><kbd>Enter</kbd> select</span>
                        <span><kbd>/</kbd> search</span>
                        <span><kbd>Esc</kbd> clear</span>
                    </div>

                    <div id="tm-selected-user" class="tm-selected-user">
                        No user selected
                    </div>

                    <div id="tm-favorites-section" class="tm-chip-section"></div>
                    <div id="tm-recents-section" class="tm-chip-section"></div>

                    <div class="tm-results-header">
                        <span>Results</span>
                        <span id="tm-result-count"></span>
                    </div>

                    <div id="tm-user-results" class="tm-results" role="listbox"></div>
                `;

                userSelect.parentElement.insertBefore(panel, userSelect);

                // Keep the original select in the form, but hide it.
                userSelect.classList.add('tm-hidden-select');
                userSelect.tabIndex = -1;
                userSelect.setAttribute('aria-hidden', 'true');

                const search = document.getElementById('tm-user-search');
                const clearButton = document.getElementById('tm-clear-search');
                const darkModeButton = document.getElementById('tm-dark-mode');

                search.addEventListener('input', () => {
                    renderUsers(search.value);
                });

                search.addEventListener('keydown', handleSearchKeyboard);

                clearButton.addEventListener('click', () => {
                    search.value = '';
                    renderUsers('');
                    search.focus();
                });

                darkModeButton.addEventListener('click', () => {
                    document.body.classList.toggle('tm-dark');
                    localStorage.setItem(
                        'gt-ta-hiring-dark-mode',
                        document.body.classList.contains('tm-dark') ? 'true' : 'false'
                    );
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
                        search.focus();
                        search.select();
                    }
                });

                userSelect.addEventListener('change', updateSelectedUser);

                form.addEventListener('submit', event => {
                    if (!userSelect.value) {
                        event.preventDefault();
                        showNotice('Select a user before saving.', true);
                        search.focus();
                        return;
                    }

                    const selectedText =
                        userSelect.options[userSelect.selectedIndex]?.textContent.trim();

                    const confirmed = window.confirm(
                        `Add "${selectedText}" as an instructor?`
                    );

                    if (!confirmed) {
                        event.preventDefault();
                    }
                });

                if (localStorage.getItem('gt-ta-hiring-dark-mode') === 'true') {
                    document.body.classList.add('tm-dark');
                }

                renderFavorites();
                renderRecents();
                renderUsers('');
                updateSelectedUser();

                search.focus();
            }

            function renderUsers(query) {
                const results = document.getElementById('tm-user-results');
                const count = document.getElementById('tm-result-count');

                const normalizedQuery = normalize(query);
                const terms = normalizedQuery.split(/\s+/).filter(Boolean);

                visibleUsers = users
                    .filter(user =>
                        terms.every(term => user.normalized.includes(term))
                    )
                    .map(user => ({
                        ...user,
                        score: calculateScore(user.normalized, normalizedQuery, terms)
                    }))
                    .sort((a, b) =>
                        b.score - a.score || a.text.localeCompare(b.text)
                    )
                    .slice(0, normalizedQuery ? 100 : 40);

                activeIndex = visibleUsers.length ? 0 : -1;

                count.textContent = normalizedQuery
                    ? `${visibleUsers.length}${visibleUsers.length === 100 ? '+' : ''}`
                    : `Showing 40 of ${users.length.toLocaleString()}`;

                results.replaceChildren();

                if (!visibleUsers.length) {
                    const empty = document.createElement('div');
                    empty.className = 'tm-empty';
                    empty.textContent = 'No users matched your search.';
                    results.appendChild(empty);
                    return;
                }

                visibleUsers.forEach((user, index) => {
                    const row = document.createElement('div');
                    row.className = 'tm-result-row';
                    row.dataset.index = index;
                    row.setAttribute('role', 'option');

                    const selectButton = document.createElement('button');
                    selectButton.type = 'button';
                    selectButton.className = 'tm-result-button';
                    selectButton.innerHTML = highlight(user.text, terms);
                    selectButton.addEventListener('click', () => selectUser(user));

                    const favoriteButton = document.createElement('button');
                    favoriteButton.type = 'button';
                    favoriteButton.className = 'tm-favorite-button';
                    favoriteButton.title = 'Add or remove favorite';
                    favoriteButton.textContent = isFavorite(user.value) ? '★' : '☆';

                    favoriteButton.addEventListener('click', event => {
                        event.stopPropagation();
                        toggleFavorite(user);
                        favoriteButton.textContent =
                            isFavorite(user.value) ? '★' : '☆';
                    });

                    row.append(selectButton, favoriteButton);

                    row.addEventListener('mousemove', () => {
                        setActiveIndex(index);
                    });

                    results.appendChild(row);
                });

                updateActiveResult();
            }

            function handleSearchKeyboard(event) {
                if (event.key === 'ArrowDown') {
                    event.preventDefault();

                    if (visibleUsers.length) {
                        setActiveIndex((activeIndex + 1) % visibleUsers.length);
                    }
                }

                if (event.key === 'ArrowUp') {
                    event.preventDefault();

                    if (visibleUsers.length) {
                        setActiveIndex(
                            (activeIndex - 1 + visibleUsers.length) %
                            visibleUsers.length
                        );
                    }
                }

                if (event.key === 'Enter') {
                    if (activeIndex >= 0 && visibleUsers[activeIndex]) {
                        event.preventDefault();
                        selectUser(visibleUsers[activeIndex]);
                    }
                }

                if (event.key === 'Escape') {
                    event.preventDefault();
                    event.currentTarget.value = '';
                    renderUsers('');
                }
            }

            function setActiveIndex(index) {
                activeIndex = index;
                updateActiveResult();
            }

            function updateActiveResult() {
                document.querySelectorAll('.tm-result-row').forEach((row, index) => {
                    const active = index === activeIndex;
                    row.classList.toggle('tm-active', active);
                    row.setAttribute('aria-selected', active ? 'true' : 'false');

                    if (active) {
                        row.scrollIntoView({ block: 'nearest' });
                    }
                });
            }

            function selectUser(user) {
                userSelect.value = user.value;
                userSelect.dispatchEvent(new Event('change', { bubbles: true }));

                addRecent(user);
                renderRecents();

                const search = document.getElementById('tm-user-search');
                search.value = user.text;

                renderUsers(user.text);
                showNotice(`${user.text} selected.`);
            }

            function updateSelectedUser() {
                const box = document.getElementById('tm-selected-user');

                if (!box) {
                    return;
                }

                const selectedOption =
                    userSelect.options[userSelect.selectedIndex];

                if (!userSelect.value || !selectedOption) {
                    box.textContent = 'No user selected';
                    box.classList.remove('tm-has-selection');
                    return;
                }

                box.textContent = `Selected: ${selectedOption.textContent.trim()}`;
                box.classList.add('tm-has-selection');
            }

            function addRecent(user) {
                const recents = getStoredList(RECENTS_KEY)
                    .filter(item => item.value !== user.value);

                recents.unshift({
                    value: user.value,
                    text: user.text
                });

                localStorage.setItem(
                    RECENTS_KEY,
                    JSON.stringify(recents.slice(0, MAX_RECENTS))
                );
            }

            function renderRecents() {
                renderChipSection(
                    'tm-recents-section',
                    'Recent',
                    getStoredList(RECENTS_KEY),
                    false
                );
            }

            function renderFavorites() {
                renderChipSection(
                    'tm-favorites-section',
                    'Favorites',
                    getStoredList(FAVORITES_KEY),
                    true
                );
            }

            function renderChipSection(elementId, title, items, removable) {
                const section = document.getElementById(elementId);
                section.replaceChildren();

                const validItems = items.filter(item =>
                    users.some(user => user.value === item.value)
                );

                if (!validItems.length) {
                    return;
                }

                const label = document.createElement('span');
                label.className = 'tm-chip-label';
                label.textContent = `${title}:`;
                section.appendChild(label);

                validItems.forEach(item => {
                    const wrapper = document.createElement('span');
                    wrapper.className = 'tm-chip';

                    const selectButton = document.createElement('button');
                    selectButton.type = 'button';
                    selectButton.textContent = item.text;
                    selectButton.addEventListener('click', () => {
                        selectUser({
                            ...item,
                            normalized: normalize(item.text)
                        });
                    });

                    wrapper.appendChild(selectButton);

                    if (removable) {
                        const removeButton = document.createElement('button');
                        removeButton.type = 'button';
                        removeButton.className = 'tm-chip-remove';
                        removeButton.textContent = '×';
                        removeButton.title = 'Remove favorite';

                        removeButton.addEventListener('click', () => {
                            toggleFavorite(item);
                        });

                        wrapper.appendChild(removeButton);
                    }

                    section.appendChild(wrapper);
                });
            }

            function toggleFavorite(user) {
                let favorites = getStoredList(FAVORITES_KEY);

                if (favorites.some(item => item.value === user.value)) {
                    favorites = favorites.filter(item => item.value !== user.value);
                    showNotice(`${user.text} removed from favorites.`);
                } else {
                    favorites.unshift({
                        value: user.value,
                        text: user.text
                    });

                    showNotice(`${user.text} added to favorites.`);
                }

                localStorage.setItem(FAVORITES_KEY, JSON.stringify(favorites));
                renderFavorites();
            }

            function isFavorite(value) {
                return getStoredList(FAVORITES_KEY)
                    .some(item => item.value === value);
            }

            function getStoredList(key) {
                try {
                    const value = JSON.parse(localStorage.getItem(key) || '[]');
                    return Array.isArray(value) ? value : [];
                } catch {
                    return [];
                }
            }

            function improveExistingForm() {
                document.body.classList.add('tm-enhanced-page');
                form.classList.add('tm-enhanced-form');

                const heading = document.querySelector('main h1');

                if (heading) {
                    heading.classList.add('tm-page-title');
                }

                form.querySelectorAll(
                    `select:not(#${USER_SELECT_ID}), input:not(#tm-user-search), textarea`
                ).forEach(control => {
                    control.classList.add('tm-form-control');
                });

                form.querySelectorAll(
                    'button[type="submit"], input[type="submit"]'
                ).forEach(button => {
                    button.classList.add('tm-save-button');
                });

                const stickyBar = document.createElement('div');
                stickyBar.className = 'tm-sticky-save';

                const summary = document.createElement('span');
                summary.id = 'tm-sticky-summary';
                summary.textContent = 'Select a user to continue';

                const submit =
                    form.querySelector('button[type="submit"], input[type="submit"]');

                if (submit) {
                    const clonedSubmit = document.createElement('button');
                    clonedSubmit.type = 'button';
                    clonedSubmit.className = 'tm-save-button';
                    clonedSubmit.textContent = submit.value || submit.textContent || 'Save';

                    clonedSubmit.addEventListener('click', () => {
                        if (typeof form.requestSubmit === 'function') {
                            form.requestSubmit(submit);
                        } else {
                            submit.click();
                        }
                    });

                    stickyBar.append(summary, clonedSubmit);
                    document.body.appendChild(stickyBar);

                    userSelect.addEventListener('change', () => {
                        const selected =
                            userSelect.options[userSelect.selectedIndex];

                        summary.textContent = userSelect.value
                            ? selected.textContent.trim()
                            : 'Select a user to continue';
                    });
                }
            }

            function showNotice(message, error = false) {
                let notice = document.getElementById('tm-notice');

                if (!notice) {
                    notice = document.createElement('div');
                    notice.id = 'tm-notice';
                    document.body.appendChild(notice);
                }

                notice.textContent = message;
                notice.className = error
                    ? 'tm-notice tm-notice-error'
                    : 'tm-notice';

                clearTimeout(showNotice.timeout);

                showNotice.timeout = setTimeout(() => {
                    notice.classList.add('tm-notice-hide');
                }, 2500);
            }

            function calculateScore(text, query, terms) {
                if (!query) {
                    return 0;
                }

                let score = 0;

                if (text === query) {
                    score += 1000;
                }

                if (text.startsWith(query)) {
                    score += 500;
                }

                if (text.includes(` ${query}`)) {
                    score += 300;
                }

                terms.forEach(term => {
                    if (text.startsWith(term)) {
                        score += 100;
                    }

                    if (text.includes(` ${term}`)) {
                        score += 75;
                    }

                    if (text.includes(term)) {
                        score += 25;
                    }
                });

                score -= text.length / 100;
                return score;
            }

            function highlight(text, terms) {
                if (!terms.length) {
                    return escapeHtml(text);
                }

                let result = escapeHtml(text);

                terms
                    .sort((a, b) => b.length - a.length)
                    .forEach(term => {
                        const safeTerm = escapeRegExp(term);

                        result = result.replace(
                            new RegExp(`(${safeTerm})`, 'gi'),
                            '<mark>$1</mark>'
                        );
                    });

                return result;
            }

            function escapeRegExp(value) {
                return value.replace(/[.*+?^${}()|[\]\\]/g, '\\$&');
            }

            function addStyles() {
                const style = document.createElement('style');

                style.textContent = `
        :root { --tm-bg: #ffffff; --tm-surface: #ffffff; --tm-surface-alt: #f5f6f7; --tm-text: #222222; --tm-muted: #667085; --tm-border: #d0d5dd; --tm-accent: #b3a369; --tm-accent-dark: #857437; --tm-focus: #1769aa; --tm-danger: #b42318; --tm-success: #18794e; --tm-shadow: 0 8px 24px rgba(0, 0, 0, 0.12); } body.tm-dark { --tm-bg: #171717; --tm-surface: #232323; --tm-surface-alt: #303030; --tm-text: #f5f5f5; --tm-muted: #b9b9b9; --tm-border: #555555; --tm-accent: #d6c57f; --tm-accent-dark: #f0df9b; --tm-focus: #80bfff; --tm-shadow: 0 8px 24px rgba(0, 0, 0, 0.4); } body.tm-enhanced-page { background: var(--tm-bg); color: var(--tm-text); padding-bottom: 90px; } .tm-page-title { margin: 30px 0 18px; font-weight: 700; } .tm-enhanced-form { max-width: 950px; } .tm-panel { margin: 12px 0 24px; padding: 22px; border: 1px solid var(--tm-border); border-radius: 12px; background: var(--tm-surface); box-shadow: var(--tm-shadow); color: var(--tm-text); } .tm-panel-header { display: flex; align-items: flex-start; justify-content: space-between; gap: 15px; margin-bottom: 16px; } .tm-panel-header h2 { margin: 0; font-size: 1.4rem; color: var(--tm-text); } .tm-subtitle { margin-top: 4px; color: var(--tm-muted); } .tm-search-row { display: flex; gap: 10px; } #tm-user-search { width: 100%; min-height: 48px; padding: 10px 14px; border: 2px solid var(--tm-border); border-radius: 8px; background: var(--tm-surface); color: var(--tm-text); font-size: 1.05rem; } #tm-user-search:focus { border-color: var(--tm-focus); outline: 3px solid color-mix(in srgb, var(--tm-focus) 20%, transparent); } .tm-secondary-button, .tm-icon-button { border: 1px solid var(--tm-border); border-radius: 8px; background: var(--tm-surface-alt); color: var(--tm-text); cursor: pointer; } .tm-secondary-button { padding: 8px 16px; } .tm-icon-button { width: 40px; height: 40px; font-size: 1.3rem; } .tm-shortcuts { display: flex; flex-wrap: wrap; gap: 14px; margin: 10px 0; color: var(--tm-muted); font-size: 0.86rem; } kbd { margin-right: 3px; padding: 2px 6px; border: 1px solid var(--tm-border); border-radius: 4px; background: var(--tm-surface-alt); color: var(--tm-text); box-shadow: 0 1px 1px rgba(0,0,0,.12); } .tm-selected-user { margin: 14px 0; padding: 11px 13px; border-left: 4px solid var(--tm-border); border-radius: 5px; background: var(--tm-surface-alt); color: var(--tm-muted); font-weight: 500; } .tm-selected-user.tm-has-selection { border-left-color: var(--tm-success); color: var(--tm-text); } .tm-chip-section { display: flex; flex-wrap: wrap; align-items: center; gap: 7px; margin: 10px 0; } .tm-chip-label { color: var(--tm-muted); font-weight: 600; } .tm-chip { display: inline-flex; overflow: hidden; border: 1px solid var(--tm-border); border-radius: 999px; background: var(--tm-surface-alt); } .tm-chip button { border: 0; background: transparent; color: var(--tm-text); cursor: pointer; padding: 5px 10px; } .tm-chip .tm-chip-remove { padding-left: 4px; color: var(--tm-muted); font-size: 1.1rem; } .tm-results-header { display: flex; justify-content: space-between; margin-top: 18px; padding-bottom: 7px; color: var(--tm-muted); font-weight: 600; } .tm-results { max-height: 390px; overflow-y: auto; border: 1px solid var(--tm-border); border-radius: 8px; background: var(--tm-surface); } .tm-result-row { display: flex; align-items: stretch; border-bottom: 1px solid var(--tm-border); } .tm-result-row:last-child { border-bottom: 0; } .tm-result-row:hover, .tm-result-row.tm-active { background: var(--tm-surface-alt); } .tm-result-row.tm-active { box-shadow: inset 4px 0 var(--tm-accent); } .tm-result-button { flex: 1; padding: 11px 13px; border: 0; background: transparent; color: var(--tm-text); text-align: left; cursor: pointer; } .tm-favorite-button { width: 48px; border: 0; border-left: 1px solid var(--tm-border); background: transparent; color: var(--tm-accent-dark); cursor: pointer; font-size: 1.3rem; } mark { padding: 0; background: #fff0a8; color: #111111; font-weight: 700; } .tm-empty { padding: 28px; color: var(--tm-muted); text-align: center; } .tm-hidden-select { position: absolute !important; width: 1px !important; height: 1px !important; overflow: hidden !important; opacity: 0 !important; pointer-events: none !important; } .tm-form-control { max-width: 100%; min-height: 42px; padding: 8px 10px; border: 1px solid var(--tm-border); border-radius: 6px; } .tm-save-button { padding: 10px 22px !important; border: 0 !important; border-radius: 7px !important; background: var(--tm-accent) !important; color: #111111 !important; font-weight: 700 !important; cursor: pointer !important; } .tm-save-button:hover { filter: brightness(0.95); } .tm-sticky-save { position: fixed; right: 0; bottom: 0; left: 0; z-index: 10000; display: flex; align-items: center; justify-content: space-between; gap: 20px; padding: 12px max(20px, calc((100vw - 1140px) / 2)); border-top: 1px solid var(--tm-border); background: var(--tm-surface); color: var(--tm-text); box-shadow: 0 -4px 18px rgba(0, 0, 0, 0.13); } .tm-notice { position: fixed; top: 20px; right: 20px; z-index: 20000; max-width: 400px; padding: 12px 18px; border-radius: 7px; background: var(--tm-success); color: white; box-shadow: var(--tm-shadow); opacity: 1; transition: opacity 0.3s, transform 0.3s; } .tm-notice-error { background: var(--tm-danger); } .tm-notice-hide { opacity: 0; transform: translateY(-10px); pointer-events: none; } @media (max-width: 700px) { .tm-panel { padding: 14px; } .tm-search-row { flex-direction: column; } .tm-sticky-save { padding: 10px 14px; } .tm-shortcuts { display: none; } }
        `;

                document.head.appendChild(style);
            }
        })();
        }
    });

// ---- feature: my-courses ----
    toolkit.register({
        id: 'my-courses',
        name: 'My Courses Dashboard',
        init() {
        (function () {
            'use strict';

            const { clean, escapeAttribute, escapeHtml, normalize } = toolkit.utils;

            const heading = document.querySelector('main h1');
            const originalTable = document.querySelector('main table.table');
            const isManager = Boolean(document.querySelector(
                '#page-navigation a[href^="/admin/manager"]'
            ));

            if (
                !heading ||
                !originalTable ||
                heading.textContent.trim().toLowerCase() !== 'my current courses' ||
                document.getElementById('tm-course-dashboard')
            ) {
                return;
            }

            const STORAGE = {
                myCourses: 'gt-ta-my-courses',
                managedCourses: 'gt-ta-managed-courses',
                activeView: 'gt-ta-course-active-view',
                displayMode: 'gt-ta-course-display-mode',
                semester: 'gt-ta-course-semester',
                minimumCapacity: 'gt-ta-course-minimum-capacity',
                maximumCapacity: 'gt-ta-course-maximum-capacity',
                hideOlder: 'gt-ta-course-hide-older',
                collapsedTerms: 'gt-ta-course-collapsed-terms'
            };

            const courses = extractCourses();

            if (!courses.length) {
                return;
            }

            document.body.classList.add('gt-ta-toolkit-page');

            const semesters = getSemesters();
            const newestSemester = semesters[0]?.name || '';

            let activeView = isManager
                ? readString(STORAGE.activeView, 'my')
                : 'my';
            let displayMode = readString(STORAGE.displayMode, 'cards');
            let staffingChecks = new Map();

            addStyles();
            buildDashboard();
            render();
            if (isManager) checkManagerStaffing();

            function extractCourses() {
                return Array.from(
                    originalTable.querySelectorAll('tbody tr')
                ).map((row, index) => {
                    const cells = row.querySelectorAll('td');
                    const link = cells[0]?.querySelector('a');

                    if (!link) {
                        return null;
                    }

                    const fullName = clean(link.textContent);
                    const capacity = Number.parseInt(
                        clean(cells[1]?.textContent),
                        10
                    ) || 0;

                    const parsed = parseCourseName(fullName);

                    return {
                        id: extractSectionId(link.href) || `course-${index}`,
                        url: link.href,
                        fullName,
                        courseName: parsed.courseName,
                        semester: parsed.semester,
                        capacity,
                        normalized: normalize(
                            `${fullName} ${parsed.courseName} ${parsed.semester}`
                        )
                    };
                }).filter(Boolean);
            }

            function parseCourseName(fullName) {
                const match = fullName.match(
                    /^(.*?)\s+-\s+((?:Spring|Summer|Fall)\s+\d{4})$/i
                );

                if (!match) {
                    return {
                        courseName: fullName,
                        semester: 'Other'
                    };
                }

                return {
                    courseName: clean(match[1]),
                    semester: clean(match[2])
                };
            }

            function extractSectionId(url) {
                const match = String(url).match(/\/section\/(\d+)/);
                return match?.[1] || '';
            }

            function getSemesters() {
                const grouped = new Map();

                courses.forEach(course => {
                    if (!grouped.has(course.semester)) {
                        grouped.set(course.semester, []);
                    }

                    grouped.get(course.semester).push(course);
                });

                return Array.from(grouped.entries())
                    .map(([name, semesterCourses]) => ({
                        name,
                        courses: semesterCourses
                    }))
                    .sort((a, b) => semesterWeight(b.name) - semesterWeight(a.name));
            }

            function buildDashboard() {
                const dashboard = document.createElement('section');
                dashboard.id = 'tm-course-dashboard';

                dashboard.innerHTML = `
                    <div class="tm-dashboard-header">
                        <div>
                            <h2>Course Dashboard</h2>
                            <p>
                                Find your courses and open applicant rankings quickly.
                            </p>
                        </div>

                        <div class="tm-header-badges">
                            <span id="tm-visible-badge"></span>
                            <span id="tm-capacity-badge"></span>
                        </div>
                    </div>

                    ${isManager ? `
                        <div class="tm-view-tabs" role="tablist">
                            <button type="button" data-view="my">
                                My Courses
                                <span id="tm-my-count"></span>
                            </button>

                            <button type="button" data-view="managed">
                                Pinned Courses
                                <span id="tm-managed-count"></span>
                            </button>

                            <button type="button" data-view="all">
                                All Courses
                                <span>${courses.length}</span>
                            </button>
                        </div>
                    ` : ''}

                    <div class="tm-toolbar">
                        <div class="tm-search-field">
                            <label for="tm-course-search">Search</label>
                            <input
                                id="tm-course-search"
                                type="search"
                                placeholder="Search CS 2050, online, Fall 2026..."
                                autocomplete="off"
                                spellcheck="false"
                            >
                        </div>

                        <div>
                            <label for="tm-semester-filter">Semester</label>
                            <select id="tm-semester-filter">
                                <option value="">All semesters</option>

                                ${semesters.map(semester => `
                                    <option value="${escapeAttribute(semester.name)}">
                                        ${escapeHtml(semester.name)}
                                    </option>
                                `).join('')}
                            </select>
                        </div>

                        <div>
                            <label for="tm-course-sort">Sort</label>
                            <select id="tm-course-sort">
                                <option value="course">Course number</option>
                                <option value="capacity-desc">Highest capacity</option>
                                <option value="capacity-asc">Lowest capacity</option>
                                <option value="semester">Newest semester</option>
                            </select>
                        </div>

                        <div>
                            <label for="tm-min-capacity">Minimum capacity</label>
                            <input
                                id="tm-min-capacity"
                                type="number"
                                min="0"
                                step="1"
                                inputmode="numeric"
                                placeholder="Any"
                            >
                        </div>

                        <div>
                            <label for="tm-max-capacity">Maximum capacity</label>
                            <input
                                id="tm-max-capacity"
                                type="number"
                                min="0"
                                step="1"
                                inputmode="numeric"
                                placeholder="Any"
                            >
                        </div>

                        <button
                            id="tm-clear-course-filters"
                            class="tm-secondary-button"
                            type="button"
                        >
                            Clear
                        </button>
                    </div>

                    <div class="tm-options-row">
                        <label>
                            <input id="tm-hide-older" type="checkbox">
                            Show newest semester only
                        </label>

                        <div class="tm-display-buttons">
                            <button type="button" data-mode="cards">Cards</button>
                            <button type="button" data-mode="table">Table</button>
                        </div>
                    </div>

                    ${isManager ? `
                        <div id="tm-staffing-check" class="tm-staffing-check" aria-live="polite">
                            <span class="tm-staffing-spinner" aria-hidden="true"></span>
                            <span>Checking ${escapeHtml(newestSemester)} courses for staffing problems…</span>
                        </div>
                        <div class="tm-staffing-explainer">
                            <strong>How this check works:</strong>
                            Accepted and Offered TAs count toward staffing. Preferred candidates are not yet counted as staffed.
                            Returning TAs are shown as <strong>paid</strong>; New TAs are shown as <strong>unpaid</strong> for ratio planning.
                            Head TAs count toward the course allotment; Pending candidates are excluded.
                        </div>
                        <div id="tm-first-run-message" class="tm-first-run-message">
                            <strong>Personalize this dashboard:</strong>
                            open <em>All Courses</em>, then mark courses as
                            <strong>Mine</strong> or <strong>Pin</strong> them for quick access.
                            Your choices will remain saved in this browser.
                        </div>
                    ` : ''}

                    <div id="tm-course-results"></div>
                `;

                originalTable.before(dashboard);
                originalTable.style.display = 'none';

                const managerNotice = Array.from(
                    document.querySelectorAll('main p')
                ).find(paragraph =>
                    paragraph.textContent.includes('Managers see ALL')
                );

                if (managerNotice) {
                    managerNotice.style.display = 'none';
                }

                bindControls();
                restoreControls();
                updateButtons();
            }

            async function checkManagerStaffing() {
                const bar = document.getElementById('tm-staffing-check');
                try {
                    const reportPage = await fetch('/admin/report/', { credentials: 'same-origin' });
                    if (!reportPage.ok) throw new Error(`report page returned ${reportPage.status}`);
                    const reportDocument = new DOMParser().parseFromString(await reportPage.text(), 'text/html');
                    const option = [...reportDocument.querySelectorAll('#report_index_semester option')]
                        .find(item => clean(item.textContent) === newestSemester);
                    if (!option) throw new Error(`no report found for ${newestSemester}`);
                    const csvResponse = await fetch(
                        `/admin/report/create.csv?semester=${encodeURIComponent(option.value)}`,
                        { credentials: 'same-origin' }
                    );
                    if (!csvResponse.ok) throw new Error(`CSV returned ${csvResponse.status}`);
                    staffingChecks = buildStaffingChecks(parseSimpleCsv(await csvResponse.text()));
                    const problems = [...staffingChecks.values()].filter(check => check.level === 'problem').length;
                    const advisories = [...staffingChecks.values()].filter(check => check.level === 'advisory').length;
                    bar.className = `tm-staffing-check ${problems ? 'tm-staffing-has-problems' : 'tm-staffing-clear'}`;
                    bar.innerHTML = problems || advisories
                        ? `<strong>${problems} problem course${problems === 1 ? '' : 's'}</strong><span>· ${advisories} advisor${advisories === 1 ? 'y' : 'ies'} · ${escapeHtml(newestSemester)}. Marked below.</span>`
                        : `<strong>No staffing problems detected</strong><span>· ${escapeHtml(newestSemester)}</span>`;
                    render();
                } catch (error) {
                    bar.className = 'tm-staffing-check tm-staffing-error';
                    bar.textContent = `Staffing check unavailable: ${error.message}`;
                }
            }

            function buildStaffingChecks(rows) {
                const counts = new Map();
                rows.filter(row => clean(row.Semester) === newestSemester).forEach(row => {
                    const key = courseKey(row.Course);
                    if (!counts.has(key)) counts.set(key, { headTAs: 0, accepted: 0, offered: 0, preferred: 0, returning: 0, newCount: 0 });
                    const count = counts.get(key);
                    const status = clean(row.Status).toUpperCase();
                    if (status === 'HEADTA') count.headTAs += 1;
                    if (status === 'ACCEPT') count.accepted += 1;
                    if (status === 'OFFER') count.offered += 1;
                    if (status === 'PREFER') count.preferred += 1;
                    if (['ACCEPT', 'OFFER'].includes(status)) {
                        if (clean(row.TABefore).toUpperCase() === 'YES') count.returning += 1;
                        else count.newCount += 1;
                    }
                });

                const checks = new Map();
                courses.filter(course => course.semester === newestSemester).forEach(course => {
                    const count = counts.get(courseKey(course.courseName)) || {
                        headTAs: 0, accepted: 0, offered: 0, preferred: 0, returning: 0, newCount: 0
                    };
                    const committed = count.headTAs + count.accepted + count.offered;
                    const remaining = Math.max(0, course.capacity - committed);
                    const maximumReturning = Math.ceil(course.capacity * 20 / 30);
                    const minimumNew = Math.max(0, course.capacity - maximumReturning);
                    const issues = [];
                    let level = 'ok';
                    if (count.headTAs + count.accepted > course.capacity) {
                        issues.push(`Over allocation: ${count.headTAs + count.accepted} Head TAs or accepted TAs are assigned, but the course is allotted ${course.capacity}`);
                        level = 'problem';
                    } else if (committed > course.capacity) {
                        issues.push(`Possible over-hire: ${committed} Head TAs, accepted TAs, or offers are assigned, but only ${course.capacity} can be staffed`);
                        level = 'problem';
                    }
                    if (count.returning > maximumReturning) {
                        issues.push(`Paid/returning limit exceeded: ${count.returning} are accepted or offered; no more than ${maximumReturning} may be returning`);
                        level = 'problem';
                    }
                    if (committed >= course.capacity && count.newCount < minimumNew) {
                        issues.push(`Not enough unpaid/new TAs: a full staff of ${course.capacity} requires at least ${minimumNew} new TAs, but only ${count.newCount} are accepted or offered`);
                        level = 'problem';
                    }
                    if (count.preferred > remaining) {
                        issues.push(`Preferred-list advisory: ${count.preferred} candidates are preferred, but only ${remaining} staffing spot${remaining === 1 ? '' : 's'} remain after Head TAs, accepted TAs, and offers`);
                        if (level === 'ok') level = 'advisory';
                    }
                    checks.set(course.id, { ...count, committed, remaining, maximumReturning, minimumNew, issues, level });
                });
                return checks;
            }

            function courseKey(value) {
                return normalize(value).replace(/[^a-z0-9]/g, '');
            }

            function parseSimpleCsv(text) {
                const rows = [];
                let row = [], field = '', quoted = false;
                for (let index = 0; index < text.length; index += 1) {
                    const character = text[index];
                    if (quoted) {
                        if (character === '"' && text[index + 1] === '"') { field += '"'; index += 1; }
                        else if (character === '"') quoted = false;
                        else field += character;
                    } else if (character === '"') quoted = true;
                    else if (character === ',') { row.push(field); field = ''; }
                    else if (character === '\n') { row.push(field.replace(/\r$/, '')); rows.push(row); row = []; field = ''; }
                    else field += character;
                }
                if (field || row.length) { row.push(field.replace(/\r$/, '')); rows.push(row); }
                const headers = (rows.shift() || []).map((header, index) => index ? header : header.replace(/^\uFEFF/, ''));
                return rows.filter(values => values.some(Boolean)).map(values =>
                    Object.fromEntries(headers.map((header, index) => [header, values[index] || '']))
                );
            }

            function bindControls() {
                document.querySelectorAll('.tm-view-tabs button').forEach(button => {
                    button.addEventListener('click', () => {
                        activeView = button.dataset.view;
                        localStorage.setItem(STORAGE.activeView, activeView);
                        updateButtons();
                        render();
                    });
                });

                document.querySelectorAll('.tm-display-buttons button').forEach(button => {
                    button.addEventListener('click', () => {
                        displayMode = button.dataset.mode;
                        localStorage.setItem(STORAGE.displayMode, displayMode);
                        updateButtons();
                        render();
                    });
                });

                document
                    .getElementById('tm-course-search')
                    .addEventListener('input', render);

                document
                    .getElementById('tm-semester-filter')
                    .addEventListener('change', event => {
                        localStorage.setItem(
                            STORAGE.semester,
                            event.target.value
                        );

                        render();
                    });

                document
                    .getElementById('tm-course-sort')
                    .addEventListener('change', render);

                ['tm-min-capacity', 'tm-max-capacity'].forEach(id => {
                    document.getElementById(id).addEventListener('input', event => {
                        const storageKey = id === 'tm-min-capacity'
                            ? STORAGE.minimumCapacity
                            : STORAGE.maximumCapacity;
                        localStorage.setItem(storageKey, event.target.value);
                        render();
                    });
                });

                document
                    .getElementById('tm-hide-older')
                    .addEventListener('change', event => {
                        localStorage.setItem(
                            STORAGE.hideOlder,
                            event.target.checked ? 'true' : 'false'
                        );

                        render();
                    });

                document
                    .getElementById('tm-clear-course-filters')
                    .addEventListener('click', clearFilters);

                document.addEventListener('keydown', event => {
                    const target = event.target;

                    const typing =
                        target instanceof HTMLInputElement ||
                        target instanceof HTMLTextAreaElement ||
                        target instanceof HTMLSelectElement ||
                        target?.isContentEditable;

                    if (event.key === '/' && !typing) {
                        event.preventDefault();
                        document.getElementById('tm-course-search').focus();
                    }

                    if (
                        event.key === 'Escape' &&
                        document.activeElement?.id === 'tm-course-search'
                    ) {
                        document.getElementById('tm-course-search').value = '';
                        render();
                    }
                });
            }

            function restoreControls() {
                document.getElementById('tm-semester-filter').value =
                    readString(STORAGE.semester, '');

                document.getElementById('tm-hide-older').checked =
                    readString(STORAGE.hideOlder, 'false') === 'true';

                document.getElementById('tm-min-capacity').value =
                    readString(STORAGE.minimumCapacity, '');
                document.getElementById('tm-max-capacity').value =
                    readString(STORAGE.maximumCapacity, '');
            }

            function updateButtons() {
                document.querySelectorAll('.tm-view-tabs button').forEach(button => {
                    button.classList.toggle(
                        'tm-active',
                        button.dataset.view === activeView
                    );
                });

                document.querySelectorAll('.tm-display-buttons button').forEach(button => {
                    button.classList.toggle(
                        'tm-active',
                        button.dataset.mode === displayMode
                    );
                });
            }

            function render() {
                const myCourseIds = isManager
                    ? readIdSet(STORAGE.myCourses)
                    : new Set(courses.map(course => course.id));
                const managedCourseIds = isManager
                    ? readIdSet(STORAGE.managedCourses)
                    : new Set();

                if (isManager) {
                    document.getElementById('tm-my-count').textContent =
                        myCourseIds.size;

                    document.getElementById('tm-managed-count').textContent =
                        managedCourseIds.size;

                    const firstRun = document.getElementById('tm-first-run-message');

                    firstRun.style.display =
                        myCourseIds.size === 0 && managedCourseIds.size === 0
                            ? ''
                            : 'none';
                }

                const query = normalize(
                    document.getElementById('tm-course-search').value
                );

                const selectedSemester =
                    document.getElementById('tm-semester-filter').value;

                const sortOrder =
                    document.getElementById('tm-course-sort').value;

                const newestOnly =
                    document.getElementById('tm-hide-older').checked;

                const minimumCapacity = readOptionalNumber('tm-min-capacity');
                const maximumCapacity = readOptionalNumber('tm-max-capacity');

                let visible = courses.filter(course => {
                    if (
                        isManager &&
                        activeView === 'my' &&
                        !myCourseIds.has(course.id)
                    ) {
                        return false;
                    }

                    if (
                        activeView === 'managed' &&
                        !managedCourseIds.has(course.id)
                    ) {
                        return false;
                    }

                    if (query && !course.normalized.includes(query)) {
                        return false;
                    }

                    if (
                        selectedSemester &&
                        course.semester !== selectedSemester
                    ) {
                        return false;
                    }

                    if (
                        newestOnly &&
                        course.semester !== newestSemester
                    ) {
                        return false;
                    }

                    if (
                        minimumCapacity !== null &&
                        course.capacity < minimumCapacity
                    ) {
                        return false;
                    }

                    if (
                        maximumCapacity !== null &&
                        course.capacity > maximumCapacity
                    ) {
                        return false;
                    }

                    return true;
                });

                visible = sortCourses(visible, sortOrder);

                updateSummary(visible);

                const container = document.getElementById('tm-course-results');
                container.replaceChildren();

                if (!visible.length) {
                    renderEmptyState(container);
                    return;
                }

                if (displayMode === 'table') {
                    renderTable(
                        container,
                        visible,
                        myCourseIds,
                        managedCourseIds
                    );
                } else {
                    renderCards(
                        container,
                        visible,
                        myCourseIds,
                        managedCourseIds
                    );
                }
            }

            function renderCards(
                container,
                visible,
                myCourseIds,
                managedCourseIds
            ) {
                if (isManager && activeView === 'all') {
                    renderGroupedCards(
                        container,
                        visible,
                        myCourseIds,
                        managedCourseIds
                    );

                    return;
                }

                const grid = document.createElement('div');
                grid.className = 'tm-course-grid';

                visible.forEach(course => {
                    grid.appendChild(
                        createCourseCard(
                            course,
                            myCourseIds,
                            managedCourseIds
                        )
                    );
                });

                container.appendChild(grid);
            }

            function renderGroupedCards(
                container,
                visible,
                myCourseIds,
                managedCourseIds
            ) {
                const grouped = groupBySemester(visible);
                const collapsedTerms = readIdSet(STORAGE.collapsedTerms);

                grouped.forEach(group => {
                    const section = document.createElement('section');
                    section.className = 'tm-semester-section';

                    const totalCapacity = group.courses.reduce(
                        (sum, course) => sum + course.capacity,
                        0
                    );

                    const collapsed = collapsedTerms.has(group.name);

                    section.innerHTML = `
                        <button
                            type="button"
                            class="tm-semester-heading"
                            aria-expanded="${collapsed ? 'false' : 'true'}"
                        >
                            <span>
                                <strong>${escapeHtml(group.name)}</strong>
                                <small>
                                    ${group.courses.length} courses ·
                                    ${totalCapacity} total capacity
                                </small>
                            </span>

                            <span class="tm-collapse-icon">
                                ${collapsed ? '▶' : '▼'}
                            </span>
                        </button>
                    `;

                    const grid = document.createElement('div');
                    grid.className = 'tm-course-grid';
                    grid.style.display = collapsed ? 'none' : '';

                    group.courses.forEach(course => {
                        grid.appendChild(
                            createCourseCard(
                                course,
                                myCourseIds,
                                managedCourseIds
                            )
                        );
                    });

                    section
                        .querySelector('.tm-semester-heading')
                        .addEventListener('click', () => {
                            toggleStoredId(
                                STORAGE.collapsedTerms,
                                group.name
                            );

                            render();
                        });

                    section.appendChild(grid);
                    container.appendChild(section);
                });
            }

            function createCourseCard(
                course,
                myCourseIds,
                managedCourseIds
            ) {
                const card = document.createElement('article');
                card.className = 'tm-course-card';

                const isMine = myCourseIds.has(course.id);
                const isManaged = managedCourseIds.has(course.id);
                const staffing = staffingChecks.get(course.id);

                if (staffing?.level && staffing.level !== 'ok') {
                    card.classList.add(`tm-course-${staffing.level}`);
                }

                card.innerHTML = `
                    <div class="tm-course-card-header">
                        <div>
                            <h3>
                                <a href="${escapeAttribute(course.url)}">
                                    ${escapeHtml(course.courseName)}
                                </a>
                            </h3>

                            <span>${escapeHtml(course.semester)}</span>
                        </div>

                        <div class="tm-capacity">
                            <strong>${course.capacity}</strong>
                            <span>capacity</span>
                        </div>
                    </div>

                    <div class="tm-card-actions">
                        ${isManager ? `
                            <button
                                type="button"
                                class="${isMine ? 'tm-selected-action' : ''}"
                                data-action="mine"
                            >
                                ${isMine ? '★ Mine' : '☆ Mine'}
                            </button>

                            <button
                                type="button"
                                class="${isManaged ? 'tm-selected-action' : ''}"
                                data-action="managed"
                            >
                                ${isManaged ? '✓ Pinned' : '+ Pin'}
                            </button>
                        ` : ''}

                        <a href="${escapeAttribute(course.url)}">
                            Rank TAs →
                        </a>
                    </div>
                    ${staffing?.issues.length ? `
                        <div class="tm-course-staffing-warning tm-course-staffing-${staffing.level}">
                            <strong>${staffing.level === 'problem' ? 'Staffing problem' : 'Staffing advisory'}</strong>
                            <span>${escapeHtml(staffing.issues.join(' · '))}</span>
                        </div>
                    ` : ''}
                `;

                card
                    .querySelector('[data-action="mine"]')
                    ?.addEventListener('click', () => {
                        toggleStoredId(STORAGE.myCourses, course.id);
                        render();
                    });

                card
                    .querySelector('[data-action="managed"]')
                    ?.addEventListener('click', () => {
                        toggleStoredId(STORAGE.managedCourses, course.id);
                        render();
                    });

                return card;
            }

            function renderTable(
                container,
                visible,
                myCourseIds,
                managedCourseIds
            ) {
                const wrapper = document.createElement('div');
                wrapper.className = 'tm-table-wrapper';

                const table = document.createElement('table');
                table.className = 'tm-modern-table';

                table.innerHTML = `
                    <thead>
                        <tr>
                            <th>Course</th>
                            <th>Semester</th>
                            <th>Capacity</th>
                            ${isManager ? '<th>Lists</th>' : ''}
                            <th></th>
                        </tr>
                    </thead>

                    <tbody>
                        ${visible.map(course => `
                            <tr data-course-id="${escapeAttribute(course.id)}" class="${
                                staffingChecks.get(course.id)?.level && staffingChecks.get(course.id).level !== 'ok'
                                    ? `tm-course-${staffingChecks.get(course.id).level}`
                                    : ''
                            }">
                                <td>
                                    <a href="${escapeAttribute(course.url)}">
                                        ${escapeHtml(course.courseName)}
                                    </a>
                                    ${staffingChecks.get(course.id)?.issues.length ? `
                                        <div class="tm-table-staffing-warning">
                                            <strong>${staffingChecks.get(course.id).level === 'problem' ? 'Problem:' : 'Advisory:'}</strong>
                                            ${escapeHtml(staffingChecks.get(course.id).issues.join(' · '))}
                                        </div>
                                    ` : ''}
                                </td>

                                <td>${escapeHtml(course.semester)}</td>

                                <td>
                                    <span class="tm-capacity-badge">
                                        ${course.capacity}
                                    </span>
                                </td>

                                ${isManager ? `<td class="tm-table-actions">
                                    <button
                                        type="button"
                                        data-action="mine"
                                        class="${
                                            myCourseIds.has(course.id)
                                                ? 'tm-selected-action'
                                                : ''
                                        }"
                                    >
                                        ${
                                            myCourseIds.has(course.id)
                                                ? '★ Mine'
                                                : '☆ Mine'
                                        }
                                    </button>

                                    <button
                                        type="button"
                                        data-action="managed"
                                        class="${
                                            managedCourseIds.has(course.id)
                                                ? 'tm-selected-action'
                                                : ''
                                        }"
                                    >
                                        ${
                                            managedCourseIds.has(course.id)
                                                ? '✓ Pinned'
                                                : '+ Pin'
                                        }
                                    </button>
                                </td>` : ''}

                                <td>
                                    <a href="${escapeAttribute(course.url)}">
                                        Rank TAs →
                                    </a>
                                </td>
                            </tr>
                        `).join('')}
                    </tbody>
                `;

                table.querySelectorAll('tbody tr').forEach(row => {
                    const courseId = row.dataset.courseId;

                    row
                        .querySelector('[data-action="mine"]')
                        ?.addEventListener('click', () => {
                            toggleStoredId(STORAGE.myCourses, courseId);
                            render();
                        });

                    row
                        .querySelector('[data-action="managed"]')
                        ?.addEventListener('click', () => {
                            toggleStoredId(STORAGE.managedCourses, courseId);
                            render();
                        });
                });

                wrapper.appendChild(table);
                container.appendChild(wrapper);
            }

            function updateSummary(visible) {
                const totalCapacity = visible.reduce(
                    (sum, course) => sum + course.capacity,
                    0
                );

                document.getElementById('tm-visible-badge').textContent =
                    `Showing ${visible.length} of ${courses.length} courses`;

                document.getElementById('tm-capacity-badge').textContent =
                    `${totalCapacity} total capacity`;
            }

            function renderEmptyState(container) {
                const messages = {
                    my: {
                        title: isManager
                            ? 'No courses in My Courses'
                            : 'No current courses found',
                        message: isManager
                            ? 'Open All Courses and click “Mine” on the courses you teach.'
                            : 'If you expected a course here, use the course-access form linked from the instructor guide.'
                    },
                    managed: {
                        title: 'No pinned courses',
                        message:
                            'Open All Courses and click “Pin” for quick access here.'
                    },
                    all: {
                        title: 'No matching courses',
                        message:
                            'Try clearing the search or semester filter.'
                    }
                };

                const content = messages[activeView];

                container.innerHTML = `
                    <div class="tm-empty-state">
                        <strong>${escapeHtml(content.title)}</strong>
                        <span>${escapeHtml(content.message)}</span>

                        ${
                            isManager && activeView !== 'all'
                                ? `
                                    <button
                                        type="button"
                                        id="tm-open-all-courses"
                                        class="tm-primary-inline"
                                    >
                                        Open All Courses
                                    </button>
                                `
                                : ''
                        }
                    </div>
                `;

                document
                    .getElementById('tm-open-all-courses')
                    ?.addEventListener('click', () => {
                        activeView = 'all';
                        localStorage.setItem(STORAGE.activeView, activeView);
                        updateButtons();
                        render();
                    });
            }

            function sortCourses(courseList, sortOrder) {
                return [...courseList].sort((a, b) => {
                    if (sortOrder === 'capacity-desc') {
                        return (
                            b.capacity - a.capacity ||
                            compareCourseNames(a, b)
                        );
                    }

                    if (sortOrder === 'capacity-asc') {
                        return (
                            a.capacity - b.capacity ||
                            compareCourseNames(a, b)
                        );
                    }

                    if (sortOrder === 'semester') {
                        return (
                            semesterWeight(b.semester) -
                                semesterWeight(a.semester) ||
                            compareCourseNames(a, b)
                        );
                    }

                    return compareCourseNames(a, b);
                });
            }

            function compareCourseNames(a, b) {
                return a.courseName.localeCompare(
                    b.courseName,
                    undefined,
                    {
                        numeric: true,
                        sensitivity: 'base'
                    }
                );
            }

            function groupBySemester(courseList) {
                const map = new Map();

                courseList.forEach(course => {
                    if (!map.has(course.semester)) {
                        map.set(course.semester, []);
                    }

                    map.get(course.semester).push(course);
                });

                return Array.from(map.entries())
                    .map(([name, semesterCourses]) => ({
                        name,
                        courses: semesterCourses
                    }))
                    .sort((a, b) =>
                        semesterWeight(b.name) - semesterWeight(a.name)
                    );
            }

            function clearFilters() {
                document.getElementById('tm-course-search').value = '';
                document.getElementById('tm-semester-filter').value = '';
                document.getElementById('tm-course-sort').value = 'course';
                document.getElementById('tm-hide-older').checked = false;
                document.getElementById('tm-min-capacity').value = '';
                document.getElementById('tm-max-capacity').value = '';

                localStorage.removeItem(STORAGE.semester);
                localStorage.removeItem(STORAGE.minimumCapacity);
                localStorage.removeItem(STORAGE.maximumCapacity);
                localStorage.setItem(STORAGE.hideOlder, 'false');

                render();
                document.getElementById('tm-course-search').focus();
            }

            function readOptionalNumber(elementId) {
                const value = document.getElementById(elementId).value.trim();
                if (value === '') return null;

                const number = Number(value);
                return Number.isFinite(number) ? number : null;
            }

            function toggleStoredId(storageKey, id) {
                const values = readIdSet(storageKey);

                if (values.has(id)) {
                    values.delete(id);
                } else {
                    values.add(id);
                }

                localStorage.setItem(
                    storageKey,
                    JSON.stringify(Array.from(values))
                );
            }

            function readIdSet(storageKey) {
                try {
                    const parsed = JSON.parse(
                        localStorage.getItem(storageKey) || '[]'
                    );

                    return new Set(
                        Array.isArray(parsed)
                            ? parsed.map(String)
                            : []
                    );
                } catch {
                    return new Set();
                }
            }

            function readString(storageKey, fallback) {
                return localStorage.getItem(storageKey) ?? fallback;
            }

            function semesterWeight(semester) {
                const match = String(semester).match(
                    /^(Spring|Summer|Fall)\s+(\d{4})$/i
                );

                if (!match) {
                    return 0;
                }

                const termWeights = {
                    Spring: 1,
                    Summer: 2,
                    Fall: 3
                };

                const term =
                    match[1].charAt(0).toUpperCase() +
                    match[1].slice(1).toLowerCase();

                return (
                    Number(match[2]) * 10 +
                    (termWeights[term] || 0)
                );
            }

            function addStyles() {
                const style = document.createElement('style');

                style.textContent = `
        #tm-course-dashboard { margin: 18px 0 55px; color: #252525; } .tm-header-badges { display: flex; flex-wrap: wrap; justify-content: flex-end; gap: 8px; } .tm-header-badges span { padding: 6px 10px; border-radius: 999px; background: #f1f1f1; color: #555; font-size: .83rem; font-weight: 600; white-space: nowrap; } .tm-view-tabs button span { min-width: 24px; padding: 2px 6px; border-radius: 999px; background: rgba(0, 0, 0, .1); font-size: .75rem; } .tm-toolbar { grid-template-columns: minmax(280px, 2fr) minmax(160px, 1fr) minmax(170px, 1fr) minmax(125px, .7fr) minmax(125px, .7fr) auto; backdrop-filter: blur(8px); } .tm-toolbar > div { display: flex; min-width: 0; flex-direction: column; gap: 7px; } .tm-toolbar label { position: static !important; inset: auto !important; display: block !important; height: auto !important; margin: 0 !important; padding: 0 !important; transform: none !important; line-height: 1.25 !important; } .tm-toolbar input, .tm-toolbar select { box-sizing: border-box !important; height: 46px !important; margin: 0 !important; } .tm-options-row { display: flex; align-items: center; gap: 20px; padding: 11px 15px; border: 1px solid #cfcfcf; border-top: 0; background: #f6f6f6; } .tm-options-row label { display: inline-flex; align-items: center; gap: 6px; margin: 0; cursor: pointer; } .tm-display-buttons { display: inline-flex; overflow: hidden; margin-left: auto; border: 1px solid #999; border-radius: 6px; } .tm-display-buttons button { padding: 7px 13px; border: 0; border-right: 1px solid #999; background: white; cursor: pointer; } .tm-display-buttons button:last-child { border-right: 0; } .tm-display-buttons button.tm-active { background: #333; color: white; } .tm-first-run-message { margin-top: 14px; padding: 13px 15px; border-left: 4px solid #b3a369; border-radius: 6px; background: #fffbee; } .tm-staffing-check { display: flex; align-items: center; gap: 8px; margin-top: 14px; padding: 11px 14px; border: 1px solid #cdd7e1; border-radius: 7px; background: #f3f7fa; color: #334155; font-size: .86rem; } .tm-staffing-spinner { width: 15px; height: 15px; border: 2px solid #b8c5d1; border-top-color: #003057; border-radius: 50%; animation: tm-staffing-spin .8s linear infinite; } @keyframes tm-staffing-spin { to { transform: rotate(360deg); } } .tm-staffing-has-problems { border-color: #e2a8a3; background: #fff2f1; color: #8a2018; } .tm-staffing-clear { border-color: #a9d7bd; background: #effaf3; color: #17653f; } .tm-staffing-error { border-color: #e3c77a; background: #fff9e6; color: #735c17; } .tm-staffing-explainer { margin-top: 7px; padding: 9px 13px; border-left: 4px solid #7699b5; background: #f5f8fb; color: #4b5563; font-size: .78rem; line-height: 1.45; } .tm-course-card.tm-course-problem, .tm-modern-table tr.tm-course-problem { border-color: #c7473b; background: #fff8f7; } .tm-course-card.tm-course-advisory, .tm-modern-table tr.tm-course-advisory { border-color: #c39425; background: #fffcf2; } .tm-course-staffing-warning { display: flex; flex-direction: column; gap: 2px; padding: 9px 12px; border-top: 1px solid #e2e2e2; font-size: .76rem; } .tm-course-staffing-problem { background: #fff0ef; color: #8a2018; } .tm-course-staffing-advisory { background: #fff8df; color: #6d5414; } .tm-table-staffing-warning { max-width: 520px; margin-top: 4px; color: #8a2018; font-size: .73rem; line-height: 1.35; } .tm-course-advisory .tm-table-staffing-warning { color: #6d5414; } .tm-semester-section { margin-top: 16px; } .tm-semester-heading { display: flex; align-items: center; justify-content: space-between; width: 100%; padding: 12px 15px; border: 1px solid #c9c9c9; border-radius: 8px; background: #343434; color: white; cursor: pointer; text-align: left; } .tm-semester-heading span:first-child { display: flex; align-items: baseline; gap: 10px; } .tm-semester-heading small { color: #d4d4d4; } .tm-course-grid { display: grid; grid-template-columns: repeat(auto-fill, minmax(310px, 1fr)); gap: 13px; margin-top: 13px; } .tm-course-card { overflow: hidden; border: 1px solid #d5d5d5; border-radius: 9px; background: white; box-shadow: 0 2px 8px rgba(0, 0, 0, .05); } .tm-course-card:hover { border-color: #b3a369; box-shadow: 0 6px 16px rgba(0, 0, 0, .09); } .tm-course-card-header { display: flex; align-items: flex-start; justify-content: space-between; gap: 12px; padding: 15px; border-bottom: 1px solid #e1e1e1; background: #faf9f4; } .tm-course-card-header h3 { margin: 0 0 3px; font-size: 1.08rem; } .tm-course-card-header h3 a { color: #242424; text-decoration: none; } .tm-course-card-header h3 a:hover { text-decoration: underline; } .tm-course-card-header > div:first-child > span { color: #667085; font-size: .82rem; } .tm-capacity { display: flex; flex-direction: column; align-items: flex-end; min-width: 65px; } .tm-capacity strong { font-size: 1.45rem; line-height: 1; } .tm-capacity span { margin-top: 3px; color: #667085; font-size: .7rem; } .tm-card-actions { display: flex; align-items: center; gap: 7px; padding: 10px 12px; } .tm-card-actions button, .tm-table-actions button { padding: 5px 8px; border: 1px solid #aaa; border-radius: 5px; background: white; cursor: pointer; font-size: .78rem; } .tm-card-actions .tm-selected-action, .tm-table-actions .tm-selected-action { border-color: #857437; background: #f1e7b8; color: #3d3514; font-weight: 700; } .tm-card-actions a { margin-left: auto; font-size: .82rem; font-weight: 700; } .tm-table-wrapper { overflow-x: auto; margin-top: 15px; border: 1px solid #d4d4d4; border-radius: 8px; background: white; } .tm-modern-table { width: 100%; border-collapse: collapse; } .tm-modern-table th, .tm-modern-table td { padding: 11px 12px; border-bottom: 1px solid #e2e2e2; text-align: left; vertical-align: middle; } .tm-modern-table th { position: sticky; top: 0; z-index: 10; background: #333; color: white; } .tm-modern-table tbody tr:hover { background: #fafafa; } .tm-table-actions { white-space: nowrap; } .tm-capacity-badge { display: inline-block; min-width: 36px; padding: 4px 8px; border-radius: 999px; background: #eee; text-align: center; font-weight: 700; } .tm-empty-state { display: flex; flex-direction: column; align-items: center; gap: 6px; margin-top: 15px; padding: 45px; border: 1px dashed #999; border-radius: 9px; color: #667085; text-align: center; } .tm-primary-inline { margin-top: 10px; padding: 8px 14px; border: 0; border-radius: 6px; background: #b3a369; color: #111; cursor: pointer; font-weight: 700; } @media (max-width: 1150px) { .tm-toolbar { position: static; grid-template-columns: repeat(3, 1fr); } } @media (max-width: 650px) { .tm-dashboard-header { align-items: flex-start; flex-direction: column; } .tm-header-badges { justify-content: flex-start; } .tm-view-tabs { overflow-x: auto; } .tm-view-tabs button { white-space: nowrap; } .tm-toolbar { grid-template-columns: 1fr; } .tm-options-row { align-items: flex-start; flex-direction: column; } .tm-display-buttons { margin-left: 0; } .tm-course-grid { grid-template-columns: 1fr; } }
        `;

                document.head.appendChild(style);
            }
        })();
        }
    });

// ---- feature: manager-home ----
    toolkit.register({
        id: 'manager-home',
        name: 'Manager Home',
        init() {
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
        #tm-manager-home { max-width: 1180px; margin: 26px auto 70px; color: var(--tm-text); } .tm-manager-hero { display: flex; align-items: center; justify-content: space-between; gap: 24px; padding: 30px 32px; border-radius: 15px; background: linear-gradient(125deg, #003057 0%, #074d78 100%); color: white; box-shadow: 0 10px 28px rgba(0,48,87,.2); } .tm-manager-hero h1 { margin: 3px 0 7px; color: white; font-size: clamp(1.8rem, 4vw, 2.55rem); line-height: 1.05; } .tm-manager-hero p { margin: 0; color: #dce8f1; font-size: 1rem; } .tm-manager-eyebrow, .tm-manager-card-label { color: #d6c57f; font-size: .72rem; font-weight: 800; letter-spacing: .09em; text-transform: uppercase; } .tm-manager-primary { display: inline-flex; align-items: center; gap: 10px; flex: 0 0 auto; padding: 12px 17px; border: 1px solid #d6c57f; border-radius: 8px; background: #b3a369; color: #1f2529 !important; font-weight: 800; text-decoration: none !important; } .tm-manager-primary:hover { background: #d6c57f; } .tm-manager-quick-note { margin: 15px 0 0; padding: 12px 16px; border: 1px solid #d8cfaa; border-left: 5px solid #b3a369; border-radius: 8px; background: #fffbee; color: #554b25; } .tm-manager-grid { display: grid; grid-template-columns: repeat(2, minmax(0, 1fr)); gap: 16px; margin-top: 18px; } .tm-manager-card { display: grid; grid-template-columns: auto minmax(0, 1fr); gap: 15px 16px; min-height: 245px; padding: 22px; border: 1px solid var(--tm-border); border-radius: 12px; background: var(--tm-surface); box-shadow: var(--tm-shadow); } .tm-manager-card:hover { border-color: #b3a369; transform: translateY(-1px); box-shadow: 0 9px 24px rgba(0,0,0,.11); } .tm-manager-card-mark { display: grid; place-items: center; width: 42px; height: 42px; border-radius: 10px; background: #e8f1f7; color: #003057; font-size: 1.05rem; font-weight: 900; } .tm-manager-card-report .tm-manager-card-mark { background: #eee7c9; color: #62551f; } .tm-manager-card-label { color: #857437; } .tm-manager-card h2 { margin: 3px 0 7px; font-size: 1.3rem; } .tm-manager-card p { margin: 0; color: var(--tm-muted); line-height: 1.5; } .tm-manager-card > a { grid-column: 1 / -1; align-self: end; display: flex; justify-content: space-between; padding-top: 13px; border-top: 1px solid var(--tm-border); font-weight: 800; text-decoration: none; } .tm-manager-links { grid-column: 1 / -1; align-self: end; display: grid; grid-template-columns: repeat(2, minmax(0, 1fr)); gap: 7px; } .tm-manager-links a { padding: 8px 10px; border: 1px solid #d8dce1; border-radius: 6px; background: var(--tm-surface-alt); color: var(--tm-text); font-size: .84rem; font-weight: 700; text-decoration: none; } .tm-manager-links a:hover { border-color: #857437; background: #fffbee; } @media (max-width: 760px) { .tm-manager-hero { align-items: flex-start; flex-direction: column; padding: 24px; } .tm-manager-grid { grid-template-columns: 1fr; } .tm-manager-card { min-height: 0; } }
        `;
                document.head.appendChild(style);
            }
        })();
        }
    });

// ---- feature: manager-users ----
    toolkit.register({
        id: 'manager-users',
        name: 'Manager Users',
        init() {
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
        #tm-user-directory { margin: 24px 0 15px; } .tm-user-directory-hero { display: flex; align-items: center; justify-content: space-between; gap: 22px; padding: 25px 27px; border-radius: 14px 14px 0 0; background: linear-gradient(125deg,#003057,#074d78); color: white; } .tm-user-directory-hero span { color: #d6c57f; font-size: .72rem; font-weight: 800; letter-spacing: .08em; text-transform: uppercase; } .tm-user-directory-hero h1 { margin: 3px 0 5px; color: white; font-size: 2rem; } .tm-user-directory-hero p { margin: 0; color: #dce8f1; } .tm-user-directory-actions { display: flex; gap: 8px; } .tm-user-directory-actions a { display: inline-flex; align-items: center; justify-content: center; gap: 7px; min-height: 43px; box-sizing: border-box; padding: 9px 14px; border: 1px solid #b9cad7; border-radius: 7px; font-size: .88rem; font-weight: 800; text-decoration: none !important; } .tm-user-directory-actions .tm-back-manager, .tm-user-directory-actions .tm-back-manager:is(:link,:visited,:hover,:active) { background: rgba(255,255,255,.1); color: #ffffff !important; } .tm-user-directory-actions .tm-back-manager:hover { border-color: #ffffff; background: rgba(255,255,255,.18); } .tm-user-directory-actions .tm-back-manager span { color: #d6c57f; font-size: 1rem; } .tm-user-directory-actions .tm-create-user, .tm-user-directory-actions .tm-create-user:is(:link,:visited,:hover,:active) { border-color: #d6c57f; background: #b3a369; color: #20262a !important; } .tm-user-directory-actions .tm-create-user:hover { background: #d6c57f; } .tm-user-directory-note { padding: 10px 15px; border: 1px solid #d8cfaa; border-top: 0; background: #fffbee; color: #554b25; font-size: .82rem; } .tm-user-directory-toolbar { position: sticky; top: 0; z-index: 30; display: grid; grid-template-columns: minmax(280px,2fr) repeat(3,minmax(145px,1fr)) auto; align-items: end; gap: 10px; padding: 14px; border: 1px solid var(--tm-border); background: rgba(255,255,255,.97); box-shadow: 0 5px 14px rgba(0,0,0,.08); } .tm-user-directory-toolbar > div { min-width: 0; } .tm-user-directory-toolbar label { display: block; margin: 0 0 5px; color: var(--tm-muted); font-size: .76rem; font-weight: 800; } .tm-user-directory-toolbar :is(input,select) { box-sizing: border-box; width: 100%; height: 43px; margin: 0; border: 1px solid #aab0b6; border-radius: 6px; background: white; } #tm-directory-clear { height: 43px; margin: 0; padding: 0 14px; border: 1px solid #888; border-radius: 6px; background: white; cursor: pointer; font-weight: 700; } .tm-directory-result-bar { display: flex; justify-content: space-between; gap: 14px; padding: 9px 13px; border: 1px solid var(--tm-border); border-top: 0; background: #f5f6f7; color: var(--tm-muted); font-size: .78rem; } .tm-user-table-wrapper { overflow: auto; max-height: 68vh; margin-bottom: 55px; border: 1px solid var(--tm-border); border-top: 0; background: white; } .tm-user-table { width: 100%; margin: 0 !important; border-collapse: separate; border-spacing: 0; font-size: .79rem; } .tm-user-table th { position: sticky; top: 0; z-index: 5; padding: 10px 9px !important; background: #31363b !important; color: white; white-space: nowrap; } .tm-user-table td { padding: 8px 9px !important; border-bottom: 1px solid #e5e7eb; vertical-align: middle; } .tm-user-table tbody tr:nth-child(even) { background: #f8fafb; } .tm-user-table tbody tr:hover { background: #fff9df; } .tm-user-table td:nth-child(3) a { display: inline-block; padding: 4px 7px; border-radius: 5px; background: #e8f1f7; color: #003057; font-weight: 800; } .tm-user-inactive-row { color: #6b7280; background: #f3f3f3 !important; } .tm-user-inactive-row td:nth-child(2) { color: #a02b23; font-weight: 800; } @media (max-width: 980px) { .tm-user-directory-toolbar { position: static; grid-template-columns: repeat(2,minmax(0,1fr)); } .tm-user-directory-hero { align-items: flex-start; flex-direction: column; } } @media (max-width: 600px) { .tm-user-directory-toolbar { grid-template-columns: 1fr; } .tm-directory-result-bar { flex-direction: column; } .tm-user-directory-actions { flex-wrap: wrap; } }
        `;
                document.head.appendChild(style);
            }
        })();
        }
    });

// ---- feature: manager-user-form ----
    toolkit.register({
        id: 'manager-user-form',
        name: 'Manager User Form',
        init() {
        (function () {
            'use strict';

            const main = document.querySelector('main.container');
            const form = main?.querySelector('form[name="user"]');
            const heading = main?.querySelector(':scope > h1');
            const fields = form?.querySelector('#user');
            if (!main || !form || !heading || !fields || document.getElementById('tm-user-form-page')) return;

            const isCreate = /create/i.test(heading.textContent);
            const backLink = [...main.querySelectorAll(':scope > a')]
                .find(link => /back to list/i.test(link.textContent));
            const submit = form.querySelector('button[type="submit"], button:not([type]), input[type="submit"]');
            const gtAccount = document.getElementById('user_gtAccount');
            const email = document.getElementById('user_email');
            const firstName = document.getElementById('user_namePreferredFirst');
            const lastName = document.getElementById('user_nameFamily');
            const access = document.getElementById('user_hasSystemAccess');
            const hiddenInputs = [...form.querySelectorAll('input[type="hidden"]')];
            if (!gtAccount || !email || !firstName || !lastName || !access || !submit) return;

            document.body.classList.add('gt-ta-toolkit-page');
            addStyles();

            const page = document.createElement('section');
            page.id = 'tm-user-form-page';
            page.innerHTML = `
                <header class="tm-user-form-hero">
                    <div>
                        <span>Manager tools · People</span>
                        <h1>${isCreate ? 'Add a new user' : 'Edit user account'}</h1>
                        <p>${isCreate ? 'Create an account that can access the TA Hiring application.' : 'Update identity details and application access.'}</p>
                    </div>
                    <div class="tm-user-form-nav">
                        <a href="/admin/user/"><span aria-hidden="true">←</span> User directory</a>
                        <a href="/admin/manager/">Manager dashboard</a>
                    </div>
                </header>

                <div class="tm-user-form-guidance">
                    <strong>${isCreate ? 'Before creating the account:' : 'Account access:'}</strong>
                    ${isCreate
                        ? 'Confirm the GT Account and email carefully. These identify the user throughout the hiring system.'
                        : 'Making an account inactive blocks access but preserves its historical hiring records.'}
                </div>

                <div class="tm-user-form-card">
                    <section class="tm-user-form-section">
                        <div class="tm-user-form-section-heading">
                            <span>1</span>
                            <div><h2>Identity</h2><p>Georgia Tech account and preferred display name.</p></div>
                        </div>
                        <div id="tm-user-identity-fields" class="tm-user-form-grid"></div>
                    </section>

                    <section class="tm-user-form-section tm-user-access-section">
                        <div class="tm-user-form-section-heading">
                            <span>2</span>
                            <div><h2>Access</h2><p>Choose whether this person can sign in to the TA application.</p></div>
                        </div>
                        <div id="tm-user-access-field"></div>
                        <div id="tm-access-preview" class="tm-access-preview" aria-live="polite"></div>
                    </section>

                    <footer class="tm-user-form-footer">
                        <a href="/admin/user/">Cancel</a>
                        <div id="tm-user-submit-slot"></div>
                    </footer>
                </div>
            `;

            heading.replaceWith(page);
            const identitySlot = page.querySelector('#tm-user-identity-fields');
            [gtAccount, email, firstName, lastName].forEach(input =>
                identitySlot.appendChild(input.closest(':scope > div') || input.parentElement)
            );
            page.querySelector('#tm-user-access-field').appendChild(access.closest(':scope > div') || access.parentElement);
            page.querySelector('#tm-user-submit-slot').appendChild(submit);
            form.replaceChildren(...page.querySelectorAll('.tm-user-form-card > *'));
            hiddenInputs.forEach(input => form.appendChild(input));
            page.appendChild(form);
            backLink?.remove();

            submit.textContent = isCreate ? 'Create user' : 'Save changes';
            submit.classList.add('tm-user-form-submit');
            access.addEventListener('change', updateAccessPreview);
            updateAccessPreview();

            function updateAccessPreview() {
                const active = access.value === '1';
                const preview = document.getElementById('tm-access-preview');
                preview.className = `tm-access-preview ${active ? 'tm-access-active' : 'tm-access-inactive'}`;
                preview.innerHTML = active
                    ? '<strong>Active account</strong><span>This user will be able to sign in to the TA Hiring application.</span>'
                    : '<strong>Inactive account</strong><span>This user cannot sign in, but their historical records will be retained.</span>';
            }

            function addStyles() {
                const style = document.createElement('style');
                style.textContent = `
        #tm-user-form-page { max-width: 960px; margin: 25px auto 70px; color: var(--tm-text); } .tm-user-form-hero { display: flex; align-items: center; justify-content: space-between; gap: 22px; padding: 26px 28px; border-radius: 14px 14px 0 0; background: linear-gradient(125deg,#003057,#074d78); color: white; } .tm-user-form-hero > div:first-child > span { color: #d6c57f; font-size: .72rem; font-weight: 800; letter-spacing: .08em; text-transform: uppercase; } .tm-user-form-hero h1 { margin: 3px 0 5px; color: white; font-size: 2rem; } .tm-user-form-hero p { margin: 0; color: #dce8f1; } .tm-user-form-nav { display: flex; gap: 8px; } .tm-user-form-nav a, .tm-user-form-nav a:is(:link,:visited,:hover,:active) { display: inline-flex; align-items: center; gap: 7px; min-height: 42px; box-sizing: border-box; padding: 9px 13px; border: 1px solid #b9cad7; border-radius: 7px; background: rgba(255,255,255,.1); color: white !important; font-size: .85rem; font-weight: 800; text-decoration: none !important; } .tm-user-form-nav a:hover { border-color: white; background: rgba(255,255,255,.18); } .tm-user-form-nav a span { color: #d6c57f; } .tm-user-form-guidance { padding: 11px 16px; border: 1px solid #d8cfaa; border-top: 0; background: #fffbee; color: #554b25; font-size: .84rem; } #tm-user-form-page form { margin: 17px 0 0; } .tm-user-form-card { display: none; } #tm-user-form-page form { overflow: hidden; border: 1px solid var(--tm-border); border-radius: 12px; background: var(--tm-surface); box-shadow: var(--tm-shadow); } .tm-user-form-section { padding: 23px 25px; } .tm-user-form-section + .tm-user-form-section { border-top: 1px solid var(--tm-border); } .tm-user-form-section-heading { display: flex; align-items: flex-start; gap: 11px; margin-bottom: 18px; } .tm-user-form-section-heading > span { display: grid; place-items: center; width: 30px; height: 30px; flex: 0 0 auto; border-radius: 50%; background: #003057; color: white; font-weight: 900; } .tm-user-form-section-heading h2 { margin: 0 0 2px; font-size: 1.18rem; } .tm-user-form-section-heading p { margin: 0; color: var(--tm-muted); font-size: .84rem; } .tm-user-form-grid { display: grid; grid-template-columns: repeat(2,minmax(0,1fr)); gap: 16px; } .tm-user-form-grid > div, #tm-user-access-field > div { min-width: 0; } #tm-user-form-page form label { position: static !important; display: block !important; width: auto !important; height: auto !important; margin: 0 0 6px !important; padding: 0 !important; transform: none !important; color: #344054; font-size: .82rem; font-weight: 800; line-height: 1.3 !important; } #tm-user-form-page form :is(input,select) { box-sizing: border-box !important; width: 100% !important; min-height: 45px !important; margin: 0 !important; padding: 9px 10px !important; border: 1px solid #aeb4bb; border-radius: 6px; background: white; } #tm-user-form-page form .help-text { margin: 5px 0 0; color: var(--tm-muted); font-size: .76rem; } #tm-user-access-field { max-width: 420px; } .tm-access-preview { display: flex; flex-direction: column; gap: 2px; margin-top: 12px; padding: 10px 12px; border-radius: 7px; font-size: .8rem; } .tm-access-active { border: 1px solid #a9d7bd; background: #effaf3; color: #17653f; } .tm-access-inactive { border: 1px solid #e3c77a; background: #fff9e6; color: #735c17; } .tm-user-form-footer { display: flex; align-items: center; justify-content: flex-end; gap: 10px; padding: 15px 25px; border-top: 1px solid var(--tm-border); background: #f6f7f8; } .tm-user-form-footer > a { padding: 9px 13px; color: #475569; font-weight: 700; } .tm-user-form-submit { min-height: 43px; margin: 0 !important; padding: 9px 17px !important; border: 1px solid #857437 !important; border-radius: 7px !important; background: #b3a369 !important; color: #20262a !important; font-weight: 900 !important; } @media (max-width: 700px) { .tm-user-form-hero { align-items: flex-start; flex-direction: column; } .tm-user-form-nav { flex-wrap: wrap; } .tm-user-form-grid { grid-template-columns: 1fr; } }
        `;
                document.head.appendChild(style);
            }
        })();
        }
    });

// ---- feature: manager-candidates ----
    toolkit.register({
        id: 'manager-candidates',
        name: 'Manager TAs',
        init() {
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
        #tm-ta-directory { margin: 24px 0 15px; } .tm-ta-directory-hero { display: flex; align-items: center; justify-content: space-between; gap: 22px; padding: 25px 27px; border-radius: 14px 14px 0 0; background: linear-gradient(125deg,#003057,#074d78); color: white; } .tm-ta-directory-hero > div:first-child > span { color: #d6c57f; font-size: .72rem; font-weight: 800; letter-spacing: .08em; text-transform: uppercase; } .tm-ta-directory-hero h1 { margin: 3px 0 5px; color: white; font-size: 2rem; } .tm-ta-directory-hero p { margin: 0; color: #dce8f1; } .tm-ta-directory-actions { display: flex; gap: 8px; } .tm-ta-directory-actions a, .tm-ta-directory-actions a:is(:link,:visited,:hover,:active) { display: inline-flex; align-items: center; gap: 7px; min-height: 43px; box-sizing: border-box; padding: 9px 14px; border: 1px solid #b9cad7; border-radius: 7px; background: rgba(255,255,255,.1); color: white !important; font-size: .88rem; font-weight: 800; text-decoration: none !important; } .tm-ta-directory-actions a:hover { border-color: white; background: rgba(255,255,255,.18); } .tm-ta-directory-actions a span { color: #d6c57f; } .tm-ta-directory-note { padding: 10px 15px; border: 1px solid #cdd7e1; border-top: 0; background: #f3f7fa; color: #475569; font-size: .82rem; } .tm-ta-directory-toolbar { position: sticky; top: 0; z-index: 30; display: grid; grid-template-columns: minmax(290px,2fr) repeat(4,minmax(140px,1fr)) auto; align-items: end; gap: 10px; padding: 14px; border: 1px solid var(--tm-border); background: rgba(255,255,255,.97); box-shadow: 0 5px 14px rgba(0,0,0,.08); } .tm-ta-directory-toolbar > div { min-width: 0; } .tm-ta-directory-toolbar label { position: static !important; display: block !important; height: auto !important; margin: 0 0 5px !important; padding: 0 !important; transform: none !important; color: var(--tm-muted); font-size: .76rem; font-weight: 800; line-height: 1.25 !important; } .tm-ta-directory-toolbar :is(input,select) { box-sizing: border-box !important; width: 100% !important; min-width: 0; height: 43px !important; margin: 0 !important; border: 1px solid #aab0b6; border-radius: 6px; background: white; } #tm-ta-clear { height: 43px; margin: 0; padding: 0 14px; border: 1px solid #888; border-radius: 6px; background: white; cursor: pointer; font-weight: 700; } .tm-ta-result-bar { display: flex; justify-content: space-between; gap: 14px; padding: 9px 13px; border: 1px solid var(--tm-border); border-top: 0; background: #f5f6f7; color: var(--tm-muted); font-size: .78rem; } .tm-ta-table-wrapper { overflow: auto; max-height: 68vh; margin-bottom: 55px; border: 1px solid var(--tm-border); border-top: 0; background: white; } .tm-ta-table { width: 100%; margin: 0 !important; border-collapse: separate; border-spacing: 0; font-size: .8rem; } .tm-ta-table th { position: sticky; top: 0; z-index: 5; padding: 10px 9px !important; background: #31363b !important; color: white; white-space: nowrap; } .tm-ta-table td { padding: 8px 9px !important; border-bottom: 1px solid #e5e7eb; vertical-align: top; } .tm-ta-table tbody tr:nth-child(even) { background: #f8fafb; } .tm-ta-table tbody tr:hover { background: #fff9df; } .tm-ta-table td:first-child a { display: inline-block; padding: 4px 7px; border-radius: 5px; background: #e8f1f7; color: #003057; font-weight: 800; } .tm-ta-table td:nth-child(2) { font-family: ui-monospace,SFMono-Regular,Menlo,monospace; white-space: nowrap; } .tm-ta-table td:last-child ul { margin: 0; padding-left: 17px; } @media (max-width: 1150px) { .tm-ta-directory-toolbar { position: static; grid-template-columns: repeat(3,minmax(0,1fr)); } } @media (max-width: 700px) { .tm-ta-directory-toolbar { grid-template-columns: 1fr; } .tm-ta-directory-hero { align-items: flex-start; flex-direction: column; } .tm-ta-result-bar { flex-direction: column; } .tm-ta-directory-actions { flex-wrap: wrap; } }
        `;
                document.head.appendChild(style);
            }
        })();
        }
    });

// ---- feature: manager-semesters ----
    toolkit.register({
        id: 'manager-semesters',
        name: 'Manager Semesters',
        init() {
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
        #tm-semester-dashboard { margin: 24px 0 15px; } .tm-semester-hero { display: flex; align-items: center; justify-content: space-between; gap: 22px; padding: 26px 28px; border-radius: 14px 14px 0 0; background: linear-gradient(125deg,#003057,#074d78); color: white; } .tm-semester-hero > div:first-child > span { color: #d6c57f; font-size: .72rem; font-weight: 800; letter-spacing: .08em; text-transform: uppercase; } .tm-semester-hero h1 { margin: 3px 0 5px; color: white; font-size: 2rem; } .tm-semester-hero p { margin: 0; color: #dce8f1; } .tm-semester-actions { display: flex; gap: 8px; } .tm-semester-actions a { display: inline-flex; align-items: center; gap: 7px; min-height: 43px; box-sizing: border-box; padding: 9px 14px; border-radius: 7px; font-size: .87rem; font-weight: 800; text-decoration: none !important; } .tm-semester-actions .tm-semester-back, .tm-semester-actions .tm-semester-back:is(:link,:visited,:hover,:active) { border: 1px solid #b9cad7; background: rgba(255,255,255,.1); color: white !important; } .tm-semester-actions .tm-semester-back span { color: #d6c57f; } .tm-semester-actions .tm-semester-create, .tm-semester-actions .tm-semester-create:is(:link,:visited,:hover,:active) { border: 1px solid #d6c57f; background: #b3a369; color: #20262a !important; } .tm-semester-stats { display: grid; grid-template-columns: repeat(4,minmax(0,1fr)); gap: 11px; margin-top: 14px; } .tm-semester-stats > div { display: flex; flex-direction: column; padding: 14px 15px; border: 1px solid var(--tm-border); border-radius: 8px; background: var(--tm-surface); } .tm-semester-stats strong { font-size: 1.45rem; } .tm-semester-stats span { color: var(--tm-muted); font-size: .8rem; } .tm-semester-filter { display: flex; align-items: center; gap: 0; margin-top: 14px; } .tm-semester-filter button { padding: 9px 14px; border: 1px solid #a9adb2; background: white; cursor: pointer; font-weight: 700; } .tm-semester-filter button + button { margin-left: -1px; } .tm-semester-filter button:first-child { border-radius: 7px 0 0 7px; } .tm-semester-filter button:last-of-type { border-radius: 0 7px 7px 0; } .tm-semester-filter button.tm-active { position: relative; background: #343434; color: white; } #tm-semester-count { margin-left: auto; color: var(--tm-muted); font-size: .82rem; font-weight: 700; } .tm-semester-table-wrapper { overflow-x: auto; margin: 11px 0 55px; border: 1px solid var(--tm-border); border-radius: 9px; background: white; } .tm-semester-table { width: 100%; margin: 0 !important; border-collapse: separate; border-spacing: 0; } .tm-semester-table th { padding: 11px 13px !important; background: #31363b !important; color: white; white-space: nowrap; } .tm-semester-table td { padding: 12px 13px !important; border-bottom: 1px solid #e5e7eb; vertical-align: middle; } .tm-semester-table tbody tr:last-child td { border-bottom: 0; } .tm-semester-table tbody tr:hover { background: #fff9df; } .tm-semester-table td:first-child a { display: block; color: #003057; font-weight: 900; } .tm-term-badge, .tm-application-badge { display: inline-block; margin: 5px 5px 0 0; padding: 2px 6px; border-radius: 999px; font-size: .67rem; font-weight: 800; } .tm-term-current, .tm-application-applications-open { background: #dff4e7; color: #17653f; } .tm-term-upcoming, .tm-application-not-open-yet { background: #e8f1f7; color: #003057; } .tm-term-past, .tm-application-closed { background: #ececec; color: #666; } .tm-semester-past { color: #667085; } @media (max-width: 760px) { .tm-semester-hero { align-items: flex-start; flex-direction: column; } .tm-semester-actions { flex-wrap: wrap; } .tm-semester-stats { grid-template-columns: repeat(2,minmax(0,1fr)); } .tm-semester-filter { align-items: stretch; flex-direction: column; gap: 6px; } .tm-semester-filter button { width: 100%; margin: 0 !important; border-radius: 6px !important; } #tm-semester-count { margin-left: 0; } }
        `;
                document.head.appendChild(style);
            }
        })();
        }
    });

// ---- feature: manager-semester-form ----
    toolkit.register({
        id: 'manager-semester-form',
        name: 'Manager Semester Form',
        init() {
        (function () {
            'use strict';

            const main = document.querySelector('main.container');
            const form = main?.querySelector('form[name="semester"]');
            const heading = main?.querySelector(':scope > h1');
            const dateTable = form?.querySelector(':scope > table');
            const season = document.getElementById('semester_season');
            const year = document.getElementById('semester_year');
            const submit = form?.querySelector('button[type="submit"], button:not([type]), input[type="submit"]');
            if (!main || !form || !heading || !dateTable || !season || !year || !submit || document.getElementById('tm-semester-form-page')) return;

            const isCreate = /create/i.test(heading.textContent);
            const backLink = [...main.querySelectorAll(':scope > a')]
                .find(link => /back to list/i.test(link.textContent));
            const seasonLabel = form.querySelector('label[for="semester_season"]');
            const yearLabel = form.querySelector('label[for="semester_year"]');
            const yearHelp = document.getElementById('semester_year_help');

            document.body.classList.add('gt-ta-toolkit-page');
            addStyles();
            buildPage();
            bindDateValidation();

            function buildPage() {
                const page = document.createElement('section');
                page.id = 'tm-semester-form-page';
                page.innerHTML = `
                    <header class="tm-semester-form-hero">
                        <div>
                            <span>Manager tools · Academic setup</span>
                            <h1>${isCreate ? 'Add a semester' : 'Edit semester'}</h1>
                            <p>Set the academic term and the dates that control TA applications.</p>
                        </div>
                        <div class="tm-semester-form-nav">
                            <a href="/admin/semester/"><span aria-hidden="true">←</span> Semester list</a>
                            <a href="/admin/manager/">Manager dashboard</a>
                        </div>
                    </header>
                    <div class="tm-semester-form-guidance">
                        <strong>Date guidance:</strong>
                        Academic dates should match the Registrar. Application dates are internal and determine when candidates may submit applications.
                    </div>
                `;
                heading.replaceWith(page);
                form.classList.add('tm-semester-native-form');
                page.appendChild(form);
                backLink?.remove();

                const identity = document.createElement('section');
                identity.className = 'tm-semester-form-section';
                identity.innerHTML = `
                    <div class="tm-semester-section-heading">
                        <span>1</span><div><h2>Semester identity</h2><p>Select the academic season and four-digit year.</p></div>
                    </div>
                    <div class="tm-semester-identity-fields">
                        <div id="tm-season-field"></div><div id="tm-year-field"></div>
                    </div>
                `;
                form.insertBefore(identity, dateTable);
                identity.querySelector('#tm-season-field').append(seasonLabel, season);
                identity.querySelector('#tm-year-field').append(yearLabel, year);
                if (yearHelp) identity.querySelector('#tm-year-field').appendChild(yearHelp);

                const dates = document.createElement('section');
                dates.className = 'tm-semester-form-section';
                dates.innerHTML = `
                    <div class="tm-semester-section-heading">
                        <span>2</span><div><h2>Academic and application dates</h2><p>Choose month, day, and year for each boundary.</p></div>
                    </div>
                    <div id="tm-semester-date-table"></div>
                    <div id="tm-semester-date-status" aria-live="polite"></div>
                `;
                identity.after(dates);
                dates.querySelector('#tm-semester-date-table').appendChild(dateTable);

                const nativeNotice = [...form.querySelectorAll(':scope > h2')]
                    .find(item => /add course sections/i.test(item.textContent));
                if (nativeNotice) {
                    nativeNotice.classList.add('tm-semester-sections-notice');
                    dates.after(nativeNotice);
                }
                const sections = document.getElementById('semester_sections')?.parentElement;
                if (sections) {
                    sections.classList.add('tm-semester-sections-area');
                    if (isCreate && !cleanSections(sections)) sections.hidden = true;
                }

                const footer = document.createElement('footer');
                footer.className = 'tm-semester-form-footer';
                footer.innerHTML = '<a href="/admin/semester/">Cancel</a><div></div>';
                footer.querySelector('div').appendChild(submit);
                form.appendChild(footer);
                submit.textContent = isCreate ? 'Create semester' : 'Save semester';
                submit.classList.add('tm-semester-form-submit');

                form.querySelectorAll(':scope > br').forEach(br => br.remove());
            }

            function cleanSections(section) {
                return Boolean(section.querySelector('input:not([type="hidden"]), select:not([disabled])'));
            }

            function dateFrom(prefix) {
                const month = Number(document.getElementById(`${prefix}_month`)?.value);
                const day = Number(document.getElementById(`${prefix}_day`)?.value);
                const selectedYear = Number(document.getElementById(`${prefix}_year`)?.value);
                const date = new Date(selectedYear, month - 1, day);
                return date.getFullYear() === selectedYear && date.getMonth() === month - 1 && date.getDate() === day
                    ? date : null;
            }

            function bindDateValidation() {
                const ids = [
                    'semester_startDate', 'semester_endDate',
                    'semester_applicationOpenDate', 'semester_applicationCloseDate'
                ];
                ids.flatMap(id => [...document.querySelectorAll(`#${id} select`)])
                    .forEach(select => select.addEventListener('change', updateDateStatus));
                updateDateStatus();
            }

            function updateDateStatus() {
                const start = dateFrom('semester_startDate');
                const end = dateFrom('semester_endDate');
                const opens = dateFrom('semester_applicationOpenDate');
                const closes = dateFrom('semester_applicationCloseDate');
                const status = document.getElementById('tm-semester-date-status');
                const problems = [];
                if (!start || !end || !opens || !closes) problems.push('One or more selected dates are not valid calendar dates.');
                else {
                    if (end < start) problems.push('Semester end must be after semester start.');
                    if (closes < opens) problems.push('Application close must be after application open.');
                }
                status.className = problems.length ? 'tm-date-problem' : 'tm-date-valid';
                status.innerHTML = problems.length
                    ? `<strong>Check these dates:</strong><span>${problems.join(' ')}</span>`
                    : '<strong>Date sequence looks valid</strong><span>Academic and application closing dates occur after their opening dates.</span>';
            }

            function addStyles() {
                const style = document.createElement('style');
                style.textContent = `
        #tm-semester-form-page { max-width: 1050px; margin: 25px auto 70px; color: var(--tm-text); } .tm-semester-form-hero { display: flex; align-items: center; justify-content: space-between; gap: 22px; padding: 26px 28px; border-radius: 14px 14px 0 0; background: linear-gradient(125deg,#003057,#074d78); color: white; } .tm-semester-form-hero > div:first-child > span { color: #d6c57f; font-size: .72rem; font-weight: 800; letter-spacing: .08em; text-transform: uppercase; } .tm-semester-form-hero h1 { margin: 3px 0 5px; color: white; font-size: 2rem; } .tm-semester-form-hero p { margin: 0; color: #dce8f1; } .tm-semester-form-nav { display: flex; gap: 8px; } .tm-semester-form-nav a, .tm-semester-form-nav a:is(:link,:visited,:hover,:active) { display: inline-flex; align-items: center; gap: 7px; min-height: 42px; box-sizing: border-box; padding: 9px 13px; border: 1px solid #b9cad7; border-radius: 7px; background: rgba(255,255,255,.1); color: white !important; font-size: .85rem; font-weight: 800; text-decoration: none !important; } .tm-semester-form-nav a:hover { border-color: white; background: rgba(255,255,255,.18); } .tm-semester-form-nav a span { color: #d6c57f; } .tm-semester-form-guidance { padding: 11px 16px; border: 1px solid #d8cfaa; border-top: 0; background: #fffbee; color: #554b25; font-size: .84rem; } .tm-semester-native-form { overflow: hidden; margin: 17px 0 0; border: 1px solid var(--tm-border); border-radius: 12px; background: var(--tm-surface); box-shadow: var(--tm-shadow); } .tm-semester-form-section { padding: 23px 25px; } .tm-semester-form-section + .tm-semester-form-section { border-top: 1px solid var(--tm-border); } .tm-semester-section-heading { display: flex; align-items: flex-start; gap: 11px; margin-bottom: 18px; } .tm-semester-section-heading > span { display: grid; place-items: center; width: 30px; height: 30px; flex: 0 0 auto; border-radius: 50%; background: #003057; color: white; font-weight: 900; } .tm-semester-section-heading h2 { margin: 0 0 2px; font-size: 1.18rem; } .tm-semester-section-heading p { margin: 0; color: var(--tm-muted); font-size: .84rem; } .tm-semester-identity-fields { display: grid; grid-template-columns: repeat(2,minmax(0,1fr)); gap: 16px; max-width: 650px; } #tm-semester-form-page form label { position: static !important; display: block !important; width: auto !important; height: auto !important; margin: 0 0 6px !important; padding: 0 !important; transform: none !important; color: #344054; font-size: .8rem; font-weight: 800; line-height: 1.3 !important; } #tm-semester-form-page form :is(input,select) { box-sizing: border-box !important; min-height: 42px !important; margin: 0 !important; border: 1px solid #aeb4bb; border-radius: 6px; background: white; } .tm-semester-identity-fields :is(input,select) { width: 100% !important; } #tm-semester-form-page .help-text { margin: 5px 0 0; color: var(--tm-muted); font-size: .75rem; } #tm-semester-date-table { overflow-x: auto; } #tm-semester-date-table table { width: 100%; margin: 0; border-collapse: separate; border-spacing: 0; border: 1px solid var(--tm-border); border-radius: 8px; } #tm-semester-date-table th { padding: 10px 12px; background: #f1f3f5; color: #344054; text-align: left; } #tm-semester-date-table tr:first-child th { background: #31363b; color: white; } #tm-semester-date-table td { padding: 13px 12px; border-top: 1px solid var(--tm-border); vertical-align: top; } #tm-semester-date-table td > div { display: grid; grid-template-columns: 1.2fr .8fr 1fr; gap: 6px; } #tm-semester-date-table td select { width: 100% !important; min-width: 70px; } #tm-semester-date-status { display: flex; flex-direction: column; gap: 2px; margin-top: 11px; padding: 9px 12px; border-radius: 7px; font-size: .79rem; } .tm-date-valid { border: 1px solid #a9d7bd; background: #effaf3; color: #17653f; } .tm-date-problem { border: 1px solid #e2a8a3; background: #fff2f1; color: #8a2018; } .tm-semester-sections-notice { margin: 0; padding: 13px 25px; border-top: 1px solid var(--tm-border); background: #f3f7fa; color: #475569; font-size: .84rem; } .tm-semester-sections-area { padding: 18px 25px; border-top: 1px solid var(--tm-border); } .tm-semester-form-footer { display: flex; align-items: center; justify-content: flex-end; gap: 10px; padding: 15px 25px; border-top: 1px solid var(--tm-border); background: #f6f7f8; } .tm-semester-form-footer > a { padding: 9px 13px; color: #475569; font-weight: 700; } .tm-semester-form-submit { min-height: 43px; margin: 0 !important; padding: 9px 17px !important; border: 1px solid #857437 !important; border-radius: 7px !important; background: #b3a369 !important; color: #20262a !important; font-weight: 900 !important; } @media (max-width: 740px) { .tm-semester-form-hero { align-items: flex-start; flex-direction: column; } .tm-semester-form-nav { flex-wrap: wrap; } .tm-semester-identity-fields { grid-template-columns: 1fr; } #tm-semester-date-table table, #tm-semester-date-table tbody, #tm-semester-date-table tr, #tm-semester-date-table th, #tm-semester-date-table td { display: block; width: 100%; box-sizing: border-box; } #tm-semester-date-table tr:first-child { display: none; } }
        `;
                document.head.appendChild(style);
            }
        })();
        }
    });

// ---- feature: manager-reports ----
    toolkit.register({
        id: 'manager-reports',
        name: 'Manager Reports',
        init() {
        (function () {
            'use strict';

            const { clean, escapeHtml } = toolkit.utils;
            const form = document.querySelector('form[name="report_index"]');
            const semesterSelect = document.getElementById('report_index_semester');

            if (!form || !semesterSelect || document.getElementById('tm-report-center')) return;

            document.body.classList.add('gt-ta-toolkit-page');
            addStyles();
            buildReportCenter();

            function buildReportCenter() {
                const originalWrapper = form.closest('.example-wrapper') || form.parentElement;
                const center = document.createElement('section');
                center.id = 'tm-report-center';
                center.innerHTML = `
                    <div class="tm-report-center-header">
                        <div>
                            <span class="tm-report-eyebrow">Manager tools</span>
                            <h1>Reports</h1>
                            <p>Choose a semester, then download the report that fits your task.</p>
                        </div>
                    </div>
                    <div class="tm-report-semester-row">
                        <label for="report_index_semester">Report semester</label>
                    </div>
                    <div class="tm-report-cards">
                        <article class="tm-report-card">
                            <div>
                                <span class="tm-report-card-tag">TA app report</span>
                                <h2>Full native report</h2>
                                <p>All application rows and original TA-app fields, unchanged.</p>
                            </div>
                            <div id="tm-native-report-slot"></div>
                        </article>
                        <article class="tm-report-card tm-report-card-featured">
                            <div>
                                <span class="tm-report-card-tag">Toolkit report</span>
                                <h2>Staffing &amp; assignments</h2>
                                <p>Course compliance summary, paid/unpaid ratio guidance, readable assignment details, and duplicate markers.</p>
                            </div>
                            <label class="tm-report-check">
                                <input id="tm-report-center-inactive" type="checkbox">
                                Include Unranked and Declined
                            </label>
                            <div class="tm-toolkit-report-buttons">
                                <button id="tm-download-excel-report" type="button">Download highlighted Excel report</button>
                                <button id="tm-download-staffing-report" type="button">Download staffing CSV</button>
                            </div>
                            <div id="tm-report-center-status" aria-live="polite"></div>
                        </article>
                    </div>
                `;

                originalWrapper.before(center);
                center.querySelector('.tm-report-semester-row').appendChild(semesterSelect);
                center.querySelector('#tm-native-report-slot').appendChild(form);
                const nativeSemester = document.createElement('input');
                nativeSemester.type = 'hidden';
                nativeSemester.name = semesterSelect.name;
                nativeSemester.value = semesterSelect.value;
                form.appendChild(nativeSemester);
                semesterSelect.removeAttribute('name');
                semesterSelect.addEventListener('change', () => {
                    nativeSemester.value = semesterSelect.value;
                });
                const nativeButton = form.querySelector('button[type="submit"], input[type="submit"]');
                if (nativeButton) nativeButton.textContent = 'Download full native CSV';
                originalWrapper.remove();

                document.getElementById('tm-download-staffing-report')
                    .addEventListener('click', downloadStaffingReport);
                document.getElementById('tm-download-excel-report')
                    .addEventListener('click', downloadExcelReport);
            }

            async function loadRecords() {
                const includeInactive = document.getElementById('tm-report-center-inactive').checked;
                const response = await fetch(
                    `/admin/report/create.csv?semester=${encodeURIComponent(semesterSelect.value)}`,
                    { credentials: 'same-origin' }
                );
                if (!response.ok) throw new Error(`Report returned ${response.status}`);
                const records = parseCsv(await response.text())
                    .map(nativeRecord)
                    .filter(record => includeInactive || !['Unranked', 'Declined'].includes(record.status));
                annotateDuplicates(records);
                return records;
            }

            async function downloadStaffingReport() {
                const button = document.getElementById('tm-download-staffing-report');
                const status = document.getElementById('tm-report-center-status');
                const includeInactive = document.getElementById('tm-report-center-inactive').checked;
                const semester = clean(semesterSelect.options[semesterSelect.selectedIndex]?.textContent);

                button.disabled = true;
                status.className = '';
                status.textContent = 'Preparing the native manager data…';

                try {
                    const records = await loadRecords();
                    downloadCsv(records, semester);
                    status.textContent = `Downloaded ${records.length.toLocaleString()} course/status rows.`;
                } catch (error) {
                    status.className = 'tm-report-center-error';
                    status.textContent = `Could not create the report: ${error.message}`;
                } finally {
                    button.disabled = false;
                }
            }

            async function downloadExcelReport() {
                const button = document.getElementById('tm-download-excel-report');
                const status = document.getElementById('tm-report-center-status');
                const semester = clean(semesterSelect.options[semesterSelect.selectedIndex]?.textContent);
                button.disabled = true;
                status.className = '';
                status.textContent = 'Building the highlighted course workbook…';
                try {
                    const [records, courseResponse] = await Promise.all([
                        loadRecords(),
                        fetch('/instructor-admin/', { credentials: 'same-origin' })
                    ]);
                    if (!courseResponse.ok) throw new Error(`Course allocations returned ${courseResponse.status}`);
                    const courseDocument = new DOMParser().parseFromString(await courseResponse.text(), 'text/html');
                    const allocations = extractAllocations(courseDocument, semester);
                    const summaries = summarizeCourses(records, allocations);
                    downloadXlsx(summaries, records, semester);
                    const problems = summaries.filter(summary => summary.level === 'Problem').length;
                    status.textContent = `Downloaded ${summaries.length} courses; ${problems} marked as problems.`;
                } catch (error) {
                    status.className = 'tm-report-center-error';
                    status.textContent = `Could not create the Excel report: ${error.message}`;
                } finally {
                    button.disabled = false;
                }
            }

            function extractAllocations(doc, semester) {
                const allocations = new Map();
                doc.querySelectorAll('main table tbody tr').forEach(row => {
                    const cells = row.querySelectorAll('td');
                    const fullName = clean(cells[0]?.textContent);
                    const match = fullName.match(/^(.*?)\s+-\s+((?:Spring|Summer|Fall)\s+\d{4})$/i);
                    if (!match || clean(match[2]) !== semester) return;
                    allocations.set(courseKey(match[1]), {
                        course: clean(match[1]).replace(/\s+/g, ' '),
                        allocation: Number.parseInt(clean(cells[1]?.textContent), 10) || 0
                    });
                });
                return allocations;
            }

            function summarizeCourses(records, allocations) {
                const grouped = new Map();
                records.forEach(record => {
                    const key = courseKey(record.course);
                    if (!grouped.has(key)) grouped.set(key, []);
                    grouped.get(key).push(record);
                });
                return [...allocations.entries()].map(([key, allocationInfo]) => {
                    const rows = grouped.get(key) || [];
                    const accepted = rows.filter(row => row.status === 'Accepted');
                    const offered = rows.filter(row => row.status === 'Offered');
                    const preferred = rows.filter(row => row.status === 'Preferred');
                    const headTAs = rows.filter(row => row.status === 'Head TA');
                    // Head TAs consume an allocation slot, but remain outside the paid/new ratio.
                    const ratioStaff = [...accepted, ...offered];
                    const committed = [...headTAs, ...ratioStaff];
                    const returning = ratioStaff.filter(row => row.taType === 'Returning').length;
                    const newCount = ratioStaff.length - returning;
                    const maximumReturning = Math.ceil(allocationInfo.allocation * 20 / 30);
                    const minimumNew = Math.max(0, allocationInfo.allocation - maximumReturning);
                    const remaining = Math.max(0, allocationInfo.allocation - committed.length);
                    const issues = [];
                    let level = 'OK';
                    if (headTAs.length + accepted.length > allocationInfo.allocation) {
                        issues.push(`Over allocation: ${headTAs.length + accepted.length} Head TAs or accepted TAs; ${allocationInfo.allocation} allotted`);
                        level = 'Problem';
                    } else if (committed.length > allocationInfo.allocation) {
                        issues.push(`Possible over-hire: ${committed.length} Head TAs, accepted TAs, or offers; ${allocationInfo.allocation} allotted`);
                        level = 'Problem';
                    }
                    if (returning > maximumReturning) {
                        issues.push(`Paid/returning limit exceeded: ${returning} committed; ${maximumReturning} maximum`);
                        level = 'Problem';
                    }
                    if (committed.length >= allocationInfo.allocation && newCount < minimumNew) {
                        issues.push(`Not enough unpaid/new TAs: ${newCount} committed; ${minimumNew} minimum when fully staffed`);
                        level = 'Problem';
                    }
                    if (preferred.length > remaining) {
                        issues.push(`Preferred-list advisory: ${preferred.length} preferred candidates; ${remaining} spots remain after Head TAs, accepted TAs, and offers`);
                        if (level === 'OK') level = 'Advisory';
                    }
                    return {
                        course: allocationInfo.course,
                        allocation: allocationInfo.allocation,
                        accepted: accepted.length,
                        offered: offered.length,
                        committed: committed.length,
                        preferred: preferred.length,
                        headTAs: headTAs.length,
                        returning,
                        newCount,
                        maximumReturning,
                        minimumNew,
                        remaining,
                        level,
                        issues: issues.join('; ') || 'None'
                    };
                }).sort((a, b) =>
                    ({ Problem: 0, Advisory: 1, OK: 2 }[a.level] - { Problem: 0, Advisory: 1, OK: 2 }[b.level]) ||
                    a.course.localeCompare(b.course, undefined, { numeric: true })
                );
            }

            function courseKey(value) {
                return clean(value).toLowerCase().replace(/[^a-z0-9]/g, '');
            }

            function xmlEscape(value) {
                return String(value ?? '').replace(/[&<>"']/g, character => ({
                    '&': '&amp;', '<': '&lt;', '>': '&gt;', '"': '&quot;', "'": '&apos;'
                })[character]);
            }

            function columnName(index) {
                let name = '';
                for (let value = index + 1; value; value = Math.floor((value - 1) / 26)) {
                    name = String.fromCharCode(65 + ((value - 1) % 26)) + name;
                }
                return name;
            }

            function xlsxRow(values, rowNumber, styleIndex = 0) {
                return `<row r="${rowNumber}">${values.map((value, index) => {
                    const reference = `${columnName(index)}${rowNumber}`;
                    if (typeof value === 'number') {
                        return `<c r="${reference}" s="${styleIndex}"><v>${value}</v></c>`;
                    }
                    return `<c r="${reference}" s="${styleIndex}" t="inlineStr"><is><t xml:space="preserve">${xmlEscape(value)}</t></is></c>`;
                }).join('')}</row>`;
            }

            function worksheetXml(rows, widths, freezeRow = 1) {
                return `<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
                    <worksheet xmlns="http://schemas.openxmlformats.org/spreadsheetml/2006/main">
                      <sheetViews><sheetView workbookViewId="0"><pane ySplit="${freezeRow}" topLeftCell="A${freezeRow + 1}" activePane="bottomLeft" state="frozen"/></sheetView></sheetViews>
                      <cols>${widths.map((width, index) => `<col min="${index + 1}" max="${index + 1}" width="${width}" customWidth="1"/>`).join('')}</cols>
                      <sheetData>${rows.join('')}</sheetData>
                      <autoFilter ref="A${freezeRow}:${columnName(widths.length - 1)}${freezeRow}"/>
                    </worksheet>`;
            }

            function downloadXlsx(summaries, records, semester) {
                const summaryHeaders = [
                    'Course', 'Allocation', 'Head TAs (counted)', 'Accepted', 'Offered', 'Head TAs + Accepted + Offered',
                    'Preferred (not yet staffed)', 'Returning / Paid Committed', 'Returning / Paid Maximum',
                    'New / Unpaid Committed', 'New / Unpaid Minimum When Filled', 'Remaining', 'Status', 'Details'
                ];
                const summaryRows = [
                    xlsxRow([`${semester} staffing summary`], 1, 1),
                    xlsxRow(['Head TAs, Accepted TAs, and Offered TAs count as staffed/committed against the allocation. Preferred candidates are not yet staffed and create advisories only. Returning means paid; New means unpaid for ratio planning. Head TAs are excluded only from the paid/new ratio calculation; Pending candidates are also excluded.'], 2),
                    xlsxRow(summaryHeaders, 3, 1),
                    ...summaries.map((summary, index) => xlsxRow([
                        summary.course, summary.allocation, summary.headTAs, summary.accepted, summary.offered,
                        summary.committed, summary.preferred, summary.returning,
                        summary.maximumReturning, summary.newCount, summary.minimumNew,
                        summary.remaining, summary.level, summary.issues
                    ], index + 4, { Problem: 2, Advisory: 3, OK: 4 }[summary.level]))
                ];
                const statusOrder = {
                    'Head TA': 0, Accepted: 1, Offered: 2, Preferred: 3,
                    Pending: 4, Unranked: 5, Declined: 6
                };
                const detailHeaders = [
                    'Semester', 'Course', 'Status', 'Rank', 'TA Type', 'Name', 'Username',
                    'Email', 'GTID', 'Duplicate Key', 'Total Attachments', 'Attachment Number',
                    'Appears Multiple Times'
                ];
                const sortedRecords = [...records].sort((a, b) =>
                    a.course.localeCompare(b.course, undefined, { numeric: true }) ||
                    (statusOrder[a.status] ?? 99) - (statusOrder[b.status] ?? 99) ||
                    (Number(a.rank) || 0) - (Number(b.rank) || 0)
                );
                const detailRows = [
                    xlsxRow(detailHeaders, 1, 1),
                    ...sortedRecords.map((record, index) => xlsxRow([
                        record.semester, record.course, record.status, record.rank,
                        record.taType === 'Returning' ? 'Returning (paid)' : 'New (unpaid)',
                        record.name, record.username, record.email, record.gtid, record.duplicateKey,
                        record.attachmentCount, record.attachmentNumber,
                        record.attachmentCount > 1 ? 'Yes' : 'No'
                    ], index + 2))
                ];
                const files = {
                    '[Content_Types].xml': `<?xml version="1.0" encoding="UTF-8" standalone="yes"?><Types xmlns="http://schemas.openxmlformats.org/package/2006/content-types"><Default Extension="rels" ContentType="application/vnd.openxmlformats-package.relationships+xml"/><Default Extension="xml" ContentType="application/xml"/><Override PartName="/xl/workbook.xml" ContentType="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml"/><Override PartName="/xl/worksheets/sheet1.xml" ContentType="application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml"/><Override PartName="/xl/worksheets/sheet2.xml" ContentType="application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml"/><Override PartName="/xl/styles.xml" ContentType="application/vnd.openxmlformats-officedocument.spreadsheetml.styles+xml"/></Types>`,
                    '_rels/.rels': `<?xml version="1.0" encoding="UTF-8" standalone="yes"?><Relationships xmlns="http://schemas.openxmlformats.org/package/2006/relationships"><Relationship Id="rId1" Type="http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument" Target="xl/workbook.xml"/></Relationships>`,
                    'xl/workbook.xml': `<?xml version="1.0" encoding="UTF-8" standalone="yes"?><workbook xmlns="http://schemas.openxmlformats.org/spreadsheetml/2006/main" xmlns:r="http://schemas.openxmlformats.org/officeDocument/2006/relationships"><sheets><sheet name="Course Summary" sheetId="1" r:id="rId1"/><sheet name="Assignments" sheetId="2" r:id="rId2"/></sheets></workbook>`,
                    'xl/_rels/workbook.xml.rels': `<?xml version="1.0" encoding="UTF-8" standalone="yes"?><Relationships xmlns="http://schemas.openxmlformats.org/package/2006/relationships"><Relationship Id="rId1" Type="http://schemas.openxmlformats.org/officeDocument/2006/relationships/worksheet" Target="worksheets/sheet1.xml"/><Relationship Id="rId2" Type="http://schemas.openxmlformats.org/officeDocument/2006/relationships/worksheet" Target="worksheets/sheet2.xml"/><Relationship Id="rId3" Type="http://schemas.openxmlformats.org/officeDocument/2006/relationships/styles" Target="styles.xml"/></Relationships>`,
                    'xl/styles.xml': `<?xml version="1.0" encoding="UTF-8" standalone="yes"?><styleSheet xmlns="http://schemas.openxmlformats.org/spreadsheetml/2006/main"><fonts count="3"><font><sz val="11"/><name val="Calibri"/></font><font><b/><color rgb="FFFFFFFF"/><sz val="11"/><name val="Calibri"/></font><font><b/><color rgb="FF8A2018"/><sz val="11"/><name val="Calibri"/></font></fonts><fills count="6"><fill><patternFill patternType="none"/></fill><fill><patternFill patternType="gray125"/></fill><fill><patternFill patternType="solid"><fgColor rgb="FF003057"/><bgColor indexed="64"/></patternFill></fill><fill><patternFill patternType="solid"><fgColor rgb="FFF4CCCC"/><bgColor indexed="64"/></patternFill></fill><fill><patternFill patternType="solid"><fgColor rgb="FFFFF2CC"/><bgColor indexed="64"/></patternFill></fill><fill><patternFill patternType="solid"><fgColor rgb="FFD9EAD3"/><bgColor indexed="64"/></patternFill></fill></fills><borders count="1"><border><left/><right/><top/><bottom/><diagonal/></border></borders><cellStyleXfs count="1"><xf numFmtId="0" fontId="0" fillId="0" borderId="0"/></cellStyleXfs><cellXfs count="5"><xf numFmtId="0" fontId="0" fillId="0" borderId="0" xfId="0"/><xf numFmtId="0" fontId="1" fillId="2" borderId="0" xfId="0" applyFont="1" applyFill="1"/><xf numFmtId="0" fontId="2" fillId="3" borderId="0" xfId="0" applyFont="1" applyFill="1"/><xf numFmtId="0" fontId="0" fillId="4" borderId="0" xfId="0" applyFill="1"/><xf numFmtId="0" fontId="0" fillId="5" borderId="0" xfId="0" applyFill="1"/></cellXfs><cellStyles count="1"><cellStyle name="Normal" xfId="0" builtinId="0"/></cellStyles></styleSheet>`,
                    'xl/worksheets/sheet1.xml': worksheetXml(summaryRows, [22, 12, 20, 11, 11, 18, 23, 24, 24, 21, 28, 12, 12, 80], 3),
                    'xl/worksheets/sheet2.xml': worksheetXml(detailRows, [15, 18, 14, 8, 20, 24, 18, 30, 15, 20, 18, 18, 22], 1)
                };
                const url = URL.createObjectURL(new Blob([createZip(files)], {
                    type: 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'
                }));
                const link = document.createElement('a');
                link.href = url;
                link.download = `ta-staffing-${semester.toLowerCase().replaceAll(' ', '-')}.xlsx`;
                link.click();
                URL.revokeObjectURL(url);
            }

            function createZip(files) {
                const encoder = new TextEncoder();
                const localParts = [];
                const centralParts = [];
                let offset = 0;
                Object.entries(files).forEach(([name, content]) => {
                    const nameBytes = encoder.encode(name);
                    const data = encoder.encode(content);
                    const checksum = crc32(data);
                    const local = concatBytes(
                        littleEndian(0x04034b50, 4), littleEndian(20, 2), littleEndian(0, 2),
                        littleEndian(0, 2), littleEndian(0, 2), littleEndian(0, 2),
                        littleEndian(checksum, 4), littleEndian(data.length, 4), littleEndian(data.length, 4),
                        littleEndian(nameBytes.length, 2), littleEndian(0, 2), nameBytes, data
                    );
                    localParts.push(local);
                    centralParts.push(concatBytes(
                        littleEndian(0x02014b50, 4), littleEndian(20, 2), littleEndian(20, 2),
                        littleEndian(0, 2), littleEndian(0, 2), littleEndian(0, 2), littleEndian(0, 2),
                        littleEndian(checksum, 4), littleEndian(data.length, 4), littleEndian(data.length, 4),
                        littleEndian(nameBytes.length, 2), littleEndian(0, 2), littleEndian(0, 2),
                        littleEndian(0, 2), littleEndian(0, 2), littleEndian(0, 4), littleEndian(offset, 4), nameBytes
                    ));
                    offset += local.length;
                });
                const central = concatBytes(...centralParts);
                return concatBytes(
                    ...localParts,
                    central,
                    littleEndian(0x06054b50, 4), littleEndian(0, 2), littleEndian(0, 2),
                    littleEndian(centralParts.length, 2), littleEndian(centralParts.length, 2),
                    littleEndian(central.length, 4), littleEndian(offset, 4), littleEndian(0, 2)
                );
            }

            function littleEndian(value, length) {
                const bytes = new Uint8Array(length);
                for (let index = 0; index < length; index += 1) bytes[index] = (value >>> (index * 8)) & 255;
                return bytes;
            }

            function concatBytes(...parts) {
                const result = new Uint8Array(parts.reduce((sum, part) => sum + part.length, 0));
                let offset = 0;
                parts.forEach(part => { result.set(part, offset); offset += part.length; });
                return result;
            }

            function crc32(bytes) {
                let crc = 0xffffffff;
                for (const byte of bytes) {
                    crc ^= byte;
                    for (let bit = 0; bit < 8; bit += 1) {
                        crc = (crc >>> 1) ^ (0xedb88320 & -(crc & 1));
                    }
                }
                return (crc ^ 0xffffffff) >>> 0;
            }

            function parseCsv(text) {
                const rows = [];
                let row = [];
                let field = '';
                let quoted = false;
                for (let index = 0; index < text.length; index += 1) {
                    const character = text[index];
                    if (quoted) {
                        if (character === '"' && text[index + 1] === '"') {
                            field += '"';
                            index += 1;
                        } else if (character === '"') {
                            quoted = false;
                        } else field += character;
                    } else if (character === '"') quoted = true;
                    else if (character === ',') {
                        row.push(field);
                        field = '';
                    } else if (character === '\n') {
                        row.push(field.replace(/\r$/, ''));
                        rows.push(row);
                        row = [];
                        field = '';
                    } else field += character;
                }
                if (field || row.length) {
                    row.push(field.replace(/\r$/, ''));
                    rows.push(row);
                }
                const headers = (rows.shift() || []).map((header, index) =>
                    index ? header : header.replace(/^\uFEFF/, '')
                );
                return rows.filter(values => values.some(Boolean)).map(values =>
                    Object.fromEntries(headers.map((header, index) => [header, values[index] || '']))
                );
            }

            function nativeRecord(row) {
                const statuses = {
                    HEADTA: 'Head TA', ACCEPT: 'Accepted', OFFER: 'Offered',
                    PREFER: 'Preferred', PEND: 'Pending', UN: 'Unranked', DECLINE: 'Declined'
                };
                return {
                    semester: clean(row.Semester),
                    course: clean(row.Course),
                    status: statuses[clean(row.Status).toUpperCase()] || clean(row.Status),
                    rank: Number.parseInt(row.Rank, 10) || '',
                    taType: clean(row.TABefore).toUpperCase() === 'YES' ? 'Returning' : 'New',
                    name: clean(`${row.FirstName || ''} ${row.LastName || ''}`),
                    username: clean(row.GTAccount),
                    email: clean(row.Email),
                    gtid: clean(row.GTID)
                };
            }

            function annotateDuplicates(records) {
                const groups = new Map();
                records.forEach(record => {
                    const key = record.gtid || record.username || record.name;
                    if (!groups.has(key)) groups.set(key, []);
                    groups.get(key).push(record);
                });
                groups.forEach(group => group.forEach((record, index) => {
                    record.duplicateKey = record.gtid || record.username || record.name;
                    record.attachmentCount = group.length;
                    record.attachmentNumber = index + 1;
                }));
            }

            function downloadCsv(records, semester) {
                const statusOrder = {
                    'Head TA': 0, Accepted: 1, Offered: 2, Preferred: 3,
                    Pending: 4, Unranked: 5, Declined: 6
                };
                const rows = [[
                    'Semester', 'Course', 'Status', 'Rank', 'TA Type', 'Name',
                    'Username', 'Email', 'GTID', 'Duplicate Key', 'Total Attachments',
                    'Attachment Number', 'Appears Multiple Times'
                ]];
                [...records].sort((a, b) =>
                    a.course.localeCompare(b.course, undefined, { numeric: true }) ||
                    (statusOrder[a.status] ?? 99) - (statusOrder[b.status] ?? 99) ||
                    (Number(a.rank) || 0) - (Number(b.rank) || 0) ||
                    a.username.localeCompare(b.username)
                ).forEach(record => rows.push([
                    record.semester, record.course, record.status, record.rank,
                    record.taType === 'Returning' ? 'Returning (paid)' : 'New (unpaid)',
                    record.name, record.username, record.email, record.gtid,
                    record.duplicateKey, record.attachmentCount, record.attachmentNumber,
                    record.attachmentCount > 1 ? 'Yes' : 'No'
                ]));
                const csv = rows.map(row => row.map(value =>
                    `"${String(value ?? '').replaceAll('"', '""')}"`
                ).join(',')).join('\n');
                const url = URL.createObjectURL(new Blob([`\uFEFF${csv}`], {
                    type: 'text/csv;charset=utf-8;'
                }));
                const link = document.createElement('a');
                link.href = url;
                link.download = `ta-staffing-assignments-${semester.toLowerCase().replaceAll(' ', '-')}.csv`;
                link.click();
                URL.revokeObjectURL(url);
            }

            function addStyles() {
                const style = document.createElement('style');
                style.textContent = `
        #tm-report-center { max-width: 1050px; margin: 25px auto 70px; color: var(--tm-text); } .tm-report-center-header { padding: 24px 26px; border-radius: 14px 14px 0 0; background: #003057; color: white; } .tm-report-center-header h1 { margin: 2px 0 5px; color: white; font-size: 2rem; } .tm-report-center-header p { margin: 0; color: #dce8f1; } .tm-report-eyebrow { color: #d6c57f; font-size: .75rem; font-weight: 800; letter-spacing: .08em; text-transform: uppercase; } .tm-report-semester-row { display: flex; align-items: center; gap: 14px; padding: 16px 22px; border: 1px solid var(--tm-border); border-top: 0; background: var(--tm-surface); } .tm-report-semester-row label { margin: 0; font-weight: 800; } .tm-report-semester-row select { min-width: 190px; min-height: 42px; margin: 0; } .tm-report-cards { display: grid; grid-template-columns: repeat(2, minmax(0, 1fr)); gap: 16px; margin-top: 18px; } .tm-report-card { display: flex; flex-direction: column; gap: 15px; min-height: 265px; padding: 22px; border: 1px solid var(--tm-border); border-radius: 12px; background: var(--tm-surface); box-shadow: var(--tm-shadow); } .tm-report-card-featured { border-top: 5px solid #b3a369; padding-top: 18px; } .tm-report-card h2 { margin: 4px 0 7px; font-size: 1.35rem; } .tm-report-card p { margin: 0; color: var(--tm-muted); } .tm-report-card-tag { color: #857437; font-size: .73rem; font-weight: 800; letter-spacing: .06em; text-transform: uppercase; } #tm-native-report-slot { margin-top: auto; } #tm-native-report-slot form { margin: 0; } #tm-native-report-slot #report_index { display: none; } #tm-native-report-slot button, #tm-download-staffing-report, #tm-download-excel-report { width: 100%; min-height: 44px; margin: 0; border: 1px solid #003057; border-radius: 7px; background: #003057; color: white; cursor: pointer; font-weight: 800; } .tm-toolkit-report-buttons { display: grid; gap: 8px; margin-top: auto; } #tm-download-excel-report { background: #b3a369; color: #252525; border-color: #857437; } :is(#tm-native-report-slot button, #tm-download-staffing-report, #tm-download-excel-report):disabled { cursor: wait; opacity: .6; } .tm-report-check { display: inline-flex; align-items: center; gap: 8px; margin: 0; cursor: pointer; } .tm-report-check input { width: auto; margin: 0; } #tm-report-center-status { min-height: 20px; color: var(--tm-muted); font-size: .82rem; } #tm-report-center-status.tm-report-center-error { color: var(--tm-danger); } @media (max-width: 760px) { .tm-report-cards { grid-template-columns: 1fr; } .tm-report-semester-row { align-items: stretch; flex-direction: column; } }
        `;
                document.head.appendChild(style);
            }
        })();
        }
    });

// ---- feature: instructor-dashboard ----
    toolkit.register({
        id: 'instructor-dashboard',
        name: 'Instructor Dashboard',
        init() {
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
        #tm-instructor-dashboard { margin: 18px 0 50px; color: #252525; } .tm-primary-button { padding: 10px 16px; border-radius: 7px; background: #b3a369; color: #111 !important; font-weight: 700; text-decoration: none !important; white-space: nowrap; } .tm-dashboard-stats { display: grid; grid-template-columns: repeat(4, 1fr); gap: 12px; margin-bottom: 15px; } .tm-stat-card { display: flex; flex-direction: column; padding: 15px; border: 1px solid #ddd; border-radius: 9px; background: white; } .tm-stat-card strong { font-size: 1.55rem; } .tm-stat-card span { color: #667085; font-size: .86rem; } .tm-toolbar { grid-template-columns: minmax(300px, 2fr) minmax(175px, 1fr) minmax(190px, 1fr) auto; } #tm-instructor-dashboard .tm-toolbar > div { display: flex; min-width: 0; flex-direction: column; gap: 7px; } #tm-instructor-dashboard .tm-toolbar label { position: static !important; inset: auto !important; display: block !important; width: auto !important; height: auto !important; margin: 0 !important; padding: 0 !important; transform: none !important; line-height: 1.25 !important; } #tm-instructor-dashboard .tm-toolbar input, #tm-instructor-dashboard .tm-toolbar select { box-sizing: border-box !important; width: 100% !important; min-width: 0 !important; height: 46px !important; margin: 0 !important; } .tm-options { display: flex; align-items: center; gap: 18px; padding: 11px 15px; border: 1px solid #ccc; border-top: 0; background: #f6f6f6; } .tm-options label { display: flex; align-items: center; gap: 6px; margin: 0; } #tm-result-summary { margin-left: auto; color: #667085; font-weight: 600; } .tm-course-grid, .tm-instructor-grid { display: grid; grid-template-columns: repeat( auto-fill, minmax(340px, 1fr) ); gap: 14px; margin-top: 15px; } .tm-course-card, .tm-instructor-card { overflow: hidden; border: 1px solid #d8d8d8; border-radius: 9px; background: white; box-shadow: 0 2px 7px rgba(0,0,0,.05); } .tm-card-header { display: flex; align-items: center; justify-content: space-between; gap: 12px; padding: 13px 15px; border-bottom: 1px solid #ddd; background: #f7f5ec; } .tm-card-header h3 { margin: 0; font-size: 1.08rem; } .tm-card-header span { color: #667085; font-size: .8rem; white-space: nowrap; } .tm-assignment-list { padding: 5px 15px; } .tm-assignment-row { display: flex; align-items: center; justify-content: space-between; gap: 12px; padding: 10px 0; border-bottom: 1px solid #eee; } .tm-assignment-row:last-child { border-bottom: 0; } .tm-term-badge { display: inline-block; margin-left: 7px; padding: 2px 7px; border-radius: 999px; background: #eee; color: #555; font-size: .72rem; } .tm-edit-link { padding: 5px 9px; border: 1px solid #c7bb86; border-radius: 5px; background: #faf7e8; color: #554a20 !important; font-size: .78rem; font-weight: 700; text-decoration: none !important; } .tm-edit-link:hover { background: #eee4b5; } .tm-no-assignments { padding: 12px 0; color: #888; font-style: italic; } .tm-empty { display: flex; flex-direction: column; align-items: center; gap: 5px; margin-top: 15px; padding: 45px; border: 1px dashed #999; border-radius: 9px; color: #667085; } @media (max-width: 850px) { .tm-dashboard-stats { grid-template-columns: 1fr 1fr; } .tm-toolbar { position: static; grid-template-columns: 1fr 1fr; } } @media (max-width: 600px) { .tm-dashboard-header { align-items: flex-start; flex-direction: column; } .tm-dashboard-stats, .tm-toolbar { grid-template-columns: 1fr; } .tm-options { align-items: flex-start; flex-direction: column; } #tm-result-summary { margin-left: 0; } .tm-course-grid, .tm-instructor-grid { grid-template-columns: 1fr; } }
        `;

                document.head.appendChild(style);
            }
        })();
        }
    });

// ---- feature: power-tools ----
    toolkit.register({
        id: 'power-tools',
        name: 'Power Tools',
        init() {
        (function () {
          "use strict";

          const { escapeHtml } = toolkit.utils;

          function init() {
            if (document.getElementById("taPowerToolsPanel")) return;

            const lists = {
              headTAList: document.getElementById("headTAList"),
              acceptedList: document.getElementById("acceptedList"),
              offeredList: document.getElementById("offeredList"),
              preferredList: document.getElementById("preferredList"),
              pendingList: document.getElementById("pendingList"),
              unrankedList: document.getElementById("unrankedList"),
              declinedList: document.getElementById("declinedList")
            };

            if (!lists.headTAList || !lists.preferredList || !lists.unrankedList || !lists.declinedList) return;

            document.body.classList.add("gt-ta-toolkit-page");

            const appCache = new Map();
            let rankingChangeCount = 0;
            const allocationCapacity = Number.parseInt(
              document.querySelector("#allocation .allocationCapacity")?.textContent,
              10
            ) || 0;

            function allTAs() {
              return [...document.querySelectorAll("li.rankedItem")];
            }

            function headerForList(list) {
              let el = list.previousElementSibling;
              while (el && el.tagName !== "H3") el = el.previousElementSibling;
              return el;
            }

            function nameOf(li) {
              return li.querySelector(".name")?.textContent.trim() || "";
            }

            function gtOf(li) {
              return li.querySelector(".gtaccount")?.textContent.trim() || "";
            }

            function expOf(li) {
              return li.querySelector(".experience")?.textContent.trim() || "";
            }

            function interestOf(li) {
              return li.querySelector(".interest")?.textContent.trim() || "";
            }

            function levelOf(li) {
              return li.querySelector(".level")?.textContent.trim() || "";
            }

            function conflictOf(li) {
              return li.querySelector(".conflict")?.textContent.trim() || "";
            }

            function employmentOf(li) {
              return li.querySelector(".gtEmployment")?.textContent.trim() || "";
            }

            function isNewTA(li) {
              return !!li.querySelector(".newTA");
            }

            function firstNameKey(li) {
              return nameOf(li).toLowerCase();
            }

            function lastNameKey(li) {
              const parts = nameOf(li).toLowerCase().split(/\s+/);
              return `${parts.at(-1) || ""}, ${parts.slice(0, -1).join(" ")}`;
            }

            function experienceKey(li) {
              return ({ TABefore: 0, Passed: 1, Enrolled: 2, AP: 3 }[expOf(li)] ?? 99);
            }

            function interestKey(li) {
              return ({ Very: 0, Somewhat: 1, Least: 2 }[interestOf(li)] ?? 99);
            }

            function conflictKey(li) {
              return conflictOf(li) ? 1 : 0;
            }

            function injectModernCSS() {
              const style = document.createElement("style");
              style.id = "taModernCSS";
              style.textContent = `
        body { background: #f6f8fb !important; } main.container { max-width: 1500px !important; } .rank-body { width: 100% !important; } #taTopLayout { display: grid; grid-template-columns: minmax(0, 1fr) 320px; gap: 16px; align-items: start; margin: 14px 0 18px; } #taTopLeft { min-width: 0; } #taInstructorBox { background: #ffffff; border: 1px solid #d9dee8; border-radius: 12px; padding: 12px; box-shadow: 0 2px 8px rgba(0,0,0,.06); max-height: 360px; overflow: auto; position: sticky; top: 8px; } #taInstructorBox summary { cursor: pointer; font-weight: 700; color: #003057; } #taInstructorBox ul { margin: 8px 0 0 18px; padding: 0; line-height: 1.45; } #taPowerToolsPanel { position: sticky; top: 0; z-index: 9999; background: white; border: 2px solid #003057; border-radius: 12px; box-shadow: 0 4px 18px rgba(0,0,0,.15); padding: 12px; margin: 0; font-family: Arial, sans-serif; font-size: 14px; } #taSearchBox, #bulkTABox { border: 1px solid #cbd5e1; border-radius: 8px; } #taPlacementSummary { margin-top: 8px; background: #ffffff; border: 1px solid #d9dee8; border-radius: 10px; padding: 10px 12px; box-shadow: 0 2px 8px rgba(0,0,0,.04); font-size: 14px; } .rank-aside { background: #ffffff; border: 1px solid #d9dee8; border-radius: 10px; padding: 14px; margin-top: 18px; box-shadow: 0 2px 8px rgba(0,0,0,.04); clear: both; } form[name="instructor_management"] > h2 { margin-top: 20px; padding: 12px 16px; background: #003057; color: #fff; border-radius: 12px; } form[name="instructor_management"] > h3 { background: #ffffff; border: 1px solid #d9dee8; border-radius: 12px 12px 0 0; padding: 12px 14px; margin-top: 22px; margin-bottom: 0; display: flex; align-items: center; flex-wrap: wrap; gap: 6px; box-shadow: 0 2px 8px rgba(0,0,0,.04); } ul.rankedTable { background: #ffffff; border: 1px solid #d9dee8; border-top: none; border-radius: 0 0 12px 12px; padding: 10px !important; margin-bottom: 18px !important; min-height: 42px; box-shadow: 0 2px 8px rgba(0,0,0,.04); } li.rankedItem { list-style: none !important; background: #ffffff !important; border: 1px solid #dfe5ef !important; border-left: 5px solid #b3a369 !important; border-radius: 10px !important; margin: 8px 0 !important; padding: 10px 12px !important; box-shadow: 0 1px 4px rgba(0,0,0,.05); transition: box-shadow .12s ease, transform .12s ease; } li.rankedItem:hover { box-shadow: 0 4px 14px rgba(0,0,0,.12); transform: translateY(-1px); } li.rankedItem p.request { margin-bottom: 4px !important; line-height: 1.45; } .name { font-weight: 700; font-size: 15px; } .gtaccount { font-family: ui-monospace, SFMono-Regular, Menlo, Consolas, monospace; font-size: 13px; } .taStudentDetails { display: flex; flex-wrap: wrap; gap: 4px 14px; margin: 5px 0 3px; color: #4b5563; font-size: 12px; } .taStudentDetails strong { color: #374151; } .taStudentDetails a { color: #075a9c; } .taStudentDetailsLoading { color: #6b7280; font-style: italic; } .newTA, .experience, .interest, .level, .gtEmployment, .conflict { display: inline-block; padding: 1px 6px; border-radius: 999px; font-size: 11px; font-weight: 600; margin: 1px 2px; } .newTA { background: #eef2ff; color: #3730a3; } .experience { background: #ecfdf5; color: #047857; } .interest { background: #fff7ed; color: #c2410c; } .level { background: #f3f4f6; color: #374151; } .gtEmployment { background: #e0f2fe; color: #0369a1; } .conflict { background: #fee2e2 !important; color: #991b1b !important; border: 1px solid #fecaca; } .taSectionControls button, #taPowerToolsPanel button { border: 1px solid #cbd5e1; border-radius: 6px; background: #f8fafc; color: #111827; cursor: pointer; } .taSectionControls button:hover, #taPowerToolsPanel button:hover { background: #e5e7eb; } @media (max-width: 1000px) { #taTopLayout { grid-template-columns: 1fr; } #taInstructorBox { position: static; max-height: 260px; } }
        `;
              document.head.appendChild(style);
            }

            function makeTopLayout() {
              const main = document.querySelector("main.container");
              const h1 = main?.querySelector("h1");
              if (!main || !h1 || document.getElementById("taTopLayout")) return null;

              const layout = document.createElement("div");
              layout.id = "taTopLayout";

              const left = document.createElement("div");
              left.id = "taTopLeft";

              const right = document.createElement("div");
              right.id = "taTopRight";

              layout.appendChild(left);
              layout.appendChild(right);

              h1.insertAdjacentElement("afterend", layout);

              const allocation = document.getElementById("allocation");
              const sectionNote = document.getElementById("sectionNote");

              if (allocation) left.appendChild(allocation);
              if (sectionNote) left.appendChild(sectionNote);

              return { layout, left, right };
            }

            function injectWorkflowCSS() {
              const style = document.createElement("style");
              style.id = "taWorkflowCSS";
              style.textContent = `
        main.container { width: min(1440px, calc(100% - 32px)) !important; } #taTopLayout { display: block !important; margin: 14px 0 22px; } #taTopRight:empty { display: none; } #taPlacementSummary { display: grid; grid-template-columns: repeat(auto-fit, minmax(145px, 1fr)); gap: 10px; margin: 0 0 14px; padding: 0; border: 0; background: transparent; box-shadow: none; } :is(#headTAList, #acceptedList, #offeredList, #preferredList, #pendingList, #declinedList) li.rankedItem { border-left-color: #b3a369 !important; opacity: 1; } #taPlacementSummary > div { display: flex; flex-direction: column; gap: 3px; padding: 14px 16px; border: 1px solid #d8dfe5; border-radius: 10px; background: #fff; box-shadow: 0 2px 7px rgba(20, 35, 45, .05); } #taPlacementSummary span { color: #667681; font-size: 12px; font-weight: 700; } #taPlacementSummary strong { color: #20313e; font-size: 25px; line-height: 1.1; } #taPlacementSummary strong small { color: #71808a; font-size: 12px; font-weight: 700; } #taPlacementSummary .taAllocationLimit { background: #f7fafc; } #taPlacementSummary .taHeadCount { border-color: #cabd8c; background: #fffdf4; } #taPlacementSummary .taHeadRule { display: block; grid-column: 1 / -1; padding: 10px 13px; border-color: #d8c98f; background: #fffbea; color: #5d522b; font-size: 12px; line-height: 1.5; } #taPlacementSummary .taHeadRule strong { display: inline; color: #4b401b; font-size: inherit; } #taPlacementSummary .taLimitViolation { border-color: #e1a39e; background: #fff2f1; } #taPlacementSummary .taLimitViolation strong { color: #a12820; } #taPlacementSummary.taAllocationOver .taAllocationBalance { border-color: #e5aaa5; background: #fff3f2; } #taPlacementSummary.taAllocationOver .taAllocationBalance strong { color: #a32820; } #taPlacementSummary .taAllocationBalance strong { font-size: 18px; } #taPowerToolsPanel { position: sticky; top: 0; z-index: 500; padding: 16px; border: 1px solid #cbd5dd !important; border-top: 4px solid #003057 !important; font-family: inherit; max-height: calc(100vh - 10px); overflow: auto; } .taToolbarHeading { display: flex; align-items: center; justify-content: space-between; gap: 16px; } .taToolbarHeading strong { display: block; color: #003057; font-size: 17px; } .taToolbarHeading small { display: block; margin-top: 2px; color: #6b7780; } .taToolbarActions { display: flex; align-items: center; gap: 9px; } .taGlobalFilters { display: grid; grid-template-columns: minmax(210px, 1.5fr) repeat(5, minmax(135px, 1fr)) auto; align-items: end; gap: 10px; margin-top: 13px; } .taGlobalFilters label { display: flex; min-width: 0; flex-direction: column; gap: 5px; margin: 0; } .taGlobalFilters label > span { color: #596773; font-size: 11px; font-weight: 800; } .taGlobalFilters :is(input, select), #bulkTABox, .taMoveSelect { box-sizing: border-box; border: 1px solid #aab6bf; border-radius: 6px; background: #fff; color: #26343e; } .taGlobalFilters :is(input, select) { width: 100%; height: 40px; margin: 0; padding: 7px 9px; } #taPowerToolsPanel button, .taSectionControls button { min-height: 38px; padding: 6px 11px; border: 1px solid #aab6bf; border-radius: 6px; background: #fff; color: #25343e; font-weight: 700; } #taApplySort { background: #003057 !important; color: #fff !important; } #taFilterSummary { margin-top: 8px; color: #62717b; font-size: 12px; } #taSearchResults { display: grid; grid-template-columns: repeat(auto-fill, minmax(300px, 1fr)); gap: 8px; max-height: 250px; margin-top: 10px; overflow: auto; } #taSearchResults:empty { display: none; } .taSearchResult { display: flex; align-items: center; justify-content: space-between; gap: 12px; padding: 10px 11px; border: 1px solid #d9e0e5; border-radius: 8px; background: #f8fafb; } .taSearchResult strong, .taSearchResult small { display: block; } .taSearchGT { margin-left: 7px; color: #5c6972; font-family: ui-monospace, monospace; font-size: 12px; } .taSearchResult small { margin-top: 3px; color: #64717b; } .taSearchMove { display: flex; flex: 0 0 auto; align-items: center; gap: 6px; color: #5d6972; font-size: 11px; font-weight: 800; } .taSearchMove .taMoveSelect { min-width: 135px; } .taSearchConflict { color: #a12820; font-weight: 800; } .taSearchEmpty { padding: 12px; border-radius: 7px; background: #f5f7f8; color: #66737c; } .taSearchTarget { outline: 4px solid rgba(179, 163, 105, .55) !important; outline-offset: 2px; } #taAdvancedTools { margin-top: 12px; border-top: 1px solid #e0e5e9; padding-top: 10px; } #taAdvancedTools > summary { width: fit-content; color: #3f5260; cursor: pointer; font-weight: 700; } .taAdvancedGrid { display: grid; grid-template-columns: 1fr 1fr; gap: 18px; margin-top: 12px; } .taAdvancedGrid section { display: flex; align-items: flex-start; flex-direction: column; gap: 8px; } #bulkTABox { width: 100%; min-height: 86px; padding: 9px; resize: vertical; } #taInstructorBox.taAdvancedInstructors { position: static; grid-column: 1 / -1; max-height: 240px; margin: 0; box-shadow: none; } form[name="instructor_management"] > h2 { margin: 26px 0 10px; padding: 0; background: transparent; color: #25343e; font-size: 22px; } form[name="instructor_management"] > h3 { display: grid; grid-template-columns: auto auto 1fr auto; align-items: center; gap: 9px; margin-top: 16px; padding: 13px 15px; border-radius: 10px 10px 0 0; box-shadow: none; } .taSectionCount { color: #52616c !important; } .taSectionCount { display: inline-flex; flex-wrap: wrap; gap: 5px; } .taSectionCount > span { padding: 3px 7px; border-radius: 999px; background: #edf1f3; color: #52616c; font-size: 11px; font-weight: 500; white-space: nowrap; } .taSectionCount strong { color: #26343e; } .taSectionDescription { color: #6d7880; font-size: 12px; font-weight: 400; } .taSectionControls { justify-self: end; } .taSectionControls button { min-height: 32px; padding: 4px 9px; font-size: 11px; } .taCollapsibleHeading { cursor: pointer; } .taCollapsibleHeading:hover { background: #f7f9fa !important; } .taCollapsibleHeading:focus-visible { outline: 3px solid rgba(0, 48, 87, .25); outline-offset: 2px; } ul.rankedTable { display: grid !important; grid-template-columns: repeat(auto-fill, minmax(330px, 1fr)); gap: 10px; margin-bottom: 14px !important; box-shadow: none; } ul.rankedTable[style*="display: none"] { display: none !important; } li.rankedItem { display: flex !important; min-width: 0; min-height: 150px; flex-direction: column; align-items: stretch; gap: 7px; margin: 0 !important; border-left-color: #b3a369 !important; box-shadow: none; } li.rankedItem:hover { transform: none; box-shadow: 0 3px 10px rgba(20,35,45,.09); } li.rankedItem[hidden] { display: none !important; } li.rankedItem p.request { margin: 0 !important; } .taMoveControl { display: flex; align-items: center; justify-content: flex-end; gap: 7px; margin-top: auto; padding-top: 7px; border-top: 1px solid #e5e9ec; color: #5d6972; font-size: 11px; font-weight: 700; } .taMoveSelect { min-width: 145px; height: 34px; padding: 4px 26px 4px 8px; } .taStudentDetails { display: grid; grid-template-columns: repeat(2, minmax(0, 1fr)); gap: 3px 10px; margin: 1px 0; } .taStudentDetails span { min-width: 0; overflow-wrap: anywhere; } ul.rankedTable .ui-sortable-placeholder { min-height: 150px; border: 2px dashed #9d8b4c !important; border-radius: 9px; background: #fffbea !important; visibility: visible !important; } .conflict { font-weight: 800; } .taNativeSave { display: none !important; } #taSaveBar { position: fixed; right: 20px; bottom: 20px; z-index: 10000; display: flex; align-items: center; gap: 10px; padding: 12px 13px 12px 16px; border: 1px solid #c9d0d5; border-radius: 10px; background: #fff; color: #53616b; box-shadow: 0 12px 34px rgba(25, 35, 42, .22); } #taSaveBar strong, #taSaveBar small { display: block; } #taSaveBar strong { font-size: 11px; } #taSaveBar small { margin-top: 2px; color: #75818a; font-size: 10px; } #taSaveBar.taHasChanges { border-color: #c8a948; background: #fffbea; } #taSaveBar.taHasChanges strong { color: #745900; } #taRestoreRankings { min-height: 38px; padding: 6px 11px; border: 1px solid #aab6bf; border-radius: 7px; background: #fff; color: #344650; font-size: 11px; font-weight: 800; } #taRestoreRankings[hidden] { display: none; } #taSaveRankings { min-height: 38px; padding: 6px 13px; border: 1px solid #003057; border-radius: 7px; background: #003057; color: #fff; font-weight: 800; } #taSaveRankings:disabled { border-color: #b8c0c6; background: #e5e9ec; color: #7b858c; cursor: default; } #taApplicationDialog { width: min(680px, calc(100% - 32px)); max-height: 82vh; padding: 0; overflow: auto; border: 1px solid #b7c2ca; border-radius: 12px; color: #26343e; box-shadow: 0 24px 70px rgba(0,0,0,.32); } #taApplicationDialog::backdrop { background: rgba(13, 25, 34, .58); } .taDialogHeading { position: sticky; top: 0; display: flex; align-items: center; justify-content: space-between; padding: 13px 16px; border-bottom: 1px solid #dce2e6; background: #fff; } .taDialogHeading button { border: 0; background: transparent; font-size: 25px; cursor: pointer; } #taApplicationContent { padding: 18px; line-height: 1.5; } .taFullApplicationLink { display: inline-flex; margin-top: 16px; padding: 8px 11px; border-radius: 6px; background: #eaf2f7; color: #003057 !important; font-weight: 800; text-decoration: none !important; } @media (max-width: 1050px) { .taGlobalFilters { grid-template-columns: repeat(3, 1fr); } #taPlacementSummary { grid-template-columns: repeat(2, 1fr); } } @media (max-width: 700px) { .taGlobalFilters, .taAdvancedGrid, #taPlacementSummary { grid-template-columns: 1fr; } ul.rankedTable { grid-template-columns: 1fr; } .taStudentDetails { grid-template-columns: 1fr; } .taToolbarHeading { align-items: stretch; flex-direction: column; } .taToolbarActions { justify-content: space-between; } #taSaveBar { right: 10px; bottom: 10px; left: 10px; flex-wrap: wrap; justify-content: flex-end; } #taSaveBar > div { margin-right: auto; } }
        `;
              document.head.appendChild(style);
            }

            function moveInstructorsToRight(topLayout) {
              const instructors = document.getElementById("instructors");
              if (!instructors || !topLayout?.right) return;

              const counts = new Map();

              [...instructors.querySelectorAll(".instructor")].forEach(span => {
                const name = span.textContent.trim().replace(/\.$/, "");
                if (!name) return;
                counts.set(name, (counts.get(name) || 0) + 1);
              });

              const box = document.createElement("details");
              box.id = "taInstructorBox";
              box.open = false;

              const listItems = [...counts.entries()]
                .sort((a, b) => a[0].localeCompare(b[0]))
                .map(([name, count]) => `<li>${escapeHtml(name)} <span style="color:#666;">(${count})</span></li>`)
                .join("");

              box.innerHTML = `
                <summary>Instructors (${counts.size} unique)</summary>
                <ul>${listItems}</ul>
              `;

              instructors.remove();
              topLayout.right.appendChild(box);
            }

            function countIn(listId) {
              const list = document.getElementById(listId);
              if (!list) return { total: 0, newCount: 0 };
              const items = [...list.querySelectorAll("li.rankedItem")];
              return {
                total: items.length,
                newCount: items.filter(isNewTA).length,
                returningCount: items.filter(item => !isNewTA(item)).length
              };
            }

            function updateAllocationSummary() {
              const allocation = document.getElementById("allocation");
              if (!allocation) return;

              let summary = document.getElementById("taPlacementSummary");
              if (!summary) {
                summary = document.createElement("div");
                summary.id = "taPlacementSummary";
                allocation.appendChild(summary);
              }

              allocation.querySelector(":scope > p")?.remove();
              const capacity = allocationCapacity;
              const head = countIn("headTAList");
              const accepted = countIn("acceptedList");
              const offered = countIn("offeredList");
              const preferred = countIn("preferredList");
              const placedNew =
                accepted.newCount + offered.newCount + preferred.newCount;
              // Head TAs consume allocation slots, but remain outside the new/returning ratio.
              const placedTotal = head.total + accepted.total + offered.total + preferred.total;
              const placedReturning =
                accepted.returningCount + offered.returningCount + preferred.returningCount;
              const remaining = capacity - placedTotal;
              const maximumReturning = Math.ceil(capacity * 20 / 30);
              const minimumNew = Math.max(0, capacity - maximumReturning);
              const returningOver = Math.max(0, placedReturning - maximumReturning);
              const newStillNeeded = Math.max(0, minimumNew - placedNew);

              summary.className = remaining < 0 ? "taAllocationOver" : "";
              summary.innerHTML = `
                <div><span>Total allocation</span><strong>${capacity}</strong></div>
                <div class="taHeadCount">
                  <span>Your Head TA selections</span>
                  <strong>${head.total}</strong>
                  <small>Ranked right now — this is not your allowed limit</small>
                </div>
                <div class="taAllocationLimit ${returningOver ? "taLimitViolation" : ""}">
                  <span>Returning allowed · maximum</span>
                  <strong>${maximumReturning}</strong>
                </div>
                <div class="taAllocationLimit">
                  <span>New TAs required · minimum</span>
                  <strong>${minimumNew}</strong>
                </div>
                <div><span>Total placed (including Head TAs)</span><strong>${placedTotal}</strong></div>
                <div class="${returningOver ? "taLimitViolation" : ""}">
                  <span>Returning placed</span>
                  <strong>${placedReturning} <small>of ${maximumReturning} max</small></strong>
                </div>
                <div>
                  <span>New placed</span>
                  <strong>${placedNew} <small>${newStillNeeded ? `${newStillNeeded} still needed` : "minimum met"}</small></strong>
                </div>
                <div class="taAllocationBalance">
                  <span>${remaining < 0 ? "Over allocation" : "Spots remaining"}</span>
                  <strong>${Math.abs(remaining)}</strong>
                </div>
                <div class="taHeadRule">
                  <strong>Head TA reminder:</strong>
                  Head TAs count toward this course's total allocation, but do not count
                  against the new/returning ratio. Their allowance depends on the number
                  of instructors for this course and cannot be calculated from this page.
                  Do not rank more Head TAs than the program permits; candidates above
                  the allowed number will not be hired.
                </div>
              `;
            }

            function refreshInlineButtons() {
              allTAs().forEach(li => {
                const select = li.querySelector(".taMoveSelect");
                if (select) select.value = li.parentElement.id;
              });
            }

            function updateSectionCounts() {
              document.querySelectorAll("ul.rankedTable").forEach(list => {
                const h3 = headerForList(list);
                if (!h3) return;

                let countSpan = h3.querySelector(".taSectionCount");
                if (!countSpan) {
                  countSpan = document.createElement("span");
                  countSpan.className = "taSectionCount";
                  countSpan.style = "color:#6b7280;font-size:13px;font-weight:500;";
                  h3.insertBefore(
                    countSpan,
                    h3.querySelector(".taSectionDescription, .taSectionControls")
                  );
                }

                const count = countIn(list.id);
                countSpan.innerHTML = `
                  <span><strong>${count.total}</strong> total</span>
                  <span><strong>${count.returningCount}</strong> returning</span>
                  <span><strong>${count.newCount}</strong> new</span>
                `;
              });
            }

            function markRankingDirty() {
              rankingChangeCount = 1;
              const bar = document.getElementById("taSaveBar");
              const count = document.getElementById("taChangeCount");
              const saveButton = document.getElementById("taSaveRankings");
              if (bar) bar.classList.add("taHasChanges");
              if (count) count.textContent = "Unsaved ranking changes";
              if (saveButton) saveButton.disabled = false;
            }

            function moveTo(li, list) {
              list.appendChild(li);
              markRankingDirty();
              refreshInlineButtons();
              updateSectionCounts();
              updateAllocationSummary();
            }

            function createMoveSelect(li, afterMove = () => {}) {
              const select = document.createElement("select");
              select.className = "taMoveSelect";
              [
                ["headTAList", "Head TA", false],
                ["acceptedList", "Accepted (outcome)", true],
                ["offeredList", "Offered (outcome)", true],
                ["preferredList", "Preferred", false],
                ["pendingList", "Pending / backup", false],
                ["unrankedList", "Unranked", false],
                ["declinedList", "Declined", false]
              ].forEach(([value, text, disabled]) => {
                if (!lists[value]) return;
                const option = document.createElement("option");
                option.value = value;
                option.textContent = text;
                option.disabled = disabled;
                select.appendChild(option);
              });
              select.value = li.parentElement.id;
              select.addEventListener("change", event => {
                const target = lists[event.target.value];
                if (target) {
                  moveTo(li, target);
                  afterMove();
                }
              });
              return select;
            }

            function addInlineButtons() {
              allTAs().forEach(li => {
                if (li.querySelector(".taMoveSelect")) return;

                const label = document.createElement("label");
                label.className = "taMoveControl";
                label.append("Move to ");

                label.appendChild(createMoveSelect(li));
                li.appendChild(label);
              });

              refreshInlineButtons();
            }

            function sortList(list, keyFn) {
              [...list.querySelectorAll("li.rankedItem")]
                .sort((a, b) => {
                  const ka = keyFn(a);
                  const kb = keyFn(b);

                  if (typeof ka === "number" && typeof kb === "number") {
                    return ka - kb || lastNameKey(a).localeCompare(lastNameKey(b));
                  }

                  return String(ka).localeCompare(String(kb));
                })
                .forEach(li => list.appendChild(li));

              markRankingDirty();
              refreshInlineButtons();
              updateSectionCounts();
              updateAllocationSummary();
            }

            function smartSort(list) {
              [...list.querySelectorAll("li.rankedItem")]
                .sort((a, b) =>
                  conflictKey(a) - conflictKey(b) ||
                  experienceKey(a) - experienceKey(b) ||
                  interestKey(a) - interestKey(b) ||
                  lastNameKey(a).localeCompare(lastNameKey(b))
                )
                .forEach(li => list.appendChild(li));

              markRankingDirty();
              refreshInlineButtons();
              updateSectionCounts();
              updateAllocationSummary();
            }

            function toggleSection(list, btn) {
              const hidden = list.style.display === "none";
              list.style.display = hidden ? "" : "none";
              if (btn) btn.textContent = hidden ? "Collapse" : "Expand";
              headerForList(list)?.setAttribute("aria-expanded", String(hidden));
              localStorage.setItem(`taSectionCollapsed_${list.id}`, String(!hidden));
            }

            function addSectionButtons() {
              const descriptions = {
                headTAList: "Instructor-ranked leadership candidates",
                acceptedList: "Hiring outcome — accepted offers",
                offeredList: "Hiring outcome — offers awaiting response",
                preferredList: "Instructor-ranked candidates",
                pendingList: "Backup candidates available if needed",
                unrankedList: "Applicants awaiting review",
                declinedList: "Not being considered for this course"
              };

              document.querySelectorAll("ul.rankedTable").forEach(list => {
                if (list.dataset.taToolsAdded) return;
                list.dataset.taToolsAdded = "true";

                const h3 = headerForList(list);
                if (!h3) return;

                const controls = document.createElement("span");
                controls.className = "taSectionControls";

                function make(label, fn) {
                  const b = document.createElement("button");
                  b.type = "button";
                  b.textContent = label;
                  b.onclick = fn;
                  return b;
                }

                const collapseBtn = make("Collapse", () => toggleSection(list, collapseBtn));

                controls.appendChild(collapseBtn);

                const description = document.createElement("small");
                description.className = "taSectionDescription";
                description.textContent = descriptions[list.id] || "";
                h3.appendChild(description);

                h3.appendChild(controls);
                h3.classList.add("taCollapsibleHeading");
                h3.tabIndex = 0;
                h3.setAttribute("role", "button");
                h3.setAttribute("aria-controls", list.id);
                h3.setAttribute("aria-expanded", "true");
                h3.addEventListener("click", event => {
                  if (event.target.closest("button, a, input, select")) return;
                  toggleSection(list, collapseBtn);
                });
                h3.addEventListener("keydown", event => {
                  if (event.key !== "Enter" && event.key !== " ") return;
                  event.preventDefault();
                  toggleSection(list, collapseBtn);
                });

                if (localStorage.getItem(`taSectionCollapsed_${list.id}`) === "true") {
                  list.style.display = "none";
                  collapseBtn.textContent = "Expand";
                  h3.setAttribute("aria-expanded", "false");
                }
              });

              updateSectionCounts();
            }

            function compactApplicationInfo(doc) {
              const title = doc.querySelector("main h1")?.textContent.trim() || "Application";

              const rows = [...doc.querySelectorAll("table tr")].map(tr => [
                tr.querySelector("th")?.textContent.trim(),
                tr.querySelector("td")
              ]);

              const get = label => rows.find(([th]) => th === label)?.[1];

              const candidate = get("Candidate Info")?.innerText.trim().replace(/\s+/g, " ") || "";

              const courses = [...(get("Courses Applied For")?.querySelectorAll("li") || [])]
                .map(li => escapeHtml(li.innerText.trim().replace(/\s+/g, " ")))
                .join("<br>");

              const questions = [...(get("Questions")?.querySelectorAll("p") || [])]
                .map(p => {
                  const text = p.innerText.trim().replace(/\s+/g, " ");
                  return escapeHtml(text.length > 400 ? text.slice(0, 400) + "..." : text);
                })
                .slice(0, 5)
                .join("<br><br>");

              const candidateText = get("Candidate Info")?.innerText.trim().replace(/\s+/g, " ") || "";
              const email = candidateText.match(/[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}/i)?.[0] || "";
              const labeledGtidCell = rows.find(([label]) =>
                /(?:gt\s*-?\s*id|student\s+id|georgia\s+tech\s+id)/i.test(label || "")
              )?.[1];
              const explicitGtid =
                doc.querySelector('[data-gtid]')?.dataset.gtid ||
                doc.querySelector('input[name*="gtid" i], input[id*="gtid" i]')?.value ||
                labeledGtidCell?.textContent ||
                "";
              const documentText = doc.body?.textContent?.replace(/\s+/g, " ") || "";
              const gtidPatterns = [
                /(?:GT\s*-?\s*ID|Georgia\s+Tech\s+ID|Student\s+ID)\s*[:#-]?\s*(\d{9})\b/i,
                /\b(9\d{8})\b/
              ];
              const gtidSources = [explicitGtid, candidateText, documentText];
              const gtid = explicitGtid.match(/\b(\d{9})\b/)?.[1] || gtidSources.reduce((found, source) => {
                if (found) return found;
                return gtidPatterns.reduce(
                  (match, pattern) => match || source.match(pattern)?.[1] || "",
                  ""
                );
              }, "");

              return { email, gtid, html: `
                <strong>${escapeHtml(title)}</strong><br>
                <em>${escapeHtml(candidate)}</em>
                <hr>
                <strong>Courses</strong><br>${courses || "None found"}
                <hr>
                <strong>Questions</strong><br>${questions || "None found"}
              ` };
            }

            async function applicationInfo(url) {
              if (!appCache.has(url)) {
                appCache.set(url, fetch(url, { credentials: "same-origin" })
                  .then(response => {
                    if (!response.ok) throw new Error(`Application request failed (${response.status})`);
                    return response.text();
                  })
                  .then(html => compactApplicationInfo(new DOMParser().parseFromString(html, "text/html")))
                  .catch(error => {
                    appCache.delete(url);
                    throw error;
                  }));
              }
              return appCache.get(url);
            }

            function visibleStudentDetails(info) {
              const parts = [];
              if (info.gtid) parts.push(`<span><strong>GTID:</strong> ${escapeHtml(info.gtid)}</span>`);
              if (info.email) parts.push(`<span><strong>Email:</strong> <a href="mailto:${encodeURIComponent(info.email)}">${escapeHtml(info.email)}</a></span>`);
              return parts.join("") || '<span>GTID and email unavailable</span>';
            }

            async function addVisibleStudentDetails() {
              const links = [...document.querySelectorAll("li.rankedItem a[href*='/instructor-admin/application/']")];

              async function loadDetails(a) {
                const li = a.closest("li.rankedItem");
                if (!li || li.dataset.taDetailsLoading || li.querySelector(".taStudentDetails")) return;
                li.dataset.taDetailsLoading = "true";

                const details = document.createElement("div");
                details.className = "taStudentDetails taStudentDetailsLoading";
                details.textContent = "Loading GTID and email…";
                (a.closest("p") || a).insertAdjacentElement("afterend", details);

                try {
                  const info = await applicationInfo(a.href);
                  details.classList.remove("taStudentDetailsLoading");
                  details.innerHTML = visibleStudentDetails(info);
                } catch {
                  details.textContent = "GTID and email unavailable";
                }
              }

              if (!("IntersectionObserver" in window)) {
                links.slice(0, 20).forEach(loadDetails);
                return;
              }

              const observer = new IntersectionObserver(entries => {
                entries.forEach(entry => {
                  if (!entry.isIntersecting) return;
                  observer.unobserve(entry.target);
                  const link = entry.target.querySelector(
                    "a[href*='/instructor-admin/application/']"
                  );
                  if (link) loadDetails(link);
                });
              }, { rootMargin: "500px 0px" });

              links.forEach(link => {
                const card = link.closest("li.rankedItem");
                if (card) {
                  observer.observe(card);
                  card.addEventListener("mouseenter", () => loadDetails(link), { once: true });
                  card.addEventListener("focusin", () => loadDetails(link), { once: true });
                }
              });
            }

            function addApplicationDialog() {
              const dialog = document.createElement("dialog");
              dialog.id = "taApplicationDialog";
              dialog.innerHTML = `
                <div class="taDialogHeading">
                  <strong>Candidate application</strong>
                  <button type="button" aria-label="Close application details">×</button>
                </div>
                <div id="taApplicationContent"></div>
              `;
              document.body.appendChild(dialog);
              dialog.querySelector("button").onclick = () => dialog.close();
              dialog.addEventListener("click", event => {
                if (event.target === dialog) dialog.close();
              });

              document.querySelectorAll("li.rankedItem a[href*='/instructor-admin/application/']").forEach(a => {
                if (a.dataset.taHoverAdded) return;
                a.dataset.taHoverAdded = "true";
                a.title = "Open candidate application details";

                a.addEventListener("click", async event => {
                  event.preventDefault();
                  const content = document.getElementById("taApplicationContent");
                  content.textContent = "Loading application…";
                  dialog.showModal();

                  try {
                    content.innerHTML = (await applicationInfo(a.href)).html;
                    const fullLink = document.createElement("a");
                    fullLink.className = "taFullApplicationLink";
                    fullLink.href = a.href;
                    fullLink.textContent = "Open full application in a new tab →";
                    fullLink.target = "_blank";
                    fullLink.rel = "noopener";
                    content.appendChild(fullLink);
                  } catch {
                    content.textContent = "Could not load application details.";
                  }
                });
              });
            }

            function addSaveBar() {
              const form = document.querySelector('form[name="instructor_management"]');
              const nativeSaves = [...(form?.querySelectorAll(
                'button[type="submit"], input[type="submit"]'
              ) || [])].filter(control =>
                /save\s+rankings/i.test(control.textContent || control.value || "")
              );
              const nativeSave = nativeSaves[0];
              if (!form || !nativeSave || document.getElementById("taSaveBar")) return;
              const backupKey = `gt-ta-ranking-backup:${location.pathname}`;

              function captureSnapshot() {
                return {
                  savedAt: new Date().toISOString(),
                  lists: Object.fromEntries(
                    Object.values(lists).filter(Boolean).map(list => [
                      list.id,
                      [...list.querySelectorAll(":scope > li.rankedItem")]
                        .map(item => item.id)
                        .filter(Boolean)
                    ])
                  )
                };
              }

              function readBackup() {
                try {
                  const backup = JSON.parse(localStorage.getItem(backupKey) || "null");
                  return backup?.lists ? backup : null;
                } catch {
                  return null;
                }
              }

              const baselineSnapshot = captureSnapshot();

              nativeSaves.forEach(control => {
                control.classList.add("taNativeSave");
                control.setAttribute("aria-hidden", "true");
                control.tabIndex = -1;
              });

              const bar = document.createElement("div");
              bar.id = "taSaveBar";
              bar.innerHTML = `
                <div>
                  <strong id="taChangeCount">Rankings saved</strong>
                  <small>Save after moving or sorting candidates.</small>
                </div>
                <button id="taRestoreRankings" type="button" hidden>
                  Restore previous save
                </button>
                <button id="taSaveRankings" type="button" disabled>Save rankings</button>
              `;
              document.body.appendChild(bar);

              const restoreButton = document.getElementById("taRestoreRankings");
              const existingBackup = readBackup();
              if (existingBackup) {
                restoreButton.hidden = false;
                restoreButton.title = `Previous save from ${new Date(existingBackup.savedAt).toLocaleString()}`;
              }

              document.getElementById("taSaveRankings").onclick = () => {
                localStorage.setItem(backupKey, JSON.stringify(baselineSnapshot));
                nativeSave.click();
              };

              restoreButton.onclick = () => {
                const backup = readBackup();
                if (!backup) return;
                if (!confirm(
                  "Restore the arrangement from before the previous save? " +
                  "Click Save Rankings afterward to commit the rollback."
                )) return;

                Object.entries(backup.lists).forEach(([listId, itemIds]) => {
                  const list = document.getElementById(listId);
                  if (!list) return;
                  itemIds.forEach(itemId => {
                    const item = document.getElementById(itemId);
                    if (item?.classList.contains("rankedItem")) list.appendChild(item);
                  });
                });

                refreshInlineButtons();
                updateSectionCounts();
                updateAllocationSummary();
                markRankingDirty();
                document.getElementById("taSearchBox")?.dispatchEvent(
                  new Event("input", { bubbles: true })
                );
                restoreButton.hidden = true;
              };
              form.addEventListener("submit", () => {
                rankingChangeCount = 0;
                bar.classList.remove("taHasChanges");
              });

              const observer = new MutationObserver(mutations => {
                if (mutations.some(mutation =>
                  mutation.type === "childList" &&
                  (mutation.addedNodes.length || mutation.removedNodes.length)
                )) {
                  markRankingDirty();
                }
              });
              Object.values(lists).filter(Boolean).forEach(list => {
                observer.observe(list, { childList: true });
              });
            }

            function makePanel(topLayout) {
              const panel = document.createElement("div");
              panel.id = "taPowerToolsPanel";

              panel.innerHTML = `
                <div class="taToolbarHeading">
                  <div>
                    <strong>Review candidates</strong>
                    <small>Search and filter across every status</small>
                  </div>
                  <div class="taToolbarActions">
                    <button id="taClearFilters" type="button">Clear filters</button>
                  </div>
                </div>

                <div class="taGlobalFilters">
                  <label>
                    <span>Search</span>
                    <input id="taSearchBox" type="search" placeholder="Name or GT account">
                  </label>
                  <label>
                    <span>Conflict</span>
                    <select id="taConflictFilter">
                      <option value="">All candidates</option>
                      <option value="with">With conflicts</option>
                      <option value="without">Without conflicts</option>
                    </select>
                  </label>
                  <label>
                    <span>Experience</span>
                    <select id="taExperienceFilter">
                      <option value="">All experience</option>
                      <option value="TABefore">TA before</option>
                      <option value="Passed">Passed course</option>
                      <option value="Enrolled">Currently enrolled</option>
                      <option value="AP">AP credit</option>
                    </select>
                  </label>
                  <label>
                    <span>Interest</span>
                    <select id="taInterestFilter">
                      <option value="">All interest levels</option>
                      <option value="Very">Very interested</option>
                      <option value="Somewhat">Somewhat interested</option>
                      <option value="Least">Least interested</option>
                    </select>
                  </label>
                  <label>
                    <span>Candidate type</span>
                    <select id="taCandidateTypeFilter">
                      <option value="">New and returning</option>
                      <option value="new">New TAs</option>
                      <option value="returning">Returning TAs</option>
                    </select>
                  </label>
                  <label>
                    <span>Sort each status</span>
                    <select id="taGlobalSort">
                      <option value="">Keep current order</option>
                      <option value="smart">Recommended review order</option>
                      <option value="last">Last name</option>
                      <option value="first">First name</option>
                      <option value="experience">Experience</option>
                      <option value="conflict">Conflicts last</option>
                    </select>
                  </label>
                  <button id="taApplySort" type="button">Apply sort</button>
                </div>
                <div id="taFilterSummary" role="status"></div>
                <div id="taSearchResults" aria-live="polite"></div>

                <details id="taAdvancedTools">
                  <summary>Advanced tools</summary>
                  <div class="taAdvancedGrid">
                    <section>
                      <label for="bulkTABox"><strong>Bulk add to Preferred</strong></label>
                      <textarea id="bulkTABox" placeholder="Names or GT usernames, separated by lines or commas"></textarea>
                      <button id="bulkAddBtn" type="button">Add matches to Preferred</button>
                    </section>
                    <section>
                      <strong>Maintenance and export</strong>
                      <button id="moveAcceptedConflictsBtn" type="button">Decline candidates accepted elsewhere</button>
                      <button id="exportAllSectionsBtn" type="button">Download rankings CSV</button>
                    </section>
                  </div>
                </details>
              `;

              if (topLayout?.left) topLayout.left.appendChild(panel);
              else document.querySelector("main.container")?.prepend(panel);

              const searchBox = document.getElementById("taSearchBox");
              const conflictFilter = document.getElementById("taConflictFilter");
              const experienceFilter = document.getElementById("taExperienceFilter");
              const interestFilter = document.getElementById("taInterestFilter");
              const candidateTypeFilter = document.getElementById("taCandidateTypeFilter");

              const statusNames = {
                headTAList: "Head TA",
                acceptedList: "Accepted",
                offeredList: "Offered",
                preferredList: "Preferred",
                pendingList: "Pending",
                unrankedList: "Unranked",
                declinedList: "Declined"
              };

              function renderTopSearchResults(matches, showResults) {
                const results = document.getElementById("taSearchResults");
                results.replaceChildren();
                if (!showResults) return;

                if (!matches.length) {
                  results.innerHTML = '<div class="taSearchEmpty">No candidates match these filters.</div>';
                  return;
                }

                matches.slice(0, 30).forEach(li => {
                  const row = document.createElement("article");
                  row.className = "taSearchResult";
                  const status = statusNames[li.parentElement.id] || "Unknown";
                  row.innerHTML = `
                    <div>
                      <strong>${escapeHtml(nameOf(li))}</strong>
                      <span class="taSearchGT">${escapeHtml(gtOf(li))}</span>
                      <small>
                        ${escapeHtml(status)} · ${isNewTA(li) ? "New TA" : "Returning TA"}
                        ${conflictOf(li) ? ` · <span class="taSearchConflict">Conflict</span>` : ''}
                      </small>
                    </div>
                  `;
                  const moveControl = document.createElement("label");
                  moveControl.className = "taSearchMove";
                  moveControl.append("Move to ", createMoveSelect(li, applyFilters));
                  row.appendChild(moveControl);
                  results.appendChild(row);
                });
              }

              function applyFilters() {
                const query = searchBox.value.toLowerCase().trim();
                let visible = 0;
                const matchedCandidates = [];
                allTAs().forEach(li => {
                  const conflict = Boolean(conflictOf(li));
                  const newCandidate = isNewTA(li);
                  const candidateMatches =
                    (!query || `${nameOf(li)} ${gtOf(li)}`.toLowerCase().includes(query)) &&
                    (!conflictFilter.value || (conflictFilter.value === "with" ? conflict : !conflict)) &&
                    (!experienceFilter.value || expOf(li) === experienceFilter.value) &&
                    (!interestFilter.value || interestOf(li) === interestFilter.value) &&
                    (!candidateTypeFilter.value ||
                      (candidateTypeFilter.value === "new" ? newCandidate : !newCandidate));
                  li.hidden = !candidateMatches;
                  if (candidateMatches) {
                    visible += 1;
                    matchedCandidates.push(li);
                  }
                });
                document.getElementById("taFilterSummary").textContent =
                  visible === allTAs().length
                    ? `${visible} candidates`
                    : `Showing ${visible} of ${allTAs().length} candidates`;
                renderTopSearchResults(
                  matchedCandidates,
                  Boolean(
                    query || conflictFilter.value || experienceFilter.value ||
                    interestFilter.value || candidateTypeFilter.value
                  )
                );
              }

              [searchBox, conflictFilter, experienceFilter, interestFilter, candidateTypeFilter]
                .forEach(control => control.addEventListener("input", applyFilters));

              document.getElementById("taClearFilters").onclick = () => {
                [searchBox, conflictFilter, experienceFilter, interestFilter, candidateTypeFilter]
                  .forEach(control => { control.value = ""; });
                applyFilters();
                searchBox.focus();
              };

              document.getElementById("taApplySort").onclick = () => {
                const value = document.getElementById("taGlobalSort").value;
                if (!value) return;
                [lists.headTAList, lists.preferredList, lists.pendingList,
                  lists.unrankedList, lists.declinedList].filter(Boolean).forEach(list => {
                  if (value === "smart") smartSort(list);
                  else sortList(list, {
                    last: lastNameKey,
                    first: firstNameKey,
                    experience: experienceKey,
                    conflict: conflictKey
                  }[value]);
                });
                applyFilters();
              };

              document.getElementById("bulkAddBtn").onclick = () => {
                const terms = document.getElementById("bulkTABox").value
                  .split(/\n|,/)
                  .map(x => x.trim().toLowerCase())
                  .filter(Boolean);

                let moved = 0;
                const missing = [];

                terms.forEach(term => {
                  const li = allTAs().find(x =>
                    gtOf(x).toLowerCase() === term ||
                    nameOf(x).toLowerCase().includes(term)
                  );

                  if (li) {
                    moveTo(li, lists.preferredList);
                    moved++;
                  } else {
                    missing.push(term);
                  }
                });

                alert(`Moved ${moved} TA(s).` + (missing.length ? `\nMissing: ${missing.join(", ")}` : ""));
                applyFilters();
              };

              document.getElementById("moveAcceptedConflictsBtn").onclick = () => {
                const matches = allTAs().filter(li =>
                  li.parentElement.id !== "declinedList" &&
                  conflictOf(li).includes("Accepted#")
                );

                if (!matches.length) return alert("No accepted conflicts found.");
                if (!confirm(`Move ${matches.length} accepted-conflict TA(s) to Declined?`)) return;

                matches.forEach(li => moveTo(li, lists.declinedList));
                alert(`Moved ${matches.length} TA(s).`);
                applyFilters();
              };

              document.getElementById("exportAllSectionsBtn").onclick = () => {
                const exportLists = [
                  ["Head TA", lists.headTAList],
                  ["Accepted", lists.acceptedList],
                  ["Offered", lists.offeredList],
                  ["Preferred", lists.preferredList],
                  ["Pending", lists.pendingList],
                  ["Unranked", lists.unrankedList],
                  ["Declined", lists.declinedList]
                ];

                const rows = [["Section", "Rank", "Name", "GT Account", "Experience", "Interest", "Level", "USG", "New TA", "Conflict"]];

                exportLists.forEach(([section, list]) => {
                  if (!list) return;

                  [...list.querySelectorAll("li.rankedItem")].forEach((li, i) => {
                    rows.push([
                      section,
                      i + 1,
                      nameOf(li),
                      gtOf(li),
                      expOf(li),
                      interestOf(li),
                      levelOf(li),
                      employmentOf(li),
                      isNewTA(li) ? "Yes" : "No",
                      conflictOf(li)
                    ]);
                  });
                });

                const csv = rows.map(row =>
                  row.map(cell => `"${String(cell).replaceAll('"', '""')}"`).join(",")
                ).join("\n");

                const blob = new Blob([csv], { type: "text/csv;charset=utf-8;" });
                const url = URL.createObjectURL(blob);

                const a = document.createElement("a");
                a.href = url;
                a.download = "ta_rankings_all_sections.csv";
                a.click();

                URL.revokeObjectURL(url);
              };

              const instructorBox = document.getElementById("taInstructorBox");
              if (instructorBox) {
                instructorBox.classList.add("taAdvancedInstructors");
                document.querySelector("#taAdvancedTools .taAdvancedGrid")
                  ?.appendChild(instructorBox);
              }

              applyFilters();
            }

            injectModernCSS();
            injectWorkflowCSS();

            const topLayout = makeTopLayout();
            moveInstructorsToRight(topLayout);

            addSectionButtons();
            addInlineButtons();
            addApplicationDialog();
            addVisibleStudentDetails();
            makePanel(topLayout);
            addSaveBar();
            updateAllocationSummary();
          }

          function start() {
            setTimeout(init, 100);
          }

          if (document.readyState === "complete") start();
          else window.addEventListener("load", start, { once: true });
        })();
        }
    });
})(window.GTTAHiringToolkit);

window.GTTAHiringToolkit.start();
