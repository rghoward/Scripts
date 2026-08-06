package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class v1b extends n72 {
    public static final /* synthetic */ int v = 0;

    static {
        new v1b();
    }

    @Override // defpackage.n72
    public final void t0(h72 h72Var, Runnable runnable) {
        qrb qrbVar = (qrb) h72Var.d0(qrb.v);
        if (qrbVar != null) {
            qrbVar.u = true;
        } else {
            ru3.f("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.n72
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // defpackage.n72
    public final n72 w0(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }
}
