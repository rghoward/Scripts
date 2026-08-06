package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class yu8 extends ak0 {
    public yu8(r02<Object> r02Var) {
        super(r02Var);
        if (r02Var == null || r02Var.getContext() == ff3.t) {
            return;
        }
        z90.a("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.r02
    public final h72 getContext() {
        return ff3.t;
    }
}
