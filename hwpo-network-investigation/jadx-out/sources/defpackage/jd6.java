package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jd6<E> {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(jd6.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long h = rxc.a.objectFieldOffset(jd6.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(jd6.class, "_state$volatile");
    public static final k7a g = new k7a("REMOVE_FROZEN");

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    public jd6(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            aa0.c("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        aa0.c("Check failed.");
        throw null;
    }

    public final int a(E e2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                jd6<E> jd6Var = this;
                if (f.compareAndSet(jd6Var, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, e2);
                    jd6<E> jd6VarD = jd6Var;
                    while ((atomicLongFieldUpdater.get(jd6VarD) & 1152921504606846976L) != 0) {
                        jd6VarD = jd6VarD.d();
                        AtomicReferenceArray atomicReferenceArray2 = jd6VarD.d;
                        int i4 = jd6VarD.c & i2;
                        Object obj = atomicReferenceArray2.get(i4);
                        if ((obj instanceof a) && ((a) obj).a == i2) {
                            atomicReferenceArray2.set(i4, e2);
                        } else {
                            jd6VarD = null;
                        }
                        if (jd6VarD == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = jd6Var;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final jd6<E> b(long j) {
        jd6<E> jd6Var;
        while (true) {
            e.getClass();
            Unsafe unsafe = rxc.a;
            long j2 = h;
            jd6<E> jd6Var2 = (jd6) unsafe.getObjectVolatile(this, j2);
            if (jd6Var2 != null) {
                return jd6Var2;
            }
            jd6 jd6Var3 = new jd6(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object aVar = this.d.get(i4);
                if (aVar == null) {
                    aVar = new a(i);
                }
                jd6Var3.d.set(jd6Var3.c & i, aVar);
                i++;
            }
            f.set(jd6Var3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = rxc.a;
                jd6Var = this;
                if (unsafe2.compareAndSwapObject(jd6Var, h, (Object) null, jd6Var3) || unsafe2.getObjectVolatile(jd6Var, j2) != null) {
                    break;
                }
                this = jd6Var;
            }
            this = jd6Var;
        }
    }

    public final boolean c() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            jd6<E> jd6Var = this;
            if (atomicLongFieldUpdater.compareAndSet(jd6Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = jd6Var;
        }
    }

    public final jd6<E> d() {
        long j;
        jd6<E> jd6Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                jd6Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            jd6Var = this;
            if (atomicLongFieldUpdater.compareAndSet(jd6Var, j, j2)) {
                j = j2;
                break;
            }
            this = jd6Var;
        }
        return jd6Var.b(j);
    }

    public final Object e() {
        jd6<E> jd6VarD = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(jd6VarD);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = jd6VarD.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) != i3) {
                AtomicReferenceArray atomicReferenceArray = jd6VarD.d;
                Object obj = atomicReferenceArray.get(i3);
                boolean z = jd6VarD.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof a)) {
                    long j2 = (i + 1) & 1073741823;
                    if (f.compareAndSet(jd6VarD, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i3, null);
                        return obj;
                    }
                    jd6VarD = this;
                    if (z) {
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(jd6VarD);
                            int i4 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                jd6VarD = jd6VarD.d();
                            } else {
                                jd6<E> jd6Var = jd6VarD;
                                if (f.compareAndSet(jd6Var, j3, (j3 & (-1073741824)) | j2)) {
                                    jd6Var.d.set(i4 & jd6Var.c, null);
                                    jd6VarD = null;
                                } else {
                                    jd6VarD = jd6Var;
                                }
                            }
                            if (jd6VarD == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
