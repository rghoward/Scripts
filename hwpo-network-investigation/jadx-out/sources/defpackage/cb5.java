package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cb5 extends vx6<eb5> {
    public final boolean t;
    public final boolean u;
    public final h27 v;
    public final pda w;
    public final jl9 x;
    public final float y = 2.0f;
    public final float z = 1.0f;

    public cb5(boolean z, boolean z2, h27 h27Var, pda pdaVar, jl9 jl9Var) {
        this.t = z;
        this.u = z2;
        this.v = h27Var;
        this.w = pdaVar;
        this.x = jl9Var;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new eb5(this.t, this.u, this.v, this.w, this.x, this.y, this.z);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        boolean z;
        eb5 eb5Var = (eb5) cVar;
        boolean z2 = eb5Var.J;
        boolean z3 = this.t;
        boolean z4 = true;
        if (z2 != z3) {
            eb5Var.J = z3;
            z = true;
        } else {
            z = false;
        }
        boolean z5 = eb5Var.K;
        boolean z6 = this.u;
        if (z5 != z6) {
            eb5Var.K = z6;
            z = true;
        }
        h27 h27Var = eb5Var.L;
        h27 h27Var2 = this.v;
        if (h27Var != h27Var2) {
            eb5Var.L = h27Var2;
            dz9 dz9Var = eb5Var.P;
            if (dz9Var != null) {
                dz9Var.k(null);
            }
            eb5Var.P = oy0.d(eb5Var.Q1(), null, null, new gb5(eb5Var, null), 3);
        }
        pda pdaVar = eb5Var.Q;
        pda pdaVar2 = this.w;
        if (!xj5.a(pdaVar, pdaVar2)) {
            eb5Var.Q = pdaVar2;
            z = true;
        }
        jl9 jl9Var = eb5Var.S;
        jl9 jl9Var2 = this.x;
        if (!xj5.a(jl9Var, jl9Var2)) {
            if (!xj5.a(eb5Var.S, jl9Var2)) {
                eb5Var.S = jl9Var2;
                eb5Var.U.M();
            }
            z = true;
        }
        float f = eb5Var.M;
        float f2 = this.y;
        if (!y43.e(f, f2)) {
            eb5Var.M = f2;
            z = true;
        }
        float f3 = eb5Var.N;
        float f4 = this.z;
        if (y43.e(f3, f4)) {
            z4 = z;
        } else {
            eb5Var.N = f4;
        }
        if (z4) {
            eb5Var.g2();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb5)) {
            return false;
        }
        cb5 cb5Var = (cb5) obj;
        return this.t == cb5Var.t && this.u == cb5Var.u && xj5.a(this.v, cb5Var.v) && xj5.a(this.w, cb5Var.w) && xj5.a(this.x, cb5Var.x) && y43.e(this.y, cb5Var.y) && y43.e(this.z, cb5Var.z);
    }

    public final int hashCode() {
        int iHashCode = (this.v.hashCode() + uo2.a(Boolean.hashCode(this.t) * 31, this.u, 31)) * 31;
        pda pdaVar = this.w;
        int iHashCode2 = (iHashCode + (pdaVar == null ? 0 : pdaVar.hashCode())) * 31;
        jl9 jl9Var = this.x;
        return Float.hashCode(this.z) + h44.a((iHashCode2 + (jl9Var != null ? jl9Var.hashCode() : 0)) * 31, this.y, 31);
    }

    public final String toString() {
        return "IndicatorLineElement(enabled=" + this.t + ", isError=" + this.u + ", interactionSource=" + this.v + ", colors=" + this.w + ", textFieldShape=" + this.x + ", focusedIndicatorLineThickness=" + ((Object) y43.f(this.y)) + ", unfocusedIndicatorLineThickness=" + ((Object) y43.f(this.z)) + ')';
    }
}
