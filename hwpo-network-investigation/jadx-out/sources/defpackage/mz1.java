package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mz1 extends ox6.c implements a73, lr5 {
    public es7 H;
    public di I;
    public nz1 J;
    public float K;
    public wh1 L;

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    public final long c2(long j) {
        if (cr9.e(j)) {
            return 0L;
        }
        long jH = this.H.h();
        if (jH != 9205357640488583168L) {
            float fD = cr9.d(jH);
            if (Float.isInfinite(fD) || Float.isNaN(fD)) {
                fD = cr9.d(j);
            }
            float fB = cr9.b(jH);
            if (Float.isInfinite(fB) || Float.isNaN(fB)) {
                fB = cr9.b(j);
            }
            long jB = p50.b(fD, fB);
            long jA = this.J.a(jB, j);
            int i = v39.a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
            if (!Float.isInfinite(fIntBitsToFloat) && !Float.isNaN(fIntBitsToFloat)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jA));
                if (!Float.isInfinite(fIntBitsToFloat2) && !Float.isNaN(fIntBitsToFloat2)) {
                    return f.b(jB, jA);
                }
            }
        }
        return j;
    }

    public final long d2(long j) {
        float fJ;
        int i;
        float f;
        boolean zF = xx1.f(j);
        boolean zE = xx1.e(j);
        if (!zF || !zE) {
            boolean z = xx1.d(j) && xx1.c(j);
            long jH = this.H.h();
            if (jH != 9205357640488583168L) {
                if (!z || (!zF && !zE)) {
                    float fD = cr9.d(jH);
                    float fB = cr9.b(jH);
                    if (Float.isInfinite(fD) || Float.isNaN(fD)) {
                        fJ = xx1.j(j);
                    } else {
                        hj8 hj8Var = x6b.b;
                        fJ = uh8.f(fD, xx1.j(j), xx1.h(j));
                    }
                    if (Float.isInfinite(fB) || Float.isNaN(fB)) {
                        i = xx1.i(j);
                    } else {
                        hj8 hj8Var2 = x6b.b;
                        f = uh8.f(fB, xx1.i(j), xx1.g(j));
                    }
                    long jC2 = c2(p50.b(fJ, f));
                    return xx1.a(zx1.g(wk6.b(cr9.d(jC2)), j), 0, zx1.f(wk6.b(cr9.b(jC2)), j), 0, 10, j);
                }
                fJ = xx1.h(j);
                i = xx1.g(j);
                f = i;
                long jC3 = c2(p50.b(fJ, f));
                return xx1.a(zx1.g(wk6.b(cr9.d(jC3)), j), 0, zx1.f(wk6.b(cr9.b(jC3)), j), 0, 10, j);
            }
            if (z) {
                return xx1.a(xx1.h(j), 0, xx1.g(j), 0, 10, j);
            }
        }
        return j;
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        jz7 jz7VarE = cl6Var.E(d2(j));
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new lz1(0, jz7VarE));
    }

    @Override // defpackage.lr5
    public final int f(df6 df6Var, pj5 pj5Var, int i) {
        if (this.H.h() == 9205357640488583168L) {
            return pj5Var.o(i);
        }
        int iO = pj5Var.o(xx1.h(d2(zx1.b(0, i, 0, 0, 13))));
        return Math.max(wk6.b(cr9.b(c2(p50.b(i, iO)))), iO);
    }

    @Override // defpackage.lr5
    public final int j(df6 df6Var, pj5 pj5Var, int i) {
        if (this.H.h() == 9205357640488583168L) {
            return pj5Var.c0(i);
        }
        int iC0 = pj5Var.c0(xx1.h(d2(zx1.b(0, i, 0, 0, 13))));
        return Math.max(wk6.b(cr9.b(c2(p50.b(i, iC0)))), iC0);
    }

    @Override // defpackage.a73
    public final void t(tr5 tr5Var) {
        s41 s41Var = tr5Var.t;
        long jC2 = c2(s41Var.c());
        di diVar = this.I;
        hj8 hj8Var = x6b.b;
        long jB = (((long) wk6.b(cr9.d(jC2))) << 32) | (((long) wk6.b(cr9.b(jC2))) & 4294967295L);
        long jC = s41Var.c();
        long jA = diVar.a(jB, (((long) wk6.b(cr9.d(jC))) << 32) | (((long) wk6.b(cr9.b(jC))) & 4294967295L), tr5Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        s41Var.u.a.f(f, f2);
        this.H.g(tr5Var, jC2, this.K, this.L);
        s41Var.u.a.f(-f, -f2);
        tr5Var.K1();
    }

    @Override // defpackage.lr5
    public final int v(df6 df6Var, pj5 pj5Var, int i) {
        if (this.H.h() == 9205357640488583168L) {
            return pj5Var.A(i);
        }
        int iA = pj5Var.A(xx1.g(d2(zx1.b(0, 0, 0, i, 7))));
        return Math.max(wk6.b(cr9.d(c2(p50.b(iA, i)))), iA);
    }

    @Override // defpackage.lr5
    public final int x(df6 df6Var, pj5 pj5Var, int i) {
        if (this.H.h() == 9205357640488583168L) {
            return pj5Var.C(i);
        }
        int iC = pj5Var.C(xx1.g(d2(zx1.b(0, 0, 0, i, 7))));
        return Math.max(wk6.b(cr9.d(c2(p50.b(iC, i)))), iC);
    }
}
