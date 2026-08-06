package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.xj5;
import defpackage.zc6;
import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class ProcessedBlocks {
    private final List<Block> cleaned;
    private final List<Block> extracted;

    /* JADX WARN: Multi-variable type inference failed */
    public ProcessedBlocks(List<? extends Block> list, List<? extends Block> list2) {
        list.getClass();
        list2.getClass();
        this.cleaned = list;
        this.extracted = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProcessedBlocks copy$default(ProcessedBlocks processedBlocks, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = processedBlocks.cleaned;
        }
        if ((i & 2) != 0) {
            list2 = processedBlocks.extracted;
        }
        return processedBlocks.copy(list, list2);
    }

    public final List<Block> component1() {
        return this.cleaned;
    }

    public final List<Block> component2() {
        return this.extracted;
    }

    public final ProcessedBlocks copy(List<? extends Block> list, List<? extends Block> list2) {
        list.getClass();
        list2.getClass();
        return new ProcessedBlocks(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessedBlocks)) {
            return false;
        }
        ProcessedBlocks processedBlocks = (ProcessedBlocks) obj;
        return xj5.a(this.cleaned, processedBlocks.cleaned) && xj5.a(this.extracted, processedBlocks.extracted);
    }

    public final List<Block> getCleaned() {
        return this.cleaned;
    }

    public final List<Block> getExtracted() {
        return this.extracted;
    }

    public int hashCode() {
        return this.extracted.hashCode() + (this.cleaned.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProcessedBlocks(cleaned=");
        sb.append(this.cleaned);
        sb.append(", extracted=");
        return zc6.a(sb, this.extracted, ')');
    }
}
