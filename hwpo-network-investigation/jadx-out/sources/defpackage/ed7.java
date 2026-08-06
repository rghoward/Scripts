package defpackage;

import com.hwpo_training_app.notifications.data.network.push.NotificationNetworkEntity;
import com.hwpo_training_app.notifications.data.network.push.NotificationTypeNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ed7 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ ed7(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                NotificationNetworkEntity.ClientBonusPlanRemindNotificationNetworkEntity.Companion companion = NotificationNetworkEntity.ClientBonusPlanRemindNotificationNetworkEntity.Companion;
                return NotificationTypeNetworkEntity.Companion.serializer();
            default:
                return g2b.a;
        }
    }
}
