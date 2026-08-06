package com.hwpo_training_app.leaderboards.common.data.network.request;

import defpackage.hv5;
import defpackage.j26;
import defpackage.rd9;
import defpackage.ss5;
import defpackage.w25;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class LeaderboardKindNetworkEntity {

    /* JADX INFO: Fake field, exist only in values array */
    LeaderboardKindNetworkEntity EF5;
    public static final /* synthetic */ LeaderboardKindNetworkEntity[] u = {new LeaderboardKindNetworkEntity("LEADERBOARD", 0), new LeaderboardKindNetworkEntity("FITR_CHALLENGE", 1), new LeaderboardKindNetworkEntity("CLONED_CHALLENGE", 2), new LeaderboardKindNetworkEntity("CHALLENGE", 3)};
    public static final Companion Companion = new Companion(0);
    public static final ss5<KSerializer<Object>> t = hv5.c(j26.t, new w25(2));

    public LeaderboardKindNetworkEntity() {
        throw null;
    }

    public static LeaderboardKindNetworkEntity valueOf(String str) {
        return (LeaderboardKindNetworkEntity) Enum.valueOf(LeaderboardKindNetworkEntity.class, str);
    }

    public static LeaderboardKindNetworkEntity[] values() {
        return (LeaderboardKindNetworkEntity[]) u.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public final KSerializer<LeaderboardKindNetworkEntity> serializer() {
            return (KSerializer) LeaderboardKindNetworkEntity.t.getValue();
        }

        private Companion() {
        }
    }
}
