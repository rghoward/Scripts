package com.hwpo_training_app.leaderboards.details.header.presentation;

import defpackage.mh4;
import defpackage.ss5;
import defpackage.vhb;
import defpackage.whb;
import defpackage.wp5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsHeaderFragment$special$$inlined$viewModels$default$3 extends wp5 implements mh4<vhb> {
    public final /* synthetic */ ss5 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderboardDetailsHeaderFragment$special$$inlined$viewModels$default$3(ss5 ss5Var) {
        super(0);
        this.u = ss5Var;
    }

    @Override // defpackage.mh4
    public final vhb invoke() {
        return ((whb) this.u.getValue()).getViewModelStore();
    }
}
