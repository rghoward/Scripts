package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.ws0;
import io.intercom.android.sdk.tickets.TicketDetailContentKt;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketStatus;
import io.intercom.android.sdk.tickets.TicketTimelineCardKt;
import io.intercom.android.sdk.tickets.TicketTimelineCardState;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BigTicketCardKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$BigTicketCardKt$lambda2$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$BigTicketCardKt$lambda2$1 INSTANCE = new ComposableSingletons$BigTicketCardKt$lambda2$1();

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        TicketDetailState.TicketDetailContentState ticketDetailContentStateCopy$default = TicketDetailState.TicketDetailContentState.copy$default(TicketDetailContentKt.getSampleTicketDetailState(), null, TicketTimelineCardState.m528copyww6aTOc$default(TicketTimelineCardKt.getSampleTicketTimelineCardState(), null, null, null, TicketStatus.WaitingOnCustomer.m527getColor0d7_KjU(), ws0.i(new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(true, true), new TicketTimelineCardState.ProgressSection(false, false)), "Waiting on you", Long.valueOf(System.currentTimeMillis()), 7, null), null, null, null, null, 61, null);
        jt1Var.K(481945466);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new h();
            jt1Var.C(objF);
        }
        jt1Var.B();
        BigTicketCardKt.BigTicketCard(ticketDetailContentStateCopy$default, (mh4) objF, true, null, jt1Var, 432, 8);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
