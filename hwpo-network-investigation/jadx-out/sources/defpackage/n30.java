package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class n30<K, V> extends ep9<K, V> implements Map<K, V> {
    public n30<K, V>.a w;
    public n30<K, V>.c x;
    public n30<K, V>.e y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return n30.this.v;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b extends pa5<K> {
        public b() {
            super(n30.this.v);
        }

        @Override // defpackage.pa5
        public final K a(int i) {
            return n30.this.f(i);
        }

        @Override // defpackage.pa5
        public final void b(int i) {
            n30.this.h(i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int t;
        public int u = -1;
        public boolean v;

        public d() {
            this.t = n30.this.v - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.v) {
                aa0.c("This container does not support retaining Map.Entry objects");
                return false;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.u;
                n30 n30Var = n30.this;
                if (xj5.a(key, n30Var.f(i)) && xj5.a(entry.getValue(), n30Var.j(this.u))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.v) {
                return n30.this.f(this.u);
            }
            aa0.c("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.v) {
                return n30.this.j(this.u);
            }
            aa0.c("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.u < this.t;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.v) {
                aa0.c("This container does not support retaining Map.Entry objects");
                return 0;
            }
            int i = this.u;
            n30 n30Var = n30.this;
            K kF = n30Var.f(i);
            V vJ = n30Var.j(this.u);
            return (kF == null ? 0 : kF.hashCode()) ^ (vJ != null ? vJ.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                vl.b();
                return null;
            }
            this.u++;
            this.v = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.v) {
                d43.c();
                return;
            }
            n30.this.h(this.u);
            this.u--;
            this.t--;
            this.v = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (this.v) {
                return n30.this.i(this.u, v);
            }
            aa0.c("This container does not support retaining Map.Entry objects");
            return null;
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class f extends pa5<V> {
        public f() {
            super(n30.this.v);
        }

        @Override // defpackage.pa5
        public final V a(int i) {
            return n30.this.j(i);
        }

        @Override // defpackage.pa5
        public final void b(int i) {
            n30.this.h(i);
        }
    }

    public n30(n30 n30Var) {
        super(0);
        if (n30Var != null) {
            g(n30Var);
        }
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        n30<K, V>.a aVar = this.w;
        if (aVar != null) {
            return aVar;
        }
        n30<K, V>.a aVar2 = new a();
        this.w = aVar2;
        return aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        n30<K, V>.c cVar = this.x;
        if (cVar != null) {
            return cVar;
        }
        n30<K, V>.c cVar2 = new c();
        this.x = cVar2;
        return cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l(Collection<?> collection) {
        int i = this.v;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.v;
    }

    public final boolean m(Collection<?> collection) {
        int i = this.v;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(f(i2))) {
                h(i2);
            }
        }
        return i != this.v;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.v);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        n30<K, V>.e eVar = this.y;
        if (eVar != null) {
            return eVar;
        }
        n30<K, V>.e eVar2 = new e();
        this.y = eVar2;
        return eVar2;
    }

    public n30() {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            n30.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return n30.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return n30.this.k(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            n30 n30Var = n30.this;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            try {
                return n30Var.v == set.size() && n30Var.k(set);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            n30 n30Var = n30.this;
            int iHashCode = 0;
            for (int i = n30Var.v - 1; i >= 0; i--) {
                K kF = n30Var.f(i);
                iHashCode += kF == null ? 0 : kF.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return n30.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            n30 n30Var = n30.this;
            int iD = n30Var.d(obj);
            if (iD < 0) {
                return false;
            }
            n30Var.h(iD);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return n30.this.l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return n30.this.m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return n30.this.v;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            n30 n30Var = n30.this;
            int i = n30Var.v;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = n30Var.f(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            n30 n30Var = n30.this;
            int i = n30Var.v;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = n30Var.f(i2);
            }
            return objArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            n30.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return n30.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return n30.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            n30 n30Var = n30.this;
            int iA = n30Var.a(obj);
            if (iA < 0) {
                return false;
            }
            n30Var.h(iA);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            n30 n30Var = n30.this;
            int i = n30Var.v;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(n30Var.j(i2))) {
                    n30Var.h(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            n30 n30Var = n30.this;
            int i = n30Var.v;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(n30Var.j(i2))) {
                    n30Var.h(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return n30.this.v;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            n30 n30Var = n30.this;
            int i = n30Var.v;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = n30Var.j(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            n30 n30Var = n30.this;
            int i = n30Var.v;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = n30Var.j(i2);
            }
            return objArr;
        }
    }
}
