package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tq7 implements ox5, t69 {
    public final /* synthetic */ t69 a;
    public final /* synthetic */ dr7 b;

    public tq7(t69 t69Var, dr7 dr7Var) {
        this.b = dr7Var;
        this.a = t69Var;
    }

    @Override // defpackage.ox5
    public final int a() {
        return ((kp7) th1.G(this.b.n().f())).getIndex();
    }

    @Override // defpackage.ox5
    public final int b() {
        return this.b.o();
    }

    @Override // defpackage.ox5
    public final void c(int i, int i2) {
        dr7 dr7Var = this.b;
        float fQ = dr7Var.q();
        dr7Var.u(fQ != 0.0f ? i2 / fQ : 0.0f, i, true);
    }

    @Override // defpackage.ox5
    public final int d() {
        return this.b.f;
    }

    @Override // defpackage.ox5
    public final int e(int i) {
        dr7 dr7Var = this.b;
        return (int) (uh8.h(zv.d(dr7Var) + ((long) wk6.b(((dr7Var.q() * (i - dr7Var.k())) - (dr7Var.l() * dr7Var.q())) + 0.0f)), dr7Var.h, dr7Var.g) - zv.d(dr7Var));
    }

    @Override // defpackage.t69
    public final float f(float f) {
        return this.a.f(f);
    }

    @Override // defpackage.ox5
    public final int g() {
        return this.b.e;
    }
}
