package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class em0 {
    static {
        a53.a(40.0f, 40.0f);
    }

    public static final void a(final kha khaVar, final oh4 oh4Var, final ox6 ox6Var, final boolean z, final wja wjaVar, dp5 dp5Var, bp5 bp5Var, boolean z2, final int i, int i2, ojb ojbVar, oh4 oh4Var2, h27 h27Var, final aw9 aw9Var, final ei4 ei4Var, jt1 jt1Var, final int i3, final int i4) {
        int i5;
        int i6;
        bp5 bp5Var2;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        bj4 bj4Var;
        final dp5 dp5Var2;
        final oh4 oh4Var3;
        final h27 h27Var2;
        final bp5 bp5Var3;
        final int i13;
        final boolean z4;
        final ojb ojbVar2;
        ojb ojbVar3;
        int i14;
        oh4 oh4Var4;
        bp5 bp5Var4;
        boolean z5;
        h27 h27Var3;
        bj4 bj4VarO = jt1Var.o(-971111025);
        int i15 = i3 | (bj4VarO.J(khaVar) ? 4 : 2) | (bj4VarO.j(oh4Var) ? 32 : 16) | (bj4VarO.J(ox6Var) ? 256 : 128) | (bj4VarO.c(z) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024);
        if ((i4 & 16) != 0) {
            i5 = i15 | 24576;
        } else {
            i5 = i15 | (bj4VarO.c(false) ? 16384 : 8192);
        }
        int i16 = i5 | (bj4VarO.J(wjaVar) ? 131072 : 65536);
        int i17 = i4 & 64;
        if (i17 != 0) {
            i6 = i16 | 1572864;
        } else {
            i6 = i16 | (bj4VarO.J(dp5Var) ? 1048576 : 524288);
        }
        int i18 = i4 & 128;
        if (i18 != 0) {
            i7 = i6 | 12582912;
            bp5Var2 = bp5Var;
        } else {
            bp5Var2 = bp5Var;
            i7 = i6 | (bj4VarO.J(bp5Var2) ? 8388608 : 4194304);
        }
        int i19 = i4 & 256;
        if (i19 != 0) {
            i8 = i7 | 100663296;
            z3 = z2;
        } else {
            z3 = z2;
            i8 = i7 | (bj4VarO.c(z3) ? 67108864 : 33554432);
        }
        int i20 = i;
        int i21 = i8 | (bj4VarO.h(i20) ? 536870912 : 268435456);
        int i22 = i4 & 1024;
        if (i22 != 0) {
            i10 = 196614;
            i9 = i2;
        } else {
            i9 = i2;
            i10 = 196608 | (bj4VarO.h(i9) ? 4 : 2);
        }
        int i23 = i4 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
        if (i23 != 0) {
            i11 = i10 | 48;
        } else {
            i11 = i10 | (bj4VarO.J(ojbVar) ? 32 : 16);
        }
        int i24 = i11;
        int i25 = i24 | 384;
        int i26 = i4 & 8192;
        if (i26 != 0) {
            i12 = i24 | 3456;
        } else {
            i12 = i25 | (bj4VarO.J(h27Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024);
        }
        int i27 = i12 | (bj4VarO.J(aw9Var) ? 16384 : 8192);
        if (bj4VarO.A(i21 & 1, ((i21 & 306783379) == 306783378 && (i27 & 74899) == 74898) ? false : true)) {
            bj4VarO.v0();
            int i28 = i3 & 1;
            jt1.a.C0187a c0187a = jt1.a.a;
            if (i28 == 0 || bj4VarO.c0()) {
                dp5Var = i17 != 0 ? dp5.e : dp5Var;
                bp5 bp5Var5 = i18 != 0 ? bp5.c : bp5Var2;
                if (i19 != 0) {
                    z3 = false;
                }
                if (i22 != 0) {
                    i9 = 1;
                }
                ojbVar3 = i23 != 0 ? ojb.a.a : ojbVar;
                Object objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new xl0(0);
                    bj4VarO.C(objF);
                }
                i14 = i9;
                oh4Var4 = (oh4) objF;
                bp5Var4 = bp5Var5;
                z5 = z3;
                h27Var3 = i26 != 0 ? null : h27Var;
            } else {
                bj4VarO.u();
                bp5Var4 = bp5Var2;
                i14 = i9;
                z5 = z3;
                ojbVar3 = ojbVar;
                oh4Var4 = oh4Var2;
                h27Var3 = h27Var;
            }
            dp5 dp5Var3 = dp5Var;
            bj4VarO.V();
            ojb ojbVar4 = ojbVar3;
            s85 s85VarA = dp5Var3.a(z5);
            boolean z6 = z5;
            boolean z7 = !z6;
            int i29 = z6 ? 1 : i14;
            if (z6) {
                i20 = 1;
            }
            boolean z8 = ((i21 & 14) == 4) | ((i21 & 112) == 32);
            Object objF2 = bj4VarO.f();
            if (z8 || objF2 == c0187a) {
                objF2 = new oh4() { // from class: yl0
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        kha khaVar2 = (kha) obj;
                        if (!xj5.a(khaVar, khaVar2)) {
                            oh4Var.invoke(khaVar2);
                        }
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF2);
            }
            int i30 = i27 << 9;
            oh4 oh4Var5 = oh4Var4;
            bj4Var = bj4VarO;
            h27 h27Var4 = h27Var3;
            m62.a(khaVar, (oh4) objF2, ox6Var, wjaVar, ojbVar4, oh4Var5, h27Var4, aw9Var, z7, i20, i29, s85VarA, bp5Var4, z, false, ei4Var, bj4Var, (i21 & 910) | ((i21 >> 6) & 7168) | (i30 & 57344) | 196608 | (i30 & 3670016) | (i30 & 29360128), (i21 & 7168) | ((i21 >> 15) & 896) | (i21 & 57344) | 196608);
            h27Var2 = h27Var4;
            bp5Var3 = bp5Var4;
            ojbVar2 = ojbVar4;
            z4 = z6;
            i13 = i14;
            dp5Var2 = dp5Var3;
            oh4Var3 = oh4Var5;
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
            dp5Var2 = dp5Var;
            oh4Var3 = oh4Var2;
            h27Var2 = h27Var;
            bp5Var3 = bp5Var2;
            i13 = i9;
            z4 = z3;
            ojbVar2 = ojbVar;
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(oh4Var, ox6Var, z, wjaVar, dp5Var2, bp5Var3, z4, i, i13, ojbVar2, oh4Var3, h27Var2, aw9Var, ei4Var, i3, i4) { // from class: zl0
                public final /* synthetic */ boolean A;
                public final /* synthetic */ int B;
                public final /* synthetic */ int C;
                public final /* synthetic */ ojb D;
                public final /* synthetic */ oh4 E;
                public final /* synthetic */ h27 F;
                public final /* synthetic */ aw9 G;
                public final /* synthetic */ ei4 H;
                public final /* synthetic */ int I;
                public final /* synthetic */ oh4 u;
                public final /* synthetic */ ox6 v;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ wja x;
                public final /* synthetic */ dp5 y;
                public final /* synthetic */ bp5 z;

                {
                    this.I = i4;
                }

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    em0.a(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (jt1) obj, iS, this.I);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0130  */
    /* JADX WARN: Code duplicated, block: B:103:0x0134  */
    /* JADX WARN: Code duplicated, block: B:105:0x013e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0141  */
    /* JADX WARN: Code duplicated, block: B:108:0x0146  */
    /* JADX WARN: Code duplicated, block: B:111:0x0155  */
    /* JADX WARN: Code duplicated, block: B:112:0x0158  */
    /* JADX WARN: Code duplicated, block: B:114:0x015c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0165  */
    /* JADX WARN: Code duplicated, block: B:119:0x016c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0176  */
    /* JADX WARN: Code duplicated, block: B:123:0x017d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0183  */
    /* JADX WARN: Code duplicated, block: B:127:0x018b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0190  */
    /* JADX WARN: Code duplicated, block: B:132:0x019a  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:154:0x0208 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x020a  */
    /* JADX WARN: Code duplicated, block: B:157:0x020e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0213 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x0215  */
    /* JADX WARN: Code duplicated, block: B:162:0x0218  */
    /* JADX WARN: Code duplicated, block: B:164:0x021e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0223  */
    /* JADX WARN: Code duplicated, block: B:167:0x0226  */
    /* JADX WARN: Code duplicated, block: B:169:0x022a  */
    /* JADX WARN: Code duplicated, block: B:170:0x022d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0235  */
    /* JADX WARN: Code duplicated, block: B:174:0x0241  */
    /* JADX WARN: Code duplicated, block: B:177:0x0248  */
    /* JADX WARN: Code duplicated, block: B:178:0x024a  */
    /* JADX WARN: Code duplicated, block: B:181:0x0250  */
    /* JADX WARN: Code duplicated, block: B:182:0x025a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0278  */
    /* JADX WARN: Code duplicated, block: B:187:0x028a  */
    /* JADX WARN: Code duplicated, block: B:190:0x02ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:196:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:197:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:200:0x02d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:205:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:208:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:211:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:212:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:215:0x0308 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:216:0x030a  */
    /* JADX WARN: Code duplicated, block: B:218:0x0361  */
    /* JADX WARN: Code duplicated, block: B:221:0x0379  */
    /* JADX WARN: Code duplicated, block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0117  */
    /* JADX WARN: Code duplicated, block: B:94:0x011a  */
    /* JADX WARN: Code duplicated, block: B:96:0x011f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final String str, final oh4 oh4Var, final ox6 ox6Var, boolean z, boolean z2, final wja wjaVar, final dp5 dp5Var, final bp5 bp5Var, final boolean z3, int i, int i2, ojb ojbVar, oh4 oh4Var2, h27 h27Var, fx0 fx0Var, final fr1 fr1Var, jt1 jt1Var, final int i3, final int i4, final int i5) {
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z6;
        bj4 bj4Var;
        final int i23;
        final oh4 oh4Var3;
        final h27 h27Var2;
        final fx0 fx0Var2;
        final boolean z7;
        final boolean z8;
        final ojb ojbVar2;
        final int i24;
        xj8 xj8VarW;
        int i25;
        jt1.a.C0187a c0187a;
        int i26;
        int i27;
        int i28;
        ojb ojbVar3;
        Object objF;
        h27 h27Var3;
        fx0 aw9Var;
        fx0 fx0Var3;
        int i29;
        ojb ojbVar4;
        oh4 oh4Var4;
        boolean z9;
        h27 h27Var4;
        int i30;
        boolean z10;
        Object objF2;
        final h37 h37Var;
        kha khaVar;
        int i31;
        boolean zJ;
        Object objF3;
        int i32;
        int i33;
        Object objF4;
        final h37 h37Var2;
        int i34;
        boolean z11;
        boolean z12;
        Object objF5;
        int i35;
        int i36;
        int i37;
        int i38;
        bj4 bj4VarO = jt1Var.o(2026950908);
        if ((i3 & 6) == 0) {
            i6 = (bj4VarO.J(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= bj4VarO.J(ox6Var) ? 256 : 128;
        }
        int i39 = i5 & 8;
        int i40 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
        if (i39 == 0) {
            if ((i3 & 3072) == 0) {
                z4 = z;
                i6 |= bj4VarO.c(z4) ? 2048 : 1024;
            }
            i7 = i5 & 16;
            if (i7 != 0) {
                if ((i3 & 24576) == 0) {
                    z5 = z2;
                    if (bj4VarO.c(z5)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i6 |= i8;
                }
                if ((i3 & 196608) == 0) {
                    if (bj4VarO.J(wjaVar)) {
                        i38 = 131072;
                    } else {
                        i38 = 65536;
                    }
                    i6 |= i38;
                }
                if ((i3 & 1572864) == 0) {
                    if (bj4VarO.J(dp5Var)) {
                        i37 = 1048576;
                    } else {
                        i37 = 524288;
                    }
                    i6 |= i37;
                }
                if ((i3 & 12582912) == 0) {
                    if (bj4VarO.J(bp5Var)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i6 |= i36;
                }
                if ((i3 & 100663296) == 0) {
                    if (bj4VarO.c(z3)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i6 |= i35;
                }
                if ((i3 & 805306368) == 0) {
                    if ((i5 & 512) == 0) {
                        i9 = i;
                        int i41 = bj4VarO.h(i9) ? 536870912 : 268435456;
                        i6 |= i41;
                    } else {
                        i9 = i;
                    }
                    i6 |= i41;
                } else {
                    i9 = i;
                }
                i10 = i5 & 1024;
                if (i10 != 0) {
                    i11 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    if (bj4VarO.h(i2)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i4 | i12;
                } else {
                    i11 = i4;
                }
                i13 = i5 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                if (i13 != 0) {
                    i11 |= 48;
                } else if ((i4 & 48) != 0) {
                    if (bj4VarO.J(ojbVar)) {
                        i14 = 32;
                    } else {
                        i14 = 16;
                    }
                    i11 |= i14;
                }
                i15 = i11;
                i16 = i6;
                i17 = i15 | 384;
                i18 = i5 & 8192;
                if (i18 != 0) {
                    i19 = i15 | 3456;
                } else if ((i4 & 3072) == 0) {
                    if (!bj4VarO.J(h27Var)) {
                        i40 = 1024;
                    }
                    i19 = i17 | i40;
                } else {
                    i19 = i17;
                }
                i20 = i5 & 16384;
                if (i20 != 0) {
                    i22 = i19 | 24576;
                } else {
                    i21 = i19;
                    if ((i4 & 24576) == 0) {
                        i22 = i21 | (bj4VarO.J(fx0Var) ? 16384 : 8192);
                    } else {
                        i22 = i21;
                    }
                }
                if ((i4 & 196608) == 0) {
                    i22 |= bj4VarO.j(fr1Var) ? 131072 : 65536;
                }
                if ((i16 & 306783379) == 306783378 || (i22 & 74899) != 74898) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (bj4VarO.A(i16 & 1, z6)) {
                    bj4VarO.v0();
                    i25 = i3 & 1;
                    c0187a = jt1.a.a;
                    if (i25 != 0 || bj4VarO.c0()) {
                        if (i39 != 0) {
                            z4 = true;
                        }
                        if (i7 != 0) {
                            z5 = false;
                        }
                        if ((i5 & 512) != 0) {
                            if (z3) {
                                i26 = 1;
                            } else {
                                i26 = Integer.MAX_VALUE;
                            }
                            i27 = i16 & (-1879048193);
                        } else {
                            i26 = i9;
                            i27 = i16;
                        }
                        if (i10 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i2;
                        }
                        if (i13 != 0) {
                            ojbVar3 = ojb.a.a;
                        } else {
                            ojbVar3 = ojbVar;
                        }
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new am0(0);
                            bj4VarO.C(objF);
                        }
                        oh4 oh4Var5 = (oh4) objF;
                        if (i18 != 0) {
                            h27Var3 = null;
                        } else {
                            h27Var3 = h27Var;
                        }
                        if (i20 != 0) {
                            aw9Var = new aw9(uh1.b);
                        } else {
                            aw9Var = fx0Var;
                        }
                        ojb ojbVar5 = ojbVar3;
                        fx0Var3 = aw9Var;
                        i29 = i28;
                        ojbVar4 = ojbVar5;
                        oh4Var4 = oh4Var5;
                        z9 = z4;
                        h27Var4 = h27Var3;
                        i30 = i27;
                        z10 = z5;
                        i9 = i26;
                    } else {
                        bj4VarO.u();
                        if ((i5 & 512) != 0) {
                            ojbVar4 = ojbVar;
                            oh4Var4 = oh4Var2;
                            h27Var4 = h27Var;
                            fx0Var3 = fx0Var;
                            i30 = i16 & (-1879048193);
                            z9 = z4;
                            z10 = z5;
                            i29 = i2;
                        } else {
                            i29 = i2;
                            ojbVar4 = ojbVar;
                            oh4Var4 = oh4Var2;
                            h27Var4 = h27Var;
                            fx0Var3 = fx0Var;
                            i30 = i16;
                            z9 = z4;
                            z10 = z5;
                        }
                    }
                    bj4VarO.V();
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = bl7.i(new kha(6, 0L, str));
                        bj4VarO.C(objF2);
                    }
                    h37Var = (h37) objF2;
                    kha khaVar2 = (kha) h37Var.getValue();
                    i31 = i9;
                    khaVar = new kha(new iw(str), khaVar2.b, khaVar2.c);
                    zJ = bj4VarO.J(khaVar);
                    objF3 = bj4VarO.f();
                    if (!zJ || objF3 == c0187a) {
                        i32 = 0;
                        objF3 = new bm0(i32, khaVar, h37Var);
                        bj4VarO.C(objF3);
                    } else {
                        i32 = 0;
                    }
                    c33 c33Var = wd3.a;
                    bj4VarO.w((mh4) objF3);
                    if ((i30 & 14) == 4) {
                        i33 = 1;
                    } else {
                        i33 = i32;
                    }
                    objF4 = bj4VarO.f();
                    if (i33 == 0 || objF4 == c0187a) {
                        objF4 = bl7.i(str);
                        bj4VarO.C(objF4);
                    }
                    h37Var2 = (h37) objF4;
                    s85 s85VarA = dp5Var.a(z3);
                    int i42 = i22;
                    boolean z13 = !z3;
                    int i43 = z3 ? 1 : i29;
                    if (z3) {
                        i34 = 1;
                    } else {
                        i34 = i31;
                    }
                    boolean zJ2 = bj4VarO.J(h37Var2);
                    if ((i30 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = zJ2 | z11;
                    objF5 = bj4VarO.f();
                    if (z12 || objF5 == c0187a) {
                        objF5 = new oh4() { // from class: cm0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                kha khaVar3 = (kha) obj;
                                h37Var.setValue(khaVar3);
                                h37 h37Var3 = h37Var2;
                                boolean zA = xj5.a((String) h37Var3.getValue(), khaVar3.a.u);
                                iw iwVar = khaVar3.a;
                                h37Var3.setValue(iwVar.u);
                                if (!zA) {
                                    oh4Var.invoke(iwVar.u);
                                }
                                return g2b.a;
                            }
                        };
                        bj4VarO.C(objF5);
                    }
                    int i44 = i42 << 9;
                    bj4Var = bj4VarO;
                    m62.a(khaVar, (oh4) objF5, ox6Var, wjaVar, ojbVar4, oh4Var4, h27Var4, fx0Var3, z13, i34, i43, s85VarA, bp5Var, z9, z10, fr1Var, bj4Var, (i30 & 896) | ((i30 >> 6) & 7168) | (i44 & 57344) | (i44 & 458752) | (i44 & 3670016) | (i44 & 29360128), ((i30 >> 15) & 896) | (i30 & 7168) | (i30 & 57344) | (i42 & 458752));
                    i23 = i29;
                    i24 = i31;
                    ojbVar2 = ojbVar4;
                    oh4Var3 = oh4Var4;
                    h27Var2 = h27Var4;
                    fx0Var2 = fx0Var3;
                    z7 = z9;
                    z8 = z10;
                } else {
                    bj4Var = bj4VarO;
                    bj4Var.u();
                    i23 = i2;
                    oh4Var3 = oh4Var2;
                    h27Var2 = h27Var;
                    fx0Var2 = fx0Var;
                    z7 = z4;
                    z8 = z5;
                    ojbVar2 = ojbVar;
                    i24 = i9;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: dm0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iS = gz3.s(i3 | 1);
                            int iS2 = gz3.s(i4);
                            em0.b(str, oh4Var, ox6Var, z7, z8, wjaVar, dp5Var, bp5Var, z3, i24, i23, ojbVar2, oh4Var3, h27Var2, fx0Var2, fr1Var, (jt1) obj, iS, iS2, i5);
                            return g2b.a;
                        }
                    };
                }
            }
            i6 |= 24576;
            z5 = z2;
            if ((i3 & 196608) == 0) {
                if (bj4VarO.J(wjaVar)) {
                    i38 = 131072;
                } else {
                    i38 = 65536;
                }
                i6 |= i38;
            }
            if ((i3 & 1572864) == 0) {
                if (bj4VarO.J(dp5Var)) {
                    i37 = 1048576;
                } else {
                    i37 = 524288;
                }
                i6 |= i37;
            }
            if ((i3 & 12582912) == 0) {
                if (bj4VarO.J(bp5Var)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i6 |= i36;
            }
            if ((i3 & 100663296) == 0) {
                if (bj4VarO.c(z3)) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i6 |= i35;
            }
            if ((i3 & 805306368) == 0) {
                if ((i5 & 512) == 0) {
                    i9 = i;
                    if (bj4VarO.h(i9)) {
                    }
                    i6 |= i41;
                } else {
                    i9 = i;
                }
                i6 |= i41;
            } else {
                i9 = i;
            }
            i10 = i5 & 1024;
            if (i10 != 0) {
                i11 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                if (bj4VarO.h(i2)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i4 | i12;
            } else {
                i11 = i4;
            }
            i13 = i5 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            if (i13 != 0) {
                i11 |= 48;
            } else if ((i4 & 48) != 0) {
                if (bj4VarO.J(ojbVar)) {
                    i14 = 32;
                } else {
                    i14 = 16;
                }
                i11 |= i14;
            }
            i15 = i11;
            i16 = i6;
            i17 = i15 | 384;
            i18 = i5 & 8192;
            if (i18 != 0) {
                i19 = i15 | 3456;
            } else if ((i4 & 3072) == 0) {
                if (!bj4VarO.J(h27Var)) {
                    i40 = 1024;
                }
                i19 = i17 | i40;
            } else {
                i19 = i17;
            }
            i20 = i5 & 16384;
            if (i20 != 0) {
                i22 = i19 | 24576;
            } else {
                i21 = i19;
                if ((i4 & 24576) == 0) {
                    i22 = i21 | (bj4VarO.J(fx0Var) ? 16384 : 8192);
                } else {
                    i22 = i21;
                }
            }
            if ((i4 & 196608) == 0) {
                i22 |= bj4VarO.j(fr1Var) ? 131072 : 65536;
            }
            if ((i16 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (bj4VarO.A(i16 & 1, z6)) {
                bj4VarO.v0();
                i25 = i3 & 1;
                c0187a = jt1.a.a;
                if (i25 != 0) {
                    if (i39 != 0) {
                        z4 = true;
                    }
                    if (i7 != 0) {
                        z5 = false;
                    }
                    if ((i5 & 512) != 0) {
                        if (z3) {
                            i26 = 1;
                        } else {
                            i26 = Integer.MAX_VALUE;
                        }
                        i27 = i16 & (-1879048193);
                    } else {
                        i26 = i9;
                        i27 = i16;
                    }
                    if (i10 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i2;
                    }
                    if (i13 != 0) {
                        ojbVar3 = ojb.a.a;
                    } else {
                        ojbVar3 = ojbVar;
                    }
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new am0(0);
                        bj4VarO.C(objF);
                    }
                    oh4 oh4Var6 = (oh4) objF;
                    if (i18 != 0) {
                        h27Var3 = null;
                    } else {
                        h27Var3 = h27Var;
                    }
                    if (i20 != 0) {
                        aw9Var = new aw9(uh1.b);
                    } else {
                        aw9Var = fx0Var;
                    }
                    ojb ojbVar6 = ojbVar3;
                    fx0Var3 = aw9Var;
                    i29 = i28;
                    ojbVar4 = ojbVar6;
                    oh4Var4 = oh4Var6;
                    z9 = z4;
                    h27Var4 = h27Var3;
                    i30 = i27;
                    z10 = z5;
                    i9 = i26;
                } else {
                    if (i39 != 0) {
                        z4 = true;
                    }
                    if (i7 != 0) {
                        z5 = false;
                    }
                    if ((i5 & 512) != 0) {
                        if (z3) {
                            i26 = 1;
                        } else {
                            i26 = Integer.MAX_VALUE;
                        }
                        i27 = i16 & (-1879048193);
                    } else {
                        i26 = i9;
                        i27 = i16;
                    }
                    if (i10 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i2;
                    }
                    if (i13 != 0) {
                        ojbVar3 = ojb.a.a;
                    } else {
                        ojbVar3 = ojbVar;
                    }
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new am0(0);
                        bj4VarO.C(objF);
                    }
                    oh4 oh4Var7 = (oh4) objF;
                    if (i18 != 0) {
                        h27Var3 = null;
                    } else {
                        h27Var3 = h27Var;
                    }
                    if (i20 != 0) {
                        aw9Var = new aw9(uh1.b);
                    } else {
                        aw9Var = fx0Var;
                    }
                    ojb ojbVar7 = ojbVar3;
                    fx0Var3 = aw9Var;
                    i29 = i28;
                    ojbVar4 = ojbVar7;
                    oh4Var4 = oh4Var7;
                    z9 = z4;
                    h27Var4 = h27Var3;
                    i30 = i27;
                    z10 = z5;
                    i9 = i26;
                }
                bj4VarO.V();
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = bl7.i(new kha(6, 0L, str));
                    bj4VarO.C(objF2);
                }
                h37Var = (h37) objF2;
                kha khaVar3 = (kha) h37Var.getValue();
                i31 = i9;
                khaVar = new kha(new iw(str), khaVar3.b, khaVar3.c);
                zJ = bj4VarO.J(khaVar);
                objF3 = bj4VarO.f();
                if (zJ) {
                    i32 = 0;
                    objF3 = new bm0(i32, khaVar, h37Var);
                    bj4VarO.C(objF3);
                } else {
                    i32 = 0;
                    objF3 = new bm0(i32, khaVar, h37Var);
                    bj4VarO.C(objF3);
                }
                c33 c33Var2 = wd3.a;
                bj4VarO.w((mh4) objF3);
                if ((i30 & 14) == 4) {
                    i33 = 1;
                } else {
                    i33 = i32;
                }
                objF4 = bj4VarO.f();
                if (i33 == 0) {
                    objF4 = bl7.i(str);
                    bj4VarO.C(objF4);
                } else {
                    objF4 = bl7.i(str);
                    bj4VarO.C(objF4);
                }
                h37Var2 = (h37) objF4;
                s85 s85VarA2 = dp5Var.a(z3);
                int i45 = i22;
                boolean z14 = !z3;
                if (z3) {
                }
                if (z3) {
                    i34 = 1;
                } else {
                    i34 = i31;
                }
                boolean zJ3 = bj4VarO.J(h37Var2);
                if ((i30 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zJ3 | z11;
                objF5 = bj4VarO.f();
                if (z12) {
                    objF5 = new oh4() { // from class: cm0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            kha khaVar4 = (kha) obj;
                            h37Var.setValue(khaVar4);
                            h37 h37Var3 = h37Var2;
                            boolean zA = xj5.a((String) h37Var3.getValue(), khaVar4.a.u);
                            iw iwVar = khaVar4.a;
                            h37Var3.setValue(iwVar.u);
                            if (!zA) {
                                oh4Var.invoke(iwVar.u);
                            }
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF5);
                } else {
                    objF5 = new oh4() { // from class: cm0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            kha khaVar4 = (kha) obj;
                            h37Var.setValue(khaVar4);
                            h37 h37Var3 = h37Var2;
                            boolean zA = xj5.a((String) h37Var3.getValue(), khaVar4.a.u);
                            iw iwVar = khaVar4.a;
                            h37Var3.setValue(iwVar.u);
                            if (!zA) {
                                oh4Var.invoke(iwVar.u);
                            }
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF5);
                }
                int i46 = i45 << 9;
                bj4Var = bj4VarO;
                m62.a(khaVar, (oh4) objF5, ox6Var, wjaVar, ojbVar4, oh4Var4, h27Var4, fx0Var3, z14, i34, i43, s85VarA2, bp5Var, z9, z10, fr1Var, bj4Var, (i30 & 896) | ((i30 >> 6) & 7168) | (i46 & 57344) | (i46 & 458752) | (i46 & 3670016) | (i46 & 29360128), ((i30 >> 15) & 896) | (i30 & 7168) | (i30 & 57344) | (i45 & 458752));
                i23 = i29;
                i24 = i31;
                ojbVar2 = ojbVar4;
                oh4Var3 = oh4Var4;
                h27Var2 = h27Var4;
                fx0Var2 = fx0Var3;
                z7 = z9;
                z8 = z10;
            } else {
                bj4Var = bj4VarO;
                bj4Var.u();
                i23 = i2;
                oh4Var3 = oh4Var2;
                h27Var2 = h27Var;
                fx0Var2 = fx0Var;
                z7 = z4;
                z8 = z5;
                ojbVar2 = ojbVar;
                i24 = i9;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: dm0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iS = gz3.s(i3 | 1);
                        int iS2 = gz3.s(i4);
                        em0.b(str, oh4Var, ox6Var, z7, z8, wjaVar, dp5Var, bp5Var, z3, i24, i23, ojbVar2, oh4Var3, h27Var2, fx0Var2, fr1Var, (jt1) obj, iS, iS2, i5);
                        return g2b.a;
                    }
                };
            }
        }
        i6 |= 3072;
        z4 = z;
        i7 = i5 & 16;
        if (i7 != 0) {
            if ((i3 & 24576) == 0) {
                z5 = z2;
                if (bj4VarO.c(z5)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i6 |= i8;
            }
            if ((i3 & 196608) == 0) {
                if (bj4VarO.J(wjaVar)) {
                    i38 = 131072;
                } else {
                    i38 = 65536;
                }
                i6 |= i38;
            }
            if ((i3 & 1572864) == 0) {
                if (bj4VarO.J(dp5Var)) {
                    i37 = 1048576;
                } else {
                    i37 = 524288;
                }
                i6 |= i37;
            }
            if ((i3 & 12582912) == 0) {
                if (bj4VarO.J(bp5Var)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i6 |= i36;
            }
            if ((i3 & 100663296) == 0) {
                if (bj4VarO.c(z3)) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i6 |= i35;
            }
            if ((i3 & 805306368) == 0) {
                if ((i5 & 512) == 0) {
                    i9 = i;
                    if (bj4VarO.h(i9)) {
                    }
                    i6 |= i41;
                } else {
                    i9 = i;
                }
                i6 |= i41;
            } else {
                i9 = i;
            }
            i10 = i5 & 1024;
            if (i10 != 0) {
                i11 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                if (bj4VarO.h(i2)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i4 | i12;
            } else {
                i11 = i4;
            }
            i13 = i5 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            if (i13 != 0) {
                i11 |= 48;
            } else if ((i4 & 48) != 0) {
                if (bj4VarO.J(ojbVar)) {
                    i14 = 32;
                } else {
                    i14 = 16;
                }
                i11 |= i14;
            }
            i15 = i11;
            i16 = i6;
            i17 = i15 | 384;
            i18 = i5 & 8192;
            if (i18 != 0) {
                i19 = i15 | 3456;
            } else if ((i4 & 3072) == 0) {
                if (!bj4VarO.J(h27Var)) {
                    i40 = 1024;
                }
                i19 = i17 | i40;
            } else {
                i19 = i17;
            }
            i20 = i5 & 16384;
            if (i20 != 0) {
                i22 = i19 | 24576;
            } else {
                i21 = i19;
                if ((i4 & 24576) == 0) {
                    i22 = i21 | (bj4VarO.J(fx0Var) ? 16384 : 8192);
                } else {
                    i22 = i21;
                }
            }
            if ((i4 & 196608) == 0) {
                i22 |= bj4VarO.j(fr1Var) ? 131072 : 65536;
            }
            if ((i16 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (bj4VarO.A(i16 & 1, z6)) {
                bj4VarO.v0();
                i25 = i3 & 1;
                c0187a = jt1.a.a;
                if (i25 != 0) {
                    if (i39 != 0) {
                        z4 = true;
                    }
                    if (i7 != 0) {
                        z5 = false;
                    }
                    if ((i5 & 512) != 0) {
                        if (z3) {
                            i26 = 1;
                        } else {
                            i26 = Integer.MAX_VALUE;
                        }
                        i27 = i16 & (-1879048193);
                    } else {
                        i26 = i9;
                        i27 = i16;
                    }
                    if (i10 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i2;
                    }
                    if (i13 != 0) {
                        ojbVar3 = ojb.a.a;
                    } else {
                        ojbVar3 = ojbVar;
                    }
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new am0(0);
                        bj4VarO.C(objF);
                    }
                    oh4 oh4Var8 = (oh4) objF;
                    if (i18 != 0) {
                        h27Var3 = null;
                    } else {
                        h27Var3 = h27Var;
                    }
                    if (i20 != 0) {
                        aw9Var = new aw9(uh1.b);
                    } else {
                        aw9Var = fx0Var;
                    }
                    ojb ojbVar8 = ojbVar3;
                    fx0Var3 = aw9Var;
                    i29 = i28;
                    ojbVar4 = ojbVar8;
                    oh4Var4 = oh4Var8;
                    z9 = z4;
                    h27Var4 = h27Var3;
                    i30 = i27;
                    z10 = z5;
                    i9 = i26;
                } else {
                    if (i39 != 0) {
                        z4 = true;
                    }
                    if (i7 != 0) {
                        z5 = false;
                    }
                    if ((i5 & 512) != 0) {
                        if (z3) {
                            i26 = 1;
                        } else {
                            i26 = Integer.MAX_VALUE;
                        }
                        i27 = i16 & (-1879048193);
                    } else {
                        i26 = i9;
                        i27 = i16;
                    }
                    if (i10 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i2;
                    }
                    if (i13 != 0) {
                        ojbVar3 = ojb.a.a;
                    } else {
                        ojbVar3 = ojbVar;
                    }
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new am0(0);
                        bj4VarO.C(objF);
                    }
                    oh4 oh4Var9 = (oh4) objF;
                    if (i18 != 0) {
                        h27Var3 = null;
                    } else {
                        h27Var3 = h27Var;
                    }
                    if (i20 != 0) {
                        aw9Var = new aw9(uh1.b);
                    } else {
                        aw9Var = fx0Var;
                    }
                    ojb ojbVar9 = ojbVar3;
                    fx0Var3 = aw9Var;
                    i29 = i28;
                    ojbVar4 = ojbVar9;
                    oh4Var4 = oh4Var9;
                    z9 = z4;
                    h27Var4 = h27Var3;
                    i30 = i27;
                    z10 = z5;
                    i9 = i26;
                }
                bj4VarO.V();
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = bl7.i(new kha(6, 0L, str));
                    bj4VarO.C(objF2);
                }
                h37Var = (h37) objF2;
                kha khaVar4 = (kha) h37Var.getValue();
                i31 = i9;
                khaVar = new kha(new iw(str), khaVar4.b, khaVar4.c);
                zJ = bj4VarO.J(khaVar);
                objF3 = bj4VarO.f();
                if (zJ) {
                    i32 = 0;
                    objF3 = new bm0(i32, khaVar, h37Var);
                    bj4VarO.C(objF3);
                } else {
                    i32 = 0;
                    objF3 = new bm0(i32, khaVar, h37Var);
                    bj4VarO.C(objF3);
                }
                c33 c33Var3 = wd3.a;
                bj4VarO.w((mh4) objF3);
                if ((i30 & 14) == 4) {
                    i33 = 1;
                } else {
                    i33 = i32;
                }
                objF4 = bj4VarO.f();
                if (i33 == 0) {
                    objF4 = bl7.i(str);
                    bj4VarO.C(objF4);
                } else {
                    objF4 = bl7.i(str);
                    bj4VarO.C(objF4);
                }
                h37Var2 = (h37) objF4;
                s85 s85VarA3 = dp5Var.a(z3);
                int i47 = i22;
                boolean z15 = !z3;
                if (z3) {
                }
                if (z3) {
                    i34 = 1;
                } else {
                    i34 = i31;
                }
                boolean zJ4 = bj4VarO.J(h37Var2);
                if ((i30 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = zJ4 | z11;
                objF5 = bj4VarO.f();
                if (z12) {
                    objF5 = new oh4() { // from class: cm0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            kha khaVar5 = (kha) obj;
                            h37Var.setValue(khaVar5);
                            h37 h37Var3 = h37Var2;
                            boolean zA = xj5.a((String) h37Var3.getValue(), khaVar5.a.u);
                            iw iwVar = khaVar5.a;
                            h37Var3.setValue(iwVar.u);
                            if (!zA) {
                                oh4Var.invoke(iwVar.u);
                            }
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF5);
                } else {
                    objF5 = new oh4() { // from class: cm0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            kha khaVar5 = (kha) obj;
                            h37Var.setValue(khaVar5);
                            h37 h37Var3 = h37Var2;
                            boolean zA = xj5.a((String) h37Var3.getValue(), khaVar5.a.u);
                            iw iwVar = khaVar5.a;
                            h37Var3.setValue(iwVar.u);
                            if (!zA) {
                                oh4Var.invoke(iwVar.u);
                            }
                            return g2b.a;
                        }
                    };
                    bj4VarO.C(objF5);
                }
                int i48 = i47 << 9;
                bj4Var = bj4VarO;
                m62.a(khaVar, (oh4) objF5, ox6Var, wjaVar, ojbVar4, oh4Var4, h27Var4, fx0Var3, z15, i34, i43, s85VarA3, bp5Var, z9, z10, fr1Var, bj4Var, (i30 & 896) | ((i30 >> 6) & 7168) | (i48 & 57344) | (i48 & 458752) | (i48 & 3670016) | (i48 & 29360128), ((i30 >> 15) & 896) | (i30 & 7168) | (i30 & 57344) | (i47 & 458752));
                i23 = i29;
                i24 = i31;
                ojbVar2 = ojbVar4;
                oh4Var3 = oh4Var4;
                h27Var2 = h27Var4;
                fx0Var2 = fx0Var3;
                z7 = z9;
                z8 = z10;
            } else {
                bj4Var = bj4VarO;
                bj4Var.u();
                i23 = i2;
                oh4Var3 = oh4Var2;
                h27Var2 = h27Var;
                fx0Var2 = fx0Var;
                z7 = z4;
                z8 = z5;
                ojbVar2 = ojbVar;
                i24 = i9;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: dm0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iS = gz3.s(i3 | 1);
                        int iS2 = gz3.s(i4);
                        em0.b(str, oh4Var, ox6Var, z7, z8, wjaVar, dp5Var, bp5Var, z3, i24, i23, ojbVar2, oh4Var3, h27Var2, fx0Var2, fr1Var, (jt1) obj, iS, iS2, i5);
                        return g2b.a;
                    }
                };
            }
        }
        i6 |= 24576;
        z5 = z2;
        if ((i3 & 196608) == 0) {
            if (bj4VarO.J(wjaVar)) {
                i38 = 131072;
            } else {
                i38 = 65536;
            }
            i6 |= i38;
        }
        if ((i3 & 1572864) == 0) {
            if (bj4VarO.J(dp5Var)) {
                i37 = 1048576;
            } else {
                i37 = 524288;
            }
            i6 |= i37;
        }
        if ((i3 & 12582912) == 0) {
            if (bj4VarO.J(bp5Var)) {
                i36 = 8388608;
            } else {
                i36 = 4194304;
            }
            i6 |= i36;
        }
        if ((i3 & 100663296) == 0) {
            if (bj4VarO.c(z3)) {
                i35 = 67108864;
            } else {
                i35 = 33554432;
            }
            i6 |= i35;
        }
        if ((i3 & 805306368) == 0) {
            if ((i5 & 512) == 0) {
                i9 = i;
                if (bj4VarO.h(i9)) {
                }
                i6 |= i41;
            } else {
                i9 = i;
            }
            i6 |= i41;
        } else {
            i9 = i;
        }
        i10 = i5 & 1024;
        if (i10 != 0) {
            i11 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (bj4VarO.h(i2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i4 | i12;
        } else {
            i11 = i4;
        }
        i13 = i5 & AudioConstants.AUDIO_FILE_BUFFER_SIZE;
        if (i13 != 0) {
            i11 |= 48;
        } else if ((i4 & 48) != 0) {
            if (bj4VarO.J(ojbVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        i15 = i11;
        i16 = i6;
        i17 = i15 | 384;
        i18 = i5 & 8192;
        if (i18 != 0) {
            i19 = i15 | 3456;
        } else if ((i4 & 3072) == 0) {
            if (!bj4VarO.J(h27Var)) {
                i40 = 1024;
            }
            i19 = i17 | i40;
        } else {
            i19 = i17;
        }
        i20 = i5 & 16384;
        if (i20 != 0) {
            i22 = i19 | 24576;
        } else {
            i21 = i19;
            if ((i4 & 24576) == 0) {
                i22 = i21 | (bj4VarO.J(fx0Var) ? 16384 : 8192);
            } else {
                i22 = i21;
            }
        }
        if ((i4 & 196608) == 0) {
            i22 |= bj4VarO.j(fr1Var) ? 131072 : 65536;
        }
        if ((i16 & 306783379) == 306783378) {
            z6 = true;
        } else {
            z6 = true;
        }
        if (bj4VarO.A(i16 & 1, z6)) {
            bj4VarO.v0();
            i25 = i3 & 1;
            c0187a = jt1.a.a;
            if (i25 != 0) {
                if (i39 != 0) {
                    z4 = true;
                }
                if (i7 != 0) {
                    z5 = false;
                }
                if ((i5 & 512) != 0) {
                    if (z3) {
                        i26 = 1;
                    } else {
                        i26 = Integer.MAX_VALUE;
                    }
                    i27 = i16 & (-1879048193);
                } else {
                    i26 = i9;
                    i27 = i16;
                }
                if (i10 != 0) {
                    i28 = 1;
                } else {
                    i28 = i2;
                }
                if (i13 != 0) {
                    ojbVar3 = ojb.a.a;
                } else {
                    ojbVar3 = ojbVar;
                }
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new am0(0);
                    bj4VarO.C(objF);
                }
                oh4 oh4Var10 = (oh4) objF;
                if (i18 != 0) {
                    h27Var3 = null;
                } else {
                    h27Var3 = h27Var;
                }
                if (i20 != 0) {
                    aw9Var = new aw9(uh1.b);
                } else {
                    aw9Var = fx0Var;
                }
                ojb ojbVar10 = ojbVar3;
                fx0Var3 = aw9Var;
                i29 = i28;
                ojbVar4 = ojbVar10;
                oh4Var4 = oh4Var10;
                z9 = z4;
                h27Var4 = h27Var3;
                i30 = i27;
                z10 = z5;
                i9 = i26;
            } else {
                if (i39 != 0) {
                    z4 = true;
                }
                if (i7 != 0) {
                    z5 = false;
                }
                if ((i5 & 512) != 0) {
                    if (z3) {
                        i26 = 1;
                    } else {
                        i26 = Integer.MAX_VALUE;
                    }
                    i27 = i16 & (-1879048193);
                } else {
                    i26 = i9;
                    i27 = i16;
                }
                if (i10 != 0) {
                    i28 = 1;
                } else {
                    i28 = i2;
                }
                if (i13 != 0) {
                    ojbVar3 = ojb.a.a;
                } else {
                    ojbVar3 = ojbVar;
                }
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new am0(0);
                    bj4VarO.C(objF);
                }
                oh4 oh4Var11 = (oh4) objF;
                if (i18 != 0) {
                    h27Var3 = null;
                } else {
                    h27Var3 = h27Var;
                }
                if (i20 != 0) {
                    aw9Var = new aw9(uh1.b);
                } else {
                    aw9Var = fx0Var;
                }
                ojb ojbVar11 = ojbVar3;
                fx0Var3 = aw9Var;
                i29 = i28;
                ojbVar4 = ojbVar11;
                oh4Var4 = oh4Var11;
                z9 = z4;
                h27Var4 = h27Var3;
                i30 = i27;
                z10 = z5;
                i9 = i26;
            }
            bj4VarO.V();
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = bl7.i(new kha(6, 0L, str));
                bj4VarO.C(objF2);
            }
            h37Var = (h37) objF2;
            kha khaVar5 = (kha) h37Var.getValue();
            i31 = i9;
            khaVar = new kha(new iw(str), khaVar5.b, khaVar5.c);
            zJ = bj4VarO.J(khaVar);
            objF3 = bj4VarO.f();
            if (zJ) {
                i32 = 0;
                objF3 = new bm0(i32, khaVar, h37Var);
                bj4VarO.C(objF3);
            } else {
                i32 = 0;
                objF3 = new bm0(i32, khaVar, h37Var);
                bj4VarO.C(objF3);
            }
            c33 c33Var4 = wd3.a;
            bj4VarO.w((mh4) objF3);
            if ((i30 & 14) == 4) {
                i33 = 1;
            } else {
                i33 = i32;
            }
            objF4 = bj4VarO.f();
            if (i33 == 0) {
                objF4 = bl7.i(str);
                bj4VarO.C(objF4);
            } else {
                objF4 = bl7.i(str);
                bj4VarO.C(objF4);
            }
            h37Var2 = (h37) objF4;
            s85 s85VarA4 = dp5Var.a(z3);
            int i49 = i22;
            boolean z16 = !z3;
            if (z3) {
            }
            if (z3) {
                i34 = 1;
            } else {
                i34 = i31;
            }
            boolean zJ5 = bj4VarO.J(h37Var2);
            if ((i30 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = zJ5 | z11;
            objF5 = bj4VarO.f();
            if (z12) {
                objF5 = new oh4() { // from class: cm0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        kha khaVar6 = (kha) obj;
                        h37Var.setValue(khaVar6);
                        h37 h37Var3 = h37Var2;
                        boolean zA = xj5.a((String) h37Var3.getValue(), khaVar6.a.u);
                        iw iwVar = khaVar6.a;
                        h37Var3.setValue(iwVar.u);
                        if (!zA) {
                            oh4Var.invoke(iwVar.u);
                        }
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF5);
            } else {
                objF5 = new oh4() { // from class: cm0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        kha khaVar6 = (kha) obj;
                        h37Var.setValue(khaVar6);
                        h37 h37Var3 = h37Var2;
                        boolean zA = xj5.a((String) h37Var3.getValue(), khaVar6.a.u);
                        iw iwVar = khaVar6.a;
                        h37Var3.setValue(iwVar.u);
                        if (!zA) {
                            oh4Var.invoke(iwVar.u);
                        }
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF5);
            }
            int i410 = i49 << 9;
            bj4Var = bj4VarO;
            m62.a(khaVar, (oh4) objF5, ox6Var, wjaVar, ojbVar4, oh4Var4, h27Var4, fx0Var3, z16, i34, i43, s85VarA4, bp5Var, z9, z10, fr1Var, bj4Var, (i30 & 896) | ((i30 >> 6) & 7168) | (i410 & 57344) | (i410 & 458752) | (i410 & 3670016) | (i410 & 29360128), ((i30 >> 15) & 896) | (i30 & 7168) | (i30 & 57344) | (i49 & 458752));
            i23 = i29;
            i24 = i31;
            ojbVar2 = ojbVar4;
            oh4Var3 = oh4Var4;
            h27Var2 = h27Var4;
            fx0Var2 = fx0Var3;
            z7 = z9;
            z8 = z10;
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
            i23 = i2;
            oh4Var3 = oh4Var2;
            h27Var2 = h27Var;
            fx0Var2 = fx0Var;
            z7 = z4;
            z8 = z5;
            ojbVar2 = ojbVar;
            i24 = i9;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: dm0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i3 | 1);
                    int iS2 = gz3.s(i4);
                    em0.b(str, oh4Var, ox6Var, z7, z8, wjaVar, dp5Var, bp5Var, z3, i24, i23, ojbVar2, oh4Var3, h27Var2, fx0Var2, fr1Var, (jt1) obj, iS, iS2, i5);
                    return g2b.a;
                }
            };
        }
    }
}
