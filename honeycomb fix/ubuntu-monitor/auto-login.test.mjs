import test from 'node:test';
import assert from 'node:assert/strict';
import { signIn, isAuthenticationError } from './auto-login.mjs';

function fakePage(url = 'https://honeycomb.o2bkids.com', destination = url) {
  const fills = [];
  return {
    fills,
    goto: async () => {}, url: () => url,
    locator: selector => ({ waitFor: async () => {}, evaluate: async () => destination,
      fill: async value => { fills.push([selector, value]); } }),
    getByRole: () => ({ click: async () => {} }), waitForTimeout: async () => {},
  };
}
test('only unauthorized responses trigger re-login', () => {
  assert.equal(isAuthenticationError({ status: 401 }), true);
  for (const status of [403, 429, 500, 503, undefined]) assert.equal(isAuthenticationError({ status }), false);
});
test('never enter credentials on a redirected origin or third-party form', async () => {
  for (const page of [fakePage('https://example.com'), fakePage(undefined, 'https://example.com/login')]) {
    await assert.rejects(signIn(page, { email: 'a', password: 'b' }, async () => ({})), /unexpected/);
    assert.deepEqual(page.fills, []);
  }
});
test('requires authenticated children after submitting credentials', async () => {
  const page = fakePage(); let checks = 0;
  const result = await signIn(page, { email: 'a', password: 'b' }, async () => {
    checks++;
    if (checks === 1) throw Object.assign(new Error(), { status: 401 });
    return { Data: [{ ChildID: 1 }] };
  });
  assert.equal(checks, 2);
  assert.equal(result.Data.length, 1);
  assert.equal(page.fills.length, 2);
});
test('rejects a login that never authenticates', async () => {
  let checks = 0;
  await assert.rejects(signIn(fakePage(), { email: 'a', password: 'b' }, async () => {
    checks++; throw Object.assign(new Error(), { status: 401 });
  }), /did not complete/);
  assert.equal(checks, 20);
});
test('does not hide network/server errors during authentication', async () => {
  const error = Object.assign(new Error('server unavailable'), { status: 503 });
  await assert.rejects(signIn(fakePage(), { email: 'a', password: 'b' }, async () => { throw error; }), error);
});
