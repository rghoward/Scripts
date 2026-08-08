# Hoots & Reps Cast receiver

This is the TV-only page loaded by Chromecast. It receives workout-card data
from the Android app over the Cast custom-message namespace and never stores
athlete data.

## Go live without keeping a laptop running

Deploy this directory as a static site to Cloudflare Pages or Firebase Hosting.
Use its HTTPS URL when registering a **Custom Receiver** in the Google Cast SDK
Developer Console, then copy the returned App ID into:

`android/app/src/main/res/values/cast.xml`

The phone and Chromecast must be on the same Wi-Fi. The static host does not.

## Next: live workout timers

Add a synchronized timer to the TV receiver for AMRAPs, EMOMs, intervals, and
for-time workouts. The phone remains the source of truth for start, pause,
reset, and completion; the receiver displays the active phase, round/minute,
and elapsed or remaining time.

## Local testing

An unpublished receiver can be served from a private-network HTTP server for a
registered test Chromecast. Published receivers require HTTPS.
