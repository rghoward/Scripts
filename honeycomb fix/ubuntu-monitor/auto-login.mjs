import fs from 'node:fs/promises';
import path from 'node:path';
import os from 'node:os';
import { fileURLToPath } from 'node:url';
import { execFile, spawn } from 'node:child_process';
import { promisify } from 'node:util';

const execute = promisify(execFile);
const origin = 'https://honeycomb.o2bkids.com';
const configDirectory = path.join(os.homedir(), '.config', 'honeycomb-monitor');
const keyringHelper = fileURLToPath(new URL('./keyring.py', import.meta.url));

function keyring(operation, credentials) {
  return new Promise((resolve, reject) => {
    const child = spawn('/usr/bin/python3', [keyringHelper, operation], { stdio: ['pipe', 'pipe', 'pipe'] });
    let output = '';
    child.stdout.on('data', chunk => { output += chunk; });
    child.stderr.resume();
    child.on('error', () => reject(new Error('Could not access the Ubuntu login keyring.')));
    child.on('close', code => {
      if (code === 0) resolve(output);
      else if (code === 3) reject(new Error('No saved Honeycomb credentials. Run npm run setup-auto-login.'));
      else reject(new Error('Ubuntu login keyring is locked or unavailable. Unlock it in Passwords and Keys, then retry.'));
    });
    child.stdin.on('error', () => {});
    child.stdin.end(credentials ? JSON.stringify(credentials) : '');
  });
}
const failureFile = path.join(configDirectory, 'login-failure.json');

export function isAuthenticationError(error) {
  return error?.status === 401;
}

async function privateWrite(file, value) {
  await fs.mkdir(configDirectory, { recursive: true, mode: 0o700 });
  const temporary = `${file}.${process.pid}.tmp`;
  await fs.writeFile(temporary, JSON.stringify(value), { mode: 0o600, flag: 'wx' });
  await fs.rename(temporary, file);
}

export async function signIn(page, credentials, readChildren) {
  await page.goto(origin, { waitUntil: 'domcontentloaded' });
  if (new URL(page.url()).origin !== origin) {
    throw new Error('Automatic sign-in stopped: unexpected login origin.');
  }
  const email = page.locator('input[name="email"]');
  const password = page.locator('input[name="password"]');
  await email.waitFor({ state: 'visible', timeout: 15000 });
  // Verify both the page and form destination before entering any credentials.
  const destination = await password.evaluate(element => element.form?.action || location.href);
  if (new URL(destination, page.url()).origin !== origin || new URL(page.url()).origin !== origin) {
    throw new Error('Automatic sign-in stopped: unexpected form destination.');
  }
  await email.fill(credentials.email);
  await password.fill(credentials.password);
  await page.getByRole('button', { name: 'Log In', exact: true }).click();
  for (let attempt = 0; attempt < 20; attempt++) {
    await page.waitForTimeout(1000);
    try {
      const payload = await readChildren();
      if (Array.isArray(payload.Data) && payload.Data.length) return payload;
    } catch (error) {
      if (!isAuthenticationError(error)) throw error;
    }
  }
  throw new Error('Automatic sign-in did not complete. Check credentials or run npm run login for MFA/CAPTCHA.');
}

export async function restoreSignIn(page, readChildren) {
  const credentials = JSON.parse(await keyring('lookup'));
  if (!credentials.email || !credentials.password) throw new Error('Run npm run setup-auto-login to save Honeycomb credentials.');
  try {
    const failure = JSON.parse(await fs.readFile(failureFile, 'utf8'));
    if (Date.now() < failure.retryAfter) throw new Error('Automatic sign-in paused for 15 minutes after a failed attempt. Run npm run setup-auto-login to retry now.');
  } catch (error) {
    if (error.code !== 'ENOENT') throw error;
  }
  try {
    const result = await signIn(page, credentials, readChildren);
    await fs.rm(failureFile, { force: true });
    return result;
  } catch {
    await privateWrite(failureFile, { retryAfter: Date.now() + 15 * 60 * 1000 });
    throw new Error('Automatic sign-in failed; retries paused for 15 minutes. Run npm run setup-auto-login or npm run login.');
  }
}

export async function setupAutoLogin(page, readChildren) {
  let email, password;
  try {
    email = (await execute('zenity', ['--entry', '--title=Honeycomb automatic login', '--text=Enter your Honeycomb email address. It will be saved in your Ubuntu login keyring.'])).stdout.trim();
    password = (await execute('zenity', ['--password', '--title=Honeycomb password (saved in Ubuntu login keyring)'])).stdout.replace(/\r?\n$/, '');
  } catch {
    throw new Error('Credential setup canceled. Existing credentials were left unchanged.');
  }
  if (!email || !password) throw new Error('Email and password are required. Existing credentials were left unchanged.');
  await signIn(page, { email, password }, readChildren);
  await keyring('store', { email, password });
  await fs.rm(failureFile, { force: true });
}
