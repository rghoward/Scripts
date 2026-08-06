package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class id6<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(id6.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = rxc.a.objectFieldOffset(id6.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new jd6(8, false);

    public final boolean a(Runnable runnable) {
        id6<E> id6Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = rxc.a;
            long j = b;
            jd6 jd6Var = (jd6) unsafe.getObjectVolatile(this, j);
            int iA = jd6Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                jd6<E> jd6VarD = jd6Var.d();
                while (true) {
                    Unsafe unsafe2 = rxc.a;
                    id6Var = this;
                    if (unsafe2.compareAndSwapObject(id6Var, b, jd6Var, jd6VarD) || unsafe2.getObjectVolatile(id6Var, j) != jd6Var) {
                        break;
                    }
                    this = id6Var;
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                id6Var = this;
            }
            this = id6Var;
        }
    }

    public final void b() {
        id6<E> id6Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = rxc.a;
            long j = b;
            jd6 jd6Var = (jd6) unsafe.getObjectVolatile(this, j);
            if (jd6Var.c()) {
                return;
            }
            jd6<E> jd6VarD = jd6Var.d();
            while (true) {
                Unsafe unsafe2 = rxc.a;
                id6Var = this;
                if (unsafe2.compareAndSwapObject(id6Var, b, jd6Var, jd6VarD) || unsafe2.getObjectVolatile(id6Var, j) != jd6Var) {
                    break;
                } else {
                    this = id6Var;
                }
            }
            this = id6Var;
        }
    }

    public final int c() {
        a.getClass();
        jd6 jd6Var = (jd6) rxc.a.getObjectVolatile(this, b);
        jd6Var.getClass();
        long j = jd6.f.get(jd6Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final E d() {
        id6<E> id6Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = rxc.a;
            long j = b;
            jd6 jd6Var = (jd6) unsafe.getObjectVolatile(this, j);
            E e = (E) jd6Var.e();
            if (e != jd6.g) {
                return e;
            }
            jd6<E> jd6VarD = jd6Var.d();
            while (true) {
                Unsafe unsafe2 = rxc.a;
                id6Var = this;
                if (unsafe2.compareAndSwapObject(id6Var, b, jd6Var, jd6VarD) || unsafe2.getObjectVolatile(id6Var, j) != jd6Var) {
                    break;
                }
                this = id6Var;
            }
            this = id6Var;
        }
    }
}
