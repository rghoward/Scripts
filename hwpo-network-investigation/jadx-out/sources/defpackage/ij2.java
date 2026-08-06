package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ij2 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ qk2 t;
    public final /* synthetic */ lh2 u;

    public ij2(qk2 qk2Var, lh2 lh2Var) {
        this.t = qk2Var;
        this.u = lh2Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ox6 ox6VarH = eo7.h(ox6.a.t, lj2.a);
            qk2 qk2Var = this.t;
            int iB = qk2Var.b();
            boolean zJ = jt1Var2.J(qk2Var);
            Object objF = jt1Var2.f();
            if (zJ || objF == jt1.a.a) {
                objF = new hj2(0, qk2Var);
                jt1Var2.C(objF);
            }
            lj2.f(ox6VarH, iB, (oh4) objF, this.u, jt1Var2, 6);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
