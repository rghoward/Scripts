package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class s72 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater A = AtomicLongFieldUpdater.newUpdater(s72.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater B = AtomicLongFieldUpdater.newUpdater(s72.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater C = AtomicIntegerFieldUpdater.newUpdater(s72.class, "_isTerminated$volatile");
    public static final k7a D = new k7a("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final int t;
    public final int u;
    public final long v;
    public final String w;
    public final cn4 x;
    public final cn4 y;
    public final gt8<a> z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public final uob t;
        public final gl8<p9a> u;
        public b v;
        public long w;
        private volatile /* synthetic */ int workerCtl$volatile;
        public long x;
        public int y;
        public boolean z;

        public a() {
            throw null;
        }

        public a(int i) {
            setDaemon(true);
            setContextClassLoader(s72.class.getClassLoader());
            this.t = new uob();
            this.u = new gl8<>();
            this.v = b.w;
            this.nextParkedWorker = s72.D;
            int iNanoTime = (int) System.nanoTime();
            this.y = iNanoTime == 0 ? 42 : iNanoTime;
            f(i);
        }

        public final p9a a(boolean z) {
            p9a p9aVarE;
            p9a p9aVarE2;
            long j;
            b bVar = this.v;
            s72 s72Var = s72.this;
            uob uobVar = this.t;
            b bVar2 = b.t;
            if (bVar != bVar2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = s72.B;
                do {
                    j = atomicLongFieldUpdater.get(s72Var);
                    if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                        p9a p9aVarG = uobVar.g();
                        return (p9aVarG == null && (p9aVarG = s72Var.y.d()) == null) ? i(1) : p9aVarG;
                    }
                } while (!s72.B.compareAndSet(s72Var, j, j - 4398046511104L));
                this.v = bVar2;
            }
            if (z) {
                boolean z2 = d(s72Var.t * 2) == 0;
                if (z2 && (p9aVarE2 = e()) != null) {
                    return p9aVarE2;
                }
                p9a p9aVarE3 = uobVar.e();
                if (p9aVarE3 != null) {
                    return p9aVarE3;
                }
                if (!z2 && (p9aVarE = e()) != null) {
                    return p9aVarE;
                }
            } else {
                p9a p9aVarE4 = e();
                if (p9aVarE4 != null) {
                    return p9aVarE4;
                }
            }
            return i(3);
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i) {
            int i2 = this.y;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.y = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
        }

        public final p9a e() {
            int iD = d(2);
            s72 s72Var = s72.this;
            if (iD == 0) {
                p9a p9aVarD = s72Var.x.d();
                return p9aVarD != null ? p9aVarD : s72Var.y.d();
            }
            p9a p9aVarD2 = s72Var.y.d();
            return p9aVarD2 != null ? p9aVarD2 : s72Var.x.d();
        }

        public final void f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(s72.this.w);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(b bVar) {
            b bVar2 = this.v;
            boolean z = bVar2 == b.t;
            if (z) {
                s72.B.addAndGet(s72.this, 4398046511104L);
            }
            if (bVar2 != bVar) {
                this.v = bVar;
            }
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v11, types: [p9a] */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6, types: [p9a] */
        public final p9a i(int i) {
            T tH;
            long jI;
            AtomicLongFieldUpdater atomicLongFieldUpdater = s72.B;
            s72 s72Var = s72.this;
            int i2 = (int) (atomicLongFieldUpdater.get(s72Var) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int iD = d(i2);
            long jMin = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                iD++;
                if (iD > i2) {
                    iD = 1;
                }
                a aVarB = s72Var.z.b(iD);
                if (aVarB != null && aVarB != this) {
                    uob uobVar = aVarB.t;
                    uobVar.getClass();
                    if (i != 3) {
                        boolean z = i == 1;
                        int i4 = uob.d.get(uobVar);
                        int i5 = uob.c.get(uobVar);
                        while (true) {
                            if (i4 == i5 || (z && uob.e.get(uobVar) == 0)) {
                                tH = 0;
                                break;
                            }
                            int i6 = i4 + 1;
                            tH = uobVar.h(i4, z);
                            if (tH != 0) {
                                break;
                            }
                            i4 = i6;
                        }
                    } else {
                        tH = uobVar.f();
                    }
                    gl8<p9a> gl8Var = this.u;
                    if (tH != 0) {
                        gl8Var.t = tH;
                        jI = -1;
                    } else {
                        jI = uobVar.i(i, gl8Var);
                    }
                    if (jI == -1) {
                        p9a p9aVar = gl8Var.t;
                        gl8Var.t = null;
                        return p9aVar;
                    }
                    if (jI > 0) {
                        jMin = Math.min(jMin, jI);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.x = jMin;
            return null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            long j;
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    s72 s72Var = s72.this;
                    s72Var.getClass();
                    if (s72.C.get(s72Var) != 1) {
                        b bVar = this.v;
                        b bVar2 = b.x;
                        if (bVar == bVar2) {
                            break loop0;
                        }
                        p9a p9aVarA = a(this.z);
                        if (p9aVarA != null) {
                            this.x = 0L;
                            s72 s72Var2 = s72.this;
                            this.w = 0L;
                            if (this.v == b.v) {
                                this.v = b.u;
                            }
                            if (!p9aVarA.u) {
                                s72Var2.getClass();
                                try {
                                    p9aVarA.run();
                                    break;
                                } catch (Throwable th) {
                                    Thread threadCurrentThread = Thread.currentThread();
                                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                    break;
                                }
                            }
                            if (h(b.u) && !s72Var2.v() && !s72Var2.u(s72.B.get(s72Var2))) {
                                s72Var2.v();
                            }
                            s72Var2.getClass();
                            try {
                                p9aVarA.run();
                            } catch (Throwable th2) {
                                Thread threadCurrentThread2 = Thread.currentThread();
                                threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                            }
                            s72.B.addAndGet(s72Var2, -2097152L);
                            if (this.v == bVar2) {
                                break;
                            }
                            this.v = b.w;
                            break;
                        }
                        this.z = false;
                        if (this.x == 0) {
                            Object obj = this.nextParkedWorker;
                            k7a k7aVar = s72.D;
                            if (obj != k7aVar) {
                                B.set(this, -1);
                                while (this.nextParkedWorker != s72.D) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = B;
                                    if (atomicIntegerFieldUpdater.get(this) != -1) {
                                        break;
                                    }
                                    s72 s72Var3 = s72.this;
                                    s72Var3.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = s72.C;
                                    if (atomicIntegerFieldUpdater2.get(s72Var3) == 1) {
                                        break;
                                    }
                                    b bVar3 = this.v;
                                    b bVar4 = b.x;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.v);
                                    Thread.interrupted();
                                    if (this.w == 0) {
                                        j = 2097151;
                                        this.w = System.nanoTime() + s72.this.v;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(s72.this.v);
                                    if (System.nanoTime() - this.w >= 0) {
                                        this.w = 0L;
                                        s72 s72Var4 = s72.this;
                                        synchronized (s72Var4.z) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(s72Var4) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = s72.B;
                                                    if (((int) (atomicLongFieldUpdater.get(s72Var4) & j)) > s72Var4.t && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        f(0);
                                                        s72Var4.t(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(s72Var4) & j);
                                                        if (andDecrement != i) {
                                                            a aVarB = s72Var4.z.b(andDecrement);
                                                            aVarB.getClass();
                                                            a aVar = aVarB;
                                                            s72Var4.z.c(i, aVar);
                                                            aVar.f(i);
                                                            s72Var4.t(aVar, andDecrement, i);
                                                        }
                                                        s72Var4.z.c(andDecrement, null);
                                                        g2b g2bVar = g2b.a;
                                                        this.v = bVar4;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            } else {
                                s72 s72Var5 = s72.this;
                                s72Var5.getClass();
                                if (this.nextParkedWorker == k7aVar) {
                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = s72.A;
                                    while (true) {
                                        long j2 = atomicLongFieldUpdater2.get(s72Var5);
                                        int i2 = this.indexInArray;
                                        this.nextParkedWorker = s72Var5.z.b((int) (j2 & 2097151));
                                        s72 s72Var6 = s72Var5;
                                        if (s72.A.compareAndSet(s72Var6, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                            break;
                                        } else {
                                            s72Var5 = s72Var6;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (z) {
                                h(b.v);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.x);
                                this.x = 0L;
                                break;
                            }
                            z = true;
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            h(b.x);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final b t;
        public static final b u;
        public static final b v;
        public static final b w;
        public static final b x;
        public static final /* synthetic */ b[] y;

        static {
            b bVar = new b("CPU_ACQUIRED", 0);
            t = bVar;
            b bVar2 = new b("BLOCKING", 1);
            u = bVar2;
            b bVar3 = new b("PARKING", 2);
            v = bVar3;
            b bVar4 = new b("DORMANT", 3);
            w = bVar4;
            b bVar5 = new b("TERMINATED", 4);
            x = bVar5;
            y = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) y.clone();
        }
    }

    public s72(String str, int i, long j, int i2) {
        this.t = i;
        this.u = i2;
        this.v = j;
        this.w = str;
        if (i < 1) {
            ca0.a(pk.d(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            ca0.a(u.a(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            ca0.a(pk.d(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            eo2.a("Idle worker keep alive time ", j, " must be positive");
            throw null;
        }
        this.x = new cn4();
        this.y = new cn4();
        this.z = new gt8<>((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    public static /* synthetic */ void p(s72 s72Var, Runnable runnable, int i) {
        s72Var.k(runnable, false, (i & 4) == 0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        p9a p9aVarD;
        if (C.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = null;
            a aVar2 = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar2 != null && xj5.a(s72.this, this)) {
                aVar = aVar2;
            }
            synchronized (this.z) {
                i = (int) (B.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    a aVarB = this.z.b(i2);
                    aVarB.getClass();
                    a aVar3 = aVarB;
                    if (aVar3 != aVar) {
                        while (aVar3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar3);
                            aVar3.join(10000L);
                        }
                        aVar3.t.d(this.y);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.y.b();
            this.x.b();
            while (true) {
                if (aVar != null) {
                    p9aVarD = aVar.a(true);
                    if (p9aVarD == null) {
                        p9aVarD = this.x.d();
                        if (p9aVarD == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    p9aVarD = this.x.d();
                    if (p9aVarD == null && (p9aVarD = this.y.d()) == null) {
                        break;
                    }
                }
                try {
                    p9aVarD.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(b.x);
            }
            A.set(this, 0L);
            B.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p(this, runnable, 6);
    }

    public final int h() {
        synchronized (this.z) {
            try {
                if (C.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = B;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.t) {
                    return 0;
                }
                if (i >= this.u) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.z.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(i3);
                this.z.c(i3, aVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                aVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(Runnable runnable, boolean z, boolean z2) {
        p9a v9aVar;
        b bVar;
        eaa.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof p9a) {
            v9aVar = (p9a) runnable;
            v9aVar.t = jNanoTime;
            v9aVar.u = z;
        } else {
            v9aVar = new v9a(runnable, jNanoTime, z);
        }
        boolean z3 = v9aVar.u;
        AtomicLongFieldUpdater atomicLongFieldUpdater = B;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = null;
        a aVar2 = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar2 != null && xj5.a(s72.this, this)) {
            aVar = aVar2;
        }
        if (aVar != null && (bVar = aVar.v) != b.x && (v9aVar.u || bVar != b.u)) {
            aVar.z = true;
            v9aVar = aVar.t.a(v9aVar, z2);
        }
        if (v9aVar != null) {
            if (!(v9aVar.u ? this.y.a(v9aVar) : this.x.a(v9aVar))) {
                throw new RejectedExecutionException(av.a(new StringBuilder(), this.w, " was terminated"));
            }
        }
        if (z3) {
            if (v() || u(jAddAndGet)) {
                return;
            }
            v();
            return;
        }
        if (v() || u(atomicLongFieldUpdater.get(this))) {
            return;
        }
        v();
    }

    public final void t(a aVar, int i, int i2) {
        while (true) {
            long j = A.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == D) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                s72 s72Var = this;
                if (A.compareAndSet(s72Var, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = s72Var;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        gt8<a> gt8Var = this.z;
        int iA = gt8Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            a aVarB = gt8Var.b(i6);
            if (aVarB != null) {
                int iC = aVarB.t.c();
                int iOrdinal = aVarB.v.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iC);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iC);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iC > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iC);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        u.b();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = B.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.w);
        sb4.append('@');
        sb4.append(ym2.c(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.t;
        sb4.append(i7);
        sb4.append(", max = ");
        p23.a(sb4, this.u, "}, Worker States {CPU = ", i, ", blocking = ");
        p23.a(sb4, i2, ", parked = ", i3, ", dormant = ");
        p23.a(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.x.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.y.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean u(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.t;
        if (i < i2) {
            int iH = h();
            if (iH == 1 && i2 > 1) {
                h();
            }
            if (iH > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        s72 s72Var;
        k7a k7aVar;
        int iB;
        while (true) {
            long j = A.get(this);
            a aVarB = this.z.b((int) (2097151 & j));
            if (aVarB == null) {
                aVarB = null;
                s72Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = aVarB.c();
                while (true) {
                    k7aVar = D;
                    if (objC == k7aVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar = (a) objC;
                    iB = aVar.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar.c();
                    j = j;
                }
                if (iB >= 0) {
                    s72 s72Var2 = this;
                    boolean zCompareAndSet = A.compareAndSet(s72Var2, j, ((long) iB) | j2);
                    s72Var = s72Var2;
                    if (zCompareAndSet) {
                        aVarB.g(k7aVar);
                    }
                    this = s72Var;
                } else {
                    continue;
                }
            }
            if (aVarB == null) {
                return false;
            }
            if (a.B.compareAndSet(aVarB, -1, 0)) {
                LockSupport.unpark(aVarB);
                return true;
            }
            this = s72Var;
        }
    }
}
