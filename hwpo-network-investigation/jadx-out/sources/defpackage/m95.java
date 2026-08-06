package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m95<K, V> implements Map<K, V>, Serializable {
    public transient q95<Map.Entry<K, V>> t;
    public transient q95<K> u;
    public transient b95<V> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<K, V> {
        public Object[] a;
        public int b = 0;
        public C0201a c;

        /* JADX INFO: renamed from: m95$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0201a {
            public final Object a;
            public final Object b;
            public final Object c;

            public C0201a(Object obj, Object obj2, Object obj3) {
                this.a = obj;
                this.b = obj2;
                this.c = obj3;
            }

            public final IllegalArgumentException a() {
                StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
                Object obj = this.a;
                sb.append(obj);
                sb.append("=");
                sb.append(this.b);
                sb.append(" and ");
                sb.append(obj);
                sb.append("=");
                sb.append(this.c);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public a(int i) {
            this.a = new Object[i * 2];
        }

        public final vl8 a(boolean z) {
            C0201a c0201a;
            C0201a c0201a2;
            if (z && (c0201a2 = this.c) != null) {
                throw c0201a2.a();
            }
            vl8 vl8VarF = vl8.f(this.b, this.a, this);
            if (!z || (c0201a = this.c) == null) {
                return vl8VarF;
            }
            throw c0201a.a();
        }

        public final void b(Object obj, Object obj2) {
            int i = (this.b + 1) * 2;
            Object[] objArr = this.a;
            if (i > objArr.length) {
                this.a = Arrays.copyOf(objArr, b95.b.b(objArr.length, i));
            }
            if (obj == null) {
                throw new NullPointerException("null key in entry: null=" + obj2);
            }
            if (obj2 == null) {
                throw new NullPointerException("null value in entry: " + obj + "=null");
            }
            Object[] objArr2 = this.a;
            int i2 = this.b;
            int i3 = i2 * 2;
            objArr2[i3] = obj;
            objArr2[i3 + 1] = obj2;
            this.b = i2 + 1;
        }

        public final void c(Set set) {
            if (set instanceof Collection) {
                int size = (set.size() + this.b) * 2;
                Object[] objArr = this.a;
                if (size > objArr.length) {
                    this.a = Arrays.copyOf(objArr, b95.b.b(objArr.length, size));
                }
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                b(entry.getKey(), entry.getValue());
            }
        }
    }

    public static <K, V> a<K, V> a() {
        return new a<>(4);
    }

    public static <K, V> m95<K, V> b(Map<? extends K, ? extends V> map) {
        if ((map instanceof m95) && !(map instanceof SortedMap)) {
            return (m95) map;
        }
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        a aVar = new a(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        aVar.c(setEntrySet);
        return aVar.a(true);
    }

    public abstract vl8.a c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        vl8.c cVarE = this.v;
        if (cVarE == null) {
            cVarE = e();
            this.v = cVarE;
        }
        return cVarE.contains(obj);
    }

    public abstract vl8.b d();

    public abstract vl8.c e();

    @Override // java.util.Map
    public final Set entrySet() {
        q95<Map.Entry<K, V>> q95Var = this.t;
        if (q95Var != null) {
            return q95Var;
        }
        vl8.a aVarC = c();
        this.t = aVarC;
        return aVarC;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return oi6.a(obj, this);
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public final int hashCode() {
        vl8.a aVarC = this.t;
        if (aVarC == null) {
            aVarC = c();
            this.t = aVarC;
        }
        return lk9.c(aVarC);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        q95<K> q95Var = this.u;
        if (q95Var != null) {
            return q95Var;
        }
        vl8.b bVarD = d();
        this.u = bVarD;
        return bVarD;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zg1.b(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        b95<V> b95Var = this.v;
        if (b95Var != null) {
            return b95Var;
        }
        vl8.c cVarE = e();
        this.v = cVarE;
        return cVarE;
    }
}
