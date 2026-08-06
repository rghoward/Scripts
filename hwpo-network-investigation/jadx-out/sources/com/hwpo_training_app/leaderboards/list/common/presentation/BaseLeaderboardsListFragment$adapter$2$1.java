package com.hwpo_training_app.leaderboards.list.common.presentation;

import com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity;
import defpackage.g2b;
import defpackage.oh4;
import defpackage.pi4;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class BaseLeaderboardsListFragment$adapter$2$1 extends pi4 implements oh4<LeaderboardItemUiEntity, g2b> {
    @Override // defpackage.oh4
    public final g2b invoke(LeaderboardItemUiEntity leaderboardItemUiEntity) {
        LeaderboardItemUiEntity leaderboardItemUiEntity2 = leaderboardItemUiEntity;
        leaderboardItemUiEntity2.getClass();
        BaseLeaderboardsListViewModel baseLeaderboardsListViewModel = (BaseLeaderboardsListViewModel) this.receiver;
        baseLeaderboardsListViewModel.getClass();
        baseLeaderboardsListViewModel.j(leaderboardItemUiEntity2);
        return g2b.a;
    }
}
