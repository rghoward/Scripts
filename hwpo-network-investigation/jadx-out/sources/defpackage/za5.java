package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class za5 extends vx6<ab5> {
    public final h27 t;
    public final bb5 u;

    public za5(h27 h27Var, bb5 bb5Var) {
        this.t = h27Var;
        this.u = bb5Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        dw2 dw2VarA = this.u.a(this.t);
        ab5 ab5Var = new ab5();
        ab5Var.J = dw2VarA;
        ab5Var.c2(dw2VarA);
        return ab5Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ab5 ab5Var = (ab5) cVar;
        dw2 dw2VarA = this.u.a(this.t);
        ab5Var.d2(ab5Var.J);
        ab5Var.J = dw2VarA;
        ab5Var.c2(dw2VarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za5)) {
            return false;
        }
        za5 za5Var = (za5) obj;
        return xj5.a(this.t, za5Var.t) && xj5.a(this.u, za5Var.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + (this.t.hashCode() * 31);
    }
}
