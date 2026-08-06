package io.intercom.android.sdk.m5.conversation.usecase;

import defpackage.i37;
import defpackage.ph1;
import defpackage.th1;
import defpackage.ws0;
import defpackage.xj5;
import io.intercom.android.sdk.annotations.SeenState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MarkUserContentAsSeenByAdmin {
    public static final int $stable = 0;

    public final void invoke(i37<ConversationClientState> i37Var) {
        ConversationClientState value;
        ConversationClientState conversationClientState;
        Conversation conversationCopy$default;
        i37Var.getClass();
        do {
            value = i37Var.getValue();
            conversationClientState = value;
            Conversation conversation = conversationClientState.getConversation();
            conversationCopy$default = null;
            if (conversation != null) {
                List listT = th1.T(conversationClientState.getConversation().getPartBuilderList());
                ArrayList arrayList = new ArrayList(ph1.n(listT, 10));
                int i = 0;
                for (Object obj : listT) {
                    int i2 = i + 1;
                    if (i < 0) {
                        ws0.m();
                        throw null;
                    }
                    Part.Builder builderWithSeenByAdmin = (Part.Builder) obj;
                    Part partBuild = builderWithSeenByAdmin.build();
                    if (!partBuild.isAdmin()) {
                        if (i == ws0.g(conversationClientState.getConversation().parts())) {
                            builderWithSeenByAdmin = builderWithSeenByAdmin.withSeenByAdmin(SeenState.SEEN);
                        } else if (!xj5.a(partBuild.getSeenByAdmin(), SeenState.HIDE)) {
                            builderWithSeenByAdmin = builderWithSeenByAdmin.withSeenByAdmin(SeenState.HIDE);
                        }
                    }
                    arrayList.add(builderWithSeenByAdmin);
                    i = i2;
                }
                conversationCopy$default = Conversation.copy$default(conversation, null, null, false, null, arrayList, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 2097135, null);
            }
        } while (!i37Var.c(value, ConversationClientState.copy$default(conversationClientState, null, conversationCopy$default, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, null, 8388605, null)));
    }
}
