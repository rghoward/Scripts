package io.intercom.android.sdk.tickets;

import defpackage.ci4;
import defpackage.g2b;
import defpackage.ir9;
import defpackage.jt1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.ws0;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.tickets.ComposableSingletons$RecentTicketsCardKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$RecentTicketsCardKt$lambda1$1 implements ci4<jt1, Integer, g2b> {
    public static final ComposableSingletons$RecentTicketsCardKt$lambda1$1 INSTANCE = new ComposableSingletons$RecentTicketsCardKt$lambda1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$1$lambda$0(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(jt1 jt1Var, int i) {
        if ((i & 3) == 2 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        ox6 ox6VarC = ir9.c(ox6.a.t, 1.0f);
        String str = "Waiting on you";
        String str2 = "waiting_on_customer";
        Ticket.Status status = new Ticket.Status(str, str2, null, false, 0L, 28, null);
        Boolean bool = Boolean.FALSE;
        String str3 = null;
        String str4 = "1";
        String str5 = "1200";
        String str6 = "This is a ticket title";
        Object[] objArr = 0 == true ? 1 : 0;
        Ticket ticket = new Ticket(str4, str5, str6, str3, null, null, status, objArr, null, 0L, null, null, null, bool, 0L, 24504, null);
        int i2 = 28;
        boolean z = false;
        long j = 0;
        Ticket.Status status2 = new Ticket.Status("Submitted", MetricTracker.Action.SUBMITTED, str3, z, j, i2, 0 == true ? 1 : 0);
        Boolean bool2 = Boolean.TRUE;
        String str7 = null;
        String str8 = null;
        List list = null;
        String str9 = "2";
        String str10 = "1201";
        String str11 = "Bug";
        Ticket ticket2 = new Ticket(str9, str10, str11, null, str7, str8, status2, null, list, 0L, null, null, null, bool2, 0L, 24504, null);
        String str12 = "3";
        String str13 = "1202";
        String str14 = "Feature Request";
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        List list2 = null;
        long j2 = 0;
        Ticket.ConversationButton conversationButton = null;
        long j3 = 0;
        String str18 = "4";
        String str19 = "1204";
        String str20 = "Unresolvable";
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        List listI = ws0.i(ticket, ticket2, new Ticket(str12, str13, str14, str7, str8, null, new Ticket.Status("In progress", "in_progress", str3, z, j, i2, 0 == true ? 1 : 0), list, null, 0L, objArr2, objArr3, null, bool2, 0L, 24504, null), new Ticket(str18, str19, str20, str15, str16, str17, new Ticket.Status("Resolved", "resolved", str3, z, j, 28, 0 == true ? 1 : 0), objArr4, list2, j2, objArr5, objArr6, conversationButton, bool, j3, 24504, null));
        jt1Var.K(673428457);
        Object objF = jt1Var.f();
        if (objF == jt1.a.a) {
            objF = new a();
            jt1Var.C(objF);
        }
        jt1Var.B();
        RecentTicketsCardKt.RecentTicketsCard(ox6VarC, "Recent tickets", listI, (oh4) objF, jt1Var, 3126, 0);
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
        invoke(jt1Var, num.intValue());
        return g2b.a;
    }
}
