package com.o2bkids.honeycomb.family

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import android.webkit.CookieManager
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import java.net.HttpURLConnection
import java.net.URL

class HoneycombMessagingService : FirebaseMessagingService() {
    companion object {
        private const val honeycombOrigin = "https://honeycomb.o2bkids.com"
        private const val maxThumbnailBytes = 2 * 1024 * 1024
        private const val maxThumbnailDimension = 512
    }

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
        val photoFilename = data["photoFilename"].orEmpty()
        val thumbnail = if (type == "photo" && photoFilename.isNotBlank()) {
            fetchPhotoThumbnail(photoFilename)
        } else {
            null
        }
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
        if (thumbnail != null) {
            notification
                .setLargeIcon(thumbnail)
                .setStyle(
                    NotificationCompat.BigPictureStyle()
                        .bigPicture(thumbnail)
                        .bigLargeIcon(null as Bitmap?)
                        .setContentDescription("New Honeycomb photo"),
                )
        }
        getSystemService(NotificationManager::class.java).notify(notificationId, notification.build())
    }

    private fun fetchPhotoThumbnail(photoFilename: String): Bitmap? {
        if (!photoFilename.startsWith('/')) return null
        val cookies = CookieManager.getInstance().getCookie(honeycombOrigin)
        if (cookies.isNullOrBlank()) return null
        var connection: HttpURLConnection? = null
        return try {
            val separator = if (photoFilename.contains('?')) "&" else "?"
            val url = URL("$honeycombOrigin$photoFilename${separator}preset=moment-image-thumb")
            connection = url.openConnection() as HttpURLConnection
            connection.connectTimeout = 3500
            connection.readTimeout = 5000
            connection.setRequestProperty("Cookie", cookies)
            connection.setRequestProperty("Accept", "image/*")
            connection.useCaches = false
            if (connection.responseCode !in 200..299) return null
            if (connection.contentLengthLong > maxThumbnailBytes) return null
            connection.inputStream.use { scaleThumbnail(BitmapFactory.decodeStream(it)) }
        } catch (_: Exception) {
            null
        } finally {
            connection?.disconnect()
        }
    }

    private fun scaleThumbnail(bitmap: Bitmap?): Bitmap? {
        bitmap ?: return null
        val largest = maxOf(bitmap.width, bitmap.height)
        if (largest <= maxThumbnailDimension) return bitmap
        val scale = maxThumbnailDimension.toFloat() / largest
        return Bitmap.createScaledBitmap(
            bitmap,
            (bitmap.width * scale).toInt(),
            (bitmap.height * scale).toInt(),
            true,
        )
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
