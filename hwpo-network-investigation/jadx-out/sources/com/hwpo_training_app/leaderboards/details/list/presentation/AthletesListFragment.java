package com.hwpo_training_app.leaderboards.details.list.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.l;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;
import com.hwpo_training_app.leaderboards.common.domain.entity.TopValueKind;
import com.hwpo_training_app.leaderboards.common.presentation.dialog.athlete_results.ResultsDialogFragment;
import com.hwpo_training_app.leaderboards.databinding.FragmentAthletesListBinding;
import com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListEvents;
import com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListFragment;
import com.hwpo_training_app.leaderboards.details.list.presentation.adapter.LeaderboardDetailsAthletesAdapter;
import com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.AthleteItemDecorator;
import com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.stickyfooter.StickyHeaderHandler;
import com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.stickyfooter.StickyLinearLayoutManager;
import com.hwpo_training_app.leaderboards.details.list.presentation.entity.AthleteResultUiEntity;
import defpackage.ec6;
import defpackage.g2b;
import defpackage.ho5;
import defpackage.hv5;
import defpackage.j26;
import defpackage.js7;
import defpackage.ll8;
import defpackage.m76;
import defpackage.mh4;
import defpackage.ne8;
import defpackage.o7a;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.rhb;
import defpackage.shb;
import defpackage.ss5;
import defpackage.uy0;
import defpackage.vg4;
import defpackage.vz7;
import defpackage.z50;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AthletesListFragment extends Hilt_AthletesListFragment {
    public final vg4 A = new vg4(new oh4<AthletesListFragment, FragmentAthletesListBinding>() { // from class: com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListFragment$special$$inlined$viewBindingFragment$default$1
        @Override // defpackage.oh4
        public final FragmentAthletesListBinding invoke(AthletesListFragment athletesListFragment) {
            AthletesListFragment athletesListFragment2 = athletesListFragment;
            athletesListFragment2.getClass();
            return FragmentAthletesListBinding.bind(athletesListFragment2.requireView());
        }
    });
    public final shb B;
    public final o7a C;
    public static final /* synthetic */ ho5<Object>[] D = {new ne8(AthletesListFragment.class, "binding", "getBinding()Lcom/hwpo_training_app/leaderboards/databinding/FragmentAthletesListBinding;", 0)};
    public static final Companion Companion = new Companion(0);

    public AthletesListFragment() {
        ss5 ss5VarC = hv5.c(j26.u, new AthletesListFragment$special$$inlined$viewModels$default$2(new AthletesListFragment$special$$inlined$viewModels$default$1(this)));
        this.B = new shb(ll8.a(AthletesListViewModel.class), new AthletesListFragment$special$$inlined$viewModels$default$3(ss5VarC), new AthletesListFragment$special$$inlined$viewModels$default$5(this, ss5VarC), new AthletesListFragment$special$$inlined$viewModels$default$4(ss5VarC));
        this.C = new o7a(new mh4() { // from class: com.hwpo_training_app.leaderboards.details.list.presentation.a
            /* JADX WARN: Type inference failed for: r4v4, types: [com.hwpo_training_app.leaderboards.details.list.presentation.c] */
            @Override // defpackage.mh4
            public final Object invoke() {
                AthletesListFragment.Companion companion = AthletesListFragment.Companion;
                final AthletesListFragment athletesListFragment = this.t;
                AthletesListFragment$athletesAdapter$2$1 athletesListFragment$athletesAdapter$2$1 = new AthletesListFragment$athletesAdapter$2$1(1, athletesListFragment.q(), AthletesListViewModel.class, "onScoreClicked", "onScoreClicked(Lcom/hwpo_training_app/leaderboards/details/list/presentation/entity/AthleteResultUiEntity;)V", 0);
                AthletesListFragment$athletesAdapter$2$2 athletesListFragment$athletesAdapter$2$2 = new AthletesListFragment$athletesAdapter$2$2(1, athletesListFragment.q(), AthletesListViewModel.class, "onLikeClicked", "onLikeClicked(Lcom/hwpo_training_app/leaderboards/details/list/presentation/entity/AthleteResultUiEntity;)V", 0);
                AthletesListFragment$athletesAdapter$2$3 athletesListFragment$athletesAdapter$2$3 = new AthletesListFragment$athletesAdapter$2$3(1, athletesListFragment.q(), AthletesListViewModel.class, "onItemClicked", "onItemClicked(Lcom/hwpo_training_app/leaderboards/details/list/presentation/entity/AthleteResultUiEntity;)V", 0);
                AthletesListFragment$athletesAdapter$2$4 athletesListFragment$athletesAdapter$2$4 = new AthletesListFragment$athletesAdapter$2$4(1, athletesListFragment.q(), AthletesListViewModel.class, "onItemShown", "onItemShown(I)V", 0);
                return new LeaderboardDetailsAthletesAdapter(athletesListFragment$athletesAdapter$2$1, athletesListFragment$athletesAdapter$2$2, new oh4() { // from class: com.hwpo_training_app.leaderboards.details.list.presentation.c
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        AthletesListFragment.Companion companion2 = AthletesListFragment.Companion;
                        ((AthleteResultUiEntity) obj).getClass();
                        AthletesListViewModel athletesListViewModelQ = athletesListFragment.q();
                        oy0.d(rhb.b(athletesListViewModelQ), null, null, new AthletesListViewModel$openEditPerformanceScreen$1(athletesListViewModelQ, null), 3);
                        return g2b.a;
                    }
                }, athletesListFragment$athletesAdapter$2$3, new AthletesListFragment$athletesAdapter$2$5(1, athletesListFragment.q(), AthletesListViewModel.class, "onEyeClicked", "onEyeClicked(Lcom/hwpo_training_app/leaderboards/details/list/presentation/entity/AthleteResultUiEntity$OtherAthleteResultUiEntity;)V", 0), athletesListFragment$athletesAdapter$2$4);
            }
        });
    }

    @Override // defpackage.hk0
    public final void i() {
        p().b.setOnRefreshListener(new z50(q()));
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListFragment$initAthletesRecycleView$1$1] */
    @Override // defpackage.hk0, androidx.fragment.app.f
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        p().b.setColorSchemeResources(R.color.colorPrimary);
        FragmentAthletesListBinding fragmentAthletesListBindingP = p();
        final Context contextRequireContext = requireContext();
        o7a o7aVar = this.C;
        final LeaderboardDetailsAthletesAdapter leaderboardDetailsAthletesAdapter = (LeaderboardDetailsAthletesAdapter) o7aVar.getValue();
        StickyLinearLayoutManager stickyLinearLayoutManager = new StickyLinearLayoutManager(contextRequireContext, leaderboardDetailsAthletesAdapter) { // from class: com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListFragment$initAthletesRecycleView$1$stickyLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public final void H0(RecyclerView recyclerView, int i) {
                AthletesListFragment$initAthletesRecycleView$1$stickyLayoutManager$1$smoothScrollToPosition$smoothScroller$1 athletesListFragment$initAthletesRecycleView$1$stickyLayoutManager$1$smoothScrollToPosition$smoothScroller$1 = new AthletesListFragment$initAthletesRecycleView$1$stickyLayoutManager$1$smoothScrollToPosition$smoothScroller$1(this.K.requireContext());
                athletesListFragment$initAthletesRecycleView$1$stickyLayoutManager$1$smoothScrollToPosition$smoothScroller$1.a = i;
                I0(athletesListFragment$initAthletesRecycleView$1$stickyLayoutManager$1$smoothScrollToPosition$smoothScroller$1);
            }
        };
        stickyLinearLayoutManager.m1(1);
        stickyLinearLayoutManager.I = 5;
        StickyHeaderHandler stickyHeaderHandler = stickyLinearLayoutManager.G;
        if (stickyHeaderHandler != null) {
            stickyHeaderHandler.k = 5;
        }
        ?? r6 = new StickyLinearLayoutManager.StickyHeaderListener() { // from class: com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListFragment$initAthletesRecycleView$1$1
        };
        stickyLinearLayoutManager.J = r6;
        StickyHeaderHandler stickyHeaderHandler2 = stickyLinearLayoutManager.G;
        if (stickyHeaderHandler2 != null) {
            stickyHeaderHandler2.l = r6;
        }
        int dimension = (int) getResources().getDimension(R.dimen.default_margin);
        int dimension2 = (int) getResources().getDimension(R.dimen.default_margin_small);
        RecyclerView recyclerView = fragmentAthletesListBindingP.c;
        recyclerView.setLayoutManager(stickyLinearLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter((LeaderboardDetailsAthletesAdapter) o7aVar.getValue());
        recyclerView.h(new AthleteItemDecorator(dimension, dimension2));
        AthletesListViewModel athletesListViewModelQ = q();
        m76 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        athletesListViewModelQ.c(viewLifecycleOwner, new oh4() { // from class: y50
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                gm3 gm3Var = (gm3) obj;
                AthletesListFragment.Companion companion = AthletesListFragment.Companion;
                gm3Var.getClass();
                boolean z = gm3Var instanceof AthletesListEvents.StopRefreshing;
                AthletesListFragment athletesListFragment = this.t;
                if (z) {
                    athletesListFragment.p().b.setRefreshing(false);
                } else if (gm3Var instanceof AthletesListEvents.ShowResultsDialog) {
                    AthletesListEvents.ShowResultsDialog showResultsDialog = (AthletesListEvents.ShowResultsDialog) gm3Var;
                    ResultsDialogFragment.Params params = new ResultsDialogFragment.Params(showResultsDialog.b, showResultsDialog.c);
                    ResultsDialogFragment.Companion.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("ARG_PARAMS", params);
                    ResultsDialogFragment resultsDialogFragment = new ResultsDialogFragment();
                    resultsDialogFragment.setArguments(bundle2);
                    l childFragmentManager = athletesListFragment.getChildFragmentManager();
                    childFragmentManager.getClass();
                    resultsDialogFragment.o(childFragmentManager, ResultsDialogFragment.class.getName());
                } else if (gm3Var instanceof AthletesListEvents.ShowError) {
                    athletesListFragment.m(((AthletesListEvents.ShowError) gm3Var).b);
                } else if (gm3Var instanceof AthletesListEvents.ShowMessage) {
                    athletesListFragment.n(((AthletesListEvents.ShowMessage) gm3Var).b);
                }
                return g2b.a;
            }
        });
        q().G.e(getViewLifecycleOwner(), new AthletesListFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<Boolean, g2b>() { // from class: com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListFragment$onViewCreated$$inlined$observe$1
            @Override // defpackage.oh4
            public final g2b invoke(Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                AthletesListFragment.Companion companion = AthletesListFragment.Companion;
                this.t.p().e.setVisible(zBooleanValue);
                return g2b.a;
            }
        }));
        q().I.e(getViewLifecycleOwner(), new AthletesListFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<vz7, g2b>() { // from class: com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListFragment$onViewCreated$$inlined$observe$2
            @Override // defpackage.oh4
            public final g2b invoke(vz7 vz7Var) {
                vz7 vz7Var2 = vz7Var;
                AthletesListFragment.Companion companion = AthletesListFragment.Companion;
                final AthletesListFragment athletesListFragment = this.t;
                final FragmentAthletesListBinding fragmentAthletesListBindingP2 = athletesListFragment.p();
                boolean z = vz7Var2.b;
                PlaceHolder placeHolder = fragmentAthletesListBindingP2.d;
                if (z) {
                    placeHolder.setPlaceholderId(vz7Var2.a);
                    placeHolder.setTitle(vz7Var2.d);
                    placeHolder.q(vz7Var2.e);
                    placeHolder.p(vz7Var2.f, vz7Var2.c);
                    placeHolder.i(new mh4() { // from class: com.hwpo_training_app.leaderboards.details.list.presentation.b
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            AthletesListFragment.Companion companion2 = AthletesListFragment.Companion;
                            AthletesListViewModel athletesListViewModelQ2 = athletesListFragment.q();
                            int placeholderId = fragmentAthletesListBindingP2.d.getPlaceholderId();
                            if (placeholderId == 1) {
                                oy0.d(rhb.b(athletesListViewModelQ2), null, null, new AthletesListViewModel$openEditPerformanceScreen$1(athletesListViewModelQ2, null), 3);
                            } else if (placeholderId != 2) {
                                g2b g2bVar = g2b.a;
                            } else {
                                athletesListViewModelQ2.i(ec6.u);
                            }
                            return g2b.a;
                        }
                    });
                    PlaceHolder.r(placeHolder);
                } else {
                    PlaceHolder.h(placeHolder);
                }
                return g2b.a;
            }
        }));
        q().H.e(getViewLifecycleOwner(), new AthletesListFragment$inlined$sam$i$androidx_lifecycle_Observer$0(new oh4<List<? extends AthleteResultUiEntity>, g2b>() { // from class: com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListFragment$onViewCreated$$inlined$observe$3
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // defpackage.oh4
            public final g2b invoke(List<? extends AthleteResultUiEntity> list) {
                AthletesListFragment.Companion companion = AthletesListFragment.Companion;
                ((LeaderboardDetailsAthletesAdapter) this.t.C.getValue()).d.b((List<T>) list);
                return g2b.a;
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FragmentAthletesListBinding p() {
        T tA = this.A.a(this, D[0]);
        tA.getClass();
        return (FragmentAthletesListBinding) tA;
    }

    public final AthletesListViewModel q() {
        return (AthletesListViewModel) this.B.getValue();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static AthletesListFragment a(int i, TopValueKind topValueKind) {
            AthletesListFragment athletesListFragment = new AthletesListFragment();
            athletesListFragment.setArguments(uy0.c(new js7("leaderboard_id", Integer.valueOf(i)), new js7("top_value_kind", Integer.valueOf(topValueKind.ordinal()))));
            return athletesListFragment;
        }

        private Companion() {
        }
    }
}
