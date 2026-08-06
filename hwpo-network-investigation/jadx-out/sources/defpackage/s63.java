package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class s63 extends vx6<r63> {
    public final oh4<d73, g2b> t;

    /* JADX WARN: Multi-variable type inference failed */
    public s63(oh4<? super d73, g2b> oh4Var) {
        this.t = oh4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        r63 r63Var = new r63();
        r63Var.H = this.t;
        return r63Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((r63) cVar).H = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s63) {
            return this.t == ((s63) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
