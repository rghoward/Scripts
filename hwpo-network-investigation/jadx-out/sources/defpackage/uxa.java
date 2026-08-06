package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class uxa extends vx6<vxa> {
    public final lx5 t;

    public uxa(lx5 lx5Var) {
        this.t = lx5Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new vxa(this.t);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((vxa) cVar).H = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uxa) && xj5.a(this.t, ((uxa) obj).t);
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.t + ')';
    }
}
