package defpackage;

import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import io.ably.lib.http.HttpConstants;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jt2 {
    public Object a;

    public static void a(s45 s45Var, al9 al9Var) {
        String str = al9Var.a;
        if (str != null) {
            s45Var.c("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        s45Var.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        s45Var.c("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.6");
        s45Var.c(HttpConstants.Headers.ACCEPT, HttpConstants.ContentTypes.JSON);
        s45Var.c("X-CRASHLYTICS-DEVICE-MODEL", al9Var.b);
        String str2 = al9Var.c;
        if (str2 != null) {
            s45Var.c("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = al9Var.d;
        if (str3 != null) {
            s45Var.c("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = al9Var.e.c().a;
        if (str4 != null) {
            s45Var.c("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static HashMap e(al9 al9Var) {
        HashMap map = new HashMap();
        map.put("build_version", al9Var.h);
        map.put("display_version", al9Var.g);
        map.put("source", Integer.toString(al9Var.i));
        String str = al9Var.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public void b(byte b) {
        ((Parcel) this.a).writeByte(b);
    }

    public void c(float f) {
        ((Parcel) this.a).writeFloat(f);
    }

    public void d(long j) {
        long jB = bka.b(j);
        byte b = 0;
        if (!dka.a(jB, 0L)) {
            if (dka.a(jB, 4294967296L)) {
                b = 1;
            } else if (dka.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        b(b);
        if (dka.a(bka.b(j), 0L)) {
            return;
        }
        c(bka.c(j));
    }

    public JSONObject f(x45 x45Var) {
        String str = (String) this.a;
        int i = x45Var.a;
        zd6 zd6Var = zd6.t;
        zd6Var.e("Settings response code was: " + i);
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            String str2 = x45Var.b;
            try {
                return new JSONObject(str2);
            } catch (Exception e) {
                zd6Var.f("Failed to parse settings JSON from ".concat(str), e);
                zd6Var.f("Settings response " + str2, null);
                return null;
            }
        }
        String str3 = "Settings request failed; (status: " + i + ") from " + str;
        if (zd6Var.b(6)) {
            Log.e("FirebaseCrashlytics", str3, null);
        }
        return null;
    }
}
