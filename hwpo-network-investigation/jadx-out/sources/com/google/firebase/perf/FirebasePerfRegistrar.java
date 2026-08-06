package com.google.firebase.perf;

import android.app.Application;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import defpackage.ay2;
import defpackage.c4;
import defpackage.e04;
import defpackage.f20;
import defpackage.fg8;
import defpackage.fxa;
import defpackage.ga8;
import defpackage.i14;
import defpackage.j43;
import defpackage.kq1;
import defpackage.n14;
import defpackage.o14;
import defpackage.o1b;
import defpackage.oh7;
import defpackage.oxa;
import defpackage.p14;
import defpackage.q14;
import defpackage.qp1;
import defpackage.qq1;
import defpackage.r14;
import defpackage.r66;
import defpackage.r6b;
import defpackage.rv1;
import defpackage.s14;
import defpackage.sm8;
import defpackage.t04;
import defpackage.t14;
import defpackage.u14;
import defpackage.v14;
import defpackage.w14;
import defpackage.wz9;
import defpackage.x14;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static i14 lambda$getComponents$0(fg8 fg8Var, kq1 kq1Var) {
        AppStartTrace appStartTrace;
        e04 e04Var = (e04) kq1Var.a(e04.class);
        wz9 wz9Var = (wz9) kq1Var.c(wz9.class).get();
        Executor executor = (Executor) kq1Var.g(fg8Var);
        i14 i14Var = new i14();
        e04Var.a();
        Context context = e04Var.a;
        rv1 rv1VarE = rv1.e();
        rv1VarE.getClass();
        rv1.d.b = r6b.a(context);
        rv1VarE.c.c(context);
        f20 f20VarA = f20.a();
        synchronized (f20VarA) {
            if (!f20VarA.I) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(f20VarA);
                    f20VarA.I = true;
                }
            }
        }
        o14 o14Var = new o14();
        synchronized (f20VarA.z) {
            f20VarA.z.add(o14Var);
        }
        if (wz9Var != null) {
            if (AppStartTrace.S != null) {
                appStartTrace = AppStartTrace.S;
            } else {
                oxa oxaVar = oxa.L;
                oh7 oh7Var = new oh7();
                if (AppStartTrace.S == null) {
                    synchronized (AppStartTrace.class) {
                        try {
                            if (AppStartTrace.S == null) {
                                AppStartTrace.S = new AppStartTrace(oxaVar, oh7Var, rv1.e(), new ThreadPoolExecutor(0, 1, 10 + AppStartTrace.Q, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                appStartTrace = AppStartTrace.S;
            }
            synchronized (appStartTrace) {
                if (!appStartTrace.t) {
                    ga8.B.y.a(appStartTrace);
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 instanceof Application) {
                        ((Application) applicationContext2).registerActivityLifecycleCallbacks(appStartTrace);
                        appStartTrace.O = appStartTrace.O || AppStartTrace.c((Application) applicationContext2);
                        appStartTrace.t = true;
                        appStartTrace.x = (Application) applicationContext2;
                    }
                }
            }
            executor.execute(new AppStartTrace.b(appStartTrace));
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return i14Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static n14 providesFirebasePerformance(kq1 kq1Var) {
        kq1Var.a(i14.class);
        p14 p14Var = new p14((e04) kq1Var.a(e04.class), (t04) kq1Var.a(t04.class), kq1Var.c(sm8.class), kq1Var.c(fxa.class));
        return (n14) j43.a(new x14(new r14(p14Var), new t14(p14Var), new s14(p14Var), new w14(p14Var), new u14(), new q14(), new v14())).get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qp1<?>> getComponents() {
        final fg8 fg8Var = new fg8(o1b.class, Executor.class);
        qp1.a aVarB = qp1.b(n14.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(ay2.c(e04.class));
        aVarB.a(new ay2(1, 1, sm8.class));
        aVarB.a(ay2.c(t04.class));
        aVarB.a(new ay2(1, 1, fxa.class));
        aVarB.a(ay2.c(i14.class));
        aVarB.f = new c4();
        qp1 qp1VarB = aVarB.b();
        qp1.a aVarB2 = qp1.b(i14.class);
        aVarB2.a = EARLY_LIBRARY_NAME;
        aVarB2.a(ay2.c(e04.class));
        aVarB2.a(ay2.a(wz9.class));
        aVarB2.a(new ay2((fg8<?>) fg8Var, 1, 0));
        aVarB2.c(2);
        aVarB2.f = new qq1() { // from class: l14
            @Override // defpackage.qq1
            public final Object a(xu8 xu8Var) {
                return FirebasePerfRegistrar.lambda$getComponents$0(fg8Var, xu8Var);
            }
        };
        return Arrays.asList(qp1VarB, aVarB2.b(), r66.a(LIBRARY_NAME, "22.0.5"));
    }
}
