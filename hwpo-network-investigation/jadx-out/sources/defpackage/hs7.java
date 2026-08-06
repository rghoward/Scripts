package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hs7 extends ox6.c implements lr5, a73 {
    public es7 H;
    public boolean I;
    public di J;
    public nz1 K;
    public float L;
    public wh1 M;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements oh4<jz7.a, g2b> {
        public final /* synthetic */ jz7 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jz7 jz7Var) {
            super(1);
            this.u = jz7Var;
        }

        @Override // defpackage.oh4
        public final g2b invoke(jz7.a aVar) {
            jz7.a.t(aVar, this.u, 0, 0);
            return g2b.a;
        }
    }

    public static boolean d2(long j) {
        return !cr9.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean e2(long j) {
        return !cr9.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    public final boolean c2() {
        return this.I && this.H.h() != 9205357640488583168L;
    }

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        jz7 jz7VarE = cl6Var.E(f2(j));
        return hl6Var.y0(jz7VarE.t, jz7VarE.u, if3.t, new a(jz7VarE));
    }

    @Override // defpackage.lr5
    public final int f(df6 df6Var, pj5 pj5Var, int i) {
        if (!c2()) {
            return pj5Var.o(i);
        }
        long jF2 = f2(zx1.b(0, i, 0, 0, 13));
        return Math.max(xx1.i(jF2), pj5Var.o(i));
    }

    public final long f2(long j) {
        boolean z = false;
        boolean z2 = xx1.d(j) && xx1.c(j);
        if (xx1.f(j) && xx1.e(j)) {
            z = true;
        }
        if ((!c2() && z2) || z) {
            return xx1.a(xx1.h(j), 0, xx1.g(j), 0, 10, j);
        }
        long jH = this.H.h();
        int iRound = e2(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : xx1.j(j);
        int iRound2 = d2(jH) ? Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))) : xx1.i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(zx1.f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(zx1.g(iRound, j))) << 32);
        if (c2()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!e2(this.H.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.H.h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!d2(this.H.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.H.h() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : f.b(jFloatToRawIntBits2, this.K.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return xx1.a(zx1.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, zx1.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10, j);
    }

    @Override // defpackage.lr5
    public final int j(df6 df6Var, pj5 pj5Var, int i) {
        if (!c2()) {
            return pj5Var.c0(i);
        }
        long jF2 = f2(zx1.b(0, i, 0, 0, 13));
        return Math.max(xx1.i(jF2), pj5Var.c0(i));
    }

    @Override // defpackage.a73
    public final void t(tr5 tr5Var) {
        s41 s41Var = tr5Var.t;
        long jH = this.H.h();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(e2(jH) ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (s41Var.c() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(d2(jH) ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (s41Var.c() & 4294967295L)))) & 4294967295L);
        long jB = (Float.intBitsToFloat((int) (s41Var.c() >> 32)) == 0.0f || Float.intBitsToFloat((int) (s41Var.c() & 4294967295L)) == 0.0f) ? 0L : f.b(jFloatToRawIntBits, this.K.a(jFloatToRawIntBits, s41Var.c()));
        long jA = this.J.a((((long) Math.round(Float.intBitsToFloat((int) (jB >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (s41Var.c() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (s41Var.c() & 4294967295L)))) & 4294967295L), tr5Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        s41Var.u.a.f(f, f2);
        try {
            this.H.g(tr5Var, jB, this.L, this.M);
            s41Var.u.a.f(-f, -f2);
            tr5Var.K1();
        } catch (Throwable th) {
            s41Var.u.a.f(-f, -f2);
            throw th;
        }
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.H + ", sizeToIntrinsics=" + this.I + ", alignment=" + this.J + ", alpha=" + this.L + ", colorFilter=" + this.M + ')';
    }

    @Override // defpackage.lr5
    public final int v(df6 df6Var, pj5 pj5Var, int i) {
        if (!c2()) {
            return pj5Var.A(i);
        }
        long jF2 = f2(zx1.b(0, 0, 0, i, 7));
        return Math.max(xx1.j(jF2), pj5Var.A(i));
    }

    @Override // defpackage.lr5
    public final int x(df6 df6Var, pj5 pj5Var, int i) {
        if (!c2()) {
            return pj5Var.C(i);
        }
        long jF2 = f2(zx1.b(0, 0, 0, i, 7));
        return Math.max(xx1.j(jF2), pj5Var.C(i));
    }
}
