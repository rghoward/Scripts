package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jhb extends View implements ln7 {
    public static Method v;
    public static Field w;
    public static boolean x;
    public static boolean y;
    public boolean t;
    public float u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            view.getClass();
            Method method = jhb.v;
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
    }

    static {
        new a();
    }

    private final cu7 getManualClipPath() {
        if (getClipToOutline()) {
            throw null;
        }
        return null;
    }

    private final void setInvalidated(boolean z) {
        if (z == this.t) {
            return;
        }
        this.t = z;
        throw null;
    }

    @Override // defpackage.ln7
    public final void a(float[] fArr) {
        throw null;
    }

    @Override // defpackage.ln7
    public final void b(b37 b37Var, boolean z) {
        if (!z) {
            throw null;
        }
        throw null;
    }

    @Override // defpackage.ln7
    public final boolean c(long j) {
        Float.intBitsToFloat((int) (j >> 32));
        Float.intBitsToFloat((int) (j & 4294967295L));
        if (getClipToOutline()) {
            throw null;
        }
        return true;
    }

    @Override // defpackage.ln7
    public final void d(sv8 sv8Var) {
        int i = sv8Var.t;
        throw null;
    }

    @Override // defpackage.ln7
    public final void destroy() {
        setInvalidated(false);
        throw null;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        throw null;
    }

    @Override // defpackage.ln7
    public final long e(long j, boolean z) {
        if (z) {
            throw null;
        }
        throw null;
    }

    @Override // defpackage.ln7
    public final void f(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (i == getWidth() && i2 == getHeight()) {
            return;
        }
        int i3 = ava.c;
        setPivotX(Float.intBitsToFloat(0) * i);
        setPivotY(Float.intBitsToFloat(0) * i2);
        throw null;
    }

    @Override // defpackage.ln7
    public final void g(ci4<? super n41, ? super ko4, g2b> ci4Var, mh4<g2b> mh4Var) {
        throw null;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final v63 getContainer() {
        return null;
    }

    public float getFrameRate() {
        return this.u;
    }

    public long getLayerId() {
        return 0L;
    }

    public final cm getOwnerView() {
        return null;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT < 29) {
            return -1L;
        }
        throw null;
    }

    @Override // defpackage.ln7
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    public float[] mo880getUnderlyingMatrixsQKQjiQ() {
        throw null;
    }

    @Override // defpackage.ln7
    public final void h(n41 n41Var, ko4 ko4Var) {
        if (getElevation() > 0.0f) {
            n41Var.t();
        }
        getDrawingTime();
        throw null;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        throw null;
    }

    @Override // defpackage.ln7
    public final void i(float[] fArr) {
        throw null;
    }

    @Override // android.view.View, defpackage.ln7
    public final void invalidate() {
        if (this.t) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        throw null;
    }

    @Override // defpackage.ln7
    public final void j(long j) {
        int i = (int) (j >> 32);
        if (i != getLeft()) {
            offsetLeftAndRight(i - getLeft());
            throw null;
        }
        int i2 = (int) (j & 4294967295L);
        if (i2 == getTop()) {
            return;
        }
        offsetTopAndBottom(i2 - getTop());
        throw null;
    }

    @Override // defpackage.ln7
    public final void k() {
        if (!this.t || y) {
            return;
        }
        try {
            if (!x) {
                x = true;
                if (Build.VERSION.SDK_INT < 28) {
                    v = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    w = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    v = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    w = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = v;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = w;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = w;
            if (field2 != null) {
                field2.setBoolean(this, true);
            }
            Method method2 = v;
            if (method2 != null) {
                method2.invoke(this, null);
            }
        } catch (Throwable unused) {
            y = true;
        }
        setInvalidated(false);
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    public void setFrameRate(float f) {
        this.u = f;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public void setFrameRateFromParent(boolean z) {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
