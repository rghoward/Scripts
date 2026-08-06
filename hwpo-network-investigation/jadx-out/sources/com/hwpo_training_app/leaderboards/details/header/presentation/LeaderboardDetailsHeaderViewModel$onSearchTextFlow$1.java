package com.hwpo_training_app.leaderboards.details.header.presentation;

import com.hwpo_training_app.leaderboards.details.header.domain.SearchTopValuesUseCase;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.v72;
import defpackage.xm2;
import defpackage.z2a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderViewModel$onSearchTextFlow$1", f = "LeaderboardDetailsHeaderViewModel.kt", l = {183}, m = "invokeSuspend", v = 2)
final class LeaderboardDetailsHeaderViewModel$onSearchTextFlow$1 extends p6a implements ci4<String, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ LeaderboardDetailsHeaderViewModel v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsHeaderViewModel$onSearchTextFlow$1(LeaderboardDetailsHeaderViewModel leaderboardDetailsHeaderViewModel, r02<? super LeaderboardDetailsHeaderViewModel$onSearchTextFlow$1> r02Var) {
        super(2, r02Var);
        this.v = leaderboardDetailsHeaderViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        LeaderboardDetailsHeaderViewModel$onSearchTextFlow$1 leaderboardDetailsHeaderViewModel$onSearchTextFlow$1 = new LeaderboardDetailsHeaderViewModel$onSearchTextFlow$1(this.v, r02Var);
        leaderboardDetailsHeaderViewModel$onSearchTextFlow$1.u = obj;
        return leaderboardDetailsHeaderViewModel$onSearchTextFlow$1;
    }

    @Override // defpackage.ci4
    public final Object invoke(String str, r02<? super g2b> r02Var) {
        return ((LeaderboardDetailsHeaderViewModel$onSearchTextFlow$1) create(str, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = (String) this.u;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            SearchTopValuesUseCase searchTopValuesUseCase = this.v.C;
            String string = z2a.R(str).toString();
            this.u = null;
            this.t = 1;
            searchTopValuesUseCase.getClass();
            Object objB = g5b.b(searchTopValuesUseCase, string, this);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
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
