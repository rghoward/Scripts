package io.intercom.android.sdk.m5.components;

import defpackage.ab2;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.m65;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.vaa;
import defpackage.wja;
import defpackage.xj8;
import defpackage.ya2;
import defpackage.yi1;
import io.intercom.android.sdk.m5.components.EmptyStateKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptyStateKt {
    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:82:0x0121  */
    /* JADX WARN: Code duplicated, block: B:83:0x0126  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0216  */
    /* JADX WARN: Code duplicated, block: B:96:0x0239  */
    /* JADX WARN: Code duplicated, block: B:98:0x0245  */
    public static final void EmptyState(final String str, ox6 ox6Var, String str2, Integer num, ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        int i4;
        String str3;
        int i5;
        int i6;
        Integer num2;
        int i7;
        int i8;
        ci4<? super jt1, ? super Integer, g2b> ci4Var2;
        int i9;
        ox6.a aVar;
        Integer num3;
        aj1 aj1VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        ci4<? super jt1, ? super Integer, g2b> ci4Var3;
        boolean z;
        IntercomTheme intercomTheme;
        int i10;
        String str4;
        final Integer num4;
        final ci4<? super jt1, ? super Integer, g2b> ci4Var4;
        final String str5;
        final ox6 ox6Var3;
        xj8 xj8VarW;
        str.getClass();
        bj4 bj4VarO = jt1Var.o(728499887);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    str3 = str2;
                    if (bj4VarO.J(str3)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        num2 = num;
                        if (bj4VarO.J(num2)) {
                            i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            ci4Var2 = ci4Var;
                            if (bj4VarO.j(ci4Var2)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                            aVar = ox6.a.t;
                            if (i11 != 0) {
                                ox6Var2 = aVar;
                            }
                            if (i4 != 0) {
                                str3 = null;
                            }
                            if (i6 != 0) {
                                num3 = null;
                            } else {
                                num3 = num2;
                            }
                            if (i8 != 0) {
                                ci4Var2 = null;
                            }
                            ox6 ox6VarH = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                            aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                            iHashCode = Long.hashCode(bj4VarO.T);
                            kw7VarP = bj4VarO.P();
                            ox6VarC = it1.c(bj4VarO, ox6VarH);
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
                            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            bj4VarO.K(-1239346792);
                            if (num3 == null) {
                                z = false;
                                ci4Var3 = ci4Var2;
                            } else {
                                ci4Var3 = ci4Var2;
                                z = false;
                                m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                            }
                            bj4VarO.U(z);
                            intercomTheme = IntercomTheme.INSTANCE;
                            i10 = IntercomTheme.$stable;
                            ox6 ox6Var4 = ox6Var2;
                            Integer num5 = num3;
                            mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                            bj4VarO = bj4VarO;
                            bj4VarO.K(-1239330006);
                            if (str3 == null) {
                                str4 = str3;
                            } else {
                                b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                                wja type04 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                                str4 = str3;
                                mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type04, bj4VarO, 0, 0, 130042);
                                bj4VarO = bj4VarO;
                            }
                            bj4VarO.U(false);
                            bj4VarO.K(-1239320186);
                            if (ci4Var3 != null) {
                                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                                ci4Var3.invoke(bj4VarO, 0);
                            }
                            bj4VarO.U(false);
                            bj4VarO.U(true);
                            num4 = num5;
                            ci4Var4 = ci4Var3;
                            str5 = str4;
                            ox6Var3 = ox6Var4;
                        } else {
                            bj4VarO.u();
                            ox6Var3 = ox6Var2;
                            str5 = str3;
                            num4 = num2;
                            ci4Var4 = ci4Var2;
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: qf3
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return EmptyStateKt.EmptyState$lambda$4(str, ox6Var3, str5, num4, ci4Var4, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 24576;
                    ci4Var2 = ci4Var;
                    if ((i3 & 9363) == 9362) {
                        aVar = ox6.a.t;
                        if (i11 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            str3 = null;
                        }
                        if (i6 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i8 != 0) {
                            ci4Var2 = null;
                        }
                        ox6 ox6VarH2 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                        aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH2);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(-1239346792);
                        if (num3 == null) {
                            z = false;
                            ci4Var3 = ci4Var2;
                        } else {
                            ci4Var3 = ci4Var2;
                            z = false;
                            m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        }
                        bj4VarO.U(z);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i10 = IntercomTheme.$stable;
                        ox6 ox6Var5 = ox6Var2;
                        Integer num6 = num3;
                        mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                        bj4VarO = bj4VarO;
                        bj4VarO.K(-1239330006);
                        if (str3 == null) {
                            str4 = str3;
                        } else {
                            b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                            wja type05 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                            str4 = str3;
                            mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type05, bj4VarO, 0, 0, 130042);
                            bj4VarO = bj4VarO;
                        }
                        bj4VarO.U(false);
                        bj4VarO.K(-1239320186);
                        if (ci4Var3 != null) {
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                            ci4Var3.invoke(bj4VarO, 0);
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        num4 = num6;
                        ci4Var4 = ci4Var3;
                        str5 = str4;
                        ox6Var3 = ox6Var5;
                    } else {
                        aVar = ox6.a.t;
                        if (i11 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            str3 = null;
                        }
                        if (i6 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i8 != 0) {
                            ci4Var2 = null;
                        }
                        ox6 ox6VarH3 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                        aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH3);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(-1239346792);
                        if (num3 == null) {
                            z = false;
                            ci4Var3 = ci4Var2;
                        } else {
                            ci4Var3 = ci4Var2;
                            z = false;
                            m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        }
                        bj4VarO.U(z);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i10 = IntercomTheme.$stable;
                        ox6 ox6Var6 = ox6Var2;
                        Integer num7 = num3;
                        mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                        bj4VarO = bj4VarO;
                        bj4VarO.K(-1239330006);
                        if (str3 == null) {
                            str4 = str3;
                        } else {
                            b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                            wja type06 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                            str4 = str3;
                            mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type06, bj4VarO, 0, 0, 130042);
                            bj4VarO = bj4VarO;
                        }
                        bj4VarO.U(false);
                        bj4VarO.K(-1239320186);
                        if (ci4Var3 != null) {
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                            ci4Var3.invoke(bj4VarO, 0);
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        num4 = num7;
                        ci4Var4 = ci4Var3;
                        str5 = str4;
                        ox6Var3 = ox6Var6;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: qf3
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return EmptyStateKt.EmptyState$lambda$4(str, ox6Var3, str5, num4, ci4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 3072;
                num2 = num;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        ci4Var2 = ci4Var;
                        if (bj4VarO.j(ci4Var2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) == 9362) {
                        aVar = ox6.a.t;
                        if (i11 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            str3 = null;
                        }
                        if (i6 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i8 != 0) {
                            ci4Var2 = null;
                        }
                        ox6 ox6VarH4 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                        aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH4);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(-1239346792);
                        if (num3 == null) {
                            z = false;
                            ci4Var3 = ci4Var2;
                        } else {
                            ci4Var3 = ci4Var2;
                            z = false;
                            m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        }
                        bj4VarO.U(z);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i10 = IntercomTheme.$stable;
                        ox6 ox6Var7 = ox6Var2;
                        Integer num8 = num3;
                        mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                        bj4VarO = bj4VarO;
                        bj4VarO.K(-1239330006);
                        if (str3 == null) {
                            str4 = str3;
                        } else {
                            b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                            wja type07 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                            str4 = str3;
                            mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type07, bj4VarO, 0, 0, 130042);
                            bj4VarO = bj4VarO;
                        }
                        bj4VarO.U(false);
                        bj4VarO.K(-1239320186);
                        if (ci4Var3 != null) {
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                            ci4Var3.invoke(bj4VarO, 0);
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        num4 = num8;
                        ci4Var4 = ci4Var3;
                        str5 = str4;
                        ox6Var3 = ox6Var7;
                    } else {
                        aVar = ox6.a.t;
                        if (i11 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            str3 = null;
                        }
                        if (i6 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i8 != 0) {
                            ci4Var2 = null;
                        }
                        ox6 ox6VarH5 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                        aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH5);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(-1239346792);
                        if (num3 == null) {
                            z = false;
                            ci4Var3 = ci4Var2;
                        } else {
                            ci4Var3 = ci4Var2;
                            z = false;
                            m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        }
                        bj4VarO.U(z);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i10 = IntercomTheme.$stable;
                        ox6 ox6Var8 = ox6Var2;
                        Integer num9 = num3;
                        mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                        bj4VarO = bj4VarO;
                        bj4VarO.K(-1239330006);
                        if (str3 == null) {
                            str4 = str3;
                        } else {
                            b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                            wja type08 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                            str4 = str3;
                            mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type08, bj4VarO, 0, 0, 130042);
                            bj4VarO = bj4VarO;
                        }
                        bj4VarO.U(false);
                        bj4VarO.K(-1239320186);
                        if (ci4Var3 != null) {
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                            ci4Var3.invoke(bj4VarO, 0);
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        num4 = num9;
                        ci4Var4 = ci4Var3;
                        str5 = str4;
                        ox6Var3 = ox6Var8;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: qf3
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return EmptyStateKt.EmptyState$lambda$4(str, ox6Var3, str5, num4, ci4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                ci4Var2 = ci4Var;
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        str3 = null;
                    }
                    if (i6 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i8 != 0) {
                        ci4Var2 = null;
                    }
                    ox6 ox6VarH6 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                    aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH6);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(-1239346792);
                    if (num3 == null) {
                        z = false;
                        ci4Var3 = ci4Var2;
                    } else {
                        ci4Var3 = ci4Var2;
                        z = false;
                        m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    }
                    bj4VarO.U(z);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i10 = IntercomTheme.$stable;
                    ox6 ox6Var9 = ox6Var2;
                    Integer num10 = num3;
                    mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                    bj4VarO = bj4VarO;
                    bj4VarO.K(-1239330006);
                    if (str3 == null) {
                        str4 = str3;
                    } else {
                        b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                        wja type09 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                        str4 = str3;
                        mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type09, bj4VarO, 0, 0, 130042);
                        bj4VarO = bj4VarO;
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(-1239320186);
                    if (ci4Var3 != null) {
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        ci4Var3.invoke(bj4VarO, 0);
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    num4 = num10;
                    ci4Var4 = ci4Var3;
                    str5 = str4;
                    ox6Var3 = ox6Var9;
                } else {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        str3 = null;
                    }
                    if (i6 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i8 != 0) {
                        ci4Var2 = null;
                    }
                    ox6 ox6VarH7 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                    aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH7);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(-1239346792);
                    if (num3 == null) {
                        z = false;
                        ci4Var3 = ci4Var2;
                    } else {
                        ci4Var3 = ci4Var2;
                        z = false;
                        m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    }
                    bj4VarO.U(z);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i10 = IntercomTheme.$stable;
                    ox6 ox6Var10 = ox6Var2;
                    Integer num11 = num3;
                    mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                    bj4VarO = bj4VarO;
                    bj4VarO.K(-1239330006);
                    if (str3 == null) {
                        str4 = str3;
                    } else {
                        b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                        wja type010 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                        str4 = str3;
                        mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type010, bj4VarO, 0, 0, 130042);
                        bj4VarO = bj4VarO;
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(-1239320186);
                    if (ci4Var3 != null) {
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        ci4Var3.invoke(bj4VarO, 0);
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    num4 = num11;
                    ci4Var4 = ci4Var3;
                    str5 = str4;
                    ox6Var3 = ox6Var10;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: qf3
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return EmptyStateKt.EmptyState$lambda$4(str, ox6Var3, str5, num4, ci4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            str3 = str2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    num2 = num;
                    if (bj4VarO.J(num2)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        ci4Var2 = ci4Var;
                        if (bj4VarO.j(ci4Var2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) == 9362) {
                        aVar = ox6.a.t;
                        if (i11 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            str3 = null;
                        }
                        if (i6 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i8 != 0) {
                            ci4Var2 = null;
                        }
                        ox6 ox6VarH8 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                        aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH8);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(-1239346792);
                        if (num3 == null) {
                            z = false;
                            ci4Var3 = ci4Var2;
                        } else {
                            ci4Var3 = ci4Var2;
                            z = false;
                            m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        }
                        bj4VarO.U(z);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i10 = IntercomTheme.$stable;
                        ox6 ox6Var11 = ox6Var2;
                        Integer num12 = num3;
                        mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                        bj4VarO = bj4VarO;
                        bj4VarO.K(-1239330006);
                        if (str3 == null) {
                            str4 = str3;
                        } else {
                            b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                            wja type011 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                            str4 = str3;
                            mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type011, bj4VarO, 0, 0, 130042);
                            bj4VarO = bj4VarO;
                        }
                        bj4VarO.U(false);
                        bj4VarO.K(-1239320186);
                        if (ci4Var3 != null) {
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                            ci4Var3.invoke(bj4VarO, 0);
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        num4 = num12;
                        ci4Var4 = ci4Var3;
                        str5 = str4;
                        ox6Var3 = ox6Var11;
                    } else {
                        aVar = ox6.a.t;
                        if (i11 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            str3 = null;
                        }
                        if (i6 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i8 != 0) {
                            ci4Var2 = null;
                        }
                        ox6 ox6VarH9 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                        aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH9);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(-1239346792);
                        if (num3 == null) {
                            z = false;
                            ci4Var3 = ci4Var2;
                        } else {
                            ci4Var3 = ci4Var2;
                            z = false;
                            m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        }
                        bj4VarO.U(z);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i10 = IntercomTheme.$stable;
                        ox6 ox6Var12 = ox6Var2;
                        Integer num13 = num3;
                        mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                        bj4VarO = bj4VarO;
                        bj4VarO.K(-1239330006);
                        if (str3 == null) {
                            str4 = str3;
                        } else {
                            b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                            wja type012 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                            str4 = str3;
                            mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type012, bj4VarO, 0, 0, 130042);
                            bj4VarO = bj4VarO;
                        }
                        bj4VarO.U(false);
                        bj4VarO.K(-1239320186);
                        if (ci4Var3 != null) {
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                            ci4Var3.invoke(bj4VarO, 0);
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        num4 = num13;
                        ci4Var4 = ci4Var3;
                        str5 = str4;
                        ox6Var3 = ox6Var12;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: qf3
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return EmptyStateKt.EmptyState$lambda$4(str, ox6Var3, str5, num4, ci4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                ci4Var2 = ci4Var;
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        str3 = null;
                    }
                    if (i6 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i8 != 0) {
                        ci4Var2 = null;
                    }
                    ox6 ox6VarH10 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                    aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH10);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(-1239346792);
                    if (num3 == null) {
                        z = false;
                        ci4Var3 = ci4Var2;
                    } else {
                        ci4Var3 = ci4Var2;
                        z = false;
                        m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    }
                    bj4VarO.U(z);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i10 = IntercomTheme.$stable;
                    ox6 ox6Var13 = ox6Var2;
                    Integer num14 = num3;
                    mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                    bj4VarO = bj4VarO;
                    bj4VarO.K(-1239330006);
                    if (str3 == null) {
                        str4 = str3;
                    } else {
                        b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                        wja type013 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                        str4 = str3;
                        mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type013, bj4VarO, 0, 0, 130042);
                        bj4VarO = bj4VarO;
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(-1239320186);
                    if (ci4Var3 != null) {
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        ci4Var3.invoke(bj4VarO, 0);
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    num4 = num14;
                    ci4Var4 = ci4Var3;
                    str5 = str4;
                    ox6Var3 = ox6Var13;
                } else {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        str3 = null;
                    }
                    if (i6 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i8 != 0) {
                        ci4Var2 = null;
                    }
                    ox6 ox6VarH11 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                    aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH11);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(-1239346792);
                    if (num3 == null) {
                        z = false;
                        ci4Var3 = ci4Var2;
                    } else {
                        ci4Var3 = ci4Var2;
                        z = false;
                        m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    }
                    bj4VarO.U(z);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i10 = IntercomTheme.$stable;
                    ox6 ox6Var14 = ox6Var2;
                    Integer num15 = num3;
                    mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                    bj4VarO = bj4VarO;
                    bj4VarO.K(-1239330006);
                    if (str3 == null) {
                        str4 = str3;
                    } else {
                        b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                        wja type014 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                        str4 = str3;
                        mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type014, bj4VarO, 0, 0, 130042);
                        bj4VarO = bj4VarO;
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(-1239320186);
                    if (ci4Var3 != null) {
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        ci4Var3.invoke(bj4VarO, 0);
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    num4 = num15;
                    ci4Var4 = ci4Var3;
                    str5 = str4;
                    ox6Var3 = ox6Var14;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: qf3
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return EmptyStateKt.EmptyState$lambda$4(str, ox6Var3, str5, num4, ci4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            num2 = num;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    ci4Var2 = ci4Var;
                    if (bj4VarO.j(ci4Var2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        str3 = null;
                    }
                    if (i6 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i8 != 0) {
                        ci4Var2 = null;
                    }
                    ox6 ox6VarH12 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                    aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH12);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(-1239346792);
                    if (num3 == null) {
                        z = false;
                        ci4Var3 = ci4Var2;
                    } else {
                        ci4Var3 = ci4Var2;
                        z = false;
                        m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    }
                    bj4VarO.U(z);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i10 = IntercomTheme.$stable;
                    ox6 ox6Var15 = ox6Var2;
                    Integer num16 = num3;
                    mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                    bj4VarO = bj4VarO;
                    bj4VarO.K(-1239330006);
                    if (str3 == null) {
                        str4 = str3;
                    } else {
                        b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                        wja type015 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                        str4 = str3;
                        mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type015, bj4VarO, 0, 0, 130042);
                        bj4VarO = bj4VarO;
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(-1239320186);
                    if (ci4Var3 != null) {
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        ci4Var3.invoke(bj4VarO, 0);
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    num4 = num16;
                    ci4Var4 = ci4Var3;
                    str5 = str4;
                    ox6Var3 = ox6Var15;
                } else {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        str3 = null;
                    }
                    if (i6 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i8 != 0) {
                        ci4Var2 = null;
                    }
                    ox6 ox6VarH13 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                    aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH13);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(-1239346792);
                    if (num3 == null) {
                        z = false;
                        ci4Var3 = ci4Var2;
                    } else {
                        ci4Var3 = ci4Var2;
                        z = false;
                        m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    }
                    bj4VarO.U(z);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i10 = IntercomTheme.$stable;
                    ox6 ox6Var16 = ox6Var2;
                    Integer num17 = num3;
                    mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                    bj4VarO = bj4VarO;
                    bj4VarO.K(-1239330006);
                    if (str3 == null) {
                        str4 = str3;
                    } else {
                        b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                        wja type016 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                        str4 = str3;
                        mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type016, bj4VarO, 0, 0, 130042);
                        bj4VarO = bj4VarO;
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(-1239320186);
                    if (ci4Var3 != null) {
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        ci4Var3.invoke(bj4VarO, 0);
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    num4 = num17;
                    ci4Var4 = ci4Var3;
                    str5 = str4;
                    ox6Var3 = ox6Var16;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: qf3
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return EmptyStateKt.EmptyState$lambda$4(str, ox6Var3, str5, num4, ci4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            ci4Var2 = ci4Var;
            if ((i3 & 9363) == 9362) {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    str3 = null;
                }
                if (i6 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i8 != 0) {
                    ci4Var2 = null;
                }
                ox6 ox6VarH14 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH14);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-1239346792);
                if (num3 == null) {
                    z = false;
                    ci4Var3 = ci4Var2;
                } else {
                    ci4Var3 = ci4Var2;
                    z = false;
                    m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                }
                bj4VarO.U(z);
                intercomTheme = IntercomTheme.INSTANCE;
                i10 = IntercomTheme.$stable;
                ox6 ox6Var17 = ox6Var2;
                Integer num18 = num3;
                mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                bj4VarO = bj4VarO;
                bj4VarO.K(-1239330006);
                if (str3 == null) {
                    str4 = str3;
                } else {
                    b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                    wja type017 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                    str4 = str3;
                    mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type017, bj4VarO, 0, 0, 130042);
                    bj4VarO = bj4VarO;
                }
                bj4VarO.U(false);
                bj4VarO.K(-1239320186);
                if (ci4Var3 != null) {
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    ci4Var3.invoke(bj4VarO, 0);
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                num4 = num18;
                ci4Var4 = ci4Var3;
                str5 = str4;
                ox6Var3 = ox6Var17;
            } else {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    str3 = null;
                }
                if (i6 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i8 != 0) {
                    ci4Var2 = null;
                }
                ox6 ox6VarH15 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH15);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-1239346792);
                if (num3 == null) {
                    z = false;
                    ci4Var3 = ci4Var2;
                } else {
                    ci4Var3 = ci4Var2;
                    z = false;
                    m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                }
                bj4VarO.U(z);
                intercomTheme = IntercomTheme.INSTANCE;
                i10 = IntercomTheme.$stable;
                ox6 ox6Var18 = ox6Var2;
                Integer num19 = num3;
                mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                bj4VarO = bj4VarO;
                bj4VarO.K(-1239330006);
                if (str3 == null) {
                    str4 = str3;
                } else {
                    b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                    wja type018 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                    str4 = str3;
                    mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type018, bj4VarO, 0, 0, 130042);
                    bj4VarO = bj4VarO;
                }
                bj4VarO.U(false);
                bj4VarO.K(-1239320186);
                if (ci4Var3 != null) {
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    ci4Var3.invoke(bj4VarO, 0);
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                num4 = num19;
                ci4Var4 = ci4Var3;
                str5 = str4;
                ox6Var3 = ox6Var18;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: qf3
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return EmptyStateKt.EmptyState$lambda$4(str, ox6Var3, str5, num4, ci4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                str3 = str2;
                if (bj4VarO.J(str3)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    num2 = num;
                    if (bj4VarO.J(num2)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        ci4Var2 = ci4Var;
                        if (bj4VarO.j(ci4Var2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) == 9362) {
                        aVar = ox6.a.t;
                        if (i11 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            str3 = null;
                        }
                        if (i6 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i8 != 0) {
                            ci4Var2 = null;
                        }
                        ox6 ox6VarH16 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                        aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH16);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(-1239346792);
                        if (num3 == null) {
                            z = false;
                            ci4Var3 = ci4Var2;
                        } else {
                            ci4Var3 = ci4Var2;
                            z = false;
                            m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        }
                        bj4VarO.U(z);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i10 = IntercomTheme.$stable;
                        ox6 ox6Var19 = ox6Var2;
                        Integer num110 = num3;
                        mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                        bj4VarO = bj4VarO;
                        bj4VarO.K(-1239330006);
                        if (str3 == null) {
                            str4 = str3;
                        } else {
                            b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                            wja type019 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                            str4 = str3;
                            mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type019, bj4VarO, 0, 0, 130042);
                            bj4VarO = bj4VarO;
                        }
                        bj4VarO.U(false);
                        bj4VarO.K(-1239320186);
                        if (ci4Var3 != null) {
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                            ci4Var3.invoke(bj4VarO, 0);
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        num4 = num110;
                        ci4Var4 = ci4Var3;
                        str5 = str4;
                        ox6Var3 = ox6Var19;
                    } else {
                        aVar = ox6.a.t;
                        if (i11 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            str3 = null;
                        }
                        if (i6 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i8 != 0) {
                            ci4Var2 = null;
                        }
                        ox6 ox6VarH17 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                        aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarH17);
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
                        rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        bj4VarO.K(-1239346792);
                        if (num3 == null) {
                            z = false;
                            ci4Var3 = ci4Var2;
                        } else {
                            ci4Var3 = ci4Var2;
                            z = false;
                            m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        }
                        bj4VarO.U(z);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i10 = IntercomTheme.$stable;
                        ox6 ox6Var110 = ox6Var2;
                        Integer num111 = num3;
                        mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                        bj4VarO = bj4VarO;
                        bj4VarO.K(-1239330006);
                        if (str3 == null) {
                            str4 = str3;
                        } else {
                            b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                            wja type0110 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                            str4 = str3;
                            mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type0110, bj4VarO, 0, 0, 130042);
                            bj4VarO = bj4VarO;
                        }
                        bj4VarO.U(false);
                        bj4VarO.K(-1239320186);
                        if (ci4Var3 != null) {
                            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                            ci4Var3.invoke(bj4VarO, 0);
                        }
                        bj4VarO.U(false);
                        bj4VarO.U(true);
                        num4 = num111;
                        ci4Var4 = ci4Var3;
                        str5 = str4;
                        ox6Var3 = ox6Var110;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: qf3
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return EmptyStateKt.EmptyState$lambda$4(str, ox6Var3, str5, num4, ci4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                ci4Var2 = ci4Var;
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        str3 = null;
                    }
                    if (i6 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i8 != 0) {
                        ci4Var2 = null;
                    }
                    ox6 ox6VarH18 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                    aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH18);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(-1239346792);
                    if (num3 == null) {
                        z = false;
                        ci4Var3 = ci4Var2;
                    } else {
                        ci4Var3 = ci4Var2;
                        z = false;
                        m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    }
                    bj4VarO.U(z);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i10 = IntercomTheme.$stable;
                    ox6 ox6Var111 = ox6Var2;
                    Integer num112 = num3;
                    mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                    bj4VarO = bj4VarO;
                    bj4VarO.K(-1239330006);
                    if (str3 == null) {
                        str4 = str3;
                    } else {
                        b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                        wja type0111 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                        str4 = str3;
                        mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type0111, bj4VarO, 0, 0, 130042);
                        bj4VarO = bj4VarO;
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(-1239320186);
                    if (ci4Var3 != null) {
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        ci4Var3.invoke(bj4VarO, 0);
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    num4 = num112;
                    ci4Var4 = ci4Var3;
                    str5 = str4;
                    ox6Var3 = ox6Var111;
                } else {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        str3 = null;
                    }
                    if (i6 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i8 != 0) {
                        ci4Var2 = null;
                    }
                    ox6 ox6VarH19 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                    aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH19);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(-1239346792);
                    if (num3 == null) {
                        z = false;
                        ci4Var3 = ci4Var2;
                    } else {
                        ci4Var3 = ci4Var2;
                        z = false;
                        m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    }
                    bj4VarO.U(z);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i10 = IntercomTheme.$stable;
                    ox6 ox6Var112 = ox6Var2;
                    Integer num113 = num3;
                    mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                    bj4VarO = bj4VarO;
                    bj4VarO.K(-1239330006);
                    if (str3 == null) {
                        str4 = str3;
                    } else {
                        b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                        wja type0112 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                        str4 = str3;
                        mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type0112, bj4VarO, 0, 0, 130042);
                        bj4VarO = bj4VarO;
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(-1239320186);
                    if (ci4Var3 != null) {
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        ci4Var3.invoke(bj4VarO, 0);
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    num4 = num113;
                    ci4Var4 = ci4Var3;
                    str5 = str4;
                    ox6Var3 = ox6Var112;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: qf3
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return EmptyStateKt.EmptyState$lambda$4(str, ox6Var3, str5, num4, ci4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            num2 = num;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    ci4Var2 = ci4Var;
                    if (bj4VarO.j(ci4Var2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        str3 = null;
                    }
                    if (i6 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i8 != 0) {
                        ci4Var2 = null;
                    }
                    ox6 ox6VarH110 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                    aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH110);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(-1239346792);
                    if (num3 == null) {
                        z = false;
                        ci4Var3 = ci4Var2;
                    } else {
                        ci4Var3 = ci4Var2;
                        z = false;
                        m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    }
                    bj4VarO.U(z);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i10 = IntercomTheme.$stable;
                    ox6 ox6Var113 = ox6Var2;
                    Integer num114 = num3;
                    mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                    bj4VarO = bj4VarO;
                    bj4VarO.K(-1239330006);
                    if (str3 == null) {
                        str4 = str3;
                    } else {
                        b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                        wja type0113 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                        str4 = str3;
                        mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type0113, bj4VarO, 0, 0, 130042);
                        bj4VarO = bj4VarO;
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(-1239320186);
                    if (ci4Var3 != null) {
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        ci4Var3.invoke(bj4VarO, 0);
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    num4 = num114;
                    ci4Var4 = ci4Var3;
                    str5 = str4;
                    ox6Var3 = ox6Var113;
                } else {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        str3 = null;
                    }
                    if (i6 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i8 != 0) {
                        ci4Var2 = null;
                    }
                    ox6 ox6VarH111 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                    aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH111);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(-1239346792);
                    if (num3 == null) {
                        z = false;
                        ci4Var3 = ci4Var2;
                    } else {
                        ci4Var3 = ci4Var2;
                        z = false;
                        m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    }
                    bj4VarO.U(z);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i10 = IntercomTheme.$stable;
                    ox6 ox6Var114 = ox6Var2;
                    Integer num115 = num3;
                    mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                    bj4VarO = bj4VarO;
                    bj4VarO.K(-1239330006);
                    if (str3 == null) {
                        str4 = str3;
                    } else {
                        b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                        wja type0114 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                        str4 = str3;
                        mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type0114, bj4VarO, 0, 0, 130042);
                        bj4VarO = bj4VarO;
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(-1239320186);
                    if (ci4Var3 != null) {
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        ci4Var3.invoke(bj4VarO, 0);
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    num4 = num115;
                    ci4Var4 = ci4Var3;
                    str5 = str4;
                    ox6Var3 = ox6Var114;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: qf3
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return EmptyStateKt.EmptyState$lambda$4(str, ox6Var3, str5, num4, ci4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            ci4Var2 = ci4Var;
            if ((i3 & 9363) == 9362) {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    str3 = null;
                }
                if (i6 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i8 != 0) {
                    ci4Var2 = null;
                }
                ox6 ox6VarH112 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH112);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-1239346792);
                if (num3 == null) {
                    z = false;
                    ci4Var3 = ci4Var2;
                } else {
                    ci4Var3 = ci4Var2;
                    z = false;
                    m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                }
                bj4VarO.U(z);
                intercomTheme = IntercomTheme.INSTANCE;
                i10 = IntercomTheme.$stable;
                ox6 ox6Var115 = ox6Var2;
                Integer num116 = num3;
                mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                bj4VarO = bj4VarO;
                bj4VarO.K(-1239330006);
                if (str3 == null) {
                    str4 = str3;
                } else {
                    b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                    wja type0115 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                    str4 = str3;
                    mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type0115, bj4VarO, 0, 0, 130042);
                    bj4VarO = bj4VarO;
                }
                bj4VarO.U(false);
                bj4VarO.K(-1239320186);
                if (ci4Var3 != null) {
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    ci4Var3.invoke(bj4VarO, 0);
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                num4 = num116;
                ci4Var4 = ci4Var3;
                str5 = str4;
                ox6Var3 = ox6Var115;
            } else {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    str3 = null;
                }
                if (i6 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i8 != 0) {
                    ci4Var2 = null;
                }
                ox6 ox6VarH113 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH113);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-1239346792);
                if (num3 == null) {
                    z = false;
                    ci4Var3 = ci4Var2;
                } else {
                    ci4Var3 = ci4Var2;
                    z = false;
                    m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                }
                bj4VarO.U(z);
                intercomTheme = IntercomTheme.INSTANCE;
                i10 = IntercomTheme.$stable;
                ox6 ox6Var116 = ox6Var2;
                Integer num117 = num3;
                mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                bj4VarO = bj4VarO;
                bj4VarO.K(-1239330006);
                if (str3 == null) {
                    str4 = str3;
                } else {
                    b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                    wja type0116 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                    str4 = str3;
                    mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type0116, bj4VarO, 0, 0, 130042);
                    bj4VarO = bj4VarO;
                }
                bj4VarO.U(false);
                bj4VarO.K(-1239320186);
                if (ci4Var3 != null) {
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    ci4Var3.invoke(bj4VarO, 0);
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                num4 = num117;
                ci4Var4 = ci4Var3;
                str5 = str4;
                ox6Var3 = ox6Var116;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: qf3
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return EmptyStateKt.EmptyState$lambda$4(str, ox6Var3, str5, num4, ci4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        str3 = str2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                num2 = num;
                if (bj4VarO.J(num2)) {
                    i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    ci4Var2 = ci4Var;
                    if (bj4VarO.j(ci4Var2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        str3 = null;
                    }
                    if (i6 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i8 != 0) {
                        ci4Var2 = null;
                    }
                    ox6 ox6VarH114 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                    aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH114);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(-1239346792);
                    if (num3 == null) {
                        z = false;
                        ci4Var3 = ci4Var2;
                    } else {
                        ci4Var3 = ci4Var2;
                        z = false;
                        m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    }
                    bj4VarO.U(z);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i10 = IntercomTheme.$stable;
                    ox6 ox6Var117 = ox6Var2;
                    Integer num118 = num3;
                    mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                    bj4VarO = bj4VarO;
                    bj4VarO.K(-1239330006);
                    if (str3 == null) {
                        str4 = str3;
                    } else {
                        b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                        wja type0117 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                        str4 = str3;
                        mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type0117, bj4VarO, 0, 0, 130042);
                        bj4VarO = bj4VarO;
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(-1239320186);
                    if (ci4Var3 != null) {
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        ci4Var3.invoke(bj4VarO, 0);
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    num4 = num118;
                    ci4Var4 = ci4Var3;
                    str5 = str4;
                    ox6Var3 = ox6Var117;
                } else {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        str3 = null;
                    }
                    if (i6 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i8 != 0) {
                        ci4Var2 = null;
                    }
                    ox6 ox6VarH115 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                    aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH115);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(-1239346792);
                    if (num3 == null) {
                        z = false;
                        ci4Var3 = ci4Var2;
                    } else {
                        ci4Var3 = ci4Var2;
                        z = false;
                        m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    }
                    bj4VarO.U(z);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i10 = IntercomTheme.$stable;
                    ox6 ox6Var118 = ox6Var2;
                    Integer num119 = num3;
                    mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                    bj4VarO = bj4VarO;
                    bj4VarO.K(-1239330006);
                    if (str3 == null) {
                        str4 = str3;
                    } else {
                        b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                        wja type0118 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                        str4 = str3;
                        mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type0118, bj4VarO, 0, 0, 130042);
                        bj4VarO = bj4VarO;
                    }
                    bj4VarO.U(false);
                    bj4VarO.K(-1239320186);
                    if (ci4Var3 != null) {
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        ci4Var3.invoke(bj4VarO, 0);
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    num4 = num119;
                    ci4Var4 = ci4Var3;
                    str5 = str4;
                    ox6Var3 = ox6Var118;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: qf3
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return EmptyStateKt.EmptyState$lambda$4(str, ox6Var3, str5, num4, ci4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            ci4Var2 = ci4Var;
            if ((i3 & 9363) == 9362) {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    str3 = null;
                }
                if (i6 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i8 != 0) {
                    ci4Var2 = null;
                }
                ox6 ox6VarH116 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH116);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-1239346792);
                if (num3 == null) {
                    z = false;
                    ci4Var3 = ci4Var2;
                } else {
                    ci4Var3 = ci4Var2;
                    z = false;
                    m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                }
                bj4VarO.U(z);
                intercomTheme = IntercomTheme.INSTANCE;
                i10 = IntercomTheme.$stable;
                ox6 ox6Var119 = ox6Var2;
                Integer num1110 = num3;
                mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                bj4VarO = bj4VarO;
                bj4VarO.K(-1239330006);
                if (str3 == null) {
                    str4 = str3;
                } else {
                    b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                    wja type0119 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                    str4 = str3;
                    mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type0119, bj4VarO, 0, 0, 130042);
                    bj4VarO = bj4VarO;
                }
                bj4VarO.U(false);
                bj4VarO.K(-1239320186);
                if (ci4Var3 != null) {
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    ci4Var3.invoke(bj4VarO, 0);
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                num4 = num1110;
                ci4Var4 = ci4Var3;
                str5 = str4;
                ox6Var3 = ox6Var119;
            } else {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    str3 = null;
                }
                if (i6 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i8 != 0) {
                    ci4Var2 = null;
                }
                ox6 ox6VarH117 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH117);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-1239346792);
                if (num3 == null) {
                    z = false;
                    ci4Var3 = ci4Var2;
                } else {
                    ci4Var3 = ci4Var2;
                    z = false;
                    m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                }
                bj4VarO.U(z);
                intercomTheme = IntercomTheme.INSTANCE;
                i10 = IntercomTheme.$stable;
                ox6 ox6Var1110 = ox6Var2;
                Integer num1111 = num3;
                mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                bj4VarO = bj4VarO;
                bj4VarO.K(-1239330006);
                if (str3 == null) {
                    str4 = str3;
                } else {
                    b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                    wja type01110 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                    str4 = str3;
                    mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type01110, bj4VarO, 0, 0, 130042);
                    bj4VarO = bj4VarO;
                }
                bj4VarO.U(false);
                bj4VarO.K(-1239320186);
                if (ci4Var3 != null) {
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    ci4Var3.invoke(bj4VarO, 0);
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                num4 = num1111;
                ci4Var4 = ci4Var3;
                str5 = str4;
                ox6Var3 = ox6Var1110;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: qf3
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return EmptyStateKt.EmptyState$lambda$4(str, ox6Var3, str5, num4, ci4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        num2 = num;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                ci4Var2 = ci4Var;
                if (bj4VarO.j(ci4Var2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) == 9362) {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    str3 = null;
                }
                if (i6 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i8 != 0) {
                    ci4Var2 = null;
                }
                ox6 ox6VarH118 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH118);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-1239346792);
                if (num3 == null) {
                    z = false;
                    ci4Var3 = ci4Var2;
                } else {
                    ci4Var3 = ci4Var2;
                    z = false;
                    m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                }
                bj4VarO.U(z);
                intercomTheme = IntercomTheme.INSTANCE;
                i10 = IntercomTheme.$stable;
                ox6 ox6Var1111 = ox6Var2;
                Integer num1112 = num3;
                mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                bj4VarO = bj4VarO;
                bj4VarO.K(-1239330006);
                if (str3 == null) {
                    str4 = str3;
                } else {
                    b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                    wja type01111 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                    str4 = str3;
                    mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type01111, bj4VarO, 0, 0, 130042);
                    bj4VarO = bj4VarO;
                }
                bj4VarO.U(false);
                bj4VarO.K(-1239320186);
                if (ci4Var3 != null) {
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    ci4Var3.invoke(bj4VarO, 0);
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                num4 = num1112;
                ci4Var4 = ci4Var3;
                str5 = str4;
                ox6Var3 = ox6Var1111;
            } else {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    str3 = null;
                }
                if (i6 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i8 != 0) {
                    ci4Var2 = null;
                }
                ox6 ox6VarH119 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
                aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH119);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-1239346792);
                if (num3 == null) {
                    z = false;
                    ci4Var3 = ci4Var2;
                } else {
                    ci4Var3 = ci4Var2;
                    z = false;
                    m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                }
                bj4VarO.U(z);
                intercomTheme = IntercomTheme.INSTANCE;
                i10 = IntercomTheme.$stable;
                ox6 ox6Var1112 = ox6Var2;
                Integer num1113 = num3;
                mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
                bj4VarO = bj4VarO;
                bj4VarO.K(-1239330006);
                if (str3 == null) {
                    str4 = str3;
                } else {
                    b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                    wja type01112 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                    str4 = str3;
                    mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type01112, bj4VarO, 0, 0, 130042);
                    bj4VarO = bj4VarO;
                }
                bj4VarO.U(false);
                bj4VarO.K(-1239320186);
                if (ci4Var3 != null) {
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    ci4Var3.invoke(bj4VarO, 0);
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                num4 = num1113;
                ci4Var4 = ci4Var3;
                str5 = str4;
                ox6Var3 = ox6Var1112;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: qf3
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return EmptyStateKt.EmptyState$lambda$4(str, ox6Var3, str5, num4, ci4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        ci4Var2 = ci4Var;
        if ((i3 & 9363) == 9362) {
            aVar = ox6.a.t;
            if (i11 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                str3 = null;
            }
            if (i6 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i8 != 0) {
                ci4Var2 = null;
            }
            ox6 ox6VarH1110 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
            aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarH1110);
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(-1239346792);
            if (num3 == null) {
                z = false;
                ci4Var3 = ci4Var2;
            } else {
                ci4Var3 = ci4Var2;
                z = false;
                m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
            }
            bj4VarO.U(z);
            intercomTheme = IntercomTheme.INSTANCE;
            i10 = IntercomTheme.$stable;
            ox6 ox6Var1113 = ox6Var2;
            Integer num1114 = num3;
            mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
            bj4VarO = bj4VarO;
            bj4VarO.K(-1239330006);
            if (str3 == null) {
                str4 = str3;
            } else {
                b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                wja type01113 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                str4 = str3;
                mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type01113, bj4VarO, 0, 0, 130042);
                bj4VarO = bj4VarO;
            }
            bj4VarO.U(false);
            bj4VarO.K(-1239320186);
            if (ci4Var3 != null) {
                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                ci4Var3.invoke(bj4VarO, 0);
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            num4 = num1114;
            ci4Var4 = ci4Var3;
            str5 = str4;
            ox6Var3 = ox6Var1113;
        } else {
            aVar = ox6.a.t;
            if (i11 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                str3 = null;
            }
            if (i6 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i8 != 0) {
                ci4Var2 = null;
            }
            ox6 ox6VarH1111 = eo7.i(ox6Var2, 24.0f).H(ir9.c);
            aj1VarA = yi1.a(c30.d, di.a.n, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarH1111);
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(-1239346792);
            if (num3 == null) {
                z = false;
                ci4Var3 = ci4Var2;
            } else {
                ci4Var3 = ci4Var2;
                z = false;
                m65.b(is7.a(num3.intValue(), bj4VarO, 0), null, ir9.j(aVar, 32.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getIcon().m806getDefault0d7_KjU(), bj4VarO, 440, 0);
                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
            }
            bj4VarO.U(z);
            intercomTheme = IntercomTheme.INSTANCE;
            i10 = IntercomTheme.$stable;
            ox6 ox6Var1114 = ox6Var2;
            Integer num1115 = num3;
            mia.b(str, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i10).getType03(), bj4VarO, i3 & 14, 0, 130042);
            bj4VarO = bj4VarO;
            bj4VarO.K(-1239330006);
            if (str3 == null) {
                str4 = str3;
            } else {
                b47.b(bj4VarO, ir9.d(aVar, 6.0f));
                wja type01114 = intercomTheme.getTypography(bj4VarO, i10).getType04();
                str4 = str3;
                mia.b(str4, null, gh5.a(intercomTheme, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, type01114, bj4VarO, 0, 0, 130042);
                bj4VarO = bj4VarO;
            }
            bj4VarO.U(false);
            bj4VarO.K(-1239320186);
            if (ci4Var3 != null) {
                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                ci4Var3.invoke(bj4VarO, 0);
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            num4 = num1115;
            ci4Var4 = ci4Var3;
            str5 = str4;
            ox6Var3 = ox6Var1114;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: qf3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return EmptyStateKt.EmptyState$lambda$4(str, ox6Var3, str5, num4, ci4Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EmptyState$lambda$4(String str, ox6 ox6Var, String str2, Integer num, ci4 ci4Var, int i, int i2, jt1 jt1Var, int i3) {
        EmptyState(str, ox6Var, str2, num, ci4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void EmptyStatePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1885515198);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$EmptyStateKt.INSTANCE.m41getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ab2(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EmptyStatePreview$lambda$5(int i, jt1 jt1Var, int i2) {
        EmptyStatePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void EmptyStateWithOutlinedButtonPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-484307592);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$EmptyStateKt.INSTANCE.m44getLambda6$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ya2(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EmptyStateWithOutlinedButtonPreview$lambda$6(int i, jt1 jt1Var, int i2) {
        EmptyStateWithOutlinedButtonPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
