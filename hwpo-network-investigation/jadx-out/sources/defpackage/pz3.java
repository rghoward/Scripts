package defpackage;

import com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity$$serializer;
import com.hwpo_training_app.core.data.model.schedule.SchedulePerformanceNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pz3 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ pz3(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                return g2b.a;
            default:
                SchedulePerformanceNetworkEntity.Companion companion = SchedulePerformanceNetworkEntity.Companion;
                return new m30(SectionAttachmentNetworkEntity$$serializer.INSTANCE);
        }
    }
}
