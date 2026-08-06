package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class c79 extends vx6<n79> {
    public final s79 t;
    public final fl7 u;
    public final boolean v;
    public final boolean w;
    public final h27 x;

    public c79(s79 s79Var, fl7 fl7Var, boolean z, boolean z2, h27 h27Var) {
        this.t = s79Var;
        this.u = fl7Var;
        this.v = z;
        this.w = z2;
        this.x = h27Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new n79(null, null, this.x, this.u, null, this.t, this.v, this.w);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((n79) cVar).x2(null, null, this.x, this.u, null, this.t, this.v, this.w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c79)) {
            return false;
        }
        c79 c79Var = (c79) obj;
        return xj5.a(this.t, c79Var.t) && this.u == c79Var.u && this.v == c79Var.v && this.w == c79Var.w && xj5.a(this.x, c79Var.x);
    }

    public final int hashCode() {
        int iA = uo2.a(uo2.a((this.u.hashCode() + (this.t.hashCode() * 31)) * 961, this.v, 31), this.w, 961);
        h27 h27Var = this.x;
        return (iA + (h27Var != null ? h27Var.hashCode() : 0)) * 31;
    }
}
