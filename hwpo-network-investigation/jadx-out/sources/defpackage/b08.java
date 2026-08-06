package defpackage;

import com.hwpo_training_app.core.data.model.schedule.PlanNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.PlanOptionNetworkEntity$$serializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b08 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ b08(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                PlanNetworkEntity.Companion companion = PlanNetworkEntity.Companion;
                return new m30(PlanOptionNetworkEntity$$serializer.INSTANCE);
            default:
                return g2b.a;
        }
    }
}
