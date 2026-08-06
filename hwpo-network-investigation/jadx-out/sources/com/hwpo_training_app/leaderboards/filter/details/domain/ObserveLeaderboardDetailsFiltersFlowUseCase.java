package com.hwpo_training_app.leaderboards.filter.details.domain;

import com.hwpo_training_app.leaderboards.filter.details.data.LeaderboardDetailsFiltersRepositoryImpl;
import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersModel;
import defpackage.f84;
import defpackage.g2b;
import defpackage.r54;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ObserveLeaderboardDetailsFiltersFlowUseCase extends f84<g2b, LeaderboardDetailsFiltersModel> {
    public final LeaderboardDetailsFiltersRepositoryImpl a;

    public ObserveLeaderboardDetailsFiltersFlowUseCase(LeaderboardDetailsFiltersRepositoryImpl leaderboardDetailsFiltersRepositoryImpl) {
        this.a = leaderboardDetailsFiltersRepositoryImpl;
    }

    @Override // defpackage.f84
    public final r54<LeaderboardDetailsFiltersModel> a(g2b g2bVar) {
        g2bVar.getClass();
        return this.a.b;
    }
}
