package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ae8 {
    public static final dc2 a = zy6.c;

    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:88:0x0204  */
    /* JADX WARN: Code duplicated, block: B:90:0x022f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0242  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void a(ox6 ox6Var, long j, float f, long j2, int i, float f2, jt1 jt1Var, final int i2, final int i3) {
        ox6 ox6Var2;
        int i4;
        long jD;
        float f3;
        int i5;
        boolean z;
        bj4 bj4Var;
        final long j3;
        final ox6 ox6Var3;
        final long j4;
        final float f4;
        final int i6;
        final float f5;
        xj8 xj8VarW;
        ox6 ox6Var4;
        long j5;
        int i7;
        final float f6;
        final int i8;
        final b3a b3aVar;
        final wb5.a aVarA;
        final wb5.a aVarA2;
        final wb5.a aVarA3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zJ;
        Object objF;
        final long j6;
        final float f7;
        final long j7;
        bj4 bj4VarO = jt1Var.o(333154241);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            ox6Var2 = ox6Var;
        } else if ((i2 & 6) == 0) {
            ox6Var2 = ox6Var;
            i4 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i2;
        } else {
            ox6Var2 = ox6Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            jD = j;
            i4 |= ((i3 & 2) == 0 && bj4VarO.i(jD)) ? 32 : 16;
        } else {
            jD = j;
        }
        int i10 = i3 & 4;
        if (i10 == 0) {
            if ((i2 & 384) == 0) {
                f3 = f;
                i4 |= bj4VarO.g(f3) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i4 |= 1024;
            }
            i5 = i4 | 221184;
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bj4VarO.A(i5 & 1, z)) {
                bj4VarO.v0();
                if ((i2 & 1) != 0 || bj4VarO.c0()) {
                    if (i9 != 0) {
                        ox6Var4 = ox6.a.t;
                    } else {
                        ox6Var4 = ox6Var2;
                    }
                    if ((i3 & 2) != 0) {
                        jD = hi1.d(sy.b, bj4VarO);
                        i5 &= -113;
                    }
                    if (i10 != 0) {
                        f3 = 4.0f;
                    }
                    j5 = uh1.j;
                    i7 = i5 & (-7169);
                    f6 = 4.0f;
                    i8 = 1;
                } else {
                    bj4VarO.u();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    j5 = j2;
                    i8 = i;
                    f6 = f2;
                    i7 = i5 & (-7169);
                    ox6Var4 = ox6Var2;
                }
                bj4VarO.V();
                b3aVar = new b3a(((tx2) bj4VarO.F(qu1.h)).U0(f3), 0.0f, i8, 0, 26);
                wb5 wb5VarC = cc5.c(null, bj4VarO, 1);
                aVarA = cc5.a(wb5VarC, 0.0f, 1080.0f, xv.a(xv.c(6000, 0, ca3.c, 2), null, 6), null, bj4VarO, 4536, 8);
                zd8 zd8Var = new zd8(0);
                gp5.b bVar = new gp5.b();
                zd8Var.invoke(bVar);
                aVarA2 = cc5.a(wb5VarC, 0.0f, 360.0f, xv.a(new gp5(bVar), null, 6), null, bj4VarO, 4536, 8);
                bj4Var = bj4VarO;
                gp5.b bVar2 = new gp5.b();
                bVar2.a = 6000;
                bVar2.a(3000, Float.valueOf(0.87f)).b = a;
                bVar2.a(6000, Float.valueOf(0.1f));
                g2b g2bVar = g2b.a;
                aVarA3 = cc5.a(wb5VarC, 0.1f, 0.87f, xv.a(new gp5(bVar2), null, 6), null, bj4VarO, 4536, 8);
                ox6 ox6VarJ = ir9.j(pb9.b(ox6Var4, true, new be8(0)), 40.0f);
                boolean zJ2 = bj4Var.J(aVarA3);
                ox6 ox6Var5 = ox6Var4;
                if ((i7 & 57344) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z5 = zJ2 | z2;
                if ((458752 & i7) == 131072) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z6 = z5 | z3;
                if ((i7 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zJ = z6 | z4 | bj4Var.J(aVarA) | bj4Var.J(aVarA2) | bj4Var.i(j5) | bj4Var.j(b3aVar) | ((((i7 & 112) ^ 48) <= 32 && bj4Var.i(jD)) || (i7 & 48) == 32);
                objF = bj4Var.f();
                if (!zJ || objF == jt1.a.a) {
                    j6 = jD;
                    f7 = f3;
                    j7 = j5;
                    objF = new oh4() { // from class: vd8
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            long j8 = j7;
                            b3a b3aVar2 = b3aVar;
                            long j9 = j6;
                            d73 d73Var = (d73) obj;
                            float fFloatValue = ((Number) aVarA3.getValue()).floatValue() * 360.0f;
                            int i11 = i8;
                            float f8 = f6;
                            if (i11 != 0 && Float.intBitsToFloat((int) (d73Var.c() & 4294967295L)) <= Float.intBitsToFloat((int) (d73Var.c() >> 32))) {
                                f8 += f7;
                            }
                            float fI0 = (f8 / ((float) (((double) d73Var.I0(Float.intBitsToFloat((int) (d73Var.c() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fFloatValue2 = ((Number) aVarA2.getValue()).floatValue() + ((Number) aVarA.getValue()).floatValue();
                            long jU1 = d73Var.u1();
                            s41.b bVarY0 = d73Var.Y0();
                            long jD2 = bVarY0.d();
                            bVarY0.a().f();
                            try {
                                bVarY0.a.d(fFloatValue2, jU1);
                                ae8.c(d73Var, Math.min(fFloatValue, fI0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fI0) * 2.0f), j8, b3aVar2);
                                ae8.c(d73Var, 0.0f, fFloatValue, j9, b3aVar2);
                                return g2b.a;
                            } finally {
                                x3.b(bVarY0, jD2);
                            }
                        }
                    };
                    bj4Var.C(objF);
                } else {
                    j6 = jD;
                    f7 = f3;
                    j7 = j5;
                }
                us3.b(ox6VarJ, (oh4) objF, bj4Var, 0);
                ox6Var3 = ox6Var5;
                i6 = i8;
                f5 = f6;
                f4 = f7;
                j3 = j7;
                j4 = j6;
            } else {
                bj4Var = bj4VarO;
                bj4Var.u();
                j3 = j2;
                ox6Var3 = ox6Var2;
                j4 = jD;
                f4 = f3;
                i6 = i;
                f5 = f2;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: wd8
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ae8.a(ox6Var3, j4, f4, j3, i6, f5, (jt1) obj, gz3.s(i2 | 1), i3);
                        return g2b.a;
                    }
                };
            }
        }
        i4 |= 384;
        f3 = f;
        if ((i2 & 3072) == 0) {
            i4 |= 1024;
        }
        i5 = i4 | 221184;
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (bj4VarO.A(i5 & 1, z)) {
            bj4VarO.v0();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    ox6Var4 = ox6.a.t;
                } else {
                    ox6Var4 = ox6Var2;
                }
                if ((i3 & 2) != 0) {
                    jD = hi1.d(sy.b, bj4VarO);
                    i5 &= -113;
                }
                if (i10 != 0) {
                    f3 = 4.0f;
                }
                j5 = uh1.j;
                i7 = i5 & (-7169);
                f6 = 4.0f;
                i8 = 1;
            } else {
                if (i9 != 0) {
                    ox6Var4 = ox6.a.t;
                } else {
                    ox6Var4 = ox6Var2;
                }
                if ((i3 & 2) != 0) {
                    jD = hi1.d(sy.b, bj4VarO);
                    i5 &= -113;
                }
                if (i10 != 0) {
                    f3 = 4.0f;
                }
                j5 = uh1.j;
                i7 = i5 & (-7169);
                f6 = 4.0f;
                i8 = 1;
            }
            bj4VarO.V();
            b3aVar = new b3a(((tx2) bj4VarO.F(qu1.h)).U0(f3), 0.0f, i8, 0, 26);
            wb5 wb5VarC2 = cc5.c(null, bj4VarO, 1);
            aVarA = cc5.a(wb5VarC2, 0.0f, 1080.0f, xv.a(xv.c(6000, 0, ca3.c, 2), null, 6), null, bj4VarO, 4536, 8);
            zd8 zd8Var2 = new zd8(0);
            gp5.b bVar3 = new gp5.b();
            zd8Var2.invoke(bVar3);
            aVarA2 = cc5.a(wb5VarC2, 0.0f, 360.0f, xv.a(new gp5(bVar3), null, 6), null, bj4VarO, 4536, 8);
            bj4Var = bj4VarO;
            gp5.b bVar4 = new gp5.b();
            bVar4.a = 6000;
            bVar4.a(3000, Float.valueOf(0.87f)).b = a;
            bVar4.a(6000, Float.valueOf(0.1f));
            g2b g2bVar2 = g2b.a;
            aVarA3 = cc5.a(wb5VarC2, 0.1f, 0.87f, xv.a(new gp5(bVar4), null, 6), null, bj4VarO, 4536, 8);
            ox6 ox6VarJ2 = ir9.j(pb9.b(ox6Var4, true, new be8(0)), 40.0f);
            boolean zJ3 = bj4Var.J(aVarA3);
            ox6 ox6Var6 = ox6Var4;
            if ((i7 & 57344) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z7 = zJ3 | z2;
            if ((458752 & i7) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z8 = z7 | z3;
            if ((i7 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            zJ = z8 | z4 | bj4Var.J(aVarA) | bj4Var.J(aVarA2) | bj4Var.i(j5) | bj4Var.j(b3aVar) | ((((i7 & 112) ^ 48) <= 32 && bj4Var.i(jD)) || (i7 & 48) == 32);
            objF = bj4Var.f();
            if (zJ) {
                j6 = jD;
                f7 = f3;
                j7 = j5;
                objF = new oh4() { // from class: vd8
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        long j8 = j7;
                        b3a b3aVar2 = b3aVar;
                        long j9 = j6;
                        d73 d73Var = (d73) obj;
                        float fFloatValue = ((Number) aVarA3.getValue()).floatValue() * 360.0f;
                        int i11 = i8;
                        float f8 = f6;
                        if (i11 != 0 && Float.intBitsToFloat((int) (d73Var.c() & 4294967295L)) <= Float.intBitsToFloat((int) (d73Var.c() >> 32))) {
                            f8 += f7;
                        }
                        float fI0 = (f8 / ((float) (((double) d73Var.I0(Float.intBitsToFloat((int) (d73Var.c() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) aVarA2.getValue()).floatValue() + ((Number) aVarA.getValue()).floatValue();
                        long jU1 = d73Var.u1();
                        s41.b bVarY0 = d73Var.Y0();
                        long jD2 = bVarY0.d();
                        bVarY0.a().f();
                        try {
                            bVarY0.a.d(fFloatValue2, jU1);
                            ae8.c(d73Var, Math.min(fFloatValue, fI0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fI0) * 2.0f), j8, b3aVar2);
                            ae8.c(d73Var, 0.0f, fFloatValue, j9, b3aVar2);
                            return g2b.a;
                        } finally {
                            x3.b(bVarY0, jD2);
                        }
                    }
                };
                bj4Var.C(objF);
            } else {
                j6 = jD;
                f7 = f3;
                j7 = j5;
                objF = new oh4() { // from class: vd8
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        long j8 = j7;
                        b3a b3aVar2 = b3aVar;
                        long j9 = j6;
                        d73 d73Var = (d73) obj;
                        float fFloatValue = ((Number) aVarA3.getValue()).floatValue() * 360.0f;
                        int i11 = i8;
                        float f8 = f6;
                        if (i11 != 0 && Float.intBitsToFloat((int) (d73Var.c() & 4294967295L)) <= Float.intBitsToFloat((int) (d73Var.c() >> 32))) {
                            f8 += f7;
                        }
                        float fI0 = (f8 / ((float) (((double) d73Var.I0(Float.intBitsToFloat((int) (d73Var.c() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) aVarA2.getValue()).floatValue() + ((Number) aVarA.getValue()).floatValue();
                        long jU1 = d73Var.u1();
                        s41.b bVarY0 = d73Var.Y0();
                        long jD2 = bVarY0.d();
                        bVarY0.a().f();
                        try {
                            bVarY0.a.d(fFloatValue2, jU1);
                            ae8.c(d73Var, Math.min(fFloatValue, fI0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fI0) * 2.0f), j8, b3aVar2);
                            ae8.c(d73Var, 0.0f, fFloatValue, j9, b3aVar2);
                            return g2b.a;
                        } finally {
                            x3.b(bVarY0, jD2);
                        }
                    }
                };
                bj4Var.C(objF);
            }
            us3.b(ox6VarJ2, (oh4) objF, bj4Var, 0);
            ox6Var3 = ox6Var6;
            i6 = i8;
            f5 = f6;
            f4 = f7;
            j3 = j7;
            j4 = j6;
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
            j3 = j2;
            ox6Var3 = ox6Var2;
            j4 = jD;
            f4 = f3;
            i6 = i;
            f5 = f2;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: wd8
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ae8.a(ox6Var3, j4, f4, j3, i6, f5, (jt1) obj, gz3.s(i2 | 1), i3);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final mh4 mh4Var, final ox6 ox6Var, final long j, final long j2, final int i, final float f, final oh4 oh4Var, jt1 jt1Var, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(-339970038);
        int i4 = i2 | (bj4VarO.j(mh4Var) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i4 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        int i5 = i4 | (bj4VarO.i(j) ? 256 : 128) | (bj4VarO.i(j2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024) | (bj4VarO.h(i) ? 16384 : 8192);
        boolean z = true;
        if (bj4VarO.A(i5 & 1, (599187 & i5) != 599186)) {
            bj4VarO.v0();
            if ((i2 & 1) != 0 && !bj4VarO.c0()) {
                bj4VarO.u();
            }
            bj4VarO.V();
            boolean z2 = (i5 & 14) == 4;
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (z2 || objF == c0187a) {
                objF = new yi4(1, mh4Var);
                bj4VarO.C(objF);
            }
            final mh4 mh4Var2 = (mh4) objF;
            ox6 ox6VarH = ox6Var.H(y4.b);
            boolean zJ = bj4VarO.J(mh4Var2);
            Object objF2 = bj4VarO.f();
            if (zJ || objF2 == c0187a) {
                objF2 = new ny(mh4Var2, 2);
                bj4VarO.C(objF2);
            }
            ox6 ox6VarK = ir9.k(240.0f, 4.0f, pb9.b(ox6VarH, true, (oh4) objF2));
            boolean zJ2 = ((57344 & i5) == 16384) | bj4VarO.J(mh4Var2) | ((((i5 & 7168) ^ 3072) > 2048 && bj4VarO.i(j2)) || (i5 & 3072) == 2048);
            if ((((i5 & 896) ^ 384) <= 256 || !bj4VarO.i(j)) && (i5 & 384) != 256) {
                z = false;
            }
            boolean z3 = zJ2 | z;
            Object objF3 = bj4VarO.f();
            if (z3 || objF3 == c0187a) {
                i3 = 0;
                oh4 oh4Var2 = new oh4() { // from class: xd8
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        d73 d73Var = (d73) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (d73Var.c() & 4294967295L));
                        int i6 = i;
                        float fI0 = f;
                        if (i6 != 0 && Float.intBitsToFloat((int) (d73Var.c() & 4294967295L)) <= Float.intBitsToFloat((int) (d73Var.c() >> 32))) {
                            fI0 += d73Var.I0(fIntBitsToFloat);
                        }
                        float fI1 = fI0 / d73Var.I0(Float.intBitsToFloat((int) (d73Var.c() >> 32)));
                        float fFloatValue = ((Number) mh4Var2.invoke()).floatValue();
                        float fMin = Math.min(fFloatValue, fI1) + fFloatValue;
                        if (fMin <= 1.0f) {
                            ae8.d(d73Var, fMin, 1.0f, j2, fIntBitsToFloat, i6);
                        }
                        ae8.d(d73Var, 0.0f, fFloatValue, j, fIntBitsToFloat, i6);
                        oh4Var.invoke(d73Var);
                        return g2b.a;
                    }
                };
                bj4VarO.C(oh4Var2);
                objF3 = oh4Var2;
            } else {
                i3 = 0;
            }
            us3.b(ox6VarK, (oh4) objF3, bj4VarO, i3);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: yd8
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ae8.b(mh4Var, ox6Var, j, j2, i, f, oh4Var, (jt1) obj, gz3.s(i2 | 1));
                    return g2b.a;
                }
            };
        }
    }

    public static final void c(d73 d73Var, float f, float f2, long j, b3a b3aVar) {
        float f3 = b3aVar.a / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (d73Var.c() >> 32)) - (2.0f * f3);
        d73Var.M1(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), b3aVar);
    }

    public static final void d(d73 d73Var, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (d73Var.c() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (d73Var.c() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = d73Var.getLayoutDirection() == tq5.t;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            d73Var.H1(j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, (480 & 16) != 0 ? 0 : 0, 3);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            d73Var.H1(j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, (480 & 16) != 0 ? 0 : i, 3);
        }
    }
}
