package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rt3<K, V> extends pz8<K, V> {
    public final HashMap<K, pz8.c<K, V>> x = new HashMap<>();

    @Override // defpackage.pz8
    public final pz8.c<K, V> d(K k) {
        return this.x.get(k);
    }

    @Override // defpackage.pz8
    public final V e(K k) {
        V v = (V) super.e(k);
        this.x.remove(k);
        return v;
    }
}
