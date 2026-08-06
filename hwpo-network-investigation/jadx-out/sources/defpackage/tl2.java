package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tl2 implements oh4<Boolean, g2b> {
    public final /* synthetic */ ql2 t;

    public tl2(ql2 ql2Var) {
        this.t = ql2Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ql2.a aVar = ql2.Companion;
        this.t.p().d.setRefreshing(zBooleanValue);
        return g2b.a;
    }
}
