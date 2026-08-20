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
import androidx.health.services.client.data.ExerciseTrackedStatus
import androidx.health.services.client.data.ExerciseType
import androidx.health.services.client.data.ExerciseUpdate
import com.google.android.gms.wearable.Wearable
import com.google.android.gms.wearable.PutDataMapRequest
import org.json.JSONArray
import org.json.JSONObject
import kotlin.math.max
import java.util.UUID

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
    // Render timer taps locally at once; the durable phone sync replaces this
    // short-lived prediction as soon as its updated session arrives.
    private var optimisticTimerCommand: String? = null
    private var optimisticElapsedBase: Long? = null
    private var optimisticSentAtEpochMs: Long? = null
    private var optimisticRoundDelta = 0
    private var awaitingRoundCompletion = false
    private var completionPending = false
    private var completionSent = false
    private var completedPausedSession: JSONObject? = null
    private var completedElapsedSeconds: Long = 0
    private var completedRoundSummary = ""

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
                    heartRate.text = formatHeartRate(it.value.toInt())
                    renderFace()
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

    override fun onResume() {
        super.onResume()
        reconnectOwnedExercise()
    }

    override fun onDestroy() {
        mainHandler.removeCallbacks(uiTicker)
        unregisterReceiver(sessionReceiver)
        // Do not end the Health Services workout merely because Android has
        // recreated this activity. The foreground service keeps it owned and
        // onResume reconnects the callback to the same live exercise.
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
                    optimisticRoundDelta--
                    renderSession()
                    window.decorView.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS)
                }
            }
            view.onNext = {
                val manual = currentSession?.optJSONObject("timer")?.optJSONObject("manualProgress")
                val target = manual?.optInt("target", 0) ?: 0
                val current = (manual?.optInt("value", 0) ?: 0) + optimisticRoundDelta
                if (target > 0 && current >= target) {
                    if (!completionSent && awaitingRoundCompletion && sendWatchAction("complete")) {
                        awaitingRoundCompletion = false
                        completionPending = true
                        completionSent = true
                        completedElapsedSeconds = currentElapsedSeconds(currentSession?.optJSONObject("timer"))
                        val manual = currentSession?.optJSONObject("timer")?.optJSONObject("manualProgress")
                        val rounds = max(0, (manual?.optInt("value", 0) ?: 0) + optimisticRoundDelta)
                        val target = manual?.optInt("target", 0) ?: 0
                        completedRoundSummary = if (target > 0) "$rounds / $target ROUNDS" else "$rounds ROUNDS"
                        forceOptimisticPause(currentSession?.optJSONObject("timer"))
                        if (startedAtElapsedMs != null && !locallyPaused) toggleHeartRateWorkout()
                        prompt.text = "COMPLETING ON PHONE"
                    } else {
                        awaitingRoundCompletion = true
                        renderSession()
                    }
                } else if (progress.text.isNotBlank() && sendWatchAction("advanceProgress")) {
                    optimisticRoundDelta++
                    awaitingRoundCompletion = target > 0 && current + 1 >= target
                    renderSession()
                    window.decorView.performHapticFeedback(HapticFeedbackConstants.CONFIRM)
                }
            }
        }
    }

    private fun showSessionState() {
        val received = WatchSessionStore.read(this)?.let { raw -> runCatching { JSONObject(raw) }.getOrNull() }
        val receivedTimer = received?.optJSONObject("timer")
        val currentIndex = currentSession?.optInt("sectionIndex", -1) ?: -1
        val receivedIndex = received?.optInt("sectionIndex", -1) ?: -1
        if (completionPending && (receivedTimer == null || receivedIndex != currentIndex)) {
            completionPending = false
            completedPausedSession = null
            completionSent = false
        }
        if (completionPending && receivedTimer?.optString("command") == "pause") {
            completedPausedSession = received
        }
        // A round update can arrive after the finish event. Retain the latest
        // paused envelope until the next section replaces it.
        val retainedRunningUpdate = completionPending && receivedTimer?.optString("command") != "pause"
        currentSession = if (retainedRunningUpdate) {
            completedPausedSession ?: currentSession ?: received
        } else {
            received
        }
        if (!retainedRunningUpdate) {
            optimisticTimerCommand = null
            optimisticElapsedBase = null
            optimisticSentAtEpochMs = null
        }
        optimisticRoundDelta = 0
        awaitingRoundCompletion = false
        renderSession()
    }

    private fun renderFace() {
        val timerEnvelope = currentSession?.optJSONObject("timer")
        val primary = when {
            currentSession == null -> "OPEN"
            timerEnvelope == null -> "START"
            (optimisticTimerCommand ?: timerEnvelope.optString("command")) == "pause" -> "RESUME"
            else -> "PAUSE"
        }
        face.render(
            WatchFaceState(
                phase = phase.text.toString(),
                timer = timer.text.toString(),
                detail = detail.text.toString(),
                heartRate = heartRate.text.toString(),
                heartRateZone = latestBpm?.let { heartRateZone(it.toInt()) },
                tracker = progress.text.toString(),
                roundActionLabel = if (awaitingRoundCompletion) "FINISH" else "✓  ROUND",
                primaryLabel = primary,
                canAdvance = progress.text.isNotBlank() && !completionSent,
            ),
        )
    }

    private fun onFacePressed() {
        if (completionSent) return
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
        if (hasTimer) applyOptimisticTimerToggle(session.optJSONObject("timer"))
        if (startedAtElapsedMs == null) requestHeartRateThenStart()
        else if (hasTimer) toggleHeartRateWorkout()
        window.decorView.performHapticFeedback(HapticFeedbackConstants.CONFIRM)
        prompt.text = if (watchAction == "start") "STARTING ON PHONE" else "SYNCING WITH PHONE"
    }

    private fun renderSession() {
        val session = currentSession
        if (session == null) {
            window.clearFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
            renderFace()
            return
        }
        if (completionSent) {
            window.clearFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
            phase.text = "COMPLETE"
            timer.text = format(completedElapsedSeconds)
            detail.text = completedRoundSummary.ifBlank { "WORKOUT COMPLETE" }
            progress.text = "FINAL TIME"
            prompt.text = "CHECK PHONE"
            renderFace()
            return
        }
        val timerEnvelope = session.optJSONObject("timer")
        if (timerEnvelope == null) {
            window.clearFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
            phase.text = session.optString("sectionTitle", "READY")
            timer.text = "READY"
            detail.text = "TAP FACE TO START · ${session.optString("sectionBody", "").take(24)}"
            progress.text = ""
            prompt.text = "TAP ANYWHERE TO START"
            renderFace()
            return
        }
        // This is an active, foreground exercise display. Keeping the screen
        // awake prevents Wear OS from immediately returning to the watch face
        // while the athlete is using the timer.
        window.addFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        val plan = timerEnvelope.optJSONObject("plan") ?: return
        val manual = timerEnvelope.optJSONObject("manualProgress")
        progress.text = manual?.let {
            val value = max(0, it.optInt("value", 0) + optimisticRoundDelta)
            val target = it.optInt("target", 0)
            when {
                target > 0 && awaitingRoundCompletion -> "$value / $target • FINISH?"
                target > 0 -> "$value / $target ROUNDS"
                else -> "$value ${it.optString("kind", "ROUND")}S COMPLETE"
            }
        } ?: ""
        val elapsedBase = optimisticElapsedBase ?: plan.optLong("startOffsetSeconds", 0)
        val command = optimisticTimerCommand ?: timerEnvelope.optString("command", "start")
        val sentAt = optimisticSentAtEpochMs ?: timerEnvelope.optLong("sentAtEpochMs", System.currentTimeMillis())
        val elapsed = elapsedBase + if (command == "pause") 0 else max(0, (System.currentTimeMillis() - sentAt) / 1_000)
        renderPlan(plan.optJSONArray("phases") ?: JSONArray(), elapsed, plan)
        if (command == "pause") {
            phase.text = "PAUSED"
            detail.text = "TAP THE TIMER TO RESUME"
            renderFace()
        }
        prompt.text = if (command == "pause") "TAP TIMER TO RESUME" else "TAP TIMER TO PAUSE"
    }

    private fun applyOptimisticTimerToggle(timerEnvelope: JSONObject?) {
        val plan = timerEnvelope?.optJSONObject("plan") ?: return
        val command = optimisticTimerCommand ?: timerEnvelope.optString("command", "start")
        val base = optimisticElapsedBase ?: plan.optLong("startOffsetSeconds", 0)
        val sentAt = optimisticSentAtEpochMs ?: timerEnvelope.optLong("sentAtEpochMs", System.currentTimeMillis())
        if (command == "pause") {
            optimisticTimerCommand = "start"
            optimisticElapsedBase = base
            optimisticSentAtEpochMs = System.currentTimeMillis()
        } else {
            optimisticTimerCommand = "pause"
            optimisticElapsedBase = base + max(0, (System.currentTimeMillis() - sentAt) / 1_000)
            optimisticSentAtEpochMs = System.currentTimeMillis()
        }
        renderSession()
    }

    private fun forceOptimisticPause(timerEnvelope: JSONObject?) {
        val plan = timerEnvelope?.optJSONObject("plan") ?: return
        val command = optimisticTimerCommand ?: timerEnvelope.optString("command", "start")
        val base = optimisticElapsedBase ?: plan.optLong("startOffsetSeconds", 0)
        val sentAt = optimisticSentAtEpochMs ?: timerEnvelope.optLong("sentAtEpochMs", System.currentTimeMillis())
        optimisticTimerCommand = "pause"
        optimisticElapsedBase = if (command == "pause") base else base + max(0, (System.currentTimeMillis() - sentAt) / 1_000)
        optimisticSentAtEpochMs = System.currentTimeMillis()
        renderSession()
    }

    private fun currentElapsedSeconds(timerEnvelope: JSONObject?): Long {
        val plan = timerEnvelope?.optJSONObject("plan") ?: return 0
        val command = optimisticTimerCommand ?: timerEnvelope.optString("command", "start")
        val base = optimisticElapsedBase ?: plan.optLong("startOffsetSeconds", 0)
        val sentAt = optimisticSentAtEpochMs ?: timerEnvelope.optLong("sentAtEpochMs", System.currentTimeMillis())
        return base + if (command == "pause") 0 else max(0, (System.currentTimeMillis() - sentAt) / 1_000)
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

    private fun formatHeartRate(bpm: Int): String {
        val zone = heartRateZone(bpm)
        return if (zone == null) "$bpm BPM" else "$bpm BPM · Z$zone"
    }

    private fun heartRateZone(bpm: Int): Int? {
        val max = currentSession?.optInt("heartRateZoneMaxBpm", 0) ?: 0
        if (max <= 0) return null
        return when {
            bpm < max * .60 -> 1
            bpm < max * .70 -> 2
            bpm < max * .80 -> 3
            bpm < max * .90 -> 4
            else -> 5
        }
    }

    private fun sendWatchAction(action: String): Boolean {
        val source = currentSession ?: return false
        return runCatching {
            val actionId = UUID.randomUUID().toString()
            val payload = JSONObject()
                .put("actionId", actionId)
                .put("action", action)
                .put("workoutSequence", source.getInt("workoutSequence"))
                .put("sectionIndex", source.getInt("sectionIndex"))
                .apply {
                    if (action == "complete") {
                        val value = source.optJSONObject("timer")
                            ?.optJSONObject("manualProgress")
                            ?.optInt("value", 0) ?: 0
                        put("completedRounds", max(0, value + optimisticRoundDelta))
                    }
                }
                .toString()
            // A unique Data Item is durable: if the phone app or Bluetooth is
            // unavailable, Wear OS delivers the action after reconnection.
            val request = PutDataMapRequest.create("/hoots/workout-actions/$actionId").apply {
                dataMap.putString("payload", payload)
                dataMap.putLong("occurredAtEpochMs", System.currentTimeMillis())
            }.asPutDataRequest().setUrgent()
            Wearable.getDataClient(this).putDataItem(request)
            // The Data Item survives disconnection. This message gives a live
            // paired phone immediate controls; the shared actionId makes the
            // later durable delivery harmless.
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

    /** Reconnect after a process restart while an exercise we own continues. */
    private fun reconnectOwnedExercise() {
        val infoFuture = exerciseClient.getCurrentExerciseInfoAsync()
        infoFuture.addListener({
            val info = runCatching { infoFuture.get() }.getOrNull() ?: return@addListener
            if (info.exerciseTrackedStatus != ExerciseTrackedStatus.OWNED_EXERCISE_IN_PROGRESS) {
                return@addListener
            }
            exerciseClient.setUpdateCallback(exerciseCallback)
            startedAtElapsedMs = SystemClock.elapsedRealtime()
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
