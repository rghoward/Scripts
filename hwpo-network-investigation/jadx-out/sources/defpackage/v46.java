package defpackage;

import com.hwpo_training_app.leaderboards.common.data.network.request.LeaderboardTypeNetworkEntity;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v46 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ v46(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                return lo.b("com.hwpo_training_app.leaderboards.common.data.network.request.LeaderboardTypeNetworkEntity", LeaderboardTypeNetworkEntity.values(), new String[]{"leaderboard", "challenge"}, new Annotation[][]{null, null});
            default:
                return g2b.a;
        }
    }
}
