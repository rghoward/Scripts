package com.hwpo_training_app.leaderboards.details.list.data;

import com.hwpo_training_app.leaderboards.common.domain.entity.TopValueKind;
import defpackage.u02;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.list.data.LeaderboardAdditionalValueRepositoryImpl", f = "LeaderboardAdditionalValueRepositoryImpl.kt", l = {40, 41}, m = "fetchAdditionalValue", v = 2)
final class LeaderboardAdditionalValueRepositoryImpl$fetchAdditionalValue$1 extends u02 {
    public TopValueKind t;
    public boolean u;
    public boolean v;
    public boolean w;
    public /* synthetic */ Object x;
    public final /* synthetic */ LeaderboardAdditionalValueRepositoryImpl y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardAdditionalValueRepositoryImpl$fetchAdditionalValue$1(LeaderboardAdditionalValueRepositoryImpl leaderboardAdditionalValueRepositoryImpl, u02 u02Var) {
        super(u02Var);
        this.y = leaderboardAdditionalValueRepositoryImpl;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.a(null, false, false, false, null, this);
    }
}
