package com.hwpo_training_app.leaderboards.details.header.domain;

import com.hwpo_training_app.leaderboards.filter.details.data.LeaderboardDetailsFiltersRepositoryImpl;
import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersModel;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.r02;
import defpackage.u02;
import defpackage.v72;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ClearLeaderboardDetailsFiltersUseCase extends g5b<g2b, g2b> {
    public final LeaderboardDetailsFiltersRepositoryImpl a;

    public ClearLeaderboardDetailsFiltersUseCase(LeaderboardDetailsFiltersRepositoryImpl leaderboardDetailsFiltersRepositoryImpl) {
        this.a = leaderboardDetailsFiltersRepositoryImpl;
    }

    @Override // defpackage.g5b
    public final /* bridge */ /* synthetic */ Object a(Object obj, g5b.b bVar) {
        return c(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(r02 r02Var) throws Throwable {
        ClearLeaderboardDetailsFiltersUseCase$executeOnBackground$1 clearLeaderboardDetailsFiltersUseCase$executeOnBackground$1;
        if (r02Var instanceof ClearLeaderboardDetailsFiltersUseCase$executeOnBackground$1) {
            clearLeaderboardDetailsFiltersUseCase$executeOnBackground$1 = (ClearLeaderboardDetailsFiltersUseCase$executeOnBackground$1) r02Var;
            int i = clearLeaderboardDetailsFiltersUseCase$executeOnBackground$1.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                clearLeaderboardDetailsFiltersUseCase$executeOnBackground$1.v = i - Integer.MIN_VALUE;
            } else {
                clearLeaderboardDetailsFiltersUseCase$executeOnBackground$1 = new ClearLeaderboardDetailsFiltersUseCase$executeOnBackground$1(this, (u02) r02Var);
            }
        } else {
            clearLeaderboardDetailsFiltersUseCase$executeOnBackground$1 = new ClearLeaderboardDetailsFiltersUseCase$executeOnBackground$1(this, (u02) r02Var);
        }
        Object obj = clearLeaderboardDetailsFiltersUseCase$executeOnBackground$1.t;
        int i2 = clearLeaderboardDetailsFiltersUseCase$executeOnBackground$1.v;
        if (i2 == 0) {
            dv8.b(obj);
            LeaderboardDetailsFiltersModel.Companion.getClass();
            LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModel = LeaderboardDetailsFiltersModel.j;
            clearLeaderboardDetailsFiltersUseCase$executeOnBackground$1.v = 1;
            Object objA = this.a.a(leaderboardDetailsFiltersModel, clearLeaderboardDetailsFiltersUseCase$executeOnBackground$1);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
