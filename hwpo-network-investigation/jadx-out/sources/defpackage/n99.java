package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class n99<R> implements v31, p99, vjb {
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(n99.class, Object.class, "state$volatile");
    public static final /* synthetic */ long z = rxc.a.objectFieldOffset(n99.class.getDeclaredField("state$volatile"));
    public final h72 t;
    public Object v;
    private volatile /* synthetic */ Object state$volatile = q99.a;
    public ArrayList u = new ArrayList(2);
    public int w = -1;
    public Object x = q99.d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a {
        public final Object a;
        public final ei4<Object, p99<?>, Object, g2b> b;
        public final ei4<Object, Object, Object, Object> c;
        public final Object d;
        public final p6a e;
        public final ei4<p99<?>, Object, Object, ei4<Throwable, Object, h72, g2b>> f;
        public Object g;
        public int h = -1;

        public a(Object obj, ei4 ei4Var, ei4 ei4Var2, k7a k7aVar, p6a p6aVar, ei4 ei4Var3) {
            this.a = obj;
            this.b = ei4Var;
            this.c = ei4Var2;
            this.d = k7aVar;
            this.e = p6aVar;
            this.f = ei4Var3;
        }

        public final void a() {
            Object obj = this.g;
            if (obj instanceof g99) {
                ((g99) obj).m(this.h, n99.this.t);
                return;
            }
            e33 e33Var = obj instanceof e33 ? (e33) obj : null;
            if (e33Var != null) {
                e33Var.dispose();
            }
        }
    }

    public n99(h72 h72Var) {
        this.t = h72Var;
    }

    @Override // defpackage.vjb
    public final void a(g99<?> g99Var, int i) {
        this.v = g99Var;
        this.w = i;
    }

    @Override // defpackage.p99
    public final boolean b(Object obj, Object obj2) {
        return l(obj, obj2) == 0;
    }

    @Override // defpackage.v31
    public final void c(Throwable th) {
        n99<R> n99Var;
        while (true) {
            y.getClass();
            Unsafe unsafe = rxc.a;
            long j = z;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == q99.b) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = rxc.a;
                n99Var = this;
                if (unsafe2.compareAndSwapObject(n99Var, z, objectVolatile, q99.c)) {
                    ArrayList arrayList = n99Var.u;
                    if (arrayList == null) {
                        return;
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((a) obj).a();
                    }
                    n99Var.x = q99.d;
                    n99Var.u = null;
                    return;
                }
                if (unsafe2.getObjectVolatile(n99Var, j) != objectVolatile) {
                    break;
                } else {
                    this = n99Var;
                }
            }
            this = n99Var;
        }
    }

    @Override // defpackage.p99
    public final void d(Object obj) {
        this.x = obj;
    }

    public final void e(n99<R>.a aVar) {
        ArrayList arrayList = this.u;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            n99<R>.a aVar2 = (a) obj;
            if (aVar2 != aVar) {
                aVar2.a();
            }
        }
        y.getClass();
        rxc.a.putObjectVolatile(this, z, q99.b);
        this.x = q99.d;
        this.u = null;
    }

    public final Object f(u02 u02Var) {
        y.getClass();
        Object objectVolatile = rxc.a.getObjectVolatile(this, z);
        objectVolatile.getClass();
        n99<R>.a aVar = (a) objectVolatile;
        Object obj = this.x;
        e(aVar);
        ei4<Object, Object, Object, Object> ei4Var = aVar.c;
        Object obj2 = aVar.a;
        Object obj3 = aVar.d;
        Object objInvoke = ei4Var.invoke(obj2, obj3, obj);
        w72 w72Var = aVar.e;
        return obj3 == q99.e ? ((oh4) w72Var).invoke(u02Var) : ((ci4) w72Var).invoke(objInvoke, u02Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(u02 u02Var) throws Throwable {
        o99 o99Var;
        if (u02Var instanceof o99) {
            o99Var = (o99) u02Var;
            int i = o99Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                o99Var.v = i - Integer.MIN_VALUE;
            } else {
                o99Var = new o99(this, u02Var);
            }
        } else {
            o99Var = new o99(this, u02Var);
        }
        Object obj = o99Var.t;
        int i2 = o99Var.v;
        v72 v72Var = v72.t;
        if (i2 == 0) {
            dv8.b(obj);
            o99Var.v = 1;
            if (m(o99Var) != v72Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                dv8.b(obj);
                return obj;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        o99Var.v = 2;
        Object objF = f(o99Var);
        return objF == v72Var ? v72Var : objF;
    }

    public final n99<R>.a h(Object obj) {
        ArrayList arrayList = this.u;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            if (((a) obj3).a == obj) {
                obj2 = obj3;
                break;
            }
        }
        n99<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Q> void i(m99 m99Var, ci4<? super Q, ? super r02<? super R>, ? extends Object> ci4Var) {
        k(new a(m99Var.a, m99Var.b, m99Var.c, null, (p6a) ci4Var, m99Var.d), false);
    }

    public final boolean j() {
        y.getClass();
        return rxc.a.getObjectVolatile(this, z) instanceof a;
    }

    public final void k(n99<R>.a aVar, boolean z2) {
        Object obj = aVar.a;
        y.getClass();
        Unsafe unsafe = rxc.a;
        long j = z;
        if (unsafe.getObjectVolatile(this, j) instanceof a) {
            return;
        }
        if (!z2) {
            ArrayList arrayList = this.u;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((a) obj2).a == obj) {
                        p.b(obj, "Cannot use select clauses on the same object: ");
                        return;
                    }
                }
            }
        }
        aVar.b.invoke(obj, this, aVar.d);
        if (this.x != q99.d) {
            rxc.a.putObjectVolatile(this, j, aVar);
            return;
        }
        if (!z2) {
            ArrayList arrayList2 = this.u;
            arrayList2.getClass();
            arrayList2.add(aVar);
        }
        aVar.g = this.v;
        aVar.h = this.w;
        this.v = null;
        this.w = -1;
    }

    public final int l(Object obj, Object obj2) {
        n99<R> n99Var;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            y.getClass();
            Unsafe unsafe3 = rxc.a;
            long j = z;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof c41) {
                n99<R>.a aVarH = this.h(obj);
                if (aVarH != null) {
                    ei4<p99<?>, Object, Object, ei4<Throwable, Object, h72, g2b>> ei4Var = aVarH.f;
                    ei4<Throwable, Object, h72, g2b> ei4VarInvoke = ei4Var != null ? ei4Var.invoke(this, aVarH.d, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = rxc.a;
                        n99Var = this;
                        if (unsafe4.compareAndSwapObject(n99Var, z, objectVolatile, aVarH)) {
                            c41 c41Var = (c41) objectVolatile;
                            n99Var.x = obj2;
                            k7a k7aVarE = c41Var.e(g2b.a, ei4VarInvoke);
                            if (k7aVarE == null) {
                                n99Var.x = q99.d;
                                return 2;
                            }
                            c41Var.x(k7aVarE);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(n99Var, j) != objectVolatile) {
                            break;
                        }
                        this = n99Var;
                    }
                } else {
                    continue;
                }
            } else {
                n99Var = this;
                if (xj5.a(objectVolatile, q99.b) || (objectVolatile instanceof a)) {
                    return 3;
                }
                if (xj5.a(objectVolatile, q99.c)) {
                    return 2;
                }
                if (xj5.a(objectVolatile, q99.a)) {
                    List listH = ws0.h(obj);
                    do {
                        unsafe2 = rxc.a;
                        if (unsafe2.compareAndSwapObject(n99Var, z, objectVolatile, listH)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(n99Var, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        tn2.d(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                    ArrayList arrayListL = th1.L((Collection) objectVolatile, obj);
                    do {
                        unsafe = rxc.a;
                        if (unsafe.compareAndSwapObject(n99Var, z, objectVolatile, arrayListL)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(n99Var, j) == objectVolatile);
                }
            }
            this = n99Var;
        }
    }

    public final Object m(o99 o99Var) throws Throwable {
        e41 e41Var;
        Unsafe unsafe;
        e41 e41Var2 = new e41(1, th0.e(o99Var));
        e41Var2.t();
        loop0: while (true) {
            y.getClass();
            Unsafe unsafe2 = rxc.a;
            long j = z;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            e41 e41Var3 = e41Var2;
            k7a k7aVar = q99.a;
            if (objectVolatile == k7aVar) {
                e41 e41Var4 = e41Var3;
                while (true) {
                    Unsafe unsafe3 = rxc.a;
                    e41Var = e41Var4;
                    if (unsafe3.compareAndSwapObject(this, z, objectVolatile, e41Var4)) {
                        e41Var.w(this);
                        break loop0;
                    }
                    if (unsafe3.getObjectVolatile(this, j) != objectVolatile) {
                        break;
                    }
                    e41Var4 = e41Var;
                }
                e41Var2 = e41Var;
            } else {
                e41Var = e41Var3;
                if (!(objectVolatile instanceof List)) {
                    if (!(objectVolatile instanceof a)) {
                        tn2.d(objectVolatile, "unexpected state: ");
                        return null;
                    }
                    g2b g2bVar = g2b.a;
                    a aVar = (a) objectVolatile;
                    Object obj = this.x;
                    ei4<p99<?>, Object, Object, ei4<Throwable, Object, h72, g2b>> ei4Var = aVar.f;
                    e41Var.j(g2bVar, ei4Var != null ? ei4Var.invoke(this, aVar.d, obj) : null);
                    break;
                }
                do {
                    unsafe = rxc.a;
                    if (unsafe.compareAndSwapObject(this, z, objectVolatile, k7aVar)) {
                        Iterator it = ((Iterable) objectVolatile).iterator();
                        while (it.hasNext()) {
                            n99<R>.a aVarH = h(it.next());
                            aVarH.getClass();
                            aVarH.g = null;
                            aVarH.h = -1;
                            k(aVarH, true);
                        }
                        break;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                e41Var2 = e41Var;
            }
        }
        Object objR = e41Var.r();
        return objR == v72.t ? objR : g2b.a;
    }
}
