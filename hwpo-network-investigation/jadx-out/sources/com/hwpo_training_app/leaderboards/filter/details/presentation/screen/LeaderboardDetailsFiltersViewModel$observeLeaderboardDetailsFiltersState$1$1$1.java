package com.hwpo_training_app.leaderboards.filter.details.presentation.screen;

import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersModel;
import com.hwpo_training_app.leaderboards.filter.details.presentation.screen.entity.LeaderboardDetailsFiltersUiEntityMapperKt;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.vv2;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1$1$1", f = "LeaderboardDetailsFiltersViewModel.kt", l = {177}, m = "invokeSuspend", v = 2)
public final class LeaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public LeaderboardDetailsFiltersModel t;
    public int u;
    public final /* synthetic */ LeaderboardDetailsFiltersViewModel v;
    public final /* synthetic */ LeaderboardDetailsFiltersModel w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1$1$1(LeaderboardDetailsFiltersViewModel leaderboardDetailsFiltersViewModel, LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModel, r02<? super LeaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1$1$1> r02Var) {
        super(2, r02Var);
        this.v = leaderboardDetailsFiltersViewModel;
        this.w = leaderboardDetailsFiltersModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new LeaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1$1$1(this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((LeaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModel;
        int i = this.u;
        LeaderboardDetailsFiltersViewModel leaderboardDetailsFiltersViewModel = this.v;
        if (i == 0) {
            dv8.b(obj);
            LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModel2 = this.w;
            leaderboardDetailsFiltersViewModel.B = leaderboardDetailsFiltersModel2;
            leaderboardDetailsFiltersViewModel.C = leaderboardDetailsFiltersModel2;
            vv2 vv2Var = leaderboardDetailsFiltersViewModel.A;
            this.t = leaderboardDetailsFiltersModel2;
            this.u = 1;
            Object objW = vv2Var.w(this);
            v72 v72Var = v72.t;
            if (objW == v72Var) {
                return v72Var;
            }
            obj = objW;
            leaderboardDetailsFiltersModel = leaderboardDetailsFiltersModel2;
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            leaderboardDetailsFiltersModel = this.t;
            dv8.b(obj);
        }
        LeaderboardDetailsFiltersViewModel.Action.ResetFiltersState resetFiltersState = new LeaderboardDetailsFiltersViewModel.Action.ResetFiltersState(LeaderboardDetailsFiltersUiEntityMapperKt.a(leaderboardDetailsFiltersModel, ((Boolean) obj).booleanValue()));
        int i2 = LeaderboardDetailsFiltersViewModel.J;
        leaderboardDetailsFiltersViewModel.e(resetFiltersState);
        return g2b.a;
    }
}
