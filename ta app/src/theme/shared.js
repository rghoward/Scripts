    toolkit.register({
        id: 'shared-theme',
        name: 'Shared Theme',
        init() {
            if (document.getElementById('gt-ta-toolkit-theme')) return;

            const style = document.createElement('style');
            style.id = 'gt-ta-toolkit-theme';
            style.textContent = `
                :root {
                    --tm-bg: #f6f8fb;
                    --tm-surface: #ffffff;
                    --tm-surface-alt: #f5f6f7;
                    --tm-text: #222222;
                    --tm-muted: #667085;
                    --tm-border: #d0d5dd;
                    --tm-accent: #b3a369;
                    --tm-accent-dark: #857437;
                    --tm-navy: #003057;
                    --tm-focus: #1769aa;
                    --tm-danger: #b42318;
                    --tm-success: #18794e;
                    --tm-radius: 12px;
                    --tm-shadow: 0 5px 18px rgba(0, 0, 0, .08);
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
                    --tm-shadow: 0 8px 24px rgba(0, 0, 0, .4);
                }

                body.gt-ta-toolkit-page {
                    min-height: 100vh;
                    margin: 0;
                    background: var(--tm-bg);
                    color: var(--tm-text);
                    font-family: Inter, -apple-system, BlinkMacSystemFont, "Segoe UI", sans-serif;
                }

                body.gt-ta-toolkit-page > .container,
                body.gt-ta-toolkit-page main.container {
                    width: min(1460px, calc(100% - 40px));
                    margin-inline: auto;
                }

                body.gt-ta-toolkit-page main { padding-bottom: 60px; }

                @media (max-width: 760px) {
                    body.gt-ta-toolkit-page > .container,
                    body.gt-ta-toolkit-page main.container {
                        width: min(100% - 24px, 1460px);
                    }

                }

                #tm-user-search,
                #tm-course-dashboard,
                #tm-instructor-dashboard,
                #taPowerToolsPanel { color: var(--tm-text); }

                .tm-dashboard-header,
                .tm-panel,
                #taPowerToolsPanel {
                    border-color: var(--tm-border) !important;
                    border-radius: var(--tm-radius) !important;
                    background: var(--tm-surface) !important;
                    box-shadow: var(--tm-shadow) !important;
                }

                .tm-dashboard-header {
                    display: flex;
                    align-items: center;
                    justify-content: space-between;
                    gap: 18px;
                    margin-bottom: 15px;
                    padding: 20px;
                }

                .tm-dashboard-header h2 { margin: 0 0 5px; }
                .tm-dashboard-header p { margin: 0; color: var(--tm-muted); }

                .tm-view-tabs { display: flex; gap: 0; }
                .tm-view-tabs button {
                    display: inline-flex;
                    align-items: center;
                    gap: 7px;
                    padding: 11px 18px;
                    border: 1px solid #aaa;
                    background: #f2f2f2;
                    cursor: pointer;
                    font-weight: 700;
                }
                .tm-view-tabs button + button { margin-left: -1px; }
                .tm-view-tabs button:first-child { border-radius: 8px 0 0; }
                .tm-view-tabs button:last-child { border-radius: 0 8px 0 0; }
                .tm-view-tabs :is(.tm-active, .tm-active-tab) {
                    background: #333;
                    color: white;
                }

                .tm-toolbar {
                    position: sticky;
                    top: 0;
                    z-index: 100;
                    display: grid;
                    align-items: end;
                    gap: 12px;
                    padding: 15px;
                    border: 1px solid var(--tm-border);
                    background: color-mix(in srgb, var(--tm-surface) 97%, transparent);
                    box-shadow: 0 4px 13px rgba(0, 0, 0, .08);
                }
                .tm-toolbar label {
                    display: block;
                    margin-bottom: 5px;
                    color: var(--tm-muted);
                    font-size: .82rem;
                    font-weight: 700;
                }
                .tm-toolbar :is(input, select) {
                    width: 100%;
                    min-height: 43px;
                    padding: 8px 10px;
                    border: 1px solid #aaa;
                    border-radius: 6px;
                    background: var(--tm-surface);
                    color: var(--tm-text);
                }
                .tm-secondary-button {
                    min-height: 43px;
                    padding: 8px 15px;
                    border: 1px solid #888;
                    border-radius: 6px;
                    background: var(--tm-surface);
                    color: var(--tm-text);
                    cursor: pointer;
                }

                .tm-primary-button,
                .tm-save-button {
                    border-color: var(--tm-accent-dark) !important;
                    background: var(--tm-accent) !important;
                }

                :is(#tm-user-search, #tm-course-dashboard, #tm-instructor-dashboard, #taPowerToolsPanel)
                :is(button, input, select, textarea):focus-visible {
                    outline: 3px solid color-mix(in srgb, var(--tm-focus) 28%, transparent) !important;
                    outline-offset: 1px;
                }
            `;
            document.head.appendChild(style);
        }
    });
