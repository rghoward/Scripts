package com.hwpo_training_app.leaderboards.details.list.data;

import defpackage.u02;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.list.data.LeaderboardDetailsListRepositoryImpl", f = "LeaderboardDetailsListRepositoryImpl.kt", l = {87, 88}, m = "likeResult", v = 2)
final class LeaderboardDetailsListRepositoryImpl$likeResult$1 extends u02 {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ LeaderboardDetailsListRepositoryImpl v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsListRepositoryImpl$likeResult$1(LeaderboardDetailsListRepositoryImpl leaderboardDetailsListRepositoryImpl, u02 u02Var) {
        super(u02Var);
        this.v = leaderboardDetailsListRepositoryImpl;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(0, this);
    }
}
