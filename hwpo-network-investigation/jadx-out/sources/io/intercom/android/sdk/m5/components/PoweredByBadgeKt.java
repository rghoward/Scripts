package io.intercom.android.sdk.m5.components;

import defpackage.ac4;
import defpackage.b47;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.d3a;
import defpackage.di;
import defpackage.e15;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.g51;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.iv6;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qu1;
import defpackage.rd7;
import defpackage.tg5;
import defpackage.tx2;
import defpackage.u17;
import defpackage.uh1;
import defpackage.wja;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.PoweredByBadgeKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PoweredByBadgeKt {
    private static final float HorizontalPadding = 16.0f;
    private static final float IconSize = 16.0f;
    private static final float VerticalPadding = 6.0f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PoweredBy.PoweredByIconType.values().length];
            try {
                iArr[PoweredBy.PoweredByIconType.INTERCOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PoweredBy.PoweredByIconType.FIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013b  */
    /* JADX WARN: Code duplicated, block: B:103:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0195  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0113  */
    /* JADX WARN: Code duplicated, block: B:93:0x011c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:98:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0137  */
    /* JADX INFO: renamed from: PoweredByBadge-wBJOh4Y, reason: not valid java name */
    public static final void m88PoweredByBadgewBJOh4Y(final String str, final PoweredBy.PoweredByIconType poweredByIconType, final mh4<g2b> mh4Var, ox6 ox6Var, long j, long j2, jt1 jt1Var, final int i, final int i2) {
        int i3;
        PoweredBy.PoweredByIconType poweredByIconType2;
        final ox6 ox6Var2;
        long jM772getPoweredByBackgroundColor0d7_KjU;
        final long j3;
        ox6 ox6Var3;
        int i4;
        ox6 ox6Var4;
        long jM833generateTextColor8_81llA;
        int i5;
        int i6;
        final long j4;
        bj4 bj4Var;
        final long j5;
        xj8 xj8VarW;
        int i7;
        int i8;
        str.getClass();
        poweredByIconType.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(546776392);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            poweredByIconType2 = poweredByIconType;
        } else {
            poweredByIconType2 = poweredByIconType;
            if ((i & 48) == 0) {
                i3 |= bj4VarO.J(poweredByIconType2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            if ((i & 24576) == 0) {
                jM772getPoweredByBackgroundColor0d7_KjU = j;
                if ((i2 & 16) == 0 || !bj4VarO.i(jM772getPoweredByBackgroundColor0d7_KjU)) {
                    i8 = 8192;
                } else {
                    i8 = 16384;
                }
                i3 |= i8;
            } else {
                jM772getPoweredByBackgroundColor0d7_KjU = j;
            }
            if ((196608 & i) == 0) {
                j3 = j2;
                if ((i2 & 32) == 0 || !bj4VarO.i(j3)) {
                    i7 = 65536;
                } else {
                    i7 = 131072;
                }
                i3 |= i7;
            } else {
                j3 = j2;
            }
            if ((74899 & i3) == 74898 || !bj4VarO.r()) {
                bj4VarO.v0();
                if ((i & 1) != 0 || bj4VarO.c0()) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        jM772getPoweredByBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m772getPoweredByBackgroundColor0d7_KjU();
                    }
                    if ((i2 & 32) != 0) {
                        if (uh1.c(jM772getPoweredByBackgroundColor0d7_KjU, uh1.j)) {
                            jM833generateTextColor8_81llA = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                        } else {
                            jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(jM772getPoweredByBackgroundColor0d7_KjU);
                        }
                        i4 = i3 & (-458753);
                        ox6Var4 = ox6Var3;
                        j3 = jM833generateTextColor8_81llA;
                    } else {
                        i4 = i3;
                        ox6Var4 = ox6Var3;
                    }
                } else {
                    bj4VarO.u();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    i4 = i3;
                    ox6Var4 = ox6Var2;
                }
                bj4VarO.V();
                i5 = WhenMappings.$EnumSwitchMapping$0[poweredByIconType2.ordinal()];
                if (i5 == 1) {
                    i6 = R.drawable.intercom_logo;
                } else {
                    if (i5 != 2) {
                        defpackage.u.b();
                        return;
                    }
                    i6 = R.drawable.intercom_fin_ai_agent;
                }
                final int i10 = i6;
                e15 e15Var = tg5.a;
                long j6 = jM772getPoweredByBackgroundColor0d7_KjU;
                j4 = j3;
                bj4Var = bj4VarO;
                g51.a(mh4Var, ox6Var4.H(iv6.t), false, IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j6, 0L, bj4VarO, (i4 >> 12) & 14, 14), null, null, null, gr1.b(803643315, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.PoweredByBadgeKt$PoweredByBadge$1
                    public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i11) {
                        bj1Var.getClass();
                        if ((i11 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        float f = PoweredByBadgeKt.HorizontalPadding;
                        float f2 = PoweredByBadgeKt.VerticalPadding;
                        ox6.a aVar = ox6.a.t;
                        ox6 ox6VarJ = eo7.j(f, f2, aVar);
                        int i12 = i10;
                        long j7 = j3;
                        String str2 = str;
                        ny8 ny8VarA = ly8.a(c30.d, di.a.k, jt1Var2, 54);
                        int iHashCode = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC = it1.c(jt1Var2, ox6VarJ);
                        bt1.c.getClass();
                        qr5.a aVar2 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar2);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                        m65.b(is7.a(i12, jt1Var2, 0), null, ir9.j(aVar, PoweredByBadgeKt.IconSize), j7, jt1Var2, 440, 0);
                        b47.b(jt1Var2, ir9.n(aVar, 8.0f));
                        mia.b(str2, null, j7, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, PoweredByBadgeKt.getTextStyle(jt1Var2, 0), jt1Var2, 0, 0, 131066);
                        jt1Var2.I();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                        invoke(bj1Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4Var, ((i4 >> 6) & 14) | 100663296, 228);
                ox6Var2 = ox6Var4;
                j5 = j6;
            } else {
                bj4VarO.u();
                bj4Var = bj4VarO;
                j5 = jM772getPoweredByBackgroundColor0d7_KjU;
                j4 = j3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: v68
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PoweredByBadgeKt.PoweredByBadge_wBJOh4Y$lambda$0(str, poweredByIconType, mh4Var, ox6Var2, j5, j4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        ox6Var2 = ox6Var;
        if ((i & 24576) == 0) {
            jM772getPoweredByBackgroundColor0d7_KjU = j;
            if ((i2 & 16) == 0) {
                i8 = 8192;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        } else {
            jM772getPoweredByBackgroundColor0d7_KjU = j;
        }
        if ((196608 & i) == 0) {
            j3 = j2;
            if ((i2 & 32) == 0) {
                i7 = 65536;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        } else {
            j3 = j2;
        }
        if ((74899 & i3) == 74898) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    jM772getPoweredByBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m772getPoweredByBackgroundColor0d7_KjU();
                }
                if ((i2 & 32) != 0) {
                    if (uh1.c(jM772getPoweredByBackgroundColor0d7_KjU, uh1.j)) {
                        jM833generateTextColor8_81llA = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(jM772getPoweredByBackgroundColor0d7_KjU);
                    }
                    i4 = i3 & (-458753);
                    ox6Var4 = ox6Var3;
                    j3 = jM833generateTextColor8_81llA;
                } else {
                    i4 = i3;
                    ox6Var4 = ox6Var3;
                }
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    jM772getPoweredByBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m772getPoweredByBackgroundColor0d7_KjU();
                }
                if ((i2 & 32) != 0) {
                    if (uh1.c(jM772getPoweredByBackgroundColor0d7_KjU, uh1.j)) {
                        jM833generateTextColor8_81llA = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(jM772getPoweredByBackgroundColor0d7_KjU);
                    }
                    i4 = i3 & (-458753);
                    ox6Var4 = ox6Var3;
                    j3 = jM833generateTextColor8_81llA;
                } else {
                    i4 = i3;
                    ox6Var4 = ox6Var3;
                }
            }
            bj4VarO.V();
            i5 = WhenMappings.$EnumSwitchMapping$0[poweredByIconType2.ordinal()];
            if (i5 == 1) {
                i6 = R.drawable.intercom_logo;
            } else {
                if (i5 != 2) {
                    defpackage.u.b();
                    return;
                }
                i6 = R.drawable.intercom_fin_ai_agent;
            }
            final int i11 = i6;
            e15 e15Var2 = tg5.a;
            long j7 = jM772getPoweredByBackgroundColor0d7_KjU;
            j4 = j3;
            bj4Var = bj4VarO;
            g51.a(mh4Var, ox6Var4.H(iv6.t), false, IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j7, 0L, bj4VarO, (i4 >> 12) & 14, 14), null, null, null, gr1.b(803643315, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.PoweredByBadgeKt$PoweredByBadge$1
                public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i12) {
                    bj1Var.getClass();
                    if ((i12 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    float f = PoweredByBadgeKt.HorizontalPadding;
                    float f2 = PoweredByBadgeKt.VerticalPadding;
                    ox6.a aVar = ox6.a.t;
                    ox6 ox6VarJ = eo7.j(f, f2, aVar);
                    int i13 = i11;
                    long j8 = j3;
                    String str2 = str;
                    ny8 ny8VarA = ly8.a(c30.d, di.a.k, jt1Var2, 54);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC = it1.c(jt1Var2, ox6VarJ);
                    bt1.c.getClass();
                    qr5.a aVar2 = bt1.a.b;
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar2);
                    } else {
                        jt1Var2.z();
                    }
                    rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(jt1Var2, bt1.a.h);
                    rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                    m65.b(is7.a(i13, jt1Var2, 0), null, ir9.j(aVar, PoweredByBadgeKt.IconSize), j8, jt1Var2, 440, 0);
                    b47.b(jt1Var2, ir9.n(aVar, 8.0f));
                    mia.b(str2, null, j8, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, PoweredByBadgeKt.getTextStyle(jt1Var2, 0), jt1Var2, 0, 0, 131066);
                    jt1Var2.I();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                    invoke(bj1Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4Var, ((i4 >> 6) & 14) | 100663296, 228);
            ox6Var2 = ox6Var4;
            j5 = j7;
        } else {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    jM772getPoweredByBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m772getPoweredByBackgroundColor0d7_KjU();
                }
                if ((i2 & 32) != 0) {
                    if (uh1.c(jM772getPoweredByBackgroundColor0d7_KjU, uh1.j)) {
                        jM833generateTextColor8_81llA = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(jM772getPoweredByBackgroundColor0d7_KjU);
                    }
                    i4 = i3 & (-458753);
                    ox6Var4 = ox6Var3;
                    j3 = jM833generateTextColor8_81llA;
                } else {
                    i4 = i3;
                    ox6Var4 = ox6Var3;
                }
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    jM772getPoweredByBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m772getPoweredByBackgroundColor0d7_KjU();
                }
                if ((i2 & 32) != 0) {
                    if (uh1.c(jM772getPoweredByBackgroundColor0d7_KjU, uh1.j)) {
                        jM833generateTextColor8_81llA = ac4.b(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable);
                    } else {
                        jM833generateTextColor8_81llA = ColorExtensionsKt.m833generateTextColor8_81llA(jM772getPoweredByBackgroundColor0d7_KjU);
                    }
                    i4 = i3 & (-458753);
                    ox6Var4 = ox6Var3;
                    j3 = jM833generateTextColor8_81llA;
                } else {
                    i4 = i3;
                    ox6Var4 = ox6Var3;
                }
            }
            bj4VarO.V();
            i5 = WhenMappings.$EnumSwitchMapping$0[poweredByIconType2.ordinal()];
            if (i5 == 1) {
                i6 = R.drawable.intercom_logo;
            } else {
                if (i5 != 2) {
                    defpackage.u.b();
                    return;
                }
                i6 = R.drawable.intercom_fin_ai_agent;
            }
            final int i12 = i6;
            e15 e15Var3 = tg5.a;
            long j8 = jM772getPoweredByBackgroundColor0d7_KjU;
            j4 = j3;
            bj4Var = bj4VarO;
            g51.a(mh4Var, ox6Var4.H(iv6.t), false, IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b, d3a.c(j8, 0L, bj4VarO, (i4 >> 12) & 14, 14), null, null, null, gr1.b(803643315, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.PoweredByBadgeKt$PoweredByBadge$1
                public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i13) {
                    bj1Var.getClass();
                    if ((i13 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    float f = PoweredByBadgeKt.HorizontalPadding;
                    float f2 = PoweredByBadgeKt.VerticalPadding;
                    ox6.a aVar = ox6.a.t;
                    ox6 ox6VarJ = eo7.j(f, f2, aVar);
                    int i14 = i12;
                    long j9 = j3;
                    String str2 = str;
                    ny8 ny8VarA = ly8.a(c30.d, di.a.k, jt1Var2, 54);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC = it1.c(jt1Var2, ox6VarJ);
                    bt1.c.getClass();
                    qr5.a aVar2 = bt1.a.b;
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar2);
                    } else {
                        jt1Var2.z();
                    }
                    rd7.d(jt1Var2, bt1.a.f, ny8VarA);
                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(jt1Var2, bt1.a.h);
                    rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                    m65.b(is7.a(i14, jt1Var2, 0), null, ir9.j(aVar, PoweredByBadgeKt.IconSize), j9, jt1Var2, 440, 0);
                    b47.b(jt1Var2, ir9.n(aVar, 8.0f));
                    mia.b(str2, null, j9, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, PoweredByBadgeKt.getTextStyle(jt1Var2, 0), jt1Var2, 0, 0, 131066);
                    jt1Var2.I();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                    invoke(bj1Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4Var, ((i4 >> 6) & 14) | 100663296, 228);
            ox6Var2 = ox6Var4;
            j5 = j8;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: v68
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PoweredByBadgeKt.PoweredByBadge_wBJOh4Y$lambda$0(str, poweredByIconType, mh4Var, ox6Var2, j5, j4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    public static final void PoweredByBadgePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(233774014);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PoweredByBadgeKt.INSTANCE.m67getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new u17(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PoweredByBadgePreview$lambda$2(int i, jt1 jt1Var, int i2) {
        PoweredByBadgePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PoweredByBadge_wBJOh4Y$lambda$0(String str, PoweredBy.PoweredByIconType poweredByIconType, mh4 mh4Var, ox6 ox6Var, long j, long j2, int i, int i2, jt1 jt1Var, int i3) {
        m88PoweredByBadgewBJOh4Y(str, poweredByIconType, mh4Var, ox6Var, j, j2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TransparentPoweredByBadgePreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1988629996);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PoweredByBadgeKt.INSTANCE.m69getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: u68
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PoweredByBadgeKt.TransparentPoweredByBadgePreview$lambda$3(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TransparentPoweredByBadgePreview$lambda$3(int i, jt1 jt1Var, int i2) {
        TransparentPoweredByBadgePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final float getPoweredByBadgeHeight(jt1 jt1Var, int i) {
        jt1Var.K(-1418088879);
        float fD0 = ((tx2) jt1Var.F(qu1.h)).d0(getTextStyle(jt1Var, 0).a.b);
        float f = VerticalPadding;
        float fMax = Math.max(fD0, IconSize) + f + f;
        jt1Var.B();
        return fMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wja getTextStyle(jt1 jt1Var, int i) {
        jt1Var.K(634566382);
        wja type05 = IntercomTheme.INSTANCE.getTypography(jt1Var, IntercomTheme.$stable).getType05();
        jt1Var.B();
        return type05;
    }
}
