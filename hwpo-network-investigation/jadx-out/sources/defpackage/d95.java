package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d95<K, V> extends y1<K, V> implements Serializable {
    public final K t;
    public final V u;

    public d95(K k, V v) {
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
        throw new UnsupportedOperationException();
    }
}
