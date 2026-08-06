package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eg1 implements AutoCloseable, t72 {
    public final h72 t;

    public eg1(h72 h72Var) {
        h72Var.getClass();
        this.t = h72Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        sd.c(this.t, null);
    }

    @Override // defpackage.t72
    public final h72 getCoroutineContext() {
        return this.t;
    }
}
