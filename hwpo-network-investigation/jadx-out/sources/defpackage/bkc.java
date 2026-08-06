package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bkc extends FutureTask implements Comparable {
    public final long t;
    public final boolean u;
    public final String v;
    public final /* synthetic */ fkc w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkc(fkc fkcVar, Callable callable, boolean z) {
        super(callable);
        this.w = fkcVar;
        long andIncrement = fkc.k.getAndIncrement();
        this.t = andIncrement;
        this.v = "Task exception on worker thread";
        this.u = z;
        if (andIncrement == Long.MAX_VALUE) {
            thc thcVar = fkcVar.a.f;
            tkc.m(thcVar);
            thcVar.f.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        bkc bkcVar = (bkc) obj;
        boolean z = bkcVar.u;
        boolean z2 = this.u;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = bkcVar.t;
        long j2 = this.t;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        thc thcVar = this.w.a.f;
        tkc.m(thcVar);
        thcVar.g.b(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        thc thcVar = this.w.a.f;
        tkc.m(thcVar);
        thcVar.f.b(th, this.v);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkc(fkc fkcVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.w = fkcVar;
        long andIncrement = fkc.k.getAndIncrement();
        this.t = andIncrement;
        this.v = str;
        this.u = z;
        if (andIncrement == Long.MAX_VALUE) {
            thc thcVar = fkcVar.a.f;
            tkc.m(thcVar);
            thcVar.f.a("Tasks index overflow");
        }
    }
}
