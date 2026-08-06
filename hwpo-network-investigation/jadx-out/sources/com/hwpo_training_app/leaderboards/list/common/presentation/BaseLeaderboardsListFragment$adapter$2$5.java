package com.hwpo_training_app.leaderboards.list.common.presentation;

import defpackage.g2b;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.pi4;
import defpackage.rhb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class BaseLeaderboardsListFragment$adapter$2$5 extends pi4 implements oh4<Integer, g2b> {
    public final void invoke(int i) {
        BaseLeaderboardsListViewModel baseLeaderboardsListViewModel = (BaseLeaderboardsListViewModel) this.receiver;
        if (baseLeaderboardsListViewModel.b().c || baseLeaderboardsListViewModel.b().d || i + 5 < baseLeaderboardsListViewModel.b().a.size()) {
            return;
        }
        oy0.d(rhb.b(baseLeaderboardsListViewModel), null, null, new BaseLeaderboardsListViewModel$fetchLeaderboardsNextPage$1(baseLeaderboardsListViewModel, null), 3);
    }

    @Override // defpackage.oh4
    public final /* bridge */ /* synthetic */ g2b invoke(Integer num) {
        invoke(num.intValue());
        return g2b.a;
    }
}
