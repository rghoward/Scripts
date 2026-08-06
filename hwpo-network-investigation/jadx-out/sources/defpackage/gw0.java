package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class gw0 extends vx6<lw0> {
    public final fw0 t;

    public gw0(fw0 fw0Var) {
        this.t = fw0Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        lw0 lw0Var = new lw0();
        lw0Var.H = this.t;
        return lw0Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        lw0 lw0Var = (lw0) cVar;
        fw0 fw0Var = lw0Var.H;
        if (fw0Var instanceof jw0) {
            ((jw0) fw0Var).a.n(lw0Var);
        }
        fw0 fw0Var2 = this.t;
        if (fw0Var2 instanceof jw0) {
            ((jw0) fw0Var2).a.d(lw0Var);
        }
        lw0Var.H = fw0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gw0) {
            return xj5.a(this.t, ((gw0) obj).t);
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }
}
