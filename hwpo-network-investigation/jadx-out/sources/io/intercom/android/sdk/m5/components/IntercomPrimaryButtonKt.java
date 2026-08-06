package io.intercom.android.sdk.m5.components;

import defpackage.b47;
import defpackage.b72;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gy2;
import defpackage.gz3;
import defpackage.hb;
import defpackage.ir9;
import defpackage.is7;
import defpackage.jt1;
import defpackage.jz0;
import defpackage.ko7;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.uh1;
import defpackage.vs0;
import defpackage.wja;
import defpackage.ws0;
import defpackage.xf0;
import defpackage.xj8;
import defpackage.zy0;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPrimaryButtonKt {
    public static final void IntercomPrimaryButton(String str, ox6 ox6Var, Integer num, mh4<g2b> mh4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final String str2;
        final mh4<g2b> mh4Var2;
        final ox6 ox6Var2;
        final Integer num2;
        str.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-801577387);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.J(num) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i3 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
            mh4Var2 = mh4Var;
            num2 = num;
            ox6Var2 = ox6Var;
            str2 = str;
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            ox6 ox6Var3 = ox6Var;
            if (i5 != 0) {
                num = null;
            }
            Integer num3 = num;
            LegacyIntercomPrimaryButton(str, ox6Var3, num3, mh4Var, bj4VarO, i3 & 8190, 0);
            str2 = str;
            mh4Var2 = mh4Var;
            ox6Var2 = ox6Var3;
            num2 = num3;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: gi5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomPrimaryButtonKt.IntercomPrimaryButton$lambda$0(str2, ox6Var2, num2, mh4Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b IntercomPrimaryButton$lambda$0(String str, ox6 ox6Var, Integer num, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        IntercomPrimaryButton(str, ox6Var, num, mh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void LegacyIntercomPrimaryButton(final mh4<g2b> mh4Var, ox6 ox6Var, boolean z, final ei4<? super oy8, ? super jt1, ? super Integer, g2b> ei4Var, jt1 jt1Var, final int i, final int i2) {
        mh4<g2b> mh4Var2;
        int i3;
        ox6 ox6Var2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        final ox6 ox6Var3;
        final boolean z3;
        IntercomTheme intercomTheme;
        int i7;
        vs0 vs0VarB;
        xj8 xj8VarW;
        mh4Var.getClass();
        ei4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-1285013288);
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
        int i8 = i2 & 2;
        if (i8 == 0) {
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
                if ((i2 & 8) != 0) {
                    if ((i & 3072) == 0) {
                        if (bj4VarO.j(ei4Var)) {
                            i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        } else {
                            i6 = 1024;
                        }
                        i3 |= i6;
                    }
                    if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                        if (i8 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        intercomTheme = IntercomTheme.INSTANCE;
                        i7 = IntercomTheme.$stable;
                        if (ColorExtensionsKt.m840isLightColor8_81llA(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU())) {
                            vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.b));
                        } else {
                            vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.e));
                        }
                        vs0 vs0Var = vs0VarB;
                        b72 b72Var = intercomTheme.getShapes(bj4VarO, i7).b;
                        ko7 ko7Var = zy0.a;
                        int i9 = ((i3 << 18) & 1879048192) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896);
                        jz0.a(mh4Var2, ox6Var3, z3, b72Var, zy0.a(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU(), intercomTheme.getColors(bj4VarO, i7).m769getOnAction0d7_KjU(), uh1.b(0.2f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), uh1.b(0.4f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), bj4VarO, 0), null, vs0Var, new ko7(16.0f, 12.0f, 16.0f, 12.0f), ei4Var, bj4VarO, i9, 288);
                        bj4VarO = bj4VarO;
                    } else {
                        bj4VarO.u();
                        ox6Var3 = ox6Var2;
                        z3 = z2;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: hi5
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(mh4Var, ox6Var3, z3, ei4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 3072;
                if ((i3 & 1171) == 1170) {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    intercomTheme = IntercomTheme.INSTANCE;
                    i7 = IntercomTheme.$stable;
                    if (ColorExtensionsKt.m840isLightColor8_81llA(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU())) {
                        vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.b));
                    } else {
                        vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.e));
                    }
                    vs0 vs0Var2 = vs0VarB;
                    b72 b72Var2 = intercomTheme.getShapes(bj4VarO, i7).b;
                    ko7 ko7Var2 = zy0.a;
                    int i10 = ((i3 << 18) & 1879048192) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896);
                    jz0.a(mh4Var2, ox6Var3, z3, b72Var2, zy0.a(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU(), intercomTheme.getColors(bj4VarO, i7).m769getOnAction0d7_KjU(), uh1.b(0.2f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), uh1.b(0.4f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), bj4VarO, 0), null, vs0Var2, new ko7(16.0f, 12.0f, 16.0f, 12.0f), ei4Var, bj4VarO, i10, 288);
                    bj4VarO = bj4VarO;
                } else {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    intercomTheme = IntercomTheme.INSTANCE;
                    i7 = IntercomTheme.$stable;
                    if (ColorExtensionsKt.m840isLightColor8_81llA(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU())) {
                        vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.b));
                    } else {
                        vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.e));
                    }
                    vs0 vs0Var3 = vs0VarB;
                    b72 b72Var3 = intercomTheme.getShapes(bj4VarO, i7).b;
                    ko7 ko7Var3 = zy0.a;
                    int i11 = ((i3 << 18) & 1879048192) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896);
                    jz0.a(mh4Var2, ox6Var3, z3, b72Var3, zy0.a(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU(), intercomTheme.getColors(bj4VarO, i7).m769getOnAction0d7_KjU(), uh1.b(0.2f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), uh1.b(0.4f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), bj4VarO, 0), null, vs0Var3, new ko7(16.0f, 12.0f, 16.0f, 12.0f), ei4Var, bj4VarO, i11, 288);
                    bj4VarO = bj4VarO;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: hi5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(mh4Var, ox6Var3, z3, ei4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i2 & 8) != 0) {
                if ((i & 3072) == 0) {
                    if (bj4VarO.j(ei4Var)) {
                        i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i3 & 1171) == 1170) {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    intercomTheme = IntercomTheme.INSTANCE;
                    i7 = IntercomTheme.$stable;
                    if (ColorExtensionsKt.m840isLightColor8_81llA(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU())) {
                        vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.b));
                    } else {
                        vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.e));
                    }
                    vs0 vs0Var4 = vs0VarB;
                    b72 b72Var4 = intercomTheme.getShapes(bj4VarO, i7).b;
                    ko7 ko7Var4 = zy0.a;
                    int i12 = ((i3 << 18) & 1879048192) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896);
                    jz0.a(mh4Var2, ox6Var3, z3, b72Var4, zy0.a(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU(), intercomTheme.getColors(bj4VarO, i7).m769getOnAction0d7_KjU(), uh1.b(0.2f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), uh1.b(0.4f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), bj4VarO, 0), null, vs0Var4, new ko7(16.0f, 12.0f, 16.0f, 12.0f), ei4Var, bj4VarO, i12, 288);
                    bj4VarO = bj4VarO;
                } else {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    intercomTheme = IntercomTheme.INSTANCE;
                    i7 = IntercomTheme.$stable;
                    if (ColorExtensionsKt.m840isLightColor8_81llA(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU())) {
                        vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.b));
                    } else {
                        vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.e));
                    }
                    vs0 vs0Var5 = vs0VarB;
                    b72 b72Var5 = intercomTheme.getShapes(bj4VarO, i7).b;
                    ko7 ko7Var5 = zy0.a;
                    int i13 = ((i3 << 18) & 1879048192) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896);
                    jz0.a(mh4Var2, ox6Var3, z3, b72Var5, zy0.a(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU(), intercomTheme.getColors(bj4VarO, i7).m769getOnAction0d7_KjU(), uh1.b(0.2f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), uh1.b(0.4f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), bj4VarO, 0), null, vs0Var5, new ko7(16.0f, 12.0f, 16.0f, 12.0f), ei4Var, bj4VarO, i13, 288);
                    bj4VarO = bj4VarO;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: hi5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(mh4Var, ox6Var3, z3, ei4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            if ((i3 & 1171) == 1170) {
                if (i8 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i7 = IntercomTheme.$stable;
                if (ColorExtensionsKt.m840isLightColor8_81llA(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU())) {
                    vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.b));
                } else {
                    vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.e));
                }
                vs0 vs0Var6 = vs0VarB;
                b72 b72Var6 = intercomTheme.getShapes(bj4VarO, i7).b;
                ko7 ko7Var6 = zy0.a;
                int i14 = ((i3 << 18) & 1879048192) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896);
                jz0.a(mh4Var2, ox6Var3, z3, b72Var6, zy0.a(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU(), intercomTheme.getColors(bj4VarO, i7).m769getOnAction0d7_KjU(), uh1.b(0.2f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), uh1.b(0.4f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), bj4VarO, 0), null, vs0Var6, new ko7(16.0f, 12.0f, 16.0f, 12.0f), ei4Var, bj4VarO, i14, 288);
                bj4VarO = bj4VarO;
            } else {
                if (i8 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i7 = IntercomTheme.$stable;
                if (ColorExtensionsKt.m840isLightColor8_81llA(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU())) {
                    vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.b));
                } else {
                    vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.e));
                }
                vs0 vs0Var7 = vs0VarB;
                b72 b72Var7 = intercomTheme.getShapes(bj4VarO, i7).b;
                ko7 ko7Var7 = zy0.a;
                int i15 = ((i3 << 18) & 1879048192) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896);
                jz0.a(mh4Var2, ox6Var3, z3, b72Var7, zy0.a(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU(), intercomTheme.getColors(bj4VarO, i7).m769getOnAction0d7_KjU(), uh1.b(0.2f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), uh1.b(0.4f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), bj4VarO, 0), null, vs0Var7, new ko7(16.0f, 12.0f, 16.0f, 12.0f), ei4Var, bj4VarO, i15, 288);
                bj4VarO = bj4VarO;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: hi5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(mh4Var, ox6Var3, z3, ei4Var, i, i2, (jt1) obj, iIntValue);
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
            if ((i2 & 8) != 0) {
                if ((i & 3072) == 0) {
                    if (bj4VarO.j(ei4Var)) {
                        i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i3 & 1171) == 1170) {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    intercomTheme = IntercomTheme.INSTANCE;
                    i7 = IntercomTheme.$stable;
                    if (ColorExtensionsKt.m840isLightColor8_81llA(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU())) {
                        vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.b));
                    } else {
                        vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.e));
                    }
                    vs0 vs0Var8 = vs0VarB;
                    b72 b72Var8 = intercomTheme.getShapes(bj4VarO, i7).b;
                    ko7 ko7Var8 = zy0.a;
                    int i16 = ((i3 << 18) & 1879048192) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896);
                    jz0.a(mh4Var2, ox6Var3, z3, b72Var8, zy0.a(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU(), intercomTheme.getColors(bj4VarO, i7).m769getOnAction0d7_KjU(), uh1.b(0.2f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), uh1.b(0.4f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), bj4VarO, 0), null, vs0Var8, new ko7(16.0f, 12.0f, 16.0f, 12.0f), ei4Var, bj4VarO, i16, 288);
                    bj4VarO = bj4VarO;
                } else {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    intercomTheme = IntercomTheme.INSTANCE;
                    i7 = IntercomTheme.$stable;
                    if (ColorExtensionsKt.m840isLightColor8_81llA(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU())) {
                        vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.b));
                    } else {
                        vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.e));
                    }
                    vs0 vs0Var9 = vs0VarB;
                    b72 b72Var9 = intercomTheme.getShapes(bj4VarO, i7).b;
                    ko7 ko7Var9 = zy0.a;
                    int i17 = ((i3 << 18) & 1879048192) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896);
                    jz0.a(mh4Var2, ox6Var3, z3, b72Var9, zy0.a(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU(), intercomTheme.getColors(bj4VarO, i7).m769getOnAction0d7_KjU(), uh1.b(0.2f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), uh1.b(0.4f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), bj4VarO, 0), null, vs0Var9, new ko7(16.0f, 12.0f, 16.0f, 12.0f), ei4Var, bj4VarO, i17, 288);
                    bj4VarO = bj4VarO;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: hi5
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(mh4Var, ox6Var3, z3, ei4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            if ((i3 & 1171) == 1170) {
                if (i8 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i7 = IntercomTheme.$stable;
                if (ColorExtensionsKt.m840isLightColor8_81llA(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU())) {
                    vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.b));
                } else {
                    vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.e));
                }
                vs0 vs0Var10 = vs0VarB;
                b72 b72Var10 = intercomTheme.getShapes(bj4VarO, i7).b;
                ko7 ko7Var10 = zy0.a;
                int i18 = ((i3 << 18) & 1879048192) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896);
                jz0.a(mh4Var2, ox6Var3, z3, b72Var10, zy0.a(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU(), intercomTheme.getColors(bj4VarO, i7).m769getOnAction0d7_KjU(), uh1.b(0.2f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), uh1.b(0.4f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), bj4VarO, 0), null, vs0Var10, new ko7(16.0f, 12.0f, 16.0f, 12.0f), ei4Var, bj4VarO, i18, 288);
                bj4VarO = bj4VarO;
            } else {
                if (i8 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i7 = IntercomTheme.$stable;
                if (ColorExtensionsKt.m840isLightColor8_81llA(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU())) {
                    vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.b));
                } else {
                    vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.e));
                }
                vs0 vs0Var11 = vs0VarB;
                b72 b72Var11 = intercomTheme.getShapes(bj4VarO, i7).b;
                ko7 ko7Var11 = zy0.a;
                int i19 = ((i3 << 18) & 1879048192) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896);
                jz0.a(mh4Var2, ox6Var3, z3, b72Var11, zy0.a(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU(), intercomTheme.getColors(bj4VarO, i7).m769getOnAction0d7_KjU(), uh1.b(0.2f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), uh1.b(0.4f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), bj4VarO, 0), null, vs0Var11, new ko7(16.0f, 12.0f, 16.0f, 12.0f), ei4Var, bj4VarO, i19, 288);
                bj4VarO = bj4VarO;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: hi5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(mh4Var, ox6Var3, z3, ei4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i2 & 8) != 0) {
            if ((i & 3072) == 0) {
                if (bj4VarO.j(ei4Var)) {
                    i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) == 1170) {
                if (i8 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i7 = IntercomTheme.$stable;
                if (ColorExtensionsKt.m840isLightColor8_81llA(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU())) {
                    vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.b));
                } else {
                    vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.e));
                }
                vs0 vs0Var12 = vs0VarB;
                b72 b72Var12 = intercomTheme.getShapes(bj4VarO, i7).b;
                ko7 ko7Var12 = zy0.a;
                int i110 = ((i3 << 18) & 1879048192) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896);
                jz0.a(mh4Var2, ox6Var3, z3, b72Var12, zy0.a(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU(), intercomTheme.getColors(bj4VarO, i7).m769getOnAction0d7_KjU(), uh1.b(0.2f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), uh1.b(0.4f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), bj4VarO, 0), null, vs0Var12, new ko7(16.0f, 12.0f, 16.0f, 12.0f), ei4Var, bj4VarO, i110, 288);
                bj4VarO = bj4VarO;
            } else {
                if (i8 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                intercomTheme = IntercomTheme.INSTANCE;
                i7 = IntercomTheme.$stable;
                if (ColorExtensionsKt.m840isLightColor8_81llA(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU())) {
                    vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.b));
                } else {
                    vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.e));
                }
                vs0 vs0Var13 = vs0VarB;
                b72 b72Var13 = intercomTheme.getShapes(bj4VarO, i7).b;
                ko7 ko7Var13 = zy0.a;
                int i111 = ((i3 << 18) & 1879048192) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896);
                jz0.a(mh4Var2, ox6Var3, z3, b72Var13, zy0.a(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU(), intercomTheme.getColors(bj4VarO, i7).m769getOnAction0d7_KjU(), uh1.b(0.2f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), uh1.b(0.4f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), bj4VarO, 0), null, vs0Var13, new ko7(16.0f, 12.0f, 16.0f, 12.0f), ei4Var, bj4VarO, i111, 288);
                bj4VarO = bj4VarO;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: hi5
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(mh4Var, ox6Var3, z3, ei4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        if ((i3 & 1171) == 1170) {
            if (i8 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i4 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            intercomTheme = IntercomTheme.INSTANCE;
            i7 = IntercomTheme.$stable;
            if (ColorExtensionsKt.m840isLightColor8_81llA(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU())) {
                vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.b));
            } else {
                vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.e));
            }
            vs0 vs0Var14 = vs0VarB;
            b72 b72Var14 = intercomTheme.getShapes(bj4VarO, i7).b;
            ko7 ko7Var14 = zy0.a;
            int i112 = ((i3 << 18) & 1879048192) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896);
            jz0.a(mh4Var2, ox6Var3, z3, b72Var14, zy0.a(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU(), intercomTheme.getColors(bj4VarO, i7).m769getOnAction0d7_KjU(), uh1.b(0.2f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), uh1.b(0.4f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), bj4VarO, 0), null, vs0Var14, new ko7(16.0f, 12.0f, 16.0f, 12.0f), ei4Var, bj4VarO, i112, 288);
            bj4VarO = bj4VarO;
        } else {
            if (i8 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i4 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            intercomTheme = IntercomTheme.INSTANCE;
            i7 = IntercomTheme.$stable;
            if (ColorExtensionsKt.m840isLightColor8_81llA(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU())) {
                vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.b));
            } else {
                vs0VarB = ws0.b(1.0f, uh1.b(0.2f, uh1.e));
            }
            vs0 vs0Var15 = vs0VarB;
            b72 b72Var15 = intercomTheme.getShapes(bj4VarO, i7).b;
            ko7 ko7Var15 = zy0.a;
            int i113 = ((i3 << 18) & 1879048192) | (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896);
            jz0.a(mh4Var2, ox6Var3, z3, b72Var15, zy0.a(intercomTheme.getColors(bj4VarO, i7).m751getAction0d7_KjU(), intercomTheme.getColors(bj4VarO, i7).m769getOnAction0d7_KjU(), uh1.b(0.2f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), uh1.b(0.4f, intercomTheme.getColors(bj4VarO, i7).getText().m824getDefault0d7_KjU()), bj4VarO, 0), null, vs0Var15, new ko7(16.0f, 12.0f, 16.0f, 12.0f), ei4Var, bj4VarO, i113, 288);
            bj4VarO = bj4VarO;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: hi5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(mh4Var, ox6Var3, z3, ei4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LegacyIntercomPrimaryButton$lambda$1(String str, ox6 ox6Var, Integer num, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        LegacyIntercomPrimaryButton(str, ox6Var, num, (mh4<g2b>) mh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b LegacyIntercomPrimaryButton$lambda$2(mh4 mh4Var, ox6 ox6Var, boolean z, ei4 ei4Var, int i, int i2, jt1 jt1Var, int i3) {
        LegacyIntercomPrimaryButton((mh4<g2b>) mh4Var, ox6Var, z, (ei4<? super oy8, ? super jt1, ? super Integer, g2b>) ei4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void PrimaryButtonPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1925294537);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomPrimaryButtonKt.INSTANCE.m63getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new xf0(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PrimaryButtonPreview$lambda$3(int i, jt1 jt1Var, int i2) {
        PrimaryButtonPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void PrimaryButtonWithTrailingIconPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1297682962);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomPrimaryButtonKt.INSTANCE.m64getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new hb(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PrimaryButtonWithTrailingIconPreview$lambda$4(int i, jt1 jt1Var, int i2) {
        PrimaryButtonWithTrailingIconPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @gy2
    private static final void LegacyIntercomPrimaryButton(final String str, ox6 ox6Var, Integer num, final mh4<g2b> mh4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        mh4<g2b> mh4Var2;
        final Integer num2;
        bj4 bj4VarO = jt1Var.o(398234558);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.J(num) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            mh4Var2 = mh4Var;
        } else {
            mh4Var2 = mh4Var;
            if ((i & 3072) == 0) {
                i3 |= bj4VarO.j(mh4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
        }
        if ((i3 & 1155) == 1154 && bj4VarO.r()) {
            bj4VarO.u();
            num2 = num;
        } else {
            if ((i2 & 2) != 0) {
                ox6Var = ox6.a.t;
            }
            final Integer num3 = i4 != 0 ? null : num;
            LegacyIntercomPrimaryButton(mh4Var2, (ox6) null, false, (ei4<? super oy8, ? super jt1, ? super Integer, g2b>) gr1.b(2099872974, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton.1
                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i5) {
                    oy8Var.getClass();
                    if ((i5 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    String str2 = str;
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i6 = IntercomTheme.$stable;
                    mia.b(str2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(jt1Var2, i6).getType04(), intercomTheme.getColors(jt1Var2, i6).m769getOnAction0d7_KjU(), 0L, null, null, 0L, 0L, null, null, 16777214), jt1Var2, 0, 0, 131070);
                    Integer num4 = num3;
                    if (num4 == null) {
                        return;
                    }
                    int iIntValue = num4.intValue();
                    ox6.a aVar = ox6.a.t;
                    b47.b(jt1Var2, ir9.n(aVar, 6.0f));
                    m65.b(is7.a(iIntValue, jt1Var2, 0), null, ir9.j(aVar, 16.0f), intercomTheme.getColors(jt1Var2, i6).m769getOnAction0d7_KjU(), jt1Var2, 440, 0);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num4) {
                    invoke(oy8Var, jt1Var2, num4.intValue());
                    return g2b.a;
                }
            }, bj4VarO), (jt1) bj4VarO, ((i3 >> 9) & 14) | 3072, 6);
            num2 = num3;
        }
        final ox6 ox6Var2 = ox6Var;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ii5
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$1(str, ox6Var2, num2, mh4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }
}
