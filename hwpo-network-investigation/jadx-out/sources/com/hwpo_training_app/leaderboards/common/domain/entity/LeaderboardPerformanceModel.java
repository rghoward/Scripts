package com.hwpo_training_app.leaderboards.common.domain.entity;

import defpackage.il;
import defpackage.m89;
import defpackage.xj5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardPerformanceModel {
    public final int a;
    public final String b;
    public final List<m89> c;

    public LeaderboardPerformanceModel(int i, String str, List<m89> list) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardPerformanceModel)) {
            return false;
        }
        LeaderboardPerformanceModel leaderboardPerformanceModel = (LeaderboardPerformanceModel) obj;
        return this.a == leaderboardPerformanceModel.a && xj5.a(this.b, leaderboardPerformanceModel.b) && this.c.equals(leaderboardPerformanceModel.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("LeaderboardPerformanceModel(id=", ", text=", this.b, ", attachments=", this.a);
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
