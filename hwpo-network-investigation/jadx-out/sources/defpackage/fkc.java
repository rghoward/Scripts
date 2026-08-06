package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fkc extends cnc {
    public static final AtomicLong k = new AtomicLong(Long.MIN_VALUE);
    public dkc c;
    public dkc d;
    public final PriorityBlockingQueue e;
    public final LinkedBlockingQueue f;
    public final zjc g;
    public final zjc h;
    public final Object i;
    public final Semaphore j;

    public fkc(tkc tkcVar) {
        super(tkcVar);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue();
        this.f = new LinkedBlockingQueue();
        this.g = new zjc(this, "Thread death: Uncaught exception on worker thread");
        this.h = new zjc(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // defpackage.anc
    public final void g() {
        if (Thread.currentThread() == this.c) {
            return;
        }
        aa0.c("Call expected from worker thread");
    }

    @Override // defpackage.cnc
    public final boolean h() {
        return false;
    }

    public final void k() {
        if (Thread.currentThread() == this.d) {
            return;
        }
        aa0.c("Call expected from network thread");
    }

    public final void l() {
        if (Thread.currentThread() != this.c) {
            return;
        }
        aa0.c("Call not expected from worker thread");
    }

    public final boolean m() {
        return Thread.currentThread() == this.c;
    }

    public final bkc n(Callable callable) {
        i();
        bkc bkcVar = new bkc(this, callable, false);
        if (Thread.currentThread() != this.c) {
            t(bkcVar);
            return bkcVar;
        }
        if (!this.e.isEmpty()) {
            thc thcVar = this.a.f;
            tkc.m(thcVar);
            thcVar.i.a("Callable skipped the worker queue.");
        }
        bkcVar.run();
        return bkcVar;
    }

    public final bkc o(Callable callable) {
        i();
        bkc bkcVar = new bkc(this, callable, true);
        if (Thread.currentThread() == this.c) {
            bkcVar.run();
            return bkcVar;
        }
        t(bkcVar);
        return bkcVar;
    }

    public final void p(Runnable runnable) {
        i();
        a78.g(runnable);
        t(new bkc(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object q(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            fkc fkcVar = this.a.g;
            tkc.m(fkcVar);
            fkcVar.p(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                thc thcVar = this.a.f;
                tkc.m(thcVar);
                phc phcVar = thcVar.i;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                phcVar.a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            thc thcVar2 = this.a.f;
            tkc.m(thcVar2);
            thcVar2.i.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void r(Runnable runnable) {
        i();
        t(new bkc(this, runnable, true, "Task exception on worker thread"));
    }

    public final void s(Runnable runnable) {
        i();
        bkc bkcVar = new bkc(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f;
                linkedBlockingQueue.add(bkcVar);
                dkc dkcVar = this.d;
                if (dkcVar == null) {
                    dkc dkcVar2 = new dkc(this, "Measurement Network", linkedBlockingQueue);
                    this.d = dkcVar2;
                    dkcVar2.setUncaughtExceptionHandler(this.h);
                    this.d.start();
                } else {
                    Object obj = dkcVar.t;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(bkc bkcVar) {
        synchronized (this.i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.e;
                priorityBlockingQueue.add(bkcVar);
                dkc dkcVar = this.c;
                if (dkcVar == null) {
                    dkc dkcVar2 = new dkc(this, "Measurement Worker", priorityBlockingQueue);
                    this.c = dkcVar2;
                    dkcVar2.setUncaughtExceptionHandler(this.g);
                    this.c.start();
                } else {
                    Object obj = dkcVar.t;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
