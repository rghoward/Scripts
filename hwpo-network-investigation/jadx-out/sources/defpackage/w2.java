package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.intercom.twig.BuildConfig;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w2<I, O, F, T> extends g84.a<O> implements Runnable {
    public static final /* synthetic */ int D = 0;
    public ListenableFuture<? extends I> B;
    public F C;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<I, O> extends w2<I, O, x40<? super I, ? extends O>, ListenableFuture<? extends O>> {
        @Override // defpackage.w2
        public final Object p(Object obj, Object obj2) {
            x40 x40Var = (x40) obj;
            ListenableFuture<O> listenableFutureApply = x40Var.apply(obj2);
            xl7.m(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", x40Var);
            return listenableFutureApply;
        }

        @Override // defpackage.w2
        public final void q(Object obj) {
            n((ListenableFuture) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<I, O> extends w2<I, O, yh4<? super I, ? extends O>, O> {
        @Override // defpackage.w2
        public final Object p(Object obj, Object obj2) {
            return ((yh4) obj).apply(obj2);
        }

        @Override // defpackage.w2
        public final void q(O o) {
            l(o);
        }
    }

    public w2(ListenableFuture<? extends I> listenableFuture, F f) {
        listenableFuture.getClass();
        this.B = listenableFuture;
        f.getClass();
        this.C = f;
    }

    @Override // defpackage.b1
    public final void c() {
        ListenableFuture<? extends I> listenableFuture = this.B;
        if ((listenableFuture != null) & (this.t instanceof b1.b)) {
            listenableFuture.cancel(o());
        }
        this.B = null;
        this.C = null;
    }

    @Override // defpackage.b1
    public final String j() {
        String str;
        ListenableFuture<? extends I> listenableFuture = this.B;
        F f = this.C;
        String strJ = super.j();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (f == null) {
            if (strJ != null) {
                return str.concat(strJ);
            }
            return null;
        }
        return str + "function=[" + f + "]";
    }

    public abstract T p(F f, I i);

    public abstract void q(T t);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture<? extends I> listenableFuture = this.B;
        F f = this.C;
        if (((this.t instanceof b1.b) | (listenableFuture == null)) || (f == null)) {
            return;
        }
        this.B = null;
        if (listenableFuture.isCancelled()) {
            n(listenableFuture);
            return;
        }
        try {
            try {
                Object objP = p(f, ti4.i1(listenableFuture));
                this.C = null;
                q(objP);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m(th);
                } finally {
                    this.C = null;
                }
            }
        } catch (Error e) {
            m(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            m(e2.getCause());
        } catch (Exception e3) {
            m(e3);
        }
    }
}
