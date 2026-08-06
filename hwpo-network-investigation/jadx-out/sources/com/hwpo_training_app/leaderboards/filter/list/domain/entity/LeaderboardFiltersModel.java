package com.hwpo_training_app.leaderboards.filter.list.domain.entity;

import com.hwpo_training_app.leaderboards.filter.domain.HasGymFilter;
import defpackage.js7;
import defpackage.uo2;
import defpackage.xj5;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardFiltersModel implements HasGymFilter {
    public static final Companion Companion = new Companion(0);
    public static final LeaderboardFiltersModel k = new LeaderboardFiltersModel(true, false, null, null, null, null, false, null, null, false);
    public final boolean a;
    public final boolean b;
    public final LocalDate c;
    public final LocalDate d;
    public final Integer e;
    public final Integer f;
    public final boolean g;
    public final String h;
    public final js7<Integer, String> i;
    public final boolean j;

    public LeaderboardFiltersModel(boolean z, boolean z2, LocalDate localDate, LocalDate localDate2, Integer num, Integer num2, boolean z3, String str, js7 js7Var, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = localDate;
        this.d = localDate2;
        this.e = num;
        this.f = num2;
        this.g = z3;
        this.h = str;
        this.i = js7Var;
        this.j = z4;
    }

    public static LeaderboardFiltersModel d(LeaderboardFiltersModel leaderboardFiltersModel, boolean z, boolean z2, LocalDate localDate, LocalDate localDate2, Integer num, Integer num2, boolean z3, String str, js7 js7Var, boolean z4, int i) {
        leaderboardFiltersModel.getClass();
        leaderboardFiltersModel.getClass();
        leaderboardFiltersModel.getClass();
        if ((i & 8) != 0) {
            z = leaderboardFiltersModel.a;
        }
        boolean z5 = z;
        if ((i & 16) != 0) {
            z2 = leaderboardFiltersModel.b;
        }
        boolean z6 = z2;
        if ((i & 32) != 0) {
            localDate = leaderboardFiltersModel.c;
        }
        LocalDate localDate3 = localDate;
        if ((i & 64) != 0) {
            localDate2 = leaderboardFiltersModel.d;
        }
        LocalDate localDate4 = localDate2;
        Integer num3 = (i & 128) != 0 ? leaderboardFiltersModel.e : num;
        Integer num4 = (i & 256) != 0 ? leaderboardFiltersModel.f : num2;
        boolean z7 = (i & 512) != 0 ? leaderboardFiltersModel.g : z3;
        String str2 = (i & 1024) != 0 ? leaderboardFiltersModel.h : str;
        js7 js7Var2 = (i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? leaderboardFiltersModel.i : js7Var;
        boolean z8 = (i & 4096) != 0 ? leaderboardFiltersModel.j : z4;
        leaderboardFiltersModel.getClass();
        return new LeaderboardFiltersModel(z5, z6, localDate3, localDate4, num3, num4, z7, str2, js7Var2, z8);
    }

    @Override // com.hwpo_training_app.leaderboards.filter.domain.HasGymFilter
    public final js7<Integer, String> b() {
        return this.i;
    }

    @Override // com.hwpo_training_app.leaderboards.filter.domain.HasGymFilter
    public final boolean c() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardFiltersModel)) {
            return false;
        }
        LeaderboardFiltersModel leaderboardFiltersModel = (LeaderboardFiltersModel) obj;
        return this.a == leaderboardFiltersModel.a && this.b == leaderboardFiltersModel.b && xj5.a(this.c, leaderboardFiltersModel.c) && xj5.a(this.d, leaderboardFiltersModel.d) && xj5.a(this.e, leaderboardFiltersModel.e) && xj5.a(this.f, leaderboardFiltersModel.f) && this.g == leaderboardFiltersModel.g && xj5.a(this.h, leaderboardFiltersModel.h) && xj5.a(this.i, leaderboardFiltersModel.i) && this.j == leaderboardFiltersModel.j;
    }

    public final int hashCode() {
        int iA = uo2.a(uo2.a(uo2.a(uo2.a(Boolean.hashCode(true) * 31, true, 31), true, 31), this.a, 31), this.b, 31);
        LocalDate localDate = this.c;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.d;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iA2 = uo2.a((iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, this.g, 31);
        String str = this.h;
        int iHashCode4 = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        js7<Integer, String> js7Var = this.i;
        return Boolean.hashCode(this.j) + ((iHashCode4 + (js7Var != null ? js7Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LeaderboardFiltersModel(isFixedLength=true, isGroupRolling=true, isFirstSessionDay=true, hideEmptyLeaderboards=" + this.a + ", defaultToScaled=" + this.b + ", dateFrom=" + this.c + ", dateTo=" + this.d + ", dayFrom=" + this.e + ", dayTo=" + this.f + ", filterByDay=" + this.g + ", searchFilter=" + this.h + ", affiliatedGym=" + this.i + ", useMyGym=" + this.j + ")";
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
