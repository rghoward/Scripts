package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e37<E> extends ik9<E> implements do5 {
    public final d37<E> u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Iterator<E>, zn5 {
        public int t = -1;
        public final zc9 u;
        public final /* synthetic */ e37<E> v;

        /* JADX INFO: renamed from: e37$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1188}, m = "invokeSuspend")
        public static final class C0076a extends zu8 implements ci4<ad9<? super E>, r02<? super g2b>, Object> {
            public int A;
            public long B;
            public int C;
            public /* synthetic */ Object D;
            public final /* synthetic */ e37<E> E;
            public final /* synthetic */ a F;
            public a u;
            public e37 v;
            public long[] w;
            public int x;
            public int y;
            public int z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0076a(e37<E> e37Var, a aVar, r02<? super C0076a> r02Var) {
                super(2, r02Var);
                this.E = e37Var;
                this.F = aVar;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C0076a c0076a = new C0076a(this.E, this.F, r02Var);
                c0076a.D = obj;
                return c0076a;
            }

            @Override // defpackage.ci4
            public final Object invoke(Object obj, r02<? super g2b> r02Var) {
                return ((C0076a) create((ad9) obj, r02Var)).invokeSuspend(g2b.a);
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0051  */
            /* JADX WARN: Code duplicated, block: B:20:0x0097 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:21:0x0099  */
            /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.ak0
            public final java.lang.Object invokeSuspend(java.lang.Object r21) {
                /*
                    r20 = this;
                    r0 = r20
                    int r1 = r0.C
                    r2 = 0
                    r3 = 8
                    r4 = 1
                    if (r1 == 0) goto L2c
                    if (r1 != r4) goto L25
                    int r1 = r0.A
                    int r5 = r0.z
                    long r6 = r0.B
                    int r8 = r0.y
                    int r9 = r0.x
                    long[] r10 = r0.w
                    e37 r11 = r0.v
                    e37$a r12 = r0.u
                    java.lang.Object r13 = r0.D
                    ad9 r13 = (defpackage.ad9) r13
                    defpackage.dv8.b(r21)
                    goto L94
                L25:
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.aa0.c(r0)
                    r0 = 0
                    return r0
                L2c:
                    defpackage.dv8.b(r21)
                    java.lang.Object r1 = r0.D
                    ad9 r1 = (defpackage.ad9) r1
                    e37<E> r5 = r0.E
                    d37<E> r6 = r5.u
                    long[] r6 = r6.a
                    int r7 = r6.length
                    int r7 = r7 + (-2)
                    if (r7 < 0) goto La4
                    e37$a r8 = r0.F
                    r9 = r2
                L41:
                    r10 = r6[r9]
                    long r12 = ~r10
                    r14 = 7
                    long r12 = r12 << r14
                    long r12 = r12 & r10
                    r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r12 = r12 & r14
                    int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                    if (r12 == 0) goto L9f
                    int r12 = r9 - r7
                    int r12 = ~r12
                    int r12 = r12 >>> 31
                    int r12 = 8 - r12
                    r13 = r1
                    r1 = r2
                    r18 = r10
                    r11 = r5
                    r10 = r6
                    r5 = r12
                    r12 = r8
                    r8 = r9
                    r9 = r7
                    r6 = r18
                L64:
                    if (r1 >= r5) goto L97
                    r14 = 255(0xff, double:1.26E-321)
                    long r14 = r14 & r6
                    r16 = 128(0x80, double:6.3E-322)
                    int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                    if (r14 >= 0) goto L94
                    int r2 = r8 << 3
                    int r2 = r2 + r1
                    r12.t = r2
                    d37<E> r3 = r11.u
                    java.lang.Object[] r3 = r3.b
                    r2 = r3[r2]
                    r0.D = r13
                    r0.u = r12
                    r0.v = r11
                    r0.w = r10
                    r0.x = r9
                    r0.y = r8
                    r0.B = r6
                    r0.z = r5
                    r0.A = r1
                    r0.C = r4
                    r13.a(r0, r2)
                    v72 r0 = defpackage.v72.t
                    return r0
                L94:
                    long r6 = r6 >> r3
                    int r1 = r1 + r4
                    goto L64
                L97:
                    if (r5 != r3) goto La4
                    r7 = r9
                    r6 = r10
                    r5 = r11
                    r1 = r13
                    r9 = r8
                    r8 = r12
                L9f:
                    if (r9 == r7) goto La4
                    int r9 = r9 + 1
                    goto L41
                La4:
                    g2b r0 = defpackage.g2b.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: e37.a.C0076a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(e37<E> e37Var) {
            this.v = e37Var;
            this.u = xs.b(new C0076a(e37Var, this, null));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.u.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            return (E) this.u.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = this.t;
            if (i != -1) {
                this.v.u.m(i);
                this.t = -1;
            }
        }
    }

    public e37(d37<E> d37Var) {
        super(d37Var);
        this.u = d37Var;
    }

    @Override // defpackage.ik9, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.u.a(e);
    }

    @Override // defpackage.ik9, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        d37<E> d37Var = this.u;
        d37Var.getClass();
        int i = d37Var.d;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            d37Var.k((E) it.next());
        }
        return i != d37Var.d;
    }

    @Override // defpackage.ik9, java.util.Set, java.util.Collection
    public final void clear() {
        this.u.b();
    }

    @Override // defpackage.ik9, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a(this);
    }

    @Override // defpackage.ik9, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.u.l(obj);
    }

    @Override // defpackage.ik9, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        collection.getClass();
        d37<E> d37Var = this.u;
        d37Var.getClass();
        int i = d37Var.d;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            d37Var.i((E) it.next());
        }
        return i != d37Var.d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[LOOP:0: B:5:0x0017->B:17:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[EDGE_INSN: B:24:0x0059->B:18:0x0059 BREAK  A[LOOP:0: B:5:0x0017->B:17:0x0056], SYNTHETIC] */
    @Override // defpackage.ik9, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        collection.getClass();
        d37<E> d37Var = this.u;
        d37Var.getClass();
        Object[] objArr = d37Var.b;
        int i = d37Var.d;
        long[] jArr = d37Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!th1.u(collection, objArr[i5])) {
                                d37Var.m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != d37Var.d;
    }
}
