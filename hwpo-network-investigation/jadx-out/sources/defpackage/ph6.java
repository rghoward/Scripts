package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ph6<K, V> implements Map.Entry<K, V>, zn5 {
    public final K t;
    public final V u;

    public ph6(K k, V v) {
        this.t = k;
        this.u = v;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && xj5.a(entry.getKey(), this.t) && xj5.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.t;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.u;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k = this.t;
        int iHashCode = k != null ? k.hashCode() : 0;
        V value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.t);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
