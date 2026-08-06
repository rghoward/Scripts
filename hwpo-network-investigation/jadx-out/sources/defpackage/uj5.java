package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class uj5 extends vx6<wj5> {
    public final sj5 t = sj5.u;
    public final boolean u = true;

    @Override // defpackage.vx6
    public final ox6.c a() {
        wj5 wj5Var = new wj5();
        wj5Var.H = this.t;
        wj5Var.I = this.u;
        return wj5Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        wj5 wj5Var = (wj5) cVar;
        wj5Var.H = this.t;
        wj5Var.I = this.u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        uj5 uj5Var = obj instanceof uj5 ? (uj5) obj : null;
        return uj5Var != null && this.t == uj5Var.t && this.u == uj5Var.u;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.u) + (this.t.hashCode() * 31);
    }
}
