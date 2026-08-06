package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ii0 extends ox6.c implements a73, rf7, qb9 {
    public long H;
    public fx0 I;
    public float J;
    public jl9 K;
    public long L;
    public tq5 M;
    public dm7 N;
    public jl9 O;
    public dm7 P;

    @Override // defpackage.qb9
    public final boolean A() {
        return false;
    }

    @Override // defpackage.qb9
    public final void E1(hc9 hc9Var) {
        ec9.g(hc9Var, this.K);
    }

    @Override // defpackage.rf7
    public final void e1() {
        this.L = 9205357640488583168L;
        this.M = null;
        this.N = null;
        this.O = null;
        b73.a(this);
    }

    @Override // defpackage.a73
    public final void t(tr5 tr5Var) {
        dm7 dm7Var;
        s41 s41Var = tr5Var.t;
        if (this.K == al8.a) {
            if (!uh1.c(this.H, uh1.k)) {
                d73.W0(tr5Var, this.H, 0L, 0L, 0.0f, 126);
            }
            fx0 fx0Var = this.I;
            if (fx0Var != null) {
                d73.Q(tr5Var, fx0Var, 0L, 0L, this.J, null, null, 118);
            }
        } else {
            if (cr9.a(s41Var.c(), this.L) && tr5Var.getLayoutDirection() == this.M && xj5.a(this.O, this.K)) {
                dm7Var = this.N;
                dm7Var.getClass();
            } else {
                sf7.a(this, new hi0(0, this, tr5Var));
                dm7Var = this.P;
                this.P = null;
            }
            this.N = dm7Var;
            this.L = s41Var.c();
            this.M = tr5Var.getLayoutDirection();
            this.O = this.K;
            dm7Var.getClass();
            if (!uh1.c(this.H, uh1.k)) {
                em7.c(tr5Var, dm7Var, this.H);
            }
            fx0 fx0Var2 = this.I;
            if (fx0Var2 != null) {
                em7.b(tr5Var, dm7Var, fx0Var2, this.J, 56);
            }
        }
        tr5Var.K1();
    }
}
