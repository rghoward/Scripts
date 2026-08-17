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
    val tracker: String = "",
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
        fun control(x: Float, symbol: String, enabled: Boolean, caption: String) {
            paint.style = Paint.Style.FILL; paint.color = if (enabled) SURFACE else DIM_SURFACE
            canvas.drawCircle(x, size * .78f, size * .07f, paint)
            paint.style = Paint.Style.STROKE; paint.strokeWidth = size * .006f; paint.color = if (enabled) GOLD else DIM
            canvas.drawCircle(x, size * .78f, size * .07f, paint)
            paint.style = Paint.Style.FILL
            labelAt(symbol, x, size * .797f, size * .05f, if (enabled) INK else DIM, true)
            labelAt(caption, x, size * .89f, size * .02f, if (enabled) MUTED else DIM)
        }

        labelAt("HOOTS & REPS", size * .36f, size * .12f, size * .03f, GOLD, true)
        labelAt("HR  ${state.heartRate}", size * .68f, size * .12f, size * .023f, MUTED, true)
        label(trimmed(state.phase.uppercase(), 19), size * .255f, size * .05f, INK, true)
        label(state.timer, size * .455f, size * .165f, INK, true)
        label(trimmed(state.detail, 31), size * .515f, size * .034f, MUTED)
        if (state.tracker.isNotBlank()) {
            paint.style = Paint.Style.FILL; paint.color = SURFACE
            canvas.drawRoundRect(RectF(size * .24f, size * .555f, size * .76f, size * .62f), size * .035f, size * .035f, paint)
            paint.style = Paint.Style.STROKE; paint.strokeWidth = size * .005f; paint.color = GOLD
            canvas.drawRoundRect(RectF(size * .24f, size * .555f, size * .76f, size * .62f), size * .035f, size * .035f, paint)
            paint.style = Paint.Style.FILL
            label(trimmed(state.tracker, 23), size * .598f, size * .031f, GOLD, true)
        }
        control(size * .28f, "−", state.canAdvance, "UNDO")
        control(cx, if (state.primaryLabel == "PAUSE") "||" else "▶", true, state.primaryLabel)
        control(size * .72f, "+", state.canAdvance, "NEXT")
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        if (event.action != MotionEvent.ACTION_UP) return true
        val size = min(width, height).toFloat()
        val controlY = size * .78f
        val hitRadius = size * .11f
        if (event.y >= controlY - hitRadius) {
            when {
                event.x < size * .4f -> onPrevious?.invoke()
                event.x > size * .6f -> onNext?.invoke()
                else -> onPrimary?.invoke()
            }
        } else {
            onPrimary?.invoke()
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
    }
}
