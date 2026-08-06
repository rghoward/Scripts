package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sm8 implements g24 {
    public static final Random j = new Random();
    public static final HashMap k = new HashMap();
    public final HashMap a;
    public final Context b;
    public final ScheduledExecutorService c;
    public final e04 d;
    public final t04 e;
    public final b04 f;
    public final of8<si> g;
    public final String h;
    public final HashMap i;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements di0.a {
        public static final AtomicReference<a> a = new AtomicReference<>();

        @Override // di0.a
        public final void a(boolean z) {
            Random random = sm8.j;
            synchronized (sm8.class) {
                Iterator it = sm8.k.values().iterator();
                while (it.hasNext()) {
                    ((b24) it.next()).c(z);
                }
            }
        }
    }

    public sm8() {
        throw null;
    }

    public sm8(Context context, ScheduledExecutorService scheduledExecutorService, e04 e04Var, t04 t04Var, b04 b04Var, of8<si> of8Var) {
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = e04Var;
        this.e = t04Var;
        this.f = b04Var;
        this.g = of8Var;
        e04Var.a();
        this.h = e04Var.c.b;
        AtomicReference<a> atomicReference = a.a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference<a> atomicReference2 = a.a;
        if (atomicReference2.get() == null) {
            a aVar = new a();
            while (!atomicReference2.compareAndSet(null, aVar)) {
                if (atomicReference2.get() != null) {
                }
            }
            di0.b(application);
            di0.x.a(aVar);
        }
        caa.c(scheduledExecutorService, new Callable() { // from class: qm8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c("firebase");
            }
        });
    }

    @Override // defpackage.g24
    public final void a(final jx8 jx8Var) {
        final nx8 nx8Var = c("firebase").j;
        nx8Var.d.add(jx8Var);
        final r9a<b> r9aVarB = nx8Var.a.b();
        r9aVarB.f(nx8Var.c, new di7() { // from class: lx8
            @Override // defpackage.di7
            public final void onSuccess(Object obj) {
                nx8 nx8Var2 = nx8Var;
                r9a r9aVar = r9aVarB;
                final jx8 jx8Var2 = jx8Var;
                try {
                    b bVar = (b) r9aVar.j();
                    if (bVar != null) {
                        final ue0 ue0VarA = nx8Var2.b.a(bVar);
                        nx8Var2.c.execute(new Runnable() { // from class: mx8
                            @Override // java.lang.Runnable
                            public final void run() {
                                jx8Var2.a(ue0VarA);
                            }
                        });
                    }
                } catch (d24 e) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    public final synchronized b24 b(e04 e04Var, String str, t04 t04Var, b04 b04Var, Executor executor, gv1 gv1Var, gv1 gv1Var2, gv1 gv1Var3, c cVar, nv1 nv1Var, e eVar, nx8 nx8Var) {
        b04 b04Var2;
        if (!this.a.containsKey(str)) {
            if (str.equals("firebase")) {
                e04Var.a();
                if (e04Var.b.equals("[DEFAULT]")) {
                    b04Var2 = b04Var;
                } else {
                    b04Var2 = null;
                }
            } else {
                b04Var2 = null;
            }
            Context context = this.b;
            synchronized (this) {
                b24 b24Var = new b24(t04Var, b04Var2, executor, gv1Var, gv1Var2, gv1Var3, cVar, nv1Var, eVar, new ov1(e04Var, t04Var, cVar, gv1Var2, context, str, eVar, this.c), nx8Var);
                gv1Var2.b();
                gv1Var3.b();
                gv1Var.b();
                this.a.put(str, b24Var);
                k.put(str, b24Var);
            }
        }
        return (b24) this.a.get(str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0062  */
    public final synchronized b24 c(String str) throws Throwable {
        Throwable th;
        final px7 px7Var;
        try {
            try {
                gv1 gv1VarD = d(str, "fetch");
                gv1 gv1VarD2 = d(str, "activate");
                gv1 gv1VarD3 = d(str, "defaults");
                try {
                    e eVar = new e(this.b.getSharedPreferences("frc_" + this.h + "_" + str + "_settings", 0));
                    nv1 nv1Var = new nv1(this.c, gv1VarD2, gv1VarD3);
                    e04 e04Var = this.d;
                    of8<si> of8Var = this.g;
                    e04Var.a();
                    if (e04Var.b.equals("[DEFAULT]")) {
                        try {
                            if (str.equals("firebase")) {
                                px7Var = new px7(of8Var);
                            } else {
                                px7Var = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        px7Var = null;
                    }
                    if (px7Var != null) {
                        qp0 qp0Var = new qp0() { // from class: pm8
                            @Override // defpackage.qp0
                            public final void accept(Object obj, Object obj2) {
                                JSONObject jSONObjectOptJSONObject;
                                px7 px7Var2 = px7Var;
                                String str2 = (String) obj;
                                b bVar = (b) obj2;
                                si siVar = px7Var2.a.get();
                                if (siVar == null) {
                                    return;
                                }
                                JSONObject jSONObject = bVar.e;
                                if (jSONObject.length() < 1) {
                                    return;
                                }
                                JSONObject jSONObject2 = bVar.b;
                                if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str2)) != null) {
                                    String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                                    if (strOptString.isEmpty()) {
                                        return;
                                    }
                                    synchronized (px7Var2.b) {
                                        try {
                                            if (strOptString.equals(px7Var2.b.get(str2))) {
                                                return;
                                            }
                                            px7Var2.b.put(str2, strOptString);
                                            Bundle bundle = new Bundle();
                                            bundle.putString("arm_key", str2);
                                            bundle.putString("arm_value", jSONObject2.optString(str2));
                                            bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                            bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                            bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                            siVar.e("fp", "personalization_assignment", bundle);
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString("_fpid", strOptString);
                                            siVar.e("fp", "_fpc", bundle2);
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        };
                        synchronized (nv1Var.a) {
                            nv1Var.a.add(qp0Var);
                        }
                    }
                    ix8 ix8Var = new ix8();
                    ix8Var.a = gv1VarD2;
                    ix8Var.b = gv1VarD3;
                    ScheduledExecutorService scheduledExecutorService = this.c;
                    nx8 nx8Var = new nx8();
                    nx8Var.d = Collections.newSetFromMap(new ConcurrentHashMap());
                    nx8Var.a = gv1VarD2;
                    nx8Var.b = ix8Var;
                    nx8Var.c = scheduledExecutorService;
                    return b(this.d, str, this.e, this.f, this.c, gv1VarD, gv1VarD2, gv1VarD3, e(str, gv1VarD, eVar), nv1Var, eVar, nx8Var);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            th = th;
            throw th;
        }
    }

    public final gv1 d(String str, String str2) {
        sv1 sv1Var;
        gv1 gv1Var;
        String strA = av.a(vb0.a("frc_", this.h, "_", str, "_"), str2, ".json");
        ScheduledExecutorService scheduledExecutorService = this.c;
        Context context = this.b;
        HashMap map = sv1.c;
        synchronized (sv1.class) {
            try {
                HashMap map2 = sv1.c;
                if (!map2.containsKey(strA)) {
                    map2.put(strA, new sv1(context, strA));
                }
                sv1Var = (sv1) map2.get(strA);
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap map3 = gv1.d;
        synchronized (gv1.class) {
            try {
                String str3 = sv1Var.b;
                HashMap map4 = gv1.d;
                if (!map4.containsKey(str3)) {
                    map4.put(str3, new gv1(scheduledExecutorService, sv1Var));
                }
                gv1Var = (gv1) map4.get(str3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gv1Var;
    }

    public final synchronized c e(String str, gv1 gv1Var, e eVar) {
        t04 t04Var;
        of8 rm8Var;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str2;
        e04 e04Var;
        try {
            t04Var = this.e;
            e04 e04Var2 = this.d;
            e04Var2.a();
            rm8Var = e04Var2.b.equals("[DEFAULT]") ? this.g : new rm8();
            scheduledExecutorService = this.c;
            random = j;
            e04 e04Var3 = this.d;
            e04Var3.a();
            str2 = e04Var3.c.a;
            e04Var = this.d;
            e04Var.a();
        } catch (Throwable th) {
            throw th;
        }
        return new c(t04Var, rm8Var, scheduledExecutorService, random, gv1Var, new ConfigFetchHttpClient(this.b, e04Var.c.b, str2, str, eVar.a.getLong("fetch_timeout_in_seconds", 60L), eVar.a.getLong("fetch_timeout_in_seconds", 60L)), eVar, this.i);
    }
}
