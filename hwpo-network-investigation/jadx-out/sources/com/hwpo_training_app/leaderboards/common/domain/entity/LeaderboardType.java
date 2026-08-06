package com.hwpo_training_app.leaderboards.common.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardType {
    public static final LeaderboardType t;
    public static final LeaderboardType u;
    public static final /* synthetic */ LeaderboardType[] v;

    static {
        LeaderboardType leaderboardType = new LeaderboardType("DAILY", 0);
        t = leaderboardType;
        LeaderboardType leaderboardType2 = new LeaderboardType("CHALLENGE", 1);
        u = leaderboardType2;
        v = new LeaderboardType[]{leaderboardType, leaderboardType2};
    }

    public LeaderboardType() {
        throw null;
    }

    public static LeaderboardType valueOf(String str) {
        return (LeaderboardType) Enum.valueOf(LeaderboardType.class, str);
    }

    public static LeaderboardType[] values() {
        return (LeaderboardType[]) v.clone();
    }
}
