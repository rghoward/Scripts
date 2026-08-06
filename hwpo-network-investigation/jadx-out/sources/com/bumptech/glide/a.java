package com.bumptech.glide;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.a;
import defpackage.bj5;
import defpackage.cj5;
import defpackage.fr6;
import defpackage.hg3;
import defpackage.hh6;
import defpackage.hx1;
import defpackage.kf6;
import defpackage.kq8;
import defpackage.l6b;
import defpackage.lf6;
import defpackage.lq8;
import defpackage.m20;
import defpackage.mq8;
import defpackage.o30;
import defpackage.ov9;
import defpackage.pf6;
import defpackage.pq2;
import defpackage.qq0;
import defpackage.rq0;
import defpackage.rwa;
import defpackage.sm4;
import defpackage.tl8;
import defpackage.tm4;
import defpackage.um4;
import defpackage.v00;
import defpackage.vm4;
import defpackage.z90;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a A;
    public static volatile boolean B;
    public final qq0 t;
    public final pf6 u;
    public final c v;
    public final o30 w;
    public final mq8 x;
    public final hx1 y;
    public final ArrayList z = new ArrayList();

    /* JADX INFO: renamed from: com.bumptech.glide.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface InterfaceC0045a {
    }

    public a(Context context, hg3 hg3Var, pf6 pf6Var, qq0 qq0Var, o30 o30Var, mq8 mq8Var, hx1 hx1Var, int i, InterfaceC0045a interfaceC0045a, Map<Class<?>, rwa<?, ?>> map, List<kq8<Object>> list, List<tm4> list2, v00 v00Var, d dVar) {
        new um4(new vm4() { // from class: pm4
            @Override // defpackage.vm4
            public final Object get() {
                return new a.b();
            }
        });
        this.t = qq0Var;
        this.w = o30Var;
        this.u = pf6Var;
        this.x = mq8Var;
        this.y = hx1Var;
        this.v = new c(context, o30Var, new tl8(this, list2, v00Var), new m20(), interfaceC0045a, map, list, hg3Var, dVar, i);
    }

    public static a a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (A == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (a.class) {
                if (A == null) {
                    if (B) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    B = true;
                    try {
                        b(context, generatedAppGlideModule);
                        B = false;
                    } catch (Throwable th) {
                        B = false;
                        throw th;
                    }
                }
            }
        }
        return A;
    }

    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        List list;
        com.bumptech.glide.b bVar = new com.bumptech.glide.b();
        Context applicationContext = context.getApplicationContext();
        List list2 = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || !(generatedAppGlideModule instanceof GeneratedAppGlideModuleImpl)) {
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(hh6.a(str));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + str);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                } else if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
            } catch (PackageManager.NameNotFoundException e) {
                if (Log.isLoggable("ManifestParser", 6)) {
                    Log.e("ManifestParser", "Failed to parse glide modules", e);
                }
            }
            list = arrayList;
        } else {
            list = list2;
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tm4 tm4Var = (tm4) it.next();
                if (hashSet.contains(tm4Var.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + tm4Var);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + ((tm4) it2.next()).getClass());
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((tm4) it3.next()).a(applicationContext, bVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, bVar);
        }
        if (bVar.g == null) {
            sm4.a aVar = new sm4.a();
            if (sm4.u == 0) {
                sm4.u = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i = sm4.u;
            if (TextUtils.isEmpty("source")) {
                z90.a("Name must be non-null and non-empty, but given: source");
                return;
            }
            bVar.g = new sm4(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new sm4.b(aVar, "source", false)));
        }
        if (bVar.h == null) {
            sm4.a aVar2 = new sm4.a();
            if (TextUtils.isEmpty("disk-cache")) {
                z90.a("Name must be non-null and non-empty, but given: disk-cache");
                return;
            }
            bVar.h = new sm4(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new sm4.b(aVar2, "disk-cache", true)));
        }
        if (bVar.n == null) {
            if (sm4.u == 0) {
                sm4.u = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i2 = sm4.u >= 4 ? 2 : 1;
            sm4.a aVar3 = new sm4.a();
            if (TextUtils.isEmpty("animation")) {
                z90.a("Name must be non-null and non-empty, but given: animation");
                return;
            }
            bVar.n = new sm4(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new sm4.b(aVar3, "animation", true)));
        }
        if (bVar.j == null) {
            bVar.j = new fr6(new fr6.a(applicationContext));
        }
        if (bVar.k == null) {
            bVar.k = new pq2();
        }
        if (bVar.d == null) {
            int i3 = bVar.j.a;
            if (i3 > 0) {
                bVar.d = new lf6(i3);
            } else {
                bVar.d = new rq0();
            }
        }
        if (bVar.e == null) {
            bVar.e = new kf6(bVar.j.c);
        }
        if (bVar.f == null) {
            bVar.f = new pf6(bVar.j.b);
        }
        if (bVar.i == null) {
            bVar.i = new cj5(new bj5(applicationContext));
        }
        if (bVar.c == null) {
            bVar.c = new hg3(bVar.f, bVar.i, bVar.h, bVar.g, new sm4(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10000L, TimeUnit.MILLISECONDS, new SynchronousQueue(), new sm4.b(new sm4.a(), "source-unlimited", false))), bVar.n);
        }
        List<kq8<Object>> list3 = bVar.o;
        if (list3 == null) {
            bVar.o = Collections.EMPTY_LIST;
        } else {
            bVar.o = Collections.unmodifiableList(list3);
        }
        d.a aVar4 = bVar.b;
        aVar4.getClass();
        a aVar5 = new a(applicationContext, bVar.c, bVar.f, bVar.d, bVar.e, new mq8(), bVar.k, bVar.l, bVar.m, bVar.a, bVar.o, list, generatedAppGlideModule, new d(aVar4));
        applicationContext.registerComponentCallbacks(aVar5);
        A = aVar5;
    }

    public static lq8 c(Context context) {
        ov9.d(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).x.b(context);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        l6b.a();
        this.u.e(0L);
        this.t.b();
        this.w.b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        l6b.a();
        synchronized (this.z) {
            try {
                ArrayList arrayList = this.z;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((lq8) obj).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pf6 pf6Var = this.u;
        pf6Var.getClass();
        if (i >= 40) {
            pf6Var.e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (pf6Var) {
                j = pf6Var.b;
            }
            pf6Var.e(j / 2);
        }
        this.t.a(i);
        this.w.a(i);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
