package com.hwpo_training_app.leaderboards.filter.details.presentation.screen;

import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersModel;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.r02;
import defpackage.rhb;
import defpackage.rma;
import defpackage.u;
import defpackage.xd3;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1", f = "LeaderboardDetailsFiltersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
final class LeaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1 extends p6a implements ci4<xd3<? extends Exception, ? extends LeaderboardDetailsFiltersModel>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ LeaderboardDetailsFiltersViewModel u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1(LeaderboardDetailsFiltersViewModel leaderboardDetailsFiltersViewModel, r02<? super LeaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1> r02Var) {
        super(2, r02Var);
        this.u = leaderboardDetailsFiltersViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        LeaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1 leaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1 = new LeaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1(this.u, r02Var);
        leaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1.t = obj;
        return leaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends LeaderboardDetailsFiltersModel> xd3Var, r02<? super g2b> r02Var) {
        return ((LeaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xd3 xd3Var = (xd3) this.t;
        dv8.b(obj);
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            rma.a.b((Throwable) ((xd3.a) xd3Var).a);
            g2b g2bVar = g2b.a;
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            LeaderboardDetailsFiltersModel leaderboardDetailsFiltersModel = (LeaderboardDetailsFiltersModel) ((xd3.b) xd3Var).a;
            LeaderboardDetailsFiltersViewModel leaderboardDetailsFiltersViewModel = this.u;
            oy0.d(rhb.b(leaderboardDetailsFiltersViewModel), null, null, new LeaderboardDetailsFiltersViewModel$observeLeaderboardDetailsFiltersState$1$1$1(leaderboardDetailsFiltersViewModel, leaderboardDetailsFiltersModel, null), 3);
        }
        return g2b.a;
    }
}
