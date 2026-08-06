package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cz3 extends ox6.c implements lr5 {
    public d13 H;
    public float I;

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        int iJ;
        int iH;
        int iG;
        int i;
        if (!xx1.d(j) || this.H == d13.t) {
            iJ = xx1.j(j);
            iH = xx1.h(j);
        } else {
            int iRound = Math.round(xx1.h(j) * this.I);
            int iJ2 = xx1.j(j);
            iJ = xx1.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!xx1.c(j) || this.H == d13.u) {
            int i2 = xx1.i(j);
            int iG2 = xx1.g(j);
            iG = i2;
            i = iG2;
        } else {
            int iRound2 = Math.round(xx1.g(j) * this.I);
            int i3 = xx1.i(j);
            iG = xx1.g(j);
            if (iRound2 < i3) {
                iRound2 = i3;
            }
            if (iRound2 <= iG) {
                iG = iRound2;
            }
            i = iG;
        }
        final jz7 jz7VarE = cl6Var.E(zx1.a(iJ, iH, iG, i));
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new oh4() { // from class: bz3
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                jz7.a.t((jz7.a) obj, jz7VarE, 0, 0);
                return g2b.a;
            }
        });
    }
}
