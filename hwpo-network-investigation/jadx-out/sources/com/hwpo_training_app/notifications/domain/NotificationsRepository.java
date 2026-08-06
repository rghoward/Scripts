package com.hwpo_training_app.notifications.domain;

import com.hwpo_training_app.notifications.domain.entity.NotificationModel;
import defpackage.g2b;
import defpackage.k74;
import defpackage.r02;
import defpackage.r54;
import defpackage.u02;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface NotificationsRepository {
    r54<List<NotificationModel>> a();

    k74 b();

    k74 c();

    Object d(r02<? super g2b> r02Var);

    Object e(boolean z, u02 u02Var);
}
