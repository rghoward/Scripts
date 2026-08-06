package defpackage;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hy6 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends r1 {
        public final ExecutorService t;

        public a(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.getClass();
            this.t = scheduledExecutorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            return this.t.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.t.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.t.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.t.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.t.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.t.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.t + "]";
        }
    }

    public static Executor a(Executor executor, g84.a aVar) {
        executor.getClass();
        return executor == y03.t ? executor : new gy6(executor, aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends a implements ib6 {
        public final ScheduledExecutorService u;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a<V> extends od4.a<V> implements ScheduledFuture {
            public final ScheduledFuture<?> y;

            public a(b1 b1Var, ScheduledFuture scheduledFuture) {
                super(b1Var);
                this.y = scheduledFuture;
            }

            @Override // defpackage.nd4, java.util.concurrent.Future
            public final boolean cancel(boolean z) {
                boolean zCancel = super.cancel(z);
                if (zCancel) {
                    this.y.cancel(z);
                }
                return zCancel;
            }

            @Override // java.lang.Comparable
            public final int compareTo(Delayed delayed) {
                return this.y.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public final long getDelay(TimeUnit timeUnit) {
                return this.y.getDelay(timeUnit);
            }
        }

        /* JADX INFO: renamed from: hy6$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class RunnableC0105b extends b1.i<Void> implements Runnable {
            public final Runnable A;

            public RunnableC0105b(Runnable runnable) {
                runnable.getClass();
                this.A = runnable;
            }

            @Override // defpackage.b1
            public final String j() {
                return "task=[" + this.A + "]";
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.A.run();
                } catch (Throwable th) {
                    m(th);
                    throw th;
                }
            }
        }

        public b(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.u = scheduledExecutorService;
        }

        @Override // defpackage.ib6, java.util.concurrent.ScheduledExecutorService
        public final a schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            kya kyaVar = new kya(Executors.callable(runnable, null));
            return new a(kyaVar, this.u.schedule(kyaVar, j, timeUnit));
        }

        @Override // defpackage.ib6, java.util.concurrent.ScheduledExecutorService
        public final a scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            RunnableC0105b runnableC0105b = new RunnableC0105b(runnable);
            return new a(runnableC0105b, this.u.scheduleAtFixedRate(runnableC0105b, j, j2, timeUnit));
        }

        @Override // defpackage.ib6, java.util.concurrent.ScheduledExecutorService
        public final a scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            RunnableC0105b runnableC0105b = new RunnableC0105b(runnable);
            return new a(runnableC0105b, this.u.scheduleWithFixedDelay(runnableC0105b, j, j2, timeUnit));
        }

        @Override // defpackage.ib6, java.util.concurrent.ScheduledExecutorService
        public final a schedule(Callable callable, long j, TimeUnit timeUnit) {
            kya kyaVar = new kya(callable);
            return new a(kyaVar, this.u.schedule(kyaVar, j, timeUnit));
        }
    }
}
