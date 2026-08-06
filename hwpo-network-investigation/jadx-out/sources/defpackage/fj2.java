package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fj2 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ qk2 t;
    public final /* synthetic */ lh2 u;

    public fj2(qk2 qk2Var, lh2 lh2Var) {
        this.t = qk2Var;
        this.u = lh2Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ph2.a.b(this.t.b(), eo7.h(ox6.a.t, lj2.b), this.u.b, jt1Var2, 3120);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
