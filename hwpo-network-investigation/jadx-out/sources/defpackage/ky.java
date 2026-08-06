package defpackage;

import com.hwpo_training_app.leaderboards.common.data.network.request.LeaderboardPlanTypeNetworkEntity;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ky implements mh4 {
    public final /* synthetic */ int t;

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                u93 u93Var = py.a;
                return nt2.a;
            case 1:
                return lo.b("com.hwpo_training_app.leaderboards.common.data.network.request.LeaderboardPlanTypeNetworkEntity", LeaderboardPlanTypeNetworkEntity.values(), new String[]{"fixed", "one_many", "membership"}, new Annotation[][]{null, null, null});
            default:
                return new y43(0.0f);
        }
    }
}
