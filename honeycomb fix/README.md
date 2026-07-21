# Honeycomb Family dashboard and mobile app

This project packages the existing `honeycomb.js` dashboard as one Capacitor app for iOS and Android. The native WebView opens the real Honeycomb site, preserving its normal login, cookies, and same-origin API behavior. After Honeycomb confirms an authenticated family session, the app injects the shared dashboard.

The same dashboard is also built as a Firefox/Tampermonkey userscript, so the website and native apps share the same views, gestures, photo caching, notes, alerts, and child-switching behavior.

No Honeycomb credentials are stored in this repository or passed through a third-party service.

## Included dashboard features

- Today-first home day and weekly views for every child
- Unified Activity section with agenda and calendar views, combined-child scope, and report/photo filters
- Phone-wide child switching by swiping from any primary screen; calendar content retains day swiping while its edges switch children
- Photos, favorites, statistics, heatmap, and badges
- Profile pictures with crop/zoom
- Supply alerts and acknowledgement state
- Search, date filters, history pagination, themes, and auto-refresh
- Photo viewer with animated swiping, cancellable two-behind/five-ahead preloading, a fair per-child 100 MB LRU cache, and photo downloads
- Native Save original support for Android Gallery and the iOS Photos library
- Weekly comparison, print/PDF view, and cached dashboard data
- Responsive phone and tablet layouts already defined in `honeycomb.js`
- Native notification-center alerts for newly detected photos, reports, and supply requests

Favorites, hidden-photo choices, saved-photo status, avatars, theme choices, and acknowledgement state use the app WebView's local storage. They remain private to each installed app and do not automatically sync between iOS and Android.

Cached family data and photos are cleared after logout is detected or when a different family account signs in. The photo cache evicts least-recently-used files once it reaches 100 MB.

## Notifications

On a phone, open **Menu → Enable notifications** and approve the operating-system permission prompt. The menu then includes **Send test notification**.

The app sends native notifications when a refresh detects:

- New supply requests
- New classroom photos
- New daily reports

The dashboard refreshes every five minutes while open and refreshes immediately when brought back to the foreground. Because this project has no notification server, iOS and Android may suspend it while fully closed; consequently, closed-app delivery cannot be guaranteed. Reopening the app catches and notifies about changes that occurred since its previous refresh. Reliable real-time delivery while fully closed would require a push-notification server.

## Project layout

- `honeycomb.js` — shared dashboard source; continue editing this file
- `www/` — Capacitor web assets
- `android/` — native Android Studio project and authenticated injection hook
- `ios/` — native Xcode project and authenticated injection hook
- `scripts/sync-dashboard.mjs` — copies the shared dashboard into native assets
- `dist/honeycomb-family.user.js` — installable Firefox/Tampermonkey bundle

## Firefox with Tampermonkey

Build the userscript:

```sh
npm run build:userscript
```

In Firefox, install Tampermonkey, open its dashboard, choose **Utilities → Import from file**, and select `dist/honeycomb-family.user.js`. The script runs only on `https://honeycomb.o2bkids.com/*`. It styles Honeycomb's login page, waits for a valid signed-in family session, and then opens the custom dashboard automatically.

Tampermonkey state and cached photos live in that Firefox profile and are separate from the Android and iOS app caches. Native notification-center controls are intentionally omitted in Firefox. Photo **Save original** uses Firefox's normal download flow.

Because this local userscript has no hosted update URL, rebuild and re-import it after dashboard changes. Tampermonkey replaces the installed script because its name and namespace remain stable.

## Build

Requirements:

- Node.js 20 or newer
- Android Studio/SDK with API 35
- Xcode with an installed iOS Simulator runtime

Install and synchronize:

```sh
npm install
npm run sync
```

Android debug APK:

```sh
cd android
./gradlew assembleDebug
```

The APK is created at `android/app/build/outputs/apk/debug/app-debug.apk`.

After each successful APK build, replace the contents of the existing Google Drive file named `Honeycomb-Family.apk` (file ID `17BoXdil0RTXYkbOhXjxrOi5ZWRVOiN4t`) instead of uploading a new Drive file. This preserves the stable download link while updating its contents.

iOS simulator build:

```sh
xcodebuild \
  -workspace ios/App/App.xcworkspace \
  -scheme App \
  -configuration Debug \
  -sdk iphonesimulator \
  -derivedDataPath ios/App/DerivedData \
  CODE_SIGNING_ALLOWED=NO \
  build
```

For device/App Store builds, open `ios/App/App.xcworkspace` in Xcode and select a signing team. For Google Play, configure a release keystore in the Android project.

The iOS simulator and unsigned arm64 device targets are build-verified. Installing on a physical iPhone or distributing through TestFlight still requires an Apple Developer signing team and provisioning profile.

Before creating an Android release, set `HCFD_RELEASE_KEYSTORE`, `HCFD_RELEASE_STORE_PASSWORD`, `HCFD_RELEASE_KEY_ALIAS`, and `HCFD_RELEASE_KEY_PASSWORD` in your local environment or CI secret store. Never commit the keystore or passwords. Then run:

```sh
npm run build:android:release
```

This runs linting, formatting checks, and tests before generating a minified, resource-shrunk release AAB. Debug APKs uploaded to Drive are testing artifacts and should not be distributed as production releases.

## Emulator workflow

Android:

```sh
$ANDROID_HOME/emulator/emulator -avd Medium_Phone_API_35
$ANDROID_HOME/platform-tools/adb install -r android/app/build/outputs/apk/debug/app-debug.apk
$ANDROID_HOME/platform-tools/adb shell am start -W -n com.o2bkids.honeycomb.family/.MainActivity
```

iOS:

```sh
xcrun simctl list devices available
open -a Simulator
```

Then build/run the `App` scheme in Xcode. Sign into Honeycomb manually inside each emulator. Authentication and real family data cannot be tested automatically without user credentials; do not place credentials in scripts or source files.

## Updating the dashboard

After changing `honeycomb.js`, run:

```sh
npm run sync
```

The sync task copies the dashboard and login theme into both native apps. Honeycomb continues to own authentication and password recovery; the app only applies visual styling to those screens. The native hooks inject the dashboard after `/api/membership/children` confirms authentication and clear private cached data if that authentication later ends.

## Quality checks

Run the complete local verification suite with:

```sh
npm run check
```

The suite checks JavaScript correctness and unsafe leftovers, formatting of project tooling, cache/privacy contracts, login accessibility rules, and Android back-navigation integration.

## Distribution note

This is a private client for an existing authenticated service. Before public App Store or Play Store distribution, confirm authorization to use Honeycomb/O2B Kids branding and APIs, add production icons/privacy disclosures, and review each store's minimum-functionality and account-access requirements.
