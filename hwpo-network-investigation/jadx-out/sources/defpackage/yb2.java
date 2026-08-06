package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yb2 extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ tva<Object> u;
    public final /* synthetic */ ox6 v;
    public final /* synthetic */ a04<Float> w;
    public final /* synthetic */ oh4<Object, Object> x;
    public final /* synthetic */ fr1 y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb2(tva tvaVar, ox6 ox6Var, a04 a04Var, oh4 oh4Var, fr1 fr1Var, int i) {
        super(2);
        this.u = tvaVar;
        this.v = ox6Var;
        this.w = a04Var;
        this.x = oh4Var;
        this.y = fr1Var;
        this.z = i;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        num.intValue();
        zb2.a(this.u, this.v, this.w, this.x, this.y, jt1Var, gz3.s(this.z | 1));
        return g2b.a;
    }
}
