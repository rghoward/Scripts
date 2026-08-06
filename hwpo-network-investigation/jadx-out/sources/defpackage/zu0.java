package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class zu0 extends vx6<av0> {
    public final sp0 t;
    public final boolean u;

    public zu0(sp0 sp0Var, boolean z) {
        this.t = sp0Var;
        this.u = z;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        av0 av0Var = new av0();
        av0Var.H = this.t;
        av0Var.I = this.u;
        return av0Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        av0 av0Var = (av0) cVar;
        av0Var.H = this.t;
        av0Var.I = this.u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        zu0 zu0Var = obj instanceof zu0 ? (zu0) obj : null;
        return zu0Var != null && xj5.a(this.t, zu0Var.t) && this.u == zu0Var.u;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.u) + (this.t.hashCode() * 31);
    }
}
