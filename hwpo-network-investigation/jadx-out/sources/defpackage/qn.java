package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qn extends wp5 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ mh4<g2b> u;
    public final /* synthetic */ f03 v;
    public final /* synthetic */ fr1 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(mh4 mh4Var, f03 f03Var, fr1 fr1Var, int i, int i2) {
        super(2);
        this.u = mh4Var;
        this.v = f03Var;
        this.w = fr1Var;
        this.x = i;
        this.y = i2;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        num.intValue();
        wn.a(this.u, this.v, this.w, jt1Var, gz3.s(this.x | 1), this.y);
        return g2b.a;
    }
}
