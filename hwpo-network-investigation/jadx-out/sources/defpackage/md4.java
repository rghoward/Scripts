package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class md4<V> extends g84<V> {
    public final ListenableFuture<V> B;

    public md4(ListenableFuture<V> listenableFuture) {
        listenableFuture.getClass();
        this.B = listenableFuture;
    }

    @Override // defpackage.b1, com.google.common.util.concurrent.ListenableFuture
    public final void Q(Runnable runnable, Executor executor) {
        this.B.Q(runnable, executor);
    }

    @Override // defpackage.b1, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.B.cancel(z);
    }

    @Override // defpackage.b1, java.util.concurrent.Future
    public final V get() {
        return this.B.get();
    }

    @Override // defpackage.b1, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.B.isCancelled();
    }

    @Override // defpackage.b1, java.util.concurrent.Future
    public final boolean isDone() {
        return this.B.isDone();
    }

    @Override // defpackage.b1
    public final String toString() {
        return this.B.toString();
    }

    @Override // defpackage.b1, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return this.B.get(j, timeUnit);
    }
}
