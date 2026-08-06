package com.hwpo_training_app.leaderboards.details.common.domain;

import com.hwpo_training_app.leaderboards.details.common.data.LeaderboardDetailsActionsRepositoryImpl;
import com.hwpo_training_app.leaderboards.details.common.domain.actions.LeaderboardDetailsAction;
import defpackage.f84;
import defpackage.g2b;
import defpackage.r54;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsActionsFlowUseCase extends f84<g2b, LeaderboardDetailsAction> {
    public final LeaderboardDetailsActionsRepositoryImpl a;

    public LeaderboardDetailsActionsFlowUseCase(LeaderboardDetailsActionsRepositoryImpl leaderboardDetailsActionsRepositoryImpl) {
        this.a = leaderboardDetailsActionsRepositoryImpl;
    }

    @Override // defpackage.f84
    public final r54<LeaderboardDetailsAction> a(g2b g2bVar) {
        g2bVar.getClass();
        return this.a.b;
    }
}
