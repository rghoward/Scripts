package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jr9 extends ox6.c implements lr5 {
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long c2(hl6 hl6Var) {
        int iN1;
        int iN2;
        int iN3;
        int i = 0;
        if (Float.isNaN(this.J)) {
            iN1 = Integer.MAX_VALUE;
        } else {
            iN1 = hl6Var.n1(this.J);
            if (iN1 < 0) {
                iN1 = 0;
            }
        }
        if (Float.isNaN(this.K)) {
            iN2 = Integer.MAX_VALUE;
        } else {
            iN2 = hl6Var.n1(this.K);
            if (iN2 < 0) {
                iN2 = 0;
            }
        }
        if (Float.isNaN(this.H)) {
            iN3 = 0;
        } else {
            iN3 = hl6Var.n1(this.H);
            if (iN3 < 0) {
                iN3 = 0;
            }
            if (iN3 > iN1) {
                iN3 = iN1;
            }
            if (iN3 == Integer.MAX_VALUE) {
                iN3 = 0;
            }
        }
        if (!Float.isNaN(this.I)) {
            int iN4 = hl6Var.n1(this.I);
            if (iN4 < 0) {
                iN4 = 0;
            }
            if (iN4 > iN2) {
                iN4 = iN2;
            }
            if (iN4 != Integer.MAX_VALUE) {
                i = iN4;
            }
        }
        return zx1.a(iN3, iN1, i, iN2);
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jC2 = c2(hl6Var);
        if (this.L) {
            jA = zx1.e(j, jC2);
        } else {
            if (Float.isNaN(this.H)) {
                iJ = xx1.j(j);
                int iH2 = xx1.h(jC2);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = xx1.j(jC2);
            }
            if (Float.isNaN(this.J)) {
                iH = xx1.h(j);
                int iJ2 = xx1.j(jC2);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = xx1.h(jC2);
            }
            if (Float.isNaN(this.I)) {
                i = xx1.i(j);
                int iG2 = xx1.g(jC2);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = xx1.i(jC2);
            }
            if (Float.isNaN(this.K)) {
                iG = xx1.g(j);
                int i2 = xx1.i(jC2);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = xx1.g(jC2);
            }
            jA = zx1.a(iJ, iH, i, iG);
        }
        jz7 jz7VarE = cl6Var.E(jA);
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new os0(1, jz7VarE));
    }

    @Override // defpackage.lr5
    public final int f(df6 df6Var, pj5 pj5Var, int i) {
        long jC2 = c2(df6Var);
        if (xx1.e(jC2)) {
            return xx1.g(jC2);
        }
        if (!this.L) {
            i = zx1.g(i, jC2);
        }
        return zx1.f(pj5Var.o(i), jC2);
    }

    @Override // defpackage.lr5
    public final int j(df6 df6Var, pj5 pj5Var, int i) {
        long jC2 = c2(df6Var);
        if (xx1.e(jC2)) {
            return xx1.g(jC2);
        }
        if (!this.L) {
            i = zx1.g(i, jC2);
        }
        return zx1.f(pj5Var.c0(i), jC2);
    }

    @Override // defpackage.lr5
    public final int v(df6 df6Var, pj5 pj5Var, int i) {
        long jC2 = c2(df6Var);
        if (xx1.f(jC2)) {
            return xx1.h(jC2);
        }
        if (!this.L) {
            i = zx1.f(i, jC2);
        }
        return zx1.g(pj5Var.A(i), jC2);
    }

    @Override // defpackage.lr5
    public final int x(df6 df6Var, pj5 pj5Var, int i) {
        long jC2 = c2(df6Var);
        if (xx1.f(jC2)) {
            return xx1.h(jC2);
        }
        if (!this.L) {
            i = zx1.f(i, jC2);
        }
        return zx1.g(pj5Var.C(i), jC2);
    }
}
