package com.hwpo_training_app.leaderboards.filter.list.data;

import com.hwpo_training_app.leaderboards.filter.list.domain.LeaderboardFiltersStorage;
import com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel;
import defpackage.a0a;
import defpackage.b0a;
import defpackage.g2b;
import defpackage.li8;
import defpackage.yk2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardFiltersStorageImpl implements LeaderboardFiltersStorage {
    public final a0a a;
    public final li8 b;

    public LeaderboardFiltersStorageImpl() {
        LeaderboardFiltersModel.Companion.getClass();
        a0a a0aVarB = b0a.b(LeaderboardFiltersModel.k);
        this.a = a0aVarB;
        this.b = yk2.b(a0aVarB);
    }

    @Override // com.hwpo_training_app.leaderboards.filter.list.domain.LeaderboardFiltersStorage
    public final li8 a() {
        return this.b;
    }

    @Override // com.hwpo_training_app.leaderboards.filter.list.domain.LeaderboardFiltersStorage
    public final g2b b(LeaderboardFiltersModel leaderboardFiltersModel) {
        this.a.setValue(leaderboardFiltersModel);
        return g2b.a;
    }
}
