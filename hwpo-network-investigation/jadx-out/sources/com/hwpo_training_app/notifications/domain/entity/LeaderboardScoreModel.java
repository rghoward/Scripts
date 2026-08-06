package com.hwpo_training_app.notifications.domain.entity;

import defpackage.os2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardScoreModel {
    public final int a;
    public final Integer b;
    public final int c;
    public final LeaderboardKind d;

    public LeaderboardScoreModel(int i, Integer num, int i2, LeaderboardKind leaderboardKind) {
        leaderboardKind.getClass();
        this.a = i;
        this.b = num;
        this.c = i2;
        this.d = leaderboardKind;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardScoreModel)) {
            return false;
        }
        LeaderboardScoreModel leaderboardScoreModel = (LeaderboardScoreModel) obj;
        return this.a == leaderboardScoreModel.a && xj5.a(this.b, leaderboardScoreModel.b) && this.c == leaderboardScoreModel.c && this.d == leaderboardScoreModel.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return this.d.hashCode() + os2.a(this.c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "LeaderboardScoreModel(id=" + this.a + ", valueId=" + this.b + ", leaderboardId=" + this.c + ", kind=" + this.d + ")";
    }
}
