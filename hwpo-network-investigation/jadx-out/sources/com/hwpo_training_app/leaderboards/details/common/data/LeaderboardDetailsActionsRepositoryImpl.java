package com.hwpo_training_app.leaderboards.details.common.data;

import com.hwpo_training_app.leaderboards.details.common.domain.LeaderboardDetailsActionsRepository;
import com.hwpo_training_app.leaderboards.details.common.domain.LeaderboardDetailsActionsStorage;
import com.hwpo_training_app.leaderboards.details.common.domain.actions.LeaderboardDetailsAction;
import defpackage.r54;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardDetailsActionsRepositoryImpl implements LeaderboardDetailsActionsRepository {
    public final LeaderboardDetailsActionsStorage a;
    public final r54<LeaderboardDetailsAction> b;

    public LeaderboardDetailsActionsRepositoryImpl(LeaderboardDetailsActionsStorage leaderboardDetailsActionsStorage) {
        leaderboardDetailsActionsStorage.getClass();
        this.a = leaderboardDetailsActionsStorage;
        this.b = leaderboardDetailsActionsStorage.a();
    }
}
