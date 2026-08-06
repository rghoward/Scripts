package defpackage;

import android.graphics.Bitmap;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mr {
    public static final void a(final cg7 cg7Var, final di diVar, fr1 fr1Var, jt1 jt1Var, final int i) {
        int i2;
        final fr1 fr1Var2;
        bj4 bj4VarO = jt1Var.o(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bj4VarO.J(cg7Var) : bj4VarO.j(cg7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(diVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 256 : 128;
        }
        boolean z = true;
        if (bj4VarO.A(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !bj4VarO.J(cg7Var))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objF = bj4VarO.f();
            if (z3 || objF == jt1.a.a) {
                objF = new at4(diVar, cg7Var);
                bj4VarO.C(objF);
            }
            fr1Var2 = fr1Var;
            fq.a((at4) objF, null, new m68(false, s89.t, false, 0), fr1Var2, bj4VarO, ((i2 << 3) & 7168) | 384, 2);
        } else {
            fr1Var2 = fr1Var;
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ir
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    mr.a(cg7Var, diVar, fr1Var2, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final cg7 cg7Var, final boolean z, final jt8 jt8Var, final boolean z2, long j, final float f, final ox6 ox6Var, jt1 jt1Var, final int i) {
        int i2;
        final long j2;
        int i3;
        long j3;
        final boolean z3;
        bj4 bj4VarO = jt1Var.o(-466280168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bj4VarO.J(cg7Var) : bj4VarO.j(cg7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.c(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.h(jt8Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.c(z2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= bj4VarO.J(ox6Var) ? 1048576 : 524288;
        }
        if (bj4VarO.A(i2 & 1, (533651 & i2) != 533650)) {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                i3 = i2 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                bj4VarO.u();
                i3 = i2 & (-57345);
                j3 = j;
            }
            bj4VarO.V();
            jt8 jt8Var2 = jt8.u;
            jt8 jt8Var3 = jt8.t;
            if (z) {
                gc9<za9> gc9Var = ab9.a;
                z3 = (jt8Var == jt8Var3 && !z2) || (jt8Var == jt8Var2 && z2);
            } else {
                gc9<za9> gc9Var2 = ab9.a;
                z3 = (jt8Var != jt8Var3 || z2) && !(jt8Var == jt8Var2 && z2);
            }
            rp0 rp0Var = z3 ? g0.b : g0.a;
            int i4 = i3 & 14;
            boolean zC = ((i3 & 112) == 32) | (i4 == 4 || ((i3 & 8) != 0 && bj4VarO.j(cg7Var))) | bj4VarO.c(z3);
            Object objF = bj4VarO.f();
            if (zC || objF == jt1.a.a) {
                objF = new oh4() { // from class: jr
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        hc9 hc9Var = (hc9) obj;
                        long jA = cg7Var.a();
                        hc9Var.d(ab9.a, new za9(z ? ys4.u : ys4.v, jA, z3 ? ya9.t : ya9.v, (9223372034707292159L & jA) != 9205357640488583168L));
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF);
            }
            final ox6 ox6VarB = pb9.b(ox6Var, false, (oh4) objF);
            final lgb lgbVar = (lgb) bj4VarO.F(qu1.t);
            long j4 = j3;
            rp0 rp0Var2 = rp0Var;
            j2 = j4;
            a(cg7Var, rp0Var2, gr1.b(1365123137, new ci4() { // from class: kr
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    jt1 jt1Var2 = (jt1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                        kf8 kf8VarA = qu1.t.a(lgbVar);
                        final long j5 = j2;
                        final boolean z4 = z3;
                        final ox6 ox6Var2 = ox6VarB;
                        final cg7 cg7Var2 = cg7Var;
                        nu1.a(kf8VarA, gr1.b(1260045569, new ci4() { // from class: cr
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj3, Object obj4) {
                                jt1 jt1Var3 = (jt1) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (jt1Var3.A(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j6 = j5;
                                    boolean z5 = z4;
                                    ox6 ox6Var3 = ox6Var2;
                                    cg7 cg7Var3 = cg7Var2;
                                    jt1.a.C0187a c0187a = jt1.a.a;
                                    if (j6 != 9205357640488583168L) {
                                        jt1Var3.K(3458246);
                                        c30.e eVar = z5 ? c30.a.c : c30.a.a;
                                        ox6 ox6VarH = ir9.h(ox6Var3, c53.b(j6), c53.a(j6), 0.0f, 0.0f, 12);
                                        ny8 ny8VarA = ly8.a(eVar, di.a.j, jt1Var3, 0);
                                        int iHashCode = Long.hashCode(jt1Var3.v());
                                        kw7 kw7VarY = jt1Var3.y();
                                        ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                                        bt1.c.getClass();
                                        qr5.a aVar = bt1.a.b;
                                        if (jt1Var3.s() == null) {
                                            ml5.c();
                                            throw null;
                                        }
                                        jt1Var3.q();
                                        if (jt1Var3.l()) {
                                            jt1Var3.k(aVar);
                                        } else {
                                            jt1Var3.z();
                                        }
                                        rd7.d(jt1Var3, bt1.a.f, ny8VarA);
                                        rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                                        rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode));
                                        rd7.c(jt1Var3, bt1.a.h);
                                        rd7.d(jt1Var3, bt1.a.d, ox6VarC);
                                        boolean zJ = jt1Var3.j(cg7Var3);
                                        Object objF2 = jt1Var3.f();
                                        if (zJ || objF2 == c0187a) {
                                            objF2 = new br(0, cg7Var3);
                                            jt1Var3.C(objF2);
                                        }
                                        mr.c(ox6.a.t, (mh4) objF2, z5, jt1Var3, 6);
                                        jt1Var3.I();
                                        jt1Var3.B();
                                    } else {
                                        jt1Var3.K(4389176);
                                        boolean zJ2 = jt1Var3.j(cg7Var3);
                                        Object objF3 = jt1Var3.f();
                                        if (zJ2 || objF3 == c0187a) {
                                            objF3 = new dr(0, cg7Var3);
                                            jt1Var3.C(objF3);
                                        }
                                        mr.c(ox6Var3, (mh4) objF3, z5, jt1Var3, 0);
                                        jt1Var3.B();
                                    }
                                } else {
                                    jt1Var3.u();
                                }
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 56);
                    } else {
                        jt1Var2.u();
                    }
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, i4 | 384);
        } else {
            bj4VarO.u();
            j2 = j;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final long j5 = j2;
            xj8VarW.d = new ci4() { // from class: lr
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mr.b(cg7Var, z, jt8Var, z2, j5, f, ox6Var, (jt1) obj, gz3.s(i | 1));
                    return g2b.a;
                }
            };
        }
    }

    public static final void c(final ox6 ox6Var, final mh4<Boolean> mh4Var, final boolean z, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(2111672474);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (bj4VarO.j(mh4Var) ? 32 : 16) | (bj4VarO.c(z) ? 256 : 128);
        if (bj4VarO.A(i3 & 1, (i3 & 147) != 146)) {
            gc9<za9> gc9Var = ab9.a;
            b47.b(bj4VarO, it1.a(ir9.k(25.0f, 25.0f, ox6Var), new ei4() { // from class: fr
                @Override // defpackage.ei4
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ox6 ox6Var2 = (ox6) obj;
                    jt1 jt1Var2 = (jt1) obj2;
                    ((Integer) obj3).getClass();
                    jt1Var2.K(-196777734);
                    final long j = ((qja) jt1Var2.F(rja.a)).a;
                    boolean zI = jt1Var2.i(j);
                    final mh4 mh4Var2 = mh4Var;
                    boolean zJ = zI | jt1Var2.J(mh4Var2);
                    final boolean z2 = z;
                    boolean zC = zJ | jt1Var2.c(z2);
                    Object objF = jt1Var2.f();
                    if (zC || objF == jt1.a.a) {
                        objF = new oh4() { // from class: gr
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj4) {
                                s01 s01Var = (s01) obj4;
                                final l75 l75VarD = mr.d(s01Var, Float.intBitsToFloat((int) (s01Var.t.c() >> 32)) / 2.0f);
                                final wq0 wq0Var = new wq0(5, j);
                                final mh4 mh4Var3 = mh4Var2;
                                final boolean z3 = z2;
                                return s01Var.e(new oh4() { // from class: hr
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj5) {
                                        cz1 cz1Var = (cz1) obj5;
                                        cz1Var.K1();
                                        if (!((Boolean) mh4Var3.invoke()).booleanValue()) {
                                            return g2b.a;
                                        }
                                        boolean z4 = z3;
                                        l75 l75Var = l75VarD;
                                        wq0 wq0Var2 = wq0Var;
                                        if (z4) {
                                            long jU1 = cz1Var.u1();
                                            s41.b bVarY0 = cz1Var.Y0();
                                            long jD = bVarY0.d();
                                            bVarY0.a().f();
                                            try {
                                                bVarY0.a.e(-1.0f, 1.0f, jU1);
                                                d73.L1(cz1Var, l75Var, 0L, 0.0f, wq0Var2, 46);
                                            } finally {
                                                x3.b(bVarY0, jD);
                                            }
                                        } else {
                                            d73.L1(cz1Var, l75Var, 0L, 0.0f, wq0Var2, 46);
                                        }
                                        return g2b.a;
                                    }
                                });
                            }
                        };
                        jt1Var2.C(objF);
                    }
                    ox6 ox6VarD = z63.d(ox6Var2, (oh4) objF);
                    jt1Var2.B();
                    return ox6VarD;
                }
            }));
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: er
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    mr.c(ox6Var, mh4Var, z, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    public static final l75 d(s01 s01Var, float f) {
        int iCeil = ((int) Math.ceil(f)) * 2;
        po poVarA = zs4.t;
        ol olVarB = zs4.u;
        s41 s41Var = zs4.v;
        if (poVarA != null) {
            Bitmap bitmap = poVarA.a;
            if (olVarB == null || iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                poVarA = yq5.a(iCeil, iCeil, 1);
                zs4.t = poVarA;
                olVarB = ml5.b(poVarA);
                zs4.u = olVarB;
            }
        } else {
            poVarA = yq5.a(iCeil, iCeil, 1);
            zs4.t = poVarA;
            olVarB = ml5.b(poVarA);
            zs4.u = olVarB;
        }
        po poVar = poVarA;
        ol olVar = olVarB;
        Bitmap bitmap2 = poVar.a;
        if (s41Var == null) {
            s41Var = new s41();
            zs4.v = s41Var;
        }
        s41 s41Var2 = s41Var;
        s41.a aVar = s41Var2.t;
        tq5 layoutDirection = s01Var.t.getLayoutDirection();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        tx2 tx2Var = aVar.a;
        tq5 tq5Var = aVar.b;
        n41 n41Var = aVar.c;
        long j = aVar.d;
        aVar.a = s01Var;
        aVar.b = layoutDirection;
        aVar.c = olVar;
        aVar.d = jFloatToRawIntBits;
        olVar.f();
        d73.W0(s41Var2, uh1.b, 0L, s41Var2.c(), 0.0f, 58);
        d73.W0(s41Var2, u7d.d(4278190080L), 0L, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, 120);
        d73.N(s41Var2, u7d.d(4278190080L), f, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0, 120);
        olVar.o();
        aVar.a = tx2Var;
        aVar.b = tq5Var;
        aVar.c = n41Var;
        aVar.d = j;
        return poVar;
    }
}
