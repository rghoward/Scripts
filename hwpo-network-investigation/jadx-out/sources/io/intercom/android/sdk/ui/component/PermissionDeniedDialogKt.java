package io.intercom.android.sdk.ui.component;

import com.intercom.twig.BuildConfig;
import defpackage.ah5;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.cw7;
import defpackage.dw7;
import defpackage.ei4;
import defpackage.ek;
import defpackage.ew7;
import defpackage.f03;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.jt1;
import defpackage.jz0;
import defpackage.kk;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.wja;
import defpackage.xj8;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PermissionDeniedDialogKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x0122  */
    public static final void PermissionDeniedDialog(ox6 ox6Var, final String str, final String str2, final String str3, Integer num, mh4<g2b> mh4Var, mh4<g2b> mh4Var2, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        Integer num2;
        int i4;
        mh4<g2b> mh4Var3;
        int i5;
        int i6;
        mh4<g2b> mh4Var4;
        int i7;
        final ox6 ox6Var3;
        final Integer num3;
        jt1.a.C0187a c0187a;
        final mh4<g2b> mh4Var5;
        final mh4<g2b> mh4Var6;
        bj4 bj4Var;
        final mh4<g2b> mh4Var7;
        Object objF;
        Object objF2;
        xj8 xj8VarW;
        str.getClass();
        str2.getClass();
        str3.getClass();
        bj4 bj4VarO = jt1Var.o(-537034576);
        int i8 = i2 & 1;
        if (i8 != 0) {
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
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.J(str2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.J(str3) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        int i9 = i2 & 16;
        if (i9 == 0) {
            if ((i & 24576) == 0) {
                num2 = num;
                i3 |= bj4VarO.J(num2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    mh4Var3 = mh4Var;
                    if (bj4VarO.j(mh4Var3)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    if ((1572864 & i) == 0) {
                        mh4Var4 = mh4Var2;
                        if (bj4VarO.j(mh4Var4)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                    if ((599187 & i3) == 599186 || !bj4VarO.r()) {
                        if (i8 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i9 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-511130677);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new dw7();
                                bj4VarO.C(objF2);
                            }
                            mh4Var5 = (mh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            mh4Var5 = mh4Var3;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-511129653);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new ew7();
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            mh4Var6 = (mh4) objF;
                        } else {
                            mh4Var6 = mh4Var4;
                        }
                        mh4<g2b> mh4Var8 = mh4Var5;
                        bj4Var = bj4VarO;
                        ek.a(mh4Var8, gr1.b(-1474258584, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                            public final void invoke(jt1 jt1Var2, int i10) {
                                if ((i10 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                mh4<g2b> mh4Var9 = mh4Var6;
                                final String str4 = str2;
                                jz0.c(mh4Var9, null, false, null, null, null, gr1.b(2118877259, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                    public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                        oy8Var.getClass();
                                        if ((i11 & 17) == 16 && jt1Var3.r()) {
                                            jt1Var3.u();
                                            return;
                                        }
                                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                        wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                        mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                                    }

                                    @Override // defpackage.ei4
                                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                        invoke(oy8Var, jt1Var3, num4.intValue());
                                        return g2b.a;
                                    }
                                }, jt1Var2), jt1Var2, 805306368, 510);
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                                invoke(jt1Var2, num4.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), ox6Var3, gr1.b(-868483802, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                            public final void invoke(jt1 jt1Var2, int i10) {
                                if ((i10 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                mh4<g2b> mh4Var9 = mh4Var5;
                                final String str4 = str3;
                                jz0.c(mh4Var9, null, false, null, null, null, gr1.b(-1570315255, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                    public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                        oy8Var.getClass();
                                        if ((i11 & 17) == 16 && jt1Var3.r()) {
                                            jt1Var3.u();
                                            return;
                                        }
                                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                        wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                        mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                                    }

                                    @Override // defpackage.ei4
                                    public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                        invoke(oy8Var, jt1Var3, num4.intValue());
                                        return g2b.a;
                                    }
                                }, jt1Var2), jt1Var2, 805306368, 510);
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                                invoke(jt1Var2, num4.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), gr1.b(-565596411, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                            public final void invoke(jt1 jt1Var2, int i10) {
                                if ((i10 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                Integer num4 = num3;
                                if (num4 == null) {
                                    return;
                                }
                                m65.b(is7.a(num4.intValue(), jt1Var2, 0), BuildConfig.FLAVOR, ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, 6).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                                invoke(jt1Var2, num4.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, gr1.b(40178371, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                            public final void invoke(jt1 jt1Var2, int i10) {
                                if ((i10 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                wja type04 = intercomTheme.getTypography(jt1Var2, 6).getType04();
                                mia.b(str, null, ah5.a(intercomTheme, jt1Var2, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                                invoke(jt1Var2, num4.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), null, kk.a(IntercomTheme.INSTANCE, bj4VarO, 6), 0L, 0L, 0L, new f03(5), bj4Var, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
                        mh4Var7 = mh4Var8;
                    } else {
                        bj4VarO.u();
                        bj4Var = bj4VarO;
                        ox6Var3 = ox6Var2;
                        num3 = num2;
                        mh4Var7 = mh4Var3;
                        mh4Var6 = mh4Var4;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: fw7
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$4(ox6Var3, str, str2, str3, num3, mh4Var7, mh4Var6, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 1572864;
                mh4Var4 = mh4Var2;
                if ((599187 & i3) == 599186) {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-511130677);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new dw7();
                            bj4VarO.C(objF2);
                        }
                        mh4Var5 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-511129653);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new ew7();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        mh4Var6 = (mh4) objF;
                    } else {
                        mh4Var6 = mh4Var4;
                    }
                    mh4<g2b> mh4Var9 = mh4Var5;
                    bj4Var = bj4VarO;
                    ek.a(mh4Var9, gr1.b(-1474258584, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            mh4<g2b> mh4Var10 = mh4Var6;
                            final String str4 = str2;
                            jz0.c(mh4Var10, null, false, null, null, null, gr1.b(2118877259, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                    oy8Var.getClass();
                                    if ((i11 & 17) == 16 && jt1Var3.r()) {
                                        jt1Var3.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                    mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                    invoke(oy8Var, jt1Var3, num4.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, 805306368, 510);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ox6Var3, gr1.b(-868483802, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            mh4<g2b> mh4Var10 = mh4Var5;
                            final String str4 = str3;
                            jz0.c(mh4Var10, null, false, null, null, null, gr1.b(-1570315255, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                    oy8Var.getClass();
                                    if ((i11 & 17) == 16 && jt1Var3.r()) {
                                        jt1Var3.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                    mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                    invoke(oy8Var, jt1Var3, num4.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, 805306368, 510);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), gr1.b(-565596411, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            m65.b(is7.a(num4.intValue(), jt1Var2, 0), BuildConfig.FLAVOR, ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, 6).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, gr1.b(40178371, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            wja type04 = intercomTheme.getTypography(jt1Var2, 6).getType04();
                            mia.b(str, null, ah5.a(intercomTheme, jt1Var2, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, kk.a(IntercomTheme.INSTANCE, bj4VarO, 6), 0L, 0L, 0L, new f03(5), bj4Var, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
                    mh4Var7 = mh4Var9;
                } else {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-511130677);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new dw7();
                            bj4VarO.C(objF2);
                        }
                        mh4Var5 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-511129653);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new ew7();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        mh4Var6 = (mh4) objF;
                    } else {
                        mh4Var6 = mh4Var4;
                    }
                    mh4<g2b> mh4Var10 = mh4Var5;
                    bj4Var = bj4VarO;
                    ek.a(mh4Var10, gr1.b(-1474258584, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            mh4<g2b> mh4Var11 = mh4Var6;
                            final String str4 = str2;
                            jz0.c(mh4Var11, null, false, null, null, null, gr1.b(2118877259, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                    oy8Var.getClass();
                                    if ((i11 & 17) == 16 && jt1Var3.r()) {
                                        jt1Var3.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                    mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                    invoke(oy8Var, jt1Var3, num4.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, 805306368, 510);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ox6Var3, gr1.b(-868483802, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            mh4<g2b> mh4Var11 = mh4Var5;
                            final String str4 = str3;
                            jz0.c(mh4Var11, null, false, null, null, null, gr1.b(-1570315255, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                    oy8Var.getClass();
                                    if ((i11 & 17) == 16 && jt1Var3.r()) {
                                        jt1Var3.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                    mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                    invoke(oy8Var, jt1Var3, num4.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, 805306368, 510);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), gr1.b(-565596411, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            m65.b(is7.a(num4.intValue(), jt1Var2, 0), BuildConfig.FLAVOR, ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, 6).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, gr1.b(40178371, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            wja type04 = intercomTheme.getTypography(jt1Var2, 6).getType04();
                            mia.b(str, null, ah5.a(intercomTheme, jt1Var2, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, kk.a(IntercomTheme.INSTANCE, bj4VarO, 6), 0L, 0L, 0L, new f03(5), bj4Var, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
                    mh4Var7 = mh4Var10;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: fw7
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$4(ox6Var3, str, str2, str3, num3, mh4Var7, mh4Var6, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            mh4Var3 = mh4Var;
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    mh4Var4 = mh4Var2;
                    if (bj4VarO.j(mh4Var4)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((599187 & i3) == 599186) {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-511130677);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new dw7();
                            bj4VarO.C(objF2);
                        }
                        mh4Var5 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-511129653);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new ew7();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        mh4Var6 = (mh4) objF;
                    } else {
                        mh4Var6 = mh4Var4;
                    }
                    mh4<g2b> mh4Var11 = mh4Var5;
                    bj4Var = bj4VarO;
                    ek.a(mh4Var11, gr1.b(-1474258584, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            mh4<g2b> mh4Var12 = mh4Var6;
                            final String str4 = str2;
                            jz0.c(mh4Var12, null, false, null, null, null, gr1.b(2118877259, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                    oy8Var.getClass();
                                    if ((i11 & 17) == 16 && jt1Var3.r()) {
                                        jt1Var3.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                    mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                    invoke(oy8Var, jt1Var3, num4.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, 805306368, 510);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ox6Var3, gr1.b(-868483802, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            mh4<g2b> mh4Var12 = mh4Var5;
                            final String str4 = str3;
                            jz0.c(mh4Var12, null, false, null, null, null, gr1.b(-1570315255, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                    oy8Var.getClass();
                                    if ((i11 & 17) == 16 && jt1Var3.r()) {
                                        jt1Var3.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                    mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                    invoke(oy8Var, jt1Var3, num4.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, 805306368, 510);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), gr1.b(-565596411, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            m65.b(is7.a(num4.intValue(), jt1Var2, 0), BuildConfig.FLAVOR, ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, 6).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, gr1.b(40178371, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            wja type04 = intercomTheme.getTypography(jt1Var2, 6).getType04();
                            mia.b(str, null, ah5.a(intercomTheme, jt1Var2, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, kk.a(IntercomTheme.INSTANCE, bj4VarO, 6), 0L, 0L, 0L, new f03(5), bj4Var, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
                    mh4Var7 = mh4Var11;
                } else {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-511130677);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new dw7();
                            bj4VarO.C(objF2);
                        }
                        mh4Var5 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-511129653);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new ew7();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        mh4Var6 = (mh4) objF;
                    } else {
                        mh4Var6 = mh4Var4;
                    }
                    mh4<g2b> mh4Var12 = mh4Var5;
                    bj4Var = bj4VarO;
                    ek.a(mh4Var12, gr1.b(-1474258584, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            mh4<g2b> mh4Var13 = mh4Var6;
                            final String str4 = str2;
                            jz0.c(mh4Var13, null, false, null, null, null, gr1.b(2118877259, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                    oy8Var.getClass();
                                    if ((i11 & 17) == 16 && jt1Var3.r()) {
                                        jt1Var3.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                    mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                    invoke(oy8Var, jt1Var3, num4.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, 805306368, 510);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ox6Var3, gr1.b(-868483802, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            mh4<g2b> mh4Var13 = mh4Var5;
                            final String str4 = str3;
                            jz0.c(mh4Var13, null, false, null, null, null, gr1.b(-1570315255, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                    oy8Var.getClass();
                                    if ((i11 & 17) == 16 && jt1Var3.r()) {
                                        jt1Var3.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                    mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                    invoke(oy8Var, jt1Var3, num4.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, 805306368, 510);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), gr1.b(-565596411, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            m65.b(is7.a(num4.intValue(), jt1Var2, 0), BuildConfig.FLAVOR, ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, 6).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, gr1.b(40178371, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            wja type04 = intercomTheme.getTypography(jt1Var2, 6).getType04();
                            mia.b(str, null, ah5.a(intercomTheme, jt1Var2, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, kk.a(IntercomTheme.INSTANCE, bj4VarO, 6), 0L, 0L, 0L, new f03(5), bj4Var, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
                    mh4Var7 = mh4Var12;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: fw7
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$4(ox6Var3, str, str2, str3, num3, mh4Var7, mh4Var6, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            mh4Var4 = mh4Var2;
            if ((599187 & i3) == 599186) {
                if (i8 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i9 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-511130677);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new dw7();
                        bj4VarO.C(objF2);
                    }
                    mh4Var5 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var5 = mh4Var3;
                }
                if (i6 != 0) {
                    bj4VarO.K(-511129653);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new ew7();
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    mh4Var6 = (mh4) objF;
                } else {
                    mh4Var6 = mh4Var4;
                }
                mh4<g2b> mh4Var13 = mh4Var5;
                bj4Var = bj4VarO;
                ek.a(mh4Var13, gr1.b(-1474258584, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        mh4<g2b> mh4Var14 = mh4Var6;
                        final String str4 = str2;
                        jz0.c(mh4Var14, null, false, null, null, null, gr1.b(2118877259, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                oy8Var.getClass();
                                if ((i11 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                invoke(oy8Var, jt1Var3, num4.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 805306368, 510);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ox6Var3, gr1.b(-868483802, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        mh4<g2b> mh4Var14 = mh4Var5;
                        final String str4 = str3;
                        jz0.c(mh4Var14, null, false, null, null, null, gr1.b(-1570315255, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                oy8Var.getClass();
                                if ((i11 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                invoke(oy8Var, jt1Var3, num4.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 805306368, 510);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), gr1.b(-565596411, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        m65.b(is7.a(num4.intValue(), jt1Var2, 0), BuildConfig.FLAVOR, ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, 6).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, gr1.b(40178371, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        wja type04 = intercomTheme.getTypography(jt1Var2, 6).getType04();
                        mia.b(str, null, ah5.a(intercomTheme, jt1Var2, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, kk.a(IntercomTheme.INSTANCE, bj4VarO, 6), 0L, 0L, 0L, new f03(5), bj4Var, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
                mh4Var7 = mh4Var13;
            } else {
                if (i8 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i9 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-511130677);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new dw7();
                        bj4VarO.C(objF2);
                    }
                    mh4Var5 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var5 = mh4Var3;
                }
                if (i6 != 0) {
                    bj4VarO.K(-511129653);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new ew7();
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    mh4Var6 = (mh4) objF;
                } else {
                    mh4Var6 = mh4Var4;
                }
                mh4<g2b> mh4Var14 = mh4Var5;
                bj4Var = bj4VarO;
                ek.a(mh4Var14, gr1.b(-1474258584, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        mh4<g2b> mh4Var15 = mh4Var6;
                        final String str4 = str2;
                        jz0.c(mh4Var15, null, false, null, null, null, gr1.b(2118877259, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                oy8Var.getClass();
                                if ((i11 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                invoke(oy8Var, jt1Var3, num4.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 805306368, 510);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ox6Var3, gr1.b(-868483802, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        mh4<g2b> mh4Var15 = mh4Var5;
                        final String str4 = str3;
                        jz0.c(mh4Var15, null, false, null, null, null, gr1.b(-1570315255, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                oy8Var.getClass();
                                if ((i11 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                invoke(oy8Var, jt1Var3, num4.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 805306368, 510);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), gr1.b(-565596411, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        m65.b(is7.a(num4.intValue(), jt1Var2, 0), BuildConfig.FLAVOR, ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, 6).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, gr1.b(40178371, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        wja type04 = intercomTheme.getTypography(jt1Var2, 6).getType04();
                        mia.b(str, null, ah5.a(intercomTheme, jt1Var2, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, kk.a(IntercomTheme.INSTANCE, bj4VarO, 6), 0L, 0L, 0L, new f03(5), bj4Var, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
                mh4Var7 = mh4Var14;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: fw7
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$4(ox6Var3, str, str2, str3, num3, mh4Var7, mh4Var6, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        num2 = num;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                mh4Var3 = mh4Var;
                if (bj4VarO.j(mh4Var3)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    mh4Var4 = mh4Var2;
                    if (bj4VarO.j(mh4Var4)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((599187 & i3) == 599186) {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-511130677);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new dw7();
                            bj4VarO.C(objF2);
                        }
                        mh4Var5 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-511129653);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new ew7();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        mh4Var6 = (mh4) objF;
                    } else {
                        mh4Var6 = mh4Var4;
                    }
                    mh4<g2b> mh4Var15 = mh4Var5;
                    bj4Var = bj4VarO;
                    ek.a(mh4Var15, gr1.b(-1474258584, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            mh4<g2b> mh4Var16 = mh4Var6;
                            final String str4 = str2;
                            jz0.c(mh4Var16, null, false, null, null, null, gr1.b(2118877259, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                    oy8Var.getClass();
                                    if ((i11 & 17) == 16 && jt1Var3.r()) {
                                        jt1Var3.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                    mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                    invoke(oy8Var, jt1Var3, num4.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, 805306368, 510);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ox6Var3, gr1.b(-868483802, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            mh4<g2b> mh4Var16 = mh4Var5;
                            final String str4 = str3;
                            jz0.c(mh4Var16, null, false, null, null, null, gr1.b(-1570315255, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                    oy8Var.getClass();
                                    if ((i11 & 17) == 16 && jt1Var3.r()) {
                                        jt1Var3.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                    mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                    invoke(oy8Var, jt1Var3, num4.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, 805306368, 510);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), gr1.b(-565596411, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            m65.b(is7.a(num4.intValue(), jt1Var2, 0), BuildConfig.FLAVOR, ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, 6).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, gr1.b(40178371, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            wja type04 = intercomTheme.getTypography(jt1Var2, 6).getType04();
                            mia.b(str, null, ah5.a(intercomTheme, jt1Var2, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, kk.a(IntercomTheme.INSTANCE, bj4VarO, 6), 0L, 0L, 0L, new f03(5), bj4Var, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
                    mh4Var7 = mh4Var15;
                } else {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i9 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-511130677);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new dw7();
                            bj4VarO.C(objF2);
                        }
                        mh4Var5 = (mh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        mh4Var5 = mh4Var3;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-511129653);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new ew7();
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        mh4Var6 = (mh4) objF;
                    } else {
                        mh4Var6 = mh4Var4;
                    }
                    mh4<g2b> mh4Var16 = mh4Var5;
                    bj4Var = bj4VarO;
                    ek.a(mh4Var16, gr1.b(-1474258584, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            mh4<g2b> mh4Var17 = mh4Var6;
                            final String str4 = str2;
                            jz0.c(mh4Var17, null, false, null, null, null, gr1.b(2118877259, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                                public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                    oy8Var.getClass();
                                    if ((i11 & 17) == 16 && jt1Var3.r()) {
                                        jt1Var3.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                    mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                    invoke(oy8Var, jt1Var3, num4.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, 805306368, 510);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), ox6Var3, gr1.b(-868483802, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            mh4<g2b> mh4Var17 = mh4Var5;
                            final String str4 = str3;
                            jz0.c(mh4Var17, null, false, null, null, null, gr1.b(-1570315255, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                                public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                    oy8Var.getClass();
                                    if ((i11 & 17) == 16 && jt1Var3.r()) {
                                        jt1Var3.u();
                                        return;
                                    }
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                    mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                    invoke(oy8Var, jt1Var3, num4.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, 805306368, 510);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), gr1.b(-565596411, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            Integer num4 = num3;
                            if (num4 == null) {
                                return;
                            }
                            m65.b(is7.a(num4.intValue(), jt1Var2, 0), BuildConfig.FLAVOR, ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, 6).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, gr1.b(40178371, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                        public final void invoke(jt1 jt1Var2, int i10) {
                            if ((i10 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            wja type04 = intercomTheme.getTypography(jt1Var2, 6).getType04();
                            mia.b(str, null, ah5.a(intercomTheme, jt1Var2, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                            invoke(jt1Var2, num4.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, kk.a(IntercomTheme.INSTANCE, bj4VarO, 6), 0L, 0L, 0L, new f03(5), bj4Var, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
                    mh4Var7 = mh4Var16;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: fw7
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$4(ox6Var3, str, str2, str3, num3, mh4Var7, mh4Var6, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 1572864;
            mh4Var4 = mh4Var2;
            if ((599187 & i3) == 599186) {
                if (i8 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i9 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-511130677);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new dw7();
                        bj4VarO.C(objF2);
                    }
                    mh4Var5 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var5 = mh4Var3;
                }
                if (i6 != 0) {
                    bj4VarO.K(-511129653);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new ew7();
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    mh4Var6 = (mh4) objF;
                } else {
                    mh4Var6 = mh4Var4;
                }
                mh4<g2b> mh4Var17 = mh4Var5;
                bj4Var = bj4VarO;
                ek.a(mh4Var17, gr1.b(-1474258584, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        mh4<g2b> mh4Var18 = mh4Var6;
                        final String str4 = str2;
                        jz0.c(mh4Var18, null, false, null, null, null, gr1.b(2118877259, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                oy8Var.getClass();
                                if ((i11 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                invoke(oy8Var, jt1Var3, num4.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 805306368, 510);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ox6Var3, gr1.b(-868483802, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        mh4<g2b> mh4Var18 = mh4Var5;
                        final String str4 = str3;
                        jz0.c(mh4Var18, null, false, null, null, null, gr1.b(-1570315255, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                oy8Var.getClass();
                                if ((i11 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                invoke(oy8Var, jt1Var3, num4.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 805306368, 510);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), gr1.b(-565596411, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        m65.b(is7.a(num4.intValue(), jt1Var2, 0), BuildConfig.FLAVOR, ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, 6).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, gr1.b(40178371, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        wja type04 = intercomTheme.getTypography(jt1Var2, 6).getType04();
                        mia.b(str, null, ah5.a(intercomTheme, jt1Var2, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, kk.a(IntercomTheme.INSTANCE, bj4VarO, 6), 0L, 0L, 0L, new f03(5), bj4Var, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
                mh4Var7 = mh4Var17;
            } else {
                if (i8 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i9 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-511130677);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new dw7();
                        bj4VarO.C(objF2);
                    }
                    mh4Var5 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var5 = mh4Var3;
                }
                if (i6 != 0) {
                    bj4VarO.K(-511129653);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new ew7();
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    mh4Var6 = (mh4) objF;
                } else {
                    mh4Var6 = mh4Var4;
                }
                mh4<g2b> mh4Var18 = mh4Var5;
                bj4Var = bj4VarO;
                ek.a(mh4Var18, gr1.b(-1474258584, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        mh4<g2b> mh4Var19 = mh4Var6;
                        final String str4 = str2;
                        jz0.c(mh4Var19, null, false, null, null, null, gr1.b(2118877259, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                oy8Var.getClass();
                                if ((i11 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                invoke(oy8Var, jt1Var3, num4.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 805306368, 510);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ox6Var3, gr1.b(-868483802, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        mh4<g2b> mh4Var19 = mh4Var5;
                        final String str4 = str3;
                        jz0.c(mh4Var19, null, false, null, null, null, gr1.b(-1570315255, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                oy8Var.getClass();
                                if ((i11 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                invoke(oy8Var, jt1Var3, num4.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 805306368, 510);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), gr1.b(-565596411, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        m65.b(is7.a(num4.intValue(), jt1Var2, 0), BuildConfig.FLAVOR, ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, 6).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, gr1.b(40178371, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        wja type04 = intercomTheme.getTypography(jt1Var2, 6).getType04();
                        mia.b(str, null, ah5.a(intercomTheme, jt1Var2, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, kk.a(IntercomTheme.INSTANCE, bj4VarO, 6), 0L, 0L, 0L, new f03(5), bj4Var, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
                mh4Var7 = mh4Var18;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: fw7
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$4(ox6Var3, str, str2, str3, num3, mh4Var7, mh4Var6, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        mh4Var3 = mh4Var;
        i6 = i2 & 64;
        if (i6 != 0) {
            if ((1572864 & i) == 0) {
                mh4Var4 = mh4Var2;
                if (bj4VarO.j(mh4Var4)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((599187 & i3) == 599186) {
                if (i8 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i9 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-511130677);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new dw7();
                        bj4VarO.C(objF2);
                    }
                    mh4Var5 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var5 = mh4Var3;
                }
                if (i6 != 0) {
                    bj4VarO.K(-511129653);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new ew7();
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    mh4Var6 = (mh4) objF;
                } else {
                    mh4Var6 = mh4Var4;
                }
                mh4<g2b> mh4Var19 = mh4Var5;
                bj4Var = bj4VarO;
                ek.a(mh4Var19, gr1.b(-1474258584, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        mh4<g2b> mh4Var110 = mh4Var6;
                        final String str4 = str2;
                        jz0.c(mh4Var110, null, false, null, null, null, gr1.b(2118877259, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                oy8Var.getClass();
                                if ((i11 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                invoke(oy8Var, jt1Var3, num4.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 805306368, 510);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ox6Var3, gr1.b(-868483802, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        mh4<g2b> mh4Var110 = mh4Var5;
                        final String str4 = str3;
                        jz0.c(mh4Var110, null, false, null, null, null, gr1.b(-1570315255, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                oy8Var.getClass();
                                if ((i11 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                invoke(oy8Var, jt1Var3, num4.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 805306368, 510);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), gr1.b(-565596411, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        m65.b(is7.a(num4.intValue(), jt1Var2, 0), BuildConfig.FLAVOR, ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, 6).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, gr1.b(40178371, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        wja type04 = intercomTheme.getTypography(jt1Var2, 6).getType04();
                        mia.b(str, null, ah5.a(intercomTheme, jt1Var2, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, kk.a(IntercomTheme.INSTANCE, bj4VarO, 6), 0L, 0L, 0L, new f03(5), bj4Var, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
                mh4Var7 = mh4Var19;
            } else {
                if (i8 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i9 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-511130677);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new dw7();
                        bj4VarO.C(objF2);
                    }
                    mh4Var5 = (mh4) objF2;
                    bj4VarO.U(false);
                } else {
                    mh4Var5 = mh4Var3;
                }
                if (i6 != 0) {
                    bj4VarO.K(-511129653);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new ew7();
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    mh4Var6 = (mh4) objF;
                } else {
                    mh4Var6 = mh4Var4;
                }
                mh4<g2b> mh4Var110 = mh4Var5;
                bj4Var = bj4VarO;
                ek.a(mh4Var110, gr1.b(-1474258584, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        mh4<g2b> mh4Var111 = mh4Var6;
                        final String str4 = str2;
                        jz0.c(mh4Var111, null, false, null, null, null, gr1.b(2118877259, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                            public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                oy8Var.getClass();
                                if ((i11 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                invoke(oy8Var, jt1Var3, num4.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 805306368, 510);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), ox6Var3, gr1.b(-868483802, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        mh4<g2b> mh4Var111 = mh4Var5;
                        final String str4 = str3;
                        jz0.c(mh4Var111, null, false, null, null, null, gr1.b(-1570315255, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                            public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                                oy8Var.getClass();
                                if ((i11 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                                mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                                invoke(oy8Var, jt1Var3, num4.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, 805306368, 510);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), gr1.b(-565596411, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        m65.b(is7.a(num4.intValue(), jt1Var2, 0), BuildConfig.FLAVOR, ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, 6).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, gr1.b(40178371, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                    public final void invoke(jt1 jt1Var2, int i10) {
                        if ((i10 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        wja type04 = intercomTheme.getTypography(jt1Var2, 6).getType04();
                        mia.b(str, null, ah5.a(intercomTheme, jt1Var2, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                        invoke(jt1Var2, num4.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, kk.a(IntercomTheme.INSTANCE, bj4VarO, 6), 0L, 0L, 0L, new f03(5), bj4Var, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
                mh4Var7 = mh4Var110;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: fw7
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$4(ox6Var3, str, str2, str3, num3, mh4Var7, mh4Var6, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 1572864;
        mh4Var4 = mh4Var2;
        if ((599187 & i3) == 599186) {
            if (i8 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i9 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            c0187a = jt1.a.a;
            if (i4 != 0) {
                bj4VarO.K(-511130677);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new dw7();
                    bj4VarO.C(objF2);
                }
                mh4Var5 = (mh4) objF2;
                bj4VarO.U(false);
            } else {
                mh4Var5 = mh4Var3;
            }
            if (i6 != 0) {
                bj4VarO.K(-511129653);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new ew7();
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                mh4Var6 = (mh4) objF;
            } else {
                mh4Var6 = mh4Var4;
            }
            mh4<g2b> mh4Var111 = mh4Var5;
            bj4Var = bj4VarO;
            ek.a(mh4Var111, gr1.b(-1474258584, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                public final void invoke(jt1 jt1Var2, int i10) {
                    if ((i10 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    mh4<g2b> mh4Var112 = mh4Var6;
                    final String str4 = str2;
                    jz0.c(mh4Var112, null, false, null, null, null, gr1.b(2118877259, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                        public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                            oy8Var.getClass();
                            if ((i11 & 17) == 16 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                            mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                            invoke(oy8Var, jt1Var3, num4.intValue());
                            return g2b.a;
                        }
                    }, jt1Var2), jt1Var2, 805306368, 510);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                    invoke(jt1Var2, num4.intValue());
                    return g2b.a;
                }
            }, bj4VarO), ox6Var3, gr1.b(-868483802, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                public final void invoke(jt1 jt1Var2, int i10) {
                    if ((i10 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    mh4<g2b> mh4Var112 = mh4Var5;
                    final String str4 = str3;
                    jz0.c(mh4Var112, null, false, null, null, null, gr1.b(-1570315255, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                        public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                            oy8Var.getClass();
                            if ((i11 & 17) == 16 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                            mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                            invoke(oy8Var, jt1Var3, num4.intValue());
                            return g2b.a;
                        }
                    }, jt1Var2), jt1Var2, 805306368, 510);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                    invoke(jt1Var2, num4.intValue());
                    return g2b.a;
                }
            }, bj4VarO), gr1.b(-565596411, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                public final void invoke(jt1 jt1Var2, int i10) {
                    if ((i10 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    Integer num4 = num3;
                    if (num4 == null) {
                        return;
                    }
                    m65.b(is7.a(num4.intValue(), jt1Var2, 0), BuildConfig.FLAVOR, ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, 6).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                    invoke(jt1Var2, num4.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, gr1.b(40178371, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                public final void invoke(jt1 jt1Var2, int i10) {
                    if ((i10 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    wja type04 = intercomTheme.getTypography(jt1Var2, 6).getType04();
                    mia.b(str, null, ah5.a(intercomTheme, jt1Var2, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                    invoke(jt1Var2, num4.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, kk.a(IntercomTheme.INSTANCE, bj4VarO, 6), 0L, 0L, 0L, new f03(5), bj4Var, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
            mh4Var7 = mh4Var111;
        } else {
            if (i8 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i9 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            c0187a = jt1.a.a;
            if (i4 != 0) {
                bj4VarO.K(-511130677);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new dw7();
                    bj4VarO.C(objF2);
                }
                mh4Var5 = (mh4) objF2;
                bj4VarO.U(false);
            } else {
                mh4Var5 = mh4Var3;
            }
            if (i6 != 0) {
                bj4VarO.K(-511129653);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new ew7();
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                mh4Var6 = (mh4) objF;
            } else {
                mh4Var6 = mh4Var4;
            }
            mh4<g2b> mh4Var112 = mh4Var5;
            bj4Var = bj4VarO;
            ek.a(mh4Var112, gr1.b(-1474258584, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3
                public final void invoke(jt1 jt1Var2, int i10) {
                    if ((i10 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    mh4<g2b> mh4Var113 = mh4Var6;
                    final String str4 = str2;
                    jz0.c(mh4Var113, null, false, null, null, null, gr1.b(2118877259, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.3.1
                        public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                            oy8Var.getClass();
                            if ((i11 & 17) == 16 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                            mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                            invoke(oy8Var, jt1Var3, num4.intValue());
                            return g2b.a;
                        }
                    }, jt1Var2), jt1Var2, 805306368, 510);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                    invoke(jt1Var2, num4.intValue());
                    return g2b.a;
                }
            }, bj4VarO), ox6Var3, gr1.b(-868483802, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4
                public final void invoke(jt1 jt1Var2, int i10) {
                    if ((i10 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    mh4<g2b> mh4Var113 = mh4Var5;
                    final String str4 = str3;
                    jz0.c(mh4Var113, null, false, null, null, null, gr1.b(-1570315255, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.4.1
                        public final void invoke(oy8 oy8Var, jt1 jt1Var3, int i11) {
                            oy8Var.getClass();
                            if ((i11 & 17) == 16 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            wja type04SemiBold = intercomTheme.getTypography(jt1Var3, 6).getType04SemiBold();
                            mia.b(str4, null, intercomTheme.getColors(jt1Var3, 6).m752getActionContrastWhite0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04SemiBold, jt1Var3, 0, 0, 131066);
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var3, Integer num4) {
                            invoke(oy8Var, jt1Var3, num4.intValue());
                            return g2b.a;
                        }
                    }, jt1Var2), jt1Var2, 805306368, 510);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                    invoke(jt1Var2, num4.intValue());
                    return g2b.a;
                }
            }, bj4VarO), gr1.b(-565596411, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.5
                public final void invoke(jt1 jt1Var2, int i10) {
                    if ((i10 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    Integer num4 = num3;
                    if (num4 == null) {
                        return;
                    }
                    m65.b(is7.a(num4.intValue(), jt1Var2, 0), BuildConfig.FLAVOR, ir9.j(ox6.a.t, 24.0f), IntercomTheme.INSTANCE.getColors(jt1Var2, 6).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                    invoke(jt1Var2, num4.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, gr1.b(40178371, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog.6
                public final void invoke(jt1 jt1Var2, int i10) {
                    if ((i10 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    wja type04 = intercomTheme.getTypography(jt1Var2, 6).getType04();
                    mia.b(str, null, ah5.a(intercomTheme, jt1Var2, 6), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, type04, jt1Var2, 0, 0, 131066);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num4) {
                    invoke(jt1Var2, num4.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, kk.a(IntercomTheme.INSTANCE, bj4VarO, 6), 0L, 0L, 0L, new f03(5), bj4Var, ((i3 >> 15) & 14) | 1600560 | ((i3 << 6) & 896), 3072, 7840);
            mh4Var7 = mh4Var112;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: fw7
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PermissionDeniedDialogKt.PermissionDeniedDialog$lambda$4(ox6Var3, str, str2, str3, num3, mh4Var7, mh4Var6, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PermissionDeniedDialog$lambda$4(ox6 ox6Var, String str, String str2, String str3, Integer num, mh4 mh4Var, mh4 mh4Var2, int i, int i2, jt1 jt1Var, int i3) {
        PermissionDeniedDialog(ox6Var, str, str2, str3, num, mh4Var, mh4Var2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final void PermissionDeniedDialogPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-501567607);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PermissionDeniedDialogKt.INSTANCE.m566getLambda1$intercom_sdk_ui_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new cw7(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PermissionDeniedDialogPreview$lambda$5(int i, jt1 jt1Var, int i2) {
        PermissionDeniedDialogPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
