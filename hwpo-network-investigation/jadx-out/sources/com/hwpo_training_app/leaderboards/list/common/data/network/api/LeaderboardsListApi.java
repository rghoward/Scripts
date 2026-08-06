package com.hwpo_training_app.leaderboards.list.common.data.network.api;

import com.hwpo_training_app.leaderboards.list.common.data.network.response.LeaderboardsListResponse;
import defpackage.gg8;
import defpackage.r02;
import defpackage.ui4;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface LeaderboardsListApi {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class DefaultImpls {
    }

    @ui4("scores")
    Object a(@gg8("score_kind") String str, @gg8("name") String str2, @gg8("show_empty_score") Boolean bool, @gg8("adjusted") Boolean bool2, @gg8("page") Integer num, @gg8("date_from") Long l, @gg8("date_to") Long l2, @gg8("day_from") Integer num2, @gg8("day_to") Integer num3, @gg8("per_page") Integer num4, @gg8("gym_id") Integer num5, @gg8("gym_type") String str3, r02<? super LeaderboardsListResponse> r02Var);
}
