package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class et2 extends on3 {
    public static final et2 w = new et2();
    public final s72 v;

    public et2() {
        int i = eaa.c;
        int i2 = eaa.d;
        this.v = new s72(eaa.a, i, eaa.e, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.n72
    public final void t0(h72 h72Var, Runnable runnable) {
        s72.p(this.v, runnable, 6);
    }

    @Override // defpackage.n72
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // defpackage.n72
    public final void u0(h72 h72Var, Runnable runnable) {
        s72.p(this.v, runnable, 2);
    }

    @Override // defpackage.n72
    public final n72 w0(int i) {
        pp0.c(1);
        return 1 >= eaa.c ? this : super.w0(1);
    }
}
