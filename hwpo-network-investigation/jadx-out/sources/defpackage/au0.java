package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class au0 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ float t;
    public final /* synthetic */ float u;

    public au0(float f, float f2) {
        this.t = f;
        this.u = f2;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            dv0.a(ir9.k(this.t, this.u, ox6.a.t), jt1Var2, 0);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
