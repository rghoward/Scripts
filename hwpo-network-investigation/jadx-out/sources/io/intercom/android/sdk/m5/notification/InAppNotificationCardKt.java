package io.intercom.android.sdk.m5.notification;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import defpackage.a30;
import defpackage.aj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.eo7;
import defpackage.fi1;
import defpackage.fl6;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.hi1;
import defpackage.ir9;
import defpackage.it1;
import defpackage.iw;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.ox6;
import defpackage.pw3;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.u7d;
import defpackage.w95;
import defpackage.wja;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.z02;
import defpackage.z2a;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.m5.components.TicketHeaderKt;
import io.intercom.android.sdk.m5.components.TicketStatusHeaderArgs;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.notification.InAppNotificationCardKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class InAppNotificationCardKt {
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:42:0x0119  */
    /* JADX WARN: Code duplicated, block: B:44:0x0120  */
    /* JADX WARN: Code duplicated, block: B:45:0x0124  */
    /* JADX WARN: Code duplicated, block: B:48:0x018a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0191  */
    /* JADX WARN: Code duplicated, block: B:51:0x0195  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:66:0x0208  */
    /* JADX WARN: Code duplicated, block: B:67:0x020a  */
    /* JADX WARN: Code duplicated, block: B:69:0x022f  */
    /* JADX WARN: Code duplicated, block: B:71:0x023d  */
    /* JADX WARN: Code duplicated, block: B:72:0x027d  */
    /* JADX WARN: Code duplicated, block: B:74:0x028f  */
    /* JADX WARN: Code duplicated, block: B:76:0x029a  */
    /* JADX WARN: Code duplicated, block: B:78:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:79:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:81:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:84:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x0346  */
    /* JADX WARN: Code duplicated, block: B:89:0x035b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0369  */
    /* JADX WARN: Code duplicated, block: B:93:0x036e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0373  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void InAppNotificationCard(final Conversation conversation, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final ox6 ox6Var2;
        ox6.a aVar;
        ox6 ox6Var3;
        Context context;
        Part partLastPart;
        IntercomTheme intercomTheme;
        int i4;
        ox6 ox6Var4;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        ny8 ny8VarA;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        aj1 aj1VarA;
        int iHashCode3;
        kw7 kw7VarP3;
        ox6 ox6VarC3;
        boolean z;
        IntercomTheme intercomTheme2;
        int i5;
        boolean z2;
        Ticket ticket;
        String forename;
        Part partLastPart2;
        boolean z3;
        String summary;
        String forename2;
        ob4 ob4Var;
        xj8 xj8VarW;
        conversation.getClass();
        bj4 bj4VarO = jt1Var.o(-320085669);
        j1b j1bVar = bj4VarO.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (bj4VarO.j(conversation) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i6 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                partLastPart = conversation.lastPart();
                intercomTheme = IntercomTheme.INSTANCE;
                i4 = IntercomTheme.$stable;
                ox6Var4 = ox6Var3;
                ox6 ox6VarJ = eo7.j(16.0f, 16.0f, gi0.c(pw3.c(ox6Var3, 2.0f, intercomTheme.getShapes(bj4VarO, i4).b, 0L, 0L, 24), ((fi1) bj4VarO.F(hi1.a)).n, intercomTheme.getShapes(bj4VarO, i4).b));
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarJ);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, fl6VarD);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6 ox6VarC4 = ir9.c(aVar, 1.0f);
                ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.j, bj4VarO, 54);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC4);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, 32.0f), PartExtensionsKt.resolvedAvatarWrapper(partLastPart), null, false, 0L, null, bj4VarO, 6, 60);
                bj4VarO = bj4VarO;
                aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                bj4VarO.K(110724238);
                if (conversation.getTicket() != null) {
                    String title = conversation.getTicket().getTitle();
                    if (conversation.isRead()) {
                        ob4Var = ob4.y;
                    } else {
                        ob4Var = ob4.A;
                    }
                    TicketStatusHeaderArgs ticketStatusHeaderArgs = new TicketStatusHeaderArgs(title, ob4Var);
                    z = false;
                    TicketHeaderKt.TicketHeader(null, ticketStatusHeaderArgs, bj4VarO, 0, 1);
                } else {
                    z = false;
                }
                bj4VarO.U(z);
                if (conversation.parts().isEmpty()) {
                    intercomTheme2 = intercomTheme;
                    i5 = i4;
                    z2 = false;
                    if (conversation.getTicket() != null) {
                        bj4VarO.K(-860735524);
                        ticket = conversation.getTicket();
                        if (xj5.a(ticket.getCurrentStatus().getType(), MetricTracker.Action.SUBMITTED)) {
                            forename = null;
                        } else {
                            forename = ticket.getAssignee().build().getForename();
                        }
                        TicketInAppNotificationContent(forename, ticket.getCurrentStatus().getTitle(), nr1.f(bj4VarO, R.string.intercom_time_just_now), bj4VarO, 0, 0);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(-860222753);
                        bj4VarO.U(false);
                    }
                } else {
                    bj4VarO.K(-862046638);
                    partLastPart2 = conversation.lastPart();
                    if (partLastPart2.getMessageStyle() == MessageStyle.TICKET_STATE_UPDATED) {
                        bj4VarO.K(-861894149);
                        if (xj5.a(partLastPart2.getEventData().getStatus(), MetricTracker.Action.SUBMITTED)) {
                            forename2 = null;
                        } else {
                            forename2 = partLastPart2.getParticipant().getForename();
                        }
                        TicketInAppNotificationContent(forename2, partLastPart2.getEventData().getEventAsPlainText(), nr1.f(bj4VarO, R.string.intercom_time_just_now), bj4VarO, 0, 0);
                        z3 = false;
                        bj4VarO.U(false);
                        intercomTheme2 = intercomTheme;
                        i5 = i4;
                    } else {
                        z3 = false;
                        summary = partLastPart2.getSummary();
                        summary.getClass();
                        if (z2a.w(summary)) {
                            intercomTheme2 = intercomTheme;
                            i5 = i4;
                            bj4VarO.K(-860939132);
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(-861328492);
                            String summary2 = partLastPart2.getSummary();
                            summary2.getClass();
                            intercomTheme2 = intercomTheme;
                            i5 = i4;
                            mia.b(summary2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme2.getTypography(bj4VarO, i5).getType04Point5(), bj4VarO, 0, 24960, 110590);
                            bj4VarO = bj4VarO;
                            bj4VarO.U(false);
                        }
                    }
                    bj4VarO.U(z3);
                    z2 = z3;
                }
                bj4VarO.K(110799413);
                if (conversation.getTicket() == null) {
                    bj4 bj4Var = bj4VarO;
                    TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(Phrase.from(context, R.string.intercom_reply_from_admin).put("name", PartExtensionsKt.resolvedDisplayTitle(partLastPart)).format().toString(), PartExtensionsKt.resolvedDisplaySuffix(partLastPart), null, null, wja.a(intercomTheme2.getTypography(bj4VarO, i5).getType04Point5(), u7d.d(4285887861L), 0L, null, null, 0L, 0L, null, null, 16777214), 0L, 0, 1, null, bj4Var, 12582912, 364);
                    bj4VarO = bj4Var;
                }
                bj4VarO.U(z2);
                bj4VarO.U(true);
                bj4VarO.U(true);
                bj4VarO.U(true);
                ox6Var2 = ox6Var4;
            } else {
                bj4VarO.u();
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: v95
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return InAppNotificationCardKt.InAppNotificationCard$lambda$5(conversation, ox6Var2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        if ((i3 & 19) == 18) {
            aVar = ox6.a.t;
            if (i6 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            partLastPart = conversation.lastPart();
            intercomTheme = IntercomTheme.INSTANCE;
            i4 = IntercomTheme.$stable;
            ox6Var4 = ox6Var3;
            ox6 ox6VarJ2 = eo7.j(16.0f, 16.0f, gi0.c(pw3.c(ox6Var3, 2.0f, intercomTheme.getShapes(bj4VarO, i4).b, 0L, 0L, 24), ((fi1) bj4VarO.F(hi1.a)).n, intercomTheme.getShapes(bj4VarO, i4).b));
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarJ2);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, fl6VarD);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf2);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6 ox6VarC5 = ir9.c(aVar, 1.0f);
            ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.j, bj4VarO, 54);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarC5);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, 32.0f), PartExtensionsKt.resolvedAvatarWrapper(partLastPart), null, false, 0L, null, bj4VarO, 6, 60);
            bj4VarO = bj4VarO;
            aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
            iHashCode3 = Long.hashCode(bj4VarO.T);
            kw7VarP3 = bj4VarO.P();
            ox6VarC3 = it1.c(bj4VarO, aVar);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP3);
            l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC3);
            bj4VarO.K(110724238);
            if (conversation.getTicket() != null) {
                String title2 = conversation.getTicket().getTitle();
                if (conversation.isRead()) {
                    ob4Var = ob4.y;
                } else {
                    ob4Var = ob4.A;
                }
                TicketStatusHeaderArgs ticketStatusHeaderArgs2 = new TicketStatusHeaderArgs(title2, ob4Var);
                z = false;
                TicketHeaderKt.TicketHeader(null, ticketStatusHeaderArgs2, bj4VarO, 0, 1);
            } else {
                z = false;
            }
            bj4VarO.U(z);
            if (conversation.parts().isEmpty()) {
                bj4VarO.K(-862046638);
                partLastPart2 = conversation.lastPart();
                if (partLastPart2.getMessageStyle() == MessageStyle.TICKET_STATE_UPDATED) {
                    bj4VarO.K(-861894149);
                    if (xj5.a(partLastPart2.getEventData().getStatus(), MetricTracker.Action.SUBMITTED)) {
                        forename2 = null;
                    } else {
                        forename2 = partLastPart2.getParticipant().getForename();
                    }
                    TicketInAppNotificationContent(forename2, partLastPart2.getEventData().getEventAsPlainText(), nr1.f(bj4VarO, R.string.intercom_time_just_now), bj4VarO, 0, 0);
                    z3 = false;
                    bj4VarO.U(false);
                    intercomTheme2 = intercomTheme;
                    i5 = i4;
                } else {
                    z3 = false;
                    summary = partLastPart2.getSummary();
                    summary.getClass();
                    if (z2a.w(summary)) {
                        bj4VarO.K(-861328492);
                        String summary3 = partLastPart2.getSummary();
                        summary3.getClass();
                        intercomTheme2 = intercomTheme;
                        i5 = i4;
                        mia.b(summary3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme2.getTypography(bj4VarO, i5).getType04Point5(), bj4VarO, 0, 24960, 110590);
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                    } else {
                        intercomTheme2 = intercomTheme;
                        i5 = i4;
                        bj4VarO.K(-860939132);
                        bj4VarO.U(false);
                    }
                }
                bj4VarO.U(z3);
                z2 = z3;
            } else {
                intercomTheme2 = intercomTheme;
                i5 = i4;
                z2 = false;
                if (conversation.getTicket() != null) {
                    bj4VarO.K(-860735524);
                    ticket = conversation.getTicket();
                    if (xj5.a(ticket.getCurrentStatus().getType(), MetricTracker.Action.SUBMITTED)) {
                        forename = null;
                    } else {
                        forename = ticket.getAssignee().build().getForename();
                    }
                    TicketInAppNotificationContent(forename, ticket.getCurrentStatus().getTitle(), nr1.f(bj4VarO, R.string.intercom_time_just_now), bj4VarO, 0, 0);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(-860222753);
                    bj4VarO.U(false);
                }
            }
            bj4VarO.K(110799413);
            if (conversation.getTicket() == null) {
                bj4 bj4Var2 = bj4VarO;
                TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(Phrase.from(context, R.string.intercom_reply_from_admin).put("name", PartExtensionsKt.resolvedDisplayTitle(partLastPart)).format().toString(), PartExtensionsKt.resolvedDisplaySuffix(partLastPart), null, null, wja.a(intercomTheme2.getTypography(bj4VarO, i5).getType04Point5(), u7d.d(4285887861L), 0L, null, null, 0L, 0L, null, null, 16777214), 0L, 0, 1, null, bj4Var2, 12582912, 364);
                bj4VarO = bj4Var2;
            }
            bj4VarO.U(z2);
            bj4VarO.U(true);
            bj4VarO.U(true);
            bj4VarO.U(true);
            ox6Var2 = ox6Var4;
        } else {
            aVar = ox6.a.t;
            if (i6 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            partLastPart = conversation.lastPart();
            intercomTheme = IntercomTheme.INSTANCE;
            i4 = IntercomTheme.$stable;
            ox6Var4 = ox6Var3;
            ox6 ox6VarJ3 = eo7.j(16.0f, 16.0f, gi0.c(pw3.c(ox6Var3, 2.0f, intercomTheme.getShapes(bj4VarO, i4).b, 0L, 0L, 24), ((fi1) bj4VarO.F(hi1.a)).n, intercomTheme.getShapes(bj4VarO, i4).b));
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarJ3);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, fl6VarD);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf3);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6 ox6VarC6 = ir9.c(aVar, 1.0f);
            ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.j, bj4VarO, 54);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarC6);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, 32.0f), PartExtensionsKt.resolvedAvatarWrapper(partLastPart), null, false, 0L, null, bj4VarO, 6, 60);
            bj4VarO = bj4VarO;
            aj1VarA = yi1.a(new c30.h(4.0f, true, new a30()), di.a.m, bj4VarO, 6);
            iHashCode3 = Long.hashCode(bj4VarO.T);
            kw7VarP3 = bj4VarO.P();
            ox6VarC3 = it1.c(bj4VarO, aVar);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP3);
            l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC3);
            bj4VarO.K(110724238);
            if (conversation.getTicket() != null) {
                String title3 = conversation.getTicket().getTitle();
                if (conversation.isRead()) {
                    ob4Var = ob4.y;
                } else {
                    ob4Var = ob4.A;
                }
                TicketStatusHeaderArgs ticketStatusHeaderArgs3 = new TicketStatusHeaderArgs(title3, ob4Var);
                z = false;
                TicketHeaderKt.TicketHeader(null, ticketStatusHeaderArgs3, bj4VarO, 0, 1);
            } else {
                z = false;
            }
            bj4VarO.U(z);
            if (conversation.parts().isEmpty()) {
                bj4VarO.K(-862046638);
                partLastPart2 = conversation.lastPart();
                if (partLastPart2.getMessageStyle() == MessageStyle.TICKET_STATE_UPDATED) {
                    bj4VarO.K(-861894149);
                    if (xj5.a(partLastPart2.getEventData().getStatus(), MetricTracker.Action.SUBMITTED)) {
                        forename2 = null;
                    } else {
                        forename2 = partLastPart2.getParticipant().getForename();
                    }
                    TicketInAppNotificationContent(forename2, partLastPart2.getEventData().getEventAsPlainText(), nr1.f(bj4VarO, R.string.intercom_time_just_now), bj4VarO, 0, 0);
                    z3 = false;
                    bj4VarO.U(false);
                    intercomTheme2 = intercomTheme;
                    i5 = i4;
                } else {
                    z3 = false;
                    summary = partLastPart2.getSummary();
                    summary.getClass();
                    if (z2a.w(summary)) {
                        bj4VarO.K(-861328492);
                        String summary4 = partLastPart2.getSummary();
                        summary4.getClass();
                        intercomTheme2 = intercomTheme;
                        i5 = i4;
                        mia.b(summary4, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, intercomTheme2.getTypography(bj4VarO, i5).getType04Point5(), bj4VarO, 0, 24960, 110590);
                        bj4VarO = bj4VarO;
                        bj4VarO.U(false);
                    } else {
                        intercomTheme2 = intercomTheme;
                        i5 = i4;
                        bj4VarO.K(-860939132);
                        bj4VarO.U(false);
                    }
                }
                bj4VarO.U(z3);
                z2 = z3;
            } else {
                intercomTheme2 = intercomTheme;
                i5 = i4;
                z2 = false;
                if (conversation.getTicket() != null) {
                    bj4VarO.K(-860735524);
                    ticket = conversation.getTicket();
                    if (xj5.a(ticket.getCurrentStatus().getType(), MetricTracker.Action.SUBMITTED)) {
                        forename = null;
                    } else {
                        forename = ticket.getAssignee().build().getForename();
                    }
                    TicketInAppNotificationContent(forename, ticket.getCurrentStatus().getTitle(), nr1.f(bj4VarO, R.string.intercom_time_just_now), bj4VarO, 0, 0);
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(-860222753);
                    bj4VarO.U(false);
                }
            }
            bj4VarO.K(110799413);
            if (conversation.getTicket() == null) {
                bj4 bj4Var3 = bj4VarO;
                TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(Phrase.from(context, R.string.intercom_reply_from_admin).put("name", PartExtensionsKt.resolvedDisplayTitle(partLastPart)).format().toString(), PartExtensionsKt.resolvedDisplaySuffix(partLastPart), null, null, wja.a(intercomTheme2.getTypography(bj4VarO, i5).getType04Point5(), u7d.d(4285887861L), 0L, null, null, 0L, 0L, null, null, 16777214), 0L, 0, 1, null, bj4Var3, 12582912, 364);
                bj4VarO = bj4Var3;
            }
            bj4VarO.U(z2);
            bj4VarO.U(true);
            bj4VarO.U(true);
            bj4VarO.U(true);
            ox6Var2 = ox6Var4;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: v95
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return InAppNotificationCardKt.InAppNotificationCard$lambda$5(conversation, ox6Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InAppNotificationCard$lambda$5(Conversation conversation, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        InAppNotificationCard(conversation, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void InAppNotificationCardPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-2144100909);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InAppNotificationCardKt.INSTANCE.m380getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new w95(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InAppNotificationCardPreview$lambda$7(int i, jt1 jt1Var, int i2) {
        InAppNotificationCardPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void InAppNotificationCardTicketPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-186124313);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InAppNotificationCardKt.INSTANCE.m381getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new z02(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InAppNotificationCardTicketPreview$lambda$8(int i, jt1 jt1Var, int i2) {
        InAppNotificationCardTicketPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00ce, please report this as an issue */
    public static final void TicketInAppNotificationContent(final String str, final String str2, String str3, jt1 jt1Var, final int i, final int i2) {
        int i3;
        String str4;
        final String strF;
        iw iwVar;
        bj4 bj4Var;
        str2.getClass();
        bj4 bj4VarO = jt1Var.o(818896879);
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
            i3 |= bj4VarO.J(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                str4 = str3;
                int i4 = bj4VarO.J(str4) ? 256 : 128;
                i3 |= i4;
            } else {
                str4 = str3;
            }
            i3 |= i4;
        } else {
            str4 = str3;
        }
        if ((i3 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            bj4Var = bj4VarO;
            strF = str4;
        } else {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                if ((i2 & 4) != 0) {
                    strF = nr1.f(bj4VarO, R.string.intercom_time_just_now);
                }
                bj4VarO.V();
                if (str != null) {
                    bj4VarO.K(856745774);
                    iw iwVar2 = new iw(Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_moved).put("teammate", str).put("status", str2).put("timestamp", strF).format().toString());
                    bj4VarO.U(false);
                    iwVar = iwVar2;
                } else {
                    bj4VarO.K(857069290);
                    iw iwVar3 = new iw(nr1.f(bj4VarO, R.string.intercom_tickets_status_description_prefix_when_submitted) + ' ' + str2);
                    bj4VarO.U(false);
                    iwVar = iwVar3;
                }
                bj4Var = bj4VarO;
                mia.c(iwVar, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType05(), bj4Var, 0, 24960, 241662);
            } else {
                bj4VarO.u();
                int i5 = i2 & 4;
            }
            strF = str4;
            bj4VarO.V();
            if (str != null) {
                bj4VarO.K(856745774);
                iw iwVar4 = new iw(Phrase.from((Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), R.string.intercom_tickets_status_event_moved).put("teammate", str).put("status", str2).put("timestamp", strF).format().toString());
                bj4VarO.U(false);
                iwVar = iwVar4;
            } else {
                bj4VarO.K(857069290);
                iw iwVar5 = new iw(nr1.f(bj4VarO, R.string.intercom_tickets_status_description_prefix_when_submitted) + ' ' + str2);
                bj4VarO.U(false);
                iwVar = iwVar5;
            }
            bj4Var = bj4VarO;
            mia.c(iwVar, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType05(), bj4Var, 0, 24960, 241662);
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: x95
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return InAppNotificationCardKt.TicketInAppNotificationContent$lambda$6(str, str2, strF, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketInAppNotificationContent$lambda$6(String str, String str2, String str3, int i, int i2, jt1 jt1Var, int i3) {
        TicketInAppNotificationContent(str, str2, str3, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void addInappNotificationCardToView(ComposeView composeView, final Conversation conversation) {
        conversation.getClass();
        if (composeView == null || ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            return;
        }
        composeView.setContent(new fr1(true, -1448950486, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$addInappNotificationCardToView$1$1
            public final void invoke(jt1 jt1Var, int i) {
                if ((i & 3) == 2 && jt1Var.r()) {
                    jt1Var.u();
                } else {
                    final Conversation conversation2 = conversation;
                    IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(-395652032, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$addInappNotificationCardToView$1$1.1
                        public final void invoke(jt1 jt1Var2, int i2) {
                            if ((i2 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                InAppNotificationCardKt.InAppNotificationCard(conversation2, null, jt1Var2, 0, 2);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, jt1Var), jt1Var, 3072, 7);
                }
            }

            @Override // defpackage.ci4
            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                invoke(jt1Var, num.intValue());
                return g2b.a;
            }
        }));
    }

    public static final void addTicketHeaderToCompose(ComposeView composeView, final Conversation conversation) {
        conversation.getClass();
        if (composeView == null || ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            return;
        }
        composeView.setContent(new fr1(true, -744078063, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$addTicketHeaderToCompose$1$1
            public final void invoke(jt1 jt1Var, int i) {
                if ((i & 3) == 2 && jt1Var.r()) {
                    jt1Var.u();
                } else {
                    final Conversation conversation2 = conversation;
                    IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(-1860903769, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$addTicketHeaderToCompose$1$1.1
                        public final void invoke(jt1 jt1Var2, int i2) {
                            ob4 ob4Var;
                            if ((i2 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            if (conversation2.getTicket() != null) {
                                String title = conversation2.getTicket().getTitle();
                                if (conversation2.isRead()) {
                                    ob4 ob4Var2 = ob4.u;
                                    ob4Var = ob4.y;
                                } else {
                                    ob4 ob4Var3 = ob4.u;
                                    ob4Var = ob4.A;
                                }
                                TicketHeaderKt.TicketHeader(null, new TicketStatusHeaderArgs(title, ob4Var), jt1Var2, 0, 1);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, jt1Var), jt1Var, 3072, 7);
                }
            }

            @Override // defpackage.ci4
            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                invoke(jt1Var, num.intValue());
                return g2b.a;
            }
        }));
    }
}
