package defpackage;

import android.util.Log;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.views.compose.AttributeCollectorCardKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n70 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ n70(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return AttributeCollectorCardKt.AttributeCollectorCard$lambda$1$lambda$0((AttributeData) obj);
            case 1:
                z72 z72Var = (z72) obj;
                z72Var.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", z72Var);
                return fe9.b;
            default:
                usb usbVar = (usb) obj;
                int i = tsb.F;
                yp4 yp4Var = usbVar.c;
                return Boolean.valueOf((yp4Var instanceof yp4.a) || !xj5.a(yp4Var, usbVar.b));
        }
    }
}
