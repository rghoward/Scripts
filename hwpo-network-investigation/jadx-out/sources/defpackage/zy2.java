package defpackage;

import android.content.Context;
import io.intercom.android.sdk.identity.DeviceIdentityStore;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zy2 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ zy2(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return DeviceIdentityStore.deviceDataStore_delegate$lambda$0((Context) obj);
            default:
                rr4.a aVar = rr4.Companion;
                return ((cs4) obj).h;
        }
    }
}
