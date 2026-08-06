package defpackage;

import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardMeasureNetworkEntity;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lm5 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ lm5(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                return bn5.b;
            default:
                return lo.b("com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardMeasureNetworkEntity", LeaderboardMeasureNetworkEntity.values(), new String[]{"weight", "time", "reps", "distance", "calories", "rpm", "spm", "bpm", "watts", "round_reps"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null});
        }
    }
}
