package com.hwpo_training_app.leaderboards.filter.list.presentation.screen;

import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.entity.ProgramTypeStateUiEntity;
import com.hwpo_training_app.leaderboards.filter.presentation.SelectedGymFilterUiEntity;
import defpackage.e4;
import defpackage.el0;
import defpackage.fz;
import defpackage.uo2;
import defpackage.ux1;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardFiltersViewState implements el0 {
    public static final Companion Companion = new Companion(0);
    public final ProgramTypeStateUiEntity a;
    public final boolean b;
    public final boolean c;
    public final SelectedGymFilterUiEntity d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    static {
        new LeaderboardFiltersViewState(new ProgramTypeStateUiEntity(), true, false, new SelectedGymFilterUiEntity.None(false), null, null, null, null, false, false, false);
    }

    public LeaderboardFiltersViewState(ProgramTypeStateUiEntity programTypeStateUiEntity, boolean z, boolean z2, SelectedGymFilterUiEntity selectedGymFilterUiEntity, String str, String str2, String str3, String str4, boolean z3, boolean z4, boolean z5) {
        selectedGymFilterUiEntity.getClass();
        this.a = programTypeStateUiEntity;
        this.b = z;
        this.c = z2;
        this.d = selectedGymFilterUiEntity;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public static LeaderboardFiltersViewState a(LeaderboardFiltersViewState leaderboardFiltersViewState, ProgramTypeStateUiEntity programTypeStateUiEntity, boolean z, boolean z2, SelectedGymFilterUiEntity selectedGymFilterUiEntity, String str, String str2, String str3, String str4, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            programTypeStateUiEntity = leaderboardFiltersViewState.a;
        }
        ProgramTypeStateUiEntity programTypeStateUiEntity2 = programTypeStateUiEntity;
        if ((i & 2) != 0) {
            z = leaderboardFiltersViewState.b;
        }
        boolean z6 = z;
        if ((i & 4) != 0) {
            z2 = leaderboardFiltersViewState.c;
        }
        boolean z7 = z2;
        SelectedGymFilterUiEntity selectedGymFilterUiEntity2 = (i & 8) != 0 ? leaderboardFiltersViewState.d : selectedGymFilterUiEntity;
        String str5 = (i & 16) != 0 ? leaderboardFiltersViewState.e : str;
        String str6 = (i & 32) != 0 ? leaderboardFiltersViewState.f : str2;
        String str7 = (i & 64) != 0 ? leaderboardFiltersViewState.g : str3;
        String str8 = (i & 128) != 0 ? leaderboardFiltersViewState.h : str4;
        boolean z8 = (i & 256) != 0 ? leaderboardFiltersViewState.i : z3;
        boolean z9 = (i & 512) != 0 ? leaderboardFiltersViewState.j : z4;
        boolean z10 = (i & 1024) != 0 ? leaderboardFiltersViewState.k : z5;
        leaderboardFiltersViewState.getClass();
        selectedGymFilterUiEntity2.getClass();
        return new LeaderboardFiltersViewState(programTypeStateUiEntity2, z6, z7, selectedGymFilterUiEntity2, str5, str6, str7, str8, z8, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardFiltersViewState)) {
            return false;
        }
        LeaderboardFiltersViewState leaderboardFiltersViewState = (LeaderboardFiltersViewState) obj;
        return this.a.equals(leaderboardFiltersViewState.a) && this.b == leaderboardFiltersViewState.b && this.c == leaderboardFiltersViewState.c && xj5.a(this.d, leaderboardFiltersViewState.d) && xj5.a(this.e, leaderboardFiltersViewState.e) && xj5.a(this.f, leaderboardFiltersViewState.f) && xj5.a(this.g, leaderboardFiltersViewState.g) && xj5.a(this.h, leaderboardFiltersViewState.h) && this.i == leaderboardFiltersViewState.i && this.j == leaderboardFiltersViewState.j && this.k == leaderboardFiltersViewState.k;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + uo2.a(uo2.a(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        return Boolean.hashCode(this.k) + uo2.a(uo2.a((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, this.i, 31), this.j, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardFiltersViewState(programTypeStateUiEntity=");
        sb.append(this.a);
        sb.append(", hideEmptyLeaderboards=");
        sb.append(this.b);
        sb.append(", defaultToScaled=");
        sb.append(this.c);
        sb.append(", selectedGymFilter=");
        sb.append(this.d);
        sb.append(", dateFrom=");
        ux1.b(sb, this.e, ", dateTo=", this.f, ", dayFrom=");
        ux1.b(sb, this.g, ", dayTo=", this.h, ", filterByDay=");
        e4.a(sb, this.i, ", isApplyButtonEnabled=", this.j, ", inputIncorrect=");
        return fz.c(sb, this.k, ")");
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
