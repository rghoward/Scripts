// ==UserScript==
// @name         GT TA Hiring Page Enhancer
// @namespace    https://gatech.edu/
// @version      1.1.0
// @description  Adds fast user search, recent selections, keyboard controls, and improved styling.
// @match        https://ta-app.cc.gatech.edu/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

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
            :root {
                --tm-bg: #ffffff;
                --tm-surface: #ffffff;
                --tm-surface-alt: #f5f6f7;
                --tm-text: #222222;
                --tm-muted: #667085;
                --tm-border: #d0d5dd;
                --tm-accent: #b3a369;
                --tm-accent-dark: #857437;
                --tm-focus: #1769aa;
                --tm-danger: #b42318;
                --tm-success: #18794e;
                --tm-shadow: 0 8px 24px rgba(0, 0, 0, 0.12);
            }

            body.tm-dark {
                --tm-bg: #171717;
                --tm-surface: #232323;
                --tm-surface-alt: #303030;
                --tm-text: #f5f5f5;
                --tm-muted: #b9b9b9;
                --tm-border: #555555;
                --tm-accent: #d6c57f;
                --tm-accent-dark: #f0df9b;
                --tm-focus: #80bfff;
                --tm-shadow: 0 8px 24px rgba(0, 0, 0, 0.4);
            }

            body.tm-enhanced-page {
                background: var(--tm-bg);
                color: var(--tm-text);
                padding-bottom: 90px;
            }

            .tm-page-title {
                margin: 30px 0 18px;
                font-weight: 700;
            }

            .tm-enhanced-form {
                max-width: 950px;
            }

            .tm-panel {
                margin: 12px 0 24px;
                padding: 22px;
                border: 1px solid var(--tm-border);
                border-radius: 12px;
                background: var(--tm-surface);
                box-shadow: var(--tm-shadow);
                color: var(--tm-text);
            }

            .tm-panel-header {
                display: flex;
                align-items: flex-start;
                justify-content: space-between;
                gap: 15px;
                margin-bottom: 16px;
            }

            .tm-panel-header h2 {
                margin: 0;
                font-size: 1.4rem;
                color: var(--tm-text);
            }

            .tm-subtitle {
                margin-top: 4px;
                color: var(--tm-muted);
            }

            .tm-search-row {
                display: flex;
                gap: 10px;
            }

            #tm-user-search {
                width: 100%;
                min-height: 48px;
                padding: 10px 14px;
                border: 2px solid var(--tm-border);
                border-radius: 8px;
                background: var(--tm-surface);
                color: var(--tm-text);
                font-size: 1.05rem;
            }

            #tm-user-search:focus {
                border-color: var(--tm-focus);
                outline: 3px solid color-mix(in srgb, var(--tm-focus) 20%, transparent);
            }

            .tm-secondary-button,
            .tm-icon-button {
                border: 1px solid var(--tm-border);
                border-radius: 8px;
                background: var(--tm-surface-alt);
                color: var(--tm-text);
                cursor: pointer;
            }

            .tm-secondary-button {
                padding: 8px 16px;
            }

            .tm-icon-button {
                width: 40px;
                height: 40px;
                font-size: 1.3rem;
            }

            .tm-shortcuts {
                display: flex;
                flex-wrap: wrap;
                gap: 14px;
                margin: 10px 0;
                color: var(--tm-muted);
                font-size: 0.86rem;
            }

            kbd {
                margin-right: 3px;
                padding: 2px 6px;
                border: 1px solid var(--tm-border);
                border-radius: 4px;
                background: var(--tm-surface-alt);
                color: var(--tm-text);
                box-shadow: 0 1px 1px rgba(0,0,0,.12);
            }

            .tm-selected-user {
                margin: 14px 0;
                padding: 11px 13px;
                border-left: 4px solid var(--tm-border);
                border-radius: 5px;
                background: var(--tm-surface-alt);
                color: var(--tm-muted);
                font-weight: 500;
            }

            .tm-selected-user.tm-has-selection {
                border-left-color: var(--tm-success);
                color: var(--tm-text);
            }

            .tm-chip-section {
                display: flex;
                flex-wrap: wrap;
                align-items: center;
                gap: 7px;
                margin: 10px 0;
            }

            .tm-chip-label {
                color: var(--tm-muted);
                font-weight: 600;
            }

            .tm-chip {
                display: inline-flex;
                overflow: hidden;
                border: 1px solid var(--tm-border);
                border-radius: 999px;
                background: var(--tm-surface-alt);
            }

            .tm-chip button {
                border: 0;
                background: transparent;
                color: var(--tm-text);
                cursor: pointer;
                padding: 5px 10px;
            }

            .tm-chip .tm-chip-remove {
                padding-left: 4px;
                color: var(--tm-muted);
                font-size: 1.1rem;
            }

            .tm-results-header {
                display: flex;
                justify-content: space-between;
                margin-top: 18px;
                padding-bottom: 7px;
                color: var(--tm-muted);
                font-weight: 600;
            }

            .tm-results {
                max-height: 390px;
                overflow-y: auto;
                border: 1px solid var(--tm-border);
                border-radius: 8px;
                background: var(--tm-surface);
            }

            .tm-result-row {
                display: flex;
                align-items: stretch;
                border-bottom: 1px solid var(--tm-border);
            }

            .tm-result-row:last-child {
                border-bottom: 0;
            }

            .tm-result-row:hover,
            .tm-result-row.tm-active {
                background: var(--tm-surface-alt);
            }

            .tm-result-row.tm-active {
                box-shadow: inset 4px 0 var(--tm-accent);
            }

            .tm-result-button {
                flex: 1;
                padding: 11px 13px;
                border: 0;
                background: transparent;
                color: var(--tm-text);
                text-align: left;
                cursor: pointer;
            }

            .tm-favorite-button {
                width: 48px;
                border: 0;
                border-left: 1px solid var(--tm-border);
                background: transparent;
                color: var(--tm-accent-dark);
                cursor: pointer;
                font-size: 1.3rem;
            }

            mark {
                padding: 0;
                background: #fff0a8;
                color: #111111;
                font-weight: 700;
            }

            .tm-empty {
                padding: 28px;
                color: var(--tm-muted);
                text-align: center;
            }

            .tm-hidden-select {
                position: absolute !important;
                width: 1px !important;
                height: 1px !important;
                overflow: hidden !important;
                opacity: 0 !important;
                pointer-events: none !important;
            }

            .tm-form-control {
                max-width: 100%;
                min-height: 42px;
                padding: 8px 10px;
                border: 1px solid var(--tm-border);
                border-radius: 6px;
            }

            .tm-save-button {
                padding: 10px 22px !important;
                border: 0 !important;
                border-radius: 7px !important;
                background: var(--tm-accent) !important;
                color: #111111 !important;
                font-weight: 700 !important;
                cursor: pointer !important;
            }

            .tm-save-button:hover {
                filter: brightness(0.95);
            }

            .tm-sticky-save {
                position: fixed;
                right: 0;
                bottom: 0;
                left: 0;
                z-index: 10000;
                display: flex;
                align-items: center;
                justify-content: space-between;
                gap: 20px;
                padding: 12px max(20px, calc((100vw - 1140px) / 2));
                border-top: 1px solid var(--tm-border);
                background: var(--tm-surface);
                color: var(--tm-text);
                box-shadow: 0 -4px 18px rgba(0, 0, 0, 0.13);
            }

            .tm-notice {
                position: fixed;
                top: 20px;
                right: 20px;
                z-index: 20000;
                max-width: 400px;
                padding: 12px 18px;
                border-radius: 7px;
                background: var(--tm-success);
                color: white;
                box-shadow: var(--tm-shadow);
                opacity: 1;
                transition: opacity 0.3s, transform 0.3s;
            }

            .tm-notice-error {
                background: var(--tm-danger);
            }

            .tm-notice-hide {
                opacity: 0;
                transform: translateY(-10px);
                pointer-events: none;
            }

            @media (max-width: 700px) {
                .tm-panel {
                    padding: 14px;
                }

                .tm-search-row {
                    flex-direction: column;
                }

                .tm-sticky-save {
                    padding: 10px 14px;
                }

                .tm-shortcuts {
                    display: none;
                }
            }
        `;

        document.head.appendChild(style);
    }
})();
