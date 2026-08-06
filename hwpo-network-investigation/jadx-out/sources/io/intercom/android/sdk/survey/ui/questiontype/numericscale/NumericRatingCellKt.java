package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import defpackage.al8;
import defpackage.b72;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.it6;
import defpackage.jt1;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nb1;
import defpackage.ns0;
import defpackage.ob4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.uh1;
import defpackage.uma;
import defpackage.vs0;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.zd7;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingCellKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class NumericRatingCellKt {
    private static final void DarkFilledCell(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(477358395);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            m494NumericRatingCelljWvj134("1", null, 0L, 0.0f, uh1.b, null, 0L, 0L, bj4VarO, 24582, 238);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new zd7(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DarkFilledCell$lambda$4(int i, jt1 jt1Var, int i2) {
        DarkFilledCell(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final void EmptyCell(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1361614452);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            m494NumericRatingCelljWvj134("1", null, 0L, 0.0f, 0L, null, 0L, 0L, bj4VarO, 6, 254);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new it6(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EmptyCell$lambda$2(int i, jt1 jt1Var, int i2) {
        EmptyCell(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final void FilledCell(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1860651045);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            m494NumericRatingCelljWvj134("1", null, 0L, 0.0f, uh1.i, null, 0L, 0L, bj4VarO, 24582, 238);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new nb1(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FilledCell$lambda$3(int i, jt1 jt1Var, int i2) {
        FilledCell(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0149  */
    /* JADX WARN: Code duplicated, block: B:109:0x014c  */
    /* JADX WARN: Code duplicated, block: B:110:0x014f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0152  */
    /* JADX WARN: Code duplicated, block: B:113:0x0155  */
    /* JADX WARN: Code duplicated, block: B:115:0x0158  */
    /* JADX WARN: Code duplicated, block: B:116:0x015b  */
    /* JADX WARN: Code duplicated, block: B:118:0x015e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0161  */
    /* JADX WARN: Code duplicated, block: B:122:0x0167  */
    /* JADX WARN: Code duplicated, block: B:123:0x016e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0174  */
    /* JADX WARN: Code duplicated, block: B:127:0x018d  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:137:0x025c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0266  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:96:0x0127  */
    /* JADX INFO: renamed from: NumericRatingCell-jWvj134, reason: not valid java name */
    public static final void m494NumericRatingCelljWvj134(final String str, ox6 ox6Var, long j, float f, long j2, ob4 ob4Var, long j3, long j4, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        int i4;
        long j5;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        long j6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ox6.a aVar;
        long j7;
        float f3;
        long j8;
        ob4 ob4Var2;
        long jM833generateTextColor8_81llA;
        long j9;
        ob4 ob4Var3;
        long j10;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        final ox6 ox6Var3;
        final long j11;
        final long j12;
        final long j13;
        final long j14;
        final ob4 ob4Var4;
        final float f4;
        xj8 xj8VarW;
        int i14;
        str.getClass();
        bj4 bj4VarO = jt1Var.o(-881315304);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    j5 = j;
                    if (bj4VarO.i(j5)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        f2 = f;
                        if (bj4VarO.g(f2)) {
                            i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            j6 = j2;
                            if (bj4VarO.i(j6)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 32;
                        if (i10 != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            if (bj4VarO.J(ob4Var)) {
                                i11 = 131072;
                            } else {
                                i11 = 65536;
                            }
                            i3 |= i11;
                        }
                        if ((i & 1572864) == 0) {
                            int i16 = i3;
                            if ((i2 & 64) == 0 || !bj4VarO.i(j3)) {
                                i14 = 524288;
                            } else {
                                i14 = 1048576;
                            }
                            i12 = i16 | i14;
                        } else {
                            i12 = i3;
                        }
                        if ((i & 12582912) != 0) {
                            i12 |= ((i2 & 128) == 0 || !bj4VarO.i(j4)) ? 4194304 : 8388608;
                        }
                        if ((i12 & 4793491) == 4793490 || !bj4VarO.r()) {
                            bj4VarO.v0();
                            i13 = i & 1;
                            aVar = ox6.a.t;
                            if (i13 != 0 || bj4VarO.c0()) {
                                if (i15 != 0) {
                                    ox6Var2 = aVar;
                                }
                                if (i4 != 0) {
                                    j7 = uh1.b;
                                } else {
                                    j7 = j5;
                                }
                                if (i6 != 0) {
                                    f3 = 1.0f;
                                } else {
                                    f3 = f2;
                                }
                                if (i8 != 0) {
                                    j8 = uh1.e;
                                } else {
                                    j8 = j6;
                                }
                                if (i10 != 0) {
                                    ob4Var2 = ob4.y;
                                } else {
                                    ob4Var2 = ob4Var;
                                }
                                if ((i2 & 64) != 0) {
                                    jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                    i12 &= -3670017;
                                } else {
                                    jM833generateTextColor8_81llA = j3;
                                }
                                if ((i2 & 128) != 0) {
                                    i12 &= -29360129;
                                    ob4Var3 = ob4Var2;
                                    j10 = jM833generateTextColor8_81llA;
                                    j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                                } else {
                                    j9 = j4;
                                    ob4Var3 = ob4Var2;
                                    j10 = jM833generateTextColor8_81llA;
                                }
                            } else {
                                bj4VarO.u();
                                if ((i2 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                ob4Var3 = ob4Var;
                                j10 = j3;
                                j9 = j4;
                                j7 = j5;
                                f3 = f2;
                                j8 = j6;
                            }
                            bj4VarO.V();
                            b72 b72Var = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                            vs0 vs0VarB = ws0.b(f3, j7);
                            ox6 ox6VarD = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB.a, vs0VarB.b, b72Var), b72Var), j8, al8.a), 44.0f), 44.0f);
                            fl6VarD = dv0.d(di.a.a, false);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6VarD);
                            bt1.c.getClass();
                            aVar2 = bt1.a.b;
                            if (bj4VarO.a == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar2);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                            bj4VarO.U(true);
                            ox6Var3 = ox6Var2;
                            j11 = j7;
                            j12 = j8;
                            j13 = j10;
                            j14 = j9;
                            ob4Var4 = ob4Var3;
                            f4 = f3;
                        } else {
                            bj4VarO.u();
                            ob4Var4 = ob4Var;
                            ox6Var3 = ox6Var2;
                            j11 = j5;
                            f4 = f2;
                            j12 = j6;
                            j13 = j3;
                            j14 = j4;
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: ae7
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(str, ox6Var3, j11, f4, j12, ob4Var4, j13, j14, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 24576;
                    j6 = j2;
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (bj4VarO.J(ob4Var)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((i & 1572864) == 0) {
                        int i17 = i3;
                        if ((i2 & 64) == 0) {
                            i14 = 524288;
                        } else {
                            i14 = 524288;
                        }
                        i12 = i17 | i14;
                    } else {
                        i12 = i3;
                    }
                    if ((i & 12582912) != 0) {
                        i12 |= ((i2 & 128) == 0 || !bj4VarO.i(j4)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 4793491) == 4793490) {
                        bj4VarO.v0();
                        i13 = i & 1;
                        aVar = ox6.a.t;
                        if (i13 != 0) {
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                j7 = uh1.b;
                            } else {
                                j7 = j5;
                            }
                            if (i6 != 0) {
                                f3 = 1.0f;
                            } else {
                                f3 = f2;
                            }
                            if (i8 != 0) {
                                j8 = uh1.e;
                            } else {
                                j8 = j6;
                            }
                            if (i10 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if ((i2 & 64) != 0) {
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                i12 &= -3670017;
                            } else {
                                jM833generateTextColor8_81llA = j3;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                                j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                            } else {
                                j9 = j4;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                            }
                        } else {
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                j7 = uh1.b;
                            } else {
                                j7 = j5;
                            }
                            if (i6 != 0) {
                                f3 = 1.0f;
                            } else {
                                f3 = f2;
                            }
                            if (i8 != 0) {
                                j8 = uh1.e;
                            } else {
                                j8 = j6;
                            }
                            if (i10 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if ((i2 & 64) != 0) {
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                i12 &= -3670017;
                            } else {
                                jM833generateTextColor8_81llA = j3;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                                j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                            } else {
                                j9 = j4;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                            }
                        }
                        bj4VarO.V();
                        b72 b72Var2 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                        vs0 vs0VarB2 = ws0.b(f3, j7);
                        ox6 ox6VarD2 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB2.a, vs0VarB2.b, b72Var2), b72Var2), j8, al8.a), 44.0f), 44.0f);
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarD2);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                        bj4VarO.U(true);
                        ox6Var3 = ox6Var2;
                        j11 = j7;
                        j12 = j8;
                        j13 = j10;
                        j14 = j9;
                        ob4Var4 = ob4Var3;
                        f4 = f3;
                    } else {
                        bj4VarO.v0();
                        i13 = i & 1;
                        aVar = ox6.a.t;
                        if (i13 != 0) {
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                j7 = uh1.b;
                            } else {
                                j7 = j5;
                            }
                            if (i6 != 0) {
                                f3 = 1.0f;
                            } else {
                                f3 = f2;
                            }
                            if (i8 != 0) {
                                j8 = uh1.e;
                            } else {
                                j8 = j6;
                            }
                            if (i10 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if ((i2 & 64) != 0) {
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                i12 &= -3670017;
                            } else {
                                jM833generateTextColor8_81llA = j3;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                                j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                            } else {
                                j9 = j4;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                            }
                        } else {
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                j7 = uh1.b;
                            } else {
                                j7 = j5;
                            }
                            if (i6 != 0) {
                                f3 = 1.0f;
                            } else {
                                f3 = f2;
                            }
                            if (i8 != 0) {
                                j8 = uh1.e;
                            } else {
                                j8 = j6;
                            }
                            if (i10 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if ((i2 & 64) != 0) {
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                i12 &= -3670017;
                            } else {
                                jM833generateTextColor8_81llA = j3;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                                j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                            } else {
                                j9 = j4;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                            }
                        }
                        bj4VarO.V();
                        b72 b72Var3 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                        vs0 vs0VarB3 = ws0.b(f3, j7);
                        ox6 ox6VarD3 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB3.a, vs0VarB3.b, b72Var3), b72Var3), j8, al8.a), 44.0f), 44.0f);
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarD3);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                        bj4VarO.U(true);
                        ox6Var3 = ox6Var2;
                        j11 = j7;
                        j12 = j8;
                        j13 = j10;
                        j14 = j9;
                        ob4Var4 = ob4Var3;
                        f4 = f3;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ae7
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(str, ox6Var3, j11, f4, j12, ob4Var4, j13, j14, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 3072;
                f2 = f;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        j6 = j2;
                        if (bj4VarO.i(j6)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (bj4VarO.J(ob4Var)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((i & 1572864) == 0) {
                        int i18 = i3;
                        if ((i2 & 64) == 0) {
                            i14 = 524288;
                        } else {
                            i14 = 524288;
                        }
                        i12 = i18 | i14;
                    } else {
                        i12 = i3;
                    }
                    if ((i & 12582912) != 0) {
                        i12 |= ((i2 & 128) == 0 || !bj4VarO.i(j4)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 4793491) == 4793490) {
                        bj4VarO.v0();
                        i13 = i & 1;
                        aVar = ox6.a.t;
                        if (i13 != 0) {
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                j7 = uh1.b;
                            } else {
                                j7 = j5;
                            }
                            if (i6 != 0) {
                                f3 = 1.0f;
                            } else {
                                f3 = f2;
                            }
                            if (i8 != 0) {
                                j8 = uh1.e;
                            } else {
                                j8 = j6;
                            }
                            if (i10 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if ((i2 & 64) != 0) {
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                i12 &= -3670017;
                            } else {
                                jM833generateTextColor8_81llA = j3;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                                j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                            } else {
                                j9 = j4;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                            }
                        } else {
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                j7 = uh1.b;
                            } else {
                                j7 = j5;
                            }
                            if (i6 != 0) {
                                f3 = 1.0f;
                            } else {
                                f3 = f2;
                            }
                            if (i8 != 0) {
                                j8 = uh1.e;
                            } else {
                                j8 = j6;
                            }
                            if (i10 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if ((i2 & 64) != 0) {
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                i12 &= -3670017;
                            } else {
                                jM833generateTextColor8_81llA = j3;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                                j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                            } else {
                                j9 = j4;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                            }
                        }
                        bj4VarO.V();
                        b72 b72Var4 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                        vs0 vs0VarB4 = ws0.b(f3, j7);
                        ox6 ox6VarD4 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB4.a, vs0VarB4.b, b72Var4), b72Var4), j8, al8.a), 44.0f), 44.0f);
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarD4);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                        bj4VarO.U(true);
                        ox6Var3 = ox6Var2;
                        j11 = j7;
                        j12 = j8;
                        j13 = j10;
                        j14 = j9;
                        ob4Var4 = ob4Var3;
                        f4 = f3;
                    } else {
                        bj4VarO.v0();
                        i13 = i & 1;
                        aVar = ox6.a.t;
                        if (i13 != 0) {
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                j7 = uh1.b;
                            } else {
                                j7 = j5;
                            }
                            if (i6 != 0) {
                                f3 = 1.0f;
                            } else {
                                f3 = f2;
                            }
                            if (i8 != 0) {
                                j8 = uh1.e;
                            } else {
                                j8 = j6;
                            }
                            if (i10 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if ((i2 & 64) != 0) {
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                i12 &= -3670017;
                            } else {
                                jM833generateTextColor8_81llA = j3;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                                j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                            } else {
                                j9 = j4;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                            }
                        } else {
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                j7 = uh1.b;
                            } else {
                                j7 = j5;
                            }
                            if (i6 != 0) {
                                f3 = 1.0f;
                            } else {
                                f3 = f2;
                            }
                            if (i8 != 0) {
                                j8 = uh1.e;
                            } else {
                                j8 = j6;
                            }
                            if (i10 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if ((i2 & 64) != 0) {
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                i12 &= -3670017;
                            } else {
                                jM833generateTextColor8_81llA = j3;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                                j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                            } else {
                                j9 = j4;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                            }
                        }
                        bj4VarO.V();
                        b72 b72Var5 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                        vs0 vs0VarB5 = ws0.b(f3, j7);
                        ox6 ox6VarD5 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB5.a, vs0VarB5.b, b72Var5), b72Var5), j8, al8.a), 44.0f), 44.0f);
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarD5);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                        bj4VarO.U(true);
                        ox6Var3 = ox6Var2;
                        j11 = j7;
                        j12 = j8;
                        j13 = j10;
                        j14 = j9;
                        ob4Var4 = ob4Var3;
                        f4 = f3;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ae7
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(str, ox6Var3, j11, f4, j12, ob4Var4, j13, j14, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                j6 = j2;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.J(ob4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i & 1572864) == 0) {
                    int i19 = i3;
                    if ((i2 & 64) == 0) {
                        i14 = 524288;
                    } else {
                        i14 = 524288;
                    }
                    i12 = i19 | i14;
                } else {
                    i12 = i3;
                }
                if ((i & 12582912) != 0) {
                    i12 |= ((i2 & 128) == 0 || !bj4VarO.i(j4)) ? 4194304 : 8388608;
                }
                if ((i12 & 4793491) == 4793490) {
                    bj4VarO.v0();
                    i13 = i & 1;
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    } else {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    }
                    bj4VarO.V();
                    b72 b72Var6 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    vs0 vs0VarB6 = ws0.b(f3, j7);
                    ox6 ox6VarD6 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB6.a, vs0VarB6.b, b72Var6), b72Var6), j8, al8.a), 44.0f), 44.0f);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarD6);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                    bj4VarO.U(true);
                    ox6Var3 = ox6Var2;
                    j11 = j7;
                    j12 = j8;
                    j13 = j10;
                    j14 = j9;
                    ob4Var4 = ob4Var3;
                    f4 = f3;
                } else {
                    bj4VarO.v0();
                    i13 = i & 1;
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    } else {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    }
                    bj4VarO.V();
                    b72 b72Var7 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    vs0 vs0VarB7 = ws0.b(f3, j7);
                    ox6 ox6VarD7 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB7.a, vs0VarB7.b, b72Var7), b72Var7), j8, al8.a), 44.0f), 44.0f);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarD7);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                    bj4VarO.U(true);
                    ox6Var3 = ox6Var2;
                    j11 = j7;
                    j12 = j8;
                    j13 = j10;
                    j14 = j9;
                    ob4Var4 = ob4Var3;
                    f4 = f3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ae7
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(str, ox6Var3, j11, f4, j12, ob4Var4, j13, j14, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            j5 = j;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    f2 = f;
                    if (bj4VarO.g(f2)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        j6 = j2;
                        if (bj4VarO.i(j6)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (bj4VarO.J(ob4Var)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((i & 1572864) == 0) {
                        int i110 = i3;
                        if ((i2 & 64) == 0) {
                            i14 = 524288;
                        } else {
                            i14 = 524288;
                        }
                        i12 = i110 | i14;
                    } else {
                        i12 = i3;
                    }
                    if ((i & 12582912) != 0) {
                        i12 |= ((i2 & 128) == 0 || !bj4VarO.i(j4)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 4793491) == 4793490) {
                        bj4VarO.v0();
                        i13 = i & 1;
                        aVar = ox6.a.t;
                        if (i13 != 0) {
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                j7 = uh1.b;
                            } else {
                                j7 = j5;
                            }
                            if (i6 != 0) {
                                f3 = 1.0f;
                            } else {
                                f3 = f2;
                            }
                            if (i8 != 0) {
                                j8 = uh1.e;
                            } else {
                                j8 = j6;
                            }
                            if (i10 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if ((i2 & 64) != 0) {
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                i12 &= -3670017;
                            } else {
                                jM833generateTextColor8_81llA = j3;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                                j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                            } else {
                                j9 = j4;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                            }
                        } else {
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                j7 = uh1.b;
                            } else {
                                j7 = j5;
                            }
                            if (i6 != 0) {
                                f3 = 1.0f;
                            } else {
                                f3 = f2;
                            }
                            if (i8 != 0) {
                                j8 = uh1.e;
                            } else {
                                j8 = j6;
                            }
                            if (i10 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if ((i2 & 64) != 0) {
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                i12 &= -3670017;
                            } else {
                                jM833generateTextColor8_81llA = j3;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                                j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                            } else {
                                j9 = j4;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                            }
                        }
                        bj4VarO.V();
                        b72 b72Var8 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                        vs0 vs0VarB8 = ws0.b(f3, j7);
                        ox6 ox6VarD8 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB8.a, vs0VarB8.b, b72Var8), b72Var8), j8, al8.a), 44.0f), 44.0f);
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarD8);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                        bj4VarO.U(true);
                        ox6Var3 = ox6Var2;
                        j11 = j7;
                        j12 = j8;
                        j13 = j10;
                        j14 = j9;
                        ob4Var4 = ob4Var3;
                        f4 = f3;
                    } else {
                        bj4VarO.v0();
                        i13 = i & 1;
                        aVar = ox6.a.t;
                        if (i13 != 0) {
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                j7 = uh1.b;
                            } else {
                                j7 = j5;
                            }
                            if (i6 != 0) {
                                f3 = 1.0f;
                            } else {
                                f3 = f2;
                            }
                            if (i8 != 0) {
                                j8 = uh1.e;
                            } else {
                                j8 = j6;
                            }
                            if (i10 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if ((i2 & 64) != 0) {
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                i12 &= -3670017;
                            } else {
                                jM833generateTextColor8_81llA = j3;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                                j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                            } else {
                                j9 = j4;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                            }
                        } else {
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                j7 = uh1.b;
                            } else {
                                j7 = j5;
                            }
                            if (i6 != 0) {
                                f3 = 1.0f;
                            } else {
                                f3 = f2;
                            }
                            if (i8 != 0) {
                                j8 = uh1.e;
                            } else {
                                j8 = j6;
                            }
                            if (i10 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if ((i2 & 64) != 0) {
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                i12 &= -3670017;
                            } else {
                                jM833generateTextColor8_81llA = j3;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                                j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                            } else {
                                j9 = j4;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                            }
                        }
                        bj4VarO.V();
                        b72 b72Var9 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                        vs0 vs0VarB9 = ws0.b(f3, j7);
                        ox6 ox6VarD9 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB9.a, vs0VarB9.b, b72Var9), b72Var9), j8, al8.a), 44.0f), 44.0f);
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarD9);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                        bj4VarO.U(true);
                        ox6Var3 = ox6Var2;
                        j11 = j7;
                        j12 = j8;
                        j13 = j10;
                        j14 = j9;
                        ob4Var4 = ob4Var3;
                        f4 = f3;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ae7
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(str, ox6Var3, j11, f4, j12, ob4Var4, j13, j14, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                j6 = j2;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.J(ob4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i & 1572864) == 0) {
                    int i111 = i3;
                    if ((i2 & 64) == 0) {
                        i14 = 524288;
                    } else {
                        i14 = 524288;
                    }
                    i12 = i111 | i14;
                } else {
                    i12 = i3;
                }
                if ((i & 12582912) != 0) {
                    i12 |= ((i2 & 128) == 0 || !bj4VarO.i(j4)) ? 4194304 : 8388608;
                }
                if ((i12 & 4793491) == 4793490) {
                    bj4VarO.v0();
                    i13 = i & 1;
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    } else {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    }
                    bj4VarO.V();
                    b72 b72Var10 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    vs0 vs0VarB10 = ws0.b(f3, j7);
                    ox6 ox6VarD10 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB10.a, vs0VarB10.b, b72Var10), b72Var10), j8, al8.a), 44.0f), 44.0f);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarD10);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                    bj4VarO.U(true);
                    ox6Var3 = ox6Var2;
                    j11 = j7;
                    j12 = j8;
                    j13 = j10;
                    j14 = j9;
                    ob4Var4 = ob4Var3;
                    f4 = f3;
                } else {
                    bj4VarO.v0();
                    i13 = i & 1;
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    } else {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    }
                    bj4VarO.V();
                    b72 b72Var11 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    vs0 vs0VarB11 = ws0.b(f3, j7);
                    ox6 ox6VarD11 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB11.a, vs0VarB11.b, b72Var11), b72Var11), j8, al8.a), 44.0f), 44.0f);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarD11);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                    bj4VarO.U(true);
                    ox6Var3 = ox6Var2;
                    j11 = j7;
                    j12 = j8;
                    j13 = j10;
                    j14 = j9;
                    ob4Var4 = ob4Var3;
                    f4 = f3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ae7
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(str, ox6Var3, j11, f4, j12, ob4Var4, j13, j14, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            f2 = f;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    j6 = j2;
                    if (bj4VarO.i(j6)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.J(ob4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i & 1572864) == 0) {
                    int i112 = i3;
                    if ((i2 & 64) == 0) {
                        i14 = 524288;
                    } else {
                        i14 = 524288;
                    }
                    i12 = i112 | i14;
                } else {
                    i12 = i3;
                }
                if ((i & 12582912) != 0) {
                    i12 |= ((i2 & 128) == 0 || !bj4VarO.i(j4)) ? 4194304 : 8388608;
                }
                if ((i12 & 4793491) == 4793490) {
                    bj4VarO.v0();
                    i13 = i & 1;
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    } else {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    }
                    bj4VarO.V();
                    b72 b72Var12 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    vs0 vs0VarB12 = ws0.b(f3, j7);
                    ox6 ox6VarD12 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB12.a, vs0VarB12.b, b72Var12), b72Var12), j8, al8.a), 44.0f), 44.0f);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarD12);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                    bj4VarO.U(true);
                    ox6Var3 = ox6Var2;
                    j11 = j7;
                    j12 = j8;
                    j13 = j10;
                    j14 = j9;
                    ob4Var4 = ob4Var3;
                    f4 = f3;
                } else {
                    bj4VarO.v0();
                    i13 = i & 1;
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    } else {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    }
                    bj4VarO.V();
                    b72 b72Var13 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    vs0 vs0VarB13 = ws0.b(f3, j7);
                    ox6 ox6VarD13 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB13.a, vs0VarB13.b, b72Var13), b72Var13), j8, al8.a), 44.0f), 44.0f);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarD13);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                    bj4VarO.U(true);
                    ox6Var3 = ox6Var2;
                    j11 = j7;
                    j12 = j8;
                    j13 = j10;
                    j14 = j9;
                    ob4Var4 = ob4Var3;
                    f4 = f3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ae7
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(str, ox6Var3, j11, f4, j12, ob4Var4, j13, j14, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            j6 = j2;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bj4VarO.J(ob4Var)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((i & 1572864) == 0) {
                int i113 = i3;
                if ((i2 & 64) == 0) {
                    i14 = 524288;
                } else {
                    i14 = 524288;
                }
                i12 = i113 | i14;
            } else {
                i12 = i3;
            }
            if ((i & 12582912) != 0) {
                i12 |= ((i2 & 128) == 0 || !bj4VarO.i(j4)) ? 4194304 : 8388608;
            }
            if ((i12 & 4793491) == 4793490) {
                bj4VarO.v0();
                i13 = i & 1;
                aVar = ox6.a.t;
                if (i13 != 0) {
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        j7 = uh1.b;
                    } else {
                        j7 = j5;
                    }
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i8 != 0) {
                        j8 = uh1.e;
                    } else {
                        j8 = j6;
                    }
                    if (i10 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if ((i2 & 64) != 0) {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                        i12 &= -3670017;
                    } else {
                        jM833generateTextColor8_81llA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                        j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                    } else {
                        j9 = j4;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                    }
                } else {
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        j7 = uh1.b;
                    } else {
                        j7 = j5;
                    }
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i8 != 0) {
                        j8 = uh1.e;
                    } else {
                        j8 = j6;
                    }
                    if (i10 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if ((i2 & 64) != 0) {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                        i12 &= -3670017;
                    } else {
                        jM833generateTextColor8_81llA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                        j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                    } else {
                        j9 = j4;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                    }
                }
                bj4VarO.V();
                b72 b72Var14 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                vs0 vs0VarB14 = ws0.b(f3, j7);
                ox6 ox6VarD14 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB14.a, vs0VarB14.b, b72Var14), b72Var14), j8, al8.a), 44.0f), 44.0f);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarD14);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                bj4VarO.U(true);
                ox6Var3 = ox6Var2;
                j11 = j7;
                j12 = j8;
                j13 = j10;
                j14 = j9;
                ob4Var4 = ob4Var3;
                f4 = f3;
            } else {
                bj4VarO.v0();
                i13 = i & 1;
                aVar = ox6.a.t;
                if (i13 != 0) {
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        j7 = uh1.b;
                    } else {
                        j7 = j5;
                    }
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i8 != 0) {
                        j8 = uh1.e;
                    } else {
                        j8 = j6;
                    }
                    if (i10 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if ((i2 & 64) != 0) {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                        i12 &= -3670017;
                    } else {
                        jM833generateTextColor8_81llA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                        j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                    } else {
                        j9 = j4;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                    }
                } else {
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        j7 = uh1.b;
                    } else {
                        j7 = j5;
                    }
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i8 != 0) {
                        j8 = uh1.e;
                    } else {
                        j8 = j6;
                    }
                    if (i10 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if ((i2 & 64) != 0) {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                        i12 &= -3670017;
                    } else {
                        jM833generateTextColor8_81llA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                        j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                    } else {
                        j9 = j4;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                    }
                }
                bj4VarO.V();
                b72 b72Var15 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                vs0 vs0VarB15 = ws0.b(f3, j7);
                ox6 ox6VarD15 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB15.a, vs0VarB15.b, b72Var15), b72Var15), j8, al8.a), 44.0f), 44.0f);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarD15);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                bj4VarO.U(true);
                ox6Var3 = ox6Var2;
                j11 = j7;
                j12 = j8;
                j13 = j10;
                j14 = j9;
                ob4Var4 = ob4Var3;
                f4 = f3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ae7
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(str, ox6Var3, j11, f4, j12, ob4Var4, j13, j14, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                j5 = j;
                if (bj4VarO.i(j5)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    f2 = f;
                    if (bj4VarO.g(f2)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        j6 = j2;
                        if (bj4VarO.i(j6)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (bj4VarO.J(ob4Var)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    if ((i & 1572864) == 0) {
                        int i114 = i3;
                        if ((i2 & 64) == 0) {
                            i14 = 524288;
                        } else {
                            i14 = 524288;
                        }
                        i12 = i114 | i14;
                    } else {
                        i12 = i3;
                    }
                    if ((i & 12582912) != 0) {
                        i12 |= ((i2 & 128) == 0 || !bj4VarO.i(j4)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 4793491) == 4793490) {
                        bj4VarO.v0();
                        i13 = i & 1;
                        aVar = ox6.a.t;
                        if (i13 != 0) {
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                j7 = uh1.b;
                            } else {
                                j7 = j5;
                            }
                            if (i6 != 0) {
                                f3 = 1.0f;
                            } else {
                                f3 = f2;
                            }
                            if (i8 != 0) {
                                j8 = uh1.e;
                            } else {
                                j8 = j6;
                            }
                            if (i10 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if ((i2 & 64) != 0) {
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                i12 &= -3670017;
                            } else {
                                jM833generateTextColor8_81llA = j3;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                                j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                            } else {
                                j9 = j4;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                            }
                        } else {
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                j7 = uh1.b;
                            } else {
                                j7 = j5;
                            }
                            if (i6 != 0) {
                                f3 = 1.0f;
                            } else {
                                f3 = f2;
                            }
                            if (i8 != 0) {
                                j8 = uh1.e;
                            } else {
                                j8 = j6;
                            }
                            if (i10 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if ((i2 & 64) != 0) {
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                i12 &= -3670017;
                            } else {
                                jM833generateTextColor8_81llA = j3;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                                j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                            } else {
                                j9 = j4;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                            }
                        }
                        bj4VarO.V();
                        b72 b72Var16 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                        vs0 vs0VarB16 = ws0.b(f3, j7);
                        ox6 ox6VarD16 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB16.a, vs0VarB16.b, b72Var16), b72Var16), j8, al8.a), 44.0f), 44.0f);
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarD16);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                        bj4VarO.U(true);
                        ox6Var3 = ox6Var2;
                        j11 = j7;
                        j12 = j8;
                        j13 = j10;
                        j14 = j9;
                        ob4Var4 = ob4Var3;
                        f4 = f3;
                    } else {
                        bj4VarO.v0();
                        i13 = i & 1;
                        aVar = ox6.a.t;
                        if (i13 != 0) {
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                j7 = uh1.b;
                            } else {
                                j7 = j5;
                            }
                            if (i6 != 0) {
                                f3 = 1.0f;
                            } else {
                                f3 = f2;
                            }
                            if (i8 != 0) {
                                j8 = uh1.e;
                            } else {
                                j8 = j6;
                            }
                            if (i10 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if ((i2 & 64) != 0) {
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                i12 &= -3670017;
                            } else {
                                jM833generateTextColor8_81llA = j3;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                                j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                            } else {
                                j9 = j4;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                            }
                        } else {
                            if (i15 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                j7 = uh1.b;
                            } else {
                                j7 = j5;
                            }
                            if (i6 != 0) {
                                f3 = 1.0f;
                            } else {
                                f3 = f2;
                            }
                            if (i8 != 0) {
                                j8 = uh1.e;
                            } else {
                                j8 = j6;
                            }
                            if (i10 != 0) {
                                ob4Var2 = ob4.y;
                            } else {
                                ob4Var2 = ob4Var;
                            }
                            if ((i2 & 64) != 0) {
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                                i12 &= -3670017;
                            } else {
                                jM833generateTextColor8_81llA = j3;
                            }
                            if ((i2 & 128) != 0) {
                                i12 &= -29360129;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                                j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                            } else {
                                j9 = j4;
                                ob4Var3 = ob4Var2;
                                j10 = jM833generateTextColor8_81llA;
                            }
                        }
                        bj4VarO.V();
                        b72 b72Var17 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                        vs0 vs0VarB17 = ws0.b(f3, j7);
                        ox6 ox6VarD17 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB17.a, vs0VarB17.b, b72Var17), b72Var17), j8, al8.a), 44.0f), 44.0f);
                        fl6VarD = dv0.d(di.a.a, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarD17);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                        bj4VarO.U(true);
                        ox6Var3 = ox6Var2;
                        j11 = j7;
                        j12 = j8;
                        j13 = j10;
                        j14 = j9;
                        ob4Var4 = ob4Var3;
                        f4 = f3;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ae7
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(str, ox6Var3, j11, f4, j12, ob4Var4, j13, j14, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                j6 = j2;
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.J(ob4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i & 1572864) == 0) {
                    int i115 = i3;
                    if ((i2 & 64) == 0) {
                        i14 = 524288;
                    } else {
                        i14 = 524288;
                    }
                    i12 = i115 | i14;
                } else {
                    i12 = i3;
                }
                if ((i & 12582912) != 0) {
                    i12 |= ((i2 & 128) == 0 || !bj4VarO.i(j4)) ? 4194304 : 8388608;
                }
                if ((i12 & 4793491) == 4793490) {
                    bj4VarO.v0();
                    i13 = i & 1;
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    } else {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    }
                    bj4VarO.V();
                    b72 b72Var18 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    vs0 vs0VarB18 = ws0.b(f3, j7);
                    ox6 ox6VarD18 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB18.a, vs0VarB18.b, b72Var18), b72Var18), j8, al8.a), 44.0f), 44.0f);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarD18);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                    bj4VarO.U(true);
                    ox6Var3 = ox6Var2;
                    j11 = j7;
                    j12 = j8;
                    j13 = j10;
                    j14 = j9;
                    ob4Var4 = ob4Var3;
                    f4 = f3;
                } else {
                    bj4VarO.v0();
                    i13 = i & 1;
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    } else {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    }
                    bj4VarO.V();
                    b72 b72Var19 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    vs0 vs0VarB19 = ws0.b(f3, j7);
                    ox6 ox6VarD19 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB19.a, vs0VarB19.b, b72Var19), b72Var19), j8, al8.a), 44.0f), 44.0f);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarD19);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                    bj4VarO.U(true);
                    ox6Var3 = ox6Var2;
                    j11 = j7;
                    j12 = j8;
                    j13 = j10;
                    j14 = j9;
                    ob4Var4 = ob4Var3;
                    f4 = f3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ae7
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(str, ox6Var3, j11, f4, j12, ob4Var4, j13, j14, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            f2 = f;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    j6 = j2;
                    if (bj4VarO.i(j6)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.J(ob4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i & 1572864) == 0) {
                    int i116 = i3;
                    if ((i2 & 64) == 0) {
                        i14 = 524288;
                    } else {
                        i14 = 524288;
                    }
                    i12 = i116 | i14;
                } else {
                    i12 = i3;
                }
                if ((i & 12582912) != 0) {
                    i12 |= ((i2 & 128) == 0 || !bj4VarO.i(j4)) ? 4194304 : 8388608;
                }
                if ((i12 & 4793491) == 4793490) {
                    bj4VarO.v0();
                    i13 = i & 1;
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    } else {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    }
                    bj4VarO.V();
                    b72 b72Var110 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    vs0 vs0VarB110 = ws0.b(f3, j7);
                    ox6 ox6VarD110 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB110.a, vs0VarB110.b, b72Var110), b72Var110), j8, al8.a), 44.0f), 44.0f);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarD110);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                    bj4VarO.U(true);
                    ox6Var3 = ox6Var2;
                    j11 = j7;
                    j12 = j8;
                    j13 = j10;
                    j14 = j9;
                    ob4Var4 = ob4Var3;
                    f4 = f3;
                } else {
                    bj4VarO.v0();
                    i13 = i & 1;
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    } else {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    }
                    bj4VarO.V();
                    b72 b72Var111 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    vs0 vs0VarB111 = ws0.b(f3, j7);
                    ox6 ox6VarD111 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB111.a, vs0VarB111.b, b72Var111), b72Var111), j8, al8.a), 44.0f), 44.0f);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarD111);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                    bj4VarO.U(true);
                    ox6Var3 = ox6Var2;
                    j11 = j7;
                    j12 = j8;
                    j13 = j10;
                    j14 = j9;
                    ob4Var4 = ob4Var3;
                    f4 = f3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ae7
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(str, ox6Var3, j11, f4, j12, ob4Var4, j13, j14, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            j6 = j2;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bj4VarO.J(ob4Var)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((i & 1572864) == 0) {
                int i117 = i3;
                if ((i2 & 64) == 0) {
                    i14 = 524288;
                } else {
                    i14 = 524288;
                }
                i12 = i117 | i14;
            } else {
                i12 = i3;
            }
            if ((i & 12582912) != 0) {
                i12 |= ((i2 & 128) == 0 || !bj4VarO.i(j4)) ? 4194304 : 8388608;
            }
            if ((i12 & 4793491) == 4793490) {
                bj4VarO.v0();
                i13 = i & 1;
                aVar = ox6.a.t;
                if (i13 != 0) {
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        j7 = uh1.b;
                    } else {
                        j7 = j5;
                    }
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i8 != 0) {
                        j8 = uh1.e;
                    } else {
                        j8 = j6;
                    }
                    if (i10 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if ((i2 & 64) != 0) {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                        i12 &= -3670017;
                    } else {
                        jM833generateTextColor8_81llA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                        j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                    } else {
                        j9 = j4;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                    }
                } else {
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        j7 = uh1.b;
                    } else {
                        j7 = j5;
                    }
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i8 != 0) {
                        j8 = uh1.e;
                    } else {
                        j8 = j6;
                    }
                    if (i10 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if ((i2 & 64) != 0) {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                        i12 &= -3670017;
                    } else {
                        jM833generateTextColor8_81llA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                        j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                    } else {
                        j9 = j4;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                    }
                }
                bj4VarO.V();
                b72 b72Var112 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                vs0 vs0VarB112 = ws0.b(f3, j7);
                ox6 ox6VarD112 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB112.a, vs0VarB112.b, b72Var112), b72Var112), j8, al8.a), 44.0f), 44.0f);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarD112);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                bj4VarO.U(true);
                ox6Var3 = ox6Var2;
                j11 = j7;
                j12 = j8;
                j13 = j10;
                j14 = j9;
                ob4Var4 = ob4Var3;
                f4 = f3;
            } else {
                bj4VarO.v0();
                i13 = i & 1;
                aVar = ox6.a.t;
                if (i13 != 0) {
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        j7 = uh1.b;
                    } else {
                        j7 = j5;
                    }
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i8 != 0) {
                        j8 = uh1.e;
                    } else {
                        j8 = j6;
                    }
                    if (i10 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if ((i2 & 64) != 0) {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                        i12 &= -3670017;
                    } else {
                        jM833generateTextColor8_81llA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                        j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                    } else {
                        j9 = j4;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                    }
                } else {
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        j7 = uh1.b;
                    } else {
                        j7 = j5;
                    }
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i8 != 0) {
                        j8 = uh1.e;
                    } else {
                        j8 = j6;
                    }
                    if (i10 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if ((i2 & 64) != 0) {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                        i12 &= -3670017;
                    } else {
                        jM833generateTextColor8_81llA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                        j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                    } else {
                        j9 = j4;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                    }
                }
                bj4VarO.V();
                b72 b72Var113 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                vs0 vs0VarB113 = ws0.b(f3, j7);
                ox6 ox6VarD113 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB113.a, vs0VarB113.b, b72Var113), b72Var113), j8, al8.a), 44.0f), 44.0f);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarD113);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                bj4VarO.U(true);
                ox6Var3 = ox6Var2;
                j11 = j7;
                j12 = j8;
                j13 = j10;
                j14 = j9;
                ob4Var4 = ob4Var3;
                f4 = f3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ae7
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(str, ox6Var3, j11, f4, j12, ob4Var4, j13, j14, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        j5 = j;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                f2 = f;
                if (bj4VarO.g(f2)) {
                    i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    j6 = j2;
                    if (bj4VarO.i(j6)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.J(ob4Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                if ((i & 1572864) == 0) {
                    int i118 = i3;
                    if ((i2 & 64) == 0) {
                        i14 = 524288;
                    } else {
                        i14 = 524288;
                    }
                    i12 = i118 | i14;
                } else {
                    i12 = i3;
                }
                if ((i & 12582912) != 0) {
                    i12 |= ((i2 & 128) == 0 || !bj4VarO.i(j4)) ? 4194304 : 8388608;
                }
                if ((i12 & 4793491) == 4793490) {
                    bj4VarO.v0();
                    i13 = i & 1;
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    } else {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    }
                    bj4VarO.V();
                    b72 b72Var114 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    vs0 vs0VarB114 = ws0.b(f3, j7);
                    ox6 ox6VarD114 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB114.a, vs0VarB114.b, b72Var114), b72Var114), j8, al8.a), 44.0f), 44.0f);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarD114);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                    bj4VarO.U(true);
                    ox6Var3 = ox6Var2;
                    j11 = j7;
                    j12 = j8;
                    j13 = j10;
                    j14 = j9;
                    ob4Var4 = ob4Var3;
                    f4 = f3;
                } else {
                    bj4VarO.v0();
                    i13 = i & 1;
                    aVar = ox6.a.t;
                    if (i13 != 0) {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    } else {
                        if (i15 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            j7 = uh1.b;
                        } else {
                            j7 = j5;
                        }
                        if (i6 != 0) {
                            f3 = 1.0f;
                        } else {
                            f3 = f2;
                        }
                        if (i8 != 0) {
                            j8 = uh1.e;
                        } else {
                            j8 = j6;
                        }
                        if (i10 != 0) {
                            ob4Var2 = ob4.y;
                        } else {
                            ob4Var2 = ob4Var;
                        }
                        if ((i2 & 64) != 0) {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                            i12 &= -3670017;
                        } else {
                            jM833generateTextColor8_81llA = j3;
                        }
                        if ((i2 & 128) != 0) {
                            i12 &= -29360129;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                            j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                        } else {
                            j9 = j4;
                            ob4Var3 = ob4Var2;
                            j10 = jM833generateTextColor8_81llA;
                        }
                    }
                    bj4VarO.V();
                    b72 b72Var115 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    vs0 vs0VarB115 = ws0.b(f3, j7);
                    ox6 ox6VarD115 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB115.a, vs0VarB115.b, b72Var115), b72Var115), j8, al8.a), 44.0f), 44.0f);
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarD115);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                    bj4VarO.U(true);
                    ox6Var3 = ox6Var2;
                    j11 = j7;
                    j12 = j8;
                    j13 = j10;
                    j14 = j9;
                    ob4Var4 = ob4Var3;
                    f4 = f3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ae7
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(str, ox6Var3, j11, f4, j12, ob4Var4, j13, j14, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            j6 = j2;
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bj4VarO.J(ob4Var)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((i & 1572864) == 0) {
                int i119 = i3;
                if ((i2 & 64) == 0) {
                    i14 = 524288;
                } else {
                    i14 = 524288;
                }
                i12 = i119 | i14;
            } else {
                i12 = i3;
            }
            if ((i & 12582912) != 0) {
                i12 |= ((i2 & 128) == 0 || !bj4VarO.i(j4)) ? 4194304 : 8388608;
            }
            if ((i12 & 4793491) == 4793490) {
                bj4VarO.v0();
                i13 = i & 1;
                aVar = ox6.a.t;
                if (i13 != 0) {
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        j7 = uh1.b;
                    } else {
                        j7 = j5;
                    }
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i8 != 0) {
                        j8 = uh1.e;
                    } else {
                        j8 = j6;
                    }
                    if (i10 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if ((i2 & 64) != 0) {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                        i12 &= -3670017;
                    } else {
                        jM833generateTextColor8_81llA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                        j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                    } else {
                        j9 = j4;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                    }
                } else {
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        j7 = uh1.b;
                    } else {
                        j7 = j5;
                    }
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i8 != 0) {
                        j8 = uh1.e;
                    } else {
                        j8 = j6;
                    }
                    if (i10 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if ((i2 & 64) != 0) {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                        i12 &= -3670017;
                    } else {
                        jM833generateTextColor8_81llA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                        j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                    } else {
                        j9 = j4;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                    }
                }
                bj4VarO.V();
                b72 b72Var116 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                vs0 vs0VarB116 = ws0.b(f3, j7);
                ox6 ox6VarD116 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB116.a, vs0VarB116.b, b72Var116), b72Var116), j8, al8.a), 44.0f), 44.0f);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarD116);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                bj4VarO.U(true);
                ox6Var3 = ox6Var2;
                j11 = j7;
                j12 = j8;
                j13 = j10;
                j14 = j9;
                ob4Var4 = ob4Var3;
                f4 = f3;
            } else {
                bj4VarO.v0();
                i13 = i & 1;
                aVar = ox6.a.t;
                if (i13 != 0) {
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        j7 = uh1.b;
                    } else {
                        j7 = j5;
                    }
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i8 != 0) {
                        j8 = uh1.e;
                    } else {
                        j8 = j6;
                    }
                    if (i10 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if ((i2 & 64) != 0) {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                        i12 &= -3670017;
                    } else {
                        jM833generateTextColor8_81llA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                        j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                    } else {
                        j9 = j4;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                    }
                } else {
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        j7 = uh1.b;
                    } else {
                        j7 = j5;
                    }
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i8 != 0) {
                        j8 = uh1.e;
                    } else {
                        j8 = j6;
                    }
                    if (i10 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if ((i2 & 64) != 0) {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                        i12 &= -3670017;
                    } else {
                        jM833generateTextColor8_81llA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                        j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                    } else {
                        j9 = j4;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                    }
                }
                bj4VarO.V();
                b72 b72Var117 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                vs0 vs0VarB117 = ws0.b(f3, j7);
                ox6 ox6VarD117 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB117.a, vs0VarB117.b, b72Var117), b72Var117), j8, al8.a), 44.0f), 44.0f);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarD117);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                bj4VarO.U(true);
                ox6Var3 = ox6Var2;
                j11 = j7;
                j12 = j8;
                j13 = j10;
                j14 = j9;
                ob4Var4 = ob4Var3;
                f4 = f3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ae7
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(str, ox6Var3, j11, f4, j12, ob4Var4, j13, j14, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        f2 = f;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                j6 = j2;
                if (bj4VarO.i(j6)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bj4VarO.J(ob4Var)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            if ((i & 1572864) == 0) {
                int i1110 = i3;
                if ((i2 & 64) == 0) {
                    i14 = 524288;
                } else {
                    i14 = 524288;
                }
                i12 = i1110 | i14;
            } else {
                i12 = i3;
            }
            if ((i & 12582912) != 0) {
                i12 |= ((i2 & 128) == 0 || !bj4VarO.i(j4)) ? 4194304 : 8388608;
            }
            if ((i12 & 4793491) == 4793490) {
                bj4VarO.v0();
                i13 = i & 1;
                aVar = ox6.a.t;
                if (i13 != 0) {
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        j7 = uh1.b;
                    } else {
                        j7 = j5;
                    }
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i8 != 0) {
                        j8 = uh1.e;
                    } else {
                        j8 = j6;
                    }
                    if (i10 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if ((i2 & 64) != 0) {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                        i12 &= -3670017;
                    } else {
                        jM833generateTextColor8_81llA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                        j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                    } else {
                        j9 = j4;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                    }
                } else {
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        j7 = uh1.b;
                    } else {
                        j7 = j5;
                    }
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i8 != 0) {
                        j8 = uh1.e;
                    } else {
                        j8 = j6;
                    }
                    if (i10 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if ((i2 & 64) != 0) {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                        i12 &= -3670017;
                    } else {
                        jM833generateTextColor8_81llA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                        j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                    } else {
                        j9 = j4;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                    }
                }
                bj4VarO.V();
                b72 b72Var118 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                vs0 vs0VarB118 = ws0.b(f3, j7);
                ox6 ox6VarD118 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB118.a, vs0VarB118.b, b72Var118), b72Var118), j8, al8.a), 44.0f), 44.0f);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarD118);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                bj4VarO.U(true);
                ox6Var3 = ox6Var2;
                j11 = j7;
                j12 = j8;
                j13 = j10;
                j14 = j9;
                ob4Var4 = ob4Var3;
                f4 = f3;
            } else {
                bj4VarO.v0();
                i13 = i & 1;
                aVar = ox6.a.t;
                if (i13 != 0) {
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        j7 = uh1.b;
                    } else {
                        j7 = j5;
                    }
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i8 != 0) {
                        j8 = uh1.e;
                    } else {
                        j8 = j6;
                    }
                    if (i10 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if ((i2 & 64) != 0) {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                        i12 &= -3670017;
                    } else {
                        jM833generateTextColor8_81llA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                        j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                    } else {
                        j9 = j4;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                    }
                } else {
                    if (i15 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        j7 = uh1.b;
                    } else {
                        j7 = j5;
                    }
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i8 != 0) {
                        j8 = uh1.e;
                    } else {
                        j8 = j6;
                    }
                    if (i10 != 0) {
                        ob4Var2 = ob4.y;
                    } else {
                        ob4Var2 = ob4Var;
                    }
                    if ((i2 & 64) != 0) {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                        i12 &= -3670017;
                    } else {
                        jM833generateTextColor8_81llA = j3;
                    }
                    if ((i2 & 128) != 0) {
                        i12 &= -29360129;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                        j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                    } else {
                        j9 = j4;
                        ob4Var3 = ob4Var2;
                        j10 = jM833generateTextColor8_81llA;
                    }
                }
                bj4VarO.V();
                b72 b72Var119 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                vs0 vs0VarB119 = ws0.b(f3, j7);
                ox6 ox6VarD119 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB119.a, vs0VarB119.b, b72Var119), b72Var119), j8, al8.a), 44.0f), 44.0f);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarD119);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
                bj4VarO.U(true);
                ox6Var3 = ox6Var2;
                j11 = j7;
                j12 = j8;
                j13 = j10;
                j14 = j9;
                ob4Var4 = ob4Var3;
                f4 = f3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ae7
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(str, ox6Var3, j11, f4, j12, ob4Var4, j13, j14, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        j6 = j2;
        i10 = i2 & 32;
        if (i10 != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (bj4VarO.J(ob4Var)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i3 |= i11;
        }
        if ((i & 1572864) == 0) {
            int i1111 = i3;
            if ((i2 & 64) == 0) {
                i14 = 524288;
            } else {
                i14 = 524288;
            }
            i12 = i1111 | i14;
        } else {
            i12 = i3;
        }
        if ((i & 12582912) != 0) {
            i12 |= ((i2 & 128) == 0 || !bj4VarO.i(j4)) ? 4194304 : 8388608;
        }
        if ((i12 & 4793491) == 4793490) {
            bj4VarO.v0();
            i13 = i & 1;
            aVar = ox6.a.t;
            if (i13 != 0) {
                if (i15 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    j7 = uh1.b;
                } else {
                    j7 = j5;
                }
                if (i6 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f2;
                }
                if (i8 != 0) {
                    j8 = uh1.e;
                } else {
                    j8 = j6;
                }
                if (i10 != 0) {
                    ob4Var2 = ob4.y;
                } else {
                    ob4Var2 = ob4Var;
                }
                if ((i2 & 64) != 0) {
                    jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                    i12 &= -3670017;
                } else {
                    jM833generateTextColor8_81llA = j3;
                }
                if ((i2 & 128) != 0) {
                    i12 &= -29360129;
                    ob4Var3 = ob4Var2;
                    j10 = jM833generateTextColor8_81llA;
                    j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                } else {
                    j9 = j4;
                    ob4Var3 = ob4Var2;
                    j10 = jM833generateTextColor8_81llA;
                }
            } else {
                if (i15 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    j7 = uh1.b;
                } else {
                    j7 = j5;
                }
                if (i6 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f2;
                }
                if (i8 != 0) {
                    j8 = uh1.e;
                } else {
                    j8 = j6;
                }
                if (i10 != 0) {
                    ob4Var2 = ob4.y;
                } else {
                    ob4Var2 = ob4Var;
                }
                if ((i2 & 64) != 0) {
                    jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                    i12 &= -3670017;
                } else {
                    jM833generateTextColor8_81llA = j3;
                }
                if ((i2 & 128) != 0) {
                    i12 &= -29360129;
                    ob4Var3 = ob4Var2;
                    j10 = jM833generateTextColor8_81llA;
                    j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                } else {
                    j9 = j4;
                    ob4Var3 = ob4Var2;
                    j10 = jM833generateTextColor8_81llA;
                }
            }
            bj4VarO.V();
            b72 b72Var1110 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
            vs0 vs0VarB1110 = ws0.b(f3, j7);
            ox6 ox6VarD1110 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB1110.a, vs0VarB1110.b, b72Var1110), b72Var1110), j8, al8.a), 44.0f), 44.0f);
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarD1110);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
            bj4VarO.U(true);
            ox6Var3 = ox6Var2;
            j11 = j7;
            j12 = j8;
            j13 = j10;
            j14 = j9;
            ob4Var4 = ob4Var3;
            f4 = f3;
        } else {
            bj4VarO.v0();
            i13 = i & 1;
            aVar = ox6.a.t;
            if (i13 != 0) {
                if (i15 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    j7 = uh1.b;
                } else {
                    j7 = j5;
                }
                if (i6 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f2;
                }
                if (i8 != 0) {
                    j8 = uh1.e;
                } else {
                    j8 = j6;
                }
                if (i10 != 0) {
                    ob4Var2 = ob4.y;
                } else {
                    ob4Var2 = ob4Var;
                }
                if ((i2 & 64) != 0) {
                    jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                    i12 &= -3670017;
                } else {
                    jM833generateTextColor8_81llA = j3;
                }
                if ((i2 & 128) != 0) {
                    i12 &= -29360129;
                    ob4Var3 = ob4Var2;
                    j10 = jM833generateTextColor8_81llA;
                    j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                } else {
                    j9 = j4;
                    ob4Var3 = ob4Var2;
                    j10 = jM833generateTextColor8_81llA;
                }
            } else {
                if (i15 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    j7 = uh1.b;
                } else {
                    j7 = j5;
                }
                if (i6 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f2;
                }
                if (i8 != 0) {
                    j8 = uh1.e;
                } else {
                    j8 = j6;
                }
                if (i10 != 0) {
                    ob4Var2 = ob4.y;
                } else {
                    ob4Var2 = ob4Var;
                }
                if ((i2 & 64) != 0) {
                    jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j8);
                    i12 &= -3670017;
                } else {
                    jM833generateTextColor8_81llA = j3;
                }
                if ((i2 & 128) != 0) {
                    i12 &= -29360129;
                    ob4Var3 = ob4Var2;
                    j10 = jM833generateTextColor8_81llA;
                    j9 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04().a.b;
                } else {
                    j9 = j4;
                    ob4Var3 = ob4Var2;
                    j10 = jM833generateTextColor8_81llA;
                }
            }
            bj4VarO.V();
            b72 b72Var1111 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
            vs0 vs0VarB1111 = ws0.b(f3, j7);
            ox6 ox6VarD1111 = ir9.d(ir9.n(gi0.c(uma.a(ns0.b(ox6Var2, vs0VarB1111.a, vs0VarB1111.b, b72Var1111), b72Var1111), j8, al8.a), 44.0f), 44.0f);
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarD1111);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            mia.b(str, kv0.a.f(aVar, di.a.e), j10, j9, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, null, bj4VarO, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 9) & 57344) | ((i12 << 3) & 3670016), 0, 262056);
            bj4VarO.U(true);
            ox6Var3 = ox6Var2;
            j11 = j7;
            j12 = j8;
            j13 = j10;
            j14 = j9;
            ob4Var4 = ob4Var3;
            f4 = f3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ae7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(str, ox6Var3, j11, f4, j12, ob4Var4, j13, j14, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b NumericRatingCell_jWvj134$lambda$1(String str, ox6 ox6Var, long j, float f, long j2, ob4 ob4Var, long j3, long j4, int i, int i2, jt1 jt1Var, int i3) {
        m494NumericRatingCelljWvj134(str, ox6Var, j, f, j2, ob4Var, j3, j4, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
