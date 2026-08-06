package com.hwpo_training_app.leaderboards.details.list.data;

import com.hwpo_training_app.leaderboards.common.domain.entity.TopValueKind;
import defpackage.u02;
import defpackage.xm2;
import io.ably.lib.transport.Defaults;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.list.data.LeaderboardAdditionalValueRepositoryImpl", f = "LeaderboardAdditionalValueRepositoryImpl.kt", l = {Defaults.HTTP_ASYNC_THREADPOOL_SIZE}, m = "isMyEmptyValueStored", v = 2)
final class LeaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1 extends u02 {
    public TopValueKind t;
    public /* synthetic */ Object u;
    public final /* synthetic */ LeaderboardAdditionalValueRepositoryImpl v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardAdditionalValueRepositoryImpl$isMyEmptyValueStored$1(LeaderboardAdditionalValueRepositoryImpl leaderboardAdditionalValueRepositoryImpl, u02 u02Var) {
        super(u02Var);
        this.v = leaderboardAdditionalValueRepositoryImpl;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.b(null, null, this);
    }
}
