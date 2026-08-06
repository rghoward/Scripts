package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oa2 implements Executor {
    public final ExecutorService t;
    public final Object u = new Object();
    public r9a<?> v = caa.e(null);

    public oa2(ExecutorService executorService) {
        this.t = executorService;
    }

    public final r9a<Void> a(final Runnable runnable) {
        r9a r9aVarH;
        synchronized (this.u) {
            r9aVarH = this.v.h(this.t, new s02() { // from class: na2
                @Override // defpackage.s02
                public final Object a(r9a r9aVar) {
                    runnable.run();
                    return caa.e(null);
                }
            });
            this.v = r9aVarH;
        }
        return r9aVarH;
    }

    public final <T> r9a<T> b(final Callable<r9a<T>> callable) {
        q6d q6dVar;
        synchronized (this.u) {
            q6dVar = (r9a<T>) this.v.h(this.t, new s02() { // from class: ma2
                @Override // defpackage.s02
                public final Object a(r9a r9aVar) {
                    return (r9a) callable.call();
                }
            });
            this.v = q6dVar;
        }
        return q6dVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.t.execute(runnable);
    }
}
