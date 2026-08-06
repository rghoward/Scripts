package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wj5 extends tj5 {
    public sj5 H;
    public boolean I;

    @Override // defpackage.tj5
    public final long c2(cl6 cl6Var, long j) {
        int iA = this.H == sj5.t ? cl6Var.A(xx1.g(j)) : cl6Var.C(xx1.g(j));
        if (iA < 0) {
            iA = 0;
        }
        if (iA < 0) {
            wc5.a("width must be >= 0");
        }
        return zx1.h(iA, iA, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.tj5
    public final boolean d2() {
        return this.I;
    }

    @Override // defpackage.tj5, defpackage.lr5
    public final int v(df6 df6Var, pj5 pj5Var, int i) {
        return this.H == sj5.t ? pj5Var.A(i) : pj5Var.C(i);
    }

    @Override // defpackage.tj5, defpackage.lr5
    public final int x(df6 df6Var, pj5 pj5Var, int i) {
        return this.H == sj5.t ? pj5Var.A(i) : pj5Var.C(i);
    }
}
