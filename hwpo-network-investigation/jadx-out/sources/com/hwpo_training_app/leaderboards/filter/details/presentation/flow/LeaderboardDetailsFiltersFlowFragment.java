package com.hwpo_training_app.leaderboards.filter.details.presentation.flow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.databinding.DialogLeaderboardFiltersFlowBinding;
import com.hwpo_training_app.leaderboards.filter.details.presentation.flow.LeaderboardDetailsFiltersFlowFragment;
import defpackage.g2b;
import defpackage.ho5;
import defpackage.hv5;
import defpackage.j26;
import defpackage.ll8;
import defpackage.mh4;
import defpackage.ne8;
import defpackage.o7a;
import defpackage.oh4;
import defpackage.q26;
import defpackage.q87;
import defpackage.shb;
import defpackage.ss5;
import defpackage.vg4;
import defpackage.x01;
import defpackage.xj5;
import defpackage.y10;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsFiltersFlowFragment extends Hilt_LeaderboardDetailsFiltersFlowFragment {
    public q87 P;
    public final int Q = R.id.flowContainer;
    public final o7a R = new o7a(new x01(1, this));
    public final vg4 S = new vg4(new oh4<LeaderboardDetailsFiltersFlowFragment, DialogLeaderboardFiltersFlowBinding>() { // from class: com.hwpo_training_app.leaderboards.filter.details.presentation.flow.LeaderboardDetailsFiltersFlowFragment$special$$inlined$viewBindingFragment$default$1
        @Override // defpackage.oh4
        public final DialogLeaderboardFiltersFlowBinding invoke(LeaderboardDetailsFiltersFlowFragment leaderboardDetailsFiltersFlowFragment) {
            LeaderboardDetailsFiltersFlowFragment leaderboardDetailsFiltersFlowFragment2 = leaderboardDetailsFiltersFlowFragment;
            leaderboardDetailsFiltersFlowFragment2.getClass();
            return DialogLeaderboardFiltersFlowBinding.bind(leaderboardDetailsFiltersFlowFragment2.requireView());
        }
    });
    public final shb T;
    public final boolean U;
    public final q26 V;
    public static final /* synthetic */ ho5<Object>[] W = {new ne8(LeaderboardDetailsFiltersFlowFragment.class, "binding", "getBinding()Lcom/hwpo_training_app/leaderboards/databinding/DialogLeaderboardFiltersFlowBinding;", 0)};
    public static final Companion Companion = new Companion(0);

    public LeaderboardDetailsFiltersFlowFragment() {
        ss5 ss5VarC = hv5.c(j26.u, new LeaderboardDetailsFiltersFlowFragment$special$$inlined$viewModels$default$2(new LeaderboardDetailsFiltersFlowFragment$special$$inlined$viewModels$default$1(this)));
        this.T = new shb(ll8.a(LeaderboardDetailsFiltersFlowViewModel.class), new LeaderboardDetailsFiltersFlowFragment$special$$inlined$viewModels$default$3(ss5VarC), new LeaderboardDetailsFiltersFlowFragment$special$$inlined$viewModels$default$5(this, ss5VarC), new LeaderboardDetailsFiltersFlowFragment$special$$inlined$viewModels$default$4(ss5VarC));
        this.U = true;
        this.V = new q26(0, this);
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dialog_leaderboard_filters_flow, viewGroup);
    }

    @Override // androidx.fragment.app.f
    public final void onPause() {
        super.onPause();
        q87 q87Var = this.P;
        if (q87Var != null) {
            q87Var.a();
        } else {
            xj5.e("flowNavigatorHolder");
            throw null;
        }
    }

    @Override // androidx.fragment.app.f
    public final void onResume() {
        super.onResume();
        q87 q87Var = this.P;
        if (q87Var != null) {
            q87Var.b((y10) this.R.getValue());
        } else {
            xj5.e("flowNavigatorHolder");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        T tA = this.S.a(this, W[0]);
        tA.getClass();
        ((DialogLeaderboardFiltersFlowBinding) tA).a.post(new Runnable() { // from class: r26
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                LeaderboardDetailsFiltersFlowFragment.Companion companion = LeaderboardDetailsFiltersFlowFragment.Companion;
                LeaderboardDetailsFiltersFlowFragment leaderboardDetailsFiltersFlowFragment = this.t;
                int dimension = (int) leaderboardDetailsFiltersFlowFragment.getResources().getDimension(R.dimen.bottom_sheet_top_padding);
                BottomSheetBehavior<FrameLayout> bottomSheetBehaviorP = leaderboardDetailsFiltersFlowFragment.p();
                T tA2 = leaderboardDetailsFiltersFlowFragment.S.a(leaderboardDetailsFiltersFlowFragment, LeaderboardDetailsFiltersFlowFragment.W[0]);
                tA2.getClass();
                bottomSheetBehaviorP.K(((DialogLeaderboardFiltersFlowBinding) tA2).a.getHeight() + dimension);
            }
        });
    }

    @Override // defpackage.zj0
    public final mh4<g2b> q() {
        return this.V;
    }

    @Override // defpackage.zj0
    public final boolean r() {
        return this.U;
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
