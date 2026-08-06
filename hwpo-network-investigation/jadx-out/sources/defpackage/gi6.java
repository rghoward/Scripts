package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gi6<K, V> implements Map<K, V>, zn5 {
    public final y39<K, V> t;
    public pj3<K, V> u;
    public jp5<K, V> v;
    public fbb<K, V> w;

    public gi6(y39<K, V> y39Var) {
        y39Var.getClass();
        this.t = y39Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.t.b(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.t.c(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        pj3<K, V> pj3Var = this.u;
        if (pj3Var != null) {
            return pj3Var;
        }
        pj3<K, V> pj3Var2 = new pj3<>(this.t);
        this.u = pj3Var2;
        return pj3Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gi6.class != obj.getClass()) {
            return false;
        }
        return xj5.a(this.t, ((gi6) obj).t);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.t.d(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.t.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.t.e();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        jp5<K, V> jp5Var = this.v;
        if (jp5Var != null) {
            return jp5Var;
        }
        jp5<K, V> jp5Var2 = new jp5<>(this.t);
        this.v = jp5Var2;
        return jp5Var2;
    }

    @Override // java.util.Map
    public final V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V replace(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.t.e;
    }

    public final String toString() {
        return this.t.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        fbb<K, V> fbbVar = this.w;
        if (fbbVar != null) {
            return fbbVar;
        }
        fbb<K, V> fbbVar2 = new fbb<>(this.t);
        this.w = fbbVar2;
        return fbbVar2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
