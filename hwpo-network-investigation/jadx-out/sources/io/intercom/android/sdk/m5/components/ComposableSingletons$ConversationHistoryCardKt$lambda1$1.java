package io.intercom.android.sdk.m5.components;

import defpackage.ci4;
import defpackage.e96;
import defpackage.g2b;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.ws0;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationHistoryCardKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ConversationHistoryCardKt$lambda1$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$ConversationHistoryCardKt$lambda1$1 INSTANCE = new ComposableSingletons$ConversationHistoryCardKt$lambda1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$4$lambda$3(Conversation conversation) {
        conversation.getClass();
        return g2b.a;
    }

    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        ox6 ox6VarC = ir9.c(ox6.a.t, 1.0f);
        e96 e96VarF = ws0.f();
        int i2 = 0;
        while (i2 < 2) {
            boolean z = i2 == 0;
            Ticket ticket = new Ticket(null, "1234", "Export button not working", null, null, null, new Ticket.Status("Submitted", MetricTracker.Action.SUBMITTED, null, false, 0L, 28, null), null, null, 0L, null, null, null, null, 0L, 32697, null);
            LastParticipatingAdmin.Builder builderWithAvatar = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
            builderWithAvatar.getClass();
            e96VarF.add(new Conversation("123", "Export button not working", z, null, ws0.h(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)), null, builderWithAvatar, null, false, false, null, null, false, ticket, null, null, null, null, null, null, null, 2088872, null));
            i2++;
        }
        int i3 = 0;
        while (i3 < 2) {
            boolean z2 = i3 == 0;
            LastParticipatingAdmin.Builder builderWithAvatar2 = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
            builderWithAvatar2.getClass();
            e96VarF.add(new Conversation("123", "Account setup assistance", z2, null, ws0.h(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(1659081886L)), null, builderWithAvatar2, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 2097064, null));
            i3++;
        }
        g2b g2bVar = g2b.a;
        e96 e96VarE = ws0.e(e96VarF);
        jt1Var.K(-1574017895);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new d();
            jt1Var.C(objF);
        }
        jt1Var.B();
        ConversationHistoryCardKt.ConversationHistoryCard(ox6VarC, "Your recent conversations", e96VarE, (oh4) objF, jt1Var, 3126, 0);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
