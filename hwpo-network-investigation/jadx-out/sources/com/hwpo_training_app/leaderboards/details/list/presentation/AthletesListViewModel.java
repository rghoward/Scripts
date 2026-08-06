package com.hwpo_training_app.leaderboards.details.list.presentation;

import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.common.domain.entity.TopValueKind;
import com.hwpo_training_app.leaderboards.details.common.domain.SendLeaderboardDetailsActionUseCase;
import com.hwpo_training_app.leaderboards.details.list.domain.ChangeTopValueVisibilityUseCase;
import com.hwpo_training_app.leaderboards.details.list.domain.FetchLeaderboardTopValuesNextPageUseCase;
import com.hwpo_training_app.leaderboards.details.list.domain.FetchLeaderboardTopValuesUseCase;
import com.hwpo_training_app.leaderboards.details.list.domain.ObserveTopValuesFlowUseCase;
import com.hwpo_training_app.leaderboards.details.list.domain.UpdateLikeTopValueUseCase;
import com.hwpo_training_app.leaderboards.filter.details.domain.ObserveLeaderboardDetailsFiltersFlowUseCase;
import defpackage.b60;
import defpackage.bl0;
import defpackage.bu8;
import defpackage.c60;
import defpackage.cm3;
import defpackage.d60;
import defpackage.df7;
import defpackage.dl0;
import defpackage.dz9;
import defpackage.ec6;
import defpackage.el0;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.k74;
import defpackage.ml;
import defpackage.oh7;
import defpackage.oy0;
import defpackage.q09;
import defpackage.rhb;
import defpackage.rma;
import defpackage.vz7;
import defpackage.xj5;
import defpackage.yk2;
import defpackage.yq6;
import defpackage.z90;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AthletesListViewModel extends dl0<AthletesListViewState, Action> {
    public static final Companion Companion = new Companion(0);
    public final UpdateLikeTopValueUseCase A;
    public final ChangeTopValueVisibilityUseCase B;
    public final bu8 C;
    public final cm3 D;
    public final int E;
    public final TopValueKind F;
    public final yq6 G;
    public final yq6 H;
    public final yq6 I;
    public final SendLeaderboardDetailsActionUseCase x;
    public final FetchLeaderboardTopValuesUseCase y;
    public final FetchLeaderboardTopValuesNextPageUseCase z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AthletesListViewModel(SendLeaderboardDetailsActionUseCase sendLeaderboardDetailsActionUseCase, FetchLeaderboardTopValuesUseCase fetchLeaderboardTopValuesUseCase, ObserveLeaderboardDetailsFiltersFlowUseCase observeLeaderboardDetailsFiltersFlowUseCase, FetchLeaderboardTopValuesNextPageUseCase fetchLeaderboardTopValuesNextPageUseCase, ObserveTopValuesFlowUseCase observeTopValuesFlowUseCase, UpdateLikeTopValueUseCase updateLikeTopValueUseCase, ChangeTopValueVisibilityUseCase changeTopValueVisibilityUseCase, df7 df7Var, bu8 bu8Var, cm3 cm3Var, q09 q09Var) {
        super(AthletesListViewState.e);
        sendLeaderboardDetailsActionUseCase.getClass();
        fetchLeaderboardTopValuesUseCase.getClass();
        observeLeaderboardDetailsFiltersFlowUseCase.getClass();
        fetchLeaderboardTopValuesNextPageUseCase.getClass();
        observeTopValuesFlowUseCase.getClass();
        updateLikeTopValueUseCase.getClass();
        changeTopValueVisibilityUseCase.getClass();
        df7Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        q09Var.getClass();
        AthletesListViewState.Companion.getClass();
        this.x = sendLeaderboardDetailsActionUseCase;
        this.y = fetchLeaderboardTopValuesUseCase;
        this.z = fetchLeaderboardTopValuesNextPageUseCase;
        this.A = updateLikeTopValueUseCase;
        this.B = changeTopValueVisibilityUseCase;
        this.C = bu8Var;
        this.D = cm3Var;
        Object objA = q09Var.a("leaderboard_id");
        if (objA == null) {
            z90.a("Required value was null.");
            throw null;
        }
        this.E = ((Number) objA).intValue();
        TopValueKind[] topValueKindArrValues = TopValueKind.values();
        Object objA2 = q09Var.a("top_value_kind");
        if (objA2 == null) {
            z90.a("Required value was null.");
            throw null;
        }
        TopValueKind topValueKind = topValueKindArrValues[((Number) objA2).intValue()];
        this.F = topValueKind;
        i(ec6.t);
        yk2.o(new k74(observeTopValuesFlowUseCase.b(new ObserveTopValuesFlowUseCase.Params(topValueKind)), new AthletesListViewModel$observeTopValues$1(this, null)), rhb.b(this));
        g2b g2bVar = g2b.a;
        yk2.o(new k74(df7Var.b(g2bVar), new AthletesListViewModel$observePerformanceUpdates$1(this, null)), rhb.b(this));
        yk2.o(new k74(yk2.j(observeLeaderboardDetailsFiltersFlowUseCase.b(g2bVar), 1), new AthletesListViewModel$observeLeaderboardDetailsFiltersState$1(this, null)), rhb.b(this));
        this.G = oh7.a(this.u, new b60(0));
        this.H = oh7.a(this.u, new c60(0));
        this.I = oh7.a(this.u, new d60(0));
    }

    public static final void g(AthletesListViewModel athletesListViewModel, Exception exc) {
        athletesListViewModel.getClass();
        athletesListViewModel.e(Action.FinishLoading.a);
        athletesListViewModel.f(new AthletesListEvents.ShowError(athletesListViewModel.D.a(exc)));
        rma.a.b(exc);
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof Action.StartLoading) {
            return AthletesListViewState.a(b(), null, true, false, null, 13);
        }
        if (bl0Var instanceof Action.FinishLoading) {
            return AthletesListViewState.a(b(), null, false, false, null, 9);
        }
        if (bl0Var instanceof Action.StartPaginationLoading) {
            return AthletesListViewState.a(b(), null, false, true, null, 11);
        }
        if (bl0Var instanceof Action.AthletesListLoaded) {
            return AthletesListViewState.a(b(), ((Action.AthletesListLoaded) bl0Var).a, false, false, new vz7(0, false, false, null, null, null, 127), 6);
        }
        boolean z = bl0Var instanceof Action.ShowErrorPlaceHolder;
        bu8 bu8Var = this.C;
        hf3 hf3Var = hf3.t;
        if (z) {
            b();
            return new AthletesListViewState(new vz7(2, true, true, bu8Var.b(R.string.something_went_wrong, new Object[0]), bu8Var.b(R.string.no_internet_description, new Object[0]), bu8Var.b(R.string.reload, new Object[0]), 64), hf3Var, false, false);
        }
        if (bl0Var instanceof Action.ShowAddYourScorePlaceHolder) {
            return AthletesListViewState.a(b(), hf3Var, false, false, new vz7(1, true, true, bu8Var.b(R.string.be_number_one_title, new Object[0]), bu8Var.b(R.string.be_number_one_description, new Object[0]), bu8Var.b(R.string.add_your_score, new Object[0]), 64), 6);
        }
        return bl0Var instanceof Action.ShowNoResultsPlaceHolder ? AthletesListViewState.a(b(), hf3Var, false, false, new vz7(2, true, false, bu8Var.b(R.string.no_results_title, new Object[0]), bu8Var.b(R.string.no_results_description, new Object[0]), null, 96), 6) : b();
    }

    public final dz9 i(ec6 ec6Var) {
        return oy0.d(rhb.b(this), null, null, new AthletesListViewModel$fetchLeaderboardTopValues$1(ec6Var, this, null), 3);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class Action implements bl0 {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class AthletesListLoaded extends Action {
            public final ArrayList a;

            public AthletesListLoaded(ArrayList arrayList) {
                super(0);
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AthletesListLoaded) && xj5.a(this.a, ((AthletesListLoaded) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ml.a("AthletesListLoaded(items=", this.a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class FinishLoading extends Action {
            public static final FinishLoading a = new FinishLoading();

            private FinishLoading() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ShowAddYourScorePlaceHolder extends Action {
            public static final ShowAddYourScorePlaceHolder a = new ShowAddYourScorePlaceHolder();

            private ShowAddYourScorePlaceHolder() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ShowErrorPlaceHolder extends Action {
            public static final ShowErrorPlaceHolder a = new ShowErrorPlaceHolder();

            private ShowErrorPlaceHolder() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ShowNoResultsPlaceHolder extends Action {
            public static final ShowNoResultsPlaceHolder a = new ShowNoResultsPlaceHolder();

            private ShowNoResultsPlaceHolder() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class StartLoading extends Action {
            public static final StartLoading a = new StartLoading();

            private StartLoading() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class StartPaginationLoading extends Action {
            public static final StartPaginationLoading a = new StartPaginationLoading();

            private StartPaginationLoading() {
                super(0);
            }
        }

        public /* synthetic */ Action(int i) {
            this();
        }

        private Action() {
        }
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
