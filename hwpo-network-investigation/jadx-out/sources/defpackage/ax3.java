package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ax3 extends m85 {
    public final du7 t;
    public final fy3 u;
    public final String v;
    public final Closeable w;
    public boolean x;
    public ni8 y;

    public ax3(du7 du7Var, fy3 fy3Var, String str, Closeable closeable) {
        this.t = du7Var;
        this.u = fy3Var;
        this.v = str;
        this.w = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.x = true;
            ni8 ni8Var = this.y;
            if (ni8Var != null) {
                v.a(ni8Var);
            }
            Closeable closeable = this.w;
            if (closeable != null) {
                v.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.m85
    public final synchronized du7 h() {
        if (this.x) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        return this.t;
    }

    @Override // defpackage.m85
    public final du7 k() {
        return h();
    }

    @Override // defpackage.m85
    public final m85.a m() {
        return null;
    }

    @Override // defpackage.m85
    public final synchronized hy0 p() {
        if (this.x) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        ni8 ni8Var = this.y;
        if (ni8Var != null) {
            return ni8Var;
        }
        kw9 kw9VarK = this.u.K(this.t);
        kw9VarK.getClass();
        ni8 ni8Var2 = new ni8(kw9VarK);
        this.y = ni8Var2;
        return ni8Var2;
    }
}
