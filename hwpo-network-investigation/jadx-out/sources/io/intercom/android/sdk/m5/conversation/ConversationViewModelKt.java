package io.intercom.android.sdk.m5.conversation;

import defpackage.xj5;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationViewModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isFastFinTyping(ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping adminIsTyping, ConversationClientState conversationClientState) {
        if (adminIsTyping.getClientId().length() <= 0) {
            return false;
        }
        Map<String, PendingMessage> pendingMessages = conversationClientState.getPendingMessages();
        if (pendingMessages.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<String, PendingMessage>> it = pendingMessages.entrySet().iterator();
        while (it.hasNext()) {
            if (xj5.a(it.next().getValue().getPart().getUuid(), adminIsTyping.getClientId())) {
                return true;
            }
        }
        return false;
    }
}
