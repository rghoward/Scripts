package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class q72 {
    public static final void a(h72 h72Var, Throwable th) {
        if (th instanceof x13) {
            th = ((x13) th).t;
        }
        try {
            o72 o72Var = (o72) h72Var.d0(o72.a.t);
            if (o72Var != null) {
                o72Var.B(h72Var, th);
            } else {
                sd.f(h72Var, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                fn3.b(runtimeException, th);
                th = runtimeException;
            }
            sd.f(h72Var, th);
        }
    }
}
