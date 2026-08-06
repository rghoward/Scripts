package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r82 {
    public ir0 a;
    public sv0 b;

    public final void a(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            zi ziVar = "clx".equals(bundle2.getString("_o")) ? this.a : this.b;
            if (ziVar == null) {
                return;
            }
            ziVar.b(bundle2, string);
        }
    }
}
