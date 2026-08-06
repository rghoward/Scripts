package defpackage;

import com.hwpo_training_app.core.data.model.schedule.BenchmarkMeasureTypeNetworkEntity;
import com.hwpo_training_app.tracking.data.entity.ValueToAddNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xw9 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ xw9(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                return yw9.d;
            default:
                ValueToAddNetworkEntity.Companion companion = ValueToAddNetworkEntity.Companion;
                return BenchmarkMeasureTypeNetworkEntity.Companion.serializer();
        }
    }
}
