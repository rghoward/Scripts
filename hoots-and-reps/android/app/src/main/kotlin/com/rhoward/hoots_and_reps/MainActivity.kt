package com.rhoward.hoots_and_reps

import android.app.Presentation
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import android.hardware.display.DisplayManager
import android.os.Bundle
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.os.SystemClock
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.net.Uri
import android.util.TypedValue
import android.view.Display
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.LinearLayout
import android.widget.FrameLayout
import android.widget.TextView
import android.text.SpannableString
import android.text.Spanned
import android.text.style.StyleSpan
import androidx.mediarouter.app.MediaRouteButton
import com.google.android.gms.cast.framework.CastButtonFactory
import com.google.android.gms.cast.framework.CastContext
import com.google.android.gms.cast.framework.CastSession
import com.google.android.gms.cast.framework.SessionManager
import com.google.android.gms.cast.framework.SessionManagerListener
import io.flutter.embedding.android.FlutterFragmentActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import kotlin.math.ceil

class MainActivity : FlutterFragmentActivity(), DisplayManager.DisplayListener, SessionManagerListener<CastSession> {
    companion object {
        const val CHANNEL = "com.rhoward.hoots_and_reps/external_display"
        const val CAST_NAMESPACE = "urn:x-cast:com.rhoward.hoots_and_reps"
        const val PAPER = 0xff070615.toInt()
        const val INK = 0xfff7f5ef.toInt()
        const val MUTED = 0xffada6c1.toInt()
        const val EMBER = 0xffffc44e.toInt()
        const val BORDER = 0xff8b69c9.toInt()
        const val EXTERNAL_DISPLAY_HEARTBEAT_MS = 25_000L
    }

    private lateinit var displayManager: DisplayManager
    private lateinit var castContext: CastContext
    private lateinit var castSessionManager: SessionManager
    private var channel: MethodChannel? = null
    private var presentation: WorkoutPresentation? = null
    private var shownTitle: String? = null
    private var shownSection: String? = null
    private var shownBody: String? = null
    private var shownSectionNumber = 0
    private var shownSectionCount = 0
    private var shownTimer: org.json.JSONObject? = null
    private var castCardPayload: String? = null
    private var castButton: MediaRouteButton? = null
    private val mainHandler = Handler(Looper.getMainLooper())
    private var restoreQueued = false
    private val externalDisplayHeartbeat = object : Runnable {
        override fun run() {
            val activePresentation = presentation
            if (shownBody == null || activePresentation?.isShowing != true) return
            // Pixels currently place USB-C displays in a distinct power group.
            // Reassert the request before its independent idle timer expires.
            activePresentation.nudgeDisplayAwake()
            mainHandler.postDelayed(this, EXTERNAL_DISPLAY_HEARTBEAT_MS)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        displayManager = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager
        displayManager.registerDisplayListener(this, null)
        castContext = CastContext.getSharedInstance(this)
        castSessionManager = castContext.sessionManager
        castSessionManager.addSessionManagerListener(this, CastSession::class.java)
    }

    override fun onDestroy() {
        mainHandler.removeCallbacksAndMessages(null)
        val previous = presentation
        presentation = null
        shownBody = null
        previous?.dismiss()
        displayManager.unregisterDisplayListener(this)
        castSessionManager.removeSessionManagerListener(this, CastSession::class.java)
        super.onDestroy()
    }

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        channel = MethodChannel(flutterEngine.dartExecutor.binaryMessenger, CHANNEL)
        channel?.setMethodCallHandler { call, result -> handleDisplayCall(call, result) }
    }

    private fun handleDisplayCall(call: MethodCall, result: MethodChannel.Result) {
        when (call.method) {
            "isAvailable" -> result.success(presentationDisplay() != null)
            "isCastConnected" -> result.success(currentCastSession()?.isConnected == true)
            "show" -> {
                shownTitle = call.argument<String>("workoutTitle")
                shownSection = call.argument<String>("sectionTitle")
                shownBody = call.argument<String>("body")
                shownSectionNumber = call.argument<Int>("sectionNumber") ?: 0
                shownSectionCount = call.argument<Int>("sectionCount") ?: 0
                shownTimer = timerPayload(call.argument<Map<*, *>>("timer"))
                val display = presentationDisplay()
                if (display == null) {
                    result.success(false)
                } else {
                    result.success(showPresentation(display))
                }
            }
            "hide" -> {
                val previous = presentation
                presentation = null
                shownTitle = null
                shownSection = null
                shownBody = null
                shownSectionNumber = 0
                shownSectionCount = 0
                previous?.dismiss()
                setExternalDisplayAwake(false)
                result.success(null)
            }
            "cast" -> {
                castCardPayload = workoutPayload(call)
                val session = currentCastSession()
                if (session?.isConnected == true) {
                    result.success(sendCastCard(session))
                } else {
                    showCastChooser()
                    result.success(false)
                }
            }
            "updateCastTimer" -> {
                val payload = castCardPayload
                if (payload != null) {
                    val updated = org.json.JSONObject(payload)
                    val timer = timerPayload(call.argument<Map<*, *>>("timer"))
                    if (timer == null) updated.remove("timer") else updated.put("timer", timer)
                    castCardPayload = updated.toString()
                    currentCastSession()?.let(::sendCastCard)
                }
                result.success(null)
            }
            "updateTimer" -> {
                // HDMI uses the exact timer envelope that is sent to Cast.
                // Keeping this separate from `show` lets an already-visible
                // presentation respond to start, pause, resume, and reset.
                shownTimer = timerPayload(call.argument<Map<*, *>>("timer"))
                presentation?.updateTimer(shownTimer)
                result.success(null)
            }
            "stopCasting" -> {
                castCardPayload = null
                castSessionManager.endCurrentSession(true)
                result.success(null)
            }
            else -> result.notImplemented()
        }
    }

    private fun workoutPayload(call: MethodCall): String = org.json.JSONObject().apply {
        put("type", "workoutCard")
        put("workoutTitle", call.argument<String>("workoutTitle").orEmpty())
        put("sectionTitle", call.argument<String>("sectionTitle").orEmpty())
        put("body", call.argument<String>("body").orEmpty())
        put("sectionNumber", call.argument<Int>("sectionNumber") ?: 0)
        put("sectionCount", call.argument<Int>("sectionCount") ?: 0)
        timerPayload(call.argument<Map<*, *>>("timer"))?.let { put("timer", it) }
    }.toString()

    private fun timerPayload(values: Map<*, *>?): org.json.JSONObject? = values?.let { map ->
        org.json.JSONObject().apply {
            map.forEach { (key, value) -> put(key.toString(), castJsonValue(value)) }
        }
    }

    // Flutter's StandardMessageCodec hands nested plans back as Maps and
    // Lists. Convert them explicitly so the custom Cast message remains JSON,
    // rather than serializing a Kotlin collection as a quoted string.
    private fun castJsonValue(value: Any?): Any? = when (value) {
        is Map<*, *> -> org.json.JSONObject().apply {
            value.forEach { (key, item) -> put(key.toString(), castJsonValue(item)) }
        }
        is Iterable<*> -> org.json.JSONArray().apply {
            value.forEach { put(castJsonValue(it)) }
        }
        else -> value
    }

    private fun currentCastSession(): CastSession? = castSessionManager.currentCastSession

    private fun showCastChooser() {
        // Use the Cast SDK's real, attached route button. Flutter owns the
        // visible layout, so this one-pixel transparent view only supplies the
        // Android route host; Flutter continues to render the actual icon.
        val button = castButton ?: MediaRouteButton(this).also { next ->
            next.alpha = 0f
            next.layoutParams = FrameLayout.LayoutParams(1, 1, Gravity.END or Gravity.TOP)
            (findViewById<ViewGroup>(android.R.id.content)).addView(next)
            CastButtonFactory.setUpMediaRouteButton(applicationContext, next)
            castButton = next
        }
        button.performClick()
    }

    private fun sendCastCard(session: CastSession): Boolean {
        val payload = castCardPayload ?: return false
        if (!session.isConnected) return false
        session.sendMessage(CAST_NAMESPACE, payload)
        return true
    }

    private fun notifyCastConnection() {
        channel?.invokeMethod(
            "castConnectionChanged",
            mapOf("connected" to (currentCastSession()?.isConnected == true)),
        )
    }

    override fun onSessionStarting(session: CastSession) = Unit

    override fun onSessionStarted(session: CastSession, sessionId: String) {
        sendCastCard(session)
        notifyCastConnection()
    }

    override fun onSessionStartFailed(session: CastSession, error: Int) = notifyCastConnection()

    override fun onSessionResuming(session: CastSession, sessionId: String) = Unit

    override fun onSessionResumed(session: CastSession, wasSuspended: Boolean) {
        sendCastCard(session)
        notifyCastConnection()
    }

    override fun onSessionResumeFailed(session: CastSession, error: Int) = notifyCastConnection()

    override fun onSessionEnding(session: CastSession) = Unit

    override fun onSessionEnded(session: CastSession, error: Int) = notifyCastConnection()

    override fun onSessionSuspended(session: CastSession, reason: Int) = notifyCastConnection()

    private fun presentationDisplay(): Display? = displayManager
        .getDisplays(DisplayManager.DISPLAY_CATEGORY_PRESENTATION)
        .firstOrNull()

    private fun showPresentation(display: Display): Boolean {
        try {
            if (presentation?.display?.displayId != display.displayId) {
                val previous = presentation
                presentation = null
                previous?.dismiss()
                val next = WorkoutPresentation(this, display)
                next.setOnDismissListener {
                    if (presentation !== next) return@setOnDismissListener
                    // Android can dismiss a Presentation while keeping the HDMI
                    // display connected. Restore the last selected card instead
                    // of leaving a black but connected external screen.
                    presentation = null
                    setExternalDisplayAwake(false)
                    restorePresentation()
                }
                presentation = next
            }
            if (presentation?.isShowing != true) presentation?.show()
            presentation?.update(
                shownTitle.orEmpty(), shownSection.orEmpty(), shownBody.orEmpty(),
                shownSectionNumber, shownSectionCount, shownTimer,
            )
            setExternalDisplayAwake(true)
            return true
        } catch (_: WindowManager.InvalidDisplayException) {
            // HDMI can disappear between discovery and show(). The display
            // listener will retry once Android reports the replacement display.
            presentation = null
            notifyAvailability()
            return false
        }
    }

    private fun notifyAvailability() {
        channel?.invokeMethod("displayChanged", mapOf("available" to (presentationDisplay() != null)))
    }

    private fun setExternalDisplayAwake(awake: Boolean) {
        if (awake) {
            window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
            mainHandler.removeCallbacks(externalDisplayHeartbeat)
            presentation?.nudgeDisplayAwake()
            mainHandler.postDelayed(externalDisplayHeartbeat, EXTERNAL_DISPLAY_HEARTBEAT_MS)
        } else {
            window.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
            mainHandler.removeCallbacks(externalDisplayHeartbeat)
        }
    }

    override fun onDisplayAdded(displayId: Int) {
        notifyAvailability()
        restorePresentation()
    }

    override fun onDisplayRemoved(displayId: Int) {
        if (presentation?.display?.displayId == displayId) {
            val previous = presentation
            presentation = null
            previous?.dismiss()
            setExternalDisplayAwake(false)
        }
        notifyAvailability()
    }

    override fun onDisplayChanged(displayId: Int) {
        notifyAvailability()
        if (presentationDisplay()?.displayId != displayId || shownBody == null) return
        if (presentation?.isShowing == true) {
            // Display-change callbacks also arrive for benign brightness and
            // refresh-rate changes. Redraw in place; dismissing here can leave
            // a real HDMI surface black even though the cable remains present.
            presentation?.refresh(
                shownTitle.orEmpty(), shownSection.orEmpty(), shownBody.orEmpty(),
                shownSectionNumber, shownSectionCount, shownTimer,
            )
        } else {
            restorePresentation()
        }
    }

    /** Recreate only after a true add/reconnect or an unexpected dismissal. */
    private fun restorePresentation() {
        if (shownBody == null || restoreQueued) return
        restoreQueued = true
        mainHandler.postDelayed({
            restoreQueued = false
            val display = presentationDisplay() ?: return@postDelayed
            if (presentation?.display?.displayId == display.displayId &&
                presentation?.isShowing == true) {
                presentation?.refresh(
                    shownTitle.orEmpty(), shownSection.orEmpty(), shownBody.orEmpty(),
                    shownSectionNumber, shownSectionCount, shownTimer,
                )
                return@postDelayed
            }
            val previous = presentation
            presentation = null
            previous?.dismiss()
            showPresentation(display)
        }, 350)
    }

    private class WorkoutPresentation(context: Context, display: Display) : Presentation(context, display) {
        private lateinit var workout: TextView
        private lateinit var section: TextView
        private lateinit var body: TextView
        private lateinit var footer: TextView
        private lateinit var timerStage: TextView
        private lateinit var timerCount: TextView
        private lateinit var timerLabel: TextView
        private val timerHandler = Handler(Looper.getMainLooper())
        private var activePlan: org.json.JSONObject? = null
        private var activePlanId = ""
        private var phaseIndex = 0
        private var phaseStartedAt = 0L
        private var pausedAt = 0L
        private var pausedElapsedMs = 0L
        private var finished = false
        private var lastPhaseId = ""
        private val cueBank = CueBank(context.applicationContext)
        private val timerTicker = object : Runnable {
            override fun run() {
                renderTimer()
                if (activePlan != null && !finished) timerHandler.postDelayed(this, 100)
            }
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            // The external monitor belongs to a separate Android power group.
            // Keeping only the phone Activity awake does not prevent this
            // Presentation's display group from timing out.
            window?.addFlags(
                WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON or
                    WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON,
            )
            val density = context.resources.displayMetrics.density
            fun px(value: Int) = (value * density).toInt()
            fun label(size: Float, color: Int, bold: Boolean = false) = TextView(context).apply {
                setTextColor(color)
                textSize = size
                if (bold) typeface = Typeface.DEFAULT_BOLD
            }
            val root = LinearLayout(context).apply {
                orientation = LinearLayout.VERTICAL
                setPadding(px(64), px(42), px(64), px(42))
            }
            workout = label(22f, BORDER, true).apply { letterSpacing = .08f }
            section = label(38f, EMBER, true).apply {
                maxLines = 1
                ellipsize = android.text.TextUtils.TruncateAt.END
                setPadding(0, px(15), 0, px(14))
            }
            val timerPanel = LinearLayout(context).apply {
                orientation = LinearLayout.VERTICAL
                gravity = Gravity.CENTER
                setPadding(px(18), px(10), px(18), px(12))
                setBackgroundColor(0xee100d25.toInt())
            }
            timerStage = label(16f, INK, true).apply { gravity = Gravity.CENTER; letterSpacing = .08f }
            timerCount = label(54f, 0xff58e5ff.toInt(), true).apply {
                gravity = Gravity.CENTER
                setShadowLayer(px(4).toFloat(), 0f, px(2).toFloat(), Color.BLACK)
            }
            timerLabel = label(19f, EMBER, true).apply { gravity = Gravity.CENTER; maxLines = 2 }
            timerPanel.addView(timerStage)
            timerPanel.addView(timerCount)
            timerPanel.addView(timerLabel)
            fun divider(top: Int = 0, bottom: Int = 0) = View(context).apply {
                setBackgroundColor(BORDER)
                layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    px(2),
                ).apply {
                    topMargin = px(top)
                    bottomMargin = px(bottom)
                }
            }
            body = label(42f, INK).apply {
                gravity = Gravity.CENTER_VERTICAL
                includeFontPadding = false
                setLineSpacing(px(4).toFloat(), 1.08f)
                maxLines = Int.MAX_VALUE
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    // The weighted body has an exact measured height. Android
                    // can therefore choose the largest text size that fits all
                    // of its lines instead of relying on a character estimate.
                    setAutoSizeTextTypeUniformWithConfiguration(
                        14,
                        180,
                        1,
                        TypedValue.COMPLEX_UNIT_SP,
                    )
                }
                layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    0,
                    1f,
                )
            }
            footer = label(12f, MUTED, true).apply {
                gravity = Gravity.CENTER_HORIZONTAL
                letterSpacing = .06f
                setPadding(0, px(12), 0, 0)
            }
            root.addView(workout)
            root.addView(divider(top = 10, bottom = 2))
            root.addView(section)
            root.addView(timerPanel, LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT).apply { bottomMargin = px(12) })
            root.addView(divider(bottom = 12))
            root.addView(body)
            root.addView(divider(top = 12))
            root.addView(footer)
            val frame = FrameLayout(context).apply { setBackgroundColor(PAPER) }
            frame.addView(StarfieldBackdrop(context))
            frame.addView(root)
            setContentView(frame)
        }

        override fun onStop() {
            timerHandler.removeCallbacksAndMessages(null)
            cueBank.release()
            super.onStop()
        }

        fun update(
            workoutTitle: String,
            sectionTitle: String,
            sectionBody: String,
            sectionNumber: Int,
            sectionCount: Int,
            timer: org.json.JSONObject? = null,
        ) {
            if (!::workout.isInitialized) return
            workout.text = workoutTitle.uppercase()
            section.text = sectionTitle
            body.text = emphasizedLoads(sectionBody)
            updateTimer(timer)
            footer.text = if (sectionNumber > 0 && sectionCount > 0) {
                "DAY CARD $sectionNumber / $sectionCount  •  HOOTS & REPS"
            } else {
                "HOOTS & REPS  •  CONTROLLED FROM YOUR DEVICE"
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                // Let short cards become genuinely readable at a distance,
                // while content-heavy cards retain a sensible ceiling before
                // Android performs its exact width/height fit calculation.
                body.setAutoSizeTextTypeUniformWithConfiguration(
                    14,
                    bodyTextSize(sectionBody).toInt(),
                    1,
                    TypedValue.COMPLEX_UNIT_SP,
                )
            } else {
                body.textSize = bodyTextSize(sectionBody)
            }
        }

        fun refresh(
            workoutTitle: String,
            sectionTitle: String,
            sectionBody: String,
            sectionNumber: Int,
            sectionCount: Int,
            timer: org.json.JSONObject? = null,
        ) {
            update(workoutTitle, sectionTitle, sectionBody, sectionNumber, sectionCount, timer)
            window?.decorView?.apply {
                requestLayout()
                invalidate()
            }
        }

        fun updateTimer(timer: org.json.JSONObject?) {
            if (!::timerStage.isInitialized) return
            if (timer == null) {
                activePlan = null
                timerHandler.removeCallbacks(timerTicker)
                timerStage.visibility = View.GONE
                timerCount.visibility = View.GONE
                timerLabel.visibility = View.GONE
                return
            }
            val plan = timer.optJSONObject("plan")
            if (plan != null && (plan.optString("id") != activePlanId || timer.optString("command") == "reset")) {
                startPlan(plan)
            }
            when (timer.optString("command")) {
                "pause" -> if (activePlan != null && pausedAt == 0L) {
                    pausedElapsedMs = elapsedMs()
                    pausedAt = SystemClock.elapsedRealtime()
                }
                "resume", "start" -> if (activePlan != null && pausedAt != 0L) {
                    phaseStartedAt = SystemClock.elapsedRealtime() - pausedElapsedMs
                    pausedAt = 0L
                }
            }
            renderTimer()
        }

        private fun startPlan(plan: org.json.JSONObject) {
            activePlan = plan
            activePlanId = plan.optString("id")
            phaseIndex = 0
            var offset = plan.optDouble("startOffsetSeconds", 0.0)
            val phases = plan.optJSONArray("phases") ?: return
            while (phaseIndex < phases.length() - 1) {
                val duration = phases.optJSONObject(phaseIndex)?.optDouble("durationSeconds", 0.0) ?: 0.0
                if (offset < duration) break
                offset -= duration
                phaseIndex++
            }
            phaseStartedAt = SystemClock.elapsedRealtime() - (offset * 1000).toLong()
            pausedAt = 0L
            pausedElapsedMs = 0L
            finished = false
            lastPhaseId = ""
            cueBank.preload()
            timerHandler.removeCallbacks(timerTicker)
            timerHandler.post(timerTicker)
        }

        private fun currentPhase(): org.json.JSONObject? = activePlan
            ?.optJSONArray("phases")?.optJSONObject(phaseIndex)

        private fun elapsedMs(): Long = if (pausedAt != 0L) pausedElapsedMs else
            (SystemClock.elapsedRealtime() - phaseStartedAt).coerceAtLeast(0L)

        private fun renderTimer() {
            val phase = currentPhase() ?: return
            var current = phase
            while (pausedAt == 0L && elapsedMs() >= (current.optDouble("durationSeconds") * 1000).toLong() && !finished) {
                val carry = elapsedMs() - (current.optDouble("durationSeconds") * 1000).toLong()
                phaseIndex++
                current = currentPhase() ?: run {
                    finished = true
                    cueBank.play(activePlan?.optString("completionCue", "complete") ?: "complete")
                    timerStage.text = "COMPLETE"
                    timerCount.text = "✓"
                    timerLabel.text = activePlan?.optString("completionLabel", "TIMER COMPLETE")
                    return
                }
                phaseStartedAt = SystemClock.elapsedRealtime() - carry.coerceAtLeast(0L)
                pausedElapsedMs = 0L
            }
            val remaining = ((current.optDouble("durationSeconds") * 1000 - elapsedMs()).coerceAtLeast(0.0) / 1000.0)
            val kind = current.optString("kind")
            timerStage.text = when {
                pausedAt != 0L -> "PAUSED"
                kind == "ready" -> "GET READY"
                kind == "transition" -> "TRANSITION"
                kind == "sideChange" -> "SWITCH SIDES"
                kind == "emom" -> "ROUND ${current.optInt("round")} / ${current.optInt("roundCount")}"
                kind == "work" -> "WORK"
                kind == "rest" -> "REST"
                else -> "TIMER RUNNING"
            }
            val seconds = ceil(remaining).toInt()
            timerCount.text = "%d:%02d".format(seconds / 60, seconds % 60)
            timerLabel.text = if (kind == "emom" || kind == "active" || kind == "sideChange")
                "NOW • ${current.optString("label")}" else current.optString("label")
            val phaseId = current.optString("id")
            if (phaseId != lastPhaseId && pausedAt == 0L) {
                lastPhaseId = phaseId
                when (kind) {
                    "transition" -> cueBank.play("transition")
                    "sideChange" -> cueBank.play("switch-sides")
                    "ready" -> Unit
                    else -> cueBank.play("go")
                }
            }
            // The 3-2-1 recording is started exactly at the visible three.
            if (kind == "ready" && seconds == 3 && pausedAt == 0L) cueBank.play("ready-countdown")
        }

        private class CueBank(private val context: Context) {
            private val base = "https://noisy-fog-413c.rghoward1988.workers.dev/"
            private val players = mutableMapOf<String, MediaPlayer>()
            private val prepared = mutableSetOf<String>()
            private var lastReadyAt = 0L
            fun preload() = listOf("go", "transition", "switch-sides", "ready-countdown", "emom-countdown", "complete", "conditioning-complete", "strength-complete", "skills-complete", "accessory-complete", "warmup-complete", "stretches-complete").forEach(::load)
            private fun load(name: String) {
                if (players.containsKey(name)) return
                runCatching {
                    MediaPlayer().apply {
                        setAudioAttributes(AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_MEDIA).setContentType(AudioAttributes.CONTENT_TYPE_SPEECH).build())
                        setDataSource(context, Uri.parse("${base}timer-$name.mp3"))
                        setOnPreparedListener { prepared.add(name) }
                        prepareAsync()
                        players[name] = this
                    }
                }
            }
            fun play(name: String) {
                if (name == "ready-countdown") {
                    val now = SystemClock.elapsedRealtime(); if (now - lastReadyAt < 4000) return; lastReadyAt = now
                }
                load(name)
                val player = players[name] ?: return
                if (!prepared.contains(name) || player.isPlaying) return
                runCatching { player.seekTo(0); player.start() }
            }
            fun release() { players.values.forEach { runCatching { it.release() } }; players.clear(); prepared.clear() }
        }

        /**
         * Pixel's HDMI display can ignore a passive KEEP_SCREEN_ON request
         * after its own idle timeout. Refreshing the external window's wake
         * request keeps the presentation's separate display group interactive.
         */
        fun nudgeDisplayAwake() {
            window?.let { presentationWindow ->
                presentationWindow.decorView?.keepScreenOn = true
                presentationWindow.clearFlags(WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON)
                presentationWindow.addFlags(
                    WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON or
                        WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON,
                )
            }
        }

        /** Uses the available display real estate for short cards while
         * keeping dense conditioning instructions comfortably readable. */
        private fun bodyTextSize(text: String): Float {
            val visibleLines = text.lines().sumOf { line ->
                maxOf(1, (line.trim().length + 37) / 38)
            }
            return when {
                visibleLines <= 2 -> 180f
                visibleLines <= 4 -> 160f
                visibleLines <= 7 -> 136f
                visibleLines <= 11 -> 110f
                visibleLines <= 16 -> 86f
                visibleLines <= 24 -> 68f
                else -> 52f
            }
        }

        private fun emphasizedLoads(text: String): SpannableString {
            val styled = SpannableString(text)
            val loadPattern = Regex("(?:—\\s*)?\\d+(?:\\.\\d+)?\\s*(?:lb|lbs|pounds?)\\b", RegexOption.IGNORE_CASE)
            loadPattern.findAll(text).forEach { match ->
                styled.setSpan(
                    StyleSpan(Typeface.BOLD), match.range.first, match.range.last + 1,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE,
                )
            }
            return styled
        }

        private class StarfieldBackdrop(context: Context) : View(context) {
            private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply { color = 0xff20183a.toInt() }

            override fun onDraw(canvas: Canvas) {
                super.onDraw(canvas)
                val width = width.toFloat()
                val height = height.toFloat()
                repeat(42) { index ->
                    val x = width * ((index * 37 % 97) + 2) / 100f
                    val y = height * ((index * 61 % 89) + 5) / 100f
                    paint.alpha = if (index % 7 == 0) 150 else 80
                    canvas.drawCircle(x, y, if (index % 7 == 0) 2.2f else 1.1f, paint)
                }
            }
        }
    }
}
