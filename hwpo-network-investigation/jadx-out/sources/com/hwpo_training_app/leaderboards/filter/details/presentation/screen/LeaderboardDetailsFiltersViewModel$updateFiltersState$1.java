package com.hwpo_training_app.leaderboards.filter.details.presentation.screen;

import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersExtensionsKt;
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
@xm2(c = "com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersViewModel$updateFiltersState$1", f = "LeaderboardDetailsFiltersViewModel.kt", l = {137}, m = "invokeSuspend", v = 2)
final class LeaderboardDetailsFiltersViewModel$updateFiltersState$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public LeaderboardDetailsFiltersModel t;
    public int u;
    public final /* synthetic */ LeaderboardDetailsFiltersViewModel v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsFiltersViewModel$updateFiltersState$1(LeaderboardDetailsFiltersViewModel leaderboardDetailsFiltersViewModel, r02<? super LeaderboardDetailsFiltersViewModel$updateFiltersState$1> r02Var) {
        super(2, r02Var);
        this.v = leaderboardDetailsFiltersViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new LeaderboardDetailsFiltersViewModel$updateFiltersState$1(this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((LeaderboardDetailsFiltersViewModel$updateFiltersState$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModel;
        int i = this.u;
        LeaderboardDetailsFiltersViewModel leaderboardDetailsFiltersViewModel = this.v;
        if (i == 0) {
            dv8.b(obj);
            LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModel2 = leaderboardDetailsFiltersViewModel.C;
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
        leaderboardDetailsFiltersViewModel.e(new LeaderboardDetailsFiltersViewModel.Action.FiltersStateChanged(LeaderboardDetailsFiltersUiEntityMapperKt.a(leaderboardDetailsFiltersModel, ((Boolean) obj).booleanValue()), LeaderboardDetailsFiltersExtensionsKt.a(leaderboardDetailsFiltersViewModel.C, leaderboardDetailsFiltersViewModel.B)));
        return g2b.a;
    }
}
