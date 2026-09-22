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
        val title = data["title"].orEmpty().ifBlank {
            message.notification?.title.orEmpty().ifBlank { "Honeycomb update" }
        }
        val body = data["body"].orEmpty().ifBlank {
            message.notification?.body.orEmpty().ifBlank {
                "Open Honeycomb Family for the latest updates."
            }
        }
        val type = data["type"].orEmpty().ifBlank { "general" }
        val childId = data["childId"].orEmpty()
        val tab = data["tab"].orEmpty().ifBlank { "today" }
        val photoId = data["photoId"].orEmpty()
        val uri = "honeycombfamily://open?childId=$childId&tab=$tab&momentId=$photoId"
        val intent = Intent(Intent.ACTION_VIEW, android.net.Uri.parse(uri), this, MainActivity::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        val notificationId = (System.currentTimeMillis() and 0x7fffffff).toInt()
        val pending = PendingIntent.getActivity(
            this,
            notificationId,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )
        val channelId = "honeycomb_updates"
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(channelId, "Honeycomb updates", NotificationManager.IMPORTANCE_HIGH)
            channel.description = "New Honeycomb Family updates"
            getSystemService(NotificationManager::class.java).createNotificationChannel(channel)
        }
        val notification = NotificationCompat.Builder(this, channelId)
            // Launcher icons are rendered as a plain circle in Android's status
            // area. These are dedicated monochrome notification glyphs instead.
            .setSmallIcon(notificationIcon(type))
            .setColor(Color.rgb(255, 183, 67))
            .setContentTitle(title)
            .setContentText(body)
            .setStyle(NotificationCompat.BigTextStyle().bigText(body))
            // Allow the phone and Wear OS bridge to show the concise update
            // without requiring the parent to unlock or open the app.
            .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
            .setCategory(NotificationCompat.CATEGORY_EVENT)
            .setAutoCancel(true)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pending)
            .build()
        getSystemService(NotificationManager::class.java).notify(notificationId, notification)
    }

    private fun notificationIcon(type: String) = when (type.lowercase()) {
        "supply" -> R.drawable.ic_notification_supply
        "photo" -> R.drawable.ic_notification_photo
        "badge" -> R.drawable.ic_notification_badge
        "potty" -> R.drawable.ic_notification_potty
        "report" -> R.drawable.ic_notification_report
        else -> R.drawable.ic_notification_honeycomb
    }
}
