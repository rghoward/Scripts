package io.intercom.android.sdk.utilities.extensions;

import defpackage.xj5;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationExtensionsKt {
    public static final boolean hasNonTicketParts(Conversation conversation) {
        conversation.getClass();
        List<Part> listParts = conversation.parts();
        if (listParts != null && listParts.isEmpty()) {
            return false;
        }
        Iterator<T> it = listParts.iterator();
        while (it.hasNext()) {
            if (((Part) it.next()).getMessageStyle() != MessageStyle.TICKET_STATE_UPDATED) {
                return true;
            }
        }
        return false;
    }

    public static final long lastActionCreatedAt(Conversation conversation) {
        List<Ticket.Status> statusList;
        Object obj;
        conversation.getClass();
        if (!xj5.a(conversation.lastPart(), Part.NULL)) {
            return conversation.lastPart().getCreatedAt();
        }
        Ticket ticket = conversation.getTicket();
        if (ticket == null || (statusList = ticket.getStatusList()) == null) {
            return 0L;
        }
        Iterator<T> it = statusList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long createdDate = ((Ticket.Status) next).getCreatedDate();
                do {
                    Object next2 = it.next();
                    long createdDate2 = ((Ticket.Status) next2).getCreatedDate();
                    if (createdDate < createdDate2) {
                        next = next2;
                        createdDate = createdDate2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Ticket.Status status = (Ticket.Status) obj;
        if (status != null) {
            return status.getCreatedDate();
        }
        return 0L;
    }
}
