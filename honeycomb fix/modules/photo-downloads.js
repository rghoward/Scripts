(() => {
  'use strict';

  function safeFilename(value) {
    const cleaned = String(value || 'Honeycomb photo')
      .replace(/[^a-z0-9._ -]+/gi, '_')
      .trim()
      .slice(0, 116);
    return `${cleaned || 'Honeycomb photo'}.jpg`.replace(/\.jpg\.jpg$/i, '.jpg');
  }

  function browserDownload(blob, filename) {
    const objectUrl = URL.createObjectURL(blob);
    const link = document.createElement('a');
    link.href = objectUrl;
    link.download = filename;
    link.style.display = 'none';
    document.body.appendChild(link);
    link.click();
    link.remove();
    setTimeout(() => URL.revokeObjectURL(objectUrl), 30000);
  }

  function encodeChunk(bytes) {
    let binary = '';
    for (let index = 0; index < bytes.length; index += 1) binary += String.fromCharCode(bytes[index]);
    return btoa(binary);
  }

  globalThis.HoneycombPhotoDownloads = {
    safeFilename,
    async save({ response, sourceUrl, filename }) {
      if (!response?.ok) throw new Error(`Photo request failed (${response?.status || 'unknown'}).`);
      const nativeDownloader = globalThis.HoneycombDownloads;
      const blob = await response.blob();
      if (typeof nativeDownloader?.beginCachedSave === 'function') {
        if (!nativeDownloader.beginCachedSave(filename, blob.type || 'image/jpeg')) {
          throw new Error('Android could not prepare the photo file.');
        }
        try {
          const bytes = new Uint8Array(await blob.arrayBuffer());
          const chunkSize = 192 * 1024;
          for (let offset = 0; offset < bytes.length; offset += chunkSize) {
            const encoded = encodeChunk(bytes.subarray(offset, offset + chunkSize));
            if (!nativeDownloader.appendCachedChunk(encoded)) throw new Error('Android could not save the photo data.');
          }
          if (!nativeDownloader.finishCachedSave()) throw new Error('Android could not finish saving the photo.');
          return { native: true };
        } catch (error) {
          nativeDownloader.cancelCachedSave?.();
          throw error;
        }
      }
      if (typeof nativeDownloader?.download === 'function') {
        nativeDownloader.download(new URL(sourceUrl, location.href).href, filename);
        return { native: true };
      }
      browserDownload(blob, filename);
      return { native: false };
    },
  };
})();
