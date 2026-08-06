package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.intercom.twig.BuildConfig;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0<V, X extends Throwable, F, T> extends g84.a<V> implements Runnable {
    public static final /* synthetic */ int E = 0;
    public ListenableFuture<? extends V> B;
    public Class<X> C;
    public F D;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<V, X extends Throwable> extends i0<V, X, x40<? super X, ? extends V>, ListenableFuture<? extends V>> {
        @Override // defpackage.i0
        public final Object p(Object obj, Throwable th) {
            x40 x40Var = (x40) obj;
            ListenableFuture listenableFutureApply = x40Var.apply(th);
            xl7.m(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", x40Var);
            return listenableFutureApply;
        }

        @Override // defpackage.i0
        public final void q(Object obj) {
            n((ListenableFuture) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<V, X extends Throwable> extends i0<V, X, yh4<? super X, ? extends V>, V> {
        @Override // defpackage.i0
        public final Object p(Object obj, Throwable th) {
            return ((yh4) obj).apply(th);
        }

        @Override // defpackage.i0
        public final void q(V v) {
            l(v);
        }
    }

    public i0(ListenableFuture<? extends V> listenableFuture, Class<X> cls, F f) {
        listenableFuture.getClass();
        this.B = listenableFuture;
        this.C = cls;
        this.D = f;
    }

    @Override // defpackage.b1
    public final void c() {
        ListenableFuture<? extends V> listenableFuture = this.B;
        if ((listenableFuture != null) & (this.t instanceof b1.b)) {
            listenableFuture.cancel(o());
        }
        this.B = null;
        this.C = null;
        this.D = null;
    }

    @Override // defpackage.b1
    public final String j() {
        String str;
        ListenableFuture<? extends V> listenableFuture = this.B;
        Class<X> cls = this.C;
        F f = this.D;
        String strJ = super.j();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (cls == null || f == null) {
            if (strJ != null) {
                return str.concat(strJ);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + f + "]";
    }

    public abstract T p(F f, X x);

    public abstract void q(T t);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objI1;
        ListenableFuture<? extends V> listenableFuture = this.B;
        Class<X> cls = this.C;
        F f = this.D;
        if (((f == null) || ((listenableFuture == 0) | (cls == null))) || (this.t instanceof b1.b)) {
            return;
        }
        ?? r3 = (Class<X>) null;
        this.B = null;
        try {
            th = listenableFuture instanceof fj5 ? ((fj5) listenableFuture).a() : null;
            objI1 = th == null ? ti4.i1(listenableFuture) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            l(objI1);
            return;
        }
        if (!cls.isInstance(th)) {
            n(listenableFuture);
            return;
        }
        try {
            Object objP = p(f, th);
            this.C = null;
            this.D = null;
            q(objP);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                m(th2);
            } finally {
                this.C = null;
                this.D = null;
            }
        }
    }
}
