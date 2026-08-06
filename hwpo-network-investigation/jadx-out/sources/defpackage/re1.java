package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class re1 extends vx6<af1> {
    public final h27 t;
    public final bb5 u;
    public final boolean v;
    public final boolean w;
    public final String x;
    public final ex8 y;
    public final mh4<g2b> z;

    public re1() {
        throw null;
    }

    public re1(h27 h27Var, bb5 bb5Var, boolean z, boolean z2, String str, ex8 ex8Var, mh4 mh4Var) {
        this.t = h27Var;
        this.u = bb5Var;
        this.v = z;
        this.w = z2;
        this.x = str;
        this.y = ex8Var;
        this.z = mh4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new af1(this.t, this.u, this.v, this.w, this.x, this.y, this.z);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((af1) cVar).r2(this.t, this.u, this.v, this.w, this.x, this.y, this.z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || re1.class != obj.getClass()) {
            return false;
        }
        re1 re1Var = (re1) obj;
        return xj5.a(this.t, re1Var.t) && xj5.a(this.u, re1Var.u) && this.v == re1Var.v && this.w == re1Var.w && xj5.a(this.x, re1Var.x) && xj5.a(this.y, re1Var.y) && this.z == re1Var.z;
    }

    public final int hashCode() {
        h27 h27Var = this.t;
        int iHashCode = (h27Var != null ? h27Var.hashCode() : 0) * 31;
        bb5 bb5Var = this.u;
        int iA = uo2.a(uo2.a((iHashCode + (bb5Var != null ? bb5Var.hashCode() : 0)) * 31, this.v, 31), this.w, 31);
        String str = this.x;
        int iHashCode2 = (iA + (str != null ? str.hashCode() : 0)) * 31;
        ex8 ex8Var = this.y;
        return this.z.hashCode() + ((iHashCode2 + (ex8Var != null ? Integer.hashCode(ex8Var.a) : 0)) * 31);
    }
}
