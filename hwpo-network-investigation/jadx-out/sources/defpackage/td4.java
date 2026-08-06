package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class td4 implements kw9 {
    public final kw9 t;

    public td4(kw9 kw9Var) {
        kw9Var.getClass();
        this.t = kw9Var;
    }

    @Override // defpackage.kw9
    public long O(tx0 tx0Var, long j) {
        tx0Var.getClass();
        return this.t.O(tx0Var, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.t.close();
    }

    @Override // defpackage.kw9
    public final voa timeout() {
        return this.t.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.t + ')';
    }
}
