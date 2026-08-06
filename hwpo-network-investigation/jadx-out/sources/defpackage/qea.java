package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qea implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ ei4<kfa, jt1, Integer, g2b> t;
    public final /* synthetic */ xea u;

    /* JADX WARN: Multi-variable type inference failed */
    public qea(ei4<? super kfa, ? super jt1, ? super Integer, g2b> ei4Var, xea xeaVar) {
        this.t = ei4Var;
        this.u = xeaVar;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.t.invoke(this.u, jt1Var2, 6);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
