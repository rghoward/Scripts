package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l63 extends vx6<p63> {
    public static final w7 z = new w7(1);
    public final q63 t;
    public final fl7 u = fl7.t;
    public final boolean v;
    public final boolean w;
    public final ei4<t72, vf7, r02<? super g2b>, Object> x;
    public final ei4<t72, Float, r02<? super g2b>, Object> y;

    public l63(q63 q63Var, boolean z2, boolean z3, m63.a aVar, ei4 ei4Var) {
        this.t = q63Var;
        this.v = z2;
        this.w = z3;
        this.x = aVar;
        this.y = ei4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        w7 w7Var = z;
        boolean z2 = this.v;
        fl7 fl7Var = this.u;
        p63 p63Var = new p63(w7Var, z2, null, fl7Var);
        p63Var.c0 = this.t;
        p63Var.d0 = fl7Var;
        p63Var.e0 = this.w;
        p63Var.f0 = this.x;
        p63Var.g0 = this.y;
        return p63Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        boolean z2;
        boolean z3;
        p63 p63Var = (p63) cVar;
        q63 q63Var = p63Var.c0;
        q63 q63Var2 = this.t;
        if (xj5.a(q63Var, q63Var2)) {
            z2 = false;
        } else {
            p63Var.c0 = q63Var2;
            z2 = true;
        }
        fl7 fl7Var = p63Var.d0;
        fl7 fl7Var2 = this.u;
        if (fl7Var != fl7Var2) {
            p63Var.d0 = fl7Var2;
            z3 = true;
        } else {
            z3 = z2;
        }
        p63Var.f0 = this.x;
        p63Var.g0 = this.y;
        p63Var.e0 = this.w;
        p63Var.w2(z, this.v, null, fl7Var2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l63.class != obj.getClass()) {
            return false;
        }
        l63 l63Var = (l63) obj;
        return xj5.a(this.t, l63Var.t) && this.u == l63Var.u && this.v == l63Var.v && this.w == l63Var.w && xj5.a(this.x, l63Var.x) && xj5.a(this.y, l63Var.y);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.y.hashCode() + ((this.x.hashCode() + uo2.a(uo2.a((this.u.hashCode() + (this.t.hashCode() * 31)) * 31, this.v, 961), this.w, 31)) * 31)) * 31);
    }
}
