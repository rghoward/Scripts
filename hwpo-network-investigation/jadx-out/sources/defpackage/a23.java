package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a23<T> extends d23<T> implements w72, r02<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(a23.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long B = rxc.a.objectFieldOffset(a23.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final n72 w;
    public final u02 x;
    public Object y;
    public final Object z;

    public a23(n72 n72Var, u02 u02Var) {
        super(-1);
        this.w = n72Var;
        this.x = u02Var;
        this.y = b23.a;
        this.z = cla.b(u02Var.getContext());
    }

    @Override // defpackage.w72
    public final w72 getCallerFrame() {
        u02 u02Var = this.x;
        if (u02Var != null) {
            return u02Var;
        }
        return null;
    }

    @Override // defpackage.r02
    public final h72 getContext() {
        return this.x.getContext();
    }

    @Override // defpackage.d23
    public final Object h() {
        Object obj = this.y;
        this.y = b23.a;
        return obj;
    }

    public final void i() {
        do {
            A.getClass();
        } while (rxc.a.getObjectVolatile(this, B) == b23.b);
    }

    public final e41<T> k() {
        a23<T> a23Var;
        while (true) {
            A.getClass();
            Unsafe unsafe = rxc.a;
            long j = B;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            k7a k7aVar = b23.b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, k7aVar);
                return null;
            }
            if (objectVolatile instanceof e41) {
                while (true) {
                    Unsafe unsafe2 = rxc.a;
                    a23Var = this;
                    if (unsafe2.compareAndSwapObject(a23Var, B, objectVolatile, k7aVar)) {
                        return (e41) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(a23Var, j) != objectVolatile) {
                        break;
                    }
                    this = a23Var;
                }
            } else {
                a23Var = this;
                if (objectVolatile != k7aVar && !(objectVolatile instanceof Throwable)) {
                    tn2.d(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = a23Var;
        }
    }

    public final e41<?> m() {
        A.getClass();
        Object objectVolatile = rxc.a.getObjectVolatile(this, B);
        if (objectVolatile instanceof e41) {
            return (e41) objectVolatile;
        }
        return null;
    }

    public final boolean n() {
        A.getClass();
        return rxc.a.getObjectVolatile(this, B) != null;
    }

    public final boolean o(Throwable th) {
        a23<T> a23Var;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            A.getClass();
            Unsafe unsafe2 = rxc.a;
            long j = B;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            k7a k7aVar = b23.b;
            if (xj5.a(objectVolatile, k7aVar)) {
                while (true) {
                    Unsafe unsafe3 = rxc.a;
                    a23<T> a23Var2 = this;
                    th2 = th;
                    a23Var = a23Var2;
                    if (unsafe3.compareAndSwapObject(a23Var2, B, k7aVar, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(a23Var, j) != k7aVar) {
                        break;
                    }
                    this = a23Var;
                    th = th2;
                }
            } else {
                a23Var = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = rxc.a;
                    if (unsafe.compareAndSwapObject(a23Var, B, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(a23Var, j) == objectVolatile);
            }
            this = a23Var;
            th = th2;
        }
    }

    public final Throwable p(e41 e41Var) {
        Unsafe unsafe;
        a23<T> a23Var;
        e41 e41Var2;
        while (true) {
            A.getClass();
            Unsafe unsafe2 = rxc.a;
            long j = B;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            k7a k7aVar = b23.b;
            if (objectVolatile != k7aVar) {
                a23<T> a23Var2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    tn2.d(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = rxc.a;
                    if (unsafe.compareAndSwapObject(a23Var2, B, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(a23Var2, j) == objectVolatile);
                z90.a("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = rxc.a;
                a23Var = this;
                e41Var2 = e41Var;
                if (unsafe3.compareAndSwapObject(a23Var, B, k7aVar, e41Var2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(a23Var, j) != k7aVar) {
                    break;
                }
                this = a23Var;
                e41Var = e41Var2;
            }
            this = a23Var;
            e41Var = e41Var2;
        }
    }

    @Override // defpackage.r02
    public final void resumeWith(Object obj) {
        Throwable thA = av8.a(obj);
        Object jp1Var = thA == null ? obj : new jp1(thA, false);
        u02 u02Var = this.x;
        h72 context = u02Var.getContext();
        n72 n72Var = this.w;
        if (b23.g(n72Var, context)) {
            this.y = jp1Var;
            this.v = 0;
            b23.f(n72Var, u02Var.getContext(), this);
            return;
        }
        pm3 pm3VarA = dla.a();
        if (pm3VarA.v >= 4294967296L) {
            this.y = jp1Var;
            this.v = 0;
            pm3VarA.y0(this);
            return;
        }
        pm3VarA.z0(true);
        try {
            h72 context2 = u02Var.getContext();
            Object objC = cla.c(context2, this.z);
            try {
                u02Var.resumeWith(obj);
                g2b g2bVar = g2b.a;
                cla.a(context2, objC);
                while (pm3VarA.B0()) {
                }
            } catch (Throwable th) {
                cla.a(context2, objC);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                g(th2);
            } finally {
                pm3VarA.x0(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.w + ", " + ym2.d(this.x) + ']';
    }

    @Override // defpackage.d23
    public final r02<T> c() {
        return this;
    }
}
