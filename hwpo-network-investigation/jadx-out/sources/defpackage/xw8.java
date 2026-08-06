package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xw8 extends View {
    public static final int[] y = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] z = new int[0];
    public b3b t;
    public Boolean u;
    public Long v;
    public ww8 w;
    public zq x;

    private final void setRippleState(boolean z2) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.w;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.v;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z2 || jLongValue >= 5) {
            int[] iArr = z2 ? y : z;
            b3b b3bVar = this.t;
            if (b3bVar != null) {
                b3bVar.setState(iArr);
            }
        } else {
            ww8 ww8Var = new ww8(this);
            this.w = ww8Var;
            postDelayed(ww8Var, 50L);
        }
        this.v = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(xw8 xw8Var) {
        b3b b3bVar = xw8Var.t;
        if (b3bVar != null) {
            b3bVar.setState(z);
        }
        xw8Var.w = null;
    }

    public final void b(n88.b bVar, boolean z2, long j, int i, long j2, zq zqVar) {
        if (this.t == null || !Boolean.valueOf(z2).equals(this.u)) {
            b3b b3bVar = new b3b(z2);
            setBackground(b3bVar);
            this.t = b3bVar;
            this.u = Boolean.valueOf(z2);
        }
        b3b b3bVar2 = this.t;
        b3bVar2.getClass();
        this.x = zqVar;
        e(j, i, j2);
        if (z2) {
            b3bVar2.setHotspot(Float.intBitsToFloat((int) (bVar.a >> 32)), Float.intBitsToFloat((int) (bVar.a & 4294967295L)));
        } else {
            b3bVar2.setHotspot(b3bVar2.getBounds().centerX(), b3bVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.x = null;
        ww8 ww8Var = this.w;
        if (ww8Var != null) {
            removeCallbacks(ww8Var);
            ww8 ww8Var2 = this.w;
            ww8Var2.getClass();
            ww8Var2.run();
        } else {
            b3b b3bVar = this.t;
            if (b3bVar != null) {
                b3bVar.setState(z);
            }
        }
        b3b b3bVar2 = this.t;
        if (b3bVar2 == null) {
            return;
        }
        b3bVar2.setVisible(false, false);
        unscheduleDrawable(b3bVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j, int i, long j2) {
        b3b b3bVar = this.t;
        if (b3bVar == null) {
            return;
        }
        if (b3bVar.getRadius() != i) {
            b3bVar.setRadius(i);
        }
        float f = Build.VERSION.SDK_INT < 28 ? 0.2f : 0.1f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jB = uh1.b(f, j2);
        uh1 uh1Var = b3bVar.u;
        if (!(uh1Var == null ? false : uh1.c(uh1Var.a, jB))) {
            b3bVar.u = new uh1(jB);
            b3bVar.setColor(ColorStateList.valueOf(u7d.l(jB)));
        }
        Rect rect = new Rect(0, 0, wk6.b(cr9.d(j)), wk6.b(cr9.b(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        b3bVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        zq zqVar = this.x;
        if (zqVar != null) {
            zqVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
    }
}
