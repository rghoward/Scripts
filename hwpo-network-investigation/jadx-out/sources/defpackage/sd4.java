package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sd4 implements yq9 {
    public final yq9 t;

    public sd4(yq9 yq9Var) {
        yq9Var.getClass();
        this.t = yq9Var;
    }

    @Override // defpackage.yq9, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.t.close();
    }

    @Override // defpackage.yq9, java.io.Flushable
    public void flush() {
        this.t.flush();
    }

    @Override // defpackage.yq9
    public void i0(tx0 tx0Var, long j) {
        tx0Var.getClass();
        this.t.i0(tx0Var, j);
    }

    @Override // defpackage.yq9
    public final voa timeout() {
        return this.t.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.t + ')';
    }
}
