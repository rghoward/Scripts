package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class i84 extends vx6<k84> {
    public final oh4<v94, g2b> t;

    /* JADX WARN: Multi-variable type inference failed */
    public i84(oh4<? super v94, g2b> oh4Var) {
        this.t = oh4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        k84 k84Var = new k84();
        k84Var.H = this.t;
        return k84Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((k84) cVar).H = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i84) {
            return this.t == ((i84) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
