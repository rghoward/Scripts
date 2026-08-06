package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.qq2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationUiFlags {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ConversationUiFlags DEFAULT = new ConversationUiFlags(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    @SerializedName("show_last_part_meta")
    private final Boolean showLastPartMeta;

    public /* synthetic */ ConversationUiFlags(Boolean bool, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? Boolean.TRUE : bool);
    }

    public static /* synthetic */ ConversationUiFlags copy$default(ConversationUiFlags conversationUiFlags, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = conversationUiFlags.showLastPartMeta;
        }
        return conversationUiFlags.copy(bool);
    }

    public static final ConversationUiFlags getDEFAULT() {
        return Companion.getDEFAULT();
    }

    public final Boolean component1() {
        return this.showLastPartMeta;
    }

    public final ConversationUiFlags copy(Boolean bool) {
        return new ConversationUiFlags(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConversationUiFlags) && xj5.a(this.showLastPartMeta, ((ConversationUiFlags) obj).showLastPartMeta);
    }

    public final Boolean getShowLastPartMeta() {
        return this.showLastPartMeta;
    }

    public int hashCode() {
        Boolean bool = this.showLastPartMeta;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "ConversationUiFlags(showLastPartMeta=" + this.showLastPartMeta + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final ConversationUiFlags getDEFAULT() {
            return ConversationUiFlags.DEFAULT;
        }

        private Companion() {
        }

        public static /* synthetic */ void getDEFAULT$annotations() {
        }
    }

    public ConversationUiFlags(Boolean bool) {
        this.showLastPartMeta = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationUiFlags() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
