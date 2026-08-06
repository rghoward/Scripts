package com.hwpo_training_app.leaderboards.list.header.presentation;

import defpackage.el0;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardTabContainerViewState implements el0 {
    public final boolean a;
    public final boolean b;

    public LeaderboardTabContainerViewState(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static LeaderboardTabContainerViewState a(LeaderboardTabContainerViewState leaderboardTabContainerViewState, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = leaderboardTabContainerViewState.a;
        }
        if ((i & 2) != 0) {
            z2 = leaderboardTabContainerViewState.b;
        }
        leaderboardTabContainerViewState.getClass();
        return new LeaderboardTabContainerViewState(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardTabContainerViewState)) {
            return false;
        }
        LeaderboardTabContainerViewState leaderboardTabContainerViewState = (LeaderboardTabContainerViewState) obj;
        return this.a == leaderboardTabContainerViewState.a && this.b == leaderboardTabContainerViewState.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LeaderboardTabContainerViewState(isSearchFieldVisible=" + this.a + ", isFiltersBadgeVisible=" + this.b + ")";
    }

    public LeaderboardTabContainerViewState() {
        this(false, false);
    }
}
