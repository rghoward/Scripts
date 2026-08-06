package com.hwpo_training_app.leaderboards.list.daily.presentation;

import android.os.Bundle;
import defpackage.hv5;
import defpackage.j26;
import defpackage.ll8;
import defpackage.shb;
import defpackage.ss5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DailyLeaderboardsFragment extends Hilt_DailyLeaderboardsFragment {
    public final shb F;

    public DailyLeaderboardsFragment() {
        ss5 ss5VarC = hv5.c(j26.u, new DailyLeaderboardsFragment$special$$inlined$viewModels$default$2(new DailyLeaderboardsFragment$special$$inlined$viewModels$default$1(this)));
        this.F = new shb(ll8.a(DailyLeaderboardsViewModel.class), new DailyLeaderboardsFragment$special$$inlined$viewModels$default$3(ss5VarC), new DailyLeaderboardsFragment$special$$inlined$viewModels$default$5(this, ss5VarC), new DailyLeaderboardsFragment$special$$inlined$viewModels$default$4(ss5VarC));
    }

    @Override // androidx.fragment.app.f
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.w = (DailyLeaderboardsViewModel) this.F.getValue();
    }
}
