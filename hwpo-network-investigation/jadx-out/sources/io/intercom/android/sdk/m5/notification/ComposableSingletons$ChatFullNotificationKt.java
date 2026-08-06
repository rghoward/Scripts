package io.intercom.android.sdk.m5.notification;

import defpackage.ci4;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.ws0;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ChatFullNotificationKt {
    public static final ComposableSingletons$ChatFullNotificationKt INSTANCE = new ComposableSingletons$ChatFullNotificationKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f275lambda1 = new fr1(false, 424986995, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-1$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                ChatFullNotificationKt.ChatFullNotification(new Conversation(null, null, false, ws0.h(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), ws0.h(new Part.Builder().withBlocks(ws0.i(new Block.Builder().withText("<b>Hello There!</b>").withType("paragraph"), new Block.Builder().withText("This is a longer message that should wrap to multiple lines in the chat full notification. We want to make sure it displays correctly.").withType("paragraph"), new Block.Builder().withText("We've looked into your request and we'll be implementing this feature in our <b>next release.</b>").withType("paragraph"), new Block.Builder().withText("All the best").withType("paragraph"), new Block.Builder().withText("The team").withType("paragraph")))), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 2097127, null), ChatFullNotificationKt.previewAppConfig, null, jt1Var, 0, 4);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f276lambda2 = new fr1(false, -2029839298, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-2$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                ChatFullNotificationKt.ChatFullNotification(new Conversation(null, null, false, ws0.h(new Participant.Builder().withName("Alex").withIsBot(false).withType(Participant.ADMIN_TYPE)), ws0.h(new Part.Builder().withBlocks(ws0.h(new Block.Builder().withText("Quick question about your recent order.").withType("paragraph")))), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 2097127, null), ChatFullNotificationKt.previewAppConfig, null, jt1Var, 0, 4);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f277lambda3 = new fr1(false, -1139271226, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-3$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                ChatFullNotificationKt.ChatFullNotification(new Conversation(null, null, false, ws0.h(new Participant.Builder().withName("Support Bot").withIsBot(true).withType(Participant.ADMIN_TYPE)), ws0.h(new Part.Builder().withBlocks(ws0.h(new Block.Builder().withText("I'm here to help! Let me know what you need assistance with today.").withType("paragraph")))), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 2097127, null), ChatFullNotificationKt.previewAppConfig, null, jt1Var, 0, 4);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f278lambda4 = new fr1(false, -1302298593, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-4$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
            } else {
                ChatFullNotificationKt.ChatFullNotification(new Conversation(null, null, false, ws0.h(new Participant.Builder().withName("Santhosh").withIsBot(false).withType(Participant.ADMIN_TYPE)), ws0.h(new Part.Builder().withBlocks(ws0.h(new Block.Builder().withText("Hello There! This is a ticket-related message.").withType("paragraph")))), null, null, null, false, false, null, null, false, new Ticket(null, null, "Feature request", null, null, null, new Ticket.Status("Submitted", MetricTracker.Action.SUBMITTED, null, false, 0L, 28, null), null, null, 0L, null, null, null, null, 0L, 32699, null), null, null, null, null, null, null, null, 2088935, null), ChatFullNotificationKt.previewAppConfig, null, jt1Var, 0, 4);
            }
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    public static ci4<jt1, Integer, g2b> f279lambda5 = new fr1(false, 19293965, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.notification.ComposableSingletons$ChatFullNotificationKt$lambda-5$1
        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            List listH = ws0.h(new Participant.Builder().withName("Maria").withIsBot(false).withType(Participant.ADMIN_TYPE));
            List listH2 = ws0.h(new Part.Builder().withBlocks(ws0.h(new Block.Builder().withText("I've looked into your request and we'll be implementing this feature in our next release.").withType("paragraph"))));
            Ticket.Status status = new Ticket.Status("In Progress", "in_progress", null, false, 0L, 28, null);
            Participant.Builder builderWithName = new Participant.Builder().withName("Maria Johnson");
            builderWithName.getClass();
            ChatFullNotificationKt.ChatFullNotification(new Conversation(null, null, false, listH, listH2, null, null, null, false, false, null, null, false, new Ticket(null, null, "Feature request", null, null, null, status, null, null, 0L, builderWithName, null, null, null, 0L, 31675, null), null, null, null, null, null, null, null, 2088935, null), ChatFullNotificationKt.previewAppConfig, null, jt1Var, 0, 4);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m375getLambda1$intercom_sdk_base_release() {
        return f275lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m376getLambda2$intercom_sdk_base_release() {
        return f276lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m377getLambda3$intercom_sdk_base_release() {
        return f277lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m378getLambda4$intercom_sdk_base_release() {
        return f278lambda4;
    }

    /* JADX INFO: renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final ci4<jt1, Integer, g2b> m379getLambda5$intercom_sdk_base_release() {
        return f279lambda5;
    }
}
