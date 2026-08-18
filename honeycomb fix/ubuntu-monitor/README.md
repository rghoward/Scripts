# Ubuntu Honeycomb monitor

This is a personal, free starter for reliable alerts while the phone app is closed. An always-on Ubuntu laptop checks the Honeycomb website and sends a short count-only summary to the installed Android app through Firebase Cloud Messaging (FCM). Telegram remains available as an optional second destination. It does **not** store your Honeycomb password, and its signed-in browser profile and alert state stay only on that laptop.

It is intentionally a starter: it detects the most recent ten reports, photos, and earned badges per child every fifteen minutes. It sends counts, not photo URLs, report content, or badge details. Supply requests, daily reports, photos, and badges use distinct notification titles. Android app version 1.2.0 or newer also gives each category its own channel, color, and icon. Tapping a notification opens the relevant child's Today screen.

## Before installing on Ubuntu: Android push expectations

The Android app must be built here, with Firebase configured, before Ubuntu can send pushes. Follow [ANDROID_PUSH_EXPECTATIONS.md](ANDROID_PUSH_EXPECTATIONS.md) first. In short:

- Create one Firebase project and register Android package `com.o2bkids.honeycomb.family`.
- Put its `google-services.json` in `android/app/` only while building the APK. It is ignored by Git.
- Install that rebuilt APK, open it once while online, and approve Android's notification permission when prompted.
- Create a Firebase Admin SDK service-account JSON file for Ubuntu. Keep it private; Ubuntu uses it to send messages to the app’s `honeycomb-family-alerts-v1` topic.

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

## 3. Configure the Android push destination

Copy the Firebase Admin SDK service-account JSON file created during the Android preparation to Ubuntu. Do not commit it or put it inside the Git repository.

```sh
mkdir -p ~/.config/honeycomb-monitor
cp /path/to/firebase-service-account.json ~/.config/honeycomb-monitor/firebase-service-account.json
chmod 600 ~/.config/honeycomb-monitor/firebase-service-account.json
nano ~/.config/honeycomb-monitor/env
chmod 600 ~/.config/honeycomb-monitor/env
```

Set the environment file to:

```sh
FCM_SERVICE_ACCOUNT_FILE=~/.config/honeycomb-monitor/firebase-service-account.json
FCM_TOPIC=honeycomb-family-alerts-v1
```

Test delivery after installing and opening the rebuilt Android app once:

```sh
set -a
. ~/.config/honeycomb-monitor/env
set +a
npm run test-notification
```

If no notification arrives, verify that the phone has Google Play services, is online, has notification permission enabled for Honeycomb Family, and that the Firebase project matches the `google-services.json` used to build the installed APK.

## 4. Optional: create a free Telegram destination

1. In Telegram, open **@BotFather**, create a bot, and copy its token.
2. Open a chat with your new bot and send it a message such as `hello`.
3. In a terminal, set the token temporarily and ask Telegram for your chat ID:

```sh
export TELEGRAM_BOT_TOKEN='paste-token-here'
curl -s "https://api.telegram.org/bot${TELEGRAM_BOT_TOKEN}/getUpdates"
```

Find `"chat":{"id":...}` in the result. That numeric value is your `TELEGRAM_CHAT_ID`. For a private setup, do not add the bot to a group.

Add these lines to the same private environment file if you also want Telegram:

```sh
TELEGRAM_BOT_TOKEN=your-bot-token
TELEGRAM_CHAT_ID=your-private-chat-id
```

## 5. Establish the no-spam baseline

Run the monitor once. It records the currently visible recent items without alerting on old history:

```sh
set -a
. ~/.config/honeycomb-monitor/env
set +a
npm start
```

Run that command again later to check manually. On later runs it sends Telegram only when it detects new reports, photos, or supply requests.

## 6. Run it every 15 minutes with systemd

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
- FCM and optional Telegram receive only count summaries, such as `Alex: 2 new photos` or `Alex: 1 new badge`; they do not receive photo URLs, report text, or badge details.
- The monitor needs a desktop-capable Ubuntu session for the one-time login. Normal polling runs headlessly afterward.
- Ubuntu needs Node.js, Playwright/Chromium, the browser profile, and the private Firebase service-account file. It does **not** need Android Studio, the Android SDK, Gradle, or an APK build.
