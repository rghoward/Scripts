package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kya<V> extends g84.a<V> implements RunnableFuture<V> {
    public volatile kj5<?> B;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a extends kj5<ListenableFuture<V>> {
        public final w40<V> v;

        public a(w40<V> w40Var) {
            this.v = w40Var;
        }

        @Override // defpackage.kj5
        public final void a(Throwable th) {
            kya.this.m(th);
        }

        @Override // defpackage.kj5
        public final void b(Object obj) {
            kya.this.n((ListenableFuture) obj);
        }

        @Override // defpackage.kj5
        public final boolean d() {
            return kya.this.isDone();
        }

        @Override // defpackage.kj5
        public final Object e() {
            w40<V> w40Var = this.v;
            ListenableFuture<V> listenableFutureCall = w40Var.call();
            xl7.m(listenableFutureCall, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", w40Var);
            return listenableFutureCall;
        }

        @Override // defpackage.kj5
        public final String f() {
            return this.v.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b extends kj5<V> {
        public final Callable<V> v;

        public b(Callable<V> callable) {
            callable.getClass();
            this.v = callable;
        }

        @Override // defpackage.kj5
        public final void a(Throwable th) {
            kya.this.m(th);
        }

        @Override // defpackage.kj5
        public final void b(V v) {
            kya.this.l(v);
        }

        @Override // defpackage.kj5
        public final boolean d() {
            return kya.this.isDone();
        }

        @Override // defpackage.kj5
        public final V e() {
            return this.v.call();
        }

        @Override // defpackage.kj5
        public final String f() {
            return this.v.toString();
        }
    }

    public kya(Callable<V> callable) {
        this.B = new b(callable);
    }

    @Override // defpackage.b1
    public final void c() {
        kj5<?> kj5Var;
        if (o() && (kj5Var = this.B) != null) {
            kj5Var.c();
        }
        this.B = null;
    }

    @Override // defpackage.b1
    public final String j() {
        kj5<?> kj5Var = this.B;
        if (kj5Var == null) {
            return super.j();
        }
        return "task=[" + kj5Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        kj5<?> kj5Var = this.B;
        if (kj5Var != null) {
            kj5Var.run();
        }
        this.B = null;
    }
}
