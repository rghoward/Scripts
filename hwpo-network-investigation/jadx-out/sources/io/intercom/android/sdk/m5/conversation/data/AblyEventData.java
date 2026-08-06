package io.intercom.android.sdk.m5.conversation.data;

import com.google.gson.annotations.SerializedName;
import defpackage.qq2;
import defpackage.xj5;
import io.intercom.android.sdk.models.Part;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AblyEventData {
    public static final int $stable = 8;

    @SerializedName("conversation")
    private final Object conversation;

    @SerializedName("conversationId")
    private final long conversationId;

    @SerializedName("mobileConversationPart")
    private final Part.Builder conversationPart;

    public AblyEventData(long j, Part.Builder builder, Object obj) {
        builder.getClass();
        this.conversationId = j;
        this.conversationPart = builder;
        this.conversation = obj;
    }

    public static /* synthetic */ AblyEventData copy$default(AblyEventData ablyEventData, long j, Part.Builder builder, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            j = ablyEventData.conversationId;
        }
        if ((i & 2) != 0) {
            builder = ablyEventData.conversationPart;
        }
        if ((i & 4) != 0) {
            obj = ablyEventData.conversation;
        }
        return ablyEventData.copy(j, builder, obj);
    }

    public final long component1() {
        return this.conversationId;
    }

    public final Part.Builder component2() {
        return this.conversationPart;
    }

    public final Object component3() {
        return this.conversation;
    }

    public final AblyEventData copy(long j, Part.Builder builder, Object obj) {
        builder.getClass();
        return new AblyEventData(j, builder, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AblyEventData)) {
            return false;
        }
        AblyEventData ablyEventData = (AblyEventData) obj;
        return this.conversationId == ablyEventData.conversationId && xj5.a(this.conversationPart, ablyEventData.conversationPart) && xj5.a(this.conversation, ablyEventData.conversation);
    }

    public final Object getConversation() {
        return this.conversation;
    }

    public final long getConversationId() {
        return this.conversationId;
    }

    public final Part.Builder getConversationPart() {
        return this.conversationPart;
    }

    public int hashCode() {
        int iHashCode = (this.conversationPart.hashCode() + (Long.hashCode(this.conversationId) * 31)) * 31;
        Object obj = this.conversation;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "AblyEventData(conversationId=" + this.conversationId + ", conversationPart=" + this.conversationPart + ", conversation=" + this.conversation + ')';
    }

    public /* synthetic */ AblyEventData(long j, Part.Builder builder, Object obj, int i, qq2 qq2Var) {
        this(j, builder, (i & 4) != 0 ? null : obj);
    }
}
