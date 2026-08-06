package com.hwpo_training_app.leaderboards.details.list.data;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardTopValueModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.TopValueKind;
import com.hwpo_training_app.leaderboards.details.list.domain.LeaderboardDetailsListStorage;
import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersModel;
import defpackage.gl8;
import defpackage.u02;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl", f = "LeaderboardDetailsListRepositoryImpl.kt", l = {32, 36, 38, 61, 66, 78, 78}, m = "fetchLeaderboardTopValues", v = 2)
final class LeaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$1 extends u02 {
    public Boolean A;
    public LeaderboardDetailsListStorage B;
    public boolean C;
    public boolean D;
    public /* synthetic */ Object E;
    public final /* synthetic */ LeaderboardDetailsListRepositoryImpl F;
    public int G;
    public int t;
    public int u;
    public TopValueKind v;
    public LeaderboardDetailsFiltersModel w;
    public Integer x;
    public gl8 y;
    public LeaderboardTopValueModel z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsListRepositoryImpl$fetchLeaderboardTopValues$1(LeaderboardDetailsListRepositoryImpl leaderboardDetailsListRepositoryImpl, u02 u02Var) {
        super(u02Var);
        this.F = leaderboardDetailsListRepositoryImpl;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(0, null, false, this);
    }
}
