# Honeycomb Family Flutter

Native Flutter client for the private Honeycomb Family dashboard.

## Android notifications

The Ubuntu monitor sends concise FCM data messages. Android displays activity
times and previews, deep-links photo alerts, and fetches private photo
thumbnails using the signed-in Honeycomb session stored on the device.

After installing or updating the APK, open the app once and complete or restore
the Honeycomb sign-in. This synchronizes the private session with Android's
app-scoped cookie store so background photo notifications can render thumbnails.

Build number 8 (`1.0.1+8`) introduces authenticated notification thumbnails.
The Firebase `google-services.json` remains private and must not be committed.
