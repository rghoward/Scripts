package com.hwpo_training_app.leaderboards.details.list.data.response;

import com.hwpo_training_app.core.data.model.pagination.PagingPaginationNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardTopValueNetworkEntity;
import defpackage.a60;
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
public final class AthletesListResponse {
    public static final Companion Companion;
    public static final ss5<KSerializer<Object>>[] e;
    public final List<LeaderboardTopValueNetworkEntity> a;
    public final LeaderboardTopValueNetworkEntity b;
    public final Boolean c;
    public final PagingPaginationNetworkEntity d;

    static {
        int i = 0;
        Companion = new Companion(i);
        e = new ss5[]{hv5.c(j26.t, new a60(i)), null, null, null};
    }

    public /* synthetic */ AthletesListResponse(int i, List list, LeaderboardTopValueNetworkEntity leaderboardTopValueNetworkEntity, Boolean bool, PagingPaginationNetworkEntity pagingPaginationNetworkEntity) {
        if (9 != (i & 9)) {
            hl3.b(i, 9, AthletesListResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = leaderboardTopValueNetworkEntity;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        this.d = pagingPaginationNetworkEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AthletesListResponse)) {
            return false;
        }
        AthletesListResponse athletesListResponse = (AthletesListResponse) obj;
        return xj5.a(this.a, athletesListResponse.a) && xj5.a(this.b, athletesListResponse.b) && xj5.a(this.c, athletesListResponse.c) && xj5.a(this.d, athletesListResponse.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        LeaderboardTopValueNetworkEntity leaderboardTopValueNetworkEntity = this.b;
        int iHashCode2 = (iHashCode + (leaderboardTopValueNetworkEntity == null ? 0 : leaderboardTopValueNetworkEntity.hashCode())) * 31;
        Boolean bool = this.c;
        return this.d.hashCode() + ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AthletesListResponse(items=" + this.a + ", myValue=" + this.b + ", isValueSubmitted=" + this.c + ", pagination=" + this.d + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<AthletesListResponse> serializer() {
            return AthletesListResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
