package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wh2 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ jl9 t;
    public final /* synthetic */ lh2 u;
    public final /* synthetic */ fr1 v;
    public final /* synthetic */ ci4<jt1, Integer, g2b> w;
    public final /* synthetic */ fr1 x;

    public wh2(jl9 jl9Var, lh2 lh2Var, fr1 fr1Var, ci4 ci4Var, fr1 fr1Var2) {
        this.t = jl9Var;
        this.u = lh2Var;
        this.v = fr1Var;
        this.w = ci4Var;
        this.x = fr1Var2;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            v5a.a(ir9.e(ir9.i(fk2.d), 0.0f, fk2.b, 1), this.t, this.u.a, 0L, 0.0f, 0.0f, null, gr1.b(1782015378, new vh2(this.v, this.w, this.x), jt1Var2), jt1Var2, 12582918, 104);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
