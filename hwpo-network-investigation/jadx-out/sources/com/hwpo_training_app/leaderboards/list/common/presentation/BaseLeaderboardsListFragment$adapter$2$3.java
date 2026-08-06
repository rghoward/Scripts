package com.hwpo_training_app.leaderboards.list.common.presentation;

import com.hwpo_training_app.leaderboards.list.common.presentation.entity.TopValueUiEntity;
import com.intercom.twig.BuildConfig;
import defpackage.g2b;
import defpackage.oh4;
import defpackage.pi4;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class BaseLeaderboardsListFragment$adapter$2$3 extends pi4 implements oh4<TopValueUiEntity, g2b> {
    @Override // defpackage.oh4
    public final g2b invoke(TopValueUiEntity topValueUiEntity) {
        TopValueUiEntity topValueUiEntity2 = topValueUiEntity;
        topValueUiEntity2.getClass();
        BaseLeaderboardsListViewModel baseLeaderboardsListViewModel = (BaseLeaderboardsListViewModel) this.receiver;
        baseLeaderboardsListViewModel.getClass();
        if (topValueUiEntity2.j) {
            String str = topValueUiEntity2.h;
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            baseLeaderboardsListViewModel.f(new BaseLeaderboardsListEvents.ShowResultsDialog(str, topValueUiEntity2.k));
        }
        return g2b.a;
    }
}
