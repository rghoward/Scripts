package com.hwpo_training_app.leaderboards.details.common.data;

import com.hwpo_training_app.leaderboards.details.common.domain.LeaderboardDetailsActionsStorage;
import com.hwpo_training_app.leaderboards.details.common.domain.actions.LeaderboardDetailsAction;
import defpackage.am9;
import defpackage.g2b;
import defpackage.ji8;
import defpackage.r02;
import defpackage.ty1;
import defpackage.v72;
import defpackage.yk2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsActionsStorageImpl implements LeaderboardDetailsActionsStorage {
    public final am9 a;
    public final ji8 b;

    public LeaderboardDetailsActionsStorageImpl() {
        am9 am9VarB = ty1.b(7, null);
        this.a = am9VarB;
        this.b = yk2.a(am9VarB);
    }

    @Override // com.hwpo_training_app.leaderboards.details.common.domain.LeaderboardDetailsActionsStorage
    public final ji8 a() {
        return this.b;
    }

    @Override // com.hwpo_training_app.leaderboards.details.common.domain.LeaderboardDetailsActionsStorage
    public final Object b(LeaderboardDetailsAction leaderboardDetailsAction, r02<? super g2b> r02Var) throws Throwable {
        Object objEmit = this.a.emit(leaderboardDetailsAction, r02Var);
        return objEmit == v72.t ? objEmit : g2b.a;
    }
}
