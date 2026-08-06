package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class sd implements jac {
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ sd u = new sd();

    public static gl5 b() {
        return new gl5(null);
    }

    public static final void c(h72 h72Var, CancellationException cancellationException) {
        el5 el5Var = (el5) h72Var.d0(el5.a.t);
        if (el5Var != null) {
            el5Var.k(cancellationException);
        }
    }

    public static final void d(h72 h72Var) {
        el5 el5Var = (el5) h72Var.d0(el5.a.t);
        if (el5Var != null && !el5Var.h()) {
            throw el5Var.H();
        }
    }

    public static final el5 e(h72 h72Var) {
        el5 el5Var = (el5) h72Var.d0(el5.a.t);
        if (el5Var != null) {
            return el5Var;
        }
        tn2.d(h72Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final void f(h72 h72Var, Throwable th) {
        Throwable runtimeException;
        Iterator it = p72.a.iterator();
        while (it.hasNext()) {
            try {
                ((o72) it.next()).B(h72Var, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    fn3.b(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            fn3.b(th, new fz2(h72Var));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused2) {
        }
    }

    public static e33 g(el5 el5Var, kl5 kl5Var) {
        return el5Var instanceof ll5 ? ((ll5) el5Var).Y(true, kl5Var) : el5Var.E(kl5Var.q(), true, new jl5(1, kl5Var, kl5.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final boolean h(h72 h72Var) {
        el5 el5Var = (el5) h72Var.d0(el5.a.t);
        if (el5Var != null) {
            return el5Var.h();
        }
        return true;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Boolean.valueOf(((r5c) q5c.u.t.t).b());
    }
}
