package io.intercom.android.sdk.survey.ui.questiontype.choice;

import defpackage.al8;
import defpackage.b72;
import defpackage.beb;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jc1;
import defpackage.jt1;
import defpackage.kc1;
import defpackage.kw7;
import defpackage.lc1;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ns0;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.oc1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.pc1;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.uh1;
import defpackage.uma;
import defpackage.vs0;
import defpackage.we1;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.zp0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ChoicePillKt {
    /* JADX WARN: Code duplicated, block: B:102:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0135  */
    /* JADX WARN: Code duplicated, block: B:105:0x0141  */
    /* JADX WARN: Code duplicated, block: B:108:0x0151  */
    /* JADX WARN: Code duplicated, block: B:109:0x0154  */
    /* JADX WARN: Code duplicated, block: B:111:0x0158  */
    /* JADX WARN: Code duplicated, block: B:113:0x015c  */
    /* JADX WARN: Code duplicated, block: B:114:0x015f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x0169  */
    /* JADX WARN: Code duplicated, block: B:121:0x0178  */
    /* JADX WARN: Code duplicated, block: B:124:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:125:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:128:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:136:0x0213  */
    /* JADX WARN: Code duplicated, block: B:138:0x021a  */
    /* JADX WARN: Code duplicated, block: B:139:0x021e  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:146:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:148:0x0306  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x0118  */
    /* JADX INFO: renamed from: ChoicePill-UdaoDFU, reason: not valid java name */
    public static final void m465ChoicePillUdaoDFU(final boolean z, oh4<? super String, g2b> oh4Var, final String str, long j, float f, long j2, ob4 ob4Var, long j3, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final oh4<? super String, g2b> oh4Var2;
        int i4;
        int i5;
        int i6;
        int i7;
        float f2;
        int i8;
        int i9;
        long j4;
        int i10;
        int i11;
        ob4 ob4Var2;
        int i12;
        int i13;
        jt1.a.C0187a c0187a;
        long j5;
        long j6;
        int i14;
        float f3;
        long jM833generateTextColor8_81llA;
        long j7;
        Object objF;
        IntercomTheme intercomTheme;
        int i15;
        ob4 ob4Var3;
        ox6.a aVar;
        long j8;
        float f4;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objF2;
        ny8 ny8VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        oh4<? super String, g2b> oh4Var3;
        int i16;
        bj4 bj4Var;
        final float f5;
        long j9;
        final ob4 ob4Var4;
        final long j10;
        xj8 xj8VarW;
        str.getClass();
        bj4 bj4VarO = jt1Var.o(418926179);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.c(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i17 = i2 & 2;
        if (i17 == 0) {
            if ((i & 48) == 0) {
                oh4Var2 = oh4Var;
                i3 |= bj4VarO.j(oh4Var2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (bj4VarO.J(str)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    if (bj4VarO.i(j)) {
                        i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 16;
                if (i7 != 0) {
                    if ((i & 24576) == 0) {
                        f2 = f;
                        if (bj4VarO.g(f2)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        i3 |= 196608;
                        j4 = j2;
                    } else {
                        j4 = j2;
                        if ((i & 196608) == 0) {
                            if (bj4VarO.i(j4)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                    }
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        i3 |= 1572864;
                        ob4Var2 = ob4Var;
                    } else {
                        ob4Var2 = ob4Var;
                        if ((i & 1572864) == 0) {
                            if (bj4VarO.J(ob4Var2)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i3 |= i12;
                        }
                    }
                    if ((i & 12582912) != 0) {
                        i3 |= ((i2 & 128) == 0 || !bj4VarO.i(j3)) ? 4194304 : 8388608;
                    }
                    if ((i3 & 4793491) == 4793490 || !bj4VarO.r()) {
                        bj4VarO.v0();
                        i13 = i & 1;
                        c0187a = jt1.a.a;
                        if (i13 != 0 || bj4VarO.c0()) {
                            if (i17 != 0) {
                                bj4VarO.K(-8602219);
                                objF = bj4VarO.f();
                                if (objF == c0187a) {
                                    objF = new lc1();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                oh4Var2 = (oh4) objF;
                            }
                            if (i5 != 0) {
                                j5 = uh1.b;
                            } else {
                                j5 = j;
                            }
                            if (i7 != 0) {
                                f2 = 1.0f;
                            }
                            if (i9 != 0) {
                                j6 = uh1.e;
                            } else {
                                j6 = j4;
                            }
                            if (i11 != 0) {
                                ob4Var2 = ob4.y;
                            }
                            if ((i2 & 128) != 0) {
                                float f6 = f2;
                                i14 = i3 & (-29360129);
                                f3 = f6;
                                jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                            } else {
                                float f7 = f2;
                                i14 = i3;
                                f3 = f7;
                                jM833generateTextColor8_81llA = j3;
                            }
                            j7 = j5;
                        } else {
                            bj4VarO.u();
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            float f8 = f2;
                            i14 = i3;
                            f3 = f8;
                            jM833generateTextColor8_81llA = j3;
                            oh4Var2 = oh4Var2;
                            j6 = j4;
                            ob4Var2 = ob4Var2;
                            j7 = j;
                        }
                        bj4VarO.V();
                        intercomTheme = IntercomTheme.INSTANCE;
                        i15 = IntercomTheme.$stable;
                        b72 b72Var = intercomTheme.getShapes(bj4VarO, i15).b;
                        ob4Var3 = ob4Var2;
                        aVar = ox6.a.t;
                        j8 = jM833generateTextColor8_81llA;
                        ox6 ox6VarC2 = ir9.c(aVar, 1.0f);
                        vs0 vs0VarB = ws0.b(f3, j7);
                        f4 = f3;
                        ox6 ox6VarC3 = gi0.c(uma.a(ns0.b(ox6VarC2, vs0VarB.a, vs0VarB.b, b72Var), b72Var), j6, al8.a);
                        bj4VarO.K(-8583674);
                        if ((i14 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if ((i14 & 896) == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = z2 | z3;
                        objF2 = bj4VarO.f();
                        if (z4 || objF2 == c0187a) {
                            objF2 = new mh4() { // from class: mc1
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        ox6 ox6VarI = eo7.i(we1.c(ox6VarC3, false, null, (mh4) objF2, 15), 16.0f);
                        ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarI);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        oh4Var3 = oh4Var2;
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
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        long j11 = j7;
                        long j12 = j6;
                        i16 = i14;
                        mia.b(str, ir9.c(aVar, 0.85f).H(new beb()), j8, 0L, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04(), bj4VarO, ((i14 >> 6) & 14) | ((i14 >> 15) & 896) | (3670016 & i14), 0, 131000);
                        bj4Var = bj4VarO;
                        bj4Var.K(2120583720);
                        if (z) {
                            m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, bj4Var, 0), nr1.f(bj4Var, com.hwpo_training_app.R.string.selected), ir9.j(aVar, 24.0f).H(new beb()), j8, bj4Var, ((i16 >> 12) & 7168) | 8, 0);
                        }
                        bj4Var.U(false);
                        bj4Var.U(true);
                        f5 = f4;
                        j9 = j8;
                        ob4Var4 = ob4Var3;
                        j10 = j11;
                        j4 = j12;
                        oh4Var2 = oh4Var3;
                    } else {
                        bj4VarO.u();
                        j9 = j3;
                        bj4Var = bj4VarO;
                        ob4Var4 = ob4Var2;
                        f5 = f2;
                        j10 = j;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        final oh4<? super String, g2b> oh4Var4 = oh4Var2;
                        final long j13 = j4;
                        final long j14 = j9;
                        xj8VarW.d = new ci4() { // from class: nc1
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$5(z, oh4Var4, str, j10, f5, j13, ob4Var4, j14, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                f2 = f;
                i9 = i2 & 32;
                if (i9 != 0) {
                    i3 |= 196608;
                    j4 = j2;
                } else {
                    j4 = j2;
                    if ((i & 196608) == 0) {
                        if (bj4VarO.i(j4)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                    ob4Var2 = ob4Var;
                } else {
                    ob4Var2 = ob4Var;
                    if ((i & 1572864) == 0) {
                        if (bj4VarO.J(ob4Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                }
                if ((i & 12582912) != 0) {
                    i3 |= ((i2 & 128) == 0 || !bj4VarO.i(j3)) ? 4194304 : 8388608;
                }
                if ((i3 & 4793491) == 4793490) {
                    bj4VarO.v0();
                    i13 = i & 1;
                    c0187a = jt1.a.a;
                    if (i13 != 0) {
                        if (i17 != 0) {
                            bj4VarO.K(-8602219);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new lc1();
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var2 = (oh4) objF;
                        }
                        if (i5 != 0) {
                            j5 = uh1.b;
                        } else {
                            j5 = j;
                        }
                        if (i7 != 0) {
                            f2 = 1.0f;
                        }
                        if (i9 != 0) {
                            j6 = uh1.e;
                        } else {
                            j6 = j4;
                        }
                        if (i11 != 0) {
                            ob4Var2 = ob4.y;
                        }
                        if ((i2 & 128) != 0) {
                            float f9 = f2;
                            i14 = i3 & (-29360129);
                            f3 = f9;
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                        } else {
                            float f10 = f2;
                            i14 = i3;
                            f3 = f10;
                            jM833generateTextColor8_81llA = j3;
                        }
                        j7 = j5;
                    } else {
                        if (i17 != 0) {
                            bj4VarO.K(-8602219);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new lc1();
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var2 = (oh4) objF;
                        }
                        if (i5 != 0) {
                            j5 = uh1.b;
                        } else {
                            j5 = j;
                        }
                        if (i7 != 0) {
                            f2 = 1.0f;
                        }
                        if (i9 != 0) {
                            j6 = uh1.e;
                        } else {
                            j6 = j4;
                        }
                        if (i11 != 0) {
                            ob4Var2 = ob4.y;
                        }
                        if ((i2 & 128) != 0) {
                            float f11 = f2;
                            i14 = i3 & (-29360129);
                            f3 = f11;
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                        } else {
                            float f12 = f2;
                            i14 = i3;
                            f3 = f12;
                            jM833generateTextColor8_81llA = j3;
                        }
                        j7 = j5;
                    }
                    bj4VarO.V();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i15 = IntercomTheme.$stable;
                    b72 b72Var2 = intercomTheme.getShapes(bj4VarO, i15).b;
                    ob4Var3 = ob4Var2;
                    aVar = ox6.a.t;
                    j8 = jM833generateTextColor8_81llA;
                    ox6 ox6VarC4 = ir9.c(aVar, 1.0f);
                    vs0 vs0VarB2 = ws0.b(f3, j7);
                    f4 = f3;
                    ox6 ox6VarC5 = gi0.c(uma.a(ns0.b(ox6VarC4, vs0VarB2.a, vs0VarB2.b, b72Var2), b72Var2), j6, al8.a);
                    bj4VarO.K(-8583674);
                    if ((i14 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((i14 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z2 | z3;
                    objF2 = bj4VarO.f();
                    if (z4) {
                        objF2 = new mh4() { // from class: mc1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: mc1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarI2 = eo7.i(we1.c(ox6VarC5, false, null, (mh4) objF2, 15), 16.0f);
                    ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarI2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    oh4Var3 = oh4Var2;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    long j15 = j7;
                    long j16 = j6;
                    i16 = i14;
                    mia.b(str, ir9.c(aVar, 0.85f).H(new beb()), j8, 0L, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04(), bj4VarO, ((i14 >> 6) & 14) | ((i14 >> 15) & 896) | (3670016 & i14), 0, 131000);
                    bj4Var = bj4VarO;
                    bj4Var.K(2120583720);
                    if (z) {
                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, bj4Var, 0), nr1.f(bj4Var, com.hwpo_training_app.R.string.selected), ir9.j(aVar, 24.0f).H(new beb()), j8, bj4Var, ((i16 >> 12) & 7168) | 8, 0);
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    f5 = f4;
                    j9 = j8;
                    ob4Var4 = ob4Var3;
                    j10 = j15;
                    j4 = j16;
                    oh4Var2 = oh4Var3;
                } else {
                    bj4VarO.v0();
                    i13 = i & 1;
                    c0187a = jt1.a.a;
                    if (i13 != 0) {
                        if (i17 != 0) {
                            bj4VarO.K(-8602219);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new lc1();
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var2 = (oh4) objF;
                        }
                        if (i5 != 0) {
                            j5 = uh1.b;
                        } else {
                            j5 = j;
                        }
                        if (i7 != 0) {
                            f2 = 1.0f;
                        }
                        if (i9 != 0) {
                            j6 = uh1.e;
                        } else {
                            j6 = j4;
                        }
                        if (i11 != 0) {
                            ob4Var2 = ob4.y;
                        }
                        if ((i2 & 128) != 0) {
                            float f13 = f2;
                            i14 = i3 & (-29360129);
                            f3 = f13;
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                        } else {
                            float f14 = f2;
                            i14 = i3;
                            f3 = f14;
                            jM833generateTextColor8_81llA = j3;
                        }
                        j7 = j5;
                    } else {
                        if (i17 != 0) {
                            bj4VarO.K(-8602219);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new lc1();
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var2 = (oh4) objF;
                        }
                        if (i5 != 0) {
                            j5 = uh1.b;
                        } else {
                            j5 = j;
                        }
                        if (i7 != 0) {
                            f2 = 1.0f;
                        }
                        if (i9 != 0) {
                            j6 = uh1.e;
                        } else {
                            j6 = j4;
                        }
                        if (i11 != 0) {
                            ob4Var2 = ob4.y;
                        }
                        if ((i2 & 128) != 0) {
                            float f15 = f2;
                            i14 = i3 & (-29360129);
                            f3 = f15;
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                        } else {
                            float f16 = f2;
                            i14 = i3;
                            f3 = f16;
                            jM833generateTextColor8_81llA = j3;
                        }
                        j7 = j5;
                    }
                    bj4VarO.V();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i15 = IntercomTheme.$stable;
                    b72 b72Var3 = intercomTheme.getShapes(bj4VarO, i15).b;
                    ob4Var3 = ob4Var2;
                    aVar = ox6.a.t;
                    j8 = jM833generateTextColor8_81llA;
                    ox6 ox6VarC6 = ir9.c(aVar, 1.0f);
                    vs0 vs0VarB3 = ws0.b(f3, j7);
                    f4 = f3;
                    ox6 ox6VarC7 = gi0.c(uma.a(ns0.b(ox6VarC6, vs0VarB3.a, vs0VarB3.b, b72Var3), b72Var3), j6, al8.a);
                    bj4VarO.K(-8583674);
                    if ((i14 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((i14 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z2 | z3;
                    objF2 = bj4VarO.f();
                    if (z4) {
                        objF2 = new mh4() { // from class: mc1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: mc1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarI3 = eo7.i(we1.c(ox6VarC7, false, null, (mh4) objF2, 15), 16.0f);
                    ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarI3);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    oh4Var3 = oh4Var2;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    long j17 = j7;
                    long j18 = j6;
                    i16 = i14;
                    mia.b(str, ir9.c(aVar, 0.85f).H(new beb()), j8, 0L, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04(), bj4VarO, ((i14 >> 6) & 14) | ((i14 >> 15) & 896) | (3670016 & i14), 0, 131000);
                    bj4Var = bj4VarO;
                    bj4Var.K(2120583720);
                    if (z) {
                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, bj4Var, 0), nr1.f(bj4Var, com.hwpo_training_app.R.string.selected), ir9.j(aVar, 24.0f).H(new beb()), j8, bj4Var, ((i16 >> 12) & 7168) | 8, 0);
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    f5 = f4;
                    j9 = j8;
                    ob4Var4 = ob4Var3;
                    j10 = j17;
                    j4 = j18;
                    oh4Var2 = oh4Var3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var5 = oh4Var2;
                    final long j19 = j4;
                    final long j110 = j9;
                    xj8VarW.d = new ci4() { // from class: nc1
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$5(z, oh4Var5, str, j10, f5, j19, ob4Var4, j110, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    f2 = f;
                    if (bj4VarO.g(f2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    i3 |= 196608;
                    j4 = j2;
                } else {
                    j4 = j2;
                    if ((i & 196608) == 0) {
                        if (bj4VarO.i(j4)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                    ob4Var2 = ob4Var;
                } else {
                    ob4Var2 = ob4Var;
                    if ((i & 1572864) == 0) {
                        if (bj4VarO.J(ob4Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                }
                if ((i & 12582912) != 0) {
                    i3 |= ((i2 & 128) == 0 || !bj4VarO.i(j3)) ? 4194304 : 8388608;
                }
                if ((i3 & 4793491) == 4793490) {
                    bj4VarO.v0();
                    i13 = i & 1;
                    c0187a = jt1.a.a;
                    if (i13 != 0) {
                        if (i17 != 0) {
                            bj4VarO.K(-8602219);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new lc1();
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var2 = (oh4) objF;
                        }
                        if (i5 != 0) {
                            j5 = uh1.b;
                        } else {
                            j5 = j;
                        }
                        if (i7 != 0) {
                            f2 = 1.0f;
                        }
                        if (i9 != 0) {
                            j6 = uh1.e;
                        } else {
                            j6 = j4;
                        }
                        if (i11 != 0) {
                            ob4Var2 = ob4.y;
                        }
                        if ((i2 & 128) != 0) {
                            float f17 = f2;
                            i14 = i3 & (-29360129);
                            f3 = f17;
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                        } else {
                            float f18 = f2;
                            i14 = i3;
                            f3 = f18;
                            jM833generateTextColor8_81llA = j3;
                        }
                        j7 = j5;
                    } else {
                        if (i17 != 0) {
                            bj4VarO.K(-8602219);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new lc1();
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var2 = (oh4) objF;
                        }
                        if (i5 != 0) {
                            j5 = uh1.b;
                        } else {
                            j5 = j;
                        }
                        if (i7 != 0) {
                            f2 = 1.0f;
                        }
                        if (i9 != 0) {
                            j6 = uh1.e;
                        } else {
                            j6 = j4;
                        }
                        if (i11 != 0) {
                            ob4Var2 = ob4.y;
                        }
                        if ((i2 & 128) != 0) {
                            float f19 = f2;
                            i14 = i3 & (-29360129);
                            f3 = f19;
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                        } else {
                            float f110 = f2;
                            i14 = i3;
                            f3 = f110;
                            jM833generateTextColor8_81llA = j3;
                        }
                        j7 = j5;
                    }
                    bj4VarO.V();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i15 = IntercomTheme.$stable;
                    b72 b72Var4 = intercomTheme.getShapes(bj4VarO, i15).b;
                    ob4Var3 = ob4Var2;
                    aVar = ox6.a.t;
                    j8 = jM833generateTextColor8_81llA;
                    ox6 ox6VarC8 = ir9.c(aVar, 1.0f);
                    vs0 vs0VarB4 = ws0.b(f3, j7);
                    f4 = f3;
                    ox6 ox6VarC9 = gi0.c(uma.a(ns0.b(ox6VarC8, vs0VarB4.a, vs0VarB4.b, b72Var4), b72Var4), j6, al8.a);
                    bj4VarO.K(-8583674);
                    if ((i14 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((i14 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z2 | z3;
                    objF2 = bj4VarO.f();
                    if (z4) {
                        objF2 = new mh4() { // from class: mc1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: mc1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarI4 = eo7.i(we1.c(ox6VarC9, false, null, (mh4) objF2, 15), 16.0f);
                    ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarI4);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    oh4Var3 = oh4Var2;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    long j111 = j7;
                    long j112 = j6;
                    i16 = i14;
                    mia.b(str, ir9.c(aVar, 0.85f).H(new beb()), j8, 0L, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04(), bj4VarO, ((i14 >> 6) & 14) | ((i14 >> 15) & 896) | (3670016 & i14), 0, 131000);
                    bj4Var = bj4VarO;
                    bj4Var.K(2120583720);
                    if (z) {
                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, bj4Var, 0), nr1.f(bj4Var, com.hwpo_training_app.R.string.selected), ir9.j(aVar, 24.0f).H(new beb()), j8, bj4Var, ((i16 >> 12) & 7168) | 8, 0);
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    f5 = f4;
                    j9 = j8;
                    ob4Var4 = ob4Var3;
                    j10 = j111;
                    j4 = j112;
                    oh4Var2 = oh4Var3;
                } else {
                    bj4VarO.v0();
                    i13 = i & 1;
                    c0187a = jt1.a.a;
                    if (i13 != 0) {
                        if (i17 != 0) {
                            bj4VarO.K(-8602219);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new lc1();
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var2 = (oh4) objF;
                        }
                        if (i5 != 0) {
                            j5 = uh1.b;
                        } else {
                            j5 = j;
                        }
                        if (i7 != 0) {
                            f2 = 1.0f;
                        }
                        if (i9 != 0) {
                            j6 = uh1.e;
                        } else {
                            j6 = j4;
                        }
                        if (i11 != 0) {
                            ob4Var2 = ob4.y;
                        }
                        if ((i2 & 128) != 0) {
                            float f111 = f2;
                            i14 = i3 & (-29360129);
                            f3 = f111;
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                        } else {
                            float f112 = f2;
                            i14 = i3;
                            f3 = f112;
                            jM833generateTextColor8_81llA = j3;
                        }
                        j7 = j5;
                    } else {
                        if (i17 != 0) {
                            bj4VarO.K(-8602219);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new lc1();
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var2 = (oh4) objF;
                        }
                        if (i5 != 0) {
                            j5 = uh1.b;
                        } else {
                            j5 = j;
                        }
                        if (i7 != 0) {
                            f2 = 1.0f;
                        }
                        if (i9 != 0) {
                            j6 = uh1.e;
                        } else {
                            j6 = j4;
                        }
                        if (i11 != 0) {
                            ob4Var2 = ob4.y;
                        }
                        if ((i2 & 128) != 0) {
                            float f113 = f2;
                            i14 = i3 & (-29360129);
                            f3 = f113;
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                        } else {
                            float f114 = f2;
                            i14 = i3;
                            f3 = f114;
                            jM833generateTextColor8_81llA = j3;
                        }
                        j7 = j5;
                    }
                    bj4VarO.V();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i15 = IntercomTheme.$stable;
                    b72 b72Var5 = intercomTheme.getShapes(bj4VarO, i15).b;
                    ob4Var3 = ob4Var2;
                    aVar = ox6.a.t;
                    j8 = jM833generateTextColor8_81llA;
                    ox6 ox6VarC10 = ir9.c(aVar, 1.0f);
                    vs0 vs0VarB5 = ws0.b(f3, j7);
                    f4 = f3;
                    ox6 ox6VarC11 = gi0.c(uma.a(ns0.b(ox6VarC10, vs0VarB5.a, vs0VarB5.b, b72Var5), b72Var5), j6, al8.a);
                    bj4VarO.K(-8583674);
                    if ((i14 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((i14 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z2 | z3;
                    objF2 = bj4VarO.f();
                    if (z4) {
                        objF2 = new mh4() { // from class: mc1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: mc1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarI5 = eo7.i(we1.c(ox6VarC11, false, null, (mh4) objF2, 15), 16.0f);
                    ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarI5);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    oh4Var3 = oh4Var2;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    long j113 = j7;
                    long j114 = j6;
                    i16 = i14;
                    mia.b(str, ir9.c(aVar, 0.85f).H(new beb()), j8, 0L, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04(), bj4VarO, ((i14 >> 6) & 14) | ((i14 >> 15) & 896) | (3670016 & i14), 0, 131000);
                    bj4Var = bj4VarO;
                    bj4Var.K(2120583720);
                    if (z) {
                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, bj4Var, 0), nr1.f(bj4Var, com.hwpo_training_app.R.string.selected), ir9.j(aVar, 24.0f).H(new beb()), j8, bj4Var, ((i16 >> 12) & 7168) | 8, 0);
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    f5 = f4;
                    j9 = j8;
                    ob4Var4 = ob4Var3;
                    j10 = j113;
                    j4 = j114;
                    oh4Var2 = oh4Var3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var6 = oh4Var2;
                    final long j115 = j4;
                    final long j116 = j9;
                    xj8VarW.d = new ci4() { // from class: nc1
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$5(z, oh4Var6, str, j10, f5, j115, ob4Var4, j116, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            f2 = f;
            i9 = i2 & 32;
            if (i9 != 0) {
                i3 |= 196608;
                j4 = j2;
            } else {
                j4 = j2;
                if ((i & 196608) == 0) {
                    if (bj4VarO.i(j4)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                i3 |= 1572864;
                ob4Var2 = ob4Var;
            } else {
                ob4Var2 = ob4Var;
                if ((i & 1572864) == 0) {
                    if (bj4VarO.J(ob4Var2)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
            }
            if ((i & 12582912) != 0) {
                i3 |= ((i2 & 128) == 0 || !bj4VarO.i(j3)) ? 4194304 : 8388608;
            }
            if ((i3 & 4793491) == 4793490) {
                bj4VarO.v0();
                i13 = i & 1;
                c0187a = jt1.a.a;
                if (i13 != 0) {
                    if (i17 != 0) {
                        bj4VarO.K(-8602219);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new lc1();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var2 = (oh4) objF;
                    }
                    if (i5 != 0) {
                        j5 = uh1.b;
                    } else {
                        j5 = j;
                    }
                    if (i7 != 0) {
                        f2 = 1.0f;
                    }
                    if (i9 != 0) {
                        j6 = uh1.e;
                    } else {
                        j6 = j4;
                    }
                    if (i11 != 0) {
                        ob4Var2 = ob4.y;
                    }
                    if ((i2 & 128) != 0) {
                        float f115 = f2;
                        i14 = i3 & (-29360129);
                        f3 = f115;
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                    } else {
                        float f116 = f2;
                        i14 = i3;
                        f3 = f116;
                        jM833generateTextColor8_81llA = j3;
                    }
                    j7 = j5;
                } else {
                    if (i17 != 0) {
                        bj4VarO.K(-8602219);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new lc1();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var2 = (oh4) objF;
                    }
                    if (i5 != 0) {
                        j5 = uh1.b;
                    } else {
                        j5 = j;
                    }
                    if (i7 != 0) {
                        f2 = 1.0f;
                    }
                    if (i9 != 0) {
                        j6 = uh1.e;
                    } else {
                        j6 = j4;
                    }
                    if (i11 != 0) {
                        ob4Var2 = ob4.y;
                    }
                    if ((i2 & 128) != 0) {
                        float f117 = f2;
                        i14 = i3 & (-29360129);
                        f3 = f117;
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                    } else {
                        float f118 = f2;
                        i14 = i3;
                        f3 = f118;
                        jM833generateTextColor8_81llA = j3;
                    }
                    j7 = j5;
                }
                bj4VarO.V();
                intercomTheme = IntercomTheme.INSTANCE;
                i15 = IntercomTheme.$stable;
                b72 b72Var6 = intercomTheme.getShapes(bj4VarO, i15).b;
                ob4Var3 = ob4Var2;
                aVar = ox6.a.t;
                j8 = jM833generateTextColor8_81llA;
                ox6 ox6VarC12 = ir9.c(aVar, 1.0f);
                vs0 vs0VarB6 = ws0.b(f3, j7);
                f4 = f3;
                ox6 ox6VarC13 = gi0.c(uma.a(ns0.b(ox6VarC12, vs0VarB6.a, vs0VarB6.b, b72Var6), b72Var6), j6, al8.a);
                bj4VarO.K(-8583674);
                if ((i14 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i14 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z2 | z3;
                objF2 = bj4VarO.f();
                if (z4) {
                    objF2 = new mh4() { // from class: mc1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: mc1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarI6 = eo7.i(we1.c(ox6VarC13, false, null, (mh4) objF2, 15), 16.0f);
                ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarI6);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                oh4Var3 = oh4Var2;
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                long j117 = j7;
                long j118 = j6;
                i16 = i14;
                mia.b(str, ir9.c(aVar, 0.85f).H(new beb()), j8, 0L, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04(), bj4VarO, ((i14 >> 6) & 14) | ((i14 >> 15) & 896) | (3670016 & i14), 0, 131000);
                bj4Var = bj4VarO;
                bj4Var.K(2120583720);
                if (z) {
                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, bj4Var, 0), nr1.f(bj4Var, com.hwpo_training_app.R.string.selected), ir9.j(aVar, 24.0f).H(new beb()), j8, bj4Var, ((i16 >> 12) & 7168) | 8, 0);
                }
                bj4Var.U(false);
                bj4Var.U(true);
                f5 = f4;
                j9 = j8;
                ob4Var4 = ob4Var3;
                j10 = j117;
                j4 = j118;
                oh4Var2 = oh4Var3;
            } else {
                bj4VarO.v0();
                i13 = i & 1;
                c0187a = jt1.a.a;
                if (i13 != 0) {
                    if (i17 != 0) {
                        bj4VarO.K(-8602219);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new lc1();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var2 = (oh4) objF;
                    }
                    if (i5 != 0) {
                        j5 = uh1.b;
                    } else {
                        j5 = j;
                    }
                    if (i7 != 0) {
                        f2 = 1.0f;
                    }
                    if (i9 != 0) {
                        j6 = uh1.e;
                    } else {
                        j6 = j4;
                    }
                    if (i11 != 0) {
                        ob4Var2 = ob4.y;
                    }
                    if ((i2 & 128) != 0) {
                        float f119 = f2;
                        i14 = i3 & (-29360129);
                        f3 = f119;
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                    } else {
                        float f1110 = f2;
                        i14 = i3;
                        f3 = f1110;
                        jM833generateTextColor8_81llA = j3;
                    }
                    j7 = j5;
                } else {
                    if (i17 != 0) {
                        bj4VarO.K(-8602219);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new lc1();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var2 = (oh4) objF;
                    }
                    if (i5 != 0) {
                        j5 = uh1.b;
                    } else {
                        j5 = j;
                    }
                    if (i7 != 0) {
                        f2 = 1.0f;
                    }
                    if (i9 != 0) {
                        j6 = uh1.e;
                    } else {
                        j6 = j4;
                    }
                    if (i11 != 0) {
                        ob4Var2 = ob4.y;
                    }
                    if ((i2 & 128) != 0) {
                        float f1111 = f2;
                        i14 = i3 & (-29360129);
                        f3 = f1111;
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                    } else {
                        float f1112 = f2;
                        i14 = i3;
                        f3 = f1112;
                        jM833generateTextColor8_81llA = j3;
                    }
                    j7 = j5;
                }
                bj4VarO.V();
                intercomTheme = IntercomTheme.INSTANCE;
                i15 = IntercomTheme.$stable;
                b72 b72Var7 = intercomTheme.getShapes(bj4VarO, i15).b;
                ob4Var3 = ob4Var2;
                aVar = ox6.a.t;
                j8 = jM833generateTextColor8_81llA;
                ox6 ox6VarC14 = ir9.c(aVar, 1.0f);
                vs0 vs0VarB7 = ws0.b(f3, j7);
                f4 = f3;
                ox6 ox6VarC15 = gi0.c(uma.a(ns0.b(ox6VarC14, vs0VarB7.a, vs0VarB7.b, b72Var7), b72Var7), j6, al8.a);
                bj4VarO.K(-8583674);
                if ((i14 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i14 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z2 | z3;
                objF2 = bj4VarO.f();
                if (z4) {
                    objF2 = new mh4() { // from class: mc1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: mc1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarI7 = eo7.i(we1.c(ox6VarC15, false, null, (mh4) objF2, 15), 16.0f);
                ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarI7);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                oh4Var3 = oh4Var2;
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                long j119 = j7;
                long j1110 = j6;
                i16 = i14;
                mia.b(str, ir9.c(aVar, 0.85f).H(new beb()), j8, 0L, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04(), bj4VarO, ((i14 >> 6) & 14) | ((i14 >> 15) & 896) | (3670016 & i14), 0, 131000);
                bj4Var = bj4VarO;
                bj4Var.K(2120583720);
                if (z) {
                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, bj4Var, 0), nr1.f(bj4Var, com.hwpo_training_app.R.string.selected), ir9.j(aVar, 24.0f).H(new beb()), j8, bj4Var, ((i16 >> 12) & 7168) | 8, 0);
                }
                bj4Var.U(false);
                bj4Var.U(true);
                f5 = f4;
                j9 = j8;
                ob4Var4 = ob4Var3;
                j10 = j119;
                j4 = j1110;
                oh4Var2 = oh4Var3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final oh4 oh4Var7 = oh4Var2;
                final long j1111 = j4;
                final long j1112 = j9;
                xj8VarW.d = new ci4() { // from class: nc1
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$5(z, oh4Var7, str, j10, f5, j1111, ob4Var4, j1112, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        oh4Var2 = oh4Var;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (bj4VarO.J(str)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        i5 = i2 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                if (bj4VarO.i(j)) {
                    i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    f2 = f;
                    if (bj4VarO.g(f2)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    i3 |= 196608;
                    j4 = j2;
                } else {
                    j4 = j2;
                    if ((i & 196608) == 0) {
                        if (bj4VarO.i(j4)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                    ob4Var2 = ob4Var;
                } else {
                    ob4Var2 = ob4Var;
                    if ((i & 1572864) == 0) {
                        if (bj4VarO.J(ob4Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                }
                if ((i & 12582912) != 0) {
                    i3 |= ((i2 & 128) == 0 || !bj4VarO.i(j3)) ? 4194304 : 8388608;
                }
                if ((i3 & 4793491) == 4793490) {
                    bj4VarO.v0();
                    i13 = i & 1;
                    c0187a = jt1.a.a;
                    if (i13 != 0) {
                        if (i17 != 0) {
                            bj4VarO.K(-8602219);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new lc1();
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var2 = (oh4) objF;
                        }
                        if (i5 != 0) {
                            j5 = uh1.b;
                        } else {
                            j5 = j;
                        }
                        if (i7 != 0) {
                            f2 = 1.0f;
                        }
                        if (i9 != 0) {
                            j6 = uh1.e;
                        } else {
                            j6 = j4;
                        }
                        if (i11 != 0) {
                            ob4Var2 = ob4.y;
                        }
                        if ((i2 & 128) != 0) {
                            float f1113 = f2;
                            i14 = i3 & (-29360129);
                            f3 = f1113;
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                        } else {
                            float f1114 = f2;
                            i14 = i3;
                            f3 = f1114;
                            jM833generateTextColor8_81llA = j3;
                        }
                        j7 = j5;
                    } else {
                        if (i17 != 0) {
                            bj4VarO.K(-8602219);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new lc1();
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var2 = (oh4) objF;
                        }
                        if (i5 != 0) {
                            j5 = uh1.b;
                        } else {
                            j5 = j;
                        }
                        if (i7 != 0) {
                            f2 = 1.0f;
                        }
                        if (i9 != 0) {
                            j6 = uh1.e;
                        } else {
                            j6 = j4;
                        }
                        if (i11 != 0) {
                            ob4Var2 = ob4.y;
                        }
                        if ((i2 & 128) != 0) {
                            float f1115 = f2;
                            i14 = i3 & (-29360129);
                            f3 = f1115;
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                        } else {
                            float f1116 = f2;
                            i14 = i3;
                            f3 = f1116;
                            jM833generateTextColor8_81llA = j3;
                        }
                        j7 = j5;
                    }
                    bj4VarO.V();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i15 = IntercomTheme.$stable;
                    b72 b72Var8 = intercomTheme.getShapes(bj4VarO, i15).b;
                    ob4Var3 = ob4Var2;
                    aVar = ox6.a.t;
                    j8 = jM833generateTextColor8_81llA;
                    ox6 ox6VarC16 = ir9.c(aVar, 1.0f);
                    vs0 vs0VarB8 = ws0.b(f3, j7);
                    f4 = f3;
                    ox6 ox6VarC17 = gi0.c(uma.a(ns0.b(ox6VarC16, vs0VarB8.a, vs0VarB8.b, b72Var8), b72Var8), j6, al8.a);
                    bj4VarO.K(-8583674);
                    if ((i14 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((i14 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z2 | z3;
                    objF2 = bj4VarO.f();
                    if (z4) {
                        objF2 = new mh4() { // from class: mc1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: mc1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarI8 = eo7.i(we1.c(ox6VarC17, false, null, (mh4) objF2, 15), 16.0f);
                    ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarI8);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    oh4Var3 = oh4Var2;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    long j1113 = j7;
                    long j1114 = j6;
                    i16 = i14;
                    mia.b(str, ir9.c(aVar, 0.85f).H(new beb()), j8, 0L, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04(), bj4VarO, ((i14 >> 6) & 14) | ((i14 >> 15) & 896) | (3670016 & i14), 0, 131000);
                    bj4Var = bj4VarO;
                    bj4Var.K(2120583720);
                    if (z) {
                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, bj4Var, 0), nr1.f(bj4Var, com.hwpo_training_app.R.string.selected), ir9.j(aVar, 24.0f).H(new beb()), j8, bj4Var, ((i16 >> 12) & 7168) | 8, 0);
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    f5 = f4;
                    j9 = j8;
                    ob4Var4 = ob4Var3;
                    j10 = j1113;
                    j4 = j1114;
                    oh4Var2 = oh4Var3;
                } else {
                    bj4VarO.v0();
                    i13 = i & 1;
                    c0187a = jt1.a.a;
                    if (i13 != 0) {
                        if (i17 != 0) {
                            bj4VarO.K(-8602219);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new lc1();
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var2 = (oh4) objF;
                        }
                        if (i5 != 0) {
                            j5 = uh1.b;
                        } else {
                            j5 = j;
                        }
                        if (i7 != 0) {
                            f2 = 1.0f;
                        }
                        if (i9 != 0) {
                            j6 = uh1.e;
                        } else {
                            j6 = j4;
                        }
                        if (i11 != 0) {
                            ob4Var2 = ob4.y;
                        }
                        if ((i2 & 128) != 0) {
                            float f1117 = f2;
                            i14 = i3 & (-29360129);
                            f3 = f1117;
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                        } else {
                            float f1118 = f2;
                            i14 = i3;
                            f3 = f1118;
                            jM833generateTextColor8_81llA = j3;
                        }
                        j7 = j5;
                    } else {
                        if (i17 != 0) {
                            bj4VarO.K(-8602219);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new lc1();
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var2 = (oh4) objF;
                        }
                        if (i5 != 0) {
                            j5 = uh1.b;
                        } else {
                            j5 = j;
                        }
                        if (i7 != 0) {
                            f2 = 1.0f;
                        }
                        if (i9 != 0) {
                            j6 = uh1.e;
                        } else {
                            j6 = j4;
                        }
                        if (i11 != 0) {
                            ob4Var2 = ob4.y;
                        }
                        if ((i2 & 128) != 0) {
                            float f1119 = f2;
                            i14 = i3 & (-29360129);
                            f3 = f1119;
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                        } else {
                            float f11110 = f2;
                            i14 = i3;
                            f3 = f11110;
                            jM833generateTextColor8_81llA = j3;
                        }
                        j7 = j5;
                    }
                    bj4VarO.V();
                    intercomTheme = IntercomTheme.INSTANCE;
                    i15 = IntercomTheme.$stable;
                    b72 b72Var9 = intercomTheme.getShapes(bj4VarO, i15).b;
                    ob4Var3 = ob4Var2;
                    aVar = ox6.a.t;
                    j8 = jM833generateTextColor8_81llA;
                    ox6 ox6VarC18 = ir9.c(aVar, 1.0f);
                    vs0 vs0VarB9 = ws0.b(f3, j7);
                    f4 = f3;
                    ox6 ox6VarC19 = gi0.c(uma.a(ns0.b(ox6VarC18, vs0VarB9.a, vs0VarB9.b, b72Var9), b72Var9), j6, al8.a);
                    bj4VarO.K(-8583674);
                    if ((i14 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((i14 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z2 | z3;
                    objF2 = bj4VarO.f();
                    if (z4) {
                        objF2 = new mh4() { // from class: mc1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: mc1
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarI9 = eo7.i(we1.c(ox6VarC19, false, null, (mh4) objF2, 15), 16.0f);
                    ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarI9);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    oh4Var3 = oh4Var2;
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    long j1115 = j7;
                    long j1116 = j6;
                    i16 = i14;
                    mia.b(str, ir9.c(aVar, 0.85f).H(new beb()), j8, 0L, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04(), bj4VarO, ((i14 >> 6) & 14) | ((i14 >> 15) & 896) | (3670016 & i14), 0, 131000);
                    bj4Var = bj4VarO;
                    bj4Var.K(2120583720);
                    if (z) {
                        m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, bj4Var, 0), nr1.f(bj4Var, com.hwpo_training_app.R.string.selected), ir9.j(aVar, 24.0f).H(new beb()), j8, bj4Var, ((i16 >> 12) & 7168) | 8, 0);
                    }
                    bj4Var.U(false);
                    bj4Var.U(true);
                    f5 = f4;
                    j9 = j8;
                    ob4Var4 = ob4Var3;
                    j10 = j1115;
                    j4 = j1116;
                    oh4Var2 = oh4Var3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    final oh4 oh4Var8 = oh4Var2;
                    final long j1117 = j4;
                    final long j1118 = j9;
                    xj8VarW.d = new ci4() { // from class: nc1
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$5(z, oh4Var8, str, j10, f5, j1117, ob4Var4, j1118, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            f2 = f;
            i9 = i2 & 32;
            if (i9 != 0) {
                i3 |= 196608;
                j4 = j2;
            } else {
                j4 = j2;
                if ((i & 196608) == 0) {
                    if (bj4VarO.i(j4)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                i3 |= 1572864;
                ob4Var2 = ob4Var;
            } else {
                ob4Var2 = ob4Var;
                if ((i & 1572864) == 0) {
                    if (bj4VarO.J(ob4Var2)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
            }
            if ((i & 12582912) != 0) {
                i3 |= ((i2 & 128) == 0 || !bj4VarO.i(j3)) ? 4194304 : 8388608;
            }
            if ((i3 & 4793491) == 4793490) {
                bj4VarO.v0();
                i13 = i & 1;
                c0187a = jt1.a.a;
                if (i13 != 0) {
                    if (i17 != 0) {
                        bj4VarO.K(-8602219);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new lc1();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var2 = (oh4) objF;
                    }
                    if (i5 != 0) {
                        j5 = uh1.b;
                    } else {
                        j5 = j;
                    }
                    if (i7 != 0) {
                        f2 = 1.0f;
                    }
                    if (i9 != 0) {
                        j6 = uh1.e;
                    } else {
                        j6 = j4;
                    }
                    if (i11 != 0) {
                        ob4Var2 = ob4.y;
                    }
                    if ((i2 & 128) != 0) {
                        float f11111 = f2;
                        i14 = i3 & (-29360129);
                        f3 = f11111;
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                    } else {
                        float f11112 = f2;
                        i14 = i3;
                        f3 = f11112;
                        jM833generateTextColor8_81llA = j3;
                    }
                    j7 = j5;
                } else {
                    if (i17 != 0) {
                        bj4VarO.K(-8602219);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new lc1();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var2 = (oh4) objF;
                    }
                    if (i5 != 0) {
                        j5 = uh1.b;
                    } else {
                        j5 = j;
                    }
                    if (i7 != 0) {
                        f2 = 1.0f;
                    }
                    if (i9 != 0) {
                        j6 = uh1.e;
                    } else {
                        j6 = j4;
                    }
                    if (i11 != 0) {
                        ob4Var2 = ob4.y;
                    }
                    if ((i2 & 128) != 0) {
                        float f11113 = f2;
                        i14 = i3 & (-29360129);
                        f3 = f11113;
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                    } else {
                        float f11114 = f2;
                        i14 = i3;
                        f3 = f11114;
                        jM833generateTextColor8_81llA = j3;
                    }
                    j7 = j5;
                }
                bj4VarO.V();
                intercomTheme = IntercomTheme.INSTANCE;
                i15 = IntercomTheme.$stable;
                b72 b72Var10 = intercomTheme.getShapes(bj4VarO, i15).b;
                ob4Var3 = ob4Var2;
                aVar = ox6.a.t;
                j8 = jM833generateTextColor8_81llA;
                ox6 ox6VarC110 = ir9.c(aVar, 1.0f);
                vs0 vs0VarB10 = ws0.b(f3, j7);
                f4 = f3;
                ox6 ox6VarC111 = gi0.c(uma.a(ns0.b(ox6VarC110, vs0VarB10.a, vs0VarB10.b, b72Var10), b72Var10), j6, al8.a);
                bj4VarO.K(-8583674);
                if ((i14 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i14 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z2 | z3;
                objF2 = bj4VarO.f();
                if (z4) {
                    objF2 = new mh4() { // from class: mc1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: mc1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarI10 = eo7.i(we1.c(ox6VarC111, false, null, (mh4) objF2, 15), 16.0f);
                ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarI10);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                oh4Var3 = oh4Var2;
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                long j1119 = j7;
                long j11110 = j6;
                i16 = i14;
                mia.b(str, ir9.c(aVar, 0.85f).H(new beb()), j8, 0L, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04(), bj4VarO, ((i14 >> 6) & 14) | ((i14 >> 15) & 896) | (3670016 & i14), 0, 131000);
                bj4Var = bj4VarO;
                bj4Var.K(2120583720);
                if (z) {
                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, bj4Var, 0), nr1.f(bj4Var, com.hwpo_training_app.R.string.selected), ir9.j(aVar, 24.0f).H(new beb()), j8, bj4Var, ((i16 >> 12) & 7168) | 8, 0);
                }
                bj4Var.U(false);
                bj4Var.U(true);
                f5 = f4;
                j9 = j8;
                ob4Var4 = ob4Var3;
                j10 = j1119;
                j4 = j11110;
                oh4Var2 = oh4Var3;
            } else {
                bj4VarO.v0();
                i13 = i & 1;
                c0187a = jt1.a.a;
                if (i13 != 0) {
                    if (i17 != 0) {
                        bj4VarO.K(-8602219);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new lc1();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var2 = (oh4) objF;
                    }
                    if (i5 != 0) {
                        j5 = uh1.b;
                    } else {
                        j5 = j;
                    }
                    if (i7 != 0) {
                        f2 = 1.0f;
                    }
                    if (i9 != 0) {
                        j6 = uh1.e;
                    } else {
                        j6 = j4;
                    }
                    if (i11 != 0) {
                        ob4Var2 = ob4.y;
                    }
                    if ((i2 & 128) != 0) {
                        float f11115 = f2;
                        i14 = i3 & (-29360129);
                        f3 = f11115;
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                    } else {
                        float f11116 = f2;
                        i14 = i3;
                        f3 = f11116;
                        jM833generateTextColor8_81llA = j3;
                    }
                    j7 = j5;
                } else {
                    if (i17 != 0) {
                        bj4VarO.K(-8602219);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new lc1();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var2 = (oh4) objF;
                    }
                    if (i5 != 0) {
                        j5 = uh1.b;
                    } else {
                        j5 = j;
                    }
                    if (i7 != 0) {
                        f2 = 1.0f;
                    }
                    if (i9 != 0) {
                        j6 = uh1.e;
                    } else {
                        j6 = j4;
                    }
                    if (i11 != 0) {
                        ob4Var2 = ob4.y;
                    }
                    if ((i2 & 128) != 0) {
                        float f11117 = f2;
                        i14 = i3 & (-29360129);
                        f3 = f11117;
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                    } else {
                        float f11118 = f2;
                        i14 = i3;
                        f3 = f11118;
                        jM833generateTextColor8_81llA = j3;
                    }
                    j7 = j5;
                }
                bj4VarO.V();
                intercomTheme = IntercomTheme.INSTANCE;
                i15 = IntercomTheme.$stable;
                b72 b72Var11 = intercomTheme.getShapes(bj4VarO, i15).b;
                ob4Var3 = ob4Var2;
                aVar = ox6.a.t;
                j8 = jM833generateTextColor8_81llA;
                ox6 ox6VarC112 = ir9.c(aVar, 1.0f);
                vs0 vs0VarB11 = ws0.b(f3, j7);
                f4 = f3;
                ox6 ox6VarC113 = gi0.c(uma.a(ns0.b(ox6VarC112, vs0VarB11.a, vs0VarB11.b, b72Var11), b72Var11), j6, al8.a);
                bj4VarO.K(-8583674);
                if ((i14 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i14 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z2 | z3;
                objF2 = bj4VarO.f();
                if (z4) {
                    objF2 = new mh4() { // from class: mc1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: mc1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarI11 = eo7.i(we1.c(ox6VarC113, false, null, (mh4) objF2, 15), 16.0f);
                ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarI11);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                oh4Var3 = oh4Var2;
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                long j11111 = j7;
                long j11112 = j6;
                i16 = i14;
                mia.b(str, ir9.c(aVar, 0.85f).H(new beb()), j8, 0L, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04(), bj4VarO, ((i14 >> 6) & 14) | ((i14 >> 15) & 896) | (3670016 & i14), 0, 131000);
                bj4Var = bj4VarO;
                bj4Var.K(2120583720);
                if (z) {
                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, bj4Var, 0), nr1.f(bj4Var, com.hwpo_training_app.R.string.selected), ir9.j(aVar, 24.0f).H(new beb()), j8, bj4Var, ((i16 >> 12) & 7168) | 8, 0);
                }
                bj4Var.U(false);
                bj4Var.U(true);
                f5 = f4;
                j9 = j8;
                ob4Var4 = ob4Var3;
                j10 = j11111;
                j4 = j11112;
                oh4Var2 = oh4Var3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final oh4 oh4Var9 = oh4Var2;
                final long j11113 = j4;
                final long j11114 = j9;
                xj8VarW.d = new ci4() { // from class: nc1
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$5(z, oh4Var9, str, j10, f5, j11113, ob4Var4, j11114, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        i7 = i2 & 16;
        if (i7 != 0) {
            if ((i & 24576) == 0) {
                f2 = f;
                if (bj4VarO.g(f2)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            i9 = i2 & 32;
            if (i9 != 0) {
                i3 |= 196608;
                j4 = j2;
            } else {
                j4 = j2;
                if ((i & 196608) == 0) {
                    if (bj4VarO.i(j4)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                i3 |= 1572864;
                ob4Var2 = ob4Var;
            } else {
                ob4Var2 = ob4Var;
                if ((i & 1572864) == 0) {
                    if (bj4VarO.J(ob4Var2)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
            }
            if ((i & 12582912) != 0) {
                i3 |= ((i2 & 128) == 0 || !bj4VarO.i(j3)) ? 4194304 : 8388608;
            }
            if ((i3 & 4793491) == 4793490) {
                bj4VarO.v0();
                i13 = i & 1;
                c0187a = jt1.a.a;
                if (i13 != 0) {
                    if (i17 != 0) {
                        bj4VarO.K(-8602219);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new lc1();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var2 = (oh4) objF;
                    }
                    if (i5 != 0) {
                        j5 = uh1.b;
                    } else {
                        j5 = j;
                    }
                    if (i7 != 0) {
                        f2 = 1.0f;
                    }
                    if (i9 != 0) {
                        j6 = uh1.e;
                    } else {
                        j6 = j4;
                    }
                    if (i11 != 0) {
                        ob4Var2 = ob4.y;
                    }
                    if ((i2 & 128) != 0) {
                        float f11119 = f2;
                        i14 = i3 & (-29360129);
                        f3 = f11119;
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                    } else {
                        float f111110 = f2;
                        i14 = i3;
                        f3 = f111110;
                        jM833generateTextColor8_81llA = j3;
                    }
                    j7 = j5;
                } else {
                    if (i17 != 0) {
                        bj4VarO.K(-8602219);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new lc1();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var2 = (oh4) objF;
                    }
                    if (i5 != 0) {
                        j5 = uh1.b;
                    } else {
                        j5 = j;
                    }
                    if (i7 != 0) {
                        f2 = 1.0f;
                    }
                    if (i9 != 0) {
                        j6 = uh1.e;
                    } else {
                        j6 = j4;
                    }
                    if (i11 != 0) {
                        ob4Var2 = ob4.y;
                    }
                    if ((i2 & 128) != 0) {
                        float f111111 = f2;
                        i14 = i3 & (-29360129);
                        f3 = f111111;
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                    } else {
                        float f111112 = f2;
                        i14 = i3;
                        f3 = f111112;
                        jM833generateTextColor8_81llA = j3;
                    }
                    j7 = j5;
                }
                bj4VarO.V();
                intercomTheme = IntercomTheme.INSTANCE;
                i15 = IntercomTheme.$stable;
                b72 b72Var12 = intercomTheme.getShapes(bj4VarO, i15).b;
                ob4Var3 = ob4Var2;
                aVar = ox6.a.t;
                j8 = jM833generateTextColor8_81llA;
                ox6 ox6VarC114 = ir9.c(aVar, 1.0f);
                vs0 vs0VarB12 = ws0.b(f3, j7);
                f4 = f3;
                ox6 ox6VarC115 = gi0.c(uma.a(ns0.b(ox6VarC114, vs0VarB12.a, vs0VarB12.b, b72Var12), b72Var12), j6, al8.a);
                bj4VarO.K(-8583674);
                if ((i14 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i14 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z2 | z3;
                objF2 = bj4VarO.f();
                if (z4) {
                    objF2 = new mh4() { // from class: mc1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: mc1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarI12 = eo7.i(we1.c(ox6VarC115, false, null, (mh4) objF2, 15), 16.0f);
                ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarI12);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                oh4Var3 = oh4Var2;
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                long j11115 = j7;
                long j11116 = j6;
                i16 = i14;
                mia.b(str, ir9.c(aVar, 0.85f).H(new beb()), j8, 0L, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04(), bj4VarO, ((i14 >> 6) & 14) | ((i14 >> 15) & 896) | (3670016 & i14), 0, 131000);
                bj4Var = bj4VarO;
                bj4Var.K(2120583720);
                if (z) {
                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, bj4Var, 0), nr1.f(bj4Var, com.hwpo_training_app.R.string.selected), ir9.j(aVar, 24.0f).H(new beb()), j8, bj4Var, ((i16 >> 12) & 7168) | 8, 0);
                }
                bj4Var.U(false);
                bj4Var.U(true);
                f5 = f4;
                j9 = j8;
                ob4Var4 = ob4Var3;
                j10 = j11115;
                j4 = j11116;
                oh4Var2 = oh4Var3;
            } else {
                bj4VarO.v0();
                i13 = i & 1;
                c0187a = jt1.a.a;
                if (i13 != 0) {
                    if (i17 != 0) {
                        bj4VarO.K(-8602219);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new lc1();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var2 = (oh4) objF;
                    }
                    if (i5 != 0) {
                        j5 = uh1.b;
                    } else {
                        j5 = j;
                    }
                    if (i7 != 0) {
                        f2 = 1.0f;
                    }
                    if (i9 != 0) {
                        j6 = uh1.e;
                    } else {
                        j6 = j4;
                    }
                    if (i11 != 0) {
                        ob4Var2 = ob4.y;
                    }
                    if ((i2 & 128) != 0) {
                        float f111113 = f2;
                        i14 = i3 & (-29360129);
                        f3 = f111113;
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                    } else {
                        float f111114 = f2;
                        i14 = i3;
                        f3 = f111114;
                        jM833generateTextColor8_81llA = j3;
                    }
                    j7 = j5;
                } else {
                    if (i17 != 0) {
                        bj4VarO.K(-8602219);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new lc1();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var2 = (oh4) objF;
                    }
                    if (i5 != 0) {
                        j5 = uh1.b;
                    } else {
                        j5 = j;
                    }
                    if (i7 != 0) {
                        f2 = 1.0f;
                    }
                    if (i9 != 0) {
                        j6 = uh1.e;
                    } else {
                        j6 = j4;
                    }
                    if (i11 != 0) {
                        ob4Var2 = ob4.y;
                    }
                    if ((i2 & 128) != 0) {
                        float f111115 = f2;
                        i14 = i3 & (-29360129);
                        f3 = f111115;
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                    } else {
                        float f111116 = f2;
                        i14 = i3;
                        f3 = f111116;
                        jM833generateTextColor8_81llA = j3;
                    }
                    j7 = j5;
                }
                bj4VarO.V();
                intercomTheme = IntercomTheme.INSTANCE;
                i15 = IntercomTheme.$stable;
                b72 b72Var13 = intercomTheme.getShapes(bj4VarO, i15).b;
                ob4Var3 = ob4Var2;
                aVar = ox6.a.t;
                j8 = jM833generateTextColor8_81llA;
                ox6 ox6VarC116 = ir9.c(aVar, 1.0f);
                vs0 vs0VarB13 = ws0.b(f3, j7);
                f4 = f3;
                ox6 ox6VarC117 = gi0.c(uma.a(ns0.b(ox6VarC116, vs0VarB13.a, vs0VarB13.b, b72Var13), b72Var13), j6, al8.a);
                bj4VarO.K(-8583674);
                if ((i14 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i14 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z2 | z3;
                objF2 = bj4VarO.f();
                if (z4) {
                    objF2 = new mh4() { // from class: mc1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: mc1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarI13 = eo7.i(we1.c(ox6VarC117, false, null, (mh4) objF2, 15), 16.0f);
                ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarI13);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                oh4Var3 = oh4Var2;
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                long j11117 = j7;
                long j11118 = j6;
                i16 = i14;
                mia.b(str, ir9.c(aVar, 0.85f).H(new beb()), j8, 0L, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04(), bj4VarO, ((i14 >> 6) & 14) | ((i14 >> 15) & 896) | (3670016 & i14), 0, 131000);
                bj4Var = bj4VarO;
                bj4Var.K(2120583720);
                if (z) {
                    m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, bj4Var, 0), nr1.f(bj4Var, com.hwpo_training_app.R.string.selected), ir9.j(aVar, 24.0f).H(new beb()), j8, bj4Var, ((i16 >> 12) & 7168) | 8, 0);
                }
                bj4Var.U(false);
                bj4Var.U(true);
                f5 = f4;
                j9 = j8;
                ob4Var4 = ob4Var3;
                j10 = j11117;
                j4 = j11118;
                oh4Var2 = oh4Var3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                final oh4 oh4Var10 = oh4Var2;
                final long j11119 = j4;
                final long j111110 = j9;
                xj8VarW.d = new ci4() { // from class: nc1
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$5(z, oh4Var10, str, j10, f5, j11119, ob4Var4, j111110, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        f2 = f;
        i9 = i2 & 32;
        if (i9 != 0) {
            i3 |= 196608;
            j4 = j2;
        } else {
            j4 = j2;
            if ((i & 196608) == 0) {
                if (bj4VarO.i(j4)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
        }
        i11 = i2 & 64;
        if (i11 != 0) {
            i3 |= 1572864;
            ob4Var2 = ob4Var;
        } else {
            ob4Var2 = ob4Var;
            if ((i & 1572864) == 0) {
                if (bj4VarO.J(ob4Var2)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
        }
        if ((i & 12582912) != 0) {
            i3 |= ((i2 & 128) == 0 || !bj4VarO.i(j3)) ? 4194304 : 8388608;
        }
        if ((i3 & 4793491) == 4793490) {
            bj4VarO.v0();
            i13 = i & 1;
            c0187a = jt1.a.a;
            if (i13 != 0) {
                if (i17 != 0) {
                    bj4VarO.K(-8602219);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new lc1();
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var2 = (oh4) objF;
                }
                if (i5 != 0) {
                    j5 = uh1.b;
                } else {
                    j5 = j;
                }
                if (i7 != 0) {
                    f2 = 1.0f;
                }
                if (i9 != 0) {
                    j6 = uh1.e;
                } else {
                    j6 = j4;
                }
                if (i11 != 0) {
                    ob4Var2 = ob4.y;
                }
                if ((i2 & 128) != 0) {
                    float f111117 = f2;
                    i14 = i3 & (-29360129);
                    f3 = f111117;
                    jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                } else {
                    float f111118 = f2;
                    i14 = i3;
                    f3 = f111118;
                    jM833generateTextColor8_81llA = j3;
                }
                j7 = j5;
            } else {
                if (i17 != 0) {
                    bj4VarO.K(-8602219);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new lc1();
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var2 = (oh4) objF;
                }
                if (i5 != 0) {
                    j5 = uh1.b;
                } else {
                    j5 = j;
                }
                if (i7 != 0) {
                    f2 = 1.0f;
                }
                if (i9 != 0) {
                    j6 = uh1.e;
                } else {
                    j6 = j4;
                }
                if (i11 != 0) {
                    ob4Var2 = ob4.y;
                }
                if ((i2 & 128) != 0) {
                    float f111119 = f2;
                    i14 = i3 & (-29360129);
                    f3 = f111119;
                    jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                } else {
                    float f1111110 = f2;
                    i14 = i3;
                    f3 = f1111110;
                    jM833generateTextColor8_81llA = j3;
                }
                j7 = j5;
            }
            bj4VarO.V();
            intercomTheme = IntercomTheme.INSTANCE;
            i15 = IntercomTheme.$stable;
            b72 b72Var14 = intercomTheme.getShapes(bj4VarO, i15).b;
            ob4Var3 = ob4Var2;
            aVar = ox6.a.t;
            j8 = jM833generateTextColor8_81llA;
            ox6 ox6VarC118 = ir9.c(aVar, 1.0f);
            vs0 vs0VarB14 = ws0.b(f3, j7);
            f4 = f3;
            ox6 ox6VarC119 = gi0.c(uma.a(ns0.b(ox6VarC118, vs0VarB14.a, vs0VarB14.b, b72Var14), b72Var14), j6, al8.a);
            bj4VarO.K(-8583674);
            if ((i14 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i14 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z2 | z3;
            objF2 = bj4VarO.f();
            if (z4) {
                objF2 = new mh4() { // from class: mc1
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new mh4() { // from class: mc1
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            ox6 ox6VarI14 = eo7.i(we1.c(ox6VarC119, false, null, (mh4) objF2, 15), 16.0f);
            ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarI14);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            oh4Var3 = oh4Var2;
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            long j111111 = j7;
            long j111112 = j6;
            i16 = i14;
            mia.b(str, ir9.c(aVar, 0.85f).H(new beb()), j8, 0L, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04(), bj4VarO, ((i14 >> 6) & 14) | ((i14 >> 15) & 896) | (3670016 & i14), 0, 131000);
            bj4Var = bj4VarO;
            bj4Var.K(2120583720);
            if (z) {
                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, bj4Var, 0), nr1.f(bj4Var, com.hwpo_training_app.R.string.selected), ir9.j(aVar, 24.0f).H(new beb()), j8, bj4Var, ((i16 >> 12) & 7168) | 8, 0);
            }
            bj4Var.U(false);
            bj4Var.U(true);
            f5 = f4;
            j9 = j8;
            ob4Var4 = ob4Var3;
            j10 = j111111;
            j4 = j111112;
            oh4Var2 = oh4Var3;
        } else {
            bj4VarO.v0();
            i13 = i & 1;
            c0187a = jt1.a.a;
            if (i13 != 0) {
                if (i17 != 0) {
                    bj4VarO.K(-8602219);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new lc1();
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var2 = (oh4) objF;
                }
                if (i5 != 0) {
                    j5 = uh1.b;
                } else {
                    j5 = j;
                }
                if (i7 != 0) {
                    f2 = 1.0f;
                }
                if (i9 != 0) {
                    j6 = uh1.e;
                } else {
                    j6 = j4;
                }
                if (i11 != 0) {
                    ob4Var2 = ob4.y;
                }
                if ((i2 & 128) != 0) {
                    float f1111111 = f2;
                    i14 = i3 & (-29360129);
                    f3 = f1111111;
                    jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                } else {
                    float f1111112 = f2;
                    i14 = i3;
                    f3 = f1111112;
                    jM833generateTextColor8_81llA = j3;
                }
                j7 = j5;
            } else {
                if (i17 != 0) {
                    bj4VarO.K(-8602219);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new lc1();
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var2 = (oh4) objF;
                }
                if (i5 != 0) {
                    j5 = uh1.b;
                } else {
                    j5 = j;
                }
                if (i7 != 0) {
                    f2 = 1.0f;
                }
                if (i9 != 0) {
                    j6 = uh1.e;
                } else {
                    j6 = j4;
                }
                if (i11 != 0) {
                    ob4Var2 = ob4.y;
                }
                if ((i2 & 128) != 0) {
                    float f1111113 = f2;
                    i14 = i3 & (-29360129);
                    f3 = f1111113;
                    jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(j6);
                } else {
                    float f1111114 = f2;
                    i14 = i3;
                    f3 = f1111114;
                    jM833generateTextColor8_81llA = j3;
                }
                j7 = j5;
            }
            bj4VarO.V();
            intercomTheme = IntercomTheme.INSTANCE;
            i15 = IntercomTheme.$stable;
            b72 b72Var15 = intercomTheme.getShapes(bj4VarO, i15).b;
            ob4Var3 = ob4Var2;
            aVar = ox6.a.t;
            j8 = jM833generateTextColor8_81llA;
            ox6 ox6VarC1110 = ir9.c(aVar, 1.0f);
            vs0 vs0VarB15 = ws0.b(f3, j7);
            f4 = f3;
            ox6 ox6VarC1111 = gi0.c(uma.a(ns0.b(ox6VarC1110, vs0VarB15.a, vs0VarB15.b, b72Var15), b72Var15), j6, al8.a);
            bj4VarO.K(-8583674);
            if ((i14 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i14 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z2 | z3;
            objF2 = bj4VarO.f();
            if (z4) {
                objF2 = new mh4() { // from class: mc1
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new mh4() { // from class: mc1
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4Var2, str);
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            ox6 ox6VarI15 = eo7.i(we1.c(ox6VarC1111, false, null, (mh4) objF2, 15), 16.0f);
            ny8VarA = ly8.a(c30.f, di.a.j, bj4VarO, 6);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarI15);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            oh4Var3 = oh4Var2;
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            long j111113 = j7;
            long j111114 = j6;
            i16 = i14;
            mia.b(str, ir9.c(aVar, 0.85f).H(new beb()), j8, 0L, ob4Var3, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04(), bj4VarO, ((i14 >> 6) & 14) | ((i14 >> 15) & 896) | (3670016 & i14), 0, 131000);
            bj4Var = bj4VarO;
            bj4Var.K(2120583720);
            if (z) {
                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, bj4Var, 0), nr1.f(bj4Var, com.hwpo_training_app.R.string.selected), ir9.j(aVar, 24.0f).H(new beb()), j8, bj4Var, ((i16 >> 12) & 7168) | 8, 0);
            }
            bj4Var.U(false);
            bj4Var.U(true);
            f5 = f4;
            j9 = j8;
            ob4Var4 = ob4Var3;
            j10 = j111113;
            j4 = j111114;
            oh4Var2 = oh4Var3;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            final oh4 oh4Var11 = oh4Var2;
            final long j111115 = j4;
            final long j111116 = j9;
            xj8VarW.d = new ci4() { // from class: nc1
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$5(z, oh4Var11, str, j10, f5, j111115, ob4Var4, j111116, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ChoicePill_UdaoDFU$lambda$1$lambda$0(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ChoicePill_UdaoDFU$lambda$3$lambda$2(oh4 oh4Var, String str) {
        oh4Var.invoke(str);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ChoicePill_UdaoDFU$lambda$5(boolean z, oh4 oh4Var, String str, long j, float f, long j2, ob4 ob4Var, long j3, int i, int i2, jt1 jt1Var, int i3) {
        m465ChoicePillUdaoDFU(z, oh4Var, str, j, f, j2, ob4Var, j3, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final void EmptyPill(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1274080153);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChoicePillKt.INSTANCE.m466getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new jc1(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EmptyPill$lambda$6(int i, jt1 jt1Var, int i2) {
        EmptyPill(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final void SelectedPill(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1118291055);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChoicePillKt.INSTANCE.m467getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new zp0(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SelectedPill$lambda$7(int i, jt1 jt1Var, int i2) {
        SelectedPill(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final void SelectedPillDark(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-774877671);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChoicePillKt.INSTANCE.m468getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new kc1(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SelectedPillDark$lambda$8(int i, jt1 jt1Var, int i2) {
        SelectedPillDark(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final void SelectedPillLongBigText(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1982481602);
        int i2 = 0;
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            SelectedPillLongText(bj4VarO, 0);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new oc1(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SelectedPillLongBigText$lambda$10(int i, jt1 jt1Var, int i2) {
        SelectedPillLongBigText(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final void SelectedPillLongText(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(173524454);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChoicePillKt.INSTANCE.m469getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new pc1(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SelectedPillLongText$lambda$9(int i, jt1 jt1Var, int i2) {
        SelectedPillLongText(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
