package io.intercom.android.sdk.tickets.list.ui;

import defpackage.eo7;
import defpackage.fi4;
import defpackage.fv5;
import defpackage.g2b;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.we1;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsScreenKt$TicketsScreenContent$2$1$1 implements fi4<fv5, Integer, jt1, Integer, g2b> {
    final /* synthetic */ oh4<String, g2b> $onClick;
    final /* synthetic */ TicketsScreenUiState.Content $uiState;

    /* JADX WARN: Multi-variable type inference failed */
    public TicketsScreenKt$TicketsScreenContent$2$1$1(TicketsScreenUiState.Content content, oh4<? super String, g2b> oh4Var) {
        this.$uiState = content;
        this.$onClick = oh4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b invoke$lambda$2$lambda$1$lambda$0(oh4 oh4Var, TicketRowData ticketRowData) {
        oh4Var.invoke(ticketRowData.getId());
        return g2b.a;
    }

    public final void invoke(fv5 fv5Var, int i, jt1 jt1Var, int i2) {
        fv5Var.getClass();
        if ((i2 & 48) == 0) {
            i2 |= jt1Var.h(i) ? 32 : 16;
        }
        if ((i2 & 145) == 144 && jt1Var.r()) {
            jt1Var.u();
            return;
        }
        final TicketRowData ticketRowDataA = this.$uiState.getLazyPagingTickets().a(i);
        if (ticketRowDataA == null) {
            return;
        }
        final oh4<String, g2b> oh4Var = this.$onClick;
        jt1Var.K(-309133317);
        boolean zJ = jt1Var.J(oh4Var) | jt1Var.J(ticketRowDataA);
        Object objF = jt1Var.f();
        if (zJ || objF == jt1.a.a) {
            objF = new mh4() { // from class: io.intercom.android.sdk.tickets.list.ui.b
                @Override // defpackage.mh4
                public final Object invoke() {
                    return TicketsScreenKt$TicketsScreenContent$2$1$1.invoke$lambda$2$lambda$1$lambda$0(oh4Var, ticketRowDataA);
                }
            };
            jt1Var.C(objF);
        }
        jt1Var.B();
        ox6.a aVar = ox6.a.t;
        TicketRowKt.TicketRow(we1.c(aVar, false, null, (mh4) objF, 15), ticketRowDataA, null, false, jt1Var, 0, 12);
        IntercomDividerKt.IntercomDivider(eo7.k(aVar, 20.0f, 0.0f, 2), jt1Var, 6, 0);
    }

    @Override // defpackage.fi4
    public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, Integer num, jt1 jt1Var, Integer num2) {
        invoke(fv5Var, num.intValue(), jt1Var, num2.intValue());
        return g2b.a;
    }
}
