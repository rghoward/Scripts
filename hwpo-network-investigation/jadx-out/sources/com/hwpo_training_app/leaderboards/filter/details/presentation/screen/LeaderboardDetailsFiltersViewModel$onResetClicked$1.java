package com.hwpo_training_app.leaderboards.filter.details.presentation.screen;

import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersModel;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersViewModel$onResetClicked$1", f = "LeaderboardDetailsFiltersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
final class LeaderboardDetailsFiltersViewModel$onResetClicked$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public final /* synthetic */ LeaderboardDetailsFiltersViewModel t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsFiltersViewModel$onResetClicked$1(LeaderboardDetailsFiltersViewModel leaderboardDetailsFiltersViewModel, r02<? super LeaderboardDetailsFiltersViewModel$onResetClicked$1> r02Var) {
        super(2, r02Var);
        this.t = leaderboardDetailsFiltersViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new LeaderboardDetailsFiltersViewModel$onResetClicked$1(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((LeaderboardDetailsFiltersViewModel$onResetClicked$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        LeaderboardDetailsFiltersModel.Companion.getClass();
        LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModel = LeaderboardDetailsFiltersModel.j;
        LeaderboardDetailsFiltersViewModel leaderboardDetailsFiltersViewModel = this.t;
        leaderboardDetailsFiltersViewModel.C = leaderboardDetailsFiltersModel;
        leaderboardDetailsFiltersViewModel.g();
        return g2b.a;
    }
}
