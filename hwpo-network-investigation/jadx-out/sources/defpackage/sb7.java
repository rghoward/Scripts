package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sb7 implements cl6 {
    public final pj5 t;
    public final ub7 u;
    public final vb7 v;

    public sb7(pj5 pj5Var, ub7 ub7Var, vb7 vb7Var) {
        this.t = pj5Var;
        this.u = ub7Var;
        this.v = vb7Var;
    }

    @Override // defpackage.pj5
    public final int A(int i) {
        return this.t.A(i);
    }

    @Override // defpackage.pj5
    public final int C(int i) {
        return this.t.C(i);
    }

    @Override // defpackage.cl6
    public final jz7 E(long j) {
        ub7 ub7Var = ub7.u;
        pj5 pj5Var = this.t;
        vb7 vb7Var = this.v;
        vb7 vb7Var2 = vb7.t;
        ub7 ub7Var2 = this.u;
        if (vb7Var == vb7Var2) {
            return new tb7(ub7Var2 == ub7Var ? pj5Var.C(xx1.g(j)) : pj5Var.A(xx1.g(j)), xx1.c(j) ? xx1.g(j) : 32767);
        }
        return new tb7(xx1.d(j) ? xx1.h(j) : 32767, ub7Var2 == ub7Var ? pj5Var.o(xx1.h(j)) : pj5Var.c0(xx1.h(j)));
    }

    @Override // defpackage.pj5
    public final int c0(int i) {
        return this.t.c0(i);
    }

    @Override // defpackage.pj5
    public final Object g() {
        return this.t.g();
    }

    @Override // defpackage.pj5
    public final int o(int i) {
        return this.t.o(i);
    }
}
