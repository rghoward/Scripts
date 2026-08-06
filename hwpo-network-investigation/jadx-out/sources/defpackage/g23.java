package defpackage;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class g23 {
    public Runnable b;
    public ThreadPoolExecutor c;
    public int a = 64;
    public final ArrayDeque<oi8.a> d = new ArrayDeque<>();
    public final ArrayDeque<oi8.a> e = new ArrayDeque<>();
    public final ArrayDeque<oi8> f = new ArrayDeque<>();

    public static void c(g23 g23Var, oi8.a aVar, oi8 oi8Var, oi8.a aVar2, int i) {
        f23 f23Var;
        oi8.a aVarB;
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            oi8Var = null;
        }
        if ((i & 4) != 0) {
            aVar2 = null;
        }
        g23Var.getClass();
        TimeZone timeZone = ytb.a;
        boolean zIsShutdown = ((ThreadPoolExecutor) g23Var.a()).isShutdown();
        synchronized (g23Var) {
            if (oi8Var != null) {
                try {
                    if (!g23Var.f.remove(oi8Var)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (aVar2 != null) {
                aVar2.u.decrementAndGet();
                if (!g23Var.e.remove(aVar2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (aVar != null) {
                g23Var.d.add(aVar);
                oi8 oi8Var2 = oi8.this;
                if (!oi8Var2.v && (aVarB = g23Var.b(oi8Var2.u.a.d)) != null) {
                    aVar.u = aVarB.u;
                }
            }
            Runnable runnable = (!(oi8Var == null && aVar2 == null) && (zIsShutdown || g23Var.e.isEmpty()) && g23Var.f.isEmpty()) ? g23Var.b : null;
            if (zIsShutdown) {
                List listT = th1.T(g23Var.d);
                g23Var.d.clear();
                f23Var = new f23(listT, runnable);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<oi8.a> it = g23Var.d.iterator();
                it.getClass();
                while (it.hasNext()) {
                    oi8.a next = it.next();
                    if (g23Var.e.size() >= g23Var.a) {
                        break;
                    }
                    if (next.u.get() < 5) {
                        it.remove();
                        next.u.incrementAndGet();
                        arrayList.add(next);
                        g23Var.e.add(next);
                    }
                }
                f23Var = new f23(arrayList, runnable);
            }
        }
        int size = f23Var.a.size();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            oi8.a aVar3 = f23Var.a.get(i2);
            if (aVar3 == aVar) {
                z = false;
            } else {
                oi8.this.x.getClass();
            }
            if (zIsShutdown) {
                aVar3.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                oi8 oi8Var3 = oi8.this;
                oi8Var3.g(interruptedIOException);
                aVar3.t.onFailure(oi8Var3, interruptedIOException);
            } else {
                ExecutorService executorServiceA = g23Var.a();
                aVar3.getClass();
                oi8 oi8Var4 = oi8.this;
                oi8Var4.t.a.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceA).execute(aVar3);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        oi8 oi8Var5 = oi8.this;
                        oi8Var5.g(interruptedIOException2);
                        aVar3.t.onFailure(oi8Var5, interruptedIOException2);
                        g23 g23Var2 = oi8Var4.t.a;
                        g23Var2.getClass();
                        c(g23Var2, null, null, aVar3, 3);
                    }
                } catch (Throwable th2) {
                    g23 g23Var3 = oi8Var4.t.a;
                    g23Var3.getClass();
                    c(g23Var3, null, null, aVar3, 3);
                    throw th2;
                }
            }
        }
        if (z && aVar != null) {
            oi8.this.x.getClass();
        }
        Runnable runnable2 = f23Var.b;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (this.c == null) {
                this.c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new xtb(ytb.b + " Dispatcher", false));
            }
            threadPoolExecutor = this.c;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public final oi8.a b(String str) {
        Iterator<oi8.a> it = this.e.iterator();
        it.getClass();
        while (it.hasNext()) {
            oi8.a next = it.next();
            if (xj5.a(oi8.this.u.a.d, str)) {
                return next;
            }
        }
        Iterator<oi8.a> it2 = this.d.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            oi8.a next2 = it2.next();
            if (xj5.a(oi8.this.u.a.d, str)) {
                return next2;
            }
        }
        return null;
    }
}
