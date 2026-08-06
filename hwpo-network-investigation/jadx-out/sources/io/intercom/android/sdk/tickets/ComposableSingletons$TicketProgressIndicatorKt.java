package io.intercom.android.sdk.tickets;

import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TicketProgressIndicatorKt {
    public static final ComposableSingletons$TicketProgressIndicatorKt INSTANCE = new ComposableSingletons$TicketProgressIndicatorKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f356lambda1 = new fr1(false, 1410192629, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketProgressIndicatorKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                TicketProgressIndicatorKt.m526TicketProgressIndicator3IgeMak(TicketDetailContentKt.getSampleTicketDetailState().getTicketTimelineCardState().getProgressSections(), TicketDetailContentKt.getSampleTicketDetailState().getTicketTimelineCardState().m531getProgressColor0d7_KjU(), null, jt1Var, 0, 4);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m520getLambda1$intercom_sdk_base_release() {
        return f356lambda1;
    }
}
