package com.hwpo_training_app.leaderboards.valuedetails.data.network.response;

import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardPerformanceNetworkEntity;
import defpackage.hl3;
import defpackage.rd9;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardValueDetailsResponse {
    public static final Companion Companion = new Companion(0);
    public final LeaderboardValueDetailsNetworkEntity a;
    public final LeaderboardPerformanceNetworkEntity b;

    public /* synthetic */ LeaderboardValueDetailsResponse(int i, LeaderboardValueDetailsNetworkEntity leaderboardValueDetailsNetworkEntity, LeaderboardPerformanceNetworkEntity leaderboardPerformanceNetworkEntity) {
        if (1 != (i & 1)) {
            hl3.b(i, 1, LeaderboardValueDetailsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = leaderboardValueDetailsNetworkEntity;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = leaderboardPerformanceNetworkEntity;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardValueDetailsResponse)) {
            return false;
        }
        LeaderboardValueDetailsResponse leaderboardValueDetailsResponse = (LeaderboardValueDetailsResponse) obj;
        return xj5.a(this.a, leaderboardValueDetailsResponse.a) && xj5.a(this.b, leaderboardValueDetailsResponse.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        LeaderboardPerformanceNetworkEntity leaderboardPerformanceNetworkEntity = this.b;
        return iHashCode + (leaderboardPerformanceNetworkEntity == null ? 0 : leaderboardPerformanceNetworkEntity.hashCode());
    }

    public final String toString() {
        return "LeaderboardValueDetailsResponse(valueDetails=" + this.a + ", performance=" + this.b + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardValueDetailsResponse> serializer() {
            return LeaderboardValueDetailsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
