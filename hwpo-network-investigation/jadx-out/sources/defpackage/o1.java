package defpackage;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o1<K, V> extends v1<K, V> {
    public o1(Map<K, Collection<V>> map) {
        xl7.g(map.isEmpty());
        this.w = map;
    }
}
