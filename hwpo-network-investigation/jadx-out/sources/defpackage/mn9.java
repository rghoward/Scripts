package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class mn9 extends FrameLayout {
    private final Paint mContentPaint;
    private final ln9 mShimmerDrawable;
    private boolean mShowShimmer;

    public mn9(Context context) {
        super(context);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new ln9();
        this.mShowShimmer = true;
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        jn9.b aVar;
        setWillNotDraw(false);
        this.mShimmerDrawable.setCallback(this);
        if (attributeSet == null) {
            setShimmer(new jn9.a().a());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ah8.a, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(4) && typedArrayObtainStyledAttributes.getBoolean(4, false)) {
                aVar = new jn9.c();
                aVar.a.p = false;
            } else {
                aVar = new jn9.a();
            }
            setShimmer(aVar.b(typedArrayObtainStyledAttributes).a());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.mShowShimmer) {
            this.mShimmerDrawable.draw(canvas);
        }
    }

    public void hideShimmer() {
        if (this.mShowShimmer) {
            stopShimmer();
            this.mShowShimmer = false;
            invalidate();
        }
    }

    public boolean isShimmerStarted() {
        ValueAnimator valueAnimator = this.mShimmerDrawable.e;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public boolean isShimmerVisible() {
        return this.mShowShimmer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mShimmerDrawable.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopShimmer();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.mShimmerDrawable.setBounds(0, 0, getWidth(), getHeight());
    }

    public mn9 setShimmer(jn9 jn9Var) {
        boolean zIsStarted;
        ln9 ln9Var = this.mShimmerDrawable;
        ln9Var.f = jn9Var;
        if (jn9Var != null) {
            ln9Var.b.setXfermode(new PorterDuffXfermode(ln9Var.f.p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        ln9Var.b();
        if (ln9Var.f != null) {
            ValueAnimator valueAnimator = ln9Var.e;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                ln9Var.e.cancel();
                ln9Var.e.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            jn9 jn9Var2 = ln9Var.f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (jn9Var2.t / jn9Var2.s) + 1.0f);
            ln9Var.e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatMode(ln9Var.f.r);
            ln9Var.e.setRepeatCount(ln9Var.f.q);
            ValueAnimator valueAnimator2 = ln9Var.e;
            jn9 jn9Var3 = ln9Var.f;
            valueAnimator2.setDuration(jn9Var3.s + jn9Var3.t);
            ln9Var.e.addUpdateListener(ln9Var.a);
            if (zIsStarted) {
                ln9Var.e.start();
            }
        }
        ln9Var.invalidateSelf();
        if (jn9Var == null || !jn9Var.n) {
            setLayerType(0, null);
            return this;
        }
        setLayerType(2, this.mContentPaint);
        return this;
    }

    public void showShimmer(boolean z) {
        if (this.mShowShimmer) {
            return;
        }
        this.mShowShimmer = true;
        if (z) {
            startShimmer();
        }
    }

    public void startShimmer() {
        ln9 ln9Var = this.mShimmerDrawable;
        ValueAnimator valueAnimator = ln9Var.e;
        if (valueAnimator != null) {
            if ((valueAnimator == null || !valueAnimator.isStarted()) && ln9Var.getCallback() != null) {
                ln9Var.e.start();
            }
        }
    }

    public void stopShimmer() {
        ln9 ln9Var = this.mShimmerDrawable;
        ValueAnimator valueAnimator = ln9Var.e;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        ln9Var.e.cancel();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mShimmerDrawable;
    }

    public mn9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new ln9();
        this.mShowShimmer = true;
        init(context, attributeSet);
    }

    public mn9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new ln9();
        this.mShowShimmer = true;
        init(context, attributeSet);
    }

    public mn9(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new ln9();
        this.mShowShimmer = true;
        init(context, attributeSet);
    }
}
