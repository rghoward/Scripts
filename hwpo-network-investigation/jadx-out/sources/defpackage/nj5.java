package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nj5 extends tj5 {
    public sj5 H;
    public boolean I;

    @Override // defpackage.tj5
    public final long c2(cl6 cl6Var, long j) {
        int iC0 = this.H == sj5.t ? cl6Var.c0(xx1.h(j)) : cl6Var.o(xx1.h(j));
        if (iC0 < 0) {
            iC0 = 0;
        }
        if (iC0 < 0) {
            wc5.a("height must be >= 0");
        }
        return zx1.h(0, Integer.MAX_VALUE, iC0, iC0);
    }

    @Override // defpackage.tj5
    public final boolean d2() {
        return this.I;
    }

    @Override // defpackage.tj5, defpackage.lr5
    public final int f(df6 df6Var, pj5 pj5Var, int i) {
        return this.H == sj5.t ? pj5Var.c0(i) : pj5Var.o(i);
    }

    @Override // defpackage.tj5, defpackage.lr5
    public final int j(df6 df6Var, pj5 pj5Var, int i) {
        return this.H == sj5.t ? pj5Var.c0(i) : pj5Var.o(i);
    }
}
