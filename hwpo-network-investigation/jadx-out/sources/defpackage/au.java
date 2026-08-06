package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class au extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ fr1 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ n23 u;
    public final /* synthetic */ ox6 v;
    public final /* synthetic */ oh4<ru<Object>, oz1> w;
    public final /* synthetic */ di x;
    public final /* synthetic */ String y;
    public final /* synthetic */ oh4<Object, Object> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(n23 n23Var, ox6 ox6Var, oh4 oh4Var, di diVar, String str, oh4 oh4Var2, fr1 fr1Var, int i) {
        super(2);
        this.u = n23Var;
        this.v = ox6Var;
        this.w = oh4Var;
        this.x = diVar;
        this.y = str;
        this.z = oh4Var2;
        this.A = fr1Var;
        this.B = i;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        num.intValue();
        lu.a(this.u, this.v, this.w, this.x, this.y, this.z, this.A, jt1Var, gz3.s(this.B | 1));
        return g2b.a;
    }
}
