package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import defpackage.b3a;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.cu7;
import defpackage.d73;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.s41;
import defpackage.uh1;
import defpackage.un6;
import defpackage.us3;
import defpackage.vp;
import defpackage.wq0;
import defpackage.x3;
import defpackage.xj8;
import defpackage.xp;
import defpackage.zf0;
import defpackage.zy3;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.StarRatingKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class StarRatingKt {
    public static final void SelectedStar(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-596392123);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            m495StarRatingtAjK0ZQ(ir9.d(ir9.n(ox6.a.t, 44.0f), 44.0f), uh1.i, 0.0f, 0L, bj4VarO, 54, 12);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new un6(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SelectedStar$lambda$4(int i, jt1 jt1Var, int i2) {
        SelectedStar(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0121  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: StarRating-tAjK0ZQ, reason: not valid java name */
    public static final void m495StarRatingtAjK0ZQ(ox6 ox6Var, long j, float f, long j2, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        long j3;
        float f2;
        long jM834getAccessibleBorderColor8_81llA;
        final ox6 ox6Var3;
        boolean z;
        boolean z2;
        Object objF;
        final long j4;
        final float f3;
        final long j5;
        xj8 xj8VarW;
        int i4;
        bj4 bj4VarO = jt1Var.o(-1509251218);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
            j3 = j;
        } else {
            j3 = j;
            if ((i & 48) == 0) {
                i3 |= bj4VarO.i(j3) ? 32 : 16;
            }
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                f2 = f;
                i3 |= bj4VarO.g(f2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                jM834getAccessibleBorderColor8_81llA = j2;
                if ((i2 & 8) == 0 || !bj4VarO.i(jM834getAccessibleBorderColor8_81llA)) {
                    i4 = 1024;
                } else {
                    i4 = 2048;
                }
                i3 |= i4;
            } else {
                jM834getAccessibleBorderColor8_81llA = j2;
            }
            if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                bj4VarO.v0();
                if ((i & 1) != 0 || bj4VarO.c0()) {
                    if (i5 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        j3 = uh1.e;
                    }
                    if (i7 != 0) {
                        f2 = 1.0f;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jM834getAccessibleBorderColor8_81llA = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j3);
                    }
                } else {
                    bj4VarO.u();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    ox6Var3 = ox6Var2;
                }
                bj4VarO.V();
                bj4VarO.K(-1036119505);
                boolean z3 = (((i3 & 7168) ^ 3072) <= 2048 && bj4VarO.i(jM834getAccessibleBorderColor8_81llA)) || (i3 & 3072) == 2048;
                if ((i3 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z3 | z | ((i3 & 112) == 32);
                objF = bj4VarO.f();
                if (z2 || objF == jt1.a.a) {
                    final long j6 = j3;
                    final float f4 = f2;
                    final long j7 = jM834getAccessibleBorderColor8_81llA;
                    objF = new oh4() { // from class: hz9
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j7, f4, j6, (d73) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                us3.b(ox6Var3, (oh4) objF, bj4VarO, i3 & 14);
            } else {
                bj4VarO.u();
                ox6Var3 = ox6Var2;
            }
            j4 = j3;
            f3 = f2;
            j5 = jM834getAccessibleBorderColor8_81llA;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: iz9
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return StarRatingKt.StarRating_tAjK0ZQ$lambda$3(ox6Var3, j4, f3, j5, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        f2 = f;
        if ((i & 3072) == 0) {
            jM834getAccessibleBorderColor8_81llA = j2;
            if ((i2 & 8) == 0) {
                i4 = 1024;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        } else {
            jM834getAccessibleBorderColor8_81llA = j2;
        }
        if ((i3 & 1171) == 1170) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i6 != 0) {
                    j3 = uh1.e;
                }
                if (i7 != 0) {
                    f2 = 1.0f;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jM834getAccessibleBorderColor8_81llA = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j3);
                }
            } else {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i6 != 0) {
                    j3 = uh1.e;
                }
                if (i7 != 0) {
                    f2 = 1.0f;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jM834getAccessibleBorderColor8_81llA = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j3);
                }
            }
            bj4VarO.V();
            bj4VarO.K(-1036119505);
            if (((i3 & 7168) ^ 3072) <= 2048) {
            }
            if ((i3 & 896) == 256) {
                z = true;
            } else {
                z = false;
            }
            z2 = z3 | z | ((i3 & 112) == 32);
            objF = bj4VarO.f();
            if (z2) {
                final long j8 = j3;
                final float f5 = f2;
                final long j9 = jM834getAccessibleBorderColor8_81llA;
                objF = new oh4() { // from class: hz9
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j9, f5, j8, (d73) obj);
                    }
                };
                bj4VarO.C(objF);
            } else {
                final long j10 = j3;
                final float f6 = f2;
                final long j11 = jM834getAccessibleBorderColor8_81llA;
                objF = new oh4() { // from class: hz9
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j11, f6, j10, (d73) obj);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            us3.b(ox6Var3, (oh4) objF, bj4VarO, i3 & 14);
        } else {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i6 != 0) {
                    j3 = uh1.e;
                }
                if (i7 != 0) {
                    f2 = 1.0f;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jM834getAccessibleBorderColor8_81llA = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j3);
                }
            } else {
                if (i5 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i6 != 0) {
                    j3 = uh1.e;
                }
                if (i7 != 0) {
                    f2 = 1.0f;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jM834getAccessibleBorderColor8_81llA = ColorExtensionsKt.m834getAccessibleBorderColor8_81llA(j3);
                }
            }
            bj4VarO.V();
            bj4VarO.K(-1036119505);
            if (((i3 & 7168) ^ 3072) <= 2048) {
            }
            if ((i3 & 896) == 256) {
                z = true;
            } else {
                z = false;
            }
            z2 = z3 | z | ((i3 & 112) == 32);
            objF = bj4VarO.f();
            if (z2) {
                final long j12 = j3;
                final float f7 = f2;
                final long j13 = jM834getAccessibleBorderColor8_81llA;
                objF = new oh4() { // from class: hz9
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j13, f7, j12, (d73) obj);
                    }
                };
                bj4VarO.C(objF);
            } else {
                final long j14 = j3;
                final float f8 = f2;
                final long j15 = jM834getAccessibleBorderColor8_81llA;
                objF = new oh4() { // from class: hz9
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j15, f8, j14, (d73) obj);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            us3.b(ox6Var3, (oh4) objF, bj4VarO, i3 & 14);
        }
        j4 = j3;
        f3 = f2;
        j5 = jM834getAccessibleBorderColor8_81llA;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: iz9
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return StarRatingKt.StarRating_tAjK0ZQ$lambda$3(ox6Var3, j4, f3, j5, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b StarRating_tAjK0ZQ$lambda$2$lambda$1(long j, float f, long j2, d73 d73Var) {
        d73Var.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (d73Var.c() >> 32)) / 33.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (d73Var.c() & 4294967295L)) / 32.0f;
        cu7 starPath = getStarPath();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        s41.b bVarY0 = d73Var.Y0();
        long jD = bVarY0.d();
        bVarY0.a().f();
        try {
            bVarY0.a.e(fIntBitsToFloat, fIntBitsToFloat2, jFloatToRawIntBits);
            d73.o0(d73Var, starPath, j, new b3a(d73Var.U0(f), 0.0f, 0, 0, 30), null, 52);
            d73.o0(d73Var, starPath, j2, zy3.a, new wq0(5, j2), 36);
            return g2b.a;
        } finally {
            x3.b(bVarY0, jD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b StarRating_tAjK0ZQ$lambda$3(ox6 ox6Var, long j, float f, long j2, int i, int i2, jt1 jt1Var, int i3) {
        m495StarRatingtAjK0ZQ(ox6Var, j, f, j2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void UnSelectedStar(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(843558828);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            m495StarRatingtAjK0ZQ(ir9.d(ir9.n(ox6.a.t, 44.0f), 44.0f), 0L, 0.0f, 0L, bj4VarO, 6, 14);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new zf0(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UnSelectedStar$lambda$5(int i, jt1 jt1Var, int i2) {
        UnSelectedStar(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final cu7 getStarPath() {
        vp vpVarA = xp.a();
        vpVarA.i(31.9f, 11.25f);
        vpVarA.j(32.95f, 11.39f, 33.38f, 12.71f, 32.6f, 13.46f);
        vpVarA.n(25.33f, 20.47f);
        vpVarA.n(27.16f, 30.48f);
        vpVarA.j(27.35f, 31.54f, 26.25f, 32.36f, 25.31f, 31.84f);
        vpVarA.n(16.5f, 26.98f);
        vpVarA.n(7.69f, 31.84f);
        vpVarA.j(6.75f, 32.36f, 5.65f, 31.54f, 5.84f, 30.48f);
        vpVarA.n(7.67f, 20.47f);
        vpVarA.n(0.4f, 13.46f);
        vpVarA.j(-0.38f, 12.71f, 0.05f, 11.39f, 1.1f, 11.25f);
        vpVarA.n(11.04f, 9.92f);
        vpVarA.n(15.36f, 0.73f);
        vpVarA.j(15.82f, -0.24f, 17.18f, -0.24f, 17.64f, 0.73f);
        vpVarA.n(21.96f, 9.92f);
        vpVarA.n(31.9f, 11.25f);
        return vpVarA;
    }
}
