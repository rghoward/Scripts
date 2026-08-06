package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class no7 extends ox6.c implements lr5 {
    public go7 H;

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        float fB = this.H.b(hl6Var.getLayoutDirection());
        float fD = this.H.d();
        float fC = this.H.c(hl6Var.getLayoutDirection());
        float fA = this.H.a();
        if (!((y43.a(fB, 0.0f) >= 0) & (y43.a(fD, 0.0f) >= 0) & (y43.a(fC, 0.0f) >= 0) & (y43.a(fA, 0.0f) >= 0))) {
            sc5.a("Padding must be non-negative");
        }
        final int iN1 = hl6Var.n1(fB);
        int iN2 = hl6Var.n1(fC) + iN1;
        final int iN3 = hl6Var.n1(fD);
        int iN4 = hl6Var.n1(fA) + iN3;
        final jz7 jz7VarE = cl6Var.E(zx1.i(j, -iN2, -iN4));
        return hl6Var.y0(zx1.g(jz7VarE.t + iN2, j), zx1.f(jz7VarE.u + iN4, j), if3.t, new oh4() { // from class: mo7
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                ((jz7.a) obj).l(jz7VarE, iN1, iN3, 0.0f);
                return g2b.a;
            }
        });
    }
}
