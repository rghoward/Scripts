package com.hwpo_training_app.leaderboards.common.data.network.response;

import defpackage.hv5;
import defpackage.j26;
import defpackage.k46;
import defpackage.rd9;
import defpackage.ss5;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardResultTypeNetworkEntity {

    /* JADX INFO: Fake field, exist only in values array */
    LeaderboardResultTypeNetworkEntity EF5;
    public static final /* synthetic */ LeaderboardResultTypeNetworkEntity[] u = {new LeaderboardResultTypeNetworkEntity("ROUND_REPS", 0), new LeaderboardResultTypeNetworkEntity("TIME_CAP", 1), new LeaderboardResultTypeNetworkEntity("OTHER", 2)};
    public static final Companion Companion = new Companion(0);
    public static final ss5<KSerializer<Object>> t = hv5.c(j26.t, new k46());

    public LeaderboardResultTypeNetworkEntity() {
        throw null;
    }

    public static LeaderboardResultTypeNetworkEntity valueOf(String str) {
        return (LeaderboardResultTypeNetworkEntity) Enum.valueOf(LeaderboardResultTypeNetworkEntity.class, str);
    }

    public static LeaderboardResultTypeNetworkEntity[] values() {
        return (LeaderboardResultTypeNetworkEntity[]) u.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardResultTypeNetworkEntity> serializer() {
            return (KSerializer) LeaderboardResultTypeNetworkEntity.t.getValue();
        }

        private Companion() {
        }
    }
}
