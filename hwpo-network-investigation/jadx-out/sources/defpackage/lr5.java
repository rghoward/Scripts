package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface lr5 extends dw2 {
    gl6 e(hl6 hl6Var, cl6 cl6Var, long j);

    default int f(df6 df6Var, pj5 pj5Var, int i) {
        return e(new ck5(df6Var, df6Var.getLayoutDirection()), new sb7(pj5Var, ub7.u, vb7.u), zx1.b(0, i, 0, 0, 13)).h();
    }

    default int j(df6 df6Var, pj5 pj5Var, int i) {
        return e(new ck5(df6Var, df6Var.getLayoutDirection()), new sb7(pj5Var, ub7.t, vb7.u), zx1.b(0, i, 0, 0, 13)).h();
    }

    default int v(df6 df6Var, pj5 pj5Var, int i) {
        return e(new ck5(df6Var, df6Var.getLayoutDirection()), new sb7(pj5Var, ub7.t, vb7.t), zx1.b(0, 0, 0, i, 7)).j();
    }

    default int x(df6 df6Var, pj5 pj5Var, int i) {
        return e(new ck5(df6Var, df6Var.getLayoutDirection()), new sb7(pj5Var, ub7.u, vb7.t), zx1.b(0, 0, 0, i, 7)).j();
    }
}
