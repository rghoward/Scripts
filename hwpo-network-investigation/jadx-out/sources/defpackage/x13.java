package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class x13 extends Exception {
    public final Throwable t;

    public x13(Throwable th, n72 n72Var, h72 h72Var) {
        super("Coroutine dispatcher " + n72Var + " threw an exception, context = " + h72Var, th);
        this.t = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.t;
    }
}
