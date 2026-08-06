package com.hwpo_training_app.notifications.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardKind {
    public static final LeaderboardKind t;
    public static final LeaderboardKind u;
    public static final /* synthetic */ LeaderboardKind[] v;

    static {
        LeaderboardKind leaderboardKind = new LeaderboardKind("DAILY", 0);
        t = leaderboardKind;
        LeaderboardKind leaderboardKind2 = new LeaderboardKind("CHALLENGE", 1);
        u = leaderboardKind2;
        v = new LeaderboardKind[]{leaderboardKind, leaderboardKind2};
    }

    public LeaderboardKind() {
        throw null;
    }

    public static LeaderboardKind valueOf(String str) {
        return (LeaderboardKind) Enum.valueOf(LeaderboardKind.class, str);
    }

    public static LeaderboardKind[] values() {
        return (LeaderboardKind[]) v.clone();
    }
}
