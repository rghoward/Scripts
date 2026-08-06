package com.hwpo_training_app.tracking.data.entity;

import com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.qsa;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.xj5;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class TrackedValueResponse {
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] c = {hv5.c(j26.t, new qsa()), null};
    public final List<TrackedValueNetworkEntity> a;
    public final PagingPaginationNetworkEntity b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<TrackedValueResponse> serializer() {
            return TrackedValueResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrackedValueResponse(int i, List list, PagingPaginationNetworkEntity pagingPaginationNetworkEntity) {
        if (3 != (i & 3)) {
            hl3.b(i, 3, TrackedValueResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = pagingPaginationNetworkEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackedValueResponse)) {
            return false;
        }
        TrackedValueResponse trackedValueResponse = (TrackedValueResponse) obj;
        return xj5.a(this.a, trackedValueResponse.a) && xj5.a(this.b, trackedValueResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackedValueResponse(items=" + this.a + ", pagination=" + this.b + ")";
    }
}
