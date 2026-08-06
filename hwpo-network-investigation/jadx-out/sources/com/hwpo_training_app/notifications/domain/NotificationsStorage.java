package com.hwpo_training_app.notifications.domain;

import com.hwpo_training_app.notifications.domain.entity.NotificationModel;
import defpackage.g2b;
import defpackage.j74;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface NotificationsStorage {
    j74 a();

    Long b();

    g2b c(List list);

    g2b clear();

    void d(Long l);

    g2b e(List list);

    g2b f(List list);

    g2b g(NotificationModel notificationModel);
}
