package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iz0 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ long t;
    public final /* synthetic */ go7 u;
    public final /* synthetic */ ei4<oy8, jt1, Integer, g2b> v;

    /* JADX WARN: Multi-variable type inference failed */
    public iz0(long j, go7 go7Var, ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var) {
        this.t = j;
        this.u = go7Var;
        this.v = ei4Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            bzb.b(this.t, ((g0b) jt1Var2.F(j0b.a)).m, gr1.b(417635459, new hz0(this.u, this.v), jt1Var2), jt1Var2, 384);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
