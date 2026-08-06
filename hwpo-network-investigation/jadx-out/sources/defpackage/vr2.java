package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vr2 implements cl6 {
    public final pj5 t;
    public final rj5 u;
    public final vj5 v;

    public vr2(pj5 pj5Var, rj5 rj5Var, vj5 vj5Var) {
        this.t = pj5Var;
        this.u = rj5Var;
        this.v = vj5Var;
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
        rj5 rj5Var = rj5.u;
        pj5 pj5Var = this.t;
        vj5 vj5Var = this.v;
        vj5 vj5Var2 = vj5.t;
        rj5 rj5Var2 = this.u;
        if (vj5Var == vj5Var2) {
            return new m34(rj5Var2 == rj5Var ? pj5Var.C(xx1.g(j)) : pj5Var.A(xx1.g(j)), xx1.c(j) ? xx1.g(j) : 32767);
        }
        return new m34(xx1.d(j) ? xx1.h(j) : 32767, rj5Var2 == rj5Var ? pj5Var.o(xx1.h(j)) : pj5Var.c0(xx1.h(j)));
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
