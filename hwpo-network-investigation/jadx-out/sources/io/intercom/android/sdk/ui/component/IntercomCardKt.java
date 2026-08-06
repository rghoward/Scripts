package io.intercom.android.sdk.ui.component;

import android.os.Build;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.d3a;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.g51;
import defpackage.gz3;
import defpackage.h27;
import defpackage.i27;
import defpackage.jl9;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.ox6;
import defpackage.pw3;
import defpackage.uh1;
import defpackage.xj8;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.component.IntercomCardKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomCardKt {
    /* JADX WARN: Code duplicated, block: B:102:0x017f  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    /* JADX WARN: Code duplicated, block: B:96:0x0125  */
    /* JADX WARN: Code duplicated, block: B:98:0x0135  */
    public static final void IntercomCard(final mh4<g2b> mh4Var, ox6 ox6Var, boolean z, IntercomCardStyle.Style style, h27 h27Var, final ei4<? super bj1, ? super jt1, ? super Integer, g2b> ei4Var, jt1 jt1Var, final int i, final int i2) {
        mh4<g2b> mh4Var2;
        int i3;
        ox6 ox6Var2;
        int i4;
        boolean z2;
        int i5;
        IntercomCardStyle.Style style2;
        int i6;
        h27 h27Var2;
        int i7;
        int i8;
        final ox6 ox6Var3;
        final boolean z3;
        final IntercomCardStyle.Style styleM578defaultStyleqUnfpCA;
        h27 h27Var3;
        Object objF;
        final h27 h27Var4;
        xj8 xj8VarW;
        mh4Var.getClass();
        ei4Var.getClass();
        bj4 bj4VarO = jt1Var.o(254499300);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            mh4Var2 = mh4Var;
        } else {
            mh4Var2 = mh4Var;
            if ((i & 6) == 0) {
                i3 = (bj4VarO.j(mh4Var2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        style2 = style;
                        int i10 = bj4VarO.J(style2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
                        i3 |= i10;
                    } else {
                        style2 = style;
                    }
                    i3 |= i10;
                } else {
                    style2 = style;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        h27Var2 = h27Var;
                        if (bj4VarO.J(h27Var2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 196608) == 0) {
                            if (bj4VarO.j(ei4Var)) {
                                i8 = 131072;
                            } else {
                                i8 = 65536;
                            }
                            i3 |= i8;
                        }
                        if ((74899 & i3) == 74898 || !bj4VarO.r()) {
                            bj4VarO.v0();
                            if ((i & 1) != 0 || bj4VarO.c0()) {
                                if (i9 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i4 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if ((i2 & 8) != 0) {
                                    styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                    i3 &= -7169;
                                } else {
                                    styleM578defaultStyleqUnfpCA = style2;
                                }
                                if (i6 != 0) {
                                    bj4VarO.K(-2091443309);
                                    objF = bj4VarO.f();
                                    if (objF == jt1.a.a) {
                                        bj4VarO = bj4VarO;
                                        objF = new i27();
                                        bj4VarO.C(objF);
                                    }
                                    bj4VarO = bj4VarO;
                                    bj4VarO.U(false);
                                    h27Var3 = (h27) objF;
                                } else {
                                    bj4VarO = bj4VarO;
                                    h27Var3 = h27Var;
                                }
                            } else {
                                bj4VarO.u();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                ox6Var3 = ox6Var2;
                                z3 = z2;
                                styleM578defaultStyleqUnfpCA = style2;
                                h27Var3 = h27Var2;
                            }
                            bj4VarO.V();
                            int i11 = i3 & 1022;
                            int i12 = i3 << 9;
                            bj4 bj4Var = bj4VarO;
                            g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var, i11 | (29360128 & i12) | (i12 & 234881024), 0);
                            bj4VarO = bj4Var;
                            h27Var4 = h27Var3;
                        } else {
                            bj4VarO.u();
                            ox6Var3 = ox6Var2;
                            z3 = z2;
                            styleM578defaultStyleqUnfpCA = style2;
                            h27Var4 = h27Var2;
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: mh5
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return IntercomCardKt.IntercomCard$lambda$2(mh4Var, ox6Var3, z3, styleM578defaultStyleqUnfpCA, h27Var4, ei4Var, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    if ((74899 & i3) == 74898) {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                i3 &= -7169;
                            } else {
                                styleM578defaultStyleqUnfpCA = style2;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-2091443309);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    bj4VarO = bj4VarO;
                                    objF = new i27();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO = bj4VarO;
                                bj4VarO.U(false);
                                h27Var3 = (h27) objF;
                            } else {
                                bj4VarO = bj4VarO;
                                h27Var3 = h27Var;
                            }
                        } else {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                i3 &= -7169;
                            } else {
                                styleM578defaultStyleqUnfpCA = style2;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-2091443309);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    bj4VarO = bj4VarO;
                                    objF = new i27();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO = bj4VarO;
                                bj4VarO.U(false);
                                h27Var3 = (h27) objF;
                            } else {
                                bj4VarO = bj4VarO;
                                h27Var3 = h27Var;
                            }
                        }
                        bj4VarO.V();
                        int i13 = i3 & 1022;
                        int i14 = i3 << 9;
                        bj4 bj4Var2 = bj4VarO;
                        g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var2, i13 | (29360128 & i14) | (i14 & 234881024), 0);
                        bj4VarO = bj4Var2;
                        h27Var4 = h27Var3;
                    } else {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                i3 &= -7169;
                            } else {
                                styleM578defaultStyleqUnfpCA = style2;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-2091443309);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    bj4VarO = bj4VarO;
                                    objF = new i27();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO = bj4VarO;
                                bj4VarO.U(false);
                                h27Var3 = (h27) objF;
                            } else {
                                bj4VarO = bj4VarO;
                                h27Var3 = h27Var;
                            }
                        } else {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                i3 &= -7169;
                            } else {
                                styleM578defaultStyleqUnfpCA = style2;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-2091443309);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    bj4VarO = bj4VarO;
                                    objF = new i27();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO = bj4VarO;
                                bj4VarO.U(false);
                                h27Var3 = (h27) objF;
                            } else {
                                bj4VarO = bj4VarO;
                                h27Var3 = h27Var;
                            }
                        }
                        bj4VarO.V();
                        int i15 = i3 & 1022;
                        int i16 = i3 << 9;
                        bj4 bj4Var3 = bj4VarO;
                        g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var3, i15 | (29360128 & i16) | (i16 & 234881024), 0);
                        bj4VarO = bj4Var3;
                        h27Var4 = h27Var3;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: mh5
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return IntercomCardKt.IntercomCard$lambda$2(mh4Var, ox6Var3, z3, styleM578defaultStyleqUnfpCA, h27Var4, ei4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                h27Var2 = h27Var;
                if ((i2 & 32) != 0) {
                    if ((i & 196608) == 0) {
                        if (bj4VarO.j(ei4Var)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((74899 & i3) == 74898) {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                i3 &= -7169;
                            } else {
                                styleM578defaultStyleqUnfpCA = style2;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-2091443309);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    bj4VarO = bj4VarO;
                                    objF = new i27();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO = bj4VarO;
                                bj4VarO.U(false);
                                h27Var3 = (h27) objF;
                            } else {
                                bj4VarO = bj4VarO;
                                h27Var3 = h27Var;
                            }
                        } else {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                i3 &= -7169;
                            } else {
                                styleM578defaultStyleqUnfpCA = style2;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-2091443309);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    bj4VarO = bj4VarO;
                                    objF = new i27();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO = bj4VarO;
                                bj4VarO.U(false);
                                h27Var3 = (h27) objF;
                            } else {
                                bj4VarO = bj4VarO;
                                h27Var3 = h27Var;
                            }
                        }
                        bj4VarO.V();
                        int i17 = i3 & 1022;
                        int i18 = i3 << 9;
                        bj4 bj4Var4 = bj4VarO;
                        g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var4, i17 | (29360128 & i18) | (i18 & 234881024), 0);
                        bj4VarO = bj4Var4;
                        h27Var4 = h27Var3;
                    } else {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                i3 &= -7169;
                            } else {
                                styleM578defaultStyleqUnfpCA = style2;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-2091443309);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    bj4VarO = bj4VarO;
                                    objF = new i27();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO = bj4VarO;
                                bj4VarO.U(false);
                                h27Var3 = (h27) objF;
                            } else {
                                bj4VarO = bj4VarO;
                                h27Var3 = h27Var;
                            }
                        } else {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                i3 &= -7169;
                            } else {
                                styleM578defaultStyleqUnfpCA = style2;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-2091443309);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    bj4VarO = bj4VarO;
                                    objF = new i27();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO = bj4VarO;
                                bj4VarO.U(false);
                                h27Var3 = (h27) objF;
                            } else {
                                bj4VarO = bj4VarO;
                                h27Var3 = h27Var;
                            }
                        }
                        bj4VarO.V();
                        int i19 = i3 & 1022;
                        int i110 = i3 << 9;
                        bj4 bj4Var5 = bj4VarO;
                        g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var5, i19 | (29360128 & i110) | (i110 & 234881024), 0);
                        bj4VarO = bj4Var5;
                        h27Var4 = h27Var3;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: mh5
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return IntercomCardKt.IntercomCard$lambda$2(mh4Var, ox6Var3, z3, styleM578defaultStyleqUnfpCA, h27Var4, ei4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    }
                    bj4VarO.V();
                    int i111 = i3 & 1022;
                    int i112 = i3 << 9;
                    bj4 bj4Var6 = bj4VarO;
                    g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var6, i111 | (29360128 & i112) | (i112 & 234881024), 0);
                    bj4VarO = bj4Var6;
                    h27Var4 = h27Var3;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    }
                    bj4VarO.V();
                    int i113 = i3 & 1022;
                    int i114 = i3 << 9;
                    bj4 bj4Var7 = bj4VarO;
                    g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var7, i113 | (29360128 & i114) | (i114 & 234881024), 0);
                    bj4VarO = bj4Var7;
                    h27Var4 = h27Var3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: mh5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomCardKt.IntercomCard$lambda$2(mh4Var, ox6Var3, z3, styleM578defaultStyleqUnfpCA, h27Var4, ei4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    style2 = style;
                    if (bj4VarO.J(style2)) {
                    }
                    i3 |= i10;
                } else {
                    style2 = style;
                }
                i3 |= i10;
            } else {
                style2 = style;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    h27Var2 = h27Var;
                    if (bj4VarO.J(h27Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 196608) == 0) {
                        if (bj4VarO.j(ei4Var)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((74899 & i3) == 74898) {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                i3 &= -7169;
                            } else {
                                styleM578defaultStyleqUnfpCA = style2;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-2091443309);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    bj4VarO = bj4VarO;
                                    objF = new i27();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO = bj4VarO;
                                bj4VarO.U(false);
                                h27Var3 = (h27) objF;
                            } else {
                                bj4VarO = bj4VarO;
                                h27Var3 = h27Var;
                            }
                        } else {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                i3 &= -7169;
                            } else {
                                styleM578defaultStyleqUnfpCA = style2;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-2091443309);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    bj4VarO = bj4VarO;
                                    objF = new i27();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO = bj4VarO;
                                bj4VarO.U(false);
                                h27Var3 = (h27) objF;
                            } else {
                                bj4VarO = bj4VarO;
                                h27Var3 = h27Var;
                            }
                        }
                        bj4VarO.V();
                        int i115 = i3 & 1022;
                        int i116 = i3 << 9;
                        bj4 bj4Var8 = bj4VarO;
                        g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var8, i115 | (29360128 & i116) | (i116 & 234881024), 0);
                        bj4VarO = bj4Var8;
                        h27Var4 = h27Var3;
                    } else {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                i3 &= -7169;
                            } else {
                                styleM578defaultStyleqUnfpCA = style2;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-2091443309);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    bj4VarO = bj4VarO;
                                    objF = new i27();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO = bj4VarO;
                                bj4VarO.U(false);
                                h27Var3 = (h27) objF;
                            } else {
                                bj4VarO = bj4VarO;
                                h27Var3 = h27Var;
                            }
                        } else {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                i3 &= -7169;
                            } else {
                                styleM578defaultStyleqUnfpCA = style2;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-2091443309);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    bj4VarO = bj4VarO;
                                    objF = new i27();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO = bj4VarO;
                                bj4VarO.U(false);
                                h27Var3 = (h27) objF;
                            } else {
                                bj4VarO = bj4VarO;
                                h27Var3 = h27Var;
                            }
                        }
                        bj4VarO.V();
                        int i117 = i3 & 1022;
                        int i118 = i3 << 9;
                        bj4 bj4Var9 = bj4VarO;
                        g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var9, i117 | (29360128 & i118) | (i118 & 234881024), 0);
                        bj4VarO = bj4Var9;
                        h27Var4 = h27Var3;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: mh5
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return IntercomCardKt.IntercomCard$lambda$2(mh4Var, ox6Var3, z3, styleM578defaultStyleqUnfpCA, h27Var4, ei4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    }
                    bj4VarO.V();
                    int i119 = i3 & 1022;
                    int i1110 = i3 << 9;
                    bj4 bj4Var10 = bj4VarO;
                    g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var10, i119 | (29360128 & i1110) | (i1110 & 234881024), 0);
                    bj4VarO = bj4Var10;
                    h27Var4 = h27Var3;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    }
                    bj4VarO.V();
                    int i1111 = i3 & 1022;
                    int i1112 = i3 << 9;
                    bj4 bj4Var11 = bj4VarO;
                    g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var11, i1111 | (29360128 & i1112) | (i1112 & 234881024), 0);
                    bj4VarO = bj4Var11;
                    h27Var4 = h27Var3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: mh5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomCardKt.IntercomCard$lambda$2(mh4Var, ox6Var3, z3, styleM578defaultStyleqUnfpCA, h27Var4, ei4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            h27Var2 = h27Var;
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    if (bj4VarO.j(ei4Var)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    }
                    bj4VarO.V();
                    int i1113 = i3 & 1022;
                    int i1114 = i3 << 9;
                    bj4 bj4Var12 = bj4VarO;
                    g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var12, i1113 | (29360128 & i1114) | (i1114 & 234881024), 0);
                    bj4VarO = bj4Var12;
                    h27Var4 = h27Var3;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    }
                    bj4VarO.V();
                    int i1115 = i3 & 1022;
                    int i1116 = i3 << 9;
                    bj4 bj4Var13 = bj4VarO;
                    g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var13, i1115 | (29360128 & i1116) | (i1116 & 234881024), 0);
                    bj4VarO = bj4Var13;
                    h27Var4 = h27Var3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: mh5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomCardKt.IntercomCard$lambda$2(mh4Var, ox6Var3, z3, styleM578defaultStyleqUnfpCA, h27Var4, ei4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        styleM578defaultStyleqUnfpCA = style2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-2091443309);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            bj4VarO = bj4VarO;
                            objF = new i27();
                            bj4VarO.C(objF);
                        }
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                        h27Var3 = (h27) objF;
                    } else {
                        bj4VarO = bj4VarO;
                        h27Var3 = h27Var;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        styleM578defaultStyleqUnfpCA = style2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-2091443309);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            bj4VarO = bj4VarO;
                            objF = new i27();
                            bj4VarO.C(objF);
                        }
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                        h27Var3 = (h27) objF;
                    } else {
                        bj4VarO = bj4VarO;
                        h27Var3 = h27Var;
                    }
                }
                bj4VarO.V();
                int i1117 = i3 & 1022;
                int i1118 = i3 << 9;
                bj4 bj4Var14 = bj4VarO;
                g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var14, i1117 | (29360128 & i1118) | (i1118 & 234881024), 0);
                bj4VarO = bj4Var14;
                h27Var4 = h27Var3;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        styleM578defaultStyleqUnfpCA = style2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-2091443309);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            bj4VarO = bj4VarO;
                            objF = new i27();
                            bj4VarO.C(objF);
                        }
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                        h27Var3 = (h27) objF;
                    } else {
                        bj4VarO = bj4VarO;
                        h27Var3 = h27Var;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        styleM578defaultStyleqUnfpCA = style2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-2091443309);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            bj4VarO = bj4VarO;
                            objF = new i27();
                            bj4VarO.C(objF);
                        }
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                        h27Var3 = (h27) objF;
                    } else {
                        bj4VarO = bj4VarO;
                        h27Var3 = h27Var;
                    }
                }
                bj4VarO.V();
                int i1119 = i3 & 1022;
                int i11110 = i3 << 9;
                bj4 bj4Var15 = bj4VarO;
                g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var15, i1119 | (29360128 & i11110) | (i11110 & 234881024), 0);
                bj4VarO = bj4Var15;
                h27Var4 = h27Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: mh5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomCardKt.IntercomCard$lambda$2(mh4Var, ox6Var3, z3, styleM578defaultStyleqUnfpCA, h27Var4, ei4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (bj4VarO.c(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    style2 = style;
                    if (bj4VarO.J(style2)) {
                    }
                    i3 |= i10;
                } else {
                    style2 = style;
                }
                i3 |= i10;
            } else {
                style2 = style;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    h27Var2 = h27Var;
                    if (bj4VarO.J(h27Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i2 & 32) != 0) {
                    if ((i & 196608) == 0) {
                        if (bj4VarO.j(ei4Var)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((74899 & i3) == 74898) {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                i3 &= -7169;
                            } else {
                                styleM578defaultStyleqUnfpCA = style2;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-2091443309);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    bj4VarO = bj4VarO;
                                    objF = new i27();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO = bj4VarO;
                                bj4VarO.U(false);
                                h27Var3 = (h27) objF;
                            } else {
                                bj4VarO = bj4VarO;
                                h27Var3 = h27Var;
                            }
                        } else {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                i3 &= -7169;
                            } else {
                                styleM578defaultStyleqUnfpCA = style2;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-2091443309);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    bj4VarO = bj4VarO;
                                    objF = new i27();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO = bj4VarO;
                                bj4VarO.U(false);
                                h27Var3 = (h27) objF;
                            } else {
                                bj4VarO = bj4VarO;
                                h27Var3 = h27Var;
                            }
                        }
                        bj4VarO.V();
                        int i11111 = i3 & 1022;
                        int i11112 = i3 << 9;
                        bj4 bj4Var16 = bj4VarO;
                        g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var16, i11111 | (29360128 & i11112) | (i11112 & 234881024), 0);
                        bj4VarO = bj4Var16;
                        h27Var4 = h27Var3;
                    } else {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                i3 &= -7169;
                            } else {
                                styleM578defaultStyleqUnfpCA = style2;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-2091443309);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    bj4VarO = bj4VarO;
                                    objF = new i27();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO = bj4VarO;
                                bj4VarO.U(false);
                                h27Var3 = (h27) objF;
                            } else {
                                bj4VarO = bj4VarO;
                                h27Var3 = h27Var;
                            }
                        } else {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if ((i2 & 8) != 0) {
                                styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                                i3 &= -7169;
                            } else {
                                styleM578defaultStyleqUnfpCA = style2;
                            }
                            if (i6 != 0) {
                                bj4VarO.K(-2091443309);
                                objF = bj4VarO.f();
                                if (objF == jt1.a.a) {
                                    bj4VarO = bj4VarO;
                                    objF = new i27();
                                    bj4VarO.C(objF);
                                }
                                bj4VarO = bj4VarO;
                                bj4VarO.U(false);
                                h27Var3 = (h27) objF;
                            } else {
                                bj4VarO = bj4VarO;
                                h27Var3 = h27Var;
                            }
                        }
                        bj4VarO.V();
                        int i11113 = i3 & 1022;
                        int i11114 = i3 << 9;
                        bj4 bj4Var17 = bj4VarO;
                        g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var17, i11113 | (29360128 & i11114) | (i11114 & 234881024), 0);
                        bj4VarO = bj4Var17;
                        h27Var4 = h27Var3;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: mh5
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return IntercomCardKt.IntercomCard$lambda$2(mh4Var, ox6Var3, z3, styleM578defaultStyleqUnfpCA, h27Var4, ei4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    }
                    bj4VarO.V();
                    int i11115 = i3 & 1022;
                    int i11116 = i3 << 9;
                    bj4 bj4Var18 = bj4VarO;
                    g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var18, i11115 | (29360128 & i11116) | (i11116 & 234881024), 0);
                    bj4VarO = bj4Var18;
                    h27Var4 = h27Var3;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    }
                    bj4VarO.V();
                    int i11117 = i3 & 1022;
                    int i11118 = i3 << 9;
                    bj4 bj4Var19 = bj4VarO;
                    g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var19, i11117 | (29360128 & i11118) | (i11118 & 234881024), 0);
                    bj4VarO = bj4Var19;
                    h27Var4 = h27Var3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: mh5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomCardKt.IntercomCard$lambda$2(mh4Var, ox6Var3, z3, styleM578defaultStyleqUnfpCA, h27Var4, ei4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            h27Var2 = h27Var;
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    if (bj4VarO.j(ei4Var)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    }
                    bj4VarO.V();
                    int i11119 = i3 & 1022;
                    int i111110 = i3 << 9;
                    bj4 bj4Var110 = bj4VarO;
                    g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var110, i11119 | (29360128 & i111110) | (i111110 & 234881024), 0);
                    bj4VarO = bj4Var110;
                    h27Var4 = h27Var3;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    }
                    bj4VarO.V();
                    int i111111 = i3 & 1022;
                    int i111112 = i3 << 9;
                    bj4 bj4Var111 = bj4VarO;
                    g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var111, i111111 | (29360128 & i111112) | (i111112 & 234881024), 0);
                    bj4VarO = bj4Var111;
                    h27Var4 = h27Var3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: mh5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomCardKt.IntercomCard$lambda$2(mh4Var, ox6Var3, z3, styleM578defaultStyleqUnfpCA, h27Var4, ei4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        styleM578defaultStyleqUnfpCA = style2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-2091443309);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            bj4VarO = bj4VarO;
                            objF = new i27();
                            bj4VarO.C(objF);
                        }
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                        h27Var3 = (h27) objF;
                    } else {
                        bj4VarO = bj4VarO;
                        h27Var3 = h27Var;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        styleM578defaultStyleqUnfpCA = style2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-2091443309);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            bj4VarO = bj4VarO;
                            objF = new i27();
                            bj4VarO.C(objF);
                        }
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                        h27Var3 = (h27) objF;
                    } else {
                        bj4VarO = bj4VarO;
                        h27Var3 = h27Var;
                    }
                }
                bj4VarO.V();
                int i111113 = i3 & 1022;
                int i111114 = i3 << 9;
                bj4 bj4Var112 = bj4VarO;
                g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var112, i111113 | (29360128 & i111114) | (i111114 & 234881024), 0);
                bj4VarO = bj4Var112;
                h27Var4 = h27Var3;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        styleM578defaultStyleqUnfpCA = style2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-2091443309);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            bj4VarO = bj4VarO;
                            objF = new i27();
                            bj4VarO.C(objF);
                        }
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                        h27Var3 = (h27) objF;
                    } else {
                        bj4VarO = bj4VarO;
                        h27Var3 = h27Var;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        styleM578defaultStyleqUnfpCA = style2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-2091443309);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            bj4VarO = bj4VarO;
                            objF = new i27();
                            bj4VarO.C(objF);
                        }
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                        h27Var3 = (h27) objF;
                    } else {
                        bj4VarO = bj4VarO;
                        h27Var3 = h27Var;
                    }
                }
                bj4VarO.V();
                int i111115 = i3 & 1022;
                int i111116 = i3 << 9;
                bj4 bj4Var113 = bj4VarO;
                g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var113, i111115 | (29360128 & i111116) | (i111116 & 234881024), 0);
                bj4VarO = bj4Var113;
                h27Var4 = h27Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: mh5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomCardKt.IntercomCard$lambda$2(mh4Var, ox6Var3, z3, styleM578defaultStyleqUnfpCA, h27Var4, ei4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                style2 = style;
                if (bj4VarO.J(style2)) {
                }
                i3 |= i10;
            } else {
                style2 = style;
            }
            i3 |= i10;
        } else {
            style2 = style;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                h27Var2 = h27Var;
                if (bj4VarO.J(h27Var2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    if (bj4VarO.j(ei4Var)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    }
                    bj4VarO.V();
                    int i111117 = i3 & 1022;
                    int i111118 = i3 << 9;
                    bj4 bj4Var114 = bj4VarO;
                    g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var114, i111117 | (29360128 & i111118) | (i111118 & 234881024), 0);
                    bj4VarO = bj4Var114;
                    h27Var4 = h27Var3;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                            i3 &= -7169;
                        } else {
                            styleM578defaultStyleqUnfpCA = style2;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(-2091443309);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                bj4VarO = bj4VarO;
                                objF = new i27();
                                bj4VarO.C(objF);
                            }
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                            h27Var3 = (h27) objF;
                        } else {
                            bj4VarO = bj4VarO;
                            h27Var3 = h27Var;
                        }
                    }
                    bj4VarO.V();
                    int i111119 = i3 & 1022;
                    int i1111110 = i3 << 9;
                    bj4 bj4Var115 = bj4VarO;
                    g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var115, i111119 | (29360128 & i1111110) | (i1111110 & 234881024), 0);
                    bj4VarO = bj4Var115;
                    h27Var4 = h27Var3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: mh5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomCardKt.IntercomCard$lambda$2(mh4Var, ox6Var3, z3, styleM578defaultStyleqUnfpCA, h27Var4, ei4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        styleM578defaultStyleqUnfpCA = style2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-2091443309);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            bj4VarO = bj4VarO;
                            objF = new i27();
                            bj4VarO.C(objF);
                        }
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                        h27Var3 = (h27) objF;
                    } else {
                        bj4VarO = bj4VarO;
                        h27Var3 = h27Var;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        styleM578defaultStyleqUnfpCA = style2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-2091443309);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            bj4VarO = bj4VarO;
                            objF = new i27();
                            bj4VarO.C(objF);
                        }
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                        h27Var3 = (h27) objF;
                    } else {
                        bj4VarO = bj4VarO;
                        h27Var3 = h27Var;
                    }
                }
                bj4VarO.V();
                int i1111111 = i3 & 1022;
                int i1111112 = i3 << 9;
                bj4 bj4Var116 = bj4VarO;
                g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var116, i1111111 | (29360128 & i1111112) | (i1111112 & 234881024), 0);
                bj4VarO = bj4Var116;
                h27Var4 = h27Var3;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        styleM578defaultStyleqUnfpCA = style2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-2091443309);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            bj4VarO = bj4VarO;
                            objF = new i27();
                            bj4VarO.C(objF);
                        }
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                        h27Var3 = (h27) objF;
                    } else {
                        bj4VarO = bj4VarO;
                        h27Var3 = h27Var;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        styleM578defaultStyleqUnfpCA = style2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-2091443309);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            bj4VarO = bj4VarO;
                            objF = new i27();
                            bj4VarO.C(objF);
                        }
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                        h27Var3 = (h27) objF;
                    } else {
                        bj4VarO = bj4VarO;
                        h27Var3 = h27Var;
                    }
                }
                bj4VarO.V();
                int i1111113 = i3 & 1022;
                int i1111114 = i3 << 9;
                bj4 bj4Var117 = bj4VarO;
                g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var117, i1111113 | (29360128 & i1111114) | (i1111114 & 234881024), 0);
                bj4VarO = bj4Var117;
                h27Var4 = h27Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: mh5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomCardKt.IntercomCard$lambda$2(mh4Var, ox6Var3, z3, styleM578defaultStyleqUnfpCA, h27Var4, ei4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        h27Var2 = h27Var;
        if ((i2 & 32) != 0) {
            if ((i & 196608) == 0) {
                if (bj4VarO.j(ei4Var)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        styleM578defaultStyleqUnfpCA = style2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-2091443309);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            bj4VarO = bj4VarO;
                            objF = new i27();
                            bj4VarO.C(objF);
                        }
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                        h27Var3 = (h27) objF;
                    } else {
                        bj4VarO = bj4VarO;
                        h27Var3 = h27Var;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        styleM578defaultStyleqUnfpCA = style2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-2091443309);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            bj4VarO = bj4VarO;
                            objF = new i27();
                            bj4VarO.C(objF);
                        }
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                        h27Var3 = (h27) objF;
                    } else {
                        bj4VarO = bj4VarO;
                        h27Var3 = h27Var;
                    }
                }
                bj4VarO.V();
                int i1111115 = i3 & 1022;
                int i1111116 = i3 << 9;
                bj4 bj4Var118 = bj4VarO;
                g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var118, i1111115 | (29360128 & i1111116) | (i1111116 & 234881024), 0);
                bj4VarO = bj4Var118;
                h27Var4 = h27Var3;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        styleM578defaultStyleqUnfpCA = style2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-2091443309);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            bj4VarO = bj4VarO;
                            objF = new i27();
                            bj4VarO.C(objF);
                        }
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                        h27Var3 = (h27) objF;
                    } else {
                        bj4VarO = bj4VarO;
                        h27Var3 = h27Var;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        styleM578defaultStyleqUnfpCA = style2;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(-2091443309);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            bj4VarO = bj4VarO;
                            objF = new i27();
                            bj4VarO.C(objF);
                        }
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                        h27Var3 = (h27) objF;
                    } else {
                        bj4VarO = bj4VarO;
                        h27Var3 = h27Var;
                    }
                }
                bj4VarO.V();
                int i1111117 = i3 & 1022;
                int i1111118 = i3 << 9;
                bj4 bj4Var119 = bj4VarO;
                g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var119, i1111117 | (29360128 & i1111118) | (i1111118 & 234881024), 0);
                bj4VarO = bj4Var119;
                h27Var4 = h27Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: mh5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomCardKt.IntercomCard$lambda$2(mh4Var, ox6Var3, z3, styleM578defaultStyleqUnfpCA, h27Var4, ei4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        if ((74899 & i3) == 74898) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 8) != 0) {
                    styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                    i3 &= -7169;
                } else {
                    styleM578defaultStyleqUnfpCA = style2;
                }
                if (i6 != 0) {
                    bj4VarO.K(-2091443309);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        bj4VarO = bj4VarO;
                        objF = new i27();
                        bj4VarO.C(objF);
                    }
                    bj4VarO = bj4VarO;
                    bj4VarO.U(false);
                    h27Var3 = (h27) objF;
                } else {
                    bj4VarO = bj4VarO;
                    h27Var3 = h27Var;
                }
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 8) != 0) {
                    styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                    i3 &= -7169;
                } else {
                    styleM578defaultStyleqUnfpCA = style2;
                }
                if (i6 != 0) {
                    bj4VarO.K(-2091443309);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        bj4VarO = bj4VarO;
                        objF = new i27();
                        bj4VarO.C(objF);
                    }
                    bj4VarO = bj4VarO;
                    bj4VarO.U(false);
                    h27Var3 = (h27) objF;
                } else {
                    bj4VarO = bj4VarO;
                    h27Var3 = h27Var;
                }
            }
            bj4VarO.V();
            int i1111119 = i3 & 1022;
            int i11111110 = i3 << 9;
            bj4 bj4Var1110 = bj4VarO;
            g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var1110, i1111119 | (29360128 & i11111110) | (i11111110 & 234881024), 0);
            bj4VarO = bj4Var1110;
            h27Var4 = h27Var3;
        } else {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 8) != 0) {
                    styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                    i3 &= -7169;
                } else {
                    styleM578defaultStyleqUnfpCA = style2;
                }
                if (i6 != 0) {
                    bj4VarO.K(-2091443309);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        bj4VarO = bj4VarO;
                        objF = new i27();
                        bj4VarO.C(objF);
                    }
                    bj4VarO = bj4VarO;
                    bj4VarO.U(false);
                    h27Var3 = (h27) objF;
                } else {
                    bj4VarO = bj4VarO;
                    h27Var3 = h27Var;
                }
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if ((i2 & 8) != 0) {
                    styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4VarO, 1572864, 63);
                    i3 &= -7169;
                } else {
                    styleM578defaultStyleqUnfpCA = style2;
                }
                if (i6 != 0) {
                    bj4VarO.K(-2091443309);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        bj4VarO = bj4VarO;
                        objF = new i27();
                        bj4VarO.C(objF);
                    }
                    bj4VarO = bj4VarO;
                    bj4VarO.U(false);
                    h27Var3 = (h27) objF;
                } else {
                    bj4VarO = bj4VarO;
                    h27Var3 = h27Var;
                }
            }
            bj4VarO.V();
            int i11111111 = i3 & 1022;
            int i11111112 = i3 << 9;
            bj4 bj4Var1111 = bj4VarO;
            g51.a(mh4Var2, ox6Var3, z3, styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4VarO, 0, 12), d3a.d(styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM(), 62), styleM578defaultStyleqUnfpCA.getBorder(), h27Var3, ei4Var, bj4Var1111, i11111111 | (29360128 & i11111112) | (i11111112 & 234881024), 0);
            bj4VarO = bj4Var1111;
            h27Var4 = h27Var3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: mh5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomCardKt.IntercomCard$lambda$2(mh4Var, ox6Var3, z3, styleM578defaultStyleqUnfpCA, h27Var4, ei4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b IntercomCard$lambda$0(ox6 ox6Var, IntercomCardStyle.Style style, ei4 ei4Var, int i, int i2, jt1 jt1Var, int i3) {
        IntercomCard(ox6Var, style, ei4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b IntercomCard$lambda$2(mh4 mh4Var, ox6 ox6Var, boolean z, IntercomCardStyle.Style style, h27 h27Var, ei4 ei4Var, int i, int i2, jt1 jt1Var, int i3) {
        IntercomCard(mh4Var, ox6Var, z, style, h27Var, ei4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void IntercomCard(ox6 ox6Var, IntercomCardStyle.Style style, final ei4<? super bj1, ? super jt1, ? super Integer, g2b> ei4Var, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        IntercomCardStyle.Style styleM578defaultStyleqUnfpCA;
        ox6 ox6Var3;
        bj4 bj4Var;
        ox6 ox6Var4;
        float fM587getElevationD9Ej5fM;
        uh1 uh1VarM588getShadowColorQN2ZGVo;
        long j;
        final IntercomCardStyle.Style style2;
        xj8 xj8VarW;
        ei4Var.getClass();
        bj4 bj4VarO = jt1Var.o(1083788517);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                styleM578defaultStyleqUnfpCA = style;
                int i5 = bj4VarO.J(styleM578defaultStyleqUnfpCA) ? 32 : 16;
                i3 |= i5;
            } else {
                styleM578defaultStyleqUnfpCA = style;
            }
            i3 |= i5;
        } else {
            styleM578defaultStyleqUnfpCA = style;
        }
        if ((i2 & 4) == 0) {
            if ((i & 384) == 0) {
                i3 |= bj4VarO.j(ei4Var) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && bj4VarO.r()) {
                bj4VarO.u();
                style2 = styleM578defaultStyleqUnfpCA;
                bj4Var = bj4VarO;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0 || bj4VarO.c0()) {
                    if (i4 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 2) != 0) {
                        bj4Var = bj4VarO;
                        i3 &= -113;
                        ox6Var4 = ox6Var3;
                        styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4Var, 1572864, 63);
                    } else {
                        bj4Var = bj4VarO;
                        ox6Var4 = ox6Var3;
                    }
                } else {
                    bj4VarO.u();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    ox6Var4 = ox6Var2;
                    bj4Var = bj4VarO;
                }
                bj4Var.V();
                if (Build.VERSION.SDK_INT >= 28) {
                    fM587getElevationD9Ej5fM = styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM();
                } else {
                    fM587getElevationD9Ej5fM = 2.0f;
                }
                float f = fM587getElevationD9Ej5fM;
                jl9 shape = styleM578defaultStyleqUnfpCA.getShape();
                uh1VarM588getShadowColorQN2ZGVo = styleM578defaultStyleqUnfpCA.m588getShadowColorQN2ZGVo();
                if (uh1VarM588getShadowColorQN2ZGVo != null) {
                    j = uh1VarM588getShadowColorQN2ZGVo.a;
                } else {
                    j = uh1.b;
                }
                ox6Var2 = ox6Var4;
                g51.b(pw3.c(ox6Var4, f, shape, 0L, j, 12), styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4Var, 0, 12), d3a.d(0.0f, 62), styleM578defaultStyleqUnfpCA.getBorder(), ei4Var, bj4Var, (i3 << 9) & 458752, 0);
                style2 = styleM578defaultStyleqUnfpCA;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: lh5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomCardKt.IntercomCard$lambda$0(ox6Var2, style2, ei4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        if ((i3 & 147) != 146) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 2) != 0) {
                    bj4Var = bj4VarO;
                    i3 &= -113;
                    ox6Var4 = ox6Var3;
                    styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4Var, 1572864, 63);
                } else {
                    bj4Var = bj4VarO;
                    ox6Var4 = ox6Var3;
                }
            } else {
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 2) != 0) {
                    bj4Var = bj4VarO;
                    i3 &= -113;
                    ox6Var4 = ox6Var3;
                    styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4Var, 1572864, 63);
                } else {
                    bj4Var = bj4VarO;
                    ox6Var4 = ox6Var3;
                }
            }
            bj4Var.V();
            if (Build.VERSION.SDK_INT >= 28) {
                fM587getElevationD9Ej5fM = styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM();
            } else {
                fM587getElevationD9Ej5fM = 2.0f;
            }
            float f2 = fM587getElevationD9Ej5fM;
            jl9 shape2 = styleM578defaultStyleqUnfpCA.getShape();
            uh1VarM588getShadowColorQN2ZGVo = styleM578defaultStyleqUnfpCA.m588getShadowColorQN2ZGVo();
            if (uh1VarM588getShadowColorQN2ZGVo != null) {
                j = uh1VarM588getShadowColorQN2ZGVo.a;
            } else {
                j = uh1.b;
            }
            ox6Var2 = ox6Var4;
            g51.b(pw3.c(ox6Var4, f2, shape2, 0L, j, 12), styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4Var, 0, 12), d3a.d(0.0f, 62), styleM578defaultStyleqUnfpCA.getBorder(), ei4Var, bj4Var, (i3 << 9) & 458752, 0);
            style2 = styleM578defaultStyleqUnfpCA;
        } else {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 2) != 0) {
                    bj4Var = bj4VarO;
                    i3 &= -113;
                    ox6Var4 = ox6Var3;
                    styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4Var, 1572864, 63);
                } else {
                    bj4Var = bj4VarO;
                    ox6Var4 = ox6Var3;
                }
            } else {
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 2) != 0) {
                    bj4Var = bj4VarO;
                    i3 &= -113;
                    ox6Var4 = ox6Var3;
                    styleM578defaultStyleqUnfpCA = IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, bj4Var, 1572864, 63);
                } else {
                    bj4Var = bj4VarO;
                    ox6Var4 = ox6Var3;
                }
            }
            bj4Var.V();
            if (Build.VERSION.SDK_INT >= 28) {
                fM587getElevationD9Ej5fM = styleM578defaultStyleqUnfpCA.m587getElevationD9Ej5fM();
            } else {
                fM587getElevationD9Ej5fM = 2.0f;
            }
            float f3 = fM587getElevationD9Ej5fM;
            jl9 shape3 = styleM578defaultStyleqUnfpCA.getShape();
            uh1VarM588getShadowColorQN2ZGVo = styleM578defaultStyleqUnfpCA.m588getShadowColorQN2ZGVo();
            if (uh1VarM588getShadowColorQN2ZGVo != null) {
                j = uh1VarM588getShadowColorQN2ZGVo.a;
            } else {
                j = uh1.b;
            }
            ox6Var2 = ox6Var4;
            g51.b(pw3.c(ox6Var4, f3, shape3, 0L, j, 12), styleM578defaultStyleqUnfpCA.getShape(), d3a.c(styleM578defaultStyleqUnfpCA.m585getBackgroundColor0d7_KjU(), styleM578defaultStyleqUnfpCA.m586getContentColor0d7_KjU(), bj4Var, 0, 12), d3a.d(0.0f, 62), styleM578defaultStyleqUnfpCA.getBorder(), ei4Var, bj4Var, (i3 << 9) & 458752, 0);
            style2 = styleM578defaultStyleqUnfpCA;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: lh5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomCardKt.IntercomCard$lambda$0(ox6Var2, style2, ei4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }
}
