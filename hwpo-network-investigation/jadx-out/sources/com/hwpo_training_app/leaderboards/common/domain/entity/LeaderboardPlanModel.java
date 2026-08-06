package com.hwpo_training_app.leaderboards.common.domain.entity;

import defpackage.il;
import defpackage.ru3;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardPlanModel {
    public final int a;
    public final String b;
    public final LeaderboardPlanType c;

    public LeaderboardPlanModel(int i, String str, LeaderboardPlanType leaderboardPlanType) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = leaderboardPlanType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardPlanModel)) {
            return false;
        }
        LeaderboardPlanModel leaderboardPlanModel = (LeaderboardPlanModel) obj;
        return this.a == leaderboardPlanModel.a && xj5.a(this.b, leaderboardPlanModel.b) && this.c == leaderboardPlanModel.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ru3.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbA = il.a("LeaderboardPlanModel(id=", ", title=", this.b, ", type=", this.a);
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
