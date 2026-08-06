package defpackage;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class hs9<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int y = 0;
    public List<hs9<K, V>.a> t = Collections.EMPTY_LIST;
    public Map<K, V> u;
    public boolean v;
    public volatile hs9<K, V>.c w;
    public Map<K, V> x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Map.Entry<K, V>, Comparable<hs9<K, V>.a> {
        public final K t;
        public V u;

        public a() {
            throw null;
        }

        public a(K k, V v) {
            this.t = k;
            this.u = v;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.t.compareTo(((a) obj).t);
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
            int i = hs9.y;
            hs9.this.b();
            V v2 = this.u;
            this.u = v;
            return v2;
        }

        public final String toString() {
            return this.t + "=" + this.u;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements Iterator<Map.Entry<K, V>> {
        public int t = -1;
        public boolean u;
        public Iterator<Map.Entry<K, V>> v;

        public b() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.v == null) {
                this.v = hs9.this.u.entrySet().iterator();
            }
            return this.v;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.t + 1;
            hs9 hs9Var = hs9.this;
            return i < hs9Var.t.size() || (!hs9Var.u.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.u = true;
            int i = this.t + 1;
            this.t = i;
            hs9 hs9Var = hs9.this;
            return i < hs9Var.t.size() ? hs9Var.t.get(this.t) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.u) {
                aa0.c("remove() was called before next()");
                return;
            }
            this.u = false;
            int i = hs9.y;
            hs9 hs9Var = hs9.this;
            hs9Var.b();
            if (this.t >= hs9Var.t.size()) {
                a().remove();
                return;
            }
            int i2 = this.t;
            this.t = i2 - 1;
            hs9Var.h(i2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c extends AbstractSet<Map.Entry<K, V>> {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            hs9.this.g((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            hs9.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = hs9.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            hs9.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return hs9.this.size();
        }
    }

    public hs9() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.u = map;
        this.x = map;
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
        int size = this.t.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = k.compareTo(this.t.get(i3).t);
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
            int iCompareTo2 = k.compareTo(this.t.get(i4).t);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = k.compareTo(this.t.get(i3).t);
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
        if (this.v) {
            e44.b();
        }
    }

    public final Map.Entry<K, V> c(int i) {
        return this.t.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.t.isEmpty()) {
            this.t.clear();
        }
        if (this.u.isEmpty()) {
            return;
        }
        this.u.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.u.containsKey(comparable);
    }

    public final Set d() {
        return this.u.isEmpty() ? Collections.EMPTY_SET : this.u.entrySet();
    }

    public final SortedMap<K, V> e() {
        b();
        if (this.u.isEmpty() && !(this.u instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.u = treeMap;
            this.x = treeMap.descendingMap();
        }
        return (SortedMap) this.u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.w == null) {
            this.w = new c();
        }
        return this.w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs9)) {
            return super.equals(obj);
        }
        hs9 hs9Var = (hs9) obj;
        int size = size();
        if (size == hs9Var.size()) {
            int size2 = this.t.size();
            if (size2 != hs9Var.t.size()) {
                return ((AbstractSet) entrySet()).equals(hs9Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(hs9Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.u.equals(hs9Var.u);
            }
            return true;
        }
        return false;
    }

    public void f() {
        if (this.v) {
            return;
        }
        this.u = this.u.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.u);
        this.x = this.x.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.x);
        this.v = true;
    }

    public final V g(K k, V v) {
        b();
        int iA = a(k);
        if (iA >= 0) {
            return this.t.get(iA).setValue(v);
        }
        b();
        if (this.t.isEmpty() && !(this.t instanceof ArrayList)) {
            this.t = new ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return e().put(k, v);
        }
        if (this.t.size() == 16) {
            hs9<K, V>.a aVarRemove = this.t.remove(15);
            e().put(aVarRemove.t, aVarRemove.u);
        }
        this.t.add(i, new a(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? this.t.get(iA).u : this.u.get(comparable);
    }

    public final V h(int i) {
        b();
        V v = this.t.remove(i).u;
        if (!this.u.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = e().entrySet().iterator();
            List<hs9<K, V>.a> list = this.t;
            Map.Entry<K, V> next = it.next();
            list.add(new a(next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.t.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += this.t.get(i).hashCode();
        }
        return this.u.size() > 0 ? this.u.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.u.isEmpty()) {
            return null;
        }
        return this.u.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.u.size() + this.t.size();
    }
}
