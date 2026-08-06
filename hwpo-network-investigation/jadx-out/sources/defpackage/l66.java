package defpackage;

import com.hwpo_training_app.core.data.model.schedule.PlanNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.PlanType;
import com.hwpo_training_app.core.data.model.user.LengthUnitsNetworkEntity;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l66 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ l66(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                return lo.b("com.hwpo_training_app.core.data.model.user.LengthUnitsNetworkEntity", LengthUnitsNetworkEntity.values(), new String[]{"meter", "yard"}, new Annotation[][]{null, null});
            case 1:
                return g2b.a;
            case 2:
                PlanNetworkEntity.Companion companion = PlanNetworkEntity.Companion;
                return PlanType.Companion.serializer();
            default:
                return g2b.a;
        }
    }
}
