package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l3b extends ox6.c implements lr5 {
    public float H;
    public float I;

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        int iJ;
        int i;
        if (Float.isNaN(this.H) || xx1.j(j) != 0) {
            iJ = xx1.j(j);
        } else {
            int iN1 = hl6Var.n1(this.H);
            iJ = xx1.h(j);
            if (iN1 < 0) {
                iN1 = 0;
            }
            if (iN1 <= iJ) {
                iJ = iN1;
            }
        }
        int iH = xx1.h(j);
        if (Float.isNaN(this.I) || xx1.i(j) != 0) {
            i = xx1.i(j);
        } else {
            int iN2 = hl6Var.n1(this.I);
            i = xx1.g(j);
            int i2 = iN2 >= 0 ? iN2 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        final jz7 jz7VarE = cl6Var.E(zx1.a(iJ, iH, i, xx1.g(j)));
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new oh4() { // from class: k3b
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                jz7.a.t((jz7.a) obj, jz7VarE, 0, 0);
                return g2b.a;
            }
        });
    }

    @Override // defpackage.lr5
    public final int f(df6 df6Var, pj5 pj5Var, int i) {
        int iO = pj5Var.o(i);
        int iN1 = !Float.isNaN(this.I) ? df6Var.n1(this.I) : 0;
        return iO < iN1 ? iN1 : iO;
    }

    @Override // defpackage.lr5
    public final int j(df6 df6Var, pj5 pj5Var, int i) {
        int iC0 = pj5Var.c0(i);
        int iN1 = !Float.isNaN(this.I) ? df6Var.n1(this.I) : 0;
        return iC0 < iN1 ? iN1 : iC0;
    }

    @Override // defpackage.lr5
    public final int v(df6 df6Var, pj5 pj5Var, int i) {
        int iA = pj5Var.A(i);
        int iN1 = !Float.isNaN(this.H) ? df6Var.n1(this.H) : 0;
        return iA < iN1 ? iN1 : iA;
    }

    @Override // defpackage.lr5
    public final int x(df6 df6Var, pj5 pj5Var, int i) {
        int iC = pj5Var.C(i);
        int iN1 = !Float.isNaN(this.H) ? df6Var.n1(this.H) : 0;
        return iC < iN1 ? iN1 : iC;
    }
}
