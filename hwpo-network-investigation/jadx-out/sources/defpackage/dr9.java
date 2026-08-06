package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class dr9 extends vx6<er9> {
    public final xya t;
    public final sp0 u = di.a.a;

    public dr9(xya xyaVar) {
        this.t = xyaVar;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new er9(this.t, this.u);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        er9 er9Var = (er9) cVar;
        er9Var.H = this.t;
        er9Var.I = this.u;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dr9)) {
            return false;
        }
        dr9 dr9Var = (dr9) obj;
        return xj5.a(dr9Var.t, this.t) && xj5.a(dr9Var.u, this.u);
    }

    public final int hashCode() {
        return (this.u.hashCode() + (this.t.hashCode() * 31)) * 31;
    }
}
