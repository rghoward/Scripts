const appCallback = 'com.rhoward.hootsandreps://auth/callback'

const page = `<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Email confirmed | Hoots & Reps</title>
    <style>
      :root { color-scheme: dark; }
      * { box-sizing: border-box; }
      body {
        align-items: center;
        background: radial-gradient(circle at 22% 15%, #34205e, #070615 55%);
        color: #f7f5ef;
        display: flex;
        font-family: system-ui, -apple-system, BlinkMacSystemFont, "Segoe UI", sans-serif;
        margin: 0;
        min-height: 100vh;
        padding: 24px;
      }
      main {
        background: #151127;
        border: 1px solid #4b3a78;
        border-radius: 20px;
        box-shadow: 0 24px 70px rgba(0, 0, 0, .36);
        margin: auto;
        max-width: 440px;
        padding: 32px;
        text-align: center;
      }
      .mark { color: #56d7ff; font-size: 13px; font-weight: 800; letter-spacing: .13em; }
      h1 { font-size: 30px; line-height: 1.15; margin: 17px 0 12px; }
      p { color: #d0c9df; line-height: 1.5; margin: 0 0 25px; }
      button {
        background: #a855f7;
        border: 0;
        border-radius: 11px;
        color: white;
        cursor: pointer;
        font: inherit;
        font-weight: 800;
        padding: 14px 20px;
        width: 100%;
      }
      small { color: #ada6c1; display: block; line-height: 1.4; margin-top: 19px; }
    </style>
  </head>
  <body>
    <main>
      <div class="mark">HOOTS &amp; REPS</div>
      <h1>Email confirmed</h1>
      <p>Your account is ready. Open Hoots &amp; Reps to sign in and review your local training history.</p>
      <button type="button" id="open-app">OPEN HOOTS &amp; REPS</button>
      <small>If the app does not open, return to it manually and sign in with the email and password you just created.</small>
    </main>
    <script>
      // Supabase appends either an OAuth-style code query or token fragment to
      // this landing URL. Forward it intact only after the user chooses to
      // open the app, preserving a readable browser fallback.
      document.getElementById('open-app').addEventListener('click', () => {
        window.location.href = '${appCallback}' + window.location.search + window.location.hash;
      });
    </script>
  </body>
</html>`

Deno.serve(() =>
  new Response(page, {
    headers: {
      'cache-control': 'no-store',
      'content-security-policy': "default-src 'none'; style-src 'unsafe-inline'; script-src 'unsafe-inline'",
      'content-type': 'text/html; charset=utf-8',
      'x-content-type-options': 'nosniff',
    },
  }),
)
