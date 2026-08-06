package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.nl3;
import defpackage.ol3;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationEndedButton {
    public static final int $stable = 0;

    @SerializedName(AttributeType.TEXT)
    private final String ctaTitle;

    @SerializedName("title")
    private final String message;
    private final Metadata metadata;
    private final Reason reason;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Metadata {
        public static final int $stable = 0;

        @SerializedName("merged_into_conversation_id")
        private final String mergedIntoConversationId;

        public Metadata(String str) {
            str.getClass();
            this.mergedIntoConversationId = str;
        }

        public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = metadata.mergedIntoConversationId;
            }
            return metadata.copy(str);
        }

        public final String component1() {
            return this.mergedIntoConversationId;
        }

        public final Metadata copy(String str) {
            str.getClass();
            return new Metadata(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Metadata) && xj5.a(this.mergedIntoConversationId, ((Metadata) obj).mergedIntoConversationId);
        }

        public final String getMergedIntoConversationId() {
            return this.mergedIntoConversationId;
        }

        public int hashCode() {
            return this.mergedIntoConversationId.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("Metadata(mergedIntoConversationId="), this.mergedIntoConversationId, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum Reason {
        UNKNOWN,
        MERGED_INTO_CONVERSATION;

        private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

        public static nl3<Reason> getEntries() {
            return $ENTRIES;
        }
    }

    public ConversationEndedButton(String str, String str2, Reason reason, Metadata metadata) {
        str.getClass();
        str2.getClass();
        reason.getClass();
        this.message = str;
        this.ctaTitle = str2;
        this.reason = reason;
        this.metadata = metadata;
    }

    public static /* synthetic */ ConversationEndedButton copy$default(ConversationEndedButton conversationEndedButton, String str, String str2, Reason reason, Metadata metadata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationEndedButton.message;
        }
        if ((i & 2) != 0) {
            str2 = conversationEndedButton.ctaTitle;
        }
        if ((i & 4) != 0) {
            reason = conversationEndedButton.reason;
        }
        if ((i & 8) != 0) {
            metadata = conversationEndedButton.metadata;
        }
        return conversationEndedButton.copy(str, str2, reason, metadata);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.ctaTitle;
    }

    public final Reason component3() {
        return this.reason;
    }

    public final Metadata component4() {
        return this.metadata;
    }

    public final ConversationEndedButton copy(String str, String str2, Reason reason, Metadata metadata) {
        str.getClass();
        str2.getClass();
        reason.getClass();
        return new ConversationEndedButton(str, str2, reason, metadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationEndedButton)) {
            return false;
        }
        ConversationEndedButton conversationEndedButton = (ConversationEndedButton) obj;
        return xj5.a(this.message, conversationEndedButton.message) && xj5.a(this.ctaTitle, conversationEndedButton.ctaTitle) && this.reason == conversationEndedButton.reason && xj5.a(this.metadata, conversationEndedButton.metadata);
    }

    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final Reason getReason() {
        return this.reason;
    }

    public int hashCode() {
        int iHashCode = (this.reason.hashCode() + ru3.c(this.message.hashCode() * 31, 31, this.ctaTitle)) * 31;
        Metadata metadata = this.metadata;
        return iHashCode + (metadata == null ? 0 : metadata.hashCode());
    }

    public String toString() {
        return "ConversationEndedButton(message=" + this.message + ", ctaTitle=" + this.ctaTitle + ", reason=" + this.reason + ", metadata=" + this.metadata + ')';
    }

    public /* synthetic */ ConversationEndedButton(String str, String str2, Reason reason, Metadata metadata, int i, qq2 qq2Var) {
        this(str, str2, reason, (i & 8) != 0 ? null : metadata);
    }
}
