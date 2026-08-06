package com.hwpo_training_app.leaderboards.details.header.presentation;

import defpackage.a87;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dm9;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel$onCommentsClicked$1", f = "LeaderboardDetailsHeaderViewModel.kt", l = {146}, m = "invokeSuspend", v = 2)
final class LeaderboardDetailsHeaderViewModel$onCommentsClicked$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ LeaderboardDetailsHeaderViewModel u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsHeaderViewModel$onCommentsClicked$1(LeaderboardDetailsHeaderViewModel leaderboardDetailsHeaderViewModel, r02<? super LeaderboardDetailsHeaderViewModel$onCommentsClicked$1> r02Var) {
        super(2, r02Var);
        this.u = leaderboardDetailsHeaderViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new LeaderboardDetailsHeaderViewModel$onCommentsClicked$1(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((LeaderboardDetailsHeaderViewModel$onCommentsClicked$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            LeaderboardDetailsHeaderViewModel leaderboardDetailsHeaderViewModel = this.u;
            dm9 dm9Var = leaderboardDetailsHeaderViewModel.F;
            a87.b bVar = new a87.b(leaderboardDetailsHeaderViewModel.i());
            this.t = 1;
            Object objA = dm9Var.a(bVar, this);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
