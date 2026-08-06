package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.hf3;
import defpackage.js7;
import defpackage.th1;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.JumpToBottomButtonState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class RefreshConversationUseCaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final js7<FloatingIndicatorState, String> calculateJumpToBottomButtonState(ConversationClientState conversationClientState, Conversation conversation, List<? extends Part> list) {
        if (conversationClientState.getFloatingIndicatorState() instanceof FloatingIndicatorState.JumpToBottomIndicator) {
            String newMessageId = conversationClientState.getNewMessageId();
            if (newMessageId == null) {
                Part part = (Part) th1.A(list);
                newMessageId = part != null ? part.getId() : null;
            }
            return new js7<>(new FloatingIndicatorState.JumpToBottomIndicator(JumpToBottomButtonState.copy$default(((FloatingIndicatorState.JumpToBottomIndicator) conversationClientState.getFloatingIndicatorState()).getJumpToBottomButtonState(), list.size() + ((FloatingIndicatorState.JumpToBottomIndicator) conversationClientState.getFloatingIndicatorState()).getJumpToBottomButtonState().getUnreadMessages(), 0, 2, null)), newMessageId);
        }
        Conversation conversation2 = conversationClientState.getConversation();
        List<Part> listParts = conversation2 != null ? conversation2.parts() : null;
        if (listParts == null) {
            listParts = hf3.t;
        }
        return new js7<>(conversationClientState.getFloatingIndicatorState(), listParts.size() == conversation.parts().size() ? conversationClientState.getNewMessageId() : null);
    }
}
