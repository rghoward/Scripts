package io.ably.lib.types;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class SummaryClientIdList {
    public final List<String> clientIds;
    public final boolean clipped;
    public final int total;

    public SummaryClientIdList(int i, List<String> list, boolean z) {
        this.total = i;
        this.clientIds = list;
        this.clipped = z;
    }
}
