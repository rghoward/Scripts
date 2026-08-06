package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.e44;
import defpackage.os2;
import defpackage.qq2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationStateSyncSettings {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ConversationStateSyncSettings DEFAULT = new ConversationStateSyncSettings(false, 0, 0);

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("start_timeout")
    private final int startTimeout;

    @SerializedName("sync_interval")
    private final int syncInterval;

    public ConversationStateSyncSettings(boolean z, int i, int i2) {
        this.enabled = z;
        this.startTimeout = i;
        this.syncInterval = i2;
    }

    public static /* synthetic */ ConversationStateSyncSettings copy$default(ConversationStateSyncSettings conversationStateSyncSettings, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = conversationStateSyncSettings.enabled;
        }
        if ((i3 & 2) != 0) {
            i = conversationStateSyncSettings.startTimeout;
        }
        if ((i3 & 4) != 0) {
            i2 = conversationStateSyncSettings.syncInterval;
        }
        return conversationStateSyncSettings.copy(z, i, i2);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final int component2() {
        return this.startTimeout;
    }

    public final int component3() {
        return this.syncInterval;
    }

    public final ConversationStateSyncSettings copy(boolean z, int i, int i2) {
        return new ConversationStateSyncSettings(z, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationStateSyncSettings)) {
            return false;
        }
        ConversationStateSyncSettings conversationStateSyncSettings = (ConversationStateSyncSettings) obj;
        return this.enabled == conversationStateSyncSettings.enabled && this.startTimeout == conversationStateSyncSettings.startTimeout && this.syncInterval == conversationStateSyncSettings.syncInterval;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getStartTimeout() {
        return this.startTimeout;
    }

    public final int getSyncInterval() {
        return this.syncInterval;
    }

    public int hashCode() {
        return Integer.hashCode(this.syncInterval) + os2.a(this.startTimeout, Boolean.hashCode(this.enabled) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConversationStateSyncSettings(enabled=");
        sb.append(this.enabled);
        sb.append(", startTimeout=");
        sb.append(this.startTimeout);
        sb.append(", syncInterval=");
        return e44.a(sb, this.syncInterval, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final ConversationStateSyncSettings getDEFAULT() {
            return ConversationStateSyncSettings.DEFAULT;
        }

        private Companion() {
        }
    }
}
