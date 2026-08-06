package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wq3 implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ long A;
    public final /* synthetic */ float B;
    public final /* synthetic */ fr1 C;
    public final /* synthetic */ xq3 t;
    public final /* synthetic */ ox6 u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ j37<Boolean> w;
    public final /* synthetic */ h37<ava> x;
    public final /* synthetic */ x69 y;
    public final /* synthetic */ jl9 z;

    public wq3(xq3 xq3Var, ox6 ox6Var, boolean z, j37 j37Var, h37 h37Var, x69 x69Var, jl9 jl9Var, long j, float f, fr1 fr1Var) {
        this.t = xq3Var;
        this.u = ox6Var;
        this.v = z;
        this.w = j37Var;
        this.x = h37Var;
        this.y = x69Var;
        this.z = jl9Var;
        this.A = j;
        this.B = f;
        this.C = fr1Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            xr6.a(this.t.b(this.u, this.v), this.w, this.x, this.y, this.z, this.A, this.B, this.C, jt1Var2, 384);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
