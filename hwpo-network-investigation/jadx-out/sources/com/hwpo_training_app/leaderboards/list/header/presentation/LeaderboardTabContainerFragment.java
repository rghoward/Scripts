package com.hwpo_training_app.leaderboards.list.header.presentation;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.l;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SearchEditText;
import com.hwpo_training_app.leaderboards.databinding.FragmentLeaderboardsTabContainerBinding;
import com.hwpo_training_app.leaderboards.filter.list.presentation.flow.LeaderboardFiltersFlowFragment;
import com.hwpo_training_app.leaderboards.list.header.presentation.LeaderboardTabContainerEvents;
import com.hwpo_training_app.leaderboards.list.header.presentation.LeaderboardTabContainerFragment;
import com.hwpo_training_app.leaderboards.list.header.presentation.adapter.LeaderboardsTabAdapter;
import defpackage.ee5;
import defpackage.g2b;
import defpackage.ho5;
import defpackage.hv5;
import defpackage.hy8;
import defpackage.iy8;
import defpackage.j26;
import defpackage.k74;
import defpackage.ll8;
import defpackage.m76;
import defpackage.n46;
import defpackage.ne8;
import defpackage.oh4;
import defpackage.r54;
import defpackage.rhb;
import defpackage.rv;
import defpackage.shb;
import defpackage.ss5;
import defpackage.vg4;
import defpackage.whb;
import defpackage.xgb;
import defpackage.yk2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardTabContainerFragment extends Hilt_LeaderboardTabContainerFragment implements rv {
    public static final /* synthetic */ ho5<Object>[] C = {new ne8(LeaderboardTabContainerFragment.class, "binding", "getBinding()Lcom/hwpo_training_app/leaderboards/databinding/FragmentLeaderboardsTabContainerBinding;", 0)};
    public final vg4 A = new vg4(new oh4<LeaderboardTabContainerFragment, FragmentLeaderboardsTabContainerBinding>() { // from class: com.hwpo_training_app.leaderboards.list.header.presentation.LeaderboardTabContainerFragment$special$$inlined$viewBindingFragment$default$1
        @Override // defpackage.oh4
        public final FragmentLeaderboardsTabContainerBinding invoke(LeaderboardTabContainerFragment leaderboardTabContainerFragment) {
            LeaderboardTabContainerFragment leaderboardTabContainerFragment2 = leaderboardTabContainerFragment;
            leaderboardTabContainerFragment2.getClass();
            return FragmentLeaderboardsTabContainerBinding.bind(leaderboardTabContainerFragment2.requireView());
        }
    });
    public final shb B;

    public LeaderboardTabContainerFragment() {
        ss5 ss5VarC = hv5.c(j26.u, new LeaderboardTabContainerFragment$special$$inlined$viewModels$default$2(new LeaderboardTabContainerFragment$special$$inlined$viewModels$default$1(this)));
        this.B = new shb(ll8.a(LeaderboardTabContainerViewModel.class), new LeaderboardTabContainerFragment$special$$inlined$viewModels$default$3(ss5VarC), new LeaderboardTabContainerFragment$special$$inlined$viewModels$default$5(this, ss5VarC), new LeaderboardTabContainerFragment$special$$inlined$viewModels$default$4(ss5VarC));
    }

    @Override // defpackage.hk0
    public final void i() {
        FragmentLeaderboardsTabContainerBinding fragmentLeaderboardsTabContainerBindingP = p();
        xgb.a(fragmentLeaderboardsTabContainerBindingP.h, new LeaderboardTabContainerFragment$initListeners$1$1(this, null));
        xgb.a(fragmentLeaderboardsTabContainerBindingP.b, new LeaderboardTabContainerFragment$initListeners$1$2(this, null));
        xgb.a(fragmentLeaderboardsTabContainerBindingP.c, new LeaderboardTabContainerFragment$initListeners$1$3(this, null));
        LeaderboardTabContainerViewModel leaderboardTabContainerViewModelQ = q();
        r54<String> textChangesFlow = p().j.getTextChangesFlow();
        textChangesFlow.getClass();
        yk2.o(new k74(textChangesFlow, new LeaderboardTabContainerViewModel$onSearchTextFlow$1(leaderboardTabContainerViewModelQ, null)), rhb.b(leaderboardTabContainerViewModelQ));
    }

    @Override // defpackage.hk0
    public final void j() {
        hy8 hy8VarE;
        whb parentFragment = getParentFragment();
        iy8 iy8Var = parentFragment instanceof iy8 ? (iy8) parentFragment : null;
        if (iy8Var == null || (hy8VarE = iy8Var.e()) == null) {
            return;
        }
        hy8VarE.b();
    }

    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        FragmentLeaderboardsTabContainerBinding fragmentLeaderboardsTabContainerBindingP = p();
        ViewPager2 viewPager2 = fragmentLeaderboardsTabContainerBindingP.g;
        if (viewPager2.getAdapter() == null) {
            viewPager2.setAdapter(new LeaderboardsTabAdapter(this));
        }
        new c(fragmentLeaderboardsTabContainerBindingP.f, viewPager2, new c.b() { // from class: o46
            @Override // com.google.android.material.tabs.c.b
            public final void a(TabLayout.g gVar, int i) {
                int i2;
                ho5<Object>[] ho5VarArr = LeaderboardTabContainerFragment.C;
                LeaderboardTabContainerFragment leaderboardTabContainerFragment = this.t;
                Context contextRequireContext = leaderboardTabContainerFragment.requireContext();
                contextRequireContext.getClass();
                Resources resources = leaderboardTabContainerFragment.getResources();
                if (i == 0) {
                    i2 = R.string.daily;
                } else {
                    if (i != 1) {
                        z90.a("Invalid leaderboard type");
                        return;
                    }
                    i2 = R.string.benchmark_workouts;
                }
                String string = resources.getString(i2);
                string.getClass();
                gVar.e = new nd2(contextRequireContext, string, i);
                gVar.a();
            }
        }).a();
        View view2 = getView();
        if (view2 != null) {
            ee5.a(new n46(), view2);
            g2b g2bVar = g2b.a;
        }
        LeaderboardTabContainerViewModel leaderboardTabContainerViewModelQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        leaderboardTabContainerViewModelQ.c(viewLifecycleOwner, new oh4() { // from class: p46
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                gm3 gm3Var = (gm3) obj;
                ho5<Object>[] ho5VarArr = LeaderboardTabContainerFragment.C;
                gm3Var.getClass();
                if (gm3Var instanceof LeaderboardTabContainerEvents.ShowFiltersDialog) {
                    LeaderboardFiltersFlowFragment.Companion.getClass();
                    LeaderboardFiltersFlowFragment leaderboardFiltersFlowFragment = new LeaderboardFiltersFlowFragment();
                    l childFragmentManager = this.t.getChildFragmentManager();
                    childFragmentManager.getClass();
                    leaderboardFiltersFlowFragment.s(childFragmentManager);
                }
                return g2b.a;
            }
        });
        q().B.e(getViewLifecycleOwner(), new LeaderboardTabContainerFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.list.header.presentation.LeaderboardTabContainerFragment$listenState$$inlined$observe$1
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                ho5<Object>[] ho5VarArr = LeaderboardTabContainerFragment.C;
                this.t.p().d.setVisibility(zBooleanValue ? 0 : 8);
                return g2b.a;
            }
        }));
        q().A.e(getViewLifecycleOwner(), new LeaderboardTabContainerFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.list.header.presentation.LeaderboardTabContainerFragment$listenState$$inlined$observe$2
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                ho5<Object>[] ho5VarArr = LeaderboardTabContainerFragment.C;
                FragmentLeaderboardsTabContainerBinding fragmentLeaderboardsTabContainerBindingP2 = this.t.p();
                SearchEditText searchEditText = fragmentLeaderboardsTabContainerBindingP2.j;
                if ((searchEditText.getVisibility() == 0) != zBooleanValue) {
                    fragmentLeaderboardsTabContainerBindingP2.h.setVisibility(!zBooleanValue ? 0 : 8);
                    fragmentLeaderboardsTabContainerBindingP2.e.setVisibility(!zBooleanValue ? 0 : 8);
                    searchEditText.setVisibility(zBooleanValue ? 0 : 8);
                    fragmentLeaderboardsTabContainerBindingP2.i.setVisibility(zBooleanValue ? 0 : 8);
                    fragmentLeaderboardsTabContainerBindingP2.k.setVisibility(zBooleanValue ? 8 : 0);
                    if (zBooleanValue) {
                        searchEditText.requestFocus();
                    } else {
                        searchEditText.t.c.setText((CharSequence) null);
                        searchEditText.clearFocus();
                    }
                }
                return g2b.a;
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FragmentLeaderboardsTabContainerBinding p() {
        T tC = this.A.a(this, C[0]);
        tC.getClass();
        return (FragmentLeaderboardsTabContainerBinding) tC;
    }

    public final LeaderboardTabContainerViewModel q() {
        return (LeaderboardTabContainerViewModel) this.B.getValue();
    }
}
