package io.intercom.android.sdk.ui.component;

import defpackage.a30;
import defpackage.ay8;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gz3;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ns0;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.py8;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.uma;
import defpackage.xj8;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.component.BoxedTextLayoutKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BoxedTextLayoutKt {
    /* JADX WARN: Code duplicated, block: B:102:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:108:0x0207  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8 A[PHI: r5 r6 r7 r12
      0x00e8: PHI (r5v8 ox6) = (r5v4 ox6), (r5v3 ox6), (r5v3 ox6) binds: [B:89:0x0101, B:78:0x00e4, B:79:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r6v23 int) = (r6v16 int), (r6v15 int), (r6v24 int) binds: [B:89:0x0101, B:78:0x00e4, B:79:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r7v24 long) = (r7v15 long), (r7v14 long), (r7v14 long) binds: [B:89:0x0101, B:78:0x00e4, B:79:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r12v6 ei4<? super oy8, ? super jt1, ? super java.lang.Integer, g2b>) = 
      (r12v3 ei4<? super oy8, ? super jt1, ? super java.lang.Integer, g2b>)
      (r12v2 ei4<? super oy8, ? super jt1, ? super java.lang.Integer, g2b>)
      (r12v2 ei4<? super oy8, ? super jt1, ? super java.lang.Integer, g2b>)
     binds: [B:89:0x0101, B:78:0x00e4, B:79:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x0158  */
    /* JADX WARN: Code duplicated, block: B:95:0x015f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0163  */
    /* JADX WARN: Code duplicated, block: B:99:0x018f  */
    /* JADX INFO: renamed from: BoxedTextLayout-Y0xEhic, reason: not valid java name */
    public static final void m556BoxedTextLayoutY0xEhic(ox6 ox6Var, final String str, final long j, long j2, ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var, ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var2, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        String str2;
        long jA;
        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var3;
        int i4;
        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var4;
        int i5;
        int i6;
        ox6.a aVar;
        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var5;
        ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var6;
        long j3;
        IntercomTheme intercomTheme;
        ny8 ny8VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        py8 py8Var;
        final ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var7;
        final ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var8;
        final ox6 ox6Var3;
        final long j4;
        xj8 xj8VarW;
        str.getClass();
        bj4 bj4VarO = jt1Var.o(-1728859823);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i3 |= bj4VarO.J(str2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.i(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jA = j2;
                int i8 = bj4VarO.i(jA) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
                i3 |= i8;
            } else {
                jA = j2;
            }
            i3 |= i8;
        } else {
            jA = j2;
        }
        int i9 = i2 & 16;
        if (i9 == 0) {
            if ((i & 24576) == 0) {
                ei4Var3 = ei4Var;
                i3 |= bj4VarO.j(ei4Var3) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    ei4Var4 = ei4Var2;
                    if (bj4VarO.j(ei4Var4)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((74899 & i3) == 74898 || !bj4VarO.r()) {
                    bj4VarO.v0();
                    i6 = i & 1;
                    aVar = ox6.a.t;
                    if (i6 != 0 || bj4VarO.c0()) {
                        if (i7 != 0) {
                            ox6Var2 = aVar;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                        }
                        if (i9 != 0) {
                            ei4Var3 = null;
                        }
                        if (i4 != 0) {
                            ei4Var5 = ei4Var3;
                            ei4Var6 = null;
                        }
                        j3 = jA;
                        bj4VarO.V();
                        intercomTheme = IntercomTheme.INSTANCE;
                        ox6 ox6VarI = eo7.i(uma.a(ns0.a(ox6Var2, 1.0f, j, intercomTheme.getShapes(bj4VarO, 6).b), ay8.a(2)), 8.0f);
                        ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarI);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (bj4VarO.a != null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(581650665);
                        py8Var = py8.a;
                        if (ei4Var5 != null) {
                            ei4Var5.invoke(py8Var, bj4VarO, Integer.valueOf(6 | ((i3 >> 9) & 112)));
                        }
                        bj4VarO.U(false);
                        mia.b(str2, py8Var.a(aVar, 1.0f, false), j3, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, 6).getType04(), bj4VarO, (i3 >> 3) & 910, 24960, 110584);
                        bj4VarO.K(581663175);
                        if (ei4Var6 != null) {
                            ei4Var6.invoke(py8Var, bj4VarO, Integer.valueOf(((i3 >> 12) & 112) | 6));
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        ei4Var7 = ei4Var5;
                        ei4Var8 = ei4Var6;
                        ox6Var3 = ox6Var2;
                        j4 = j3;
                    } else {
                        bj4VarO.u();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                    }
                    ei4Var6 = ei4Var2;
                    ei4Var5 = ei4Var3;
                    j3 = jA;
                    bj4VarO.V();
                    intercomTheme = IntercomTheme.INSTANCE;
                    ox6 ox6VarI2 = eo7.i(uma.a(ns0.a(ox6Var2, 1.0f, j, intercomTheme.getShapes(bj4VarO, 6).b), ay8.a(2)), 8.0f);
                    ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarI2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a != null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(581650665);
                    py8Var = py8.a;
                    if (ei4Var5 != null) {
                        ei4Var5.invoke(py8Var, bj4VarO, Integer.valueOf(6 | ((i3 >> 9) & 112)));
                    }
                    bj4VarO.U(false);
                    mia.b(str2, py8Var.a(aVar, 1.0f, false), j3, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, 6).getType04(), bj4VarO, (i3 >> 3) & 910, 24960, 110584);
                    bj4VarO.K(581663175);
                    if (ei4Var6 != null) {
                        ei4Var6.invoke(py8Var, bj4VarO, Integer.valueOf(((i3 >> 12) & 112) | 6));
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    ei4Var7 = ei4Var5;
                    ei4Var8 = ei4Var6;
                    ox6Var3 = ox6Var2;
                    j4 = j3;
                } else {
                    bj4VarO.u();
                    ox6Var3 = ox6Var2;
                    j4 = jA;
                    ei4Var7 = ei4Var3;
                    ei4Var8 = ei4Var4;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: rv0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return BoxedTextLayoutKt.BoxedTextLayout_Y0xEhic$lambda$1(ox6Var3, str, j, j4, ei4Var7, ei4Var8, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            ei4Var4 = ei4Var2;
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                i6 = i & 1;
                aVar = ox6.a.t;
                if (i6 != 0) {
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                    }
                    if (i9 != 0) {
                        ei4Var3 = null;
                    }
                    if (i4 != 0) {
                        ei4Var5 = ei4Var3;
                        ei4Var6 = null;
                    } else {
                        ei4Var6 = ei4Var2;
                        ei4Var5 = ei4Var3;
                    }
                } else {
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                    }
                    if (i9 != 0) {
                        ei4Var3 = null;
                    }
                    if (i4 != 0) {
                        ei4Var5 = ei4Var3;
                        ei4Var6 = null;
                    } else {
                        ei4Var6 = ei4Var2;
                        ei4Var5 = ei4Var3;
                    }
                }
                j3 = jA;
                bj4VarO.V();
                intercomTheme = IntercomTheme.INSTANCE;
                ox6 ox6VarI3 = eo7.i(uma.a(ns0.a(ox6Var2, 1.0f, j, intercomTheme.getShapes(bj4VarO, 6).b), ay8.a(2)), 8.0f);
                ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarI3);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a != null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(581650665);
                py8Var = py8.a;
                if (ei4Var5 != null) {
                    ei4Var5.invoke(py8Var, bj4VarO, Integer.valueOf(6 | ((i3 >> 9) & 112)));
                }
                bj4VarO.U(false);
                mia.b(str2, py8Var.a(aVar, 1.0f, false), j3, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, 6).getType04(), bj4VarO, (i3 >> 3) & 910, 24960, 110584);
                bj4VarO.K(581663175);
                if (ei4Var6 != null) {
                    ei4Var6.invoke(py8Var, bj4VarO, Integer.valueOf(((i3 >> 12) & 112) | 6));
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                ei4Var7 = ei4Var5;
                ei4Var8 = ei4Var6;
                ox6Var3 = ox6Var2;
                j4 = j3;
            } else {
                bj4VarO.v0();
                i6 = i & 1;
                aVar = ox6.a.t;
                if (i6 != 0) {
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                    }
                    if (i9 != 0) {
                        ei4Var3 = null;
                    }
                    if (i4 != 0) {
                        ei4Var5 = ei4Var3;
                        ei4Var6 = null;
                    } else {
                        ei4Var6 = ei4Var2;
                        ei4Var5 = ei4Var3;
                    }
                } else {
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                    }
                    if (i9 != 0) {
                        ei4Var3 = null;
                    }
                    if (i4 != 0) {
                        ei4Var5 = ei4Var3;
                        ei4Var6 = null;
                    } else {
                        ei4Var6 = ei4Var2;
                        ei4Var5 = ei4Var3;
                    }
                }
                j3 = jA;
                bj4VarO.V();
                intercomTheme = IntercomTheme.INSTANCE;
                ox6 ox6VarI4 = eo7.i(uma.a(ns0.a(ox6Var2, 1.0f, j, intercomTheme.getShapes(bj4VarO, 6).b), ay8.a(2)), 8.0f);
                ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarI4);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a != null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(581650665);
                py8Var = py8.a;
                if (ei4Var5 != null) {
                    ei4Var5.invoke(py8Var, bj4VarO, Integer.valueOf(6 | ((i3 >> 9) & 112)));
                }
                bj4VarO.U(false);
                mia.b(str2, py8Var.a(aVar, 1.0f, false), j3, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, 6).getType04(), bj4VarO, (i3 >> 3) & 910, 24960, 110584);
                bj4VarO.K(581663175);
                if (ei4Var6 != null) {
                    ei4Var6.invoke(py8Var, bj4VarO, Integer.valueOf(((i3 >> 12) & 112) | 6));
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                ei4Var7 = ei4Var5;
                ei4Var8 = ei4Var6;
                ox6Var3 = ox6Var2;
                j4 = j3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: rv0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return BoxedTextLayoutKt.BoxedTextLayout_Y0xEhic$lambda$1(ox6Var3, str, j, j4, ei4Var7, ei4Var8, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        ei4Var3 = ei4Var;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                ei4Var4 = ei4Var2;
                if (bj4VarO.j(ei4Var4)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                i6 = i & 1;
                aVar = ox6.a.t;
                if (i6 != 0) {
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                    }
                    if (i9 != 0) {
                        ei4Var3 = null;
                    }
                    if (i4 != 0) {
                        ei4Var5 = ei4Var3;
                        ei4Var6 = null;
                    } else {
                        ei4Var6 = ei4Var2;
                        ei4Var5 = ei4Var3;
                    }
                } else {
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                    }
                    if (i9 != 0) {
                        ei4Var3 = null;
                    }
                    if (i4 != 0) {
                        ei4Var5 = ei4Var3;
                        ei4Var6 = null;
                    } else {
                        ei4Var6 = ei4Var2;
                        ei4Var5 = ei4Var3;
                    }
                }
                j3 = jA;
                bj4VarO.V();
                intercomTheme = IntercomTheme.INSTANCE;
                ox6 ox6VarI5 = eo7.i(uma.a(ns0.a(ox6Var2, 1.0f, j, intercomTheme.getShapes(bj4VarO, 6).b), ay8.a(2)), 8.0f);
                ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarI5);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a != null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(581650665);
                py8Var = py8.a;
                if (ei4Var5 != null) {
                    ei4Var5.invoke(py8Var, bj4VarO, Integer.valueOf(6 | ((i3 >> 9) & 112)));
                }
                bj4VarO.U(false);
                mia.b(str2, py8Var.a(aVar, 1.0f, false), j3, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, 6).getType04(), bj4VarO, (i3 >> 3) & 910, 24960, 110584);
                bj4VarO.K(581663175);
                if (ei4Var6 != null) {
                    ei4Var6.invoke(py8Var, bj4VarO, Integer.valueOf(((i3 >> 12) & 112) | 6));
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                ei4Var7 = ei4Var5;
                ei4Var8 = ei4Var6;
                ox6Var3 = ox6Var2;
                j4 = j3;
            } else {
                bj4VarO.v0();
                i6 = i & 1;
                aVar = ox6.a.t;
                if (i6 != 0) {
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                    }
                    if (i9 != 0) {
                        ei4Var3 = null;
                    }
                    if (i4 != 0) {
                        ei4Var5 = ei4Var3;
                        ei4Var6 = null;
                    } else {
                        ei4Var6 = ei4Var2;
                        ei4Var5 = ei4Var3;
                    }
                } else {
                    if (i7 != 0) {
                        ox6Var2 = aVar;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                    }
                    if (i9 != 0) {
                        ei4Var3 = null;
                    }
                    if (i4 != 0) {
                        ei4Var5 = ei4Var3;
                        ei4Var6 = null;
                    } else {
                        ei4Var6 = ei4Var2;
                        ei4Var5 = ei4Var3;
                    }
                }
                j3 = jA;
                bj4VarO.V();
                intercomTheme = IntercomTheme.INSTANCE;
                ox6 ox6VarI6 = eo7.i(uma.a(ns0.a(ox6Var2, 1.0f, j, intercomTheme.getShapes(bj4VarO, 6).b), ay8.a(2)), 8.0f);
                ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarI6);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a != null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(581650665);
                py8Var = py8.a;
                if (ei4Var5 != null) {
                    ei4Var5.invoke(py8Var, bj4VarO, Integer.valueOf(6 | ((i3 >> 9) & 112)));
                }
                bj4VarO.U(false);
                mia.b(str2, py8Var.a(aVar, 1.0f, false), j3, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, 6).getType04(), bj4VarO, (i3 >> 3) & 910, 24960, 110584);
                bj4VarO.K(581663175);
                if (ei4Var6 != null) {
                    ei4Var6.invoke(py8Var, bj4VarO, Integer.valueOf(((i3 >> 12) & 112) | 6));
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                ei4Var7 = ei4Var5;
                ei4Var8 = ei4Var6;
                ox6Var3 = ox6Var2;
                j4 = j3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: rv0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return BoxedTextLayoutKt.BoxedTextLayout_Y0xEhic$lambda$1(ox6Var3, str, j, j4, ei4Var7, ei4Var8, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        ei4Var4 = ei4Var2;
        if ((74899 & i3) == 74898) {
            bj4VarO.v0();
            i6 = i & 1;
            aVar = ox6.a.t;
            if (i6 != 0) {
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                }
                if (i9 != 0) {
                    ei4Var3 = null;
                }
                if (i4 != 0) {
                    ei4Var5 = ei4Var3;
                    ei4Var6 = null;
                } else {
                    ei4Var6 = ei4Var2;
                    ei4Var5 = ei4Var3;
                }
            } else {
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                }
                if (i9 != 0) {
                    ei4Var3 = null;
                }
                if (i4 != 0) {
                    ei4Var5 = ei4Var3;
                    ei4Var6 = null;
                } else {
                    ei4Var6 = ei4Var2;
                    ei4Var5 = ei4Var3;
                }
            }
            j3 = jA;
            bj4VarO.V();
            intercomTheme = IntercomTheme.INSTANCE;
            ox6 ox6VarI7 = eo7.i(uma.a(ns0.a(ox6Var2, 1.0f, j, intercomTheme.getShapes(bj4VarO, 6).b), ay8.a(2)), 8.0f);
            ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarI7);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (bj4VarO.a != null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(581650665);
            py8Var = py8.a;
            if (ei4Var5 != null) {
                ei4Var5.invoke(py8Var, bj4VarO, Integer.valueOf(6 | ((i3 >> 9) & 112)));
            }
            bj4VarO.U(false);
            mia.b(str2, py8Var.a(aVar, 1.0f, false), j3, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, 6).getType04(), bj4VarO, (i3 >> 3) & 910, 24960, 110584);
            bj4VarO.K(581663175);
            if (ei4Var6 != null) {
                ei4Var6.invoke(py8Var, bj4VarO, Integer.valueOf(((i3 >> 12) & 112) | 6));
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            ei4Var7 = ei4Var5;
            ei4Var8 = ei4Var6;
            ox6Var3 = ox6Var2;
            j4 = j3;
        } else {
            bj4VarO.v0();
            i6 = i & 1;
            aVar = ox6.a.t;
            if (i6 != 0) {
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                }
                if (i9 != 0) {
                    ei4Var3 = null;
                }
                if (i4 != 0) {
                    ei4Var5 = ei4Var3;
                    ei4Var6 = null;
                } else {
                    ei4Var6 = ei4Var2;
                    ei4Var5 = ei4Var3;
                }
            } else {
                if (i7 != 0) {
                    ox6Var2 = aVar;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jA = gh5.a(IntercomTheme.INSTANCE, bj4VarO, 6);
                }
                if (i9 != 0) {
                    ei4Var3 = null;
                }
                if (i4 != 0) {
                    ei4Var5 = ei4Var3;
                    ei4Var6 = null;
                } else {
                    ei4Var6 = ei4Var2;
                    ei4Var5 = ei4Var3;
                }
            }
            j3 = jA;
            bj4VarO.V();
            intercomTheme = IntercomTheme.INSTANCE;
            ox6 ox6VarI8 = eo7.i(uma.a(ns0.a(ox6Var2, 1.0f, j, intercomTheme.getShapes(bj4VarO, 6).b), ay8.a(2)), 8.0f);
            ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarI8);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (bj4VarO.a != null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(581650665);
            py8Var = py8.a;
            if (ei4Var5 != null) {
                ei4Var5.invoke(py8Var, bj4VarO, Integer.valueOf(6 | ((i3 >> 9) & 112)));
            }
            bj4VarO.U(false);
            mia.b(str2, py8Var.a(aVar, 1.0f, false), j3, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, 6).getType04(), bj4VarO, (i3 >> 3) & 910, 24960, 110584);
            bj4VarO.K(581663175);
            if (ei4Var6 != null) {
                ei4Var6.invoke(py8Var, bj4VarO, Integer.valueOf(((i3 >> 12) & 112) | 6));
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            ei4Var7 = ei4Var5;
            ei4Var8 = ei4Var6;
            ox6Var3 = ox6Var2;
            j4 = j3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: rv0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BoxedTextLayoutKt.BoxedTextLayout_Y0xEhic$lambda$1(ox6Var3, str, j, j4, ei4Var7, ei4Var8, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BoxedTextLayout_Y0xEhic$lambda$1(ox6 ox6Var, String str, long j, long j2, ei4 ei4Var, ei4 ei4Var2, int i, int i2, jt1 jt1Var, int i3) {
        m556BoxedTextLayoutY0xEhic(ox6Var, str, j, j2, ei4Var, ei4Var2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
