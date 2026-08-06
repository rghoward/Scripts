package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.b;
import com.hwpo_training_app.R;
import defpackage.lh8;
import defpackage.n6b;
import defpackage.pu2;
import defpackage.xl7;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends View implements e {
    public final Paint A;
    public final Paint B;
    public final Paint C;
    public final Drawable D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final StringBuilder N;
    public final Formatter O;
    public final pu2 P;
    public final CopyOnWriteArraySet<e.a> Q;
    public final Point R;
    public final float S;
    public int T;
    public long U;
    public int V;
    public Rect W;
    public final ValueAnimator a0;
    public float b0;
    public boolean c0;
    public boolean d0;
    public long e0;
    public long f0;
    public long g0;
    public long h0;
    public int i0;
    public long[] j0;
    public boolean[] k0;
    public final Rect t;
    public final Rect u;
    public final Rect v;
    public final Rect w;
    public final Paint x;
    public final Paint y;
    public final Paint z;

    /* JADX WARN: Type inference failed for: r1v4, types: [pu2] */
    public b(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        Paint paint = new Paint();
        this.x = paint;
        Paint paint2 = new Paint();
        this.y = paint2;
        Paint paint3 = new Paint();
        this.z = paint3;
        Paint paint4 = new Paint();
        this.A = paint4;
        Paint paint5 = new Paint();
        this.B = paint5;
        Paint paint6 = new Paint();
        this.C = paint6;
        paint6.setAntiAlias(true);
        this.Q = new CopyOnWriteArraySet<>();
        this.R = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.S = f;
        this.M = c(f, -50);
        int iC = c(f, 4);
        int iC2 = c(f, 26);
        int iC3 = c(f, 4);
        int iC4 = c(f, 12);
        int iC5 = c(f, 0);
        int iC6 = c(f, 16);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, lh8.b, 0, R.style.ExoStyledControls_TimeBar);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.D = drawable;
                if (drawable != null) {
                    drawable.setLayoutDirection(getLayoutDirection());
                    iC2 = Math.max(drawable.getMinimumHeight(), iC2);
                }
                this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iC);
                this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iC2);
                this.G = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iC3);
                this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iC4);
                this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iC5);
                this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iC6);
                int i = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i2 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i3 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i4 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i5 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i6 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i);
                paint6.setColor(i2);
                paint2.setColor(i3);
                paint3.setColor(i4);
                paint4.setColor(i5);
                paint5.setColor(i6);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.E = iC;
            this.F = iC2;
            this.G = 0;
            this.H = iC3;
            this.I = iC4;
            this.J = iC5;
            this.K = iC6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.D = null;
        }
        StringBuilder sb = new StringBuilder();
        this.N = sb;
        this.O = new Formatter(sb, Locale.getDefault());
        this.P = new Runnable() { // from class: pu2
            @Override // java.lang.Runnable
            public final void run() {
                this.t.f(false);
            }
        };
        Drawable drawable2 = this.D;
        if (drawable2 != null) {
            this.L = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.L = (Math.max(this.J, Math.max(this.I, this.K)) + 1) / 2;
        }
        this.b0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.a0 = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qu2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                b bVar = this.a;
                bVar.b0 = fFloatValue;
                bVar.invalidate(bVar.t);
            }
        });
        this.f0 = -9223372036854775807L;
        this.U = -9223372036854775807L;
        this.T = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int c(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.U;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f0;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.T);
    }

    private String getProgressText() {
        return n6b.B(this.N, this.O, this.g0);
    }

    private long getScrubberPosition() {
        Rect rect = this.u;
        if (rect.width() <= 0 || this.f0 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.w.width()) * this.f0) / ((long) rect.width());
    }

    @Override // androidx.media3.ui.e
    public final void a(e.a aVar) {
        aVar.getClass();
        this.Q.add(aVar);
    }

    @Override // androidx.media3.ui.e
    public final void b(long[] jArr, boolean[] zArr, int i) {
        xl7.g(i == 0 || !(jArr == null || zArr == null));
        this.i0 = i;
        this.j0 = jArr;
        this.k0 = zArr;
        g();
    }

    public final boolean d(long j) {
        long j2 = this.f0;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.d0 ? this.e0 : this.g0;
        long j4 = n6b.j(j3 + j, 0L, j2);
        if (j4 == j3) {
            return false;
        }
        if (this.d0) {
            h(j4);
        } else {
            e(j4);
        }
        g();
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.D;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e(long j) {
        this.e0 = j;
        this.d0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<e.a> it = this.Q.iterator();
        while (it.hasNext()) {
            it.next().q(j);
        }
    }

    public final void f(boolean z) {
        removeCallbacks(this.P);
        this.d0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<e.a> it = this.Q.iterator();
        while (it.hasNext()) {
            it.next().v(this.e0, z);
        }
    }

    public final void g() {
        Rect rect = this.v;
        Rect rect2 = this.u;
        rect.set(rect2);
        Rect rect3 = this.w;
        rect3.set(rect2);
        long j = this.d0 ? this.e0 : this.g0;
        if (this.f0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.h0) / this.f0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.f0)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.t);
    }

    @Override // androidx.media3.ui.e
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.u.width() / this.S);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.f0;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / ((long) iWidth);
    }

    public final void h(long j) {
        if (this.e0 == j) {
            return;
        }
        this.e0 = j;
        Iterator<e.a> it = this.Q.iterator();
        while (it.hasNext()) {
            it.next().p(j);
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.D;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        canvas.save();
        Rect rect = this.u;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i2 = iCenterY + iHeight;
        long j = this.f0;
        Paint paint = this.z;
        Rect rect2 = this.w;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i2, paint);
        } else {
            Rect rect3 = this.v;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (iMax < i5) {
                canvas.drawRect(iMax, iCenterY, i5, i2, paint);
            }
            int iMax2 = Math.max(i3, rect2.right);
            if (i4 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i4, i2, this.y);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i2, this.x);
            }
            if (this.i0 != 0) {
                long[] jArr = this.j0;
                jArr.getClass();
                boolean[] zArr = this.k0;
                zArr.getClass();
                int i6 = this.H;
                int i7 = i6 / 2;
                int i8 = 0;
                int i9 = 0;
                while (i9 < this.i0) {
                    int iMin = Math.min(rect.width() - i6, Math.max(i8, ((int) ((((long) rect.width()) * n6b.j(jArr[i9], 0L, this.f0)) / this.f0)) - i7)) + rect.left;
                    int i10 = i9;
                    canvas.drawRect(iMin, iCenterY, iMin + i6, i2, zArr[i9] ? this.B : this.A);
                    i9 = i10 + 1;
                    i8 = i8;
                }
            }
            canvas2 = canvas;
        }
        if (this.f0 > 0) {
            int i11 = n6b.i(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.D;
            if (drawable == null) {
                if (this.d0 || isFocused()) {
                    i = this.K;
                } else {
                    i = isEnabled() ? this.I : this.J;
                }
                canvas2.drawCircle(i11, iCenterY2, (int) ((i * this.b0) / 2.0f), this.C);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.b0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.b0)) / 2;
                drawable.setBounds(i11 - intrinsicWidth, iCenterY2 - intrinsicHeight, i11 + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.d0 || z) {
            return;
        }
        f(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f0 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (d(positionIncrement)) {
                            pu2 pu2Var = this.P;
                            removeCallbacks(pu2Var);
                            postDelayed(pu2Var, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (d(positionIncrement)) {
                            pu2 pu2Var2 = this.P;
                            removeCallbacks(pu2Var2);
                            postDelayed(pu2Var2, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.d0) {
                            f(false);
                            return true;
                        }
                        break;
                }
            } else if (this.d0) {
                f(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.c0 ? 0 : this.L;
        int i8 = this.G;
        int i9 = this.E;
        int i10 = this.F;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect2 = this.t;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.u.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (Build.VERSION.SDK_INT >= 29 && ((rect = this.W) == null || rect.width() != i5 || this.W.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.W = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        g();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.F;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.D;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.D;
        if (drawable == null || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f0 > 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Point point = this.R;
            point.set(x, y);
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.u;
            Rect rect2 = this.w;
            if (action == 0) {
                int i3 = i;
                if (this.t.contains(i3, i2)) {
                    rect2.right = n6b.i(i3, rect.left, rect.right);
                    e(getScrubberPosition());
                    g();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.d0) {
                    f(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.d0) {
                        f(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.d0) {
                if (i2 < this.M) {
                    int i4 = this.V;
                    rect2.right = n6b.i(((i - i4) / 3) + i4, rect.left, rect.right);
                } else {
                    this.V = i;
                    rect2.right = n6b.i(i, rect.left, rect.right);
                }
                h(getScrubberPosition());
                g();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f0 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (d(-getPositionIncrement())) {
                f(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (d(getPositionIncrement())) {
                f(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.A.setColor(i);
        invalidate(this.t);
    }

    public void setBufferedColor(int i) {
        this.y.setColor(i);
        invalidate(this.t);
    }

    @Override // androidx.media3.ui.e
    public void setBufferedPosition(long j) {
        if (this.h0 == j) {
            return;
        }
        this.h0 = j;
        g();
    }

    @Override // androidx.media3.ui.e
    public void setDuration(long j) {
        if (this.f0 == j) {
            return;
        }
        this.f0 = j;
        if (this.d0 && j == -9223372036854775807L) {
            f(true);
        }
        g();
    }

    @Override // android.view.View, androidx.media3.ui.e
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.d0 || z) {
            return;
        }
        f(true);
    }

    public void setKeyCountIncrement(int i) {
        xl7.g(i > 0);
        this.T = i;
        this.U = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        xl7.g(j > 0);
        this.T = -1;
        this.U = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.B.setColor(i);
        invalidate(this.t);
    }

    public void setPlayedColor(int i) {
        this.x.setColor(i);
        invalidate(this.t);
    }

    @Override // androidx.media3.ui.e
    public void setPosition(long j) {
        if (this.g0 == j) {
            return;
        }
        this.g0 = j;
        setContentDescription(getProgressText());
        g();
    }

    public void setScrubberColor(int i) {
        this.C.setColor(i);
        invalidate(this.t);
    }

    public void setUnplayedColor(int i) {
        this.z.setColor(i);
        invalidate(this.t);
    }
}
