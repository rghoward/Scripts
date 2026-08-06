package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q01 extends ox6.c implements o01, rf7, my0 {
    public final s01 H;
    public boolean I;
    public oh4<? super s01, c73> J;

    public q01(s01 s01Var, oh4<? super s01, c73> oh4Var) {
        this.H = s01Var;
        this.J = oh4Var;
        s01Var.t = this;
    }

    @Override // defpackage.a73
    public final void C0() {
        M();
    }

    @Override // defpackage.dw2
    public final void H0() {
        M();
    }

    @Override // defpackage.o01
    public final void M() {
        this.I = false;
        this.H.u = null;
        b73.a(this);
    }

    @Override // ox6.c
    public final void W1() {
        M();
    }

    @Override // defpackage.my0
    public final long c() {
        return c43.c(ew2.d(this, 4).v);
    }

    @Override // defpackage.rf7
    public final void e1() {
        M();
    }

    @Override // defpackage.my0
    public final tx2 getDensity() {
        return ew2.f(this).R;
    }

    @Override // defpackage.my0
    public final tq5 getLayoutDirection() {
        return ew2.f(this).S;
    }

    @Override // defpackage.dw2
    public final void l() {
        M();
    }

    @Override // defpackage.a73
    public final void t(tr5 tr5Var) {
        boolean z = this.I;
        s01 s01Var = this.H;
        if (!z) {
            s01Var.u = null;
            sf7.a(this, new p01(this, s01Var));
            if (s01Var.u == null) {
                throw ik.a("DrawResult not defined, did you forget to call onDraw?");
            }
            this.I = true;
        }
        c73 c73Var = s01Var.u;
        c73Var.getClass();
        c73Var.a.invoke(tr5Var);
    }

    @Override // ox6.c
    public final void V1() {
    }
}
