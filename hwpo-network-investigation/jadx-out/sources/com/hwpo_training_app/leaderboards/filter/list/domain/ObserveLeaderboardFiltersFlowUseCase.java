package com.hwpo_training_app.leaderboards.filter.list.domain;

import com.hwpo_training_app.leaderboards.filter.list.data.LeaderboardFiltersRepositoryImpl;
import com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel;
import defpackage.f84;
import defpackage.g2b;
import defpackage.r54;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ObserveLeaderboardFiltersFlowUseCase extends f84<g2b, LeaderboardFiltersModel> {
    public final LeaderboardFiltersRepositoryImpl a;

    public ObserveLeaderboardFiltersFlowUseCase(LeaderboardFiltersRepositoryImpl leaderboardFiltersRepositoryImpl) {
        this.a = leaderboardFiltersRepositoryImpl;
    }

    @Override // defpackage.f84
    public final r54<LeaderboardFiltersModel> a(g2b g2bVar) {
        g2bVar.getClass();
        return this.a.b;
    }
}
