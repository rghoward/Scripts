// ==UserScript==
// @name         GT TA Hiring - Instructor Home
// @namespace    https://gatech.edu/
// @version      1.0.0
// @description  Turns the authenticated home page into an instructor workspace and readable guide.
// @match        https://ta-app.cc.gatech.edu/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

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
        body.gt-ta-instructor-home {
            background: #f5f7f9;
            color: #26313a;
        }

        body.gt-ta-instructor-home main.container {
            width: min(1180px, calc(100% - 32px));
            max-width: none;
            padding-block: 34px 60px;
        }

        #tm-instructor-home {
            display: grid;
            gap: 20px;
        }

        .tm-home-hero {
            display: flex;
            align-items: center;
            justify-content: space-between;
            gap: 30px;
            padding: clamp(26px, 4vw, 42px);
            border-top: 5px solid #b3a369;
            border-radius: 14px;
            background: linear-gradient(135deg, #003057, #074a75);
            color: #fff;
            box-shadow: 0 16px 38px rgba(0, 48, 87, .18);
        }

        .tm-home-eyebrow {
            margin: 0 0 7px;
            color: #e4d58e;
            font-size: 12px;
            font-weight: 800;
            letter-spacing: .12em;
            text-transform: uppercase;
        }

        .tm-home-hero h1 {
            margin: 0;
            color: #fff;
            font-family: "Roboto Slab", Georgia, serif;
            font-size: clamp(30px, 4vw, 44px);
            line-height: 1.15;
        }

        .tm-home-intro {
            max-width: 590px;
            margin: 12px 0 0;
            color: #e8eef2;
            font-size: 17px;
            line-height: 1.55;
        }

        .tm-home-actions {
            display: flex;
            flex: 0 0 auto;
            flex-direction: column;
            gap: 9px;
            min-width: 205px;
        }

        .tm-home-actions a {
            display: inline-flex;
            align-items: center;
            justify-content: center;
            gap: 10px;
            min-height: 46px;
            padding: 0 18px;
            border-radius: 7px;
            font-weight: 700;
            text-decoration: none !important;
        }

        .tm-home-primary {
            border: 2px solid #d6c57f;
            background: #d6c57f;
            color: #17242d !important;
        }

        .tm-home-secondary {
            border: 1px solid rgba(255, 255, 255, .55);
            color: #fff !important;
        }

        .tm-home-actions a:hover { filter: brightness(1.06); }
        .tm-home-actions a:focus-visible {
            outline: 3px solid #fff;
            outline-offset: 3px;
        }

        .tm-home-overview {
            display: grid;
            grid-template-columns: repeat(3, 1fr);
            gap: 14px;
        }

        .tm-home-overview article {
            display: grid;
            grid-template-columns: 38px 1fr;
            column-gap: 12px;
            padding: 18px;
            border: 1px solid #d9dfe4;
            border-radius: 10px;
            background: #fff;
            box-shadow: 0 3px 10px rgba(20, 35, 45, .05);
        }

        .tm-home-overview article > span {
            display: grid;
            grid-row: span 2;
            place-items: center;
            width: 36px;
            height: 36px;
            border-radius: 50%;
            background: #e8eef3;
            color: #003057;
            font-weight: 800;
        }

        .tm-home-overview strong { color: #26313a; font-size: 15px; }
        .tm-home-overview small { margin-top: 3px; color: #68757f; line-height: 1.4; }

        .tm-home-guide {
            overflow: hidden;
            border: 1px solid #d4dbe0;
            border-radius: 12px;
            background: #fff;
            box-shadow: 0 5px 16px rgba(20, 35, 45, .06);
        }

        .tm-home-guide > summary {
            display: flex;
            align-items: center;
            justify-content: space-between;
            padding: 20px 24px;
            cursor: pointer;
            list-style: none;
        }

        .tm-home-guide > summary::-webkit-details-marker { display: none; }
        .tm-home-guide > summary strong { display: block; color: #003057; font-size: 19px; }
        .tm-home-guide > summary small { display: block; margin-top: 3px; color: #6b7780; }
        .tm-guide-toggle::before { content: 'Show'; color: #52616b; font-weight: 700; }
        .tm-home-guide[open] .tm-guide-toggle::before { content: 'Hide'; }

        .tm-guide-content {
            padding: 4px 24px 28px;
            counter-reset: guide-step;
        }

        .tm-guide-step {
            position: relative;
            margin: 0;
            padding: 20px 20px 20px 64px;
            border-top: 1px solid #e3e7ea;
            color: #38454e;
            font-size: 15px;
            line-height: 1.65;
            counter-increment: guide-step;
        }

        .tm-guide-step::before {
            content: counter(guide-step);
            position: absolute;
            top: 18px;
            left: 12px;
            display: grid;
            place-items: center;
            width: 32px;
            height: 32px;
            border-radius: 50%;
            background: #003057;
            color: #fff;
            font-weight: 800;
        }

        .tm-guide-step img {
            display: block;
            width: auto;
            max-width: min(100%, 900px);
            max-height: 520px;
            margin: 16px auto 2px;
            border: 1px solid #d5dce1;
            border-radius: 8px;
            box-shadow: 0 5px 16px rgba(20, 35, 45, .09);
        }

        .tm-guide-step strong[style*="red"] {
            display: inline-block;
            margin-block: 7px;
            padding: 5px 8px;
            border-left: 4px solid #b42318;
            background: #fff1f0;
            color: #8e1b13 !important;
        }

        .tm-home-version {
            justify-self: end;
            color: #7b858c;
            font-size: 11px;
        }

        @media (max-width: 760px) {
            .tm-home-hero { align-items: stretch; flex-direction: column; }
            .tm-home-actions { min-width: 0; }
            .tm-home-overview { grid-template-columns: 1fr; }
            .tm-guide-content { padding-inline: 14px; }
            .tm-guide-step { padding-left: 52px; }
            .tm-guide-step::before { left: 6px; }
        }
    `;
    document.head.appendChild(style);
})();
