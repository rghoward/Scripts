package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wk9 implements e5a<Void, Void> {
    public final /* synthetic */ sa2 t;
    public final /* synthetic */ xk9 u;

    public wk9(xk9 xk9Var, sa2 sa2Var) {
        this.u = xk9Var;
        this.t = sa2Var;
    }

    @Override // defpackage.e5a
    public final r9a<Void> b(Void r9) throws Throwable {
        FileWriter fileWriter;
        JSONObject jSONObject = (JSONObject) this.t.c.t.submit(new Callable() { // from class: vk9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                xk9 xk9Var = this.a.u;
                jt2 jt2Var = xk9Var.f;
                al9 al9Var = xk9Var.b;
                String str = (String) jt2Var.a;
                sa2.b();
                try {
                    HashMap mapE = jt2.e(al9Var);
                    s45 s45Var = new s45(str, mapE);
                    s45Var.c("User-Agent", "Crashlytics Android SDK/20.0.6");
                    s45Var.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    jt2.a(s45Var, al9Var);
                    String strConcat = "Requesting settings from ".concat(str);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", strConcat, null);
                    }
                    String str2 = "Settings query params were: " + mapE;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str2, null);
                    }
                    return jt2Var.f(s45Var.b());
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
            }
        }).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            xk9 xk9Var = this.u;
            nk9 nk9VarH = xk9Var.c.h(jSONObject);
            w11 w11Var = xk9Var.e;
            long j = nk9VarH.c;
            w11Var.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter(w11Var.a);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Throwable th) {
                        th = th;
                        fileWriter2 = fileWriter;
                        po1.b(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                }
            } catch (Exception e2) {
                e = e2;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                po1.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            po1.b(fileWriter, "Failed to close settings writer.");
            xk9.c(jSONObject, "Loaded settings: ");
            String str = xk9Var.b.f;
            SharedPreferences.Editor editorEdit = xk9Var.a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str);
            editorEdit.apply();
            xk9Var.h.set(nk9VarH);
            xk9Var.i.get().d(nk9VarH);
        }
        return caa.e(null);
    }
}
