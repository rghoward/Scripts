package io.intercom.android.sdk.m5.conversation.states;

import defpackage.e44;
import defpackage.ho2;
import defpackage.ru3;
import defpackage.xj5;
import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FinStreamingData {
    public static final int $stable = 8;
    private final List<Block> blocks;
    private final String clientAssignedUUID;
    private final boolean isFinStreaming;
    private final int tokenSequenceIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public FinStreamingData(boolean z, List<? extends Block> list, String str, int i) {
        list.getClass();
        str.getClass();
        this.isFinStreaming = z;
        this.blocks = list;
        this.clientAssignedUUID = str;
        this.tokenSequenceIndex = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FinStreamingData copy$default(FinStreamingData finStreamingData, boolean z, List list, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = finStreamingData.isFinStreaming;
        }
        if ((i2 & 2) != 0) {
            list = finStreamingData.blocks;
        }
        if ((i2 & 4) != 0) {
            str = finStreamingData.clientAssignedUUID;
        }
        if ((i2 & 8) != 0) {
            i = finStreamingData.tokenSequenceIndex;
        }
        return finStreamingData.copy(z, list, str, i);
    }

    public final boolean component1() {
        return this.isFinStreaming;
    }

    public final List<Block> component2() {
        return this.blocks;
    }

    public final String component3() {
        return this.clientAssignedUUID;
    }

    public final int component4() {
        return this.tokenSequenceIndex;
    }

    public final FinStreamingData copy(boolean z, List<? extends Block> list, String str, int i) {
        list.getClass();
        str.getClass();
        return new FinStreamingData(z, list, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinStreamingData)) {
            return false;
        }
        FinStreamingData finStreamingData = (FinStreamingData) obj;
        return this.isFinStreaming == finStreamingData.isFinStreaming && xj5.a(this.blocks, finStreamingData.blocks) && xj5.a(this.clientAssignedUUID, finStreamingData.clientAssignedUUID) && this.tokenSequenceIndex == finStreamingData.tokenSequenceIndex;
    }

    public final List<Block> getBlocks() {
        return this.blocks;
    }

    public final String getClientAssignedUUID() {
        return this.clientAssignedUUID;
    }

    public final int getTokenSequenceIndex() {
        return this.tokenSequenceIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.tokenSequenceIndex) + ru3.c(ho2.a(Boolean.hashCode(this.isFinStreaming) * 31, 31, this.blocks), 31, this.clientAssignedUUID);
    }

    public final boolean isFinStreaming() {
        return this.isFinStreaming;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FinStreamingData(isFinStreaming=");
        sb.append(this.isFinStreaming);
        sb.append(", blocks=");
        sb.append(this.blocks);
        sb.append(", clientAssignedUUID=");
        sb.append(this.clientAssignedUUID);
        sb.append(", tokenSequenceIndex=");
        return e44.a(sb, this.tokenSequenceIndex, ')');
    }
}
