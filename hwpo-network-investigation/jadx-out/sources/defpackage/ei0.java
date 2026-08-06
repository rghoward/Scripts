package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
final class ei0 extends vx6<ii0> {
    public final long t;
    public final fx0 u;
    public final float v;
    public final jl9 w;

    public ei0(long j, h86 h86Var, jl9 jl9Var, int i) {
        j = (i & 1) != 0 ? uh1.k : j;
        h86Var = (i & 2) != 0 ? null : h86Var;
        this.t = j;
        this.u = h86Var;
        this.v = 1.0f;
        this.w = jl9Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        ii0 ii0Var = new ii0();
        ii0Var.H = this.t;
        ii0Var.I = this.u;
        ii0Var.J = this.v;
        ii0Var.K = this.w;
        ii0Var.L = 9205357640488583168L;
        return ii0Var;
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ii0 ii0Var = (ii0) cVar;
        ii0Var.H = this.t;
        ii0Var.I = this.u;
        ii0Var.J = this.v;
        jl9 jl9Var = ii0Var.K;
        jl9 jl9Var2 = this.w;
        if (!xj5.a(jl9Var, jl9Var2)) {
            ii0Var.K = jl9Var2;
            ew2.f(ii0Var).R();
        }
        b73.a(ii0Var);
    }

    public final boolean equals(Object obj) {
        ei0 ei0Var = obj instanceof ei0 ? (ei0) obj : null;
        return ei0Var != null && uh1.c(this.t, ei0Var.t) && xj5.a(this.u, ei0Var.u) && this.v == ei0Var.v && xj5.a(this.w, ei0Var.w);
    }

    public final int hashCode() {
        int i = uh1.l;
        int iHashCode = Long.hashCode(this.t) * 31;
        fx0 fx0Var = this.u;
        return this.w.hashCode() + h44.a((iHashCode + (fx0Var != null ? fx0Var.hashCode() : 0)) * 31, this.v, 31);
    }
}
