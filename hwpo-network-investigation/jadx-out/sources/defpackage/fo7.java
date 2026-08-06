package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fo7 extends ox6.c implements lr5 {
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        int iN1 = hl6Var.n1(this.J) + hl6Var.n1(this.H);
        int iN2 = hl6Var.n1(this.K) + hl6Var.n1(this.I);
        jz7 jz7VarE = cl6Var.E(zx1.i(j, -iN1, -iN2));
        return hl6Var.y0(zx1.g(jz7VarE.t + iN1, j), zx1.f(jz7VarE.u + iN2, j), if3.t, new ja4(1, this, jz7VarE));
    }
}
