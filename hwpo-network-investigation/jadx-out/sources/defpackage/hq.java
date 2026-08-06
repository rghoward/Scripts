package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hq extends wp5 implements oh4<c33, b33> {
    public final /* synthetic */ d68 u;
    public final /* synthetic */ mh4<g2b> v;
    public final /* synthetic */ m68 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ tq5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq(d68 d68Var, mh4<g2b> mh4Var, m68 m68Var, String str, tq5 tq5Var) {
        super(1);
        this.u = d68Var;
        this.v = mh4Var;
        this.w = m68Var;
        this.x = str;
        this.y = tq5Var;
    }

    @Override // defpackage.oh4
    public final b33 invoke(c33 c33Var) {
        d68 d68Var = this.u;
        d68Var.z.addView(d68Var, d68Var.A);
        d68Var.e(this.v, this.w, this.x, this.y);
        return new gq(d68Var);
    }
}
