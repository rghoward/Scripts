package defpackage;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class is9<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int z = 0;
    public final int t;
    public List<is9<K, V>.b> u = Collections.EMPTY_LIST;
    public Map<K, V> v;
    public boolean w;
    public volatile is9<K, V>.d x;
    public Map<K, V> y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static final C0180a a = new C0180a();
        public static final b b = new b();

        /* JADX INFO: renamed from: is9$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class C0180a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.a;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements Map.Entry<K, V>, Comparable<is9<K, V>.b> {
        public final K t;
        public V u;

        public b() {
            throw null;
        }

        public b(K k, V v) {
            this.t = k;
            this.u = v;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.t.compareTo(((b) obj).t);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            boolean zEquals2;
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k = this.t;
                    if (k == null) {
                        zEquals = key == null;
                    } else {
                        zEquals = k.equals(key);
                    }
                    if (zEquals) {
                        V v = this.u;
                        Object value = entry.getValue();
                        if (v == null) {
                            zEquals2 = value == null;
                        } else {
                            zEquals2 = v.equals(value);
                        }
                        if (zEquals2) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.t;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.u;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.t;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.u;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            int i = is9.z;
            is9.this.b();
            V v2 = this.u;
            this.u = v;
            return v2;
        }

        public final String toString() {
            return this.t + "=" + this.u;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c implements Iterator<Map.Entry<K, V>> {
        public int t = -1;
        public boolean u;
        public Iterator<Map.Entry<K, V>> v;

        public c() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.v == null) {
                this.v = is9.this.v.entrySet().iterator();
            }
            return this.v;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.t + 1;
            is9 is9Var = is9.this;
            return i < is9Var.u.size() || (!is9Var.v.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.u = true;
            int i = this.t + 1;
            this.t = i;
            is9 is9Var = is9.this;
            return i < is9Var.u.size() ? is9Var.u.get(this.t) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.u) {
                aa0.c("remove() was called before next()");
                return;
            }
            this.u = false;
            int i = is9.z;
            is9 is9Var = is9.this;
            is9Var.b();
            if (this.t >= is9Var.u.size()) {
                a().remove();
                return;
            }
            int i2 = this.t;
            this.t = i2 - 1;
            is9Var.h(i2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            is9.this.g((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            is9.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = is9.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            is9.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return is9.this.size();
        }
    }

    public is9(int i) {
        this.t = i;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.v = map;
        this.y = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(K k) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.u.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = k.compareTo(this.u.get(i3).t);
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = k.compareTo(this.u.get(i4).t);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = k.compareTo(this.u.get(i3).t);
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    public final void b() {
        if (this.w) {
            e44.b();
        }
    }

    public final Map.Entry<K, V> c(int i) {
        return this.u.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.u.isEmpty()) {
            this.u.clear();
        }
        if (this.v.isEmpty()) {
            return;
        }
        this.v.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.v.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.v.isEmpty() ? a.b : this.v.entrySet();
    }

    public final SortedMap<K, V> e() {
        b();
        if (this.v.isEmpty() && !(this.v instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.v = treeMap;
            this.y = treeMap.descendingMap();
        }
        return (SortedMap) this.v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.x == null) {
            this.x = new d();
        }
        return this.x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is9)) {
            return super.equals(obj);
        }
        is9 is9Var = (is9) obj;
        int size = size();
        if (size == is9Var.size()) {
            int size2 = this.u.size();
            if (size2 != is9Var.u.size()) {
                return ((AbstractSet) entrySet()).equals(is9Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(is9Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.v.equals(is9Var.v);
            }
            return true;
        }
        return false;
    }

    public void f() {
        if (this.w) {
            return;
        }
        this.v = this.v.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.v);
        this.y = this.y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.y);
        this.w = true;
    }

    public final V g(K k, V v) {
        b();
        int iA = a(k);
        if (iA >= 0) {
            return this.u.get(iA).setValue(v);
        }
        b();
        boolean zIsEmpty = this.u.isEmpty();
        int i = this.t;
        if (zIsEmpty && !(this.u instanceof ArrayList)) {
            this.u = new ArrayList(i);
        }
        int i2 = -(iA + 1);
        if (i2 >= i) {
            return e().put(k, v);
        }
        if (this.u.size() == i) {
            is9<K, V>.b bVarRemove = this.u.remove(i - 1);
            e().put(bVarRemove.t, bVarRemove.u);
        }
        this.u.add(i2, new b(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? this.u.get(iA).u : this.v.get(comparable);
    }

    public final V h(int i) {
        b();
        V v = this.u.remove(i).u;
        if (!this.v.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = e().entrySet().iterator();
            List<is9<K, V>.b> list = this.u;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.u.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += this.u.get(i).hashCode();
        }
        return this.v.size() > 0 ? this.v.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.v.isEmpty()) {
            return null;
        }
        return this.v.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.v.size() + this.u.size();
    }
}
