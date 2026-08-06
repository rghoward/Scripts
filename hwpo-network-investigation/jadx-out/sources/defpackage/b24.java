package defpackage;

import android.os.Build;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.e;
import com.intercom.twig.BuildConfig;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b24 {
    public final b04 a;
    public final Executor b;
    public final gv1 c;
    public final gv1 d;
    public final c e;
    public final nv1 f;
    public final e g;
    public final t04 h;
    public final ov1 i;
    public final nx8 j;

    public b24(t04 t04Var, b04 b04Var, Executor executor, gv1 gv1Var, gv1 gv1Var2, gv1 gv1Var3, c cVar, nv1 nv1Var, e eVar, ov1 ov1Var, nx8 nx8Var) {
        this.h = t04Var;
        this.a = b04Var;
        this.b = executor;
        this.c = gv1Var;
        this.d = gv1Var2;
        this.e = cVar;
        this.f = nv1Var;
        this.g = eVar;
        this.i = ov1Var;
        this.j = nx8Var;
    }

    public static ArrayList d(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final HashMap a() {
        String string;
        j24 j24Var;
        nv1 nv1Var = this.f;
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(nv1.a(nv1Var.c));
        hashSet.addAll(nv1.a(nv1Var.d));
        HashMap map = new HashMap();
        for (final String str : hashSet) {
            b bVarC = nv1Var.c.c();
            String string2 = null;
            if (bVarC == null) {
                string = null;
            } else {
                try {
                    string = bVarC.b.getString(str);
                } catch (JSONException unused) {
                    string = null;
                }
            }
            if (string != null) {
                final b bVarC2 = nv1Var.c.c();
                if (bVarC2 != null) {
                    synchronized (nv1Var.a) {
                        try {
                            for (final qp0 qp0Var : nv1Var.a) {
                                nv1Var.b.execute(new Runnable() { // from class: mv1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        qp0Var.accept(str, bVarC2);
                                    }
                                });
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                j24Var = new j24(string, 2);
            } else {
                b bVarC3 = nv1Var.d.c();
                if (bVarC3 != null) {
                    try {
                        string2 = bVarC3.b.getString(str);
                    } catch (JSONException unused2) {
                    }
                }
                if (string2 != null) {
                    j24Var = new j24(string2, 1);
                } else {
                    Log.w("FirebaseRemoteConfig", "No value of type 'FirebaseRemoteConfigValue' exists for parameter key '" + str + "'.");
                    j24Var = new j24(BuildConfig.FLAVOR, 0);
                }
            }
            map.put(str, j24Var);
        }
        return map;
    }

    public final f24 b() {
        f24 f24Var;
        e eVar = this.g;
        synchronized (eVar.b) {
            try {
                eVar.a.getLong("last_fetch_time_in_millis", -1L);
                int i = eVar.a.getInt("last_fetch_status", 0);
                long j = eVar.a.getLong("fetch_timeout_in_seconds", 60L);
                if (j < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
                }
                long j2 = eVar.a.getLong("minimum_fetch_interval_in_seconds", 43200L);
                if (j2 < 0) {
                    throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
                }
                f24Var = new f24(i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return f24Var;
    }

    public final void c(boolean z) {
        HttpURLConnection httpURLConnection;
        ov1 ov1Var = this.i;
        synchronized (ov1Var) {
            d dVar = ov1Var.b;
            synchronized (dVar.r) {
                try {
                    dVar.e = z;
                    a aVar = dVar.g;
                    if (aVar != null) {
                        aVar.j = z;
                    }
                    if (Build.VERSION.SDK_INT >= 26 && z && (httpURLConnection = dVar.f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                synchronized (ov1Var) {
                    if (!ov1Var.a.isEmpty()) {
                        ov1Var.b.e(0L);
                    }
                }
            }
        }
    }
}
