package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tw2 implements ScheduledExecutorService, AutoCloseable {
    public final ExecutorService t;
    public final ScheduledExecutorService u;

    public tw2(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.t = executorService;
        this.u = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.t.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.t.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.t.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.t.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.t.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.t.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new uw2(new uw2.b() { // from class: hw2
            @Override // uw2.b
            public final ScheduledFuture a(final uw2.a aVar) {
                final tw2 tw2Var = this.a;
                ScheduledExecutorService scheduledExecutorService = tw2Var.u;
                final Runnable runnable2 = runnable;
                return scheduledExecutorService.schedule(new Runnable() { // from class: ow2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService = tw2Var.t;
                        final Runnable runnable3 = runnable2;
                        final uw2.a aVar2 = aVar;
                        executorService.execute(new Runnable() { // from class: rw2
                            @Override // java.lang.Runnable
                            public final void run() {
                                Runnable runnable4 = runnable3;
                                uw2 uw2Var = uw2.this;
                                try {
                                    runnable4.run();
                                    uw2Var.l(null);
                                } catch (Exception e) {
                                    uw2Var.m(e);
                                }
                            }
                        });
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new uw2(new uw2.b() { // from class: kw2
            @Override // uw2.b
            public final ScheduledFuture a(final uw2.a aVar) {
                final tw2 tw2Var = this.a;
                ScheduledExecutorService scheduledExecutorService = tw2Var.u;
                final Runnable runnable2 = runnable;
                return scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: nw2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService = tw2Var.t;
                        final Runnable runnable3 = runnable2;
                        final uw2.a aVar2 = aVar;
                        executorService.execute(new Runnable() { // from class: iw2
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                try {
                                    runnable3.run();
                                } catch (Exception e) {
                                    uw2.this.m(e);
                                    throw e;
                                }
                            }
                        });
                    }
                }, j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new uw2(new uw2.b() { // from class: lw2
            @Override // uw2.b
            public final ScheduledFuture a(final uw2.a aVar) {
                final tw2 tw2Var = this.a;
                ScheduledExecutorService scheduledExecutorService = tw2Var.u;
                final Runnable runnable2 = runnable;
                return scheduledExecutorService.scheduleWithFixedDelay(new Runnable() { // from class: qw2
                    @Override // java.lang.Runnable
                    public final void run() {
                        tw2Var.t.execute(new jw2(0, runnable2, aVar));
                    }
                }, j, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.t.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.t.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.t.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.t.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.t.submit(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new uw2(new uw2.b() { // from class: mw2
            @Override // uw2.b
            public final ScheduledFuture a(final uw2.a aVar) {
                final tw2 tw2Var = this.a;
                ScheduledExecutorService scheduledExecutorService = tw2Var.u;
                final Callable callable2 = callable;
                return scheduledExecutorService.schedule(new Callable() { // from class: pw2
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ExecutorService executorService = tw2Var.t;
                        final Callable callable3 = callable2;
                        final uw2.a aVar2 = aVar;
                        return executorService.submit(new Runnable() { // from class: sw2
                            @Override // java.lang.Runnable
                            public final void run() {
                                Callable callable4 = callable3;
                                uw2 uw2Var = uw2.this;
                                try {
                                    uw2Var.l(callable4.call());
                                } catch (Exception e) {
                                    uw2Var.m(e);
                                }
                            }
                        });
                    }
                }, j, timeUnit);
            }
        });
    }
}
