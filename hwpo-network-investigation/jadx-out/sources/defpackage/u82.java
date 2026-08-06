package defpackage;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u82 {
    public static final s82 d = new s82();
    public static final t82 e = new t82();
    public final ey3 a;
    public String b = null;
    public String c = null;

    public u82(ey3 ey3Var) {
        this.a = ey3Var;
    }

    public static void a(ey3 ey3Var, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            ey3Var.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e2);
        }
    }
}
