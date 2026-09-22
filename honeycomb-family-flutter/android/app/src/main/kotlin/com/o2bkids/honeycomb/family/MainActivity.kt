package com.o2bkids.honeycomb.family

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.webkit.CookieManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.firebase.messaging.FirebaseMessaging
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel

class MainActivity : FlutterActivity() {
    companion object {
        private const val notificationSessionChannel = "honeycomb/notification-session"
        private const val honeycombOrigin = "https://honeycomb.o2bkids.com"
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
    }
}
