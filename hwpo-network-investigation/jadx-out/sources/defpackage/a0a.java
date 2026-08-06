package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0a<T> extends s2<c0a> implements i37<T>, r54, ri4<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(a0a.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long z = rxc.a.objectFieldOffset(a0a.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, 401, 406}, m = "collect", v = 1)
    public static final class a extends u02 {
        public int A;
        public s54 t;
        public c0a u;
        public el5 v;
        public Object w;
        public Object x;
        public /* synthetic */ Object y;
        public final /* synthetic */ a0a<T> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0a<T> a0aVar, r02<? super a> r02Var) {
            super(r02Var);
            this.z = a0aVar;
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.y = obj;
            this.A |= Integer.MIN_VALUE;
            this.z.collect(null, this);
            return v72.t;
        }
    }

    public a0a(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.zl9
    public final List<T> a() {
        return ws0.h(getValue());
    }

    @Override // defpackage.ri4
    public final r54<T> b(h72 h72Var, int i, xx0 xx0Var) {
        return (((i < 0 || i >= 2) && i != -2) || xx0Var != xx0.u) ? ty1.f(this, h72Var, i, xx0Var) : this;
    }

    @Override // defpackage.i37
    public final boolean c(T t, T t2) {
        k7a k7aVar = rd7.a;
        if (t == null) {
            t = (T) k7aVar;
        }
        if (t2 == null) {
            t2 = (T) k7aVar;
        }
        return l(t, t2);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ea A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:33:0x0082, B:35:0x008a, B:38:0x0091, B:39:0x0095, B:41:0x0098, B:51:0x00b9, B:54:0x00c9, B:55:0x00e3, B:61:0x00f5, B:64:0x00fc, B:58:0x00ea, B:60:0x00f0, B:43:0x009e, B:47:0x00a5, B:21:0x0047, B:24:0x0050, B:32:0x0073, B:27:0x005e, B:29:0x0062), top: B:69:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[LOOP:0: B:55:0x00e3->B:74:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00c8 -> B:33:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r54
    public final java.lang.Object collect(defpackage.s54<? super T> r13, defpackage.r02<?> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a0a.collect(s54, r02):java.lang.Object");
    }

    @Override // defpackage.f37
    public final void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.f37, defpackage.s54
    public final Object emit(T t, r02<? super g2b> r02Var) {
        setValue(t);
        return g2b.a;
    }

    @Override // defpackage.f37
    public final boolean f(T t) {
        setValue(t);
        return true;
    }

    @Override // defpackage.i37, defpackage.zz9
    public final T getValue() {
        y.getClass();
        T t = (T) rxc.a.getObjectVolatile(this, z);
        if (t == rd7.a) {
            return null;
        }
        return t;
    }

    @Override // defpackage.s2
    public final u2 i() {
        return new c0a();
    }

    @Override // defpackage.s2
    public final u2[] j() {
        return new c0a[2];
    }

    public final boolean l(Object obj, Object obj2) {
        int i;
        Object obj3;
        k7a k7aVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
            Object obj4 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !xj5.a(obj4, obj)) {
                return false;
            }
            if (xj5.a(obj4, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.x;
            if ((i2 & 1) != 0) {
                this.x = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.x = i3;
            Object obj5 = this.t;
            g2b g2bVar = g2b.a;
            while (true) {
                c0a[] c0aVarArr = (c0a[]) obj5;
                if (c0aVarArr != null) {
                    for (c0a c0aVar : c0aVarArr) {
                        if (c0aVar != null) {
                            AtomicReference<Object> atomicReference = c0aVar.a;
                            while (true) {
                                Object obj6 = atomicReference.get();
                                if (obj6 == null || obj6 == (k7aVar = b0a.u)) {
                                    break;
                                }
                                k7a k7aVar2 = b0a.t;
                                if (obj6 != k7aVar2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj6, k7aVar2)) {
                                            ((e41) obj6).resumeWith(g2b.a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj6);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj6, k7aVar)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj6);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.x;
                    if (i == i3) {
                        this.x = i3 + 1;
                        return true;
                    }
                    obj3 = this.t;
                    g2b g2bVar2 = g2b.a;
                }
                obj5 = obj3;
                i3 = i;
            }
        }
    }

    @Override // defpackage.i37
    public final void setValue(T t) {
        if (t == null) {
            t = (T) rd7.a;
        }
        l(null, t);
    }
}
