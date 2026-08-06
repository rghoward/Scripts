package com.hwpo_training_app.leaderboards.common.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TopValueKind {
    public static final TopValueKind t;
    public static final TopValueKind u;
    public static final /* synthetic */ TopValueKind[] v;

    static {
        TopValueKind topValueKind = new TopValueKind("RX", 0);
        t = topValueKind;
        TopValueKind topValueKind2 = new TopValueKind("SCALED", 1);
        u = topValueKind2;
        v = new TopValueKind[]{topValueKind, topValueKind2};
    }

    public TopValueKind() {
        throw null;
    }

    public static TopValueKind valueOf(String str) {
        return (TopValueKind) Enum.valueOf(TopValueKind.class, str);
    }

    public static TopValueKind[] values() {
        return (TopValueKind[]) v.clone();
    }
}
