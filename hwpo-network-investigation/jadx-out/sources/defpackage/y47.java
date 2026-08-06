package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y47 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ f09 t;
    public final /* synthetic */ fr1 u;

    public y47(f09 f09Var, fr1 fr1Var) {
        this.t = f09Var;
        this.u = fr1Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        if ((num.intValue() & 3) == 2 && jt1Var2.r()) {
            jt1Var2.u();
        } else {
            uy0.b(this.t, this.u, jt1Var2, 0);
        }
        return g2b.a;
    }
}
