package com.o2bkids.honeycomb.family

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class HoneycombMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(message: RemoteMessage) {
        val data = message.data
        val title = data["title"].orEmpty().ifBlank { "Honeycomb update" }
        val body = data["body"].orEmpty().ifBlank { "Open Honeycomb Family for the latest updates." }
        val notificationText = "${data["type"].orEmpty()} $title $body".lowercase()
        val isPotty = Regex("\\b(bm|bowel|stool|poop|pee|potty)\\b").containsMatchIn(notificationText)
        val childId = data["childId"].orEmpty()
        val tab = data["tab"].orEmpty().ifBlank { "today" }
        val photoId = data["photoId"].orEmpty()
        val uri = "honeycombfamily://open?childId=$childId&tab=$tab&momentId=$photoId"
        val intent = Intent(Intent.ACTION_VIEW, android.net.Uri.parse(uri), this, MainActivity::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        val pending = PendingIntent.getActivity(
            this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        val channelId = "honeycomb_updates"
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(channelId, "Honeycomb updates", NotificationManager.IMPORTANCE_HIGH)
            channel.description = "New Honeycomb Family updates"
            getSystemService(NotificationManager::class.java).createNotificationChannel(channel)
        }
        val notification = NotificationCompat.Builder(this, channelId)
            .setSmallIcon(if (isPotty) R.drawable.ic_notification_potty else R.mipmap.ic_launcher)
            .setColor(Color.rgb(255, 183, 67))
            .setContentTitle(if (isPotty) "🚽 $title" else title)
            .setContentText(body)
            .setStyle(NotificationCompat.BigTextStyle().bigText(body))
            .setAutoCancel(true)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pending)
            .build()
        getSystemService(NotificationManager::class.java).notify((System.currentTimeMillis() and 0x7fffffff).toInt(), notification)
    }
}
