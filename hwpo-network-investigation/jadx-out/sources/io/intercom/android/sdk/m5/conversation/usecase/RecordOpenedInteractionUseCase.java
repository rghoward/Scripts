package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.ws0;
import io.intercom.android.sdk.NotificationStatuses;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.models.Conversation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class RecordOpenedInteractionUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;

    public RecordOpenedInteractionUseCase(ConversationRepository conversationRepository) {
        conversationRepository.getClass();
        this.conversationRepository = conversationRepository;
    }

    private final boolean shouldRecordOpenedInteraction(Conversation conversation) {
        return ws0.i(NotificationStatuses.DELIVERED_STATUS, NotificationStatuses.RENOTIFYING_STATUS).contains(conversation.getNotificationStatus());
    }

    public final void invoke(Conversation conversation) {
        conversation.getClass();
        if (shouldRecordOpenedInteraction(conversation)) {
            this.conversationRepository.recordInteractions(conversation.getId(), new String[]{"opened"});
        }
    }
}
