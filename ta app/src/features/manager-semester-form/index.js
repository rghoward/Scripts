// ==UserScript==
// @name         GT TA Hiring - Manager Semester Form
// @namespace    https://gatech.edu/
// @version      1.0.0
// @description  Organizes semester identity, dates, application windows, and native section controls.
// @match        https://ta-app.cc.gatech.edu/admin/semester/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

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
            #tm-semester-form-page { max-width: 1050px; margin: 25px auto 70px; color: var(--tm-text); }
            .tm-semester-form-hero { display: flex; align-items: center; justify-content: space-between; gap: 22px; padding: 26px 28px; border-radius: 14px 14px 0 0; background: linear-gradient(125deg,#003057,#074d78); color: white; }
            .tm-semester-form-hero > div:first-child > span { color: #d6c57f; font-size: .72rem; font-weight: 800; letter-spacing: .08em; text-transform: uppercase; }
            .tm-semester-form-hero h1 { margin: 3px 0 5px; color: white; font-size: 2rem; }
            .tm-semester-form-hero p { margin: 0; color: #dce8f1; }
            .tm-semester-form-nav { display: flex; gap: 8px; }
            .tm-semester-form-nav a, .tm-semester-form-nav a:is(:link,:visited,:hover,:active) { display: inline-flex; align-items: center; gap: 7px; min-height: 42px; box-sizing: border-box; padding: 9px 13px; border: 1px solid #b9cad7; border-radius: 7px; background: rgba(255,255,255,.1); color: white !important; font-size: .85rem; font-weight: 800; text-decoration: none !important; }
            .tm-semester-form-nav a:hover { border-color: white; background: rgba(255,255,255,.18); }
            .tm-semester-form-nav a span { color: #d6c57f; }
            .tm-semester-form-guidance { padding: 11px 16px; border: 1px solid #d8cfaa; border-top: 0; background: #fffbee; color: #554b25; font-size: .84rem; }
            .tm-semester-native-form { overflow: hidden; margin: 17px 0 0; border: 1px solid var(--tm-border); border-radius: 12px; background: var(--tm-surface); box-shadow: var(--tm-shadow); }
            .tm-semester-form-section { padding: 23px 25px; }
            .tm-semester-form-section + .tm-semester-form-section { border-top: 1px solid var(--tm-border); }
            .tm-semester-section-heading { display: flex; align-items: flex-start; gap: 11px; margin-bottom: 18px; }
            .tm-semester-section-heading > span { display: grid; place-items: center; width: 30px; height: 30px; flex: 0 0 auto; border-radius: 50%; background: #003057; color: white; font-weight: 900; }
            .tm-semester-section-heading h2 { margin: 0 0 2px; font-size: 1.18rem; }
            .tm-semester-section-heading p { margin: 0; color: var(--tm-muted); font-size: .84rem; }
            .tm-semester-identity-fields { display: grid; grid-template-columns: repeat(2,minmax(0,1fr)); gap: 16px; max-width: 650px; }
            #tm-semester-form-page form label { position: static !important; display: block !important; width: auto !important; height: auto !important; margin: 0 0 6px !important; padding: 0 !important; transform: none !important; color: #344054; font-size: .8rem; font-weight: 800; line-height: 1.3 !important; }
            #tm-semester-form-page form :is(input,select) { box-sizing: border-box !important; min-height: 42px !important; margin: 0 !important; border: 1px solid #aeb4bb; border-radius: 6px; background: white; }
            .tm-semester-identity-fields :is(input,select) { width: 100% !important; }
            #tm-semester-form-page .help-text { margin: 5px 0 0; color: var(--tm-muted); font-size: .75rem; }
            #tm-semester-date-table { overflow-x: auto; }
            #tm-semester-date-table table { width: 100%; margin: 0; border-collapse: separate; border-spacing: 0; border: 1px solid var(--tm-border); border-radius: 8px; }
            #tm-semester-date-table th { padding: 10px 12px; background: #f1f3f5; color: #344054; text-align: left; }
            #tm-semester-date-table tr:first-child th { background: #31363b; color: white; }
            #tm-semester-date-table td { padding: 13px 12px; border-top: 1px solid var(--tm-border); vertical-align: top; }
            #tm-semester-date-table td > div { display: grid; grid-template-columns: 1.2fr .8fr 1fr; gap: 6px; }
            #tm-semester-date-table td select { width: 100% !important; min-width: 70px; }
            #tm-semester-date-status { display: flex; flex-direction: column; gap: 2px; margin-top: 11px; padding: 9px 12px; border-radius: 7px; font-size: .79rem; }
            .tm-date-valid { border: 1px solid #a9d7bd; background: #effaf3; color: #17653f; }
            .tm-date-problem { border: 1px solid #e2a8a3; background: #fff2f1; color: #8a2018; }
            .tm-semester-sections-notice { margin: 0; padding: 13px 25px; border-top: 1px solid var(--tm-border); background: #f3f7fa; color: #475569; font-size: .84rem; }
            .tm-semester-sections-area { padding: 18px 25px; border-top: 1px solid var(--tm-border); }
            .tm-semester-form-footer { display: flex; align-items: center; justify-content: flex-end; gap: 10px; padding: 15px 25px; border-top: 1px solid var(--tm-border); background: #f6f7f8; }
            .tm-semester-form-footer > a { padding: 9px 13px; color: #475569; font-weight: 700; }
            .tm-semester-form-submit { min-height: 43px; margin: 0 !important; padding: 9px 17px !important; border: 1px solid #857437 !important; border-radius: 7px !important; background: #b3a369 !important; color: #20262a !important; font-weight: 900 !important; }
            @media (max-width: 740px) { .tm-semester-form-hero { align-items: flex-start; flex-direction: column; } .tm-semester-form-nav { flex-wrap: wrap; } .tm-semester-identity-fields { grid-template-columns: 1fr; } #tm-semester-date-table table, #tm-semester-date-table tbody, #tm-semester-date-table tr, #tm-semester-date-table th, #tm-semester-date-table td { display: block; width: 100%; box-sizing: border-box; } #tm-semester-date-table tr:first-child { display: none; } }
        `;
        document.head.appendChild(style);
    }
})();
