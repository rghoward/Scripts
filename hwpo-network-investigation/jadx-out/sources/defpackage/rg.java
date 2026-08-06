package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rg extends wa implements ci4<String, r02<? super g2b>, Object> {
    @Override // defpackage.ci4
    public final Object invoke(String str, r02<? super g2b> r02Var) {
        dz9 dz9Var;
        String str2 = str;
        pg pgVar = (pg) this.receiver;
        if (!xj5.a(str2, pgVar.L)) {
            pgVar.L = str2;
            pgVar.e(new ef.a(!z2a.w(str2)));
            dz9 dz9Var2 = pgVar.M;
            if ((dz9Var2 == null || !dz9Var2.isCancelled()) && (dz9Var = pgVar.M) != null) {
                dz9Var.k(null);
            }
            pgVar.M = oy0.d(rhb.b(pgVar), null, null, new vg(pgVar, str2, null), 3);
        }
        return g2b.a;
    }
}
