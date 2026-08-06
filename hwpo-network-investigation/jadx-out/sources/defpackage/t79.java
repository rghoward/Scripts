package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t79 extends vx6<r69> {
    public final x69 t;
    public final boolean u = true;

    public t79(x69 x69Var) {
        this.t = x69Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        r69 r69Var = new r69();
        r69Var.H = this.t;
        r69Var.I = this.u;
        return r69Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        r69 r69Var = (r69) cVar;
        r69Var.H = this.t;
        r69Var.I = this.u;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t79)) {
            return false;
        }
        t79 t79Var = (t79) obj;
        return xj5.a(this.t, t79Var.t) && this.u == t79Var.u;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.u) + uo2.a(this.t.hashCode() * 31, false, 31);
    }
}
