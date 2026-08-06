package io.intercom.android.sdk.tickets;

import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.models.Ticket;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface TicketLaunchedFrom {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Other implements TicketLaunchedFrom {
        public static final int $stable = 0;
        private final String from;
        private final String ticketId;

        public Other(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.ticketId = str;
            this.from = str2;
        }

        public static /* synthetic */ Other copy$default(Other other, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = other.ticketId;
            }
            if ((i & 2) != 0) {
                str2 = other.from;
            }
            return other.copy(str, str2);
        }

        public final String component1() {
            return this.ticketId;
        }

        public final String component2() {
            return this.from;
        }

        public final Other copy(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new Other(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Other)) {
                return false;
            }
            Other other = (Other) obj;
            return xj5.a(this.ticketId, other.ticketId) && xj5.a(this.from, other.from);
        }

        @Override // io.intercom.android.sdk.tickets.TicketLaunchedFrom
        public String getFrom() {
            return this.from;
        }

        public final String getTicketId() {
            return this.ticketId;
        }

        public int hashCode() {
            return this.from.hashCode() + (this.ticketId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Other(ticketId=");
            sb.append(this.ticketId);
            sb.append(", from=");
            return wu0.a(sb, this.from, ')');
        }
    }

    String getFrom();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class DefaultImpls {
        public static /* synthetic */ void getFrom$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Conversation implements TicketLaunchedFrom {
        public static final int $stable = 8;
        private final String from;
        private final Ticket ticket;

        public /* synthetic */ Conversation(Ticket ticket, int i, qq2 qq2Var) {
            this((i & 1) != 0 ? Injector.get().getDataLayer().getTicket().getValue() : ticket);
        }

        public static /* synthetic */ Conversation copy$default(Conversation conversation, Ticket ticket, int i, Object obj) {
            if ((i & 1) != 0) {
                ticket = conversation.ticket;
            }
            return conversation.copy(ticket);
        }

        public final Ticket component1() {
            return this.ticket;
        }

        public final Conversation copy(Ticket ticket) {
            ticket.getClass();
            return new Conversation(ticket);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Conversation) && xj5.a(this.ticket, ((Conversation) obj).ticket);
        }

        @Override // io.intercom.android.sdk.tickets.TicketLaunchedFrom
        public String getFrom() {
            return this.from;
        }

        public final Ticket getTicket() {
            return this.ticket;
        }

        public int hashCode() {
            return this.ticket.hashCode();
        }

        public String toString() {
            return "Conversation(ticket=" + this.ticket + ')';
        }

        public Conversation(Ticket ticket) {
            ticket.getClass();
            this.ticket = ticket;
            this.from = "conversation";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Conversation() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
