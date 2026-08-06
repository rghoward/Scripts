package com.hwpo_training_app.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import defpackage.ch8;
import defpackage.g2b;
import defpackage.pp9;
import defpackage.qq2;
import defpackage.z28;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class SimpleProgressBar extends FrameLayout {
    public static final a Companion = new a();
    public boolean t;
    public boolean u;
    public boolean v;
    public long w;
    public final z28 x;
    public final pp9 y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r6v8, types: [pp9] */
    public SimpleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ch8.g);
        typedArrayObtainStyledAttributes.getClass();
        setBackgroundColor(context.getColor(typedArrayObtainStyledAttributes.getResourceId(0, R.color.colorBackgroundProgress)));
        g2b g2bVar = g2b.a;
        typedArrayObtainStyledAttributes.recycle();
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        progressBar.getIndeterminateDrawable().setColorFilter(new PorterDuffColorFilter(context.getColor(R.color.colorPrimary), PorterDuff.Mode.SRC_ATOP));
        addView(progressBar);
        setClickable(true);
        setFocusable(true);
        this.t = getVisibility() == 0;
        this.w = -1L;
        this.v = getVisibility() == 0;
        this.x = new z28(this, 1);
        this.y = new Runnable() { // from class: pp9
            @Override // java.lang.Runnable
            public final void run() {
                SimpleProgressBar.a aVar = SimpleProgressBar.Companion;
                long jUptimeMillis = SystemClock.uptimeMillis();
                SimpleProgressBar simpleProgressBar = this.t;
                simpleProgressBar.w = jUptimeMillis;
                simpleProgressBar.setVisibility(0);
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u = true;
        if (!this.v || getVisibility() == 0) {
            return;
        }
        postDelayed(this.y, 500L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.u = false;
        removeCallbacks(this.x);
        removeCallbacks(this.y);
        if (!this.v && this.w != -1) {
            setVisibility(8);
        }
        this.w = -1L;
    }

    public final void setVisible(boolean z) {
        if (z == this.t) {
            return;
        }
        this.t = z;
        boolean z2 = this.v;
        pp9 pp9Var = this.y;
        z28 z28Var = this.x;
        if (z) {
            if (z2) {
                return;
            }
            this.v = true;
            if (this.u) {
                removeCallbacks(z28Var);
                if (this.w == -1) {
                    postDelayed(pp9Var, 500L);
                    return;
                }
                return;
            }
            return;
        }
        if (z2) {
            this.v = false;
            if (this.u) {
                removeCallbacks(pp9Var);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j = this.w;
            long j2 = jUptimeMillis - j;
            if (j != -1 && j2 < 500) {
                postDelayed(z28Var, 500 - j2);
            } else {
                setVisibility(8);
                this.w = -1L;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleProgressBar(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ SimpleProgressBar(Context context, AttributeSet attributeSet, int i, qq2 qq2Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
