package com.hwpo_training_app.leaderboards.details.list.data.api;

import com.hwpo_training_app.leaderboards.details.list.data.response.AthletesListResponse;
import defpackage.eu7;
import defpackage.g2b;
import defpackage.gd4;
import defpackage.gg8;
import defpackage.nu3;
import defpackage.r02;
import defpackage.ui4;
import defpackage.wn7;
import defpackage.xs4;
import io.ably.lib.http.HttpConstants;
import io.intercom.android.sdk.annotations.SeenState;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface LeaderboardDetailsListApi {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class DefaultImpls {
    }

    @xs4(hasBody = true, method = HttpConstants.Methods.PATCH, path = "scores/values/{score_id}")
    @gd4
    Object a(@eu7("score_id") int i, @nu3(SeenState.HIDE) boolean z, r02<? super g2b> r02Var);

    @wn7("likes")
    @gd4
    Object b(@nu3("resource_id") int i, @nu3("resource_type") String str, r02<? super g2b> r02Var);

    @xs4(hasBody = true, method = HttpConstants.Methods.DELETE, path = "likes")
    @gd4
    Object c(@nu3("resource_id") int i, @nu3("resource_type") String str, r02<? super g2b> r02Var);

    @ui4("scores/{score_id}/items")
    Object d(@eu7("score_id") int i, @gg8("show_hidden") Boolean bool, @gg8("gender[]") String[] strArr, @gg8("adjusted") boolean z, @gg8("name") String str, @gg8("age_from") Integer num, @gg8("age_to") Integer num2, @gg8("hidden") Boolean bool2, @gg8("gym_id") Integer num3, @gg8("gym_type") String str2, @gg8("page") Integer num4, @gg8("per_page") Integer num5, r02<? super AthletesListResponse> r02Var);
}
