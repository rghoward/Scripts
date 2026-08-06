package com.hwpo_training_app.leaderboards.common.domain.entity;

import defpackage.av;
import defpackage.il;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardSectionModel {
    public final int a;
    public final String b;
    public final String c;

    public LeaderboardSectionModel(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardSectionModel)) {
            return false;
        }
        LeaderboardSectionModel leaderboardSectionModel = (LeaderboardSectionModel) obj;
        return this.a == leaderboardSectionModel.a && xj5.a(this.b, leaderboardSectionModel.b) && xj5.a(this.c, leaderboardSectionModel.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return av.a(il.a("LeaderboardSectionModel(id=", ", title=", this.b, ", description=", this.a), this.c, ")");
    }
}
