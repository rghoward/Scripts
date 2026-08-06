package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class f97 extends vx6<h97> {
    public final b97 t;
    public final c97 u;

    public f97(b97 b97Var, c97 c97Var) {
        this.t = b97Var;
        this.u = c97Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new h97(this.t, this.u);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        h97 h97Var = (h97) cVar;
        h97Var.H = this.t;
        c97 c97Var = h97Var.I;
        if (c97Var.a == h97Var) {
            c97Var.a = null;
        }
        c97 c97Var2 = this.u;
        if (c97Var2 == null) {
            h97Var.I = new c97();
        } else if (c97Var2 != c97Var) {
            h97Var.I = c97Var2;
        }
        if (h97Var.G) {
            c97 c97Var3 = h97Var.I;
            c97Var3.a = h97Var;
            c97Var3.b = null;
            h97Var.J = null;
            c97Var3.c = new i97(h97Var);
            c97Var3.d = h97Var.Q1();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f97)) {
            return false;
        }
        f97 f97Var = (f97) obj;
        return xj5.a(f97Var.t, this.t) && xj5.a(f97Var.u, this.u);
    }

    public final int hashCode() {
        int iHashCode = this.t.hashCode() * 31;
        c97 c97Var = this.u;
        return iHashCode + (c97Var != null ? c97Var.hashCode() : 0);
    }
}
