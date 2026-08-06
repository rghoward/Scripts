package io.intercom.android.sdk.m5.conversation.states;

import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import defpackage.ho2;
import defpackage.if3;
import defpackage.os2;
import defpackage.qq2;
import defpackage.uo2;
import defpackage.xj5;
import defpackage.zc6;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationClientState {
    public static final int $stable = 8;
    private final ArticleMetadata articleMetadata;
    private final BottomSheetState bottomSheetState;
    private final ComposerState composerState;
    private final Conversation conversation;
    private final String conversationId;
    private final CurrentlyTypingState currentlyTypingState;
    private final boolean dismissedPrivacyNotice;
    private final List<String> failedAttributeIdentifiers;
    private final FinStreamingData finStreamingData;
    private final FloatingIndicatorState floatingIndicatorState;
    private final boolean isConversationScrolled;
    private final NetworkResponse<Object> lastNetworkCall;
    private final LaunchMode launchMode;
    private final List<String> loadingAttributeIdentifiers;
    private final List<MediaUploadItem> mediaUploadItems;
    private final NetworkState networkState;
    private final String newMessageId;
    private final OpenMessengerResponse openMessengerResponse;
    private final Map<String, PendingMessage> pendingMessages;
    private final PushNotificationsBannerState pushNotificationsBannerState;
    private final int unreadConversationsCount;
    private final int unreadTicketsCount;
    private final VoiceTranscriptionState voiceTranscriptionState;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ConversationClientState(Map map, Conversation conversation, String str, CurrentlyTypingState currentlyTypingState, ComposerState composerState, BottomSheetState bottomSheetState, LaunchMode launchMode, NetworkResponse networkResponse, ArticleMetadata articleMetadata, NetworkState networkState, List list, List list2, FinStreamingData finStreamingData, OpenMessengerResponse openMessengerResponse, int i, int i2, FloatingIndicatorState floatingIndicatorState, String str2, boolean z, boolean z2, PushNotificationsBannerState pushNotificationsBannerState, VoiceTranscriptionState voiceTranscriptionState, List list3, int i3, qq2 qq2Var) {
        Map map2 = (i3 & 1) != 0 ? if3.t : map;
        List list4 = null;
        Object[] objArr = 0;
        Conversation conversation2 = (i3 & 2) != 0 ? null : conversation;
        String str3 = (i3 & 4) != 0 ? null : str;
        CurrentlyTypingState currentlyTypingState2 = (i3 & 8) != 0 ? new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null) : currentlyTypingState;
        ComposerState textInput = (i3 & 16) != 0 ? new ComposerState.TextInput(BuildConfig.FLAVOR, new StringProvider.StringRes(R.string.intercom_reply_to_conversation, list4, 2, objArr == true ? 1 : 0), false, null, null, null, 60, null) : composerState;
        BottomSheetState bottomSheetState2 = (i3 & 32) != 0 ? BottomSheetState.Empty.INSTANCE : bottomSheetState;
        LaunchMode launchMode2 = (i3 & 64) != 0 ? LaunchMode.CLASSIC : launchMode;
        NetworkResponse networkResponse2 = (i3 & 128) != 0 ? null : networkResponse;
        ArticleMetadata articleMetadata2 = (i3 & 256) != 0 ? null : articleMetadata;
        NetworkState networkState2 = (i3 & 512) != 0 ? NetworkState.Connected.INSTANCE : networkState;
        int i4 = i3 & 1024;
        hf3 hf3Var = hf3.t;
        this(map2, conversation2, str3, currentlyTypingState2, textInput, bottomSheetState2, launchMode2, networkResponse2, articleMetadata2, networkState2, i4 != 0 ? hf3Var : list, (i3 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? hf3Var : list2, (i3 & 4096) != 0 ? new FinStreamingData(false, hf3Var, BuildConfig.FLAVOR, 0) : finStreamingData, (i3 & 8192) != 0 ? null : openMessengerResponse, (i3 & 16384) != 0 ? 0 : i, (i3 & 32768) != 0 ? 0 : i2, (i3 & 65536) != 0 ? FloatingIndicatorState.None.INSTANCE : floatingIndicatorState, (i3 & 131072) != 0 ? null : str2, (i3 & 262144) != 0 ? false : z, (i3 & 524288) != 0 ? false : z2, (i3 & 1048576) != 0 ? null : pushNotificationsBannerState, (i3 & 2097152) != 0 ? VoiceTranscriptionState.Idle.INSTANCE : voiceTranscriptionState, (i3 & 4194304) != 0 ? hf3Var : list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationClientState copy$default(ConversationClientState conversationClientState, Map map, Conversation conversation, String str, CurrentlyTypingState currentlyTypingState, ComposerState composerState, BottomSheetState bottomSheetState, LaunchMode launchMode, NetworkResponse networkResponse, ArticleMetadata articleMetadata, NetworkState networkState, List list, List list2, FinStreamingData finStreamingData, OpenMessengerResponse openMessengerResponse, int i, int i2, FloatingIndicatorState floatingIndicatorState, String str2, boolean z, boolean z2, PushNotificationsBannerState pushNotificationsBannerState, VoiceTranscriptionState voiceTranscriptionState, List list3, int i3, Object obj) {
        List list4;
        VoiceTranscriptionState voiceTranscriptionState2;
        Map map2 = (i3 & 1) != 0 ? conversationClientState.pendingMessages : map;
        Conversation conversation2 = (i3 & 2) != 0 ? conversationClientState.conversation : conversation;
        String str3 = (i3 & 4) != 0 ? conversationClientState.conversationId : str;
        CurrentlyTypingState currentlyTypingState2 = (i3 & 8) != 0 ? conversationClientState.currentlyTypingState : currentlyTypingState;
        ComposerState composerState2 = (i3 & 16) != 0 ? conversationClientState.composerState : composerState;
        BottomSheetState bottomSheetState2 = (i3 & 32) != 0 ? conversationClientState.bottomSheetState : bottomSheetState;
        LaunchMode launchMode2 = (i3 & 64) != 0 ? conversationClientState.launchMode : launchMode;
        NetworkResponse networkResponse2 = (i3 & 128) != 0 ? conversationClientState.lastNetworkCall : networkResponse;
        ArticleMetadata articleMetadata2 = (i3 & 256) != 0 ? conversationClientState.articleMetadata : articleMetadata;
        NetworkState networkState2 = (i3 & 512) != 0 ? conversationClientState.networkState : networkState;
        List list5 = (i3 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : list;
        List list6 = (i3 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? conversationClientState.loadingAttributeIdentifiers : list2;
        FinStreamingData finStreamingData2 = (i3 & 4096) != 0 ? conversationClientState.finStreamingData : finStreamingData;
        OpenMessengerResponse openMessengerResponse2 = (i3 & 8192) != 0 ? conversationClientState.openMessengerResponse : openMessengerResponse;
        Map map3 = map2;
        int i4 = (i3 & 16384) != 0 ? conversationClientState.unreadConversationsCount : i;
        int i5 = (i3 & 32768) != 0 ? conversationClientState.unreadTicketsCount : i2;
        FloatingIndicatorState floatingIndicatorState2 = (i3 & 65536) != 0 ? conversationClientState.floatingIndicatorState : floatingIndicatorState;
        String str4 = (i3 & 131072) != 0 ? conversationClientState.newMessageId : str2;
        boolean z3 = (i3 & 262144) != 0 ? conversationClientState.isConversationScrolled : z;
        boolean z4 = (i3 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : z2;
        PushNotificationsBannerState pushNotificationsBannerState2 = (i3 & 1048576) != 0 ? conversationClientState.pushNotificationsBannerState : pushNotificationsBannerState;
        VoiceTranscriptionState voiceTranscriptionState3 = (i3 & 2097152) != 0 ? conversationClientState.voiceTranscriptionState : voiceTranscriptionState;
        if ((i3 & 4194304) != 0) {
            voiceTranscriptionState2 = voiceTranscriptionState3;
            list4 = conversationClientState.mediaUploadItems;
        } else {
            list4 = list3;
            voiceTranscriptionState2 = voiceTranscriptionState3;
        }
        return conversationClientState.copy(map3, conversation2, str3, currentlyTypingState2, composerState2, bottomSheetState2, launchMode2, networkResponse2, articleMetadata2, networkState2, list5, list6, finStreamingData2, openMessengerResponse2, i4, i5, floatingIndicatorState2, str4, z3, z4, pushNotificationsBannerState2, voiceTranscriptionState2, list4);
    }

    public final Map<String, PendingMessage> component1() {
        return this.pendingMessages;
    }

    public final NetworkState component10() {
        return this.networkState;
    }

    public final List<String> component11() {
        return this.failedAttributeIdentifiers;
    }

    public final List<String> component12() {
        return this.loadingAttributeIdentifiers;
    }

    public final FinStreamingData component13() {
        return this.finStreamingData;
    }

    public final OpenMessengerResponse component14() {
        return this.openMessengerResponse;
    }

    public final int component15() {
        return this.unreadConversationsCount;
    }

    public final int component16() {
        return this.unreadTicketsCount;
    }

    public final FloatingIndicatorState component17() {
        return this.floatingIndicatorState;
    }

    public final String component18() {
        return this.newMessageId;
    }

    public final boolean component19() {
        return this.isConversationScrolled;
    }

    public final Conversation component2() {
        return this.conversation;
    }

    public final boolean component20() {
        return this.dismissedPrivacyNotice;
    }

    public final PushNotificationsBannerState component21() {
        return this.pushNotificationsBannerState;
    }

    public final VoiceTranscriptionState component22() {
        return this.voiceTranscriptionState;
    }

    public final List<MediaUploadItem> component23() {
        return this.mediaUploadItems;
    }

    public final String component3() {
        return this.conversationId;
    }

    public final CurrentlyTypingState component4() {
        return this.currentlyTypingState;
    }

    public final ComposerState component5() {
        return this.composerState;
    }

    public final BottomSheetState component6() {
        return this.bottomSheetState;
    }

    public final LaunchMode component7() {
        return this.launchMode;
    }

    public final NetworkResponse<Object> component8() {
        return this.lastNetworkCall;
    }

    public final ArticleMetadata component9() {
        return this.articleMetadata;
    }

    public final ConversationClientState copy(Map<String, PendingMessage> map, Conversation conversation, String str, CurrentlyTypingState currentlyTypingState, ComposerState composerState, BottomSheetState bottomSheetState, LaunchMode launchMode, NetworkResponse<? extends Object> networkResponse, ArticleMetadata articleMetadata, NetworkState networkState, List<String> list, List<String> list2, FinStreamingData finStreamingData, OpenMessengerResponse openMessengerResponse, int i, int i2, FloatingIndicatorState floatingIndicatorState, String str2, boolean z, boolean z2, PushNotificationsBannerState pushNotificationsBannerState, VoiceTranscriptionState voiceTranscriptionState, List<MediaUploadItem> list3) {
        map.getClass();
        currentlyTypingState.getClass();
        composerState.getClass();
        bottomSheetState.getClass();
        launchMode.getClass();
        networkState.getClass();
        list.getClass();
        list2.getClass();
        finStreamingData.getClass();
        floatingIndicatorState.getClass();
        voiceTranscriptionState.getClass();
        list3.getClass();
        return new ConversationClientState(map, conversation, str, currentlyTypingState, composerState, bottomSheetState, launchMode, networkResponse, articleMetadata, networkState, list, list2, finStreamingData, openMessengerResponse, i, i2, floatingIndicatorState, str2, z, z2, pushNotificationsBannerState, voiceTranscriptionState, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationClientState)) {
            return false;
        }
        ConversationClientState conversationClientState = (ConversationClientState) obj;
        return xj5.a(this.pendingMessages, conversationClientState.pendingMessages) && xj5.a(this.conversation, conversationClientState.conversation) && xj5.a(this.conversationId, conversationClientState.conversationId) && xj5.a(this.currentlyTypingState, conversationClientState.currentlyTypingState) && xj5.a(this.composerState, conversationClientState.composerState) && xj5.a(this.bottomSheetState, conversationClientState.bottomSheetState) && this.launchMode == conversationClientState.launchMode && xj5.a(this.lastNetworkCall, conversationClientState.lastNetworkCall) && xj5.a(this.articleMetadata, conversationClientState.articleMetadata) && xj5.a(this.networkState, conversationClientState.networkState) && xj5.a(this.failedAttributeIdentifiers, conversationClientState.failedAttributeIdentifiers) && xj5.a(this.loadingAttributeIdentifiers, conversationClientState.loadingAttributeIdentifiers) && xj5.a(this.finStreamingData, conversationClientState.finStreamingData) && xj5.a(this.openMessengerResponse, conversationClientState.openMessengerResponse) && this.unreadConversationsCount == conversationClientState.unreadConversationsCount && this.unreadTicketsCount == conversationClientState.unreadTicketsCount && xj5.a(this.floatingIndicatorState, conversationClientState.floatingIndicatorState) && xj5.a(this.newMessageId, conversationClientState.newMessageId) && this.isConversationScrolled == conversationClientState.isConversationScrolled && this.dismissedPrivacyNotice == conversationClientState.dismissedPrivacyNotice && xj5.a(this.pushNotificationsBannerState, conversationClientState.pushNotificationsBannerState) && xj5.a(this.voiceTranscriptionState, conversationClientState.voiceTranscriptionState) && xj5.a(this.mediaUploadItems, conversationClientState.mediaUploadItems);
    }

    public final ArticleMetadata getArticleMetadata() {
        return this.articleMetadata;
    }

    public final BottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public final Conversation getConversation() {
        return this.conversation;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final CurrentlyTypingState getCurrentlyTypingState() {
        return this.currentlyTypingState;
    }

    public final boolean getDismissedPrivacyNotice() {
        return this.dismissedPrivacyNotice;
    }

    public final List<String> getFailedAttributeIdentifiers() {
        return this.failedAttributeIdentifiers;
    }

    public final FinStreamingData getFinStreamingData() {
        return this.finStreamingData;
    }

    public final FloatingIndicatorState getFloatingIndicatorState() {
        return this.floatingIndicatorState;
    }

    public final NetworkResponse<Object> getLastNetworkCall() {
        return this.lastNetworkCall;
    }

    public final LaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final List<String> getLoadingAttributeIdentifiers() {
        return this.loadingAttributeIdentifiers;
    }

    public final List<MediaUploadItem> getMediaUploadItems() {
        return this.mediaUploadItems;
    }

    public final NetworkState getNetworkState() {
        return this.networkState;
    }

    public final String getNewMessageId() {
        return this.newMessageId;
    }

    public final OpenMessengerResponse getOpenMessengerResponse() {
        return this.openMessengerResponse;
    }

    public final Map<String, PendingMessage> getPendingMessages() {
        return this.pendingMessages;
    }

    public final PushNotificationsBannerState getPushNotificationsBannerState() {
        return this.pushNotificationsBannerState;
    }

    public final int getUnreadConversationsCount() {
        return this.unreadConversationsCount;
    }

    public final int getUnreadTicketsCount() {
        return this.unreadTicketsCount;
    }

    public final VoiceTranscriptionState getVoiceTranscriptionState() {
        return this.voiceTranscriptionState;
    }

    public final boolean hasUserSentAMessage$intercom_sdk_base_release() {
        List<Part> listParts;
        if (!this.pendingMessages.isEmpty()) {
            return true;
        }
        Conversation conversation = this.conversation;
        if (conversation == null || (listParts = conversation.parts()) == null || listParts.isEmpty()) {
            return false;
        }
        Iterator<T> it = listParts.iterator();
        while (it.hasNext()) {
            if (((Part) it.next()).isUser()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.pendingMessages.hashCode() * 31;
        Conversation conversation = this.conversation;
        int iHashCode2 = (iHashCode + (conversation == null ? 0 : conversation.hashCode())) * 31;
        String str = this.conversationId;
        int iHashCode3 = (this.launchMode.hashCode() + ((this.bottomSheetState.hashCode() + ((this.composerState.hashCode() + ((this.currentlyTypingState.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        NetworkResponse<Object> networkResponse = this.lastNetworkCall;
        int iHashCode4 = (iHashCode3 + (networkResponse == null ? 0 : networkResponse.hashCode())) * 31;
        ArticleMetadata articleMetadata = this.articleMetadata;
        int iHashCode5 = (this.finStreamingData.hashCode() + ho2.a(ho2.a((this.networkState.hashCode() + ((iHashCode4 + (articleMetadata == null ? 0 : articleMetadata.hashCode())) * 31)) * 31, 31, this.failedAttributeIdentifiers), 31, this.loadingAttributeIdentifiers)) * 31;
        OpenMessengerResponse openMessengerResponse = this.openMessengerResponse;
        int iHashCode6 = (this.floatingIndicatorState.hashCode() + os2.a(this.unreadTicketsCount, os2.a(this.unreadConversationsCount, (iHashCode5 + (openMessengerResponse == null ? 0 : openMessengerResponse.hashCode())) * 31, 31), 31)) * 31;
        String str2 = this.newMessageId;
        int iA = uo2.a(uo2.a((iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31, this.isConversationScrolled, 31), this.dismissedPrivacyNotice, 31);
        PushNotificationsBannerState pushNotificationsBannerState = this.pushNotificationsBannerState;
        int iHashCode7 = pushNotificationsBannerState != null ? pushNotificationsBannerState.hashCode() : 0;
        return this.mediaUploadItems.hashCode() + ((this.voiceTranscriptionState.hashCode() + ((iA + iHashCode7) * 31)) * 31);
    }

    public final boolean isConversationScrolled() {
        return this.isConversationScrolled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConversationClientState(pendingMessages=");
        sb.append(this.pendingMessages);
        sb.append(", conversation=");
        sb.append(this.conversation);
        sb.append(", conversationId=");
        sb.append(this.conversationId);
        sb.append(", currentlyTypingState=");
        sb.append(this.currentlyTypingState);
        sb.append(", composerState=");
        sb.append(this.composerState);
        sb.append(", bottomSheetState=");
        sb.append(this.bottomSheetState);
        sb.append(", launchMode=");
        sb.append(this.launchMode);
        sb.append(", lastNetworkCall=");
        sb.append(this.lastNetworkCall);
        sb.append(", articleMetadata=");
        sb.append(this.articleMetadata);
        sb.append(", networkState=");
        sb.append(this.networkState);
        sb.append(", failedAttributeIdentifiers=");
        sb.append(this.failedAttributeIdentifiers);
        sb.append(", loadingAttributeIdentifiers=");
        sb.append(this.loadingAttributeIdentifiers);
        sb.append(", finStreamingData=");
        sb.append(this.finStreamingData);
        sb.append(", openMessengerResponse=");
        sb.append(this.openMessengerResponse);
        sb.append(", unreadConversationsCount=");
        sb.append(this.unreadConversationsCount);
        sb.append(", unreadTicketsCount=");
        sb.append(this.unreadTicketsCount);
        sb.append(", floatingIndicatorState=");
        sb.append(this.floatingIndicatorState);
        sb.append(", newMessageId=");
        sb.append(this.newMessageId);
        sb.append(", isConversationScrolled=");
        sb.append(this.isConversationScrolled);
        sb.append(", dismissedPrivacyNotice=");
        sb.append(this.dismissedPrivacyNotice);
        sb.append(", pushNotificationsBannerState=");
        sb.append(this.pushNotificationsBannerState);
        sb.append(", voiceTranscriptionState=");
        sb.append(this.voiceTranscriptionState);
        sb.append(", mediaUploadItems=");
        return zc6.a(sb, this.mediaUploadItems, ')');
    }

    public ConversationClientState(Map<String, PendingMessage> map, Conversation conversation, String str, CurrentlyTypingState currentlyTypingState, ComposerState composerState, BottomSheetState bottomSheetState, LaunchMode launchMode, NetworkResponse<? extends Object> networkResponse, ArticleMetadata articleMetadata, NetworkState networkState, List<String> list, List<String> list2, FinStreamingData finStreamingData, OpenMessengerResponse openMessengerResponse, int i, int i2, FloatingIndicatorState floatingIndicatorState, String str2, boolean z, boolean z2, PushNotificationsBannerState pushNotificationsBannerState, VoiceTranscriptionState voiceTranscriptionState, List<MediaUploadItem> list3) {
        map.getClass();
        currentlyTypingState.getClass();
        composerState.getClass();
        bottomSheetState.getClass();
        launchMode.getClass();
        networkState.getClass();
        list.getClass();
        list2.getClass();
        finStreamingData.getClass();
        floatingIndicatorState.getClass();
        voiceTranscriptionState.getClass();
        list3.getClass();
        this.pendingMessages = map;
        this.conversation = conversation;
        this.conversationId = str;
        this.currentlyTypingState = currentlyTypingState;
        this.composerState = composerState;
        this.bottomSheetState = bottomSheetState;
        this.launchMode = launchMode;
        this.lastNetworkCall = networkResponse;
        this.articleMetadata = articleMetadata;
        this.networkState = networkState;
        this.failedAttributeIdentifiers = list;
        this.loadingAttributeIdentifiers = list2;
        this.finStreamingData = finStreamingData;
        this.openMessengerResponse = openMessengerResponse;
        this.unreadConversationsCount = i;
        this.unreadTicketsCount = i2;
        this.floatingIndicatorState = floatingIndicatorState;
        this.newMessageId = str2;
        this.isConversationScrolled = z;
        this.dismissedPrivacyNotice = z2;
        this.pushNotificationsBannerState = pushNotificationsBannerState;
        this.voiceTranscriptionState = voiceTranscriptionState;
        this.mediaUploadItems = list3;
    }

    public ConversationClientState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388607, null);
    }
}
