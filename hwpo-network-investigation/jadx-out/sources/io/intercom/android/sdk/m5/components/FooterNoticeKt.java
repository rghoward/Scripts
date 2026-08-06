package io.intercom.android.sdk.m5.components;

import defpackage.ac4;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cka;
import defpackage.di;
import defpackage.dv;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j37;
import defpackage.jt1;
import defpackage.jv;
import defpackage.kg0;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.mg0;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qu1;
import defpackage.rd7;
import defpackage.tb4;
import defpackage.tx2;
import defpackage.v5a;
import defpackage.vaa;
import defpackage.wb4;
import defpackage.xj8;
import defpackage.yb4;
import defpackage.yi1;
import io.intercom.android.sdk.m5.components.FooterNoticeKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.common.TransitionsKt;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FooterNoticeKt {
    private static final float HandoverPillBottomPadding = 10.0f;

    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0158  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void ExpandedFooterNotice(ox6 ox6Var, final String str, final String str2, final List<AvatarWrapper> list, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        String str3;
        int i4;
        ox6.a aVar;
        aj1 aj1VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        int i5;
        final ox6 ox6Var3;
        xj8 xj8VarW;
        str.getClass();
        str2.getClass();
        list.getClass();
        bj4 bj4VarO = jt1Var.o(-1076553086);
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
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(str) ? 32 : 16;
        }
        if ((i2 & 4) == 0) {
            if ((i & 384) == 0) {
                str3 = str2;
                i3 |= bj4VarO.J(str3) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (bj4VarO.j(list)) {
                    i4 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i6 != 0) {
                    ox6Var2 = aVar;
                }
                aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                int i7 = (i3 >> 3) & 14;
                i5 = i3 >> 6;
                FooterTitle(str, list, bj4VarO, i7 | (i5 & 112));
                bj4VarO.K(2043466324);
                if (str3.length() > 0) {
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i8 = IntercomTheme.$stable;
                    mia.b(str2, null, ac4.b(intercomTheme, bj4VarO, i8), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i8).getType04Point5(), bj4VarO, i5 & 14, 0, 130042);
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
            } else {
                bj4VarO.u();
            }
            ox6Var3 = ox6Var2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: xb4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return FooterNoticeKt.ExpandedFooterNotice$lambda$6(ox6Var3, str, str2, list, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        str3 = str2;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (bj4VarO.j(list)) {
                i4 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) == 1170) {
            aVar = ox6.a.t;
            if (i6 != 0) {
                ox6Var2 = aVar;
            }
            aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
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
            int i9 = (i3 >> 3) & 14;
            i5 = i3 >> 6;
            FooterTitle(str, list, bj4VarO, i9 | (i5 & 112));
            bj4VarO.K(2043466324);
            if (str3.length() > 0) {
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                int i10 = IntercomTheme.$stable;
                mia.b(str2, null, ac4.b(intercomTheme2, bj4VarO, i10), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(bj4VarO, i10).getType04Point5(), bj4VarO, i5 & 14, 0, 130042);
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
        } else {
            aVar = ox6.a.t;
            if (i6 != 0) {
                ox6Var2 = aVar;
            }
            aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
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
            int i11 = (i3 >> 3) & 14;
            i5 = i3 >> 6;
            FooterTitle(str, list, bj4VarO, i11 | (i5 & 112));
            bj4VarO.K(2043466324);
            if (str3.length() > 0) {
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                int i12 = IntercomTheme.$stable;
                mia.b(str2, null, ac4.b(intercomTheme3, bj4VarO, i12), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(bj4VarO, i12).getType04Point5(), bj4VarO, i5 & 14, 0, 130042);
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
        }
        ox6Var3 = ox6Var2;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: xb4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FooterNoticeKt.ExpandedFooterNotice$lambda$6(ox6Var3, str, str2, list, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ExpandedFooterNotice$lambda$6(ox6 ox6Var, String str, String str2, List list, int i, int i2, jt1 jt1Var, int i3) {
        ExpandedFooterNotice(ox6Var, str, str2, list, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void ExpandedFooterNoticePreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1644521079);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m45getLambda1$intercom_sdk_base_release(), bj4VarO, 12582912, 127);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: zb4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FooterNoticeKt.ExpandedFooterNoticePreview$lambda$10(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ExpandedFooterNoticePreview$lambda$10(int i, jt1 jt1Var, int i2) {
        ExpandedFooterNoticePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void ExpandedFooterNoticePreviewMultipleAvatars(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(419901737);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m46getLambda2$intercom_sdk_base_release(), bj4VarO, 12582912, 127);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new kg0(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ExpandedFooterNoticePreviewMultipleAvatars$lambda$11(int i, jt1 jt1Var, int i2) {
        ExpandedFooterNoticePreviewMultipleAvatars(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void ExpandedTitleOnlyFooterNoticePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-385296499);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m47getLambda3$intercom_sdk_base_release(), bj4VarO, 12582912, 127);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new wb4(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ExpandedTitleOnlyFooterNoticePreview$lambda$12(int i, jt1 jt1Var, int i2) {
        ExpandedTitleOnlyFooterNoticePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void FooterNoticePill(ox6 ox6Var, final String str, final List<AvatarWrapper> list, final mh4<g2b> mh4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        str.getClass();
        list.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(2116373339);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
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
            i3 |= bj4VarO.j(list) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i3 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6Var);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(-2063426416);
            Object objF = bj4VarO.f();
            Object obj = objF;
            if (objF == jt1.a.a) {
                j37 j37Var = new j37(Boolean.FALSE);
                j37Var.u(Boolean.TRUE);
                bj4VarO.C(j37Var);
                obj = j37Var;
            }
            bj4VarO.U(false);
            dv.b((j37) obj, null, TransitionsKt.floatingButtonEnterTransition((int) ((tx2) bj4VarO.F(qu1.h)).U0(HandoverPillBottomPadding)), null, null, gr1.b(-1063955783, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt$FooterNoticePill$1$1
                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var2, Integer num) {
                    invoke(jvVar, jt1Var2, num.intValue());
                    return g2b.a;
                }

                public final void invoke(jv jvVar, jt1 jt1Var2, int i5) {
                    jvVar.getClass();
                    FooterNoticeKt.FooterNoticePillWithoutAnimation(str, list, mh4Var, jt1Var2, 0);
                }
            }, bj4VarO), bj4VarO, 196608, 26);
            bj4VarO.U(true);
        }
        final ox6 ox6Var2 = ox6Var;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ub4
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return FooterNoticeKt.FooterNoticePill$lambda$4(ox6Var2, str, list, mh4Var, i, i2, (jt1) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FooterNoticePill$lambda$4(ox6 ox6Var, String str, List list, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        FooterNoticePill(ox6Var, str, list, mh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void FooterNoticePillMultipleAvatarsPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(961872365);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m49getLambda5$intercom_sdk_base_release(), bj4VarO, 12582912, 127);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new mg0(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FooterNoticePillMultipleAvatarsPreview$lambda$14(int i, jt1 jt1Var, int i2) {
        FooterNoticePillMultipleAvatarsPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void FooterNoticePillPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(615648759);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            v5a.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$FooterNoticeKt.INSTANCE.m48getLambda4$intercom_sdk_base_release(), bj4VarO, 12582912, 127);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new tb4(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FooterNoticePillPreview$lambda$13(int i, jt1 jt1Var, int i2) {
        FooterNoticePillPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FooterNoticePillWithoutAnimation(final String str, final List<AvatarWrapper> list, final mh4<g2b> mh4Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-2078164816);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomCardKt.IntercomCard(mh4Var, eo7.i(ox6.a.t, HandoverPillBottomPadding), false, IntercomCardStyle.INSTANCE.m578defaultStyleqUnfpCA(IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).e, 0L, 0L, 0.0f, null, 0L, bj4VarO, IntercomCardStyle.$stable << 18, 62), null, gr1.b(-1065463783, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.FooterNoticeKt.FooterNoticePillWithoutAnimation.1
                public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i3) {
                    bj1Var.getClass();
                    if ((i3 & 17) == 16 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    ox6 ox6VarJ = eo7.j(10.0f, 12.0f, ox6.a.t);
                    String str2 = str;
                    List<AvatarWrapper> list2 = list;
                    fl6 fl6VarD = dv0.d(di.a.a, false);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC = it1.c(jt1Var2, ox6VarJ);
                    bt1.c.getClass();
                    qr5.a aVar = bt1.a.b;
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar);
                    } else {
                        jt1Var2.z();
                    }
                    rd7.d(jt1Var2, bt1.a.f, fl6VarD);
                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(jt1Var2, bt1.a.h);
                    rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                    FooterNoticeKt.FooterTitle(str2, list2, jt1Var2, 0);
                    jt1Var2.I();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                    invoke(bj1Var, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, ((i2 >> 6) & 14) | 196656 | (IntercomCardStyle.Style.$stable << 9), 20);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: vb4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FooterNoticeKt.FooterNoticePillWithoutAnimation$lambda$7(str, list, mh4Var, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FooterNoticePillWithoutAnimation$lambda$7(String str, List list, mh4 mh4Var, int i, jt1 jt1Var, int i2) {
        FooterNoticePillWithoutAnimation(str, list, mh4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FooterTitle(String str, List<AvatarWrapper> list, jt1 jt1Var, int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-973759395);
        if ((i & 6) == 0) {
            i2 = i | (bj4VarO.J(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(list) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ny8 ny8VarA = ly8.a(c30.d, di.a.k, bj4VarO, 54);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = it1.c(bj4VarO, aVar);
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(1829795499);
            if (!list.isEmpty()) {
                AvatarGroupKt.m19AvatarGroupJ8mCjc(list, null, 16.0f, cka.b(10), bj4VarO, ((i3 >> 3) & 14) | 3456, 2);
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
            }
            bj4VarO.U(false);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i4 = IntercomTheme.$stable;
            mia.b(str, null, ac4.b(intercomTheme, bj4VarO, i4), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i4).getType04Point5(), bj4VarO, i3 & 14, 0, 130042);
            bj4VarO = bj4VarO;
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new yb4(i, 0, str, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FooterTitle$lambda$9(String str, List list, int i, jt1 jt1Var, int i2) {
        FooterTitle(str, list, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final float getHandoverPillBottomPadding() {
        return HandoverPillBottomPadding;
    }
}
