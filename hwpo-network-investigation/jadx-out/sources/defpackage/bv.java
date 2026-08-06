package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bv extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ ei4<jv, jt1, Integer, g2b> A;
    public final /* synthetic */ int B;
    public final /* synthetic */ tva<Object> u;
    public final /* synthetic */ oh4<Object, Boolean> v;
    public final /* synthetic */ ox6 w;
    public final /* synthetic */ th3 x;
    public final /* synthetic */ jo3 y;
    public final /* synthetic */ ci4<wg3, wg3, Boolean> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(tva tvaVar, oh4 oh4Var, ox6 ox6Var, th3 th3Var, jo3 jo3Var, ci4 ci4Var, ei4 ei4Var, int i) {
        super(2);
        this.u = tvaVar;
        this.v = oh4Var;
        this.w = ox6Var;
        this.x = th3Var;
        this.y = jo3Var;
        this.z = ci4Var;
        this.A = ei4Var;
        this.B = i;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) throws Throwable {
        num.intValue();
        dv.a(this.u, this.v, this.w, this.x, this.y, this.z, this.A, jt1Var, gz3.s(this.B | 1));
        return g2b.a;
    }
}
