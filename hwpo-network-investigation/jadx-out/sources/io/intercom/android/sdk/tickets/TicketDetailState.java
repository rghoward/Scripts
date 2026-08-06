package io.intercom.android.sdk.tickets;

import defpackage.ho2;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.xj5;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TicketDetailState {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Error extends TicketDetailState {
        public static final int $stable = 0;
        private final ErrorState errorState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(ErrorState errorState) {
            super(null);
            errorState.getClass();
            this.errorState = errorState;
        }

        public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, int i, Object obj) {
            if ((i & 1) != 0) {
                errorState = error.errorState;
            }
            return error.copy(errorState);
        }

        public final ErrorState component1() {
            return this.errorState;
        }

        public final Error copy(ErrorState errorState) {
            errorState.getClass();
            return new Error(errorState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && xj5.a(this.errorState, ((Error) obj).errorState);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public int hashCode() {
            return this.errorState.hashCode();
        }

        public String toString() {
            return "Error(errorState=" + this.errorState + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Initial extends TicketDetailState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Loading extends TicketDetailState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class TicketDetailContentState extends TicketDetailState {
        public static final int $stable = 8;
        private final ConversationButtonState conversationButtonState;
        private final String conversationId;
        private final List<Ticket.TicketAttribute> ticketAttributes;
        private final String ticketName;
        private final TicketTimelineCardState ticketTimelineCardState;
        private final String userEmail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TicketDetailContentState(String str, TicketTimelineCardState ticketTimelineCardState, List<? extends Ticket.TicketAttribute> list, String str2, String str3, ConversationButtonState conversationButtonState) {
            super(null);
            str.getClass();
            ticketTimelineCardState.getClass();
            list.getClass();
            str2.getClass();
            conversationButtonState.getClass();
            this.ticketName = str;
            this.ticketTimelineCardState = ticketTimelineCardState;
            this.ticketAttributes = list;
            this.userEmail = str2;
            this.conversationId = str3;
            this.conversationButtonState = conversationButtonState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TicketDetailContentState copy$default(TicketDetailContentState ticketDetailContentState, String str, TicketTimelineCardState ticketTimelineCardState, List list, String str2, String str3, ConversationButtonState conversationButtonState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ticketDetailContentState.ticketName;
            }
            if ((i & 2) != 0) {
                ticketTimelineCardState = ticketDetailContentState.ticketTimelineCardState;
            }
            if ((i & 4) != 0) {
                list = ticketDetailContentState.ticketAttributes;
            }
            if ((i & 8) != 0) {
                str2 = ticketDetailContentState.userEmail;
            }
            if ((i & 16) != 0) {
                str3 = ticketDetailContentState.conversationId;
            }
            if ((i & 32) != 0) {
                conversationButtonState = ticketDetailContentState.conversationButtonState;
            }
            String str4 = str3;
            ConversationButtonState conversationButtonState2 = conversationButtonState;
            return ticketDetailContentState.copy(str, ticketTimelineCardState, list, str2, str4, conversationButtonState2);
        }

        public final String component1() {
            return this.ticketName;
        }

        public final TicketTimelineCardState component2() {
            return this.ticketTimelineCardState;
        }

        public final List<Ticket.TicketAttribute> component3() {
            return this.ticketAttributes;
        }

        public final String component4() {
            return this.userEmail;
        }

        public final String component5() {
            return this.conversationId;
        }

        public final ConversationButtonState component6() {
            return this.conversationButtonState;
        }

        public final TicketDetailContentState copy(String str, TicketTimelineCardState ticketTimelineCardState, List<? extends Ticket.TicketAttribute> list, String str2, String str3, ConversationButtonState conversationButtonState) {
            str.getClass();
            ticketTimelineCardState.getClass();
            list.getClass();
            str2.getClass();
            conversationButtonState.getClass();
            return new TicketDetailContentState(str, ticketTimelineCardState, list, str2, str3, conversationButtonState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TicketDetailContentState)) {
                return false;
            }
            TicketDetailContentState ticketDetailContentState = (TicketDetailContentState) obj;
            return xj5.a(this.ticketName, ticketDetailContentState.ticketName) && xj5.a(this.ticketTimelineCardState, ticketDetailContentState.ticketTimelineCardState) && xj5.a(this.ticketAttributes, ticketDetailContentState.ticketAttributes) && xj5.a(this.userEmail, ticketDetailContentState.userEmail) && xj5.a(this.conversationId, ticketDetailContentState.conversationId) && xj5.a(this.conversationButtonState, ticketDetailContentState.conversationButtonState);
        }

        public final ConversationButtonState getConversationButtonState() {
            return this.conversationButtonState;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final List<Ticket.TicketAttribute> getTicketAttributes() {
            return this.ticketAttributes;
        }

        public final String getTicketName() {
            return this.ticketName;
        }

        public final TicketTimelineCardState getTicketTimelineCardState() {
            return this.ticketTimelineCardState;
        }

        public final String getUserEmail() {
            return this.userEmail;
        }

        public int hashCode() {
            int iC = ru3.c(ho2.a((this.ticketTimelineCardState.hashCode() + (this.ticketName.hashCode() * 31)) * 31, 31, this.ticketAttributes), 31, this.userEmail);
            String str = this.conversationId;
            return this.conversationButtonState.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            return "TicketDetailContentState(ticketName=" + this.ticketName + ", ticketTimelineCardState=" + this.ticketTimelineCardState + ", ticketAttributes=" + this.ticketAttributes + ", userEmail=" + this.userEmail + ", conversationId=" + this.conversationId + ", conversationButtonState=" + this.conversationButtonState + ')';
        }
    }

    public /* synthetic */ TicketDetailState(qq2 qq2Var) {
        this();
    }

    private TicketDetailState() {
    }
}
