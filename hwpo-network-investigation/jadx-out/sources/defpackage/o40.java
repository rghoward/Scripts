package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o40 extends ox6.c implements lr5 {
    public float H;

    public final long c2(long j, boolean z) {
        int iRound;
        int iG = xx1.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.H)) <= 0) {
            return 0L;
        }
        if (!z || m40.b(j, iRound, iG)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long d2(long j, boolean z) {
        int iRound;
        int iH = xx1.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.H)) <= 0) {
            return 0L;
        }
        if (!z || m40.b(j, iH, iRound)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        long jD2 = d2(j, true);
        int i = 0;
        if (kg5.b(jD2, 0L)) {
            jD2 = c2(j, true);
            if (kg5.b(jD2, 0L)) {
                jD2 = f2(j, true);
                if (kg5.b(jD2, 0L)) {
                    jD2 = e2(j, true);
                    if (kg5.b(jD2, 0L)) {
                        jD2 = d2(j, false);
                        if (kg5.b(jD2, 0L)) {
                            jD2 = c2(j, false);
                            if (kg5.b(jD2, 0L)) {
                                jD2 = f2(j, false);
                                if (kg5.b(jD2, 0L)) {
                                    jD2 = e2(j, false);
                                    if (kg5.b(jD2, 0L)) {
                                        jD2 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!kg5.b(jD2, 0L)) {
            int i2 = (int) (jD2 >> 32);
            int i3 = (int) (4294967295L & jD2);
            if (!((i2 >= 0) & (i3 >= 0))) {
                wc5.a("width and height must be >= 0");
            }
            j = zx1.h(i2, i2, i3, i3);
        }
        jz7 jz7VarE = cl6Var.E(j);
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new n40(i, jz7VarE));
    }

    public final long e2(long j, boolean z) {
        int i = xx1.i(j);
        int iRound = Math.round(i * this.H);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || m40.b(j, iRound, i)) {
            return (((long) iRound) << 32) | (((long) i) & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.lr5
    public final int f(df6 df6Var, pj5 pj5Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.H) : pj5Var.o(i);
    }

    public final long f2(long j, boolean z) {
        int iJ = xx1.j(j);
        int iRound = Math.round(iJ / this.H);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || m40.b(j, iJ, iRound)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.lr5
    public final int j(df6 df6Var, pj5 pj5Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.H) : pj5Var.c0(i);
    }

    @Override // defpackage.lr5
    public final int v(df6 df6Var, pj5 pj5Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.H) : pj5Var.A(i);
    }

    @Override // defpackage.lr5
    public final int x(df6 df6Var, pj5 pj5Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.H) : pj5Var.C(i);
    }
}
