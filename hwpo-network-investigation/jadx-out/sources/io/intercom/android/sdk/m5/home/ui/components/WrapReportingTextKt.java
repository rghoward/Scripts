package io.intercom.android.sdk.m5.home.ui.components;

import defpackage.aa0;
import defpackage.as0;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bs0;
import defpackage.ci4;
import defpackage.cz1;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.h37;
import defpackage.jt1;
import defpackage.mh2;
import defpackage.mia;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.ria;
import defpackage.wja;
import defpackage.xj8;
import defpackage.z63;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class WrapReportingTextKt {
    private static final void PreviewShortText(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(381018303);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$WrapReportingTextKt.INSTANCE.m346getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new as0(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewShortText$lambda$8(int i, jt1 jt1Var, int i2) {
        PreviewShortText(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x0118  */
    /* JADX WARN: Code duplicated, block: B:83:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x0121  */
    /* JADX WARN: Code duplicated, block: B:88:0x0160  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: WrapReportingText-T042LqI, reason: not valid java name */
    public static final void m347WrapReportingTextT042LqI(ox6 ox6Var, final String str, final long j, final wja wjaVar, oh4<? super Boolean, g2b> oh4Var, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        String str2;
        long j2;
        wja wjaVar2;
        int i4;
        oh4<? super Boolean, g2b> oh4Var2;
        int i5;
        final ox6 ox6Var3;
        jt1.a.C0187a c0187a;
        int i6;
        final oh4<? super Boolean, g2b> oh4Var3;
        Object objF;
        final h37 h37Var;
        Object objB;
        Object objF2;
        bj4 bj4Var;
        Object objF3;
        xj8 xj8VarW;
        str.getClass();
        wjaVar.getClass();
        bj4 bj4VarO = jt1Var.o(834036955);
        int i7 = i2 & 1;
        int i8 = 2;
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
            j2 = j;
        } else {
            j2 = j;
            if ((i & 384) == 0) {
                i3 |= bj4VarO.i(j2) ? 256 : 128;
            }
        }
        if ((i2 & 8) == 0) {
            if ((i & 3072) == 0) {
                wjaVar2 = wjaVar;
                i3 |= bj4VarO.J(wjaVar2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var2 = oh4Var;
                    if (bj4VarO.j(oh4Var2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                    if (i7 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    c0187a = jt1.a.a;
                    i6 = 1;
                    if (i4 != 0) {
                        bj4VarO.K(1070300984);
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            objF3 = new bs0(i6);
                            bj4VarO.C(objF3);
                        }
                        oh4Var3 = (oh4) objF3;
                        bj4VarO.U(false);
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    bj4VarO.K(1070301976);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = bl7.i(Boolean.FALSE);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    objB = aa0.b(bj4VarO, false, 1070306974);
                    if (objB == c0187a) {
                        objB = new mh2(i8, h37Var);
                        bj4VarO.C(objB);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarE = z63.e(ox6Var3, (oh4) objB);
                    bj4VarO.K(1070309155);
                    i6 = (57344 & i3) != 16384 ? 0 : 1;
                    objF2 = bj4VarO.f();
                    if (i6 == 0 || objF2 == c0187a) {
                        objF2 = new oh4() { // from class: lqb
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6$lambda$5(oh4Var3, h37Var, (ria) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    bj4Var = bj4VarO;
                    mia.b(str2, ox6VarE, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, (oh4) objF2, wjaVar2, bj4Var, ((i3 >> 3) & 14) | (i3 & 896), (i3 << 12) & 29360128, 65528);
                } else {
                    bj4VarO.u();
                    bj4Var = bj4VarO;
                    ox6Var3 = ox6Var2;
                    oh4Var3 = oh4Var2;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: mqb
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$7(ox6Var3, str, j, wjaVar, oh4Var3, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            oh4Var2 = oh4Var;
            if ((i3 & 9363) == 9362) {
                if (i7 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                i6 = 1;
                if (i4 != 0) {
                    bj4VarO.K(1070300984);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new bs0(i6);
                        bj4VarO.C(objF3);
                    }
                    oh4Var3 = (oh4) objF3;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                bj4VarO.K(1070301976);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                objB = aa0.b(bj4VarO, false, 1070306974);
                if (objB == c0187a) {
                    objB = new mh2(i8, h37Var);
                    bj4VarO.C(objB);
                }
                bj4VarO.U(false);
                ox6 ox6VarE2 = z63.e(ox6Var3, (oh4) objB);
                bj4VarO.K(1070309155);
                if ((57344 & i3) != 16384) {
                }
                objF2 = bj4VarO.f();
                if (i6 == 0) {
                    objF2 = new oh4() { // from class: lqb
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6$lambda$5(oh4Var3, h37Var, (ria) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: lqb
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6$lambda$5(oh4Var3, h37Var, (ria) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                mia.b(str2, ox6VarE2, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, (oh4) objF2, wjaVar2, bj4Var, ((i3 >> 3) & 14) | (i3 & 896), (i3 << 12) & 29360128, 65528);
            } else {
                if (i7 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                i6 = 1;
                if (i4 != 0) {
                    bj4VarO.K(1070300984);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new bs0(i6);
                        bj4VarO.C(objF3);
                    }
                    oh4Var3 = (oh4) objF3;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                bj4VarO.K(1070301976);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                objB = aa0.b(bj4VarO, false, 1070306974);
                if (objB == c0187a) {
                    objB = new mh2(i8, h37Var);
                    bj4VarO.C(objB);
                }
                bj4VarO.U(false);
                ox6 ox6VarE3 = z63.e(ox6Var3, (oh4) objB);
                bj4VarO.K(1070309155);
                if ((57344 & i3) != 16384) {
                }
                objF2 = bj4VarO.f();
                if (i6 == 0) {
                    objF2 = new oh4() { // from class: lqb
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6$lambda$5(oh4Var3, h37Var, (ria) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: lqb
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6$lambda$5(oh4Var3, h37Var, (ria) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                mia.b(str2, ox6VarE3, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, (oh4) objF2, wjaVar2, bj4Var, ((i3 >> 3) & 14) | (i3 & 896), (i3 << 12) & 29360128, 65528);
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: mqb
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$7(ox6Var3, str, j, wjaVar, oh4Var3, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        wjaVar2 = wjaVar;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                oh4Var2 = oh4Var;
                if (bj4VarO.j(oh4Var2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) == 9362) {
                if (i7 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                i6 = 1;
                if (i4 != 0) {
                    bj4VarO.K(1070300984);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new bs0(i6);
                        bj4VarO.C(objF3);
                    }
                    oh4Var3 = (oh4) objF3;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                bj4VarO.K(1070301976);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                objB = aa0.b(bj4VarO, false, 1070306974);
                if (objB == c0187a) {
                    objB = new mh2(i8, h37Var);
                    bj4VarO.C(objB);
                }
                bj4VarO.U(false);
                ox6 ox6VarE4 = z63.e(ox6Var3, (oh4) objB);
                bj4VarO.K(1070309155);
                if ((57344 & i3) != 16384) {
                }
                objF2 = bj4VarO.f();
                if (i6 == 0) {
                    objF2 = new oh4() { // from class: lqb
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6$lambda$5(oh4Var3, h37Var, (ria) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: lqb
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6$lambda$5(oh4Var3, h37Var, (ria) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                mia.b(str2, ox6VarE4, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, (oh4) objF2, wjaVar2, bj4Var, ((i3 >> 3) & 14) | (i3 & 896), (i3 << 12) & 29360128, 65528);
            } else {
                if (i7 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                i6 = 1;
                if (i4 != 0) {
                    bj4VarO.K(1070300984);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new bs0(i6);
                        bj4VarO.C(objF3);
                    }
                    oh4Var3 = (oh4) objF3;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                bj4VarO.K(1070301976);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = bl7.i(Boolean.FALSE);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                objB = aa0.b(bj4VarO, false, 1070306974);
                if (objB == c0187a) {
                    objB = new mh2(i8, h37Var);
                    bj4VarO.C(objB);
                }
                bj4VarO.U(false);
                ox6 ox6VarE5 = z63.e(ox6Var3, (oh4) objB);
                bj4VarO.K(1070309155);
                if ((57344 & i3) != 16384) {
                }
                objF2 = bj4VarO.f();
                if (i6 == 0) {
                    objF2 = new oh4() { // from class: lqb
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6$lambda$5(oh4Var3, h37Var, (ria) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: lqb
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6$lambda$5(oh4Var3, h37Var, (ria) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                mia.b(str2, ox6VarE5, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, (oh4) objF2, wjaVar2, bj4Var, ((i3 >> 3) & 14) | (i3 & 896), (i3 << 12) & 29360128, 65528);
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: mqb
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$7(ox6Var3, str, j, wjaVar, oh4Var3, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        oh4Var2 = oh4Var;
        if ((i3 & 9363) == 9362) {
            if (i7 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            c0187a = jt1.a.a;
            i6 = 1;
            if (i4 != 0) {
                bj4VarO.K(1070300984);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new bs0(i6);
                    bj4VarO.C(objF3);
                }
                oh4Var3 = (oh4) objF3;
                bj4VarO.U(false);
            } else {
                oh4Var3 = oh4Var2;
            }
            bj4VarO.K(1070301976);
            objF = bj4VarO.f();
            if (objF == c0187a) {
                objF = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF);
            }
            h37Var = (h37) objF;
            objB = aa0.b(bj4VarO, false, 1070306974);
            if (objB == c0187a) {
                objB = new mh2(i8, h37Var);
                bj4VarO.C(objB);
            }
            bj4VarO.U(false);
            ox6 ox6VarE6 = z63.e(ox6Var3, (oh4) objB);
            bj4VarO.K(1070309155);
            if ((57344 & i3) != 16384) {
            }
            objF2 = bj4VarO.f();
            if (i6 == 0) {
                objF2 = new oh4() { // from class: lqb
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6$lambda$5(oh4Var3, h37Var, (ria) obj);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new oh4() { // from class: lqb
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6$lambda$5(oh4Var3, h37Var, (ria) obj);
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            bj4Var = bj4VarO;
            mia.b(str2, ox6VarE6, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, (oh4) objF2, wjaVar2, bj4Var, ((i3 >> 3) & 14) | (i3 & 896), (i3 << 12) & 29360128, 65528);
        } else {
            if (i7 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            c0187a = jt1.a.a;
            i6 = 1;
            if (i4 != 0) {
                bj4VarO.K(1070300984);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new bs0(i6);
                    bj4VarO.C(objF3);
                }
                oh4Var3 = (oh4) objF3;
                bj4VarO.U(false);
            } else {
                oh4Var3 = oh4Var2;
            }
            bj4VarO.K(1070301976);
            objF = bj4VarO.f();
            if (objF == c0187a) {
                objF = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF);
            }
            h37Var = (h37) objF;
            objB = aa0.b(bj4VarO, false, 1070306974);
            if (objB == c0187a) {
                objB = new mh2(i8, h37Var);
                bj4VarO.C(objB);
            }
            bj4VarO.U(false);
            ox6 ox6VarE7 = z63.e(ox6Var3, (oh4) objB);
            bj4VarO.K(1070309155);
            if ((57344 & i3) != 16384) {
            }
            objF2 = bj4VarO.f();
            if (i6 == 0) {
                objF2 = new oh4() { // from class: lqb
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6$lambda$5(oh4Var3, h37Var, (ria) obj);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new oh4() { // from class: lqb
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6$lambda$5(oh4Var3, h37Var, (ria) obj);
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            bj4Var = bj4VarO;
            mia.b(str2, ox6VarE7, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, (oh4) objF2, wjaVar2, bj4Var, ((i3 >> 3) & 14) | (i3 & 896), (i3 << 12) & 29360128, 65528);
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: mqb
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$7(ox6Var3, str, j, wjaVar, oh4Var3, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b WrapReportingText_T042LqI$lambda$1$lambda$0(boolean z) {
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final g2b WrapReportingText_T042LqI$lambda$4$lambda$3(h37 h37Var, cz1 cz1Var) {
        cz1Var.getClass();
        if (((Boolean) h37Var.getValue()).booleanValue()) {
            cz1Var.K1();
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b WrapReportingText_T042LqI$lambda$6$lambda$5(oh4 oh4Var, h37 h37Var, ria riaVar) {
        riaVar.getClass();
        oh4Var.invoke(Boolean.valueOf(riaVar.b.f > 1));
        h37Var.setValue(Boolean.TRUE);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b WrapReportingText_T042LqI$lambda$7(ox6 ox6Var, String str, long j, wja wjaVar, oh4 oh4Var, int i, int i2, jt1 jt1Var, int i3) {
        m347WrapReportingTextT042LqI(ox6Var, str, j, wjaVar, oh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }
}
