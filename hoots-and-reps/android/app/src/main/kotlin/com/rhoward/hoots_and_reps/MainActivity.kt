package com.rhoward.hoots_and_reps

import android.app.Presentation
import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.hardware.display.DisplayManager
import android.os.Bundle
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.util.TypedValue
import android.view.Display
import android.view.Gravity
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.LinearLayout
import android.widget.TextView
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel

class MainActivity : FlutterActivity(), DisplayManager.DisplayListener {
    private companion object {
        const val CHANNEL = "com.rhoward.hoots_and_reps/external_display"
        const val PAPER = 0xff070615.toInt()
        const val INK = 0xfff7f5ef.toInt()
        const val MUTED = 0xffada6c1.toInt()
        const val EMBER = 0xffffc44e.toInt()
        const val BORDER = 0xff4b3a78.toInt()
    }

    private lateinit var displayManager: DisplayManager
    private var channel: MethodChannel? = null
    private var presentation: WorkoutPresentation? = null
    private var shownTitle: String? = null
    private var shownSection: String? = null
    private var shownBody: String? = null
    private val mainHandler = Handler(Looper.getMainLooper())
    private var restoreQueued = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        displayManager = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager
        displayManager.registerDisplayListener(this, null)
    }

    override fun onDestroy() {
        mainHandler.removeCallbacksAndMessages(null)
        val previous = presentation
        presentation = null
        shownBody = null
        previous?.dismiss()
        displayManager.unregisterDisplayListener(this)
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
            "show" -> {
                shownTitle = call.argument<String>("workoutTitle")
                shownSection = call.argument<String>("sectionTitle")
                shownBody = call.argument<String>("body")
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
                previous?.dismiss()
                setExternalDisplayAwake(false)
                result.success(null)
            }
            else -> result.notImplemented()
        }
    }

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
            presentation?.update(shownTitle.orEmpty(), shownSection.orEmpty(), shownBody.orEmpty())
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
        } else {
            window.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
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
            presentation?.refresh(shownTitle.orEmpty(), shownSection.orEmpty(), shownBody.orEmpty())
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
                presentation?.refresh(shownTitle.orEmpty(), shownSection.orEmpty(), shownBody.orEmpty())
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

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            // The external monitor belongs to a separate Android power group.
            // Keeping only the phone Activity awake does not prevent this
            // Presentation's display group from timing out.
            window?.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
            val density = context.resources.displayMetrics.density
            fun px(value: Int) = (value * density).toInt()
            fun label(size: Float, color: Int, bold: Boolean = false) = TextView(context).apply {
                setTextColor(color)
                textSize = size
                if (bold) typeface = Typeface.DEFAULT_BOLD
            }
            val root = LinearLayout(context).apply {
                orientation = LinearLayout.VERTICAL
                setBackgroundColor(PAPER)
                setPadding(px(64), px(42), px(64), px(42))
            }
            workout = label(18f, EMBER, true).apply { letterSpacing = .08f }
            section = label(38f, INK, true).apply {
                maxLines = 1
                ellipsize = android.text.TextUtils.TruncateAt.END
                setPadding(0, px(12), 0, px(14))
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
                        12,
                        74,
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
            val footer = label(12f, MUTED, true).apply {
                gravity = Gravity.CENTER_HORIZONTAL
                text = "HOOTS & REPS  •  CONTROLLED FROM YOUR DEVICE"
                letterSpacing = .06f
                setPadding(0, px(12), 0, 0)
            }
            root.addView(workout)
            root.addView(section)
            root.addView(body)
            root.addView(footer)
            setContentView(root)
        }

        fun update(workoutTitle: String, sectionTitle: String, sectionBody: String) {
            if (!::workout.isInitialized) return
            workout.text = workoutTitle.uppercase()
            section.text = sectionTitle
            body.text = sectionBody
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
                body.textSize = bodyTextSize(sectionBody)
            }
        }

        fun refresh(workoutTitle: String, sectionTitle: String, sectionBody: String) {
            update(workoutTitle, sectionTitle, sectionBody)
            window?.decorView?.apply {
                requestLayout()
                invalidate()
            }
        }

        /** Uses the available display real estate for short cards while
         * keeping dense conditioning instructions comfortably readable. */
        private fun bodyTextSize(text: String): Float {
            val visibleLines = text.lines().sumOf { line ->
                maxOf(1, (line.trim().length + 37) / 38)
            }
            return when {
                visibleLines <= 3 -> 66f
                visibleLines <= 5 -> 56f
                visibleLines <= 8 -> 46f
                visibleLines <= 12 -> 37f
                visibleLines <= 18 -> 30f
                else -> 24f
            }
        }
    }
}
