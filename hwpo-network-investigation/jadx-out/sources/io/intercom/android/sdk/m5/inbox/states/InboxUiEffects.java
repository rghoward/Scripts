package io.intercom.android.sdk.m5.inbox.states;

import defpackage.qq2;
import defpackage.xj5;
import io.intercom.android.sdk.models.Conversation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class InboxUiEffects {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NavigateToConversation extends InboxUiEffects {
        public static final int $stable = 8;
        private final Conversation conversation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToConversation(Conversation conversation) {
            super(null);
            conversation.getClass();
            this.conversation = conversation;
        }

        public static /* synthetic */ NavigateToConversation copy$default(NavigateToConversation navigateToConversation, Conversation conversation, int i, Object obj) {
            if ((i & 1) != 0) {
                conversation = navigateToConversation.conversation;
            }
            return navigateToConversation.copy(conversation);
        }

        public final Conversation component1() {
            return this.conversation;
        }

        public final NavigateToConversation copy(Conversation conversation) {
            conversation.getClass();
            return new NavigateToConversation(conversation);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToConversation) && xj5.a(this.conversation, ((NavigateToConversation) obj).conversation);
        }

        public final Conversation getConversation() {
            return this.conversation;
        }

        public int hashCode() {
            return this.conversation.hashCode();
        }

        public String toString() {
            return "NavigateToConversation(conversation=" + this.conversation + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class RefreshInbox extends InboxUiEffects {
        public static final int $stable = 0;
        public static final RefreshInbox INSTANCE = new RefreshInbox();

        private RefreshInbox() {
            super(null);
        }
    }

    public /* synthetic */ InboxUiEffects(qq2 qq2Var) {
        this();
    }

    private InboxUiEffects() {
    }
}
