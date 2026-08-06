package com.hwpo_training_app.tracking.data.entity;

import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.u42;
import defpackage.xj5;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class TrackedValueEntriesResponse {
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] c = {hv5.c(j26.t, new u42(1)), null};
    public final List<TrackedValueEntryNetworkEntity> a;
    public final ChartPaginationNetworkEntity b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<TrackedValueEntriesResponse> serializer() {
            return TrackedValueEntriesResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrackedValueEntriesResponse(int i, List list, ChartPaginationNetworkEntity chartPaginationNetworkEntity) {
        if (3 != (i & 3)) {
            hl3.b(i, 3, TrackedValueEntriesResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = chartPaginationNetworkEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackedValueEntriesResponse)) {
            return false;
        }
        TrackedValueEntriesResponse trackedValueEntriesResponse = (TrackedValueEntriesResponse) obj;
        return xj5.a(this.a, trackedValueEntriesResponse.a) && xj5.a(this.b, trackedValueEntriesResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackedValueEntriesResponse(items=" + this.a + ", pagination=" + this.b + ")";
    }
}
