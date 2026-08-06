package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class nc9 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(nc9.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final /* synthetic */ AtomicIntegerFieldUpdater g;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final mc9 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements ci4<Long, qc9, qc9> {
        public static final a t = new a(2, pc9.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);

        @Override // defpackage.ci4
        public final qc9 invoke(Long l, qc9 qc9Var) {
            int i = pc9.a;
            return new qc9(l.longValue(), qc9Var, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements ci4<Long, qc9, qc9> {
        public static final b t = new b(2, pc9.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);

        @Override // defpackage.ci4
        public final qc9 invoke(Long l, qc9 qc9Var) {
            int i = pc9.a;
            return new qc9(l.longValue(), qc9Var, 0);
        }
    }

    static {
        Unsafe unsafe = rxc.a;
        h = unsafe.objectFieldOffset(nc9.class.getDeclaredField("head$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(nc9.class, "deqIdx$volatile");
        e = AtomicReferenceFieldUpdater.newUpdater(nc9.class, Object.class, "tail$volatile");
        i = unsafe.objectFieldOffset(nc9.class.getDeclaredField("tail$volatile"));
        f = AtomicLongFieldUpdater.newUpdater(nc9.class, "enqIdx$volatile");
        g = AtomicIntegerFieldUpdater.newUpdater(nc9.class, "_availablePermits$volatile");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [mc9] */
    public nc9(int i2) {
        this.a = i2;
        if (i2 <= 0) {
            ca0.a(pp2.a(i2, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i2 < 0) {
            ca0.a(pp2.a(i2, "The number of acquired permits should be in 0.."));
            throw null;
        }
        qc9 qc9Var = new qc9(0L, null, 2);
        this.head$volatile = qc9Var;
        this.tail$volatile = qc9Var;
        this._availablePermits$volatile = i2;
        this.b = new ei4() { // from class: mc9
            @Override // defpackage.ei4
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                this.t.a();
                return g2b.a;
            }
        };
    }

    public final void a() {
        int i2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i3 = this.a;
            if (andIncrement >= i3) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i3));
                t65.b(i3, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!f());
    }

    public final Object d(jq0.c cVar) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i2;
        do {
            atomicIntegerFieldUpdater = g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i2 = this.a;
        } while (andDecrement > i2);
        if (andDecrement > 0) {
            return g2b.a;
        }
        e41 e41VarB = g41.b(th0.e(cVar));
        try {
            if (!e(e41VarB)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i2) {
                        if (andDecrement2 > 0) {
                            e41VarB.j(g2b.a, this.b);
                            break;
                        }
                        if (e(e41VarB)) {
                            break;
                        }
                    }
                }
            }
            Object objR = e41VarB.r();
            v72 v72Var = v72.t;
            if (objR != v72Var) {
                objR = g2b.a;
            }
            return objR == v72Var ? objR : g2b.a;
        } catch (Throwable th) {
            e41VarB.B();
            throw th;
        }
    }

    public final boolean e(vjb vjbVar) {
        Object objB;
        Unsafe unsafe;
        nc9 nc9Var = this;
        e.getClass();
        Unsafe unsafe2 = rxc.a;
        long j = i;
        qc9 qc9Var = (qc9) unsafe2.getObjectVolatile(nc9Var, j);
        long andIncrement = f.getAndIncrement(nc9Var);
        a aVar = a.t;
        long j2 = andIncrement / ((long) pc9.f);
        loop0: while (true) {
            objB = zu1.b(qc9Var, j2, aVar);
            if (qk1.c(objB)) {
                break;
            }
            g99 g99VarB = qk1.b(objB);
            while (true) {
                g99 g99Var = (g99) rxc.a.getObjectVolatile(nc9Var, j);
                if (g99Var.x >= g99VarB.x) {
                    nc9Var = this;
                    break loop0;
                }
                if (!g99VarB.o()) {
                    break;
                }
                do {
                    unsafe = rxc.a;
                    nc9Var = this;
                    if (unsafe.compareAndSwapObject(nc9Var, i, g99Var, g99VarB)) {
                        if (!g99Var.k()) {
                            break loop0;
                        }
                        g99Var.i();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(nc9Var, j) == g99Var);
                if (g99VarB.k()) {
                    g99VarB.i();
                }
            }
            nc9Var = this;
        }
        qc9 qc9Var2 = (qc9) qk1.b(objB);
        AtomicReferenceArray atomicReferenceArray = qc9Var2.z;
        int i2 = (int) (andIncrement % ((long) pc9.f));
        while (!atomicReferenceArray.compareAndSet(i2, null, vjbVar)) {
            if (atomicReferenceArray.get(i2) != null) {
                k7a k7aVar = pc9.b;
                k7a k7aVar2 = pc9.c;
                while (!atomicReferenceArray.compareAndSet(i2, k7aVar, k7aVar2)) {
                    if (atomicReferenceArray.get(i2) != k7aVar) {
                        return false;
                    }
                }
                ((c41) vjbVar).j(g2b.a, nc9Var.b);
                return true;
            }
        }
        vjbVar.a(qc9Var2, i2);
        return true;
    }

    public final boolean f() {
        Object objB;
        Unsafe unsafe;
        c.getClass();
        Unsafe unsafe2 = rxc.a;
        long j = h;
        qc9 qc9Var = (qc9) unsafe2.getObjectVolatile(this, j);
        long andIncrement = d.getAndIncrement(this);
        long j2 = andIncrement / ((long) pc9.f);
        b bVar = b.t;
        loop0: while (true) {
            objB = zu1.b(qc9Var, j2, bVar);
            if (qk1.c(objB)) {
                break;
            }
            g99 g99VarB = qk1.b(objB);
            while (true) {
                g99 g99Var = (g99) rxc.a.getObjectVolatile(this, j);
                if (g99Var.x >= g99VarB.x) {
                    break loop0;
                }
                if (!g99VarB.o()) {
                    break;
                }
                do {
                    unsafe = rxc.a;
                    if (unsafe.compareAndSwapObject(this, h, g99Var, g99VarB)) {
                        if (!g99Var.k()) {
                            break loop0;
                        }
                        g99Var.i();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == g99Var);
                if (g99VarB.k()) {
                    g99VarB.i();
                }
            }
        }
        qc9 qc9Var2 = (qc9) qk1.b(objB);
        AtomicReferenceArray atomicReferenceArray = qc9Var2.z;
        qc9Var2.a();
        boolean z = false;
        if (qc9Var2.x <= j2) {
            int i2 = (int) (andIncrement % ((long) pc9.f));
            Object andSet = atomicReferenceArray.getAndSet(i2, pc9.b);
            if (andSet == null) {
                int i3 = pc9.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (atomicReferenceArray.get(i2) == pc9.c) {
                        return true;
                    }
                }
                k7a k7aVar = pc9.b;
                k7a k7aVar2 = pc9.d;
                while (!atomicReferenceArray.compareAndSet(i2, k7aVar, k7aVar2)) {
                    if (atomicReferenceArray.get(i2) != k7aVar) {
                        return !z;
                    }
                }
                z = true;
                return !z;
            }
            if (andSet != pc9.e) {
                if (!(andSet instanceof c41)) {
                    if (andSet instanceof p99) {
                        return ((p99) andSet).b(this, g2b.a);
                    }
                    tn2.d(andSet, "unexpected: ");
                    return false;
                }
                c41 c41Var = (c41) andSet;
                k7a k7aVarE = c41Var.e(g2b.a, this.b);
                if (k7aVarE != null) {
                    c41Var.x(k7aVarE);
                    return true;
                }
            }
        }
        return false;
    }
}
