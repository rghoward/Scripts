package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nt7 extends ox6.c implements lr5 {
    public float H;
    public yz9<Integer> I;
    public yz9<Integer> J;

    public nt7() {
        throw null;
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        yz9<Integer> yz9Var = this.I;
        int iRound = (yz9Var == null || yz9Var.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(yz9Var.getValue().floatValue() * this.H);
        yz9<Integer> yz9Var2 = this.J;
        int iRound2 = (yz9Var2 == null || yz9Var2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(yz9Var2.getValue().floatValue() * this.H);
        int iJ = iRound != Integer.MAX_VALUE ? iRound : xx1.j(j);
        int i = iRound2 != Integer.MAX_VALUE ? iRound2 : xx1.i(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = xx1.h(j);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = xx1.g(j);
        }
        final jz7 jz7VarE = cl6Var.E(zx1.a(iJ, iRound, i, iRound2));
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new oh4() { // from class: mt7
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                ((jz7.a) obj).l(jz7VarE, 0, 0, 0.0f);
                return g2b.a;
            }
        });
    }
}
