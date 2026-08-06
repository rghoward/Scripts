package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a31<T> implements ListenableFuture<T> {
    public final WeakReference<y21<T>> t;
    public final a u = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends o2<T> {
        public a() {
        }

        @Override // defpackage.o2
        public final String j() {
            y21<T> y21Var = a31.this.t.get();
            if (y21Var == null) {
                return "Completer object has been garbage collected, future will fail soon";
            }
            return "tag=[" + y21Var.a + "]";
        }
    }

    public a31(y21<T> y21Var) {
        this.t = new WeakReference<>(y21Var);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void Q(Runnable runnable, Executor executor) {
        this.u.Q(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        y21<T> y21Var = this.t.get();
        boolean zCancel = this.u.cancel(z);
        if (zCancel && y21Var != null) {
            y21Var.a = null;
            y21Var.b = null;
            y21Var.c.l(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.u.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.u.t instanceof o2.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.u.isDone();
    }

    public final String toString() {
        return this.u.toString();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) {
        return this.u.get(j, timeUnit);
    }
}
