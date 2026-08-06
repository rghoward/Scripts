package defpackage;

import com.hwpo_training_app.core.data.model.schedule.ProgramSectionNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.SectionKindNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardTopValueNetworkEntity$$serializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tu1 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ tu1(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                pt1.b("Unexpected call to default provider");
                throw new qp5();
            case 1:
                LeaderboardNetworkEntity.Companion companion = LeaderboardNetworkEntity.Companion;
                return new m30(LeaderboardTopValueNetworkEntity$$serializer.INSTANCE);
            default:
                ProgramSectionNetworkEntity.Companion companion2 = ProgramSectionNetworkEntity.Companion;
                return SectionKindNetworkEntity.Companion.serializer();
        }
    }
}
