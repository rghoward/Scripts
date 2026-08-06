package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cg1 implements ir5 {
    @Override // defpackage.ir5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        float f;
        float fF0 = hl6Var.F0(xx1.g(j));
        if (y43.a(fF0, xna.l) >= 0) {
            f = y48.x;
        } else {
            f = y43.a(fF0, xna.m) >= 0 ? xna.n : xna.o;
        }
        int iN1 = hl6Var.n1(f);
        if (!((iN1 >= 0) & (iN1 >= 0))) {
            wc5.a("width and height must be >= 0");
        }
        jz7 jz7VarE = cl6Var.E(zx1.h(iN1, iN1, iN1, iN1));
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new s1(1, jz7VarE));
    }
}
