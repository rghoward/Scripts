package com.hwpo_training_app.leaderboards.common.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardPlanType {
    public static final LeaderboardPlanType t;
    public static final LeaderboardPlanType u;
    public static final LeaderboardPlanType v;
    public static final /* synthetic */ LeaderboardPlanType[] w;

    static {
        LeaderboardPlanType leaderboardPlanType = new LeaderboardPlanType("FIXED", 0);
        t = leaderboardPlanType;
        LeaderboardPlanType leaderboardPlanType2 = new LeaderboardPlanType("ONE_MANY", 1);
        u = leaderboardPlanType2;
        LeaderboardPlanType leaderboardPlanType3 = new LeaderboardPlanType("MEMBERSHIP", 2);
        v = leaderboardPlanType3;
        w = new LeaderboardPlanType[]{leaderboardPlanType, leaderboardPlanType2, leaderboardPlanType3};
    }

    public LeaderboardPlanType() {
        throw null;
    }

    public static LeaderboardPlanType valueOf(String str) {
        return (LeaderboardPlanType) Enum.valueOf(LeaderboardPlanType.class, str);
    }

    public static LeaderboardPlanType[] values() {
        return (LeaderboardPlanType[]) w.clone();
    }
}
