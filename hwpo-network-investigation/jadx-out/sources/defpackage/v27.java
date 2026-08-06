package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v27<E> extends dl7<E> implements do5 {
    public final u27<E> u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Iterator<E>, zn5 {
        public int t = -1;
        public final zc9 u;
        public final /* synthetic */ v27<E> v;

        /* JADX INFO: renamed from: v27$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", l = {1489}, m = "invokeSuspend")
        public static final class C0272a extends zu8 implements ci4<ad9<? super E>, r02<? super g2b>, Object> {
            public final /* synthetic */ v27<E> A;
            public final /* synthetic */ a B;
            public a u;
            public v27 v;
            public long[] w;
            public int x;
            public int y;
            public /* synthetic */ Object z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0272a(v27<E> v27Var, a aVar, r02<? super C0272a> r02Var) {
                super(2, r02Var);
                this.A = v27Var;
                this.B = aVar;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                C0272a c0272a = new C0272a(this.A, this.B, r02Var);
                c0272a.z = obj;
                return c0272a;
            }

            @Override // defpackage.ci4
            public final Object invoke(Object obj, r02<? super g2b> r02Var) {
                return ((C0272a) create((ad9) obj, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad9 ad9Var;
                v27<E> v27Var;
                long[] jArr;
                int i;
                a aVar;
                int i2 = this.y;
                if (i2 == 0) {
                    dv8.b(obj);
                    ad9Var = (ad9) this.z;
                    v27Var = this.A;
                    u27<E> u27Var = v27Var.u;
                    jArr = u27Var.c;
                    i = u27Var.e;
                    aVar = this.B;
                } else {
                    if (i2 != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.x;
                    jArr = this.w;
                    v27Var = this.v;
                    aVar = this.u;
                    ad9Var = (ad9) this.z;
                    dv8.b(obj);
                }
                if (i == Integer.MAX_VALUE) {
                    return g2b.a;
                }
                int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
                aVar.t = i;
                Object obj2 = v27Var.u.b[i];
                this.z = ad9Var;
                this.u = aVar;
                this.v = v27Var;
                this.w = jArr;
                this.x = i3;
                this.y = 1;
                ad9Var.a(this, obj2);
                return v72.t;
            }
        }

        public a(v27<E> v27Var) {
            this.v = v27Var;
            this.u = xs.b(new C0272a(v27Var, this, null));
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
                this.v.u.h(i);
                this.t = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v27(u27<E> u27Var) {
        super(u27Var);
        u27Var.getClass();
        this.u = u27Var;
    }

    @Override // defpackage.dl7, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.u.a(e);
    }

    @Override // defpackage.dl7, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        u27<E> u27Var = this.u;
        u27Var.getClass();
        int i = u27Var.g;
        for (Object obj : collection) {
            int iD = u27Var.d((E) obj);
            u27Var.b[iD] = obj;
            long[] jArr = u27Var.c;
            int i2 = u27Var.d;
            jArr[iD] = (((long) i2) & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((((long) iD) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            u27Var.d = iD;
            if (u27Var.e == Integer.MAX_VALUE) {
                u27Var.e = iD;
            }
        }
        return i != u27Var.g;
    }

    @Override // defpackage.dl7, java.util.Set, java.util.Collection
    public final void clear() {
        this.u.b();
    }

    @Override // defpackage.dl7, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a(this);
    }

    @Override // defpackage.dl7, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.u.g(obj);
    }

    @Override // defpackage.dl7, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        int iNumberOfTrailingZeros;
        collection.getClass();
        u27<E> u27Var = this.u;
        u27Var.getClass();
        int i = u27Var.g;
        Iterator<T> it = collection.iterator();
        while (true) {
            int i2 = 1;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i4 = iHashCode ^ (iHashCode << 16);
            int i5 = i4 & 127;
            int i6 = u27Var.f;
            int i7 = (i4 >>> 7) & i6;
            while (true) {
                long[] jArr = u27Var.a;
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                long j = ((jArr[i8 + i2] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
                long j2 = (((long) i5) * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (j3 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i6;
                    int i10 = i2;
                    if (xj5.a(u27Var.b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i2 = i10;
                }
                int i11 = i2;
                if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i3 += 8;
                i7 = (i7 + i3) & i6;
                i2 = i11;
            }
            if (iNumberOfTrailingZeros >= 0) {
                u27Var.h(iNumberOfTrailingZeros);
            }
        }
        return i != u27Var.g;
    }

    @Override // defpackage.dl7, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        collection.getClass();
        return this.u.i(collection);
    }
}
