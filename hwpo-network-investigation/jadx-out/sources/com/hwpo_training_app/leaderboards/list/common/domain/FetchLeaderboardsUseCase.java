package com.hwpo_training_app.leaderboards.list.common.domain;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardType;
import com.hwpo_training_app.leaderboards.list.common.data.LeaderboardsRepositoryImpl;
import defpackage.aa0;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.u02;
import defpackage.v72;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FetchLeaderboardsUseCase extends g5b<Params, g2b> {
    public final LeaderboardsRepositoryImpl a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Params {
        public final LeaderboardType a;

        public Params(LeaderboardType leaderboardType) {
            leaderboardType.getClass();
            this.a = leaderboardType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && this.a == ((Params) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Params(type=" + this.a + ")";
        }
    }

    public FetchLeaderboardsUseCase(LeaderboardsRepositoryImpl leaderboardsRepositoryImpl) {
        this.a = leaderboardsRepositoryImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g5b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(Params params, u02 u02Var) throws Throwable {
        FetchLeaderboardsUseCase$executeOnBackground$1 fetchLeaderboardsUseCase$executeOnBackground$1;
        if (u02Var instanceof FetchLeaderboardsUseCase$executeOnBackground$1) {
            fetchLeaderboardsUseCase$executeOnBackground$1 = (FetchLeaderboardsUseCase$executeOnBackground$1) u02Var;
            int i = fetchLeaderboardsUseCase$executeOnBackground$1.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchLeaderboardsUseCase$executeOnBackground$1.v = i - Integer.MIN_VALUE;
            } else {
                fetchLeaderboardsUseCase$executeOnBackground$1 = new FetchLeaderboardsUseCase$executeOnBackground$1(this, u02Var);
            }
        } else {
            fetchLeaderboardsUseCase$executeOnBackground$1 = new FetchLeaderboardsUseCase$executeOnBackground$1(this, u02Var);
        }
        Object obj = fetchLeaderboardsUseCase$executeOnBackground$1.t;
        int i2 = fetchLeaderboardsUseCase$executeOnBackground$1.v;
        if (i2 == 0) {
            dv8.b(obj);
            LeaderboardType leaderboardType = params.a;
            fetchLeaderboardsUseCase$executeOnBackground$1.v = 1;
            Object objA = this.a.a(leaderboardType, true, fetchLeaderboardsUseCase$executeOnBackground$1);
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
