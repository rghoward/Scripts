// ==UserScript==
// @name         GT TA Hiring - Manager User Form
// @namespace    https://gatech.edu/
// @version      1.0.0
// @description  Cleans up manager create and edit user forms without changing native submission behavior.
// @match        https://ta-app.cc.gatech.edu/admin/user/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

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
            #tm-user-form-page { max-width: 960px; margin: 25px auto 70px; color: var(--tm-text); }
            .tm-user-form-hero { display: flex; align-items: center; justify-content: space-between; gap: 22px; padding: 26px 28px; border-radius: 14px 14px 0 0; background: linear-gradient(125deg,#003057,#074d78); color: white; }
            .tm-user-form-hero > div:first-child > span { color: #d6c57f; font-size: .72rem; font-weight: 800; letter-spacing: .08em; text-transform: uppercase; }
            .tm-user-form-hero h1 { margin: 3px 0 5px; color: white; font-size: 2rem; }
            .tm-user-form-hero p { margin: 0; color: #dce8f1; }
            .tm-user-form-nav { display: flex; gap: 8px; }
            .tm-user-form-nav a, .tm-user-form-nav a:is(:link,:visited,:hover,:active) { display: inline-flex; align-items: center; gap: 7px; min-height: 42px; box-sizing: border-box; padding: 9px 13px; border: 1px solid #b9cad7; border-radius: 7px; background: rgba(255,255,255,.1); color: white !important; font-size: .85rem; font-weight: 800; text-decoration: none !important; }
            .tm-user-form-nav a:hover { border-color: white; background: rgba(255,255,255,.18); }
            .tm-user-form-nav a span { color: #d6c57f; }
            .tm-user-form-guidance { padding: 11px 16px; border: 1px solid #d8cfaa; border-top: 0; background: #fffbee; color: #554b25; font-size: .84rem; }
            #tm-user-form-page form { margin: 17px 0 0; }
            .tm-user-form-card { display: none; }
            #tm-user-form-page form { overflow: hidden; border: 1px solid var(--tm-border); border-radius: 12px; background: var(--tm-surface); box-shadow: var(--tm-shadow); }
            .tm-user-form-section { padding: 23px 25px; }
            .tm-user-form-section + .tm-user-form-section { border-top: 1px solid var(--tm-border); }
            .tm-user-form-section-heading { display: flex; align-items: flex-start; gap: 11px; margin-bottom: 18px; }
            .tm-user-form-section-heading > span { display: grid; place-items: center; width: 30px; height: 30px; flex: 0 0 auto; border-radius: 50%; background: #003057; color: white; font-weight: 900; }
            .tm-user-form-section-heading h2 { margin: 0 0 2px; font-size: 1.18rem; }
            .tm-user-form-section-heading p { margin: 0; color: var(--tm-muted); font-size: .84rem; }
            .tm-user-form-grid { display: grid; grid-template-columns: repeat(2,minmax(0,1fr)); gap: 16px; }
            .tm-user-form-grid > div, #tm-user-access-field > div { min-width: 0; }
            #tm-user-form-page form label { position: static !important; display: block !important; width: auto !important; height: auto !important; margin: 0 0 6px !important; padding: 0 !important; transform: none !important; color: #344054; font-size: .82rem; font-weight: 800; line-height: 1.3 !important; }
            #tm-user-form-page form :is(input,select) { box-sizing: border-box !important; width: 100% !important; min-height: 45px !important; margin: 0 !important; padding: 9px 10px !important; border: 1px solid #aeb4bb; border-radius: 6px; background: white; }
            #tm-user-form-page form .help-text { margin: 5px 0 0; color: var(--tm-muted); font-size: .76rem; }
            #tm-user-access-field { max-width: 420px; }
            .tm-access-preview { display: flex; flex-direction: column; gap: 2px; margin-top: 12px; padding: 10px 12px; border-radius: 7px; font-size: .8rem; }
            .tm-access-active { border: 1px solid #a9d7bd; background: #effaf3; color: #17653f; }
            .tm-access-inactive { border: 1px solid #e3c77a; background: #fff9e6; color: #735c17; }
            .tm-user-form-footer { display: flex; align-items: center; justify-content: flex-end; gap: 10px; padding: 15px 25px; border-top: 1px solid var(--tm-border); background: #f6f7f8; }
            .tm-user-form-footer > a { padding: 9px 13px; color: #475569; font-weight: 700; }
            .tm-user-form-submit { min-height: 43px; margin: 0 !important; padding: 9px 17px !important; border: 1px solid #857437 !important; border-radius: 7px !important; background: #b3a369 !important; color: #20262a !important; font-weight: 900 !important; }
            @media (max-width: 700px) { .tm-user-form-hero { align-items: flex-start; flex-direction: column; } .tm-user-form-nav { flex-wrap: wrap; } .tm-user-form-grid { grid-template-columns: 1fr; } }
        `;
        document.head.appendChild(style);
    }
})();
