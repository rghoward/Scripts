package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xq2 extends qm3 implements Runnable {
    public static final xq2 E;
    public static final long F;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        xq2 xq2Var = new xq2();
        E = xq2Var;
        xq2Var.z0(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        F = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.rm3
    public final Thread C0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(E.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.rm3
    public final void D0(long j, qm3.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.qm3
    public final void G0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.G0(runnable);
    }

    @Override // defpackage.zv2
    public final e33 K(long j, Runnable runnable, h72 h72Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return yb7.t;
        }
        long jNanoTime = System.nanoTime();
        qm3.b bVar = new qm3.b(runnable, j2 + jNanoTime);
        N0(jNanoTime, bVar);
        return bVar;
    }

    public final synchronized void Q0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            M0();
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        dla.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    Q0();
                    if (K0()) {
                        return;
                    }
                    C0();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jA0 = A0();
                    if (jA0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = F + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            Q0();
                            if (K0()) {
                                return;
                            }
                            C0();
                            return;
                        }
                        if (jA0 > j2) {
                            jA0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jA0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            Q0();
                            if (K0()) {
                                return;
                            }
                            C0();
                            return;
                        }
                        LockSupport.parkNanos(this, jA0);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            Q0();
            if (!K0()) {
                C0();
            }
            throw th;
        }
    }

    @Override // defpackage.qm3, defpackage.pm3
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.n72
    public final String toString() {
        return "DefaultExecutor";
    }
}
