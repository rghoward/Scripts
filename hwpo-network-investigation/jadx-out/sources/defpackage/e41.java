package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class e41<T> extends d23<T> implements c41<T>, w72, vjb {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A;
    public static final /* synthetic */ long B;
    public static final /* synthetic */ long C;
    public static final /* synthetic */ AtomicIntegerFieldUpdater y = AtomicIntegerFieldUpdater.newUpdater(e41.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater z = AtomicReferenceFieldUpdater.newUpdater(e41.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final r02<T> w;
    public final h72 x;

    static {
        Unsafe unsafe = rxc.a;
        C = unsafe.objectFieldOffset(e41.class.getDeclaredField("_state$volatile"));
        A = AtomicReferenceFieldUpdater.newUpdater(e41.class, Object.class, "_parentHandle$volatile");
        B = unsafe.objectFieldOffset(e41.class.getDeclaredField("_parentHandle$volatile"));
    }

    public e41(int i, r02 r02Var) {
        super(i);
        this.w = r02Var;
        this.x = r02Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = x8.t;
    }

    public static Object F(kc7 kc7Var, Object obj, int i, ei4 ei4Var) {
        if (obj instanceof jp1) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (ei4Var != null || (kc7Var instanceof v31)) {
            return new hp1(obj, kc7Var instanceof v31 ? (v31) kc7Var : null, ei4Var, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        Throwable thP;
        r02<T> r02Var = this.w;
        a23 a23Var = r02Var instanceof a23 ? (a23) r02Var : null;
        if (a23Var == null || (thP = a23Var.p(this)) == null) {
            return;
        }
        n();
        l(thP);
    }

    public final boolean C() {
        z.getClass();
        Unsafe unsafe = rxc.a;
        long j = C;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof hp1) && ((hp1) objectVolatile).d != null) {
            n();
            return false;
        }
        y.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, x8.t);
        return true;
    }

    public final <R> void D(R r, int i, ei4<? super Throwable, ? super R, ? super h72, g2b> ei4Var) {
        e41<T> e41Var;
        while (true) {
            z.getClass();
            Unsafe unsafe = rxc.a;
            long j = C;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof kc7)) {
                e41<T> e41Var2 = this;
                if (objectVolatile instanceof l41) {
                    l41 l41Var = (l41) objectVolatile;
                    if (l41.c.compareAndSet(l41Var, 0, 1)) {
                        if (ei4Var != null) {
                            e41Var2.k(ei4Var, l41Var.a, r);
                            return;
                        }
                        return;
                    }
                }
                tn2.d(r, "Already resumed, but proposed with update ");
                return;
            }
            Object objF = F((kc7) objectVolatile, r, i, ei4Var);
            while (true) {
                Unsafe unsafe2 = rxc.a;
                e41Var = this;
                if (unsafe2.compareAndSwapObject(e41Var, C, objectVolatile, objF)) {
                    if (!e41Var.y()) {
                        e41Var.n();
                    }
                    e41Var.o(i);
                    return;
                } else if (unsafe2.getObjectVolatile(e41Var, j) != objectVolatile) {
                    break;
                } else {
                    this = e41Var;
                }
            }
            this = e41Var;
        }
    }

    public final void E(n72 n72Var, T t) {
        r02<T> r02Var = this.w;
        a23 a23Var = r02Var instanceof a23 ? (a23) r02Var : null;
        D(t, (a23Var != null ? a23Var.w : null) == n72Var ? 4 : this.v, null);
    }

    public final k7a G(Object obj, ei4 ei4Var) {
        e41<T> e41Var;
        k7a k7aVar = f41.t;
        while (true) {
            z.getClass();
            Unsafe unsafe = rxc.a;
            long j = C;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof kc7)) {
                return null;
            }
            Object objF = F((kc7) objectVolatile, obj, this.v, ei4Var);
            while (true) {
                Unsafe unsafe2 = rxc.a;
                e41Var = this;
                if (unsafe2.compareAndSwapObject(e41Var, C, objectVolatile, objF)) {
                    if (!e41Var.y()) {
                        e41Var.n();
                    }
                    return k7aVar;
                }
                if (unsafe2.getObjectVolatile(e41Var, j) != objectVolatile) {
                    break;
                }
                this = e41Var;
            }
            this = e41Var;
        }
    }

    @Override // defpackage.vjb
    public final void a(g99<?> g99Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = y;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                aa0.c("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        w(g99Var);
    }

    @Override // defpackage.d23
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        e41<T> e41Var;
        while (true) {
            z.getClass();
            Unsafe unsafe = rxc.a;
            long j = C;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof kc7) {
                aa0.c("Not completed");
                return;
            }
            if (objectVolatile instanceof jp1) {
                return;
            }
            if (objectVolatile instanceof hp1) {
                hp1 hp1Var = (hp1) objectVolatile;
                if (hp1Var.e != null) {
                    aa0.c("Must be called at most once");
                    return;
                }
                hp1 hp1VarA = hp1.a(hp1Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = rxc.a;
                    e41<T> e41Var2 = this;
                    if (unsafe2.compareAndSwapObject(e41Var2, C, objectVolatile, hp1VarA)) {
                        v31 v31Var = hp1Var.b;
                        if (v31Var != null) {
                            e41Var2.i(v31Var, cancellationException);
                        }
                        ei4<Throwable, R, h72, g2b> ei4Var = hp1Var.c;
                        if (ei4Var != 0) {
                            e41Var2.k(ei4Var, cancellationException, hp1Var.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(e41Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        e41Var = e41Var2;
                        break;
                    }
                    this = e41Var2;
                }
            } else {
                e41<T> e41Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                hp1 hp1Var2 = new hp1(objectVolatile, (v31) null, (ei4) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    hp1 hp1Var3 = hp1Var2;
                    Unsafe unsafe3 = rxc.a;
                    e41Var = e41Var3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(e41Var, C, objectVolatile, hp1Var3);
                    hp1Var2 = hp1Var3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(e41Var, j) != objectVolatile) {
                        break;
                    } else {
                        e41Var3 = e41Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = e41Var;
        }
    }

    @Override // defpackage.d23
    public final r02<T> c() {
        return this.w;
    }

    @Override // defpackage.d23
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // defpackage.c41
    public final k7a e(Object obj, ei4 ei4Var) {
        return G(obj, ei4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d23
    public final <T> T f(Object obj) {
        return obj instanceof hp1 ? (T) ((hp1) obj).a : obj;
    }

    @Override // defpackage.w72
    public final w72 getCallerFrame() {
        r02<T> r02Var = this.w;
        if (r02Var instanceof w72) {
            return (w72) r02Var;
        }
        return null;
    }

    @Override // defpackage.r02
    public final h72 getContext() {
        return this.x;
    }

    @Override // defpackage.d23
    public final Object h() {
        return s();
    }

    public final void i(v31 v31Var, Throwable th) {
        try {
            v31Var.c(th);
        } catch (Throwable th2) {
            q72.a(this.x, new kp1("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.c41
    public final <R extends T> void j(R r, ei4<? super Throwable, ? super R, ? super h72, g2b> ei4Var) {
        D(r, this.v, ei4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void k(ei4<? super Throwable, ? super R, ? super h72, g2b> ei4Var, Throwable th, R r) {
        h72 h72Var = this.x;
        try {
            ei4Var.invoke(th, r, h72Var);
        } catch (Throwable th2) {
            q72.a(h72Var, new kp1("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.c41
    public final boolean l(Throwable th) {
        Throwable cancellationException;
        e41<T> e41Var;
        while (true) {
            z.getClass();
            Unsafe unsafe = rxc.a;
            long j = C;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof kc7)) {
                return false;
            }
            boolean z2 = (objectVolatile instanceof v31) || (objectVolatile instanceof g99);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            l41 l41Var = new l41(cancellationException, z2);
            while (true) {
                Unsafe unsafe2 = rxc.a;
                e41Var = this;
                if (unsafe2.compareAndSwapObject(e41Var, C, objectVolatile, l41Var)) {
                    kc7 kc7Var = (kc7) objectVolatile;
                    if (kc7Var instanceof v31) {
                        e41Var.i((v31) objectVolatile, th);
                    } else if (kc7Var instanceof g99) {
                        e41Var.m((g99) objectVolatile, th);
                    }
                    if (!e41Var.y()) {
                        e41Var.n();
                    }
                    e41Var.o(e41Var.v);
                    return true;
                }
                if (unsafe2.getObjectVolatile(e41Var, j) != objectVolatile) {
                    break;
                }
                this = e41Var;
            }
            this = e41Var;
        }
    }

    public final void m(g99<?> g99Var, Throwable th) {
        h72 h72Var = this.x;
        int i = y.get(this) & 536870911;
        if (i == 536870911) {
            aa0.c("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            g99Var.m(i, h72Var);
        } catch (Throwable th2) {
            q72.a(h72Var, new kp1("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n() {
        e33 e33VarQ = q();
        if (e33VarQ == null) {
            return;
        }
        e33VarQ.dispose();
        A.getClass();
        rxc.a.putObjectVolatile(this, B, yb7.t);
    }

    public final void o(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = y;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    aa0.c("Already resumed");
                    return;
                }
                boolean z2 = i == 4;
                r02<T> r02Var = this.w;
                if (!z2 && (r02Var instanceof a23)) {
                    boolean z3 = i == 1 || i == 2;
                    int i4 = this.v;
                    if (z3 == (i4 == 1 || i4 == 2)) {
                        a23 a23Var = (a23) r02Var;
                        n72 n72Var = a23Var.w;
                        h72 context = a23Var.x.getContext();
                        if (b23.g(n72Var, context)) {
                            b23.f(n72Var, context, this);
                            return;
                        }
                        pm3 pm3VarA = dla.a();
                        if (pm3VarA.v >= 4294967296L) {
                            pm3VarA.y0(this);
                            return;
                        }
                        pm3VarA.z0(true);
                        try {
                            e23.b(this, r02Var, true);
                            do {
                            } while (pm3VarA.B0());
                        } catch (Throwable th) {
                            try {
                                g(th);
                            } finally {
                                pm3VarA.x0(true);
                            }
                        }
                        return;
                    }
                }
                e23.b(this, r02Var, z2);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable p(ll5 ll5Var) {
        return ll5Var.H();
    }

    public final e33 q() {
        A.getClass();
        return (e33) rxc.a.getObjectVolatile(this, B);
    }

    public final Object r() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        el5 el5Var;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = y;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    aa0.c("Already suspended");
                    return null;
                }
                if (zY) {
                    B();
                }
                Object objS = s();
                if (objS instanceof jp1) {
                    throw ((jp1) objS).a;
                }
                int i3 = this.v;
                if ((i3 != 1 && i3 != 2) || (el5Var = (el5) this.x.d0(el5.a.t)) == null || el5Var.h()) {
                    return f(objS);
                }
                CancellationException cancellationExceptionH = el5Var.H();
                b(cancellationExceptionH);
                throw cancellationExceptionH;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (q() == null) {
            u();
        }
        if (zY) {
            B();
        }
        return v72.t;
    }

    @Override // defpackage.r02
    public final void resumeWith(Object obj) {
        Throwable thA = av8.a(obj);
        if (thA != null) {
            obj = new jp1(thA, false);
        }
        D(obj, this.v, null);
    }

    public final Object s() {
        z.getClass();
        return rxc.a.getObjectVolatile(this, C);
    }

    public final void t() {
        e33 e33VarU = u();
        if (e33VarU == null || (s() instanceof kc7)) {
            return;
        }
        e33VarU.dispose();
        A.getClass();
        rxc.a.putObjectVolatile(this, B, yb7.t);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(ym2.d(this.w));
        sb.append("){");
        Object objS = s();
        if (objS instanceof kc7) {
            str = "Active";
        } else {
            str = objS instanceof l41 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(ym2.c(this));
        return sb.toString();
    }

    public final e33 u() {
        el5 el5Var = (el5) this.x.d0(el5.a.t);
        if (el5Var == null) {
            return null;
        }
        e33 e33VarG = sd.g(el5Var, new zb1(this));
        while (true) {
            A.getClass();
            Unsafe unsafe = rxc.a;
            long j = B;
            e41<T> e41Var = this;
            if (unsafe.compareAndSwapObject(e41Var, j, (Object) null, e33VarG) || unsafe.getObjectVolatile(e41Var, j) != null) {
                break;
            }
            this = e41Var;
        }
        return e33VarG;
    }

    public final void v(oh4<? super Throwable, g2b> oh4Var) {
        w(new v31.a(oh4Var));
    }

    public final void w(kc7 kc7Var) {
        e41<T> e41Var;
        Unsafe unsafe;
        e41<T> e41Var2;
        while (true) {
            z.getClass();
            Unsafe unsafe2 = rxc.a;
            long j = C;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof x8) {
                while (true) {
                    Unsafe unsafe3 = rxc.a;
                    e41Var = this;
                    if (unsafe3.compareAndSwapObject(e41Var, C, objectVolatile, kc7Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(e41Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = e41Var;
                    }
                }
            } else {
                e41Var = this;
                if ((objectVolatile instanceof v31) || (objectVolatile instanceof g99)) {
                    z(kc7Var, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof jp1) {
                    jp1 jp1Var = (jp1) objectVolatile;
                    if (!jp1.b.compareAndSet(jp1Var, 0, 1)) {
                        z(kc7Var, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof l41) {
                        Throwable th = jp1Var.a;
                        if (kc7Var instanceof v31) {
                            e41Var.i((v31) kc7Var, th);
                            return;
                        } else {
                            kc7Var.getClass();
                            e41Var.m((g99) kc7Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof hp1) {
                    hp1 hp1Var = (hp1) objectVolatile;
                    if (hp1Var.b != null) {
                        z(kc7Var, objectVolatile);
                        throw null;
                    }
                    if (kc7Var instanceof g99) {
                        return;
                    }
                    kc7Var.getClass();
                    v31 v31Var = (v31) kc7Var;
                    Throwable th2 = hp1Var.e;
                    if (th2 != null) {
                        e41Var.i(v31Var, th2);
                        return;
                    }
                    hp1 hp1VarA = hp1.a(hp1Var, v31Var, null, 29);
                    do {
                        unsafe = rxc.a;
                        e41Var2 = e41Var;
                        if (unsafe.compareAndSwapObject(e41Var, C, objectVolatile, hp1VarA)) {
                            return;
                        } else {
                            e41Var = e41Var2;
                        }
                    } while (unsafe.getObjectVolatile(e41Var2, j) == objectVolatile);
                } else {
                    e41<T> e41Var3 = e41Var;
                    if (kc7Var instanceof g99) {
                        return;
                    }
                    kc7Var.getClass();
                    hp1 hp1Var2 = new hp1(objectVolatile, (v31) kc7Var, (ei4) null, (Throwable) null, 28);
                    while (true) {
                        hp1 hp1Var3 = hp1Var2;
                        Unsafe unsafe4 = rxc.a;
                        e41Var = e41Var3;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(e41Var, C, objectVolatile, hp1Var3);
                        hp1Var2 = hp1Var3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(e41Var, j) != objectVolatile) {
                            break;
                        } else {
                            e41Var3 = e41Var;
                        }
                    }
                }
            }
            this = e41Var;
        }
    }

    @Override // defpackage.c41
    public final void x(Object obj) {
        o(this.v);
    }

    public final boolean y() {
        if (this.v != 2) {
            return false;
        }
        r02<T> r02Var = this.w;
        r02Var.getClass();
        return ((a23) r02Var).n();
    }
}
