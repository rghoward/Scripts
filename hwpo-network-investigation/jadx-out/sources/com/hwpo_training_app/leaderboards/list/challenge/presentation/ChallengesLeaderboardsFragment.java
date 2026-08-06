package com.hwpo_training_app.leaderboards.list.challenge.presentation;

import android.os.Bundle;
import defpackage.hv5;
import defpackage.j26;
import defpackage.ll8;
import defpackage.shb;
import defpackage.ss5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ChallengesLeaderboardsFragment extends Hilt_ChallengesLeaderboardsFragment {
    public final shb F;

    public ChallengesLeaderboardsFragment() {
        ss5 ss5VarC = hv5.c(j26.u, new ChallengesLeaderboardsFragment$special$$inlined$viewModels$default$2(new ChallengesLeaderboardsFragment$special$$inlined$viewModels$default$1(this)));
        this.F = new shb(ll8.a(ChallengesLeaderboardsViewModel.class), new ChallengesLeaderboardsFragment$special$$inlined$viewModels$default$3(ss5VarC), new ChallengesLeaderboardsFragment$special$$inlined$viewModels$default$5(this, ss5VarC), new ChallengesLeaderboardsFragment$special$$inlined$viewModels$default$4(ss5VarC));
    }

    @Override // androidx.fragment.app.f
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.w = (ChallengesLeaderboardsViewModel) this.F.getValue();
    }
}
