package com.hwpo_training_app.leaderboards.filter.list.presentation.screen;

import android.view.View;
import defpackage.dv8;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;
import defpackage.yk2;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.filter.list.presentation.screen.LeaderboardFiltersFragment$initListeners$1$9", f = "LeaderboardFiltersFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class LeaderboardFiltersFragment$initListeners$1$9 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ LeaderboardFiltersFragment t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardFiltersFragment$initListeners$1$9(LeaderboardFiltersFragment leaderboardFiltersFragment, r02<? super LeaderboardFiltersFragment$initListeners$1$9> r02Var) {
        super(3, r02Var);
        this.t = leaderboardFiltersFragment;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new LeaderboardFiltersFragment$initListeners$1$9(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        LeaderboardFiltersFragment.Companion companion = LeaderboardFiltersFragment.Companion;
        LeaderboardFiltersViewModel leaderboardFiltersViewModelR = this.t.r();
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        long jV = yk2.v(localDateNow);
        LocalDate localDate = leaderboardFiltersViewModelR.C.d;
        long jV2 = localDate != null ? yk2.v(localDate) : jV;
        LocalDate localDate2 = leaderboardFiltersViewModelR.C.c;
        leaderboardFiltersViewModelR.f(new LeaderboardFiltersEvents.ShowCalendarToDateEvent(jV2, localDate2 != null ? Long.valueOf(yk2.v(localDate2)) : null, jV));
        return g2b.a;
    }
}
