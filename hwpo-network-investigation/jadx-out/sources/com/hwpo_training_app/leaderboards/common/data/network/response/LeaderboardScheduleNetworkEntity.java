package com.hwpo_training_app.leaderboards.common.data.network.response;

import defpackage.rd9;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardScheduleNetworkEntity {
    public static final Companion Companion = new Companion(0);
    public final Integer a;
    public final String b;

    public /* synthetic */ LeaderboardScheduleNetworkEntity(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardScheduleNetworkEntity)) {
            return false;
        }
        LeaderboardScheduleNetworkEntity leaderboardScheduleNetworkEntity = (LeaderboardScheduleNetworkEntity) obj;
        return xj5.a(this.a, leaderboardScheduleNetworkEntity.a) && xj5.a(this.b, leaderboardScheduleNetworkEntity.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "LeaderboardScheduleNetworkEntity(id=" + this.a + ", date=" + this.b + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardScheduleNetworkEntity> serializer() {
            return LeaderboardScheduleNetworkEntity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public LeaderboardScheduleNetworkEntity() {
        this.a = null;
        this.b = null;
    }
}
