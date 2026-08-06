package com.hwpo_training_app.leaderboards.list.header.presentation.adapter;

import androidx.fragment.app.f;
import com.hwpo_training_app.leaderboards.list.challenge.presentation.ChallengesLeaderboardsFragment;
import com.hwpo_training_app.leaderboards.list.daily.presentation.DailyLeaderboardsFragment;
import defpackage.xf4;
import defpackage.z90;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardsTabAdapter extends xf4 {
    public static final Companion Companion = new Companion(0);

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int f() {
        return 2;
    }

    @Override // defpackage.xf4
    public final f w(int i) {
        if (i == 0) {
            return new DailyLeaderboardsFragment();
        }
        if (i == 1) {
            return new ChallengesLeaderboardsFragment();
        }
        z90.a("Invalid leaderboard type");
        return null;
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
