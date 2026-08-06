package io.intercom.android.sdk.m5.conversation.metrics;

import defpackage.pi1;
import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class MetricData {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ComposerInputClicked extends MetricData {
        public static final int $stable = 0;
        private final String input;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComposerInputClicked(String str) {
            super(null);
            str.getClass();
            this.input = str;
        }

        public static /* synthetic */ ComposerInputClicked copy$default(ComposerInputClicked composerInputClicked, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = composerInputClicked.input;
            }
            return composerInputClicked.copy(str);
        }

        public final String component1() {
            return this.input;
        }

        public final ComposerInputClicked copy(String str) {
            str.getClass();
            return new ComposerInputClicked(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ComposerInputClicked) && xj5.a(this.input, ((ComposerInputClicked) obj).input);
        }

        public final String getInput() {
            return this.input;
        }

        public int hashCode() {
            return this.input.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("ComposerInputClicked(input="), this.input, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ConversationsInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        private final boolean isMoreMenuContext;

        public ConversationsInMoreMenuClicked(boolean z) {
            super(null);
            this.isMoreMenuContext = z;
        }

        public static /* synthetic */ ConversationsInMoreMenuClicked copy$default(ConversationsInMoreMenuClicked conversationsInMoreMenuClicked, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = conversationsInMoreMenuClicked.isMoreMenuContext;
            }
            return conversationsInMoreMenuClicked.copy(z);
        }

        public final boolean component1() {
            return this.isMoreMenuContext;
        }

        public final ConversationsInMoreMenuClicked copy(boolean z) {
            return new ConversationsInMoreMenuClicked(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConversationsInMoreMenuClicked) && this.isMoreMenuContext == ((ConversationsInMoreMenuClicked) obj).isMoreMenuContext;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMoreMenuContext);
        }

        public final boolean isMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        public String toString() {
            return pi1.a(new StringBuilder("ConversationsInMoreMenuClicked(isMoreMenuContext="), this.isMoreMenuContext, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class HelpInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        public static final HelpInMoreMenuClicked INSTANCE = new HelpInMoreMenuClicked();

        private HelpInMoreMenuClicked() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class MoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        public static final MoreMenuClicked INSTANCE = new MoreMenuClicked();

        private MoreMenuClicked() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NewConversationInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        private final boolean isMoreMenuContext;

        public NewConversationInMoreMenuClicked(boolean z) {
            super(null);
            this.isMoreMenuContext = z;
        }

        public static /* synthetic */ NewConversationInMoreMenuClicked copy$default(NewConversationInMoreMenuClicked newConversationInMoreMenuClicked, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = newConversationInMoreMenuClicked.isMoreMenuContext;
            }
            return newConversationInMoreMenuClicked.copy(z);
        }

        public final boolean component1() {
            return this.isMoreMenuContext;
        }

        public final NewConversationInMoreMenuClicked copy(boolean z) {
            return new NewConversationInMoreMenuClicked(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewConversationInMoreMenuClicked) && this.isMoreMenuContext == ((NewConversationInMoreMenuClicked) obj).isMoreMenuContext;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMoreMenuContext);
        }

        public final boolean isMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        public String toString() {
            return pi1.a(new StringBuilder("NewConversationInMoreMenuClicked(isMoreMenuContext="), this.isMoreMenuContext, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class PoweredByClicked extends MetricData {
        public static final int $stable = 0;
        public static final PoweredByClicked INSTANCE = new PoweredByClicked();

        private PoweredByClicked() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class TicketsInMoreMenuClicked extends MetricData {
        public static final int $stable = 0;
        private final boolean isMoreMenuContext;

        public TicketsInMoreMenuClicked(boolean z) {
            super(null);
            this.isMoreMenuContext = z;
        }

        public static /* synthetic */ TicketsInMoreMenuClicked copy$default(TicketsInMoreMenuClicked ticketsInMoreMenuClicked, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = ticketsInMoreMenuClicked.isMoreMenuContext;
            }
            return ticketsInMoreMenuClicked.copy(z);
        }

        public final boolean component1() {
            return this.isMoreMenuContext;
        }

        public final TicketsInMoreMenuClicked copy(boolean z) {
            return new TicketsInMoreMenuClicked(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TicketsInMoreMenuClicked) && this.isMoreMenuContext == ((TicketsInMoreMenuClicked) obj).isMoreMenuContext;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isMoreMenuContext);
        }

        public final boolean isMoreMenuContext() {
            return this.isMoreMenuContext;
        }

        public String toString() {
            return pi1.a(new StringBuilder("TicketsInMoreMenuClicked(isMoreMenuContext="), this.isMoreMenuContext, ')');
        }
    }

    public /* synthetic */ MetricData(qq2 qq2Var) {
        this();
    }

    private MetricData() {
    }
}
