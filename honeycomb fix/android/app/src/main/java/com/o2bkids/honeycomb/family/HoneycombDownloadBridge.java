package com.o2bkids.honeycomb.family;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Toast;
import android.util.Base64;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class HoneycombDownloadBridge {
    private final MainActivity activity;
    private final WebView webView;
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private File cachedTransferFile;
    private OutputStream cachedTransferOutput;
    private String cachedTransferName;
    private String cachedTransferMime;

    HoneycombDownloadBridge(MainActivity activity, WebView webView) {
        this.activity = activity;
        this.webView = webView;
    }

    @JavascriptInterface
    public synchronized boolean beginCachedSave(String suggestedName, String mimeType) {
        cancelCachedSave();
        try {
            cachedTransferName = suggestedName != null && suggestedName.matches("[A-Za-z0-9._ -]{1,120}")
                ? suggestedName : "Honeycomb-photo.jpg";
            cachedTransferMime = mimeType != null && mimeType.startsWith("image/") ? mimeType : "image/jpeg";
            cachedTransferFile = File.createTempFile("honeycomb-photo-", ".cache", activity.getCacheDir());
            cachedTransferOutput = new FileOutputStream(cachedTransferFile);
            notifyUser("Saving cached original to Photos…", Toast.LENGTH_SHORT);
            return true;
        } catch (IOException error) {
            cancelCachedSave();
            notifyUser("Photo save failed: " + error.getMessage(), Toast.LENGTH_LONG);
            return false;
        }
    }

    @JavascriptInterface
    public synchronized boolean appendCachedChunk(String encodedChunk) {
        if (cachedTransferOutput == null || encodedChunk == null) return false;
        try {
            cachedTransferOutput.write(Base64.decode(encodedChunk, Base64.NO_WRAP));
            return true;
        } catch (Exception error) {
            cancelCachedSave();
            notifyUser("Photo save failed: " + error.getMessage(), Toast.LENGTH_LONG);
            return false;
        }
    }

    @JavascriptInterface
    public synchronized boolean finishCachedSave() {
        if (cachedTransferOutput == null || cachedTransferFile == null) return false;
        try {
            cachedTransferOutput.close();
            File source = cachedTransferFile;
            String filename = cachedTransferName;
            String mimeType = cachedTransferMime;
            clearCachedTransfer();
            executor.execute(() -> saveCachedPhoto(source, filename, mimeType));
            return true;
        } catch (IOException error) {
            cancelCachedSave();
            notifyUser("Photo save failed: " + error.getMessage(), Toast.LENGTH_LONG);
            return false;
        }
    }

    @JavascriptInterface
    public synchronized void cancelCachedSave() {
        if (cachedTransferOutput != null) {
            try { cachedTransferOutput.close(); } catch (IOException ignored) {}
        }
        if (cachedTransferFile != null) cachedTransferFile.delete();
        clearCachedTransfer();
    }

    private void clearCachedTransfer() {
        cachedTransferFile = null;
        cachedTransferOutput = null;
        cachedTransferName = null;
        cachedTransferMime = null;
    }

    private void saveCachedPhoto(File source, String filename, String mimeType) {
        Uri destination = null;
        try (InputStream input = new java.io.FileInputStream(source)) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                ContentValues values = new ContentValues();
                values.put(MediaStore.Images.Media.DISPLAY_NAME, filename);
                values.put(MediaStore.Images.Media.MIME_TYPE, mimeType);
                values.put(MediaStore.Images.Media.RELATIVE_PATH, Environment.DIRECTORY_PICTURES + "/Honeycomb");
                values.put(MediaStore.Images.Media.IS_PENDING, 1);
                destination = activity.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
                if (destination == null) throw new IOException("could not create the photo");
                try (OutputStream output = activity.getContentResolver().openOutputStream(destination)) {
                    if (output == null) throw new IOException("could not open the photo");
                    copyStream(input, output);
                }
                values.clear();
                values.put(MediaStore.Images.Media.IS_PENDING, 0);
                activity.getContentResolver().update(destination, values, null, null);
            } else {
                File folder = new File(activity.getExternalFilesDir(Environment.DIRECTORY_PICTURES), "Honeycomb");
                if (!folder.exists() && !folder.mkdirs()) throw new IOException("could not create photo folder");
                try (OutputStream output = new FileOutputStream(new File(folder, filename))) {
                    copyStream(input, output);
                }
            }
            notifyUser("Photo saved to Pictures/Honeycomb", Toast.LENGTH_LONG);
        } catch (Exception error) {
            if (destination != null) activity.getContentResolver().delete(destination, null, null);
            notifyUser("Photo save failed: " + error.getMessage(), Toast.LENGTH_LONG);
        } finally {
            source.delete();
        }
    }

    @JavascriptInterface
    public void download(String url, String suggestedName) {
        Uri source = Uri.parse(url);
        if (!"https".equalsIgnoreCase(source.getScheme()) || !"honeycomb.o2bkids.com".equalsIgnoreCase(source.getHost())) {
            notifyUser("Photo download blocked: unexpected address", Toast.LENGTH_LONG);
            return;
        }
        String filename = suggestedName != null && suggestedName.matches("[A-Za-z0-9._ -]{1,120}")
            ? suggestedName : "Honeycomb-photo.jpg";
        activity.runOnUiThread(() -> {
            try {
                String cookies = CookieManager.getInstance().getCookie(url);
                String userAgent = webView.getSettings().getUserAgentString();
                notifyUser("Downloading original photo…", Toast.LENGTH_SHORT);
                executor.execute(() -> downloadPhoto(url, filename, cookies, userAgent));
            } catch (Exception error) {
                notifyUser("Photo download failed: " + error.getMessage(), Toast.LENGTH_LONG);
            }
        });
    }

    private void downloadPhoto(String url, String filename, String cookies, String userAgent) {
        Uri destination = null;
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setInstanceFollowRedirects(true);
            connection.setConnectTimeout(20000);
            connection.setReadTimeout(60000);
            connection.setRequestProperty("User-Agent", userAgent);
            connection.setRequestProperty("Accept", "image/*,*/*;q=0.8");
            connection.setRequestProperty("Referer", "https://honeycomb.o2bkids.com/");
            if (cookies != null && !cookies.isBlank()) connection.setRequestProperty("Cookie", cookies);
            int status = connection.getResponseCode();
            if (status < 200 || status >= 300) throw new IOException("photo server returned " + status);
            String contentType = connection.getContentType();
            if (contentType != null && !contentType.toLowerCase().startsWith("image/")) {
                throw new IOException("server did not return an image");
            }
            try (InputStream input = connection.getInputStream()) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    ContentValues values = new ContentValues();
                    values.put(MediaStore.Downloads.DISPLAY_NAME, filename);
                    values.put(MediaStore.Downloads.MIME_TYPE, contentType != null ? contentType : "image/jpeg");
                    values.put(MediaStore.Downloads.RELATIVE_PATH, Environment.DIRECTORY_DOWNLOADS + "/Honeycomb");
                    values.put(MediaStore.Downloads.IS_PENDING, 1);
                    destination = activity.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, values);
                    if (destination == null) throw new IOException("could not create the download file");
                    try (OutputStream output = activity.getContentResolver().openOutputStream(destination)) {
                        if (output == null) throw new IOException("could not open the download file");
                        copyStream(input, output);
                    }
                    values.clear();
                    values.put(MediaStore.Downloads.IS_PENDING, 0);
                    activity.getContentResolver().update(destination, values, null, null);
                } else {
                    File folder = new File(activity.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "Honeycomb");
                    if (!folder.exists() && !folder.mkdirs()) throw new IOException("could not create download folder");
                    try (OutputStream output = new FileOutputStream(new File(folder, filename))) {
                        copyStream(input, output);
                    }
                }
            }
            notifyUser("Photo saved to Downloads/Honeycomb", Toast.LENGTH_LONG);
        } catch (Exception error) {
            if (destination != null) activity.getContentResolver().delete(destination, null, null);
            notifyUser("Photo download failed: " + error.getMessage(), Toast.LENGTH_LONG);
        } finally {
            if (connection != null) connection.disconnect();
        }
    }

    private void copyStream(InputStream input, OutputStream output) throws IOException {
        byte[] buffer = new byte[32 * 1024];
        int count;
        while ((count = input.read(buffer)) >= 0) output.write(buffer, 0, count);
    }

    private void notifyUser(String message, int duration) {
        activity.runOnUiThread(() -> {
            Toast.makeText(activity, message, duration).show();
            String escaped = message.replace("\\", "\\\\").replace("'", "\\'").replace("\n", " ");
            webView.evaluateJavascript("window.__HCFD_DOWNLOAD_STATUS__&&window.__HCFD_DOWNLOAD_STATUS__('" + escaped + "')", null);
        });
    }

    void shutdown() {
        cancelCachedSave();
        executor.shutdownNow();
    }
}
