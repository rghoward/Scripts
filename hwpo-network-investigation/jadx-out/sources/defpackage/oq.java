package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oq extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ l68 u;
    public final /* synthetic */ mh4<g2b> v;
    public final /* synthetic */ m68 w;
    public final /* synthetic */ fr1 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq(l68 l68Var, mh4 mh4Var, m68 m68Var, fr1 fr1Var, int i, int i2) {
        super(2);
        this.u = l68Var;
        this.v = mh4Var;
        this.w = m68Var;
        this.x = fr1Var;
        this.y = i;
        this.z = i2;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        num.intValue();
        fq.a(this.u, this.v, this.w, this.x, jt1Var, gz3.s(this.y | 1), this.z);
        return g2b.a;
    }
}
