package defpackage;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nw9 extends m85 {
    public final m85.a t;
    public boolean u;
    public hy0 v;
    public mh4<? extends File> w;
    public du7 x;

    public nw9(hy0 hy0Var, mh4<? extends File> mh4Var, m85.a aVar) {
        this.t = aVar;
        this.v = hy0Var;
        this.w = mh4Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.u = true;
            hy0 hy0Var = this.v;
            if (hy0Var != null) {
                v.a(hy0Var);
            }
            du7 du7Var = this.x;
            if (du7Var != null) {
                tn5 tn5Var = fy3.t;
                tn5Var.getClass();
                tn5Var.t(du7Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.m85
    public final synchronized du7 h() {
        if (this.u) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        du7 du7Var = this.x;
        if (du7Var != null) {
            return du7Var;
        }
        mh4<? extends File> mh4Var = this.w;
        mh4Var.getClass();
        File fileInvoke = mh4Var.invoke();
        if (!fileInvoke.isDirectory()) {
            throw new IllegalStateException("cacheDirectory must be a directory.");
        }
        String str = du7.u;
        du7 du7VarB = du7.a.b(File.createTempFile("tmp", null, fileInvoke));
        mi8 mi8Var = new mi8(fy3.t.J(du7VarB));
        try {
            hy0 hy0Var = this.v;
            hy0Var.getClass();
            mi8Var.F(hy0Var);
            try {
                mi8Var.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                mi8Var.close();
            } catch (Throwable th3) {
                fn3.b(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
        this.v = null;
        this.x = du7VarB;
        this.w = null;
        return du7VarB;
    }

    @Override // defpackage.m85
    public final synchronized du7 k() {
        if (this.u) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        return this.x;
    }

    @Override // defpackage.m85
    public final m85.a m() {
        return this.t;
    }

    @Override // defpackage.m85
    public final synchronized hy0 p() {
        if (this.u) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        hy0 hy0Var = this.v;
        if (hy0Var != null) {
            return hy0Var;
        }
        tn5 tn5Var = fy3.t;
        du7 du7Var = this.x;
        du7Var.getClass();
        tn5Var.getClass();
        ni8 ni8Var = new ni8(new vd5(new FileInputStream(du7Var.toFile()), voa.d));
        this.v = ni8Var;
        return ni8Var;
    }
}
