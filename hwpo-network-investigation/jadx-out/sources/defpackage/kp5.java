package defpackage;

import android.util.Log;
import com.intercom.twig.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kp5 {
    public final HashMap a = new HashMap();
    public final int b = 64;
    public final int c;

    public kp5(int i) {
        this.c = i;
    }

    public static String a(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str) {
        boolean zEquals;
        String strA = a(this.c, "com.crashlytics.version-control-info");
        if (this.a.size() >= this.b && !this.a.containsKey(strA)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.b, null);
            return false;
        }
        String strA2 = a(this.c, str);
        String str2 = (String) this.a.get(strA);
        if (str2 == null) {
            zEquals = strA2 == null;
        } else {
            zEquals = str2.equals(strA2);
        }
        if (zEquals) {
            return false;
        }
        this.a.put(strA, strA2);
        return true;
    }

    public final synchronized void c(Map<String, String> map) {
        try {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strA = a(this.c, key);
                if (this.a.size() < this.b || this.a.containsKey(strA)) {
                    String value = entry.getValue();
                    this.a.put(strA, value == null ? BuildConfig.FLAVOR : a(this.c, value));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.b, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
