package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ti4 extends ln4 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<V> implements Runnable {
        public final Future<V> t;
        public final si4<? super V> u;

        public a(ListenableFuture listenableFuture, si4 si4Var) {
            this.t = listenableFuture;
            this.u = si4Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Throwable thA;
            Future<V> future = this.t;
            boolean z = future instanceof fj5;
            si4<? super V> si4Var = this.u;
            if (z && (thA = ((fj5) future).a()) != null) {
                si4Var.a(thA);
                return;
            }
            try {
                si4Var.onSuccess((Object) ti4.i1(future));
            } catch (ExecutionException e) {
                si4Var.a(e.getCause());
            } catch (Throwable th) {
                si4Var.a(th);
            }
        }

        public final String toString() {
            iy6 iy6Var = new iy6(a.class.getSimpleName());
            iy6.a aVar = new iy6.a();
            iy6Var.c.b = aVar;
            iy6Var.c = aVar;
            aVar.a = this.u;
            return iy6Var.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<V> extends b1.i<V> implements Runnable {
        public ListenableFuture<V> A;

        @Override // defpackage.b1
        public final void c() {
            this.A = null;
        }

        @Override // defpackage.b1
        public final String j() {
            ListenableFuture<V> listenableFuture = this.A;
            if (listenableFuture == null) {
                return null;
            }
            return "delegate=[" + listenableFuture + "]";
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListenableFuture<V> listenableFuture = this.A;
            if (listenableFuture != null) {
                n(listenableFuture);
            }
        }
    }

    public static i0.a h1(ListenableFuture listenableFuture, Class cls, x40 x40Var, Executor executor) {
        int i = i0.E;
        i0.a aVar = new i0.a(listenableFuture, cls, x40Var);
        listenableFuture.Q(aVar, hy6.a(executor, aVar));
        return aVar;
    }

    public static <V> V i1(Future<V> future) {
        V v;
        if (!future.isDone()) {
            aa0.c(p2a.a("Future was expected to be done: %s", future));
            return null;
        }
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public static t85.b j1(Exception exc) {
        t85.b bVar = new t85.b();
        bVar.m(exc);
        return bVar;
    }

    public static t85 k1(Object obj) {
        return obj == null ? t85.u : new t85(obj);
    }

    public static <V> ListenableFuture<V> l1(ListenableFuture<V> listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        b bVar = new b();
        bVar.A = listenableFuture;
        listenableFuture.Q(bVar, y03.t);
        return bVar;
    }

    public static w2.b m1(ListenableFuture listenableFuture, yh4 yh4Var, Executor executor) {
        int i = w2.D;
        w2.b bVar = new w2.b(listenableFuture, yh4Var);
        listenableFuture.Q(bVar, hy6.a(executor, bVar));
        return bVar;
    }

    public static w2.a n1(ListenableFuture listenableFuture, x40 x40Var, Executor executor) {
        int i = w2.D;
        executor.getClass();
        w2.a aVar = new w2.a(listenableFuture, x40Var);
        listenableFuture.Q(aVar, hy6.a(executor, aVar));
        return aVar;
    }
}
