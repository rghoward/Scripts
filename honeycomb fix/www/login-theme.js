(() => {
  'use strict';
  if (window.__HCFD_LOGIN_THEME__) return;
  window.__HCFD_LOGIN_THEME__ = true;

  const style = document.createElement('style');
  style.id = 'hcfd2-login-theme';
  style.textContent = `
    :root { color-scheme:light; --hc-auth-honey:#ffb23e; --hc-auth-deep:#d98200; --hc-auth-cream:#fff5d8; --hc-auth-ink:#27231d; --hc-auth-muted:#736d63; }
    body.hcfd2-auth-page { min-height:100vh !important; margin:0 !important; padding:190px 18px 48px !important; box-sizing:border-box !important; background:radial-gradient(circle at 82% 8%,rgba(255,178,62,.24),transparent 27%),linear-gradient(165deg,#fffaf0 0%,#fff5d8 58%,#ffedbe 100%) !important; color:var(--hc-auth-ink) !important; font-family:Inter,ui-rounded,"SF Pro Rounded",system-ui,sans-serif !important; }
    body.hcfd2-auth-page::before { content:""; position:fixed; inset:0; pointer-events:none; opacity:.42; background-image:radial-gradient(circle,rgba(217,130,0,.22) 1px,transparent 1px); background-size:22px 22px; mask-image:linear-gradient(to bottom,black,transparent 58%); }
    #hcfd2-auth-brand { position:absolute; top:calc(34px + env(safe-area-inset-top)); left:50%; z-index:2147483600; display:grid; justify-items:center; width:min(440px,calc(100% - 36px)); color:var(--hc-auth-ink); text-align:center; transform:translateX(-50%); pointer-events:none; }
    #hcfd2-auth-brand .hcfd2-auth-mark { display:grid; place-items:center; width:68px; height:68px; margin-bottom:13px; border:2px solid #e49212; border-radius:22px; background:linear-gradient(145deg,#ffc35e,#ffa82f); box-shadow:0 14px 28px rgba(169,91,0,.2); font-size:34px; transform:rotate(-4deg); }
    #hcfd2-auth-brand strong { font-family:Georgia,"Times New Roman",serif; font-size:clamp(1.8rem,8vw,2.35rem); line-height:1.05; letter-spacing:-.025em; }
    #hcfd2-auth-brand span { margin-top:7px; color:var(--hc-auth-muted); font-size:.92rem; font-weight:650; }
    body.hcfd2-auth-page .hcfd2-auth-form { position:relative !important; z-index:2 !important; display:grid !important; gap:14px !important; width:min(430px,100%) !important; margin:0 auto !important; padding:clamp(24px,7vw,38px) !important; box-sizing:border-box !important; border:1px solid rgba(172,112,18,.24) !important; border-radius:26px !important; background:rgba(255,255,255,.94) !important; box-shadow:0 24px 70px rgba(87,54,10,.16) !important; backdrop-filter:blur(14px) !important; }
    body.hcfd2-auth-page .hcfd2-auth-form input:not([type=checkbox]):not([type=radio]) { width:100% !important; min-height:54px !important; box-sizing:border-box !important; border:1px solid #d8cdbb !important; border-radius:14px !important; padding:0 15px !important; background:#fffdf8 !important; color:var(--hc-auth-ink) !important; font-size:16px !important; }
    body.hcfd2-auth-page .hcfd2-auth-form input:focus { border-color:var(--hc-auth-deep) !important; outline:0 !important; box-shadow:0 0 0 4px rgba(255,178,62,.22) !important; }
    body.hcfd2-auth-page .hcfd2-auth-form button[type=submit], body.hcfd2-auth-page .hcfd2-auth-form input[type=submit] { width:100% !important; min-height:54px !important; border:1px solid #db8700 !important; border-radius:15px !important; background:linear-gradient(180deg,#ffbd4d,#f5a321) !important; color:#2d261d !important; font-size:1rem !important; font-weight:900 !important; box-shadow:0 10px 22px rgba(217,130,0,.23) !important; }
    body.hcfd2-auth-page .hcfd2-auth-form label, body.hcfd2-auth-page .hcfd2-auth-form h1, body.hcfd2-auth-page .hcfd2-auth-form h2 { color:var(--hc-auth-ink) !important; font-weight:800 !important; }
    body.hcfd2-auth-page .hcfd2-auth-form a { color:#a65e00 !important; font-weight:750 !important; }
    body.hcfd2-auth-page .hcfd2-auth-form [role=alert] { border-radius:12px !important; }
    @media (max-width:600px) { body.hcfd2-auth-page { padding-top:180px !important; } #hcfd2-auth-brand { top:calc(28px + env(safe-area-inset-top)); } }
    @media (prefers-reduced-motion:reduce) { *,*::before,*::after { scroll-behavior:auto !important; transition-duration:.01ms !important; animation-duration:.01ms !important; } }
  `;
  document.documentElement.appendChild(style);

  function decorateLogin() {
    const password = document.querySelector('input[type="password"]');
    const form = password?.closest('form');
    if (!form) {
      document.body?.classList.remove('hcfd2-auth-page');
      document.getElementById('hcfd2-auth-brand')?.remove();
      return;
    }
    document.body.classList.add('hcfd2-auth-page');
    form.classList.add('hcfd2-auth-form');
    const email = form.querySelector('input[type="email"], input[name*="email" i], input[name*="user" i]');
    if (email) {
      email.autocomplete = 'username';
      email.inputMode = 'email';
    }
    password.autocomplete = 'current-password';
    if (!document.getElementById('hcfd2-auth-brand')) {
      const brand = document.createElement('header');
      brand.id = 'hcfd2-auth-brand';
      brand.setAttribute('aria-label', 'Honeycomb Family');
      brand.innerHTML = '<div class="hcfd2-auth-mark" aria-hidden="true">⌂</div><strong>Honeycomb Family</strong><span>Your family dashboard</span>';
      document.body.appendChild(brand);
    }
  }

  const observer = new MutationObserver(decorateLogin);
  observer.observe(document.documentElement, { childList: true, subtree: true });
  decorateLogin();
})();
