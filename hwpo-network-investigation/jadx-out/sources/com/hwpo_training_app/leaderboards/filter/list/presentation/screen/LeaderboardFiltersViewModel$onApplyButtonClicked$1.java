package com.hwpo_training_app.leaderboards.filter.list.presentation.screen;

import com.hwpo_training_app.leaderboards.filter.list.domain.ApplyFiltersUseCase;
import com.hwpo_training_app.leaderboards.filter.list.domain.entity.LeaderboardFiltersModel;
import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.rma;
import defpackage.t72;
import defpackage.u;
import defpackage.v72;
import defpackage.xd3;
import defpackage.xm2;
import io.ably.lib.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewModel$onApplyButtonClicked$1", f = "LeaderboardFiltersViewModel.kt", l = {Log.NONE}, m = "invokeSuspend", v = 2)
final class LeaderboardFiltersViewModel$onApplyButtonClicked$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ LeaderboardFiltersViewModel u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardFiltersViewModel$onApplyButtonClicked$1(LeaderboardFiltersViewModel leaderboardFiltersViewModel, r02<? super LeaderboardFiltersViewModel$onApplyButtonClicked$1> r02Var) {
        super(2, r02Var);
        this.u = leaderboardFiltersViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new LeaderboardFiltersViewModel$onApplyButtonClicked$1(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((LeaderboardFiltersViewModel$onApplyButtonClicked$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        LeaderboardFiltersViewModel leaderboardFiltersViewModel = this.u;
        if (i == 0) {
            dv8.b(obj);
            ApplyFiltersUseCase applyFiltersUseCase = leaderboardFiltersViewModel.y;
            LeaderboardFiltersModel leaderboardFiltersModel = leaderboardFiltersViewModel.C;
            this.t = 1;
            applyFiltersUseCase.getClass();
            obj = g5b.b(applyFiltersUseCase, leaderboardFiltersModel, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        xd3 xd3Var = (xd3) obj;
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            rma.a.b((Throwable) ((xd3.a) xd3Var).a);
            g2b g2bVar = g2b.a;
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            LeaderboardFiltersEvents.CloseDialog closeDialog = LeaderboardFiltersEvents.CloseDialog.b;
            int i2 = LeaderboardFiltersViewModel.O;
            leaderboardFiltersViewModel.f(closeDialog);
            g2b g2bVar2 = g2b.a;
        }
        return g2b.a;
    }
}
