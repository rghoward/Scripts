package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kj2 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ qk2 t;
    public final /* synthetic */ i21 u;
    public final /* synthetic */ yh2 v;
    public final /* synthetic */ lh2 w;
    public final /* synthetic */ p94 x;

    public kj2(qk2 qk2Var, i21 i21Var, yh2 yh2Var, lh2 lh2Var, p94 p94Var) {
        this.t = qk2Var;
        this.u = i21Var;
        this.v = yh2Var;
        this.w = lh2Var;
        this.x = p94Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            final qk2 qk2Var = this.t;
            Long lF = qk2Var.f();
            long jE = qk2Var.e();
            int iB = qk2Var.b();
            boolean zJ = jt1Var2.J(qk2Var);
            Object objF = jt1Var2.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zJ || objF == c0187a) {
                objF = new i32(1, qk2Var);
                jt1Var2.C(objF);
            }
            oh4 oh4Var = (oh4) objF;
            boolean zJ2 = jt1Var2.J(qk2Var);
            Object objF2 = jt1Var2.f();
            if (zJ2 || objF2 == c0187a) {
                objF2 = new oh4() { // from class: jj2
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        qk2Var.c(((Long) obj).longValue());
                        return g2b.a;
                    }
                };
                jt1Var2.C(objF2);
            }
            lj2.k(lF, jE, iB, oh4Var, (oh4) objF2, this.u, qk2Var.g(), this.v, qk2Var.d(), this.w, this.x, jt1Var2, 0);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
