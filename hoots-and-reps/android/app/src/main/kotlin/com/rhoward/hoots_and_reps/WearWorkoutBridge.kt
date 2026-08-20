package com.rhoward.hoots_and_reps

import android.os.Handler
import android.os.Looper
import io.flutter.plugin.common.MethodChannel

/** Delivers watch actions to Flutter when the phone app is alive. */
object WearWorkoutBridge {
    private val mainHandler = Handler(Looper.getMainLooper())
    @Volatile var channel: MethodChannel? = null

    fun dispatch(action: String) {
        mainHandler.post { channel?.invokeMethod("watchAction", action) }
    }

    fun notifyActionsAvailable() {
        mainHandler.post { channel?.invokeMethod("watchActionsAvailable", null) }
    }
}
