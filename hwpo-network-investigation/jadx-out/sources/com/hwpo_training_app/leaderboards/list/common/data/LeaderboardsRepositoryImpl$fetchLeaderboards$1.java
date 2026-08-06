package com.hwpo_training_app.leaderboards.list.common.data;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardType;
import com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel;
import com.hwpo_training_app.leaderboards.list.common.domain.LeaderboardsStorage;
import defpackage.u02;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.list.common.data.LeaderboardsRepositoryImpl", f = "LeaderboardsRepositoryImpl.kt", l = {27, 34, 36, 60, 60}, m = "fetchLeaderboards", v = 2)
final class LeaderboardsRepositoryImpl$fetchLeaderboards$1 extends u02 {
    public LeaderboardsStorage A;
    public boolean B;
    public /* synthetic */ Object C;
    public final /* synthetic */ LeaderboardsRepositoryImpl D;
    public int E;
    public LeaderboardType t;
    public LeaderboardFiltersModel u;
    public Integer v;
    public Long w;
    public Long x;
    public Integer y;
    public Integer z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardsRepositoryImpl$fetchLeaderboards$1(LeaderboardsRepositoryImpl leaderboardsRepositoryImpl, u02 u02Var) {
        super(u02Var);
        this.D = leaderboardsRepositoryImpl;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(null, false, this);
    }
}
