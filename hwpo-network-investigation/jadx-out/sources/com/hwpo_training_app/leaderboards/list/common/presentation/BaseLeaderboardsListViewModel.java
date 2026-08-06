package com.hwpo_training_app.leaderboards.list.common.presentation;

import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardType;
import com.hwpo_training_app.leaderboards.filter.list.domain.ObserveLeaderboardFiltersFlowUseCase;
import com.hwpo_training_app.leaderboards.list.common.domain.FetchLeaderboardsNextPageUseCase;
import com.hwpo_training_app.leaderboards.list.common.domain.FetchLeaderboardsUseCase;
import com.hwpo_training_app.leaderboards.list.common.domain.ObserveLeaderboardsFlowUseCase;
import com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity;
import com.hwpo_training_app.leaderboards.list.common.presentation.entity.TopValueUiEntity;
import defpackage.a46;
import defpackage.bl0;
import defpackage.bu8;
import defpackage.cm3;
import defpackage.dl0;
import defpackage.dz9;
import defpackage.ec6;
import defpackage.el0;
import defpackage.g2b;
import defpackage.hf3;
import defpackage.js7;
import defpackage.k74;
import defpackage.mk0;
import defpackage.ml;
import defpackage.oh7;
import defpackage.oy0;
import defpackage.rhb;
import defpackage.se;
import defpackage.te;
import defpackage.u;
import defpackage.vz7;
import defpackage.xj5;
import defpackage.yk2;
import defpackage.yq6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseLeaderboardsListViewModel extends dl0<BaseLeaderboardsListViewState, Action> {
    public static final Companion Companion = new Companion(0);
    public final FetchLeaderboardsNextPageUseCase A;
    public final bu8 B;
    public final cm3 C;
    public final yq6 D;
    public final yq6 E;
    public final yq6 F;
    public final a46 x;
    public final LeaderboardType y;
    public final FetchLeaderboardsUseCase z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LeaderboardType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLeaderboardsListViewModel(a46 a46Var, LeaderboardType leaderboardType, FetchLeaderboardsUseCase fetchLeaderboardsUseCase, ObserveLeaderboardsFlowUseCase observeLeaderboardsFlowUseCase, ObserveLeaderboardFiltersFlowUseCase observeLeaderboardFiltersFlowUseCase, FetchLeaderboardsNextPageUseCase fetchLeaderboardsNextPageUseCase, bu8 bu8Var, cm3 cm3Var) {
        super(BaseLeaderboardsListViewState.e);
        a46Var.getClass();
        leaderboardType.getClass();
        fetchLeaderboardsUseCase.getClass();
        observeLeaderboardsFlowUseCase.getClass();
        observeLeaderboardFiltersFlowUseCase.getClass();
        fetchLeaderboardsNextPageUseCase.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        BaseLeaderboardsListViewState.Companion.getClass();
        this.x = a46Var;
        this.y = leaderboardType;
        this.z = fetchLeaderboardsUseCase;
        this.A = fetchLeaderboardsNextPageUseCase;
        this.B = bu8Var;
        this.C = cm3Var;
        this.D = oh7.a(this.u, new se(1));
        this.E = oh7.a(this.u, new te(1));
        this.F = oh7.a(this.u, new mk0(0));
        g(ec6.t);
        yk2.o(new k74(observeLeaderboardsFlowUseCase.b(leaderboardType), new BaseLeaderboardsListViewModel$observeLeaderboards$1(this, null)), rhb.b(this));
        yk2.o(new k74(yk2.j(observeLeaderboardFiltersFlowUseCase.b(g2b.a), 1), new BaseLeaderboardsListViewModel$observeLeaderboardFiltersState$1(this, null)), rhb.b(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        js7 js7Var;
        bl0Var.getClass();
        if (bl0Var.equals(Action.StartLoading.a)) {
            return BaseLeaderboardsListViewState.a(b(), null, null, true, false, 11);
        }
        if (bl0Var.equals(Action.FinishLoading.a)) {
            return BaseLeaderboardsListViewState.a(b(), null, null, false, false, 3);
        }
        if (bl0Var.equals(Action.StartPaginationLoading.a)) {
            return BaseLeaderboardsListViewState.a(b(), null, null, false, true, 7);
        }
        boolean zEquals = bl0Var.equals(Action.ShowErrorPlaceHolder.a);
        bu8 bu8Var = this.B;
        if (zEquals) {
            return BaseLeaderboardsListViewState.a(b(), null, new vz7(0, true, true, bu8Var.b(R.string.something_went_wrong, new Object[0]), bu8Var.b(R.string.no_internet_description, new Object[0]), bu8Var.b(R.string.reload, new Object[0]), 65), false, false, 13);
        }
        if (!bl0Var.equals(Action.ShowEmptyResultsPlaceHolder.a)) {
            return bl0Var instanceof Action.LeaderboardsLoaded ? BaseLeaderboardsListViewState.a(b(), ((Action.LeaderboardsLoaded) bl0Var).a, new vz7(0, false, false, null, null, null, 127), false, false, 12) : b();
        }
        BaseLeaderboardsListViewState baseLeaderboardsListViewStateB = b();
        int iOrdinal = this.y.ordinal();
        if (iOrdinal == 0) {
            js7Var = new js7(bu8Var.b(R.string.empty_daily_leaderboards_title, new Object[0]), bu8Var.b(R.string.empty_daily_leaderboards_description, new Object[0]));
        } else {
            if (iOrdinal != 1) {
                u.b();
                return null;
            }
            js7Var = new js7(bu8Var.b(R.string.empty_challenge_leaderboards_title, new Object[0]), bu8Var.b(R.string.empty_challenge_leaderboards_description, new Object[0]));
        }
        return BaseLeaderboardsListViewState.a(baseLeaderboardsListViewStateB, hf3.t, new vz7(0, true, false, (String) js7Var.t, (String) js7Var.u, null, 97), false, false, 12);
    }

    public final dz9 g(ec6 ec6Var) {
        return oy0.d(rhb.b(this), null, null, new BaseLeaderboardsListViewModel$fetchLeaderboardsList$1(ec6Var, this, null), 3);
    }

    public final LeaderboardItemUiEntity i(TopValueUiEntity topValueUiEntity) {
        Object next;
        Iterator<T> it = b().a.iterator();
        while (it.hasNext()) {
            next = it.next();
            List<TopValueUiEntity> listE = ((LeaderboardItemUiEntity) next).e();
            if (listE == null || !listE.isEmpty()) {
                Iterator<T> it2 = listE.iterator();
                while (it2.hasNext()) {
                    if (((TopValueUiEntity) it2.next()).a == topValueUiEntity.a) {
                        return (LeaderboardItemUiEntity) next;
                    }
                }
            }
        }
        next = null;
        return (LeaderboardItemUiEntity) next;
    }

    public final void j(LeaderboardItemUiEntity leaderboardItemUiEntity) {
        int iC = leaderboardItemUiEntity.c();
        this.x.o(leaderboardItemUiEntity.b(), leaderboardItemUiEntity.a(), leaderboardItemUiEntity.d(), iC);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class Action implements bl0 {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class FinishLoading extends Action {
            public static final FinishLoading a = new FinishLoading();

            private FinishLoading() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class LeaderboardsLoaded extends Action {
            public final ArrayList a;

            public LeaderboardsLoaded(ArrayList arrayList) {
                super(0);
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LeaderboardsLoaded) && xj5.a(this.a, ((LeaderboardsLoaded) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ml.a("LeaderboardsLoaded(items=", this.a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class ShowEmptyResultsPlaceHolder extends Action {
            public static final ShowEmptyResultsPlaceHolder a = new ShowEmptyResultsPlaceHolder();

            private ShowEmptyResultsPlaceHolder() {
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
