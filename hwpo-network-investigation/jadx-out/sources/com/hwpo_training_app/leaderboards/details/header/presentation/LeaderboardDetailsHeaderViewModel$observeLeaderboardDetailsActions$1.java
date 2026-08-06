package com.hwpo_training_app.leaderboards.details.header.presentation;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardScheduleModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardSectionModel;
import com.hwpo_training_app.leaderboards.details.common.domain.actions.LeaderboardDetailsAction;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.r02;
import defpackage.rhb;
import defpackage.u;
import defpackage.xd3;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.yd3;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel$observeLeaderboardDetailsActions$1", f = "LeaderboardDetailsHeaderViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
final class LeaderboardDetailsHeaderViewModel$observeLeaderboardDetailsActions$1 extends p6a implements ci4<xd3<? extends Exception, ? extends LeaderboardDetailsAction>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ LeaderboardDetailsHeaderViewModel u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsHeaderViewModel$observeLeaderboardDetailsActions$1(LeaderboardDetailsHeaderViewModel leaderboardDetailsHeaderViewModel, r02<? super LeaderboardDetailsHeaderViewModel$observeLeaderboardDetailsActions$1> r02Var) {
        super(2, r02Var);
        this.u = leaderboardDetailsHeaderViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        LeaderboardDetailsHeaderViewModel$observeLeaderboardDetailsActions$1 leaderboardDetailsHeaderViewModel$observeLeaderboardDetailsActions$1 = new LeaderboardDetailsHeaderViewModel$observeLeaderboardDetailsActions$1(this.u, r02Var);
        leaderboardDetailsHeaderViewModel$observeLeaderboardDetailsActions$1.t = obj;
        return leaderboardDetailsHeaderViewModel$observeLeaderboardDetailsActions$1;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends LeaderboardDetailsAction> xd3Var, r02<? super g2b> r02Var) {
        return ((LeaderboardDetailsHeaderViewModel$observeLeaderboardDetailsActions$1) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xd3 xd3Var = (xd3) this.t;
        dv8.b(obj);
        final LeaderboardDetailsHeaderViewModel leaderboardDetailsHeaderViewModel = this.u;
        yd3.h(xd3Var, new oh4() { // from class: com.hwpo_training_app.leaderboards.details.header.presentation.a
            @Override // defpackage.oh4
            public final Object invoke(Object obj2) {
                LeaderboardScheduleModel leaderboardScheduleModel;
                LeaderboardDetailsAction leaderboardDetailsAction = (LeaderboardDetailsAction) obj2;
                boolean zA = xj5.a(leaderboardDetailsAction, LeaderboardDetailsAction.OpenEditPerformanceScreen.a);
                LeaderboardDetailsHeaderViewModel leaderboardDetailsHeaderViewModel2 = leaderboardDetailsHeaderViewModel;
                if (zA) {
                    LeaderboardModel leaderboardModel = leaderboardDetailsHeaderViewModel2.I;
                    if (leaderboardModel != null && (leaderboardScheduleModel = leaderboardModel.m) != null) {
                        int i = leaderboardScheduleModel.a;
                        LeaderboardSectionModel leaderboardSectionModel = leaderboardModel.j;
                        if (leaderboardSectionModel != null) {
                            oy0.d(rhb.b(leaderboardDetailsHeaderViewModel2), null, null, new LeaderboardDetailsHeaderViewModel$goToEditPerformanceScreen$1(leaderboardDetailsHeaderViewModel2, i, leaderboardSectionModel.a, null), 3);
                        }
                    }
                } else {
                    if (!(leaderboardDetailsAction instanceof LeaderboardDetailsAction.OpenLeaderboardValueCommentsScreen)) {
                        u.b();
                        return null;
                    }
                    int i2 = ((LeaderboardDetailsAction.OpenLeaderboardValueCommentsScreen) leaderboardDetailsAction).b;
                    int i3 = LeaderboardDetailsHeaderViewModel.R;
                    oy0.d(rhb.b(leaderboardDetailsHeaderViewModel2), null, null, new LeaderboardDetailsHeaderViewModel$goToLeaderboardValueCommentsScreen$1(leaderboardDetailsHeaderViewModel2, i2, null), 3);
                }
                return g2b.a;
            }
        });
        return g2b.a;
    }
}
