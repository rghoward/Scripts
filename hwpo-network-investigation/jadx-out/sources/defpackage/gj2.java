package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gj2 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ qk2 t;
    public final /* synthetic */ yh2 u;
    public final /* synthetic */ lh2 v;

    public gj2(qk2 qk2Var, yh2 yh2Var, lh2 lh2Var) {
        this.t = qk2Var;
        this.u = yh2Var;
        this.v = lh2Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ph2 ph2Var = ph2.a;
            qk2 qk2Var = this.t;
            ph2Var.a(qk2Var.f(), qk2Var.b(), this.u, eo7.h(ox6.a.t, lj2.c), this.v.c, jt1Var2, 199680);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
