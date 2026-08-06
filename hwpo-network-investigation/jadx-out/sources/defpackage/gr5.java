package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gr5 extends wp5 implements ei4<rr9<bt1>, jt1, Integer, g2b> {
    public final /* synthetic */ ox6 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr5(ox6 ox6Var) {
        super(3);
        this.u = ox6Var;
    }

    @Override // defpackage.ei4
    public final g2b invoke(rr9<bt1> rr9Var, jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = rr9Var.a;
        jt1 jt1Var3 = jt1Var;
        num.intValue();
        int iHashCode = Long.hashCode(jt1Var3.v());
        ox6 ox6VarC = it1.c(jt1Var3, this.u);
        jt1Var2.e(509942095);
        bt1.c.getClass();
        rd7.d(jt1Var2, bt1.a.d, ox6VarC);
        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
        jt1Var2.H();
        return g2b.a;
    }
}
