package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class xq5 extends vx6<zq5> {
    public final Object t;

    public xq5(Object obj) {
        this.t = obj;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        zq5 zq5Var = new zq5();
        zq5Var.H = this.t;
        return zq5Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((zq5) cVar).H = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xq5) && xj5.a(this.t, ((xq5) obj).t);
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.t + ')';
    }
}
