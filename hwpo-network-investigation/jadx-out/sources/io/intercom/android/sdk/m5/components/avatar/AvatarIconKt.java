package io.intercom.android.sdk.m5.components.avatar;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.a4a;
import defpackage.aa0;
import defpackage.ag0;
import defpackage.al8;
import defpackage.ay8;
import defpackage.b4a;
import defpackage.bg0;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.ci4;
import defpackage.d73;
import defpackage.dg0;
import defpackage.di;
import defpackage.dv0;
import defpackage.ec9;
import defpackage.eo7;
import defpackage.f50;
import defpackage.fi4;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.h86;
import defpackage.hb;
import defpackage.hc9;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jl9;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.m65;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ns0;
import defpackage.oh4;
import defpackage.ov0;
import defpackage.ox6;
import defpackage.pb9;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.u;
import defpackage.u7d;
import defpackage.uh1;
import defpackage.uma;
import defpackage.us3;
import defpackage.ws0;
import defpackage.xf0;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.y43;
import defpackage.z2a;
import defpackage.z75;
import defpackage.zf0;
import defpackage.zx8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AvatarIconKt {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarShape.values().length];
            try {
                iArr[AvatarShape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarShape.SQUIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AvatarActiveIndicator(final ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(-1051352444);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            final long jM753getActive0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m753getActive0d7_KjU();
            ox6 ox6VarJ = ir9.j(ox6Var, 8.0f);
            bj4VarO.K(821186808);
            boolean zI = bj4VarO.i(jM753getActive0d7_KjU);
            Object objF = bj4VarO.f();
            if (zI || objF == jt1.a.a) {
                objF = new oh4() { // from class: eg0
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return AvatarIconKt.AvatarActiveIndicator$lambda$16$lambda$15(jM753getActive0d7_KjU, (d73) obj);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            us3.b(ox6VarJ, (oh4) objF, bj4VarO, 0);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: fg0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AvatarIconKt.AvatarActiveIndicator$lambda$17(ox6Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AvatarActiveIndicator$lambda$16$lambda$15(long j, d73 d73Var) {
        d73Var.getClass();
        d73.N(d73Var, j, 0.0f, 0L, 0, 126);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AvatarActiveIndicator$lambda$17(ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        AvatarActiveIndicator(ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0149  */
    /* JADX WARN: Code duplicated, block: B:102:0x0165  */
    /* JADX WARN: Code duplicated, block: B:106:0x019c  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x010e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x012a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0133  */
    /* JADX INFO: renamed from: AvatarIcon-Rd90Nhg, reason: not valid java name */
    public static final void m91AvatarIconRd90Nhg(ox6 ox6Var, final AvatarWrapper avatarWrapper, jl9 jl9Var, boolean z, long j, uh1 uh1Var, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        AvatarWrapper avatarWrapper2;
        jl9 jl9Var2;
        boolean z2;
        long j2;
        int i4;
        uh1 uh1Var2;
        int i5;
        ox6 ox6Var3;
        jl9 composeShape;
        ox6 ox6Var4;
        int i6;
        boolean z3;
        long j3;
        uh1 uh1Var3;
        final boolean z4;
        final uh1 uh1Var4;
        final ox6 ox6Var5;
        final jl9 jl9Var3;
        final long j4;
        xj8 xj8VarW;
        int i7;
        avatarWrapper.getClass();
        bj4 bj4VarO = jt1Var.o(462320907);
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
            avatarWrapper2 = avatarWrapper;
        } else {
            avatarWrapper2 = avatarWrapper;
            if ((i & 48) == 0) {
                i3 |= bj4VarO.j(avatarWrapper2) ? 32 : 16;
            }
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                jl9Var2 = jl9Var;
                int i9 = bj4VarO.J(jl9Var2) ? 256 : 128;
                i3 |= i9;
            } else {
                jl9Var2 = jl9Var;
            }
            i3 |= i9;
        } else {
            jl9Var2 = jl9Var;
        }
        int i10 = i2 & 8;
        if (i10 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= bj4VarO.c(z2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            if ((i & 24576) == 0) {
                j2 = j;
                if ((i2 & 16) == 0 || !bj4VarO.i(j2)) {
                    i7 = 8192;
                } else {
                    i7 = 16384;
                }
                i3 |= i7;
            } else {
                j2 = j;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    uh1Var2 = uh1Var;
                    if (bj4VarO.J(uh1Var2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((74899 & i3) == 74898 || !bj4VarO.r()) {
                    bj4VarO.v0();
                    if ((i & 1) != 0 || bj4VarO.c0()) {
                        if (i8 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if ((i2 & 4) != 0) {
                            AvatarShape shape = avatarWrapper2.getAvatar().getShape();
                            shape.getClass();
                            composeShape = getComposeShape(shape);
                            i3 &= -897;
                        } else {
                            composeShape = jl9Var2;
                        }
                        if (i10 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                        }
                        if (i4 != 0) {
                            int i11 = i3;
                            ox6Var4 = ox6Var3;
                            i6 = i11;
                            uh1Var3 = null;
                            z3 = z2;
                            j3 = j2;
                            jl9Var2 = composeShape;
                        } else {
                            int i12 = i3;
                            ox6Var4 = ox6Var3;
                            i6 = i12;
                            jl9Var2 = composeShape;
                            z3 = z2;
                            j3 = j2;
                            uh1Var3 = uh1Var2;
                        }
                    } else {
                        bj4VarO.u();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        i6 = i3;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                        ox6Var4 = ox6Var2;
                    }
                    bj4VarO.V();
                    if (xj5.a(jl9Var2, getComposeShape(AvatarShape.SQUIRCLE))) {
                        bj4VarO.K(1816789334);
                        FinAvatar(ox6Var4, avatarWrapper, jl9Var2, bj4VarO, i6 & 1022, 0);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(1816937855);
                        m93DefaultAvatarRd90Nhg(avatarWrapper, ox6Var4, jl9Var2, z3, j3, uh1Var3, bj4VarO, ((i6 >> 3) & 14) | ((i6 << 3) & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752), 0);
                        bj4VarO.U(false);
                    }
                    z4 = z3;
                    uh1Var4 = uh1Var3;
                    long j5 = j3;
                    ox6Var5 = ox6Var4;
                    jl9Var3 = jl9Var2;
                    j4 = j5;
                } else {
                    bj4VarO.u();
                    jl9Var3 = jl9Var2;
                    j4 = j2;
                    uh1Var4 = uh1Var2;
                    z4 = z2;
                    ox6Var5 = ox6Var2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: jg0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AvatarIconKt.AvatarIcon_Rd90Nhg$lambda$0(ox6Var5, avatarWrapper, jl9Var3, z4, j4, uh1Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            uh1Var2 = uh1Var;
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        AvatarShape shape2 = avatarWrapper2.getAvatar().getShape();
                        shape2.getClass();
                        composeShape = getComposeShape(shape2);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i10 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i4 != 0) {
                        int i13 = i3;
                        ox6Var4 = ox6Var3;
                        i6 = i13;
                        uh1Var3 = null;
                        z3 = z2;
                        j3 = j2;
                        jl9Var2 = composeShape;
                    } else {
                        int i14 = i3;
                        ox6Var4 = ox6Var3;
                        i6 = i14;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                } else {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        AvatarShape shape3 = avatarWrapper2.getAvatar().getShape();
                        shape3.getClass();
                        composeShape = getComposeShape(shape3);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i10 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i4 != 0) {
                        int i15 = i3;
                        ox6Var4 = ox6Var3;
                        i6 = i15;
                        uh1Var3 = null;
                        z3 = z2;
                        j3 = j2;
                        jl9Var2 = composeShape;
                    } else {
                        int i16 = i3;
                        ox6Var4 = ox6Var3;
                        i6 = i16;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                }
                bj4VarO.V();
                if (xj5.a(jl9Var2, getComposeShape(AvatarShape.SQUIRCLE))) {
                    bj4VarO.K(1816789334);
                    FinAvatar(ox6Var4, avatarWrapper, jl9Var2, bj4VarO, i6 & 1022, 0);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(1816937855);
                    m93DefaultAvatarRd90Nhg(avatarWrapper, ox6Var4, jl9Var2, z3, j3, uh1Var3, bj4VarO, ((i6 >> 3) & 14) | ((i6 << 3) & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752), 0);
                    bj4VarO.U(false);
                }
                z4 = z3;
                uh1Var4 = uh1Var3;
                long j6 = j3;
                ox6Var5 = ox6Var4;
                jl9Var3 = jl9Var2;
                j4 = j6;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        AvatarShape shape4 = avatarWrapper2.getAvatar().getShape();
                        shape4.getClass();
                        composeShape = getComposeShape(shape4);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i10 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i4 != 0) {
                        int i17 = i3;
                        ox6Var4 = ox6Var3;
                        i6 = i17;
                        uh1Var3 = null;
                        z3 = z2;
                        j3 = j2;
                        jl9Var2 = composeShape;
                    } else {
                        int i18 = i3;
                        ox6Var4 = ox6Var3;
                        i6 = i18;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                } else {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        AvatarShape shape5 = avatarWrapper2.getAvatar().getShape();
                        shape5.getClass();
                        composeShape = getComposeShape(shape5);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i10 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i4 != 0) {
                        int i19 = i3;
                        ox6Var4 = ox6Var3;
                        i6 = i19;
                        uh1Var3 = null;
                        z3 = z2;
                        j3 = j2;
                        jl9Var2 = composeShape;
                    } else {
                        int i110 = i3;
                        ox6Var4 = ox6Var3;
                        i6 = i110;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                }
                bj4VarO.V();
                if (xj5.a(jl9Var2, getComposeShape(AvatarShape.SQUIRCLE))) {
                    bj4VarO.K(1816789334);
                    FinAvatar(ox6Var4, avatarWrapper, jl9Var2, bj4VarO, i6 & 1022, 0);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(1816937855);
                    m93DefaultAvatarRd90Nhg(avatarWrapper, ox6Var4, jl9Var2, z3, j3, uh1Var3, bj4VarO, ((i6 >> 3) & 14) | ((i6 << 3) & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752), 0);
                    bj4VarO.U(false);
                }
                z4 = z3;
                uh1Var4 = uh1Var3;
                long j7 = j3;
                ox6Var5 = ox6Var4;
                jl9Var3 = jl9Var2;
                j4 = j7;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: jg0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AvatarIconKt.AvatarIcon_Rd90Nhg$lambda$0(ox6Var5, avatarWrapper, jl9Var3, z4, j4, uh1Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            j2 = j;
            if ((i2 & 16) == 0) {
                i7 = 8192;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        } else {
            j2 = j;
        }
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                uh1Var2 = uh1Var;
                if (bj4VarO.J(uh1Var2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        AvatarShape shape6 = avatarWrapper2.getAvatar().getShape();
                        shape6.getClass();
                        composeShape = getComposeShape(shape6);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i10 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i4 != 0) {
                        int i111 = i3;
                        ox6Var4 = ox6Var3;
                        i6 = i111;
                        uh1Var3 = null;
                        z3 = z2;
                        j3 = j2;
                        jl9Var2 = composeShape;
                    } else {
                        int i112 = i3;
                        ox6Var4 = ox6Var3;
                        i6 = i112;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                } else {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        AvatarShape shape7 = avatarWrapper2.getAvatar().getShape();
                        shape7.getClass();
                        composeShape = getComposeShape(shape7);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i10 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i4 != 0) {
                        int i113 = i3;
                        ox6Var4 = ox6Var3;
                        i6 = i113;
                        uh1Var3 = null;
                        z3 = z2;
                        j3 = j2;
                        jl9Var2 = composeShape;
                    } else {
                        int i114 = i3;
                        ox6Var4 = ox6Var3;
                        i6 = i114;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                }
                bj4VarO.V();
                if (xj5.a(jl9Var2, getComposeShape(AvatarShape.SQUIRCLE))) {
                    bj4VarO.K(1816789334);
                    FinAvatar(ox6Var4, avatarWrapper, jl9Var2, bj4VarO, i6 & 1022, 0);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(1816937855);
                    m93DefaultAvatarRd90Nhg(avatarWrapper, ox6Var4, jl9Var2, z3, j3, uh1Var3, bj4VarO, ((i6 >> 3) & 14) | ((i6 << 3) & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752), 0);
                    bj4VarO.U(false);
                }
                z4 = z3;
                uh1Var4 = uh1Var3;
                long j8 = j3;
                ox6Var5 = ox6Var4;
                jl9Var3 = jl9Var2;
                j4 = j8;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        AvatarShape shape8 = avatarWrapper2.getAvatar().getShape();
                        shape8.getClass();
                        composeShape = getComposeShape(shape8);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i10 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i4 != 0) {
                        int i115 = i3;
                        ox6Var4 = ox6Var3;
                        i6 = i115;
                        uh1Var3 = null;
                        z3 = z2;
                        j3 = j2;
                        jl9Var2 = composeShape;
                    } else {
                        int i116 = i3;
                        ox6Var4 = ox6Var3;
                        i6 = i116;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                } else {
                    if (i8 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        AvatarShape shape9 = avatarWrapper2.getAvatar().getShape();
                        shape9.getClass();
                        composeShape = getComposeShape(shape9);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i10 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i4 != 0) {
                        int i117 = i3;
                        ox6Var4 = ox6Var3;
                        i6 = i117;
                        uh1Var3 = null;
                        z3 = z2;
                        j3 = j2;
                        jl9Var2 = composeShape;
                    } else {
                        int i118 = i3;
                        ox6Var4 = ox6Var3;
                        i6 = i118;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                }
                bj4VarO.V();
                if (xj5.a(jl9Var2, getComposeShape(AvatarShape.SQUIRCLE))) {
                    bj4VarO.K(1816789334);
                    FinAvatar(ox6Var4, avatarWrapper, jl9Var2, bj4VarO, i6 & 1022, 0);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(1816937855);
                    m93DefaultAvatarRd90Nhg(avatarWrapper, ox6Var4, jl9Var2, z3, j3, uh1Var3, bj4VarO, ((i6 >> 3) & 14) | ((i6 << 3) & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752), 0);
                    bj4VarO.U(false);
                }
                z4 = z3;
                uh1Var4 = uh1Var3;
                long j9 = j3;
                ox6Var5 = ox6Var4;
                jl9Var3 = jl9Var2;
                j4 = j9;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: jg0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AvatarIconKt.AvatarIcon_Rd90Nhg$lambda$0(ox6Var5, avatarWrapper, jl9Var3, z4, j4, uh1Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        uh1Var2 = uh1Var;
        if ((74899 & i3) == 74898) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    AvatarShape shape10 = avatarWrapper2.getAvatar().getShape();
                    shape10.getClass();
                    composeShape = getComposeShape(shape10);
                    i3 &= -897;
                } else {
                    composeShape = jl9Var2;
                }
                if (i10 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                }
                if (i4 != 0) {
                    int i119 = i3;
                    ox6Var4 = ox6Var3;
                    i6 = i119;
                    uh1Var3 = null;
                    z3 = z2;
                    j3 = j2;
                    jl9Var2 = composeShape;
                } else {
                    int i1110 = i3;
                    ox6Var4 = ox6Var3;
                    i6 = i1110;
                    jl9Var2 = composeShape;
                    z3 = z2;
                    j3 = j2;
                    uh1Var3 = uh1Var2;
                }
            } else {
                if (i8 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    AvatarShape shape11 = avatarWrapper2.getAvatar().getShape();
                    shape11.getClass();
                    composeShape = getComposeShape(shape11);
                    i3 &= -897;
                } else {
                    composeShape = jl9Var2;
                }
                if (i10 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                }
                if (i4 != 0) {
                    int i1111 = i3;
                    ox6Var4 = ox6Var3;
                    i6 = i1111;
                    uh1Var3 = null;
                    z3 = z2;
                    j3 = j2;
                    jl9Var2 = composeShape;
                } else {
                    int i1112 = i3;
                    ox6Var4 = ox6Var3;
                    i6 = i1112;
                    jl9Var2 = composeShape;
                    z3 = z2;
                    j3 = j2;
                    uh1Var3 = uh1Var2;
                }
            }
            bj4VarO.V();
            if (xj5.a(jl9Var2, getComposeShape(AvatarShape.SQUIRCLE))) {
                bj4VarO.K(1816789334);
                FinAvatar(ox6Var4, avatarWrapper, jl9Var2, bj4VarO, i6 & 1022, 0);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(1816937855);
                m93DefaultAvatarRd90Nhg(avatarWrapper, ox6Var4, jl9Var2, z3, j3, uh1Var3, bj4VarO, ((i6 >> 3) & 14) | ((i6 << 3) & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752), 0);
                bj4VarO.U(false);
            }
            z4 = z3;
            uh1Var4 = uh1Var3;
            long j10 = j3;
            ox6Var5 = ox6Var4;
            jl9Var3 = jl9Var2;
            j4 = j10;
        } else {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    AvatarShape shape12 = avatarWrapper2.getAvatar().getShape();
                    shape12.getClass();
                    composeShape = getComposeShape(shape12);
                    i3 &= -897;
                } else {
                    composeShape = jl9Var2;
                }
                if (i10 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                }
                if (i4 != 0) {
                    int i1113 = i3;
                    ox6Var4 = ox6Var3;
                    i6 = i1113;
                    uh1Var3 = null;
                    z3 = z2;
                    j3 = j2;
                    jl9Var2 = composeShape;
                } else {
                    int i1114 = i3;
                    ox6Var4 = ox6Var3;
                    i6 = i1114;
                    jl9Var2 = composeShape;
                    z3 = z2;
                    j3 = j2;
                    uh1Var3 = uh1Var2;
                }
            } else {
                if (i8 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    AvatarShape shape13 = avatarWrapper2.getAvatar().getShape();
                    shape13.getClass();
                    composeShape = getComposeShape(shape13);
                    i3 &= -897;
                } else {
                    composeShape = jl9Var2;
                }
                if (i10 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                }
                if (i4 != 0) {
                    int i1115 = i3;
                    ox6Var4 = ox6Var3;
                    i6 = i1115;
                    uh1Var3 = null;
                    z3 = z2;
                    j3 = j2;
                    jl9Var2 = composeShape;
                } else {
                    int i1116 = i3;
                    ox6Var4 = ox6Var3;
                    i6 = i1116;
                    jl9Var2 = composeShape;
                    z3 = z2;
                    j3 = j2;
                    uh1Var3 = uh1Var2;
                }
            }
            bj4VarO.V();
            if (xj5.a(jl9Var2, getComposeShape(AvatarShape.SQUIRCLE))) {
                bj4VarO.K(1816789334);
                FinAvatar(ox6Var4, avatarWrapper, jl9Var2, bj4VarO, i6 & 1022, 0);
                bj4VarO.U(false);
            } else {
                bj4VarO.K(1816937855);
                m93DefaultAvatarRd90Nhg(avatarWrapper, ox6Var4, jl9Var2, z3, j3, uh1Var3, bj4VarO, ((i6 >> 3) & 14) | ((i6 << 3) & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752), 0);
                bj4VarO.U(false);
            }
            z4 = z3;
            uh1Var4 = uh1Var3;
            long j11 = j3;
            ox6Var5 = ox6Var4;
            jl9Var3 = jl9Var2;
            j4 = j11;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: jg0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AvatarIconKt.AvatarIcon_Rd90Nhg$lambda$0(ox6Var5, avatarWrapper, jl9Var3, z4, j4, uh1Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    private static final void AvatarIconActivePreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-382759013);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m95getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: yf0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AvatarIconKt.AvatarIconActivePreview$lambda$23(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AvatarIconActivePreview$lambda$23(int i, jt1 jt1Var, int i2) {
        AvatarIconActivePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void AvatarIconCutPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1591864993);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m97getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new hb(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AvatarIconCutPreview$lambda$25(int i, jt1 jt1Var, int i2) {
        AvatarIconCutPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void AvatarIconPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1461886463);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m94getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new zf0(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AvatarIconPreview$lambda$22(int i, jt1 jt1Var, int i2) {
        AvatarIconPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void AvatarIconSquirclePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1626854011);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m96getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ag0(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AvatarIconSquirclePreview$lambda$24(int i, jt1 jt1Var, int i2) {
        AvatarIconSquirclePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AvatarIcon_Rd90Nhg$lambda$0(ox6 ox6Var, AvatarWrapper avatarWrapper, jl9 jl9Var, boolean z, long j, uh1 uh1Var, int i, int i2, jt1 jt1Var, int i3) {
        m91AvatarIconRd90Nhg(ox6Var, avatarWrapper, jl9Var, z, j, uh1Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:74:0x0113  */
    /* JADX WARN: Code duplicated, block: B:75:0x0115  */
    /* JADX WARN: Code duplicated, block: B:78:0x011c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0123  */
    /* JADX WARN: Code duplicated, block: B:84:0x0171  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:90:0x01be  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: AvatarPlaceholder-jxWH9Kg, reason: not valid java name */
    private static final void m92AvatarPlaceholderjxWH9Kg(ox6 ox6Var, final String str, final long j, final long j2, final String str2, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        String str3;
        long j3;
        int i4;
        int i5;
        ox6.a aVar;
        ox6 ox6Var3;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        boolean z;
        Object objF;
        boolean z2;
        xj8 xj8VarW;
        bj4 bj4VarO = jt1Var.o(-99590848);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
            str3 = str;
        } else {
            str3 = str;
            if ((i & 48) == 0) {
                i3 |= bj4VarO.J(str3) ? 32 : 16;
            }
        }
        if ((i2 & 4) == 0) {
            if ((i & 384) == 0) {
                i3 |= bj4VarO.i(j) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
                j3 = j2;
            } else {
                j3 = j2;
                if ((i & 3072) == 0) {
                    if (bj4VarO.i(j3)) {
                        i4 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i4 = 1024;
                    }
                    i3 |= i4;
                }
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (bj4VarO.J(str2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i6 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                fl6VarD = dv0.d(di.a.e, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var3);
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
                if (z2a.w(str3)) {
                    bj4VarO.K(-2026212151);
                    m65.b(is7.a(R.drawable.intercom_ic_avatar_person, bj4VarO, 0), str2, eo7.i(ox6Var3, 8.0f), j, bj4VarO, ((i3 << 3) & 7168) | ((i3 >> 9) & 112) | 8, 0);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(-2026561893);
                    bj4VarO.K(-758107778);
                    if ((i3 & 57344) == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objF = bj4VarO.f();
                    if (!z || objF == jt1.a.a) {
                        z2 = false;
                        objF = new bg0(0 == true ? 1 : 0, str2);
                        bj4VarO.C(objF);
                    } else {
                        z2 = false;
                    }
                    bj4VarO.U(z2);
                    mia.b(str3, pb9.b(aVar, z2, (oh4) objF), j, j3, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), bj4VarO, ((i3 >> 3) & 14) | (i3 & 896) | (57344 & (i3 << 3)), 0, 131048);
                    bj4VarO.U(z2);
                }
                bj4VarO.U(true);
                ox6Var2 = ox6Var3;
            } else {
                bj4VarO.u();
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: cg0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AvatarIconKt.AvatarPlaceholder_jxWH9Kg$lambda$21(ox6Var2, str, j, j2, str2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            j3 = j2;
        } else {
            j3 = j2;
            if ((i & 3072) == 0) {
                if (bj4VarO.i(j3)) {
                    i4 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (bj4VarO.J(str2)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((i3 & 9363) == 9362) {
            aVar = ox6.a.t;
            if (i6 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            fl6VarD = dv0.d(di.a.e, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var3);
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
            if (z2a.w(str3)) {
                bj4VarO.K(-2026561893);
                bj4VarO.K(-758107778);
                if ((i3 & 57344) == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    z2 = false;
                    objF = new bg0(0 == true ? 1 : 0, str2);
                    bj4VarO.C(objF);
                } else {
                    z2 = false;
                    objF = new bg0(0 == true ? 1 : 0, str2);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(z2);
                mia.b(str3, pb9.b(aVar, z2, (oh4) objF), j, j3, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), bj4VarO, ((i3 >> 3) & 14) | (i3 & 896) | (57344 & (i3 << 3)), 0, 131048);
                bj4VarO.U(z2);
            } else {
                bj4VarO.K(-2026212151);
                m65.b(is7.a(R.drawable.intercom_ic_avatar_person, bj4VarO, 0), str2, eo7.i(ox6Var3, 8.0f), j, bj4VarO, ((i3 << 3) & 7168) | ((i3 >> 9) & 112) | 8, 0);
                bj4VarO.U(false);
            }
            bj4VarO.U(true);
            ox6Var2 = ox6Var3;
        } else {
            aVar = ox6.a.t;
            if (i6 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            fl6VarD = dv0.d(di.a.e, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var3);
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
            if (z2a.w(str3)) {
                bj4VarO.K(-2026561893);
                bj4VarO.K(-758107778);
                if ((i3 & 57344) == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                objF = bj4VarO.f();
                if (z) {
                    z2 = false;
                    objF = new bg0(0 == true ? 1 : 0, str2);
                    bj4VarO.C(objF);
                } else {
                    z2 = false;
                    objF = new bg0(0 == true ? 1 : 0, str2);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(z2);
                mia.b(str3, pb9.b(aVar, z2, (oh4) objF), j, j3, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5(), bj4VarO, ((i3 >> 3) & 14) | (i3 & 896) | (57344 & (i3 << 3)), 0, 131048);
                bj4VarO.U(z2);
            } else {
                bj4VarO.K(-2026212151);
                m65.b(is7.a(R.drawable.intercom_ic_avatar_person, bj4VarO, 0), str2, eo7.i(ox6Var3, 8.0f), j, bj4VarO, ((i3 << 3) & 7168) | ((i3 >> 9) & 112) | 8, 0);
                bj4VarO.U(false);
            }
            bj4VarO.U(true);
            ox6Var2 = ox6Var3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: cg0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AvatarIconKt.AvatarPlaceholder_jxWH9Kg$lambda$21(ox6Var2, str, j, j2, str2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AvatarPlaceholder_jxWH9Kg$lambda$20$lambda$19$lambda$18(String str, hc9 hc9Var) {
        hc9Var.getClass();
        ec9.b(str, hc9Var);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AvatarPlaceholder_jxWH9Kg$lambda$21(ox6 ox6Var, String str, long j, long j2, String str2, int i, int i2, jt1 jt1Var, int i3) {
        m92AvatarPlaceholderjxWH9Kg(ox6Var, str, j, j2, str2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Code duplicated, block: B:30:0x004a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    private static final void BotAvatarPlaceholder(final AvatarWrapper avatarWrapper, ox6 ox6Var, float f, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final ox6 ox6Var2;
        int i4;
        float f2;
        int i5;
        ox6 ox6Var3;
        float f3;
        final float f4;
        xj8 xj8VarW;
        bj4 bj4VarO = jt1Var.o(1859249921);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(avatarWrapper) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    f2 = f;
                    if (bj4VarO.g(f2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 147) == 146 || !bj4VarO.r()) {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    z75.a(is7.a(R.drawable.intercom_default_avatar_icon, bj4VarO, 0), avatarWrapper.getAvatar().getLabel(), ox6Var3, null, null, f3, null, bj4VarO, ((i3 << 3) & 896) | 8 | ((i3 << 9) & 458752), 88);
                    ox6Var2 = ox6Var3;
                    f4 = f3;
                } else {
                    bj4VarO.u();
                    f4 = f2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ig0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AvatarIconKt.BotAvatarPlaceholder$lambda$14(avatarWrapper, ox6Var2, f4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            f2 = f;
            if ((i3 & 147) == 146) {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f2;
                }
                z75.a(is7.a(R.drawable.intercom_default_avatar_icon, bj4VarO, 0), avatarWrapper.getAvatar().getLabel(), ox6Var3, null, null, f3, null, bj4VarO, ((i3 << 3) & 896) | 8 | ((i3 << 9) & 458752), 88);
                ox6Var2 = ox6Var3;
                f4 = f3;
            } else {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f2;
                }
                z75.a(is7.a(R.drawable.intercom_default_avatar_icon, bj4VarO, 0), avatarWrapper.getAvatar().getLabel(), ox6Var3, null, null, f3, null, bj4VarO, ((i3 << 3) & 896) | 8 | ((i3 << 9) & 458752), 88);
                ox6Var2 = ox6Var3;
                f4 = f3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ig0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AvatarIconKt.BotAvatarPlaceholder$lambda$14(avatarWrapper, ox6Var2, f4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                f2 = f;
                if (bj4VarO.g(f2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 147) == 146) {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f2;
                }
                z75.a(is7.a(R.drawable.intercom_default_avatar_icon, bj4VarO, 0), avatarWrapper.getAvatar().getLabel(), ox6Var3, null, null, f3, null, bj4VarO, ((i3 << 3) & 896) | 8 | ((i3 << 9) & 458752), 88);
                ox6Var2 = ox6Var3;
                f4 = f3;
            } else {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f2;
                }
                z75.a(is7.a(R.drawable.intercom_default_avatar_icon, bj4VarO, 0), avatarWrapper.getAvatar().getLabel(), ox6Var3, null, null, f3, null, bj4VarO, ((i3 << 3) & 896) | 8 | ((i3 << 9) & 458752), 88);
                ox6Var2 = ox6Var3;
                f4 = f3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ig0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AvatarIconKt.BotAvatarPlaceholder$lambda$14(avatarWrapper, ox6Var2, f4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        f2 = f;
        if ((i3 & 147) == 146) {
            if (i6 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i4 != 0) {
                f3 = 1.0f;
            } else {
                f3 = f2;
            }
            z75.a(is7.a(R.drawable.intercom_default_avatar_icon, bj4VarO, 0), avatarWrapper.getAvatar().getLabel(), ox6Var3, null, null, f3, null, bj4VarO, ((i3 << 3) & 896) | 8 | ((i3 << 9) & 458752), 88);
            ox6Var2 = ox6Var3;
            f4 = f3;
        } else {
            if (i6 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i4 != 0) {
                f3 = 1.0f;
            } else {
                f3 = f2;
            }
            z75.a(is7.a(R.drawable.intercom_default_avatar_icon, bj4VarO, 0), avatarWrapper.getAvatar().getLabel(), ox6Var3, null, null, f3, null, bj4VarO, ((i3 << 3) & 896) | 8 | ((i3 << 9) & 458752), 88);
            ox6Var2 = ox6Var3;
            f4 = f3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ig0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AvatarIconKt.BotAvatarPlaceholder$lambda$14(avatarWrapper, ox6Var2, f4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BotAvatarPlaceholder$lambda$14(AvatarWrapper avatarWrapper, ox6 ox6Var, float f, int i, int i2, jt1 jt1Var, int i3) {
        BotAvatarPlaceholder(avatarWrapper, ox6Var, f, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void BotAvatarPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1158049743);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m98getLambda5$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new xf0(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BotAvatarPreview$lambda$26(int i, jt1 jt1Var, int i2) {
        BotAvatarPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x014c  */
    /* JADX WARN: Code duplicated, block: B:106:0x014f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0181  */
    /* JADX WARN: Code duplicated, block: B:113:0x019a  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x009f  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Code duplicated, block: B:98:0x010a  */
    /* JADX INFO: renamed from: DefaultAvatar-Rd90Nhg, reason: not valid java name */
    private static final void m93DefaultAvatarRd90Nhg(final AvatarWrapper avatarWrapper, ox6 ox6Var, jl9 jl9Var, boolean z, long j, uh1 uh1Var, jt1 jt1Var, final int i, final int i2) {
        AvatarWrapper avatarWrapper2;
        int i3;
        ox6 ox6Var2;
        jl9 jl9Var2;
        int i4;
        boolean z2;
        int i5;
        long j2;
        int i6;
        uh1 uh1Var2;
        int i7;
        ox6 ox6Var3;
        jl9 composeShape;
        int i8;
        ox6 ox6Var4;
        uh1 uh1Var3;
        long j3;
        boolean z3;
        long jM751getAction0d7_KjU;
        Object objF;
        jt1.a.C0187a c0187a;
        Object objF2;
        Object objB;
        final ox6 ox6Var5;
        final boolean z4;
        final jl9 jl9Var3;
        final uh1 uh1Var4;
        final long j4;
        long jM832darken8_81llA;
        xj8 xj8VarW;
        bj4 bj4VarO = jt1Var.o(386725315);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            avatarWrapper2 = avatarWrapper;
        } else {
            avatarWrapper2 = avatarWrapper;
            if ((i & 6) == 0) {
                i3 = (bj4VarO.j(avatarWrapper2) ? 4 : 2) | i;
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
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    jl9Var2 = jl9Var;
                    int i10 = bj4VarO.J(jl9Var2) ? 256 : 128;
                    i3 |= i10;
                } else {
                    jl9Var2 = jl9Var;
                }
                i3 |= i10;
            } else {
                jl9Var2 = jl9Var;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                        i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j2 = j;
                        int i11 = bj4VarO.i(j2) ? 16384 : 8192;
                        i3 |= i11;
                    } else {
                        j2 = j;
                    }
                    i3 |= i11;
                } else {
                    j2 = j;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        uh1Var2 = uh1Var;
                        if (bj4VarO.J(uh1Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((74899 & i3) == 74898 || !bj4VarO.r()) {
                        bj4VarO.v0();
                        if ((i & 1) != 0 || bj4VarO.c0()) {
                            if (i9 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if ((i2 & 4) != 0) {
                                composeShape = getComposeShape(AvatarShape.CIRCLE);
                                i3 &= -897;
                            } else {
                                composeShape = jl9Var2;
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                            }
                            if (i6 != 0) {
                                i8 = i3;
                                ox6Var4 = ox6Var3;
                                uh1Var3 = null;
                                j3 = j2;
                                jl9Var2 = composeShape;
                                z3 = z2;
                            } else {
                                i8 = i3;
                                ox6Var4 = ox6Var3;
                                jl9Var2 = composeShape;
                            }
                            bj4VarO.V();
                            jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
                            bj4VarO.K(870365600);
                            objF = bj4VarO.f();
                            c0187a = jt1.a.a;
                            if (objF == c0187a) {
                                if (uh1Var3 != null) {
                                    jM832darken8_81llA = uh1Var3.a;
                                } else {
                                    jM832darken8_81llA = ColorExtensionsKt.m832darken8_81llA(jM751getAction0d7_KjU);
                                }
                                objF = bl7.i(new uh1(jM832darken8_81llA));
                                bj4VarO.C(objF);
                            }
                            h37 h37Var = (h37) objF;
                            bj4VarO.U(false);
                            long jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var));
                            boolean zM839isDarkColor8_81llA = ColorExtensionsKt.m839isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var));
                            bj4VarO.K(870372748);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = bl7.i(new y43(8.0f));
                                bj4VarO.C(objF2);
                            }
                            h37 h37Var2 = (h37) objF2;
                            objB = aa0.b(bj4VarO, false, 870374477);
                            if (objB == c0187a) {
                                objB = bl7.i(jl9Var2);
                                bj4VarO.C(objB);
                            }
                            bj4VarO.U(false);
                            ox6 ox6Var6 = ox6Var4;
                            ov0.a(ox6Var6, null, false, gr1.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z3, jl9Var2, zM839isDarkColor8_81llA, h37Var2, (h37) objB, h37Var, avatarWrapper2, jM751getAction0d7_KjU, uh1Var3, jM833generateTextColor8_81llA, j3), bj4VarO), bj4VarO, ((i8 >> 3) & 14) | 3072, 6);
                            ox6Var5 = ox6Var6;
                            z4 = z3;
                            jl9Var3 = jl9Var2;
                            uh1Var4 = uh1Var3;
                            j4 = j3;
                        } else {
                            bj4VarO.u();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            i8 = i3;
                            ox6Var4 = ox6Var2;
                        }
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                        bj4VarO.V();
                        jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
                        bj4VarO.K(870365600);
                        objF = bj4VarO.f();
                        c0187a = jt1.a.a;
                        if (objF == c0187a) {
                            if (uh1Var3 != null) {
                                jM832darken8_81llA = uh1Var3.a;
                            } else {
                                jM832darken8_81llA = ColorExtensionsKt.m832darken8_81llA(jM751getAction0d7_KjU);
                            }
                            objF = bl7.i(new uh1(jM832darken8_81llA));
                            bj4VarO.C(objF);
                        }
                        h37 h37Var3 = (h37) objF;
                        bj4VarO.U(false);
                        long jM833generateTextColor8_81llA2 = ColorExtensionsKt.m833generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var3));
                        boolean zM839isDarkColor8_81llA2 = ColorExtensionsKt.m839isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var3));
                        bj4VarO.K(870372748);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = bl7.i(new y43(8.0f));
                            bj4VarO.C(objF2);
                        }
                        h37 h37Var4 = (h37) objF2;
                        objB = aa0.b(bj4VarO, false, 870374477);
                        if (objB == c0187a) {
                            objB = bl7.i(jl9Var2);
                            bj4VarO.C(objB);
                        }
                        bj4VarO.U(false);
                        ox6 ox6Var7 = ox6Var4;
                        ov0.a(ox6Var7, null, false, gr1.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z3, jl9Var2, zM839isDarkColor8_81llA2, h37Var4, (h37) objB, h37Var3, avatarWrapper2, jM751getAction0d7_KjU, uh1Var3, jM833generateTextColor8_81llA2, j3), bj4VarO), bj4VarO, ((i8 >> 3) & 14) | 3072, 6);
                        ox6Var5 = ox6Var7;
                        z4 = z3;
                        jl9Var3 = jl9Var2;
                        uh1Var4 = uh1Var3;
                        j4 = j3;
                    } else {
                        bj4VarO.u();
                        ox6Var5 = ox6Var2;
                        j4 = j2;
                        z4 = z2;
                        jl9Var3 = jl9Var2;
                        uh1Var4 = uh1Var2;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: gg0
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                ox6 ox6Var8 = ox6Var5;
                                return AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$10(avatarWrapper, ox6Var8, jl9Var3, z4, j4, uh1Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 196608;
                uh1Var2 = uh1Var;
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if ((i2 & 4) != 0) {
                            composeShape = getComposeShape(AvatarShape.CIRCLE);
                            i3 &= -897;
                        } else {
                            composeShape = jl9Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            uh1Var3 = null;
                            j3 = j2;
                            jl9Var2 = composeShape;
                            z3 = z2;
                        } else {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            jl9Var2 = composeShape;
                            z3 = z2;
                            j3 = j2;
                            uh1Var3 = uh1Var2;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if ((i2 & 4) != 0) {
                            composeShape = getComposeShape(AvatarShape.CIRCLE);
                            i3 &= -897;
                        } else {
                            composeShape = jl9Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            uh1Var3 = null;
                            j3 = j2;
                            jl9Var2 = composeShape;
                            z3 = z2;
                        } else {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            jl9Var2 = composeShape;
                            z3 = z2;
                            j3 = j2;
                            uh1Var3 = uh1Var2;
                        }
                    }
                    bj4VarO.V();
                    jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
                    bj4VarO.K(870365600);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        if (uh1Var3 != null) {
                            jM832darken8_81llA = uh1Var3.a;
                        } else {
                            jM832darken8_81llA = ColorExtensionsKt.m832darken8_81llA(jM751getAction0d7_KjU);
                        }
                        objF = bl7.i(new uh1(jM832darken8_81llA));
                        bj4VarO.C(objF);
                    }
                    h37 h37Var5 = (h37) objF;
                    bj4VarO.U(false);
                    long jM833generateTextColor8_81llA3 = ColorExtensionsKt.m833generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var5));
                    boolean zM839isDarkColor8_81llA3 = ColorExtensionsKt.m839isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var5));
                    bj4VarO.K(870372748);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = bl7.i(new y43(8.0f));
                        bj4VarO.C(objF2);
                    }
                    h37 h37Var6 = (h37) objF2;
                    objB = aa0.b(bj4VarO, false, 870374477);
                    if (objB == c0187a) {
                        objB = bl7.i(jl9Var2);
                        bj4VarO.C(objB);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var8 = ox6Var4;
                    ov0.a(ox6Var8, null, false, gr1.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z3, jl9Var2, zM839isDarkColor8_81llA3, h37Var6, (h37) objB, h37Var5, avatarWrapper2, jM751getAction0d7_KjU, uh1Var3, jM833generateTextColor8_81llA3, j3), bj4VarO), bj4VarO, ((i8 >> 3) & 14) | 3072, 6);
                    ox6Var5 = ox6Var8;
                    z4 = z3;
                    jl9Var3 = jl9Var2;
                    uh1Var4 = uh1Var3;
                    j4 = j3;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if ((i2 & 4) != 0) {
                            composeShape = getComposeShape(AvatarShape.CIRCLE);
                            i3 &= -897;
                        } else {
                            composeShape = jl9Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            uh1Var3 = null;
                            j3 = j2;
                            jl9Var2 = composeShape;
                            z3 = z2;
                        } else {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            jl9Var2 = composeShape;
                            z3 = z2;
                            j3 = j2;
                            uh1Var3 = uh1Var2;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if ((i2 & 4) != 0) {
                            composeShape = getComposeShape(AvatarShape.CIRCLE);
                            i3 &= -897;
                        } else {
                            composeShape = jl9Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            uh1Var3 = null;
                            j3 = j2;
                            jl9Var2 = composeShape;
                            z3 = z2;
                        } else {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            jl9Var2 = composeShape;
                            z3 = z2;
                            j3 = j2;
                            uh1Var3 = uh1Var2;
                        }
                    }
                    bj4VarO.V();
                    jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
                    bj4VarO.K(870365600);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        if (uh1Var3 != null) {
                            jM832darken8_81llA = uh1Var3.a;
                        } else {
                            jM832darken8_81llA = ColorExtensionsKt.m832darken8_81llA(jM751getAction0d7_KjU);
                        }
                        objF = bl7.i(new uh1(jM832darken8_81llA));
                        bj4VarO.C(objF);
                    }
                    h37 h37Var7 = (h37) objF;
                    bj4VarO.U(false);
                    long jM833generateTextColor8_81llA4 = ColorExtensionsKt.m833generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var7));
                    boolean zM839isDarkColor8_81llA4 = ColorExtensionsKt.m839isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var7));
                    bj4VarO.K(870372748);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = bl7.i(new y43(8.0f));
                        bj4VarO.C(objF2);
                    }
                    h37 h37Var8 = (h37) objF2;
                    objB = aa0.b(bj4VarO, false, 870374477);
                    if (objB == c0187a) {
                        objB = bl7.i(jl9Var2);
                        bj4VarO.C(objB);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var9 = ox6Var4;
                    ov0.a(ox6Var9, null, false, gr1.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z3, jl9Var2, zM839isDarkColor8_81llA4, h37Var8, (h37) objB, h37Var7, avatarWrapper2, jM751getAction0d7_KjU, uh1Var3, jM833generateTextColor8_81llA4, j3), bj4VarO), bj4VarO, ((i8 >> 3) & 14) | 3072, 6);
                    ox6Var5 = ox6Var9;
                    z4 = z3;
                    jl9Var3 = jl9Var2;
                    uh1Var4 = uh1Var3;
                    j4 = j3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: gg0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            ox6 ox6Var10 = ox6Var5;
                            return AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$10(avatarWrapper, ox6Var10, jl9Var3, z4, j4, uh1Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j2 = j;
                    if (bj4VarO.i(j2)) {
                    }
                    i3 |= i11;
                } else {
                    j2 = j;
                }
                i3 |= i11;
            } else {
                j2 = j;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    uh1Var2 = uh1Var;
                    if (bj4VarO.J(uh1Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if ((i2 & 4) != 0) {
                            composeShape = getComposeShape(AvatarShape.CIRCLE);
                            i3 &= -897;
                        } else {
                            composeShape = jl9Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            uh1Var3 = null;
                            j3 = j2;
                            jl9Var2 = composeShape;
                            z3 = z2;
                        } else {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            jl9Var2 = composeShape;
                            z3 = z2;
                            j3 = j2;
                            uh1Var3 = uh1Var2;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if ((i2 & 4) != 0) {
                            composeShape = getComposeShape(AvatarShape.CIRCLE);
                            i3 &= -897;
                        } else {
                            composeShape = jl9Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            uh1Var3 = null;
                            j3 = j2;
                            jl9Var2 = composeShape;
                            z3 = z2;
                        } else {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            jl9Var2 = composeShape;
                            z3 = z2;
                            j3 = j2;
                            uh1Var3 = uh1Var2;
                        }
                    }
                    bj4VarO.V();
                    jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
                    bj4VarO.K(870365600);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        if (uh1Var3 != null) {
                            jM832darken8_81llA = uh1Var3.a;
                        } else {
                            jM832darken8_81llA = ColorExtensionsKt.m832darken8_81llA(jM751getAction0d7_KjU);
                        }
                        objF = bl7.i(new uh1(jM832darken8_81llA));
                        bj4VarO.C(objF);
                    }
                    h37 h37Var9 = (h37) objF;
                    bj4VarO.U(false);
                    long jM833generateTextColor8_81llA5 = ColorExtensionsKt.m833generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var9));
                    boolean zM839isDarkColor8_81llA5 = ColorExtensionsKt.m839isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var9));
                    bj4VarO.K(870372748);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = bl7.i(new y43(8.0f));
                        bj4VarO.C(objF2);
                    }
                    h37 h37Var10 = (h37) objF2;
                    objB = aa0.b(bj4VarO, false, 870374477);
                    if (objB == c0187a) {
                        objB = bl7.i(jl9Var2);
                        bj4VarO.C(objB);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var10 = ox6Var4;
                    ov0.a(ox6Var10, null, false, gr1.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z3, jl9Var2, zM839isDarkColor8_81llA5, h37Var10, (h37) objB, h37Var9, avatarWrapper2, jM751getAction0d7_KjU, uh1Var3, jM833generateTextColor8_81llA5, j3), bj4VarO), bj4VarO, ((i8 >> 3) & 14) | 3072, 6);
                    ox6Var5 = ox6Var10;
                    z4 = z3;
                    jl9Var3 = jl9Var2;
                    uh1Var4 = uh1Var3;
                    j4 = j3;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if ((i2 & 4) != 0) {
                            composeShape = getComposeShape(AvatarShape.CIRCLE);
                            i3 &= -897;
                        } else {
                            composeShape = jl9Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            uh1Var3 = null;
                            j3 = j2;
                            jl9Var2 = composeShape;
                            z3 = z2;
                        } else {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            jl9Var2 = composeShape;
                            z3 = z2;
                            j3 = j2;
                            uh1Var3 = uh1Var2;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if ((i2 & 4) != 0) {
                            composeShape = getComposeShape(AvatarShape.CIRCLE);
                            i3 &= -897;
                        } else {
                            composeShape = jl9Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            uh1Var3 = null;
                            j3 = j2;
                            jl9Var2 = composeShape;
                            z3 = z2;
                        } else {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            jl9Var2 = composeShape;
                            z3 = z2;
                            j3 = j2;
                            uh1Var3 = uh1Var2;
                        }
                    }
                    bj4VarO.V();
                    jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
                    bj4VarO.K(870365600);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        if (uh1Var3 != null) {
                            jM832darken8_81llA = uh1Var3.a;
                        } else {
                            jM832darken8_81llA = ColorExtensionsKt.m832darken8_81llA(jM751getAction0d7_KjU);
                        }
                        objF = bl7.i(new uh1(jM832darken8_81llA));
                        bj4VarO.C(objF);
                    }
                    h37 h37Var11 = (h37) objF;
                    bj4VarO.U(false);
                    long jM833generateTextColor8_81llA6 = ColorExtensionsKt.m833generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var11));
                    boolean zM839isDarkColor8_81llA6 = ColorExtensionsKt.m839isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var11));
                    bj4VarO.K(870372748);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = bl7.i(new y43(8.0f));
                        bj4VarO.C(objF2);
                    }
                    h37 h37Var12 = (h37) objF2;
                    objB = aa0.b(bj4VarO, false, 870374477);
                    if (objB == c0187a) {
                        objB = bl7.i(jl9Var2);
                        bj4VarO.C(objB);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var11 = ox6Var4;
                    ov0.a(ox6Var11, null, false, gr1.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z3, jl9Var2, zM839isDarkColor8_81llA6, h37Var12, (h37) objB, h37Var11, avatarWrapper2, jM751getAction0d7_KjU, uh1Var3, jM833generateTextColor8_81llA6, j3), bj4VarO), bj4VarO, ((i8 >> 3) & 14) | 3072, 6);
                    ox6Var5 = ox6Var11;
                    z4 = z3;
                    jl9Var3 = jl9Var2;
                    uh1Var4 = uh1Var3;
                    j4 = j3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: gg0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            ox6 ox6Var12 = ox6Var5;
                            return AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$10(avatarWrapper, ox6Var12, jl9Var3, z4, j4, uh1Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            uh1Var2 = uh1Var;
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        composeShape = getComposeShape(AvatarShape.CIRCLE);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        uh1Var3 = null;
                        j3 = j2;
                        jl9Var2 = composeShape;
                        z3 = z2;
                    } else {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        composeShape = getComposeShape(AvatarShape.CIRCLE);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        uh1Var3 = null;
                        j3 = j2;
                        jl9Var2 = composeShape;
                        z3 = z2;
                    } else {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                }
                bj4VarO.V();
                jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
                bj4VarO.K(870365600);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    if (uh1Var3 != null) {
                        jM832darken8_81llA = uh1Var3.a;
                    } else {
                        jM832darken8_81llA = ColorExtensionsKt.m832darken8_81llA(jM751getAction0d7_KjU);
                    }
                    objF = bl7.i(new uh1(jM832darken8_81llA));
                    bj4VarO.C(objF);
                }
                h37 h37Var13 = (h37) objF;
                bj4VarO.U(false);
                long jM833generateTextColor8_81llA7 = ColorExtensionsKt.m833generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var13));
                boolean zM839isDarkColor8_81llA7 = ColorExtensionsKt.m839isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var13));
                bj4VarO.K(870372748);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = bl7.i(new y43(8.0f));
                    bj4VarO.C(objF2);
                }
                h37 h37Var14 = (h37) objF2;
                objB = aa0.b(bj4VarO, false, 870374477);
                if (objB == c0187a) {
                    objB = bl7.i(jl9Var2);
                    bj4VarO.C(objB);
                }
                bj4VarO.U(false);
                ox6 ox6Var12 = ox6Var4;
                ov0.a(ox6Var12, null, false, gr1.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z3, jl9Var2, zM839isDarkColor8_81llA7, h37Var14, (h37) objB, h37Var13, avatarWrapper2, jM751getAction0d7_KjU, uh1Var3, jM833generateTextColor8_81llA7, j3), bj4VarO), bj4VarO, ((i8 >> 3) & 14) | 3072, 6);
                ox6Var5 = ox6Var12;
                z4 = z3;
                jl9Var3 = jl9Var2;
                uh1Var4 = uh1Var3;
                j4 = j3;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        composeShape = getComposeShape(AvatarShape.CIRCLE);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        uh1Var3 = null;
                        j3 = j2;
                        jl9Var2 = composeShape;
                        z3 = z2;
                    } else {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        composeShape = getComposeShape(AvatarShape.CIRCLE);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        uh1Var3 = null;
                        j3 = j2;
                        jl9Var2 = composeShape;
                        z3 = z2;
                    } else {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                }
                bj4VarO.V();
                jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
                bj4VarO.K(870365600);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    if (uh1Var3 != null) {
                        jM832darken8_81llA = uh1Var3.a;
                    } else {
                        jM832darken8_81llA = ColorExtensionsKt.m832darken8_81llA(jM751getAction0d7_KjU);
                    }
                    objF = bl7.i(new uh1(jM832darken8_81llA));
                    bj4VarO.C(objF);
                }
                h37 h37Var15 = (h37) objF;
                bj4VarO.U(false);
                long jM833generateTextColor8_81llA8 = ColorExtensionsKt.m833generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var15));
                boolean zM839isDarkColor8_81llA8 = ColorExtensionsKt.m839isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var15));
                bj4VarO.K(870372748);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = bl7.i(new y43(8.0f));
                    bj4VarO.C(objF2);
                }
                h37 h37Var16 = (h37) objF2;
                objB = aa0.b(bj4VarO, false, 870374477);
                if (objB == c0187a) {
                    objB = bl7.i(jl9Var2);
                    bj4VarO.C(objB);
                }
                bj4VarO.U(false);
                ox6 ox6Var13 = ox6Var4;
                ov0.a(ox6Var13, null, false, gr1.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z3, jl9Var2, zM839isDarkColor8_81llA8, h37Var16, (h37) objB, h37Var15, avatarWrapper2, jM751getAction0d7_KjU, uh1Var3, jM833generateTextColor8_81llA8, j3), bj4VarO), bj4VarO, ((i8 >> 3) & 14) | 3072, 6);
                ox6Var5 = ox6Var13;
                z4 = z3;
                jl9Var3 = jl9Var2;
                uh1Var4 = uh1Var3;
                j4 = j3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: gg0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        ox6 ox6Var14 = ox6Var5;
                        return AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$10(avatarWrapper, ox6Var14, jl9Var3, z4, j4, uh1Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                jl9Var2 = jl9Var;
                if (bj4VarO.J(jl9Var2)) {
                }
                i3 |= i10;
            } else {
                jl9Var2 = jl9Var;
            }
            i3 |= i10;
        } else {
            jl9Var2 = jl9Var;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (bj4VarO.c(z2)) {
                    i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j2 = j;
                    if (bj4VarO.i(j2)) {
                    }
                    i3 |= i11;
                } else {
                    j2 = j;
                }
                i3 |= i11;
            } else {
                j2 = j;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    uh1Var2 = uh1Var;
                    if (bj4VarO.J(uh1Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if ((i2 & 4) != 0) {
                            composeShape = getComposeShape(AvatarShape.CIRCLE);
                            i3 &= -897;
                        } else {
                            composeShape = jl9Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            uh1Var3 = null;
                            j3 = j2;
                            jl9Var2 = composeShape;
                            z3 = z2;
                        } else {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            jl9Var2 = composeShape;
                            z3 = z2;
                            j3 = j2;
                            uh1Var3 = uh1Var2;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if ((i2 & 4) != 0) {
                            composeShape = getComposeShape(AvatarShape.CIRCLE);
                            i3 &= -897;
                        } else {
                            composeShape = jl9Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            uh1Var3 = null;
                            j3 = j2;
                            jl9Var2 = composeShape;
                            z3 = z2;
                        } else {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            jl9Var2 = composeShape;
                            z3 = z2;
                            j3 = j2;
                            uh1Var3 = uh1Var2;
                        }
                    }
                    bj4VarO.V();
                    jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
                    bj4VarO.K(870365600);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        if (uh1Var3 != null) {
                            jM832darken8_81llA = uh1Var3.a;
                        } else {
                            jM832darken8_81llA = ColorExtensionsKt.m832darken8_81llA(jM751getAction0d7_KjU);
                        }
                        objF = bl7.i(new uh1(jM832darken8_81llA));
                        bj4VarO.C(objF);
                    }
                    h37 h37Var17 = (h37) objF;
                    bj4VarO.U(false);
                    long jM833generateTextColor8_81llA9 = ColorExtensionsKt.m833generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var17));
                    boolean zM839isDarkColor8_81llA9 = ColorExtensionsKt.m839isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var17));
                    bj4VarO.K(870372748);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = bl7.i(new y43(8.0f));
                        bj4VarO.C(objF2);
                    }
                    h37 h37Var18 = (h37) objF2;
                    objB = aa0.b(bj4VarO, false, 870374477);
                    if (objB == c0187a) {
                        objB = bl7.i(jl9Var2);
                        bj4VarO.C(objB);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var14 = ox6Var4;
                    ov0.a(ox6Var14, null, false, gr1.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z3, jl9Var2, zM839isDarkColor8_81llA9, h37Var18, (h37) objB, h37Var17, avatarWrapper2, jM751getAction0d7_KjU, uh1Var3, jM833generateTextColor8_81llA9, j3), bj4VarO), bj4VarO, ((i8 >> 3) & 14) | 3072, 6);
                    ox6Var5 = ox6Var14;
                    z4 = z3;
                    jl9Var3 = jl9Var2;
                    uh1Var4 = uh1Var3;
                    j4 = j3;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if ((i2 & 4) != 0) {
                            composeShape = getComposeShape(AvatarShape.CIRCLE);
                            i3 &= -897;
                        } else {
                            composeShape = jl9Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            uh1Var3 = null;
                            j3 = j2;
                            jl9Var2 = composeShape;
                            z3 = z2;
                        } else {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            jl9Var2 = composeShape;
                            z3 = z2;
                            j3 = j2;
                            uh1Var3 = uh1Var2;
                        }
                    } else {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if ((i2 & 4) != 0) {
                            composeShape = getComposeShape(AvatarShape.CIRCLE);
                            i3 &= -897;
                        } else {
                            composeShape = jl9Var2;
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                        }
                        if (i6 != 0) {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            uh1Var3 = null;
                            j3 = j2;
                            jl9Var2 = composeShape;
                            z3 = z2;
                        } else {
                            i8 = i3;
                            ox6Var4 = ox6Var3;
                            jl9Var2 = composeShape;
                            z3 = z2;
                            j3 = j2;
                            uh1Var3 = uh1Var2;
                        }
                    }
                    bj4VarO.V();
                    jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
                    bj4VarO.K(870365600);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        if (uh1Var3 != null) {
                            jM832darken8_81llA = uh1Var3.a;
                        } else {
                            jM832darken8_81llA = ColorExtensionsKt.m832darken8_81llA(jM751getAction0d7_KjU);
                        }
                        objF = bl7.i(new uh1(jM832darken8_81llA));
                        bj4VarO.C(objF);
                    }
                    h37 h37Var19 = (h37) objF;
                    bj4VarO.U(false);
                    long jM833generateTextColor8_81llA10 = ColorExtensionsKt.m833generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var19));
                    boolean zM839isDarkColor8_81llA10 = ColorExtensionsKt.m839isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var19));
                    bj4VarO.K(870372748);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = bl7.i(new y43(8.0f));
                        bj4VarO.C(objF2);
                    }
                    h37 h37Var110 = (h37) objF2;
                    objB = aa0.b(bj4VarO, false, 870374477);
                    if (objB == c0187a) {
                        objB = bl7.i(jl9Var2);
                        bj4VarO.C(objB);
                    }
                    bj4VarO.U(false);
                    ox6 ox6Var15 = ox6Var4;
                    ov0.a(ox6Var15, null, false, gr1.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z3, jl9Var2, zM839isDarkColor8_81llA10, h37Var110, (h37) objB, h37Var19, avatarWrapper2, jM751getAction0d7_KjU, uh1Var3, jM833generateTextColor8_81llA10, j3), bj4VarO), bj4VarO, ((i8 >> 3) & 14) | 3072, 6);
                    ox6Var5 = ox6Var15;
                    z4 = z3;
                    jl9Var3 = jl9Var2;
                    uh1Var4 = uh1Var3;
                    j4 = j3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: gg0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            ox6 ox6Var16 = ox6Var5;
                            return AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$10(avatarWrapper, ox6Var16, jl9Var3, z4, j4, uh1Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 196608;
            uh1Var2 = uh1Var;
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        composeShape = getComposeShape(AvatarShape.CIRCLE);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        uh1Var3 = null;
                        j3 = j2;
                        jl9Var2 = composeShape;
                        z3 = z2;
                    } else {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        composeShape = getComposeShape(AvatarShape.CIRCLE);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        uh1Var3 = null;
                        j3 = j2;
                        jl9Var2 = composeShape;
                        z3 = z2;
                    } else {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                }
                bj4VarO.V();
                jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
                bj4VarO.K(870365600);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    if (uh1Var3 != null) {
                        jM832darken8_81llA = uh1Var3.a;
                    } else {
                        jM832darken8_81llA = ColorExtensionsKt.m832darken8_81llA(jM751getAction0d7_KjU);
                    }
                    objF = bl7.i(new uh1(jM832darken8_81llA));
                    bj4VarO.C(objF);
                }
                h37 h37Var111 = (h37) objF;
                bj4VarO.U(false);
                long jM833generateTextColor8_81llA11 = ColorExtensionsKt.m833generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var111));
                boolean zM839isDarkColor8_81llA11 = ColorExtensionsKt.m839isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var111));
                bj4VarO.K(870372748);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = bl7.i(new y43(8.0f));
                    bj4VarO.C(objF2);
                }
                h37 h37Var112 = (h37) objF2;
                objB = aa0.b(bj4VarO, false, 870374477);
                if (objB == c0187a) {
                    objB = bl7.i(jl9Var2);
                    bj4VarO.C(objB);
                }
                bj4VarO.U(false);
                ox6 ox6Var16 = ox6Var4;
                ov0.a(ox6Var16, null, false, gr1.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z3, jl9Var2, zM839isDarkColor8_81llA11, h37Var112, (h37) objB, h37Var111, avatarWrapper2, jM751getAction0d7_KjU, uh1Var3, jM833generateTextColor8_81llA11, j3), bj4VarO), bj4VarO, ((i8 >> 3) & 14) | 3072, 6);
                ox6Var5 = ox6Var16;
                z4 = z3;
                jl9Var3 = jl9Var2;
                uh1Var4 = uh1Var3;
                j4 = j3;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        composeShape = getComposeShape(AvatarShape.CIRCLE);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        uh1Var3 = null;
                        j3 = j2;
                        jl9Var2 = composeShape;
                        z3 = z2;
                    } else {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        composeShape = getComposeShape(AvatarShape.CIRCLE);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        uh1Var3 = null;
                        j3 = j2;
                        jl9Var2 = composeShape;
                        z3 = z2;
                    } else {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                }
                bj4VarO.V();
                jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
                bj4VarO.K(870365600);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    if (uh1Var3 != null) {
                        jM832darken8_81llA = uh1Var3.a;
                    } else {
                        jM832darken8_81llA = ColorExtensionsKt.m832darken8_81llA(jM751getAction0d7_KjU);
                    }
                    objF = bl7.i(new uh1(jM832darken8_81llA));
                    bj4VarO.C(objF);
                }
                h37 h37Var113 = (h37) objF;
                bj4VarO.U(false);
                long jM833generateTextColor8_81llA12 = ColorExtensionsKt.m833generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var113));
                boolean zM839isDarkColor8_81llA12 = ColorExtensionsKt.m839isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var113));
                bj4VarO.K(870372748);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = bl7.i(new y43(8.0f));
                    bj4VarO.C(objF2);
                }
                h37 h37Var114 = (h37) objF2;
                objB = aa0.b(bj4VarO, false, 870374477);
                if (objB == c0187a) {
                    objB = bl7.i(jl9Var2);
                    bj4VarO.C(objB);
                }
                bj4VarO.U(false);
                ox6 ox6Var17 = ox6Var4;
                ov0.a(ox6Var17, null, false, gr1.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z3, jl9Var2, zM839isDarkColor8_81llA12, h37Var114, (h37) objB, h37Var113, avatarWrapper2, jM751getAction0d7_KjU, uh1Var3, jM833generateTextColor8_81llA12, j3), bj4VarO), bj4VarO, ((i8 >> 3) & 14) | 3072, 6);
                ox6Var5 = ox6Var17;
                z4 = z3;
                jl9Var3 = jl9Var2;
                uh1Var4 = uh1Var3;
                j4 = j3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: gg0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        ox6 ox6Var18 = ox6Var5;
                        return AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$10(avatarWrapper, ox6Var18, jl9Var3, z4, j4, uh1Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j2 = j;
                if (bj4VarO.i(j2)) {
                }
                i3 |= i11;
            } else {
                j2 = j;
            }
            i3 |= i11;
        } else {
            j2 = j;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                uh1Var2 = uh1Var;
                if (bj4VarO.J(uh1Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        composeShape = getComposeShape(AvatarShape.CIRCLE);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        uh1Var3 = null;
                        j3 = j2;
                        jl9Var2 = composeShape;
                        z3 = z2;
                    } else {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        composeShape = getComposeShape(AvatarShape.CIRCLE);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        uh1Var3 = null;
                        j3 = j2;
                        jl9Var2 = composeShape;
                        z3 = z2;
                    } else {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                }
                bj4VarO.V();
                jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
                bj4VarO.K(870365600);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    if (uh1Var3 != null) {
                        jM832darken8_81llA = uh1Var3.a;
                    } else {
                        jM832darken8_81llA = ColorExtensionsKt.m832darken8_81llA(jM751getAction0d7_KjU);
                    }
                    objF = bl7.i(new uh1(jM832darken8_81llA));
                    bj4VarO.C(objF);
                }
                h37 h37Var115 = (h37) objF;
                bj4VarO.U(false);
                long jM833generateTextColor8_81llA13 = ColorExtensionsKt.m833generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var115));
                boolean zM839isDarkColor8_81llA13 = ColorExtensionsKt.m839isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var115));
                bj4VarO.K(870372748);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = bl7.i(new y43(8.0f));
                    bj4VarO.C(objF2);
                }
                h37 h37Var116 = (h37) objF2;
                objB = aa0.b(bj4VarO, false, 870374477);
                if (objB == c0187a) {
                    objB = bl7.i(jl9Var2);
                    bj4VarO.C(objB);
                }
                bj4VarO.U(false);
                ox6 ox6Var18 = ox6Var4;
                ov0.a(ox6Var18, null, false, gr1.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z3, jl9Var2, zM839isDarkColor8_81llA13, h37Var116, (h37) objB, h37Var115, avatarWrapper2, jM751getAction0d7_KjU, uh1Var3, jM833generateTextColor8_81llA13, j3), bj4VarO), bj4VarO, ((i8 >> 3) & 14) | 3072, 6);
                ox6Var5 = ox6Var18;
                z4 = z3;
                jl9Var3 = jl9Var2;
                uh1Var4 = uh1Var3;
                j4 = j3;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        composeShape = getComposeShape(AvatarShape.CIRCLE);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        uh1Var3 = null;
                        j3 = j2;
                        jl9Var2 = composeShape;
                        z3 = z2;
                    } else {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 4) != 0) {
                        composeShape = getComposeShape(AvatarShape.CIRCLE);
                        i3 &= -897;
                    } else {
                        composeShape = jl9Var2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                    }
                    if (i6 != 0) {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        uh1Var3 = null;
                        j3 = j2;
                        jl9Var2 = composeShape;
                        z3 = z2;
                    } else {
                        i8 = i3;
                        ox6Var4 = ox6Var3;
                        jl9Var2 = composeShape;
                        z3 = z2;
                        j3 = j2;
                        uh1Var3 = uh1Var2;
                    }
                }
                bj4VarO.V();
                jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
                bj4VarO.K(870365600);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    if (uh1Var3 != null) {
                        jM832darken8_81llA = uh1Var3.a;
                    } else {
                        jM832darken8_81llA = ColorExtensionsKt.m832darken8_81llA(jM751getAction0d7_KjU);
                    }
                    objF = bl7.i(new uh1(jM832darken8_81llA));
                    bj4VarO.C(objF);
                }
                h37 h37Var117 = (h37) objF;
                bj4VarO.U(false);
                long jM833generateTextColor8_81llA14 = ColorExtensionsKt.m833generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var117));
                boolean zM839isDarkColor8_81llA14 = ColorExtensionsKt.m839isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var117));
                bj4VarO.K(870372748);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = bl7.i(new y43(8.0f));
                    bj4VarO.C(objF2);
                }
                h37 h37Var118 = (h37) objF2;
                objB = aa0.b(bj4VarO, false, 870374477);
                if (objB == c0187a) {
                    objB = bl7.i(jl9Var2);
                    bj4VarO.C(objB);
                }
                bj4VarO.U(false);
                ox6 ox6Var19 = ox6Var4;
                ov0.a(ox6Var19, null, false, gr1.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z3, jl9Var2, zM839isDarkColor8_81llA14, h37Var118, (h37) objB, h37Var117, avatarWrapper2, jM751getAction0d7_KjU, uh1Var3, jM833generateTextColor8_81llA14, j3), bj4VarO), bj4VarO, ((i8 >> 3) & 14) | 3072, 6);
                ox6Var5 = ox6Var19;
                z4 = z3;
                jl9Var3 = jl9Var2;
                uh1Var4 = uh1Var3;
                j4 = j3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: gg0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        ox6 ox6Var110 = ox6Var5;
                        return AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$10(avatarWrapper, ox6Var110, jl9Var3, z4, j4, uh1Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 196608;
        uh1Var2 = uh1Var;
        if ((74899 & i3) == 74898) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    composeShape = getComposeShape(AvatarShape.CIRCLE);
                    i3 &= -897;
                } else {
                    composeShape = jl9Var2;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                }
                if (i6 != 0) {
                    i8 = i3;
                    ox6Var4 = ox6Var3;
                    uh1Var3 = null;
                    j3 = j2;
                    jl9Var2 = composeShape;
                    z3 = z2;
                } else {
                    i8 = i3;
                    ox6Var4 = ox6Var3;
                    jl9Var2 = composeShape;
                    z3 = z2;
                    j3 = j2;
                    uh1Var3 = uh1Var2;
                }
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    composeShape = getComposeShape(AvatarShape.CIRCLE);
                    i3 &= -897;
                } else {
                    composeShape = jl9Var2;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                }
                if (i6 != 0) {
                    i8 = i3;
                    ox6Var4 = ox6Var3;
                    uh1Var3 = null;
                    j3 = j2;
                    jl9Var2 = composeShape;
                    z3 = z2;
                } else {
                    i8 = i3;
                    ox6Var4 = ox6Var3;
                    jl9Var2 = composeShape;
                    z3 = z2;
                    j3 = j2;
                    uh1Var3 = uh1Var2;
                }
            }
            bj4VarO.V();
            jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
            bj4VarO.K(870365600);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                if (uh1Var3 != null) {
                    jM832darken8_81llA = uh1Var3.a;
                } else {
                    jM832darken8_81llA = ColorExtensionsKt.m832darken8_81llA(jM751getAction0d7_KjU);
                }
                objF = bl7.i(new uh1(jM832darken8_81llA));
                bj4VarO.C(objF);
            }
            h37 h37Var119 = (h37) objF;
            bj4VarO.U(false);
            long jM833generateTextColor8_81llA15 = ColorExtensionsKt.m833generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var119));
            boolean zM839isDarkColor8_81llA15 = ColorExtensionsKt.m839isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var119));
            bj4VarO.K(870372748);
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = bl7.i(new y43(8.0f));
                bj4VarO.C(objF2);
            }
            h37 h37Var1110 = (h37) objF2;
            objB = aa0.b(bj4VarO, false, 870374477);
            if (objB == c0187a) {
                objB = bl7.i(jl9Var2);
                bj4VarO.C(objB);
            }
            bj4VarO.U(false);
            ox6 ox6Var110 = ox6Var4;
            ov0.a(ox6Var110, null, false, gr1.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z3, jl9Var2, zM839isDarkColor8_81llA15, h37Var1110, (h37) objB, h37Var119, avatarWrapper2, jM751getAction0d7_KjU, uh1Var3, jM833generateTextColor8_81llA15, j3), bj4VarO), bj4VarO, ((i8 >> 3) & 14) | 3072, 6);
            ox6Var5 = ox6Var110;
            z4 = z3;
            jl9Var3 = jl9Var2;
            uh1Var4 = uh1Var3;
            j4 = j3;
        } else {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    composeShape = getComposeShape(AvatarShape.CIRCLE);
                    i3 &= -897;
                } else {
                    composeShape = jl9Var2;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                }
                if (i6 != 0) {
                    i8 = i3;
                    ox6Var4 = ox6Var3;
                    uh1Var3 = null;
                    j3 = j2;
                    jl9Var2 = composeShape;
                    z3 = z2;
                } else {
                    i8 = i3;
                    ox6Var4 = ox6Var3;
                    jl9Var2 = composeShape;
                    z3 = z2;
                    j3 = j2;
                    uh1Var3 = uh1Var2;
                }
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 4) != 0) {
                    composeShape = getComposeShape(AvatarShape.CIRCLE);
                    i3 &= -897;
                } else {
                    composeShape = jl9Var2;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    j2 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5().a.b;
                }
                if (i6 != 0) {
                    i8 = i3;
                    ox6Var4 = ox6Var3;
                    uh1Var3 = null;
                    j3 = j2;
                    jl9Var2 = composeShape;
                    z3 = z2;
                } else {
                    i8 = i3;
                    ox6Var4 = ox6Var3;
                    jl9Var2 = composeShape;
                    z3 = z2;
                    j3 = j2;
                    uh1Var3 = uh1Var2;
                }
            }
            bj4VarO.V();
            jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
            bj4VarO.K(870365600);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                if (uh1Var3 != null) {
                    jM832darken8_81llA = uh1Var3.a;
                } else {
                    jM832darken8_81llA = ColorExtensionsKt.m832darken8_81llA(jM751getAction0d7_KjU);
                }
                objF = bl7.i(new uh1(jM832darken8_81llA));
                bj4VarO.C(objF);
            }
            h37 h37Var1111 = (h37) objF;
            bj4VarO.U(false);
            long jM833generateTextColor8_81llA16 = ColorExtensionsKt.m833generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var1111));
            boolean zM839isDarkColor8_81llA16 = ColorExtensionsKt.m839isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(h37Var1111));
            bj4VarO.K(870372748);
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = bl7.i(new y43(8.0f));
                bj4VarO.C(objF2);
            }
            h37 h37Var1112 = (h37) objF2;
            objB = aa0.b(bj4VarO, false, 870374477);
            if (objB == c0187a) {
                objB = bl7.i(jl9Var2);
                bj4VarO.C(objB);
            }
            bj4VarO.U(false);
            ox6 ox6Var111 = ox6Var4;
            ov0.a(ox6Var111, null, false, gr1.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z3, jl9Var2, zM839isDarkColor8_81llA16, h37Var1112, (h37) objB, h37Var1111, avatarWrapper2, jM751getAction0d7_KjU, uh1Var3, jM833generateTextColor8_81llA16, j3), bj4VarO), bj4VarO, ((i8 >> 3) & 14) | 3072, 6);
            ox6Var5 = ox6Var111;
            z4 = z3;
            jl9Var3 = jl9Var2;
            uh1Var4 = uh1Var3;
            j4 = j3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: gg0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    ox6 ox6Var112 = ox6Var5;
                    return AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$10(avatarWrapper, ox6Var112, jl9Var3, z4, j4, uh1Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultAvatar_Rd90Nhg$Placeholder(AvatarWrapper avatarWrapper, long j, long j2, ox6 ox6Var, jt1 jt1Var, int i, int i2) {
        jt1Var.K(1593692287);
        if ((i2 & 1) != 0) {
            ox6Var = ox6.a.t;
        }
        ox6 ox6Var2 = ox6Var;
        if (avatarWrapper.isBot()) {
            jt1Var.K(-730785003);
            BotAvatarPlaceholder(avatarWrapper, eo7.i(ox6Var2, 8.0f), 0.0f, jt1Var, 0, 4);
            jt1Var.B();
        } else {
            jt1Var.K(-730619029);
            m92AvatarPlaceholderjxWH9Kg(ox6Var2, avatarWrapper.getInitials(), j, j2, avatarWrapper.getLabel(), jt1Var, i & 14, 0);
            jt1Var.B();
        }
        jt1Var.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DefaultAvatar_Rd90Nhg$lambda$10(AvatarWrapper avatarWrapper, ox6 ox6Var, jl9 jl9Var, boolean z, long j, uh1 uh1Var, int i, int i2, jt1 jt1Var, int i3) {
        m93DefaultAvatarRd90Nhg(avatarWrapper, ox6Var, jl9Var, z, j, uh1Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long DefaultAvatar_Rd90Nhg$lambda$2(h37<uh1> h37Var) {
        return h37Var.getValue().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultAvatar_Rd90Nhg$lambda$3(h37<uh1> h37Var, long j) {
        h37Var.setValue(new uh1(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DefaultAvatar_Rd90Nhg$lambda$5(h37<y43> h37Var) {
        return h37Var.getValue().t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultAvatar_Rd90Nhg$lambda$6(h37<y43> h37Var, float f) {
        h37Var.setValue(new y43(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jl9 DefaultAvatar_Rd90Nhg$lambda$8(h37<jl9> h37Var) {
        return h37Var.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0109  */
    private static final void FinAvatar(ox6 ox6Var, final AvatarWrapper avatarWrapper, jl9 jl9Var, jt1 jt1Var, int i, int i2) {
        ox6 ox6Var2;
        int i3;
        jl9 jl9Var2;
        jl9 composeShape;
        ox6 ox6Var3;
        final ox6 ox6VarH;
        int i4;
        String imageUrl;
        jl9 jl9Var3;
        bj4 bj4Var;
        bj4 bj4Var2;
        ox6 ox6Var4;
        jl9 jl9Var4;
        bj4 bj4VarO = jt1Var.o(-1375245291);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(avatarWrapper) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                jl9Var2 = jl9Var;
                int i6 = bj4VarO.J(jl9Var2) ? 256 : 128;
                i3 |= i6;
            } else {
                jl9Var2 = jl9Var;
            }
            i3 |= i6;
        } else {
            jl9Var2 = jl9Var;
        }
        if ((i3 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            ox6Var4 = ox6Var2;
            bj4Var2 = bj4VarO;
            jl9Var4 = jl9Var2;
        } else {
            bj4VarO.v0();
            int i7 = i & 1;
            ox6.a aVar = ox6.a.t;
            if (i7 == 0 || bj4VarO.c0()) {
                if (i5 != 0) {
                    ox6Var2 = aVar;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    ox6 ox6Var5 = ox6Var2;
                    composeShape = getComposeShape(AvatarShape.SQUIRCLE);
                    ox6Var3 = ox6Var5;
                }
                bj4VarO.V();
                ox6VarH = ox6Var3.H(uma.a(aVar, composeShape));
                i4 = (i3 >> 3) & 14;
                imageUrl = avatarWrapper.getImageUrl(bj4VarO, i4);
                if (z2a.w(imageUrl)) {
                    bj4VarO.K(-445746825);
                    jl9Var3 = composeShape;
                    bj4Var = bj4VarO;
                    FinAvatarPlaceholder(avatarWrapper, ox6VarH, 0.0f, bj4Var, i4, 4);
                    bj4Var.U(false);
                } else {
                    bj4VarO.K(-446445875);
                    a4a.a(imageUrl, avatarWrapper.getAvatar().getLabel(), IntercomImageLoaderKt.getImageLoader((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)), ox6VarH, gr1.b(-1294140715, new fi4<b4a, f50.a.c, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.FinAvatar.1
                        public final void invoke(b4a b4aVar, f50.a.c cVar, jt1 jt1Var2, int i8) {
                            b4aVar.getClass();
                            cVar.getClass();
                            if ((i8 & 129) == 128 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                AvatarIconKt.FinAvatarPlaceholder(avatarWrapper, ox6VarH, 0.0f, jt1Var2, 0, 4);
                            }
                        }

                        @Override // defpackage.fi4
                        public /* bridge */ /* synthetic */ g2b invoke(b4a b4aVar, f50.a.c cVar, jt1 jt1Var2, Integer num) {
                            invoke(b4aVar, cVar, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), gr1.b(-818047861, new fi4<b4a, f50.a.b, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.FinAvatar.2
                        public final void invoke(b4a b4aVar, f50.a.b bVar, jt1 jt1Var2, int i8) {
                            b4aVar.getClass();
                            bVar.getClass();
                            if ((i8 & 129) == 128 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                AvatarIconKt.FinAvatarPlaceholder(avatarWrapper, ox6VarH, 0.0f, jt1Var2, 0, 4);
                            }
                        }

                        @Override // defpackage.fi4
                        public /* bridge */ /* synthetic */ g2b invoke(b4a b4aVar, f50.a.b bVar, jt1 jt1Var2, Integer num) {
                            invoke(b4aVar, bVar, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), null, null, null, bj4VarO, 12779520, 0, 261968);
                    bj4VarO.U(false);
                    jl9Var3 = composeShape;
                    bj4Var = bj4VarO;
                }
                bj4Var2 = bj4Var;
                ox6Var4 = ox6Var3;
                jl9Var4 = jl9Var3;
            } else {
                bj4VarO.u();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            ox6Var3 = ox6Var2;
            composeShape = jl9Var2;
            bj4VarO.V();
            ox6VarH = ox6Var3.H(uma.a(aVar, composeShape));
            i4 = (i3 >> 3) & 14;
            imageUrl = avatarWrapper.getImageUrl(bj4VarO, i4);
            if (z2a.w(imageUrl)) {
                bj4VarO.K(-446445875);
                a4a.a(imageUrl, avatarWrapper.getAvatar().getLabel(), IntercomImageLoaderKt.getImageLoader((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b)), ox6VarH, gr1.b(-1294140715, new fi4<b4a, f50.a.c, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.FinAvatar.1
                    public final void invoke(b4a b4aVar, f50.a.c cVar, jt1 jt1Var2, int i8) {
                        b4aVar.getClass();
                        cVar.getClass();
                        if ((i8 & 129) == 128 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            AvatarIconKt.FinAvatarPlaceholder(avatarWrapper, ox6VarH, 0.0f, jt1Var2, 0, 4);
                        }
                    }

                    @Override // defpackage.fi4
                    public /* bridge */ /* synthetic */ g2b invoke(b4a b4aVar, f50.a.c cVar, jt1 jt1Var2, Integer num) {
                        invoke(b4aVar, cVar, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), gr1.b(-818047861, new fi4<b4a, f50.a.b, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.FinAvatar.2
                    public final void invoke(b4a b4aVar, f50.a.b bVar, jt1 jt1Var2, int i8) {
                        b4aVar.getClass();
                        bVar.getClass();
                        if ((i8 & 129) == 128 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            AvatarIconKt.FinAvatarPlaceholder(avatarWrapper, ox6VarH, 0.0f, jt1Var2, 0, 4);
                        }
                    }

                    @Override // defpackage.fi4
                    public /* bridge */ /* synthetic */ g2b invoke(b4a b4aVar, f50.a.b bVar, jt1 jt1Var2, Integer num) {
                        invoke(b4aVar, bVar, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, null, null, bj4VarO, 12779520, 0, 261968);
                bj4VarO.U(false);
                jl9Var3 = composeShape;
                bj4Var = bj4VarO;
            } else {
                bj4VarO.K(-445746825);
                jl9Var3 = composeShape;
                bj4Var = bj4VarO;
                FinAvatarPlaceholder(avatarWrapper, ox6VarH, 0.0f, bj4Var, i4, 4);
                bj4Var.U(false);
            }
            bj4Var2 = bj4Var;
            ox6Var4 = ox6Var3;
            jl9Var4 = jl9Var3;
        }
        xj8 xj8VarW = bj4Var2.W();
        if (xj8VarW != null) {
            xj8VarW.d = new dg0(ox6Var4, avatarWrapper, jl9Var4, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FinAvatar$lambda$11(ox6 ox6Var, AvatarWrapper avatarWrapper, jl9 jl9Var, int i, int i2, jt1 jt1Var, int i3) {
        FinAvatar(ox6Var, avatarWrapper, jl9Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FinAvatarPlaceholder(final AvatarWrapper avatarWrapper, ox6 ox6Var, float f, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final float f2;
        bj4 bj4VarO = jt1Var.o(-427803587);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(avatarWrapper) ? 4 : 2) | i;
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
            i3 |= bj4VarO.g(f) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            f2 = f;
        } else {
            ox6.a aVar = ox6.a.t;
            if (i4 != 0) {
                ox6Var = aVar;
            }
            if (i5 != 0) {
                f = 1.0f;
            }
            float f3 = f;
            ox6 ox6VarC = gi0.c(ox6Var, ColorExtensionsKt.m832darken8_81llA(IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU()), al8.a);
            fl6 fl6VarD = dv0.d(di.a.e, false);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarC);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
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
            rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
            BotAvatarPlaceholder(avatarWrapper, eo7.i(aVar, 4.0f), f3, bj4VarO, (i3 & 14) | 48 | (i3 & 896), 0);
            bj4VarO.U(true);
            f2 = f3;
        }
        final ox6 ox6Var2 = ox6Var;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: hg0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AvatarIconKt.FinAvatarPlaceholder$lambda$13(avatarWrapper, ox6Var2, f2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FinAvatarPlaceholder$lambda$13(AvatarWrapper avatarWrapper, ox6 ox6Var, float f, int i, int i2, jt1 jt1Var, int i3) {
        FinAvatarPlaceholder(avatarWrapper, ox6Var, f, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final ox6 avatarBorder(ox6 ox6Var, boolean z, jl9 jl9Var) {
        ox6Var.getClass();
        jl9Var.getClass();
        if (!z) {
            return ox6Var;
        }
        return ns0.b(ox6Var, 0.5f, new h86(ws0.i(new uh1(u7d.c(872415231)), new uh1(u7d.c(872415231))), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32)), jl9Var);
    }

    public static final zx8 getComposeShape(AvatarShape avatarShape) {
        avatarShape.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[avatarShape.ordinal()];
        if (i == 1) {
            return ay8.a(50);
        }
        if (i == 2) {
            return ay8.a(16);
        }
        u.b();
        return null;
    }
}
