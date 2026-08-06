package defpackage;

import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardMeasureNetworkEntity;
import com.hwpo_training_app.leaderboards.valuedetails.data.network.response.LeaderboardValueDetailsNetworkEntity;
import com.hwpo_training_app.notifications.data.network.push.NotificationNetworkEntity;
import com.hwpo_training_app.notifications.data.network.push.NotificationTypeNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b56 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ b56(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                LeaderboardValueDetailsNetworkEntity.Companion companion = LeaderboardValueDetailsNetworkEntity.Companion;
                return LeaderboardMeasureNetworkEntity.Companion.serializer();
            case 1:
                NotificationNetworkEntity.LeaderboardCommentNotificationNetworkEntity.Companion companion2 = NotificationNetworkEntity.LeaderboardCommentNotificationNetworkEntity.Companion;
                return NotificationTypeNetworkEntity.Companion.serializer();
            case 2:
                yx7.a aVar = yx7.Companion;
                return g2b.a;
            default:
                return g2b.a;
        }
    }
}
