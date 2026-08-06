package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class h73 extends vx6<i73> {
    public final oh4<cz1, g2b> t;

    /* JADX WARN: Multi-variable type inference failed */
    public h73(oh4<? super cz1, g2b> oh4Var) {
        this.t = oh4Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        i73 i73Var = new i73();
        i73Var.H = this.t;
        return i73Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((i73) cVar).H = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h73) {
            return this.t == ((h73) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
