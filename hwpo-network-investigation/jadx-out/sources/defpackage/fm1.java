package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fm1 implements oh4<Boolean, g2b> {
    public final /* synthetic */ am1 t;

    public fm1(am1 am1Var) {
        this.t = am1Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        am1.a aVar = am1.Companion;
        this.t.r().k.setEnabled(zBooleanValue);
        return g2b.a;
    }
}
