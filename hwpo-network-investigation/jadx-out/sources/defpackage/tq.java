package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tq extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ d68 u;
    public final /* synthetic */ h37 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq(d68 d68Var, h37 h37Var) {
        super(2);
        this.u = d68Var;
        this.v = h37Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            nu1.a(fq.b.a(Boolean.TRUE), gr1.b(1022273628, new sq(this.u, this.v), jt1Var2), jt1Var2, 56);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
