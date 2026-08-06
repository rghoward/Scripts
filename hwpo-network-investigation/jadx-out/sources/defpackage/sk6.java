package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sk6 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ g0b t;
    public final /* synthetic */ ci4<jt1, Integer, g2b> u;

    /* JADX WARN: Multi-variable type inference failed */
    public sk6(g0b g0bVar, ci4<? super jt1, ? super Integer, g2b> ci4Var) {
        this.t = g0bVar;
        this.u = ci4Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            mia.a(this.t.j, this.u, jt1Var2, 0);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
