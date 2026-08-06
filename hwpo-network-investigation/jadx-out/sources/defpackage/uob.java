package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class uob {
    public final AtomicReferenceArray<p9a> a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(uob.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = rxc.a.objectFieldOffset(uob.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(uob.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(uob.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(uob.class, "blockingTasksInBuffer$volatile");

    public final p9a a(p9a p9aVar, boolean z) {
        if (z) {
            return b(p9aVar);
        }
        b.getClass();
        p9a p9aVar2 = (p9a) rxc.a.getAndSetObject(this, f, p9aVar);
        if (p9aVar2 == null) {
            return null;
        }
        return b(p9aVar2);
    }

    public final p9a b(p9a p9aVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return p9aVar;
        }
        if (p9aVar.u) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray<p9a> atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, p9aVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int c() {
        b.getClass();
        Object objectVolatile = rxc.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(cn4 cn4Var) {
        b.getClass();
        p9a p9aVar = (p9a) rxc.a.getAndSetObject(this, f, (Object) null);
        if (p9aVar != null) {
            cn4Var.a(p9aVar);
        }
        while (true) {
            p9a p9aVarF = f();
            if (p9aVarF == null) {
                return;
            } else {
                cn4Var.a(p9aVarF);
            }
        }
    }

    public final p9a e() {
        b.getClass();
        p9a p9aVar = (p9a) rxc.a.getAndSetObject(this, f, (Object) null);
        return p9aVar == null ? f() : p9aVar;
    }

    public final p9a f() {
        p9a andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.a.getAndSet(i2, null)) != null) {
                if (andSet.u) {
                    e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final p9a g() {
        uob uobVar;
        while (true) {
            b.getClass();
            Unsafe unsafe = rxc.a;
            long j = f;
            p9a p9aVar = (p9a) unsafe.getObjectVolatile(this, j);
            if (p9aVar == null || !p9aVar.u) {
                break;
            }
            while (true) {
                Unsafe unsafe2 = rxc.a;
                uobVar = this;
                if (unsafe2.compareAndSwapObject(uobVar, f, p9aVar, (Object) null)) {
                    return p9aVar;
                }
                if (unsafe2.getObjectVolatile(uobVar, j) != p9aVar) {
                    break;
                }
                this = uobVar;
            }
            this = uobVar;
        }
        uob uobVar2 = this;
        int i = d.get(uobVar2);
        int i2 = c.get(uobVar2);
        while (i != i2 && e.get(uobVar2) != 0) {
            i2--;
            p9a p9aVarH = uobVar2.h(i2, true);
            if (p9aVarH != null) {
                return p9aVarH;
            }
        }
        return null;
    }

    public final p9a h(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray<p9a> atomicReferenceArray = this.a;
        p9a p9aVar = atomicReferenceArray.get(i2);
        if (p9aVar != null && p9aVar.u == z) {
            while (!atomicReferenceArray.compareAndSet(i2, p9aVar, null)) {
                if (atomicReferenceArray.get(i2) != p9aVar) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return p9aVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.Object, p9a] */
    public final long i(int i, gl8<p9a> gl8Var) {
        uob uobVar;
        while (true) {
            b.getClass();
            Unsafe unsafe = rxc.a;
            long j = f;
            ?? r7 = (p9a) unsafe.getObjectVolatile(this, j);
            if (r7 == 0) {
                return -2L;
            }
            if (((r7.u ? 1 : 2) & i) == 0) {
                return -2L;
            }
            eaa.f.getClass();
            long jNanoTime = System.nanoTime() - r7.t;
            long j2 = eaa.b;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
            while (true) {
                Unsafe unsafe2 = rxc.a;
                uobVar = this;
                if (unsafe2.compareAndSwapObject(uobVar, f, (Object) r7, (Object) null)) {
                    gl8Var.t = r7;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(uobVar, j) != r7) {
                    break;
                }
                this = uobVar;
            }
            this = uobVar;
        }
    }
}
