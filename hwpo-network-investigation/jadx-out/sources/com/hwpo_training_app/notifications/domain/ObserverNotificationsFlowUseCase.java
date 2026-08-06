package com.hwpo_training_app.notifications.domain;

import com.hwpo_training_app.notifications.domain.entity.NotificationModel;
import defpackage.f84;
import defpackage.g2b;
import defpackage.r54;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ObserverNotificationsFlowUseCase extends f84<g2b, List<? extends NotificationModel>> {
    public final NotificationsRepository a;

    public ObserverNotificationsFlowUseCase(NotificationsRepository notificationsRepository) {
        notificationsRepository.getClass();
        this.a = notificationsRepository;
    }

    @Override // defpackage.f84
    public final r54<List<? extends NotificationModel>> a(g2b g2bVar) {
        g2bVar.getClass();
        return this.a.a();
    }
}
