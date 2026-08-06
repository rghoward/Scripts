package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qd4<K, V> extends ln4 implements Map<K, V> {
    @Override // java.util.Map
    public final void clear() {
        ((qr2.b) this).x.clear();
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return (Set<Map.Entry<K, V>>) ((qr2.b) this).x.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return ((qr2.b) this).x.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return (Set<K>) ((qr2.b) this).x.keySet();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        return (V) ((qr2.b) this).x.put(k, v);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        ((qr2.b) this).x.putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return (V) ((qr2.b) this).x.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return ((qr2.b) this).x.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return (Collection<V>) ((qr2.b) this).x.values();
    }
}
