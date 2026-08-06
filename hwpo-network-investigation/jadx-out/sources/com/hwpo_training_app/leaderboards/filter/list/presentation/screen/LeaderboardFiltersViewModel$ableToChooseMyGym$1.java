package com.hwpo_training_app.leaderboards.filter.list.presentation.screen;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.g5b;
import defpackage.h5b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.uk4;
import defpackage.v72;
import defpackage.xd3;
import defpackage.xm2;
import defpackage.yd3;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersViewModel$ableToChooseMyGym$1", f = "LeaderboardFiltersViewModel.kt", l = {37}, m = "invokeSuspend", v = 2)
public final class LeaderboardFiltersViewModel$ableToChooseMyGym$1 extends p6a implements ci4<t72, r02<? super Boolean>, Object> {
    public int t;
    public final /* synthetic */ LeaderboardFiltersViewModel u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardFiltersViewModel$ableToChooseMyGym$1(LeaderboardFiltersViewModel leaderboardFiltersViewModel, r02<? super LeaderboardFiltersViewModel$ableToChooseMyGym$1> r02Var) {
        super(2, r02Var);
        this.u = leaderboardFiltersViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new LeaderboardFiltersViewModel$ableToChooseMyGym$1(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super Boolean> r02Var) {
        return ((LeaderboardFiltersViewModel$ableToChooseMyGym$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            uk4 uk4Var = this.u.z;
            g2b g2bVar = g2b.a;
            this.t = 1;
            uk4Var.getClass();
            obj = g5b.b(uk4Var, g2bVar, this);
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
        h5b h5bVar = (h5b) yd3.e((xd3) obj, null);
        return Boolean.valueOf((h5bVar != null ? h5bVar.j : null) != null);
    }
}
