package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hc1 extends vx6<gc1> {
    public final dc1 t;

    public hc1(dc1 dc1Var) {
        this.t = dc1Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        gc1 gc1Var = new gc1();
        gc1Var.H = this.t;
        return gc1Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        gc1 gc1Var = (gc1) cVar;
        gc1Var.H = this.t;
        ew2.f(gc1Var).R();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hc1) {
            return this.t == ((hc1) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
