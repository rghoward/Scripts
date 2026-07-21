(() => {
  'use strict';

  globalThis.createHoneycombPhotoCache = ({ cacheName, indexKey, maxBytes }) => {
    let mutation = Promise.resolve();

    const readIndex = () => {
      try {
        const parsed = JSON.parse(localStorage.getItem(indexKey) || '{}');
        return parsed && typeof parsed === 'object' && !Array.isArray(parsed) ? parsed : {};
      } catch {
        return {};
      }
    };

    const saveIndex = index => localStorage.setItem(indexKey, JSON.stringify(index));

    const enforceBudget = async (cache, index = readIndex()) => {
      const storedUrls = new Set((await cache.keys()).map(request => request.url));
      Object.keys(index).forEach(url => { if (!storedUrls.has(url)) delete index[url]; });
      for (const url of storedUrls) {
        if (index[url]) continue;
        const response = await cache.match(url);
        index[url] = { size: response ? (await response.blob()).size : 0, accessedAt: 0 };
      }
      let total = Object.values(index).reduce((sum, entry) => sum + (Number(entry.size) || 0), 0);
      const oldest = Object.entries(index).sort((a, b) => (a[1].accessedAt || 0) - (b[1].accessedAt || 0));
      for (const [url, entry] of oldest) {
        if (total <= maxBytes) break;
        await cache.delete(url);
        total -= Number(entry.size) || 0;
        delete index[url];
      }
      saveIndex(index);
    };

    const store = async (cache, url, response) => {
      if (!response.ok) return;
      const sizedResponse = response.clone();
      const size = Number(sizedResponse.headers.get('content-length')) || (await sizedResponse.blob()).size;
      if (!Number.isFinite(size) || size <= 0 || size > maxBytes) return;
      mutation = mutation.catch(() => {}).then(async () => {
        await cache.put(url, response.clone());
        const index = readIndex();
        index[url] = { size, accessedAt: Date.now() };
        await enforceBudget(cache, index);
      });
      return mutation;
    };

    const touch = url => {
      mutation = mutation.catch(() => {}).then(() => {
        const index = readIndex();
        if (!index[url]) return;
        index[url].accessedAt = Date.now();
        saveIndex(index);
      });
      return mutation;
    };

    return {
      open: () => caches.open(cacheName),
      store,
      touch,
      enforceBudget,
    };
  };
})();
