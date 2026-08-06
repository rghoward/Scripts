package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ft9 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ ci4<jt1, Integer, g2b> t;
    public final /* synthetic */ fr1 u;
    public final /* synthetic */ ci4<jt1, Integer, g2b> v;
    public final /* synthetic */ wja w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;

    public ft9(ci4 ci4Var, fr1 fr1Var, ci4 ci4Var2, wja wjaVar, long j, long j2) {
        this.t = ci4Var;
        this.u = fr1Var;
        this.v = ci4Var2;
        this.w = wjaVar;
        this.x = j;
        this.y = j2;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            jt1Var2.K(-168976609);
            mt9.a(this.u, this.t, this.v, this.w, this.x, this.y, jt1Var2, 0);
            jt1Var2.B();
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
