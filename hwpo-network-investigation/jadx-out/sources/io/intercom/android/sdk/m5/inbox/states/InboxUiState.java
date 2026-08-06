package io.intercom.android.sdk.m5.inbox.states;

import defpackage.a06;
import defpackage.if3;
import defpackage.qq2;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.ui.common.IntercomTopBarState;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class InboxUiState {
    public static final int $stable = IntercomTopBarState.$stable;
    private final IntercomTopBarState intercomTopBarState;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Empty extends InboxUiState {
        public static final int $stable = 0;
        private final EmptyState emptyState;
        private final boolean showActionButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Empty(IntercomTopBarState intercomTopBarState, EmptyState emptyState, boolean z) {
            super(intercomTopBarState);
            intercomTopBarState.getClass();
            emptyState.getClass();
            this.emptyState = emptyState;
            this.showActionButton = z;
        }

        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        public final boolean getShowActionButton() {
            return this.showActionButton;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Error extends InboxUiState {
        public static final int $stable = 0;
        private final ErrorState errorState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(IntercomTopBarState intercomTopBarState, ErrorState errorState) {
            super(intercomTopBarState);
            intercomTopBarState.getClass();
            errorState.getClass();
            this.errorState = errorState;
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Initial extends InboxUiState {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(IntercomTopBarState intercomTopBarState) {
            super(intercomTopBarState);
            intercomTopBarState.getClass();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Loading extends InboxUiState {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(IntercomTopBarState intercomTopBarState) {
            super(intercomTopBarState);
            intercomTopBarState.getClass();
        }
    }

    public InboxUiState(IntercomTopBarState intercomTopBarState) {
        intercomTopBarState.getClass();
        this.intercomTopBarState = intercomTopBarState;
    }

    public final IntercomTopBarState getIntercomTopBarState() {
        return this.intercomTopBarState;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Content extends InboxUiState {
        public static final int $stable = 8;
        private final ErrorState errorState;
        private final a06<Conversation> inboxConversations;
        private final boolean isLoadingMore;
        private final boolean showSendMessageFab;
        private final Map<String, CurrentlyTypingState> typingConversations;

        public /* synthetic */ Content(IntercomTopBarState intercomTopBarState, a06 a06Var, boolean z, boolean z2, ErrorState errorState, Map map, int i, qq2 qq2Var) {
            this(intercomTopBarState, a06Var, z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : errorState, (i & 32) != 0 ? if3.t : map);
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public final a06<Conversation> getInboxConversations() {
            return this.inboxConversations;
        }

        public final boolean getShowSendMessageFab() {
            return this.showSendMessageFab;
        }

        public final Map<String, CurrentlyTypingState> getTypingConversations() {
            return this.typingConversations;
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(IntercomTopBarState intercomTopBarState, a06<Conversation> a06Var, boolean z, boolean z2, ErrorState errorState, Map<String, CurrentlyTypingState> map) {
            super(intercomTopBarState);
            intercomTopBarState.getClass();
            a06Var.getClass();
            map.getClass();
            this.inboxConversations = a06Var;
            this.showSendMessageFab = z;
            this.isLoadingMore = z2;
            this.errorState = errorState;
            this.typingConversations = map;
        }
    }
}
