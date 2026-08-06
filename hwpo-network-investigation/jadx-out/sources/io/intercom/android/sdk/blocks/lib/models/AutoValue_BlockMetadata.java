package io.intercom.android.sdk.blocks.lib.models;

import defpackage.ac4;
import io.intercom.android.sdk.models.carousel.Appearance;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_BlockMetadata extends BlockMetadata {
    private final Appearance appearance;
    private final boolean firstObject;
    private final boolean lastObject;

    public AutoValue_BlockMetadata(boolean z, boolean z2, Appearance appearance) {
        this.firstObject = z;
        this.lastObject = z2;
        if (appearance != null) {
            this.appearance = appearance;
        } else {
            ac4.c("Null appearance");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BlockMetadata) {
            BlockMetadata blockMetadata = (BlockMetadata) obj;
            if (this.firstObject == blockMetadata.isFirstObject() && this.lastObject == blockMetadata.isLastObject() && this.appearance.equals(blockMetadata.getAppearance())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.blocks.lib.models.BlockMetadata
    public Appearance getAppearance() {
        return this.appearance;
    }

    public int hashCode() {
        return this.appearance.hashCode() ^ (((((this.firstObject ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.lastObject ? 1231 : 1237)) * 1000003);
    }

    @Override // io.intercom.android.sdk.blocks.lib.models.BlockMetadata
    public boolean isFirstObject() {
        return this.firstObject;
    }

    @Override // io.intercom.android.sdk.blocks.lib.models.BlockMetadata
    public boolean isLastObject() {
        return this.lastObject;
    }

    public String toString() {
        return "BlockMetadata{firstObject=" + this.firstObject + ", lastObject=" + this.lastObject + ", appearance=" + this.appearance + "}";
    }
}
