package defpackage;

import com.hwpo_training_app.core.data.model.schedule.BenchmarkNetworkEntity$$serializer;
import com.hwpo_training_app.core.data.model.schedule.ProgramSectionNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.request.LeaderboardPlanTypeNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardPlanNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f46 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ f46(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                LeaderboardPlanNetworkEntity.Companion companion = LeaderboardPlanNetworkEntity.Companion;
                return LeaderboardPlanTypeNetworkEntity.Companion.serializer();
            default:
                ProgramSectionNetworkEntity.Companion companion2 = ProgramSectionNetworkEntity.Companion;
                return new m30(BenchmarkNetworkEntity$$serializer.INSTANCE);
        }
    }
}
