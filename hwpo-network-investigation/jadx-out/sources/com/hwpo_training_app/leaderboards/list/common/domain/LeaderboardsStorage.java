package com.hwpo_training_app.leaderboards.list.common.domain;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardType;
import defpackage.g2b;
import defpackage.li8;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface LeaderboardsStorage {
    li8 a();

    g2b b(List list);

    Integer c(LeaderboardType leaderboardType);

    g2b clear();

    void d(LeaderboardType leaderboardType, Integer num);

    g2b e(LeaderboardType leaderboardType, List list);
}
