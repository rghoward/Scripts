package io.intercom.android.sdk.m5.home.states;

import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class HomeUiEffects {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NavigateToConversation extends HomeUiEffects {
        public static final int $stable = 0;
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToConversation(String str) {
            super(null);
            str.getClass();
            this.conversationId = str;
        }

        public static /* synthetic */ NavigateToConversation copy$default(NavigateToConversation navigateToConversation, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToConversation.conversationId;
            }
            return navigateToConversation.copy(str);
        }

        public final String component1() {
            return this.conversationId;
        }

        public final NavigateToConversation copy(String str) {
            str.getClass();
            return new NavigateToConversation(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToConversation) && xj5.a(this.conversationId, ((NavigateToConversation) obj).conversationId);
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return this.conversationId.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("NavigateToConversation(conversationId="), this.conversationId, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NavigateToMessages extends HomeUiEffects {
        public static final int $stable = 0;
        public static final NavigateToMessages INSTANCE = new NavigateToMessages();

        private NavigateToMessages() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToMessages);
        }

        public int hashCode() {
            return 982177798;
        }

        public String toString() {
            return "NavigateToMessages";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NavigateToNewConversation extends HomeUiEffects {
        public static final int $stable = 0;
        public static final NavigateToNewConversation INSTANCE = new NavigateToNewConversation();

        private NavigateToNewConversation() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToNewConversation);
        }

        public int hashCode() {
            return 453078601;
        }

        public String toString() {
            return "NavigateToNewConversation";
        }
    }

    public /* synthetic */ HomeUiEffects(qq2 qq2Var) {
        this();
    }

    private HomeUiEffects() {
    }
}
