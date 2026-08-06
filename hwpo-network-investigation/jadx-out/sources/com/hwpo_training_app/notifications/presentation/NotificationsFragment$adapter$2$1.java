package com.hwpo_training_app.notifications.presentation;

import com.hwpo_training_app.notifications.presentation.entity.NotificationUiEntity;
import defpackage.g2b;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.pi4;
import defpackage.rhb;
import defpackage.u;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class NotificationsFragment$adapter$2$1 extends pi4 implements oh4<NotificationUiEntity, g2b> {
    public final void e(NotificationUiEntity notificationUiEntity) {
        notificationUiEntity.getClass();
        NotificationsViewModel notificationsViewModel = (NotificationsViewModel) this.receiver;
        notificationsViewModel.getClass();
        if (notificationUiEntity instanceof NotificationUiEntity.LeaderboardCommentCreated) {
            oy0.d(rhb.b(notificationsViewModel), null, null, new NotificationsViewModel$navigateToLeaderboardsCommentsScreen$1(notificationsViewModel, (NotificationUiEntity.LeaderboardCommentCreated) notificationUiEntity, null), 3);
        } else if (notificationUiEntity instanceof NotificationUiEntity.LeaderboardValueCommentCreated) {
            oy0.d(rhb.b(notificationsViewModel), null, null, new NotificationsViewModel$navigateToLeaderboardValueCommentsScreen$1(notificationsViewModel, (NotificationUiEntity.LeaderboardValueCommentCreated) notificationUiEntity, null), 3);
        } else {
            if (notificationUiEntity instanceof NotificationUiEntity.ClientBonusPlanRemind) {
                return;
            }
            u.b();
        }
    }

    @Override // defpackage.oh4
    public final /* bridge */ /* synthetic */ g2b invoke(NotificationUiEntity notificationUiEntity) {
        e(notificationUiEntity);
        return g2b.a;
    }
}
