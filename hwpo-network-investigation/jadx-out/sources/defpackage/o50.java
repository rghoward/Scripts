package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class o50 extends voa {
    public static final t98 h;
    public static o50 i;
    public static final ReentrantLock j;
    public static final Condition k;
    public static final long l;
    public static final long m;
    public int e;
    public int f = -1;
    public long g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final void a(o50 o50Var) {
            t98 t98Var = o50.h;
            if (o50.i == null) {
                o50.i = new o50();
                b bVar = new b("Okio Watchdog");
                bVar.setDaemon(true);
                bVar.start();
            }
            long jNanoTime = System.nanoTime();
            long j = o50Var.c;
            boolean z = o50Var.a;
            if (j != 0 && z) {
                o50Var.g = Math.min(j, o50Var.c() - jNanoTime) + jNanoTime;
            } else if (j != 0) {
                o50Var.g = jNanoTime + j;
            } else {
                if (!z) {
                    throw new AssertionError();
                }
                o50Var.g = o50Var.c();
            }
            t98 t98Var2 = o50.h;
            int i = t98Var2.a + 1;
            t98Var2.a = i;
            o50[] o50VarArr = t98Var2.b;
            if (i == o50VarArr.length) {
                o50[] o50VarArr2 = new o50[i * 2];
                gz3.i(0, 0, 14, o50VarArr, o50VarArr2);
                t98Var2.b = o50VarArr2;
            }
            t98Var2.a(i, o50Var);
            if (o50Var.f == 1) {
                o50.k.signal();
            }
        }

        public static o50 b() throws InterruptedException {
            t98 t98Var = o50.h;
            o50 o50Var = t98Var.b[1];
            if (o50Var == null) {
                long jNanoTime = System.nanoTime();
                o50.k.await(o50.l, TimeUnit.MILLISECONDS);
                if (t98Var.b[1] != null || System.nanoTime() - jNanoTime < o50.m) {
                    return null;
                }
                return o50.i;
            }
            long jNanoTime2 = o50Var.g - System.nanoTime();
            if (jNanoTime2 > 0) {
                o50.k.await(jNanoTime2, TimeUnit.NANOSECONDS);
                return null;
            }
            t98Var.b(o50Var);
            o50Var.e = 2;
            return o50Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    t98 t98Var = o50.h;
                    ReentrantLock reentrantLock = o50.j;
                    reentrantLock.lock();
                    try {
                        o50 o50VarB = a.b();
                        if (o50VarB == o50.i) {
                            o50.i = null;
                            reentrantLock.unlock();
                            return;
                        } else {
                            g2b g2bVar = g2b.a;
                            reentrantLock.unlock();
                            if (o50VarB != null) {
                                o50VarB.l();
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    static {
        t98 t98Var = new t98();
        t98Var.b = new o50[8];
        h = t98Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        k = conditionNewCondition;
        l = 60000L;
        m = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    public final void i() {
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = j;
            reentrantLock.lock();
            try {
                if (this.e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = 1;
                a.a(this);
                g2b g2bVar = g2b.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = j;
        reentrantLock.lock();
        try {
            int i2 = this.e;
            this.e = 0;
            if (i2 != 1) {
                return i2 == 2;
            }
            h.b(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException k(IOException iOException) {
        throw null;
    }

    public void l() {
    }
}
