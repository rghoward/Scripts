package com.hwpo_training_app.leaderboards.details.header.presentation;

import android.view.View;
import com.hwpo_training_app.core.widget.SearchEditText;
import defpackage.dv8;
import defpackage.ei4;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.header.presentation.LeaderboardDetailsHeaderFragment$initListeners$1$10", f = "LeaderboardDetailsHeaderFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class LeaderboardDetailsHeaderFragment$initListeners$1$10 extends p6a implements ei4<t72, View, r02<? super g2b>, Object> {
    public final /* synthetic */ LeaderboardDetailsHeaderFragment t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsHeaderFragment$initListeners$1$10(LeaderboardDetailsHeaderFragment leaderboardDetailsHeaderFragment, r02<? super LeaderboardDetailsHeaderFragment$initListeners$1$10> r02Var) {
        super(3, r02Var);
        this.t = leaderboardDetailsHeaderFragment;
    }

    @Override // defpackage.ei4
    public final Object invoke(t72 t72Var, View view, r02<? super g2b> r02Var) {
        return new LeaderboardDetailsHeaderFragment$initListeners$1$10(this.t, r02Var).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        LeaderboardDetailsHeaderFragment.Companion companion = LeaderboardDetailsHeaderFragment.Companion;
        LeaderboardDetailsHeaderFragment leaderboardDetailsHeaderFragment = this.t;
        SearchEditText searchEditText = leaderboardDetailsHeaderFragment.p().r;
        searchEditText.t.c.setText((CharSequence) null);
        searchEditText.clearFocus();
        leaderboardDetailsHeaderFragment.q().e(new LeaderboardDetailsHeaderViewModel.Action.ChangeSearchToolbarState(true, false));
        return g2b.a;
    }
}
