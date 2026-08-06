package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c15;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.g3;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.jv;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.uh3;
import defpackage.vaa;
import defpackage.vp0;
import defpackage.wp0;
import defpackage.xj8;
import defpackage.xp0;
import defpackage.xv;
import defpackage.xya;
import defpackage.yi1;
import defpackage.zg3;
import defpackage.zp0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketProgressIndicatorKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BigTicketCardKt {
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x00be  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final void BigTicketCard(final TicketDetailState.TicketDetailContentState ticketDetailContentState, final mh4<g2b> mh4Var, final boolean z, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        ox6 ox6Var2;
        int i5;
        ox6 ox6Var3;
        Object objF;
        jt1.a.C0187a c0187a;
        Object objF2;
        final ox6 ox6Var4;
        xj8 xj8VarW;
        ticketDetailContentState.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(1861461937);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(ticketDetailContentState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i2 & 4) == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= bj4VarO.c(z2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    ox6Var2 = ox6Var;
                    if (bj4VarO.J(ox6Var2)) {
                        i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                    if (i4 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    final Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    uh3 uh3VarA = zg3.a(xv.c(1000, 0, null, 6), 12);
                    xya xyaVarC = xv.c(1000, 500, null, 4);
                    bj4VarO.K(-90870824);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = new wp0();
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    uh3 uh3VarB = uh3VarA.b(zg3.i(xyaVarC, (oh4) objF)).b(zg3.c(xv.c(1000, 500, null, 4), 2));
                    xya xyaVarC2 = xv.c(1000, 0, null, 6);
                    bj4VarO.K(-90860840);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new xp0();
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    int i6 = i3 >> 6;
                    dv.d(z2, ox6Var3, uh3VarB, zg3.k(xyaVarC2, (oh4) objF2).b(zg3.d(xv.c(1000, 0, null, 6), 2)).b(zg3.g(xv.c(1000, 500, null, 4), 12)), null, gr1.b(-915811879, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt.BigTicketCard.3
                        public final void invoke(jv jvVar, jt1 jt1Var2, int i7) {
                            jvVar.getClass();
                            mh4<g2b> mh4Var2 = mh4Var;
                            final TicketDetailState.TicketDetailContentState ticketDetailContentState2 = ticketDetailContentState;
                            final Context context2 = context;
                            aj1 aj1VarA = yi1.a(c30.c, di.a.n, jt1Var2, 48);
                            int iHashCode = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6.a aVar = ox6.a.t;
                            ox6 ox6VarC = it1.c(jt1Var2, aVar);
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
                            rd7.d(jt1Var2, bt1.a.f, aj1VarA);
                            rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                            rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                            rd7.c(jt1Var2, bt1.a.h);
                            rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                            mia.b(nr1.f(jt1Var2, R.string.intercom_your_ticket), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                            IntercomCardKt.IntercomCard(mh4Var2, eo7.j(14.0f, 12.0f, aVar), false, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, jt1Var2, IntercomCardStyle.$stable << 15, 31), null, gr1.b(-1554241908, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt$BigTicketCard$3$1$1
                                public final void invoke(bj1 bj1Var, jt1 jt1Var3, int i8) {
                                    String str;
                                    bj1Var.getClass();
                                    if ((i8 & 17) == 16 && jt1Var3.r()) {
                                        jt1Var3.u();
                                        return;
                                    }
                                    TicketDetailState.TicketDetailContentState ticketDetailContentState3 = ticketDetailContentState2;
                                    Context context3 = context2;
                                    sp0.a aVar3 = di.a.m;
                                    c30.k kVar = c30.c;
                                    aj1 aj1VarA2 = yi1.a(kVar, aVar3, jt1Var3, 0);
                                    int iHashCode2 = Long.hashCode(jt1Var3.v());
                                    kw7 kw7VarY2 = jt1Var3.y();
                                    ox6.a aVar4 = ox6.a.t;
                                    ox6 ox6VarC2 = it1.c(jt1Var3, aVar4);
                                    bt1.c.getClass();
                                    qr5.a aVar5 = bt1.a.b;
                                    if (jt1Var3.s() == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    jt1Var3.q();
                                    if (jt1Var3.l()) {
                                        jt1Var3.k(aVar5);
                                    } else {
                                        jt1Var3.z();
                                    }
                                    bt1.a.c cVar = bt1.a.f;
                                    rd7.d(jt1Var3, cVar, aj1VarA2);
                                    bt1.a.e eVar = bt1.a.e;
                                    rd7.d(jt1Var3, eVar, kw7VarY2);
                                    Integer numValueOf = Integer.valueOf(iHashCode2);
                                    bt1.a.b bVar = bt1.a.g;
                                    rd7.d(jt1Var3, bVar, numValueOf);
                                    bt1.a.C0034a c0034a = bt1.a.h;
                                    rd7.c(jt1Var3, c0034a);
                                    bt1.a.d dVar = bt1.a.d;
                                    rd7.d(jt1Var3, dVar, ox6VarC2);
                                    ox6 ox6VarI = eo7.i(aVar4, 12.0f);
                                    sp0.a aVar6 = di.a.n;
                                    aj1 aj1VarA3 = yi1.a(kVar, aVar6, jt1Var3, 48);
                                    int iHashCode3 = Long.hashCode(jt1Var3.v());
                                    kw7 kw7VarY3 = jt1Var3.y();
                                    ox6 ox6VarC3 = it1.c(jt1Var3, ox6VarI);
                                    if (jt1Var3.s() == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    jt1Var3.q();
                                    if (jt1Var3.l()) {
                                        jt1Var3.k(aVar5);
                                    } else {
                                        jt1Var3.z();
                                    }
                                    rd7.d(jt1Var3, cVar, aj1VarA3);
                                    rd7.d(jt1Var3, eVar, kw7VarY3);
                                    g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                                    rd7.d(jt1Var3, dVar, ox6VarC3);
                                    b47.b(jt1Var3, ir9.d(aVar4, 4.0f));
                                    String ticketName = ticketDetailContentState3.getTicketName();
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    int i9 = IntercomTheme.$stable;
                                    mia.b(ticketName, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i9).getType04SemiBold(), jt1Var3, 0, 0, 131070);
                                    ticketDetailContentState3.getTicketTimelineCardState().getStatusLabel();
                                    g2b g2bVar = g2b.a;
                                    b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                                    String statusLabel = ticketDetailContentState3.getTicketTimelineCardState().getStatusLabel();
                                    Long timestamp = ticketDetailContentState3.getTicketTimelineCardState().getTimestamp();
                                    if (timestamp == null || (str = TimeFormatterExtKt.formattedDateFromLong(timestamp.longValue(), context3)) == null) {
                                        str = BuildConfig.FLAVOR;
                                    }
                                    TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(statusLabel, str, null, null, intercomTheme.getTypography(jt1Var3, i9).getType04SemiBold(), ticketDetailContentState3.getTicketTimelineCardState().m531getProgressColor0d7_KjU(), 0, 0, new vaa(3), jt1Var3, 0, 204);
                                    b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                                    mia.b(ticketDetailContentState3.getTicketTimelineCardState().getStatusTitle(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i9).getType04(), jt1Var3, 0, 0, 131070);
                                    b47.b(jt1Var3, ir9.d(aVar4, 16.0f));
                                    TicketProgressIndicatorKt.m526TicketProgressIndicator3IgeMak(ticketDetailContentState3.getTicketTimelineCardState().getProgressSections(), ticketDetailContentState3.getTicketTimelineCardState().m531getProgressColor0d7_KjU(), null, jt1Var3, 0, 4);
                                    b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                                    jt1Var3.I();
                                    IntercomDividerKt.IntercomDivider(eo7.k(aVar4, 12.0f, 0.0f, 2), jt1Var3, 6, 0);
                                    ox6 ox6VarK = eo7.k(new c15(aVar6), 0.0f, 14.0f, 1);
                                    ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var3, 48);
                                    int iHashCode4 = Long.hashCode(jt1Var3.v());
                                    kw7 kw7VarY4 = jt1Var3.y();
                                    ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarK);
                                    if (jt1Var3.s() == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    jt1Var3.q();
                                    if (jt1Var3.l()) {
                                        jt1Var3.k(aVar5);
                                    } else {
                                        jt1Var3.z();
                                    }
                                    rd7.d(jt1Var3, cVar, ny8VarA);
                                    rd7.d(jt1Var3, eVar, kw7VarY4);
                                    g3.c(iHashCode4, jt1Var3, bVar, jt1Var3, c0034a);
                                    rd7.d(jt1Var3, dVar, ox6VarC4);
                                    m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var3, 0), null, eo7.m(aVar4, 0.0f, 0.0f, 8.0f, 0.0f, 11), ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(jt1Var3, i9).m751getAction0d7_KjU()), jt1Var3, 440, 0);
                                    mia.b(nr1.f(jt1Var3, R.string.intercom_tickets_view_ticket), null, ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(jt1Var3, i9).m751getAction0d7_KjU()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i9).getType04SemiBold(), jt1Var3, 0, 0, 131066);
                                    jt1Var3.I();
                                    jt1Var3.I();
                                }

                                @Override // defpackage.ei4
                                public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var3, Integer num) {
                                    invoke(bj1Var, jt1Var3, num.intValue());
                                    return g2b.a;
                                }
                            }, jt1Var2), jt1Var2, (IntercomCardStyle.Style.$stable << 9) | 196656, 20);
                            jt1Var2.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var2, Integer num) {
                            invoke(jvVar, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, (i6 & 14) | 196992 | (i6 & 112), 16);
                    ox6Var4 = ox6Var3;
                } else {
                    bj4VarO.u();
                    ox6Var4 = ox6Var2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: yp0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return BigTicketCardKt.BigTicketCard$lambda$4(ticketDetailContentState, mh4Var, z, ox6Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            ox6Var2 = ox6Var;
            if ((i3 & 1171) == 1170) {
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                final Context context2 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                uh3 uh3VarA2 = zg3.a(xv.c(1000, 0, null, 6), 12);
                xya xyaVarC3 = xv.c(1000, 500, null, 4);
                bj4VarO.K(-90870824);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = new wp0();
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                uh3 uh3VarB2 = uh3VarA2.b(zg3.i(xyaVarC3, (oh4) objF)).b(zg3.c(xv.c(1000, 500, null, 4), 2));
                xya xyaVarC4 = xv.c(1000, 0, null, 6);
                bj4VarO.K(-90860840);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new xp0();
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                int i7 = i3 >> 6;
                dv.d(z2, ox6Var3, uh3VarB2, zg3.k(xyaVarC4, (oh4) objF2).b(zg3.d(xv.c(1000, 0, null, 6), 2)).b(zg3.g(xv.c(1000, 500, null, 4), 12)), null, gr1.b(-915811879, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt.BigTicketCard.3
                    public final void invoke(jv jvVar, jt1 jt1Var2, int i8) {
                        jvVar.getClass();
                        mh4<g2b> mh4Var2 = mh4Var;
                        final TicketDetailState.TicketDetailContentState ticketDetailContentState2 = ticketDetailContentState;
                        final Context context3 = context2;
                        aj1 aj1VarA = yi1.a(c30.c, di.a.n, jt1Var2, 48);
                        int iHashCode = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6.a aVar = ox6.a.t;
                        ox6 ox6VarC = it1.c(jt1Var2, aVar);
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
                        rd7.d(jt1Var2, bt1.a.f, aj1VarA);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                        mia.b(nr1.f(jt1Var2, R.string.intercom_your_ticket), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                        IntercomCardKt.IntercomCard(mh4Var2, eo7.j(14.0f, 12.0f, aVar), false, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, jt1Var2, IntercomCardStyle.$stable << 15, 31), null, gr1.b(-1554241908, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt$BigTicketCard$3$1$1
                            public final void invoke(bj1 bj1Var, jt1 jt1Var3, int i9) {
                                String str;
                                bj1Var.getClass();
                                if ((i9 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                TicketDetailState.TicketDetailContentState ticketDetailContentState3 = ticketDetailContentState2;
                                Context context4 = context3;
                                sp0.a aVar3 = di.a.m;
                                c30.k kVar = c30.c;
                                aj1 aj1VarA2 = yi1.a(kVar, aVar3, jt1Var3, 0);
                                int iHashCode2 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY2 = jt1Var3.y();
                                ox6.a aVar4 = ox6.a.t;
                                ox6 ox6VarC2 = it1.c(jt1Var3, aVar4);
                                bt1.c.getClass();
                                qr5.a aVar5 = bt1.a.b;
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar5);
                                } else {
                                    jt1Var3.z();
                                }
                                bt1.a.c cVar = bt1.a.f;
                                rd7.d(jt1Var3, cVar, aj1VarA2);
                                bt1.a.e eVar = bt1.a.e;
                                rd7.d(jt1Var3, eVar, kw7VarY2);
                                Integer numValueOf = Integer.valueOf(iHashCode2);
                                bt1.a.b bVar = bt1.a.g;
                                rd7.d(jt1Var3, bVar, numValueOf);
                                bt1.a.C0034a c0034a = bt1.a.h;
                                rd7.c(jt1Var3, c0034a);
                                bt1.a.d dVar = bt1.a.d;
                                rd7.d(jt1Var3, dVar, ox6VarC2);
                                ox6 ox6VarI = eo7.i(aVar4, 12.0f);
                                sp0.a aVar6 = di.a.n;
                                aj1 aj1VarA3 = yi1.a(kVar, aVar6, jt1Var3, 48);
                                int iHashCode3 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY3 = jt1Var3.y();
                                ox6 ox6VarC3 = it1.c(jt1Var3, ox6VarI);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar5);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, aj1VarA3);
                                rd7.d(jt1Var3, eVar, kw7VarY3);
                                g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC3);
                                b47.b(jt1Var3, ir9.d(aVar4, 4.0f));
                                String ticketName = ticketDetailContentState3.getTicketName();
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i10 = IntercomTheme.$stable;
                                mia.b(ticketName, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i10).getType04SemiBold(), jt1Var3, 0, 0, 131070);
                                ticketDetailContentState3.getTicketTimelineCardState().getStatusLabel();
                                g2b g2bVar = g2b.a;
                                b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                                String statusLabel = ticketDetailContentState3.getTicketTimelineCardState().getStatusLabel();
                                Long timestamp = ticketDetailContentState3.getTicketTimelineCardState().getTimestamp();
                                if (timestamp == null || (str = TimeFormatterExtKt.formattedDateFromLong(timestamp.longValue(), context4)) == null) {
                                    str = BuildConfig.FLAVOR;
                                }
                                TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(statusLabel, str, null, null, intercomTheme.getTypography(jt1Var3, i10).getType04SemiBold(), ticketDetailContentState3.getTicketTimelineCardState().m531getProgressColor0d7_KjU(), 0, 0, new vaa(3), jt1Var3, 0, 204);
                                b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                                mia.b(ticketDetailContentState3.getTicketTimelineCardState().getStatusTitle(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i10).getType04(), jt1Var3, 0, 0, 131070);
                                b47.b(jt1Var3, ir9.d(aVar4, 16.0f));
                                TicketProgressIndicatorKt.m526TicketProgressIndicator3IgeMak(ticketDetailContentState3.getTicketTimelineCardState().getProgressSections(), ticketDetailContentState3.getTicketTimelineCardState().m531getProgressColor0d7_KjU(), null, jt1Var3, 0, 4);
                                b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                                jt1Var3.I();
                                IntercomDividerKt.IntercomDivider(eo7.k(aVar4, 12.0f, 0.0f, 2), jt1Var3, 6, 0);
                                ox6 ox6VarK = eo7.k(new c15(aVar6), 0.0f, 14.0f, 1);
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var3, 48);
                                int iHashCode4 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY4 = jt1Var3.y();
                                ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarK);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar5);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, ny8VarA);
                                rd7.d(jt1Var3, eVar, kw7VarY4);
                                g3.c(iHashCode4, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC4);
                                m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var3, 0), null, eo7.m(aVar4, 0.0f, 0.0f, 8.0f, 0.0f, 11), ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(jt1Var3, i10).m751getAction0d7_KjU()), jt1Var3, 440, 0);
                                mia.b(nr1.f(jt1Var3, R.string.intercom_tickets_view_ticket), null, ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(jt1Var3, i10).m751getAction0d7_KjU()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i10).getType04SemiBold(), jt1Var3, 0, 0, 131066);
                                jt1Var3.I();
                                jt1Var3.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var3, Integer num) {
                                invoke(bj1Var, jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, (IntercomCardStyle.Style.$stable << 9) | 196656, 20);
                        jt1Var2.I();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var2, Integer num) {
                        invoke(jvVar, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, (i7 & 14) | 196992 | (i7 & 112), 16);
                ox6Var4 = ox6Var3;
            } else {
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                final Context context3 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                uh3 uh3VarA3 = zg3.a(xv.c(1000, 0, null, 6), 12);
                xya xyaVarC5 = xv.c(1000, 500, null, 4);
                bj4VarO.K(-90870824);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = new wp0();
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                uh3 uh3VarB3 = uh3VarA3.b(zg3.i(xyaVarC5, (oh4) objF)).b(zg3.c(xv.c(1000, 500, null, 4), 2));
                xya xyaVarC6 = xv.c(1000, 0, null, 6);
                bj4VarO.K(-90860840);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new xp0();
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                int i8 = i3 >> 6;
                dv.d(z2, ox6Var3, uh3VarB3, zg3.k(xyaVarC6, (oh4) objF2).b(zg3.d(xv.c(1000, 0, null, 6), 2)).b(zg3.g(xv.c(1000, 500, null, 4), 12)), null, gr1.b(-915811879, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt.BigTicketCard.3
                    public final void invoke(jv jvVar, jt1 jt1Var2, int i9) {
                        jvVar.getClass();
                        mh4<g2b> mh4Var2 = mh4Var;
                        final TicketDetailState.TicketDetailContentState ticketDetailContentState2 = ticketDetailContentState;
                        final Context context4 = context3;
                        aj1 aj1VarA = yi1.a(c30.c, di.a.n, jt1Var2, 48);
                        int iHashCode = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6.a aVar = ox6.a.t;
                        ox6 ox6VarC = it1.c(jt1Var2, aVar);
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
                        rd7.d(jt1Var2, bt1.a.f, aj1VarA);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                        mia.b(nr1.f(jt1Var2, R.string.intercom_your_ticket), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                        IntercomCardKt.IntercomCard(mh4Var2, eo7.j(14.0f, 12.0f, aVar), false, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, jt1Var2, IntercomCardStyle.$stable << 15, 31), null, gr1.b(-1554241908, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt$BigTicketCard$3$1$1
                            public final void invoke(bj1 bj1Var, jt1 jt1Var3, int i10) {
                                String str;
                                bj1Var.getClass();
                                if ((i10 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                TicketDetailState.TicketDetailContentState ticketDetailContentState3 = ticketDetailContentState2;
                                Context context5 = context4;
                                sp0.a aVar3 = di.a.m;
                                c30.k kVar = c30.c;
                                aj1 aj1VarA2 = yi1.a(kVar, aVar3, jt1Var3, 0);
                                int iHashCode2 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY2 = jt1Var3.y();
                                ox6.a aVar4 = ox6.a.t;
                                ox6 ox6VarC2 = it1.c(jt1Var3, aVar4);
                                bt1.c.getClass();
                                qr5.a aVar5 = bt1.a.b;
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar5);
                                } else {
                                    jt1Var3.z();
                                }
                                bt1.a.c cVar = bt1.a.f;
                                rd7.d(jt1Var3, cVar, aj1VarA2);
                                bt1.a.e eVar = bt1.a.e;
                                rd7.d(jt1Var3, eVar, kw7VarY2);
                                Integer numValueOf = Integer.valueOf(iHashCode2);
                                bt1.a.b bVar = bt1.a.g;
                                rd7.d(jt1Var3, bVar, numValueOf);
                                bt1.a.C0034a c0034a = bt1.a.h;
                                rd7.c(jt1Var3, c0034a);
                                bt1.a.d dVar = bt1.a.d;
                                rd7.d(jt1Var3, dVar, ox6VarC2);
                                ox6 ox6VarI = eo7.i(aVar4, 12.0f);
                                sp0.a aVar6 = di.a.n;
                                aj1 aj1VarA3 = yi1.a(kVar, aVar6, jt1Var3, 48);
                                int iHashCode3 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY3 = jt1Var3.y();
                                ox6 ox6VarC3 = it1.c(jt1Var3, ox6VarI);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar5);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, aj1VarA3);
                                rd7.d(jt1Var3, eVar, kw7VarY3);
                                g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC3);
                                b47.b(jt1Var3, ir9.d(aVar4, 4.0f));
                                String ticketName = ticketDetailContentState3.getTicketName();
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i11 = IntercomTheme.$stable;
                                mia.b(ticketName, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i11).getType04SemiBold(), jt1Var3, 0, 0, 131070);
                                ticketDetailContentState3.getTicketTimelineCardState().getStatusLabel();
                                g2b g2bVar = g2b.a;
                                b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                                String statusLabel = ticketDetailContentState3.getTicketTimelineCardState().getStatusLabel();
                                Long timestamp = ticketDetailContentState3.getTicketTimelineCardState().getTimestamp();
                                if (timestamp == null || (str = TimeFormatterExtKt.formattedDateFromLong(timestamp.longValue(), context5)) == null) {
                                    str = BuildConfig.FLAVOR;
                                }
                                TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(statusLabel, str, null, null, intercomTheme.getTypography(jt1Var3, i11).getType04SemiBold(), ticketDetailContentState3.getTicketTimelineCardState().m531getProgressColor0d7_KjU(), 0, 0, new vaa(3), jt1Var3, 0, 204);
                                b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                                mia.b(ticketDetailContentState3.getTicketTimelineCardState().getStatusTitle(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i11).getType04(), jt1Var3, 0, 0, 131070);
                                b47.b(jt1Var3, ir9.d(aVar4, 16.0f));
                                TicketProgressIndicatorKt.m526TicketProgressIndicator3IgeMak(ticketDetailContentState3.getTicketTimelineCardState().getProgressSections(), ticketDetailContentState3.getTicketTimelineCardState().m531getProgressColor0d7_KjU(), null, jt1Var3, 0, 4);
                                b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                                jt1Var3.I();
                                IntercomDividerKt.IntercomDivider(eo7.k(aVar4, 12.0f, 0.0f, 2), jt1Var3, 6, 0);
                                ox6 ox6VarK = eo7.k(new c15(aVar6), 0.0f, 14.0f, 1);
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var3, 48);
                                int iHashCode4 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY4 = jt1Var3.y();
                                ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarK);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar5);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, ny8VarA);
                                rd7.d(jt1Var3, eVar, kw7VarY4);
                                g3.c(iHashCode4, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC4);
                                m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var3, 0), null, eo7.m(aVar4, 0.0f, 0.0f, 8.0f, 0.0f, 11), ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(jt1Var3, i11).m751getAction0d7_KjU()), jt1Var3, 440, 0);
                                mia.b(nr1.f(jt1Var3, R.string.intercom_tickets_view_ticket), null, ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(jt1Var3, i11).m751getAction0d7_KjU()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i11).getType04SemiBold(), jt1Var3, 0, 0, 131066);
                                jt1Var3.I();
                                jt1Var3.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var3, Integer num) {
                                invoke(bj1Var, jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, (IntercomCardStyle.Style.$stable << 9) | 196656, 20);
                        jt1Var2.I();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var2, Integer num) {
                        invoke(jvVar, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, (i8 & 14) | 196992 | (i8 & 112), 16);
                ox6Var4 = ox6Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: yp0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return BigTicketCardKt.BigTicketCard$lambda$4(ticketDetailContentState, mh4Var, z, ox6Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                ox6Var2 = ox6Var;
                if (bj4VarO.J(ox6Var2)) {
                    i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 1171) == 1170) {
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                final Context context4 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                uh3 uh3VarA4 = zg3.a(xv.c(1000, 0, null, 6), 12);
                xya xyaVarC7 = xv.c(1000, 500, null, 4);
                bj4VarO.K(-90870824);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = new wp0();
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                uh3 uh3VarB4 = uh3VarA4.b(zg3.i(xyaVarC7, (oh4) objF)).b(zg3.c(xv.c(1000, 500, null, 4), 2));
                xya xyaVarC8 = xv.c(1000, 0, null, 6);
                bj4VarO.K(-90860840);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new xp0();
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                int i9 = i3 >> 6;
                dv.d(z2, ox6Var3, uh3VarB4, zg3.k(xyaVarC8, (oh4) objF2).b(zg3.d(xv.c(1000, 0, null, 6), 2)).b(zg3.g(xv.c(1000, 500, null, 4), 12)), null, gr1.b(-915811879, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt.BigTicketCard.3
                    public final void invoke(jv jvVar, jt1 jt1Var2, int i10) {
                        jvVar.getClass();
                        mh4<g2b> mh4Var2 = mh4Var;
                        final TicketDetailState.TicketDetailContentState ticketDetailContentState2 = ticketDetailContentState;
                        final Context context5 = context4;
                        aj1 aj1VarA = yi1.a(c30.c, di.a.n, jt1Var2, 48);
                        int iHashCode = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6.a aVar = ox6.a.t;
                        ox6 ox6VarC = it1.c(jt1Var2, aVar);
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
                        rd7.d(jt1Var2, bt1.a.f, aj1VarA);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                        mia.b(nr1.f(jt1Var2, R.string.intercom_your_ticket), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                        IntercomCardKt.IntercomCard(mh4Var2, eo7.j(14.0f, 12.0f, aVar), false, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, jt1Var2, IntercomCardStyle.$stable << 15, 31), null, gr1.b(-1554241908, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt$BigTicketCard$3$1$1
                            public final void invoke(bj1 bj1Var, jt1 jt1Var3, int i11) {
                                String str;
                                bj1Var.getClass();
                                if ((i11 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                TicketDetailState.TicketDetailContentState ticketDetailContentState3 = ticketDetailContentState2;
                                Context context6 = context5;
                                sp0.a aVar3 = di.a.m;
                                c30.k kVar = c30.c;
                                aj1 aj1VarA2 = yi1.a(kVar, aVar3, jt1Var3, 0);
                                int iHashCode2 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY2 = jt1Var3.y();
                                ox6.a aVar4 = ox6.a.t;
                                ox6 ox6VarC2 = it1.c(jt1Var3, aVar4);
                                bt1.c.getClass();
                                qr5.a aVar5 = bt1.a.b;
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar5);
                                } else {
                                    jt1Var3.z();
                                }
                                bt1.a.c cVar = bt1.a.f;
                                rd7.d(jt1Var3, cVar, aj1VarA2);
                                bt1.a.e eVar = bt1.a.e;
                                rd7.d(jt1Var3, eVar, kw7VarY2);
                                Integer numValueOf = Integer.valueOf(iHashCode2);
                                bt1.a.b bVar = bt1.a.g;
                                rd7.d(jt1Var3, bVar, numValueOf);
                                bt1.a.C0034a c0034a = bt1.a.h;
                                rd7.c(jt1Var3, c0034a);
                                bt1.a.d dVar = bt1.a.d;
                                rd7.d(jt1Var3, dVar, ox6VarC2);
                                ox6 ox6VarI = eo7.i(aVar4, 12.0f);
                                sp0.a aVar6 = di.a.n;
                                aj1 aj1VarA3 = yi1.a(kVar, aVar6, jt1Var3, 48);
                                int iHashCode3 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY3 = jt1Var3.y();
                                ox6 ox6VarC3 = it1.c(jt1Var3, ox6VarI);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar5);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, aj1VarA3);
                                rd7.d(jt1Var3, eVar, kw7VarY3);
                                g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC3);
                                b47.b(jt1Var3, ir9.d(aVar4, 4.0f));
                                String ticketName = ticketDetailContentState3.getTicketName();
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i12 = IntercomTheme.$stable;
                                mia.b(ticketName, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i12).getType04SemiBold(), jt1Var3, 0, 0, 131070);
                                ticketDetailContentState3.getTicketTimelineCardState().getStatusLabel();
                                g2b g2bVar = g2b.a;
                                b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                                String statusLabel = ticketDetailContentState3.getTicketTimelineCardState().getStatusLabel();
                                Long timestamp = ticketDetailContentState3.getTicketTimelineCardState().getTimestamp();
                                if (timestamp == null || (str = TimeFormatterExtKt.formattedDateFromLong(timestamp.longValue(), context6)) == null) {
                                    str = BuildConfig.FLAVOR;
                                }
                                TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(statusLabel, str, null, null, intercomTheme.getTypography(jt1Var3, i12).getType04SemiBold(), ticketDetailContentState3.getTicketTimelineCardState().m531getProgressColor0d7_KjU(), 0, 0, new vaa(3), jt1Var3, 0, 204);
                                b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                                mia.b(ticketDetailContentState3.getTicketTimelineCardState().getStatusTitle(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i12).getType04(), jt1Var3, 0, 0, 131070);
                                b47.b(jt1Var3, ir9.d(aVar4, 16.0f));
                                TicketProgressIndicatorKt.m526TicketProgressIndicator3IgeMak(ticketDetailContentState3.getTicketTimelineCardState().getProgressSections(), ticketDetailContentState3.getTicketTimelineCardState().m531getProgressColor0d7_KjU(), null, jt1Var3, 0, 4);
                                b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                                jt1Var3.I();
                                IntercomDividerKt.IntercomDivider(eo7.k(aVar4, 12.0f, 0.0f, 2), jt1Var3, 6, 0);
                                ox6 ox6VarK = eo7.k(new c15(aVar6), 0.0f, 14.0f, 1);
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var3, 48);
                                int iHashCode4 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY4 = jt1Var3.y();
                                ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarK);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar5);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, ny8VarA);
                                rd7.d(jt1Var3, eVar, kw7VarY4);
                                g3.c(iHashCode4, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC4);
                                m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var3, 0), null, eo7.m(aVar4, 0.0f, 0.0f, 8.0f, 0.0f, 11), ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(jt1Var3, i12).m751getAction0d7_KjU()), jt1Var3, 440, 0);
                                mia.b(nr1.f(jt1Var3, R.string.intercom_tickets_view_ticket), null, ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(jt1Var3, i12).m751getAction0d7_KjU()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i12).getType04SemiBold(), jt1Var3, 0, 0, 131066);
                                jt1Var3.I();
                                jt1Var3.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var3, Integer num) {
                                invoke(bj1Var, jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, (IntercomCardStyle.Style.$stable << 9) | 196656, 20);
                        jt1Var2.I();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var2, Integer num) {
                        invoke(jvVar, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, (i9 & 14) | 196992 | (i9 & 112), 16);
                ox6Var4 = ox6Var3;
            } else {
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                final Context context5 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                uh3 uh3VarA5 = zg3.a(xv.c(1000, 0, null, 6), 12);
                xya xyaVarC9 = xv.c(1000, 500, null, 4);
                bj4VarO.K(-90870824);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = new wp0();
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                uh3 uh3VarB5 = uh3VarA5.b(zg3.i(xyaVarC9, (oh4) objF)).b(zg3.c(xv.c(1000, 500, null, 4), 2));
                xya xyaVarC10 = xv.c(1000, 0, null, 6);
                bj4VarO.K(-90860840);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new xp0();
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                int i10 = i3 >> 6;
                dv.d(z2, ox6Var3, uh3VarB5, zg3.k(xyaVarC10, (oh4) objF2).b(zg3.d(xv.c(1000, 0, null, 6), 2)).b(zg3.g(xv.c(1000, 500, null, 4), 12)), null, gr1.b(-915811879, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt.BigTicketCard.3
                    public final void invoke(jv jvVar, jt1 jt1Var2, int i11) {
                        jvVar.getClass();
                        mh4<g2b> mh4Var2 = mh4Var;
                        final TicketDetailState.TicketDetailContentState ticketDetailContentState2 = ticketDetailContentState;
                        final Context context6 = context5;
                        aj1 aj1VarA = yi1.a(c30.c, di.a.n, jt1Var2, 48);
                        int iHashCode = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6.a aVar = ox6.a.t;
                        ox6 ox6VarC = it1.c(jt1Var2, aVar);
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
                        rd7.d(jt1Var2, bt1.a.f, aj1VarA);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                        mia.b(nr1.f(jt1Var2, R.string.intercom_your_ticket), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                        IntercomCardKt.IntercomCard(mh4Var2, eo7.j(14.0f, 12.0f, aVar), false, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, jt1Var2, IntercomCardStyle.$stable << 15, 31), null, gr1.b(-1554241908, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt$BigTicketCard$3$1$1
                            public final void invoke(bj1 bj1Var, jt1 jt1Var3, int i12) {
                                String str;
                                bj1Var.getClass();
                                if ((i12 & 17) == 16 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                TicketDetailState.TicketDetailContentState ticketDetailContentState3 = ticketDetailContentState2;
                                Context context7 = context6;
                                sp0.a aVar3 = di.a.m;
                                c30.k kVar = c30.c;
                                aj1 aj1VarA2 = yi1.a(kVar, aVar3, jt1Var3, 0);
                                int iHashCode2 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY2 = jt1Var3.y();
                                ox6.a aVar4 = ox6.a.t;
                                ox6 ox6VarC2 = it1.c(jt1Var3, aVar4);
                                bt1.c.getClass();
                                qr5.a aVar5 = bt1.a.b;
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar5);
                                } else {
                                    jt1Var3.z();
                                }
                                bt1.a.c cVar = bt1.a.f;
                                rd7.d(jt1Var3, cVar, aj1VarA2);
                                bt1.a.e eVar = bt1.a.e;
                                rd7.d(jt1Var3, eVar, kw7VarY2);
                                Integer numValueOf = Integer.valueOf(iHashCode2);
                                bt1.a.b bVar = bt1.a.g;
                                rd7.d(jt1Var3, bVar, numValueOf);
                                bt1.a.C0034a c0034a = bt1.a.h;
                                rd7.c(jt1Var3, c0034a);
                                bt1.a.d dVar = bt1.a.d;
                                rd7.d(jt1Var3, dVar, ox6VarC2);
                                ox6 ox6VarI = eo7.i(aVar4, 12.0f);
                                sp0.a aVar6 = di.a.n;
                                aj1 aj1VarA3 = yi1.a(kVar, aVar6, jt1Var3, 48);
                                int iHashCode3 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY3 = jt1Var3.y();
                                ox6 ox6VarC3 = it1.c(jt1Var3, ox6VarI);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar5);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, aj1VarA3);
                                rd7.d(jt1Var3, eVar, kw7VarY3);
                                g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC3);
                                b47.b(jt1Var3, ir9.d(aVar4, 4.0f));
                                String ticketName = ticketDetailContentState3.getTicketName();
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i13 = IntercomTheme.$stable;
                                mia.b(ticketName, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i13).getType04SemiBold(), jt1Var3, 0, 0, 131070);
                                ticketDetailContentState3.getTicketTimelineCardState().getStatusLabel();
                                g2b g2bVar = g2b.a;
                                b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                                String statusLabel = ticketDetailContentState3.getTicketTimelineCardState().getStatusLabel();
                                Long timestamp = ticketDetailContentState3.getTicketTimelineCardState().getTimestamp();
                                if (timestamp == null || (str = TimeFormatterExtKt.formattedDateFromLong(timestamp.longValue(), context7)) == null) {
                                    str = BuildConfig.FLAVOR;
                                }
                                TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(statusLabel, str, null, null, intercomTheme.getTypography(jt1Var3, i13).getType04SemiBold(), ticketDetailContentState3.getTicketTimelineCardState().m531getProgressColor0d7_KjU(), 0, 0, new vaa(3), jt1Var3, 0, 204);
                                b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                                mia.b(ticketDetailContentState3.getTicketTimelineCardState().getStatusTitle(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i13).getType04(), jt1Var3, 0, 0, 131070);
                                b47.b(jt1Var3, ir9.d(aVar4, 16.0f));
                                TicketProgressIndicatorKt.m526TicketProgressIndicator3IgeMak(ticketDetailContentState3.getTicketTimelineCardState().getProgressSections(), ticketDetailContentState3.getTicketTimelineCardState().m531getProgressColor0d7_KjU(), null, jt1Var3, 0, 4);
                                b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                                jt1Var3.I();
                                IntercomDividerKt.IntercomDivider(eo7.k(aVar4, 12.0f, 0.0f, 2), jt1Var3, 6, 0);
                                ox6 ox6VarK = eo7.k(new c15(aVar6), 0.0f, 14.0f, 1);
                                ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var3, 48);
                                int iHashCode4 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY4 = jt1Var3.y();
                                ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarK);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar5);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, ny8VarA);
                                rd7.d(jt1Var3, eVar, kw7VarY4);
                                g3.c(iHashCode4, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC4);
                                m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var3, 0), null, eo7.m(aVar4, 0.0f, 0.0f, 8.0f, 0.0f, 11), ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(jt1Var3, i13).m751getAction0d7_KjU()), jt1Var3, 440, 0);
                                mia.b(nr1.f(jt1Var3, R.string.intercom_tickets_view_ticket), null, ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(jt1Var3, i13).m751getAction0d7_KjU()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i13).getType04SemiBold(), jt1Var3, 0, 0, 131066);
                                jt1Var3.I();
                                jt1Var3.I();
                            }

                            @Override // defpackage.ei4
                            public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var3, Integer num) {
                                invoke(bj1Var, jt1Var3, num.intValue());
                                return g2b.a;
                            }
                        }, jt1Var2), jt1Var2, (IntercomCardStyle.Style.$stable << 9) | 196656, 20);
                        jt1Var2.I();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var2, Integer num) {
                        invoke(jvVar, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, (i10 & 14) | 196992 | (i10 & 112), 16);
                ox6Var4 = ox6Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: yp0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return BigTicketCardKt.BigTicketCard$lambda$4(ticketDetailContentState, mh4Var, z, ox6Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        ox6Var2 = ox6Var;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            final Context context6 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            uh3 uh3VarA6 = zg3.a(xv.c(1000, 0, null, 6), 12);
            xya xyaVarC11 = xv.c(1000, 500, null, 4);
            bj4VarO.K(-90870824);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = new wp0();
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            uh3 uh3VarB6 = uh3VarA6.b(zg3.i(xyaVarC11, (oh4) objF)).b(zg3.c(xv.c(1000, 500, null, 4), 2));
            xya xyaVarC12 = xv.c(1000, 0, null, 6);
            bj4VarO.K(-90860840);
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = new xp0();
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            int i11 = i3 >> 6;
            dv.d(z2, ox6Var3, uh3VarB6, zg3.k(xyaVarC12, (oh4) objF2).b(zg3.d(xv.c(1000, 0, null, 6), 2)).b(zg3.g(xv.c(1000, 500, null, 4), 12)), null, gr1.b(-915811879, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt.BigTicketCard.3
                public final void invoke(jv jvVar, jt1 jt1Var2, int i12) {
                    jvVar.getClass();
                    mh4<g2b> mh4Var2 = mh4Var;
                    final TicketDetailState.TicketDetailContentState ticketDetailContentState2 = ticketDetailContentState;
                    final Context context7 = context6;
                    aj1 aj1VarA = yi1.a(c30.c, di.a.n, jt1Var2, 48);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6.a aVar = ox6.a.t;
                    ox6 ox6VarC = it1.c(jt1Var2, aVar);
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
                    rd7.d(jt1Var2, bt1.a.f, aj1VarA);
                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(jt1Var2, bt1.a.h);
                    rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                    mia.b(nr1.f(jt1Var2, R.string.intercom_your_ticket), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                    IntercomCardKt.IntercomCard(mh4Var2, eo7.j(14.0f, 12.0f, aVar), false, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, jt1Var2, IntercomCardStyle.$stable << 15, 31), null, gr1.b(-1554241908, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt$BigTicketCard$3$1$1
                        public final void invoke(bj1 bj1Var, jt1 jt1Var3, int i13) {
                            String str;
                            bj1Var.getClass();
                            if ((i13 & 17) == 16 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            TicketDetailState.TicketDetailContentState ticketDetailContentState3 = ticketDetailContentState2;
                            Context context8 = context7;
                            sp0.a aVar3 = di.a.m;
                            c30.k kVar = c30.c;
                            aj1 aj1VarA2 = yi1.a(kVar, aVar3, jt1Var3, 0);
                            int iHashCode2 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY2 = jt1Var3.y();
                            ox6.a aVar4 = ox6.a.t;
                            ox6 ox6VarC2 = it1.c(jt1Var3, aVar4);
                            bt1.c.getClass();
                            qr5.a aVar5 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar5);
                            } else {
                                jt1Var3.z();
                            }
                            bt1.a.c cVar = bt1.a.f;
                            rd7.d(jt1Var3, cVar, aj1VarA2);
                            bt1.a.e eVar = bt1.a.e;
                            rd7.d(jt1Var3, eVar, kw7VarY2);
                            Integer numValueOf = Integer.valueOf(iHashCode2);
                            bt1.a.b bVar = bt1.a.g;
                            rd7.d(jt1Var3, bVar, numValueOf);
                            bt1.a.C0034a c0034a = bt1.a.h;
                            rd7.c(jt1Var3, c0034a);
                            bt1.a.d dVar = bt1.a.d;
                            rd7.d(jt1Var3, dVar, ox6VarC2);
                            ox6 ox6VarI = eo7.i(aVar4, 12.0f);
                            sp0.a aVar6 = di.a.n;
                            aj1 aj1VarA3 = yi1.a(kVar, aVar6, jt1Var3, 48);
                            int iHashCode3 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY3 = jt1Var3.y();
                            ox6 ox6VarC3 = it1.c(jt1Var3, ox6VarI);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar5);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar, aj1VarA3);
                            rd7.d(jt1Var3, eVar, kw7VarY3);
                            g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                            rd7.d(jt1Var3, dVar, ox6VarC3);
                            b47.b(jt1Var3, ir9.d(aVar4, 4.0f));
                            String ticketName = ticketDetailContentState3.getTicketName();
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i14 = IntercomTheme.$stable;
                            mia.b(ticketName, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i14).getType04SemiBold(), jt1Var3, 0, 0, 131070);
                            ticketDetailContentState3.getTicketTimelineCardState().getStatusLabel();
                            g2b g2bVar = g2b.a;
                            b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                            String statusLabel = ticketDetailContentState3.getTicketTimelineCardState().getStatusLabel();
                            Long timestamp = ticketDetailContentState3.getTicketTimelineCardState().getTimestamp();
                            if (timestamp == null || (str = TimeFormatterExtKt.formattedDateFromLong(timestamp.longValue(), context8)) == null) {
                                str = BuildConfig.FLAVOR;
                            }
                            TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(statusLabel, str, null, null, intercomTheme.getTypography(jt1Var3, i14).getType04SemiBold(), ticketDetailContentState3.getTicketTimelineCardState().m531getProgressColor0d7_KjU(), 0, 0, new vaa(3), jt1Var3, 0, 204);
                            b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                            mia.b(ticketDetailContentState3.getTicketTimelineCardState().getStatusTitle(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i14).getType04(), jt1Var3, 0, 0, 131070);
                            b47.b(jt1Var3, ir9.d(aVar4, 16.0f));
                            TicketProgressIndicatorKt.m526TicketProgressIndicator3IgeMak(ticketDetailContentState3.getTicketTimelineCardState().getProgressSections(), ticketDetailContentState3.getTicketTimelineCardState().m531getProgressColor0d7_KjU(), null, jt1Var3, 0, 4);
                            b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                            jt1Var3.I();
                            IntercomDividerKt.IntercomDivider(eo7.k(aVar4, 12.0f, 0.0f, 2), jt1Var3, 6, 0);
                            ox6 ox6VarK = eo7.k(new c15(aVar6), 0.0f, 14.0f, 1);
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var3, 48);
                            int iHashCode4 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY4 = jt1Var3.y();
                            ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarK);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar5);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar, ny8VarA);
                            rd7.d(jt1Var3, eVar, kw7VarY4);
                            g3.c(iHashCode4, jt1Var3, bVar, jt1Var3, c0034a);
                            rd7.d(jt1Var3, dVar, ox6VarC4);
                            m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var3, 0), null, eo7.m(aVar4, 0.0f, 0.0f, 8.0f, 0.0f, 11), ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(jt1Var3, i14).m751getAction0d7_KjU()), jt1Var3, 440, 0);
                            mia.b(nr1.f(jt1Var3, R.string.intercom_tickets_view_ticket), null, ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(jt1Var3, i14).m751getAction0d7_KjU()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i14).getType04SemiBold(), jt1Var3, 0, 0, 131066);
                            jt1Var3.I();
                            jt1Var3.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var3, Integer num) {
                            invoke(bj1Var, jt1Var3, num.intValue());
                            return g2b.a;
                        }
                    }, jt1Var2), jt1Var2, (IntercomCardStyle.Style.$stable << 9) | 196656, 20);
                    jt1Var2.I();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var2, Integer num) {
                    invoke(jvVar, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, (i11 & 14) | 196992 | (i11 & 112), 16);
            ox6Var4 = ox6Var3;
        } else {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            final Context context7 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            uh3 uh3VarA7 = zg3.a(xv.c(1000, 0, null, 6), 12);
            xya xyaVarC13 = xv.c(1000, 500, null, 4);
            bj4VarO.K(-90870824);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = new wp0();
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            uh3 uh3VarB7 = uh3VarA7.b(zg3.i(xyaVarC13, (oh4) objF)).b(zg3.c(xv.c(1000, 500, null, 4), 2));
            xya xyaVarC14 = xv.c(1000, 0, null, 6);
            bj4VarO.K(-90860840);
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = new xp0();
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            int i12 = i3 >> 6;
            dv.d(z2, ox6Var3, uh3VarB7, zg3.k(xyaVarC14, (oh4) objF2).b(zg3.d(xv.c(1000, 0, null, 6), 2)).b(zg3.g(xv.c(1000, 500, null, 4), 12)), null, gr1.b(-915811879, new ei4<jv, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt.BigTicketCard.3
                public final void invoke(jv jvVar, jt1 jt1Var2, int i13) {
                    jvVar.getClass();
                    mh4<g2b> mh4Var2 = mh4Var;
                    final TicketDetailState.TicketDetailContentState ticketDetailContentState2 = ticketDetailContentState;
                    final Context context8 = context7;
                    aj1 aj1VarA = yi1.a(c30.c, di.a.n, jt1Var2, 48);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6.a aVar = ox6.a.t;
                    ox6 ox6VarC = it1.c(jt1Var2, aVar);
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
                    rd7.d(jt1Var2, bt1.a.f, aj1VarA);
                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(jt1Var2, bt1.a.h);
                    rd7.d(jt1Var2, bt1.a.d, ox6VarC);
                    mia.b(nr1.f(jt1Var2, R.string.intercom_your_ticket), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04(), jt1Var2, 0, 0, 131070);
                    IntercomCardKt.IntercomCard(mh4Var2, eo7.j(14.0f, 12.0f, aVar), false, IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, jt1Var2, IntercomCardStyle.$stable << 15, 31), null, gr1.b(-1554241908, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt$BigTicketCard$3$1$1
                        public final void invoke(bj1 bj1Var, jt1 jt1Var3, int i14) {
                            String str;
                            bj1Var.getClass();
                            if ((i14 & 17) == 16 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            TicketDetailState.TicketDetailContentState ticketDetailContentState3 = ticketDetailContentState2;
                            Context context9 = context8;
                            sp0.a aVar3 = di.a.m;
                            c30.k kVar = c30.c;
                            aj1 aj1VarA2 = yi1.a(kVar, aVar3, jt1Var3, 0);
                            int iHashCode2 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY2 = jt1Var3.y();
                            ox6.a aVar4 = ox6.a.t;
                            ox6 ox6VarC2 = it1.c(jt1Var3, aVar4);
                            bt1.c.getClass();
                            qr5.a aVar5 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar5);
                            } else {
                                jt1Var3.z();
                            }
                            bt1.a.c cVar = bt1.a.f;
                            rd7.d(jt1Var3, cVar, aj1VarA2);
                            bt1.a.e eVar = bt1.a.e;
                            rd7.d(jt1Var3, eVar, kw7VarY2);
                            Integer numValueOf = Integer.valueOf(iHashCode2);
                            bt1.a.b bVar = bt1.a.g;
                            rd7.d(jt1Var3, bVar, numValueOf);
                            bt1.a.C0034a c0034a = bt1.a.h;
                            rd7.c(jt1Var3, c0034a);
                            bt1.a.d dVar = bt1.a.d;
                            rd7.d(jt1Var3, dVar, ox6VarC2);
                            ox6 ox6VarI = eo7.i(aVar4, 12.0f);
                            sp0.a aVar6 = di.a.n;
                            aj1 aj1VarA3 = yi1.a(kVar, aVar6, jt1Var3, 48);
                            int iHashCode3 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY3 = jt1Var3.y();
                            ox6 ox6VarC3 = it1.c(jt1Var3, ox6VarI);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar5);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar, aj1VarA3);
                            rd7.d(jt1Var3, eVar, kw7VarY3);
                            g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                            rd7.d(jt1Var3, dVar, ox6VarC3);
                            b47.b(jt1Var3, ir9.d(aVar4, 4.0f));
                            String ticketName = ticketDetailContentState3.getTicketName();
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i15 = IntercomTheme.$stable;
                            mia.b(ticketName, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i15).getType04SemiBold(), jt1Var3, 0, 0, 131070);
                            ticketDetailContentState3.getTicketTimelineCardState().getStatusLabel();
                            g2b g2bVar = g2b.a;
                            b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                            String statusLabel = ticketDetailContentState3.getTicketTimelineCardState().getStatusLabel();
                            Long timestamp = ticketDetailContentState3.getTicketTimelineCardState().getTimestamp();
                            if (timestamp == null || (str = TimeFormatterExtKt.formattedDateFromLong(timestamp.longValue(), context9)) == null) {
                                str = BuildConfig.FLAVOR;
                            }
                            TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(statusLabel, str, null, null, intercomTheme.getTypography(jt1Var3, i15).getType04SemiBold(), ticketDetailContentState3.getTicketTimelineCardState().m531getProgressColor0d7_KjU(), 0, 0, new vaa(3), jt1Var3, 0, 204);
                            b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                            mia.b(ticketDetailContentState3.getTicketTimelineCardState().getStatusTitle(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i15).getType04(), jt1Var3, 0, 0, 131070);
                            b47.b(jt1Var3, ir9.d(aVar4, 16.0f));
                            TicketProgressIndicatorKt.m526TicketProgressIndicator3IgeMak(ticketDetailContentState3.getTicketTimelineCardState().getProgressSections(), ticketDetailContentState3.getTicketTimelineCardState().m531getProgressColor0d7_KjU(), null, jt1Var3, 0, 4);
                            b47.b(jt1Var3, ir9.d(aVar4, 8.0f));
                            jt1Var3.I();
                            IntercomDividerKt.IntercomDivider(eo7.k(aVar4, 12.0f, 0.0f, 2), jt1Var3, 6, 0);
                            ox6 ox6VarK = eo7.k(new c15(aVar6), 0.0f, 14.0f, 1);
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var3, 48);
                            int iHashCode4 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY4 = jt1Var3.y();
                            ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarK);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar5);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar, ny8VarA);
                            rd7.d(jt1Var3, eVar, kw7VarY4);
                            g3.c(iHashCode4, jt1Var3, bVar, jt1Var3, c0034a);
                            rd7.d(jt1Var3, dVar, ox6VarC4);
                            m65.b(is7.a(R.drawable.intercom_ticket_detail_icon, jt1Var3, 0), null, eo7.m(aVar4, 0.0f, 0.0f, 8.0f, 0.0f, 11), ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(jt1Var3, i15).m751getAction0d7_KjU()), jt1Var3, 440, 0);
                            mia.b(nr1.f(jt1Var3, R.string.intercom_tickets_view_ticket), null, ColorExtensionsKt.m836getAccessibleColorOnWhiteBackground8_81llA(intercomTheme.getColors(jt1Var3, i15).m751getAction0d7_KjU()), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var3, i15).getType04SemiBold(), jt1Var3, 0, 0, 131066);
                            jt1Var3.I();
                            jt1Var3.I();
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var3, Integer num) {
                            invoke(bj1Var, jt1Var3, num.intValue());
                            return g2b.a;
                        }
                    }, jt1Var2), jt1Var2, (IntercomCardStyle.Style.$stable << 9) | 196656, 20);
                    jt1Var2.I();
                }

                @Override // defpackage.ei4
                public /* bridge */ /* synthetic */ g2b invoke(jv jvVar, jt1 jt1Var2, Integer num) {
                    invoke(jvVar, jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, (i12 & 14) | 196992 | (i12 & 112), 16);
            ox6Var4 = ox6Var3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: yp0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BigTicketCardKt.BigTicketCard$lambda$4(ticketDetailContentState, mh4Var, z, ox6Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BigTicketCard$lambda$1$lambda$0(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BigTicketCard$lambda$3$lambda$2(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BigTicketCard$lambda$4(TicketDetailState.TicketDetailContentState ticketDetailContentState, mh4 mh4Var, boolean z, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        BigTicketCard(ticketDetailContentState, mh4Var, z, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void BigTicketCardPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1841168271);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BigTicketCardKt.INSTANCE.m214getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new vp0(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BigTicketCardPreview$lambda$5(int i, jt1 jt1Var, int i2) {
        BigTicketCardPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void BigTicketCardWaitingPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1532589538);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BigTicketCardKt.INSTANCE.m215getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new zp0(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BigTicketCardWaitingPreview$lambda$6(int i, jt1 jt1Var, int i2) {
        BigTicketCardWaitingPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
