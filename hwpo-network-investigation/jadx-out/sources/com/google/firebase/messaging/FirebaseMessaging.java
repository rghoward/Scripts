package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import com.intercom.twig.BuildConfig;
import defpackage.a78;
import defpackage.aq8;
import defpackage.bzb;
import defpackage.caa;
import defpackage.cn;
import defpackage.di7;
import defpackage.e04;
import defpackage.e5a;
import defpackage.fxa;
import defpackage.i47;
import defpackage.k5b;
import defpackage.l7a;
import defpackage.lm3;
import defpackage.m4a;
import defpackage.nn4;
import defpackage.nu6;
import defpackage.of8;
import defpackage.pf8;
import defpackage.q5d;
import defpackage.qy8;
import defpackage.r4d;
import defpackage.r50;
import defpackage.r9a;
import defpackage.s02;
import defpackage.si;
import defpackage.t04;
import defpackage.t9a;
import defpackage.tu6;
import defpackage.u8d;
import defpackage.uk7;
import defpackage.uu4;
import defpackage.w04;
import defpackage.yt3;
import io.ably.lib.rest.Auth;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {
    public static com.google.firebase.messaging.a k;
    public static of8<fxa> l = new uk7();
    public static ScheduledThreadPoolExecutor m;
    public final e04 a;
    public final w04 b;
    public final Context c;
    public final nn4 d;
    public final aq8 e;
    public final a f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;
    public final tu6 i;
    public boolean j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a {
        public final m4a a;
        public boolean b;
        public Boolean c;

        public a(m4a m4aVar) {
            this.a = m4aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [d14] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final synchronized boolean a() {
            try {
                synchronized (this) {
                    try {
                        if (!this.b) {
                            Boolean boolB = b();
                            this.c = boolB;
                            if (boolB == null) {
                                this.a.a(new lm3() { // from class: d14
                                    @Override // defpackage.lm3
                                    public final void a(fm3 fm3Var) {
                                        FirebaseMessaging.a aVar = this.a;
                                        if (aVar.a()) {
                                            FirebaseMessaging.this.k();
                                        }
                                    }
                                });
                            }
                            this.b = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return bool != null ? bool.booleanValue() : FirebaseMessaging.this.a.h();
            } catch (Throwable th2) {
                throw th2;
            }
            Boolean bool = this.c;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.a.h();
        }

        public final Boolean b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            e04 e04Var = FirebaseMessaging.this.a;
            e04Var.a();
            Context context = e04Var.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging() {
        throw null;
    }

    public FirebaseMessaging(e04 e04Var, w04 w04Var, of8<k5b> of8Var, of8<uu4> of8Var2, t04 t04Var, of8<fxa> of8Var3, m4a m4aVar) {
        e04Var.a();
        Context context = e04Var.a;
        final tu6 tu6Var = new tu6(context);
        final nn4 nn4Var = new nn4(e04Var, tu6Var, of8Var, of8Var2, t04Var);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new i47("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new i47("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i47("Firebase-Messaging-File-Io"));
        this.j = false;
        l = of8Var3;
        this.a = e04Var;
        this.b = w04Var;
        this.f = new a(m4aVar);
        e04Var.a();
        final Context context2 = e04Var.a;
        this.c = context2;
        yt3 yt3Var = new yt3();
        this.i = tu6Var;
        this.d = nn4Var;
        this.e = new aq8(executorServiceNewSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        e04Var.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(yt3Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (w04Var != null) {
            w04Var.d();
        }
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: x04
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging firebaseMessaging = this.t;
                if (firebaseMessaging.f.a()) {
                    firebaseMessaging.k();
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new i47("Firebase-Messaging-Topics-Io"));
        caa.c(scheduledThreadPoolExecutor2, new Callable() { // from class: qra
            @Override // java.util.concurrent.Callable
            public final Object call() {
                pra praVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                tu6 tu6Var2 = tu6Var;
                nn4 nn4Var2 = nn4Var;
                synchronized (pra.class) {
                    try {
                        WeakReference<pra> weakReference = pra.b;
                        pra praVar2 = weakReference != null ? weakReference.get() : null;
                        if (praVar2 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            praVar = new pra();
                            synchronized (praVar) {
                                praVar.a = lm9.a(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            pra.b = new WeakReference<>(praVar);
                        } else {
                            praVar = praVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new rra(firebaseMessaging, tu6Var2, praVar, nn4Var2, context3, scheduledThreadPoolExecutor3);
            }
        }).f(scheduledThreadPoolExecutor, new di7() { // from class: y04
            @Override // defpackage.di7
            public final void onSuccess(Object obj) {
                boolean z;
                rra rraVar = (rra) obj;
                if (!this.t.f.a() || rraVar.h.a() == null) {
                    return;
                }
                synchronized (rraVar) {
                    z = rraVar.g;
                }
                if (z) {
                    return;
                }
                rraVar.f(0L);
            }
        });
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: z04
            @Override // java.lang.Runnable
            public final void run() {
                q6d q6dVarD;
                int i;
                FirebaseMessaging firebaseMessaging = this.t;
                final Context context3 = firebaseMessaging.c;
                pf8.a(context3);
                nn4 nn4Var2 = firebaseMessaging.d;
                final boolean zJ = firebaseMessaging.j();
                if (Build.VERSION.SDK_INT >= 29) {
                    SharedPreferences sharedPreferencesA = rf8.a(context3);
                    if (!sharedPreferencesA.contains("proxy_retention") || sharedPreferencesA.getBoolean("proxy_retention", false) != zJ) {
                        qy8 qy8Var = nn4Var2.c;
                        if (qy8Var.c.a() >= 241100000) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("proxy_retention", zJ);
                            q5d q5dVarA = q5d.a(qy8Var.b);
                            synchronized (q5dVarA) {
                                i = q5dVarA.d;
                                q5dVarA.d = i + 1;
                            }
                            q6dVarD = q5dVarA.b(new t1d(i, 4, bundle));
                        } else {
                            q6dVarD = caa.d(new IOException("SERVICE_NOT_AVAILABLE"));
                        }
                        q6dVarD.f(new ql6(), new di7() { // from class: qf8
                            @Override // defpackage.di7
                            public final void onSuccess(Object obj) {
                                SharedPreferences.Editor editorEdit = rf8.a(context3).edit();
                                editorEdit.putBoolean("proxy_retention", zJ);
                                editorEdit.apply();
                            }
                        });
                    }
                }
                if (firebaseMessaging.j()) {
                    firebaseMessaging.i();
                }
            }
        });
    }

    public static void c(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (m == null) {
                    m = new ScheduledThreadPoolExecutor(1, new i47("TAG"));
                }
                m.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized FirebaseMessaging d() {
        return getInstance(e04.c());
    }

    public static synchronized com.google.firebase.messaging.a e(Context context) {
        try {
            if (k == null) {
                k = new com.google.firebase.messaging.a(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return k;
    }

    public static synchronized FirebaseMessaging getInstance(e04 e04Var) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) e04Var.b(FirebaseMessaging.class);
        a78.h(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() throws IOException {
        r9a r9aVarH;
        w04 w04Var = this.b;
        if (w04Var != null) {
            try {
                return (String) caa.a(w04Var.c());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final com.google.firebase.messaging.a.C0059a c0059aH = h();
        if (!m(c0059aH)) {
            return c0059aH.a;
        }
        final String strB = tu6.b(this.a);
        final aq8 aq8Var = this.e;
        synchronized (aq8Var) {
            r9aVarH = (r9a) aq8Var.b.get(strB);
            if (r9aVarH == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strB);
                }
                nn4 nn4Var = this.d;
                r9aVarH = nn4Var.a(nn4Var.c(tu6.b(nn4Var.a), Auth.WILDCARD_CLIENTID, new Bundle())).o(this.h, new e5a() { // from class: b14
                    @Override // defpackage.e5a
                    public final r9a b(Object obj) {
                        FirebaseMessaging firebaseMessaging = this.t;
                        String str = strB;
                        a.C0059a c0059a = c0059aH;
                        String str2 = (String) obj;
                        a aVarE = FirebaseMessaging.e(firebaseMessaging.c);
                        String strF = firebaseMessaging.f();
                        String strA = firebaseMessaging.i.a();
                        synchronized (aVarE) {
                            String strA2 = a.C0059a.a(str2, System.currentTimeMillis(), strA);
                            if (strA2 != null) {
                                SharedPreferences.Editor editorEdit = aVarE.a.edit();
                                editorEdit.putString(a.a(strF, str), strA2);
                                editorEdit.commit();
                            }
                        }
                        if (c0059a == null || !str2.equals(c0059a.a)) {
                            e04 e04Var = firebaseMessaging.a;
                            e04Var.a();
                            if ("[DEFAULT]".equals(e04Var.b)) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                                    e04Var.a();
                                    sb.append(e04Var.b);
                                    Log.d("FirebaseMessaging", sb.toString());
                                }
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", str2);
                                new wt3(firebaseMessaging.c).b(intent);
                            }
                        }
                        return caa.e(str2);
                    }
                }).h(aq8Var.a, new s02() { // from class: zp8
                    @Override // defpackage.s02
                    public final Object a(r9a r9aVar) {
                        aq8 aq8Var2 = aq8Var;
                        String str = strB;
                        synchronized (aq8Var2) {
                            aq8Var2.b.remove(str);
                        }
                        return r9aVar;
                    }
                });
                aq8Var.b.put(strB, r9aVarH);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strB);
            }
        }
        try {
            return (String) caa.a(r9aVarH);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public final void b() {
        if (this.b != null) {
            final t9a t9aVar = new t9a();
            this.g.execute(new Runnable() { // from class: c14
                @Override // java.lang.Runnable
                public final void run() {
                    t9a t9aVar2 = t9aVar;
                    FirebaseMessaging firebaseMessaging = this.t;
                    firebaseMessaging.getClass();
                    try {
                        w04 w04Var = firebaseMessaging.b;
                        tu6.b(firebaseMessaging.a);
                        w04Var.b();
                        t9aVar2.b(null);
                    } catch (Exception e) {
                        t9aVar2.a(e);
                    }
                }
            });
        } else if (h() == null) {
            caa.e(null);
        } else {
            Executors.newSingleThreadExecutor(new i47("Firebase-Messaging-Network-Io")).execute(new cn(1, this, new t9a()));
        }
    }

    public final String f() {
        e04 e04Var = this.a;
        e04Var.a();
        return "[DEFAULT]".equals(e04Var.b) ? BuildConfig.FLAVOR : e04Var.d();
    }

    public final r9a<String> g() {
        w04 w04Var = this.b;
        if (w04Var != null) {
            return w04Var.c();
        }
        t9a t9aVar = new t9a();
        this.g.execute(new r50(1, this, t9aVar));
        return t9aVar.a;
    }

    public final com.google.firebase.messaging.a.C0059a h() {
        com.google.firebase.messaging.a.C0059a c0059aB;
        com.google.firebase.messaging.a aVarE = e(this.c);
        String strF = f();
        String strB = tu6.b(this.a);
        synchronized (aVarE) {
            c0059aB = com.google.firebase.messaging.a.C0059a.b(aVarE.a.getString(com.google.firebase.messaging.a.a(strF, strB), null));
        }
        return c0059aB;
    }

    public final void i() {
        r9a r9aVarD;
        int i;
        qy8 qy8Var = this.d.c;
        if (qy8Var.c.a() >= 241100000) {
            q5d q5dVarA = q5d.a(qy8Var.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (q5dVarA) {
                i = q5dVarA.d;
                q5dVarA.d = i + 1;
            }
            r9aVarD = q5dVarA.b(new r4d(i, 5, bundle)).g(u8d.t, bzb.t);
        } else {
            r9aVarD = caa.d(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        r9aVarD.f(this.g, new di7() { // from class: a14
            @Override // defpackage.di7
            public final void onSuccess(Object obj) {
                jg1 jg1Var = (jg1) obj;
                if (jg1Var != null) {
                    nu6.b(jg1Var.t);
                    this.t.i();
                }
            }
        });
    }

    public final boolean j() {
        Context context = this.c;
        pf8.a(context);
        if (!pf8.b(context)) {
            return false;
        }
        if (this.a.b(si.class) != null) {
            return true;
        }
        return nu6.a() && l != null;
    }

    public final void k() {
        w04 w04Var = this.b;
        if (w04Var != null) {
            w04Var.a();
        } else if (m(h())) {
            synchronized (this) {
                if (!this.j) {
                    l(0L);
                }
            }
        }
    }

    public final synchronized void l(long j) {
        c(new l7a(this, Math.min(Math.max(30L, 2 * j), 28800L)), j);
        this.j = true;
    }

    public final boolean m(com.google.firebase.messaging.a.C0059a c0059a) {
        if (c0059a != null) {
            return System.currentTimeMillis() > c0059a.c + 604800000 || !this.i.a().equals(c0059a.b);
        }
        return true;
    }
}
