package com.hwpo_training_app.leaderboards.valuedetails.domain;

import com.hwpo_training_app.leaderboards.valuedetails.data.LeaderboardValueDetailsRepositoryImpl;
import com.hwpo_training_app.leaderboards.valuedetails.domain.entity.LeaderboardValueDetailsModel;
import defpackage.g5b;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class GetLeaderboardValueDetailsUseCase extends g5b<Integer, LeaderboardValueDetailsModel> {
    public final LeaderboardValueDetailsRepositoryImpl a;

    public GetLeaderboardValueDetailsUseCase(LeaderboardValueDetailsRepositoryImpl leaderboardValueDetailsRepositoryImpl) {
        this.a = leaderboardValueDetailsRepositoryImpl;
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) {
        return this.a.a(((Number) obj).intValue(), bVar);
    }
}
