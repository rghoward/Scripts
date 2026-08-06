package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ym0 {
    public static final y0a a = new y0a(new wm0());
    public static Boolean b;

    public static final void a(final iw iwVar, final wja wjaVar, final qa4.a aVar, final List list, jt1 jt1Var) {
        Executor executor = (Executor) jt1Var.F(a);
        if (executor == null || !b(iwVar.u.length())) {
            jt1Var.K(-517090505);
            jt1Var.B();
            return;
        }
        jt1Var.K(-518737659);
        final tq5 tq5Var = (tq5) jt1Var.F(qu1.n);
        final tx2 tx2Var = (tx2) jt1Var.F(qu1.h);
        try {
            executor.execute(new Runnable() { // from class: vm0
                @Override // java.lang.Runnable
                public final void run() {
                    g37 g37VarC;
                    wja wjaVar2 = wjaVar;
                    tq5 tq5Var2 = tq5Var;
                    iw iwVar2 = iwVar;
                    tx2 tx2Var2 = tx2Var;
                    qa4.a aVar2 = aVar;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        hu9 hu9VarJ = qu9.j();
                        g37 g37Var = hu9VarJ instanceof g37 ? (g37) hu9VarJ : null;
                        if (g37Var == null || (g37VarC = g37Var.C(null, null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            hu9 hu9VarJ2 = g37VarC.j();
                            try {
                                wja wjaVarD = zu1.d(wjaVar2, tq5Var2);
                                List list2 = list;
                                if (list2 == null) {
                                    list2 = hf3.t;
                                }
                                m07 m07Var = new m07(iwVar2, wjaVarD, list2, tx2Var2, aVar2);
                                m07Var.c();
                                m07Var.b();
                                g2b g2bVar = g2b.a;
                                hu9.q(hu9VarJ2);
                                g37VarC.w().a();
                                g37VarC.c();
                                Trace.endSection();
                            } catch (Throwable th) {
                                hu9.q(hu9VarJ2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                g37VarC.c();
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        jt1Var.B();
    }

    public static final boolean b(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            if (b == null) {
                b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = b;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
