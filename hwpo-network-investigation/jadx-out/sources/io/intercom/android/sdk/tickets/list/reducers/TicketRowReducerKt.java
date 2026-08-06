package io.intercom.android.sdk.tickets.list.reducers;

import defpackage.th1;
import defpackage.u30;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.TicketDetailReducerKt;
import io.intercom.android.sdk.tickets.TicketStatus;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketRowReducerKt {
    public static final TicketRowData reduceTicketRowData(Ticket ticket) {
        ticket.getClass();
        String publicId = ticket.getPublicId();
        String strF = th1.F(u30.v(new String[]{publicId != null ? "#".concat(publicId) : null, ticket.getCurrentStatus().getTitle()}), " • ", null, null, null, 62);
        TicketStatus ticketStatus = TicketDetailReducerKt.toTicketStatus(ticket.getCurrentStatus());
        String id = ticket.getId();
        String title = ticket.getTitle();
        Boolean boolIsRead = ticket.isRead();
        return new TicketRowData(id, title, strF, ticketStatus, boolIsRead != null ? boolIsRead.booleanValue() : true);
    }
}
