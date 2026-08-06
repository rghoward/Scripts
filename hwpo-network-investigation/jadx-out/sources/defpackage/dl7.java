package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class dl7<E> implements Set<E>, zn5 {
    public final u27 t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.collection.OrderedSetWrapper$iterator$1", f = "OrderedScatterSet.kt", l = {1454}, m = "invokeSuspend")
    public static final class a extends zu8 implements ci4<ad9<? super E>, r02<? super g2b>, Object> {
        public Object[] u;
        public long[] v;
        public int w;
        public int x;
        public /* synthetic */ Object y;
        public final /* synthetic */ dl7<E> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dl7<E> dl7Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.z = dl7Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.z, r02Var);
            aVar.y = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Object obj, r02<? super g2b> r02Var) {
            return ((a) create((ad9) obj, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad9 ad9Var;
            Object[] objArr;
            long[] jArr;
            int i;
            int i2 = this.x;
            if (i2 == 0) {
                dv8.b(obj);
                ad9Var = (ad9) this.y;
                u27 u27Var = this.z.t;
                objArr = u27Var.b;
                jArr = u27Var.c;
                i = u27Var.e;
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.w;
                jArr = this.v;
                objArr = this.u;
                ad9Var = (ad9) this.y;
                dv8.b(obj);
            }
            if (i == Integer.MAX_VALUE) {
                return g2b.a;
            }
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj2 = objArr[i];
            this.y = ad9Var;
            this.u = objArr;
            this.v = jArr;
            this.w = i3;
            this.x = 1;
            ad9Var.a(this, obj2);
            return v72.t;
        }
    }

    public dl7(u27 u27Var) {
        u27Var.getClass();
        this.t = u27Var;
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
        return xj5.a(this.t, ((dl7) obj).t);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.t.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.t.g == 0;
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
        return this.t.g;
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
