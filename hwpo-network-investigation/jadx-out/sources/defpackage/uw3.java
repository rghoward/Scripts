package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uw3 implements oh4<Throwable, g2b> {
    public final /* synthetic */ oi8 t;

    public uw3(oi8 oi8Var) {
        this.t = oi8Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Throwable th) {
        this.t.cancel();
        return g2b.a;
    }
}
