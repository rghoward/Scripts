package com.hwpo_training_app.leaderboards.filter.list.presentation.screen;

import android.view.View;
import com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel;
import defpackage.dv8;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$initListeners$1$2", f = "LeaderboardFiltersFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class LeaderboardFiltersFragment$initListeners$1$2 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ LeaderboardFiltersFragment t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardFiltersFragment$initListeners$1$2(LeaderboardFiltersFragment leaderboardFiltersFragment, r02<? super LeaderboardFiltersFragment$initListeners$1$2> r02Var) {
        super(3, r02Var);
        this.t = leaderboardFiltersFragment;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new LeaderboardFiltersFragment$initListeners$1$2(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
        LeaderboardFiltersViewModel leaderboardFiltersViewModelR = this.t.r();
        LeaderboardFiltersModel leaderboardFiltersModel = leaderboardFiltersViewModelR.C;
        leaderboardFiltersViewModelR.C = LeaderboardFiltersModel.d(leaderboardFiltersModel, false, false, null, null, null, null, false, null, null, !leaderboardFiltersModel.j, 2047);
        leaderboardFiltersViewModelR.g();
        return g2b.a;
    }
}
