package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class caa {
    public static <TResult> TResult a(r9a<TResult> r9aVar) throws InterruptedException {
        a78.f("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            aa0.c("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        a78.h(r9aVar, "Task must not be null");
        if (r9aVar.m()) {
            return (TResult) h(r9aVar);
        }
        byb bybVar = new byb();
        r3d r3dVar = u9a.b;
        r9aVar.f(r3dVar, bybVar);
        r9aVar.e(r3dVar, bybVar);
        r9aVar.a(r3dVar, bybVar);
        bybVar.t.await();
        return (TResult) h(r9aVar);
    }

    public static <TResult> TResult b(r9a<TResult> r9aVar, long j, TimeUnit timeUnit) throws TimeoutException {
        a78.f("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            aa0.c("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        a78.h(r9aVar, "Task must not be null");
        a78.h(timeUnit, "TimeUnit must not be null");
        if (r9aVar.m()) {
            return (TResult) h(r9aVar);
        }
        byb bybVar = new byb();
        r3d r3dVar = u9a.b;
        r9aVar.f(r3dVar, bybVar);
        r9aVar.e(r3dVar, bybVar);
        r9aVar.a(r3dVar, bybVar);
        if (bybVar.t.await(j, timeUnit)) {
            return (TResult) h(r9aVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static q6d c(Executor executor, Callable callable) {
        a78.h(executor, "Executor must not be null");
        q6d q6dVar = new q6d();
        executor.execute(new t7d(q6dVar, callable));
        return q6dVar;
    }

    public static q6d d(Exception exc) {
        q6d q6dVar = new q6d();
        q6dVar.r(exc);
        return q6dVar;
    }

    public static q6d e(Object obj) {
        q6d q6dVar = new q6d();
        q6dVar.p(obj);
        return q6dVar;
    }

    public static q6d f(List list) {
        if (list == null || list.isEmpty()) {
            return e(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((r9a) it.next()) == null) {
                ac4.c("null tasks are not accepted");
                return null;
            }
        }
        q6d q6dVar = new q6d();
        b2c b2cVar = new b2c(list.size(), q6dVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            r9a r9aVar = (r9a) it2.next();
            r3d r3dVar = u9a.b;
            r9aVar.f(r3dVar, b2cVar);
            r9aVar.e(r3dVar, b2cVar);
            r9aVar.a(r3dVar, b2cVar);
        }
        return q6dVar;
    }

    public static r9a<List<r9a<?>>> g(r9a<?>... r9aVarArr) {
        if (r9aVarArr.length == 0) {
            return e(Collections.EMPTY_LIST);
        }
        List listAsList = Arrays.asList(r9aVarArr);
        return (listAsList == null || listAsList.isEmpty()) ? e(Collections.EMPTY_LIST) : f(listAsList).h(u9a.a, new v9d(listAsList));
    }

    public static Object h(r9a r9aVar) throws ExecutionException {
        if (r9aVar.n()) {
            return r9aVar.j();
        }
        if (r9aVar.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(r9aVar.i());
    }
}
