package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ha9 {
    public static final void a(final fr1 fr1Var, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1162635549);
        if (bj4VarO.A(i & 1, (i & 3) != 2)) {
            nu1.a(ib9.a.a(null), fr1Var, bj4VarO, 56);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(i) { // from class: ga9
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(7);
                    ha9.a(this.t, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
