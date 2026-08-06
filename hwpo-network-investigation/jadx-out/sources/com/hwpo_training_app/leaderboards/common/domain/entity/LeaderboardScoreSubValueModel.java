package com.hwpo_training_app.leaderboards.common.domain.entity;

import defpackage.os2;
import defpackage.u43;
import defpackage.uo2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardScoreSubValueModel {
    public final int a;
    public final int b;
    public final boolean c;
    public final LeaderboardScoreResultModel d;
    public final LeaderboardMeasureType e;

    public LeaderboardScoreSubValueModel(int i, int i2, boolean z, LeaderboardScoreResultModel leaderboardScoreResultModel, LeaderboardMeasureType leaderboardMeasureType) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = leaderboardScoreResultModel;
        this.e = leaderboardMeasureType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardScoreSubValueModel)) {
            return false;
        }
        LeaderboardScoreSubValueModel leaderboardScoreSubValueModel = (LeaderboardScoreSubValueModel) obj;
        return this.a == leaderboardScoreSubValueModel.a && this.b == leaderboardScoreSubValueModel.b && this.c == leaderboardScoreSubValueModel.c && this.d.equals(leaderboardScoreSubValueModel.d) && this.e == leaderboardScoreSubValueModel.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + uo2.a(os2.a(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbB = u43.b("LeaderboardScoreSubValueModel(id=", ", position=", ", isTakenInto=", this.a, this.b);
        sbB.append(this.c);
        sbB.append(", scoreResultModel=");
        sbB.append(this.d);
        sbB.append(", measureType=");
        sbB.append(this.e);
        sbB.append(")");
        return sbB.toString();
    }
}
