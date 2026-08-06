package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jp implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ fr1 A;
    public final /* synthetic */ ox6 t;
    public final /* synthetic */ j37<Boolean> u;
    public final /* synthetic */ h37<ava> v;
    public final /* synthetic */ x69 w;
    public final /* synthetic */ jl9 x;
    public final /* synthetic */ long y;
    public final /* synthetic */ float z;

    public jp(ox6 ox6Var, j37 j37Var, h37 h37Var, x69 x69Var, jl9 jl9Var, long j, float f, fr1 fr1Var) {
        this.t = ox6Var;
        this.u = j37Var;
        this.v = h37Var;
        this.w = x69Var;
        this.x = jl9Var;
        this.y = j;
        this.z = f;
        this.A = fr1Var;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            xr6.a(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, jt1Var2, 384);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
