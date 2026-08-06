package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class coa implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ xma t;
    public final /* synthetic */ uf5 u;
    public final /* synthetic */ qi v;
    public final /* synthetic */ boolean w;

    public coa(xma xmaVar, uf5 uf5Var, qi qiVar, boolean z) {
        this.t = xmaVar;
        this.u = uf5Var;
        this.v = qiVar;
        this.w = z;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            nu1.a(zy1.a.a(new uh1(this.t.f)), gr1.b(-596940007, new boa(this.u, this.v, this.w), jt1Var2), jt1Var2, 56);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
