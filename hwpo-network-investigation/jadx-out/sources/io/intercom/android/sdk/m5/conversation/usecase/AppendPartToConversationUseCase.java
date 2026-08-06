package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.i37;
import defpackage.th1;
import defpackage.xj5;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppendPartToConversationUseCase {
    public static final int $stable = 8;
    private final RecordOpenedInteractionUseCase recordOpenedInteractionUseCase;
    private final TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase;

    public AppendPartToConversationUseCase(TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase) {
        trackLastReceivedPartsUseCase.getClass();
        recordOpenedInteractionUseCase.getClass();
        this.trackLastReceivedPartsUseCase = trackLastReceivedPartsUseCase;
        this.recordOpenedInteractionUseCase = recordOpenedInteractionUseCase;
    }

    public final void invoke(i37<ConversationClientState> i37Var, Part.Builder builder) {
        i37Var.getClass();
        builder.getClass();
        Conversation conversation = i37Var.getValue().getConversation();
        if (conversation == null) {
            return;
        }
        Conversation conversationCopy$default = Conversation.copy$default(conversation, null, null, false, null, th1.L(conversation.getPartBuilderList(), builder), null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 2097135, null);
        Part part = (Part) th1.G(conversationCopy$default.parts());
        List<Part> listParts = conversation.parts();
        if (listParts == null || !listParts.isEmpty()) {
            for (Part part2 : listParts) {
                if (xj5.a(part2.getId(), part.getId())) {
                    return;
                }
                String uuid = part.getUuid();
                uuid.getClass();
                if (uuid.length() > 0 && xj5.a(part2.getUuid(), part.getUuid())) {
                    return;
                }
            }
        }
        this.trackLastReceivedPartsUseCase.invoke(conversationCopy$default);
        this.recordOpenedInteractionUseCase.invoke(conversationCopy$default);
        while (true) {
            ConversationClientState value = i37Var.getValue();
            Conversation conversation2 = conversationCopy$default;
            if (i37Var.c(value, ConversationClientState.copy$default(value, null, conversation2, null, new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null), null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388597, null))) {
                return;
            } else {
                conversationCopy$default = conversation2;
            }
        }
    }
}
