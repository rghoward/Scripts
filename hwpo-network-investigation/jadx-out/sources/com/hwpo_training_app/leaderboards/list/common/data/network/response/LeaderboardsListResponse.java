package com.hwpo_training_app.leaderboards.list.common.data.network.response;

import com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardNetworkEntity;
import defpackage.c56;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.xj5;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardsListResponse {
    public static final Companion Companion;
    public static final ss5<KSerializer<Object>>[] c;
    public final List<LeaderboardNetworkEntity> a;
    public final PagingPaginationNetworkEntity b;

    static {
        int i = 0;
        Companion = new Companion(i);
        c = new ss5[]{hv5.c(j26.t, new c56(i)), null};
    }

    public /* synthetic */ LeaderboardsListResponse(int i, List list, PagingPaginationNetworkEntity pagingPaginationNetworkEntity) {
        if (3 != (i & 3)) {
            hl3.b(i, 3, LeaderboardsListResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = pagingPaginationNetworkEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardsListResponse)) {
            return false;
        }
        LeaderboardsListResponse leaderboardsListResponse = (LeaderboardsListResponse) obj;
        return xj5.a(this.a, leaderboardsListResponse.a) && xj5.a(this.b, leaderboardsListResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LeaderboardsListResponse(items=" + this.a + ", pagination=" + this.b + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardsListResponse> serializer() {
            return LeaderboardsListResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
