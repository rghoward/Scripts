package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sl6 implements cl6 {
    public final pj5 t;
    public final ul6 u;
    public final vl6 v;

    public sl6(pj5 pj5Var, ul6 ul6Var, vl6 vl6Var) {
        this.t = pj5Var;
        this.u = ul6Var;
        this.v = vl6Var;
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
        ul6 ul6Var = ul6.u;
        pj5 pj5Var = this.t;
        vl6 vl6Var = this.v;
        vl6 vl6Var2 = vl6.t;
        ul6 ul6Var2 = this.u;
        if (vl6Var == vl6Var2) {
            return new tl6(ul6Var2 == ul6Var ? pj5Var.C(xx1.g(j)) : pj5Var.A(xx1.g(j)), xx1.c(j) ? xx1.g(j) : 32767);
        }
        return new tl6(xx1.d(j) ? xx1.h(j) : 32767, ul6Var2 == ul6Var ? pj5Var.o(xx1.h(j)) : pj5Var.c0(xx1.h(j)));
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
