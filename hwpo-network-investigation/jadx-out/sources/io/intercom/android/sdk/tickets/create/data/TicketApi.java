package io.intercom.android.sdk.tickets.create.data;

import defpackage.eu7;
import defpackage.g2b;
import defpackage.pr0;
import defpackage.qp8;
import defpackage.r02;
import defpackage.wn7;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.list.data.TicketsResponse;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface TicketApi {
    @wn7("tickets/create")
    Object createTicket(@pr0 qp8 qp8Var, r02<? super NetworkResponse<Ticket>> r02Var);

    @wn7("tickets/{ticketId}")
    Object fetchTicketDetail(@eu7("ticketId") String str, @pr0 qp8 qp8Var, r02<? super NetworkResponse<Ticket>> r02Var);

    @wn7("tickets/ticket_form")
    Object fetchTicketType(@pr0 qp8 qp8Var, r02<? super NetworkResponse<TicketTypeV2>> r02Var);

    @wn7("tickets")
    Object fetchTickets(@pr0 qp8 qp8Var, r02<? super NetworkResponse<TicketsResponse>> r02Var);

    @wn7("tickets/{ticketId}/read")
    Object markAsRead(@eu7("ticketId") String str, @pr0 qp8 qp8Var, r02<? super NetworkResponse<g2b>> r02Var);
}
