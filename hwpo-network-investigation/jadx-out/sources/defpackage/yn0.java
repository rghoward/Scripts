package defpackage;

import com.hwpo_training_app.core.data.model.schedule.BenchmarkMeasureTypeNetworkEntity;
import com.hwpo_training_app.notifications.data.network.push.NotificationModuleSerializer;
import com.hwpo_training_app.notifications.data.network.response.NotificationsResponse;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yn0 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ yn0(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                return lo.b("com.hwpo_training_app.core.data.model.schedule.BenchmarkMeasureTypeNetworkEntity", BenchmarkMeasureTypeNetworkEntity.values(), new String[]{"weight", "time", "reps", "round_reps", "distance", "calories", "rpm", "spm", "bpm", "watts", "mm_hg", "kg_m2", "scale", "percent", "beats_min"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            default:
                NotificationsResponse.Companion companion = NotificationsResponse.Companion;
                return new m30(NotificationModuleSerializer.c);
        }
    }
}
