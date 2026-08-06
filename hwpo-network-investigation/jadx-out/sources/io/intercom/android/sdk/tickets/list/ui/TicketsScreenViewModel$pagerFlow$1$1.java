package io.intercom.android.sdk.tickets.list.ui;

import defpackage.ci4;
import defpackage.r02;
import defpackage.wa;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.list.reducers.TicketRowReducerKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class TicketsScreenViewModel$pagerFlow$1$1 extends wa implements ci4<Ticket, r02<? super TicketRowData>, Object> {
    public static final TicketsScreenViewModel$pagerFlow$1$1 INSTANCE = new TicketsScreenViewModel$pagerFlow$1$1();

    public TicketsScreenViewModel$pagerFlow$1$1() {
        super(2, TicketRowReducerKt.class, "reduceTicketRowData", "reduceTicketRowData(Lio/intercom/android/sdk/models/Ticket;)Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", 5);
    }

    @Override // defpackage.ci4
    public final Object invoke(Ticket ticket, r02<? super TicketRowData> r02Var) {
        return TicketsScreenViewModel.pagerFlow$lambda$1$reduceTicketRowData(ticket, r02Var);
    }
}
