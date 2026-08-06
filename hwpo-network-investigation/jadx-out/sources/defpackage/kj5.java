package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kj5<T> extends AtomicReference<Runnable> implements Runnable {
    public static final b t = new b();
    public static final b u = new b();

    public abstract void a(Throwable th);

    public abstract void b(T t2);

    public final void c() {
        b bVar = u;
        b bVar2 = t;
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            a aVar = new a(this);
            a.a(aVar, Thread.currentThread());
            if (compareAndSet(runnable, aVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(bVar2) == bVar) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract T e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = get();
        a aVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof a;
            b bVar = u;
            if (!z2 && runnable != bVar) {
                break;
            }
            if (z2) {
                aVar = (a) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == bVar || compareAndSet(runnable, bVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(aVar);
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        T tE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            b bVar = t;
            if (!zD) {
                try {
                    tE = e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, bVar)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, bVar)) {
                            g(threadCurrentThread);
                        }
                        if (!zD) {
                            b(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, bVar)) {
                g(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            b(tE);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == t) {
            str = "running=[DONE]";
        } else if (runnable instanceof a) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbB = tn2.b(str, ", ");
        sbB.append(f());
        return sbB.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends AbstractOwnableSynchronizer implements Runnable {
        public final kj5<?> t;

        public a(kj5 kj5Var) {
            this.t = kj5Var;
        }

        public static void a(a aVar, Thread thread) {
            aVar.setExclusiveOwnerThread(thread);
        }

        public final String toString() {
            return this.t.toString();
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }
    }
}
