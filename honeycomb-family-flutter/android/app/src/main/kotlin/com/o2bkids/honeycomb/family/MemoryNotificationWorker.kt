package com.o2bkids.honeycomb.family

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import androidx.work.Worker
import androidx.work.WorkerParameters
import org.json.JSONArray
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MemoryNotificationWorker(
    context: Context,
    params: WorkerParameters,
) : Worker(context, params) {
    override fun doWork(): Result {
        val preferences = applicationContext.getSharedPreferences("honeycomb_memories", Context.MODE_PRIVATE)
        if (!preferences.getBoolean("enabled", true)) return Result.success()
        val today = SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Date())
        val plan = try { JSONArray(preferences.getString("plan", "[]")) } catch (_: Exception) { JSONArray() }
        var items: JSONArray? = null
        for (index in 0 until plan.length()) {
            val day = plan.optJSONObject(index) ?: continue
            if (day.optString("day") == today) {
                items = day.optJSONArray("items")
                break
            }
        }
        if (items == null || items.length() == 0) return Result.success()
        postMemoryNotification(items)
        return Result.success()
    }

    private fun postMemoryNotification(items: JSONArray) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU &&
            ContextCompat.checkSelfPermission(applicationContext, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) return
        val first: JSONObject = items.optJSONObject(0) ?: return
        val childName = first.optString("childName", "Your child")
        val reference = first.optString("referenceDay")
        val kind = first.optString("kind", "A little moment")
        val title = if (items.length() == 1) "$kind for $childName" else "Little moments are waiting"
        val text = if (items.length() == 1) {
            "A photo from $reference is ready to revisit."
        } else {
            "${items.length()} memories are ready — one for each child."
        }
        val intent = Intent(applicationContext, MainActivity::class.java).apply {
            action = Intent.ACTION_VIEW
            data = Uri.parse("honeycombfamily://open?tab=memory&childId=${Uri.encode(first.optString("childId"))}&momentId=${Uri.encode(first.optString("momentId"))}")
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
        }
        val pending = android.app.PendingIntent.getActivity(
            applicationContext,
            todayNotificationId(),
            intent,
            android.app.PendingIntent.FLAG_UPDATE_CURRENT or android.app.PendingIntent.FLAG_IMMUTABLE,
        )
        val manager = applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            manager.createNotificationChannel(
                NotificationChannel("honeycomb_memories", "Little moments", NotificationManager.IMPORTANCE_DEFAULT).apply {
                    description = "A daily Honeycomb Family memory"
                },
            )
        }
        val notification = NotificationCompat.Builder(applicationContext, "honeycomb_memories")
            .setSmallIcon(R.drawable.ic_notification_honeycomb)
            .setColor(0xffffb743.toInt())
            .setContentTitle(title)
            .setContentText(text)
            .setStyle(NotificationCompat.BigTextStyle().bigText(text))
            .setContentIntent(pending)
            .setAutoCancel(true)
            .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
            .build()
        NotificationManagerCompat.from(applicationContext).notify(todayNotificationId(), notification)
        rememberShown(items)
    }

    private fun rememberShown(items: JSONArray) {
        val preferences = applicationContext.getSharedPreferences("honeycomb_memories", Context.MODE_PRIVATE)
        val existing = try { JSONArray(preferences.getString("recentShown", "[]")) } catch (_: Exception) { JSONArray() }
        val updated = JSONArray()
        // Retain a short local history so an adjacent date cannot repeat the
        // same photo cluster the next time Flutter prepares its 45-day plan.
        for (index in maxOf(0, existing.length() - 18) until existing.length()) {
            updated.put(existing.optJSONObject(index))
        }
        for (index in 0 until items.length()) {
            val item = items.optJSONObject(index) ?: continue
            updated.put(JSONObject().apply {
                put("childId", item.optString("childId"))
                put("momentId", item.optString("momentId"))
            })
        }
        preferences.edit().putString("recentShown", updated.toString()).apply()
    }

    private fun todayNotificationId(): Int =
        SimpleDateFormat("yyyyMMdd", Locale.US).format(Date()).hashCode()
}
