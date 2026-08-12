package com.o2bkids.honeycomb.family;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/** Displays count-only family updates sent by the personal Ubuntu monitor. */
public final class HoneycombMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage message) {
        String title = value(message, "title", "Honeycomb update");
        String body = value(message, "body", "Open Honeycomb Family for the latest updates.");
        showNotification(title, body);
    }

    private String value(RemoteMessage message, String key, String fallback) {
        String result = message.getData().get(key);
        return result == null || result.trim().isEmpty() ? fallback : result;
    }

    private void showNotification(String title, String body) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU
            && ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS)
                != PackageManager.PERMISSION_GRANTED) return;

        String channelId = getString(R.string.push_notification_channel_id);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                channelId,
                getString(R.string.push_notification_channel_name),
                NotificationManager.IMPORTANCE_HIGH
            );
            getSystemService(NotificationManager.class).createNotificationChannel(channel);
        }

        Intent openApp = new Intent(this, MainActivity.class)
            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        PendingIntent contentIntent = PendingIntent.getActivity(
            this,
            0,
            openApp,
            PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
        );
        int notificationId = (int) (System.currentTimeMillis() & 0x7fffffff);
        NotificationCompat.Builder notification = new NotificationCompat.Builder(this, channelId)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle(title)
            .setContentText(body)
            .setStyle(new NotificationCompat.BigTextStyle().bigText(body))
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)
            .setContentIntent(contentIntent);
        NotificationManagerCompat.from(this).notify(notificationId, notification.build());
    }
}
