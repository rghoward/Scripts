package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.qq2;
import defpackage.uo2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ActiveBot {
    public static final int $stable = 8;

    @SerializedName("has_ai")
    private final boolean isAi;

    @SerializedName("has_customized_identity")
    private final boolean isIdentityCustomized;

    @SerializedName("participant")
    private final Participant.Builder participant;

    @SerializedName("streaming_part")
    private final StreamingPart streamingPart;

    public /* synthetic */ ActiveBot(Participant.Builder builder, boolean z, boolean z2, StreamingPart streamingPart, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? new Participant.Builder() : builder, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : streamingPart);
    }

    public static /* synthetic */ ActiveBot copy$default(ActiveBot activeBot, Participant.Builder builder, boolean z, boolean z2, StreamingPart streamingPart, int i, Object obj) {
        if ((i & 1) != 0) {
            builder = activeBot.participant;
        }
        if ((i & 2) != 0) {
            z = activeBot.isAi;
        }
        if ((i & 4) != 0) {
            z2 = activeBot.isIdentityCustomized;
        }
        if ((i & 8) != 0) {
            streamingPart = activeBot.streamingPart;
        }
        return activeBot.copy(builder, z, z2, streamingPart);
    }

    public final Participant.Builder component1() {
        return this.participant;
    }

    public final boolean component2() {
        return this.isAi;
    }

    public final boolean component3() {
        return this.isIdentityCustomized;
    }

    public final StreamingPart component4() {
        return this.streamingPart;
    }

    public final ActiveBot copy(Participant.Builder builder, boolean z, boolean z2, StreamingPart streamingPart) {
        builder.getClass();
        return new ActiveBot(builder, z, z2, streamingPart);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveBot)) {
            return false;
        }
        ActiveBot activeBot = (ActiveBot) obj;
        return xj5.a(this.participant, activeBot.participant) && this.isAi == activeBot.isAi && this.isIdentityCustomized == activeBot.isIdentityCustomized && xj5.a(this.streamingPart, activeBot.streamingPart);
    }

    public final Participant.Builder getParticipant() {
        return this.participant;
    }

    public final StreamingPart getStreamingPart() {
        return this.streamingPart;
    }

    public int hashCode() {
        int iA = uo2.a(uo2.a(this.participant.hashCode() * 31, this.isAi, 31), this.isIdentityCustomized, 31);
        StreamingPart streamingPart = this.streamingPart;
        return iA + (streamingPart == null ? 0 : streamingPart.hashCode());
    }

    public final boolean isAi() {
        return this.isAi;
    }

    public final boolean isIdentityCustomized() {
        return this.isIdentityCustomized;
    }

    public String toString() {
        return "ActiveBot(participant=" + this.participant + ", isAi=" + this.isAi + ", isIdentityCustomized=" + this.isIdentityCustomized + ", streamingPart=" + this.streamingPart + ')';
    }

    public ActiveBot(Participant.Builder builder, boolean z, boolean z2, StreamingPart streamingPart) {
        builder.getClass();
        this.participant = builder;
        this.isAi = z;
        this.isIdentityCustomized = z2;
        this.streamingPart = streamingPart;
    }

    public ActiveBot() {
        this(null, false, false, null, 15, null);
    }
}
