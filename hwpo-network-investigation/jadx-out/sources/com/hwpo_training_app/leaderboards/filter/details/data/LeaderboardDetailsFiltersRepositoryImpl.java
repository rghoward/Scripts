package com.hwpo_training_app.leaderboards.filter.details.data;

import com.hwpo_training_app.leaderboards.filter.details.domain.LeaderboardDetailsFiltersRepository;
import com.hwpo_training_app.leaderboards.filter.details.domain.LeaderboardDetailsFiltersStorage;
import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersModel;
import defpackage.g2b;
import defpackage.r54;
import defpackage.u02;
import defpackage.v72;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsFiltersRepositoryImpl implements LeaderboardDetailsFiltersRepository {
    public final LeaderboardDetailsFiltersStorage a;
    public final r54<LeaderboardDetailsFiltersModel> b;

    public LeaderboardDetailsFiltersRepositoryImpl(LeaderboardDetailsFiltersStorage leaderboardDetailsFiltersStorage) {
        leaderboardDetailsFiltersStorage.getClass();
        this.a = leaderboardDetailsFiltersStorage;
        this.b = leaderboardDetailsFiltersStorage.a();
    }

    public final Object a(LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModel, u02 u02Var) {
        g2b g2bVarB = this.a.b(leaderboardDetailsFiltersModel);
        return g2bVarB == v72.t ? g2bVarB : g2b.a;
    }
}
