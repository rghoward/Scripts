package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qh6<K, V> implements Map.Entry<K, V>, zn5 {
    public final K t;
    public final V u;

    public qh6(K k, V v) {
        this.t = k;
        this.u = v;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.t;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.u;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
