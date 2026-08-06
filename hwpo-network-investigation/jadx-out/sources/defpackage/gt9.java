package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gt9 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ ci4<jt1, Integer, g2b> t;
    public final /* synthetic */ fr1 u;
    public final /* synthetic */ ci4<jt1, Integer, g2b> v;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;

    public gt9(ci4 ci4Var, fr1 fr1Var, ci4 ci4Var2, long j, long j2) {
        this.t = ci4Var;
        this.u = fr1Var;
        this.v = ci4Var2;
        this.w = j;
        this.x = j2;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            nu1.a(mia.a.a(j0b.a(pt9.A, jt1Var2)), gr1.b(969655473, new ft9(this.t, this.u, this.v, j0b.a(pt9.u, jt1Var2), this.w, this.x), jt1Var2), jt1Var2, 56);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
