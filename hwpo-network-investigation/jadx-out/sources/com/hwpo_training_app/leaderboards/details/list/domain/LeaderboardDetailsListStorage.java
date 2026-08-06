package com.hwpo_training_app.leaderboards.details.list.domain;

import com.hwpo_training_app.leaderboards.common.domain.entity.LeaderboardTopValueModel;
import com.hwpo_training_app.leaderboards.common.domain.entity.TopValueKind;
import defpackage.a0a;
import defpackage.g2b;
import defpackage.qe1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface LeaderboardDetailsListStorage extends qe1 {
    g2b a(TopValueKind topValueKind, List list, LeaderboardTopValueModel leaderboardTopValueModel);

    g2b d(int i, boolean z);

    g2b h(int i, boolean z);

    g2b i(List list, LeaderboardTopValueModel leaderboardTopValueModel);

    Integer k(TopValueKind topValueKind);

    void l(TopValueKind topValueKind, Integer num);

    a0a m();
}
