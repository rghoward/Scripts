import fs from 'node:fs/promises';
import os from 'node:os';
import path from 'node:path';
import process from 'node:process';
import { fileURLToPath } from 'node:url';
import { createInterface } from 'node:readline/promises';
import { stdin, stdout } from 'node:process';
import { cert, getApps, initializeApp } from 'firebase-admin/app';
import { getMessaging } from 'firebase-admin/messaging';
import { chromium } from 'playwright';

const directory = path.dirname(fileURLToPath(import.meta.url));
const dataDirectory = path.join(directory, 'data');
const profileDirectory = process.env.HONEYCOMB_MONITOR_PROFILE_DIR
  || path.join(dataDirectory, 'browser-profile');
const stateFile = path.join(dataDirectory, 'state.json');
const origin = 'https://honeycomb.o2bkids.com';
const pageSize = 10;
const isLogin = process.argv.includes('--login');
const isTestNotification = process.argv.includes('--test-notification');

function log(message) {
  console.log(`[honeycomb-monitor] ${message}`);
}

function expandHomeDirectory(value) {
  if (value === '~') return os.homedir();
  return value.startsWith('~/') ? path.join(os.homedir(), value.slice(2)) : value;
}

async function readState() {
  try {
    const parsed = JSON.parse(await fs.readFile(stateFile, 'utf8'));
    return parsed && typeof parsed === 'object' ? parsed : { version: 1, children: {} };
  } catch (error) {
    if (error.code === 'ENOENT') return { version: 1, children: {} };
    throw new Error(`Could not read monitor state: ${error.message}`);
  }
}

async function saveState(state) {
  await fs.mkdir(dataDirectory, { recursive: true, mode: 0o700 });
  const temporaryFile = `${stateFile}.tmp`;
  await fs.writeFile(temporaryFile, `${JSON.stringify(state, null, 2)}\n`, { mode: 0o600 });
  await fs.rename(temporaryFile, stateFile);
}

async function createContext(headless) {
  await fs.mkdir(profileDirectory, { recursive: true, mode: 0o700 });
  return chromium.launchPersistentContext(profileDirectory, {
    headless,
    viewport: { width: 1280, height: 900 },
  });
}

async function api(page, url, method = 'GET', body) {
  const result = await page.evaluate(async ({ url, method, body }) => {
    const response = await fetch(url, {
      method,
      credentials: 'same-origin',
      headers: method === 'POST'
        ? { Accept: 'application/json', 'Content-Type': 'application/json' }
        : { Accept: 'application/json' },
      body: body ? JSON.stringify(body) : undefined,
    });
    const text = await response.text();
    let json = null;
    try { json = JSON.parse(text); } catch { /* The login page is not JSON. */ }
    return { ok: response.ok, status: response.status, json };
  }, { url, method, body });
  if (!result.ok || !result.json) throw new Error(`Honeycomb request failed (${result.status}). Sign in again with npm run login.`);
  if (result.json.Success === false) throw new Error(result.json.Message || 'Honeycomb declined the request. Sign in again with npm run login.');
  return result.json;
}

function groupedItems(payload) {
  return (Array.isArray(payload?.Data) ? payload.Data : []).flatMap(item =>
    Array.isArray(item?.Data) ? item.Data : item);
}

function childName(child) {
  return [child?.FirstName, child?.LastName].filter(Boolean).join(' ') || 'A child';
}

function snapshotIds(items, key) {
  return items.map(item => String(item?.[key] || '')).filter(Boolean).slice(0, 100);
}

function updatedSnapshot(previous, reports, moments, badges) {
  const merge = (current, old) => [...new Set([...current, ...(old || [])])].slice(0, 100);
  return {
    reportIds: merge(snapshotIds(reports, 'DailyReportId'), previous?.reportIds),
    momentIds: merge(snapshotIds(moments, 'DailyMomentId'), previous?.momentIds),
    badgeIds: merge(snapshotIds(badges, 'BadgeID'), previous?.badgeIds),
  };
}

function newlySeen(items, key, previousIds) {
  const known = new Set(previousIds || []);
  return items.filter(item => item?.[key] != null && !known.has(String(item[key])));
}

function reportIsSupplyRequest(report) {
  const text = `${report?.GenericReportInfo || ''} ${report?.ChildCondition || ''}`.toLowerCase();
  return Number(report?.DailyReportTypeID) === 6 || /suppl|wipes|clothes|diaper/.test(text);
}

const notificationTypes = {
  supply: { title: 'Supply request', tab: 'home' },
  report: { title: 'New daily report', tab: 'home' },
  photo: { title: 'New Honeycomb photo', tab: 'home' },
  badge: { title: 'Badge earned', tab: 'home' },
  test: { title: 'Honeycomb test', tab: 'home' },
};

function notification(type, body, childId = '', photoId = '', photoFilename = '') {
  const details = notificationTypes[type] || { title: 'Honeycomb update', tab: 'home' };
  return {
    type,
    title: details.title,
    body,
    childId: String(childId),
    tab: details.tab,
    photoId: String(photoId),
    photoFilename: String(photoFilename),
  };
}

async function sendTelegram(alert) {
  const token = process.env.TELEGRAM_BOT_TOKEN;
  const chatId = process.env.TELEGRAM_CHAT_ID;
  if (!token || !chatId) throw new Error('Set TELEGRAM_BOT_TOKEN and TELEGRAM_CHAT_ID in ~/.config/honeycomb-monitor/env.');
  const response = await fetch(`https://api.telegram.org/bot${token}/sendMessage`, {
    method: 'POST',
    headers: { 'content-type': 'application/json' },
    body: JSON.stringify({
      chat_id: chatId,
      text: `${alert.title}\n${alert.body}`.slice(0, 4000),
      disable_web_page_preview: true,
    }),
  });
  if (!response.ok) throw new Error(`Telegram request failed (${response.status}).`);
}

async function sendFirebase(alert) {
  const configuredServiceAccountFile = process.env.FCM_SERVICE_ACCOUNT_FILE;
  if (!configuredServiceAccountFile) return false;
  const serviceAccountFile = expandHomeDirectory(configuredServiceAccountFile);

  let credentials;
  try {
    credentials = JSON.parse(await fs.readFile(serviceAccountFile, 'utf8'));
  } catch (error) {
    throw new Error(`Could not read FCM_SERVICE_ACCOUNT_FILE: ${error.message}`);
  }
  const projectId = process.env.FCM_PROJECT_ID || credentials.project_id;
  const topic = process.env.FCM_TOPIC || 'honeycomb-family-alerts-v1';
  if (!projectId) throw new Error('The Firebase service-account file does not include a project ID. Set FCM_PROJECT_ID.');
  if (!/^[a-zA-Z0-9-_.~%]+$/.test(topic)) throw new Error('FCM_TOPIC contains unsupported characters.');

  const appName = 'honeycomb-ubuntu-monitor';
  const app = getApps().find(candidate => candidate.name === appName)
    || initializeApp({ credential: cert(credentials), projectId }, appName);
  await getMessaging(app).send({
    topic,
    data: {
      title: alert.title,
      body: alert.body.slice(0, 3500),
      type: alert.type,
      childId: alert.childId,
      tab: alert.tab,
      photoId: alert.photoId,
      photoFilename: alert.photoFilename,
    },
    android: { priority: 'high' },
  });
  return true;
}

async function sendAlert(alert) {
  const destinations = [];
  if (process.env.FCM_SERVICE_ACCOUNT_FILE) destinations.push(sendFirebase(alert));
  if (process.env.TELEGRAM_BOT_TOKEN || process.env.TELEGRAM_CHAT_ID) {
    if (!process.env.TELEGRAM_BOT_TOKEN || !process.env.TELEGRAM_CHAT_ID) {
      throw new Error('Set both TELEGRAM_BOT_TOKEN and TELEGRAM_CHAT_ID, or remove both.');
    }
    destinations.push(sendTelegram(alert));
  }
  if (!destinations.length) {
    throw new Error('Configure FCM_SERVICE_ACCOUNT_FILE for Android alerts, or Telegram credentials for Telegram alerts.');
  }
  await Promise.all(destinations);
}

async function login() {
  const context = await createContext(false);
  const page = context.pages()[0] || await context.newPage();
  try {
    await page.goto(origin, { waitUntil: 'domcontentloaded' });
    log('A browser window is open. Sign in to Honeycomb there, then return here.');
    const prompt = createInterface({ input: stdin, output: stdout });
    await prompt.question('Press Enter after you can see your Honeycomb account... ');
    prompt.close();
    const children = await api(page, '/api/membership/children');
    const count = Array.isArray(children.Data) ? children.Data.length : 0;
    if (!count) throw new Error('No children were returned. Complete the normal Honeycomb sign-in, then retry.');
    log(`Sign-in saved for ${count} child${count === 1 ? '' : 'ren'}. You can close the browser.`);
  } finally {
    await context.close();
  }
}

async function monitor() {
  if (isTestNotification) {
    await sendAlert(notification('test', 'Notification delivery is working.'));
    log('Test notification sent.');
    return;
  }

  const context = await createContext(true);
  try {
    const page = context.pages()[0] || await context.newPage();
    await page.goto(origin, { waitUntil: 'domcontentloaded' });
    const childrenPayload = await api(page, '/api/membership/children');
    const children = Array.isArray(childrenPayload.Data) ? childrenPayload.Data : [];
    if (!children.length) throw new Error('No children were returned. Sign in again with npm run login.');

    const readings = await Promise.all(children.map(async child => {
      const childId = String(child.ChildID);
      const [reports, moments, badges] = await Promise.all([
        api(page, '/api/daily-report', 'POST', { ChildID: childId, PageNumber: 1, PageSize: pageSize }),
        api(page, '/api/daily-moment', 'POST', { ChildID: childId, PageNumber: 1, PageSize: pageSize }),
        api(page, '/api/badges-child', 'POST', { ChildID: childId, PageNumber: 1, PageSize: pageSize, ShowUnearned: false }),
      ]);
      return {
        child,
        childId,
        reports: groupedItems(reports),
        moments: groupedItems(moments),
        badges: groupedItems(badges),
      };
    }));

    const state = await readState();
    state.children ||= {};
    const isFirstRun = !state.initializedAt;
    const alerts = [];
    for (const reading of readings) {
      const previous = state.children[reading.childId];
      if (!isFirstRun && previous) {
        const newReports = newlySeen(reading.reports, 'DailyReportId', previous.reportIds);
        const newMoments = newlySeen(reading.moments, 'DailyMomentId', previous.momentIds);
        // Existing state files predate badge tracking. Establish their badge
        // baseline silently instead of alerting for every previously earned badge.
        const newBadges = Array.isArray(previous.badgeIds)
          ? newlySeen(reading.badges, 'BadgeID', previous.badgeIds)
          : [];
        const supplies = newReports.filter(reportIsSupplyRequest).length;
        if (supplies) alerts.push(notification(
          'supply',
          `${childName(reading.child)}: ${supplies} new supply request${supplies === 1 ? '' : 's'}`,
          reading.childId,
        ));
        if (newMoments.length) alerts.push(notification(
          'photo',
          `${childName(reading.child)}: ${newMoments.length} new photo${newMoments.length === 1 ? '' : 's'}`,
          reading.childId,
          newMoments[0].DailyMomentId,
          newMoments[0].Filename,
        ));
        const otherReports = newReports.length - supplies;
        if (otherReports) alerts.push(notification(
          'report',
          `${childName(reading.child)}: ${otherReports} new report${otherReports === 1 ? '' : 's'}`,
          reading.childId,
        ));
        if (newBadges.length) alerts.push(notification(
          'badge',
          `${childName(reading.child)}: ${newBadges.length} new badge${newBadges.length === 1 ? '' : 's'}`,
          reading.childId,
        ));
      }
      state.children[reading.childId] = updatedSnapshot(
        previous,
        reading.reports,
        reading.moments,
        reading.badges,
      );
    }
    state.initializedAt ||= new Date().toISOString();
    state.lastCheckedAt = new Date().toISOString();

    if (isFirstRun) {
      await saveState(state);
      log('Baseline saved. Existing Honeycomb items were not sent as alerts.');
      return;
    }
    if (alerts.length) await Promise.all(alerts.map(sendAlert));
    await saveState(state);
    log(alerts.length ? `Sent ${alerts.length} alert summary line${alerts.length === 1 ? '' : 's'}.` : 'No new items.');
  } finally {
    await context.close();
  }
}

try {
  if (isLogin) await login();
  else await monitor();
} catch (error) {
  console.error(`[honeycomb-monitor] ${error.message}`);
  process.exitCode = 1;
}
