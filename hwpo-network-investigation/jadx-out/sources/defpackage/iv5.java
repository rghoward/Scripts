package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iv5 extends vx6<jv5> {
    public final a04<Float> t;
    public final a04<Float> u;

    public iv5(a04 a04Var, a04 a04Var2) {
        this.t = a04Var;
        this.u = a04Var2;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        jv5 jv5Var = new jv5();
        jv5Var.H = this.t;
        jv5Var.I = this.u;
        return jv5Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        jv5 jv5Var = (jv5) cVar;
        jv5Var.H = this.t;
        jv5Var.I = this.u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv5)) {
            return false;
        }
        iv5 iv5Var = (iv5) obj;
        return xj5.a(this.t, iv5Var.t) && xj5.a(this.u, iv5Var.u);
    }

    public final int hashCode() {
        a04<Float> a04Var = this.t;
        int iHashCode = (a04Var == null ? 0 : a04Var.hashCode()) * 961;
        a04<Float> a04Var2 = this.u;
        return iHashCode + (a04Var2 != null ? a04Var2.hashCode() : 0);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.t + ", placementSpec=null, fadeOutSpec=" + this.u + ')';
    }
}
