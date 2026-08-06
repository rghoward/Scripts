package defpackage;

import com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity$$serializer;
import com.hwpo_training_app.core.data.model.schedule.ProgramSectionNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardPerformanceNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e46 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ e46(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                LeaderboardPerformanceNetworkEntity.Companion companion = LeaderboardPerformanceNetworkEntity.Companion;
                break;
            default:
                ProgramSectionNetworkEntity.Companion companion2 = ProgramSectionNetworkEntity.Companion;
                break;
        }
        return new m30(SectionAttachmentNetworkEntity$$serializer.INSTANCE);
    }
}
