package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ro0 implements oh4<Boolean, g2b> {
    public final /* synthetic */ oo0 t;

    public ro0(oo0 oo0Var) {
        this.t = oo0Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        oo0.a aVar = oo0.Companion;
        this.t.q().d.setEnabled(zBooleanValue);
        return g2b.a;
    }
}
