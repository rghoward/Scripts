package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nn3 {
    public final AtomicReference<ListenableFuture<Void>> a = new AtomicReference<>(t85.u);
    public d b = new d();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a<T> implements w40<T> {
        public final /* synthetic */ c a;
        public final /* synthetic */ w40 b;

        public a(c cVar, w40 w40Var) {
            this.a = cVar;
            this.b = w40Var;
        }

        @Override // defpackage.w40
        public final ListenableFuture<T> call() {
            int i = c.x;
            if (this.a.compareAndSet(b.t, b.v)) {
                return this.b.call();
            }
            t85.a<Object> aVar = t85.a.A;
            return aVar != null ? aVar : new t85.a();
        }

        public final String toString() {
            return this.b.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final b t;
        public static final b u;
        public static final b v;
        public static final /* synthetic */ b[] w;

        static {
            b bVar = new b("NOT_RUN", 0);
            t = bVar;
            b bVar2 = new b("CANCELLED", 1);
            u = bVar2;
            b bVar3 = new b("STARTED", 2);
            v = bVar3;
            w = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) w.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends AtomicReference<b> implements Executor, Runnable {
        public static final /* synthetic */ int x = 0;
        public nn3 t;
        public Executor u;
        public Runnable v;
        public Thread w;

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            if (get() == b.u) {
                this.u = null;
                this.t = null;
                return;
            }
            this.w = Thread.currentThread();
            try {
                nn3 nn3Var = this.t;
                Objects.requireNonNull(nn3Var);
                d dVar = nn3Var.b;
                if (dVar.a == this.w) {
                    this.t = null;
                    xl7.r(dVar.b == null);
                    dVar.b = runnable;
                    Executor executor = this.u;
                    Objects.requireNonNull(executor);
                    dVar.c = executor;
                    this.u = null;
                } else {
                    Executor executor2 = this.u;
                    Objects.requireNonNull(executor2);
                    this.u = null;
                    this.v = runnable;
                    executor2.execute(this);
                }
            } finally {
                this.w = null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Executor executor;
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread != this.w) {
                Runnable runnable = this.v;
                Objects.requireNonNull(runnable);
                this.v = null;
                runnable.run();
                return;
            }
            d dVar = new d();
            dVar.a = threadCurrentThread;
            nn3 nn3Var = this.t;
            Objects.requireNonNull(nn3Var);
            nn3Var.b = dVar;
            this.t = null;
            try {
                Runnable runnable2 = this.v;
                Objects.requireNonNull(runnable2);
                this.v = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = dVar.b;
                    if (runnable3 == null || (executor = dVar.c) == null) {
                        break;
                    }
                    dVar.b = null;
                    dVar.c = null;
                    executor.execute(runnable3);
                }
                dVar.a = null;
            } catch (Throwable th) {
                dVar.a = null;
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public Thread a;
        public Runnable b;
        public Executor c;
    }

    public final <T> ListenableFuture<T> a(w40<T> w40Var, Executor executor) {
        executor.getClass();
        final c cVar = new c(b.t);
        cVar.u = executor;
        cVar.t = this;
        a aVar = new a(cVar, w40Var);
        final mk9 mk9Var = new mk9();
        final ListenableFuture<Void> andSet = this.a.getAndSet(mk9Var);
        final kya kyaVar = new kya();
        kyaVar.B = new kya.a(aVar);
        andSet.Q(kyaVar, cVar);
        final ListenableFuture<T> listenableFutureL1 = ti4.l1(kyaVar);
        Runnable runnable = new Runnable() { // from class: mn3
            @Override // java.lang.Runnable
            public final void run() {
                kya kyaVar2 = kyaVar;
                if (kyaVar2.isDone()) {
                    mk9Var.n(andSet);
                    return;
                }
                if (listenableFutureL1.isCancelled()) {
                    int i = nn3.c.x;
                    if (cVar.compareAndSet(nn3.b.t, nn3.b.u)) {
                        kyaVar2.cancel(false);
                    }
                }
            }
        };
        y03 y03Var = y03.t;
        listenableFutureL1.Q(runnable, y03Var);
        kyaVar.Q(runnable, y03Var);
        return listenableFutureL1;
    }
}
