package com.hwpo_training_app.leaderboards.common.domain.entity;

import com.intercom.twig.BuildConfig;
import defpackage.fz;
import defpackage.hf3;
import defpackage.ho2;
import defpackage.il;
import defpackage.m2b;
import defpackage.os2;
import defpackage.ru3;
import defpackage.ux1;
import defpackage.xj5;
import defpackage.xn0;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardModel {
    public static final Companion Companion = new Companion(0);
    public static final LeaderboardModel t;
    public final int a;
    public final String b;
    public final String c;
    public final LeaderboardType d;
    public final xn0 e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final LeaderboardPlanModel i;
    public final LeaderboardSectionModel j;
    public final List<String> k;
    public final int l;
    public final LeaderboardScheduleModel m;
    public final m2b n;
    public final String o;
    public final String p;
    public final LocalDateTime q;
    public final List<LeaderboardTopValueModel> r;
    public final boolean s;

    static {
        xn0 xn0Var = xn0.values()[0];
        LeaderboardSectionModel leaderboardSectionModel = new LeaderboardSectionModel(-1, BuildConfig.FLAVOR, null);
        LeaderboardScheduleModel leaderboardScheduleModel = new LeaderboardScheduleModel(-1, BuildConfig.FLAVOR);
        LeaderboardType leaderboardType = LeaderboardType.t;
        hf3 hf3Var = hf3.t;
        t = new LeaderboardModel(-1, null, null, leaderboardType, xn0Var, null, null, null, null, leaderboardSectionModel, hf3Var, 0, leaderboardScheduleModel, m2b.G, BuildConfig.FLAVOR, null, null, hf3Var, false);
    }

    public LeaderboardModel(int i, String str, String str2, LeaderboardType leaderboardType, xn0 xn0Var, Integer num, Integer num2, Integer num3, LeaderboardPlanModel leaderboardPlanModel, LeaderboardSectionModel leaderboardSectionModel, List<String> list, int i2, LeaderboardScheduleModel leaderboardScheduleModel, m2b m2bVar, String str3, String str4, LocalDateTime localDateTime, List<LeaderboardTopValueModel> list2, boolean z) {
        xn0Var.getClass();
        m2bVar.getClass();
        str3.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = leaderboardType;
        this.e = xn0Var;
        this.f = num;
        this.g = num2;
        this.h = num3;
        this.i = leaderboardPlanModel;
        this.j = leaderboardSectionModel;
        this.k = list;
        this.l = i2;
        this.m = leaderboardScheduleModel;
        this.n = m2bVar;
        this.o = str3;
        this.p = str4;
        this.q = localDateTime;
        this.r = list2;
        this.s = z;
    }

    public static LeaderboardModel a(LeaderboardModel leaderboardModel, LeaderboardType leaderboardType, ArrayList arrayList, int i) {
        int i2 = leaderboardModel.a;
        String str = leaderboardModel.b;
        String str2 = leaderboardModel.c;
        LeaderboardType leaderboardType2 = (i & 8) != 0 ? leaderboardModel.d : leaderboardType;
        xn0 xn0Var = leaderboardModel.e;
        Integer num = leaderboardModel.f;
        Integer num2 = leaderboardModel.g;
        Integer num3 = leaderboardModel.h;
        LeaderboardPlanModel leaderboardPlanModel = leaderboardModel.i;
        LeaderboardSectionModel leaderboardSectionModel = leaderboardModel.j;
        List<String> list = leaderboardModel.k;
        int i3 = leaderboardModel.l;
        LeaderboardScheduleModel leaderboardScheduleModel = leaderboardModel.m;
        m2b m2bVar = leaderboardModel.n;
        String str3 = leaderboardModel.o;
        String str4 = leaderboardModel.p;
        LocalDateTime localDateTime = leaderboardModel.q;
        List<LeaderboardTopValueModel> list2 = (i & 131072) != 0 ? leaderboardModel.r : arrayList;
        boolean z = leaderboardModel.s;
        leaderboardModel.getClass();
        leaderboardType2.getClass();
        xn0Var.getClass();
        m2bVar.getClass();
        str3.getClass();
        return new LeaderboardModel(i2, str, str2, leaderboardType2, xn0Var, num, num2, num3, leaderboardPlanModel, leaderboardSectionModel, list, i3, leaderboardScheduleModel, m2bVar, str3, str4, localDateTime, list2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardModel)) {
            return false;
        }
        LeaderboardModel leaderboardModel = (LeaderboardModel) obj;
        return this.a == leaderboardModel.a && xj5.a(this.b, leaderboardModel.b) && xj5.a(this.c, leaderboardModel.c) && this.d == leaderboardModel.d && this.e == leaderboardModel.e && xj5.a(this.f, leaderboardModel.f) && xj5.a(this.g, leaderboardModel.g) && xj5.a(this.h, leaderboardModel.h) && xj5.a(this.i, leaderboardModel.i) && xj5.a(this.j, leaderboardModel.j) && this.k.equals(leaderboardModel.k) && this.l == leaderboardModel.l && xj5.a(this.m, leaderboardModel.m) && this.n == leaderboardModel.n && xj5.a(this.o, leaderboardModel.o) && xj5.a(this.p, leaderboardModel.p) && xj5.a(this.q, leaderboardModel.q) && this.r.equals(leaderboardModel.r) && this.s == leaderboardModel.s;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        Integer num = this.f;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.h;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        LeaderboardPlanModel leaderboardPlanModel = this.i;
        int iHashCode7 = (iHashCode6 + (leaderboardPlanModel == null ? 0 : leaderboardPlanModel.hashCode())) * 31;
        LeaderboardSectionModel leaderboardSectionModel = this.j;
        int iA = os2.a(this.l, ho2.a((iHashCode7 + (leaderboardSectionModel == null ? 0 : leaderboardSectionModel.hashCode())) * 31, 31, this.k), 31);
        LeaderboardScheduleModel leaderboardScheduleModel = this.m;
        int iC = ru3.c((this.n.hashCode() + ((iA + (leaderboardScheduleModel == null ? 0 : leaderboardScheduleModel.hashCode())) * 31)) * 31, 31, this.o);
        String str3 = this.p;
        int iHashCode8 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        LocalDateTime localDateTime = this.q;
        return Boolean.hashCode(this.s) + ho2.a((iHashCode8 + (localDateTime != null ? localDateTime.hashCode() : 0)) * 31, 31, this.r);
    }

    public final String toString() {
        StringBuilder sbA = il.a("LeaderboardModel(id=", ", title=", this.b, ", description=", this.a);
        sbA.append(this.c);
        sbA.append(", type=");
        sbA.append(this.d);
        sbA.append(", measure=");
        sbA.append(this.e);
        sbA.append(", rounds=");
        sbA.append(this.f);
        sbA.append(", reps=");
        sbA.append(this.g);
        sbA.append(", countSubValue=");
        sbA.append(this.h);
        sbA.append(", plan=");
        sbA.append(this.i);
        sbA.append(", section=");
        sbA.append(this.j);
        sbA.append(", tags=");
        sbA.append(this.k);
        sbA.append(", commentsCount=");
        sbA.append(this.l);
        sbA.append(", schedule=");
        sbA.append(this.m);
        sbA.append(", units=");
        sbA.append(this.n);
        sbA.append(", symbol=");
        ux1.b(sbA, this.o, ", objective=", this.p, ", updatedAt=");
        sbA.append(this.q);
        sbA.append(", topValues=");
        sbA.append(this.r);
        sbA.append(", isSearchResult=");
        return fz.c(sbA, this.s, ")");
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
