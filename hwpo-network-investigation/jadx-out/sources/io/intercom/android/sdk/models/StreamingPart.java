package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.qq2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class StreamingPart {
    public static final int $stable = 8;

    @SerializedName("metadata")
    private final Metadata metadata;

    public /* synthetic */ StreamingPart(Metadata metadata, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? null : metadata);
    }

    public static /* synthetic */ StreamingPart copy$default(StreamingPart streamingPart, Metadata metadata, int i, Object obj) {
        if ((i & 1) != 0) {
            metadata = streamingPart.metadata;
        }
        return streamingPart.copy(metadata);
    }

    public final Metadata component1() {
        return this.metadata;
    }

    public final StreamingPart copy(Metadata metadata) {
        return new StreamingPart(metadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreamingPart) && xj5.a(this.metadata, ((StreamingPart) obj).metadata);
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        Metadata metadata = this.metadata;
        if (metadata == null) {
            return 0;
        }
        return metadata.hashCode();
    }

    public String toString() {
        return "StreamingPart(metadata=" + this.metadata + ')';
    }

    public StreamingPart(Metadata metadata) {
        this.metadata = metadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StreamingPart() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
