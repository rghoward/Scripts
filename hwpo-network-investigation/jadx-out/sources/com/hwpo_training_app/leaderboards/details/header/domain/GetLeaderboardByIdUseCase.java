package com.hwpo_training_app.leaderboards.details.header.domain;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardModel;
import com.hwpo_training_app.leaderboards.details.header.data.LeaderboardDetailsHeaderRepositoryImpl;
import defpackage.g5b;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class GetLeaderboardByIdUseCase extends g5b<Integer, LeaderboardModel> {
    public final LeaderboardDetailsHeaderRepositoryImpl a;

    public GetLeaderboardByIdUseCase(LeaderboardDetailsHeaderRepositoryImpl leaderboardDetailsHeaderRepositoryImpl) {
        this.a = leaderboardDetailsHeaderRepositoryImpl;
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) {
        return this.a.a(((Number) obj).intValue(), bVar);
    }
}
