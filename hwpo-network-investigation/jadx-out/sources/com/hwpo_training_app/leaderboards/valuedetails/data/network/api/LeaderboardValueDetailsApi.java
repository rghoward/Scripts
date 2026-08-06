package com.hwpo_training_app.leaderboards.valuedetails.data.network.api;

import com.hwpo_training_app.leaderboards.valuedetails.data.network.response.LeaderboardValueDetailsResponse;
import defpackage.eu7;
import defpackage.r02;
import defpackage.ui4;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface LeaderboardValueDetailsApi {
    @ui4("scores/values/{value_id}")
    Object a(@eu7("value_id") int i, r02<? super LeaderboardValueDetailsResponse> r02Var);
}
