package com.hwpo_training_app.leaderboards.common.data.network.response;

import defpackage.hv5;
import defpackage.j26;
import defpackage.lm5;
import defpackage.rd9;
import defpackage.ss5;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardMeasureNetworkEntity {

    /* JADX INFO: Fake field, exist only in values array */
    LeaderboardMeasureNetworkEntity EF5;
    public static final /* synthetic */ LeaderboardMeasureNetworkEntity[] u = {new LeaderboardMeasureNetworkEntity("WEIGHT", 0), new LeaderboardMeasureNetworkEntity("TIME", 1), new LeaderboardMeasureNetworkEntity("REPS", 2), new LeaderboardMeasureNetworkEntity("DISTANCE", 3), new LeaderboardMeasureNetworkEntity("CALORIES", 4), new LeaderboardMeasureNetworkEntity("RPM", 5), new LeaderboardMeasureNetworkEntity("SPM", 6), new LeaderboardMeasureNetworkEntity("BPM", 7), new LeaderboardMeasureNetworkEntity("WATTS", 8), new LeaderboardMeasureNetworkEntity("ROUND_REPS", 9)};
    public static final Companion Companion = new Companion(0);
    public static final ss5<KSerializer<Object>> t = hv5.c(j26.t, new lm5(1));

    public LeaderboardMeasureNetworkEntity() {
        throw null;
    }

    public static LeaderboardMeasureNetworkEntity valueOf(String str) {
        return (LeaderboardMeasureNetworkEntity) Enum.valueOf(LeaderboardMeasureNetworkEntity.class, str);
    }

    public static LeaderboardMeasureNetworkEntity[] values() {
        return (LeaderboardMeasureNetworkEntity[]) u.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardMeasureNetworkEntity> serializer() {
            return (KSerializer) LeaderboardMeasureNetworkEntity.t.getValue();
        }

        private Companion() {
        }
    }
}
