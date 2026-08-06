// ==UserScript==
// @name         GT TA Hiring - Landing Page
// @namespace    https://gatech.edu/
// @version      1.0.0
// @description  Gives the TA Hiring landing page a focused welcome and application card.
// @match        https://ta-app.cc.gatech.edu/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

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
        body.gt-ta-landing-page main.container {
            display: grid;
            place-items: center;
            min-height: clamp(430px, 58vh, 680px);
            padding-block: 52px;
        }

        #tm-landing-card {
            width: min(100%, 620px);
            box-sizing: border-box;
            padding: clamp(30px, 5vw, 52px);
            border: 1px solid #d7d0b8;
            border-top: 5px solid #b3a369;
            border-radius: 14px;
            background: #fff;
            color: #262626;
            box-shadow: 0 18px 50px rgba(0, 48, 87, .12);
            text-align: center;
        }

        .tm-landing-mark {
            display: grid;
            place-items: center;
            width: 58px;
            height: 58px;
            margin: 0 auto 20px;
            border-radius: 14px;
            background: #003057;
            color: #fff;
            font: 700 20px/1 Roboto, sans-serif;
            letter-spacing: .04em;
            box-shadow: inset 0 -4px 0 #b3a369;
        }

        .tm-landing-eyebrow {
            margin: 0 0 8px;
            color: #6f622b;
            font-size: 12px;
            font-weight: 700;
            letter-spacing: .1em;
            text-transform: uppercase;
        }

        #tm-landing-title {
            margin: 0;
            color: #003057;
            font-family: "Roboto Slab", Georgia, serif;
            font-size: clamp(28px, 5vw, 42px);
            line-height: 1.15;
        }

        .tm-landing-copy {
            max-width: 450px;
            margin: 16px auto 26px;
            color: #56616a;
            font-size: 17px;
            line-height: 1.6;
        }

        .tm-landing-action {
            display: inline-flex;
            align-items: center;
            justify-content: center;
            gap: 12px;
            min-height: 48px;
            padding: 0 22px;
            border: 2px solid #003057;
            border-radius: 8px;
            background: #003057;
            color: #fff !important;
            font-size: 16px;
            font-weight: 700;
            text-decoration: none !important;
            transition: background .15s, box-shadow .15s, transform .15s;
        }

        .tm-landing-action:hover,
        .tm-landing-action:focus-visible {
            background: #004f87;
            box-shadow: 0 7px 18px rgba(0, 48, 87, .22);
            transform: translateY(-1px);
        }

        .tm-landing-action:focus-visible {
            outline: 3px solid rgba(179, 163, 105, .55);
            outline-offset: 3px;
        }

        .tm-landing-version {
            display: block;
            margin-top: 18px;
            color: #7a838a;
            font-size: 11px;
        }

        .tm-landing-secondary {
            display: block;
            width: fit-content;
            margin: 16px auto 0;
            color: #56616a !important;
            font-size: 13px;
            text-underline-offset: 3px;
        }

        @media (max-width: 600px) {
            body.gt-ta-landing-page main.container {
                min-height: 0;
                padding-block: 28px;
            }

            #tm-landing-card {
                padding: 30px 22px;
                border-radius: 10px;
            }
        }
    `;
    document.head.appendChild(style);
})();
