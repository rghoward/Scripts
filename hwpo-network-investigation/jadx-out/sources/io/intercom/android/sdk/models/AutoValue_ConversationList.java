package io.intercom.android.sdk.models;

import defpackage.ac4;
import defpackage.fz;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_ConversationList extends ConversationList {
    private final List<Conversation> getConversations;
    private final EmptyState getEmptyState;
    private final Set<String> getUnreadConversationIds;
    private final int getUnreadConversationsCount;
    private final boolean hasMorePages;

    public AutoValue_ConversationList(List<Conversation> list, Set<String> set, int i, EmptyState emptyState, boolean z) {
        if (list == null) {
            ac4.c("Null getConversations");
            throw null;
        }
        this.getConversations = list;
        if (set == null) {
            ac4.c("Null getUnreadConversationIds");
            throw null;
        }
        this.getUnreadConversationIds = set;
        this.getUnreadConversationsCount = i;
        if (emptyState == null) {
            ac4.c("Null getEmptyState");
            throw null;
        }
        this.getEmptyState = emptyState;
        this.hasMorePages = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationList) {
            ConversationList conversationList = (ConversationList) obj;
            if (this.getConversations.equals(conversationList.getConversations()) && this.getUnreadConversationIds.equals(conversationList.getUnreadConversationIds()) && this.getUnreadConversationsCount == conversationList.getUnreadConversationsCount() && this.getEmptyState.equals(conversationList.getEmptyState()) && this.hasMorePages == conversationList.hasMorePages()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public List<Conversation> getConversations() {
        return this.getConversations;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public EmptyState getEmptyState() {
        return this.getEmptyState;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public Set<String> getUnreadConversationIds() {
        return this.getUnreadConversationIds;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public int getUnreadConversationsCount() {
        return this.getUnreadConversationsCount;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public boolean hasMorePages() {
        return this.hasMorePages;
    }

    public int hashCode() {
        return (this.hasMorePages ? 1231 : 1237) ^ ((((((((this.getConversations.hashCode() ^ 1000003) * 1000003) ^ this.getUnreadConversationIds.hashCode()) * 1000003) ^ this.getUnreadConversationsCount) * 1000003) ^ this.getEmptyState.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConversationList{getConversations=");
        sb.append(this.getConversations);
        sb.append(", getUnreadConversationIds=");
        sb.append(this.getUnreadConversationIds);
        sb.append(", getUnreadConversationsCount=");
        sb.append(this.getUnreadConversationsCount);
        sb.append(", getEmptyState=");
        sb.append(this.getEmptyState);
        sb.append(", hasMorePages=");
        return fz.c(sb, this.hasMorePages, "}");
    }
}
