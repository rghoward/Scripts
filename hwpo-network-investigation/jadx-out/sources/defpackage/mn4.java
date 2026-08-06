package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mn4 implements s02 {
    @Override // defpackage.s02
    public final Object a(r9a r9aVar) throws IOException {
        Bundle bundle = (Bundle) r9aVar.k();
        if (bundle == null) {
            o03.a("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            o03.a("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            o03.a(string3);
            return null;
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        o03.a("SERVICE_NOT_AVAILABLE");
        return null;
    }
}
