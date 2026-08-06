package defpackage;

import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardTopValueNetworkEntity$$serializer;
import com.hwpo_training_app.leaderboards.details.list.data.response.AthletesListResponse;
import io.intercom.android.sdk.m5.conversation.reducers.ConversationReducer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a60 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ a60(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                AthletesListResponse.Companion companion = AthletesListResponse.Companion;
                return new m30(LeaderboardTopValueNetworkEntity$$serializer.INSTANCE);
            default:
                return ConversationReducer._init_$lambda$0();
        }
    }
}
