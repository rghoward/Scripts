package com.hwpo_training_app.leaderboards.list.common.presentation;

import com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity;
import defpackage.el0;
import defpackage.hf3;
import defpackage.uo2;
import defpackage.vz7;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BaseLeaderboardsListViewState implements el0 {
    public static final Companion Companion = new Companion(0);
    public static final BaseLeaderboardsListViewState e = new BaseLeaderboardsListViewState(new vz7(0, false, false, null, null, null, 127), hf3.t, false, false);
    public final List<LeaderboardItemUiEntity> a;
    public final vz7 b;
    public final boolean c;
    public final boolean d;

    public BaseLeaderboardsListViewState(vz7 vz7Var, List list, boolean z, boolean z2) {
        this.a = list;
        this.b = vz7Var;
        this.c = z;
        this.d = z2;
    }

    public static BaseLeaderboardsListViewState a(BaseLeaderboardsListViewState baseLeaderboardsListViewState, List list, vz7 vz7Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = baseLeaderboardsListViewState.a;
        }
        if ((i & 2) != 0) {
            vz7Var = baseLeaderboardsListViewState.b;
        }
        if ((i & 4) != 0) {
            z = baseLeaderboardsListViewState.c;
        }
        if ((i & 8) != 0) {
            z2 = baseLeaderboardsListViewState.d;
        }
        baseLeaderboardsListViewState.getClass();
        list.getClass();
        return new BaseLeaderboardsListViewState(vz7Var, list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLeaderboardsListViewState)) {
            return false;
        }
        BaseLeaderboardsListViewState baseLeaderboardsListViewState = (BaseLeaderboardsListViewState) obj;
        return this.a.equals(baseLeaderboardsListViewState.a) && this.b.equals(baseLeaderboardsListViewState.b) && this.c == baseLeaderboardsListViewState.c && this.d == baseLeaderboardsListViewState.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + uo2.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        return "BaseLeaderboardsListViewState(leaderboardsList=" + this.a + ", placeholderState=" + this.b + ", isLoading=" + this.c + ", isPaginationProgress=" + this.d + ")";
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
