package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.intercom.twig.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n14 {
    public static final dp e = dp.d();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final of8<sm8> b;
    public final t04 c;
    public final of8<fxa> d;

    public n14(e04 e04Var, of8<sm8> of8Var, t04 t04Var, of8<fxa> of8Var2, RemoteConfigManager remoteConfigManager, rv1 rv1Var, SessionManager sessionManager) {
        Bundle bundle;
        this.b = of8Var;
        this.c = t04Var;
        this.d = of8Var2;
        if (e04Var == null) {
            new a95(new Bundle());
            return;
        }
        g14 g14Var = e04Var.c;
        final oxa oxaVar = oxa.L;
        oxaVar.w = e04Var;
        e04Var.a();
        oxaVar.I = g14Var.g;
        oxaVar.y = t04Var;
        oxaVar.z = of8Var2;
        oxaVar.B.execute(new Runnable() { // from class: nxa
            @Override // java.lang.Runnable
            public final void run() {
                zv1 zv1Var;
                String strA;
                oxa oxaVar2 = oxaVar;
                e04 e04Var2 = oxaVar2.w;
                e04Var2.a();
                Context context = e04Var2.a;
                oxaVar2.C = context;
                oxaVar2.H = context.getPackageName();
                oxaVar2.D = rv1.e();
                oxaVar2.E = new wh8(oxaVar2.C, new vh8(100L, 1L, TimeUnit.MINUTES));
                oxaVar2.F = f20.a();
                of8<fxa> of8Var3 = oxaVar2.z;
                rv1 rv1Var2 = oxaVar2.D;
                rv1Var2.getClass();
                zv1 zv1Var2 = zv1.x;
                synchronized (zv1.class) {
                    try {
                        if (zv1.x == null) {
                            zv1.x = new zv1();
                        }
                        zv1Var = zv1.x;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                zv1Var.getClass();
                Long l = (Long) rv1Var2.a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
                l.getClass();
                Map<Long, String> map = zv1.y;
                if (!map.containsKey(l) || (strA = map.get(l)) == null) {
                    rk7<String> rk7VarD = rv1Var2.d(zv1Var);
                    strA = rk7VarD.b() ? rk7VarD.a() : "FIREPERF";
                } else {
                    rv1Var2.c.f("com.google.firebase.perf.LogSourceName", strA);
                }
                oxaVar2.A = new f44(of8Var3, strA);
                ConcurrentLinkedQueue<bv7> concurrentLinkedQueue = oxaVar2.u;
                f20 f20Var = oxaVar2.F;
                WeakReference weakReference = new WeakReference(oxa.L);
                synchronized (f20Var.y) {
                    f20Var.y.add(weakReference);
                }
                k20.a aVarJ = k20.J();
                oxaVar2.G = aVarJ;
                e04 e04Var3 = oxaVar2.w;
                e04Var3.a();
                String str = e04Var3.c.b;
                aVarJ.n();
                k20.y((k20) aVarJ.u, str);
                gk.a aVarE = gk.E();
                String str2 = oxaVar2.H;
                aVarE.n();
                gk.y((gk) aVarE.u, str2);
                aVarE.n();
                gk.z((gk) aVarE.u);
                Context context2 = oxaVar2.C;
                String str3 = BuildConfig.FLAVOR;
                try {
                    String str4 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str4 != null) {
                        str3 = str4;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                aVarE.n();
                gk.A((gk) aVarE.u, str3);
                aVarJ.n();
                k20.C((k20) aVarJ.u, aVarE.l());
                int i = 1;
                oxaVar2.v.set(true);
                while (!concurrentLinkedQueue.isEmpty()) {
                    bv7 bv7VarPoll = concurrentLinkedQueue.poll();
                    if (bv7VarPoll != null) {
                        oxaVar2.B.execute(new op6(i, oxaVar2, bv7VarPoll));
                    }
                }
            }
        });
        e04Var.a();
        Context context = e04Var.a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            Log.d("isEnabled", "No perf enable meta data found " + e2.getMessage());
            bundle = null;
        }
        a95 a95Var = bundle != null ? new a95(bundle) : new a95();
        remoteConfigManager.setFirebaseRemoteConfigProvider(of8Var);
        rv1Var.b = a95Var;
        rv1.d.b = r6b.a(context);
        rv1Var.c.c(context);
        sessionManager.setApplicationContext(context);
        Boolean boolF = rv1Var.f();
        dp dpVar = e;
        if (dpVar.b) {
            if (boolF != null ? boolF.booleanValue() : e04.c().h()) {
                e04Var.a();
                String strConcat = "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(mx1.b(g14Var.g, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (dpVar.b) {
                    dpVar.a.getClass();
                    Log.i("FirebasePerformance", strConcat);
                }
            }
        }
    }
}
