package com.hwpo_training_app.leaderboards.details.header.presentation;

import defpackage.mh4;
import defpackage.ss5;
import defpackage.thb;
import defpackage.whb;
import defpackage.wp5;
import defpackage.wt4;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsHeaderFragment$special$$inlined$viewModels$default$5 extends wp5 implements mh4<thb.c> {
    public final /* synthetic */ LeaderboardDetailsHeaderFragment u;
    public final /* synthetic */ ss5 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsHeaderFragment$special$$inlined$viewModels$default$5(LeaderboardDetailsHeaderFragment leaderboardDetailsHeaderFragment, ss5 ss5Var) {
        super(0);
        this.u = leaderboardDetailsHeaderFragment;
        this.v = ss5Var;
    }

    @Override // defpackage.mh4
    public final thb.c invoke() {
        thb.c defaultViewModelProviderFactory;
        whb whbVar = (whb) this.v.getValue();
        wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
        return (wt4Var == null || (defaultViewModelProviderFactory = wt4Var.getDefaultViewModelProviderFactory()) == null) ? this.u.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
    }
}
