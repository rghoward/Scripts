package com.hwpo_training_app.leaderboards.common.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardMeasureType {
    public static final LeaderboardMeasureType A;
    public static final LeaderboardMeasureType B;
    public static final LeaderboardMeasureType C;
    public static final /* synthetic */ LeaderboardMeasureType[] D;
    public static final LeaderboardMeasureType t;
    public static final LeaderboardMeasureType u;
    public static final LeaderboardMeasureType v;
    public static final LeaderboardMeasureType w;
    public static final LeaderboardMeasureType x;
    public static final LeaderboardMeasureType y;
    public static final LeaderboardMeasureType z;

    static {
        LeaderboardMeasureType leaderboardMeasureType = new LeaderboardMeasureType("WEIGHT", 0);
        t = leaderboardMeasureType;
        LeaderboardMeasureType leaderboardMeasureType2 = new LeaderboardMeasureType("TIME", 1);
        u = leaderboardMeasureType2;
        LeaderboardMeasureType leaderboardMeasureType3 = new LeaderboardMeasureType("REPS", 2);
        v = leaderboardMeasureType3;
        LeaderboardMeasureType leaderboardMeasureType4 = new LeaderboardMeasureType("DISTANCE", 3);
        w = leaderboardMeasureType4;
        LeaderboardMeasureType leaderboardMeasureType5 = new LeaderboardMeasureType("CALORIES", 4);
        x = leaderboardMeasureType5;
        LeaderboardMeasureType leaderboardMeasureType6 = new LeaderboardMeasureType("RPM", 5);
        y = leaderboardMeasureType6;
        LeaderboardMeasureType leaderboardMeasureType7 = new LeaderboardMeasureType("SPM", 6);
        z = leaderboardMeasureType7;
        LeaderboardMeasureType leaderboardMeasureType8 = new LeaderboardMeasureType("BPM", 7);
        A = leaderboardMeasureType8;
        LeaderboardMeasureType leaderboardMeasureType9 = new LeaderboardMeasureType("WATTS", 8);
        B = leaderboardMeasureType9;
        LeaderboardMeasureType leaderboardMeasureType10 = new LeaderboardMeasureType("ROUND_REPS", 9);
        C = leaderboardMeasureType10;
        D = new LeaderboardMeasureType[]{leaderboardMeasureType, leaderboardMeasureType2, leaderboardMeasureType3, leaderboardMeasureType4, leaderboardMeasureType5, leaderboardMeasureType6, leaderboardMeasureType7, leaderboardMeasureType8, leaderboardMeasureType9, leaderboardMeasureType10};
    }

    public LeaderboardMeasureType() {
        throw null;
    }

    public static LeaderboardMeasureType valueOf(String str) {
        return (LeaderboardMeasureType) Enum.valueOf(LeaderboardMeasureType.class, str);
    }

    public static LeaderboardMeasureType[] values() {
        return (LeaderboardMeasureType[]) D.clone();
    }
}
