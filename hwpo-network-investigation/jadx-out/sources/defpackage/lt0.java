package defpackage;

import com.hwpo_training_app.tracking.data.entity.DifferenceNetworkEntity;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lt0 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ lt0(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                return g2b.a;
            case 1:
                y0a y0aVar = hi1.a;
                return Boolean.TRUE;
            case 2:
                return lo.b("com.hwpo_training_app.tracking.data.entity.DifferenceNetworkEntity", DifferenceNetworkEntity.values(), new String[]{"gain", "loss", "neutral"}, new Annotation[][]{null, null, null});
            default:
                return g2b.a;
        }
    }
}
