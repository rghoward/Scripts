package com.hwpo_training_app.leaderboards.details.list.presentation;

import com.hwpo_training_app.leaderboards.details.common.domain.SendLeaderboardDetailsActionUseCase;
import com.hwpo_training_app.leaderboards.details.common.domain.actions.LeaderboardDetailsAction;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel$goToLeaderboardValueComments$1", f = "AthletesListViewModel.kt", l = {272}, m = "invokeSuspend", v = 2)
final class AthletesListViewModel$goToLeaderboardValueComments$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ AthletesListViewModel u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AthletesListViewModel$goToLeaderboardValueComments$1(AthletesListViewModel athletesListViewModel, int i, int i2, String str, int i3, r02<? super AthletesListViewModel$goToLeaderboardValueComments$1> r02Var) {
        super(2, r02Var);
        this.u = athletesListViewModel;
        this.v = i;
        this.w = i2;
        this.x = str;
        this.y = i3;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new AthletesListViewModel$goToLeaderboardValueComments$1(this.u, this.v, this.w, this.x, this.y, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((AthletesListViewModel$goToLeaderboardValueComments$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            SendLeaderboardDetailsActionUseCase sendLeaderboardDetailsActionUseCase = this.u.x;
            String str = this.x;
            LeaderboardDetailsAction.OpenLeaderboardValueCommentsScreen openLeaderboardValueCommentsScreen = new LeaderboardDetailsAction.OpenLeaderboardValueCommentsScreen(this.v, this.w, this.y, str);
            this.t = 1;
            sendLeaderboardDetailsActionUseCase.getClass();
            Object objB = g5b.b(sendLeaderboardDetailsActionUseCase, openLeaderboardValueCommentsScreen, this);
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
