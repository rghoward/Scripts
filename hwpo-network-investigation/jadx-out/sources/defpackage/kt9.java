package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kt9 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ long t;
    public final /* synthetic */ ms9 u;
    public final /* synthetic */ String v;

    public kt9(long j, ms9 ms9Var, String str) {
        this.t = j;
        this.u = ms9Var;
        this.v = str;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ko7 ko7Var = zy0.a;
            yy0 yy0VarF = zy0.f(0L, this.t, jt1Var2, 13);
            ms9 ms9Var = this.u;
            boolean zJ = jt1Var2.J(ms9Var);
            Object objF = jt1Var2.f();
            if (zJ || objF == jt1.a.a) {
                objF = new it9(0, ms9Var);
                jt1Var2.C(objF);
            }
            jz0.c((mh4) objF, null, false, null, yy0VarF, null, gr1.b(521110564, new jt9(this.v), jt1Var2), jt1Var2, 805306368, 494);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
