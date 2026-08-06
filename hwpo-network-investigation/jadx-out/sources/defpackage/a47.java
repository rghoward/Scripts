package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a47 extends nc9 implements x37 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(a47.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long k = rxc.a.objectFieldOffset(a47.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements c41<g2b>, vjb {
        public final e41<g2b> t;

        public a(e41 e41Var) {
            this.t = e41Var;
        }

        @Override // defpackage.vjb
        public final void a(g99<?> g99Var, int i) {
            this.t.a(g99Var, i);
        }

        @Override // defpackage.c41
        public final k7a e(Object obj, ei4 ei4Var) {
            final a47 a47Var = a47.this;
            ei4 ei4Var2 = new ei4(this) { // from class: z37
                @Override // defpackage.ei4
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a47.j;
                    a47 a47Var2 = this.t;
                    atomicReferenceFieldUpdater.set(a47Var2, null);
                    a47Var2.c(null);
                    return g2b.a;
                }
            };
            k7a k7aVarG = this.t.G((g2b) obj, ei4Var2);
            if (k7aVarG != null) {
                a47.j.set(a47Var, null);
            }
            return k7aVarG;
        }

        @Override // defpackage.r02
        public final h72 getContext() {
            return this.t.x;
        }

        @Override // defpackage.c41
        public final void j(Object obj, ei4 ei4Var) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a47.j;
            a47 a47Var = a47.this;
            atomicReferenceFieldUpdater.set(a47Var, null);
            final rr rrVar = new rr(a47Var, this);
            e41<g2b> e41Var = this.t;
            e41Var.D((g2b) obj, e41Var.v, new ei4() { // from class: d41
                @Override // defpackage.ei4
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    rrVar.invoke((Throwable) obj2);
                    return g2b.a;
                }
            });
        }

        @Override // defpackage.c41
        public final boolean l(Throwable th) {
            return this.t.l(th);
        }

        @Override // defpackage.r02
        public final void resumeWith(Object obj) {
            this.t.resumeWith(obj);
        }

        @Override // defpackage.c41
        public final void x(Object obj) {
            this.t.x(obj);
        }
    }

    public a47() {
        super(1);
        this.owner$volatile = b47.t;
    }

    @Override // defpackage.x37
    public final Object b(r02 r02Var) throws Throwable {
        if (h()) {
            return g2b.a;
        }
        e41 e41VarB = g41.b(th0.e(r02Var));
        try {
            a aVar = new a(e41VarB);
            while (true) {
                int andDecrement = nc9.g.getAndDecrement(this);
                if (andDecrement <= this.a) {
                    if (andDecrement > 0) {
                        aVar.j(g2b.a, this.b);
                        break;
                    }
                    if (e(aVar)) {
                        break;
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

    @Override // defpackage.x37
    public final void c(Object obj) {
        while (this.g()) {
            j.getClass();
            Unsafe unsafe = rxc.a;
            long j2 = k;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            k7a k7aVar = b47.t;
            if (objectVolatile != k7aVar) {
                if (objectVolatile != obj && obj != null) {
                    y37.a("This mutex is locked by ", objectVolatile, ", but ", obj, " is expected");
                    return;
                }
                while (true) {
                    Unsafe unsafe2 = rxc.a;
                    a47 a47Var = this;
                    if (unsafe2.compareAndSwapObject(a47Var, k, objectVolatile, k7aVar)) {
                        a47Var.a();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(a47Var, j2) != objectVolatile) {
                            this = a47Var;
                            break;
                        }
                        this = a47Var;
                    }
                }
            }
        }
        aa0.c("This mutex is not locked");
    }

    public final boolean g() {
        return Math.max(nc9.g.get(this), 0) == 0;
    }

    public final boolean h() {
        int i = i();
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            aa0.c("unexpected");
            return false;
        }
        p.a("This mutex is already locked by the specified owner: null");
        return false;
    }

    public final int i() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = nc9.g;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    j.getClass();
                    rxc.a.putObjectVolatile(this, k, (Object) null);
                    return 0;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(ym2.c(this));
        sb.append("[isLocked=");
        sb.append(g());
        sb.append(",owner=");
        j.getClass();
        sb.append(rxc.a.getObjectVolatile(this, k));
        sb.append(']');
        return sb.toString();
    }
}
