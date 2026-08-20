package com.rhoward.hoots_and_reps.wear

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.Typeface
import android.view.MotionEvent
import android.view.View
import kotlin.math.min

data class WatchFaceState(
    val phase: String = "OPEN A WORKOUT",
    val timer: String = "—",
    val detail: String = "Choose a section on your phone",
    val heartRate: String = "— BPM",
    val heartRateZone: Int? = null,
    val tracker: String = "",
    val roundActionLabel: String = "✓  ROUND",
    val primaryLabel: String = "OPEN",
    val canAdvance: Boolean = false,
)

/** Draws against the actual round viewport instead of hoping a vertical
 * Android layout happens to fit inside it. */
class RoundWorkoutView(context: Context) : View(context) {
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var state = WatchFaceState()
    var onPrimary: (() -> Unit)? = null
    var onPrevious: (() -> Unit)? = null
    var onNext: (() -> Unit)? = null

    fun render(value: WatchFaceState) {
        state = value
        contentDescription = "${value.phase}. ${value.timer}. ${value.tracker}"
        invalidate()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val width = width.toFloat()
        val height = height.toFloat()
        val size = min(width, height)
        val cx = width / 2f
        paint.color = PAPER
        canvas.drawRect(0f, 0f, width, height, paint)

        fun label(text: String, y: Float, textSize: Float, color: Int, bold: Boolean = false) {
            paint.color = color; paint.textSize = textSize; paint.typeface = if (bold) Typeface.DEFAULT_BOLD else Typeface.DEFAULT
            paint.textAlign = Paint.Align.CENTER
            canvas.drawText(text, cx, y, paint)
        }
        fun labelAt(text: String, x: Float, y: Float, textSize: Float, color: Int, bold: Boolean = false) {
            paint.color = color; paint.textSize = textSize; paint.typeface = if (bold) Typeface.DEFAULT_BOLD else Typeface.DEFAULT
            paint.textAlign = Paint.Align.CENTER
            canvas.drawText(text, x, y, paint)
        }
        fun trimmed(text: String, max: Int) = if (text.length > max) "${text.take(max - 1)}…" else text

        labelAt(state.heartRate, cx, size * .13f, size * .07f, heartRateColor(state.heartRateZone), true)
        label(trimmed(state.phase.uppercase(), 17), size * .25f, size * .06f, INK, true)
        label(state.timer, size * .44f, size * .18f, INK, true)
        label(trimmed(state.detail, 24), size * .525f, size * .045f, MUTED, true)
        if (state.tracker.isNotBlank()) {
            label(trimmed(state.tracker, 22), size * .60f, size * .046f, GOLD, true)
        }
        // Round controls are contextual. A quiet, uncluttered watch face is
        // safer than showing disabled controls for sections that do not count.
        if (state.canAdvance) {
            val roundControls = RectF(size * .14f, size * .64f, size * .86f, size * .84f)
            paint.style = Paint.Style.FILL; paint.color = SURFACE
            canvas.drawRoundRect(roundControls, size * .065f, size * .065f, paint)
            paint.style = Paint.Style.STROKE; paint.strokeWidth = size * .007f; paint.color = GOLD
            canvas.drawRoundRect(roundControls, size * .065f, size * .065f, paint)
            paint.color = DIM; paint.strokeWidth = size * .004f
            canvas.drawLine(size * .47f, size * .67f, size * .47f, size * .81f, paint)
            paint.style = Paint.Style.FILL
            labelAt("↶", size * .305f, size * .765f, size * .082f, INK, true)
            labelAt(if (state.roundActionLabel == "FINISH") "✓" else "+", size * .665f, size * .765f, size * .09f, ZONE_2, true)
        }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        if (event.action != MotionEvent.ACTION_UP) return true
        val size = min(width, height).toFloat()
        val hasRoundControls = state.canAdvance
        when {
            event.x >= size * .18f && event.x <= size * .82f &&
                event.y >= size * .27f && event.y <= size * .50f -> onPrimary?.invoke()
            hasRoundControls && event.x >= size * .14f && event.x <= size * .47f &&
                event.y >= size * .64f && event.y <= size * .84f -> onPrevious?.invoke()
            hasRoundControls && event.x >= size * .47f && event.x <= size * .86f &&
                event.y >= size * .64f && event.y <= size * .84f -> onNext?.invoke()
        }
        return true
    }

    companion object {
        private const val PAPER = 0xff070615.toInt()
        private const val SURFACE = 0xff17122b.toInt()
        private const val DIM_SURFACE = 0xff100d1d.toInt()
        private const val INK = 0xfff7f5ef.toInt()
        private const val MUTED = 0xffada6c1.toInt()
        private const val DIM = 0xff555064.toInt()
        private const val GOLD = 0xffffc44e.toInt()
        private const val ZONE_1 = 0xff56d7ff.toInt()
        private const val ZONE_2 = 0xff70e0a1.toInt()
        private const val ZONE_3 = GOLD
        private const val ZONE_4 = 0xffff963f.toInt()
        private const val ZONE_5 = 0xffff5c73.toInt()
    }

    private fun heartRateColor(zone: Int?): Int = when (zone) {
        1 -> ZONE_1
        2 -> ZONE_2
        3 -> ZONE_3
        4 -> ZONE_4
        5 -> ZONE_5
        else -> MUTED
    }
}
