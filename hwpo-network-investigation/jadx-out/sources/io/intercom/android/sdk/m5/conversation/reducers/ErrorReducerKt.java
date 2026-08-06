package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseKt;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ErrorReducerKt {
    public static final ConversationUiState reduceError(NetworkResponse<? extends Object> networkResponse, TopAppBarUiState topAppBarUiState) {
        networkResponse.getClass();
        topAppBarUiState.getClass();
        return new ConversationUiState.Error(NetworkResponseKt.isRetryable(networkResponse), topAppBarUiState);
    }
}
