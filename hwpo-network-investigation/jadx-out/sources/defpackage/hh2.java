package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hh2 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ h37<String> t;

    public hh2(h37<String> h37Var) {
        this.t = h37Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            h37<String> h37Var = this.t;
            if (z2a.w(h37Var.getValue())) {
                jt1Var2.K(-1548950640);
            } else {
                jt1Var2.K(-327061465);
                mia.b(h37Var.getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                jt1Var2 = jt1Var2;
            }
            jt1Var2.B();
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
