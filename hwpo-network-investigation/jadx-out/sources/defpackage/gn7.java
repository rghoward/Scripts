package defpackage;

import com.hwpo_training_app.tracking.data.entity.DifferenceNetworkEntity;
import com.hwpo_training_app.tracking.data.entity.TrackedValueNetworkEntity;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gn7 implements mh4 {
    public final /* synthetic */ int t;

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                return new fn7();
            default:
                TrackedValueNetworkEntity.Companion companion = TrackedValueNetworkEntity.Companion;
                return DifferenceNetworkEntity.Companion.serializer();
        }
    }
}
