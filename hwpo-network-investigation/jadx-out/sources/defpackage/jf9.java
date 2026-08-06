package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jf9 implements oh4<Boolean, g2b> {
    public final /* synthetic */ bf9 t;

    public jf9(bf9 bf9Var) {
        this.t = bf9Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        bf9.a aVar = bf9.Companion;
        bf9 bf9Var = this.t;
        bf9Var.p().k.setVisible(zBooleanValue);
        bf9Var.p().h.setEnabled(!zBooleanValue);
        return g2b.a;
    }
}
