package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ij1<V> extends ih<Object, V> {
    public ij1<V>.c<?> H;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a extends ij1<V>.c<ListenableFuture<V>> {
        public final l7d x;

        public a(l7d l7dVar, Executor executor) {
            super(executor);
            this.x = l7dVar;
        }

        @Override // defpackage.kj5
        public final Object e() {
            return this.x.call();
        }

        @Override // defpackage.kj5
        public final String f() {
            return this.x.toString();
        }

        @Override // ij1.c
        public final void h(Object obj) {
            ij1.this.n((ListenableFuture) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b extends ij1<V>.c<V> {
        public final Callable<V> x;

        public b(Callable callable) {
            super(y03.t);
            this.x = callable;
        }

        @Override // defpackage.kj5
        public final V e() {
            return this.x.call();
        }

        @Override // defpackage.kj5
        public final String f() {
            return this.x.toString();
        }

        @Override // ij1.c
        public final void h(V v) {
            ij1.this.l(v);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public abstract class c<T> extends kj5<T> {
        public final Executor v;

        public c(Executor executor) {
            executor.getClass();
            this.v = executor;
        }

        @Override // defpackage.kj5
        public final void a(Throwable th) {
            ij1 ij1Var = ij1.this;
            ij1Var.H = null;
            if (th instanceof ExecutionException) {
                ij1Var.m(((ExecutionException) th).getCause());
            } else if (th instanceof CancellationException) {
                ij1Var.cancel(false);
            } else {
                ij1Var.m(th);
            }
        }

        @Override // defpackage.kj5
        public final void b(T t) {
            ij1.this.H = null;
            h(t);
        }

        @Override // defpackage.kj5
        public final boolean d() {
            return ij1.this.isDone();
        }

        public abstract void h(T t);
    }

    @Override // defpackage.b1
    public final void i() {
        ij1<V>.c<?> cVar = this.H;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // defpackage.ih
    public final void q() {
        ij1<V>.c<?> cVar = this.H;
        if (cVar != null) {
            try {
                cVar.v.execute(cVar);
            } catch (RejectedExecutionException e) {
                ij1.this.m(e);
            }
        }
    }

    @Override // defpackage.ih
    public final void u(ih.a aVar) {
        this.E = null;
        if (aVar == ih.a.t) {
            this.H = null;
        }
    }
}
