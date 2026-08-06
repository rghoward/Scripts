package com.hwpo_training_app.leaderboards.filter.list.domain;

import com.hwpo_training_app.leaderboards.filter.list.data.LeaderboardFiltersRepositoryImpl;
import com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.u02;
import defpackage.v72;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ApplyFiltersUseCase extends g5b<LeaderboardFiltersModel, g2b> {
    public final LeaderboardFiltersRepositoryImpl a;

    public ApplyFiltersUseCase(LeaderboardFiltersRepositoryImpl leaderboardFiltersRepositoryImpl) {
        this.a = leaderboardFiltersRepositoryImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(LeaderboardFiltersModel leaderboardFiltersModel, u02 u02Var) throws Throwable {
        ApplyFiltersUseCase$executeOnBackground$1 applyFiltersUseCase$executeOnBackground$1;
        if (u02Var instanceof ApplyFiltersUseCase$executeOnBackground$1) {
            applyFiltersUseCase$executeOnBackground$1 = (ApplyFiltersUseCase$executeOnBackground$1) u02Var;
            int i = applyFiltersUseCase$executeOnBackground$1.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                applyFiltersUseCase$executeOnBackground$1.v = i - Integer.MIN_VALUE;
            } else {
                applyFiltersUseCase$executeOnBackground$1 = new ApplyFiltersUseCase$executeOnBackground$1(this, u02Var);
            }
        } else {
            applyFiltersUseCase$executeOnBackground$1 = new ApplyFiltersUseCase$executeOnBackground$1(this, u02Var);
        }
        Object obj = applyFiltersUseCase$executeOnBackground$1.t;
        int i2 = applyFiltersUseCase$executeOnBackground$1.v;
        if (i2 == 0) {
            dv8.b(obj);
            applyFiltersUseCase$executeOnBackground$1.v = 1;
            Object objA = this.a.a(leaderboardFiltersModel, applyFiltersUseCase$executeOnBackground$1);
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
