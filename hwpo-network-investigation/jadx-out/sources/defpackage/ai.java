package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ai implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ ci4<jt1, Integer, g2b> t;
    public final /* synthetic */ fr1 u;

    public ai(ci4 ci4Var, fr1 fr1Var) {
        this.t = ci4Var;
        this.u = fr1Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ko7 ko7Var = ci.a;
            ci.b(8.0f, 12.0f, gr1.b(-459506658, new zh(this.t, this.u), jt1Var2), jt1Var2, 438);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
