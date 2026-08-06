package com.hwpo_training_app.leaderboards.details.header.presentation.adapter;

import androidx.fragment.app.f;
import com.hwpo_training_app.leaderboards.common.domain.entity.TopValueKind;
import com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment;
import com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListFragment;
import defpackage.xf4;
import defpackage.z90;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AthletesListTabAdapter extends xf4 {
    public static final Companion Companion = new Companion(0);
    public final int m;

    public AthletesListTabAdapter(LeaderboardDetailsHeaderFragment leaderboardDetailsHeaderFragment, int i) {
        super(leaderboardDetailsHeaderFragment);
        this.m = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int f() {
        return 2;
    }

    @Override // defpackage.xf4
    public final f w(int i) {
        int i2 = this.m;
        if (i == 0) {
            AthletesListFragment.Companion.getClass();
            return AthletesListFragment.Companion.a(i2, TopValueKind.t);
        }
        if (i == 1) {
            AthletesListFragment.Companion.getClass();
            return AthletesListFragment.Companion.a(i2, TopValueKind.u);
        }
        z90.a("Invalid leaderboard TopValue type");
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
