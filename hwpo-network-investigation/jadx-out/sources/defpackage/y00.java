package defpackage;

import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardScoreSubValueNetworkEntity$$serializer;
import com.hwpo_training_app.leaderboards.valuedetails.data.network.response.LeaderboardValueDetailsNetworkEntity;
import com.hwpo_training_app.notifications.data.network.push.NotificationNetworkEntity;
import com.hwpo_training_app.notifications.data.network.push.NotificationTypeNetworkEntity;
import io.intercom.android.sdk.AppIdentityInjector;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y00 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ y00(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                return AppIdentityInjector.gsonWithAdapters_delegate$lambda$4();
            case 1:
                LeaderboardValueDetailsNetworkEntity.Companion companion = LeaderboardValueDetailsNetworkEntity.Companion;
                return new m30(LeaderboardScoreSubValueNetworkEntity$$serializer.INSTANCE);
            case 2:
                return g2b.a;
            default:
                NotificationNetworkEntity.LeaderboardCommentMentionedNotificationNetworkEntity.Companion companion2 = NotificationNetworkEntity.LeaderboardCommentMentionedNotificationNetworkEntity.Companion;
                return NotificationTypeNetworkEntity.Companion.serializer();
        }
    }
}
