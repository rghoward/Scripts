package com.rhoward.hoots_and_reps.wear

import android.Manifest
import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.SystemClock
import android.view.Gravity
import android.view.HapticFeedbackConstants
import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.health.services.client.ExerciseUpdateCallback
import androidx.health.services.client.HealthServices
import androidx.health.services.client.data.Availability
import androidx.health.services.client.data.DataType
import androidx.health.services.client.data.DataTypeAvailability
import androidx.health.services.client.data.ExerciseConfig
import androidx.health.services.client.data.ExerciseLapSummary
import androidx.health.services.client.data.ExerciseType
import androidx.health.services.client.data.ExerciseUpdate
import com.google.android.gms.wearable.Wearable
import org.json.JSONArray
import org.json.JSONObject
import kotlin.math.max

/** A deliberately buttonless round-face companion. The phone owns the workout
 * plan; this screen only renders and controls that exact shared plan. */
class WearWorkoutActivity : Activity() {
    private val mainHandler = Handler(Looper.getMainLooper())
    private val exerciseClient by lazy { HealthServices.getClient(this).exerciseClient }
    private val directExecutor = java.util.concurrent.Executor { it.run() }
    private var startedAtElapsedMs: Long? = null
    private var locallyPaused = false
    private var latestBpm: Double? = null
    private var currentSession: JSONObject? = null

    private lateinit var timer: TextView
    private lateinit var phase: TextView
    private lateinit var detail: TextView
    private lateinit var progress: TextView
    private lateinit var heartRate: TextView
    private lateinit var prompt: TextView
    private lateinit var face: RoundWorkoutView

    private val uiTicker = object : Runnable {
        override fun run() {
            renderSession()
            mainHandler.postDelayed(this, 1_000)
        }
    }
    private val sessionReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) = showSessionState()
    }
    private val exerciseCallback = object : ExerciseUpdateCallback {
        override fun onRegistered() = Unit
        override fun onRegistrationFailed(throwable: Throwable) = runOnUiThread {
            detail.text = "Heart-rate listener unavailable"
        }
        override fun onExerciseUpdateReceived(update: ExerciseUpdate) {
            update.latestMetrics.getData(DataType.HEART_RATE_BPM).lastOrNull()?.let {
                runOnUiThread {
                    latestBpm = it.value
                    heartRate.text = "${it.value.toInt()} BPM"
                }
            }
        }
        override fun onLapSummaryReceived(lapSummary: ExerciseLapSummary) = Unit
        override fun onAvailabilityChanged(dataType: DataType<*, *>, availability: Availability) {
            if (dataType == DataType.HEART_RATE_BPM && availability is DataTypeAvailability) {
                runOnUiThread {
                    if (availability != DataTypeAvailability.AVAILABLE) detail.text = "Finding heart-rate sensor…"
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(createScreen())
        val filter = IntentFilter(WatchSessionStore.ACTION_CHANGED)
        if (Build.VERSION.SDK_INT >= 33) registerReceiver(sessionReceiver, filter, Context.RECEIVER_NOT_EXPORTED)
        else registerReceiver(sessionReceiver, filter)
        showSessionState()
        mainHandler.post(uiTicker)
    }

    override fun onDestroy() {
        mainHandler.removeCallbacks(uiTicker)
        unregisterReceiver(sessionReceiver)
        if (startedAtElapsedMs != null) stopHeartRateWorkout()
        super.onDestroy()
    }

    private fun createScreen(): View {
        fun scratch(value: String) = TextView(this).apply { text = value }
        timer = scratch("—"); phase = scratch("OPEN A WORKOUT")
        detail = scratch("Choose a section on your phone"); progress = scratch("")
        heartRate = scratch("— BPM"); prompt = scratch("OPEN")
        return RoundWorkoutView(this).also { view ->
            face = view
            view.onPrimary = { onFacePressed() }
            view.onPrevious = {
                if (progress.text.isNotBlank() && sendWatchAction("rewindProgress")) {
                    window.decorView.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS)
                }
            }
            view.onNext = {
                if (progress.text.isNotBlank() && sendWatchAction("advanceProgress")) {
                    window.decorView.performHapticFeedback(HapticFeedbackConstants.CONFIRM)
                }
            }
        }
    }

    private fun showSessionState() {
        currentSession = WatchSessionStore.read(this)?.let { raw -> runCatching { JSONObject(raw) }.getOrNull() }
        renderSession()
    }

    private fun renderFace() {
        val timerEnvelope = currentSession?.optJSONObject("timer")
        val primary = when {
            currentSession == null -> "OPEN"
            timerEnvelope == null -> "START"
            timerEnvelope.optString("command") == "pause" -> "RESUME"
            else -> "PAUSE"
        }
        face.render(
            WatchFaceState(
                phase = phase.text.toString(),
                timer = timer.text.toString(),
                detail = detail.text.toString(),
                heartRate = heartRate.text.toString(),
                tracker = progress.text.toString(),
                primaryLabel = primary,
                canAdvance = progress.text.isNotBlank(),
            ),
        )
    }

    private fun onFacePressed() {
        val session = currentSession
        if (session == null) {
            prompt.text = "OPEN GUIDED WORKOUT ON PHONE"
            return
        }
        val hasTimer = !session.isNull("timer")
        val watchAction = if (hasTimer) "toggle" else "start"
        if (!sendWatchAction(watchAction)) {
            prompt.text = "PHONE CONNECTION NEEDED"
            return
        }
        if (startedAtElapsedMs == null) requestHeartRateThenStart()
        else if (hasTimer) toggleHeartRateWorkout()
        window.decorView.performHapticFeedback(HapticFeedbackConstants.CONFIRM)
        prompt.text = if (watchAction == "start") "STARTING ON PHONE" else "SYNCING WITH PHONE"
    }

    private fun renderSession() {
        val session = currentSession
        if (session == null) {
            renderFace()
            return
        }
        val timerEnvelope = session.optJSONObject("timer")
        if (timerEnvelope == null) {
            phase.text = session.optString("sectionTitle", "READY")
            timer.text = "READY"
            detail.text = "TAP FACE TO START · ${session.optString("sectionBody", "").take(24)}"
            progress.text = ""
            prompt.text = "TAP ANYWHERE TO START"
            renderFace()
            return
        }
        val plan = timerEnvelope.optJSONObject("plan") ?: return
        val manual = timerEnvelope.optJSONObject("manualProgress")
        progress.text = manual?.let {
            "${it.optString("kind", "ROUND")} ${it.optInt("value", 0)}  ·  TAP TO ADD"
        } ?: ""
        val elapsedBase = plan.optLong("startOffsetSeconds", 0)
        val command = timerEnvelope.optString("command", "start")
        val sentAt = timerEnvelope.optLong("sentAtEpochMs", System.currentTimeMillis())
        val elapsed = elapsedBase + if (command == "pause") 0 else max(0, (System.currentTimeMillis() - sentAt) / 1_000)
        renderPlan(plan.optJSONArray("phases") ?: JSONArray(), elapsed, plan)
        prompt.text = if (command == "pause") "TAP ANYWHERE TO RESUME" else "TAP ANYWHERE TO PAUSE"
    }

    private fun renderPlan(phases: JSONArray, elapsed: Long, plan: JSONObject) {
        var cursor = 0L
        for (index in 0 until phases.length()) {
            val item = phases.optJSONObject(index) ?: continue
            val duration = item.optLong("durationSeconds", 0)
            if (elapsed < cursor + duration) {
                val remaining = max(0, cursor + duration - elapsed)
                timer.text = format(remaining)
                phase.text = item.optString("kind", "ACTIVE").replace(Regex("([a-z])([A-Z])"), "$1 $2").uppercase()
                val round = item.optInt("round", 0)
                val count = item.optInt("roundCount", 0)
                detail.text = if (round > 0 && count > 0) "ROUND $round / $count · ${item.optString("label")}" else item.optString("label")
                renderFace()
                return
            }
            cursor += duration
        }
        timer.text = "DONE"
        phase.text = "SECTION COMPLETE"
        detail.text = plan.optString("completionLabel", "Back to your phone")
        prompt.text = "CHECK PHONE FOR NEXT SECTION"
        renderFace()
    }

    private fun sendWatchAction(action: String): Boolean {
        val source = currentSession ?: return false
        return runCatching {
            val payload = JSONObject()
                .put("action", action)
                .put("workoutSequence", source.getInt("workoutSequence"))
                .put("sectionIndex", source.getInt("sectionIndex"))
                .toString()
            // Counters must feel immediate. A direct message reaches the active
            // phone listener without waiting for Data Layer item coalescing.
            Wearable.getNodeClient(this).connectedNodes.addOnSuccessListener { nodes ->
                nodes.forEach { node ->
                    Wearable.getMessageClient(this).sendMessage(
                        node.id,
                        "/hoots/workout-action",
                        payload.toByteArray(Charsets.UTF_8),
                    )
                }
            }
            true
        }.getOrDefault(false)
    }

    private fun requestHeartRateThenStart() {
        val permission = if (Build.VERSION.SDK_INT >= 36) "android.permission.health.READ_HEART_RATE" else Manifest.permission.BODY_SENSORS
        if (checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED) startHeartRateWorkout()
        else requestPermissions(arrayOf(permission), HEART_RATE_PERMISSION_REQUEST)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, results: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, results)
        if (requestCode == HEART_RATE_PERMISSION_REQUEST && results.firstOrNull() == PackageManager.PERMISSION_GRANTED) startHeartRateWorkout()
        else if (requestCode == HEART_RATE_PERMISSION_REQUEST) prompt.text = "HEART-RATE PERMISSION NEEDED"
    }

    private fun startHeartRateWorkout() {
        exerciseClient.setUpdateCallback(exerciseCallback)
        exerciseClient.startExerciseAsync(ExerciseConfig(ExerciseType.WORKOUT, setOf(DataType.HEART_RATE_BPM), false, false, emptyList())).addListener({
            startedAtElapsedMs = SystemClock.elapsedRealtime(); locallyPaused = false
            startForegroundService(Intent(this, WorkoutForegroundService::class.java))
        }, directExecutor)
    }

    private fun toggleHeartRateWorkout() {
        locallyPaused = !locallyPaused
        if (locallyPaused) exerciseClient.pauseExerciseAsync() else exerciseClient.resumeExerciseAsync()
    }

    private fun stopHeartRateWorkout() {
        exerciseClient.endExerciseAsync(); exerciseClient.clearUpdateCallbackAsync(exerciseCallback)
        stopService(Intent(this, WorkoutForegroundService::class.java))
        startedAtElapsedMs = null; latestBpm = null
    }

    private fun format(seconds: Long) = String.format("%02d:%02d", seconds / 60, seconds % 60)

    companion object {
        private const val HEART_RATE_PERMISSION_REQUEST = 701
        private const val PAPER = 0xff070615.toInt()
        private const val INK = 0xfff7f5ef.toInt()
        private const val MUTED = 0xffada6c1.toInt()
        private const val GOLD = 0xffffc44e.toInt()
    }
}
