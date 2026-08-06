package com.hwpo_training_app.leaderboards.filter.details.domain.entity;

import com.hwpo_training_app.leaderboards.filter.domain.HasGymFilter;
import defpackage.fz;
import defpackage.js7;
import defpackage.uo2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsFiltersModel implements HasGymFilter {
    public static final Companion Companion = new Companion(0);
    public static final LeaderboardDetailsFiltersModel j = new LeaderboardDetailsFiltersModel(true, true, true, null, null, null, null, null, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final Boolean g;
    public final js7<Integer, String> h;
    public final boolean i;

    public LeaderboardDetailsFiltersModel(boolean z, boolean z2, boolean z3, Integer num, Integer num2, String str, Boolean bool, js7<Integer, String> js7Var, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = num;
        this.e = num2;
        this.f = str;
        this.g = bool;
        this.h = js7Var;
        this.i = z4;
    }

    public static LeaderboardDetailsFiltersModel d(LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModel, boolean z, boolean z2, boolean z3, Integer num, Integer num2, String str, Boolean bool, js7 js7Var, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = leaderboardDetailsFiltersModel.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = leaderboardDetailsFiltersModel.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = leaderboardDetailsFiltersModel.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            num = leaderboardDetailsFiltersModel.d;
        }
        Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = leaderboardDetailsFiltersModel.e;
        }
        Integer num4 = num2;
        String str2 = (i & 32) != 0 ? leaderboardDetailsFiltersModel.f : str;
        Boolean bool2 = (i & 64) != 0 ? leaderboardDetailsFiltersModel.g : bool;
        js7 js7Var2 = (i & 128) != 0 ? leaderboardDetailsFiltersModel.h : js7Var;
        boolean z8 = (i & 256) != 0 ? leaderboardDetailsFiltersModel.i : z4;
        leaderboardDetailsFiltersModel.getClass();
        return new LeaderboardDetailsFiltersModel(z5, z6, z7, num3, num4, str2, bool2, js7Var2, z8);
    }

    @Override // com.hwpo_training_app.leaderboards.filter.domain.HasGymFilter
    public final js7<Integer, String> b() {
        return this.h;
    }

    @Override // com.hwpo_training_app.leaderboards.filter.domain.HasGymFilter
    public final boolean c() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardDetailsFiltersModel)) {
            return false;
        }
        LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModel = (LeaderboardDetailsFiltersModel) obj;
        return this.a == leaderboardDetailsFiltersModel.a && this.b == leaderboardDetailsFiltersModel.b && this.c == leaderboardDetailsFiltersModel.c && xj5.a(this.d, leaderboardDetailsFiltersModel.d) && xj5.a(this.e, leaderboardDetailsFiltersModel.e) && xj5.a(this.f, leaderboardDetailsFiltersModel.f) && xj5.a(this.g, leaderboardDetailsFiltersModel.g) && xj5.a(this.h, leaderboardDetailsFiltersModel.h) && this.i == leaderboardDetailsFiltersModel.i;
    }

    public final int hashCode() {
        int iA = uo2.a(uo2.a(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31);
        Integer num = this.d;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        js7<Integer, String> js7Var = this.h;
        return Boolean.hashCode(this.i) + ((iHashCode4 + (js7Var != null ? js7Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardDetailsFiltersModel(isMaleResults=");
        sb.append(this.a);
        sb.append(", isFemaleResults=");
        sb.append(this.b);
        sb.append(", isOtherResults=");
        sb.append(this.c);
        sb.append(", minAge=");
        sb.append(this.d);
        sb.append(", maxAge=");
        sb.append(this.e);
        sb.append(", searchFilter=");
        sb.append(this.f);
        sb.append(", hiddenByCoach=");
        sb.append(this.g);
        sb.append(", affiliatedGym=");
        sb.append(this.h);
        sb.append(", useMyGym=");
        return fz.c(sb, this.i, ")");
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
