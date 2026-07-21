import assert from "node:assert/strict";
import { readFile } from "node:fs/promises";
import test from "node:test";

const dashboard = await readFile(
  new URL("../honeycomb.js", import.meta.url),
  "utf8",
);
const android = await readFile(
  new URL(
    "../android/app/src/main/java/com/o2bkids/honeycomb/family/MainActivity.java",
    import.meta.url,
  ),
  "utf8",
);
const loginTheme = await readFile(
  new URL("../login-theme.js", import.meta.url),
  "utf8",
);
const photoDownloads = await readFile(
  new URL("../modules/photo-downloads.js", import.meta.url),
  "utf8",
);
const photoCache = await readFile(
  new URL("../modules/photo-cache.js", import.meta.url),
  "utf8",
);
const androidDownloads = await readFile(
  new URL(
    "../android/app/src/main/java/com/o2bkids/honeycomb/family/HoneycombDownloadBridge.java",
    import.meta.url,
  ),
  "utf8",
);
const iosAppDelegate = await readFile(
  new URL("../ios/App/App/AppDelegate.swift", import.meta.url),
  "utf8",
);
const iosInfo = await readFile(
  new URL("../ios/App/App/Info.plist", import.meta.url),
  "utf8",
);
const userscript = await readFile(
  new URL("../dist/honeycomb-family.user.js", import.meta.url),
  "utf8",
);

test("Firefox userscript is standalone and waits for authentication", () => {
  assert.match(userscript, /^\/\/ ==UserScript==/);
  assert.equal((userscript.match(/\/\/ ==UserScript==/g) || []).length, 1);
  assert.match(userscript, /createHoneycombPhotoCache/);
  assert.match(userscript, /__HCFD_LOGIN_THEME__/);
  assert.match(userscript, /activateBrowserDashboardWhenAuthenticated/);
  assert.match(userscript, /browserSessionIsAuthenticated/);
  assert.match(userscript, /@match\s+https:\/\/honeycomb\.o2bkids\.com\/\*/);
});

test("desktop photo gallery fills newest photos left to right", () => {
  assert.match(
    dashboard,
    /\.hcfd2-gallery \{[\s\S]*display: grid;[\s\S]*grid-template-columns: repeat\(auto-fit, minmax\(220px, 1fr\)\)/,
  );
  assert.doesNotMatch(dashboard, /columns: 4 220px/);
});

test("photo galleries use cached originals without fetching cache misses", () => {
  assert.match(dashboard, /img\[data-photo-original\]/);
  assert.match(dashboard, /cache\.match\(originalUrl\)/);
  assert.match(dashboard, /image\.dataset\.photoResolution = 'original'/);
  assert.doesNotMatch(
    dashboard.match(
      /async function hydrateCachedGalleryOriginals[\s\S]*?\n  }\n\n  function clearGalleryObjectUrls/,
    )?.[0] || "",
    /fetch\(/,
  );
});

test("Photos and Favorites default to all loaded items", () => {
  assert.match(
    dashboard,
    /if \(\['photos', 'favorites'\]\.includes\(tab\)\) \{\s*state\.period = 'all'/,
  );
  assert.match(dashboard, /return \['activity', 'stats'\]\.includes\(tab\)/);
});

test("photo cache has a byte budget and LRU eviction", () => {
  assert.match(dashboard, /PHOTO_CACHE_MAX_BYTES = 100 \* 1024 \* 1024/);
  assert.match(photoCache, /accessedAt: Date\.now\(\)/);
  assert.match(photoCache, /total <= maxBytes/);
});

test("photo warming is allocated per child and stale prefetches are aborted", () => {
  assert.match(dashboard, /recentBusinessDayCutoffKey\(5\)/);
  assert.match(dashboard, /PHOTO_CACHE_THUMB_PER_CHILD/);
  assert.match(
    dashboard,
    /viewerPrefetchControllers\.forEach\(controller => controller\.abort\(\)\)/,
  );
});

test("viewed and prefetched originals persist in the LRU cache", () => {
  assert.match(
    dashboard,
    /if \(response\.ok\) await photoCache\.store\(cache, url, response\)/,
  );
  assert.doesNotMatch(dashboard, /shouldPersistOriginal/);
  assert.match(photoCache, /mutation = mutation\.catch/);
});

test("every phone view supports horizontal child switching", () => {
  assert.match(dashboard, /function bindChildViewSwipe\(\)/);
  assert.match(dashboard, /app\.querySelector\('\.hcfd2-main'\)/);
  assert.match(dashboard, /calendarUsesGesture/);
});

test("Today is the startup view and the phone menu has no dashboard close action", () => {
  assert.match(dashboard, /tab: 'home'/);
  assert.doesNotMatch(dashboard, /× Close dashboard/);
});

test("calendar, timeline, and reports are unified under Activity", () => {
  assert.match(dashboard, /case 'activity': return renderActivity/);
  assert.match(dashboard, /data-activity-view="agenda"/);
  assert.match(dashboard, /data-activity-view="calendar"/);
  assert.match(dashboard, /\['reports', 'Reports'\]/);
  assert.doesNotMatch(dashboard, /data-tab="(?:calendar|timeline|reports)"/);
});

test("private data is cleared when authentication ends", () => {
  assert.match(dashboard, /__HCFD_CLEAR_PRIVATE_DATA__ = clearPrivateData/);
  assert.match(dashboard, /caches\.delete\(PHOTO_CACHE_NAME\)/);
  assert.match(android, /__HCFD_CLEAR_PRIVATE_DATA__/);
});

test("Android uses dispatcher-based back navigation", () => {
  assert.match(android, /OnBackPressedCallback/);
  assert.doesNotMatch(android, /void onBackPressed\(/);
});

test("login theme keeps accessible focus and reduced-motion behavior", () => {
  assert.match(loginTheme, /input:focus/);
  assert.match(loginTheme, /prefers-reduced-motion:reduce/);
  assert.match(loginTheme, /input\[type="password"\]/);
  assert.match(loginTheme, /hcfd2-auth-brand/);
  assert.match(loginTheme, /autocomplete = 'current-password'/);
});

test("viewer supports native downloads and bounded pinch zoom", () => {
  assert.match(dashboard, /HoneycombPhotoDownloads/);
  assert.match(dashboard, /__HCFD_DOWNLOAD_STATUS__ = handleDownloadStatus/);
  assert.match(dashboard, /Saved to Photos/);
  assert.match(dashboard, /savedPhotos: 'hcfd2-saved-photos-v1'/);
  assert.match(dashboard, /function isOriginalSaved\(moment\)/);
  assert.match(dashboard, /STORAGE\.savedPhotos/);
  assert.match(photoDownloads, /HoneycombDownloads/);
  assert.match(photoDownloads, /beginCachedSave/);
  assert.match(photoDownloads, /appendCachedChunk/);
  assert.match(photoDownloads, /new URL\(sourceUrl, location\.href\)\.href/);
  assert.match(androidDownloads, /public final class HoneycombDownloadBridge/);
  assert.match(androidDownloads, /@JavascriptInterface\s+public void download/);
  assert.match(androidDownloads, /activity\.runOnUiThread/);
  assert.match(androidDownloads, /MediaStore\.Downloads/);
  assert.match(androidDownloads, /MediaStore\.Images\.Media/);
  assert.match(androidDownloads, /DIRECTORY_PICTURES/);
  assert.match(androidDownloads, /Referer/);
  assert.match(dashboard, /Math\.min\(4, Math\.max\(1,/);
  assert.match(dashboard, /viewerZoomX/);
  assert.match(dashboard, /viewerZoomY/);
  assert.match(dashboard, /pan\.originX \+ touch\.clientX - pan\.x/);
});

test("iOS saves cached originals through Photos with add-only permission", () => {
  assert.match(iosAppDelegate, /WKScriptMessageHandler/);
  assert.match(iosAppDelegate, /window\.HoneycombDownloads/);
  assert.match(
    iosAppDelegate,
    /PHPhotoLibrary\.requestAuthorization\(for: \.addOnly\)/,
  );
  assert.match(iosAppDelegate, /creationRequestForAssetFromImage/);
  assert.match(iosInfo, /NSPhotoLibraryAddUsageDescription/);
});

test("iOS retries dashboard injection after authenticated navigation", () => {
  assert.match(iosAppDelegate, /override func capacitorDidLoad\(\)/);
  assert.match(iosAppDelegate, /webView\?\.configuration/);
  assert.doesNotMatch(iosAppDelegate, /override func webViewConfiguration/);
  assert.match(iosAppDelegate, /function inject\(\)/);
  assert.match(
    iosAppDelegate,
    /document\.querySelector\('input\[type="password"\]'\)/,
  );
  assert.match(iosAppDelegate, /setTimeout\(function\(\)/);
});

test("photo viewer has safe back navigation and persistent per-child hiding", () => {
  assert.match(dashboard, /data-viewer="close" aria-label="Back to photos"/);
  assert.match(dashboard, /data-viewer="hide">Hide photo/);
  assert.match(dashboard, /hiddenPhotos: 'hcfd2-hidden-photos-v1'/);
  assert.match(dashboard, /function visiblePhotosForChild\(moments, childId\)/);
  assert.match(dashboard, /Restore.*hidden photo/);
});

test("supply-alert notes use the shared lazy report loader", () => {
  assert.match(dashboard, /class="hcfd2-alert-note" data-report-detail/);
  assert.match(dashboard, /reportDetailCache\.get\(detailKey\)/);
});

test("supply sheet stays outside the animated home swipe wrapper", () => {
  assert.match(
    dashboard,
    /return `\$\{renderSupplyAlerts\(\)\}<div data-home-child-swipe>/,
  );
});

test("report details update in place without a dashboard rerender", () => {
  assert.match(dashboard, /function showLoadedReportDetail\(key, detail\)/);
  assert.match(dashboard, /showLoadedReportDetail\(key, json\.Data\)/);
  assert.match(dashboard, /hcfd2-mini-timeline[\s\S]*data-report-detail/);
  assert.match(dashboard, /hcfd2-empty-report-detail'\)\?\.remove\(\)/);
});
