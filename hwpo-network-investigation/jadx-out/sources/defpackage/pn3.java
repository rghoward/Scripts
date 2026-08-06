package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class pn3 extends on3 implements zv2 {
    public final Executor v;

    public pn3(Executor executor) {
        Method method;
        this.v = executor;
        Method method2 = yu1.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = yu1.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.zv2
    public final e33 K(long j, Runnable runnable, h72 h72Var) {
        Executor executor = this.v;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                sd.c(h72Var, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new d33(scheduledFutureSchedule) : xq2.E.K(j, runnable, h72Var);
    }

    @Override // defpackage.zv2
    public final void Y(long j, e41 e41Var) {
        Executor executor = this.v;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            gv8 gv8Var = new gv8(this, e41Var);
            h72 h72Var = e41Var.x;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(gv8Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                sd.c(h72Var, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            e41Var.w(new u31(scheduledFutureSchedule));
        } else {
            xq2.E.Y(j, e41Var);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.v;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pn3) && ((pn3) obj).v == this.v;
    }

    public final int hashCode() {
        return System.identityHashCode(this.v);
    }

    @Override // defpackage.n72
    public final void t0(h72 h72Var, Runnable runnable) {
        try {
            this.v.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            sd.c(h72Var, cancellationException);
            et2 et2Var = i23.a;
            wr2.v.t0(h72Var, runnable);
        }
    }

    @Override // defpackage.n72
    public final String toString() {
        return this.v.toString();
    }
}
