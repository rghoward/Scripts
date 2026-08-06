package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t85<V> implements ListenableFuture<V> {
    public static final t85 u = new t85(null);
    public static final rz5 v = new rz5(t85.class);
    public final V t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<V> extends b1.i<V> {
        public static final a<Object> A;

        static {
            A = b1.w ? null : new a<>();
        }

        public a() {
            cancel(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<V> extends b1.i<V> {
    }

    public t85(V v2) {
        this.t = v2;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void Q(Runnable runnable, Executor executor) {
        xl7.n(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            v.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.t;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.t + "]]";
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.t;
    }
}
