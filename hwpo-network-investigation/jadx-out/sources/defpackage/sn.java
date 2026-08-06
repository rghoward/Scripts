package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sn extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ h37 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(h37 h37Var) {
        super(2);
        this.u = h37Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objF = jt1Var2.f();
            if (objF == jt1.a.a) {
                objF = rn.u;
                jt1Var2.C(objF);
            }
            wn.b(pb9.b(ox6.a.t, false, (oh4) objF), (ci4) this.u.getValue(), jt1Var2, 0);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
