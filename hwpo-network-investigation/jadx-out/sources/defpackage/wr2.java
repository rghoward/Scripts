package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class wr2 extends on3 implements Executor {
    public static final wr2 v = new wr2();
    public static final n72 w;

    static {
        v2b v2bVar = v2b.v;
        int i = e8a.a;
        if (64 >= i) {
            i = 64;
        }
        w = v2bVar.w0(ec1.c(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        t0(ff3.t, runnable);
    }

    @Override // defpackage.n72
    public final void t0(h72 h72Var, Runnable runnable) {
        w.t0(h72Var, runnable);
    }

    @Override // defpackage.n72
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.n72
    public final void u0(h72 h72Var, Runnable runnable) {
        w.u0(h72Var, runnable);
    }

    @Override // defpackage.n72
    public final n72 w0(int i) {
        return v2b.v.w0(1);
    }
}
