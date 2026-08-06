package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tj5 extends ox6.c implements lr5 {
    public abstract long c2(cl6 cl6Var, long j);

    public abstract boolean d2();

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        long jC2 = c2(cl6Var, j);
        if (d2()) {
            jC2 = zx1.e(j, jC2);
        }
        jz7 jz7VarE = cl6Var.E(jC2);
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new t62(2, jz7VarE));
    }

    public int f(df6 df6Var, pj5 pj5Var, int i) {
        return pj5Var.o(i);
    }

    public int j(df6 df6Var, pj5 pj5Var, int i) {
        return pj5Var.c0(i);
    }

    @Override // defpackage.lr5
    public int v(df6 df6Var, pj5 pj5Var, int i) {
        return pj5Var.A(i);
    }

    @Override // defpackage.lr5
    public int x(df6 df6Var, pj5 pj5Var, int i) {
        return pj5Var.C(i);
    }
}
