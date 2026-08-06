package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class je5 extends ae5 implements lr5 {
    public omb J;

    public je5(omb ombVar) {
        this.J = ombVar;
    }

    @Override // defpackage.ae5
    public final omb c2(omb ombVar) {
        return new d2b(ombVar, this.J);
    }

    @Override // defpackage.ae5
    public final void d2() {
        super.d2();
        ew2.f(this).Q();
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        final int iD = this.I.d(hl6Var, hl6Var.getLayoutDirection()) - this.H.d(hl6Var, hl6Var.getLayoutDirection());
        final int iA = this.I.a(hl6Var) - this.H.a(hl6Var);
        int iB = (this.I.b(hl6Var, hl6Var.getLayoutDirection()) - this.H.b(hl6Var, hl6Var.getLayoutDirection())) + iD;
        int iC = (this.I.c(hl6Var) - this.H.c(hl6Var)) + iA;
        final jz7 jz7VarE = cl6Var.E(zx1.i(j, -iB, -iC));
        return hl6Var.y0(zx1.g(jz7VarE.t + iB, j), zx1.f(jz7VarE.u + iC, j), if3.t, new oh4() { // from class: ie5
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                ((jz7.a) obj).l(jz7VarE, iD, iA, 0.0f);
                return g2b.a;
            }
        });
    }
}
