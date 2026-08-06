package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jd extends wa implements ci4<String, r02<? super g2b>, Object> {
    @Override // defpackage.ci4
    public final Object invoke(String str, r02<? super g2b> r02Var) {
        dz9 dz9Var;
        String str2 = str;
        gd gdVar = (gd) this.receiver;
        gdVar.C = str2;
        dz9 dz9Var2 = gdVar.D;
        if ((dz9Var2 == null || !dz9Var2.isCancelled()) && (dz9Var = gdVar.D) != null) {
            dz9Var.k(null);
        }
        gdVar.D = oy0.d(rhb.b(gdVar), null, null, new md(gdVar, str2, null), 3);
        return g2b.a;
    }
}
