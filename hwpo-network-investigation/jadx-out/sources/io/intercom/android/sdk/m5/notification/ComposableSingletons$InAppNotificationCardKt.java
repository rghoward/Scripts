package io.intercom.android.sdk.m5.notification;

import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.ws0;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$InAppNotificationCardKt {
    public static final ComposableSingletons$InAppNotificationCardKt INSTANCE = new ComposableSingletons$InAppNotificationCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f280lambda1 = new fr1(false, -690804227, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$InAppNotificationCardKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                InAppNotificationCardKt.InAppNotificationCard(new Conversation(null, null, false, ws0.h(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), ws0.h(new Part.Builder().withSummary("Hello There")), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 2097127, null), null, jt1Var, 0, 2);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f281lambda2 = new fr1(false, 779369617, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$InAppNotificationCardKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                InAppNotificationCardKt.InAppNotificationCard(new Conversation(null, null, false, ws0.h(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), ws0.h(new Part.Builder().withSummary("Hello There")), null, null, null, false, false, null, null, false, new Ticket(null, null, "Feature request", null, null, null, new Ticket.Status("Submitted", MetricTracker.Action.SUBMITTED, null, false, 0L, 28, null), null, null, 0L, null, null, null, null, 0L, 32699, null), null, null, null, null, null, null, null, 2088935, null), null, jt1Var, 0, 2);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m380getLambda1$intercom_sdk_base_release() {
        return f280lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m381getLambda2$intercom_sdk_base_release() {
        return f281lambda2;
    }
}
