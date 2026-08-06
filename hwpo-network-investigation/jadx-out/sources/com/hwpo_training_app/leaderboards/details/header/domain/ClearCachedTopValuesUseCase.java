package com.hwpo_training_app.leaderboards.details.header.domain;

import com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl;
import defpackage.g2b;
import defpackage.g5b;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ClearCachedTopValuesUseCase extends g5b<g2b, g2b> {
    public final LeaderboardDetailsListRepositoryImpl a;

    public ClearCachedTopValuesUseCase(LeaderboardDetailsListRepositoryImpl leaderboardDetailsListRepositoryImpl) {
        this.a = leaderboardDetailsListRepositoryImpl;
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) {
        this.a.c.clear();
        return g2b.a;
    }
}
