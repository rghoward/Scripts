package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e04 {
    public static final Object k = new Object();
    public static final n30 l = new n30();
    public final Context a;
    public final String b;
    public final g14 c;
    public final ar1 d;
    public final ts5<te2> g;
    public final of8<lr2> h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        void a(boolean z);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements di0.a {
        public static final AtomicReference<b> a = new AtomicReference<>();

        @Override // di0.a
        public final void a(boolean z) {
            synchronized (e04.k) {
                try {
                    ArrayList arrayList = new ArrayList(e04.l.values());
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        e04 e04Var = (e04) obj;
                        if (e04Var.e.get()) {
                            Log.d("FirebaseApp", "Notifying background state change listeners.");
                            Iterator it = e04Var.i.iterator();
                            while (it.hasNext()) {
                                ((a) it.next()).a(z);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c extends BroadcastReceiver {
        public static final AtomicReference<c> b = new AtomicReference<>();
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (e04.k) {
                try {
                    Iterator it = ((n30.e) e04.l.values()).iterator();
                    while (it.hasNext()) {
                        ((e04) it.next()).e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.a.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public e04(g14 g14Var, final Context context, String str) {
        ?? arrayList;
        this.a = context;
        a78.d(str);
        this.b = str;
        this.c = g14Var;
        ye0 ye0Var = FirebaseInitProvider.t;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        for (final String str3 : arrayList) {
            arrayList2.add(new of8() { // from class: pq1
                @Override // defpackage.of8
                public final Object get() {
                    String str4 = str3;
                    try {
                        Class<?> cls = Class.forName(str4);
                        if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                            return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                        }
                        throw new hk5("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                    } catch (ClassNotFoundException unused2) {
                        Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                        return null;
                    } catch (IllegalAccessException e) {
                        throw new hk5(sk0.c("Could not instantiate ", str4, "."), e);
                    } catch (InstantiationException e2) {
                        throw new hk5(sk0.c("Could not instantiate ", str4, "."), e2);
                    } catch (NoSuchMethodException e3) {
                        throw new hk5(ct1.a("Could not instantiate ", str4), e3);
                    } catch (InvocationTargetException e4) {
                        throw new hk5(ct1.a("Could not instantiate ", str4), e4);
                    }
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        m1b m1bVar = m1b.t;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        arrayList3.add(new of8() { // from class: zq1
            @Override // defpackage.of8
            public final Object get() {
                return firebaseCommonRegistrar;
            }
        });
        final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
        arrayList3.add(new of8() { // from class: zq1
            @Override // defpackage.of8
            public final Object get() {
                return executorsRegistrar;
            }
        });
        arrayList4.add(qp1.c(context, Context.class, new Class[0]));
        arrayList4.add(qp1.c(this, e04.class, new Class[0]));
        arrayList4.add(qp1.c(g14Var, g14.class, new Class[0]));
        tq1 tq1Var = new tq1();
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.u.get()) {
            arrayList4.add(qp1.c(ye0Var, wz9.class, new Class[0]));
        }
        ar1 ar1Var = new ar1(arrayList3, arrayList4, tq1Var);
        this.d = ar1Var;
        Trace.endSection();
        this.g = new ts5<>(new of8() { // from class: c04
            @Override // defpackage.of8
            public final Object get() {
                e04 e04Var = this.a;
                return new te2(context, e04Var.d(), (wf8) e04Var.d.a(wf8.class));
            }
        });
        this.h = ar1Var.c(lr2.class);
        a aVar = new a() { // from class: d04
            @Override // e04.a
            public final void a(boolean z) {
                if (z) {
                    return;
                }
                this.a.h.get().c();
            }
        };
        a();
        if (this.e.get()) {
            di0.x.t.get();
        }
        this.i.add(aVar);
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e04 c() {
        e04 e04Var;
        synchronized (k) {
            try {
                e04Var = (e04) l.get("[DEFAULT]");
                if (e04Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + na8.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                e04Var.h.get().c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return e04Var;
    }

    public static e04 f(g14 g14Var, Context context, String str) {
        e04 e04Var;
        AtomicReference<b> atomicReference = b.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<b> atomicReference2 = b.a;
            if (atomicReference2.get() == null) {
                b bVar = new b();
                do {
                    if (atomicReference2.compareAndSet(null, bVar)) {
                        di0.b(application);
                        di0.x.a(bVar);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            n30 n30Var = l;
            a78.i("FirebaseApp name " + strTrim + " already exists!", !n30Var.containsKey(strTrim));
            a78.h(context, "Application context cannot be null.");
            e04Var = new e04(g14Var, context, strTrim);
            n30Var.put(strTrim, e04Var);
        }
        e04Var.e();
        return e04Var;
    }

    public static e04 g(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return c();
                }
                g14 g14VarA = g14.a(context);
                if (g14VarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(g14VarA, context, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        a78.i("FirebaseApp was deleted", !this.f.get());
    }

    public final <T> T b(Class<T> cls) {
        a();
        return (T) this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void e() {
        HashMap map;
        if (!((UserManager) this.a.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.a;
            AtomicReference<c> atomicReference = c.b;
            if (atomicReference.get() == null) {
                c cVar = new c(context);
                while (!atomicReference.compareAndSet(null, cVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.b);
        Log.i("FirebaseApp", sb2.toString());
        ar1 ar1Var = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.b);
        AtomicReference<Boolean> atomicReference2 = ar1Var.f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                this.h.get().c();
            }
        }
        synchronized (ar1Var) {
            map = new HashMap(ar1Var.a);
        }
        ar1Var.h(map, zEquals);
        this.h.get().c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e04)) {
            return false;
        }
        e04 e04Var = (e04) obj;
        e04Var.a();
        return this.b.equals(e04Var.b);
    }

    public final boolean h() {
        boolean z;
        a();
        te2 te2Var = this.g.get();
        synchronized (te2Var) {
            z = te2Var.b;
        }
        return z;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        te7.a aVar = new te7.a(this);
        aVar.a(this.b, "name");
        aVar.a(this.c, "options");
        return aVar.toString();
    }
}
