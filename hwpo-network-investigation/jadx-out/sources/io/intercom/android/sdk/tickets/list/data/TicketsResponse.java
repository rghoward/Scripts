package io.intercom.android.sdk.tickets.list.data;

import com.google.gson.annotations.SerializedName;
import defpackage.xj5;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsResponse {
    public static final int $stable = 8;

    @SerializedName("next_page")
    private final Long nextPage;

    @SerializedName("tickets")
    private final List<Ticket> tickets;

    public TicketsResponse(List<Ticket> list, Long l) {
        list.getClass();
        this.tickets = list;
        this.nextPage = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketsResponse copy$default(TicketsResponse ticketsResponse, List list, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ticketsResponse.tickets;
        }
        if ((i & 2) != 0) {
            l = ticketsResponse.nextPage;
        }
        return ticketsResponse.copy(list, l);
    }

    public final List<Ticket> component1() {
        return this.tickets;
    }

    public final Long component2() {
        return this.nextPage;
    }

    public final TicketsResponse copy(List<Ticket> list, Long l) {
        list.getClass();
        return new TicketsResponse(list, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketsResponse)) {
            return false;
        }
        TicketsResponse ticketsResponse = (TicketsResponse) obj;
        return xj5.a(this.tickets, ticketsResponse.tickets) && xj5.a(this.nextPage, ticketsResponse.nextPage);
    }

    public final Long getNextPage() {
        return this.nextPage;
    }

    public final List<Ticket> getTickets() {
        return this.tickets;
    }

    public int hashCode() {
        int iHashCode = this.tickets.hashCode() * 31;
        Long l = this.nextPage;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "TicketsResponse(tickets=" + this.tickets + ", nextPage=" + this.nextPage + ')';
    }
}
