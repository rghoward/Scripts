package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class y69 extends vx6<b79> {
    public final in7 A;
    public final s79 t;
    public final fl7 u;
    public final boolean v;
    public final g44 w;
    public final h27 x;
    public final pw0 y;
    public final boolean z;

    public y69(pw0 pw0Var, g44 g44Var, h27 h27Var, fl7 fl7Var, in7 in7Var, s79 s79Var, boolean z, boolean z2) {
        this.t = s79Var;
        this.u = fl7Var;
        this.v = z;
        this.w = g44Var;
        this.x = h27Var;
        this.y = pw0Var;
        this.z = z2;
        this.A = in7Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        b79 b79Var = new b79();
        b79Var.J = this.t;
        b79Var.K = this.u;
        b79Var.L = this.v;
        b79Var.M = this.w;
        b79Var.N = this.x;
        b79Var.O = this.y;
        b79Var.P = this.z;
        b79Var.Q = this.A;
        return b79Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((b79) cVar).h2(this.y, this.w, this.x, this.u, this.A, this.t, this.z, this.v);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y69.class != obj.getClass()) {
            return false;
        }
        y69 y69Var = (y69) obj;
        return xj5.a(this.t, y69Var.t) && this.u == y69Var.u && this.v == y69Var.v && xj5.a(this.w, y69Var.w) && xj5.a(this.x, y69Var.x) && xj5.a(this.y, y69Var.y) && this.z == y69Var.z && xj5.a(this.A, y69Var.A);
    }

    public final int hashCode() {
        int iA = uo2.a(uo2.a((this.u.hashCode() + (this.t.hashCode() * 31)) * 31, this.v, 31), false, 31);
        g44 g44Var = this.w;
        int iHashCode = (iA + (g44Var != null ? g44Var.hashCode() : 0)) * 31;
        h27 h27Var = this.x;
        int iHashCode2 = (iHashCode + (h27Var != null ? h27Var.hashCode() : 0)) * 31;
        pw0 pw0Var = this.y;
        int iA2 = uo2.a((iHashCode2 + (pw0Var != null ? pw0Var.hashCode() : 0)) * 31, this.z, 31);
        in7 in7Var = this.A;
        return iA2 + (in7Var != null ? in7Var.hashCode() : 0);
    }
}
