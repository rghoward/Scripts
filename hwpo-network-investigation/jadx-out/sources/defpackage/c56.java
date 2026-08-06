package defpackage;

import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardNetworkEntity$$serializer;
import com.hwpo_training_app.leaderboards.list.common.data.network.response.LeaderboardsListResponse;
import io.intercom.android.sdk.m5.conversation.usecase.PushNotificationsBannerUseCase;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c56 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ c56(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                LeaderboardsListResponse.Companion companion = LeaderboardsListResponse.Companion;
                return new m30(LeaderboardNetworkEntity$$serializer.INSTANCE);
            default:
                return PushNotificationsBannerUseCase._init_$lambda$0();
        }
    }
}
