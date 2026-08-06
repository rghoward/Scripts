package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ik9<E> implements Set<E>, zn5 {
    public final d37 t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.collection.SetWrapper$iterator$1", f = "ScatterSet.kt", l = {1153}, m = "invokeSuspend")
    public static final class a extends zu8 implements ci4<ad9<? super E>, r02<? super g2b>, Object> {
        public long A;
        public int B;
        public /* synthetic */ Object C;
        public final /* synthetic */ ik9<E> D;
        public Object[] u;
        public long[] v;
        public int w;
        public int x;
        public int y;
        public int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ik9<E> ik9Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.D = ik9Var;
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

        /* JADX WARN: Code duplicated, block: B:13:0x004e  */
        /* JADX WARN: Code duplicated, block: B:20:0x008a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:21:0x008c  */
        /* JADX WARN: Code duplicated, block: B:23:0x0092  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004c -> B:22:0x0090). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004e -> B:14:0x005f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0068 -> B:19:0x0087). Please report as a decompilation issue!!! */
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
                if (r1 == 0) goto L29
                if (r1 != r4) goto L22
                int r1 = r0.z
                int r5 = r0.y
                long r6 = r0.A
                int r8 = r0.x
                int r9 = r0.w
                long[] r10 = r0.v
                java.lang.Object[] r11 = r0.u
                java.lang.Object r12 = r0.C
                ad9 r12 = (defpackage.ad9) r12
                defpackage.dv8.b(r20)
                goto L87
            L22:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r0)
                r0 = 0
                return r0
            L29:
                defpackage.dv8.b(r20)
                java.lang.Object r1 = r0.C
                ad9 r1 = (defpackage.ad9) r1
                ik9<E> r5 = r0.D
                d37 r5 = r5.t
                java.lang.Object[] r6 = r5.b
                long[] r5 = r5.a
                int r7 = r5.length
                int r7 = r7 + (-2)
                if (r7 < 0) goto L95
                r8 = r2
            L3e:
                r9 = r5[r8]
                long r11 = ~r9
                r13 = 7
                long r11 = r11 << r13
                long r11 = r11 & r9
                r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r11 = r11 & r13
                int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r11 == 0) goto L90
                int r11 = r8 - r7
                int r11 = ~r11
                int r11 = r11 >>> 31
                int r11 = 8 - r11
                r12 = r1
                r1 = r2
                r17 = r9
                r10 = r5
                r9 = r7
                r5 = r11
                r11 = r6
                r6 = r17
            L5f:
                if (r1 >= r5) goto L8a
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r6
                r15 = 128(0x80, double:6.3E-322)
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 >= 0) goto L87
                int r2 = r8 << 3
                int r2 = r2 + r1
                r2 = r11[r2]
                r0.C = r12
                r0.u = r11
                r0.v = r10
                r0.w = r9
                r0.x = r8
                r0.A = r6
                r0.y = r5
                r0.z = r1
                r0.B = r4
                r12.a(r0, r2)
                v72 r0 = defpackage.v72.t
                return r0
            L87:
                long r6 = r6 >> r3
                int r1 = r1 + r4
                goto L5f
            L8a:
                if (r5 != r3) goto L95
                r7 = r9
                r5 = r10
                r6 = r11
                r1 = r12
            L90:
                if (r8 == r7) goto L95
                int r8 = r8 + 1
                goto L3e
            L95:
                g2b r0 = defpackage.g2b.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ik9.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ik9(d37 d37Var) {
        this.t = d37Var;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.t.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        collection.getClass();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.t.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.t.equals(((ik9) obj).t);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.t.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.t.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return xs.b(new a(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.t.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) mh1.c(this, tArr);
    }

    public final String toString() {
        return this.t.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return mh1.b(this);
    }
}
