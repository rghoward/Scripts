package com.hwpo_training_app.leaderboards.filter.details.domain;

import com.hwpo_training_app.leaderboards.filter.details.data.LeaderboardDetailsFiltersRepositoryImpl;
import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersModel;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.u02;
import defpackage.v72;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ApplyDetailsFiltersUseCase extends g5b<LeaderboardDetailsFiltersModel, g2b> {
    public final LeaderboardDetailsFiltersRepositoryImpl a;

    public ApplyDetailsFiltersUseCase(LeaderboardDetailsFiltersRepositoryImpl leaderboardDetailsFiltersRepositoryImpl) {
        this.a = leaderboardDetailsFiltersRepositoryImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModel, u02 u02Var) throws Throwable {
        ApplyDetailsFiltersUseCase$executeOnBackground$1 applyDetailsFiltersUseCase$executeOnBackground$1;
        if (u02Var instanceof ApplyDetailsFiltersUseCase$executeOnBackground$1) {
            applyDetailsFiltersUseCase$executeOnBackground$1 = (ApplyDetailsFiltersUseCase$executeOnBackground$1) u02Var;
            int i = applyDetailsFiltersUseCase$executeOnBackground$1.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                applyDetailsFiltersUseCase$executeOnBackground$1.v = i - Integer.MIN_VALUE;
            } else {
                applyDetailsFiltersUseCase$executeOnBackground$1 = new ApplyDetailsFiltersUseCase$executeOnBackground$1(this, u02Var);
            }
        } else {
            applyDetailsFiltersUseCase$executeOnBackground$1 = new ApplyDetailsFiltersUseCase$executeOnBackground$1(this, u02Var);
        }
        Object obj = applyDetailsFiltersUseCase$executeOnBackground$1.t;
        int i2 = applyDetailsFiltersUseCase$executeOnBackground$1.v;
        if (i2 == 0) {
            dv8.b(obj);
            applyDetailsFiltersUseCase$executeOnBackground$1.v = 1;
            Object objA = this.a.a(leaderboardDetailsFiltersModel, applyDetailsFiltersUseCase$executeOnBackground$1);
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
