package io.intercom.android.sdk.m5.conversation.states;

import defpackage.ho2;
import defpackage.qq2;
import defpackage.xj5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface ConversationUiState {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Error implements ConversationUiState {
        public static final int $stable = 8;
        private final boolean showCta;
        private final TopAppBarUiState topAppBarUiState;

        public Error(boolean z, TopAppBarUiState topAppBarUiState) {
            topAppBarUiState.getClass();
            this.showCta = z;
            this.topAppBarUiState = topAppBarUiState;
        }

        public static /* synthetic */ Error copy$default(Error error, boolean z, TopAppBarUiState topAppBarUiState, int i, Object obj) {
            if ((i & 1) != 0) {
                z = error.showCta;
            }
            if ((i & 2) != 0) {
                topAppBarUiState = error.topAppBarUiState;
            }
            return error.copy(z, topAppBarUiState);
        }

        public final boolean component1() {
            return this.showCta;
        }

        public final TopAppBarUiState component2() {
            return this.topAppBarUiState;
        }

        public final Error copy(boolean z, TopAppBarUiState topAppBarUiState) {
            topAppBarUiState.getClass();
            return new Error(z, topAppBarUiState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.showCta == error.showCta && xj5.a(this.topAppBarUiState, error.topAppBarUiState);
        }

        public final boolean getShowCta() {
            return this.showCta;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ConversationUiState
        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public int hashCode() {
            return this.topAppBarUiState.hashCode() + (Boolean.hashCode(this.showCta) * 31);
        }

        public String toString() {
            return "Error(showCta=" + this.showCta + ", topAppBarUiState=" + this.topAppBarUiState + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Loading implements ConversationUiState {
        public static final int $stable = 8;
        private final TopAppBarUiState topAppBarUiState;

        public Loading(TopAppBarUiState topAppBarUiState) {
            topAppBarUiState.getClass();
            this.topAppBarUiState = topAppBarUiState;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, TopAppBarUiState topAppBarUiState, int i, Object obj) {
            if ((i & 1) != 0) {
                topAppBarUiState = loading.topAppBarUiState;
            }
            return loading.copy(topAppBarUiState);
        }

        public final TopAppBarUiState component1() {
            return this.topAppBarUiState;
        }

        public final Loading copy(TopAppBarUiState topAppBarUiState) {
            topAppBarUiState.getClass();
            return new Loading(topAppBarUiState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && xj5.a(this.topAppBarUiState, ((Loading) obj).topAppBarUiState);
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ConversationUiState
        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public int hashCode() {
            return this.topAppBarUiState.hashCode();
        }

        public String toString() {
            return "Loading(topAppBarUiState=" + this.topAppBarUiState + ')';
        }
    }

    TopAppBarUiState getTopAppBarUiState();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Content implements ConversationUiState {
        public static final int $stable = 8;
        private final BottomBarUiState bottomBarUiState;
        private final BottomSheetState bottomSheetState;
        private final List<ContentRow> contentRows;
        private final FloatingIndicatorState floatingIndicatorState;
        private final NetworkState networkState;
        private final TeamPresenceState teamPresenceState;
        private final TopAppBarUiState topAppBarUiState;
        private final VoiceTranscriptionState voiceTranscriptionState;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(TopAppBarUiState topAppBarUiState, List<? extends ContentRow> list, BottomBarUiState bottomBarUiState, NetworkState networkState, BottomSheetState bottomSheetState, FloatingIndicatorState floatingIndicatorState, TeamPresenceState teamPresenceState, VoiceTranscriptionState voiceTranscriptionState) {
            topAppBarUiState.getClass();
            list.getClass();
            bottomBarUiState.getClass();
            networkState.getClass();
            bottomSheetState.getClass();
            floatingIndicatorState.getClass();
            teamPresenceState.getClass();
            voiceTranscriptionState.getClass();
            this.topAppBarUiState = topAppBarUiState;
            this.contentRows = list;
            this.bottomBarUiState = bottomBarUiState;
            this.networkState = networkState;
            this.bottomSheetState = bottomSheetState;
            this.floatingIndicatorState = floatingIndicatorState;
            this.teamPresenceState = teamPresenceState;
            this.voiceTranscriptionState = voiceTranscriptionState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, TopAppBarUiState topAppBarUiState, List list, BottomBarUiState bottomBarUiState, NetworkState networkState, BottomSheetState bottomSheetState, FloatingIndicatorState floatingIndicatorState, TeamPresenceState teamPresenceState, VoiceTranscriptionState voiceTranscriptionState, int i, Object obj) {
            if ((i & 1) != 0) {
                topAppBarUiState = content.topAppBarUiState;
            }
            if ((i & 2) != 0) {
                list = content.contentRows;
            }
            if ((i & 4) != 0) {
                bottomBarUiState = content.bottomBarUiState;
            }
            if ((i & 8) != 0) {
                networkState = content.networkState;
            }
            if ((i & 16) != 0) {
                bottomSheetState = content.bottomSheetState;
            }
            if ((i & 32) != 0) {
                floatingIndicatorState = content.floatingIndicatorState;
            }
            if ((i & 64) != 0) {
                teamPresenceState = content.teamPresenceState;
            }
            if ((i & 128) != 0) {
                voiceTranscriptionState = content.voiceTranscriptionState;
            }
            TeamPresenceState teamPresenceState2 = teamPresenceState;
            VoiceTranscriptionState voiceTranscriptionState2 = voiceTranscriptionState;
            BottomSheetState bottomSheetState2 = bottomSheetState;
            FloatingIndicatorState floatingIndicatorState2 = floatingIndicatorState;
            return content.copy(topAppBarUiState, list, bottomBarUiState, networkState, bottomSheetState2, floatingIndicatorState2, teamPresenceState2, voiceTranscriptionState2);
        }

        public final TopAppBarUiState component1() {
            return this.topAppBarUiState;
        }

        public final List<ContentRow> component2() {
            return this.contentRows;
        }

        public final BottomBarUiState component3() {
            return this.bottomBarUiState;
        }

        public final NetworkState component4() {
            return this.networkState;
        }

        public final BottomSheetState component5() {
            return this.bottomSheetState;
        }

        public final FloatingIndicatorState component6() {
            return this.floatingIndicatorState;
        }

        public final TeamPresenceState component7() {
            return this.teamPresenceState;
        }

        public final VoiceTranscriptionState component8() {
            return this.voiceTranscriptionState;
        }

        public final Content copy(TopAppBarUiState topAppBarUiState, List<? extends ContentRow> list, BottomBarUiState bottomBarUiState, NetworkState networkState, BottomSheetState bottomSheetState, FloatingIndicatorState floatingIndicatorState, TeamPresenceState teamPresenceState, VoiceTranscriptionState voiceTranscriptionState) {
            topAppBarUiState.getClass();
            list.getClass();
            bottomBarUiState.getClass();
            networkState.getClass();
            bottomSheetState.getClass();
            floatingIndicatorState.getClass();
            teamPresenceState.getClass();
            voiceTranscriptionState.getClass();
            return new Content(topAppBarUiState, list, bottomBarUiState, networkState, bottomSheetState, floatingIndicatorState, teamPresenceState, voiceTranscriptionState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return xj5.a(this.topAppBarUiState, content.topAppBarUiState) && xj5.a(this.contentRows, content.contentRows) && xj5.a(this.bottomBarUiState, content.bottomBarUiState) && xj5.a(this.networkState, content.networkState) && xj5.a(this.bottomSheetState, content.bottomSheetState) && xj5.a(this.floatingIndicatorState, content.floatingIndicatorState) && xj5.a(this.teamPresenceState, content.teamPresenceState) && xj5.a(this.voiceTranscriptionState, content.voiceTranscriptionState);
        }

        public final BottomBarUiState getBottomBarUiState() {
            return this.bottomBarUiState;
        }

        public final BottomSheetState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final List<ContentRow> getContentRows() {
            return this.contentRows;
        }

        public final FloatingIndicatorState getFloatingIndicatorState() {
            return this.floatingIndicatorState;
        }

        public final NetworkState getNetworkState() {
            return this.networkState;
        }

        public final TeamPresenceState getTeamPresenceState() {
            return this.teamPresenceState;
        }

        @Override // io.intercom.android.sdk.m5.conversation.states.ConversationUiState
        public TopAppBarUiState getTopAppBarUiState() {
            return this.topAppBarUiState;
        }

        public final VoiceTranscriptionState getVoiceTranscriptionState() {
            return this.voiceTranscriptionState;
        }

        public int hashCode() {
            return this.voiceTranscriptionState.hashCode() + ((this.teamPresenceState.hashCode() + ((this.floatingIndicatorState.hashCode() + ((this.bottomSheetState.hashCode() + ((this.networkState.hashCode() + ((this.bottomBarUiState.hashCode() + ho2.a(this.topAppBarUiState.hashCode() * 31, 31, this.contentRows)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "Content(topAppBarUiState=" + this.topAppBarUiState + ", contentRows=" + this.contentRows + ", bottomBarUiState=" + this.bottomBarUiState + ", networkState=" + this.networkState + ", bottomSheetState=" + this.bottomSheetState + ", floatingIndicatorState=" + this.floatingIndicatorState + ", teamPresenceState=" + this.teamPresenceState + ", voiceTranscriptionState=" + this.voiceTranscriptionState + ')';
        }

        public /* synthetic */ Content(TopAppBarUiState topAppBarUiState, List list, BottomBarUiState bottomBarUiState, NetworkState networkState, BottomSheetState bottomSheetState, FloatingIndicatorState floatingIndicatorState, TeamPresenceState teamPresenceState, VoiceTranscriptionState voiceTranscriptionState, int i, qq2 qq2Var) {
            this(topAppBarUiState, list, bottomBarUiState, (i & 8) != 0 ? NetworkState.Connected.INSTANCE : networkState, (i & 16) != 0 ? BottomSheetState.Empty.INSTANCE : bottomSheetState, floatingIndicatorState, teamPresenceState, (i & 128) != 0 ? VoiceTranscriptionState.Idle.INSTANCE : voiceTranscriptionState);
        }
    }
}
