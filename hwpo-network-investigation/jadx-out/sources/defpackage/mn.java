package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mn {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(final cg7 cg7Var, final ox6 ox6Var, final long j, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(1776202187);
        int i3 = (bj4VarO.J(cg7Var) ? 4 : 2) | i | (bj4VarO.J(ox6Var) ? 32 : 16) | 128;
        if (bj4VarO.A(i3 & 1, (i3 & 147) != 146)) {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                bj4VarO.u();
                i2 = i3 & (-897);
            }
            bj4VarO.V();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objF = bj4VarO.f();
            if (z || objF == jt1.a.a) {
                objF = new hn(0, cg7Var);
                bj4VarO.C(objF);
            }
            final ox6 ox6VarB = pb9.b(ox6Var, false, (oh4) objF);
            mr.a(cg7Var, di.a.b, gr1.b(-1653527038, new ci4() { // from class: in
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    jt1 jt1Var2 = (jt1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                        long j2 = j;
                        ox6 ox6Var2 = ox6VarB;
                        if (j2 != 9205357640488583168L) {
                            jt1Var2.K(-1244013944);
                            ox6 ox6VarH = ir9.h(ox6Var2, c53.b(j2), c53.a(j2), 0.0f, 0.0f, 12);
                            fl6 fl6VarD = dv0.d(di.a.b, false);
                            int iHashCode = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6 ox6VarC = it1.c(jt1Var2, ox6VarH);
                            bt1.c.getClass();
                            qr5.a aVar = bt1.a.b;
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar);
                            } else {
                                jt1Var2.z();
                            }
                            rd7.d(jt1Var2, bt1.a.f, fl6VarD);
                            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(jt1Var2, bt1.a.h);
                            rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                            mn.b(null, jt1Var2, 0, 1);
                            jt1Var2.I();
                            jt1Var2.B();
                        } else {
                            jt1Var2.K(-1243644858);
                            mn.b(ox6Var2, jt1Var2, 0, 0);
                            jt1Var2.B();
                        }
                    } else {
                        jt1Var2.u();
                    }
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, i4 | 432);
        } else {
            bj4VarO.u();
        }
        final long j2 = j;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(ox6Var, j2, i) { // from class: jn
                public final /* synthetic */ ox6 u;
                public final /* synthetic */ long v;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    mn.a(this.t, this.u, this.v, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            ox6 ox6VarK = ir9.k(a, 25.0f, ox6Var);
            final long j = ((qja) bj4VarO.F(rja.a)).a;
            b47.b(bj4VarO, z63.d(ox6VarK, new oh4() { // from class: ln
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    s01 s01Var = (s01) obj;
                    final float fIntBitsToFloat = Float.intBitsToFloat((int) (s01Var.t.c() >> 32)) / 2.0f;
                    final l75 l75VarD = mr.d(s01Var, fIntBitsToFloat);
                    final wq0 wq0Var = new wq0(5, j);
                    return s01Var.e(new oh4() { // from class: gn
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            float f = fIntBitsToFloat;
                            l75 l75Var = l75VarD;
                            wq0 wq0Var2 = wq0Var;
                            cz1 cz1Var = (cz1) obj2;
                            cz1Var.K1();
                            s41.b bVarY0 = cz1Var.Y0();
                            long jD = bVarY0.d();
                            bVarY0.a().f();
                            try {
                                t41 t41Var = bVarY0.a;
                                t41Var.f(f, 0.0f);
                                t41Var.d(45.0f, 0L);
                                d73.L1(cz1Var, l75Var, 0L, 0.0f, wq0Var2, 46);
                                return g2b.a;
                            } finally {
                                x3.b(bVarY0, jD);
                            }
                        }
                    });
                }
            }));
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(i, i2) { // from class: kn
                public final /* synthetic */ int u;

                {
                    this.u = i2;
                }

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    mn.b(this.t, (jt1) obj, iS, this.u);
                    return g2b.a;
                }
            };
        }
    }
}
