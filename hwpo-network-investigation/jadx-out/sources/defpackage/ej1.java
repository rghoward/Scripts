package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class ej1 extends vx6<fj1> {
    public final h27 t;
    public final boolean u;
    public final mh4<g2b> v;
    public final boolean w;

    public ej1() {
        throw null;
    }

    public ej1(h27 h27Var, mh4 mh4Var) {
        this.t = h27Var;
        this.u = true;
        this.v = mh4Var;
        this.w = true;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new fj1(this.v, this.w, this.t, this.u);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        fj1 fj1Var = (fj1) cVar;
        fj1Var.getClass();
        boolean z = fj1Var.O;
        boolean z2 = this.u;
        boolean z3 = z != z2;
        fj1Var.r2(this.t, null, false, z2, null, null, this.v);
        if (z3) {
            v6a v6aVar = fj1Var.S;
            if (v6aVar != null) {
                v6aVar.O1();
                g2b g2bVar = g2b.a;
            }
            fj1Var.s2(false);
            fj1Var.s2(true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ej1.class != obj.getClass()) {
            return false;
        }
        ej1 ej1Var = (ej1) obj;
        return xj5.a(this.t, ej1Var.t) && this.u == ej1Var.u && this.v == ej1Var.v && this.w == ej1Var.w;
    }

    public final int hashCode() {
        h27 h27Var = this.t;
        return Boolean.hashCode(this.w) + ((this.v.hashCode() + uo2.a(uo2.a((h27Var != null ? h27Var.hashCode() : 0) * 961, false, 31), this.u, 29791)) * 923521);
    }
}
