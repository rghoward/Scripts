package defpackage;

import com.hwpo_training_app.tracking.data.entity.TrackedValueEntriesResponse;
import com.hwpo_training_app.tracking.data.entity.TrackedValueEntryNetworkEntity$$serializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u42 implements mh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ u42(int i) {
        this.t = i;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        switch (this.t) {
            case 0:
                return g2b.a;
            default:
                TrackedValueEntriesResponse.Companion companion = TrackedValueEntriesResponse.Companion;
                return new m30(TrackedValueEntryNetworkEntity$$serializer.INSTANCE);
        }
    }
}
