package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rb2 extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ Object u;
    public final /* synthetic */ ox6 v;
    public final /* synthetic */ a04<Float> w;
    public final /* synthetic */ String x;
    public final /* synthetic */ fr1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb2(Object obj, ox6 ox6Var, a04 a04Var, String str, fr1 fr1Var, int i) {
        super(2);
        this.u = obj;
        this.v = ox6Var;
        this.w = a04Var;
        this.x = str;
        this.y = fr1Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        num.intValue();
        int iS = gz3.s(24577);
        zb2.b(this.u, this.v, this.w, this.x, this.y, jt1Var, iS);
        return g2b.a;
    }
}
