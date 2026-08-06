package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zx6 {
    public static final xx6 a(h72 h72Var) {
        xx6 xx6Var = (xx6) h72Var.d0(xx6.a.t);
        if (xx6Var != null) {
            return xx6Var;
        }
        aa0.c("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }
}
