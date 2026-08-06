package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class hd6 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(hd6.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater u;
    public static final /* synthetic */ AtomicReferenceFieldUpdater v;
    public static final /* synthetic */ long w;
    public static final /* synthetic */ long x;
    public static final /* synthetic */ long y;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends me8 {
        @Override // defpackage.eo5
        public final Object get() {
            return this.receiver.getClass().getSimpleName();
        }
    }

    static {
        Unsafe unsafe = rxc.a;
        w = unsafe.objectFieldOffset(hd6.class.getDeclaredField("_next$volatile"));
        u = AtomicReferenceFieldUpdater.newUpdater(hd6.class, Object.class, "_prev$volatile");
        x = unsafe.objectFieldOffset(hd6.class.getDeclaredField("_prev$volatile"));
        v = AtomicReferenceFieldUpdater.newUpdater(hd6.class, Object.class, "_removedRef$volatile");
        y = unsafe.objectFieldOffset(hd6.class.getDeclaredField("_removedRef$volatile"));
    }

    public static hd6 g(hd6 hd6Var) {
        while (hd6Var.m()) {
            u.getClass();
            hd6Var = (hd6) rxc.a.getObjectVolatile(hd6Var, x);
        }
        return hd6Var;
    }

    public final boolean c(hd6 hd6Var, int i) {
        hd6 hd6VarL;
        do {
            hd6VarL = l();
            if (hd6VarL instanceof g96) {
                return (((g96) hd6VarL).z & i) == 0 && hd6VarL.c(hd6Var, i);
            }
        } while (!hd6VarL.d(hd6Var, this));
        return true;
    }

    public final boolean d(hd6 hd6Var, hd6 hd6Var2) {
        u.getClass();
        Unsafe unsafe = rxc.a;
        unsafe.putObjectVolatile(hd6Var, x, this);
        t.getClass();
        long j = w;
        unsafe.putObjectVolatile(hd6Var, j, hd6Var2);
        while (true) {
            Unsafe unsafe2 = rxc.a;
            hd6 hd6Var3 = this;
            hd6 hd6Var4 = hd6Var;
            hd6 hd6Var5 = hd6Var2;
            if (unsafe2.compareAndSwapObject(hd6Var3, w, hd6Var5, hd6Var4)) {
                hd6Var4.i(hd6Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(hd6Var3, j) != hd6Var5) {
                return false;
            }
            this = hd6Var3;
            hd6Var2 = hd6Var5;
            hd6Var = hd6Var4;
        }
    }

    public final void e(rb7 rb7Var) {
        hd6 hd6Var;
        rb7 rb7Var2;
        u.getClass();
        Unsafe unsafe = rxc.a;
        unsafe.putObjectVolatile(rb7Var, x, this);
        t.getClass();
        long j = w;
        unsafe.putObjectVolatile(rb7Var, j, this);
        while (this.j() == this) {
            while (true) {
                Unsafe unsafe2 = rxc.a;
                hd6Var = this;
                rb7Var2 = rb7Var;
                if (unsafe2.compareAndSwapObject(hd6Var, w, this, rb7Var2)) {
                    rb7Var2.i(hd6Var);
                    return;
                } else {
                    if (unsafe2.getObjectVolatile(hd6Var, j) != hd6Var) {
                        break;
                    }
                    this = hd6Var;
                    rb7Var = rb7Var2;
                }
            }
            this = hd6Var;
            rb7Var = rb7Var2;
        }
    }

    public final hd6 f() {
        while (true) {
            u.getClass();
            Unsafe unsafe = rxc.a;
            long j = x;
            hd6 hd6Var = (hd6) unsafe.getObjectVolatile(this, j);
            hd6 hd6Var2 = null;
            hd6 hd6Var3 = hd6Var;
            while (true) {
                t.getClass();
                if (hd6Var3 == null) {
                    throw new ClassCastException();
                }
                Unsafe unsafe2 = rxc.a;
                long j2 = w;
                Object objectVolatile = unsafe2.getObjectVolatile(hd6Var3, j2);
                if (objectVolatile == this) {
                    if (hd6Var != hd6Var3) {
                        while (true) {
                            Unsafe unsafe3 = rxc.a;
                            hd6 hd6Var4 = this;
                            boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(hd6Var4, x, hd6Var, hd6Var3);
                            hd6 hd6Var5 = hd6Var;
                            this = hd6Var4;
                            if (!zCompareAndSwapObject) {
                                if (unsafe3.getObjectVolatile(this, j) != hd6Var5) {
                                    break;
                                }
                                this = this;
                                hd6Var = hd6Var5;
                            }
                        }
                    }
                    return hd6Var3;
                }
                hd6Var = hd6Var;
                this = this;
                if (this.m()) {
                    return null;
                }
                if (!(objectVolatile instanceof jn8)) {
                    objectVolatile.getClass();
                    hd6Var2 = hd6Var3;
                    hd6Var3 = (hd6) objectVolatile;
                } else if (hd6Var2 != null) {
                    hd6 hd6Var6 = ((jn8) objectVolatile).a;
                    while (true) {
                        hd6 hd6Var7 = hd6Var3;
                        Unsafe unsafe4 = rxc.a;
                        boolean zCompareAndSwapObject2 = unsafe4.compareAndSwapObject(hd6Var2, w, hd6Var7, hd6Var6);
                        hd6Var3 = hd6Var7;
                        if (zCompareAndSwapObject2) {
                            hd6Var3 = hd6Var2;
                            hd6Var2 = null;
                            break;
                        }
                        if (unsafe4.getObjectVolatile(hd6Var2, j2) != hd6Var3) {
                            break;
                        }
                    }
                } else {
                    if (hd6Var3 == null) {
                        throw new ClassCastException();
                    }
                    hd6Var3 = (hd6) unsafe2.getObjectVolatile(hd6Var3, j);
                }
            }
            this = this;
        }
    }

    public final void i(hd6 hd6Var) {
        hd6 hd6Var2;
        while (true) {
            u.getClass();
            if (hd6Var == null) {
                throw new ClassCastException();
            }
            Unsafe unsafe = rxc.a;
            long j = x;
            hd6 hd6Var3 = (hd6) unsafe.getObjectVolatile(hd6Var, j);
            if (this.j() != hd6Var) {
                return;
            }
            while (true) {
                if (hd6Var == null) {
                    throw new ClassCastException();
                }
                Unsafe unsafe2 = rxc.a;
                hd6Var2 = this;
                hd6 hd6Var4 = hd6Var;
                if (unsafe2.compareAndSwapObject(hd6Var4, x, hd6Var3, hd6Var2)) {
                    if (hd6Var2.m()) {
                        hd6Var4.f();
                        return;
                    }
                    return;
                } else {
                    if (hd6Var4 == null) {
                        throw new ClassCastException();
                    }
                    hd6Var = hd6Var4;
                    if (unsafe2.getObjectVolatile(hd6Var4, j) != hd6Var3) {
                        break;
                    } else {
                        this = hd6Var2;
                    }
                }
            }
            this = hd6Var2;
        }
    }

    public final Object j() {
        t.getClass();
        return rxc.a.getObjectVolatile(this, w);
    }

    public final hd6 k() {
        Object objJ = j();
        jn8 jn8Var = objJ instanceof jn8 ? (jn8) objJ : null;
        if (jn8Var != null) {
            return jn8Var.a;
        }
        objJ.getClass();
        return (hd6) objJ;
    }

    public final hd6 l() {
        hd6 hd6VarF = f();
        if (hd6VarF != null) {
            return hd6VarF;
        }
        u.getClass();
        return g((hd6) rxc.a.getObjectVolatile(this, x));
    }

    public boolean m() {
        return j() instanceof jn8;
    }

    public final hd6 n() {
        hd6 hd6Var;
        while (true) {
            Object objJ = this.j();
            if (objJ instanceof jn8) {
                return ((jn8) objJ).a;
            }
            if (objJ == this) {
                return (hd6) objJ;
            }
            objJ.getClass();
            hd6 hd6Var2 = (hd6) objJ;
            jn8 jn8VarO = hd6Var2.o();
            while (true) {
                t.getClass();
                Unsafe unsafe = rxc.a;
                long j = w;
                hd6Var = this;
                if (unsafe.compareAndSwapObject(hd6Var, j, objJ, jn8VarO)) {
                    hd6Var2.f();
                    return null;
                }
                if (unsafe.getObjectVolatile(hd6Var, j) != objJ) {
                    break;
                }
                this = hd6Var;
            }
            this = hd6Var;
        }
    }

    public final jn8 o() {
        v.getClass();
        Unsafe unsafe = rxc.a;
        long j = y;
        jn8 jn8Var = (jn8) unsafe.getObjectVolatile(this, j);
        if (jn8Var != null) {
            return jn8Var;
        }
        jn8 jn8Var2 = new jn8(this);
        unsafe.putObjectVolatile(this, j, jn8Var2);
        return jn8Var2;
    }

    public String toString() {
        return new a(this, ym2.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + ym2.c(this);
    }
}
