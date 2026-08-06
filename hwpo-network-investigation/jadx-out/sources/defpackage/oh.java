package defpackage;

import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardResultTypeNetworkEntity;
import com.hwpo_training_app.leaderboards.valuedetails.data.network.response.LeaderboardValueDetailsNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oh implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ oh(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                ko7 ko7Var = ci.a;
                return iq2.a;
            case 1:
                LeaderboardValueDetailsNetworkEntity.Companion companion = LeaderboardValueDetailsNetworkEntity.Companion;
                return LeaderboardResultTypeNetworkEntity.Companion.serializer();
            default:
                yx7.a aVar = yx7.Companion;
                return g2b.a;
        }
    }
}
