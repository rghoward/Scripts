package com.hwpo_training_app.leaderboards.filter.list.presentation.screen;

import com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel;
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
@xm2(c = "com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewModel$observeLeaderboardFiltersState$1", f = "LeaderboardFiltersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
final class LeaderboardFiltersViewModel$observeLeaderboardFiltersState$1 extends p6a implements ci4<xd3<? extends Exception, ? extends LeaderboardFiltersModel>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ LeaderboardFiltersViewModel u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardFiltersViewModel$observeLeaderboardFiltersState$1(LeaderboardFiltersViewModel leaderboardFiltersViewModel, r02<? super LeaderboardFiltersViewModel$observeLeaderboardFiltersState$1> r02Var) {
        super(2, r02Var);
        this.u = leaderboardFiltersViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        LeaderboardFiltersViewModel$observeLeaderboardFiltersState$1 leaderboardFiltersViewModel$observeLeaderboardFiltersState$1 = new LeaderboardFiltersViewModel$observeLeaderboardFiltersState$1(this.u, r02Var);
        leaderboardFiltersViewModel$observeLeaderboardFiltersState$1.t = obj;
        return leaderboardFiltersViewModel$observeLeaderboardFiltersState$1;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends LeaderboardFiltersModel> xd3Var, r02<? super g2b> r02Var) {
        return ((LeaderboardFiltersViewModel$observeLeaderboardFiltersState$1) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
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
            LeaderboardFiltersModel leaderboardFiltersModel = (LeaderboardFiltersModel) ((xd3.b) xd3Var).a;
            LeaderboardFiltersViewModel leaderboardFiltersViewModel = this.u;
            oy0.d(rhb.b(leaderboardFiltersViewModel), null, null, new LeaderboardFiltersViewModel$observeLeaderboardFiltersState$1$1$1(leaderboardFiltersViewModel, leaderboardFiltersModel, null), 3);
        }
        return g2b.a;
    }
}
