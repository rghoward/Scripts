package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class om7 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ h27 v;
    public final /* synthetic */ pda w;
    public final /* synthetic */ jl9 x;

    public om7(boolean z, boolean z2, h27 h27Var, pda pdaVar, jl9 jl9Var) {
        this.t = z;
        this.u = z2;
        this.v = h27Var;
        this.w = pdaVar;
        this.x = jl9Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            jm7.a.a(this.t, this.u, this.v, null, this.w, this.x, 0.0f, 0.0f, jt1Var2, 100663296, 200);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
