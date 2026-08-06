package defpackage;

import io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt;
import io.intercom.android.sdk.models.Conversation;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yz4 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ yz4(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return HomeContentScreenKt.HomeContentScreen$lambda$11$lambda$10((Conversation) obj);
            default:
                cw cwVar = (cw) obj;
                float f = cwVar.a;
                return new b53((((long) Float.floatToRawIntBits(cwVar.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        }
    }
}
