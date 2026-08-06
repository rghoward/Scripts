package com.hwpo_training_app.leaderboards.list.header.presentation;

import com.hwpo_training_app.leaderboards.filter.list.domain.ObserveLeaderboardFiltersFlowUseCase;
import com.hwpo_training_app.leaderboards.list.common.domain.ClearLeaderboardStorageUseCase;
import com.hwpo_training_app.leaderboards.list.header.domain.SearchLeaderboardsUseCase;
import defpackage.aa0;
import defpackage.bl0;
import defpackage.ci4;
import defpackage.cq2;
import defpackage.dl0;
import defpackage.dv8;
import defpackage.el0;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.hg;
import defpackage.k74;
import defpackage.oh7;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.q46;
import defpackage.r02;
import defpackage.rhb;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;
import defpackage.yk2;
import defpackage.yq6;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardTabContainerViewModel extends dl0<LeaderboardTabContainerViewState, Action> {
    public static final /* synthetic */ int C = 0;
    public final yq6 A;
    public final yq6 B;
    public final ClearLeaderboardStorageUseCase x;
    public final SearchLeaderboardsUseCase y;
    public final t72 z;

    /* JADX INFO: renamed from: com.hwpo_training_app.leaderboards.list.header.presentation.LeaderboardTabContainerViewModel$onCleared$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.leaderboards.list.header.presentation.LeaderboardTabContainerViewModel$onCleared$1", f = "LeaderboardTabContainerViewModel.kt", l = {48}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return LeaderboardTabContainerViewModel.this.new AnonymousClass1(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                ClearLeaderboardStorageUseCase clearLeaderboardStorageUseCase = LeaderboardTabContainerViewModel.this.x;
                g2b g2bVar = g2b.a;
                this.t = 1;
                clearLeaderboardStorageUseCase.getClass();
                Object objB = g5b.b(clearLeaderboardStorageUseCase, g2bVar, this);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardTabContainerViewModel(ClearLeaderboardStorageUseCase clearLeaderboardStorageUseCase, ObserveLeaderboardFiltersFlowUseCase observeLeaderboardFiltersFlowUseCase, SearchLeaderboardsUseCase searchLeaderboardsUseCase, t72 t72Var) {
        super(new LeaderboardTabContainerViewState(false, false));
        clearLeaderboardStorageUseCase.getClass();
        observeLeaderboardFiltersFlowUseCase.getClass();
        searchLeaderboardsUseCase.getClass();
        t72Var.getClass();
        this.x = clearLeaderboardStorageUseCase;
        this.y = searchLeaderboardsUseCase;
        this.z = t72Var;
        this.A = oh7.a(this.u, new q46(0));
        this.B = oh7.a(this.u, new hg(1));
        yk2.o(new k74(observeLeaderboardFiltersFlowUseCase.b(g2b.a), new LeaderboardTabContainerViewModel$observeLeaderboardFiltersState$1(this, null)), rhb.b(this));
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof Action.SearchBtnClick) {
            return LeaderboardTabContainerViewState.a(b(), true, false, 2);
        }
        if (bl0Var instanceof Action.CancelSearchBtnClick) {
            return LeaderboardTabContainerViewState.a(b(), false, false, 2);
        }
        return bl0Var instanceof Action.FiltersChanged ? LeaderboardTabContainerViewState.a(b(), false, ((Action.FiltersChanged) bl0Var).a, 1) : b();
    }

    @Override // defpackage.mhb
    public final void onCleared() {
        oy0.d(this.z, null, null, new AnonymousClass1(null), 3);
        super.onCleared();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class Action implements bl0 {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class CancelSearchBtnClick extends Action {
            public static final CancelSearchBtnClick a = new CancelSearchBtnClick();

            private CancelSearchBtnClick() {
                super(0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class FiltersChanged extends Action {
            public final boolean a;

            public FiltersChanged(boolean z) {
                super(0);
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FiltersChanged) && this.a == ((FiltersChanged) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return cq2.a("FiltersChanged(isBadgeVisible=", ")", this.a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class SearchBtnClick extends Action {
            public static final SearchBtnClick a = new SearchBtnClick();

            private SearchBtnClick() {
                super(0);
            }
        }

        public /* synthetic */ Action(int i) {
            this();
        }

        private Action() {
        }
    }
}
