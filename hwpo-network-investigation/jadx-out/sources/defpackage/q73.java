package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q73 implements Drawable.Callback {
    public final /* synthetic */ r73 t;

    public q73(r73 r73Var) {
        this.t = r73Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        r73 r73Var = this.t;
        dt7 dt7Var = r73Var.z;
        dt7Var.setValue(Integer.valueOf(((Number) dt7Var.getValue()).intValue() + 1));
        Drawable drawable2 = r73Var.y;
        ss5 ss5Var = s73.a;
        r73Var.A.setValue(new cr9((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : p50.b(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) s73.a.getValue()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) s73.a.getValue()).removeCallbacks(runnable);
    }
}
