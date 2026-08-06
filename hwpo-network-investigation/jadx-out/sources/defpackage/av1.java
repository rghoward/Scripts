package defpackage;

import defpackage.av1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class av1<N extends av1<N>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(av1.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater u;
    public static final /* synthetic */ long v;
    public static final /* synthetic */ long w;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = rxc.a;
        v = unsafe.objectFieldOffset(av1.class.getDeclaredField("_next$volatile"));
        u = AtomicReferenceFieldUpdater.newUpdater(av1.class, Object.class, "_prev$volatile");
        w = unsafe.objectFieldOffset(av1.class.getDeclaredField("_prev$volatile"));
    }

    public av1(g99 g99Var) {
        this._prev$volatile = g99Var;
    }

    public final void a() {
        u.getClass();
        rxc.a.putObjectVolatile(this, w, (Object) null);
    }

    public final N b() {
        N n = (N) f();
        while (n != null && n.g()) {
            u.getClass();
            n = (N) rxc.a.getObjectVolatile(n, w);
        }
        return n;
    }

    public final N d() {
        Object objE = e();
        if (objE == zu1.t) {
            return null;
        }
        return (N) objE;
    }

    public final Object e() {
        t.getClass();
        return rxc.a.getObjectVolatile(this, v);
    }

    public final N f() {
        u.getClass();
        return (N) rxc.a.getObjectVolatile(this, w);
    }

    public abstract boolean g();

    public final boolean h() {
        k7a k7aVar = zu1.t;
        while (true) {
            t.getClass();
            Unsafe unsafe = rxc.a;
            long j = v;
            av1<N> av1Var = this;
            if (unsafe.compareAndSwapObject(av1Var, j, (Object) null, k7aVar)) {
                return true;
            }
            if (unsafe.getObjectVolatile(av1Var, j) != null) {
                return false;
            }
            this = av1Var;
        }
    }

    public final void i() {
        av1 av1Var;
        Unsafe unsafe;
        if (d() == null) {
            return;
        }
        while (true) {
            av1 av1VarB = b();
            av1 av1VarD = d();
            av1VarD.getClass();
            do {
                av1Var = av1VarD;
                if (!av1Var.g()) {
                    break;
                } else {
                    av1VarD = av1Var.d();
                }
            } while (av1VarD != null);
            while (true) {
                u.getClass();
                Unsafe unsafe2 = rxc.a;
                long j = w;
                Object objectVolatile = unsafe2.getObjectVolatile(av1Var, j);
                av1 av1Var2 = ((av1) objectVolatile) == null ? null : av1VarB;
                while (true) {
                    unsafe = rxc.a;
                    if (unsafe.compareAndSwapObject(av1Var, w, objectVolatile, av1Var2)) {
                        break;
                    } else if (unsafe.getObjectVolatile(av1Var, j) != objectVolatile) {
                    }
                }
            }
            if (av1VarB != null) {
                t.getClass();
                unsafe.putObjectVolatile(av1VarB, v, av1Var);
            }
            if (!av1Var.g() || av1Var.d() == null) {
                if (av1VarB == null || !av1VarB.g()) {
                    return;
                }
            }
        }
    }

    public final boolean j(g99 g99Var) {
        while (true) {
            t.getClass();
            Unsafe unsafe = rxc.a;
            long j = v;
            av1<N> av1Var = this;
            g99 g99Var2 = g99Var;
            if (unsafe.compareAndSwapObject(av1Var, j, (Object) null, g99Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(av1Var, j) != null) {
                return false;
            }
            this = av1Var;
            g99Var = g99Var2;
        }
    }
}
