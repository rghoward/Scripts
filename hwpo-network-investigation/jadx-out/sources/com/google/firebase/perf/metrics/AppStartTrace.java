package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import defpackage.al;
import defpackage.b34;
import defpackage.c34;
import defpackage.dp;
import defpackage.e04;
import defpackage.ga8;
import defpackage.hv7;
import defpackage.l76;
import defpackage.oh7;
import defpackage.oxa;
import defpackage.qh7;
import defpackage.rk7;
import defpackage.rv1;
import defpackage.s66;
import defpackage.w68;
import defpackage.wz9;
import defpackage.xv1;
import defpackage.zoa;
import defpackage.zra;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, l76 {
    public static final zoa P = new zoa();
    public static final long Q = 60000000;
    public static final long R = 50000;
    public static volatile AppStartTrace S;
    public static ThreadPoolExecutor T;
    public final zoa A;
    public hv7 K;
    public final oxa u;
    public final rv1 v;
    public final zra.a w;
    public Application x;
    public final zoa z;
    public boolean t = false;
    public boolean y = false;
    public zoa B = null;
    public zoa C = null;
    public zoa D = null;
    public zoa E = null;
    public zoa F = null;
    public zoa G = null;
    public zoa H = null;
    public zoa I = null;
    public zoa J = null;
    public boolean L = false;
    public int M = 0;
    public final a N = new a();
    public boolean O = false;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements ViewTreeObserver.OnDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            AppStartTrace.this.M++;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements Runnable {
        public final AppStartTrace t;

        public b(AppStartTrace appStartTrace) {
            this.t = appStartTrace;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppStartTrace appStartTrace = this.t;
            if (appStartTrace.B == null) {
                appStartTrace.C = new zoa();
            }
        }
    }

    public AppStartTrace(oxa oxaVar, oh7 oh7Var, rv1 rv1Var, ThreadPoolExecutor threadPoolExecutor) {
        zoa zoaVar = null;
        this.u = oxaVar;
        this.v = rv1Var;
        T = threadPoolExecutor;
        zra.a aVarR = zra.R();
        aVarR.s("_experiment_app_start_ttid");
        this.w = aVarR;
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(startElapsedRealtime);
        this.z = new zoa((micros - (SystemClock.elapsedRealtimeNanos() / 1000)) + timeUnit.toMicros(System.currentTimeMillis()), micros);
        wz9 wz9Var = (wz9) e04.c().b(wz9.class);
        if (wz9Var != null) {
            long micros2 = timeUnit.toMicros(wz9Var.a());
            zoaVar = new zoa((micros2 - (SystemClock.elapsedRealtimeNanos() / 1000)) + timeUnit.toMicros(System.currentTimeMillis()), micros2);
        }
        this.A = zoaVar;
    }

    public static boolean c(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = application.getPackageName();
        String strD = al.d(packageName, ":");
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(strD))) {
                return true;
            }
        }
        return false;
    }

    public final zoa a() {
        zoa zoaVar = this.A;
        return zoaVar != null ? zoaVar : P;
    }

    public final zoa b() {
        zoa zoaVar = this.z;
        return zoaVar != null ? zoaVar : a();
    }

    public final void d(final zra.a aVar) {
        if (this.H == null || this.I == null || this.J == null) {
            return;
        }
        T.execute(new Runnable() { // from class: e20
            @Override // java.lang.Runnable
            public final void run() {
                this.t.u.c(aVar.l(), o20.FOREGROUND_BACKGROUND);
            }
        });
        e();
    }

    public final synchronized void e() {
        if (this.t) {
            ga8.B.y.c(this);
            this.x.unregisterActivityLifecycleCallbacks(this);
            this.t = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            zoa zoaVar = this.C;
            if (zoaVar != null) {
                if (Build.VERSION.SDK_INT < 34 || zoaVar.a() > R) {
                    this.L = true;
                }
                this.C = null;
            }
            if (!this.L && this.B == null) {
                this.O = this.O || c(this.x);
                new WeakReference(activity);
                this.B = new zoa();
                if (b().b(this.B) > Q) {
                    this.y = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.L || this.y) {
            return;
        }
        rv1 rv1Var = this.v;
        rv1Var.getClass();
        rk7<Boolean> rk7VarG = rv1Var.g(xv1.h1());
        if ((rk7VarG.b() ? rk7VarG.a().booleanValue() : false) && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
            viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.N);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [a20] */
    /* JADX WARN: Type inference failed for: r3v5, types: [b20] */
    /* JADX WARN: Type inference failed for: r4v3, types: [c20] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.L && !this.y) {
                rv1 rv1Var = this.v;
                rv1Var.getClass();
                rk7<Boolean> rk7VarG = rv1Var.g(xv1.h1());
                boolean zBooleanValue = rk7VarG.b() ? rk7VarG.a().booleanValue() : false;
                if (zBooleanValue && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.N);
                    c34 c34Var = new c34(viewFindViewById, new Runnable() { // from class: a20
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace appStartTrace = this.t;
                            zra.a aVar = appStartTrace.w;
                            if (appStartTrace.J != null) {
                                return;
                            }
                            appStartTrace.J = new zoa();
                            zra.a aVarR = zra.R();
                            aVarR.s("_experiment_onDrawFoQ");
                            aVarR.q(appStartTrace.b().t);
                            aVarR.r(appStartTrace.b().b(appStartTrace.J));
                            aVar.o(aVarR.l());
                            if (appStartTrace.z != null) {
                                zra.a aVarR2 = zra.R();
                                aVarR2.s("_experiment_procStart_to_classLoad");
                                aVarR2.q(appStartTrace.b().t);
                                aVarR2.r(appStartTrace.b().b(appStartTrace.a()));
                                aVar.o(aVarR2.l());
                            }
                            String str = appStartTrace.O ? "true" : "false";
                            aVar.n();
                            zra.C((zra) aVar.u).put("systemDeterminedForeground", str);
                            aVar.p(appStartTrace.M, "onDrawCount");
                            iv7 iv7VarA = appStartTrace.K.a();
                            aVar.n();
                            zra.D((zra) aVar.u, iv7VarA);
                            appStartTrace.d(aVar);
                        }
                    });
                    if (Build.VERSION.SDK_INT >= 26 || (viewFindViewById.getViewTreeObserver().isAlive() && viewFindViewById.isAttachedToWindow())) {
                        viewFindViewById.getViewTreeObserver().addOnDrawListener(c34Var);
                    } else {
                        viewFindViewById.addOnAttachStateChangeListener(new b34(c34Var));
                    }
                    viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new w68(viewFindViewById, new Runnable() { // from class: b20
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace appStartTrace = this.t;
                            zra.a aVar = appStartTrace.w;
                            if (appStartTrace.H != null) {
                                return;
                            }
                            appStartTrace.H = new zoa();
                            aVar.q(appStartTrace.b().t);
                            aVar.r(appStartTrace.b().b(appStartTrace.H));
                            appStartTrace.d(aVar);
                        }
                    }, new Runnable() { // from class: c20
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppStartTrace appStartTrace = this.t;
                            zra.a aVar = appStartTrace.w;
                            if (appStartTrace.I != null) {
                                return;
                            }
                            appStartTrace.I = new zoa();
                            zra.a aVarR = zra.R();
                            aVarR.s("_experiment_preDrawFoQ");
                            aVarR.q(appStartTrace.b().t);
                            aVarR.r(appStartTrace.b().b(appStartTrace.I));
                            aVar.o(aVarR.l());
                            appStartTrace.d(aVar);
                        }
                    }));
                }
                if (this.E != null) {
                    return;
                }
                new WeakReference(activity);
                this.E = new zoa();
                this.K = SessionManager.getInstance().perfSession();
                dp.d().a("onResume(): " + activity.getClass().getName() + ": " + a().b(this.E) + " microseconds");
                T.execute(new Runnable() { // from class: d20
                    @Override // java.lang.Runnable
                    public final void run() {
                        zoa zoaVar = AppStartTrace.P;
                        zra.a aVarR = zra.R();
                        aVarR.s("_as");
                        AppStartTrace appStartTrace = this.t;
                        aVarR.q(appStartTrace.a().t);
                        aVarR.r(appStartTrace.a().b(appStartTrace.E));
                        ArrayList arrayList = new ArrayList(3);
                        zra.a aVarR2 = zra.R();
                        aVarR2.s("_astui");
                        aVarR2.q(appStartTrace.a().t);
                        aVarR2.r(appStartTrace.a().b(appStartTrace.B));
                        arrayList.add(aVarR2.l());
                        if (appStartTrace.D != null) {
                            zra.a aVarR3 = zra.R();
                            aVarR3.s("_astfd");
                            aVarR3.q(appStartTrace.B.t);
                            aVarR3.r(appStartTrace.B.b(appStartTrace.D));
                            arrayList.add(aVarR3.l());
                            zra.a aVarR4 = zra.R();
                            aVarR4.s("_asti");
                            aVarR4.q(appStartTrace.D.t);
                            aVarR4.r(appStartTrace.D.b(appStartTrace.E));
                            arrayList.add(aVarR4.l());
                        }
                        aVarR.n();
                        zra.B((zra) aVarR.u, arrayList);
                        iv7 iv7VarA = appStartTrace.K.a();
                        aVarR.n();
                        zra.D((zra) aVarR.u, iv7VarA);
                        appStartTrace.u.c(aVarR.l(), o20.FOREGROUND_BACKGROUND);
                    }
                });
                if (!zBooleanValue) {
                    e();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.L && this.D == null && !this.y) {
            this.D = new zoa();
        }
    }

    @qh7(s66.a.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.L || this.y || this.G != null) {
            return;
        }
        this.G = new zoa();
        zra.a aVarR = zra.R();
        aVarR.s("_experiment_firstBackgrounding");
        aVarR.q(b().t);
        aVarR.r(b().b(this.G));
        this.w.o(aVarR.l());
    }

    @qh7(s66.a.ON_START)
    public void onAppEnteredForeground() {
        if (this.L || this.y || this.F != null) {
            return;
        }
        this.F = new zoa();
        zra.a aVarR = zra.R();
        aVarR.s("_experiment_firstForegrounding");
        aVarR.q(b().t);
        aVarR.r(b().b(this.F));
        this.w.o(aVarR.l());
    }

    public static void setLauncherActivityOnCreateTime(String str) {
    }

    public static void setLauncherActivityOnResumeTime(String str) {
    }

    public static void setLauncherActivityOnStartTime(String str) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
