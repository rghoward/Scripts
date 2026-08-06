package com.hwpo_training_app.leaderboards.list.common.presentation.adapter.delegate;

import android.view.View;
import com.hwpo_training_app.leaderboards.databinding.ListItemTopAthleteBinding;
import com.hwpo_training_app.leaderboards.list.common.presentation.entity.TopValueUiEntity;
import defpackage.dv8;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.oh4;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;
import defpackage.ya;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.list.common.presentation.adapter.delegate.LeaderboardTopAthleteDelegateKt$leaderboardAthleteDelegate$3$1$3", f = "LeaderboardTopAthleteDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
final class LeaderboardTopAthleteDelegateKt$leaderboardAthleteDelegate$3$1$3 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ oh4<TopValueUiEntity, g2b> t;
    public final /* synthetic */ ya<TopValueUiEntity, ListItemTopAthleteBinding> u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LeaderboardTopAthleteDelegateKt$leaderboardAthleteDelegate$3$1$3(oh4<? super TopValueUiEntity, g2b> oh4Var, ya<TopValueUiEntity, ListItemTopAthleteBinding> yaVar, r02<? super LeaderboardTopAthleteDelegateKt$leaderboardAthleteDelegate$3$1$3> r02Var) {
        super(3, r02Var);
        this.t = oh4Var;
        this.u = yaVar;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new LeaderboardTopAthleteDelegateKt$leaderboardAthleteDelegate$3$1$3(this.t, this.u, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.invoke(this.u.t());
        return g2b.a;
    }
}
