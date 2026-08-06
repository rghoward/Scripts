package com.hwpo_training_app.leaderboards.common.data.network.request;

import defpackage.hv5;
import defpackage.j26;
import defpackage.ky;
import defpackage.rd9;
import defpackage.ss5;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardPlanTypeNetworkEntity {

    /* JADX INFO: Fake field, exist only in values array */
    LeaderboardPlanTypeNetworkEntity EF5;
    public static final /* synthetic */ LeaderboardPlanTypeNetworkEntity[] u = {new LeaderboardPlanTypeNetworkEntity("FIXED", 0), new LeaderboardPlanTypeNetworkEntity("ONE_MANY", 1), new LeaderboardPlanTypeNetworkEntity("MEMBERSHIP", 2)};
    public static final Companion Companion = new Companion(0);
    public static final ss5<KSerializer<Object>> t = hv5.c(j26.t, new ky(1));

    public LeaderboardPlanTypeNetworkEntity() {
        throw null;
    }

    public static LeaderboardPlanTypeNetworkEntity valueOf(String str) {
        return (LeaderboardPlanTypeNetworkEntity) Enum.valueOf(LeaderboardPlanTypeNetworkEntity.class, str);
    }

    public static LeaderboardPlanTypeNetworkEntity[] values() {
        return (LeaderboardPlanTypeNetworkEntity[]) u.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardPlanTypeNetworkEntity> serializer() {
            return (KSerializer) LeaderboardPlanTypeNetworkEntity.t.getValue();
        }

        private Companion() {
        }
    }
}
