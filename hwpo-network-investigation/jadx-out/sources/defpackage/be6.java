package defpackage;

import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class be6 {
    public static void a(String str, Object obj, String str2) {
        String strC = c(str);
        if (Log.isLoggable(strC, 3)) {
            Log.d(strC, String.format(str2, obj));
        }
    }

    public static void b(String str, String str2, Exception exc) {
        String strC = c(str);
        if (Log.isLoggable(strC, 6)) {
            Log.e(strC, str2, exc);
        }
    }

    public static String c(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }
}
