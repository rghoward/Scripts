package io.ably.lib.types;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface ReadOnlyMap<K, V> {
    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    Iterable<Map.Entry<K, V>> entrySet();

    V get(Object obj);

    boolean isEmpty();

    Iterable<K> keySet();

    int size();

    Iterable<V> values();
}
