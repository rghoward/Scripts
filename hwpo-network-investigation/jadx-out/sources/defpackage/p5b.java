package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p5b implements vg5 {
    public final u10 a;

    public p5b(u10 u10Var) {
        this.a = u10Var;
    }

    @Override // defpackage.vg5
    public final qu8 intercept(vg5.a aVar) {
        aj8 aj8Var = (aj8) aVar;
        jp8.a aVarB = aj8Var.e.b();
        String strA = this.a.a();
        if (strA != null) {
            aVarB.b("Language", strA);
        }
        return aj8Var.a(new jp8(aVarB));
    }
}
