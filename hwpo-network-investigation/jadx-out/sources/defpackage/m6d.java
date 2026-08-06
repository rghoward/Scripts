package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m6d {
    public static final AtomicReference a;
    public static final ta1 b;
    public static final WeakHashMap c;
    public static final l6d d;

    static {
        q95.o(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        a = new AtomicReference(wl8.C);
        b = new ta1();
        c = new WeakHashMap();
        d = new l6d();
        new ArrayDeque();
        new ArrayDeque();
    }

    public static i7d a() {
        h7d h7dVarC = c();
        i7d i7dVar = h7dVarC.b;
        if (i7dVar != null && i7dVar != x6d.z) {
            return i7dVar;
        }
        f6d f6dVar = u6d.z;
        UUID uuidB = n6d.c.b();
        String strH = d6d.h(uuidB);
        q95 q95Var = (q95) a.get();
        if (!q95Var.isEmpty()) {
            q95Var.forEach(new t6d());
        }
        return new u6d(uuidB, strH, u6d.z, h7dVarC);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    public static i7d b(h7d h7dVar, i7d i7dVar) {
        boolean zA;
        h7dVar.getClass();
        i7d i7dVar2 = h7dVar.b;
        if (i7dVar2 != i7dVar) {
            if (i7dVar2 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    zA = Trace.isEnabled();
                } else {
                    zA = b2d.a.a(b);
                }
                h7dVar.a = zA;
            }
            if (h7dVar.a) {
                if (i7dVar2 != null) {
                    if (i7dVar != null) {
                        if (i7dVar2.b() == i7dVar && i7dVar2.a() == Thread.currentThread()) {
                            Trace.endSection();
                        } else if (i7dVar2 == i7dVar.b() && i7dVar.a() == Thread.currentThread()) {
                            md6.l(i7dVar);
                        }
                    }
                    md6.k(i7dVar2);
                    if (i7dVar != null) {
                        md6.j(i7dVar);
                    }
                } else if (i7dVar != null) {
                    md6.j(i7dVar);
                }
            }
            if (i7dVar2 != i7dVar) {
                h7dVar.b = i7dVar;
                return i7dVar2;
            }
        }
        return i7dVar;
    }

    public static h7d c() {
        return (h7d) d.get();
    }
}
