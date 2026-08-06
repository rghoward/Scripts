package com.hwpo_training_app.leaderboards.details.header.presentation;

import com.hwpo_training_app.leaderboards.details.header.presentation.entity.ExpandableDescriptionStatesUiEntity;
import com.hwpo_training_app.leaderboards.details.header.presentation.entity.HeaderUiEntity;
import com.intercom.twig.BuildConfig;
import defpackage.e4;
import defpackage.el0;
import defpackage.fz;
import defpackage.uo2;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsHeaderViewState implements el0 {
    public static final Companion Companion = new Companion(0);
    public static final LeaderboardDetailsHeaderViewState h = new LeaderboardDetailsHeaderViewState(new HeaderUiEntity(BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, false, false, false), false, ExpandableDescriptionStatesUiEntity.t, null, false, true, false);
    public final HeaderUiEntity a;
    public final boolean b;
    public final ExpandableDescriptionStatesUiEntity c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public LeaderboardDetailsHeaderViewState(HeaderUiEntity headerUiEntity, boolean z, ExpandableDescriptionStatesUiEntity expandableDescriptionStatesUiEntity, String str, boolean z2, boolean z3, boolean z4) {
        this.a = headerUiEntity;
        this.b = z;
        this.c = expandableDescriptionStatesUiEntity;
        this.d = str;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public static LeaderboardDetailsHeaderViewState a(LeaderboardDetailsHeaderViewState leaderboardDetailsHeaderViewState, HeaderUiEntity headerUiEntity, boolean z, ExpandableDescriptionStatesUiEntity expandableDescriptionStatesUiEntity, String str, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            headerUiEntity = leaderboardDetailsHeaderViewState.a;
        }
        HeaderUiEntity headerUiEntity2 = headerUiEntity;
        if ((i & 2) != 0) {
            z = leaderboardDetailsHeaderViewState.b;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            expandableDescriptionStatesUiEntity = leaderboardDetailsHeaderViewState.c;
        }
        ExpandableDescriptionStatesUiEntity expandableDescriptionStatesUiEntity2 = expandableDescriptionStatesUiEntity;
        if ((i & 8) != 0) {
            str = leaderboardDetailsHeaderViewState.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z2 = leaderboardDetailsHeaderViewState.e;
        }
        boolean z6 = z2;
        if ((i & 32) != 0) {
            z3 = leaderboardDetailsHeaderViewState.f;
        }
        boolean z7 = z3;
        if ((i & 64) != 0) {
            z4 = leaderboardDetailsHeaderViewState.g;
        }
        leaderboardDetailsHeaderViewState.getClass();
        headerUiEntity2.getClass();
        expandableDescriptionStatesUiEntity2.getClass();
        return new LeaderboardDetailsHeaderViewState(headerUiEntity2, z5, expandableDescriptionStatesUiEntity2, str2, z6, z7, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardDetailsHeaderViewState)) {
            return false;
        }
        LeaderboardDetailsHeaderViewState leaderboardDetailsHeaderViewState = (LeaderboardDetailsHeaderViewState) obj;
        return this.a.equals(leaderboardDetailsHeaderViewState.a) && this.b == leaderboardDetailsHeaderViewState.b && this.c == leaderboardDetailsHeaderViewState.c && xj5.a(this.d, leaderboardDetailsHeaderViewState.d) && this.e == leaderboardDetailsHeaderViewState.e && this.f == leaderboardDetailsHeaderViewState.f && this.g == leaderboardDetailsHeaderViewState.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + uo2.a(this.a.hashCode() * 31, this.b, 31)) * 31;
        String str = this.d;
        return Boolean.hashCode(this.g) + uo2.a(uo2.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.e, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeaderboardDetailsHeaderViewState(headerState=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", expandableDescriptionState=");
        sb.append(this.c);
        sb.append(", expandButtonText=");
        sb.append(this.d);
        sb.append(", isFiltersBadgeVisible=");
        e4.a(sb, this.e, ", isToolbarVisible=", this.f, ", isCancelSearchButtonVisible=");
        return fz.c(sb, this.g, ")");
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
