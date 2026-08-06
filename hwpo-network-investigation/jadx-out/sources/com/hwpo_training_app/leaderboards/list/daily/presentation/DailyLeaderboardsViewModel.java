package com.hwpo_training_app.leaderboards.list.daily.presentation;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardType;
import com.hwpo_training_app.leaderboards.filter.list.domain.ObserveLeaderboardFiltersFlowUseCase;
import com.hwpo_training_app.leaderboards.list.common.domain.FetchLeaderboardsNextPageUseCase;
import com.hwpo_training_app.leaderboards.list.common.domain.FetchLeaderboardsUseCase;
import com.hwpo_training_app.leaderboards.list.common.domain.ObserveLeaderboardsFlowUseCase;
import com.hwpo_training_app.leaderboards.list.common.presentation.BaseLeaderboardsListViewModel;
import defpackage.a46;
import defpackage.bu8;
import defpackage.cm3;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DailyLeaderboardsViewModel extends BaseLeaderboardsListViewModel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyLeaderboardsViewModel(a46 a46Var, FetchLeaderboardsUseCase fetchLeaderboardsUseCase, ObserveLeaderboardsFlowUseCase observeLeaderboardsFlowUseCase, ObserveLeaderboardFiltersFlowUseCase observeLeaderboardFiltersFlowUseCase, FetchLeaderboardsNextPageUseCase fetchLeaderboardsNextPageUseCase, bu8 bu8Var, cm3 cm3Var) {
        super(a46Var, LeaderboardType.t, fetchLeaderboardsUseCase, observeLeaderboardsFlowUseCase, observeLeaderboardFiltersFlowUseCase, fetchLeaderboardsNextPageUseCase, bu8Var, cm3Var);
        a46Var.getClass();
        fetchLeaderboardsUseCase.getClass();
        observeLeaderboardsFlowUseCase.getClass();
        observeLeaderboardFiltersFlowUseCase.getClass();
        fetchLeaderboardsNextPageUseCase.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
    }
}
