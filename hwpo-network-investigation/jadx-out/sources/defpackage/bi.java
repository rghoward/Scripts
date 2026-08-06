package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bi implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ long A;
    public final /* synthetic */ ci4<jt1, Integer, g2b> B;
    public final /* synthetic */ fr1 C;
    public final /* synthetic */ ci4<jt1, Integer, g2b> t;
    public final /* synthetic */ ci4<jt1, Integer, g2b> u;
    public final /* synthetic */ ci4<jt1, Integer, g2b> v;
    public final /* synthetic */ jl9 w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;
    public final /* synthetic */ long z;

    public bi(ci4 ci4Var, ci4 ci4Var2, ci4 ci4Var3, jl9 jl9Var, long j, long j2, long j3, long j4, ci4 ci4Var4, fr1 fr1Var) {
        this.t = ci4Var;
        this.u = ci4Var2;
        this.v = ci4Var3;
        this.w = jl9Var;
        this.x = j;
        this.y = j2;
        this.z = j3;
        this.A = j4;
        this.B = ci4Var4;
        this.C = fr1Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ci.a(gr1.b(1367541877, new ai(this.B, this.C), jt1Var2), null, this.t, this.u, this.v, this.w, this.x, hi1.d(i03.t, jt1Var2), this.y, this.z, this.A, jt1Var2, 6);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
