package com.hwpo_training_app.leaderboards.list.common.presentation.adapter.delegate;

import com.hwpo_training_app.leaderboards.list.common.presentation.entity.LeaderboardItemUiEntity;
import defpackage.ei4;
import defpackage.wp5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardProgramSearchResultDelegateKt$leaderboardProgramSearchResultDelegate$$inlined$adapterDelegateViewBinding$default$1 extends wp5 implements ei4<LeaderboardItemUiEntity, List<? extends LeaderboardItemUiEntity>, Integer, Boolean> {
    public LeaderboardProgramSearchResultDelegateKt$leaderboardProgramSearchResultDelegate$$inlined$adapterDelegateViewBinding$default$1() {
        super(3);
    }

    @Override // defpackage.ei4
    public final Boolean invoke(LeaderboardItemUiEntity leaderboardItemUiEntity, List<? extends LeaderboardItemUiEntity> list, Integer num) {
        num.intValue();
        list.getClass();
        return Boolean.valueOf(leaderboardItemUiEntity instanceof LeaderboardItemUiEntity.LeaderboardProgramsSearchResultUiEntity);
    }
}
