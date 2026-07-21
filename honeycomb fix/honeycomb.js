// ==UserScript==
// @name         Honeycomb Family Dashboard 2.0
// @namespace    https://honeycomb.o2bkids.com/
// @version      2.11.2
// @description  Modern Honeycomb family dashboard with timeline, photos, favorites, reports, badges, statistics, downloads, and auto-refresh.
// @match        https://honeycomb.o2bkids.com/*
// @grant        none
// @run-at       document-idle
// ==/UserScript==

(() => {
  'use strict';

  const API = {
    children: '/api/membership/children',
    reports: '/api/daily-report',
    moments: '/api/daily-moment',
    badges: '/api/badges-child',
    badgeCategories: '/api/badges/category',
  };

  const PAGE_SIZE = 10;
  const AUTO_REFRESH_MS = 5 * 60 * 1000;
  const PHOTO_CACHE_NAME = 'hcfd2-photo-cache-v3';
  const LEGACY_PHOTO_CACHE_NAME = 'hcfd2-recent-photos-v1';
  const PREVIOUS_PHOTO_CACHE_NAME = 'hcfd2-photo-cache-v2';
  const PHOTO_CACHE_MAX_BYTES = 100 * 1024 * 1024;
  const PHOTO_CACHE_THUMB_PER_CHILD = 25;
  const PHOTO_CACHE_HISTORY_PER_CHILD = 100;
  const PHOTO_PREFETCH_AHEAD = 5;
  const PHOTO_PREFETCH_BEHIND = 2;
  const PHOTO_PREFETCH_CONCURRENCY = 2;

  const STORAGE = {
    theme: 'hcfd2-theme',
    child: 'hcfd2-child',
    tab: 'hcfd2-tab',
    favorites: 'hcfd2-favorites',
    lastSeen: 'hcfd2-last-seen',
    autoRefresh: 'hcfd2-auto-refresh',
    weekStartsOn: 'hcfd2-week-starts-on',
    selectedWeek: 'hcfd2-selected-week',
    cache: 'hcfd2-session-cache-v1',
    avatars: 'hcfd2-child-avatars',
    acknowledgedSupplies: 'hcfd2-acknowledged-supplies',
    notifications: 'hcfd2-notifications',
    savedPhotos: 'hcfd2-saved-photos-v1',
    hiddenPhotos: 'hcfd2-hidden-photos-v1',
    photoCacheIndex: 'hcfd2-photo-cache-index-v3',
    accountScope: 'hcfd2-account-scope-v1',
  };

  const photoCache = globalThis.createHoneycombPhotoCache({
    cacheName: PHOTO_CACHE_NAME,
    indexKey: STORAGE.photoCacheIndex,
    maxBytes: PHOTO_CACHE_MAX_BYTES,
  });

  const state = {
    children: [],
    selectedChildId: localStorage.getItem(STORAGE.child) || null,
    tab: 'home',
    theme: ['light', 'dark', 'system', 'time'].includes(localStorage.getItem(STORAGE.theme))
      ? localStorage.getItem(STORAGE.theme)
      : 'system',
    autoRefresh: localStorage.getItem(STORAGE.autoRefresh) !== 'false',
    data: new Map(),
    search: '',
    period: 'today',
    homeView: 'day',
    calendarMonth: todayKey().slice(0, 7),
    calendarSelectedDate: null,
    calendarScope: null,
    activityView: 'agenda',
    selectedDate: todayKey(),
    timelineScope: null,
    weekStartsOn: Number(localStorage.getItem(STORAGE.weekStartsOn)) === 0 ? 0 : 1,
    selectedWeek: localStorage.getItem(STORAGE.selectedWeek) || todayKey(),
    overlayOpen: false,
    refreshTimer: null,
    slideshow: { items: [], index: 0 },
    avatarEditor: null,
    badgeCategories: [],
    newItemIds: new Set(),
    headerMenuOpen: false,
    supplyAlertsOpen: false,
    timelineFiltersOpen: false,
    timelineType: 'all',
    photoFiltersOpen: false,
    photoFavoritesOnly: false,
    reportFiltersOpen: false,
    statsFiltersOpen: false,
    mobileMoreOpen: false,
    childPickerOpen: false,
    loadingMore: false,
    suppressViewAnimation: false,
    calendarTransitionDirection: 0,
    notificationsEnabled: localStorage.getItem(STORAGE.notifications) === 'true',
    lastResumeRefresh: 0,
  };

  let overlay = null;
  let app = null;
  let cacheSaveTimer = null;
  let newItemTimer = null;
  let themeTimer = null;
  let photoCacheSync = null;
  let photoCacheNeedsResync = false;
  let viewerUpdateToken = 0;
  let viewerHistoryLoading = null;
  let viewerPrefetchGeneration = 0;
  let viewerPrefetchKeep = new Set();
  let viewerZoomScale = 1;
  let viewerZoomX = 0;
  let viewerZoomY = 0;
  let pendingPhotoSaveKey = null;
  let galleryHydrationToken = 0;
  const viewerPrefetchControllers = new Set();
  const photoObjectUrls = new Map();
  const galleryObjectUrls = new Set();
  const reportDetailCache = new Map();

  init();

  function init() {
    if (!isNativeShell()) {
      void activateBrowserDashboardWhenAuthenticated();
      return;
    }
    activateDashboard();
  }

  function isNativeShell() {
    return Boolean(
      globalThis.__HCFD_MOBILE_INJECTED__
      || globalThis.HoneycombDownloads
      || globalThis.Capacitor?.isNativePlatform?.()
    );
  }

  async function activateBrowserDashboardWhenAuthenticated() {
    if (await browserSessionIsAuthenticated()) {
      activateDashboard();
      return;
    }
    const retry = setInterval(async () => {
      if (!(await browserSessionIsAuthenticated())) return;
      clearInterval(retry);
      activateDashboard();
    }, 3000);
  }

  async function browserSessionIsAuthenticated() {
    try {
      const response = await fetch(API.children, {
        credentials: 'same-origin',
        headers: { Accept: 'application/json' },
      });
      if (!response.ok) return false;
      const payload = await response.json();
      const children = Array.isArray(payload) ? payload : payload?.Data;
      return Array.isArray(children) && children.length > 0;
    } catch {
      return false;
    }
  }

  function activateDashboard() {
    if (globalThis.__HCFD_DASHBOARD_ACTIVE__) return;
    globalThis.__HCFD_DASHBOARD_ACTIVE__ = true;
    injectStyles();
    bindGlobalKeys();
    bindThemePreference();
    bindAppResumeRefresh();
    ensureLauncher();
    globalThis.__HCFD_HANDLE_BACK__ = handleNativeBack;
    globalThis.__HCFD_CLEAR_PRIVATE_DATA__ = clearPrivateData;
    globalThis.__HCFD_DOWNLOAD_STATUS__ = handleDownloadStatus;

    // Automatically replace Honeycomb on every page.
    setTimeout(openDashboard, 0);
}



  async function openDashboard() {
    if (state.overlayOpen) return;
    state.overlayOpen = true;
    document.body.classList.add('hcfd2-no-scroll');
    createOverlay();

    const restoredFromCache = restoreDashboardCache();
    if (restoredFromCache) {
      render();
    }

    try {
      await loadChildren();
      await establishAccountScope();
      await loadBadgeCategories();
      if (!state.children.length) throw new Error('Honeycomb returned no children.');
      if (!state.children.some(c => String(c.ChildID) === state.selectedChildId)) {
        state.selectedChildId = String(state.children[0].ChildID);
      }
      const initialChildren = isPhoneLayout() && state.children.length > 2
        ? state.children.filter(child => String(child.ChildID) === state.selectedChildId)
        : state.children;
      await Promise.all(initialChildren.map(child => loadChild(String(child.ChildID), true)));
      const selectedForCache = String(state.selectedChildId);
      const remainingForCache = state.children
        .map(child => String(child.ChildID))
        .filter(childId => childId !== selectedForCache);
      void warmRecentPhotoCache([selectedForCache])
        .then(() => warmRecentPhotoCache(remainingForCache));
      startAutoRefresh();
      render();
    } catch (error) {
      if (restoredFromCache) {
        console.error('[Honeycomb dashboard refresh after cached load]', error);
        render();
      } else {
        renderError(error);
      }
    }
  }

  function ensureLauncher() {
    if (document.getElementById('hcfd2-launcher')) return;
    const launcher = document.createElement('button');
    launcher.id = 'hcfd2-launcher';
    launcher.type = 'button';
    launcher.innerHTML = '<span>⌂</span><strong>Family Dashboard</strong>';
    launcher.setAttribute('aria-label', 'Open Family Dashboard');
    launcher.title = 'Open Family Dashboard (H)';
    launcher.addEventListener('click', openDashboard);
    document.body.appendChild(launcher);
  }

  function closeDashboard() {
    state.overlayOpen = false;
    stopAutoRefresh();
    galleryHydrationToken += 1;
    clearGalleryObjectUrls();
    document.body.classList.remove('hcfd2-no-scroll');
    overlay?.remove();
    overlay = null;
    app = null;
    if (location.hash === '#family-dashboard') {
      history.replaceState(null, '', location.pathname + location.search);
    }
    ensureLauncher();
  }

  function createOverlay() {
    overlay = document.createElement('div');
    overlay.id = 'hcfd2-overlay';
    applyTheme();
    overlay.innerHTML = '<div id="hcfd2-app"><div class="hcfd2-loading"><div class="hcfd2-spinner"></div><p>Loading your family dashboard…</p></div></div>';
    overlay.addEventListener('click', event => {
      if (event.target === overlay) closeDashboard();
    });
    overlay.addEventListener('scroll', updateStickyChildContext, { passive: true });
    document.body.appendChild(overlay);
    app = overlay.querySelector('#hcfd2-app');
  }

  async function loadChildren() {
    const response = await fetch(API.children, { credentials: 'same-origin', headers: { Accept: 'application/json' } });
    if (!response.ok) throw new Error(`Children request failed (${response.status}).`);
    const json = await response.json();
    if (!json.Success) throw new Error(extractApiError(json, 'Could not load children.'));
    state.children = Array.isArray(json.Data) ? json.Data : [];
  }

  async function loadBadgeCategories() {
    try {
      const response = await fetch(API.badgeCategories, { credentials: 'same-origin', headers: { Accept: 'application/json' } });
      if (!response.ok) return;
      const json = await response.json();
      if (json.Success && Array.isArray(json.Data)) state.badgeCategories = json.Data;
    } catch (error) {
      console.warn('[Honeycomb badge categories]', error);
    }
  }

  async function loadChild(childId, reset = false) {
    const current = state.data.get(childId) || emptyChildData();
    const reportPage = reset ? 1 : current.reportPage;
    const momentPage = reset ? 1 : current.momentPage;

    const [reports, moments, badges] = await Promise.all([
      postJson(API.reports, { ChildID: childId, PageNumber: reportPage, PageSize: PAGE_SIZE }),
      postJson(API.moments, { ChildID: childId, PageNumber: momentPage, PageSize: PAGE_SIZE }),
      reset
        ? postJson(API.badges, { ChildID: childId, PageNumber: 1, PageSize: 25, ShowUnearned: false }).catch(() => ({ Data: [], Count: 0 }))
        : Promise.resolve({ Data: current.badges, Count: current.badgeCount }),
    ]);

    const newReports = flattenGroups(reports.Data);
    const newMoments = flattenGroups(moments.Data);

    let addedReports = [];
    let addedMoments = [];
    if (reset && current.loadedAt) {
      const knownReports = new Set(current.reports.map(item => String(item.DailyReportId)));
      const knownMoments = new Set(current.moments.map(item => String(item.DailyMomentId)));
      addedReports = newReports.filter(item => !knownReports.has(String(item.DailyReportId)));
      addedMoments = newMoments.filter(item => !knownMoments.has(String(item.DailyMomentId)));
      addedReports.forEach(item => state.newItemIds.add(`report:${item.DailyReportId}`));
      addedMoments.forEach(item => state.newItemIds.add(`photo:${item.DailyMomentId}`));
    }

    state.data.set(childId, {
      reports: dedupe([...current.reports, ...newReports], 'DailyReportId'),
      moments: dedupe([...current.moments, ...newMoments], 'DailyMomentId'),
      badges: Array.isArray(badges.Data) ? badges.Data : current.badges,
      reportCount: Number(reports.Count || current.reportCount || 0),
      momentCount: Number(moments.Count || current.momentCount || 0),
      badgeCount: Number(badges.Count || current.badgeCount || 0),
      reportPage: reset ? Math.max(2, current.reportPage) : reportPage + 1,
      momentPage: reset ? Math.max(2, current.momentPage) : momentPage + 1,
      loadedAt: new Date().toISOString(),
    });

    if (addedReports.length || addedMoments.length) {
      void notifyChildUpdates(childId, addedReports, addedMoments);
    }
  }

  function emptyChildData() {
    return {
      reports: [], moments: [], badges: [],
      reportCount: 0, momentCount: 0, badgeCount: 0,
      reportPage: 1, momentPage: 1, loadedAt: null,
    };
  }

  async function postJson(url, payload) {
    const response = await fetch(url, {
      method: 'POST',
      credentials: 'same-origin',
      headers: { Accept: 'application/json', 'Content-Type': 'application/json' },
      body: JSON.stringify(payload),
    });
    if (!response.ok) throw new Error(`${url} failed (${response.status}).`);
    const json = await response.json();
    if (!json.Success) throw new Error(extractApiError(json, `${url} returned an error.`));
    return json;
  }

  function extractApiError(json, fallback) {
    const details = Array.isArray(json?.Errors)
      ? json.Errors.map(error => typeof error === 'string' ? error : error?.Message || JSON.stringify(error)).filter(Boolean).join('; ')
      : '';
    return json?.Message || details || fallback;
  }

  function flattenGroups(groups) {
    if (!Array.isArray(groups)) return [];
    return groups.flatMap(group => Array.isArray(group?.Data)
      ? group.Data.map(item => ({ ...item, GroupDate: group.Date }))
      : []);
  }

  function dedupe(items, key) {
    const map = new Map();
    for (const item of items) map.set(String(item[key] ?? JSON.stringify(item)), item);
    return [...map.values()].sort((a, b) => itemTimestamp(b).localeCompare(itemTimestamp(a)));
  }

  function render() {
    const child = getSelectedChild();
    const data = getSelectedData();
    const hydrationToken = ++galleryHydrationToken;
    clearGalleryObjectUrls();
    app.innerHTML = `
      <section class="hcfd2-shell ${state.suppressViewAnimation ? 'hcfd2-no-enter' : ''}">
        ${renderHeader()}
        ${renderChildBar()}
        ${renderTabs()}
        ${renderStickyChildContext()}
        <main class="hcfd2-main ${state.tab === 'activity' && state.activityView === 'calendar' ? 'hcfd2-calendar-main' : ''}">${renderViewContext(child)}${state.tab !== 'home' && state.period === 'week' && !(state.tab === 'activity' && state.activityView === 'calendar') ? renderWeekNavigator() : ''}${renderTab(child, data)}</main>
      </section>
      ${state.childPickerOpen ? renderChildPickerSheet(viewingAllChildren()) : ''}
      ${renderViewer()}
      ${renderAvatarEditor()}
    `;
    bindEvents();
    void hydrateCachedGalleryOriginals(hydrationToken);
    state.suppressViewAnimation = false;
    requestAnimationFrame(updateStickyChildContext);
    markSeen(child, data);
    scheduleCacheSave();
    scheduleNewItemFade();
  }

  function renderHeader() {
    const totalNew = state.children.reduce((sum, child) => sum + unseenCount(String(child.ChildID)), 0);
    const updatedNames = state.children.filter(child => unseenCount(String(child.ChildID)) > 0).map(child => child.FirstName || fullName(child));
    const actions = isPhoneLayout()
      ? `<div class="hcfd2-mobile-menu-wrap">
          <button class="hcfd2-mobile-menu-toggle" data-action="menu" aria-label="Open dashboard menu" title="Menu" aria-expanded="${state.headerMenuOpen}" aria-controls="hcfd2-mobile-menu">☰</button>
          ${state.headerMenuOpen ? `<div class="hcfd2-mobile-menu" id="hcfd2-mobile-menu">
            <button data-action="refresh">↻ Refresh</button>
            <button data-action="auto">${state.autoRefresh ? '● Auto-refresh on' : '○ Auto-refresh off'}</button>
            ${nativeNotifications() ? `<button data-action="notifications">${state.notificationsEnabled ? '🔔 Notifications on' : '🔕 Enable notifications'}</button>` : ''}
            ${nativeNotifications() && state.notificationsEnabled ? '<button data-action="test-notification">Send test notification</button>' : ''}
            <label><span>Theme</span><select data-action="theme" aria-label="Theme">
              <option value="system" ${state.theme === 'system' ? 'selected' : ''}>⚙ System</option>
              <option value="time" ${state.theme === 'time' ? 'selected' : ''}>◷ Time of day</option>
              <option value="light" ${state.theme === 'light' ? 'selected' : ''}>☀ Light</option>
              <option value="dark" ${state.theme === 'dark' ? 'selected' : ''}>◐ Dark</option>
            </select></label>
            <label><span>Week begins</span><select data-week-start aria-label="First day of week"><option value="1" ${state.weekStartsOn === 1 ? 'selected' : ''}>Monday</option><option value="0" ${state.weekStartsOn === 0 ? 'selected' : ''}>Sunday</option></select></label>
            ${state.homeView === 'week' ? '<button data-action="print-week">Export weekly recap</button>' : ''}
          </div>` : ''}
        </div>`
      : `<div class="hcfd2-actions">
          <button data-action="refresh">↻ Refresh</button>
          <button data-action="auto">${state.autoRefresh ? '● Auto' : '○ Auto'}</button>
          <select data-action="theme" aria-label="Theme" title="Choose dashboard theme">
            <option value="system" ${state.theme === 'system' ? 'selected' : ''}>⚙ System</option>
            <option value="time" ${state.theme === 'time' ? 'selected' : ''}>◷ Time of day</option>
            <option value="light" ${state.theme === 'light' ? 'selected' : ''}>☀ Light</option>
            <option value="dark" ${state.theme === 'dark' ? 'selected' : ''}>◐ Dark</option>
          </select>
          <button class="hcfd2-close" data-action="close">×</button>
        </div>`;
    return `
      <header class="hcfd2-header">
        <div>
          <div class="hcfd2-kicker">Honeycomb Family Dashboard</div>
          <h1>${html(familyHeading())}</h1>
          <p>${totalNew ? `${totalNew} new item${totalNew === 1 ? '' : 's'} for ${html(updatedNames.join(' and '))}` : 'Everything is up to date'}</p>
        </div>
        ${actions}
      </header>`;
  }

  function renderChildBar() {
    if (state.children.length <= 1) return '';
    if (isPhoneLayout() && state.children.length > 2) {
      const allSelected = state.tab === 'activity' && activityScope() === 'both';
      const child = getSelectedChild();
      return `<section class="hcfd2-child-picker-wrap"><button class="hcfd2-child-picker-button" data-child-picker-open aria-haspopup="dialog" aria-expanded="${state.childPickerOpen}">${allSelected ? '<span class="hcfd2-family-icon">👨‍👩‍👧‍👦</span>' : renderChildAvatar(child, false, false)}<span><strong>${allSelected ? 'Everyone' : html(fullName(child))}</strong>${allSelected ? '<small>Combined family view</small>' : `<small>${Number(child.LearningDaysCount || 0)} learning days</small>`}</span><b>⌄</b></button></section>`;
    }
    return `<nav class="hcfd2-children">${state.children.map(child => {
      const id = String(child.ChildID);
      const active = id === state.selectedChildId && !(state.tab === 'activity' && activityScope() === 'both');
      return `<button class="${active ? 'active' : ''}" data-child="${attr(id)}">
        ${renderChildAvatar(child)}
        <span><strong>${html(fullName(child))}</strong><small>${Number(child.LearningDaysCount || 0)} learning days${unseenCount(id) ? ` · ${unseenCount(id)} new` : ''}</small></span>
      </button>`;
    }).join('')}</nav>`;
  }

  function renderChildPickerSheet(allSelected = false) {
    const supportsAll = state.tab === 'activity';
    return `<div class="hcfd2-child-picker-backdrop" data-child-picker-backdrop><section class="hcfd2-child-picker-sheet" role="dialog" aria-modal="true" aria-labelledby="hcfd2-child-picker-title"><div class="hcfd2-sheet-handle"></div><header><h2 id="hcfd2-child-picker-title">Choose a child</h2><button data-child-picker-close aria-label="Close">×</button></header><div>${state.children.map(child => {
      const id = String(child.ChildID);
      return `<button class="${!allSelected && id === state.selectedChildId ? 'active' : ''}" data-child="${attr(id)}">${renderChildAvatar(child, false, false)}<span><strong>${html(fullName(child))}</strong><small>${Number(child.LearningDaysCount || 0)} learning days</small></span><b>${!allSelected && id === state.selectedChildId ? '✓' : ''}</b></button>`;
    }).join('')}${supportsAll ? `<button class="${allSelected ? 'active' : ''}" data-child-all><span class="hcfd2-family-icon">👨‍👩‍👧‍👦</span><span><strong>Everyone</strong><small>Combine activity in this view</small></span><b>${allSelected ? '✓' : ''}</b></button>` : ''}</div></section></div>`;
  }

  function viewingAllChildren() {
    return state.tab === 'activity' && activityScope() === 'both';
  }

  function renderStickyChildContext() {
    if (!isPhoneLayout()) return '';
    const allSelected = viewingAllChildren();
    const child = getSelectedChild();
    const content = `${allSelected ? '<span class="hcfd2-family-icon">👨‍👩‍👧‍👦</span>' : renderChildAvatar(child, false, false)}<strong>${allSelected ? 'Everyone' : html(child?.FirstName || fullName(child))}</strong>${state.children.length > 1 ? '<b>⌄</b>' : ''}`;
    return state.children.length > 1
      ? `<button class="hcfd2-sticky-child" data-child-picker-open aria-label="Change child">${content}</button>`
      : `<div class="hcfd2-sticky-child" aria-label="Currently viewing ${attr(fullName(child))}">${content}</div>`;
  }

  function renderTabs() {
    const tabs = [
      ['home', 'Today'], ['activity', 'Activity'], ['photos', 'Photos'],
      ['favorites', 'Favorites'], ['stats', 'Stats'], ['badges', 'Badges'],
    ];
    if (isPhoneLayout()) {
      const primary = [
        ['home', '⌂', 'Today'],
        ['activity', '☷', 'Activity'],
        ['photos', '▧', 'Photos'],
        ['stats', '▥', 'Insights'],
      ];
      const secondaryActive = ['favorites', 'badges'].includes(state.tab);
      return `<nav class="hcfd2-bottom-nav" aria-label="Primary navigation">${primary.map(([id, icon, label]) => `<button class="${state.tab === id ? 'active' : ''}" data-tab="${id}"><span aria-hidden="true">${icon}</span><small>${label}</small></button>`).join('')}<button class="${secondaryActive ? 'active' : ''}" data-mobile-more aria-expanded="${state.mobileMoreOpen}"><span aria-hidden="true">•••</span><small>More</small></button></nav>${state.mobileMoreOpen ? `<div class="hcfd2-more-backdrop" data-mobile-more-backdrop><section class="hcfd2-more-sheet" role="dialog" aria-modal="true" aria-labelledby="hcfd2-more-title"><div class="hcfd2-sheet-handle"></div><header><h2 id="hcfd2-more-title">More</h2><button data-mobile-more-close aria-label="Close">×</button></header><div><button class="${state.tab === 'favorites' ? 'active' : ''}" data-tab="favorites"><span>★</span><strong>Favorites</strong><small>Saved photos</small></button><button class="${state.tab === 'badges' ? 'active' : ''}" data-tab="badges"><span>🏅</span><strong>Badges</strong><small>Achievements</small></button></div></section></div>` : ''}`;
    }
    return `<nav class="hcfd2-tabs">${tabs.map(([id, label]) => `<button class="${state.tab === id ? 'active' : ''}" data-tab="${id}">${label}</button>`).join('')}</nav>`;
  }

  function renderTab(child, data) {
    switch (state.tab) {
      case 'activity': return renderActivity(child, data);
      case 'photos': return renderPhotos(child, data, false);
      case 'favorites': return renderPhotos(child, data, true);
      case 'stats': return renderStats(child, data);
      case 'badges': return renderBadges(child, data);
      default: return renderHome();
    }
  }

  function renderViewContext(child) {
    if (state.tab === 'home' || !child || (isPhoneLayout() && ['activity', 'photos', 'favorites', 'stats', 'badges'].includes(state.tab))) return '';

    const viewingBoth = state.tab === 'activity' && activityScope() === 'both';
    const tabName = ({
      activity: 'Activity', photos: 'Photos', favorites: 'Favorites', stats: 'Statistics', badges: 'Badges',
    })[state.tab] || 'Dashboard';

    if (viewingBoth) {
      return `<section class="hcfd2-view-context both" aria-label="Currently viewing all children">
        <div class="hcfd2-context-icon">👨‍👩‍👧‍👦</div>
        <div><span>Currently viewing</span><strong>Everyone · ${html(tabName)}</strong></div>
      </section>`;
    }

    return `<section class="hcfd2-view-context" aria-label="Currently viewing ${attr(fullName(child))}">
      ${renderChildAvatar(child, false, false)}
      <div><span>Currently viewing</span><strong>${html(fullName(child))} · ${html(tabName)}</strong></div>
    </section>`;
  }

  function renderHome() {
    const weekly = state.homeView === 'week';
    return `${renderSupplyAlerts()}<div data-home-child-swipe>${renderHomeViewToggle()}${weekly ? `${renderWeekNavigator()}${renderWeeklySummary()}` : ''}<section class="hcfd2-home-grid">${childrenForHome().map(child => {
      const id = String(child.ChildID);
      const data = state.data.get(id) || emptyChildData();
      const today = todayKey();
      const childMoments = visiblePhotosForChild(data.moments, id);
      const visiblePhotos = weekly
        ? filterSelectedWeek(childMoments)
        : childMoments.filter(item => dayKey(item) === today);
      const visibleReports = weekly
        ? filterSelectedWeek(data.reports)
        : data.reports.filter(item => dayKey(item) === today);
      const timeline = (weekly
        ? filterSelectedWeek(mergedTimeline(data, child))
        : mergedTimeline(data, child).filter(item => String(item.timestamp).slice(0, 10) === today)).slice(0, 6);
      const rangeLabel = weekly ? 'this week' : 'today';
      return `<article class="hcfd2-home-card">
        <div class="hcfd2-card-head">${renderChildAvatar(child, true)}<div><h2>${html(fullName(child))}</h2><p>${unseenCount(id) ? `${unseenCount(id)} new items` : 'No unseen updates'}</p></div><button data-open-child="${attr(id)}">Open</button></div>
        <div class="hcfd2-metrics four">
          <button data-open="${attr(id)}:photos"><strong>${visiblePhotos.length}</strong><span>photos ${rangeLabel}</span></button>
          <button data-open="${attr(id)}:reports"><strong>${visibleReports.length}</strong><span>reports ${rangeLabel}</span></button>
          <button data-open="${attr(id)}:favorites"><strong>${favoriteMoments(childMoments).length}</strong><span>favorites</span></button>
          <button data-open="${attr(id)}:badges"><strong>${data.badges.length || data.badgeCount || Number(child.BadgeCount || 0)}</strong><span>badges</span></button>
        </div>
        <div class="hcfd2-section-title"><h3>${weekly ? 'Photos this week' : 'Latest photos'}</h3><button data-open="${attr(id)}:photos">View all</button></div>
        ${visiblePhotos.length ? `<div class="hcfd2-photo-strip">${visiblePhotos.slice(0, 6).map(photoTile).join('')}</div>` : `<p class="hcfd2-empty">No photos ${weekly ? 'during this week' : 'today'}.</p>`}
        <div class="hcfd2-section-title"><h3>${weekly ? 'Activity this week' : 'Recent activity'}</h3><button data-open="${attr(id)}:activity">View activity</button></div>
        <div class="hcfd2-mini-timeline">${timeline.length ? timeline.map(renderMiniTimeline).join('') : `<p class="hcfd2-empty">No activity ${weekly ? 'during this week' : 'yet today'}.</p>`}</div>
      </article>`;
    }).join('')}</section></div>`;
  }

  function renderSupplyAlerts() {
    const acknowledged = new Set(readJson(STORAGE.acknowledgedSupplies, []).map(String));
    const cutoffKey = recentBusinessDayCutoffKey(5);
    const alerts = childrenForHome().flatMap(child => {
      const childId = String(child.ChildID);
      const data = state.data.get(childId) || emptyChildData();
      return data.reports
        .filter(report => reportType(report) === 'supplies'
          && dayKey(report) >= cutoffKey
          && !acknowledged.has(supplyAlertKey(report)))
        .map(report => ({ child, report }));
    }).sort((a, b) => itemTimestamp(b.report).localeCompare(itemTimestamp(a.report)));

    if (!alerts.length) {
      state.supplyAlertsOpen = false;
      return '';
    }
    const alertDetails = `<div>${alerts.map(({ child, report }) => {
      const detailKey = `${report.DailyReportId ?? ''}:${child.ChildID}`;
      const alertReport = { ...report, ...(reportDetailCache.get(detailKey) || {}) };
      const comments = reportComments(alertReport);
      return `<article>
      <div class="hcfd2-supply-icon">🧺</div>
      <div><strong>${html(child.FirstName || fullName(child))}: ${html(reportTitle(report))} ${reportNoteBadge(report)}</strong>${report.ChildCondition ? `<span>${html(report.ChildCondition)}</span>` : ''}<small><b>${html(supplyAlertAge(report))}</b> · ${html(longDateTime(itemTimestamp(report)))}</small></div>
      <button data-ack-supply="${attr(supplyAlertKey(report))}">✓ Mark seen</button>
      ${reportHasNote(alertReport) ? `<details class="hcfd2-alert-note" data-report-detail="${attr(detailKey)}"><summary>📝 View note</summary><div class="hcfd2-report-comments"><strong>Comments</strong><span>${html(comments || 'Open to load this report’s note…')}</span></div></details>` : ''}
    </article>`;
    }).join('')}</div>`;

    if (isPhoneLayout()) {
      return `<button class="hcfd2-supply-summary" data-supply-alerts-open aria-haspopup="dialog">
        <span class="hcfd2-supply-icon">🧺</span>
        <span><strong>Supplies needed</strong><small>${alerts.length} unacknowledged alert${alerts.length === 1 ? '' : 's'}</small></span>
        <span aria-hidden="true">›</span>
      </button>${state.supplyAlertsOpen ? `<div class="hcfd2-supply-sheet-backdrop" data-supply-alerts-backdrop>
        <section class="hcfd2-supply-sheet hcfd2-supply-alerts" role="dialog" aria-modal="true" aria-labelledby="hcfd2-supply-sheet-title">
          <div class="hcfd2-sheet-handle" aria-hidden="true"></div>
          <header><div><span>Past 5 business days</span><h2 id="hcfd2-supply-sheet-title">Supplies needed</h2></div><button class="hcfd2-sheet-close" data-supply-alerts-close aria-label="Close alerts">×</button></header>
          ${alertDetails}
        </section>
      </div>` : ''}`;
    }

    return `<section class="hcfd2-supply-alerts" aria-label="Supplies needed">
      <header><div><span>Past 5 business days</span><h2>Supplies needed</h2></div><strong>${alerts.length} unacknowledged</strong></header>
      ${alertDetails}
    </section>`;
  }

  function supplyAlertKey(report) {
    return String(report.DailyReportId ?? `${itemTimestamp(report)}:${reportTitle(report)}`);
  }

  function supplyAlertAge(report) {
    const timestamp = new Date(itemTimestamp(report));
    if (Number.isNaN(timestamp.getTime())) return 'Recently';
    const now = new Date();
    const elapsedMs = Math.max(0, now.getTime() - timestamp.getTime());
    const minutes = Math.floor(elapsedMs / 60000);
    const reportDay = startDay(timestamp);
    const today = startDay(now);
    const calendarDays = Math.round((today.getTime() - reportDay.getTime()) / 86400000);
    if (calendarDays === 0) {
      if (minutes < 2) return 'Just now';
      if (minutes < 60) return `${minutes} minutes ago`;
      const hours = Math.floor(minutes / 60);
      return `${hours} hour${hours === 1 ? '' : 's'} ago`;
    }
    if (calendarDays === 1) return 'Yesterday';
    return `${calendarDays} days ago`;
  }

  function recentBusinessDayCutoffKey(numberOfDays) {
    const date = startDay(new Date());
    let businessDays = 0;
    while (businessDays < numberOfDays) {
      const weekday = date.getDay();
      if (weekday !== 0 && weekday !== 6) businessDays += 1;
      if (businessDays < numberOfDays) date.setDate(date.getDate() - 1);
    }
    return localDayKey(date);
  }

  function acknowledgeSupplyAlert(key) {
    const acknowledged = new Set(readJson(STORAGE.acknowledgedSupplies, []).map(String));
    acknowledged.add(String(key));
    localStorage.setItem(STORAGE.acknowledgedSupplies, JSON.stringify([...acknowledged]));
    render();
  }

  function renderHomeViewToggle() {
    return `<section class="hcfd2-home-view-bar">
      <div><span>Dashboard view</span><strong>${state.homeView === 'week' ? 'Weekly overview' : 'Today’s activity'}</strong></div>
      <div class="hcfd2-view-switch" role="group" aria-label="Dashboard view">
        <button class="${state.homeView === 'day' ? 'active' : ''}" data-home-view="day">Today</button>
        <button class="${state.homeView === 'week' ? 'active' : ''}" data-home-view="week">Week</button>
      </div>
    </section>`;
  }

  function renderWeekNavigator() {
    const { start, end } = selectedWeekRange();
    if (isPhoneLayout()) {
      const currentWeek = localDayKey(start) === localDayKey(weekRangeForDate(new Date()).start);
      return `<section class="hcfd2-week-nav-mobile" aria-label="Week navigation">
        <button data-week-action="previous" aria-label="Previous week">‹</button>
        <label class="hcfd2-week-date-button">
          <strong>${currentWeek ? 'This week' : html(formatWeekLabel(start, end))}</strong>
          <small>${html(formatCompactWeekRange(start, end))}</small>
          <input type="date" data-week-picker value="${attr(localDayKey(start))}" max="${attr(todayKey())}" aria-label="Pick a week">
        </label>
        <button data-week-action="next" aria-label="Next week" ${localDayKey(start) >= localDayKey(weekRangeForDate(new Date()).start) ? 'disabled' : ''}>›</button>
      </section>`;
    }
    const startName = state.weekStartsOn === 1 ? 'Monday' : 'Sunday';
    const endName = state.weekStartsOn === 1 ? 'Sunday' : 'Saturday';
    return `<section class="hcfd2-week-nav" aria-label="Week navigation">
      <div class="hcfd2-week-stepper">
        <button data-week-action="previous" aria-label="Previous week">‹ Previous</button>
        <button data-week-action="today">This week</button>
        <button data-week-action="next" aria-label="Next week" ${localDayKey(start) >= localDayKey(weekRangeForDate(new Date()).start) ? 'disabled' : ''}>Next ›</button>
      </div>
      <div class="hcfd2-week-heading">
        <span>Selected week</span>
        <h2>${html(formatWeekLabel(start, end))}</h2>
        <small>${html(startName)}–${html(endName)}</small>
      </div>
      <div class="hcfd2-week-options">
        <label><span>Pick a date</span><input type="date" data-week-picker value="${attr(localDayKey(start))}" max="${attr(todayKey())}"></label>
        <label><span>Week begins</span><select data-week-start><option value="1" ${state.weekStartsOn === 1 ? 'selected' : ''}>Monday</option><option value="0" ${state.weekStartsOn === 0 ? 'selected' : ''}>Sunday</option></select></label>
      </div>
    </section>`;
  }

  function renderWeeklySummary() {
    if (isPhoneLayout()) return renderMobileWeeklySummary();
    const { start } = selectedWeekRange();
    return `<section class="hcfd2-week-summary">
      <div class="hcfd2-week-summary-head"><div><span>Weekly summary</span><h2>Week of ${html(formatMonthDay(start))}</h2></div><div class="hcfd2-week-summary-actions"><small>Based on loaded Honeycomb history</small><button data-action="print-week">Print / Save PDF</button></div></div>
      ${renderWeeklyComparison()}
      <div class="hcfd2-week-summary-grid">${childrenForHome().map(child => {
        const data = state.data.get(String(child.ChildID)) || emptyChildData();
        const moments = filterSelectedWeek(data.moments);
        const reports = filterSelectedWeek(data.reports);
        const types = reports.reduce((counts, report) => {
          const type = reportType(report);
          counts[type] = (counts[type] || 0) + 1;
          return counts;
        }, {});
        const details = [
          ['📷', moments.length, 'photos'], ['📋', reports.length, 'reports'],
          ['🚽', types.potty || 0, 'potty entries'], ['🍴', types.meal || 0, 'meals'],
          ['😴', types.nap || 0, 'naps'], ['🍼', types.bottle || 0, 'bottles'],
        ];
        return `<article><div class="hcfd2-week-child">${renderChildAvatar(child)}<h3>${html(fullName(child))}</h3></div><div class="hcfd2-week-counts">${details.map(([icon, count, label]) => `<div><span>${icon}</span><strong>${count}</strong><small>${label}</small></div>`).join('')}</div></article>`;
      }).join('')}</div>
      ${renderWeeklyDailyBreakdown()}
      ${renderWeeklyFavoritePhotos()}
    </section>`;
  }

  function renderMobileWeeklySummary() {
    const child = getSelectedChild();
    const data = getSelectedData();
    const moments = filterSelectedWeek(data.moments);
    const reports = filterSelectedWeek(data.reports);
    const types = reports.reduce((counts, report) => {
      const type = reportType(report);
      counts[type] = (counts[type] || 0) + 1;
      return counts;
    }, {});
    const metrics = [
      ['📷', moments.length, 'Photos'],
      ['📋', reports.length, 'Reports'],
      ['🍴', types.meal || 0, 'Meals'],
      ['🚽', types.potty || 0, 'Potty'],
      ['😴', types.nap || 0, 'Naps'],
    ];
    const favorites = filterSelectedWeek(favoriteMoments(data.moments)).slice(0, 3);
    return `<section class="hcfd2-week-summary hcfd2-week-summary-mobile">
      <header class="hcfd2-mobile-week-title">${renderChildAvatar(child, false, false)}<div><span>Weekly recap</span><h2>${html(child.FirstName || fullName(child))}</h2></div><small title="Based on loaded Honeycomb history">ⓘ</small></header>
      <div class="hcfd2-mobile-week-metrics">${metrics.map(([icon, count, label]) => `<div><span>${icon}</span><strong>${count}</strong><small>${label}</small></div>`).join('')}</div>
      ${renderMobileWeeklyDays(data)}
      ${state.children.length > 1 ? `<details class="hcfd2-mobile-week-section"><summary><span>Compare children</span><small>Side-by-side totals</small><b>⌄</b></summary>${renderWeeklyComparison()}</details>` : ''}
      <details class="hcfd2-mobile-week-section"><summary><span>Favorite photos</span><small>${favorites.length ? `${favorites.length} from this week` : 'None this week'}</small><b>⌄</b></summary>${favorites.length ? `<div class="hcfd2-mobile-week-photos">${favorites.map(photoTile).join('')}</div>` : '<p class="hcfd2-empty">No favorite photos this week.</p>'}</details>
    </section>`;
  }

  function renderMobileWeeklyDays(data) {
    const { start } = selectedWeekRange();
    const rows = Array.from({ length: 7 }, (_, index) => {
      const date = new Date(start);
      date.setDate(date.getDate() + index);
      const key = localDayKey(date);
      const photos = data.moments.filter(item => dayKey(item) === key).length;
      const reports = data.reports.filter(item => dayKey(item) === key).length;
      const isToday = key === todayKey();
      return `<button data-week-day="${attr(key)}"><span><strong>${html(new Intl.DateTimeFormat(undefined, { weekday: 'short' }).format(date))}</strong><small>${html(new Intl.DateTimeFormat(undefined, { month: 'short', day: 'numeric' }).format(date))}${isToday ? ' · Today' : ''}</small></span><span>📷 ${photos} &nbsp; 📋 ${reports}</span><b>›</b></button>`;
    });
    return `<section class="hcfd2-mobile-week-days"><h3>Daily activity</h3>${rows.join('')}</section>`;
  }

  function renderWeeklyDailyBreakdown() {
    const { start } = selectedWeekRange();
    const days = Array.from({ length: 7 }, (_, index) => {
      const date = new Date(start);
      date.setDate(date.getDate() + index);
      return date;
    });
    const children = childrenForHome();
    return `<section class="hcfd2-week-detail"><h3>Daily breakdown</h3><div class="hcfd2-week-comparison-scroll"><table><thead><tr><th>Day</th>${children.map(child => `<th>${html(child.FirstName || fullName(child))}</th>`).join('')}</tr></thead><tbody>${days.map(date => {
      const key = localDayKey(date);
      return `<tr><th>${html(new Intl.DateTimeFormat(undefined, { weekday: 'short', month: 'short', day: 'numeric' }).format(date))}</th>${children.map(child => {
        const data = state.data.get(String(child.ChildID)) || emptyChildData();
        const photos = data.moments.filter(item => dayKey(item) === key).length;
        const reports = data.reports.filter(item => dayKey(item) === key).length;
        return `<td>📷 ${photos} &nbsp; 📋 ${reports}</td>`;
      }).join('')}</tr>`;
    }).join('')}</tbody></table></div></section>`;
  }

  function renderWeeklyFavoritePhotos() {
    const groups = childrenForHome().map(child => {
      const data = state.data.get(String(child.ChildID)) || emptyChildData();
      const favorites = filterSelectedWeek(favoriteMoments(data.moments)).slice(0, 6);
      if (!favorites.length) return '';
      return `<article><h3>${html(child.FirstName || fullName(child))}’s favorite photos</h3><div>${favorites.map(moment => `<img src="${attr(imageUrl(moment.Filename, 'moment-image-thumb'))}" alt="${attr(photoTitle(moment))}">`).join('')}</div></article>`;
    }).filter(Boolean);
    return groups.length ? `<section class="hcfd2-week-favorites">${groups.join('')}</section>` : '';
  }

  function renderWeeklyComparison() {
    const { start, end } = selectedWeekRange();
    const previousStart = new Date(start);
    previousStart.setDate(previousStart.getDate() - 7);
    const previousEnd = new Date(end);
    previousEnd.setDate(previousEnd.getDate() - 7);
    const children = childrenForHome();
    const metrics = children.map(child => weekMetricsForChild(child, start, end));
    const previousMetrics = children.map(child => weekMetricsForChild(child, previousStart, previousEnd));
    const rows = [
      ['Photos', 'photos'],
      ['Reports', 'reports'],
      ['Meals', 'meals'],
      ['Potty', 'potty'],
      ['Naps', 'naps'],
    ];
    return `<div class="hcfd2-week-comparison">
      <div class="hcfd2-week-comparison-title"><span>Compare children</span><strong>Side-by-side activity</strong></div>
      <div class="hcfd2-week-comparison-scroll"><table>
        <thead><tr><th scope="col">Activity</th>${children.map(child => `<th scope="col">${html(child.FirstName || fullName(child))}</th>`).join('')}</tr></thead>
        <tbody>${rows.map(([label, key]) => `<tr><th scope="row">${html(label)}</th>${metrics.map((values, index) => {
          const delta = values[key] - previousMetrics[index][key];
          return `<td><strong>${values[key]}</strong><small class="hcfd2-week-delta ${delta > 0 ? 'up' : delta < 0 ? 'down' : ''}">${delta > 0 ? '+' : ''}${delta} vs prior week</small></td>`;
        }).join('')}</tr>`).join('')}</tbody>
      </table></div>
    </div>`;
  }

  function weekMetricsForChild(child, start, end) {
    const data = state.data.get(String(child.ChildID)) || emptyChildData();
    const reports = filterDateRange(data.reports, start, end);
    const types = reports.reduce((counts, report) => {
      const type = reportType(report);
      counts[type] = (counts[type] || 0) + 1;
      return counts;
    }, {});
    return {
      photos: filterDateRange(data.moments, start, end).length,
      reports: reports.length,
      meals: types.meal || 0,
      potty: types.potty || 0,
      naps: types.nap || 0,
    };
  }

  function filterDateRange(items, start, end) {
    const startKey = localDayKey(start);
    const endKey = localDayKey(end);
    return items.filter(item => {
      const key = dayKey(item) || String(item?.timestamp || '').slice(0, 10);
      return key >= startKey && key <= endKey;
    });
  }

  function activityScope() {
    return state.activityView === 'calendar' ? validCalendarScope() : validTimelineScope();
  }

  function renderActivity(child, data) {
    const content = state.activityView === 'calendar'
      ? renderCalendar(child, data)
      : renderTimeline(child, data);
    return `<section class="hcfd2-activity-switch" role="group" aria-label="Activity view"><button class="${state.activityView === 'agenda' ? 'active' : ''}" data-activity-view="agenda">☷ Agenda</button><button class="${state.activityView === 'calendar' ? 'active' : ''}" data-activity-view="calendar">□ Calendar</button></section>${content}`;
  }

  function renderCalendar(child, data) {
    if (isPhoneLayout()) return renderMobileCalendar(child, data);
    const scope = validCalendarScope();
    const combined = scope === 'both';
    const calendarData = combined
      ? state.children.reduce((all, item) => {
          const childData = state.data.get(String(item.ChildID)) || emptyChildData();
          all.moments.push(...visiblePhotosForChild(childData.moments, item.ChildID));
          all.reports.push(...childData.reports);
          return all;
        }, emptyChildData())
      : { ...(state.data.get(scope) || data), moments: visiblePhotosForChild((state.data.get(scope) || data).moments, scope) };
    const monthStart = parseLocalDay(`${state.calendarMonth}-01`) || startDay(new Date());
    const monthEnd = new Date(monthStart.getFullYear(), monthStart.getMonth() + 1, 0);
    const firstCell = new Date(monthStart);
    firstCell.setDate(firstCell.getDate() - firstCell.getDay());
    const lastCell = new Date(monthEnd);
    lastCell.setDate(lastCell.getDate() + (6 - lastCell.getDay()));

    const photoCounts = countItemsByDay(calendarData.moments);
    const reportCounts = countItemsByDay(calendarData.reports);
    const monthKey = state.calendarMonth;
    const monthPhotos = calendarData.moments.filter(item => dayKey(item).startsWith(monthKey)).length;
    const monthReports = calendarData.reports.filter(item => dayKey(item).startsWith(monthKey)).length;
    const cells = [];
    for (const date = new Date(firstCell); date <= lastCell; date.setDate(date.getDate() + 1)) {
      const key = localDayKey(date);
      const inMonth = date.getMonth() === monthStart.getMonth();
      const photos = photoCounts.get(key) || 0;
      const reports = reportCounts.get(key) || 0;
      const isFuture = key > todayKey();
      cells.push(`<button class="hcfd2-calendar-day ${inMonth ? '' : 'outside'} ${key === todayKey() ? 'today' : ''} ${key === state.calendarSelectedDate ? 'selected' : ''}" data-calendar-day="${attr(key)}" ${isFuture ? 'disabled' : ''} ${inMonth ? '' : 'tabindex="-1"'}>
        <span>${date.getDate()}</span>
        <div>${photos ? `<small>📷 <strong>${photos}</strong></small>` : ''}${reports ? `<small>📄 <strong>${reports}</strong></small>` : ''}</div>
      </button>`);
    }

    return `<section class="hcfd2-calendar">
      <header class="hcfd2-calendar-head">
        <div><span>Calendar</span><h2>${html(new Intl.DateTimeFormat(undefined, { month: 'long', year: 'numeric' }).format(monthStart))}</h2><small>${combined ? 'Everyone' : html(fullName(child))} · 📷 ${monthPhotos} photos · 📄 ${monthReports} reports</small></div>
        <div class="hcfd2-calendar-controls">
          <button data-calendar-action="previous" aria-label="Previous month">‹ Previous</button>
          <button data-calendar-action="today">This month</button>
          <button data-calendar-action="next" aria-label="Next month" ${state.calendarMonth >= todayKey().slice(0, 7) ? 'disabled' : ''}>Next ›</button>
          <label><span>Choose month</span><input type="month" data-calendar-picker value="${attr(state.calendarMonth)}" max="${attr(todayKey().slice(0, 7))}"></label>
        </div>
      </header>
      ${renderCalendarScope(scope)}
      <div class="hcfd2-calendar-weekdays">${['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'].map(day => `<span>${day}</span>`).join('')}</div>
      <div class="hcfd2-calendar-grid">${cells.join('')}</div>
      <p class="hcfd2-calendar-note">📷 Photos &nbsp; 📄 Reports · Select a date to view that day without leaving the calendar.</p>
    </section>${renderCalendarDayPanel(calendarData, combined)}`;
  }

  function renderMobileCalendar(child, data) {
    const scope = validCalendarScope();
    const combined = scope === 'both';
    const calendarData = combined
      ? state.children.reduce((all, item) => {
          const childData = state.data.get(String(item.ChildID)) || emptyChildData();
          all.moments.push(...visiblePhotosForChild(childData.moments, item.ChildID));
          all.reports.push(...childData.reports);
          return all;
        }, emptyChildData())
      : { ...(state.data.get(scope) || data), moments: visiblePhotosForChild((state.data.get(scope) || data).moments, scope) };
    let selected = parseLocalDay(state.calendarSelectedDate) || startDay(new Date());
    if (selected > new Date()) selected = startDay(new Date());
    const selectedKey = localDayKey(selected);
    state.calendarSelectedDate = selectedKey;
    const { start } = weekRangeForDate(selected);
    const days = Array.from({ length: 7 }, (_, index) => {
      const date = new Date(start);
      date.setDate(date.getDate() + index);
      return date;
    });
    const activityCounts = countItemsByDay([...calendarData.moments, ...calendarData.reports]);
    const items = (combined
      ? state.children.flatMap(owner => mergedTimeline(state.data.get(String(owner.ChildID)) || emptyChildData(), owner))
      : mergedTimeline(calendarData, child))
      .filter(item => String(item.timestamp).slice(0, 10) === selectedKey)
      .sort((a, b) => b.timestamp.localeCompare(a.timestamp));
    const currentWeekStart = weekRangeForDate(new Date()).start;
    return `<section class="hcfd2-agenda-calendar" data-calendar-swipe>
      <header><label class="hcfd2-agenda-date-picker"><strong>${html(new Intl.DateTimeFormat(undefined, { month: 'long', year: 'numeric' }).format(selected))}</strong><span>⌄</span><input type="date" data-calendar-date-picker value="${attr(selectedKey)}" max="${attr(todayKey())}" aria-label="Choose a date"></label><button data-calendar-agenda-today ${selectedKey === todayKey() ? 'disabled' : ''}>Today</button></header>
      ${state.children.length > 1 ? renderCalendarScope(scope) : ''}
      <div class="hcfd2-agenda-week"><button data-calendar-week-action="previous" aria-label="Previous week">‹</button><div>${days.map(date => {
        const key = localDayKey(date);
        const count = activityCounts.get(key) || 0;
        const future = key > todayKey();
        return `<button class="${key === selectedKey ? 'active' : ''} ${key === todayKey() ? 'today' : ''}" data-calendar-agenda-day="${attr(key)}" ${future ? 'disabled' : ''}><small>${html(new Intl.DateTimeFormat(undefined, { weekday: 'narrow' }).format(date))}</small><strong>${date.getDate()}</strong><span>${count ? '•'.repeat(Math.min(3, count)) : ''}</span></button>`;
      }).join('')}</div><button data-calendar-week-action="next" aria-label="Next week" ${start >= currentWeekStart ? 'disabled' : ''}>›</button></div>
      <section class="hcfd2-agenda-list"><h2>${html(new Intl.DateTimeFormat(undefined, { weekday: 'long', month: 'long', day: 'numeric' }).format(selected))}</h2>${items.length ? items.map(item => renderMobileTimelineItem(item, combined)).join('') : `<div class="hcfd2-empty">${html(emptyCalendarDayMessage(selected))}</div>`}</section>
    </section>`;
  }

  function validCalendarScope() {
    if (state.calendarScope === 'both' && state.children.length > 1) return 'both';
    if (state.children.some(child => String(child.ChildID) === state.calendarScope)) return state.calendarScope;
    return state.selectedChildId;
  }

  function renderCalendarScope(scope) {
    return `<div class="hcfd2-calendar-scope" role="group" aria-label="Calendar child">${state.children.map(child => {
      const id = String(child.ChildID);
      return `<button class="${scope === id ? 'active' : ''}" data-calendar-scope="${attr(id)}">${renderChildAvatar(child, false, false)}<span>${html(child.FirstName || fullName(child))}</span></button>`;
    }).join('')}${state.children.length > 1 ? `<button class="${scope === 'both' ? 'active' : ''}" data-calendar-scope="both"><span class="hcfd2-family-icon">👨‍👩‍👧‍👦</span><span>Everyone</span></button>` : ''}</div>`;
  }

  function renderCalendarDayPanel(data, combined = false) {
    if (!state.calendarSelectedDate) return '';
    const child = getSelectedChild();
    const items = (combined
      ? state.children.flatMap(owner => mergedTimeline(state.data.get(String(owner.ChildID)) || emptyChildData(), owner))
      : mergedTimeline(data, child))
      .filter(item => String(item.timestamp).slice(0, 10) === state.calendarSelectedDate)
      .sort((a, b) => b.timestamp.localeCompare(a.timestamp));
    return `<div class="hcfd2-calendar-modal" data-calendar-modal>
      <section class="hcfd2-calendar-detail" role="dialog" aria-modal="true" aria-labelledby="hcfd2-calendar-detail-title" tabindex="-1">
        <header>
          <button class="prev" data-calendar-day-step="-1" aria-label="Previous day">‹</button>
          <div><span>Selected day</span><h3 id="hcfd2-calendar-detail-title">${html(formatDay(state.calendarSelectedDate))}</h3><div class="hcfd2-calendar-detail-child">${combined ? '<span class="hcfd2-family-icon">👨‍👩‍👧‍👦</span><strong>Everyone</strong>' : `${renderChildAvatar(child, false, false)}<strong>${html(fullName(child))}</strong>`}<small>${items.length} item${items.length === 1 ? '' : 's'}</small></div></div>
          <button class="next" data-calendar-day-step="1" aria-label="Next day" ${state.calendarSelectedDate >= todayKey() ? 'disabled' : ''}>›</button>
          <button class="close" data-calendar-close-day aria-label="Close selected day">×</button>
        </header>
        <div class="hcfd2-calendar-popup-scope">${renderCalendarScope(validCalendarScope())}</div>
        <div class="hcfd2-calendar-detail-body"><div class="hcfd2-timeline">${items.length ? items.map(item => renderTimelineItem(item, combined)).join('') : `<div class="hcfd2-empty">${html(emptyCalendarDayMessage(parseLocalDay(state.calendarSelectedDate)))}</div>`}</div></div>
      </section>
    </div>`;
  }

  function countItemsByDay(items) {
    const counts = new Map();
    items.forEach(item => {
      const key = dayKey(item);
      if (key) counts.set(key, (counts.get(key) || 0) + 1);
    });
    return counts;
  }

  function emptyCalendarDayMessage(date) {
    const holiday = federalHolidayName(date);
    if (holiday) return `${holiday} — no photos or reports.`;
    if (date?.getDay() === 0 || date?.getDay() === 6) return 'Weekend — no photos or reports.';
    return 'No photos or reports on this day.';
  }

  function federalHolidayName(date) {
    if (!(date instanceof Date) || Number.isNaN(date.getTime())) return '';
    const year = date.getFullYear();
    const key = localDayKey(date);
    const holidays = new Map();
    const add = (holidayDate, name, includeObserved = false) => {
      holidays.set(localDayKey(holidayDate), name);
      if (!includeObserved) return;
      const observed = new Date(holidayDate);
      if (holidayDate.getDay() === 6) observed.setDate(observed.getDate() - 1);
      if (holidayDate.getDay() === 0) observed.setDate(observed.getDate() + 1);
      if (localDayKey(observed) !== localDayKey(holidayDate)) holidays.set(localDayKey(observed), `${name} (observed)`);
    };
    const nthWeekday = (month, weekday, nth) => {
      const result = new Date(year, month, 1);
      result.setDate(1 + (7 + weekday - result.getDay()) % 7 + (nth - 1) * 7);
      return result;
    };
    const lastWeekday = (month, weekday) => {
      const result = new Date(year, month + 1, 0);
      result.setDate(result.getDate() - (7 + result.getDay() - weekday) % 7);
      return result;
    };
    add(new Date(year, 0, 1), "New Year’s Day", true);
    add(new Date(year + 1, 0, 1), "New Year’s Day", true);
    add(nthWeekday(0, 1, 3), 'Martin Luther King Jr. Day');
    add(nthWeekday(1, 1, 3), "Washington’s Birthday");
    add(lastWeekday(4, 1), 'Memorial Day');
    add(new Date(year, 5, 19), 'Juneteenth National Independence Day', true);
    add(new Date(year, 6, 4), 'Independence Day', true);
    add(nthWeekday(8, 1, 1), 'Labor Day');
    add(nthWeekday(9, 1, 2), 'Columbus Day');
    add(new Date(year, 10, 11), 'Veterans Day', true);
    add(nthWeekday(10, 4, 4), 'Thanksgiving Day');
    add(new Date(year, 11, 25), 'Christmas Day', true);
    return holidays.get(key) || '';
  }

  function renderTimeline(child, data) {
    const scope = validTimelineScope();
    const combined = scope === 'both';
    const items = filterPeriod(timelineForScope(scope), state.period)
      .filter(item => timelineMatches(item, state.search))
      .filter(item => state.timelineType === 'all'
        || (state.timelineType === 'photos' ? item.kind === 'photo'
          : state.timelineType === 'reports' ? item.kind === 'report'
            : item.kind === 'report' && reportType(item.item) === state.timelineType));
    const scopedData = combined ? null : state.data.get(scope) || data;
    if (isPhoneLayout()) return renderMobileTimeline(items, scope, combined, scopedData);
    return `${renderTimelineScope(scope)}${renderToolbar('timeline', items.length)}<section class="hcfd2-timeline">${items.length ? items.map(item => renderTimelineItem(item, combined)).join('') : '<div class="hcfd2-empty">No timeline items match these filters.</div>'}</section>${combined ? '' : renderLoadMore(scopedData, 'both')}`;
  }

  function renderMobileTimeline(items, scope, combined, scopedData) {
    const groups = new Map();
    items.forEach(item => {
      const key = String(item.timestamp || '').slice(0, 10) || 'unknown';
      if (!groups.has(key)) groups.set(key, []);
      groups.get(key).push(item);
    });
    const activeFilters = [
      state.period !== 'all' ? periodLabel(state.period) : '',
      combined ? 'Everyone' : '',
      state.timelineType !== 'all' ? (state.timelineType === 'photos' ? 'Photos' : state.timelineType[0].toUpperCase() + state.timelineType.slice(1)) : '',
      state.search ? `“${state.search}”` : '',
    ].filter(Boolean);
    return `<section class="hcfd2-mobile-feed-head"><div><span>Activity feed</span><strong>${combined ? 'Everyone' : html(getSelectedChild()?.FirstName || fullName(getSelectedChild()))}</strong></div><button data-timeline-filter-open aria-label="Filter timeline">☷${activeFilters.length ? `<small>${activeFilters.length}</small>` : ''}</button></section>
      ${activeFilters.length ? `<div class="hcfd2-active-filters">${activeFilters.map(label => `<span>${html(label)}</span>`).join('')}</div>` : ''}
      <section class="hcfd2-mobile-feed">${groups.size ? [...groups.entries()].map(([day, entries]) => `<section><h2>${html(mobileTimelineDayLabel(day))}</h2>${entries.map(entry => renderMobileTimelineItem(entry, combined)).join('')}</section>`).join('') : '<div class="hcfd2-empty">No activity matches these filters.</div>'}</section>
      ${combined ? '' : renderLoadMore(scopedData, 'both')}
      ${state.timelineFiltersOpen ? renderTimelineFilterSheet(scope) : ''}`;
  }

  function renderMobileTimelineItem(entry, showOwner) {
    if (entry.kind === 'photo') {
      return `<button class="hcfd2-mobile-feed-item photo" data-photo-id="${attr(String(entry.item.DailyMomentId))}"><time>${html(shortTime(entry.timestamp))}</time><span class="hcfd2-feed-thumb"><img src="${attr(imageUrl(entry.item.Filename, 'moment-image-thumb'))}" alt=""></span><span><strong>${html(photoActivityLabel(entry.item))}</strong>${showOwner && entry.owner ? `<small>${html(entry.owner.FirstName || fullName(entry.owner))}</small>` : ''}</span></button>`;
    }
    const type = reportType(entry.item);
    const comments = reportComments(entry.item);
    const details = reportDetailRows(entry.item);
    const hasNote = reportHasNote(entry.item);
    return `<details class="hcfd2-mobile-feed-item hcfd2-feed-report hcfd2-activity-${type}" data-report-detail="${attr(reportDetailKey(entry.item, entry.owner?.ChildID))}"><summary><time>${html(shortTime(entry.timestamp))}</time><span class="hcfd2-feed-icon">${reportIcon(type)}</span><span><strong>${html(reportTitle(entry.item))} ${reportNoteBadge(entry.item)}</strong>${showOwner && entry.owner ? `<small>${html(entry.owner.FirstName || fullName(entry.owner))}</small>` : ''}</span></summary><div class="hcfd2-feed-report-detail">${entry.item.ChildCondition ? `<p>${html(entry.item.ChildCondition)}</p>` : ''}${hasNote ? `<div class="hcfd2-report-comments"><strong>Comments</strong><span>${html(comments || 'Open to load this report’s note…')}</span></div>` : ''}${details || (!hasNote ? '<span class="hcfd2-empty-report-detail">No additional details were provided.</span>' : '')}</div></details>`;
  }

  function renderTimelineFilterSheet(scope) {
    const types = [['all', 'All activity'], ['photos', 'Photos'], ['reports', 'Reports'], ['meal', 'Meals'], ['potty', 'Potty'], ['nap', 'Naps'], ['bottle', 'Bottles'], ['supplies', 'Supplies']];
    return `<div class="hcfd2-filter-backdrop" data-timeline-filter-backdrop><section class="hcfd2-filter-sheet" role="dialog" aria-modal="true" aria-label="Timeline filters"><div class="hcfd2-sheet-handle"></div><header><h2>Filter activity</h2><button data-timeline-filter-close aria-label="Close filters">×</button></header><div class="hcfd2-filter-body"><h3>Date range</h3>${renderPeriodButtons()}<h3>Child</h3>${renderTimelineScope(scope)}<h3>Activity type</h3><div class="hcfd2-filter-types">${types.map(([value, label]) => `<button class="${state.timelineType === value ? 'active' : ''}" data-timeline-type="${value}">${label}</button>`).join('')}</div><label class="hcfd2-filter-search"><span>Search</span><input data-search type="search" value="${attr(state.search)}" placeholder="Search activity…"></label></div></section></div>`;
  }

  function periodLabel(period) {
    return ({ today: 'Today', yesterday: 'Yesterday', date: formatDay(state.selectedDate), month: '30 days', all: 'All loaded' })[period] || 'Selected week';
  }

  function mobileTimelineDayLabel(day) {
    if (day === 'unknown') return 'Unknown date';
    const date = parseLocalDay(day);
    return date ? new Intl.DateTimeFormat(undefined, { month: 'long', day: 'numeric' }).format(date) : day;
  }

  function renderTimelineScope(scope) {
    const options = state.children.map(child => [String(child.ChildID), child.FirstName || fullName(child)]);
    if (state.children.length > 1) options.push(['both', 'Everyone']);
    return `<section class="hcfd2-timeline-scope"><div><span>Family activity</span><strong>${scope === 'both' ? 'Everyone together' : 'Choose whose activity to show'}</strong></div><div role="group" aria-label="Family activity">${options.map(([value, label]) => `<button class="${scope === value ? 'active' : ''}" data-timeline-scope="${attr(value)}">${html(label)}</button>`).join('')}</div></section>`;
  }

  function validTimelineScope() {
    if (state.timelineScope === 'both' && state.children.length > 1) return 'both';
    if (state.children.some(child => String(child.ChildID) === state.timelineScope)) return state.timelineScope;
    return state.selectedChildId;
  }

  function timelineForScope(scope) {
    if (scope !== 'both') {
      const child = state.children.find(item => String(item.ChildID) === scope);
      return mergedTimeline(state.data.get(scope) || emptyChildData(), child);
    }
    return state.children.flatMap(child => {
      const id = String(child.ChildID);
      return mergedTimeline(state.data.get(id) || emptyChildData(), child);
    }).sort((a, b) => b.timestamp.localeCompare(a.timestamp));
  }

  function mergedTimeline(data, owner = null) {
    const reports = data.reports.map(report => ({ kind: 'report', timestamp: itemTimestamp(report), item: report, owner }));
    const moments = visiblePhotosForChild(data.moments, owner?.ChildID).map(moment => ({ kind: 'photo', timestamp: itemTimestamp(moment), item: moment, owner }));
    return [...reports, ...moments].sort((a, b) => b.timestamp.localeCompare(a.timestamp));
  }

  function renderMiniTimeline(entry) {
    if (entry.kind === 'photo') return `<div class="hcfd2-mini-photo"><button data-photo-id="${attr(String(entry.item.DailyMomentId))}" aria-label="Open ${attr(photoTitle(entry.item))}"><img src="${attr(imageUrl(entry.item.Filename, 'moment-image-thumb'))}" alt=""></button><p><strong>${html(photoTitle(entry.item))}</strong><small>${html(shortDateTime(entry.timestamp))}</small></p></div>`;
    const type = reportType(entry.item);
    const comments = reportComments(entry.item);
    const hasNote = reportHasNote(entry.item);
    return `<details class="hcfd2-activity-${type}" data-report-detail="${attr(reportDetailKey(entry.item, entry.owner?.ChildID))}"><summary><span>${reportIcon(type)}</span><p><strong>${html(reportTitle(entry.item))} ${reportNoteBadge(entry.item)}</strong><small>${html(entry.item.ChildCondition || shortDateTime(entry.timestamp))}</small></p></summary><div class="hcfd2-report-comments"><strong>Comments</strong><span>${html(comments || (hasNote ? 'Open to load this report’s note…' : 'No note was provided.'))}</span></div></details>`;
  }

  function renderTimelineItem(entry, showOwner = false) {
    if (entry.kind === 'photo') {
      const moment = entry.item;
      return `<article class="hcfd2-time-item photo ${isNewItem('photo', moment.DailyMomentId) ? 'hcfd2-new-item' : ''}">
        <time>${html(shortTime(entry.timestamp))}</time>
        <div class="hcfd2-time-dot">📷</div>
        <div class="hcfd2-time-card">
          <button class="hcfd2-time-photo" data-photo-id="${attr(String(moment.DailyMomentId))}"><img src="${attr(imageUrl(moment.Filename, 'moment-image-thumb'))}" alt="${attr(photoTitle(moment))}"></button>
          <div><strong>${html(photoTitle(moment))}</strong>${showOwner && entry.owner ? `<span class="hcfd2-item-owner">${html(entry.owner.FirstName || fullName(entry.owner))}</span>` : ''}${moment.Lesson ? `<span>${html(moment.Lesson)}</span>` : ''}<small>${html(longDateTime(entry.timestamp))}</small></div>
        </div>
      </article>`;
    }
    const report = entry.item;
    const type = reportType(report);
    const comments = reportComments(report);
    const details = reportDetailRows(report);
    const hasNote = reportHasNote(report);
    return `<article class="hcfd2-time-item hcfd2-activity-${type} ${isNewItem('report', report.DailyReportId) ? 'hcfd2-new-item' : ''}">
      <time>${html(shortTime(entry.timestamp))}</time>
      <div class="hcfd2-time-dot">${reportIcon(type)}</div>
      <details class="hcfd2-time-card report hcfd2-timeline-report" data-report-detail="${attr(reportDetailKey(report, entry.owner?.ChildID))}"><summary><strong>${html(reportTitle(report))} ${reportNoteBadge(report)}</strong>${showOwner && entry.owner ? `<span class="hcfd2-item-owner">${html(entry.owner.FirstName || fullName(entry.owner))}</span>` : ''}${report.ChildCondition ? `<span>${html(report.ChildCondition)}</span>` : ''}<small>${html(longDateTime(entry.timestamp))}</small></summary><div class="hcfd2-feed-report-detail">${hasNote ? `<div class="hcfd2-report-comments"><strong>Comments</strong><span>${html(comments || 'Open to load this report’s note…')}</span></div>` : ''}${details || (!hasNote ? '<span class="hcfd2-empty-report-detail">No additional details were provided.</span>' : '')}</div></details>
    </article>`;
  }

  function renderPhotos(child, data, favoritesOnly) {
    const showingFavorites = favoritesOnly || state.photoFavoritesOnly;
    const visible = visiblePhotosForChild(data.moments, child?.ChildID);
    let moments = showingFavorites ? favoriteMoments(visible) : visible;
    moments = filterPeriod(moments, state.period).filter(moment => photoMatches(moment, state.search));
    if (isPhoneLayout()) return renderMobilePhotos(moments, favoritesOnly, data);
    return `${renderToolbar(favoritesOnly ? 'favorites' : 'photos', moments.length)}
      <section class="hcfd2-gallery">${moments.length ? moments.map(photoCard).join('') : `<div class="hcfd2-empty">${favoritesOnly ? 'No favorite photos match these filters.' : 'No photos match these filters.'}</div>`}</section>
      ${favoritesOnly ? '' : renderLoadMore(data, 'moments')}`;
  }

  function renderMobilePhotos(moments, favoritesTab, data) {
    const groups = new Map();
    moments.forEach(moment => {
      const key = dayKey(moment) || 'unknown';
      if (!groups.has(key)) groups.set(key, []);
      groups.get(key).push(moment);
    });
    const activeFilters = [
      state.period !== 'all' ? periodLabel(state.period) : '',
      state.photoFavoritesOnly && !favoritesTab ? 'Favorites' : '',
      state.search ? `“${state.search}”` : '',
    ].filter(Boolean);
    return `<section class="hcfd2-mobile-gallery-head"><div><span>${favoritesTab ? 'Saved photos' : 'Photo gallery'}</span><strong>${html(getSelectedChild()?.FirstName || fullName(getSelectedChild()))}</strong></div><button data-photo-filter-open aria-label="Filter photos">☷${activeFilters.length ? `<small>${activeFilters.length}</small>` : ''}</button></section>
      ${activeFilters.length ? `<div class="hcfd2-active-filters">${activeFilters.map(label => `<span>${html(label)}</span>`).join('')}</div>` : ''}
      <section class="hcfd2-mobile-gallery">${groups.size ? [...groups.entries()].map(([day, photos]) => `<section><h2>${html(mobileTimelineDayLabel(day))}</h2><div>${photos.map(moment => `<button data-photo-id="${attr(String(moment.DailyMomentId))}" aria-label="Open ${attr(photoTitle(moment))}"><img src="${attr(imageUrl(moment.Filename, 'moment-image-thumb'))}" data-photo-original="${attr(imageUrl(moment.Filename))}" alt="">${isFavorite(moment.DailyMomentId) ? '<span aria-label="Favorite">★</span>' : ''}</button>`).join('')}</div></section>`).join('') : `<div class="hcfd2-empty">${favoritesTab || state.photoFavoritesOnly ? 'No favorite photos match these filters.' : 'No photos match these filters.'}</div>`}</section>
      ${favoritesTab ? '' : renderLoadMore(data, 'moments')}
      ${state.photoFiltersOpen ? renderPhotoFilterSheet(favoritesTab) : ''}`;
  }

  function renderPhotoFilterSheet(favoritesTab) {
    const hiddenCount = hiddenPhotoCountForChild(state.selectedChildId);
    return `<div class="hcfd2-filter-backdrop" data-photo-filter-backdrop><section class="hcfd2-filter-sheet" role="dialog" aria-modal="true" aria-label="Photo filters"><div class="hcfd2-sheet-handle"></div><header><h2>Filter photos</h2><button data-photo-filter-close aria-label="Close filters">×</button></header><div class="hcfd2-filter-body"><h3>Date range</h3>${renderPeriodButtons()}${favoritesTab ? '' : `<h3>Show</h3><div class="hcfd2-filter-types"><button class="${!state.photoFavoritesOnly ? 'active' : ''}" data-photo-favorites="false">All photos</button><button class="${state.photoFavoritesOnly ? 'active' : ''}" data-photo-favorites="true">Favorites</button></div>`}<label class="hcfd2-filter-search"><span>Search</span><input data-search type="search" value="${attr(state.search)}" placeholder="Search photos…"></label>${hiddenCount ? `<button class="hcfd2-restore-hidden" data-unhide-photos>Restore ${hiddenCount} hidden photo${hiddenCount === 1 ? '' : 's'}</button>` : ''}</div></section></div>`;
  }

  function photoCard(moment) {
    const favorite = isFavorite(moment.DailyMomentId);
    return `<article class="hcfd2-photo-card ${isNewItem('photo', moment.DailyMomentId) ? 'hcfd2-new-item' : ''}">
      <button class="hcfd2-photo-main" data-photo-id="${attr(String(moment.DailyMomentId))}"><img src="${attr(imageUrl(moment.Filename, 'moment-image-thumb'))}" data-photo-original="${attr(imageUrl(moment.Filename))}" alt="${attr(photoTitle(moment))}"></button>
      <button class="hcfd2-favorite ${favorite ? 'active' : ''}" data-favorite="${attr(String(moment.DailyMomentId))}" title="Favorite">${favorite ? '★' : '☆'}</button>
      <div class="hcfd2-photo-copy"><strong>${html(photoTitle(moment))}</strong>${moment.Lesson ? `<span>${html(moment.Lesson)}</span>` : ''}<small>${html(longDateTime(itemTimestamp(moment)))}</small><a href="${attr(imageUrl(moment.Filename))}" target="_blank" rel="noopener" download>Download</a></div>
    </article>`;
  }

  function photoTile(moment) {
    return `<button data-photo-id="${attr(String(moment.DailyMomentId))}"><img src="${attr(imageUrl(moment.Filename, 'moment-image-thumb'))}" alt="${attr(photoTitle(moment))}"></button>`;
  }

  function renderSimpleFilterSheet() {
    return `<div class="hcfd2-filter-backdrop" data-stats-filter-backdrop><section class="hcfd2-filter-sheet" role="dialog" aria-modal="true" aria-label="Statistics range"><div class="hcfd2-sheet-handle"></div><header><h2>Statistics range</h2><button data-stats-filter-close aria-label="Close">×</button></header><div class="hcfd2-filter-body"><h3>Date range</h3>${renderPeriodButtons()}</div></section></div>`;
  }

  function reportDetailRows(report) {
    report = resolvedReport(report);
    const hidden = new Set(['DailyReportId', 'DailyReportTypeID', 'ChildID', 'Created', 'Date', 'GroupDate', 'StartDate', 'GenericReportInfo', 'ChildCondition', 'Comment', 'Comments', 'Notes', 'Note', 'Remarks', 'Remark', 'Message']);
    return Object.entries(report)
      .filter(([key, value]) => !hidden.has(key)
        && !/(^id$|id$|^day$|dayasnumber|hasnote|created|updated|timestamp|^timestart$|^timeend$)/i.test(key)
        && value != null && value !== '' && typeof value !== 'object')
      .slice(0, 12)
      .map(([key, value]) => `<div><strong>${html(key.replace(/([a-z])([A-Z])/g, '$1 $2'))}</strong><span>${html(String(value))}</span></div>`)
      .join('');
  }

  function reportComments(report) {
    report = resolvedReport(report);
    const values = [];
    const collect = (value, key = '', depth = 0, insideNote = false) => {
      if (value == null || value === '' || depth > 3) return;
      const metadataFlag = /hasnote|noteexists|(^id$|id$|^day$|created|updated)/i.test(key);
      const noteField = insideNote || /comment|note|remark|message/i.test(key);
      if (typeof value === 'string' || typeof value === 'number') {
        if (noteField && !metadataFlag) values.push(String(value).trim());
      } else if (Array.isArray(value)) {
        value.forEach(item => collect(item, key, depth + 1, noteField));
      } else if (typeof value === 'object') {
        Object.entries(value).forEach(([childKey, childValue]) => collect(childValue, childKey, depth + 1, noteField));
      }
    };
    collect(report);
    return [...new Set(values.filter(Boolean))].join('\n');
  }

  function reportHasNote(report) {
    report = resolvedReport(report);
    return Boolean(reportComments(report) || Object.entries(report || {}).some(([key, value]) => /hasnote|noteexists/i.test(key) && (value === true || value === 1 || String(value).toLowerCase() === 'true')));
  }

  function reportNoteBadge(report) {
    return reportHasNote(report) ? '<span class="hcfd2-note-badge">📝 Note</span>' : '';
  }

  function reportDetailKey(report, childId) {
    return `${report?.DailyReportId ?? ''}:${childId ?? report?.ChildID ?? state.selectedChildId ?? ''}`;
  }

  function resolvedReport(report) {
    const direct = reportDetailCache.get(reportDetailKey(report));
    const reportId = String(report?.DailyReportId ?? '');
    const fallback = direct || (reportId
      ? [...reportDetailCache.entries()].find(([key]) => key.startsWith(`${reportId}:`))?.[1]
      : null);
    return { ...(report || {}), ...(fallback || {}) };
  }

  function showLoadedReportDetail(key, detail) {
    const separator = key.indexOf(':');
    const reportId = key.slice(0, separator);
    const childId = key.slice(separator + 1);
    const original = state.data.get(childId)?.reports
      .find(report => String(report.DailyReportId) === reportId) || {};
    const merged = { ...original, ...detail, DailyReportId: reportId, ChildID: childId };
    const comments = reportComments(merged) || 'No note text was returned.';
    app.querySelectorAll('[data-report-detail]').forEach(element => {
      if (element.dataset.reportDetail !== key) return;
      element.classList.remove('hcfd2-report-loading');
      element.querySelector('.hcfd2-empty-report-detail')?.remove();
      let commentsBlock = element.querySelector('.hcfd2-report-comments');
      if (!commentsBlock) {
        commentsBlock = document.createElement('div');
        commentsBlock.className = 'hcfd2-report-comments';
        commentsBlock.innerHTML = '<strong>Comments</strong><span></span>';
        const container = element.querySelector('.hcfd2-report-details, .hcfd2-feed-report-detail') || element;
        container.prepend(commentsBlock);
      }
      commentsBlock.querySelector('span').textContent = comments;
    });
  }

  async function loadReportDetail(key, detailsElement) {
    if (!key) return;
    if (reportDetailCache.has(key)) {
      showLoadedReportDetail(key, reportDetailCache.get(key));
      return;
    }
    const separator = key.indexOf(':');
    const reportId = key.slice(0, separator);
    const childId = key.slice(separator + 1);
    if (!reportId || !childId) return;
    detailsElement.classList.add('hcfd2-report-loading');
    const commentText = detailsElement.querySelector('.hcfd2-report-comments span');
    if (commentText) commentText.textContent = 'Loading note…';
    try {
      const response = await fetch(`${API.reports}/${encodeURIComponent(reportId)}/${encodeURIComponent(childId)}`, {
        credentials: 'same-origin',
        headers: { Accept: 'application/json' },
      });
      if (!response.ok) throw new Error(`Report detail request failed (${response.status}).`);
      const json = await response.json();
      if (!json.Success || !json.Data) throw new Error(extractApiError(json, 'Honeycomb did not return report details.'));
      reportDetailCache.set(key, json.Data);
      showLoadedReportDetail(key, json.Data);
    } catch (error) {
      detailsElement.classList.remove('hcfd2-report-loading');
      if (commentText) commentText.textContent = 'The note could not be loaded. Tap the report to try again.';
      console.warn('[Honeycomb report detail]', error);
    }
  }

  function renderStats(child, data) {
    const childMoments = visiblePhotosForChild(data.moments, child?.ChildID);
    const visibleMoments = filterPeriod(childMoments, state.period);
    const visibleReports = filterPeriod(data.reports, state.period);
    const lessons = countTop(visibleMoments.map(photoActivityLabel));
    const reportTypes = countTop(visibleReports.map(r => reportTitle(r)));
    const byDay = new Map();
    visibleMoments.forEach(m => byDay.set(dayKey(m), (byDay.get(dayKey(m)) || 0) + 1));
    const avg = byDay.size ? (visibleMoments.length / byDay.size).toFixed(1) : '0';
    if (isPhoneLayout()) return renderMobileStats(child, data, visibleMoments, visibleReports, lessons, reportTypes, avg);
    return `${renderPeriodOnlyToolbar()}
      <section class="hcfd2-stat-grid">
        <article><strong>${visibleMoments.length}</strong><span>photos in range</span></article>
        <article><strong>${visibleReports.length}</strong><span>reports in range</span></article>
        <article><strong>${favoriteMoments(childMoments).length}</strong><span>favorite photos</span></article>
        <article><strong>${avg}</strong><span>photos per active day</span></article>
      </section>
      <section class="hcfd2-chart-grid">
        ${renderBarList('Top activities', lessons)}
        ${renderBarList('Report types', reportTypes)}
      </section>
      ${renderActivityHeatmap({ ...data, moments: childMoments })}
      <p class="hcfd2-note">Statistics use the pages currently loaded in the dashboard. Use “Load more” in Photos or Reports to extend the history included.</p>`;
  }

  function renderMobileStats(child, data, visibleMoments, visibleReports, lessons, reportTypes, avg) {
    const range = periodLabel(state.period);
    const metrics = [[visibleMoments.length, 'Photos'], [visibleReports.length, 'Reports'], [favoriteMoments(visiblePhotosForChild(data.moments, child?.ChildID)).length, 'Favorites'], [avg, 'Photos / active day']];
    return `<section class="hcfd2-secondary-head"><div><span>Statistics</span><strong>${html(child.FirstName || fullName(child))}</strong></div><button data-stats-filter-open aria-label="Change statistics range">◷<small>1</small></button></section><div class="hcfd2-active-filters"><span>${html(range)}</span></div>
      <section class="hcfd2-mobile-stat-metrics">${metrics.map(([value, label]) => `<article><strong>${value}</strong><span>${html(label)}</span></article>`).join('')}</section>
      <details class="hcfd2-mobile-stat-section" open><summary><span>Top activities</span><b>⌄</b></summary>${renderBarList('Top activities', lessons)}</details>
      <details class="hcfd2-mobile-stat-section"><summary><span>Report types</span><b>⌄</b></summary>${renderBarList('Report types', reportTypes)}</details>
      <details class="hcfd2-mobile-stat-section"><summary><span>Activity heatmap</span><b>⌄</b></summary>${renderActivityHeatmap(data)}</details>
      <p class="hcfd2-note">Based on history currently loaded on this device.</p>${state.statsFiltersOpen ? renderSimpleFilterSheet() : ''}`;
  }

  function renderBarList(title, entries) {
    const max = Math.max(1, ...entries.map(([, count]) => count));
    return `<article class="hcfd2-bars"><h2>${html(title)}</h2>${entries.length ? entries.slice(0, 8).map(([label, count]) => `<div><span>${html(label)}</span><div><i style="width:${Math.max(6, Math.round((count / max) * 100))}%"></i></div><strong>${count}</strong></div>`).join('') : '<p class="hcfd2-empty">Not enough data yet.</p>'}</article>`;
  }

  function renderActivityHeatmap(data) {
    const counts = new Map();
    [...data.moments, ...data.reports].forEach(item => {
      const key = dayKey(item);
      if (key) counts.set(key, (counts.get(key) || 0) + 1);
    });
    const days = [];
    const end = startDay(new Date());
    const start = new Date(end);
    start.setDate(start.getDate() - 83);
    const max = Math.max(1, ...counts.values());
    for (const date = new Date(start); date <= end; date.setDate(date.getDate() + 1)) {
      const key = localDayKey(date);
      const count = counts.get(key) || 0;
      const strength = count ? Math.max(0.18, count / max) : 0;
      days.push(`<span title="${attr(formatDay(key))}: ${count} item${count === 1 ? '' : 's'}" style="--heat:${strength}"></span>`);
    }
    return `<section class="hcfd2-heatmap"><div><span>Activity heatmap</span><h2>Last 12 weeks</h2></div><div class="hcfd2-heatmap-grid" aria-label="Activity during the last 12 weeks">${days.join('')}</div><small>Light days have fewer loaded items; darker days have more.</small></section>`;
  }

  function groupBadgesByCategory(badges) {
    const groups = new Map();
    badges.forEach(badge => {
      const name = badge.Category || badge.CategoryName || 'Other achievements';
      if (!groups.has(name)) groups.set(name, []);
      groups.get(name).push(badge);
    });
    return [...groups.entries()].map(([name, groupBadges]) => ({ name, badges: groupBadges }));
  }

  function renderBadges(child, data) {
    const badges = data.badges || [];
    const groups = groupBadgesByCategory(badges);
    if (isPhoneLayout()) return renderMobileBadges(child, data, badges, groups);
    return `<section class="hcfd2-badges"><div class="hcfd2-badge-hero"><span>★</span><div><h2>${html(fullName(child))}</h2><p>${badges.length || data.badgeCount || 0} earned badges · ${groups.length || state.badgeCategories.length || 0} categories</p></div></div>${badges.length ? groups.map(group => `<section class="hcfd2-badge-category"><h3>${html(group.name)}</h3><div class="hcfd2-badge-grid">${group.badges.map(badge => `<article><span>★</span><strong>${html(badge.Value || badge.BadgeName || badge.Name || badge.Title || 'Badge')}</strong><small>${html(badge.Category || badge.CategoryName || '')}</small></article>`).join('')}</div></section>`).join('') : '<div class="hcfd2-empty">Honeycomb has not recorded any earned badges for this child yet.</div>'}</section>`;
  }

  function renderMobileBadges(child, data, badges, groups) {
    return `<section class="hcfd2-mobile-badges"><header>${renderChildAvatar(child, false, false)}<div><span>Achievements</span><h2>${html(child.FirstName || fullName(child))}</h2><small>${badges.length || data.badgeCount || 0} earned badges</small></div></header>${groups.length ? groups.map((group, index) => `<details ${index === 0 ? 'open' : ''}><summary><span>${html(group.name)}</span><small>${group.badges.length}</small><b>⌄</b></summary><div>${group.badges.map(badge => `<article><span>★</span><strong>${html(badge.Value || badge.BadgeName || badge.Name || badge.Title || 'Badge')}</strong></article>`).join('')}</div></details>`).join('') : '<div class="hcfd2-empty">No earned badges yet.</div>'}</section>`;
  }

  function renderToolbar(type, count) {
    return `<div class="hcfd2-toolbar">
      ${renderPeriodButtons()}
      <label><span>Search</span><input data-search type="search" value="${attr(state.search)}" placeholder="Search loaded items…"></label>
      <span class="hcfd2-count">${count} shown</span>
      ${(type === 'photos' || type === 'favorites') ? '<button data-action="download-visible">Download visible</button><button data-action="download-week">Download week</button><button data-action="download-favorites">Download favorites</button>' : ''}
    </div>`;
  }

  function renderPeriodOnlyToolbar() {
    return `<div class="hcfd2-toolbar">${renderPeriodButtons()}</div>`;
  }

  function renderPeriodButtons() {
    const periods = [
      ...(state.period === 'date' ? [['date', formatDay(state.selectedDate)]] : []),
      ['today', 'Today'], ['yesterday', 'Yesterday'], ['week', 'Selected week'], ['month', '30 days'], ['all', 'All loaded'],
    ];
    return `<div class="hcfd2-pills">${periods.map(([value, label]) => `<button class="${state.period === value ? 'active' : ''}" data-period="${value}">${label}</button>`).join('')}</div>`;
  }

  function renderLoadMore(data, type) {
    const needsMoments = type === 'moments' || type === 'both';
    const needsReports = type === 'reports' || type === 'both';
    const canMoments = needsMoments && data.moments.length < data.momentCount;
    const canReports = needsReports && data.reports.length < data.reportCount;
    if (!canMoments && !canReports) return '';
    const mobileLabel = state.tab === 'activity'
      ? 'Load older activity'
      : state.tab === 'photos'
        ? 'Load more photos'
        : 'Load more history';
    const status = state.tab === 'photos'
      ? `${data.moments.length} of ${data.momentCount} photos loaded`
      : `${data.moments.length}/${data.momentCount} photos · ${data.reports.length}/${data.reportCount} reports loaded`;
    return `<div class="hcfd2-load-more"><button data-load-more="${type}">${isPhoneLayout() ? mobileLabel : 'Load more history'}</button><small>${status}</small></div>`;
  }

  function renderViewer() {
    return `<div id="hcfd2-viewer" hidden><button data-viewer="close" aria-label="Back to photos">‹ <span>Back</span></button><button class="prev" data-viewer="prev">‹</button><figure><div class="hcfd2-viewer-loading"><i></i><span>Loading full resolution…</span></div><img alt=""><figcaption><strong></strong><span></span><small></small><div><button data-viewer="favorite">☆ Favorite</button><button data-viewer="download">Save original</button><button data-viewer="hide">Hide photo</button></div></figcaption></figure><button class="next" data-viewer="next">›</button></div>`;
  }

  function renderAvatarEditor() {
    if (!state.avatarEditor) return '';
    const child = state.children.find(item => String(item.ChildID) === state.avatarEditor.childId);
    if (state.avatarEditor.mode === 'menu') {
      const hasPicture = Boolean(getChildAvatar(state.avatarEditor.childId));
      return `<div class="hcfd2-avatar-modal" data-avatar-modal><section class="hcfd2-avatar-editor hcfd2-avatar-menu" role="dialog" aria-modal="true" aria-labelledby="hcfd2-avatar-title">
        <header><div><span>Profile picture</span><h2 id="hcfd2-avatar-title">${html(child?.FirstName || 'Avatar')}</h2></div><button data-avatar-cancel aria-label="Close">×</button></header>
        <div class="hcfd2-avatar-menu-preview">${child ? renderChildAvatar(child, true, false) : ''}</div>
        <div class="hcfd2-avatar-menu-actions"><button data-avatar-change>${hasPicture ? 'Choose a new picture' : 'Choose picture'}</button>${hasPicture ? '<button data-avatar-recrop>Re-crop current picture</button><button data-avatar-remove>Use initials</button>' : ''}</div>
      </section></div>`;
    }
    return `<div class="hcfd2-avatar-modal" data-avatar-modal>
      <section class="hcfd2-avatar-editor" role="dialog" aria-modal="true" aria-labelledby="hcfd2-avatar-title">
        <header><div><span>Profile picture</span><h2 id="hcfd2-avatar-title">Crop ${html(child?.FirstName || 'photo')}</h2></div><button data-avatar-cancel aria-label="Close">×</button></header>
        <div class="hcfd2-avatar-crop" data-avatar-crop><img data-avatar-preview src="${attr(state.avatarEditor.src)}" alt=""></div>
        <p>Drag the picture to center the face.</p>
        <label><span>Zoom</span><input data-avatar-zoom type="range" min="1" max="3" step="0.01" value="${state.avatarEditor.zoom}"></label>
        <footer><button data-avatar-remove ${getChildAvatar(state.avatarEditor.childId) ? '' : 'hidden'}>Use initials</button><button data-avatar-cancel>Cancel</button><button class="primary" data-avatar-save>Save picture</button></footer>
      </section>
    </div>`;
  }

  function bindEvents() {
    app.querySelectorAll('[data-avatar-child]').forEach(avatar => {
      avatar.addEventListener('click', event => {
        event.stopPropagation();
        openAvatarManager(avatar.dataset.avatarChild);
      });
      avatar.addEventListener('keydown', event => {
        if (event.key !== 'Enter' && event.key !== ' ') return;
        event.preventDefault();
        event.stopPropagation();
        openAvatarManager(avatar.dataset.avatarChild);
      });
    });
    bindAvatarEditorEvents();
    app.querySelector('[data-action="menu"]')?.addEventListener('click', () => {
      state.headerMenuOpen = !state.headerMenuOpen;
      render();
    });
    app.querySelector('[data-action="close"]')?.addEventListener('click', closeDashboard);
    app.querySelector('[data-action="refresh"]')?.addEventListener('click', refreshAll);
    app.querySelector('[data-action="theme"]')?.addEventListener('change', event => setTheme(event.target.value));
    app.querySelector('[data-action="auto"]')?.addEventListener('click', toggleAutoRefresh);
    app.querySelector('[data-action="notifications"]')?.addEventListener('click', toggleNotifications);
    app.querySelector('[data-action="test-notification"]')?.addEventListener('click', sendTestNotification);
    app.querySelector('[data-action="print-week"]')?.addEventListener('click', () => window.print());

    app.querySelectorAll('[data-child]').forEach(button => button.addEventListener('click', () => switchChild(button.dataset.child)));
    app.querySelectorAll('[data-child-picker-open]').forEach(button => button.addEventListener('click', () => {
      state.childPickerOpen = true;
      render();
    }));
    app.querySelector('[data-child-picker-close]')?.addEventListener('click', () => {
      state.childPickerOpen = false;
      render();
    });
    app.querySelector('[data-child-picker-backdrop]')?.addEventListener('click', event => {
      if (event.target !== event.currentTarget) return;
      state.childPickerOpen = false;
      render();
    });
    app.querySelector('[data-child-all]')?.addEventListener('click', async () => {
      state.childPickerOpen = false;
      await Promise.all(state.children.map(child => {
        const id = String(child.ChildID);
        return state.data.has(id) ? Promise.resolve() : loadChild(id, true);
      }));
      if (state.tab === 'activity') {
        state.timelineScope = 'both';
        state.calendarScope = 'both';
      }
      if (state.tab === 'activity' && state.activityView === 'calendar') await loadAndRenderCalendarMonth();
      else render();
    });
    app.querySelectorAll('[data-tab]').forEach(button => button.addEventListener('click', () => switchTab(button.dataset.tab)));
    app.querySelector('[data-mobile-more]')?.addEventListener('click', () => {
      state.mobileMoreOpen = !state.mobileMoreOpen;
      render();
    });
    app.querySelector('[data-mobile-more-close]')?.addEventListener('click', () => {
      state.mobileMoreOpen = false;
      render();
    });
    app.querySelector('[data-mobile-more-backdrop]')?.addEventListener('click', event => {
      if (event.target !== event.currentTarget) return;
      state.mobileMoreOpen = false;
      render();
    });
    app.querySelectorAll('[data-open-child]').forEach(button => button.addEventListener('click', () => switchChild(button.dataset.openChild)));
    app.querySelectorAll('[data-open]').forEach(button => button.addEventListener('click', () => {
      const [childId, tab] = button.dataset.open.split(':');
      state.selectedChildId = childId;
      state.tab = ['timeline', 'reports', 'calendar'].includes(tab) ? 'activity' : tab;
      if (state.tab === 'activity') {
        state.activityView = tab === 'calendar' ? 'calendar' : 'agenda';
        state.timelineType = tab === 'reports' ? 'reports' : 'all';
        state.timelineScope = childId;
        state.calendarScope = childId;
      }
      saveView();
      render();
    }));

    app.querySelectorAll('[data-activity-view]').forEach(button => button.addEventListener('click', async () => {
      state.activityView = button.dataset.activityView;
      if (state.activityView === 'calendar') {
        state.calendarScope = state.timelineScope || state.selectedChildId;
        await loadAndRenderCalendarMonth();
      } else {
        state.timelineScope = state.calendarScope || state.selectedChildId;
        render();
      }
    }));

    app.querySelectorAll('[data-period]').forEach(button => button.addEventListener('click', async () => {
      state.period = button.dataset.period;
      if (state.period === 'week') {
        await loadAndRenderSelectedWeek();
      } else {
        render();
      }
    }));

    app.querySelectorAll('[data-home-view]').forEach(button => button.addEventListener('click', async () => {
      state.homeView = button.dataset.homeView === 'week' ? 'week' : 'day';
      state.period = state.homeView === 'week' ? 'week' : 'today';
      if (state.homeView === 'week') {
        render();
        await loadAndRenderSelectedWeek();
      } else {
        render();
      }
    }));
    app.querySelectorAll('[data-ack-supply]').forEach(button => button.addEventListener('click', () => {
      acknowledgeSupplyAlert(button.dataset.ackSupply);
    }));
    app.querySelector('[data-supply-alerts-open]')?.addEventListener('click', () => {
      state.supplyAlertsOpen = true;
      render();
    });
    app.querySelector('[data-supply-alerts-close]')?.addEventListener('click', () => {
      state.supplyAlertsOpen = false;
      render();
    });
    app.querySelector('[data-supply-alerts-backdrop]')?.addEventListener('click', event => {
      if (event.target !== event.currentTarget) return;
      state.supplyAlertsOpen = false;
      render();
    });

    app.querySelectorAll('[data-calendar-action]').forEach(button => button.addEventListener('click', async () => {
      await changeCalendarMonth(button.dataset.calendarAction);
    }));
    app.querySelectorAll('[data-calendar-agenda-day]').forEach(button => button.addEventListener('click', async () => {
      if (button.disabled) return;
      state.calendarSelectedDate = button.dataset.calendarAgendaDay;
      state.calendarMonth = state.calendarSelectedDate.slice(0, 7);
      await loadAndRenderCalendarMonth();
    }));
    app.querySelector('[data-calendar-date-picker]')?.addEventListener('change', async event => {
      if (!event.target.value || event.target.value > todayKey()) return;
      state.calendarSelectedDate = event.target.value;
      state.calendarMonth = event.target.value.slice(0, 7);
      await loadAndRenderCalendarMonth();
    });
    app.querySelector('[data-calendar-agenda-today]')?.addEventListener('click', async () => {
      state.calendarSelectedDate = todayKey();
      state.calendarMonth = todayKey().slice(0, 7);
      await loadAndRenderCalendarMonth();
    });
    app.querySelectorAll('[data-calendar-week-action]').forEach(button => button.addEventListener('click', async () => {
      const selected = parseLocalDay(state.calendarSelectedDate) || startDay(new Date());
      selected.setDate(selected.getDate() + (button.dataset.calendarWeekAction === 'previous' ? -7 : 7));
      if (selected > new Date()) return;
      state.calendarSelectedDate = localDayKey(selected);
      state.calendarMonth = state.calendarSelectedDate.slice(0, 7);
      await loadAndRenderCalendarMonth();
    }));
    bindCalendarSwipe();
    bindChildViewSwipe();
    app.querySelector('[data-calendar-picker]')?.addEventListener('change', async event => {
      if (!/^\d{4}-\d{2}$/.test(event.target.value) || event.target.value > todayKey().slice(0, 7)) return;
      state.calendarMonth = event.target.value;
      state.calendarSelectedDate = null;
      await loadAndRenderCalendarMonth();
    });
    app.querySelectorAll('[data-calendar-day]').forEach(button => button.addEventListener('click', () => {
      state.calendarSelectedDate = state.calendarSelectedDate === button.dataset.calendarDay
        ? null
        : button.dataset.calendarDay;
      render();
      if (state.calendarSelectedDate) {
        requestAnimationFrame(() => {
          const detail = app.querySelector('.hcfd2-calendar-detail');
          detail?.focus();
        });
      }
    }));
    app.querySelectorAll('[data-calendar-day-step]').forEach(button => button.addEventListener('click', async () => {
      await stepCalendarDay(Number(button.dataset.calendarDayStep));
    }));
    app.querySelectorAll('[data-calendar-scope]').forEach(button => button.addEventListener('click', async () => {
      state.calendarScope = button.dataset.calendarScope;
      state.timelineScope = state.calendarScope;
      if (state.calendarScope !== 'both') {
        state.selectedChildId = state.calendarScope;
        localStorage.setItem(STORAGE.child, state.selectedChildId);
      }
      await loadAndRenderCalendarMonth();
    }));
    app.querySelector('[data-calendar-close-day]')?.addEventListener('click', () => {
      state.calendarSelectedDate = null;
      render();
    });
    app.querySelector('[data-calendar-modal]')?.addEventListener('click', event => {
      if (event.target !== event.currentTarget) return;
      state.calendarSelectedDate = null;
      render();
    });

    app.querySelectorAll('[data-timeline-scope]').forEach(button => button.addEventListener('click', () => {
      state.timelineScope = button.dataset.timelineScope;
      state.calendarScope = state.timelineScope;
      if (state.timelineScope !== 'both') {
        state.selectedChildId = state.timelineScope;
        localStorage.setItem(STORAGE.child, state.selectedChildId);
      }
      render();
    }));
    app.querySelector('[data-timeline-filter-open]')?.addEventListener('click', () => {
      state.timelineFiltersOpen = true;
      render();
    });
    app.querySelector('[data-timeline-filter-close]')?.addEventListener('click', () => {
      state.timelineFiltersOpen = false;
      render();
    });
    app.querySelector('[data-timeline-filter-backdrop]')?.addEventListener('click', event => {
      if (event.target !== event.currentTarget) return;
      state.timelineFiltersOpen = false;
      render();
    });
    app.querySelectorAll('[data-timeline-type]').forEach(button => button.addEventListener('click', () => {
      state.timelineType = button.dataset.timelineType;
      render();
    }));
    app.querySelector('[data-photo-filter-open]')?.addEventListener('click', () => {
      state.photoFiltersOpen = true;
      render();
    });
    app.querySelector('[data-photo-filter-close]')?.addEventListener('click', () => {
      state.photoFiltersOpen = false;
      render();
    });
    app.querySelector('[data-photo-filter-backdrop]')?.addEventListener('click', event => {
      if (event.target !== event.currentTarget) return;
      state.photoFiltersOpen = false;
      render();
    });
    app.querySelectorAll('[data-photo-favorites]').forEach(button => button.addEventListener('click', () => {
      state.photoFavoritesOnly = button.dataset.photoFavorites === 'true';
      render();
    }));
    app.querySelector('[data-report-filter-open]')?.addEventListener('click', () => {
      state.reportFiltersOpen = true;
      render();
    });
    app.querySelector('[data-report-filter-close]')?.addEventListener('click', () => {
      state.reportFiltersOpen = false;
      render();
    });
    app.querySelector('[data-report-filter-backdrop]')?.addEventListener('click', event => {
      if (event.target !== event.currentTarget) return;
      state.reportFiltersOpen = false;
      render();
    });
    app.querySelector('[data-stats-filter-open]')?.addEventListener('click', () => {
      state.statsFiltersOpen = true;
      render();
    });
    app.querySelector('[data-stats-filter-close]')?.addEventListener('click', () => {
      state.statsFiltersOpen = false;
      render();
    });
    app.querySelector('[data-stats-filter-backdrop]')?.addEventListener('click', event => {
      if (event.target !== event.currentTarget) return;
      state.statsFiltersOpen = false;
      render();
    });

    app.querySelectorAll('[data-week-action]').forEach(button => button.addEventListener('click', async () => {
      await changeSelectedWeek(button.dataset.weekAction);
    }));
    app.querySelector('[data-week-picker]')?.addEventListener('change', async event => {
      if (!event.target.value || event.target.value > todayKey()) return;
      state.selectedWeek = event.target.value;
      state.period = 'week';
      saveWeekSettings();
      await loadAndRenderSelectedWeek();
    });
    app.querySelector('[data-week-start]')?.addEventListener('change', async event => {
      state.weekStartsOn = Number(event.target.value) === 0 ? 0 : 1;
      saveWeekSettings();
      await loadAndRenderSelectedWeek();
    });
    app.querySelectorAll('[data-week-day]').forEach(button => button.addEventListener('click', () => {
      state.selectedDate = button.dataset.weekDay;
      state.period = 'date';
      state.tab = 'activity';
      state.activityView = 'agenda';
      state.timelineScope = state.selectedChildId;
      saveView();
      render();
    }));

    app.querySelector('[data-search]')?.addEventListener('input', event => {
      state.search = event.target.value;
      render();
      requestAnimationFrame(() => {
        const input = app.querySelector('[data-search]');
        input?.focus();
        input?.setSelectionRange(state.search.length, state.search.length);
      });
    });

    app.querySelectorAll('[data-photo-id]').forEach(button => button.addEventListener('click', () => openViewer(button.dataset.photoId)));
    app.querySelectorAll('[data-report-detail]').forEach(details => details.addEventListener('toggle', () => {
      if (details.open) void loadReportDetail(details.dataset.reportDetail, details);
    }));
    app.querySelectorAll('[data-favorite]').forEach(button => button.addEventListener('click', event => {
      event.stopPropagation();
      toggleFavorite(button.dataset.favorite);
      render();
    }));

    app.querySelector('[data-action="download-visible"]')?.addEventListener('click', downloadVisible);
    app.querySelector('[data-action="download-week"]')?.addEventListener('click', downloadSelectedWeek);
    app.querySelector('[data-action="download-favorites"]')?.addEventListener('click', downloadAllFavorites);
    app.querySelector('[data-load-more]')?.addEventListener('click', () => loadMore(app.querySelector('[data-load-more]').dataset.loadMore));

    app.querySelector('[data-viewer="close"]')?.addEventListener('click', closeViewer);
    app.querySelector('[data-viewer="prev"]')?.addEventListener('click', () => stepViewer(-1));
    app.querySelector('[data-viewer="next"]')?.addEventListener('click', () => stepViewer(1));
    app.querySelector('[data-viewer="favorite"]')?.addEventListener('click', toggleViewerFavorite);
    app.querySelector('[data-viewer="download"]')?.addEventListener('click', downloadViewerOriginal);
    app.querySelector('[data-viewer="hide"]')?.addEventListener('click', hideViewerPhoto);
    app.querySelector('[data-unhide-photos]')?.addEventListener('click', () => {
      clearHiddenPhotosForChild(state.selectedChildId);
      state.photoFiltersOpen = false;
      render();
    });
    bindViewerSwipe();
    app.querySelector('#hcfd2-viewer')?.addEventListener('click', event => {
      if (event.target.id === 'hcfd2-viewer') closeViewer();
    });
    runCalendarTransition();
  }

  async function refreshAll() {
    app.innerHTML = '<div class="hcfd2-loading"><div class="hcfd2-spinner"></div><p>Refreshing…</p></div>';
    try {
      await Promise.all(childrenForRefresh().map(child => loadChild(String(child.ChildID), true)));
      void warmRecentPhotoCache(state.children.map(child => String(child.ChildID)));
      if (state.period === 'week') await ensureSelectedWeekLoaded();
      if (state.tab === 'activity' && state.activityView === 'calendar') await ensureCalendarMonthLoaded();
      render();
    } catch (error) {
      renderError(error);
    }
  }

  function setTheme(theme) {
    if (!['light', 'dark', 'system', 'time'].includes(theme)) return;
    state.theme = theme;
    localStorage.setItem(STORAGE.theme, state.theme);
    applyTheme();
    render();
  }

  function resolvedTheme() {
    if (state.theme === 'system') {
      return matchMedia('(prefers-color-scheme: dark)').matches ? 'dark' : 'light';
    }
    if (state.theme === 'time') {
      const hour = new Date().getHours();
      return hour >= 7 && hour < 19 ? 'light' : 'dark';
    }
    return state.theme;
  }

  function applyTheme() {
    overlay?.classList.toggle('dark', resolvedTheme() === 'dark');
  }

  function bindThemePreference() {
    matchMedia('(prefers-color-scheme: dark)').addEventListener?.('change', () => {
      if (state.theme === 'system') applyTheme();
    });
    clearInterval(themeTimer);
    themeTimer = setInterval(() => {
      if (state.theme === 'time') applyTheme();
    }, 60 * 1000);
  }

  function toggleAutoRefresh() {
    state.autoRefresh = !state.autoRefresh;
    localStorage.setItem(STORAGE.autoRefresh, String(state.autoRefresh));
    startAutoRefresh();
    render();
  }

  function notificationApi() {
    return globalThis.Capacitor?.Plugins?.LocalNotifications || null;
  }

  async function toggleNotifications() {
    if (state.notificationsEnabled) {
      state.notificationsEnabled = false;
      localStorage.setItem(STORAGE.notifications, 'false');
      render();
      return;
    }

    const notifications = notificationApi();
    if (!notifications) {
      alert('Native notifications are not available in this browser. Use the installed iOS or Android app.');
      return;
    }

    try {
      let permission = await notifications.checkPermissions();
      if (permission.display !== 'granted') permission = await notifications.requestPermissions();
      if (permission.display !== 'granted') {
        alert('Notification permission was not granted. You can enable it later in the phone’s app settings.');
        return;
      }
      state.notificationsEnabled = true;
      localStorage.setItem(STORAGE.notifications, 'true');
      await scheduleNativeNotification('Honeycomb notifications enabled', 'New photos, reports, and supply requests will appear here when the app detects them.');
      render();
    } catch (error) {
      console.error('[Honeycomb notifications]', error);
      alert('Notifications could not be enabled on this device.');
    }
  }

  async function sendTestNotification() {
    await scheduleNativeNotification('Honeycomb test notification', 'Notifications are working on this phone.');
    state.headerMenuOpen = false;
    render();
  }

  async function notifyChildUpdates(childId, reports, moments) {
    if (!state.notificationsEnabled) return;
    const child = state.children.find(item => String(item.ChildID) === String(childId));
    const name = child?.FirstName || fullName(child || {}) || 'Your child';
    const supplies = reports.filter(report => reportType(report) === 'supplies');
    const otherReports = reports.filter(report => reportType(report) !== 'supplies');

    if (supplies.length) {
      const requested = [...new Set(supplies.map(reportTitle).filter(Boolean))].join(', ');
      await scheduleNativeNotification(`Supplies needed for ${name}`, requested || 'Honeycomb posted a new supply request.');
    }
    if (moments.length) {
      await scheduleNativeNotification(
        `${moments.length} new photo${moments.length === 1 ? '' : 's'} for ${name}`,
        moments.length === 1 ? photoTitle(moments[0]) : 'Open Honeycomb Family to view them.'
      );
    }
    if (otherReports.length) {
      await scheduleNativeNotification(
        `${otherReports.length} new report${otherReports.length === 1 ? '' : 's'} for ${name}`,
        otherReports.length === 1 ? reportTitle(otherReports[0]) : 'Open Honeycomb Family for the latest details.'
      );
    }
  }

  async function scheduleNativeNotification(title, body) {
    const notifications = notificationApi();
    if (!notifications || !state.notificationsEnabled) return;
    const id = notificationId(`${title}:${body}:${Date.now()}`);
    try {
      await notifications.schedule({
        notifications: [{
          id,
          title,
          body,
          sound: 'default',
          extra: { tab: 'home' },
        }],
      });
    } catch (error) {
      console.warn('[Honeycomb notification delivery]', error);
    }
  }

  function notificationId(value) {
    let hash = 0;
    for (let index = 0; index < value.length; index += 1) {
      hash = ((hash << 5) - hash + value.charCodeAt(index)) | 0;
    }
    return Math.max(1, Math.abs(hash || Date.now()) % 2147483647);
  }

  function bindAppResumeRefresh() {
    document.addEventListener('visibilitychange', () => {
      if (document.visibilityState !== 'visible' || !state.overlayOpen || !app) return;
      const now = Date.now();
      if (now - state.lastResumeRefresh < 30000) return;
      state.lastResumeRefresh = now;
      setTimeout(() => {
        if (state.overlayOpen && app) void refreshAll();
      }, 250);
    });
  }

  function startAutoRefresh() {
    stopAutoRefresh();
    if (!state.autoRefresh || !state.overlayOpen) return;
    state.refreshTimer = setInterval(async () => {
      try {
        await Promise.all(childrenForRefresh().map(child => loadChild(String(child.ChildID), true)));
        if (state.period === 'week') await ensureSelectedWeekLoaded();
        if (state.tab === 'activity' && state.activityView === 'calendar') await ensureCalendarMonthLoaded();
        render();
      } catch (error) {
        console.error('[Honeycomb dashboard auto-refresh]', error);
      }
    }, AUTO_REFRESH_MS);
  }

  function stopAutoRefresh() {
    if (state.refreshTimer) clearInterval(state.refreshTimer);
    state.refreshTimer = null;
  }

  async function switchChild(childId) {
    state.selectedChildId = childId;
    state.childPickerOpen = false;
    state.headerMenuOpen = false;
    state.calendarScope = childId;
    state.calendarSelectedDate = null;
    if (state.tab === 'activity') state.timelineScope = childId;
    saveView();
    if (!state.data.get(childId)?.loadedAt) await loadChild(childId, true);
    render();
    if (state.tab === 'activity' && state.activityView === 'calendar') await loadAndRenderCalendarMonth();
  }

  async function switchTab(tab) {
    if (['calendar', 'timeline', 'reports'].includes(tab)) {
      state.activityView = tab === 'calendar' ? 'calendar' : 'agenda';
      state.timelineType = tab === 'reports' ? 'reports' : 'all';
      tab = 'activity';
    }
    state.tab = tab;
    state.mobileMoreOpen = false;
    state.childPickerOpen = false;
    state.headerMenuOpen = false;
    state.timelineFiltersOpen = false;
    state.photoFiltersOpen = false;
    state.reportFiltersOpen = false;
    state.statsFiltersOpen = false;
    state.search = '';
    if (tab === 'activity') {
      state.timelineScope = state.selectedChildId;
      state.calendarScope = state.selectedChildId;
    }
    resetRangeForTab(tab);
    saveView();
    render();
    if (tab === 'activity' && state.activityView === 'calendar') {
      await loadAndRenderCalendarMonth();
    } else if (usesCurrentWeekByDefault(tab)) {
      await loadAndRenderSelectedWeek();
    }
  }

  function resetRangeForTab(tab) {
    if (tab === 'home') {
      state.homeView = 'day';
      state.period = 'today';
      state.selectedDate = todayKey();
      return;
    }

    if (tab === 'activity' && state.activityView === 'calendar') {
      state.calendarMonth = todayKey().slice(0, 7);
      state.calendarSelectedDate = null;
      state.period = 'today';
      return;
    }

    if (['photos', 'favorites'].includes(tab)) {
      state.period = 'all';
      return;
    }

    if (tab === 'activity' && isPhoneLayout()) {
      state.period = 'all';
      return;
    }

    if (usesCurrentWeekByDefault(tab)) {
      state.selectedWeek = todayKey();
      state.period = 'week';
      saveWeekSettings();
      return;
    }

    state.period = 'today';
  }

  function usesCurrentWeekByDefault(tab) {
    return ['activity', 'stats'].includes(tab);
  }

  function saveView() {
    localStorage.setItem(STORAGE.child, state.selectedChildId);
  }

  async function loadMore(type, automatic = false) {
    if (state.loadingMore) return;
    const childId = state.selectedChildId;
    const current = state.data.get(childId);
    if (!current) return;
    state.loadingMore = true;
    const button = app.querySelector('[data-load-more]');
    if (button) {
      button.disabled = true;
      button.textContent = 'Loading…';
    }
    try {
      if (type === 'moments' || type === 'both') {
        const moments = await postJson(API.moments, { ChildID: childId, PageNumber: current.momentPage, PageSize: PAGE_SIZE });
        current.moments = dedupe([...current.moments, ...flattenGroups(moments.Data)], 'DailyMomentId');
        current.momentCount = Number(moments.Count || current.momentCount);
        current.momentPage += 1;
      }
      if (type === 'reports' || type === 'both') {
        const reports = await postJson(API.reports, { ChildID: childId, PageNumber: current.reportPage, PageSize: PAGE_SIZE });
        current.reports = dedupe([...current.reports, ...flattenGroups(reports.Data)], 'DailyReportId');
        current.reportCount = Number(reports.Count || current.reportCount);
        current.reportPage += 1;
      }
      state.data.set(childId, current);
      state.loadingMore = false;
      state.suppressViewAnimation = automatic;
      render();
    } catch (error) {
      state.loadingMore = false;
      alert(error.message);
      render();
    }
  }

function openViewer(photoId) {
    let ownerId = state.selectedChildId;
    let ownerData = getSelectedData();

    for (
        const [childId, childData]
        of state.data.entries()
    ) {
        const containsPhoto =
            childData.moments.some(
                moment =>
                    String(
                        moment.DailyMomentId
                    ) === String(photoId)
            );

        if (containsPhoto) {
            ownerId = childId;
            ownerData = childData;
            break;
        }
    }

    let items =
        (state.tab === 'favorites' || (state.tab === 'photos' && state.photoFavoritesOnly))
            ? favoriteMoments(
                visiblePhotosForChild(ownerData.moments, ownerId)
            )
            : visiblePhotosForChild(ownerData.moments, ownerId);

    items = filterPeriod(
        items,
        state.period
    ).filter(
        moment =>
            photoMatches(
                moment,
                state.search
            )
    );

    let index = items.findIndex(
        moment =>
            String(
                moment.DailyMomentId
            ) === String(photoId)
    );

    // A photo clicked from the home page may
    // be outside the selected date filter.
    if (index < 0) {
        items = visiblePhotosForChild(ownerData.moments, ownerId);

        index = items.findIndex(
            moment =>
                String(
                    moment.DailyMomentId
                ) === String(photoId)
        );
    }

    if (index < 0) {
        return;
    }

    state.selectedChildId = ownerId;

    localStorage.setItem(
        STORAGE.child,
        ownerId
    );

    state.slideshow = {
        items,
        index,
        ownerId
    };

    const viewer =
        app.querySelector(
            '#hcfd2-viewer'
        );

    viewer.hidden = false;
    void updateViewer();
}

 async function updateViewer(direction = 0) {
    const viewer =
        app.querySelector(
            '#hcfd2-viewer'
        );

    const moment =
        state.slideshow.items[
            state.slideshow.index
        ];

    if (!viewer || !moment) {
        return;
    }

    const figure = viewer.querySelector('figure:not(.hcfd2-viewer-outgoing)');
    const image = figure.querySelector('img');

    const originalUrl =
        imageUrl(moment.Filename);

    const fallbackUrl =
        imageUrl(
            moment.Filename,
            'moment-image-thumb'
        );

    const updateToken = ++viewerUpdateToken;
    const outgoing = direction ? figure.cloneNode(true) : null;
    figure.classList.remove('hcfd2-viewer-loading-full');
    image.onload = null;
    image.onerror = null;
    image.src = fallbackUrl;
    image.alt =
        photoTitle(moment);

    viewer.querySelector(
        'figcaption strong'
    ).textContent =
        photoTitle(moment);

    viewer.querySelector(
        'figcaption span'
    ).textContent =
        moment.Lesson || '';

    viewer.querySelector(
        'figcaption small'
    ).textContent =
        longDateTime(
            itemTimestamp(moment)
        );

    viewerZoomScale = 1;
    viewerZoomX = 0;
    viewerZoomY = 0;
    image.style.transform = '';

    const favorite =
        isFavorite(
            moment.DailyMomentId
        );

    viewer.querySelector(
        '[data-viewer="favorite"]'
    ).textContent =
        favorite
            ? '★ Favorited'
            : '☆ Favorite';
    const saveButton = viewer.querySelector('[data-viewer="download"]');
    const alreadySaved = isOriginalSaved(moment);
    if (saveButton) {
      saveButton.textContent = alreadySaved ? '✓ Saved to Photos' : 'Save original';
      saveButton.disabled = alreadySaved;
    }
    const previousButton = viewer.querySelector('[data-viewer="prev"]');
    const nextButton = viewer.querySelector('[data-viewer="next"]');
    if (previousButton) previousButton.disabled = !canNavigateViewer(-1);
    if (nextButton) nextButton.disabled = !canNavigateViewer(1);

    const locallyReady = await isPhotoLocallyReady(moment);
    if (updateToken !== viewerUpdateToken || viewer.hidden) return;
    if (!locallyReady) figure.classList.add('hcfd2-viewer-loading-full');

    let displayUrl = originalUrl;
    try {
      displayUrl = await photoDisplayUrl(moment);
    } catch {
      displayUrl = originalUrl;
    }
    if (updateToken !== viewerUpdateToken || viewer.hidden) return;

    image.onload = () => figure.classList.remove('hcfd2-viewer-loading-full');
    image.onerror = () => {
      image.onerror = null;
      image.onload = null;
      image.src = fallbackUrl;
      figure.classList.remove('hcfd2-viewer-loading-full');
    };
    image.src = displayUrl;

    if (direction && outgoing && !matchMedia('(prefers-reduced-motion: reduce)').matches) {
      outgoing.classList.add('hcfd2-viewer-outgoing');
      viewer.appendChild(outgoing);
      figure.getAnimations().forEach(animation => animation.cancel());
      outgoing.animate([
        { opacity: 1, transform: 'translateX(0) scale(1)' },
        { opacity: 0, transform: `translateX(${direction > 0 ? -120 : 120}px) rotate(${direction > 0 ? -11 : 11}deg) scale(0.74)` },
      ], { duration: 340, easing: 'cubic-bezier(.35,0,.2,1)' }).finished.finally(() => outgoing.remove());
      figure.animate([
        { opacity: 0.35, transform: `translateX(${direction > 0 ? 110 : -110}px) rotate(${direction > 0 ? 4 : -4}deg) scale(0.92)` },
        { opacity: 1, transform: 'translateX(0) scale(1)' },
      ], { duration: 340, easing: 'cubic-bezier(.16,.84,.24,1)' });
    }
    void extendViewerHistoryIfNeeded(direction || 1).then(() => prefetchViewerPhotos(direction || 1));
}

  function stepViewer(direction) {
    if (!canNavigateViewer(direction)) return;
    state.slideshow.index += direction;
    void updateViewer(direction);
  }

  function canNavigateViewer(direction) {
    const { items, index } = state.slideshow;
    const nextIndex = index + direction;
    if (!direction || nextIndex < 0 || nextIndex >= items.length) return false;
    return true;
  }

  async function extendViewerHistoryIfNeeded(direction) {
    if (direction < 0 || viewerHistoryLoading) return viewerHistoryLoading;
    const { items, index, ownerId } = state.slideshow;
    const data = state.data.get(ownerId);
    if (!items.length || !data || data.moments.length >= data.momentCount) return;
    const currentDate = parseLocalDay(dayKey(items[index]));
    const oldestDate = parseLocalDay(dayKey(items[items.length - 1]));
    if (!currentDate || !oldestDate) return;
    const daysFromLoadedEdge = Math.round((currentDate.getTime() - oldestDate.getTime()) / 86400000);
    if (daysFromLoadedEdge > 3) return;

    viewerHistoryLoading = (async () => {
      const response = await postJson(API.moments, {
        ChildID: ownerId,
        PageNumber: data.momentPage,
        PageSize: PAGE_SIZE,
      });
      const currentId = String(items[index].DailyMomentId);
      data.moments = dedupe([...data.moments, ...flattenGroups(response.Data)], 'DailyMomentId');
      data.momentCount = Number(response.Count || data.momentCount);
      data.momentPage += 1;
      state.data.set(ownerId, data);
      const knownIds = new Set(state.slideshow.items.map(moment => String(moment.DailyMomentId)));
      const added = visiblePhotosForChild(data.moments, ownerId).filter(moment => !knownIds.has(String(moment.DailyMomentId)) && photoMatches(moment, state.search));
      state.slideshow.items = dedupe([...state.slideshow.items, ...added], 'DailyMomentId');
      state.slideshow.index = state.slideshow.items.findIndex(moment => String(moment.DailyMomentId) === currentId);
    })().catch(error => {
      console.warn('[Honeycomb viewer history prefetch]', error);
    }).finally(() => { viewerHistoryLoading = null; });
    return viewerHistoryLoading;
  }

  function bindViewerSwipe() {
    const viewer = app.querySelector('#hcfd2-viewer');
    if (!viewer) return;
    let gesture = null;
    let dragPreviewToken = 0;
    let pinch = null;
    let pan = null;

    const zoomImage = () => viewer.querySelector('figure:not(.hcfd2-viewer-outgoing):not(.hcfd2-viewer-drag-preview) img');

    const applyViewerZoom = () => {
      const image = zoomImage();
      if (!image) return;
      if (viewerZoomScale <= 1.01) {
        viewerZoomScale = 1;
        viewerZoomX = 0;
        viewerZoomY = 0;
      } else {
        const maxX = Math.max(0, image.clientWidth * (viewerZoomScale - 1) / 2);
        const maxY = Math.max(0, image.clientHeight * (viewerZoomScale - 1) / 2);
        viewerZoomX = Math.min(maxX, Math.max(-maxX, viewerZoomX));
        viewerZoomY = Math.min(maxY, Math.max(-maxY, viewerZoomY));
      }
      image.style.transform = `translate(${viewerZoomX}px, ${viewerZoomY}px) scale(${viewerZoomScale})`;
    };

    const touchDistance = touches => Math.hypot(
      touches[1].clientX - touches[0].clientX,
      touches[1].clientY - touches[0].clientY,
    );

    viewer.addEventListener('touchstart', event => {
      if (event.touches.length === 2) {
        pinch = { distance: touchDistance(event.touches), scale: viewerZoomScale };
        pan = null;
        gesture = null;
        dragPreviewToken += 1;
        viewer.querySelector('.hcfd2-viewer-drag-preview')?.remove();
        event.preventDefault();
      } else if (event.touches.length === 1 && viewerZoomScale > 1.01 && !event.target.closest('figcaption, button, a')) {
        const touch = event.touches[0];
        pan = { x: touch.clientX, y: touch.clientY, originX: viewerZoomX, originY: viewerZoomY };
        event.preventDefault();
      }
    }, { passive: false });

    viewer.addEventListener('touchmove', event => {
      if (pinch && event.touches.length === 2) {
        viewerZoomScale = Math.min(4, Math.max(1, pinch.scale * touchDistance(event.touches) / Math.max(1, pinch.distance)));
        applyViewerZoom();
        event.preventDefault();
      } else if (pan && event.touches.length === 1 && viewerZoomScale > 1.01) {
        const touch = event.touches[0];
        viewerZoomX = pan.originX + touch.clientX - pan.x;
        viewerZoomY = pan.originY + touch.clientY - pan.y;
        applyViewerZoom();
        event.preventDefault();
      }
    }, { passive: false });

    viewer.addEventListener('touchend', event => {
      if (event.touches.length < 2) pinch = null;
      if (event.touches.length === 0) pan = null;
      if (event.touches.length === 1 && viewerZoomScale > 1.01) {
        const touch = event.touches[0];
        pan = { x: touch.clientX, y: touch.clientY, originX: viewerZoomX, originY: viewerZoomY };
      }
    }, { passive: true });

    const removePreview = () => {
      viewer.querySelector('.hcfd2-viewer-drag-preview')?.remove();
    };

    const preparePreview = async direction => {
      const { items, index } = state.slideshow;
      if (items.length < 2 || !canNavigateViewer(direction)) return;
      const token = ++dragPreviewToken;
      const nextIndex = index + direction;
      const moment = items[nextIndex];
      const current = viewer.querySelector('figure:not(.hcfd2-viewer-outgoing):not(.hcfd2-viewer-drag-preview)');
      if (!current) return;
      const preview = current.cloneNode(true);
      preview.classList.add('hcfd2-viewer-drag-preview');
      preview.classList.remove('hcfd2-viewer-loading-full');
      preview.dataset.direction = String(direction);
      const previewImage = preview.querySelector('img');
      const fallbackUrl = imageUrl(moment.Filename, 'moment-image-thumb');
      previewImage.src = fallbackUrl;
      previewImage.alt = photoTitle(moment);
      preview.querySelector('figcaption strong').textContent = photoTitle(moment);
      preview.querySelector('figcaption span').textContent = moment.Lesson || '';
      preview.querySelector('figcaption small').textContent = longDateTime(itemTimestamp(moment));
      preview.querySelector('[data-viewer="favorite"]').textContent = isFavorite(moment.DailyMomentId) ? '★ Favorited' : '☆ Favorite';
      removePreview();
      viewer.appendChild(preview);
      gesture.preview = preview;
      positionDragFigures(gesture);
      try {
        if (!(await isPhotoLocallyReady(moment))) preview.classList.add('hcfd2-viewer-loading-full');
        const fullUrl = await photoDisplayUrl(moment);
        if (!gesture || token !== dragPreviewToken || gesture.preview !== preview) return;
        previewImage.onload = () => preview.classList.remove('hcfd2-viewer-loading-full');
        previewImage.onerror = () => {
          previewImage.onerror = null;
          previewImage.src = fallbackUrl;
          preview.classList.remove('hcfd2-viewer-loading-full');
        };
        previewImage.src = fullUrl;
      } catch {
        preview.classList.remove('hcfd2-viewer-loading-full');
      }
    };

    const positionDragFigures = activeGesture => {
      const current = viewer.querySelector('figure:not(.hcfd2-viewer-outgoing):not(.hcfd2-viewer-drag-preview)');
      if (!current || !activeGesture.direction) return;
      const width = viewer.clientWidth;
      const progress = Math.min(1, Math.abs(activeGesture.dx) / Math.max(1, width));
      const currentRotation = (activeGesture.dx / Math.max(1, width)) * 11;
      current.style.transform = `translateX(${activeGesture.dx}px) rotate(${currentRotation}deg) scale(${1 - progress * 0.22})`;
      current.style.opacity = String(1 - progress * 0.35);
      current.style.transition = 'none';
      if (activeGesture.preview) {
        const previewProgress = Math.min(1, Math.abs(activeGesture.dx) / Math.max(1, width));
        const previewRotation = activeGesture.direction * (1 - previewProgress) * 5;
        activeGesture.preview.style.transform = `translateX(${activeGesture.dx + activeGesture.direction * width}px) rotate(${previewRotation}deg) scale(${0.92 + previewProgress * 0.08})`;
        activeGesture.preview.style.opacity = String(0.45 + previewProgress * 0.55);
        activeGesture.preview.style.transition = 'none';
      }
    };

    viewer.addEventListener('pointerdown', event => {
      if (event.pointerType === 'mouse' || !event.isPrimary || event.target.closest('figcaption, button, a')) return;
      if (pinch || viewerZoomScale > 1.01) return;
      removePreview();
      gesture = { id: event.pointerId, x: event.clientX, y: event.clientY, dx: 0, direction: 0, preview: null, startedAt: performance.now() };
      viewer.setPointerCapture?.(event.pointerId);
    });
    viewer.addEventListener('pointermove', event => {
      if (!gesture || gesture.id !== event.pointerId) return;
      const dx = event.clientX - gesture.x;
      const dy = event.clientY - gesture.y;
      if (!gesture.direction && (Math.abs(dx) < 8 || Math.abs(dx) < Math.abs(dy))) return;
      const direction = dx < 0 ? 1 : -1;
      if (direction !== gesture.direction) {
        gesture.direction = direction;
        gesture.preview = null;
        removePreview();
        void preparePreview(direction);
      }
      gesture.dx = dx;
      event.preventDefault();
      positionDragFigures(gesture);
    });

    const finishGesture = async (event, cancelled = false) => {
      if (!gesture || (event && gesture.id !== event.pointerId)) return;
      const finished = gesture;
      gesture = null;
      dragPreviewToken += 1;
      const current = viewer.querySelector('figure:not(.hcfd2-viewer-outgoing):not(.hcfd2-viewer-drag-preview)');
      if (!current || !finished.direction) return;
      const width = viewer.clientWidth;
      const velocity = Math.abs(finished.dx) / Math.max(1, performance.now() - finished.startedAt);
      const commit = !cancelled && Boolean(finished.preview) && (Math.abs(finished.dx) >= width * 0.24 || velocity > 0.65);
      const duration = matchMedia('(prefers-reduced-motion: reduce)').matches ? 0 : 320;
      current.style.transition = `transform ${duration}ms cubic-bezier(.2,.8,.2,1), opacity ${duration}ms ease`;
      if (finished.preview) finished.preview.style.transition = current.style.transition;
      requestAnimationFrame(() => {
        current.style.transform = commit
          ? `translateX(${-finished.direction * width}px) rotate(${-finished.direction * 14}deg) scale(0.68)`
          : 'translateX(0) rotate(0) scale(1)';
        current.style.opacity = commit ? '0' : '1';
        if (finished.preview) {
          finished.preview.style.transform = commit
            ? 'translateX(0) rotate(0) scale(1)'
            : `translateX(${finished.direction * width}px) rotate(${finished.direction * 5}deg) scale(0.92)`;
          finished.preview.style.opacity = commit ? '1' : '0.45';
        }
      });
      await new Promise(resolve => setTimeout(resolve, duration));
      current.style.transition = '';
      current.style.transform = '';
      current.style.opacity = '';
      if (commit) {
        state.slideshow.index += finished.direction;
        await updateViewer(0);
      }
      finished.preview?.remove();
      if (commit) prefetchViewerPhotos(finished.direction);
    };

    viewer.addEventListener('pointercancel', event => { void finishGesture(event, true); });
    viewer.addEventListener('pointerup', event => {
      if (!gesture || gesture.id !== event.pointerId) return;
      event.preventDefault();
      void finishGesture(event);
    });
  }

  async function downloadViewerOriginal() {
    const moment = state.slideshow.items[state.slideshow.index];
    if (!moment || isOriginalSaved(moment)) return;
    const url = imageUrl(moment.Filename);
    const downloads = globalThis.HoneycombPhotoDownloads;
    const filename = downloads?.safeFilename(photoTitle(moment)) || 'Honeycomb-photo.jpg';
    const button = app?.querySelector('[data-viewer="download"]');
    pendingPhotoSaveKey = photoSaveKey(moment);
    if (button) {
      button.disabled = true;
      button.textContent = 'Preparing original…';
    }
    try {
      const response = await photoResponse(moment);
      if (!downloads) throw new Error('The download service is unavailable.');
      const result = await downloads.save({ response, sourceUrl: url, filename });
      if (!result.native) {
        markOriginalSaved(pendingPhotoSaveKey);
        pendingPhotoSaveKey = null;
      }
      if (button) {
        button.textContent = result.native ? 'Saving to Photos…' : '✓ Saved to Photos';
        button.disabled = true;
      }
    } catch (error) {
      alert(`The original photo could not be saved: ${error.message}`);
      pendingPhotoSaveKey = null;
      if (button) button.textContent = 'Save failed';
      setTimeout(() => {
        if (!button?.isConnected) return;
        button.disabled = false;
        button.textContent = 'Save original';
      }, 1800);
    }
  }

  function handleDownloadStatus(message) {
    const status = String(message || '');
    const finished = /^Photo saved/i.test(status);
    const failed = /^Photo (download|save) failed|^Photo download blocked/i.test(status);
    const completedKey = pendingPhotoSaveKey;
    if (finished && completedKey) markOriginalSaved(completedKey);
    if (finished || failed) pendingPhotoSaveKey = null;
    const moment = state.slideshow.items[state.slideshow.index];
    const button = app?.querySelector('[data-viewer="download"]');
    if (!button || (completedKey && photoSaveKey(moment) !== completedKey)) return;
    button.textContent = finished ? '✓ Saved to Photos' : failed ? 'Save failed' : 'Saving to Photos…';
    button.disabled = !failed;
    if (failed) {
      setTimeout(() => {
        if (!button.isConnected) return;
        button.disabled = false;
        button.textContent = 'Save original';
      }, 5000);
    }
  }

  function photoSaveKey(moment) {
    if (!moment) return '';
    const childId = state.slideshow.ownerId || moment.ChildID || state.selectedChildId || '';
    return `${childId}:${moment.DailyMomentId || moment.Filename || ''}`;
  }

  function savedOriginals() {
    return new Set(readJson(STORAGE.savedPhotos, []).map(String));
  }

  function isOriginalSaved(moment) {
    return savedOriginals().has(photoSaveKey(moment));
  }

  function markOriginalSaved(key) {
    if (!key) return;
    const saved = savedOriginals();
    saved.add(key);
    localStorage.setItem(STORAGE.savedPhotos, JSON.stringify([...saved]));
  }

  function hiddenPhotoKey(moment, childId) {
    if (!moment) return '';
    const ownerId = childId || moment.ChildID || state.slideshow.ownerId || state.selectedChildId || '';
    return `${ownerId}:${moment.DailyMomentId || moment.Filename || ''}`;
  }

  function hiddenPhotos() {
    return new Set(readJson(STORAGE.hiddenPhotos, []).map(String));
  }

  function isPhotoHidden(moment, childId) {
    return hiddenPhotos().has(hiddenPhotoKey(moment, childId));
  }

  function visiblePhotosForChild(moments, childId) {
    return (moments || []).filter(moment => !isPhotoHidden(moment, childId));
  }

  function hiddenPhotoCountForChild(childId) {
    const prefix = `${childId || ''}:`;
    return [...hiddenPhotos()].filter(key => key.startsWith(prefix)).length;
  }

  function clearHiddenPhotosForChild(childId) {
    const prefix = `${childId || ''}:`;
    const remaining = [...hiddenPhotos()].filter(key => !key.startsWith(prefix));
    localStorage.setItem(STORAGE.hiddenPhotos, JSON.stringify(remaining));
  }

  function hideViewerPhoto() {
    const moment = state.slideshow.items[state.slideshow.index];
    if (!moment || !confirm('Hide this photo from your Honeycomb app? You can restore hidden photos from the photo filters.')) return;
    const hidden = hiddenPhotos();
    hidden.add(hiddenPhotoKey(moment, state.slideshow.ownerId));
    localStorage.setItem(STORAGE.hiddenPhotos, JSON.stringify([...hidden]));
    closeViewer();
    render();
  }

  function closeViewer() {
    const viewer = app.querySelector('#hcfd2-viewer');
    if (viewer) viewer.hidden = true;
    viewerUpdateToken += 1;
    clearPhotoObjectUrls();
  }

  function handleNativeBack() {
    if (!state.overlayOpen || !app) return false;
    if (app.querySelector('#hcfd2-viewer:not([hidden])')) {
      closeViewer();
      return true;
    }
    if (state.avatarEditor) {
      closeAvatarEditor();
      return true;
    }
    if (app.querySelector('[data-calendar-modal]')) {
      state.calendarSelectedDate = null;
      render();
      return true;
    }
    if (state.supplyAlertsOpen) {
      state.supplyAlertsOpen = false;
      render();
      return true;
    }
    if (state.timelineFiltersOpen || state.photoFiltersOpen || state.reportFiltersOpen || state.statsFiltersOpen) {
      state.timelineFiltersOpen = false;
      state.photoFiltersOpen = false;
      state.reportFiltersOpen = false;
      state.statsFiltersOpen = false;
      render();
      return true;
    }
    if (state.mobileMoreOpen || state.childPickerOpen || state.headerMenuOpen) {
      state.mobileMoreOpen = false;
      state.childPickerOpen = false;
      state.headerMenuOpen = false;
      render();
      return true;
    }
    if (state.tab !== 'home') {
      switchTab('home');
      return true;
    }
    closeDashboard();
    return true;
  }

  function toggleViewerFavorite() {
    const moment = state.slideshow.items[state.slideshow.index];
    if (!moment) return;
    toggleFavorite(moment.DailyMomentId);
    void updateViewer();
  }

  function getFavorites() {
    try {
      const value = JSON.parse(localStorage.getItem(STORAGE.favorites) || '[]');
      return new Set(Array.isArray(value) ? value.map(String) : []);
    } catch {
      return new Set();
    }
  }

  function isFavorite(id) {
    return getFavorites().has(String(id));
  }

  function toggleFavorite(id) {
    const favorites = getFavorites();
    const key = String(id);
    favorites.has(key) ? favorites.delete(key) : favorites.add(key);
    localStorage.setItem(STORAGE.favorites, JSON.stringify([...favorites]));
  }

  function favoriteMoments(moments) {
    const favorites = getFavorites();
    return moments.filter(moment => favorites.has(String(moment.DailyMomentId)));
  }

  function downloadVisible() {
    const data = getSelectedData();
    const visible = visiblePhotosForChild(data.moments, state.selectedChildId);
    let moments = state.tab === 'favorites' ? favoriteMoments(visible) : visible;
    moments = filterPeriod(moments, state.period).filter(moment => photoMatches(moment, state.search));
    downloadMomentBatch(moments);
  }

  function downloadSelectedWeek() {
    downloadMomentBatch(filterSelectedWeek(visiblePhotosForChild(getSelectedData().moments, state.selectedChildId)));
  }

  function downloadAllFavorites() {
    downloadMomentBatch(favoriteMoments(visiblePhotosForChild(getSelectedData().moments, state.selectedChildId)));
  }

  function downloadMomentBatch(moments) {
    if (!moments.length) return;
    const batch = moments.slice(0, 20);
    batch.forEach((moment, index) => setTimeout(() => {
      const link = document.createElement('a');
      link.href = imageUrl(moment.Filename);
      const child = getSelectedChild();
      const safeName = `${child?.FirstName || 'Honeycomb'}_${dayKey(moment) || 'photo'}_${moment.DailyMomentId || index}.jpg`.replace(/[^a-z0-9_.-]+/gi, '_');
      link.download = safeName;
      link.target = '_blank';
      link.rel = 'noopener';
      document.body.appendChild(link);
      link.click();
      link.remove();
    }, index * 250));
    if (moments.length > 20) alert('Opened the first 20 visible photos. Browsers often block larger automatic batches.');
  }

  function isNewItem(kind, id) {
    return state.newItemIds.has(`${kind}:${id}`);
  }

  function scheduleNewItemFade() {
    if (!state.newItemIds.size) return;
    clearTimeout(newItemTimer);
    newItemTimer = setTimeout(() => {
      state.newItemIds.clear();
      app?.querySelectorAll('.hcfd2-new-item').forEach(element => element.classList.remove('hcfd2-new-item'));
    }, 12000);
  }

  function markSeen(child, data) {
    const map = readJson(STORAGE.lastSeen, {});
    map[String(child.ChildID)] = {
      moments: newestTimestamp(data.moments),
      reports: newestTimestamp(data.reports),
    };
    localStorage.setItem(STORAGE.lastSeen, JSON.stringify(map));
  }

  function unseenCount(childId) {
    const data = state.data.get(childId);
    if (!data) return 0;
    const seen = readJson(STORAGE.lastSeen, {})[childId];
    if (!seen) return 0;
    return visiblePhotosForChild(data.moments, childId).filter(m => itemTimestamp(m) > (seen.moments || '')).length + data.reports.filter(r => itemTimestamp(r) > (seen.reports || '')).length;
  }

  function newestTimestamp(items) {
    return items.map(itemTimestamp).filter(Boolean).sort().at(-1) || '';
  }

  function getSelectedChild() {
    return state.children.find(child => String(child.ChildID) === state.selectedChildId) || state.children[0];
  }

  function getSelectedData() {
    return state.data.get(state.selectedChildId) || emptyChildData();
  }

  function childrenForRefresh() {
    if (!isPhoneLayout() || state.children.length <= 2) return state.children;
    const loaded = state.children.filter(child => state.data.has(String(child.ChildID)));
    return loaded.length ? loaded : state.children.filter(child => String(child.ChildID) === state.selectedChildId);
  }

  function isPhoneLayout() {
    return matchMedia('(max-width: 600px)').matches;
  }

  function updateStickyChildContext() {
    if (!isPhoneLayout() || !app) return;
    const chip = app.querySelector('.hcfd2-sticky-child');
    if (!chip) return;
    const reference = app.querySelector('.hcfd2-children, .hcfd2-child-picker-wrap') || app.querySelector('.hcfd2-header');
    const overlayActive = state.childPickerOpen
      || state.mobileMoreOpen
      || state.supplyAlertsOpen
      || state.timelineFiltersOpen
      || state.photoFiltersOpen
      || state.reportFiltersOpen
      || state.statsFiltersOpen
      || Boolean(app.querySelector('#hcfd2-viewer:not([hidden]), .hcfd2-avatar-modal, .hcfd2-calendar-modal'));
    const shouldShow = !overlayActive && reference && reference.getBoundingClientRect().bottom <= 8;
    chip.classList.toggle('visible', Boolean(shouldShow));
  }

  function childrenForHome() {
    const selected = getSelectedChild();
    return isPhoneLayout() && selected ? [selected] : state.children;
  }

  function filterPeriod(items, period) {
    if (period === 'all') {
        return items;
    }

    if (period === 'week') {
        return filterSelectedWeek(items);
    }

    if (period === 'date') {
        return items.filter(item => String(item?.timestamp || itemTimestamp(item) || '').slice(0, 10) === state.selectedDate);
    }

    const timestampFor = item =>
        String(
            item?.timestamp ||
            itemTimestamp(item) ||
            ''
        );

    const dayFor = item =>
        timestampFor(item).slice(0, 10);

    const now = startDay(new Date());
    const threshold = new Date(now);

    if (period === 'today') {
        const key = todayKey();

        return items.filter(
            item => dayFor(item) === key
        );
    }

    if (period === 'yesterday') {
        threshold.setDate(
            threshold.getDate() - 1
        );

        const key = localDayKey(threshold);

        return items.filter(
            item => dayFor(item) === key
        );
    }

    threshold.setDate(
        threshold.getDate() - 29
    );

    return items.filter(item => {
        const date = new Date(
            timestampFor(item)
        );

        return (
            !Number.isNaN(date.getTime()) &&
            date >= threshold
        );
    });
}

  function selectedWeekRange() {
    let picked = parseLocalDay(state.selectedWeek) || startDay(new Date());
    if (picked > new Date()) picked = startDay(new Date());
    const start = new Date(picked);
    const offset = (start.getDay() - state.weekStartsOn + 7) % 7;
    start.setDate(start.getDate() - offset);
    const end = new Date(start);
    end.setDate(end.getDate() + 6);
    return { start, end };
  }

  function weekRangeForDate(value) {
    const start = startDay(new Date(value));
    const offset = (start.getDay() - state.weekStartsOn + 7) % 7;
    start.setDate(start.getDate() - offset);
    const end = new Date(start);
    end.setDate(end.getDate() + 6);
    return { start, end };
  }

  function formatCompactWeekRange(start, end) {
    const startText = new Intl.DateTimeFormat(undefined, { month: 'short', day: 'numeric' }).format(start);
    const endText = new Intl.DateTimeFormat(undefined, { month: 'short', day: 'numeric' }).format(end);
    return `${startText}–${endText}`;
  }

  function filterSelectedWeek(items) {
    const { start, end } = selectedWeekRange();
    const startKey = localDayKey(start);
    const endKey = localDayKey(end);
    return items.filter(item => {
      const key = String(item?.timestamp || itemTimestamp(item) || '').slice(0, 10);
      return key >= startKey && key <= endKey;
    });
  }

  async function changeSelectedWeek(action) {
    const base = action === 'today'
      ? startDay(new Date())
      : selectedWeekRange().start;
    if (action === 'previous') base.setDate(base.getDate() - 7);
    if (action === 'next') base.setDate(base.getDate() + 7);
    if (base > new Date()) base.setTime(startDay(new Date()).getTime());
    state.selectedWeek = localDayKey(base);
    state.period = 'week';
    saveWeekSettings();
    await loadAndRenderSelectedWeek();
  }

  async function changeCalendarMonth(action) {
    const current = parseLocalDay(`${state.calendarMonth}-01`) || startDay(new Date());
    if (action === 'today') {
      state.calendarMonth = todayKey().slice(0, 7);
    } else {
      current.setMonth(current.getMonth() + (action === 'previous' ? -1 : 1));
      state.calendarMonth = localDayKey(current).slice(0, 7);
    }
    if (state.calendarMonth > todayKey().slice(0, 7)) state.calendarMonth = todayKey().slice(0, 7);
    state.calendarSelectedDate = null;
    await loadAndRenderCalendarMonth();
  }

  async function stepCalendarDay(direction) {
    const selected = parseLocalDay(state.calendarSelectedDate);
    if (!selected || !direction) return;
    selected.setDate(selected.getDate() + direction);
    if (localDayKey(selected) > todayKey()) return;
    if (isPhoneLayout()) state.calendarTransitionDirection = direction;
    state.calendarSelectedDate = localDayKey(selected);
    const nextMonth = state.calendarSelectedDate.slice(0, 7);
    if (nextMonth !== state.calendarMonth) {
      state.calendarMonth = nextMonth;
      await loadAndRenderCalendarMonth();
    } else {
      render();
      requestAnimationFrame(() => app.querySelector('.hcfd2-calendar-detail')?.focus());
    }
  }

  function runCalendarTransition() {
    const direction = state.calendarTransitionDirection;
    const calendar = app.querySelector('[data-calendar-swipe]');
    if (!direction || !calendar) return;
    state.calendarTransitionDirection = 0;
    if (matchMedia('(prefers-reduced-motion: reduce)').matches) return;
    const targets = calendar.querySelectorAll('.hcfd2-agenda-week, .hcfd2-agenda-list');
    targets.forEach((target, index) => target.animate([
      { opacity: 0.15, transform: `translateX(${direction > 0 ? 28 : -28}px)` },
      { opacity: 1, transform: 'translateX(0)' },
    ], { duration: 210 + index * 25, easing: 'cubic-bezier(.2,.8,.2,1)' }));
  }

  function bindCalendarSwipe() {
    const calendar = app.querySelector('[data-calendar-swipe]');
    const surface = isPhoneLayout() ? app.querySelector('.hcfd2-main') : calendar;
    if (!surface || !calendar) return;
    surface.style.touchAction = 'pan-y';
    let gesture = null;
    const targets = () => [...calendar.querySelectorAll('.hcfd2-agenda-week, .hcfd2-agenda-list')];
    surface.addEventListener('pointerdown', event => {
      if (event.pointerType === 'mouse' || !event.isPrimary) return;
      const bounds = surface.getBoundingClientRect();
      if (isPhoneLayout() && (event.clientX <= bounds.left + 28 || event.clientX >= bounds.right - 28)) return;
      gesture = { id: event.pointerId, x: event.clientX, y: event.clientY, dx: 0, dragging: false, startedAt: performance.now() };
      surface.setPointerCapture?.(event.pointerId);
    });
    surface.addEventListener('pointermove', event => {
      if (!gesture || gesture.id !== event.pointerId) return;
      const dx = event.clientX - gesture.x;
      const dy = event.clientY - gesture.y;
      if (!gesture.dragging && (Math.abs(dx) < 8 || Math.abs(dx) < Math.abs(dy) * 1.15)) return;
      gesture.dragging = true;
      gesture.dx = dx;
      event.preventDefault();
      const width = Math.max(1, surface.clientWidth);
      const progress = Math.min(1, Math.abs(dx) / width);
      targets().forEach((target, index) => {
        target.style.transition = 'none';
        target.style.transform = `translateX(${dx}px) rotate(${dx / width * 3}deg) scale(${1 - progress * 0.04})`;
        target.style.opacity = String(1 - progress * (0.25 + index * 0.08));
      });
    });

    const finish = async (event, cancelled = false) => {
      if (!gesture || (event && gesture.id !== event.pointerId)) return;
      const finished = gesture;
      gesture = null;
      if (!finished.dragging) return;
      const direction = finished.dx < 0 ? 1 : -1;
      const width = Math.max(1, surface.clientWidth);
      const velocity = Math.abs(finished.dx) / Math.max(1, performance.now() - finished.startedAt);
      const nextDate = parseLocalDay(state.calendarSelectedDate);
      nextDate?.setDate(nextDate.getDate() + direction);
      const canCommit = Boolean(nextDate && localDayKey(nextDate) <= todayKey());
      const commit = !cancelled && canCommit && (Math.abs(finished.dx) >= width * 0.24 || velocity > 0.65);
      const duration = matchMedia('(prefers-reduced-motion: reduce)').matches ? 0 : 280;
      const activeTargets = targets();
      activeTargets.forEach(target => {
        target.style.transition = `transform ${duration}ms cubic-bezier(.2,.8,.2,1), opacity ${duration}ms ease`;
      });
      requestAnimationFrame(() => activeTargets.forEach(target => {
        target.style.transform = commit
          ? `translateX(${-direction * width}px) rotate(${-direction * 5}deg) scale(0.94)`
          : 'translateX(0) rotate(0) scale(1)';
        target.style.opacity = commit ? '0' : '1';
      }));
      const suppressClick = clickEvent => {
        clickEvent.preventDefault();
        clickEvent.stopPropagation();
      };
      surface.addEventListener('click', suppressClick, { capture: true, once: true });
      setTimeout(() => surface.removeEventListener('click', suppressClick, true), 350);
      await new Promise(resolve => setTimeout(resolve, duration));
      if (commit) {
        await stepCalendarDay(direction);
      } else {
        activeTargets.forEach(target => {
          target.style.transition = '';
          target.style.transform = '';
          target.style.opacity = '';
        });
      }
    };
    surface.addEventListener('pointercancel', event => { void finish(event, true); });
    surface.addEventListener('pointerup', event => { void finish(event); });
  }

  function bindChildViewSwipe() {
    if (!isPhoneLayout() || state.children.length < 2) return;
    const surface = app.querySelector('.hcfd2-main');
    const card = surface;
    if (!surface) return;
    surface.style.touchAction = 'pan-y';
    let gesture = null;
    let suppressClick = false;
    surface.addEventListener('pointerdown', event => {
      if (event.pointerType === 'mouse' || !event.isPrimary) return;
      if (event.target.closest('input, select, textarea, [data-calendar-modal]')) return;
      const calendarUsesGesture = state.tab === 'activity' && state.activityView === 'calendar' && event.target.closest('[data-calendar-swipe]');
      const bounds = surface.getBoundingClientRect();
      if (calendarUsesGesture && event.clientX > bounds.left + 28 && event.clientX < bounds.right - 28) return;
      gesture = { id: event.pointerId, x: event.clientX, y: event.clientY, dx: 0, dragging: false, startedAt: performance.now() };
      surface.setPointerCapture?.(event.pointerId);
    });
    surface.addEventListener('pointermove', event => {
      if (!gesture || gesture.id !== event.pointerId) return;
      const dx = event.clientX - gesture.x;
      const dy = event.clientY - gesture.y;
      if (!gesture.dragging && (Math.abs(dx) < 10 || Math.abs(dx) < Math.abs(dy) * 1.2)) return;
      gesture.dragging = true;
      gesture.dx = dx;
      event.preventDefault();
      const width = Math.max(1, surface.clientWidth);
      const progress = Math.min(1, Math.abs(dx) / width);
      card.style.transition = 'none';
      card.style.transform = `translateX(${dx}px) rotate(${dx / width * 2}deg) scale(${1 - progress * 0.035})`;
      card.style.opacity = String(1 - progress * 0.25);
    });
    const finish = async (event, cancelled = false) => {
      if (!gesture || (event && gesture.id !== event.pointerId)) return;
      const finished = gesture;
      gesture = null;
      if (!finished.dragging) return;
      suppressClick = true;
      const direction = finished.dx < 0 ? 1 : -1;
      const currentIndex = state.children.findIndex(child => String(child.ChildID) === state.selectedChildId);
      const nextChild = state.children[currentIndex + direction];
      const width = Math.max(1, surface.clientWidth);
      const velocity = Math.abs(finished.dx) / Math.max(1, performance.now() - finished.startedAt);
      const commit = !cancelled && Boolean(nextChild) && (Math.abs(finished.dx) >= width * 0.22 || velocity > 0.65);
      const duration = matchMedia('(prefers-reduced-motion: reduce)').matches ? 0 : 250;
      card.style.transition = `transform ${duration}ms cubic-bezier(.2,.8,.2,1), opacity ${duration}ms ease`;
      requestAnimationFrame(() => {
        card.style.transform = commit ? `translateX(${-direction * width}px) scale(.96)` : 'translateX(0) scale(1)';
        card.style.opacity = commit ? '0' : '1';
      });
      await new Promise(resolve => setTimeout(resolve, duration));
      if (commit) await switchChild(String(nextChild.ChildID));
      else {
        card.style.transition = '';
        card.style.transform = '';
        card.style.opacity = '';
      }
      setTimeout(() => { suppressClick = false; }, 0);
    };
    surface.addEventListener('pointerup', event => { void finish(event); });
    surface.addEventListener('pointercancel', event => { void finish(event, true); });
    surface.addEventListener('click', event => {
      if (!suppressClick) return;
      event.preventDefault();
      event.stopPropagation();
    }, true);
  }

  async function loadAndRenderCalendarMonth() {
    app.querySelectorAll('[data-calendar-action], [data-calendar-picker]').forEach(control => {
      control.disabled = true;
    });
    try {
      await ensureCalendarMonthLoaded();
      render();
    } catch (error) {
      alert(`Could not load the calendar month: ${error.message}`);
      render();
    }
  }

  async function ensureCalendarMonthLoaded() {
    const monthStart = `${state.calendarMonth}-01`;
    const childIds = validCalendarScope() === 'both'
      ? state.children.map(child => String(child.ChildID))
      : [state.selectedChildId];
    await Promise.all(childIds.map(childId => loadChildHistoryThrough(childId, monthStart)));
  }

  async function loadAndRenderSelectedWeek() {
    app.querySelectorAll('[data-home-view], [data-week-action], [data-week-picker], [data-week-start]').forEach(control => {
      control.disabled = true;
    });
    const heading = app.querySelector('.hcfd2-week-heading small');
    if (heading) heading.textContent = 'Loading this week’s history…';
    try {
      await ensureSelectedWeekLoaded();
      render();
    } catch (error) {
      alert(`Could not load the selected week: ${error.message}`);
      render();
    }
  }

  async function ensureSelectedWeekLoaded() {
    const { start } = selectedWeekRange();
    const comparisonStart = new Date(start);
    comparisonStart.setDate(comparisonStart.getDate() - 7);
    const startKey = localDayKey(comparisonStart);
    await Promise.all(state.children.map(child => loadChildHistoryThrough(String(child.ChildID), startKey)));
  }

  async function loadChildHistoryThrough(childId, startKey) {
    const data = state.data.get(childId);
    if (!data) return;
    await Promise.all([
      loadHistoryTypeThrough(childId, data, 'moments', startKey),
      loadHistoryTypeThrough(childId, data, 'reports', startKey),
    ]);
    state.data.set(childId, data);
  }

  async function loadHistoryTypeThrough(childId, data, type, startKey) {
    const isMoments = type === 'moments';
    const endpoint = isMoments ? API.moments : API.reports;
    const countKey = isMoments ? 'momentCount' : 'reportCount';
    const pageKey = isMoments ? 'momentPage' : 'reportPage';
    const idKey = isMoments ? 'DailyMomentId' : 'DailyReportId';

    while (data[type].length < data[countKey]) {
      const oldestKey = data[type].map(dayKey).filter(Boolean).sort()[0] || '';
      // Continue past the first item on the boundary day so a paginated
      // response cannot leave other records from that same day behind.
      if (oldestKey && oldestKey < startKey) break;

      const page = data[pageKey];
      const response = await postJson(endpoint, {
        ChildID: childId,
        PageNumber: page,
        PageSize: PAGE_SIZE,
      });
      const before = data[type].length;
      data[type] = dedupe([...data[type], ...flattenGroups(response.Data)], idKey);
      data[countKey] = Number(response.Count || data[countKey]);
      data[pageKey] += 1;
      if (data[type].length === before) break;
    }
  }

  function saveWeekSettings() {
    localStorage.setItem(STORAGE.weekStartsOn, String(state.weekStartsOn));
    localStorage.setItem(STORAGE.selectedWeek, state.selectedWeek);
  }

  function parseLocalDay(value) {
    const match = /^(\d{4})-(\d{2})-(\d{2})$/.exec(String(value || ''));
    if (!match) return null;
    const date = new Date(Number(match[1]), Number(match[2]) - 1, Number(match[3]));
    return Number.isNaN(date.getTime()) ? null : date;
  }

  function formatMonthDay(date) {
    return new Intl.DateTimeFormat(undefined, { month: 'long', day: 'numeric' }).format(date);
  }

  function formatWeekLabel(start, end) {
    const sameYear = start.getFullYear() === end.getFullYear();
    const sameMonth = sameYear && start.getMonth() === end.getMonth();
    if (sameMonth) {
      return `${new Intl.DateTimeFormat(undefined, { month: 'long' }).format(start)} ${start.getDate()}–${end.getDate()}, ${end.getFullYear()}`;
    }
    const startText = new Intl.DateTimeFormat(undefined, { month: 'short', day: 'numeric', ...(sameYear ? {} : { year: 'numeric' }) }).format(start);
    const endText = new Intl.DateTimeFormat(undefined, { month: 'short', day: 'numeric', year: 'numeric' }).format(end);
    return `${startText}–${endText}`;
  }

  function timelineMatches(entry, query) {
    if (!normalize(query)) return true;
    return entry.kind === 'photo' ? photoMatches(entry.item, query) : reportMatches(entry.item, query);
  }

  function photoTitle(moment) {
    const subject = String(moment?.Subject || '').trim();
    const lesson = String(moment?.Lesson || '').trim();
    const isInternalLabel = !subject || /^(memo|classroom moment|photo|picture)$/i.test(subject);

    if (isInternalLabel) return lesson ? `Photo: ${lesson}` : 'Classroom photo';
    return `Photo: ${subject}`;
  }

  function photoActivityLabel(moment) {
    const lesson = String(moment?.Lesson || '').trim();
    return lesson || photoTitle(moment);
  }

  function photoMatches(moment, query) {
    const q = normalize(query);
    if (!q) return true;
    return normalize(`${moment.Subject || ''} ${moment.Lesson || ''}`).includes(q);
  }

  function reportMatches(report, query) {
    const q = normalize(query);
    if (!q) return true;
    return normalize(`${report.GenericReportInfo || ''} ${report.ChildCondition || ''} ${report.TimeStart || ''}`).includes(q);
  }

  function countTop(values) {
    const map = new Map();
    values.filter(Boolean).forEach(value => map.set(value, (map.get(value) || 0) + 1));
    return [...map.entries()].sort((a, b) => b[1] - a[1]);
  }

  function itemTimestamp(item) {
    // Daily reports can include both Created (when Honeycomb saved the entry)
    // and StartDate (when the bottle, meal, nap, etc. actually happened).
    // Moments use Created because they do not normally have StartDate.
    if (item?.DailyReportId != null || item?.DailyReportTypeID != null) {
      return String(item.StartDate || reportTimeFromGroup(item) || item.Created || item.Date || item.GroupDate || '');
    }
    return String(item?.Created || item?.StartDate || item?.Date || item?.GroupDate || '');
  }

  function reportTimeFromGroup(report) {
    const day = String(report?.GroupDate || report?.Date || '').slice(0, 10);
    const match = /^(\d{1,2}):(\d{2})\s*(AM|PM)$/i.exec(String(report?.TimeStart || '').trim());
    if (!day || !match) return '';
    let hour = Number(match[1]) % 12;
    if (match[3].toUpperCase() === 'PM') hour += 12;
    return `${day}T${String(hour).padStart(2, '0')}:${match[2]}:00`;
  }

  function dayKey(item) {
    const raw = item?.Date || item?.GroupDate || item?.StartDate || item?.Created;
    return raw ? String(raw).slice(0, 10) : '';
  }

  function todayKey() {
    return localDayKey(new Date());
  }

  function localDayKey(date) {
    return `${date.getFullYear()}-${String(date.getMonth() + 1).padStart(2, '0')}-${String(date.getDate()).padStart(2, '0')}`;
  }

  function startDay(date) {
    return new Date(date.getFullYear(), date.getMonth(), date.getDate());
  }

  function reportType(report) {
    const text = normalize(`${report.GenericReportInfo || ''} ${report.ChildCondition || ''}`);
    const typeId = Number(report.DailyReportTypeID);
    if (/bottle|milk|oz/.test(text)) return 'bottle';
    if (/nap|sleep/.test(text)) return 'nap';
    if (typeId === 2 || /lunch|snack|breakfast|meal|ate/.test(text)) return 'meal';
    if (typeId === 5 || /potty|pee|poop|dry|wet/.test(text)) return 'potty';
    if (typeId === 6 || /suppl|wipes|clothes|diaper/.test(text)) return 'supplies';
    return 'general';
  }

  function reportIcon(type) {
    return ({ meal: '🍴', potty: '🚽', supplies: '🧺', nap: '😴', bottle: '🍼', general: '📋' })[type] || '📋';
  }

  function reportTitle(report) {
    if (report.GenericReportInfo) return String(report.GenericReportInfo).trim();
    return ({ potty: 'Potty', nap: 'Nap', bottle: 'Bottle', supplies: 'Need Supplies', meal: 'Meal', general: 'Daily Report' })[reportType(report)];
  }

  function photosByChildNewestFirst() {
    const result = new Map();
    for (const child of state.children) {
      const childId = String(child.ChildID);
      const photos = [...(state.data.get(childId)?.moments || [])]
        .filter(moment => moment.Filename)
        .sort((a, b) => itemTimestamp(b).localeCompare(itemTimestamp(a)));
      result.set(childId, photos);
    }
    return result;
  }

  function persistentPhotoUrls() {
    const urls = new Set();
    const cutoffKey = recentBusinessDayCutoffKey(5);
    photosByChildNewestFirst().forEach(photos => {
      photos.filter(moment => dayKey(moment) >= cutoffKey).forEach(moment => urls.add(imageUrl(moment.Filename)));
      photos.slice(0, PHOTO_CACHE_THUMB_PER_CHILD).forEach(moment => urls.add(imageUrl(moment.Filename, 'moment-image-thumb')));
    });
    return urls;
  }

  async function syncRecentPhotoCache() {
    if (!('caches' in window)) return;
    if (photoCacheSync) {
      photoCacheNeedsResync = true;
      return photoCacheSync;
    }
    photoCacheNeedsResync = false;
    photoCacheSync = (async () => {
      const allowed = persistentPhotoUrls();
      await Promise.all([caches.delete(LEGACY_PHOTO_CACHE_NAME), caches.delete(PREVIOUS_PHOTO_CACHE_NAME)]);
      const cache = await photoCache.open();
      const missing = [];
      for (const url of allowed) if (!(await cache.match(url))) missing.push(url);
      for (let index = 0; index < missing.length; index += 3) {
        await Promise.all(missing.slice(index, index + 3).map(async url => {
          try {
            const response = await fetch(url, { credentials: 'same-origin', cache: 'no-store' });
            if (response.ok) await photoCache.store(cache, url, response);
          } catch (error) {
            console.warn('[Honeycomb photo cache]', error);
          }
        }));
      }
    })().finally(() => {
      photoCacheSync = null;
      if (photoCacheNeedsResync) void syncRecentPhotoCache();
    });
    return photoCacheSync;
  }

  async function warmRecentPhotoCache(childIds) {
    await Promise.all(childIds.map(async childId => {
      const data = state.data.get(childId) || emptyChildData();
      const cutoffKey = recentBusinessDayCutoffKey(5);
      try {
        while (data.moments.length < PHOTO_CACHE_HISTORY_PER_CHILD) {
          const oldest = data.moments[data.moments.length - 1];
          const needsFirstPage = data.moments.length === 0 && data.momentPage === 1;
          const hasMore = needsFirstPage || data.moments.length < data.momentCount;
          if (!hasMore || (!needsFirstPage && oldest && dayKey(oldest) < cutoffKey)) break;
          const response = await postJson(API.moments, {
            ChildID: childId,
            PageNumber: data.momentPage,
            PageSize: PAGE_SIZE,
          });
          const before = data.moments.length;
          data.moments = dedupe([...data.moments, ...flattenGroups(response.Data)], 'DailyMomentId');
          data.momentCount = Number(response.Count || data.momentCount);
          data.momentPage += 1;
          if (data.moments.length === before) break;
        }
        state.data.set(childId, data);
      } catch (error) {
        console.warn('[Honeycomb recent photo history]', error);
      }
    }));
    await syncRecentPhotoCache();
  }

  async function hydrateCachedGalleryOriginals(token) {
    if (!('caches' in window) || token !== galleryHydrationToken) return;
    const images = [...app.querySelectorAll('img[data-photo-original]')];
    if (!images.length) return;
    try {
      const cache = await photoCache.open();
      await Promise.all(images.map(async image => {
        const originalUrl = image.dataset.photoOriginal;
        if (!originalUrl) return;
        const cached = await cache.match(originalUrl);
        if (!cached) return;
        const objectUrl = URL.createObjectURL(await cached.blob());
        if (token !== galleryHydrationToken || !image.isConnected) {
          URL.revokeObjectURL(objectUrl);
          return;
        }
        galleryObjectUrls.add(objectUrl);
        image.src = objectUrl;
        image.dataset.photoResolution = 'original';
        void photoCache.touch(originalUrl);
      }));
    } catch (error) {
      console.warn('[Honeycomb cached gallery originals]', error);
    }
  }

  function clearGalleryObjectUrls() {
    galleryObjectUrls.forEach(objectUrl => URL.revokeObjectURL(objectUrl));
    galleryObjectUrls.clear();
  }

  async function photoResponse(moment, signal) {
    const url = imageUrl(moment.Filename);
    if ('caches' in window) {
      const cache = await photoCache.open();
      const cached = await cache.match(url);
      if (cached) {
        void photoCache.touch(url);
        return cached;
      }
      const response = await fetch(url, { credentials: 'same-origin', cache: 'no-store', signal });
      if (response.ok) await photoCache.store(cache, url, response);
      return response;
    }
    return fetch(url, { credentials: 'same-origin', cache: 'no-store', signal });
  }

  async function isPhotoLocallyReady(moment) {
    const url = imageUrl(moment.Filename);
    if (photoObjectUrls.has(url)) return true;
    if (!('caches' in window)) return false;
    try {
      const cache = await photoCache.open();
      return Boolean(await cache.match(url));
    } catch {
      return false;
    }
  }

  async function photoDisplayUrl(moment, signal) {
    const sourceUrl = imageUrl(moment.Filename);
    if (photoObjectUrls.has(sourceUrl)) return photoObjectUrls.get(sourceUrl);
    const response = await photoResponse(moment, signal);
    if (!response.ok) throw new Error(`Photo request failed (${response.status}).`);
    const objectUrl = URL.createObjectURL(await response.blob());
    photoObjectUrls.set(sourceUrl, objectUrl);
    return objectUrl;
  }

  function prefetchViewerPhotos(direction) {
    const { items, index } = state.slideshow;
    if (items.length < 2) return;
    const generation = ++viewerPrefetchGeneration;
    viewerPrefetchControllers.forEach(controller => controller.abort());
    viewerPrefetchControllers.clear();
    const targets = [];
    for (let offset = 1; offset <= PHOTO_PREFETCH_AHEAD; offset += 1) {
      const targetIndex = index + direction * offset;
      if (targetIndex < 0 || targetIndex >= items.length) break;
      targets.push(items[targetIndex]);
    }
    for (let offset = 1; offset <= PHOTO_PREFETCH_BEHIND; offset += 1) {
      const targetIndex = index - direction * offset;
      if (targetIndex < 0 || targetIndex >= items.length) break;
      targets.push(items[targetIndex]);
    }
    const keep = new Set([items[index], ...targets].map(moment => imageUrl(moment.Filename)));
    viewerPrefetchKeep = keep;
    for (const [sourceUrl, objectUrl] of photoObjectUrls) {
      if (!keep.has(sourceUrl)) {
        URL.revokeObjectURL(objectUrl);
        photoObjectUrls.delete(sourceUrl);
      }
    }
    let cursor = 0;
    const worker = async () => {
      while (generation === viewerPrefetchGeneration && cursor < targets.length) {
        const moment = targets[cursor++];
        const sourceUrl = imageUrl(moment.Filename);
        const controller = new AbortController();
        viewerPrefetchControllers.add(controller);
        try {
          await photoDisplayUrl(moment, controller.signal);
          if (!viewerPrefetchKeep.has(sourceUrl) && photoObjectUrls.has(sourceUrl)) {
            URL.revokeObjectURL(photoObjectUrls.get(sourceUrl));
            photoObjectUrls.delete(sourceUrl);
          }
        } catch (error) {
          if (error?.name !== 'AbortError') console.warn('[Honeycomb photo prefetch]', error);
        } finally {
          viewerPrefetchControllers.delete(controller);
        }
      }
    };
    for (let workerIndex = 0; workerIndex < PHOTO_PREFETCH_CONCURRENCY; workerIndex += 1) void worker();
  }

  function clearPhotoObjectUrls() {
    viewerPrefetchGeneration += 1;
    viewerPrefetchControllers.forEach(controller => controller.abort());
    viewerPrefetchControllers.clear();
    viewerPrefetchKeep = new Set();
    photoObjectUrls.forEach(objectUrl => URL.revokeObjectURL(objectUrl));
    photoObjectUrls.clear();
  }

  function imageUrl(filename, preset = '') {
    if (!filename) return '';
    const base = filename.startsWith('http') ? filename : `${location.origin}${filename}`;
    return preset ? `${base}?preset=${encodeURIComponent(preset)}` : base;
  }

  function fullName(child) {
    return [child.FirstName, child.MiddleName, child.LastName].map(value => String(value || '').trim()).filter(Boolean).join(' ');
  }

  function familyHeading() {
    const lastNames = [...new Set(state.children
      .map(child => String(child.LastName || '').trim())
      .filter(Boolean))];
    return lastNames.length === 1 ? `The ${lastNames[0]} Family` : 'Your Family';
  }

  function initials(child) {
    return html(`${String(child.FirstName || '').trim().charAt(0)}${String(child.LastName || '').trim().charAt(0)}` || '?');
  }

  function getChildAvatars() {
    return readJson(STORAGE.avatars, {});
  }

  function getChildAvatarRecord(childId) {
    const value = getChildAvatars()[String(childId)];
    if (!value) return null;
    return typeof value === 'string' ? { cropped: value, source: value, zoom: 1, x: 0, y: 0 } : value;
  }

  function getChildAvatar(childId) {
    return getChildAvatarRecord(childId)?.cropped || '';
  }

  function renderChildAvatar(child, big = false, interactive = true) {
    const childId = String(child.ChildID);
    const picture = getChildAvatar(childId);
    return `<span class="hcfd2-avatar${big ? ' big' : ''}${picture ? ' has-photo' : ''}" ${interactive ? `data-avatar-child="${attr(childId)}" role="button" tabindex="0" title="Manage profile picture" aria-label="Manage profile picture for ${attr(fullName(child))}"` : ''}>${picture ? `<img src="${attr(picture)}" alt="">` : `<span>${initials(child)}</span>`}</span>`;
  }

  function openAvatarManager(childId) {
    state.avatarEditor = { childId: String(childId), mode: 'menu' };
    render();
  }

  function chooseAvatarPhoto(childId) {
    const input = document.createElement('input');
    input.type = 'file';
    input.accept = 'image/*';
    input.addEventListener('change', () => {
      const file = input.files?.[0];
      if (!file) return;
      const reader = new FileReader();
      reader.addEventListener('load', async () => {
        const source = await prepareAvatarSource(String(reader.result));
        state.avatarEditor = { childId: String(childId), mode: 'crop', src: source, zoom: 1, x: 0, y: 0 };
        render();
      });
      reader.readAsDataURL(file);
    });
    input.click();
  }

  function prepareAvatarSource(dataUrl) {
    return new Promise(resolve => {
      const image = new Image();
      image.addEventListener('load', () => {
        const maxDimension = 1200;
        const scale = Math.min(1, maxDimension / Math.max(image.naturalWidth, image.naturalHeight));
        const canvas = document.createElement('canvas');
        canvas.width = Math.max(1, Math.round(image.naturalWidth * scale));
        canvas.height = Math.max(1, Math.round(image.naturalHeight * scale));
        canvas.getContext('2d').drawImage(image, 0, 0, canvas.width, canvas.height);
        resolve(canvas.toDataURL('image/jpeg', 0.86));
      });
      image.addEventListener('error', () => resolve(dataUrl));
      image.src = dataUrl;
    });
  }

  function bindAvatarEditorEvents() {
    const editor = state.avatarEditor;
    app.querySelector('[data-avatar-change]')?.addEventListener('click', () => chooseAvatarPhoto(editor.childId));
    app.querySelector('[data-avatar-recrop]')?.addEventListener('click', () => {
      const record = getChildAvatarRecord(editor.childId);
      if (!record) return;
      state.avatarEditor = { childId: editor.childId, mode: 'crop', src: record.source || record.cropped, zoom: record.zoom || 1, x: record.x || 0, y: record.y || 0 };
      render();
    });
    app.querySelectorAll('[data-avatar-cancel]').forEach(button => button.addEventListener('click', closeAvatarEditor));
    app.querySelector('[data-avatar-modal]')?.addEventListener('click', event => {
      if (event.target === event.currentTarget) closeAvatarEditor();
    });
    app.querySelector('[data-avatar-remove]')?.addEventListener('click', removeChildAvatar);

    const preview = app.querySelector('[data-avatar-preview]');
    const crop = app.querySelector('[data-avatar-crop]');
    if (!editor || !preview || !crop) return;

    const positionPreview = () => {
      if (!preview.naturalWidth) return;
      const baseScale = Math.max(240 / preview.naturalWidth, 240 / preview.naturalHeight);
      const scale = baseScale * editor.zoom;
      const maxX = Math.max(0, (preview.naturalWidth * scale - 240) / 2);
      const maxY = Math.max(0, (preview.naturalHeight * scale - 240) / 2);
      editor.x = Math.max(-maxX, Math.min(maxX, editor.x));
      editor.y = Math.max(-maxY, Math.min(maxY, editor.y));
      preview.style.transform = `translate(-50%, -50%) translate(${editor.x}px, ${editor.y}px) scale(${scale})`;
    };
    preview.addEventListener('load', positionPreview);
    if (preview.complete) positionPreview();

    let drag = null;
    crop.addEventListener('pointerdown', event => {
      drag = { pointerId: event.pointerId, x: event.clientX, y: event.clientY, startX: editor.x, startY: editor.y };
      crop.setPointerCapture(event.pointerId);
    });
    crop.addEventListener('pointermove', event => {
      if (!drag || drag.pointerId !== event.pointerId) return;
      editor.x = drag.startX + event.clientX - drag.x;
      editor.y = drag.startY + event.clientY - drag.y;
      positionPreview();
    });
    crop.addEventListener('pointerup', () => { drag = null; });
    app.querySelector('[data-avatar-zoom]')?.addEventListener('input', event => {
      editor.zoom = Number(event.target.value);
      positionPreview();
    });
    app.querySelector('[data-avatar-save]')?.addEventListener('click', () => saveCroppedAvatar(preview));
  }

  function closeAvatarEditor() {
    state.avatarEditor = null;
    render();
  }

  function saveCroppedAvatar(image) {
    const editor = state.avatarEditor;
    if (!editor || !image.naturalWidth) return;
    const canvas = document.createElement('canvas');
    canvas.width = 256;
    canvas.height = 256;
    const scale = Math.max(240 / image.naturalWidth, 240 / image.naturalHeight) * editor.zoom;
    const sourceSize = 240 / scale;
    const sourceX = image.naturalWidth / 2 - (120 + editor.x) / scale;
    const sourceY = image.naturalHeight / 2 - (120 + editor.y) / scale;
    canvas.getContext('2d').drawImage(image, sourceX, sourceY, sourceSize, sourceSize, 0, 0, 256, 256);
    const avatars = getChildAvatars();
    avatars[editor.childId] = {
      cropped: canvas.toDataURL('image/jpeg', 0.88),
      source: editor.src,
      zoom: editor.zoom,
      x: editor.x,
      y: editor.y,
    };
    try {
      localStorage.setItem(STORAGE.avatars, JSON.stringify(avatars));
      closeAvatarEditor();
    } catch {
      alert('The cropped picture could not be saved. Browser storage may be full.');
    }
  }

  function removeChildAvatar() {
    const editor = state.avatarEditor;
    if (!editor) return;
    const avatars = getChildAvatars();
    delete avatars[editor.childId];
    localStorage.setItem(STORAGE.avatars, JSON.stringify(avatars));
    closeAvatarEditor();
  }

  function shortTime(value) {
    const date = new Date(value);
    return Number.isNaN(date.getTime()) ? '' : new Intl.DateTimeFormat(undefined, { hour: 'numeric', minute: '2-digit' }).format(date);
  }

  function shortDateTime(value) {
    const date = new Date(value);
    return Number.isNaN(date.getTime()) ? '' : new Intl.DateTimeFormat(undefined, { month: 'short', day: 'numeric', hour: 'numeric', minute: '2-digit' }).format(date);
  }

  function longDateTime(value) {
    const date = new Date(value);
    return Number.isNaN(date.getTime()) ? String(value || '') : new Intl.DateTimeFormat(undefined, { weekday: 'short', month: 'short', day: 'numeric', hour: 'numeric', minute: '2-digit' }).format(date);
  }

  function formatDay(value) {
    if (value === 'unknown') return 'Unknown date';
    const date = new Date(`${String(value).slice(0, 10)}T12:00:00`);
    return Number.isNaN(date.getTime()) ? String(value) : new Intl.DateTimeFormat(undefined, { weekday: 'long', month: 'long', day: 'numeric', year: 'numeric' }).format(date);
  }

  function normalize(value) {
    return String(value || '').toLowerCase().normalize('NFD').replace(/[\u0300-\u036f]/g, '').replace(/\s+/g, ' ').trim();
  }

  function readJson(key, fallback) {
    try { return JSON.parse(localStorage.getItem(key) || JSON.stringify(fallback)); }
    catch { return fallback; }
  }

  function currentAccountScope() {
    return state.children.map(child => String(child.ChildID)).sort().join(':');
  }

  async function establishAccountScope() {
    const nextScope = currentAccountScope();
    const previousScope = localStorage.getItem(STORAGE.accountScope);
    if (previousScope && previousScope !== nextScope) await clearPrivateData(false);
    localStorage.setItem(STORAGE.accountScope, nextScope);
  }

  async function clearPrivateData(resetRuntime = true) {
    clearPhotoObjectUrls();
    reportDetailCache.clear();
    clearTimeout(cacheSaveTimer);
    const privateKeys = [
      STORAGE.child, STORAGE.tab, STORAGE.favorites, STORAGE.lastSeen, STORAGE.cache,
      STORAGE.avatars, STORAGE.acknowledgedSupplies, STORAGE.photoCacheIndex, STORAGE.accountScope,
      STORAGE.savedPhotos,
      STORAGE.hiddenPhotos,
    ];
    privateKeys.forEach(key => {
      try { localStorage.removeItem(key); } catch {}
      try { sessionStorage.removeItem(key); } catch {}
    });
    if ('caches' in window) {
      await Promise.all([
        caches.delete(PHOTO_CACHE_NAME),
        caches.delete(PREVIOUS_PHOTO_CACHE_NAME),
        caches.delete(LEGACY_PHOTO_CACHE_NAME),
      ]);
    }
    if (resetRuntime) {
      state.children = [];
      state.data.clear();
      state.slideshow = { items: [], index: 0 };
      stopAutoRefresh();
      overlay?.remove();
      overlay = null;
      app = null;
      state.overlayOpen = false;
      document.body.classList.remove('hcfd2-no-scroll');
    }
  }

  function restoreDashboardCache() {
    try {
      const cached = JSON.parse(sessionStorage.getItem(STORAGE.cache) || 'null');
      if (!cached || cached.version !== 1 || !Array.isArray(cached.children) || !Array.isArray(cached.data) || !cached.children.length) return false;
      state.children = cached.children;
      state.data = new Map(cached.data.map(([childId, childData]) => [String(childId), { ...emptyChildData(), ...childData }]));
      if (!state.children.some(child => String(child.ChildID) === state.selectedChildId)) {
        state.selectedChildId = String(state.children[0].ChildID);
      }
      return true;
    } catch {
      try { sessionStorage.removeItem(STORAGE.cache); } catch {}
      return false;
    }
  }

  function scheduleCacheSave() {
    if (!state.children.length) return;
    clearTimeout(cacheSaveTimer);
    cacheSaveTimer = setTimeout(() => {
      try {
        sessionStorage.setItem(STORAGE.cache, JSON.stringify({
          version: 1,
          savedAt: new Date().toISOString(),
          children: state.children,
          data: [...state.data.entries()],
        }));
      } catch (error) {
        console.warn('[Honeycomb dashboard cache]', error);
      }
    }, 150);
  }

  function html(value) {
    const div = document.createElement('div');
    div.textContent = String(value ?? '');
    return div.innerHTML;
  }

  function attr(value) {
    return String(value ?? '').replace(/&/g, '&amp;').replace(/"/g, '&quot;').replace(/</g, '&lt;').replace(/>/g, '&gt;');
  }

  function renderError(error) {
    console.error('[Honeycomb Family Dashboard]', error);
    app.innerHTML = `<div class="hcfd2-error"><h2>Dashboard could not load</h2><p>${html(error?.message || String(error))}</p><button data-retry>Try again</button><button data-close>Close</button></div>`;
    app.querySelector('[data-retry]')?.addEventListener('click', async () => {
      try {
        await loadChildren();
        await Promise.all(childrenForRefresh().map(child => loadChild(String(child.ChildID), true)));
        if (state.period === 'week') await ensureSelectedWeekLoaded();
        if (state.tab === 'activity' && state.activityView === 'calendar') await ensureCalendarMonthLoaded();
        render();
      } catch (retryError) { renderError(retryError); }
    });
    app.querySelector('[data-close]')?.addEventListener('click', closeDashboard);
  }

  function bindGlobalKeys() {
    document.addEventListener('click', event => {
      if (!state.overlayOpen || !state.headerMenuOpen) return;
      if (event.target.closest?.('.hcfd2-mobile-menu-wrap')) return;
      state.headerMenuOpen = false;
      if (app) render();
    });
    document.addEventListener('keydown', event => {
      const typing = event.target instanceof HTMLInputElement || event.target instanceof HTMLTextAreaElement || event.target instanceof HTMLSelectElement || event.target?.isContentEditable;
      if (!state.overlayOpen) {
        if (!typing && event.key.toLowerCase() === 'h') { event.preventDefault(); openDashboard(); }
        return;
      }
      if (state.avatarEditor) {
        if (event.key === 'Escape') closeAvatarEditor();
        return;
      }
      const viewer = app?.querySelector('#hcfd2-viewer:not([hidden])');
      if (viewer) {
        if (event.key === 'Escape') closeViewer();
        if (event.key === 'ArrowLeft') stepViewer(-1);
        if (event.key === 'ArrowRight' || event.key === ' ') { event.preventDefault(); stepViewer(1); }
        if (event.key.toLowerCase() === 'f') toggleViewerFavorite();
        return;
      }
      if (state.calendarSelectedDate && app?.querySelector('[data-calendar-modal]')) {
        if (event.key === 'Escape') {
          state.calendarSelectedDate = null;
          render();
        } else if (event.key === 'ArrowLeft') {
          event.preventDefault();
          stepCalendarDay(-1);
        } else if (event.key === 'ArrowRight') {
          event.preventDefault();
          stepCalendarDay(1);
        }
        return;
      }
      if (state.supplyAlertsOpen) {
        if (event.key === 'Escape') {
          state.supplyAlertsOpen = false;
          render();
        }
        return;
      }
      if (state.timelineFiltersOpen || state.photoFiltersOpen || state.reportFiltersOpen || state.statsFiltersOpen) {
        if (event.key === 'Escape') {
          state.timelineFiltersOpen = false;
          state.photoFiltersOpen = false;
          state.reportFiltersOpen = false;
          state.statsFiltersOpen = false;
          render();
        }
        return;
      }
      if (state.mobileMoreOpen) {
        if (event.key === 'Escape') {
          state.mobileMoreOpen = false;
          render();
        }
        return;
      }
      if (state.childPickerOpen) {
        if (event.key === 'Escape') {
          state.childPickerOpen = false;
          render();
        }
        return;
      }
      if (state.headerMenuOpen) {
        if (event.key === 'Escape') {
          state.headerMenuOpen = false;
          render();
        }
        return;
      }
      if (event.key === 'Escape') { closeDashboard(); return; }
      if (typing) return;
      const tabKeys = { o: 'home', a: 'activity', c: 'calendar', p: 'photos', f: 'favorites', s: 'stats', b: 'badges' };
      const key = event.key.toLowerCase();
      if (tabKeys[key]) switchTab(tabKeys[key]);
      if (/^[1-9]$/.test(key)) {
        const child = state.children[Number(key) - 1];
        if (child) switchChild(String(child.ChildID));
      }
    });
  }

  function injectStyles() {
    const existingStyles =
        document.getElementById('hcfd2-styles');

    if (existingStyles) {
        existingStyles.remove();
    }

    const style =
        document.createElement('style');

    style.id = 'hcfd2-styles';

    style.textContent = `
        :root {
            --h-accent: #f9b247;
            --h-accent-strong: #d88710;

            --h-background: #fffaf0;
            --h-surface: #ffffff;
            --h-surface-muted: #fff3d6;

            --h-text: #28231b;
            --h-muted: #665f54;
            --h-border: #ded6c8;

            --h-shadow:
                0 22px 60px
                rgba(17, 24, 39, 0.22);
        }

        #hcfd2-overlay,
        #hcfd2-overlay * {
            box-sizing: border-box;
        }

        body.hcfd2-no-scroll {
            overflow: hidden !important;
        }

        #hcfd2-launcher {
            position: fixed !important;
            right: 20px !important;
            bottom: 20px !important;
            z-index: 2147483500 !important;
            display: flex !important;
            align-items: center !important;
            gap: 9px !important;
            min-height: 48px !important;
            padding: 10px 15px !important;
            border: 1px solid #c87808 !important;
            border-radius: 999px !important;
            background: #f9b247 !important;
            color: #2b210d !important;
            box-shadow: 0 8px 24px rgba(17, 24, 39, 0.28) !important;
            cursor: pointer !important;
            font: 800 14px/1 system-ui, -apple-system, BlinkMacSystemFont, "Segoe UI", sans-serif !important;
        }

        #hcfd2-launcher:hover {
            background: #ffc66f !important;
            transform: translateY(-2px) !important;
        }

        #hcfd2-launcher:focus-visible {
            outline: 3px solid rgba(249, 178, 71, 0.42) !important;
            outline-offset: 3px !important;
        }

        #hcfd2-launcher span {
            font-size: 20px !important;
            line-height: 1 !important;
        }

        /*
         * The original Honeycomb site remains underneath
         * the custom dashboard but is not visible.
         */
        #hcfd2-overlay {
            position: fixed;
            inset: 0;
            z-index: 2147483600;

            overflow-x: hidden;
            overflow-y: auto;

            padding: 0;

            background:
                var(--h-background);
        }

        /*
         * Dark-mode variable replacements.
         */
        #hcfd2-overlay.dark {
            --h-background: #13171c;
            --h-surface: #20252c;
            --h-surface-muted: #2a3038;

            --h-text: #f5f7fa;
            --h-muted: #aeb7c4;
            --h-border: #3b444f;

            --h-shadow:
                0 22px 60px
                rgba(0, 0, 0, 0.58);
        }

        /*
         * The dashboard now occupies the full page.
         */
        #hcfd2-app {
            width: 100%;
            max-width: none;
            min-height: 100vh;

            margin: 0;

            color: var(--h-text);

            font-family:
                Muli,
                system-ui,
                -apple-system,
                BlinkMacSystemFont,
                "Segoe UI",
                sans-serif;
        }

        .hcfd2-shell {
            width: 100%;
            min-height: 100vh;

            /* Keep vertical overflow visible so sticky child/page context works. */
            overflow: visible;
            overflow-x: clip;

            border: 0;
            border-radius: 0;

            background:
                var(--h-background);

            box-shadow: none;
        }

        /*
         * Header
         */
        .hcfd2-header {
            display: flex;
            align-items: flex-start;
            justify-content: space-between;

            gap: 24px;

            padding: 24px 28px;

            border-bottom:
                1px solid
                var(--h-border);

            background:
                linear-gradient(
                    135deg,
                    var(--h-surface),
                    var(--h-surface-muted)
                );
        }

        .hcfd2-kicker {
            color:
                var(--h-accent-strong);

            font-size: 0.76rem;
            font-weight: 900;

            letter-spacing: 0.09em;
            text-transform: uppercase;
        }

        .hcfd2-header h1 {
            margin: 3px 0;

            color:
                var(--h-text);

            font-size:
                clamp(
                    1.8rem,
                    3vw,
                    2.5rem
                );
        }

        .hcfd2-header p {
            margin: 0;

            color:
                var(--h-muted);
        }

        .hcfd2-actions {
            display: flex;
            align-items: flex-start;

            gap: 8px;
        }

        .hcfd2-mobile-menu-wrap {
            position: relative;
            width: 100%;
        }

        .hcfd2-mobile-menu-toggle {
            width: 100%;
            min-height: 46px;
            border: 1px solid var(--h-accent-strong);
            border-radius: 11px;
            background: var(--h-accent);
            color: #2b210d;
            cursor: pointer;
            font: inherit;
            font-weight: 900;
        }

        .hcfd2-mobile-menu {
            display: grid;
            gap: 8px;
            margin-top: 8px;
            padding: 10px;
            border: 1px solid var(--h-border);
            border-radius: 12px;
            background: var(--h-surface);
            box-shadow: 0 8px 22px rgba(17, 24, 39, 0.14);
        }

        .hcfd2-mobile-menu button,
        .hcfd2-mobile-menu select {
            width: 100%;
            min-height: 44px;
            padding: 9px 11px;
            border: 1px solid var(--h-border);
            border-radius: 9px;
            background: var(--h-surface-muted);
            color: var(--h-text);
            font: inherit;
            font-weight: 800;
        }

        .hcfd2-mobile-menu label {
            display: grid;
            gap: 4px;
        }

        .hcfd2-mobile-menu label span {
            color: var(--h-muted);
            font-size: 0.72rem;
            font-weight: 800;
        }

        .hcfd2-actions button,
        .hcfd2-actions select,
        .hcfd2-toolbar button,
        .hcfd2-card-head button,
        .hcfd2-section-title button,
        .hcfd2-load-more button {
            padding: 9px 12px;

            border:
                1px solid
                var(--h-border);

            border-radius: 10px;

            background:
                var(--h-surface);

            color:
                var(--h-text);

            cursor: pointer;

            font-weight: 800;
        }

        .hcfd2-actions > button,
        .hcfd2-actions > select {
            height: 38px;
        }

        .hcfd2-actions select {
            padding: 0 32px 0 12px;
            border: 1px solid var(--h-border);
            border-radius: 10px;
            background-color: var(--h-surface);
            color: var(--h-text);
            cursor: pointer;
            font: inherit;
            font-weight: 800;
            text-align: center;
            text-align-last: center;
        }

        .hcfd2-actions button:hover,
        .hcfd2-actions select:hover,
        .hcfd2-toolbar button:hover,
        .hcfd2-card-head button:hover,
        .hcfd2-section-title button:hover,
        .hcfd2-load-more button:hover {
            border-color:
                var(--h-accent-strong);
        }

        .hcfd2-actions button:disabled,
        .hcfd2-actions select:disabled,
        .hcfd2-toolbar button:disabled,
        .hcfd2-load-more button:disabled {
            cursor: wait;
            opacity: 0.6;
        }

        .hcfd2-actions .hcfd2-close {
            width: 38px;
            height: 38px;

            padding: 0;

            font-size: 28px;
            line-height: 1;
        }

        /*
         * Child selector
         */
        .hcfd2-children {
            display: flex;

            gap: 10px;

            padding: 14px 20px;

            overflow-x: auto;

            border-bottom:
                1px solid
                var(--h-border);

            background:
                var(--h-surface);
        }

        .hcfd2-children button {
            display: flex;
            align-items: center;

            gap: 10px;

            min-width: 210px;

            padding: 10px 13px;

            border:
                1px solid
                var(--h-border);

            border-radius: 13px;

            background:
                var(--h-surface-muted);

            color:
                var(--h-text);

            cursor: pointer;
            text-align: left;
        }

        .hcfd2-children button.active {
            border-color:
                var(--h-accent-strong);

            background:
                color-mix(
                    in srgb,
                    var(--h-accent) 22%,
                    var(--h-surface)
                );

            box-shadow:
                inset 0 0 0 1px
                var(--h-accent-strong);
        }

        .hcfd2-children strong,
        .hcfd2-children small {
            display: block;
        }

        .hcfd2-children small {
            margin-top: 2px;

            color:
                var(--h-muted);

            font-size: 0.75rem;
        }

        .hcfd2-avatar {
            position: relative;
            display: grid;
            place-items: center;

            flex: 0 0 auto;

            width: 42px;
            height: 42px;

            overflow: hidden;

            border-radius: 50%;

            background:
                var(--h-accent);

            color: #2b210d;

            font-weight: 900;
            cursor: pointer;
        }

        .hcfd2-avatar img {
            display: block;
            width: 100%;
            height: 100%;
            object-fit: cover;
        }

        .hcfd2-avatar:focus-visible {
            outline: 3px solid color-mix(in srgb, var(--h-accent) 55%, transparent);
            outline-offset: 2px;
        }

        .hcfd2-avatar.big {
            width: 58px;
            height: 58px;
        }

        .hcfd2-avatar-modal {
            position: fixed;
            inset: 0;
            z-index: 2147483647;
            display: grid;
            place-items: center;
            padding: 20px;
            background: rgba(12, 16, 22, 0.78);
            backdrop-filter: blur(5px);
        }

        .hcfd2-avatar-editor {
            width: min(430px, 94vw);
            padding: 18px;
            border: 1px solid var(--h-border);
            border-radius: 18px;
            background: var(--h-surface);
            box-shadow: var(--h-shadow);
        }

        .hcfd2-avatar-editor header,
        .hcfd2-avatar-editor footer {
            display: flex;
            align-items: center;
            justify-content: space-between;
            gap: 9px;
        }

        .hcfd2-avatar-editor header span,
        .hcfd2-avatar-editor > p,
        .hcfd2-avatar-editor label span {
            color: var(--h-muted);
            font-size: 0.78rem;
        }

        .hcfd2-avatar-editor h2 { margin: 2px 0 0; }
        .hcfd2-avatar-editor header button { width: 40px; height: 40px; font-size: 25px; }
        .hcfd2-avatar-editor button { padding: 9px 12px; border: 1px solid var(--h-border); border-radius: 9px; background: var(--h-surface-muted); color: var(--h-text); cursor: pointer; font-weight: 800; }
        .hcfd2-avatar-editor button.primary { border-color: var(--h-accent-strong); background: var(--h-accent); color: #2b210d; }
        .hcfd2-avatar-editor footer { justify-content: flex-end; margin-top: 18px; }
        .hcfd2-avatar-editor footer [data-avatar-remove] { margin-right: auto; }
        .hcfd2-avatar-editor label { display: grid; gap: 6px; }
        .hcfd2-avatar-editor input { width: 100%; accent-color: var(--h-accent-strong); }

        .hcfd2-avatar-crop {
            position: relative;
            width: 240px;
            height: 240px;
            margin: 20px auto 10px;
            overflow: hidden;
            border: 4px solid var(--h-accent);
            border-radius: 50%;
            background: #111;
            cursor: grab;
            touch-action: none;
            user-select: none;
        }

        .hcfd2-avatar-crop:active { cursor: grabbing; }
        .hcfd2-avatar-crop img { position: absolute; top: 50%; left: 50%; max-width: none; transform-origin: center; pointer-events: none; }
        .hcfd2-avatar-menu-preview { display: grid; place-items: center; padding: 28px 0 20px; }
        .hcfd2-avatar-menu-preview .hcfd2-avatar { width: 112px; height: 112px; font-size: 2rem; cursor: default; }
        .hcfd2-avatar-menu-actions { display: grid; gap: 9px; }

        /*
         * Main navigation tabs
         */
        .hcfd2-tabs {
            display: flex;

            gap: 4px;

            padding: 10px 16px 0;

            overflow-x: auto;

            background:
                var(--h-background);
        }

        .hcfd2-tabs button {
            padding: 11px 15px;

            border:
                1px solid
                transparent;

            border-radius:
                10px 10px 0 0;

            background:
                transparent;

            color:
                var(--h-muted);

            cursor: pointer;

            font-weight: 850;

            white-space: nowrap;
        }

        .hcfd2-tabs button.active {
            border-color:
                var(--h-border);

            border-bottom-color:
                var(--h-surface);

            background:
                var(--h-surface);

            color:
                var(--h-text);
        }

        /*
         * Main content
         */
        .hcfd2-main {
            min-height: 540px;

            padding: 20px;

            background:
                var(--h-surface);
        }

        .hcfd2-main > :not(.hcfd2-supply-sheet-backdrop):not(.hcfd2-filter-backdrop) {
            animation: hcfd2-view-enter 180ms ease-out both;
        }

        .hcfd2-shell.hcfd2-no-enter .hcfd2-main > * { animation: none !important; }

        .hcfd2-supply-sheet-backdrop,
        .hcfd2-filter-backdrop { animation: none !important; }

        .hcfd2-view-context {
            position: sticky;
            top: 0;
            z-index: 8;
            display: flex;
            align-items: center;
            gap: 10px;
            width: fit-content;
            max-width: 100%;
            min-height: 54px;
            margin: 0 0 14px;
            padding: 7px 13px 7px 9px;
            border: 1px solid var(--h-accent-strong);
            border-radius: 999px;
            background: color-mix(in srgb, var(--h-surface) 94%, transparent);
            box-shadow: 0 5px 18px rgba(17, 24, 39, 0.15);
            backdrop-filter: blur(10px);
        }

        .hcfd2-view-context > div:last-child {
            display: grid;
            gap: 1px;
            min-width: 0;
        }

        .hcfd2-view-context > div:last-child > span {
            color: var(--h-muted);
            font-size: 0.67rem;
            font-weight: 850;
            letter-spacing: 0.04em;
            text-transform: uppercase;
        }

        .hcfd2-view-context strong {
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap;
        }

        .hcfd2-context-icon {
            display: grid;
            place-items: center;
            width: 42px;
            height: 42px;
            border-radius: 50%;
            background: var(--h-accent);
            font-size: 1.15rem;
        }

        @keyframes hcfd2-view-enter {
            from {
                opacity: 0;
                transform: translateY(7px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        @media (prefers-reduced-motion: reduce) {
            .hcfd2-main > * { animation: none; }
        }

        /*
         * Home dashboard
         */
        .hcfd2-supply-alerts {
            max-width: 1500px;
            margin: 0 auto 20px;
            overflow: hidden;
            border: 1px solid #c2410c;
            border-left: 6px solid #c2410c;
            border-radius: 15px;
            background: color-mix(in srgb, #ffedd5 76%, var(--h-surface));
            box-shadow: 0 7px 20px rgba(194, 65, 12, 0.12);
        }

        .hcfd2-supply-alerts > header {
            display: flex;
            align-items: center;
            justify-content: space-between;
            gap: 12px;
            padding: 13px 16px;
            border-bottom: 1px solid color-mix(in srgb, #c2410c 30%, var(--h-border));
        }

        .hcfd2-supply-alerts > header span { color: #9a3412; font-size: 0.7rem; font-weight: 900; letter-spacing: 0.05em; text-transform: uppercase; }
        .hcfd2-supply-alerts > header h2 { margin: 1px 0 0; font-size: 1.15rem; }
        .hcfd2-supply-alerts > header > strong { color: #9a3412; font-size: 0.78rem; }
        .hcfd2-supply-alerts > div { display: grid; }

        .hcfd2-supply-alerts article {
            display: grid;
            grid-template-columns: 42px minmax(0, 1fr) auto;
            align-items: center;
            gap: 11px;
            padding: 12px 16px;
            border-bottom: 1px solid color-mix(in srgb, #c2410c 18%, var(--h-border));
        }

        .hcfd2-supply-alerts article:last-child { border-bottom: 0; }
        .hcfd2-supply-alerts article > div:nth-child(2) { display: grid; gap: 2px; }
        .hcfd2-supply-alerts article span,
        .hcfd2-supply-alerts article small { color: var(--h-muted); font-size: 0.75rem; }
        .hcfd2-supply-alerts article small b { color: #c2410c; font-weight: 900; }
        .hcfd2-supply-alerts .hcfd2-alert-note { grid-column: 2 / -1; margin-top: 7px; }
        .hcfd2-supply-alerts .hcfd2-alert-note summary { width: fit-content; color: var(--h-accent-strong); cursor: pointer; font-size: 0.78rem; font-weight: 900; }
        .hcfd2-supply-alerts .hcfd2-alert-note .hcfd2-report-comments { margin-top: 8px; padding: 9px; border-radius: 9px; background: var(--h-surface-muted); }
        .hcfd2-supply-icon { display: grid; place-items: center; width: 40px; height: 40px; border-radius: 10px; background: var(--h-surface); font-size: 1.25rem; }
        .hcfd2-supply-alerts button { padding: 9px 12px; border: 1px solid #c2410c; border-radius: 9px; background: var(--h-surface); color: #9a3412; cursor: pointer; font-weight: 900; }
        .hcfd2-supply-alerts button:hover { background: #c2410c; color: #fff; }

        .hcfd2-supply-summary { display: grid; grid-template-columns: 40px minmax(0, 1fr) auto; align-items: center; gap: 10px; width: 100%; max-width: 1500px; min-height: 58px; margin: 0 auto 12px; padding: 8px 12px; border: 1px solid #c2410c; border-radius: 13px; background: color-mix(in srgb, #ffedd5 76%, var(--h-surface)); color: var(--h-text); cursor: pointer; text-align: left; }
        .hcfd2-supply-summary > span:nth-child(2) { display: grid; gap: 1px; }
        .hcfd2-supply-summary small { color: var(--h-muted); font-size: 0.72rem; }
        .hcfd2-supply-summary > span:last-child { color: #9a3412; font-size: 1.8rem; line-height: 1; }
        .hcfd2-supply-sheet-backdrop { position: fixed; inset: 0; z-index: 2147483645; display: grid; align-items: end; background: rgba(12, 16, 22, 0.56); }
        .hcfd2-supply-sheet.hcfd2-supply-alerts { width: 100%; max-width: none; max-height: min(72vh, 650px); margin: 0; overflow-y: auto; border-right: 0; border-bottom: 0; border-left-width: 0; border-radius: 22px 22px 0 0; background: var(--h-surface); box-shadow: 0 -12px 36px rgba(0, 0, 0, 0.28); }
        .hcfd2-sheet-handle { width: 38px; height: 4px; margin: 9px auto 2px; border-radius: 999px; background: var(--h-border); }
        .hcfd2-supply-sheet > header { position: sticky; top: 0; z-index: 1; background: var(--h-surface); }
        .hcfd2-supply-sheet > div:last-child { padding-bottom: calc(24px + env(safe-area-inset-bottom)); }
        .hcfd2-supply-alerts .hcfd2-sheet-close { width: 44px; height: 44px; padding: 0; border: 0; border-radius: 50%; background: var(--h-surface-muted); color: var(--h-text); font-size: 1.55rem; }

        .hcfd2-home-grid {
            display: grid;

            grid-template-columns:
                repeat(
                    auto-fit,
                    minmax(370px, 1fr)
                );

            gap: 20px;

            max-width: 1500px;

            margin: 0 auto;
        }

        .hcfd2-home-view-bar {
            display: flex;
            align-items: center;
            justify-content: space-between;
            gap: 16px;
            max-width: 1500px;
            margin: 0 auto 20px;
            padding: 13px 16px;
            border: 1px solid var(--h-border);
            border-radius: 14px;
            background: var(--h-surface-muted);
        }

        .hcfd2-home-view-bar > div:first-child {
            display: grid;
            gap: 2px;
        }

        .hcfd2-home-view-bar > div:first-child span {
            color: var(--h-muted);
            font-size: 0.72rem;
            font-weight: 800;
        }

        .hcfd2-view-switch {
            display: inline-flex;
            overflow: hidden;
            border: 1px solid var(--h-border);
            border-radius: 10px;
            background: var(--h-surface);
        }

        .hcfd2-view-switch button {
            min-width: 88px;
            padding: 9px 14px;
            border: 0;
            border-right: 1px solid var(--h-border);
            background: transparent;
            color: var(--h-text);
            cursor: pointer;
            font-weight: 850;
        }

        .hcfd2-view-switch button:last-child { border-right: 0; }
        .hcfd2-view-switch button.active { background: var(--h-accent); color: #2b210d; }

        .hcfd2-week-nav,
        .hcfd2-week-summary {
            max-width: 1500px;
            margin: 0 auto 20px;
            border: 1px solid var(--h-border);
            border-radius: 17px;
            background: var(--h-surface);
        }

        .hcfd2-week-nav {
            display: grid;
            grid-template-columns: 1fr auto 1fr;
            align-items: center;
            gap: 18px;
            padding: 15px 18px;
            background: var(--h-surface-muted);
        }

        .hcfd2-week-stepper,
        .hcfd2-week-options {
            display: flex;
            align-items: flex-end;
            gap: 8px;
        }

        .hcfd2-week-options { justify-content: flex-end; }

        .hcfd2-week-nav button,
        .hcfd2-week-nav input,
        .hcfd2-week-nav select {
            min-height: 40px;
            padding: 8px 10px;
            border: 1px solid var(--h-border);
            border-radius: 9px;
            background: var(--h-surface);
            color: var(--h-text);
            font: inherit;
        }

        .hcfd2-week-nav button { cursor: pointer; font-weight: 800; }
        .hcfd2-week-nav button:hover { border-color: var(--h-accent-strong); }
        .hcfd2-week-options label { display: grid; gap: 3px; }
        .hcfd2-week-options label > span,
        .hcfd2-week-heading > span,
        .hcfd2-week-summary-head span {
            color: var(--h-muted);
            font-size: 0.72rem;
            font-weight: 800;
        }

        .hcfd2-week-heading { text-align: center; }
        .hcfd2-week-heading h2 { margin: 2px 0; font-size: 1.2rem; }
        .hcfd2-week-heading small { color: var(--h-muted); }

        .hcfd2-week-summary { padding: 18px; }
        .hcfd2-week-summary-head { display: flex; align-items: end; justify-content: space-between; gap: 16px; margin-bottom: 14px; }
        .hcfd2-week-summary-head h2 { margin: 2px 0 0; }
        .hcfd2-week-summary-head > small { color: var(--h-muted); }
        .hcfd2-week-summary-actions { display: flex; align-items: center; gap: 10px; }
        .hcfd2-week-summary-actions small { color: var(--h-muted); }
        .hcfd2-week-summary-actions button { padding: 9px 12px; border: 1px solid var(--h-accent-strong); border-radius: 9px; background: var(--h-accent); color: #2b210d; cursor: pointer; font-weight: 850; }
        .hcfd2-week-comparison { margin-bottom: 16px; overflow: hidden; border: 1px solid var(--h-border); border-radius: 14px; background: var(--h-surface); }
        .hcfd2-week-comparison-title { display: grid; gap: 2px; padding: 12px 14px; border-bottom: 1px solid var(--h-border); background: var(--h-surface-muted); }
        .hcfd2-week-comparison-title span { color: var(--h-muted); font-size: 0.72rem; font-weight: 800; }
        .hcfd2-week-comparison-scroll { overflow-x: auto; }
        .hcfd2-week-comparison table { width: 100%; min-width: 430px; border-collapse: collapse; }
        .hcfd2-week-comparison th,
        .hcfd2-week-comparison td { padding: 11px 16px; border-bottom: 1px solid var(--h-border); text-align: center; }
        .hcfd2-week-comparison tr:last-child th,
        .hcfd2-week-comparison tr:last-child td { border-bottom: 0; }
        .hcfd2-week-comparison thead th { background: color-mix(in srgb, var(--h-accent) 15%, var(--h-surface)); font-size: 0.82rem; }
        .hcfd2-week-comparison th:first-child { width: 42%; text-align: left; }
        .hcfd2-week-comparison tbody th { color: var(--h-muted); font-size: 0.8rem; }
        .hcfd2-week-comparison tbody td { font-size: 1.05rem; font-weight: 900; }
        .hcfd2-week-comparison tbody td strong,
        .hcfd2-week-delta { display: block; }
        .hcfd2-week-delta { margin-top: 2px; color: var(--h-muted); font-size: 0.65rem; font-weight: 700; }
        .hcfd2-week-delta.up { color: #18794e; }
        .hcfd2-week-delta.down { color: #b54708; }
        .hcfd2-week-summary-grid { display: grid; grid-template-columns: repeat(auto-fit, minmax(330px, 1fr)); gap: 12px; }
        .hcfd2-week-summary-grid > article { padding: 14px; border: 1px solid var(--h-border); border-radius: 13px; background: var(--h-surface-muted); }
        .hcfd2-week-child { display: flex; align-items: center; gap: 10px; margin-bottom: 12px; }
        .hcfd2-week-child h3 { margin: 0; }
        .hcfd2-week-counts { display: grid; grid-template-columns: repeat(3, 1fr); gap: 8px; }
        .hcfd2-week-counts > div { display: grid; grid-template-columns: auto auto 1fr; align-items: center; gap: 5px; padding: 8px; border-radius: 9px; background: var(--h-surface); }
        .hcfd2-week-counts small { color: var(--h-muted); }
        .hcfd2-week-detail { margin-top: 18px; }
        .hcfd2-week-detail h3 { margin: 0 0 8px; }
        .hcfd2-week-detail table { width: 100%; border-collapse: collapse; }
        .hcfd2-week-detail th,
        .hcfd2-week-detail td { padding: 9px 12px; border: 1px solid var(--h-border); text-align: center; }
        .hcfd2-week-detail th:first-child { text-align: left; }
        .hcfd2-week-favorites { display: grid; grid-template-columns: repeat(auto-fit, minmax(280px, 1fr)); gap: 14px; margin-top: 18px; }
        .hcfd2-week-favorites article { padding: 12px; border: 1px solid var(--h-border); border-radius: 12px; }
        .hcfd2-week-favorites h3 { margin: 0 0 9px; }
        .hcfd2-week-favorites article > div { display: grid; grid-template-columns: repeat(6, 1fr); gap: 5px; }
        .hcfd2-week-favorites img { width: 100%; aspect-ratio: 1; border-radius: 7px; object-fit: cover; }

        .hcfd2-calendar {
            max-width: 1200px;
            margin: 0 auto;
            overflow: hidden;
            border: 1px solid var(--h-border);
            border-radius: 17px;
            background: var(--h-surface);
        }

        .hcfd2-calendar-head {
            display: flex;
            align-items: flex-end;
            justify-content: space-between;
            gap: 18px;
            padding: 18px;
            border-bottom: 1px solid var(--h-border);
            background: var(--h-surface-muted);
        }

        .hcfd2-calendar-head h2 { margin: 2px 0; font-size: 1.5rem; }
        .hcfd2-calendar-head > div > span,
        .hcfd2-calendar-head small,
        .hcfd2-calendar-controls label span {
            color: var(--h-muted);
            font-size: 0.72rem;
            font-weight: 800;
        }

        .hcfd2-calendar-controls { display: flex; align-items: flex-end; gap: 8px; }
        .hcfd2-calendar-controls label { display: grid; gap: 3px; }
        .hcfd2-calendar-controls button,
        .hcfd2-calendar-controls input {
            min-height: 40px;
            padding: 8px 10px;
            border: 1px solid var(--h-border);
            border-radius: 9px;
            background: var(--h-surface);
            color: var(--h-text);
            font: inherit;
        }
        .hcfd2-calendar-controls button { cursor: pointer; font-weight: 800; }
        .hcfd2-calendar-controls button:hover { border-color: var(--h-accent-strong); }

        .hcfd2-calendar-weekdays,
        .hcfd2-calendar-grid { display: grid; grid-template-columns: repeat(7, 1fr); }
        .hcfd2-calendar-scope { display: flex; justify-content: center; gap: 8px; padding: 10px 14px; overflow-x: auto; border-bottom: 1px solid var(--h-border); background: var(--h-surface); }
        .hcfd2-calendar-scope button { display: flex; align-items: center; gap: 7px; min-height: 40px; padding: 6px 12px; border: 1px solid var(--h-border); border-radius: 999px; background: var(--h-surface-muted); color: var(--h-text); cursor: pointer; font-weight: 850; white-space: nowrap; }
        .hcfd2-calendar-scope button.active { border-color: var(--h-accent-strong); background: var(--h-accent); color: #2b210d; }
        .hcfd2-calendar-scope .hcfd2-avatar { width: 28px; height: 28px; font-size: 0.68rem; cursor: default; }
        .hcfd2-family-icon { display: grid; place-items: center; min-width: 28px; min-height: 28px; font-size: 1rem; }
        .hcfd2-calendar-weekdays { border-bottom: 1px solid var(--h-border); background: var(--h-surface-muted); }
        .hcfd2-calendar-weekdays span { padding: 9px; color: var(--h-muted); font-size: 0.72rem; font-weight: 900; text-align: center; text-transform: uppercase; }

        .hcfd2-calendar-day {
            min-height: 112px;
            padding: 9px;
            border: 0;
            border-right: 1px solid var(--h-border);
            border-bottom: 1px solid var(--h-border);
            background: var(--h-surface);
            color: var(--h-text);
            cursor: pointer;
            text-align: left;
        }
        .hcfd2-calendar-day:nth-child(7n) { border-right: 0; }
        .hcfd2-calendar-day:hover { background: var(--h-surface-muted); }
        .hcfd2-calendar-day.outside { color: var(--h-muted); opacity: 0.48; }
        .hcfd2-calendar-day.today > span { display: grid; place-items: center; width: 27px; height: 27px; border-radius: 50%; background: var(--h-accent); color: #2b210d; font-weight: 900; }
        .hcfd2-calendar-day.selected { background: color-mix(in srgb, var(--h-accent) 18%, var(--h-surface)); box-shadow: inset 0 0 0 2px var(--h-accent-strong); }
        .hcfd2-calendar-day > div { display: grid; gap: 5px; margin-top: 10px; }
        .hcfd2-calendar-day small { width: fit-content; padding: 4px 7px; border-radius: 999px; background: var(--h-surface-muted); color: var(--h-text); font-size: 0.75rem; }
        .hcfd2-calendar-note { margin: 0; padding: 12px 18px; color: var(--h-muted); font-size: 0.78rem; }

        .hcfd2-calendar-modal { position: fixed; inset: 0; z-index: 2147483644; display: grid; place-items: center; padding: 24px; background: rgba(12, 16, 22, 0.72); backdrop-filter: blur(4px); }
        .hcfd2-calendar-detail { display: grid; grid-template-rows: auto auto minmax(0, 1fr); width: min(940px, 94vw); max-height: min(780px, 90vh); overflow: hidden; border: 1px solid var(--h-border); border-radius: 18px; outline: none; background: var(--h-surface); box-shadow: var(--h-shadow); }
        .hcfd2-calendar-detail > header { position: relative; display: grid; grid-template-columns: 48px 1fr 48px; align-items: center; gap: 12px; padding: 18px 62px 18px 18px; border-bottom: 2px solid var(--h-accent); background: var(--h-surface-muted); text-align: center; }
        .hcfd2-calendar-detail > header div { display: grid; gap: 2px; }
        .hcfd2-calendar-detail h3 { margin: 0; }
        .hcfd2-calendar-detail header span,
        .hcfd2-calendar-detail header small { color: var(--h-muted); font-size: 0.72rem; font-weight: 800; }
        .hcfd2-calendar-detail-child { display: flex !important; align-items: center; justify-content: center; gap: 8px; margin-top: 5px; }
        .hcfd2-calendar-detail-child .hcfd2-avatar { width: 30px; height: 30px; font-size: 0.72rem; cursor: default; }
        .hcfd2-calendar-detail-child strong { font-size: 0.86rem; }
        .hcfd2-calendar-detail-child small { padding-left: 8px; border-left: 1px solid var(--h-border); }
        .hcfd2-calendar-popup-scope .hcfd2-calendar-scope { padding: 8px 12px; background: var(--h-surface); }
        .hcfd2-calendar-detail header button { width: 44px; height: 44px; border: 1px solid var(--h-border); border-radius: 50%; background: var(--h-surface); color: var(--h-text); cursor: pointer; font-size: 30px; line-height: 1; }
        .hcfd2-calendar-detail header button:hover { border-color: var(--h-accent-strong); }
        .hcfd2-calendar-detail header .close { position: absolute; top: 12px; right: 12px; font-size: 26px; }
        .hcfd2-calendar-detail-body { overflow-y: auto; padding: 16px 18px 8px; }

        .hcfd2-activity-switch {
            display: flex;
            width: min(360px, 100%);
            margin: 0 auto 14px;
            padding: 4px;
            border: 1px solid var(--h-border);
            border-radius: 14px;
            background: var(--h-surface-muted);
        }

        .hcfd2-activity-switch button {
            flex: 1;
            min-height: 42px;
            border: 0;
            border-radius: 10px;
            background: transparent;
            color: var(--h-muted);
            font-weight: 850;
        }

        .hcfd2-activity-switch button.active {
            background: var(--h-surface);
            color: var(--h-text);
            box-shadow: 0 2px 10px rgba(30, 24, 12, 0.12);
        }

        .hcfd2-timeline-scope {
            display: flex;
            align-items: center;
            justify-content: space-between;
            gap: 16px;
            max-width: 1500px;
            margin: 0 auto 14px;
            padding: 12px 14px;
            border: 1px solid var(--h-border);
            border-radius: 13px;
            background: var(--h-surface-muted);
        }

        .hcfd2-timeline-scope > div:first-child { display: grid; gap: 2px; }
        .hcfd2-timeline-scope > div:first-child span { color: var(--h-muted); font-size: 0.72rem; font-weight: 800; }
        .hcfd2-timeline-scope > div:last-child { display: inline-flex; overflow: hidden; border: 1px solid var(--h-border); border-radius: 10px; background: var(--h-surface); }
        .hcfd2-timeline-scope button { min-width: 86px; padding: 9px 13px; border: 0; border-right: 1px solid var(--h-border); background: transparent; color: var(--h-text); cursor: pointer; font-weight: 850; }
        .hcfd2-timeline-scope button:last-child { border-right: 0; }
        .hcfd2-timeline-scope button.active { background: var(--h-accent); color: #2b210d; }
        .hcfd2-item-owner { width: fit-content; padding: 2px 7px; border-radius: 999px; background: var(--h-accent); color: #2b210d !important; font-size: 0.68rem !important; font-weight: 900; }

        .hcfd2-home-card {
            overflow: hidden;

            border:
                1px solid
                var(--h-border);

            border-radius: 17px;

            background:
                var(--h-surface);

            box-shadow:
                0 6px 18px
                rgba(0, 0, 0, 0.07);
        }

        .hcfd2-card-head {
            display: flex;
            align-items: center;

            gap: 13px;

            padding: 16px;

            background:
                var(--h-surface-muted);
        }

        .hcfd2-card-head h2 {
            margin: 0;
        }

        .hcfd2-card-head p {
            margin: 2px 0 0;

            color:
                var(--h-muted);

            font-size: 0.8rem;
        }

        .hcfd2-card-head button {
            margin-left: auto;
        }

        .hcfd2-metrics {
            display: grid;

            grid-template-columns:
                repeat(3, 1fr);

            border-top:
                1px solid
                var(--h-border);

            border-bottom:
                1px solid
                var(--h-border);
        }

        .hcfd2-metrics.four { grid-template-columns: repeat(4, 1fr); }

        .hcfd2-metrics button {
            padding: 14px 8px;

            border: 0;

            border-right:
                1px solid
                var(--h-border);

            background:
                var(--h-surface);

            color:
                var(--h-text);

            cursor: pointer;
        }

        .hcfd2-metrics button:last-child {
            border-right: 0;
        }

        .hcfd2-metrics button:hover {
            background:
                var(--h-surface-muted);
        }

        .hcfd2-metrics strong,
        .hcfd2-metrics span {
            display: block;
        }

        .hcfd2-metrics strong {
            font-size: 1.5rem;
        }

        .hcfd2-metrics span {
            color:
                var(--h-muted);

            font-size: 0.74rem;
        }

        .hcfd2-section-title {
            display: flex;
            align-items: center;
            justify-content: space-between;

            padding: 15px 15px 8px;
        }

        .hcfd2-section-title h3 {
            margin: 0;
        }

        /*
         * Home-page photo preview strip
         */
        .hcfd2-photo-strip {
            display: grid;

            grid-template-columns:
                repeat(6, 1fr);

            gap: 6px;

            padding: 0 15px 15px;
        }

        .hcfd2-photo-strip button {
            aspect-ratio: 1;

            padding: 0;

            overflow: hidden;

            border: 0;
            border-radius: 9px;

            background:
                var(--h-surface-muted);

            cursor: zoom-in;
        }

        .hcfd2-photo-strip img {
            display: block;

            width: 100%;
            height: 100%;

            object-fit: cover;

            transition:
                transform 0.2s ease;
        }

        .hcfd2-photo-strip button:hover img {
            transform: scale(1.05);
        }

        /*
         * Small timeline shown on home cards
         */
        .hcfd2-mini-timeline {
            display: grid;

            gap: 7px;

            padding: 0 15px 16px;
        }

        .hcfd2-mini-timeline > div,
        .hcfd2-mini-timeline > details {
            display: flex;
            align-items: center;

            gap: 10px;

            padding: 9px;

            border:
                1px solid
                var(--h-border);

            border-radius: 10px;

            background:
                var(--h-surface-muted);
        }

        .hcfd2-mini-timeline > details > summary { display:flex; align-items:center; gap:10px; cursor:pointer; list-style:none; }
        .hcfd2-mini-timeline > details > summary::-webkit-details-marker { display:none; }
        .hcfd2-mini-timeline > details > summary > span { font-size:1.2rem; }
        .hcfd2-mini-timeline > details > .hcfd2-report-comments { margin:8px 0 0 30px; padding:8px; border-radius:8px; background:var(--h-surface); }

        .hcfd2-activity-meal { --activity-color: #dff3e4; --activity-strong: #2f855a; }
        .hcfd2-activity-potty { --activity-color: #dceefe; --activity-strong: #2878b5; }
        .hcfd2-activity-nap { --activity-color: #ece5fa; --activity-strong: #7653b5; }
        .hcfd2-activity-bottle { --activity-color: #fde7ef; --activity-strong: #b84f76; }
        .hcfd2-activity-supplies { --activity-color: #e4f1ef; --activity-strong: #397f78; }
        .hcfd2-activity-general { --activity-color: #edf0f4; --activity-strong: #667085; }
        .hcfd2-mini-timeline > :is(div,details)[class*="hcfd2-activity-"] { border-left: 4px solid var(--activity-strong); background: color-mix(in srgb, var(--activity-color) 72%, var(--h-surface)); }
        .hcfd2-mini-timeline > .hcfd2-mini-photo {
            border-left: 4px solid #364152;
            background: color-mix(in srgb, #e8edf3 72%, var(--h-surface));
        }
        .hcfd2-time-item[class*="hcfd2-activity-"] .hcfd2-time-dot { background: var(--activity-color); }
        .hcfd2-time-item[class*="hcfd2-activity-"] .hcfd2-time-card {
            border-left: 4px solid var(--activity-strong);
            background: color-mix(in srgb, var(--activity-color) 72%, var(--h-surface));
        }
        .hcfd2-time-item.photo .hcfd2-time-card {
            border-left: 4px solid #364152;
            background: color-mix(in srgb, #e8edf3 72%, var(--h-surface));
        }

        .hcfd2-mini-timeline > div > span {
            font-size: 1.2rem;
        }

        .hcfd2-mini-photo > button {
            flex: 0 0 auto;
            width: 48px;
            height: 48px;
            padding: 0;
            overflow: hidden;
            border: 1px solid var(--h-border);
            border-radius: 9px;
            background: var(--h-surface);
            cursor: zoom-in;
        }

        .hcfd2-mini-photo > button img {
            display: block;
            width: 100%;
            height: 100%;
            object-fit: cover;
            transition: transform 0.18s ease;
        }

        .hcfd2-mini-photo > button:hover img { transform: scale(1.08); }

        .hcfd2-mini-timeline p {
            margin: 0;
        }

        .hcfd2-mini-timeline strong,
        .hcfd2-mini-timeline small {
            display: block;
        }

        .hcfd2-mini-timeline small {
            color:
                var(--h-muted);

            font-size: 0.72rem;
        }

        /*
         * Shared filters/search toolbar
         */
        .hcfd2-toolbar {
            position: sticky;
            top: 68px;

            z-index: 5;

            display: flex;
            align-items: flex-end;
            flex-wrap: wrap;

            gap: 12px;

            max-width: 1500px;

            margin: 0 auto 18px;

            padding: 12px;

            border:
                1px solid
                var(--h-border);

            border-radius: 13px;

            background:
                color-mix(
                    in srgb,
                    var(--h-surface) 95%,
                    transparent
                );

            backdrop-filter: blur(8px);
        }

        .hcfd2-toolbar label {
            display: grid;

            gap: 3px;

            min-width:
                min(300px, 100%);

            flex: 1;
        }

        .hcfd2-toolbar label span {
            color:
                var(--h-muted);

            font-size: 0.72rem;
            font-weight: 800;
        }

        .hcfd2-toolbar input {
            min-height: 40px;

            padding: 8px 10px;

            border:
                1px solid
                var(--h-border);

            border-radius: 9px;

            outline: none;

            background:
                var(--h-surface);

            color:
                var(--h-text);
        }

        .hcfd2-toolbar input:focus {
            border-color:
                var(--h-accent-strong);

            box-shadow:
                0 0 0 3px
                color-mix(
                    in srgb,
                    var(--h-accent) 25%,
                    transparent
                );
        }

        .hcfd2-count {
            color:
                var(--h-muted);

            font-size: 0.78rem;

            white-space: nowrap;
        }

        .hcfd2-pills {
            display: inline-flex;

            overflow: hidden;

            border:
                1px solid
                var(--h-border);

            border-radius: 9px;
        }

        .hcfd2-pills button {
            border: 0;

            border-right:
                1px solid
                var(--h-border);

            border-radius: 0;
        }

        .hcfd2-pills button:last-child {
            border-right: 0;
        }

        .hcfd2-pills button.active {
            background:
                var(--h-accent);

            color: #2b210d;
        }

        /*
         * Full chronological timeline
         */
        .hcfd2-timeline {
            position: relative;

            display: grid;

            max-width: 900px;

            margin: 0 auto;
        }

        .hcfd2-time-item {
            display: grid;

            grid-template-columns:
                78px 44px 1fr;

            align-items: start;

            min-height: 78px;
        }

        .hcfd2-time-item > time {
            padding-top: 15px;

            color:
                var(--h-muted);

            font-size: 0.75rem;
            text-align: right;
        }

        .hcfd2-time-dot {
            position: relative;

            z-index: 2;

            display: grid;
            place-items: center;

            width: 36px;
            height: 36px;

            margin: 8px auto;

            border-radius: 50%;

            background:
                var(--h-accent);

            box-shadow:
                0 0 0 5px
                var(--h-surface);
        }

        .hcfd2-time-item:not(:last-child)
        .hcfd2-time-dot::after {
            content: "";

            position: absolute;

            top: 34px;
            bottom: -44px;

            width: 2px;

            background:
                var(--h-border);
        }

        .hcfd2-time-card {
            display: grid;

            gap: 3px;

            margin: 5px 0 13px;

            padding: 13px;

            border:
                1px solid
                var(--h-border);

            border-radius: 13px;

            background:
                var(--h-surface-muted);
        }

        .hcfd2-time-card span,
        .hcfd2-time-card small {
            color:
                var(--h-muted);

            font-size: 0.76rem;
        }

        .hcfd2-time-card:not(.report) {
            grid-template-columns:
                110px 1fr;
        }

        .hcfd2-timeline-report summary { display: grid; gap: 3px; cursor: pointer; list-style: none; }
        .hcfd2-timeline-report summary::-webkit-details-marker { display: none; }
        .hcfd2-timeline-report > .hcfd2-feed-report-detail { display: grid; gap: 7px; padding-top: 9px; border-top: 1px solid var(--h-border); }

        .hcfd2-time-photo {
            width: 110px;
            height: 82px;

            padding: 0;

            overflow: hidden;

            border: 0;
            border-radius: 9px;

            background:
                var(--h-surface);

            cursor: zoom-in;
        }

        .hcfd2-time-photo img {
            display: block;

            width: 100%;
            height: 100%;

            object-fit: cover;
        }

        /*
         * Row-first photo gallery. CSS columns fill top-to-bottom, which makes
         * newer photos appear below older ones in the first visual row.
         */
        .hcfd2-gallery {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
            align-items: start;
            gap: 14px;

            max-width: 1500px;

            margin: 0 auto;
        }

        .hcfd2-photo-card {
            position: relative;

            display: block;

            width: 100%;

            margin: 0;

            overflow: hidden;

            border:
                1px solid
                var(--h-border);

            border-left: 4px solid #364152;

            border-radius: 14px;

            background:
                var(--h-surface);

            box-shadow:
                0 5px 14px
                rgba(0, 0, 0, 0.06);
        }

        .hcfd2-photo-main {
            display: block;

            width: 100%;

            padding: 0;

            border: 0;

            background:
                var(--h-surface-muted);

            cursor: zoom-in;
        }

        .hcfd2-photo-main img {
            display: block;

            width: 100%;
            height: auto;

            min-height: 160px;

            object-fit: cover;

            transition:
                transform 0.2s ease;
        }

        .hcfd2-photo-main:hover img {
            transform: scale(1.025);
        }

        .hcfd2-favorite {
            position: absolute;

            top: 9px;
            right: 9px;

            width: 38px;
            height: 38px;

            border: 0;
            border-radius: 50%;

            background:
                rgba(20, 24, 30, 0.68);

            color: #ffffff;

            font-size: 22px;

            cursor: pointer;
        }

        .hcfd2-favorite.active {
            background:
                var(--h-accent);

            color: #2b210d;
        }

        .hcfd2-photo-copy {
            display: grid;

            gap: 3px;

            padding: 11px 12px;
        }

        .hcfd2-photo-copy span,
        .hcfd2-photo-copy small {
            color:
                var(--h-muted);

            font-size: 0.75rem;
        }

        .hcfd2-photo-copy a {
            margin-top: 4px;

            color:
                var(--h-accent-strong);

            font-size: 0.77rem;
            font-weight: 800;
        }

        /*
         * Reports
         */
        .hcfd2-report-groups {
            display: grid;

            gap: 16px;

            max-width: 1100px;

            margin: 0 auto;
        }

        .hcfd2-report-groups > article {
            overflow: hidden;

            border:
                1px solid
                var(--h-border);

            border-radius: 14px;
        }

        .hcfd2-day-head {
            display: flex;
            align-items: center;
            justify-content: space-between;

            padding: 12px 15px;

            border-bottom:
                1px solid
                var(--h-border);

            background:
                var(--h-surface-muted);
        }

        .hcfd2-day-head h2 {
            margin: 0;

            font-size: 1rem;
        }

        .hcfd2-day-head span {
            color:
                var(--h-muted);

            font-size: 0.75rem;
        }

        .hcfd2-report-card {
            margin: 9px;
            border:
                1px solid
                var(--h-border);

            border-left: 4px solid var(--activity-strong, var(--h-accent-strong));

            border-radius: 11px;

            background:
                color-mix(in srgb, var(--activity-color, var(--h-surface-muted)) 72%, var(--h-surface));
        }

        .hcfd2-report-card[open] { box-shadow: inset 0 0 0 1px var(--activity-strong, var(--h-accent-strong)); }
        .hcfd2-report-card summary { display: flex; align-items: center; gap: 12px; padding: 12px; cursor: pointer; list-style: none; }
        .hcfd2-report-card summary::-webkit-details-marker { display: none; }
        .hcfd2-report-card summary > div:nth-child(2) { flex: 1; }
        .hcfd2-report-expand { color: var(--activity-strong, var(--h-accent-strong)) !important; font-size: 0.72rem !important; font-weight: 850; }
        .hcfd2-report-card[open] .hcfd2-report-expand::after { content: " ▴"; }
        .hcfd2-report-card:not([open]) .hcfd2-report-expand::after { content: " ▾"; }
        .hcfd2-report-details { display: grid; grid-template-columns: repeat(2, minmax(0, 1fr)); gap: 8px; padding: 0 12px 12px 64px; }
        .hcfd2-report-details > div { padding: 8px; border-radius: 8px; background: var(--h-surface); }
        .hcfd2-report-details strong,
        .hcfd2-report-details span { display: block; }
        .hcfd2-report-details strong { font-size: 0.7rem; text-transform: capitalize; }
        .hcfd2-report-details span { color: var(--h-muted); font-size: 0.76rem; overflow-wrap: anywhere; }
        .hcfd2-report-comments { grid-column: 1 / -1; background: color-mix(in srgb, var(--h-accent) 14%, var(--h-surface)) !important; }
        .hcfd2-report-comments strong { margin-bottom: 4px; }
        .hcfd2-report-comments span { white-space: pre-line; }
        .hcfd2-note-badge { display: inline-flex !important; align-items: center; width: fit-content; margin-left: 5px; padding: 2px 6px; border: 1px solid color-mix(in srgb, var(--h-accent-strong) 55%, transparent); border-radius: 999px; background: color-mix(in srgb, var(--h-accent) 18%, var(--h-surface)); color: var(--h-text) !important; font-size: 0.62rem !important; font-weight: 900; line-height: 1.2; vertical-align: middle; white-space: nowrap; }

        .hcfd2-report-icon {
            display: grid;
            place-items: center;

            flex: 0 0 auto;

            width: 40px;
            height: 40px;

            border-radius: 10px;

            background:
                var(--h-surface);

            font-size: 1.25rem;
        }

        .hcfd2-report-card strong,
        .hcfd2-report-card span,
        .hcfd2-report-card small {
            display: block;
        }

        .hcfd2-report-card span,
        .hcfd2-report-card small {
            color:
                var(--h-muted);

            font-size: 0.76rem;
        }

        /*
         * Statistics
         */
        .hcfd2-stat-grid {
            display: grid;

            grid-template-columns:
                repeat(4, 1fr);

            gap: 12px;

            max-width: 1200px;

            margin: 0 auto 18px;
        }

        .hcfd2-stat-grid article {
            padding: 18px;

            border:
                1px solid
                var(--h-border);

            border-radius: 14px;

            background:
                var(--h-surface-muted);

            text-align: center;
        }

        .hcfd2-stat-grid strong,
        .hcfd2-stat-grid span {
            display: block;
        }

        .hcfd2-stat-grid strong {
            font-size: 2rem;
        }

        .hcfd2-stat-grid span {
            color:
                var(--h-muted);

            font-size: 0.78rem;
        }

        .hcfd2-chart-grid {
            display: grid;

            grid-template-columns:
                repeat(2, 1fr);

            gap: 16px;

            max-width: 1200px;

            margin: 0 auto;
        }

        .hcfd2-bars {
            padding: 16px;

            border:
                1px solid
                var(--h-border);

            border-radius: 14px;
        }

        .hcfd2-bars h2 {
            margin-top: 0;
        }

        .hcfd2-bars > div {
            display: grid;

            grid-template-columns:
                minmax(100px, 1fr)
                2fr
                36px;

            align-items: center;

            gap: 10px;

            margin: 9px 0;

            font-size: 0.78rem;
        }

        .hcfd2-bars > div > div {
            height: 10px;

            overflow: hidden;

            border-radius: 999px;

            background:
                var(--h-surface-muted);
        }

        .hcfd2-bars i {
            display: block;

            height: 100%;

            border-radius: 999px;

            background:
                var(--h-accent-strong);
        }

        .hcfd2-note {
            max-width: 1200px;

            margin: 16px auto;

            color:
                var(--h-muted);

            font-size: 0.78rem;
        }

        .hcfd2-heatmap {
            max-width: 1200px;
            margin: 18px auto 0;
            padding: 16px;
            border: 1px solid var(--h-border);
            border-radius: 14px;
            background: var(--h-surface);
        }
        .hcfd2-heatmap > div:first-child span,
        .hcfd2-heatmap > small { color: var(--h-muted); font-size: 0.74rem; }
        .hcfd2-heatmap h2 { margin: 2px 0 14px; }
        .hcfd2-heatmap-grid { display: grid; grid-template-rows: repeat(7, 13px); grid-auto-flow: column; grid-auto-columns: minmax(8px, 1fr); gap: 4px; }
        .hcfd2-heatmap-grid span { border-radius: 3px; background: color-mix(in srgb, var(--h-accent-strong) calc(var(--heat) * 100%), var(--h-surface-muted)); }
        .hcfd2-heatmap > small { display: block; margin-top: 10px; }

        /*
         * Badges
         */
        .hcfd2-badges {
            max-width: 1200px;

            margin: 0 auto;
        }

        .hcfd2-badge-hero {
            display: flex;
            align-items: center;

            gap: 15px;

            padding: 18px;

            border:
                1px solid
                var(--h-border);

            border-radius: 14px;

            background:
                var(--h-surface-muted);
        }

        .hcfd2-badge-hero > span {
            display: grid;
            place-items: center;

            width: 64px;
            height: 64px;

            border-radius: 50%;

            background:
                var(--h-accent);

            color: #2b210d;

            font-size: 2rem;
        }

        .hcfd2-badge-hero h2,
        .hcfd2-badge-hero p {
            margin: 0;
        }

        .hcfd2-badge-hero p {
            color:
                var(--h-muted);
        }

        .hcfd2-badge-grid {
            display: grid;

            grid-template-columns:
                repeat(
                    auto-fill,
                    minmax(180px, 1fr)
                );

            gap: 12px;

            margin-top: 16px;
        }
        .hcfd2-badge-category { margin-top: 20px; }
        .hcfd2-badge-category h3 { margin: 0 0 8px; }

        .hcfd2-new-item { animation: hcfd2-new-highlight 2.4s ease-out both !important; }
        @keyframes hcfd2-new-highlight {
            0%, 35% { box-shadow: 0 0 0 4px color-mix(in srgb, var(--h-accent) 70%, transparent); background-color: color-mix(in srgb, var(--h-accent) 28%, var(--h-surface)); }
            100% { box-shadow: none; }
        }

        @media print {
            body.hcfd2-no-scroll { overflow: visible !important; }
            #hcfd2-launcher,
            .hcfd2-header,
            .hcfd2-children,
            .hcfd2-tabs,
            .hcfd2-view-context,
            .hcfd2-home-view-bar,
            .hcfd2-week-nav,
            .hcfd2-week-summary-actions button,
            .hcfd2-bottom-nav,
            .hcfd2-more-backdrop,
            #hcfd2-viewer { display: none !important; }
            #hcfd2-overlay { position: static; overflow: visible; background: #fff; }
            .hcfd2-main { padding: 0; background: #fff; }
            .hcfd2-main > :not(.hcfd2-week-summary) { display: none !important; }
            .hcfd2-week-summary { max-width: none; margin: 0; padding: 0; border: 0; color: #111; }
            .hcfd2-week-summary-grid { grid-template-columns: repeat(2, 1fr); }
            .hcfd2-week-summary-grid > article,
            .hcfd2-week-comparison { break-inside: avoid; background: #fff; }
            .hcfd2-avatar { print-color-adjust: exact; -webkit-print-color-adjust: exact; }
        }

        .hcfd2-badge-grid article {
            display: grid;
            justify-items: center;

            gap: 7px;

            padding: 18px;

            border:
                1px solid
                var(--h-border);

            border-radius: 14px;

            text-align: center;
        }

        .hcfd2-badge-grid article > span {
            display: grid;
            place-items: center;

            width: 46px;
            height: 46px;

            border-radius: 50%;

            background:
                var(--h-accent);

            color: #2b210d;

            font-size: 1.2rem;
        }

        .hcfd2-badge-grid small {
            color:
                var(--h-muted);
        }

        /*
         * Load-more section
         */
        .hcfd2-load-more {
            display: grid;
            justify-items: center;

            gap: 6px;

            margin-top: 20px;
        }

        .hcfd2-load-more small {
            color:
                var(--h-muted);
        }

        /*
         * Empty, loading, and error states
         */
        .hcfd2-empty {
            padding: 25px;

            color:
                var(--h-muted);

            text-align: center;
        }

        .hcfd2-loading,
        .hcfd2-error {
            display: grid;
            place-items: center;
            align-content: center;

            min-height: 100vh;

            padding: 40px;

            background:
                var(--h-surface);

            color:
                var(--h-text);

            text-align: center;
        }

        .hcfd2-spinner {
            width: 44px;
            height: 44px;

            border:
                4px solid
                var(--h-border);

            border-top-color:
                var(--h-accent-strong);

            border-radius: 50%;

            animation:
                hcfd2-spin
                0.8s linear infinite;
        }

        @keyframes hcfd2-spin {
            to {
                transform: rotate(360deg);
            }
        }

        .hcfd2-error button {
            margin: 5px;
            padding: 9px 13px;

            border:
                1px solid
                var(--h-border);

            border-radius: 9px;

            background:
                var(--h-surface-muted);

            color:
                var(--h-text);

            cursor: pointer;
        }

        /*
         * Full-screen photo viewer
         */
        #hcfd2-viewer {
            position: fixed;
            inset: 0;

            z-index: 2147483646;

            display: grid;

            grid-template-columns:
                70px 1fr 70px;

            align-items: center;

            padding: 22px;

            background:
                #101114;

            touch-action: pan-y;
            overflow: hidden;
            perspective: 1200px;
        }

        #hcfd2-viewer[hidden] {
            display: none !important;
        }

        #hcfd2-viewer > button {
            border: 0;

            background:
                rgba(255, 255, 255, 0.14);

            color: #ffffff;

            cursor: pointer;
        }

        #hcfd2-viewer
        > button[data-viewer="close"] {
            position: fixed;
            top: max(14px, env(safe-area-inset-top));
            left: 16px;
            right: auto;
            display: inline-flex;
            align-items: center;
            gap: 5px;
            width: auto;
            height: 42px;
            padding: 0 14px 1px 11px;
            border: 1px solid rgba(255, 210, 125, 0.45);
            border-radius: 999px;
            background: rgba(32, 29, 24, 0.88);
            color: #ffd27d;
            font-size: 1rem;
            font-weight: 800;
            backdrop-filter: blur(12px);
        }

        /*
         * Corrected selector:
         * both previous and next arrows now receive styling.
         */
        #hcfd2-viewer .prev,
        #hcfd2-viewer .next {
            width: 54px;
            height: 72px;

            border-radius: 14px;

            font-size: 42px;
        }

        #hcfd2-viewer figure {
            grid-column: 2;
            grid-row: 1;
            position: relative;

            width: 100%;
            max-width:
                min(1100px, 80vw);

            max-height: 92vh;

            margin: auto;
            transform-origin: 50% 78%;
            backface-visibility: hidden;
        }

        .hcfd2-viewer-loading {
            position: absolute;
            top: 12px;
            left: 50%;
            z-index: 3;
            display: none;
            align-items: center;
            gap: 8px;
            padding: 7px 11px;
            border: 1px solid rgba(255, 255, 255, 0.25);
            border-radius: 999px;
            background: rgba(0, 0, 0, 0.72);
            color: #ffffff;
            font-size: 0.75rem;
            font-weight: 800;
            transform: translateX(-50%);
            white-space: nowrap;
            pointer-events: none;
        }

        .hcfd2-viewer-loading-full .hcfd2-viewer-loading {
            display: flex;
        }

        .hcfd2-viewer-loading i {
            width: 13px;
            height: 13px;
            border: 2px solid rgba(255, 255, 255, 0.35);
            border-top-color: #ffd27d;
            border-radius: 50%;
            animation: hcfd2-spin 0.8s linear infinite;
        }

        #hcfd2-viewer figure.hcfd2-viewer-outgoing,
        #hcfd2-viewer figure.hcfd2-viewer-drag-preview {
            z-index: 1;
            pointer-events: none;
            will-change: transform;
        }

        #hcfd2-viewer > button {
            z-index: 2;
        }

        #hcfd2-viewer img {
            display: block;

            max-width: 100%;
            max-height: 76vh;

            margin: auto;

            border-radius: 12px;

            object-fit: contain;

            background: #17191d;
            transform-origin: center;
            transition: transform 100ms ease-out;
            will-change: transform;
        }

        #hcfd2-viewer figcaption {
            display: grid;

            gap: 3px;

            margin-top: 10px;

            color: #ffffff;

            text-align: center;
        }

        #hcfd2-viewer figcaption span,
        #hcfd2-viewer figcaption small {
            color: #d0d5dd;
        }

        #hcfd2-viewer figcaption div {
            display: flex;
            justify-content: center;
            flex-wrap: wrap;

            gap: 10px;

            margin-top: 7px;
        }

        #hcfd2-viewer figcaption button,
        #hcfd2-viewer figcaption a {
            padding: 8px 11px;

            border:
                1px solid
                rgba(255, 255, 255, 0.3);

            border-radius: 9px;

            background:
                rgba(255, 255, 255, 0.1);

            color: #ffd27d;

            cursor: pointer;
            text-decoration: none;
        }

        #hcfd2-viewer figcaption button[data-viewer="hide"] {
            border-color: rgba(255, 174, 174, 0.3);
            color: #ffc4c4;
        }

        .hcfd2-restore-hidden {
            min-height: 44px;
            border: 1px solid var(--h-border);
            border-radius: 10px;
            background: var(--h-surface-muted);
            color: var(--h-text);
            font-weight: 800;
        }

        /*
         * Tablet/mobile layout
         */
        @media (max-width: 800px) {
            #hcfd2-viewer {
                grid-template-columns: 1fr;
                padding: 14px;
            }

            #hcfd2-viewer figure {
                grid-column: 1;
                max-width: 100%;
            }

            #hcfd2-viewer .prev,
            #hcfd2-viewer .next {
                display: none;
            }

            .hcfd2-header {
                flex-direction: column;

                padding: 18px;
            }

            .hcfd2-actions {
                width: 100%;
                align-items: center;
                flex-wrap: wrap;
            }

            .hcfd2-actions
            .hcfd2-close {
                margin-left: auto;
            }

            .hcfd2-main {
                padding: 12px;
            }

            .hcfd2-home-grid {
                grid-template-columns: 1fr;
            }

            .hcfd2-week-nav { grid-template-columns: 1fr; }
            .hcfd2-week-heading { grid-row: 1; }
            .hcfd2-week-stepper,
            .hcfd2-week-options { justify-content: center; flex-wrap: wrap; }
            .hcfd2-week-summary-head { align-items: stretch; flex-direction: column; }
            .hcfd2-week-summary-actions { justify-content: space-between; }

            .hcfd2-calendar-head { align-items: stretch; flex-direction: column; }
            .hcfd2-calendar-controls { flex-wrap: wrap; }
            .hcfd2-calendar-day { min-height: 90px; }
            .hcfd2-calendar-scope { justify-content: flex-start; }

            .hcfd2-timeline-scope { align-items: stretch; flex-direction: column; }
            .hcfd2-timeline-scope > div:last-child { display: flex; }
            .hcfd2-timeline-scope button { flex: 1; }

            .hcfd2-photo-strip {
                grid-template-columns:
                    repeat(3, 1fr);
            }

            .hcfd2-toolbar {
                position: static;
            }

            .hcfd2-pills {
                width: 100%;
            }

            .hcfd2-pills button {
                flex: 1;
            }

            .hcfd2-stat-grid {
                grid-template-columns:
                    repeat(2, 1fr);
            }

            .hcfd2-chart-grid {
                grid-template-columns: 1fr;
            }

            .hcfd2-time-item {
                grid-template-columns:
                    54px 38px 1fr;
            }

            .hcfd2-time-card:not(.report) {
                grid-template-columns:
                    82px 1fr;
            }

            .hcfd2-time-photo {
                width: 82px;
                height: 68px;
            }

            #hcfd2-viewer {
                grid-template-columns:
                    44px 1fr 44px;

                padding: 10px;
            }

            #hcfd2-viewer figure {
                max-width: 82vw;
            }

            #hcfd2-viewer .prev,
            #hcfd2-viewer .next {
                width: 40px;
                height: 60px;

                font-size: 34px;
            }
        }

        @media (max-width: 480px) {
            .hcfd2-actions > button:not(.hcfd2-close),
            .hcfd2-actions > select { flex: 1 1 calc(33.333% - 8px); min-width: 0; }
            .hcfd2-tabs button {
                padding: 10px 9px;
            }

            .hcfd2-gallery {
                columns: 2 145px;
            }

            .hcfd2-stat-grid {
                grid-template-columns:
                    1fr 1fr;
            }

            .hcfd2-metrics {
                grid-template-columns:
                    repeat(3, 1fr);
            }
            .hcfd2-metrics.four { grid-template-columns: repeat(2, 1fr); }
            .hcfd2-heatmap { overflow-x: auto; }
            .hcfd2-heatmap-grid { min-width: 390px; }

            .hcfd2-home-view-bar { align-items: stretch; flex-direction: column; }
            .hcfd2-supply-alerts article { grid-template-columns: 38px 1fr; padding: 11px; }
            .hcfd2-supply-alerts article button { grid-column: 1 / -1; width: 100%; }
            .hcfd2-view-switch { display: flex; }
            .hcfd2-view-switch button { flex: 1; }

            .hcfd2-week-stepper { display: grid; grid-template-columns: 1fr 1fr; }
            .hcfd2-week-stepper button:nth-child(2) { grid-column: 1 / -1; grid-row: 1; }
            .hcfd2-week-counts { grid-template-columns: repeat(2, 1fr); }

            .hcfd2-calendar-controls button { flex: 1; }
            .hcfd2-calendar-controls label { width: 100%; }
            .hcfd2-calendar-day { min-height: 66px; padding: 5px; }
            .hcfd2-calendar-day > div { gap: 2px; margin-top: 4px; }
            .hcfd2-calendar-day small { padding: 2px 4px; font-size: 0.65rem; }
            .hcfd2-calendar-modal { padding: 10px; }
            .hcfd2-calendar-detail { width: 100%; max-height: 94vh; }
            .hcfd2-calendar-detail > header { grid-template-columns: 42px 1fr 42px; gap: 7px; padding: 54px 10px 13px; }
            .hcfd2-calendar-detail header button { width: 40px; height: 40px; }
            .hcfd2-calendar-detail-child { flex-wrap: wrap; }
            .hcfd2-calendar-popup-scope .hcfd2-calendar-scope button { padding: 5px 9px; }
            .hcfd2-report-details { grid-template-columns: 1fr; padding-left: 12px; }

            .hcfd2-time-item {
                grid-template-columns:
                    1fr;
            }

            .hcfd2-time-item > time {
                display: none;
            }

            .hcfd2-time-dot {
                display: none;
            }

            .hcfd2-time-card {
                margin-bottom: 10px;
            }

            #hcfd2-viewer {
                display: grid;
                grid-template-columns: 1fr;
                align-items: center;

                padding:
                    70px 12px 12px;
            }

            #hcfd2-viewer figure {
                grid-column: 1;
                grid-row: 1;
                max-width: 100%;
            }

            #hcfd2-viewer .prev,
            #hcfd2-viewer .next {
                position: fixed;

                top: 50%;

                z-index: 2;

                width: 44px;
                height: 64px;
            }

            #hcfd2-viewer .prev {
                left: 5px;
            }

            #hcfd2-viewer .next {
                right: 5px;
            }
        }

        /*
         * Phone app layout. Avoid desktop-style horizontal strips and make
         * every primary control reachable without sideways page scrolling.
         */
        @media (max-width: 600px) {
            .hcfd2-agenda-calendar { display: grid; gap: 12px; touch-action: pan-y; }
            .hcfd2-agenda-calendar > header { display: flex; align-items: center; justify-content: space-between; gap: 10px; }
            .hcfd2-agenda-date-picker { position: relative; display: flex; align-items: center; gap: 7px; min-height: 44px; padding: 7px 11px; overflow: hidden; border: 1px solid var(--h-border); border-radius: 12px; background: var(--h-surface-muted); cursor: pointer; }
            .hcfd2-agenda-date-picker input { position: absolute; inset: 0; width: 100%; height: 100%; opacity: 0; cursor: pointer; }
            .hcfd2-agenda-calendar > header > button { min-height: 44px; padding: 7px 13px; border: 1px solid var(--h-border); border-radius: 12px; background: var(--h-surface); color: var(--h-text); font-weight: 800; }
            .hcfd2-agenda-calendar > header > button:disabled { opacity: 0.45; }
            .hcfd2-agenda-calendar > .hcfd2-calendar-scope { margin: 0; padding: 4px 0; border: 0; justify-content: flex-start; }
            .hcfd2-agenda-week { display: grid; grid-template-columns: 38px minmax(0, 1fr) 38px; align-items: center; gap: 4px; padding: 7px 4px; border: 1px solid var(--h-border); border-radius: 14px; background: var(--h-surface-muted); }
            .hcfd2-agenda-week > button { width: 38px; height: 44px; padding: 0; border: 0; border-radius: 50%; background: var(--h-surface); color: var(--h-text); font-size: 1.7rem; }
            .hcfd2-agenda-week > button:disabled { opacity: 0.3; }
            .hcfd2-agenda-week > div { display: grid; grid-template-columns: repeat(7, 1fr); gap: 2px; }
            .hcfd2-agenda-week > div > button { display: grid; place-items: center; align-content: center; gap: 1px; min-width: 0; min-height: 58px; padding: 3px 0; border: 0; border-radius: 18px; background: transparent; color: var(--h-text); }
            .hcfd2-agenda-week > div > button.active { background: var(--h-accent); color: #2b210d; }
            .hcfd2-agenda-week > div > button:disabled { color: var(--h-muted); opacity: 0.3; }
            .hcfd2-agenda-week small { font-size: 0.6rem; font-weight: 800; }
            .hcfd2-agenda-week strong { font-size: 0.9rem; }
            .hcfd2-agenda-week span { min-height: 8px; color: var(--h-accent-strong); font-size: 0.56rem; letter-spacing: -1px; }
            .hcfd2-agenda-week button.active span { color: #2b210d; }
            .hcfd2-agenda-list { overflow: hidden; border: 1px solid var(--h-border); border-radius: 14px; background: var(--h-surface); }
            .hcfd2-agenda-list > h2 { position: sticky; top: 0; z-index: 3; margin: 0; padding: 12px 14px; border-bottom: 1px solid var(--h-border); background: color-mix(in srgb, var(--h-surface) 96%, transparent); font-size: 0.9rem; backdrop-filter: blur(8px); }
            .hcfd2-agenda-list .hcfd2-mobile-feed-item { padding-right: 10px; padding-left: 10px; }
            .hcfd2-agenda-list .hcfd2-feed-report-detail { padding-right: 10px; }

            .hcfd2-sticky-child { position: fixed; top: calc(10px + env(safe-area-inset-top)); left: 10px; z-index: 2147483641; display: flex; align-items: center; gap: 8px; max-width: calc(100vw - 84px); min-height: 44px; padding: 5px 11px 5px 6px; border: 1px solid var(--h-accent-strong); border-radius: 999px; background: color-mix(in srgb, var(--h-surface) 96%, transparent); color: var(--h-text); box-shadow: 0 5px 18px rgba(17, 24, 39, 0.18); opacity: 0; pointer-events: none; transform: translateY(-12px); transition: opacity 0.16s ease, transform 0.16s ease; backdrop-filter: blur(10px); }
            .hcfd2-sticky-child.visible { opacity: 1; pointer-events: auto; transform: translateY(0); }
            .hcfd2-sticky-child .hcfd2-avatar { width: 32px; height: 32px; font-size: 0.68rem; cursor: default; }
            .hcfd2-sticky-child .hcfd2-family-icon { min-width: 32px; min-height: 32px; }
            .hcfd2-sticky-child strong { overflow: hidden; font-size: 0.82rem; text-overflow: ellipsis; white-space: nowrap; }
            .hcfd2-sticky-child b { color: var(--h-muted); font-size: 0.72rem; }

            .hcfd2-child-picker-wrap { padding: 10px 14px; border-bottom: 1px solid var(--h-border); background: var(--h-surface); }
            .hcfd2-child-picker-button { display: grid; grid-template-columns: 44px minmax(0, 1fr) auto; align-items: center; gap: 10px; width: 100%; min-height: 58px; padding: 7px 11px; border: 1px solid var(--h-border); border-radius: 14px; background: var(--h-surface-muted); color: var(--h-text); cursor: pointer; text-align: left; }
            .hcfd2-child-picker-button > span:nth-child(2) { display: grid; gap: 1px; }
            .hcfd2-child-picker-button small { color: var(--h-muted); font-size: 0.7rem; }
            .hcfd2-child-picker-button > b { color: var(--h-muted); font-size: 1rem; }
            .hcfd2-child-picker-backdrop { position: fixed; inset: 0; z-index: 2147483644; display: grid; align-items: end; background: rgba(12, 16, 22, 0.56); }
            .hcfd2-child-picker-sheet { max-height: 78vh; overflow-y: auto; padding-bottom: calc(24px + env(safe-area-inset-bottom)); border-radius: 22px 22px 0 0; background: var(--h-surface); box-shadow: 0 -12px 36px rgba(0, 0, 0, 0.28); }
            .hcfd2-child-picker-sheet > header { position: sticky; top: 0; z-index: 2; display: flex; align-items: center; justify-content: space-between; padding: 7px 16px 11px; border-bottom: 1px solid var(--h-border); background: var(--h-surface); }
            .hcfd2-child-picker-sheet h2 { margin: 0; font-size: 1.15rem; }
            .hcfd2-child-picker-sheet header button { width: 44px; height: 44px; border: 0; border-radius: 50%; background: var(--h-surface-muted); color: var(--h-text); font-size: 1.5rem; }
            .hcfd2-child-picker-sheet > div:last-child { display: grid; gap: 7px; padding: 12px 14px; }
            .hcfd2-child-picker-sheet > div:last-child > button { display: grid; grid-template-columns: 44px minmax(0, 1fr) 24px; align-items: center; gap: 10px; min-height: 62px; padding: 8px 11px; border: 1px solid var(--h-border); border-radius: 13px; background: var(--h-surface-muted); color: var(--h-text); text-align: left; }
            .hcfd2-child-picker-sheet > div:last-child > button.active { border-color: var(--h-accent-strong); background: color-mix(in srgb, var(--h-accent) 20%, var(--h-surface)); }
            .hcfd2-child-picker-sheet > div:last-child > button > span:nth-child(2) { display: grid; gap: 1px; }
            .hcfd2-child-picker-sheet small { color: var(--h-muted); font-size: 0.68rem; }
            .hcfd2-child-picker-sheet b { color: var(--h-accent-strong); text-align: center; }

            .hcfd2-main { padding-bottom: calc(92px + env(safe-area-inset-bottom)); }
            .hcfd2-bottom-nav { position: fixed; right: 0; bottom: 0; left: 0; z-index: 2147483642; display: grid; grid-template-columns: repeat(5, 1fr); min-height: 70px; padding: 5px 4px calc(10px + env(safe-area-inset-bottom)); border-top: 1px solid var(--h-border); background: color-mix(in srgb, var(--h-surface) 97%, transparent); box-shadow: 0 -5px 18px rgba(17, 24, 39, 0.12); backdrop-filter: blur(12px); }
            .hcfd2-bottom-nav button { display: grid; place-items: center; align-content: center; gap: 2px; min-width: 0; min-height: 54px; padding: 3px; border: 0; border-radius: 16px; background: transparent; color: var(--h-muted); cursor: pointer; }
            .hcfd2-bottom-nav button > span { display: grid; place-items: center; min-width: 42px; height: 28px; padding: 0 8px; border-radius: 999px; font-size: 1.25rem; font-weight: 850; line-height: 1; }
            .hcfd2-bottom-nav button > small { font-size: 0.62rem; font-weight: 800; }
            .hcfd2-bottom-nav button.active { color: var(--h-text); }
            .hcfd2-bottom-nav button.active > span { background: var(--h-accent); color: #2b210d; }
            .hcfd2-more-backdrop { position: fixed; inset: 0; z-index: 2147483644; display: grid; align-items: end; background: rgba(12, 16, 22, 0.56); }
            .hcfd2-more-sheet { padding-bottom: calc(24px + env(safe-area-inset-bottom)); border-radius: 22px 22px 0 0; background: var(--h-surface); box-shadow: 0 -12px 36px rgba(0, 0, 0, 0.28); }
            .hcfd2-more-sheet > header { display: flex; align-items: center; justify-content: space-between; padding: 7px 16px 11px; border-bottom: 1px solid var(--h-border); }
            .hcfd2-more-sheet h2 { margin: 0; font-size: 1.15rem; }
            .hcfd2-more-sheet header button { width: 44px; height: 44px; border: 0; border-radius: 50%; background: var(--h-surface-muted); color: var(--h-text); font-size: 1.5rem; }
            .hcfd2-more-sheet > div:last-child { display: grid; grid-template-columns: repeat(2, 1fr); gap: 8px; padding: 12px 14px; }
            .hcfd2-more-sheet > div:last-child > button { display: grid; grid-template-columns: 38px minmax(0, 1fr); gap: 1px 9px; min-height: 76px; padding: 11px; border: 1px solid var(--h-border); border-radius: 13px; background: var(--h-surface-muted); color: var(--h-text); text-align: left; }
            .hcfd2-more-sheet > div:last-child > button.active { border-color: var(--h-accent-strong); background: color-mix(in srgb, var(--h-accent) 20%, var(--h-surface)); }
            .hcfd2-more-sheet > div:last-child span { grid-row: 1 / 3; align-self: center; font-size: 1.3rem; text-align: center; }
            .hcfd2-more-sheet > div:last-child strong { align-self: end; }
            .hcfd2-more-sheet > div:last-child small { color: var(--h-muted); font-size: 0.64rem; }

            .hcfd2-mobile-feed-head { display: flex; align-items: center; justify-content: space-between; gap: 12px; margin-bottom: 8px; padding: 8px 4px; }
            .hcfd2-mobile-feed-head > div { display: grid; gap: 1px; }
            .hcfd2-mobile-feed-head span { color: var(--h-muted); font-size: 0.68rem; font-weight: 800; }
            .hcfd2-mobile-feed-head strong { font-size: 1.15rem; }
            .hcfd2-mobile-feed-head > button { position: relative; width: 48px; height: 48px; border: 1px solid var(--h-border); border-radius: 50%; background: var(--h-surface-muted); color: var(--h-text); font-size: 1.45rem; }
            .hcfd2-mobile-feed-head > button small { position: absolute; top: -2px; right: -2px; display: grid; place-items: center; min-width: 19px; height: 19px; padding: 0 4px; border-radius: 999px; background: var(--h-accent); color: #2b210d; font-size: 0.62rem; font-weight: 900; }
            .hcfd2-active-filters { display: flex; flex-wrap: wrap; gap: 6px; margin: 0 0 10px; }
            .hcfd2-active-filters span { padding: 5px 9px; border-radius: 999px; background: var(--h-accent); color: #2b210d; font-size: 0.7rem; font-weight: 800; }
            .hcfd2-mobile-feed { display: grid; gap: 15px; }
            .hcfd2-mobile-feed > section > h2 { margin: 0 0 6px; color: var(--h-muted); font-size: 0.76rem; font-weight: 900; letter-spacing: 0.04em; text-transform: uppercase; }
            .hcfd2-mobile-feed-item { width: 100%; margin: 0; border: 0; border-bottom: 1px solid var(--h-border); background: var(--h-surface); color: var(--h-text); }
            button.hcfd2-mobile-feed-item,
            .hcfd2-mobile-feed-item > summary { display: grid; grid-template-columns: 48px minmax(0, 1fr) 14px; align-items: center; gap: 10px; min-height: 66px; padding: 8px 4px; cursor: pointer; text-align: left; list-style: none; }
            .hcfd2-mobile-feed-item > summary::-webkit-details-marker { display: none; }
            .hcfd2-mobile-feed-item span:nth-child(2) { display: grid; gap: 1px; }
            .hcfd2-mobile-feed-item small { color: var(--h-muted); font-size: 0.7rem; }
            .hcfd2-feed-thumb,
            .hcfd2-feed-icon { display: grid; place-items: center; width: 48px; height: 48px; overflow: hidden; border-radius: 11px; background: var(--activity-color, var(--h-surface-muted)); font-size: 1.25rem; }
            .hcfd2-feed-thumb img { width: 100%; height: 100%; object-fit: cover; }
            .hcfd2-feed-report-detail { display: grid; grid-template-columns: 1fr; gap: 6px; padding: 4px 4px 12px 62px; }
            .hcfd2-feed-report-detail > div { padding: 7px; border-radius: 8px; background: var(--h-surface-muted); }
            .hcfd2-feed-report-detail strong,
            .hcfd2-feed-report-detail span { display: block; font-size: 0.7rem; }
            .hcfd2-filter-backdrop { position: fixed; inset: 0; z-index: 2147483645; display: grid; align-items: end; background: rgba(12, 16, 22, 0.56); }
            .hcfd2-filter-sheet { max-height: 82vh; overflow-y: auto; padding-bottom: calc(20px + env(safe-area-inset-bottom)); border-radius: 22px 22px 0 0; background: var(--h-surface); box-shadow: 0 -12px 36px rgba(0, 0, 0, 0.28); }
            .hcfd2-filter-sheet > header { position: sticky; top: 0; z-index: 2; display: flex; align-items: center; justify-content: space-between; padding: 8px 14px 10px; border-bottom: 1px solid var(--h-border); background: var(--h-surface); }
            .hcfd2-filter-sheet h2 { margin: 0; font-size: 1.1rem; }
            .hcfd2-filter-sheet header button { width: 44px; height: 44px; border: 0; border-radius: 50%; background: var(--h-surface-muted); color: var(--h-text); font-size: 1.5rem; }
            .hcfd2-filter-body { display: grid; gap: 10px; padding: 12px 14px; }
            .hcfd2-filter-body h3 { margin: 5px 0 0; font-size: 0.78rem; }
            .hcfd2-filter-body .hcfd2-pills { display: grid; grid-template-columns: repeat(2, 1fr); width: 100%; overflow: visible; border: 0; gap: 6px; }
            .hcfd2-filter-body .hcfd2-pills button { min-height: 42px; border: 1px solid var(--h-border); border-radius: 9px; background: var(--h-surface-muted); color: var(--h-text); }
            .hcfd2-filter-body .hcfd2-pills button.active { background: var(--h-accent); color: #2b210d; }
            .hcfd2-filter-body .hcfd2-timeline-scope { display: block; margin: 0; padding: 0; border: 0; background: transparent; }
            .hcfd2-filter-body .hcfd2-timeline-scope > div:first-child { display: none; }
            .hcfd2-filter-body .hcfd2-timeline-scope > div:last-child { display: flex; width: 100%; }
            .hcfd2-filter-types { display: grid; grid-template-columns: repeat(2, 1fr); gap: 6px; }
            .hcfd2-filter-types button { min-height: 42px; border: 1px solid var(--h-border); border-radius: 9px; background: var(--h-surface-muted); color: var(--h-text); font-weight: 800; }
            .hcfd2-filter-types button.active { border-color: var(--h-accent-strong); background: var(--h-accent); color: #2b210d; }
            .hcfd2-filter-search { display: grid; gap: 4px; }
            .hcfd2-filter-search span { color: var(--h-muted); font-size: 0.72rem; font-weight: 800; }
            .hcfd2-filter-search input { min-height: 44px; padding: 8px 10px; border: 1px solid var(--h-border); border-radius: 9px; background: var(--h-surface); color: var(--h-text); }

            /* Dense chronological log used by the phone timeline. */
            .hcfd2-mobile-feed { gap: 0; }
            .hcfd2-mobile-feed > section { position: relative; }
            .hcfd2-mobile-feed > section > h2 { position: sticky; top: 64px; z-index: 4; margin: 0; padding: 10px 4px 7px; border-bottom: 1px solid var(--h-border); background: color-mix(in srgb, var(--h-surface) 96%, transparent); color: var(--h-text); font-size: 0.82rem; letter-spacing: 0.02em; backdrop-filter: blur(8px); }
            button.hcfd2-mobile-feed-item,
            .hcfd2-mobile-feed-item > summary { grid-template-columns: 68px 34px minmax(0, 1fr); gap: 8px; min-height: 48px; padding: 5px 4px; }
            .hcfd2-mobile-feed-item time { color: var(--h-muted); font-size: 0.72rem; font-variant-numeric: tabular-nums; text-align: right; white-space: nowrap; }
            .hcfd2-mobile-feed-item span:nth-child(3) { display: grid; gap: 0; min-width: 0; }
            .hcfd2-mobile-feed-item strong { overflow: hidden; font-size: 0.86rem; text-overflow: ellipsis; white-space: nowrap; }
            .hcfd2-mobile-feed-item .hcfd2-feed-icon { width: 32px; height: 32px; border-radius: 8px; font-size: 1rem; }
            .hcfd2-mobile-feed-item .hcfd2-feed-thumb { width: 32px; height: 32px; border-radius: 8px; }
            .hcfd2-mobile-feed-item > b,
            .hcfd2-mobile-feed-item > summary > b { display: none; }
            .hcfd2-feed-report-detail { padding: 7px 4px 12px 110px; }
            .hcfd2-feed-report-detail p { margin: 0 0 6px; color: var(--h-muted); font-size: 0.75rem; }
            .hcfd2-mobile-feed + .hcfd2-load-more,
            .hcfd2-mobile-gallery + .hcfd2-load-more { margin: 18px 0 6px; padding: 14px; border: 1px solid var(--h-border); border-radius: 13px; background: var(--h-surface-muted); }
            .hcfd2-mobile-feed + .hcfd2-load-more button,
            .hcfd2-mobile-gallery + .hcfd2-load-more button { display: block; width: 100%; min-height: 48px; background: var(--h-accent); color: #2b210d; }

            .hcfd2-mobile-gallery-head { display: flex; align-items: center; justify-content: space-between; gap: 12px; margin-bottom: 8px; padding: 8px 4px; }
            .hcfd2-mobile-gallery-head > div { display: grid; gap: 1px; }
            .hcfd2-mobile-gallery-head span { color: var(--h-muted); font-size: 0.68rem; font-weight: 800; }
            .hcfd2-mobile-gallery-head strong { font-size: 1.15rem; }
            .hcfd2-mobile-gallery-head > button { position: relative; width: 48px; height: 48px; border: 1px solid var(--h-border); border-radius: 50%; background: var(--h-surface-muted); color: var(--h-text); font-size: 1.45rem; }
            .hcfd2-mobile-gallery-head > button small { position: absolute; top: -2px; right: -2px; display: grid; place-items: center; min-width: 19px; height: 19px; padding: 0 4px; border-radius: 999px; background: var(--h-accent); color: #2b210d; font-size: 0.62rem; font-weight: 900; }
            .hcfd2-mobile-gallery { display: grid; gap: 10px; margin: 0 -12px; }
            .hcfd2-mobile-gallery > section > h2 { position: sticky; top: 0; z-index: 4; margin: 0; padding: 9px 14px 7px; border-bottom: 1px solid var(--h-border); background: color-mix(in srgb, var(--h-surface) 96%, transparent); font-size: 0.8rem; letter-spacing: 0.02em; backdrop-filter: blur(8px); }
            .hcfd2-mobile-gallery > section > div { display: grid; grid-template-columns: repeat(3, 1fr); gap: 3px; padding: 3px 0 0; }
            .hcfd2-mobile-gallery > section > div > button { position: relative; aspect-ratio: 1; min-width: 0; padding: 0; overflow: hidden; border: 0; background: var(--h-surface-muted); cursor: zoom-in; }
            .hcfd2-mobile-gallery img { display: block; width: 100%; height: 100%; object-fit: cover; }
            .hcfd2-mobile-gallery button > span { position: absolute; top: 6px; right: 6px; display: grid; place-items: center; width: 25px; height: 25px; border-radius: 50%; background: rgba(20, 24, 30, 0.68); color: #ffd166; font-size: 0.85rem; }

            .hcfd2-secondary-head { display: flex; align-items: center; justify-content: space-between; gap: 12px; margin-bottom: 8px; padding: 8px 4px; }
            .hcfd2-secondary-head > div { display: grid; gap: 1px; }
            .hcfd2-secondary-head span { color: var(--h-muted); font-size: 0.68rem; font-weight: 800; }
            .hcfd2-secondary-head strong { font-size: 1.15rem; }
            .hcfd2-secondary-head > button { position: relative; display: grid; place-items: center; width: 48px; height: 48px; border: 1px solid var(--h-border); border-radius: 50%; background: var(--h-surface-muted); color: var(--h-text); font-size: 1.35rem; }
            .hcfd2-secondary-head > button small { position: absolute; top: -2px; right: -2px; display: grid; place-items: center; min-width: 19px; height: 19px; padding: 0 4px; border-radius: 999px; background: var(--h-accent); color: #2b210d; font-size: 0.62rem; font-weight: 900; }

            .hcfd2-mobile-report-list { display: grid; gap: 0; }
            .hcfd2-mobile-report-list > section > h2 { position: sticky; top: 0; z-index: 4; margin: 0; padding: 10px 4px 7px; border-bottom: 1px solid var(--h-border); background: color-mix(in srgb, var(--h-surface) 96%, transparent); color: var(--h-text); font-size: 0.82rem; letter-spacing: 0.02em; backdrop-filter: blur(8px); }
            .hcfd2-mobile-report-list + .hcfd2-load-more { margin: 18px 0 6px; padding: 14px; border: 1px solid var(--h-border); border-radius: 13px; background: var(--h-surface-muted); }
            .hcfd2-mobile-report-list + .hcfd2-load-more button { display: block; width: 100%; min-height: 48px; background: var(--h-accent); color: #2b210d; }

            .hcfd2-mobile-stat-metrics { display: grid; grid-template-columns: repeat(2, minmax(0, 1fr)); gap: 8px; margin: 10px 0 12px; }
            .hcfd2-mobile-stat-metrics article { display: grid; gap: 2px; min-width: 0; padding: 14px; border: 1px solid var(--h-border); border-radius: 13px; background: var(--h-surface-muted); }
            .hcfd2-mobile-stat-metrics strong { font-size: 1.65rem; line-height: 1; }
            .hcfd2-mobile-stat-metrics span { color: var(--h-muted); font-size: 0.7rem; }
            .hcfd2-mobile-stat-section { margin-bottom: 8px; overflow: hidden; border: 1px solid var(--h-border); border-radius: 13px; background: var(--h-surface); }
            .hcfd2-mobile-stat-section > summary { display: grid; grid-template-columns: minmax(0, 1fr) auto; align-items: center; min-height: 52px; padding: 10px 13px; cursor: pointer; list-style: none; font-weight: 850; }
            .hcfd2-mobile-stat-section > summary::-webkit-details-marker { display: none; }
            .hcfd2-mobile-stat-section > summary b { transition: transform 0.15s ease; }
            .hcfd2-mobile-stat-section[open] > summary b { transform: rotate(180deg); }
            .hcfd2-mobile-stat-section .hcfd2-bars,
            .hcfd2-mobile-stat-section .hcfd2-heatmap { width: auto; max-width: none; margin: 0; padding: 12px; border: 0; border-top: 1px solid var(--h-border); border-radius: 0; }
            .hcfd2-mobile-stat-section .hcfd2-bars h2,
            .hcfd2-mobile-stat-section .hcfd2-heatmap > div:first-child { display: none; }
            .hcfd2-mobile-stat-section .hcfd2-bars > div { grid-template-columns: minmax(82px, 1fr) minmax(80px, 1.4fr) 28px; gap: 7px; }
            .hcfd2-mobile-stat-section .hcfd2-bars > div > span { overflow: hidden; font-size: 0.7rem; text-overflow: ellipsis; white-space: nowrap; }
            .hcfd2-mobile-stat-section .hcfd2-heatmap { overflow-x: auto; }
            .hcfd2-mobile-stat-section .hcfd2-heatmap-grid { min-width: 390px; }
            .hcfd2-mobile-stat-section + .hcfd2-note { margin: 10px 4px; }

            .hcfd2-mobile-badges { display: grid; gap: 8px; }
            .hcfd2-mobile-badges > header { display: flex; align-items: center; gap: 10px; padding: 12px; border: 1px solid var(--h-border); border-radius: 14px; background: var(--h-surface-muted); }
            .hcfd2-mobile-badges > header > div { display: grid; gap: 1px; }
            .hcfd2-mobile-badges > header span,
            .hcfd2-mobile-badges > header small { color: var(--h-muted); font-size: 0.68rem; font-weight: 800; }
            .hcfd2-mobile-badges > header h2 { margin: 0; font-size: 1.15rem; }
            .hcfd2-mobile-badges > details { overflow: hidden; border: 1px solid var(--h-border); border-radius: 13px; background: var(--h-surface); }
            .hcfd2-mobile-badges > details > summary { display: grid; grid-template-columns: minmax(0, 1fr) auto auto; align-items: center; gap: 8px; min-height: 52px; padding: 10px 13px; cursor: pointer; list-style: none; }
            .hcfd2-mobile-badges > details > summary::-webkit-details-marker { display: none; }
            .hcfd2-mobile-badges > details > summary span { font-weight: 850; }
            .hcfd2-mobile-badges > details > summary small { display: grid; place-items: center; min-width: 26px; height: 26px; border-radius: 999px; background: var(--h-surface-muted); color: var(--h-muted); font-size: 0.68rem; }
            .hcfd2-mobile-badges > details > summary b { transition: transform 0.15s ease; }
            .hcfd2-mobile-badges > details[open] > summary b { transform: rotate(180deg); }
            .hcfd2-mobile-badges > details > div { display: grid; grid-template-columns: repeat(2, minmax(0, 1fr)); gap: 7px; padding: 0 9px 9px; }
            .hcfd2-mobile-badges article { display: grid; justify-items: center; align-content: center; gap: 5px; min-height: 108px; padding: 10px 7px; border-radius: 11px; background: var(--h-surface-muted); text-align: center; }
            .hcfd2-mobile-badges article > span { display: grid; place-items: center; width: 38px; height: 38px; border-radius: 50%; background: var(--h-accent); color: #2b210d; font-size: 1.05rem; }
            .hcfd2-mobile-badges article strong { max-width: 100%; font-size: 0.74rem; overflow-wrap: anywhere; }

            .hcfd2-home-view-bar { display: block; margin-bottom: 12px; padding: 6px; }
            .hcfd2-home-view-bar > div:first-child { display: none; }
            .hcfd2-home-view-bar .hcfd2-view-switch { display: flex; width: 100%; }
            .hcfd2-home-view-bar .hcfd2-view-switch button { flex: 1; min-height: 44px; }
            .hcfd2-week-nav-mobile { position: sticky; top: 0; z-index: 7; display: grid; grid-template-columns: 48px minmax(0, 1fr) 48px; align-items: center; gap: 8px; margin: 0 0 12px; padding: 7px; border: 1px solid var(--h-border); border-radius: 14px; background: color-mix(in srgb, var(--h-surface) 95%, transparent); box-shadow: 0 4px 14px rgba(17, 24, 39, 0.1); backdrop-filter: blur(8px); }
            .hcfd2-week-nav-mobile > button { width: 48px; height: 48px; padding: 0; border: 0; border-radius: 50%; background: var(--h-surface-muted); color: var(--h-text); font-size: 2rem; cursor: pointer; }
            .hcfd2-week-date-button { position: relative; display: grid; place-items: center; gap: 1px; min-height: 48px; overflow: hidden; cursor: pointer; text-align: center; }
            .hcfd2-week-date-button strong { font-size: 0.95rem; }
            .hcfd2-week-date-button small { color: var(--h-muted); font-size: 0.7rem; }
            .hcfd2-week-date-button input { position: absolute; inset: 0; width: 100%; height: 100%; opacity: 0; cursor: pointer; }
            .hcfd2-week-summary-mobile { margin-bottom: 12px; padding: 0; overflow: hidden; }
            .hcfd2-mobile-week-title { display: flex; align-items: center; gap: 10px; padding: 14px; border-bottom: 1px solid var(--h-border); background: var(--h-surface-muted); }
            .hcfd2-mobile-week-title > div { display: grid; gap: 1px; }
            .hcfd2-mobile-week-title span { color: var(--h-muted); font-size: 0.7rem; font-weight: 800; }
            .hcfd2-mobile-week-title h2 { margin: 0; font-size: 1.1rem; }
            .hcfd2-mobile-week-title > small { margin-left: auto; color: var(--h-muted); font-size: 1rem; }
            .hcfd2-mobile-week-metrics { display: grid; grid-template-columns: repeat(5, 1fr); border-bottom: 1px solid var(--h-border); }
            .hcfd2-mobile-week-metrics > div { display: grid; justify-items: center; gap: 1px; padding: 11px 3px; border-right: 1px solid var(--h-border); }
            .hcfd2-mobile-week-metrics > div:last-child { border-right: 0; }
            .hcfd2-mobile-week-metrics strong { font-size: 1.15rem; }
            .hcfd2-mobile-week-metrics small { color: var(--h-muted); font-size: 0.62rem; }
            .hcfd2-mobile-week-days { padding: 14px; }
            .hcfd2-mobile-week-days h3 { margin: 0 0 7px; font-size: 0.95rem; }
            .hcfd2-mobile-week-days > button { display: grid; grid-template-columns: minmax(0, 1fr) auto 14px; align-items: center; gap: 8px; width: 100%; min-height: 52px; padding: 7px 4px; border: 0; border-bottom: 1px solid var(--h-border); background: transparent; color: var(--h-text); cursor: pointer; text-align: left; }
            .hcfd2-mobile-week-days > button:last-child { border-bottom: 0; }
            .hcfd2-mobile-week-days > button > span:first-child { display: grid; gap: 1px; }
            .hcfd2-mobile-week-days small { color: var(--h-muted); font-size: 0.68rem; }
            .hcfd2-mobile-week-days > button > span:nth-child(2) { color: var(--h-muted); font-size: 0.78rem; white-space: nowrap; }
            .hcfd2-mobile-week-section { border-top: 1px solid var(--h-border); }
            .hcfd2-mobile-week-section > summary { display: grid; grid-template-columns: minmax(0, 1fr) auto; gap: 1px 8px; padding: 14px; cursor: pointer; list-style: none; }
            .hcfd2-mobile-week-section > summary::-webkit-details-marker { display: none; }
            .hcfd2-mobile-week-section > summary > span { font-weight: 850; }
            .hcfd2-mobile-week-section > summary > small { grid-column: 1; color: var(--h-muted); font-size: 0.68rem; }
            .hcfd2-mobile-week-section > summary > b { grid-column: 2; grid-row: 1 / 3; align-self: center; transition: transform 0.15s ease; }
            .hcfd2-mobile-week-section[open] > summary > b { transform: rotate(180deg); }
            .hcfd2-mobile-week-section .hcfd2-week-comparison { margin: 0 12px 14px; }
            .hcfd2-mobile-week-photos { display: grid; grid-template-columns: repeat(3, 1fr); gap: 7px; padding: 0 14px 14px; }
            .hcfd2-mobile-week-photos button { aspect-ratio: 1; padding: 0; overflow: hidden; border: 0; border-radius: 10px; background: var(--h-surface-muted); }
            .hcfd2-mobile-week-photos img { display: block; width: 100%; height: 100%; object-fit: cover; }

            html,
            body.hcfd2-no-scroll,
            #hcfd2-overlay,
            #hcfd2-app,
            .hcfd2-shell {
                width: 100%;
                max-width: 100%;
                overflow-x: hidden !important;
            }

            #hcfd2-overlay {
                overscroll-behavior-x: none;
            }

            .hcfd2-header {
                position: relative;
                z-index: 20;
                gap: 8px;
                min-height: 108px;
                padding: calc(28px + env(safe-area-inset-top)) 76px 12px 16px;
            }

            .hcfd2-header h1 {
                margin: 2px 0;
                font-size: 1.42rem;
                line-height: 1.1;
            }

            .hcfd2-header p {
                overflow: hidden;
                font-size: 0.78rem;
                text-overflow: ellipsis;
                white-space: nowrap;
            }

            .hcfd2-kicker {
                font-size: 0.65rem;
                letter-spacing: 0.07em;
            }

            .hcfd2-mobile-menu-wrap {
                position: absolute;
                top: calc(28px + env(safe-area-inset-top));
                right: 14px;
                width: auto;
                z-index: 30;
            }

            .hcfd2-mobile-menu-toggle {
                display: grid;
                place-items: center;
                width: 48px;
                min-width: 48px;
                height: 48px;
                min-height: 48px;
                padding: 0;
                border-radius: 50%;
                font-size: 1.55rem;
                line-height: 1;
                box-shadow: 0 4px 12px rgba(17, 24, 39, 0.12);
            }

            .hcfd2-mobile-menu {
                position: absolute;
                top: calc(100% + 2px);
                right: 0;
                width: min(340px, calc(100vw - 28px));
                max-height: calc(100vh - 90px);
                overflow-y: auto;
                box-shadow: 0 12px 30px rgba(17, 24, 39, 0.25);
            }

            .hcfd2-actions {
                display: grid;
                grid-template-columns: repeat(3, minmax(0, 1fr));
                width: 100%;
            }

            .hcfd2-actions > button,
            .hcfd2-actions > select {
                width: 100%;
                min-width: 0;
                padding-right: 5px;
                padding-left: 5px;
                font-size: 0.78rem;
            }

            .hcfd2-actions .hcfd2-close {
                grid-column: 1 / -1;
                justify-self: end;
                width: 42px;
            }

            .hcfd2-children {
                display: grid;
                grid-template-columns: repeat(2, minmax(0, 1fr));
                gap: 8px;
                padding: 10px;
                overflow: visible;
            }

            .hcfd2-children button {
                min-width: 0;
                padding: 8px;
            }

            .hcfd2-children button > span:last-child {
                min-width: 0;
            }

            .hcfd2-children strong,
            .hcfd2-children small {
                overflow: hidden;
                text-overflow: ellipsis;
                white-space: nowrap;
            }

            .hcfd2-tabs {
                display: grid;
                grid-template-columns: repeat(4, minmax(0, 1fr));
                gap: 4px;
                padding: 8px 8px 0;
                overflow: visible;
            }

            .hcfd2-tabs button {
                min-width: 0;
                padding: 9px 3px;
                border-radius: 9px;
                font-size: 0.72rem;
                line-height: 1.1;
            }

            .hcfd2-tabs button.active {
                border-bottom-color: var(--h-border);
            }

            .hcfd2-main {
                width: 100%;
                padding: 10px 10px calc(108px + env(safe-area-inset-bottom));
                overflow: hidden;
            }

            .hcfd2-main.hcfd2-calendar-main {
                min-height: calc(100dvh - 58px);
                touch-action: pan-y;
            }

            .hcfd2-view-context {
                width: 100%;
                margin-bottom: 10px;
                border-radius: 13px;
            }

            .hcfd2-home-card,
            .hcfd2-home-view-bar,
            .hcfd2-supply-alerts,
            .hcfd2-week-nav,
            .hcfd2-week-summary,
            .hcfd2-calendar,
            .hcfd2-toolbar,
            .hcfd2-timeline-scope,
            .hcfd2-heatmap {
                width: 100%;
                max-width: 100%;
            }

            .hcfd2-card-head {
                align-items: flex-start;
                padding: 12px;
            }

            .hcfd2-card-head > div {
                min-width: 0;
            }

            .hcfd2-card-head h2 {
                font-size: 1.05rem;
            }

            .hcfd2-metrics.four {
                grid-template-columns: repeat(2, minmax(0, 1fr));
            }

            .hcfd2-metrics.four button:nth-child(2) {
                border-right: 0;
            }

            .hcfd2-metrics.four button:nth-child(-n + 2) {
                border-bottom: 1px solid var(--h-border);
            }

            .hcfd2-toolbar {
                display: grid;
                align-items: stretch;
                gap: 9px;
                padding: 9px;
            }

            .hcfd2-toolbar label {
                width: 100%;
                min-width: 0;
            }

            .hcfd2-pills {
                display: grid;
                grid-template-columns: repeat(2, minmax(0, 1fr));
                width: 100%;
                overflow: visible;
                border: 0;
                gap: 5px;
            }

            .hcfd2-pills button,
            .hcfd2-pills button:last-child {
                min-width: 0;
                border: 1px solid var(--h-border);
                border-radius: 8px;
                padding: 9px 4px;
                font-size: 0.72rem;
            }

            .hcfd2-gallery {
                display: grid;
                grid-template-columns: repeat(2, minmax(0, 1fr));
                gap: 9px;
                columns: unset;
            }

            .hcfd2-photo-card {
                display: block;
                min-width: 0;
                margin: 0;
            }

            .hcfd2-photo-main img {
                min-height: 120px;
            }

            .hcfd2-photo-copy {
                overflow-wrap: anywhere;
            }

            .hcfd2-timeline-scope > div:last-child {
                display: grid;
                grid-template-columns: repeat(3, minmax(0, 1fr));
                overflow: visible;
            }

            .hcfd2-timeline-scope button {
                min-width: 0;
                padding: 9px 4px;
            }

            .hcfd2-calendar-controls {
                display: grid;
                grid-template-columns: repeat(3, minmax(0, 1fr));
            }

            .hcfd2-calendar-controls label {
                grid-column: 1 / -1;
            }

            .hcfd2-calendar-controls input {
                width: 100%;
            }

            .hcfd2-calendar-scope {
                display: grid;
                grid-template-columns: repeat(3, minmax(0, 1fr));
                overflow: visible;
            }

            .hcfd2-calendar-scope button {
                min-width: 0;
                justify-content: center;
                padding: 5px;
            }

            .hcfd2-calendar-weekdays span {
                padding: 7px 1px;
                font-size: 0.6rem;
            }

            .hcfd2-calendar-day {
                min-width: 0;
            }

            .hcfd2-week-summary {
                padding: 12px;
            }

            .hcfd2-week-summary-grid,
            .hcfd2-week-favorites {
                grid-template-columns: 1fr;
            }

            .hcfd2-week-summary-grid > article {
                min-width: 0;
            }

            .hcfd2-week-comparison-scroll {
                width: 100%;
                max-width: 100%;
                overscroll-behavior-x: contain;
            }

            .hcfd2-heatmap {
                overflow: hidden;
            }

            .hcfd2-heatmap-grid {
                min-width: 0;
                grid-auto-columns: minmax(3px, 1fr);
                gap: 2px;
            }

            .hcfd2-bars > div {
                grid-template-columns: minmax(72px, 1fr) 1.5fr 28px;
                gap: 6px;
            }

            .hcfd2-report-card summary {
                gap: 8px;
                padding: 10px;
            }

            .hcfd2-report-expand {
                font-size: 0.65rem !important;
            }

            .hcfd2-avatar-editor {
                width: 100%;
                max-height: calc(100vh - 24px);
                overflow-y: auto;
            }

            .hcfd2-avatar-crop {
                width: min(240px, 72vw);
                height: min(240px, 72vw);
            }
        }
    `;

    document.head.appendChild(style);
}
})();
