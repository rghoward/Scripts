package com.hwpo_training_app.leaderboards.list.common.domain;

import com.hwpo_training_app.leaderboards.list.common.data.LeaderboardsRepositoryImpl;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.r02;
import defpackage.u02;
import defpackage.v72;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ClearLeaderboardStorageUseCase extends g5b<g2b, g2b> {
    public final LeaderboardsRepositoryImpl a;

    public ClearLeaderboardStorageUseCase(LeaderboardsRepositoryImpl leaderboardsRepositoryImpl) {
        this.a = leaderboardsRepositoryImpl;
    }

    @Override // defpackage.g5b
    public final /* bridge */ /* synthetic */ Object a(Object obj, g5b.b bVar) {
        return c(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(r02 r02Var) throws Throwable {
        ClearLeaderboardStorageUseCase$executeOnBackground$1 clearLeaderboardStorageUseCase$executeOnBackground$1;
        if (r02Var instanceof ClearLeaderboardStorageUseCase$executeOnBackground$1) {
            clearLeaderboardStorageUseCase$executeOnBackground$1 = (ClearLeaderboardStorageUseCase$executeOnBackground$1) r02Var;
            int i = clearLeaderboardStorageUseCase$executeOnBackground$1.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                clearLeaderboardStorageUseCase$executeOnBackground$1.v = i - Integer.MIN_VALUE;
            } else {
                clearLeaderboardStorageUseCase$executeOnBackground$1 = new ClearLeaderboardStorageUseCase$executeOnBackground$1(this, (u02) r02Var);
            }
        } else {
            clearLeaderboardStorageUseCase$executeOnBackground$1 = new ClearLeaderboardStorageUseCase$executeOnBackground$1(this, (u02) r02Var);
        }
        Object obj = clearLeaderboardStorageUseCase$executeOnBackground$1.t;
        int i2 = clearLeaderboardStorageUseCase$executeOnBackground$1.v;
        if (i2 == 0) {
            dv8.b(obj);
            clearLeaderboardStorageUseCase$executeOnBackground$1.v = 1;
            g2b g2bVarClear = this.a.b.clear();
            v72 v72Var = v72.t;
            if (g2bVarClear != v72Var) {
                g2bVarClear = g2b.a;
            }
            if (g2bVarClear == v72Var) {
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
