package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class xx5 extends vx6<ay5> {
    public final mh4<hw5> t;
    public final sx5 u;
    public final fl7 v;
    public final boolean w;

    public xx5(mh4 mh4Var, sx5 sx5Var, fl7 fl7Var, boolean z) {
        this.t = mh4Var;
        this.u = sx5Var;
        this.v = fl7Var;
        this.w = z;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new ay5(this.t, this.u, this.v, this.w);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ay5 ay5Var = (ay5) cVar;
        ay5Var.H = this.t;
        ay5Var.I = this.u;
        fl7 fl7Var = ay5Var.J;
        fl7 fl7Var2 = this.v;
        if (fl7Var != fl7Var2) {
            ay5Var.J = fl7Var2;
            ew2.f(ay5Var).R();
        }
        boolean z = ay5Var.K;
        boolean z2 = this.w;
        if (z == z2) {
            return;
        }
        ay5Var.K = z2;
        ay5Var.c2();
        ew2.f(ay5Var).R();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx5)) {
            return false;
        }
        xx5 xx5Var = (xx5) obj;
        return this.t == xx5Var.t && xj5.a(this.u, xx5Var.u) && this.v == xx5Var.v && this.w == xx5Var.w;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + uo2.a((this.v.hashCode() + ((this.u.hashCode() + (this.t.hashCode() * 31)) * 31)) * 31, this.w, 31);
    }
}
