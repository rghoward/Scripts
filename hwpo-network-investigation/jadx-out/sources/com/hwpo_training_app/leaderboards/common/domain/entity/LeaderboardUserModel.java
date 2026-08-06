package com.hwpo_training_app.leaderboards.common.domain.entity;

import defpackage.il;
import defpackage.os2;
import defpackage.ru3;
import defpackage.ux1;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardUserModel {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;

    public LeaderboardUserModel(int i, int i2, String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardUserModel)) {
            return false;
        }
        LeaderboardUserModel leaderboardUserModel = (LeaderboardUserModel) obj;
        return this.a == leaderboardUserModel.a && xj5.a(this.b, leaderboardUserModel.b) && xj5.a(this.c, leaderboardUserModel.c) && xj5.a(this.d, leaderboardUserModel.d) && this.e == leaderboardUserModel.e && this.f == leaderboardUserModel.f;
    }

    public final int hashCode() {
        int iC = ru3.c(ru3.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.f) + os2.a(this.e, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("LeaderboardUserModel(id=", ", fullName=", this.b, ", country=", this.a);
        ux1.b(sbA, this.c, ", avatarUrl=", this.d, ", age=");
        sbA.append(this.e);
        sbA.append(", isMine=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
