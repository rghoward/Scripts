package com.hwpo_training_app.leaderboards.details.header.data;

import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardNetworkEntity;
import com.hwpo_training_app.leaderboards.common.domain.entity.DomainEntitiesMapperKt;
import com.hwpo_training_app.leaderboards.details.header.data.api.LeaderboardDetailsHeaderApi;
import com.hwpo_training_app.leaderboards.details.header.domain.LeaderboardDetailsHeaderRepository;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.u02;
import defpackage.v72;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsHeaderRepositoryImpl implements LeaderboardDetailsHeaderRepository {
    public final LeaderboardDetailsHeaderApi a;

    public LeaderboardDetailsHeaderRepositoryImpl(LeaderboardDetailsHeaderApi leaderboardDetailsHeaderApi) {
        leaderboardDetailsHeaderApi.getClass();
        this.a = leaderboardDetailsHeaderApi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, u02 u02Var) throws Throwable {
        LeaderboardDetailsHeaderRepositoryImpl$getLeaderboardById$1 leaderboardDetailsHeaderRepositoryImpl$getLeaderboardById$1;
        if (u02Var instanceof LeaderboardDetailsHeaderRepositoryImpl$getLeaderboardById$1) {
            leaderboardDetailsHeaderRepositoryImpl$getLeaderboardById$1 = (LeaderboardDetailsHeaderRepositoryImpl$getLeaderboardById$1) u02Var;
            int i2 = leaderboardDetailsHeaderRepositoryImpl$getLeaderboardById$1.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                leaderboardDetailsHeaderRepositoryImpl$getLeaderboardById$1.v = i2 - Integer.MIN_VALUE;
            } else {
                leaderboardDetailsHeaderRepositoryImpl$getLeaderboardById$1 = new LeaderboardDetailsHeaderRepositoryImpl$getLeaderboardById$1(this, u02Var);
            }
        } else {
            leaderboardDetailsHeaderRepositoryImpl$getLeaderboardById$1 = new LeaderboardDetailsHeaderRepositoryImpl$getLeaderboardById$1(this, u02Var);
        }
        Object objA = leaderboardDetailsHeaderRepositoryImpl$getLeaderboardById$1.t;
        int i3 = leaderboardDetailsHeaderRepositoryImpl$getLeaderboardById$1.v;
        if (i3 == 0) {
            dv8.b(objA);
            leaderboardDetailsHeaderRepositoryImpl$getLeaderboardById$1.v = 1;
            objA = this.a.a(i, leaderboardDetailsHeaderRepositoryImpl$getLeaderboardById$1);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objA);
        }
        return DomainEntitiesMapperKt.b((LeaderboardNetworkEntity) objA, false);
    }
}
