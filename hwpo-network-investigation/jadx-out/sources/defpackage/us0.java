package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class us0 extends vx6<ts0> {
    public final float t;
    public final fx0 u;
    public final jl9 v;

    public us0(float f, fx0 fx0Var, jl9 jl9Var) {
        this.t = f;
        this.u = fx0Var;
        this.v = jl9Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new ts0(this.t, this.u, this.v);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        ts0 ts0Var = (ts0) cVar;
        float f = ts0Var.K;
        o01 o01Var = ts0Var.N;
        float f2 = this.t;
        if (!y43.e(f, f2)) {
            ts0Var.K = f2;
            o01Var.M();
        }
        fx0 fx0Var = ts0Var.L;
        fx0 fx0Var2 = this.u;
        if (!xj5.a(fx0Var, fx0Var2)) {
            ts0Var.L = fx0Var2;
            o01Var.M();
        }
        jl9 jl9Var = ts0Var.M;
        jl9 jl9Var2 = this.v;
        if (xj5.a(jl9Var, jl9Var2)) {
            return;
        }
        ts0Var.M = jl9Var2;
        o01Var.M();
        ew2.f(ts0Var).R();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us0)) {
            return false;
        }
        us0 us0Var = (us0) obj;
        return y43.e(this.t, us0Var.t) && xj5.a(this.u, us0Var.u) && xj5.a(this.v, us0Var.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + ((this.u.hashCode() + (Float.hashCode(this.t) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) y43.f(this.t)) + ", brush=" + this.u + ", shape=" + this.v + ')';
    }
}
