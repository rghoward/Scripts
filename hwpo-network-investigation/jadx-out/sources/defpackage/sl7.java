package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class sl7 implements oh4<Boolean, g2b> {
    public final /* synthetic */ pl7 t;

    public sl7(pl7 pl7Var) {
        this.t = pl7Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        pl7.a aVar = pl7.Companion;
        this.t.p().b.setEnabled(zBooleanValue);
        return g2b.a;
    }
}
