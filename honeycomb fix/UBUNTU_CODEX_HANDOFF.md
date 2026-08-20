# Ubuntu Codex handoff: Honeycomb Family notifications

## Goal

Finish the private Ubuntu-side monitor for the already-created Firebase Cloud Messaging (FCM) setup. The installed Android APK has already been rebuilt, installed, and successfully subscribed to the FCM topic.

- Firebase project ID: `honeycomb-family-notifications`
- Android package: `com.o2bkids.honeycomb.family`
- FCM topic: `honeycomb-family-alerts-v1`
- Monitor directory: `ubuntu-monitor/`

Do not create a database, Hosting site, Analytics configuration, billing account, public endpoint, or app-store release.

## Important security rules

- Never print, paste, commit, upload, or otherwise expose the Firebase service-account JSON.
- Do not place the service-account JSON in this repository.
- Keep the private files below readable only by the Ubuntu user (`chmod 600`).
- Do not change or commit unrelated files.

## Required work

1. Pull the latest `main` branch of `https://github.com/rghoward/Scripts.git`.
2. In Firebase project `honeycomb-family-notifications`, create a Firebase Admin SDK service-account JSON key. Use the Firebase Admin SDK service account. Do not reveal its contents.
3. Create the private directory and place the key exactly here:

   ```sh
   mkdir -p ~/.config/honeycomb-monitor
   chmod 700 ~/.config/honeycomb-monitor
   # Save the downloaded service-account JSON as:
   # ~/.config/honeycomb-monitor/firebase-service-account.json
   chmod 600 ~/.config/honeycomb-monitor/firebase-service-account.json
   ```

4. Create `~/.config/honeycomb-monitor/env` with exactly:

   ```sh
   FCM_SERVICE_ACCOUNT_FILE=~/.config/honeycomb-monitor/firebase-service-account.json
   FCM_TOPIC=honeycomb-family-alerts-v1
   ```

   Then run:

   ```sh
   chmod 600 ~/.config/honeycomb-monitor/env
   ```

5. Set up the monitor from the repository's `honeycomb fix/ubuntu-monitor` directory:

   ```sh
   npm install
   npx playwright install chromium
   npm run login
   ```

   Complete the normal Honeycomb sign-in in the local browser when prompted. This saves the signed-in browser profile only on Ubuntu.

6. Establish the no-spam baseline, then test FCM delivery:

   ```sh
   set -a
   . ~/.config/honeycomb-monitor/env
   set +a
   npm start
   npm run test-notification
   ```

   The first `npm start` saves existing items without sending historical alerts. The test must produce one notification on the Android phone.

7. Configure the included user-level systemd service and timer as documented in `ubuntu-monitor/README.md`. Replace the two placeholders in `honeycomb-monitor.service.example` with the actual Ubuntu repository path and `node` path, then enable the timer and linger.

## Expected notifications

Every 15 minutes, the monitor checks each child for new:

- supply requests;
- daily reports;
- photos / daily moments;
- earned badges.

It sends one count-only FCM summary, for example `Alex: 2 new photos`. It must not include report text, photo URLs, image bytes, badge details, or other private content. Photo alerts may include the uploaded filename so the phone can fetch its own authenticated thumbnail for the paired watch.

The badge-alert support is already committed in the latest `main` branch. Existing monitor state silently establishes a badge baseline once, so old badges do not cause an alert flood.

## Exact photo-opening update

The latest `main` branch adds a `photoId` and uploaded filename to new photo-alert payloads. This lets the Android app open the exact alerted photo, with Back returning to that child's Today screen, and fetch a private thumbnail for the bridged Wear OS notification.

On an already configured Ubuntu monitor, pull and restart the timer-backed service so future alerts include this field:

```sh
git pull --ff-only origin main
systemctl --user restart honeycomb-monitor.timer
```

No Firebase, environment-file, login, or baseline reset is needed. Notifications created before this update do not include a photo ID; the updated Android app opens the child's newest available photo for them instead.

## Final report

Report only whether these are complete:

- private service-account JSON placed;
- private environment file placed;
- Honeycomb login saved;
- baseline completed;
- FCM test notification received;
- systemd timer enabled;
- any remaining manual phone step.
