package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j39 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ int t;
    public final /* synthetic */ ci4<jt1, Integer, g2b> u;
    public final /* synthetic */ fr1 v;
    public final /* synthetic */ ci4<jt1, Integer, g2b> w;
    public final /* synthetic */ ci4<jt1, Integer, g2b> x;
    public final /* synthetic */ n37 y;
    public final /* synthetic */ ci4<jt1, Integer, g2b> z;

    public j39(int i, ci4 ci4Var, fr1 fr1Var, ci4 ci4Var2, ci4 ci4Var3, n37 n37Var, ci4 ci4Var4) {
        this.t = i;
        this.u = ci4Var;
        this.v = fr1Var;
        this.w = ci4Var2;
        this.x = ci4Var3;
        this.y = n37Var;
        this.z = ci4Var4;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            q39.b(this.t, this.u, this.v, this.w, this.x, this.y, this.z, jt1Var2, 0);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
