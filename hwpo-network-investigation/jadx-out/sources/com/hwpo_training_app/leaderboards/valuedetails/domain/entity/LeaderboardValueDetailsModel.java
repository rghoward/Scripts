package com.hwpo_training_app.leaderboards.valuedetails.domain.entity;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardPerformanceModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardScoreResultModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardScoreSubValueModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardUserModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.TopValueKind;
import defpackage.fk;
import defpackage.ho2;
import defpackage.os2;
import defpackage.p23;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.ux1;
import defpackage.xj5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardValueDetailsModel {
    public final int a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final TopValueKind h;
    public final List<LeaderboardScoreSubValueModel> i;
    public final String j;
    public final String k;
    public final String l;
    public final LeaderboardUserModel m;
    public final boolean n;
    public final boolean o;
    public final LeaderboardScoreResultModel p;
    public final LeaderboardValueParentInfoModel q;
    public final LeaderboardPerformanceModel r;

    public LeaderboardValueDetailsModel(int i, boolean z, int i2, int i3, int i4, boolean z2, boolean z3, TopValueKind topValueKind, List<LeaderboardScoreSubValueModel> list, String str, String str2, String str3, LeaderboardUserModel leaderboardUserModel, boolean z4, boolean z5, LeaderboardScoreResultModel leaderboardScoreResultModel, LeaderboardValueParentInfoModel leaderboardValueParentInfoModel, LeaderboardPerformanceModel leaderboardPerformanceModel) {
        fk.b(str, str2, str3);
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = z2;
        this.g = z3;
        this.h = topValueKind;
        this.i = list;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = leaderboardUserModel;
        this.n = z4;
        this.o = z5;
        this.p = leaderboardScoreResultModel;
        this.q = leaderboardValueParentInfoModel;
        this.r = leaderboardPerformanceModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardValueDetailsModel)) {
            return false;
        }
        LeaderboardValueDetailsModel leaderboardValueDetailsModel = (LeaderboardValueDetailsModel) obj;
        return this.a == leaderboardValueDetailsModel.a && this.b == leaderboardValueDetailsModel.b && this.c == leaderboardValueDetailsModel.c && this.d == leaderboardValueDetailsModel.d && this.e == leaderboardValueDetailsModel.e && this.f == leaderboardValueDetailsModel.f && this.g == leaderboardValueDetailsModel.g && this.h == leaderboardValueDetailsModel.h && this.i.equals(leaderboardValueDetailsModel.i) && xj5.a(this.j, leaderboardValueDetailsModel.j) && xj5.a(this.k, leaderboardValueDetailsModel.k) && xj5.a(this.l, leaderboardValueDetailsModel.l) && this.m.equals(leaderboardValueDetailsModel.m) && this.n == leaderboardValueDetailsModel.n && this.o == leaderboardValueDetailsModel.o && this.p.equals(leaderboardValueDetailsModel.p) && this.q.equals(leaderboardValueDetailsModel.q) && xj5.a(this.r, leaderboardValueDetailsModel.r);
    }

    public final int hashCode() {
        int iHashCode = (this.q.hashCode() + ((this.p.hashCode() + uo2.a(uo2.a((this.m.hashCode() + ru3.c(ru3.c(ru3.c(ho2.a((this.h.hashCode() + uo2.a(uo2.a(os2.a(this.e, os2.a(this.d, os2.a(this.c, uo2.a(Integer.hashCode(this.a) * 31, this.b, 31), 31), 31), 31), this.f, 31), this.g, 31)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31, this.n, 31), this.o, 31)) * 31)) * 31;
        LeaderboardPerformanceModel leaderboardPerformanceModel = this.r;
        return iHashCode + (leaderboardPerformanceModel == null ? 0 : leaderboardPerformanceModel.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardValueDetailsModel(id=");
        sb.append(this.a);
        sb.append(", isHidden=");
        sb.append(this.b);
        sb.append(", commentsCount=");
        p23.a(sb, this.c, ", attachmentsCount=", this.d, ", likesCount=");
        sb.append(this.e);
        sb.append(", showAttachments=");
        sb.append(this.f);
        sb.append(", showPerformance=");
        sb.append(this.g);
        sb.append(", topValueKind=");
        sb.append(this.h);
        sb.append(", scoreSubValues=");
        sb.append(this.i);
        sb.append(", units=");
        sb.append(this.j);
        sb.append(", symbol=");
        ux1.b(sb, this.k, ", measure=", this.l, ", user=");
        sb.append(this.m);
        sb.append(", isMyLike=");
        sb.append(this.n);
        sb.append(", isPerformancePresent=");
        sb.append(this.o);
        sb.append(", scoreResult=");
        sb.append(this.p);
        sb.append(", parentInfo=");
        sb.append(this.q);
        sb.append(", performance=");
        sb.append(this.r);
        sb.append(")");
        return sb.toString();
    }
}
