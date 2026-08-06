package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kqb extends ox6.c implements lr5 {
    public d13 H;
    public ci4<? super kg5, ? super tq5, bg5> I;

    public kqb() {
        throw null;
    }

    @Override // defpackage.lr5
    public final gl6 e(final hl6 hl6Var, cl6 cl6Var, long j) {
        final jz7 jz7VarE = cl6Var.E(zx1.a(this.H != d13.t ? 0 : xx1.j(j), xx1.h(j), this.H == d13.u ? xx1.i(j) : 0, xx1.g(j)));
        final int iG = uh8.g(jz7VarE.t, xx1.j(j), xx1.h(j));
        final int iG2 = uh8.g(jz7VarE.u, xx1.i(j), xx1.g(j));
        return hl6Var.y0(iG, iG2, if3.t, new oh4() { // from class: jqb
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                ci4<? super kg5, ? super tq5, bg5> ci4Var = this.t.I;
                jz7 jz7Var = jz7VarE;
                jz7.a.q((jz7.a) obj, jz7Var, ci4Var.invoke(new kg5((((long) (iG - jz7Var.t)) << 32) | (((long) (iG2 - jz7Var.u)) & 4294967295L)), hl6Var.getLayoutDirection()).a);
                return g2b.a;
            }
        });
    }
}
