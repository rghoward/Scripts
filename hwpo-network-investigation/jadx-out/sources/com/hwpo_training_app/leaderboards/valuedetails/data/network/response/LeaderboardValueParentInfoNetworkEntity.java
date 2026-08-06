package com.hwpo_training_app.leaderboards.valuedetails.data.network.response;

import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardPlanNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardSectionNetworkEntity;
import defpackage.hl3;
import defpackage.rd9;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardValueParentInfoNetworkEntity {
    public static final Companion Companion = new Companion(0);
    public final int a;
    public final LeaderboardPlanNetworkEntity b;
    public final LeaderboardSectionNetworkEntity c;
    public final long d;

    public /* synthetic */ LeaderboardValueParentInfoNetworkEntity(int i, int i2, LeaderboardPlanNetworkEntity leaderboardPlanNetworkEntity, LeaderboardSectionNetworkEntity leaderboardSectionNetworkEntity, long j) {
        if (9 != (i & 9)) {
            hl3.b(i, 9, LeaderboardValueParentInfoNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = leaderboardPlanNetworkEntity;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = leaderboardSectionNetworkEntity;
        }
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardValueParentInfoNetworkEntity)) {
            return false;
        }
        LeaderboardValueParentInfoNetworkEntity leaderboardValueParentInfoNetworkEntity = (LeaderboardValueParentInfoNetworkEntity) obj;
        return this.a == leaderboardValueParentInfoNetworkEntity.a && xj5.a(this.b, leaderboardValueParentInfoNetworkEntity.b) && xj5.a(this.c, leaderboardValueParentInfoNetworkEntity.c) && this.d == leaderboardValueParentInfoNetworkEntity.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        LeaderboardPlanNetworkEntity leaderboardPlanNetworkEntity = this.b;
        int iHashCode2 = (iHashCode + (leaderboardPlanNetworkEntity == null ? 0 : leaderboardPlanNetworkEntity.hashCode())) * 31;
        LeaderboardSectionNetworkEntity leaderboardSectionNetworkEntity = this.c;
        return Long.hashCode(this.d) + ((iHashCode2 + (leaderboardSectionNetworkEntity != null ? leaderboardSectionNetworkEntity.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LeaderboardValueParentInfoNetworkEntity(leaderboardId=" + this.a + ", plan=" + this.b + ", section=" + this.c + ", updatedAt=" + this.d + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardValueParentInfoNetworkEntity> serializer() {
            return LeaderboardValueParentInfoNetworkEntity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
