package com.hwpo_training_app.leaderboards.filter.details.presentation.flow;

import defpackage.lb2;
import defpackage.mh4;
import defpackage.ss5;
import defpackage.whb;
import defpackage.wp5;
import defpackage.wt4;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsFiltersFlowFragment$special$$inlined$viewModels$default$4 extends wp5 implements mh4<lb2> {
    public final /* synthetic */ ss5 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsFiltersFlowFragment$special$$inlined$viewModels$default$4(ss5 ss5Var) {
        super(0);
        this.u = ss5Var;
    }

    @Override // defpackage.mh4
    public final lb2 invoke() {
        whb whbVar = (whb) this.u.getValue();
        wt4 wt4Var = whbVar instanceof wt4 ? (wt4) whbVar : null;
        return wt4Var != null ? wt4Var.getDefaultViewModelCreationExtras() : lb2.a.b;
    }
}
