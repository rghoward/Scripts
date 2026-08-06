package io.intercom.android.sdk.m5.conversation.states;

import defpackage.qq2;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.ui.common.StringProvider;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class HeaderMenuItem {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Help extends HeaderMenuItem {
        public static final int $stable = StringProvider.$stable;
        private final boolean enabled;
        private final StringProvider label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Help(boolean z, StringProvider stringProvider) {
            super(null);
            stringProvider.getClass();
            this.enabled = z;
            this.label = stringProvider;
        }

        public static /* synthetic */ Help copy$default(Help help, boolean z, StringProvider stringProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                z = help.enabled;
            }
            if ((i & 2) != 0) {
                stringProvider = help.label;
            }
            return help.copy(z, stringProvider);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final StringProvider component2() {
            return this.label;
        }

        public final Help copy(boolean z, StringProvider stringProvider) {
            stringProvider.getClass();
            return new Help(z, stringProvider);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Help)) {
                return false;
            }
            Help help = (Help) obj;
            return this.enabled == help.enabled && xj5.a(this.label, help.label);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public StringProvider getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode() + (Boolean.hashCode(this.enabled) * 31);
        }

        public String toString() {
            return "Help(enabled=" + this.enabled + ", label=" + this.label + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class StartNewConversation extends HeaderMenuItem {
        public static final int $stable = StringProvider.$stable;
        private final boolean enabled;
        private final StringProvider label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartNewConversation(boolean z, StringProvider stringProvider) {
            super(null);
            stringProvider.getClass();
            this.enabled = z;
            this.label = stringProvider;
        }

        public static /* synthetic */ StartNewConversation copy$default(StartNewConversation startNewConversation, boolean z, StringProvider stringProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                z = startNewConversation.enabled;
            }
            if ((i & 2) != 0) {
                stringProvider = startNewConversation.label;
            }
            return startNewConversation.copy(z, stringProvider);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final StringProvider component2() {
            return this.label;
        }

        public final StartNewConversation copy(boolean z, StringProvider stringProvider) {
            stringProvider.getClass();
            return new StartNewConversation(z, stringProvider);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartNewConversation)) {
                return false;
            }
            StartNewConversation startNewConversation = (StartNewConversation) obj;
            return this.enabled == startNewConversation.enabled && xj5.a(this.label, startNewConversation.label);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public StringProvider getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode() + (Boolean.hashCode(this.enabled) * 31);
        }

        public String toString() {
            return "StartNewConversation(enabled=" + this.enabled + ", label=" + this.label + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Tickets extends HeaderMenuItem {
        public static final int $stable = StringProvider.$stable;
        private final boolean enabled;
        private final boolean hasUnreadTickets;
        private final StringProvider label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Tickets(boolean z, boolean z2, StringProvider stringProvider) {
            super(null);
            stringProvider.getClass();
            this.hasUnreadTickets = z;
            this.enabled = z2;
            this.label = stringProvider;
        }

        public static /* synthetic */ Tickets copy$default(Tickets tickets, boolean z, boolean z2, StringProvider stringProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                z = tickets.hasUnreadTickets;
            }
            if ((i & 2) != 0) {
                z2 = tickets.enabled;
            }
            if ((i & 4) != 0) {
                stringProvider = tickets.label;
            }
            return tickets.copy(z, z2, stringProvider);
        }

        public final boolean component1() {
            return this.hasUnreadTickets;
        }

        public final boolean component2() {
            return this.enabled;
        }

        public final StringProvider component3() {
            return this.label;
        }

        public final Tickets copy(boolean z, boolean z2, StringProvider stringProvider) {
            stringProvider.getClass();
            return new Tickets(z, z2, stringProvider);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tickets)) {
                return false;
            }
            Tickets tickets = (Tickets) obj;
            return this.hasUnreadTickets == tickets.hasUnreadTickets && this.enabled == tickets.enabled && xj5.a(this.label, tickets.label);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public boolean getEnabled() {
            return this.enabled;
        }

        public final boolean getHasUnreadTickets() {
            return this.hasUnreadTickets;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public StringProvider getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.label.hashCode() + uo2.a(Boolean.hashCode(this.hasUnreadTickets) * 31, this.enabled, 31);
        }

        public String toString() {
            return "Tickets(hasUnreadTickets=" + this.hasUnreadTickets + ", enabled=" + this.enabled + ", label=" + this.label + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface TotalCountIndicator {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class NoIndicator implements TotalCountIndicator {
            public static final int $stable = 0;
            public static final NoIndicator INSTANCE = new NoIndicator();

            private NoIndicator() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NoIndicator);
            }

            public int hashCode() {
                return -94121592;
            }

            public String toString() {
                return "NoIndicator";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class UnreadCountIndicator implements TotalCountIndicator {
            public static final int $stable = 0;
            private final String unreadMessagesCount;

            public UnreadCountIndicator(String str) {
                str.getClass();
                this.unreadMessagesCount = str;
            }

            public static /* synthetic */ UnreadCountIndicator copy$default(UnreadCountIndicator unreadCountIndicator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = unreadCountIndicator.unreadMessagesCount;
                }
                return unreadCountIndicator.copy(str);
            }

            public final String component1() {
                return this.unreadMessagesCount;
            }

            public final UnreadCountIndicator copy(String str) {
                str.getClass();
                return new UnreadCountIndicator(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnreadCountIndicator) && xj5.a(this.unreadMessagesCount, ((UnreadCountIndicator) obj).unreadMessagesCount);
            }

            public final String getUnreadMessagesCount() {
                return this.unreadMessagesCount;
            }

            public int hashCode() {
                return this.unreadMessagesCount.hashCode();
            }

            public String toString() {
                return wu0.a(new StringBuilder("UnreadCountIndicator(unreadMessagesCount="), this.unreadMessagesCount, ')');
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class UnreadDotIndicator implements TotalCountIndicator {
            public static final int $stable = 0;
            public static final UnreadDotIndicator INSTANCE = new UnreadDotIndicator();

            private UnreadDotIndicator() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof UnreadDotIndicator);
            }

            public int hashCode() {
                return -715258213;
            }

            public String toString() {
                return "UnreadDotIndicator";
            }
        }
    }

    public /* synthetic */ HeaderMenuItem(qq2 qq2Var) {
        this();
    }

    public abstract boolean getEnabled();

    public abstract StringProvider getLabel();

    private HeaderMenuItem() {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Messages extends HeaderMenuItem {
        public static final int $stable = StringProvider.$stable;
        private final boolean enabled;
        private final StringProvider label;
        private final TotalCountIndicator totalCountIndicator;
        private final String unreadMessagesCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Messages(TotalCountIndicator totalCountIndicator, String str, boolean z, StringProvider stringProvider) {
            super(null);
            totalCountIndicator.getClass();
            str.getClass();
            stringProvider.getClass();
            this.totalCountIndicator = totalCountIndicator;
            this.unreadMessagesCount = str;
            this.enabled = z;
            this.label = stringProvider;
        }

        public static /* synthetic */ Messages copy$default(Messages messages, TotalCountIndicator totalCountIndicator, String str, boolean z, StringProvider stringProvider, int i, Object obj) {
            if ((i & 1) != 0) {
                totalCountIndicator = messages.totalCountIndicator;
            }
            if ((i & 2) != 0) {
                str = messages.unreadMessagesCount;
            }
            if ((i & 4) != 0) {
                z = messages.enabled;
            }
            if ((i & 8) != 0) {
                stringProvider = messages.label;
            }
            return messages.copy(totalCountIndicator, str, z, stringProvider);
        }

        public final TotalCountIndicator component1() {
            return this.totalCountIndicator;
        }

        public final String component2() {
            return this.unreadMessagesCount;
        }

        public final boolean component3() {
            return this.enabled;
        }

        public final StringProvider component4() {
            return this.label;
        }

        public final Messages copy(TotalCountIndicator totalCountIndicator, String str, boolean z, StringProvider stringProvider) {
            totalCountIndicator.getClass();
            str.getClass();
            stringProvider.getClass();
            return new Messages(totalCountIndicator, str, z, stringProvider);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Messages)) {
                return false;
            }
            Messages messages = (Messages) obj;
            return xj5.a(this.totalCountIndicator, messages.totalCountIndicator) && xj5.a(this.unreadMessagesCount, messages.unreadMessagesCount) && this.enabled == messages.enabled && xj5.a(this.label, messages.label);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public boolean getEnabled() {
            return this.enabled;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem
        public StringProvider getLabel() {
            return this.label;
        }

        public final TotalCountIndicator getTotalCountIndicator() {
            return this.totalCountIndicator;
        }

        public final String getUnreadMessagesCount() {
            return this.unreadMessagesCount;
        }

        public int hashCode() {
            return this.label.hashCode() + uo2.a(ru3.c(this.totalCountIndicator.hashCode() * 31, 31, this.unreadMessagesCount), this.enabled, 31);
        }

        public String toString() {
            return "Messages(totalCountIndicator=" + this.totalCountIndicator + ", unreadMessagesCount=" + this.unreadMessagesCount + ", enabled=" + this.enabled + ", label=" + this.label + ')';
        }

        public /* synthetic */ Messages(TotalCountIndicator totalCountIndicator, String str, boolean z, StringProvider stringProvider, int i, qq2 qq2Var) {
            this(totalCountIndicator, str, (i & 4) != 0 ? true : z, stringProvider);
        }
    }
}
