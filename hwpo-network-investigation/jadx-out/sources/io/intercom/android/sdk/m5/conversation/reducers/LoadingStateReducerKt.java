package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LoadingStateReducerKt {
    public static final ConversationUiState.Loading reduceLoadingState(TopAppBarUiState topAppBarUiState) {
        topAppBarUiState.getClass();
        TopAppBarUiState topAppBarUiState2 = TopAppBarUiState.Companion.getDefault();
        return new ConversationUiState.Loading(topAppBarUiState2.m106copyN4y9b34((32765 & 1) != 0 ? topAppBarUiState2.title : null, (32765 & 2) != 0 ? topAppBarUiState2.navIcon : topAppBarUiState.getNavIcon(), (32765 & 4) != 0 ? topAppBarUiState2.subTitle : null, (32765 & 8) != 0 ? topAppBarUiState2.subTitleLeadingIcon : null, (32765 & 16) != 0 ? topAppBarUiState2.avatars : null, (32765 & 32) != 0 ? topAppBarUiState2.displayActiveIndicator : false, (32765 & 64) != 0 ? topAppBarUiState2.ticketStatusState : null, (32765 & 128) != 0 ? topAppBarUiState2.headerMenuItems : null, (32765 & 256) != 0 ? topAppBarUiState2.backgroundColor : null, (32765 & 512) != 0 ? topAppBarUiState2.backgroundColorDark : null, (32765 & 1024) != 0 ? topAppBarUiState2.contentColor : null, (32765 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? topAppBarUiState2.contentColorDark : null, (32765 & 4096) != 0 ? topAppBarUiState2.subTitleColor : null, (32765 & 8192) != 0 ? topAppBarUiState2.subTitleColorDark : null, (32765 & 16384) != 0 ? topAppBarUiState2.pushNotificationsBannerState : null));
    }
}
