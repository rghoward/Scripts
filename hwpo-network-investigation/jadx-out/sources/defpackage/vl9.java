package defpackage;

import com.hwpo_training_app.core.data.model.user.WeightUnitsNetworkEntity;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vl9 implements mh4 {
    public final /* synthetic */ int t;

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                return new ul9(0);
            default:
                return lo.b("com.hwpo_training_app.core.data.model.user.WeightUnitsNetworkEntity", WeightUnitsNetworkEntity.values(), new String[]{"kilogram", "pound"}, new Annotation[][]{null, null});
        }
    }
}
