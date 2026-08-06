package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mb7 extends df6 implements cl6, qq5, nn7 {
    public static final sv8 i0 = new sv8();
    public static final jq5 j0 = new jq5();
    public static final float[] k0 = xk6.a();
    public static final a l0 = new a();
    public static final b m0 = new b();
    public final qr5 H;
    public boolean I;
    public boolean J;
    public mb7 K;
    public mb7 L;
    public boolean M;
    public boolean N;
    public oh4<? super ro4, g2b> O;
    public tx2 P;
    public tq5 Q;
    public gl6 S;
    public s27<ei> T;
    public float V;
    public b37 W;
    public jq5 X;
    public boolean Z;
    public boolean a0;
    public ko4 b0;
    public n41 c0;
    public nb7 d0;
    public boolean f0;
    public ln7 g0;
    public ko4 h0;
    public float R = 0.8f;
    public long U = 0;
    public jl9 Y = al8.a;
    public final f e0 = new f();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements e {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3, types: [k37] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6, types: [k37] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r7v0, types: [ox6$c] */
        /* JADX WARN: Type inference failed for: r7v1, types: [ox6$c] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4, types: [ox6$c] */
        /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // mb7.e
        public final boolean a(ox6.c cVar) {
            ?? k37Var = 0;
            while (true) {
                int i = 0;
                if (cVar == 0) {
                    return false;
                }
                if (cVar instanceof g58) {
                    ((g58) cVar).D0();
                } else if ((cVar.v & 16) != 0 && (cVar instanceof gw2)) {
                    ox6.c cVar2 = ((gw2) cVar).I;
                    k37Var = k37Var;
                    cVar = cVar;
                    while (cVar2 != null) {
                        if ((cVar2.v & 16) != 0) {
                            i++;
                            if (i == 1) {
                                k37Var = k37Var;
                                cVar = cVar2;
                            } else {
                                if (k37Var == 0) {
                                    k37Var = new k37(new ox6.c[16]);
                                }
                                if (cVar != 0) {
                                    k37Var.d(cVar);
                                    cVar = 0;
                                }
                                k37Var.d(cVar2);
                            }
                        }
                        cVar2 = cVar2.y;
                        k37Var = k37Var;
                        cVar = cVar;
                    }
                    if (i == 1) {
                    }
                }
                cVar = ew2.b(k37Var);
            }
        }

        @Override // mb7.e
        public final int b() {
            return 16;
        }

        @Override // mb7.e
        public final void d(qr5 qr5Var, long j, vy4 vy4Var, int i, boolean z) {
            qr5Var.M(j, vy4Var, i, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [ox6$c] */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [ox6$c] */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [k37] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6, types: [k37] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r4v4 */
        @Override // mb7.e
        public final boolean e(vy4 vy4Var, qr5 qr5Var) {
            mb7 mb7Var = qr5Var.Y.d;
            mb7Var.getClass();
            ox6.c cVarS1 = mb7Var.s1(qb7.g(16));
            if (cVarS1 != null && cVarS1.G) {
                if (!cVarS1.t.G) {
                    uc5.b("visitLocalDescendants called on an unattached node");
                }
                ox6.c cVar = cVarS1.t;
                if ((cVar.w & 16) != 0) {
                    while (cVar != null) {
                        if ((cVar.v & 16) != 0) {
                            ?? B = cVar;
                            ?? k37Var = 0;
                            while (B != 0) {
                                if (B instanceof g58) {
                                    if (((g58) B).v1()) {
                                        vy4Var.v = vy4Var.t.b - 1;
                                        return true;
                                    }
                                } else if ((B.v & 16) != 0 && (B instanceof gw2)) {
                                    ox6.c cVar2 = ((gw2) B).I;
                                    int i = 0;
                                    while (cVar2 != null) {
                                        if ((cVar2.v & 16) != 0) {
                                            i++;
                                            if (i == 1) {
                                                B = B;
                                                k37Var = k37Var;
                                                k37Var = k37Var;
                                                B = cVar2;
                                            } else {
                                                if (k37Var == 0) {
                                                    k37Var = new k37(new ox6.c[16]);
                                                }
                                                if (B != 0) {
                                                    k37Var.d(B);
                                                    B = 0;
                                                }
                                                k37Var.d(cVar2);
                                            }
                                        } else {
                                            B = B;
                                            k37Var = k37Var;
                                        }
                                        cVar2 = cVar2.y;
                                        B = B;
                                        k37Var = k37Var;
                                    }
                                    if (i == 1) {
                                        B = B;
                                        k37Var = k37Var;
                                    } else {
                                        B = B;
                                        k37Var = k37Var;
                                    }
                                }
                                B = ew2.b(k37Var);
                            }
                        }
                        cVar = cVar.y;
                    }
                }
            }
            return false;
        }

        @Override // mb7.e
        public final boolean f(qr5 qr5Var) {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements e {
        @Override // mb7.e
        public final boolean a(ox6.c cVar) {
            return false;
        }

        @Override // mb7.e
        public final int b() {
            return 8;
        }

        @Override // mb7.e
        public final boolean c(ox6.c cVar) {
            return zb9.h(wb9.a(ew2.f(cVar), false));
        }

        @Override // mb7.e
        public final void d(qr5 qr5Var, long j, vy4 vy4Var, int i, boolean z) {
            kb7 kb7Var = qr5Var.Y;
            mb7 mb7Var = kb7Var.d;
            sv8 sv8Var = mb7.i0;
            kb7Var.d.A1(mb7.m0, mb7Var.a1(j), vy4Var, 1, z);
        }

        @Override // mb7.e
        public final boolean e(vy4 vy4Var, qr5 qr5Var) {
            return false;
        }

        @Override // mb7.e
        public final boolean f(qr5 qr5Var) {
            lb9 lb9VarR = qr5Var.r();
            boolean z = false;
            if (lb9VarR != null && lb9VarR.w) {
                z = true;
            }
            return !z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements oh4<mb7, g2b> {
        public static final c u = new c(1);

        @Override // defpackage.oh4
        public final g2b invoke(mb7 mb7Var) {
            ln7 ln7Var = mb7Var.g0;
            if (ln7Var != null) {
                ln7Var.invalidate();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends wp5 implements oh4<mb7, g2b> {
        public static final d u = new d(1);

        @Override // defpackage.oh4
        public final g2b invoke(mb7 mb7Var) {
            mb7 mb7Var2 = mb7Var;
            qr5 qr5Var = mb7Var2.H;
            try {
                if (mb7Var2.V()) {
                    mb7Var2.d2(true);
                }
                return g2b.a;
            } catch (Throwable th) {
                qr5Var.j0(th);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface e {
        boolean a(ox6.c cVar);

        int b();

        default boolean c(ox6.c cVar) {
            return true;
        }

        void d(qr5 qr5Var, long j, vy4 vy4Var, int i, boolean z);

        boolean e(vy4 vy4Var, qr5 qr5Var);

        boolean f(qr5 qr5Var);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f extends wp5 implements mh4<g2b> {
        public f() {
            super(0);
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            mb7 mb7Var = mb7.this.L;
            if (mb7Var != null) {
                mb7Var.E1();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends wp5 implements mh4<g2b> {
        public final /* synthetic */ oh4<ro4, g2b> u;
        public final /* synthetic */ mb7 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(oh4<? super ro4, g2b> oh4Var, mb7 mb7Var) {
            super(0);
            this.u = oh4Var;
            this.v = mb7Var;
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            sv8 sv8Var = mb7.i0;
            this.u.invoke(sv8Var);
            mb7 mb7Var = this.v;
            boolean zA = xj5.a(mb7Var.Y, sv8Var.D);
            boolean z = mb7Var.Z;
            boolean z2 = sv8Var.E;
            boolean z3 = z != z2;
            if (!zA || z3) {
                mb7Var.Y = sv8Var.D;
                mb7Var.Z = z2;
                if (mb7Var.a0 && (z3 || (z2 && !zA))) {
                    mb7Var.H.R();
                }
            }
            mb7Var.a0 = true;
            sv8Var.J = sv8Var.D.mo0createOutlinePq9zytI(sv8Var.F, sv8Var.H, sv8Var.G);
            return g2b.a;
        }
    }

    public mb7(qr5 qr5Var) {
        this.H = qr5Var;
        this.P = qr5Var.R;
        this.Q = qr5Var.S;
    }

    public static mb7 Y1(qq5 qq5Var) {
        mb7 mb7Var;
        gf6 gf6Var = qq5Var instanceof gf6 ? (gf6) qq5Var : null;
        if (gf6Var != null && (mb7Var = gf6Var.t.H) != null) {
            return mb7Var;
        }
        qq5Var.getClass();
        return (mb7) qq5Var;
    }

    public final void A1(e eVar, long j, vy4 vy4Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        ox6.c cVarQ1 = q1(eVar.b());
        if (!e2(j)) {
            if (i == 1) {
                float fL0 = L0(j, f1());
                if ((Float.floatToRawIntBits(fL0) & Integer.MAX_VALUE) < 2139095040) {
                    if (vy4Var.v != vy4Var.t.b - 1) {
                        if (m33.b(vy4Var.d(), j84.a(fL0, false, false)) <= 0) {
                            return;
                        }
                    }
                    v1(cVarQ1, eVar, j, vy4Var, i, false, fL0);
                    return;
                }
                return;
            }
            return;
        }
        if (cVarQ1 == null) {
            D1(eVar, j, vy4Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < g0() && fIntBitsToFloat2 < f0()) {
            t1(cVarQ1, eVar, j, vy4Var, i, z);
            return;
        }
        float fL1 = i == 1 ? L0(j, f1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fL1) & Integer.MAX_VALUE) < 2139095040) {
            if (vy4Var.v != vy4Var.t.b - 1) {
                z2 = z;
                if (m33.b(vy4Var.d(), j84.a(fL1, z2, false)) > 0) {
                }
                R1(cVarQ1, eVar, j, vy4Var, i, z2, fL1, z3);
            }
            z2 = z;
            z3 = true;
            R1(cVarQ1, eVar, j, vy4Var, i, z2, fL1, z3);
        }
        z2 = z;
        z3 = false;
        R1(cVarQ1, eVar, j, vy4Var, i, z2, fL1, z3);
    }

    public void D1(e eVar, long j, vy4 vy4Var, int i, boolean z) {
        mb7 mb7Var = this.K;
        if (mb7Var != null) {
            mb7Var.A1(eVar, mb7Var.a1(j), vy4Var, i, z);
        }
    }

    @Override // defpackage.df6
    public final void E0() {
        ko4 ko4Var = this.h0;
        long j = this.U;
        if (ko4Var != null) {
            k0(j, this.V, ko4Var);
        } else {
            i0(j, this.V, this.O);
        }
    }

    public final void E1() {
        ln7 ln7Var = this.g0;
        if (ln7Var != null) {
            ln7Var.invalidate();
            return;
        }
        mb7 mb7Var = this.L;
        if (mb7Var != null) {
            mb7Var.E1();
        }
    }

    @Override // defpackage.qq5
    public final long F(long j) {
        if (!g1().G) {
            uc5.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        qq5 qq5VarD = rq5.d(this);
        return U(qq5VarD, vf7.d(ur5.a(this.H).e(j), qq5VarD.a0(0L)));
    }

    @Override // defpackage.qq5
    public final qq5 G() {
        boolean z = g1().G;
        qr5 qr5Var = this.H;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (qr5 qr5VarI = qr5Var; qr5VarI != null; qr5VarI = qr5VarI.I()) {
                sb.append("\n|");
                sb.append(qr5VarI);
                sb.append(" isAttached=");
                sb.append(qr5VarI.e());
                sb.append(" modifier=");
                sb.append(qr5VarI.d0);
                sb.append(" tail=");
                sb.append(g1());
            }
            uc5.b(sb.toString());
        }
        I1();
        return qr5Var.Y.d.L;
    }

    public final void G0(mb7 mb7Var, b37 b37Var, boolean z) {
        if (mb7Var == this) {
            return;
        }
        mb7 mb7Var2 = this.L;
        if (mb7Var2 != null) {
            mb7Var2.G0(mb7Var, b37Var, z);
        }
        long j = this.U;
        float f2 = (int) (j >> 32);
        b37Var.a -= f2;
        b37Var.c -= f2;
        float f3 = (int) (j & 4294967295L);
        b37Var.b -= f3;
        b37Var.d -= f3;
        ln7 ln7Var = this.g0;
        if (ln7Var != null) {
            ln7Var.b(b37Var, true);
            if (this.N && z) {
                long j2 = this.v;
                b37Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final boolean G1() {
        if (this.g0 != null && this.R <= 0.0f) {
            return true;
        }
        mb7 mb7Var = this.L;
        if (mb7Var != null) {
            return mb7Var.G1();
        }
        return false;
    }

    public final long H0(mb7 mb7Var, long j) {
        if (mb7Var == this) {
            return j;
        }
        mb7 mb7Var2 = this.L;
        return (mb7Var2 == null || xj5.a(mb7Var, mb7Var2)) ? a1(j) : a1(mb7Var2.H0(mb7Var, j));
    }

    public final void I1() {
        this.H.Z.b();
    }

    public final long K0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - g0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - f0();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    public final float L0(long j, long j2) {
        if (g0() >= Float.intBitsToFloat((int) (j2 >> 32)) && f0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jK0 = K0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jK0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jK0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - g0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - f0()))) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void M0(n41 n41Var, ko4 ko4Var) {
        ln7 ln7Var = this.g0;
        if (ln7Var != null) {
            ln7Var.h(n41Var, ko4Var);
            return;
        }
        long j = this.U;
        float f2 = (int) (j >> 32);
        float f3 = (int) (j & 4294967295L);
        n41Var.n(f2, f3);
        Q0(n41Var, ko4Var);
        n41Var.n(-f2, -f3);
    }

    @Override // defpackage.tx2
    public final float N0() {
        return this.H.R.N0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r7v7, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [k37] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [k37] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void N1() {
        ox6.c cVarG1;
        boolean zG = qb7.g(128);
        ox6.c cVarS1 = s1(zG);
        if (cVarS1 == null || (cVarS1.t.w & 128) == 0) {
            return;
        }
        hu9 hu9VarA = hu9.a.a();
        oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
        hu9 hu9VarB = hu9.a.b(hu9VarA);
        try {
            if (!zG) {
                cVarG1 = g1().x;
                if (cVarG1 == null) {
                }
                g2b g2bVar = g2b.a;
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            }
            cVarG1 = g1();
            for (ox6.c cVarS2 = s1(zG); cVarS2 != null && (cVarS2.w & 128) != 0; cVarS2 = cVarS2.y) {
                if ((cVarS2.v & 128) != 0) {
                    ?? B = cVarS2;
                    ?? k37Var = 0;
                    while (B != 0) {
                        if (B instanceof ml6) {
                            ((ml6) B).g(this.v);
                        } else if ((B.v & 128) != 0 && (B instanceof gw2)) {
                            ox6.c cVar = ((gw2) B).I;
                            int i = 0;
                            B = B;
                            k37Var = k37Var;
                            while (cVar != null) {
                                if ((cVar.v & 128) != 0) {
                                    i++;
                                    if (i == 1) {
                                        k37Var = k37Var;
                                        B = cVar;
                                    } else {
                                        if (k37Var == 0) {
                                            k37Var = new k37(new ox6.c[16]);
                                        }
                                        if (B != 0) {
                                            k37Var.d(B);
                                            B = 0;
                                        }
                                        k37Var.d(cVar);
                                    }
                                }
                                cVar = cVar.y;
                                B = B;
                                k37Var = k37Var;
                            }
                            if (i == 1) {
                            }
                        }
                        B = ew2.b(k37Var);
                    }
                }
                if (cVarS2 == cVarG1) {
                    break;
                }
            }
            g2b g2bVar2 = g2b.a;
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
        } catch (Throwable th) {
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [k37] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [k37] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void O1() {
        boolean zG = qb7.g(4194304);
        ox6.c cVarG1 = g1();
        if (!zG && (cVarG1 = cVarG1.x) == null) {
            return;
        }
        for (ox6.c cVarS1 = s1(zG); cVarS1 != null && (cVarS1.w & 4194304) != 0; cVarS1 = cVarS1.y) {
            if ((cVarS1.v & 4194304) != 0) {
                ?? B = cVarS1;
                ?? k37Var = 0;
                while (B != 0) {
                    if (B instanceof nq5) {
                        ((nq5) B).F(this);
                    } else if ((B.v & 4194304) != 0 && (B instanceof gw2)) {
                        ox6.c cVar = ((gw2) B).I;
                        int i = 0;
                        B = B;
                        k37Var = k37Var;
                        while (cVar != null) {
                            if ((cVar.v & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    k37Var = k37Var;
                                    B = cVar;
                                } else {
                                    if (k37Var == 0) {
                                        k37Var = new k37(new ox6.c[16]);
                                    }
                                    if (B != 0) {
                                        k37Var.d(B);
                                        B = 0;
                                    }
                                    k37Var.d(cVar);
                                }
                            }
                            cVar = cVar.y;
                            B = B;
                            k37Var = k37Var;
                        }
                        if (i == 1) {
                        }
                    }
                    B = ew2.b(k37Var);
                }
            }
            if (cVarS1 == cVarG1) {
                return;
            }
        }
    }

    public final void P1() {
        this.M = true;
        this.e0.invoke();
        V1();
        if (bg5.b(this.U, 0L)) {
            return;
        }
        this.H.Y(this);
    }

    public final void Q0(n41 n41Var, ko4 ko4Var) {
        mb7 mb7Var;
        n41 n41Var2;
        ko4 ko4Var2;
        ox6.c cVarQ1 = q1(4);
        if (cVarQ1 == null) {
            S1(n41Var, ko4Var);
            return;
        }
        qr5 qr5Var = this.H;
        qr5Var.getClass();
        tr5 sharedDrawScope = ur5.a(qr5Var).getSharedDrawScope();
        long jC = c43.c(this.v);
        sharedDrawScope.getClass();
        k37 k37Var = null;
        while (cVarQ1 != null) {
            if (cVarQ1 instanceof a73) {
                mb7Var = this;
                n41Var2 = n41Var;
                ko4Var2 = ko4Var;
                sharedDrawScope.e(n41Var2, jC, mb7Var, (a73) cVarQ1, ko4Var2);
            } else {
                mb7Var = this;
                n41Var2 = n41Var;
                ko4Var2 = ko4Var;
                if ((cVarQ1.v & 4) != 0 && (cVarQ1 instanceof gw2)) {
                    int i = 0;
                    for (ox6.c cVar = ((gw2) cVarQ1).I; cVar != null; cVar = cVar.y) {
                        if ((cVar.v & 4) != 0) {
                            i++;
                            if (i == 1) {
                                cVarQ1 = cVar;
                            } else {
                                if (k37Var == null) {
                                    k37Var = new k37(new ox6.c[16]);
                                }
                                if (cVarQ1 != null) {
                                    k37Var.d(cVarQ1);
                                    cVarQ1 = null;
                                }
                                k37Var.d(cVar);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                n41Var = n41Var2;
                this = mb7Var;
                ko4Var = ko4Var2;
            }
            cVarQ1 = ew2.b(k37Var);
            n41Var = n41Var2;
            this = mb7Var;
            ko4Var = ko4Var2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [k37] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [k37] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final void Q1() {
        boolean zG = qb7.g(1048576);
        ox6.c cVarS1 = s1(zG);
        if (cVarS1 == null || (cVarS1.t.w & 1048576) == 0) {
            return;
        }
        ox6.c cVarG1 = g1();
        if (!zG && (cVarG1 = cVarG1.x) == null) {
            return;
        }
        for (ox6.c cVarS2 = s1(zG); cVarS2 != null && (cVarS2.w & 1048576) != 0; cVarS2 = cVarS2.y) {
            if ((cVarS2.v & 1048576) != 0) {
                ?? B = cVarS2;
                ?? k37Var = 0;
                while (B != 0) {
                    if (B instanceof y2b) {
                        ((y2b) B).N1();
                    } else if ((B.v & 1048576) != 0 && (B instanceof gw2)) {
                        ox6.c cVar = ((gw2) B).I;
                        int i = 0;
                        B = B;
                        k37Var = k37Var;
                        while (cVar != null) {
                            if ((cVar.v & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    k37Var = k37Var;
                                    B = cVar;
                                } else {
                                    if (k37Var == 0) {
                                        k37Var = new k37(new ox6.c[16]);
                                    }
                                    if (B != 0) {
                                        k37Var.d(B);
                                        B = 0;
                                    }
                                    k37Var.d(cVar);
                                }
                            }
                            cVar = cVar.y;
                            B = B;
                            k37Var = k37Var;
                        }
                        if (i == 1) {
                        }
                    }
                    B = ew2.b(k37Var);
                }
            }
            if (cVarS2 == cVarG1) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01d6 A[PHI: r4
      0x01d6: PHI (r4v12 ??) = (r4v1 ??), (r4v1 ??), (r4v14 ??) binds: [B:55:0x01a0, B:57:0x01a4, B:71:0x01cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r3v18, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12, types: [k37] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [k37] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    public final void R1(ox6.c cVar, e eVar, long j, vy4 vy4Var, int i, boolean z, float f2, boolean z2) {
        ?? B;
        if (cVar == null) {
            D1(eVar, j, vy4Var, i, z);
            return;
        }
        if (!eVar.c(cVar)) {
            R1(pb7.a(cVar, eVar.b()), eVar, j, vy4Var, i, z, f2, z2);
            return;
        }
        int i2 = i;
        char c2 = 3;
        if (i2 == 3 || i2 == 4) {
            ?? r3 = cVar;
            ?? k37Var = 0;
            while (r3 != 0) {
                int i3 = 0;
                if (r3 instanceof g58) {
                    long J = ((g58) r3).J();
                    int i4 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i4);
                    qr5 qr5Var = this.H;
                    tq5 tq5Var = qr5Var.S;
                    int i5 = tra.b;
                    long j2 = Long.MIN_VALUE & J;
                    tq5 tq5Var2 = tq5.t;
                    if (fIntBitsToFloat < (-((j2 == 0 || tq5Var == tq5Var2) ? tra.a.a(0, J) : tra.a.a(2, J)))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i4) >= g0() + ((j2 == 0 || qr5Var.S == tq5Var2) ? tra.a.a(2, J) : tra.a.a(0, J))) {
                        break;
                    }
                    int i6 = (int) (j & 4294967295L);
                    float fIntBitsToFloat2 = Float.intBitsToFloat(i6);
                    int i7 = tra.b;
                    if (fIntBitsToFloat2 < (-tra.a.a(1, J))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i6) >= tra.a.a(3, J) + f0()) {
                        break;
                    }
                    m27 m27Var = vy4Var.u;
                    t27<Object> t27Var = vy4Var.t;
                    int i8 = vy4Var.v;
                    int i9 = t27Var.b;
                    if (i8 == i9 - 1) {
                        vy4Var.e(i8 + 1, i9);
                        vy4Var.v++;
                        t27Var.g(cVar);
                        m27Var.a(j84.a(0.0f, z, true));
                        R1(pb7.a(cVar, eVar.b()), eVar, j, vy4Var, i2, z, f2, z2);
                        g2b g2bVar = g2b.a;
                        vy4Var.v = i8;
                        return;
                    }
                    long jD = vy4Var.d();
                    int i10 = vy4Var.v;
                    if (!m33.d(jD)) {
                        if (m33.c(jD) > 0.0f) {
                            int i11 = vy4Var.v;
                            vy4Var.e(i11 + 1, t27Var.b);
                            vy4Var.v++;
                            t27Var.g(cVar);
                            m27Var.a(j84.a(0.0f, z, true));
                            R1(pb7.a(cVar, eVar.b()), eVar, j, vy4Var, i, z, f2, z2);
                            g2b g2bVar2 = g2b.a;
                            vy4Var.v = i11;
                            return;
                        }
                        return;
                    }
                    int i12 = t27Var.b;
                    int i13 = i12 - 1;
                    vy4Var.v = i13;
                    vy4Var.e(i12, t27Var.b);
                    vy4Var.v++;
                    t27Var.g(cVar);
                    m27Var.a(j84.a(0.0f, z, true));
                    R1(pb7.a(cVar, eVar.b()), eVar, j, vy4Var, i, z, f2, z2);
                    g2b g2bVar3 = g2b.a;
                    vy4Var.v = i13;
                    if (m33.c(vy4Var.d()) < 0.0f) {
                        vy4Var.e(i10 + 1, vy4Var.v + 1);
                    }
                    vy4Var.v = i10;
                    return;
                }
                char c3 = c2;
                if ((r3.v & 16) == 0 || !(r3 instanceof gw2)) {
                    B = r3;
                    k37Var = k37Var;
                    B = ew2.b(k37Var);
                } else {
                    ox6.c cVar2 = ((gw2) r3).I;
                    while (cVar2 != null) {
                        if ((cVar2.v & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                B = r3;
                                k37Var = k37Var;
                                k37Var = k37Var;
                                B = cVar2;
                            } else {
                                if (k37Var == 0) {
                                    k37Var = new k37(new ox6.c[16]);
                                }
                                if (B != 0) {
                                    k37Var.d(B);
                                    B = 0;
                                }
                                k37Var.d(cVar2);
                            }
                        } else {
                            B = r3;
                            k37Var = k37Var;
                        }
                        cVar2 = cVar2.y;
                        B = B;
                        k37Var = k37Var;
                    }
                    if (i3 == 1) {
                        B = r3;
                        k37Var = k37Var;
                    } else {
                        B = r3;
                        k37Var = k37Var;
                        B = ew2.b(k37Var);
                    }
                }
                i2 = i;
                c2 = c3;
                r3 = B;
                k37Var = k37Var;
            }
        }
        if (z2) {
            v1(cVar, eVar, j, vy4Var, i, z, f2);
        } else {
            X1(cVar, eVar, j, vy4Var, i, z, f2);
        }
    }

    public void S1(n41 n41Var, ko4 ko4Var) {
        mb7 mb7Var = this.K;
        if (mb7Var != null) {
            mb7Var.M0(n41Var, ko4Var);
        }
    }

    @Override // defpackage.qq5
    public final long T(qq5 qq5Var, long j) {
        return U(qq5Var, j);
    }

    public final void T1(long j, float f2, oh4<? super ro4, g2b> oh4Var, ko4 ko4Var) {
        qr5 qr5Var = this.H;
        if (ko4Var != null) {
            if (oh4Var != null) {
                uc5.a("both ways to create layers shouldn't be used together");
            }
            if (this.h0 != ko4Var) {
                this.h0 = null;
                c2(null, false);
                this.h0 = ko4Var;
            }
            if (this.g0 == null) {
                mn7 mn7VarA = ur5.a(qr5Var);
                nb7 nb7Var = this.d0;
                if (nb7Var == null) {
                    nb7 nb7Var2 = new nb7(this, new ob7(this));
                    this.d0 = nb7Var2;
                    nb7Var = nb7Var2;
                }
                f fVar = this.e0;
                ln7 ln7VarW = mn7VarA.w(nb7Var, fVar, ko4Var);
                ln7VarW.f(this.v);
                ln7VarW.j(j);
                this.g0 = ln7VarW;
                qr5Var.c0 = true;
                fVar.invoke();
            }
        } else {
            if (this.h0 != null) {
                this.h0 = null;
                c2(null, false);
            }
            c2(oh4Var, false);
        }
        if (!bg5.b(this.U, j)) {
            ur5.a(qr5Var).k(-4.0f);
            this.U = j;
            ln7 ln7Var = this.g0;
            if (ln7Var != null) {
                ln7Var.j(j);
            } else {
                mb7 mb7Var = this.L;
                if (mb7Var != null) {
                    mb7Var.E1();
                }
            }
            qr5Var.Y(this);
            df6.C0(this);
            mn7 mn7Var = qr5Var.G;
            if (mn7Var != null) {
                mn7Var.F(qr5Var);
            }
        }
        this.V = f2;
        if (this == qr5Var.Y.d) {
            ur5.a(qr5Var).getRectManager().e(qr5Var);
        }
        if (this.D) {
            return;
        }
        r0(v0());
    }

    @Override // defpackage.qq5
    public final long U(qq5 qq5Var, long j) {
        if (qq5Var instanceof gf6) {
            gf6 gf6Var = (gf6) qq5Var;
            gf6Var.t.H.I1();
            return gf6Var.U(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        mb7 mb7VarY1 = Y1(qq5Var);
        mb7VarY1.I1();
        mb7 mb7VarX0 = X0(mb7VarY1);
        while (mb7VarY1 != mb7VarX0) {
            ln7 ln7Var = mb7VarY1.g0;
            if (ln7Var != null) {
                j = ln7Var.e(j, false);
            }
            j = cg5.b(j, mb7VarY1.U);
            mb7VarY1 = mb7VarY1.L;
            mb7VarY1.getClass();
        }
        return H0(mb7VarX0, j);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    public final void U1(b37 b37Var, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        ln7 ln7Var = this.g0;
        if (ln7Var != null) {
            if (this.N) {
                if (z2) {
                    long jF1 = f1();
                    float f2 = b37Var.a;
                    float f3 = b37Var.b;
                    if (b37Var.c >= 0.0f) {
                        long j = this.v;
                        if (f2 > ((int) (j >> 32)) || b37Var.d < 0.0f || f3 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jF1 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jF1 & 4294967295L));
                            float f4 = (fIntBitsToFloat - (b37Var.c - b37Var.a)) / 2.0f;
                            if (f4 > 0.0f) {
                                f2 -= f4;
                            } else {
                                float f5 = (-fIntBitsToFloat) / 2.0f;
                                if (f2 < f5) {
                                    f2 = f5;
                                }
                            }
                            float f6 = (fIntBitsToFloat2 - (b37Var.d - b37Var.b)) / 2.0f;
                            if (f6 > 0.0f) {
                                f3 -= f6;
                            } else {
                                float f7 = (-fIntBitsToFloat2) / 2.0f;
                                if (f3 < f7) {
                                    f3 = f7;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j2 = this.v;
                    float f8 = (int) (j2 >> 32);
                    int i = (int) (jF1 >> 32);
                    float f9 = (int) (j2 & 4294967295L);
                    int i2 = (int) (jF1 & 4294967295L);
                    b37Var.a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f8, Math.max(f8, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f9, Math.max(f9, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                } else if (z) {
                    long j3 = this.v;
                    b37Var.a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (b37Var.b()) {
                    return;
                }
            }
            ln7Var.b(b37Var, false);
        }
        long j4 = this.U;
        float f10 = (int) (j4 >> 32);
        b37Var.a += f10;
        b37Var.c += f10;
        float f11 = (int) (j4 & 4294967295L);
        b37Var.b += f11;
        b37Var.d += f11;
    }

    @Override // defpackage.nn7
    public final boolean V() {
        return (this.g0 == null || this.M || !this.H.e()) ? false : true;
    }

    public abstract void V0();

    public final void V1() {
        if (this.g0 != null) {
            if (this.h0 != null) {
                this.h0 = null;
            }
            c2(null, false);
            this.H.f0(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [k37] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [k37] */
    public final void W1(gl6 gl6Var) {
        mb7 mb7Var;
        gl6 gl6Var2 = this.S;
        if (gl6Var != gl6Var2) {
            this.S = gl6Var;
            qr5 qr5Var = this.H;
            int i = 0;
            if (gl6Var2 == null || gl6Var.j() != gl6Var2.j() || gl6Var.h() != gl6Var2.h()) {
                int iJ = gl6Var.j();
                int iH = gl6Var.h();
                ln7 ln7Var = this.g0;
                if (ln7Var != null) {
                    ln7Var.f((((long) iJ) << 32) | (((long) iH) & 4294967295L));
                } else if (qr5Var.j() && (mb7Var = this.L) != null) {
                    mb7Var.E1();
                }
                l0((((long) iH) & 4294967295L) | (((long) iJ) << 32));
                if (this.O != null) {
                    d2(false);
                }
                boolean zG = qb7.g(4);
                ox6.c cVarG1 = g1();
                if (zG || (cVarG1 = cVarG1.x) != null) {
                    for (ox6.c cVarS1 = s1(zG); cVarS1 != null && (cVarS1.w & 4) != 0; cVarS1 = cVarS1.y) {
                        if ((cVarS1.v & 4) != 0) {
                            ?? B = cVarS1;
                            ?? k37Var = 0;
                            while (B != 0) {
                                if (B instanceof a73) {
                                    ((a73) B).C0();
                                } else if ((B.v & 4) != 0 && (B instanceof gw2)) {
                                    ox6.c cVar = ((gw2) B).I;
                                    int i2 = 0;
                                    B = B;
                                    k37Var = k37Var;
                                    while (cVar != null) {
                                        if ((cVar.v & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                k37Var = k37Var;
                                                B = cVar;
                                            } else {
                                                if (k37Var == 0) {
                                                    k37Var = new k37(new ox6.c[16]);
                                                }
                                                if (B != 0) {
                                                    k37Var.d(B);
                                                    B = 0;
                                                }
                                                k37Var.d(cVar);
                                            }
                                        }
                                        cVar = cVar.y;
                                        B = B;
                                        k37Var = k37Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                B = ew2.b(k37Var);
                            }
                        }
                        if (cVarS1 == cVarG1) {
                            break;
                        }
                    }
                }
                mn7 mn7Var = qr5Var.G;
                if (mn7Var != null) {
                    mn7Var.F(qr5Var);
                }
                qr5Var.Y(this);
            }
            s27<ei> s27Var = this.T;
            if ((s27Var == null || s27Var.e == 0) && gl6Var.l().isEmpty()) {
                return;
            }
            s27<ei> s27Var2 = this.T;
            Map<ei, Integer> mapL = gl6Var.l();
            if (s27Var2 != null && s27Var2.e == mapL.size()) {
                Object[] objArr = s27Var2.b;
                int[] iArr = s27Var2.c;
                long[] jArr = s27Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = mapL.get((ei) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            qr5Var.Z.p.R.g();
            s27<ei> s27VarA = this.T;
            if (s27VarA == null) {
                s27VarA = je7.a();
                this.T = s27VarA;
            }
            s27VarA.a();
            for (Map.Entry<ei, Integer> entry : gl6Var.l().entrySet()) {
                s27VarA.h(entry.getValue().intValue(), entry.getKey());
            }
        }
    }

    public final mb7 X0(mb7 mb7Var) {
        qr5 qr5VarI = mb7Var.H;
        qr5 qr5Var = this.H;
        if (qr5VarI == qr5Var) {
            ox6.c cVarG1 = mb7Var.g1();
            ox6.c cVarG2 = g1();
            if (!cVarG2.t.G) {
                uc5.b("visitLocalAncestors called on an unattached node");
            }
            for (ox6.c cVar = cVarG2.t.x; cVar != null; cVar = cVar.x) {
                if ((cVar.v & 2) != 0 && cVar == cVarG1) {
                    return mb7Var;
                }
            }
            return this;
        }
        while (qr5VarI.I > qr5Var.I) {
            qr5VarI = qr5VarI.I();
            qr5VarI.getClass();
        }
        qr5 qr5VarI2 = qr5Var;
        while (qr5VarI2.I > qr5VarI.I) {
            qr5VarI2 = qr5VarI2.I();
            qr5VarI2.getClass();
        }
        while (qr5VarI != qr5VarI2) {
            qr5VarI = qr5VarI.I();
            qr5VarI2 = qr5VarI2.I();
            if (qr5VarI == null || qr5VarI2 == null) {
                z90.a("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (qr5VarI2 != qr5Var) {
            if (qr5VarI != mb7Var.H) {
                return qr5VarI.Y.c;
            }
            return mb7Var;
        }
        return this;
    }

    public final void X1(ox6.c cVar, e eVar, long j, vy4 vy4Var, int i, boolean z, float f2) {
        int i2;
        if (cVar == null) {
            D1(eVar, j, vy4Var, i, z);
            return;
        }
        if (!eVar.c(cVar)) {
            X1(pb7.a(cVar, eVar.b()), eVar, j, vy4Var, i, z, f2);
            return;
        }
        if (!eVar.a(cVar)) {
            R1(pb7.a(cVar, eVar.b()), eVar, j, vy4Var, i, z, f2, false);
            return;
        }
        m27 m27Var = vy4Var.u;
        t27<Object> t27Var = vy4Var.t;
        int i3 = vy4Var.v;
        int i4 = t27Var.b;
        if (i3 != i4 - 1) {
            long jD = vy4Var.d();
            int i5 = vy4Var.v;
            int i6 = t27Var.b;
            int i7 = i6 - 1;
            vy4Var.v = i7;
            vy4Var.e(i6, t27Var.b);
            vy4Var.v++;
            t27Var.g(cVar);
            m27Var.a(j84.a(f2, z, false));
            R1(pb7.a(cVar, eVar.b()), eVar, j, vy4Var, i, z, f2, false);
            g2b g2bVar = g2b.a;
            vy4Var.v = i7;
            long jD2 = vy4Var.d();
            if (vy4Var.v + 1 >= t27Var.b - 1 || m33.b(jD, jD2) <= 0) {
                vy4Var.e(vy4Var.v + 1, t27Var.b);
            } else {
                int i8 = i5 + 1;
                boolean zD = m33.d(jD2);
                int i9 = vy4Var.v;
                vy4Var.e(i8, zD ? i9 + 2 : i9 + 1);
            }
            vy4Var.v = i5;
            return;
        }
        int i10 = i3 + 1;
        vy4Var.e(i10, i4);
        vy4Var.v++;
        t27Var.g(cVar);
        m27Var.a(j84.a(f2, z, false));
        R1(pb7.a(cVar, eVar.b()), eVar, j, vy4Var, i, z, f2, false);
        g2b g2bVar2 = g2b.a;
        vy4Var.v = i3;
        if (i10 == t27Var.b - 1 || m33.d(vy4Var.d())) {
            int i11 = vy4Var.v;
            int i12 = i11 + 1;
            t27Var.l(i12);
            if (i12 < 0 || i12 >= (i2 = m27Var.b)) {
                r.b("Index must be between 0 and size");
                return;
            }
            long[] jArr = m27Var.a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                gz3.g(jArr, jArr, i12, i11 + 2, i2);
            }
            m27Var.b--;
        }
    }

    @Override // defpackage.qq5
    public final sk8 Z(qq5 qq5Var, boolean z) {
        if (!g1().G) {
            uc5.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!qq5Var.e()) {
            uc5.b("LayoutCoordinates " + qq5Var + " is not attached!");
        }
        mb7 mb7VarY1 = Y1(qq5Var);
        mb7VarY1.I1();
        mb7 mb7VarX0 = X0(mb7VarY1);
        b37 b37Var = this.W;
        if (b37Var == null) {
            b37Var = new b37();
            this.W = b37Var;
        }
        b37Var.a = 0.0f;
        b37Var.b = 0.0f;
        b37Var.c = (int) (qq5Var.a() >> 32);
        b37Var.d = (int) (qq5Var.a() & 4294967295L);
        while (mb7VarY1 != mb7VarX0) {
            mb7VarY1.U1(b37Var, z, false);
            if (b37Var.b()) {
                return sk8.e;
            }
            mb7VarY1 = mb7VarY1.L;
            mb7VarY1.getClass();
        }
        G0(mb7VarX0, b37Var, z);
        return new sk8(b37Var.a, b37Var.b, b37Var.c, b37Var.d);
    }

    public final sk8 Z1() {
        if (g1().G) {
            qq5 qq5VarD = rq5.d(this);
            b37 b37Var = this.W;
            if (b37Var == null) {
                b37Var = new b37();
                this.W = b37Var;
            }
            long jK0 = K0(f1());
            int i = (int) (jK0 >> 32);
            b37Var.a = -Float.intBitsToFloat(i);
            int i2 = (int) (jK0 & 4294967295L);
            b37Var.b = -Float.intBitsToFloat(i2);
            b37Var.c = Float.intBitsToFloat(i) + g0();
            b37Var.d = Float.intBitsToFloat(i2) + f0();
            while (this != qq5VarD) {
                this.U1(b37Var, false, true);
                if (!b37Var.b()) {
                    this = this.L;
                    this.getClass();
                }
            }
            return new sk8(b37Var.a, b37Var.b, b37Var.c, b37Var.d);
        }
        return sk8.e;
    }

    @Override // defpackage.qq5
    public final long a() {
        return this.v;
    }

    @Override // defpackage.qq5
    public final long a0(long j) {
        if (!g1().G) {
            uc5.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        I1();
        while (this != null) {
            qr5 qr5Var = this.H;
            if (this == qr5Var.Y.d && !qr5Var.v) {
                long jB = ur5.a(qr5Var).getRectManager().b(qr5Var);
                if (!bg5.b(jB, 9223372034707292159L)) {
                    return cg5.b(j, jB);
                }
            }
            ln7 ln7Var = this.g0;
            if (ln7Var != null) {
                j = ln7Var.e(j, false);
            }
            j = cg5.b(j, this.U);
            this = this.L;
        }
        return j;
    }

    public final long a1(long j) {
        long j2 = this.U;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32);
        ln7 ln7Var = this.g0;
        return ln7Var != null ? ln7Var.e(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    public final void a2(mb7 mb7Var, float[] fArr) {
        if (xj5.a(mb7Var, this)) {
            return;
        }
        mb7 mb7Var2 = this.L;
        mb7Var2.getClass();
        mb7Var2.a2(mb7Var, fArr);
        if (!bg5.b(this.U, 0L)) {
            float[] fArr2 = k0;
            xk6.d(fArr2);
            long j = this.U;
            xk6.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            xk6.e(fArr, fArr2);
        }
        ln7 ln7Var = this.g0;
        if (ln7Var != null) {
            ln7Var.i(fArr);
        }
    }

    public final void b2(mb7 mb7Var, float[] fArr) {
        while (!this.equals(mb7Var)) {
            ln7 ln7Var = this.g0;
            if (ln7Var != null) {
                ln7Var.a(fArr);
            }
            long j = this.U;
            if (!bg5.b(j, 0L)) {
                float[] fArr2 = k0;
                xk6.d(fArr2);
                xk6.f(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                xk6.e(fArr, fArr2);
            }
            this = this.L;
            this.getClass();
        }
    }

    public final void c2(oh4<? super ro4, g2b> oh4Var, boolean z) {
        mn7 mn7Var;
        if (oh4Var != null && this.h0 != null) {
            uc5.a("layerBlock can't be provided when explicitLayer is provided");
        }
        qr5 qr5Var = this.H;
        boolean z2 = (!z && this.O == oh4Var && xj5.a(this.P, qr5Var.R) && this.Q == qr5Var.S) ? false : true;
        this.P = qr5Var.R;
        this.Q = qr5Var.S;
        boolean zE = qr5Var.e();
        f fVar = this.e0;
        if (!zE || oh4Var == null) {
            this.O = null;
            ln7 ln7Var = this.g0;
            if (ln7Var != null) {
                if (!z63.f(ln7Var.mo880getUnderlyingMatrixsQKQjiQ())) {
                    qr5Var.Y(this);
                }
                ln7Var.destroy();
                this.g0 = null;
                qr5Var.c0 = true;
                fVar.invoke();
                if (g1().G && qr5Var.j() && (mn7Var = qr5Var.G) != null) {
                    mn7Var.F(qr5Var);
                }
            }
            this.f0 = false;
            return;
        }
        this.O = oh4Var;
        if (this.g0 != null) {
            if (z2) {
                d2(true);
                return;
            }
            return;
        }
        mn7 mn7VarA = ur5.a(qr5Var);
        nb7 nb7Var = this.d0;
        if (nb7Var == null) {
            nb7 nb7Var2 = new nb7(this, new ob7(this));
            this.d0 = nb7Var2;
            nb7Var = nb7Var2;
        }
        ln7 ln7VarW = mn7VarA.w(nb7Var, fVar, null);
        ln7VarW.f(this.v);
        ln7VarW.j(this.U);
        this.g0 = ln7VarW;
        d2(true);
        qr5Var.c0 = true;
        fVar.invoke();
    }

    public final void d2(boolean z) {
        mn7 mn7Var;
        if (this.h0 != null) {
            return;
        }
        ln7 ln7Var = this.g0;
        oh4<? super ro4, g2b> oh4Var = this.O;
        if (ln7Var == null) {
            if (oh4Var == null) {
                return;
            }
            uc5.b("null layer with a non-null layerBlock");
            return;
        }
        if (oh4Var == null) {
            throw ik.a("updateLayerParameters requires a non-null layerBlock");
        }
        sv8 sv8Var = i0;
        sv8Var.e();
        qr5 qr5Var = this.H;
        sv8Var.G = qr5Var.R;
        sv8Var.H = qr5Var.S;
        sv8Var.F = c43.c(this.v);
        ur5.a(qr5Var).getSnapshotObserver().a.d(this, d.u, new g(oh4Var, this));
        jq5 jq5Var = this.X;
        if (jq5Var == null) {
            jq5Var = new jq5();
            this.X = jq5Var;
        }
        jq5 jq5Var2 = j0;
        jq5Var2.getClass();
        jq5Var2.a = jq5Var.a;
        jq5Var2.b = jq5Var.b;
        jq5Var2.c = jq5Var.c;
        jq5Var2.d = jq5Var.d;
        jq5Var2.e = jq5Var.e;
        jq5Var2.f = jq5Var.f;
        jq5Var2.g = jq5Var.g;
        jq5Var2.h = jq5Var.h;
        jq5Var2.i = jq5Var.i;
        jq5Var.a = sv8Var.u;
        jq5Var.b = sv8Var.v;
        jq5Var.c = 0.0f;
        jq5Var.d = 0.0f;
        jq5Var.e = 0.0f;
        jq5Var.f = 0.0f;
        jq5Var.g = sv8Var.A;
        jq5Var.h = sv8Var.B;
        jq5Var.i = sv8Var.C;
        ln7Var.d(sv8Var);
        boolean z2 = this.N;
        this.N = sv8Var.E;
        this.R = sv8Var.w;
        boolean z3 = jq5Var2.a == jq5Var.a && jq5Var2.b == jq5Var.b && jq5Var2.c == jq5Var.c && jq5Var2.d == jq5Var.d && jq5Var2.e == jq5Var.e && jq5Var2.f == jq5Var.f && jq5Var2.g == jq5Var.g && jq5Var2.h == jq5Var.h && ava.a(jq5Var2.i, jq5Var.i);
        if (z && ((!z3 || z2 != this.N) && (mn7Var = qr5Var.G) != null)) {
            mn7Var.F(qr5Var);
        }
        if (z3) {
            return;
        }
        qr5Var.Y(this);
        if (qr5Var.i0 > 0) {
            ur5.a(qr5Var).s(qr5Var);
        }
    }

    @Override // defpackage.qq5
    public final boolean e() {
        return g1().G;
    }

    public abstract ff6 e1();

    public final boolean e2(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        ln7 ln7Var = this.g0;
        return ln7Var == null || !this.N || ln7Var.c(j);
    }

    @Override // defpackage.qq5
    public final long f(long j) {
        if (!g1().G) {
            uc5.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ur5.a(this.H).f(a0(j));
    }

    public final long f1() {
        return this.P.z1(this.H.T.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [k37] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [k37] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // defpackage.kl6, defpackage.pj5
    public final Object g() {
        qr5 qr5Var = this.H;
        if (!qr5Var.Y.d(64)) {
            return null;
        }
        g1();
        gl8 gl8Var = new gl8();
        for (ox6.c cVar = qr5Var.Y.e; cVar != null; cVar = cVar.x) {
            if ((cVar.v & 64) != 0) {
                ?? B = cVar;
                ?? k37Var = 0;
                while (B != 0) {
                    if (B instanceof gt7) {
                        gl8Var.t = ((gt7) B).Z(qr5Var.R, gl8Var.t);
                    } else if ((B.v & 64) != 0 && (B instanceof gw2)) {
                        ox6.c cVar2 = ((gw2) B).I;
                        int i = 0;
                        B = B;
                        k37Var = k37Var;
                        while (cVar2 != null) {
                            if ((cVar2.v & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    k37Var = k37Var;
                                    B = cVar2;
                                } else {
                                    if (k37Var == 0) {
                                        k37Var = new k37(new ox6.c[16]);
                                    }
                                    if (B != 0) {
                                        k37Var.d(B);
                                        B = 0;
                                    }
                                    k37Var.d(cVar2);
                                }
                            }
                            cVar2 = cVar2.y;
                            B = B;
                            k37Var = k37Var;
                        }
                        if (i == 1) {
                        }
                    }
                    B = ew2.b(k37Var);
                }
            }
        }
        return gl8Var.t;
    }

    public abstract ox6.c g1();

    @Override // defpackage.tx2
    public final float getDensity() {
        return this.H.R.getDensity();
    }

    @Override // defpackage.qj5
    public final tq5 getLayoutDirection() {
        return this.H.S;
    }

    @Override // defpackage.jz7
    public void i0(long j, float f2, oh4<? super ro4, g2b> oh4Var) {
        if (!this.I) {
            T1(j, f2, oh4Var, null);
            return;
        }
        ff6 ff6VarE1 = e1();
        ff6VarE1.getClass();
        T1(ff6VarE1.I, f2, oh4Var, null);
    }

    @Override // defpackage.qq5
    public final long j(long j) {
        if (!g1().G) {
            uc5.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return U(rq5.d(this), ur5.a(this.H).j(j));
    }

    @Override // defpackage.jz7
    public void k0(long j, float f2, ko4 ko4Var) {
        if (!this.I) {
            T1(j, f2, null, ko4Var);
            return;
        }
        ff6 ff6VarE1 = e1();
        ff6VarE1.getClass();
        T1(ff6VarE1.I, f2, null, ko4Var);
    }

    @Override // defpackage.qq5
    public final long q(long j) {
        return ur5.a(this.H).d(a0(j));
    }

    public final ox6.c q1(int i) {
        boolean zG = qb7.g(i);
        ox6.c cVarG1 = g1();
        if (!zG && (cVarG1 = cVarG1.x) == null) {
            return null;
        }
        for (ox6.c cVarS1 = s1(zG); cVarS1 != null && (cVarS1.w & i) != 0; cVarS1 = cVarS1.y) {
            if ((cVarS1.v & i) != 0) {
                return cVarS1;
            }
            if (cVarS1 == cVarG1) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.df6
    public final df6 s0() {
        return this.K;
    }

    public final ox6.c s1(boolean z) {
        ox6.c cVarG1;
        kb7 kb7Var = this.H.Y;
        if (kb7Var.d == this) {
            return kb7Var.f;
        }
        mb7 mb7Var = this.L;
        if (!z) {
            if (mb7Var != null) {
                return mb7Var.g1();
            }
            return null;
        }
        if (mb7Var == null || (cVarG1 = mb7Var.g1()) == null) {
            return null;
        }
        return cVarG1.y;
    }

    @Override // defpackage.df6
    public final boolean t0() {
        return this.S != null;
    }

    public final void t1(ox6.c cVar, e eVar, long j, vy4 vy4Var, int i, boolean z) {
        if (cVar == null) {
            D1(eVar, j, vy4Var, i, z);
            return;
        }
        if (!eVar.c(cVar)) {
            t1(pb7.a(cVar, eVar.b()), eVar, j, vy4Var, i, z);
            return;
        }
        int i2 = vy4Var.v;
        t27<Object> t27Var = vy4Var.t;
        vy4Var.e(i2 + 1, t27Var.b);
        vy4Var.v++;
        t27Var.g(cVar);
        vy4Var.u.a(j84.a(-1.0f, z, false));
        t1(pb7.a(cVar, eVar.b()), eVar, j, vy4Var, i, z);
        vy4Var.v = i2;
    }

    @Override // defpackage.qq5
    public final qq5 v() {
        if (!g1().G) {
            uc5.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        I1();
        return this.L;
    }

    @Override // defpackage.df6
    public final gl6 v0() {
        gl6 gl6Var = this.S;
        if (gl6Var != null) {
            return gl6Var;
        }
        aa0.c("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    public final void v1(ox6.c cVar, e eVar, long j, vy4 vy4Var, int i, boolean z, float f2) {
        if (cVar == null) {
            D1(eVar, j, vy4Var, i, z);
            return;
        }
        if (!eVar.c(cVar)) {
            v1(pb7.a(cVar, eVar.b()), eVar, j, vy4Var, i, z, f2);
            return;
        }
        int i2 = vy4Var.v;
        t27<Object> t27Var = vy4Var.t;
        vy4Var.e(i2 + 1, t27Var.b);
        vy4Var.v++;
        t27Var.g(cVar);
        vy4Var.u.a(j84.a(f2, z, false));
        R1(pb7.a(cVar, eVar.b()), eVar, j, vy4Var, i, z, f2, true);
        vy4Var.v = i2;
    }

    @Override // defpackage.df6
    public final df6 x0() {
        return this.L;
    }

    @Override // defpackage.df6, defpackage.il6
    public final qr5 x1() {
        return this.H;
    }

    @Override // defpackage.qq5
    public final void y(float[] fArr) {
        mn7 mn7VarA = ur5.a(this.H);
        mb7 mb7VarY1 = Y1(rq5.d(this));
        b2(mb7VarY1, fArr);
        if (mn7VarA instanceof zk6) {
            ((zk6) mn7VarA).r(fArr);
            return;
        }
        long jF = mb7VarY1.f(0L);
        if ((9223372034707292159L & jF) != 9205357640488583168L) {
            xk6.f(fArr, Float.intBitsToFloat((int) (jF >> 32)), Float.intBitsToFloat((int) (jF & 4294967295L)));
        }
    }

    @Override // defpackage.qq5
    public final void z(qq5 qq5Var, float[] fArr) {
        mb7 mb7VarY1 = Y1(qq5Var);
        mb7VarY1.I1();
        mb7 mb7VarX0 = X0(mb7VarY1);
        xk6.d(fArr);
        mb7VarY1.b2(mb7VarX0, fArr);
        a2(mb7VarX0, fArr);
    }

    @Override // defpackage.df6
    public final long z0() {
        return this.U;
    }

    @Override // defpackage.df6
    public final qq5 j0() {
        return this;
    }
}
