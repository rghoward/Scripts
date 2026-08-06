package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ju extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ int A;
    public final /* synthetic */ tva<Object> u;
    public final /* synthetic */ ox6 v;
    public final /* synthetic */ oh4<ru<Object>, oz1> w;
    public final /* synthetic */ di x;
    public final /* synthetic */ oh4<Object, Object> y;
    public final /* synthetic */ fr1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju(tva tvaVar, ox6 ox6Var, oh4 oh4Var, di diVar, oh4 oh4Var2, fr1 fr1Var, int i) {
        super(2);
        this.u = tvaVar;
        this.v = ox6Var;
        this.w = oh4Var;
        this.x = diVar;
        this.y = oh4Var2;
        this.z = fr1Var;
        this.A = i;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        num.intValue();
        lu.b(this.u, this.v, this.w, this.x, this.y, this.z, jt1Var, gz3.s(this.A | 1));
        return g2b.a;
    }
}
