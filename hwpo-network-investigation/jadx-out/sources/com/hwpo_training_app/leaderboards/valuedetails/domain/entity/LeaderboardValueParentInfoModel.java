package com.hwpo_training_app.leaderboards.valuedetails.domain.entity;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardPlanModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardSectionModel;
import defpackage.xj5;
import j$.time.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardValueParentInfoModel {
    public final int a;
    public final LeaderboardPlanModel b;
    public final LeaderboardSectionModel c;
    public final LocalDateTime d;

    public LeaderboardValueParentInfoModel(int i, LeaderboardPlanModel leaderboardPlanModel, LeaderboardSectionModel leaderboardSectionModel, LocalDateTime localDateTime) {
        this.a = i;
        this.b = leaderboardPlanModel;
        this.c = leaderboardSectionModel;
        this.d = localDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardValueParentInfoModel)) {
            return false;
        }
        LeaderboardValueParentInfoModel leaderboardValueParentInfoModel = (LeaderboardValueParentInfoModel) obj;
        return this.a == leaderboardValueParentInfoModel.a && xj5.a(this.b, leaderboardValueParentInfoModel.b) && xj5.a(this.c, leaderboardValueParentInfoModel.c) && this.d.equals(leaderboardValueParentInfoModel.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        LeaderboardPlanModel leaderboardPlanModel = this.b;
        int iHashCode2 = (iHashCode + (leaderboardPlanModel == null ? 0 : leaderboardPlanModel.hashCode())) * 31;
        LeaderboardSectionModel leaderboardSectionModel = this.c;
        return this.d.hashCode() + ((iHashCode2 + (leaderboardSectionModel != null ? leaderboardSectionModel.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LeaderboardValueParentInfoModel(leaderboardId=" + this.a + ", plan=" + this.b + ", section=" + this.c + ", updatedAt=" + this.d + ")";
    }
}
