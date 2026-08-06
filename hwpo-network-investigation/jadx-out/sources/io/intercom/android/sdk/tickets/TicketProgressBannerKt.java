package io.intercom.android.sdk.tickets;

import defpackage.aj1;
import defpackage.al8;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.g3;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h27;
import defpackage.i27;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.it6;
import defpackage.jt1;
import defpackage.jv;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nb1;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.we1;
import defpackage.wja;
import defpackage.xj8;
import defpackage.xv;
import defpackage.yi1;
import defpackage.zg3;
import defpackage.zg5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.tickets.TicketProgressBannerKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketProgressBannerKt {
    /* JADX WARN: Code duplicated, block: B:51:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void TicketProgressBanner(final String str, final mh4<g2b> mh4Var, final boolean z, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        boolean z2;
        ox6 ox6Var2;
        final ox6 ox6Var3;
        xj8 xj8VarW;
        str.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-108721483);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 384) == 0) {
                i3 |= bj4VarO.c(z2) ? 256 : 128;
            }
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                if (i4 != 0) {
                    ox6Var2 = ox6.a.t;
                }
                int i5 = i3 >> 6;
                dv.d(z2, ox6Var2, zg3.c(xv.c(1000, 1000, null, 4), 2), zg3.d(xv.c(1000, 0, null, 6), 2), null, gr1.b(417589981, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.TicketProgressBannerKt.TicketProgressBanner.1
                    public final void invoke(jv jvVar, jt1 jt1Var2, int i6) {
                        jvVar.getClass();
                        ox6.a aVar = ox6.a.t;
                        ox6 ox6VarP = ir9.p(ir9.c(aVar, 1.0f));
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i7 = IntercomTheme.$stable;
                        ox6 ox6VarC = gi0.c(ox6VarP, zg5.a(intercomTheme, jt1Var2, i7), al8.a);
                        jt1Var2.K(669306726);
                        Object objF = jt1Var2.f();
                        if (objF == jt1.a.a) {
                            objF = new i27();
                            jt1Var2.C(objF);
                        }
                        jt1Var2.B();
                        ox6 ox6VarB = we1.b(ox6VarC, (h27) objF, null, false, null, mh4Var, 28);
                        String str2 = str;
                        aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var2, 0);
                        int iHashCode = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC2 = it1.c(jt1Var2, ox6VarB);
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
                        bt1.a.c cVar = bt1.a.f;
                        rd7.d(jt1Var2, cVar, aj1VarA);
                        bt1.a.e eVar = bt1.a.e;
                        rd7.d(jt1Var2, eVar, kw7VarY);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        bt1.a.b bVar = bt1.a.g;
                        rd7.d(jt1Var2, bVar, numValueOf);
                        bt1.a.C0034a c0034a = bt1.a.h;
                        rd7.c(jt1Var2, c0034a);
                        bt1.a.d dVar = bt1.a.d;
                        rd7.d(jt1Var2, dVar, ox6VarC2);
                        b47.b(jt1Var2, ir9.d(aVar, 12.0f));
                        ox6 ox6VarK = eo7.k(ir9.p(ir9.c(aVar, 1.0f)), 16.0f, 0.0f, 2);
                        ny8 ny8VarA = ly8.a(c30.d, di.a.k, jt1Var2, 54);
                        int iHashCode2 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY2 = jt1Var2.y();
                        ox6 ox6VarC3 = it1.c(jt1Var2, ox6VarK);
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
                        rd7.d(jt1Var2, cVar, ny8VarA);
                        rd7.d(jt1Var2, eVar, kw7VarY2);
                        g3.c(iHashCode2, jt1Var2, bVar, jt1Var2, c0034a);
                        rd7.d(jt1Var2, dVar, ox6VarC3);
                        m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, null, intercomTheme.getColors(jt1Var2, i7).m752getActionContrastWhite0d7_KjU(), jt1Var2, 56, 4);
                        b47.b(jt1Var2, ir9.n(aVar, 8.0f));
                        mia.b(str2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var2, i7).getType04Point5(), intercomTheme.getColors(jt1Var2, i7).m752getActionContrastWhite0d7_KjU(), 0L, ob4.A, null, 0L, 0L, null, null, 16777210), jt1Var2, 0, 24960, 110590);
                        jt1Var2.I();
                        b47.b(jt1Var2, ir9.d(aVar, 12.0f));
                        IntercomDividerKt.IntercomDivider(null, jt1Var2, 0, 1);
                        jt1Var2.I();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var2, Integer num) {
                        invoke(jvVar, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, (i5 & 14) | 200064 | (i5 & 112), 16);
            } else {
                bj4VarO.u();
            }
            ox6Var3 = ox6Var2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: dma
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketProgressBannerKt.TicketProgressBanner$lambda$0(str, mh4Var, z, ox6Var3, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        ox6Var2 = ox6Var;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
                ox6Var2 = ox6.a.t;
            }
            int i6 = i3 >> 6;
            dv.d(z2, ox6Var2, zg3.c(xv.c(1000, 1000, null, 4), 2), zg3.d(xv.c(1000, 0, null, 6), 2), null, gr1.b(417589981, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.TicketProgressBannerKt.TicketProgressBanner.1
                public final void invoke(jv jvVar, jt1 jt1Var2, int i7) {
                    jvVar.getClass();
                    ox6.a aVar = ox6.a.t;
                    ox6 ox6VarP = ir9.p(ir9.c(aVar, 1.0f));
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i8 = IntercomTheme.$stable;
                    ox6 ox6VarC = gi0.c(ox6VarP, zg5.a(intercomTheme, jt1Var2, i8), al8.a);
                    jt1Var2.K(669306726);
                    Object objF = jt1Var2.f();
                    if (objF == jt1.a.a) {
                        objF = new i27();
                        jt1Var2.C(objF);
                    }
                    jt1Var2.B();
                    ox6 ox6VarB = we1.b(ox6VarC, (h27) objF, null, false, null, mh4Var, 28);
                    String str2 = str;
                    aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var2, 0);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC2 = it1.c(jt1Var2, ox6VarB);
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
                    bt1.a.c cVar = bt1.a.f;
                    rd7.d(jt1Var2, cVar, aj1VarA);
                    bt1.a.e eVar = bt1.a.e;
                    rd7.d(jt1Var2, eVar, kw7VarY);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    bt1.a.b bVar = bt1.a.g;
                    rd7.d(jt1Var2, bVar, numValueOf);
                    bt1.a.C0034a c0034a = bt1.a.h;
                    rd7.c(jt1Var2, c0034a);
                    bt1.a.d dVar = bt1.a.d;
                    rd7.d(jt1Var2, dVar, ox6VarC2);
                    b47.b(jt1Var2, ir9.d(aVar, 12.0f));
                    ox6 ox6VarK = eo7.k(ir9.p(ir9.c(aVar, 1.0f)), 16.0f, 0.0f, 2);
                    ny8 ny8VarA = ly8.a(c30.d, di.a.k, jt1Var2, 54);
                    int iHashCode2 = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY2 = jt1Var2.y();
                    ox6 ox6VarC3 = it1.c(jt1Var2, ox6VarK);
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
                    rd7.d(jt1Var2, cVar, ny8VarA);
                    rd7.d(jt1Var2, eVar, kw7VarY2);
                    g3.c(iHashCode2, jt1Var2, bVar, jt1Var2, c0034a);
                    rd7.d(jt1Var2, dVar, ox6VarC3);
                    m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, null, intercomTheme.getColors(jt1Var2, i8).m752getActionContrastWhite0d7_KjU(), jt1Var2, 56, 4);
                    b47.b(jt1Var2, ir9.n(aVar, 8.0f));
                    mia.b(str2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var2, i8).getType04Point5(), intercomTheme.getColors(jt1Var2, i8).m752getActionContrastWhite0d7_KjU(), 0L, ob4.A, null, 0L, 0L, null, null, 16777210), jt1Var2, 0, 24960, 110590);
                    jt1Var2.I();
                    b47.b(jt1Var2, ir9.d(aVar, 12.0f));
                    IntercomDividerKt.IntercomDivider(null, jt1Var2, 0, 1);
                    jt1Var2.I();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var2, Integer num) {
                    invoke(jvVar, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, (i6 & 14) | 200064 | (i6 & 112), 16);
        } else {
            if (i4 != 0) {
                ox6Var2 = ox6.a.t;
            }
            int i7 = i3 >> 6;
            dv.d(z2, ox6Var2, zg3.c(xv.c(1000, 1000, null, 4), 2), zg3.d(xv.c(1000, 0, null, 6), 2), null, gr1.b(417589981, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.TicketProgressBannerKt.TicketProgressBanner.1
                public final void invoke(jv jvVar, jt1 jt1Var2, int i8) {
                    jvVar.getClass();
                    ox6.a aVar = ox6.a.t;
                    ox6 ox6VarP = ir9.p(ir9.c(aVar, 1.0f));
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i9 = IntercomTheme.$stable;
                    ox6 ox6VarC = gi0.c(ox6VarP, zg5.a(intercomTheme, jt1Var2, i9), al8.a);
                    jt1Var2.K(669306726);
                    Object objF = jt1Var2.f();
                    if (objF == jt1.a.a) {
                        objF = new i27();
                        jt1Var2.C(objF);
                    }
                    jt1Var2.B();
                    ox6 ox6VarB = we1.b(ox6VarC, (h27) objF, null, false, null, mh4Var, 28);
                    String str2 = str;
                    aj1 aj1VarA = yi1.a(c30.c, di.a.m, jt1Var2, 0);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC2 = it1.c(jt1Var2, ox6VarB);
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
                    bt1.a.c cVar = bt1.a.f;
                    rd7.d(jt1Var2, cVar, aj1VarA);
                    bt1.a.e eVar = bt1.a.e;
                    rd7.d(jt1Var2, eVar, kw7VarY);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    bt1.a.b bVar = bt1.a.g;
                    rd7.d(jt1Var2, bVar, numValueOf);
                    bt1.a.C0034a c0034a = bt1.a.h;
                    rd7.c(jt1Var2, c0034a);
                    bt1.a.d dVar = bt1.a.d;
                    rd7.d(jt1Var2, dVar, ox6VarC2);
                    b47.b(jt1Var2, ir9.d(aVar, 12.0f));
                    ox6 ox6VarK = eo7.k(ir9.p(ir9.c(aVar, 1.0f)), 16.0f, 0.0f, 2);
                    ny8 ny8VarA = ly8.a(c30.d, di.a.k, jt1Var2, 54);
                    int iHashCode2 = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY2 = jt1Var2.y();
                    ox6 ox6VarC3 = it1.c(jt1Var2, ox6VarK);
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
                    rd7.d(jt1Var2, cVar, ny8VarA);
                    rd7.d(jt1Var2, eVar, kw7VarY2);
                    g3.c(iHashCode2, jt1Var2, bVar, jt1Var2, c0034a);
                    rd7.d(jt1Var2, dVar, ox6VarC3);
                    m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var2, 0), null, null, intercomTheme.getColors(jt1Var2, i9).m752getActionContrastWhite0d7_KjU(), jt1Var2, 56, 4);
                    b47.b(jt1Var2, ir9.n(aVar, 8.0f));
                    mia.b(str2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var2, i9).getType04Point5(), intercomTheme.getColors(jt1Var2, i9).m752getActionContrastWhite0d7_KjU(), 0L, ob4.A, null, 0L, 0L, null, null, 16777210), jt1Var2, 0, 24960, 110590);
                    jt1Var2.I();
                    b47.b(jt1Var2, ir9.d(aVar, 12.0f));
                    IntercomDividerKt.IntercomDivider(null, jt1Var2, 0, 1);
                    jt1Var2.I();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var2, Integer num) {
                    invoke(jvVar, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, (i7 & 14) | 200064 | (i7 & 112), 16);
        }
        ox6Var3 = ox6Var2;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: dma
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketProgressBannerKt.TicketProgressBanner$lambda$0(str, mh4Var, z, ox6Var3, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketProgressBanner$lambda$0(String str, mh4 mh4Var, boolean z, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        TicketProgressBanner(str, mh4Var, z, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void TicketProgressRowLongTextPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-384429412);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketProgressBannerKt.INSTANCE.m519getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new it6(i, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketProgressRowLongTextPreview$lambda$2(int i, jt1 jt1Var, int i2) {
        TicketProgressRowLongTextPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TicketProgressRowPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-433396877);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketProgressBannerKt.INSTANCE.m518getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new nb1(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketProgressRowPreview$lambda$1(int i, jt1 jt1Var, int i2) {
        TicketProgressRowPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
