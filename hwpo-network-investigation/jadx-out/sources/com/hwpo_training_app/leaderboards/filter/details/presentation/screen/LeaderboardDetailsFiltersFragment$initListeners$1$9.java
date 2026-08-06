package com.hwpo_training_app.leaderboards.filter.details.presentation.screen;

import android.view.View;
import defpackage.dv8;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.filter.details.presentation.screen.LeaderboardDetailsFiltersFragment$initListeners$1$9", f = "LeaderboardDetailsFiltersFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class LeaderboardDetailsFiltersFragment$initListeners$1$9 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ LeaderboardDetailsFiltersFragment t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsFiltersFragment$initListeners$1$9(LeaderboardDetailsFiltersFragment leaderboardDetailsFiltersFragment, r02<? super LeaderboardDetailsFiltersFragment$initListeners$1$9> r02Var) {
        super(3, r02Var);
        this.t = leaderboardDetailsFiltersFragment;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new LeaderboardDetailsFiltersFragment$initListeners$1$9(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        LeaderboardDetailsFiltersFragment.Companion companion = LeaderboardDetailsFiltersFragment.Companion;
        LeaderboardDetailsFiltersViewModel leaderboardDetailsFiltersViewModelS = this.t.s();
        boolean z = !leaderboardDetailsFiltersViewModelS.b().c.a;
        Integer num = leaderboardDetailsFiltersViewModelS.C.d;
        String strValueOf = num != null ? String.valueOf(num.intValue()) : null;
        Integer num2 = leaderboardDetailsFiltersViewModelS.C.e;
        leaderboardDetailsFiltersViewModelS.e(new LeaderboardDetailsFiltersViewModel.Action.AgeRageExpandStateChanged(strValueOf, num2 != null ? String.valueOf(num2.intValue()) : null, z));
        return g2b.a;
    }
}
