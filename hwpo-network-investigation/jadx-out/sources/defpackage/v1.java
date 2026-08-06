package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v1<K, V> extends b2<K, V> implements Serializable {
    public transient Map<K, Collection<V>> w;
    public transient int x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends oi6.d<K, Collection<V>> {
        public final transient Map<K, Collection<V>> v;

        /* JADX INFO: renamed from: v1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class C0271a extends oi6.a<K, Collection<V>> {
            public C0271a() {
            }

            @Override // oi6.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> setEntrySet = a.this.v.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            @Override // oi6.a
            public final Map<K, Collection<V>> d() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return a.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean remove(Object obj) {
                Collection<V> collectionRemove;
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                v1 v1Var = v1.this;
                Object key = entry.getKey();
                Map<K, Collection<V>> map = v1Var.w;
                map.getClass();
                try {
                    collectionRemove = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    collectionRemove = null;
                }
                Collection<V> collection = collectionRemove;
                if (collection == null) {
                    return true;
                }
                int size = collection.size();
                collection.clear();
                v1Var.x -= size;
                return true;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {
            public final Iterator<Map.Entry<K, Collection<V>>> t;
            public Collection<V> u;

            public b() {
                this.t = a.this.v.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.t.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                Map.Entry<K, Collection<V>> next = this.t.next();
                this.u = next.getValue();
                return a.this.a(next);
            }

            @Override // java.util.Iterator
            public final void remove() {
                xl7.q("no calls to next() since the last call to remove()", this.u != null);
                this.t.remove();
                v1.this.x -= this.u.size();
                this.u.clear();
                this.u = null;
            }
        }

        public a(Map<K, Collection<V>> map) {
            this.v = map;
        }

        public final d95 a(Map.Entry entry) {
            Object key = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            o1 o1Var = (o1) v1.this;
            List list = (List) collection;
            return new d95(key, list instanceof RandomAccess ? new f(key, list, null) : new j(key, list, null));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            v1 v1Var = v1.this;
            if (this.v == v1Var.w) {
                v1Var.d();
                return;
            }
            b bVar = new b();
            while (bVar.hasNext()) {
                bVar.next();
                bVar.remove();
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.v;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean equals(Object obj) {
            return this == obj || this.v.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.v;
            map.getClass();
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection<V> collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            o1 o1Var = (o1) v1.this;
            List list = (List) collection2;
            return list instanceof RandomAccess ? new f(obj, list, null) : new j(obj, list, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int hashCode() {
            return this.v.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            v1 v1Var = v1.this;
            Set<K> set = v1Var.t;
            if (set != null) {
                return set;
            }
            Set<K> setC = v1Var.c();
            v1Var.t = setC;
            return setC;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            Collection<V> collectionRemove = this.v.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            v1 v1Var = v1.this;
            Collection<V> collectionE = v1Var.e();
            collectionE.addAll(collectionRemove);
            v1Var.x -= collectionRemove.size();
            collectionRemove.clear();
            return collectionE;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return this.v.size();
        }

        @Override // java.util.AbstractMap
        public final String toString() {
            return this.v.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public abstract class b<T> implements Iterator<T> {
        public final Iterator<Map.Entry<K, Collection<V>>> t;
        public K u = null;
        public Collection<V> v = null;
        public Iterator<V> w = sk5.a.t;

        public b() {
            this.t = v1.this.w.entrySet().iterator();
        }

        public abstract T a(K k, V v);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.t.hasNext() || this.w.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.w.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.t.next();
                this.u = next.getKey();
                Collection<V> value = next.getValue();
                this.v = value;
                this.w = value.iterator();
            }
            return this.w.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.w.remove();
            Collection<V> collection = this.v;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.t.remove();
            }
            v1.this.x--;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c extends oi6.b<K, Collection<V>> {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Iterator<K> {
            public Map.Entry<K, Collection<V>> t;
            public final /* synthetic */ Iterator u;
            public final /* synthetic */ c v;

            public a(c cVar, Iterator it) {
                this.u = it;
                this.v = cVar;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.u.hasNext();
            }

            @Override // java.util.Iterator
            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.u.next();
                this.t = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public final void remove() {
                xl7.q("no calls to next() since the last call to remove()", this.t != null);
                Collection<V> value = this.t.getValue();
                this.u.remove();
                v1.this.x -= value.size();
                value.clear();
                this.t = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Iterator<K> it = iterator();
            while (true) {
                a aVar = (a) it;
                if (!aVar.hasNext()) {
                    return;
                }
                aVar.next();
                aVar.remove();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return this.t.keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return this == obj || this.t.keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return this.t.keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this, this.t.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) this.t.remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                v1.this.x -= size;
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class f extends v1<K, V>.j implements RandomAccess {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class g extends v1<K, V>.a implements SortedMap<K, Collection<V>> {
        public SortedSet<K> x;
        public final /* synthetic */ l17 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(l17 l17Var, SortedMap sortedMap) {
            super(sortedMap);
            this.y = l17Var;
        }

        public SortedSet<K> b() {
            return new h(this.y, d());
        }

        @Override // v1.a, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.x;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetB = b();
            this.x = sortedSetB;
            return sortedSetB;
        }

        @Override // java.util.SortedMap
        public final Comparator<? super K> comparator() {
            return d().comparator();
        }

        public SortedMap<K, Collection<V>> d() {
            return (SortedMap) this.v;
        }

        @Override // java.util.SortedMap
        public final K firstKey() {
            return d().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new g(this.y, d().headMap(k));
        }

        @Override // java.util.SortedMap
        public final K lastKey() {
            return d().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new g(this.y, d().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new g(this.y, d().tailMap(k));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class h extends v1<K, V>.c implements SortedSet<K> {
        public final /* synthetic */ l17 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(l17 l17Var, SortedMap sortedMap) {
            super(sortedMap);
            this.v = l17Var;
        }

        @Override // java.util.SortedSet
        public final Comparator<? super K> comparator() {
            return d().comparator();
        }

        public SortedMap<K, Collection<V>> d() {
            return (SortedMap) this.t;
        }

        @Override // java.util.SortedSet
        public final K first() {
            return d().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new h(this.v, d().headMap(k));
        }

        @Override // java.util.SortedSet
        public final K last() {
            return d().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new h(this.v, d().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new h(this.v, d().tailMap(k));
        }
    }

    public final void d() {
        Map<K, Collection<V>> map = this.w;
        Iterator<Collection<V>> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        map.clear();
        this.x = 0;
    }

    public abstract Collection<V> e();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class j extends v1<K, V>.i implements List<V> {
        public j(K k, List<V> list, v1<K, V>.i iVar) {
            super(k, list, iVar);
        }

        @Override // java.util.List
        public final void add(int i, V v) {
            e();
            boolean zIsEmpty = this.u.isEmpty();
            ((List) this.u).add(i, v);
            v1.this.x++;
            if (zIsEmpty) {
                d();
            }
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = ((List) this.u).addAll(i, collection);
            if (zAddAll) {
                v1.this.x += this.u.size() - size;
                if (size == 0) {
                    d();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public final V get(int i) {
            e();
            return (V) ((List) this.u).get(i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            e();
            return ((List) this.u).indexOf(obj);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            e();
            return ((List) this.u).lastIndexOf(obj);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator() {
            e();
            return new a();
        }

        @Override // java.util.List
        public final V remove(int i) {
            e();
            V v = (V) ((List) this.u).remove(i);
            v1.this.x--;
            f();
            return v;
        }

        @Override // java.util.List
        public final V set(int i, V v) {
            e();
            return (V) ((List) this.u).set(i, v);
        }

        @Override // java.util.List
        public final List<V> subList(int i, int i2) {
            e();
            List listSubList = ((List) this.u).subList(i, i2);
            v1<K, V>.i iVar = this.v;
            if (iVar == null) {
                iVar = this;
            }
            boolean z = listSubList instanceof RandomAccess;
            v1 v1Var = v1.this;
            K k = this.t;
            return z ? new f(k, listSubList, iVar) : new j(k, listSubList, iVar);
        }

        @Override // java.util.List
        public final ListIterator<V> listIterator(int i) {
            e();
            return new a(i);
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a extends v1<K, V>.i.a implements ListIterator<V> {
            public a(int i) {
                super(j.this, ((List) j.this.u).listIterator(i));
            }

            @Override // java.util.ListIterator
            public final void add(V v) {
                j jVar = j.this;
                boolean zIsEmpty = jVar.isEmpty();
                b().add(v);
                v1.this.x++;
                if (zIsEmpty) {
                    jVar.d();
                }
            }

            public final ListIterator<V> b() {
                a();
                return (ListIterator) this.t;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return b().nextIndex();
            }

            @Override // java.util.ListIterator
            public final V previous() {
                return b().previous();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return b().previousIndex();
            }

            @Override // java.util.ListIterator
            public final void set(V v) {
                b().set(v);
            }

            public a() {
                super();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class d extends v1<K, V>.g implements NavigableMap<K, Collection<V>> {
        public final /* synthetic */ l17 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l17 l17Var, NavigableMap navigableMap) {
            super(l17Var, navigableMap);
            this.z = l17Var;
        }

        @Override // v1.g
        public final SortedSet b() {
            return new e(this.z, d());
        }

        @Override // v1.g
        /* JADX INFO: renamed from: c */
        public final SortedSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = d().ceilingEntry(k);
            if (entryCeilingEntry == null) {
                return null;
            }
            return a(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public final K ceilingKey(K k) {
            return d().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> descendingKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new d(this.z, d().descendingMap());
        }

        public final d95 e(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection collectionE = this.z.e();
            collectionE.addAll((Collection) entry.getValue());
            it.remove();
            return new d95(entry.getKey(), Collections.unmodifiableList((List) collectionE));
        }

        @Override // v1.g
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> d() {
            return (NavigableMap) ((SortedMap) this.v);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = d().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return a(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> entryFloorEntry = d().floorEntry(k);
            if (entryFloorEntry == null) {
                return null;
            }
            return a(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public final K floorKey(K k) {
            return d().floorKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new d(this.z, d().headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> entryHigherEntry = d().higherEntry(k);
            if (entryHigherEntry == null) {
                return null;
            }
            return a(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public final K higherKey(K k) {
            return d().higherKey(k);
        }

        @Override // v1.g, v1.a, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = d().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return a(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> entryLowerEntry = d().lowerEntry(k);
            if (entryLowerEntry == null) {
                return null;
            }
            return a(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public final K lowerKey(K k) {
            return d().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollFirstEntry() {
            return e(((a.C0271a) entrySet()).iterator());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, Collection<V>> pollLastEntry() {
            return e(((a.C0271a) ((oi6.d) descendingMap()).entrySet()).iterator());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new d(this.z, d().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new d(this.z, d().tailMap(k, z));
        }

        @Override // v1.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // v1.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // v1.g, java.util.SortedMap, java.util.NavigableMap
        public final SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class e extends v1<K, V>.h implements NavigableSet<K> {
        public final /* synthetic */ l17 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l17 l17Var, NavigableMap navigableMap) {
            super(l17Var, navigableMap);
            this.w = l17Var;
        }

        @Override // java.util.NavigableSet
        public final K ceiling(K k) {
            return d().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public final Iterator<K> descendingIterator() {
            return ((c) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> descendingSet() {
            return new e(this.w, d().descendingMap());
        }

        @Override // v1.h
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final NavigableMap<K, Collection<V>> d() {
            return (NavigableMap) ((SortedMap) this.t);
        }

        @Override // java.util.NavigableSet
        public final K floor(K k) {
            return d().floorKey(k);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> headSet(K k, boolean z) {
            return new e(this.w, d().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public final K higher(K k) {
            return d().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public final K lower(K k) {
            return d().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public final K pollFirst() {
            c.a aVar = (c.a) iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K k = (K) aVar.next();
            aVar.remove();
            return k;
        }

        @Override // java.util.NavigableSet
        public final K pollLast() {
            Iterator<K> itDescendingIterator = descendingIterator();
            if (!itDescendingIterator.hasNext()) {
                return null;
            }
            K next = itDescendingIterator.next();
            itDescendingIterator.remove();
            return next;
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new e(this.w, d().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet<K> tailSet(K k, boolean z) {
            return new e(this.w, d().tailMap(k, z));
        }

        @Override // v1.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // v1.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // v1.h, java.util.SortedSet, java.util.NavigableSet
        public final SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class i extends AbstractCollection<V> {
        public final K t;
        public Collection<V> u;
        public final v1<K, V>.i v;
        public final Collection<V> w;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Object obj, List list, i iVar) {
            this.t = obj;
            this.u = list;
            this.v = iVar;
            this.w = iVar == null ? null : iVar.u;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(V v) {
            e();
            boolean zIsEmpty = this.u.isEmpty();
            boolean zAdd = this.u.add(v);
            if (zAdd) {
                v1.this.x++;
                if (zIsEmpty) {
                    d();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.u.addAll(collection);
            if (zAddAll) {
                v1.this.x += this.u.size() - size;
                if (size == 0) {
                    d();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.u.clear();
            v1.this.x -= size;
            f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            e();
            return this.u.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            e();
            return this.u.containsAll(collection);
        }

        public final void d() {
            v1<K, V>.i iVar = this.v;
            if (iVar != null) {
                iVar.d();
            } else {
                v1.this.w.put(this.t, this.u);
            }
        }

        public final void e() {
            Collection<V> collection;
            v1<K, V>.i iVar = this.v;
            if (iVar != null) {
                iVar.e();
                if (iVar.u == this.w) {
                    return;
                }
                yk.b();
                return;
            }
            if (!this.u.isEmpty() || (collection = v1.this.w.get(this.t)) == null) {
                return;
            }
            this.u = collection;
        }

        @Override // java.util.Collection
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            e();
            return this.u.equals(obj);
        }

        public final void f() {
            v1<K, V>.i iVar = this.v;
            if (iVar != null) {
                iVar.f();
            } else if (this.u.isEmpty()) {
                v1.this.w.remove(this.t);
            }
        }

        @Override // java.util.Collection
        public final int hashCode() {
            e();
            return this.u.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            e();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            e();
            boolean zRemove = this.u.remove(obj);
            if (zRemove) {
                v1.this.x--;
                f();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.u.removeAll(collection);
            if (zRemoveAll) {
                v1.this.x += this.u.size() - size;
                f();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean zRetainAll = this.u.retainAll(collection);
            if (zRetainAll) {
                v1.this.x += this.u.size() - size;
                f();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            e();
            return this.u.size();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            e();
            return this.u.toString();
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements Iterator<V> {
            public final Iterator<V> t;
            public final Collection<V> u;

            public a() {
                Collection<V> collection = i.this.u;
                this.u = collection;
                this.t = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            public final void a() {
                i iVar = i.this;
                iVar.e();
                if (iVar.u == this.u) {
                    return;
                }
                yk.b();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                a();
                return this.t.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                a();
                return this.t.next();
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.t.remove();
                i iVar = i.this;
                v1.this.x--;
                iVar.f();
            }

            public a(j jVar, ListIterator listIterator) {
                i.this = jVar;
                this.u = jVar.u;
                this.t = listIterator;
            }
        }
    }
}
