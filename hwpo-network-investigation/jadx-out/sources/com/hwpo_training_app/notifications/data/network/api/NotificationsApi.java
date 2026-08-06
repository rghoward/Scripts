package com.hwpo_training_app.notifications.data.network.api;

import com.hwpo_training_app.notifications.data.network.response.NotificationsResponse;
import defpackage.gg8;
import defpackage.r02;
import defpackage.ui4;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface NotificationsApi {
    @ui4("notifications")
    Object a(@gg8("before") Long l, @gg8("limit") Integer num, r02<? super NotificationsResponse> r02Var);
}
