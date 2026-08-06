package com.hwpo_training_app.leaderboards.filter.details.data;

import com.hwpo_training_app.leaderboards.filter.details.domain.LeaderboardDetailsFiltersStorage;
import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersModel;
import defpackage.a0a;
import defpackage.b0a;
import defpackage.g2b;
import defpackage.li8;
import defpackage.yk2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsFiltersStorageImpl implements LeaderboardDetailsFiltersStorage {
    public final a0a a;
    public final li8 b;

    public LeaderboardDetailsFiltersStorageImpl() {
        LeaderboardDetailsFiltersModel.Companion.getClass();
        a0a a0aVarB = b0a.b(LeaderboardDetailsFiltersModel.j);
        this.a = a0aVarB;
        this.b = yk2.b(a0aVarB);
    }

    @Override // com.hwpo_training_app.leaderboards.filter.details.domain.LeaderboardDetailsFiltersStorage
    public final li8 a() {
        return this.b;
    }

    @Override // com.hwpo_training_app.leaderboards.filter.details.domain.LeaderboardDetailsFiltersStorage
    public final g2b b(LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModel) {
        this.a.setValue(leaderboardDetailsFiltersModel);
        return g2b.a;
    }
}
