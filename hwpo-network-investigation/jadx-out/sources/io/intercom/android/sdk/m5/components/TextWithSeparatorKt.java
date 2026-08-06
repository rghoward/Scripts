package io.intercom.android.sdk.m5.components;

import com.intercom.twig.BuildConfig;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.cv3;
import defpackage.cw7;
import defpackage.ec9;
import defpackage.eca;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.hc9;
import defpackage.jt1;
import defpackage.mia;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.pb9;
import defpackage.uh1;
import defpackage.vaa;
import defpackage.wja;
import defpackage.xj8;
import defpackage.z2a;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TextWithSeparatorKt {
    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:114:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0160  */
    /* JADX WARN: Code duplicated, block: B:116:0x0163  */
    /* JADX WARN: Code duplicated, block: B:118:0x0166  */
    /* JADX WARN: Code duplicated, block: B:119:0x0169  */
    /* JADX WARN: Code duplicated, block: B:122:0x016e  */
    /* JADX WARN: Code duplicated, block: B:123:0x017d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0180  */
    /* JADX WARN: Code duplicated, block: B:126:0x0183  */
    /* JADX WARN: Code duplicated, block: B:128:0x0186  */
    /* JADX WARN: Code duplicated, block: B:129:0x0189  */
    /* JADX WARN: Code duplicated, block: B:131:0x018d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0191  */
    /* JADX WARN: Code duplicated, block: B:134:0x0195  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:154:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:158:0x024c  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0103  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    /* JADX WARN: Instruction removed from duplicated block: B:105:0x0136, please report this as an issue */
    /* JADX INFO: renamed from: TextWithSeparator-wV1YYcM, reason: not valid java name */
    public static final void m89TextWithSeparatorwV1YYcM(final String str, final String str2, ox6 ox6Var, String str3, wja wjaVar, long j, int i, int i2, vaa vaaVar, jt1 jt1Var, final int i3, final int i4) {
        int i5;
        ox6 ox6Var2;
        int i6;
        String str4;
        int i7;
        wja wjaVar2;
        int i8;
        long j2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final ox6 ox6Var3;
        String str5;
        wja type04;
        long j3;
        int i17;
        int i18;
        vaa vaaVar2;
        int i19;
        int i20;
        wja wjaVar3;
        long j4;
        String strA;
        boolean z;
        boolean z2;
        Object objF;
        bj4 bj4Var;
        final String str6;
        final long j5;
        final vaa vaaVar3;
        final int i21;
        final int i22;
        final wja wjaVar4;
        xj8 xj8VarW;
        str.getClass();
        str2.getClass();
        bj4 bj4VarO = jt1Var.o(46249171);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (bj4VarO.J(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= bj4VarO.J(str2) ? 32 : 16;
        }
        int i23 = i4 & 4;
        if (i23 == 0) {
            if ((i3 & 384) == 0) {
                ox6Var2 = ox6Var;
                i5 |= bj4VarO.J(ox6Var2) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i3 & 3072) == 0) {
                    str4 = str3;
                    if (bj4VarO.J(str4)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i5 |= i7;
                }
                if ((i3 & 24576) == 0) {
                    if ((i4 & 16) == 0) {
                        wjaVar2 = wjaVar;
                        int i24 = bj4VarO.J(wjaVar2) ? 16384 : 8192;
                        i5 |= i24;
                    } else {
                        wjaVar2 = wjaVar;
                    }
                    i5 |= i24;
                } else {
                    wjaVar2 = wjaVar;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    if ((196608 & i3) == 0) {
                        j2 = j;
                        if (bj4VarO.i(j2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i5 |= i9;
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        if (bj4VarO.h(i)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i5 |= i11;
                    }
                    i12 = i4 & 128;
                    if (i12 != 0) {
                        if ((i3 & 12582912) == 0) {
                            int i25 = i5;
                            if (bj4VarO.h(i2)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i14 = i25 | i13;
                        }
                        i15 = i4 & 256;
                        if (i15 != 0) {
                            if ((i3 & 100663296) == 0) {
                                if (bj4VarO.J(vaaVar)) {
                                    i16 = 67108864;
                                } else {
                                    i16 = 33554432;
                                }
                                i14 |= i16;
                            }
                            if ((i14 & 38347923) == 38347922 || !bj4VarO.r()) {
                                bj4VarO.v0();
                                if ((i3 & 1) != 0 || bj4VarO.c0()) {
                                    if (i23 != 0) {
                                        ox6Var3 = ox6.a.t;
                                    } else {
                                        ox6Var3 = ox6Var2;
                                    }
                                    if (i6 != 0) {
                                        str5 = "•";
                                    } else {
                                        str5 = str4;
                                    }
                                    if ((i4 & 16) != 0) {
                                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                        i14 &= -57345;
                                    } else {
                                        type04 = wjaVar2;
                                    }
                                    if (i8 != 0) {
                                        j3 = uh1.k;
                                    } else {
                                        j3 = j2;
                                    }
                                    if (i10 != 0) {
                                        i17 = 1;
                                    } else {
                                        i17 = i;
                                    }
                                    if (i12 != 0) {
                                        i18 = Integer.MAX_VALUE;
                                    } else {
                                        i18 = i2;
                                    }
                                    if (i15 != 0) {
                                        i19 = i17;
                                        i20 = i18;
                                        wjaVar3 = type04;
                                        j4 = j3;
                                        vaaVar2 = null;
                                    } else {
                                        vaaVar2 = vaaVar;
                                        i19 = i17;
                                        i20 = i18;
                                        wjaVar3 = type04;
                                        j4 = j3;
                                    }
                                } else {
                                    bj4VarO.u();
                                    if ((i4 & 16) != 0) {
                                        i14 &= -57345;
                                    }
                                    i19 = i;
                                    i20 = i2;
                                    vaaVar2 = vaaVar;
                                    ox6Var3 = ox6Var2;
                                    str5 = str4;
                                    wjaVar3 = wjaVar2;
                                    j4 = j2;
                                }
                                bj4VarO.V();
                                if (!z2a.w(str) || z2a.w(str2)) {
                                    strA = BuildConfig.FLAVOR;
                                } else {
                                    strA = eca.a(' ', " ", str5);
                                }
                                String str7 = str + strA + str2;
                                bj4VarO.K(598373073);
                                if ((i14 & 14) == 4) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                z2 = z | ((i14 & 112) == 32);
                                objF = bj4VarO.f();
                                if (z2 || objF == jt1.a.a) {
                                    objF = new oh4() { // from class: hka
                                        @Override // defpackage.oh4
                                        public final Object invoke(Object obj) {
                                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                        }
                                    };
                                    bj4VarO.C(objF);
                                }
                                bj4VarO.U(false);
                                int i26 = i14 >> 9;
                                bj4Var = bj4VarO;
                                mia.b(str7, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i26 & 896, (i26 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                                str6 = str5;
                                j5 = j4;
                                vaaVar3 = vaaVar2;
                                i21 = i19;
                                i22 = i20;
                                wjaVar4 = wjaVar3;
                            } else {
                                bj4VarO.u();
                                i21 = i;
                                bj4Var = bj4VarO;
                                ox6Var3 = ox6Var2;
                                str6 = str4;
                                wjaVar4 = wjaVar2;
                                j5 = j2;
                                i22 = i2;
                                vaaVar3 = vaaVar;
                            }
                            xj8VarW = bj4Var.W();
                            if (xj8VarW != null) {
                                xj8VarW.d = new ci4() { // from class: ika
                                    @Override // defpackage.ci4
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i14 |= 100663296;
                        if ((i14 & 38347923) == 38347922) {
                            bj4VarO.v0();
                            if ((i3 & 1) != 0) {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            } else {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            }
                            bj4VarO.V();
                            if (z2a.w(str)) {
                                strA = BuildConfig.FLAVOR;
                            } else {
                                strA = BuildConfig.FLAVOR;
                            }
                            String str8 = str + strA + str2;
                            bj4VarO.K(598373073);
                            if ((i14 & 14) == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z2 = z | ((i14 & 112) == 32);
                            objF = bj4VarO.f();
                            if (z2) {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            } else {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            int i27 = i14 >> 9;
                            bj4Var = bj4VarO;
                            mia.b(str8, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i27 & 896, (i27 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                            str6 = str5;
                            j5 = j4;
                            vaaVar3 = vaaVar2;
                            i21 = i19;
                            i22 = i20;
                            wjaVar4 = wjaVar3;
                        } else {
                            bj4VarO.v0();
                            if ((i3 & 1) != 0) {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            } else {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            }
                            bj4VarO.V();
                            if (z2a.w(str)) {
                                strA = BuildConfig.FLAVOR;
                            } else {
                                strA = BuildConfig.FLAVOR;
                            }
                            String str9 = str + strA + str2;
                            bj4VarO.K(598373073);
                            if ((i14 & 14) == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z2 = z | ((i14 & 112) == 32);
                            objF = bj4VarO.f();
                            if (z2) {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            } else {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            int i28 = i14 >> 9;
                            bj4Var = bj4VarO;
                            mia.b(str9, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i28 & 896, (i28 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                            str6 = str5;
                            j5 = j4;
                            vaaVar3 = vaaVar2;
                            i21 = i19;
                            i22 = i20;
                            wjaVar4 = wjaVar3;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: ika
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i5 |= 12582912;
                    i14 = i5;
                    i15 = i4 & 256;
                    if (i15 != 0) {
                        if ((i3 & 100663296) == 0) {
                            if (bj4VarO.J(vaaVar)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                            i14 |= i16;
                        }
                        if ((i14 & 38347923) == 38347922) {
                            bj4VarO.v0();
                            if ((i3 & 1) != 0) {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            } else {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            }
                            bj4VarO.V();
                            if (z2a.w(str)) {
                                strA = BuildConfig.FLAVOR;
                            } else {
                                strA = BuildConfig.FLAVOR;
                            }
                            String str10 = str + strA + str2;
                            bj4VarO.K(598373073);
                            if ((i14 & 14) == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z2 = z | ((i14 & 112) == 32);
                            objF = bj4VarO.f();
                            if (z2) {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            } else {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            int i29 = i14 >> 9;
                            bj4Var = bj4VarO;
                            mia.b(str10, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i29 & 896, (i29 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                            str6 = str5;
                            j5 = j4;
                            vaaVar3 = vaaVar2;
                            i21 = i19;
                            i22 = i20;
                            wjaVar4 = wjaVar3;
                        } else {
                            bj4VarO.v0();
                            if ((i3 & 1) != 0) {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            } else {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            }
                            bj4VarO.V();
                            if (z2a.w(str)) {
                                strA = BuildConfig.FLAVOR;
                            } else {
                                strA = BuildConfig.FLAVOR;
                            }
                            String str11 = str + strA + str2;
                            bj4VarO.K(598373073);
                            if ((i14 & 14) == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z2 = z | ((i14 & 112) == 32);
                            objF = bj4VarO.f();
                            if (z2) {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            } else {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            int i210 = i14 >> 9;
                            bj4Var = bj4VarO;
                            mia.b(str11, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i210 & 896, (i210 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                            str6 = str5;
                            j5 = j4;
                            vaaVar3 = vaaVar2;
                            i21 = i19;
                            i22 = i20;
                            wjaVar4 = wjaVar3;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: ika
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i14 |= 100663296;
                    if ((i14 & 38347923) == 38347922) {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str12 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i211 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str12, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i211 & 896, (i211 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    } else {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str13 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i212 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str13, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i212 & 896, (i212 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ika
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i5 |= 196608;
                j2 = j;
                i10 = i4 & 64;
                if (i10 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (bj4VarO.h(i)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 128;
                if (i12 != 0) {
                    if ((i3 & 12582912) == 0) {
                        int i213 = i5;
                        if (bj4VarO.h(i2)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i14 = i213 | i13;
                    }
                    i15 = i4 & 256;
                    if (i15 != 0) {
                        if ((i3 & 100663296) == 0) {
                            if (bj4VarO.J(vaaVar)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                            i14 |= i16;
                        }
                        if ((i14 & 38347923) == 38347922) {
                            bj4VarO.v0();
                            if ((i3 & 1) != 0) {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            } else {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            }
                            bj4VarO.V();
                            if (z2a.w(str)) {
                                strA = BuildConfig.FLAVOR;
                            } else {
                                strA = BuildConfig.FLAVOR;
                            }
                            String str14 = str + strA + str2;
                            bj4VarO.K(598373073);
                            if ((i14 & 14) == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z2 = z | ((i14 & 112) == 32);
                            objF = bj4VarO.f();
                            if (z2) {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            } else {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            int i214 = i14 >> 9;
                            bj4Var = bj4VarO;
                            mia.b(str14, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i214 & 896, (i214 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                            str6 = str5;
                            j5 = j4;
                            vaaVar3 = vaaVar2;
                            i21 = i19;
                            i22 = i20;
                            wjaVar4 = wjaVar3;
                        } else {
                            bj4VarO.v0();
                            if ((i3 & 1) != 0) {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            } else {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            }
                            bj4VarO.V();
                            if (z2a.w(str)) {
                                strA = BuildConfig.FLAVOR;
                            } else {
                                strA = BuildConfig.FLAVOR;
                            }
                            String str15 = str + strA + str2;
                            bj4VarO.K(598373073);
                            if ((i14 & 14) == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z2 = z | ((i14 & 112) == 32);
                            objF = bj4VarO.f();
                            if (z2) {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            } else {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            int i215 = i14 >> 9;
                            bj4Var = bj4VarO;
                            mia.b(str15, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i215 & 896, (i215 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                            str6 = str5;
                            j5 = j4;
                            vaaVar3 = vaaVar2;
                            i21 = i19;
                            i22 = i20;
                            wjaVar4 = wjaVar3;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: ika
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i14 |= 100663296;
                    if ((i14 & 38347923) == 38347922) {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str16 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i216 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str16, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i216 & 896, (i216 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    } else {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str17 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i217 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str17, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i217 & 896, (i217 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ika
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i5 |= 12582912;
                i14 = i5;
                i15 = i4 & 256;
                if (i15 != 0) {
                    if ((i3 & 100663296) == 0) {
                        if (bj4VarO.J(vaaVar)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i14 |= i16;
                    }
                    if ((i14 & 38347923) == 38347922) {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str18 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i218 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str18, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i218 & 896, (i218 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    } else {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str19 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i219 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str19, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i219 & 896, (i219 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ika
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i14 |= 100663296;
                if ((i14 & 38347923) == 38347922) {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str110 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i2110 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str110, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2110 & 896, (i2110 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                } else {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str111 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i2111 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str111, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2111 & 896, (i2111 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ika
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i5 |= 3072;
            str4 = str3;
            if ((i3 & 24576) == 0) {
                if ((i4 & 16) == 0) {
                    wjaVar2 = wjaVar;
                    if (bj4VarO.J(wjaVar2)) {
                    }
                    i5 |= i24;
                } else {
                    wjaVar2 = wjaVar;
                }
                i5 |= i24;
            } else {
                wjaVar2 = wjaVar;
            }
            i8 = i4 & 32;
            if (i8 != 0) {
                if ((196608 & i3) == 0) {
                    j2 = j;
                    if (bj4VarO.i(j2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (bj4VarO.h(i)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 128;
                if (i12 != 0) {
                    if ((i3 & 12582912) == 0) {
                        int i2112 = i5;
                        if (bj4VarO.h(i2)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i14 = i2112 | i13;
                    }
                    i15 = i4 & 256;
                    if (i15 != 0) {
                        if ((i3 & 100663296) == 0) {
                            if (bj4VarO.J(vaaVar)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                            i14 |= i16;
                        }
                        if ((i14 & 38347923) == 38347922) {
                            bj4VarO.v0();
                            if ((i3 & 1) != 0) {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            } else {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            }
                            bj4VarO.V();
                            if (z2a.w(str)) {
                                strA = BuildConfig.FLAVOR;
                            } else {
                                strA = BuildConfig.FLAVOR;
                            }
                            String str112 = str + strA + str2;
                            bj4VarO.K(598373073);
                            if ((i14 & 14) == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z2 = z | ((i14 & 112) == 32);
                            objF = bj4VarO.f();
                            if (z2) {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            } else {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            int i2113 = i14 >> 9;
                            bj4Var = bj4VarO;
                            mia.b(str112, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2113 & 896, (i2113 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                            str6 = str5;
                            j5 = j4;
                            vaaVar3 = vaaVar2;
                            i21 = i19;
                            i22 = i20;
                            wjaVar4 = wjaVar3;
                        } else {
                            bj4VarO.v0();
                            if ((i3 & 1) != 0) {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            } else {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            }
                            bj4VarO.V();
                            if (z2a.w(str)) {
                                strA = BuildConfig.FLAVOR;
                            } else {
                                strA = BuildConfig.FLAVOR;
                            }
                            String str113 = str + strA + str2;
                            bj4VarO.K(598373073);
                            if ((i14 & 14) == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z2 = z | ((i14 & 112) == 32);
                            objF = bj4VarO.f();
                            if (z2) {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            } else {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            int i2114 = i14 >> 9;
                            bj4Var = bj4VarO;
                            mia.b(str113, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2114 & 896, (i2114 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                            str6 = str5;
                            j5 = j4;
                            vaaVar3 = vaaVar2;
                            i21 = i19;
                            i22 = i20;
                            wjaVar4 = wjaVar3;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: ika
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i14 |= 100663296;
                    if ((i14 & 38347923) == 38347922) {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str114 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i2115 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str114, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2115 & 896, (i2115 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    } else {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str115 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i2116 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str115, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2116 & 896, (i2116 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ika
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i5 |= 12582912;
                i14 = i5;
                i15 = i4 & 256;
                if (i15 != 0) {
                    if ((i3 & 100663296) == 0) {
                        if (bj4VarO.J(vaaVar)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i14 |= i16;
                    }
                    if ((i14 & 38347923) == 38347922) {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str116 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i2117 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str116, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2117 & 896, (i2117 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    } else {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str117 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i2118 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str117, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2118 & 896, (i2118 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ika
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i14 |= 100663296;
                if ((i14 & 38347923) == 38347922) {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str118 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i2119 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str118, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2119 & 896, (i2119 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                } else {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str119 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i21110 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str119, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21110 & 896, (i21110 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ika
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i5 |= 196608;
            j2 = j;
            i10 = i4 & 64;
            if (i10 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (bj4VarO.h(i)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i5 |= i11;
            }
            i12 = i4 & 128;
            if (i12 != 0) {
                if ((i3 & 12582912) == 0) {
                    int i21111 = i5;
                    if (bj4VarO.h(i2)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i14 = i21111 | i13;
                }
                i15 = i4 & 256;
                if (i15 != 0) {
                    if ((i3 & 100663296) == 0) {
                        if (bj4VarO.J(vaaVar)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i14 |= i16;
                    }
                    if ((i14 & 38347923) == 38347922) {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str1110 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i21112 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str1110, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21112 & 896, (i21112 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    } else {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str1111 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i21113 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str1111, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21113 & 896, (i21113 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ika
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i14 |= 100663296;
                if ((i14 & 38347923) == 38347922) {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str1112 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i21114 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str1112, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21114 & 896, (i21114 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                } else {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str1113 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i21115 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str1113, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21115 & 896, (i21115 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ika
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i5 |= 12582912;
            i14 = i5;
            i15 = i4 & 256;
            if (i15 != 0) {
                if ((i3 & 100663296) == 0) {
                    if (bj4VarO.J(vaaVar)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                    i14 |= i16;
                }
                if ((i14 & 38347923) == 38347922) {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str1114 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i21116 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str1114, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21116 & 896, (i21116 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                } else {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str1115 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i21117 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str1115, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21117 & 896, (i21117 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ika
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i14 |= 100663296;
            if ((i14 & 38347923) == 38347922) {
                bj4VarO.v0();
                if ((i3 & 1) != 0) {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                } else {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                }
                bj4VarO.V();
                if (z2a.w(str)) {
                    strA = BuildConfig.FLAVOR;
                } else {
                    strA = BuildConfig.FLAVOR;
                }
                String str1116 = str + strA + str2;
                bj4VarO.K(598373073);
                if ((i14 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | ((i14 & 112) == 32);
                objF = bj4VarO.f();
                if (z2) {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                int i21118 = i14 >> 9;
                bj4Var = bj4VarO;
                mia.b(str1116, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21118 & 896, (i21118 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                str6 = str5;
                j5 = j4;
                vaaVar3 = vaaVar2;
                i21 = i19;
                i22 = i20;
                wjaVar4 = wjaVar3;
            } else {
                bj4VarO.v0();
                if ((i3 & 1) != 0) {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                } else {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                }
                bj4VarO.V();
                if (z2a.w(str)) {
                    strA = BuildConfig.FLAVOR;
                } else {
                    strA = BuildConfig.FLAVOR;
                }
                String str1117 = str + strA + str2;
                bj4VarO.K(598373073);
                if ((i14 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | ((i14 & 112) == 32);
                objF = bj4VarO.f();
                if (z2) {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                int i21119 = i14 >> 9;
                bj4Var = bj4VarO;
                mia.b(str1117, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21119 & 896, (i21119 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                str6 = str5;
                j5 = j4;
                vaaVar3 = vaaVar2;
                i21 = i19;
                i22 = i20;
                wjaVar4 = wjaVar3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ika
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i5 |= 384;
        ox6Var2 = ox6Var;
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((i3 & 3072) == 0) {
                str4 = str3;
                if (bj4VarO.J(str4)) {
                    i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i7 = 1024;
                }
                i5 |= i7;
            }
            if ((i3 & 24576) == 0) {
                if ((i4 & 16) == 0) {
                    wjaVar2 = wjaVar;
                    if (bj4VarO.J(wjaVar2)) {
                    }
                    i5 |= i24;
                } else {
                    wjaVar2 = wjaVar;
                }
                i5 |= i24;
            } else {
                wjaVar2 = wjaVar;
            }
            i8 = i4 & 32;
            if (i8 != 0) {
                if ((196608 & i3) == 0) {
                    j2 = j;
                    if (bj4VarO.i(j2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i5 |= i9;
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                    i5 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    if (bj4VarO.h(i)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i5 |= i11;
                }
                i12 = i4 & 128;
                if (i12 != 0) {
                    if ((i3 & 12582912) == 0) {
                        int i211110 = i5;
                        if (bj4VarO.h(i2)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i14 = i211110 | i13;
                    }
                    i15 = i4 & 256;
                    if (i15 != 0) {
                        if ((i3 & 100663296) == 0) {
                            if (bj4VarO.J(vaaVar)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                            i14 |= i16;
                        }
                        if ((i14 & 38347923) == 38347922) {
                            bj4VarO.v0();
                            if ((i3 & 1) != 0) {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            } else {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            }
                            bj4VarO.V();
                            if (z2a.w(str)) {
                                strA = BuildConfig.FLAVOR;
                            } else {
                                strA = BuildConfig.FLAVOR;
                            }
                            String str1118 = str + strA + str2;
                            bj4VarO.K(598373073);
                            if ((i14 & 14) == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z2 = z | ((i14 & 112) == 32);
                            objF = bj4VarO.f();
                            if (z2) {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            } else {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            int i211111 = i14 >> 9;
                            bj4Var = bj4VarO;
                            mia.b(str1118, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i211111 & 896, (i211111 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                            str6 = str5;
                            j5 = j4;
                            vaaVar3 = vaaVar2;
                            i21 = i19;
                            i22 = i20;
                            wjaVar4 = wjaVar3;
                        } else {
                            bj4VarO.v0();
                            if ((i3 & 1) != 0) {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            } else {
                                if (i23 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i6 != 0) {
                                    str5 = "•";
                                } else {
                                    str5 = str4;
                                }
                                if ((i4 & 16) != 0) {
                                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                    i14 &= -57345;
                                } else {
                                    type04 = wjaVar2;
                                }
                                if (i8 != 0) {
                                    j3 = uh1.k;
                                } else {
                                    j3 = j2;
                                }
                                if (i10 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i12 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if (i15 != 0) {
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                    vaaVar2 = null;
                                } else {
                                    vaaVar2 = vaaVar;
                                    i19 = i17;
                                    i20 = i18;
                                    wjaVar3 = type04;
                                    j4 = j3;
                                }
                            }
                            bj4VarO.V();
                            if (z2a.w(str)) {
                                strA = BuildConfig.FLAVOR;
                            } else {
                                strA = BuildConfig.FLAVOR;
                            }
                            String str1119 = str + strA + str2;
                            bj4VarO.K(598373073);
                            if ((i14 & 14) == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            z2 = z | ((i14 & 112) == 32);
                            objF = bj4VarO.f();
                            if (z2) {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            } else {
                                objF = new oh4() { // from class: hka
                                    @Override // defpackage.oh4
                                    public final Object invoke(Object obj) {
                                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                    }
                                };
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            int i211112 = i14 >> 9;
                            bj4Var = bj4VarO;
                            mia.b(str1119, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i211112 & 896, (i211112 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                            str6 = str5;
                            j5 = j4;
                            vaaVar3 = vaaVar2;
                            i21 = i19;
                            i22 = i20;
                            wjaVar4 = wjaVar3;
                        }
                        xj8VarW = bj4Var.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: ika
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i14 |= 100663296;
                    if ((i14 & 38347923) == 38347922) {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str11110 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i211113 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str11110, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i211113 & 896, (i211113 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    } else {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str11111 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i211114 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str11111, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i211114 & 896, (i211114 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ika
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i5 |= 12582912;
                i14 = i5;
                i15 = i4 & 256;
                if (i15 != 0) {
                    if ((i3 & 100663296) == 0) {
                        if (bj4VarO.J(vaaVar)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i14 |= i16;
                    }
                    if ((i14 & 38347923) == 38347922) {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str11112 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i211115 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str11112, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i211115 & 896, (i211115 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    } else {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str11113 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i211116 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str11113, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i211116 & 896, (i211116 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ika
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i14 |= 100663296;
                if ((i14 & 38347923) == 38347922) {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str11114 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i211117 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str11114, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i211117 & 896, (i211117 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                } else {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str11115 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i211118 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str11115, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i211118 & 896, (i211118 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ika
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i5 |= 196608;
            j2 = j;
            i10 = i4 & 64;
            if (i10 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (bj4VarO.h(i)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i5 |= i11;
            }
            i12 = i4 & 128;
            if (i12 != 0) {
                if ((i3 & 12582912) == 0) {
                    int i211119 = i5;
                    if (bj4VarO.h(i2)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i14 = i211119 | i13;
                }
                i15 = i4 & 256;
                if (i15 != 0) {
                    if ((i3 & 100663296) == 0) {
                        if (bj4VarO.J(vaaVar)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i14 |= i16;
                    }
                    if ((i14 & 38347923) == 38347922) {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str11116 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i2111110 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str11116, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2111110 & 896, (i2111110 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    } else {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str11117 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i2111111 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str11117, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2111111 & 896, (i2111111 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ika
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i14 |= 100663296;
                if ((i14 & 38347923) == 38347922) {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str11118 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i2111112 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str11118, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2111112 & 896, (i2111112 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                } else {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str11119 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i2111113 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str11119, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2111113 & 896, (i2111113 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ika
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i5 |= 12582912;
            i14 = i5;
            i15 = i4 & 256;
            if (i15 != 0) {
                if ((i3 & 100663296) == 0) {
                    if (bj4VarO.J(vaaVar)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                    i14 |= i16;
                }
                if ((i14 & 38347923) == 38347922) {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str111110 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i2111114 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str111110, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2111114 & 896, (i2111114 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                } else {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str111111 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i2111115 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str111111, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2111115 & 896, (i2111115 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ika
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i14 |= 100663296;
            if ((i14 & 38347923) == 38347922) {
                bj4VarO.v0();
                if ((i3 & 1) != 0) {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                } else {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                }
                bj4VarO.V();
                if (z2a.w(str)) {
                    strA = BuildConfig.FLAVOR;
                } else {
                    strA = BuildConfig.FLAVOR;
                }
                String str111112 = str + strA + str2;
                bj4VarO.K(598373073);
                if ((i14 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | ((i14 & 112) == 32);
                objF = bj4VarO.f();
                if (z2) {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                int i2111116 = i14 >> 9;
                bj4Var = bj4VarO;
                mia.b(str111112, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2111116 & 896, (i2111116 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                str6 = str5;
                j5 = j4;
                vaaVar3 = vaaVar2;
                i21 = i19;
                i22 = i20;
                wjaVar4 = wjaVar3;
            } else {
                bj4VarO.v0();
                if ((i3 & 1) != 0) {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                } else {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                }
                bj4VarO.V();
                if (z2a.w(str)) {
                    strA = BuildConfig.FLAVOR;
                } else {
                    strA = BuildConfig.FLAVOR;
                }
                String str111113 = str + strA + str2;
                bj4VarO.K(598373073);
                if ((i14 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | ((i14 & 112) == 32);
                objF = bj4VarO.f();
                if (z2) {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                int i2111117 = i14 >> 9;
                bj4Var = bj4VarO;
                mia.b(str111113, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2111117 & 896, (i2111117 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                str6 = str5;
                j5 = j4;
                vaaVar3 = vaaVar2;
                i21 = i19;
                i22 = i20;
                wjaVar4 = wjaVar3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ika
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i5 |= 3072;
        str4 = str3;
        if ((i3 & 24576) == 0) {
            if ((i4 & 16) == 0) {
                wjaVar2 = wjaVar;
                if (bj4VarO.J(wjaVar2)) {
                }
                i5 |= i24;
            } else {
                wjaVar2 = wjaVar;
            }
            i5 |= i24;
        } else {
            wjaVar2 = wjaVar;
        }
        i8 = i4 & 32;
        if (i8 != 0) {
            if ((196608 & i3) == 0) {
                j2 = j;
                if (bj4VarO.i(j2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i5 |= i9;
            }
            i10 = i4 & 64;
            if (i10 != 0) {
                i5 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                if (bj4VarO.h(i)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i5 |= i11;
            }
            i12 = i4 & 128;
            if (i12 != 0) {
                if ((i3 & 12582912) == 0) {
                    int i2111118 = i5;
                    if (bj4VarO.h(i2)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i14 = i2111118 | i13;
                }
                i15 = i4 & 256;
                if (i15 != 0) {
                    if ((i3 & 100663296) == 0) {
                        if (bj4VarO.J(vaaVar)) {
                            i16 = 67108864;
                        } else {
                            i16 = 33554432;
                        }
                        i14 |= i16;
                    }
                    if ((i14 & 38347923) == 38347922) {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str111114 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i2111119 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str111114, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i2111119 & 896, (i2111119 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    } else {
                        bj4VarO.v0();
                        if ((i3 & 1) != 0) {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        } else {
                            if (i23 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i6 != 0) {
                                str5 = "•";
                            } else {
                                str5 = str4;
                            }
                            if ((i4 & 16) != 0) {
                                type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                                i14 &= -57345;
                            } else {
                                type04 = wjaVar2;
                            }
                            if (i8 != 0) {
                                j3 = uh1.k;
                            } else {
                                j3 = j2;
                            }
                            if (i10 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i12 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if (i15 != 0) {
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                                vaaVar2 = null;
                            } else {
                                vaaVar2 = vaaVar;
                                i19 = i17;
                                i20 = i18;
                                wjaVar3 = type04;
                                j4 = j3;
                            }
                        }
                        bj4VarO.V();
                        if (z2a.w(str)) {
                            strA = BuildConfig.FLAVOR;
                        } else {
                            strA = BuildConfig.FLAVOR;
                        }
                        String str111115 = str + strA + str2;
                        bj4VarO.K(598373073);
                        if ((i14 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z | ((i14 & 112) == 32);
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new oh4() { // from class: hka
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        int i21111110 = i14 >> 9;
                        bj4Var = bj4VarO;
                        mia.b(str111115, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21111110 & 896, (i21111110 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                        str6 = str5;
                        j5 = j4;
                        vaaVar3 = vaaVar2;
                        i21 = i19;
                        i22 = i20;
                        wjaVar4 = wjaVar3;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ika
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i14 |= 100663296;
                if ((i14 & 38347923) == 38347922) {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str111116 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i21111111 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str111116, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21111111 & 896, (i21111111 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                } else {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str111117 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i21111112 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str111117, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21111112 & 896, (i21111112 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ika
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i5 |= 12582912;
            i14 = i5;
            i15 = i4 & 256;
            if (i15 != 0) {
                if ((i3 & 100663296) == 0) {
                    if (bj4VarO.J(vaaVar)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                    i14 |= i16;
                }
                if ((i14 & 38347923) == 38347922) {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str111118 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i21111113 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str111118, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21111113 & 896, (i21111113 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                } else {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str111119 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i21111114 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str111119, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21111114 & 896, (i21111114 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ika
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i14 |= 100663296;
            if ((i14 & 38347923) == 38347922) {
                bj4VarO.v0();
                if ((i3 & 1) != 0) {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                } else {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                }
                bj4VarO.V();
                if (z2a.w(str)) {
                    strA = BuildConfig.FLAVOR;
                } else {
                    strA = BuildConfig.FLAVOR;
                }
                String str1111110 = str + strA + str2;
                bj4VarO.K(598373073);
                if ((i14 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | ((i14 & 112) == 32);
                objF = bj4VarO.f();
                if (z2) {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                int i21111115 = i14 >> 9;
                bj4Var = bj4VarO;
                mia.b(str1111110, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21111115 & 896, (i21111115 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                str6 = str5;
                j5 = j4;
                vaaVar3 = vaaVar2;
                i21 = i19;
                i22 = i20;
                wjaVar4 = wjaVar3;
            } else {
                bj4VarO.v0();
                if ((i3 & 1) != 0) {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                } else {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                }
                bj4VarO.V();
                if (z2a.w(str)) {
                    strA = BuildConfig.FLAVOR;
                } else {
                    strA = BuildConfig.FLAVOR;
                }
                String str1111111 = str + strA + str2;
                bj4VarO.K(598373073);
                if ((i14 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | ((i14 & 112) == 32);
                objF = bj4VarO.f();
                if (z2) {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                int i21111116 = i14 >> 9;
                bj4Var = bj4VarO;
                mia.b(str1111111, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21111116 & 896, (i21111116 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                str6 = str5;
                j5 = j4;
                vaaVar3 = vaaVar2;
                i21 = i19;
                i22 = i20;
                wjaVar4 = wjaVar3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ika
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i5 |= 196608;
        j2 = j;
        i10 = i4 & 64;
        if (i10 != 0) {
            i5 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            if (bj4VarO.h(i)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i5 |= i11;
        }
        i12 = i4 & 128;
        if (i12 != 0) {
            if ((i3 & 12582912) == 0) {
                int i21111117 = i5;
                if (bj4VarO.h(i2)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i14 = i21111117 | i13;
            }
            i15 = i4 & 256;
            if (i15 != 0) {
                if ((i3 & 100663296) == 0) {
                    if (bj4VarO.J(vaaVar)) {
                        i16 = 67108864;
                    } else {
                        i16 = 33554432;
                    }
                    i14 |= i16;
                }
                if ((i14 & 38347923) == 38347922) {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str1111112 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i21111118 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str1111112, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21111118 & 896, (i21111118 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                } else {
                    bj4VarO.v0();
                    if ((i3 & 1) != 0) {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    } else {
                        if (i23 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i6 != 0) {
                            str5 = "•";
                        } else {
                            str5 = str4;
                        }
                        if ((i4 & 16) != 0) {
                            type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                            i14 &= -57345;
                        } else {
                            type04 = wjaVar2;
                        }
                        if (i8 != 0) {
                            j3 = uh1.k;
                        } else {
                            j3 = j2;
                        }
                        if (i10 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i12 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if (i15 != 0) {
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                            vaaVar2 = null;
                        } else {
                            vaaVar2 = vaaVar;
                            i19 = i17;
                            i20 = i18;
                            wjaVar3 = type04;
                            j4 = j3;
                        }
                    }
                    bj4VarO.V();
                    if (z2a.w(str)) {
                        strA = BuildConfig.FLAVOR;
                    } else {
                        strA = BuildConfig.FLAVOR;
                    }
                    String str1111113 = str + strA + str2;
                    bj4VarO.K(598373073);
                    if ((i14 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = z | ((i14 & 112) == 32);
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new oh4() { // from class: hka
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    int i21111119 = i14 >> 9;
                    bj4Var = bj4VarO;
                    mia.b(str1111113, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i21111119 & 896, (i21111119 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                    str6 = str5;
                    j5 = j4;
                    vaaVar3 = vaaVar2;
                    i21 = i19;
                    i22 = i20;
                    wjaVar4 = wjaVar3;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ika
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i14 |= 100663296;
            if ((i14 & 38347923) == 38347922) {
                bj4VarO.v0();
                if ((i3 & 1) != 0) {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                } else {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                }
                bj4VarO.V();
                if (z2a.w(str)) {
                    strA = BuildConfig.FLAVOR;
                } else {
                    strA = BuildConfig.FLAVOR;
                }
                String str1111114 = str + strA + str2;
                bj4VarO.K(598373073);
                if ((i14 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | ((i14 & 112) == 32);
                objF = bj4VarO.f();
                if (z2) {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                int i211111110 = i14 >> 9;
                bj4Var = bj4VarO;
                mia.b(str1111114, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i211111110 & 896, (i211111110 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                str6 = str5;
                j5 = j4;
                vaaVar3 = vaaVar2;
                i21 = i19;
                i22 = i20;
                wjaVar4 = wjaVar3;
            } else {
                bj4VarO.v0();
                if ((i3 & 1) != 0) {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                } else {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                }
                bj4VarO.V();
                if (z2a.w(str)) {
                    strA = BuildConfig.FLAVOR;
                } else {
                    strA = BuildConfig.FLAVOR;
                }
                String str1111115 = str + strA + str2;
                bj4VarO.K(598373073);
                if ((i14 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | ((i14 & 112) == 32);
                objF = bj4VarO.f();
                if (z2) {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                int i211111111 = i14 >> 9;
                bj4Var = bj4VarO;
                mia.b(str1111115, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i211111111 & 896, (i211111111 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                str6 = str5;
                j5 = j4;
                vaaVar3 = vaaVar2;
                i21 = i19;
                i22 = i20;
                wjaVar4 = wjaVar3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ika
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i5 |= 12582912;
        i14 = i5;
        i15 = i4 & 256;
        if (i15 != 0) {
            if ((i3 & 100663296) == 0) {
                if (bj4VarO.J(vaaVar)) {
                    i16 = 67108864;
                } else {
                    i16 = 33554432;
                }
                i14 |= i16;
            }
            if ((i14 & 38347923) == 38347922) {
                bj4VarO.v0();
                if ((i3 & 1) != 0) {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                } else {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                }
                bj4VarO.V();
                if (z2a.w(str)) {
                    strA = BuildConfig.FLAVOR;
                } else {
                    strA = BuildConfig.FLAVOR;
                }
                String str1111116 = str + strA + str2;
                bj4VarO.K(598373073);
                if ((i14 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | ((i14 & 112) == 32);
                objF = bj4VarO.f();
                if (z2) {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                int i211111112 = i14 >> 9;
                bj4Var = bj4VarO;
                mia.b(str1111116, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i211111112 & 896, (i211111112 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                str6 = str5;
                j5 = j4;
                vaaVar3 = vaaVar2;
                i21 = i19;
                i22 = i20;
                wjaVar4 = wjaVar3;
            } else {
                bj4VarO.v0();
                if ((i3 & 1) != 0) {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                } else {
                    if (i23 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i6 != 0) {
                        str5 = "•";
                    } else {
                        str5 = str4;
                    }
                    if ((i4 & 16) != 0) {
                        type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                        i14 &= -57345;
                    } else {
                        type04 = wjaVar2;
                    }
                    if (i8 != 0) {
                        j3 = uh1.k;
                    } else {
                        j3 = j2;
                    }
                    if (i10 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i12 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if (i15 != 0) {
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                        vaaVar2 = null;
                    } else {
                        vaaVar2 = vaaVar;
                        i19 = i17;
                        i20 = i18;
                        wjaVar3 = type04;
                        j4 = j3;
                    }
                }
                bj4VarO.V();
                if (z2a.w(str)) {
                    strA = BuildConfig.FLAVOR;
                } else {
                    strA = BuildConfig.FLAVOR;
                }
                String str1111117 = str + strA + str2;
                bj4VarO.K(598373073);
                if ((i14 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | ((i14 & 112) == 32);
                objF = bj4VarO.f();
                if (z2) {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new oh4() { // from class: hka
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                int i211111113 = i14 >> 9;
                bj4Var = bj4VarO;
                mia.b(str1111117, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i211111113 & 896, (i211111113 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
                str6 = str5;
                j5 = j4;
                vaaVar3 = vaaVar2;
                i21 = i19;
                i22 = i20;
                wjaVar4 = wjaVar3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ika
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i14 |= 100663296;
        if ((i14 & 38347923) == 38347922) {
            bj4VarO.v0();
            if ((i3 & 1) != 0) {
                if (i23 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i6 != 0) {
                    str5 = "•";
                } else {
                    str5 = str4;
                }
                if ((i4 & 16) != 0) {
                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                    i14 &= -57345;
                } else {
                    type04 = wjaVar2;
                }
                if (i8 != 0) {
                    j3 = uh1.k;
                } else {
                    j3 = j2;
                }
                if (i10 != 0) {
                    i17 = 1;
                } else {
                    i17 = i;
                }
                if (i12 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i2;
                }
                if (i15 != 0) {
                    i19 = i17;
                    i20 = i18;
                    wjaVar3 = type04;
                    j4 = j3;
                    vaaVar2 = null;
                } else {
                    vaaVar2 = vaaVar;
                    i19 = i17;
                    i20 = i18;
                    wjaVar3 = type04;
                    j4 = j3;
                }
            } else {
                if (i23 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i6 != 0) {
                    str5 = "•";
                } else {
                    str5 = str4;
                }
                if ((i4 & 16) != 0) {
                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                    i14 &= -57345;
                } else {
                    type04 = wjaVar2;
                }
                if (i8 != 0) {
                    j3 = uh1.k;
                } else {
                    j3 = j2;
                }
                if (i10 != 0) {
                    i17 = 1;
                } else {
                    i17 = i;
                }
                if (i12 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i2;
                }
                if (i15 != 0) {
                    i19 = i17;
                    i20 = i18;
                    wjaVar3 = type04;
                    j4 = j3;
                    vaaVar2 = null;
                } else {
                    vaaVar2 = vaaVar;
                    i19 = i17;
                    i20 = i18;
                    wjaVar3 = type04;
                    j4 = j3;
                }
            }
            bj4VarO.V();
            if (z2a.w(str)) {
                strA = BuildConfig.FLAVOR;
            } else {
                strA = BuildConfig.FLAVOR;
            }
            String str1111118 = str + strA + str2;
            bj4VarO.K(598373073);
            if ((i14 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            z2 = z | ((i14 & 112) == 32);
            objF = bj4VarO.f();
            if (z2) {
                objF = new oh4() { // from class: hka
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new oh4() { // from class: hka
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            int i211111114 = i14 >> 9;
            bj4Var = bj4VarO;
            mia.b(str1111118, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i211111114 & 896, (i211111114 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
            str6 = str5;
            j5 = j4;
            vaaVar3 = vaaVar2;
            i21 = i19;
            i22 = i20;
            wjaVar4 = wjaVar3;
        } else {
            bj4VarO.v0();
            if ((i3 & 1) != 0) {
                if (i23 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i6 != 0) {
                    str5 = "•";
                } else {
                    str5 = str4;
                }
                if ((i4 & 16) != 0) {
                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                    i14 &= -57345;
                } else {
                    type04 = wjaVar2;
                }
                if (i8 != 0) {
                    j3 = uh1.k;
                } else {
                    j3 = j2;
                }
                if (i10 != 0) {
                    i17 = 1;
                } else {
                    i17 = i;
                }
                if (i12 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i2;
                }
                if (i15 != 0) {
                    i19 = i17;
                    i20 = i18;
                    wjaVar3 = type04;
                    j4 = j3;
                    vaaVar2 = null;
                } else {
                    vaaVar2 = vaaVar;
                    i19 = i17;
                    i20 = i18;
                    wjaVar3 = type04;
                    j4 = j3;
                }
            } else {
                if (i23 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i6 != 0) {
                    str5 = "•";
                } else {
                    str5 = str4;
                }
                if ((i4 & 16) != 0) {
                    type04 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04();
                    i14 &= -57345;
                } else {
                    type04 = wjaVar2;
                }
                if (i8 != 0) {
                    j3 = uh1.k;
                } else {
                    j3 = j2;
                }
                if (i10 != 0) {
                    i17 = 1;
                } else {
                    i17 = i;
                }
                if (i12 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i2;
                }
                if (i15 != 0) {
                    i19 = i17;
                    i20 = i18;
                    wjaVar3 = type04;
                    j4 = j3;
                    vaaVar2 = null;
                } else {
                    vaaVar2 = vaaVar;
                    i19 = i17;
                    i20 = i18;
                    wjaVar3 = type04;
                    j4 = j3;
                }
            }
            bj4VarO.V();
            if (z2a.w(str)) {
                strA = BuildConfig.FLAVOR;
            } else {
                strA = BuildConfig.FLAVOR;
            }
            String str1111119 = str + strA + str2;
            bj4VarO.K(598373073);
            if ((i14 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            z2 = z | ((i14 & 112) == 32);
            objF = bj4VarO.f();
            if (z2) {
                objF = new oh4() { // from class: hka
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new oh4() { // from class: hka
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, (hc9) obj);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            int i211111115 = i14 >> 9;
            bj4Var = bj4VarO;
            mia.b(str1111119, pb9.b(ox6Var3, false, (oh4) objF), j4, 0L, null, 0L, vaaVar2, 0L, i19, false, i20, 0, null, wjaVar3, bj4Var, i211111115 & 896, (i211111115 & 57344) | ((i14 >> 24) & 14) | ((i14 >> 12) & 896) | (29360128 & (i14 << 9)), 109560);
            str6 = str5;
            j5 = j4;
            vaaVar3 = vaaVar2;
            i21 = i19;
            i22 = i20;
            wjaVar4 = wjaVar3;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ika
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextWithSeparatorKt.TextWithSeparator_wV1YYcM$lambda$2(str, str2, ox6Var3, str6, wjaVar4, j5, i21, i22, vaaVar3, i3, i4, (jt1) obj, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    private static final void TextWithSeparatorFirstEmptyPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1116705163);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.m78getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: jka
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextWithSeparatorKt.TextWithSeparatorFirstEmptyPreview$lambda$5(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextWithSeparatorFirstEmptyPreview$lambda$5(int i, jt1 jt1Var, int i2) {
        TextWithSeparatorFirstEmptyPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void TextWithSeparatorPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1364601736);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.m76getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new cv3(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextWithSeparatorPreview$lambda$3(int i, jt1 jt1Var, int i2) {
        TextWithSeparatorPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void TextWithSeparatorSecondEmptyPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1899699287);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.m77getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new cw7(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextWithSeparatorSecondEmptyPreview$lambda$4(int i, jt1 jt1Var, int i2) {
        TextWithSeparatorSecondEmptyPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextWithSeparator_wV1YYcM$lambda$1$lambda$0(String str, String str2, hc9 hc9Var) {
        hc9Var.getClass();
        ec9.b(str + ' ' + str2, hc9Var);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextWithSeparator_wV1YYcM$lambda$2(String str, String str2, ox6 ox6Var, String str3, wja wjaVar, long j, int i, int i2, vaa vaaVar, int i3, int i4, jt1 jt1Var, int i5) {
        m89TextWithSeparatorwV1YYcM(str, str2, ox6Var, str3, wjaVar, j, i, i2, vaaVar, jt1Var, gz3.s(i3 | 1), i4);
        return g2b.a;
    }
}
