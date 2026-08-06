package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nub implements di0.a {
    public final /* synthetic */ zn4 a;

    public nub(zn4 zn4Var) {
        this.a = zn4Var;
    }

    @Override // di0.a
    public final void a(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        zn4 zn4Var = this.a;
        zn4Var.F.sendMessage(zn4Var.F.obtainMessage(1, boolValueOf));
    }
}
