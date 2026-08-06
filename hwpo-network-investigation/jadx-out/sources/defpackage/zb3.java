package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zb3 implements oh4<Boolean, g2b> {
    public final /* synthetic */ rb3 t;

    public zb3(rb3 rb3Var) {
        this.t = rb3Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        rb3.a aVar = rb3.Companion;
        rb3 rb3Var = this.t;
        rb3Var.r().k.setVisible(zBooleanValue);
        rb3Var.r().b.setEnabled(!zBooleanValue);
        return g2b.a;
    }
}
