package com.hwpo_training_app.leaderboards.common.domain.entity;

import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardScheduleModel {
    public final int a;
    public final String b;

    public LeaderboardScheduleModel(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardScheduleModel)) {
            return false;
        }
        LeaderboardScheduleModel leaderboardScheduleModel = (LeaderboardScheduleModel) obj;
        return this.a == leaderboardScheduleModel.a && xj5.a(this.b, leaderboardScheduleModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LeaderboardScheduleModel(id=" + this.a + ", date=" + this.b + ")";
    }
}
