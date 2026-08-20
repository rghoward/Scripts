package com.o2bkids.honeycomb.family;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.webkit.CookieManager;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/** Displays count-only family updates sent by the personal Ubuntu monitor. */
public final class HoneycombMessagingService extends FirebaseMessagingService {
    private static final String HONEYCOMB_ORIGIN = "https://honeycomb.o2bkids.com";
    private static final int MAX_THUMBNAIL_BYTES = 2 * 1024 * 1024;
    private static final int MAX_THUMBNAIL_DIMENSION = 512;

    @Override
    public void onMessageReceived(RemoteMessage message) {
        String title = value(message, "title", "Honeycomb update");
        String body = value(message, "body", "Open Honeycomb Family for the latest updates.");
        String type = value(message, "type", "general");
        String childId = value(message, "childId", "");
        String tab = value(message, "tab", "home");
        String photoId = value(message, "photoId", "");
        String photoFilename = value(message, "photoFilename", "");
        Bitmap thumbnail = "photo".equals(type) && !photoFilename.isEmpty()
            ? fetchPhotoThumbnail(photoFilename)
            : null;
        showNotification(type, title, body, childId, tab, photoId, thumbnail);
    }

    private String value(RemoteMessage message, String key, String fallback) {
        String result = message.getData().get(key);
        return result == null || result.trim().isEmpty() ? fallback : result;
    }

    private void showNotification(String type, String title, String body, String childId, String tab, String photoId, Bitmap thumbnail) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU
            && ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS)
                != PackageManager.PERMISSION_GRANTED) return;

        NotificationStyle style = notificationStyle(type);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                style.channelId,
                style.channelName,
                NotificationManager.IMPORTANCE_HIGH
            );
            channel.setDescription(style.channelDescription);
            getSystemService(NotificationManager.class).createNotificationChannel(channel);
        }

        Intent openApp = new Intent(this, MainActivity.class)
            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP)
            .putExtra(MainActivity.EXTRA_NOTIFICATION_CHILD_ID, childId)
            .putExtra(MainActivity.EXTRA_NOTIFICATION_TAB, tab)
            .putExtra(MainActivity.EXTRA_NOTIFICATION_PHOTO_ID, photoId);
        int notificationId = (int) (System.currentTimeMillis() & 0x7fffffff);
        PendingIntent contentIntent = PendingIntent.getActivity(
            this,
            notificationId,
            openApp,
            PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
        );
        NotificationCompat.Builder notification = new NotificationCompat.Builder(this, style.channelId)
            .setSmallIcon(style.iconResource)
            .setColor(style.color)
            .setContentTitle(title)
            .setContentText(body)
            .setStyle(new NotificationCompat.BigTextStyle().bigText(body))
            .setCategory(NotificationCompat.CATEGORY_STATUS)
            .setGroup("honeycomb_family_updates")
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)
            .setContentIntent(contentIntent);
        if (thumbnail != null) {
            notification
                .setLargeIcon(thumbnail)
                .setStyle(new NotificationCompat.BigPictureStyle()
                    .bigPicture(thumbnail)
                    .bigLargeIcon((Bitmap) null)
                    .setContentDescription("New Honeycomb photo"));
        }
        NotificationManagerCompat.from(this).notify(notificationId, notification.build());
    }

    private Bitmap fetchPhotoThumbnail(String photoFilename) {
        if (!photoFilename.startsWith("/")) return null;
        String cookies = CookieManager.getInstance().getCookie(HONEYCOMB_ORIGIN);
        if (cookies == null || cookies.isEmpty()) return null;
        HttpURLConnection connection = null;
        try {
            String separator = photoFilename.contains("?") ? "&" : "?";
            URL url = new URL(HONEYCOMB_ORIGIN + photoFilename + separator + "preset=moment-image-thumb");
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(3500);
            connection.setReadTimeout(5000);
            connection.setRequestProperty("Cookie", cookies);
            connection.setRequestProperty("Accept", "image/*");
            connection.setUseCaches(false);
            if (connection.getResponseCode() < 200 || connection.getResponseCode() >= 300) return null;
            if (connection.getContentLengthLong() > MAX_THUMBNAIL_BYTES) return null;
            try (InputStream stream = connection.getInputStream()) {
                Bitmap bitmap = BitmapFactory.decodeStream(stream);
                return scaleThumbnail(bitmap);
            }
        } catch (Exception error) {
            return null;
        } finally {
            if (connection != null) connection.disconnect();
        }
    }

    private Bitmap scaleThumbnail(Bitmap bitmap) {
        if (bitmap == null) return null;
        int largestDimension = Math.max(bitmap.getWidth(), bitmap.getHeight());
        if (largestDimension <= MAX_THUMBNAIL_DIMENSION) return bitmap;
        float scale = (float) MAX_THUMBNAIL_DIMENSION / largestDimension;
        return Bitmap.createScaledBitmap(
            bitmap,
            Math.round(bitmap.getWidth() * scale),
            Math.round(bitmap.getHeight() * scale),
            true
        );
    }

    private NotificationStyle notificationStyle(String type) {
        switch (type) {
            case "supply":
                return new NotificationStyle(
                    "family_updates_supply", "Supply requests", "Items requested for a child",
                    R.drawable.ic_notification_supply, Color.rgb(230, 126, 34)
                );
            case "report":
                return new NotificationStyle(
                    "family_updates_reports", "Daily reports", "New daily reports",
                    R.drawable.ic_notification_report, Color.rgb(52, 152, 219)
                );
            case "photo":
                return new NotificationStyle(
                    "family_updates_photos", "Photos", "New Honeycomb photos and daily moments",
                    R.drawable.ic_notification_photo, Color.rgb(142, 68, 173)
                );
            case "badge":
                return new NotificationStyle(
                    "family_updates_badges", "Badges", "Newly earned badges",
                    R.drawable.ic_notification_badge, Color.rgb(241, 196, 15)
                );
            default:
                return new NotificationStyle(
                    getString(R.string.push_notification_channel_id),
                    getString(R.string.push_notification_channel_name),
                    "Honeycomb Family monitor updates",
                    R.drawable.ic_notification_honeycomb, Color.rgb(35, 155, 86)
                );
        }
    }

    private static final class NotificationStyle {
        final String channelId;
        final String channelName;
        final String channelDescription;
        final int iconResource;
        final int color;

        NotificationStyle(
            String channelId,
            String channelName,
            String channelDescription,
            int iconResource,
            int color
        ) {
            this.channelId = channelId;
            this.channelName = channelName;
            this.channelDescription = channelDescription;
            this.iconResource = iconResource;
            this.color = color;
        }
    }
}
