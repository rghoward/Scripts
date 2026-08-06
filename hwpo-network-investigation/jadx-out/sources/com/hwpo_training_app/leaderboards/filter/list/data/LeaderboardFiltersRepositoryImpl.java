package com.hwpo_training_app.leaderboards.filter.list.data;

import com.hwpo_training_app.leaderboards.filter.list.domain.LeaderboardFiltersRepository;
import com.hwpo_training_app.leaderboards.filter.list.domain.LeaderboardFiltersStorage;
import com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel;
import defpackage.g2b;
import defpackage.r54;
import defpackage.u02;
import defpackage.v72;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardFiltersRepositoryImpl implements LeaderboardFiltersRepository {
    public final LeaderboardFiltersStorage a;
    public final r54<LeaderboardFiltersModel> b;

    public LeaderboardFiltersRepositoryImpl(LeaderboardFiltersStorage leaderboardFiltersStorage) {
        leaderboardFiltersStorage.getClass();
        this.a = leaderboardFiltersStorage;
        this.b = leaderboardFiltersStorage.a();
    }

    public final Object a(LeaderboardFiltersModel leaderboardFiltersModel, u02 u02Var) {
        g2b g2bVarB = this.a.b(leaderboardFiltersModel);
        return g2bVarB == v72.t ? g2bVarB : g2b.a;
    }
}
