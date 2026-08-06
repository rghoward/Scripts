package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.pi1;
import defpackage.xj5;
import io.intercom.android.sdk.blocks.lib.models.Block;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MediaItem {
    public static final int $stable = 8;
    private final Block block;
    private final boolean isVideo;

    public MediaItem(Block block, boolean z) {
        block.getClass();
        this.block = block;
        this.isVideo = z;
    }

    public static /* synthetic */ MediaItem copy$default(MediaItem mediaItem, Block block, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            block = mediaItem.block;
        }
        if ((i & 2) != 0) {
            z = mediaItem.isVideo;
        }
        return mediaItem.copy(block, z);
    }

    public final Block component1() {
        return this.block;
    }

    public final boolean component2() {
        return this.isVideo;
    }

    public final MediaItem copy(Block block, boolean z) {
        block.getClass();
        return new MediaItem(block, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        return xj5.a(this.block, mediaItem.block) && this.isVideo == mediaItem.isVideo;
    }

    public final Block getBlock() {
        return this.block;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isVideo) + (this.block.hashCode() * 31);
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaItem(block=");
        sb.append(this.block);
        sb.append(", isVideo=");
        return pi1.a(sb, this.isVideo, ')');
    }
}
