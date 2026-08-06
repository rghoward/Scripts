package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xk9 {
    public final Context a;
    public final al9 b;
    public final fd7 c;
    public final cy3 d;
    public final w11 e;
    public final jt2 f;
    public final se2 g;
    public final AtomicReference<nk9> h;
    public final AtomicReference<t9a<nk9>> i;

    public xk9(Context context, al9 al9Var, cy3 cy3Var, fd7 fd7Var, w11 w11Var, jt2 jt2Var, se2 se2Var) {
        AtomicReference<nk9> atomicReference = new AtomicReference<>();
        this.h = atomicReference;
        this.i = new AtomicReference<>(new t9a());
        this.a = context;
        this.b = al9Var;
        this.d = cy3Var;
        this.c = fd7Var;
        this.e = w11Var;
        this.f = jt2Var;
        this.g = se2Var;
        atomicReference.set(it2.b(cy3Var));
    }

    public static void c(JSONObject jSONObject, String str) {
        StringBuilder sbA = bl2.a(str);
        sbA.append(jSONObject.toString());
        String string = sbA.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public final nk9 a(qk9 qk9Var) throws Throwable {
        nk9 nk9Var = null;
        try {
            if (!qk9.u.equals(qk9Var)) {
                JSONObject jSONObjectA = this.e.a();
                if (jSONObjectA != null) {
                    nk9 nk9VarH = this.c.h(jSONObjectA);
                    c(jSONObjectA, "Loaded cached settings: ");
                    this.d.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (qk9.v.equals(qk9Var) || nk9VarH.c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return nk9VarH;
                        } catch (Exception e) {
                            e = e;
                            nk9Var = nk9VarH;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return nk9Var;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final nk9 b() {
        return this.h.get();
    }
}
