package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.hf3;
import defpackage.ho2;
import defpackage.qq2;
import defpackage.xj5;
import defpackage.zc6;
import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class CategorizedBlocks {
    private final List<Block> attachments;
    private final List<Block> images;
    private final List<Block> remaining;
    private final List<Block> videos;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CategorizedBlocks(List list, List list2, List list3, List list4, int i, qq2 qq2Var) {
        int i2 = i & 1;
        hf3 hf3Var = hf3.t;
        this(i2 != 0 ? hf3Var : list, (i & 2) != 0 ? hf3Var : list2, (i & 4) != 0 ? hf3Var : list3, (i & 8) != 0 ? hf3Var : list4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategorizedBlocks copy$default(CategorizedBlocks categorizedBlocks, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = categorizedBlocks.images;
        }
        if ((i & 2) != 0) {
            list2 = categorizedBlocks.videos;
        }
        if ((i & 4) != 0) {
            list3 = categorizedBlocks.attachments;
        }
        if ((i & 8) != 0) {
            list4 = categorizedBlocks.remaining;
        }
        return categorizedBlocks.copy(list, list2, list3, list4);
    }

    public final List<Block> component1() {
        return this.images;
    }

    public final List<Block> component2() {
        return this.videos;
    }

    public final List<Block> component3() {
        return this.attachments;
    }

    public final List<Block> component4() {
        return this.remaining;
    }

    public final CategorizedBlocks copy(List<? extends Block> list, List<? extends Block> list2, List<? extends Block> list3, List<? extends Block> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        return new CategorizedBlocks(list, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategorizedBlocks)) {
            return false;
        }
        CategorizedBlocks categorizedBlocks = (CategorizedBlocks) obj;
        return xj5.a(this.images, categorizedBlocks.images) && xj5.a(this.videos, categorizedBlocks.videos) && xj5.a(this.attachments, categorizedBlocks.attachments) && xj5.a(this.remaining, categorizedBlocks.remaining);
    }

    public final List<Block> getAttachments() {
        return this.attachments;
    }

    public final List<Block> getImages() {
        return this.images;
    }

    public final List<Block> getRemaining() {
        return this.remaining;
    }

    public final List<Block> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        return this.remaining.hashCode() + ho2.a(ho2.a(this.images.hashCode() * 31, 31, this.videos), 31, this.attachments);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CategorizedBlocks(images=");
        sb.append(this.images);
        sb.append(", videos=");
        sb.append(this.videos);
        sb.append(", attachments=");
        sb.append(this.attachments);
        sb.append(", remaining=");
        return zc6.a(sb, this.remaining, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CategorizedBlocks(List<? extends Block> list, List<? extends Block> list2, List<? extends Block> list3, List<? extends Block> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.images = list;
        this.videos = list2;
        this.attachments = list3;
        this.remaining = list4;
    }

    public CategorizedBlocks() {
        this(null, null, null, null, 15, null);
    }
}
