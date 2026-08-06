package com.hwpo_training_app.leaderboards.common.domain.entity;

import com.intercom.twig.BuildConfig;
import defpackage.e4;
import defpackage.fk;
import defpackage.hf3;
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
public final class LeaderboardTopValueModel {
    public static final Companion Companion = new Companion(0);
    public static final LeaderboardTopValueModel r = new LeaderboardTopValueModel(-1, null, false, 0, 0, 0, false, false, TopValueKind.t, hf3.t, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, new LeaderboardUserModel(-1, 0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, false), false, false, null);
    public final int a;
    public final Integer b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final TopValueKind i;
    public final List<LeaderboardScoreSubValueModel> j;
    public final String k;
    public final String l;
    public final String m;
    public final LeaderboardUserModel n;
    public final boolean o;
    public final boolean p;
    public final LeaderboardScoreResultModel q;

    public LeaderboardTopValueModel(int i, Integer num, boolean z, int i2, int i3, int i4, boolean z2, boolean z3, TopValueKind topValueKind, List<LeaderboardScoreSubValueModel> list, String str, String str2, String str3, LeaderboardUserModel leaderboardUserModel, boolean z4, boolean z5, LeaderboardScoreResultModel leaderboardScoreResultModel) {
        fk.b(str, str2, str3);
        this.a = i;
        this.b = num;
        this.c = z;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z2;
        this.h = z3;
        this.i = topValueKind;
        this.j = list;
        this.k = str;
        this.l = str2;
        this.m = str3;
        this.n = leaderboardUserModel;
        this.o = z4;
        this.p = z5;
        this.q = leaderboardScoreResultModel;
    }

    public static LeaderboardTopValueModel a(LeaderboardTopValueModel leaderboardTopValueModel, boolean z, int i, TopValueKind topValueKind, boolean z2, int i2) {
        int i3 = (i2 & 1) != 0 ? leaderboardTopValueModel.a : -2;
        Integer num = leaderboardTopValueModel.b;
        boolean z3 = (i2 & 4) != 0 ? leaderboardTopValueModel.c : z;
        int i4 = leaderboardTopValueModel.d;
        int i5 = leaderboardTopValueModel.e;
        int i6 = (i2 & 32) != 0 ? leaderboardTopValueModel.f : i;
        boolean z4 = leaderboardTopValueModel.g;
        boolean z5 = leaderboardTopValueModel.h;
        TopValueKind topValueKind2 = (i2 & 256) != 0 ? leaderboardTopValueModel.i : topValueKind;
        List<LeaderboardScoreSubValueModel> list = leaderboardTopValueModel.j;
        String str = leaderboardTopValueModel.k;
        String str2 = leaderboardTopValueModel.l;
        String str3 = leaderboardTopValueModel.m;
        LeaderboardUserModel leaderboardUserModel = leaderboardTopValueModel.n;
        boolean z6 = (i2 & 16384) != 0 ? leaderboardTopValueModel.o : z2;
        boolean z7 = leaderboardTopValueModel.p;
        LeaderboardScoreResultModel leaderboardScoreResultModel = leaderboardTopValueModel.q;
        leaderboardTopValueModel.getClass();
        topValueKind2.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new LeaderboardTopValueModel(i3, num, z3, i4, i5, i6, z4, z5, topValueKind2, list, str, str2, str3, leaderboardUserModel, z6, z7, leaderboardScoreResultModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardTopValueModel)) {
            return false;
        }
        LeaderboardTopValueModel leaderboardTopValueModel = (LeaderboardTopValueModel) obj;
        return this.a == leaderboardTopValueModel.a && xj5.a(this.b, leaderboardTopValueModel.b) && this.c == leaderboardTopValueModel.c && this.d == leaderboardTopValueModel.d && this.e == leaderboardTopValueModel.e && this.f == leaderboardTopValueModel.f && this.g == leaderboardTopValueModel.g && this.h == leaderboardTopValueModel.h && this.i == leaderboardTopValueModel.i && this.j.equals(leaderboardTopValueModel.j) && xj5.a(this.k, leaderboardTopValueModel.k) && xj5.a(this.l, leaderboardTopValueModel.l) && xj5.a(this.m, leaderboardTopValueModel.m) && this.n.equals(leaderboardTopValueModel.n) && this.o == leaderboardTopValueModel.o && this.p == leaderboardTopValueModel.p && xj5.a(this.q, leaderboardTopValueModel.q);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int iA = uo2.a(uo2.a((this.n.hashCode() + ru3.c(ru3.c(ru3.c(ho2.a((this.i.hashCode() + uo2.a(uo2.a(os2.a(this.f, os2.a(this.e, os2.a(this.d, uo2.a((iHashCode + (num == null ? 0 : num.hashCode())) * 31, this.c, 31), 31), 31), 31), this.g, 31), this.h, 31)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31, this.o, 31), this.p, 31);
        LeaderboardScoreResultModel leaderboardScoreResultModel = this.q;
        return iA + (leaderboardScoreResultModel != null ? leaderboardScoreResultModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardTopValueModel(id=");
        sb.append(this.a);
        sb.append(", place=");
        sb.append(this.b);
        sb.append(", isHidden=");
        sb.append(this.c);
        sb.append(", commentsCount=");
        sb.append(this.d);
        sb.append(", attachmentsCount=");
        p23.a(sb, this.e, ", likesCount=", this.f, ", showAttachments=");
        e4.a(sb, this.g, ", showPerformance=", this.h, ", topValueKind=");
        sb.append(this.i);
        sb.append(", scoreSubValues=");
        sb.append(this.j);
        sb.append(", units=");
        ux1.b(sb, this.k, ", symbol=", this.l, ", measure=");
        sb.append(this.m);
        sb.append(", user=");
        sb.append(this.n);
        sb.append(", isMyLike=");
        e4.a(sb, this.o, ", isPerformancePresent=", this.p, ", scoreResult=");
        sb.append(this.q);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }
}
