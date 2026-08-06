package com.hwpo_training_app.leaderboards.details.header.presentation;

import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersExtensionsKt;
import com.hwpo_training_app.leaderboards.filter.details.domain.entity.LeaderboardDetailsFiltersModel;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.rma;
import defpackage.u;
import defpackage.xd3;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel$observeLeaderboardDetailsFiltersState$1", f = "LeaderboardDetailsHeaderViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
final class LeaderboardDetailsHeaderViewModel$observeLeaderboardDetailsFiltersState$1 extends p6a implements ci4<xd3<? extends Exception, ? extends LeaderboardDetailsFiltersModel>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ LeaderboardDetailsHeaderViewModel u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsHeaderViewModel$observeLeaderboardDetailsFiltersState$1(LeaderboardDetailsHeaderViewModel leaderboardDetailsHeaderViewModel, r02<? super LeaderboardDetailsHeaderViewModel$observeLeaderboardDetailsFiltersState$1> r02Var) {
        super(2, r02Var);
        this.u = leaderboardDetailsHeaderViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        LeaderboardDetailsHeaderViewModel$observeLeaderboardDetailsFiltersState$1 leaderboardDetailsHeaderViewModel$observeLeaderboardDetailsFiltersState$1 = new LeaderboardDetailsHeaderViewModel$observeLeaderboardDetailsFiltersState$1(this.u, r02Var);
        leaderboardDetailsHeaderViewModel$observeLeaderboardDetailsFiltersState$1.t = obj;
        return leaderboardDetailsHeaderViewModel$observeLeaderboardDetailsFiltersState$1;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends LeaderboardDetailsFiltersModel> xd3Var, r02<? super g2b> r02Var) {
        return ((LeaderboardDetailsHeaderViewModel$observeLeaderboardDetailsFiltersState$1) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
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
            LeaderboardDetailsFiltersModel.Companion.getClass();
            LeaderboardDetailsHeaderViewModel.Action.FiltersChanged filtersChanged = new LeaderboardDetailsHeaderViewModel.Action.FiltersChanged(LeaderboardDetailsFiltersExtensionsKt.a(leaderboardDetailsFiltersModel, LeaderboardDetailsFiltersModel.j));
            int i = LeaderboardDetailsHeaderViewModel.R;
            this.u.e(filtersChanged);
            g2b g2bVar2 = g2b.a;
        }
        return g2b.a;
    }
}
