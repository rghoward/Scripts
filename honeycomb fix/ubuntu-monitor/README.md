# Ubuntu Honeycomb monitor

This is a personal, free starter for reliable alerts while the phone app is closed. An always-on Ubuntu laptop checks the Honeycomb website and sends a short summary to your private Telegram chat. It does **not** store your Honeycomb password, and its signed-in browser profile and alert state stay only on that laptop.

It is intentionally a starter: it detects the most recent ten reports and photos per child every fifteen minutes. It sends counts, not photo or report content.

## 1. Install it on Ubuntu

Clone this repository somewhere in your home folder, then install the monitor dependencies:

```sh
git clone https://github.com/rghoward/Scripts.git ~/honeycomb-family-dashboard
cd ~/honeycomb-family-dashboard/honeycomb\ fix/ubuntu-monitor
npm install
npx playwright install chromium
```

If `node` or `npm` is missing, install the current Node.js LTS release first. Keep the laptop powered on and connected to the internet when you want alerts.

## 2. Sign in locally

Run this from `ubuntu-monitor`:

```sh
npm run login
```

A local Chromium window opens. Sign in to Honeycomb normally, verify that you can see your family account, return to the terminal, and press Enter. The session is saved in `data/browser-profile/`, which is ignored by Git. If Honeycomb signs you out later, run this command again.

## 3. Create the free Telegram destination

1. In Telegram, open **@BotFather**, create a bot, and copy its token.
2. Open a chat with your new bot and send it a message such as `hello`.
3. In a terminal, set the token temporarily and ask Telegram for your chat ID:

```sh
export TELEGRAM_BOT_TOKEN='paste-token-here'
curl -s "https://api.telegram.org/bot${TELEGRAM_BOT_TOKEN}/getUpdates"
```

Find `"chat":{"id":...}` in the result. That numeric value is your `TELEGRAM_CHAT_ID`. For a private setup, do not add the bot to a group.

Create the private environment file:

```sh
mkdir -p ~/.config/honeycomb-monitor
nano ~/.config/honeycomb-monitor/env
chmod 600 ~/.config/honeycomb-monitor/env
```

Its contents should be:

```sh
TELEGRAM_BOT_TOKEN=your-bot-token
TELEGRAM_CHAT_ID=your-private-chat-id
```

Test Telegram delivery:

```sh
set -a
. ~/.config/honeycomb-monitor/env
set +a
npm run test-notification
```

## 4. Establish the no-spam baseline

Run the monitor once. It records the currently visible recent items without alerting on old history:

```sh
set -a
. ~/.config/honeycomb-monitor/env
set +a
npm start
```

Run that command again later to check manually. On later runs it sends Telegram only when it detects new reports, photos, or supply requests.

## 5. Run it every 15 minutes with systemd

Copy the example service and timer into your user systemd directory:

```sh
mkdir -p ~/.config/systemd/user
cp honeycomb-monitor.service.example ~/.config/systemd/user/honeycomb-monitor.service
cp honeycomb-monitor.timer ~/.config/systemd/user/
```

Edit `~/.config/systemd/user/honeycomb-monitor.service` and replace:

- `__REPO_PATH__` with the absolute path to the repository’s `honeycomb fix` folder.
- `__NODE_PATH__` with the output of `command -v node` (for example, `/usr/bin/node`).

Then enable it:

```sh
systemctl --user daemon-reload
systemctl --user enable --now honeycomb-monitor.timer
loginctl enable-linger "$USER"
systemctl --user list-timers honeycomb-monitor.timer
```

`enable-linger` lets your user timer continue after you log out. To inspect it later:

```sh
systemctl --user status honeycomb-monitor.timer
journalctl --user -u honeycomb-monitor.service -f
```

## Privacy and limitations

- Never commit `data/`, the browser profile, `state.json`, or the Telegram environment file.
- Telegram receives only count summaries, such as `Alex: 2 new photos`; it does not receive photo URLs or report text.
- The monitor needs a desktop-capable Ubuntu session for the one-time login. Normal polling runs headlessly afterward.
- This is independent of the mobile app. It is a practical free bridge until a hosted push service is built.
