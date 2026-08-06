package defpackage;

import com.hwpo_training_app.core.data.model.schedule.score.ProgramScoreNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.request.LeaderboardKindNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b46 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ b46(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                LeaderboardNetworkEntity.Companion companion = LeaderboardNetworkEntity.Companion;
                return LeaderboardKindNetworkEntity.Companion.serializer();
            default:
                ProgramScoreNetworkEntity.Companion companion2 = ProgramScoreNetworkEntity.Companion;
                return new m30(o2a.a);
        }
    }
}
