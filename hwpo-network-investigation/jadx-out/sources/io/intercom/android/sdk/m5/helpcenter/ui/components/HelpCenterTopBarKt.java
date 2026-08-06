package io.intercom.android.sdk.m5.helpcenter.ui.components;

import defpackage.bj4;
import defpackage.ci4;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h65;
import defpackage.is7;
import defpackage.jt1;
import defpackage.m65;
import defpackage.mh4;
import defpackage.nr1;
import defpackage.oy8;
import defpackage.xj8;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterTopBarKt {
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void HelpCenterTopBar(final mh4<g2b> mh4Var, final mh4<g2b> mh4Var2, int i, StringProvider stringProvider, jt1 jt1Var, final int i2, final int i3) {
        mh4<g2b> mh4Var3;
        int i4;
        int i5;
        bj4 bj4Var;
        final StringProvider stringProvider2;
        final int i6;
        int i7;
        StringProvider stringRes = stringProvider;
        mh4Var.getClass();
        mh4Var2.getClass();
        bj4 bj4VarO = jt1Var.o(644687815);
        int i8 = 2;
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            mh4Var3 = mh4Var;
        } else {
            mh4Var3 = mh4Var;
            if ((i2 & 6) == 0) {
                i4 = (bj4VarO.j(mh4Var3) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= bj4VarO.j(mh4Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                i5 = i;
                int i9 = bj4VarO.h(i5) ? 256 : 128;
                i4 |= i9;
            } else {
                i5 = i;
            }
            i4 |= i9;
        } else {
            i5 = i;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) != 0) {
                i7 = 1024;
            } else {
                if ((i2 & 4096) == 0 ? bj4VarO.J(stringRes) : bj4VarO.j(stringRes)) {
                    i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i7 = 1024;
                }
            }
            i4 |= i7;
        }
        if ((i4 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
            stringProvider2 = stringRes;
            bj4Var = bj4VarO;
            i6 = i5;
        } else {
            bj4VarO.v0();
            if ((i2 & 1) == 0 || bj4VarO.c0()) {
                if ((i3 & 4) != 0) {
                    i5 = R.drawable.intercom_ic_back;
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    stringRes = new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_get_help, null, i8, 0 == true ? 1 : 0);
                    i4 &= -7169;
                }
            } else {
                bj4VarO.u();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
            }
            int i10 = i4;
            StringProvider stringProvider3 = stringRes;
            int i11 = i5;
            bj4VarO.V();
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            long jM767getHeader0d7_KjU = intercomTheme.getColors(bj4VarO, i12).m767getHeader0d7_KjU();
            final long jM771getOnHeader0d7_KjU = intercomTheme.getColors(bj4VarO, i12).m771getOnHeader0d7_KjU();
            bj4Var = bj4VarO;
            TopActionBarKt.m90TopActionBarNpQZenA(null, stringProvider3.getText(bj4VarO, StringProvider.$stable | ((i10 >> 9) & 14)), null, null, null, mh4Var3, Integer.valueOf(i11), false, jM767getHeader0d7_KjU, jM771getOnHeader0d7_KjU, 0L, null, gr1.b(736282477, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt.HelpCenterTopBar.1
                public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i13) {
                    oy8Var.getClass();
                    if ((i13 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    mh4<g2b> mh4Var4 = mh4Var2;
                    final long j = jM771getOnHeader0d7_KjU;
                    h65.b(1572864, 62, jt1Var2, mh4Var4, gr1.b(1957925771, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt.HelpCenterTopBar.1.1
                        public final void invoke(jt1 jt1Var3, int i14) {
                            if ((i14 & 3) == 2 && jt1Var3.r()) {
                                jt1Var3.u();
                            } else {
                                m65.b(is7.a(io.intercom.android.sdk.R.drawable.intercom_gif_search_icon, jt1Var3, 0), nr1.f(jt1Var3, io.intercom.android.sdk.R.string.intercom_search_help_articles), null, j, jt1Var3, 8, 4);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                            invoke(jt1Var3, num.intValue());
                            return g2b.a;
                        }
                    }, jt1Var2), null, null, null, false);
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                    invoke(oy8Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4Var, ((i10 << 15) & 458752) | ((i10 << 12) & 3670016), 384, 3229);
            stringProvider2 = stringProvider3;
            i6 = i11;
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: zv4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterTopBarKt.HelpCenterTopBar$lambda$0(mh4Var, mh4Var2, i6, stringProvider2, i2, i3, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterTopBar$lambda$0(mh4 mh4Var, mh4 mh4Var2, int i, StringProvider stringProvider, int i2, int i3, jt1 jt1Var, int i4) {
        HelpCenterTopBar(mh4Var, mh4Var2, i, stringProvider, jt1Var, gz3.s(i2 | 1), i3);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void HelpCenterTopBarPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-536592516);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterTopBarKt.INSTANCE.m321getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: aw4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterTopBarKt.HelpCenterTopBarPreview$lambda$1(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HelpCenterTopBarPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        HelpCenterTopBarPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
