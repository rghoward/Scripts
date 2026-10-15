package com.o2bkids.honeycomb.family

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.BitmapFactory
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.os.Bundle
import android.net.Uri
import android.webkit.CookieManager
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import com.google.firebase.messaging.FirebaseMessaging
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.face.FaceDetection
import com.google.mlkit.vision.face.FaceDetectorOptions
import com.google.mlkit.vision.label.ImageLabeling
import com.google.mlkit.vision.label.defaults.ImageLabelerOptions
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel
import java.util.Calendar
import java.net.HttpURLConnection
import java.net.URL
import java.util.concurrent.TimeUnit

class MainActivity : FlutterActivity() {
    companion object {
        private const val notificationSessionChannel = "honeycomb/notification-session"
        private const val memoriesChannel = "honeycomb/memories"
        private const val photoThemesChannel = "honeycomb/photo-themes"
        private const val honeycombOrigin = "https://honeycomb.o2bkids.com"
        private const val memoriesWorkName = "honeycomb-daily-memories"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseMessaging.getInstance().subscribeToTopic("honeycomb-family-alerts-v1")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU &&
            ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.POST_NOTIFICATIONS), 91)
        }
    }

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, notificationSessionChannel)
            .setMethodCallHandler { call, result ->
                when (call.method) {
                    "setCookies" -> {
                        val cookies = call.argument<String>("cookies").orEmpty()
                        val manager = CookieManager.getInstance()
                        cookies.split(Regex(";\\s*"))
                            .filter { it.contains('=') }
                            .forEach { manager.setCookie(honeycombOrigin, it) }
                        manager.flush()
                        result.success(null)
                    }
                    "clearCookies" -> {
                        CookieManager.getInstance().removeAllCookies { result.success(null) }
                    }
                    else -> result.notImplemented()
                }
            }
        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, memoriesChannel)
            .setMethodCallHandler { call, result ->
                when (call.method) {
                    "isWifi" -> result.success(isWifiConnected())
                    "syncPlan" -> {
                        val enabled = call.argument<Boolean>("enabled") ?: true
                        val plan = call.argument<String>("plan").orEmpty()
                        getSharedPreferences("honeycomb_memories", Context.MODE_PRIVATE)
                            .edit()
                            .putBoolean("enabled", enabled)
                            .putString("plan", plan)
                            .apply()
                        if (enabled) scheduleMemoryReminder() else {
                            WorkManager.getInstance(this).cancelUniqueWork(memoriesWorkName)
                        }
                        result.success(null)
                    }
                    "sendTestNotification" -> {
                        sendMemoryTestNotification()
                        result.success(null)
                    }
                    "recentShown" -> result.success(
                        getSharedPreferences("honeycomb_memories", Context.MODE_PRIVATE)
                            .getString("recentShown", "[]"),
                    )
                    else -> result.notImplemented()
                }
            }
        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, photoThemesChannel)
            .setMethodCallHandler { call, result ->
                if (call.method != "labelsForPhoto") {
                    result.notImplemented()
                    return@setMethodCallHandler
                }
                val filename = call.argument<String>("filename").orEmpty()
                val cookies = call.argument<String>("cookies").orEmpty()
                if (filename.isBlank()) {
                    result.success(mapOf("available" to false))
                    return@setMethodCallHandler
                }
                labelPhoto(filename, cookies, result)
            }
    }

    private fun isWifiConnected(): Boolean {
        val manager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val network = manager.activeNetwork ?: return false
        val capabilities = manager.getNetworkCapabilities(network) ?: return false
        return capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)
    }

    private fun scheduleMemoryReminder() {
        val now = Calendar.getInstance()
        val next = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, 9)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
            set(Calendar.MILLISECOND, 0)
            if (!after(now)) add(Calendar.DAY_OF_YEAR, 1)
        }
        val initialDelay = next.timeInMillis - now.timeInMillis
        val request = PeriodicWorkRequestBuilder<MemoryNotificationWorker>(24, TimeUnit.HOURS)
            .setInitialDelay(initialDelay, TimeUnit.MILLISECONDS)
            .build()
        WorkManager.getInstance(this).enqueueUniquePeriodicWork(
            memoriesWorkName,
            ExistingPeriodicWorkPolicy.UPDATE,
            request,
        )
    }

    private fun sendMemoryTestNotification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU &&
            ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) return
        val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            manager.createNotificationChannel(
                NotificationChannel("honeycomb_memories", "Little moments", NotificationManager.IMPORTANCE_DEFAULT).apply {
                    description = "A daily Honeycomb Family memory"
                },
            )
        }
        val intent = Intent(this, MainActivity::class.java).apply {
            action = Intent.ACTION_VIEW
            data = Uri.parse("honeycombfamily://open?tab=memory")
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
        }
        val pending = android.app.PendingIntent.getActivity(
            this,
            908212,
            intent,
            android.app.PendingIntent.FLAG_UPDATE_CURRENT or android.app.PendingIntent.FLAG_IMMUTABLE,
        )
        val text = "A little moment is ready to revisit."
        val notification = NotificationCompat.Builder(this, "honeycomb_memories")
            .setSmallIcon(R.drawable.ic_notification_honeycomb)
            .setColor(0xffffb743.toInt())
            .setContentTitle("A little moment for your family")
            .setContentText(text)
            .setStyle(NotificationCompat.BigTextStyle().bigText(text))
            .setContentIntent(pending)
            .setAutoCancel(true)
            .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
            .build()
        NotificationManagerCompat.from(this).notify(908212, notification)
    }

    private fun labelPhoto(filename: String, cookies: String, result: MethodChannel.Result) {
        Thread {
            val bitmap = downloadThumbnail(filename, cookies)
            if (bitmap == null) {
                runOnUiThread { result.success(mapOf("available" to false)) }
                return@Thread
            }
            val options = ImageLabelerOptions.Builder()
                .setConfidenceThreshold(0.68f)
                .build()
            val labeler = ImageLabeling.getClient(options)
            val image = InputImage.fromBitmap(bitmap, 0)
            labeler.process(image)
                .addOnSuccessListener { labels ->
                    val safeLabels = labels
                        .sortedByDescending { it.confidence }
                        .take(5)
                        .map { mapOf("text" to it.text, "confidence" to it.confidence) }
                    val faceDetector = FaceDetection.getClient(
                        FaceDetectorOptions.Builder()
                            .setPerformanceMode(FaceDetectorOptions.PERFORMANCE_MODE_FAST)
                            .build(),
                    )
                    faceDetector.process(image)
                        .addOnSuccessListener { faces ->
                            val hasHumanLabel = safeLabels.any {
                                val text = (it["text"] as? String)?.lowercase().orEmpty()
                                text in setOf("person", "people", "child", "baby", "face", "smile", "selfie")
                            }
                            runOnUiThread {
                                result.success(mapOf("available" to true, "labels" to safeLabels, "hasPerson" to (faces.isNotEmpty() || hasHumanLabel)))
                            }
                            faceDetector.close()
                            labeler.close()
                        }
                        .addOnFailureListener {
                            runOnUiThread { result.success(mapOf("available" to true, "labels" to safeLabels, "hasPerson" to false)) }
                            faceDetector.close()
                            labeler.close()
                        }
                }
                .addOnFailureListener {
                    runOnUiThread { result.success(mapOf("available" to false)) }
                    labeler.close()
                }
        }.start()
    }

    private fun downloadThumbnail(filename: String, cookies: String) = try {
        val base = if (filename.startsWith("http")) filename else "$honeycombOrigin$filename"
        val url = URL("$base${if (base.contains("?")) "&" else "?"}preset=moment-image-thumb")
        val connection = url.openConnection() as HttpURLConnection
        connection.connectTimeout = 6000
        connection.readTimeout = 6000
        cookies.ifBlank { CookieManager.getInstance().getCookie(honeycombOrigin).orEmpty() }
            ?.takeIf { it.isNotBlank() }
            ?.let { connection.setRequestProperty("Cookie", it) }
        connection.inputStream.use { stream -> BitmapFactory.decodeStream(stream) }
    } catch (_: Exception) {
        null
    }
}
