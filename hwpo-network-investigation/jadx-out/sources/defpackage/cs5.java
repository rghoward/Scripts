package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cs5 extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ xr5.b u;
    public final /* synthetic */ ci4<jt1, Integer, g2b> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cs5(xr5.b bVar, ci4<? super jt1, ? super Integer, g2b> ci4Var) {
        super(2);
        this.u = bVar;
        this.v = ci4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            Boolean bool = (Boolean) this.u.g.getValue();
            boolean zBooleanValue = bool.booleanValue();
            jt1Var2.m(bool);
            boolean zC = jt1Var2.c(zBooleanValue);
            if (zBooleanValue) {
                this.v.invoke(jt1Var2, 0);
            } else {
                jt1Var2.n(zC);
            }
            jt1Var2.d();
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
