# Android push expectations

This one-time setup happens on the machine that builds the Android app, not on Ubuntu. It prepares the Honeycomb Family APK to receive count-only alerts from the Ubuntu monitor when the app is backgrounded or closed.

## What Firebase is used for

Firebase Cloud Messaging (FCM) routes a notification from Ubuntu to the installed Android app. Ubuntu sends a high-priority data message to the app’s `honeycomb-family-alerts-v1` topic; the app displays it in Android’s notification center. The message contains only a title and count summary.

The Firebase Admin service-account JSON is a sending credential. Treat it like a password: keep it outside Git, restrict it to the monitor owner, and revoke/replace it if it is ever exposed.

## Create the Firebase project

1. In the [Firebase console](https://console.firebase.google.com/), create a Firebase project.
2. Add an **Android app** with this exact package name: `com.o2bkids.honeycomb.family`.
3. Download its `google-services.json` file and place it at `android/app/google-services.json` on the build machine. This repository ignores the file; never commit it.
4. In Firebase project settings, open **Cloud Messaging** and enable the Cloud Messaging API if Firebase asks you to.
5. In Google Cloud / Firebase service-account settings, create an Admin SDK service-account JSON key. Save it in a private location for later transfer to Ubuntu; it is not an Android build input.

## Build and activate the APK

1. With `google-services.json` in place, build the APK on this development machine.
2. Install the new APK on the Android device.
3. Open the app once while it has network access. This registers the app with FCM and subscribes it to `honeycomb-family-alerts-v1`.
4. Open the app once and approve Android’s notification prompt.
5. Follow the Ubuntu monitor guide to copy the service-account JSON into `~/.config/honeycomb-monitor/`, configure `FCM_SERVICE_ACCOUNT_FILE`, and send the test notification.

## Limits and security

- FCM requires Android 6.0+ with Google Play services. Devices without Google Play services will not receive these pushes.
- Android cannot deliver messages after a user force-stops the app until the user opens it again. Normal backgrounding or swiping away the app is supported.
- The topic is for this personal, count-only notification channel. Do not put children’s names, report notes, photo links, login credentials, or other sensitive details in the push payload.
- Keep the Firebase project and its service-account key under your control. Ubuntu only needs the private key file and Node.js; it needs no Android build software.

Firebase documents the Android client setup and message receiving flow in its [Android FCM guide](https://firebase.google.com/docs/cloud-messaging/android/get-started) and [receive-messages guide](https://firebase.google.com/docs/cloud-messaging/android/receive-messages). Its [server-environment guide](https://firebase.google.com/docs/cloud-messaging/server-environment) covers the trusted sender/service-account model used by the Ubuntu monitor.
