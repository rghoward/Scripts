package defpackage;

import com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity$$serializer;
import com.hwpo_training_app.core.data.model.schedule.ProgramPerformanceNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.request.LeaderboardKindNetworkEntity;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w25 implements mh4 {
    public final /* synthetic */ int t;

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 1:
                return vm5.b;
            case 2:
                return lo.b("com.hwpo_training_app.leaderboards.common.data.network.request.LeaderboardKindNetworkEntity", LeaderboardKindNetworkEntity.values(), new String[]{"leaderboard", "fitr_challenge", "cloned_fitr_challenge", "challenge"}, new Annotation[][]{null, null, null, null});
            default:
                ProgramPerformanceNetworkEntity.Companion companion = ProgramPerformanceNetworkEntity.Companion;
                return new m30(SectionAttachmentNetworkEntity$$serializer.INSTANCE);
        }
    }
}
