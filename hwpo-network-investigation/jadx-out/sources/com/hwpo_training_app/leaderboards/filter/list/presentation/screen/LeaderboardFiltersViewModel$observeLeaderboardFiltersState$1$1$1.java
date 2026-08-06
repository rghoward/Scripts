package com.hwpo_training_app.leaderboards.filter.list.presentation.screen;

import com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel;
import com.hwpo_training_app.leaderboards.filter.list.presentation.screen.entity.LeaderboardFiltersUiEntityMapperKt;
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
@xm2(c = "com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewModel$observeLeaderboardFiltersState$1$1$1", f = "LeaderboardFiltersViewModel.kt", l = {186}, m = "invokeSuspend", v = 2)
public final class LeaderboardFiltersViewModel$observeLeaderboardFiltersState$1$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public LeaderboardFiltersModel t;
    public int u;
    public final /* synthetic */ LeaderboardFiltersViewModel v;
    public final /* synthetic */ LeaderboardFiltersModel w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardFiltersViewModel$observeLeaderboardFiltersState$1$1$1(LeaderboardFiltersViewModel leaderboardFiltersViewModel, LeaderboardFiltersModel leaderboardFiltersModel, r02<? super LeaderboardFiltersViewModel$observeLeaderboardFiltersState$1$1$1> r02Var) {
        super(2, r02Var);
        this.v = leaderboardFiltersViewModel;
        this.w = leaderboardFiltersModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new LeaderboardFiltersViewModel$observeLeaderboardFiltersState$1$1$1(this.v, this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((LeaderboardFiltersViewModel$observeLeaderboardFiltersState$1$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        LeaderboardFiltersModel leaderboardFiltersModel;
        int i = this.u;
        LeaderboardFiltersViewModel leaderboardFiltersViewModel = this.v;
        if (i == 0) {
            dv8.b(obj);
            LeaderboardFiltersModel leaderboardFiltersModel2 = this.w;
            leaderboardFiltersViewModel.B = leaderboardFiltersModel2;
            leaderboardFiltersViewModel.C = leaderboardFiltersModel2;
            vv2 vv2Var = leaderboardFiltersViewModel.A;
            this.t = leaderboardFiltersModel2;
            this.u = 1;
            Object objW = vv2Var.w(this);
            v72 v72Var = v72.t;
            if (objW == v72Var) {
                return v72Var;
            }
            obj = objW;
            leaderboardFiltersModel = leaderboardFiltersModel2;
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            leaderboardFiltersModel = this.t;
            dv8.b(obj);
        }
        LeaderboardFiltersViewModel.Action.FiltersStateChanged filtersStateChanged = new LeaderboardFiltersViewModel.Action.FiltersStateChanged(LeaderboardFiltersUiEntityMapperKt.a(leaderboardFiltersModel, ((Boolean) obj).booleanValue()), false);
        int i2 = LeaderboardFiltersViewModel.O;
        leaderboardFiltersViewModel.e(filtersStateChanged);
        return g2b.a;
    }
}
