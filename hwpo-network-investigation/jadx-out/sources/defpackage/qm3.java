package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qm3 extends rm3 implements zv2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A;
    public static final /* synthetic */ AtomicIntegerFieldUpdater B;
    public static final /* synthetic */ long C;
    public static final /* synthetic */ long D;
    public static final /* synthetic */ AtomicReferenceFieldUpdater z = AtomicReferenceFieldUpdater.newUpdater(qm3.class, Object.class, "_queue$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a extends c {
        public final e41 v;

        public a(long j, e41 e41Var) {
            super(j);
            this.v = e41Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.v.E(qm3.this, g2b.a);
        }

        @Override // qm3.c
        public final String toString() {
            return super.toString() + this.v;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends c {
        public final Runnable v;

        public b(Runnable runnable, long j) {
            super(j);
            this.v = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.v.run();
        }

        @Override // qm3.c
        public final String toString() {
            return super.toString() + this.v;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class c implements Runnable, Comparable<c>, e33, gla {
        private volatile Object _heap;
        public long t;
        public int u = -1;

        public c(long j) {
            this.t = j;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            long j = this.t - cVar.t;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        @Override // defpackage.e33
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    k7a k7aVar = sm3.t;
                    if (obj == k7aVar) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        synchronized (dVar) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof fla ? (fla) obj2 : null) != null) {
                                dVar.b(this.u);
                            }
                        }
                    }
                    this._heap = k7aVar;
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.gla
        public final void e(d dVar) {
            if (this._heap != sm3.t) {
                this._heap = dVar;
            } else {
                z90.a("Failed requirement.");
            }
        }

        public final int f(long j, d dVar, qm3 qm3Var) {
            synchronized (this) {
                if (this._heap == sm3.t) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        Object[] objArr = dVar.a;
                        c cVar = (c) (objArr != null ? objArr[0] : null);
                        if (qm3.B.get(qm3Var) == 1) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.c = j;
                        } else {
                            long j2 = cVar.t;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            if (j - dVar.c > 0) {
                                dVar.c = j;
                            }
                        }
                        long j3 = this.t;
                        long j4 = dVar.c;
                        if (j3 - j4 < 0) {
                            this.t = j4;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // defpackage.gla
        public final void setIndex(int i) {
            this.u = i;
        }

        public String toString() {
            return fh0.b(new StringBuilder("Delayed[nanos="), this.t, ']');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends fla<c> {
        public long c;
    }

    static {
        Unsafe unsafe = rxc.a;
        D = unsafe.objectFieldOffset(qm3.class.getDeclaredField("_queue$volatile"));
        A = AtomicReferenceFieldUpdater.newUpdater(qm3.class, Object.class, "_delayed$volatile");
        C = unsafe.objectFieldOffset(qm3.class.getDeclaredField("_delayed$volatile"));
        B = AtomicIntegerFieldUpdater.newUpdater(qm3.class, "_isCompleted$volatile");
    }

    @Override // defpackage.pm3
    public final long A0() {
        if (B0()) {
            return 0L;
        }
        H0();
        Runnable runnableF0 = F0();
        if (runnableF0 == null) {
            return J0();
        }
        runnableF0.run();
        return 0L;
    }

    public final void E0() {
        qm3 qm3Var;
        Unsafe unsafe;
        k7a k7aVar = sm3.u;
        while (true) {
            z.getClass();
            Unsafe unsafe2 = rxc.a;
            long j = D;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = rxc.a;
                    qm3Var = this;
                    if (unsafe3.compareAndSwapObject(qm3Var, D, (Object) null, k7aVar)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(qm3Var, j) != null) {
                        break;
                    } else {
                        this = qm3Var;
                    }
                }
            } else {
                qm3Var = this;
                if (objectVolatile instanceof jd6) {
                    ((jd6) objectVolatile).c();
                    return;
                }
                if (objectVolatile == k7aVar) {
                    return;
                }
                jd6 jd6Var = new jd6(8, true);
                jd6Var.a((Runnable) objectVolatile);
                do {
                    unsafe = rxc.a;
                    if (unsafe.compareAndSwapObject(qm3Var, D, objectVolatile, jd6Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(qm3Var, j) == objectVolatile);
            }
            this = qm3Var;
        }
    }

    public final Runnable F0() {
        qm3 qm3Var;
        Unsafe unsafe;
        while (true) {
            z.getClass();
            Unsafe unsafe2 = rxc.a;
            long j = D;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof jd6) {
                jd6 jd6Var = (jd6) objectVolatile;
                Object objE = jd6Var.e();
                if (objE == jd6.g) {
                    jd6 jd6VarD = jd6Var.d();
                    while (true) {
                        Unsafe unsafe3 = rxc.a;
                        qm3Var = this;
                        if (unsafe3.compareAndSwapObject(qm3Var, D, objectVolatile, jd6VarD) || unsafe3.getObjectVolatile(qm3Var, j) != objectVolatile) {
                            break;
                        }
                        this = qm3Var;
                    }
                } else {
                    return (Runnable) objE;
                }
            } else {
                qm3Var = this;
                if (objectVolatile == sm3.u) {
                    return null;
                }
                do {
                    unsafe = rxc.a;
                    if (unsafe.compareAndSwapObject(qm3Var, D, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(qm3Var, j) == objectVolatile);
            }
            this = qm3Var;
        }
    }

    public void G0(Runnable runnable) {
        H0();
        if (!I0(runnable)) {
            xq2.E.G0(runnable);
            return;
        }
        Thread threadC0 = C0();
        if (Thread.currentThread() != threadC0) {
            LockSupport.unpark(threadC0);
        }
    }

    public final void H0() {
        c cVarB;
        A.getClass();
        d dVar = (d) rxc.a.getObjectVolatile(this, C);
        if (dVar == null || fla.b.get(dVar) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    Object[] objArr = dVar.a;
                    cVarB = null;
                    Object obj = objArr != null ? objArr[0] : null;
                    if (obj != null) {
                        c cVar = (c) obj;
                        if (jNanoTime - cVar.t >= 0 ? I0(cVar) : false) {
                            cVarB = dVar.b(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (cVarB != null);
    }

    public final boolean I0(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        while (true) {
            z.getClass();
            Unsafe unsafe4 = rxc.a;
            long j = D;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (B.get(this) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = rxc.a;
                    if (unsafe.compareAndSwapObject(this, D, (Object) null, runnable)) {
                        return true;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof jd6) {
                jd6 jd6Var = (jd6) objectVolatile;
                int iA = jd6Var.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    jd6 jd6VarD = jd6Var.d();
                    do {
                        unsafe2 = rxc.a;
                        if (unsafe2.compareAndSwapObject(this, D, objectVolatile, jd6VarD)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == sm3.u) {
                    return false;
                }
                jd6 jd6Var2 = new jd6(8, true);
                jd6Var2.a((Runnable) objectVolatile);
                jd6Var2.a(runnable);
                do {
                    unsafe3 = rxc.a;
                    if (unsafe3.compareAndSwapObject(this, D, objectVolatile, jd6Var2)) {
                        return true;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
    }

    public final long J0() {
        Object obj;
        h30<d23<?>> h30Var = this.x;
        if (((h30Var == null || h30Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            z.getClass();
            Unsafe unsafe = rxc.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, D);
            if (objectVolatile != null) {
                if (objectVolatile instanceof jd6) {
                    long j = jd6.f.get((jd6) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == sm3.u) {
                    return Long.MAX_VALUE;
                }
            }
            A.getClass();
            d dVar = (d) unsafe.getObjectVolatile(this, C);
            if (dVar != null) {
                synchronized (dVar) {
                    Object[] objArr = dVar.a;
                    obj = objArr != null ? objArr[0] : null;
                }
                c cVar = (c) obj;
                if (cVar != null) {
                    long jNanoTime = cVar.t - System.nanoTime();
                    if (jNanoTime >= 0) {
                        return jNanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final boolean K0() {
        h30<d23<?>> h30Var = this.x;
        if (h30Var != null ? h30Var.isEmpty() : true) {
            A.getClass();
            Unsafe unsafe = rxc.a;
            d dVar = (d) unsafe.getObjectVolatile(this, C);
            if (dVar != null && fla.b.get(dVar) != 0) {
                return false;
            }
            z.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, D);
            if (objectVolatile != null) {
                if (objectVolatile instanceof jd6) {
                    long j = jd6.f.get((jd6) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == sm3.u) {
                }
            }
            return true;
        }
        return false;
    }

    public final void L0() {
        c cVarB;
        long jNanoTime = System.nanoTime();
        while (true) {
            A.getClass();
            d dVar = (d) rxc.a.getObjectVolatile(this, C);
            if (dVar == null) {
                return;
            }
            synchronized (dVar) {
                cVarB = fla.b.get(dVar) > 0 ? dVar.b(0) : null;
            }
            c cVar = cVarB;
            if (cVar == null) {
                return;
            } else {
                D0(jNanoTime, cVar);
            }
        }
    }

    public final void M0() {
        z.getClass();
        Unsafe unsafe = rxc.a;
        unsafe.putObjectVolatile(this, D, (Object) null);
        A.getClass();
        unsafe.putObjectVolatile(this, C, (Object) null);
    }

    public final void N0(long j, c cVar) {
        Thread threadC0;
        int iO0 = O0(j, cVar);
        if (iO0 == 0) {
            if (!P0(cVar) || Thread.currentThread() == (threadC0 = C0())) {
                return;
            }
            LockSupport.unpark(threadC0);
            return;
        }
        if (iO0 == 1) {
            D0(j, cVar);
        } else {
            if (iO0 == 2) {
                return;
            }
            aa0.c("unexpected result");
        }
    }

    public final int O0(long j, c cVar) {
        qm3 qm3Var;
        Unsafe unsafe;
        if (B.get(this) == 1) {
            return 1;
        }
        A.getClass();
        Unsafe unsafe2 = rxc.a;
        long j2 = C;
        d dVar = (d) unsafe2.getObjectVolatile(this, j2);
        if (dVar == null) {
            d dVar2 = new d();
            dVar2.c = j;
            while (true) {
                unsafe = rxc.a;
                qm3Var = this;
                if (unsafe.compareAndSwapObject(qm3Var, C, (Object) null, dVar2) || unsafe.getObjectVolatile(qm3Var, j2) != null) {
                    break;
                }
                this = qm3Var;
            }
            Object objectVolatile = unsafe.getObjectVolatile(qm3Var, j2);
            objectVolatile.getClass();
            dVar = (d) objectVolatile;
        } else {
            qm3Var = this;
        }
        return cVar.f(j, dVar, qm3Var);
    }

    public final boolean P0(c cVar) {
        A.getClass();
        d dVar = (d) rxc.a.getObjectVolatile(this, C);
        Object obj = null;
        if (dVar != null) {
            synchronized (dVar) {
                Object[] objArr = dVar.a;
                obj = objArr != null ? objArr[0] : null;
            }
            obj = (c) obj;
        }
        return obj == cVar;
    }

    @Override // defpackage.zv2
    public final void Y(long j, e41 e41Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            a aVar = new a(j2 + jNanoTime, e41Var);
            N0(jNanoTime, aVar);
            e41Var.w(new k33(aVar));
        }
    }

    @Override // defpackage.pm3
    public void shutdown() {
        dla.a.set(null);
        B.set(this, 1);
        E0();
        while (A0() <= 0) {
        }
        L0();
    }

    @Override // defpackage.n72
    public final void t0(h72 h72Var, Runnable runnable) {
        G0(runnable);
    }
}
