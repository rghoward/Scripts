package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class t99 extends vx6<x99> {
    public final boolean t;
    public final h27 u;
    public final bb5 v;
    public final boolean w;
    public final mh4<g2b> x;

    public t99() {
        throw null;
    }

    public t99(boolean z, h27 h27Var, cx8 cx8Var, boolean z2, mh4 mh4Var) {
        this.t = z;
        this.u = h27Var;
        this.v = cx8Var;
        this.w = z2;
        this.x = mh4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        x99 x99Var = new x99(this.u, this.v, false, this.w, null, null, this.x);
        x99Var.h0 = this.t;
        return x99Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        x99 x99Var = (x99) cVar;
        boolean z = x99Var.h0;
        boolean z2 = this.t;
        if (z != z2) {
            x99Var.h0 = z2;
            ew2.f(x99Var).R();
        }
        x99Var.r2(this.u, this.v, false, this.w, null, null, this.x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t99.class != obj.getClass()) {
            return false;
        }
        t99 t99Var = (t99) obj;
        return this.t == t99Var.t && xj5.a(this.u, t99Var.u) && xj5.a(this.v, t99Var.v) && this.w == t99Var.w && this.x == t99Var.x;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.t) * 31;
        h27 h27Var = this.u;
        int iHashCode2 = (iHashCode + (h27Var != null ? h27Var.hashCode() : 0)) * 31;
        bb5 bb5Var = this.v;
        return this.x.hashCode() + uo2.a(uo2.a((iHashCode2 + (bb5Var != null ? bb5Var.hashCode() : 0)) * 31, false, 31), this.w, 961);
    }
}
