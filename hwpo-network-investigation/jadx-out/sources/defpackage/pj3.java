package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pj3<K, V> implements Set<Map.Entry<? extends K, ? extends V>>, zn5 {
    public final y39<K, V> t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.collection.Entries$iterator$1", f = "ScatterMap.kt", l = {1414}, m = "invokeSuspend")
    public static final class a extends zu8 implements ci4<ad9<? super Map.Entry<? extends K, ? extends V>>, r02<? super g2b>, Object> {
        public long A;
        public int B;
        public /* synthetic */ Object C;
        public final /* synthetic */ pj3<K, V> D;
        public pj3 u;
        public long[] v;
        public int w;
        public int x;
        public int y;
        public int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pj3<K, V> pj3Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.D = pj3Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.D, r02Var);
            aVar.C = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Object obj, r02<? super g2b> r02Var) {
            return ((a) create((ad9) obj, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x004d  */
        /* JADX WARN: Code duplicated, block: B:20:0x0097 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:21:0x0099  */
        /* JADX WARN: Code duplicated, block: B:23:0x009f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004b -> B:22:0x009d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:14:0x005f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0068 -> B:19:0x0094). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.ak0
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                int r1 = r0.B
                r2 = 0
                r3 = 8
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 != r4) goto L23
                int r1 = r0.z
                int r5 = r0.y
                long r6 = r0.A
                int r8 = r0.x
                int r9 = r0.w
                long[] r10 = r0.v
                pj3 r11 = r0.u
                java.lang.Object r12 = r0.C
                ad9 r12 = (defpackage.ad9) r12
                defpackage.dv8.b(r20)
                goto L94
            L23:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r0)
                r0 = 0
                return r0
            L2a:
                defpackage.dv8.b(r20)
                java.lang.Object r1 = r0.C
                ad9 r1 = (defpackage.ad9) r1
                pj3<K, V> r5 = r0.D
                y39<K, V> r6 = r5.t
                long[] r6 = r6.a
                int r7 = r6.length
                int r7 = r7 + (-2)
                if (r7 < 0) goto La2
                r8 = r2
            L3d:
                r9 = r6[r8]
                long r11 = ~r9
                r13 = 7
                long r11 = r11 << r13
                long r11 = r11 & r9
                r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r11 = r11 & r13
                int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r11 == 0) goto L9d
                int r11 = r8 - r7
                int r11 = ~r11
                int r11 = r11 >>> 31
                int r11 = 8 - r11
                r12 = r11
                r11 = r5
                r5 = r12
                r12 = r1
                r1 = r2
                r17 = r9
                r10 = r6
                r9 = r7
                r6 = r17
            L5f:
                if (r1 >= r5) goto L97
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r6
                r15 = 128(0x80, double:6.3E-322)
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 >= 0) goto L94
                int r2 = r8 << 3
                int r2 = r2 + r1
                qh6 r3 = new qh6
                y39<K, V> r13 = r11.t
                java.lang.Object[] r14 = r13.b
                r14 = r14[r2]
                java.lang.Object[] r13 = r13.c
                r2 = r13[r2]
                r3.<init>(r14, r2)
                r0.C = r12
                r0.u = r11
                r0.v = r10
                r0.w = r9
                r0.x = r8
                r0.A = r6
                r0.y = r5
                r0.z = r1
                r0.B = r4
                r12.a(r0, r3)
                v72 r0 = defpackage.v72.t
                return r0
            L94:
                long r6 = r6 >> r3
                int r1 = r1 + r4
                goto L5f
            L97:
                if (r5 != r3) goto La2
                r7 = r9
                r6 = r10
                r5 = r11
                r1 = r12
            L9d:
                if (r8 == r7) goto La2
                int r8 = r8 + 1
                goto L3d
            La2:
                g2b r0 = defpackage.g2b.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: pj3.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public pj3(y39<K, V> y39Var) {
        y39Var.getClass();
        this.t = y39Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return xj5.a(this.t.d((K) entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        collection.getClass();
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!xj5.a(this.t.d((K) entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.t.e();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return xs.b(new a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.t.e;
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) mh1.c(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return mh1.b(this);
    }
}
