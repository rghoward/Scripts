package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class zx0<E> implements p91<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A;
    public static final /* synthetic */ AtomicReferenceFieldUpdater B;
    public static final /* synthetic */ AtomicReferenceFieldUpdater C;
    public static final /* synthetic */ long D;
    public static final /* synthetic */ long E;
    public static final /* synthetic */ long F;
    public static final /* synthetic */ long G;
    public static final /* synthetic */ long H;
    public static final /* synthetic */ AtomicLongFieldUpdater u = AtomicLongFieldUpdater.newUpdater(zx0.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater v = AtomicLongFieldUpdater.newUpdater(zx0.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater w = AtomicLongFieldUpdater.newUpdater(zx0.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater x = AtomicLongFieldUpdater.newUpdater(zx0.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(zx0.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater z;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public final int t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a implements ca1<E>, vjb {
        public Object t = dy0.p;
        public e41<? super Boolean> u;

        public a() {
        }

        @Override // defpackage.vjb
        public final void a(g99<?> g99Var, int i) {
            e41<? super Boolean> e41Var = this.u;
            if (e41Var != null) {
                e41Var.a(g99Var, i);
            }
        }

        @Override // defpackage.ca1
        public final Object b(u02 u02Var) throws Throwable {
            ha1<E> ha1VarV;
            Object obj = this.t;
            boolean z = true;
            if (obj == dy0.p || obj == dy0.l) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zx0.z;
                zx0<E> zx0Var = zx0.this;
                ha1<E> ha1Var = (ha1) atomicReferenceFieldUpdater.get(zx0Var);
                while (!zx0Var.F()) {
                    long andIncrement = zx0.v.getAndIncrement(zx0Var);
                    long j = dy0.b;
                    long j2 = andIncrement / j;
                    int i = (int) (andIncrement % j);
                    if (ha1Var.x != j2) {
                        ha1VarV = zx0Var.v(j2, ha1Var);
                        if (ha1VarV == null) {
                            continue;
                        }
                    } else {
                        ha1VarV = ha1Var;
                    }
                    Object objS = zx0Var.S(ha1VarV, i, andIncrement, null);
                    k7a k7aVar = dy0.m;
                    if (objS == k7aVar) {
                        aa0.c("unreachable");
                        return null;
                    }
                    k7a k7aVar2 = dy0.o;
                    if (objS == k7aVar2) {
                        if (andIncrement < zx0Var.A()) {
                            ha1VarV.a();
                        }
                        ha1Var = ha1VarV;
                    } else {
                        if (objS == dy0.n) {
                            zx0<E> zx0Var2 = zx0.this;
                            e41<? super Boolean> e41VarB = g41.b(th0.e(u02Var));
                            try {
                                this.u = e41VarB;
                                Object objS2 = zx0Var2.S(ha1VarV, i, andIncrement, this);
                                if (objS2 != k7aVar) {
                                    if (objS2 == k7aVar2) {
                                        if (andIncrement < zx0Var2.A()) {
                                            ha1VarV.a();
                                        }
                                        ha1<E> ha1Var2 = (ha1) zx0.z.get(zx0Var2);
                                        while (true) {
                                            if (zx0Var2.F()) {
                                                e41<? super Boolean> e41Var = this.u;
                                                e41Var.getClass();
                                                this.u = null;
                                                this.t = dy0.l;
                                                Throwable thX = zx0Var.x();
                                                if (thX != null) {
                                                    e41Var.resumeWith(new av8.a(thX));
                                                    break;
                                                }
                                                e41Var.resumeWith(Boolean.FALSE);
                                                break;
                                            }
                                            long andIncrement2 = zx0.v.getAndIncrement(zx0Var2);
                                            long j3 = dy0.b;
                                            long j4 = andIncrement2 / j3;
                                            int i2 = (int) (andIncrement2 % j3);
                                            if (ha1Var2.x != j4) {
                                                ha1<E> ha1VarV2 = zx0Var2.v(j4, ha1Var2);
                                                if (ha1VarV2 != null) {
                                                    ha1Var2 = ha1VarV2;
                                                }
                                            }
                                            Object objS3 = zx0Var2.S(ha1Var2, i2, andIncrement2, this);
                                            if (objS3 == dy0.m) {
                                                a(ha1Var2, i2);
                                                break;
                                            }
                                            if (objS3 == dy0.o) {
                                                if (andIncrement2 < zx0Var2.A()) {
                                                    ha1Var2.a();
                                                }
                                            } else {
                                                if (objS3 == dy0.n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                ha1Var2.a();
                                                this.t = objS3;
                                                this.u = null;
                                            }
                                        }
                                    } else {
                                        ha1VarV.a();
                                        this.t = objS2;
                                        this.u = null;
                                    }
                                    e41VarB.j(Boolean.TRUE, null);
                                    break;
                                }
                                a(ha1VarV, i);
                                return e41VarB.r();
                            } catch (Throwable th) {
                                e41VarB.B();
                                throw th;
                            }
                        }
                        ha1VarV.a();
                        this.t = objS;
                    }
                }
                this.t = dy0.l;
                Throwable thX2 = zx0Var.x();
                if (thX2 != null) {
                    int i3 = yy9.a;
                    throw thX2;
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // defpackage.ca1
        public final E next() throws Throwable {
            E e = (E) this.t;
            k7a k7aVar = dy0.p;
            if (e == k7aVar) {
                aa0.c("`hasNext()` has not been invoked");
                return null;
            }
            this.t = k7aVar;
            if (e != dy0.l) {
                return e;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = zx0.u;
            Throwable thY = zx0.this.y();
            int i = yy9.a;
            throw thY;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements vjb {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class c extends pi4 implements ei4<zx0<?>, p99<?>, Object, g2b> {
        public static final c t = new c(3, zx0.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

        @Override // defpackage.ei4
        public final g2b invoke(zx0<?> zx0Var, p99<?> p99Var, Object obj) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = zx0.u;
            zx0Var.N(p99Var);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class d extends pi4 implements ei4<zx0<?>, Object, Object, Object> {
        public static final d t = new d(3, zx0.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

        @Override // defpackage.ei4
        public final Object invoke(zx0<?> zx0Var, Object obj, Object obj2) throws Throwable {
            zx0<?> zx0Var2 = zx0Var;
            AtomicLongFieldUpdater atomicLongFieldUpdater = zx0.u;
            zx0Var2.getClass();
            if (obj2 != dy0.l) {
                return obj2;
            }
            throw zx0Var2.y();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class e extends pi4 implements ei4<zx0<?>, p99<?>, Object, g2b> {
        public static final e t = new e(3, zx0.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

        @Override // defpackage.ei4
        public final g2b invoke(zx0<?> zx0Var, p99<?> p99Var, Object obj) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = zx0.u;
            zx0Var.N(p99Var);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class f extends pi4 implements ei4<zx0<?>, Object, Object, Object> {
        public static final f t = new f(3, zx0.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

        @Override // defpackage.ei4
        public final Object invoke(zx0<?> zx0Var, Object obj, Object obj2) {
            zx0<?> zx0Var2 = zx0Var;
            AtomicLongFieldUpdater atomicLongFieldUpdater = zx0.u;
            zx0Var2.getClass();
            if (obj2 == dy0.l) {
                obj2 = new ga1.a(zx0Var2.x());
            }
            return new ga1(obj2);
        }
    }

    static {
        Unsafe unsafe = rxc.a;
        H = unsafe.objectFieldOffset(zx0.class.getDeclaredField("sendSegment$volatile"));
        z = AtomicReferenceFieldUpdater.newUpdater(zx0.class, Object.class, "receiveSegment$volatile");
        G = unsafe.objectFieldOffset(zx0.class.getDeclaredField("receiveSegment$volatile"));
        A = AtomicReferenceFieldUpdater.newUpdater(zx0.class, Object.class, "bufferEndSegment$volatile");
        E = unsafe.objectFieldOffset(zx0.class.getDeclaredField("bufferEndSegment$volatile"));
        B = AtomicReferenceFieldUpdater.newUpdater(zx0.class, Object.class, "_closeCause$volatile");
        D = unsafe.objectFieldOffset(zx0.class.getDeclaredField("_closeCause$volatile"));
        C = AtomicReferenceFieldUpdater.newUpdater(zx0.class, Object.class, "closeHandler$volatile");
        F = unsafe.objectFieldOffset(zx0.class.getDeclaredField("closeHandler$volatile"));
    }

    public zx0(int i) {
        this.t = i;
        if (i < 0) {
            ca0.a(pk.d(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        ha1<Object> ha1Var = dy0.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = w.get(this);
        ha1<Object> ha1Var2 = new ha1<>(0L, null, this, 3);
        this.sendSegment$volatile = ha1Var2;
        this.receiveSegment$volatile = ha1Var2;
        if (H()) {
            ha1Var2 = dy0.a;
            ha1Var2.getClass();
        }
        this.bufferEndSegment$volatile = ha1Var2;
        this._closeCause$volatile = dy0.s;
    }

    public static void C(zx0 zx0Var) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = x;
        if ((atomicLongFieldUpdater.addAndGet(zx0Var, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(zx0Var) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static Object K(zx0 zx0Var, p6a p6aVar) throws Throwable {
        ha1<E> ha1Var;
        Throwable th;
        ha1<E> ha1Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z;
        atomicReferenceFieldUpdater.getClass();
        if (zx0Var == null) {
            throw new ClassCastException();
        }
        ha1<E> ha1Var3 = (ha1) rxc.a.getObjectVolatile(zx0Var, G);
        while (!zx0Var.F()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = v;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(zx0Var);
            long j = dy0.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (ha1Var3.x != j2) {
                ha1<E> ha1VarV = zx0Var.v(j2, ha1Var3);
                if (ha1VarV == null) {
                    continue;
                } else {
                    ha1Var = ha1VarV;
                }
            } else {
                ha1Var = ha1Var3;
            }
            zx0 zx0Var2 = zx0Var;
            Object objS = zx0Var2.S(ha1Var, i, andIncrement, null);
            k7a k7aVar = dy0.m;
            if (objS == k7aVar) {
                aa0.c("unexpected");
                return null;
            }
            k7a k7aVar2 = dy0.o;
            if (objS == k7aVar2) {
                if (andIncrement < zx0Var2.A()) {
                    ha1Var.a();
                }
                zx0Var = zx0Var2;
                ha1Var3 = ha1Var;
            } else {
                if (objS != dy0.n) {
                    ha1Var.a();
                    return objS;
                }
                e41 e41VarB = g41.b(th0.e(p6aVar));
                try {
                    Object objS2 = zx0Var2.S(ha1Var, i, andIncrement, e41VarB);
                    if (objS2 != k7aVar) {
                        if (objS2 == k7aVar2) {
                            if (andIncrement < zx0Var2.A()) {
                                ha1Var.a();
                            }
                            ha1<E> ha1Var4 = (ha1) atomicReferenceFieldUpdater.get(zx0Var2);
                            while (true) {
                                if (zx0Var2.F()) {
                                    e41VarB.resumeWith(new av8.a(zx0Var2.y()));
                                    break;
                                }
                                e41 e41Var = e41VarB;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(zx0Var2);
                                    long j3 = dy0.b;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (ha1Var4.x != j4) {
                                        try {
                                            ha1<E> ha1VarV2 = zx0Var2.v(j4, ha1Var4);
                                            if (ha1VarV2 == null) {
                                                e41VarB = e41Var;
                                            } else {
                                                ha1Var2 = ha1VarV2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            e41VarB = e41Var;
                                            e41VarB.B();
                                            throw th;
                                        }
                                    } else {
                                        ha1Var2 = ha1Var4;
                                    }
                                    zx0 zx0Var3 = zx0Var2;
                                    objS2 = zx0Var3.S(ha1Var2, i2, andIncrement2, e41Var);
                                    zx0Var2 = zx0Var3;
                                    ha1<E> ha1Var5 = ha1Var2;
                                    e41VarB = e41Var;
                                    if (objS2 == dy0.m) {
                                        e41VarB.a(ha1Var5, i2);
                                        break;
                                    }
                                    if (objS2 == dy0.o) {
                                        if (andIncrement2 < zx0Var2.A()) {
                                            ha1Var5.a();
                                        }
                                        ha1Var4 = ha1Var5;
                                    } else {
                                        if (objS2 == dy0.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        ha1Var5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    e41VarB = e41Var;
                                    th = th;
                                    e41VarB.B();
                                    throw th;
                                }
                            }
                        } else {
                            ha1Var.a();
                        }
                        e41VarB.j(objS2, null);
                        break;
                    }
                    e41VarB.a(ha1Var, i);
                    return e41VarB.r();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thY = zx0Var.y();
        int i3 = yy9.a;
        throw thY;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object L(zx0 zx0Var, u02 u02Var) throws Throwable {
        ay0 ay0Var;
        ha1<E> ha1Var;
        if (u02Var instanceof ay0) {
            ay0Var = (ay0) u02Var;
            int i = ay0Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                ay0Var.v = i - Integer.MIN_VALUE;
            } else {
                ay0Var = new ay0(zx0Var, u02Var);
            }
        } else {
            ay0Var = new ay0(zx0Var, u02Var);
        }
        ay0 ay0Var2 = ay0Var;
        Object obj = ay0Var2.t;
        int i2 = ay0Var2.v;
        if (i2 != 0) {
            if (i2 == 1) {
                dv8.b(obj);
                return ((ga1) obj).a;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        z.getClass();
        ha1<E> ha1Var2 = (ha1) rxc.a.getObjectVolatile(zx0Var, G);
        while (!zx0Var.F()) {
            long andIncrement = v.getAndIncrement(zx0Var);
            long j = dy0.b;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (ha1Var2.x != j2) {
                ha1<E> ha1VarV = zx0Var.v(j2, ha1Var2);
                if (ha1VarV == null) {
                    continue;
                } else {
                    ha1Var = ha1VarV;
                }
            } else {
                ha1Var = ha1Var2;
            }
            zx0 zx0Var2 = zx0Var;
            Object objS = zx0Var2.S(ha1Var, i3, andIncrement, null);
            if (objS == dy0.m) {
                aa0.c("unexpected");
                return null;
            }
            if (objS != dy0.o) {
                if (objS != dy0.n) {
                    ha1Var.a();
                    return objS;
                }
                ay0Var2.v = 1;
                Object objM = zx0Var2.M(ha1Var, i3, andIncrement, ay0Var2);
                v72 v72Var = v72.t;
                return objM == v72Var ? v72Var : objM;
            }
            if (andIncrement < zx0Var2.A()) {
                ha1Var.a();
            }
            zx0Var = zx0Var2;
            ha1Var2 = ha1Var;
        }
        return new ga1.a(zx0Var.x());
    }

    /* JADX WARN: Code duplicated, block: B:111:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1 A[Catch: all -> 0x00cf, TryCatch #0 {all -> 0x00cf, blocks: (B:31:0x008b, B:39:0x009c, B:40:0x00a5, B:42:0x00c2, B:45:0x00ca, B:50:0x00d9, B:61:0x00f1, B:62:0x00f5, B:64:0x00fd, B:65:0x0101, B:66:0x0108, B:68:0x010b, B:69:0x010f, B:71:0x011b, B:72:0x011f, B:73:0x0125, B:74:0x0126, B:76:0x012e, B:77:0x0132, B:70:0x0115, B:78:0x0138), top: B:95:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd A[Catch: all -> 0x00cf, TryCatch #0 {all -> 0x00cf, blocks: (B:31:0x008b, B:39:0x009c, B:40:0x00a5, B:42:0x00c2, B:45:0x00ca, B:50:0x00d9, B:61:0x00f1, B:62:0x00f5, B:64:0x00fd, B:65:0x0101, B:66:0x0108, B:68:0x010b, B:69:0x010f, B:71:0x011b, B:72:0x011f, B:73:0x0125, B:74:0x0126, B:76:0x012e, B:77:0x0132, B:70:0x0115, B:78:0x0138), top: B:95:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:68:0x010b A[Catch: all -> 0x00cf, TryCatch #0 {all -> 0x00cf, blocks: (B:31:0x008b, B:39:0x009c, B:40:0x00a5, B:42:0x00c2, B:45:0x00ca, B:50:0x00d9, B:61:0x00f1, B:62:0x00f5, B:64:0x00fd, B:65:0x0101, B:66:0x0108, B:68:0x010b, B:69:0x010f, B:71:0x011b, B:72:0x011f, B:73:0x0125, B:74:0x0126, B:76:0x012e, B:77:0x0132, B:70:0x0115, B:78:0x0138), top: B:95:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:69:0x010f A[Catch: all -> 0x00cf, EDGE_INSN: B:69:0x010f->B:80:0x013c BREAK  A[LOOP:1: B:40:0x00a5->B:48:0x00d2], TryCatch #0 {all -> 0x00cf, blocks: (B:31:0x008b, B:39:0x009c, B:40:0x00a5, B:42:0x00c2, B:45:0x00ca, B:50:0x00d9, B:61:0x00f1, B:62:0x00f5, B:64:0x00fd, B:65:0x0101, B:66:0x0108, B:68:0x010b, B:69:0x010f, B:71:0x011b, B:72:0x011f, B:73:0x0125, B:74:0x0126, B:76:0x012e, B:77:0x0132, B:70:0x0115, B:78:0x0138), top: B:95:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0143  */
    /* JADX WARN: Code duplicated, block: B:85:0x0147 A[RETURN] */
    public static <E> Object P(zx0<E> zx0Var, E e2, r02<? super g2b> r02Var) throws Throwable {
        Object objR;
        int iH;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
        atomicReferenceFieldUpdater.getClass();
        ha1<E> ha1Var = (ha1) rxc.a.getObjectVolatile(zx0Var, H);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = u;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(zx0Var);
            long j = andIncrement & 1152921504606846975L;
            boolean zE = zx0Var.E(andIncrement, false);
            int i = dy0.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = ha1Var.x;
            v72 v72Var = v72.t;
            if (j4 != j3) {
                ha1<E> ha1VarW = zx0Var.w(j3, ha1Var);
                if (ha1VarW != null) {
                    ha1Var = ha1VarW;
                } else if (zE) {
                    Object objJ = zx0Var.J(r02Var, e2);
                    if (objJ != v72Var) {
                        break;
                    }
                    return objJ;
                }
            }
            int iH2 = h(zx0Var, ha1Var, i2, e2, j, null, zE);
            if (iH2 == 0) {
                ha1Var.a();
                break;
            }
            if (iH2 != 1) {
                if (iH2 == 2) {
                    if (!zE) {
                        break;
                    }
                    ha1Var.n();
                    Object objJ2 = zx0Var.J(r02Var, e2);
                    if (objJ2 != v72Var) {
                        break;
                    }
                    return objJ2;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = v;
                if (iH2 == 3) {
                    e41 e41VarB = g41.b(th0.e(r02Var));
                    try {
                        int iH3 = h(zx0Var, ha1Var, i2, e2, j, e41VarB, false);
                        if (iH3 != 0) {
                            if (iH3 != 1) {
                                if (iH3 != 2) {
                                    if (iH3 != 4) {
                                        String str = "unexpected";
                                        if (iH3 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        ha1Var.a();
                                        ha1<E> ha1Var2 = (ha1) atomicReferenceFieldUpdater.get(zx0Var);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(zx0Var);
                                            long j5 = andIncrement2 & 1152921504606846975L;
                                            boolean zE2 = zx0Var.E(andIncrement2, false);
                                            int i3 = dy0.b;
                                            long j6 = i3;
                                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                            long j7 = j5 / j6;
                                            int i4 = (int) (j5 % j6);
                                            String str2 = str;
                                            if (ha1Var2.x == j7) {
                                                iH = h(zx0Var, ha1Var2, i4, e2, j5, e41VarB, zE2);
                                                if (iH != 0) {
                                                    ha1Var2.a();
                                                } else if (iH != 1) {
                                                    if (iH != 2) {
                                                        if (zE2) {
                                                            e41VarB.a(ha1Var2, i4 + i3);
                                                            break;
                                                        }
                                                        ha1Var2.n();
                                                    } else {
                                                        if (iH != 3) {
                                                            throw new IllegalStateException(str2);
                                                        }
                                                        if (iH != 4) {
                                                            if (iH != 5) {
                                                                ha1Var2.a();
                                                            }
                                                            str = str2;
                                                            atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                        } else if (j5 < atomicLongFieldUpdater2.get(zx0Var)) {
                                                            ha1Var2.a();
                                                        }
                                                    }
                                                }
                                            } else {
                                                ha1<E> ha1VarW2 = zx0Var.w(j7, ha1Var2);
                                                if (ha1VarW2 != null) {
                                                    ha1Var2 = ha1VarW2;
                                                    iH = h(zx0Var, ha1Var2, i4, e2, j5, e41VarB, zE2);
                                                    if (iH != 0) {
                                                        ha1Var2.a();
                                                    } else if (iH != 1) {
                                                        if (iH != 2) {
                                                            if (zE2) {
                                                                e41VarB.a(ha1Var2, i4 + i3);
                                                                break;
                                                            }
                                                            ha1Var2.n();
                                                        } else {
                                                            if (iH != 3) {
                                                                throw new IllegalStateException(str2);
                                                            }
                                                            if (iH != 4) {
                                                                if (iH != 5) {
                                                                    ha1Var2.a();
                                                                }
                                                                str = str2;
                                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                            } else if (j5 < atomicLongFieldUpdater2.get(zx0Var)) {
                                                                ha1Var2.a();
                                                            }
                                                        }
                                                    }
                                                } else if (!zE2) {
                                                    str = str2;
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                }
                                            }
                                        }
                                    } else if (j < atomicLongFieldUpdater2.get(zx0Var)) {
                                        ha1Var.a();
                                    }
                                    e(zx0Var, e2, e41VarB);
                                    break;
                                } else {
                                    e41VarB.a(ha1Var, i2 + i);
                                }
                            }
                            objR = e41VarB.r();
                            if (objR != v72Var) {
                                objR = g2b.a;
                            }
                            if (objR == v72Var) {
                                break;
                            }
                            return objR;
                        }
                        ha1Var.a();
                        e41VarB.resumeWith(g2b.a);
                        objR = e41VarB.r();
                        if (objR != v72Var) {
                            objR = g2b.a;
                        }
                        if (objR == v72Var) {
                            break;
                        }
                        return objR;
                    } catch (Throwable th) {
                        e41VarB.B();
                        throw th;
                    }
                }
                if (iH2 == 4) {
                    if (j < atomicLongFieldUpdater2.get(zx0Var)) {
                        ha1Var.a();
                    }
                    Object objJ3 = zx0Var.J(r02Var, e2);
                    if (objJ3 != v72Var) {
                        break;
                    }
                    return objJ3;
                }
                if (iH2 == 5) {
                    ha1Var.a();
                }
            } else {
                break;
            }
        }
        return g2b.a;
    }

    public static final void e(zx0 zx0Var, Object obj, e41 e41Var) {
        e41Var.resumeWith(new av8.a(zx0Var.z()));
    }

    public static final int h(zx0 zx0Var, ha1 ha1Var, int i, Object obj, long j, Object obj2, boolean z2) {
        ha1Var.s(i, obj);
        if (z2) {
            return zx0Var.T(ha1Var, i, obj, j, obj2, z2);
        }
        Object objQ = ha1Var.q(i);
        if (objQ == null) {
            if (zx0Var.j(j)) {
                if (ha1Var.p(i, null, dy0.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (ha1Var.p(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objQ instanceof vjb) {
            ha1Var.s(i, null);
            if (zx0Var.Q(objQ, obj)) {
                ha1Var.t(i, dy0.i);
                return 0;
            }
            k7a k7aVar = dy0.k;
            if (ha1Var.A.getAndSet((i * 2) + 1, k7aVar) == k7aVar) {
                return 5;
            }
            ha1Var.r(i, true);
            return 5;
        }
        return zx0Var.T(ha1Var, i, obj, j, obj2, z2);
    }

    public final long A() {
        return u.get(this) & 1152921504606846975L;
    }

    public final boolean B() {
        while (true) {
            z.getClass();
            Unsafe unsafe = rxc.a;
            long j = G;
            ha1<E> ha1VarV = (ha1) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = v;
            long j2 = atomicLongFieldUpdater.get(this);
            if (A() <= j2) {
                return false;
            }
            long j3 = dy0.b;
            long j4 = j2 / j3;
            if (ha1VarV.x == j4 || (ha1VarV = v(j4, ha1VarV)) != null) {
                ha1VarV.a();
                int i = (int) (j2 % j3);
                while (true) {
                    Object objQ = ha1VarV.q(i);
                    if (objQ != null && objQ != dy0.e) {
                        if (objQ != dy0.d) {
                            if (objQ != dy0.j && objQ != dy0.l && objQ != dy0.i && objQ != dy0.h) {
                                if (objQ != dy0.g) {
                                    if (objQ == dy0.f || j2 != atomicLongFieldUpdater.get(this)) {
                                        break;
                                        break;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            break;
                            break;
                            break;
                            break;
                        }
                        return true;
                    }
                    if (ha1VarV.p(i, objQ, dy0.h)) {
                        t();
                        break;
                    }
                }
                v.compareAndSet(this, j2, j2 + 1);
            } else if (((ha1) unsafe.getObjectVolatile(this, j)).x < j4) {
                return false;
            }
        }
    }

    public final void D() {
        Object objectVolatile;
        zx0<E> zx0Var;
        loop0: while (true) {
            C.getClass();
            Unsafe unsafe = rxc.a;
            long j = F;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            k7a k7aVar = objectVolatile == null ? dy0.q : dy0.r;
            while (true) {
                Unsafe unsafe2 = rxc.a;
                zx0Var = this;
                if (unsafe2.compareAndSwapObject(zx0Var, F, objectVolatile, k7aVar)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(zx0Var, j) != objectVolatile) {
                    break;
                } else {
                    this = zx0Var;
                }
            }
            this = zx0Var;
        }
        if (objectVolatile == null) {
            return;
        }
        fza.b(1, objectVolatile);
        ((oh4) objectVolatile).invoke(zx0Var.x());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean E(long j, boolean z2) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                r(j & 1152921504606846975L);
                if (!z2 || !B()) {
                }
            } else {
                if (i != 3) {
                    p.a(pp2.a(i, "unexpected close status: "));
                    return false;
                }
                ha1<E> ha1VarR = r(j & 1152921504606846975L);
                Object objB = null;
                loop0: do {
                    for (int i2 = dy0.b - 1; -1 < i2; i2--) {
                        long j2 = (ha1VarR.x * ((long) dy0.b)) + ((long) i2);
                        while (true) {
                            Object objQ = ha1VarR.q(i2);
                            if (objQ == dy0.i) {
                                break loop0;
                            }
                            k7a k7aVar = dy0.d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = v;
                            if (objQ != k7aVar) {
                                if (objQ != dy0.e && objQ != null) {
                                    if (!(objQ instanceof vjb) && !(objQ instanceof wjb)) {
                                        k7a k7aVar2 = dy0.g;
                                        if (objQ == k7aVar2 || objQ == dy0.f) {
                                            break loop0;
                                        }
                                        if (objQ != k7aVar2) {
                                            break;
                                        }
                                    } else {
                                        if (j2 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        vjb vjbVar = objQ instanceof wjb ? ((wjb) objQ).a : (vjb) objQ;
                                        if (ha1VarR.p(i2, objQ, dy0.l)) {
                                            objB = zc5.b(objB, vjbVar);
                                            ha1VarR.s(i2, null);
                                            ha1VarR.n();
                                            break;
                                        }
                                    }
                                } else {
                                    if (ha1VarR.p(i2, objQ, dy0.l)) {
                                        ha1VarR.n();
                                        break;
                                    }
                                }
                            } else {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (ha1VarR.p(i2, objQ, dy0.l)) {
                                    ha1VarR.s(i2, null);
                                    ha1VarR.n();
                                    break;
                                }
                            }
                        }
                    }
                    ha1VarR = (ha1) ha1VarR.f();
                } while (ha1VarR != null);
                if (objB != null) {
                    if (objB instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objB;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            O((vjb) arrayList.get(size), false);
                        }
                    } else {
                        O((vjb) objB, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean F() {
        return E(u.get(this), true);
    }

    public boolean G() {
        return false;
    }

    public final boolean H() {
        long j = w.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(long j, ha1<E> ha1Var) {
        zx0<E> zx0Var;
        ha1<E> ha1Var2;
        ha1<E> ha1Var3;
        while (ha1Var.x < j && (ha1Var3 = (ha1) ha1Var.d()) != null) {
            ha1Var = ha1Var3;
        }
        while (true) {
            ha1<E> ha1Var4 = ha1Var;
            while (ha1Var4.g() && (ha1Var2 = (ha1) ha1Var4.d()) != null) {
                ha1Var4 = ha1Var2;
            }
            while (true) {
                A.getClass();
                Unsafe unsafe = rxc.a;
                long j2 = E;
                g99 g99Var = (g99) unsafe.getObjectVolatile(this, j2);
                if (g99Var.x >= ha1Var4.x) {
                    return;
                }
                if (!ha1Var4.o()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = rxc.a;
                    zx0Var = this;
                    if (unsafe2.compareAndSwapObject(zx0Var, E, g99Var, ha1Var4)) {
                        if (g99Var.k()) {
                            g99Var.i();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(zx0Var, j2) != g99Var) {
                        break;
                    } else {
                        this = zx0Var;
                    }
                }
                if (ha1Var4.k()) {
                    ha1Var4.i();
                }
                this = zx0Var;
            }
            ha1Var = ha1Var4;
        }
    }

    public final Object J(r02 r02Var, Object obj) throws Throwable {
        e41 e41Var = new e41(1, th0.e(r02Var));
        e41Var.t();
        e41Var.resumeWith(new av8.a(z()));
        Object objR = e41Var.r();
        return objR == v72.t ? objR : g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(ha1 ha1Var, int i, long j, u02 u02Var) throws Throwable {
        by0 by0Var;
        ga1 ga1Var;
        ha1<E> ha1Var2;
        if (u02Var instanceof by0) {
            by0Var = (by0) u02Var;
            int i2 = by0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                by0Var.v = i2 - Integer.MIN_VALUE;
            } else {
                by0Var = new by0(this, u02Var);
            }
        } else {
            by0Var = new by0(this, u02Var);
        }
        Object objR = by0Var.t;
        int i3 = by0Var.v;
        if (i3 == 0) {
            dv8.b(objR);
            by0Var.v = 1;
            e41 e41VarB = g41.b(th0.e(by0Var));
            try {
                sj8 sj8Var = new sj8(e41VarB);
                Object objS = S(ha1Var, i, j, sj8Var);
                if (objS != dy0.m) {
                    if (objS == dy0.o) {
                        if (j < A()) {
                            ha1Var.a();
                        }
                        ha1<E> ha1Var3 = (ha1) z.get(this);
                        while (true) {
                            if (F()) {
                                e41VarB.resumeWith(new ga1(new ga1.a(x())));
                                break;
                            }
                            long andIncrement = v.getAndIncrement(this);
                            long j2 = dy0.b;
                            long j3 = andIncrement / j2;
                            int i4 = (int) (andIncrement % j2);
                            if (ha1Var3.x != j3) {
                                ha1<E> ha1VarV = v(j3, ha1Var3);
                                if (ha1VarV != null) {
                                    ha1Var2 = ha1VarV;
                                }
                            } else {
                                ha1Var2 = ha1Var3;
                            }
                            Object objS2 = S(ha1Var2, i4, andIncrement, sj8Var);
                            ha1<E> ha1Var4 = ha1Var2;
                            if (objS2 == dy0.m) {
                                sj8Var.a(ha1Var4, i4);
                                break;
                            }
                            if (objS2 == dy0.o) {
                                if (andIncrement < A()) {
                                    ha1Var4.a();
                                }
                                ha1Var3 = ha1Var4;
                            } else {
                                if (objS2 == dy0.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                ha1Var4.a();
                                ga1Var = new ga1(objS2);
                            }
                        }
                    } else {
                        ha1Var.a();
                        ga1Var = new ga1(objS);
                    }
                    e41VarB.j(ga1Var, null);
                    break;
                }
                sj8Var.a(ha1Var, i);
                objR = e41VarB.r();
                v72 v72Var = v72.t;
                if (objR == v72Var) {
                    return v72Var;
                }
            } catch (Throwable th) {
                e41VarB.B();
                throw th;
            }
        } else {
            if (i3 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objR);
        }
        return ((ga1) objR).a;
    }

    public final void N(p99 p99Var) {
        ha1<E> ha1Var;
        Object obj;
        z.getClass();
        ha1<E> ha1Var2 = (ha1) rxc.a.getObjectVolatile(this, G);
        while (!this.F()) {
            long andIncrement = v.getAndIncrement(this);
            long j = dy0.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (ha1Var2.x != j2) {
                ha1<E> ha1VarV = this.v(j2, ha1Var2);
                if (ha1VarV == null) {
                    continue;
                } else {
                    ha1Var = ha1VarV;
                }
            } else {
                ha1Var = ha1Var2;
            }
            Object objS = this.S(ha1Var, i, andIncrement, p99Var);
            ha1Var2 = ha1Var;
            if (objS == dy0.m) {
                vjb vjbVar = p99Var instanceof vjb ? (vjb) obj : null;
                if (vjbVar == null) {
                    obj = p99Var;
                    return;
                } else {
                    obj = p99Var;
                    vjbVar.a(ha1Var2, i);
                    return;
                }
            }
            if (objS != dy0.o) {
                if (objS == dy0.n) {
                    aa0.c("unexpected");
                    return;
                } else {
                    ha1Var2.a();
                    p99Var.d(objS);
                    return;
                }
            }
            if (andIncrement < this.A()) {
                ha1Var2.a();
            }
            this = this;
            p99Var = p99Var;
        }
        p99Var.d(dy0.l);
    }

    public final void O(vjb vjbVar, boolean z2) {
        if (vjbVar instanceof b) {
            throw null;
        }
        if (vjbVar instanceof c41) {
            ((r02) vjbVar).resumeWith(new av8.a(z2 ? y() : z()));
            return;
        }
        if (vjbVar instanceof sj8) {
            ((sj8) vjbVar).t.resumeWith(new ga1(new ga1.a(x())));
            return;
        }
        if (!(vjbVar instanceof a)) {
            if (vjbVar instanceof p99) {
                ((p99) vjbVar).b(this, dy0.l);
                return;
            } else {
                tn2.d(vjbVar, "Unexpected waiter: ");
                return;
            }
        }
        a aVar = (a) vjbVar;
        e41<? super Boolean> e41Var = aVar.u;
        e41Var.getClass();
        aVar.u = null;
        aVar.t = dy0.l;
        Throwable thX = zx0.this.x();
        if (thX == null) {
            e41Var.resumeWith(Boolean.FALSE);
        } else {
            e41Var.resumeWith(new av8.a(thX));
        }
    }

    public final boolean Q(Object obj, E e2) {
        if (obj instanceof p99) {
            return ((p99) obj).b(this, e2);
        }
        if (obj instanceof sj8) {
            return dy0.a(((sj8) obj).t, new ga1(e2), null);
        }
        if (!(obj instanceof a)) {
            if (obj instanceof c41) {
                return dy0.a((c41) obj, e2, null);
            }
            tn2.d(obj, "Unexpected receiver type: ");
            return false;
        }
        a aVar = (a) obj;
        e41<? super Boolean> e41Var = aVar.u;
        e41Var.getClass();
        aVar.u = null;
        aVar.t = e2;
        Boolean bool = Boolean.TRUE;
        zx0.this.getClass();
        return dy0.a(e41Var, bool, null);
    }

    public final boolean R(Object obj, ha1<E> ha1Var, int i) {
        lya lyaVar;
        if (obj instanceof c41) {
            return dy0.a((c41) obj, g2b.a, null);
        }
        if (!(obj instanceof p99)) {
            if (obj instanceof b) {
                dy0.a(null, Boolean.TRUE, null);
                throw null;
            }
            tn2.d(obj, "Unexpected waiter: ");
            return false;
        }
        int iL = ((n99) obj).l(this, g2b.a);
        lya lyaVar2 = lya.t;
        lya lyaVar3 = lya.u;
        if (iL == 0) {
            lyaVar = lyaVar2;
        } else if (iL == 1) {
            lyaVar = lyaVar3;
        } else if (iL == 2) {
            lyaVar = lya.v;
        } else {
            if (iL != 3) {
                t65.b(iL, "Unexpected internal result: ");
                return false;
            }
            lyaVar = lya.w;
        }
        if (lyaVar == lyaVar3) {
            ha1Var.s(i, null);
        }
        return lyaVar == lyaVar2;
    }

    public final Object S(ha1<E> ha1Var, int i, long j, Object obj) {
        Object objQ = ha1Var.q(i);
        AtomicReferenceArray atomicReferenceArray = ha1Var.A;
        AtomicLongFieldUpdater atomicLongFieldUpdater = u;
        if (objQ == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return dy0.n;
                }
                if (ha1Var.p(i, objQ, obj)) {
                    t();
                    return dy0.m;
                }
            }
        } else if (objQ == dy0.d && ha1Var.p(i, objQ, dy0.i)) {
            t();
            Object obj2 = atomicReferenceArray.get(i * 2);
            ha1Var.s(i, null);
            return obj2;
        }
        while (true) {
            Object objQ2 = ha1Var.q(i);
            if (objQ2 == null || objQ2 == dy0.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (ha1Var.p(i, objQ2, dy0.h)) {
                        t();
                        return dy0.o;
                    }
                } else {
                    if (obj == null) {
                        return dy0.n;
                    }
                    if (ha1Var.p(i, objQ2, obj)) {
                        t();
                        return dy0.m;
                    }
                }
            } else if (objQ2 != dy0.d) {
                k7a k7aVar = dy0.j;
                if (objQ2 == k7aVar) {
                    return dy0.o;
                }
                if (objQ2 == dy0.h) {
                    return dy0.o;
                }
                if (objQ2 == dy0.l) {
                    t();
                    return dy0.o;
                }
                if (objQ2 != dy0.g && ha1Var.p(i, objQ2, dy0.f)) {
                    boolean z2 = objQ2 instanceof wjb;
                    if (z2) {
                        objQ2 = ((wjb) objQ2).a;
                    }
                    if (R(objQ2, ha1Var, i)) {
                        ha1Var.t(i, dy0.i);
                        t();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        ha1Var.s(i, null);
                        return obj3;
                    }
                    ha1Var.t(i, k7aVar);
                    ha1Var.n();
                    if (z2) {
                        t();
                    }
                    return dy0.o;
                }
            } else if (ha1Var.p(i, objQ2, dy0.i)) {
                t();
                Object obj4 = atomicReferenceArray.get(i * 2);
                ha1Var.s(i, null);
                return obj4;
            }
        }
    }

    public final int T(ha1<E> ha1Var, int i, E e2, long j, Object obj, boolean z2) {
        while (true) {
            Object objQ = ha1Var.q(i);
            if (objQ == null) {
                if (!j(j) || z2) {
                    if (z2) {
                        if (ha1Var.p(i, null, dy0.j)) {
                            ha1Var.n();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (ha1Var.p(i, null, obj)) {
                            return 2;
                        }
                    }
                } else if (ha1Var.p(i, null, dy0.d)) {
                    break;
                }
            } else {
                if (objQ != dy0.e) {
                    k7a k7aVar = dy0.k;
                    if (objQ == k7aVar) {
                        ha1Var.s(i, null);
                        return 5;
                    }
                    if (objQ == dy0.h) {
                        ha1Var.s(i, null);
                        return 5;
                    }
                    if (objQ == dy0.l) {
                        ha1Var.s(i, null);
                        o();
                        return 4;
                    }
                    ha1Var.s(i, null);
                    if (objQ instanceof wjb) {
                        objQ = ((wjb) objQ).a;
                    }
                    if (Q(objQ, e2)) {
                        ha1Var.t(i, dy0.i);
                        return 0;
                    }
                    if (ha1Var.A.getAndSet((i * 2) + 1, k7aVar) != k7aVar) {
                        ha1Var.r(i, true);
                    }
                    return 5;
                }
                if (ha1Var.p(i, objQ, dy0.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void U(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        zx0<E> zx0Var = this;
        if (zx0Var.H()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = w;
            if (atomicLongFieldUpdater.get(zx0Var) > j) {
                break;
            } else {
                zx0Var = this;
            }
        }
        int i = dy0.c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = x;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(zx0Var);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(zx0Var)) && j2 == atomicLongFieldUpdater.get(zx0Var)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(zx0Var);
                    if (atomicLongFieldUpdater2.compareAndSet(zx0Var, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        zx0Var = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(zx0Var);
                    long j5 = atomicLongFieldUpdater2.get(zx0Var);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z2 = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(zx0Var)) {
                        break;
                    }
                    if (z2) {
                        zx0Var = this;
                    } else {
                        zx0Var = this;
                        atomicLongFieldUpdater2.compareAndSet(zx0Var, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(zx0Var);
                    if (atomicLongFieldUpdater2.compareAndSet(zx0Var, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        zx0Var = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.sc9
    public Object a(r02 r02Var, Object obj) {
        return P(this, obj, r02Var);
    }

    @Override // defpackage.tj8
    public final m99 b() {
        c cVar = c.t;
        cVar.getClass();
        fza.b(3, cVar);
        d dVar = d.t;
        dVar.getClass();
        fza.b(3, dVar);
        return new m99(this, cVar, dVar, null);
    }

    @Override // defpackage.tj8
    public final m99 c() {
        e eVar = e.t;
        eVar.getClass();
        fza.b(3, eVar);
        f fVar = f.t;
        fVar.getClass();
        fza.b(3, fVar);
        return new m99(this, eVar, fVar, null);
    }

    @Override // defpackage.tj8
    public final Object d() {
        ha1<E> ha1Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = v;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = u.get(this);
        if (E(j2, true)) {
            return new ga1.a(x());
        }
        long j3 = j2 & 1152921504606846975L;
        ga1.b bVar = ga1.b;
        if (j >= j3) {
            return bVar;
        }
        Object obj = dy0.k;
        z.getClass();
        ha1<E> ha1Var2 = (ha1) rxc.a.getObjectVolatile(this, G);
        while (!this.F()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = dy0.b;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (ha1Var2.x != j5) {
                ha1<E> ha1VarV = this.v(j5, ha1Var2);
                if (ha1VarV == null) {
                    continue;
                } else {
                    ha1Var = ha1VarV;
                }
            } else {
                ha1Var = ha1Var2;
            }
            zx0<E> zx0Var = this;
            Object objS = zx0Var.S(ha1Var, i, andIncrement, obj);
            ha1Var2 = ha1Var;
            if (objS == dy0.m) {
                vjb vjbVar = obj instanceof vjb ? (vjb) obj : null;
                if (vjbVar != null) {
                    vjbVar.a(ha1Var2, i);
                }
                zx0Var.U(andIncrement);
                ha1Var2.n();
                return bVar;
            }
            if (objS != dy0.o) {
                if (objS != dy0.n) {
                    ha1Var2.a();
                    return objS;
                }
                aa0.c("unexpected");
                return null;
            }
            if (andIncrement < zx0Var.A()) {
                ha1Var2.a();
            }
            this = zx0Var;
        }
        return new ga1.a(this.x());
    }

    @Override // defpackage.sc9
    public final void f(pa8 pa8Var) {
        Unsafe unsafe;
        while (true) {
            C.getClass();
            Unsafe unsafe2 = rxc.a;
            zx0<E> zx0Var = this;
            if (unsafe2.compareAndSwapObject(zx0Var, F, (Object) null, pa8Var)) {
                return;
            }
            long j = F;
            if (unsafe2.getObjectVolatile(zx0Var, j) != null) {
                while (true) {
                    Object objectVolatile = rxc.a.getObjectVolatile(zx0Var, j);
                    k7a k7aVar = dy0.q;
                    if (objectVolatile != k7aVar) {
                        if (objectVolatile == dy0.r) {
                            aa0.c("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            tn2.d(objectVolatile, "Another handler is already registered: ");
                            return;
                        }
                    }
                    k7a k7aVar2 = dy0.r;
                    do {
                        zx0<E> zx0Var2 = zx0Var;
                        unsafe = rxc.a;
                        boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(zx0Var2, F, k7aVar, k7aVar2);
                        zx0Var = zx0Var2;
                        if (zCompareAndSwapObject) {
                            pa8Var.invoke(zx0Var.x());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(zx0Var, j) == k7aVar);
                }
            } else {
                this = zx0Var;
            }
        }
    }

    @Override // defpackage.sc9
    public final boolean g(Throwable th) {
        return p(th, false);
    }

    @Override // defpackage.tj8
    public final Object i(p6a p6aVar) {
        return K(this, p6aVar);
    }

    @Override // defpackage.tj8
    public final ca1<E> iterator() {
        return new a();
    }

    public final boolean j(long j) {
        return j < w.get(this) || j < v.get(this) + ((long) this.t);
    }

    @Override // defpackage.tj8
    public final void k(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        p(cancellationException, true);
    }

    public final ha1<E> l() {
        A.getClass();
        Unsafe unsafe = rxc.a;
        Object objectVolatile = unsafe.getObjectVolatile(this, E);
        y.getClass();
        ha1 ha1Var = (ha1) unsafe.getObjectVolatile(this, H);
        if (ha1Var.x > ((ha1) objectVolatile).x) {
            objectVolatile = ha1Var;
        }
        z.getClass();
        ha1 ha1Var2 = (ha1) unsafe.getObjectVolatile(this, G);
        if (ha1Var2.x > ((ha1) objectVolatile).x) {
            objectVolatile = ha1Var2;
        }
        av1 av1Var = (av1) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = av1.t;
            Object objE = av1Var.e();
            if (objE == zu1.t) {
                break;
            }
            av1 av1Var2 = (av1) objE;
            if (av1Var2 != null) {
                av1Var = av1Var2;
            } else if (av1Var.h()) {
                break;
            }
        }
        return (ha1) av1Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0070, please report this as an issue */
    @Override // defpackage.sc9
    public Object n(E e2) {
        int iH;
        vjb vjbVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = u;
        long j = atomicLongFieldUpdater.get(this);
        boolean z2 = false;
        long j2 = 1152921504606846975L;
        boolean z3 = E(j, false) ? false : !j(j & 1152921504606846975L);
        ga1.b bVar = ga1.b;
        if (z3) {
            return bVar;
        }
        Object obj = dy0.j;
        y.getClass();
        ha1<E> ha1Var = (ha1) rxc.a.getObjectVolatile(this, H);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean zE = E(andIncrement, z2);
            int i = dy0.b;
            long j4 = i;
            long j5 = j3 / j4;
            int i2 = (int) (j3 % j4);
            if (ha1Var.x == j5) {
                iH = h(this, ha1Var, i2, e2, j3, obj, zE);
                if (iH != 0) {
                    ha1Var.a();
                    return g2b.a;
                }
                if (iH != 1) {
                    return g2b.a;
                }
                if (iH != 2) {
                    if (zE) {
                        ha1Var.n();
                        return new ga1.a(z());
                    }
                    vjbVar = obj instanceof vjb ? (vjb) obj : null;
                    if (vjbVar != null) {
                        vjbVar.a(ha1Var, i2 + i);
                    }
                    ha1Var.n();
                    return bVar;
                }
                if (iH != 3) {
                    aa0.c("unexpected");
                    return null;
                }
                if (iH != 4) {
                    if (j3 < v.get(this)) {
                        ha1Var.a();
                    }
                    return new ga1.a(z());
                }
                if (iH == 5) {
                    ha1Var.a();
                }
                z2 = false;
            } else {
                ha1<E> ha1VarW = w(j5, ha1Var);
                if (ha1VarW != null) {
                    ha1Var = ha1VarW;
                    iH = h(this, ha1Var, i2, e2, j3, obj, zE);
                    if (iH != 0) {
                        ha1Var.a();
                        return g2b.a;
                    }
                    if (iH != 1) {
                        return g2b.a;
                    }
                    if (iH != 2) {
                        if (zE) {
                            ha1Var.n();
                            return new ga1.a(z());
                        }
                        if (obj instanceof vjb) {
                        }
                        if (vjbVar != null) {
                            vjbVar.a(ha1Var, i2 + i);
                        }
                        ha1Var.n();
                        return bVar;
                    }
                    if (iH != 3) {
                        aa0.c("unexpected");
                        return null;
                    }
                    if (iH != 4) {
                        if (j3 < v.get(this)) {
                            ha1Var.a();
                        }
                        return new ga1.a(z());
                    }
                    if (iH == 5) {
                        ha1Var.a();
                    }
                    z2 = false;
                } else {
                    if (zE) {
                        return new ga1.a(z());
                    }
                    z2 = false;
                }
            }
            j2 = 1152921504606846975L;
        }
    }

    @Override // defpackage.sc9
    public final boolean o() {
        return E(u.get(this), false);
    }

    public final boolean p(Throwable th, boolean z2) {
        zx0<E> zx0Var;
        boolean z3;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = u;
        if (!z2) {
            zx0Var = this;
            break;
        }
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            if (((int) (j4 >> 60)) != 0) {
                zx0Var = this;
                break;
            }
            ha1<Object> ha1Var = dy0.a;
            zx0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(zx0Var, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                break;
            }
            this = zx0Var;
        }
        k7a k7aVar = dy0.s;
        while (true) {
            B.getClass();
            zx0<E> zx0Var2 = zx0Var;
            Unsafe unsafe = rxc.a;
            long j5 = D;
            Throwable th2 = th;
            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(zx0Var2, j5, k7aVar, th2);
            zx0Var = zx0Var2;
            if (zCompareAndSwapObject) {
                z3 = true;
                break;
            }
            if (unsafe.getObjectVolatile(zx0Var, j5) != k7aVar) {
                z3 = false;
                break;
            }
            th = th2;
        }
        if (z2) {
            do {
                j3 = atomicLongFieldUpdater.get(zx0Var);
            } while (!atomicLongFieldUpdater.compareAndSet(zx0Var, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(zx0Var);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(zx0Var, j, j2));
        }
        zx0Var.o();
        if (z3) {
            zx0Var.D();
        }
        return z3;
    }

    @Override // defpackage.tj8
    public final Object q(dj1 dj1Var) {
        return L(this, dj1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ha1<E> r(long j) {
        long j2;
        ha1<E> ha1VarL = l();
        if (G()) {
            ha1<E> ha1Var = ha1VarL;
            loop0: while (true) {
                int i = dy0.b - 1;
                while (true) {
                    if (-1 < i) {
                        j2 = (ha1Var.x * ((long) dy0.b)) + ((long) i);
                        if (j2 >= v.get(this)) {
                            while (true) {
                                Object objQ = ha1Var.q(i);
                                if (objQ != null && objQ != dy0.e) {
                                    if (objQ != dy0.d) {
                                        break;
                                    }
                                    break loop0;
                                }
                                if (ha1Var.p(i, objQ, dy0.l)) {
                                    ha1Var.n();
                                    break;
                                }
                            }
                            i--;
                        }
                    } else {
                        ha1Var = (ha1) ha1Var.f();
                        if (ha1Var == null) {
                        }
                    }
                    j2 = -1;
                    break loop0;
                }
            }
            if (j2 != -1) {
                s(j2);
            }
        }
        Object objB = null;
        loop3: for (ha1<E> ha1Var2 = ha1VarL; ha1Var2 != null; ha1Var2 = (ha1) ha1Var2.f()) {
            for (int i2 = dy0.b - 1; -1 < i2; i2--) {
                if ((ha1Var2.x * ((long) dy0.b)) + ((long) i2) < j) {
                    break loop3;
                }
                while (true) {
                    Object objQ2 = ha1Var2.q(i2);
                    if (objQ2 != null && objQ2 != dy0.e) {
                        if (!(objQ2 instanceof wjb)) {
                            if (!(objQ2 instanceof vjb)) {
                                break;
                            }
                            if (ha1Var2.p(i2, objQ2, dy0.l)) {
                                objB = zc5.b(objB, objQ2);
                                ha1Var2.r(i2, true);
                                break;
                            }
                        } else {
                            if (ha1Var2.p(i2, objQ2, dy0.l)) {
                                objB = zc5.b(objB, ((wjb) objQ2).a);
                                ha1Var2.r(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (ha1Var2.p(i2, objQ2, dy0.l)) {
                            ha1Var2.n();
                            break;
                        }
                    }
                }
            }
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                O((vjb) objB, true);
                return ha1VarL;
            }
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                O((vjb) arrayList.get(size), true);
            }
        }
        return ha1VarL;
    }

    public final void s(long j) {
        z.getClass();
        ha1<E> ha1Var = (ha1) rxc.a.getObjectVolatile(this, G);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = v;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.t) + j2, w.get(this))) {
                return;
            }
            this = this;
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = dy0.b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (ha1Var.x != j4) {
                    ha1<E> ha1VarV = this.v(j4, ha1Var);
                    if (ha1VarV != null) {
                        ha1Var = ha1VarV;
                    }
                }
                ha1<E> ha1Var2 = ha1Var;
                if (this.S(ha1Var2, i, j2, null) != dy0.o || j2 < this.A()) {
                    ha1Var2.a();
                }
                ha1Var = ha1Var2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b3 A[EDGE_INSN: B:43:0x00b3->B:46:0x00c0 BREAK  A[LOOP:1: B:31:0x0080->B:92:0x0080]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00c0 A[EDGE_INSN: B:89:0x00c0->B:46:0x00c0 BREAK  A[LOOP:1: B:31:0x0080->B:92:0x0080], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
    public final void t() {
        int i;
        boolean z2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        Object objQ;
        if (H()) {
            return;
        }
        A.getClass();
        ha1<E> ha1Var = (ha1) rxc.a.getObjectVolatile(this, E);
        while (true) {
            long andIncrement = w.getAndIncrement(this);
            long j = dy0.b;
            long j2 = andIncrement / j;
            if (this.A() <= andIncrement) {
                if (ha1Var.x < j2 && ha1Var.d() != 0) {
                    this.I(j2, ha1Var);
                }
                C(this);
                return;
            }
            zx0<E> zx0Var = this;
            if (ha1Var.x == j2) {
                i = (int) (andIncrement % j);
                Object objQ2 = ha1Var.q(i);
                z2 = objQ2 instanceof vjb;
                atomicLongFieldUpdater = v;
                if (z2 || andIncrement < atomicLongFieldUpdater.get(zx0Var) || !ha1Var.p(i, objQ2, dy0.g)) {
                    while (true) {
                        objQ = ha1Var.q(i);
                        if (objQ instanceof vjb) {
                            if (andIncrement < atomicLongFieldUpdater.get(zx0Var)) {
                                if (ha1Var.p(i, objQ, new wjb((vjb) objQ))) {
                                    C(zx0Var);
                                    return;
                                }
                            } else if (ha1Var.p(i, objQ, dy0.g)) {
                                if (!zx0Var.R(objQ, ha1Var, i)) {
                                    ha1Var.t(i, dy0.j);
                                    ha1Var.n();
                                    break;
                                } else {
                                    ha1Var.t(i, dy0.d);
                                    C(zx0Var);
                                    return;
                                }
                            }
                        } else {
                            if (objQ == dy0.j) {
                                break;
                            }
                            if (objQ == null) {
                                if (ha1Var.p(i, objQ, dy0.e)) {
                                    C(zx0Var);
                                    return;
                                }
                            } else if (objQ != dy0.d || objQ == dy0.h || objQ == dy0.i || objQ == dy0.k || objQ == dy0.l) {
                                C(zx0Var);
                                return;
                            } else if (objQ != dy0.f) {
                                tn2.d(objQ, "Unexpected cell state: ");
                                return;
                            }
                        }
                    }
                    C(zx0Var);
                } else if (zx0Var.R(objQ2, ha1Var, i)) {
                    ha1Var.t(i, dy0.d);
                    C(zx0Var);
                    return;
                } else {
                    ha1Var.t(i, dy0.j);
                    ha1Var.n();
                    C(zx0Var);
                }
            } else {
                ha1<E> ha1VarU = zx0Var.u(j2, ha1Var, andIncrement);
                if (ha1VarU == null) {
                    continue;
                } else {
                    ha1Var = ha1VarU;
                    i = (int) (andIncrement % j);
                    Object objQ3 = ha1Var.q(i);
                    z2 = objQ3 instanceof vjb;
                    atomicLongFieldUpdater = v;
                    if (z2) {
                        while (true) {
                            objQ = ha1Var.q(i);
                            if (objQ instanceof vjb) {
                                if (andIncrement < atomicLongFieldUpdater.get(zx0Var)) {
                                    if (ha1Var.p(i, objQ, new wjb((vjb) objQ))) {
                                        C(zx0Var);
                                        return;
                                    }
                                } else if (ha1Var.p(i, objQ, dy0.g)) {
                                    if (!zx0Var.R(objQ, ha1Var, i)) {
                                        ha1Var.t(i, dy0.j);
                                        ha1Var.n();
                                        break;
                                    } else {
                                        ha1Var.t(i, dy0.d);
                                        C(zx0Var);
                                        return;
                                    }
                                }
                            } else {
                                if (objQ == dy0.j) {
                                    break;
                                    break;
                                }
                                if (objQ == null) {
                                    if (objQ != dy0.d) {
                                        if (objQ != dy0.f) {
                                            tn2.d(objQ, "Unexpected cell state: ");
                                            return;
                                        }
                                    }
                                    C(zx0Var);
                                    return;
                                }
                                if (ha1Var.p(i, objQ, dy0.e)) {
                                    C(zx0Var);
                                    return;
                                }
                            }
                        }
                        C(zx0Var);
                    } else {
                        while (true) {
                            objQ = ha1Var.q(i);
                            if (objQ instanceof vjb) {
                                if (andIncrement < atomicLongFieldUpdater.get(zx0Var)) {
                                    if (ha1Var.p(i, objQ, new wjb((vjb) objQ))) {
                                        C(zx0Var);
                                        return;
                                    }
                                } else if (ha1Var.p(i, objQ, dy0.g)) {
                                    if (!zx0Var.R(objQ, ha1Var, i)) {
                                        ha1Var.t(i, dy0.j);
                                        ha1Var.n();
                                        break;
                                    } else {
                                        ha1Var.t(i, dy0.d);
                                        C(zx0Var);
                                        return;
                                    }
                                }
                            } else {
                                if (objQ == dy0.j) {
                                    break;
                                    break;
                                }
                                if (objQ == null) {
                                    if (objQ != dy0.d) {
                                        if (objQ != dy0.f) {
                                            tn2.d(objQ, "Unexpected cell state: ");
                                            return;
                                        }
                                    }
                                    C(zx0Var);
                                    return;
                                }
                                if (ha1Var.p(i, objQ, dy0.e)) {
                                    C(zx0Var);
                                    return;
                                }
                            }
                        }
                        C(zx0Var);
                    }
                }
            }
            this = zx0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        int i;
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (u.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.t + ',');
        sb.append("data=[");
        z.getClass();
        Unsafe unsafe = rxc.a;
        int i3 = 0;
        y.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, H);
        int i4 = 1;
        A.getClass();
        List listI = ws0.i(unsafe.getObjectVolatile(this, G), objectVolatile, unsafe.getObjectVolatile(this, E));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            if (((ha1) obj) != dy0.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            vl.b();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((ha1) next).x;
            do {
                Object next2 = it.next();
                long j2 = ((ha1) next2).x;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        ha1 ha1Var = (ha1) next;
        long j3 = v.get(this);
        long jA = A();
        loop2: while (true) {
            int i5 = dy0.b;
            int i6 = i3;
            while (i6 < i5) {
                i = i4;
                long j4 = (ha1Var.x * ((long) dy0.b)) + ((long) i6);
                if (j4 >= jA && j4 >= j3) {
                    break loop2;
                }
                Object objQ = ha1Var.q(i6);
                Object obj2 = ha1Var.A.get(i6 * 2);
                if (objQ instanceof c41) {
                    string = (jA > j4 || j4 >= j3) ? (j3 > j4 || j4 >= jA) ? "cont" : "send" : "receive";
                } else if (objQ instanceof p99) {
                    string = (jA > j4 || j4 >= j3) ? (j3 > j4 || j4 >= jA) ? "select" : "onSend" : "onReceive";
                } else if (objQ instanceof sj8) {
                    string = "receiveCatching";
                } else if (objQ instanceof b) {
                    string = "sendBroadcast";
                } else if (objQ instanceof wjb) {
                    string = "EB(" + objQ + ')';
                } else if (xj5.a(objQ, dy0.f) || xj5.a(objQ, dy0.g)) {
                    string = "resuming_sender";
                } else {
                    if (objQ != null && !objQ.equals(dy0.e) && !objQ.equals(dy0.i) && !objQ.equals(dy0.h) && !objQ.equals(dy0.k) && !objQ.equals(dy0.j) && !objQ.equals(dy0.l)) {
                        string = objQ.toString();
                    }
                    i6++;
                    i4 = i;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i6++;
                i4 = i;
            }
            i = i4;
            ha1Var = (ha1) ha1Var.d();
            if (ha1Var == null) {
                break;
            }
            i4 = i;
            i3 = 0;
        }
        if (a3a.T(sb) == ',') {
            sb.deleteCharAt(sb.length() - i).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final ha1<E> u(long j, ha1<E> ha1Var, long j2) {
        Object objB;
        Unsafe unsafe;
        ha1<Object> ha1Var2 = dy0.a;
        cy0 cy0Var = cy0.t;
        loop0: while (true) {
            objB = zu1.b(ha1Var, j, cy0Var);
            if (!qk1.c(objB)) {
                g99 g99VarB = qk1.b(objB);
                while (true) {
                    A.getClass();
                    Unsafe unsafe2 = rxc.a;
                    long j3 = E;
                    g99 g99Var = (g99) unsafe2.getObjectVolatile(this, j3);
                    if (g99Var.x >= g99VarB.x) {
                        break loop0;
                    }
                    if (!g99VarB.o()) {
                        break;
                    }
                    do {
                        unsafe = rxc.a;
                        if (unsafe.compareAndSwapObject(this, E, g99Var, g99VarB)) {
                            if (!g99Var.k()) {
                                break loop0;
                            }
                            g99Var.i();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == g99Var);
                    if (g99VarB.k()) {
                        g99VarB.i();
                    }
                }
            } else {
                break;
            }
        }
        if (qk1.c(objB)) {
            o();
            I(j, ha1Var);
            C(this);
            return null;
        }
        ha1<E> ha1Var3 = (ha1) qk1.b(objB);
        long j4 = ha1Var3.x;
        if (j4 <= j) {
            return ha1Var3;
        }
        long j5 = j4 * ((long) dy0.b);
        if (!w.compareAndSet(this, j2 + 1, j5)) {
            C(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = x;
        if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    public final ha1<E> v(long j, ha1<E> ha1Var) {
        Object objB;
        ha1<E> ha1Var2;
        long j2;
        Unsafe unsafe;
        ha1<Object> ha1Var3 = dy0.a;
        cy0 cy0Var = cy0.t;
        loop0: while (true) {
            objB = zu1.b(ha1Var, j, cy0Var);
            if (!qk1.c(objB)) {
                g99 g99VarB = qk1.b(objB);
                while (true) {
                    z.getClass();
                    Unsafe unsafe2 = rxc.a;
                    long j3 = G;
                    g99 g99Var = (g99) unsafe2.getObjectVolatile(this, j3);
                    if (g99Var.x >= g99VarB.x) {
                        break loop0;
                    }
                    if (!g99VarB.o()) {
                        break;
                    }
                    do {
                        unsafe = rxc.a;
                        if (unsafe.compareAndSwapObject(this, G, g99Var, g99VarB)) {
                            if (!g99Var.k()) {
                                break loop0;
                            }
                            g99Var.i();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == g99Var);
                    if (g99VarB.k()) {
                        g99VarB.i();
                    }
                }
            } else {
                break;
            }
        }
        if (qk1.c(objB)) {
            o();
            if (ha1Var.x * ((long) dy0.b) < A()) {
                ha1Var.a();
                return null;
            }
        } else {
            ha1<E> ha1Var4 = (ha1) qk1.b(objB);
            long j4 = ha1Var4.x;
            if (H() || j > w.get(this) / ((long) dy0.b)) {
                ha1Var2 = ha1Var4;
                break;
            }
            loop3: while (true) {
                A.getClass();
                Unsafe unsafe3 = rxc.a;
                long j5 = E;
                g99 g99Var2 = (g99) unsafe3.getObjectVolatile(this, j5);
                if (g99Var2.x >= j4 || !ha1Var4.o()) {
                    ha1Var2 = ha1Var4;
                    break;
                }
                while (true) {
                    Unsafe unsafe4 = rxc.a;
                    ha1Var2 = ha1Var4;
                    if (unsafe4.compareAndSwapObject(this, E, g99Var2, ha1Var4)) {
                        if (!g99Var2.k()) {
                            break loop3;
                        }
                        g99Var2.i();
                        break loop3;
                    }
                    if (unsafe4.getObjectVolatile(this, j5) != g99Var2) {
                        break;
                    }
                    ha1Var4 = ha1Var2;
                }
                if (ha1Var2.k()) {
                    ha1Var2.i();
                }
                ha1Var4 = ha1Var2;
            }
            if (j4 <= j) {
                return ha1Var2;
            }
            long j6 = j4 * ((long) dy0.b);
            do {
                j2 = v.get(this);
                if (j2 >= j6) {
                    break;
                }
            } while (!v.compareAndSet(this, j2, j6));
            if (j4 * ((long) dy0.b) < A()) {
                ha1Var2.a();
            }
        }
        return null;
    }

    public final ha1<E> w(long j, ha1<E> ha1Var) {
        Object objB;
        long j2;
        long j3;
        Unsafe unsafe;
        ha1<Object> ha1Var2 = dy0.a;
        cy0 cy0Var = cy0.t;
        loop0: while (true) {
            objB = zu1.b(ha1Var, j, cy0Var);
            if (!qk1.c(objB)) {
                g99 g99VarB = qk1.b(objB);
                while (true) {
                    y.getClass();
                    Unsafe unsafe2 = rxc.a;
                    long j4 = H;
                    g99 g99Var = (g99) unsafe2.getObjectVolatile(this, j4);
                    if (g99Var.x >= g99VarB.x) {
                        break loop0;
                    }
                    if (!g99VarB.o()) {
                        break;
                    }
                    do {
                        unsafe = rxc.a;
                        if (unsafe.compareAndSwapObject(this, H, g99Var, g99VarB)) {
                            if (!g99Var.k()) {
                                break loop0;
                            }
                            g99Var.i();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == g99Var);
                    if (g99VarB.k()) {
                        g99VarB.i();
                    }
                }
            } else {
                break;
            }
        }
        boolean zC = qk1.c(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = v;
        if (zC) {
            o();
            if (ha1Var.x * ((long) dy0.b) < atomicLongFieldUpdater.get(this)) {
                ha1Var.a();
                return null;
            }
        } else {
            ha1<E> ha1Var3 = (ha1) qk1.b(objB);
            long j5 = ha1Var3.x;
            if (j5 <= j) {
                return ha1Var3;
            }
            long j6 = j5 * ((long) dy0.b);
            do {
                j2 = u.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!u.compareAndSet(this, j2, j3 + (((long) ((int) (j2 >> 60))) << 60)));
            if (j5 * ((long) dy0.b) < atomicLongFieldUpdater.get(this)) {
                ha1Var3.a();
            }
        }
        return null;
    }

    public final Throwable x() {
        B.getClass();
        return (Throwable) rxc.a.getObjectVolatile(this, D);
    }

    public final Throwable y() {
        Throwable thX = x();
        return thX == null ? new hg1("Channel was closed") : thX;
    }

    public final Throwable z() {
        Throwable thX = x();
        return thX == null ? new ig1("Channel was closed") : thX;
    }
}
