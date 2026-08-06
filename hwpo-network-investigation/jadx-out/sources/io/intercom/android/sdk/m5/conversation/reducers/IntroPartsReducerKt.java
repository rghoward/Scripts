package io.intercom.android.sdk.m5.conversation.reducers;

import defpackage.e96;
import defpackage.hf3;
import defpackage.ph1;
import defpackage.ws0;
import defpackage.xj5;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntroPartsReducerKt {
    private static final List<ContentRow> reduceBotIntroParts(ConversationClientState conversationClientState, List<? extends Part> list) {
        e96 e96VarF = ws0.f();
        boolean zIsEmpty = conversationClientState.getPendingMessages().isEmpty();
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                ws0.m();
                throw null;
            }
            Part part = (Part) obj;
            boolean z = true;
            if (i != list.size() - 1 || !zIsEmpty) {
                z = false;
            }
            arrayList.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(part, z, true, null, null, 24, null), ConversationPartsReducerKt.getGroupingPosition(list, i), null, false, false, 16, null));
            i = i2;
        }
        e96VarF.addAll(arrayList);
        return ws0.e(e96VarF);
    }

    public static final List<ContentRow> reduceIntroParts(ConversationClientState conversationClientState) {
        List arrayList;
        List<Part.Builder> parts;
        Object next;
        conversationClientState.getClass();
        OpenMessengerResponse openMessengerResponse = conversationClientState.getOpenMessengerResponse();
        OpenMessengerResponse.NewConversationData newConversationData = openMessengerResponse != null ? openMessengerResponse.getNewConversationData() : null;
        hf3 hf3Var = hf3.t;
        if (newConversationData == null || (parts = newConversationData.getParts()) == null) {
            arrayList = hf3Var;
        } else {
            arrayList = new ArrayList(ph1.n(parts, 10));
            Iterator<T> it = parts.iterator();
            while (it.hasNext()) {
                Part partBuild = ((Part.Builder) it.next()).build();
                Iterator<T> it2 = newConversationData.getParticipants().iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!xj5.a(((Participant.Builder) next).build().getId(), partBuild.getParticipantId()));
                Participant.Builder builder = (Participant.Builder) next;
                Participant participantBuild = builder != null ? builder.build() : null;
                if (participantBuild != null) {
                    partBuild.setParticipant(participantBuild);
                }
                arrayList.add(partBuild);
            }
        }
        return !arrayList.isEmpty() ? reduceBotIntroParts(conversationClientState, arrayList) : hf3Var;
    }
}
