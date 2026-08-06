package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class rq3 extends vx6<sq3> {
    public final gb3 t;

    public rq3(gb3 gb3Var) {
        this.t = gb3Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        sq3 sq3Var = new sq3();
        sq3Var.H = this.t;
        return sq3Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ((sq3) cVar).H = this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rq3) {
            return this.t == ((rq3) obj).t;
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
